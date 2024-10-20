package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ea")
public final class class132 extends class329 implements Runnable {

    @ObfuscatedName("ea.v")
    public InputStream field1503;

    @ObfuscatedName("ea.n")
    public OutputStream field1501;

    @ObfuscatedName("ea.f")
    public Socket field1502;

    @ObfuscatedName("ea.y")
    public boolean field1505 = false;

    @ObfuscatedName("ea.p")
    public class128 field1504;

    @ObfuscatedName("ea.j")
    public class134 field1500;

    @ObfuscatedName("ea.r")
    public byte[] field1506;

    @ObfuscatedName("ea.b")
    public int field1507 = 0;

    @ObfuscatedName("ea.d")
    public int field1513 = 0;

    @ObfuscatedName("ea.s")
    public boolean field1509 = false;

    @ObfuscatedName("ea.u")
    public final int field1510;

    @ObfuscatedName("ea.l")
    public final int field1511;

    public class132(Socket arg0, class128 arg1, int arg2) throws IOException {
        this.field1504 = arg1;
        this.field1502 = arg0;
        this.field1510 = arg2;
        this.field1511 = arg2 - 100;
        this.field1502.setSoTimeout(30000);
        this.field1502.setTcpNoDelay(true);
        this.field1502.setReceiveBufferSize(65536);
        this.field1502.setSendBufferSize(65536);
        this.field1503 = this.field1502.getInputStream();
        this.field1501 = this.field1502.getOutputStream();
    }

    @ObfuscatedName("ea.v(I)V")
    public void method2357() {
        if (this.field1505) {
            return;
        }
        synchronized (this) {
            this.field1505 = true;
            this.notifyAll();
        }
        if (this.field1500 != null) {
            while (this.field1500.field1524 == 0) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException var6) {
                }
            }
            if (this.field1500.field1524 == 1) {
                try {
                    ((Thread) this.field1500.field1532).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field1500 = null;
    }

    public void finalize() {
        this.method2357();
    }

    @ObfuscatedName("ea.n(I)I")
    public int method2328() throws IOException {
        return this.field1505 ? 0 : this.field1503.read();
    }

    @ObfuscatedName("ea.f(I)I")
    public int method2327() throws IOException {
        return this.field1505 ? 0 : this.field1503.available();
    }

    @ObfuscatedName("ea.y(II)Z")
    public boolean method2342(int arg0) throws IOException {
        if (this.field1505) {
            return false;
        } else {
            return this.field1503.available() >= arg0;
        }
    }

    @ObfuscatedName("ea.p([BIII)I")
    public int method2352(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1505) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field1503.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("ea.j([BIIB)V")
    public void method2330(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1505) {
            return;
        }
        if (this.field1509) {
            this.field1509 = false;
            throw new IOException();
        }
        if (this.field1506 == null) {
            this.field1506 = new byte[this.field1510];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1506[this.field1513] = arg0[arg1 + var5];
                this.field1513 = (this.field1513 + 1) % this.field1510;
                if ((this.field1511 + this.field1507) % this.field1510 == this.field1513) {
                    throw new IOException();
                }
            }
            if (this.field1500 == null) {
                this.field1500 = this.field1504.method2295(this, 3);
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
                        if (this.field1513 == this.field1507) {
                            if (this.field1505) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1507;
                        if (this.field1513 >= this.field1507) {
                            var4 = this.field1513 - this.field1507;
                        } else {
                            var4 = this.field1510 - this.field1507;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1501.write(this.field1506, var3, var4);
                    } catch (IOException var12) {
                        this.field1509 = true;
                    }
                    this.field1507 = (this.field1507 + var4) % this.field1510;
                    try {
                        if (this.field1513 == this.field1507) {
                            this.field1501.flush();
                        }
                    } catch (IOException var11) {
                        this.field1509 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1503 != null) {
                        this.field1503.close();
                    }
                    if (this.field1501 != null) {
                        this.field1501.close();
                    }
                    if (this.field1502 != null) {
                        this.field1502.close();
                    }
                } catch (IOException var10) {
                }
                this.field1506 = null;
                break;
            }
        } catch (Exception var15) {
            class406.method4407((String) null, var15);
        }
    }

    @ObfuscatedName("ea.r([BIII)V")
    public void method2333(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method2330(arg0, arg1, arg2);
    }
}
