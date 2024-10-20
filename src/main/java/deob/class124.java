package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dl")
public class class124 {

    @ObfuscatedName("dl.n")
    public class125 field1767;

    @ObfuscatedName("dl.p")
    public byte[] field1760;

    @ObfuscatedName("dl.i")
    public long field1761 = -1L;

    @ObfuscatedName("dl.j")
    public int field1762;

    @ObfuscatedName("dl.f")
    public byte[] field1770;

    @ObfuscatedName("dl.m")
    public long field1764 = -1L;

    @ObfuscatedName("dl.c")
    public int field1763 = 0;

    @ObfuscatedName("dl.z")
    public long field1766;

    @ObfuscatedName("dl.h")
    public long field1759;

    @ObfuscatedName("dl.g")
    public long field1765;

    @ObfuscatedName("dl.e")
    public long field1768;

    public class124(class125 arg0, int arg1, int arg2) throws IOException {
        this.field1767 = arg0;
        this.field1765 = this.field1759 = arg0.method2179();
        this.field1760 = new byte[arg1];
        this.field1770 = new byte[arg2];
        this.field1766 = 0L;
    }

    @ObfuscatedName("dl.n(I)V")
    public void method2160() throws IOException {
        this.method2152();
        this.field1767.method2177();
    }

    @ObfuscatedName("dl.p(J)V")
    public void method2146(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1766 = arg0;
    }

    @ObfuscatedName("dl.i(I)J")
    public long method2147() {
        return this.field1765;
    }

    @ObfuscatedName("dl.j([BI)V")
    public void method2156(byte[] arg0) throws IOException {
        this.method2149(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dl.f([BIII)V")
    public void method2149(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1764 != -1L && this.field1766 >= this.field1764 && this.field1766 + (long) arg2 <= this.field1764 + (long) this.field1763) {
                System.arraycopy(this.field1770, (int) (this.field1766 - this.field1764), arg0, arg1, arg2);
                this.field1766 += (long) arg2;
                return;
            }
            long var4 = this.field1766;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1766 >= this.field1761 && this.field1766 < this.field1761 + (long) this.field1762) {
                int var8 = (int) ((long) this.field1762 - (this.field1766 - this.field1761));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1760, (int) (this.field1766 - this.field1761), arg0, arg1, var8);
                this.field1766 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1760.length) {
                this.field1767.method2174(this.field1766);
                this.field1768 = this.field1766;
                while (arg2 > 0) {
                    int var9 = this.field1767.method2178(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1768 += (long) var9;
                    this.field1766 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2159();
                int var10 = arg2;
                if (arg2 > this.field1762) {
                    var10 = this.field1762;
                }
                System.arraycopy(this.field1760, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1766 += (long) var10;
            }
            if (this.field1764 != -1L) {
                if (this.field1764 > this.field1766 && arg2 > 0) {
                    int var11 = (int) (this.field1764 - this.field1766) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1766++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1764 >= var4 && this.field1764 < (long) var7 + var4) {
                    var12 = this.field1764;
                } else if (var4 >= this.field1764 && var4 < this.field1764 + (long) this.field1763) {
                    var12 = var4;
                }
                if (this.field1764 + (long) this.field1763 > var4 && this.field1764 + (long) this.field1763 <= (long) var7 + var4) {
                    var14 = this.field1764 + (long) this.field1763;
                } else if ((long) var7 + var4 > this.field1764 && (long) var7 + var4 <= this.field1764 + (long) this.field1763) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1770, (int) (var12 - this.field1764), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1766) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1766));
                        this.field1766 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1768 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dl.m(I)V")
    public void method2159() throws IOException {
        this.field1762 = 0;
        if (this.field1768 != this.field1766) {
            this.field1767.method2174(this.field1766);
            this.field1768 = this.field1766;
        }
        this.field1761 = this.field1766;
        while (this.field1762 < this.field1760.length) {
            int var1 = this.field1767.method2178(this.field1760, this.field1762, this.field1760.length - this.field1762);
            if (var1 == -1) {
                break;
            }
            this.field1768 += (long) var1;
            this.field1762 += var1;
        }
    }

    @ObfuscatedName("dl.c([BIII)V")
    public void method2150(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1766 + (long) arg2 > this.field1765) {
                this.field1765 = this.field1766 + (long) arg2;
            }
            if (this.field1764 != -1L && (this.field1766 < this.field1764 || this.field1766 > this.field1764 + (long) this.field1763)) {
                this.method2152();
            }
            if (this.field1764 != -1L && this.field1766 + (long) arg2 > this.field1764 + (long) this.field1770.length) {
                int var4 = (int) ((long) this.field1770.length - (this.field1766 - this.field1764));
                System.arraycopy(arg0, arg1, this.field1770, (int) (this.field1766 - this.field1764), var4);
                this.field1766 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1763 = this.field1770.length;
                this.method2152();
            }
            if (arg2 > this.field1770.length) {
                if (this.field1768 != this.field1766) {
                    this.field1767.method2174(this.field1766);
                    this.field1768 = this.field1766;
                }
                this.field1767.method2175(arg0, arg1, arg2);
                this.field1768 += (long) arg2;
                if (this.field1768 > this.field1759) {
                    this.field1759 = this.field1768;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1766 >= this.field1761 && this.field1766 < this.field1761 + (long) this.field1762) {
                    var5 = this.field1766;
                } else if (this.field1761 >= this.field1766 && this.field1761 < this.field1766 + (long) arg2) {
                    var5 = this.field1761;
                }
                if (this.field1766 + (long) arg2 > this.field1761 && this.field1766 + (long) arg2 <= this.field1761 + (long) this.field1762) {
                    var7 = this.field1766 + (long) arg2;
                } else if (this.field1761 + (long) this.field1762 > this.field1766 && this.field1761 + (long) this.field1762 <= this.field1766 + (long) arg2) {
                    var7 = this.field1761 + (long) this.field1762;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1766), this.field1760, (int) (var5 - this.field1761), var9);
                }
                this.field1766 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1764 == -1L) {
                    this.field1764 = this.field1766;
                }
                System.arraycopy(arg0, arg1, this.field1770, (int) (this.field1766 - this.field1764), arg2);
                this.field1766 += (long) arg2;
                if (this.field1766 - this.field1764 > (long) this.field1763) {
                    this.field1763 = (int) (this.field1766 - this.field1764);
                }
            }
        } catch (IOException var11) {
            this.field1768 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dl.z(I)V")
    public void method2152() throws IOException {
        if (this.field1764 == -1L) {
            return;
        }
        if (this.field1768 != this.field1764) {
            this.field1767.method2174(this.field1764);
            this.field1768 = this.field1764;
        }
        this.field1767.method2175(this.field1770, 0, this.field1763);
        this.field1768 += (long) (this.field1763 * 776181071) * 497443247L;
        if (this.field1768 > this.field1759) {
            this.field1759 = this.field1768;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1764 >= this.field1761 && this.field1764 < this.field1761 + (long) this.field1762) {
            var1 = this.field1764;
        } else if (this.field1761 >= this.field1764 && this.field1761 < this.field1764 + (long) this.field1763) {
            var1 = this.field1761;
        }
        if (this.field1764 + (long) this.field1763 > this.field1761 && this.field1764 + (long) this.field1763 <= this.field1761 + (long) this.field1762) {
            var3 = this.field1764 + (long) this.field1763;
        } else if (this.field1761 + (long) this.field1762 > this.field1764 && this.field1761 + (long) this.field1762 <= this.field1764 + (long) this.field1763) {
            var3 = this.field1761 + (long) this.field1762;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1770, (int) (var1 - this.field1764), this.field1760, (int) (var1 - this.field1761), var5);
        }
        this.field1764 = -1L;
        this.field1763 = 0;
    }
}
