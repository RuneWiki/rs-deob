package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("de")
public class class121 {

    @ObfuscatedName("de.b")
    public class122 field1647;

    @ObfuscatedName("de.q")
    public byte[] field1637;

    @ObfuscatedName("de.o")
    public long field1638 = -1L;

    @ObfuscatedName("de.p")
    public int field1639;

    @ObfuscatedName("de.a")
    public byte[] field1640;

    @ObfuscatedName("de.h")
    public long field1641 = -1L;

    @ObfuscatedName("de.l")
    public int field1643 = 0;

    @ObfuscatedName("de.y")
    public long field1636;

    @ObfuscatedName("de.g")
    public long field1644;

    @ObfuscatedName("de.c")
    public long field1645;

    @ObfuscatedName("de.u")
    public long field1646;

    public class121(class122 arg0, int arg1, int arg2) throws IOException {
        this.field1647 = arg0;
        this.field1645 = this.field1644 = arg0.method2359();
        this.field1637 = new byte[arg1];
        this.field1640 = new byte[arg2];
        this.field1636 = 0L;
    }

    @ObfuscatedName("de.b(I)V")
    public void method2303() throws IOException {
        this.method2330();
        this.field1647.method2335();
    }

    @ObfuscatedName("de.q(J)V")
    public void method2332(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1636 = arg0;
    }

    @ObfuscatedName("de.o(B)J")
    public long method2305() {
        return this.field1645;
    }

    @ObfuscatedName("de.p([BB)V")
    public void method2307(byte[] arg0) throws IOException {
        this.method2316(arg0, 0, arg0.length);
    }

    @ObfuscatedName("de.a([BIII)V")
    public void method2316(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1641 != -1L && this.field1636 >= this.field1641 && this.field1636 + (long) arg2 <= this.field1641 + (long) this.field1643) {
                System.arraycopy(this.field1640, (int) (this.field1636 - this.field1641), arg0, arg1, arg2);
                this.field1636 += (long) arg2;
                return;
            }
            long var4 = this.field1636;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1636 >= this.field1638 && this.field1636 < this.field1638 + (long) this.field1639) {
                int var8 = (int) ((long) this.field1639 - (this.field1636 - this.field1638));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1637, (int) (this.field1636 - this.field1638), arg0, arg1, var8);
                this.field1636 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1637.length) {
                this.field1647.method2342(this.field1636);
                this.field1646 = this.field1636;
                while (arg2 > 0) {
                    int var9 = this.field1647.method2340(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1646 += (long) var9;
                    this.field1636 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2308();
                int var10 = arg2;
                if (arg2 > this.field1639) {
                    var10 = this.field1639;
                }
                System.arraycopy(this.field1637, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1636 += (long) var10;
            }
            if (this.field1641 != -1L) {
                if (this.field1641 > this.field1636 && arg2 > 0) {
                    int var11 = (int) (this.field1641 - this.field1636) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1636++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1641 >= var4 && this.field1641 < (long) var7 + var4) {
                    var12 = this.field1641;
                } else if (var4 >= this.field1641 && var4 < this.field1641 + (long) this.field1643) {
                    var12 = var4;
                }
                if (this.field1641 + (long) this.field1643 > var4 && this.field1641 + (long) this.field1643 <= (long) var7 + var4) {
                    var14 = this.field1641 + (long) this.field1643;
                } else if ((long) var7 + var4 > this.field1641 && (long) var7 + var4 <= this.field1641 + (long) this.field1643) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1640, (int) (var12 - this.field1641), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1636) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1636));
                        this.field1636 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1646 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("de.h(I)V")
    public void method2308() throws IOException {
        this.field1639 = 0;
        if (this.field1646 != this.field1636) {
            this.field1647.method2342(this.field1636);
            this.field1646 = this.field1636;
        }
        this.field1638 = this.field1636;
        while (this.field1639 < this.field1637.length) {
            int var1 = this.field1647.method2340(this.field1637, this.field1639, this.field1637.length - this.field1639);
            if (var1 == -1) {
                break;
            }
            this.field1646 += (long) var1;
            this.field1639 += var1;
        }
    }

    @ObfuscatedName("de.l([BIII)V")
    public void method2309(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1636 + (long) arg2 > this.field1645) {
                this.field1645 = this.field1636 + (long) arg2;
            }
            if (this.field1641 != -1L && (this.field1636 < this.field1641 || this.field1636 > this.field1641 + (long) this.field1643)) {
                this.method2330();
            }
            if (this.field1641 != -1L && this.field1636 + (long) arg2 > this.field1641 + (long) this.field1640.length) {
                int var4 = (int) ((long) this.field1640.length - (this.field1636 - this.field1641));
                System.arraycopy(arg0, arg1, this.field1640, (int) (this.field1636 - this.field1641), var4);
                this.field1636 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1643 = this.field1640.length;
                this.method2330();
            }
            if (arg2 > this.field1640.length) {
                if (this.field1646 != this.field1636) {
                    this.field1647.method2342(this.field1636);
                    this.field1646 = this.field1636;
                }
                this.field1647.method2336(arg0, arg1, arg2);
                this.field1646 += (long) arg2;
                if (this.field1646 > this.field1644) {
                    this.field1644 = this.field1646;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1636 >= this.field1638 && this.field1636 < this.field1638 + (long) this.field1639) {
                    var5 = this.field1636;
                } else if (this.field1638 >= this.field1636 && this.field1638 < this.field1636 + (long) arg2) {
                    var5 = this.field1638;
                }
                if (this.field1636 + (long) arg2 > this.field1638 && this.field1636 + (long) arg2 <= this.field1638 + (long) this.field1639) {
                    var7 = this.field1636 + (long) arg2;
                } else if (this.field1638 + (long) this.field1639 > this.field1636 && this.field1638 + (long) this.field1639 <= this.field1636 + (long) arg2) {
                    var7 = this.field1638 + (long) this.field1639;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1636), this.field1637, (int) (var5 - this.field1638), var9);
                }
                this.field1636 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1641 == -1L) {
                    this.field1641 = this.field1636;
                }
                System.arraycopy(arg0, arg1, this.field1640, (int) (this.field1636 - this.field1641), arg2);
                this.field1636 += (long) arg2;
                if (this.field1636 - this.field1641 > (long) this.field1643) {
                    this.field1643 = (int) (this.field1636 - this.field1641);
                }
            }
        } catch (IOException var11) {
            this.field1646 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("de.y(I)V")
    public void method2330() throws IOException {
        if (this.field1641 == -1L) {
            return;
        }
        if (this.field1646 != this.field1641) {
            this.field1647.method2342(this.field1641);
            this.field1646 = this.field1641;
        }
        this.field1647.method2336(this.field1640, 0, this.field1643);
        this.field1646 += (long) (this.field1643 * 1507357625) * -1226333559L;
        if (this.field1646 > this.field1644) {
            this.field1644 = this.field1646;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1641 >= this.field1638 && this.field1641 < this.field1638 + (long) this.field1639) {
            var1 = this.field1641;
        } else if (this.field1638 >= this.field1641 && this.field1638 < this.field1641 + (long) this.field1643) {
            var1 = this.field1638;
        }
        if (this.field1641 + (long) this.field1643 > this.field1638 && this.field1641 + (long) this.field1643 <= this.field1638 + (long) this.field1639) {
            var3 = this.field1641 + (long) this.field1643;
        } else if (this.field1638 + (long) this.field1639 > this.field1641 && this.field1638 + (long) this.field1639 <= this.field1641 + (long) this.field1643) {
            var3 = this.field1638 + (long) this.field1639;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1640, (int) (var1 - this.field1641), this.field1637, (int) (var1 - this.field1638), var5);
        }
        this.field1641 = -1L;
        this.field1643 = 0;
    }
}
