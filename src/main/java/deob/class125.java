package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dt")
public class class125 {

    @ObfuscatedName("dt.j")
    public class126 field1764;

    @ObfuscatedName("dt.h")
    public byte[] field1763;

    @ObfuscatedName("dt.f")
    public long field1762 = -1L;

    @ObfuscatedName("dt.p")
    public int field1765;

    @ObfuscatedName("dt.x")
    public byte[] field1773;

    @ObfuscatedName("dt.g")
    public long field1768 = -1L;

    @ObfuscatedName("dt.c")
    public int field1767 = 0;

    @ObfuscatedName("dt.l")
    public long field1769;

    @ObfuscatedName("dt.w")
    public long field1766;

    @ObfuscatedName("dt.b")
    public long field1771;

    @ObfuscatedName("dt.o")
    public long field1772;

    public class125(class126 arg0, int arg1, int arg2) throws IOException {
        this.field1764 = arg0;
        this.field1771 = this.field1766 = arg0.method2177();
        this.field1763 = new byte[arg1];
        this.field1773 = new byte[arg2];
        this.field1769 = 0L;
    }

    @ObfuscatedName("dt.j(B)V")
    public void method2149() throws IOException {
        this.method2138();
        this.field1764.method2161();
    }

    @ObfuscatedName("dt.h(J)V")
    public void method2133(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1769 = arg0;
    }

    @ObfuscatedName("dt.f(I)J")
    public long method2131() {
        return this.field1771;
    }

    @ObfuscatedName("dt.p([BI)V")
    public void method2134(byte[] arg0) throws IOException {
        this.method2146(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dt.x([BIIB)V")
    public void method2146(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1768 != -1L && this.field1769 >= this.field1768 && this.field1769 + (long) arg2 <= this.field1768 + (long) this.field1767) {
                System.arraycopy(this.field1773, (int) (this.field1769 - this.field1768), arg0, arg1, arg2);
                this.field1769 += (long) arg2;
                return;
            }
            long var4 = this.field1769;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1769 >= this.field1762 && this.field1769 < this.field1762 + (long) this.field1765) {
                int var8 = (int) ((long) this.field1765 - (this.field1769 - this.field1762));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1763, (int) (this.field1769 - this.field1762), arg0, arg1, var8);
                this.field1769 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1763.length) {
                this.field1764.method2158(this.field1769);
                this.field1772 = this.field1769;
                while (arg2 > 0) {
                    int var9 = this.field1764.method2162(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1772 += (long) var9;
                    this.field1769 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2143();
                int var10 = arg2;
                if (arg2 > this.field1765) {
                    var10 = this.field1765;
                }
                System.arraycopy(this.field1763, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1769 += (long) var10;
            }
            if (this.field1768 != -1L) {
                if (this.field1768 > this.field1769 && arg2 > 0) {
                    int var11 = (int) (this.field1768 - this.field1769) + arg1;
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
                if (this.field1768 >= var4 && this.field1768 < (long) var7 + var4) {
                    var12 = this.field1768;
                } else if (var4 >= this.field1768 && var4 < this.field1768 + (long) this.field1767) {
                    var12 = var4;
                }
                if (this.field1768 + (long) this.field1767 > var4 && this.field1768 + (long) this.field1767 <= (long) var7 + var4) {
                    var14 = this.field1768 + (long) this.field1767;
                } else if ((long) var7 + var4 > this.field1768 && (long) var7 + var4 <= this.field1768 + (long) this.field1767) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1773, (int) (var12 - this.field1768), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1769) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1769));
                        this.field1769 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1772 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dt.g(B)V")
    public void method2143() throws IOException {
        this.field1765 = 0;
        if (this.field1772 != this.field1769) {
            this.field1764.method2158(this.field1769);
            this.field1772 = this.field1769;
        }
        this.field1762 = this.field1769;
        while (this.field1765 < this.field1763.length) {
            int var1 = this.field1764.method2162(this.field1763, this.field1765, this.field1763.length - this.field1765);
            if (var1 == -1) {
                break;
            }
            this.field1772 += (long) var1;
            this.field1765 += var1;
        }
    }

    @ObfuscatedName("dt.c([BIII)V")
    public void method2137(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1769 + (long) arg2 > this.field1771) {
                this.field1771 = this.field1769 + (long) arg2;
            }
            if (this.field1768 != -1L && (this.field1769 < this.field1768 || this.field1769 > this.field1768 + (long) this.field1767)) {
                this.method2138();
            }
            if (this.field1768 != -1L && this.field1769 + (long) arg2 > this.field1768 + (long) this.field1773.length) {
                int var4 = (int) ((long) this.field1773.length - (this.field1769 - this.field1768));
                System.arraycopy(arg0, arg1, this.field1773, (int) (this.field1769 - this.field1768), var4);
                this.field1769 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1767 = this.field1773.length;
                this.method2138();
            }
            if (arg2 > this.field1773.length) {
                if (this.field1772 != this.field1769) {
                    this.field1764.method2158(this.field1769);
                    this.field1772 = this.field1769;
                }
                this.field1764.method2159(arg0, arg1, arg2);
                this.field1772 += (long) arg2;
                if (this.field1772 > this.field1766) {
                    this.field1766 = this.field1772;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1769 >= this.field1762 && this.field1769 < this.field1762 + (long) this.field1765) {
                    var5 = this.field1769;
                } else if (this.field1762 >= this.field1769 && this.field1762 < this.field1769 + (long) arg2) {
                    var5 = this.field1762;
                }
                if (this.field1769 + (long) arg2 > this.field1762 && this.field1769 + (long) arg2 <= this.field1762 + (long) this.field1765) {
                    var7 = this.field1769 + (long) arg2;
                } else if (this.field1762 + (long) this.field1765 > this.field1769 && this.field1762 + (long) this.field1765 <= this.field1769 + (long) arg2) {
                    var7 = this.field1762 + (long) this.field1765;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1769), this.field1763, (int) (var5 - this.field1762), var9);
                }
                this.field1769 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1768 == -1L) {
                    this.field1768 = this.field1769;
                }
                System.arraycopy(arg0, arg1, this.field1773, (int) (this.field1769 - this.field1768), arg2);
                this.field1769 += (long) arg2;
                if (this.field1769 - this.field1768 > (long) this.field1767) {
                    this.field1767 = (int) (this.field1769 - this.field1768);
                }
            }
        } catch (IOException var11) {
            this.field1772 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dt.l(I)V")
    public void method2138() throws IOException {
        if (this.field1768 == -1L) {
            return;
        }
        if (this.field1772 != this.field1768) {
            this.field1764.method2158(this.field1768);
            this.field1772 = this.field1768;
        }
        this.field1764.method2159(this.field1773, 0, this.field1767);
        this.field1772 += (long) (this.field1767 * -794226537) * -50630873L;
        if (this.field1772 > this.field1766) {
            this.field1766 = this.field1772;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1768 >= this.field1762 && this.field1768 < this.field1762 + (long) this.field1765) {
            var1 = this.field1768;
        } else if (this.field1762 >= this.field1768 && this.field1762 < this.field1768 + (long) this.field1767) {
            var1 = this.field1762;
        }
        if (this.field1768 + (long) this.field1767 > this.field1762 && this.field1768 + (long) this.field1767 <= this.field1762 + (long) this.field1765) {
            var3 = this.field1768 + (long) this.field1767;
        } else if (this.field1762 + (long) this.field1765 > this.field1768 && this.field1762 + (long) this.field1765 <= this.field1768 + (long) this.field1767) {
            var3 = this.field1762 + (long) this.field1765;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1773, (int) (var1 - this.field1768), this.field1763, (int) (var1 - this.field1762), var5);
        }
        this.field1768 = -1L;
        this.field1767 = 0;
    }
}
