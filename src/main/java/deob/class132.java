package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("eh")
public final class class132 implements Runnable {

    @ObfuscatedName("eh.f")
    public InputStream field2056;

    @ObfuscatedName("eh.k")
    public OutputStream field2051;

    @ObfuscatedName("eh.y")
    public Socket field2067;

    @ObfuscatedName("eh.e")
    public boolean field2053 = false;

    @ObfuscatedName("eh.r")
    public class125 field2055;

    @ObfuscatedName("eh.a")
    public class135 field2050;

    @ObfuscatedName("eh.n")
    public byte[] field2061;

    @ObfuscatedName("eh.x")
    public int field2057 = 0;

    @ObfuscatedName("eh.g")
    public int field2058 = 0;

    @ObfuscatedName("eh.o")
    public boolean field2059 = false;

    public class132(Socket arg0, class125 arg1) throws IOException {
        this.field2055 = arg1;
        this.field2067 = arg0;
        this.field2067.setSoTimeout(30000);
        this.field2067.setTcpNoDelay(true);
        this.field2056 = this.field2067.getInputStream();
        this.field2051 = this.field2067.getOutputStream();
    }

    @ObfuscatedName("eh.e(B)V")
    public void method2609() {
        if (this.field2053) {
            return;
        }
        synchronized (this) {
            this.field2053 = true;
            this.notifyAll();
        }
        if (this.field2050 != null) {
            while (this.field2050.field2093 == 0) {
                class116.method557(1L);
            }
            if (this.field2050.field2093 == 1) {
                try {
                    ((Thread) this.field2050.field2092).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2050 = null;
    }

    public void finalize() {
        this.method2609();
    }

    @ObfuscatedName("eh.r(B)I")
    public int method2608() throws IOException {
        return this.field2053 ? 0 : this.field2056.read();
    }

    @ObfuscatedName("eh.a(B)I")
    public int method2611() throws IOException {
        return this.field2053 ? 0 : this.field2056.available();
    }

    @ObfuscatedName("eh.n([BIIS)V")
    public void method2612(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2053) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2056.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("eh.x([BIII)V")
    public void method2634(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2053) {
            return;
        }
        if (this.field2059) {
            this.field2059 = false;
            throw new IOException();
        }
        if (this.field2061 == null) {
            this.field2061 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2061[this.field2058] = arg0[arg1 + var5];
                this.field2058 = (this.field2058 + 1) % 5000;
                if ((this.field2057 + 4900) % 5000 == this.field2058) {
                    throw new IOException();
                }
            }
            if (this.field2050 == null) {
                this.field2050 = this.field2055.method2526(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2058 == this.field2057) {
                            if (this.field2053) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2057;
                        if (this.field2058 >= this.field2057) {
                            var4 = this.field2058 - this.field2057;
                        } else {
                            var4 = 5000 - this.field2057;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2051.write(this.field2061, var3, var4);
                    } catch (IOException var12) {
                        this.field2059 = true;
                    }
                    this.field2057 = (this.field2057 + var4) % 5000;
                    try {
                        if (this.field2058 == this.field2057) {
                            this.field2051.flush();
                        }
                    } catch (IOException var11) {
                        this.field2059 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2056 != null) {
                        this.field2056.close();
                    }
                    if (this.field2051 != null) {
                        this.field2051.close();
                    }
                    if (this.field2067 != null) {
                        this.field2067.close();
                    }
                } catch (IOException var10) {
                }
                this.field2061 = null;
                break;
            }
        } catch (Exception var15) {
            class137.method94((String) null, var15);
        }
    }
}
