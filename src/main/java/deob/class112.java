package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dp")
public class class112 {

    @ObfuscatedName("dp.c")
    public class113 field1487;

    @ObfuscatedName("dp.q")
    public byte[] field1483;

    @ObfuscatedName("dp.m")
    public long field1484 = -1L;

    @ObfuscatedName("dp.j")
    public int field1485;

    @ObfuscatedName("dp.g")
    public byte[] field1486;

    @ObfuscatedName("dp.i")
    public long field1492 = -1L;

    @ObfuscatedName("dp.h")
    public int field1493 = 0;

    @ObfuscatedName("dp.l")
    public long field1489;

    @ObfuscatedName("dp.d")
    public long field1482;

    @ObfuscatedName("dp.o")
    public long field1491;

    @ObfuscatedName("dp.s")
    public long field1490;

    public class112(class113 arg0, int arg1, int arg2) throws IOException {
        this.field1487 = arg0;
        this.field1491 = this.field1482 = arg0.method2268();
        this.field1483 = new byte[arg1];
        this.field1486 = new byte[arg2];
        this.field1489 = 0L;
    }

    @ObfuscatedName("dp.c(I)V")
    public void method2242() throws IOException {
        this.method2249();
        this.field1487.method2266();
    }

    @ObfuscatedName("dp.q(J)V")
    public void method2243(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1489 = arg0;
    }

    @ObfuscatedName("dp.m(I)J")
    public long method2245() {
        return this.field1491;
    }

    @ObfuscatedName("dp.j([BI)V")
    public void method2244(byte[] arg0) throws IOException {
        this.method2246(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dp.g([BIIB)V")
    public void method2246(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1492 != -1L && this.field1489 >= this.field1492 && this.field1489 + (long) arg2 <= this.field1492 + (long) this.field1493) {
                System.arraycopy(this.field1486, (int) (this.field1489 - this.field1492), arg0, arg1, arg2);
                this.field1489 += (long) arg2;
                return;
            }
            long var4 = this.field1489;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1489 >= this.field1484 && this.field1489 < this.field1484 + (long) this.field1485) {
                int var8 = (int) ((long) this.field1485 - (this.field1489 - this.field1484));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1483, (int) (this.field1489 - this.field1484), arg0, arg1, var8);
                this.field1489 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1483.length) {
                this.field1487.method2281(this.field1489);
                this.field1490 = this.field1489;
                while (arg2 > 0) {
                    int var9 = this.field1487.method2269(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1490 += (long) var9;
                    this.field1489 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2247();
                int var10 = arg2;
                if (arg2 > this.field1485) {
                    var10 = this.field1485;
                }
                System.arraycopy(this.field1483, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1489 += (long) var10;
            }
            if (this.field1492 != -1L) {
                if (this.field1492 > this.field1489 && arg2 > 0) {
                    int var11 = (int) (this.field1492 - this.field1489) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1489++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1492 >= var4 && this.field1492 < (long) var7 + var4) {
                    var12 = this.field1492;
                } else if (var4 >= this.field1492 && var4 < this.field1492 + (long) this.field1493) {
                    var12 = var4;
                }
                if (this.field1492 + (long) this.field1493 > var4 && this.field1492 + (long) this.field1493 <= (long) var7 + var4) {
                    var14 = this.field1492 + (long) this.field1493;
                } else if ((long) var7 + var4 > this.field1492 && (long) var7 + var4 <= this.field1492 + (long) this.field1493) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1486, (int) (var12 - this.field1492), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1489) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1489));
                        this.field1489 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1490 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dp.i(I)V")
    public void method2247() throws IOException {
        this.field1485 = 0;
        if (this.field1490 != this.field1489) {
            this.field1487.method2281(this.field1489);
            this.field1490 = this.field1489;
        }
        this.field1484 = this.field1489;
        while (this.field1485 < this.field1483.length) {
            int var1 = this.field1487.method2269(this.field1483, this.field1485, this.field1483.length - this.field1485);
            if (var1 == -1) {
                break;
            }
            this.field1490 += (long) var1;
            this.field1485 += var1;
        }
    }

    @ObfuscatedName("dp.h([BIIB)V")
    public void method2256(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1489 + (long) arg2 > this.field1491) {
                this.field1491 = this.field1489 + (long) arg2;
            }
            if (this.field1492 != -1L && (this.field1489 < this.field1492 || this.field1489 > this.field1492 + (long) this.field1493)) {
                this.method2249();
            }
            if (this.field1492 != -1L && this.field1489 + (long) arg2 > this.field1492 + (long) this.field1486.length) {
                int var4 = (int) ((long) this.field1486.length - (this.field1489 - this.field1492));
                System.arraycopy(arg0, arg1, this.field1486, (int) (this.field1489 - this.field1492), var4);
                this.field1489 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1493 = this.field1486.length;
                this.method2249();
            }
            if (arg2 > this.field1486.length) {
                if (this.field1490 != this.field1489) {
                    this.field1487.method2281(this.field1489);
                    this.field1490 = this.field1489;
                }
                this.field1487.method2265(arg0, arg1, arg2);
                this.field1490 += (long) arg2;
                if (this.field1490 > this.field1482) {
                    this.field1482 = this.field1490;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1489 >= this.field1484 && this.field1489 < this.field1484 + (long) this.field1485) {
                    var5 = this.field1489;
                } else if (this.field1484 >= this.field1489 && this.field1484 < this.field1489 + (long) arg2) {
                    var5 = this.field1484;
                }
                if (this.field1489 + (long) arg2 > this.field1484 && this.field1489 + (long) arg2 <= this.field1484 + (long) this.field1485) {
                    var7 = this.field1489 + (long) arg2;
                } else if (this.field1484 + (long) this.field1485 > this.field1489 && this.field1484 + (long) this.field1485 <= this.field1489 + (long) arg2) {
                    var7 = this.field1484 + (long) this.field1485;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1489), this.field1483, (int) (var5 - this.field1484), var9);
                }
                this.field1489 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1492 == -1L) {
                    this.field1492 = this.field1489;
                }
                System.arraycopy(arg0, arg1, this.field1486, (int) (this.field1489 - this.field1492), arg2);
                this.field1489 += (long) arg2;
                if (this.field1489 - this.field1492 > (long) this.field1493) {
                    this.field1493 = (int) (this.field1489 - this.field1492);
                }
            }
        } catch (IOException var11) {
            this.field1490 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dp.l(I)V")
    public void method2249() throws IOException {
        if (this.field1492 == -1L) {
            return;
        }
        if (this.field1492 != this.field1490) {
            this.field1487.method2281(this.field1492);
            this.field1490 = this.field1492;
        }
        this.field1487.method2265(this.field1486, 0, this.field1493);
        this.field1490 += (long) (this.field1493 * -1544137875) * 1349627493L;
        if (this.field1490 > this.field1482) {
            this.field1482 = this.field1490;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1492 >= this.field1484 && this.field1492 < this.field1484 + (long) this.field1485) {
            var1 = this.field1492;
        } else if (this.field1484 >= this.field1492 && this.field1484 < this.field1492 + (long) this.field1493) {
            var1 = this.field1484;
        }
        if (this.field1492 + (long) this.field1493 > this.field1484 && this.field1492 + (long) this.field1493 <= this.field1484 + (long) this.field1485) {
            var3 = this.field1492 + (long) this.field1493;
        } else if (this.field1484 + (long) this.field1485 > this.field1492 && this.field1484 + (long) this.field1485 <= this.field1492 + (long) this.field1493) {
            var3 = this.field1484 + (long) this.field1485;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1486, (int) (var1 - this.field1492), this.field1483, (int) (var1 - this.field1484), var5);
        }
        this.field1492 = -1L;
        this.field1493 = 0;
    }
}
