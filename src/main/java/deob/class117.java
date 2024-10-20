package deob;

@ObfuscatedName("dt")
public class class117 extends class119 {

    @ObfuscatedName("dt.n")
    public int field1603;

    @ObfuscatedName("dt.v")
    public int field1612;

    @ObfuscatedName("dt.y")
    public int field1604;

    @ObfuscatedName("dt.r")
    public int field1605;

    @ObfuscatedName("dt.h")
    public int field1606;

    @ObfuscatedName("dt.d")
    public int field1602;

    @ObfuscatedName("dt.s")
    public int field1613;

    @ObfuscatedName("dt.b")
    public int field1609;

    @ObfuscatedName("dt.e")
    public int field1608;

    @ObfuscatedName("dt.f")
    public int field1611;

    @ObfuscatedName("dt.z")
    public boolean field1610;

    @ObfuscatedName("dt.u")
    public int field1607;

    @ObfuscatedName("dt.p")
    public int field1614;

    @ObfuscatedName("dt.t")
    public int field1615;

    @ObfuscatedName("dt.o")
    public int field1616;

    @ObfuscatedName("dt.n(II)I")
    public static int method2040(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dt.v(II)I")
    public static int method1995(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dt.bq()I")
    public int method1998() {
        int var1 = this.field1606 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1609 == 0) {
            var2 -= this.field1603 * var2 / (((class107) this.field1632).field1523.length << 8);
        } else if (this.field1609 >= 0) {
            var2 -= this.field1608 * var2 / ((class107) this.field1632).field1523.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class117(class107 arg0, int arg1, int arg2) {
        this.field1632 = arg0;
        this.field1608 = arg0.field1522;
        this.field1611 = arg0.field1525;
        this.field1610 = arg0.field1526;
        this.field1612 = arg1;
        this.field1604 = arg2;
        this.field1605 = 8192;
        this.field1603 = 0;
        this.method1994();
    }

    public class117(class107 arg0, int arg1, int arg2, int arg3) {
        this.field1632 = arg0;
        this.field1608 = arg0.field1522;
        this.field1611 = arg0.field1525;
        this.field1610 = arg0.field1526;
        this.field1612 = arg1;
        this.field1604 = arg2;
        this.field1605 = arg3;
        this.field1603 = 0;
        this.method1994();
    }

    @ObfuscatedName("dt.y(Ldp;II)Ldt;")
    public static class117 method2087(class107 arg0, int arg1, int arg2) {
        return arg0.field1523 == null || arg0.field1523.length == 0 ? null : new class117(arg0, (int) ((long) arg0.field1524 * 256L * (long) arg1 / (long) (Statics.field1542 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dt.r(Ldp;III)Ldt;")
    public static class117 method2101(class107 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1523 == null || arg0.field1523.length == 0 ? null : new class117(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dt.h()V")
    public void method1994() {
        this.field1606 = this.field1604;
        this.field1602 = method2040(this.field1604, this.field1605);
        this.field1613 = method1995(this.field1604, this.field1605);
    }

    @ObfuscatedName("dt.f(I)V")
    public synchronized void method2001(int arg0) {
        this.field1609 = arg0;
    }

    @ObfuscatedName("dt.t(I)V")
    public synchronized void method2002(int arg0) {
        this.method2004(arg0 << 6, this.method2006());
    }

    @ObfuscatedName("dt.o(I)V")
    public synchronized void method2003(int arg0) {
        this.method2004(arg0, this.method2006());
    }

    @ObfuscatedName("dt.a(II)V")
    public synchronized void method2004(int arg0, int arg1) {
        this.field1604 = arg0;
        this.field1605 = arg1;
        this.field1607 = 0;
        this.method1994();
    }

    @ObfuscatedName("dt.i()I")
    public synchronized int method2014() {
        return this.field1604 == Integer.MIN_VALUE ? 0 : this.field1604;
    }

    @ObfuscatedName("dt.m()I")
    public synchronized int method2006() {
        return this.field1605 < 0 ? -1 : this.field1605;
    }

    @ObfuscatedName("dt.x(I)V")
    public synchronized void method2051(int arg0) {
        int var2 = ((class107) this.field1632).field1523.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1603 = arg0;
    }

    @ObfuscatedName("dt.j(Z)V")
    public synchronized void method2008(boolean arg0) {
        this.field1612 = (this.field1612 >>> 31) + (this.field1612 ^ this.field1612 >> 31);
        if (arg0) {
            this.field1612 = -this.field1612;
        }
    }

    @ObfuscatedName("dt.g()V")
    public void method2103() {
        if (this.field1607 == 0) {
            return;
        }
        if (this.field1604 == Integer.MIN_VALUE) {
            this.field1604 = 0;
        }
        this.field1607 = 0;
        this.method1994();
    }

    @ObfuscatedName("dt.c(II)V")
    public synchronized void method2010(int arg0, int arg1) {
        this.method2075(arg0, arg1, this.method2006());
    }

    @ObfuscatedName("dt.k(III)V")
    public synchronized void method2075(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2004(arg1, arg2);
            return;
        }
        int var4 = method2040(arg1, arg2);
        int var5 = method1995(arg1, arg2);
        if (this.field1602 == var4 && this.field1613 == var5) {
            this.field1607 = 0;
            return;
        }
        int var6 = arg1 - this.field1606;
        if (this.field1606 - arg1 > var6) {
            var6 = this.field1606 - arg1;
        }
        if (var4 - this.field1602 > var6) {
            var6 = var4 - this.field1602;
        }
        if (this.field1602 - var4 > var6) {
            var6 = this.field1602 - var4;
        }
        if (var5 - this.field1613 > var6) {
            var6 = var5 - this.field1613;
        }
        if (this.field1613 - var5 > var6) {
            var6 = this.field1613 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1607 = arg0;
        this.field1604 = arg1;
        this.field1605 = arg2;
        this.field1614 = (arg1 - this.field1606) / arg0;
        this.field1615 = (var4 - this.field1602) / arg0;
        this.field1616 = (var5 - this.field1613) / arg0;
    }

    @ObfuscatedName("dt.q(I)V")
    public synchronized void method2011(int arg0) {
        if (arg0 == 0) {
            this.method2003(0);
            this.method3474();
        } else if (this.field1602 == 0 && this.field1613 == 0) {
            this.field1607 = 0;
            this.field1604 = 0;
            this.field1606 = 0;
            this.method3474();
        } else {
            int var2 = -this.field1606;
            if (this.field1606 > var2) {
                var2 = this.field1606;
            }
            if (-this.field1602 > var2) {
                var2 = -this.field1602;
            }
            if (this.field1602 > var2) {
                var2 = this.field1602;
            }
            if (-this.field1613 > var2) {
                var2 = -this.field1613;
            }
            if (this.field1613 > var2) {
                var2 = this.field1613;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1607 = arg0;
            this.field1604 = Integer.MIN_VALUE;
            this.field1614 = -this.field1606 / arg0;
            this.field1615 = -this.field1602 / arg0;
            this.field1616 = -this.field1613 / arg0;
        }
    }

    @ObfuscatedName("dt.ac(I)V")
    public synchronized void method2022(int arg0) {
        if (this.field1612 < 0) {
            this.field1612 = -arg0;
        } else {
            this.field1612 = arg0;
        }
    }

    @ObfuscatedName("dt.aw()I")
    public synchronized int method2017() {
        return this.field1612 < 0 ? -this.field1612 : this.field1612;
    }

    @ObfuscatedName("dt.at()Z")
    public boolean method1996() {
        return this.field1603 < 0 || this.field1603 >= ((class107) this.field1632).field1523.length << 8;
    }

    @ObfuscatedName("dt.ag()Z")
    public boolean method2012() {
        return this.field1607 != 0;
    }

    @ObfuscatedName("dt.d()Ldk;")
    public class119 method1779() {
        return null;
    }

    @ObfuscatedName("dt.s()Ldk;")
    public class119 method1778() {
        return null;
    }

    @ObfuscatedName("dt.b()I")
    public int method1815() {
        return this.field1604 == 0 && this.field1607 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dt.e([III)V")
    public synchronized void method1780(int[] arg0, int arg1, int arg2) {
        if (this.field1604 == 0 && this.field1607 == 0) {
            this.method1799(arg2);
            return;
        }
        class107 var4 = (class107) this.field1632;
        int var5 = this.field1608 << 8;
        int var6 = this.field1611 << 8;
        int var7 = var4.field1523.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1609 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1603 < 0) {
            if (this.field1612 <= 0) {
                this.method2103();
                this.method3474();
                return;
            }
            this.field1603 = 0;
        }
        if (this.field1603 >= var7) {
            if (this.field1612 >= 0) {
                this.method2103();
                this.method3474();
                return;
            }
            this.field1603 = var7 - 1;
        }
        if (this.field1609 >= 0) {
            if (this.field1609 > 0) {
                if (this.field1610) {
                    label131: {
                        if (this.field1612 < 0) {
                            var9 = this.method2020(arg0, arg1, var5, var10, var4.field1523[this.field1608]);
                            if (this.field1603 >= var5) {
                                return;
                            }
                            this.field1603 = var5 + var5 - 1 - this.field1603;
                            this.field1612 = -this.field1612;
                            if (--this.field1609 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2019(arg0, var9, var6, var10, var4.field1523[this.field1611 - 1]);
                            if (this.field1603 < var6) {
                                return;
                            }
                            this.field1603 = var6 + var6 - 1 - this.field1603;
                            this.field1612 = -this.field1612;
                            if (--this.field1609 == 0) {
                                break;
                            }
                            var9 = this.method2020(arg0, var9, var5, var10, var4.field1523[this.field1608]);
                            if (this.field1603 >= var5) {
                                return;
                            }
                            this.field1603 = var5 + var5 - 1 - this.field1603;
                            this.field1612 = -this.field1612;
                        } while (--this.field1609 != 0);
                    }
                } else if (this.field1612 < 0) {
                    while (true) {
                        var9 = this.method2020(arg0, var9, var5, var10, var4.field1523[this.field1611 - 1]);
                        if (this.field1603 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1603) / var8;
                        if (var12 >= this.field1609) {
                            this.field1603 += this.field1609 * var8;
                            this.field1609 = 0;
                            break;
                        }
                        this.field1603 += var8 * var12;
                        this.field1609 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2019(arg0, var9, var6, var10, var4.field1523[this.field1608]);
                        if (this.field1603 < var6) {
                            return;
                        }
                        int var13 = (this.field1603 - var5) / var8;
                        if (var13 >= this.field1609) {
                            this.field1603 -= this.field1609 * var8;
                            this.field1609 = 0;
                            break;
                        }
                        this.field1603 -= var8 * var13;
                        this.field1609 -= var13;
                    }
                }
            }
            if (this.field1612 < 0) {
                this.method2020(arg0, var9, 0, var10, 0);
                if (this.field1603 < 0) {
                    this.field1603 = -1;
                    this.method2103();
                    this.method3474();
                }
            } else {
                this.method2019(arg0, var9, var7, var10, 0);
                if (this.field1603 >= var7) {
                    this.field1603 = var7;
                    this.method2103();
                    this.method3474();
                }
            }
        } else if (this.field1610) {
            if (this.field1612 < 0) {
                var9 = this.method2020(arg0, arg1, var5, var10, var4.field1523[this.field1608]);
                if (this.field1603 >= var5) {
                    return;
                }
                this.field1603 = var5 + var5 - 1 - this.field1603;
                this.field1612 = -this.field1612;
            }
            while (true) {
                int var11 = this.method2019(arg0, var9, var6, var10, var4.field1523[this.field1611 - 1]);
                if (this.field1603 < var6) {
                    return;
                }
                this.field1603 = var6 + var6 - 1 - this.field1603;
                this.field1612 = -this.field1612;
                var9 = this.method2020(arg0, var11, var5, var10, var4.field1523[this.field1608]);
                if (this.field1603 >= var5) {
                    return;
                }
                this.field1603 = var5 + var5 - 1 - this.field1603;
                this.field1612 = -this.field1612;
            }
        } else if (this.field1612 < 0) {
            while (true) {
                var9 = this.method2020(arg0, var9, var5, var10, var4.field1523[this.field1611 - 1]);
                if (this.field1603 >= var5) {
                    return;
                }
                this.field1603 = var6 - 1 - (var6 - 1 - this.field1603) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2019(arg0, var9, var6, var10, var4.field1523[this.field1608]);
                if (this.field1603 < var6) {
                    return;
                }
                this.field1603 = (this.field1603 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dt.u(I)V")
    public synchronized void method1799(int arg0) {
        if (this.field1607 > 0) {
            if (arg0 >= this.field1607) {
                if (this.field1604 == Integer.MIN_VALUE) {
                    this.field1604 = 0;
                    this.field1613 = 0;
                    this.field1602 = 0;
                    this.field1606 = 0;
                    this.method3474();
                    arg0 = this.field1607;
                }
                this.field1607 = 0;
                this.method1994();
            } else {
                this.field1606 += this.field1614 * arg0;
                this.field1602 += this.field1615 * arg0;
                this.field1613 += this.field1616 * arg0;
                this.field1607 -= arg0;
            }
        }
        class107 var2 = (class107) this.field1632;
        int var3 = this.field1608 << 8;
        int var4 = this.field1611 << 8;
        int var5 = var2.field1523.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1609 = 0;
        }
        if (this.field1603 < 0) {
            if (this.field1612 <= 0) {
                this.method2103();
                this.method3474();
                return;
            }
            this.field1603 = 0;
        }
        if (this.field1603 >= var5) {
            if (this.field1612 >= 0) {
                this.method2103();
                this.method3474();
                return;
            }
            this.field1603 = var5 - 1;
        }
        this.field1603 += this.field1612 * arg0;
        if (this.field1609 >= 0) {
            if (this.field1609 > 0) {
                if (this.field1610) {
                    label121: {
                        if (this.field1612 < 0) {
                            if (this.field1603 >= var3) {
                                return;
                            }
                            this.field1603 = var3 + var3 - 1 - this.field1603;
                            this.field1612 = -this.field1612;
                            if (--this.field1609 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1603 < var4) {
                                return;
                            }
                            this.field1603 = var4 + var4 - 1 - this.field1603;
                            this.field1612 = -this.field1612;
                            if (--this.field1609 == 0) {
                                break;
                            }
                            if (this.field1603 >= var3) {
                                return;
                            }
                            this.field1603 = var3 + var3 - 1 - this.field1603;
                            this.field1612 = -this.field1612;
                        } while (--this.field1609 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1612 < 0) {
                            if (this.field1603 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1603) / var6;
                            if (var7 >= this.field1609) {
                                this.field1603 += this.field1609 * var6;
                                this.field1609 = 0;
                                break label153;
                            }
                            this.field1603 += var6 * var7;
                            this.field1609 -= var7;
                        } else if (this.field1603 >= var4) {
                            int var8 = (this.field1603 - var3) / var6;
                            if (var8 >= this.field1609) {
                                this.field1603 -= this.field1609 * var6;
                                this.field1609 = 0;
                                break label153;
                            }
                            this.field1603 -= var6 * var8;
                            this.field1609 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1612 < 0) {
                if (this.field1603 < 0) {
                    this.field1603 = -1;
                    this.method2103();
                    this.method3474();
                }
            } else if (this.field1603 >= var5) {
                this.field1603 = var5;
                this.method2103();
                this.method3474();
            }
        } else if (this.field1610) {
            if (this.field1612 < 0) {
                if (this.field1603 >= var3) {
                    return;
                }
                this.field1603 = var3 + var3 - 1 - this.field1603;
                this.field1612 = -this.field1612;
            }
            while (this.field1603 >= var4) {
                this.field1603 = var4 + var4 - 1 - this.field1603;
                this.field1612 = -this.field1612;
                if (this.field1603 >= var3) {
                    return;
                }
                this.field1603 = var3 + var3 - 1 - this.field1603;
                this.field1612 = -this.field1612;
            }
        } else if (this.field1612 < 0) {
            if (this.field1603 >= var3) {
                return;
            }
            this.field1603 = var4 - 1 - (var4 - 1 - this.field1603) % var6;
        } else if (this.field1603 >= var4) {
            this.field1603 = (this.field1603 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dt.ad([IIIII)I")
    public int method2019(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1607 > 0) {
                int var6 = this.field1607 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1607 += arg1;
                if (this.field1612 == 256 && (this.field1603 & 0xFF) == 0) {
                    if (Statics.field13) {
                        arg1 = method2085(0, ((class107) this.field1632).field1523, arg0, this.field1603, arg1, this.field1602, this.field1613, this.field1615, this.field1616, 0, var6, arg2, this);
                    } else {
                        arg1 = method2029(((class107) this.field1632).field1523, arg0, this.field1603, arg1, this.field1606, this.field1614, 0, var6, arg2, this);
                    }
                } else if (Statics.field13) {
                    arg1 = method2034(0, 0, ((class107) this.field1632).field1523, arg0, this.field1603, arg1, this.field1602, this.field1613, this.field1615, this.field1616, 0, var6, arg2, this, this.field1612, arg4);
                } else {
                    arg1 = method2000(0, 0, ((class107) this.field1632).field1523, arg0, this.field1603, arg1, this.field1606, this.field1614, 0, var6, arg2, this, this.field1612, arg4);
                }
                this.field1607 -= arg1;
                if (this.field1607 != 0) {
                    return arg1;
                }
                if (!this.method2021()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1612 == 256 && (this.field1603 & 0xFF) == 0) {
                if (Statics.field13) {
                    return method2086(0, ((class107) this.field1632).field1523, arg0, this.field1603, arg1, this.field1602, this.field1613, 0, arg3, arg2, this);
                }
                return method2132(((class107) this.field1632).field1523, arg0, this.field1603, arg1, this.field1606, 0, arg3, arg2, this);
            }
            if (Statics.field13) {
                return method2026(0, 0, ((class107) this.field1632).field1523, arg0, this.field1603, arg1, this.field1602, this.field1613, 0, arg3, arg2, this, this.field1612, arg4);
            }
            return method2025(0, 0, ((class107) this.field1632).field1523, arg0, this.field1603, arg1, this.field1606, 0, arg3, arg2, this, this.field1612, arg4);
        }
    }

    @ObfuscatedName("dt.ak([IIIII)I")
    public int method2020(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1607 > 0) {
                int var6 = this.field1607 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1607 += arg1;
                if (this.field1612 == -256 && (this.field1603 & 0xFF) == 0) {
                    if (Statics.field13) {
                        arg1 = method2032(0, ((class107) this.field1632).field1523, arg0, this.field1603, arg1, this.field1602, this.field1613, this.field1615, this.field1616, 0, var6, arg2, this);
                    } else {
                        arg1 = method2031(((class107) this.field1632).field1523, arg0, this.field1603, arg1, this.field1606, this.field1614, 0, var6, arg2, this);
                    }
                } else if (Statics.field13) {
                    arg1 = method2036(0, 0, ((class107) this.field1632).field1523, arg0, this.field1603, arg1, this.field1602, this.field1613, this.field1615, this.field1616, 0, var6, arg2, this, this.field1612, arg4);
                } else {
                    arg1 = method2035(0, 0, ((class107) this.field1632).field1523, arg0, this.field1603, arg1, this.field1606, this.field1614, 0, var6, arg2, this, this.field1612, arg4);
                }
                this.field1607 -= arg1;
                if (this.field1607 != 0) {
                    return arg1;
                }
                if (!this.method2021()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1612 == -256 && (this.field1603 & 0xFF) == 0) {
                if (Statics.field13) {
                    return method2016(0, ((class107) this.field1632).field1523, arg0, this.field1603, arg1, this.field1602, this.field1613, 0, arg3, arg2, this);
                }
                return method2024(((class107) this.field1632).field1523, arg0, this.field1603, arg1, this.field1606, 0, arg3, arg2, this);
            }
            if (Statics.field13) {
                return method2028(0, 0, ((class107) this.field1632).field1523, arg0, this.field1603, arg1, this.field1602, this.field1613, 0, arg3, arg2, this, this.field1612, arg4);
            }
            return method2027(0, 0, ((class107) this.field1632).field1523, arg0, this.field1603, arg1, this.field1606, 0, arg3, arg2, this, this.field1612, arg4);
        }
    }

    @ObfuscatedName("dt.as()Z")
    public boolean method2021() {
        int var1 = this.field1604;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2040(var1, this.field1605);
            var2 = method1995(var1, this.field1605);
        }
        if (this.field1606 != var1 || this.field1602 != var3 || this.field1613 != var2) {
            if (this.field1606 < var1) {
                this.field1614 = 1;
                this.field1607 = var1 - this.field1606;
            } else if (this.field1606 > var1) {
                this.field1614 = -1;
                this.field1607 = this.field1606 - var1;
            } else {
                this.field1614 = 0;
            }
            if (this.field1602 < var3) {
                this.field1615 = 1;
                if (this.field1607 == 0 || this.field1607 > var3 - this.field1602) {
                    this.field1607 = var3 - this.field1602;
                }
            } else if (this.field1602 > var3) {
                this.field1615 = -1;
                if (this.field1607 == 0 || this.field1607 > this.field1602 - var3) {
                    this.field1607 = this.field1602 - var3;
                }
            } else {
                this.field1615 = 0;
            }
            if (this.field1613 < var2) {
                this.field1616 = 1;
                if (this.field1607 == 0 || this.field1607 > var2 - this.field1613) {
                    this.field1607 = var2 - this.field1613;
                }
            } else if (this.field1613 > var2) {
                this.field1616 = -1;
                if (this.field1607 == 0 || this.field1607 > this.field1613 - var2) {
                    this.field1607 = this.field1613 - var2;
                }
            } else {
                this.field1616 = 0;
            }
            return false;
        } else if (this.field1604 == Integer.MIN_VALUE) {
            this.field1604 = 0;
            this.field1613 = 0;
            this.field1602 = 0;
            this.field1606 = 0;
            this.method3474();
            return true;
        } else {
            this.method1994();
            return false;
        }
    }

    @ObfuscatedName("dt.bg([B[IIIIIIILdt;)I")
    public static int method2132(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class117 arg8) {
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
        arg8.field1603 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dt.bk(I[B[IIIIIIIILdt;)I")
    public static int method2086(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10) {
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
        arg10.field1603 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dt.by([B[IIIIIIILdt;)I")
    public static int method2024(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class117 arg8) {
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
        arg8.field1603 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dt.bz(I[B[IIIIIIIILdt;)I")
    public static int method2016(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10) {
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
        arg10.field1603 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dt.bj(II[B[IIIIIIILdt;II)I")
    public static int method2025(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10, int arg11, int arg12) {
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
        arg10.field1603 = arg4;
        return arg5;
    }

    @ObfuscatedName("dt.bd(II[B[IIIIIIIILdt;II)I")
    public static int method2026(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
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
        arg11.field1603 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dt.bi(II[B[IIIIIIILdt;II)I")
    public static int method2027(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10, int arg11, int arg12) {
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
        arg10.field1603 = arg4;
        return arg5;
    }

    @ObfuscatedName("dt.bo(II[B[IIIIIIIILdt;II)I")
    public static int method2028(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
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
        arg11.field1603 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dt.bx([B[IIIIIIIILdt;)I")
    public static int method2029(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class117 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1602 += (var14 - arg3) * arg9.field1615;
        arg9.field1613 += (var14 - arg3) * arg9.field1616;
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
        arg9.field1606 = var12 >> 2;
        arg9.field1603 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dt.bu(I[B[IIIIIIIIIILdt;)I")
    public static int method2085(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class117 arg12) {
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
        arg12.field1606 += (var19 - arg4) * arg12.field1614;
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
        arg12.field1602 = var15 >> 2;
        arg12.field1613 = var16 >> 2;
        arg12.field1603 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dt.bt([B[IIIIIIIILdt;)I")
    public static int method2031(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class117 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1602 += (var14 - arg3) * arg9.field1615;
        arg9.field1613 += (var14 - arg3) * arg9.field1616;
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
        arg9.field1606 = var12 >> 2;
        arg9.field1603 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dt.be(I[B[IIIIIIIIIILdt;)I")
    public static int method2032(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class117 arg12) {
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
        arg12.field1606 += (var19 - arg4) * arg12.field1614;
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
        arg12.field1602 = var15 >> 2;
        arg12.field1613 = var16 >> 2;
        arg12.field1603 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dt.ba(II[B[IIIIIIIILdt;II)I")
    public static int method2000(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
        arg11.field1602 -= arg11.field1615 * arg5;
        arg11.field1613 -= arg11.field1616 * arg5;
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
        arg11.field1602 += arg11.field1615 * arg5;
        arg11.field1613 += arg11.field1616 * arg5;
        arg11.field1606 = arg6;
        arg11.field1603 = arg4;
        return arg5;
    }

    @ObfuscatedName("dt.bw(II[B[IIIIIIIIIILdt;II)I")
    public static int method2034(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class117 arg13, int arg14, int arg15) {
        arg13.field1606 -= arg13.field1614 * arg5;
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
        arg13.field1606 += arg13.field1614 * var27;
        arg13.field1602 = arg6;
        arg13.field1613 = arg7;
        arg13.field1603 = arg4;
        return var27;
    }

    @ObfuscatedName("dt.bp(II[B[IIIIIIIILdt;II)I")
    public static int method2035(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
        arg11.field1602 -= arg11.field1615 * arg5;
        arg11.field1613 -= arg11.field1616 * arg5;
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
        arg11.field1602 += arg11.field1615 * arg5;
        arg11.field1613 += arg11.field1616 * arg5;
        arg11.field1606 = arg6;
        arg11.field1603 = arg4;
        return arg5;
    }

    @ObfuscatedName("dt.bn(II[B[IIIIIIIIIILdt;II)I")
    public static int method2036(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class117 arg13, int arg14, int arg15) {
        arg13.field1606 -= arg13.field1614 * arg5;
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
        arg13.field1606 += arg13.field1614 * var26;
        arg13.field1602 = arg6;
        arg13.field1613 = arg7;
        arg13.field1603 = arg4;
        return var26;
    }
}
