import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class228 extends class242 {

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    private int field3933 = 0;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
    private int field3936 = 0;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "I")
    private int field3939 = 0;

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "Lp;")
    public static class280 field3948 = class18.method140((byte) -126, "m");

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "Lp;")
    private static class280 field3942 = class18.method140((byte) -128, "Loaded wordpack");

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "Lp;")
    public static class280 field3940 = field3942;

    @OriginalMember(owner = "client!ra", name = "mb", descriptor = "[J")
    public static long[] field3954 = new long[32];

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "I")
    private int field3937;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
    private int field3938;

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "I")
    private int field3941;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "I")
    private int field3946;

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
    private int field3951;

    @OriginalMember(owner = "client!ra", name = "kb", descriptor = "I")
    private int field3952;

    @OriginalMember(owner = "client!ra", name = "lb", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!ra", name = "ib", descriptor = "Lai;")
    public static class86 field3950;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        ++field3943;
        if (arg0 >= -119) {
            this.method49(85, -122, (class25) null);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field3939 = (arg2.method200(32768) << 12) / 100;
                }
            } else {
                this.field3936 = (arg2.method200(32768) << 12) / 100;
            }
        } else {
            this.field3933 = arg2.method191(31);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIILrk;IJIIII)Z")
    public static final boolean method1533(int arg0, int arg1, int arg2, int arg3, class265 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class74.method560(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class228() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBII)V")
    private final void method1534(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = ~arg0 < ~arg3 ? arg0 : arg3;
        int var6 = ~arg0 > ~arg3 ? arg0 : arg3;
        int var7 = ~arg2 <= ~var6 ? var6 : arg2;
        ++field3944;
        int var8 = var5 >= arg2 ? var5 : arg2;
        int var9 = var8 - var7;
        if (~var9 < -1) {
            int var10 = (var8 - arg0 << 12) / var9;
            int var11 = (var8 - arg2 << 12) / var9;
            int var12 = (-arg3 + var8 << 12) / var9;
            if (arg0 != var8) {
                if (~arg3 == ~var8) {
                    this.field3946 = ~arg2 == ~var7 ? var10 + 4096 : -var11 + 12288;
                } else {
                    this.field3946 = arg0 != var7 ? -var10 + 20480 : var12 + 12288;
                }
            } else {
                this.field3946 = arg3 == var7 ? 20480 - -var11 : 4096 - var12;
            }
            this.field3946 /= 6;
        } else {
            this.field3946 = 0;
        }
        int var13 = 28 / ((arg1 - -18) / 40);
        this.field3941 = (var7 + var8) / 2;
        if (this.field3941 > 0 && ~this.field3941 > -4097) {
            this.field3952 = (var9 << 12) / (~this.field3941 >= -2049 ? this.field3941 * 2 : 8192 - this.field3941 * 2);
        } else {
            this.field3952 = 0;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ltg;Ltg;B)V")
    public static final void method1535(class180 arg0, class180 arg1, byte arg2) {
        class1.field52 = arg1;
        int var3 = 29 % ((22 - arg2) / 51);
        class55.field904 = arg0;
        ++field3949;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        ++field3935;
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field4257.method917(arg1, 1);
            if (super.field4257.field2357) {
                int[][] var4 = this.method1648(26484, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var3[0];
                int[] var8 = var4[2];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class264.field4654 < ~var11; ++var11) {
                    this.method1534(var5[var11], (byte) -122, var8[var11], var6[var11]);
                    this.field3946 += this.field3933;
                    this.field3941 += this.field3939;
                    if (~this.field3941 > -1) {
                        this.field3941 = 0;
                    }
                    this.field3952 += this.field3936;
                    while (this.field3946 < 0) {
                        this.field3946 += 4096;
                    }
                    if (~this.field3952 > -1) {
                        this.field3952 = 0;
                    }
                    if (this.field3952 > 4096) {
                        this.field3952 = 4096;
                    }
                    while (~this.field3946 < -4097) {
                        this.field3946 -= 4096;
                    }
                    if (~this.field3941 < -4097) {
                        this.field3941 = 4096;
                    }
                    this.method1539(this.field3946, this.field3941, this.field3952, -25913);
                    var7[var11] = this.field3938;
                    var9[var11] = this.field3951;
                    var10[var11] = this.field3937;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)I")
    public static final int method1536(int arg0, int arg1) {
        ++field3945;
        if (arg1 > -67) {
            field3950 = null;
        }
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class93.field1507 = 0;
        ++field3953;
        int var7 = -1;
        if (arg0 != -27791) {
            field3942 = null;
        }
        while (~(class205.field3554 - -class112.field1845) < ~var7) {
            class277 var23;
            if (~var7 != 0) {
                if (class205.field3554 <= var7) {
                    var23 = class46.field756[class46.field767[-class205.field3554 + var7]];
                } else {
                    var23 = class280.field4940[class250.field4376[var7]];
                }
            } else {
                var23 = class262.field4631;
            }
            if (var23 != null && var23.method428(700)) {
                label369: {
                    if (var23 instanceof class61) {
                        class255 var24 = ((class61) var23).field987;
                        if (var24.field4516 != null) {
                            var24 = var24.method1717(false);
                        }
                        if (var24 == null) {
                            break label369;
                        }
                    }
                    if (class205.field3554 <= var7) {
                        class255 var25 = ((class61) var23).field987;
                        if (var25.field4516 != null) {
                            var25 = var25.method1717(false);
                        }
                        if (var25.field4476 >= 0 && ~class12.field244.length < ~var25.field4476) {
                            int var26;
                            if (~var25.field4458 == 0) {
                                var26 = 15 + var23.method1839((byte) -101);
                            } else {
                                var26 = var25.field4458 + 15;
                            }
                            class283.method1925(var26, arg2 >> 1, 0, arg3, arg1, arg6 >> 1, var23);
                            if (class261.field4619 > -1) {
                                class12.field244[var25.field4476].method758(class261.field4619 + arg4 + -12, class178.field3091 + arg5 - 30);
                            }
                        }
                        class249[] var27 = class81.field1335;
                        for (int var28 = 0; ~var28 > ~var27.length; ++var28) {
                            class249 var29 = var27[var28];
                            if (var29 != null && var29.field4366 == 1 && class46.field767[-class205.field3554 + var7] == var29.field4359 && ~(class117.field2104 % 20) > -11) {
                                int var30;
                                if (var25.field4458 != -1) {
                                    var30 = var25.field4458 + 15;
                                } else {
                                    var30 = var23.method1839((byte) -85) + 15;
                                }
                                class283.method1925(var30, arg2 >> 1, 0, arg3, arg1, arg6 >> 1, var23);
                                if (class261.field4619 > -1) {
                                    class64.field1080[var29.field4368].method758(class261.field4619 + arg4 + -12, class178.field3091 + arg5 - 28);
                                }
                            }
                        }
                    } else {
                        int var31 = 30;
                        class142 var32 = (class142) var23;
                        if (~var32.field2501 != 0 || ~var32.field2486 != 0) {
                            class283.method1925(15 + var23.method1839((byte) -122), arg2 >> 1, 0, arg3, arg1, arg6 >> 1, var23);
                            if (class261.field4619 > -1) {
                                if (~var32.field2501 != 0) {
                                    class49.field808[var32.field2501].method758(class261.field4619 + -12 + arg4, -var31 + arg5 + class178.field3091);
                                    var31 += 25;
                                }
                                if (var32.field2486 != -1) {
                                    class12.field244[var32.field2486].method758(arg4 - -class261.field4619 + -12, class178.field3091 + arg5 + -var31);
                                    var31 += 25;
                                }
                            }
                        }
                        if (var7 >= 0) {
                            class249[] var33 = class81.field1335;
                            for (int var34 = 0; ~var34 > ~var33.length; ++var34) {
                                class249 var35 = var33[var34];
                                if (var35 != null && var35.field4366 == 10 && class250.field4376[var7] == var35.field4359) {
                                    class283.method1925(15 + var23.method1839((byte) -94), arg2 >> 1, arg0 + 27791, arg3, arg1, arg6 >> 1, var23);
                                    if (~class261.field4619 < 0) {
                                        class64.field1080[var35.field4368].method758(arg4 - -class261.field4619 - 12, -var31 + class178.field3091 + arg5);
                                    }
                                }
                            }
                        }
                    }
                    if (var23.field4797 != null && (~class205.field3554 >= ~var7 || ~class161.field2823 == -1 || class161.field2823 == 3 || ~class161.field2823 == -2 && class66.method457(((class142) var23).field2458, true))) {
                        class283.method1925(var23.method1839((byte) -77), arg2 >> 1, 0, arg3, arg1, arg6 >> 1, var23);
                        if (class261.field4619 > -1 && class102.field1666 > class93.field1507) {
                            class102.field1676[class93.field1507] = class54.field890.method528(var23.field4797) / 2;
                            class102.field1682[class93.field1507] = class54.field890.field1154;
                            class102.field1689[class93.field1507] = class261.field4619;
                            class102.field1672[class93.field1507] = class178.field3091;
                            class102.field1692[class93.field1507] = var23.field4813;
                            class102.field1700[class93.field1507] = var23.field4799;
                            class102.field1698[class93.field1507] = var23.field4789;
                            class102.field1696[class93.field1507] = var23.field4797;
                            ++class93.field1507;
                        }
                    }
                    if (var23.field4835 > class117.field2104) {
                        class108 var36 = class75.field1244[0];
                        class108 var37 = class75.field1244[1];
                        int var41;
                        if (var23 instanceof class61) {
                            class61 var38 = (class61) var23;
                            class108[] var39 = (class108[]) class96.field1532.method1480((byte) 50, (long) var38.field987.field4521);
                            if (var39 == null) {
                                var39 = class44.method333(1, var38.field987.field4521, 0, class220.field3778);
                                if (var39 != null) {
                                    class96.field1532.method1483((byte) -102, (long) var38.field987.field4521, var39);
                                }
                            }
                            if (var39 != null && var39.length == 2) {
                                var36 = var39[0];
                                var37 = var39[1];
                            }
                            class255 var40 = var38.field987;
                            if (~var40.field4458 != 0) {
                                var41 = var40.field4458;
                            } else {
                                var41 = var23.method1839((byte) -120);
                            }
                        } else {
                            var41 = var23.method1839((byte) -90);
                        }
                        class283.method1925(var41 - -10 + var36.field1791, arg2 >> 1, 0, arg3, arg1, arg6 >> 1, var23);
                        if (~class261.field4619 < 0) {
                            int var42 = -(var36.field1785 >> 1) + class261.field4619 + arg4;
                            int var43 = arg5 - -class178.field3091 + -3;
                            var36.method758(var42, var43);
                            int var44 = var23.field4840 * var36.field1785 / 255;
                            int var45 = var36.field1791;
                            class151.method1059(var42, var43, var42 + var44, var43 + var45);
                            var37.method758(var42, var43);
                            class151.method1061(arg4, arg5, arg4 - -arg2, arg5 + arg6);
                        }
                    }
                    for (int var46 = 0; ~var46 > -5; ++var46) {
                        if (~class117.field2104 > ~var23.field4846[var46]) {
                            int var49;
                            if (var23 instanceof class61) {
                                class61 var47 = (class61) var23;
                                class255 var48 = var47.field987;
                                if (var48.field4458 == -1) {
                                    var49 = var23.method1839((byte) -110) / 2;
                                } else {
                                    var49 = var48.field4458 / 2;
                                }
                            } else {
                                var49 = var23.method1839((byte) -128) / 2;
                            }
                            class283.method1925(var49, arg2 >> 1, 0, arg3, arg1, arg6 >> 1, var23);
                            if (~class261.field4619 < 0) {
                                if (~var46 == -2) {
                                    class178.field3091 -= 20;
                                }
                                if (var46 == 2) {
                                    class261.field4619 -= 15;
                                    class178.field3091 -= 10;
                                }
                                if (~var46 == -4) {
                                    class261.field4619 += 15;
                                    class178.field3091 -= 10;
                                }
                                class241.field4212[var23.field4842[var46]].method758(class261.field4619 + arg4 + -12, class178.field3091 + arg5 - 12);
                                class181.field3161.method531(class249.method1685((byte) -92, var23.field4820[var46]), arg4 - 1 + class261.field4619, class178.field3091 + 3 + arg5, 16777215, 0);
                            }
                        }
                    }
                }
            }
            ++var7;
        }
        for (int var8 = 0; ~var8 > ~class93.field1507; ++var8) {
            int var9 = class102.field1672[var8];
            int var10 = class102.field1676[var8];
            int var11 = class102.field1689[var8];
            int var12 = class102.field1682[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; ~var22 > ~var8; ++var22) {
                    if (class102.field1672[var22] + -class102.field1682[var22] < var9 + 2 && class102.field1672[var22] - -2 > var9 - var12 && ~(class102.field1689[var22] - -class102.field1676[var22]) < ~(-var10 + var11) && var10 + var11 > class102.field1689[var22] + -class102.field1676[var22] && class102.field1672[var22] + -class102.field1682[var22] < var9) {
                        var13 = true;
                        var9 = class102.field1672[var22] + -class102.field1682[var22];
                    }
                }
            }
            class261.field4619 = class102.field1689[var8];
            class178.field3091 = class102.field1672[var8] = var9;
            class280 var14 = class102.field1696[var8];
            if (~class163.field2862 == -1) {
                int var15 = 16776960;
                if (~class102.field1692[var8] > -7) {
                    var15 = class122.field2145[class102.field1692[var8]];
                }
                if (class102.field1692[var8] == 6) {
                    var15 = class102.field1665 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class102.field1692[var8] == 7) {
                    var15 = ~(class102.field1665 % 20) > -11 ? 255 : 65535;
                }
                if (~class102.field1692[var8] == -9) {
                    var15 = ~(class102.field1665 % 20) <= -11 ? 8454016 : 45056;
                }
                if (class102.field1692[var8] == 9) {
                    int var16 = 150 - class102.field1698[var8];
                    if (~var16 > -51) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 >= 100) {
                        if (~var16 > -151) {
                            var15 = (var16 + -100) * 5 + 65280;
                        }
                    } else {
                        var15 = -(var16 * 327680) + 16776960 + 16384000;
                    }
                }
                if (class102.field1692[var8] == 10) {
                    int var17 = -class102.field1698[var8] + 150;
                    if (~var17 > -51) {
                        var15 = var17 * 5 + 16711680;
                    } else if (~var17 > -101) {
                        var15 = -((var17 + -50) * 327680) + 16711935;
                    } else if (~var17 > -151) {
                        var15 = var17 * 327680 + 500 + -(var17 * 5) - 32767745;
                    }
                }
                if (class102.field1692[var8] == 11) {
                    int var18 = -class102.field1698[var8] + 150;
                    if (var18 < 50) {
                        var15 = -(var18 * 327685) + 16777215;
                    } else if (~var18 <= -101) {
                        if (~var18 > -151) {
                            var15 = 16777215 - (var18 + -100) * 327680;
                        }
                    } else {
                        var15 = 65280 - -((var18 + -50) * 327685);
                    }
                }
                if (class102.field1700[var8] == 0) {
                    class54.field890.method531(var14, class261.field4619 + arg4, arg5 - -class178.field3091, var15, 0);
                }
                if (~class102.field1700[var8] == -2) {
                    class54.field890.method518(var14, class261.field4619 + arg4, arg5 - -class178.field3091, var15, 0, class102.field1665);
                }
                if (class102.field1700[var8] == 2) {
                    class54.field890.method519(var14, class261.field4619 + arg4, class178.field3091 + arg5, var15, 0, class102.field1665);
                }
                if (~class102.field1700[var8] == -4) {
                    class54.field890.method521(var14, class261.field4619 + arg4, arg5 - -class178.field3091, var15, 0, class102.field1665, -class102.field1698[var8] + 150);
                }
                if (class102.field1700[var8] == 4) {
                    int var19 = (-class102.field1698[var8] + 150) * (100 + class54.field890.method528(var14)) / 150;
                    class151.method1059(class261.field4619 + arg4 + -50, arg5, arg4 + 50 + class261.field4619, arg5 + arg6);
                    class54.field890.method515(var14, arg4 + 50 + -var19 - -class261.field4619, arg5 - -class178.field3091, var15, 0);
                    class151.method1061(arg4, arg5, arg2 + arg4, arg5 + arg6);
                }
                if (class102.field1700[var8] == 5) {
                    int var20 = -class102.field1698[var8] + 150;
                    int var21 = 0;
                    class151.method1059(arg4, arg5 - -class178.field3091 + -class54.field890.field1154 + -1, arg4 - -arg2, class178.field3091 + 5 + arg5);
                    if (~var20 > -26) {
                        var21 = var20 - 25;
                    } else if (~var20 < -126) {
                        var21 = var20 - 125;
                    }
                    class54.field890.method531(var14, class261.field4619 + arg4, arg5 + var21 + class178.field3091, var15, 0);
                    class151.method1061(arg4, arg5, arg2 + arg4, arg5 - -arg6);
                }
            } else {
                class54.field890.method531(var14, class261.field4619 + arg4, class178.field3091 + arg5, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "(I)V")
    public static void method1538(int arg0) {
        field3942 = null;
        field3950 = null;
        if (arg0 <= 17) {
            field3942 = null;
        }
        field3954 = null;
        field3940 = null;
        field3948 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)V")
    private final void method1539(int arg0, int arg1, int arg2, int arg3) {
        ++field3934;
        if (arg3 == -25913) {
            int var5 = arg1 > 2048 ? -(arg1 * arg2 >> 12) + arg1 + arg2 : (4096 - -arg2) * arg1 >> 12;
            if (~var5 >= -1) {
                this.field3938 = this.field3951 = this.field3937 = arg1;
            } else {
                int var6 = arg0 * 6;
                int var7 = arg1 + arg1 + -var5;
                int var8 = (var5 - var7 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = -var13 + var5;
                int var15 = var7 + var13;
                if (var9 != 0) {
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (~var9 != -4) {
                                if (var9 != 4) {
                                    if (~var9 == -6) {
                                        this.field3938 = var5;
                                        this.field3937 = var14;
                                        this.field3951 = var7;
                                    }
                                } else {
                                    this.field3938 = var15;
                                    this.field3951 = var7;
                                    this.field3937 = var5;
                                }
                            } else {
                                this.field3938 = var7;
                                this.field3951 = var14;
                                this.field3937 = var5;
                            }
                        } else {
                            this.field3951 = var5;
                            this.field3938 = var7;
                            this.field3937 = var15;
                        }
                    } else {
                        this.field3951 = var5;
                        this.field3938 = var14;
                        this.field3937 = var7;
                    }
                } else {
                    this.field3938 = var5;
                    this.field3951 = var15;
                    this.field3937 = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)Luj;")
    public static final class275 method1540(byte arg0, int arg1) {
        ++field3947;
        if (arg0 <= 46) {
            method1540((byte) -18, -108);
        }
        class275 var2 = (class275) class204.field3546.method1480((byte) 50, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class181.field3164.method1258(1, arg1, (byte) 109);
            class275 var4 = new class275();
            if (var3 != null) {
                var4.method1830(arg1, (byte) -125, new class25(var3));
            }
            class204.field3546.method1483((byte) -109, (long) arg1, var4);
            return var4;
        }
    }
}
