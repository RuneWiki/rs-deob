package deob;

@ObfuscatedName("dk")
public class class118 extends class120 {

    @ObfuscatedName("dk.i")
    public int field1707;

    @ObfuscatedName("dk.c")
    public int field1708;

    @ObfuscatedName("dk.e")
    public int field1709;

    @ObfuscatedName("dk.v")
    public int field1706;

    @ObfuscatedName("dk.b")
    public int field1710;

    @ObfuscatedName("dk.y")
    public int field1711;

    @ObfuscatedName("dk.h")
    public int field1714;

    @ObfuscatedName("dk.x")
    public int field1713;

    @ObfuscatedName("dk.f")
    public int field1715;

    @ObfuscatedName("dk.n")
    public int field1719;

    @ObfuscatedName("dk.a")
    public boolean field1716;

    @ObfuscatedName("dk.o")
    public int field1717;

    @ObfuscatedName("dk.z")
    public int field1718;

    @ObfuscatedName("dk.q")
    public int field1712;

    @ObfuscatedName("dk.j")
    public int field1720;

    @ObfuscatedName("dk.i(II)I")
    public static int method1953(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dk.c(II)I")
    public static int method1936(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dk.be()I")
    public int method2003() {
        int var1 = this.field1710 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1713 == 0) {
            var2 -= this.field1707 * var2 / (((class108) this.field1735).field1621.length << 8);
        } else if (this.field1713 >= 0) {
            var2 -= this.field1715 * var2 / ((class108) this.field1735).field1621.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class118(class108 arg0, int arg1, int arg2) {
        this.field1735 = arg0;
        this.field1715 = arg0.field1622;
        this.field1719 = arg0.field1624;
        this.field1716 = arg0.field1625;
        this.field1708 = arg1;
        this.field1709 = arg2;
        this.field1706 = 8192;
        this.field1707 = 0;
        this.method1940();
    }

    public class118(class108 arg0, int arg1, int arg2, int arg3) {
        this.field1735 = arg0;
        this.field1715 = arg0.field1622;
        this.field1719 = arg0.field1624;
        this.field1716 = arg0.field1625;
        this.field1708 = arg1;
        this.field1709 = arg2;
        this.field1706 = arg3;
        this.field1707 = 0;
        this.method1940();
    }

    @ObfuscatedName("dk.e(Ldi;II)Ldk;")
    public static class118 method1938(class108 arg0, int arg1, int arg2) {
        return arg0.field1621 == null || arg0.field1621.length == 0 ? null : new class118(arg0, (int) ((long) arg0.field1623 * 256L * (long) arg1 / (long) (Statics.field1641 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dk.v(Ldi;III)Ldk;")
    public static class118 method1939(class108 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1621 == null || arg0.field1621.length == 0 ? null : new class118(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dk.b()V")
    public void method1940() {
        this.field1710 = this.field1709;
        this.field1711 = method1953(this.field1709, this.field1706);
        this.field1714 = method1936(this.field1709, this.field1706);
    }

    @ObfuscatedName("dk.n(I)V")
    public synchronized void method2034(int arg0) {
        this.field1713 = arg0;
    }

    @ObfuscatedName("dk.o(I)V")
    public synchronized void method1942(int arg0) {
        this.method2022(arg0 << 6, this.method1946());
    }

    @ObfuscatedName("dk.z(I)V")
    public synchronized void method1943(int arg0) {
        this.method2022(arg0, this.method1946());
    }

    @ObfuscatedName("dk.q(II)V")
    public synchronized void method2022(int arg0, int arg1) {
        this.field1709 = arg0;
        this.field1706 = arg1;
        this.field1717 = 0;
        this.method1940();
    }

    @ObfuscatedName("dk.j()I")
    public synchronized int method2040() {
        return this.field1709 == Integer.MIN_VALUE ? 0 : this.field1709;
    }

    @ObfuscatedName("dk.l()I")
    public synchronized int method1946() {
        return this.field1706 < 0 ? -1 : this.field1706;
    }

    @ObfuscatedName("dk.u(I)V")
    public synchronized void method1947(int arg0) {
        int var2 = ((class108) this.field1735).field1621.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1707 = arg0;
    }

    @ObfuscatedName("dk.t(Z)V")
    public synchronized void method2008(boolean arg0) {
        this.field1708 = (this.field1708 >>> 31) + (this.field1708 ^ this.field1708 >> 31);
        if (arg0) {
            this.field1708 = -this.field1708;
        }
    }

    @ObfuscatedName("dk.ad()V")
    public void method1955() {
        if (this.field1717 == 0) {
            return;
        }
        if (this.field1709 == Integer.MIN_VALUE) {
            this.field1709 = 0;
        }
        this.field1717 = 0;
        this.method1940();
    }

    @ObfuscatedName("dk.ar(II)V")
    public synchronized void method1985(int arg0, int arg1) {
        this.method1950(arg0, arg1, this.method1946());
    }

    @ObfuscatedName("dk.an(III)V")
    public synchronized void method1950(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2022(arg1, arg2);
            return;
        }
        int var4 = method1953(arg1, arg2);
        int var5 = method1936(arg1, arg2);
        if (this.field1711 == var4 && this.field1714 == var5) {
            this.field1717 = 0;
            return;
        }
        int var6 = arg1 - this.field1710;
        if (this.field1710 - arg1 > var6) {
            var6 = this.field1710 - arg1;
        }
        if (var4 - this.field1711 > var6) {
            var6 = var4 - this.field1711;
        }
        if (this.field1711 - var4 > var6) {
            var6 = this.field1711 - var4;
        }
        if (var5 - this.field1714 > var6) {
            var6 = var5 - this.field1714;
        }
        if (this.field1714 - var5 > var6) {
            var6 = this.field1714 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1717 = arg0;
        this.field1709 = arg1;
        this.field1706 = arg2;
        this.field1718 = (arg1 - this.field1710) / arg0;
        this.field1712 = (var4 - this.field1711) / arg0;
        this.field1720 = (var5 - this.field1714) / arg0;
    }

    @ObfuscatedName("dk.ac(I)V")
    public synchronized void method2046(int arg0) {
        if (arg0 == 0) {
            this.method1943(0);
            this.method3278();
        } else if (this.field1711 == 0 && this.field1714 == 0) {
            this.field1717 = 0;
            this.field1709 = 0;
            this.field1710 = 0;
            this.method3278();
        } else {
            int var2 = -this.field1710;
            if (this.field1710 > var2) {
                var2 = this.field1710;
            }
            if (-this.field1711 > var2) {
                var2 = -this.field1711;
            }
            if (this.field1711 > var2) {
                var2 = this.field1711;
            }
            if (-this.field1714 > var2) {
                var2 = -this.field1714;
            }
            if (this.field1714 > var2) {
                var2 = this.field1714;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1717 = arg0;
            this.field1709 = Integer.MIN_VALUE;
            this.field1718 = -this.field1710 / arg0;
            this.field1712 = -this.field1711 / arg0;
            this.field1720 = -this.field1714 / arg0;
        }
    }

    @ObfuscatedName("dk.ak(I)V")
    public synchronized void method1952(int arg0) {
        if (this.field1708 < 0) {
            this.field1708 = -arg0;
        } else {
            this.field1708 = arg0;
        }
    }

    @ObfuscatedName("dk.ao()I")
    public synchronized int method2064() {
        return this.field1708 < 0 ? -this.field1708 : this.field1708;
    }

    @ObfuscatedName("dk.am()Z")
    public boolean method2049() {
        return this.field1707 < 0 || this.field1707 >= ((class108) this.field1735).field1621.length << 8;
    }

    @ObfuscatedName("dk.bs()Z")
    public boolean method1990() {
        return this.field1717 != 0;
    }

    @ObfuscatedName("dk.y()Ldy;")
    public class120 method1731() {
        return null;
    }

    @ObfuscatedName("dk.h()Ldy;")
    public class120 method1733() {
        return null;
    }

    @ObfuscatedName("dk.x()I")
    public int method1730() {
        return this.field1709 == 0 && this.field1717 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dk.f([III)V")
    public synchronized void method1734(int[] arg0, int arg1, int arg2) {
        if (this.field1709 == 0 && this.field1717 == 0) {
            this.method1725(arg2);
            return;
        }
        class108 var4 = (class108) this.field1735;
        int var5 = this.field1715 << 8;
        int var6 = this.field1719 << 8;
        int var7 = var4.field1621.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1713 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1707 < 0) {
            if (this.field1708 <= 0) {
                this.method1955();
                this.method3278();
                return;
            }
            this.field1707 = 0;
        }
        if (this.field1707 >= var7) {
            if (this.field1708 >= 0) {
                this.method1955();
                this.method3278();
                return;
            }
            this.field1707 = var7 - 1;
        }
        if (this.field1713 >= 0) {
            if (this.field1713 > 0) {
                if (this.field1716) {
                    label131: {
                        if (this.field1708 < 0) {
                            var9 = this.method1976(arg0, arg1, var5, var10, var4.field1621[this.field1715]);
                            if (this.field1707 >= var5) {
                                return;
                            }
                            this.field1707 = var5 + var5 - 1 - this.field1707;
                            this.field1708 = -this.field1708;
                            if (--this.field1713 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2031(arg0, var9, var6, var10, var4.field1621[this.field1719 - 1]);
                            if (this.field1707 < var6) {
                                return;
                            }
                            this.field1707 = var6 + var6 - 1 - this.field1707;
                            this.field1708 = -this.field1708;
                            if (--this.field1713 == 0) {
                                break;
                            }
                            var9 = this.method1976(arg0, var9, var5, var10, var4.field1621[this.field1715]);
                            if (this.field1707 >= var5) {
                                return;
                            }
                            this.field1707 = var5 + var5 - 1 - this.field1707;
                            this.field1708 = -this.field1708;
                        } while (--this.field1713 != 0);
                    }
                } else if (this.field1708 < 0) {
                    while (true) {
                        var9 = this.method1976(arg0, var9, var5, var10, var4.field1621[this.field1719 - 1]);
                        if (this.field1707 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1707) / var8;
                        if (var12 >= this.field1713) {
                            this.field1707 += this.field1713 * var8;
                            this.field1713 = 0;
                            break;
                        }
                        this.field1707 += var8 * var12;
                        this.field1713 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2031(arg0, var9, var6, var10, var4.field1621[this.field1715]);
                        if (this.field1707 < var6) {
                            return;
                        }
                        int var13 = (this.field1707 - var5) / var8;
                        if (var13 >= this.field1713) {
                            this.field1707 -= this.field1713 * var8;
                            this.field1713 = 0;
                            break;
                        }
                        this.field1707 -= var8 * var13;
                        this.field1713 -= var13;
                    }
                }
            }
            if (this.field1708 < 0) {
                this.method1976(arg0, var9, 0, var10, 0);
                if (this.field1707 < 0) {
                    this.field1707 = -1;
                    this.method1955();
                    this.method3278();
                }
            } else {
                this.method2031(arg0, var9, var7, var10, 0);
                if (this.field1707 >= var7) {
                    this.field1707 = var7;
                    this.method1955();
                    this.method3278();
                }
            }
        } else if (this.field1716) {
            if (this.field1708 < 0) {
                var9 = this.method1976(arg0, arg1, var5, var10, var4.field1621[this.field1715]);
                if (this.field1707 >= var5) {
                    return;
                }
                this.field1707 = var5 + var5 - 1 - this.field1707;
                this.field1708 = -this.field1708;
            }
            while (true) {
                int var11 = this.method2031(arg0, var9, var6, var10, var4.field1621[this.field1719 - 1]);
                if (this.field1707 < var6) {
                    return;
                }
                this.field1707 = var6 + var6 - 1 - this.field1707;
                this.field1708 = -this.field1708;
                var9 = this.method1976(arg0, var11, var5, var10, var4.field1621[this.field1715]);
                if (this.field1707 >= var5) {
                    return;
                }
                this.field1707 = var5 + var5 - 1 - this.field1707;
                this.field1708 = -this.field1708;
            }
        } else if (this.field1708 < 0) {
            while (true) {
                var9 = this.method1976(arg0, var9, var5, var10, var4.field1621[this.field1719 - 1]);
                if (this.field1707 >= var5) {
                    return;
                }
                this.field1707 = var6 - 1 - (var6 - 1 - this.field1707) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2031(arg0, var9, var6, var10, var4.field1621[this.field1715]);
                if (this.field1707 < var6) {
                    return;
                }
                this.field1707 = (this.field1707 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dk.a(I)V")
    public synchronized void method1725(int arg0) {
        if (this.field1717 > 0) {
            if (arg0 >= this.field1717) {
                if (this.field1709 == Integer.MIN_VALUE) {
                    this.field1709 = 0;
                    this.field1714 = 0;
                    this.field1711 = 0;
                    this.field1710 = 0;
                    this.method3278();
                    arg0 = this.field1717;
                }
                this.field1717 = 0;
                this.method1940();
            } else {
                this.field1710 += this.field1718 * arg0;
                this.field1711 += this.field1712 * arg0;
                this.field1714 += this.field1720 * arg0;
                this.field1717 -= arg0;
            }
        }
        class108 var2 = (class108) this.field1735;
        int var3 = this.field1715 << 8;
        int var4 = this.field1719 << 8;
        int var5 = var2.field1621.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1713 = 0;
        }
        if (this.field1707 < 0) {
            if (this.field1708 <= 0) {
                this.method1955();
                this.method3278();
                return;
            }
            this.field1707 = 0;
        }
        if (this.field1707 >= var5) {
            if (this.field1708 >= 0) {
                this.method1955();
                this.method3278();
                return;
            }
            this.field1707 = var5 - 1;
        }
        this.field1707 += this.field1708 * arg0;
        if (this.field1713 >= 0) {
            if (this.field1713 > 0) {
                if (this.field1716) {
                    label121: {
                        if (this.field1708 < 0) {
                            if (this.field1707 >= var3) {
                                return;
                            }
                            this.field1707 = var3 + var3 - 1 - this.field1707;
                            this.field1708 = -this.field1708;
                            if (--this.field1713 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1707 < var4) {
                                return;
                            }
                            this.field1707 = var4 + var4 - 1 - this.field1707;
                            this.field1708 = -this.field1708;
                            if (--this.field1713 == 0) {
                                break;
                            }
                            if (this.field1707 >= var3) {
                                return;
                            }
                            this.field1707 = var3 + var3 - 1 - this.field1707;
                            this.field1708 = -this.field1708;
                        } while (--this.field1713 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1708 < 0) {
                            if (this.field1707 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1707) / var6;
                            if (var7 >= this.field1713) {
                                this.field1707 += this.field1713 * var6;
                                this.field1713 = 0;
                                break label153;
                            }
                            this.field1707 += var6 * var7;
                            this.field1713 -= var7;
                        } else if (this.field1707 >= var4) {
                            int var8 = (this.field1707 - var3) / var6;
                            if (var8 >= this.field1713) {
                                this.field1707 -= this.field1713 * var6;
                                this.field1713 = 0;
                                break label153;
                            }
                            this.field1707 -= var6 * var8;
                            this.field1713 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1708 < 0) {
                if (this.field1707 < 0) {
                    this.field1707 = -1;
                    this.method1955();
                    this.method3278();
                }
            } else if (this.field1707 >= var5) {
                this.field1707 = var5;
                this.method1955();
                this.method3278();
            }
        } else if (this.field1716) {
            if (this.field1708 < 0) {
                if (this.field1707 >= var3) {
                    return;
                }
                this.field1707 = var3 + var3 - 1 - this.field1707;
                this.field1708 = -this.field1708;
            }
            while (this.field1707 >= var4) {
                this.field1707 = var4 + var4 - 1 - this.field1707;
                this.field1708 = -this.field1708;
                if (this.field1707 >= var3) {
                    return;
                }
                this.field1707 = var3 + var3 - 1 - this.field1707;
                this.field1708 = -this.field1708;
            }
        } else if (this.field1708 < 0) {
            if (this.field1707 >= var3) {
                return;
            }
            this.field1707 = var4 - 1 - (var4 - 1 - this.field1707) % var6;
        } else if (this.field1707 >= var4) {
            this.field1707 = (this.field1707 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dk.bu([IIIII)I")
    public int method2031(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1717 > 0) {
                int var6 = this.field1717 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1717 += arg1;
                if (this.field1708 == 256 && (this.field1707 & 0xFF) == 0) {
                    if (Statics.field3733) {
                        arg1 = method1970(0, ((class108) this.field1735).field1621, arg0, this.field1707, arg1, this.field1711, this.field1714, this.field1712, this.field1720, 0, var6, arg2, this);
                    } else {
                        arg1 = method1945(((class108) this.field1735).field1621, arg0, this.field1707, arg1, this.field1710, this.field1718, 0, var6, arg2, this);
                    }
                } else if (Statics.field3733) {
                    arg1 = method1979(0, 0, ((class108) this.field1735).field1621, arg0, this.field1707, arg1, this.field1711, this.field1714, this.field1712, this.field1720, 0, var6, arg2, this, this.field1708, arg4);
                } else {
                    arg1 = method1973(0, 0, ((class108) this.field1735).field1621, arg0, this.field1707, arg1, this.field1710, this.field1718, 0, var6, arg2, this, this.field1708, arg4);
                }
                this.field1717 -= arg1;
                if (this.field1717 != 0) {
                    return arg1;
                }
                if (!this.method2063()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1708 == 256 && (this.field1707 & 0xFF) == 0) {
                if (Statics.field3733) {
                    return method1962(0, ((class108) this.field1735).field1621, arg0, this.field1707, arg1, this.field1711, this.field1714, 0, arg3, arg2, this);
                }
                return method2042(((class108) this.field1735).field1621, arg0, this.field1707, arg1, this.field1710, 0, arg3, arg2, this);
            }
            if (Statics.field3733) {
                return method1966(0, 0, ((class108) this.field1735).field1621, arg0, this.field1707, arg1, this.field1711, this.field1714, 0, arg3, arg2, this, this.field1708, arg4);
            }
            return method1965(0, 0, ((class108) this.field1735).field1621, arg0, this.field1707, arg1, this.field1710, 0, arg3, arg2, this, this.field1708, arg4);
        }
    }

    @ObfuscatedName("dk.bo([IIIII)I")
    public int method1976(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1717 > 0) {
                int var6 = this.field1717 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1717 += arg1;
                if (this.field1708 == -256 && (this.field1707 & 0xFF) == 0) {
                    if (Statics.field3733) {
                        arg1 = method1972(0, ((class108) this.field1735).field1621, arg0, this.field1707, arg1, this.field1711, this.field1714, this.field1712, this.field1720, 0, var6, arg2, this);
                    } else {
                        arg1 = method1971(((class108) this.field1735).field1621, arg0, this.field1707, arg1, this.field1710, this.field1718, 0, var6, arg2, this);
                    }
                } else if (Statics.field3733) {
                    arg1 = method1981(0, 0, ((class108) this.field1735).field1621, arg0, this.field1707, arg1, this.field1711, this.field1714, this.field1712, this.field1720, 0, var6, arg2, this, this.field1708, arg4);
                } else {
                    arg1 = method1974(0, 0, ((class108) this.field1735).field1621, arg0, this.field1707, arg1, this.field1710, this.field1718, 0, var6, arg2, this, this.field1708, arg4);
                }
                this.field1717 -= arg1;
                if (this.field1717 != 0) {
                    return arg1;
                }
                if (!this.method2063()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1708 == -256 && (this.field1707 & 0xFF) == 0) {
                if (Statics.field3733) {
                    return method1977(0, ((class108) this.field1735).field1621, arg0, this.field1707, arg1, this.field1711, this.field1714, 0, arg3, arg2, this);
                }
                return method1963(((class108) this.field1735).field1621, arg0, this.field1707, arg1, this.field1710, 0, arg3, arg2, this);
            }
            if (Statics.field3733) {
                return method1949(0, 0, ((class108) this.field1735).field1621, arg0, this.field1707, arg1, this.field1711, this.field1714, 0, arg3, arg2, this, this.field1708, arg4);
            }
            return method1967(0, 0, ((class108) this.field1735).field1621, arg0, this.field1707, arg1, this.field1710, 0, arg3, arg2, this, this.field1708, arg4);
        }
    }

    @ObfuscatedName("dk.bj()Z")
    public boolean method2063() {
        int var1 = this.field1709;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1953(var1, this.field1706);
            var2 = method1936(var1, this.field1706);
        }
        if (this.field1710 != var1 || this.field1711 != var3 || this.field1714 != var2) {
            if (this.field1710 < var1) {
                this.field1718 = 1;
                this.field1717 = var1 - this.field1710;
            } else if (this.field1710 > var1) {
                this.field1718 = -1;
                this.field1717 = this.field1710 - var1;
            } else {
                this.field1718 = 0;
            }
            if (this.field1711 < var3) {
                this.field1712 = 1;
                if (this.field1717 == 0 || this.field1717 > var3 - this.field1711) {
                    this.field1717 = var3 - this.field1711;
                }
            } else if (this.field1711 > var3) {
                this.field1712 = -1;
                if (this.field1717 == 0 || this.field1717 > this.field1711 - var3) {
                    this.field1717 = this.field1711 - var3;
                }
            } else {
                this.field1712 = 0;
            }
            if (this.field1714 < var2) {
                this.field1720 = 1;
                if (this.field1717 == 0 || this.field1717 > var2 - this.field1714) {
                    this.field1717 = var2 - this.field1714;
                }
            } else if (this.field1714 > var2) {
                this.field1720 = -1;
                if (this.field1717 == 0 || this.field1717 > this.field1714 - var2) {
                    this.field1717 = this.field1714 - var2;
                }
            } else {
                this.field1720 = 0;
            }
            return false;
        } else if (this.field1709 == Integer.MIN_VALUE) {
            this.field1709 = 0;
            this.field1714 = 0;
            this.field1711 = 0;
            this.field1710 = 0;
            this.method3278();
            return true;
        } else {
            this.method1940();
            return false;
        }
    }

    @ObfuscatedName("dk.bh([B[IIIIIIILdk;)I")
    public static int method2042(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12;
        if ((var12 = arg3 + var10 - var9) > arg6) {
            var12 = arg6;
        }
        var12 -= 3;
        int var10001;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9++] * var11;
            int var13 = arg3++;
            arg1[var13] += arg0[var9++] * var11;
            int var14 = arg3++;
            arg1[var14] += arg0[var9++] * var11;
            int var15 = arg3++;
            arg1[var15] += arg0[var9++] * var11;
        }
        var12 += 3;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9++] * var11;
        }
        arg8.field1707 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dk.bf(I[B[IIIIIIIILdk;)I")
    public static int method1962(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15;
        if ((var15 = arg4 + var12 - var11) > arg8) {
            var15 = arg8;
        }
        int var16 = arg4 << 1;
        int var17 = var15 << 1;
        int var23 = var17 - 6;
        while (var16 < var23) {
            byte var18 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field1707 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dk.bg([B[IIIIIIILdk;)I")
    public static int method1963(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12;
        if ((var12 = arg3 + var9 - (var10 - 1)) > arg6) {
            var12 = arg6;
        }
        var12 -= 3;
        int var10001;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9--] * var11;
            int var13 = arg3++;
            arg1[var13] += arg0[var9--] * var11;
            int var14 = arg3++;
            arg1[var14] += arg0[var9--] * var11;
            int var15 = arg3++;
            arg1[var15] += arg0[var9--] * var11;
        }
        var12 += 3;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9--] * var11;
        }
        arg8.field1707 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dk.bl(I[B[IIIIIIIILdk;)I")
    public static int method1977(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15;
        if ((var15 = arg4 + var11 - (var12 - 1)) > arg8) {
            var15 = arg8;
        }
        int var16 = arg4 << 1;
        int var17 = var15 << 1;
        int var23 = var17 - 6;
        while (var16 < var23) {
            byte var18 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field1707 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dk.bz(II[B[IIIIIIILdk;II)I")
    public static int method1965(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14 + 1] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 - arg4 + arg11 - 1) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (var17 - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field1707 = arg4;
        return arg5;
    }

    @ObfuscatedName("dk.bq(II[B[IIIIIIIILdk;II)I")
    public static int method1966(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17 + 1] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 0xFF) * (var22 - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        arg11.field1707 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dk.bt(II[B[IIIIIIILdk;II)I")
    public static int method1967(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        int var18 = arg11;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
            arg4 += var18;
        }
        arg10.field1707 = arg4;
        return arg5;
    }

    @ObfuscatedName("dk.bi(II[B[IIIIIIIILdk;II)I")
    public static int method1949(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            int var23 = (var22 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        arg11.field1707 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dk.by([B[IIIIIIIILdk;)I")
    public static int method1945(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class118 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1711 += (var14 - arg3) * arg9.field1712;
        arg9.field1714 += (var14 - arg3) * arg9.field1720;
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10++] * var12;
            int var15 = var12 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var10++] * var15;
            int var16 = var13 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var10++] * var16;
            int var17 = var13 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var10++] * var17;
            var12 = var13 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10++] * var12;
            var12 += var13;
        }
        arg9.field1710 = var12 >> 2;
        arg9.field1707 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dk.bb(I[B[IIIIIIIIIILdk;)I")
    public static int method1970(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class118 arg12) {
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19;
        if ((var19 = arg4 + var14 - var13) > arg10) {
            var19 = arg10;
        }
        arg12.field1710 += (var19 - arg4) * arg12.field1718;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field1711 = var15 >> 2;
        arg12.field1714 = var16 >> 2;
        arg12.field1707 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dk.ba([B[IIIIIIIILdk;)I")
    public static int method1971(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class118 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1711 += (var14 - arg3) * arg9.field1712;
        arg9.field1714 += (var14 - arg3) * arg9.field1720;
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10--] * var12;
            int var15 = var12 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var10--] * var15;
            int var16 = var13 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var10--] * var16;
            int var17 = var13 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var10--] * var17;
            var12 = var13 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10--] * var12;
            var12 += var13;
        }
        arg9.field1710 = var12 >> 2;
        arg9.field1707 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dk.bw(I[B[IIIIIIIIIILdk;)I")
    public static int method1972(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class118 arg12) {
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19;
        if ((var19 = arg4 + var13 - (var14 - 1)) > arg10) {
            var19 = arg10;
        }
        arg12.field1710 += (var19 - arg4) * arg12.field1718;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field1711 = var15 >> 2;
        arg12.field1714 = var16 >> 2;
        arg12.field1707 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dk.bk(II[B[IIIIIIIILdk;II)I")
    public static int method1973(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
        arg11.field1711 -= arg11.field1712 * arg5;
        arg11.field1714 -= arg11.field1720 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15 + 1] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 - arg4 + arg12 - 1) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        while (arg5 < var17) {
            byte var19 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 0xFF) * (var18 - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field1711 += arg11.field1712 * arg5;
        arg11.field1714 += arg11.field1720 * arg5;
        arg11.field1710 = arg6;
        arg11.field1707 = arg4;
        return arg5;
    }

    @ObfuscatedName("dk.br(II[B[IIIIIIIIIILdk;II)I")
    public static int method1979(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class118 arg13, int arg14, int arg15) {
        arg13.field1710 -= arg13.field1718 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19 + 1] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            byte var25 = arg2[arg4 >> 8];
            int var26 = (var25 << 8) + (arg4 & 0xFF) * (var24 - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var27 = var17 >> 1;
        arg13.field1710 += arg13.field1718 * var27;
        arg13.field1711 = arg6;
        arg13.field1714 = arg7;
        arg13.field1707 = arg4;
        return var27;
    }

    @ObfuscatedName("dk.bd(II[B[IIIIIIIILdk;II)I")
    public static int method1974(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
        arg11.field1711 -= arg11.field1712 * arg5;
        arg11.field1714 -= arg11.field1720 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        int var19 = arg12;
        while (arg5 < var17) {
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var18)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var19;
        }
        arg11.field1711 += arg11.field1712 * arg5;
        arg11.field1714 += arg11.field1720 * arg5;
        arg11.field1710 = arg6;
        arg11.field1707 = arg4;
        return arg5;
    }

    @ObfuscatedName("dk.bv(II[B[IIIIIIIIIILdk;II)I")
    public static int method1981(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class118 arg13, int arg14, int arg15) {
        arg13.field1710 -= arg13.field1718 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            int var25 = (var24 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var25 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var26 = var17 >> 1;
        arg13.field1710 += arg13.field1718 * var26;
        arg13.field1711 = arg6;
        arg13.field1714 = arg7;
        arg13.field1707 = arg4;
        return var26;
    }
}
