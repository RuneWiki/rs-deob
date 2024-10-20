package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("en")
public final class class132 implements Runnable {

    @ObfuscatedName("en.l")
    public InputStream field2024;

    @ObfuscatedName("en.y")
    public OutputStream field2021;

    @ObfuscatedName("en.g")
    public Socket field2022;

    @ObfuscatedName("en.j")
    public boolean field2023 = false;

    @ObfuscatedName("en.w")
    public class125 field2027;

    @ObfuscatedName("en.c")
    public class135 field2025;

    @ObfuscatedName("en.x")
    public byte[] field2026;

    @ObfuscatedName("en.f")
    public int field2032 = 0;

    @ObfuscatedName("en.t")
    public int field2028 = 0;

    @ObfuscatedName("en.n")
    public boolean field2029 = false;

    public class132(Socket arg0, class125 arg1) throws IOException {
        this.field2027 = arg1;
        this.field2022 = arg0;
        this.field2022.setSoTimeout(30000);
        this.field2022.setTcpNoDelay(true);
        this.field2024 = this.field2022.getInputStream();
        this.field2021 = this.field2022.getOutputStream();
    }

    @ObfuscatedName("en.j(B)V")
    public void method2599() {
        if (this.field2023) {
            return;
        }
        synchronized (this) {
            this.field2023 = true;
            this.notifyAll();
        }
        if (this.field2025 != null) {
            while (this.field2025.field2053 == 0) {
                class116.method71(1L);
            }
            if (this.field2025.field2053 == 1) {
                try {
                    ((Thread) this.field2025.field2057).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2025 = null;
    }

    public void finalize() {
        this.method2599();
    }

    @ObfuscatedName("en.w(B)I")
    public int method2596() throws IOException {
        return this.field2023 ? 0 : this.field2024.read();
    }

    @ObfuscatedName("en.c(B)I")
    public int method2608() throws IOException {
        return this.field2023 ? 0 : this.field2024.available();
    }

    @ObfuscatedName("en.x([BIII)V")
    public void method2594(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2023) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2024.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("en.f([BIII)V")
    public void method2593(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2023) {
            return;
        }
        if (this.field2029) {
            this.field2029 = false;
            throw new IOException();
        }
        if (this.field2026 == null) {
            this.field2026 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2026[this.field2028] = arg0[arg1 + var5];
                this.field2028 = (this.field2028 + 1) % 5000;
                if ((this.field2032 + 4900) % 5000 == this.field2028) {
                    throw new IOException();
                }
            }
            if (this.field2025 == null) {
                this.field2025 = this.field2027.method2497(this, 3);
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
                        if (this.field2032 == this.field2028) {
                            if (this.field2023) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2032;
                        if (this.field2028 >= this.field2032) {
                            var4 = this.field2028 - this.field2032;
                        } else {
                            var4 = 5000 - this.field2032;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2021.write(this.field2026, var3, var4);
                    } catch (IOException var12) {
                        this.field2029 = true;
                    }
                    this.field2032 = (this.field2032 + var4) % 5000;
                    try {
                        if (this.field2032 == this.field2028) {
                            this.field2021.flush();
                        }
                    } catch (IOException var11) {
                        this.field2029 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2024 != null) {
                        this.field2024.close();
                    }
                    if (this.field2021 != null) {
                        this.field2021.close();
                    }
                    if (this.field2022 != null) {
                        this.field2022.close();
                    }
                } catch (IOException var10) {
                }
                this.field2026 = null;
                break;
            }
        } catch (Exception var15) {
            class137.method2490((String) null, var15);
        }
    }
}
