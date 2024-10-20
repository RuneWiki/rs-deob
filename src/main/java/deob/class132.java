package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ee")
public final class class132 implements Runnable {

    @ObfuscatedName("ee.e")
    public InputStream field2041;

    @ObfuscatedName("ee.v")
    public OutputStream field2039;

    @ObfuscatedName("ee.k")
    public Socket field2040;

    @ObfuscatedName("ee.g")
    public boolean field2049 = false;

    @ObfuscatedName("ee.q")
    public class125 field2044;

    @ObfuscatedName("ee.l")
    public class135 field2043;

    @ObfuscatedName("ee.a")
    public byte[] field2038;

    @ObfuscatedName("ee.b")
    public int field2045 = 0;

    @ObfuscatedName("ee.z")
    public int field2042 = 0;

    @ObfuscatedName("ee.w")
    public boolean field2047 = false;

    public class132(Socket arg0, class125 arg1) throws IOException {
        this.field2044 = arg1;
        this.field2040 = arg0;
        this.field2040.setSoTimeout(30000);
        this.field2040.setTcpNoDelay(true);
        this.field2041 = this.field2040.getInputStream();
        this.field2039 = this.field2040.getOutputStream();
    }

    @ObfuscatedName("ee.g(I)V")
    public void method2593() {
        if (this.field2049) {
            return;
        }
        synchronized (this) {
            this.field2049 = true;
            this.notifyAll();
        }
        if (this.field2043 != null) {
            while (this.field2043.field2075 == 0) {
                class116.method7(1L);
            }
            if (this.field2043.field2075 == 1) {
                try {
                    ((Thread) this.field2043.field2079).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2043 = null;
    }

    public void finalize() {
        this.method2593();
    }

    @ObfuscatedName("ee.q(B)I")
    public int method2591() throws IOException {
        return this.field2049 ? 0 : this.field2041.read();
    }

    @ObfuscatedName("ee.l(B)I")
    public int method2589() throws IOException {
        return this.field2049 ? 0 : this.field2041.available();
    }

    @ObfuscatedName("ee.a([BIII)V")
    public void method2606(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2049) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2041.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ee.b([BIII)V")
    public void method2594(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2049) {
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
                this.field2038[this.field2042] = arg0[arg1 + var5];
                this.field2042 = (this.field2042 + 1) % 5000;
                if ((this.field2045 + 4900) % 5000 == this.field2042) {
                    throw new IOException();
                }
            }
            if (this.field2043 == null) {
                this.field2043 = this.field2044.method2487(this, 3);
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
                        if (this.field2045 == this.field2042) {
                            if (this.field2049) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2045;
                        if (this.field2042 >= this.field2045) {
                            var4 = this.field2042 - this.field2045;
                        } else {
                            var4 = 5000 - this.field2045;
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
                    this.field2045 = (this.field2045 + var4) % 5000;
                    try {
                        if (this.field2045 == this.field2042) {
                            this.field2039.flush();
                        }
                    } catch (IOException var11) {
                        this.field2047 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2041 != null) {
                        this.field2041.close();
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
            class137.method101((String) null, var15);
        }
    }
}
