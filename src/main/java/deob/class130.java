package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("di")
public final class class130 implements Runnable {

    @ObfuscatedName("di.i")
    public OutputStream field2023;

    @ObfuscatedName("di.c")
    public InputStream field2031;

    @ObfuscatedName("di.h")
    public Socket field2024;

    @ObfuscatedName("di.v")
    public boolean field2025 = false;

    @ObfuscatedName("di.q")
    public class123 field2026;

    @ObfuscatedName("di.s")
    public class133 field2027;

    @ObfuscatedName("di.g")
    public byte[] field2038;

    @ObfuscatedName("di.u")
    public int field2029 = 0;

    @ObfuscatedName("di.d")
    public int field2030 = 0;

    @ObfuscatedName("di.y")
    public boolean field2035 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2026 = arg1;
        this.field2024 = arg0;
        this.field2024.setSoTimeout(30000);
        this.field2024.setTcpNoDelay(true);
        this.field2031 = this.field2024.getInputStream();
        this.field2023 = this.field2024.getOutputStream();
    }

    @ObfuscatedName("di.v(I)V")
    public void method2612() {
        if (this.field2025) {
            return;
        }
        synchronized (this) {
            this.field2025 = true;
            this.notifyAll();
        }
        if (this.field2027 != null) {
            while (this.field2027.field2060 == 0) {
                class114.method743(1L);
            }
            if (this.field2027.field2060 == 1) {
                try {
                    ((Thread) this.field2027.field2064).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2027 = null;
    }

    public void finalize() {
        this.method2612();
    }

    @ObfuscatedName("di.q(I)I")
    public int method2596() throws IOException {
        return this.field2025 ? 0 : this.field2031.read();
    }

    @ObfuscatedName("di.s(B)I")
    public int method2597() throws IOException {
        return this.field2025 ? 0 : this.field2031.available();
    }

    @ObfuscatedName("di.g([BIIB)V")
    public void method2598(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2025) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2031.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("di.u([BIII)V")
    public void method2599(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2025) {
            return;
        }
        if (this.field2035) {
            this.field2035 = false;
            throw new IOException();
        }
        if (this.field2038 == null) {
            this.field2038 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2038[this.field2030] = arg0[arg1 + var5];
                this.field2030 = (this.field2030 + 1) % 5000;
                if ((this.field2029 + 4900) % 5000 == this.field2030) {
                    throw new IOException();
                }
            }
            if (this.field2027 == null) {
                this.field2027 = this.field2026.method2498(this, 3);
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
                        if (this.field2030 == this.field2029) {
                            if (this.field2025) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2029;
                        if (this.field2030 >= this.field2029) {
                            var4 = this.field2030 - this.field2029;
                        } else {
                            var4 = 5000 - this.field2029;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2023.write(this.field2038, var3, var4);
                    } catch (IOException var12) {
                        this.field2035 = true;
                    }
                    this.field2029 = (this.field2029 + var4) % 5000;
                    try {
                        if (this.field2030 == this.field2029) {
                            this.field2023.flush();
                        }
                    } catch (IOException var11) {
                        this.field2035 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2031 != null) {
                        this.field2031.close();
                    }
                    if (this.field2023 != null) {
                        this.field2023.close();
                    }
                    if (this.field2024 != null) {
                        this.field2024.close();
                    }
                } catch (IOException var10) {
                }
                this.field2038 = null;
                break;
            }
        } catch (Exception var15) {
            class135.method2595((String) null, var15);
        }
    }
}
