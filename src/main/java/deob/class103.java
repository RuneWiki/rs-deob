package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("cv")
public class class103 {

    @ObfuscatedName("cv.d")
    public class104 field1544;

    @ObfuscatedName("cv.q")
    public byte[] field1529;

    @ObfuscatedName("cv.x")
    public long field1528 = -1L;

    @ObfuscatedName("cv.y")
    public int field1531;

    @ObfuscatedName("cv.e")
    public byte[] field1532;

    @ObfuscatedName("cv.f")
    public long field1530 = -1L;

    @ObfuscatedName("cv.v")
    public int field1534 = 0;

    @ObfuscatedName("cv.t")
    public long field1533;

    @ObfuscatedName("cv.i")
    public long field1535;

    @ObfuscatedName("cv.r")
    public long field1537;

    @ObfuscatedName("cv.g")
    public long field1538;

    public class103(class104 arg0, int arg1, int arg2) throws IOException {
        this.field1544 = arg0;
        this.field1537 = this.field1535 = arg0.method1758();
        this.field1529 = new byte[arg1];
        this.field1532 = new byte[arg2];
        this.field1533 = 0L;
    }

    @ObfuscatedName("cv.d(B)V")
    public void method1730() throws IOException {
        this.method1749();
        this.field1544.method1762();
    }

    @ObfuscatedName("cv.q(J)V")
    public void method1723(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1533 = arg0;
    }

    @ObfuscatedName("cv.x(I)J")
    public long method1724() {
        return this.field1537;
    }

    @ObfuscatedName("cv.y([BI)V")
    public void method1725(byte[] arg0) throws IOException {
        this.method1726(arg0, 0, arg0.length);
    }

    @ObfuscatedName("cv.e([BIIB)V")
    public void method1726(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1530 != -1L && this.field1533 >= this.field1530 && this.field1533 + (long) arg2 <= this.field1530 + (long) this.field1534) {
                System.arraycopy(this.field1532, (int) (this.field1533 - this.field1530), arg0, arg1, arg2);
                this.field1533 += (long) arg2;
                return;
            }
            long var4 = this.field1533;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1533 >= this.field1528 && this.field1533 < this.field1528 + (long) this.field1531) {
                int var8 = (int) ((long) this.field1531 - (this.field1533 - this.field1528));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1529, (int) (this.field1533 - this.field1528), arg0, arg1, var8);
                this.field1533 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1529.length) {
                this.field1544.method1767(this.field1533);
                this.field1538 = this.field1533;
                while (arg2 > 0) {
                    int var9 = this.field1544.method1759(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1538 += (long) var9;
                    this.field1533 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method1727();
                int var10 = arg2;
                if (arg2 > this.field1531) {
                    var10 = this.field1531;
                }
                System.arraycopy(this.field1529, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1533 += (long) var10;
            }
            if (this.field1530 != -1L) {
                if (this.field1530 > this.field1533 && arg2 > 0) {
                    int var11 = (int) (this.field1530 - this.field1533) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1533++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1530 >= var4 && this.field1530 < (long) var7 + var4) {
                    var12 = this.field1530;
                } else if (var4 >= this.field1530 && var4 < this.field1530 + (long) this.field1534) {
                    var12 = var4;
                }
                if (this.field1530 + (long) this.field1534 > var4 && this.field1530 + (long) this.field1534 <= (long) var7 + var4) {
                    var14 = this.field1530 + (long) this.field1534;
                } else if ((long) var7 + var4 > this.field1530 && (long) var7 + var4 <= this.field1530 + (long) this.field1534) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1532, (int) (var12 - this.field1530), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1533) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1533));
                        this.field1533 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1538 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("cv.f(I)V")
    public void method1727() throws IOException {
        this.field1531 = 0;
        if (this.field1538 != this.field1533) {
            this.field1544.method1767(this.field1533);
            this.field1538 = this.field1533;
        }
        this.field1528 = this.field1533;
        while (this.field1531 < this.field1529.length) {
            int var1 = this.field1544.method1759(this.field1529, this.field1531, this.field1529.length - this.field1531);
            if (var1 == -1) {
                break;
            }
            this.field1538 += (long) var1;
            this.field1531 += var1;
        }
    }

    @ObfuscatedName("cv.v([BIIB)V")
    public void method1736(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1533 + (long) arg2 > this.field1537) {
                this.field1537 = this.field1533 + (long) arg2;
            }
            if (this.field1530 != -1L && (this.field1533 < this.field1530 || this.field1533 > this.field1530 + (long) this.field1534)) {
                this.method1749();
            }
            if (this.field1530 != -1L && this.field1533 + (long) arg2 > this.field1530 + (long) this.field1532.length) {
                int var4 = (int) ((long) this.field1532.length - (this.field1533 - this.field1530));
                System.arraycopy(arg0, arg1, this.field1532, (int) (this.field1533 - this.field1530), var4);
                this.field1533 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1534 = this.field1532.length;
                this.method1749();
            }
            if (arg2 > this.field1532.length) {
                if (this.field1538 != this.field1533) {
                    this.field1544.method1767(this.field1533);
                    this.field1538 = this.field1533;
                }
                this.field1544.method1760(arg0, arg1, arg2);
                this.field1538 += (long) arg2;
                if (this.field1538 > this.field1535) {
                    this.field1535 = this.field1538;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1533 >= this.field1528 && this.field1533 < this.field1528 + (long) this.field1531) {
                    var5 = this.field1533;
                } else if (this.field1528 >= this.field1533 && this.field1528 < this.field1533 + (long) arg2) {
                    var5 = this.field1528;
                }
                if (this.field1533 + (long) arg2 > this.field1528 && this.field1533 + (long) arg2 <= this.field1528 + (long) this.field1531) {
                    var7 = this.field1533 + (long) arg2;
                } else if (this.field1528 + (long) this.field1531 > this.field1533 && this.field1528 + (long) this.field1531 <= this.field1533 + (long) arg2) {
                    var7 = this.field1528 + (long) this.field1531;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1533), this.field1529, (int) (var5 - this.field1528), var9);
                }
                this.field1533 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1530 == -1L) {
                    this.field1530 = this.field1533;
                }
                System.arraycopy(arg0, arg1, this.field1532, (int) (this.field1533 - this.field1530), arg2);
                this.field1533 += (long) arg2;
                if (this.field1533 - this.field1530 > (long) this.field1534) {
                    this.field1534 = (int) (this.field1533 - this.field1530);
                }
            }
        } catch (IOException var11) {
            this.field1538 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("cv.t(I)V")
    public void method1749() throws IOException {
        if (this.field1530 == -1L) {
            return;
        }
        if (this.field1538 != this.field1530) {
            this.field1544.method1767(this.field1530);
            this.field1538 = this.field1530;
        }
        this.field1544.method1760(this.field1532, 0, this.field1534);
        this.field1538 += (long) (this.field1534 * -236799625) * -1518735289L;
        if (this.field1538 > this.field1535) {
            this.field1535 = this.field1538;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1530 >= this.field1528 && this.field1530 < this.field1528 + (long) this.field1531) {
            var1 = this.field1530;
        } else if (this.field1528 >= this.field1530 && this.field1528 < this.field1530 + (long) this.field1534) {
            var1 = this.field1528;
        }
        if (this.field1530 + (long) this.field1534 > this.field1528 && this.field1530 + (long) this.field1534 <= this.field1528 + (long) this.field1531) {
            var3 = this.field1530 + (long) this.field1534;
        } else if (this.field1528 + (long) this.field1531 > this.field1530 && this.field1528 + (long) this.field1531 <= this.field1530 + (long) this.field1534) {
            var3 = this.field1528 + (long) this.field1531;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1532, (int) (var1 - this.field1530), this.field1529, (int) (var1 - this.field1528), var5);
        }
        this.field1530 = -1L;
        this.field1534 = 0;
    }
}
