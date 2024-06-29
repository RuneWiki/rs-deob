import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class118 {

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Lrd;")
    public static class117 field2905 = class95.method812("b12_full", (byte) 8);

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Ljava/lang/Object;")
    public static Object field2904 = new Object();

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Lrd;")
    public static class117 field2911 = class95.method812("Regelversto-8 melden", (byte) 8);

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field2910 = -1;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lrd;")
    public static class117 field2912 = class95.method812("mod_icons", (byte) 8);

    @OriginalMember(owner = "client!re", name = "l", descriptor = "Lrd;")
    private static class117 field2914 = class95.method812("Bad session id)3", (byte) 8);

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Lrd;")
    public static class117 field2907 = field2914;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Lrd;")
    public static class117 field2908 = class95.method812("Okay", (byte) 8);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Lga;")
    public static class44 field2913;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "[I")
    public static int[] field2915;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method978(int arg0) {
        field2912 = null;
        field2904 = null;
        field2907 = null;
        if (arg0 != 1000) {
            field2908 = null;
        }
        field2911 = null;
        field2915 = null;
        field2905 = null;
        field2908 = null;
        field2914 = null;
        field2913 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
    public static final Object method979(boolean arg0, byte[] arg1, int arg2) {
        if (arg2 != 2) {
            return null;
        }
        field2906++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class54.field1529) {
            try {
                class100 var3 = (class100) Class.forName("sc").getDeclaredConstructor().newInstance();
                var3.method846(-1, arg1);
                return var3;
            } catch (Throwable var4) {
                class54.field1529 = true;
            }
        }
        return arg0 ? class133.method1088(arg1, false) : arg1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B[Ljava/lang/Object;Lwa;IILwa;I)V")
    public static final void method980(byte arg0, Object[] arg1, class144 arg2, int arg3, int arg4, class144 arg5, int arg6) {
        field2909++;
        int var7 = (Integer) arg1[0];
        class61 var8 = class127.method1015(var7, false);
        if (var8 == null || arg0 < 78) {
            return;
        }
        int var9 = 0;
        int var10 = -1;
        int var11 = 0;
        int[] var12 = var8.field1699;
        int[] var13 = var8.field1721;
        byte var14 = -1;
        try {
            class138.field3309 = new class117[var8.field1717];
            int var15 = 0;
            class104.field2611 = new int[var8.field1720];
            int var16 = 0;
            for (int var17 = 1; var17 < arg1.length; var17++) {
                if (arg1[var17] instanceof Integer) {
                    int var18 = (Integer) arg1[var17];
                    if (var18 == -2147483647) {
                        var18 = arg6;
                    }
                    if (var18 == -2147483646) {
                        var18 = arg4;
                    }
                    if (var18 == -2147483645) {
                        var18 = arg2 == null ? -1 : arg2.field3441;
                    }
                    if (var18 == -2147483644) {
                        var18 = arg3;
                    }
                    if (var18 == -2147483643) {
                        var18 = arg2 == null ? -1 : arg2.field3532;
                    }
                    if (var18 == -2147483642) {
                        var18 = arg5 == null ? -1 : arg5.field3441;
                    }
                    if (var18 == -2147483641) {
                        var18 = arg5 == null ? -1 : arg5.field3532;
                    }
                    class104.field2611[var15++] = var18;
                } else if (arg1[var17] instanceof class117) {
                    class138.field3309[var16++] = (class117) arg1[var17];
                }
            }
            int var19 = 0;
            label1238: while (true) {
                var19++;
                if (var19 > 200000) {
                    throw new RuntimeException("slow");
                }
                var10++;
                int var183 = var12[var10];
                if (var183 < 100) {
                    if (var183 == 0) {
                        class25.field757[var11++] = var13[var10];
                        continue;
                    }
                    if (var183 == 1) {
                        int var20 = var13[var10];
                        class25.field757[var11++] = class105.field2621[var20];
                        continue;
                    }
                    if (var183 == 2) {
                        int var21 = var13[var10];
                        var11--;
                        class105.field2621[var21] = class25.field757[var11];
                        continue;
                    }
                    if (var183 == 3) {
                        class46.field1273[var9++] = var8.field1709[var10];
                        continue;
                    }
                    if (var183 == 6) {
                        var10 += var13[var10];
                        continue;
                    }
                    if (var183 == 7) {
                        var11 -= 2;
                        if (class25.field757[var11 + 1] != class25.field757[var11]) {
                            var10 += var13[var10];
                        }
                        continue;
                    }
                    if (var183 == 8) {
                        var11 -= 2;
                        if (class25.field757[var11 + 1] == class25.field757[var11]) {
                            var10 += var13[var10];
                        }
                        continue;
                    }
                    if (var183 == 9) {
                        var11 -= 2;
                        if (class25.field757[var11] < class25.field757[var11 + 1]) {
                            var10 += var13[var10];
                        }
                        continue;
                    }
                    if (var183 == 10) {
                        var11 -= 2;
                        if (class25.field757[var11 + 1] < class25.field757[var11]) {
                            var10 += var13[var10];
                        }
                        continue;
                    }
                    if (var183 == 21) {
                        if (class4.field96 == 0) {
                            return;
                        }
                        class54 var22 = class26.field767[--class4.field96];
                        class104.field2611 = var22.field1543;
                        var8 = var22.field1538;
                        var10 = var22.field1534;
                        class138.field3309 = var22.field1530;
                        var12 = var8.field1699;
                        var13 = var8.field1721;
                        continue;
                    }
                    if (var183 == 25) {
                        int var23 = var13[var10];
                        class25.field757[var11++] = class105.method867(var23, 134100633);
                        continue;
                    }
                    if (var183 == 27) {
                        int var24 = var13[var10];
                        var11--;
                        class62.method624(class25.field757[var11], (byte) -35, var24);
                        continue;
                    }
                    if (var183 == 31) {
                        var11 -= 2;
                        if (class25.field757[var11 + 1] >= class25.field757[var11]) {
                            var10 += var13[var10];
                        }
                        continue;
                    }
                    if (var183 == 32) {
                        var11 -= 2;
                        if (class25.field757[var11 + 1] <= class25.field757[var11]) {
                            var10 += var13[var10];
                        }
                        continue;
                    }
                    if (var183 == 33) {
                        class25.field757[var11++] = class104.field2611[var13[var10]];
                        continue;
                    }
                    int var10001;
                    if (var183 == 34) {
                        var10001 = var13[var10];
                        var11--;
                        class104.field2611[var10001] = class25.field757[var11];
                        continue;
                    }
                    if (var183 == 35) {
                        class46.field1273[var9++] = class138.field3309[var13[var10]];
                        continue;
                    }
                    if (var183 == 36) {
                        var10001 = var13[var10];
                        var9--;
                        class138.field3309[var10001] = class46.field1273[var9];
                        continue;
                    }
                    if (var183 == 37) {
                        int var25 = var13[var10];
                        var9 -= var25;
                        class117 var26 = class46.method494(var25, class46.field1273, (byte) 78, var9);
                        class46.field1273[var9++] = var26;
                        continue;
                    }
                    if (var183 == 38) {
                        var11--;
                        continue;
                    }
                    if (var183 == 39) {
                        var9--;
                        continue;
                    }
                    if (var183 == 40) {
                        int var27 = var13[var10];
                        class61 var28 = class127.method1015(var27, false);
                        int[] var29 = new int[var28.field1720];
                        class117[] var30 = new class117[var28.field1717];
                        for (int var31 = 0; var31 < var28.field1713; var31++) {
                            var29[var31] = class25.field757[var31 + var11 - var28.field1713];
                        }
                        for (int var32 = 0; var32 < var28.field1707; var32++) {
                            var30[var32] = class46.field1273[var9 + var32 - var28.field1707];
                        }
                        var9 -= var28.field1707;
                        var11 -= var28.field1713;
                        class54 var33 = new class54();
                        var33.field1530 = class138.field3309;
                        var33.field1543 = class104.field2611;
                        var33.field1538 = var8;
                        var33.field1534 = var10;
                        var10 = -1;
                        var8 = var28;
                        class26.field767[class4.field96++] = var33;
                        var12 = var28.field1699;
                        class104.field2611 = var29;
                        class138.field3309 = var30;
                        var13 = var28.field1721;
                        continue;
                    }
                    if (var183 == 42) {
                        class25.field757[var11++] = class49.field1399[var13[var10]];
                        continue;
                    }
                    if (var183 == 43) {
                        var10001 = var13[var10];
                        var11--;
                        class49.field1399[var10001] = class25.field757[var11];
                        continue;
                    }
                    if (var183 == 44) {
                        int var34 = var13[var10] & 0xFFFF;
                        int var35 = var13[var10] >> 16;
                        var11--;
                        int var36 = class25.field757[var11];
                        if (var36 >= 0 && var36 <= 5000) {
                            byte var37 = -1;
                            class117.field2879[var35] = var36;
                            if (var34 == 105) {
                                var37 = 0;
                            }
                            int var38 = 0;
                            while (true) {
                                if (var38 >= var36) {
                                    continue label1238;
                                }
                                class97.field2444[var35][var38] = var37;
                                var38++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var183 == 45) {
                        int var39 = var13[var10];
                        var11--;
                        int var40 = class25.field757[var11];
                        if (var40 >= 0 && class117.field2879[var39] > var40) {
                            class25.field757[var11++] = class97.field2444[var39][var40];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var183 == 46) {
                        var11 -= 2;
                        int var41 = var13[var10];
                        int var42 = class25.field757[var11];
                        if (var42 >= 0 && class117.field2879[var41] > var42) {
                            class97.field2444[var41][var42] = class25.field757[var11 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                }
                boolean var43;
                if (var13[var10] == 1) {
                    var43 = true;
                } else {
                    var43 = false;
                }
                if (var183 < 1000) {
                    if (var183 == 100) {
                        var11 -= 3;
                        int var44 = class25.field757[var11 + 2];
                        int var45 = class25.field757[var11 + 1];
                        int var46 = class25.field757[var11];
                        if (var45 == 0) {
                            throw new RuntimeException();
                        }
                        class144 var47 = class15.method172(var46, -13778);
                        if (var47.field3448 == null) {
                            var47.field3448 = new class144[var44 + 1];
                        }
                        if (var44 >= var47.field3448.length) {
                            class144[] var48 = new class144[var44 + 1];
                            for (int var49 = 0; var49 < var47.field3448.length; var49++) {
                                var48[var49] = var47.field3448[var49];
                            }
                            var47.field3448 = var48;
                        }
                        if (var44 > 0 && var47.field3448[var44 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var44 - 1));
                        }
                        class144 var50 = new class144();
                        var50.field3499 = true;
                        var50.field3532 = var44;
                        var50.field3533 = var45;
                        var50.field3509 = var50.field3441 = var47.field3441;
                        var47.field3448[var44] = var50;
                        if (var43) {
                            class43.field1234 = var50;
                        } else {
                            class4.field94 = var50;
                        }
                        class85.method772(-41, var47);
                        continue;
                    }
                    if (var183 == 101) {
                        class144 var51 = var43 ? class43.field1234 : class4.field94;
                        class144 var52 = class15.method172(var51.field3441, -13778);
                        var52.field3448[var51.field3532] = null;
                        class85.method772(-41, var52);
                        continue;
                    }
                    if (var183 == 102) {
                        var11--;
                        class144 var53 = class15.method172(class25.field757[var11], -13778);
                        var53.field3448 = null;
                        class85.method772(-41, var53);
                        continue;
                    }
                    if (var183 == 200) {
                        var11 -= 2;
                        int var54 = class25.field757[var11];
                        int var55 = class25.field757[var11 + 1];
                        class144 var56 = class84.method761(var55, 0, var54);
                        if (var56 != null && var55 != -1) {
                            class25.field757[var11++] = 1;
                            if (var43) {
                                class43.field1234 = var56;
                            } else {
                                class4.field94 = var56;
                            }
                            continue;
                        }
                        class25.field757[var11++] = 0;
                        continue;
                    }
                } else if (var183 >= 1000 && var183 < 1100 || !(var183 < 2000 || var183 >= 2100)) {
                    class144 var57;
                    if (var183 < 2000) {
                        var57 = var43 ? class43.field1234 : class4.field94;
                    } else {
                        var11--;
                        var57 = class15.method172(class25.field757[var11], -13778);
                        var183 -= 1000;
                    }
                    class85.method772(-41, var57);
                    if (var183 == 1000) {
                        var11 -= 2;
                        var57.field3536 = class25.field757[var11];
                        var57.field3423 = class25.field757[var11 + 1];
                        continue;
                    }
                    if (var183 == 1001) {
                        var11 -= 2;
                        var57.field3437 = class25.field757[var11];
                        var57.field3490 = class25.field757[var11 + 1];
                        continue;
                    }
                    if (var183 == 1003) {
                        var11--;
                        var57.field3539 = class25.field757[var11] == 1;
                        continue;
                    }
                } else if (var183 >= 1100 && var183 < 1200 || !(var183 < 2100 || var183 >= 2200)) {
                    class144 var180;
                    if (var183 < 2000) {
                        var180 = var43 ? class43.field1234 : class4.field94;
                    } else {
                        var11--;
                        var180 = class15.method172(class25.field757[var11], -13778);
                        var183 -= 1000;
                    }
                    class85.method772(-41, var180);
                    if (var183 == 1100) {
                        var11 -= 2;
                        var180.field3457 = class25.field757[var11];
                        if (var180.field3457 > var180.field3479 - var180.field3437) {
                            var180.field3457 = var180.field3479 - var180.field3437;
                        }
                        if (var180.field3457 < 0) {
                            var180.field3457 = 0;
                        }
                        var180.field3543 = class25.field757[var11 + 1];
                        if (var180.field3543 > var180.field3420 - var180.field3490) {
                            var180.field3543 = var180.field3420 - var180.field3490;
                        }
                        if (var180.field3543 < 0) {
                            var180.field3543 = 0;
                        }
                        continue;
                    }
                    if (var183 == 1101) {
                        var11--;
                        var180.field3502 = class25.field757[var11];
                        continue;
                    }
                    if (var183 == 1102) {
                        var11--;
                        var180.field3443 = class25.field757[var11] == 1;
                        continue;
                    }
                    if (var183 == 1103) {
                        var11--;
                        var180.field3458 = class25.field757[var11];
                        continue;
                    }
                    if (var183 == 1104) {
                        var11--;
                        var180.field3531 = class25.field757[var11];
                        continue;
                    }
                    if (var183 == 1105) {
                        var11--;
                        var180.field3529 = class25.field757[var11];
                        continue;
                    }
                    if (var183 == 1106) {
                        var11--;
                        var180.field3505 = class25.field757[var11];
                        continue;
                    }
                    if (var183 == 1107) {
                        var11--;
                        var180.field3498 = class25.field757[var11] == 1;
                        continue;
                    }
                    if (var183 == 1108) {
                        var180.field3487 = 1;
                        var11--;
                        var180.field3474 = class25.field757[var11];
                        continue;
                    }
                    if (var183 == 1109) {
                        var11 -= 6;
                        var180.field3421 = class25.field757[var11];
                        var180.field3433 = class25.field757[var11 + 1];
                        var180.field3466 = class25.field757[var11 + 2];
                        var180.field3471 = class25.field757[var11 + 3];
                        var180.field3521 = class25.field757[var11 + 4];
                        var180.field3491 = class25.field757[var11 + 5];
                        continue;
                    }
                    if (var183 == 1110) {
                        var11--;
                        var180.field3427 = class25.field757[var11];
                        continue;
                    }
                    if (var183 == 1111) {
                        var11--;
                        var180.field3416 = class25.field757[var11] == 1;
                        continue;
                    }
                    if (var183 == 1112) {
                        var9--;
                        var180.field3417 = class46.field1273[var9];
                        continue;
                    }
                    if (var183 == 1113) {
                        var11--;
                        var180.field3489 = class25.field757[var11];
                        continue;
                    }
                    if (var183 == 1114) {
                        var11 -= 3;
                        var180.field3446 = class25.field757[var11];
                        var180.field3503 = class25.field757[var11 + 1];
                        var180.field3419 = class25.field757[var11 + 2];
                        continue;
                    }
                    if (var183 == 1115) {
                        var11--;
                        var180.field3463 = class25.field757[var11] == 1;
                        continue;
                    }
                    if (var183 == 1116) {
                        var11--;
                        var180.field3444 = class25.field757[var11];
                        continue;
                    }
                    if (var183 == 1117) {
                        var11--;
                        var180.field3496 = class25.field757[var11];
                        continue;
                    }
                    if (var183 == 1118) {
                        var11--;
                        var180.field3450 = class25.field757[var11] == 1;
                        continue;
                    }
                    if (var183 == 1119) {
                        var11--;
                        var180.field3522 = class25.field757[var11] == 1;
                        continue;
                    }
                    if (var183 == 1120) {
                        var11 -= 2;
                        var180.field3479 = class25.field757[var11];
                        var180.field3420 = class25.field757[var11 + 1];
                        continue;
                    }
                } else if (var183 >= 1200 && var183 < 1300 || var183 >= 2200 && var183 < 2300) {
                    class144 var58;
                    if (var183 < 2000) {
                        var58 = var43 ? class43.field1234 : class4.field94;
                    } else {
                        var183 -= 1000;
                        var11--;
                        var58 = class15.method172(class25.field757[var11], -13778);
                    }
                    class85.method772(-41, var58);
                    if (var183 == 1200) {
                        var11 -= 2;
                        int var59 = class25.field757[var11];
                        int var60 = class25.field757[var11 + 1];
                        var58.field3526 = var60;
                        var58.field3546 = var59;
                        class49 var61 = class108.method887(-1, var59);
                        var58.field3433 = var61.field1379;
                        var58.field3466 = var61.field1428;
                        var58.field3421 = var61.field1404;
                        var58.field3471 = var61.field1377;
                        var58.field3491 = var61.field1376;
                        var58.field3521 = var61.field1387;
                        if (var58.field3437 > 0) {
                            var58.field3491 = var58.field3491 * 32 / var58.field3437;
                        }
                        continue;
                    }
                    if (var183 == 1201) {
                        var58.field3487 = 2;
                        var11--;
                        var58.field3474 = class25.field757[var11];
                        continue;
                    }
                    if (var183 == 1202) {
                        var58.field3487 = 3;
                        var58.field3474 = class144.field3516.field2502.method379(-1221765009);
                        continue;
                    }
                } else if ((var183 < 1300 || var183 >= 1400) && (var183 < 2300 || var183 >= 2400)) {
                    if (var183 >= 1400 && var183 < 1500 || var183 >= 2400 && var183 < 2500) {
                        class144 var176;
                        if (var183 < 2000) {
                            var176 = var43 ? class43.field1234 : class4.field94;
                        } else {
                            var183 -= 1000;
                            var11--;
                            var176 = class15.method172(class25.field757[var11], -13778);
                        }
                        var9--;
                        class117 var177 = class46.field1273[var9];
                        Object[] var178 = new Object[var177.method954(-127) + 1];
                        for (int var179 = var178.length - 1; var179 >= 1; var179--) {
                            if (var177.method953(var179 - 1, 2) == 115) {
                                var9--;
                                var178[var179] = class46.field1273[var9];
                            } else {
                                var11--;
                                var178[var179] = Integer.valueOf(class25.field757[var11]);
                            }
                        }
                        var11--;
                        var178[0] = Integer.valueOf(class25.field757[var11]);
                        if (var183 == 1408) {
                            var176.field3483 = var178;
                        }
                        if (var183 == 1403) {
                            var176.field3470 = var178;
                        }
                        if (var183 == 1409) {
                            var176.field3432 = var178;
                        }
                        if (var183 == 1412) {
                            var176.field3477 = var178;
                        }
                        if (var183 == 1404) {
                            var176.field3422 = var178;
                        }
                        if (var183 == 1415) {
                            var176.field3501 = var178;
                        }
                        if (var183 == 1407) {
                            var176.field3442 = var178;
                        }
                        if (var183 == 1413) {
                            var176.field3541 = var178;
                        }
                        if (var183 == 1411) {
                            var176.field3514 = var178;
                        }
                        if (var183 == 1405) {
                            var176.field3523 = var178;
                        }
                        if (var183 == 1406) {
                            var176.field3418 = var178;
                        }
                        if (var183 == 1400) {
                            var176.field3508 = var178;
                        }
                        if (var183 == 1417) {
                            var176.field3426 = var178;
                        }
                        if (var183 == 1410) {
                            var176.field3482 = var178;
                        }
                        if (var183 == 1416) {
                            var176.field3430 = var178;
                        }
                        var176.field3462 = true;
                        if (var183 == 1401) {
                            var176.field3461 = var178;
                        }
                        if (var183 == 1402) {
                            var176.field3488 = var178;
                        }
                        if (var183 == 1414) {
                            var176.field3513 = var178;
                        }
                        continue;
                    }
                    if (var183 < 1600) {
                        class144 var66 = var43 ? class43.field1234 : class4.field94;
                        if (var183 == 1500) {
                            class25.field757[var11++] = var66.field3536;
                            continue;
                        }
                        if (var183 == 1501) {
                            class25.field757[var11++] = var66.field3423;
                            continue;
                        }
                        if (var183 == 1502) {
                            class25.field757[var11++] = var66.field3437;
                            continue;
                        }
                        if (var183 == 1503) {
                            class25.field757[var11++] = var66.field3490;
                            continue;
                        }
                        if (var183 == 1504) {
                            class25.field757[var11++] = var66.field3539 ? 1 : 0;
                            continue;
                        }
                        if (var183 == 1505) {
                            class25.field757[var11++] = var66.field3509;
                            continue;
                        }
                    } else if (var183 < 1700) {
                        class144 var175 = var43 ? class43.field1234 : class4.field94;
                        if (var183 == 1600) {
                            class25.field757[var11++] = var175.field3457;
                            continue;
                        }
                        if (var183 == 1601) {
                            class25.field757[var11++] = var175.field3543;
                            continue;
                        }
                        if (var183 == 1602) {
                            class46.field1273[var9++] = var175.field3417;
                            continue;
                        }
                        if (var183 == 1603) {
                            class25.field757[var11++] = var175.field3479;
                            continue;
                        }
                        if (var183 == 1604) {
                            class25.field757[var11++] = var175.field3420;
                            continue;
                        }
                        if (var183 == 1605) {
                            class25.field757[var11++] = var175.field3491;
                            continue;
                        }
                    } else if (var183 < 1800) {
                        class144 var67 = var43 ? class43.field1234 : class4.field94;
                        if (var183 == 1700) {
                            class25.field757[var11++] = var67.field3546;
                            continue;
                        }
                        if (var183 == 1701) {
                            if (var67.field3546 == -1) {
                                class25.field757[var11++] = 0;
                            } else {
                                class25.field757[var11++] = var67.field3526;
                            }
                            continue;
                        }
                        if (var183 == 1702) {
                            class25.field757[var11++] = var67.field3532;
                            continue;
                        }
                    } else if (var183 < 1900) {
                        class144 var68 = var43 ? class43.field1234 : class4.field94;
                        if (var183 == 1800) {
                            class25.field757[var11++] = class53.method583(20, class97.method827((byte) -87, var68));
                            continue;
                        }
                    } else if (var183 < 2600) {
                        var11--;
                        class144 var174 = class15.method172(class25.field757[var11], -13778);
                        if (var183 == 2500) {
                            class25.field757[var11++] = var174.field3536;
                            continue;
                        }
                        if (var183 == 2501) {
                            class25.field757[var11++] = var174.field3423;
                            continue;
                        }
                        if (var183 == 2502) {
                            class25.field757[var11++] = var174.field3437;
                            continue;
                        }
                        if (var183 == 2503) {
                            class25.field757[var11++] = var174.field3490;
                            continue;
                        }
                        if (var183 == 2504) {
                            class25.field757[var11++] = var174.field3539 ? 1 : 0;
                            continue;
                        }
                        if (var183 == 2505) {
                            class25.field757[var11++] = var174.field3509;
                            continue;
                        }
                    } else if (var183 < 2700) {
                        var11--;
                        class144 var69 = class15.method172(class25.field757[var11], -13778);
                        if (var183 == 2600) {
                            class25.field757[var11++] = var69.field3457;
                            continue;
                        }
                        if (var183 == 2601) {
                            class25.field757[var11++] = var69.field3543;
                            continue;
                        }
                        if (var183 == 2602) {
                            class46.field1273[var9++] = var69.field3417;
                            continue;
                        }
                        if (var183 == 2603) {
                            class25.field757[var11++] = var69.field3479;
                            continue;
                        }
                        if (var183 == 2604) {
                            class25.field757[var11++] = var69.field3420;
                            continue;
                        }
                        if (var183 == 2605) {
                            class25.field757[var11++] = var69.field3491;
                            continue;
                        }
                    } else if (var183 < 2800) {
                        var11--;
                        class144 var173 = class15.method172(class25.field757[var11], -13778);
                        if (var183 == 2700) {
                            class25.field757[var11++] = var173.field3546;
                            continue;
                        }
                        if (var183 == 2701) {
                            if (var173.field3546 == -1) {
                                class25.field757[var11++] = 0;
                            } else {
                                class25.field757[var11++] = var173.field3526;
                            }
                            continue;
                        }
                    } else if (var183 < 2900) {
                        var11--;
                        class144 var70 = class15.method172(class25.field757[var11], -13778);
                        if (var183 == 2800) {
                            class25.field757[var11++] = class53.method583(20, class97.method827((byte) 80, var70));
                            continue;
                        }
                    } else if (var183 < 3200) {
                        if (var183 == 3100) {
                            var9--;
                            class117 var171 = class46.field1273[var9];
                            class52.method572(class142.field3366, -1, 0, var171);
                            continue;
                        }
                        if (var183 == 3101) {
                            var11 -= 2;
                            class61.method616(class25.field757[var11], class25.field757[var11 + 1], -124, class144.field3516);
                            continue;
                        }
                        if (var183 == 3102) {
                            var11--;
                            int var172 = class25.field757[var11];
                            if (var172 >= 0 && var172 < class134.field3210.length && class134.field3210[var172] != -1) {
                                class15.field339 = true;
                                class101.field2518 = var172;
                                class13.field262 = true;
                            }
                            continue;
                        }
                        if (var183 == 3103) {
                            class20.method229((byte) -14);
                            continue;
                        }
                    } else if (var183 < 3300) {
                        if (var183 == 3200) {
                            var11 -= 3;
                            class6.method45(class25.field757[var11], class25.field757[var11 + 1], class25.field757[var11 + 2], -118);
                            continue;
                        }
                        if (var183 == 3201) {
                            var11--;
                            class147.method1186(-15377, class25.field757[var11]);
                            continue;
                        }
                        if (var183 == 3202) {
                            var11 -= 2;
                            class127.method1009(class25.field757[var11], (byte) -108, class25.field757[var11 + 1]);
                            continue;
                        }
                    } else if (var183 < 3400) {
                        if (var183 == 3300) {
                            class25.field757[var11++] = class85.field2236;
                            continue;
                        }
                        if (var183 == 3301) {
                            var11 -= 2;
                            int var71 = class25.field757[var11];
                            int var72 = class25.field757[var11 + 1];
                            class25.field757[var11++] = class79.method743(var71, var72, (byte) 92);
                            continue;
                        }
                        if (var183 == 3302) {
                            var11 -= 2;
                            int var73 = class25.field757[var11];
                            int var74 = class25.field757[var11 + 1];
                            class25.field757[var11++] = class46.method506(var73, -1, var74);
                            continue;
                        }
                        if (var183 == 3303) {
                            var11 -= 2;
                            int var75 = class25.field757[var11 + 1];
                            int var76 = class25.field757[var11];
                            class25.field757[var11++] = class138.method1119(var75, var76, -53);
                            continue;
                        }
                        if (var183 == 3304) {
                            var11--;
                            int var77 = class25.field757[var11];
                            class25.field757[var11++] = class128.method1017(-115, var77).field662;
                            continue;
                        }
                        if (var183 == 3305) {
                            var11--;
                            int var78 = class25.field757[var11];
                            class25.field757[var11++] = class90.field2300[var78];
                            continue;
                        }
                        if (var183 == 3306) {
                            var11--;
                            int var79 = class25.field757[var11];
                            class25.field757[var11++] = class86.field2246[var79];
                            continue;
                        }
                        if (var183 == 3307) {
                            var11--;
                            int var80 = class25.field757[var11];
                            class25.field757[var11++] = class42.field1208[var80];
                            continue;
                        }
                        if (var183 == 3308) {
                            int var81 = (class144.field3516.field717 >> 7) + class95.field2371;
                            int var82 = class120.field2940;
                            int var83 = (class144.field3516.field751 >> 7) + class108.field2678;
                            class25.field757[var11++] = (var82 << 28) + ((var81 << 14) + var83);
                            continue;
                        }
                        if (var183 == 3309) {
                            var11--;
                            int var84 = class25.field757[var11];
                            class25.field757[var11++] = class66.method660(16383, var84 >> 14);
                            continue;
                        }
                        if (var183 == 3310) {
                            var11--;
                            int var85 = class25.field757[var11];
                            class25.field757[var11++] = var85 >> 28;
                            continue;
                        }
                        if (var183 == 3311) {
                            var11--;
                            int var86 = class25.field757[var11];
                            class25.field757[var11++] = class66.method660(var86, 16383);
                            continue;
                        }
                        if (var183 == 3312) {
                            class25.field757[var11++] = class33.field986 ? 1 : 0;
                            continue;
                        }
                        if (var183 == 3313) {
                            var11 -= 2;
                            int var87 = class25.field757[var11 + 1];
                            int var88 = class25.field757[var11] + 32768;
                            class25.field757[var11++] = class79.method743(var88, var87, (byte) 73);
                            continue;
                        }
                        if (var183 == 3314) {
                            var11 -= 2;
                            int var89 = class25.field757[var11] + 32768;
                            int var90 = class25.field757[var11 + 1];
                            class25.field757[var11++] = class46.method506(var89, -1, var90);
                            continue;
                        }
                        if (var183 == 3315) {
                            var11 -= 2;
                            int var91 = class25.field757[var11] + 32768;
                            int var92 = class25.field757[var11 + 1];
                            class25.field757[var11++] = class138.method1119(var92, var91, -98);
                            continue;
                        }
                    } else if (var183 < 3700) {
                        if (var183 == 3600) {
                            if (class93.field2347 == 0) {
                                class25.field757[var11++] = -2;
                            } else if (class93.field2347 == 1) {
                                class25.field757[var11++] = -1;
                            } else {
                                class25.field757[var11++] = class5.field119;
                            }
                            continue;
                        }
                        if (var183 == 3601) {
                            var11--;
                            int var93 = class25.field757[var11];
                            if (class93.field2347 == 2 && class5.field119 > var93) {
                                class46.field1273[var9++] = class72.field2025[var93];
                                continue;
                            }
                            class46.field1273[var9++] = class142.field3366;
                            continue;
                        }
                        if (var183 == 3602) {
                            var11--;
                            int var94 = class25.field757[var11];
                            if (class93.field2347 == 2 && class5.field119 > var94) {
                                class25.field757[var11++] = class35.field1037[var94];
                                continue;
                            }
                            class25.field757[var11++] = 0;
                            continue;
                        }
                        if (var183 == 3603) {
                            var11--;
                            int var95 = class25.field757[var11];
                            if (class93.field2347 == 2 && var95 < class5.field119) {
                                class25.field757[var11++] = class15.field352[var95];
                                continue;
                            }
                            class25.field757[var11++] = 0;
                            continue;
                        }
                        if (var183 == 3604) {
                            var9--;
                            class117 var96 = class46.field1273[var9];
                            var11--;
                            int var97 = class25.field757[var11];
                            class15.method173(var96, var97, 12);
                            continue;
                        }
                    } else if (var183 < 4100) {
                        if (var183 == 4000) {
                            var11 -= 2;
                            int var98 = class25.field757[var11 + 1];
                            int var99 = class25.field757[var11];
                            class25.field757[var11++] = var98 + var99;
                            continue;
                        }
                        if (var183 == 4001) {
                            var11 -= 2;
                            int var100 = class25.field757[var11 + 1];
                            int var101 = class25.field757[var11];
                            class25.field757[var11++] = var101 - var100;
                            continue;
                        }
                        if (var183 == 4002) {
                            var11 -= 2;
                            int var102 = class25.field757[var11 + 1];
                            int var103 = class25.field757[var11];
                            class25.field757[var11++] = var102 * var103;
                            continue;
                        }
                        if (var183 == 4003) {
                            var11 -= 2;
                            int var104 = class25.field757[var11 + 1];
                            int var105 = class25.field757[var11];
                            class25.field757[var11++] = var105 / var104;
                            continue;
                        }
                        if (var183 == 4004) {
                            var11--;
                            int var106 = class25.field757[var11];
                            class25.field757[var11++] = (int) ((double) var106 * Math.random());
                            continue;
                        }
                        if (var183 == 4005) {
                            var11--;
                            int var107 = class25.field757[var11];
                            class25.field757[var11++] = (int) ((double) (var107 + 1) * Math.random());
                            continue;
                        }
                        if (var183 == 4006) {
                            var11 -= 5;
                            int var108 = class25.field757[var11 + 1];
                            int var109 = class25.field757[var11];
                            int var110 = class25.field757[var11 + 3];
                            int var111 = class25.field757[var11 + 4];
                            int var112 = class25.field757[var11 + 2];
                            class25.field757[var11++] = (var108 - var109) * (-var112 + var111) / (var110 - var112) + var109;
                            continue;
                        }
                        if (var183 == 4007) {
                            var11 -= 2;
                            int var113 = class25.field757[var11 + 1];
                            int var114 = class25.field757[var11];
                            class25.field757[var11++] = var113 * var114 / 100 + var114;
                            continue;
                        }
                        if (var183 == 4008) {
                            var11 -= 2;
                            int var115 = class25.field757[var11];
                            int var116 = class25.field757[var11 + 1];
                            class25.field757[var11++] = class84.method763(var115, 0x1 << var116);
                            continue;
                        }
                        if (var183 == 4009) {
                            var11 -= 2;
                            int var117 = class25.field757[var11];
                            int var118 = class25.field757[var11 + 1];
                            class25.field757[var11++] = class66.method660(-(0x1 << var118) - 1, var117);
                            continue;
                        }
                        if (var183 == 4010) {
                            var11 -= 2;
                            int var119 = class25.field757[var11 + 1];
                            int var120 = class25.field757[var11];
                            class25.field757[var11++] = class66.method660(var120, 0x1 << var119) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var183 == 4011) {
                            var11 -= 2;
                            int var121 = class25.field757[var11 + 1];
                            int var122 = class25.field757[var11];
                            class25.field757[var11++] = var122 % var121;
                            continue;
                        }
                        if (var183 == 4012) {
                            var11 -= 2;
                            int var123 = class25.field757[var11 + 1];
                            int var124 = class25.field757[var11];
                            if (var124 == 0) {
                                class25.field757[var11++] = 0;
                            } else {
                                class25.field757[var11++] = (int) Math.pow((double) var124, (double) var123);
                            }
                            continue;
                        }
                        if (var183 == 4013) {
                            var11 -= 2;
                            int var125 = class25.field757[var11];
                            int var126 = class25.field757[var11 + 1];
                            if (var125 == 0) {
                                class25.field757[var11++] = 0;
                            } else if (var126 == 0) {
                                class25.field757[var11++] = Integer.MAX_VALUE;
                            } else {
                                class25.field757[var11++] = (int) Math.pow((double) var125, 1.0D / (double) var126);
                            }
                            continue;
                        }
                        if (var183 == 4014) {
                            var11 -= 2;
                            int var127 = class25.field757[var11 + 1];
                            int var128 = class25.field757[var11];
                            class25.field757[var11++] = class66.method660(var127, var128);
                            continue;
                        }
                        if (var183 == 4015) {
                            var11 -= 2;
                            int var129 = class25.field757[var11];
                            int var130 = class25.field757[var11 + 1];
                            class25.field757[var11++] = class84.method763(var129, var130);
                            continue;
                        }
                    } else if (var183 < 4200) {
                        if (var183 == 4100) {
                            var9--;
                            class117 var131 = class46.field1273[var9];
                            var11--;
                            int var132 = class25.field757[var11];
                            class46.field1273[var9++] = class18.method193(new class117[] { var131, class142.method1131(var132, true) }, 113);
                            continue;
                        }
                        if (var183 == 4101) {
                            var9 -= 2;
                            class117 var133 = class46.field1273[var9 + 1];
                            class117 var134 = class46.field1273[var9];
                            class46.field1273[var9++] = class18.method193(new class117[] { var134, var133 }, 24);
                            continue;
                        }
                        if (var183 == 4102) {
                            var11--;
                            int var135 = class25.field757[var11];
                            var9--;
                            class117 var136 = class46.field1273[var9];
                            class46.field1273[var9++] = class18.method193(new class117[] { var136, class80.method748((byte) -127, var135, true) }, 38);
                            continue;
                        }
                        if (var183 == 4103) {
                            var9--;
                            class117 var137 = class46.field1273[var9];
                            class46.field1273[var9++] = var137.method972(-69);
                            continue;
                        }
                        if (var183 == 4104) {
                            var11--;
                            int var138 = class25.field757[var11];
                            long var139 = (long) var138 * 86400000L + 1014768000000L;
                            class73.field2031.setTime(new Date(var139));
                            int var141 = class73.field2031.get(5);
                            int var142 = class73.field2031.get(2);
                            int var143 = class73.field2031.get(1);
                            class46.field1273[var9++] = class18.method193(new class117[] { class142.method1131(var141, true), class36.field1065, class20.field531[var142], class36.field1065, class142.method1131(var143, true) }, 46);
                            continue;
                        }
                        if (var183 == 4105) {
                            var9 -= 2;
                            class117 var144 = class46.field1273[var9];
                            class117 var145 = class46.field1273[var9 + 1];
                            if (class144.field3516.field2502 != null && class144.field3516.field2502.field948) {
                                class46.field1273[var9++] = var145;
                                continue;
                            }
                            class46.field1273[var9++] = var144;
                            continue;
                        }
                        if (var183 == 4106) {
                            var11--;
                            int var146 = class25.field757[var11];
                            class46.field1273[var9++] = class142.method1131(var146, true);
                            continue;
                        }
                        if (var183 == 4107) {
                            var9 -= 2;
                            class25.field757[var11++] = class46.field1273[var9].method947(class46.field1273[var9 + 1], (byte) 63);
                            continue;
                        }
                        if (var183 == 4108) {
                            var11 -= 2;
                            int var147 = class25.field757[var11];
                            int var148 = class25.field757[var11 + 1];
                            var9--;
                            class117 var149 = class46.field1273[var9];
                            byte[] var150 = class67.field1896.method526((byte) 114, var148, 0);
                            class19 var151 = new class19(var150);
                            class25.field757[var11++] = var151.method205(var149, var147);
                            continue;
                        }
                        if (var183 == 4109) {
                            var11 -= 2;
                            var9--;
                            class117 var152 = class46.field1273[var9];
                            int var153 = class25.field757[var11];
                            int var154 = class25.field757[var11 + 1];
                            byte[] var155 = class67.field1896.method526((byte) 118, var154, 0);
                            class19 var156 = new class19(var155);
                            class25.field757[var11++] = var156.method202(var152, var153);
                            continue;
                        }
                    } else if (var183 < 4300) {
                        if (var183 == 4200) {
                            var11--;
                            int var157 = class25.field757[var11];
                            class46.field1273[var9++] = class108.method887(-1, var157).field1414;
                            continue;
                        }
                        if (var183 == 4201) {
                            var11 -= 2;
                            int var158 = class25.field757[var11];
                            int var159 = class25.field757[var11 + 1];
                            class49 var160 = class108.method887(-1, var158);
                            if (var159 >= 1 && var159 <= 5 && var160.field1394[var159 - 1] != null) {
                                class46.field1273[var9++] = var160.field1394[var159 - 1];
                                continue;
                            }
                            class46.field1273[var9++] = class142.field3366;
                            continue;
                        }
                        if (var183 == 4202) {
                            var11 -= 2;
                            int var161 = class25.field757[var11 + 1];
                            int var162 = class25.field757[var11];
                            class49 var163 = class108.method887(-1, var162);
                            if (var161 >= 1 && var161 <= 5 && var163.field1425[var161 - 1] != null) {
                                class46.field1273[var9++] = var163.field1425[var161 - 1];
                                continue;
                            }
                            class46.field1273[var9++] = class142.field3366;
                            continue;
                        }
                        if (var183 == 4203) {
                            var11--;
                            int var164 = class25.field757[var11];
                            class25.field757[var11++] = class108.method887(-1, var164).field1402;
                            continue;
                        }
                        if (var183 == 4204) {
                            var11--;
                            int var165 = class25.field757[var11];
                            class25.field757[var11++] = class108.method887(-1, var165).field1432 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var183 == 4205) {
                            var11--;
                            int var166 = class25.field757[var11];
                            class49 var167 = class108.method887(-1, var166);
                            if (var167.field1413 == -1 && var167.field1401 >= 0) {
                                class25.field757[var11++] = var167.field1401;
                                continue;
                            }
                            class25.field757[var11++] = var166;
                            continue;
                        }
                        if (var183 == 4206) {
                            var11--;
                            int var168 = class25.field757[var11];
                            class49 var169 = class108.method887(-1, var168);
                            if (var169.field1413 >= 0 && var169.field1401 >= 0) {
                                class25.field757[var11++] = var169.field1401;
                                continue;
                            }
                            class25.field757[var11++] = var168;
                            continue;
                        }
                        if (var183 == 4207) {
                            var11--;
                            int var170 = class25.field757[var11];
                            class25.field757[var11++] = class108.method887(-1, var170).field1372 ? 1 : 0;
                            continue;
                        }
                    }
                } else {
                    class144 var62;
                    if (var183 < 2000) {
                        var62 = var43 ? class43.field1234 : class4.field94;
                    } else {
                        var11--;
                        var62 = class15.method172(class25.field757[var11], -13778);
                        var183 -= 1000;
                    }
                    if (var183 == 1300) {
                        var11--;
                        int var63 = class25.field757[var11] - 1;
                        if (var63 >= 0 && var63 <= 9) {
                            var9--;
                            var62.method1144(-1, var63, class46.field1273[var9]);
                            continue;
                        }
                        var9--;
                        continue;
                    }
                    if (var183 == 1301) {
                        var11 -= 2;
                        int var64 = class25.field757[var11];
                        int var65 = class25.field757[var11 + 1];
                        var62.field3528 = class84.method761(var65, 0, var64);
                        continue;
                    }
                    if (var183 == 1302) {
                        var11--;
                        var62.field3497 = class25.field757[var11] == 1;
                        continue;
                    }
                    if (var183 == 1303) {
                        var11--;
                        var62.field3524 = class25.field757[var11];
                        continue;
                    }
                    if (var183 == 1304) {
                        var11--;
                        var62.field3493 = class25.field757[var11];
                        continue;
                    }
                    if (var183 == 1305) {
                        var9--;
                        var62.field3519 = class46.field1273[var9];
                        continue;
                    }
                    if (var183 == 1306) {
                        var9--;
                        var62.field3525 = class46.field1273[var9];
                        continue;
                    }
                }
                class109.method897(-8638, null, "CS2 - nosuchop:" + var183);
                return;
            }
        } catch (Exception var182) {
            class109.method897(-8638, var182, "CS2 - scr:" + var8.field2048 + " op:" + var14);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lge;Z)V")
    public static final void method981(class47 arg0, boolean arg1) {
        class54.field1544 = arg0;
        field2903++;
        if (arg1) {
            field2908 = null;
        }
    }
}
