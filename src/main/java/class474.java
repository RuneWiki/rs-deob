import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class474 extends class133 {

    @OriginalMember(owner = "client!si", name = "B", descriptor = "Lj;")
    private class207 field6666;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "S")
    private short field6670;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "S")
    private short field6668;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "S")
    private short field6663;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "S")
    private short field6671;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "S")
    private short field6664;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "I")
    private int field6669;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    private int field6667;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "S")
    private short field6665;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(JI)V", line = 4)
    public final void method2805(long arg0, int arg1) {
        this.field6670 = (short) (this.field6670 - arg1);
        if (this.field6670 <= 0) {
            this.method2808();
        } else {
            int var4 = super.field1862 >> class198.field2931;
            int var5 = super.field1863 >> class198.field2931;
            int var6 = super.field1864 >> class198.field2931;
            class113 var7 = this.field6666.field3030;
            class475 var8 = this.field6666.field3021;
            if (var8.field6694 != 0) {
                if (this.field6668 - this.field6670 <= var8.field6718) {
                    int var9 = var8.field6725 * arg1 + (this.field6667 >> 16 & 255) + (super.field1869 >> 8 & 65280);
                    int var10 = var8.field6678 * arg1 + (this.field6667 >> 8 & 255) + (super.field1869 & 65280);
                    int var11 = var8.field6704 * arg1 + (super.field1869 << 8 & 65280) + (this.field6667 & 255);
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > 65535) {
                        var9 = 65535;
                    }
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 65535) {
                        var10 = 65535;
                    }
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 65535) {
                        var11 = 65535;
                    }
                    super.field1869 &= -16777216;
                    super.field1869 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field6667 &= -16777216;
                    this.field6667 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field6668 - this.field6670 <= var8.field6681) {
                    int var12 = var8.field6696 * arg1 + (this.field6667 >> 24 & 255) + (super.field1869 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field1869 &= 16777215;
                    super.field1869 |= (var12 & 65280) << 16;
                    this.field6667 &= 16777215;
                    this.field6667 |= (var12 & 255) << 24;
                }
            }
            if (var8.field6710 != -1 && this.field6668 - this.field6670 <= var8.field6674) {
                this.field6669 += var8.field6735 * arg1;
            }
            if (var8.field6715 != -1 && this.field6668 - this.field6670 <= var8.field6738) {
                super.field1870 += var8.field6675 * arg1;
            }
            int var13 = this.field6663;
            int var14 = this.field6671;
            int var15 = this.field6664;
            boolean var16 = false;
            if (var8.field6719 == 1) {
                int var17 = var4 - this.field6666.field3043;
                int var18 = var5 - this.field6666.field3020;
                int var19 = var6 - this.field6666.field3028;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field6705 * var20 * arg1);
                this.field6669 = (int) ((long) this.field6669 - ((long) this.field6669 * var21 >> 18));
            } else if (var8.field6719 == 2) {
                int var23 = var4 - this.field6666.field3043;
                int var24 = var5 - this.field6666.field3020;
                int var25 = var6 - this.field6666.field3028;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field6705 * var26 * arg1);
                this.field6669 = (int) ((long) this.field6669 - ((long) this.field6669 * var27 >> 28));
            }
            if (var8.field6731 != null) {
                class449 var29 = var7.field1587.field1299;
                for (class449 var30 = var29.field6385; var29 != var30; var30 = var30.field6385) {
                    class190 var31 = (class190) var30;
                    class184 var32 = var31.field2849;
                    if (var32.field2771 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field6731.length; ++var34) {
                            if (var8.field6731[var34] == var32.field2773) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field2857;
                            int var36 = var5 - var31.field2848;
                            int var37 = var6 - var31.field2855;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field2767) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field2850 * var37 + var31.field2854 * var35 + var32.field2772 * var36) * 65535L / (long) (var32.field2775 * var40);
                                if (var41 >= (long) var32.field2763) {
                                    int var43 = 0;
                                    if (var32.field2769 == 1) {
                                        var43 = (var40 >> 4) * var32.field2778;
                                    } else if (var32.field2769 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field2778;
                                    }
                                    if (var32.field2764 == 0) {
                                        if (var32.field2780 == 0) {
                                            var13 += (var31.field2854 - var43) * arg1;
                                            var14 += (var32.field2772 - var43) * arg1;
                                            var15 += (var31.field2850 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field1862 += (var31.field2854 - var43) * arg1;
                                            super.field1863 += (var32.field2772 - var43) * arg1;
                                            super.field1864 += (var31.field2850 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field2775;
                                        int var45 = (var36 << 15) / var40 * var32.field2775;
                                        int var46 = (var37 << 15) / var40 * var32.field2775;
                                        if (var32.field2780 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field1862 += arg1 * var44 >> 15;
                                            super.field1863 += arg1 * var45 >> 15;
                                            super.field1864 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field6707 != null) {
                for (int var47 = 0; var47 < var8.field6707.length; ++var47) {
                    class190 var48 = (class190) class268.field3928.method1904((long) var8.field6707[var47], 1);
                    while (var48 != null) {
                        class184 var49 = var48.field2849;
                        int var50 = var4 - var48.field2857;
                        int var51 = var5 - var48.field2848;
                        int var52 = var6 - var48.field2855;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field2767) {
                            var48 = (class190) class268.field3928.method1906(-1);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field2850 * var52 + var48.field2854 * var50 + var49.field2772 * var51) * 65535L / (long) (var49.field2775 * var55);
                            if (var56 < (long) var49.field2763) {
                                var48 = (class190) class268.field3928.method1906(-1);
                            } else {
                                int var58 = 0;
                                if (var49.field2769 == 1) {
                                    var58 = (var55 >> 4) * var49.field2778;
                                } else if (var49.field2769 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field2778;
                                }
                                if (var49.field2764 == 0) {
                                    if (var49.field2780 == 0) {
                                        var13 += (var48.field2854 - var58) * arg1;
                                        var14 += (var49.field2772 - var58) * arg1;
                                        var15 += (var48.field2850 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field1862 += (var48.field2854 - var58) * arg1;
                                        super.field1863 += (var49.field2772 - var58) * arg1;
                                        super.field1864 += (var48.field2850 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field2775;
                                    int var60 = (var51 << 15) / var55 * var49.field2775;
                                    int var61 = (var52 << 15) / var55 * var49.field2775;
                                    if (var49.field2780 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field1862 += arg1 * var59 >> 15;
                                        super.field1863 += arg1 * var60 >> 15;
                                        super.field1864 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class190) class268.field3928.method1906(-1);
                            }
                        }
                    }
                }
            }
            if (var8.field6690 != null) {
                if (var8.field6739 == null) {
                    var8.field6739 = new int[var8.field6690.length];
                    for (int var62 = 0; var62 < var8.field6690.length; ++var62) {
                        class389.method2361(var8.field6690[var62], (byte) -72);
                        var8.field6739[var62] = ((class478) class103.field1444.method1104(-128, (long) var8.field6690[var62])).field6789;
                    }
                }
                for (int var63 = 0; var63 < var8.field6739.length; ++var63) {
                    class184 var64 = class6.field43[var8.field6739[var63]];
                    if (var64.field2780 == 0) {
                        var13 += var64.field2779 * arg1;
                        var14 += var64.field2772 * arg1;
                        var15 += var64.field2762 * arg1;
                        var16 = true;
                    } else {
                        super.field1862 += var64.field2779 * arg1;
                        super.field1863 += var64.field2772 * arg1;
                        super.field1864 += var64.field2762 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field6663 = (short) var13;
                        this.field6671 = (short) var14;
                        this.field6664 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field6669 <<= 1;
                }
            }
            super.field1862 = (int) ((long) super.field1862 + ((long) this.field6663 * (long) this.field6669 >> 23) * (long) arg1);
            super.field1863 = (int) ((long) super.field1863 + ((long) this.field6671 * (long) this.field6669 >> 23) * (long) arg1);
            super.field1864 = (int) ((long) super.field1864 + ((long) this.field6664 * (long) this.field6669 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lj;IIIIIIIIIIIZ)V", line = 401)
    public final void method2806(class207 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field6666 = arg0;
        super.field1862 = arg1 << class198.field2931;
        super.field1863 = arg2 << class198.field2931;
        super.field1864 = arg3 << class198.field2931;
        super.field1869 = arg9;
        this.field6668 = this.field6670 = (short) arg8;
        super.field1870 = arg10;
        super.field1872 = arg11;
        this.field6663 = (short) arg4;
        this.field6671 = (short) arg5;
        this.field6664 = (short) arg6;
        this.field6669 = arg7;
        super.field1871 = this.field6666.field3024.field4168;
        this.method2809();
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(J)V", line = 420)
    public final void method2807(long arg0) {
        int var3 = super.field1862 >> 19;
        int var4 = super.field1864 >> 19;
        int var5 = super.field1863 >> class198.field2931;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class310.field4401 && var4 >= 0 && var4 < class97.field1374) {
            class113 var6 = this.field6666.field3030;
            class475 var7 = this.field6666.field3021;
            class241[] var8 = class340.field4692;
            int var9 = var8[var6.field1596].method591(var3, var4);
            int var10;
            if (var6.field1596 < class310.field4398 - 1) {
                var10 = var8[var6.field1596 + 1].method591(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field6737) {
                if (var7.field6698 == -1 && var5 > var9) {
                    this.method2808();
                    return;
                }
                if (var7.field6698 >= 0 && var5 > var8[var7.field6698].method591(var3, var4)) {
                    this.method2808();
                    return;
                }
                if (var7.field6682 == -1 && var5 < var10) {
                    this.method2808();
                    return;
                }
                if (var7.field6682 >= 0 && var5 < var8[var7.field6682 + 1].method591(var3, var4)) {
                    this.method2808();
                    return;
                }
            }
            if (var3 >= var6.field1593 && var3 <= var6.field1595 && var4 >= var6.field1592 && var4 <= var6.field1590 && var5 <= var9 && var5 >= var10) {
                var6.field1594.field5528.method2133(0, this);
            } else {
                int var11;
                for (var11 = class310.field4398 - 1; var11 > 0 && var5 > var8[var11].method591(var3, var4); --var11) {
                }
                if (class310.field4398 - 1 == var11 && var8[var11].method591(var3, var4) - var5 > 1024) {
                    this.method2808();
                } else {
                    class52 var12 = class385.field5285[var11][var3][var4];
                    if (var12 == null) {
                        boolean var13 = class385.field5285[0][var3][var4].field757 != null;
                        if (var11 == 3 && var13) {
                            this.method2808();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class385.field5285[var14][var3][var4] == null) {
                                var12 = class385.field5285[var14][var3][var4] = new class52(var14, var3, var4);
                                if (var13) {
                                    ++var12.field749;
                                }
                            }
                        }
                    }
                    if (var12.field766 == null) {
                        var12.field766 = new class404();
                        var12.field765 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field765) {
                        var12.field766 = new class404();
                        var12.field765 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field766.field5528.method2133(0, this);
                }
            }
        } else {
            this.method2808();
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "()V", line = 543)
    private final void method2808() {
        this.field6666.field3030.field1583[this.field6665] = null;
        class163.field2378[class189.field2811] = this;
        class189.field2811 = class189.field2811 + 1 & 1023;
        this.method2003(1);
        this.method2212(-2207);
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "()V", line = 551)
    private final void method2809() {
        int var1 = this.field6666.field3030.field1584;
        if (this.field6666.field3030.field1583[var1] != null) {
            this.field6666.field3030.field1583[var1].method2808();
        }
        this.field6666.field3030.field1583[var1] = this;
        this.field6665 = (short) this.field6666.field3030.field1584;
        this.field6666.field3030.field1584 = var1 + 1 & 8191;
        this.field6666.field3045.method1765(122, this);
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lj;IIIIIIIIIIIZ)V", line = 560)
    public class474(class207 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field6666 = arg0;
        super.field1862 = arg1 << class198.field2931;
        super.field1863 = arg2 << class198.field2931;
        super.field1864 = arg3 << class198.field2931;
        super.field1869 = arg9;
        this.field6668 = this.field6670 = (short) arg8;
        super.field1870 = arg10;
        super.field1872 = arg11;
        this.field6663 = (short) arg4;
        this.field6671 = (short) arg5;
        this.field6664 = (short) arg6;
        this.field6669 = arg7;
        super.field1871 = this.field6666.field3024.field4168;
        this.method2809();
    }
}
