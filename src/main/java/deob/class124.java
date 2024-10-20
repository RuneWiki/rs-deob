package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dj")
public class class124 {

    @ObfuscatedName("dj.i")
    public class125 field1741;

    @ObfuscatedName("dj.h")
    public byte[] field1739;

    @ObfuscatedName("dj.u")
    public long field1744 = -1L;

    @ObfuscatedName("dj.q")
    public int field1742;

    @ObfuscatedName("dj.g")
    public byte[] field1743;

    @ObfuscatedName("dj.v")
    public long field1750 = -1L;

    @ObfuscatedName("dj.t")
    public int field1745 = 0;

    @ObfuscatedName("dj.p")
    public long field1746;

    @ObfuscatedName("dj.l")
    public long field1747;

    @ObfuscatedName("dj.a")
    public long field1748;

    @ObfuscatedName("dj.k")
    public long field1740;

    public class124(class125 arg0, int arg1, int arg2) throws IOException {
        this.field1741 = arg0;
        this.field1748 = this.field1747 = arg0.method2170();
        this.field1739 = new byte[arg1];
        this.field1743 = new byte[arg2];
        this.field1746 = 0L;
    }

    @ObfuscatedName("dj.i(B)V")
    public void method2141() throws IOException {
        this.method2161();
        this.field1741.method2169();
    }

    @ObfuscatedName("dj.h(J)V")
    public void method2142(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1746 = arg0;
    }

    @ObfuscatedName("dj.u(I)J")
    public long method2158() {
        return this.field1748;
    }

    @ObfuscatedName("dj.q([BI)V")
    public void method2164(byte[] arg0) throws IOException {
        this.method2145(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dj.g([BIII)V")
    public void method2145(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1750 != -1L && this.field1746 >= this.field1750 && this.field1746 + (long) arg2 <= this.field1750 + (long) this.field1745) {
                System.arraycopy(this.field1743, (int) (this.field1746 - this.field1750), arg0, arg1, arg2);
                this.field1746 += (long) arg2;
                return;
            }
            long var4 = this.field1746;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1746 >= this.field1744 && this.field1746 < this.field1744 + (long) this.field1742) {
                int var8 = (int) ((long) this.field1742 - (this.field1746 - this.field1744));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1739, (int) (this.field1746 - this.field1744), arg0, arg1, var8);
                this.field1746 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1739.length) {
                this.field1741.method2167(this.field1746);
                this.field1740 = this.field1746;
                while (arg2 > 0) {
                    int var9 = this.field1741.method2171(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1740 += (long) var9;
                    this.field1746 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2146();
                int var10 = arg2;
                if (arg2 > this.field1742) {
                    var10 = this.field1742;
                }
                System.arraycopy(this.field1739, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1746 += (long) var10;
            }
            if (this.field1750 != -1L) {
                if (this.field1750 > this.field1746 && arg2 > 0) {
                    int var11 = (int) (this.field1750 - this.field1746) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1746++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1750 >= var4 && this.field1750 < (long) var7 + var4) {
                    var12 = this.field1750;
                } else if (var4 >= this.field1750 && var4 < this.field1750 + (long) this.field1745) {
                    var12 = var4;
                }
                if (this.field1750 + (long) this.field1745 > var4 && this.field1750 + (long) this.field1745 <= (long) var7 + var4) {
                    var14 = this.field1750 + (long) this.field1745;
                } else if ((long) var7 + var4 > this.field1750 && (long) var7 + var4 <= this.field1750 + (long) this.field1745) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1743, (int) (var12 - this.field1750), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1746) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1746));
                        this.field1746 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1740 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dj.v(I)V")
    public void method2146() throws IOException {
        this.field1742 = 0;
        if (this.field1746 != this.field1740) {
            this.field1741.method2167(this.field1746);
            this.field1740 = this.field1746;
        }
        this.field1744 = this.field1746;
        while (this.field1742 < this.field1739.length) {
            int var1 = this.field1741.method2171(this.field1739, this.field1742, this.field1739.length - this.field1742);
            if (var1 == -1) {
                break;
            }
            this.field1740 += (long) var1;
            this.field1742 += var1;
        }
    }

    @ObfuscatedName("dj.t([BIII)V")
    public void method2140(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1746 + (long) arg2 > this.field1748) {
                this.field1748 = this.field1746 + (long) arg2;
            }
            if (this.field1750 != -1L && (this.field1746 < this.field1750 || this.field1746 > this.field1750 + (long) this.field1745)) {
                this.method2161();
            }
            if (this.field1750 != -1L && this.field1746 + (long) arg2 > this.field1750 + (long) this.field1743.length) {
                int var4 = (int) ((long) this.field1743.length - (this.field1746 - this.field1750));
                System.arraycopy(arg0, arg1, this.field1743, (int) (this.field1746 - this.field1750), var4);
                this.field1746 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1745 = this.field1743.length;
                this.method2161();
            }
            if (arg2 > this.field1743.length) {
                if (this.field1746 != this.field1740) {
                    this.field1741.method2167(this.field1746);
                    this.field1740 = this.field1746;
                }
                this.field1741.method2168(arg0, arg1, arg2);
                this.field1740 += (long) arg2;
                if (this.field1740 > this.field1747) {
                    this.field1747 = this.field1740;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1746 >= this.field1744 && this.field1746 < this.field1744 + (long) this.field1742) {
                    var5 = this.field1746;
                } else if (this.field1744 >= this.field1746 && this.field1744 < this.field1746 + (long) arg2) {
                    var5 = this.field1744;
                }
                if (this.field1746 + (long) arg2 > this.field1744 && this.field1746 + (long) arg2 <= this.field1744 + (long) this.field1742) {
                    var7 = this.field1746 + (long) arg2;
                } else if (this.field1744 + (long) this.field1742 > this.field1746 && this.field1744 + (long) this.field1742 <= this.field1746 + (long) arg2) {
                    var7 = this.field1744 + (long) this.field1742;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1746), this.field1739, (int) (var5 - this.field1744), var9);
                }
                this.field1746 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1750 == -1L) {
                    this.field1750 = this.field1746;
                }
                System.arraycopy(arg0, arg1, this.field1743, (int) (this.field1746 - this.field1750), arg2);
                this.field1746 += (long) arg2;
                if (this.field1746 - this.field1750 > (long) this.field1745) {
                    this.field1745 = (int) (this.field1746 - this.field1750);
                }
            }
        } catch (IOException var11) {
            this.field1740 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dj.p(B)V")
    public void method2161() throws IOException {
        if (this.field1750 == -1L) {
            return;
        }
        if (this.field1750 != this.field1740) {
            this.field1741.method2167(this.field1750);
            this.field1740 = this.field1750;
        }
        this.field1741.method2168(this.field1743, 0, this.field1745);
        this.field1740 += (long) (this.field1745 * 1448773785) * 2035239849L;
        if (this.field1740 > this.field1747) {
            this.field1747 = this.field1740;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1750 >= this.field1744 && this.field1750 < this.field1744 + (long) this.field1742) {
            var1 = this.field1750;
        } else if (this.field1744 >= this.field1750 && this.field1744 < this.field1750 + (long) this.field1745) {
            var1 = this.field1744;
        }
        if (this.field1750 + (long) this.field1745 > this.field1744 && this.field1750 + (long) this.field1745 <= this.field1744 + (long) this.field1742) {
            var3 = this.field1750 + (long) this.field1745;
        } else if (this.field1744 + (long) this.field1742 > this.field1750 && this.field1744 + (long) this.field1742 <= this.field1750 + (long) this.field1745) {
            var3 = this.field1744 + (long) this.field1742;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1743, (int) (var1 - this.field1750), this.field1739, (int) (var1 - this.field1744), var5);
        }
        this.field1750 = -1L;
        this.field1745 = 0;
    }
}
