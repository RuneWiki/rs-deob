package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dx")
public class class117 {

    @ObfuscatedName("dx.a")
    public class118 field1509;

    @ObfuscatedName("dx.s")
    public byte[] field1508;

    @ObfuscatedName("dx.g")
    public long field1515 = -1L;

    @ObfuscatedName("dx.x")
    public int field1507;

    @ObfuscatedName("dx.h")
    public byte[] field1505;

    @ObfuscatedName("dx.f")
    public long field1510 = -1L;

    @ObfuscatedName("dx.p")
    public int field1511 = 0;

    @ObfuscatedName("dx.m")
    public long field1512;

    @ObfuscatedName("dx.q")
    public long field1513;

    @ObfuscatedName("dx.b")
    public long field1514;

    @ObfuscatedName("dx.n")
    public long field1506;

    public class117(class118 arg0, int arg1, int arg2) throws IOException {
        this.field1509 = arg0;
        this.field1514 = this.field1513 = arg0.method2543();
        this.field1508 = new byte[arg1];
        this.field1505 = new byte[arg2];
        this.field1512 = 0L;
    }

    @ObfuscatedName("dx.a(I)V")
    public void method2505() throws IOException {
        this.method2512();
        this.field1509.method2541();
    }

    @ObfuscatedName("dx.s(J)V")
    public void method2506(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1512 = arg0;
    }

    @ObfuscatedName("dx.g(S)J")
    public long method2535() {
        return this.field1514;
    }

    @ObfuscatedName("dx.x([BI)V")
    public void method2508(byte[] arg0) throws IOException {
        this.method2507(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dx.h([BIIB)V")
    public void method2507(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1510 != -1L && this.field1512 >= this.field1510 && this.field1512 + (long) arg2 <= this.field1510 + (long) this.field1511) {
                System.arraycopy(this.field1505, (int) (this.field1512 - this.field1510), arg0, arg1, arg2);
                this.field1512 += (long) arg2;
                return;
            }
            long var4 = this.field1512;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1512 >= this.field1515 && this.field1512 < this.field1515 + (long) this.field1507) {
                int var8 = (int) ((long) this.field1507 - (this.field1512 - this.field1515));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1508, (int) (this.field1512 - this.field1515), arg0, arg1, var8);
                this.field1512 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1508.length) {
                this.field1509.method2539(this.field1512);
                this.field1506 = this.field1512;
                while (arg2 > 0) {
                    int var9 = this.field1509.method2544(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1506 += (long) var9;
                    this.field1512 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2510();
                int var10 = arg2;
                if (arg2 > this.field1507) {
                    var10 = this.field1507;
                }
                System.arraycopy(this.field1508, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1512 += (long) var10;
            }
            if (this.field1510 != -1L) {
                if (this.field1510 > this.field1512 && arg2 > 0) {
                    int var11 = (int) (this.field1510 - this.field1512) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1512++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1510 >= var4 && this.field1510 < (long) var7 + var4) {
                    var12 = this.field1510;
                } else if (var4 >= this.field1510 && var4 < this.field1510 + (long) this.field1511) {
                    var12 = var4;
                }
                if (this.field1510 + (long) this.field1511 > var4 && this.field1510 + (long) this.field1511 <= (long) var7 + var4) {
                    var14 = this.field1510 + (long) this.field1511;
                } else if ((long) var7 + var4 > this.field1510 && (long) var7 + var4 <= this.field1510 + (long) this.field1511) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1505, (int) (var12 - this.field1510), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1512) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1512));
                        this.field1512 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1506 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dx.f(I)V")
    public void method2510() throws IOException {
        this.field1507 = 0;
        if (this.field1512 != this.field1506) {
            this.field1509.method2539(this.field1512);
            this.field1506 = this.field1512;
        }
        this.field1515 = this.field1512;
        while (this.field1507 < this.field1508.length) {
            int var1 = this.field1509.method2544(this.field1508, this.field1507, this.field1508.length - this.field1507);
            if (var1 == -1) {
                break;
            }
            this.field1506 += (long) var1;
            this.field1507 += var1;
        }
    }

    @ObfuscatedName("dx.p([BIIB)V")
    public void method2514(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1512 + (long) arg2 > this.field1514) {
                this.field1514 = this.field1512 + (long) arg2;
            }
            if (this.field1510 != -1L && (this.field1512 < this.field1510 || this.field1512 > this.field1510 + (long) this.field1511)) {
                this.method2512();
            }
            if (this.field1510 != -1L && this.field1512 + (long) arg2 > this.field1510 + (long) this.field1505.length) {
                int var4 = (int) ((long) this.field1505.length - (this.field1512 - this.field1510));
                System.arraycopy(arg0, arg1, this.field1505, (int) (this.field1512 - this.field1510), var4);
                this.field1512 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1511 = this.field1505.length;
                this.method2512();
            }
            if (arg2 > this.field1505.length) {
                if (this.field1512 != this.field1506) {
                    this.field1509.method2539(this.field1512);
                    this.field1506 = this.field1512;
                }
                this.field1509.method2540(arg0, arg1, arg2);
                this.field1506 += (long) arg2;
                if (this.field1506 > this.field1513) {
                    this.field1513 = this.field1506;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1512 >= this.field1515 && this.field1512 < this.field1515 + (long) this.field1507) {
                    var5 = this.field1512;
                } else if (this.field1515 >= this.field1512 && this.field1515 < this.field1512 + (long) arg2) {
                    var5 = this.field1515;
                }
                if (this.field1512 + (long) arg2 > this.field1515 && this.field1512 + (long) arg2 <= this.field1515 + (long) this.field1507) {
                    var7 = this.field1512 + (long) arg2;
                } else if (this.field1515 + (long) this.field1507 > this.field1512 && this.field1515 + (long) this.field1507 <= this.field1512 + (long) arg2) {
                    var7 = this.field1515 + (long) this.field1507;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1512), this.field1508, (int) (var5 - this.field1515), var9);
                }
                this.field1512 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1510 == -1L) {
                    this.field1510 = this.field1512;
                }
                System.arraycopy(arg0, arg1, this.field1505, (int) (this.field1512 - this.field1510), arg2);
                this.field1512 += (long) arg2;
                if (this.field1512 - this.field1510 > (long) this.field1511) {
                    this.field1511 = (int) (this.field1512 - this.field1510);
                }
            }
        } catch (IOException var11) {
            this.field1506 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dx.m(B)V")
    public void method2512() throws IOException {
        if (this.field1510 == -1L) {
            return;
        }
        if (this.field1510 != this.field1506) {
            this.field1509.method2539(this.field1510);
            this.field1506 = this.field1510;
        }
        this.field1509.method2540(this.field1505, 0, this.field1511);
        this.field1506 += (long) (this.field1511 * 1255999059) * 1377119707L;
        if (this.field1506 > this.field1513) {
            this.field1513 = this.field1506;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1510 >= this.field1515 && this.field1510 < this.field1515 + (long) this.field1507) {
            var1 = this.field1510;
        } else if (this.field1515 >= this.field1510 && this.field1515 < this.field1510 + (long) this.field1511) {
            var1 = this.field1515;
        }
        if (this.field1510 + (long) this.field1511 > this.field1515 && this.field1510 + (long) this.field1511 <= this.field1515 + (long) this.field1507) {
            var3 = this.field1510 + (long) this.field1511;
        } else if (this.field1515 + (long) this.field1507 > this.field1510 && this.field1515 + (long) this.field1507 <= this.field1510 + (long) this.field1511) {
            var3 = this.field1515 + (long) this.field1507;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1505, (int) (var1 - this.field1510), this.field1508, (int) (var1 - this.field1515), var5);
        }
        this.field1510 = -1L;
        this.field1511 = 0;
    }
}
