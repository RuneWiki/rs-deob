package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("db")
public final class class130 implements Runnable {

    @ObfuscatedName("db.p")
    public InputStream field2031;

    @ObfuscatedName("db.g")
    public OutputStream field2020;

    @ObfuscatedName("db.x")
    public Socket field2021;

    @ObfuscatedName("db.c")
    public boolean field2032 = false;

    @ObfuscatedName("db.n")
    public class123 field2023;

    @ObfuscatedName("db.s")
    public class133 field2024;

    @ObfuscatedName("db.r")
    public byte[] field2025;

    @ObfuscatedName("db.w")
    public int field2026 = 0;

    @ObfuscatedName("db.u")
    public int field2027 = 0;

    @ObfuscatedName("db.d")
    public boolean field2028 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2023 = arg1;
        this.field2021 = arg0;
        this.field2021.setSoTimeout(30000);
        this.field2021.setTcpNoDelay(true);
        this.field2031 = this.field2021.getInputStream();
        this.field2020 = this.field2021.getOutputStream();
    }

    @ObfuscatedName("db.n(I)V")
    public void method2648() {
        if (this.field2032) {
            return;
        }
        synchronized (this) {
            this.field2032 = true;
            this.notifyAll();
        }
        if (this.field2024 != null) {
            while (this.field2024.field2053 == 0) {
                class114.method1917(1L);
            }
            if (this.field2024.field2053 == 1) {
                try {
                    ((Thread) this.field2024.field2055).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2024 = null;
    }

    public void finalize() {
        this.method2648();
    }

    @ObfuscatedName("db.s(I)I")
    public int method2633() throws IOException {
        return this.field2032 ? 0 : this.field2031.read();
    }

    @ObfuscatedName("db.r(S)I")
    public int method2637() throws IOException {
        return this.field2032 ? 0 : this.field2031.available();
    }

    @ObfuscatedName("db.w([BIII)V")
    public void method2635(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2032) {
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

    @ObfuscatedName("db.u([BIIB)V")
    public void method2636(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2032) {
            return;
        }
        if (this.field2028) {
            this.field2028 = false;
            throw new IOException();
        }
        if (this.field2025 == null) {
            this.field2025 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2025[this.field2027] = arg0[arg1 + var5];
                this.field2027 = (this.field2027 + 1) % 5000;
                if ((this.field2026 + 4900) % 5000 == this.field2027) {
                    throw new IOException();
                }
            }
            if (this.field2024 == null) {
                this.field2024 = this.field2023.method2546(this, 3);
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
                        if (this.field2027 == this.field2026) {
                            if (this.field2032) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2026;
                        if (this.field2027 >= this.field2026) {
                            var4 = this.field2027 - this.field2026;
                        } else {
                            var4 = 5000 - this.field2026;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2020.write(this.field2025, var3, var4);
                    } catch (IOException var12) {
                        this.field2028 = true;
                    }
                    this.field2026 = (this.field2026 + var4) % 5000;
                    try {
                        if (this.field2027 == this.field2026) {
                            this.field2020.flush();
                        }
                    } catch (IOException var11) {
                        this.field2028 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2031 != null) {
                        this.field2031.close();
                    }
                    if (this.field2020 != null) {
                        this.field2020.close();
                    }
                    if (this.field2021 != null) {
                        this.field2021.close();
                    }
                } catch (IOException var10) {
                }
                this.field2025 = null;
                break;
            }
        } catch (Exception var15) {
            class135.method2121((String) null, var15);
        }
    }
}
