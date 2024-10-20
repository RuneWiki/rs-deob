package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dy")
public class class123 {

    @ObfuscatedName("dy.m")
    public class124 field1672;

    @ObfuscatedName("dy.p")
    public byte[] field1670;

    @ObfuscatedName("dy.i")
    public long field1683 = -1L;

    @ObfuscatedName("dy.j")
    public int field1673;

    @ObfuscatedName("dy.v")
    public byte[] field1671;

    @ObfuscatedName("dy.x")
    public long field1674 = -1L;

    @ObfuscatedName("dy.e")
    public int field1675 = 0;

    @ObfuscatedName("dy.l")
    public long field1676;

    @ObfuscatedName("dy.b")
    public long field1677;

    @ObfuscatedName("dy.n")
    public long field1669;

    @ObfuscatedName("dy.c")
    public long field1679;

    public class123(class124 arg0, int arg1, int arg2) throws IOException {
        this.field1672 = arg0;
        this.field1669 = this.field1677 = arg0.method2260();
        this.field1670 = new byte[arg1];
        this.field1671 = new byte[arg2];
        this.field1676 = 0L;
    }

    @ObfuscatedName("dy.m(S)V")
    public void method2221() throws IOException {
        this.method2216();
        this.field1672.method2243();
    }

    @ObfuscatedName("dy.p(J)V")
    public void method2211(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1676 = arg0;
    }

    @ObfuscatedName("dy.i(I)J")
    public long method2212() {
        return this.field1669;
    }

    @ObfuscatedName("dy.j([BI)V")
    public void method2236(byte[] arg0) throws IOException {
        this.method2217(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dy.v([BIIB)V")
    public void method2217(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1674 != -1L && this.field1676 >= this.field1674 && this.field1676 + (long) arg2 <= this.field1674 + (long) this.field1675) {
                System.arraycopy(this.field1671, (int) (this.field1676 - this.field1674), arg0, arg1, arg2);
                this.field1676 += (long) arg2;
                return;
            }
            long var4 = this.field1676;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1676 >= this.field1683 && this.field1676 < this.field1683 + (long) this.field1673) {
                int var8 = (int) ((long) this.field1673 - (this.field1676 - this.field1683));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1670, (int) (this.field1676 - this.field1683), arg0, arg1, var8);
                this.field1676 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1670.length) {
                this.field1672.method2240(this.field1676);
                this.field1679 = this.field1676;
                while (arg2 > 0) {
                    int var9 = this.field1672.method2246(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1679 += (long) var9;
                    this.field1676 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2215();
                int var10 = arg2;
                if (arg2 > this.field1673) {
                    var10 = this.field1673;
                }
                System.arraycopy(this.field1670, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1676 += (long) var10;
            }
            if (this.field1674 != -1L) {
                if (this.field1674 > this.field1676 && arg2 > 0) {
                    int var11 = (int) (this.field1674 - this.field1676) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1676++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1674 >= var4 && this.field1674 < (long) var7 + var4) {
                    var12 = this.field1674;
                } else if (var4 >= this.field1674 && var4 < this.field1674 + (long) this.field1675) {
                    var12 = var4;
                }
                if (this.field1674 + (long) this.field1675 > var4 && this.field1674 + (long) this.field1675 <= (long) var7 + var4) {
                    var14 = this.field1674 + (long) this.field1675;
                } else if ((long) var7 + var4 > this.field1674 && (long) var7 + var4 <= this.field1674 + (long) this.field1675) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1671, (int) (var12 - this.field1674), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1676) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1676));
                        this.field1676 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1679 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dy.x(I)V")
    public void method2215() throws IOException {
        this.field1673 = 0;
        if (this.field1679 != this.field1676) {
            this.field1672.method2240(this.field1676);
            this.field1679 = this.field1676;
        }
        this.field1683 = this.field1676;
        while (this.field1673 < this.field1670.length) {
            int var1 = this.field1672.method2246(this.field1670, this.field1673, this.field1670.length - this.field1673);
            if (var1 == -1) {
                break;
            }
            this.field1679 += (long) var1;
            this.field1673 += var1;
        }
    }

    @ObfuscatedName("dy.e([BIII)V")
    public void method2226(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1676 + (long) arg2 > this.field1669) {
                this.field1669 = this.field1676 + (long) arg2;
            }
            if (this.field1674 != -1L && (this.field1676 < this.field1674 || this.field1676 > this.field1674 + (long) this.field1675)) {
                this.method2216();
            }
            if (this.field1674 != -1L && this.field1676 + (long) arg2 > this.field1674 + (long) this.field1671.length) {
                int var4 = (int) ((long) this.field1671.length - (this.field1676 - this.field1674));
                System.arraycopy(arg0, arg1, this.field1671, (int) (this.field1676 - this.field1674), var4);
                this.field1676 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1675 = this.field1671.length;
                this.method2216();
            }
            if (arg2 > this.field1671.length) {
                if (this.field1679 != this.field1676) {
                    this.field1672.method2240(this.field1676);
                    this.field1679 = this.field1676;
                }
                this.field1672.method2254(arg0, arg1, arg2);
                this.field1679 += (long) arg2;
                if (this.field1679 > this.field1677) {
                    this.field1677 = this.field1679;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1676 >= this.field1683 && this.field1676 < this.field1683 + (long) this.field1673) {
                    var5 = this.field1676;
                } else if (this.field1683 >= this.field1676 && this.field1683 < this.field1676 + (long) arg2) {
                    var5 = this.field1683;
                }
                if (this.field1676 + (long) arg2 > this.field1683 && this.field1676 + (long) arg2 <= this.field1683 + (long) this.field1673) {
                    var7 = this.field1676 + (long) arg2;
                } else if (this.field1683 + (long) this.field1673 > this.field1676 && this.field1683 + (long) this.field1673 <= this.field1676 + (long) arg2) {
                    var7 = this.field1683 + (long) this.field1673;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1676), this.field1670, (int) (var5 - this.field1683), var9);
                }
                this.field1676 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1674 == -1L) {
                    this.field1674 = this.field1676;
                }
                System.arraycopy(arg0, arg1, this.field1671, (int) (this.field1676 - this.field1674), arg2);
                this.field1676 += (long) arg2;
                if (this.field1676 - this.field1674 > (long) this.field1675) {
                    this.field1675 = (int) (this.field1676 - this.field1674);
                }
            }
        } catch (IOException var11) {
            this.field1679 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dy.l(I)V")
    public void method2216() throws IOException {
        if (this.field1674 == -1L) {
            return;
        }
        if (this.field1679 != this.field1674) {
            this.field1672.method2240(this.field1674);
            this.field1679 = this.field1674;
        }
        this.field1672.method2254(this.field1671, 0, this.field1675);
        this.field1679 += (long) (this.field1675 * -600847225) * -1098434249L;
        if (this.field1679 > this.field1677) {
            this.field1677 = this.field1679;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1674 >= this.field1683 && this.field1674 < this.field1683 + (long) this.field1673) {
            var1 = this.field1674;
        } else if (this.field1683 >= this.field1674 && this.field1683 < this.field1674 + (long) this.field1675) {
            var1 = this.field1683;
        }
        if (this.field1674 + (long) this.field1675 > this.field1683 && this.field1674 + (long) this.field1675 <= this.field1683 + (long) this.field1673) {
            var3 = this.field1674 + (long) this.field1675;
        } else if (this.field1683 + (long) this.field1673 > this.field1674 && this.field1683 + (long) this.field1673 <= this.field1674 + (long) this.field1675) {
            var3 = this.field1683 + (long) this.field1673;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1671, (int) (var1 - this.field1674), this.field1670, (int) (var1 - this.field1683), var5);
        }
        this.field1674 = -1L;
        this.field1675 = 0;
    }
}
