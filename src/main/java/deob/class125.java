package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("do")
public class class125 {

    @ObfuscatedName("do.e")
    public class126 field1743;

    @ObfuscatedName("do.n")
    public byte[] field1741;

    @ObfuscatedName("do.g")
    public long field1742 = -1L;

    @ObfuscatedName("do.y")
    public int field1748;

    @ObfuscatedName("do.w")
    public byte[] field1744;

    @ObfuscatedName("do.k")
    public long field1745 = -1L;

    @ObfuscatedName("do.v")
    public int field1746 = 0;

    @ObfuscatedName("do.z")
    public long field1750;

    @ObfuscatedName("do.r")
    public long field1747;

    @ObfuscatedName("do.u")
    public long field1749;

    @ObfuscatedName("do.d")
    public long field1740;

    public class125(class126 arg0, int arg1, int arg2) throws IOException {
        this.field1743 = arg0;
        this.field1749 = this.field1747 = arg0.method2178();
        this.field1741 = new byte[arg1];
        this.field1744 = new byte[arg2];
        this.field1750 = 0L;
    }

    @ObfuscatedName("do.e(I)V")
    public void method2158() throws IOException {
        this.method2148();
        this.field1743.method2187();
    }

    @ObfuscatedName("do.n(J)V")
    public void method2149(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1750 = arg0;
    }

    @ObfuscatedName("do.g(I)J")
    public long method2147() {
        return this.field1749;
    }

    @ObfuscatedName("do.y([BB)V")
    public void method2150(byte[] arg0) throws IOException {
        this.method2151(arg0, 0, arg0.length);
    }

    @ObfuscatedName("do.w([BIIB)V")
    public void method2151(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1745 != -1L && this.field1750 >= this.field1745 && this.field1750 + (long) arg2 <= this.field1745 + (long) this.field1746) {
                System.arraycopy(this.field1744, (int) (this.field1750 - this.field1745), arg0, arg1, arg2);
                this.field1750 += (long) arg2;
                return;
            }
            long var4 = this.field1750;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1750 >= this.field1742 && this.field1750 < this.field1742 + (long) this.field1748) {
                int var8 = (int) ((long) this.field1748 - (this.field1750 - this.field1742));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1741, (int) (this.field1750 - this.field1742), arg0, arg1, var8);
                this.field1750 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1741.length) {
                this.field1743.method2186(this.field1750);
                this.field1740 = this.field1750;
                while (arg2 > 0) {
                    int var9 = this.field1743.method2177(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1740 += (long) var9;
                    this.field1750 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2166();
                int var10 = arg2;
                if (arg2 > this.field1748) {
                    var10 = this.field1748;
                }
                System.arraycopy(this.field1741, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1750 += (long) var10;
            }
            if (this.field1745 != -1L) {
                if (this.field1745 > this.field1750 && arg2 > 0) {
                    int var11 = (int) (this.field1745 - this.field1750) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1750++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1745 >= var4 && this.field1745 < (long) var7 + var4) {
                    var12 = this.field1745;
                } else if (var4 >= this.field1745 && var4 < this.field1745 + (long) this.field1746) {
                    var12 = var4;
                }
                if (this.field1745 + (long) this.field1746 > var4 && this.field1745 + (long) this.field1746 <= (long) var7 + var4) {
                    var14 = this.field1745 + (long) this.field1746;
                } else if ((long) var7 + var4 > this.field1745 && (long) var7 + var4 <= this.field1745 + (long) this.field1746) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1744, (int) (var12 - this.field1745), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1750) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1750));
                        this.field1750 = var14;
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

    @ObfuscatedName("do.k(I)V")
    public void method2166() throws IOException {
        this.field1748 = 0;
        if (this.field1750 != this.field1740) {
            this.field1743.method2186(this.field1750);
            this.field1740 = this.field1750;
        }
        this.field1742 = this.field1750;
        while (this.field1748 < this.field1741.length) {
            int var1 = this.field1743.method2177(this.field1741, this.field1748, this.field1741.length - this.field1748);
            if (var1 == -1) {
                break;
            }
            this.field1740 += (long) var1;
            this.field1748 += var1;
        }
    }

    @ObfuscatedName("do.v([BIIB)V")
    public void method2153(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1750 + (long) arg2 > this.field1749) {
                this.field1749 = this.field1750 + (long) arg2;
            }
            if (this.field1745 != -1L && (this.field1750 < this.field1745 || this.field1750 > this.field1745 + (long) this.field1746)) {
                this.method2148();
            }
            if (this.field1745 != -1L && this.field1750 + (long) arg2 > this.field1745 + (long) this.field1744.length) {
                int var4 = (int) ((long) this.field1744.length - (this.field1750 - this.field1745));
                System.arraycopy(arg0, arg1, this.field1744, (int) (this.field1750 - this.field1745), var4);
                this.field1750 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1746 = this.field1744.length;
                this.method2148();
            }
            if (arg2 > this.field1744.length) {
                if (this.field1750 != this.field1740) {
                    this.field1743.method2186(this.field1750);
                    this.field1740 = this.field1750;
                }
                this.field1743.method2175(arg0, arg1, arg2);
                this.field1740 += (long) arg2;
                if (this.field1740 > this.field1747) {
                    this.field1747 = this.field1740;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1750 >= this.field1742 && this.field1750 < this.field1742 + (long) this.field1748) {
                    var5 = this.field1750;
                } else if (this.field1742 >= this.field1750 && this.field1742 < this.field1750 + (long) arg2) {
                    var5 = this.field1742;
                }
                if (this.field1750 + (long) arg2 > this.field1742 && this.field1750 + (long) arg2 <= this.field1742 + (long) this.field1748) {
                    var7 = this.field1750 + (long) arg2;
                } else if (this.field1742 + (long) this.field1748 > this.field1750 && this.field1742 + (long) this.field1748 <= this.field1750 + (long) arg2) {
                    var7 = this.field1742 + (long) this.field1748;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1750), this.field1741, (int) (var5 - this.field1742), var9);
                }
                this.field1750 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1745 == -1L) {
                    this.field1745 = this.field1750;
                }
                System.arraycopy(arg0, arg1, this.field1744, (int) (this.field1750 - this.field1745), arg2);
                this.field1750 += (long) arg2;
                if (this.field1750 - this.field1745 > (long) this.field1746) {
                    this.field1746 = (int) (this.field1750 - this.field1745);
                }
            }
        } catch (IOException var11) {
            this.field1740 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("do.z(I)V")
    public void method2148() throws IOException {
        if (this.field1745 == -1L) {
            return;
        }
        if (this.field1745 != this.field1740) {
            this.field1743.method2186(this.field1745);
            this.field1740 = this.field1745;
        }
        this.field1743.method2175(this.field1744, 0, this.field1746);
        this.field1740 += (long) (this.field1746 * 667786469) * -1754087187L;
        if (this.field1740 > this.field1747) {
            this.field1747 = this.field1740;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1745 >= this.field1742 && this.field1745 < this.field1742 + (long) this.field1748) {
            var1 = this.field1745;
        } else if (this.field1742 >= this.field1745 && this.field1742 < this.field1745 + (long) this.field1746) {
            var1 = this.field1742;
        }
        if (this.field1745 + (long) this.field1746 > this.field1742 && this.field1745 + (long) this.field1746 <= this.field1742 + (long) this.field1748) {
            var3 = this.field1745 + (long) this.field1746;
        } else if (this.field1742 + (long) this.field1748 > this.field1745 && this.field1742 + (long) this.field1748 <= this.field1745 + (long) this.field1746) {
            var3 = this.field1742 + (long) this.field1748;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1744, (int) (var1 - this.field1745), this.field1741, (int) (var1 - this.field1742), var5);
        }
        this.field1745 = -1L;
        this.field1746 = 0;
    }
}
