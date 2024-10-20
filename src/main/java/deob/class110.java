package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dy")
public class class110 {

    @ObfuscatedName("dy.z")
    public class111 field1426;

    @ObfuscatedName("dy.w")
    public byte[] field1419;

    @ObfuscatedName("dy.s")
    public long field1418 = -1L;

    @ObfuscatedName("dy.l")
    public int field1422;

    @ObfuscatedName("dy.u")
    public byte[] field1424;

    @ObfuscatedName("dy.q")
    public long field1421 = -1L;

    @ObfuscatedName("dy.k")
    public int field1427 = 0;

    @ObfuscatedName("dy.i")
    public long field1425;

    @ObfuscatedName("dy.x")
    public long field1423;

    @ObfuscatedName("dy.e")
    public long field1430;

    @ObfuscatedName("dy.p")
    public long field1428;

    public class110(class111 arg0, int arg1, int arg2) throws IOException {
        this.field1426 = arg0;
        this.field1430 = this.field1423 = arg0.method2305();
        this.field1419 = new byte[arg1];
        this.field1424 = new byte[arg2];
        this.field1425 = 0L;
    }

    @ObfuscatedName("dy.z(I)V")
    public void method2289() throws IOException {
        this.method2278();
        this.field1426.method2303();
    }

    @ObfuscatedName("dy.w(J)V")
    public void method2272(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1425 = arg0;
    }

    @ObfuscatedName("dy.s(I)J")
    public long method2282() {
        return this.field1430;
    }

    @ObfuscatedName("dy.l([BI)V")
    public void method2274(byte[] arg0) throws IOException {
        this.method2275(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dy.u([BIII)V")
    public void method2275(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1421 != -1L && this.field1425 >= this.field1421 && this.field1425 + (long) arg2 <= this.field1421 + (long) this.field1427) {
                System.arraycopy(this.field1424, (int) (this.field1425 - this.field1421), arg0, arg1, arg2);
                this.field1425 += (long) arg2;
                return;
            }
            long var4 = this.field1425;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1425 >= this.field1418 && this.field1425 < this.field1418 + (long) this.field1422) {
                int var8 = (int) ((long) this.field1422 - (this.field1425 - this.field1418));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1419, (int) (this.field1425 - this.field1418), arg0, arg1, var8);
                this.field1425 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1419.length) {
                this.field1426.method2310(this.field1425);
                this.field1428 = this.field1425;
                while (arg2 > 0) {
                    int var9 = this.field1426.method2306(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1428 += (long) var9;
                    this.field1425 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2276();
                int var10 = arg2;
                if (arg2 > this.field1422) {
                    var10 = this.field1422;
                }
                System.arraycopy(this.field1419, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1425 += (long) var10;
            }
            if (this.field1421 != -1L) {
                if (this.field1421 > this.field1425 && arg2 > 0) {
                    int var11 = (int) (this.field1421 - this.field1425) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1425++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1421 >= var4 && this.field1421 < (long) var7 + var4) {
                    var12 = this.field1421;
                } else if (var4 >= this.field1421 && var4 < this.field1421 + (long) this.field1427) {
                    var12 = var4;
                }
                if (this.field1421 + (long) this.field1427 > var4 && this.field1421 + (long) this.field1427 <= (long) var7 + var4) {
                    var14 = this.field1421 + (long) this.field1427;
                } else if ((long) var7 + var4 > this.field1421 && (long) var7 + var4 <= this.field1421 + (long) this.field1427) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1424, (int) (var12 - this.field1421), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1425) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1425));
                        this.field1425 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1428 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dy.q(I)V")
    public void method2276() throws IOException {
        this.field1422 = 0;
        if (this.field1428 != this.field1425) {
            this.field1426.method2310(this.field1425);
            this.field1428 = this.field1425;
        }
        this.field1418 = this.field1425;
        while (this.field1422 < this.field1419.length) {
            int var1 = this.field1426.method2306(this.field1419, this.field1422, this.field1419.length - this.field1422);
            if (var1 == -1) {
                break;
            }
            this.field1428 += (long) var1;
            this.field1422 += var1;
        }
    }

    @ObfuscatedName("dy.i([BIII)V")
    public void method2277(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1425 + (long) arg2 > this.field1430) {
                this.field1430 = this.field1425 + (long) arg2;
            }
            if (this.field1421 != -1L && (this.field1425 < this.field1421 || this.field1425 > this.field1421 + (long) this.field1427)) {
                this.method2278();
            }
            if (this.field1421 != -1L && this.field1425 + (long) arg2 > this.field1421 + (long) this.field1424.length) {
                int var4 = (int) ((long) this.field1424.length - (this.field1425 - this.field1421));
                System.arraycopy(arg0, arg1, this.field1424, (int) (this.field1425 - this.field1421), var4);
                this.field1425 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1427 = this.field1424.length;
                this.method2278();
            }
            if (arg2 > this.field1424.length) {
                if (this.field1428 != this.field1425) {
                    this.field1426.method2310(this.field1425);
                    this.field1428 = this.field1425;
                }
                this.field1426.method2302(arg0, arg1, arg2);
                this.field1428 += (long) arg2;
                if (this.field1428 > this.field1423) {
                    this.field1423 = this.field1428;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1425 >= this.field1418 && this.field1425 < this.field1418 + (long) this.field1422) {
                    var5 = this.field1425;
                } else if (this.field1418 >= this.field1425 && this.field1418 < this.field1425 + (long) arg2) {
                    var5 = this.field1418;
                }
                if (this.field1425 + (long) arg2 > this.field1418 && this.field1425 + (long) arg2 <= this.field1418 + (long) this.field1422) {
                    var7 = this.field1425 + (long) arg2;
                } else if (this.field1418 + (long) this.field1422 > this.field1425 && this.field1418 + (long) this.field1422 <= this.field1425 + (long) arg2) {
                    var7 = this.field1418 + (long) this.field1422;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1425), this.field1419, (int) (var5 - this.field1418), var9);
                }
                this.field1425 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1421 == -1L) {
                    this.field1421 = this.field1425;
                }
                System.arraycopy(arg0, arg1, this.field1424, (int) (this.field1425 - this.field1421), arg2);
                this.field1425 += (long) arg2;
                if (this.field1425 - this.field1421 > (long) this.field1427) {
                    this.field1427 = (int) (this.field1425 - this.field1421);
                }
            }
        } catch (IOException var11) {
            this.field1428 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dy.x(B)V")
    public void method2278() throws IOException {
        if (this.field1421 == -1L) {
            return;
        }
        if (this.field1428 != this.field1421) {
            this.field1426.method2310(this.field1421);
            this.field1428 = this.field1421;
        }
        this.field1426.method2302(this.field1424, 0, this.field1427);
        this.field1428 += (long) (this.field1427 * 1776216003) * 2034614507L;
        if (this.field1428 > this.field1423) {
            this.field1423 = this.field1428;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1421 >= this.field1418 && this.field1421 < this.field1418 + (long) this.field1422) {
            var1 = this.field1421;
        } else if (this.field1418 >= this.field1421 && this.field1418 < this.field1421 + (long) this.field1427) {
            var1 = this.field1418;
        }
        if (this.field1421 + (long) this.field1427 > this.field1418 && this.field1421 + (long) this.field1427 <= this.field1418 + (long) this.field1422) {
            var3 = this.field1421 + (long) this.field1427;
        } else if (this.field1418 + (long) this.field1422 > this.field1421 && this.field1418 + (long) this.field1422 <= this.field1421 + (long) this.field1427) {
            var3 = this.field1418 + (long) this.field1422;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1424, (int) (var1 - this.field1421), this.field1419, (int) (var1 - this.field1418), var5);
        }
        this.field1421 = -1L;
        this.field1427 = 0;
    }
}
