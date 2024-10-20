package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dz")
public class class123 {

    @ObfuscatedName("dz.b")
    public class124 field1666;

    @ObfuscatedName("dz.s")
    public byte[] field1665;

    @ObfuscatedName("dz.r")
    public long field1675 = -1L;

    @ObfuscatedName("dz.g")
    public int field1667;

    @ObfuscatedName("dz.x")
    public byte[] field1668;

    @ObfuscatedName("dz.f")
    public long field1669 = -1L;

    @ObfuscatedName("dz.u")
    public int field1670 = 0;

    @ObfuscatedName("dz.t")
    public long field1671;

    @ObfuscatedName("dz.k")
    public long field1664;

    @ObfuscatedName("dz.n")
    public long field1673;

    @ObfuscatedName("dz.d")
    public long field1674;

    public class123(class124 arg0, int arg1, int arg2) throws IOException {
        this.field1666 = arg0;
        this.field1673 = this.field1664 = arg0.method2174();
        this.field1665 = new byte[arg1];
        this.field1668 = new byte[arg2];
        this.field1671 = 0L;
    }

    @ObfuscatedName("dz.b(I)V")
    public void method2156() throws IOException {
        this.method2139();
        this.field1666.method2180();
    }

    @ObfuscatedName("dz.s(J)V")
    public void method2149(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1671 = arg0;
    }

    @ObfuscatedName("dz.r(I)J")
    public long method2135() {
        return this.field1673;
    }

    @ObfuscatedName("dz.g([BI)V")
    public void method2151(byte[] arg0) throws IOException {
        this.method2136(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dz.x([BIII)V")
    public void method2136(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1669 != -1L && this.field1671 >= this.field1669 && this.field1671 + (long) arg2 <= this.field1669 + (long) this.field1670) {
                System.arraycopy(this.field1668, (int) (this.field1671 - this.field1669), arg0, arg1, arg2);
                this.field1671 += (long) arg2;
                return;
            }
            long var4 = this.field1671;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1671 >= this.field1675 && this.field1671 < this.field1675 + (long) this.field1667) {
                int var8 = (int) ((long) this.field1667 - (this.field1671 - this.field1675));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1665, (int) (this.field1671 - this.field1675), arg0, arg1, var8);
                this.field1671 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1665.length) {
                this.field1666.method2166(this.field1671);
                this.field1674 = this.field1671;
                while (arg2 > 0) {
                    int var9 = this.field1666.method2171(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1674 += (long) var9;
                    this.field1671 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2137();
                int var10 = arg2;
                if (arg2 > this.field1667) {
                    var10 = this.field1667;
                }
                System.arraycopy(this.field1665, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1671 += (long) var10;
            }
            if (this.field1669 != -1L) {
                if (this.field1669 > this.field1671 && arg2 > 0) {
                    int var11 = (int) (this.field1669 - this.field1671) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1671++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1669 >= var4 && this.field1669 < (long) var7 + var4) {
                    var12 = this.field1669;
                } else if (var4 >= this.field1669 && var4 < this.field1669 + (long) this.field1670) {
                    var12 = var4;
                }
                if (this.field1669 + (long) this.field1670 > var4 && this.field1669 + (long) this.field1670 <= (long) var7 + var4) {
                    var14 = this.field1669 + (long) this.field1670;
                } else if ((long) var7 + var4 > this.field1669 && (long) var7 + var4 <= this.field1669 + (long) this.field1670) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1668, (int) (var12 - this.field1669), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1671) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1671));
                        this.field1671 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1674 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dz.f(I)V")
    public void method2137() throws IOException {
        this.field1667 = 0;
        if (this.field1674 != this.field1671) {
            this.field1666.method2166(this.field1671);
            this.field1674 = this.field1671;
        }
        this.field1675 = this.field1671;
        while (this.field1667 < this.field1665.length) {
            int var1 = this.field1666.method2171(this.field1665, this.field1667, this.field1665.length - this.field1667);
            if (var1 == -1) {
                break;
            }
            this.field1674 += (long) var1;
            this.field1667 += var1;
        }
    }

    @ObfuscatedName("dz.u([BIIB)V")
    public void method2138(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1671 + (long) arg2 > this.field1673) {
                this.field1673 = this.field1671 + (long) arg2;
            }
            if (this.field1669 != -1L && (this.field1671 < this.field1669 || this.field1671 > this.field1669 + (long) this.field1670)) {
                this.method2139();
            }
            if (this.field1669 != -1L && this.field1671 + (long) arg2 > this.field1669 + (long) this.field1668.length) {
                int var4 = (int) ((long) this.field1668.length - (this.field1671 - this.field1669));
                System.arraycopy(arg0, arg1, this.field1668, (int) (this.field1671 - this.field1669), var4);
                this.field1671 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1670 = this.field1668.length;
                this.method2139();
            }
            if (arg2 > this.field1668.length) {
                if (this.field1674 != this.field1671) {
                    this.field1666.method2166(this.field1671);
                    this.field1674 = this.field1671;
                }
                this.field1666.method2167(arg0, arg1, arg2);
                this.field1674 += (long) arg2;
                if (this.field1674 > this.field1664) {
                    this.field1664 = this.field1674;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1671 >= this.field1675 && this.field1671 < this.field1675 + (long) this.field1667) {
                    var5 = this.field1671;
                } else if (this.field1675 >= this.field1671 && this.field1675 < this.field1671 + (long) arg2) {
                    var5 = this.field1675;
                }
                if (this.field1671 + (long) arg2 > this.field1675 && this.field1671 + (long) arg2 <= this.field1675 + (long) this.field1667) {
                    var7 = this.field1671 + (long) arg2;
                } else if (this.field1675 + (long) this.field1667 > this.field1671 && this.field1675 + (long) this.field1667 <= this.field1671 + (long) arg2) {
                    var7 = this.field1675 + (long) this.field1667;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1671), this.field1665, (int) (var5 - this.field1675), var9);
                }
                this.field1671 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1669 == -1L) {
                    this.field1669 = this.field1671;
                }
                System.arraycopy(arg0, arg1, this.field1668, (int) (this.field1671 - this.field1669), arg2);
                this.field1671 += (long) arg2;
                if (this.field1671 - this.field1669 > (long) this.field1670) {
                    this.field1670 = (int) (this.field1671 - this.field1669);
                }
            }
        } catch (IOException var11) {
            this.field1674 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dz.t(I)V")
    public void method2139() throws IOException {
        if (this.field1669 == -1L) {
            return;
        }
        if (this.field1674 != this.field1669) {
            this.field1666.method2166(this.field1669);
            this.field1674 = this.field1669;
        }
        this.field1666.method2167(this.field1668, 0, this.field1670);
        this.field1674 += (long) (this.field1670 * 1225561237) * -1085565251L;
        if (this.field1674 > this.field1664) {
            this.field1664 = this.field1674;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1669 >= this.field1675 && this.field1669 < this.field1675 + (long) this.field1667) {
            var1 = this.field1669;
        } else if (this.field1675 >= this.field1669 && this.field1675 < this.field1669 + (long) this.field1670) {
            var1 = this.field1675;
        }
        if (this.field1669 + (long) this.field1670 > this.field1675 && this.field1669 + (long) this.field1670 <= this.field1675 + (long) this.field1667) {
            var3 = this.field1669 + (long) this.field1670;
        } else if (this.field1675 + (long) this.field1667 > this.field1669 && this.field1675 + (long) this.field1667 <= this.field1669 + (long) this.field1670) {
            var3 = this.field1675 + (long) this.field1667;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1668, (int) (var1 - this.field1669), this.field1665, (int) (var1 - this.field1675), var5);
        }
        this.field1669 = -1L;
        this.field1670 = 0;
    }
}
