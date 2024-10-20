package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dt")
public class class117 {

    @ObfuscatedName("dt.n")
    public class118 field1493;

    @ObfuscatedName("dt.h")
    public byte[] field1483;

    @ObfuscatedName("dt.l")
    public long field1484 = -1L;

    @ObfuscatedName("dt.g")
    public int field1485;

    @ObfuscatedName("dt.b")
    public byte[] field1486;

    @ObfuscatedName("dt.a")
    public long field1487 = -1L;

    @ObfuscatedName("dt.c")
    public int field1488 = 0;

    @ObfuscatedName("dt.z")
    public long field1494;

    @ObfuscatedName("dt.j")
    public long field1491;

    @ObfuscatedName("dt.d")
    public long field1482;

    @ObfuscatedName("dt.t")
    public long field1492;

    public class117(class118 arg0, int arg1, int arg2) throws IOException {
        this.field1493 = arg0;
        this.field1482 = this.field1491 = arg0.method2523();
        this.field1483 = new byte[arg1];
        this.field1486 = new byte[arg2];
        this.field1494 = 0L;
    }

    @ObfuscatedName("dt.n(I)V")
    public void method2491() throws IOException {
        this.method2495();
        this.field1493.method2518();
    }

    @ObfuscatedName("dt.h(J)V")
    public void method2497(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1494 = arg0;
    }

    @ObfuscatedName("dt.l(I)J")
    public long method2493() {
        return this.field1482;
    }

    @ObfuscatedName("dt.g([BB)V")
    public void method2490(byte[] arg0) throws IOException {
        this.method2509(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dt.b([BIIB)V")
    public void method2509(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1487 != -1L && this.field1494 >= this.field1487 && this.field1494 + (long) arg2 <= this.field1487 + (long) this.field1488) {
                System.arraycopy(this.field1486, (int) (this.field1494 - this.field1487), arg0, arg1, arg2);
                this.field1494 += (long) arg2;
                return;
            }
            long var4 = this.field1494;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1494 >= this.field1484 && this.field1494 < this.field1484 + (long) this.field1485) {
                int var8 = (int) ((long) this.field1485 - (this.field1494 - this.field1484));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1483, (int) (this.field1494 - this.field1484), arg0, arg1, var8);
                this.field1494 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1483.length) {
                this.field1493.method2519(this.field1494);
                this.field1492 = this.field1494;
                while (arg2 > 0) {
                    int var9 = this.field1493.method2520(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1492 += (long) var9;
                    this.field1494 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2496();
                int var10 = arg2;
                if (arg2 > this.field1485) {
                    var10 = this.field1485;
                }
                System.arraycopy(this.field1483, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1494 += (long) var10;
            }
            if (this.field1487 != -1L) {
                if (this.field1487 > this.field1494 && arg2 > 0) {
                    int var11 = (int) (this.field1487 - this.field1494) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1494++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1487 >= var4 && this.field1487 < (long) var7 + var4) {
                    var12 = this.field1487;
                } else if (var4 >= this.field1487 && var4 < this.field1487 + (long) this.field1488) {
                    var12 = var4;
                }
                if (this.field1487 + (long) this.field1488 > var4 && this.field1487 + (long) this.field1488 <= (long) var7 + var4) {
                    var14 = this.field1487 + (long) this.field1488;
                } else if ((long) var7 + var4 > this.field1487 && (long) var7 + var4 <= this.field1487 + (long) this.field1488) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1486, (int) (var12 - this.field1487), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1494) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1494));
                        this.field1494 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1492 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dt.a(B)V")
    public void method2496() throws IOException {
        this.field1485 = 0;
        if (this.field1494 != this.field1492) {
            this.field1493.method2519(this.field1494);
            this.field1492 = this.field1494;
        }
        this.field1484 = this.field1494;
        while (this.field1485 < this.field1483.length) {
            int var1 = this.field1493.method2520(this.field1483, this.field1485, this.field1483.length - this.field1485);
            if (var1 == -1) {
                break;
            }
            this.field1492 += (long) var1;
            this.field1485 += var1;
        }
    }

    @ObfuscatedName("dt.c([BIII)V")
    public void method2494(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1494 + (long) arg2 > this.field1482) {
                this.field1482 = this.field1494 + (long) arg2;
            }
            if (this.field1487 != -1L && (this.field1494 < this.field1487 || this.field1494 > this.field1487 + (long) this.field1488)) {
                this.method2495();
            }
            if (this.field1487 != -1L && this.field1494 + (long) arg2 > this.field1487 + (long) this.field1486.length) {
                int var4 = (int) ((long) this.field1486.length - (this.field1494 - this.field1487));
                System.arraycopy(arg0, arg1, this.field1486, (int) (this.field1494 - this.field1487), var4);
                this.field1494 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1488 = this.field1486.length;
                this.method2495();
            }
            if (arg2 > this.field1486.length) {
                if (this.field1494 != this.field1492) {
                    this.field1493.method2519(this.field1494);
                    this.field1492 = this.field1494;
                }
                this.field1493.method2522(arg0, arg1, arg2);
                this.field1492 += (long) arg2;
                if (this.field1492 > this.field1491) {
                    this.field1491 = this.field1492;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1494 >= this.field1484 && this.field1494 < this.field1484 + (long) this.field1485) {
                    var5 = this.field1494;
                } else if (this.field1484 >= this.field1494 && this.field1484 < this.field1494 + (long) arg2) {
                    var5 = this.field1484;
                }
                if (this.field1494 + (long) arg2 > this.field1484 && this.field1494 + (long) arg2 <= this.field1484 + (long) this.field1485) {
                    var7 = this.field1494 + (long) arg2;
                } else if (this.field1484 + (long) this.field1485 > this.field1494 && this.field1484 + (long) this.field1485 <= this.field1494 + (long) arg2) {
                    var7 = this.field1484 + (long) this.field1485;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1494), this.field1483, (int) (var5 - this.field1484), var9);
                }
                this.field1494 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1487 == -1L) {
                    this.field1487 = this.field1494;
                }
                System.arraycopy(arg0, arg1, this.field1486, (int) (this.field1494 - this.field1487), arg2);
                this.field1494 += (long) arg2;
                if (this.field1494 - this.field1487 > (long) this.field1488) {
                    this.field1488 = (int) (this.field1494 - this.field1487);
                }
            }
        } catch (IOException var11) {
            this.field1492 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dt.z(I)V")
    public void method2495() throws IOException {
        if (this.field1487 == -1L) {
            return;
        }
        if (this.field1492 != this.field1487) {
            this.field1493.method2519(this.field1487);
            this.field1492 = this.field1487;
        }
        this.field1493.method2522(this.field1486, 0, this.field1488);
        this.field1492 += (long) (this.field1488 * 1003312673) * 1827909089L;
        if (this.field1492 > this.field1491) {
            this.field1491 = this.field1492;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1487 >= this.field1484 && this.field1487 < this.field1484 + (long) this.field1485) {
            var1 = this.field1487;
        } else if (this.field1484 >= this.field1487 && this.field1484 < this.field1487 + (long) this.field1488) {
            var1 = this.field1484;
        }
        if (this.field1487 + (long) this.field1488 > this.field1484 && this.field1487 + (long) this.field1488 <= this.field1484 + (long) this.field1485) {
            var3 = this.field1487 + (long) this.field1488;
        } else if (this.field1484 + (long) this.field1485 > this.field1487 && this.field1484 + (long) this.field1485 <= this.field1487 + (long) this.field1488) {
            var3 = this.field1484 + (long) this.field1485;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1486, (int) (var1 - this.field1487), this.field1483, (int) (var1 - this.field1484), var5);
        }
        this.field1487 = -1L;
        this.field1488 = 0;
    }
}
