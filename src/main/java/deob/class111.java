package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dp")
public final class class111 implements Runnable {

    @ObfuscatedName("dp.x")
    public InputStream field1749;

    @ObfuscatedName("dp.n")
    public OutputStream field1746;

    @ObfuscatedName("dp.g")
    public Socket field1752;

    @ObfuscatedName("dp.v")
    public boolean field1755 = false;

    @ObfuscatedName("dp.y")
    public class104 field1747;

    @ObfuscatedName("dp.p")
    public class103 field1748;

    @ObfuscatedName("dp.j")
    public byte[] field1743;

    @ObfuscatedName("dp.m")
    public int field1750 = 0;

    @ObfuscatedName("dp.a")
    public int field1751 = 0;

    @ObfuscatedName("dp.i")
    public boolean field1744 = false;

    public class111(Socket arg0, class104 arg1) throws IOException {
        this.field1747 = arg1;
        this.field1752 = arg0;
        this.field1752.setSoTimeout(30000);
        this.field1752.setTcpNoDelay(true);
        this.field1752.setReceiveBufferSize(16384);
        this.field1752.setSendBufferSize(16384);
        this.field1749 = this.field1752.getInputStream();
        this.field1746 = this.field1752.getOutputStream();
    }

    @ObfuscatedName("dp.v(I)V")
    public void method2022() {
        if (this.field1755) {
            return;
        }
        synchronized (this) {
            this.field1755 = true;
            this.notifyAll();
        }
        if (this.field1748 != null) {
            while (this.field1748.field1671 == 0) {
                class162.method951(1L);
            }
            if (this.field1748.field1671 == 1) {
                try {
                    ((Thread) this.field1748.field1675).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1748 = null;
    }

    public void finalize() {
        this.method2022();
    }

    @ObfuscatedName("dp.y(I)I")
    public int method2024() throws IOException {
        return this.field1755 ? 0 : this.field1749.read();
    }

    @ObfuscatedName("dp.p(B)I")
    public int method2021() throws IOException {
        return this.field1755 ? 0 : this.field1749.available();
    }

    @ObfuscatedName("dp.j([BIII)V")
    public void method2026(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1755) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1749.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("dp.s([BIII)V")
    public void method2031(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1755) {
            return;
        }
        if (this.field1744) {
            this.field1744 = false;
            throw new IOException();
        }
        if (this.field1743 == null) {
            this.field1743 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1743[this.field1751] = arg0[arg1 + var5];
                this.field1751 = (this.field1751 + 1) % 5000;
                if ((this.field1750 + 4900) % 5000 == this.field1751) {
                    throw new IOException();
                }
            }
            if (this.field1748 == null) {
                this.field1748 = this.field1747.method1954(this, 3);
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
                        if (this.field1751 == this.field1750) {
                            if (this.field1755) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1750;
                        if (this.field1751 >= this.field1750) {
                            var4 = this.field1751 - this.field1750;
                        } else {
                            var4 = 5000 - this.field1750;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1746.write(this.field1743, var3, var4);
                    } catch (IOException var12) {
                        this.field1744 = true;
                    }
                    this.field1750 = (this.field1750 + var4) % 5000;
                    try {
                        if (this.field1751 == this.field1750) {
                            this.field1746.flush();
                        }
                    } catch (IOException var11) {
                        this.field1744 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1749 != null) {
                        this.field1749.close();
                    }
                    if (this.field1746 != null) {
                        this.field1746.close();
                    }
                    if (this.field1752 != null) {
                        this.field1752.close();
                    }
                } catch (IOException var10) {
                }
                this.field1743 = null;
                break;
            }
        } catch (Exception var15) {
            class102.method1916((String) null, var15);
        }
    }
}
