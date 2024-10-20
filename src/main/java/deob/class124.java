package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dv")
public class class124 {

    @ObfuscatedName("dv.i")
    public class125 field1769;

    @ObfuscatedName("dv.c")
    public byte[] field1778;

    @ObfuscatedName("dv.e")
    public long field1770 = -1L;

    @ObfuscatedName("dv.v")
    public int field1779;

    @ObfuscatedName("dv.b")
    public byte[] field1772;

    @ObfuscatedName("dv.y")
    public long field1773 = -1L;

    @ObfuscatedName("dv.h")
    public int field1774 = 0;

    @ObfuscatedName("dv.x")
    public long field1775;

    @ObfuscatedName("dv.f")
    public long field1776;

    @ObfuscatedName("dv.n")
    public long field1777;

    @ObfuscatedName("dv.a")
    public long field1771;

    public class124(class125 arg0, int arg1, int arg2) throws IOException {
        this.field1769 = arg0;
        this.field1777 = this.field1776 = arg0.method2125();
        this.field1778 = new byte[arg1];
        this.field1772 = new byte[arg2];
        this.field1775 = 0L;
    }

    @ObfuscatedName("dv.i(B)V")
    public void method2096() throws IOException {
        this.method2103();
        this.field1769.method2129();
    }

    @ObfuscatedName("dv.c(J)V")
    public void method2097(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1775 = arg0;
    }

    @ObfuscatedName("dv.e(I)J")
    public long method2098() {
        return this.field1777;
    }

    @ObfuscatedName("dv.v([BS)V")
    public void method2099(byte[] arg0) throws IOException {
        this.method2110(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dv.b([BIII)V")
    public void method2110(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1773 != -1L && this.field1775 >= this.field1773 && this.field1775 + (long) arg2 <= this.field1773 + (long) this.field1774) {
                System.arraycopy(this.field1772, (int) (this.field1775 - this.field1773), arg0, arg1, arg2);
                this.field1775 += (long) arg2;
                return;
            }
            long var4 = this.field1775;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1775 >= this.field1770 && this.field1775 < this.field1770 + (long) this.field1779) {
                int var8 = (int) ((long) this.field1779 - (this.field1775 - this.field1770));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1778, (int) (this.field1775 - this.field1770), arg0, arg1, var8);
                this.field1775 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1778.length) {
                this.field1769.method2141(this.field1775);
                this.field1771 = this.field1775;
                while (arg2 > 0) {
                    int var9 = this.field1769.method2124(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1771 += (long) var9;
                    this.field1775 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2115();
                int var10 = arg2;
                if (arg2 > this.field1779) {
                    var10 = this.field1779;
                }
                System.arraycopy(this.field1778, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1775 += (long) var10;
            }
            if (this.field1773 != -1L) {
                if (this.field1773 > this.field1775 && arg2 > 0) {
                    int var11 = (int) (this.field1773 - this.field1775) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1775++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1773 >= var4 && this.field1773 < (long) var7 + var4) {
                    var12 = this.field1773;
                } else if (var4 >= this.field1773 && var4 < this.field1773 + (long) this.field1774) {
                    var12 = var4;
                }
                if (this.field1773 + (long) this.field1774 > var4 && this.field1773 + (long) this.field1774 <= (long) var7 + var4) {
                    var14 = this.field1773 + (long) this.field1774;
                } else if ((long) var7 + var4 > this.field1773 && (long) var7 + var4 <= this.field1773 + (long) this.field1774) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1772, (int) (var12 - this.field1773), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1775) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1775));
                        this.field1775 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1771 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dv.y(B)V")
    public void method2115() throws IOException {
        this.field1779 = 0;
        if (this.field1775 != this.field1771) {
            this.field1769.method2141(this.field1775);
            this.field1771 = this.field1775;
        }
        this.field1770 = this.field1775;
        while (this.field1779 < this.field1778.length) {
            int var1 = this.field1769.method2124(this.field1778, this.field1779, this.field1778.length - this.field1779);
            if (var1 == -1) {
                break;
            }
            this.field1771 += (long) var1;
            this.field1779 += var1;
        }
    }

    @ObfuscatedName("dv.h([BIII)V")
    public void method2102(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1775 + (long) arg2 > this.field1777) {
                this.field1777 = this.field1775 + (long) arg2;
            }
            if (this.field1773 != -1L && (this.field1775 < this.field1773 || this.field1775 > this.field1773 + (long) this.field1774)) {
                this.method2103();
            }
            if (this.field1773 != -1L && this.field1775 + (long) arg2 > this.field1773 + (long) this.field1772.length) {
                int var4 = (int) ((long) this.field1772.length - (this.field1775 - this.field1773));
                System.arraycopy(arg0, arg1, this.field1772, (int) (this.field1775 - this.field1773), var4);
                this.field1775 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1774 = this.field1772.length;
                this.method2103();
            }
            if (arg2 > this.field1772.length) {
                if (this.field1775 != this.field1771) {
                    this.field1769.method2141(this.field1775);
                    this.field1771 = this.field1775;
                }
                this.field1769.method2145(arg0, arg1, arg2);
                this.field1771 += (long) arg2;
                if (this.field1771 > this.field1776) {
                    this.field1776 = this.field1771;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1775 >= this.field1770 && this.field1775 < this.field1770 + (long) this.field1779) {
                    var5 = this.field1775;
                } else if (this.field1770 >= this.field1775 && this.field1770 < this.field1775 + (long) arg2) {
                    var5 = this.field1770;
                }
                if (this.field1775 + (long) arg2 > this.field1770 && this.field1775 + (long) arg2 <= this.field1770 + (long) this.field1779) {
                    var7 = this.field1775 + (long) arg2;
                } else if (this.field1770 + (long) this.field1779 > this.field1775 && this.field1770 + (long) this.field1779 <= this.field1775 + (long) arg2) {
                    var7 = this.field1770 + (long) this.field1779;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1775), this.field1778, (int) (var5 - this.field1770), var9);
                }
                this.field1775 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1773 == -1L) {
                    this.field1773 = this.field1775;
                }
                System.arraycopy(arg0, arg1, this.field1772, (int) (this.field1775 - this.field1773), arg2);
                this.field1775 += (long) arg2;
                if (this.field1775 - this.field1773 > (long) this.field1774) {
                    this.field1774 = (int) (this.field1775 - this.field1773);
                }
            }
        } catch (IOException var11) {
            this.field1771 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dv.x(I)V")
    public void method2103() throws IOException {
        if (this.field1773 == -1L) {
            return;
        }
        if (this.field1773 != this.field1771) {
            this.field1769.method2141(this.field1773);
            this.field1771 = this.field1773;
        }
        this.field1769.method2145(this.field1772, 0, this.field1774);
        this.field1771 += (long) (this.field1774 * 1004233751) * 1957434279L;
        if (this.field1771 > this.field1776) {
            this.field1776 = this.field1771;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1773 >= this.field1770 && this.field1773 < this.field1770 + (long) this.field1779) {
            var1 = this.field1773;
        } else if (this.field1770 >= this.field1773 && this.field1770 < this.field1773 + (long) this.field1774) {
            var1 = this.field1770;
        }
        if (this.field1773 + (long) this.field1774 > this.field1770 && this.field1773 + (long) this.field1774 <= this.field1770 + (long) this.field1779) {
            var3 = this.field1773 + (long) this.field1774;
        } else if (this.field1770 + (long) this.field1779 > this.field1773 && this.field1770 + (long) this.field1779 <= this.field1773 + (long) this.field1774) {
            var3 = this.field1770 + (long) this.field1779;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1772, (int) (var1 - this.field1773), this.field1778, (int) (var1 - this.field1770), var5);
        }
        this.field1773 = -1L;
        this.field1774 = 0;
    }
}
