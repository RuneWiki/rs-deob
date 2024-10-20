package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("df")
public final class class130 implements Runnable {

    @ObfuscatedName("df.t")
    public InputStream field2033;

    @ObfuscatedName("df.s")
    public OutputStream field2027;

    @ObfuscatedName("df.f")
    public Socket field2028;

    @ObfuscatedName("df.e")
    public boolean field2029 = false;

    @ObfuscatedName("df.d")
    public class123 field2030;

    @ObfuscatedName("df.n")
    public class133 field2031;

    @ObfuscatedName("df.v")
    public byte[] field2040;

    @ObfuscatedName("df.z")
    public int field2035 = 0;

    @ObfuscatedName("df.j")
    public int field2032 = 0;

    @ObfuscatedName("df.u")
    public boolean field2034 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2030 = arg1;
        this.field2028 = arg0;
        this.field2028.setSoTimeout(30000);
        this.field2028.setTcpNoDelay(true);
        this.field2033 = this.field2028.getInputStream();
        this.field2027 = this.field2028.getOutputStream();
    }

    @ObfuscatedName("df.s(I)V")
    public void method2583() {
        if (this.field2029) {
            return;
        }
        synchronized (this) {
            this.field2029 = true;
            this.notifyAll();
        }
        if (this.field2031 != null) {
            while (this.field2031.field2061 == 0) {
                class114.method2031(1L);
            }
            if (this.field2031.field2061 == 1) {
                try {
                    ((Thread) this.field2031.field2065).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2031 = null;
    }

    public void finalize() {
        this.method2583();
    }

    @ObfuscatedName("df.f(I)I")
    public int method2587() throws IOException {
        return this.field2029 ? 0 : this.field2033.read();
    }

    @ObfuscatedName("df.e(I)I")
    public int method2582() throws IOException {
        return this.field2029 ? 0 : this.field2033.available();
    }

    @ObfuscatedName("df.d([BIIB)V")
    public void method2586(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2029) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2033.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("df.n([BIII)V")
    public void method2585(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2029) {
            return;
        }
        if (this.field2034) {
            this.field2034 = false;
            throw new IOException();
        }
        if (this.field2040 == null) {
            this.field2040 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2040[this.field2032] = arg0[arg1 + var5];
                this.field2032 = (this.field2032 + 1) % 5000;
                if ((this.field2035 + 4900) % 5000 == this.field2032) {
                    throw new IOException();
                }
            }
            if (this.field2031 == null) {
                this.field2031 = this.field2030.method2468(this, 3);
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
                        if (this.field2035 == this.field2032) {
                            if (this.field2029) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2035;
                        if (this.field2032 >= this.field2035) {
                            var4 = this.field2032 - this.field2035;
                        } else {
                            var4 = 5000 - this.field2035;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2027.write(this.field2040, var3, var4);
                    } catch (IOException var12) {
                        this.field2034 = true;
                    }
                    this.field2035 = (this.field2035 + var4) % 5000;
                    try {
                        if (this.field2035 == this.field2032) {
                            this.field2027.flush();
                        }
                    } catch (IOException var11) {
                        this.field2034 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2033 != null) {
                        this.field2033.close();
                    }
                    if (this.field2027 != null) {
                        this.field2027.close();
                    }
                    if (this.field2028 != null) {
                        this.field2028.close();
                    }
                } catch (IOException var10) {
                }
                this.field2040 = null;
                break;
            }
        } catch (Exception var15) {
            Statics.method96((String) null, var15);
        }
    }
}
