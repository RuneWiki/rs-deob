package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dd")
public final class class130 implements Runnable {

    @ObfuscatedName("dd.g")
    public InputStream field2019;

    @ObfuscatedName("dd.s")
    public OutputStream field2020;

    @ObfuscatedName("dd.h")
    public Socket field2023;

    @ObfuscatedName("dd.m")
    public boolean field2022 = false;

    @ObfuscatedName("dd.u")
    public class123 field2030;

    @ObfuscatedName("dd.j")
    public class133 field2018;

    @ObfuscatedName("dd.b")
    public byte[] field2021;

    @ObfuscatedName("dd.v")
    public int field2024 = 0;

    @ObfuscatedName("dd.y")
    public int field2025 = 0;

    @ObfuscatedName("dd.w")
    public boolean field2026 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2030 = arg1;
        this.field2023 = arg0;
        this.field2023.setSoTimeout(30000);
        this.field2023.setTcpNoDelay(true);
        this.field2019 = this.field2023.getInputStream();
        this.field2020 = this.field2023.getOutputStream();
    }

    @ObfuscatedName("dd.j(B)V")
    public void method2551() {
        if (this.field2022) {
            return;
        }
        synchronized (this) {
            this.field2022 = true;
            this.notifyAll();
        }
        if (this.field2018 != null) {
            while (this.field2018.field2051 == 0) {
                class114.method2036(1L);
            }
            if (this.field2018.field2051 == 1) {
                try {
                    ((Thread) this.field2018.field2057).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2018 = null;
    }

    public void finalize() {
        this.method2551();
    }

    @ObfuscatedName("dd.b(I)I")
    public int method2539() throws IOException {
        return this.field2022 ? 0 : this.field2019.read();
    }

    @ObfuscatedName("dd.v(I)I")
    public int method2544() throws IOException {
        return this.field2022 ? 0 : this.field2019.available();
    }

    @ObfuscatedName("dd.y([BIIB)V")
    public void method2541(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2022) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2019.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("dd.w([BIII)V")
    public void method2538(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2022) {
            return;
        }
        if (this.field2026) {
            this.field2026 = false;
            throw new IOException();
        }
        if (this.field2021 == null) {
            this.field2021 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2021[this.field2025] = arg0[arg1 + var5];
                this.field2025 = (this.field2025 + 1) % 5000;
                if ((this.field2024 + 4900) % 5000 == this.field2025) {
                    throw new IOException();
                }
            }
            if (this.field2018 == null) {
                this.field2018 = this.field2030.method2443(this, 3);
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
                        if (this.field2025 == this.field2024) {
                            if (this.field2022) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2024;
                        if (this.field2025 >= this.field2024) {
                            var4 = this.field2025 - this.field2024;
                        } else {
                            var4 = 5000 - this.field2024;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2020.write(this.field2021, var3, var4);
                    } catch (IOException var12) {
                        this.field2026 = true;
                    }
                    this.field2024 = (this.field2024 + var4) % 5000;
                    try {
                        if (this.field2025 == this.field2024) {
                            this.field2020.flush();
                        }
                    } catch (IOException var11) {
                        this.field2026 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2019 != null) {
                        this.field2019.close();
                    }
                    if (this.field2020 != null) {
                        this.field2020.close();
                    }
                    if (this.field2023 != null) {
                        this.field2023.close();
                    }
                } catch (IOException var10) {
                }
                this.field2021 = null;
                break;
            }
        } catch (Exception var15) {
            class135.method1860((String) null, var15);
        }
    }
}
