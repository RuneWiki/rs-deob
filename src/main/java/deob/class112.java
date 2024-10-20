package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("do")
public class class112 {

    @ObfuscatedName("do.f")
    public class113 field1486;

    @ObfuscatedName("do.l")
    public byte[] field1478;

    @ObfuscatedName("do.w")
    public long field1479 = -1L;

    @ObfuscatedName("do.s")
    public int field1482;

    @ObfuscatedName("do.e")
    public byte[] field1487;

    @ObfuscatedName("do.a")
    public long field1480 = -1L;

    @ObfuscatedName("do.c")
    public int field1483 = 0;

    @ObfuscatedName("do.p")
    public long field1484;

    @ObfuscatedName("do.r")
    public long field1485;

    @ObfuscatedName("do.m")
    public long field1481;

    @ObfuscatedName("do.d")
    public long field1477;

    public class112(class113 arg0, int arg1, int arg2) throws IOException {
        this.field1486 = arg0;
        this.field1481 = this.field1485 = arg0.method2384();
        this.field1478 = new byte[arg1];
        this.field1487 = new byte[arg2];
        this.field1484 = 0L;
    }

    @ObfuscatedName("do.f(B)V")
    public void method2351() throws IOException {
        this.method2358();
        this.field1486.method2393();
    }

    @ObfuscatedName("do.l(J)V")
    public void method2368(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1484 = arg0;
    }

    @ObfuscatedName("do.w(B)J")
    public long method2353() {
        return this.field1481;
    }

    @ObfuscatedName("do.s([BI)V")
    public void method2354(byte[] arg0) throws IOException {
        this.method2355(arg0, 0, arg0.length);
    }

    @ObfuscatedName("do.e([BIIS)V")
    public void method2355(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1480 != -1L && this.field1484 >= this.field1480 && this.field1484 + (long) arg2 <= this.field1480 + (long) this.field1483) {
                System.arraycopy(this.field1487, (int) (this.field1484 - this.field1480), arg0, arg1, arg2);
                this.field1484 += (long) arg2;
                return;
            }
            long var4 = this.field1484;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1484 >= this.field1479 && this.field1484 < this.field1479 + (long) this.field1482) {
                int var8 = (int) ((long) this.field1482 - (this.field1484 - this.field1479));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1478, (int) (this.field1484 - this.field1479), arg0, arg1, var8);
                this.field1484 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1478.length) {
                this.field1486.method2380(this.field1484);
                this.field1477 = this.field1484;
                while (arg2 > 0) {
                    int var9 = this.field1486.method2385(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1477 += (long) var9;
                    this.field1484 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2356();
                int var10 = arg2;
                if (arg2 > this.field1482) {
                    var10 = this.field1482;
                }
                System.arraycopy(this.field1478, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1484 += (long) var10;
            }
            if (this.field1480 != -1L) {
                if (this.field1480 > this.field1484 && arg2 > 0) {
                    int var11 = (int) (this.field1480 - this.field1484) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1484++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1480 >= var4 && this.field1480 < (long) var7 + var4) {
                    var12 = this.field1480;
                } else if (var4 >= this.field1480 && var4 < this.field1480 + (long) this.field1483) {
                    var12 = var4;
                }
                if (this.field1480 + (long) this.field1483 > var4 && this.field1480 + (long) this.field1483 <= (long) var7 + var4) {
                    var14 = this.field1480 + (long) this.field1483;
                } else if ((long) var7 + var4 > this.field1480 && (long) var7 + var4 <= this.field1480 + (long) this.field1483) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1487, (int) (var12 - this.field1480), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1484) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1484));
                        this.field1484 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1477 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("do.c(I)V")
    public void method2356() throws IOException {
        this.field1482 = 0;
        if (this.field1484 != this.field1477) {
            this.field1486.method2380(this.field1484);
            this.field1477 = this.field1484;
        }
        this.field1479 = this.field1484;
        while (this.field1482 < this.field1478.length) {
            int var1 = this.field1486.method2385(this.field1478, this.field1482, this.field1478.length - this.field1482);
            if (var1 == -1) {
                break;
            }
            this.field1477 += (long) var1;
            this.field1482 += var1;
        }
    }

    @ObfuscatedName("do.p([BIII)V")
    public void method2357(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1484 + (long) arg2 > this.field1481) {
                this.field1481 = this.field1484 + (long) arg2;
            }
            if (this.field1480 != -1L && (this.field1484 < this.field1480 || this.field1484 > this.field1480 + (long) this.field1483)) {
                this.method2358();
            }
            if (this.field1480 != -1L && this.field1484 + (long) arg2 > this.field1480 + (long) this.field1487.length) {
                int var4 = (int) ((long) this.field1487.length - (this.field1484 - this.field1480));
                System.arraycopy(arg0, arg1, this.field1487, (int) (this.field1484 - this.field1480), var4);
                this.field1484 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1483 = this.field1487.length;
                this.method2358();
            }
            if (arg2 > this.field1487.length) {
                if (this.field1484 != this.field1477) {
                    this.field1486.method2380(this.field1484);
                    this.field1477 = this.field1484;
                }
                this.field1486.method2381(arg0, arg1, arg2);
                this.field1477 += (long) arg2;
                if (this.field1477 > this.field1485) {
                    this.field1485 = this.field1477;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1484 >= this.field1479 && this.field1484 < this.field1479 + (long) this.field1482) {
                    var5 = this.field1484;
                } else if (this.field1479 >= this.field1484 && this.field1479 < this.field1484 + (long) arg2) {
                    var5 = this.field1479;
                }
                if (this.field1484 + (long) arg2 > this.field1479 && this.field1484 + (long) arg2 <= this.field1479 + (long) this.field1482) {
                    var7 = this.field1484 + (long) arg2;
                } else if (this.field1479 + (long) this.field1482 > this.field1484 && this.field1479 + (long) this.field1482 <= this.field1484 + (long) arg2) {
                    var7 = this.field1479 + (long) this.field1482;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1484), this.field1478, (int) (var5 - this.field1479), var9);
                }
                this.field1484 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1480 == -1L) {
                    this.field1480 = this.field1484;
                }
                System.arraycopy(arg0, arg1, this.field1487, (int) (this.field1484 - this.field1480), arg2);
                this.field1484 += (long) arg2;
                if (this.field1484 - this.field1480 > (long) this.field1483) {
                    this.field1483 = (int) (this.field1484 - this.field1480);
                }
            }
        } catch (IOException var11) {
            this.field1477 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("do.r(I)V")
    public void method2358() throws IOException {
        if (this.field1480 == -1L) {
            return;
        }
        if (this.field1480 != this.field1477) {
            this.field1486.method2380(this.field1480);
            this.field1477 = this.field1480;
        }
        this.field1486.method2381(this.field1487, 0, this.field1483);
        this.field1477 += (long) (this.field1483 * -911973617) * -555996177L;
        if (this.field1477 > this.field1485) {
            this.field1485 = this.field1477;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1480 >= this.field1479 && this.field1480 < this.field1479 + (long) this.field1482) {
            var1 = this.field1480;
        } else if (this.field1479 >= this.field1480 && this.field1479 < this.field1480 + (long) this.field1483) {
            var1 = this.field1479;
        }
        if (this.field1480 + (long) this.field1483 > this.field1479 && this.field1480 + (long) this.field1483 <= this.field1479 + (long) this.field1482) {
            var3 = this.field1480 + (long) this.field1483;
        } else if (this.field1479 + (long) this.field1482 > this.field1480 && this.field1479 + (long) this.field1482 <= this.field1480 + (long) this.field1483) {
            var3 = this.field1479 + (long) this.field1482;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1487, (int) (var1 - this.field1480), this.field1478, (int) (var1 - this.field1479), var5);
        }
        this.field1480 = -1L;
        this.field1483 = 0;
    }
}
