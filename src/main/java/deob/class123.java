package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dv")
public class class123 {

    @ObfuscatedName("dv.a")
    public class124 field1649;

    @ObfuscatedName("dv.w")
    public byte[] field1647;

    @ObfuscatedName("dv.e")
    public long field1658 = -1L;

    @ObfuscatedName("dv.k")
    public int field1650;

    @ObfuscatedName("dv.u")
    public byte[] field1651;

    @ObfuscatedName("dv.z")
    public long field1652 = -1L;

    @ObfuscatedName("dv.t")
    public int field1653 = 0;

    @ObfuscatedName("dv.f")
    public long field1654;

    @ObfuscatedName("dv.g")
    public long field1655;

    @ObfuscatedName("dv.j")
    public long field1656;

    @ObfuscatedName("dv.x")
    public long field1648;

    public class123(class124 arg0, int arg1, int arg2) throws IOException {
        this.field1649 = arg0;
        this.field1656 = this.field1655 = arg0.method2149();
        this.field1647 = new byte[arg1];
        this.field1651 = new byte[arg2];
        this.field1654 = 0L;
    }

    @ObfuscatedName("dv.a(I)V")
    public void method2128() throws IOException {
        this.method2112();
        this.field1649.method2147();
    }

    @ObfuscatedName("dv.w(J)V")
    public void method2114(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1654 = arg0;
    }

    @ObfuscatedName("dv.e(I)J")
    public long method2115() {
        return this.field1656;
    }

    @ObfuscatedName("dv.k([BI)V")
    public void method2113(byte[] arg0) throws IOException {
        this.method2117(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dv.u([BIIB)V")
    public void method2117(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1652 != -1L && this.field1654 >= this.field1652 && this.field1654 + (long) arg2 <= this.field1652 + (long) this.field1653) {
                System.arraycopy(this.field1651, (int) (this.field1654 - this.field1652), arg0, arg1, arg2);
                this.field1654 += (long) arg2;
                return;
            }
            long var4 = this.field1654;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1654 >= this.field1658 && this.field1654 < this.field1658 + (long) this.field1650) {
                int var8 = (int) ((long) this.field1650 - (this.field1654 - this.field1658));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1647, (int) (this.field1654 - this.field1658), arg0, arg1, var8);
                this.field1654 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1647.length) {
                this.field1649.method2165(this.field1654);
                this.field1648 = this.field1654;
                while (arg2 > 0) {
                    int var9 = this.field1649.method2169(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1648 += (long) var9;
                    this.field1654 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2125();
                int var10 = arg2;
                if (arg2 > this.field1650) {
                    var10 = this.field1650;
                }
                System.arraycopy(this.field1647, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1654 += (long) var10;
            }
            if (this.field1652 != -1L) {
                if (this.field1652 > this.field1654 && arg2 > 0) {
                    int var11 = (int) (this.field1652 - this.field1654) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1654++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1652 >= var4 && this.field1652 < (long) var7 + var4) {
                    var12 = this.field1652;
                } else if (var4 >= this.field1652 && var4 < this.field1652 + (long) this.field1653) {
                    var12 = var4;
                }
                if (this.field1652 + (long) this.field1653 > var4 && this.field1652 + (long) this.field1653 <= (long) var7 + var4) {
                    var14 = this.field1652 + (long) this.field1653;
                } else if ((long) var7 + var4 > this.field1652 && (long) var7 + var4 <= this.field1652 + (long) this.field1653) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1651, (int) (var12 - this.field1652), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1654) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1654));
                        this.field1654 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1648 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dv.z(S)V")
    public void method2125() throws IOException {
        this.field1650 = 0;
        if (this.field1654 != this.field1648) {
            this.field1649.method2165(this.field1654);
            this.field1648 = this.field1654;
        }
        this.field1658 = this.field1654;
        while (this.field1650 < this.field1647.length) {
            int var1 = this.field1649.method2169(this.field1647, this.field1650, this.field1647.length - this.field1650);
            if (var1 == -1) {
                break;
            }
            this.field1648 += (long) var1;
            this.field1650 += var1;
        }
    }

    @ObfuscatedName("dv.t([BIIB)V")
    public void method2116(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1654 + (long) arg2 > this.field1656) {
                this.field1656 = this.field1654 + (long) arg2;
            }
            if (this.field1652 != -1L && (this.field1654 < this.field1652 || this.field1654 > this.field1652 + (long) this.field1653)) {
                this.method2112();
            }
            if (this.field1652 != -1L && this.field1654 + (long) arg2 > this.field1652 + (long) this.field1651.length) {
                int var4 = (int) ((long) this.field1651.length - (this.field1654 - this.field1652));
                System.arraycopy(arg0, arg1, this.field1651, (int) (this.field1654 - this.field1652), var4);
                this.field1654 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1653 = this.field1651.length;
                this.method2112();
            }
            if (arg2 > this.field1651.length) {
                if (this.field1654 != this.field1648) {
                    this.field1649.method2165(this.field1654);
                    this.field1648 = this.field1654;
                }
                this.field1649.method2146(arg0, arg1, arg2);
                this.field1648 += (long) arg2;
                if (this.field1648 > this.field1655) {
                    this.field1655 = this.field1648;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1654 >= this.field1658 && this.field1654 < this.field1658 + (long) this.field1650) {
                    var5 = this.field1654;
                } else if (this.field1658 >= this.field1654 && this.field1658 < this.field1654 + (long) arg2) {
                    var5 = this.field1658;
                }
                if (this.field1654 + (long) arg2 > this.field1658 && this.field1654 + (long) arg2 <= this.field1658 + (long) this.field1650) {
                    var7 = this.field1654 + (long) arg2;
                } else if (this.field1658 + (long) this.field1650 > this.field1654 && this.field1658 + (long) this.field1650 <= this.field1654 + (long) arg2) {
                    var7 = this.field1658 + (long) this.field1650;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1654), this.field1647, (int) (var5 - this.field1658), var9);
                }
                this.field1654 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1652 == -1L) {
                    this.field1652 = this.field1654;
                }
                System.arraycopy(arg0, arg1, this.field1651, (int) (this.field1654 - this.field1652), arg2);
                this.field1654 += (long) arg2;
                if (this.field1654 - this.field1652 > (long) this.field1653) {
                    this.field1653 = (int) (this.field1654 - this.field1652);
                }
            }
        } catch (IOException var11) {
            this.field1648 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dv.f(I)V")
    public void method2112() throws IOException {
        if (this.field1652 == -1L) {
            return;
        }
        if (this.field1652 != this.field1648) {
            this.field1649.method2165(this.field1652);
            this.field1648 = this.field1652;
        }
        this.field1649.method2146(this.field1651, 0, this.field1653);
        this.field1648 += (long) (this.field1653 * 1250397345) * 574183265L;
        if (this.field1648 > this.field1655) {
            this.field1655 = this.field1648;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1652 >= this.field1658 && this.field1652 < this.field1658 + (long) this.field1650) {
            var1 = this.field1652;
        } else if (this.field1658 >= this.field1652 && this.field1658 < this.field1652 + (long) this.field1653) {
            var1 = this.field1658;
        }
        if (this.field1652 + (long) this.field1653 > this.field1658 && this.field1652 + (long) this.field1653 <= this.field1658 + (long) this.field1650) {
            var3 = this.field1652 + (long) this.field1653;
        } else if (this.field1658 + (long) this.field1650 > this.field1652 && this.field1658 + (long) this.field1650 <= this.field1652 + (long) this.field1653) {
            var3 = this.field1658 + (long) this.field1650;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1651, (int) (var1 - this.field1652), this.field1647, (int) (var1 - this.field1658), var5);
        }
        this.field1652 = -1L;
        this.field1653 = 0;
    }
}
