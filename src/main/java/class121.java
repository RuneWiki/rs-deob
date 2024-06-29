import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class121 {

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field1764 = 0;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Ldc;")
    public static class92 field1766 = new class92(0, -1);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILjh;)V")
    public static final void method826(int arg0, int arg1, class234 arg2) {
        field1763++;
        Object[] var3 = arg2.field3530;
        int var4 = (Integer) var3[0];
        class25 var5 = class34.method236(var4, -67);
        if (var5 == null) {
            return;
        }
        class52.field761 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field325;
        int[] var10 = var5.field328;
        byte var11 = -1;
        try {
            class269.field4209 = new String[var5.field329];
            class61.field972 = new int[var5.field326];
            int var12 = -107 % ((15 - arg1) / 33);
            int var13 = 0;
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg2.field3528;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field3519;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field3531 == null ? -1 : arg2.field3531.field4113;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field3518;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field3531 == null ? -1 : arg2.field3531.field4058;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field3523 == null ? -1 : arg2.field3523.field4113;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field3523 == null ? -1 : arg2.field3523.field4058;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field3532;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field3537;
                    }
                    class61.field972[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg2.field3520;
                    }
                    class269.field4209[var14++] = var17;
                }
            }
            int var18 = 0;
            label3885: while (true) {
                var18++;
                if (var18 > arg0) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var497 = var9[var8];
                if (var497 < 100) {
                    if (var497 == 0) {
                        class37.field555[var6++] = var10[var8];
                        continue;
                    }
                    if (var497 == 1) {
                        int var19 = var10[var8];
                        class37.field555[var6++] = class20.field276[var19];
                        continue;
                    }
                    if (var497 == 2) {
                        int var20 = var10[var8];
                        var6--;
                        class146.method978((byte) -118, var20, class37.field555[var6]);
                        continue;
                    }
                    if (var497 == 3) {
                        class22.field285[var7++] = var5.field330[var8];
                        continue;
                    }
                    if (var497 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var497 == 7) {
                        var6 -= 2;
                        if (class37.field555[var6 + 1] != class37.field555[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var497 == 8) {
                        var6 -= 2;
                        if (class37.field555[var6 + 1] == class37.field555[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var497 == 9) {
                        var6 -= 2;
                        if (class37.field555[var6] < class37.field555[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var497 == 10) {
                        var6 -= 2;
                        if (class37.field555[var6 + 1] < class37.field555[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var497 == 21) {
                        if (class52.field761 == 0) {
                            return;
                        }
                        class142 var21 = class48.field685[--class52.field761];
                        class269.field4209 = var21.field2058;
                        class61.field972 = var21.field2052;
                        var8 = var21.field2053;
                        var5 = var21.field2054;
                        var9 = var5.field325;
                        var10 = var5.field328;
                        continue;
                    }
                    if (var497 == 25) {
                        int var22 = var10[var8];
                        class37.field555[var6++] = class1.method2(var22, 128);
                        continue;
                    }
                    if (var497 == 27) {
                        int var23 = var10[var8];
                        var6--;
                        class172.method1133(var23, false, class37.field555[var6]);
                        continue;
                    }
                    if (var497 == 31) {
                        var6 -= 2;
                        if (class37.field555[var6] <= class37.field555[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var497 == 32) {
                        var6 -= 2;
                        if (class37.field555[var6 + 1] <= class37.field555[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var497 == 33) {
                        class37.field555[var6++] = class61.field972[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var497 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class61.field972[var10001] = class37.field555[var6];
                        continue;
                    }
                    if (var497 == 35) {
                        class22.field285[var7++] = class269.field4209[var10[var8]];
                        continue;
                    }
                    if (var497 == 36) {
                        var10001 = var10[var8];
                        var7--;
                        class269.field4209[var10001] = class22.field285[var7];
                        continue;
                    }
                    if (var497 == 37) {
                        int var24 = var10[var8];
                        var7 -= var24;
                        String var25 = class154.method1044(class22.field285, -1358, var7, var24);
                        class22.field285[var7++] = var25;
                        continue;
                    }
                    if (var497 == 38) {
                        var6--;
                        continue;
                    }
                    if (var497 == 39) {
                        var7--;
                        continue;
                    }
                    if (var497 == 40) {
                        int var26 = var10[var8];
                        class25 var27 = class34.method236(var26, -32);
                        int[] var28 = new int[var27.field326];
                        String[] var29 = new String[var27.field329];
                        for (int var30 = 0; var30 < var27.field333; var30++) {
                            var28[var30] = class37.field555[var6 + var30 - var27.field333];
                        }
                        for (int var31 = 0; var31 < var27.field337; var31++) {
                            var29[var31] = class22.field285[var31 + var7 - var27.field337];
                        }
                        var7 -= var27.field337;
                        var6 -= var27.field333;
                        class142 var32 = new class142();
                        var32.field2052 = class61.field972;
                        var32.field2058 = class269.field4209;
                        var32.field2054 = var5;
                        var32.field2053 = var8;
                        if (class52.field761 >= class48.field685.length) {
                            throw new RuntimeException();
                        }
                        var8 = -1;
                        class48.field685[class52.field761++] = var32;
                        var5 = var27;
                        var10 = var27.field328;
                        var9 = var27.field325;
                        class269.field4209 = var29;
                        class61.field972 = var28;
                        continue;
                    }
                    if (var497 == 42) {
                        class37.field555[var6++] = class210.field3026[var10[var8]];
                        continue;
                    }
                    if (var497 == 43) {
                        int var33 = var10[var8];
                        var6--;
                        class210.field3026[var33] = class37.field555[var6];
                        class20.method154(var33, 16);
                        continue;
                    }
                    if (var497 == 44) {
                        int var34 = var10[var8] >> 16;
                        var6--;
                        int var35 = class37.field555[var6];
                        int var36 = var10[var8] & 0xFFFF;
                        if (var35 >= 0 && var35 <= 5000) {
                            class48.field677[var34] = var35;
                            byte var37 = -1;
                            if (var36 == 105) {
                                var37 = 0;
                            }
                            int var38 = 0;
                            while (true) {
                                if (var38 >= var35) {
                                    continue label3885;
                                }
                                class70.field1095[var34][var38] = var37;
                                var38++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var497 == 45) {
                        int var39 = var10[var8];
                        var6--;
                        int var40 = class37.field555[var6];
                        if (var40 >= 0 && var40 < class48.field677[var39]) {
                            class37.field555[var6++] = class70.field1095[var39][var40];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var497 == 46) {
                        var6 -= 2;
                        int var41 = var10[var8];
                        int var42 = class37.field555[var6];
                        if (var42 >= 0 && var42 < class48.field677[var41]) {
                            class70.field1095[var41][var42] = class37.field555[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var497 == 47) {
                        String var43 = class233.field3487[var10[var8]];
                        if (var43 == null) {
                            var43 = "null";
                        }
                        class22.field285[var7++] = var43;
                        continue;
                    }
                    if (var497 == 48) {
                        int var44 = var10[var8];
                        var7--;
                        class233.field3487[var44] = class22.field285[var7];
                        class210.method1344(var44, true);
                        continue;
                    }
                    if (var497 == 51) {
                        class190 var45 = var5.field343[var10[var8]];
                        var6--;
                        class64 var46 = (class64) var45.method1218((long) class37.field555[var6], -45);
                        if (var46 != null) {
                            var8 += var46.field1015;
                        }
                        continue;
                    }
                }
                boolean var47;
                if (var10[var8] == 1) {
                    var47 = true;
                } else {
                    var47 = false;
                }
                if (var497 < 300) {
                    if (var497 == 100) {
                        var6 -= 3;
                        int var477 = class37.field555[var6 + 1];
                        int var478 = class37.field555[var6];
                        int var479 = class37.field555[var6 + 2];
                        if (var477 == 0) {
                            throw new RuntimeException();
                        }
                        class267 var480 = class282.method1897(var478, 57);
                        if (var480.field4160 == null) {
                            var480.field4160 = new class267[var479 + 1];
                        }
                        if (var479 >= var480.field4160.length) {
                            class267[] var481 = new class267[var479 + 1];
                            for (int var482 = 0; var482 < var480.field4160.length; var482++) {
                                var481[var482] = var480.field4160[var482];
                            }
                            var480.field4160 = var481;
                        }
                        if (var479 > 0 && var480.field4160[var479 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var479 - 1));
                        }
                        class267 var483 = new class267();
                        var483.field4039 = true;
                        var483.field4058 = var479;
                        var483.field4149 = var477;
                        var483.field4139 = var483.field4113 = var480.field4113;
                        var480.field4160[var479] = var483;
                        if (var47) {
                            class78.field1210 = var483;
                        } else {
                            class267.field4094 = var483;
                        }
                        class217.method1396(false, var480);
                        continue;
                    }
                    if (var497 == 101) {
                        class267 var484 = var47 ? class78.field1210 : class267.field4094;
                        if (var484.field4058 == -1) {
                            if (var47) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class267 var485 = class282.method1897(var484.field4113, 118);
                        var485.field4160[var484.field4058] = null;
                        class217.method1396(false, var485);
                        continue;
                    }
                    if (var497 == 102) {
                        var6--;
                        class267 var486 = class282.method1897(class37.field555[var6], 86);
                        var486.field4160 = null;
                        class217.method1396(false, var486);
                        continue;
                    }
                    if (var497 == 200) {
                        var6 -= 2;
                        int var487 = class37.field555[var6];
                        int var488 = class37.field555[var6 + 1];
                        class267 var489 = class22.method165(var488, false, var487);
                        if (var489 != null && var488 != -1) {
                            class37.field555[var6++] = 1;
                            if (var47) {
                                class78.field1210 = var489;
                            } else {
                                class267.field4094 = var489;
                            }
                            continue;
                        }
                        class37.field555[var6++] = 0;
                        continue;
                    }
                    if (var497 == 201) {
                        var6--;
                        int var490 = class37.field555[var6];
                        class267 var491 = class282.method1897(var490, 51);
                        if (var491 == null) {
                            class37.field555[var6++] = 0;
                        } else {
                            class37.field555[var6++] = 1;
                            if (var47) {
                                class78.field1210 = var491;
                            } else {
                                class267.field4094 = var491;
                            }
                        }
                        continue;
                    }
                } else if (var497 < 500) {
                    if (var497 == 403) {
                        var6 -= 2;
                        int var470 = class37.field555[var6 + 1];
                        int var471 = class37.field555[var6];
                        for (int var472 = 0; var472 < class262.field3952.length; var472++) {
                            if (class262.field3952[var472] == var471) {
                                class55.field847.field765.method1410(0, var472, var470);
                                continue label3885;
                            }
                        }
                        int var473 = 0;
                        while (true) {
                            if (class109.field1566.length <= var473) {
                                continue label3885;
                            }
                            if (class109.field1566[var473] == var471) {
                                class55.field847.field765.method1410(0, var473, var470);
                                continue label3885;
                            }
                            var473++;
                        }
                    }
                    if (var497 == 404) {
                        var6 -= 2;
                        int var474 = class37.field555[var6];
                        int var475 = class37.field555[var6 + 1];
                        class55.field847.field765.method1414(var475, var474, 107);
                        continue;
                    }
                    if (var497 == 410) {
                        var6--;
                        boolean var476 = class37.field555[var6] != 0;
                        class55.field847.field765.method1418(5, var476);
                        continue;
                    }
                } else if (!(var497 < 1000 || var497 >= 1100) || !(var497 < 2000 || var497 >= 2100)) {
                    class267 var48;
                    if (var497 >= 2000) {
                        var6--;
                        var48 = class282.method1897(class37.field555[var6], 51);
                        var497 -= 1000;
                    } else {
                        var48 = var47 ? class78.field1210 : class267.field4094;
                    }
                    if (var497 == 1000) {
                        var6 -= 4;
                        var48.field4062 = class37.field555[var6];
                        var48.field4153 = class37.field555[var6 + 1];
                        int var49 = class37.field555[var6 + 3];
                        if (var49 < 0) {
                            var49 = 0;
                        } else if (var49 > 5) {
                            var49 = 5;
                        }
                        int var50 = class37.field555[var6 + 2];
                        if (var50 < 0) {
                            var50 = 0;
                        } else if (var50 > 5) {
                            var50 = 5;
                        }
                        var48.field4080 = (byte) var49;
                        var48.field4112 = (byte) var50;
                        class217.method1396(false, var48);
                        class25.method182((byte) 123, var48);
                        if (var48.field4058 == -1) {
                            class64.method445(var48.field4113, 77);
                        }
                        continue;
                    }
                    if (var497 == 1001) {
                        var6 -= 4;
                        var48.field4187 = class37.field555[var6];
                        var48.field4105 = class37.field555[var6 + 1];
                        var48.field4141 = 0;
                        var48.field4123 = 0;
                        int var51 = class37.field555[var6 + 2];
                        if (var51 < 0) {
                            var51 = 0;
                        } else if (var51 > 4) {
                            var51 = 4;
                        }
                        int var52 = class37.field555[var6 + 3];
                        var48.field4144 = (byte) var51;
                        if (var52 < 0) {
                            var52 = 0;
                        } else if (var52 > 4) {
                            var52 = 4;
                        }
                        var48.field4032 = (byte) var52;
                        class217.method1396(false, var48);
                        class25.method182((byte) 126, var48);
                        if (var48.field4149 == 0) {
                            class130.method897(-501, var48, false);
                        }
                        continue;
                    }
                    if (var497 == 1003) {
                        var6--;
                        boolean var53 = class37.field555[var6] == 1;
                        if (var48.field4023 != var53) {
                            var48.field4023 = var53;
                            class217.method1396(false, var48);
                        }
                        if (var48.field4058 == -1) {
                            class283.method1904(var48.field4113, -87);
                        }
                        continue;
                    }
                    if (var497 == 1004) {
                        var6 -= 2;
                        var48.field4077 = class37.field555[var6];
                        var48.field4119 = class37.field555[var6 + 1];
                        class217.method1396(false, var48);
                        class25.method182((byte) 123, var48);
                        if (var48.field4149 == 0) {
                            class130.method897(-501, var48, false);
                        }
                        continue;
                    }
                    if (var497 == 1005) {
                        var6--;
                        var48.field4049 = class37.field555[var6] == 1;
                        continue;
                    }
                } else if (var497 >= 1100 && var497 < 1200 || var497 >= 2100 && var497 < 2200) {
                    class267 var467;
                    if (var497 >= 2000) {
                        var6--;
                        var467 = class282.method1897(class37.field555[var6], 99);
                        var497 -= 1000;
                    } else {
                        var467 = var47 ? class78.field1210 : class267.field4094;
                    }
                    if (var497 == 1100) {
                        var6 -= 2;
                        var467.field4059 = class37.field555[var6];
                        if (var467.field4152 - var467.field4177 < var467.field4059) {
                            var467.field4059 = var467.field4152 - var467.field4177;
                        }
                        if (var467.field4059 < 0) {
                            var467.field4059 = 0;
                        }
                        var467.field4140 = class37.field555[var6 + 1];
                        if (var467.field4140 > (var467.field4134 - var467.field4051)) {
                            var467.field4140 = var467.field4134 - var467.field4051;
                        }
                        if (var467.field4140 < 0) {
                            var467.field4140 = 0;
                        }
                        class217.method1396(false, var467);
                        if (var467.field4058 == -1) {
                            class48.method322(var467.field4113, 12);
                        }
                        continue;
                    }
                    if (var497 == 1101) {
                        var6--;
                        var467.field4084 = class37.field555[var6];
                        class217.method1396(false, var467);
                        if (var467.field4058 == -1) {
                            class263.method1747(var467.field4113, (byte) -62);
                        }
                        continue;
                    }
                    if (var497 == 1102) {
                        var6--;
                        var467.field4109 = class37.field555[var6] == 1;
                        class217.method1396(false, var467);
                        continue;
                    }
                    if (var497 == 1103) {
                        var6--;
                        var467.field4102 = class37.field555[var6];
                        class217.method1396(false, var467);
                        continue;
                    }
                    if (var497 == 1104) {
                        var6--;
                        var467.field4181 = class37.field555[var6];
                        class217.method1396(false, var467);
                        continue;
                    }
                    if (var497 == 1105) {
                        var6--;
                        var467.field4186 = class37.field555[var6];
                        class217.method1396(false, var467);
                        continue;
                    }
                    if (var497 == 1106) {
                        var6--;
                        var467.field4071 = class37.field555[var6];
                        class217.method1396(false, var467);
                        continue;
                    }
                    if (var497 == 1107) {
                        var6--;
                        var467.field4072 = class37.field555[var6] == 1;
                        class217.method1396(false, var467);
                        continue;
                    }
                    if (var497 == 1108) {
                        var467.field4057 = 1;
                        var6--;
                        var467.field4038 = class37.field555[var6];
                        class217.method1396(false, var467);
                        if (var467.field4058 == -1) {
                            class7.method80(15, var467.field4113);
                        }
                        continue;
                    }
                    if (var497 == 1109) {
                        var6 -= 6;
                        var467.field4041 = class37.field555[var6];
                        var467.field4076 = class37.field555[var6 + 1];
                        var467.field4097 = class37.field555[var6 + 2];
                        var467.field4155 = class37.field555[var6 + 3];
                        var467.field4054 = class37.field555[var6 + 4];
                        var467.field4135 = class37.field555[var6 + 5];
                        class217.method1396(false, var467);
                        if (var467.field4058 == -1) {
                            class5.method59(var467.field4113, 0);
                            class221.method1420(var467.field4113, false);
                        }
                        continue;
                    }
                    if (var497 == 1110) {
                        var6--;
                        int var468 = class37.field555[var6];
                        if (var467.field4120 != var468) {
                            var467.field4190 = 1;
                            var467.field4120 = var468;
                            var467.field4126 = 0;
                            var467.field4115 = 0;
                            class217.method1396(false, var467);
                        }
                        if (var467.field4058 == -1) {
                            class250.method1643(var467.field4113, -4);
                        }
                        continue;
                    }
                    if (var497 == 1111) {
                        var6--;
                        var467.field4022 = class37.field555[var6] == 1;
                        class217.method1396(false, var467);
                        continue;
                    }
                    if (var497 == 1112) {
                        var7--;
                        String var469 = class22.field285[var7];
                        if (!var469.equals(var467.field4156)) {
                            var467.field4156 = var469;
                            class217.method1396(false, var467);
                        }
                        if (var467.field4058 == -1) {
                            class101.method674(var467.field4113, -1694);
                        }
                        continue;
                    }
                    if (var497 == 1113) {
                        var6--;
                        var467.field4056 = class37.field555[var6];
                        class217.method1396(false, var467);
                        continue;
                    }
                    if (var497 == 1114) {
                        var6 -= 3;
                        var467.field4114 = class37.field555[var6];
                        var467.field4047 = class37.field555[var6 + 1];
                        var467.field4073 = class37.field555[var6 + 2];
                        class217.method1396(false, var467);
                        continue;
                    }
                    if (var497 == 1115) {
                        var6--;
                        var467.field4030 = class37.field555[var6] == 1;
                        class217.method1396(false, var467);
                        continue;
                    }
                    if (var497 == 1116) {
                        var6--;
                        var467.field4137 = class37.field555[var6];
                        class217.method1396(false, var467);
                        continue;
                    }
                    if (var497 == 1117) {
                        var6--;
                        var467.field4175 = class37.field555[var6];
                        class217.method1396(false, var467);
                        continue;
                    }
                    if (var497 == 1118) {
                        var6--;
                        var467.field4125 = class37.field555[var6] == 1;
                        class217.method1396(false, var467);
                        continue;
                    }
                    if (var497 == 1119) {
                        var6--;
                        var467.field4066 = class37.field555[var6] == 1;
                        class217.method1396(false, var467);
                        continue;
                    }
                    if (var497 == 1120) {
                        var6 -= 2;
                        var467.field4152 = class37.field555[var6];
                        var467.field4134 = class37.field555[var6 + 1];
                        class217.method1396(false, var467);
                        if (var467.field4149 == 0) {
                            class130.method897(-501, var467, false);
                        }
                        continue;
                    }
                    if (var497 == 1121) {
                        var6 -= 2;
                        class217.method1396(false, var467);
                        continue;
                    }
                    if (var497 == 1122) {
                        var6--;
                        var467.field4055 = class37.field555[var6] == 1;
                        class217.method1396(false, var467);
                        continue;
                    }
                    if (var497 == 1123) {
                        var6--;
                        var467.field4135 = class37.field555[var6];
                        class217.method1396(false, var467);
                        if (var467.field4058 == -1) {
                            class5.method59(var467.field4113, 0);
                        }
                        continue;
                    }
                } else if (var497 >= 1200 && var497 < 1300 || var497 >= 2200 && var497 < 2300) {
                    class267 var54;
                    if (var497 >= 2000) {
                        var6--;
                        var54 = class282.method1897(class37.field555[var6], 64);
                        var497 -= 1000;
                    } else {
                        var54 = var47 ? class78.field1210 : class267.field4094;
                    }
                    class217.method1396(false, var54);
                    if (var497 == 1200 || var497 == 1205) {
                        var6 -= 2;
                        int var55 = class37.field555[var6];
                        int var56 = class37.field555[var6 + 1];
                        if (var54.field4058 == -1) {
                            class268.method1795(-52, var54.field4113);
                            class5.method59(var54.field4113, 0);
                            class221.method1420(var54.field4113, false);
                        }
                        if (var55 == -1) {
                            var54.field4038 = -1;
                            var54.field4057 = 1;
                            var54.field4185 = -1;
                        } else {
                            var54.field4185 = var55;
                            var54.field4100 = var56;
                            class273 var57 = class259.method1735(var55, -14667);
                            var54.field4076 = var57.field4363;
                            if (var497 == 1205) {
                                var54.field4033 = false;
                            } else {
                                var54.field4033 = true;
                            }
                            var54.field4097 = var57.field4394;
                            var54.field4155 = var57.field4333;
                            var54.field4041 = var57.field4390;
                            var54.field4054 = var57.field4321;
                            var54.field4135 = var57.field4359;
                            if (var54.field4123 > 0) {
                                var54.field4135 = var54.field4135 * 32 / var54.field4123;
                            } else if (var54.field4187 > 0) {
                                var54.field4135 = var54.field4135 * 32 / var54.field4187;
                            }
                        }
                        continue;
                    }
                    if (var497 == 1201) {
                        var54.field4057 = 2;
                        var6--;
                        var54.field4038 = class37.field555[var6];
                        if (var54.field4058 == -1) {
                            class7.method80(15, var54.field4113);
                        }
                        continue;
                    }
                    if (var497 == 1202) {
                        var54.field4057 = 3;
                        var54.field4038 = class55.field847.field765.method1415((byte) -126);
                        if (var54.field4058 == -1) {
                            class7.method80(15, var54.field4113);
                        }
                        continue;
                    }
                    if (var497 == 1203) {
                        var54.field4057 = 6;
                        var6--;
                        var54.field4038 = class37.field555[var6];
                        if (var54.field4058 == -1) {
                            class7.method80(15, var54.field4113);
                        }
                        continue;
                    }
                    if (var497 == 1204) {
                        var54.field4057 = 5;
                        var6--;
                        var54.field4038 = class37.field555[var6];
                        if (var54.field4058 == -1) {
                            class7.method80(15, var54.field4113);
                        }
                        continue;
                    }
                } else if ((var497 < 1300 || var497 >= 1400) && (var497 < 2300 || var497 >= 2400)) {
                    if (var497 >= 1400 && var497 < 1500 || var497 >= 2400 && var497 < 2500) {
                        class267 var64;
                        if (var497 >= 2000) {
                            var6--;
                            var64 = class282.method1897(class37.field555[var6], 126);
                            var497 -= 1000;
                        } else {
                            var64 = var47 ? class78.field1210 : class267.field4094;
                        }
                        var7--;
                        String var65 = class22.field285[var7];
                        int[] var66 = null;
                        if (var65.length() > 0 && var65.charAt(var65.length() - 1) == 'Y') {
                            var6--;
                            int var67 = class37.field555[var6];
                            if (var67 > 0) {
                                var66 = new int[var67];
                                while ((var67--) > 0) {
                                    var6--;
                                    var66[var67] = class37.field555[var6];
                                }
                            }
                            var65 = var65.substring(0, var65.length() - 1);
                        }
                        Object[] var68 = new Object[var65.length() + 1];
                        for (int var69 = var68.length - 1; var69 >= 1; var69--) {
                            if (var65.charAt(var69 - 1) == 's') {
                                var7--;
                                var68[var69] = class22.field285[var7];
                            } else {
                                var6--;
                                var68[var69] = Integer.valueOf(class37.field555[var6]);
                            }
                        }
                        var6--;
                        int var70 = class37.field555[var6];
                        if (var70 == -1) {
                            var68 = null;
                        } else {
                            var68[0] = Integer.valueOf(var70);
                        }
                        var64.field4027 = true;
                        if (var497 == 1400) {
                            var64.field4128 = var68;
                        } else if (var497 == 1401) {
                            var64.field4083 = var68;
                        } else if (var497 == 1402) {
                            var64.field4099 = var68;
                        } else if (var497 == 1403) {
                            var64.field4168 = var68;
                        } else if (var497 == 1404) {
                            var64.field4101 = var68;
                        } else if (var497 == 1405) {
                            var64.field4040 = var68;
                        } else if (var497 == 1406) {
                            var64.field4154 = var68;
                        } else if (var497 == 1407) {
                            var64.field4085 = var68;
                            var64.field4025 = var66;
                        } else if (var497 == 1408) {
                            var64.field4088 = var68;
                        } else if (var497 == 1409) {
                            var64.field4147 = var68;
                        } else if (var497 == 1410) {
                            var64.field4133 = var68;
                        } else if (var497 == 1411) {
                            var64.field4029 = var68;
                        } else if (var497 == 1412) {
                            var64.field4166 = var68;
                        } else if (var497 == 1414) {
                            var64.field4024 = var68;
                            var64.field4044 = var66;
                        } else if (var497 == 1415) {
                            var64.field4145 = var66;
                            var64.field4069 = var68;
                        } else if (var497 == 1416) {
                            var64.field4042 = var68;
                        } else if (var497 == 1417) {
                            var64.field4130 = var68;
                        } else if (var497 == 1418) {
                            var64.field4189 = var68;
                        } else if (var497 == 1419) {
                            var64.field4183 = var68;
                        } else if (var497 == 1420) {
                            var64.field4182 = var68;
                        } else if (var497 == 1421) {
                            var64.field4078 = var68;
                        } else if (var497 == 1422) {
                            var64.field4180 = var68;
                        } else if (var497 == 1423) {
                            var64.field4164 = var68;
                        } else if (var497 == 1424) {
                            var64.field4087 = var68;
                        } else if (var497 == 1425) {
                            var64.field4171 = var68;
                        } else if (var497 == 1426) {
                            var64.field4034 = var68;
                        } else if (var497 == 1427) {
                            var64.field4079 = var68;
                        } else if (var497 == 1428) {
                            var64.field4117 = var68;
                            var64.field4146 = var66;
                        } else if (var497 == 1429) {
                            var64.field4116 = var66;
                            var64.field4176 = var68;
                        }
                        continue;
                    }
                    if (var497 < 1600) {
                        class267 var466 = var47 ? class78.field1210 : class267.field4094;
                        if (var497 == 1500) {
                            class37.field555[var6++] = var466.field4173;
                            continue;
                        }
                        if (var497 == 1501) {
                            class37.field555[var6++] = var466.field4035;
                            continue;
                        }
                        if (var497 == 1502) {
                            class37.field555[var6++] = var466.field4177;
                            continue;
                        }
                        if (var497 == 1503) {
                            class37.field555[var6++] = var466.field4051;
                            continue;
                        }
                        if (var497 == 1504) {
                            class37.field555[var6++] = var466.field4023 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 1505) {
                            class37.field555[var6++] = var466.field4139;
                            continue;
                        }
                    } else if (var497 < 1700) {
                        class267 var71 = var47 ? class78.field1210 : class267.field4094;
                        if (var497 == 1600) {
                            class37.field555[var6++] = var71.field4059;
                            continue;
                        }
                        if (var497 == 1601) {
                            class37.field555[var6++] = var71.field4140;
                            continue;
                        }
                        if (var497 == 1602) {
                            class22.field285[var7++] = var71.field4156;
                            continue;
                        }
                        if (var497 == 1603) {
                            class37.field555[var6++] = var71.field4152;
                            continue;
                        }
                        if (var497 == 1604) {
                            class37.field555[var6++] = var71.field4134;
                            continue;
                        }
                        if (var497 == 1605) {
                            class37.field555[var6++] = var71.field4135;
                            continue;
                        }
                        if (var497 == 1606) {
                            class37.field555[var6++] = var71.field4097;
                            continue;
                        }
                        if (var497 == 1607) {
                            class37.field555[var6++] = var71.field4054;
                            continue;
                        }
                        if (var497 == 1608) {
                            class37.field555[var6++] = var71.field4155;
                            continue;
                        }
                        if (var497 == 1609) {
                            class37.field555[var6++] = var71.field4102;
                            continue;
                        }
                        if (var497 == 1610) {
                            class37.field555[var6++] = var71.field4041;
                            continue;
                        }
                        if (var497 == 1611) {
                            class37.field555[var6++] = var71.field4076;
                            continue;
                        }
                        if (var497 == 1612) {
                            class37.field555[var6++] = var71.field4186;
                            continue;
                        }
                    } else if (var497 < 1800) {
                        class267 var72 = var47 ? class78.field1210 : class267.field4094;
                        if (var497 == 1700) {
                            class37.field555[var6++] = var72.field4185;
                            continue;
                        }
                        if (var497 == 1701) {
                            if (var72.field4185 == -1) {
                                class37.field555[var6++] = 0;
                            } else {
                                class37.field555[var6++] = var72.field4100;
                            }
                            continue;
                        }
                        if (var497 == 1702) {
                            class37.field555[var6++] = var72.field4058;
                            continue;
                        }
                    } else if (var497 < 1900) {
                        class267 var464 = var47 ? class78.field1210 : class267.field4094;
                        if (var497 == 1800) {
                            class37.field555[var6++] = client.method1439(var464).method626((byte) 107);
                            continue;
                        }
                        if (var497 == 1801) {
                            var6--;
                            int var465 = class37.field555[var6];
                            int var499 = var465 - 1;
                            if (var464.field4108 != null && var499 < var464.field4108.length && var464.field4108[var499] != null) {
                                class22.field285[var7++] = var464.field4108[var499];
                                continue;
                            }
                            class22.field285[var7++] = "";
                            continue;
                        }
                        if (var497 == 1802) {
                            if (var464.field4093 == null) {
                                class22.field285[var7++] = "";
                            } else {
                                class22.field285[var7++] = var464.field4093;
                            }
                            continue;
                        }
                    } else if (var497 < 2600) {
                        var6--;
                        class267 var73 = class282.method1897(class37.field555[var6], 61);
                        if (var497 == 2500) {
                            class37.field555[var6++] = var73.field4173;
                            continue;
                        }
                        if (var497 == 2501) {
                            class37.field555[var6++] = var73.field4035;
                            continue;
                        }
                        if (var497 == 2502) {
                            class37.field555[var6++] = var73.field4177;
                            continue;
                        }
                        if (var497 == 2503) {
                            class37.field555[var6++] = var73.field4051;
                            continue;
                        }
                        if (var497 == 2504) {
                            class37.field555[var6++] = var73.field4023 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 2505) {
                            class37.field555[var6++] = var73.field4139;
                            continue;
                        }
                    } else if (var497 < 2700) {
                        var6--;
                        class267 var463 = class282.method1897(class37.field555[var6], 63);
                        if (var497 == 2600) {
                            class37.field555[var6++] = var463.field4059;
                            continue;
                        }
                        if (var497 == 2601) {
                            class37.field555[var6++] = var463.field4140;
                            continue;
                        }
                        if (var497 == 2602) {
                            class22.field285[var7++] = var463.field4156;
                            continue;
                        }
                        if (var497 == 2603) {
                            class37.field555[var6++] = var463.field4152;
                            continue;
                        }
                        if (var497 == 2604) {
                            class37.field555[var6++] = var463.field4134;
                            continue;
                        }
                        if (var497 == 2605) {
                            class37.field555[var6++] = var463.field4135;
                            continue;
                        }
                        if (var497 == 2606) {
                            class37.field555[var6++] = var463.field4097;
                            continue;
                        }
                        if (var497 == 2607) {
                            class37.field555[var6++] = var463.field4054;
                            continue;
                        }
                        if (var497 == 2608) {
                            class37.field555[var6++] = var463.field4155;
                            continue;
                        }
                        if (var497 == 2609) {
                            class37.field555[var6++] = var463.field4102;
                            continue;
                        }
                        if (var497 == 2610) {
                            class37.field555[var6++] = var463.field4041;
                            continue;
                        }
                        if (var497 == 2611) {
                            class37.field555[var6++] = var463.field4076;
                            continue;
                        }
                        if (var497 == 2612) {
                            class37.field555[var6++] = var463.field4186;
                            continue;
                        }
                    } else if (var497 < 2800) {
                        if (var497 == 2700) {
                            var6--;
                            class267 var453 = class282.method1897(class37.field555[var6], 71);
                            class37.field555[var6++] = var453.field4185;
                            continue;
                        }
                        if (var497 == 2701) {
                            var6--;
                            class267 var454 = class282.method1897(class37.field555[var6], 105);
                            if (var454.field4185 == -1) {
                                class37.field555[var6++] = 0;
                            } else {
                                class37.field555[var6++] = var454.field4100;
                            }
                            continue;
                        }
                        if (var497 == 2702) {
                            var6--;
                            int var455 = class37.field555[var6];
                            class261 var456 = (class261) class128.field1874.method1218((long) var455, -11);
                            if (var456 == null) {
                                class37.field555[var6++] = 0;
                            } else {
                                class37.field555[var6++] = 1;
                            }
                            continue;
                        }
                        if (var497 == 2703) {
                            var6--;
                            class267 var457 = class282.method1897(class37.field555[var6], 107);
                            if (var457.field4160 == null) {
                                class37.field555[var6++] = 0;
                                continue;
                            }
                            int var458 = var457.field4160.length;
                            for (int var459 = 0; var459 < var457.field4160.length; var459++) {
                                if (var457.field4160[var459] == null) {
                                    var458 = var459;
                                    break;
                                }
                            }
                            class37.field555[var6++] = var458;
                            continue;
                        }
                        if (var497 == 2704 || var497 == 2705) {
                            var6 -= 2;
                            int var460 = class37.field555[var6 + 1];
                            int var461 = class37.field555[var6];
                            class261 var462 = (class261) class128.field1874.method1218((long) var461, 3);
                            if (var462 != null && var462.field3940 == var460) {
                                class37.field555[var6++] = 1;
                                continue;
                            }
                            class37.field555[var6++] = 0;
                            continue;
                        }
                    } else if (var497 < 2900) {
                        var6--;
                        class267 var74 = class282.method1897(class37.field555[var6], 76);
                        if (var497 == 2800) {
                            class37.field555[var6++] = client.method1439(var74).method626((byte) 107);
                            continue;
                        }
                        if (var497 == 2801) {
                            var6--;
                            int var75 = class37.field555[var6];
                            int var498 = var75 - 1;
                            if (var74.field4108 != null && var74.field4108.length > var498 && var74.field4108[var498] != null) {
                                class22.field285[var7++] = var74.field4108[var498];
                                continue;
                            }
                            class22.field285[var7++] = "";
                            continue;
                        }
                        if (var497 == 2802) {
                            if (var74.field4093 == null) {
                                class22.field285[var7++] = "";
                            } else {
                                class22.field285[var7++] = var74.field4093;
                            }
                            continue;
                        }
                    } else if (var497 < 3200) {
                        if (var497 == 3100) {
                            var7--;
                            String var438 = class22.field285[var7];
                            class255.method1712((byte) 72, var438, 0, "");
                            continue;
                        }
                        if (var497 == 3101) {
                            var6 -= 2;
                            class162.method1091((byte) 87, class37.field555[var6], class37.field555[var6 + 1], class55.field847);
                            continue;
                        }
                        if (var497 == 3103) {
                            class173.method1140(false);
                            continue;
                        }
                        if (var497 == 3104) {
                            class64.field1017++;
                            int var439 = 0;
                            var7--;
                            String var440 = class22.field285[var7];
                            if (class99.method665(var440, 100)) {
                                var439 = class16.method124((byte) 19, var440);
                            }
                            class95.field1451.method522(111, 28727);
                            class95.field1451.method737(-2645, var439);
                            continue;
                        }
                        if (var497 == 3105) {
                            var7--;
                            String var441 = class22.field285[var7];
                            class95.field1451.method522(254, 28727);
                            class95.field1451.method765(532401312, class109.method712((byte) -4, var441));
                            class72.field1117++;
                            continue;
                        }
                        if (var497 == 3106) {
                            class289.field4569++;
                            var7--;
                            String var442 = class22.field285[var7];
                            class95.field1451.method522(124, 28727);
                            class95.field1451.method775(var442.length() + 1, -114);
                            class95.field1451.method734((byte) 79, var442);
                            continue;
                        }
                        if (var497 == 3107) {
                            var6--;
                            int var443 = class37.field555[var6];
                            var7--;
                            String var444 = class22.field285[var7];
                            class248.method1632(var444, var443, 14);
                            continue;
                        }
                        if (var497 == 3108) {
                            var6 -= 3;
                            int var445 = class37.field555[var6];
                            int var446 = class37.field555[var6 + 1];
                            int var447 = class37.field555[var6 + 2];
                            class267 var448 = class282.method1897(var447, 79);
                            class263.method1752(var445, var446, var448, (byte) -127);
                            continue;
                        }
                        if (var497 == 3109) {
                            var6 -= 2;
                            int var449 = class37.field555[var6];
                            int var450 = class37.field555[var6 + 1];
                            class267 var451 = var47 ? class78.field1210 : class267.field4094;
                            class263.method1752(var449, var450, var451, (byte) -128);
                            continue;
                        }
                        if (var497 == 3110) {
                            class195.field2803++;
                            var6--;
                            int var452 = class37.field555[var6];
                            class95.field1451.method522(27, 28727);
                            class95.field1451.method794(var452, (byte) -83);
                            continue;
                        }
                    } else if (var497 < 3300) {
                        if (var497 == 3200) {
                            var6 -= 3;
                            class205.method1322(0, class37.field555[var6], class37.field555[var6 + 1], class37.field555[var6 + 2]);
                            continue;
                        }
                        if (var497 == 3201) {
                            var6--;
                            class206.method1329(class37.field555[var6], true);
                            continue;
                        }
                        if (var497 == 3202) {
                            var6 -= 2;
                            class193.method1237(class37.field555[var6 + 1], (byte) 59, class37.field555[var6]);
                            continue;
                        }
                    } else if (var497 < 3400) {
                        if (var497 == 3300) {
                            class37.field555[var6++] = class82.field1267;
                            continue;
                        }
                        if (var497 == 3301) {
                            var6 -= 2;
                            int var404 = class37.field555[var6];
                            int var405 = class37.field555[var6 + 1];
                            class37.field555[var6++] = class17.method125((byte) -118, var404, var405);
                            continue;
                        }
                        if (var497 == 3302) {
                            var6 -= 2;
                            int var406 = class37.field555[var6];
                            int var407 = class37.field555[var6 + 1];
                            class37.field555[var6++] = class21.method159(var406, var407, true);
                            continue;
                        }
                        if (var497 == 3303) {
                            var6 -= 2;
                            int var408 = class37.field555[var6];
                            int var409 = class37.field555[var6 + 1];
                            class37.field555[var6++] = class151.method1021(17583, var409, var408);
                            continue;
                        }
                        if (var497 == 3304) {
                            var6--;
                            int var410 = class37.field555[var6];
                            class37.field555[var6++] = class228.method1489((byte) -56, var410).field2619;
                            continue;
                        }
                        if (var497 == 3305) {
                            var6--;
                            int var411 = class37.field555[var6];
                            class37.field555[var6++] = class70.field1093[var411];
                            continue;
                        }
                        if (var497 == 3306) {
                            var6--;
                            int var412 = class37.field555[var6];
                            class37.field555[var6++] = class274.field4400[var412];
                            continue;
                        }
                        if (var497 == 3307) {
                            var6--;
                            int var413 = class37.field555[var6];
                            class37.field555[var6++] = class180.field2571[var413];
                            continue;
                        }
                        if (var497 == 3308) {
                            int var414 = class163.field2364;
                            int var415 = (class55.field847.field45 >> 7) + class113.field1615;
                            int var416 = (class55.field847.field94 >> 7) + class95.field1445;
                            class37.field555[var6++] = (var414 << 28) + (var415 << 14) + var416;
                            continue;
                        }
                        if (var497 == 3309) {
                            var6--;
                            int var417 = class37.field555[var6];
                            class37.field555[var6++] = class184.method1188(268427674, var417) >> 14;
                            continue;
                        }
                        if (var497 == 3310) {
                            var6--;
                            int var418 = class37.field555[var6];
                            class37.field555[var6++] = var418 >> 28;
                            continue;
                        }
                        if (var497 == 3311) {
                            var6--;
                            int var419 = class37.field555[var6];
                            class37.field555[var6++] = class184.method1188(16383, var419);
                            continue;
                        }
                        if (var497 == 3312) {
                            class37.field555[var6++] = class77.field1186 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 3313) {
                            var6 -= 2;
                            int var420 = class37.field555[var6] + 32768;
                            int var421 = class37.field555[var6 + 1];
                            class37.field555[var6++] = class17.method125((byte) -118, var420, var421);
                            continue;
                        }
                        if (var497 == 3314) {
                            var6 -= 2;
                            int var422 = class37.field555[var6] + 32768;
                            int var423 = class37.field555[var6 + 1];
                            class37.field555[var6++] = class21.method159(var422, var423, true);
                            continue;
                        }
                        if (var497 == 3315) {
                            var6 -= 2;
                            int var424 = class37.field555[var6] + 32768;
                            int var425 = class37.field555[var6 + 1];
                            class37.field555[var6++] = class151.method1021(17583, var425, var424);
                            continue;
                        }
                        if (var497 == 3316) {
                            if (class270.field4228 >= 2) {
                                class37.field555[var6++] = class270.field4228;
                            } else {
                                class37.field555[var6++] = 0;
                            }
                            continue;
                        }
                        if (var497 == 3317) {
                            class37.field555[var6++] = class234.field3536;
                            continue;
                        }
                        if (var497 == 3318) {
                            class37.field555[var6++] = class29.field415;
                            continue;
                        }
                        if (var497 == 3321) {
                            class37.field555[var6++] = class221.field3277;
                            continue;
                        }
                        if (var497 == 3322) {
                            class37.field555[var6++] = class118.field1735;
                            continue;
                        }
                        if (var497 == 3323) {
                            if (class31.field463 >= 5 && class31.field463 <= 9) {
                                class37.field555[var6++] = 1;
                                continue;
                            }
                            class37.field555[var6++] = 0;
                            continue;
                        }
                        if (var497 == 3324) {
                            if (class31.field463 >= 5 && class31.field463 <= 9) {
                                class37.field555[var6++] = class31.field463;
                                continue;
                            }
                            class37.field555[var6++] = 0;
                            continue;
                        }
                        if (var497 == 3325) {
                            class37.field555[var6++] = class279.field4462 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 3326) {
                            class37.field555[var6++] = class55.field847.field764;
                            continue;
                        }
                        if (var497 == 3327) {
                            class37.field555[var6++] = class55.field847.field765.field3236 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 3328) {
                            class37.field555[var6++] = class108.field1560 && !class24.field320 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 3329) {
                            class37.field555[var6++] = class136.field1965 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 3330) {
                            var6--;
                            int var426 = class37.field555[var6];
                            class37.field555[var6++] = class247.method1615((byte) -22, var426);
                            continue;
                        }
                        if (var497 == 3331) {
                            var6 -= 2;
                            int var427 = class37.field555[var6];
                            int var428 = class37.field555[var6 + 1];
                            class37.field555[var6++] = class80.method538(var428, var427, false, false);
                            continue;
                        }
                        if (var497 == 3332) {
                            var6 -= 2;
                            int var429 = class37.field555[var6];
                            int var430 = class37.field555[var6 + 1];
                            class37.field555[var6++] = class80.method538(var430, var429, false, true);
                            continue;
                        }
                        if (var497 == 3333) {
                            class37.field555[var6++] = class194.field2781;
                            continue;
                        }
                        if (var497 == 3335) {
                            class37.field555[var6++] = class149.field2135;
                            continue;
                        }
                        if (var497 == 3336) {
                            var6 -= 4;
                            int var431 = class37.field555[var6];
                            int var432 = class37.field555[var6 + 3];
                            int var433 = class37.field555[var6 + 1];
                            int var434 = class37.field555[var6 + 2];
                            int var435 = (var433 << 14) + var431;
                            int var436 = (var434 << 28) + var435;
                            int var437 = var432 + var436;
                            class37.field555[var6++] = var437;
                            continue;
                        }
                        if (var497 == 3337) {
                            class37.field555[var6++] = class76.field1177;
                            continue;
                        }
                    } else if (var497 < 3500) {
                        if (var497 == 3400) {
                            var6 -= 2;
                            int var76 = class37.field555[var6];
                            int var77 = class37.field555[var6 + 1];
                            class31 var78 = class51.method342(var76, 22771);
                            class22.field285[var7++] = var78.method221(29294, var77);
                            continue;
                        }
                        if (var497 == 3408) {
                            var6 -= 4;
                            int var79 = class37.field555[var6];
                            int var80 = class37.field555[var6 + 2];
                            int var81 = class37.field555[var6 + 1];
                            int var82 = class37.field555[var6 + 3];
                            class31 var83 = class51.method342(var80, 22771);
                            if (var83.field450 == var79 && var83.field444 == var81) {
                                if (var81 == 115) {
                                    class22.field285[var7++] = var83.method221(29294, var82);
                                } else {
                                    class37.field555[var6++] = var83.method219(true, var82);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var497 == 3409) {
                            var6 -= 3;
                            int var84 = class37.field555[var6];
                            int var85 = class37.field555[var6 + 2];
                            int var86 = class37.field555[var6 + 1];
                            if (var86 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class31 var87 = class51.method342(var86, 22771);
                            if (var87.field444 != var84) {
                                throw new RuntimeException("C3409-1");
                            }
                            class37.field555[var6++] = var87.method218(0, var85) ? 1 : 0;
                            continue;
                        }
                        if (var497 == 3410) {
                            var6--;
                            int var88 = class37.field555[var6];
                            var7--;
                            String var89 = class22.field285[var7];
                            if (var88 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class31 var90 = class51.method342(var88, 22771);
                            if (var90.field444 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class37.field555[var6++] = var90.method224(var89, -5) ? 1 : 0;
                            continue;
                        }
                        if (var497 == 3411) {
                            var6--;
                            int var91 = class37.field555[var6];
                            class31 var92 = class51.method342(var91, 22771);
                            class37.field555[var6++] = var92.field443.method1217(-61);
                            continue;
                        }
                    } else if (var497 < 3700) {
                        if (var497 == 3600) {
                            if (class209.field3012 == 0) {
                                class37.field555[var6++] = -2;
                            } else if (class209.field3012 == 1) {
                                class37.field555[var6++] = -1;
                            } else {
                                class37.field555[var6++] = class55.field836;
                            }
                            continue;
                        }
                        if (var497 == 3601) {
                            var6--;
                            int var93 = class37.field555[var6];
                            if (class209.field3012 == 2 && var93 < class55.field836) {
                                class22.field285[var7++] = class70.field1089[var93];
                                continue;
                            }
                            class22.field285[var7++] = "";
                            continue;
                        }
                        if (var497 == 3602) {
                            var6--;
                            int var94 = class37.field555[var6];
                            if (class209.field3012 == 2 && class55.field836 > var94) {
                                class37.field555[var6++] = class95.field1439[var94];
                                continue;
                            }
                            class37.field555[var6++] = 0;
                            continue;
                        }
                        if (var497 == 3603) {
                            var6--;
                            int var95 = class37.field555[var6];
                            if (class209.field3012 == 2 && var95 < class55.field836) {
                                class37.field555[var6++] = class35.field498[var95];
                                continue;
                            }
                            class37.field555[var6++] = 0;
                            continue;
                        }
                        if (var497 == 3604) {
                            var6--;
                            int var96 = class37.field555[var6];
                            var7--;
                            String var97 = class22.field285[var7];
                            class48.method323(var96, var97, (byte) 16);
                            continue;
                        }
                        if (var497 == 3605) {
                            var7--;
                            String var98 = class22.field285[var7];
                            class72.method491(0, class109.method712((byte) -126, var98));
                            continue;
                        }
                        if (var497 == 3606) {
                            var7--;
                            String var99 = class22.field285[var7];
                            class260.method1739(class109.method712((byte) -128, var99), (byte) -86);
                            continue;
                        }
                        if (var497 == 3607) {
                            var7--;
                            String var100 = class22.field285[var7];
                            class180.method1163(class109.method712((byte) -127, var100), false);
                            continue;
                        }
                        if (var497 == 3608) {
                            var7--;
                            String var101 = class22.field285[var7];
                            class266.method1773((byte) 52, class109.method712((byte) -126, var101));
                            continue;
                        }
                        if (var497 == 3609) {
                            var7--;
                            String var102 = class22.field285[var7];
                            if (var102.startsWith("<img=0>") || var102.startsWith("<img=1>")) {
                                var102 = var102.substring(7);
                            }
                            class37.field555[var6++] = class264.method1755(var102, -82) ? 1 : 0;
                            continue;
                        }
                        if (var497 == 3610) {
                            var6--;
                            int var103 = class37.field555[var6];
                            if (class209.field3012 == 2 && var103 < class55.field836) {
                                class22.field285[var7++] = class79.field1222[var103];
                                continue;
                            }
                            class22.field285[var7++] = "";
                            continue;
                        }
                        if (var497 == 3611) {
                            if (class84.field1292 == null) {
                                class22.field285[var7++] = "";
                            } else {
                                class22.field285[var7++] = class206.method1326((byte) 111, class84.field1292);
                            }
                            continue;
                        }
                        if (var497 == 3612) {
                            if (class84.field1292 == null) {
                                class37.field555[var6++] = 0;
                            } else {
                                class37.field555[var6++] = class206.field2988;
                            }
                            continue;
                        }
                        if (var497 == 3613) {
                            var6--;
                            int var104 = class37.field555[var6];
                            if (class84.field1292 != null && var104 < class206.field2988) {
                                class22.field285[var7++] = class206.method1326((byte) 85, class213.field3068[var104].field1240);
                                continue;
                            }
                            class22.field285[var7++] = "";
                            continue;
                        }
                        if (var497 == 3614) {
                            var6--;
                            int var105 = class37.field555[var6];
                            if (class84.field1292 != null && class206.field2988 > var105) {
                                class37.field555[var6++] = class213.field3068[var105].field1248;
                                continue;
                            }
                            class37.field555[var6++] = 0;
                            continue;
                        }
                        if (var497 == 3615) {
                            var6--;
                            int var106 = class37.field555[var6];
                            if (class84.field1292 != null && var106 < class206.field2988) {
                                class37.field555[var6++] = class213.field3068[var106].field1245;
                                continue;
                            }
                            class37.field555[var6++] = 0;
                            continue;
                        }
                        if (var497 == 3616) {
                            class37.field555[var6++] = class233.field3488;
                            continue;
                        }
                        if (var497 == 3617) {
                            var7--;
                            String var107 = class22.field285[var7];
                            class228.method1493(-16991, var107);
                            continue;
                        }
                        if (var497 == 3618) {
                            class37.field555[var6++] = class242.field3651;
                            continue;
                        }
                        if (var497 == 3619) {
                            var7--;
                            String var108 = class22.field285[var7];
                            class189.method1211(5676, class109.method712((byte) -127, var108));
                            continue;
                        }
                        if (var497 == 3620) {
                            method830(-22298);
                            continue;
                        }
                        if (var497 == 3621) {
                            if (class209.field3012 == 0) {
                                class37.field555[var6++] = -1;
                            } else {
                                class37.field555[var6++] = class247.field3707;
                            }
                            continue;
                        }
                        if (var497 == 3622) {
                            var6--;
                            int var109 = class37.field555[var6];
                            if (class209.field3012 != 0 && var109 < class247.field3707) {
                                class22.field285[var7++] = class204.method1321((byte) 12, class81.field1253[var109]);
                                continue;
                            }
                            class22.field285[var7++] = "";
                            continue;
                        }
                        if (var497 == 3623) {
                            var7--;
                            String var110 = class22.field285[var7];
                            if (var110.startsWith("<img=0>") || var110.startsWith("<img=1>")) {
                                var110 = var110.substring(7);
                            }
                            class37.field555[var6++] = class288.method1930(0, var110) ? 1 : 0;
                            continue;
                        }
                        if (var497 == 3624) {
                            var6--;
                            int var111 = class37.field555[var6];
                            if (class213.field3068 != null && class206.field2988 > var111 && class213.field3068[var111].field1240.equalsIgnoreCase(class55.field847.field766)) {
                                class37.field555[var6++] = 1;
                                continue;
                            }
                            class37.field555[var6++] = 0;
                            continue;
                        }
                        if (var497 == 3625) {
                            if (class124.field1808 == null) {
                                class22.field285[var7++] = "";
                            } else {
                                class22.field285[var7++] = class206.method1326((byte) 127, class124.field1808);
                            }
                            continue;
                        }
                        if (var497 == 3626) {
                            var6--;
                            int var112 = class37.field555[var6];
                            if (class84.field1292 != null && var112 < class206.field2988) {
                                class22.field285[var7++] = class213.field3068[var112].field1236;
                                continue;
                            }
                            class22.field285[var7++] = "";
                            continue;
                        }
                        if (var497 == 3627) {
                            var6--;
                            int var113 = class37.field555[var6];
                            if (class209.field3012 == 2 && var113 >= 0 && var113 < class55.field836) {
                                class37.field555[var6++] = class152.field2194[var113] ? 1 : 0;
                                continue;
                            }
                            class37.field555[var6++] = 0;
                            continue;
                        }
                        if (var497 == 3628) {
                            var7--;
                            String var114 = class22.field285[var7];
                            if (var114.startsWith("<img=0>") || var114.startsWith("<img=1>")) {
                                var114 = var114.substring(7);
                            }
                            class37.field555[var6++] = class145.method974(1, var114);
                            continue;
                        }
                        if (var497 == 3629) {
                            class37.field555[var6++] = class98.field1476;
                            continue;
                        }
                    } else if (var497 < 4000) {
                        if (var497 == 3903) {
                            var6--;
                            int var115 = class37.field555[var6];
                            class37.field555[var6++] = class100.field1495[var115].method1066(0);
                            continue;
                        }
                        if (var497 == 3904) {
                            var6--;
                            int var116 = class37.field555[var6];
                            class37.field555[var6++] = class100.field1495[var116].field2306;
                            continue;
                        }
                        if (var497 == 3905) {
                            var6--;
                            int var117 = class37.field555[var6];
                            class37.field555[var6++] = class100.field1495[var117].field2302;
                            continue;
                        }
                        if (var497 == 3906) {
                            var6--;
                            int var118 = class37.field555[var6];
                            class37.field555[var6++] = class100.field1495[var118].field2309;
                            continue;
                        }
                        if (var497 == 3907) {
                            var6--;
                            int var119 = class37.field555[var6];
                            class37.field555[var6++] = class100.field1495[var119].field2314;
                            continue;
                        }
                        if (var497 == 3908) {
                            var6--;
                            int var120 = class37.field555[var6];
                            class37.field555[var6++] = class100.field1495[var120].field2310;
                            continue;
                        }
                        if (var497 == 3910) {
                            var6--;
                            int var121 = class37.field555[var6];
                            int var122 = class100.field1495[var121].method1067(768);
                            class37.field555[var6++] = var122 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 3911) {
                            var6--;
                            int var123 = class37.field555[var6];
                            int var124 = class100.field1495[var123].method1067(768);
                            class37.field555[var6++] = var124 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 3912) {
                            var6--;
                            int var125 = class37.field555[var6];
                            int var126 = class100.field1495[var125].method1067(768);
                            class37.field555[var6++] = var126 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 3913) {
                            var6--;
                            int var127 = class37.field555[var6];
                            int var128 = class100.field1495[var127].method1067(768);
                            class37.field555[var6++] = var128 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var497 < 4100) {
                        if (var497 == 4000) {
                            var6 -= 2;
                            int var359 = class37.field555[var6 + 1];
                            int var360 = class37.field555[var6];
                            class37.field555[var6++] = var360 + var359;
                            continue;
                        }
                        if (var497 == 4001) {
                            var6 -= 2;
                            int var361 = class37.field555[var6];
                            int var362 = class37.field555[var6 + 1];
                            class37.field555[var6++] = var361 - var362;
                            continue;
                        }
                        if (var497 == 4002) {
                            var6 -= 2;
                            int var363 = class37.field555[var6];
                            int var364 = class37.field555[var6 + 1];
                            class37.field555[var6++] = var363 * var364;
                            continue;
                        }
                        if (var497 == 4003) {
                            var6 -= 2;
                            int var365 = class37.field555[var6];
                            int var366 = class37.field555[var6 + 1];
                            class37.field555[var6++] = var365 / var366;
                            continue;
                        }
                        if (var497 == 4004) {
                            var6--;
                            int var367 = class37.field555[var6];
                            class37.field555[var6++] = (int) (Math.random() * (double) var367);
                            continue;
                        }
                        if (var497 == 4005) {
                            var6--;
                            int var368 = class37.field555[var6];
                            class37.field555[var6++] = (int) ((double) (var368 + 1) * Math.random());
                            continue;
                        }
                        if (var497 == 4006) {
                            var6 -= 5;
                            int var369 = class37.field555[var6 + 1];
                            int var370 = class37.field555[var6 + 3];
                            int var371 = class37.field555[var6 + 4];
                            int var372 = class37.field555[var6 + 2];
                            int var373 = class37.field555[var6];
                            class37.field555[var6++] = (var369 - var373) * (var371 - var372) / (var370 - var372) + var373;
                            continue;
                        }
                        if (var497 == 4007) {
                            var6 -= 2;
                            long var374 = (long) class37.field555[var6 + 1];
                            long var376 = (long) class37.field555[var6];
                            class37.field555[var6++] = (int) (var374 * var376 / 100L + var376);
                            continue;
                        }
                        if (var497 == 4008) {
                            var6 -= 2;
                            int var378 = class37.field555[var6];
                            int var379 = class37.field555[var6 + 1];
                            class37.field555[var6++] = class163.method1093(0x1 << var379, var378);
                            continue;
                        }
                        if (var497 == 4009) {
                            var6 -= 2;
                            int var380 = class37.field555[var6 + 1];
                            int var381 = class37.field555[var6];
                            class37.field555[var6++] = class184.method1188(var381, -(0x1 << var380) - 1);
                            continue;
                        }
                        if (var497 == 4010) {
                            var6 -= 2;
                            int var382 = class37.field555[var6];
                            int var383 = class37.field555[var6 + 1];
                            class37.field555[var6++] = class184.method1188(0x1 << var383, var382) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var497 == 4011) {
                            var6 -= 2;
                            int var384 = class37.field555[var6];
                            int var385 = class37.field555[var6 + 1];
                            class37.field555[var6++] = var384 % var385;
                            continue;
                        }
                        if (var497 == 4012) {
                            var6 -= 2;
                            int var386 = class37.field555[var6];
                            int var387 = class37.field555[var6 + 1];
                            if (var386 == 0) {
                                class37.field555[var6++] = 0;
                            } else {
                                class37.field555[var6++] = (int) Math.pow((double) var386, (double) var387);
                            }
                            continue;
                        }
                        if (var497 == 4013) {
                            var6 -= 2;
                            int var388 = class37.field555[var6 + 1];
                            int var389 = class37.field555[var6];
                            if (var389 == 0) {
                                class37.field555[var6++] = 0;
                            } else if (var388 == 0) {
                                class37.field555[var6++] = Integer.MAX_VALUE;
                            } else {
                                class37.field555[var6++] = (int) Math.pow((double) var389, 1.0D / (double) var388);
                            }
                            continue;
                        }
                        if (var497 == 4014) {
                            var6 -= 2;
                            int var390 = class37.field555[var6];
                            int var391 = class37.field555[var6 + 1];
                            class37.field555[var6++] = class184.method1188(var391, var390);
                            continue;
                        }
                        if (var497 == 4015) {
                            var6 -= 2;
                            int var392 = class37.field555[var6];
                            int var393 = class37.field555[var6 + 1];
                            class37.field555[var6++] = class163.method1093(var393, var392);
                            continue;
                        }
                        if (var497 == 4016) {
                            var6 -= 2;
                            int var394 = class37.field555[var6];
                            int var395 = class37.field555[var6 + 1];
                            class37.field555[var6++] = var394 >= var395 ? var395 : var394;
                            continue;
                        }
                        if (var497 == 4017) {
                            var6 -= 2;
                            int var396 = class37.field555[var6];
                            int var397 = class37.field555[var6 + 1];
                            class37.field555[var6++] = var396 <= var397 ? var397 : var396;
                            continue;
                        }
                        if (var497 == 4018) {
                            var6 -= 3;
                            long var398 = (long) class37.field555[var6];
                            long var400 = (long) class37.field555[var6 + 2];
                            long var402 = (long) class37.field555[var6 + 1];
                            class37.field555[var6++] = (int) (var398 * var400 / var402);
                            continue;
                        }
                    } else if (var497 < 4200) {
                        if (var497 == 4100) {
                            var7--;
                            String var129 = class22.field285[var7];
                            var6--;
                            int var130 = class37.field555[var6];
                            class22.field285[var7++] = var129 + var130;
                            continue;
                        }
                        if (var497 == 4101) {
                            var7 -= 2;
                            String var131 = class22.field285[var7];
                            String var132 = class22.field285[var7 + 1];
                            class22.field285[var7++] = var131 + var132;
                            continue;
                        }
                        if (var497 == 4102) {
                            var7--;
                            String var133 = class22.field285[var7];
                            var6--;
                            int var134 = class37.field555[var6];
                            class22.field285[var7++] = var133 + class184.method1193(var134, -31596, true);
                            continue;
                        }
                        if (var497 == 4103) {
                            var7--;
                            String var135 = class22.field285[var7];
                            class22.field285[var7++] = var135.toLowerCase();
                            continue;
                        }
                        if (var497 == 4104) {
                            var6--;
                            int var136 = class37.field555[var6];
                            long var137 = (long) var136 * 86400000L + 1014768000000L;
                            class235.field3549.setTime(new Date(var137));
                            int var139 = class235.field3549.get(5);
                            int var140 = class235.field3549.get(2);
                            int var141 = class235.field3549.get(1);
                            class22.field285[var7++] = var139 + "-" + class80.field1233[var140] + "-" + var141;
                            continue;
                        }
                        if (var497 == 4105) {
                            var7 -= 2;
                            String var142 = class22.field285[var7];
                            String var143 = class22.field285[var7 + 1];
                            if (class55.field847.field765 != null && class55.field847.field765.field3236) {
                                class22.field285[var7++] = var143;
                                continue;
                            }
                            class22.field285[var7++] = var142;
                            continue;
                        }
                        if (var497 == 4106) {
                            var6--;
                            int var144 = class37.field555[var6];
                            class22.field285[var7++] = Integer.toString(var144);
                            continue;
                        }
                        if (var497 == 4107) {
                            var7 -= 2;
                            class37.field555[var6++] = class90.method612(0, class109.method717(class22.field285[var7 + 1], -26476, class22.field285[var7], class149.field2135));
                            continue;
                        }
                        if (var497 == 4108) {
                            var7--;
                            String var145 = class22.field285[var7];
                            var6 -= 2;
                            int var146 = class37.field555[var6];
                            int var147 = class37.field555[var6 + 1];
                            class37.field555[var6++] = class226.method1476(var147, (byte) -81).method1268(var145, var146);
                            continue;
                        }
                        if (var497 == 4109) {
                            var6 -= 2;
                            var7--;
                            String var148 = class22.field285[var7];
                            int var149 = class37.field555[var6];
                            int var150 = class37.field555[var6 + 1];
                            class37.field555[var6++] = class226.method1476(var150, (byte) -81).method1264(var148, var149);
                            continue;
                        }
                        if (var497 == 4110) {
                            var7 -= 2;
                            String var151 = class22.field285[var7];
                            String var152 = class22.field285[var7 + 1];
                            var6--;
                            if (class37.field555[var6] == 1) {
                                class22.field285[var7++] = var151;
                            } else {
                                class22.field285[var7++] = var152;
                            }
                            continue;
                        }
                        if (var497 == 4111) {
                            var7--;
                            String var153 = class22.field285[var7];
                            class22.field285[var7++] = class198.method1266(var153);
                            continue;
                        }
                        if (var497 == 4112) {
                            var6--;
                            int var154 = class37.field555[var6];
                            var7--;
                            String var155 = class22.field285[var7];
                            if (var154 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class22.field285[var7++] = var155 + (char) var154;
                            continue;
                        }
                        if (var497 == 4113) {
                            var6--;
                            int var156 = class37.field555[var6];
                            class37.field555[var6++] = class136.method919((byte) -122, (char) var156) ? 1 : 0;
                            continue;
                        }
                        if (var497 == 4114) {
                            var6--;
                            int var157 = class37.field555[var6];
                            class37.field555[var6++] = class120.method820(false, (char) var157) ? 1 : 0;
                            continue;
                        }
                        if (var497 == 4115) {
                            var6--;
                            int var158 = class37.field555[var6];
                            class37.field555[var6++] = class23.method167((char) var158, -5555) ? 1 : 0;
                            continue;
                        }
                        if (var497 == 4116) {
                            var6--;
                            int var159 = class37.field555[var6];
                            class37.field555[var6++] = class225.method1467((char) var159, 48) ? 1 : 0;
                            continue;
                        }
                        if (var497 == 4117) {
                            var7--;
                            String var160 = class22.field285[var7];
                            if (var160 == null) {
                                class37.field555[var6++] = 0;
                            } else {
                                class37.field555[var6++] = var160.length();
                            }
                            continue;
                        }
                        if (var497 == 4118) {
                            var7--;
                            String var161 = class22.field285[var7];
                            var6 -= 2;
                            int var162 = class37.field555[var6];
                            int var163 = class37.field555[var6 + 1];
                            class22.field285[var7++] = var161.substring(var162, var163);
                            continue;
                        }
                        if (var497 == 4119) {
                            var7--;
                            String var164 = class22.field285[var7];
                            boolean var165 = false;
                            StringBuffer var166 = new StringBuffer(var164.length());
                            for (int var167 = 0; var164.length() > var167; var167++) {
                                char var168 = var164.charAt(var167);
                                if (var168 == '<') {
                                    var165 = true;
                                } else if (var168 == '>') {
                                    var165 = false;
                                } else if (!var165) {
                                    var166.append(var168);
                                }
                            }
                            class22.field285[var7++] = var166.toString();
                            continue;
                        }
                        if (var497 == 4120) {
                            var7--;
                            String var169 = class22.field285[var7];
                            var6 -= 2;
                            int var170 = class37.field555[var6];
                            int var171 = class37.field555[var6 + 1];
                            class37.field555[var6++] = var169.indexOf(var170, var171);
                            continue;
                        }
                        if (var497 == 4121) {
                            var7 -= 2;
                            String var172 = class22.field285[var7 + 1];
                            String var173 = class22.field285[var7];
                            var6--;
                            int var174 = class37.field555[var6];
                            class37.field555[var6++] = var173.indexOf(var172, var174);
                            continue;
                        }
                        if (var497 == 4122) {
                            var6--;
                            int var175 = class37.field555[var6];
                            class37.field555[var6++] = Character.toLowerCase((char) var175);
                            continue;
                        }
                        if (var497 == 4123) {
                            var6--;
                            int var176 = class37.field555[var6];
                            class37.field555[var6++] = Character.toUpperCase((char) var176);
                            continue;
                        }
                        if (var497 == 4124) {
                            var6--;
                            boolean var177 = class37.field555[var6] != 0;
                            var6--;
                            int var178 = class37.field555[var6];
                            class22.field285[var7++] = class197.method1258(var177, (long) var178, 0, class149.field2135, (byte) 127);
                            continue;
                        }
                    } else if (var497 < 4300) {
                        if (var497 == 4200) {
                            var6--;
                            int var179 = class37.field555[var6];
                            class22.field285[var7++] = class259.method1735(var179, -14667).field4375;
                            continue;
                        }
                        if (var497 == 4201) {
                            var6 -= 2;
                            int var180 = class37.field555[var6];
                            int var181 = class37.field555[var6 + 1];
                            class273 var182 = class259.method1735(var180, -14667);
                            if (var181 >= 1 && var181 <= 5 && var182.field4372[var181 - 1] != null) {
                                class22.field285[var7++] = var182.field4372[var181 - 1];
                                continue;
                            }
                            class22.field285[var7++] = "";
                            continue;
                        }
                        if (var497 == 4202) {
                            var6 -= 2;
                            int var183 = class37.field555[var6 + 1];
                            int var184 = class37.field555[var6];
                            class273 var185 = class259.method1735(var184, -14667);
                            if (var183 >= 1 && var183 <= 5 && var185.field4377[var183 - 1] != null) {
                                class22.field285[var7++] = var185.field4377[var183 - 1];
                                continue;
                            }
                            class22.field285[var7++] = "";
                            continue;
                        }
                        if (var497 == 4203) {
                            var6--;
                            int var186 = class37.field555[var6];
                            class37.field555[var6++] = class259.method1735(var186, -14667).field4381;
                            continue;
                        }
                        if (var497 == 4204) {
                            var6--;
                            int var187 = class37.field555[var6];
                            class37.field555[var6++] = class259.method1735(var187, -14667).field4387 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 4205) {
                            var6--;
                            int var188 = class37.field555[var6];
                            class273 var189 = class259.method1735(var188, -14667);
                            if (var189.field4348 == -1 && var189.field4364 >= 0) {
                                class37.field555[var6++] = var189.field4364;
                                continue;
                            }
                            class37.field555[var6++] = var188;
                            continue;
                        }
                        if (var497 == 4206) {
                            var6--;
                            int var190 = class37.field555[var6];
                            class273 var191 = class259.method1735(var190, -14667);
                            if (var191.field4348 >= 0 && var191.field4364 >= 0) {
                                class37.field555[var6++] = var191.field4364;
                                continue;
                            }
                            class37.field555[var6++] = var190;
                            continue;
                        }
                        if (var497 == 4207) {
                            var6--;
                            int var192 = class37.field555[var6];
                            class37.field555[var6++] = class259.method1735(var192, -14667).field4344 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 4208) {
                            var6 -= 2;
                            int var193 = class37.field555[var6];
                            int var194 = class37.field555[var6 + 1];
                            class228 var195 = class102.method678((byte) 3, var194);
                            if (var195.method1490(-61)) {
                                class22.field285[var7++] = class259.method1735(var193, -14667).method1846(68, var195.field3414, var194);
                            } else {
                                class37.field555[var6++] = class259.method1735(var193, -14667).method1835((byte) -97, var195.field3410, var194);
                            }
                            continue;
                        }
                        if (var497 == 4210) {
                            var6--;
                            int var196 = class37.field555[var6];
                            var7--;
                            String var197 = class22.field285[var7];
                            class91.method614(var196 == 1, (byte) 63, var197);
                            class37.field555[var6++] = class124.field1803;
                            continue;
                        }
                        if (var497 == 4211) {
                            if (class24.field322 != null && class124.field1803 > class154.field2252) {
                                class37.field555[var6++] = class184.method1188(class24.field322[class154.field2252++], 65535);
                                continue;
                            }
                            class37.field555[var6++] = -1;
                            continue;
                        }
                        if (var497 == 4212) {
                            class154.field2252 = 0;
                            continue;
                        }
                    } else if (var497 < 4400) {
                        if (var497 == 4300) {
                            var6 -= 2;
                            int var198 = class37.field555[var6];
                            int var199 = class37.field555[var6 + 1];
                            class228 var200 = class102.method678((byte) -3, var199);
                            if (var200.method1490(-60)) {
                                class22.field285[var7++] = class14.method115(var198, (byte) -113).method1819((byte) 103, var200.field3414, var199);
                            } else {
                                class37.field555[var6++] = class14.method115(var198, (byte) -113).method1817(-93, var199, var200.field3410);
                            }
                            continue;
                        }
                    } else if (var497 < 4500) {
                        if (var497 == 4400) {
                            var6 -= 2;
                            int var201 = class37.field555[var6 + 1];
                            int var202 = class37.field555[var6];
                            class228 var203 = class102.method678((byte) -122, var201);
                            if (var203.method1490(-114)) {
                                class22.field285[var7++] = class91.method618(122, var202).method1653(var201, (byte) -127, var203.field3414);
                            } else {
                                class37.field555[var6++] = class91.method618(112, var202).method1652(var201, (byte) 124, var203.field3410);
                            }
                            continue;
                        }
                    } else if (var497 < 4600) {
                        if (var497 == 4500) {
                            var6 -= 2;
                            int var204 = class37.field555[var6];
                            int var205 = class37.field555[var6 + 1];
                            class228 var206 = class102.method678((byte) -123, var205);
                            if (var206.method1490(-117)) {
                                class22.field285[var7++] = class206.method1328(-83, var204).method1194(var205, var206.field3414, (byte) -98);
                            } else {
                                class37.field555[var6++] = class206.method1328(-116, var204).method1184(var206.field3410, 1343463452, var205);
                            }
                            continue;
                        }
                    } else if (var497 < 5100) {
                        if (var497 == 5000) {
                            class37.field555[var6++] = class175.field2486;
                            continue;
                        }
                        if (var497 == 5001) {
                            var6 -= 3;
                            class175.field2486 = class37.field555[var6];
                            class99.field1486++;
                            class114.field1692 = class37.field555[var6 + 1];
                            class264.field3989 = class37.field555[var6 + 2];
                            class95.field1451.method522(235, 28727);
                            class95.field1451.method775(class175.field2486, -120);
                            class95.field1451.method775(class114.field1692, -118);
                            class95.field1451.method775(class264.field3989, -122);
                            continue;
                        }
                        if (var497 == 5002) {
                            var6 -= 2;
                            class27.field399++;
                            int var294 = class37.field555[var6];
                            var7--;
                            String var295 = class22.field285[var7];
                            int var296 = class37.field555[var6 + 1];
                            class95.field1451.method522(147, 28727);
                            class95.field1451.method765(532401312, class109.method712((byte) 89, var295));
                            class95.field1451.method775(var294 - 1, -114);
                            class95.field1451.method775(var296, -111);
                            continue;
                        }
                        if (var497 == 5003) {
                            var6--;
                            int var297 = class37.field555[var6];
                            String var298 = null;
                            if (var297 < 100) {
                                var298 = class166.field2423[var297];
                            }
                            if (var298 == null) {
                                var298 = "";
                            }
                            class22.field285[var7++] = var298;
                            continue;
                        }
                        if (var497 == 5004) {
                            var6--;
                            int var299 = class37.field555[var6];
                            int var300 = -1;
                            if (var299 < 100 && class166.field2423[var299] != null) {
                                var300 = class101.field1503[var299];
                            }
                            class37.field555[var6++] = var300;
                            continue;
                        }
                        if (var497 == 5005) {
                            class37.field555[var6++] = class114.field1692;
                            continue;
                        }
                        if (var497 == 5008) {
                            var7--;
                            String var301 = class22.field285[var7];
                            if (var301.startsWith("::")) {
                                class173.method1139(10, var301);
                                continue;
                            }
                            if (class270.field4228 == 0 && (class108.field1560 && !class24.field320 || class136.field1965)) {
                                continue;
                            }
                            class109.field1582++;
                            byte var302 = 0;
                            String var303 = var301.toLowerCase();
                            if (var303.startsWith(class138.field1997)) {
                                var302 = 0;
                                var301 = var301.substring(class138.field1997.length());
                            } else if (var303.startsWith(class37.field543)) {
                                var301 = var301.substring(class37.field543.length());
                                var302 = 1;
                            } else if (var303.startsWith(class256.field3889)) {
                                var301 = var301.substring(class256.field3889.length());
                                var302 = 2;
                            } else if (var303.startsWith(class16.field234)) {
                                var301 = var301.substring(class16.field234.length());
                                var302 = 3;
                            } else if (var303.startsWith(class274.field4398)) {
                                var301 = var301.substring(class274.field4398.length());
                                var302 = 4;
                            } else if (var303.startsWith(class181.field2583)) {
                                var302 = 5;
                                var301 = var301.substring(class181.field2583.length());
                            } else if (var303.startsWith(class228.field3422)) {
                                var302 = 6;
                                var301 = var301.substring(class228.field3422.length());
                            } else if (var303.startsWith(class109.field1568)) {
                                var302 = 7;
                                var301 = var301.substring(class109.field1568.length());
                            } else if (var303.startsWith(class178.field2543)) {
                                var302 = 8;
                                var301 = var301.substring(class178.field2543.length());
                            } else if (var303.startsWith(class93.field1414)) {
                                var302 = 9;
                                var301 = var301.substring(class93.field1414.length());
                            } else if (var303.startsWith(class122.field1778)) {
                                var301 = var301.substring(class122.field1778.length());
                                var302 = 10;
                            } else if (var303.startsWith(class115.field1714)) {
                                var302 = 11;
                                var301 = var301.substring(class115.field1714.length());
                            } else if (class149.field2135 != 0) {
                                if (var303.startsWith(class237.field3566)) {
                                    var301 = var301.substring(class237.field3566.length());
                                    var302 = 0;
                                } else if (var303.startsWith(class237.field3569)) {
                                    var302 = 1;
                                    var301 = var301.substring(class237.field3569.length());
                                } else if (var303.startsWith(class263.field3966)) {
                                    var301 = var301.substring(class263.field3966.length());
                                    var302 = 2;
                                } else if (var303.startsWith(class47.field661)) {
                                    var301 = var301.substring(class47.field661.length());
                                    var302 = 3;
                                } else if (var303.startsWith(class56.field857)) {
                                    var301 = var301.substring(class56.field857.length());
                                    var302 = 4;
                                } else if (var303.startsWith(class152.field2203)) {
                                    var302 = 5;
                                    var301 = var301.substring(class152.field2203.length());
                                } else if (var303.startsWith(class1.field15)) {
                                    var301 = var301.substring(class1.field15.length());
                                    var302 = 6;
                                } else if (var303.startsWith(class52.field760)) {
                                    var301 = var301.substring(class52.field760.length());
                                    var302 = 7;
                                } else if (var303.startsWith(class168.field2435)) {
                                    var301 = var301.substring(class168.field2435.length());
                                    var302 = 8;
                                } else if (var303.startsWith(class56.field849)) {
                                    var301 = var301.substring(class56.field849.length());
                                    var302 = 9;
                                } else if (var303.startsWith(class67.field1039)) {
                                    var301 = var301.substring(class67.field1039.length());
                                    var302 = 10;
                                } else if (var303.startsWith(class109.field1570)) {
                                    var301 = var301.substring(class109.field1570.length());
                                    var302 = 11;
                                }
                            }
                            String var304 = var301.toLowerCase();
                            byte var305 = 0;
                            if (var304.startsWith(class152.field2202)) {
                                var305 = 1;
                                var301 = var301.substring(class152.field2202.length());
                            } else if (var304.startsWith(class184.field2627)) {
                                var301 = var301.substring(class184.field2627.length());
                                var305 = 2;
                            } else if (var304.startsWith(class289.field4575)) {
                                var305 = 3;
                                var301 = var301.substring(class289.field4575.length());
                            } else if (var304.startsWith(class77.field1180)) {
                                var301 = var301.substring(class77.field1180.length());
                                var305 = 4;
                            } else if (var304.startsWith(class76.field1176)) {
                                var301 = var301.substring(class76.field1176.length());
                                var305 = 5;
                            } else if (class149.field2135 != 0) {
                                if (var304.startsWith(class273.field4329)) {
                                    var301 = var301.substring(class273.field4329.length());
                                    var305 = 1;
                                } else if (var304.startsWith(class227.field3408)) {
                                    var301 = var301.substring(class227.field3408.length());
                                    var305 = 2;
                                } else if (var304.startsWith(class124.field1805)) {
                                    var301 = var301.substring(class124.field1805.length());
                                    var305 = 3;
                                } else if (var304.startsWith(class147.field2105)) {
                                    var305 = 4;
                                    var301 = var301.substring(class147.field2105.length());
                                } else if (var304.startsWith(class89.field1358)) {
                                    var301 = var301.substring(class89.field1358.length());
                                    var305 = 5;
                                }
                            }
                            class95.field1451.method522(110, 28727);
                            class95.field1451.method775(0, -120);
                            int var306 = class95.field1451.field1673;
                            class95.field1451.method775(var302, -124);
                            class95.field1451.method775(var305, -128);
                            class279.method1878(var301, (byte) 119, class95.field1451);
                            class95.field1451.method743(class95.field1451.field1673 - var306, (byte) 46);
                            continue;
                        }
                        if (var497 == 5009) {
                            var7 -= 2;
                            String var307 = class22.field285[var7 + 1];
                            String var308 = class22.field285[var7];
                            if (class270.field4228 != 0 || (!class108.field1560 || class24.field320) && !class136.field1965) {
                                class204.field2967++;
                                class95.field1451.method522(3, 28727);
                                class95.field1451.method775(0, -119);
                                int var309 = class95.field1451.field1673;
                                class95.field1451.method765(532401312, class109.method712((byte) 114, var308));
                                class279.method1878(var307, (byte) -36, class95.field1451);
                                class95.field1451.method743(class95.field1451.field1673 - var309, (byte) 113);
                            }
                            continue;
                        }
                        if (var497 == 5010) {
                            String var310 = null;
                            var6--;
                            int var311 = class37.field555[var6];
                            if (var311 < 100) {
                                var310 = class184.field2635[var311];
                            }
                            if (var310 == null) {
                                var310 = "";
                            }
                            class22.field285[var7++] = var310;
                            continue;
                        }
                        if (var497 == 5011) {
                            String var312 = null;
                            var6--;
                            int var313 = class37.field555[var6];
                            if (var313 < 100) {
                                var312 = class286.field4549[var313];
                            }
                            if (var312 == null) {
                                var312 = "";
                            }
                            class22.field285[var7++] = var312;
                            continue;
                        }
                        if (var497 == 5012) {
                            var6--;
                            int var314 = class37.field555[var6];
                            int var315 = -1;
                            if (var314 < 100) {
                                var315 = class57.field876[var314];
                            }
                            class37.field555[var6++] = var315;
                            continue;
                        }
                        if (var497 == 5015) {
                            String var316;
                            if (class55.field847 == null || class55.field847.field766 == null) {
                                var316 = class280.field4469;
                            } else {
                                var316 = class55.field847.method348(-1);
                            }
                            class22.field285[var7++] = var316;
                            continue;
                        }
                        if (var497 == 5016) {
                            class37.field555[var6++] = class264.field3989;
                            continue;
                        }
                        if (var497 == 5017) {
                            class37.field555[var6++] = class175.field2493;
                            continue;
                        }
                        if (var497 == 5050) {
                            var6--;
                            int var317 = class37.field555[var6];
                            class22.field285[var7++] = class263.method1749(false, var317).field3074;
                            continue;
                        }
                        if (var497 == 5051) {
                            var6--;
                            int var318 = class37.field555[var6];
                            class214 var319 = class263.method1749(false, var318);
                            if (var319.field3088 == null) {
                                class37.field555[var6++] = 0;
                            } else {
                                class37.field555[var6++] = var319.field3088.length;
                            }
                            continue;
                        }
                        if (var497 == 5052) {
                            var6 -= 2;
                            int var320 = class37.field555[var6 + 1];
                            int var321 = class37.field555[var6];
                            class214 var322 = class263.method1749(false, var321);
                            int var323 = var322.field3088[var320];
                            class37.field555[var6++] = var323;
                            continue;
                        }
                        if (var497 == 5053) {
                            var6--;
                            int var324 = class37.field555[var6];
                            class214 var325 = class263.method1749(false, var324);
                            if (var325.field3085 == null) {
                                class37.field555[var6++] = 0;
                            } else {
                                class37.field555[var6++] = var325.field3085.length;
                            }
                            continue;
                        }
                        if (var497 == 5054) {
                            var6 -= 2;
                            int var326 = class37.field555[var6];
                            int var327 = class37.field555[var6 + 1];
                            class37.field555[var6++] = class263.method1749(false, var326).field3085[var327];
                            continue;
                        }
                        if (var497 == 5055) {
                            var6--;
                            int var328 = class37.field555[var6];
                            class22.field285[var7++] = class162.method1087(1, var328).method1361((byte) -55);
                            continue;
                        }
                        if (var497 == 5056) {
                            var6--;
                            int var329 = class37.field555[var6];
                            class213 var330 = class162.method1087(1, var329);
                            if (var330.field3057 == null) {
                                class37.field555[var6++] = 0;
                            } else {
                                class37.field555[var6++] = var330.field3057.length;
                            }
                            continue;
                        }
                        if (var497 == 5057) {
                            var6 -= 2;
                            int var331 = class37.field555[var6];
                            int var332 = class37.field555[var6 + 1];
                            class37.field555[var6++] = class162.method1087(1, var331).field3057[var332];
                            continue;
                        }
                        if (var497 == 5058) {
                            class113.field1608 = new class29();
                            var6--;
                            class113.field1608.field410 = class37.field555[var6];
                            class113.field1608.field413 = class162.method1087(1, class113.field1608.field410);
                            class113.field1608.field416 = new int[class113.field1608.field413.method1364(true)];
                            continue;
                        }
                        if (var497 == 5059) {
                            class40.field587++;
                            class95.field1451.method522(135, 28727);
                            class95.field1451.method775(0, -112);
                            int var333 = class95.field1451.field1673;
                            class95.field1451.method775(0, -111);
                            class95.field1451.method794(class113.field1608.field410, (byte) -101);
                            class113.field1608.field413.method1353(class113.field1608.field416, 0, class95.field1451);
                            class95.field1451.method743(class95.field1451.field1673 - var333, (byte) 62);
                            continue;
                        }
                        if (var497 == 5060) {
                            class148.field2115++;
                            var7--;
                            String var334 = class22.field285[var7];
                            class95.field1451.method522(120, 28727);
                            class95.field1451.method775(0, -126);
                            int var335 = class95.field1451.field1673;
                            class95.field1451.method765(532401312, class109.method712((byte) 96, var334));
                            class95.field1451.method794(class113.field1608.field410, (byte) -58);
                            class113.field1608.field413.method1353(class113.field1608.field416, 0, class95.field1451);
                            class95.field1451.method743(class95.field1451.field1673 - var335, (byte) -84);
                            continue;
                        }
                        if (var497 == 5061) {
                            class40.field587++;
                            class95.field1451.method522(135, 28727);
                            class95.field1451.method775(0, -113);
                            int var336 = class95.field1451.field1673;
                            class95.field1451.method775(1, -115);
                            class95.field1451.method794(class113.field1608.field410, (byte) -117);
                            class113.field1608.field413.method1353(class113.field1608.field416, 0, class95.field1451);
                            class95.field1451.method743(class95.field1451.field1673 - var336, (byte) -106);
                            continue;
                        }
                        if (var497 == 5062) {
                            var6 -= 2;
                            int var337 = class37.field555[var6 + 1];
                            int var338 = class37.field555[var6];
                            class37.field555[var6++] = class263.method1749(false, var338).field3081[var337];
                            continue;
                        }
                        if (var497 == 5063) {
                            var6 -= 2;
                            int var339 = class37.field555[var6];
                            int var340 = class37.field555[var6 + 1];
                            class37.field555[var6++] = class263.method1749(false, var339).field3090[var340];
                            continue;
                        }
                        if (var497 == 5064) {
                            var6 -= 2;
                            int var341 = class37.field555[var6 + 1];
                            int var342 = class37.field555[var6];
                            if (var341 == -1) {
                                class37.field555[var6++] = -1;
                            } else {
                                class37.field555[var6++] = class263.method1749(false, var342).method1370((char) var341, (byte) -125);
                            }
                            continue;
                        }
                        if (var497 == 5065) {
                            var6 -= 2;
                            int var343 = class37.field555[var6];
                            int var344 = class37.field555[var6 + 1];
                            if (var344 == -1) {
                                class37.field555[var6++] = -1;
                            } else {
                                class37.field555[var6++] = class263.method1749(false, var343).method1366(0, (char) var344);
                            }
                            continue;
                        }
                        if (var497 == 5066) {
                            var6--;
                            int var345 = class37.field555[var6];
                            class37.field555[var6++] = class162.method1087(1, var345).method1364(true);
                            continue;
                        }
                        if (var497 == 5067) {
                            var6 -= 2;
                            int var346 = class37.field555[var6];
                            int var347 = class37.field555[var6 + 1];
                            int var348 = class162.method1087(1, var346).method1358(var347, 16609);
                            class37.field555[var6++] = var348;
                            continue;
                        }
                        if (var497 == 5068) {
                            var6 -= 2;
                            int var349 = class37.field555[var6];
                            int var350 = class37.field555[var6 + 1];
                            class113.field1608.field416[var349] = var350;
                            continue;
                        }
                        if (var497 == 5069) {
                            var6 -= 2;
                            int var351 = class37.field555[var6];
                            int var352 = class37.field555[var6 + 1];
                            class113.field1608.field416[var351] = var352;
                            continue;
                        }
                        if (var497 == 5070) {
                            var6 -= 3;
                            int var353 = class37.field555[var6];
                            int var354 = class37.field555[var6 + 1];
                            int var355 = class37.field555[var6 + 2];
                            class213 var356 = class162.method1087(1, var353);
                            if (var356.method1358(var354, 16609) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            class37.field555[var6++] = var356.method1359((byte) 87, var354, var355);
                            continue;
                        }
                        if (var497 == 5071) {
                            var7--;
                            String var357 = class22.field285[var7];
                            var6--;
                            boolean var358 = class37.field555[var6] == 1;
                            class243.method1582(var358, var357, 0);
                            class37.field555[var6++] = class124.field1803;
                            continue;
                        }
                        if (var497 == 5072) {
                            if (class24.field322 != null && class154.field2252 < class124.field1803) {
                                class37.field555[var6++] = class184.method1188(65535, class24.field322[class154.field2252++]);
                                continue;
                            }
                            class37.field555[var6++] = -1;
                            continue;
                        }
                        if (var497 == 5073) {
                            class154.field2252 = 0;
                            continue;
                        }
                    } else if (var497 < 5200) {
                        if (var497 == 5100) {
                            if (class19.field267[86]) {
                                class37.field555[var6++] = 1;
                            } else {
                                class37.field555[var6++] = 0;
                            }
                            continue;
                        }
                        if (var497 == 5101) {
                            if (class19.field267[82]) {
                                class37.field555[var6++] = 1;
                            } else {
                                class37.field555[var6++] = 0;
                            }
                            continue;
                        }
                        if (var497 == 5102) {
                            if (class19.field267[81]) {
                                class37.field555[var6++] = 1;
                            } else {
                                class37.field555[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var497 < 5300) {
                        if (var497 == 5200) {
                            var6--;
                            class158.method1059((byte) 124, class37.field555[var6]);
                            continue;
                        }
                        if (var497 == 5201) {
                            class37.field555[var6++] = class223.method1453(true);
                            continue;
                        }
                        if (var497 == 5202) {
                            var6--;
                            class256.method1720(128, class37.field555[var6]);
                            continue;
                        }
                        if (var497 == 5203) {
                            var7--;
                            class22.method164((byte) 41, class22.field285[var7]);
                            continue;
                        }
                        if (var497 == 5204) {
                            class22.field285[var7 - 1] = class1.method1(-1, class22.field285[var7 - 1]);
                            continue;
                        }
                        if (var497 == 5205) {
                            var7--;
                            class99.method666(-20, class22.field285[var7]);
                            continue;
                        }
                        if (var497 == 5206) {
                            var6--;
                            int var272 = class37.field555[var6];
                            class225 var273 = class97.method648(9, (var272 & 0xFFFD2BE) >> 14, var272 & 0x3FFF);
                            if (var273 == null) {
                                class22.field285[var7++] = "";
                            } else {
                                class22.field285[var7++] = var273.field3381;
                            }
                            continue;
                        }
                        if (var497 == 5207) {
                            var7--;
                            class225 var274 = class124.method837(3, class22.field285[var7]);
                            if (var274 != null && var274.field3375 != null) {
                                class22.field285[var7++] = var274.field3375;
                                continue;
                            }
                            class22.field285[var7++] = "";
                            continue;
                        }
                        if (var497 == 5208) {
                            class37.field555[var6++] = class234.field3539;
                            class37.field555[var6++] = class259.field3916;
                            continue;
                        }
                        if (var497 == 5209) {
                            class37.field555[var6++] = class212.field3040 + class136.field1967;
                            class37.field555[var6++] = class54.field828 + class63.field1009 - class286.field4544 - 1;
                            continue;
                        }
                        if (var497 == 5210) {
                            class225 var275 = class237.method1554(-10064);
                            if (var275 == null) {
                                class37.field555[var6++] = 0;
                                class37.field555[var6++] = 0;
                            } else {
                                class37.field555[var6++] = var275.field3364 * 64;
                                class37.field555[var6++] = var275.field3369 * 64;
                            }
                            continue;
                        }
                        if (var497 == 5211) {
                            class225 var276 = class237.method1554(-10064);
                            if (var276 == null) {
                                class37.field555[var6++] = 0;
                                class37.field555[var6++] = 0;
                            } else {
                                class37.field555[var6++] = var276.field3371 - var276.field3386;
                                class37.field555[var6++] = var276.field3378 - var276.field3363;
                            }
                            continue;
                        }
                        if (var497 == 5212) {
                            int var277 = class42.method290(19514);
                            int var278 = 0;
                            String var279;
                            if (var277 == -1) {
                                var279 = "";
                            } else {
                                var279 = class168.field2440.field1203[var277];
                                var278 = class168.field2440.method514(-24866, var277);
                            }
                            String var280 = class158.method1060("<br>", var279, " ", 105);
                            class22.field285[var7++] = var280;
                            class37.field555[var6++] = var278;
                            continue;
                        }
                        if (var497 == 5213) {
                            int var281 = 0;
                            int var282 = class135.method915(28654);
                            String var283;
                            if (var282 == -1) {
                                var283 = "";
                            } else {
                                var283 = class168.field2440.field1203[var282];
                                var281 = class168.field2440.method514(-24866, var282);
                            }
                            String var284 = class158.method1060("<br>", var283, " ", 122);
                            class22.field285[var7++] = var284;
                            class37.field555[var6++] = var281;
                            continue;
                        }
                        if (var497 == 5214) {
                            var6--;
                            int var285 = class37.field555[var6];
                            class218.method1404(var285 & 0x3FFF, 103, (var285 & 0xFFFD697) >> 14);
                            continue;
                        }
                        if (var497 == 5215) {
                            var6--;
                            int var286 = class37.field555[var6];
                            var7--;
                            String var287 = class22.field285[var7];
                            boolean var288 = false;
                            class151 var289 = class25.method189(var286 & 0x3FFF, (var286 & 0xFFFEED6) >> 14, -105);
                            for (class225 var290 = (class225) var289.method1026((byte) 127); var290 != null; var290 = (class225) var289.method1022(-9709)) {
                                if (var290.field3381.equalsIgnoreCase(var287)) {
                                    var288 = true;
                                    break;
                                }
                            }
                            if (var288) {
                                class37.field555[var6++] = 1;
                            } else {
                                class37.field555[var6++] = 0;
                            }
                            continue;
                        }
                        if (var497 == 5216) {
                            var6--;
                            int var291 = class37.field555[var6];
                            class166.method1105(24459, var291);
                            continue;
                        }
                        if (var497 == 5217) {
                            var6--;
                            int var292 = class37.field555[var6];
                            if (class89.method606(var292, (byte) 75)) {
                                class37.field555[var6++] = 1;
                            } else {
                                class37.field555[var6++] = 0;
                            }
                            continue;
                        }
                        if (var497 == 5218) {
                            class225 var293 = class237.method1554(-10064);
                            if (var293 == null) {
                                class37.field555[var6++] = -1;
                            } else {
                                class37.field555[var6++] = var293.field3379;
                            }
                            continue;
                        }
                        if (var497 == 5219) {
                            var7--;
                            class245.method1607(-14224, class22.field285[var7]);
                            continue;
                        }
                        if (var497 == 5220) {
                            class37.field555[var6++] = class280.field4470 == 100 ? 1 : 0;
                            continue;
                        }
                    } else if (var497 < 5400) {
                        if (var497 == 5300) {
                            var6 -= 2;
                            class37.field555[var6++] = 0;
                            continue;
                        }
                        if (var497 == 5301) {
                            continue;
                        }
                        if (var497 == 5302) {
                            class37.field555[var6++] = 0;
                            continue;
                        }
                        if (var497 == 5303) {
                            var6--;
                            class37.field555[var6++] = 0;
                            class37.field555[var6++] = 0;
                            continue;
                        }
                        if (var497 == 5305) {
                            byte var269 = -1;
                            class37.field555[var6++] = var269;
                            continue;
                        }
                        if (var497 == 5306) {
                            class37.field555[var6++] = class24.method178(-16648);
                            continue;
                        }
                        if (var497 == 5307) {
                            var6--;
                            int var270 = class37.field555[var6];
                            if (var270 < 0 || var270 > 2) {
                                var270 = 0;
                            }
                            class122.method832(0, -1, -1, var270, false);
                            continue;
                        }
                        if (var497 == 5308) {
                            class37.field555[var6++] = class161.field2333;
                            continue;
                        }
                        if (var497 == 5309) {
                            var6--;
                            int var271 = class37.field555[var6];
                            if (var271 < 0 || var271 > 2) {
                                var271 = 0;
                            }
                            class161.field2333 = var271;
                            class285.method1920(class163.field2378, (byte) 31);
                            continue;
                        }
                    } else if (var497 < 5500) {
                        if (var497 == 5400) {
                            class118.field1734++;
                            var7 -= 2;
                            String var207 = class22.field285[var7];
                            String var208 = class22.field285[var7 + 1];
                            var6--;
                            int var209 = class37.field555[var6];
                            class95.field1451.method522(68, 28727);
                            class95.field1451.method775(class136.method918((byte) 119, var207) - (-class136.method918((byte) 127, var208) - 1), -113);
                            class95.field1451.method734((byte) 79, var207);
                            class95.field1451.method734((byte) 86, var208);
                            class95.field1451.method775(var209, -125);
                            continue;
                        }
                        if (var497 == 5401) {
                            var6 -= 2;
                            class281.field4489[class37.field555[var6]] = (short) class220.method1416(class37.field555[var6 + 1], (byte) -47);
                            class179.method1162(5);
                            class58.method389(112);
                            class192.method1234(-56);
                            class79.method527(-77);
                            class153.method1037(26566);
                            continue;
                        }
                        if (var497 == 5405) {
                            var6 -= 2;
                            int var210 = class37.field555[var6];
                            int var211 = class37.field555[var6 + 1];
                            if (var210 >= 0 && var210 < 2) {
                                class74.field1155[var210] = new int[var211 << 1][4];
                            }
                            continue;
                        }
                        if (var497 == 5406) {
                            var6 -= 7;
                            int var212 = class37.field555[var6];
                            int var213 = class37.field555[var6 + 1] << 1;
                            int var214 = class37.field555[var6 + 2];
                            int var215 = class37.field555[var6 + 4];
                            int var216 = class37.field555[var6 + 5];
                            int var217 = class37.field555[var6 + 3];
                            int var218 = class37.field555[var6 + 6];
                            if (var212 >= 0 && var212 < 2 && class74.field1155[var212] != null && var213 >= 0 && var213 < class74.field1155[var212].length) {
                                class74.field1155[var212][var213] = new int[] { class184.method1188(var214 >> 14, 16383) * 128, var217, class184.method1188(var214, 16383) * 128, var218 };
                                class74.field1155[var212][var213 + 1] = new int[] { class184.method1188(16383, var215 >> 14) * 128, var216, class184.method1188(var215, 16383) * 128 };
                            }
                            continue;
                        }
                        if (var497 == 5407) {
                            var6--;
                            int var219 = class74.field1155[class37.field555[var6]].length >> 1;
                            class37.field555[var6++] = var219;
                            continue;
                        }
                        if (var497 == 5411) {
                            if (class282.field4503 == null) {
                                class114.method788((byte) 100, false, class279.method1877(-1));
                            } else {
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var497 == 5419) {
                            String var220 = "";
                            if (class93.field1419 != null) {
                                if (class93.field1419.field3585 == null) {
                                    var220 = class32.method230(true, class93.field1419.field3584);
                                } else {
                                    var220 = (String) class93.field1419.field3585;
                                }
                            }
                            class22.field285[var7++] = var220;
                            continue;
                        }
                        if (var497 == 5420) {
                            class37.field555[var6++] = class83.field1286 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 5421) {
                            var7--;
                            String var221 = class22.field285[var7];
                            var6--;
                            boolean var222 = class37.field555[var6] == 1;
                            String var223 = class279.method1877(-1) + var221;
                            if (class282.field4503 == null && (!var222 || class83.field1286 == 3 || !class83.field1270.startsWith("win") || class118.field1736)) {
                                class114.method788((byte) -59, var222, var223);
                                continue;
                            }
                            class96.field1457 = var223;
                            class211.field3032 = var222;
                            class184.field2631 = class163.field2378.method557((byte) 76, var223);
                            continue;
                        }
                        if (var497 == 5422) {
                            var7 -= 2;
                            String var224 = class22.field285[var7];
                            String var225 = class22.field285[var7 + 1];
                            var6--;
                            int var226 = class37.field555[var6];
                            if (var224.length() > 0) {
                                if (class130.field1897 == null) {
                                    class130.field1897 = new String[class12.field187[class69.field1076]];
                                }
                                class130.field1897[var226] = var224;
                            }
                            if (var225.length() > 0) {
                                if (class59.field897 == null) {
                                    class59.field897 = new String[class12.field187[class69.field1076]];
                                }
                                class59.field897[var226] = var225;
                            }
                            continue;
                        }
                        if (var497 == 5423) {
                            var7--;
                            System.out.println(class22.field285[var7]);
                            continue;
                        }
                        if (var497 == 5424) {
                            var6 -= 11;
                            class191.field2713 = class37.field555[var6];
                            class20.field273 = class37.field555[var6 + 1];
                            class32.field474 = class37.field555[var6 + 2];
                            class47.field668 = class37.field555[var6 + 3];
                            class288.field4567 = class37.field555[var6 + 4];
                            class48.field679 = class37.field555[var6 + 5];
                            class95.field1453 = class37.field555[var6 + 6];
                            class264.field3975 = class37.field555[var6 + 7];
                            class78.field1208 = class37.field555[var6 + 8];
                            class147.field2104 = class37.field555[var6 + 9];
                            class151.field2173 = class37.field555[var6 + 10];
                            class45.field634.method1509(false, class288.field4567);
                            class45.field634.method1509(false, class48.field679);
                            class45.field634.method1509(false, class95.field1453);
                            class45.field634.method1509(false, class264.field3975);
                            class45.field634.method1509(false, class78.field1208);
                            class56.field854 = true;
                            continue;
                        }
                        if (var497 == 5425) {
                            client.method1426(28748);
                            class56.field854 = false;
                            continue;
                        }
                        if (var497 == 5426) {
                            var6--;
                            class82.field1263 = class37.field555[var6];
                            continue;
                        }
                        if (var497 == 5427) {
                            var6 -= 2;
                            class269.field4217 = class37.field555[var6];
                            class206.field2976 = class37.field555[var6 + 1];
                            continue;
                        }
                    } else if (var497 < 5600) {
                        if (var497 == 5500) {
                            var6 -= 4;
                            int var257 = class37.field555[var6];
                            int var258 = class37.field555[var6 + 3];
                            int var259 = class37.field555[var6 + 2];
                            int var260 = class37.field555[var6 + 1];
                            class37.method264(var259, var258, (var257 & 0x3FFF) - class95.field1445, false, -76, var260, (var257 >> 14 & 0x3FFF) - class113.field1615);
                            continue;
                        }
                        if (var497 == 5501) {
                            var6 -= 4;
                            int var261 = class37.field555[var6];
                            int var262 = class37.field555[var6 + 1];
                            int var263 = class37.field555[var6 + 2];
                            int var264 = class37.field555[var6 + 3];
                            class209.method1339(var264, (var261 & 0x3FFF) - class95.field1445, var262, 83, ((var261 & 0xFFFE8E2) >> 14) - class113.field1615, var263);
                            continue;
                        }
                        if (var497 == 5502) {
                            var6 -= 6;
                            int var265 = class37.field555[var6];
                            if (var265 >= 2) {
                                throw new RuntimeException();
                            }
                            class247.field3701 = var265;
                            int var266 = class37.field555[var6 + 1];
                            if (class74.field1155[class247.field3701].length >> 1 <= var266 + 1) {
                                throw new RuntimeException();
                            }
                            class183.field2613 = var266;
                            class93.field1417 = 0;
                            class277.field4440 = class37.field555[var6 + 2];
                            class210.field3022 = class37.field555[var6 + 3];
                            int var267 = class37.field555[var6 + 4];
                            if (var267 >= 2) {
                                throw new RuntimeException();
                            }
                            class261.field3936 = var267;
                            int var268 = class37.field555[var6 + 5];
                            if ((class74.field1155[class261.field3936].length >> 1) <= (var268 + 1)) {
                                throw new RuntimeException();
                            }
                            class111.field1597 = var268;
                            class68.field1069 = 3;
                            continue;
                        }
                        if (var497 == 5503) {
                            class148.method987((byte) -100);
                            continue;
                        }
                        if (var497 == 5504) {
                            var6 -= 2;
                            class103.field1535 = class37.field555[var6];
                            class245.field3667 = class37.field555[var6 + 1];
                            if (class68.field1069 == 2) {
                                class30.field439 = class245.field3667;
                                class146.field2097 = class103.field1535;
                            }
                            class100.method671(26);
                            continue;
                        }
                        if (var497 == 5505) {
                            class37.field555[var6++] = class103.field1535;
                            continue;
                        }
                        if (var497 == 5506) {
                            class37.field555[var6++] = class245.field3667;
                            continue;
                        }
                    } else if (var497 < 5700) {
                        if (var497 == 5600) {
                            var7 -= 2;
                            String var253 = class22.field285[var7 + 1];
                            String var254 = class22.field285[var7];
                            var6--;
                            int var255 = class37.field555[var6];
                            if (class192.field2754 == 10 && class162.field2341 == 0 && class194.field2782 == 0 && class81.field1251 == 0 && class40.field596 == 0) {
                                class75.method500(var254, true, var255, var253);
                            }
                            continue;
                        }
                        if (var497 == 5601) {
                            class175.method1147((byte) 39);
                            continue;
                        }
                        if (var497 == 5602) {
                            if (class194.field2782 == 0) {
                                class118.field1741 = -2;
                            }
                            continue;
                        }
                        if (var497 == 5603) {
                            var6 -= 4;
                            if (class192.field2754 == 10 && class162.field2341 == 0 && class194.field2782 == 0 && class81.field1251 == 0 && class40.field596 == 0) {
                                class192.method1235(class37.field555[var6 + 2], class37.field555[var6 + 1], true, class37.field555[var6], class37.field555[var6 + 3]);
                            }
                            continue;
                        }
                        if (var497 == 5604) {
                            var7--;
                            if (class192.field2754 == 10 && class162.field2341 == 0 && class194.field2782 == 0 && class81.field1251 == 0 && class40.field596 == 0) {
                                class57.method383(class109.method712((byte) -126, class22.field285[var7]), -110);
                            }
                            continue;
                        }
                        if (var497 == 5605) {
                            var6 -= 7;
                            var7 -= 3;
                            if (class192.field2754 == 10 && class162.field2341 == 0 && class194.field2782 == 0 && class81.field1251 == 0 && class40.field596 == 0) {
                                class58.method387(class37.field555[var6 + 3], class22.field285[var7 + 1], class109.method712((byte) -127, class22.field285[var7]), class37.field555[var6 + 5] == 1, (byte) 100, class37.field555[var6], class22.field285[var7 + 2], class37.field555[var6 + 1], class37.field555[var6 + 2], class37.field555[var6 + 4] == 1, class37.field555[var6 + 6] == 1);
                            }
                            continue;
                        }
                        if (var497 == 5606) {
                            if (class81.field1251 == 0) {
                                class204.field2956 = -2;
                            }
                            continue;
                        }
                        if (var497 == 5607) {
                            class37.field555[var6++] = class118.field1741;
                            continue;
                        }
                        if (var497 == 5608) {
                            class37.field555[var6++] = class62.field994;
                            continue;
                        }
                        if (var497 == 5609) {
                            class37.field555[var6++] = class204.field2956;
                            continue;
                        }
                        if (var497 == 5610) {
                            for (int var256 = 0; var256 < 5; var256++) {
                                class22.field285[var7++] = class72.field1108.length > var256 ? class206.method1326((byte) 112, class72.field1108[var256]) : "";
                            }
                            class72.field1108 = null;
                            continue;
                        }
                        if (var497 == 5611) {
                            class37.field555[var6++] = class90.field1366;
                            continue;
                        }
                    } else if (var497 < 6100) {
                        if (var497 == 6001) {
                            var6--;
                            int var244 = class37.field555[var6];
                            if (var244 < 1) {
                                var244 = 1;
                            }
                            if (var244 > 4) {
                                var244 = 4;
                            }
                            class92.field1401 = var244;
                            if (class92.field1401 == 1) {
                                class18.method139(0.9F);
                            }
                            if (class92.field1401 == 2) {
                                class18.method139(0.8F);
                            }
                            if (class92.field1401 == 3) {
                                class18.method139(0.7F);
                            }
                            if (class92.field1401 == 4) {
                                class18.method139(0.6F);
                            }
                            class58.method389(116);
                            class285.method1920(class163.field2378, (byte) -120);
                            class15.field229 = false;
                            continue;
                        }
                        if (var497 == 6002) {
                            var6--;
                            class263.method1750(class37.field555[var6] == 1, 0);
                            class158.method1063(false);
                            class60.method396(123);
                            class209.method1340((byte) 0);
                            class285.method1920(class163.field2378, (byte) -122);
                            class15.field229 = false;
                            continue;
                        }
                        if (var497 == 6003) {
                            var6--;
                            class1.field17 = class37.field555[var6] == 1;
                            class209.method1340((byte) 0);
                            class285.method1920(class163.field2378, (byte) -120);
                            class15.field229 = false;
                            continue;
                        }
                        if (var497 == 6005) {
                            var6--;
                            class48.field695 = class37.field555[var6] == 1;
                            class60.method396(-103);
                            class285.method1920(class163.field2378, (byte) 101);
                            class15.field229 = false;
                            continue;
                        }
                        if (var497 == 6006) {
                            var6--;
                            class193.field2760 = class37.field555[var6] == 1;
                            ((class242) class18.field252).method1578(220, !class193.field2760);
                            class285.method1920(class163.field2378, (byte) -19);
                            class15.field229 = false;
                            continue;
                        }
                        if (var497 == 6007) {
                            var6--;
                            class242.field3626 = class37.field555[var6] == 1;
                            class285.method1920(class163.field2378, (byte) 47);
                            class15.field229 = false;
                            continue;
                        }
                        if (var497 == 6008) {
                            var6--;
                            class235.field3556 = class37.field555[var6] == 1;
                            class285.method1920(class163.field2378, (byte) 41);
                            class15.field229 = false;
                            continue;
                        }
                        if (var497 == 6009) {
                            var6--;
                            class234.field3516 = class37.field555[var6] == 1;
                            class285.method1920(class163.field2378, (byte) -124);
                            class15.field229 = false;
                            continue;
                        }
                        if (var497 == 6010) {
                            var6--;
                            class1.field11 = class37.field555[var6] == 1;
                            class285.method1920(class163.field2378, (byte) -114);
                            class15.field229 = false;
                            continue;
                        }
                        if (var497 == 6011) {
                            var6--;
                            int var245 = class37.field555[var6];
                            if (var245 < 0 || var245 > 2) {
                                var245 = 0;
                            }
                            class264.field3967 = var245;
                            class285.method1920(class163.field2378, (byte) -123);
                            class15.field229 = false;
                            continue;
                        }
                        if (var497 == 6012) {
                            var6--;
                            class42.field606 = class37.field555[var6] == 1;
                            if (class92.field1401 == 1) {
                                class18.method139(0.9F);
                            }
                            if (class92.field1401 == 2) {
                                class18.method139(0.8F);
                            }
                            if (class92.field1401 == 3) {
                                class18.method139(0.7F);
                            }
                            if (class92.field1401 == 4) {
                                class18.method139(0.6F);
                            }
                            class60.method396(127);
                            class285.method1920(class163.field2378, (byte) 112);
                            class15.field229 = false;
                            continue;
                        }
                        if (var497 == 6014) {
                            var6--;
                            class147.field2100 = class37.field555[var6] == 1;
                            class285.method1920(class163.field2378, (byte) -121);
                            class15.field229 = false;
                            continue;
                        }
                        if (var497 == 6015) {
                            var6--;
                            class290.field4579 = class37.field555[var6] == 1;
                            class285.method1920(class163.field2378, (byte) -125);
                            class15.field229 = false;
                            continue;
                        }
                        if (var497 == 6016) {
                            var6--;
                            int var246 = class37.field555[var6];
                            if (var246 < 0 || var246 > 2) {
                                var246 = 0;
                            }
                            class243.field3661 = var246;
                            continue;
                        }
                        if (var497 == 6017) {
                            var6--;
                            class195.field2797 = class37.field555[var6] == 1;
                            class89.method599(17857);
                            class285.method1920(class163.field2378, (byte) 67);
                            class15.field229 = false;
                            continue;
                        }
                        if (var497 == 6018) {
                            var6--;
                            int var247 = class37.field555[var6];
                            if (var247 < 0) {
                                var247 = 0;
                            }
                            if (var247 > 127) {
                                var247 = 127;
                            }
                            class32.field473 = var247;
                            class285.method1920(class163.field2378, (byte) -124);
                            class15.field229 = false;
                            continue;
                        }
                        if (var497 == 6019) {
                            var6--;
                            int var248 = class37.field555[var6];
                            if (var248 < 0) {
                                var248 = 0;
                            }
                            if (var248 > 255) {
                                var248 = 255;
                            }
                            if (class209.field3015 != var248) {
                                if (class209.field3015 == 0 && class229.field3429 != -1) {
                                    class159.method1069(var248, -14698, 0, class53.field777, class229.field3429, false);
                                    class200.field2884 = false;
                                } else if (var248 == 0) {
                                    class149.method993(2047);
                                    class200.field2884 = false;
                                } else {
                                    class21.method160(0, var248);
                                }
                                class209.field3015 = var248;
                            }
                            class285.method1920(class163.field2378, (byte) -126);
                            class15.field229 = false;
                            continue;
                        }
                        if (var497 == 6020) {
                            var6--;
                            int var249 = class37.field555[var6];
                            if (var249 < 0) {
                                var249 = 0;
                            }
                            if (var249 > 127) {
                                var249 = 127;
                            }
                            class62.field1000 = var249;
                            class285.method1920(class163.field2378, (byte) -118);
                            class15.field229 = false;
                            continue;
                        }
                        if (var497 == 6021) {
                            var6--;
                            class163.field2380 = class37.field555[var6] == 1;
                            class209.method1340((byte) 0);
                            continue;
                        }
                        if (var497 == 6023) {
                            var6--;
                            int var250 = class37.field555[var6];
                            if (var250 < 0) {
                                var250 = 0;
                            }
                            if (var250 > 2) {
                                var250 = 2;
                            }
                            boolean var251 = false;
                            if (class154.field2251 < 96) {
                                var251 = true;
                                var250 = 0;
                            }
                            class112.method727(var250);
                            class285.method1920(class163.field2378, (byte) -13);
                            class15.field229 = false;
                            class37.field555[var6++] = var251 ? 0 : 1;
                            continue;
                        }
                        if (var497 == 6024) {
                            var6--;
                            int var252 = class37.field555[var6];
                            if (var252 < 0 || var252 > 2) {
                                var252 = 0;
                            }
                            class148.field2112 = var252;
                            class285.method1920(class163.field2378, (byte) -124);
                            continue;
                        }
                        if (var497 == 6028) {
                            var6--;
                            class262.field3949 = class37.field555[var6] != 0;
                            class285.method1920(class163.field2378, (byte) -117);
                            continue;
                        }
                    } else if (var497 < 6200) {
                        if (var497 == 6101) {
                            class37.field555[var6++] = class92.field1401;
                            continue;
                        }
                        if (var497 == 6102) {
                            class37.field555[var6++] = class202.method1310(false) ? 1 : 0;
                            continue;
                        }
                        if (var497 == 6103) {
                            class37.field555[var6++] = class1.field17 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 6105) {
                            class37.field555[var6++] = class48.field695 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 6106) {
                            class37.field555[var6++] = class193.field2760 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 6107) {
                            class37.field555[var6++] = class242.field3626 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 6108) {
                            class37.field555[var6++] = class235.field3556 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 6109) {
                            class37.field555[var6++] = class234.field3516 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 6110) {
                            class37.field555[var6++] = class1.field11 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 6111) {
                            class37.field555[var6++] = class264.field3967;
                            continue;
                        }
                        if (var497 == 6112) {
                            class37.field555[var6++] = class42.field606 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 6114) {
                            class37.field555[var6++] = class147.field2100 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 6115) {
                            class37.field555[var6++] = class290.field4579 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 6116) {
                            class37.field555[var6++] = class243.field3661;
                            continue;
                        }
                        if (var497 == 6117) {
                            class37.field555[var6++] = class195.field2797 ? 1 : 0;
                            continue;
                        }
                        if (var497 == 6118) {
                            class37.field555[var6++] = class32.field473;
                            continue;
                        }
                        if (var497 == 6119) {
                            class37.field555[var6++] = class209.field3015;
                            continue;
                        }
                        if (var497 == 6120) {
                            class37.field555[var6++] = class62.field1000;
                            continue;
                        }
                        if (var497 == 6121) {
                            class37.field555[var6++] = 0;
                            continue;
                        }
                        if (var497 == 6123) {
                            class37.field555[var6++] = class112.method726();
                            continue;
                        }
                        if (var497 == 6124) {
                            class37.field555[var6++] = class148.field2112;
                            continue;
                        }
                        if (var497 == 6128) {
                            class37.field555[var6++] = class262.field3949 ? 1 : 0;
                            continue;
                        }
                    } else if (var497 < 6300) {
                        if (var497 == 6200) {
                            var6 -= 2;
                            class103.field1537 = (short) class37.field555[var6];
                            if (class103.field1537 <= 0) {
                                class103.field1537 = 256;
                            }
                            class154.field2258 = (short) class37.field555[var6 + 1];
                            if (class154.field2258 <= 0) {
                                class154.field2258 = 205;
                            }
                            continue;
                        }
                        if (var497 == 6201) {
                            var6 -= 2;
                            class137.field1986 = (short) class37.field555[var6];
                            if (class137.field1986 <= 0) {
                                class137.field1986 = 256;
                            }
                            class266.field4006 = (short) class37.field555[var6 + 1];
                            if (class266.field4006 <= 0) {
                                class266.field4006 = 320;
                            }
                            continue;
                        }
                        if (var497 == 6202) {
                            var6 -= 4;
                            class178.field2537 = (short) class37.field555[var6];
                            if (class178.field2537 <= 0) {
                                class178.field2537 = 1;
                            }
                            class188.field2677 = (short) class37.field555[var6 + 1];
                            if (class188.field2677 <= 0) {
                                class188.field2677 = 32767;
                            } else if (class188.field2677 < class178.field2537) {
                                class188.field2677 = class178.field2537;
                            }
                            class137.field1990 = (short) class37.field555[var6 + 2];
                            if (class137.field1990 <= 0) {
                                class137.field1990 = 1;
                            }
                            class262.field3948 = (short) class37.field555[var6 + 3];
                            if (class262.field3948 <= 0) {
                                class262.field3948 = 32767;
                            } else if (class137.field1990 > class262.field3948) {
                                class262.field3948 = class137.field1990;
                            }
                            continue;
                        }
                        if (var497 == 6203) {
                            class10.method93(class21.field280.field4177, false, 0, class21.field280.field4051, -1715, 0);
                            class37.field555[var6++] = class62.field996;
                            class37.field555[var6++] = class13.field207;
                            continue;
                        }
                        if (var497 == 6204) {
                            class37.field555[var6++] = class137.field1986;
                            class37.field555[var6++] = class266.field4006;
                            continue;
                        }
                        if (var497 == 6205) {
                            class37.field555[var6++] = class103.field1537;
                            class37.field555[var6++] = class154.field2258;
                            continue;
                        }
                    } else if (var497 < 6400) {
                        if (var497 == 6300) {
                            class37.field555[var6++] = (int) (class287.method1928(27332) / 60000L);
                            continue;
                        }
                        if (var497 == 6301) {
                            class37.field555[var6++] = (int) (class287.method1928(27332) / 86400000L) - 11745;
                            continue;
                        }
                        if (var497 == 6302) {
                            var6 -= 3;
                            int var239 = class37.field555[var6];
                            int var240 = class37.field555[var6 + 1];
                            int var241 = class37.field555[var6 + 2];
                            class235.field3549.clear();
                            class235.field3549.set(11, 12);
                            class235.field3549.set(var241, var240, var239);
                            class37.field555[var6++] = (int) (class235.field3549.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var497 == 6303) {
                            class235.field3549.clear();
                            class235.field3549.setTime(new Date(class287.method1928(27332)));
                            class37.field555[var6++] = class235.field3549.get(1);
                            continue;
                        }
                        if (var497 == 6304) {
                            var6--;
                            int var242 = class37.field555[var6];
                            boolean var243 = true;
                            if (var242 < 0) {
                                var243 = ((var242 + 1) % 4) == 0;
                            } else if (var242 < 1582) {
                                var243 = (var242 % 4) == 0;
                            } else if ((var242 % 4) != 0) {
                                var243 = false;
                            } else if ((var242 % 100) != 0) {
                                var243 = true;
                            } else if ((var242 % 400) != 0) {
                                var243 = false;
                            }
                            class37.field555[var6++] = var243 ? 1 : 0;
                            continue;
                        }
                    } else if (var497 < 6500) {
                        if (var497 == 6405) {
                            class37.field555[var6++] = class77.method513(1498549772) ? 1 : 0;
                            continue;
                        }
                        if (var497 == 6406) {
                            class37.field555[var6++] = class90.method608(-15921) ? 1 : 0;
                            continue;
                        }
                    } else if (var497 < 6600) {
                        if (var497 == 6500) {
                            if (class192.field2754 == 10 && class162.field2341 == 0 && class194.field2782 == 0 && class81.field1251 == 0) {
                                class37.field555[var6++] = class269.method1798(6) == -1 ? 0 : 1;
                                continue;
                            }
                            class37.field555[var6++] = 1;
                            continue;
                        }
                        if (var497 == 6501) {
                            class55 var227 = client.method1427((byte) -26);
                            if (var227 == null) {
                                class37.field555[var6++] = -1;
                                class37.field555[var6++] = 0;
                                class22.field285[var7++] = "";
                                class37.field555[var6++] = 0;
                                class22.field285[var7++] = "";
                                class37.field555[var6++] = 0;
                            } else {
                                class37.field555[var6++] = var227.field838;
                                class37.field555[var6++] = var227.field4487;
                                class22.field285[var7++] = var227.field841;
                                class70 var228 = var227.method372(false);
                                class37.field555[var6++] = var228.field1090;
                                class22.field285[var7++] = var228.field1094;
                                class37.field555[var6++] = var227.field4483;
                            }
                            continue;
                        }
                        if (var497 == 6502) {
                            class55 var229 = class236.method1551(true);
                            if (var229 == null) {
                                class37.field555[var6++] = -1;
                                class37.field555[var6++] = 0;
                                class22.field285[var7++] = "";
                                class37.field555[var6++] = 0;
                                class22.field285[var7++] = "";
                                class37.field555[var6++] = 0;
                            } else {
                                class37.field555[var6++] = var229.field838;
                                class37.field555[var6++] = var229.field4487;
                                class22.field285[var7++] = var229.field841;
                                class70 var230 = var229.method372(false);
                                class37.field555[var6++] = var230.field1090;
                                class22.field285[var7++] = var230.field1094;
                                class37.field555[var6++] = var229.field4483;
                            }
                            continue;
                        }
                        if (var497 == 6503) {
                            var6--;
                            int var231 = class37.field555[var6];
                            if (class192.field2754 == 10 && class162.field2341 == 0 && class194.field2782 == 0 && class81.field1251 == 0) {
                                class37.field555[var6++] = class43.method295(97, var231) ? 1 : 0;
                                continue;
                            }
                            class37.field555[var6++] = 0;
                            continue;
                        }
                        if (var497 == 6504) {
                            var6--;
                            class190.field2708 = class37.field555[var6];
                            class285.method1920(class163.field2378, (byte) -125);
                            continue;
                        }
                        if (var497 == 6505) {
                            class37.field555[var6++] = class190.field2708;
                            continue;
                        }
                        if (var497 == 6506) {
                            var6--;
                            int var232 = class37.field555[var6];
                            class55 var233 = class10.method90(var232, true);
                            if (var233 == null) {
                                class37.field555[var6++] = -1;
                                class22.field285[var7++] = "";
                                class37.field555[var6++] = 0;
                                class22.field285[var7++] = "";
                                class37.field555[var6++] = 0;
                            } else {
                                class37.field555[var6++] = var233.field4487;
                                class22.field285[var7++] = var233.field841;
                                class70 var234 = var233.method372(false);
                                class37.field555[var6++] = var234.field1090;
                                class22.field285[var7++] = var234.field1094;
                                class37.field555[var6++] = var233.field4483;
                            }
                            continue;
                        }
                        if (var497 == 6507) {
                            var6 -= 4;
                            int var235 = class37.field555[var6];
                            boolean var236 = class37.field555[var6 + 1] == 1;
                            int var237 = class37.field555[var6 + 2];
                            boolean var238 = class37.field555[var6 + 3] == 1;
                            class53.method352(var235, var237, var238, (byte) -96, var236);
                            continue;
                        }
                    } else if (var497 < 6700) {
                        if (var497 == 6600) {
                            var6--;
                            class107.field1555 = class37.field555[var6] == 1;
                            class285.method1920(class163.field2378, (byte) -118);
                            continue;
                        }
                        if (var497 == 6601) {
                            class37.field555[var6++] = class107.field1555 ? 1 : 0;
                            continue;
                        }
                    }
                } else {
                    class267 var58;
                    if (var497 < 2000) {
                        var58 = var47 ? class78.field1210 : class267.field4094;
                    } else {
                        var6--;
                        var58 = class282.method1897(class37.field555[var6], 78);
                        var497 -= 1000;
                    }
                    if (var497 == 1300) {
                        var6--;
                        int var59 = class37.field555[var6] - 1;
                        if (var59 >= 0 && var59 <= 9) {
                            var7--;
                            var58.method1785(var59, (byte) -116, class22.field285[var7]);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var497 == 1301) {
                        var6 -= 2;
                        int var60 = class37.field555[var6];
                        int var61 = class37.field555[var6 + 1];
                        var58.field4028 = class22.method165(var61, false, var60);
                        continue;
                    }
                    if (var497 == 1302) {
                        var6--;
                        var58.field4075 = class37.field555[var6] == 1;
                        continue;
                    }
                    if (var497 == 1303) {
                        var6--;
                        var58.field4159 = class37.field555[var6];
                        continue;
                    }
                    if (var497 == 1304) {
                        var6--;
                        var58.field4082 = class37.field555[var6];
                        continue;
                    }
                    if (var497 == 1305) {
                        var7--;
                        var58.field4093 = class22.field285[var7];
                        continue;
                    }
                    if (var497 == 1306) {
                        var7--;
                        var58.field4161 = class22.field285[var7];
                        continue;
                    }
                    if (var497 == 1307) {
                        var58.field4108 = null;
                        continue;
                    }
                    if (var497 == 1308) {
                        var6--;
                        var58.field4063 = class37.field555[var6];
                        var6--;
                        var58.field4092 = class37.field555[var6];
                        continue;
                    }
                    if (var497 == 1309) {
                        var6--;
                        int var62 = class37.field555[var6];
                        var6--;
                        int var63 = class37.field555[var6];
                        if (var63 >= 1 && var63 <= 10) {
                            var58.method1789((byte) 22, var62, var63 - 1);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var496) {
            if (var5.field344 == null) {
                if (class180.field2579 != 0) {
                    class255.method1712((byte) 72, "Clientscript error - check log for details", 0, "");
                }
                class37.method259(123, "CS2 - scr:" + var5.field3851 + " op:" + var11, var496);
            } else {
                StringBuffer var493 = new StringBuffer(30);
                var493.append("%0a - in: ").append(var5.field344);
                for (int var494 = class52.field761 - 1; var494 >= 0; var494--) {
                    var493.append("%0a - via: ").append(class48.field685[var494].field2054.field344);
                }
                if (var11 == 40) {
                    int var495 = var10[var8];
                    var493.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var495));
                }
                if (class180.field2579 != 0) {
                    class255.method1712((byte) 72, "Clientscript error in: " + var5.field344, 0, "");
                }
                class37.method259(-18, "CS2 - scr:" + var5.field3851 + " op:" + var11 + var493.toString(), var496);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZIZI)V")
    public static final void method827(boolean arg0, int arg1, boolean arg2, int arg3) {
        field1765++;
        int var10002;
        for (int var4 = 0; var4 < class51.field756; var4++) {
            class72 var22 = class82.field1268[class67.field1049[var4]];
            if (var22 != null && var22.method71(false) && var22.field1119.method1825(false)) {
                int var23 = var22.method57(0);
                if (arg2) {
                    if (!var22.field1119.field4251) {
                        continue;
                    }
                } else if (arg0 != var22.field1119.field4269 || arg1 != 0 && arg1 != var23) {
                    continue;
                }
                if (var23 == 1) {
                    if ((var22.field45 & 0x7F) == 64 && (var22.field94 & 0x7F) == 64) {
                        int var30 = var22.field45 >> 7;
                        int var31 = var22.field94 >> 7;
                        if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                            var10002 = class180.field2575[var30][var31]++;
                        }
                    }
                } else if (((var23 & 0x1) != 0 || (var22.field45 & 0x7F) == 0 && (var22.field94 & 0x7F) == 0) && ((var23 & 0x1) != 1 || (var22.field45 & 0x7F) == 64 && (var22.field94 & 0x7F) == 64)) {
                    int var24 = var22.field45 - var23 * 64 >> 7;
                    int var25 = var22.field94 - (var23 * 64) >> 7;
                    int var26 = var22.method57(0) + var24;
                    int var27 = var25 + var22.method57(0);
                    if (var24 < 0) {
                        var24 = 0;
                    }
                    if (var26 > 104) {
                        var26 = 104;
                    }
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (var27 > 104) {
                        var27 = 104;
                    }
                    for (int var28 = var24; var28 < var26; var28++) {
                        for (int var29 = var25; var29 < var27; var29++) {
                            var10002 = class180.field2575[var28][var29]++;
                        }
                    }
                }
            }
        }
        int var5 = -6 / ((arg3 + 74) / 44);
        label206: for (int var6 = 0; var6 < class51.field756; var6++) {
            class72 var7 = class82.field1268[class67.field1049[var6]];
            long var8 = (long) class67.field1049[var6] << 32 | 0x20000000L;
            if (var7 != null && var7.method71(false) && var7.field1119.method1825(false)) {
                int var10 = var7.method57(0);
                if (arg2) {
                    if (!var7.field1119.field4251) {
                        continue;
                    }
                } else if (var7.field1119.field4269 != arg0 || arg1 != 0 && arg1 != var10) {
                    continue;
                }
                var7.field89 = true;
                if (var10 == 1) {
                    if ((var7.field45 & 0x7F) == 64 && (var7.field94 & 0x7F) == 64) {
                        int var11 = var7.field45 >> 7;
                        int var12 = var7.field94 >> 7;
                        if (var11 < 0 || var11 >= 104 || var12 < 0 || var12 >= 104) {
                            continue;
                        }
                        if (class180.field2575[var11][var12] > 1) {
                            var10002 = class180.field2575[var11][var12]--;
                            continue;
                        }
                    }
                } else if ((var10 & 0x1) == 0 && (var7.field45 & 0x7F) == 0 && (var7.field94 & 0x7F) == 0 || (var10 & 0x1) == 1 && (var7.field45 & 0x7F) == 64 && (var7.field94 & 0x7F) == 64) {
                    int var13 = var7.field45 - (var10 * 64) >> 7;
                    int var14 = var7.field94 - var10 * 64 >> 7;
                    int var15 = var10 + var13;
                    if (var15 > 104) {
                        var15 = 104;
                    }
                    boolean var16 = true;
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    int var17 = var10 + var14;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    if (var17 > 104) {
                        var17 = 104;
                    }
                    for (int var18 = var13; var18 < var15; var18++) {
                        for (int var21 = var14; var21 < var17; var21++) {
                            if (class180.field2575[var18][var21] <= 1) {
                                var16 = false;
                                break;
                            }
                        }
                    }
                    if (var16) {
                        int var19 = var13;
                        while (true) {
                            if (var19 >= var15) {
                                continue label206;
                            }
                            for (int var20 = var14; var20 < var17; var20++) {
                                var10002 = class180.field2575[var19][var20]--;
                            }
                            var19++;
                        }
                    }
                }
                if (!var7.field1119.field4240) {
                    var8 |= Long.MIN_VALUE;
                }
                var7.field89 = false;
                var7.field113 = class81.method542(var7.field45, -1, class163.field2364, var7.field94);
                class43.method294(class163.field2364, var7.field45, var7.field94, var7.field113, var10 * 64 + 60 - 64, var7, var7.field104, var8, var7.field83);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lve;Lve;I)V")
    public static final void method828(class233 arg0, class233 arg1, int arg2) {
        class15.field219 = arg1;
        class22.field289 = arg0;
        field1762++;
        if (arg2 <= 40) {
            field1761 = 4;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
    public static void method829(byte arg0) {
        field1766 = null;
        if (arg0 <= 123) {
            method826(1, -102, (class234) null);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    private static final void method830(int arg0) {
        if (arg0 != -22298) {
            method829((byte) -9);
        }
        field1760++;
        class95.field1451.method522(104, 28727);
        class175.field2487++;
        class95.field1451.method765(532401312, 0L);
    }
}
