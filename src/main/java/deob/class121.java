package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("db")
public class class121 {

    @ObfuscatedName("db.p")
    public class122 field1646;

    @ObfuscatedName("db.i")
    public byte[] field1634;

    @ObfuscatedName("db.w")
    public long field1636 = -1L;

    @ObfuscatedName("db.s")
    public int field1635;

    @ObfuscatedName("db.j")
    public byte[] field1638;

    @ObfuscatedName("db.a")
    public long field1637 = -1L;

    @ObfuscatedName("db.t")
    public int field1644 = 0;

    @ObfuscatedName("db.r")
    public long field1641;

    @ObfuscatedName("db.m")
    public long field1639;

    @ObfuscatedName("db.h")
    public long field1643;

    @ObfuscatedName("db.o")
    public long field1642;

    public class121(class122 arg0, int arg1, int arg2) throws IOException {
        this.field1646 = arg0;
        this.field1643 = this.field1639 = arg0.method2309();
        this.field1634 = new byte[arg1];
        this.field1638 = new byte[arg2];
        this.field1641 = 0L;
    }

    @ObfuscatedName("db.p(B)V")
    public void method2277() throws IOException {
        this.method2284();
        this.field1646.method2312();
    }

    @ObfuscatedName("db.i(J)V")
    public void method2276(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1641 = arg0;
    }

    @ObfuscatedName("db.w(I)J")
    public long method2279() {
        return this.field1643;
    }

    @ObfuscatedName("db.s([BI)V")
    public void method2280(byte[] arg0) throws IOException {
        this.method2292(arg0, 0, arg0.length);
    }

    @ObfuscatedName("db.j([BIIB)V")
    public void method2292(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1637 != -1L && this.field1641 >= this.field1637 && this.field1641 + (long) arg2 <= this.field1637 + (long) this.field1644) {
                System.arraycopy(this.field1638, (int) (this.field1641 - this.field1637), arg0, arg1, arg2);
                this.field1641 += (long) arg2;
                return;
            }
            long var4 = this.field1641;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1641 >= this.field1636 && this.field1641 < this.field1636 + (long) this.field1635) {
                int var8 = (int) ((long) this.field1635 - (this.field1641 - this.field1636));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1634, (int) (this.field1641 - this.field1636), arg0, arg1, var8);
                this.field1641 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1634.length) {
                this.field1646.method2310(this.field1641);
                this.field1642 = this.field1641;
                while (arg2 > 0) {
                    int var9 = this.field1646.method2315(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1642 += (long) var9;
                    this.field1641 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2282();
                int var10 = arg2;
                if (arg2 > this.field1635) {
                    var10 = this.field1635;
                }
                System.arraycopy(this.field1634, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1641 += (long) var10;
            }
            if (this.field1637 != -1L) {
                if (this.field1637 > this.field1641 && arg2 > 0) {
                    int var11 = (int) (this.field1637 - this.field1641) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1641++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1637 >= var4 && this.field1637 < (long) var7 + var4) {
                    var12 = this.field1637;
                } else if (var4 >= this.field1637 && var4 < this.field1637 + (long) this.field1644) {
                    var12 = var4;
                }
                if (this.field1637 + (long) this.field1644 > var4 && this.field1637 + (long) this.field1644 <= (long) var7 + var4) {
                    var14 = this.field1637 + (long) this.field1644;
                } else if ((long) var7 + var4 > this.field1637 && (long) var7 + var4 <= this.field1637 + (long) this.field1644) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1638, (int) (var12 - this.field1637), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1641) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1641));
                        this.field1641 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1642 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("db.a(I)V")
    public void method2282() throws IOException {
        this.field1635 = 0;
        if (this.field1642 != this.field1641) {
            this.field1646.method2310(this.field1641);
            this.field1642 = this.field1641;
        }
        this.field1636 = this.field1641;
        while (this.field1635 < this.field1634.length) {
            int var1 = this.field1646.method2315(this.field1634, this.field1635, this.field1634.length - this.field1635);
            if (var1 == -1) {
                break;
            }
            this.field1642 += (long) var1;
            this.field1635 += var1;
        }
    }

    @ObfuscatedName("db.t([BIIB)V")
    public void method2283(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1641 + (long) arg2 > this.field1643) {
                this.field1643 = this.field1641 + (long) arg2;
            }
            if (this.field1637 != -1L && (this.field1641 < this.field1637 || this.field1641 > this.field1637 + (long) this.field1644)) {
                this.method2284();
            }
            if (this.field1637 != -1L && this.field1641 + (long) arg2 > this.field1637 + (long) this.field1638.length) {
                int var4 = (int) ((long) this.field1638.length - (this.field1641 - this.field1637));
                System.arraycopy(arg0, arg1, this.field1638, (int) (this.field1641 - this.field1637), var4);
                this.field1641 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1644 = this.field1638.length;
                this.method2284();
            }
            if (arg2 > this.field1638.length) {
                if (this.field1642 != this.field1641) {
                    this.field1646.method2310(this.field1641);
                    this.field1642 = this.field1641;
                }
                this.field1646.method2311(arg0, arg1, arg2);
                this.field1642 += (long) arg2;
                if (this.field1642 > this.field1639) {
                    this.field1639 = this.field1642;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1641 >= this.field1636 && this.field1641 < this.field1636 + (long) this.field1635) {
                    var5 = this.field1641;
                } else if (this.field1636 >= this.field1641 && this.field1636 < this.field1641 + (long) arg2) {
                    var5 = this.field1636;
                }
                if (this.field1641 + (long) arg2 > this.field1636 && this.field1641 + (long) arg2 <= this.field1636 + (long) this.field1635) {
                    var7 = this.field1641 + (long) arg2;
                } else if (this.field1636 + (long) this.field1635 > this.field1641 && this.field1636 + (long) this.field1635 <= this.field1641 + (long) arg2) {
                    var7 = this.field1636 + (long) this.field1635;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1641), this.field1634, (int) (var5 - this.field1636), var9);
                }
                this.field1641 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1637 == -1L) {
                    this.field1637 = this.field1641;
                }
                System.arraycopy(arg0, arg1, this.field1638, (int) (this.field1641 - this.field1637), arg2);
                this.field1641 += (long) arg2;
                if (this.field1641 - this.field1637 > (long) this.field1644) {
                    this.field1644 = (int) (this.field1641 - this.field1637);
                }
            }
        } catch (IOException var11) {
            this.field1642 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("db.r(B)V")
    public void method2284() throws IOException {
        if (this.field1637 == -1L) {
            return;
        }
        if (this.field1642 != this.field1637) {
            this.field1646.method2310(this.field1637);
            this.field1642 = this.field1637;
        }
        this.field1646.method2311(this.field1638, 0, this.field1644);
        this.field1642 += (long) (this.field1644 * 1904176063) * 2137687103L;
        if (this.field1642 > this.field1639) {
            this.field1639 = this.field1642;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1637 >= this.field1636 && this.field1637 < this.field1636 + (long) this.field1635) {
            var1 = this.field1637;
        } else if (this.field1636 >= this.field1637 && this.field1636 < this.field1637 + (long) this.field1644) {
            var1 = this.field1636;
        }
        if (this.field1637 + (long) this.field1644 > this.field1636 && this.field1637 + (long) this.field1644 <= this.field1636 + (long) this.field1635) {
            var3 = this.field1637 + (long) this.field1644;
        } else if (this.field1636 + (long) this.field1635 > this.field1637 && this.field1636 + (long) this.field1635 <= this.field1637 + (long) this.field1644) {
            var3 = this.field1636 + (long) this.field1635;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1638, (int) (var1 - this.field1637), this.field1634, (int) (var1 - this.field1636), var5);
        }
        this.field1637 = -1L;
        this.field1644 = 0;
    }
}
