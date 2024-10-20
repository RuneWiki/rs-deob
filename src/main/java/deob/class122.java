package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dv")
public class class122 {

    @ObfuscatedName("dv.w")
    public class123 field1749;

    @ObfuscatedName("dv.s")
    public byte[] field1740;

    @ObfuscatedName("dv.q")
    public long field1743 = -1L;

    @ObfuscatedName("dv.o")
    public int field1742;

    @ObfuscatedName("dv.g")
    public byte[] field1747;

    @ObfuscatedName("dv.v")
    public long field1744 = -1L;

    @ObfuscatedName("dv.p")
    public int field1745 = 0;

    @ObfuscatedName("dv.e")
    public long field1739;

    @ObfuscatedName("dv.d")
    public long field1741;

    @ObfuscatedName("dv.x")
    public long field1748;

    @ObfuscatedName("dv.z")
    public long field1751;

    public class122(class123 arg0, int arg1, int arg2) throws IOException {
        this.field1749 = arg0;
        this.field1748 = this.field1741 = arg0.method2207();
        this.field1740 = new byte[arg1];
        this.field1747 = new byte[arg2];
        this.field1739 = 0L;
    }

    @ObfuscatedName("dv.w(I)V")
    public void method2198() throws IOException {
        this.method2183();
        this.field1749.method2222();
    }

    @ObfuscatedName("dv.s(J)V")
    public void method2177(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1739 = arg0;
    }

    @ObfuscatedName("dv.q(I)J")
    public long method2192() {
        return this.field1748;
    }

    @ObfuscatedName("dv.o([BB)V")
    public void method2179(byte[] arg0) throws IOException {
        this.method2180(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dv.g([BIII)V")
    public void method2180(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1744 != -1L && this.field1739 >= this.field1744 && this.field1739 + (long) arg2 <= this.field1744 + (long) this.field1745) {
                System.arraycopy(this.field1747, (int) (this.field1739 - this.field1744), arg0, arg1, arg2);
                this.field1739 += (long) arg2;
                return;
            }
            long var4 = this.field1739;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1739 >= this.field1743 && this.field1739 < this.field1743 + (long) this.field1742) {
                int var8 = (int) ((long) this.field1742 - (this.field1739 - this.field1743));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1740, (int) (this.field1739 - this.field1743), arg0, arg1, var8);
                this.field1739 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1740.length) {
                this.field1749.method2213(this.field1739);
                this.field1751 = this.field1739;
                while (arg2 > 0) {
                    int var9 = this.field1749.method2208(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1751 += (long) var9;
                    this.field1739 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2181();
                int var10 = arg2;
                if (arg2 > this.field1742) {
                    var10 = this.field1742;
                }
                System.arraycopy(this.field1740, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1739 += (long) var10;
            }
            if (this.field1744 != -1L) {
                if (this.field1744 > this.field1739 && arg2 > 0) {
                    int var11 = (int) (this.field1744 - this.field1739) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1739++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1744 >= var4 && this.field1744 < (long) var7 + var4) {
                    var12 = this.field1744;
                } else if (var4 >= this.field1744 && var4 < this.field1744 + (long) this.field1745) {
                    var12 = var4;
                }
                if (this.field1744 + (long) this.field1745 > var4 && this.field1744 + (long) this.field1745 <= (long) var7 + var4) {
                    var14 = this.field1744 + (long) this.field1745;
                } else if ((long) var7 + var4 > this.field1744 && (long) var7 + var4 <= this.field1744 + (long) this.field1745) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1747, (int) (var12 - this.field1744), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1739) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1739));
                        this.field1739 = var14;
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

    @ObfuscatedName("dv.v(B)V")
    public void method2181() throws IOException {
        this.field1742 = 0;
        if (this.field1751 != this.field1739) {
            this.field1749.method2213(this.field1739);
            this.field1751 = this.field1739;
        }
        this.field1743 = this.field1739;
        while (this.field1742 < this.field1740.length) {
            int var1 = this.field1749.method2208(this.field1740, this.field1742, this.field1740.length - this.field1742);
            if (var1 == -1) {
                break;
            }
            this.field1751 += (long) var1;
            this.field1742 += var1;
        }
    }

    @ObfuscatedName("dv.p([BIII)V")
    public void method2182(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1739 + (long) arg2 > this.field1748) {
                this.field1748 = this.field1739 + (long) arg2;
            }
            if (this.field1744 != -1L && (this.field1739 < this.field1744 || this.field1739 > this.field1744 + (long) this.field1745)) {
                this.method2183();
            }
            if (this.field1744 != -1L && this.field1739 + (long) arg2 > this.field1744 + (long) this.field1747.length) {
                int var4 = (int) ((long) this.field1747.length - (this.field1739 - this.field1744));
                System.arraycopy(arg0, arg1, this.field1747, (int) (this.field1739 - this.field1744), var4);
                this.field1739 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1745 = this.field1747.length;
                this.method2183();
            }
            if (arg2 > this.field1747.length) {
                if (this.field1751 != this.field1739) {
                    this.field1749.method2213(this.field1739);
                    this.field1751 = this.field1739;
                }
                this.field1749.method2204(arg0, arg1, arg2);
                this.field1751 += (long) arg2;
                if (this.field1751 > this.field1741) {
                    this.field1741 = this.field1751;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1739 >= this.field1743 && this.field1739 < this.field1743 + (long) this.field1742) {
                    var5 = this.field1739;
                } else if (this.field1743 >= this.field1739 && this.field1743 < this.field1739 + (long) arg2) {
                    var5 = this.field1743;
                }
                if (this.field1739 + (long) arg2 > this.field1743 && this.field1739 + (long) arg2 <= this.field1743 + (long) this.field1742) {
                    var7 = this.field1739 + (long) arg2;
                } else if (this.field1743 + (long) this.field1742 > this.field1739 && this.field1743 + (long) this.field1742 <= this.field1739 + (long) arg2) {
                    var7 = this.field1743 + (long) this.field1742;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1739), this.field1740, (int) (var5 - this.field1743), var9);
                }
                this.field1739 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1744 == -1L) {
                    this.field1744 = this.field1739;
                }
                System.arraycopy(arg0, arg1, this.field1747, (int) (this.field1739 - this.field1744), arg2);
                this.field1739 += (long) arg2;
                if (this.field1739 - this.field1744 > (long) this.field1745) {
                    this.field1745 = (int) (this.field1739 - this.field1744);
                }
            }
        } catch (IOException var11) {
            this.field1751 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dv.e(B)V")
    public void method2183() throws IOException {
        if (this.field1744 == -1L) {
            return;
        }
        if (this.field1751 != this.field1744) {
            this.field1749.method2213(this.field1744);
            this.field1751 = this.field1744;
        }
        this.field1749.method2204(this.field1747, 0, this.field1745);
        this.field1751 += (long) (this.field1745 * -1217714817) * -1682531713L;
        if (this.field1751 > this.field1741) {
            this.field1741 = this.field1751;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1744 >= this.field1743 && this.field1744 < this.field1743 + (long) this.field1742) {
            var1 = this.field1744;
        } else if (this.field1743 >= this.field1744 && this.field1743 < this.field1744 + (long) this.field1745) {
            var1 = this.field1743;
        }
        if (this.field1744 + (long) this.field1745 > this.field1743 && this.field1744 + (long) this.field1745 <= this.field1743 + (long) this.field1742) {
            var3 = this.field1744 + (long) this.field1745;
        } else if (this.field1743 + (long) this.field1742 > this.field1744 && this.field1743 + (long) this.field1742 <= this.field1744 + (long) this.field1745) {
            var3 = this.field1743 + (long) this.field1742;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1747, (int) (var1 - this.field1744), this.field1740, (int) (var1 - this.field1743), var5);
        }
        this.field1744 = -1L;
        this.field1745 = 0;
    }
}
