package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dl")
public class class123 {

    @ObfuscatedName("dl.d")
    public class124 field1676;

    @ObfuscatedName("dl.x")
    public byte[] field1669;

    @ObfuscatedName("dl.k")
    public long field1681 = -1L;

    @ObfuscatedName("dl.z")
    public int field1671;

    @ObfuscatedName("dl.v")
    public byte[] field1672;

    @ObfuscatedName("dl.m")
    public long field1673 = -1L;

    @ObfuscatedName("dl.b")
    public int field1677 = 0;

    @ObfuscatedName("dl.t")
    public long field1675;

    @ObfuscatedName("dl.p")
    public long field1670;

    @ObfuscatedName("dl.r")
    public long field1674;

    @ObfuscatedName("dl.l")
    public long field1678;

    public class123(class124 arg0, int arg1, int arg2) throws IOException {
        this.field1676 = arg0;
        this.field1674 = this.field1670 = arg0.method2242();
        this.field1669 = new byte[arg1];
        this.field1672 = new byte[arg2];
        this.field1675 = 0L;
    }

    @ObfuscatedName("dl.d(B)V")
    public void method2211() throws IOException {
        this.method2218();
        this.field1676.method2240();
    }

    @ObfuscatedName("dl.x(J)V")
    public void method2236(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1675 = arg0;
    }

    @ObfuscatedName("dl.k(B)J")
    public long method2213() {
        return this.field1674;
    }

    @ObfuscatedName("dl.z([BB)V")
    public void method2214(byte[] arg0) throws IOException {
        this.method2215(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dl.v([BIII)V")
    public void method2215(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1673 != -1L && this.field1675 >= this.field1673 && this.field1675 + (long) arg2 <= this.field1673 + (long) this.field1677) {
                System.arraycopy(this.field1672, (int) (this.field1675 - this.field1673), arg0, arg1, arg2);
                this.field1675 += (long) arg2;
                return;
            }
            long var4 = this.field1675;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1675 >= this.field1681 && this.field1675 < this.field1681 + (long) this.field1671) {
                int var8 = (int) ((long) this.field1671 - (this.field1675 - this.field1681));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1669, (int) (this.field1675 - this.field1681), arg0, arg1, var8);
                this.field1675 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1669.length) {
                this.field1676.method2238(this.field1675);
                this.field1678 = this.field1675;
                while (arg2 > 0) {
                    int var9 = this.field1676.method2243(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1678 += (long) var9;
                    this.field1675 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2216();
                int var10 = arg2;
                if (arg2 > this.field1671) {
                    var10 = this.field1671;
                }
                System.arraycopy(this.field1669, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1675 += (long) var10;
            }
            if (this.field1673 != -1L) {
                if (this.field1673 > this.field1675 && arg2 > 0) {
                    int var11 = (int) (this.field1673 - this.field1675) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1675++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1673 >= var4 && this.field1673 < (long) var7 + var4) {
                    var12 = this.field1673;
                } else if (var4 >= this.field1673 && var4 < this.field1673 + (long) this.field1677) {
                    var12 = var4;
                }
                if (this.field1673 + (long) this.field1677 > var4 && this.field1673 + (long) this.field1677 <= (long) var7 + var4) {
                    var14 = this.field1673 + (long) this.field1677;
                } else if ((long) var7 + var4 > this.field1673 && (long) var7 + var4 <= this.field1673 + (long) this.field1677) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1672, (int) (var12 - this.field1673), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1675) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1675));
                        this.field1675 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1678 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dl.m(I)V")
    public void method2216() throws IOException {
        this.field1671 = 0;
        if (this.field1678 != this.field1675) {
            this.field1676.method2238(this.field1675);
            this.field1678 = this.field1675;
        }
        this.field1681 = this.field1675;
        while (this.field1671 < this.field1669.length) {
            int var1 = this.field1676.method2243(this.field1669, this.field1671, this.field1669.length - this.field1671);
            if (var1 == -1) {
                break;
            }
            this.field1678 += (long) var1;
            this.field1671 += var1;
        }
    }

    @ObfuscatedName("dl.b([BIII)V")
    public void method2217(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1675 + (long) arg2 > this.field1674) {
                this.field1674 = this.field1675 + (long) arg2;
            }
            if (this.field1673 != -1L && (this.field1675 < this.field1673 || this.field1675 > this.field1673 + (long) this.field1677)) {
                this.method2218();
            }
            if (this.field1673 != -1L && this.field1675 + (long) arg2 > this.field1673 + (long) this.field1672.length) {
                int var4 = (int) ((long) this.field1672.length - (this.field1675 - this.field1673));
                System.arraycopy(arg0, arg1, this.field1672, (int) (this.field1675 - this.field1673), var4);
                this.field1675 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1677 = this.field1672.length;
                this.method2218();
            }
            if (arg2 > this.field1672.length) {
                if (this.field1678 != this.field1675) {
                    this.field1676.method2238(this.field1675);
                    this.field1678 = this.field1675;
                }
                this.field1676.method2241(arg0, arg1, arg2);
                this.field1678 += (long) arg2;
                if (this.field1678 > this.field1670) {
                    this.field1670 = this.field1678;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1675 >= this.field1681 && this.field1675 < this.field1681 + (long) this.field1671) {
                    var5 = this.field1675;
                } else if (this.field1681 >= this.field1675 && this.field1681 < this.field1675 + (long) arg2) {
                    var5 = this.field1681;
                }
                if (this.field1675 + (long) arg2 > this.field1681 && this.field1675 + (long) arg2 <= this.field1681 + (long) this.field1671) {
                    var7 = this.field1675 + (long) arg2;
                } else if (this.field1681 + (long) this.field1671 > this.field1675 && this.field1681 + (long) this.field1671 <= this.field1675 + (long) arg2) {
                    var7 = this.field1681 + (long) this.field1671;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1675), this.field1669, (int) (var5 - this.field1681), var9);
                }
                this.field1675 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1673 == -1L) {
                    this.field1673 = this.field1675;
                }
                System.arraycopy(arg0, arg1, this.field1672, (int) (this.field1675 - this.field1673), arg2);
                this.field1675 += (long) arg2;
                if (this.field1675 - this.field1673 > (long) this.field1677) {
                    this.field1677 = (int) (this.field1675 - this.field1673);
                }
            }
        } catch (IOException var11) {
            this.field1678 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dl.t(I)V")
    public void method2218() throws IOException {
        if (this.field1673 == -1L) {
            return;
        }
        if (this.field1678 != this.field1673) {
            this.field1676.method2238(this.field1673);
            this.field1678 = this.field1673;
        }
        this.field1676.method2241(this.field1672, 0, this.field1677);
        this.field1678 += (long) (this.field1677 * 1197595515) * 1774963635L;
        if (this.field1678 > this.field1670) {
            this.field1670 = this.field1678;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1673 >= this.field1681 && this.field1673 < this.field1681 + (long) this.field1671) {
            var1 = this.field1673;
        } else if (this.field1681 >= this.field1673 && this.field1681 < this.field1673 + (long) this.field1677) {
            var1 = this.field1681;
        }
        if (this.field1673 + (long) this.field1677 > this.field1681 && this.field1673 + (long) this.field1677 <= this.field1681 + (long) this.field1671) {
            var3 = this.field1673 + (long) this.field1677;
        } else if (this.field1681 + (long) this.field1671 > this.field1673 && this.field1681 + (long) this.field1671 <= this.field1673 + (long) this.field1677) {
            var3 = this.field1681 + (long) this.field1671;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1672, (int) (var1 - this.field1673), this.field1669, (int) (var1 - this.field1681), var5);
        }
        this.field1673 = -1L;
        this.field1677 = 0;
    }
}
