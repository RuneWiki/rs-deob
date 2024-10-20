package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dp")
public class class112 {

    @ObfuscatedName("dp.v")
    public class113 field1472;

    @ObfuscatedName("dp.s")
    public byte[] field1475;

    @ObfuscatedName("dp.o")
    public long field1473 = -1L;

    @ObfuscatedName("dp.k")
    public int field1470;

    @ObfuscatedName("dp.u")
    public byte[] field1478;

    @ObfuscatedName("dp.i")
    public long field1471 = -1L;

    @ObfuscatedName("dp.t")
    public int field1469 = 0;

    @ObfuscatedName("dp.p")
    public long field1474;

    @ObfuscatedName("dp.l")
    public long field1467;

    @ObfuscatedName("dp.b")
    public long field1476;

    @ObfuscatedName("dp.c")
    public long field1477;

    public class112(class113 arg0, int arg1, int arg2) throws IOException {
        this.field1472 = arg0;
        this.field1476 = this.field1467 = arg0.method2324();
        this.field1475 = new byte[arg1];
        this.field1478 = new byte[arg2];
        this.field1474 = 0L;
    }

    @ObfuscatedName("dp.v(B)V")
    public void method2297() throws IOException {
        this.method2304();
        this.field1472.method2326();
    }

    @ObfuscatedName("dp.s(J)V")
    public void method2308(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1474 = arg0;
    }

    @ObfuscatedName("dp.o(B)J")
    public long method2318() {
        return this.field1476;
    }

    @ObfuscatedName("dp.k([BI)V")
    public void method2300(byte[] arg0) throws IOException {
        this.method2301(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dp.u([BIIB)V")
    public void method2301(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1471 != -1L && this.field1474 >= this.field1471 && this.field1474 + (long) arg2 <= this.field1471 + (long) this.field1469) {
                System.arraycopy(this.field1478, (int) (this.field1474 - this.field1471), arg0, arg1, arg2);
                this.field1474 += (long) arg2;
                return;
            }
            long var4 = this.field1474;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1474 >= this.field1473 && this.field1474 < this.field1473 + (long) this.field1470) {
                int var8 = (int) ((long) this.field1470 - (this.field1474 - this.field1473));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1475, (int) (this.field1474 - this.field1473), arg0, arg1, var8);
                this.field1474 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1475.length) {
                this.field1472.method2328(this.field1474);
                this.field1477 = this.field1474;
                while (arg2 > 0) {
                    int var9 = this.field1472.method2329(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1477 += (long) var9;
                    this.field1474 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2309();
                int var10 = arg2;
                if (arg2 > this.field1470) {
                    var10 = this.field1470;
                }
                System.arraycopy(this.field1475, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1474 += (long) var10;
            }
            if (this.field1471 != -1L) {
                if (this.field1471 > this.field1474 && arg2 > 0) {
                    int var11 = (int) (this.field1471 - this.field1474) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1474++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1471 >= var4 && this.field1471 < (long) var7 + var4) {
                    var12 = this.field1471;
                } else if (var4 >= this.field1471 && var4 < this.field1471 + (long) this.field1469) {
                    var12 = var4;
                }
                if (this.field1471 + (long) this.field1469 > var4 && this.field1471 + (long) this.field1469 <= (long) var7 + var4) {
                    var14 = this.field1471 + (long) this.field1469;
                } else if ((long) var7 + var4 > this.field1471 && (long) var7 + var4 <= this.field1471 + (long) this.field1469) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1478, (int) (var12 - this.field1471), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1474) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1474));
                        this.field1474 = var14;
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

    @ObfuscatedName("dp.i(I)V")
    public void method2309() throws IOException {
        this.field1470 = 0;
        if (this.field1477 != this.field1474) {
            this.field1472.method2328(this.field1474);
            this.field1477 = this.field1474;
        }
        this.field1473 = this.field1474;
        while (this.field1470 < this.field1475.length) {
            int var1 = this.field1472.method2329(this.field1475, this.field1470, this.field1475.length - this.field1470);
            if (var1 == -1) {
                break;
            }
            this.field1477 += (long) var1;
            this.field1470 += var1;
        }
    }

    @ObfuscatedName("dp.t([BIII)V")
    public void method2314(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1474 + (long) arg2 > this.field1476) {
                this.field1476 = this.field1474 + (long) arg2;
            }
            if (this.field1471 != -1L && (this.field1474 < this.field1471 || this.field1474 > this.field1471 + (long) this.field1469)) {
                this.method2304();
            }
            if (this.field1471 != -1L && this.field1474 + (long) arg2 > this.field1471 + (long) this.field1478.length) {
                int var4 = (int) ((long) this.field1478.length - (this.field1474 - this.field1471));
                System.arraycopy(arg0, arg1, this.field1478, (int) (this.field1474 - this.field1471), var4);
                this.field1474 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1469 = this.field1478.length;
                this.method2304();
            }
            if (arg2 > this.field1478.length) {
                if (this.field1477 != this.field1474) {
                    this.field1472.method2328(this.field1474);
                    this.field1477 = this.field1474;
                }
                this.field1472.method2333(arg0, arg1, arg2);
                this.field1477 += (long) arg2;
                if (this.field1477 > this.field1467) {
                    this.field1467 = this.field1477;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1474 >= this.field1473 && this.field1474 < this.field1473 + (long) this.field1470) {
                    var5 = this.field1474;
                } else if (this.field1473 >= this.field1474 && this.field1473 < this.field1474 + (long) arg2) {
                    var5 = this.field1473;
                }
                if (this.field1474 + (long) arg2 > this.field1473 && this.field1474 + (long) arg2 <= this.field1473 + (long) this.field1470) {
                    var7 = this.field1474 + (long) arg2;
                } else if (this.field1473 + (long) this.field1470 > this.field1474 && this.field1473 + (long) this.field1470 <= this.field1474 + (long) arg2) {
                    var7 = this.field1473 + (long) this.field1470;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1474), this.field1475, (int) (var5 - this.field1473), var9);
                }
                this.field1474 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1471 == -1L) {
                    this.field1471 = this.field1474;
                }
                System.arraycopy(arg0, arg1, this.field1478, (int) (this.field1474 - this.field1471), arg2);
                this.field1474 += (long) arg2;
                if (this.field1474 - this.field1471 > (long) this.field1469) {
                    this.field1469 = (int) (this.field1474 - this.field1471);
                }
            }
        } catch (IOException var11) {
            this.field1477 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dp.c(I)V")
    public void method2304() throws IOException {
        if (this.field1471 == -1L) {
            return;
        }
        if (this.field1477 != this.field1471) {
            this.field1472.method2328(this.field1471);
            this.field1477 = this.field1471;
        }
        this.field1472.method2333(this.field1478, 0, this.field1469);
        this.field1477 += (long) (this.field1469 * -184571647) * 1871795969L;
        if (this.field1477 > this.field1467) {
            this.field1467 = this.field1477;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1471 >= this.field1473 && this.field1471 < this.field1473 + (long) this.field1470) {
            var1 = this.field1471;
        } else if (this.field1473 >= this.field1471 && this.field1473 < this.field1471 + (long) this.field1469) {
            var1 = this.field1473;
        }
        if (this.field1471 + (long) this.field1469 > this.field1473 && this.field1471 + (long) this.field1469 <= this.field1473 + (long) this.field1470) {
            var3 = this.field1471 + (long) this.field1469;
        } else if (this.field1473 + (long) this.field1470 > this.field1471 && this.field1473 + (long) this.field1470 <= this.field1471 + (long) this.field1469) {
            var3 = this.field1473 + (long) this.field1470;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1478, (int) (var1 - this.field1471), this.field1475, (int) (var1 - this.field1473), var5);
        }
        this.field1471 = -1L;
        this.field1469 = 0;
    }
}
