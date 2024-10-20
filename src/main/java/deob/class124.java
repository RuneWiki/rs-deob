package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dg")
public class class124 {

    @ObfuscatedName("dg.a")
    public class125 field1742;

    @ObfuscatedName("dg.j")
    public byte[] field1741;

    @ObfuscatedName("dg.n")
    public long field1740 = -1L;

    @ObfuscatedName("dg.r")
    public int field1743;

    @ObfuscatedName("dg.v")
    public byte[] field1744;

    @ObfuscatedName("dg.e")
    public long field1752 = -1L;

    @ObfuscatedName("dg.l")
    public int field1746 = 0;

    @ObfuscatedName("dg.s")
    public long field1747;

    @ObfuscatedName("dg.w")
    public long field1745;

    @ObfuscatedName("dg.p")
    public long field1749;

    @ObfuscatedName("dg.m")
    public long field1750;

    public class124(class125 arg0, int arg1, int arg2) throws IOException {
        this.field1742 = arg0;
        this.field1749 = this.field1745 = arg0.method2133();
        this.field1741 = new byte[arg1];
        this.field1744 = new byte[arg2];
        this.field1747 = 0L;
    }

    @ObfuscatedName("dg.a(I)V")
    public void method2106() throws IOException {
        this.method2122();
        this.field1742.method2129();
    }

    @ObfuscatedName("dg.j(J)V")
    public void method2107(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1747 = arg0;
    }

    @ObfuscatedName("dg.n(I)J")
    public long method2108() {
        return this.field1749;
    }

    @ObfuscatedName("dg.r([BB)V")
    public void method2109(byte[] arg0) throws IOException {
        this.method2115(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dg.v([BIII)V")
    public void method2115(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1752 != -1L && this.field1747 >= this.field1752 && this.field1747 + (long) arg2 <= this.field1752 + (long) this.field1746) {
                System.arraycopy(this.field1744, (int) (this.field1747 - this.field1752), arg0, arg1, arg2);
                this.field1747 += (long) arg2;
                return;
            }
            long var4 = this.field1747;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1747 >= this.field1740 && this.field1747 < this.field1740 + (long) this.field1743) {
                int var8 = (int) ((long) this.field1743 - (this.field1747 - this.field1740));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1741, (int) (this.field1747 - this.field1740), arg0, arg1, var8);
                this.field1747 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1741.length) {
                this.field1742.method2130(this.field1747);
                this.field1750 = this.field1747;
                while (arg2 > 0) {
                    int var9 = this.field1742.method2134(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1750 += (long) var9;
                    this.field1747 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2110();
                int var10 = arg2;
                if (arg2 > this.field1743) {
                    var10 = this.field1743;
                }
                System.arraycopy(this.field1741, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1747 += (long) var10;
            }
            if (this.field1752 != -1L) {
                if (this.field1752 > this.field1747 && arg2 > 0) {
                    int var11 = (int) (this.field1752 - this.field1747) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1747++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1752 >= var4 && this.field1752 < (long) var7 + var4) {
                    var12 = this.field1752;
                } else if (var4 >= this.field1752 && var4 < this.field1752 + (long) this.field1746) {
                    var12 = var4;
                }
                if (this.field1752 + (long) this.field1746 > var4 && this.field1752 + (long) this.field1746 <= (long) var7 + var4) {
                    var14 = this.field1752 + (long) this.field1746;
                } else if ((long) var7 + var4 > this.field1752 && (long) var7 + var4 <= this.field1752 + (long) this.field1746) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1744, (int) (var12 - this.field1752), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1747) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1747));
                        this.field1747 = var14;
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

    @ObfuscatedName("dg.e(B)V")
    public void method2110() throws IOException {
        this.field1743 = 0;
        if (this.field1750 != this.field1747) {
            this.field1742.method2130(this.field1747);
            this.field1750 = this.field1747;
        }
        this.field1740 = this.field1747;
        while (this.field1743 < this.field1741.length) {
            int var1 = this.field1742.method2134(this.field1741, this.field1743, this.field1741.length - this.field1743);
            if (var1 == -1) {
                break;
            }
            this.field1750 += (long) var1;
            this.field1743 += var1;
        }
    }

    @ObfuscatedName("dg.l([BIII)V")
    public void method2111(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1747 + (long) arg2 > this.field1749) {
                this.field1749 = this.field1747 + (long) arg2;
            }
            if (this.field1752 != -1L && (this.field1747 < this.field1752 || this.field1747 > this.field1752 + (long) this.field1746)) {
                this.method2122();
            }
            if (this.field1752 != -1L && this.field1747 + (long) arg2 > this.field1752 + (long) this.field1744.length) {
                int var4 = (int) ((long) this.field1744.length - (this.field1747 - this.field1752));
                System.arraycopy(arg0, arg1, this.field1744, (int) (this.field1747 - this.field1752), var4);
                this.field1747 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1746 = this.field1744.length;
                this.method2122();
            }
            if (arg2 > this.field1744.length) {
                if (this.field1750 != this.field1747) {
                    this.field1742.method2130(this.field1747);
                    this.field1750 = this.field1747;
                }
                this.field1742.method2131(arg0, arg1, arg2);
                this.field1750 += (long) arg2;
                if (this.field1750 > this.field1745) {
                    this.field1745 = this.field1750;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1747 >= this.field1740 && this.field1747 < this.field1740 + (long) this.field1743) {
                    var5 = this.field1747;
                } else if (this.field1740 >= this.field1747 && this.field1740 < this.field1747 + (long) arg2) {
                    var5 = this.field1740;
                }
                if (this.field1747 + (long) arg2 > this.field1740 && this.field1747 + (long) arg2 <= this.field1740 + (long) this.field1743) {
                    var7 = this.field1747 + (long) arg2;
                } else if (this.field1740 + (long) this.field1743 > this.field1747 && this.field1740 + (long) this.field1743 <= this.field1747 + (long) arg2) {
                    var7 = this.field1740 + (long) this.field1743;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1747), this.field1741, (int) (var5 - this.field1740), var9);
                }
                this.field1747 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1752 == -1L) {
                    this.field1752 = this.field1747;
                }
                System.arraycopy(arg0, arg1, this.field1744, (int) (this.field1747 - this.field1752), arg2);
                this.field1747 += (long) arg2;
                if (this.field1747 - this.field1752 > (long) this.field1746) {
                    this.field1746 = (int) (this.field1747 - this.field1752);
                }
            }
        } catch (IOException var11) {
            this.field1750 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dg.s(B)V")
    public void method2122() throws IOException {
        if (this.field1752 == -1L) {
            return;
        }
        if (this.field1752 != this.field1750) {
            this.field1742.method2130(this.field1752);
            this.field1750 = this.field1752;
        }
        this.field1742.method2131(this.field1744, 0, this.field1746);
        this.field1750 += (long) (this.field1746 * -344585653) * -1032130717L;
        if (this.field1750 > this.field1745) {
            this.field1745 = this.field1750;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1752 >= this.field1740 && this.field1752 < this.field1740 + (long) this.field1743) {
            var1 = this.field1752;
        } else if (this.field1740 >= this.field1752 && this.field1740 < this.field1752 + (long) this.field1746) {
            var1 = this.field1740;
        }
        if (this.field1752 + (long) this.field1746 > this.field1740 && this.field1752 + (long) this.field1746 <= this.field1740 + (long) this.field1743) {
            var3 = this.field1752 + (long) this.field1746;
        } else if (this.field1740 + (long) this.field1743 > this.field1752 && this.field1740 + (long) this.field1743 <= this.field1752 + (long) this.field1746) {
            var3 = this.field1740 + (long) this.field1743;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1744, (int) (var1 - this.field1752), this.field1741, (int) (var1 - this.field1740), var5);
        }
        this.field1752 = -1L;
        this.field1746 = 0;
    }
}
