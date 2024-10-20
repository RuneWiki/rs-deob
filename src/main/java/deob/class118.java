package deob;

@ObfuscatedName("do")
public class class118 extends class120 {

    @ObfuscatedName("do.i")
    public int field1680;

    @ObfuscatedName("do.h")
    public int field1678;

    @ObfuscatedName("do.u")
    public int field1684;

    @ObfuscatedName("do.q")
    public int field1677;

    @ObfuscatedName("do.g")
    public int field1681;

    @ObfuscatedName("do.v")
    public int field1682;

    @ObfuscatedName("do.t")
    public int field1683;

    @ObfuscatedName("do.p")
    public int field1687;

    @ObfuscatedName("do.l")
    public int field1685;

    @ObfuscatedName("do.a")
    public int field1686;

    @ObfuscatedName("do.k")
    public boolean field1689;

    @ObfuscatedName("do.r")
    public int field1688;

    @ObfuscatedName("do.b")
    public int field1679;

    @ObfuscatedName("do.x")
    public int field1690;

    @ObfuscatedName("do.o")
    public int field1691;

    @ObfuscatedName("do.i(II)I")
    public static int method2027(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("do.h(II)I")
    public static int method1974(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("do.ao()I")
    public int method1975() {
        int var1 = this.field1681 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1687 == 0) {
            var2 -= this.field1680 * var2 / (((class108) this.field1706).field1603.length << 8);
        } else if (this.field1687 >= 0) {
            var2 -= this.field1685 * var2 / ((class108) this.field1706).field1603.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class118(class108 arg0, int arg1, int arg2) {
        this.field1706 = arg0;
        this.field1685 = arg0.field1604;
        this.field1686 = arg0.field1605;
        this.field1689 = arg0.field1602;
        this.field1678 = arg1;
        this.field1684 = arg2;
        this.field1677 = 8192;
        this.field1680 = 0;
        this.method1978();
    }

    public class118(class108 arg0, int arg1, int arg2, int arg3) {
        this.field1706 = arg0;
        this.field1685 = arg0.field1604;
        this.field1686 = arg0.field1605;
        this.field1689 = arg0.field1602;
        this.field1678 = arg1;
        this.field1684 = arg2;
        this.field1677 = arg3;
        this.field1680 = 0;
        this.method1978();
    }

    @ObfuscatedName("do.u(Ldx;II)Ldo;")
    public static class118 method2054(class108 arg0, int arg1, int arg2) {
        return arg0.field1603 == null || arg0.field1603.length == 0 ? null : new class118(arg0, (int) ((long) arg0.field1606 * 256L * (long) arg1 / (long) (Statics.field1629 * 100)), arg2 << 6);
    }

    @ObfuscatedName("do.q(Ldx;III)Ldo;")
    public static class118 method2075(class108 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1603 == null || arg0.field1603.length == 0 ? null : new class118(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("do.g()V")
    public void method1978() {
        this.field1681 = this.field1684;
        this.field1682 = method2027(this.field1684, this.field1677);
        this.field1683 = method1974(this.field1684, this.field1677);
    }

    @ObfuscatedName("do.a(I)V")
    public synchronized void method1980(int arg0) {
        this.field1687 = arg0;
    }

    @ObfuscatedName("do.b(I)V")
    public synchronized void method2053(int arg0) {
        this.method2072(arg0 << 6, this.method1983());
    }

    @ObfuscatedName("do.x(I)V")
    public synchronized void method1981(int arg0) {
        this.method2072(arg0, this.method1983());
    }

    @ObfuscatedName("do.o(II)V")
    public synchronized void method2072(int arg0, int arg1) {
        this.field1684 = arg0;
        this.field1677 = arg1;
        this.field1688 = 0;
        this.method1978();
    }

    @ObfuscatedName("do.j()I")
    public synchronized int method2018() {
        return this.field1684 == Integer.MIN_VALUE ? 0 : this.field1684;
    }

    @ObfuscatedName("do.m()I")
    public synchronized int method1983() {
        return this.field1677 < 0 ? -1 : this.field1677;
    }

    @ObfuscatedName("do.s(I)V")
    public synchronized void method2031(int arg0) {
        int var2 = ((class108) this.field1706).field1603.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1680 = arg0;
    }

    @ObfuscatedName("do.n(Z)V")
    public synchronized void method1985(boolean arg0) {
        this.field1678 = (this.field1678 >>> 31) + (this.field1678 ^ this.field1678 >> 31);
        if (arg0) {
            this.field1678 = -this.field1678;
        }
    }

    @ObfuscatedName("do.y()V")
    public void method1986() {
        if (this.field1688 == 0) {
            return;
        }
        if (this.field1684 == Integer.MIN_VALUE) {
            this.field1684 = 0;
        }
        this.field1688 = 0;
        this.method1978();
    }

    @ObfuscatedName("do.w(II)V")
    public synchronized void method1987(int arg0, int arg1) {
        this.method2015(arg0, arg1, this.method1983());
    }

    @ObfuscatedName("do.f(III)V")
    public synchronized void method2015(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2072(arg1, arg2);
            return;
        }
        int var4 = method2027(arg1, arg2);
        int var5 = method1974(arg1, arg2);
        if (this.field1682 == var4 && this.field1683 == var5) {
            this.field1688 = 0;
            return;
        }
        int var6 = arg1 - this.field1681;
        if (this.field1681 - arg1 > var6) {
            var6 = this.field1681 - arg1;
        }
        if (var4 - this.field1682 > var6) {
            var6 = var4 - this.field1682;
        }
        if (this.field1682 - var4 > var6) {
            var6 = this.field1682 - var4;
        }
        if (var5 - this.field1683 > var6) {
            var6 = var5 - this.field1683;
        }
        if (this.field1683 - var5 > var6) {
            var6 = this.field1683 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1688 = arg0;
        this.field1684 = arg1;
        this.field1677 = arg2;
        this.field1679 = (arg1 - this.field1681) / arg0;
        this.field1690 = (var4 - this.field1682) / arg0;
        this.field1691 = (var5 - this.field1683) / arg0;
    }

    @ObfuscatedName("do.c(I)V")
    public synchronized void method1989(int arg0) {
        if (arg0 == 0) {
            this.method1981(0);
            this.method3364();
        } else if (this.field1682 == 0 && this.field1683 == 0) {
            this.field1688 = 0;
            this.field1684 = 0;
            this.field1681 = 0;
            this.method3364();
        } else {
            int var2 = -this.field1681;
            if (this.field1681 > var2) {
                var2 = this.field1681;
            }
            if (-this.field1682 > var2) {
                var2 = -this.field1682;
            }
            if (this.field1682 > var2) {
                var2 = this.field1682;
            }
            if (-this.field1683 > var2) {
                var2 = -this.field1683;
            }
            if (this.field1683 > var2) {
                var2 = this.field1683;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1688 = arg0;
            this.field1684 = Integer.MIN_VALUE;
            this.field1679 = -this.field1681 / arg0;
            this.field1690 = -this.field1682 / arg0;
            this.field1691 = -this.field1683 / arg0;
        }
    }

    @ObfuscatedName("do.z(I)V")
    public synchronized void method1990(int arg0) {
        if (this.field1678 < 0) {
            this.field1678 = -arg0;
        } else {
            this.field1678 = arg0;
        }
    }

    @ObfuscatedName("do.ay()I")
    public synchronized int method1991() {
        return this.field1678 < 0 ? -this.field1678 : this.field1678;
    }

    @ObfuscatedName("do.av()Z")
    public boolean method1992() {
        return this.field1680 < 0 || this.field1680 >= ((class108) this.field1706).field1603.length << 8;
    }

    @ObfuscatedName("do.ai()Z")
    public boolean method1993() {
        return this.field1688 != 0;
    }

    @ObfuscatedName("do.v()Ldw;")
    public class120 method1784() {
        return null;
    }

    @ObfuscatedName("do.t()Ldw;")
    public class120 method1760() {
        return null;
    }

    @ObfuscatedName("do.p()I")
    public int method1761() {
        return this.field1684 == 0 && this.field1688 == 0 ? 0 : 1;
    }

    @ObfuscatedName("do.l([III)V")
    public synchronized void method1762(int[] arg0, int arg1, int arg2) {
        if (this.field1684 == 0 && this.field1688 == 0) {
            this.method1757(arg2);
            return;
        }
        class108 var4 = (class108) this.field1706;
        int var5 = this.field1685 << 8;
        int var6 = this.field1686 << 8;
        int var7 = var4.field1603.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1687 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1680 < 0) {
            if (this.field1678 <= 0) {
                this.method1986();
                this.method3364();
                return;
            }
            this.field1680 = 0;
        }
        if (this.field1680 >= var7) {
            if (this.field1678 >= 0) {
                this.method1986();
                this.method3364();
                return;
            }
            this.field1680 = var7 - 1;
        }
        if (this.field1687 >= 0) {
            if (this.field1687 > 0) {
                if (this.field1689) {
                    label131: {
                        if (this.field1678 < 0) {
                            var9 = this.method1998(arg0, arg1, var5, var10, var4.field1603[this.field1685]);
                            if (this.field1680 >= var5) {
                                return;
                            }
                            this.field1680 = var5 + var5 - 1 - this.field1680;
                            this.field1678 = -this.field1678;
                            if (--this.field1687 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1997(arg0, var9, var6, var10, var4.field1603[this.field1686 - 1]);
                            if (this.field1680 < var6) {
                                return;
                            }
                            this.field1680 = var6 + var6 - 1 - this.field1680;
                            this.field1678 = -this.field1678;
                            if (--this.field1687 == 0) {
                                break;
                            }
                            var9 = this.method1998(arg0, var9, var5, var10, var4.field1603[this.field1685]);
                            if (this.field1680 >= var5) {
                                return;
                            }
                            this.field1680 = var5 + var5 - 1 - this.field1680;
                            this.field1678 = -this.field1678;
                        } while (--this.field1687 != 0);
                    }
                } else if (this.field1678 < 0) {
                    while (true) {
                        var9 = this.method1998(arg0, var9, var5, var10, var4.field1603[this.field1686 - 1]);
                        if (this.field1680 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1680) / var8;
                        if (var12 >= this.field1687) {
                            this.field1680 += this.field1687 * var8;
                            this.field1687 = 0;
                            break;
                        }
                        this.field1680 += var8 * var12;
                        this.field1687 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1997(arg0, var9, var6, var10, var4.field1603[this.field1685]);
                        if (this.field1680 < var6) {
                            return;
                        }
                        int var13 = (this.field1680 - var5) / var8;
                        if (var13 >= this.field1687) {
                            this.field1680 -= this.field1687 * var8;
                            this.field1687 = 0;
                            break;
                        }
                        this.field1680 -= var8 * var13;
                        this.field1687 -= var13;
                    }
                }
            }
            if (this.field1678 < 0) {
                this.method1998(arg0, var9, 0, var10, 0);
                if (this.field1680 < 0) {
                    this.field1680 = -1;
                    this.method1986();
                    this.method3364();
                }
            } else {
                this.method1997(arg0, var9, var7, var10, 0);
                if (this.field1680 >= var7) {
                    this.field1680 = var7;
                    this.method1986();
                    this.method3364();
                }
            }
        } else if (this.field1689) {
            if (this.field1678 < 0) {
                var9 = this.method1998(arg0, arg1, var5, var10, var4.field1603[this.field1685]);
                if (this.field1680 >= var5) {
                    return;
                }
                this.field1680 = var5 + var5 - 1 - this.field1680;
                this.field1678 = -this.field1678;
            }
            while (true) {
                int var11 = this.method1997(arg0, var9, var6, var10, var4.field1603[this.field1686 - 1]);
                if (this.field1680 < var6) {
                    return;
                }
                this.field1680 = var6 + var6 - 1 - this.field1680;
                this.field1678 = -this.field1678;
                var9 = this.method1998(arg0, var11, var5, var10, var4.field1603[this.field1685]);
                if (this.field1680 >= var5) {
                    return;
                }
                this.field1680 = var5 + var5 - 1 - this.field1680;
                this.field1678 = -this.field1678;
            }
        } else if (this.field1678 < 0) {
            while (true) {
                var9 = this.method1998(arg0, var9, var5, var10, var4.field1603[this.field1686 - 1]);
                if (this.field1680 >= var5) {
                    return;
                }
                this.field1680 = var6 - 1 - (var6 - 1 - this.field1680) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1997(arg0, var9, var6, var10, var4.field1603[this.field1685]);
                if (this.field1680 < var6) {
                    return;
                }
                this.field1680 = (this.field1680 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("do.k(I)V")
    public synchronized void method1757(int arg0) {
        if (this.field1688 > 0) {
            if (arg0 >= this.field1688) {
                if (this.field1684 == Integer.MIN_VALUE) {
                    this.field1684 = 0;
                    this.field1683 = 0;
                    this.field1682 = 0;
                    this.field1681 = 0;
                    this.method3364();
                    arg0 = this.field1688;
                }
                this.field1688 = 0;
                this.method1978();
            } else {
                this.field1681 += this.field1679 * arg0;
                this.field1682 += this.field1690 * arg0;
                this.field1683 += this.field1691 * arg0;
                this.field1688 -= arg0;
            }
        }
        class108 var2 = (class108) this.field1706;
        int var3 = this.field1685 << 8;
        int var4 = this.field1686 << 8;
        int var5 = var2.field1603.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1687 = 0;
        }
        if (this.field1680 < 0) {
            if (this.field1678 <= 0) {
                this.method1986();
                this.method3364();
                return;
            }
            this.field1680 = 0;
        }
        if (this.field1680 >= var5) {
            if (this.field1678 >= 0) {
                this.method1986();
                this.method3364();
                return;
            }
            this.field1680 = var5 - 1;
        }
        this.field1680 += this.field1678 * arg0;
        if (this.field1687 >= 0) {
            if (this.field1687 > 0) {
                if (this.field1689) {
                    label121: {
                        if (this.field1678 < 0) {
                            if (this.field1680 >= var3) {
                                return;
                            }
                            this.field1680 = var3 + var3 - 1 - this.field1680;
                            this.field1678 = -this.field1678;
                            if (--this.field1687 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1680 < var4) {
                                return;
                            }
                            this.field1680 = var4 + var4 - 1 - this.field1680;
                            this.field1678 = -this.field1678;
                            if (--this.field1687 == 0) {
                                break;
                            }
                            if (this.field1680 >= var3) {
                                return;
                            }
                            this.field1680 = var3 + var3 - 1 - this.field1680;
                            this.field1678 = -this.field1678;
                        } while (--this.field1687 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1678 < 0) {
                            if (this.field1680 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1680) / var6;
                            if (var7 >= this.field1687) {
                                this.field1680 += this.field1687 * var6;
                                this.field1687 = 0;
                                break label153;
                            }
                            this.field1680 += var6 * var7;
                            this.field1687 -= var7;
                        } else if (this.field1680 >= var4) {
                            int var8 = (this.field1680 - var3) / var6;
                            if (var8 >= this.field1687) {
                                this.field1680 -= this.field1687 * var6;
                                this.field1687 = 0;
                                break label153;
                            }
                            this.field1680 -= var6 * var8;
                            this.field1687 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1678 < 0) {
                if (this.field1680 < 0) {
                    this.field1680 = -1;
                    this.method1986();
                    this.method3364();
                }
            } else if (this.field1680 >= var5) {
                this.field1680 = var5;
                this.method1986();
                this.method3364();
            }
        } else if (this.field1689) {
            if (this.field1678 < 0) {
                if (this.field1680 >= var3) {
                    return;
                }
                this.field1680 = var3 + var3 - 1 - this.field1680;
                this.field1678 = -this.field1678;
            }
            while (this.field1680 >= var4) {
                this.field1680 = var4 + var4 - 1 - this.field1680;
                this.field1678 = -this.field1678;
                if (this.field1680 >= var3) {
                    return;
                }
                this.field1680 = var3 + var3 - 1 - this.field1680;
                this.field1678 = -this.field1678;
            }
        } else if (this.field1678 < 0) {
            if (this.field1680 >= var3) {
                return;
            }
            this.field1680 = var4 - 1 - (var4 - 1 - this.field1680) % var6;
        } else if (this.field1680 >= var4) {
            this.field1680 = (this.field1680 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("do.am([IIIII)I")
    public int method1997(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1688 > 0) {
                int var6 = this.field1688 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1688 += arg1;
                if (this.field1678 == 256 && (this.field1680 & 0xFF) == 0) {
                    if (Statics.field2316) {
                        arg1 = method2007(0, ((class108) this.field1706).field1603, arg0, this.field1680, arg1, this.field1682, this.field1683, this.field1690, this.field1691, 0, var6, arg2, this);
                    } else {
                        arg1 = method2065(((class108) this.field1706).field1603, arg0, this.field1680, arg1, this.field1681, this.field1679, 0, var6, arg2, this);
                    }
                } else if (Statics.field2316) {
                    arg1 = method2011(0, 0, ((class108) this.field1706).field1603, arg0, this.field1680, arg1, this.field1682, this.field1683, this.field1690, this.field1691, 0, var6, arg2, this, this.field1678, arg4);
                } else {
                    arg1 = method2010(0, 0, ((class108) this.field1706).field1603, arg0, this.field1680, arg1, this.field1681, this.field1679, 0, var6, arg2, this, this.field1678, arg4);
                }
                this.field1688 -= arg1;
                if (this.field1688 != 0) {
                    return arg1;
                }
                if (!this.method1999()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1678 == 256 && (this.field1680 & 0xFF) == 0) {
                if (Statics.field2316) {
                    return method2082(0, ((class108) this.field1706).field1603, arg0, this.field1680, arg1, this.field1682, this.field1683, 0, arg3, arg2, this);
                }
                return method2000(((class108) this.field1706).field1603, arg0, this.field1680, arg1, this.field1681, 0, arg3, arg2, this);
            }
            if (Statics.field2316) {
                return method2020(0, 0, ((class108) this.field1706).field1603, arg0, this.field1680, arg1, this.field1682, this.field1683, 0, arg3, arg2, this, this.field1678, arg4);
            }
            return method2003(0, 0, ((class108) this.field1706).field1603, arg0, this.field1680, arg1, this.field1681, 0, arg3, arg2, this, this.field1678, arg4);
        }
    }

    @ObfuscatedName("do.ap([IIIII)I")
    public int method1998(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1688 > 0) {
                int var6 = this.field1688 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1688 += arg1;
                if (this.field1678 == -256 && (this.field1680 & 0xFF) == 0) {
                    if (Statics.field2316) {
                        arg1 = method2009(0, ((class108) this.field1706).field1603, arg0, this.field1680, arg1, this.field1682, this.field1683, this.field1690, this.field1691, 0, var6, arg2, this);
                    } else {
                        arg1 = method2012(((class108) this.field1706).field1603, arg0, this.field1680, arg1, this.field1681, this.field1679, 0, var6, arg2, this);
                    }
                } else if (Statics.field2316) {
                    arg1 = method2013(0, 0, ((class108) this.field1706).field1603, arg0, this.field1680, arg1, this.field1682, this.field1683, this.field1690, this.field1691, 0, var6, arg2, this, this.field1678, arg4);
                } else {
                    arg1 = method2058(0, 0, ((class108) this.field1706).field1603, arg0, this.field1680, arg1, this.field1681, this.field1679, 0, var6, arg2, this, this.field1678, arg4);
                }
                this.field1688 -= arg1;
                if (this.field1688 != 0) {
                    return arg1;
                }
                if (!this.method1999()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1678 == -256 && (this.field1680 & 0xFF) == 0) {
                if (Statics.field2316) {
                    return method2103(0, ((class108) this.field1706).field1603, arg0, this.field1680, arg1, this.field1682, this.field1683, 0, arg3, arg2, this);
                }
                return method2001(((class108) this.field1706).field1603, arg0, this.field1680, arg1, this.field1681, 0, arg3, arg2, this);
            }
            if (Statics.field2316) {
                return method2051(0, 0, ((class108) this.field1706).field1603, arg0, this.field1680, arg1, this.field1682, this.field1683, 0, arg3, arg2, this, this.field1678, arg4);
            }
            return method1979(0, 0, ((class108) this.field1706).field1603, arg0, this.field1680, arg1, this.field1681, 0, arg3, arg2, this, this.field1678, arg4);
        }
    }

    @ObfuscatedName("do.as()Z")
    public boolean method1999() {
        int var1 = this.field1684;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2027(var1, this.field1677);
            var2 = method1974(var1, this.field1677);
        }
        if (this.field1681 != var1 || this.field1682 != var3 || this.field1683 != var2) {
            if (this.field1681 < var1) {
                this.field1679 = 1;
                this.field1688 = var1 - this.field1681;
            } else if (this.field1681 > var1) {
                this.field1679 = -1;
                this.field1688 = this.field1681 - var1;
            } else {
                this.field1679 = 0;
            }
            if (this.field1682 < var3) {
                this.field1690 = 1;
                if (this.field1688 == 0 || this.field1688 > var3 - this.field1682) {
                    this.field1688 = var3 - this.field1682;
                }
            } else if (this.field1682 > var3) {
                this.field1690 = -1;
                if (this.field1688 == 0 || this.field1688 > this.field1682 - var3) {
                    this.field1688 = this.field1682 - var3;
                }
            } else {
                this.field1690 = 0;
            }
            if (this.field1683 < var2) {
                this.field1691 = 1;
                if (this.field1688 == 0 || this.field1688 > var2 - this.field1683) {
                    this.field1688 = var2 - this.field1683;
                }
            } else if (this.field1683 > var2) {
                this.field1691 = -1;
                if (this.field1688 == 0 || this.field1688 > this.field1683 - var2) {
                    this.field1688 = this.field1683 - var2;
                }
            } else {
                this.field1691 = 0;
            }
            return false;
        } else if (this.field1684 == Integer.MIN_VALUE) {
            this.field1684 = 0;
            this.field1683 = 0;
            this.field1682 = 0;
            this.field1681 = 0;
            this.method3364();
            return true;
        } else {
            this.method1978();
            return false;
        }
    }

    @ObfuscatedName("do.aw([B[IIIIIIILdo;)I")
    public static int method2000(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118 arg8) {
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
        arg8.field1680 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("do.al(I[B[IIIIIIIILdo;)I")
    public static int method2082(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10) {
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
        arg10.field1680 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("do.ak([B[IIIIIIILdo;)I")
    public static int method2001(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118 arg8) {
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
        arg8.field1680 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("do.aa(I[B[IIIIIIIILdo;)I")
    public static int method2103(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10) {
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
        arg10.field1680 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("do.an(II[B[IIIIIIILdo;II)I")
    public static int method2003(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10, int arg11, int arg12) {
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
        arg10.field1680 = arg4;
        return arg5;
    }

    @ObfuscatedName("do.au(II[B[IIIIIIIILdo;II)I")
    public static int method2020(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
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
        arg11.field1680 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("do.ab(II[B[IIIIIIILdo;II)I")
    public static int method1979(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10, int arg11, int arg12) {
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
        arg10.field1680 = arg4;
        return arg5;
    }

    @ObfuscatedName("do.bz(II[B[IIIIIIIILdo;II)I")
    public static int method2051(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
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
        arg11.field1680 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("do.bd([B[IIIIIIIILdo;)I")
    public static int method2065(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class118 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1682 += (var14 - arg3) * arg9.field1690;
        arg9.field1683 += (var14 - arg3) * arg9.field1691;
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
        arg9.field1681 = var12 >> 2;
        arg9.field1680 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("do.bp(I[B[IIIIIIIIIILdo;)I")
    public static int method2007(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class118 arg12) {
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
        arg12.field1681 += (var19 - arg4) * arg12.field1679;
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
        arg12.field1682 = var15 >> 2;
        arg12.field1683 = var16 >> 2;
        arg12.field1680 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("do.bf([B[IIIIIIIILdo;)I")
    public static int method2012(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class118 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1682 += (var14 - arg3) * arg9.field1690;
        arg9.field1683 += (var14 - arg3) * arg9.field1691;
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
        arg9.field1681 = var12 >> 2;
        arg9.field1680 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("do.bb(I[B[IIIIIIIIIILdo;)I")
    public static int method2009(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class118 arg12) {
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
        arg12.field1681 += (var19 - arg4) * arg12.field1679;
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
        arg12.field1682 = var15 >> 2;
        arg12.field1683 = var16 >> 2;
        arg12.field1680 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("do.bw(II[B[IIIIIIIILdo;II)I")
    public static int method2010(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
        arg11.field1682 -= arg11.field1690 * arg5;
        arg11.field1683 -= arg11.field1691 * arg5;
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
        arg11.field1682 += arg11.field1690 * arg5;
        arg11.field1683 += arg11.field1691 * arg5;
        arg11.field1681 = arg6;
        arg11.field1680 = arg4;
        return arg5;
    }

    @ObfuscatedName("do.bh(II[B[IIIIIIIIIILdo;II)I")
    public static int method2011(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class118 arg13, int arg14, int arg15) {
        arg13.field1681 -= arg13.field1679 * arg5;
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
        arg13.field1681 += arg13.field1679 * var27;
        arg13.field1682 = arg6;
        arg13.field1683 = arg7;
        arg13.field1680 = arg4;
        return var27;
    }

    @ObfuscatedName("do.bl(II[B[IIIIIIIILdo;II)I")
    public static int method2058(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
        arg11.field1682 -= arg11.field1690 * arg5;
        arg11.field1683 -= arg11.field1691 * arg5;
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
        arg11.field1682 += arg11.field1690 * arg5;
        arg11.field1683 += arg11.field1691 * arg5;
        arg11.field1681 = arg6;
        arg11.field1680 = arg4;
        return arg5;
    }

    @ObfuscatedName("do.bi(II[B[IIIIIIIIIILdo;II)I")
    public static int method2013(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class118 arg13, int arg14, int arg15) {
        arg13.field1681 -= arg13.field1679 * arg5;
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
        arg13.field1681 += arg13.field1679 * var26;
        arg13.field1682 = arg6;
        arg13.field1683 = arg7;
        arg13.field1680 = arg4;
        return var26;
    }
}
