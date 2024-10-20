package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dh")
public final class class130 implements Runnable {

    @ObfuscatedName("dh.e")
    public InputStream field2035;

    @ObfuscatedName("dh.p")
    public OutputStream field2039;

    @ObfuscatedName("dh.a")
    public Socket field2037;

    @ObfuscatedName("dh.g")
    public boolean field2038 = false;

    @ObfuscatedName("dh.u")
    public class123 field2040;

    @ObfuscatedName("dh.k")
    public class133 field2048;

    @ObfuscatedName("dh.m")
    public byte[] field2041;

    @ObfuscatedName("dh.t")
    public int field2042 = 0;

    @ObfuscatedName("dh.l")
    public int field2043 = 0;

    @ObfuscatedName("dh.f")
    public boolean field2044 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2040 = arg1;
        this.field2037 = arg0;
        this.field2037.setSoTimeout(30000);
        this.field2037.setTcpNoDelay(true);
        this.field2035 = this.field2037.getInputStream();
        this.field2039 = this.field2037.getOutputStream();
    }

    @ObfuscatedName("dh.a(I)V")
    public void method2577() {
        if (this.field2038) {
            return;
        }
        synchronized (this) {
            this.field2038 = true;
            this.notifyAll();
        }
        if (this.field2048 != null) {
            while (this.field2048.field2071 == 0) {
                class114.method658(1L);
            }
            if (this.field2048.field2071 == 1) {
                try {
                    ((Thread) this.field2048.field2067).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2048 = null;
    }

    public void finalize() {
        this.method2577();
    }

    @ObfuscatedName("dh.g(I)I")
    public int method2594() throws IOException {
        return this.field2038 ? 0 : this.field2035.read();
    }

    @ObfuscatedName("dh.u(I)I")
    public int method2578() throws IOException {
        return this.field2038 ? 0 : this.field2035.available();
    }

    @ObfuscatedName("dh.k([BIIB)V")
    public void method2579(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2038) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2035.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("dh.m([BIIB)V")
    public void method2576(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2038) {
            return;
        }
        if (this.field2044) {
            this.field2044 = false;
            throw new IOException();
        }
        if (this.field2041 == null) {
            this.field2041 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2041[this.field2043] = arg0[arg1 + var5];
                this.field2043 = (this.field2043 + 1) % 5000;
                if ((this.field2042 + 4900) % 5000 == this.field2043) {
                    throw new IOException();
                }
            }
            if (this.field2048 == null) {
                this.field2048 = this.field2040.method2480(this, 3);
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
                        if (this.field2043 == this.field2042) {
                            if (this.field2038) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2042;
                        if (this.field2043 >= this.field2042) {
                            var4 = this.field2043 - this.field2042;
                        } else {
                            var4 = 5000 - this.field2042;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2039.write(this.field2041, var3, var4);
                    } catch (IOException var12) {
                        this.field2044 = true;
                    }
                    this.field2042 = (this.field2042 + var4) % 5000;
                    try {
                        if (this.field2043 == this.field2042) {
                            this.field2039.flush();
                        }
                    } catch (IOException var11) {
                        this.field2044 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2035 != null) {
                        this.field2035.close();
                    }
                    if (this.field2039 != null) {
                        this.field2039.close();
                    }
                    if (this.field2037 != null) {
                        this.field2037.close();
                    }
                } catch (IOException var10) {
                }
                this.field2041 = null;
                break;
            }
        } catch (Exception var15) {
            class135.method95((String) null, var15);
        }
    }
}
