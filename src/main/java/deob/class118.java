package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dy")
public class class118 {

    @ObfuscatedName("dy.m")
    public class119 field1489;

    @ObfuscatedName("dy.f")
    public byte[] field1485;

    @ObfuscatedName("dy.q")
    public long field1486 = -1L;

    @ObfuscatedName("dy.w")
    public int field1496;

    @ObfuscatedName("dy.o")
    public byte[] field1488;

    @ObfuscatedName("dy.u")
    public long field1487 = -1L;

    @ObfuscatedName("dy.g")
    public int field1490 = 0;

    @ObfuscatedName("dy.l")
    public long field1491;

    @ObfuscatedName("dy.e")
    public long field1492;

    @ObfuscatedName("dy.x")
    public long field1493;

    @ObfuscatedName("dy.d")
    public long field1494;

    public class118(class119 arg0, int arg1, int arg2) throws IOException {
        this.field1489 = arg0;
        this.field1493 = this.field1492 = arg0.method2476();
        this.field1485 = new byte[arg1];
        this.field1488 = new byte[arg2];
        this.field1491 = 0L;
    }

    @ObfuscatedName("dy.m(I)V")
    public void method2441() throws IOException {
        this.method2448();
        this.field1489.method2474();
    }

    @ObfuscatedName("dy.f(J)V")
    public void method2458(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1491 = arg0;
    }

    @ObfuscatedName("dy.q(B)J")
    public long method2443() {
        return this.field1493;
    }

    @ObfuscatedName("dy.w([BI)V")
    public void method2459(byte[] arg0) throws IOException {
        this.method2444(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dy.o([BIIB)V")
    public void method2444(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1487 != -1L && this.field1491 >= this.field1487 && this.field1491 + (long) arg2 <= this.field1487 + (long) this.field1490) {
                System.arraycopy(this.field1488, (int) (this.field1491 - this.field1487), arg0, arg1, arg2);
                this.field1491 += (long) arg2;
                return;
            }
            long var4 = this.field1491;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1491 >= this.field1486 && this.field1491 < this.field1486 + (long) this.field1496) {
                int var8 = (int) ((long) this.field1496 - (this.field1491 - this.field1486));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1485, (int) (this.field1491 - this.field1486), arg0, arg1, var8);
                this.field1491 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1485.length) {
                this.field1489.method2472(this.field1491);
                this.field1494 = this.field1491;
                while (arg2 > 0) {
                    int var9 = this.field1489.method2477(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1494 += (long) var9;
                    this.field1491 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2463();
                int var10 = arg2;
                if (arg2 > this.field1496) {
                    var10 = this.field1496;
                }
                System.arraycopy(this.field1485, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1491 += (long) var10;
            }
            if (this.field1487 != -1L) {
                if (this.field1487 > this.field1491 && arg2 > 0) {
                    int var11 = (int) (this.field1487 - this.field1491) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1491++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1487 >= var4 && this.field1487 < (long) var7 + var4) {
                    var12 = this.field1487;
                } else if (var4 >= this.field1487 && var4 < this.field1487 + (long) this.field1490) {
                    var12 = var4;
                }
                if (this.field1487 + (long) this.field1490 > var4 && this.field1487 + (long) this.field1490 <= (long) var7 + var4) {
                    var14 = this.field1487 + (long) this.field1490;
                } else if ((long) var7 + var4 > this.field1487 && (long) var7 + var4 <= this.field1487 + (long) this.field1490) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1488, (int) (var12 - this.field1487), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1491) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1491));
                        this.field1491 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1494 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dy.u(I)V")
    public void method2463() throws IOException {
        this.field1496 = 0;
        if (this.field1494 != this.field1491) {
            this.field1489.method2472(this.field1491);
            this.field1494 = this.field1491;
        }
        this.field1486 = this.field1491;
        while (this.field1496 < this.field1485.length) {
            int var1 = this.field1489.method2477(this.field1485, this.field1496, this.field1485.length - this.field1496);
            if (var1 == -1) {
                break;
            }
            this.field1494 += (long) var1;
            this.field1496 += var1;
        }
    }

    @ObfuscatedName("dy.g([BIII)V")
    public void method2447(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1491 + (long) arg2 > this.field1493) {
                this.field1493 = this.field1491 + (long) arg2;
            }
            if (this.field1487 != -1L && (this.field1491 < this.field1487 || this.field1491 > this.field1487 + (long) this.field1490)) {
                this.method2448();
            }
            if (this.field1487 != -1L && this.field1491 + (long) arg2 > this.field1487 + (long) this.field1488.length) {
                int var4 = (int) ((long) this.field1488.length - (this.field1491 - this.field1487));
                System.arraycopy(arg0, arg1, this.field1488, (int) (this.field1491 - this.field1487), var4);
                this.field1491 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1490 = this.field1488.length;
                this.method2448();
            }
            if (arg2 > this.field1488.length) {
                if (this.field1494 != this.field1491) {
                    this.field1489.method2472(this.field1491);
                    this.field1494 = this.field1491;
                }
                this.field1489.method2473(arg0, arg1, arg2);
                this.field1494 += (long) arg2;
                if (this.field1494 > this.field1492) {
                    this.field1492 = this.field1494;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1491 >= this.field1486 && this.field1491 < this.field1486 + (long) this.field1496) {
                    var5 = this.field1491;
                } else if (this.field1486 >= this.field1491 && this.field1486 < this.field1491 + (long) arg2) {
                    var5 = this.field1486;
                }
                if (this.field1491 + (long) arg2 > this.field1486 && this.field1491 + (long) arg2 <= this.field1486 + (long) this.field1496) {
                    var7 = this.field1491 + (long) arg2;
                } else if (this.field1486 + (long) this.field1496 > this.field1491 && this.field1486 + (long) this.field1496 <= this.field1491 + (long) arg2) {
                    var7 = this.field1486 + (long) this.field1496;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1491), this.field1485, (int) (var5 - this.field1486), var9);
                }
                this.field1491 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1487 == -1L) {
                    this.field1487 = this.field1491;
                }
                System.arraycopy(arg0, arg1, this.field1488, (int) (this.field1491 - this.field1487), arg2);
                this.field1491 += (long) arg2;
                if (this.field1491 - this.field1487 > (long) this.field1490) {
                    this.field1490 = (int) (this.field1491 - this.field1487);
                }
            }
        } catch (IOException var11) {
            this.field1494 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dy.l(I)V")
    public void method2448() throws IOException {
        if (this.field1487 == -1L) {
            return;
        }
        if (this.field1494 != this.field1487) {
            this.field1489.method2472(this.field1487);
            this.field1494 = this.field1487;
        }
        this.field1489.method2473(this.field1488, 0, this.field1490);
        this.field1494 += (long) (this.field1490 * 1290782301) * -1558233611L;
        if (this.field1494 > this.field1492) {
            this.field1492 = this.field1494;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1487 >= this.field1486 && this.field1487 < this.field1486 + (long) this.field1496) {
            var1 = this.field1487;
        } else if (this.field1486 >= this.field1487 && this.field1486 < this.field1487 + (long) this.field1490) {
            var1 = this.field1486;
        }
        if (this.field1487 + (long) this.field1490 > this.field1486 && this.field1487 + (long) this.field1490 <= this.field1486 + (long) this.field1496) {
            var3 = this.field1487 + (long) this.field1490;
        } else if (this.field1486 + (long) this.field1496 > this.field1487 && this.field1486 + (long) this.field1496 <= this.field1487 + (long) this.field1490) {
            var3 = this.field1486 + (long) this.field1496;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1488, (int) (var1 - this.field1487), this.field1485, (int) (var1 - this.field1486), var5);
        }
        this.field1487 = -1L;
        this.field1490 = 0;
    }
}
