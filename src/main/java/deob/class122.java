package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dy")
public class class122 {

    @ObfuscatedName("dy.o")
    public class123 field1693;

    @ObfuscatedName("dy.k")
    public byte[] field1702;

    @ObfuscatedName("dy.t")
    public long field1695 = -1L;

    @ObfuscatedName("dy.d")
    public int field1694;

    @ObfuscatedName("dy.h")
    public byte[] field1697;

    @ObfuscatedName("dy.m")
    public long field1698 = -1L;

    @ObfuscatedName("dy.z")
    public int field1699 = 0;

    @ObfuscatedName("dy.i")
    public long field1700;

    @ObfuscatedName("dy.u")
    public long field1701;

    @ObfuscatedName("dy.x")
    public long field1696;

    @ObfuscatedName("dy.y")
    public long field1703;

    public class122(class123 arg0, int arg1, int arg2) throws IOException {
        this.field1693 = arg0;
        this.field1696 = this.field1701 = arg0.method2324();
        this.field1702 = new byte[arg1];
        this.field1697 = new byte[arg2];
        this.field1700 = 0L;
    }

    @ObfuscatedName("dy.o(B)V")
    public void method2293() throws IOException {
        this.method2298();
        this.field1693.method2326();
    }

    @ObfuscatedName("dy.k(J)V")
    public void method2294(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1700 = arg0;
    }

    @ObfuscatedName("dy.t(I)J")
    public long method2308() {
        return this.field1696;
    }

    @ObfuscatedName("dy.d([BI)V")
    public void method2299(byte[] arg0) throws IOException {
        this.method2311(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dy.h([BIII)V")
    public void method2311(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1698 != -1L && this.field1700 >= this.field1698 && this.field1700 + (long) arg2 <= this.field1698 + (long) this.field1699) {
                System.arraycopy(this.field1697, (int) (this.field1700 - this.field1698), arg0, arg1, arg2);
                this.field1700 += (long) arg2;
                return;
            }
            long var4 = this.field1700;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1700 >= this.field1695 && this.field1700 < this.field1695 + (long) this.field1694) {
                int var8 = (int) ((long) this.field1694 - (this.field1700 - this.field1695));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1702, (int) (this.field1700 - this.field1695), arg0, arg1, var8);
                this.field1700 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1702.length) {
                this.field1693.method2335(this.field1700);
                this.field1703 = this.field1700;
                while (arg2 > 0) {
                    int var9 = this.field1693.method2325(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1703 += (long) var9;
                    this.field1700 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2295();
                int var10 = arg2;
                if (arg2 > this.field1694) {
                    var10 = this.field1694;
                }
                System.arraycopy(this.field1702, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1700 += (long) var10;
            }
            if (this.field1698 != -1L) {
                if (this.field1698 > this.field1700 && arg2 > 0) {
                    int var11 = (int) (this.field1698 - this.field1700) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1700++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1698 >= var4 && this.field1698 < (long) var7 + var4) {
                    var12 = this.field1698;
                } else if (var4 >= this.field1698 && var4 < this.field1698 + (long) this.field1699) {
                    var12 = var4;
                }
                if (this.field1698 + (long) this.field1699 > var4 && this.field1698 + (long) this.field1699 <= (long) var7 + var4) {
                    var14 = this.field1698 + (long) this.field1699;
                } else if ((long) var7 + var4 > this.field1698 && (long) var7 + var4 <= this.field1698 + (long) this.field1699) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1697, (int) (var12 - this.field1698), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1700) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1700));
                        this.field1700 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1703 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dy.m(I)V")
    public void method2295() throws IOException {
        this.field1694 = 0;
        if (this.field1703 != this.field1700) {
            this.field1693.method2335(this.field1700);
            this.field1703 = this.field1700;
        }
        this.field1695 = this.field1700;
        while (this.field1694 < this.field1702.length) {
            int var1 = this.field1693.method2325(this.field1702, this.field1694, this.field1702.length - this.field1694);
            if (var1 == -1) {
                break;
            }
            this.field1703 += (long) var1;
            this.field1694 += var1;
        }
    }

    @ObfuscatedName("dy.z([BIII)V")
    public void method2296(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1700 + (long) arg2 > this.field1696) {
                this.field1696 = this.field1700 + (long) arg2;
            }
            if (this.field1698 != -1L && (this.field1700 < this.field1698 || this.field1700 > this.field1698 + (long) this.field1699)) {
                this.method2298();
            }
            if (this.field1698 != -1L && this.field1700 + (long) arg2 > this.field1698 + (long) this.field1697.length) {
                int var4 = (int) ((long) this.field1697.length - (this.field1700 - this.field1698));
                System.arraycopy(arg0, arg1, this.field1697, (int) (this.field1700 - this.field1698), var4);
                this.field1700 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1699 = this.field1697.length;
                this.method2298();
            }
            if (arg2 > this.field1697.length) {
                if (this.field1703 != this.field1700) {
                    this.field1693.method2335(this.field1700);
                    this.field1703 = this.field1700;
                }
                this.field1693.method2319(arg0, arg1, arg2);
                this.field1703 += (long) arg2;
                if (this.field1703 > this.field1701) {
                    this.field1701 = this.field1703;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1700 >= this.field1695 && this.field1700 < this.field1695 + (long) this.field1694) {
                    var5 = this.field1700;
                } else if (this.field1695 >= this.field1700 && this.field1695 < this.field1700 + (long) arg2) {
                    var5 = this.field1695;
                }
                if (this.field1700 + (long) arg2 > this.field1695 && this.field1700 + (long) arg2 <= this.field1695 + (long) this.field1694) {
                    var7 = this.field1700 + (long) arg2;
                } else if (this.field1695 + (long) this.field1694 > this.field1700 && this.field1695 + (long) this.field1694 <= this.field1700 + (long) arg2) {
                    var7 = this.field1695 + (long) this.field1694;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1700), this.field1702, (int) (var5 - this.field1695), var9);
                }
                this.field1700 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1698 == -1L) {
                    this.field1698 = this.field1700;
                }
                System.arraycopy(arg0, arg1, this.field1697, (int) (this.field1700 - this.field1698), arg2);
                this.field1700 += (long) arg2;
                if (this.field1700 - this.field1698 > (long) this.field1699) {
                    this.field1699 = (int) (this.field1700 - this.field1698);
                }
            }
        } catch (IOException var11) {
            this.field1703 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dy.i(I)V")
    public void method2298() throws IOException {
        if (this.field1698 == -1L) {
            return;
        }
        if (this.field1703 != this.field1698) {
            this.field1693.method2335(this.field1698);
            this.field1703 = this.field1698;
        }
        this.field1693.method2319(this.field1697, 0, this.field1699);
        this.field1703 += (long) (this.field1699 * 102222321) * 1514538769L;
        if (this.field1703 > this.field1701) {
            this.field1701 = this.field1703;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1698 >= this.field1695 && this.field1698 < this.field1695 + (long) this.field1694) {
            var1 = this.field1698;
        } else if (this.field1695 >= this.field1698 && this.field1695 < this.field1698 + (long) this.field1699) {
            var1 = this.field1695;
        }
        if (this.field1698 + (long) this.field1699 > this.field1695 && this.field1698 + (long) this.field1699 <= this.field1695 + (long) this.field1694) {
            var3 = this.field1698 + (long) this.field1699;
        } else if (this.field1695 + (long) this.field1694 > this.field1698 && this.field1695 + (long) this.field1694 <= this.field1698 + (long) this.field1699) {
            var3 = this.field1695 + (long) this.field1694;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1697, (int) (var1 - this.field1698), this.field1702, (int) (var1 - this.field1695), var5);
        }
        this.field1698 = -1L;
        this.field1699 = 0;
    }
}
