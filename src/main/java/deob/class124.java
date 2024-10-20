package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ds")
public class class124 {

    @ObfuscatedName("ds.c")
    public class125 field1723;

    @ObfuscatedName("ds.o")
    public byte[] field1717;

    @ObfuscatedName("ds.i")
    public long field1718 = -1L;

    @ObfuscatedName("ds.u")
    public int field1719;

    @ObfuscatedName("ds.g")
    public byte[] field1720;

    @ObfuscatedName("ds.m")
    public long field1724 = -1L;

    @ObfuscatedName("ds.s")
    public int field1722 = 0;

    @ObfuscatedName("ds.x")
    public long field1726;

    @ObfuscatedName("ds.p")
    public long field1716;

    @ObfuscatedName("ds.k")
    public long field1725;

    @ObfuscatedName("ds.r")
    public long field1721;

    public class124(class125 arg0, int arg1, int arg2) throws IOException {
        this.field1723 = arg0;
        this.field1725 = this.field1716 = arg0.method2105();
        this.field1717 = new byte[arg1];
        this.field1720 = new byte[arg2];
        this.field1726 = 0L;
    }

    @ObfuscatedName("ds.c(B)V")
    public void method2089() throws IOException {
        this.method2062();
        this.field1723.method2094();
    }

    @ObfuscatedName("ds.o(J)V")
    public void method2063(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1726 = arg0;
    }

    @ObfuscatedName("ds.i(I)J")
    public long method2064() {
        return this.field1725;
    }

    @ObfuscatedName("ds.u([BI)V")
    public void method2071(byte[] arg0) throws IOException {
        this.method2065(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ds.g([BIII)V")
    public void method2065(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1724 != -1L && this.field1726 >= this.field1724 && this.field1726 + (long) arg2 <= this.field1724 + (long) this.field1722) {
                System.arraycopy(this.field1720, (int) (this.field1726 - this.field1724), arg0, arg1, arg2);
                this.field1726 += (long) arg2;
                return;
            }
            long var4 = this.field1726;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1726 >= this.field1718 && this.field1726 < this.field1718 + (long) this.field1719) {
                int var8 = (int) ((long) this.field1719 - (this.field1726 - this.field1718));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1717, (int) (this.field1726 - this.field1718), arg0, arg1, var8);
                this.field1726 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1717.length) {
                this.field1723.method2091(this.field1726);
                this.field1721 = this.field1726;
                while (arg2 > 0) {
                    int var9 = this.field1723.method2095(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1721 += (long) var9;
                    this.field1726 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2066();
                int var10 = arg2;
                if (arg2 > this.field1719) {
                    var10 = this.field1719;
                }
                System.arraycopy(this.field1717, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1726 += (long) var10;
            }
            if (this.field1724 != -1L) {
                if (this.field1724 > this.field1726 && arg2 > 0) {
                    int var11 = (int) (this.field1724 - this.field1726) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1726++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1724 >= var4 && this.field1724 < (long) var7 + var4) {
                    var12 = this.field1724;
                } else if (var4 >= this.field1724 && var4 < this.field1724 + (long) this.field1722) {
                    var12 = var4;
                }
                if (this.field1724 + (long) this.field1722 > var4 && this.field1724 + (long) this.field1722 <= (long) var7 + var4) {
                    var14 = this.field1724 + (long) this.field1722;
                } else if ((long) var7 + var4 > this.field1724 && (long) var7 + var4 <= this.field1724 + (long) this.field1722) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1720, (int) (var12 - this.field1724), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1726) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1726));
                        this.field1726 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1721 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ds.m(B)V")
    public void method2066() throws IOException {
        this.field1719 = 0;
        if (this.field1726 != this.field1721) {
            this.field1723.method2091(this.field1726);
            this.field1721 = this.field1726;
        }
        this.field1718 = this.field1726;
        while (this.field1719 < this.field1717.length) {
            int var1 = this.field1723.method2095(this.field1717, this.field1719, this.field1717.length - this.field1719);
            if (var1 == -1) {
                break;
            }
            this.field1721 += (long) var1;
            this.field1719 += var1;
        }
    }

    @ObfuscatedName("ds.s([BIIB)V")
    public void method2068(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1726 + (long) arg2 > this.field1725) {
                this.field1725 = this.field1726 + (long) arg2;
            }
            if (this.field1724 != -1L && (this.field1726 < this.field1724 || this.field1726 > this.field1724 + (long) this.field1722)) {
                this.method2062();
            }
            if (this.field1724 != -1L && this.field1726 + (long) arg2 > this.field1724 + (long) this.field1720.length) {
                int var4 = (int) ((long) this.field1720.length - (this.field1726 - this.field1724));
                System.arraycopy(arg0, arg1, this.field1720, (int) (this.field1726 - this.field1724), var4);
                this.field1726 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1722 = this.field1720.length;
                this.method2062();
            }
            if (arg2 > this.field1720.length) {
                if (this.field1726 != this.field1721) {
                    this.field1723.method2091(this.field1726);
                    this.field1721 = this.field1726;
                }
                this.field1723.method2093(arg0, arg1, arg2);
                this.field1721 += (long) arg2;
                if (this.field1721 > this.field1716) {
                    this.field1716 = this.field1721;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1726 >= this.field1718 && this.field1726 < this.field1718 + (long) this.field1719) {
                    var5 = this.field1726;
                } else if (this.field1718 >= this.field1726 && this.field1718 < this.field1726 + (long) arg2) {
                    var5 = this.field1718;
                }
                if (this.field1726 + (long) arg2 > this.field1718 && this.field1726 + (long) arg2 <= this.field1718 + (long) this.field1719) {
                    var7 = this.field1726 + (long) arg2;
                } else if (this.field1718 + (long) this.field1719 > this.field1726 && this.field1718 + (long) this.field1719 <= this.field1726 + (long) arg2) {
                    var7 = this.field1718 + (long) this.field1719;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1726), this.field1717, (int) (var5 - this.field1718), var9);
                }
                this.field1726 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1724 == -1L) {
                    this.field1724 = this.field1726;
                }
                System.arraycopy(arg0, arg1, this.field1720, (int) (this.field1726 - this.field1724), arg2);
                this.field1726 += (long) arg2;
                if (this.field1726 - this.field1724 > (long) this.field1722) {
                    this.field1722 = (int) (this.field1726 - this.field1724);
                }
            }
        } catch (IOException var11) {
            this.field1721 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ds.x(I)V")
    public void method2062() throws IOException {
        if (this.field1724 == -1L) {
            return;
        }
        if (this.field1724 != this.field1721) {
            this.field1723.method2091(this.field1724);
            this.field1721 = this.field1724;
        }
        this.field1723.method2093(this.field1720, 0, this.field1722);
        this.field1721 += (long) (this.field1722 * 494785959) * 1066762775L;
        if (this.field1721 > this.field1716) {
            this.field1716 = this.field1721;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1724 >= this.field1718 && this.field1724 < this.field1718 + (long) this.field1719) {
            var1 = this.field1724;
        } else if (this.field1718 >= this.field1724 && this.field1718 < this.field1724 + (long) this.field1722) {
            var1 = this.field1718;
        }
        if (this.field1724 + (long) this.field1722 > this.field1718 && this.field1724 + (long) this.field1722 <= this.field1718 + (long) this.field1719) {
            var3 = this.field1724 + (long) this.field1722;
        } else if (this.field1718 + (long) this.field1719 > this.field1724 && this.field1718 + (long) this.field1719 <= this.field1724 + (long) this.field1722) {
            var3 = this.field1718 + (long) this.field1719;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1720, (int) (var1 - this.field1724), this.field1717, (int) (var1 - this.field1718), var5);
        }
        this.field1724 = -1L;
        this.field1722 = 0;
    }
}
