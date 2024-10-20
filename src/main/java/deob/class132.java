package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("el")
public final class class132 implements Runnable {

    @ObfuscatedName("el.x")
    public InputStream field2039;

    @ObfuscatedName("el.v")
    public OutputStream field2033;

    @ObfuscatedName("el.m")
    public Socket field2034;

    @ObfuscatedName("el.e")
    public boolean field2035 = false;

    @ObfuscatedName("el.h")
    public class125 field2045;

    @ObfuscatedName("el.p")
    public class135 field2046;

    @ObfuscatedName("el.j")
    public byte[] field2038;

    @ObfuscatedName("el.i")
    public int field2032 = 0;

    @ObfuscatedName("el.u")
    public int field2040 = 0;

    @ObfuscatedName("el.l")
    public boolean field2041 = false;

    public class132(Socket arg0, class125 arg1) throws IOException {
        this.field2045 = arg1;
        this.field2034 = arg0;
        this.field2034.setSoTimeout(30000);
        this.field2034.setTcpNoDelay(true);
        this.field2039 = this.field2034.getInputStream();
        this.field2033 = this.field2034.getOutputStream();
    }

    @ObfuscatedName("el.h(I)V")
    public void method2593() {
        if (this.field2035) {
            return;
        }
        synchronized (this) {
            this.field2035 = true;
            this.notifyAll();
        }
        if (this.field2046 != null) {
            while (this.field2046.field2070 == 0) {
                class116.method1361(1L);
            }
            if (this.field2046.field2070 == 1) {
                try {
                    ((Thread) this.field2046.field2067).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2046 = null;
    }

    public void finalize() {
        this.method2593();
    }

    @ObfuscatedName("el.p(I)I")
    public int method2594() throws IOException {
        return this.field2035 ? 0 : this.field2039.read();
    }

    @ObfuscatedName("el.j(B)I")
    public int method2595() throws IOException {
        return this.field2035 ? 0 : this.field2039.available();
    }

    @ObfuscatedName("el.i([BIII)V")
    public void method2596(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2035) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2039.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("el.u([BIII)V")
    public void method2601(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2035) {
            return;
        }
        if (this.field2041) {
            this.field2041 = false;
            throw new IOException();
        }
        if (this.field2038 == null) {
            this.field2038 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2038[this.field2040] = arg0[arg1 + var5];
                this.field2040 = (this.field2040 + 1) % 5000;
                if ((this.field2032 + 4900) % 5000 == this.field2040) {
                    throw new IOException();
                }
            }
            if (this.field2046 == null) {
                this.field2046 = this.field2045.method2500(this, 3);
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
                        if (this.field2040 == this.field2032) {
                            if (this.field2035) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2032;
                        if (this.field2040 >= this.field2032) {
                            var4 = this.field2040 - this.field2032;
                        } else {
                            var4 = 5000 - this.field2032;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2033.write(this.field2038, var3, var4);
                    } catch (IOException var12) {
                        this.field2041 = true;
                    }
                    this.field2032 = (this.field2032 + var4) % 5000;
                    try {
                        if (this.field2040 == this.field2032) {
                            this.field2033.flush();
                        }
                    } catch (IOException var11) {
                        this.field2041 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2039 != null) {
                        this.field2039.close();
                    }
                    if (this.field2033 != null) {
                        this.field2033.close();
                    }
                    if (this.field2034 != null) {
                        this.field2034.close();
                    }
                } catch (IOException var10) {
                }
                this.field2038 = null;
                break;
            }
        } catch (Exception var15) {
            class137.method483((String) null, var15);
        }
    }
}
