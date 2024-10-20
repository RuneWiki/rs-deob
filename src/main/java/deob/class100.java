package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("cy")
public class class100 {

    @ObfuscatedName("cy.s")
    public class101 field1471;

    @ObfuscatedName("cy.g")
    public byte[] field1460;

    @ObfuscatedName("cy.m")
    public long field1468 = -1L;

    @ObfuscatedName("cy.h")
    public int field1462;

    @ObfuscatedName("cy.i")
    public byte[] field1469;

    @ObfuscatedName("cy.w")
    public long field1464 = -1L;

    @ObfuscatedName("cy.t")
    public int field1461 = 0;

    @ObfuscatedName("cy.d")
    public long field1466;

    @ObfuscatedName("cy.z")
    public long field1467;

    @ObfuscatedName("cy.k")
    public long field1459;

    @ObfuscatedName("cy.c")
    public long field1465;

    public class100(class101 arg0, int arg1, int arg2) throws IOException {
        this.field1471 = arg0;
        this.field1459 = this.field1467 = arg0.method1959();
        this.field1460 = new byte[arg1];
        this.field1469 = new byte[arg2];
        this.field1466 = 0L;
    }

    @ObfuscatedName("cy.s(B)V")
    public void method1934() throws IOException {
        this.method1933();
        this.field1471.method1958();
    }

    @ObfuscatedName("cy.g(J)V")
    public void method1935(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1466 = arg0;
    }

    @ObfuscatedName("cy.m(I)J")
    public long method1936() {
        return this.field1459;
    }

    @ObfuscatedName("cy.h([BI)V")
    public void method1945(byte[] arg0) throws IOException {
        this.method1941(arg0, 0, arg0.length);
    }

    @ObfuscatedName("cy.i([BIII)V")
    public void method1941(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1464 != -1L && this.field1466 >= this.field1464 && this.field1466 + (long) arg2 <= this.field1464 + (long) this.field1461) {
                System.arraycopy(this.field1469, (int) (this.field1466 - this.field1464), arg0, arg1, arg2);
                this.field1466 += (long) arg2;
                return;
            }
            long var4 = this.field1466;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1466 >= this.field1468 && this.field1466 < this.field1468 + (long) this.field1462) {
                int var8 = (int) ((long) this.field1462 - (this.field1466 - this.field1468));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1460, (int) (this.field1466 - this.field1468), arg0, arg1, var8);
                this.field1466 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1460.length) {
                this.field1471.method1956(this.field1466);
                this.field1465 = this.field1466;
                while (arg2 > 0) {
                    int var9 = this.field1471.method1966(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1465 += (long) var9;
                    this.field1466 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method1939();
                int var10 = arg2;
                if (arg2 > this.field1462) {
                    var10 = this.field1462;
                }
                System.arraycopy(this.field1460, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1466 += (long) var10;
            }
            if (this.field1464 != -1L) {
                if (this.field1464 > this.field1466 && arg2 > 0) {
                    int var11 = (int) (this.field1464 - this.field1466) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1466++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1464 >= var4 && this.field1464 < (long) var7 + var4) {
                    var12 = this.field1464;
                } else if (var4 >= this.field1464 && var4 < this.field1464 + (long) this.field1461) {
                    var12 = var4;
                }
                if (this.field1464 + (long) this.field1461 > var4 && this.field1464 + (long) this.field1461 <= (long) var7 + var4) {
                    var14 = this.field1464 + (long) this.field1461;
                } else if ((long) var7 + var4 > this.field1464 && (long) var7 + var4 <= this.field1464 + (long) this.field1461) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1469, (int) (var12 - this.field1464), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1466) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1466));
                        this.field1466 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1465 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("cy.w(I)V")
    public void method1939() throws IOException {
        this.field1462 = 0;
        if (this.field1466 != this.field1465) {
            this.field1471.method1956(this.field1466);
            this.field1465 = this.field1466;
        }
        this.field1468 = this.field1466;
        while (this.field1462 < this.field1460.length) {
            int var1 = this.field1471.method1966(this.field1460, this.field1462, this.field1460.length - this.field1462);
            if (var1 == -1) {
                break;
            }
            this.field1465 += (long) var1;
            this.field1462 += var1;
        }
    }

    @ObfuscatedName("cy.t([BIII)V")
    public void method1940(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1466 + (long) arg2 > this.field1459) {
                this.field1459 = this.field1466 + (long) arg2;
            }
            if (this.field1464 != -1L && (this.field1466 < this.field1464 || this.field1466 > this.field1464 + (long) this.field1461)) {
                this.method1933();
            }
            if (this.field1464 != -1L && this.field1466 + (long) arg2 > this.field1464 + (long) this.field1469.length) {
                int var4 = (int) ((long) this.field1469.length - (this.field1466 - this.field1464));
                System.arraycopy(arg0, arg1, this.field1469, (int) (this.field1466 - this.field1464), var4);
                this.field1466 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1461 = this.field1469.length;
                this.method1933();
            }
            if (arg2 > this.field1469.length) {
                if (this.field1466 != this.field1465) {
                    this.field1471.method1956(this.field1466);
                    this.field1465 = this.field1466;
                }
                this.field1471.method1957(arg0, arg1, arg2);
                this.field1465 += (long) arg2;
                if (this.field1465 > this.field1467) {
                    this.field1467 = this.field1465;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1466 >= this.field1468 && this.field1466 < this.field1468 + (long) this.field1462) {
                    var5 = this.field1466;
                } else if (this.field1468 >= this.field1466 && this.field1468 < this.field1466 + (long) arg2) {
                    var5 = this.field1468;
                }
                if (this.field1466 + (long) arg2 > this.field1468 && this.field1466 + (long) arg2 <= this.field1468 + (long) this.field1462) {
                    var7 = this.field1466 + (long) arg2;
                } else if (this.field1468 + (long) this.field1462 > this.field1466 && this.field1468 + (long) this.field1462 <= this.field1466 + (long) arg2) {
                    var7 = this.field1468 + (long) this.field1462;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1466), this.field1460, (int) (var5 - this.field1468), var9);
                }
                this.field1466 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1464 == -1L) {
                    this.field1464 = this.field1466;
                }
                System.arraycopy(arg0, arg1, this.field1469, (int) (this.field1466 - this.field1464), arg2);
                this.field1466 += (long) arg2;
                if (this.field1466 - this.field1464 > (long) this.field1461) {
                    this.field1461 = (int) (this.field1466 - this.field1464);
                }
            }
        } catch (IOException var11) {
            this.field1465 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("cy.d(I)V")
    public void method1933() throws IOException {
        if (this.field1464 == -1L) {
            return;
        }
        if (this.field1465 != this.field1464) {
            this.field1471.method1956(this.field1464);
            this.field1465 = this.field1464;
        }
        this.field1471.method1957(this.field1469, 0, this.field1461);
        this.field1465 += (long) (this.field1461 * -2129495307) * -229056163L;
        if (this.field1465 > this.field1467) {
            this.field1467 = this.field1465;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1464 >= this.field1468 && this.field1464 < this.field1468 + (long) this.field1462) {
            var1 = this.field1464;
        } else if (this.field1468 >= this.field1464 && this.field1468 < this.field1464 + (long) this.field1461) {
            var1 = this.field1468;
        }
        if (this.field1464 + (long) this.field1461 > this.field1468 && this.field1464 + (long) this.field1461 <= this.field1468 + (long) this.field1462) {
            var3 = this.field1464 + (long) this.field1461;
        } else if (this.field1468 + (long) this.field1462 > this.field1464 && this.field1468 + (long) this.field1462 <= this.field1464 + (long) this.field1461) {
            var3 = this.field1468 + (long) this.field1462;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1469, (int) (var1 - this.field1464), this.field1460, (int) (var1 - this.field1468), var5);
        }
        this.field1464 = -1L;
        this.field1461 = 0;
    }
}
