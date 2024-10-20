package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dj")
public final class class130 implements Runnable {

    @ObfuscatedName("dj.y")
    public InputStream field2045;

    @ObfuscatedName("dj.u")
    public OutputStream field2039;

    @ObfuscatedName("dj.k")
    public Socket field2040;

    @ObfuscatedName("dj.v")
    public boolean field2041 = false;

    @ObfuscatedName("dj.l")
    public class123 field2042;

    @ObfuscatedName("dj.g")
    public class133 field2043;

    @ObfuscatedName("dj.a")
    public byte[] field2038;

    @ObfuscatedName("dj.x")
    public int field2044 = 0;

    @ObfuscatedName("dj.r")
    public int field2046 = 0;

    @ObfuscatedName("dj.w")
    public boolean field2047 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2042 = arg1;
        this.field2040 = arg0;
        this.field2040.setSoTimeout(30000);
        this.field2040.setTcpNoDelay(true);
        this.field2045 = this.field2040.getInputStream();
        this.field2039 = this.field2040.getOutputStream();
    }

    @ObfuscatedName("dj.k(I)V")
    public void method2562() {
        if (this.field2041) {
            return;
        }
        synchronized (this) {
            this.field2041 = true;
            this.notifyAll();
        }
        if (this.field2043 != null) {
            while (this.field2043.field2070 == 0) {
                class114.method140(1L);
            }
            if (this.field2043.field2070 == 1) {
                try {
                    ((Thread) this.field2043.field2066).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2043 = null;
    }

    public void finalize() {
        this.method2562();
    }

    @ObfuscatedName("dj.v(B)I")
    public int method2563() throws IOException {
        return this.field2041 ? 0 : this.field2045.read();
    }

    @ObfuscatedName("dj.l(B)I")
    public int method2564() throws IOException {
        return this.field2041 ? 0 : this.field2045.available();
    }

    @ObfuscatedName("dj.g([BIIB)V")
    public void method2565(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2041) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2045.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("dj.a([BIII)V")
    public void method2566(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2041) {
            return;
        }
        if (this.field2047) {
            this.field2047 = false;
            throw new IOException();
        }
        if (this.field2038 == null) {
            this.field2038 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2038[this.field2046] = arg0[arg1 + var5];
                this.field2046 = (this.field2046 + 1) % 5000;
                if ((this.field2044 + 4900) % 5000 == this.field2046) {
                    throw new IOException();
                }
            }
            if (this.field2043 == null) {
                this.field2043 = this.field2042.method2465(this, 3);
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
                        if (this.field2046 == this.field2044) {
                            if (this.field2041) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2044;
                        if (this.field2046 >= this.field2044) {
                            var4 = this.field2046 - this.field2044;
                        } else {
                            var4 = 5000 - this.field2044;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2039.write(this.field2038, var3, var4);
                    } catch (IOException var12) {
                        this.field2047 = true;
                    }
                    this.field2044 = (this.field2044 + var4) % 5000;
                    try {
                        if (this.field2046 == this.field2044) {
                            this.field2039.flush();
                        }
                    } catch (IOException var11) {
                        this.field2047 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2045 != null) {
                        this.field2045.close();
                    }
                    if (this.field2039 != null) {
                        this.field2039.close();
                    }
                    if (this.field2040 != null) {
                        this.field2040.close();
                    }
                } catch (IOException var10) {
                }
                this.field2038 = null;
                break;
            }
        } catch (Exception var15) {
            class135.method583((String) null, var15);
        }
    }
}
