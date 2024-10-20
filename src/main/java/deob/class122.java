package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dq")
public class class122 {

    @ObfuscatedName("dq.c")
    public class123 field1685;

    @ObfuscatedName("dq.i")
    public byte[] field1674;

    @ObfuscatedName("dq.o")
    public long field1676 = -1L;

    @ObfuscatedName("dq.j")
    public int field1682;

    @ObfuscatedName("dq.k")
    public byte[] field1678;

    @ObfuscatedName("dq.x")
    public long field1679 = -1L;

    @ObfuscatedName("dq.z")
    public int field1680 = 0;

    @ObfuscatedName("dq.p")
    public long field1675;

    @ObfuscatedName("dq.w")
    public long field1681;

    @ObfuscatedName("dq.r")
    public long field1683;

    @ObfuscatedName("dq.d")
    public long field1684;

    public class122(class123 arg0, int arg1, int arg2) throws IOException {
        this.field1685 = arg0;
        this.field1683 = this.field1681 = arg0.method2325();
        this.field1674 = new byte[arg1];
        this.field1678 = new byte[arg2];
        this.field1675 = 0L;
    }

    @ObfuscatedName("dq.c(I)V")
    public void method2292() throws IOException {
        this.method2298();
        this.field1685.method2323();
    }

    @ObfuscatedName("dq.i(J)V")
    public void method2293(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1675 = arg0;
    }

    @ObfuscatedName("dq.o(I)J")
    public long method2319() {
        return this.field1683;
    }

    @ObfuscatedName("dq.j([BI)V")
    public void method2294(byte[] arg0) throws IOException {
        this.method2295(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dq.k([BIII)V")
    public void method2295(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1679 != -1L && this.field1675 >= this.field1679 && this.field1675 + (long) arg2 <= this.field1679 + (long) this.field1680) {
                System.arraycopy(this.field1678, (int) (this.field1675 - this.field1679), arg0, arg1, arg2);
                this.field1675 += (long) arg2;
                return;
            }
            long var4 = this.field1675;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1675 >= this.field1676 && this.field1675 < this.field1676 + (long) this.field1682) {
                int var8 = (int) ((long) this.field1682 - (this.field1675 - this.field1676));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1674, (int) (this.field1675 - this.field1676), arg0, arg1, var8);
                this.field1675 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1674.length) {
                this.field1685.method2321(this.field1675);
                this.field1684 = this.field1675;
                while (arg2 > 0) {
                    int var9 = this.field1685.method2326(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1684 += (long) var9;
                    this.field1675 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2308();
                int var10 = arg2;
                if (arg2 > this.field1682) {
                    var10 = this.field1682;
                }
                System.arraycopy(this.field1674, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1675 += (long) var10;
            }
            if (this.field1679 != -1L) {
                if (this.field1679 > this.field1675 && arg2 > 0) {
                    int var11 = (int) (this.field1679 - this.field1675) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1675++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1679 >= var4 && this.field1679 < (long) var7 + var4) {
                    var12 = this.field1679;
                } else if (var4 >= this.field1679 && var4 < this.field1679 + (long) this.field1680) {
                    var12 = var4;
                }
                if (this.field1679 + (long) this.field1680 > var4 && this.field1679 + (long) this.field1680 <= (long) var7 + var4) {
                    var14 = this.field1679 + (long) this.field1680;
                } else if ((long) var7 + var4 > this.field1679 && (long) var7 + var4 <= this.field1679 + (long) this.field1680) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1678, (int) (var12 - this.field1679), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1675) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1675));
                        this.field1675 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1684 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dq.x(I)V")
    public void method2308() throws IOException {
        this.field1682 = 0;
        if (this.field1684 != this.field1675) {
            this.field1685.method2321(this.field1675);
            this.field1684 = this.field1675;
        }
        this.field1676 = this.field1675;
        while (this.field1682 < this.field1674.length) {
            int var1 = this.field1685.method2326(this.field1674, this.field1682, this.field1674.length - this.field1682);
            if (var1 == -1) {
                break;
            }
            this.field1684 += (long) var1;
            this.field1682 += var1;
        }
    }

    @ObfuscatedName("dq.z([BIIS)V")
    public void method2296(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1675 + (long) arg2 > this.field1683) {
                this.field1683 = this.field1675 + (long) arg2;
            }
            if (this.field1679 != -1L && (this.field1675 < this.field1679 || this.field1675 > this.field1679 + (long) this.field1680)) {
                this.method2298();
            }
            if (this.field1679 != -1L && this.field1675 + (long) arg2 > this.field1679 + (long) this.field1678.length) {
                int var4 = (int) ((long) this.field1678.length - (this.field1675 - this.field1679));
                System.arraycopy(arg0, arg1, this.field1678, (int) (this.field1675 - this.field1679), var4);
                this.field1675 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1680 = this.field1678.length;
                this.method2298();
            }
            if (arg2 > this.field1678.length) {
                if (this.field1684 != this.field1675) {
                    this.field1685.method2321(this.field1675);
                    this.field1684 = this.field1675;
                }
                this.field1685.method2322(arg0, arg1, arg2);
                this.field1684 += (long) arg2;
                if (this.field1684 > this.field1681) {
                    this.field1681 = this.field1684;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1675 >= this.field1676 && this.field1675 < this.field1676 + (long) this.field1682) {
                    var5 = this.field1675;
                } else if (this.field1676 >= this.field1675 && this.field1676 < this.field1675 + (long) arg2) {
                    var5 = this.field1676;
                }
                if (this.field1675 + (long) arg2 > this.field1676 && this.field1675 + (long) arg2 <= this.field1676 + (long) this.field1682) {
                    var7 = this.field1675 + (long) arg2;
                } else if (this.field1676 + (long) this.field1682 > this.field1675 && this.field1676 + (long) this.field1682 <= this.field1675 + (long) arg2) {
                    var7 = this.field1676 + (long) this.field1682;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1675), this.field1674, (int) (var5 - this.field1676), var9);
                }
                this.field1675 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1679 == -1L) {
                    this.field1679 = this.field1675;
                }
                System.arraycopy(arg0, arg1, this.field1678, (int) (this.field1675 - this.field1679), arg2);
                this.field1675 += (long) arg2;
                if (this.field1675 - this.field1679 > (long) this.field1680) {
                    this.field1680 = (int) (this.field1675 - this.field1679);
                }
            }
        } catch (IOException var11) {
            this.field1684 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dq.p(I)V")
    public void method2298() throws IOException {
        if (this.field1679 == -1L) {
            return;
        }
        if (this.field1684 != this.field1679) {
            this.field1685.method2321(this.field1679);
            this.field1684 = this.field1679;
        }
        this.field1685.method2322(this.field1678, 0, this.field1680);
        this.field1684 += (long) (this.field1680 * -1627028973) * 1544591387L;
        if (this.field1684 > this.field1681) {
            this.field1681 = this.field1684;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1679 >= this.field1676 && this.field1679 < this.field1676 + (long) this.field1682) {
            var1 = this.field1679;
        } else if (this.field1676 >= this.field1679 && this.field1676 < this.field1679 + (long) this.field1680) {
            var1 = this.field1676;
        }
        if (this.field1679 + (long) this.field1680 > this.field1676 && this.field1679 + (long) this.field1680 <= this.field1676 + (long) this.field1682) {
            var3 = this.field1679 + (long) this.field1680;
        } else if (this.field1676 + (long) this.field1682 > this.field1679 && this.field1676 + (long) this.field1682 <= this.field1679 + (long) this.field1680) {
            var3 = this.field1676 + (long) this.field1682;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1678, (int) (var1 - this.field1679), this.field1674, (int) (var1 - this.field1676), var5);
        }
        this.field1679 = -1L;
        this.field1680 = 0;
    }
}
