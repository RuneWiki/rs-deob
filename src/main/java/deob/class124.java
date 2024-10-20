package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dn")
public class class124 {

    @ObfuscatedName("dn.w")
    public class125 field1761;

    @ObfuscatedName("dn.o")
    public byte[] field1764;

    @ObfuscatedName("dn.x")
    public long field1757 = -1L;

    @ObfuscatedName("dn.k")
    public int field1758;

    @ObfuscatedName("dn.f")
    public byte[] field1759;

    @ObfuscatedName("dn.i")
    public long field1756 = -1L;

    @ObfuscatedName("dn.j")
    public int field1760 = 0;

    @ObfuscatedName("dn.m")
    public long field1762;

    @ObfuscatedName("dn.u")
    public long field1763;

    @ObfuscatedName("dn.r")
    public long field1755;

    @ObfuscatedName("dn.v")
    public long field1765;

    public class124(class125 arg0, int arg1, int arg2) throws IOException {
        this.field1761 = arg0;
        this.field1755 = this.field1763 = arg0.method2114();
        this.field1764 = new byte[arg1];
        this.field1759 = new byte[arg2];
        this.field1762 = 0L;
    }

    @ObfuscatedName("dn.w(I)V")
    public void method2092() throws IOException {
        this.method2103();
        this.field1761.method2113();
    }

    @ObfuscatedName("dn.o(J)V")
    public void method2087(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1762 = arg0;
    }

    @ObfuscatedName("dn.x(I)J")
    public long method2088() {
        return this.field1755;
    }

    @ObfuscatedName("dn.k([BI)V")
    public void method2089(byte[] arg0) throws IOException {
        this.method2090(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dn.f([BIIB)V")
    public void method2090(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1756 != -1L && this.field1762 >= this.field1756 && this.field1762 + (long) arg2 <= this.field1756 + (long) this.field1760) {
                System.arraycopy(this.field1759, (int) (this.field1762 - this.field1756), arg0, arg1, arg2);
                this.field1762 += (long) arg2;
                return;
            }
            long var4 = this.field1762;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1762 >= this.field1757 && this.field1762 < this.field1757 + (long) this.field1758) {
                int var8 = (int) ((long) this.field1758 - (this.field1762 - this.field1757));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1764, (int) (this.field1762 - this.field1757), arg0, arg1, var8);
                this.field1762 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1764.length) {
                this.field1761.method2118(this.field1762);
                this.field1765 = this.field1762;
                while (arg2 > 0) {
                    int var9 = this.field1761.method2115(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1765 += (long) var9;
                    this.field1762 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2091();
                int var10 = arg2;
                if (arg2 > this.field1758) {
                    var10 = this.field1758;
                }
                System.arraycopy(this.field1764, 0, arg0, arg1, var10);
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
                } else if (var4 >= this.field1756 && var4 < this.field1756 + (long) this.field1760) {
                    var12 = var4;
                }
                if (this.field1756 + (long) this.field1760 > var4 && this.field1756 + (long) this.field1760 <= (long) var7 + var4) {
                    var14 = this.field1756 + (long) this.field1760;
                } else if ((long) var7 + var4 > this.field1756 && (long) var7 + var4 <= this.field1756 + (long) this.field1760) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1759, (int) (var12 - this.field1756), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1762) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1762));
                        this.field1762 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1765 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dn.i(S)V")
    public void method2091() throws IOException {
        this.field1758 = 0;
        if (this.field1765 != this.field1762) {
            this.field1761.method2118(this.field1762);
            this.field1765 = this.field1762;
        }
        this.field1757 = this.field1762;
        while (this.field1758 < this.field1764.length) {
            int var1 = this.field1761.method2115(this.field1764, this.field1758, this.field1764.length - this.field1758);
            if (var1 == -1) {
                break;
            }
            this.field1765 += (long) var1;
            this.field1758 += var1;
        }
    }

    @ObfuscatedName("dn.j([BIII)V")
    public void method2096(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1762 + (long) arg2 > this.field1755) {
                this.field1755 = this.field1762 + (long) arg2;
            }
            if (this.field1756 != -1L && (this.field1762 < this.field1756 || this.field1762 > this.field1756 + (long) this.field1760)) {
                this.method2103();
            }
            if (this.field1756 != -1L && this.field1762 + (long) arg2 > this.field1756 + (long) this.field1759.length) {
                int var4 = (int) ((long) this.field1759.length - (this.field1762 - this.field1756));
                System.arraycopy(arg0, arg1, this.field1759, (int) (this.field1762 - this.field1756), var4);
                this.field1762 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1760 = this.field1759.length;
                this.method2103();
            }
            if (arg2 > this.field1759.length) {
                if (this.field1765 != this.field1762) {
                    this.field1761.method2118(this.field1762);
                    this.field1765 = this.field1762;
                }
                this.field1761.method2112(arg0, arg1, arg2);
                this.field1765 += (long) arg2;
                if (this.field1765 > this.field1763) {
                    this.field1763 = this.field1765;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1762 >= this.field1757 && this.field1762 < this.field1757 + (long) this.field1758) {
                    var5 = this.field1762;
                } else if (this.field1757 >= this.field1762 && this.field1757 < this.field1762 + (long) arg2) {
                    var5 = this.field1757;
                }
                if (this.field1762 + (long) arg2 > this.field1757 && this.field1762 + (long) arg2 <= this.field1757 + (long) this.field1758) {
                    var7 = this.field1762 + (long) arg2;
                } else if (this.field1757 + (long) this.field1758 > this.field1762 && this.field1757 + (long) this.field1758 <= this.field1762 + (long) arg2) {
                    var7 = this.field1757 + (long) this.field1758;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1762), this.field1764, (int) (var5 - this.field1757), var9);
                }
                this.field1762 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1756 == -1L) {
                    this.field1756 = this.field1762;
                }
                System.arraycopy(arg0, arg1, this.field1759, (int) (this.field1762 - this.field1756), arg2);
                this.field1762 += (long) arg2;
                if (this.field1762 - this.field1756 > (long) this.field1760) {
                    this.field1760 = (int) (this.field1762 - this.field1756);
                }
            }
        } catch (IOException var11) {
            this.field1765 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dn.m(I)V")
    public void method2103() throws IOException {
        if (this.field1756 == -1L) {
            return;
        }
        if (this.field1765 != this.field1756) {
            this.field1761.method2118(this.field1756);
            this.field1765 = this.field1756;
        }
        this.field1761.method2112(this.field1759, 0, this.field1760);
        this.field1765 += (long) (this.field1760 * -683714147) * -969083723L;
        if (this.field1765 > this.field1763) {
            this.field1763 = this.field1765;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1756 >= this.field1757 && this.field1756 < this.field1757 + (long) this.field1758) {
            var1 = this.field1756;
        } else if (this.field1757 >= this.field1756 && this.field1757 < this.field1756 + (long) this.field1760) {
            var1 = this.field1757;
        }
        if (this.field1756 + (long) this.field1760 > this.field1757 && this.field1756 + (long) this.field1760 <= this.field1757 + (long) this.field1758) {
            var3 = this.field1756 + (long) this.field1760;
        } else if (this.field1757 + (long) this.field1758 > this.field1756 && this.field1757 + (long) this.field1758 <= this.field1756 + (long) this.field1760) {
            var3 = this.field1757 + (long) this.field1758;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1759, (int) (var1 - this.field1756), this.field1764, (int) (var1 - this.field1757), var5);
        }
        this.field1756 = -1L;
        this.field1760 = 0;
    }
}
