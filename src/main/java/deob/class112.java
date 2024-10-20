package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dr")
public class class112 {

    @ObfuscatedName("dr.g")
    public class113 field1479;

    @ObfuscatedName("dr.r")
    public byte[] field1483;

    @ObfuscatedName("dr.e")
    public long field1480 = -1L;

    @ObfuscatedName("dr.q")
    public int field1481;

    @ObfuscatedName("dr.c")
    public byte[] field1482;

    @ObfuscatedName("dr.l")
    public long field1486 = -1L;

    @ObfuscatedName("dr.b")
    public int field1484 = 0;

    @ObfuscatedName("dr.w")
    public long field1478;

    @ObfuscatedName("dr.n")
    public long field1489;

    @ObfuscatedName("dr.i")
    public long field1487;

    @ObfuscatedName("dr.p")
    public long field1485;

    public class112(class113 arg0, int arg1, int arg2) throws IOException {
        this.field1479 = arg0;
        this.field1487 = this.field1489 = arg0.method2517();
        this.field1483 = new byte[arg1];
        this.field1482 = new byte[arg2];
        this.field1478 = 0L;
    }

    @ObfuscatedName("dr.g(I)V")
    public void method2480() throws IOException {
        this.method2489();
        this.field1479.method2515();
    }

    @ObfuscatedName("dr.r(J)V")
    public void method2481(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1478 = arg0;
    }

    @ObfuscatedName("dr.e(B)J")
    public long method2493() {
        return this.field1487;
    }

    @ObfuscatedName("dr.q([BI)V")
    public void method2483(byte[] arg0) throws IOException {
        this.method2484(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dr.c([BIII)V")
    public void method2484(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1486 != -1L && this.field1478 >= this.field1486 && this.field1478 + (long) arg2 <= this.field1486 + (long) this.field1484) {
                System.arraycopy(this.field1482, (int) (this.field1478 - this.field1486), arg0, arg1, arg2);
                this.field1478 += (long) arg2;
                return;
            }
            long var4 = this.field1478;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1478 >= this.field1480 && this.field1478 < this.field1480 + (long) this.field1481) {
                int var8 = (int) ((long) this.field1481 - (this.field1478 - this.field1480));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1483, (int) (this.field1478 - this.field1480), arg0, arg1, var8);
                this.field1478 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1483.length) {
                this.field1479.method2516(this.field1478);
                this.field1485 = this.field1478;
                while (arg2 > 0) {
                    int var9 = this.field1479.method2518(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1485 += (long) var9;
                    this.field1478 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2485();
                int var10 = arg2;
                if (arg2 > this.field1481) {
                    var10 = this.field1481;
                }
                System.arraycopy(this.field1483, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1478 += (long) var10;
            }
            if (this.field1486 != -1L) {
                if (this.field1486 > this.field1478 && arg2 > 0) {
                    int var11 = (int) (this.field1486 - this.field1478) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1478++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1486 >= var4 && this.field1486 < (long) var7 + var4) {
                    var12 = this.field1486;
                } else if (var4 >= this.field1486 && var4 < this.field1486 + (long) this.field1484) {
                    var12 = var4;
                }
                if (this.field1486 + (long) this.field1484 > var4 && this.field1486 + (long) this.field1484 <= (long) var7 + var4) {
                    var14 = this.field1486 + (long) this.field1484;
                } else if ((long) var7 + var4 > this.field1486 && (long) var7 + var4 <= this.field1486 + (long) this.field1484) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1482, (int) (var12 - this.field1486), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1478) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1478));
                        this.field1478 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1485 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dr.i(I)V")
    public void method2485() throws IOException {
        this.field1481 = 0;
        if (this.field1485 != this.field1478) {
            this.field1479.method2516(this.field1478);
            this.field1485 = this.field1478;
        }
        this.field1480 = this.field1478;
        while (this.field1481 < this.field1483.length) {
            int var1 = this.field1479.method2518(this.field1483, this.field1481, this.field1483.length - this.field1481);
            if (var1 == -1) {
                break;
            }
            this.field1485 += (long) var1;
            this.field1481 += var1;
        }
    }

    @ObfuscatedName("dr.p([BIIB)V")
    public void method2490(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1478 + (long) arg2 > this.field1487) {
                this.field1487 = this.field1478 + (long) arg2;
            }
            if (this.field1486 != -1L && (this.field1478 < this.field1486 || this.field1478 > this.field1486 + (long) this.field1484)) {
                this.method2489();
            }
            if (this.field1486 != -1L && this.field1478 + (long) arg2 > this.field1486 + (long) this.field1482.length) {
                int var4 = (int) ((long) this.field1482.length - (this.field1478 - this.field1486));
                System.arraycopy(arg0, arg1, this.field1482, (int) (this.field1478 - this.field1486), var4);
                this.field1478 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1484 = this.field1482.length;
                this.method2489();
            }
            if (arg2 > this.field1482.length) {
                if (this.field1485 != this.field1478) {
                    this.field1479.method2516(this.field1478);
                    this.field1485 = this.field1478;
                }
                this.field1479.method2514(arg0, arg1, arg2);
                this.field1485 += (long) arg2;
                if (this.field1485 > this.field1489) {
                    this.field1489 = this.field1485;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1478 >= this.field1480 && this.field1478 < this.field1480 + (long) this.field1481) {
                    var5 = this.field1478;
                } else if (this.field1480 >= this.field1478 && this.field1480 < this.field1478 + (long) arg2) {
                    var5 = this.field1480;
                }
                if (this.field1478 + (long) arg2 > this.field1480 && this.field1478 + (long) arg2 <= this.field1480 + (long) this.field1481) {
                    var7 = this.field1478 + (long) arg2;
                } else if (this.field1480 + (long) this.field1481 > this.field1478 && this.field1480 + (long) this.field1481 <= this.field1478 + (long) arg2) {
                    var7 = this.field1480 + (long) this.field1481;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1478), this.field1483, (int) (var5 - this.field1480), var9);
                }
                this.field1478 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1486 == -1L) {
                    this.field1486 = this.field1478;
                }
                System.arraycopy(arg0, arg1, this.field1482, (int) (this.field1478 - this.field1486), arg2);
                this.field1478 += (long) arg2;
                if (this.field1478 - this.field1486 > (long) this.field1484) {
                    this.field1484 = (int) (this.field1478 - this.field1486);
                }
            }
        } catch (IOException var11) {
            this.field1485 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dr.m(I)V")
    public void method2489() throws IOException {
        if (this.field1486 == -1L) {
            return;
        }
        if (this.field1486 != this.field1485) {
            this.field1479.method2516(this.field1486);
            this.field1485 = this.field1486;
        }
        this.field1479.method2514(this.field1482, 0, this.field1484);
        this.field1485 += (long) (this.field1484 * 136693003) * -239280477L;
        if (this.field1485 > this.field1489) {
            this.field1489 = this.field1485;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1486 >= this.field1480 && this.field1486 < this.field1480 + (long) this.field1481) {
            var1 = this.field1486;
        } else if (this.field1480 >= this.field1486 && this.field1480 < this.field1486 + (long) this.field1484) {
            var1 = this.field1480;
        }
        if (this.field1486 + (long) this.field1484 > this.field1480 && this.field1486 + (long) this.field1484 <= this.field1480 + (long) this.field1481) {
            var3 = this.field1486 + (long) this.field1484;
        } else if (this.field1480 + (long) this.field1481 > this.field1486 && this.field1480 + (long) this.field1481 <= this.field1486 + (long) this.field1484) {
            var3 = this.field1480 + (long) this.field1481;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1482, (int) (var1 - this.field1486), this.field1483, (int) (var1 - this.field1480), var5);
        }
        this.field1486 = -1L;
        this.field1484 = 0;
    }
}
