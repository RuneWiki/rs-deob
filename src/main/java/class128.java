import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public abstract class class128 {

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field1904 = -1;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field1907 = 1;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "[I")
    public static int[] field1906 = new int[32768];

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Ltd;", line = 10)
    public static final class255 method874(int arg0, int arg1) {
        if (arg0 < 0) {
            return (class255) null;
        } else {
            field1903++;
            return class142.field2129 && arg1 >= class30.field428 && arg1 <= class26.field380 ? class147.field2197[arg1 - class30.field428] : null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 25)
    public static final void method875(int arg0) {
        class219.method1600(class86.field1296, 114);
        field1908++;
        class248.field3944++;
        if (class151.field2316 && class146.field2186) {
            if (arg0 == 1) {
                int var1 = class164.field2672;
                int var2 = var1 - class160.field2591;
                int var3 = class4.field35;
                int var4 = var3 - class17.field231;
                if (var4 < class46.field627) {
                    var4 = class46.field627;
                }
                if (class86.field1296.field2590 + var4 > class46.field627 + class341.field5315.field2590) {
                    var4 = class46.field627 + class341.field5315.field2590 - class86.field1296.field2590;
                }
                if (class187.field3044 > var2) {
                    var2 = class187.field3044;
                }
                if (var2 + class86.field1296.field2458 > class187.field3044 + class341.field5315.field2458) {
                    var2 = class187.field3044 + class341.field5315.field2458 - class86.field1296.field2458;
                }
                int var5 = var2 - class15.field179;
                int var6 = var4 - class292.field4598;
                int var7 = class86.field1296.field2538;
                if (class248.field3944 > class86.field1296.field2477 && (var5 > var7 || var5 < (-var7) || var7 < var6 || var6 < (-var7))) {
                    class242.field3846 = true;
                }
                int var8 = var4 + class341.field5315.field2472 - class46.field627;
                int var9 = var2 + class341.field5315.field2466 - class187.field3044;
                if (class86.field1296.field2588 != null && class242.field3846) {
                    class247 var10 = new class247();
                    var10.field3931 = class86.field1296;
                    var10.field3930 = var9;
                    var10.field3938 = var8;
                    var10.field3925 = class86.field1296.field2588;
                    class69.method455(var10, (byte) -64);
                }
                if (class342.field5335 == 0) {
                    if (class242.field3846) {
                        if (class86.field1296.field2492 != null) {
                            class247 var11 = new class247();
                            var11.field3931 = class86.field1296;
                            var11.field3930 = var9;
                            var11.field3938 = var8;
                            var11.field3929 = class27.field397;
                            var11.field3925 = class86.field1296.field2492;
                            class69.method455(var11, (byte) -64);
                        }
                        if (class27.field397 != null && client.method1894(class86.field1296) != null) {
                            class21.field313.method1541(-64, 117);
                            class105.field1593++;
                            class21.field313.method1361(class27.field397.field2456, -488903776);
                            class21.field313.method1401(class86.field1296.field2456, -16384);
                            class21.field313.method1395((byte) 0, class86.field1296.field2446);
                            class21.field313.method1382(true, class27.field397.field2446);
                        }
                    } else if ((class181.field2915 == 1 || class200.method1464(125, class126.field1887 - 1)) && class126.field1887 > 2) {
                        class333.method2297(39);
                    } else if (class126.field1887 > 0) {
                        class121.method841((byte) 105);
                    }
                    class86.field1296 = null;
                }
            }
        } else if (class248.field3944 > 1) {
            class86.field1296 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V", line = 144)
    public static void method877(int arg0) {
        field1906 = null;
        if (arg0 != 14050) {
            field1907 = -62;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V", line = 154)
    public static final void method878(boolean arg0) {
        field1905++;
        class77.method570(class86.field1304, 40);
        int var1 = (class27.field388 >> 10) + (class24.field351 >> 3);
        byte var2 = 8;
        int var3 = (class74.field983 >> 10) + (class181.field2925 >> 3);
        byte var4 = 0;
        byte var5 = 8;
        byte var6 = 18;
        class81.field1240 = new byte[var6][];
        class237.field3750 = new byte[var6][];
        class84.field1273 = new int[var6];
        class266.field4195 = new int[var6];
        class71.field909 = new byte[var6][];
        class327.field5096 = new int[var6];
        class139.field2083 = new int[var6];
        class20.field304 = new int[var6];
        class187.field3037 = new byte[var6][];
        class101.field1552 = new int[var6];
        class249.field3964 = new int[var6][4];
        class105.field1596 = new byte[var6][];
        int var7 = 0;
        for (int var8 = (var3 - 6) / 8; var8 <= ((var3 + 6) / 8); var8++) {
            for (int var9 = (var1 - 6) / 8; var9 <= ((var1 + 6) / 8); var9++) {
                int var10 = (var8 << 8) + var9;
                class327.field5096[var7] = var10;
                class101.field1552[var7] = class239.field3775.method266(-110, "m" + var8 + "_" + var9);
                class266.field4195[var7] = class239.field3775.method266(-81, "l" + var8 + "_" + var9);
                class139.field2083[var7] = class239.field3775.method266(-45, "n" + var8 + "_" + var9);
                class20.field304[var7] = class239.field3775.method266(-110, "um" + var8 + "_" + var9);
                class84.field1273[var7] = class239.field3775.method266(-121, "ul" + var8 + "_" + var9);
                if (class139.field2083[var7] == -1) {
                    class101.field1552[var7] = -1;
                    class266.field4195[var7] = -1;
                    class20.field304[var7] = -1;
                    class84.field1273[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class139.field2083.length; var11++) {
            class139.field2083[var11] = -1;
            class101.field1552[var11] = -1;
            class266.field4195[var11] = -1;
            class20.field304[var11] = -1;
            class84.field1273[var11] = -1;
        }
        class48.method334(false, arg0, -14842, var5, var2, var3, var4, var1);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Li;Z)V", line = 234)
    public static final void method879(class230 arg0, boolean arg1) {
        class318.field4939.method1815((byte) -126, arg0);
        while (true) {
            class230 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class230[][] var7;
            class230 var78;
            do {
                class230 var77;
                do {
                    class230 var76;
                    do {
                        class230 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class230) class318.field4939.method1814(-30321);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3690);
                                            var3 = var2.field3673;
                                            var4 = var2.field3688;
                                            var5 = var2.field3683;
                                            var6 = var2.field3686;
                                            var7 = class251.field3996[var5];
                                            float var8 = 0.0F;
                                            if (class186.field2991) {
                                                if (class84.field1282 == class163.field2656) {
                                                    int var9 = class310.field4846[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class283.field4474 != var10) {
                                                        class283.field4474 = var10;
                                                        class30.method191(var10, false);
                                                        class109.method749(class315.method2188(5247));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class280.field4414 != var11) {
                                                        class280.field4414 = var11;
                                                        class230.method1664(var11, (byte) 125);
                                                    }
                                                    int var12 = class94.field1450[0][var3 + 1][var4] + class94.field1450[0][var3][var4] + class94.field1450[0][var3][var4 + 1] + class94.field1450[0][var3 + 1][var4 + 1] >> 2;
                                                    class188.method1328(-var12, 3, (byte) 118);
                                                    var8 = 201.5F;
                                                    class186.method1282(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class186.method1282(var8);
                                                }
                                            }
                                            if (!var2.field3679) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class230 var13 = class251.field3996[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field3690) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class185.field2979 && var3 > class95.field1461) {
                                                    class230 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field3690 && (var14.field3679 || (var2.field3681 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class185.field2979 && var3 < class160.field2486 - 1) {
                                                    class230 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field3690 && (var15.field3679 || (var2.field3681 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class313.field4870 && var4 > class239.field3782) {
                                                    class230 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field3690 && (var16.field3679 || (var2.field3681 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class313.field4870 && var4 < class127.field1901 - 1) {
                                                    class230 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field3690 && (var17.field3679 || (var2.field3681 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3679 = false;
                                            if (var2.field3672 != null) {
                                                class230 var18 = var2.field3672;
                                                if (class186.field2991) {
                                                    class186.method1282(201.5F - (float) (var18.field3686 + 1) * 50.0F);
                                                }
                                                if (var18.field3670 == null) {
                                                    if (var18.field3685 != null) {
                                                        if (class296.method2065(0, var3, var4)) {
                                                            class286.method2016(var18.field3685, class312.field4861, class148.field2213, class251.field4001, class10.field108, var3, var4, true);
                                                        } else {
                                                            class286.method2016(var18.field3685, class312.field4861, class148.field2213, class251.field4001, class10.field108, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class296.method2065(0, var3, var4)) {
                                                    class290.method2035(var18.field3670, 0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var3, var4, true);
                                                } else {
                                                    class290.method2035(var18.field3670, 0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var3, var4, false);
                                                }
                                                class19 var19 = var18.field3676;
                                                if (var19 != null) {
                                                    if (class186.field2991) {
                                                        if ((var19.field258 & var2.field3671) == 0) {
                                                            class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3, var4);
                                                        } else {
                                                            class47.method327(var19.field258, class88.field1347, class189.field3081, class2.field15, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field259.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var19.field260 - class88.field1347, var19.field265 - class189.field3081, var19.field275 - class2.field15, var19.field263, var5, (class167) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field3680; var20++) {
                                                    class271 var21 = var18.field3687[var20];
                                                    if (var21 != null) {
                                                        if (class186.field2991) {
                                                            class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3, var4);
                                                        }
                                                        var21.field4286.method153(var21.field4288, class312.field4861, class148.field2213, class251.field4001, class10.field108, var21.field4305 - class88.field1347, var21.field4293 - class189.field3081, var21.field4300 - class2.field15, var21.field4294, var5, (class167) null);
                                                    }
                                                }
                                                if (class186.field2991) {
                                                    class186.method1282(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field3670 == null) {
                                                if (var2.field3685 != null) {
                                                    if (class296.method2065(var6, var3, var4)) {
                                                        class286.method2016(var2.field3685, class312.field4861, class148.field2213, class251.field4001, class10.field108, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class286.method2016(var2.field3685, class312.field4861, class148.field2213, class251.field4001, class10.field108, var3, var4, false);
                                                    }
                                                }
                                            } else if (class296.method2065(var6, var3, var4)) {
                                                class290.method2035(var2.field3670, var6, class312.field4861, class148.field2213, class251.field4001, class10.field108, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field3670.field4605 != 12345678 || class88.field1323 && var5 <= class131.field1936) {
                                                    class290.method2035(var2.field3670, var6, class312.field4861, class148.field2213, class251.field4001, class10.field108, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class49 var23 = var2.field3675;
                                                if (var23 != null && (var23.field677 & 0x80000000L) != 0L) {
                                                    if (class186.field2991 && var23.field668) {
                                                        class186.method1282(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class186.field2991) {
                                                        class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3, var4);
                                                    }
                                                    var23.field667.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var23.field682 - class88.field1347, var23.field670 - class189.field3081, var23.field680 - class2.field15, var23.field677, var5, (class167) null);
                                                    if (class186.field2991 && var23.field668) {
                                                        class186.method1282(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class19 var26 = var2.field3676;
                                            class145 var27 = var2.field3678;
                                            if (var26 != null || var27 != null) {
                                                if (class185.field2979 == var3) {
                                                    var24++;
                                                } else if (class185.field2979 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class313.field4870 == var4) {
                                                    var24 += 3;
                                                } else if (class313.field4870 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class17.field232[var24];
                                                var2.field3671 = class149.field2271[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field258 & class118.field1767[var24]) == 0) {
                                                    var2.field3684 = 0;
                                                } else if (var26.field258 == 16) {
                                                    var2.field3684 = 3;
                                                    var2.field3668 = class175.field2855[var24];
                                                    var2.field3669 = 3 - var2.field3668;
                                                } else if (var26.field258 == 32) {
                                                    var2.field3684 = 6;
                                                    var2.field3668 = class12.field137[var24];
                                                    var2.field3669 = 6 - var2.field3668;
                                                } else if (var26.field258 == 64) {
                                                    var2.field3684 = 12;
                                                    var2.field3668 = class158.field2430[var24];
                                                    var2.field3669 = 12 - var2.field3668;
                                                } else {
                                                    var2.field3684 = 9;
                                                    var2.field3668 = class334.field5196[var24];
                                                    var2.field3669 = 9 - var2.field3668;
                                                }
                                                if ((var26.field258 & var25) != 0 && !class172.method1177(var6, var3, var4, var26.field258)) {
                                                    if (class186.field2991) {
                                                        class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3, var4);
                                                    }
                                                    var26.field259.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var26.field260 - class88.field1347, var26.field265 - class189.field3081, var26.field275 - class2.field15, var26.field263, var5, (class167) null);
                                                }
                                                if ((var26.field261 & var25) != 0 && !class172.method1177(var6, var3, var4, var26.field261)) {
                                                    if (class186.field2991) {
                                                        class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3, var4);
                                                    }
                                                    var26.field272.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var26.field260 - class88.field1347, var26.field265 - class189.field3081, var26.field275 - class2.field15, var26.field263, var5, (class167) null);
                                                }
                                            }
                                            if (var27 != null && !class254.method1791(var6, var3, var4, var27.field2174.method152())) {
                                                if (class186.field2991) {
                                                    class186.method1282(var8 - 0.5F);
                                                }
                                                if ((var27.field2162 & var25) != 0) {
                                                    if (class186.field2991) {
                                                        class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3, var4);
                                                    }
                                                    var27.field2174.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var27.field2177 + var27.field2169 - class88.field1347, var27.field2179 - class189.field3081, var27.field2167 + var27.field2176 - class2.field15, var27.field2175, var5, (class167) null);
                                                } else if (var27.field2162 == 256) {
                                                    int var28 = var27.field2177 - class88.field1347;
                                                    int var29 = var27.field2179 - class189.field3081;
                                                    int var30 = var27.field2167 - class2.field15;
                                                    int var31 = var27.field2173;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class186.field2991) {
                                                            class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3, var4);
                                                        }
                                                        var27.field2174.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var27.field2169 + var28, var29, var27.field2176 + var30, var27.field2175, var5, (class167) null);
                                                    } else if (var27.field2166 != null) {
                                                        if (class186.field2991) {
                                                            class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3, var4);
                                                        }
                                                        var27.field2166.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var28, var29, var30, var27.field2175, var5, (class167) null);
                                                    }
                                                }
                                                if (class186.field2991) {
                                                    class186.method1282(var8);
                                                }
                                            }
                                            if (var22) {
                                                class49 var34 = var2.field3675;
                                                if (var34 != null && (var34.field677 & 0x80000000L) == 0L) {
                                                    if (class186.field2991 && var34.field668) {
                                                        class186.method1282(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class186.field2991) {
                                                        class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3, var4);
                                                    }
                                                    var34.field667.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var34.field682 - class88.field1347, var34.field670 - class189.field3081, var34.field680 - class2.field15, var34.field677, var5, (class167) null);
                                                    if (class186.field2991 && var34.field668) {
                                                        class186.method1282(var8);
                                                    }
                                                }
                                                class59 var35 = var2.field3689;
                                                if (var35 != null && var35.field772 == 0) {
                                                    if (class186.field2991) {
                                                        class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3, var4);
                                                    }
                                                    if (var35.field779 != null) {
                                                        var35.field779.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var35.field780 - class88.field1347, var35.field774 - class189.field3081, var35.field781 - class2.field15, var35.field777, var5, (class167) null);
                                                    }
                                                    if (var35.field773 != null) {
                                                        var35.field773.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var35.field780 - class88.field1347, var35.field774 - class189.field3081, var35.field781 - class2.field15, var35.field777, var5, (class167) null);
                                                    }
                                                    if (var35.field778 != null) {
                                                        var35.field778.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var35.field780 - class88.field1347, var35.field774 - class189.field3081, var35.field781 - class2.field15, var35.field777, var5, (class167) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field3681;
                                            if (var36 != 0) {
                                                if (var3 < class185.field2979 && (var36 & 0x4) != 0) {
                                                    class230 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field3690) {
                                                        class318.field4939.method1815((byte) -122, var37);
                                                    }
                                                }
                                                if (var4 < class313.field4870 && (var36 & 0x2) != 0) {
                                                    class230 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field3690) {
                                                        class318.field4939.method1815((byte) -126, var38);
                                                    }
                                                }
                                                if (var3 > class185.field2979 && (var36 & 0x1) != 0) {
                                                    class230 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field3690) {
                                                        class318.field4939.method1815((byte) -126, var39);
                                                    }
                                                }
                                                if (var4 > class313.field4870 && (var36 & 0x8) != 0) {
                                                    class230 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field3690) {
                                                        class318.field4939.method1815((byte) -126, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3684 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field3680; var42++) {
                                                if (class247.field3937 != var2.field3687[var42].field4295 && (var2.field3682[var42] & var2.field3684) == var2.field3668) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class19 var43 = var2.field3676;
                                                if (!class172.method1177(var6, var3, var4, var43.field258)) {
                                                    if (class186.field2991) {
                                                        label882: {
                                                            if ((var43.field263 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field260 - class88.field1347;
                                                                int var45 = var43.field275 - class2.field15;
                                                                int var46 = (int) (var43.field263 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class64.field844 - 1) {
                                                                        class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class4.field43 - 1 && var4 < class64.field844 - 1) {
                                                                        class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class4.field43 - 1 && var4 > 0) {
                                                                        class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field259.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var43.field260 - class88.field1347, var43.field265 - class189.field3081, var43.field275 - class2.field15, var43.field263, var5, (class167) null);
                                                }
                                                var2.field3684 = 0;
                                            }
                                        }
                                        if (!var2.field3674) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field3680;
                                            var2.field3674 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class271 var50 = var2.field3687[var49];
                                                if (class247.field3937 != var50.field4295) {
                                                    for (int var51 = var50.field4285; var51 <= var50.field4287; var51++) {
                                                        for (int var52 = var50.field4297; var52 <= var50.field4289; var52++) {
                                                            class230 var53 = var7[var51][var52];
                                                            if (var53.field3679) {
                                                                var2.field3674 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field3684 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field4285) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field4287) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field4297) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field4289) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field3684) == var2.field3669) {
                                                                    var2.field3674 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class145.field2165[var48++] = var50;
                                                    int var55 = class185.field2979 - var50.field4285;
                                                    int var56 = var50.field4287 - class185.field2979;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class313.field4870 - var50.field4297;
                                                    int var58 = var50.field4289 - class313.field4870;
                                                    if (var58 > var57) {
                                                        var50.field4306 = var55 + var58;
                                                    } else {
                                                        var50.field4306 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class271 var62 = class145.field2165[var61];
                                                    if (class247.field3937 != var62.field4295) {
                                                        if (var62.field4306 > var59) {
                                                            var59 = var62.field4306;
                                                            var60 = var61;
                                                        } else if (var62.field4306 == var59) {
                                                            int var63 = var62.field4305 - class88.field1347;
                                                            int var64 = var62.field4300 - class2.field15;
                                                            int var65 = class145.field2165[var60].field4305 - class88.field1347;
                                                            int var66 = class145.field2165[var60].field4300 - class2.field15;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class271 var67 = class145.field2165[var60];
                                                var67.field4295 = class247.field3937;
                                                if (!class221.method1608(var6, var67.field4285, var67.field4287, var67.field4297, var67.field4289, var67.field4286.method152())) {
                                                    if (class186.field2991) {
                                                        if ((var67.field4294 & 0xFC000L) == 147456L) {
                                                            class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3, var4);
                                                            int var68 = var67.field4305 - class88.field1347;
                                                            int var69 = var67.field4300 - class2.field15;
                                                            int var70 = (int) (var67.field4294 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class47.method325(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class47.method325(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class47.method325(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class47.method325(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class47.method314(class88.field1347, class189.field3081, class2.field15, var5, var67.field4285, var67.field4297, var67.field4287, var67.field4289);
                                                        }
                                                    }
                                                    var67.field4286.method153(var67.field4288, class312.field4861, class148.field2213, class251.field4001, class10.field108, var67.field4305 - class88.field1347, var67.field4293 - class189.field3081, var67.field4300 - class2.field15, var67.field4294, var5, (class167) null);
                                                }
                                                for (int var71 = var67.field4285; var71 <= var67.field4287; var71++) {
                                                    for (int var72 = var67.field4297; var72 <= var67.field4289; var72++) {
                                                        class230 var73 = var7[var71][var72];
                                                        if (var73.field3684 != 0) {
                                                            class318.field4939.method1815((byte) -128, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field3690) {
                                                            class318.field4939.method1815((byte) -127, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3674) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field3674 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3690);
                            } while (var2.field3684 != 0);
                            if (var3 > class185.field2979 || var3 <= class95.field1461) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field3690);
                        if (var3 < class185.field2979 || var3 >= class160.field2486 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field3690);
                    if (var4 > class313.field4870 || var4 <= class239.field3782) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field3690);
                if (var4 < class313.field4870 || var4 >= class127.field1901 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field3690);
            var2.field3690 = false;
            class81.field1230--;
            class59 var79 = var2.field3689;
            if (var79 != null && var79.field772 != 0) {
                if (class186.field2991) {
                    class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3, var4);
                }
                if (var79.field779 != null) {
                    var79.field779.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var79.field780 - class88.field1347, var79.field774 - class189.field3081 - var79.field772, var79.field781 - class2.field15, var79.field777, var5, (class167) null);
                }
                if (var79.field773 != null) {
                    var79.field773.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var79.field780 - class88.field1347, var79.field774 - class189.field3081 - var79.field772, var79.field781 - class2.field15, var79.field777, var5, (class167) null);
                }
                if (var79.field778 != null) {
                    var79.field778.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var79.field780 - class88.field1347, var79.field774 - class189.field3081 - var79.field772, var79.field781 - class2.field15, var79.field777, var5, (class167) null);
                }
            }
            if (var2.field3671 != 0) {
                class145 var80 = var2.field3678;
                if (var80 != null && !class254.method1791(var6, var3, var4, var80.field2174.method152())) {
                    if ((var80.field2162 & var2.field3671) != 0) {
                        if (class186.field2991) {
                            class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3, var4);
                        }
                        var80.field2174.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var80.field2177 + var80.field2169 - class88.field1347, var80.field2179 - class189.field3081, var80.field2167 + var80.field2176 - class2.field15, var80.field2175, var5, (class167) null);
                    } else if (var80.field2162 == 256) {
                        int var81 = var80.field2177 - class88.field1347;
                        int var82 = var80.field2179 - class189.field3081;
                        int var83 = var80.field2167 - class2.field15;
                        int var84 = var80.field2173;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class186.field2991) {
                                class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3, var4);
                            }
                            var80.field2174.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var80.field2169 + var81, var82, var80.field2176 + var83, var80.field2175, var5, (class167) null);
                        } else if (var80.field2166 != null) {
                            if (class186.field2991) {
                                class47.method321(class88.field1347, class189.field3081, class2.field15, var5, var3, var4);
                            }
                            var80.field2166.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var81, var82, var83, var80.field2175, var5, (class167) null);
                        }
                    }
                }
                class19 var87 = var2.field3676;
                if (var87 != null) {
                    if ((var87.field261 & var2.field3671) != 0 && !class172.method1177(var6, var3, var4, var87.field261)) {
                        if (class186.field2991) {
                            class47.method327(var87.field261, class88.field1347, class189.field3081, class2.field15, var6, var3, var4);
                        }
                        var87.field272.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var87.field260 - class88.field1347, var87.field265 - class189.field3081, var87.field275 - class2.field15, var87.field263, var5, (class167) null);
                    }
                    if ((var87.field258 & var2.field3671) != 0 && !class172.method1177(var6, var3, var4, var87.field258)) {
                        if (class186.field2991) {
                            class47.method327(var87.field258, class88.field1347, class189.field3081, class2.field15, var6, var3, var4);
                        }
                        var87.field259.method153(0, class312.field4861, class148.field2213, class251.field4001, class10.field108, var87.field260 - class88.field1347, var87.field265 - class189.field3081, var87.field275 - class2.field15, var87.field263, var5, (class167) null);
                    }
                }
            }
            if (var5 < class55.field731 - 1) {
                class230 var88 = class251.field3996[var5 + 1][var3][var4];
                if (var88 != null && var88.field3690) {
                    class318.field4939.method1815((byte) 12, var88);
                }
            }
            if (var3 < class185.field2979) {
                class230 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field3690) {
                    class318.field4939.method1815((byte) 19, var89);
                }
            }
            if (var4 < class313.field4870) {
                class230 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field3690) {
                    class318.field4939.method1815((byte) -5, var90);
                }
            }
            if (var3 > class185.field2979) {
                class230 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field3690) {
                    class318.field4939.method1815((byte) 121, var91);
                }
            }
            if (var4 > class313.field4870) {
                class230 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field3690) {
                    class318.field4939.method1815((byte) -128, var92);
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(I)V", line = 1226)
    public static final void method882(int arg0) {
        if (arg0 <= 3) {
            field1907 = -72;
        }
        class210.field3442.method1615(63);
        field1910++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIB)Lha;", line = 1238)
    public static final class318 method883(int arg0, int arg1, byte arg2) {
        field1909++;
        class318 var3 = (class318) class225.field3581.method1746((byte) -33);
        if (arg2 > -97) {
            return (class318) null;
        }
        while (var3 != null) {
            if (var3.field4935 && var3.method2214((byte) -78, arg0, arg1)) {
                return var3;
            }
            var3 = (class318) class225.field3581.method1749((byte) -48);
        }
        return null;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public abstract void method876(int arg0);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)I")
    public abstract int method880(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)J")
    public abstract long method881(byte arg0);
}
