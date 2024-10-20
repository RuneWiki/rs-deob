package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dm")
public class class122 {

    @ObfuscatedName("dm.g")
    public class123 field1662;

    @ObfuscatedName("dm.e")
    public byte[] field1658;

    @ObfuscatedName("dm.b")
    public long field1659 = -1L;

    @ObfuscatedName("dm.z")
    public int field1660;

    @ObfuscatedName("dm.n")
    public byte[] field1661;

    @ObfuscatedName("dm.l")
    public long field1668 = -1L;

    @ObfuscatedName("dm.s")
    public int field1663 = 0;

    @ObfuscatedName("dm.y")
    public long field1664;

    @ObfuscatedName("dm.c")
    public long field1670;

    @ObfuscatedName("dm.h")
    public long field1665;

    @ObfuscatedName("dm.i")
    public long field1667;

    public class122(class123 arg0, int arg1, int arg2) throws IOException {
        this.field1662 = arg0;
        this.field1665 = this.field1670 = arg0.method2441();
        this.field1658 = new byte[arg1];
        this.field1661 = new byte[arg2];
        this.field1664 = 0L;
    }

    @ObfuscatedName("dm.g(I)V")
    public void method2409() throws IOException {
        this.method2399();
        this.field1662.method2444();
    }

    @ObfuscatedName("dm.e(J)V")
    public void method2401(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1664 = arg0;
    }

    @ObfuscatedName("dm.b(B)J")
    public long method2402() {
        return this.field1665;
    }

    @ObfuscatedName("dm.z([BI)V")
    public void method2403(byte[] arg0) throws IOException {
        this.method2417(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dm.n([BIIB)V")
    public void method2417(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1668 != -1L && this.field1664 >= this.field1668 && this.field1664 + (long) arg2 <= this.field1668 + (long) this.field1663) {
                System.arraycopy(this.field1661, (int) (this.field1664 - this.field1668), arg0, arg1, arg2);
                this.field1664 += (long) arg2;
                return;
            }
            long var4 = this.field1664;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1664 >= this.field1659 && this.field1664 < this.field1659 + (long) this.field1660) {
                int var8 = (int) ((long) this.field1660 - (this.field1664 - this.field1659));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1658, (int) (this.field1664 - this.field1659), arg0, arg1, var8);
                this.field1664 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1658.length) {
                this.field1662.method2428(this.field1664);
                this.field1667 = this.field1664;
                while (arg2 > 0) {
                    int var9 = this.field1662.method2432(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1667 += (long) var9;
                    this.field1664 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2405();
                int var10 = arg2;
                if (arg2 > this.field1660) {
                    var10 = this.field1660;
                }
                System.arraycopy(this.field1658, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1664 += (long) var10;
            }
            if (this.field1668 != -1L) {
                if (this.field1668 > this.field1664 && arg2 > 0) {
                    int var11 = (int) (this.field1668 - this.field1664) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1664++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1668 >= var4 && this.field1668 < (long) var7 + var4) {
                    var12 = this.field1668;
                } else if (var4 >= this.field1668 && var4 < this.field1668 + (long) this.field1663) {
                    var12 = var4;
                }
                if (this.field1668 + (long) this.field1663 > var4 && this.field1668 + (long) this.field1663 <= (long) var7 + var4) {
                    var14 = this.field1668 + (long) this.field1663;
                } else if ((long) var7 + var4 > this.field1668 && (long) var7 + var4 <= this.field1668 + (long) this.field1663) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1661, (int) (var12 - this.field1668), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1664) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1664));
                        this.field1664 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1667 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dm.l(I)V")
    public void method2405() throws IOException {
        this.field1660 = 0;
        if (this.field1667 != this.field1664) {
            this.field1662.method2428(this.field1664);
            this.field1667 = this.field1664;
        }
        this.field1659 = this.field1664;
        while (this.field1660 < this.field1658.length) {
            int var1 = this.field1662.method2432(this.field1658, this.field1660, this.field1658.length - this.field1660);
            if (var1 == -1) {
                break;
            }
            this.field1667 += (long) var1;
            this.field1660 += var1;
        }
    }

    @ObfuscatedName("dm.s([BIII)V")
    public void method2423(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1664 + (long) arg2 > this.field1665) {
                this.field1665 = this.field1664 + (long) arg2;
            }
            if (this.field1668 != -1L && (this.field1664 < this.field1668 || this.field1664 > this.field1668 + (long) this.field1663)) {
                this.method2399();
            }
            if (this.field1668 != -1L && this.field1664 + (long) arg2 > this.field1668 + (long) this.field1661.length) {
                int var4 = (int) ((long) this.field1661.length - (this.field1664 - this.field1668));
                System.arraycopy(arg0, arg1, this.field1661, (int) (this.field1664 - this.field1668), var4);
                this.field1664 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1663 = this.field1661.length;
                this.method2399();
            }
            if (arg2 > this.field1661.length) {
                if (this.field1667 != this.field1664) {
                    this.field1662.method2428(this.field1664);
                    this.field1667 = this.field1664;
                }
                this.field1662.method2429(arg0, arg1, arg2);
                this.field1667 += (long) arg2;
                if (this.field1667 > this.field1670) {
                    this.field1670 = this.field1667;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1664 >= this.field1659 && this.field1664 < this.field1659 + (long) this.field1660) {
                    var5 = this.field1664;
                } else if (this.field1659 >= this.field1664 && this.field1659 < this.field1664 + (long) arg2) {
                    var5 = this.field1659;
                }
                if (this.field1664 + (long) arg2 > this.field1659 && this.field1664 + (long) arg2 <= this.field1659 + (long) this.field1660) {
                    var7 = this.field1664 + (long) arg2;
                } else if (this.field1659 + (long) this.field1660 > this.field1664 && this.field1659 + (long) this.field1660 <= this.field1664 + (long) arg2) {
                    var7 = this.field1659 + (long) this.field1660;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1664), this.field1658, (int) (var5 - this.field1659), var9);
                }
                this.field1664 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1668 == -1L) {
                    this.field1668 = this.field1664;
                }
                System.arraycopy(arg0, arg1, this.field1661, (int) (this.field1664 - this.field1668), arg2);
                this.field1664 += (long) arg2;
                if (this.field1664 - this.field1668 > (long) this.field1663) {
                    this.field1663 = (int) (this.field1664 - this.field1668);
                }
            }
        } catch (IOException var11) {
            this.field1667 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dm.y(I)V")
    public void method2399() throws IOException {
        if (this.field1668 == -1L) {
            return;
        }
        if (this.field1668 != this.field1667) {
            this.field1662.method2428(this.field1668);
            this.field1667 = this.field1668;
        }
        this.field1662.method2429(this.field1661, 0, this.field1663);
        this.field1667 += (long) (this.field1663 * -1471695941) * 1432820083L;
        if (this.field1667 > this.field1670) {
            this.field1670 = this.field1667;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1668 >= this.field1659 && this.field1668 < this.field1659 + (long) this.field1660) {
            var1 = this.field1668;
        } else if (this.field1659 >= this.field1668 && this.field1659 < this.field1668 + (long) this.field1663) {
            var1 = this.field1659;
        }
        if (this.field1668 + (long) this.field1663 > this.field1659 && this.field1668 + (long) this.field1663 <= this.field1659 + (long) this.field1660) {
            var3 = this.field1668 + (long) this.field1663;
        } else if (this.field1659 + (long) this.field1660 > this.field1668 && this.field1659 + (long) this.field1660 <= this.field1668 + (long) this.field1663) {
            var3 = this.field1659 + (long) this.field1660;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1661, (int) (var1 - this.field1668), this.field1658, (int) (var1 - this.field1659), var5);
        }
        this.field1668 = -1L;
        this.field1663 = 0;
    }
}
