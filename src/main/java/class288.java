import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class288 {

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Lpf;")
    public static class425 field4379 = new class425(19, 8);

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lwl;")
    public static class452 field4384 = null;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lfh;")
    public static class170 field4381;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lkr;")
    public static class234 field4377;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
    public static final void method1778(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4382++;
        if (arg4 >= class189.field2831 && class204.field3060 >= arg4) {
            int var5 = class198.method1192(class192.field2917, class39.field497, arg0, -3);
            int var6 = class198.method1192(class192.field2917, class39.field497, arg2, -3);
            class388.method2398(var6, arg1, var5, arg4, arg3 ^ 0xFFFFAC0B);
        }
        if (arg3 != -21493) {
            method1783((String) null, (Throwable) null, -113);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
    public static void method1779(boolean arg0) {
        field4379 = null;
        if (!arg0) {
            field4384 = null;
            field4377 = null;
            field4381 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILdr;II)V")
    public static final void method1780(int arg0, class261 arg1, int arg2, int arg3) {
        field4383++;
        if (arg0 < 0 || arg2 < 0 || class195.field2955 == 0 || class19.field264 == 0) {
            return;
        }
        arg1.method399(class339.field5062, class379.field5529, class195.field2955, class19.field264);
        arg1.method436(class143.field1910, class302.field4573, class195.field2955, class19.field264);
        class361 var4 = arg1.method388();
        var4.method612(class31.field399, class90.field1276, class453.field6708, class423.field6231, class126.field1615, class44.field546);
        arg1.method397(var4);
        if (class85.field1201 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg1.method444();
            int var8 = (arg0 - class339.field5062) * var7 / class195.field2955;
            int var9 = (arg2 - class379.field5529) * var7 / class19.field264;
            int var10 = arg1.method381();
            int var11 = (arg0 - class339.field5062) * var10 / class195.field2955;
            int var12 = (arg2 - class379.field5529) * var10 / class19.field264;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method605(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method605(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && var20 < class115.field1522 && class198.field3004 > var22) {
                    int var23 = class113.field1500.field1902;
                    if (var23 < 3 && (class341.field5085[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class85.field1201[var23].method100(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = class113.field1500.method911(0) * 64 + var19 - 64 >> 7;
                        var6 = (class113.field1500.method911(arg3 ^ 0xFFFFFFFB) - 1) * 64 + var21 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class132.field1692 && (class108.field1435 & 0x40) != 0) {
                    class170 var24 = class455.method2827(class54.field729, false, class186.field2795);
                    if (var24 == null) {
                        class284.method1746(-1);
                    } else {
                        class371.method2234(var6, 17, var5, false, class284.field4319, (byte) -65, " ->", class105.field1411, 0L, true);
                    }
                } else {
                    if (class466.field6855 == class17.field253) {
                        class371.method2234(var6, 59, var5, false, class418.field6193.method937((byte) 123, class27.field356), (byte) -65, "", -1, 0L, true);
                    }
                    class341.field5087++;
                    class371.method2234(var6, 20, var5, false, class375.field5460, (byte) -65, "", -1, 0L, true);
                }
            }
        }
        class354 var25 = class47.field577;
        for (class70 var26 = (class70) var25.method2127(-1489721243); var26 != null; var26 = (class70) var25.method2126(-80)) {
            if (class113.field1500.field1902 == var26.field897 && var26.method472((byte) -115, arg0, arg1, arg2)) {
                if (var26.field901 instanceof class169) {
                    class169 var27 = (class169) var26.field901;
                    int var28 = var27.method911(0);
                    if ((var28 & 0x1) == 0 && (var27.field1900 & 0x7F) == 0 && (var27.field1892 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field1900 & 0x7F) == 64 && (var27.field1892 & 0x7F) == 64) {
                        int var29 = var27.field1900 - (var27.method911(0) * 64 - 64);
                        int var30 = var27.field1892 - ((var27.method911(arg3 ^ 0xFFFFFFFB) - 1) * 64);
                        for (int var31 = 0; var31 < class38.field458; var31++) {
                            class155 var38 = class170.field2626[class87.field1235[var31]];
                            if (var38 != null && class26.field332 != var38.field1975 && var38.field1942) {
                                int var39 = var38.field1900 + 64 - (var38.field2137.field4110 * 64);
                                int var40 = var38.field1892 + 64 - var38.field2137.field4110 * 64;
                                if (var29 <= var39 && var38.field2137.field4110 <= var27.method911(arg3 + 5) - (var39 - var29 >> 7) && var40 >= var30 && var38.field2137.field4110 <= var27.method911(arg3 ^ 0xFFFFFFFB) - (var40 - var30 >> 7)) {
                                    class278.method1718(class113.field1500.field1902 != var26.field897, var38, (byte) 60);
                                    var38.field1975 = class26.field332;
                                }
                            }
                        }
                        int var32 = class307.field4634;
                        int[] var33 = class201.field3038;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class169 var35 = class140.field1883[var33[var34]];
                            if (var35 != null && class26.field332 != var35.field1975 && var27 != var35 && var35.field1942) {
                                int var36 = var35.field1900 + 64 - var35.method911(0) * 64;
                                int var37 = var35.field1892 + 64 - var35.method911(arg3 + 5) * 64;
                                if (var29 <= var36 && var35.method911(0) <= var27.method911(0) - (var36 - var29 >> 7) && var30 <= var37 && var35.method911(arg3 ^ 0xFFFFFFFB) <= var27.method911(0) - (var37 - var30 >> 7)) {
                                    class435.method2672(class113.field1500.field1902 != var26.field897, var35, (byte) 122);
                                    var35.field1975 = class26.field332;
                                }
                            }
                        }
                    }
                    if (class26.field332 == var27.field1975) {
                        continue;
                    }
                    class435.method2672(class113.field1500.field1902 != var26.field897, var27, (byte) 53);
                    var27.field1975 = class26.field332;
                }
                if (var26.field901 instanceof class155) {
                    class155 var41 = (class155) var26.field901;
                    if (var41.field2137 != null) {
                        if ((var41.field2137.field4110 & 0x1) == 0 && (var41.field1900 & 0x7F) == 0 && (var41.field1892 & 0x7F) == 0 || (var41.field2137.field4110 & 0x1) == 1 && (var41.field1900 & 0x7F) == 64 && (var41.field1892 & 0x7F) == 64) {
                            int var42 = var41.field1900 + 64 - (var41.field2137.field4110 * 64);
                            int var43 = var41.field1892 + 64 - (var41.field2137.field4110 * 64);
                            for (int var44 = 0; var44 < class38.field458; var44++) {
                                class155 var51 = class170.field2626[class87.field1235[var44]];
                                if (var51 != null && class26.field332 != var51.field1975 && var41 != var51 && var51.field1942) {
                                    int var52 = var51.field1900 - (var51.field2137.field4110 - 1) * 64;
                                    int var53 = var51.field1892 + 64 - var51.field2137.field4110 * 64;
                                    if (var52 >= var42 && (var41.field2137.field4110 - (var52 - var42 >> 7)) >= var51.field2137.field4110 && var43 <= var53 && var51.field2137.field4110 <= var41.field2137.field4110 - (var53 - var43 >> 7)) {
                                        class278.method1718(class113.field1500.field1902 != var26.field897, var51, (byte) 60);
                                        var51.field1975 = class26.field332;
                                    }
                                }
                            }
                            int var45 = class307.field4634;
                            int[] var46 = class201.field3038;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class169 var48 = class140.field1883[var46[var47]];
                                if (var48 != null && class26.field332 != var48.field1975 && var48.field1942) {
                                    int var49 = var48.field1900 - ((var48.method911(0) - 1) * 64);
                                    int var50 = var48.field1892 + 64 - var48.method911(0) * 64;
                                    if (var42 <= var49 && var48.method911(0) <= var41.field2137.field4110 - (var49 - var42 >> 7) && var43 <= var50 && var48.method911(arg3 + 5) <= (var41.field2137.field4110 - (var50 - var43 >> 7))) {
                                        class435.method2672(class113.field1500.field1902 != var26.field897, var48, (byte) 19);
                                        var48.field1975 = class26.field332;
                                    }
                                }
                            }
                        }
                        if (class26.field332 == var41.field1975) {
                            continue;
                        }
                        class278.method1718(class113.field1500.field1902 != var26.field897, var41, (byte) 60);
                        var41.field1975 = class26.field332;
                    }
                }
                if (var26.field901 instanceof class212) {
                    class429 var54 = (class429) class45.field557.method2302((long) (var26.field898 | var26.field900 << 14 | var26.field897 << 28), 23576);
                    if (var54 != null) {
                        for (class146 var55 = (class146) var54.field6304.method2515(63); var55 != null; var55 = (class146) var54.field6304.method2516(-1)) {
                            class167 var56 = class186.field2796.method1106(50, var55.field2025);
                            if (!class132.field1692) {
                                if (class113.field1500.field1902 == var26.field897) {
                                    String[] var57 = var56.field2336;
                                    for (int var58 = 4; var58 >= 0; var58--) {
                                        if (var57 != null && var57[var58] != null) {
                                            byte var59 = 0;
                                            int var60 = class220.field3341;
                                            if (var58 == 0) {
                                                var59 = 23;
                                            }
                                            if (var58 == 1) {
                                                var59 = 44;
                                            }
                                            if (var58 == 2) {
                                                var59 = 12;
                                            }
                                            if (var58 == 3) {
                                                var59 = 46;
                                            }
                                            if (var58 == 4) {
                                                var59 = 22;
                                            }
                                            if (var56.field2390 == var58) {
                                                var60 = var56.field2349;
                                            }
                                            if (var56.field2334 == var58) {
                                                var60 = var56.field2318;
                                            }
                                            class57.field753++;
                                            class371.method2234(var26.field900, var59, var26.field898, false, var57[var58], (byte) -65, "<col=ff9040>" + var56.field2329, var60, (long) var55.field2025, true);
                                        }
                                    }
                                }
                                class371.method2234(var26.field900, 1009, var26.field898, class113.field1500.field1902 != var26.field897, class162.field2249.method937((byte) 106, class27.field356), (byte) -65, "<col=ff9040>" + var56.field2329, class19.field258, (long) var55.field2025, true);
                                class177.field2680++;
                            } else if (class113.field1500.field1902 == var26.field897) {
                                class15 var61 = class244.field3662 == -1 ? null : class19.method123(class244.field3662, (byte) -110);
                                if ((class108.field1435 & 0x1) != 0 && (var61 == null || var56.method1002(arg3 ^ 0x764E, class244.field3662, var61.field186) != var61.field186)) {
                                    class82.field1086++;
                                    class371.method2234(var26.field900, 51, var26.field898, false, class284.field4319, (byte) -65, class411.field6116 + " -> <col=ff9040>" + var56.field2329, class105.field1411, (long) var55.field2025, true);
                                }
                            }
                        }
                    }
                }
                if (var26.field901 instanceof class18) {
                    class18 var62 = (class18) var26.field901;
                    class85 var63 = class411.method2575(arg3 ^ 0xFFFFFFFB, var62.method7(true));
                    if (var63.field1133 != null) {
                        var63 = var63.method542(6796);
                    }
                    if (var63 != null) {
                        if (!class132.field1692) {
                            if (class113.field1500.field1902 == var26.field897) {
                                String[] var65 = var63.field1166;
                                if (var65 != null) {
                                    for (int var66 = 4; var66 >= 0; var66--) {
                                        if (var65[var66] != null) {
                                            short var67 = 0;
                                            int var68 = class220.field3341;
                                            if (var66 == 0) {
                                                var67 = 45;
                                            }
                                            if (var66 == 1) {
                                                var67 = 48;
                                            }
                                            if (var66 == 2) {
                                                var67 = 4;
                                            }
                                            if (var66 == 3) {
                                                var67 = 3;
                                            }
                                            if (var63.field1207 == var66) {
                                                var68 = var63.field1153;
                                            }
                                            if (var66 == 4) {
                                                var67 = 1010;
                                            }
                                            if (var63.field1173 == var66) {
                                                var68 = var63.field1129;
                                            }
                                            class3.field32++;
                                            class371.method2234(var26.field900, var67, var26.field898, false, var65[var66], (byte) -65, "<col=00ffff>" + var63.field1195, var68, class148.method922(var26.field900, 102, var26.field898, var62), true);
                                        }
                                    }
                                }
                            }
                            class371.method2234(var26.field900, 1002, var26.field898, class113.field1500.field1902 != var26.field897, class162.field2249.method937((byte) 124, class27.field356), (byte) -65, "<col=00ffff>" + var63.field1195, class19.field258, (long) var63.field1156, true);
                            class387.field5718++;
                        } else if (class113.field1500.field1902 == var26.field897) {
                            class15 var64 = class244.field3662 == -1 ? null : class19.method123(class244.field3662, (byte) -48);
                            if ((class108.field1435 & 0x4) != 0 && (var64 == null || var63.method556(82, class244.field3662, var64.field186) != var64.field186)) {
                                class364.field5353++;
                                class371.method2234(var26.field900, 2, var26.field898, false, class284.field4319, (byte) -65, class411.field6116 + " -> <col=00ffff>" + var63.field1195, class105.field1411, class148.method922(var26.field900, -121, var26.field898, var62), true);
                            }
                        }
                    }
                }
            }
        }
        if (arg3 != -5) {
            field4377 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILje;)V")
    public static final void method1781(int arg0, class169 arg1) {
        if (arg0 != 1) {
            method1783((String) null, (Throwable) null, -127);
        }
        field4385++;
        class71 var2 = (class71) class466.field6858.method2302((long) arg1.field1929, 23576);
        if (var2 == null) {
            return;
        }
        if (var2.field919 != null) {
            class267.field4077.method2135(var2.field919);
            var2.field919 = null;
        }
        var2.method625((byte) -50);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIZILdr;[B[Lek;)V")
    public static final void method1782(int arg0, int arg1, boolean arg2, int arg3, class261 arg4, byte[] arg5, class375[] arg6) {
        field4380++;
        class385 var7 = new class385(arg5);
        int var8 = arg3;
        while (true) {
            int var9 = var7.method2339((byte) 40);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method2372(true);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = (var10 & 0xFFC) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method2343(arg3 ^ 0xFFFFFF00);
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = var13 + arg1;
                int var19 = arg0 + var12;
                if (var18 > 0 && var19 > 0 && class115.field1522 - 1 > var18 && (class198.field3004 - 1) > var19) {
                    class375 var20 = null;
                    if (!arg2) {
                        int var21 = var14;
                        if ((class341.field5085[1][var18][var19] & 0x2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg6[var21];
                        }
                    }
                    class331.method2031(true, var17, arg4, var20, var19, var8, arg2, var14, -1, (byte) 116, var18, var14, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static final void method1783(String arg0, Throwable arg1, int arg2) {
        int var3 = 52 % ((arg2 - 70) / 46);
        field4378++;
        try {
            String var4 = "";
            if (arg1 != null) {
                var4 = class27.method161(arg1, (byte) -97);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var4 = var4 + " | ";
                }
                var4 = var4 + arg0;
            }
            class298.method1840((byte) 113, var4);
            String var5 = class114.method693(":", "%3a", 1, var4);
            String var6 = class114.method693("@", "%40", 1, var5);
            String var7 = class114.method693("&", "%26", 1, var6);
            String var8 = class114.method693("#", "%23", 1, var7);
            if (class364.field5351.field3583 != null) {
                class211 var9 = class364.field5351.method1439(new URL(class364.field5351.field3583.getCodeBase(), "clienterror.ws?c=" + class145.field1980 + "&u=" + class210.field3159 + "&v1=" + class239.field3575 + "&v2=" + class239.field3571 + "&e=" + var8), (byte) 65);
                while (var9.field3172 == 0) {
                    class109.method674((byte) 99, 1L);
                }
                if (var9.field3172 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field3175;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }
}
