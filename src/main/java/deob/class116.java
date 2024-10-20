package deob;

@ObfuscatedName("dx")
public class class116 extends class118 {

    @ObfuscatedName("dx.d")
    public int field1682;

    @ObfuscatedName("dx.k")
    public int field1677;

    @ObfuscatedName("dx.e")
    public int field1679;

    @ObfuscatedName("dx.p")
    public int field1680;

    @ObfuscatedName("dx.q")
    public int field1681;

    @ObfuscatedName("dx.s")
    public int field1691;

    @ObfuscatedName("dx.r")
    public int field1683;

    @ObfuscatedName("dx.g")
    public int field1684;

    @ObfuscatedName("dx.v")
    public int field1685;

    @ObfuscatedName("dx.t")
    public int field1686;

    @ObfuscatedName("dx.y")
    public boolean field1689;

    @ObfuscatedName("dx.o")
    public int field1688;

    @ObfuscatedName("dx.i")
    public int field1690;

    @ObfuscatedName("dx.u")
    public int field1678;

    @ObfuscatedName("dx.b")
    public int field1687;

    @ObfuscatedName("dx.d(II)I")
    public static int method2078(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dx.k(II)I")
    public static int method2040(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dx.ay()I")
    public int method2016() {
        int var1 = this.field1681 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1684 == 0) {
            var2 -= this.field1682 * var2 / (((class106) this.field1706).field1597.length << 8);
        } else if (this.field1684 >= 0) {
            var2 -= this.field1685 * var2 / ((class106) this.field1706).field1597.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class116(class106 arg0, int arg1, int arg2) {
        this.field1706 = arg0;
        this.field1685 = arg0.field1599;
        this.field1686 = arg0.field1596;
        this.field1689 = arg0.field1600;
        this.field1677 = arg1;
        this.field1679 = arg2;
        this.field1680 = 8192;
        this.field1682 = 0;
        this.method2026();
    }

    public class116(class106 arg0, int arg1, int arg2, int arg3) {
        this.field1706 = arg0;
        this.field1685 = arg0.field1599;
        this.field1686 = arg0.field1596;
        this.field1689 = arg0.field1600;
        this.field1677 = arg1;
        this.field1679 = arg2;
        this.field1680 = arg3;
        this.field1682 = 0;
        this.method2026();
    }

    @ObfuscatedName("dx.e(Ldo;II)Ldx;")
    public static class116 method2018(class106 arg0, int arg1, int arg2) {
        return arg0.field1597 == null || arg0.field1597.length == 0 ? null : new class116(arg0, (int) ((long) arg0.field1598 * 256L * (long) arg1 / (long) (Statics.field463 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dx.p(Ldo;III)Ldx;")
    public static class116 method2148(class106 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1597 == null || arg0.field1597.length == 0 ? null : new class116(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dx.q()V")
    public void method2026() {
        this.field1681 = this.field1679;
        this.field1691 = method2078(this.field1679, this.field1680);
        this.field1683 = method2040(this.field1679, this.field1680);
    }

    @ObfuscatedName("dx.t(I)V")
    public synchronized void method2142(int arg0) {
        this.field1684 = arg0;
    }

    @ObfuscatedName("dx.o(I)V")
    public synchronized void method2022(int arg0) {
        this.method2024(arg0 << 6, this.method2058());
    }

    @ObfuscatedName("dx.i(I)V")
    public synchronized void method2021(int arg0) {
        this.method2024(arg0, this.method2058());
    }

    @ObfuscatedName("dx.u(II)V")
    public synchronized void method2024(int arg0, int arg1) {
        this.field1679 = arg0;
        this.field1680 = arg1;
        this.field1688 = 0;
        this.method2026();
    }

    @ObfuscatedName("dx.x()I")
    public synchronized int method2146() {
        return this.field1679 == Integer.MIN_VALUE ? 0 : this.field1679;
    }

    @ObfuscatedName("dx.c()I")
    public synchronized int method2058() {
        return this.field1680 < 0 ? -1 : this.field1680;
    }

    @ObfuscatedName("dx.h(I)V")
    public synchronized void method2027(int arg0) {
        int var2 = ((class106) this.field1706).field1597.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1682 = arg0;
    }

    @ObfuscatedName("dx.a(Z)V")
    public synchronized void method2098(boolean arg0) {
        this.field1677 = (this.field1677 >>> 31) + (this.field1677 ^ this.field1677 >> 31);
        if (arg0) {
            this.field1677 = -this.field1677;
        }
    }

    @ObfuscatedName("dx.w()V")
    public void method2029() {
        if (this.field1688 == 0) {
            return;
        }
        if (this.field1679 == Integer.MIN_VALUE) {
            this.field1679 = 0;
        }
        this.field1688 = 0;
        this.method2026();
    }

    @ObfuscatedName("dx.n(II)V")
    public synchronized void method2030(int arg0, int arg1) {
        this.method2031(arg0, arg1, this.method2058());
    }

    @ObfuscatedName("dx.m(III)V")
    public synchronized void method2031(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2024(arg1, arg2);
            return;
        }
        int var4 = method2078(arg1, arg2);
        int var5 = method2040(arg1, arg2);
        if (this.field1691 == var4 && this.field1683 == var5) {
            this.field1688 = 0;
            return;
        }
        int var6 = arg1 - this.field1681;
        if (this.field1681 - arg1 > var6) {
            var6 = this.field1681 - arg1;
        }
        if (var4 - this.field1691 > var6) {
            var6 = var4 - this.field1691;
        }
        if (this.field1691 - var4 > var6) {
            var6 = this.field1691 - var4;
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
        this.field1679 = arg1;
        this.field1680 = arg2;
        this.field1690 = (arg1 - this.field1681) / arg0;
        this.field1678 = (var4 - this.field1691) / arg0;
        this.field1687 = (var5 - this.field1683) / arg0;
    }

    @ObfuscatedName("dx.ae(I)V")
    public synchronized void method2015(int arg0) {
        if (arg0 == 0) {
            this.method2021(0);
            this.method3407();
        } else if (this.field1691 == 0 && this.field1683 == 0) {
            this.field1688 = 0;
            this.field1679 = 0;
            this.field1681 = 0;
            this.method3407();
        } else {
            int var2 = -this.field1681;
            if (this.field1681 > var2) {
                var2 = this.field1681;
            }
            if (-this.field1691 > var2) {
                var2 = -this.field1691;
            }
            if (this.field1691 > var2) {
                var2 = this.field1691;
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
            this.field1679 = Integer.MIN_VALUE;
            this.field1690 = -this.field1681 / arg0;
            this.field1678 = -this.field1691 / arg0;
            this.field1687 = -this.field1683 / arg0;
        }
    }

    @ObfuscatedName("dx.ai(I)V")
    public synchronized void method2033(int arg0) {
        if (this.field1677 < 0) {
            this.field1677 = -arg0;
        } else {
            this.field1677 = arg0;
        }
    }

    @ObfuscatedName("dx.ah()I")
    public synchronized int method2056() {
        return this.field1677 < 0 ? -this.field1677 : this.field1677;
    }

    @ObfuscatedName("dx.ab()Z")
    public boolean method2035() {
        return this.field1682 < 0 || this.field1682 >= ((class106) this.field1706).field1597.length << 8;
    }

    @ObfuscatedName("dx.aa()Z")
    public boolean method2137() {
        return this.field1688 != 0;
    }

    @ObfuscatedName("dx.s()Ldd;")
    public class118 method1795() {
        return null;
    }

    @ObfuscatedName("dx.r()Ldd;")
    public class118 method1796() {
        return null;
    }

    @ObfuscatedName("dx.g()I")
    public int method1815() {
        return this.field1679 == 0 && this.field1688 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dx.v([III)V")
    public synchronized void method1810(int[] arg0, int arg1, int arg2) {
        if (this.field1679 == 0 && this.field1688 == 0) {
            this.method1790(arg2);
            return;
        }
        class106 var4 = (class106) this.field1706;
        int var5 = this.field1685 << 8;
        int var6 = this.field1686 << 8;
        int var7 = var4.field1597.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1684 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1682 < 0) {
            if (this.field1677 <= 0) {
                this.method2029();
                this.method3407();
                return;
            }
            this.field1682 = 0;
        }
        if (this.field1682 >= var7) {
            if (this.field1677 >= 0) {
                this.method2029();
                this.method3407();
                return;
            }
            this.field1682 = var7 - 1;
        }
        if (this.field1684 >= 0) {
            if (this.field1684 > 0) {
                if (this.field1689) {
                    label131: {
                        if (this.field1677 < 0) {
                            var9 = this.method2038(arg0, arg1, var5, var10, var4.field1597[this.field1685]);
                            if (this.field1682 >= var5) {
                                return;
                            }
                            this.field1682 = var5 + var5 - 1 - this.field1682;
                            this.field1677 = -this.field1677;
                            if (--this.field1684 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2037(arg0, var9, var6, var10, var4.field1597[this.field1686 - 1]);
                            if (this.field1682 < var6) {
                                return;
                            }
                            this.field1682 = var6 + var6 - 1 - this.field1682;
                            this.field1677 = -this.field1677;
                            if (--this.field1684 == 0) {
                                break;
                            }
                            var9 = this.method2038(arg0, var9, var5, var10, var4.field1597[this.field1685]);
                            if (this.field1682 >= var5) {
                                return;
                            }
                            this.field1682 = var5 + var5 - 1 - this.field1682;
                            this.field1677 = -this.field1677;
                        } while (--this.field1684 != 0);
                    }
                } else if (this.field1677 < 0) {
                    while (true) {
                        var9 = this.method2038(arg0, var9, var5, var10, var4.field1597[this.field1686 - 1]);
                        if (this.field1682 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1682) / var8;
                        if (var12 >= this.field1684) {
                            this.field1682 += this.field1684 * var8;
                            this.field1684 = 0;
                            break;
                        }
                        this.field1682 += var8 * var12;
                        this.field1684 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2037(arg0, var9, var6, var10, var4.field1597[this.field1685]);
                        if (this.field1682 < var6) {
                            return;
                        }
                        int var13 = (this.field1682 - var5) / var8;
                        if (var13 >= this.field1684) {
                            this.field1682 -= this.field1684 * var8;
                            this.field1684 = 0;
                            break;
                        }
                        this.field1682 -= var8 * var13;
                        this.field1684 -= var13;
                    }
                }
            }
            if (this.field1677 < 0) {
                this.method2038(arg0, var9, 0, var10, 0);
                if (this.field1682 < 0) {
                    this.field1682 = -1;
                    this.method2029();
                    this.method3407();
                }
            } else {
                this.method2037(arg0, var9, var7, var10, 0);
                if (this.field1682 >= var7) {
                    this.field1682 = var7;
                    this.method2029();
                    this.method3407();
                }
            }
        } else if (this.field1689) {
            if (this.field1677 < 0) {
                var9 = this.method2038(arg0, arg1, var5, var10, var4.field1597[this.field1685]);
                if (this.field1682 >= var5) {
                    return;
                }
                this.field1682 = var5 + var5 - 1 - this.field1682;
                this.field1677 = -this.field1677;
            }
            while (true) {
                int var11 = this.method2037(arg0, var9, var6, var10, var4.field1597[this.field1686 - 1]);
                if (this.field1682 < var6) {
                    return;
                }
                this.field1682 = var6 + var6 - 1 - this.field1682;
                this.field1677 = -this.field1677;
                var9 = this.method2038(arg0, var11, var5, var10, var4.field1597[this.field1685]);
                if (this.field1682 >= var5) {
                    return;
                }
                this.field1682 = var5 + var5 - 1 - this.field1682;
                this.field1677 = -this.field1677;
            }
        } else if (this.field1677 < 0) {
            while (true) {
                var9 = this.method2038(arg0, var9, var5, var10, var4.field1597[this.field1686 - 1]);
                if (this.field1682 >= var5) {
                    return;
                }
                this.field1682 = var6 - 1 - (var6 - 1 - this.field1682) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2037(arg0, var9, var6, var10, var4.field1597[this.field1685]);
                if (this.field1682 < var6) {
                    return;
                }
                this.field1682 = (this.field1682 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dx.y(I)V")
    public synchronized void method1790(int arg0) {
        if (this.field1688 > 0) {
            if (arg0 >= this.field1688) {
                if (this.field1679 == Integer.MIN_VALUE) {
                    this.field1679 = 0;
                    this.field1683 = 0;
                    this.field1691 = 0;
                    this.field1681 = 0;
                    this.method3407();
                    arg0 = this.field1688;
                }
                this.field1688 = 0;
                this.method2026();
            } else {
                this.field1681 += this.field1690 * arg0;
                this.field1691 += this.field1678 * arg0;
                this.field1683 += this.field1687 * arg0;
                this.field1688 -= arg0;
            }
        }
        class106 var2 = (class106) this.field1706;
        int var3 = this.field1685 << 8;
        int var4 = this.field1686 << 8;
        int var5 = var2.field1597.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1684 = 0;
        }
        if (this.field1682 < 0) {
            if (this.field1677 <= 0) {
                this.method2029();
                this.method3407();
                return;
            }
            this.field1682 = 0;
        }
        if (this.field1682 >= var5) {
            if (this.field1677 >= 0) {
                this.method2029();
                this.method3407();
                return;
            }
            this.field1682 = var5 - 1;
        }
        this.field1682 += this.field1677 * arg0;
        if (this.field1684 >= 0) {
            if (this.field1684 > 0) {
                if (this.field1689) {
                    label121: {
                        if (this.field1677 < 0) {
                            if (this.field1682 >= var3) {
                                return;
                            }
                            this.field1682 = var3 + var3 - 1 - this.field1682;
                            this.field1677 = -this.field1677;
                            if (--this.field1684 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1682 < var4) {
                                return;
                            }
                            this.field1682 = var4 + var4 - 1 - this.field1682;
                            this.field1677 = -this.field1677;
                            if (--this.field1684 == 0) {
                                break;
                            }
                            if (this.field1682 >= var3) {
                                return;
                            }
                            this.field1682 = var3 + var3 - 1 - this.field1682;
                            this.field1677 = -this.field1677;
                        } while (--this.field1684 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1677 < 0) {
                            if (this.field1682 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1682) / var6;
                            if (var7 >= this.field1684) {
                                this.field1682 += this.field1684 * var6;
                                this.field1684 = 0;
                                break label153;
                            }
                            this.field1682 += var6 * var7;
                            this.field1684 -= var7;
                        } else if (this.field1682 >= var4) {
                            int var8 = (this.field1682 - var3) / var6;
                            if (var8 >= this.field1684) {
                                this.field1682 -= this.field1684 * var6;
                                this.field1684 = 0;
                                break label153;
                            }
                            this.field1682 -= var6 * var8;
                            this.field1684 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1677 < 0) {
                if (this.field1682 < 0) {
                    this.field1682 = -1;
                    this.method2029();
                    this.method3407();
                }
            } else if (this.field1682 >= var5) {
                this.field1682 = var5;
                this.method2029();
                this.method3407();
            }
        } else if (this.field1689) {
            if (this.field1677 < 0) {
                if (this.field1682 >= var3) {
                    return;
                }
                this.field1682 = var3 + var3 - 1 - this.field1682;
                this.field1677 = -this.field1677;
            }
            while (this.field1682 >= var4) {
                this.field1682 = var4 + var4 - 1 - this.field1682;
                this.field1677 = -this.field1677;
                if (this.field1682 >= var3) {
                    return;
                }
                this.field1682 = var3 + var3 - 1 - this.field1682;
                this.field1677 = -this.field1677;
            }
        } else if (this.field1677 < 0) {
            if (this.field1682 >= var3) {
                return;
            }
            this.field1682 = var4 - 1 - (var4 - 1 - this.field1682) % var6;
        } else if (this.field1682 >= var4) {
            this.field1682 = (this.field1682 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dx.at([IIIII)I")
    public int method2037(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1688 > 0) {
                int var6 = this.field1688 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1688 += arg1;
                if (this.field1677 == 256 && (this.field1682 & 0xFF) == 0) {
                    if (Statics.field491) {
                        arg1 = method2050(0, ((class106) this.field1706).field1597, arg0, this.field1682, arg1, this.field1691, this.field1683, this.field1678, this.field1687, 0, var6, arg2, this);
                    } else {
                        arg1 = method2048(((class106) this.field1706).field1597, arg0, this.field1682, arg1, this.field1681, this.field1690, 0, var6, arg2, this);
                    }
                } else if (Statics.field491) {
                    arg1 = method2052(0, 0, ((class106) this.field1706).field1597, arg0, this.field1682, arg1, this.field1691, this.field1683, this.field1678, this.field1687, 0, var6, arg2, this, this.field1677, arg4);
                } else {
                    arg1 = method2051(0, 0, ((class106) this.field1706).field1597, arg0, this.field1682, arg1, this.field1681, this.field1690, 0, var6, arg2, this, this.field1677, arg4);
                }
                this.field1688 -= arg1;
                if (this.field1688 != 0) {
                    return arg1;
                }
                if (!this.method2039()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1677 == 256 && (this.field1682 & 0xFF) == 0) {
                if (Statics.field491) {
                    return method2041(0, ((class106) this.field1706).field1597, arg0, this.field1682, arg1, this.field1691, this.field1683, 0, arg3, arg2, this);
                }
                return method2032(((class106) this.field1706).field1597, arg0, this.field1682, arg1, this.field1681, 0, arg3, arg2, this);
            }
            if (Statics.field491) {
                return method2045(0, 0, ((class106) this.field1706).field1597, arg0, this.field1682, arg1, this.field1691, this.field1683, 0, arg3, arg2, this, this.field1677, arg4);
            }
            return method2044(0, 0, ((class106) this.field1706).field1597, arg0, this.field1682, arg1, this.field1681, 0, arg3, arg2, this, this.field1677, arg4);
        }
    }

    @ObfuscatedName("dx.aw([IIIII)I")
    public int method2038(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1688 > 0) {
                int var6 = this.field1688 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1688 += arg1;
                if (this.field1677 == -256 && (this.field1682 & 0xFF) == 0) {
                    if (Statics.field491) {
                        arg1 = method2125(0, ((class106) this.field1706).field1597, arg0, this.field1682, arg1, this.field1691, this.field1683, this.field1678, this.field1687, 0, var6, arg2, this);
                    } else {
                        arg1 = method2049(((class106) this.field1706).field1597, arg0, this.field1682, arg1, this.field1681, this.field1690, 0, var6, arg2, this);
                    }
                } else if (Statics.field491) {
                    arg1 = method2054(0, 0, ((class106) this.field1706).field1597, arg0, this.field1682, arg1, this.field1691, this.field1683, this.field1678, this.field1687, 0, var6, arg2, this, this.field1677, arg4);
                } else {
                    arg1 = method2070(0, 0, ((class106) this.field1706).field1597, arg0, this.field1682, arg1, this.field1681, this.field1690, 0, var6, arg2, this, this.field1677, arg4);
                }
                this.field1688 -= arg1;
                if (this.field1688 != 0) {
                    return arg1;
                }
                if (!this.method2039()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1677 == -256 && (this.field1682 & 0xFF) == 0) {
                if (Statics.field491) {
                    return method2043(0, ((class106) this.field1706).field1597, arg0, this.field1682, arg1, this.field1691, this.field1683, 0, arg3, arg2, this);
                }
                return method2074(((class106) this.field1706).field1597, arg0, this.field1682, arg1, this.field1681, 0, arg3, arg2, this);
            }
            if (Statics.field491) {
                return method2047(0, 0, ((class106) this.field1706).field1597, arg0, this.field1682, arg1, this.field1691, this.field1683, 0, arg3, arg2, this, this.field1677, arg4);
            }
            return method2046(0, 0, ((class106) this.field1706).field1597, arg0, this.field1682, arg1, this.field1681, 0, arg3, arg2, this, this.field1677, arg4);
        }
    }

    @ObfuscatedName("dx.ax()Z")
    public boolean method2039() {
        int var1 = this.field1679;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2078(var1, this.field1680);
            var2 = method2040(var1, this.field1680);
        }
        if (this.field1681 != var1 || this.field1691 != var3 || this.field1683 != var2) {
            if (this.field1681 < var1) {
                this.field1690 = 1;
                this.field1688 = var1 - this.field1681;
            } else if (this.field1681 > var1) {
                this.field1690 = -1;
                this.field1688 = this.field1681 - var1;
            } else {
                this.field1690 = 0;
            }
            if (this.field1691 < var3) {
                this.field1678 = 1;
                if (this.field1688 == 0 || this.field1688 > var3 - this.field1691) {
                    this.field1688 = var3 - this.field1691;
                }
            } else if (this.field1691 > var3) {
                this.field1678 = -1;
                if (this.field1688 == 0 || this.field1688 > this.field1691 - var3) {
                    this.field1688 = this.field1691 - var3;
                }
            } else {
                this.field1678 = 0;
            }
            if (this.field1683 < var2) {
                this.field1687 = 1;
                if (this.field1688 == 0 || this.field1688 > var2 - this.field1683) {
                    this.field1688 = var2 - this.field1683;
                }
            } else if (this.field1683 > var2) {
                this.field1687 = -1;
                if (this.field1688 == 0 || this.field1688 > this.field1683 - var2) {
                    this.field1688 = this.field1683 - var2;
                }
            } else {
                this.field1687 = 0;
            }
            return false;
        } else if (this.field1679 == Integer.MIN_VALUE) {
            this.field1679 = 0;
            this.field1683 = 0;
            this.field1691 = 0;
            this.field1681 = 0;
            this.method3407();
            return true;
        } else {
            this.method2026();
            return false;
        }
    }

    @ObfuscatedName("dx.ak([B[IIIIIIILdx;)I")
    public static int method2032(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class116 arg8) {
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
        arg8.field1682 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dx.bj(I[B[IIIIIIIILdx;)I")
    public static int method2041(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10) {
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
        arg10.field1682 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dx.bf([B[IIIIIIILdx;)I")
    public static int method2074(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class116 arg8) {
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
        arg8.field1682 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dx.bq(I[B[IIIIIIIILdx;)I")
    public static int method2043(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10) {
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
        arg10.field1682 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dx.bc(II[B[IIIIIIILdx;II)I")
    public static int method2044(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10, int arg11, int arg12) {
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
        arg10.field1682 = arg4;
        return arg5;
    }

    @ObfuscatedName("dx.by(II[B[IIIIIIIILdx;II)I")
    public static int method2045(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
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
        arg11.field1682 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dx.bb(II[B[IIIIIIILdx;II)I")
    public static int method2046(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10, int arg11, int arg12) {
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
        arg10.field1682 = arg4;
        return arg5;
    }

    @ObfuscatedName("dx.bn(II[B[IIIIIIIILdx;II)I")
    public static int method2047(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
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
        arg11.field1682 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dx.bd([B[IIIIIIIILdx;)I")
    public static int method2048(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class116 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1691 += (var14 - arg3) * arg9.field1678;
        arg9.field1683 += (var14 - arg3) * arg9.field1687;
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
        arg9.field1682 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dx.bl(I[B[IIIIIIIIIILdx;)I")
    public static int method2050(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class116 arg12) {
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
        arg12.field1681 += (var19 - arg4) * arg12.field1690;
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
        arg12.field1691 = var15 >> 2;
        arg12.field1683 = var16 >> 2;
        arg12.field1682 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dx.bi([B[IIIIIIIILdx;)I")
    public static int method2049(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class116 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1691 += (var14 - arg3) * arg9.field1678;
        arg9.field1683 += (var14 - arg3) * arg9.field1687;
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
        arg9.field1682 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dx.bo(I[B[IIIIIIIIIILdx;)I")
    public static int method2125(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class116 arg12) {
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
        arg12.field1681 += (var19 - arg4) * arg12.field1690;
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
        arg12.field1691 = var15 >> 2;
        arg12.field1683 = var16 >> 2;
        arg12.field1682 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dx.bx(II[B[IIIIIIIILdx;II)I")
    public static int method2051(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
        arg11.field1691 -= arg11.field1678 * arg5;
        arg11.field1683 -= arg11.field1687 * arg5;
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
        arg11.field1691 += arg11.field1678 * arg5;
        arg11.field1683 += arg11.field1687 * arg5;
        arg11.field1681 = arg6;
        arg11.field1682 = arg4;
        return arg5;
    }

    @ObfuscatedName("dx.br(II[B[IIIIIIIIIILdx;II)I")
    public static int method2052(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class116 arg13, int arg14, int arg15) {
        arg13.field1681 -= arg13.field1690 * arg5;
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
        arg13.field1681 += arg13.field1690 * var27;
        arg13.field1691 = arg6;
        arg13.field1683 = arg7;
        arg13.field1682 = arg4;
        return var27;
    }

    @ObfuscatedName("dx.bu(II[B[IIIIIIIILdx;II)I")
    public static int method2070(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
        arg11.field1691 -= arg11.field1678 * arg5;
        arg11.field1683 -= arg11.field1687 * arg5;
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
        arg11.field1691 += arg11.field1678 * arg5;
        arg11.field1683 += arg11.field1687 * arg5;
        arg11.field1681 = arg6;
        arg11.field1682 = arg4;
        return arg5;
    }

    @ObfuscatedName("dx.bv(II[B[IIIIIIIIIILdx;II)I")
    public static int method2054(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class116 arg13, int arg14, int arg15) {
        arg13.field1681 -= arg13.field1690 * arg5;
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
        arg13.field1681 += arg13.field1690 * var26;
        arg13.field1691 = arg6;
        arg13.field1683 = arg7;
        arg13.field1682 = arg4;
        return var26;
    }
}
