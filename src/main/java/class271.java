import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class271 {

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4505 = "Prepared sound engine";

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field4503 = 0;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)I", line = 4)
    public static final int method2034(int arg0, int arg1, int arg2, int arg3) {
        field4508++;
        if (class101.field1656 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (~var4 > arg0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2 & 0x7F;
        int var7 = arg3;
        int var8 = arg1 & 0x7F;
        if (arg3 < 3 && (class178.field2856[1][var4][var5] & 0x2) == 2) {
            var7 = arg3 + 1;
        }
        int var9 = (128 - var6) * class101.field1656[var7][var4][var5] + class101.field1656[var7][var4 + 1][var5] * var6 >> 7;
        int var10 = (128 - var6) * class101.field1656[var7][var4][var5 + 1] + class101.field1656[var7][var4 + 1][var5 + 1] * var6 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 39)
    public static void method2035(int arg0) {
        if (arg0 != 104) {
            field4505 = (String) null;
        }
        field4505 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BIIIIZIIIII)V", line = 54)
    public static final void method2036(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 >= -119) {
            method2034(97, -93, -77, -68);
        }
        field4507++;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                class172.field2748[var11][var12] = 0;
                class332.field5270[var11][var12] = 99999999;
            }
        }
        int var13 = arg3;
        class172.field2748[arg3][arg2] = 99;
        class332.field5270[arg3][arg2] = 0;
        int var14 = arg2;
        byte var15 = 0;
        class52.field881[var15] = arg3;
        int var28 = var15 + 1;
        class204.field3224[var15] = arg2;
        int var16 = 0;
        boolean var17 = false;
        int[][] var18 = class32.field459[class186.field2991].field266;
        while (var28 != var16) {
            var14 = class204.field3224[var16];
            var13 = class52.field881[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg1 == var13 && arg6 == var14) {
                var17 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class32.field459[class186.field2991].method146(arg6, arg10 - 1, 2, arg1, arg7, var14, var13, (byte) 113)) {
                    var17 = true;
                    break;
                }
                if (arg10 < 10 && class32.field459[class186.field2991].method145(arg1, arg6, arg10 - 1, var13, 0, var14, arg7, 2)) {
                    var17 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg9 != 0 && class32.field459[class186.field2991].method144(arg9, arg1, var13, 32213, arg6, arg4, 2, arg8, var14)) {
                var17 = true;
                break;
            }
            int var19 = class332.field5270[var13][var14] + 1;
            if (var13 > 0 && class172.field2748[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x2C010E) == 0 && (var18[var13 - 1][var14 + 1] & 0x2C0138) == 0) {
                class52.field881[var28] = var13 - 1;
                class204.field3224[var28] = var14;
                class172.field2748[var13 - 1][var14] = 2;
                var28 = var28 + 1 & 0xFFF;
                class332.field5270[var13 - 1][var14] = var19;
            }
            if (var13 < 102 && class172.field2748[var13 + 1][var14] == 0 && (var18[var13 + 2][var14] & 0x2C0183) == 0 && (var18[var13 + 2][var14 + 1] & 0x2C01E0) == 0) {
                class52.field881[var28] = var13 + 1;
                class204.field3224[var28] = var14;
                var28 = var28 + 1 & 0xFFF;
                class172.field2748[var13 + 1][var14] = 8;
                class332.field5270[var13 + 1][var14] = var19;
            }
            if (var14 > 0 && class172.field2748[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x2C010E) == 0 && (var18[var13 + 1][var14 - 1] & 0x2C0183) == 0) {
                class52.field881[var28] = var13;
                class204.field3224[var28] = var14 - 1;
                var28 = var28 + 1 & 0xFFF;
                class172.field2748[var13][var14 - 1] = 1;
                class332.field5270[var13][var14 - 1] = var19;
            }
            if (var14 < 102 && class172.field2748[var13][var14 + 1] == 0 && (var18[var13][var14 + 2] & 0x2C0138) == 0 && (var18[var13 + 1][var14 + 2] & 0x2C01E0) == 0) {
                class52.field881[var28] = var13;
                class204.field3224[var28] = var14 + 1;
                var28 = var28 + 1 & 0xFFF;
                class172.field2748[var13][var14 + 1] = 4;
                class332.field5270[var13][var14 + 1] = var19;
            }
            if (var13 > 0 && var14 > 0 && class172.field2748[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14] & 0x2C013E) == 0 && (var18[var13 - 1][var14 - 1] & 0x2C010E) == 0 && (var18[var13][var14 - 1] & 0x2C018F) == 0) {
                class52.field881[var28] = var13 - 1;
                class204.field3224[var28] = var14 - 1;
                class172.field2748[var13 - 1][var14 - 1] = 3;
                var28 = var28 + 1 & 0xFFF;
                class332.field5270[var13 - 1][var14 - 1] = var19;
            }
            if (var13 < 102 && var14 > 0 && class172.field2748[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x2C018F) == 0 && (var18[var13 + 2][var14 - 1] & 0x2C0183) == 0 && (var18[var13 + 2][var14] & 0x2C01E3) == 0) {
                class52.field881[var28] = var13 + 1;
                class204.field3224[var28] = var14 - 1;
                var28 = var28 + 1 & 0xFFF;
                class172.field2748[var13 + 1][var14 - 1] = 9;
                class332.field5270[var13 + 1][var14 - 1] = var19;
            }
            if (var13 > 0 && var14 < 102 && class172.field2748[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x2C013E) == 0 && (var18[var13 - 1][var14 + 2] & 0x2C0138) == 0 && (var18[var13][var14 + 2] & 0x2C01F8) == 0) {
                class52.field881[var28] = var13 - 1;
                class204.field3224[var28] = var14 + 1;
                var28 = var28 + 1 & 0xFFF;
                class172.field2748[var13 - 1][var14 + 1] = 6;
                class332.field5270[var13 - 1][var14 + 1] = var19;
            }
            if (var13 < 102 && var14 < 102 && class172.field2748[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 2] & 0x2C01F8) == 0 && (var18[var13 + 2][var14 + 2] & 0x2C01E0) == 0 && (var18[var13 + 2][var14 + 1] & 0x2C01E3) == 0) {
                class52.field881[var28] = var13 + 1;
                class204.field3224[var28] = var14 + 1;
                var28 = var28 + 1 & 0xFFF;
                class172.field2748[var13 + 1][var14 + 1] = 12;
                class332.field5270[var13 + 1][var14 + 1] = var19;
            }
        }
        if (!var17) {
            if (!arg5) {
                return;
            }
            int var20 = 100;
            byte var21 = 10;
            int var22 = 1000;
            for (int var23 = arg1 - var21; var23 <= arg1 + var21; var23++) {
                for (int var24 = arg6 - var21; var24 <= arg6 + var21; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class332.field5270[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var24 < arg6) {
                            var26 = arg6 - var24;
                        } else if (var24 > arg6 - (1 - arg9)) {
                            var26 = var24 + 1 - arg6 - arg9;
                        }
                        if (var23 < arg1) {
                            var25 = arg1 - var23;
                        } else if (var23 > arg1 + arg4 - 1) {
                            var25 = var23 + 1 - arg1 - arg4;
                        }
                        int var27 = var25 * var25 + (var26 * var26);
                        if (var22 > var27 || var22 == var27 && var20 > class332.field5270[var23][var24]) {
                            var13 = var23;
                            var14 = var24;
                            var22 = var27;
                            var20 = class332.field5270[var23][var24];
                        }
                    }
                }
            }
            if (var22 == 1000) {
                return;
            }
            if (arg3 == var13 && arg2 == var14) {
                return;
            }
        }
        class241.field3988 = var13;
        class326.field5182 = false;
        class335.field5305 = var14;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V", line = 400)
    public static final void method2037(int arg0) {
        class291.method2107(false, false);
        boolean var1 = true;
        field4506++;
        class149.field2382 = 0;
        for (int var2 = arg0; var2 < class227.field3786.length; var2++) {
            if (class46.field749[var2] != -1 && class227.field3786[var2] == null) {
                class227.field3786[var2] = class340.field5425.method472(0, 88, class46.field749[var2]);
                if (class227.field3786[var2] == null) {
                    var1 = false;
                    class149.field2382++;
                }
            }
            if (class310.field4951[var2] != -1 && class16.field190[var2] == null) {
                class16.field190[var2] = class340.field5425.method470(class310.field4951[var2], 31360, 0, class300.field4827[var2]);
                if (class16.field190[var2] == null) {
                    var1 = false;
                    class149.field2382++;
                }
            }
            if (class42.field607) {
                if (class340.field5434[var2] != -1 && class160.field2546[var2] == null) {
                    class160.field2546[var2] = class340.field5425.method472(0, 79, class340.field5434[var2]);
                    if (class160.field2546[var2] == null) {
                        var1 = false;
                        class149.field2382++;
                    }
                }
                if (class133.field2247[var2] != -1 && class352.field5584[var2] == null) {
                    class352.field5584[var2] = class340.field5425.method472(0, 122, class133.field2247[var2]);
                    if (class352.field5584[var2] == null) {
                        class149.field2382++;
                        var1 = false;
                    }
                }
            }
            if (class137.field2275 != null && class24.field295[var2] == null && class137.field2275[var2] != -1) {
                class24.field295[var2] = class340.field5425.method470(class137.field2275[var2], 31360, 0, class300.field4827[var2]);
                if (class24.field295[var2] == null) {
                    var1 = false;
                    class149.field2382++;
                }
            }
        }
        if (class267.field4470 == null) {
            if (class255.field4303 == null || !class241.field3992.method459(class255.field4303.field1691 + "_labels", 0)) {
                class267.field4470 = new class241(0);
            } else if (class241.field3992.method475(126, class255.field4303.field1691 + "_labels")) {
                class267.field4470 = class115.method896(class255.field4303.field1691 + "_labels", class241.field3992, false, class286.field4661);
            } else {
                class149.field2382++;
                var1 = false;
            }
        }
        if (!var1) {
            class255.field4301 = 1;
            return;
        }
        class27.field327 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class227.field3786.length; var4++) {
            byte[] var5 = class16.field190[var4];
            if (var5 != null) {
                int var6 = (class121.field2079[var4] >> 8) * 64 - class93.field1562;
                int var7 = (class121.field2079[var4] & 0xFF) * 64 - class275.field4546;
                if (class294.field4746) {
                    var7 = 10;
                    var6 = 10;
                }
                var3 &= class46.method369(var6, 6814, var5, var7);
            }
            if (class42.field607) {
                byte[] var8 = class352.field5584[var4];
                if (var8 != null) {
                    int var9 = (class121.field2079[var4] & 0xFF) * 64 - class275.field4546;
                    int var10 = (class121.field2079[var4] >> 8) * 64 - class93.field1562;
                    if (class294.field4746) {
                        var9 = 10;
                        var10 = 10;
                    }
                    var3 &= class46.method369(var10, 6814, var8, var9);
                }
            }
        }
        if (!var3) {
            class255.field4301 = 2;
            return;
        }
        if (class255.field4301 != 0) {
            class63.method552(class148.field2373 + "<br>(100%)", true, arg0 + 41);
        }
        class195.method1506(false);
        class175.method1377(-1);
        boolean var11 = false;
        if (class42.field607 && class193.field3083) {
            for (int var12 = 0; var12 < class227.field3786.length; var12++) {
                if (class352.field5584[var12] != null || class160.field2546[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class193.method1498(4, 104, 104, class42.field607 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class32.field459[var13].method137(arg0 + 1);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class178.field2856[var14][var15][var16] = 0;
                }
            }
        }
        class339.method2382(false, (byte) -91);
        if (class42.field607) {
            class249.field4059.method2406();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class249.field4060[var17][var18].field5215 = true;
                }
            }
        }
        if (class42.field607) {
            class30.method202();
        }
        if (class42.field607) {
            class115.method904(1692185840);
        }
        class195.method1506(false);
        System.gc();
        class291.method2107(false, true);
        class127.method984(arg0 - 1, false);
        if (!class294.field4746) {
            class352.method2488(-76, false);
            class291.method2107(false, true);
            if (class42.field607) {
                int var19 = class6.field55.field3519[0] >> 3;
                int var20 = class6.field55.field3553[0] >> 3;
                class10.method42(-11887, var20, var19);
            }
            class340.method2398(false, -60);
            if (class24.field295 != null) {
                class318.method2247((byte) -78);
            }
        }
        if (class294.field4746) {
            class311.method2210((byte) 65, false);
            class291.method2107(false, true);
            if (class42.field607) {
                int var21 = class6.field55.field3519[0] >> 3;
                int var22 = class6.field55.field3553[0] >> 3;
                class10.method42(-11887, var22, var21);
            }
            class200.method1537(false, -614332968);
        }
        class175.method1377(-1);
        class291.method2107(false, true);
        class44.method325(false, class32.field459, (byte) 73, class294.field4746 ? class267.field4476 : (int[][][]) null);
        if (class42.field607) {
            class30.method212();
        }
        class291.method2107(false, true);
        int var23 = class123.field2108;
        if (var23 > class186.field2991) {
            var23 = class186.field2991;
        }
        if (var23 < class186.field2991 - 1) {
            int var24 = class186.field2991 - 1;
        }
        if (class215.method1621(25)) {
            class286.method2082(0);
        } else {
            class286.method2082(class123.field2108);
        }
        class36.method245(-28644);
        if (class42.field607 && var11) {
            class298.method2132(true);
            class127.method984(-1, true);
            if (!class294.field4746) {
                class352.method2488(-118, true);
                class291.method2107(false, true);
                class340.method2398(true, arg0 + 32);
            }
            if (class294.field4746) {
                class311.method2210((byte) 65, true);
                class291.method2107(false, true);
                class200.method1537(true, -614332968);
            }
            class175.method1377(-1);
            class291.method2107(false, true);
            class44.method325(true, class32.field459, (byte) 73, class294.field4746 ? class267.field4476 : (int[][][]) null);
            class291.method2107(false, true);
            class36.method245(-28644);
            class298.method2132(false);
        }
        if (class42.field607) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class249.field4060[var25][var26].method2313(class101.field1656[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class352.method2483(var27, var28, (byte) 120);
            }
        }
        class135.method1032(9436);
        class195.method1506(false);
        class234.method1804(-99);
        class175.method1377(arg0 - 1);
        class237.field3921 = false;
        if (class42.field607) {
            class2.method7(true, 125);
        }
        if (class241.field3994 != null && class342.field5449 != null && class259.field4362 == 25) {
            class313.field4974++;
            class36.field520.method2228(34, 16547);
            class36.field520.method1757(1057001181, -121);
        }
        if (!class294.field4746) {
            int var29 = (class316.field5050 + 6) / 8;
            int var30 = (class113.field1844 - 6) / 8;
            int var31 = (class113.field1844 + 6) / 8;
            int var32 = (class316.field5050 - 6) / 8;
            for (int var33 = var32 - 1; var33 <= (var29 + 1); var33++) {
                for (int var34 = var30 - 1; var34 <= (var31 + 1); var34++) {
                    if (var33 < var32 || var29 < var33 || var34 < var30 || var34 > var31) {
                        class340.field5425.method462(arg0, "m" + var33 + "_" + var34);
                        class340.field5425.method462(0, "l" + var33 + "_" + var34);
                    }
                }
            }
        }
        if (class259.field4362 == 28) {
            class22.method143(-29, 10);
        } else {
            class22.method143(-29, 30);
            if (class342.field5449 != null) {
                class36.field520.method2228(207, 16547);
            }
        }
        class291.method2102(false);
        class195.method1506(false);
        class348.method2440(102);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(JI)V", line = 913)
    public static final void method2038(long arg0, int arg1) {
        if (class112.field1827 == 1 || class112.field1827 == 5) {
            class111.method842((byte) -125, arg0);
        } else if (class112.field1827 == 2) {
            class350.method2459(arg1 ^ 0xFFFF9B75);
        } else if (class112.field1827 == 4) {
            class214.method1620(true, arg0);
        } else {
            class32.method220(-103);
        }
        if (!class358.field5687) {
            class22.field249[0] = class104.field1689;
            class51.field810[0] = 1003;
            class200.field3193[0] = "";
            class149.field2379[0] = class232.field3847;
            if (class117.field1960 != 0) {
                class45.field695 = class65.field1157;
                class196.field3144 = class354.field5623;
            } else if (class325.field5165 == 0) {
                class45.field695 = class333.field5275;
                class196.field3144 = class77.field1343;
            } else {
                class45.field695 = class333.field5278;
                class196.field3144 = class229.field3812;
            }
            class104.field1683 = 1;
        }
        field4504++;
        class158.method1234((long) class332.field5261);
        if (arg1 != -25462) {
            field4505 = (String) null;
        }
        if (class304.field4870 != -1) {
            class65.method563(class304.field4870, 128);
        }
        for (int var3 = 0; var3 < class183.field2955; var3++) {
            if (class270.field4498[var3]) {
                class12.field115[var3] = true;
            }
            class2.field13[var3] = class270.field4498[var3];
            class270.field4498[var3] = false;
        }
        class237.field3924 = -1;
        class220.field3494 = -1;
        if (class42.field607) {
            class63.field1132 = true;
        }
        class14.field149 = null;
        class181.field2891 = null;
        class152.field2415 = class332.field5261;
        if (class304.field4870 != -1) {
            class183.field2955 = 0;
            class86.method690(false);
        }
        if (class42.field607) {
            class244.method1863();
        } else {
            class246.method1887();
        }
        class340.method2391(false);
        if (class358.field5687) {
            if (class253.field4271) {
                class323.method2279(-30329);
            } else {
                class304.method2169((byte) 56);
            }
        } else if (class181.field2891 != null) {
            class356.method2516(class180.field2881, class181.field2891, class66.field1167, (byte) -17);
        } else if (class220.field3494 != -1) {
            class356.method2516(class220.field3494, (class250) null, class237.field3924, (byte) -17);
        }
        int var4 = class358.field5687 ? -1 : class121.method951(false);
        if (var4 == -1) {
            var4 = class320.field5096;
        }
        class220.method1647((byte) -68, var4);
        if (class3.field20 == 1) {
            class3.field20 = 2;
        }
        if (class298.field4787 == 1) {
            class298.field4787 = 2;
        }
        if (class296.field4764 == 3) {
            for (int var5 = 0; var5 < class183.field2955; var5++) {
                if (class2.field13[var5]) {
                    if (class42.field607) {
                        class244.method1872(class54.field895[var5], class78.field1349[var5], class222.field3637[var5], class358.field5685[var5], 16711935, 128);
                    } else {
                        class246.method1905(class54.field895[var5], class78.field1349[var5], class222.field3637[var5], class358.field5685[var5], 16711935, 128);
                    }
                } else if (class12.field115[var5]) {
                    if (class42.field607) {
                        class244.method1872(class54.field895[var5], class78.field1349[var5], class222.field3637[var5], class358.field5685[var5], 16711680, 128);
                    } else {
                        class246.method1905(class54.field895[var5], class78.field1349[var5], class222.field3637[var5], class358.field5685[var5], 16711680, 128);
                    }
                }
            }
        }
        class176.method1386(class6.field55.field3577, false, class186.field2991, class6.field55.field3511, class272.field4516);
        class272.field4516 = 0;
    }
}
