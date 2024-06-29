import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class50 {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Z")
    public static boolean field1191 = false;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lsa;")
    public static class162 field1192 = new class162(64);

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static volatile int field1197 = 0;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "[[I")
    public static int[][] field1198 = new int[104][104];

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lcd;")
    public static class23 field1195 = class54.method414("Willkommen auf RuneScape", -1);

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZLva;)V")
    public static final void method389(boolean arg0, class189 arg1) {
        byte[] var2 = new byte[24];
        field1196++;
        if (class20.field414 != null) {
            try {
                class20.field414.method401((byte) -85, 0L);
                int var3 = 0;
                class20.field414.method404(-124, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1182(24, var2, 0, 4);
        if (arg0) {
            field1192 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method390(int arg0) {
        field1195 = null;
        field1198 = null;
        field1192 = null;
        if (arg0 != 1) {
            field1197 = 44;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILqa;)V")
    public static final void method391(int arg0, class144 arg1) {
        field1193++;
        Object[] var2 = arg1.field2942;
        int var3 = (Integer) var2[0];
        class184 var4 = class17.method94(var3, -114);
        if (var4 == null) {
            return;
        }
        class138.field2847 = 0;
        if (arg0 != -1142686098) {
            field1191 = false;
        }
        int var5 = 0;
        int var6 = -1;
        int var7 = 0;
        int[] var8 = var4.field3624;
        int[] var9 = var4.field3622;
        byte var10 = -1;
        try {
            class36.field726 = new class23[var4.field3619];
            int var11 = 0;
            class25.field537 = new int[var4.field3617];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var15 = (Integer) var2[var13];
                    if (var15 == -2147483647) {
                        var15 = arg1.field2952;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg1.field2949;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg1.field2939 == null ? -1 : arg1.field2939.field1071;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg1.field2940;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg1.field2939 == null ? -1 : arg1.field2939.field1070;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg1.field2948 == null ? -1 : arg1.field2948.field1071;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg1.field2948 == null ? -1 : arg1.field2948.field1070;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg1.field2943;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg1.field2950;
                    }
                    class25.field537[var11++] = var15;
                } else if (var2[var13] instanceof class23) {
                    class23 var14 = (class23) var2[var13];
                    if (var14.method161(122, class200.field3948)) {
                        var14 = arg1.field2946;
                    }
                    class36.field726[var12++] = var14;
                }
            }
            int var16 = 0;
            label2059: while (true) {
                var16++;
                if (var16 > 200000) {
                    throw new RuntimeException("slow");
                }
                var6++;
                int var294 = var9[var6];
                if (var294 < 100) {
                    if (var294 == 0) {
                        class163.field3272[var5++] = var8[var6];
                        continue;
                    }
                    if (var294 == 1) {
                        int var17 = var8[var6];
                        class163.field3272[var5++] = class54.field1288[var17];
                        continue;
                    }
                    if (var294 == 2) {
                        int var18 = var8[var6];
                        var5--;
                        class54.field1288[var18] = class163.field3272[var5];
                        continue;
                    }
                    if (var294 == 3) {
                        class62.field1439[var7++] = var4.field3616[var6];
                        continue;
                    }
                    if (var294 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var294 == 7) {
                        var5 -= 2;
                        if (class163.field3272[var5 + 1] != class163.field3272[var5]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var294 == 8) {
                        var5 -= 2;
                        if (class163.field3272[var5 + 1] == class163.field3272[var5]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var294 == 9) {
                        var5 -= 2;
                        if (class163.field3272[var5 + 1] > class163.field3272[var5]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var294 == 10) {
                        var5 -= 2;
                        if (class163.field3272[var5 + 1] < class163.field3272[var5]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var294 == 21) {
                        if (class138.field2847 == 0) {
                            return;
                        }
                        class122 var19 = class121.field2516[--class138.field2847];
                        var4 = var19.field2529;
                        class36.field726 = var19.field2521;
                        var9 = var4.field3622;
                        var8 = var4.field3624;
                        class25.field537 = var19.field2528;
                        var6 = var19.field2531;
                        continue;
                    }
                    if (var294 == 25) {
                        int var20 = var8[var6];
                        class163.field3272[var5++] = client.method209(arg0 + 1142686098, var20);
                        continue;
                    }
                    if (var294 == 27) {
                        int var21 = var8[var6];
                        var5--;
                        class122.method760(107, var21, class163.field3272[var5]);
                        continue;
                    }
                    if (var294 == 31) {
                        var5 -= 2;
                        if (class163.field3272[var5 + 1] >= class163.field3272[var5]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var294 == 32) {
                        var5 -= 2;
                        if (class163.field3272[var5 + 1] <= class163.field3272[var5]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var294 == 33) {
                        class163.field3272[var5++] = class25.field537[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var294 == 34) {
                        var10001 = var8[var6];
                        var5--;
                        class25.field537[var10001] = class163.field3272[var5];
                        continue;
                    }
                    if (var294 == 35) {
                        class62.field1439[var7++] = class36.field726[var8[var6]];
                        continue;
                    }
                    if (var294 == 36) {
                        var10001 = var8[var6];
                        var7--;
                        class36.field726[var10001] = class62.field1439[var7];
                        continue;
                    }
                    if (var294 == 37) {
                        int var22 = var8[var6];
                        var7 -= var22;
                        class23 var23 = class138.method878((byte) -61, var7, class62.field1439, var22);
                        class62.field1439[var7++] = var23;
                        continue;
                    }
                    if (var294 == 38) {
                        var5--;
                        continue;
                    }
                    if (var294 == 39) {
                        var7--;
                        continue;
                    }
                    if (var294 == 40) {
                        int var24 = var8[var6];
                        class184 var25 = class17.method94(var24, arg0 + 1142686192);
                        int[] var26 = new int[var25.field3617];
                        class23[] var27 = new class23[var25.field3619];
                        for (int var28 = 0; var28 < var25.field3623; var28++) {
                            var26[var28] = class163.field3272[var5 + var28 - var25.field3623];
                        }
                        for (int var29 = 0; var29 < var25.field3610; var29++) {
                            var27[var29] = class62.field1439[var7 + var29 - var25.field3610];
                        }
                        var5 -= var25.field3623;
                        var7 -= var25.field3610;
                        class122 var30 = new class122();
                        var30.field2528 = class25.field537;
                        var30.field2529 = var4;
                        var4 = var25;
                        var30.field2531 = var6;
                        var30.field2521 = class36.field726;
                        class121.field2516[class138.field2847++] = var30;
                        class25.field537 = var26;
                        var8 = var25.field3624;
                        var9 = var25.field3622;
                        var6 = -1;
                        class36.field726 = var27;
                        continue;
                    }
                    if (var294 == 42) {
                        class163.field3272[var5++] = class169.field3379[var8[var6]];
                        continue;
                    }
                    if (var294 == 43) {
                        var10001 = var8[var6];
                        var5--;
                        class169.field3379[var10001] = class163.field3272[var5];
                        continue;
                    }
                    if (var294 == 44) {
                        int var31 = var8[var6] >> 16;
                        int var32 = var8[var6] & 0xFFFF;
                        var5--;
                        int var33 = class163.field3272[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            class181.field3577[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var33 <= var35) {
                                    continue label2059;
                                }
                                client.field574[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var294 == 45) {
                        int var36 = var8[var6];
                        var5--;
                        int var37 = class163.field3272[var5];
                        if (var37 >= 0 && var37 < class181.field3577[var36]) {
                            class163.field3272[var5++] = client.field574[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var294 == 46) {
                        var5 -= 2;
                        int var38 = var8[var6];
                        int var39 = class163.field3272[var5];
                        if (var39 >= 0 && var39 < class181.field3577[var38]) {
                            client.field574[var38][var39] = class163.field3272[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var294 == 47) {
                        class23 var40 = class88.field1874[var8[var6]];
                        if (var40 == null) {
                            var40 = class134.field2763;
                        }
                        class62.field1439[var7++] = var40;
                        continue;
                    }
                    if (var294 == 48) {
                        var10001 = var8[var6];
                        var7--;
                        class88.field1874[var10001] = class62.field1439[var7];
                        continue;
                    }
                }
                boolean var41;
                if (var8[var6] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var294 < 1000) {
                    if (var294 == 100) {
                        var5 -= 3;
                        int var42 = class163.field3272[var5 + 1];
                        int var43 = class163.field3272[var5 + 2];
                        int var44 = class163.field3272[var5];
                        if (var42 == 0) {
                            throw new RuntimeException();
                        }
                        class47 var45 = class113.method725((byte) 108, var44);
                        if (var45.field1029 == null) {
                            var45.field1029 = new class47[var43 + 1];
                        }
                        if (var45.field1029.length <= var43) {
                            class47[] var46 = new class47[var43 + 1];
                            for (int var47 = 0; var47 < var45.field1029.length; var47++) {
                                var46[var47] = var45.field1029[var47];
                            }
                            var45.field1029 = var46;
                        }
                        if (var43 > 0 && var45.field1029[var43 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var43 - 1));
                        }
                        class47 var48 = new class47();
                        var48.field1027 = true;
                        var48.field1070 = var43;
                        var48.field1051 = var48.field1071 = var45.field1071;
                        var48.field1127 = var42;
                        var45.field1029[var43] = var48;
                        if (var41) {
                            class98.field2099 = var48;
                        } else {
                            class150.field3007 = var48;
                        }
                        class3.method12(var45, false);
                        continue;
                    }
                    if (var294 == 101) {
                        class47 var49 = var41 ? class98.field2099 : class150.field3007;
                        class47 var50 = class113.method725((byte) 108, var49.field1071);
                        var50.field1029[var49.field1070] = null;
                        class3.method12(var50, false);
                        continue;
                    }
                    if (var294 == 102) {
                        var5--;
                        class47 var51 = class113.method725((byte) 106, class163.field3272[var5]);
                        var51.field1029 = null;
                        class3.method12(var51, false);
                        continue;
                    }
                    if (var294 == 200) {
                        var5 -= 2;
                        int var52 = class163.field3272[var5];
                        int var53 = class163.field3272[var5 + 1];
                        class47 var54 = class15.method79(var52, var53, -12910);
                        if (var54 != null && var53 != -1) {
                            class163.field3272[var5++] = 1;
                            if (var41) {
                                class98.field2099 = var54;
                            } else {
                                class150.field3007 = var54;
                            }
                            continue;
                        }
                        class163.field3272[var5++] = 0;
                        continue;
                    }
                } else if (var294 >= 1000 && var294 < 1100 || var294 >= 2000 && var294 < 2100) {
                    class47 var55;
                    if (var294 < 2000) {
                        var55 = var41 ? class98.field2099 : class150.field3007;
                    } else {
                        var5--;
                        var55 = class113.method725((byte) 100, class163.field3272[var5]);
                        var294 -= 1000;
                    }
                    if (var294 == 1000) {
                        var5 -= 2;
                        var55.field1102 = class163.field3272[var5];
                        var55.field1120 = class163.field3272[var5 + 1];
                        class3.method12(var55, false);
                        continue;
                    }
                    if (var294 == 1001) {
                        var5 -= 2;
                        var55.field1125 = class163.field3272[var5];
                        var55.field1123 = class163.field3272[var5 + 1];
                        class3.method12(var55, false);
                        continue;
                    }
                    if (var294 == 1003) {
                        var5--;
                        boolean var56 = class163.field3272[var5] == 1;
                        if (var55.field1143 != var56) {
                            var55.field1143 = var56;
                            class3.method12(var55, false);
                        }
                        continue;
                    }
                } else if (var294 >= 1100 && var294 < 1200 || !(var294 < 2100 || var294 >= 2200)) {
                    class47 var286;
                    if (var294 >= 2000) {
                        var5--;
                        var286 = class113.method725((byte) 110, class163.field3272[var5]);
                        var294 -= 1000;
                    } else {
                        var286 = var41 ? class98.field2099 : class150.field3007;
                    }
                    if (var294 == 1100) {
                        var5 -= 2;
                        var286.field1100 = class163.field3272[var5];
                        if (var286.field1022 - var286.field1125 < var286.field1100) {
                            var286.field1100 = var286.field1022 - var286.field1125;
                        }
                        if (var286.field1100 < 0) {
                            var286.field1100 = 0;
                        }
                        var286.field1065 = class163.field3272[var5 + 1];
                        if (var286.field1065 > var286.field1107 - var286.field1123) {
                            var286.field1065 = var286.field1107 - var286.field1123;
                        }
                        if (var286.field1065 < 0) {
                            var286.field1065 = 0;
                        }
                        class3.method12(var286, false);
                        continue;
                    }
                    if (var294 == 1101) {
                        var5--;
                        var286.field1112 = class163.field3272[var5];
                        class3.method12(var286, false);
                        continue;
                    }
                    if (var294 == 1102) {
                        var5--;
                        var286.field1058 = class163.field3272[var5] == 1;
                        class3.method12(var286, false);
                        continue;
                    }
                    if (var294 == 1103) {
                        var5--;
                        var286.field1115 = class163.field3272[var5];
                        class3.method12(var286, false);
                        continue;
                    }
                    if (var294 == 1104) {
                        var5--;
                        var286.field1060 = class163.field3272[var5];
                        class3.method12(var286, false);
                        continue;
                    }
                    if (var294 == 1105) {
                        var5--;
                        var286.field1025 = class163.field3272[var5];
                        class3.method12(var286, false);
                        continue;
                    }
                    if (var294 == 1106) {
                        var5--;
                        var286.field1036 = class163.field3272[var5];
                        class3.method12(var286, false);
                        continue;
                    }
                    if (var294 == 1107) {
                        var5--;
                        var286.field1069 = class163.field3272[var5] == 1;
                        class3.method12(var286, false);
                        continue;
                    }
                    if (var294 == 1108) {
                        var286.field1135 = 1;
                        var5--;
                        var286.field1032 = class163.field3272[var5];
                        class3.method12(var286, false);
                        continue;
                    }
                    if (var294 == 1109) {
                        var5 -= 6;
                        var286.field1038 = class163.field3272[var5];
                        var286.field1021 = class163.field3272[var5 + 1];
                        var286.field1073 = class163.field3272[var5 + 2];
                        var286.field1048 = class163.field3272[var5 + 3];
                        var286.field1067 = class163.field3272[var5 + 4];
                        var286.field1040 = class163.field3272[var5 + 5];
                        class3.method12(var286, false);
                        continue;
                    }
                    if (var294 == 1110) {
                        var5--;
                        int var287 = class163.field3272[var5];
                        if (var286.field1095 != var287) {
                            var286.field1146 = 0;
                            var286.field1082 = 0;
                            var286.field1095 = var287;
                            class3.method12(var286, false);
                        }
                        continue;
                    }
                    if (var294 == 1111) {
                        var5--;
                        var286.field1084 = class163.field3272[var5] == 1;
                        class3.method12(var286, false);
                        continue;
                    }
                    if (var294 == 1112) {
                        var7--;
                        class23 var288 = class62.field1439[var7];
                        if (!var288.method161(122, var286.field1030)) {
                            var286.field1030 = var288;
                            class3.method12(var286, false);
                        }
                        continue;
                    }
                    if (var294 == 1113) {
                        var5--;
                        var286.field1052 = class163.field3272[var5];
                        class3.method12(var286, false);
                        continue;
                    }
                    if (var294 == 1114) {
                        var5 -= 3;
                        var286.field1108 = class163.field3272[var5];
                        var286.field1106 = class163.field3272[var5 + 1];
                        var286.field1014 = class163.field3272[var5 + 2];
                        class3.method12(var286, false);
                        continue;
                    }
                    if (var294 == 1115) {
                        var5--;
                        var286.field1035 = class163.field3272[var5] == 1;
                        class3.method12(var286, false);
                        continue;
                    }
                    if (var294 == 1116) {
                        var5--;
                        var286.field1114 = class163.field3272[var5];
                        class3.method12(var286, false);
                        continue;
                    }
                    if (var294 == 1117) {
                        var5--;
                        var286.field1064 = class163.field3272[var5];
                        class3.method12(var286, false);
                        continue;
                    }
                    if (var294 == 1118) {
                        var5--;
                        var286.field1081 = class163.field3272[var5] == 1;
                        class3.method12(var286, false);
                        continue;
                    }
                    if (var294 == 1119) {
                        var5--;
                        var286.field1007 = class163.field3272[var5] == 1;
                        class3.method12(var286, false);
                        continue;
                    }
                    if (var294 == 1120) {
                        var5 -= 2;
                        var286.field1022 = class163.field3272[var5];
                        var286.field1107 = class163.field3272[var5 + 1];
                        class3.method12(var286, false);
                        continue;
                    }
                } else if (var294 >= 1200 && var294 < 1300 || var294 >= 2200 && var294 < 2300) {
                    class47 var282;
                    if (var294 < 2000) {
                        var282 = var41 ? class98.field2099 : class150.field3007;
                    } else {
                        var294 -= 1000;
                        var5--;
                        var282 = class113.method725((byte) 101, class163.field3272[var5]);
                    }
                    class3.method12(var282, false);
                    if (var294 == 1200) {
                        var5 -= 2;
                        int var283 = class163.field3272[var5];
                        int var284 = class163.field3272[var5 + 1];
                        var282.field1092 = var284;
                        var282.field1147 = var283;
                        class63 var285 = class85.method565(var283, (byte) -107);
                        var282.field1048 = var285.field1507;
                        var282.field1073 = var285.field1489;
                        var282.field1038 = var285.field1504;
                        var282.field1067 = var285.field1455;
                        var282.field1021 = var285.field1482;
                        var282.field1040 = var285.field1473;
                        if (var282.field1125 > 0) {
                            var282.field1040 = var282.field1040 * 32 / var282.field1125;
                        }
                        continue;
                    }
                    if (var294 == 1201) {
                        var282.field1135 = 2;
                        var5--;
                        var282.field1032 = class163.field3272[var5];
                        continue;
                    }
                    if (var294 == 1202) {
                        var282.field1135 = 3;
                        var282.field1032 = class134.field2790.field1328.method1009(arg0 + 1142691916);
                        continue;
                    }
                } else if ((var294 < 1300 || var294 >= 1400) && (var294 < 2300 || var294 >= 2400)) {
                    if (var294 >= 1400 && var294 < 1500 || var294 >= 2400 && var294 < 2500) {
                        int[] var61 = null;
                        class47 var62;
                        if (var294 < 2000) {
                            var62 = var41 ? class98.field2099 : class150.field3007;
                        } else {
                            var294 -= 1000;
                            var5--;
                            var62 = class113.method725((byte) 124, class163.field3272[var5]);
                        }
                        var7--;
                        class23 var63 = class62.field1439[var7];
                        if (var63.method143(-41) > 0 && var63.method160(var63.method143(arg0 + 1142686057) - 1, arg0 + 1142686353) == 89) {
                            var5--;
                            int var64 = class163.field3272[var5];
                            if (var64 > 0) {
                                var61 = new int[var64];
                                while (var64-- > 0) {
                                    var5--;
                                    var61[var64] = class163.field3272[var5];
                                }
                            }
                            var63 = var63.method156(0, var63.method143(arg0 ^ 0x441C01B9) - 1, -98);
                        }
                        Object[] var65 = new Object[var63.method143(-41) + 1];
                        for (int var66 = var65.length - 1; var66 >= 1; var66--) {
                            if (var63.method160(var66 - 1, 255) == 115) {
                                var7--;
                                var65[var66] = class62.field1439[var7];
                            } else {
                                var5--;
                                var65[var66] = Integer.valueOf(class163.field3272[var5]);
                            }
                        }
                        var5--;
                        int var67 = class163.field3272[var5];
                        if (var67 == -1) {
                            var65 = null;
                        } else {
                            var65[0] = Integer.valueOf(var67);
                        }
                        if (var294 == 1425) {
                            var62.field1110 = var65;
                        }
                        if (var294 == 1423) {
                            var62.field1148 = var65;
                        }
                        if (var294 == 1401) {
                            var62.field1026 = var65;
                        }
                        if (var294 == 1407) {
                            var62.field1122 = var65;
                            var62.field1140 = var61;
                        }
                        if (var294 == 1411) {
                            var62.field1098 = var65;
                        }
                        if (var294 == 1406) {
                            var62.field1020 = var65;
                        }
                        if (var294 == 1420) {
                            var62.field1055 = var65;
                        }
                        if (var294 == 1418) {
                            var62.field1042 = var65;
                        }
                        if (var294 == 1422) {
                            var62.field1133 = var65;
                        }
                        var62.field1054 = true;
                        if (var294 == 1424) {
                            var62.field1126 = var65;
                        }
                        if (var294 == 1405) {
                            var62.field1008 = var65;
                        }
                        if (var294 == 1419) {
                            var62.field1053 = var65;
                        }
                        if (var294 == 1410) {
                            var62.field1041 = var65;
                        }
                        if (var294 == 1403) {
                            var62.field1086 = var65;
                        }
                        if (var294 == 1404) {
                            var62.field1105 = var65;
                        }
                        if (var294 == 1400) {
                            var62.field1116 = var65;
                        }
                        if (var294 == 1414) {
                            var62.field1096 = var65;
                            var62.field1085 = var61;
                        }
                        if (var294 == 1412) {
                            var62.field1031 = var65;
                        }
                        if (var294 == 1415) {
                            var62.field1050 = var65;
                            var62.field1090 = var61;
                        }
                        if (var294 == 1408) {
                            var62.field1010 = var65;
                        }
                        if (var294 == 1421) {
                            var62.field1130 = var65;
                        }
                        if (var294 == 1402) {
                            var62.field1132 = var65;
                        }
                        if (var294 == 1409) {
                            var62.field1142 = var65;
                        }
                        if (var294 == 1417) {
                            var62.field1134 = var65;
                        }
                        if (var294 == 1416) {
                            var62.field1093 = var65;
                        }
                        continue;
                    }
                    if (var294 < 1600) {
                        class47 var281 = var41 ? class98.field2099 : class150.field3007;
                        if (var294 == 1500) {
                            class163.field3272[var5++] = var281.field1102;
                            continue;
                        }
                        if (var294 == 1501) {
                            class163.field3272[var5++] = var281.field1120;
                            continue;
                        }
                        if (var294 == 1502) {
                            class163.field3272[var5++] = var281.field1125;
                            continue;
                        }
                        if (var294 == 1503) {
                            class163.field3272[var5++] = var281.field1123;
                            continue;
                        }
                        if (var294 == 1504) {
                            class163.field3272[var5++] = var281.field1143 ? 1 : 0;
                            continue;
                        }
                        if (var294 == 1505) {
                            class163.field3272[var5++] = var281.field1051;
                            continue;
                        }
                    } else if (var294 < 1700) {
                        class47 var280 = var41 ? class98.field2099 : class150.field3007;
                        if (var294 == 1600) {
                            class163.field3272[var5++] = var280.field1100;
                            continue;
                        }
                        if (var294 == 1601) {
                            class163.field3272[var5++] = var280.field1065;
                            continue;
                        }
                        if (var294 == 1602) {
                            class62.field1439[var7++] = var280.field1030;
                            continue;
                        }
                        if (var294 == 1603) {
                            class163.field3272[var5++] = var280.field1022;
                            continue;
                        }
                        if (var294 == 1604) {
                            class163.field3272[var5++] = var280.field1107;
                            continue;
                        }
                        if (var294 == 1605) {
                            class163.field3272[var5++] = var280.field1040;
                            continue;
                        }
                        if (var294 == 1606) {
                            class163.field3272[var5++] = var280.field1073;
                            continue;
                        }
                        if (var294 == 1607) {
                            class163.field3272[var5++] = var280.field1067;
                            continue;
                        }
                        if (var294 == 1608) {
                            class163.field3272[var5++] = var280.field1048;
                            continue;
                        }
                    } else if (var294 < 1800) {
                        class47 var279 = var41 ? class98.field2099 : class150.field3007;
                        if (var294 == 1700) {
                            class163.field3272[var5++] = var279.field1147;
                            continue;
                        }
                        if (var294 == 1701) {
                            if (var279.field1147 == -1) {
                                class163.field3272[var5++] = 0;
                            } else {
                                class163.field3272[var5++] = var279.field1092;
                            }
                            continue;
                        }
                        if (var294 == 1702) {
                            class163.field3272[var5++] = var279.field1070;
                            continue;
                        }
                    } else if (var294 < 1900) {
                        class47 var277 = var41 ? class98.field2099 : class150.field3007;
                        if (var294 == 1800) {
                            class163.field3272[var5++] = class67.method492(class141.method909(var277, 87), -1425314293);
                            continue;
                        }
                        if (var294 == 1801) {
                            var5--;
                            int var278 = class163.field3272[var5];
                            int var296 = var278 - 1;
                            if (var277.field1039 != null && var277.field1039.length > var296 && var277.field1039[var296] != null) {
                                class62.field1439[var7++] = var277.field1039[var296];
                                continue;
                            }
                            class62.field1439[var7++] = class138.field2852;
                            continue;
                        }
                        if (var294 == 1802) {
                            if (var277.field1061 == null) {
                                class62.field1439[var7++] = class138.field2852;
                            } else {
                                class62.field1439[var7++] = var277.field1061;
                            }
                            continue;
                        }
                    } else if (var294 < 2600) {
                        var5--;
                        class47 var68 = class113.method725((byte) 122, class163.field3272[var5]);
                        if (var294 == 2500) {
                            class163.field3272[var5++] = var68.field1102;
                            continue;
                        }
                        if (var294 == 2501) {
                            class163.field3272[var5++] = var68.field1120;
                            continue;
                        }
                        if (var294 == 2502) {
                            class163.field3272[var5++] = var68.field1125;
                            continue;
                        }
                        if (var294 == 2503) {
                            class163.field3272[var5++] = var68.field1123;
                            continue;
                        }
                        if (var294 == 2504) {
                            class163.field3272[var5++] = var68.field1143 ? 1 : 0;
                            continue;
                        }
                        if (var294 == 2505) {
                            class163.field3272[var5++] = var68.field1051;
                            continue;
                        }
                    } else if (var294 < 2700) {
                        var5--;
                        class47 var276 = class113.method725((byte) 117, class163.field3272[var5]);
                        if (var294 == 2600) {
                            class163.field3272[var5++] = var276.field1100;
                            continue;
                        }
                        if (var294 == 2601) {
                            class163.field3272[var5++] = var276.field1065;
                            continue;
                        }
                        if (var294 == 2602) {
                            class62.field1439[var7++] = var276.field1030;
                            continue;
                        }
                        if (var294 == 2603) {
                            class163.field3272[var5++] = var276.field1022;
                            continue;
                        }
                        if (var294 == 2604) {
                            class163.field3272[var5++] = var276.field1107;
                            continue;
                        }
                        if (var294 == 2605) {
                            class163.field3272[var5++] = var276.field1040;
                            continue;
                        }
                        if (var294 == 2606) {
                            class163.field3272[var5++] = var276.field1073;
                            continue;
                        }
                        if (var294 == 2607) {
                            class163.field3272[var5++] = var276.field1067;
                            continue;
                        }
                        if (var294 == 2608) {
                            class163.field3272[var5++] = var276.field1048;
                            continue;
                        }
                    } else if (var294 < 2800) {
                        if (var294 == 2700) {
                            var5--;
                            class47 var69 = class113.method725((byte) 91, class163.field3272[var5]);
                            class163.field3272[var5++] = var69.field1147;
                            continue;
                        }
                        if (var294 == 2701) {
                            var5--;
                            class47 var70 = class113.method725((byte) 111, class163.field3272[var5]);
                            if (var70.field1147 == -1) {
                                class163.field3272[var5++] = 0;
                            } else {
                                class163.field3272[var5++] = var70.field1092;
                            }
                            continue;
                        }
                        if (var294 == 2702) {
                            var5--;
                            int var71 = class163.field3272[var5];
                            class115 var72 = (class115) class31.field665.method260((long) var71, (byte) 28);
                            if (var72 == null) {
                                class163.field3272[var5++] = 0;
                            } else {
                                class163.field3272[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var294 < 2900) {
                        var5--;
                        class47 var73 = class113.method725((byte) 108, class163.field3272[var5]);
                        if (var294 == 2800) {
                            class163.field3272[var5++] = class67.method492(class141.method909(var73, -125), arg0 - 282628195);
                            continue;
                        }
                        if (var294 == 2801) {
                            var5--;
                            int var74 = class163.field3272[var5];
                            int var295 = var74 - 1;
                            if (var73.field1039 != null && var295 < var73.field1039.length && var73.field1039[var295] != null) {
                                class62.field1439[var7++] = var73.field1039[var295];
                                continue;
                            }
                            class62.field1439[var7++] = class138.field2852;
                            continue;
                        }
                        if (var294 == 2802) {
                            if (var73.field1061 == null) {
                                class62.field1439[var7++] = class138.field2852;
                            } else {
                                class62.field1439[var7++] = var73.field1061;
                            }
                            continue;
                        }
                    } else if (var294 < 3200) {
                        if (var294 == 3100) {
                            var7--;
                            class23 var261 = class62.field1439[var7];
                            class107.method701(arg0 + 1142697043, class138.field2852, 0, var261);
                            continue;
                        }
                        if (var294 == 3101) {
                            var5 -= 2;
                            class146.method926(arg0 + 1142686205, class163.field3272[var5 + 1], class134.field2790, class163.field3272[var5]);
                            continue;
                        }
                        if (var294 == 3103) {
                            class10.method57((byte) 123);
                            continue;
                        }
                        if (var294 == 3104) {
                            class133.field2755++;
                            int var262 = 0;
                            var7--;
                            class23 var263 = class62.field1439[var7];
                            if (var263.method165(arg0 + 1142686098)) {
                                var262 = var263.method135((byte) -98);
                            }
                            class159.field3190.method631(79, -1);
                            class159.field3190.method1186(var262, arg0 + 1142686086);
                            continue;
                        }
                        if (var294 == 3105) {
                            class51.field1217++;
                            var7--;
                            class23 var264 = class62.field1439[var7];
                            class159.field3190.method631(229, -1);
                            class159.field3190.method1199(var264.method166((byte) -96), arg0 ^ 0x3531CDA6);
                            continue;
                        }
                        if (var294 == 3106) {
                            var7--;
                            class23 var265 = class62.field1439[var7];
                            class159.field3190.method631(214, arg0 ^ 0x441C0191);
                            class159.field3190.method1180(var265.method143(-41) + 1, (byte) 120);
                            class159.field3190.method1191(var265, (byte) -70);
                            class180.field3560++;
                            continue;
                        }
                        if (var294 == 3107) {
                            var7--;
                            class23 var266 = class62.field1439[var7];
                            var5--;
                            int var267 = class163.field3272[var5];
                            class202.method1326((byte) -109, var266, var267);
                            continue;
                        }
                        if (var294 == 3108) {
                            var5 -= 3;
                            int var268 = class163.field3272[var5];
                            int var269 = class163.field3272[var5 + 2];
                            int var270 = class163.field3272[var5 + 1];
                            class47 var271 = class113.method725((byte) 104, var269);
                            class23.method149(var268, (byte) 118, var270, var271);
                            continue;
                        }
                        if (var294 == 3109) {
                            var5 -= 2;
                            int var272 = class163.field3272[var5 + 1];
                            class47 var273 = var41 ? class98.field2099 : class150.field3007;
                            int var274 = class163.field3272[var5];
                            class23.method149(var274, (byte) 118, var272, var273);
                            continue;
                        }
                        if (var294 == 3110) {
                            class186.field3633++;
                            var5--;
                            int var275 = class163.field3272[var5];
                            class159.field3190.method631(222, -1);
                            class159.field3190.method1220((byte) 50, var275);
                            continue;
                        }
                    } else if (var294 < 3300) {
                        if (var294 == 3200) {
                            var5 -= 3;
                            class204.method1333(class163.field3272[var5 + 1], class163.field3272[var5 + 2], class163.field3272[var5], false);
                            continue;
                        }
                        if (var294 == 3201) {
                            var5--;
                            class75.method534(class163.field3272[var5], (byte) 117);
                            continue;
                        }
                        if (var294 == 3202) {
                            var5 -= 2;
                            class170.method1039(-74, class163.field3272[var5 + 1], class163.field3272[var5]);
                            continue;
                        }
                    } else if (var294 < 3400) {
                        if (var294 == 3300) {
                            class163.field3272[var5++] = class15.field339;
                            continue;
                        }
                        if (var294 == 3301) {
                            var5 -= 2;
                            int var75 = class163.field3272[var5 + 1];
                            int var76 = class163.field3272[var5];
                            class163.field3272[var5++] = class31.method230(80, var75, var76);
                            continue;
                        }
                        if (var294 == 3302) {
                            var5 -= 2;
                            int var77 = class163.field3272[var5];
                            int var78 = class163.field3272[var5 + 1];
                            class163.field3272[var5++] = class175.method1103(var78, (byte) 122, var77);
                            continue;
                        }
                        if (var294 == 3303) {
                            var5 -= 2;
                            int var79 = class163.field3272[var5];
                            int var80 = class163.field3272[var5 + 1];
                            class163.field3272[var5++] = class156.method960(12018, var79, var80);
                            continue;
                        }
                        if (var294 == 3304) {
                            var5--;
                            int var81 = class163.field3272[var5];
                            class163.field3272[var5++] = class36.method263(false, var81).field2766;
                            continue;
                        }
                        if (var294 == 3305) {
                            var5--;
                            int var82 = class163.field3272[var5];
                            class163.field3272[var5++] = class110.field2330[var82];
                            continue;
                        }
                        if (var294 == 3306) {
                            var5--;
                            int var83 = class163.field3272[var5];
                            class163.field3272[var5++] = class61.field1420[var83];
                            continue;
                        }
                        if (var294 == 3307) {
                            var5--;
                            int var84 = class163.field3272[var5];
                            class163.field3272[var5++] = class156.field3120[var84];
                            continue;
                        }
                        if (var294 == 3308) {
                            int var85 = (class134.field2790.field277 >> 7) + class94.field1989;
                            int var86 = class59.field1385;
                            int var87 = (class134.field2790.field215 >> 7) + class155.field3099;
                            class163.field3272[var5++] = (var86 << 28) + (var87 << 14) + var85;
                            continue;
                        }
                        if (var294 == 3309) {
                            var5--;
                            int var88 = class163.field3272[var5];
                            class163.field3272[var5++] = class27.method198(var88, 268428688) >> 14;
                            continue;
                        }
                        if (var294 == 3310) {
                            var5--;
                            int var89 = class163.field3272[var5];
                            class163.field3272[var5++] = var89 >> 28;
                            continue;
                        }
                        if (var294 == 3311) {
                            var5--;
                            int var90 = class163.field3272[var5];
                            class163.field3272[var5++] = class27.method198(16383, var90);
                            continue;
                        }
                        if (var294 == 3312) {
                            class163.field3272[var5++] = class186.field3635 ? 1 : 0;
                            continue;
                        }
                        if (var294 == 3313) {
                            var5 -= 2;
                            int var91 = class163.field3272[var5] + 32768;
                            int var92 = class163.field3272[var5 + 1];
                            class163.field3272[var5++] = class31.method230(87, var92, var91);
                            continue;
                        }
                        if (var294 == 3314) {
                            var5 -= 2;
                            int var93 = class163.field3272[var5 + 1];
                            int var94 = class163.field3272[var5] + 32768;
                            class163.field3272[var5++] = class175.method1103(var93, (byte) 122, var94);
                            continue;
                        }
                        if (var294 == 3315) {
                            var5 -= 2;
                            int var95 = class163.field3272[var5] + 32768;
                            int var96 = class163.field3272[var5 + 1];
                            class163.field3272[var5++] = class156.method960(12018, var95, var96);
                            continue;
                        }
                        if (var294 == 3316) {
                            if (class102.field2181 >= 2) {
                                class163.field3272[var5++] = class102.field2181;
                            } else {
                                class163.field3272[var5++] = 0;
                            }
                            continue;
                        }
                        if (var294 == 3317) {
                            class163.field3272[var5++] = class86.field1844;
                            continue;
                        }
                        if (var294 == 3318) {
                            class163.field3272[var5++] = class13.field295;
                            continue;
                        }
                        if (var294 == 3321) {
                            class163.field3272[var5++] = class72.field1657;
                            continue;
                        }
                        if (var294 == 3322) {
                            class163.field3272[var5++] = class25.field539;
                            continue;
                        }
                        if (var294 == 3323) {
                            if (class102.field2181 == 1) {
                                class163.field3272[var5++] = 1;
                            } else {
                                class163.field3272[var5++] = 0;
                            }
                            continue;
                        }
                        if (var294 == 3325) {
                            if (class183.field3604 <= 0) {
                                class163.field3272[var5++] = 0;
                            } else {
                                class163.field3272[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var294 < 3500) {
                        if (var294 == 3400) {
                            var5 -= 2;
                            int var251 = class163.field3272[var5];
                            int var252 = class163.field3272[var5 + 1];
                            class129 var253 = class40.method330(119, var251);
                            for (int var254 = 0; var254 < var253.field2692; var254++) {
                                if (var253.field2696[var254] == var252) {
                                    class62.field1439[var7++] = var253.field2679[var254];
                                    var253 = null;
                                    break;
                                }
                            }
                            if (var253 != null) {
                                class62.field1439[var7++] = var253.field2695;
                            }
                            continue;
                        }
                        if (var294 == 3408) {
                            var5 -= 4;
                            int var255 = class163.field3272[var5 + 1];
                            int var256 = class163.field3272[var5];
                            int var257 = class163.field3272[var5 + 2];
                            int var258 = class163.field3272[var5 + 3];
                            class129 var259 = class40.method330(124, var257);
                            if (var259.field2681 == var256 && var259.field2685 == var255) {
                                for (int var260 = 0; var260 < var259.field2692; var260++) {
                                    if (var259.field2696[var260] == var258) {
                                        if (var255 == 115) {
                                            class62.field1439[var7++] = var259.field2679[var260];
                                        } else {
                                            class163.field3272[var5++] = var259.field2680[var260];
                                        }
                                        var259 = null;
                                        break;
                                    }
                                }
                                if (var259 != null) {
                                    if (var255 == 115) {
                                        class62.field1439[var7++] = var259.field2695;
                                    } else {
                                        class163.field3272[var5++] = var259.field2675;
                                    }
                                }
                                continue;
                            }
                            if (var255 == 115) {
                                class62.field1439[var7++] = class134.field2763;
                            } else {
                                class163.field3272[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var294 < 3700) {
                        if (var294 == 3600) {
                            if (class73.field1666 == 0) {
                                class163.field3272[var5++] = -2;
                            } else if (class73.field1666 == 1) {
                                class163.field3272[var5++] = -1;
                            } else {
                                class163.field3272[var5++] = class82.field1780;
                            }
                            continue;
                        }
                        if (var294 == 3601) {
                            var5--;
                            int var233 = class163.field3272[var5];
                            if (class73.field1666 == 2 && var233 < class82.field1780) {
                                class62.field1439[var7++] = class5.field95[var233];
                                continue;
                            }
                            class62.field1439[var7++] = class138.field2852;
                            continue;
                        }
                        if (var294 == 3602) {
                            var5--;
                            int var234 = class163.field3272[var5];
                            if (class73.field1666 == 2 && var234 < class82.field1780) {
                                class163.field3272[var5++] = class74.field1680[var234];
                                continue;
                            }
                            class163.field3272[var5++] = 0;
                            continue;
                        }
                        if (var294 == 3603) {
                            var5--;
                            int var235 = class163.field3272[var5];
                            if (class73.field1666 == 2 && var235 < class82.field1780) {
                                class163.field3272[var5++] = class65.field1544[var235];
                                continue;
                            }
                            class163.field3272[var5++] = 0;
                            continue;
                        }
                        if (var294 == 3604) {
                            var7--;
                            class23 var236 = class62.field1439[var7];
                            var5--;
                            int var237 = class163.field3272[var5];
                            class36.method261((byte) -93, var237, var236);
                            continue;
                        }
                        if (var294 == 3605) {
                            var7--;
                            class23 var238 = class62.field1439[var7];
                            class144.method916((byte) -87, var238.method166((byte) -115));
                            continue;
                        }
                        if (var294 == 3606) {
                            var7--;
                            class23 var239 = class62.field1439[var7];
                            class205.method1339(var239.method166((byte) -78), arg0 ^ 0xBBE388CC);
                            continue;
                        }
                        if (var294 == 3607) {
                            var7--;
                            class23 var240 = class62.field1439[var7];
                            class181.method1121(var240.method166((byte) -82), -125);
                            continue;
                        }
                        if (var294 == 3608) {
                            var7--;
                            class23 var241 = class62.field1439[var7];
                            class12.method67(var241.method166((byte) -77), -28138);
                            continue;
                        }
                        if (var294 == 3609) {
                            var7--;
                            class23 var242 = class62.field1439[var7];
                            if (var242.method144(class36.field744, 0) || var242.method144(class65.field1542, 0)) {
                                var242 = var242.method136(7, -3331);
                            }
                            class163.field3272[var5++] = class191.method1240((byte) -113, var242) ? 1 : 0;
                            continue;
                        }
                        if (var294 == 3611) {
                            if (class63.field1447 == null) {
                                class62.field1439[var7++] = class138.field2852;
                            } else {
                                class62.field1439[var7++] = class63.field1447.method164(-12065);
                            }
                            continue;
                        }
                        if (var294 == 3612) {
                            if (class63.field1447 == null) {
                                class163.field3272[var5++] = 0;
                            } else {
                                class163.field3272[var5++] = class165.field3294;
                            }
                            continue;
                        }
                        if (var294 == 3613) {
                            var5--;
                            int var243 = class163.field3272[var5];
                            if (class63.field1447 != null && var243 < class165.field3294) {
                                class62.field1439[var7++] = class159.field3189[var243].field2800.method164(-12065);
                                continue;
                            }
                            class62.field1439[var7++] = class138.field2852;
                            continue;
                        }
                        if (var294 == 3614) {
                            var5--;
                            int var244 = class163.field3272[var5];
                            if (class63.field1447 != null && var244 < class165.field3294) {
                                class163.field3272[var5++] = class159.field3189[var244].field2805;
                                continue;
                            }
                            class163.field3272[var5++] = 0;
                            continue;
                        }
                        if (var294 == 3615) {
                            var5--;
                            int var245 = class163.field3272[var5];
                            if (class63.field1447 != null && class165.field3294 > var245) {
                                class163.field3272[var5++] = class159.field3189[var245].field2797;
                                continue;
                            }
                            class163.field3272[var5++] = 0;
                            continue;
                        }
                        if (var294 == 3616) {
                            class163.field3272[var5++] = class193.field3814;
                            continue;
                        }
                        if (var294 == 3617) {
                            var7--;
                            class23 var246 = class62.field1439[var7];
                            class172.method1085(var246, arg0 + 1142684050);
                            continue;
                        }
                        if (var294 == 3618) {
                            class163.field3272[var5++] = class128.field2659;
                            continue;
                        }
                        if (var294 == 3619) {
                            var7--;
                            class23 var247 = class62.field1439[var7];
                            class8.method47((byte) 115, var247.method166((byte) -114));
                            continue;
                        }
                        if (var294 == 3620) {
                            class146.method924(-2);
                            continue;
                        }
                        if (var294 == 3621) {
                            if (class73.field1666 == 0) {
                                class163.field3272[var5++] = -1;
                            } else {
                                class163.field3272[var5++] = class157.field3145;
                            }
                            continue;
                        }
                        if (var294 == 3622) {
                            var5--;
                            int var248 = class163.field3272[var5];
                            if (class73.field1666 != 0 && var248 < class157.field3145) {
                                class62.field1439[var7++] = class39.method326(class189.field3758[var248], 91).method164(-12065);
                                continue;
                            }
                            class62.field1439[var7++] = class138.field2852;
                            continue;
                        }
                        if (var294 == 3623) {
                            var7--;
                            class23 var249 = class62.field1439[var7];
                            if (var249.method144(class36.field744, 0) || var249.method144(class65.field1542, 0)) {
                                var249 = var249.method136(7, -3331);
                            }
                            class163.field3272[var5++] = class166.method1019(var249, true) ? 1 : 0;
                            continue;
                        }
                        if (var294 == 3624) {
                            var5--;
                            int var250 = class163.field3272[var5];
                            if (class159.field3189 != null && var250 < class165.field3294 && class159.field3189[var250].field2800.method146(arg0 ^ 0x441C01C3, class134.field2790.field1345)) {
                                class163.field3272[var5++] = 1;
                                continue;
                            }
                            class163.field3272[var5++] = 0;
                            continue;
                        }
                        if (var294 == 3625) {
                            if (class68.field1602 == null) {
                                class62.field1439[var7++] = class138.field2852;
                            } else {
                                class62.field1439[var7++] = class68.field1602.method164(-12065);
                            }
                            continue;
                        }
                    } else if (var294 < 4000) {
                        if (var294 == 3902) {
                            var5--;
                            int var227 = class163.field3272[var5];
                            class163.field3272[var5++] = class199.field3909[var227].method338(arg0 + 1142686099);
                            continue;
                        }
                        if (var294 == 3903) {
                            var5--;
                            int var228 = class163.field3272[var5];
                            class163.field3272[var5++] = class199.field3909[var228].method340((byte) 95);
                            continue;
                        }
                        if (var294 == 3904) {
                            var5--;
                            int var229 = class163.field3272[var5];
                            class163.field3272[var5++] = class199.field3909[var229].field901;
                            continue;
                        }
                        if (var294 == 3905) {
                            var5--;
                            int var230 = class163.field3272[var5];
                            class163.field3272[var5++] = class199.field3909[var230].field892;
                            continue;
                        }
                        if (var294 == 3906) {
                            var5--;
                            int var231 = class163.field3272[var5];
                            class163.field3272[var5++] = class199.field3909[var231].field898;
                            continue;
                        }
                        if (var294 == 3907) {
                            var5--;
                            int var232 = class163.field3272[var5];
                            class163.field3272[var5++] = class199.field3909[var232].field895;
                            continue;
                        }
                    } else if (var294 < 4100) {
                        if (var294 == 4000) {
                            var5 -= 2;
                            int var97 = class163.field3272[var5];
                            int var98 = class163.field3272[var5 + 1];
                            class163.field3272[var5++] = var97 + var98;
                            continue;
                        }
                        if (var294 == 4001) {
                            var5 -= 2;
                            int var99 = class163.field3272[var5];
                            int var100 = class163.field3272[var5 + 1];
                            class163.field3272[var5++] = var99 - var100;
                            continue;
                        }
                        if (var294 == 4002) {
                            var5 -= 2;
                            int var101 = class163.field3272[var5];
                            int var102 = class163.field3272[var5 + 1];
                            class163.field3272[var5++] = var101 * var102;
                            continue;
                        }
                        if (var294 == 4003) {
                            var5 -= 2;
                            int var103 = class163.field3272[var5];
                            int var104 = class163.field3272[var5 + 1];
                            class163.field3272[var5++] = var103 / var104;
                            continue;
                        }
                        if (var294 == 4004) {
                            var5--;
                            int var105 = class163.field3272[var5];
                            class163.field3272[var5++] = (int) ((double) var105 * Math.random());
                            continue;
                        }
                        if (var294 == 4005) {
                            var5--;
                            int var106 = class163.field3272[var5];
                            class163.field3272[var5++] = (int) (Math.random() * (double) (var106 + 1));
                            continue;
                        }
                        if (var294 == 4006) {
                            var5 -= 5;
                            int var107 = class163.field3272[var5];
                            int var108 = class163.field3272[var5 + 2];
                            int var109 = class163.field3272[var5 + 3];
                            int var110 = class163.field3272[var5 + 1];
                            int var111 = class163.field3272[var5 + 4];
                            class163.field3272[var5++] = var107 + (var110 - var107) * (-var108 + var111) / (var109 - var108);
                            continue;
                        }
                        if (var294 == 4007) {
                            var5 -= 2;
                            int var112 = class163.field3272[var5];
                            int var113 = class163.field3272[var5 + 1];
                            class163.field3272[var5++] = var112 + var112 * var113 / 100;
                            continue;
                        }
                        if (var294 == 4008) {
                            var5 -= 2;
                            int var114 = class163.field3272[var5 + 1];
                            int var115 = class163.field3272[var5];
                            class163.field3272[var5++] = class119.method745(0x1 << var114, var115);
                            continue;
                        }
                        if (var294 == 4009) {
                            var5 -= 2;
                            int var116 = class163.field3272[var5 + 1];
                            int var117 = class163.field3272[var5];
                            class163.field3272[var5++] = class27.method198(var117, -(0x1 << var116) - 1);
                            continue;
                        }
                        if (var294 == 4010) {
                            var5 -= 2;
                            int var118 = class163.field3272[var5];
                            int var119 = class163.field3272[var5 + 1];
                            class163.field3272[var5++] = class27.method198(0x1 << var119, var118) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var294 == 4011) {
                            var5 -= 2;
                            int var120 = class163.field3272[var5];
                            int var121 = class163.field3272[var5 + 1];
                            class163.field3272[var5++] = var120 % var121;
                            continue;
                        }
                        if (var294 == 4012) {
                            var5 -= 2;
                            int var122 = class163.field3272[var5];
                            int var123 = class163.field3272[var5 + 1];
                            if (var122 == 0) {
                                class163.field3272[var5++] = 0;
                            } else {
                                class163.field3272[var5++] = (int) Math.pow((double) var122, (double) var123);
                            }
                            continue;
                        }
                        if (var294 == 4013) {
                            var5 -= 2;
                            int var124 = class163.field3272[var5];
                            int var125 = class163.field3272[var5 + 1];
                            if (var124 == 0) {
                                class163.field3272[var5++] = 0;
                            } else if (var125 == 0) {
                                class163.field3272[var5++] = Integer.MAX_VALUE;
                            } else {
                                class163.field3272[var5++] = (int) Math.pow((double) var124, 1.0D / (double) var125);
                            }
                            continue;
                        }
                        if (var294 == 4014) {
                            var5 -= 2;
                            int var126 = class163.field3272[var5];
                            int var127 = class163.field3272[var5 + 1];
                            class163.field3272[var5++] = class27.method198(var127, var126);
                            continue;
                        }
                        if (var294 == 4015) {
                            var5 -= 2;
                            int var128 = class163.field3272[var5];
                            int var129 = class163.field3272[var5 + 1];
                            class163.field3272[var5++] = class119.method745(var129, var128);
                            continue;
                        }
                        if (var294 == 4016) {
                            var5 -= 2;
                            int var130 = class163.field3272[var5 + 1];
                            int var131 = class163.field3272[var5];
                            class163.field3272[var5++] = var130 <= var131 ? var130 : var131;
                            continue;
                        }
                        if (var294 == 4017) {
                            var5 -= 2;
                            int var132 = class163.field3272[var5 + 1];
                            int var133 = class163.field3272[var5];
                            class163.field3272[var5++] = var133 <= var132 ? var132 : var133;
                            continue;
                        }
                        if (var294 == 4018) {
                            var5 -= 3;
                            long var134 = (long) class163.field3272[var5];
                            long var136 = (long) class163.field3272[var5 + 2];
                            long var138 = (long) class163.field3272[var5 + 1];
                            class163.field3272[var5++] = (int) (var134 * var136 / var138);
                            continue;
                        }
                    } else if (var294 < 4200) {
                        if (var294 == 4100) {
                            var5--;
                            int var140 = class163.field3272[var5];
                            var7--;
                            class23 var141 = class62.field1439[var7];
                            class62.field1439[var7++] = class3.method14(true, new class23[] { var141, class184.method1132(-1, var140) });
                            continue;
                        }
                        if (var294 == 4101) {
                            var7 -= 2;
                            class23 var142 = class62.field1439[var7 + 1];
                            class23 var143 = class62.field1439[var7];
                            class62.field1439[var7++] = class3.method14(true, new class23[] { var143, var142 });
                            continue;
                        }
                        if (var294 == 4102) {
                            var7--;
                            class23 var144 = class62.field1439[var7];
                            var5--;
                            int var145 = class163.field3272[var5];
                            class62.field1439[var7++] = class3.method14(true, new class23[] { var144, class62.method462(256, true, var145) });
                            continue;
                        }
                        if (var294 == 4103) {
                            var7--;
                            class23 var146 = class62.field1439[var7];
                            class62.field1439[var7++] = var146.method163(16864);
                            continue;
                        }
                        if (var294 == 4104) {
                            var5--;
                            int var147 = class163.field3272[var5];
                            long var148 = ((long) var147 + 11745L) * 86400000L;
                            class124.field2544.setTime(new Date(var148));
                            int var150 = class124.field2544.get(5);
                            int var151 = class124.field2544.get(2);
                            int var152 = class124.field2544.get(1);
                            class62.field1439[var7++] = class3.method14(true, new class23[] { class184.method1132(class199.method1287(arg0, 1142686097), var150), class27.field561, class89.field1903[var151], class27.field561, class184.method1132(-1, var152) });
                            continue;
                        }
                        if (var294 == 4105) {
                            var7 -= 2;
                            class23 var153 = class62.field1439[var7];
                            class23 var154 = class62.field1439[var7 + 1];
                            if (class134.field2790.field1328 != null && class134.field2790.field1328.field3291) {
                                class62.field1439[var7++] = var154;
                                continue;
                            }
                            class62.field1439[var7++] = var153;
                            continue;
                        }
                        if (var294 == 4106) {
                            var5--;
                            int var155 = class163.field3272[var5];
                            class62.field1439[var7++] = class184.method1132(arg0 + 1142686097, var155);
                            continue;
                        }
                        if (var294 == 4107) {
                            var7 -= 2;
                            class163.field3272[var5++] = class62.field1439[var7].method134(32, class62.field1439[var7 + 1]);
                            continue;
                        }
                        if (var294 == 4108) {
                            var5 -= 2;
                            var7--;
                            class23 var156 = class62.field1439[var7];
                            int var157 = class163.field3272[var5];
                            int var158 = class163.field3272[var5 + 1];
                            byte[] var159 = class182.field3600.method651(arg0 + 1142686102, 0, var158);
                            class26 var160 = new class26(var159);
                            class163.field3272[var5++] = var160.method288(var156, var157);
                            continue;
                        }
                        if (var294 == 4109) {
                            var7--;
                            class23 var161 = class62.field1439[var7];
                            var5 -= 2;
                            int var162 = class163.field3272[var5 + 1];
                            int var163 = class163.field3272[var5];
                            byte[] var164 = class182.field3600.method651(4, 0, var162);
                            class26 var165 = new class26(var164);
                            class163.field3272[var5++] = var165.method283(var161, var163);
                            continue;
                        }
                        if (var294 == 4110) {
                            var7 -= 2;
                            class23 var166 = class62.field1439[var7];
                            class23 var167 = class62.field1439[var7 + 1];
                            var5--;
                            if (class163.field3272[var5] == 1) {
                                class62.field1439[var7++] = var166;
                            } else {
                                class62.field1439[var7++] = var167;
                            }
                            continue;
                        }
                        if (var294 == 4111) {
                            var7--;
                            class23 var168 = class62.field1439[var7];
                            class62.field1439[var7++] = class37.method284(var168);
                            continue;
                        }
                        if (var294 == 4112) {
                            var7--;
                            class23 var169 = class62.field1439[var7];
                            var5--;
                            int var170 = class163.field3272[var5];
                            class62.field1439[var7++] = var169.method157((byte) -90, var170);
                            continue;
                        }
                        if (var294 == 4113) {
                            var5--;
                            int var171 = class163.field3272[var5];
                            class163.field3272[var5++] = class105.method693(var171, false) ? 1 : 0;
                            continue;
                        }
                        if (var294 == 4114) {
                            var5--;
                            int var172 = class163.field3272[var5];
                            class163.field3272[var5++] = class180.method1116(var172, 1645) ? 1 : 0;
                            continue;
                        }
                        if (var294 == 4115) {
                            var5--;
                            int var173 = class163.field3272[var5];
                            class163.field3272[var5++] = class10.method60(var173, class199.method1287(arg0, 1142686155)) ? 1 : 0;
                            continue;
                        }
                        if (var294 == 4116) {
                            var5--;
                            int var174 = class163.field3272[var5];
                            class163.field3272[var5++] = class176.method1108(var174, (byte) -111) ? 1 : 0;
                            continue;
                        }
                        if (var294 == 4117) {
                            var7--;
                            class23 var175 = class62.field1439[var7];
                            if (var175 == null) {
                                class163.field3272[var5++] = 0;
                            } else {
                                class163.field3272[var5++] = var175.method143(class199.method1287(arg0, 1142686137));
                            }
                            continue;
                        }
                        if (var294 == 4118) {
                            var5 -= 2;
                            int var176 = class163.field3272[var5];
                            var7--;
                            class23 var177 = class62.field1439[var7];
                            int var178 = class163.field3272[var5 + 1];
                            class62.field1439[var7++] = var177.method156(var176, var178, -74);
                            continue;
                        }
                        if (var294 == 4119) {
                            var7--;
                            class23 var179 = class62.field1439[var7];
                            boolean var180 = false;
                            class23 var181 = class181.method1122(96, var179.method143(-41));
                            for (int var182 = 0; var179.method143(-41) > var182; var182++) {
                                int var183 = var179.method160(var182, arg0 ^ 0xBBE3FE91);
                                if (var183 == 60) {
                                    var180 = true;
                                } else if (var183 == 62) {
                                    var180 = false;
                                } else if (!var180) {
                                    var181.method154((byte) 84, var183);
                                }
                            }
                            var181.method159(47);
                            class62.field1439[var7++] = var181;
                            continue;
                        }
                        if (var294 == 4120) {
                            var5 -= 2;
                            var7--;
                            class23 var184 = class62.field1439[var7];
                            int var185 = class163.field3272[var5];
                            int var186 = class163.field3272[var5 + 1];
                            class163.field3272[var5++] = var184.method150((byte) 106, var185, var186);
                            continue;
                        }
                        if (var294 == 4121) {
                            var7 -= 2;
                            class23 var187 = class62.field1439[var7];
                            class23 var188 = class62.field1439[var7 + 1];
                            var5--;
                            int var189 = class163.field3272[var5];
                            class163.field3272[var5++] = var187.method153(-18621, var189, var188);
                            continue;
                        }
                    } else if (var294 < 4300) {
                        if (var294 == 4200) {
                            var5--;
                            int var211 = class163.field3272[var5];
                            class62.field1439[var7++] = class85.method565(var211, (byte) -91).field1483;
                            continue;
                        }
                        if (var294 == 4201) {
                            var5 -= 2;
                            int var212 = class163.field3272[var5 + 1];
                            int var213 = class163.field3272[var5];
                            class63 var214 = class85.method565(var213, (byte) 94);
                            if (var212 >= 1 && var212 <= 5 && var214.field1498[var212 - 1] != null) {
                                class62.field1439[var7++] = var214.field1498[var212 - 1];
                                continue;
                            }
                            class62.field1439[var7++] = class138.field2852;
                            continue;
                        }
                        if (var294 == 4202) {
                            var5 -= 2;
                            int var215 = class163.field3272[var5 + 1];
                            int var216 = class163.field3272[var5];
                            class63 var217 = class85.method565(var216, (byte) -124);
                            if (var215 >= 1 && var215 <= 5 && var217.field1497[var215 - 1] != null) {
                                class62.field1439[var7++] = var217.field1497[var215 - 1];
                                continue;
                            }
                            class62.field1439[var7++] = class138.field2852;
                            continue;
                        }
                        if (var294 == 4203) {
                            var5--;
                            int var218 = class163.field3272[var5];
                            class163.field3272[var5++] = class85.method565(var218, (byte) -91).field1488;
                            continue;
                        }
                        if (var294 == 4204) {
                            var5--;
                            int var219 = class163.field3272[var5];
                            class163.field3272[var5++] = class85.method565(var219, (byte) -99).field1471 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var294 == 4205) {
                            var5--;
                            int var220 = class163.field3272[var5];
                            class63 var221 = class85.method565(var220, (byte) -50);
                            if (var221.field1470 == -1 && var221.field1478 >= 0) {
                                class163.field3272[var5++] = var221.field1478;
                                continue;
                            }
                            class163.field3272[var5++] = var220;
                            continue;
                        }
                        if (var294 == 4206) {
                            var5--;
                            int var222 = class163.field3272[var5];
                            class63 var223 = class85.method565(var222, (byte) -41);
                            if (var223.field1470 >= 0 && var223.field1478 >= 0) {
                                class163.field3272[var5++] = var223.field1478;
                                continue;
                            }
                            class163.field3272[var5++] = var222;
                            continue;
                        }
                        if (var294 == 4207) {
                            var5--;
                            int var224 = class163.field3272[var5];
                            class163.field3272[var5++] = class85.method565(var224, (byte) 83).field1468 ? 1 : 0;
                            continue;
                        }
                        if (var294 == 4210) {
                            var7--;
                            class23 var225 = class62.field1439[var7];
                            var5--;
                            int var226 = class163.field3272[var5];
                            class105.method692(var225, 0, var226 == 1);
                            class163.field3272[var5++] = class153.field3055;
                            continue;
                        }
                        if (var294 == 4211) {
                            if (class133.field2750 != null && class19.field409 < class153.field3055) {
                                class163.field3272[var5++] = class27.method198(65535, class133.field2750[class19.field409++]);
                                continue;
                            }
                            class163.field3272[var5++] = -1;
                            continue;
                        }
                        if (var294 == 4212) {
                            class19.field409 = 0;
                            continue;
                        }
                    } else if (var294 < 5100) {
                        if (var294 == 5000) {
                            class163.field3272[var5++] = class69.field1620;
                            continue;
                        }
                        if (var294 == 5001) {
                            var5 -= 3;
                            class69.field1620 = class163.field3272[var5];
                            class48.field1166++;
                            class145.field2955 = class163.field3272[var5 + 1];
                            class124.field2539 = class163.field3272[var5 + 2];
                            class159.field3190.method631(171, -1);
                            class159.field3190.method1180(class69.field1620, (byte) 119);
                            class159.field3190.method1180(class145.field2955, (byte) 51);
                            class159.field3190.method1180(class124.field2539, (byte) 70);
                            continue;
                        }
                        if (var294 == 5002) {
                            var5 -= 2;
                            class54.field1265++;
                            var7--;
                            class23 var190 = class62.field1439[var7];
                            int var191 = class163.field3272[var5 + 1];
                            int var192 = class163.field3272[var5];
                            class159.field3190.method631(108, -1);
                            class159.field3190.method1199(var190.method166((byte) -104), arg0 - 756140710);
                            class159.field3190.method1180(var192 - 1, (byte) 123);
                            class159.field3190.method1180(var191, (byte) 86);
                            continue;
                        }
                        if (var294 == 5003) {
                            var5--;
                            int var193 = class163.field3272[var5];
                            class23 var194 = null;
                            if (var193 < 100) {
                                var194 = class153.field3049[var193];
                            }
                            if (var194 == null) {
                                var194 = class138.field2852;
                            }
                            class62.field1439[var7++] = var194;
                            continue;
                        }
                        if (var294 == 5004) {
                            var5--;
                            int var195 = class163.field3272[var5];
                            int var196 = -1;
                            if (var195 < 100 && class153.field3049[var195] != null) {
                                var196 = class144.field2945[var195];
                            }
                            class163.field3272[var5++] = var196;
                            continue;
                        }
                        if (var294 == 5005) {
                            class163.field3272[var5++] = class145.field2955;
                            continue;
                        }
                        if (var294 == 5008) {
                            var7--;
                            class23 var197 = class62.field1439[var7];
                            if (var197.method144(class112.field2366, 0)) {
                                class190.method1232(var197, -26436);
                            } else {
                                class156.field3121++;
                                class23 var198 = var197.method163(16864);
                                byte var199 = 0;
                                if (var198.method144(class65.field1539, 0)) {
                                    var197 = var197.method136(class65.field1539.method143(arg0 ^ 0x441C01B9), -3331);
                                    var199 = 0;
                                } else if (var198.method144(class59.field1381, arg0 ^ 0xBBE3FE6E)) {
                                    var199 = 1;
                                    var197 = var197.method136(class59.field1381.method143(-41), -3331);
                                } else if (var198.method144(class61.field1419, 0)) {
                                    var197 = var197.method136(class61.field1419.method143(arg0 ^ 0x441C01B9), -3331);
                                    var199 = 2;
                                } else if (var198.method144(class160.field3207, 0)) {
                                    var197 = var197.method136(class160.field3207.method143(arg0 + 1142686057), -3331);
                                    var199 = 3;
                                } else if (var198.method144(class134.field2782, arg0 + 1142686098)) {
                                    var197 = var197.method136(class134.field2782.method143(-41), -3331);
                                    var199 = 4;
                                } else if (var198.method144(class156.field3116, 0)) {
                                    var197 = var197.method136(class156.field3116.method143(arg0 + 1142686057), -3331);
                                    var199 = 5;
                                } else if (var198.method144(class119.field2488, 0)) {
                                    var197 = var197.method136(class119.field2488.method143(-41), arg0 + 1142682767);
                                    var199 = 6;
                                } else if (var198.method144(class155.field3101, 0)) {
                                    var197 = var197.method136(class155.field3101.method143(-41), -3331);
                                    var199 = 7;
                                } else if (var198.method144(class14.field315, arg0 ^ 0xBBE3FE6E)) {
                                    var199 = 8;
                                    var197 = var197.method136(class14.field315.method143(-41), -3331);
                                } else if (var198.method144(class28.field610, arg0 + 1142686098)) {
                                    var199 = 9;
                                    var197 = var197.method136(class28.field610.method143(arg0 + 1142686057), -3331);
                                } else if (var198.method144(class7.field134, 0)) {
                                    var197 = var197.method136(class7.field134.method143(-41), arg0 + 1142682767);
                                    var199 = 10;
                                } else if (var198.method144(class202.field3990, 0)) {
                                    var199 = 11;
                                    var197 = var197.method136(class202.field3990.method143(-41), -3331);
                                } else if (class145.field2956 != 0) {
                                    if (var198.method144(class65.field1545, arg0 ^ 0xBBE3FE6E)) {
                                        var197 = var197.method136(class65.field1545.method143(-41), -3331);
                                        var199 = 0;
                                    } else if (var198.method144(class59.field1382, 0)) {
                                        var197 = var197.method136(class59.field1382.method143(-41), arg0 ^ 0x441C0C93);
                                        var199 = 1;
                                    } else if (var198.method144(class61.field1417, 0)) {
                                        var197 = var197.method136(class61.field1417.method143(-41), -3331);
                                        var199 = 2;
                                    } else if (var198.method144(class160.field3214, arg0 + 1142686098)) {
                                        var199 = 3;
                                        var197 = var197.method136(class160.field3214.method143(arg0 + 1142686057), -3331);
                                    } else if (var198.method144(class134.field2785, 0)) {
                                        var199 = 4;
                                        var197 = var197.method136(class134.field2785.method143(-41), -3331);
                                    } else if (var198.method144(class156.field3114, 0)) {
                                        var197 = var197.method136(class156.field3114.method143(-41), -3331);
                                        var199 = 5;
                                    } else if (var198.method144(class119.field2481, arg0 ^ 0xBBE3FE6E)) {
                                        var197 = var197.method136(class119.field2481.method143(-41), -3331);
                                        var199 = 6;
                                    } else if (var198.method144(class155.field3105, 0)) {
                                        var199 = 7;
                                        var197 = var197.method136(class155.field3105.method143(-41), -3331);
                                    } else if (var198.method144(class14.field319, 0)) {
                                        var197 = var197.method136(class14.field319.method143(-41), -3331);
                                        var199 = 8;
                                    } else if (var198.method144(class28.field608, arg0 + 1142686098)) {
                                        var199 = 9;
                                        var197 = var197.method136(class28.field608.method143(arg0 + 1142686057), -3331);
                                    } else if (var198.method144(class7.field130, 0)) {
                                        var197 = var197.method136(class7.field130.method143(-41), -3331);
                                        var199 = 10;
                                    } else if (var198.method144(class202.field3989, 0)) {
                                        var197 = var197.method136(class202.field3989.method143(-41), -3331);
                                        var199 = 11;
                                    }
                                }
                                class23 var200 = var197.method163(16864);
                                byte var201 = 0;
                                if (var200.method144(class146.field2991, 0)) {
                                    var201 = 1;
                                    var197 = var197.method136(class146.field2991.method143(-41), arg0 ^ 0x441C0C93);
                                } else if (var200.method144(class103.field2194, arg0 ^ 0xBBE3FE6E)) {
                                    var197 = var197.method136(class103.field2194.method143(-41), -3331);
                                    var201 = 2;
                                } else if (var200.method144(class161.field3230, arg0 ^ 0xBBE3FE6E)) {
                                    var197 = var197.method136(class161.field3230.method143(arg0 + 1142686057), arg0 ^ 0x441C0C93);
                                    var201 = 3;
                                } else if (var200.method144(class34.field699, 0)) {
                                    var197 = var197.method136(class34.field699.method143(-41), -3331);
                                    var201 = 4;
                                } else if (var200.method144(class15.field334, 0)) {
                                    var201 = 5;
                                    var197 = var197.method136(class15.field334.method143(-41), -3331);
                                } else if (class145.field2956 != 0) {
                                    if (var200.method144(class146.field2987, 0)) {
                                        var197 = var197.method136(class146.field2987.method143(arg0 + 1142686057), -3331);
                                        var201 = 1;
                                    } else if (var200.method144(class103.field2199, 0)) {
                                        var197 = var197.method136(class103.field2199.method143(-41), -3331);
                                        var201 = 2;
                                    } else if (var200.method144(class161.field3222, 0)) {
                                        var197 = var197.method136(class161.field3222.method143(-41), -3331);
                                        var201 = 3;
                                    } else if (var200.method144(class34.field693, arg0 ^ 0xBBE3FE6E)) {
                                        var201 = 4;
                                        var197 = var197.method136(class34.field693.method143(-41), arg0 ^ 0x441C0C93);
                                    } else if (var200.method144(class15.field325, 0)) {
                                        var197 = var197.method136(class15.field325.method143(-41), arg0 + 1142682767);
                                        var201 = 5;
                                    }
                                }
                                class159.field3190.method631(10, -1);
                                class159.field3190.method1180(0, (byte) 96);
                                int var202 = class159.field3190.field3752;
                                class159.field3190.method1180(var199, (byte) 57);
                                class159.field3190.method1180(var201, (byte) 100);
                                class40.method332(class159.field3190, var197, (byte) 125);
                                class159.field3190.method1206(class159.field3190.field3752 - var202, -4375);
                            }
                            continue;
                        }
                        if (var294 == 5009) {
                            class34.field695++;
                            var7 -= 2;
                            class23 var203 = class62.field1439[var7];
                            class23 var204 = class62.field1439[var7 + 1];
                            class159.field3190.method631(233, -1);
                            class159.field3190.method1180(0, (byte) 59);
                            int var205 = class159.field3190.field3752;
                            class159.field3190.method1199(var203.method166((byte) -84), arg0 - 756140710);
                            class40.method332(class159.field3190, var204, (byte) 125);
                            class159.field3190.method1206(class159.field3190.field3752 - var205, -4375);
                            continue;
                        }
                        if (var294 == 5010) {
                            var5--;
                            int var206 = class163.field3272[var5];
                            class23 var207 = null;
                            if (var206 < 100) {
                                var207 = class61.field1411[var206];
                            }
                            if (var207 == null) {
                                var207 = class138.field2852;
                            }
                            class62.field1439[var7++] = var207;
                            continue;
                        }
                        if (var294 == 5011) {
                            var5--;
                            int var208 = class163.field3272[var5];
                            class23 var209 = null;
                            if (var208 < 100) {
                                var209 = class161.field3227[var208];
                            }
                            if (var209 == null) {
                                var209 = class138.field2852;
                            }
                            class62.field1439[var7++] = var209;
                            continue;
                        }
                        if (var294 == 5015) {
                            class23 var210;
                            if (class134.field2790 == null || class134.field2790.field1345 == null) {
                                var210 = class105.field2284;
                            } else {
                                var210 = class134.field2790.field1345;
                            }
                            class62.field1439[var7++] = var210;
                            continue;
                        }
                        if (var294 == 5016) {
                            class163.field3272[var5++] = class124.field2539;
                            continue;
                        }
                        if (var294 == 5017) {
                            class163.field3272[var5++] = class105.field2283;
                            continue;
                        }
                    }
                } else {
                    class47 var57;
                    if (var294 < 2000) {
                        var57 = var41 ? class98.field2099 : class150.field3007;
                    } else {
                        var5--;
                        var57 = class113.method725((byte) 110, class163.field3272[var5]);
                        var294 -= 1000;
                    }
                    if (var294 == 1300) {
                        var5--;
                        int var58 = class163.field3272[var5] - 1;
                        if (var58 >= 0 && var58 <= 9) {
                            var7--;
                            var57.method365((byte) 126, class62.field1439[var7], var58);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var294 == 1301) {
                        var5 -= 2;
                        int var59 = class163.field3272[var5];
                        int var60 = class163.field3272[var5 + 1];
                        var57.field1009 = class15.method79(var59, var60, -12910);
                        continue;
                    }
                    if (var294 == 1302) {
                        var5--;
                        var57.field1034 = class163.field3272[var5] == 1;
                        continue;
                    }
                    if (var294 == 1303) {
                        var5--;
                        var57.field1087 = class163.field3272[var5];
                        continue;
                    }
                    if (var294 == 1304) {
                        var5--;
                        var57.field1113 = class163.field3272[var5];
                        continue;
                    }
                    if (var294 == 1305) {
                        var7--;
                        var57.field1061 = class62.field1439[var7];
                        continue;
                    }
                    if (var294 == 1306) {
                        var7--;
                        var57.field1028 = class62.field1439[var7];
                        continue;
                    }
                    if (var294 == 1307) {
                        var57.field1039 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var293) {
            if (var4.field3612 == null) {
                if (class199.field3894 != 0) {
                    class107.method701(arg0 + 1142697043, class138.field2852, 0, class131.field2711);
                }
                class186.method1145("CS2 - scr:" + var4.field3317 + " op:" + var10, var293, 46);
            } else {
                class23 var290 = class181.method1122(111, 30);
                var290.method155(120, class181.field3587).method155(119, var4.field3612);
                for (int var291 = class138.field2847 - 1; var291 >= 0; var291--) {
                    var290.method155(121, class169.field3372).method155(118, class121.field2516[var291].field2529.field3612);
                }
                if (var10 == 40) {
                    int var292 = var8[var6];
                    var290.method155(arg0 ^ 0xBBE3FE11, class121.field2510).method155(120, class184.method1132(-1, var292));
                }
                if (class199.field3894 != 0) {
                    class107.method701(10945, class138.field2852, 0, class3.method14(true, new class23[] { class96.field2025, var4.field3612 }));
                }
                class186.method1145("CS2 - scr:" + var4.field3317 + " op:" + var10 + new String(var290.method162((byte) 91)), var293, 46);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILgb;II)V")
    public static final void method392(int arg0, class57 arg1, int arg2, int arg3) {
        field1194++;
        if ((arg3 & 0x1) != 0) {
            int var4 = class81.field1769.method1202(-86);
            int var5 = class81.field1769.method1202(122);
            arg1.method66(class15.field339, var5, var4, (byte) 67);
            arg1.field244 = class15.field339 + 300;
            arg1.field261 = class81.field1769.method1203(arg0 + 64);
            arg1.field270 = class81.field1769.method1203(-123);
        }
        if ((arg3 & 0x400) != 0) {
            arg1.field214 = class81.field1769.method1202(-115);
            arg1.field267 = class81.field1769.method1202(115);
            arg1.field265 = class81.field1769.method1203(-123);
            arg1.field239 = class81.field1769.method1201(false);
            arg1.field223 = class81.field1769.method1197(-1) + class15.field339;
            arg1.field263 = class81.field1769.method1200(arg0 - 125) + class15.field339;
            arg1.field225 = class81.field1769.method1201(false);
            arg1.field247 = 1;
            arg1.field236 = 0;
        }
        if ((arg3 & 0x200) != 0) {
            int var6 = class81.field1769.method1203(-128);
            int var7 = class81.field1769.method1203(arg0 ^ 0x79);
            arg1.method66(class15.field339, var7, var6, (byte) 105);
            arg1.field244 = class15.field339 + 300;
            arg1.field261 = class81.field1769.method1207((byte) 37);
            arg1.field270 = class81.field1769.method1207((byte) 114);
        }
        if ((arg3 & 0x100) != 0) {
            arg1.field287 = class81.field1769.method1200(arg0 ^ 0x7F);
            int var8 = class81.field1769.method1176(arg0 ^ 0xFFFFFFFC);
            arg1.field249 = var8 >> 16;
            arg1.field278 = 0;
            if (arg1.field287 == 65535) {
                arg1.field287 = -1;
            }
            arg1.field260 = (var8 & 0xFFFF) + class15.field339;
            if (class15.field339 < arg1.field260) {
                arg1.field278 = -1;
            }
            arg1.field237 = 0;
        }
        if ((arg3 & 0x80) != 0) {
            int var9 = class81.field1769.method1197(-1);
            int var10 = class81.field1769.method1203(-121);
            int var11 = class81.field1769.method1203(14);
            int var12 = class81.field1769.field3752;
            if (arg1.field1345 != null && arg1.field1328 != null) {
                long var13 = arg1.field1345.method166((byte) -77);
                boolean var15 = false;
                if (var10 <= 1) {
                    for (int var16 = 0; var16 < class157.field3145; var16++) {
                        if (class189.field3758[var16] == var13) {
                            var15 = true;
                            break;
                        }
                    }
                }
                if (!var15 && class3.field36 == 0) {
                    class191.field3784.field3752 = 0;
                    class81.field1769.method1229(116, 0, class191.field3784.field3753, var11);
                    class191.field3784.field3752 = 0;
                    class23 var17 = class37.method284(class89.method587(64, class191.field3784).method151((byte) -43));
                    arg1.field256 = var17.method139(arg0 ^ 0xC);
                    arg1.field224 = var9 & 0xFF;
                    arg1.field221 = 150;
                    arg1.field222 = var9 >> 8;
                    if (var10 == 2 || var10 == 3) {
                        class107.method701(10945, class3.method14(true, new class23[] { class19.field401, arg1.field1345 }), 1, var17);
                    } else if (var10 == 1) {
                        class107.method701(10945, class3.method14(true, new class23[] { class174.field3469, arg1.field1345 }), 1, var17);
                    } else {
                        class107.method701(10945, arg1.field1345, 2, var17);
                    }
                }
            }
            class81.field1769.field3752 = var12 + var11;
        }
        if ((arg3 & 0x2) != 0) {
            arg1.field256 = class81.field1769.method1193((byte) -70);
            if (arg1.field256.method160(0, 255) == 126) {
                arg1.field256 = arg1.field256.method136(1, -3331);
                class107.method701(10945, arg1.field1345, 2, arg1.field256);
            } else if (class134.field2790 == arg1) {
                class107.method701(10945, arg1.field1345, 2, arg1.field256);
            }
            arg1.field221 = 150;
            arg1.field222 = 0;
            arg1.field224 = 0;
        }
        if ((arg3 & 0x8) != 0) {
            int var18 = class81.field1769.method1216((byte) 112);
            if (var18 == 65535) {
                var18 = -1;
            }
            int var19 = class81.field1769.method1202(arg0 ^ 0xFFFFFF99);
            class146.method926(90, var19, arg1, var18);
        }
        if (~(arg3 & 0x40) != arg0) {
            arg1.field218 = class81.field1769.method1216((byte) 70);
            if (arg1.field218 == 65535) {
                arg1.field218 = -1;
            }
        }
        if ((arg3 & 0x20) != 0) {
            arg1.field245 = class81.field1769.method1197(arg0);
            arg1.field217 = class81.field1769.method1197(arg0);
        }
        if ((arg3 & 0x4) == 0) {
            return;
        }
        int var20 = class81.field1769.method1207((byte) 102);
        byte[] var21 = new byte[var20];
        class189 var22 = new class189(var21);
        class81.field1769.method1223(var20, 0, (byte) 69, var21);
        class151.field3013[arg2] = var22;
        arg1.method437(var22, arg0 ^ 0xFFFFFFB0);
    }
}
