package deob;

@ObfuscatedName("dq")
public class class119 extends class121 {

    @ObfuscatedName("dq.e")
    public int field1683;

    @ObfuscatedName("dq.n")
    public int field1679;

    @ObfuscatedName("dq.g")
    public int field1680;

    @ObfuscatedName("dq.y")
    public int field1681;

    @ObfuscatedName("dq.k")
    public int field1685;

    @ObfuscatedName("dq.v")
    public int field1692;

    @ObfuscatedName("dq.z")
    public int field1684;

    @ObfuscatedName("dq.r")
    public int field1678;

    @ObfuscatedName("dq.u")
    public int field1686;

    @ObfuscatedName("dq.d")
    public int field1687;

    @ObfuscatedName("dq.o")
    public boolean field1682;

    @ObfuscatedName("dq.l")
    public int field1689;

    @ObfuscatedName("dq.h")
    public int field1690;

    @ObfuscatedName("dq.s")
    public int field1688;

    @ObfuscatedName("dq.c")
    public int field1691;

    @ObfuscatedName("dq.e(II)I")
    public static int method2024(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dq.n(II)I")
    public static int method1980(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dq.af()I")
    public int method1977() {
        int var1 = this.field1685 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1678 == 0) {
            var2 -= this.field1683 * var2 / (((class109) this.field1705).field1601.length << 8);
        } else if (this.field1678 >= 0) {
            var2 -= this.field1686 * var2 / ((class109) this.field1705).field1601.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class119(class109 arg0, int arg1, int arg2) {
        this.field1705 = arg0;
        this.field1686 = arg0.field1603;
        this.field1687 = arg0.field1600;
        this.field1682 = arg0.field1604;
        this.field1679 = arg1;
        this.field1680 = arg2;
        this.field1681 = 8192;
        this.field1683 = 0;
        this.method1981();
    }

    public class119(class109 arg0, int arg1, int arg2, int arg3) {
        this.field1705 = arg0;
        this.field1686 = arg0.field1603;
        this.field1687 = arg0.field1600;
        this.field1682 = arg0.field1604;
        this.field1679 = arg1;
        this.field1680 = arg2;
        this.field1681 = arg3;
        this.field1683 = 0;
        this.method1981();
    }

    @ObfuscatedName("dq.g(Ldb;II)Ldq;")
    public static class119 method1979(class109 arg0, int arg1, int arg2) {
        return arg0.field1601 == null || arg0.field1601.length == 0 ? null : new class119(arg0, (int) ((long) arg0.field1602 * 256L * (long) arg1 / (long) (Statics.field1618 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dq.y(Ldb;III)Ldq;")
    public static class119 method2046(class109 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1601 == null || arg0.field1601.length == 0 ? null : new class119(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dq.w()V")
    public void method1981() {
        this.field1685 = this.field1680;
        this.field1692 = method2024(this.field1680, this.field1681);
        this.field1684 = method1980(this.field1680, this.field1681);
    }

    @ObfuscatedName("dq.u(I)V")
    public synchronized void method2105(int arg0) {
        this.field1678 = arg0;
    }

    @ObfuscatedName("dq.o(I)V")
    public synchronized void method2073(int arg0) {
        this.method1976(arg0 << 6, this.method2019());
    }

    @ObfuscatedName("dq.s(I)V")
    public synchronized void method1983(int arg0) {
        this.method1976(arg0, this.method2019());
    }

    @ObfuscatedName("dq.c(II)V")
    public synchronized void method1976(int arg0, int arg1) {
        this.field1680 = arg0;
        this.field1681 = arg1;
        this.field1689 = 0;
        this.method1981();
    }

    @ObfuscatedName("dq.m()I")
    public synchronized int method2098() {
        return this.field1680 == Integer.MIN_VALUE ? 0 : this.field1680;
    }

    @ObfuscatedName("dq.a()I")
    public synchronized int method2019() {
        return this.field1681 < 0 ? -1 : this.field1681;
    }

    @ObfuscatedName("dq.t(I)V")
    public synchronized void method1987(int arg0) {
        int var2 = ((class109) this.field1705).field1601.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1683 = arg0;
    }

    @ObfuscatedName("dq.p(Z)V")
    public synchronized void method2051(boolean arg0) {
        this.field1679 = (this.field1679 >>> 31) + (this.field1679 ^ this.field1679 >> 31);
        if (arg0) {
            this.field1679 = -this.field1679;
        }
    }

    @ObfuscatedName("dq.f()V")
    public void method1989() {
        if (this.field1689 == 0) {
            return;
        }
        if (this.field1680 == Integer.MIN_VALUE) {
            this.field1680 = 0;
        }
        this.field1689 = 0;
        this.method1981();
    }

    @ObfuscatedName("dq.x(II)V")
    public synchronized void method1990(int arg0, int arg1) {
        this.method1991(arg0, arg1, this.method2019());
    }

    @ObfuscatedName("dq.q(III)V")
    public synchronized void method1991(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1976(arg1, arg2);
            return;
        }
        int var4 = method2024(arg1, arg2);
        int var5 = method1980(arg1, arg2);
        if (this.field1692 == var4 && this.field1684 == var5) {
            this.field1689 = 0;
            return;
        }
        int var6 = arg1 - this.field1685;
        if (this.field1685 - arg1 > var6) {
            var6 = this.field1685 - arg1;
        }
        if (var4 - this.field1692 > var6) {
            var6 = var4 - this.field1692;
        }
        if (this.field1692 - var4 > var6) {
            var6 = this.field1692 - var4;
        }
        if (var5 - this.field1684 > var6) {
            var6 = var5 - this.field1684;
        }
        if (this.field1684 - var5 > var6) {
            var6 = this.field1684 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1689 = arg0;
        this.field1680 = arg1;
        this.field1681 = arg2;
        this.field1690 = (arg1 - this.field1685) / arg0;
        this.field1688 = (var4 - this.field1692) / arg0;
        this.field1691 = (var5 - this.field1684) / arg0;
    }

    @ObfuscatedName("dq.az(I)V")
    public synchronized void method1992(int arg0) {
        if (arg0 == 0) {
            this.method1983(0);
            this.method3333();
        } else if (this.field1692 == 0 && this.field1684 == 0) {
            this.field1689 = 0;
            this.field1680 = 0;
            this.field1685 = 0;
            this.method3333();
        } else {
            int var2 = -this.field1685;
            if (this.field1685 > var2) {
                var2 = this.field1685;
            }
            if (-this.field1692 > var2) {
                var2 = -this.field1692;
            }
            if (this.field1692 > var2) {
                var2 = this.field1692;
            }
            if (-this.field1684 > var2) {
                var2 = -this.field1684;
            }
            if (this.field1684 > var2) {
                var2 = this.field1684;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1689 = arg0;
            this.field1680 = Integer.MIN_VALUE;
            this.field1690 = -this.field1685 / arg0;
            this.field1688 = -this.field1692 / arg0;
            this.field1691 = -this.field1684 / arg0;
        }
    }

    @ObfuscatedName("dq.aw(I)V")
    public synchronized void method1993(int arg0) {
        if (this.field1679 < 0) {
            this.field1679 = -arg0;
        } else {
            this.field1679 = arg0;
        }
    }

    @ObfuscatedName("dq.ac()I")
    public synchronized int method2108() {
        return this.field1679 < 0 ? -this.field1679 : this.field1679;
    }

    @ObfuscatedName("dq.ak()Z")
    public boolean method1995() {
        return this.field1683 < 0 || this.field1683 >= ((class109) this.field1705).field1601.length << 8;
    }

    @ObfuscatedName("dq.ad()Z")
    public boolean method1996() {
        return this.field1689 != 0;
    }

    @ObfuscatedName("dq.k()Ldl;")
    public class121 method1774() {
        return null;
    }

    @ObfuscatedName("dq.v()Ldl;")
    public class121 method1775() {
        return null;
    }

    @ObfuscatedName("dq.z()I")
    public int method1776() {
        return this.field1680 == 0 && this.field1689 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dq.r([III)V")
    public synchronized void method1777(int[] arg0, int arg1, int arg2) {
        if (this.field1680 == 0 && this.field1689 == 0) {
            this.method1791(arg2);
            return;
        }
        class109 var4 = (class109) this.field1705;
        int var5 = this.field1686 << 8;
        int var6 = this.field1687 << 8;
        int var7 = var4.field1601.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1678 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1683 < 0) {
            if (this.field1679 <= 0) {
                this.method1989();
                this.method3333();
                return;
            }
            this.field1683 = 0;
        }
        if (this.field1683 >= var7) {
            if (this.field1679 >= 0) {
                this.method1989();
                this.method3333();
                return;
            }
            this.field1683 = var7 - 1;
        }
        if (this.field1678 >= 0) {
            if (this.field1678 > 0) {
                if (this.field1682) {
                    label131: {
                        if (this.field1679 < 0) {
                            var9 = this.method2000(arg0, arg1, var5, var10, var4.field1601[this.field1686]);
                            if (this.field1683 >= var5) {
                                return;
                            }
                            this.field1683 = var5 + var5 - 1 - this.field1683;
                            this.field1679 = -this.field1679;
                            if (--this.field1678 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2021(arg0, var9, var6, var10, var4.field1601[this.field1687 - 1]);
                            if (this.field1683 < var6) {
                                return;
                            }
                            this.field1683 = var6 + var6 - 1 - this.field1683;
                            this.field1679 = -this.field1679;
                            if (--this.field1678 == 0) {
                                break;
                            }
                            var9 = this.method2000(arg0, var9, var5, var10, var4.field1601[this.field1686]);
                            if (this.field1683 >= var5) {
                                return;
                            }
                            this.field1683 = var5 + var5 - 1 - this.field1683;
                            this.field1679 = -this.field1679;
                        } while (--this.field1678 != 0);
                    }
                } else if (this.field1679 < 0) {
                    while (true) {
                        var9 = this.method2000(arg0, var9, var5, var10, var4.field1601[this.field1687 - 1]);
                        if (this.field1683 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1683) / var8;
                        if (var12 >= this.field1678) {
                            this.field1683 += this.field1678 * var8;
                            this.field1678 = 0;
                            break;
                        }
                        this.field1683 += var8 * var12;
                        this.field1678 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2021(arg0, var9, var6, var10, var4.field1601[this.field1686]);
                        if (this.field1683 < var6) {
                            return;
                        }
                        int var13 = (this.field1683 - var5) / var8;
                        if (var13 >= this.field1678) {
                            this.field1683 -= this.field1678 * var8;
                            this.field1678 = 0;
                            break;
                        }
                        this.field1683 -= var8 * var13;
                        this.field1678 -= var13;
                    }
                }
            }
            if (this.field1679 < 0) {
                this.method2000(arg0, var9, 0, var10, 0);
                if (this.field1683 < 0) {
                    this.field1683 = -1;
                    this.method1989();
                    this.method3333();
                }
            } else {
                this.method2021(arg0, var9, var7, var10, 0);
                if (this.field1683 >= var7) {
                    this.field1683 = var7;
                    this.method1989();
                    this.method3333();
                }
            }
        } else if (this.field1682) {
            if (this.field1679 < 0) {
                var9 = this.method2000(arg0, arg1, var5, var10, var4.field1601[this.field1686]);
                if (this.field1683 >= var5) {
                    return;
                }
                this.field1683 = var5 + var5 - 1 - this.field1683;
                this.field1679 = -this.field1679;
            }
            while (true) {
                int var11 = this.method2021(arg0, var9, var6, var10, var4.field1601[this.field1687 - 1]);
                if (this.field1683 < var6) {
                    return;
                }
                this.field1683 = var6 + var6 - 1 - this.field1683;
                this.field1679 = -this.field1679;
                var9 = this.method2000(arg0, var11, var5, var10, var4.field1601[this.field1686]);
                if (this.field1683 >= var5) {
                    return;
                }
                this.field1683 = var5 + var5 - 1 - this.field1683;
                this.field1679 = -this.field1679;
            }
        } else if (this.field1679 < 0) {
            while (true) {
                var9 = this.method2000(arg0, var9, var5, var10, var4.field1601[this.field1687 - 1]);
                if (this.field1683 >= var5) {
                    return;
                }
                this.field1683 = var6 - 1 - (var6 - 1 - this.field1683) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2021(arg0, var9, var6, var10, var4.field1601[this.field1686]);
                if (this.field1683 < var6) {
                    return;
                }
                this.field1683 = (this.field1683 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dq.d(I)V")
    public synchronized void method1791(int arg0) {
        if (this.field1689 > 0) {
            if (arg0 >= this.field1689) {
                if (this.field1680 == Integer.MIN_VALUE) {
                    this.field1680 = 0;
                    this.field1684 = 0;
                    this.field1692 = 0;
                    this.field1685 = 0;
                    this.method3333();
                    arg0 = this.field1689;
                }
                this.field1689 = 0;
                this.method1981();
            } else {
                this.field1685 += this.field1690 * arg0;
                this.field1692 += this.field1688 * arg0;
                this.field1684 += this.field1691 * arg0;
                this.field1689 -= arg0;
            }
        }
        class109 var2 = (class109) this.field1705;
        int var3 = this.field1686 << 8;
        int var4 = this.field1687 << 8;
        int var5 = var2.field1601.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1678 = 0;
        }
        if (this.field1683 < 0) {
            if (this.field1679 <= 0) {
                this.method1989();
                this.method3333();
                return;
            }
            this.field1683 = 0;
        }
        if (this.field1683 >= var5) {
            if (this.field1679 >= 0) {
                this.method1989();
                this.method3333();
                return;
            }
            this.field1683 = var5 - 1;
        }
        this.field1683 += this.field1679 * arg0;
        if (this.field1678 >= 0) {
            if (this.field1678 > 0) {
                if (this.field1682) {
                    label121: {
                        if (this.field1679 < 0) {
                            if (this.field1683 >= var3) {
                                return;
                            }
                            this.field1683 = var3 + var3 - 1 - this.field1683;
                            this.field1679 = -this.field1679;
                            if (--this.field1678 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1683 < var4) {
                                return;
                            }
                            this.field1683 = var4 + var4 - 1 - this.field1683;
                            this.field1679 = -this.field1679;
                            if (--this.field1678 == 0) {
                                break;
                            }
                            if (this.field1683 >= var3) {
                                return;
                            }
                            this.field1683 = var3 + var3 - 1 - this.field1683;
                            this.field1679 = -this.field1679;
                        } while (--this.field1678 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1679 < 0) {
                            if (this.field1683 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1683) / var6;
                            if (var7 >= this.field1678) {
                                this.field1683 += this.field1678 * var6;
                                this.field1678 = 0;
                                break label153;
                            }
                            this.field1683 += var6 * var7;
                            this.field1678 -= var7;
                        } else if (this.field1683 >= var4) {
                            int var8 = (this.field1683 - var3) / var6;
                            if (var8 >= this.field1678) {
                                this.field1683 -= this.field1678 * var6;
                                this.field1678 = 0;
                                break label153;
                            }
                            this.field1683 -= var6 * var8;
                            this.field1678 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1679 < 0) {
                if (this.field1683 < 0) {
                    this.field1683 = -1;
                    this.method1989();
                    this.method3333();
                }
            } else if (this.field1683 >= var5) {
                this.field1683 = var5;
                this.method1989();
                this.method3333();
            }
        } else if (this.field1682) {
            if (this.field1679 < 0) {
                if (this.field1683 >= var3) {
                    return;
                }
                this.field1683 = var3 + var3 - 1 - this.field1683;
                this.field1679 = -this.field1679;
            }
            while (this.field1683 >= var4) {
                this.field1683 = var4 + var4 - 1 - this.field1683;
                this.field1679 = -this.field1679;
                if (this.field1683 >= var3) {
                    return;
                }
                this.field1683 = var3 + var3 - 1 - this.field1683;
                this.field1679 = -this.field1679;
            }
        } else if (this.field1679 < 0) {
            if (this.field1683 >= var3) {
                return;
            }
            this.field1683 = var4 - 1 - (var4 - 1 - this.field1683) % var6;
        } else if (this.field1683 >= var4) {
            this.field1683 = (this.field1683 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dq.at([IIIII)I")
    public int method2021(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1689 > 0) {
                int var6 = this.field1689 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1689 += arg1;
                if (this.field1679 == 256 && (this.field1683 & 0xFF) == 0) {
                    if (Statics.field375) {
                        arg1 = method2011(0, ((class109) this.field1705).field1601, arg0, this.field1683, arg1, this.field1692, this.field1684, this.field1688, this.field1691, 0, var6, arg2, this);
                    } else {
                        arg1 = method2010(((class109) this.field1705).field1601, arg0, this.field1683, arg1, this.field1685, this.field1690, 0, var6, arg2, this);
                    }
                } else if (Statics.field375) {
                    arg1 = method2015(0, 0, ((class109) this.field1705).field1601, arg0, this.field1683, arg1, this.field1692, this.field1684, this.field1688, this.field1691, 0, var6, arg2, this, this.field1679, arg4);
                } else {
                    arg1 = method2014(0, 0, ((class109) this.field1705).field1601, arg0, this.field1683, arg1, this.field1685, this.field1690, 0, var6, arg2, this, this.field1679, arg4);
                }
                this.field1689 -= arg1;
                if (this.field1689 != 0) {
                    return arg1;
                }
                if (!this.method2013()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1679 == 256 && (this.field1683 & 0xFF) == 0) {
                if (Statics.field375) {
                    return method2003(0, ((class109) this.field1705).field1601, arg0, this.field1683, arg1, this.field1692, this.field1684, 0, arg3, arg2, this);
                }
                return method2002(((class109) this.field1705).field1601, arg0, this.field1683, arg1, this.field1685, 0, arg3, arg2, this);
            }
            if (Statics.field375) {
                return method2071(0, 0, ((class109) this.field1705).field1601, arg0, this.field1683, arg1, this.field1692, this.field1684, 0, arg3, arg2, this, this.field1679, arg4);
            }
            return method2112(0, 0, ((class109) this.field1705).field1601, arg0, this.field1683, arg1, this.field1685, 0, arg3, arg2, this, this.field1679, arg4);
        }
    }

    @ObfuscatedName("dq.am([IIIII)I")
    public int method2000(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1689 > 0) {
                int var6 = this.field1689 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1689 += arg1;
                if (this.field1679 == -256 && (this.field1683 & 0xFF) == 0) {
                    if (Statics.field375) {
                        arg1 = method2016(0, ((class109) this.field1705).field1601, arg0, this.field1683, arg1, this.field1692, this.field1684, this.field1688, this.field1691, 0, var6, arg2, this);
                    } else {
                        arg1 = method2012(((class109) this.field1705).field1601, arg0, this.field1683, arg1, this.field1685, this.field1690, 0, var6, arg2, this);
                    }
                } else if (Statics.field375) {
                    arg1 = method2017(0, 0, ((class109) this.field1705).field1601, arg0, this.field1683, arg1, this.field1692, this.field1684, this.field1688, this.field1691, 0, var6, arg2, this, this.field1679, arg4);
                } else {
                    arg1 = method1978(0, 0, ((class109) this.field1705).field1601, arg0, this.field1683, arg1, this.field1685, this.field1690, 0, var6, arg2, this, this.field1679, arg4);
                }
                this.field1689 -= arg1;
                if (this.field1689 != 0) {
                    return arg1;
                }
                if (!this.method2013()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1679 == -256 && (this.field1683 & 0xFF) == 0) {
                if (Statics.field375) {
                    return method2005(0, ((class109) this.field1705).field1601, arg0, this.field1683, arg1, this.field1692, this.field1684, 0, arg3, arg2, this);
                }
                return method2004(((class109) this.field1705).field1601, arg0, this.field1683, arg1, this.field1685, 0, arg3, arg2, this);
            }
            if (Statics.field375) {
                return method2009(0, 0, ((class109) this.field1705).field1601, arg0, this.field1683, arg1, this.field1692, this.field1684, 0, arg3, arg2, this, this.field1679, arg4);
            }
            return method2008(0, 0, ((class109) this.field1705).field1601, arg0, this.field1683, arg1, this.field1685, 0, arg3, arg2, this, this.field1679, arg4);
        }
    }

    @ObfuscatedName("dq.aq()Z")
    public boolean method2013() {
        int var1 = this.field1680;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2024(var1, this.field1681);
            var2 = method1980(var1, this.field1681);
        }
        if (this.field1685 != var1 || this.field1692 != var3 || this.field1684 != var2) {
            if (this.field1685 < var1) {
                this.field1690 = 1;
                this.field1689 = var1 - this.field1685;
            } else if (this.field1685 > var1) {
                this.field1690 = -1;
                this.field1689 = this.field1685 - var1;
            } else {
                this.field1690 = 0;
            }
            if (this.field1692 < var3) {
                this.field1688 = 1;
                if (this.field1689 == 0 || this.field1689 > var3 - this.field1692) {
                    this.field1689 = var3 - this.field1692;
                }
            } else if (this.field1692 > var3) {
                this.field1688 = -1;
                if (this.field1689 == 0 || this.field1689 > this.field1692 - var3) {
                    this.field1689 = this.field1692 - var3;
                }
            } else {
                this.field1688 = 0;
            }
            if (this.field1684 < var2) {
                this.field1691 = 1;
                if (this.field1689 == 0 || this.field1689 > var2 - this.field1684) {
                    this.field1689 = var2 - this.field1684;
                }
            } else if (this.field1684 > var2) {
                this.field1691 = -1;
                if (this.field1689 == 0 || this.field1689 > this.field1684 - var2) {
                    this.field1689 = this.field1684 - var2;
                }
            } else {
                this.field1691 = 0;
            }
            return false;
        } else if (this.field1680 == Integer.MIN_VALUE) {
            this.field1680 = 0;
            this.field1684 = 0;
            this.field1692 = 0;
            this.field1685 = 0;
            this.method3333();
            return true;
        } else {
            this.method1981();
            return false;
        }
    }

    @ObfuscatedName("dq.as([B[IIIIIIILdq;)I")
    public static int method2002(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class119 arg8) {
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
        arg8.field1683 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dq.ab(I[B[IIIIIIIILdq;)I")
    public static int method2003(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class119 arg10) {
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
        arg10.field1683 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dq.ap([B[IIIIIIILdq;)I")
    public static int method2004(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class119 arg8) {
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
        arg8.field1683 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dq.ai(I[B[IIIIIIIILdq;)I")
    public static int method2005(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class119 arg10) {
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
        arg10.field1683 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dq.an(II[B[IIIIIIILdq;II)I")
    public static int method2112(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class119 arg10, int arg11, int arg12) {
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
        arg10.field1683 = arg4;
        return arg5;
    }

    @ObfuscatedName("dq.ar(II[B[IIIIIIIILdq;II)I")
    public static int method2071(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class119 arg11, int arg12, int arg13) {
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
        arg11.field1683 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dq.aj(II[B[IIIIIIILdq;II)I")
    public static int method2008(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class119 arg10, int arg11, int arg12) {
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
        arg10.field1683 = arg4;
        return arg5;
    }

    @ObfuscatedName("dq.aa(II[B[IIIIIIIILdq;II)I")
    public static int method2009(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class119 arg11, int arg12, int arg13) {
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
        arg11.field1683 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dq.bn([B[IIIIIIIILdq;)I")
    public static int method2010(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class119 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1692 += (var14 - arg3) * arg9.field1688;
        arg9.field1684 += (var14 - arg3) * arg9.field1691;
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
        arg9.field1685 = var12 >> 2;
        arg9.field1683 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dq.bo(I[B[IIIIIIIIIILdq;)I")
    public static int method2011(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class119 arg12) {
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
        arg12.field1685 += (var19 - arg4) * arg12.field1690;
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
        arg12.field1692 = var15 >> 2;
        arg12.field1684 = var16 >> 2;
        arg12.field1683 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dq.bq([B[IIIIIIIILdq;)I")
    public static int method2012(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class119 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1692 += (var14 - arg3) * arg9.field1688;
        arg9.field1684 += (var14 - arg3) * arg9.field1691;
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
        arg9.field1685 = var12 >> 2;
        arg9.field1683 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dq.ba(I[B[IIIIIIIIIILdq;)I")
    public static int method2016(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class119 arg12) {
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
        arg12.field1685 += (var19 - arg4) * arg12.field1690;
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
        arg12.field1692 = var15 >> 2;
        arg12.field1684 = var16 >> 2;
        arg12.field1683 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dq.bg(II[B[IIIIIIIILdq;II)I")
    public static int method2014(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class119 arg11, int arg12, int arg13) {
        arg11.field1692 -= arg11.field1688 * arg5;
        arg11.field1684 -= arg11.field1691 * arg5;
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
        arg11.field1692 += arg11.field1688 * arg5;
        arg11.field1684 += arg11.field1691 * arg5;
        arg11.field1685 = arg6;
        arg11.field1683 = arg4;
        return arg5;
    }

    @ObfuscatedName("dq.bd(II[B[IIIIIIIIIILdq;II)I")
    public static int method2015(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class119 arg13, int arg14, int arg15) {
        arg13.field1685 -= arg13.field1690 * arg5;
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
        arg13.field1685 += arg13.field1690 * var27;
        arg13.field1692 = arg6;
        arg13.field1684 = arg7;
        arg13.field1683 = arg4;
        return var27;
    }

    @ObfuscatedName("dq.bp(II[B[IIIIIIIILdq;II)I")
    public static int method1978(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class119 arg11, int arg12, int arg13) {
        arg11.field1692 -= arg11.field1688 * arg5;
        arg11.field1684 -= arg11.field1691 * arg5;
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
        arg11.field1692 += arg11.field1688 * arg5;
        arg11.field1684 += arg11.field1691 * arg5;
        arg11.field1685 = arg6;
        arg11.field1683 = arg4;
        return arg5;
    }

    @ObfuscatedName("dq.bi(II[B[IIIIIIIIIILdq;II)I")
    public static int method2017(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class119 arg13, int arg14, int arg15) {
        arg13.field1685 -= arg13.field1690 * arg5;
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
        arg13.field1685 += arg13.field1690 * var26;
        arg13.field1692 = arg6;
        arg13.field1684 = arg7;
        arg13.field1683 = arg4;
        return var26;
    }
}
