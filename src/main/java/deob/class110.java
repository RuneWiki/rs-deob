package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dd")
public class class110 {

    @ObfuscatedName("dd.w")
    public class111 field1443;

    @ObfuscatedName("dd.m")
    public byte[] field1452;

    @ObfuscatedName("dd.q")
    public long field1444 = -1L;

    @ObfuscatedName("dd.b")
    public int field1451;

    @ObfuscatedName("dd.f")
    public byte[] field1453;

    @ObfuscatedName("dd.n")
    public long field1446 = -1L;

    @ObfuscatedName("dd.h")
    public int field1448 = 0;

    @ObfuscatedName("dd.x")
    public long field1449;

    @ObfuscatedName("dd.j")
    public long field1450;

    @ObfuscatedName("dd.a")
    public long field1447;

    @ObfuscatedName("dd.l")
    public long field1445;

    public class110(class111 arg0, int arg1, int arg2) throws IOException {
        this.field1443 = arg0;
        this.field1447 = this.field1450 = arg0.method2361();
        this.field1452 = new byte[arg1];
        this.field1453 = new byte[arg2];
        this.field1449 = 0L;
    }

    @ObfuscatedName("dd.w(I)V")
    public void method2307() throws IOException {
        this.method2314();
        this.field1443.method2351();
    }

    @ObfuscatedName("dd.m(J)V")
    public void method2308(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1449 = arg0;
    }

    @ObfuscatedName("dd.q(I)J")
    public long method2318() {
        return this.field1447;
    }

    @ObfuscatedName("dd.x([BB)V")
    public void method2328(byte[] arg0) throws IOException {
        this.method2315(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dd.j([BIIS)V")
    public void method2315(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1446 != -1L && this.field1449 >= this.field1446 && this.field1449 + (long) arg2 <= this.field1446 + (long) this.field1448) {
                System.arraycopy(this.field1453, (int) (this.field1449 - this.field1446), arg0, arg1, arg2);
                this.field1449 += (long) arg2;
                return;
            }
            long var4 = this.field1449;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1449 >= this.field1444 && this.field1449 < this.field1444 + (long) this.field1451) {
                int var8 = (int) ((long) this.field1451 - (this.field1449 - this.field1444));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1452, (int) (this.field1449 - this.field1444), arg0, arg1, var8);
                this.field1449 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1452.length) {
                this.field1443.method2342(this.field1449);
                this.field1445 = this.field1449;
                while (arg2 > 0) {
                    int var9 = this.field1443.method2347(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1445 += (long) var9;
                    this.field1449 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2316();
                int var10 = arg2;
                if (arg2 > this.field1451) {
                    var10 = this.field1451;
                }
                System.arraycopy(this.field1452, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1449 += (long) var10;
            }
            if (this.field1446 != -1L) {
                if (this.field1446 > this.field1449 && arg2 > 0) {
                    int var11 = (int) (this.field1446 - this.field1449) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1449++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1446 >= var4 && this.field1446 < (long) var7 + var4) {
                    var12 = this.field1446;
                } else if (var4 >= this.field1446 && var4 < this.field1446 + (long) this.field1448) {
                    var12 = var4;
                }
                if (this.field1446 + (long) this.field1448 > var4 && this.field1446 + (long) this.field1448 <= (long) var7 + var4) {
                    var14 = this.field1446 + (long) this.field1448;
                } else if ((long) var7 + var4 > this.field1446 && (long) var7 + var4 <= this.field1446 + (long) this.field1448) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1453, (int) (var12 - this.field1446), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1449) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1449));
                        this.field1449 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1445 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dd.a(B)V")
    public void method2316() throws IOException {
        this.field1451 = 0;
        if (this.field1449 != this.field1445) {
            this.field1443.method2342(this.field1449);
            this.field1445 = this.field1449;
        }
        this.field1444 = this.field1449;
        while (this.field1451 < this.field1452.length) {
            int var1 = this.field1443.method2347(this.field1452, this.field1451, this.field1452.length - this.field1451);
            if (var1 == -1) {
                break;
            }
            this.field1445 += (long) var1;
            this.field1451 += var1;
        }
    }

    @ObfuscatedName("dd.l([BIIB)V")
    public void method2313(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1449 + (long) arg2 > this.field1447) {
                this.field1447 = this.field1449 + (long) arg2;
            }
            if (this.field1446 != -1L && (this.field1449 < this.field1446 || this.field1449 > this.field1446 + (long) this.field1448)) {
                this.method2314();
            }
            if (this.field1446 != -1L && this.field1449 + (long) arg2 > this.field1446 + (long) this.field1453.length) {
                int var4 = (int) ((long) this.field1453.length - (this.field1449 - this.field1446));
                System.arraycopy(arg0, arg1, this.field1453, (int) (this.field1449 - this.field1446), var4);
                this.field1449 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1448 = this.field1453.length;
                this.method2314();
            }
            if (arg2 > this.field1453.length) {
                if (this.field1449 != this.field1445) {
                    this.field1443.method2342(this.field1449);
                    this.field1445 = this.field1449;
                }
                this.field1443.method2343(arg0, arg1, arg2);
                this.field1445 += (long) arg2;
                if (this.field1445 > this.field1450) {
                    this.field1450 = this.field1445;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1449 >= this.field1444 && this.field1449 < this.field1444 + (long) this.field1451) {
                    var5 = this.field1449;
                } else if (this.field1444 >= this.field1449 && this.field1444 < this.field1449 + (long) arg2) {
                    var5 = this.field1444;
                }
                if (this.field1449 + (long) arg2 > this.field1444 && this.field1449 + (long) arg2 <= this.field1444 + (long) this.field1451) {
                    var7 = this.field1449 + (long) arg2;
                } else if (this.field1444 + (long) this.field1451 > this.field1449 && this.field1444 + (long) this.field1451 <= this.field1449 + (long) arg2) {
                    var7 = this.field1444 + (long) this.field1451;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1449), this.field1452, (int) (var5 - this.field1444), var9);
                }
                this.field1449 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1446 == -1L) {
                    this.field1446 = this.field1449;
                }
                System.arraycopy(arg0, arg1, this.field1453, (int) (this.field1449 - this.field1446), arg2);
                this.field1449 += (long) arg2;
                if (this.field1449 - this.field1446 > (long) this.field1448) {
                    this.field1448 = (int) (this.field1449 - this.field1446);
                }
            }
        } catch (IOException var11) {
            this.field1445 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dd.d(I)V")
    public void method2314() throws IOException {
        if (this.field1446 == -1L) {
            return;
        }
        if (this.field1446 != this.field1445) {
            this.field1443.method2342(this.field1446);
            this.field1445 = this.field1446;
        }
        this.field1443.method2343(this.field1453, 0, this.field1448);
        this.field1445 += (long) (this.field1448 * 1912644031) * 1131433535L;
        if (this.field1445 > this.field1450) {
            this.field1450 = this.field1445;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1446 >= this.field1444 && this.field1446 < this.field1444 + (long) this.field1451) {
            var1 = this.field1446;
        } else if (this.field1444 >= this.field1446 && this.field1444 < this.field1446 + (long) this.field1448) {
            var1 = this.field1444;
        }
        if (this.field1446 + (long) this.field1448 > this.field1444 && this.field1446 + (long) this.field1448 <= this.field1444 + (long) this.field1451) {
            var3 = this.field1446 + (long) this.field1448;
        } else if (this.field1444 + (long) this.field1451 > this.field1446 && this.field1444 + (long) this.field1451 <= this.field1446 + (long) this.field1448) {
            var3 = this.field1444 + (long) this.field1451;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1453, (int) (var1 - this.field1446), this.field1452, (int) (var1 - this.field1444), var5);
        }
        this.field1446 = -1L;
        this.field1448 = 0;
    }
}
