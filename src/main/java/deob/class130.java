package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dt")
public final class class130 implements Runnable {

    @ObfuscatedName("dt.g")
    public InputStream field2056;

    @ObfuscatedName("dt.s")
    public OutputStream field2054;

    @ObfuscatedName("dt.v")
    public Socket field2060;

    @ObfuscatedName("dt.o")
    public boolean field2053 = false;

    @ObfuscatedName("dt.k")
    public class123 field2050;

    @ObfuscatedName("dt.m")
    public class133 field2055;

    @ObfuscatedName("dt.i")
    public byte[] field2051;

    @ObfuscatedName("dt.t")
    public int field2057 = 0;

    @ObfuscatedName("dt.l")
    public int field2064 = 0;

    @ObfuscatedName("dt.p")
    public boolean field2059 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2050 = arg1;
        this.field2060 = arg0;
        this.field2060.setSoTimeout(30000);
        this.field2060.setTcpNoDelay(true);
        this.field2056 = this.field2060.getInputStream();
        this.field2054 = this.field2060.getOutputStream();
    }

    @ObfuscatedName("dt.v(I)V")
    public void method2524() {
        if (this.field2053) {
            return;
        }
        synchronized (this) {
            this.field2053 = true;
            this.notifyAll();
        }
        if (this.field2055 != null) {
            while (this.field2055.field2089 == 0) {
                class114.method26(1L);
            }
            if (this.field2055.field2089 == 1) {
                try {
                    ((Thread) this.field2055.field2086).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2055 = null;
    }

    public void finalize() {
        this.method2524();
    }

    @ObfuscatedName("dt.o(I)I")
    public int method2506() throws IOException {
        return this.field2053 ? 0 : this.field2056.read();
    }

    @ObfuscatedName("dt.k(B)I")
    public int method2530() throws IOException {
        return this.field2053 ? 0 : this.field2056.available();
    }

    @ObfuscatedName("dt.m([BIII)V")
    public void method2505(byte[] arg0, int arg1, int arg2) throws IOException {
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

    @ObfuscatedName("dt.i([BIIB)V")
    public void method2509(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2053) {
            return;
        }
        if (this.field2059) {
            this.field2059 = false;
            throw new IOException();
        }
        if (this.field2051 == null) {
            this.field2051 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2051[this.field2064] = arg0[arg1 + var5];
                this.field2064 = (this.field2064 + 1) % 5000;
                if ((this.field2057 + 4900) % 5000 == this.field2064) {
                    throw new IOException();
                }
            }
            if (this.field2055 == null) {
                this.field2055 = this.field2050.method2418(this, 3);
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
                        if (this.field2064 == this.field2057) {
                            if (this.field2053) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2057;
                        if (this.field2064 >= this.field2057) {
                            var4 = this.field2064 - this.field2057;
                        } else {
                            var4 = 5000 - this.field2057;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2054.write(this.field2051, var3, var4);
                    } catch (IOException var12) {
                        this.field2059 = true;
                    }
                    this.field2057 = (this.field2057 + var4) % 5000;
                    try {
                        if (this.field2064 == this.field2057) {
                            this.field2054.flush();
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
                    if (this.field2054 != null) {
                        this.field2054.close();
                    }
                    if (this.field2060 != null) {
                        this.field2060.close();
                    }
                } catch (IOException var10) {
                }
                this.field2051 = null;
                break;
            }
        } catch (Exception var15) {
            class135.method1813((String) null, var15);
        }
    }
}
