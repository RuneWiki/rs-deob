package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dy")
public class class124 {

    @ObfuscatedName("dy.s")
    public class125 field1759;

    @ObfuscatedName("dy.c")
    public byte[] field1756;

    @ObfuscatedName("dy.f")
    public long field1751 = -1L;

    @ObfuscatedName("dy.m")
    public int field1760;

    @ObfuscatedName("dy.h")
    public byte[] field1753;

    @ObfuscatedName("dy.t")
    public long field1754 = -1L;

    @ObfuscatedName("dy.p")
    public int field1755 = 0;

    @ObfuscatedName("dy.d")
    public long field1752;

    @ObfuscatedName("dy.n")
    public long field1757;

    @ObfuscatedName("dy.z")
    public long field1758;

    @ObfuscatedName("dy.o")
    public long field1750;

    public class124(class125 arg0, int arg1, int arg2) throws IOException {
        this.field1759 = arg0;
        this.field1758 = this.field1757 = arg0.method2188();
        this.field1756 = new byte[arg1];
        this.field1753 = new byte[arg2];
        this.field1752 = 0L;
    }

    @ObfuscatedName("dy.s(I)V")
    public void method2180() throws IOException {
        this.method2162();
        this.field1759.method2184();
    }

    @ObfuscatedName("dy.c(J)V")
    public void method2157(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1752 = arg0;
    }

    @ObfuscatedName("dy.f(I)J")
    public long method2158() {
        return this.field1758;
    }

    @ObfuscatedName("dy.m([BI)V")
    public void method2159(byte[] arg0) throws IOException {
        this.method2160(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dy.h([BIII)V")
    public void method2160(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1754 != -1L && this.field1752 >= this.field1754 && this.field1752 + (long) arg2 <= this.field1754 + (long) this.field1755) {
                System.arraycopy(this.field1753, (int) (this.field1752 - this.field1754), arg0, arg1, arg2);
                this.field1752 += (long) arg2;
                return;
            }
            long var4 = this.field1752;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1752 >= this.field1751 && this.field1752 < this.field1751 + (long) this.field1760) {
                int var8 = (int) ((long) this.field1760 - (this.field1752 - this.field1751));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1756, (int) (this.field1752 - this.field1751), arg0, arg1, var8);
                this.field1752 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1756.length) {
                this.field1759.method2185(this.field1752);
                this.field1750 = this.field1752;
                while (arg2 > 0) {
                    int var9 = this.field1759.method2198(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1750 += (long) var9;
                    this.field1752 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2181();
                int var10 = arg2;
                if (arg2 > this.field1760) {
                    var10 = this.field1760;
                }
                System.arraycopy(this.field1756, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1752 += (long) var10;
            }
            if (this.field1754 != -1L) {
                if (this.field1754 > this.field1752 && arg2 > 0) {
                    int var11 = (int) (this.field1754 - this.field1752) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1752++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1754 >= var4 && this.field1754 < (long) var7 + var4) {
                    var12 = this.field1754;
                } else if (var4 >= this.field1754 && var4 < this.field1754 + (long) this.field1755) {
                    var12 = var4;
                }
                if (this.field1754 + (long) this.field1755 > var4 && this.field1754 + (long) this.field1755 <= (long) var7 + var4) {
                    var14 = this.field1754 + (long) this.field1755;
                } else if ((long) var7 + var4 > this.field1754 && (long) var7 + var4 <= this.field1754 + (long) this.field1755) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1753, (int) (var12 - this.field1754), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1752) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1752));
                        this.field1752 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1750 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dy.t(I)V")
    public void method2181() throws IOException {
        this.field1760 = 0;
        if (this.field1752 != this.field1750) {
            this.field1759.method2185(this.field1752);
            this.field1750 = this.field1752;
        }
        this.field1751 = this.field1752;
        while (this.field1760 < this.field1756.length) {
            int var1 = this.field1759.method2198(this.field1756, this.field1760, this.field1756.length - this.field1760);
            if (var1 == -1) {
                break;
            }
            this.field1750 += (long) var1;
            this.field1760 += var1;
        }
    }

    @ObfuscatedName("dy.p([BIIB)V")
    public void method2171(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1752 + (long) arg2 > this.field1758) {
                this.field1758 = this.field1752 + (long) arg2;
            }
            if (this.field1754 != -1L && (this.field1752 < this.field1754 || this.field1752 > this.field1754 + (long) this.field1755)) {
                this.method2162();
            }
            if (this.field1754 != -1L && this.field1752 + (long) arg2 > this.field1754 + (long) this.field1753.length) {
                int var4 = (int) ((long) this.field1753.length - (this.field1752 - this.field1754));
                System.arraycopy(arg0, arg1, this.field1753, (int) (this.field1752 - this.field1754), var4);
                this.field1752 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1755 = this.field1753.length;
                this.method2162();
            }
            if (arg2 > this.field1753.length) {
                if (this.field1752 != this.field1750) {
                    this.field1759.method2185(this.field1752);
                    this.field1750 = this.field1752;
                }
                this.field1759.method2208(arg0, arg1, arg2);
                this.field1750 += (long) arg2;
                if (this.field1750 > this.field1757) {
                    this.field1757 = this.field1750;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1752 >= this.field1751 && this.field1752 < this.field1751 + (long) this.field1760) {
                    var5 = this.field1752;
                } else if (this.field1751 >= this.field1752 && this.field1751 < this.field1752 + (long) arg2) {
                    var5 = this.field1751;
                }
                if (this.field1752 + (long) arg2 > this.field1751 && this.field1752 + (long) arg2 <= this.field1751 + (long) this.field1760) {
                    var7 = this.field1752 + (long) arg2;
                } else if (this.field1751 + (long) this.field1760 > this.field1752 && this.field1751 + (long) this.field1760 <= this.field1752 + (long) arg2) {
                    var7 = this.field1751 + (long) this.field1760;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1752), this.field1756, (int) (var5 - this.field1751), var9);
                }
                this.field1752 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1754 == -1L) {
                    this.field1754 = this.field1752;
                }
                System.arraycopy(arg0, arg1, this.field1753, (int) (this.field1752 - this.field1754), arg2);
                this.field1752 += (long) arg2;
                if (this.field1752 - this.field1754 > (long) this.field1755) {
                    this.field1755 = (int) (this.field1752 - this.field1754);
                }
            }
        } catch (IOException var11) {
            this.field1750 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dy.d(I)V")
    public void method2162() throws IOException {
        if (this.field1754 == -1L) {
            return;
        }
        if (this.field1754 != this.field1750) {
            this.field1759.method2185(this.field1754);
            this.field1750 = this.field1754;
        }
        this.field1759.method2208(this.field1753, 0, this.field1755);
        this.field1750 += (long) (this.field1755 * -847513395) * 1748284421L;
        if (this.field1750 > this.field1757) {
            this.field1757 = this.field1750;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1754 >= this.field1751 && this.field1754 < this.field1751 + (long) this.field1760) {
            var1 = this.field1754;
        } else if (this.field1751 >= this.field1754 && this.field1751 < this.field1754 + (long) this.field1755) {
            var1 = this.field1751;
        }
        if (this.field1754 + (long) this.field1755 > this.field1751 && this.field1754 + (long) this.field1755 <= this.field1751 + (long) this.field1760) {
            var3 = this.field1754 + (long) this.field1755;
        } else if (this.field1751 + (long) this.field1760 > this.field1754 && this.field1751 + (long) this.field1760 <= this.field1754 + (long) this.field1755) {
            var3 = this.field1751 + (long) this.field1760;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1753, (int) (var1 - this.field1754), this.field1756, (int) (var1 - this.field1751), var5);
        }
        this.field1754 = -1L;
        this.field1755 = 0;
    }
}
