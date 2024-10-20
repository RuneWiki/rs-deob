package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("dh")
public class class124 {

    @ObfuscatedName("dh.i")
    public class125 field1769;

    @ObfuscatedName("dh.w")
    public byte[] field1762;

    @ObfuscatedName("dh.a")
    public long field1766 = -1L;

    @ObfuscatedName("dh.t")
    public int field1763;

    @ObfuscatedName("dh.s")
    public byte[] field1765;

    @ObfuscatedName("dh.r")
    public long field1764 = -1L;

    @ObfuscatedName("dh.v")
    public int field1767 = 0;

    @ObfuscatedName("dh.y")
    public long field1761;

    @ObfuscatedName("dh.j")
    public long field1768;

    @ObfuscatedName("dh.k")
    public long field1770;

    @ObfuscatedName("dh.e")
    public long field1771;

    public class124(class125 arg0, int arg1, int arg2) throws IOException {
        this.field1769 = arg0;
        this.field1770 = this.field1768 = arg0.method2155();
        this.field1762 = new byte[arg1];
        this.field1765 = new byte[arg2];
        this.field1761 = 0L;
    }

    @ObfuscatedName("dh.i(I)V")
    public void method2109() throws IOException {
        this.method2116();
        this.field1769.method2157();
    }

    @ObfuscatedName("dh.w(J)V")
    public void method2114(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1761 = arg0;
    }

    @ObfuscatedName("dh.a(I)J")
    public long method2111() {
        return this.field1770;
    }

    @ObfuscatedName("dh.t([BB)V")
    public void method2112(byte[] arg0) throws IOException {
        this.method2137(arg0, 0, arg0.length);
    }

    @ObfuscatedName("dh.s([BIIB)V")
    public void method2137(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1764 != -1L && this.field1761 >= this.field1764 && this.field1761 + (long) arg2 <= this.field1764 + (long) this.field1767) {
                System.arraycopy(this.field1765, (int) (this.field1761 - this.field1764), arg0, arg1, arg2);
                this.field1761 += (long) arg2;
                return;
            }
            long var4 = this.field1761;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1761 >= this.field1766 && this.field1761 < this.field1766 + (long) this.field1763) {
                int var8 = (int) ((long) this.field1763 - (this.field1761 - this.field1766));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1762, (int) (this.field1761 - this.field1766), arg0, arg1, var8);
                this.field1761 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1762.length) {
                this.field1769.method2150(this.field1761);
                this.field1771 = this.field1761;
                while (arg2 > 0) {
                    int var9 = this.field1769.method2143(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1771 += (long) var9;
                    this.field1761 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2123();
                int var10 = arg2;
                if (arg2 > this.field1763) {
                    var10 = this.field1763;
                }
                System.arraycopy(this.field1762, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1761 += (long) var10;
            }
            if (this.field1764 != -1L) {
                if (this.field1764 > this.field1761 && arg2 > 0) {
                    int var11 = (int) (this.field1764 - this.field1761) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1761++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1764 >= var4 && this.field1764 < (long) var7 + var4) {
                    var12 = this.field1764;
                } else if (var4 >= this.field1764 && var4 < this.field1764 + (long) this.field1767) {
                    var12 = var4;
                }
                if (this.field1764 + (long) this.field1767 > var4 && this.field1764 + (long) this.field1767 <= (long) var7 + var4) {
                    var14 = this.field1764 + (long) this.field1767;
                } else if ((long) var7 + var4 > this.field1764 && (long) var7 + var4 <= this.field1764 + (long) this.field1767) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1765, (int) (var12 - this.field1764), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1761) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1761));
                        this.field1761 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1771 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("dh.r(B)V")
    public void method2123() throws IOException {
        this.field1763 = 0;
        if (this.field1771 != this.field1761) {
            this.field1769.method2150(this.field1761);
            this.field1771 = this.field1761;
        }
        this.field1766 = this.field1761;
        while (this.field1763 < this.field1762.length) {
            int var1 = this.field1769.method2143(this.field1762, this.field1763, this.field1762.length - this.field1763);
            if (var1 == -1) {
                break;
            }
            this.field1771 += (long) var1;
            this.field1763 += var1;
        }
    }

    @ObfuscatedName("dh.v([BIII)V")
    public void method2115(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1761 + (long) arg2 > this.field1770) {
                this.field1770 = this.field1761 + (long) arg2;
            }
            if (this.field1764 != -1L && (this.field1761 < this.field1764 || this.field1761 > this.field1764 + (long) this.field1767)) {
                this.method2116();
            }
            if (this.field1764 != -1L && this.field1761 + (long) arg2 > this.field1764 + (long) this.field1765.length) {
                int var4 = (int) ((long) this.field1765.length - (this.field1761 - this.field1764));
                System.arraycopy(arg0, arg1, this.field1765, (int) (this.field1761 - this.field1764), var4);
                this.field1761 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1767 = this.field1765.length;
                this.method2116();
            }
            if (arg2 > this.field1765.length) {
                if (this.field1771 != this.field1761) {
                    this.field1769.method2150(this.field1761);
                    this.field1771 = this.field1761;
                }
                this.field1769.method2139(arg0, arg1, arg2);
                this.field1771 += (long) arg2;
                if (this.field1771 > this.field1768) {
                    this.field1768 = this.field1771;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1761 >= this.field1766 && this.field1761 < this.field1766 + (long) this.field1763) {
                    var5 = this.field1761;
                } else if (this.field1766 >= this.field1761 && this.field1766 < this.field1761 + (long) arg2) {
                    var5 = this.field1766;
                }
                if (this.field1761 + (long) arg2 > this.field1766 && this.field1761 + (long) arg2 <= this.field1766 + (long) this.field1763) {
                    var7 = this.field1761 + (long) arg2;
                } else if (this.field1766 + (long) this.field1763 > this.field1761 && this.field1766 + (long) this.field1763 <= this.field1761 + (long) arg2) {
                    var7 = this.field1766 + (long) this.field1763;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1761), this.field1762, (int) (var5 - this.field1766), var9);
                }
                this.field1761 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1764 == -1L) {
                    this.field1764 = this.field1761;
                }
                System.arraycopy(arg0, arg1, this.field1765, (int) (this.field1761 - this.field1764), arg2);
                this.field1761 += (long) arg2;
                if (this.field1761 - this.field1764 > (long) this.field1767) {
                    this.field1767 = (int) (this.field1761 - this.field1764);
                }
            }
        } catch (IOException var11) {
            this.field1771 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("dh.y(I)V")
    public void method2116() throws IOException {
        if (this.field1764 == -1L) {
            return;
        }
        if (this.field1771 != this.field1764) {
            this.field1769.method2150(this.field1764);
            this.field1771 = this.field1764;
        }
        this.field1769.method2139(this.field1765, 0, this.field1767);
        this.field1771 += (long) (this.field1767 * 1085860633) * -346472151L;
        if (this.field1771 > this.field1768) {
            this.field1768 = this.field1771;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1764 >= this.field1766 && this.field1764 < this.field1766 + (long) this.field1763) {
            var1 = this.field1764;
        } else if (this.field1766 >= this.field1764 && this.field1766 < this.field1764 + (long) this.field1767) {
            var1 = this.field1766;
        }
        if (this.field1764 + (long) this.field1767 > this.field1766 && this.field1764 + (long) this.field1767 <= this.field1766 + (long) this.field1763) {
            var3 = this.field1764 + (long) this.field1767;
        } else if (this.field1766 + (long) this.field1763 > this.field1764 && this.field1766 + (long) this.field1763 <= this.field1764 + (long) this.field1767) {
            var3 = this.field1766 + (long) this.field1763;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1765, (int) (var1 - this.field1764), this.field1762, (int) (var1 - this.field1766), var5);
        }
        this.field1764 = -1L;
        this.field1767 = 0;
    }
}
