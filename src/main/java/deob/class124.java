package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dm")
public class class124 {

    @ObfuscatedName("dm.e")
    public class125 field1751;

    @ObfuscatedName("dm.o")
    public byte[] field1752;

    @ObfuscatedName("dm.m")
    public long field1753 = -1L;

    @ObfuscatedName("dm.g")
    public int field1763;

    @ObfuscatedName("dm.d")
    public byte[] field1765;

    @ObfuscatedName("dm.b")
    public long field1756 = -1L;

    @ObfuscatedName("dm.k")
    public int field1757 = 0;

    @ObfuscatedName("dm.f")
    public long field1762;

    @ObfuscatedName("dm.j")
    public long field1759;

    @ObfuscatedName("dm.q")
    public long field1760;

    @ObfuscatedName("dm.h")
    public long field1761;

    public class124(class125 arg0, int arg1, int arg2) throws IOException {
        this.field1751 = arg0;
        this.field1760 = this.field1759 = arg0.method2139();
        this.field1752 = new byte[arg1];
        this.field1765 = new byte[arg2];
        this.field1762 = 0L;
    }

    @ObfuscatedName("dm.e(I)V")
    public void method2110() throws IOException {
        this.method2117();
        this.field1751.method2145();
    }

    @ObfuscatedName("dm.o(J)V")
    public void method2127(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1762 = arg0;
    }

    @ObfuscatedName("dm.m(B)J")
    public long method2112() {
        return this.field1760;
    }

    @ObfuscatedName("dm.g([BI)V")
    public void method2113(byte[] arg0) throws IOException {
        this.method2114(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dm.d([BIIB)V")
    public void method2114(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1756 != -1L && this.field1762 >= this.field1756 && this.field1762 + (long) arg2 <= this.field1756 + (long) this.field1757) {
                System.arraycopy(this.field1765, (int) (this.field1762 - this.field1756), arg0, arg1, arg2);
                this.field1762 += (long) arg2;
                return;
            }
            long var4 = this.field1762;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1762 >= this.field1753 && this.field1762 < this.field1753 + (long) this.field1763) {
                int var8 = (int) ((long) this.field1763 - (this.field1762 - this.field1753));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1752, (int) (this.field1762 - this.field1753), arg0, arg1, var8);
                this.field1762 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1752.length) {
                this.field1751.method2137(this.field1762);
                this.field1761 = this.field1762;
                while (arg2 > 0) {
                    int var9 = this.field1751.method2140(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1761 += (long) var9;
                    this.field1762 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2134();
                int var10 = arg2;
                if (arg2 > this.field1763) {
                    var10 = this.field1763;
                }
                System.arraycopy(this.field1752, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1762 += (long) var10;
            }
            if (this.field1756 != -1L) {
                if (this.field1756 > this.field1762 && arg2 > 0) {
                    int var11 = (int) (this.field1756 - this.field1762) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1762++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1756 >= var4 && this.field1756 < (long) var7 + var4) {
                    var12 = this.field1756;
                } else if (var4 >= this.field1756 && var4 < this.field1756 + (long) this.field1757) {
                    var12 = var4;
                }
                if (this.field1756 + (long) this.field1757 > var4 && this.field1756 + (long) this.field1757 <= (long) var7 + var4) {
                    var14 = this.field1756 + (long) this.field1757;
                } else if ((long) var7 + var4 > this.field1756 && (long) var7 + var4 <= this.field1756 + (long) this.field1757) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1765, (int) (var12 - this.field1756), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1762) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1762));
                        this.field1762 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1761 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dm.b(I)V")
    public void method2134() throws IOException {
        this.field1763 = 0;
        if (this.field1762 != this.field1761) {
            this.field1751.method2137(this.field1762);
            this.field1761 = this.field1762;
        }
        this.field1753 = this.field1762;
        while (this.field1763 < this.field1752.length) {
            int var1 = this.field1751.method2140(this.field1752, this.field1763, this.field1752.length - this.field1763);
            if (var1 == -1) {
                break;
            }
            this.field1761 += (long) var1;
            this.field1763 += var1;
        }
    }

    @ObfuscatedName("dm.k([BIIB)V")
    public void method2116(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1762 + (long) arg2 > this.field1760) {
                this.field1760 = this.field1762 + (long) arg2;
            }
            if (this.field1756 != -1L && (this.field1762 < this.field1756 || this.field1762 > this.field1756 + (long) this.field1757)) {
                this.method2117();
            }
            if (this.field1756 != -1L && this.field1762 + (long) arg2 > this.field1756 + (long) this.field1765.length) {
                int var4 = (int) ((long) this.field1765.length - (this.field1762 - this.field1756));
                System.arraycopy(arg0, arg1, this.field1765, (int) (this.field1762 - this.field1756), var4);
                this.field1762 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1757 = this.field1765.length;
                this.method2117();
            }
            if (arg2 > this.field1765.length) {
                if (this.field1762 != this.field1761) {
                    this.field1751.method2137(this.field1762);
                    this.field1761 = this.field1762;
                }
                this.field1751.method2135(arg0, arg1, arg2);
                this.field1761 += (long) arg2;
                if (this.field1761 > this.field1759) {
                    this.field1759 = this.field1761;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1762 >= this.field1753 && this.field1762 < this.field1753 + (long) this.field1763) {
                    var5 = this.field1762;
                } else if (this.field1753 >= this.field1762 && this.field1753 < this.field1762 + (long) arg2) {
                    var5 = this.field1753;
                }
                if (this.field1762 + (long) arg2 > this.field1753 && this.field1762 + (long) arg2 <= this.field1753 + (long) this.field1763) {
                    var7 = this.field1762 + (long) arg2;
                } else if (this.field1753 + (long) this.field1763 > this.field1762 && this.field1753 + (long) this.field1763 <= this.field1762 + (long) arg2) {
                    var7 = this.field1753 + (long) this.field1763;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1762), this.field1752, (int) (var5 - this.field1753), var9);
                }
                this.field1762 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1756 == -1L) {
                    this.field1756 = this.field1762;
                }
                System.arraycopy(arg0, arg1, this.field1765, (int) (this.field1762 - this.field1756), arg2);
                this.field1762 += (long) arg2;
                if (this.field1762 - this.field1756 > (long) this.field1757) {
                    this.field1757 = (int) (this.field1762 - this.field1756);
                }
            }
        } catch (IOException var11) {
            this.field1761 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dm.q(B)V")
    public void method2117() throws IOException {
        if (this.field1756 == -1L) {
            return;
        }
        if (this.field1761 != this.field1756) {
            this.field1751.method2137(this.field1756);
            this.field1761 = this.field1756;
        }
        this.field1751.method2135(this.field1765, 0, this.field1757);
        this.field1761 += (long) (this.field1757 * -1731837165) * -2105671909L;
        if (this.field1761 > this.field1759) {
            this.field1759 = this.field1761;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1756 >= this.field1753 && this.field1756 < this.field1753 + (long) this.field1763) {
            var1 = this.field1756;
        } else if (this.field1753 >= this.field1756 && this.field1753 < this.field1756 + (long) this.field1757) {
            var1 = this.field1753;
        }
        if (this.field1756 + (long) this.field1757 > this.field1753 && this.field1756 + (long) this.field1757 <= this.field1753 + (long) this.field1763) {
            var3 = this.field1756 + (long) this.field1757;
        } else if (this.field1753 + (long) this.field1763 > this.field1756 && this.field1753 + (long) this.field1763 <= this.field1756 + (long) this.field1757) {
            var3 = this.field1753 + (long) this.field1763;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1765, (int) (var1 - this.field1756), this.field1752, (int) (var1 - this.field1753), var5);
        }
        this.field1756 = -1L;
        this.field1757 = 0;
    }
}
