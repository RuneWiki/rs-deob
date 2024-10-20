package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("de")
public class class122 {

    @ObfuscatedName("de.d")
    public class123 field1681;

    @ObfuscatedName("de.z")
    public byte[] field1675;

    @ObfuscatedName("de.n")
    public long field1676 = -1L;

    @ObfuscatedName("de.r")
    public int field1677;

    @ObfuscatedName("de.e")
    public byte[] field1678;

    @ObfuscatedName("de.y")
    public long field1679 = -1L;

    @ObfuscatedName("de.k")
    public int field1680 = 0;

    @ObfuscatedName("de.s")
    public long field1684;

    @ObfuscatedName("de.p")
    public long field1683;

    @ObfuscatedName("de.x")
    public long field1682;

    @ObfuscatedName("de.m")
    public long field1674;

    public class122(class123 arg0, int arg1, int arg2) throws IOException {
        this.field1681 = arg0;
        this.field1682 = this.field1683 = arg0.method2364();
        this.field1675 = new byte[arg1];
        this.field1678 = new byte[arg2];
        this.field1684 = 0L;
    }

    @ObfuscatedName("de.d(I)V")
    public void method2343() throws IOException {
        this.method2349();
        this.field1681.method2367();
    }

    @ObfuscatedName("de.z(J)V")
    public void method2344(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1684 = arg0;
    }

    @ObfuscatedName("de.n(I)J")
    public long method2352() {
        return this.field1682;
    }

    @ObfuscatedName("de.r([BI)V")
    public void method2347(byte[] arg0) throws IOException {
        this.method2346(arg0, 0, arg0.length);
    }

    @ObfuscatedName("de.e([BIIB)V")
    public void method2346(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1679 != -1L && this.field1684 >= this.field1679 && this.field1684 + (long) arg2 <= this.field1679 + (long) this.field1680) {
                System.arraycopy(this.field1678, (int) (this.field1684 - this.field1679), arg0, arg1, arg2);
                this.field1684 += (long) arg2;
                return;
            }
            long var4 = this.field1684;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1684 >= this.field1676 && this.field1684 < this.field1676 + (long) this.field1677) {
                int var8 = (int) ((long) this.field1677 - (this.field1684 - this.field1676));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1675, (int) (this.field1684 - this.field1676), arg0, arg1, var8);
                this.field1684 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1675.length) {
                this.field1681.method2365(this.field1684);
                this.field1674 = this.field1684;
                while (arg2 > 0) {
                    int var9 = this.field1681.method2374(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1674 += (long) var9;
                    this.field1684 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2360();
                int var10 = arg2;
                if (arg2 > this.field1677) {
                    var10 = this.field1677;
                }
                System.arraycopy(this.field1675, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1684 += (long) var10;
            }
            if (this.field1679 != -1L) {
                if (this.field1679 > this.field1684 && arg2 > 0) {
                    int var11 = (int) (this.field1679 - this.field1684) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1684++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1679 >= var4 && this.field1679 < (long) var7 + var4) {
                    var12 = this.field1679;
                } else if (var4 >= this.field1679 && var4 < this.field1679 + (long) this.field1680) {
                    var12 = var4;
                }
                if (this.field1679 + (long) this.field1680 > var4 && this.field1679 + (long) this.field1680 <= (long) var7 + var4) {
                    var14 = this.field1679 + (long) this.field1680;
                } else if ((long) var7 + var4 > this.field1679 && (long) var7 + var4 <= this.field1679 + (long) this.field1680) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1678, (int) (var12 - this.field1679), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1684) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1684));
                        this.field1684 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1674 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("de.y(I)V")
    public void method2360() throws IOException {
        this.field1677 = 0;
        if (this.field1684 != this.field1674) {
            this.field1681.method2365(this.field1684);
            this.field1674 = this.field1684;
        }
        this.field1676 = this.field1684;
        while (this.field1677 < this.field1675.length) {
            int var1 = this.field1681.method2374(this.field1675, this.field1677, this.field1675.length - this.field1677);
            if (var1 == -1) {
                break;
            }
            this.field1674 += (long) var1;
            this.field1677 += var1;
        }
    }

    @ObfuscatedName("de.k([BIIB)V")
    public void method2357(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1684 + (long) arg2 > this.field1682) {
                this.field1682 = this.field1684 + (long) arg2;
            }
            if (this.field1679 != -1L && (this.field1684 < this.field1679 || this.field1684 > this.field1679 + (long) this.field1680)) {
                this.method2349();
            }
            if (this.field1679 != -1L && this.field1684 + (long) arg2 > this.field1679 + (long) this.field1678.length) {
                int var4 = (int) ((long) this.field1678.length - (this.field1684 - this.field1679));
                System.arraycopy(arg0, arg1, this.field1678, (int) (this.field1684 - this.field1679), var4);
                this.field1684 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1680 = this.field1678.length;
                this.method2349();
            }
            if (arg2 > this.field1678.length) {
                if (this.field1684 != this.field1674) {
                    this.field1681.method2365(this.field1684);
                    this.field1674 = this.field1684;
                }
                this.field1681.method2384(arg0, arg1, arg2);
                this.field1674 += (long) arg2;
                if (this.field1674 > this.field1683) {
                    this.field1683 = this.field1674;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1684 >= this.field1676 && this.field1684 < this.field1676 + (long) this.field1677) {
                    var5 = this.field1684;
                } else if (this.field1676 >= this.field1684 && this.field1676 < this.field1684 + (long) arg2) {
                    var5 = this.field1676;
                }
                if (this.field1684 + (long) arg2 > this.field1676 && this.field1684 + (long) arg2 <= this.field1676 + (long) this.field1677) {
                    var7 = this.field1684 + (long) arg2;
                } else if (this.field1676 + (long) this.field1677 > this.field1684 && this.field1676 + (long) this.field1677 <= this.field1684 + (long) arg2) {
                    var7 = this.field1676 + (long) this.field1677;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1684), this.field1675, (int) (var5 - this.field1676), var9);
                }
                this.field1684 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1679 == -1L) {
                    this.field1679 = this.field1684;
                }
                System.arraycopy(arg0, arg1, this.field1678, (int) (this.field1684 - this.field1679), arg2);
                this.field1684 += (long) arg2;
                if (this.field1684 - this.field1679 > (long) this.field1680) {
                    this.field1680 = (int) (this.field1684 - this.field1679);
                }
            }
        } catch (IOException var11) {
            this.field1674 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("de.s(I)V")
    public void method2349() throws IOException {
        if (this.field1679 == -1L) {
            return;
        }
        if (this.field1679 != this.field1674) {
            this.field1681.method2365(this.field1679);
            this.field1674 = this.field1679;
        }
        this.field1681.method2384(this.field1678, 0, this.field1680);
        this.field1674 += (long) (this.field1680 * -423918451) * 927981125L;
        if (this.field1674 > this.field1683) {
            this.field1683 = this.field1674;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1679 >= this.field1676 && this.field1679 < this.field1676 + (long) this.field1677) {
            var1 = this.field1679;
        } else if (this.field1676 >= this.field1679 && this.field1676 < this.field1679 + (long) this.field1680) {
            var1 = this.field1676;
        }
        if (this.field1679 + (long) this.field1680 > this.field1676 && this.field1679 + (long) this.field1680 <= this.field1676 + (long) this.field1677) {
            var3 = this.field1679 + (long) this.field1680;
        } else if (this.field1676 + (long) this.field1677 > this.field1679 && this.field1676 + (long) this.field1677 <= this.field1679 + (long) this.field1680) {
            var3 = this.field1676 + (long) this.field1677;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1678, (int) (var1 - this.field1679), this.field1675, (int) (var1 - this.field1676), var5);
        }
        this.field1679 = -1L;
        this.field1680 = 0;
    }
}
