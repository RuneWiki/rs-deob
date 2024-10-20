package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dj")
public final class class130 implements Runnable {

    @ObfuscatedName("dj.z")
    public InputStream field2028;

    @ObfuscatedName("dj.j")
    public OutputStream field2020;

    @ObfuscatedName("dj.a")
    public Socket field2021;

    @ObfuscatedName("dj.y")
    public boolean field2022 = false;

    @ObfuscatedName("dj.i")
    public class123 field2023;

    @ObfuscatedName("dj.b")
    public class133 field2025;

    @ObfuscatedName("dj.s")
    public byte[] field2026;

    @ObfuscatedName("dj.q")
    public int field2019 = 0;

    @ObfuscatedName("dj.p")
    public int field2027 = 0;

    @ObfuscatedName("dj.h")
    public boolean field2024 = false;

    public class130(Socket arg0, class123 arg1) throws IOException {
        this.field2023 = arg1;
        this.field2021 = arg0;
        this.field2021.setSoTimeout(30000);
        this.field2021.setTcpNoDelay(true);
        this.field2028 = this.field2021.getInputStream();
        this.field2020 = this.field2021.getOutputStream();
    }

    @ObfuscatedName("dj.a(I)V")
    public void method2581() {
        if (this.field2022) {
            return;
        }
        synchronized (this) {
            this.field2022 = true;
            this.notifyAll();
        }
        if (this.field2025 != null) {
            while (this.field2025.field2057 == 0) {
                class114.method1960(1L);
            }
            if (this.field2025.field2057 == 1) {
                try {
                    ((Thread) this.field2025.field2058).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2025 = null;
    }

    public void finalize() {
        this.method2581();
    }

    @ObfuscatedName("dj.y(I)I")
    public int method2582() throws IOException {
        return this.field2022 ? 0 : this.field2028.read();
    }

    @ObfuscatedName("dj.i(I)I")
    public int method2583() throws IOException {
        return this.field2022 ? 0 : this.field2028.available();
    }

    @ObfuscatedName("dj.b([BIII)V")
    public void method2591(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2022) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2028.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("dj.s([BIII)V")
    public void method2585(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2022) {
            return;
        }
        if (this.field2024) {
            this.field2024 = false;
            throw new IOException();
        }
        if (this.field2026 == null) {
            this.field2026 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2026[this.field2027] = arg0[arg1 + var5];
                this.field2027 = (this.field2027 + 1) % 5000;
                if ((this.field2019 + 4900) % 5000 == this.field2027) {
                    throw new IOException();
                }
            }
            if (this.field2025 == null) {
                this.field2025 = this.field2023.method2484(this, 3);
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
                        if (this.field2027 == this.field2019) {
                            if (this.field2022) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2019;
                        if (this.field2027 >= this.field2019) {
                            var4 = this.field2027 - this.field2019;
                        } else {
                            var4 = 5000 - this.field2019;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2020.write(this.field2026, var3, var4);
                    } catch (IOException var12) {
                        this.field2024 = true;
                    }
                    this.field2019 = (this.field2019 + var4) % 5000;
                    try {
                        if (this.field2027 == this.field2019) {
                            this.field2020.flush();
                        }
                    } catch (IOException var11) {
                        this.field2024 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2028 != null) {
                        this.field2028.close();
                    }
                    if (this.field2020 != null) {
                        this.field2020.close();
                    }
                    if (this.field2021 != null) {
                        this.field2021.close();
                    }
                } catch (IOException var10) {
                }
                this.field2026 = null;
                break;
            }
        } catch (Exception var15) {
            class135.method2452((String) null, var15);
        }
    }
}
