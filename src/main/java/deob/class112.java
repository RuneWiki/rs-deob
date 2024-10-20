package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dc")
public class class112 {

    @ObfuscatedName("dc.f")
    public class113 field1471;

    @ObfuscatedName("dc.h")
    public byte[] field1464;

    @ObfuscatedName("dc.e")
    public long field1465 = -1L;

    @ObfuscatedName("dc.b")
    public int field1474;

    @ObfuscatedName("dc.l")
    public byte[] field1466;

    @ObfuscatedName("dc.w")
    public long field1468 = -1L;

    @ObfuscatedName("dc.d")
    public int field1469 = 0;

    @ObfuscatedName("dc.n")
    public long field1470;

    @ObfuscatedName("dc.s")
    public long field1476;

    @ObfuscatedName("dc.g")
    public long field1472;

    @ObfuscatedName("dc.a")
    public long field1473;

    public class112(class113 arg0, int arg1, int arg2) throws IOException {
        this.field1471 = arg0;
        this.field1472 = this.field1476 = arg0.method2330();
        this.field1464 = new byte[arg1];
        this.field1466 = new byte[arg2];
        this.field1470 = 0L;
    }

    @ObfuscatedName("dc.f(B)V")
    public void method2299() throws IOException {
        this.method2296();
        this.field1471.method2343();
    }

    @ObfuscatedName("dc.h(J)V")
    public void method2297(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1470 = arg0;
    }

    @ObfuscatedName("dc.e(B)J")
    public long method2291() {
        return this.field1472;
    }

    @ObfuscatedName("dc.b([BS)V")
    public void method2316(byte[] arg0) throws IOException {
        this.method2293(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dc.l([BIII)V")
    public void method2293(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1468 != -1L && this.field1470 >= this.field1468 && this.field1470 + (long) arg2 <= this.field1468 + (long) this.field1469) {
                System.arraycopy(this.field1466, (int) (this.field1470 - this.field1468), arg0, arg1, arg2);
                this.field1470 += (long) arg2;
                return;
            }
            long var4 = this.field1470;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1470 >= this.field1465 && this.field1470 < this.field1465 + (long) this.field1474) {
                int var8 = (int) ((long) this.field1474 - (this.field1470 - this.field1465));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1464, (int) (this.field1470 - this.field1465), arg0, arg1, var8);
                this.field1470 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1464.length) {
                this.field1471.method2326(this.field1470);
                this.field1473 = this.field1470;
                while (arg2 > 0) {
                    int var9 = this.field1471.method2331(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1473 += (long) var9;
                    this.field1470 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2311();
                int var10 = arg2;
                if (arg2 > this.field1474) {
                    var10 = this.field1474;
                }
                System.arraycopy(this.field1464, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1470 += (long) var10;
            }
            if (this.field1468 != -1L) {
                if (this.field1468 > this.field1470 && arg2 > 0) {
                    int var11 = (int) (this.field1468 - this.field1470) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1470++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1468 >= var4 && this.field1468 < (long) var7 + var4) {
                    var12 = this.field1468;
                } else if (var4 >= this.field1468 && var4 < this.field1468 + (long) this.field1469) {
                    var12 = var4;
                }
                if (this.field1468 + (long) this.field1469 > var4 && this.field1468 + (long) this.field1469 <= (long) var7 + var4) {
                    var14 = this.field1468 + (long) this.field1469;
                } else if ((long) var7 + var4 > this.field1468 && (long) var7 + var4 <= this.field1468 + (long) this.field1469) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1466, (int) (var12 - this.field1468), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1470) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1470));
                        this.field1470 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1473 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dc.w(I)V")
    public void method2311() throws IOException {
        this.field1474 = 0;
        if (this.field1473 != this.field1470) {
            this.field1471.method2326(this.field1470);
            this.field1473 = this.field1470;
        }
        this.field1465 = this.field1470;
        while (this.field1474 < this.field1464.length) {
            int var1 = this.field1471.method2331(this.field1464, this.field1474, this.field1464.length - this.field1474);
            if (var1 == -1) {
                break;
            }
            this.field1473 += (long) var1;
            this.field1474 += var1;
        }
    }

    @ObfuscatedName("dc.d([BIII)V")
    public void method2312(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1470 + (long) arg2 > this.field1472) {
                this.field1472 = this.field1470 + (long) arg2;
            }
            if (this.field1468 != -1L && (this.field1470 < this.field1468 || this.field1470 > this.field1468 + (long) this.field1469)) {
                this.method2296();
            }
            if (this.field1468 != -1L && this.field1470 + (long) arg2 > this.field1468 + (long) this.field1466.length) {
                int var4 = (int) ((long) this.field1466.length - (this.field1470 - this.field1468));
                System.arraycopy(arg0, arg1, this.field1466, (int) (this.field1470 - this.field1468), var4);
                this.field1470 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1469 = this.field1466.length;
                this.method2296();
            }
            if (arg2 > this.field1466.length) {
                if (this.field1473 != this.field1470) {
                    this.field1471.method2326(this.field1470);
                    this.field1473 = this.field1470;
                }
                this.field1471.method2347(arg0, arg1, arg2);
                this.field1473 += (long) arg2;
                if (this.field1473 > this.field1476) {
                    this.field1476 = this.field1473;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1470 >= this.field1465 && this.field1470 < this.field1465 + (long) this.field1474) {
                    var5 = this.field1470;
                } else if (this.field1465 >= this.field1470 && this.field1465 < this.field1470 + (long) arg2) {
                    var5 = this.field1465;
                }
                if (this.field1470 + (long) arg2 > this.field1465 && this.field1470 + (long) arg2 <= this.field1465 + (long) this.field1474) {
                    var7 = this.field1470 + (long) arg2;
                } else if (this.field1465 + (long) this.field1474 > this.field1470 && this.field1465 + (long) this.field1474 <= this.field1470 + (long) arg2) {
                    var7 = this.field1465 + (long) this.field1474;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1470), this.field1464, (int) (var5 - this.field1465), var9);
                }
                this.field1470 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1468 == -1L) {
                    this.field1468 = this.field1470;
                }
                System.arraycopy(arg0, arg1, this.field1466, (int) (this.field1470 - this.field1468), arg2);
                this.field1470 += (long) arg2;
                if (this.field1470 - this.field1468 > (long) this.field1469) {
                    this.field1469 = (int) (this.field1470 - this.field1468);
                }
            }
        } catch (IOException var11) {
            this.field1473 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dc.n(I)V")
    public void method2296() throws IOException {
        if (this.field1468 == -1L) {
            return;
        }
        if (this.field1473 != this.field1468) {
            this.field1471.method2326(this.field1468);
            this.field1473 = this.field1468;
        }
        this.field1471.method2347(this.field1466, 0, this.field1469);
        this.field1473 += (long) (this.field1469 * -581445405) * -2102383413L;
        if (this.field1473 > this.field1476) {
            this.field1476 = this.field1473;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1468 >= this.field1465 && this.field1468 < this.field1465 + (long) this.field1474) {
            var1 = this.field1468;
        } else if (this.field1465 >= this.field1468 && this.field1465 < this.field1468 + (long) this.field1469) {
            var1 = this.field1465;
        }
        if (this.field1468 + (long) this.field1469 > this.field1465 && this.field1468 + (long) this.field1469 <= this.field1465 + (long) this.field1474) {
            var3 = this.field1468 + (long) this.field1469;
        } else if (this.field1465 + (long) this.field1474 > this.field1468 && this.field1465 + (long) this.field1474 <= this.field1468 + (long) this.field1469) {
            var3 = this.field1465 + (long) this.field1474;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1466, (int) (var1 - this.field1468), this.field1464, (int) (var1 - this.field1465), var5);
        }
        this.field1468 = -1L;
        this.field1469 = 0;
    }
}
