import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class10 {

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lqk;")
    public static class207 field147 = class24.method212(255, "<col=ffb000>");

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Z")
    public static boolean field139 = true;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Lu;")
    public static class118 field138 = new class118(0, 0);

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "[I")
    public static int[] field149 = new int[2048];

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lpk;")
    public static class99 field140;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "[Lqk;")
    public static class207[] field142;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "[[B")
    public static byte[][] field144;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field141++;
        class59.method431((byte) 113, arg2);
        int var7 = 0;
        int var8 = arg2 - arg0;
        int var9 = arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var10 = arg5;
        int var11 = var8;
        int var12 = -arg2;
        int var13 = -1;
        int var14 = -var8;
        if (arg3 >= class204.field3580 && class204.field3602 >= arg3) {
            int[] var15 = class15.field238[arg3];
            int var16 = class21.method123(arg6 - arg2, arg5 + -15465, class124.field2158, class88.field1599);
            int var17 = class21.method123(arg2 + arg6, -15466, class124.field2158, class88.field1599);
            int var18 = class21.method123(arg6 - var8, -15466, class124.field2158, class88.field1599);
            int var19 = class21.method123(arg6 + var8, -15466, class124.field2158, class88.field1599);
            class215.method1544(var16, var18, var15, arg4, -23);
            class215.method1544(var18, var19, var15, arg1, 89);
            class215.method1544(var19, var17, var15, arg4, -72);
        }
        while (var9 > var7) {
            var13 += 2;
            var14 += var13;
            if (var14 >= 0 && var11 >= 1) {
                var11--;
                class14.field235[var11] = var7;
                var14 -= var11 << 1;
            }
            var7++;
            var10 += 2;
            var12 += var10;
            if (var12 >= 0) {
                var9--;
                int var20 = arg3 - var9;
                var12 -= var9 << 1;
                int var21 = arg3 + var9;
                if (var21 >= class204.field3580 && class204.field3602 >= var20) {
                    if (var8 <= var9) {
                        int var22 = class21.method123(arg6 + var7, -15466, class124.field2158, class88.field1599);
                        int var23 = class21.method123(arg6 - var7, -15466, class124.field2158, class88.field1599);
                        if (class204.field3602 >= var21) {
                            class215.method1544(var23, var22, class15.field238[var21], arg4, -48);
                        }
                        if (var20 >= class204.field3580) {
                            class215.method1544(var23, var22, class15.field238[var20], arg4, arg5 ^ 0xFFFFFF82);
                        }
                    } else {
                        int var24 = class14.field235[var9];
                        int var25 = class21.method123(arg6 + var7, arg5 + -15465, class124.field2158, class88.field1599);
                        int var26 = class21.method123(arg6 - var7, arg5 ^ 0x3C69, class124.field2158, class88.field1599);
                        int var27 = class21.method123(arg6 + var24, -15466, class124.field2158, class88.field1599);
                        int var28 = class21.method123(arg6 - var24, -15466, class124.field2158, class88.field1599);
                        if (class204.field3602 >= var21) {
                            int[] var29 = class15.field238[var21];
                            class215.method1544(var26, var28, var29, arg4, -113);
                            class215.method1544(var28, var27, var29, arg1, -52);
                            class215.method1544(var27, var25, var29, arg4, 113);
                        }
                        if (var20 >= class204.field3580) {
                            int[] var30 = class15.field238[var20];
                            class215.method1544(var26, var28, var30, arg4, -65);
                            class215.method1544(var28, var27, var30, arg1, 106);
                            class215.method1544(var27, var25, var30, arg4, 82);
                        }
                    }
                }
            }
            int var31 = arg3 - var7;
            int var32 = arg3 + var7;
            if (var32 >= class204.field3580 && var31 <= class204.field3602) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (class124.field2158 <= var33 && var34 <= class88.field1599) {
                    int var35 = class21.method123(var33, -15466, class124.field2158, class88.field1599);
                    int var36 = class21.method123(var34, -15466, class124.field2158, class88.field1599);
                    if (var7 >= var8) {
                        if (class204.field3602 >= var32) {
                            class215.method1544(var36, var35, class15.field238[var32], arg4, 98);
                        }
                        if (var31 >= class204.field3580) {
                            class215.method1544(var36, var35, class15.field238[var31], arg4, 78);
                        }
                    } else {
                        int var37 = var7 > var11 ? class14.field235[var7] : var11;
                        int var38 = class21.method123(arg6 + var37, -15466, class124.field2158, class88.field1599);
                        int var39 = class21.method123(arg6 - var37, -15466, class124.field2158, class88.field1599);
                        if (var32 <= class204.field3602) {
                            int[] var40 = class15.field238[var32];
                            class215.method1544(var36, var39, var40, arg4, -117);
                            class215.method1544(var39, var38, var40, arg1, arg5 + 111);
                            class215.method1544(var38, var35, var40, arg4, 88);
                        }
                        if (class204.field3580 <= var31) {
                            int[] var41 = class15.field238[var31];
                            class215.method1544(var36, var39, var41, arg4, 126);
                            class215.method1544(var39, var38, var41, arg1, -25);
                            class215.method1544(var38, var35, var41, arg4, -101);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lpk;Z)V")
    public static final void method57(class99 arg0, boolean arg1) {
        if (!arg1) {
            method56(-127, 1, -38, 29, 21, -25, 6);
        }
        field143++;
        class24.field481 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method58(byte arg0) {
        if (arg0 != -1) {
            return;
        }
        field142 = null;
        field138 = null;
        field144 = null;
        field140 = null;
        field147 = null;
        field149 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZILnb;)V")
    public static final void method59(boolean arg0, int arg1, class206 arg2) {
        if (arg0) {
            method60(-83, -99);
        }
        field148++;
        Object[] var3 = arg2.field3616;
        int var4 = (Integer) var3[0];
        class266 var5 = class213.method1518((byte) -82, var4);
        if (var5 == null) {
            return;
        }
        class202.field3569 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var5.field4706;
        int var9 = 0;
        byte var10 = -1;
        int[] var11 = var5.field4710;
        try {
            class74.field1363 = new int[var5.field4714];
            int var12 = 0;
            class60.field1104 = new class207[var5.field4709];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg2.field3611;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field3617;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field3614 == null ? -1 : arg2.field3614.field3933;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field3609;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field3614 == null ? -1 : arg2.field3614.field3893;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field3607 == null ? -1 : arg2.field3607.field3933;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field3607 == null ? -1 : arg2.field3607.field3893;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field3610;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field3618;
                    }
                    class74.field1363[var12++] = var16;
                } else if (var3[var14] instanceof class207) {
                    class207 var15 = (class207) var3[var14];
                    if (var15.method1436(class18.field308, (byte) 65)) {
                        var15 = arg2.field3612;
                    }
                    class60.field1104[var13++] = var15;
                }
            }
            int var17 = 0;
            label3930: while (true) {
                var17++;
                if (var17 > arg1) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var498 = var11[var7];
                if (var498 < 100) {
                    if (var498 == 0) {
                        class180.field3236[var9++] = var8[var7];
                        continue;
                    }
                    if (var498 == 1) {
                        int var18 = var8[var7];
                        class180.field3236[var9++] = class83.field1535[var18];
                        continue;
                    }
                    if (var498 == 2) {
                        int var19 = var8[var7];
                        var9--;
                        class68.method495(var19, class180.field3236[var9], (byte) -95);
                        continue;
                    }
                    if (var498 == 3) {
                        class111.field1940[var6++] = var5.field4716[var7];
                        continue;
                    }
                    if (var498 == 6) {
                        var7 += var8[var7];
                        continue;
                    }
                    if (var498 == 7) {
                        var9 -= 2;
                        if (class180.field3236[var9 + 1] != class180.field3236[var9]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var498 == 8) {
                        var9 -= 2;
                        if (class180.field3236[var9 + 1] == class180.field3236[var9]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var498 == 9) {
                        var9 -= 2;
                        if (class180.field3236[var9 + 1] > class180.field3236[var9]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var498 == 10) {
                        var9 -= 2;
                        if (class180.field3236[var9] > class180.field3236[var9 + 1]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var498 == 21) {
                        if (class202.field3569 == 0) {
                            return;
                        }
                        class278 var20 = class182.field3238[--class202.field3569];
                        var5 = var20.field4882;
                        var7 = var20.field4873;
                        var8 = var5.field4706;
                        class60.field1104 = var20.field4886;
                        class74.field1363 = var20.field4880;
                        var11 = var5.field4710;
                        continue;
                    }
                    if (var498 == 25) {
                        int var21 = var8[var7];
                        class180.field3236[var9++] = class20.method117(-31663, var21);
                        continue;
                    }
                    if (var498 == 27) {
                        int var22 = var8[var7];
                        var9--;
                        class192.method1336(class180.field3236[var9], (byte) -108, var22);
                        continue;
                    }
                    if (var498 == 31) {
                        var9 -= 2;
                        if (class180.field3236[var9 + 1] >= class180.field3236[var9]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var498 == 32) {
                        var9 -= 2;
                        if (class180.field3236[var9 + 1] <= class180.field3236[var9]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var498 == 33) {
                        class180.field3236[var9++] = class74.field1363[var8[var7]];
                        continue;
                    }
                    int var10001;
                    if (var498 == 34) {
                        var10001 = var8[var7];
                        var9--;
                        class74.field1363[var10001] = class180.field3236[var9];
                        continue;
                    }
                    if (var498 == 35) {
                        class111.field1940[var6++] = class60.field1104[var8[var7]];
                        continue;
                    }
                    if (var498 == 36) {
                        var10001 = var8[var7];
                        var6--;
                        class60.field1104[var10001] = class111.field1940[var6];
                        continue;
                    }
                    if (var498 == 37) {
                        int var23 = var8[var7];
                        var6 -= var23;
                        class207 var24 = class48.method361(16, var23, class111.field1940, var6);
                        class111.field1940[var6++] = var24;
                        continue;
                    }
                    if (var498 == 38) {
                        var9--;
                        continue;
                    }
                    if (var498 == 39) {
                        var6--;
                        continue;
                    }
                    if (var498 == 40) {
                        int var25 = var8[var7];
                        class266 var26 = class213.method1518((byte) 75, var25);
                        class207[] var27 = new class207[var26.field4709];
                        int[] var28 = new int[var26.field4714];
                        for (int var29 = 0; var29 < var26.field4718; var29++) {
                            var28[var29] = class180.field3236[var29 + var9 - var26.field4718];
                        }
                        for (int var30 = 0; var30 < var26.field4713; var30++) {
                            var27[var30] = class111.field1940[var6 + var30 - var26.field4713];
                        }
                        var9 -= var26.field4718;
                        var6 -= var26.field4713;
                        class278 var31 = new class278();
                        var31.field4882 = var5;
                        var31.field4886 = class60.field1104;
                        var31.field4873 = var7;
                        var31.field4880 = class74.field1363;
                        if (class182.field3238.length <= class202.field3569) {
                            throw new RuntimeException();
                        }
                        var7 = -1;
                        var5 = var26;
                        class182.field3238[class202.field3569++] = var31;
                        var11 = var26.field4710;
                        class74.field1363 = var28;
                        var8 = var26.field4706;
                        class60.field1104 = var27;
                        continue;
                    }
                    if (var498 == 42) {
                        class180.field3236[var9++] = class186.field3291[var8[var7]];
                        continue;
                    }
                    if (var498 == 43) {
                        int var32 = var8[var7];
                        var9--;
                        class186.field3291[var32] = class180.field3236[var9];
                        class127.method892(3377, var32);
                        continue;
                    }
                    if (var498 == 44) {
                        int var33 = var8[var7] >> 16;
                        var9--;
                        int var34 = class180.field3236[var9];
                        int var35 = var8[var7] & 0xFFFF;
                        if (var34 >= 0 && var34 <= 5000) {
                            class160.field2840[var33] = var34;
                            byte var36 = -1;
                            if (var35 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var34 <= var37) {
                                    continue label3930;
                                }
                                class98.field1729[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var498 == 45) {
                        int var38 = var8[var7];
                        var9--;
                        int var39 = class180.field3236[var9];
                        if (var39 >= 0 && var39 < class160.field2840[var38]) {
                            class180.field3236[var9++] = class98.field1729[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var498 == 46) {
                        var9 -= 2;
                        int var40 = var8[var7];
                        int var41 = class180.field3236[var9];
                        if (var41 >= 0 && class160.field2840[var40] > var41) {
                            class98.field1729[var40][var41] = class180.field3236[var9 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var498 == 47) {
                        class207 var42 = class40.field797[var8[var7]];
                        if (var42 == null) {
                            var42 = class18.field292;
                        }
                        class111.field1940[var6++] = var42;
                        continue;
                    }
                    if (var498 == 48) {
                        int var43 = var8[var7];
                        var6--;
                        class40.field797[var43] = class111.field1940[var6];
                        class263.method1817(-6645, var43);
                        continue;
                    }
                    if (var498 == 51) {
                        class275 var44 = var5.field4708[var8[var7]];
                        var9--;
                        class178 var45 = (class178) var44.method1867((long) class180.field3236[var9], true);
                        if (var45 != null) {
                            var7 += var45.field3212;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var8[var7] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var498 < 300) {
                    if (var498 == 100) {
                        var9 -= 3;
                        int var477 = class180.field3236[var9 + 2];
                        int var478 = class180.field3236[var9];
                        int var479 = class180.field3236[var9 + 1];
                        if (var479 == 0) {
                            throw new RuntimeException();
                        }
                        class220 var480 = class233.method1667(var478, 108);
                        if (var480.field3959 == null) {
                            var480.field3959 = new class220[var477 + 1];
                        }
                        if (var477 >= var480.field3959.length) {
                            class220[] var481 = new class220[var477 + 1];
                            for (int var482 = 0; var482 < var480.field3959.length; var482++) {
                                var481[var482] = var480.field3959[var482];
                            }
                            var480.field3959 = var481;
                        }
                        if (var477 > 0 && var480.field3959[var477 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var477 - 1));
                        }
                        class220 var483 = new class220();
                        var483.field4010 = true;
                        var483.field3988 = var479;
                        var483.field4045 = var483.field3933 = var480.field3933;
                        var483.field3893 = var477;
                        var480.field3959[var477] = var483;
                        if (var46) {
                            class273.field4800 = var483;
                        } else {
                            class254.field4560 = var483;
                        }
                        class82.method614((byte) 125, var480);
                        continue;
                    }
                    if (var498 == 101) {
                        class220 var484 = var46 ? class273.field4800 : class254.field4560;
                        if (var484.field3893 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class220 var485 = class233.method1667(var484.field3933, 76);
                        var485.field3959[var484.field3893] = null;
                        class82.method614((byte) 39, var485);
                        continue;
                    }
                    if (var498 == 102) {
                        var9--;
                        class220 var486 = class233.method1667(class180.field3236[var9], 105);
                        var486.field3959 = null;
                        class82.method614((byte) 126, var486);
                        continue;
                    }
                    if (var498 == 200) {
                        var9 -= 2;
                        int var487 = class180.field3236[var9];
                        int var488 = class180.field3236[var9 + 1];
                        class220 var489 = class108.method782((byte) 97, var488, var487);
                        if (var489 != null && var488 != -1) {
                            class180.field3236[var9++] = 1;
                            if (var46) {
                                class273.field4800 = var489;
                            } else {
                                class254.field4560 = var489;
                            }
                            continue;
                        }
                        class180.field3236[var9++] = 0;
                        continue;
                    }
                    if (var498 == 201) {
                        var9--;
                        int var490 = class180.field3236[var9];
                        class220 var491 = class233.method1667(var490, 87);
                        if (var491 == null) {
                            class180.field3236[var9++] = 0;
                        } else {
                            class180.field3236[var9++] = 1;
                            if (var46) {
                                class273.field4800 = var491;
                            } else {
                                class254.field4560 = var491;
                            }
                        }
                        continue;
                    }
                } else if (var498 < 500) {
                    if (var498 == 403) {
                        var9 -= 2;
                        int var470 = class180.field3236[var9];
                        int var471 = class180.field3236[var9 + 1];
                        for (int var472 = 0; var472 < class159.field2812.length; var472++) {
                            if (class159.field2812[var472] == var470) {
                                class202.field3565.field229.method370(var471, 0, var472);
                                continue label3930;
                            }
                        }
                        int var473 = 0;
                        while (true) {
                            if (var473 >= class192.field3390.length) {
                                continue label3930;
                            }
                            if (class192.field3390[var473] == var470) {
                                class202.field3565.field229.method370(var471, 0, var473);
                                continue label3930;
                            }
                            var473++;
                        }
                    }
                    if (var498 == 404) {
                        var9 -= 2;
                        int var474 = class180.field3236[var9];
                        int var475 = class180.field3236[var9 + 1];
                        class202.field3565.field229.method364(var475, 105, var474);
                        continue;
                    }
                    if (var498 == 410) {
                        var9--;
                        boolean var476 = class180.field3236[var9] != 0;
                        class202.field3565.field229.method367((byte) -92, var476);
                        continue;
                    }
                } else if (var498 >= 1000 && var498 < 1100 || var498 >= 2000 && var498 < 2100) {
                    class220 var464;
                    if (var498 < 2000) {
                        var464 = var46 ? class273.field4800 : class254.field4560;
                    } else {
                        var9--;
                        var464 = class233.method1667(class180.field3236[var9], 13);
                        var498 -= 1000;
                    }
                    if (var498 == 1000) {
                        var9 -= 4;
                        var464.field4005 = class180.field3236[var9];
                        var464.field3878 = class180.field3236[var9 + 1];
                        int var465 = class180.field3236[var9 + 3];
                        int var466 = class180.field3236[var9 + 2];
                        if (var465 < 0) {
                            var465 = 0;
                        } else if (var465 > 5) {
                            var465 = 5;
                        }
                        if (var466 < 0) {
                            var466 = 0;
                        } else if (var466 > 5) {
                            var466 = 5;
                        }
                        var464.field3889 = (byte) var465;
                        var464.field3950 = (byte) var466;
                        class82.method614((byte) 100, var464);
                        class27.method218((byte) 63, var464);
                        if (var464.field3893 == -1) {
                            class151.method1094((byte) -3, var464.field3933);
                        }
                        continue;
                    }
                    if (var498 == 1001) {
                        var9 -= 4;
                        var464.field3995 = class180.field3236[var9];
                        var464.field4009 = class180.field3236[var9 + 1];
                        var464.field3915 = 0;
                        var464.field4063 = 0;
                        int var467 = class180.field3236[var9 + 2];
                        int var468 = class180.field3236[var9 + 3];
                        if (var468 < 0) {
                            var468 = 0;
                        } else if (var468 > 4) {
                            var468 = 4;
                        }
                        var464.field3919 = (byte) var468;
                        if (var467 < 0) {
                            var467 = 0;
                        } else if (var467 > 4) {
                            var467 = 4;
                        }
                        var464.field3876 = (byte) var467;
                        class82.method614((byte) 73, var464);
                        class27.method218((byte) 33, var464);
                        if (var464.field3988 == 0) {
                            class191.method1333(var464, false, -230095088);
                        }
                        continue;
                    }
                    if (var498 == 1003) {
                        var9--;
                        boolean var469 = class180.field3236[var9] == 1;
                        if (var464.field3904 != var469) {
                            var464.field3904 = var469;
                            class82.method614((byte) 68, var464);
                        }
                        if (var464.field3893 == -1) {
                            class175.method1255(3008, var464.field3933);
                        }
                        continue;
                    }
                    if (var498 == 1004) {
                        var9 -= 2;
                        var464.field3935 = class180.field3236[var9];
                        var464.field3931 = class180.field3236[var9 + 1];
                        class82.method614((byte) 44, var464);
                        class27.method218((byte) 95, var464);
                        if (var464.field3988 == 0) {
                            class191.method1333(var464, false, -230095088);
                        }
                        continue;
                    }
                    if (var498 == 1005) {
                        var9--;
                        var464.field3874 = class180.field3236[var9] == 1;
                        continue;
                    }
                } else if (!(var498 < 1100 || var498 >= 1200) || !(var498 < 2100 || var498 >= 2200)) {
                    class220 var461;
                    if (var498 >= 2000) {
                        var498 -= 1000;
                        var9--;
                        var461 = class233.method1667(class180.field3236[var9], 76);
                    } else {
                        var461 = var46 ? class273.field4800 : class254.field4560;
                    }
                    if (var498 == 1100) {
                        var9 -= 2;
                        var461.field3891 = class180.field3236[var9];
                        if ((var461.field3925 - var461.field4037) < var461.field3891) {
                            var461.field3891 = var461.field3925 - var461.field4037;
                        }
                        if (var461.field3891 < 0) {
                            var461.field3891 = 0;
                        }
                        var461.field4059 = class180.field3236[var9 + 1];
                        if (var461.field4059 > (var461.field3991 - var461.field3948)) {
                            var461.field4059 = var461.field3991 - var461.field3948;
                        }
                        if (var461.field4059 < 0) {
                            var461.field4059 = 0;
                        }
                        class82.method614((byte) 50, var461);
                        if (var461.field3893 == -1) {
                            class108.method783((byte) 121, var461.field3933);
                        }
                        continue;
                    }
                    if (var498 == 1101) {
                        var9--;
                        var461.field3993 = class180.field3236[var9];
                        class82.method614((byte) 110, var461);
                        if (var461.field3893 == -1) {
                            class273.method1854(false, var461.field3933);
                        }
                        continue;
                    }
                    if (var498 == 1102) {
                        var9--;
                        var461.field4032 = class180.field3236[var9] == 1;
                        class82.method614((byte) 99, var461);
                        continue;
                    }
                    if (var498 == 1103) {
                        var9--;
                        var461.field3894 = class180.field3236[var9];
                        class82.method614((byte) 96, var461);
                        continue;
                    }
                    if (var498 == 1104) {
                        var9--;
                        var461.field3940 = class180.field3236[var9];
                        class82.method614((byte) 77, var461);
                        continue;
                    }
                    if (var498 == 1105) {
                        var9--;
                        var461.field3954 = class180.field3236[var9];
                        class82.method614((byte) 108, var461);
                        continue;
                    }
                    if (var498 == 1106) {
                        var9--;
                        var461.field3951 = class180.field3236[var9];
                        class82.method614((byte) 63, var461);
                        continue;
                    }
                    if (var498 == 1107) {
                        var9--;
                        var461.field4046 = class180.field3236[var9] == 1;
                        class82.method614((byte) 113, var461);
                        continue;
                    }
                    if (var498 == 1108) {
                        var461.field3944 = 1;
                        var9--;
                        var461.field4047 = class180.field3236[var9];
                        class82.method614((byte) 51, var461);
                        if (var461.field3893 == -1) {
                            class55.method416(false, var461.field3933);
                        }
                        continue;
                    }
                    if (var498 == 1109) {
                        var9 -= 6;
                        var461.field3877 = class180.field3236[var9];
                        var461.field3977 = class180.field3236[var9 + 1];
                        var461.field3987 = class180.field3236[var9 + 2];
                        var461.field3875 = class180.field3236[var9 + 3];
                        var461.field3920 = class180.field3236[var9 + 4];
                        var461.field3881 = class180.field3236[var9 + 5];
                        class82.method614((byte) 62, var461);
                        if (var461.field3893 == -1) {
                            class277.method1883(arg0, var461.field3933);
                            class69.method503((byte) -18, var461.field3933);
                        }
                        continue;
                    }
                    if (var498 == 1110) {
                        var9--;
                        int var462 = class180.field3236[var9];
                        if (var461.field3882 != var462) {
                            var461.field4012 = 1;
                            var461.field3882 = var462;
                            var461.field4033 = 0;
                            var461.field4017 = 0;
                            class82.method614((byte) 116, var461);
                        }
                        if (var461.field3893 == -1) {
                            class40.method306(0, var461.field3933);
                        }
                        continue;
                    }
                    if (var498 == 1111) {
                        var9--;
                        var461.field3928 = class180.field3236[var9] == 1;
                        class82.method614((byte) 45, var461);
                        continue;
                    }
                    if (var498 == 1112) {
                        var6--;
                        class207 var463 = class111.field1940[var6];
                        if (!var463.method1436(var461.field3998, (byte) 47)) {
                            var461.field3998 = var463;
                            class82.method614((byte) 93, var461);
                        }
                        if (var461.field3893 == -1) {
                            class232.method1659(var461.field3933, -4);
                        }
                        continue;
                    }
                    if (var498 == 1113) {
                        var9--;
                        var461.field3888 = class180.field3236[var9];
                        class82.method614((byte) 78, var461);
                        continue;
                    }
                    if (var498 == 1114) {
                        var9 -= 3;
                        var461.field3965 = class180.field3236[var9];
                        var461.field3989 = class180.field3236[var9 + 1];
                        var461.field4003 = class180.field3236[var9 + 2];
                        class82.method614((byte) 76, var461);
                        continue;
                    }
                    if (var498 == 1115) {
                        var9--;
                        var461.field4001 = class180.field3236[var9] == 1;
                        class82.method614((byte) 82, var461);
                        continue;
                    }
                    if (var498 == 1116) {
                        var9--;
                        var461.field3958 = class180.field3236[var9];
                        class82.method614((byte) 96, var461);
                        continue;
                    }
                    if (var498 == 1117) {
                        var9--;
                        var461.field4050 = class180.field3236[var9];
                        class82.method614((byte) 63, var461);
                        continue;
                    }
                    if (var498 == 1118) {
                        var9--;
                        var461.field4040 = class180.field3236[var9] == 1;
                        class82.method614((byte) 76, var461);
                        continue;
                    }
                    if (var498 == 1119) {
                        var9--;
                        var461.field4061 = class180.field3236[var9] == 1;
                        class82.method614((byte) 92, var461);
                        continue;
                    }
                    if (var498 == 1120) {
                        var9 -= 2;
                        var461.field3925 = class180.field3236[var9];
                        var461.field3991 = class180.field3236[var9 + 1];
                        class82.method614((byte) 121, var461);
                        if (var461.field3988 == 0) {
                            class191.method1333(var461, false, -230095088);
                        }
                        continue;
                    }
                    if (var498 == 1121) {
                        var9 -= 2;
                        class82.method614((byte) 116, var461);
                        continue;
                    }
                    if (var498 == 1122) {
                        var9--;
                        var461.field3908 = class180.field3236[var9] == 1;
                        class82.method614((byte) 110, var461);
                        continue;
                    }
                    if (var498 == 1123) {
                        var9--;
                        var461.field3881 = class180.field3236[var9];
                        class82.method614((byte) 108, var461);
                        if (var461.field3893 == -1) {
                            class277.method1883(false, var461.field3933);
                        }
                        continue;
                    }
                } else if (var498 >= 1200 && var498 < 1300 || var498 >= 2200 && var498 < 2300) {
                    class220 var457;
                    if (var498 < 2000) {
                        var457 = var46 ? class273.field4800 : class254.field4560;
                    } else {
                        var9--;
                        var457 = class233.method1667(class180.field3236[var9], 24);
                        var498 -= 1000;
                    }
                    class82.method614((byte) 59, var457);
                    if (var498 == 1200 || var498 == 1205) {
                        var9 -= 2;
                        int var458 = class180.field3236[var9];
                        int var459 = class180.field3236[var9 + 1];
                        if (var457.field3893 == -1) {
                            class43.method333((byte) -117, var457.field3933);
                            class277.method1883(false, var457.field3933);
                            class69.method503((byte) -18, var457.field3933);
                        }
                        if (var458 == -1) {
                            var457.field3944 = 1;
                            var457.field4047 = -1;
                            var457.field3884 = -1;
                        } else {
                            var457.field3884 = var458;
                            var457.field3911 = var459;
                            class173 var460 = class117.method829(var458, (byte) 74);
                            var457.field3920 = var460.field3059;
                            var457.field3877 = var460.field3119;
                            var457.field3987 = var460.field3061;
                            var457.field3875 = var460.field3049;
                            var457.field3977 = var460.field3088;
                            var457.field3881 = var460.field3122;
                            if (var457.field4063 > 0) {
                                var457.field3881 = var457.field3881 * 32 / var457.field4063;
                            } else if (var457.field3995 > 0) {
                                var457.field3881 = var457.field3881 * 32 / var457.field3995;
                            }
                            if (var498 == 1205) {
                                var457.field4054 = false;
                            } else {
                                var457.field4054 = true;
                            }
                        }
                        continue;
                    }
                    if (var498 == 1201) {
                        var457.field3944 = 2;
                        var9--;
                        var457.field4047 = class180.field3236[var9];
                        if (var457.field3893 == -1) {
                            class55.method416(arg0, var457.field3933);
                        }
                        continue;
                    }
                    if (var498 == 1202) {
                        var457.field3944 = 3;
                        var457.field4047 = class202.field3565.field229.method371(305419896);
                        if (var457.field3893 == -1) {
                            class55.method416(false, var457.field3933);
                        }
                        continue;
                    }
                    if (var498 == 1203) {
                        var457.field3944 = 6;
                        var9--;
                        var457.field4047 = class180.field3236[var9];
                        if (var457.field3893 == -1) {
                            class55.method416(false, var457.field3933);
                        }
                        continue;
                    }
                    if (var498 == 1204) {
                        var457.field3944 = 5;
                        var9--;
                        var457.field4047 = class180.field3236[var9];
                        if (var457.field3893 == -1) {
                            class55.method416(false, var457.field3933);
                        }
                        continue;
                    }
                } else if (var498 >= 1300 && var498 < 1400 || var498 >= 2300 && var498 < 2400) {
                    class220 var451;
                    if (var498 < 2000) {
                        var451 = var46 ? class273.field4800 : class254.field4560;
                    } else {
                        var9--;
                        var451 = class233.method1667(class180.field3236[var9], 107);
                        var498 -= 1000;
                    }
                    if (var498 == 1300) {
                        var9--;
                        int var452 = class180.field3236[var9] - 1;
                        if (var452 >= 0 && var452 <= 9) {
                            var6--;
                            var451.method1567(class111.field1940[var6], 26633, var452);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var498 == 1301) {
                        var9 -= 2;
                        int var453 = class180.field3236[var9];
                        int var454 = class180.field3236[var9 + 1];
                        var451.field4006 = class108.method782((byte) 116, var454, var453);
                        continue;
                    }
                    if (var498 == 1302) {
                        var9--;
                        var451.field3885 = class180.field3236[var9] == 1;
                        continue;
                    }
                    if (var498 == 1303) {
                        var9--;
                        var451.field3916 = class180.field3236[var9];
                        continue;
                    }
                    if (var498 == 1304) {
                        var9--;
                        var451.field4043 = class180.field3236[var9];
                        continue;
                    }
                    if (var498 == 1305) {
                        var6--;
                        var451.field3980 = class111.field1940[var6];
                        continue;
                    }
                    if (var498 == 1306) {
                        var6--;
                        var451.field3914 = class111.field1940[var6];
                        continue;
                    }
                    if (var498 == 1307) {
                        var451.field3947 = null;
                        continue;
                    }
                    if (var498 == 1308) {
                        var9--;
                        var451.field4015 = class180.field3236[var9];
                        var9--;
                        var451.field3902 = class180.field3236[var9];
                        continue;
                    }
                    if (var498 == 1309) {
                        var9--;
                        int var455 = class180.field3236[var9];
                        var9--;
                        int var456 = class180.field3236[var9];
                        if (var456 >= 1 && var456 <= 10) {
                            var451.method1573(var456 - 1, 1, var455);
                        }
                        continue;
                    }
                } else {
                    if (var498 >= 1400 && var498 < 1500 || var498 >= 2400 && var498 < 2500) {
                        class220 var444;
                        if (var498 < 2000) {
                            var444 = var46 ? class273.field4800 : class254.field4560;
                        } else {
                            var498 -= 1000;
                            var9--;
                            var444 = class233.method1667(class180.field3236[var9], 71);
                        }
                        int[] var445 = null;
                        var6--;
                        class207 var446 = class111.field1940[var6];
                        if (var446.method1450((byte) -120) > 0 && var446.method1457(var446.method1450((byte) -112) - 1, -12675) == 89) {
                            var9--;
                            int var447 = class180.field3236[var9];
                            if (var447 > 0) {
                                var445 = new int[var447];
                                while (var447-- > 0) {
                                    var9--;
                                    var445[var447] = class180.field3236[var9];
                                }
                            }
                            var446 = var446.method1427(-17195, 0, var446.method1450((byte) 23) - 1);
                        }
                        Object[] var448 = new Object[var446.method1450((byte) 80) + 1];
                        for (int var449 = var448.length - 1; var449 >= 1; var449--) {
                            if (var446.method1457(var449 - 1, -12675) == 115) {
                                var6--;
                                var448[var449] = class111.field1940[var6];
                            } else {
                                var9--;
                                var448[var449] = Integer.valueOf(class180.field3236[var9]);
                            }
                        }
                        var9--;
                        int var450 = class180.field3236[var9];
                        if (var450 == -1) {
                            var448 = null;
                        } else {
                            var448[0] = Integer.valueOf(var450);
                        }
                        var444.field4049 = true;
                        if (var498 == 1400) {
                            var444.field4025 = var448;
                        } else if (var498 == 1401) {
                            var444.field4048 = var448;
                        } else if (var498 == 1402) {
                            var444.field3955 = var448;
                        } else if (var498 == 1403) {
                            var444.field3932 = var448;
                        } else if (var498 == 1404) {
                            var444.field3975 = var448;
                        } else if (var498 == 1405) {
                            var444.field4039 = var448;
                        } else if (var498 == 1406) {
                            var444.field3880 = var448;
                        } else if (var498 == 1407) {
                            var444.field3967 = var445;
                            var444.field3873 = var448;
                        } else if (var498 == 1408) {
                            var444.field3974 = var448;
                        } else if (var498 == 1409) {
                            var444.field4057 = var448;
                        } else if (var498 == 1410) {
                            var444.field4044 = var448;
                        } else if (var498 == 1411) {
                            var444.field3890 = var448;
                        } else if (var498 == 1412) {
                            var444.field3964 = var448;
                        } else if (var498 == 1414) {
                            var444.field3971 = var448;
                            var444.field4013 = var445;
                        } else if (var498 == 1415) {
                            var444.field4034 = var445;
                            var444.field3892 = var448;
                        } else if (var498 == 1416) {
                            var444.field3898 = var448;
                        } else if (var498 == 1417) {
                            var444.field4055 = var448;
                        } else if (var498 == 1418) {
                            var444.field3937 = var448;
                        } else if (var498 == 1419) {
                            var444.field4036 = var448;
                        } else if (var498 == 1420) {
                            var444.field3938 = var448;
                        } else if (var498 == 1421) {
                            var444.field3966 = var448;
                        } else if (var498 == 1422) {
                            var444.field3903 = var448;
                        } else if (var498 == 1423) {
                            var444.field3970 = var448;
                        } else if (var498 == 1424) {
                            var444.field4023 = var448;
                        } else if (var498 == 1425) {
                            var444.field3906 = var448;
                        } else if (var498 == 1426) {
                            var444.field3936 = var448;
                        } else if (var498 == 1427) {
                            var444.field3992 = var448;
                        } else if (var498 == 1428) {
                            var444.field4021 = var448;
                            var444.field4035 = var445;
                        } else if (var498 == 1429) {
                            var444.field3879 = var445;
                            var444.field3942 = var448;
                        }
                        continue;
                    }
                    if (var498 < 1600) {
                        class220 var47 = var46 ? class273.field4800 : class254.field4560;
                        if (var498 == 1500) {
                            class180.field3236[var9++] = var47.field3909;
                            continue;
                        }
                        if (var498 == 1501) {
                            class180.field3236[var9++] = var47.field3912;
                            continue;
                        }
                        if (var498 == 1502) {
                            class180.field3236[var9++] = var47.field4037;
                            continue;
                        }
                        if (var498 == 1503) {
                            class180.field3236[var9++] = var47.field3948;
                            continue;
                        }
                        if (var498 == 1504) {
                            class180.field3236[var9++] = var47.field3904 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 1505) {
                            class180.field3236[var9++] = var47.field4045;
                            continue;
                        }
                    } else if (var498 < 1700) {
                        class220 var443 = var46 ? class273.field4800 : class254.field4560;
                        if (var498 == 1600) {
                            class180.field3236[var9++] = var443.field3891;
                            continue;
                        }
                        if (var498 == 1601) {
                            class180.field3236[var9++] = var443.field4059;
                            continue;
                        }
                        if (var498 == 1602) {
                            class111.field1940[var6++] = var443.field3998;
                            continue;
                        }
                        if (var498 == 1603) {
                            class180.field3236[var9++] = var443.field3925;
                            continue;
                        }
                        if (var498 == 1604) {
                            class180.field3236[var9++] = var443.field3991;
                            continue;
                        }
                        if (var498 == 1605) {
                            class180.field3236[var9++] = var443.field3881;
                            continue;
                        }
                        if (var498 == 1606) {
                            class180.field3236[var9++] = var443.field3987;
                            continue;
                        }
                        if (var498 == 1607) {
                            class180.field3236[var9++] = var443.field3920;
                            continue;
                        }
                        if (var498 == 1608) {
                            class180.field3236[var9++] = var443.field3875;
                            continue;
                        }
                        if (var498 == 1609) {
                            class180.field3236[var9++] = var443.field3894;
                            continue;
                        }
                        if (var498 == 1610) {
                            class180.field3236[var9++] = var443.field3877;
                            continue;
                        }
                        if (var498 == 1611) {
                            class180.field3236[var9++] = var443.field3977;
                            continue;
                        }
                        if (var498 == 1612) {
                            class180.field3236[var9++] = var443.field3954;
                            continue;
                        }
                    } else if (var498 < 1800) {
                        class220 var442 = var46 ? class273.field4800 : class254.field4560;
                        if (var498 == 1700) {
                            class180.field3236[var9++] = var442.field3884;
                            continue;
                        }
                        if (var498 == 1701) {
                            if (var442.field3884 == -1) {
                                class180.field3236[var9++] = 0;
                            } else {
                                class180.field3236[var9++] = var442.field3911;
                            }
                            continue;
                        }
                        if (var498 == 1702) {
                            class180.field3236[var9++] = var442.field3893;
                            continue;
                        }
                    } else if (var498 < 1900) {
                        class220 var48 = var46 ? class273.field4800 : class254.field4560;
                        if (var498 == 1800) {
                            class180.field3236[var9++] = client.method1112(var48).method837(1);
                            continue;
                        }
                        if (var498 == 1801) {
                            var9--;
                            int var49 = class180.field3236[var9];
                            int var499 = var49 - 1;
                            if (var48.field3947 != null && var499 < var48.field3947.length && var48.field3947[var499] != null) {
                                class111.field1940[var6++] = var48.field3947[var499];
                                continue;
                            }
                            class111.field1940[var6++] = class201.field3548;
                            continue;
                        }
                        if (var498 == 1802) {
                            if (var48.field3980 == null) {
                                class111.field1940[var6++] = class201.field3548;
                            } else {
                                class111.field1940[var6++] = var48.field3980;
                            }
                            continue;
                        }
                    } else if (var498 < 2600) {
                        var9--;
                        class220 var441 = class233.method1667(class180.field3236[var9], 73);
                        if (var498 == 2500) {
                            class180.field3236[var9++] = var441.field3909;
                            continue;
                        }
                        if (var498 == 2501) {
                            class180.field3236[var9++] = var441.field3912;
                            continue;
                        }
                        if (var498 == 2502) {
                            class180.field3236[var9++] = var441.field4037;
                            continue;
                        }
                        if (var498 == 2503) {
                            class180.field3236[var9++] = var441.field3948;
                            continue;
                        }
                        if (var498 == 2504) {
                            class180.field3236[var9++] = var441.field3904 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 2505) {
                            class180.field3236[var9++] = var441.field4045;
                            continue;
                        }
                    } else if (var498 < 2700) {
                        var9--;
                        class220 var50 = class233.method1667(class180.field3236[var9], 91);
                        if (var498 == 2600) {
                            class180.field3236[var9++] = var50.field3891;
                            continue;
                        }
                        if (var498 == 2601) {
                            class180.field3236[var9++] = var50.field4059;
                            continue;
                        }
                        if (var498 == 2602) {
                            class111.field1940[var6++] = var50.field3998;
                            continue;
                        }
                        if (var498 == 2603) {
                            class180.field3236[var9++] = var50.field3925;
                            continue;
                        }
                        if (var498 == 2604) {
                            class180.field3236[var9++] = var50.field3991;
                            continue;
                        }
                        if (var498 == 2605) {
                            class180.field3236[var9++] = var50.field3881;
                            continue;
                        }
                        if (var498 == 2606) {
                            class180.field3236[var9++] = var50.field3987;
                            continue;
                        }
                        if (var498 == 2607) {
                            class180.field3236[var9++] = var50.field3920;
                            continue;
                        }
                        if (var498 == 2608) {
                            class180.field3236[var9++] = var50.field3875;
                            continue;
                        }
                        if (var498 == 2609) {
                            class180.field3236[var9++] = var50.field3894;
                            continue;
                        }
                        if (var498 == 2610) {
                            class180.field3236[var9++] = var50.field3877;
                            continue;
                        }
                        if (var498 == 2611) {
                            class180.field3236[var9++] = var50.field3977;
                            continue;
                        }
                        if (var498 == 2612) {
                            class180.field3236[var9++] = var50.field3954;
                            continue;
                        }
                    } else if (var498 < 2800) {
                        if (var498 == 2700) {
                            var9--;
                            class220 var51 = class233.method1667(class180.field3236[var9], 89);
                            class180.field3236[var9++] = var51.field3884;
                            continue;
                        }
                        if (var498 == 2701) {
                            var9--;
                            class220 var52 = class233.method1667(class180.field3236[var9], 104);
                            if (var52.field3884 == -1) {
                                class180.field3236[var9++] = 0;
                            } else {
                                class180.field3236[var9++] = var52.field3911;
                            }
                            continue;
                        }
                        if (var498 == 2702) {
                            var9--;
                            int var53 = class180.field3236[var9];
                            class47 var54 = (class47) class171.field3028.method1867((long) var53, !arg0);
                            if (var54 == null) {
                                class180.field3236[var9++] = 0;
                            } else {
                                class180.field3236[var9++] = 1;
                            }
                            continue;
                        }
                        if (var498 == 2703) {
                            var9--;
                            class220 var55 = class233.method1667(class180.field3236[var9], 34);
                            if (var55.field3959 == null) {
                                class180.field3236[var9++] = 0;
                                continue;
                            }
                            int var56 = var55.field3959.length;
                            for (int var57 = 0; var57 < var55.field3959.length; var57++) {
                                if (var55.field3959[var57] == null) {
                                    var56 = var57;
                                    break;
                                }
                            }
                            class180.field3236[var9++] = var56;
                            continue;
                        }
                        if (var498 == 2704 || var498 == 2705) {
                            var9 -= 2;
                            int var58 = class180.field3236[var9];
                            int var59 = class180.field3236[var9 + 1];
                            class47 var60 = (class47) class171.field3028.method1867((long) var58, true);
                            if (var60 != null && var60.field934 == var59) {
                                class180.field3236[var9++] = 1;
                                continue;
                            }
                            class180.field3236[var9++] = 0;
                            continue;
                        }
                    } else if (var498 < 2900) {
                        var9--;
                        class220 var61 = class233.method1667(class180.field3236[var9], 126);
                        if (var498 == 2800) {
                            class180.field3236[var9++] = client.method1112(var61).method837(1);
                            continue;
                        }
                        if (var498 == 2801) {
                            var9--;
                            int var62 = class180.field3236[var9];
                            int var500 = var62 - 1;
                            if (var61.field3947 != null && var500 < var61.field3947.length && var61.field3947[var500] != null) {
                                class111.field1940[var6++] = var61.field3947[var500];
                                continue;
                            }
                            class111.field1940[var6++] = class201.field3548;
                            continue;
                        }
                        if (var498 == 2802) {
                            if (var61.field3980 == null) {
                                class111.field1940[var6++] = class201.field3548;
                            } else {
                                class111.field1940[var6++] = var61.field3980;
                            }
                            continue;
                        }
                    } else if (var498 < 3200) {
                        if (var498 == 3100) {
                            var6--;
                            class207 var426 = class111.field1940[var6];
                            class71.method511(23692, class201.field3548, 0, var426);
                            continue;
                        }
                        if (var498 == 3101) {
                            var9 -= 2;
                            class28.method221(class202.field3565, class180.field3236[var9 + 1], class180.field3236[var9], (byte) 124);
                            continue;
                        }
                        if (var498 == 3103) {
                            class232.method1661(!arg0);
                            continue;
                        }
                        if (var498 == 3104) {
                            class24.field474++;
                            var6--;
                            class207 var427 = class111.field1940[var6];
                            int var428 = 0;
                            if (var427.method1433((byte) 121)) {
                                var428 = var427.method1442(-95);
                            }
                            class261.field4645.method767(237, (byte) 100);
                            class261.field4645.method1068(var428, 120);
                            continue;
                        }
                        if (var498 == 3105) {
                            class178.field3214++;
                            var6--;
                            class207 var429 = class111.field1940[var6];
                            class261.field4645.method767(184, (byte) 106);
                            class261.field4645.method1048((byte) 95, var429.method1428(0));
                            continue;
                        }
                        if (var498 == 3106) {
                            class129.field2253++;
                            var6--;
                            class207 var430 = class111.field1940[var6];
                            class261.field4645.method767(242, (byte) 118);
                            class261.field4645.method1041(true, var430.method1450((byte) -126) + 1);
                            class261.field4645.method1040(true, var430);
                            continue;
                        }
                        if (var498 == 3107) {
                            var9--;
                            int var431 = class180.field3236[var9];
                            var6--;
                            class207 var432 = class111.field1940[var6];
                            class101.method739(var431, var432, -122);
                            continue;
                        }
                        if (var498 == 3108) {
                            var9 -= 3;
                            int var433 = class180.field3236[var9];
                            int var434 = class180.field3236[var9 + 2];
                            int var435 = class180.field3236[var9 + 1];
                            class220 var436 = class233.method1667(var434, 40);
                            class3.method15(var433, arg0, var436, var435);
                            continue;
                        }
                        if (var498 == 3109) {
                            var9 -= 2;
                            int var437 = class180.field3236[var9 + 1];
                            int var438 = class180.field3236[var9];
                            class220 var439 = var46 ? class273.field4800 : class254.field4560;
                            class3.method15(var438, arg0, var439, var437);
                            continue;
                        }
                        if (var498 == 3110) {
                            var9--;
                            int var440 = class180.field3236[var9];
                            class51.field986++;
                            class261.field4645.method767(167, (byte) 26);
                            class261.field4645.method1083(arg0, var440);
                            continue;
                        }
                    } else if (var498 < 3300) {
                        if (var498 == 3200) {
                            var9 -= 3;
                            class197.method1368(class180.field3236[var9 + 2], class180.field3236[var9 + 1], true, class180.field3236[var9]);
                            continue;
                        }
                        if (var498 == 3201) {
                            var9--;
                            class110.method791(class180.field3236[var9], (byte) 57);
                            continue;
                        }
                        if (var498 == 3202) {
                            var9 -= 2;
                            class3.method12(0, class180.field3236[var9 + 1], class180.field3236[var9]);
                            continue;
                        }
                    } else if (var498 < 3400) {
                        if (var498 == 3300) {
                            class180.field3236[var9++] = class160.field2844;
                            continue;
                        }
                        if (var498 == 3301) {
                            var9 -= 2;
                            int var63 = class180.field3236[var9 + 1];
                            int var64 = class180.field3236[var9];
                            class180.field3236[var9++] = class155.method1122(-58, var64, var63);
                            continue;
                        }
                        if (var498 == 3302) {
                            var9 -= 2;
                            int var65 = class180.field3236[var9];
                            int var66 = class180.field3236[var9 + 1];
                            class180.field3236[var9++] = class65.method468((byte) -39, var66, var65);
                            continue;
                        }
                        if (var498 == 3303) {
                            var9 -= 2;
                            int var67 = class180.field3236[var9];
                            int var68 = class180.field3236[var9 + 1];
                            class180.field3236[var9++] = class208.method1474(var68, var67, true);
                            continue;
                        }
                        if (var498 == 3304) {
                            var9--;
                            int var69 = class180.field3236[var9];
                            class180.field3236[var9++] = class174.method1248(5, var69).field258;
                            continue;
                        }
                        if (var498 == 3305) {
                            var9--;
                            int var70 = class180.field3236[var9];
                            class180.field3236[var9++] = class247.field4486[var70];
                            continue;
                        }
                        if (var498 == 3306) {
                            var9--;
                            int var71 = class180.field3236[var9];
                            class180.field3236[var9++] = class119.field2059[var71];
                            continue;
                        }
                        if (var498 == 3307) {
                            var9--;
                            int var72 = class180.field3236[var9];
                            class180.field3236[var9++] = class62.field1135[var72];
                            continue;
                        }
                        if (var498 == 3308) {
                            int var73 = class93.field1645;
                            int var74 = (class202.field3565.field5104 >> 7) + class21.field349;
                            int var75 = (class202.field3565.field5072 >> 7) + class180.field3231;
                            class180.field3236[var9++] = (var73 << 28) + (var74 << 14) + var75;
                            continue;
                        }
                        if (var498 == 3309) {
                            var9--;
                            int var76 = class180.field3236[var9];
                            class180.field3236[var9++] = class121.method860(var76 >> 14, 16383);
                            continue;
                        }
                        if (var498 == 3310) {
                            var9--;
                            int var77 = class180.field3236[var9];
                            class180.field3236[var9++] = var77 >> 28;
                            continue;
                        }
                        if (var498 == 3311) {
                            var9--;
                            int var78 = class180.field3236[var9];
                            class180.field3236[var9++] = class121.method860(16383, var78);
                            continue;
                        }
                        if (var498 == 3312) {
                            class180.field3236[var9++] = class16.field253 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3313) {
                            var9 -= 2;
                            int var79 = class180.field3236[var9] + 32768;
                            int var80 = class180.field3236[var9 + 1];
                            class180.field3236[var9++] = class155.method1122(-45, var79, var80);
                            continue;
                        }
                        if (var498 == 3314) {
                            var9 -= 2;
                            int var81 = class180.field3236[var9] + 32768;
                            int var82 = class180.field3236[var9 + 1];
                            class180.field3236[var9++] = class65.method468((byte) -38, var82, var81);
                            continue;
                        }
                        if (var498 == 3315) {
                            var9 -= 2;
                            int var83 = class180.field3236[var9] + 32768;
                            int var84 = class180.field3236[var9 + 1];
                            class180.field3236[var9++] = class208.method1474(var84, var83, !arg0);
                            continue;
                        }
                        if (var498 == 3316) {
                            if (class123.field2134 >= 2) {
                                class180.field3236[var9++] = class123.field2134;
                            } else {
                                class180.field3236[var9++] = 0;
                            }
                            continue;
                        }
                        if (var498 == 3317) {
                            class180.field3236[var9++] = class280.field4923;
                            continue;
                        }
                        if (var498 == 3318) {
                            class180.field3236[var9++] = class173.field3089;
                            continue;
                        }
                        if (var498 == 3321) {
                            class180.field3236[var9++] = class36.field687;
                            continue;
                        }
                        if (var498 == 3322) {
                            class180.field3236[var9++] = class40.field800;
                            continue;
                        }
                        if (var498 == 3323) {
                            if (class138.field2388 >= 5 && class138.field2388 <= 9) {
                                class180.field3236[var9++] = 1;
                                continue;
                            }
                            class180.field3236[var9++] = 0;
                            continue;
                        }
                        if (var498 == 3324) {
                            if (class138.field2388 >= 5 && class138.field2388 <= 9) {
                                class180.field3236[var9++] = class138.field2388;
                                continue;
                            }
                            class180.field3236[var9++] = 0;
                            continue;
                        }
                        if (var498 == 3325) {
                            class180.field3236[var9++] = class204.field3587 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3326) {
                            class180.field3236[var9++] = class202.field3565.field224;
                            continue;
                        }
                        if (var498 == 3327) {
                            class180.field3236[var9++] = class202.field3565.field229.field974 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3328) {
                            class180.field3236[var9++] = class8.field112 && !class78.field1427 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3329) {
                            class180.field3236[var9++] = class92.field1638 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3330) {
                            var9--;
                            int var85 = class180.field3236[var9];
                            class180.field3236[var9++] = class243.method1713(var85, 0);
                            continue;
                        }
                        if (var498 == 3331) {
                            var9 -= 2;
                            int var86 = class180.field3236[var9];
                            int var87 = class180.field3236[var9 + 1];
                            class180.field3236[var9++] = class195.method1353(var86, (byte) 119, false, var87);
                            continue;
                        }
                        if (var498 == 3332) {
                            var9 -= 2;
                            int var88 = class180.field3236[var9];
                            int var89 = class180.field3236[var9 + 1];
                            class180.field3236[var9++] = class195.method1353(var88, (byte) 123, true, var89);
                            continue;
                        }
                        if (var498 == 3333) {
                            class180.field3236[var9++] = class8.field114;
                            continue;
                        }
                        if (var498 == 3335) {
                            class180.field3236[var9++] = class272.field4795;
                            continue;
                        }
                        if (var498 == 3336) {
                            var9 -= 4;
                            int var90 = class180.field3236[var9];
                            int var91 = class180.field3236[var9 + 1];
                            int var92 = class180.field3236[var9 + 2];
                            int var93 = (var91 << 14) + var90;
                            int var94 = (var92 << 28) + var93;
                            int var95 = class180.field3236[var9 + 3];
                            int var96 = var94 + var95;
                            class180.field3236[var9++] = var96;
                            continue;
                        }
                        if (var498 == 3337) {
                            class180.field3236[var9++] = class156.field2737;
                            continue;
                        }
                    } else if (var498 < 3500) {
                        if (var498 == 3400) {
                            var9 -= 2;
                            int var97 = class180.field3236[var9];
                            int var98 = class180.field3236[var9 + 1];
                            class230 var99 = class121.method859(var97, false);
                            class111.field1940[var6++] = var99.method1647(var98, (byte) 116);
                            continue;
                        }
                        if (var498 == 3408) {
                            var9 -= 4;
                            int var100 = class180.field3236[var9];
                            int var101 = class180.field3236[var9 + 1];
                            int var102 = class180.field3236[var9 + 2];
                            int var103 = class180.field3236[var9 + 3];
                            class230 var104 = class121.method859(var102, false);
                            if (var104.field4228 == var100 && var104.field4231 == var101) {
                                if (var101 == 115) {
                                    class111.field1940[var6++] = var104.method1647(var103, (byte) 102);
                                } else {
                                    class180.field3236[var9++] = var104.method1651(95, var103);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var498 == 3409) {
                            var9 -= 3;
                            int var105 = class180.field3236[var9 + 1];
                            int var106 = class180.field3236[var9];
                            int var107 = class180.field3236[var9 + 2];
                            if (var105 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class230 var108 = class121.method859(var105, arg0);
                            if (var108.field4231 != var106) {
                                throw new RuntimeException("C3409-1");
                            }
                            class180.field3236[var9++] = var108.method1646(var107, -91) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3410) {
                            var9--;
                            int var109 = class180.field3236[var9];
                            var6--;
                            class207 var110 = class111.field1940[var6];
                            if (var109 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class230 var111 = class121.method859(var109, arg0);
                            if (var111.field4231 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class180.field3236[var9++] = var111.method1643(var110, -7505) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3411) {
                            var9--;
                            int var112 = class180.field3236[var9];
                            class230 var113 = class121.method859(var112, false);
                            class180.field3236[var9++] = var113.field4217.method1877((byte) 92);
                            continue;
                        }
                    } else if (var498 < 3700) {
                        if (var498 == 3600) {
                            if (class138.field2397 == 0) {
                                class180.field3236[var9++] = -2;
                            } else if (class138.field2397 == 1) {
                                class180.field3236[var9++] = -1;
                            } else {
                                class180.field3236[var9++] = class25.field534;
                            }
                            continue;
                        }
                        if (var498 == 3601) {
                            var9--;
                            int var404 = class180.field3236[var9];
                            if (class138.field2397 == 2 && class25.field534 > var404) {
                                class111.field1940[var6++] = class129.field2240[var404];
                                continue;
                            }
                            class111.field1940[var6++] = class201.field3548;
                            continue;
                        }
                        if (var498 == 3602) {
                            var9--;
                            int var405 = class180.field3236[var9];
                            if (class138.field2397 == 2 && var405 < class25.field534) {
                                class180.field3236[var9++] = class34.field679[var405];
                                continue;
                            }
                            class180.field3236[var9++] = 0;
                            continue;
                        }
                        if (var498 == 3603) {
                            var9--;
                            int var406 = class180.field3236[var9];
                            if (class138.field2397 == 2 && var406 < class25.field534) {
                                class180.field3236[var9++] = class275.field4811[var406];
                                continue;
                            }
                            class180.field3236[var9++] = 0;
                            continue;
                        }
                        if (var498 == 3604) {
                            var6--;
                            class207 var407 = class111.field1940[var6];
                            var9--;
                            int var408 = class180.field3236[var9];
                            class6.method38(var408, var407, 10233);
                            continue;
                        }
                        if (var498 == 3605) {
                            var6--;
                            class207 var409 = class111.field1940[var6];
                            class199.method1386(var409.method1428(0), -28836);
                            continue;
                        }
                        if (var498 == 3606) {
                            var6--;
                            class207 var410 = class111.field1940[var6];
                            class30.method236(var410.method1428(0), 0);
                            continue;
                        }
                        if (var498 == 3607) {
                            var6--;
                            class207 var411 = class111.field1940[var6];
                            class161.method1171((byte) -105, var411.method1428(0));
                            continue;
                        }
                        if (var498 == 3608) {
                            var6--;
                            class207 var412 = class111.field1940[var6];
                            class22.method133(var412.method1428(0), -1);
                            continue;
                        }
                        if (var498 == 3609) {
                            var6--;
                            class207 var413 = class111.field1940[var6];
                            if (var413.method1453(0, class68.field1207) || var413.method1453(0, class219.field3859)) {
                                var413 = var413.method1464(-23886, 7);
                            }
                            class180.field3236[var9++] = class3.method20(-126, var413) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3610) {
                            var9--;
                            int var414 = class180.field3236[var9];
                            if (class138.field2397 == 2 && var414 < class25.field534) {
                                class111.field1940[var6++] = class118.field2042[var414];
                                continue;
                            }
                            class111.field1940[var6++] = class201.field3548;
                            continue;
                        }
                        if (var498 == 3611) {
                            if (class81.field1467 == null) {
                                class111.field1940[var6++] = class201.field3548;
                            } else {
                                class111.field1940[var6++] = class81.field1467.method1423(119);
                            }
                            continue;
                        }
                        if (var498 == 3612) {
                            if (class81.field1467 == null) {
                                class180.field3236[var9++] = 0;
                            } else {
                                class180.field3236[var9++] = class277.field4866;
                            }
                            continue;
                        }
                        if (var498 == 3613) {
                            var9--;
                            int var415 = class180.field3236[var9];
                            if (class81.field1467 != null && var415 < class277.field4866) {
                                class111.field1940[var6++] = class105.field1859[var415].field1002.method1423(123);
                                continue;
                            }
                            class111.field1940[var6++] = class201.field3548;
                            continue;
                        }
                        if (var498 == 3614) {
                            var9--;
                            int var416 = class180.field3236[var9];
                            if (class81.field1467 != null && class277.field4866 > var416) {
                                class180.field3236[var9++] = class105.field1859[var416].field1004;
                                continue;
                            }
                            class180.field3236[var9++] = 0;
                            continue;
                        }
                        if (var498 == 3615) {
                            var9--;
                            int var417 = class180.field3236[var9];
                            if (class81.field1467 != null && class277.field4866 > var417) {
                                class180.field3236[var9++] = class105.field1859[var417].field1006;
                                continue;
                            }
                            class180.field3236[var9++] = 0;
                            continue;
                        }
                        if (var498 == 3616) {
                            class180.field3236[var9++] = class44.field872;
                            continue;
                        }
                        if (var498 == 3617) {
                            var6--;
                            class207 var418 = class111.field1940[var6];
                            class69.method496(var418, true);
                            continue;
                        }
                        if (var498 == 3618) {
                            class180.field3236[var9++] = class3.field54;
                            continue;
                        }
                        if (var498 == 3619) {
                            var6--;
                            class207 var419 = class111.field1940[var6];
                            class286.method1943(0, var419.method1428(0));
                            continue;
                        }
                        if (var498 == 3620) {
                            class75.method544(false);
                            continue;
                        }
                        if (var498 == 3621) {
                            if (class138.field2397 == 0) {
                                class180.field3236[var9++] = -1;
                            } else {
                                class180.field3236[var9++] = class54.field1013;
                            }
                            continue;
                        }
                        if (var498 == 3622) {
                            var9--;
                            int var420 = class180.field3236[var9];
                            if (class138.field2397 != 0 && var420 < class54.field1013) {
                                class111.field1940[var6++] = class21.method125(97, class282.field4963[var420]).method1423(115);
                                continue;
                            }
                            class111.field1940[var6++] = class201.field3548;
                            continue;
                        }
                        if (var498 == 3623) {
                            var6--;
                            class207 var421 = class111.field1940[var6];
                            if (var421.method1453(0, class68.field1207) || var421.method1453(0, class219.field3859)) {
                                var421 = var421.method1464(-23886, 7);
                            }
                            class180.field3236[var9++] = class195.method1355(117, var421) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3624) {
                            var9--;
                            int var422 = class180.field3236[var9];
                            if (class105.field1859 != null && class277.field4866 > var422 && class105.field1859[var422].field1002.method1462(class202.field3565.field209, true)) {
                                class180.field3236[var9++] = 1;
                                continue;
                            }
                            class180.field3236[var9++] = 0;
                            continue;
                        }
                        if (var498 == 3625) {
                            if (class39.field789 == null) {
                                class111.field1940[var6++] = class201.field3548;
                            } else {
                                class111.field1940[var6++] = class39.field789.method1423(126);
                            }
                            continue;
                        }
                        if (var498 == 3626) {
                            var9--;
                            int var423 = class180.field3236[var9];
                            if (class81.field1467 != null && var423 < class277.field4866) {
                                class111.field1940[var6++] = class105.field1859[var423].field1003;
                                continue;
                            }
                            class111.field1940[var6++] = class201.field3548;
                            continue;
                        }
                        if (var498 == 3627) {
                            var9--;
                            int var424 = class180.field3236[var9];
                            if (class138.field2397 == 2 && var424 >= 0 && var424 < class25.field534) {
                                class180.field3236[var9++] = class31.field630[var424] ? 1 : 0;
                                continue;
                            }
                            class180.field3236[var9++] = 0;
                            continue;
                        }
                        if (var498 == 3628) {
                            var6--;
                            class207 var425 = class111.field1940[var6];
                            if (var425.method1453(0, class68.field1207) || var425.method1453(0, class219.field3859)) {
                                var425 = var425.method1464(-23886, 7);
                            }
                            class180.field3236[var9++] = class85.method629(var425, 0);
                            continue;
                        }
                        if (var498 == 3629) {
                            class180.field3236[var9++] = class204.field3595;
                            continue;
                        }
                    } else if (var498 < 4000) {
                        if (var498 == 3903) {
                            var9--;
                            int var114 = class180.field3236[var9];
                            class180.field3236[var9++] = class154.field2671[var114].method1822((byte) -109);
                            continue;
                        }
                        if (var498 == 3904) {
                            var9--;
                            int var115 = class180.field3236[var9];
                            class180.field3236[var9++] = class154.field2671[var115].field4693;
                            continue;
                        }
                        if (var498 == 3905) {
                            var9--;
                            int var116 = class180.field3236[var9];
                            class180.field3236[var9++] = class154.field2671[var116].field4697;
                            continue;
                        }
                        if (var498 == 3906) {
                            var9--;
                            int var117 = class180.field3236[var9];
                            class180.field3236[var9++] = class154.field2671[var117].field4702;
                            continue;
                        }
                        if (var498 == 3907) {
                            var9--;
                            int var118 = class180.field3236[var9];
                            class180.field3236[var9++] = class154.field2671[var118].field4698;
                            continue;
                        }
                        if (var498 == 3908) {
                            var9--;
                            int var119 = class180.field3236[var9];
                            class180.field3236[var9++] = class154.field2671[var119].field4694;
                            continue;
                        }
                        if (var498 == 3910) {
                            var9--;
                            int var120 = class180.field3236[var9];
                            int var121 = class154.field2671[var120].method1825(7);
                            class180.field3236[var9++] = var121 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3911) {
                            var9--;
                            int var122 = class180.field3236[var9];
                            int var123 = class154.field2671[var122].method1825(7);
                            class180.field3236[var9++] = var123 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3912) {
                            var9--;
                            int var124 = class180.field3236[var9];
                            int var125 = class154.field2671[var124].method1825(7);
                            class180.field3236[var9++] = var125 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3913) {
                            var9--;
                            int var126 = class180.field3236[var9];
                            int var127 = class154.field2671[var126].method1825(7);
                            class180.field3236[var9++] = var127 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var498 < 4100) {
                        if (var498 == 4000) {
                            var9 -= 2;
                            int var128 = class180.field3236[var9];
                            int var129 = class180.field3236[var9 + 1];
                            class180.field3236[var9++] = var128 + var129;
                            continue;
                        }
                        if (var498 == 4001) {
                            var9 -= 2;
                            int var130 = class180.field3236[var9 + 1];
                            int var131 = class180.field3236[var9];
                            class180.field3236[var9++] = var131 - var130;
                            continue;
                        }
                        if (var498 == 4002) {
                            var9 -= 2;
                            int var132 = class180.field3236[var9];
                            int var133 = class180.field3236[var9 + 1];
                            class180.field3236[var9++] = var132 * var133;
                            continue;
                        }
                        if (var498 == 4003) {
                            var9 -= 2;
                            int var134 = class180.field3236[var9];
                            int var135 = class180.field3236[var9 + 1];
                            class180.field3236[var9++] = var134 / var135;
                            continue;
                        }
                        if (var498 == 4004) {
                            var9--;
                            int var136 = class180.field3236[var9];
                            class180.field3236[var9++] = (int) (Math.random() * (double) var136);
                            continue;
                        }
                        if (var498 == 4005) {
                            var9--;
                            int var137 = class180.field3236[var9];
                            class180.field3236[var9++] = (int) (Math.random() * (double) (var137 + 1));
                            continue;
                        }
                        if (var498 == 4006) {
                            var9 -= 5;
                            int var138 = class180.field3236[var9];
                            int var139 = class180.field3236[var9 + 4];
                            int var140 = class180.field3236[var9 + 3];
                            int var141 = class180.field3236[var9 + 1];
                            int var142 = class180.field3236[var9 + 2];
                            class180.field3236[var9++] = (var141 - var138) * (var139 - var142) / (var140 - var142) + var138;
                            continue;
                        }
                        if (var498 == 4007) {
                            var9 -= 2;
                            long var143 = (long) class180.field3236[var9 + 1];
                            long var145 = (long) class180.field3236[var9];
                            class180.field3236[var9++] = (int) (var145 + (var143 * var145 / 100L));
                            continue;
                        }
                        if (var498 == 4008) {
                            var9 -= 2;
                            int var147 = class180.field3236[var9];
                            int var148 = class180.field3236[var9 + 1];
                            class180.field3236[var9++] = class281.method1906(0x1 << var148, var147);
                            continue;
                        }
                        if (var498 == 4009) {
                            var9 -= 2;
                            int var149 = class180.field3236[var9];
                            int var150 = class180.field3236[var9 + 1];
                            class180.field3236[var9++] = class121.method860(var149, -(0x1 << var150) - 1);
                            continue;
                        }
                        if (var498 == 4010) {
                            var9 -= 2;
                            int var151 = class180.field3236[var9 + 1];
                            int var152 = class180.field3236[var9];
                            class180.field3236[var9++] = class121.method860(0x1 << var151, var152) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var498 == 4011) {
                            var9 -= 2;
                            int var153 = class180.field3236[var9];
                            int var154 = class180.field3236[var9 + 1];
                            class180.field3236[var9++] = var153 % var154;
                            continue;
                        }
                        if (var498 == 4012) {
                            var9 -= 2;
                            int var155 = class180.field3236[var9];
                            int var156 = class180.field3236[var9 + 1];
                            if (var155 == 0) {
                                class180.field3236[var9++] = 0;
                            } else {
                                class180.field3236[var9++] = (int) Math.pow((double) var155, (double) var156);
                            }
                            continue;
                        }
                        if (var498 == 4013) {
                            var9 -= 2;
                            int var157 = class180.field3236[var9];
                            int var158 = class180.field3236[var9 + 1];
                            if (var157 == 0) {
                                class180.field3236[var9++] = 0;
                            } else if (var158 == 0) {
                                class180.field3236[var9++] = Integer.MAX_VALUE;
                            } else {
                                class180.field3236[var9++] = (int) Math.pow((double) var157, 1.0D / (double) var158);
                            }
                            continue;
                        }
                        if (var498 == 4014) {
                            var9 -= 2;
                            int var159 = class180.field3236[var9 + 1];
                            int var160 = class180.field3236[var9];
                            class180.field3236[var9++] = class121.method860(var160, var159);
                            continue;
                        }
                        if (var498 == 4015) {
                            var9 -= 2;
                            int var161 = class180.field3236[var9];
                            int var162 = class180.field3236[var9 + 1];
                            class180.field3236[var9++] = class281.method1906(var162, var161);
                            continue;
                        }
                        if (var498 == 4016) {
                            var9 -= 2;
                            int var163 = class180.field3236[var9];
                            int var164 = class180.field3236[var9 + 1];
                            class180.field3236[var9++] = var163 >= var164 ? var164 : var163;
                            continue;
                        }
                        if (var498 == 4017) {
                            var9 -= 2;
                            int var165 = class180.field3236[var9];
                            int var166 = class180.field3236[var9 + 1];
                            class180.field3236[var9++] = var165 <= var166 ? var166 : var165;
                            continue;
                        }
                        if (var498 == 4018) {
                            var9 -= 3;
                            long var167 = (long) class180.field3236[var9 + 1];
                            long var169 = (long) class180.field3236[var9];
                            long var171 = (long) class180.field3236[var9 + 2];
                            class180.field3236[var9++] = (int) (var169 * var171 / var167);
                            continue;
                        }
                    } else if (var498 < 4200) {
                        if (var498 == 4100) {
                            var9--;
                            int var354 = class180.field3236[var9];
                            var6--;
                            class207 var355 = class111.field1940[var6];
                            class111.field1940[var6++] = class105.method757(arg0, new class207[] { var355, class262.method1815(var354, (byte) 27) });
                            continue;
                        }
                        if (var498 == 4101) {
                            var6 -= 2;
                            class207 var356 = class111.field1940[var6];
                            class207 var357 = class111.field1940[var6 + 1];
                            class111.field1940[var6++] = class105.method757(false, new class207[] { var356, var357 });
                            continue;
                        }
                        if (var498 == 4102) {
                            var6--;
                            class207 var358 = class111.field1940[var6];
                            var9--;
                            int var359 = class180.field3236[var9];
                            class111.field1940[var6++] = class105.method757(arg0, new class207[] { var358, class277.method1885(arg0, true, var359) });
                            continue;
                        }
                        if (var498 == 4103) {
                            var6--;
                            class207 var360 = class111.field1940[var6];
                            class111.field1940[var6++] = var360.method1444((byte) -76);
                            continue;
                        }
                        if (var498 == 4104) {
                            var9--;
                            int var361 = class180.field3236[var9];
                            long var362 = ((long) var361 + 11745L) * 86400000L;
                            class62.field1134.setTime(new Date(var362));
                            int var364 = class62.field1134.get(5);
                            int var365 = class62.field1134.get(2);
                            int var366 = class62.field1134.get(1);
                            class111.field1940[var6++] = class105.method757(false, new class207[] { class262.method1815(var364, (byte) -119), class223.field4085, class140.field2412[var365], class223.field4085, class262.method1815(var366, (byte) -104) });
                            continue;
                        }
                        if (var498 == 4105) {
                            var6 -= 2;
                            class207 var367 = class111.field1940[var6];
                            class207 var368 = class111.field1940[var6 + 1];
                            if (class202.field3565.field229 != null && class202.field3565.field229.field974) {
                                class111.field1940[var6++] = var368;
                                continue;
                            }
                            class111.field1940[var6++] = var367;
                            continue;
                        }
                        if (var498 == 4106) {
                            var9--;
                            int var369 = class180.field3236[var9];
                            class111.field1940[var6++] = class262.method1815(var369, (byte) 78);
                            continue;
                        }
                        if (var498 == 4107) {
                            var6 -= 2;
                            class180.field3236[var9++] = class111.field1940[var6].method1458(class111.field1940[var6 + 1], 101);
                            continue;
                        }
                        if (var498 == 4108) {
                            var9 -= 2;
                            var6--;
                            class207 var370 = class111.field1940[var6];
                            int var371 = class180.field3236[var9 + 1];
                            int var372 = class180.field3236[var9];
                            class180.field3236[var9++] = class141.method981(-1, var371).method1605(var370, var372);
                            continue;
                        }
                        if (var498 == 4109) {
                            var6--;
                            class207 var373 = class111.field1940[var6];
                            var9 -= 2;
                            int var374 = class180.field3236[var9];
                            int var375 = class180.field3236[var9 + 1];
                            class180.field3236[var9++] = class141.method981(-1, var375).method1607(var373, var374);
                            continue;
                        }
                        if (var498 == 4110) {
                            var6 -= 2;
                            class207 var376 = class111.field1940[var6];
                            class207 var377 = class111.field1940[var6 + 1];
                            var9--;
                            if (class180.field3236[var9] == 1) {
                                class111.field1940[var6++] = var376;
                            } else {
                                class111.field1940[var6++] = var377;
                            }
                            continue;
                        }
                        if (var498 == 4111) {
                            var6--;
                            class207 var378 = class111.field1940[var6];
                            class111.field1940[var6++] = class226.method1606(var378);
                            continue;
                        }
                        if (var498 == 4112) {
                            var6--;
                            class207 var379 = class111.field1940[var6];
                            var9--;
                            int var380 = class180.field3236[var9];
                            if (var380 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class111.field1940[var6++] = var379.method1460((byte) -38, var380);
                            continue;
                        }
                        if (var498 == 4113) {
                            var9--;
                            int var381 = class180.field3236[var9];
                            class180.field3236[var9++] = class153.method1101(var381, (byte) 61) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4114) {
                            var9--;
                            int var382 = class180.field3236[var9];
                            class180.field3236[var9++] = class249.method1753(var382, false) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4115) {
                            var9--;
                            int var383 = class180.field3236[var9];
                            class180.field3236[var9++] = class160.method1164(122, var383) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4116) {
                            var9--;
                            int var384 = class180.field3236[var9];
                            class180.field3236[var9++] = class216.method1548(-15392, var384) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4117) {
                            var6--;
                            class207 var385 = class111.field1940[var6];
                            if (var385 == null) {
                                class180.field3236[var9++] = 0;
                            } else {
                                class180.field3236[var9++] = var385.method1450((byte) -3);
                            }
                            continue;
                        }
                        if (var498 == 4118) {
                            var9 -= 2;
                            int var386 = class180.field3236[var9];
                            var6--;
                            class207 var387 = class111.field1940[var6];
                            int var388 = class180.field3236[var9 + 1];
                            class111.field1940[var6++] = var387.method1427(-17195, var386, var388);
                            continue;
                        }
                        if (var498 == 4119) {
                            var6--;
                            class207 var389 = class111.field1940[var6];
                            class207 var390 = class191.method1335((byte) 106, var389.method1450((byte) 44));
                            boolean var391 = false;
                            for (int var392 = 0; var392 < var389.method1450((byte) 46); var392++) {
                                int var393 = var389.method1457(var392, -12675);
                                if (var393 == 60) {
                                    var391 = true;
                                } else if (var393 == 62) {
                                    var391 = false;
                                } else if (!var391) {
                                    var390.method1439(var393, (byte) -112);
                                }
                            }
                            var390.method1438(0);
                            class111.field1940[var6++] = var390;
                            continue;
                        }
                        if (var498 == 4120) {
                            var6--;
                            class207 var394 = class111.field1940[var6];
                            var9 -= 2;
                            int var395 = class180.field3236[var9];
                            int var396 = class180.field3236[var9 + 1];
                            class180.field3236[var9++] = var394.method1431(var395, (byte) -47, var396);
                            continue;
                        }
                        if (var498 == 4121) {
                            var6 -= 2;
                            class207 var397 = class111.field1940[var6];
                            var9--;
                            int var398 = class180.field3236[var9];
                            class207 var399 = class111.field1940[var6 + 1];
                            class180.field3236[var9++] = var397.method1469(!arg0, var398, var399);
                            continue;
                        }
                        if (var498 == 4122) {
                            var9--;
                            int var400 = class180.field3236[var9];
                            class180.field3236[var9++] = class32.method246(-1, var400);
                            continue;
                        }
                        if (var498 == 4123) {
                            var9--;
                            int var401 = class180.field3236[var9];
                            class180.field3236[var9++] = class18.method106(var401, -32);
                            continue;
                        }
                        if (var498 == 4124) {
                            var9--;
                            boolean var402 = class180.field3236[var9] != 0;
                            var9--;
                            int var403 = class180.field3236[var9];
                            class111.field1940[var6++] = class36.method259(var402, (long) var403, (byte) -85, 0, class272.field4795);
                            continue;
                        }
                    } else if (var498 < 4300) {
                        if (var498 == 4200) {
                            var9--;
                            int var335 = class180.field3236[var9];
                            class111.field1940[var6++] = class117.method829(var335, (byte) 99).field3057;
                            continue;
                        }
                        if (var498 == 4201) {
                            var9 -= 2;
                            int var336 = class180.field3236[var9];
                            int var337 = class180.field3236[var9 + 1];
                            class173 var338 = class117.method829(var336, (byte) 88);
                            if (var337 >= 1 && var337 <= 5 && var338.field3051[var337 - 1] != null) {
                                class111.field1940[var6++] = var338.field3051[var337 - 1];
                                continue;
                            }
                            class111.field1940[var6++] = class201.field3548;
                            continue;
                        }
                        if (var498 == 4202) {
                            var9 -= 2;
                            int var339 = class180.field3236[var9];
                            int var340 = class180.field3236[var9 + 1];
                            class173 var341 = class117.method829(var339, (byte) 102);
                            if (var340 >= 1 && var340 <= 5 && var341.field3077[var340 - 1] != null) {
                                class111.field1940[var6++] = var341.field3077[var340 - 1];
                                continue;
                            }
                            class111.field1940[var6++] = class201.field3548;
                            continue;
                        }
                        if (var498 == 4203) {
                            var9--;
                            int var342 = class180.field3236[var9];
                            class180.field3236[var9++] = class117.method829(var342, (byte) 104).field3105;
                            continue;
                        }
                        if (var498 == 4204) {
                            var9--;
                            int var343 = class180.field3236[var9];
                            class180.field3236[var9++] = class117.method829(var343, (byte) 120).field3067 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4205) {
                            var9--;
                            int var344 = class180.field3236[var9];
                            class173 var345 = class117.method829(var344, (byte) 70);
                            if (var345.field3117 == -1 && var345.field3080 >= 0) {
                                class180.field3236[var9++] = var345.field3080;
                                continue;
                            }
                            class180.field3236[var9++] = var344;
                            continue;
                        }
                        if (var498 == 4206) {
                            var9--;
                            int var346 = class180.field3236[var9];
                            class173 var347 = class117.method829(var346, (byte) 109);
                            if (var347.field3117 >= 0 && var347.field3080 >= 0) {
                                class180.field3236[var9++] = var347.field3080;
                                continue;
                            }
                            class180.field3236[var9++] = var346;
                            continue;
                        }
                        if (var498 == 4207) {
                            var9--;
                            int var348 = class180.field3236[var9];
                            class180.field3236[var9++] = class117.method829(var348, (byte) 60).field3071 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4208) {
                            var9 -= 2;
                            int var349 = class180.field3236[var9];
                            int var350 = class180.field3236[var9 + 1];
                            class119 var351 = class276.method1880(var350, (byte) -47);
                            if (var351.method853(-116)) {
                                class111.field1940[var6++] = class117.method829(var349, (byte) 101).method1244(var350, var351.field2067, (byte) 116);
                            } else {
                                class180.field3236[var9++] = class117.method829(var349, (byte) 104).method1240(var350, var351.field2061, -8078);
                            }
                            continue;
                        }
                        if (var498 == 4210) {
                            var9--;
                            int var352 = class180.field3236[var9];
                            var6--;
                            class207 var353 = class111.field1940[var6];
                            class194.method1352(var352 == 1, var353, -68);
                            class180.field3236[var9++] = class74.field1366;
                            continue;
                        }
                        if (var498 == 4211) {
                            if (class163.field2883 != null && class1.field14 < class74.field1366) {
                                class180.field3236[var9++] = class121.method860(class163.field2883[class1.field14++], 65535);
                                continue;
                            }
                            class180.field3236[var9++] = -1;
                            continue;
                        }
                        if (var498 == 4212) {
                            class1.field14 = 0;
                            continue;
                        }
                    } else if (var498 >= 4400) {
                        if (var498 < 4500) {
                            if (var498 == 4400) {
                                var9 -= 2;
                                int var173 = class180.field3236[var9];
                                int var174 = class180.field3236[var9 + 1];
                                class119 var175 = class276.method1880(var174, (byte) -47);
                                if (var175.method853(-116)) {
                                    class111.field1940[var6++] = class33.method251(0, var173).method140(var175.field2067, var174, -89);
                                } else {
                                    class180.field3236[var9++] = class33.method251(0, var173).method132(-106, var175.field2061, var174);
                                }
                                continue;
                            }
                        } else if (var498 >= 4600) {
                            if (var498 < 5100) {
                                if (var498 == 5000) {
                                    class180.field3236[var9++] = class82.field1507;
                                    continue;
                                }
                                if (var498 == 5001) {
                                    class56.field1044++;
                                    var9 -= 3;
                                    class82.field1507 = class180.field3236[var9];
                                    class279.field4897 = class180.field3236[var9 + 1];
                                    class18.field276 = class180.field3236[var9 + 2];
                                    class261.field4645.method767(72, (byte) 50);
                                    class261.field4645.method1041(true, class82.field1507);
                                    class261.field4645.method1041(true, class279.field4897);
                                    class261.field4645.method1041(!arg0, class18.field276);
                                    continue;
                                }
                                if (var498 == 5002) {
                                    var9 -= 2;
                                    class287.field5116++;
                                    var6--;
                                    class207 var264 = class111.field1940[var6];
                                    int var265 = class180.field3236[var9];
                                    int var266 = class180.field3236[var9 + 1];
                                    class261.field4645.method767(146, (byte) 103);
                                    class261.field4645.method1048((byte) 110, var264.method1428(0));
                                    class261.field4645.method1041(true, var265 - 1);
                                    class261.field4645.method1041(!arg0, var266);
                                    continue;
                                }
                                if (var498 == 5003) {
                                    class207 var267 = null;
                                    var9--;
                                    int var268 = class180.field3236[var9];
                                    if (var268 < 100) {
                                        var267 = class25.field530[var268];
                                    }
                                    if (var267 == null) {
                                        var267 = class201.field3548;
                                    }
                                    class111.field1940[var6++] = var267;
                                    continue;
                                }
                                if (var498 == 5004) {
                                    var9--;
                                    int var269 = class180.field3236[var9];
                                    int var270 = -1;
                                    if (var269 < 100 && class25.field530[var269] != null) {
                                        var270 = class150.field2639[var269];
                                    }
                                    class180.field3236[var9++] = var270;
                                    continue;
                                }
                                if (var498 == 5005) {
                                    class180.field3236[var9++] = class279.field4897;
                                    continue;
                                }
                                if (var498 == 5008) {
                                    var6--;
                                    class207 var271 = class111.field1940[var6];
                                    if (var271.method1453(0, class162.field2858)) {
                                        class281.method1913((byte) 99, var271);
                                        continue;
                                    }
                                    if (class123.field2134 == 0 && (class8.field112 && !class78.field1427 || class92.field1638)) {
                                        continue;
                                    }
                                    class207 var272 = var271.method1444((byte) -76);
                                    class16.field252++;
                                    byte var273 = 0;
                                    byte var274 = 0;
                                    if (var272.method1453(0, class199.field3489)) {
                                        var274 = 0;
                                        var271 = var271.method1464(-23886, class199.field3489.method1450((byte) -119));
                                    } else if (var272.method1453(0, class156.field2745)) {
                                        var271 = var271.method1464(-23886, class156.field2745.method1450((byte) 83));
                                        var274 = 1;
                                    } else if (var272.method1453(0, class225.field4096)) {
                                        var274 = 2;
                                        var271 = var271.method1464(-23886, class225.field4096.method1450((byte) -124));
                                    } else if (var272.method1453(0, class144.field2484)) {
                                        var274 = 3;
                                        var271 = var271.method1464(-23886, class144.field2484.method1450((byte) 37));
                                    } else if (var272.method1453(0, class117.field2024)) {
                                        var271 = var271.method1464(-23886, class117.field2024.method1450((byte) 23));
                                        var274 = 4;
                                    } else if (var272.method1453(0, class5.field80)) {
                                        var274 = 5;
                                        var271 = var271.method1464(-23886, class5.field80.method1450((byte) 52));
                                    } else if (var272.method1453(0, class192.field3381)) {
                                        var271 = var271.method1464(-23886, class192.field3381.method1450((byte) -111));
                                        var274 = 6;
                                    } else if (var272.method1453(0, class71.field1260)) {
                                        var271 = var271.method1464(-23886, class71.field1260.method1450((byte) 44));
                                        var274 = 7;
                                    } else if (var272.method1453(0, class170.field3015)) {
                                        var274 = 8;
                                        var271 = var271.method1464(-23886, class170.field3015.method1450((byte) -114));
                                    } else if (var272.method1453(0, class111.field1935)) {
                                        var271 = var271.method1464(-23886, class111.field1935.method1450((byte) 70));
                                        var274 = 9;
                                    } else if (var272.method1453(0, class232.field4246)) {
                                        var274 = 10;
                                        var271 = var271.method1464(-23886, class232.field4246.method1450((byte) 35));
                                    } else if (var272.method1453(0, class95.field1689)) {
                                        var271 = var271.method1464(-23886, class95.field1689.method1450((byte) 53));
                                        var274 = 11;
                                    } else if (class272.field4795 != 0) {
                                        if (var272.method1453(0, class199.field3479)) {
                                            var274 = 0;
                                            var271 = var271.method1464(-23886, class199.field3479.method1450((byte) 110));
                                        } else if (var272.method1453(0, class156.field2755)) {
                                            var271 = var271.method1464(-23886, class156.field2755.method1450((byte) -115));
                                            var274 = 1;
                                        } else if (var272.method1453(0, class225.field4106)) {
                                            var271 = var271.method1464(-23886, class225.field4106.method1450((byte) -128));
                                            var274 = 2;
                                        } else if (var272.method1453(0, class144.field2483)) {
                                            var271 = var271.method1464(-23886, class144.field2483.method1450((byte) 113));
                                            var274 = 3;
                                        } else if (var272.method1453(0, class117.field2026)) {
                                            var271 = var271.method1464(-23886, class117.field2026.method1450((byte) 101));
                                            var274 = 4;
                                        } else if (var272.method1453(0, class5.field83)) {
                                            var274 = 5;
                                            var271 = var271.method1464(-23886, class5.field83.method1450((byte) -123));
                                        } else if (var272.method1453(0, class192.field3386)) {
                                            var274 = 6;
                                            var271 = var271.method1464(-23886, class192.field3386.method1450((byte) -125));
                                        } else if (var272.method1453(0, class71.field1270)) {
                                            var271 = var271.method1464(-23886, class71.field1270.method1450((byte) -116));
                                            var274 = 7;
                                        } else if (var272.method1453(0, class170.field3020)) {
                                            var271 = var271.method1464(-23886, class170.field3020.method1450((byte) 112));
                                            var274 = 8;
                                        } else if (var272.method1453(0, class111.field1933)) {
                                            var271 = var271.method1464(-23886, class111.field1933.method1450((byte) 51));
                                            var274 = 9;
                                        } else if (var272.method1453(0, class232.field4241)) {
                                            var274 = 10;
                                            var271 = var271.method1464(-23886, class232.field4241.method1450((byte) 103));
                                        } else if (var272.method1453(0, class95.field1694)) {
                                            var271 = var271.method1464(-23886, class95.field1694.method1450((byte) 46));
                                            var274 = 11;
                                        }
                                    }
                                    class207 var275 = var271.method1444((byte) -76);
                                    if (var275.method1453(0, class214.field3784)) {
                                        var271 = var271.method1464(-23886, class214.field3784.method1450((byte) -115));
                                        var273 = 1;
                                    } else if (var275.method1453(0, class27.field545)) {
                                        var271 = var271.method1464(-23886, class27.field545.method1450((byte) 75));
                                        var273 = 2;
                                    } else if (var275.method1453(0, class245.field4442)) {
                                        var273 = 3;
                                        var271 = var271.method1464(-23886, class245.field4442.method1450((byte) 88));
                                    } else if (var275.method1453(0, class100.field1808)) {
                                        var271 = var271.method1464(-23886, class100.field1808.method1450((byte) 87));
                                        var273 = 4;
                                    } else if (var275.method1453(0, class219.field3860)) {
                                        var271 = var271.method1464(-23886, class219.field3860.method1450((byte) 34));
                                        var273 = 5;
                                    } else if (class272.field4795 != 0) {
                                        if (var275.method1453(0, class214.field3800)) {
                                            var273 = 1;
                                            var271 = var271.method1464(-23886, class214.field3800.method1450((byte) -125));
                                        } else if (var275.method1453(0, class27.field552)) {
                                            var271 = var271.method1464(-23886, class27.field552.method1450((byte) -116));
                                            var273 = 2;
                                        } else if (var275.method1453(0, class245.field4448)) {
                                            var273 = 3;
                                            var271 = var271.method1464(-23886, class245.field4448.method1450((byte) 97));
                                        } else if (var275.method1453(0, class100.field1796)) {
                                            var273 = 4;
                                            var271 = var271.method1464(-23886, class100.field1796.method1450((byte) 24));
                                        } else if (var275.method1453(0, class219.field3866)) {
                                            var271 = var271.method1464(-23886, class219.field3866.method1450((byte) 99));
                                            var273 = 5;
                                        }
                                    }
                                    class261.field4645.method767(235, (byte) 29);
                                    class261.field4645.method1041(true, 0);
                                    int var276 = class261.field4645.field2593;
                                    class261.field4645.method1041(true, var274);
                                    class261.field4645.method1041(!arg0, var273);
                                    class54.method406(class261.field4645, var271, false);
                                    class261.field4645.method1074(class261.field4645.field2593 - var276, 2022405415);
                                    continue;
                                }
                                if (var498 == 5009) {
                                    var6 -= 2;
                                    class207 var277 = class111.field1940[var6];
                                    class207 var278 = class111.field1940[var6 + 1];
                                    if (class123.field2134 != 0 || (!class8.field112 || class78.field1427) && !class92.field1638) {
                                        class261.field4645.method767(47, (byte) 55);
                                        class261.field4645.method1041(true, 0);
                                        int var279 = class261.field4645.field2593;
                                        class75.field1381++;
                                        class261.field4645.method1048((byte) 99, var277.method1428(0));
                                        class54.method406(class261.field4645, var278, arg0);
                                        class261.field4645.method1074(class261.field4645.field2593 - var279, 2022405415);
                                    }
                                    continue;
                                }
                                if (var498 == 5010) {
                                    var9--;
                                    int var280 = class180.field3236[var9];
                                    class207 var281 = null;
                                    if (var280 < 100) {
                                        var281 = class275.field4833[var280];
                                    }
                                    if (var281 == null) {
                                        var281 = class201.field3548;
                                    }
                                    class111.field1940[var6++] = var281;
                                    continue;
                                }
                                if (var498 == 5011) {
                                    var9--;
                                    int var282 = class180.field3236[var9];
                                    class207 var283 = null;
                                    if (var282 < 100) {
                                        var283 = class30.field613[var282];
                                    }
                                    if (var283 == null) {
                                        var283 = class201.field3548;
                                    }
                                    class111.field1940[var6++] = var283;
                                    continue;
                                }
                                if (var498 == 5012) {
                                    var9--;
                                    int var284 = class180.field3236[var9];
                                    int var285 = -1;
                                    if (var284 < 100) {
                                        var285 = class81.field1475[var284];
                                    }
                                    class180.field3236[var9++] = var285;
                                    continue;
                                }
                                if (var498 == 5015) {
                                    class207 var286;
                                    if (class202.field3565 == null || class202.field3565.field209 == null) {
                                        var286 = class100.field1803;
                                    } else {
                                        var286 = class202.field3565.method92(false);
                                    }
                                    class111.field1940[var6++] = var286;
                                    continue;
                                }
                                if (var498 == 5016) {
                                    class180.field3236[var9++] = class18.field276;
                                    continue;
                                }
                                if (var498 == 5017) {
                                    class180.field3236[var9++] = class78.field1418;
                                    continue;
                                }
                                if (var498 == 5050) {
                                    var9--;
                                    int var287 = class180.field3236[var9];
                                    class111.field1940[var6++] = class72.method524(true, var287).field4505;
                                    continue;
                                }
                                if (var498 == 5051) {
                                    var9--;
                                    int var288 = class180.field3236[var9];
                                    class248 var289 = class72.method524(true, var288);
                                    if (var289.field4493 == null) {
                                        class180.field3236[var9++] = 0;
                                    } else {
                                        class180.field3236[var9++] = var289.field4493.length;
                                    }
                                    continue;
                                }
                                if (var498 == 5052) {
                                    var9 -= 2;
                                    int var290 = class180.field3236[var9 + 1];
                                    int var291 = class180.field3236[var9];
                                    class248 var292 = class72.method524(true, var291);
                                    int var293 = var292.field4493[var290];
                                    class180.field3236[var9++] = var293;
                                    continue;
                                }
                                if (var498 == 5053) {
                                    var9--;
                                    int var294 = class180.field3236[var9];
                                    class248 var295 = class72.method524(true, var294);
                                    if (var295.field4499 == null) {
                                        class180.field3236[var9++] = 0;
                                    } else {
                                        class180.field3236[var9++] = var295.field4499.length;
                                    }
                                    continue;
                                }
                                if (var498 == 5054) {
                                    var9 -= 2;
                                    int var296 = class180.field3236[var9 + 1];
                                    int var297 = class180.field3236[var9];
                                    class180.field3236[var9++] = class72.method524(true, var297).field4499[var296];
                                    continue;
                                }
                                if (var498 == 5055) {
                                    var9--;
                                    int var298 = class180.field3236[var9];
                                    class111.field1940[var6++] = class83.method621(var298, -67).method1533(32640);
                                    continue;
                                }
                                if (var498 == 5056) {
                                    var9--;
                                    int var299 = class180.field3236[var9];
                                    class214 var300 = class83.method621(var299, 111);
                                    if (var300.field3811 == null) {
                                        class180.field3236[var9++] = 0;
                                    } else {
                                        class180.field3236[var9++] = var300.field3811.length;
                                    }
                                    continue;
                                }
                                if (var498 == 5057) {
                                    var9 -= 2;
                                    int var301 = class180.field3236[var9 + 1];
                                    int var302 = class180.field3236[var9];
                                    class180.field3236[var9++] = class83.method621(var302, -32).field3811[var301];
                                    continue;
                                }
                                if (var498 == 5058) {
                                    class232.field4279 = new class83();
                                    var9--;
                                    class232.field4279.field1524 = class180.field3236[var9];
                                    class232.field4279.field1528 = class83.method621(class232.field4279.field1524, -46);
                                    class232.field4279.field1521 = new int[class232.field4279.field1528.method1525(52)];
                                    continue;
                                }
                                if (var498 == 5059) {
                                    class81.field1469++;
                                    class261.field4645.method767(22, (byte) 34);
                                    class261.field4645.method1041(true, 0);
                                    int var303 = class261.field4645.field2593;
                                    class261.field4645.method1041(!arg0, 0);
                                    class261.field4645.method1083(false, class232.field4279.field1524);
                                    class232.field4279.field1528.method1534(class232.field4279.field1521, class261.field4645, 24305);
                                    class261.field4645.method1074(class261.field4645.field2593 - var303, 2022405415);
                                    continue;
                                }
                                if (var498 == 5060) {
                                    var6--;
                                    class207 var304 = class111.field1940[var6];
                                    class78.field1416++;
                                    class261.field4645.method767(239, (byte) 97);
                                    class261.field4645.method1041(true, 0);
                                    int var305 = class261.field4645.field2593;
                                    class261.field4645.method1048((byte) 122, var304.method1428(0));
                                    class261.field4645.method1083(false, class232.field4279.field1524);
                                    class232.field4279.field1528.method1534(class232.field4279.field1521, class261.field4645, 24305);
                                    class261.field4645.method1074(class261.field4645.field2593 - var305, 2022405415);
                                    continue;
                                }
                                if (var498 == 5061) {
                                    class261.field4645.method767(22, (byte) 78);
                                    class261.field4645.method1041(true, 0);
                                    int var306 = class261.field4645.field2593;
                                    class81.field1469++;
                                    class261.field4645.method1041(true, 1);
                                    class261.field4645.method1083(false, class232.field4279.field1524);
                                    class232.field4279.field1528.method1534(class232.field4279.field1521, class261.field4645, 24305);
                                    class261.field4645.method1074(class261.field4645.field2593 - var306, 2022405415);
                                    continue;
                                }
                                if (var498 == 5062) {
                                    var9 -= 2;
                                    int var307 = class180.field3236[var9];
                                    int var308 = class180.field3236[var9 + 1];
                                    class180.field3236[var9++] = class72.method524(!arg0, var307).field4489[var308];
                                    continue;
                                }
                                if (var498 == 5063) {
                                    var9 -= 2;
                                    int var309 = class180.field3236[var9];
                                    int var310 = class180.field3236[var9 + 1];
                                    class180.field3236[var9++] = class72.method524(true, var309).field4503[var310];
                                    continue;
                                }
                                if (var498 == 5064) {
                                    var9 -= 2;
                                    int var311 = class180.field3236[var9];
                                    int var312 = class180.field3236[var9 + 1];
                                    if (var312 == -1) {
                                        class180.field3236[var9++] = -1;
                                    } else {
                                        class180.field3236[var9++] = class72.method524(true, var311).method1747(-73, var312);
                                    }
                                    continue;
                                }
                                if (var498 == 5065) {
                                    var9 -= 2;
                                    int var313 = class180.field3236[var9];
                                    int var314 = class180.field3236[var9 + 1];
                                    if (var314 == -1) {
                                        class180.field3236[var9++] = -1;
                                    } else {
                                        class180.field3236[var9++] = class72.method524(true, var313).method1749(var314, (byte) -11);
                                    }
                                    continue;
                                }
                                if (var498 == 5066) {
                                    var9--;
                                    int var315 = class180.field3236[var9];
                                    class180.field3236[var9++] = class83.method621(var315, 123).method1525(126);
                                    continue;
                                }
                                if (var498 == 5067) {
                                    var9 -= 2;
                                    int var316 = class180.field3236[var9 + 1];
                                    int var317 = class180.field3236[var9];
                                    int var318 = class83.method621(var317, 121).method1529((byte) 102, var316);
                                    class180.field3236[var9++] = var318;
                                    continue;
                                }
                                if (var498 == 5068) {
                                    var9 -= 2;
                                    int var319 = class180.field3236[var9];
                                    int var320 = class180.field3236[var9 + 1];
                                    class232.field4279.field1521[var319] = var320;
                                    continue;
                                }
                                if (var498 == 5069) {
                                    var9 -= 2;
                                    int var321 = class180.field3236[var9 + 1];
                                    int var322 = class180.field3236[var9];
                                    class232.field4279.field1521[var322] = var321;
                                    continue;
                                }
                                if (var498 == 5070) {
                                    var9 -= 3;
                                    int var323 = class180.field3236[var9 + 1];
                                    int var324 = class180.field3236[var9];
                                    int var325 = class180.field3236[var9 + 2];
                                    class214 var326 = class83.method621(var324, -54);
                                    if (var326.method1529((byte) 113, var323) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class180.field3236[var9++] = var326.method1524(var323, var325, (byte) -102);
                                    continue;
                                }
                                if (var498 == 5071) {
                                    var6--;
                                    class207 var327 = class111.field1940[var6];
                                    var9--;
                                    boolean var328 = class180.field3236[var9] == 1;
                                    class55.method412(var327, var328, 2);
                                    class180.field3236[var9++] = class74.field1366;
                                    continue;
                                }
                                if (var498 == 5072) {
                                    if (class163.field2883 != null && class1.field14 < class74.field1366) {
                                        class180.field3236[var9++] = class121.method860(class163.field2883[class1.field14++], 65535);
                                        continue;
                                    }
                                    class180.field3236[var9++] = -1;
                                    continue;
                                }
                                if (var498 == 5073) {
                                    class1.field14 = 0;
                                    continue;
                                }
                            } else if (var498 < 5200) {
                                if (var498 == 5100) {
                                    if (class165.field2920[86]) {
                                        class180.field3236[var9++] = 1;
                                    } else {
                                        class180.field3236[var9++] = 0;
                                    }
                                    continue;
                                }
                                if (var498 == 5101) {
                                    if (class165.field2920[82]) {
                                        class180.field3236[var9++] = 1;
                                    } else {
                                        class180.field3236[var9++] = 0;
                                    }
                                    continue;
                                }
                                if (var498 == 5102) {
                                    if (class165.field2920[81]) {
                                        class180.field3236[var9++] = 1;
                                    } else {
                                        class180.field3236[var9++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var498 < 5300) {
                                if (var498 == 5200) {
                                    var9--;
                                    class247.method1740(false, class180.field3236[var9]);
                                    continue;
                                }
                                if (var498 == 5201) {
                                    class180.field3236[var9++] = class228.method1627(-117);
                                    continue;
                                }
                                if (var498 == 5202) {
                                    var9--;
                                    class160.method1167(109, class180.field3236[var9]);
                                    continue;
                                }
                                if (var498 == 5203) {
                                    var6--;
                                    class284.method1933(class111.field1940[var6], arg0);
                                    continue;
                                }
                                if (var498 == 5204) {
                                    class111.field1940[var6 - 1] = class128.method900(-14010, class111.field1940[var6 - 1]);
                                    continue;
                                }
                                if (var498 == 5205) {
                                    var6--;
                                    class182.method1287(0, class111.field1940[var6]);
                                    continue;
                                }
                                if (var498 == 5206) {
                                    var9--;
                                    int var176 = class180.field3236[var9];
                                    class254 var177 = class285.method1937(false, var176 & 0x3FFF, var176 >> 14 & 0x3FFF);
                                    if (var177 == null) {
                                        class111.field1940[var6++] = class201.field3548;
                                    } else {
                                        class111.field1940[var6++] = var177.field4557;
                                    }
                                    continue;
                                }
                                if (var498 == 5207) {
                                    var6--;
                                    class254 var178 = class215.method1541(class111.field1940[var6], 1);
                                    if (var178 != null && var178.field4558 != null) {
                                        class111.field1940[var6++] = var178.field4558;
                                        continue;
                                    }
                                    class111.field1940[var6++] = class201.field3548;
                                    continue;
                                }
                                if (var498 == 5208) {
                                    class180.field3236[var9++] = class230.field4219;
                                    class180.field3236[var9++] = class190.field3354;
                                    continue;
                                }
                                if (var498 == 5209) {
                                    class180.field3236[var9++] = class276.field4842 + class198.field3473;
                                    class180.field3236[var9++] = class70.field1253 + class111.field1932 - class39.field786 - 1;
                                    continue;
                                }
                                if (var498 == 5210) {
                                    class254 var179 = class262.method1814(-23145);
                                    if (var179 == null) {
                                        class180.field3236[var9++] = 0;
                                        class180.field3236[var9++] = 0;
                                    } else {
                                        class180.field3236[var9++] = var179.field4553 * 64;
                                        class180.field3236[var9++] = var179.field4544 * 64;
                                    }
                                    continue;
                                }
                                if (var498 == 5211) {
                                    class254 var180 = class262.method1814(-23145);
                                    if (var180 == null) {
                                        class180.field3236[var9++] = 0;
                                        class180.field3236[var9++] = 0;
                                    } else {
                                        class180.field3236[var9++] = var180.field4551 - var180.field4546;
                                        class180.field3236[var9++] = var180.field4555 - var180.field4556;
                                    }
                                    continue;
                                }
                                if (var498 == 5212) {
                                    int var181 = class132.method921(0);
                                    int var182 = 0;
                                    class207 var183;
                                    if (var181 == -1) {
                                        var183 = class201.field3548;
                                    } else {
                                        var183 = class57.field1052.field3312[var181];
                                        var182 = class57.field1052.method1306(var181, 3);
                                    }
                                    class207 var184 = var183.method1447((byte) 37, class92.field1637, class82.field1487);
                                    class111.field1940[var6++] = var184;
                                    class180.field3236[var9++] = var182;
                                    continue;
                                }
                                if (var498 == 5213) {
                                    int var185 = 0;
                                    int var186 = class59.method434(true);
                                    class207 var187;
                                    if (var186 == -1) {
                                        var187 = class201.field3548;
                                    } else {
                                        var187 = class57.field1052.field3312[var186];
                                        var185 = class57.field1052.method1306(var186, 3);
                                    }
                                    class207 var188 = var187.method1447((byte) 124, class92.field1637, class82.field1487);
                                    class111.field1940[var6++] = var188;
                                    class180.field3236[var9++] = var185;
                                    continue;
                                }
                                if (var498 == 5214) {
                                    var9--;
                                    int var189 = class180.field3236[var9];
                                    class31.method240((var189 & 0xFFFEB30) >> 14, var189 & 0x3FFF, true);
                                    continue;
                                }
                                if (var498 == 5215) {
                                    var9--;
                                    int var190 = class180.field3236[var9];
                                    var6--;
                                    class207 var191 = class111.field1940[var6];
                                    class51 var192 = class157.method1149((byte) -87, var190 & 0x3FFF, (var190 & 0xFFFFE02) >> 14);
                                    boolean var193 = false;
                                    for (class254 var194 = (class254) var192.method391(65535); var194 != null; var194 = (class254) var192.method399(1048575)) {
                                        if (var194.field4557.method1462(var191, !arg0)) {
                                            var193 = true;
                                            break;
                                        }
                                    }
                                    if (var193) {
                                        class180.field3236[var9++] = 1;
                                    } else {
                                        class180.field3236[var9++] = 0;
                                    }
                                    continue;
                                }
                                if (var498 == 5216) {
                                    var9--;
                                    int var195 = class180.field3236[var9];
                                    class164.method1184(!arg0, var195);
                                    continue;
                                }
                                if (var498 == 5217) {
                                    var9--;
                                    int var196 = class180.field3236[var9];
                                    if (class87.method641(123, var196)) {
                                        class180.field3236[var9++] = 1;
                                    } else {
                                        class180.field3236[var9++] = 0;
                                    }
                                    continue;
                                }
                                if (var498 == 5218) {
                                    class254 var197 = class262.method1814(-23145);
                                    if (var197 == null) {
                                        class180.field3236[var9++] = -1;
                                    } else {
                                        class180.field3236[var9++] = var197.field4550;
                                    }
                                    continue;
                                }
                                if (var498 == 5219) {
                                    var6--;
                                    class164.method1189(class111.field1940[var6], (byte) -24);
                                    continue;
                                }
                                if (var498 == 5220) {
                                    class180.field3236[var9++] = class134.field2325 == 100 ? 1 : 0;
                                    continue;
                                }
                            } else if (var498 < 5400) {
                                if (var498 == 5300) {
                                    var9 -= 2;
                                    class180.field3236[var9++] = 0;
                                    continue;
                                }
                                if (var498 == 5301) {
                                    continue;
                                }
                                if (var498 == 5302) {
                                    class180.field3236[var9++] = 0;
                                    continue;
                                }
                                if (var498 == 5303) {
                                    var9--;
                                    class180.field3236[var9++] = 0;
                                    class180.field3236[var9++] = 0;
                                    continue;
                                }
                                if (var498 == 5305) {
                                    byte var261 = -1;
                                    class180.field3236[var9++] = var261;
                                    continue;
                                }
                                if (var498 == 5306) {
                                    class180.field3236[var9++] = class262.method1813(7);
                                    continue;
                                }
                                if (var498 == 5307) {
                                    var9--;
                                    int var262 = class180.field3236[var9];
                                    if (var262 < 0 || var262 > 2) {
                                        var262 = 0;
                                    }
                                    class185.method1296(-1, -1, var262, false, -16498);
                                    continue;
                                }
                                if (var498 == 5308) {
                                    class180.field3236[var9++] = class156.field2743;
                                    continue;
                                }
                                if (var498 == 5309) {
                                    var9--;
                                    int var263 = class180.field3236[var9];
                                    if (var263 < 0 || var263 > 2) {
                                        var263 = 0;
                                    }
                                    class156.field2743 = var263;
                                    class254.method1769(255, class20.field326);
                                    continue;
                                }
                            } else if (var498 < 5500) {
                                if (var498 == 5400) {
                                    class254.field4561++;
                                    var6 -= 2;
                                    class207 var198 = class111.field1940[var6];
                                    class207 var199 = class111.field1940[var6 + 1];
                                    var9--;
                                    int var200 = class180.field3236[var9];
                                    class261.field4645.method767(39, (byte) 43);
                                    class261.field4645.method1041(true, class278.method1891((byte) -113, var198) - (-class278.method1891((byte) -113, var199) - 1));
                                    class261.field4645.method1040(true, var198);
                                    class261.field4645.method1040(true, var199);
                                    class261.field4645.method1041(true, var200);
                                    continue;
                                }
                                if (var498 == 5401) {
                                    var9 -= 2;
                                    class207.field3679[class180.field3236[var9]] = (short) class99.method729(true, class180.field3236[var9 + 1]);
                                    class98.method691(29);
                                    class117.method824(arg0);
                                    class36.method263(0);
                                    class28.method222(false);
                                    class248.method1745((byte) -127);
                                    continue;
                                }
                                if (var498 == 5405) {
                                    var9 -= 2;
                                    int var201 = class180.field3236[var9];
                                    int var202 = class180.field3236[var9 + 1];
                                    if (var201 >= 0 && var201 < 2) {
                                        class212.field3767[var201] = new int[var202 << 1][4];
                                    }
                                    continue;
                                }
                                if (var498 == 5406) {
                                    var9 -= 7;
                                    int var203 = class180.field3236[var9];
                                    int var204 = class180.field3236[var9 + 1] << 1;
                                    int var205 = class180.field3236[var9 + 2];
                                    int var206 = class180.field3236[var9 + 3];
                                    int var207 = class180.field3236[var9 + 4];
                                    int var208 = class180.field3236[var9 + 5];
                                    int var209 = class180.field3236[var9 + 6];
                                    if (var203 >= 0 && var203 < 2 && class212.field3767[var203] != null && var204 >= 0 && class212.field3767[var203].length > var204) {
                                        class212.field3767[var203][var204] = new int[] { class121.method860(16383, var205 >> 14) * 128, var206, class121.method860(var205, 16383) * 128, var209 };
                                        class212.field3767[var203][var204 + 1] = new int[] { (class121.method860(var207, 268425576) >> 14) * 128, var208, class121.method860(var207, 16383) * 128 };
                                    }
                                    continue;
                                }
                                if (var498 == 5407) {
                                    var9--;
                                    int var210 = class212.field3767[class180.field3236[var9]].length >> 1;
                                    class180.field3236[var9++] = var210;
                                    continue;
                                }
                                if (var498 == 5411) {
                                    if (class272.field4794 == null) {
                                        class190.method1326(false, class259.method1803(105), false);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var498 == 5419) {
                                    class207 var211 = class201.field3548;
                                    if (class81.field1468 != null) {
                                        var211 = class129.method906(-257, class81.field1468.field1697);
                                        try {
                                            if (class81.field1468.field1699 != null) {
                                                byte[] var212 = ((String) class81.field1468.field1699).getBytes("ISO-8859-1");
                                                var211 = class140.method971(var212.length, 0, 2, var212);
                                            }
                                        } catch (UnsupportedEncodingException var496) {
                                        }
                                    }
                                    class111.field1940[var6++] = var211;
                                    continue;
                                }
                                if (var498 == 5420) {
                                    class180.field3236[var9++] = class229.field4193 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 5421) {
                                    var6--;
                                    class207 var213 = class111.field1940[var6];
                                    var9--;
                                    boolean var214 = class180.field3236[var9] == 1;
                                    class207 var215 = class105.method757(false, new class207[] { class259.method1803(119), var213 });
                                    if (class272.field4794 == null && (!var214 || class229.field4193 == 3 || !class229.field4205.startsWith("win") || class192.field3389)) {
                                        class190.method1326(var214, var215, arg0);
                                        continue;
                                    }
                                    class161.field2852 = var215;
                                    class31.field624 = var214;
                                    class185.field3284 = class20.field326.method1629(true, new String(var215.method1451(99), "ISO-8859-1"));
                                    continue;
                                }
                                if (var498 == 5422) {
                                    var6 -= 2;
                                    class207 var216 = class111.field1940[var6 + 1];
                                    class207 var217 = class111.field1940[var6];
                                    var9--;
                                    int var218 = class180.field3236[var9];
                                    if (var217.method1450((byte) -111) > 0) {
                                        if (field142 == null) {
                                            field142 = new class207[class81.field1480[class171.field3035]];
                                        }
                                        field142[var218] = var217;
                                    }
                                    if (var216.method1450((byte) 69) > 0) {
                                        if (class128.field2225 == null) {
                                            class128.field2225 = new class207[class81.field1480[class171.field3035]];
                                        }
                                        class128.field2225[var218] = var216;
                                    }
                                    continue;
                                }
                                if (var498 == 5423) {
                                    var6--;
                                    class111.field1940[var6].method1446(-52);
                                    continue;
                                }
                                if (var498 == 5424) {
                                    var9 -= 11;
                                    class57.field1059 = class180.field3236[var9];
                                    class27.field553 = class180.field3236[var9 + 1];
                                    class85.field1538 = class180.field3236[var9 + 2];
                                    class9.field125 = class180.field3236[var9 + 3];
                                    class215.field3834 = class180.field3236[var9 + 4];
                                    class28.field578 = class180.field3236[var9 + 5];
                                    class71.field1269 = class180.field3236[var9 + 6];
                                    class162.field2870 = class180.field3236[var9 + 7];
                                    class69.field1240 = class180.field3236[var9 + 8];
                                    class235.field4349 = class180.field3236[var9 + 9];
                                    class101.field1831 = class180.field3236[var9 + 10];
                                    class101.field1832.method723(class215.field3834, true);
                                    class101.field1832.method723(class28.field578, true);
                                    class101.field1832.method723(class71.field1269, true);
                                    class101.field1832.method723(class162.field2870, true);
                                    class101.field1832.method723(class69.field1240, true);
                                    class221.field4068 = true;
                                    continue;
                                }
                                if (var498 == 5425) {
                                    class98.method692(true);
                                    class221.field4068 = false;
                                    continue;
                                }
                                if (var498 == 5426) {
                                    var9--;
                                    class118.field2050 = class180.field3236[var9];
                                    continue;
                                }
                                if (var498 == 5427) {
                                    var9 -= 2;
                                    class60.field1093 = class180.field3236[var9];
                                    class186.field3290 = class180.field3236[var9 + 1];
                                    continue;
                                }
                            } else if (var498 < 5600) {
                                if (var498 == 5500) {
                                    var9 -= 4;
                                    int var249 = class180.field3236[var9 + 1];
                                    int var250 = class180.field3236[var9 + 3];
                                    int var251 = class180.field3236[var9];
                                    int var252 = class180.field3236[var9 + 2];
                                    class107.method771(false, var249, var250, (var251 & 0x3FFF) - class180.field3231, false, (var251 >> 14 & 0x3FFF) - class21.field349, var252);
                                    continue;
                                }
                                if (var498 == 5501) {
                                    var9 -= 4;
                                    int var253 = class180.field3236[var9];
                                    int var254 = class180.field3236[var9 + 1];
                                    int var255 = class180.field3236[var9 + 2];
                                    int var256 = class180.field3236[var9 + 3];
                                    class14.method79(var256, -72, var254, ((var253 & 0xFFFEC1B) >> 14) - class21.field349, (var253 & 0x3FFF) - class180.field3231, var255);
                                    continue;
                                }
                                if (var498 == 5502) {
                                    var9 -= 6;
                                    int var257 = class180.field3236[var9];
                                    if (var257 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class256.field4587 = var257;
                                    int var258 = class180.field3236[var9 + 1];
                                    if ((var258 + 1) >= (class212.field3767[class256.field4587].length >> 1)) {
                                        throw new RuntimeException();
                                    }
                                    class179.field3226 = 0;
                                    class129.field2261 = var258;
                                    class6.field89 = class180.field3236[var9 + 2];
                                    class212.field3768 = class180.field3236[var9 + 3];
                                    int var259 = class180.field3236[var9 + 4];
                                    if (var259 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class25.field532 = var259;
                                    int var260 = class180.field3236[var9 + 5];
                                    if (var260 + 1 >= class212.field3767[class25.field532].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class132.field2290 = 3;
                                    class86.field1563 = var260;
                                    continue;
                                }
                                if (var498 == 5503) {
                                    class119.method852((byte) 35);
                                    continue;
                                }
                                if (var498 == 5504) {
                                    var9 -= 2;
                                    class25.field533 = class180.field3236[var9];
                                    class266.field4711 = class180.field3236[var9 + 1];
                                    if (class132.field2290 == 2) {
                                        class228.field4186 = class25.field533;
                                        class101.field1819 = class266.field4711;
                                    }
                                    class105.method761(-4);
                                    continue;
                                }
                                if (var498 == 5505) {
                                    class180.field3236[var9++] = class25.field533;
                                    continue;
                                }
                                if (var498 == 5506) {
                                    class180.field3236[var9++] = class266.field4711;
                                    continue;
                                }
                            } else if (var498 < 5700) {
                                if (var498 == 5600) {
                                    var9--;
                                    int var219 = class180.field3236[var9];
                                    var6 -= 2;
                                    class207 var220 = class111.field1940[var6 + 1];
                                    class207 var221 = class111.field1940[var6];
                                    if (class250.field4524 == 10 && class202.field3573 == 0 && class149.field2625 == 0 && class242.field4411 == 0 && client.field2678 == 0) {
                                        class277.method1886(var219, var221, (byte) 117, var220);
                                    }
                                    continue;
                                }
                                if (var498 == 5601) {
                                    class120.method855(10);
                                    continue;
                                }
                                if (var498 == 5602) {
                                    if (class149.field2625 == 0) {
                                        class92.field1640 = -2;
                                    }
                                    continue;
                                }
                                if (var498 == 5603) {
                                    var9 -= 4;
                                    if (class250.field4524 == 10 && class202.field3573 == 0 && class149.field2625 == 0 && class242.field4411 == 0 && client.field2678 == 0) {
                                        class286.method1954(class180.field3236[var9 + 1], class180.field3236[var9 + 3], (byte) -23, class180.field3236[var9 + 2], class180.field3236[var9]);
                                    }
                                    continue;
                                }
                                if (var498 == 5604) {
                                    var6--;
                                    if (class250.field4524 == 10 && class202.field3573 == 0 && class149.field2625 == 0 && class242.field4411 == 0 && client.field2678 == 0) {
                                        class116.method820((byte) 91, class111.field1940[var6].method1428(0));
                                    }
                                    continue;
                                }
                                if (var498 == 5605) {
                                    var9 -= 4;
                                    var6 -= 2;
                                    if (class250.field4524 == 10 && class202.field3573 == 0 && class149.field2625 == 0 && class242.field4411 == 0 && client.field2678 == 0) {
                                        class235.method1678(class111.field1940[var6].method1428(0), class180.field3236[var9 + 2], class180.field3236[var9 + 3], class180.field3236[var9 + 1], 99999999, class180.field3236[var9], class111.field1940[var6 + 1]);
                                    }
                                    continue;
                                }
                                if (var498 == 5606) {
                                    if (class242.field4411 == 0) {
                                        class25.field521 = -2;
                                    }
                                    continue;
                                }
                                if (var498 == 5607) {
                                    class180.field3236[var9++] = class92.field1640;
                                    continue;
                                }
                                if (var498 == 5608) {
                                    class180.field3236[var9++] = class8.field111;
                                    continue;
                                }
                                if (var498 == 5609) {
                                    class180.field3236[var9++] = class25.field521;
                                    continue;
                                }
                                if (var498 == 5610) {
                                    for (int var222 = 0; var222 < 5; var222++) {
                                        class111.field1940[var6++] = class182.field3242.length > var222 ? class182.field3242[var222].method1423(118) : class201.field3548;
                                    }
                                    class182.field3242 = null;
                                    continue;
                                }
                                if (var498 == 5611) {
                                    class180.field3236[var9++] = class138.field2396;
                                    continue;
                                }
                            } else if (var498 < 6100) {
                                if (var498 == 6001) {
                                    var9--;
                                    int var223 = class180.field3236[var9];
                                    if (var223 < 1) {
                                        var223 = 1;
                                    }
                                    if (var223 > 4) {
                                        var223 = 4;
                                    }
                                    class116.field2013 = var223;
                                    if (class116.field2013 == 1) {
                                        class257.method1781(0.9F);
                                    }
                                    if (class116.field2013 == 2) {
                                        class257.method1781(0.8F);
                                    }
                                    if (class116.field2013 == 3) {
                                        class257.method1781(0.7F);
                                    }
                                    if (class116.field2013 == 4) {
                                        class257.method1781(0.6F);
                                    }
                                    class117.method824(false);
                                    class254.method1769(255, class20.field326);
                                    class269.field4768 = false;
                                    continue;
                                }
                                if (var498 == 6002) {
                                    var9--;
                                    class125.method882(-17, ~class180.field3236[var9] == -2);
                                    class55.method414(3966);
                                    class240.method1696(-7413);
                                    class191.method1330(-87);
                                    class254.method1769(255, class20.field326);
                                    class269.field4768 = false;
                                    continue;
                                }
                                if (var498 == 6003) {
                                    var9--;
                                    class256.field4585 = class180.field3236[var9] == 1;
                                    class191.method1330(-122);
                                    class254.method1769(255, class20.field326);
                                    class269.field4768 = false;
                                    continue;
                                }
                                if (var498 == 6005) {
                                    var9--;
                                    class278.field4884 = class180.field3236[var9] == 1;
                                    class240.method1696(-7413);
                                    class254.method1769(255, class20.field326);
                                    class269.field4768 = false;
                                    continue;
                                }
                                if (var498 == 6006) {
                                    var9--;
                                    class247.field4476 = class180.field3236[var9] == 1;
                                    ((class45) class257.field4602).method350((byte) -9, !class247.field4476);
                                    class254.method1769(255, class20.field326);
                                    class269.field4768 = false;
                                    continue;
                                }
                                if (var498 == 6007) {
                                    var9--;
                                    field139 = class180.field3236[var9] == 1;
                                    class254.method1769(255, class20.field326);
                                    class269.field4768 = false;
                                    continue;
                                }
                                if (var498 == 6008) {
                                    var9--;
                                    client.field2694 = class180.field3236[var9] == 1;
                                    class254.method1769(255, class20.field326);
                                    class269.field4768 = false;
                                    continue;
                                }
                                if (var498 == 6009) {
                                    var9--;
                                    class261.field4655 = class180.field3236[var9] == 1;
                                    class254.method1769(255, class20.field326);
                                    class269.field4768 = false;
                                    continue;
                                }
                                if (var498 == 6010) {
                                    var9--;
                                    class230.field4214 = class180.field3236[var9] == 1;
                                    class254.method1769(255, class20.field326);
                                    class269.field4768 = false;
                                    continue;
                                }
                                if (var498 == 6011) {
                                    var9--;
                                    int var224 = class180.field3236[var9];
                                    if (var224 < 0 || var224 > 2) {
                                        var224 = 0;
                                    }
                                    class231.field4238 = var224;
                                    class254.method1769(255, class20.field326);
                                    class269.field4768 = false;
                                    continue;
                                }
                                if (var498 == 6012) {
                                    var9--;
                                    class287.field5125 = class180.field3236[var9] == 1;
                                    if (class116.field2013 == 1) {
                                        class257.method1781(0.9F);
                                    }
                                    if (class116.field2013 == 2) {
                                        class257.method1781(0.8F);
                                    }
                                    if (class116.field2013 == 3) {
                                        class257.method1781(0.7F);
                                    }
                                    if (class116.field2013 == 4) {
                                        class257.method1781(0.6F);
                                    }
                                    class240.method1696(-7413);
                                    class254.method1769(255, class20.field326);
                                    class269.field4768 = false;
                                    continue;
                                }
                                if (var498 == 6014) {
                                    var9--;
                                    class120.field2087 = class180.field3236[var9] == 1;
                                    class254.method1769(255, class20.field326);
                                    class269.field4768 = false;
                                    continue;
                                }
                                if (var498 == 6015) {
                                    var9--;
                                    class85.field1545 = class180.field3236[var9] == 1;
                                    class254.method1769(255, class20.field326);
                                    class269.field4768 = false;
                                    continue;
                                }
                                if (var498 == 6016) {
                                    var9--;
                                    int var225 = class180.field3236[var9];
                                    if (var225 < 0 || var225 > 2) {
                                        var225 = 0;
                                    }
                                    class65.field1182 = var225;
                                    continue;
                                }
                                if (var498 == 6017) {
                                    var9--;
                                    class190.field3348 = class180.field3236[var9] == 1;
                                    class124.method872(0);
                                    class254.method1769(255, class20.field326);
                                    class269.field4768 = false;
                                    continue;
                                }
                                if (var498 == 6018) {
                                    var9--;
                                    int var226 = class180.field3236[var9];
                                    if (var226 < 0) {
                                        var226 = 0;
                                    }
                                    if (var226 > 127) {
                                        var226 = 127;
                                    }
                                    class32.field653 = var226;
                                    class254.method1769(255, class20.field326);
                                    class269.field4768 = false;
                                    continue;
                                }
                                if (var498 == 6019) {
                                    var9--;
                                    int var227 = class180.field3236[var9];
                                    if (var227 < 0) {
                                        var227 = 0;
                                    }
                                    if (var227 > 255) {
                                        var227 = 255;
                                    }
                                    if (class123.field2125 != var227) {
                                        if (class123.field2125 == 0 && class219.field3865 != -1) {
                                            class245.method1723(0, var227, class56.field1050, false, -128, class219.field3865);
                                            class223.field4081 = false;
                                        } else if (var227 == 0) {
                                            class221.method1574(20612);
                                            class223.field4081 = false;
                                        } else {
                                            class163.method1179(var227, -19353);
                                        }
                                        class123.field2125 = var227;
                                    }
                                    class254.method1769(255, class20.field326);
                                    class269.field4768 = false;
                                    continue;
                                }
                                if (var498 == 6020) {
                                    var9--;
                                    int var228 = class180.field3236[var9];
                                    if (var228 < 0) {
                                        var228 = 0;
                                    }
                                    if (var228 > 127) {
                                        var228 = 127;
                                    }
                                    class167.field2927 = var228;
                                    class254.method1769(255, class20.field326);
                                    class269.field4768 = false;
                                    continue;
                                }
                                if (var498 == 6021) {
                                    var9--;
                                    class13.field183 = class180.field3236[var9] == 1;
                                    class191.method1330(-108);
                                    continue;
                                }
                                if (var498 == 6023) {
                                    var9--;
                                    int var229 = class180.field3236[var9];
                                    if (var229 < 0) {
                                        var229 = 0;
                                    }
                                    boolean var230 = false;
                                    if (var229 > 2) {
                                        var229 = 2;
                                    }
                                    if (class170.field3023 < 96) {
                                        var229 = 0;
                                        var230 = true;
                                    }
                                    class64.method463(var229);
                                    class254.method1769(255, class20.field326);
                                    class269.field4768 = false;
                                    class180.field3236[var9++] = var230 ? 0 : 1;
                                    continue;
                                }
                                if (var498 == 6024) {
                                    var9--;
                                    int var231 = class180.field3236[var9];
                                    if (var231 < 0 || var231 > 2) {
                                        var231 = 0;
                                    }
                                    class47.field938 = var231;
                                    class254.method1769(255, class20.field326);
                                    continue;
                                }
                                if (var498 == 6028) {
                                    var9--;
                                    class62.field1127 = class180.field3236[var9] != 0;
                                    class254.method1769(255, class20.field326);
                                    continue;
                                }
                            } else if (var498 < 6200) {
                                if (var498 == 6101) {
                                    class180.field3236[var9++] = class116.field2013;
                                    continue;
                                }
                                if (var498 == 6102) {
                                    class180.field3236[var9++] = class212.method1512(-37) ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6103) {
                                    class180.field3236[var9++] = class256.field4585 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6105) {
                                    class180.field3236[var9++] = class278.field4884 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6106) {
                                    class180.field3236[var9++] = class247.field4476 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6107) {
                                    class180.field3236[var9++] = field139 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6108) {
                                    class180.field3236[var9++] = client.field2694 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6109) {
                                    class180.field3236[var9++] = class261.field4655 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6110) {
                                    class180.field3236[var9++] = class230.field4214 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6111) {
                                    class180.field3236[var9++] = class231.field4238;
                                    continue;
                                }
                                if (var498 == 6112) {
                                    class180.field3236[var9++] = class287.field5125 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6114) {
                                    class180.field3236[var9++] = class120.field2087 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6115) {
                                    class180.field3236[var9++] = class85.field1545 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6116) {
                                    class180.field3236[var9++] = class65.field1182;
                                    continue;
                                }
                                if (var498 == 6117) {
                                    class180.field3236[var9++] = class190.field3348 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6118) {
                                    class180.field3236[var9++] = class32.field653;
                                    continue;
                                }
                                if (var498 == 6119) {
                                    class180.field3236[var9++] = class123.field2125;
                                    continue;
                                }
                                if (var498 == 6120) {
                                    class180.field3236[var9++] = class167.field2927;
                                    continue;
                                }
                                if (var498 == 6121) {
                                    class180.field3236[var9++] = 0;
                                    continue;
                                }
                                if (var498 == 6123) {
                                    class180.field3236[var9++] = class64.method462();
                                    continue;
                                }
                                if (var498 == 6124) {
                                    class180.field3236[var9++] = class47.field938;
                                    continue;
                                }
                                if (var498 == 6128) {
                                    class180.field3236[var9++] = class62.field1127 ? 1 : 0;
                                    continue;
                                }
                            } else if (var498 < 6300) {
                                if (var498 == 6200) {
                                    var9 -= 2;
                                    class232.field4247 = (short) class180.field3236[var9];
                                    if (class232.field4247 <= 0) {
                                        class232.field4247 = 256;
                                    }
                                    class169.field2972 = (short) class180.field3236[var9 + 1];
                                    if (class169.field2972 <= 0) {
                                        class169.field2972 = 205;
                                    }
                                    continue;
                                }
                                if (var498 == 6201) {
                                    var9 -= 2;
                                    class93.field1650 = (short) class180.field3236[var9];
                                    if (class93.field1650 <= 0) {
                                        class93.field1650 = 256;
                                    }
                                    class261.field4646 = (short) class180.field3236[var9 + 1];
                                    if (class261.field4646 <= 0) {
                                        class261.field4646 = 320;
                                    }
                                    continue;
                                }
                                if (var498 == 6202) {
                                    var9 -= 4;
                                    class75.field1383 = (short) class180.field3236[var9];
                                    if (class75.field1383 <= 0) {
                                        class75.field1383 = 1;
                                    }
                                    class69.field1220 = (short) class180.field3236[var9 + 1];
                                    if (class69.field1220 <= 0) {
                                        class69.field1220 = 32767;
                                    } else if (class69.field1220 < class75.field1383) {
                                        class69.field1220 = class75.field1383;
                                    }
                                    class70.field1246 = (short) class180.field3236[var9 + 2];
                                    if (class70.field1246 <= 0) {
                                        class70.field1246 = 1;
                                    }
                                    class172.field3037 = (short) class180.field3236[var9 + 3];
                                    if (class172.field3037 <= 0) {
                                        class172.field3037 = 32767;
                                    } else if (class70.field1246 > class172.field3037) {
                                        class172.field3037 = class70.field1246;
                                    }
                                    continue;
                                }
                                if (var498 == 6203) {
                                    class236.method1686(0, class262.field4670.field4037, false, class262.field4670.field3948, 0, 112);
                                    class180.field3236[var9++] = class177.field3190;
                                    class180.field3236[var9++] = class156.field2754;
                                    continue;
                                }
                                if (var498 == 6204) {
                                    class180.field3236[var9++] = class93.field1650;
                                    class180.field3236[var9++] = class261.field4646;
                                    continue;
                                }
                                if (var498 == 6205) {
                                    class180.field3236[var9++] = class232.field4247;
                                    class180.field3236[var9++] = class169.field2972;
                                    continue;
                                }
                            } else if (var498 < 6400) {
                                if (var498 == 6300) {
                                    class180.field3236[var9++] = (int) (class53.method405(78) / 60000L);
                                    continue;
                                }
                                if (var498 == 6301) {
                                    class180.field3236[var9++] = (int) (class53.method405(70) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var498 == 6302) {
                                    var9 -= 3;
                                    int var232 = class180.field3236[var9];
                                    int var233 = class180.field3236[var9 + 2];
                                    int var234 = class180.field3236[var9 + 1];
                                    class62.field1134.clear();
                                    class62.field1134.set(11, 12);
                                    class62.field1134.set(var233, var234, var232);
                                    class180.field3236[var9++] = (int) (class62.field1134.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var498 == 6303) {
                                    class62.field1134.clear();
                                    class62.field1134.setTime(new Date(class53.method405(97)));
                                    class180.field3236[var9++] = class62.field1134.get(1);
                                    continue;
                                }
                                if (var498 == 6304) {
                                    boolean var235 = true;
                                    var9--;
                                    int var236 = class180.field3236[var9];
                                    if (var236 < 0) {
                                        var235 = ((var236 + 1) % 4) == 0;
                                    } else if (var236 < 1582) {
                                        var235 = (var236 % 4) == 0;
                                    } else if (var236 % 4 != 0) {
                                        var235 = false;
                                    } else if ((var236 % 100) != 0) {
                                        var235 = true;
                                    } else if ((var236 % 400) != 0) {
                                        var235 = false;
                                    }
                                    class180.field3236[var9++] = var235 ? 1 : 0;
                                    continue;
                                }
                            } else if (var498 < 6500) {
                                if (var498 == 6405) {
                                    class180.field3236[var9++] = class6.method39((byte) -116) ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6406) {
                                    class180.field3236[var9++] = class237.method1688(19805) ? 1 : 0;
                                    continue;
                                }
                            } else if (var498 < 6600) {
                                if (var498 == 6500) {
                                    if (class250.field4524 == 10 && class202.field3573 == 0 && class149.field2625 == 0 && class242.field4411 == 0) {
                                        class180.field3236[var9++] = class216.method1545((byte) 108) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class180.field3236[var9++] = 1;
                                    continue;
                                }
                                if (var498 == 6501) {
                                    class260 var237 = class9.method55(0);
                                    if (var237 == null) {
                                        class180.field3236[var9++] = -1;
                                        class180.field3236[var9++] = 0;
                                        class111.field1940[var6++] = class201.field3548;
                                        class180.field3236[var9++] = 0;
                                        class111.field1940[var6++] = class201.field3548;
                                        class180.field3236[var9++] = 0;
                                    } else {
                                        class180.field3236[var9++] = var237.field4631;
                                        class180.field3236[var9++] = var237.field4936;
                                        class111.field1940[var6++] = var237.field4637;
                                        class110 var238 = var237.method1807(20299);
                                        class180.field3236[var9++] = var238.field1928;
                                        class111.field1940[var6++] = var238.field1923;
                                        class180.field3236[var9++] = var237.field4938;
                                    }
                                    continue;
                                }
                                if (var498 == 6502) {
                                    class260 var239 = class155.method1138(-124);
                                    if (var239 == null) {
                                        class180.field3236[var9++] = -1;
                                        class180.field3236[var9++] = 0;
                                        class111.field1940[var6++] = class201.field3548;
                                        class180.field3236[var9++] = 0;
                                        class111.field1940[var6++] = class201.field3548;
                                        class180.field3236[var9++] = 0;
                                    } else {
                                        class180.field3236[var9++] = var239.field4631;
                                        class180.field3236[var9++] = var239.field4936;
                                        class111.field1940[var6++] = var239.field4637;
                                        class110 var240 = var239.method1807(20299);
                                        class180.field3236[var9++] = var240.field1928;
                                        class111.field1940[var6++] = var240.field1923;
                                        class180.field3236[var9++] = var239.field4938;
                                    }
                                    continue;
                                }
                                if (var498 == 6503) {
                                    var9--;
                                    int var241 = class180.field3236[var9];
                                    if (class250.field4524 == 10 && class202.field3573 == 0 && class149.field2625 == 0 && class242.field4411 == 0) {
                                        class180.field3236[var9++] = class78.method591((byte) -62, var241) ? 1 : 0;
                                        continue;
                                    }
                                    class180.field3236[var9++] = 0;
                                    continue;
                                }
                                if (var498 == 6504) {
                                    var9--;
                                    class173.field3094 = class180.field3236[var9];
                                    class254.method1769(255, class20.field326);
                                    continue;
                                }
                                if (var498 == 6505) {
                                    class180.field3236[var9++] = class173.field3094;
                                    continue;
                                }
                                if (var498 == 6506) {
                                    var9--;
                                    int var242 = class180.field3236[var9];
                                    class260 var243 = class97.method689((byte) 113, var242);
                                    if (var243 == null) {
                                        class180.field3236[var9++] = -1;
                                        class111.field1940[var6++] = class201.field3548;
                                        class180.field3236[var9++] = 0;
                                        class111.field1940[var6++] = class201.field3548;
                                        class180.field3236[var9++] = 0;
                                    } else {
                                        class180.field3236[var9++] = var243.field4936;
                                        class111.field1940[var6++] = var243.field4637;
                                        class110 var244 = var243.method1807(20299);
                                        class180.field3236[var9++] = var244.field1928;
                                        class111.field1940[var6++] = var244.field1923;
                                        class180.field3236[var9++] = var243.field4938;
                                    }
                                    continue;
                                }
                                if (var498 == 6507) {
                                    var9 -= 4;
                                    int var245 = class180.field3236[var9];
                                    boolean var246 = class180.field3236[var9 + 1] == 1;
                                    int var247 = class180.field3236[var9 + 2];
                                    boolean var248 = class180.field3236[var9 + 3] == 1;
                                    class277.method1881(-34, var248, var247, var246, var245);
                                    continue;
                                }
                            } else if (var498 < 6700) {
                                if (var498 == 6600) {
                                    var9--;
                                    class214.field3808 = class180.field3236[var9] == 1;
                                    class254.method1769(255, class20.field326);
                                    continue;
                                }
                                if (var498 == 6601) {
                                    class180.field3236[var9++] = class214.field3808 ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var498 == 4500) {
                            var9 -= 2;
                            int var329 = class180.field3236[var9];
                            int var330 = class180.field3236[var9 + 1];
                            class119 var331 = class276.method1880(var330, (byte) -47);
                            if (var331.method853(-116)) {
                                class111.field1940[var6++] = class19.method112(34, var329).method1366(1, var330, var331.field2067);
                            } else {
                                class180.field3236[var9++] = class19.method112(97, var329).method1373(29491, var331.field2061, var330);
                            }
                            continue;
                        }
                    } else if (var498 == 4300) {
                        var9 -= 2;
                        int var332 = class180.field3236[var9];
                        int var333 = class180.field3236[var9 + 1];
                        class119 var334 = class276.method1880(var333, (byte) -47);
                        if (var334.method853(-116)) {
                            class111.field1940[var6++] = class212.method1513(var332, (byte) 10).method514(var333, (byte) 99, var334.field2067);
                        } else {
                            class180.field3236[var9++] = class212.method1513(var332, (byte) 10).method516(var333, false, var334.field2061);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var497) {
            if (var5.field4707 == null) {
                if (class164.field2903 != 0) {
                    class71.method511(23692, class201.field3548, 0, class175.field3164);
                }
                class202.method1402("CS2 - scr:" + var5.field3407 + " op:" + var10, 32701, var497);
            } else {
                class207 var493 = class191.method1335((byte) 102, 30);
                var493.method1463(class134.field2324, false).method1463(var5.field4707, false);
                for (int var494 = class202.field3569 - 1; var494 >= 0; var494--) {
                    var493.method1463(class279.field4893, arg0).method1463(class182.field3238[var494].field4882.field4707, false);
                }
                if (var10 == 40) {
                    int var495 = var8[var7];
                    var493.method1463(class93.field1647, false).method1463(class262.method1815(var495, (byte) -121), false);
                }
                if (class164.field2903 != 0) {
                    class71.method511(23692, class201.field3548, 0, class105.method757(false, new class207[] { class190.field3345, var5.field4707 }));
                }
                class202.method1402("CS2 - scr:" + var5.field3407 + " op:" + var10 + new String(var493.method1451(56)), 32701, var497);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
    public static final void method60(int arg0, int arg1) {
        class282.field4958.method1383(-8052, arg1);
        if (arg0 != 6304) {
            field140 = null;
        }
        field145++;
        class182.field3245.method1383(-8052, arg1);
    }
}
