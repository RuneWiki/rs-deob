package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dz")
public class class122 {

    @ObfuscatedName("dz.d")
    public class123 field1750;

    @ObfuscatedName("dz.k")
    public byte[] field1740;

    @ObfuscatedName("dz.e")
    public long field1741 = -1L;

    @ObfuscatedName("dz.p")
    public int field1742;

    @ObfuscatedName("dz.q")
    public byte[] field1743;

    @ObfuscatedName("dz.s")
    public long field1744 = -1L;

    @ObfuscatedName("dz.r")
    public int field1739 = 0;

    @ObfuscatedName("dz.g")
    public long field1746;

    @ObfuscatedName("dz.v")
    public long field1747;

    @ObfuscatedName("dz.t")
    public long field1748;

    @ObfuscatedName("dz.y")
    public long field1749;

    public class122(class123 arg0, int arg1, int arg2) throws IOException {
        this.field1750 = arg0;
        this.field1748 = this.field1747 = arg0.method2216();
        this.field1740 = new byte[arg1];
        this.field1743 = new byte[arg2];
        this.field1746 = 0L;
    }

    @ObfuscatedName("dz.d(I)V")
    public void method2180() throws IOException {
        this.method2187();
        this.field1750.method2234();
    }

    @ObfuscatedName("dz.k(J)V")
    public void method2181(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1746 = arg0;
    }

    @ObfuscatedName("dz.e(I)J")
    public long method2182() {
        return this.field1748;
    }

    @ObfuscatedName("dz.p([BI)V")
    public void method2183(byte[] arg0) throws IOException {
        this.method2196(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dz.q([BIII)V")
    public void method2196(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1744 != -1L && this.field1746 >= this.field1744 && this.field1746 + (long) arg2 <= this.field1744 + (long) this.field1739) {
                System.arraycopy(this.field1743, (int) (this.field1746 - this.field1744), arg0, arg1, arg2);
                this.field1746 += (long) arg2;
                return;
            }
            long var4 = this.field1746;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1746 >= this.field1741 && this.field1746 < this.field1741 + (long) this.field1742) {
                int var8 = (int) ((long) this.field1742 - (this.field1746 - this.field1741));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1740, (int) (this.field1746 - this.field1741), arg0, arg1, var8);
                this.field1746 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1740.length) {
                this.field1750.method2217(this.field1746);
                this.field1749 = this.field1746;
                while (arg2 > 0) {
                    int var9 = this.field1750.method2224(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1749 += (long) var9;
                    this.field1746 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2210();
                int var10 = arg2;
                if (arg2 > this.field1742) {
                    var10 = this.field1742;
                }
                System.arraycopy(this.field1740, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1746 += (long) var10;
            }
            if (this.field1744 != -1L) {
                if (this.field1744 > this.field1746 && arg2 > 0) {
                    int var11 = (int) (this.field1744 - this.field1746) + arg1;
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
                if (this.field1744 >= var4 && this.field1744 < (long) var7 + var4) {
                    var12 = this.field1744;
                } else if (var4 >= this.field1744 && var4 < this.field1744 + (long) this.field1739) {
                    var12 = var4;
                }
                if (this.field1744 + (long) this.field1739 > var4 && this.field1744 + (long) this.field1739 <= (long) var7 + var4) {
                    var14 = this.field1744 + (long) this.field1739;
                } else if ((long) var7 + var4 > this.field1744 && (long) var7 + var4 <= this.field1744 + (long) this.field1739) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1743, (int) (var12 - this.field1744), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1746) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1746));
                        this.field1746 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1749 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dz.s(B)V")
    public void method2210() throws IOException {
        this.field1742 = 0;
        if (this.field1749 != this.field1746) {
            this.field1750.method2217(this.field1746);
            this.field1749 = this.field1746;
        }
        this.field1741 = this.field1746;
        while (this.field1742 < this.field1740.length) {
            int var1 = this.field1750.method2224(this.field1740, this.field1742, this.field1740.length - this.field1742);
            if (var1 == -1) {
                break;
            }
            this.field1749 += (long) var1;
            this.field1742 += var1;
        }
    }

    @ObfuscatedName("dz.r([BIII)V")
    public void method2186(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1746 + (long) arg2 > this.field1748) {
                this.field1748 = this.field1746 + (long) arg2;
            }
            if (this.field1744 != -1L && (this.field1746 < this.field1744 || this.field1746 > this.field1744 + (long) this.field1739)) {
                this.method2187();
            }
            if (this.field1744 != -1L && this.field1746 + (long) arg2 > this.field1744 + (long) this.field1743.length) {
                int var4 = (int) ((long) this.field1743.length - (this.field1746 - this.field1744));
                System.arraycopy(arg0, arg1, this.field1743, (int) (this.field1746 - this.field1744), var4);
                this.field1746 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1739 = this.field1743.length;
                this.method2187();
            }
            if (arg2 > this.field1743.length) {
                if (this.field1749 != this.field1746) {
                    this.field1750.method2217(this.field1746);
                    this.field1749 = this.field1746;
                }
                this.field1750.method2213(arg0, arg1, arg2);
                this.field1749 += (long) arg2;
                if (this.field1749 > this.field1747) {
                    this.field1747 = this.field1749;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1746 >= this.field1741 && this.field1746 < this.field1741 + (long) this.field1742) {
                    var5 = this.field1746;
                } else if (this.field1741 >= this.field1746 && this.field1741 < this.field1746 + (long) arg2) {
                    var5 = this.field1741;
                }
                if (this.field1746 + (long) arg2 > this.field1741 && this.field1746 + (long) arg2 <= this.field1741 + (long) this.field1742) {
                    var7 = this.field1746 + (long) arg2;
                } else if (this.field1741 + (long) this.field1742 > this.field1746 && this.field1741 + (long) this.field1742 <= this.field1746 + (long) arg2) {
                    var7 = this.field1741 + (long) this.field1742;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1746), this.field1740, (int) (var5 - this.field1741), var9);
                }
                this.field1746 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1744 == -1L) {
                    this.field1744 = this.field1746;
                }
                System.arraycopy(arg0, arg1, this.field1743, (int) (this.field1746 - this.field1744), arg2);
                this.field1746 += (long) arg2;
                if (this.field1746 - this.field1744 > (long) this.field1739) {
                    this.field1739 = (int) (this.field1746 - this.field1744);
                }
            }
        } catch (IOException var11) {
            this.field1749 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dz.g(I)V")
    public void method2187() throws IOException {
        if (this.field1744 == -1L) {
            return;
        }
        if (this.field1749 != this.field1744) {
            this.field1750.method2217(this.field1744);
            this.field1749 = this.field1744;
        }
        this.field1750.method2213(this.field1743, 0, this.field1739);
        this.field1749 += (long) (this.field1739 * -89659553) * 1548235935L;
        if (this.field1749 > this.field1747) {
            this.field1747 = this.field1749;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1744 >= this.field1741 && this.field1744 < this.field1741 + (long) this.field1742) {
            var1 = this.field1744;
        } else if (this.field1741 >= this.field1744 && this.field1741 < this.field1744 + (long) this.field1739) {
            var1 = this.field1741;
        }
        if (this.field1744 + (long) this.field1739 > this.field1741 && this.field1744 + (long) this.field1739 <= this.field1741 + (long) this.field1742) {
            var3 = this.field1744 + (long) this.field1739;
        } else if (this.field1741 + (long) this.field1742 > this.field1744 && this.field1741 + (long) this.field1742 <= this.field1744 + (long) this.field1739) {
            var3 = this.field1741 + (long) this.field1742;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1743, (int) (var1 - this.field1744), this.field1740, (int) (var1 - this.field1741), var5);
        }
        this.field1744 = -1L;
        this.field1739 = 0;
    }
}
