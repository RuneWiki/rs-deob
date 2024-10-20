package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("da")
public final class class127 implements Runnable {

    @ObfuscatedName("da.z")
    public InputStream field2031;

    @ObfuscatedName("da.n")
    public OutputStream field2019;

    @ObfuscatedName("da.u")
    public Socket field2020;

    @ObfuscatedName("da.t")
    public boolean field2021 = false;

    @ObfuscatedName("da.e")
    public class120 field2026;

    @ObfuscatedName("da.a")
    public class130 field2023;

    @ObfuscatedName("da.l")
    public byte[] field2024;

    @ObfuscatedName("da.v")
    public int field2025 = 0;

    @ObfuscatedName("da.j")
    public int field2018 = 0;

    @ObfuscatedName("da.k")
    public boolean field2027 = false;

    public class127(Socket arg0, class120 arg1) throws IOException {
        this.field2026 = arg1;
        this.field2020 = arg0;
        this.field2020.setSoTimeout(30000);
        this.field2020.setTcpNoDelay(true);
        this.field2031 = this.field2020.getInputStream();
        this.field2019 = this.field2020.getOutputStream();
    }

    @ObfuscatedName("da.u(B)V")
    public void method2613() {
        if (this.field2021) {
            return;
        }
        synchronized (this) {
            this.field2021 = true;
            this.notifyAll();
        }
        if (this.field2023 != null) {
            while (this.field2023.field2055 == 0) {
                class111.method1306(1L);
            }
            if (this.field2023.field2055 == 1) {
                try {
                    ((Thread) this.field2023.field2059).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2023 = null;
    }

    public void finalize() {
        this.method2613();
    }

    @ObfuscatedName("da.t(B)I")
    public int method2598() throws IOException {
        return this.field2021 ? 0 : this.field2031.read();
    }

    @ObfuscatedName("da.e(I)I")
    public int method2599() throws IOException {
        return this.field2021 ? 0 : this.field2031.available();
    }

    @ObfuscatedName("da.a([BIIB)V")
    public void method2597(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2021) {
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

    @ObfuscatedName("da.l([BIIS)V")
    public void method2600(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2021) {
            return;
        }
        if (this.field2027) {
            this.field2027 = false;
            throw new IOException();
        }
        if (this.field2024 == null) {
            this.field2024 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2024[this.field2018] = arg0[arg1 + var5];
                this.field2018 = (this.field2018 + 1) % 5000;
                if ((this.field2025 + 4900) % 5000 == this.field2018) {
                    throw new IOException();
                }
            }
            if (this.field2023 == null) {
                this.field2023 = this.field2026.method2523(this, 3);
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
                        if (this.field2025 == this.field2018) {
                            if (this.field2021) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2025;
                        if (this.field2018 >= this.field2025) {
                            var4 = this.field2018 - this.field2025;
                        } else {
                            var4 = 5000 - this.field2025;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2019.write(this.field2024, var3, var4);
                    } catch (IOException var12) {
                        this.field2027 = true;
                    }
                    this.field2025 = (this.field2025 + var4) % 5000;
                    try {
                        if (this.field2025 == this.field2018) {
                            this.field2019.flush();
                        }
                    } catch (IOException var11) {
                        this.field2027 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2031 != null) {
                        this.field2031.close();
                    }
                    if (this.field2019 != null) {
                        this.field2019.close();
                    }
                    if (this.field2020 != null) {
                        this.field2020.close();
                    }
                } catch (IOException var10) {
                }
                this.field2024 = null;
                break;
            }
        } catch (Exception var15) {
            class132.method508((String) null, var15);
        }
    }
}
