package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dk")
public class class122 {

    @ObfuscatedName("dk.t")
    public class123 field1662;

    @ObfuscatedName("dk.q")
    public byte[] field1664;

    @ObfuscatedName("dk.i")
    public long field1669 = -1L;

    @ObfuscatedName("dk.a")
    public int field1663;

    @ObfuscatedName("dk.l")
    public byte[] field1665;

    @ObfuscatedName("dk.b")
    public long field1666 = -1L;

    @ObfuscatedName("dk.e")
    public int field1667 = 0;

    @ObfuscatedName("dk.x")
    public long field1668;

    @ObfuscatedName("dk.p")
    public long field1672;

    @ObfuscatedName("dk.g")
    public long field1670;

    @ObfuscatedName("dk.n")
    public long field1671;

    public class122(class123 arg0, int arg1, int arg2) throws IOException {
        this.field1662 = arg0;
        this.field1670 = this.field1672 = arg0.method2332();
        this.field1664 = new byte[arg1];
        this.field1665 = new byte[arg2];
        this.field1668 = 0L;
    }

    @ObfuscatedName("dk.t(I)V")
    public void method2302() throws IOException {
        this.method2296();
        this.field1662.method2315();
    }

    @ObfuscatedName("dk.q(J)V")
    public void method2290(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1668 = arg0;
    }

    @ObfuscatedName("dk.i(I)J")
    public long method2288() {
        return this.field1670;
    }

    @ObfuscatedName("dk.a([BB)V")
    public void method2292(byte[] arg0) throws IOException {
        this.method2293(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dk.l([BIII)V")
    public void method2293(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1666 != -1L && this.field1668 >= this.field1666 && this.field1668 + (long) arg2 <= this.field1666 + (long) this.field1667) {
                System.arraycopy(this.field1665, (int) (this.field1668 - this.field1666), arg0, arg1, arg2);
                this.field1668 += (long) arg2;
                return;
            }
            long var4 = this.field1668;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1668 >= this.field1669 && this.field1668 < this.field1669 + (long) this.field1663) {
                int var8 = (int) ((long) this.field1663 - (this.field1668 - this.field1669));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1664, (int) (this.field1668 - this.field1669), arg0, arg1, var8);
                this.field1668 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1664.length) {
                this.field1662.method2340(this.field1668);
                this.field1671 = this.field1668;
                while (arg2 > 0) {
                    int var9 = this.field1662.method2318(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1671 += (long) var9;
                    this.field1668 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2294();
                int var10 = arg2;
                if (arg2 > this.field1663) {
                    var10 = this.field1663;
                }
                System.arraycopy(this.field1664, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1668 += (long) var10;
            }
            if (this.field1666 != -1L) {
                if (this.field1666 > this.field1668 && arg2 > 0) {
                    int var11 = (int) (this.field1666 - this.field1668) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1668++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1666 >= var4 && this.field1666 < (long) var7 + var4) {
                    var12 = this.field1666;
                } else if (var4 >= this.field1666 && var4 < this.field1666 + (long) this.field1667) {
                    var12 = var4;
                }
                if (this.field1666 + (long) this.field1667 > var4 && this.field1666 + (long) this.field1667 <= (long) var7 + var4) {
                    var14 = this.field1666 + (long) this.field1667;
                } else if ((long) var7 + var4 > this.field1666 && (long) var7 + var4 <= this.field1666 + (long) this.field1667) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1665, (int) (var12 - this.field1666), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1668) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1668));
                        this.field1668 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1671 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dk.b(I)V")
    public void method2294() throws IOException {
        this.field1663 = 0;
        if (this.field1671 != this.field1668) {
            this.field1662.method2340(this.field1668);
            this.field1671 = this.field1668;
        }
        this.field1669 = this.field1668;
        while (this.field1663 < this.field1664.length) {
            int var1 = this.field1662.method2318(this.field1664, this.field1663, this.field1664.length - this.field1663);
            if (var1 == -1) {
                break;
            }
            this.field1671 += (long) var1;
            this.field1663 += var1;
        }
    }

    @ObfuscatedName("dk.e([BIII)V")
    public void method2309(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1668 + (long) arg2 > this.field1670) {
                this.field1670 = this.field1668 + (long) arg2;
            }
            if (this.field1666 != -1L && (this.field1668 < this.field1666 || this.field1668 > this.field1666 + (long) this.field1667)) {
                this.method2296();
            }
            if (this.field1666 != -1L && this.field1668 + (long) arg2 > this.field1666 + (long) this.field1665.length) {
                int var4 = (int) ((long) this.field1665.length - (this.field1668 - this.field1666));
                System.arraycopy(arg0, arg1, this.field1665, (int) (this.field1668 - this.field1666), var4);
                this.field1668 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1667 = this.field1665.length;
                this.method2296();
            }
            if (arg2 > this.field1665.length) {
                if (this.field1671 != this.field1668) {
                    this.field1662.method2340(this.field1668);
                    this.field1671 = this.field1668;
                }
                this.field1662.method2314(arg0, arg1, arg2);
                this.field1671 += (long) arg2;
                if (this.field1671 > this.field1672) {
                    this.field1672 = this.field1671;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1668 >= this.field1669 && this.field1668 < this.field1669 + (long) this.field1663) {
                    var5 = this.field1668;
                } else if (this.field1669 >= this.field1668 && this.field1669 < this.field1668 + (long) arg2) {
                    var5 = this.field1669;
                }
                if (this.field1668 + (long) arg2 > this.field1669 && this.field1668 + (long) arg2 <= this.field1669 + (long) this.field1663) {
                    var7 = this.field1668 + (long) arg2;
                } else if (this.field1669 + (long) this.field1663 > this.field1668 && this.field1669 + (long) this.field1663 <= this.field1668 + (long) arg2) {
                    var7 = this.field1669 + (long) this.field1663;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1668), this.field1664, (int) (var5 - this.field1669), var9);
                }
                this.field1668 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1666 == -1L) {
                    this.field1666 = this.field1668;
                }
                System.arraycopy(arg0, arg1, this.field1665, (int) (this.field1668 - this.field1666), arg2);
                this.field1668 += (long) arg2;
                if (this.field1668 - this.field1666 > (long) this.field1667) {
                    this.field1667 = (int) (this.field1668 - this.field1666);
                }
            }
        } catch (IOException var11) {
            this.field1671 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dk.x(B)V")
    public void method2296() throws IOException {
        if (this.field1666 == -1L) {
            return;
        }
        if (this.field1671 != this.field1666) {
            this.field1662.method2340(this.field1666);
            this.field1671 = this.field1666;
        }
        this.field1662.method2314(this.field1665, 0, this.field1667);
        this.field1671 += (long) (this.field1667 * -633452679) * 1408660169L;
        if (this.field1671 > this.field1672) {
            this.field1672 = this.field1671;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1666 >= this.field1669 && this.field1666 < this.field1669 + (long) this.field1663) {
            var1 = this.field1666;
        } else if (this.field1669 >= this.field1666 && this.field1669 < this.field1666 + (long) this.field1667) {
            var1 = this.field1669;
        }
        if (this.field1666 + (long) this.field1667 > this.field1669 && this.field1666 + (long) this.field1667 <= this.field1669 + (long) this.field1663) {
            var3 = this.field1666 + (long) this.field1667;
        } else if (this.field1669 + (long) this.field1663 > this.field1666 && this.field1669 + (long) this.field1663 <= this.field1666 + (long) this.field1667) {
            var3 = this.field1669 + (long) this.field1663;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1665, (int) (var1 - this.field1666), this.field1664, (int) (var1 - this.field1669), var5);
        }
        this.field1666 = -1L;
        this.field1667 = 0;
    }
}
