package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("da")
public class class123 {

    @ObfuscatedName("da.i")
    public class124 field1771;

    @ObfuscatedName("da.j")
    public byte[] field1765;

    @ObfuscatedName("da.a")
    public long field1764 = -1L;

    @ObfuscatedName("da.r")
    public int field1763;

    @ObfuscatedName("da.o")
    public byte[] field1766;

    @ObfuscatedName("da.n")
    public long field1772 = -1L;

    @ObfuscatedName("da.q")
    public int field1768 = 0;

    @ObfuscatedName("da.b")
    public long field1769;

    @ObfuscatedName("da.k")
    public long field1770;

    @ObfuscatedName("da.s")
    public long field1767;

    @ObfuscatedName("da.d")
    public long field1762;

    public class123(class124 arg0, int arg1, int arg2) throws IOException {
        this.field1771 = arg0;
        this.field1767 = this.field1770 = arg0.method2165();
        this.field1765 = new byte[arg1];
        this.field1766 = new byte[arg2];
        this.field1769 = 0L;
    }

    @ObfuscatedName("da.i(I)V")
    public void method2129() throws IOException {
        this.method2135();
        this.field1771.method2163();
    }

    @ObfuscatedName("da.j(J)V")
    public void method2155(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1769 = arg0;
    }

    @ObfuscatedName("da.a(B)J")
    public long method2141() {
        return this.field1767;
    }

    @ObfuscatedName("da.r([BB)V")
    public void method2132(byte[] arg0) throws IOException {
        this.method2144(arg0, 0, arg0.length);
    }

    @ObfuscatedName("da.o([BIII)V")
    public void method2144(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1772 != -1L && this.field1769 >= this.field1772 && this.field1769 + (long) arg2 <= this.field1772 + (long) this.field1768) {
                System.arraycopy(this.field1766, (int) (this.field1769 - this.field1772), arg0, arg1, arg2);
                this.field1769 += (long) arg2;
                return;
            }
            long var4 = this.field1769;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1769 >= this.field1764 && this.field1769 < this.field1764 + (long) this.field1763) {
                int var8 = (int) ((long) this.field1763 - (this.field1769 - this.field1764));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1765, (int) (this.field1769 - this.field1764), arg0, arg1, var8);
                this.field1769 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1765.length) {
                this.field1771.method2161(this.field1769);
                this.field1762 = this.field1769;
                while (arg2 > 0) {
                    int var9 = this.field1771.method2166(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1762 += (long) var9;
                    this.field1769 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2133();
                int var10 = arg2;
                if (arg2 > this.field1763) {
                    var10 = this.field1763;
                }
                System.arraycopy(this.field1765, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1769 += (long) var10;
            }
            if (this.field1772 != -1L) {
                if (this.field1772 > this.field1769 && arg2 > 0) {
                    int var11 = (int) (this.field1772 - this.field1769) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1769++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1772 >= var4 && this.field1772 < (long) var7 + var4) {
                    var12 = this.field1772;
                } else if (var4 >= this.field1772 && var4 < this.field1772 + (long) this.field1768) {
                    var12 = var4;
                }
                if (this.field1772 + (long) this.field1768 > var4 && this.field1772 + (long) this.field1768 <= (long) var7 + var4) {
                    var14 = this.field1772 + (long) this.field1768;
                } else if ((long) var7 + var4 > this.field1772 && (long) var7 + var4 <= this.field1772 + (long) this.field1768) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1766, (int) (var12 - this.field1772), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1769) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1769));
                        this.field1769 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1762 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("da.n(I)V")
    public void method2133() throws IOException {
        this.field1763 = 0;
        if (this.field1769 != this.field1762) {
            this.field1771.method2161(this.field1769);
            this.field1762 = this.field1769;
        }
        this.field1764 = this.field1769;
        while (this.field1763 < this.field1765.length) {
            int var1 = this.field1771.method2166(this.field1765, this.field1763, this.field1765.length - this.field1763);
            if (var1 == -1) {
                break;
            }
            this.field1762 += (long) var1;
            this.field1763 += var1;
        }
    }

    @ObfuscatedName("da.q([BIII)V")
    public void method2150(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1769 + (long) arg2 > this.field1767) {
                this.field1767 = this.field1769 + (long) arg2;
            }
            if (this.field1772 != -1L && (this.field1769 < this.field1772 || this.field1769 > this.field1772 + (long) this.field1768)) {
                this.method2135();
            }
            if (this.field1772 != -1L && this.field1769 + (long) arg2 > this.field1772 + (long) this.field1766.length) {
                int var4 = (int) ((long) this.field1766.length - (this.field1769 - this.field1772));
                System.arraycopy(arg0, arg1, this.field1766, (int) (this.field1769 - this.field1772), var4);
                this.field1769 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1768 = this.field1766.length;
                this.method2135();
            }
            if (arg2 > this.field1766.length) {
                if (this.field1769 != this.field1762) {
                    this.field1771.method2161(this.field1769);
                    this.field1762 = this.field1769;
                }
                this.field1771.method2162(arg0, arg1, arg2);
                this.field1762 += (long) arg2;
                if (this.field1762 > this.field1770) {
                    this.field1770 = this.field1762;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1769 >= this.field1764 && this.field1769 < this.field1764 + (long) this.field1763) {
                    var5 = this.field1769;
                } else if (this.field1764 >= this.field1769 && this.field1764 < this.field1769 + (long) arg2) {
                    var5 = this.field1764;
                }
                if (this.field1769 + (long) arg2 > this.field1764 && this.field1769 + (long) arg2 <= this.field1764 + (long) this.field1763) {
                    var7 = this.field1769 + (long) arg2;
                } else if (this.field1764 + (long) this.field1763 > this.field1769 && this.field1764 + (long) this.field1763 <= this.field1769 + (long) arg2) {
                    var7 = this.field1764 + (long) this.field1763;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1769), this.field1765, (int) (var5 - this.field1764), var9);
                }
                this.field1769 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1772 == -1L) {
                    this.field1772 = this.field1769;
                }
                System.arraycopy(arg0, arg1, this.field1766, (int) (this.field1769 - this.field1772), arg2);
                this.field1769 += (long) arg2;
                if (this.field1769 - this.field1772 > (long) this.field1768) {
                    this.field1768 = (int) (this.field1769 - this.field1772);
                }
            }
        } catch (IOException var11) {
            this.field1762 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("da.b(I)V")
    public void method2135() throws IOException {
        if (this.field1772 == -1L) {
            return;
        }
        if (this.field1772 != this.field1762) {
            this.field1771.method2161(this.field1772);
            this.field1762 = this.field1772;
        }
        this.field1771.method2162(this.field1766, 0, this.field1768);
        this.field1762 += (long) (this.field1768 * -465533977) * 1348329431L;
        if (this.field1762 > this.field1770) {
            this.field1770 = this.field1762;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1772 >= this.field1764 && this.field1772 < this.field1764 + (long) this.field1763) {
            var1 = this.field1772;
        } else if (this.field1764 >= this.field1772 && this.field1764 < this.field1772 + (long) this.field1768) {
            var1 = this.field1764;
        }
        if (this.field1772 + (long) this.field1768 > this.field1764 && this.field1772 + (long) this.field1768 <= this.field1764 + (long) this.field1763) {
            var3 = this.field1772 + (long) this.field1768;
        } else if (this.field1764 + (long) this.field1763 > this.field1772 && this.field1764 + (long) this.field1763 <= this.field1772 + (long) this.field1768) {
            var3 = this.field1764 + (long) this.field1763;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1766, (int) (var1 - this.field1772), this.field1765, (int) (var1 - this.field1764), var5);
        }
        this.field1772 = -1L;
        this.field1768 = 0;
    }
}
