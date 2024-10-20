package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ds")
public class class124 {

    @ObfuscatedName("ds.p")
    public class125 field1760;

    @ObfuscatedName("ds.m")
    public byte[] field1752;

    @ObfuscatedName("ds.e")
    public long field1758 = -1L;

    @ObfuscatedName("ds.t")
    public int field1754;

    @ObfuscatedName("ds.w")
    public byte[] field1755;

    @ObfuscatedName("ds.z")
    public long field1757 = -1L;

    @ObfuscatedName("ds.j")
    public int field1753 = 0;

    @ObfuscatedName("ds.i")
    public long field1761;

    @ObfuscatedName("ds.f")
    public long field1759;

    @ObfuscatedName("ds.c")
    public long field1756;

    @ObfuscatedName("ds.o")
    public long field1751;

    public class124(class125 arg0, int arg1, int arg2) throws IOException {
        this.field1760 = arg0;
        this.field1756 = this.field1759 = arg0.method2093();
        this.field1752 = new byte[arg1];
        this.field1755 = new byte[arg2];
        this.field1761 = 0L;
    }

    @ObfuscatedName("ds.p(I)V")
    public void method2073() throws IOException {
        this.method2069();
        this.field1760.method2101();
    }

    @ObfuscatedName("ds.m(J)V")
    public void method2083(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1761 = arg0;
    }

    @ObfuscatedName("ds.e(I)J")
    public long method2064() {
        return this.field1756;
    }

    @ObfuscatedName("ds.t([BB)V")
    public void method2065(byte[] arg0) throws IOException {
        this.method2066(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ds.w([BIII)V")
    public void method2066(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1757 != -1L && this.field1761 >= this.field1757 && this.field1761 + (long) arg2 <= this.field1757 + (long) this.field1753) {
                System.arraycopy(this.field1755, (int) (this.field1761 - this.field1757), arg0, arg1, arg2);
                this.field1761 += (long) arg2;
                return;
            }
            long var4 = this.field1761;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1761 >= this.field1758 && this.field1761 < this.field1758 + (long) this.field1754) {
                int var8 = (int) ((long) this.field1754 - (this.field1761 - this.field1758));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1752, (int) (this.field1761 - this.field1758), arg0, arg1, var8);
                this.field1761 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1752.length) {
                this.field1760.method2090(this.field1761);
                this.field1751 = this.field1761;
                while (arg2 > 0) {
                    int var9 = this.field1760.method2094(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1751 += (long) var9;
                    this.field1761 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2067();
                int var10 = arg2;
                if (arg2 > this.field1754) {
                    var10 = this.field1754;
                }
                System.arraycopy(this.field1752, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1761 += (long) var10;
            }
            if (this.field1757 != -1L) {
                if (this.field1757 > this.field1761 && arg2 > 0) {
                    int var11 = (int) (this.field1757 - this.field1761) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1761++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1757 >= var4 && this.field1757 < (long) var7 + var4) {
                    var12 = this.field1757;
                } else if (var4 >= this.field1757 && var4 < this.field1757 + (long) this.field1753) {
                    var12 = var4;
                }
                if (this.field1757 + (long) this.field1753 > var4 && this.field1757 + (long) this.field1753 <= (long) var7 + var4) {
                    var14 = this.field1757 + (long) this.field1753;
                } else if ((long) var7 + var4 > this.field1757 && (long) var7 + var4 <= this.field1757 + (long) this.field1753) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1755, (int) (var12 - this.field1757), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1761) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1761));
                        this.field1761 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1751 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ds.z(I)V")
    public void method2067() throws IOException {
        this.field1754 = 0;
        if (this.field1761 != this.field1751) {
            this.field1760.method2090(this.field1761);
            this.field1751 = this.field1761;
        }
        this.field1758 = this.field1761;
        while (this.field1754 < this.field1752.length) {
            int var1 = this.field1760.method2094(this.field1752, this.field1754, this.field1752.length - this.field1754);
            if (var1 == -1) {
                break;
            }
            this.field1751 += (long) var1;
            this.field1754 += var1;
        }
    }

    @ObfuscatedName("ds.j([BIII)V")
    public void method2068(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1761 + (long) arg2 > this.field1756) {
                this.field1756 = this.field1761 + (long) arg2;
            }
            if (this.field1757 != -1L && (this.field1761 < this.field1757 || this.field1761 > this.field1757 + (long) this.field1753)) {
                this.method2069();
            }
            if (this.field1757 != -1L && this.field1761 + (long) arg2 > this.field1757 + (long) this.field1755.length) {
                int var4 = (int) ((long) this.field1755.length - (this.field1761 - this.field1757));
                System.arraycopy(arg0, arg1, this.field1755, (int) (this.field1761 - this.field1757), var4);
                this.field1761 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1753 = this.field1755.length;
                this.method2069();
            }
            if (arg2 > this.field1755.length) {
                if (this.field1761 != this.field1751) {
                    this.field1760.method2090(this.field1761);
                    this.field1751 = this.field1761;
                }
                this.field1760.method2091(arg0, arg1, arg2);
                this.field1751 += (long) arg2;
                if (this.field1751 > this.field1759) {
                    this.field1759 = this.field1751;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1761 >= this.field1758 && this.field1761 < this.field1758 + (long) this.field1754) {
                    var5 = this.field1761;
                } else if (this.field1758 >= this.field1761 && this.field1758 < this.field1761 + (long) arg2) {
                    var5 = this.field1758;
                }
                if (this.field1761 + (long) arg2 > this.field1758 && this.field1761 + (long) arg2 <= this.field1758 + (long) this.field1754) {
                    var7 = this.field1761 + (long) arg2;
                } else if (this.field1758 + (long) this.field1754 > this.field1761 && this.field1758 + (long) this.field1754 <= this.field1761 + (long) arg2) {
                    var7 = this.field1758 + (long) this.field1754;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1761), this.field1752, (int) (var5 - this.field1758), var9);
                }
                this.field1761 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1757 == -1L) {
                    this.field1757 = this.field1761;
                }
                System.arraycopy(arg0, arg1, this.field1755, (int) (this.field1761 - this.field1757), arg2);
                this.field1761 += (long) arg2;
                if (this.field1761 - this.field1757 > (long) this.field1753) {
                    this.field1753 = (int) (this.field1761 - this.field1757);
                }
            }
        } catch (IOException var11) {
            this.field1751 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ds.c(I)V")
    public void method2069() throws IOException {
        if (this.field1757 == -1L) {
            return;
        }
        if (this.field1757 != this.field1751) {
            this.field1760.method2090(this.field1757);
            this.field1751 = this.field1757;
        }
        this.field1760.method2091(this.field1755, 0, this.field1753);
        this.field1751 += (long) (this.field1753 * -1212830407) * 1293758729L;
        if (this.field1751 > this.field1759) {
            this.field1759 = this.field1751;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1757 >= this.field1758 && this.field1757 < this.field1758 + (long) this.field1754) {
            var1 = this.field1757;
        } else if (this.field1758 >= this.field1757 && this.field1758 < this.field1757 + (long) this.field1753) {
            var1 = this.field1758;
        }
        if (this.field1757 + (long) this.field1753 > this.field1758 && this.field1757 + (long) this.field1753 <= this.field1758 + (long) this.field1754) {
            var3 = this.field1757 + (long) this.field1753;
        } else if (this.field1758 + (long) this.field1754 > this.field1757 && this.field1758 + (long) this.field1754 <= this.field1757 + (long) this.field1753) {
            var3 = this.field1758 + (long) this.field1754;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1755, (int) (var1 - this.field1757), this.field1752, (int) (var1 - this.field1758), var5);
        }
        this.field1757 = -1L;
        this.field1753 = 0;
    }
}
