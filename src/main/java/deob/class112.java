package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dj")
public class class112 {

    @ObfuscatedName("dj.y")
    public class113 field1480;

    @ObfuscatedName("dj.c")
    public byte[] field1468;

    @ObfuscatedName("dj.n")
    public long field1469 = -1L;

    @ObfuscatedName("dj.u")
    public int field1471;

    @ObfuscatedName("dj.i")
    public byte[] field1470;

    @ObfuscatedName("dj.r")
    public long field1473 = -1L;

    @ObfuscatedName("dj.j")
    public int field1467 = 0;

    @ObfuscatedName("dj.p")
    public long field1479;

    @ObfuscatedName("dj.e")
    public long field1475;

    @ObfuscatedName("dj.s")
    public long field1476;

    @ObfuscatedName("dj.v")
    public long field1477;

    public class112(class113 arg0, int arg1, int arg2) throws IOException {
        this.field1480 = arg0;
        this.field1476 = this.field1475 = arg0.method2327();
        this.field1468 = new byte[arg1];
        this.field1470 = new byte[arg2];
        this.field1479 = 0L;
    }

    @ObfuscatedName("dj.y(I)V")
    public void method2310() throws IOException {
        this.method2285();
        this.field1480.method2331();
    }

    @ObfuscatedName("dj.c(J)V")
    public void method2286(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1479 = arg0;
    }

    @ObfuscatedName("dj.n(I)J")
    public long method2314() {
        return this.field1476;
    }

    @ObfuscatedName("dj.u([BI)V")
    public void method2289(byte[] arg0) throws IOException {
        this.method2290(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dj.i([BIIB)V")
    public void method2290(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1473 != -1L && this.field1479 >= this.field1473 && this.field1479 + (long) arg2 <= this.field1473 + (long) this.field1467) {
                System.arraycopy(this.field1470, (int) (this.field1479 - this.field1473), arg0, arg1, arg2);
                this.field1479 += (long) arg2;
                return;
            }
            long var4 = this.field1479;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1479 >= this.field1469 && this.field1479 < this.field1469 + (long) this.field1471) {
                int var8 = (int) ((long) this.field1471 - (this.field1479 - this.field1469));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1468, (int) (this.field1479 - this.field1469), arg0, arg1, var8);
                this.field1479 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1468.length) {
                this.field1480.method2348(this.field1479);
                this.field1477 = this.field1479;
                while (arg2 > 0) {
                    int var9 = this.field1480.method2328(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1477 += (long) var9;
                    this.field1479 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2291();
                int var10 = arg2;
                if (arg2 > this.field1471) {
                    var10 = this.field1471;
                }
                System.arraycopy(this.field1468, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1479 += (long) var10;
            }
            if (this.field1473 != -1L) {
                if (this.field1473 > this.field1479 && arg2 > 0) {
                    int var11 = (int) (this.field1473 - this.field1479) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1479++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1473 >= var4 && this.field1473 < (long) var7 + var4) {
                    var12 = this.field1473;
                } else if (var4 >= this.field1473 && var4 < this.field1473 + (long) this.field1467) {
                    var12 = var4;
                }
                if (this.field1473 + (long) this.field1467 > var4 && this.field1473 + (long) this.field1467 <= (long) var7 + var4) {
                    var14 = this.field1473 + (long) this.field1467;
                } else if ((long) var7 + var4 > this.field1473 && (long) var7 + var4 <= this.field1473 + (long) this.field1467) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1470, (int) (var12 - this.field1473), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1479) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1479));
                        this.field1479 = var14;
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

    @ObfuscatedName("dj.p(I)V")
    public void method2291() throws IOException {
        this.field1471 = 0;
        if (this.field1479 != this.field1477) {
            this.field1480.method2348(this.field1479);
            this.field1477 = this.field1479;
        }
        this.field1469 = this.field1479;
        while (this.field1471 < this.field1468.length) {
            int var1 = this.field1480.method2328(this.field1468, this.field1471, this.field1468.length - this.field1471);
            if (var1 == -1) {
                break;
            }
            this.field1477 += (long) var1;
            this.field1471 += var1;
        }
    }

    @ObfuscatedName("dj.e([BIII)V")
    public void method2288(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1479 + (long) arg2 > this.field1476) {
                this.field1476 = this.field1479 + (long) arg2;
            }
            if (this.field1473 != -1L && (this.field1479 < this.field1473 || this.field1479 > this.field1473 + (long) this.field1467)) {
                this.method2285();
            }
            if (this.field1473 != -1L && this.field1479 + (long) arg2 > this.field1473 + (long) this.field1470.length) {
                int var4 = (int) ((long) this.field1470.length - (this.field1479 - this.field1473));
                System.arraycopy(arg0, arg1, this.field1470, (int) (this.field1479 - this.field1473), var4);
                this.field1479 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1467 = this.field1470.length;
                this.method2285();
            }
            if (arg2 > this.field1470.length) {
                if (this.field1479 != this.field1477) {
                    this.field1480.method2348(this.field1479);
                    this.field1477 = this.field1479;
                }
                this.field1480.method2324(arg0, arg1, arg2);
                this.field1477 += (long) arg2;
                if (this.field1477 > this.field1475) {
                    this.field1475 = this.field1477;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1479 >= this.field1469 && this.field1479 < this.field1469 + (long) this.field1471) {
                    var5 = this.field1479;
                } else if (this.field1469 >= this.field1479 && this.field1469 < this.field1479 + (long) arg2) {
                    var5 = this.field1469;
                }
                if (this.field1479 + (long) arg2 > this.field1469 && this.field1479 + (long) arg2 <= this.field1469 + (long) this.field1471) {
                    var7 = this.field1479 + (long) arg2;
                } else if (this.field1469 + (long) this.field1471 > this.field1479 && this.field1469 + (long) this.field1471 <= this.field1479 + (long) arg2) {
                    var7 = this.field1469 + (long) this.field1471;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1479), this.field1468, (int) (var5 - this.field1469), var9);
                }
                this.field1479 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1473 == -1L) {
                    this.field1473 = this.field1479;
                }
                System.arraycopy(arg0, arg1, this.field1470, (int) (this.field1479 - this.field1473), arg2);
                this.field1479 += (long) arg2;
                if (this.field1479 - this.field1473 > (long) this.field1467) {
                    this.field1467 = (int) (this.field1479 - this.field1473);
                }
            }
        } catch (IOException var11) {
            this.field1477 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dj.s(I)V")
    public void method2285() throws IOException {
        if (this.field1473 == -1L) {
            return;
        }
        if (this.field1477 != this.field1473) {
            this.field1480.method2348(this.field1473);
            this.field1477 = this.field1473;
        }
        this.field1480.method2324(this.field1470, 0, this.field1467);
        this.field1477 += (long) (this.field1467 * 380543785) * 148678937L;
        if (this.field1477 > this.field1475) {
            this.field1475 = this.field1477;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1473 >= this.field1469 && this.field1473 < this.field1469 + (long) this.field1471) {
            var1 = this.field1473;
        } else if (this.field1469 >= this.field1473 && this.field1469 < this.field1473 + (long) this.field1467) {
            var1 = this.field1469;
        }
        if (this.field1473 + (long) this.field1467 > this.field1469 && this.field1473 + (long) this.field1467 <= this.field1469 + (long) this.field1471) {
            var3 = this.field1473 + (long) this.field1467;
        } else if (this.field1469 + (long) this.field1471 > this.field1473 && this.field1469 + (long) this.field1471 <= this.field1473 + (long) this.field1467) {
            var3 = this.field1469 + (long) this.field1471;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1470, (int) (var1 - this.field1473), this.field1468, (int) (var1 - this.field1469), var5);
        }
        this.field1473 = -1L;
        this.field1467 = 0;
    }
}
