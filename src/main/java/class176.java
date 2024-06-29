import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class176 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Lkf;")
    public static class249 field2668;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 6)
    public static void method1222(int arg0) {
        if (arg0 == -25157) {
            field2668 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)I", line = 22)
    public static final int method1223(byte arg0, int arg1) {
        field2669++;
        if (arg0 != 11) {
            method1225(-114, (String) null, false, 63);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILsb;I)V", line = 35)
    public static final void method1224(int arg0, class126 arg1, int arg2) {
        int var3 = 0;
        field2673++;
        class278.field4378 = 0;
        int var4 = 0;
        int var5 = -1;
        int[] var6 = arg1.field1785;
        int[] var7 = arg1.field1788;
        byte var8 = -1;
        try {
            int var9 = arg0;
            label4458: while (true) {
                var9++;
                if (var9 > arg2) {
                    throw new RuntimeException("slow");
                }
                var5++;
                int var537 = var6[var5];
                if (var537 < 100) {
                    if (var537 == 0) {
                        class242.field3749[var3++] = var7[var5];
                        continue;
                    }
                    if (var537 == 1) {
                        int var10 = var7[var5];
                        class242.field3749[var3++] = class255.field4041[var10];
                        continue;
                    }
                    if (var537 == 2) {
                        int var11 = var7[var5];
                        var3--;
                        class253.method1793(true, class242.field3749[var3], var11);
                        continue;
                    }
                    if (var537 == 3) {
                        class252.field3997[var4++] = arg1.field1787[var5];
                        continue;
                    }
                    if (var537 == 6) {
                        var5 += var7[var5];
                        continue;
                    }
                    if (var537 == 7) {
                        var3 -= 2;
                        if (class242.field3749[var3 + 1] != class242.field3749[var3]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var537 == 8) {
                        var3 -= 2;
                        if (class242.field3749[var3 + 1] == class242.field3749[var3]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var537 == 9) {
                        var3 -= 2;
                        if (class242.field3749[var3 + 1] > class242.field3749[var3]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var537 == 10) {
                        var3 -= 2;
                        if (class242.field3749[var3 + 1] < class242.field3749[var3]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var537 == 21) {
                        if (class278.field4378 == 0) {
                            return;
                        }
                        class256 var12 = class91.field1199[--class278.field4378];
                        var5 = var12.field4048;
                        class250.field3958 = var12.field4043;
                        arg1 = var12.field4055;
                        var7 = arg1.field1788;
                        class41.field447 = var12.field4052;
                        var6 = arg1.field1785;
                        continue;
                    }
                    if (var537 == 25) {
                        int var13 = var7[var5];
                        class242.field3749[var3++] = class201.method1396((byte) -90, var13);
                        continue;
                    }
                    if (var537 == 27) {
                        int var14 = var7[var5];
                        var3--;
                        class117.method766((byte) 111, class242.field3749[var3], var14);
                        continue;
                    }
                    if (var537 == 31) {
                        var3 -= 2;
                        if (class242.field3749[var3 + 1] >= class242.field3749[var3]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var537 == 32) {
                        var3 -= 2;
                        if (class242.field3749[var3 + 1] <= class242.field3749[var3]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var537 == 33) {
                        class242.field3749[var3++] = class41.field447[var7[var5]];
                        continue;
                    }
                    int var10001;
                    if (var537 == 34) {
                        var10001 = var7[var5];
                        var3--;
                        class41.field447[var10001] = class242.field3749[var3];
                        continue;
                    }
                    if (var537 == 35) {
                        class252.field3997[var4++] = class250.field3958[var7[var5]];
                        continue;
                    }
                    if (var537 == 36) {
                        var10001 = var7[var5];
                        var4--;
                        class250.field3958[var10001] = class252.field3997[var4];
                        continue;
                    }
                    if (var537 == 37) {
                        int var15 = var7[var5];
                        var4 -= var15;
                        String var16 = class33.method232(-69, var4, class252.field3997, var15);
                        class252.field3997[var4++] = var16;
                        continue;
                    }
                    if (var537 == 38) {
                        var3--;
                        continue;
                    }
                    if (var537 == 39) {
                        var4--;
                        continue;
                    }
                    if (var537 == 40) {
                        int var17 = var7[var5];
                        class126 var18 = class246.method1752(arg0 + 5439488, var17);
                        int[] var19 = new int[var18.field1784];
                        String[] var20 = new String[var18.field1791];
                        for (int var21 = 0; var21 < var18.field1779; var21++) {
                            var19[var21] = class242.field3749[var3 + var21 - var18.field1779];
                        }
                        for (int var22 = 0; var22 < var18.field1789; var22++) {
                            var20[var22] = class252.field3997[var4 + var22 - var18.field1789];
                        }
                        var3 -= var18.field1779;
                        var4 -= var18.field1789;
                        class256 var23 = new class256();
                        var23.field4043 = class250.field3958;
                        var23.field4055 = arg1;
                        var23.field4052 = class41.field447;
                        var23.field4048 = var5;
                        if (class91.field1199.length <= class278.field4378) {
                            throw new RuntimeException();
                        }
                        class91.field1199[class278.field4378++] = var23;
                        var5 = -1;
                        arg1 = var18;
                        class41.field447 = var19;
                        var7 = var18.field1788;
                        var6 = var18.field1785;
                        class250.field3958 = var20;
                        continue;
                    }
                    if (var537 == 42) {
                        class242.field3749[var3++] = class203.field3091[var7[var5]];
                        continue;
                    }
                    if (var537 == 43) {
                        int var24 = var7[var5];
                        var3--;
                        class203.field3091[var24] = class242.field3749[var3];
                        class315.method2225(var24, false);
                        continue;
                    }
                    if (var537 == 44) {
                        int var25 = var7[var5] >> 16;
                        var3--;
                        int var26 = class242.field3749[var3];
                        int var27 = var7[var5] & 0xFFFF;
                        if (var26 >= 0 && var26 <= 5000) {
                            class11.field116[var25] = var26;
                            byte var28 = -1;
                            if (var27 == 105) {
                                var28 = 0;
                            }
                            int var29 = 0;
                            while (true) {
                                if (var29 >= var26) {
                                    continue label4458;
                                }
                                class302.field4707[var25][var29] = var28;
                                var29++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var537 == 45) {
                        int var30 = var7[var5];
                        var3--;
                        int var31 = class242.field3749[var3];
                        if (var31 >= 0 && class11.field116[var30] > var31) {
                            class242.field3749[var3++] = class302.field4707[var30][var31];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var537 == 46) {
                        int var32 = var7[var5];
                        var3 -= 2;
                        int var33 = class242.field3749[var3];
                        if (var33 >= 0 && class11.field116[var32] > var33) {
                            class302.field4707[var32][var33] = class242.field3749[var3 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var537 == 47) {
                        String var34 = class55.field639[var7[var5]];
                        if (var34 == null) {
                            var34 = "null";
                        }
                        class252.field3997[var4++] = var34;
                        continue;
                    }
                    if (var537 == 48) {
                        int var35 = var7[var5];
                        var4--;
                        class55.field639[var35] = class252.field3997[var4];
                        class241.method1705(var35, -128);
                        continue;
                    }
                    if (var537 == 51) {
                        class117 var36 = arg1.field1780[var7[var5]];
                        var3--;
                        class305 var37 = (class305) var36.method770((long) class242.field3749[var3], -80);
                        if (var37 != null) {
                            var5 += var37.field4748;
                        }
                        continue;
                    }
                }
                boolean var38;
                if (var7[var5] == 1) {
                    var38 = true;
                } else {
                    var38 = false;
                }
                int var10000;
                if (var537 < 300) {
                    if (var537 == 100) {
                        var3 -= 3;
                        int var517 = class242.field3749[var3];
                        int var518 = class242.field3749[var3 + 1];
                        int var519 = class242.field3749[var3 + 2];
                        if (var518 == 0) {
                            throw new RuntimeException();
                        }
                        class323 var520 = class45.method277(arg0 ^ 0xFFFFCDBE, var517);
                        if (var520.field5036 == null) {
                            var520.field5036 = new class323[var519 + 1];
                        }
                        if (var520.field5036.length <= var519) {
                            class323[] var521 = new class323[var519 + 1];
                            for (int var522 = 0; var522 < var520.field5036.length; var522++) {
                                var521[var522] = var520.field5036[var522];
                            }
                            var520.field5036 = var521;
                        }
                        if (var519 > 0 && var520.field5036[var519 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var519 - 1));
                        }
                        class323 var523 = new class323();
                        var523.field5112 = var519;
                        var523.field5172 = true;
                        var523.field5196 = var523.field5073 = var520.field5073;
                        var523.field5107 = var518;
                        var520.field5036[var519] = var523;
                        if (var38) {
                            class52.field610 = var523;
                        } else {
                            class259.field4100 = var523;
                        }
                        class107.method693(var520, 6);
                        continue;
                    }
                    if (var537 == 101) {
                        class323 var524 = var38 ? class52.field610 : class259.field4100;
                        if (var524.field5112 == -1) {
                            if (!var38) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class323 var525 = class45.method277(-12866, var524.field5073);
                        var525.field5036[var524.field5112] = null;
                        class107.method693(var525, 6);
                        continue;
                    }
                    if (var537 == 102) {
                        var10000 = arg0 - 12866;
                        var3--;
                        class323 var526 = class45.method277(var10000, class242.field3749[var3]);
                        var526.field5036 = null;
                        class107.method693(var526, 6);
                        continue;
                    }
                    if (var537 == 200) {
                        var3 -= 2;
                        int var527 = class242.field3749[var3];
                        int var528 = class242.field3749[var3 + 1];
                        class323 var529 = class291.method2078(var527, var528, 0);
                        if (var529 != null && var528 != -1) {
                            class242.field3749[var3++] = 1;
                            if (var38) {
                                class52.field610 = var529;
                            } else {
                                class259.field4100 = var529;
                            }
                            continue;
                        }
                        class242.field3749[var3++] = 0;
                        continue;
                    }
                    if (var537 == 201) {
                        var3--;
                        int var530 = class242.field3749[var3];
                        class323 var531 = class45.method277(arg0 ^ 0xFFFFCDBE, var530);
                        if (var531 == null) {
                            class242.field3749[var3++] = 0;
                        } else {
                            class242.field3749[var3++] = 1;
                            if (var38) {
                                class52.field610 = var531;
                            } else {
                                class259.field4100 = var531;
                            }
                        }
                        continue;
                    }
                } else if (var537 < 500) {
                    if (var537 == 403) {
                        var3 -= 2;
                        int var510 = class242.field3749[var3];
                        int var511 = class242.field3749[var3 + 1];
                        for (int var512 = 0; var512 < class95.field1303.length; var512++) {
                            if (class95.field1303[var512] == var510) {
                                class11.field113.field813.method1741(var512, var511, true);
                                continue label4458;
                            }
                        }
                        int var513 = 0;
                        while (true) {
                            if (class106.field1459.length <= var513) {
                                continue label4458;
                            }
                            if (class106.field1459[var513] == var510) {
                                class11.field113.field813.method1741(var513, var511, true);
                                continue label4458;
                            }
                            var513++;
                        }
                    }
                    if (var537 == 404) {
                        var3 -= 2;
                        int var514 = class242.field3749[var3 + 1];
                        int var515 = class242.field3749[var3];
                        class11.field113.field813.method1744(var515, var514, 1073741824);
                        continue;
                    }
                    if (var537 == 410) {
                        var3--;
                        boolean var516 = class242.field3749[var3] != 0;
                        class11.field113.field813.method1740(var516, 123);
                        continue;
                    }
                } else if (!(var537 < 1000 || var537 >= 1100) || !(var537 < 2000 || var537 >= 2100)) {
                    class323 var504;
                    if (var537 >= 2000) {
                        var3--;
                        var504 = class45.method277(-12866, class242.field3749[var3]);
                        var537 -= 1000;
                    } else {
                        var504 = var38 ? class52.field610 : class259.field4100;
                    }
                    if (var537 == 1000) {
                        var3 -= 4;
                        var504.field5144 = class242.field3749[var3];
                        var504.field5063 = class242.field3749[var3 + 1];
                        int var505 = class242.field3749[var3 + 3];
                        if (var505 < 0) {
                            var505 = 0;
                        } else if (var505 > 5) {
                            var505 = 5;
                        }
                        int var506 = class242.field3749[var3 + 2];
                        var504.field5108 = (byte) var505;
                        if (var506 < 0) {
                            var506 = 0;
                        } else if (var506 > 5) {
                            var506 = 5;
                        }
                        var504.field5146 = (byte) var506;
                        class107.method693(var504, 6);
                        class277.method1984((byte) -116, var504);
                        if (var504.field5112 == -1) {
                            class91.method569((byte) -79, var504.field5073);
                        }
                        continue;
                    }
                    if (var537 == 1001) {
                        var3 -= 4;
                        var504.field5095 = class242.field3749[var3];
                        var504.field5131 = class242.field3749[var3 + 1];
                        var504.field5067 = 0;
                        var504.field5168 = 0;
                        int var507 = class242.field3749[var3 + 2];
                        int var508 = class242.field3749[var3 + 3];
                        if (var507 < 0) {
                            var507 = 0;
                        } else if (var507 > 4) {
                            var507 = 4;
                        }
                        if (var508 < 0) {
                            var508 = 0;
                        } else if (var508 > 4) {
                            var508 = 4;
                        }
                        var504.field5128 = (byte) var508;
                        var504.field5110 = (byte) var507;
                        class107.method693(var504, arg0 ^ 0x6);
                        class277.method1984((byte) -116, var504);
                        if (var504.field5107 == 0) {
                            class310.method2194(false, 24206, var504);
                        }
                        continue;
                    }
                    if (var537 == 1003) {
                        var3--;
                        boolean var509 = class242.field3749[var3] == 1;
                        if (var504.field5132 != var509) {
                            var504.field5132 = var509;
                            class107.method693(var504, arg0 ^ 0x6);
                        }
                        if (var504.field5112 == -1) {
                            class292.method2082(var504.field5073, (byte) 35);
                        }
                        continue;
                    }
                    if (var537 == 1004) {
                        var3 -= 2;
                        var504.field5145 = class242.field3749[var3];
                        var504.field5197 = class242.field3749[var3 + 1];
                        class107.method693(var504, 6);
                        class277.method1984((byte) -116, var504);
                        if (var504.field5107 == 0) {
                            class310.method2194(false, 24206, var504);
                        }
                        continue;
                    }
                    if (var537 == 1005) {
                        var3--;
                        var504.field5129 = class242.field3749[var3] == 1;
                        continue;
                    }
                } else if (!(var537 < 1100 || var537 >= 1200) || !(var537 < 2100 || var537 >= 2200)) {
                    class323 var39;
                    if (var537 < 2000) {
                        var39 = var38 ? class52.field610 : class259.field4100;
                    } else {
                        var537 -= 1000;
                        var3--;
                        var39 = class45.method277(-12866, class242.field3749[var3]);
                    }
                    if (var537 == 1100) {
                        var3 -= 2;
                        var39.field5142 = class242.field3749[var3];
                        if (var39.field5142 > (var39.field5186 - var39.field5169)) {
                            var39.field5142 = var39.field5186 - var39.field5169;
                        }
                        if (var39.field5142 < 0) {
                            var39.field5142 = 0;
                        }
                        var39.field5188 = class242.field3749[var3 + 1];
                        if (var39.field5188 > var39.field5187 - var39.field5174) {
                            var39.field5188 = var39.field5187 - var39.field5174;
                        }
                        if (var39.field5188 < 0) {
                            var39.field5188 = 0;
                        }
                        class107.method693(var39, 6);
                        if (var39.field5112 == -1) {
                            class110.method714(var39.field5073, -11700);
                        }
                        continue;
                    }
                    if (var537 == 1101) {
                        var3--;
                        var39.field5060 = class242.field3749[var3];
                        class107.method693(var39, arg0 + 6);
                        if (var39.field5112 == -1) {
                            class259.method1830(arg0 ^ 0xFFFFFFB0, var39.field5073);
                        }
                        continue;
                    }
                    if (var537 == 1102) {
                        var3--;
                        var39.field5094 = class242.field3749[var3] == 1;
                        class107.method693(var39, 6);
                        continue;
                    }
                    if (var537 == 1103) {
                        var3--;
                        var39.field5183 = class242.field3749[var3];
                        class107.method693(var39, 6);
                        continue;
                    }
                    if (var537 == 1104) {
                        var3--;
                        var39.field5109 = class242.field3749[var3];
                        class107.method693(var39, 6);
                        continue;
                    }
                    if (var537 == 1105) {
                        var3--;
                        var39.field5191 = class242.field3749[var3];
                        class107.method693(var39, 6);
                        continue;
                    }
                    if (var537 == 1106) {
                        var3--;
                        var39.field5166 = class242.field3749[var3];
                        class107.method693(var39, 6);
                        continue;
                    }
                    if (var537 == 1107) {
                        var3--;
                        var39.field5025 = class242.field3749[var3] == 1;
                        class107.method693(var39, 6);
                        continue;
                    }
                    if (var537 == 1108) {
                        var39.field5161 = 1;
                        var3--;
                        var39.field5020 = class242.field3749[var3];
                        class107.method693(var39, 6);
                        if (var39.field5112 == -1) {
                            class25.method183(var39.field5073, arg0 ^ 0x4);
                        }
                        continue;
                    }
                    if (var537 == 1109) {
                        var3 -= 6;
                        var39.field5023 = class242.field3749[var3];
                        var39.field5081 = class242.field3749[var3 + 1];
                        var39.field5032 = class242.field3749[var3 + 2];
                        var39.field5072 = class242.field3749[var3 + 3];
                        var39.field5091 = class242.field3749[var3 + 4];
                        var39.field5121 = class242.field3749[var3 + 5];
                        class107.method693(var39, 6);
                        if (var39.field5112 == -1) {
                            class135.method930(var39.field5073, (byte) -106);
                            class281.method2031((byte) -50, var39.field5073);
                        }
                        continue;
                    }
                    if (var537 == 1110) {
                        var3--;
                        int var40 = class242.field3749[var3];
                        if (var39.field5026 != var40) {
                            var39.field5026 = var40;
                            var39.field5064 = 0;
                            var39.field5122 = 1;
                            var39.field5021 = 0;
                            class107.method693(var39, arg0 ^ 0x6);
                        }
                        if (var39.field5112 == -1) {
                            class353.method2441(5, var39.field5073);
                        }
                        continue;
                    }
                    if (var537 == 1111) {
                        var3--;
                        var39.field5099 = class242.field3749[var3] == 1;
                        class107.method693(var39, 6);
                        continue;
                    }
                    if (var537 == 1112) {
                        var4--;
                        String var41 = class252.field3997[var4];
                        if (!var41.equals(var39.field5098)) {
                            var39.field5098 = var41;
                            class107.method693(var39, arg0 + 6);
                        }
                        if (var39.field5112 == -1) {
                            class156.method1137((byte) -16, var39.field5073);
                        }
                        continue;
                    }
                    if (var537 == 1113) {
                        var3--;
                        var39.field5033 = class242.field3749[var3];
                        class107.method693(var39, 6);
                        continue;
                    }
                    if (var537 == 1114) {
                        var3 -= 3;
                        var39.field5019 = class242.field3749[var3];
                        var39.field5080 = class242.field3749[var3 + 1];
                        var39.field5134 = class242.field3749[var3 + 2];
                        class107.method693(var39, 6);
                        continue;
                    }
                    if (var537 == 1115) {
                        var3--;
                        var39.field5054 = class242.field3749[var3] == 1;
                        class107.method693(var39, 6);
                        continue;
                    }
                    if (var537 == 1116) {
                        var3--;
                        var39.field5045 = class242.field3749[var3];
                        class107.method693(var39, 6);
                        continue;
                    }
                    if (var537 == 1117) {
                        var3--;
                        var39.field5158 = class242.field3749[var3];
                        class107.method693(var39, 6);
                        continue;
                    }
                    if (var537 == 1118) {
                        var3--;
                        var39.field5199 = class242.field3749[var3] == 1;
                        class107.method693(var39, 6);
                        continue;
                    }
                    if (var537 == 1119) {
                        var3--;
                        var39.field5156 = class242.field3749[var3] == 1;
                        class107.method693(var39, 6);
                        continue;
                    }
                    if (var537 == 1120) {
                        var3 -= 2;
                        var39.field5186 = class242.field3749[var3];
                        var39.field5187 = class242.field3749[var3 + 1];
                        class107.method693(var39, arg0 + 6);
                        if (var39.field5107 == 0) {
                            class310.method2194(false, 24206, var39);
                        }
                        continue;
                    }
                    if (var537 == 1121) {
                        var3 -= 2;
                        var39.field5180 = (short) class242.field3749[var3];
                        var39.field5111 = (short) class242.field3749[var3 + 1];
                        class107.method693(var39, arg0 ^ 0x6);
                        continue;
                    }
                    if (var537 == 1122) {
                        var3--;
                        var39.field5068 = class242.field3749[var3] == 1;
                        class107.method693(var39, 6);
                        continue;
                    }
                    if (var537 == 1123) {
                        var3--;
                        var39.field5121 = class242.field3749[var3];
                        class107.method693(var39, arg0 ^ 0x6);
                        if (var39.field5112 == -1) {
                            class135.method930(var39.field5073, (byte) 69);
                        }
                        continue;
                    }
                    if (var537 == 1124) {
                        var3--;
                        int var42 = class242.field3749[var3];
                        var39.field5189 = var42 == 1;
                        class107.method693(var39, 6);
                        continue;
                    }
                } else if (!(var537 < 1200 || var537 >= 1300) || !(var537 < 2200 || var537 >= 2300)) {
                    class323 var500;
                    if (var537 < 2000) {
                        var500 = var38 ? class52.field610 : class259.field4100;
                    } else {
                        var537 -= 1000;
                        var3--;
                        var500 = class45.method277(-12866, class242.field3749[var3]);
                    }
                    class107.method693(var500, arg0 + 6);
                    if (var537 == 1200 || var537 == 1205 || var537 == 1208 || var537 == 1209) {
                        var3 -= 2;
                        int var501 = class242.field3749[var3 + 1];
                        int var502 = class242.field3749[var3];
                        if (var500.field5112 == -1) {
                            class112.method726(var500.field5073, (byte) 127);
                            class135.method930(var500.field5073, (byte) -111);
                            class281.method2031((byte) -98, var500.field5073);
                        }
                        if (var502 == -1) {
                            var500.field5195 = -1;
                            var500.field5161 = 1;
                            var500.field5020 = -1;
                            continue;
                        }
                        var500.field5195 = var502;
                        var500.field5066 = var501;
                        if (var537 == 1208 || var537 == 1209) {
                            var500.field5043 = true;
                        } else {
                            var500.field5043 = false;
                        }
                        class309 var503 = class190.method1302(var502, (byte) 115);
                        var500.field5032 = var503.field4866;
                        var500.field5081 = var503.field4815;
                        var500.field5023 = var503.field4802;
                        var500.field5072 = var503.field4822;
                        var500.field5121 = var503.field4836;
                        if (var537 == 1205) {
                            var500.field5100 = false;
                        } else {
                            var500.field5100 = true;
                        }
                        var500.field5091 = var503.field4790;
                        if (var500.field5168 > 0) {
                            var500.field5121 = var500.field5121 * 32 / var500.field5168;
                        } else if (var500.field5095 > 0) {
                            var500.field5121 = var500.field5121 * 32 / var500.field5095;
                        }
                        continue;
                    }
                    if (var537 == 1201) {
                        var500.field5161 = 2;
                        var3--;
                        var500.field5020 = class242.field3749[var3];
                        if (var500.field5112 == -1) {
                            class25.method183(var500.field5073, 4);
                        }
                        continue;
                    }
                    if (var537 == 1202) {
                        var500.field5161 = 3;
                        var500.field5020 = class11.field113.field813.method1753(346087929);
                        if (var500.field5112 == -1) {
                            class25.method183(var500.field5073, 4);
                        }
                        continue;
                    }
                    if (var537 == 1203) {
                        var500.field5161 = 6;
                        var3--;
                        var500.field5020 = class242.field3749[var3];
                        if (var500.field5112 == -1) {
                            class25.method183(var500.field5073, arg0 + 4);
                        }
                        continue;
                    }
                    if (var537 == 1204) {
                        var500.field5161 = 5;
                        var3--;
                        var500.field5020 = class242.field3749[var3];
                        if (var500.field5112 == -1) {
                            class25.method183(var500.field5073, 4);
                        }
                        continue;
                    }
                    if (var537 == 1206) {
                        var3 -= 4;
                        var500.field5184 = class242.field3749[var3];
                        var500.field5084 = class242.field3749[var3 + 1];
                        var500.field5140 = class242.field3749[var3 + 2];
                        var500.field5053 = class242.field3749[var3 + 3];
                        class107.method693(var500, arg0 + 6);
                        continue;
                    }
                    if (var537 == 1207) {
                        var3 -= 2;
                        var500.field5152 = class242.field3749[var3];
                        var500.field5167 = class242.field3749[var3 + 1];
                        class107.method693(var500, arg0 ^ 0x6);
                        continue;
                    }
                } else if ((var537 < 1300 || var537 >= 1400) && (var537 < 2300 || var537 >= 2400)) {
                    if (var537 >= 1400 && var537 < 1500 || var537 >= 2400 && var537 < 2500) {
                        class323 var49;
                        if (var537 >= 2000) {
                            var537 -= 1000;
                            var10000 = arg0 ^ 0xFFFFCDBE;
                            var3--;
                            var49 = class45.method277(var10000, class242.field3749[var3]);
                        } else {
                            var49 = var38 ? class52.field610 : class259.field4100;
                        }
                        var4--;
                        String var50 = class252.field3997[var4];
                        int[] var51 = null;
                        if (var50.length() > 0 && var50.charAt(var50.length() - 1) == 'Y') {
                            var3--;
                            int var52 = class242.field3749[var3];
                            if (var52 > 0) {
                                var51 = new int[var52];
                                while (var52-- > 0) {
                                    var3--;
                                    var51[var52] = class242.field3749[var3];
                                }
                            }
                            var50 = var50.substring(0, var50.length() - 1);
                        }
                        Object[] var53 = new Object[var50.length() + 1];
                        for (int var54 = var53.length - 1; var54 >= 1; var54--) {
                            if (var50.charAt(var54 - 1) == 's') {
                                var4--;
                                var53[var54] = class252.field3997[var4];
                            } else {
                                var3--;
                                var53[var54] = Integer.valueOf(class242.field3749[var3]);
                            }
                        }
                        var3--;
                        int var55 = class242.field3749[var3];
                        if (var55 == -1) {
                            var53 = null;
                        } else {
                            var53[0] = Integer.valueOf(var55);
                        }
                        if (var537 == 1400) {
                            var49.field5086 = var53;
                        } else if (var537 == 1401) {
                            var49.field5157 = var53;
                        } else if (var537 == 1402) {
                            var49.field5192 = var53;
                        } else if (var537 == 1403) {
                            var49.field5077 = var53;
                        } else if (var537 == 1404) {
                            var49.field5027 = var53;
                        } else if (var537 == 1405) {
                            var49.field5120 = var53;
                        } else if (var537 == 1406) {
                            var49.field5040 = var53;
                        } else if (var537 == 1407) {
                            var49.field5179 = var51;
                            var49.field5119 = var53;
                        } else if (var537 == 1408) {
                            var49.field5031 = var53;
                        } else if (var537 == 1409) {
                            var49.field5137 = var53;
                        } else if (var537 == 1410) {
                            var49.field5024 = var53;
                        } else if (var537 == 1411) {
                            var49.field5049 = var53;
                        } else if (var537 == 1412) {
                            var49.field5149 = var53;
                        } else if (var537 == 1414) {
                            var49.field5154 = var51;
                            var49.field5044 = var53;
                        } else if (var537 == 1415) {
                            var49.field5090 = var53;
                            var49.field5083 = var51;
                        } else if (var537 == 1416) {
                            var49.field5126 = var53;
                        } else if (var537 == 1417) {
                            var49.field5201 = var53;
                        } else if (var537 == 1418) {
                            var49.field5170 = var53;
                        } else if (var537 == 1419) {
                            var49.field5101 = var53;
                        } else if (var537 == 1420) {
                            var49.field5028 = var53;
                        } else if (var537 == 1421) {
                            var49.field5123 = var53;
                        } else if (var537 == 1422) {
                            var49.field5017 = var53;
                        } else if (var537 == 1423) {
                            var49.field5133 = var53;
                        } else if (var537 == 1424) {
                            var49.field5016 = var53;
                        } else if (var537 == 1425) {
                            var49.field5178 = var53;
                        } else if (var537 == 1426) {
                            var49.field5075 = var53;
                        } else if (var537 == 1427) {
                            var49.field5051 = var53;
                        } else if (var537 == 1428) {
                            var49.field5059 = var51;
                            var49.field5115 = var53;
                        } else if (var537 == 1429) {
                            var49.field5082 = var51;
                            var49.field5047 = var53;
                        }
                        var49.field5048 = true;
                        continue;
                    }
                    if (var537 < 1600) {
                        class323 var499 = var38 ? class52.field610 : class259.field4100;
                        if (var537 == 1500) {
                            class242.field3749[var3++] = var499.field5029;
                            continue;
                        }
                        if (var537 == 1501) {
                            class242.field3749[var3++] = var499.field5104;
                            continue;
                        }
                        if (var537 == 1502) {
                            class242.field3749[var3++] = var499.field5169;
                            continue;
                        }
                        if (var537 == 1503) {
                            class242.field3749[var3++] = var499.field5174;
                            continue;
                        }
                        if (var537 == 1504) {
                            class242.field3749[var3++] = var499.field5132 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 1505) {
                            class242.field3749[var3++] = var499.field5196;
                            continue;
                        }
                    } else if (var537 < 1700) {
                        class323 var498 = var38 ? class52.field610 : class259.field4100;
                        if (var537 == 1600) {
                            class242.field3749[var3++] = var498.field5142;
                            continue;
                        }
                        if (var537 == 1601) {
                            class242.field3749[var3++] = var498.field5188;
                            continue;
                        }
                        if (var537 == 1602) {
                            class252.field3997[var4++] = var498.field5098;
                            continue;
                        }
                        if (var537 == 1603) {
                            class242.field3749[var3++] = var498.field5186;
                            continue;
                        }
                        if (var537 == 1604) {
                            class242.field3749[var3++] = var498.field5187;
                            continue;
                        }
                        if (var537 == 1605) {
                            class242.field3749[var3++] = var498.field5121;
                            continue;
                        }
                        if (var537 == 1606) {
                            class242.field3749[var3++] = var498.field5032;
                            continue;
                        }
                        if (var537 == 1607) {
                            class242.field3749[var3++] = var498.field5091;
                            continue;
                        }
                        if (var537 == 1608) {
                            class242.field3749[var3++] = var498.field5072;
                            continue;
                        }
                        if (var537 == 1609) {
                            class242.field3749[var3++] = var498.field5183;
                            continue;
                        }
                        if (var537 == 1610) {
                            class242.field3749[var3++] = var498.field5023;
                            continue;
                        }
                        if (var537 == 1611) {
                            class242.field3749[var3++] = var498.field5081;
                            continue;
                        }
                        if (var537 == 1612) {
                            class242.field3749[var3++] = var498.field5191;
                            continue;
                        }
                    } else if (var537 < 1800) {
                        class323 var497 = var38 ? class52.field610 : class259.field4100;
                        if (var537 == 1700) {
                            class242.field3749[var3++] = var497.field5195;
                            continue;
                        }
                        if (var537 == 1701) {
                            if (var497.field5195 == -1) {
                                class242.field3749[var3++] = 0;
                            } else {
                                class242.field3749[var3++] = var497.field5066;
                            }
                            continue;
                        }
                        if (var537 == 1702) {
                            class242.field3749[var3++] = var497.field5112;
                            continue;
                        }
                    } else if (var537 < 1900) {
                        class323 var495 = var38 ? class52.field610 : class259.field4100;
                        if (var537 == 1800) {
                            class242.field3749[var3++] = client.method2013(var495).method485((byte) -61);
                            continue;
                        }
                        if (var537 == 1801) {
                            var3--;
                            int var496 = class242.field3749[var3];
                            int var539 = var496 - 1;
                            if (var495.field5117 != null && var495.field5117.length > var539 && var495.field5117[var539] != null) {
                                class252.field3997[var4++] = var495.field5117[var539];
                                continue;
                            }
                            class252.field3997[var4++] = "";
                            continue;
                        }
                        if (var537 == 1802) {
                            if (var495.field5105 == null) {
                                class252.field3997[var4++] = "";
                            } else {
                                class252.field3997[var4++] = var495.field5105;
                            }
                            continue;
                        }
                    } else if (var537 < 2600) {
                        var3--;
                        class323 var56 = class45.method277(-12866, class242.field3749[var3]);
                        if (var537 == 2500) {
                            class242.field3749[var3++] = var56.field5029;
                            continue;
                        }
                        if (var537 == 2501) {
                            class242.field3749[var3++] = var56.field5104;
                            continue;
                        }
                        if (var537 == 2502) {
                            class242.field3749[var3++] = var56.field5169;
                            continue;
                        }
                        if (var537 == 2503) {
                            class242.field3749[var3++] = var56.field5174;
                            continue;
                        }
                        if (var537 == 2504) {
                            class242.field3749[var3++] = var56.field5132 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 2505) {
                            class242.field3749[var3++] = var56.field5196;
                            continue;
                        }
                    } else if (var537 < 2700) {
                        var3--;
                        class323 var57 = class45.method277(-12866, class242.field3749[var3]);
                        if (var537 == 2600) {
                            class242.field3749[var3++] = var57.field5142;
                            continue;
                        }
                        if (var537 == 2601) {
                            class242.field3749[var3++] = var57.field5188;
                            continue;
                        }
                        if (var537 == 2602) {
                            class252.field3997[var4++] = var57.field5098;
                            continue;
                        }
                        if (var537 == 2603) {
                            class242.field3749[var3++] = var57.field5186;
                            continue;
                        }
                        if (var537 == 2604) {
                            class242.field3749[var3++] = var57.field5187;
                            continue;
                        }
                        if (var537 == 2605) {
                            class242.field3749[var3++] = var57.field5121;
                            continue;
                        }
                        if (var537 == 2606) {
                            class242.field3749[var3++] = var57.field5032;
                            continue;
                        }
                        if (var537 == 2607) {
                            class242.field3749[var3++] = var57.field5091;
                            continue;
                        }
                        if (var537 == 2608) {
                            class242.field3749[var3++] = var57.field5072;
                            continue;
                        }
                        if (var537 == 2609) {
                            class242.field3749[var3++] = var57.field5183;
                            continue;
                        }
                        if (var537 == 2610) {
                            class242.field3749[var3++] = var57.field5023;
                            continue;
                        }
                        if (var537 == 2611) {
                            class242.field3749[var3++] = var57.field5081;
                            continue;
                        }
                        if (var537 == 2612) {
                            class242.field3749[var3++] = var57.field5191;
                            continue;
                        }
                    } else if (var537 < 2800) {
                        if (var537 == 2700) {
                            var3--;
                            class323 var58 = class45.method277(-12866, class242.field3749[var3]);
                            class242.field3749[var3++] = var58.field5195;
                            continue;
                        }
                        if (var537 == 2701) {
                            var3--;
                            class323 var59 = class45.method277(-12866, class242.field3749[var3]);
                            if (var59.field5195 == -1) {
                                class242.field3749[var3++] = 0;
                            } else {
                                class242.field3749[var3++] = var59.field5066;
                            }
                            continue;
                        }
                        if (var537 == 2702) {
                            var3--;
                            int var60 = class242.field3749[var3];
                            class238 var61 = (class238) class88.field1166.method770((long) var60, -98);
                            if (var61 == null) {
                                class242.field3749[var3++] = 0;
                            } else {
                                class242.field3749[var3++] = 1;
                            }
                            continue;
                        }
                        if (var537 == 2703) {
                            var3--;
                            class323 var62 = class45.method277(-12866, class242.field3749[var3]);
                            if (var62.field5036 == null) {
                                class242.field3749[var3++] = 0;
                                continue;
                            }
                            int var63 = var62.field5036.length;
                            for (int var64 = 0; var64 < var62.field5036.length; var64++) {
                                if (var62.field5036[var64] == null) {
                                    var63 = var64;
                                    break;
                                }
                            }
                            class242.field3749[var3++] = var63;
                            continue;
                        }
                        if (var537 == 2704 || var537 == 2705) {
                            var3 -= 2;
                            int var65 = class242.field3749[var3];
                            int var66 = class242.field3749[var3 + 1];
                            class238 var67 = (class238) class88.field1166.method770((long) var65, 49);
                            if (var67 != null && var67.field3658 == var66) {
                                class242.field3749[var3++] = 1;
                            } else {
                                class242.field3749[var3++] = 0;
                            }
                            continue;
                        }
                    } else if (var537 < 2900) {
                        var3--;
                        class323 var493 = class45.method277(-12866, class242.field3749[var3]);
                        if (var537 == 2800) {
                            class242.field3749[var3++] = client.method2013(var493).method485((byte) -57);
                            continue;
                        }
                        if (var537 == 2801) {
                            var3--;
                            int var494 = class242.field3749[var3];
                            int var538 = var494 - 1;
                            if (var493.field5117 != null && var493.field5117.length > var538 && var493.field5117[var538] != null) {
                                class252.field3997[var4++] = var493.field5117[var538];
                                continue;
                            }
                            class252.field3997[var4++] = "";
                            continue;
                        }
                        if (var537 == 2802) {
                            if (var493.field5105 == null) {
                                class252.field3997[var4++] = "";
                            } else {
                                class252.field3997[var4++] = var493.field5105;
                            }
                            continue;
                        }
                    } else if (var537 < 3200) {
                        if (var537 == 3100) {
                            var4--;
                            String var68 = class252.field3997[var4];
                            class306.method2157(var68, false, 0, "");
                            continue;
                        }
                        if (var537 == 3101) {
                            var3 -= 2;
                            class122.method785(class11.field113, class242.field3749[var3], class242.field3749[var3 + 1], true);
                            continue;
                        }
                        if (var537 == 3103) {
                            class154.method1124(-85);
                            continue;
                        }
                        if (var537 == 3104) {
                            class331.field5301++;
                            int var69 = 0;
                            var4--;
                            String var70 = class252.field3997[var4];
                            if (class128.method875(var70, 0)) {
                                var69 = class74.method467(-63, var70);
                            }
                            class328.field5282.method304(242, 19830);
                            class328.field5282.method1052(var69, false);
                            continue;
                        }
                        if (var537 == 3105) {
                            class115.field1594++;
                            var4--;
                            String var71 = class252.field3997[var4];
                            class328.field5282.method304(37, 19830);
                            class328.field5282.method1039(class294.method2093((byte) 100, var71), (byte) 92);
                            continue;
                        }
                        if (var537 == 3106) {
                            class76.field996++;
                            var4--;
                            String var72 = class252.field3997[var4];
                            class328.field5282.method304(36, 19830);
                            class328.field5282.method1055(var72.length() + 1, 96);
                            class328.field5282.method1050(var72, -79);
                            continue;
                        }
                        if (var537 == 3107) {
                            var3--;
                            int var73 = class242.field3749[var3];
                            var4--;
                            String var74 = class252.field3997[var4];
                            class278.method1985(var73, var74, true);
                            continue;
                        }
                        if (var537 == 3108) {
                            var3 -= 3;
                            int var75 = class242.field3749[var3];
                            int var76 = class242.field3749[var3 + 1];
                            int var77 = class242.field3749[var3 + 2];
                            class323 var78 = class45.method277(-12866, var77);
                            class310.method2195(var76, var75, false, var78);
                            continue;
                        }
                        if (var537 == 3109) {
                            var3 -= 2;
                            int var79 = class242.field3749[var3];
                            class323 var80 = var38 ? class52.field610 : class259.field4100;
                            int var81 = class242.field3749[var3 + 1];
                            class310.method2195(var81, var79, false, var80);
                            continue;
                        }
                        if (var537 == 3110) {
                            class89.field1179++;
                            var3--;
                            int var82 = class242.field3749[var3];
                            class328.field5282.method304(25, arg0 ^ 0x4D76);
                            class328.field5282.method1003(var82, -2);
                            continue;
                        }
                    } else if (var537 < 3300) {
                        if (var537 == 3200) {
                            var3 -= 3;
                            class42.method264(class242.field3749[var3 + 1], class242.field3749[var3], class242.field3749[var3 + 2], 255, -51);
                            continue;
                        }
                        if (var537 == 3201) {
                            var3--;
                            class170.method1200(255, true, class242.field3749[var3]);
                            continue;
                        }
                        if (var537 == 3202) {
                            var3 -= 2;
                            class135.method933(class242.field3749[var3], class242.field3749[var3 + 1], (byte) 83, 255);
                            continue;
                        }
                    } else if (var537 < 3400) {
                        if (var537 == 3300) {
                            class242.field3749[var3++] = class102.field1381;
                            continue;
                        }
                        if (var537 == 3301) {
                            var3 -= 2;
                            int var83 = class242.field3749[var3 + 1];
                            int var84 = class242.field3749[var3];
                            class242.field3749[var3++] = class185.method1277(-1, var84, var83);
                            continue;
                        }
                        if (var537 == 3302) {
                            var3 -= 2;
                            int var85 = class242.field3749[var3];
                            int var86 = class242.field3749[var3 + 1];
                            class242.field3749[var3++] = class282.method2043(false, var85, var86);
                            continue;
                        }
                        if (var537 == 3303) {
                            var3 -= 2;
                            int var87 = class242.field3749[var3];
                            int var88 = class242.field3749[var3 + 1];
                            class242.field3749[var3++] = class307.method2165(var87, var88, 93);
                            continue;
                        }
                        if (var537 == 3304) {
                            var3--;
                            int var89 = class242.field3749[var3];
                            class242.field3749[var3++] = class45.method275(var89, arg0 - 110).field1058;
                            continue;
                        }
                        if (var537 == 3305) {
                            var3--;
                            int var90 = class242.field3749[var3];
                            class242.field3749[var3++] = class344.field5464[var90];
                            continue;
                        }
                        if (var537 == 3306) {
                            var3--;
                            int var91 = class242.field3749[var3];
                            class242.field3749[var3++] = class163.field2517[var91];
                            continue;
                        }
                        if (var537 == 3307) {
                            var3--;
                            int var92 = class242.field3749[var3];
                            class242.field3749[var3++] = class322.field5009[var92];
                            continue;
                        }
                        if (var537 == 3308) {
                            int var93 = class219.field3290;
                            int var94 = (class11.field113.field3763 >> 7) + class16.field160;
                            int var95 = (class11.field113.field3767 >> 7) + class322.field4999;
                            class242.field3749[var3++] = (var93 << 28) + (var95 << 14) + var94;
                            continue;
                        }
                        if (var537 == 3309) {
                            var3--;
                            int var96 = class242.field3749[var3];
                            class242.field3749[var3++] = class261.method1840(var96 >> 14, 16383);
                            continue;
                        }
                        if (var537 == 3310) {
                            var3--;
                            int var97 = class242.field3749[var3];
                            class242.field3749[var3++] = var97 >> 28;
                            continue;
                        }
                        if (var537 == 3311) {
                            var3--;
                            int var98 = class242.field3749[var3];
                            class242.field3749[var3++] = class261.method1840(var98, 16383);
                            continue;
                        }
                        if (var537 == 3312) {
                            class242.field3749[var3++] = class33.field387 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3313) {
                            var3 -= 2;
                            int var99 = class242.field3749[var3] + 32768;
                            int var100 = class242.field3749[var3 + 1];
                            class242.field3749[var3++] = class185.method1277(-1, var99, var100);
                            continue;
                        }
                        if (var537 == 3314) {
                            var3 -= 2;
                            int var101 = class242.field3749[var3] + 32768;
                            int var102 = class242.field3749[var3 + 1];
                            class242.field3749[var3++] = class282.method2043(false, var101, var102);
                            continue;
                        }
                        if (var537 == 3315) {
                            var3 -= 2;
                            int var103 = class242.field3749[var3] + 32768;
                            int var104 = class242.field3749[var3 + 1];
                            class242.field3749[var3++] = class307.method2165(var103, var104, -117);
                            continue;
                        }
                        if (var537 == 3316) {
                            if (class100.field1350 < 2) {
                                class242.field3749[var3++] = 0;
                            } else {
                                class242.field3749[var3++] = class100.field1350;
                            }
                            continue;
                        }
                        if (var537 == 3317) {
                            class242.field3749[var3++] = class58.field684;
                            continue;
                        }
                        if (var537 == 3318) {
                            class242.field3749[var3++] = class196.field2976;
                            continue;
                        }
                        if (var537 == 3321) {
                            class242.field3749[var3++] = class199.field3011;
                            continue;
                        }
                        if (var537 == 3322) {
                            class242.field3749[var3++] = class263.field4175;
                            continue;
                        }
                        if (var537 == 3323) {
                            if (class314.field4936 >= 5 && class314.field4936 <= 9) {
                                class242.field3749[var3++] = 1;
                                continue;
                            }
                            class242.field3749[var3++] = 0;
                            continue;
                        }
                        if (var537 == 3324) {
                            if (class314.field4936 >= 5 && class314.field4936 <= 9) {
                                class242.field3749[var3++] = class314.field4936;
                                continue;
                            }
                            class242.field3749[var3++] = 0;
                            continue;
                        }
                        if (var537 == 3325) {
                            class242.field3749[var3++] = class274.field4341 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3326) {
                            class242.field3749[var3++] = class11.field113.field840;
                            continue;
                        }
                        if (var537 == 3327) {
                            class242.field3749[var3++] = class11.field113.field813.field3865 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3328) {
                            class242.field3749[var3++] = class334.field5339 && !class174.field2630 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3329) {
                            class242.field3749[var3++] = class201.field3043 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3330) {
                            var3--;
                            int var105 = class242.field3749[var3];
                            class242.field3749[var3++] = class303.method2141(var105, (byte) -126);
                            continue;
                        }
                        if (var537 == 3331) {
                            var3 -= 2;
                            int var106 = class242.field3749[var3 + 1];
                            int var107 = class242.field3749[var3];
                            class242.field3749[var3++] = class156.method1138(var107, (byte) -52, false, var106);
                            continue;
                        }
                        if (var537 == 3332) {
                            var3 -= 2;
                            int var108 = class242.field3749[var3 + 1];
                            int var109 = class242.field3749[var3];
                            class242.field3749[var3++] = class156.method1138(var109, (byte) -52, true, var108);
                            continue;
                        }
                        if (var537 == 3333) {
                            class242.field3749[var3++] = class117.field1638;
                            continue;
                        }
                        if (var537 == 3335) {
                            class242.field3749[var3++] = class234.field3567;
                            continue;
                        }
                        if (var537 == 3336) {
                            var3 -= 4;
                            int var110 = class242.field3749[var3];
                            int var111 = class242.field3749[var3 + 1];
                            int var112 = (var111 << 14) + var110;
                            int var113 = class242.field3749[var3 + 2];
                            int var114 = class242.field3749[var3 + 3];
                            int var115 = (var113 << 28) + var112;
                            int var116 = var114 + var115;
                            class242.field3749[var3++] = var116;
                            continue;
                        }
                        if (var537 == 3337) {
                            class242.field3749[var3++] = class233.field3522;
                            continue;
                        }
                    } else if (var537 < 3500) {
                        if (var537 == 3400) {
                            var3 -= 2;
                            int var476 = class242.field3749[var3];
                            int var477 = class242.field3749[var3 + 1];
                            class344 var478 = class314.method2219(128, var476);
                            if (var478.field5455 == 's') {
                            }
                            class252.field3997[var4++] = var478.method2383(var477, arg0 + 4);
                            continue;
                        }
                        if (var537 == 3408) {
                            var3 -= 4;
                            int var479 = class242.field3749[var3];
                            int var480 = class242.field3749[var3 + 1];
                            int var481 = class242.field3749[var3 + 2];
                            int var482 = class242.field3749[var3 + 3];
                            class344 var483 = class314.method2219(128, var481);
                            if (var483.field5458 == var479 && var483.field5455 == var480) {
                                if (var480 == 115) {
                                    class252.field3997[var4++] = var483.method2383(var482, 4);
                                } else {
                                    class242.field3749[var3++] = var483.method2384(var482, (byte) 29);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var537 == 3409) {
                            var3 -= 3;
                            int var484 = class242.field3749[var3];
                            int var485 = class242.field3749[var3 + 2];
                            int var486 = class242.field3749[var3 + 1];
                            if (var486 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class344 var487 = class314.method2219(128, var486);
                            if (var487.field5455 != var484) {
                                throw new RuntimeException("C3409-1");
                            }
                            class242.field3749[var3++] = var487.method2389(var485, (byte) -54) ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3410) {
                            var3--;
                            int var488 = class242.field3749[var3];
                            var4--;
                            String var489 = class252.field3997[var4];
                            if (var488 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class344 var490 = class314.method2219(128, var488);
                            if (var490.field5455 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class242.field3749[var3++] = var490.method2388(var489, (byte) 15) ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3411) {
                            var3--;
                            int var491 = class242.field3749[var3];
                            class344 var492 = class314.method2219(128, var491);
                            class242.field3749[var3++] = var492.field5454.method756(1);
                            continue;
                        }
                    } else if (var537 < 3700) {
                        if (var537 == 3600) {
                            if (class261.field4124 == 0) {
                                class242.field3749[var3++] = -2;
                            } else if (class261.field4124 == 1) {
                                class242.field3749[var3++] = -1;
                            } else {
                                class242.field3749[var3++] = class95.field1313;
                            }
                            continue;
                        }
                        if (var537 == 3601) {
                            var3--;
                            int var117 = class242.field3749[var3];
                            if (class261.field4124 == 2 && var117 < class95.field1313) {
                                class252.field3997[var4++] = class235.field3618[var117];
                                continue;
                            }
                            class252.field3997[var4++] = "";
                            continue;
                        }
                        if (var537 == 3602) {
                            var3--;
                            int var118 = class242.field3749[var3];
                            if (class261.field4124 == 2 && var118 < class95.field1313) {
                                class242.field3749[var3++] = class210.field3167[var118];
                                continue;
                            }
                            class242.field3749[var3++] = 0;
                            continue;
                        }
                        if (var537 == 3603) {
                            var3--;
                            int var119 = class242.field3749[var3];
                            if (class261.field4124 == 2 && class95.field1313 > var119) {
                                class242.field3749[var3++] = class333.field5332[var119];
                                continue;
                            }
                            class242.field3749[var3++] = 0;
                            continue;
                        }
                        if (var537 == 3604) {
                            var3--;
                            int var120 = class242.field3749[var3];
                            var4--;
                            String var121 = class252.field3997[var4];
                            class72.method443(arg0 - 122, var121, var120);
                            continue;
                        }
                        if (var537 == 3605) {
                            var4--;
                            String var122 = class252.field3997[var4];
                            class218.method1523(0, class294.method2093((byte) 100, var122));
                            continue;
                        }
                        if (var537 == 3606) {
                            var4--;
                            String var123 = class252.field3997[var4];
                            class117.method760(-1, class294.method2093((byte) 100, var123));
                            continue;
                        }
                        if (var537 == 3607) {
                            var4--;
                            String var124 = class252.field3997[var4];
                            class337.method2329(class294.method2093((byte) 100, var124), (byte) 106, false);
                            continue;
                        }
                        if (var537 == 3608) {
                            var4--;
                            String var125 = class252.field3997[var4];
                            class346.method2402(1, class294.method2093((byte) 100, var125));
                            continue;
                        }
                        if (var537 == 3609) {
                            var4--;
                            String var126 = class252.field3997[var4];
                            if (var126.startsWith("<img=0>") || var126.startsWith("<img=1>")) {
                                var126 = var126.substring(7);
                            }
                            class242.field3749[var3++] = class291.method2079(true, var126) ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3610) {
                            var3--;
                            int var127 = class242.field3749[var3];
                            if (class261.field4124 == 2 && class95.field1313 > var127) {
                                class252.field3997[var4++] = class353.field5616[var127];
                                continue;
                            }
                            class252.field3997[var4++] = "";
                            continue;
                        }
                        if (var537 == 3611) {
                            if (client.field4440 == null) {
                                class252.field3997[var4++] = "";
                            } else {
                                class252.field3997[var4++] = class156.method1135(client.field4440, (byte) 107);
                            }
                            continue;
                        }
                        if (var537 == 3612) {
                            if (client.field4440 == null) {
                                class242.field3749[var3++] = 0;
                            } else {
                                class242.field3749[var3++] = class41.field454;
                            }
                            continue;
                        }
                        if (var537 == 3613) {
                            var3--;
                            int var128 = class242.field3749[var3];
                            if (client.field4440 != null && var128 < class41.field454) {
                                class252.field3997[var4++] = class156.method1135(class77.field1008[var128].field1318, (byte) 100);
                                continue;
                            }
                            class252.field3997[var4++] = "";
                            continue;
                        }
                        if (var537 == 3614) {
                            var3--;
                            int var129 = class242.field3749[var3];
                            if (client.field4440 != null && var129 < class41.field454) {
                                class242.field3749[var3++] = class77.field1008[var129].field1320;
                                continue;
                            }
                            class242.field3749[var3++] = 0;
                            continue;
                        }
                        if (var537 == 3615) {
                            var3--;
                            int var130 = class242.field3749[var3];
                            if (client.field4440 != null && var130 < class41.field454) {
                                class242.field3749[var3++] = class77.field1008[var130].field1315;
                                continue;
                            }
                            class242.field3749[var3++] = 0;
                            continue;
                        }
                        if (var537 == 3616) {
                            class242.field3749[var3++] = class326.field5225;
                            continue;
                        }
                        if (var537 == 3617) {
                            var4--;
                            String var131 = class252.field3997[var4];
                            class89.method564(var131, (byte) 52);
                            continue;
                        }
                        if (var537 == 3618) {
                            class242.field3749[var3++] = class229.field3481;
                            continue;
                        }
                        if (var537 == 3619) {
                            var4--;
                            String var132 = class252.field3997[var4];
                            class212.method1480(-27897, class294.method2093((byte) 100, var132));
                            continue;
                        }
                        if (var537 == 3620) {
                            class280.method2001(arg0 ^ 0xFFFFE65E);
                            continue;
                        }
                        if (var537 == 3621) {
                            if (class261.field4124 == 0) {
                                class242.field3749[var3++] = -1;
                            } else {
                                class242.field3749[var3++] = class274.field4339;
                            }
                            continue;
                        }
                        if (var537 == 3622) {
                            var3--;
                            int var133 = class242.field3749[var3];
                            if (class261.field4124 != 0 && class274.field4339 > var133) {
                                class252.field3997[var4++] = class241.method1704(arg0 - 23, class337.field5382[var133]);
                                continue;
                            }
                            class252.field3997[var4++] = "";
                            continue;
                        }
                        if (var537 == 3623) {
                            var4--;
                            String var134 = class252.field3997[var4];
                            if (var134.startsWith("<img=0>") || var134.startsWith("<img=1>")) {
                                var134 = var134.substring(7);
                            }
                            class242.field3749[var3++] = class199.method1385(var134, 0) ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3624) {
                            var3--;
                            int var135 = class242.field3749[var3];
                            if (class77.field1008 != null && var135 < class41.field454 && class77.field1008[var135].field1318.equalsIgnoreCase(class11.field113.field848)) {
                                class242.field3749[var3++] = 1;
                                continue;
                            }
                            class242.field3749[var3++] = 0;
                            continue;
                        }
                        if (var537 == 3625) {
                            if (class244.field3843 == null) {
                                class252.field3997[var4++] = "";
                            } else {
                                class252.field3997[var4++] = class156.method1135(class244.field3843, (byte) 102);
                            }
                            continue;
                        }
                        if (var537 == 3626) {
                            var3--;
                            int var136 = class242.field3749[var3];
                            if (client.field4440 != null && class41.field454 > var136) {
                                class252.field3997[var4++] = class77.field1008[var136].field1321;
                                continue;
                            }
                            class252.field3997[var4++] = "";
                            continue;
                        }
                        if (var537 == 3627) {
                            var3--;
                            int var137 = class242.field3749[var3];
                            if (class261.field4124 == 2 && var137 >= 0 && var137 < class95.field1313) {
                                class242.field3749[var3++] = class169.field2582[var137] ? 1 : 0;
                                continue;
                            }
                            class242.field3749[var3++] = 0;
                            continue;
                        }
                        if (var537 == 3628) {
                            var4--;
                            String var138 = class252.field3997[var4];
                            if (var138.startsWith("<img=0>") || var138.startsWith("<img=1>")) {
                                var138 = var138.substring(7);
                            }
                            class242.field3749[var3++] = class122.method786(true, var138);
                            continue;
                        }
                        if (var537 == 3629) {
                            class242.field3749[var3++] = class115.field1599;
                            continue;
                        }
                        if (var537 == 3630) {
                            var4--;
                            String var139 = class252.field3997[var4];
                            class337.method2329(class294.method2093((byte) 100, var139), (byte) 118, true);
                            continue;
                        }
                        if (var537 == 3631) {
                            var3--;
                            int var140 = class242.field3749[var3];
                            class242.field3749[var3++] = class25.field296[var140] ? 1 : 0;
                            continue;
                        }
                    } else if (var537 < 4000) {
                        if (var537 == 3903) {
                            var3--;
                            int var141 = class242.field3749[var3];
                            class242.field3749[var3++] = class138.field2048[var141].method1560(0);
                            continue;
                        }
                        if (var537 == 3904) {
                            var3--;
                            int var142 = class242.field3749[var3];
                            class242.field3749[var3++] = class138.field2048[var142].field3383;
                            continue;
                        }
                        if (var537 == 3905) {
                            var3--;
                            int var143 = class242.field3749[var3];
                            class242.field3749[var3++] = class138.field2048[var143].field3384;
                            continue;
                        }
                        if (var537 == 3906) {
                            var3--;
                            int var144 = class242.field3749[var3];
                            class242.field3749[var3++] = class138.field2048[var144].field3382;
                            continue;
                        }
                        if (var537 == 3907) {
                            var3--;
                            int var145 = class242.field3749[var3];
                            class242.field3749[var3++] = class138.field2048[var145].field3376;
                            continue;
                        }
                        if (var537 == 3908) {
                            var3--;
                            int var146 = class242.field3749[var3];
                            class242.field3749[var3++] = class138.field2048[var146].field3375;
                            continue;
                        }
                        if (var537 == 3910) {
                            var3--;
                            int var147 = class242.field3749[var3];
                            int var148 = class138.field2048[var147].method1558(-1048);
                            class242.field3749[var3++] = var148 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3911) {
                            var3--;
                            int var149 = class242.field3749[var3];
                            int var150 = class138.field2048[var149].method1558(-1048);
                            class242.field3749[var3++] = var150 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3912) {
                            var3--;
                            int var151 = class242.field3749[var3];
                            int var152 = class138.field2048[var151].method1558(-1048);
                            class242.field3749[var3++] = var152 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3913) {
                            var3--;
                            int var153 = class242.field3749[var3];
                            int var154 = class138.field2048[var153].method1558(arg0 - 1048);
                            class242.field3749[var3++] = var154 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var537 < 4100) {
                        if (var537 == 4000) {
                            var3 -= 2;
                            int var431 = class242.field3749[var3];
                            int var432 = class242.field3749[var3 + 1];
                            class242.field3749[var3++] = var431 + var432;
                            continue;
                        }
                        if (var537 == 4001) {
                            var3 -= 2;
                            int var433 = class242.field3749[var3 + 1];
                            int var434 = class242.field3749[var3];
                            class242.field3749[var3++] = var434 - var433;
                            continue;
                        }
                        if (var537 == 4002) {
                            var3 -= 2;
                            int var435 = class242.field3749[var3];
                            int var436 = class242.field3749[var3 + 1];
                            class242.field3749[var3++] = var435 * var436;
                            continue;
                        }
                        if (var537 == 4003) {
                            var3 -= 2;
                            int var437 = class242.field3749[var3 + 1];
                            int var438 = class242.field3749[var3];
                            class242.field3749[var3++] = var438 / var437;
                            continue;
                        }
                        if (var537 == 4004) {
                            var3--;
                            int var439 = class242.field3749[var3];
                            class242.field3749[var3++] = (int) ((double) var439 * Math.random());
                            continue;
                        }
                        if (var537 == 4005) {
                            var3--;
                            int var440 = class242.field3749[var3];
                            class242.field3749[var3++] = (int) (Math.random() * (double) (var440 + 1));
                            continue;
                        }
                        if (var537 == 4006) {
                            var3 -= 5;
                            int var441 = class242.field3749[var3];
                            int var442 = class242.field3749[var3 + 1];
                            int var443 = class242.field3749[var3 + 2];
                            int var444 = class242.field3749[var3 + 3];
                            int var445 = class242.field3749[var3 + 4];
                            class242.field3749[var3++] = var441 + ((var442 - var441) * (var445 - var443) / (var444 - var443));
                            continue;
                        }
                        if (var537 == 4007) {
                            var3 -= 2;
                            long var446 = (long) class242.field3749[var3];
                            long var448 = (long) class242.field3749[var3 + 1];
                            class242.field3749[var3++] = (int) (var446 * var448 / 100L + var446);
                            continue;
                        }
                        if (var537 == 4008) {
                            var3 -= 2;
                            int var450 = class242.field3749[var3 + 1];
                            int var451 = class242.field3749[var3];
                            class242.field3749[var3++] = class77.method492(0x1 << var450, var451);
                            continue;
                        }
                        if (var537 == 4009) {
                            var3 -= 2;
                            int var452 = class242.field3749[var3];
                            int var453 = class242.field3749[var3 + 1];
                            class242.field3749[var3++] = class261.method1840(var452, -(0x1 << var453) - 1);
                            continue;
                        }
                        if (var537 == 4010) {
                            var3 -= 2;
                            int var454 = class242.field3749[var3 + 1];
                            int var455 = class242.field3749[var3];
                            class242.field3749[var3++] = class261.method1840(var455, 0x1 << var454) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var537 == 4011) {
                            var3 -= 2;
                            int var456 = class242.field3749[var3];
                            int var457 = class242.field3749[var3 + 1];
                            class242.field3749[var3++] = var456 % var457;
                            continue;
                        }
                        if (var537 == 4012) {
                            var3 -= 2;
                            int var458 = class242.field3749[var3 + 1];
                            int var459 = class242.field3749[var3];
                            if (var459 == 0) {
                                class242.field3749[var3++] = 0;
                            } else {
                                class242.field3749[var3++] = (int) Math.pow((double) var459, (double) var458);
                            }
                            continue;
                        }
                        if (var537 == 4013) {
                            var3 -= 2;
                            int var460 = class242.field3749[var3];
                            int var461 = class242.field3749[var3 + 1];
                            if (var460 == 0) {
                                class242.field3749[var3++] = 0;
                            } else if (var461 == 0) {
                                class242.field3749[var3++] = Integer.MAX_VALUE;
                            } else {
                                class242.field3749[var3++] = (int) Math.pow((double) var460, 1.0D / (double) var461);
                            }
                            continue;
                        }
                        if (var537 == 4014) {
                            var3 -= 2;
                            int var462 = class242.field3749[var3];
                            int var463 = class242.field3749[var3 + 1];
                            class242.field3749[var3++] = class261.method1840(var463, var462);
                            continue;
                        }
                        if (var537 == 4015) {
                            var3 -= 2;
                            int var464 = class242.field3749[var3 + 1];
                            int var465 = class242.field3749[var3];
                            class242.field3749[var3++] = class77.method492(var465, var464);
                            continue;
                        }
                        if (var537 == 4016) {
                            var3 -= 2;
                            int var466 = class242.field3749[var3 + 1];
                            int var467 = class242.field3749[var3];
                            class242.field3749[var3++] = var466 <= var467 ? var466 : var467;
                            continue;
                        }
                        if (var537 == 4017) {
                            var3 -= 2;
                            int var468 = class242.field3749[var3];
                            int var469 = class242.field3749[var3 + 1];
                            class242.field3749[var3++] = var469 < var468 ? var468 : var469;
                            continue;
                        }
                        if (var537 == 4018) {
                            var3 -= 3;
                            long var470 = (long) class242.field3749[var3 + 2];
                            long var472 = (long) class242.field3749[var3 + 1];
                            long var474 = (long) class242.field3749[var3];
                            class242.field3749[var3++] = (int) (var470 * var474 / var472);
                            continue;
                        }
                    } else if (var537 < 4200) {
                        if (var537 == 4100) {
                            var4--;
                            String var381 = class252.field3997[var4];
                            var3--;
                            int var382 = class242.field3749[var3];
                            class252.field3997[var4++] = var381 + var382;
                            continue;
                        }
                        if (var537 == 4101) {
                            var4 -= 2;
                            String var383 = class252.field3997[var4];
                            String var384 = class252.field3997[var4 + 1];
                            class252.field3997[var4++] = var383 + var384;
                            continue;
                        }
                        if (var537 == 4102) {
                            var4--;
                            String var385 = class252.field3997[var4];
                            var3--;
                            int var386 = class242.field3749[var3];
                            class252.field3997[var4++] = var385 + class205.method1438(true, (byte) 87, var386);
                            continue;
                        }
                        if (var537 == 4103) {
                            var4--;
                            String var387 = class252.field3997[var4];
                            class252.field3997[var4++] = var387.toLowerCase();
                            continue;
                        }
                        if (var537 == 4104) {
                            var3--;
                            int var388 = class242.field3749[var3];
                            long var389 = ((long) var388 + 11745L) * 86400000L;
                            class228.field3457.setTime(new Date(var389));
                            int var391 = class228.field3457.get(5);
                            int var392 = class228.field3457.get(2);
                            int var393 = class228.field3457.get(1);
                            class252.field3997[var4++] = var391 + "-" + class182.field2736[var392] + "-" + var393;
                            continue;
                        }
                        if (var537 == 4105) {
                            var4 -= 2;
                            String var394 = class252.field3997[var4];
                            String var395 = class252.field3997[var4 + 1];
                            if (class11.field113.field813 != null && class11.field113.field813.field3865) {
                                class252.field3997[var4++] = var395;
                                continue;
                            }
                            class252.field3997[var4++] = var394;
                            continue;
                        }
                        if (var537 == 4106) {
                            var3--;
                            int var396 = class242.field3749[var3];
                            class252.field3997[var4++] = Integer.toString(var396);
                            continue;
                        }
                        if (var537 == 4107) {
                            var4 -= 2;
                            class242.field3749[var3++] = class357.method2457(-93, class280.method2008(class234.field3567, -1, class252.field3997[var4 + 1], class252.field3997[var4]));
                            continue;
                        }
                        if (var537 == 4108) {
                            var4--;
                            String var397 = class252.field3997[var4];
                            var3 -= 2;
                            int var398 = class242.field3749[var3 + 1];
                            int var399 = class242.field3749[var3];
                            class242.field3749[var3++] = class327.method2273((byte) 124, var398).method1694(var397, var399);
                            continue;
                        }
                        if (var537 == 4109) {
                            var4--;
                            String var400 = class252.field3997[var4];
                            var3 -= 2;
                            int var401 = class242.field3749[var3 + 1];
                            int var402 = class242.field3749[var3];
                            class242.field3749[var3++] = class327.method2273((byte) 125, var401).method1689(var400, var402);
                            continue;
                        }
                        if (var537 == 4110) {
                            var4 -= 2;
                            String var403 = class252.field3997[var4];
                            String var404 = class252.field3997[var4 + 1];
                            var3--;
                            if (class242.field3749[var3] == 1) {
                                class252.field3997[var4++] = var403;
                            } else {
                                class252.field3997[var4++] = var404;
                            }
                            continue;
                        }
                        if (var537 == 4111) {
                            var4--;
                            String var405 = class252.field3997[var4];
                            class252.field3997[var4++] = class240.method1688(var405);
                            continue;
                        }
                        if (var537 == 4112) {
                            var3--;
                            int var406 = class242.field3749[var3];
                            var4--;
                            String var407 = class252.field3997[var4];
                            if (var406 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class252.field3997[var4++] = var407 + (char) var406;
                            continue;
                        }
                        if (var537 == 4113) {
                            var3--;
                            int var408 = class242.field3749[var3];
                            class242.field3749[var3++] = class130.method895((byte) -93, (char) var408) ? 1 : 0;
                            continue;
                        }
                        if (var537 == 4114) {
                            var3--;
                            int var409 = class242.field3749[var3];
                            class242.field3749[var3++] = class160.method1159((byte) 11, (char) var409) ? 1 : 0;
                            continue;
                        }
                        if (var537 == 4115) {
                            var3--;
                            int var410 = class242.field3749[var3];
                            class242.field3749[var3++] = class210.method1460((char) var410, (byte) 85) ? 1 : 0;
                            continue;
                        }
                        if (var537 == 4116) {
                            var3--;
                            int var411 = class242.field3749[var3];
                            class242.field3749[var3++] = class70.method438((char) var411, 0) ? 1 : 0;
                            continue;
                        }
                        if (var537 == 4117) {
                            var4--;
                            String var412 = class252.field3997[var4];
                            if (var412 == null) {
                                class242.field3749[var3++] = 0;
                            } else {
                                class242.field3749[var3++] = var412.length();
                            }
                            continue;
                        }
                        if (var537 == 4118) {
                            var3 -= 2;
                            int var413 = class242.field3749[var3];
                            var4--;
                            String var414 = class252.field3997[var4];
                            int var415 = class242.field3749[var3 + 1];
                            class252.field3997[var4++] = var414.substring(var413, var415);
                            continue;
                        }
                        if (var537 == 4119) {
                            var4--;
                            String var416 = class252.field3997[var4];
                            StringBuffer var417 = new StringBuffer(var416.length());
                            boolean var418 = false;
                            for (int var419 = 0; var419 < var416.length(); var419++) {
                                char var420 = var416.charAt(var419);
                                if (var420 == '<') {
                                    var418 = true;
                                } else if (var420 == '>') {
                                    var418 = false;
                                } else if (!var418) {
                                    var417.append(var420);
                                }
                            }
                            class252.field3997[var4++] = var417.toString();
                            continue;
                        }
                        if (var537 == 4120) {
                            var4--;
                            String var421 = class252.field3997[var4];
                            var3 -= 2;
                            int var422 = class242.field3749[var3 + 1];
                            int var423 = class242.field3749[var3];
                            class242.field3749[var3++] = var421.indexOf(var423, var422);
                            continue;
                        }
                        if (var537 == 4121) {
                            var4 -= 2;
                            String var424 = class252.field3997[var4];
                            var3--;
                            int var425 = class242.field3749[var3];
                            String var426 = class252.field3997[var4 + 1];
                            class242.field3749[var3++] = var424.indexOf(var426, var425);
                            continue;
                        }
                        if (var537 == 4122) {
                            var3--;
                            int var427 = class242.field3749[var3];
                            class242.field3749[var3++] = Character.toLowerCase((char) var427);
                            continue;
                        }
                        if (var537 == 4123) {
                            var3--;
                            int var428 = class242.field3749[var3];
                            class242.field3749[var3++] = Character.toUpperCase((char) var428);
                            continue;
                        }
                        if (var537 == 4124) {
                            var3--;
                            boolean var429 = class242.field3749[var3] != 0;
                            var3--;
                            int var430 = class242.field3749[var3];
                            class252.field3997[var4++] = class93.method614((long) var430, var429, 0, class234.field3567, (byte) 124);
                            continue;
                        }
                    } else if (var537 < 4300) {
                        if (var537 == 4200) {
                            var3--;
                            int var155 = class242.field3749[var3];
                            class252.field3997[var4++] = class190.method1302(var155, (byte) -125).field4868;
                            continue;
                        }
                        if (var537 == 4201) {
                            var3 -= 2;
                            int var156 = class242.field3749[var3];
                            int var157 = class242.field3749[var3 + 1];
                            class309 var158 = class190.method1302(var156, (byte) -120);
                            if (var157 >= 1 && var157 <= 5 && var158.field4850[var157 - 1] != null) {
                                class252.field3997[var4++] = var158.field4850[var157 - 1];
                                continue;
                            }
                            class252.field3997[var4++] = "";
                            continue;
                        }
                        if (var537 == 4202) {
                            var3 -= 2;
                            int var159 = class242.field3749[var3];
                            int var160 = class242.field3749[var3 + 1];
                            class309 var161 = class190.method1302(var159, (byte) -124);
                            if (var160 >= 1 && var160 <= 5 && var161.field4824[var160 - 1] != null) {
                                class252.field3997[var4++] = var161.field4824[var160 - 1];
                                continue;
                            }
                            class252.field3997[var4++] = "";
                            continue;
                        }
                        if (var537 == 4203) {
                            var3--;
                            int var162 = class242.field3749[var3];
                            class242.field3749[var3++] = class190.method1302(var162, (byte) 57).field4826;
                            continue;
                        }
                        if (var537 == 4204) {
                            var3--;
                            int var163 = class242.field3749[var3];
                            class242.field3749[var3++] = class190.method1302(var163, (byte) 119).field4814 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 4205) {
                            var3--;
                            int var164 = class242.field3749[var3];
                            class309 var165 = class190.method1302(var164, (byte) 99);
                            if (var165.field4860 == -1 && var165.field4846 >= 0) {
                                class242.field3749[var3++] = var165.field4846;
                                continue;
                            }
                            class242.field3749[var3++] = var164;
                            continue;
                        }
                        if (var537 == 4206) {
                            var3--;
                            int var166 = class242.field3749[var3];
                            class309 var167 = class190.method1302(var166, (byte) 118);
                            if (var167.field4860 >= 0 && var167.field4846 >= 0) {
                                class242.field3749[var3++] = var167.field4846;
                                continue;
                            }
                            class242.field3749[var3++] = var166;
                            continue;
                        }
                        if (var537 == 4207) {
                            var3--;
                            int var168 = class242.field3749[var3];
                            class242.field3749[var3++] = class190.method1302(var168, (byte) 107).field4867 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 4208) {
                            var3 -= 2;
                            int var169 = class242.field3749[var3 + 1];
                            int var170 = class242.field3749[var3];
                            class303 var171 = class113.method733(var169, true);
                            if (var171.method2135(-103)) {
                                class252.field3997[var4++] = class190.method1302(var170, (byte) -112).method2184(var169, (byte) -120, var171.field4712);
                            } else {
                                class242.field3749[var3++] = class190.method1302(var170, (byte) 22).method2180(var171.field4714, var169, false);
                            }
                            continue;
                        }
                        if (var537 == 4210) {
                            var3--;
                            int var172 = class242.field3749[var3];
                            var4--;
                            String var173 = class252.field3997[var4];
                            class189.method1295(var173, var172 == 1, (byte) 76);
                            class242.field3749[var3++] = class142.field2217;
                            continue;
                        }
                        if (var537 == 4211) {
                            if (class181.field2733 != null && class142.field2217 > class279.field4387) {
                                class242.field3749[var3++] = class261.method1840(65535, class181.field2733[class279.field4387++]);
                                continue;
                            }
                            class242.field3749[var3++] = -1;
                            continue;
                        }
                        if (var537 == 4212) {
                            class279.field4387 = 0;
                            continue;
                        }
                    } else if (var537 >= 4400) {
                        if (var537 >= 4500) {
                            if (var537 >= 4600) {
                                if (var537 < 5100) {
                                    if (var537 == 5000) {
                                        class242.field3749[var3++] = class132.field1903;
                                        continue;
                                    }
                                    if (var537 == 5001) {
                                        class143.field2227++;
                                        var3 -= 3;
                                        class132.field1903 = class242.field3749[var3];
                                        class55.field661 = class242.field3749[var3 + 1];
                                        class4.field40 = class242.field3749[var3 + 2];
                                        class328.field5282.method304(8, 19830);
                                        class328.field5282.method1055(class132.field1903, arg0 ^ 0x66);
                                        class328.field5282.method1055(class55.field661, 104);
                                        class328.field5282.method1055(class4.field40, arg0 + 97);
                                        continue;
                                    }
                                    if (var537 == 5002) {
                                        class148.field2357++;
                                        var3 -= 2;
                                        var4--;
                                        String var307 = class252.field3997[var4];
                                        int var308 = class242.field3749[var3 + 1];
                                        int var309 = class242.field3749[var3];
                                        class328.field5282.method304(57, arg0 ^ 0x4D76);
                                        class328.field5282.method1039(class294.method2093((byte) 100, var307), (byte) -72);
                                        class328.field5282.method1055(var309 - 1, 100);
                                        class328.field5282.method1055(var308, 90);
                                        continue;
                                    }
                                    if (var537 == 5003) {
                                        String var310 = null;
                                        var3--;
                                        int var311 = class242.field3749[var3];
                                        if (var311 < 100) {
                                            var310 = class252.field3998[var311];
                                        }
                                        if (var310 == null) {
                                            var310 = "";
                                        }
                                        class252.field3997[var4++] = var310;
                                        continue;
                                    }
                                    if (var537 == 5004) {
                                        var3--;
                                        int var312 = class242.field3749[var3];
                                        int var313 = -1;
                                        if (var312 < 100 && class252.field3998[var312] != null) {
                                            var313 = class182.field2737[var312];
                                        }
                                        class242.field3749[var3++] = var313;
                                        continue;
                                    }
                                    if (var537 == 5005) {
                                        class242.field3749[var3++] = class55.field661;
                                        continue;
                                    }
                                    if (var537 == 5008) {
                                        var4--;
                                        String var314 = class252.field3997[var4];
                                        if (var314.startsWith("::")) {
                                            class109.method702((byte) 15, var314);
                                            continue;
                                        }
                                        if (class100.field1350 == 0 && (class334.field5339 && !class174.field2630 || class201.field3043)) {
                                            continue;
                                        }
                                        class181.field2729++;
                                        byte var315 = 0;
                                        byte var316 = 0;
                                        String var317 = var314.toLowerCase();
                                        if (var317.startsWith(class214.field3243)) {
                                            var314 = var314.substring(class214.field3243.length());
                                            var316 = 0;
                                        } else if (var317.startsWith(class289.field4558)) {
                                            var314 = var314.substring(class289.field4558.length());
                                            var316 = 1;
                                        } else if (var317.startsWith(class85.field1124)) {
                                            var314 = var314.substring(class85.field1124.length());
                                            var316 = 2;
                                        } else if (var317.startsWith(class300.field4683)) {
                                            var316 = 3;
                                            var314 = var314.substring(class300.field4683.length());
                                        } else if (var317.startsWith(class62.field742)) {
                                            var314 = var314.substring(class62.field742.length());
                                            var316 = 4;
                                        } else if (var317.startsWith(class75.field949)) {
                                            var316 = 5;
                                            var314 = var314.substring(class75.field949.length());
                                        } else if (var317.startsWith(class231.field3494)) {
                                            var316 = 6;
                                            var314 = var314.substring(class231.field3494.length());
                                        } else if (var317.startsWith(class109.field1498)) {
                                            var316 = 7;
                                            var314 = var314.substring(class109.field1498.length());
                                        } else if (var317.startsWith(class156.field2454)) {
                                            var316 = 8;
                                            var314 = var314.substring(class156.field2454.length());
                                        } else if (var317.startsWith(class212.field3222)) {
                                            var314 = var314.substring(class212.field3222.length());
                                            var316 = 9;
                                        } else if (var317.startsWith(class170.field2589)) {
                                            var314 = var314.substring(class170.field2589.length());
                                            var316 = 10;
                                        } else if (var317.startsWith(class228.field3470)) {
                                            var314 = var314.substring(class228.field3470.length());
                                            var316 = 11;
                                        } else if (class234.field3567 != 0) {
                                            if (var317.startsWith(class112.field1565)) {
                                                var316 = 0;
                                                var314 = var314.substring(class112.field1565.length());
                                            } else if (var317.startsWith(class232.field3511)) {
                                                var316 = 1;
                                                var314 = var314.substring(class232.field3511.length());
                                            } else if (var317.startsWith(class228.field3455)) {
                                                var314 = var314.substring(class228.field3455.length());
                                                var316 = 2;
                                            } else if (var317.startsWith(class274.field4344)) {
                                                var316 = 3;
                                                var314 = var314.substring(class274.field4344.length());
                                            } else if (var317.startsWith(class274.field4340)) {
                                                var316 = 4;
                                                var314 = var314.substring(class274.field4340.length());
                                            } else if (var317.startsWith(class226.field3417)) {
                                                var314 = var314.substring(class226.field3417.length());
                                                var316 = 5;
                                            } else if (var317.startsWith(class73.field912)) {
                                                var316 = 6;
                                                var314 = var314.substring(class73.field912.length());
                                            } else if (var317.startsWith(class120.field1668)) {
                                                var316 = 7;
                                                var314 = var314.substring(class120.field1668.length());
                                            } else if (var317.startsWith(class16.field170)) {
                                                var316 = 8;
                                                var314 = var314.substring(class16.field170.length());
                                            } else if (var317.startsWith(class171.field2604)) {
                                                var316 = 9;
                                                var314 = var314.substring(class171.field2604.length());
                                            } else if (var317.startsWith(class332.field5316)) {
                                                var314 = var314.substring(class332.field5316.length());
                                                var316 = 10;
                                            } else if (var317.startsWith(class79.field1054)) {
                                                var316 = 11;
                                                var314 = var314.substring(class79.field1054.length());
                                            }
                                        }
                                        String var318 = var314.toLowerCase();
                                        if (var318.startsWith(class305.field4750)) {
                                            var315 = 1;
                                            var314 = var314.substring(class305.field4750.length());
                                        } else if (var318.startsWith(class351.field5605)) {
                                            var315 = 2;
                                            var314 = var314.substring(class351.field5605.length());
                                        } else if (var318.startsWith(client.field4439)) {
                                            var314 = var314.substring(client.field4439.length());
                                            var315 = 3;
                                        } else if (var318.startsWith(class25.field289)) {
                                            var314 = var314.substring(class25.field289.length());
                                            var315 = 4;
                                        } else if (var318.startsWith(class295.field4643)) {
                                            var315 = 5;
                                            var314 = var314.substring(class295.field4643.length());
                                        } else if (class234.field3567 != 0) {
                                            if (var318.startsWith(class125.field1776)) {
                                                var315 = 1;
                                                var314 = var314.substring(class125.field1776.length());
                                            } else if (var318.startsWith(class220.field3311)) {
                                                var315 = 2;
                                                var314 = var314.substring(class220.field3311.length());
                                            } else if (var318.startsWith(class311.field4885)) {
                                                var314 = var314.substring(class311.field4885.length());
                                                var315 = 3;
                                            } else if (var318.startsWith(class210.field3170)) {
                                                var315 = 4;
                                                var314 = var314.substring(class210.field3170.length());
                                            } else if (var318.startsWith(class7.field83)) {
                                                var314 = var314.substring(class7.field83.length());
                                                var315 = 5;
                                            }
                                        }
                                        class328.field5282.method304(104, 19830);
                                        class328.field5282.method1055(0, 110);
                                        int var319 = class328.field5282.field2295;
                                        class328.field5282.method1055(var316, 89);
                                        class328.field5282.method1055(var315, 107);
                                        class115.method751(var314, class328.field5282, 0);
                                        class328.field5282.method1044(class328.field5282.field2295 - var319, (byte) 111);
                                        continue;
                                    }
                                    if (var537 == 5009) {
                                        var4 -= 2;
                                        String var320 = class252.field3997[var4];
                                        String var321 = class252.field3997[var4 + 1];
                                        if (class100.field1350 != 0 || (!class334.field5339 || class174.field2630) && !class201.field3043) {
                                            class328.field5282.method304(252, 19830);
                                            class328.field5273++;
                                            class328.field5282.method1055(0, arg0 ^ 0x64);
                                            int var322 = class328.field5282.field2295;
                                            class328.field5282.method1039(class294.method2093((byte) 100, var320), (byte) 82);
                                            class115.method751(var321, class328.field5282, 0);
                                            class328.field5282.method1044(class328.field5282.field2295 - var322, (byte) -109);
                                        }
                                        continue;
                                    }
                                    if (var537 == 5010) {
                                        String var323 = null;
                                        var3--;
                                        int var324 = class242.field3749[var3];
                                        if (var324 < 100) {
                                            var323 = class61.field724[var324];
                                        }
                                        if (var323 == null) {
                                            var323 = "";
                                        }
                                        class252.field3997[var4++] = var323;
                                        continue;
                                    }
                                    if (var537 == 5011) {
                                        var3--;
                                        int var325 = class242.field3749[var3];
                                        String var326 = null;
                                        if (var325 < 100) {
                                            var326 = class54.field617[var325];
                                        }
                                        if (var326 == null) {
                                            var326 = "";
                                        }
                                        class252.field3997[var4++] = var326;
                                        continue;
                                    }
                                    if (var537 == 5012) {
                                        var3--;
                                        int var327 = class242.field3749[var3];
                                        int var328 = -1;
                                        if (var327 < 100) {
                                            var328 = class254.field4025[var327];
                                        }
                                        class242.field3749[var3++] = var328;
                                        continue;
                                    }
                                    if (var537 == 5015) {
                                        String var329;
                                        if (class11.field113 == null || class11.field113.field848 == null) {
                                            var329 = class170.field2593;
                                        } else {
                                            var329 = class11.field113.method419((byte) -51);
                                        }
                                        class252.field3997[var4++] = var329;
                                        continue;
                                    }
                                    if (var537 == 5016) {
                                        class242.field3749[var3++] = class4.field40;
                                        continue;
                                    }
                                    if (var537 == 5017) {
                                        class242.field3749[var3++] = class64.field766;
                                        continue;
                                    }
                                    if (var537 == 5050) {
                                        var3--;
                                        int var330 = class242.field3749[var3];
                                        class252.field3997[var4++] = class86.method543(-124, var330).field3369;
                                        continue;
                                    }
                                    if (var537 == 5051) {
                                        var3--;
                                        int var331 = class242.field3749[var3];
                                        class222 var332 = class86.method543(-56, var331);
                                        if (var332.field3361 == null) {
                                            class242.field3749[var3++] = 0;
                                        } else {
                                            class242.field3749[var3++] = var332.field3361.length;
                                        }
                                        continue;
                                    }
                                    if (var537 == 5052) {
                                        var3 -= 2;
                                        int var333 = class242.field3749[var3];
                                        int var334 = class242.field3749[var3 + 1];
                                        class222 var335 = class86.method543(125, var333);
                                        int var336 = var335.field3361[var334];
                                        class242.field3749[var3++] = var336;
                                        continue;
                                    }
                                    if (var537 == 5053) {
                                        var3--;
                                        int var337 = class242.field3749[var3];
                                        class222 var338 = class86.method543(-73, var337);
                                        if (var338.field3367 == null) {
                                            class242.field3749[var3++] = 0;
                                        } else {
                                            class242.field3749[var3++] = var338.field3367.length;
                                        }
                                        continue;
                                    }
                                    if (var537 == 5054) {
                                        var3 -= 2;
                                        int var339 = class242.field3749[var3 + 1];
                                        int var340 = class242.field3749[var3];
                                        class242.field3749[var3++] = class86.method543(127, var340).field3367[var339];
                                        continue;
                                    }
                                    if (var537 == 5055) {
                                        var3--;
                                        int var341 = class242.field3749[var3];
                                        class252.field3997[var4++] = class259.method1822(128, var341).method2286((byte) 12);
                                        continue;
                                    }
                                    if (var537 == 5056) {
                                        var3--;
                                        int var342 = class242.field3749[var3];
                                        class328 var343 = class259.method1822(128, var342);
                                        if (var343.field5284 == null) {
                                            class242.field3749[var3++] = 0;
                                        } else {
                                            class242.field3749[var3++] = var343.field5284.length;
                                        }
                                        continue;
                                    }
                                    if (var537 == 5057) {
                                        var3 -= 2;
                                        int var344 = class242.field3749[var3 + 1];
                                        int var345 = class242.field3749[var3];
                                        class242.field3749[var3++] = class259.method1822(128, var345).field5284[var344];
                                        continue;
                                    }
                                    if (var537 == 5058) {
                                        class182.field2749 = new class232();
                                        var3--;
                                        class182.field2749.field3510 = class242.field3749[var3];
                                        class182.field2749.field3508 = class259.method1822(128, class182.field2749.field3510);
                                        class182.field2749.field3515 = new int[class182.field2749.field3508.method2278(arg0 ^ 0xFFFFFF9A)];
                                        continue;
                                    }
                                    if (var537 == 5059) {
                                        class328.field5282.method304(106, 19830);
                                        class285.field4531++;
                                        class328.field5282.method1055(0, 95);
                                        int var346 = class328.field5282.field2295;
                                        class328.field5282.method1055(0, 127);
                                        class328.field5282.method1003(class182.field2749.field3510, arg0 ^ 0xFFFFFFFE);
                                        class182.field2749.field3508.method2285(class182.field2749.field3515, class328.field5282, (byte) 104);
                                        class328.field5282.method1044(class328.field5282.field2295 - var346, (byte) -103);
                                        continue;
                                    }
                                    if (var537 == 5060) {
                                        class199.field3012++;
                                        var4--;
                                        String var347 = class252.field3997[var4];
                                        class328.field5282.method304(147, arg0 + 19830);
                                        class328.field5282.method1055(0, 109);
                                        int var348 = class328.field5282.field2295;
                                        class328.field5282.method1039(class294.method2093((byte) 100, var347), (byte) -111);
                                        class328.field5282.method1003(class182.field2749.field3510, -2);
                                        class182.field2749.field3508.method2285(class182.field2749.field3515, class328.field5282, (byte) 104);
                                        class328.field5282.method1044(class328.field5282.field2295 - var348, (byte) -106);
                                        continue;
                                    }
                                    if (var537 == 5061) {
                                        class285.field4531++;
                                        class328.field5282.method304(106, 19830);
                                        class328.field5282.method1055(0, 84);
                                        int var349 = class328.field5282.field2295;
                                        class328.field5282.method1055(1, arg0 + 92);
                                        class328.field5282.method1003(class182.field2749.field3510, -2);
                                        class182.field2749.field3508.method2285(class182.field2749.field3515, class328.field5282, (byte) 104);
                                        class328.field5282.method1044(class328.field5282.field2295 - var349, (byte) -122);
                                        continue;
                                    }
                                    if (var537 == 5062) {
                                        var3 -= 2;
                                        int var350 = class242.field3749[var3];
                                        int var351 = class242.field3749[var3 + 1];
                                        class242.field3749[var3++] = class86.method543(class60.method368(arg0, 10), var350).field3368[var351];
                                        continue;
                                    }
                                    if (var537 == 5063) {
                                        var3 -= 2;
                                        int var352 = class242.field3749[var3 + 1];
                                        int var353 = class242.field3749[var3];
                                        class242.field3749[var3++] = class86.method543(10, var353).field3356[var352];
                                        continue;
                                    }
                                    if (var537 == 5064) {
                                        var3 -= 2;
                                        int var354 = class242.field3749[var3];
                                        int var355 = class242.field3749[var3 + 1];
                                        if (var355 == -1) {
                                            class242.field3749[var3++] = -1;
                                        } else {
                                            class242.field3749[var3++] = class86.method543(124, var354).method1556((char) var355, (byte) 46);
                                        }
                                        continue;
                                    }
                                    if (var537 == 5065) {
                                        var3 -= 2;
                                        int var356 = class242.field3749[var3 + 1];
                                        int var357 = class242.field3749[var3];
                                        if (var356 == -1) {
                                            class242.field3749[var3++] = -1;
                                        } else {
                                            class242.field3749[var3++] = class86.method543(-77, var357).method1552((char) var356, -1);
                                        }
                                        continue;
                                    }
                                    if (var537 == 5066) {
                                        var3--;
                                        int var358 = class242.field3749[var3];
                                        class242.field3749[var3++] = class259.method1822(128, var358).method2278(-95);
                                        continue;
                                    }
                                    if (var537 == 5067) {
                                        var3 -= 2;
                                        int var359 = class242.field3749[var3];
                                        int var360 = class242.field3749[var3 + 1];
                                        int var361 = class259.method1822(arg0 ^ 0x80, var359).method2284(-16159, var360);
                                        class242.field3749[var3++] = var361;
                                        continue;
                                    }
                                    if (var537 == 5068) {
                                        var3 -= 2;
                                        int var362 = class242.field3749[var3];
                                        int var363 = class242.field3749[var3 + 1];
                                        class182.field2749.field3515[var362] = var363;
                                        continue;
                                    }
                                    if (var537 == 5069) {
                                        var3 -= 2;
                                        int var364 = class242.field3749[var3 + 1];
                                        int var365 = class242.field3749[var3];
                                        class182.field2749.field3515[var365] = var364;
                                        continue;
                                    }
                                    if (var537 == 5070) {
                                        var3 -= 3;
                                        int var366 = class242.field3749[var3];
                                        int var367 = class242.field3749[var3 + 2];
                                        int var368 = class242.field3749[var3 + 1];
                                        class328 var369 = class259.method1822(128, var366);
                                        if (var369.method2284(-16159, var368) != 0) {
                                            throw new RuntimeException("bad command");
                                        }
                                        class242.field3749[var3++] = var369.method2283(var367, var368, (byte) 62);
                                        continue;
                                    }
                                    if (var537 == 5071) {
                                        var4--;
                                        String var370 = class252.field3997[var4];
                                        var3--;
                                        boolean var371 = class242.field3749[var3] == 1;
                                        class33.method228(var371, (byte) 126, var370);
                                        class242.field3749[var3++] = class142.field2217;
                                        continue;
                                    }
                                    if (var537 == 5072) {
                                        if (class181.field2733 != null && class142.field2217 > class279.field4387) {
                                            class242.field3749[var3++] = class261.method1840(class181.field2733[class279.field4387++], 65535);
                                            continue;
                                        }
                                        class242.field3749[var3++] = -1;
                                        continue;
                                    }
                                    if (var537 == 5073) {
                                        class279.field4387 = 0;
                                        continue;
                                    }
                                } else if (var537 < 5200) {
                                    if (var537 == 5100) {
                                        if (class276.field4349[86]) {
                                            class242.field3749[var3++] = 1;
                                        } else {
                                            class242.field3749[var3++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var537 == 5101) {
                                        if (class276.field4349[82]) {
                                            class242.field3749[var3++] = 1;
                                        } else {
                                            class242.field3749[var3++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var537 == 5102) {
                                        if (class276.field4349[81]) {
                                            class242.field3749[var3++] = 1;
                                        } else {
                                            class242.field3749[var3++] = 0;
                                        }
                                        continue;
                                    }
                                } else if (var537 < 5300) {
                                    if (var537 == 5200) {
                                        var3--;
                                        class19.method143(class242.field3749[var3], (byte) 106);
                                        continue;
                                    }
                                    if (var537 == 5201) {
                                        class242.field3749[var3++] = class14.method87(170);
                                        continue;
                                    }
                                    if (var537 == 5205) {
                                        var3--;
                                        class349.method2419(false, class242.field3749[var3], (byte) 107, -1, -1);
                                        continue;
                                    }
                                    if (var537 == 5206) {
                                        var3--;
                                        int var174 = class242.field3749[var3];
                                        class212 var175 = class336.method2309((var174 & 0xFFFDDC5) >> 14, var174 & 0x3FFF);
                                        if (var175 == null) {
                                            class242.field3749[var3++] = -1;
                                        } else {
                                            class242.field3749[var3++] = var175.field3213;
                                        }
                                        continue;
                                    }
                                    if (var537 == 5207) {
                                        var3--;
                                        class212 var176 = class336.method2323(class242.field3749[var3]);
                                        if (var176 != null && var176.field3216 != null) {
                                            class252.field3997[var4++] = var176.field3216;
                                            continue;
                                        }
                                        class252.field3997[var4++] = "";
                                        continue;
                                    }
                                    if (var537 == 5208) {
                                        class242.field3749[var3++] = class151.field2388;
                                        class242.field3749[var3++] = class169.field2586;
                                        continue;
                                    }
                                    if (var537 == 5209) {
                                        class242.field3749[var3++] = class315.field4950 + class336.field5346;
                                        class242.field3749[var3++] = class336.field5350 + class336.field5354 - class63.field752 - 1;
                                        continue;
                                    }
                                    if (var537 == 5210) {
                                        var3--;
                                        int var177 = class242.field3749[var3];
                                        class212 var178 = class336.method2323(var177);
                                        if (var178 == null) {
                                            class242.field3749[var3++] = 0;
                                            class242.field3749[var3++] = 0;
                                        } else {
                                            class242.field3749[var3++] = class261.method1840(16383, var178.field3215 >> 14);
                                            class242.field3749[var3++] = class261.method1840(16383, var178.field3215);
                                        }
                                        continue;
                                    }
                                    if (var537 == 5211) {
                                        var3--;
                                        int var179 = class242.field3749[var3];
                                        class212 var180 = class336.method2323(var179);
                                        if (var180 == null) {
                                            class242.field3749[var3++] = 0;
                                            class242.field3749[var3++] = 0;
                                        } else {
                                            class242.field3749[var3++] = var180.field3225 - var180.field3235;
                                            class242.field3749[var3++] = var180.field3218 - var180.field3234;
                                        }
                                        continue;
                                    }
                                    if (var537 == 5212) {
                                        class182 var181 = class38.method243((byte) -16);
                                        if (var181 == null) {
                                            class242.field3749[var3++] = -1;
                                            class242.field3749[var3++] = -1;
                                        } else {
                                            class242.field3749[var3++] = var181.field2735;
                                            int var182 = class336.field5350 + class336.field5354 - var181.field2740 - 1 | class336.field5346 + var181.field2746 << 14 | var181.field2751 << 28;
                                            class242.field3749[var3++] = var182;
                                        }
                                        continue;
                                    }
                                    if (var537 == 5213) {
                                        class182 var183 = class232.method1607(30398);
                                        if (var183 == null) {
                                            class242.field3749[var3++] = -1;
                                            class242.field3749[var3++] = -1;
                                        } else {
                                            class242.field3749[var3++] = var183.field2735;
                                            int var184 = class336.field5354 + class336.field5350 - var183.field2740 - 1 | var183.field2751 << 28 | var183.field2746 + class336.field5346 << 14;
                                            class242.field3749[var3++] = var184;
                                        }
                                        continue;
                                    }
                                    if (var537 == 5214) {
                                        var3--;
                                        int var185 = class242.field3749[var3];
                                        class212 var186 = class229.method1593((byte) -70);
                                        if (var186 != null) {
                                            boolean var187 = var186.method1479((var185 & 0x3CCC37E6) >> 28, var185 & 0x3FFF, (byte) -112, class244.field3829, var185 >> 14 & 0x3FFF);
                                            if (var187) {
                                                class135.method932(arg0 - 120, class244.field3829[1], class244.field3829[2]);
                                            }
                                        }
                                        continue;
                                    }
                                    if (var537 == 5215) {
                                        var3 -= 2;
                                        int var188 = class242.field3749[var3];
                                        int var189 = class242.field3749[var3 + 1];
                                        boolean var190 = false;
                                        class345 var191 = class336.method2314((var188 & 0xFFFFFAE) >> 14, var188 & 0x3FFF);
                                        for (class212 var192 = (class212) var191.method2397((byte) 114); var192 != null; var192 = (class212) var191.method2392((byte) -22)) {
                                            if (var192.field3213 == var189) {
                                                var190 = true;
                                                break;
                                            }
                                        }
                                        if (var190) {
                                            class242.field3749[var3++] = 1;
                                        } else {
                                            class242.field3749[var3++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var537 == 5218) {
                                        var3--;
                                        int var193 = class242.field3749[var3];
                                        class212 var194 = class336.method2323(var193);
                                        if (var194 == null) {
                                            class242.field3749[var3++] = -1;
                                        } else {
                                            class242.field3749[var3++] = var194.field3233;
                                        }
                                        continue;
                                    }
                                    if (var537 == 5220) {
                                        class242.field3749[var3++] = class140.field2091 == 100 ? 1 : 0;
                                        continue;
                                    }
                                    if (var537 == 5221) {
                                        var3--;
                                        int var195 = class242.field3749[var3];
                                        class135.method932(arg0 ^ 0xFFFFFF85, (var195 & 0xFFFE11A) >> 14, var195 & 0x3FFF);
                                        continue;
                                    }
                                    if (var537 == 5222) {
                                        class212 var196 = class229.method1593((byte) -70);
                                        if (var196 == null) {
                                            class242.field3749[var3++] = -1;
                                            class242.field3749[var3++] = -1;
                                        } else {
                                            boolean var197 = var196.method1481(class244.field3829, arg0 ^ 0x78, class336.field5346 + class315.field4950, class336.field5350 - (1 - -class63.field752) + class336.field5354);
                                            if (var197) {
                                                class242.field3749[var3++] = class244.field3829[1];
                                                class242.field3749[var3++] = class244.field3829[2];
                                            } else {
                                                class242.field3749[var3++] = -1;
                                                class242.field3749[var3++] = -1;
                                            }
                                        }
                                        continue;
                                    }
                                    if (var537 == 5223) {
                                        var3 -= 2;
                                        int var198 = class242.field3749[var3 + 1];
                                        int var199 = class242.field3749[var3];
                                        class349.method2419(false, var199, (byte) -98, var198 & 0x3FFF, var198 >> 14 & 0x3FFF);
                                        continue;
                                    }
                                    if (var537 == 5224) {
                                        var3--;
                                        int var200 = class242.field3749[var3];
                                        class212 var201 = class229.method1593((byte) -70);
                                        if (var201 == null) {
                                            class242.field3749[var3++] = -1;
                                            class242.field3749[var3++] = -1;
                                        } else {
                                            boolean var202 = var201.method1479(var200 >> 28 & 0x3, var200 & 0x3FFF, (byte) -96, class244.field3829, var200 >> 14 & 0x3FFF);
                                            if (var202) {
                                                class242.field3749[var3++] = class244.field3829[1];
                                                class242.field3749[var3++] = class244.field3829[2];
                                            } else {
                                                class242.field3749[var3++] = -1;
                                                class242.field3749[var3++] = -1;
                                            }
                                        }
                                        continue;
                                    }
                                    if (var537 == 5225) {
                                        var3--;
                                        int var203 = class242.field3749[var3];
                                        class212 var204 = class229.method1593((byte) -70);
                                        if (var204 == null) {
                                            class242.field3749[var3++] = -1;
                                            class242.field3749[var3++] = -1;
                                        } else {
                                            boolean var205 = var204.method1481(class244.field3829, 127, (var203 & 0xFFFC780) >> 14, var203 & 0x3FFF);
                                            if (var205) {
                                                class242.field3749[var3++] = class244.field3829[1];
                                                class242.field3749[var3++] = class244.field3829[2];
                                            } else {
                                                class242.field3749[var3++] = -1;
                                                class242.field3749[var3++] = -1;
                                            }
                                        }
                                        continue;
                                    }
                                    if (var537 == 5226) {
                                        var3--;
                                        class303.method2140((byte) -121, class242.field3749[var3]);
                                        continue;
                                    }
                                    if (var537 == 5227) {
                                        var3 -= 2;
                                        int var206 = class242.field3749[var3];
                                        int var207 = class242.field3749[var3 + 1];
                                        class349.method2419(true, var206, (byte) 42, var207 & 0x3FFF, var207 >> 14 & 0x3FFF);
                                        continue;
                                    }
                                    if (var537 == 5228) {
                                        var3--;
                                        class293.field4612 = class242.field3749[var3] == 1;
                                        continue;
                                    }
                                    if (var537 == 5229) {
                                        class242.field3749[var3++] = class293.field4612 ? 1 : 0;
                                        continue;
                                    }
                                    if (var537 == 5230) {
                                        var3--;
                                        int var208 = class242.field3749[var3];
                                        class226.method1566(-106, var208);
                                        continue;
                                    }
                                    if (var537 == 5231) {
                                        var3 -= 2;
                                        int var209 = class242.field3749[var3];
                                        boolean var210 = class242.field3749[var3 + 1] == 1;
                                        if (class180.field2697 == null) {
                                            continue;
                                        }
                                        class188 var211 = class180.field2697.method770((long) var209, -75);
                                        if (var211 != null && !var210) {
                                            var211.method1290(119);
                                            continue;
                                        }
                                        if (var211 == null && var210) {
                                            class188 var212 = new class188();
                                            class180.field2697.method764(24369, var212, (long) var209);
                                        }
                                        continue;
                                    }
                                    if (var537 == 5232) {
                                        var3--;
                                        int var213 = class242.field3749[var3];
                                        if (class180.field2697 == null) {
                                            class242.field3749[var3++] = 0;
                                        } else {
                                            class188 var214 = class180.field2697.method770((long) var213, -59);
                                            class242.field3749[var3++] = var214 == null ? 0 : 1;
                                        }
                                        continue;
                                    }
                                    if (var537 == 5233) {
                                        var3 -= 2;
                                        int var215 = class242.field3749[var3];
                                        boolean var216 = class242.field3749[var3 + 1] == 1;
                                        if (class247.field3901 == null) {
                                            continue;
                                        }
                                        class188 var217 = class247.field3901.method770((long) var215, -97);
                                        if (var217 != null && !var216) {
                                            var217.method1290(arg0 + 108);
                                            continue;
                                        }
                                        if (var217 == null && var216) {
                                            class188 var218 = new class188();
                                            class247.field3901.method764(24369, var218, (long) var215);
                                        }
                                        continue;
                                    }
                                    if (var537 == 5234) {
                                        var3--;
                                        int var219 = class242.field3749[var3];
                                        if (class247.field3901 == null) {
                                            class242.field3749[var3++] = 0;
                                        } else {
                                            class188 var220 = class247.field3901.method770((long) var219, -84);
                                            class242.field3749[var3++] = var220 == null ? 0 : 1;
                                        }
                                        continue;
                                    }
                                    if (var537 == 5235) {
                                        class242.field3749[var3++] = class336.field5347 == null ? -1 : class336.field5347.field3213;
                                        continue;
                                    }
                                } else if (var537 < 5400) {
                                    if (var537 == 5300) {
                                        var3 -= 2;
                                        int var294 = class242.field3749[var3 + 1];
                                        int var295 = class242.field3749[var3];
                                        class145.method1074(false, 3, var295, var294, arg0 ^ 0x24);
                                        class242.field3749[var3++] = class80.field1065 == null ? 0 : 1;
                                        continue;
                                    }
                                    if (var537 == 5301) {
                                        if (class80.field1065 != null) {
                                            class145.method1074(false, class161.field2482, -1, -1, -119);
                                        }
                                        continue;
                                    }
                                    if (var537 == 5302) {
                                        class84[] var296 = class186.method1283(arg0 + 91);
                                        class242.field3749[var3++] = var296.length;
                                        continue;
                                    }
                                    if (var537 == 5303) {
                                        var3--;
                                        int var297 = class242.field3749[var3];
                                        class84[] var298 = class186.method1283(121);
                                        class242.field3749[var3++] = var298[var297].field1100;
                                        class242.field3749[var3++] = var298[var297].field1095;
                                        continue;
                                    }
                                    if (var537 == 5305) {
                                        int var299 = class226.field3413;
                                        int var300 = class352.field5609;
                                        int var301 = -1;
                                        class84[] var302 = class186.method1283(arg0 ^ 0x45);
                                        for (int var303 = 0; var303 < var302.length; var303++) {
                                            class84 var304 = var302[var303];
                                            if (var304.field1100 == var300 && var304.field1095 == var299) {
                                                var301 = var303;
                                                break;
                                            }
                                        }
                                        class242.field3749[var3++] = var301;
                                        continue;
                                    }
                                    if (var537 == 5306) {
                                        class242.field3749[var3++] = class117.method768(-117);
                                        continue;
                                    }
                                    if (var537 == 5307) {
                                        var3--;
                                        int var305 = class242.field3749[var3];
                                        if (var305 < 0 || var305 > 2) {
                                            var305 = 0;
                                        }
                                        class145.method1074(false, var305, -1, -1, arg0 + 34);
                                        continue;
                                    }
                                    if (var537 == 5308) {
                                        class242.field3749[var3++] = class161.field2482;
                                        continue;
                                    }
                                    if (var537 == 5309) {
                                        var3--;
                                        int var306 = class242.field3749[var3];
                                        if (var306 < 0 || var306 > 2) {
                                            var306 = 0;
                                        }
                                        class161.field2482 = var306;
                                        class160.method1162(class156.field2451, (byte) -127);
                                        continue;
                                    }
                                } else if (var537 < 5500) {
                                    if (var537 == 5400) {
                                        var3--;
                                        int var221 = class242.field3749[var3];
                                        var4 -= 2;
                                        String var222 = class252.field3997[var4 + 1];
                                        String var223 = class252.field3997[var4];
                                        class328.field5282.method304(39, 19830);
                                        class160.field2468++;
                                        class328.field5282.method1055(class55.method334((byte) -5, var223) + class55.method334((byte) -5, var222) + 1, 116);
                                        class328.field5282.method1050(var223, -64);
                                        class328.field5282.method1050(var222, arg0 - 61);
                                        class328.field5282.method1055(var221, 122);
                                        continue;
                                    }
                                    if (var537 == 5401) {
                                        var3 -= 2;
                                        class125.field1773[class242.field3749[var3]] = (short) class310.method2196((byte) 13, class242.field3749[var3 + 1]);
                                        class79.method519(1);
                                        class199.method1384(1);
                                        class49.method309(-123);
                                        class328.method2287(0);
                                        class344.method2386(arg0);
                                        continue;
                                    }
                                    if (var537 == 5405) {
                                        var3 -= 2;
                                        int var224 = class242.field3749[var3 + 1];
                                        int var225 = class242.field3749[var3];
                                        if (var225 >= 0 && var225 < 2) {
                                            class38.field436[var225] = new int[var224 << 1][4];
                                        }
                                        continue;
                                    }
                                    if (var537 == 5406) {
                                        var3 -= 7;
                                        int var226 = class242.field3749[var3];
                                        int var227 = class242.field3749[var3 + 3];
                                        int var228 = class242.field3749[var3 + 2];
                                        int var229 = class242.field3749[var3 + 4];
                                        int var230 = class242.field3749[var3 + 1] << 1;
                                        int var231 = class242.field3749[var3 + 5];
                                        int var232 = class242.field3749[var3 + 6];
                                        if (var226 >= 0 && var226 < 2 && class38.field436[var226] != null && var230 >= 0 && class38.field436[var226].length > var230) {
                                            class38.field436[var226][var230] = new int[] { (class261.method1840(268432354, var228) >> 14) * 128, var227, class261.method1840(16383, var228) * 128, var232 };
                                            class38.field436[var226][var230 + 1] = new int[] { class261.method1840(var229 >> 14, 16383) * 128, var231, class261.method1840(var229, 16383) * 128 };
                                        }
                                        continue;
                                    }
                                    if (var537 == 5407) {
                                        var3--;
                                        int var233 = class38.field436[class242.field3749[var3]].length >> 1;
                                        class242.field3749[var3++] = var233;
                                        continue;
                                    }
                                    if (var537 == 5411) {
                                        if (class80.field1065 != null) {
                                            class145.method1074(false, class161.field2482, -1, -1, 112);
                                        }
                                        if (class231.field3498 == null) {
                                            class180.method1240(class31.method219(true), 64, false);
                                        } else {
                                            System.exit(0);
                                        }
                                        continue;
                                    }
                                    if (var537 == 5419) {
                                        String var234 = "";
                                        if (class244.field3845 != null) {
                                            if (class244.field3845.field2421 == null) {
                                                var234 = class222.method1554(arg0 - 106, class244.field3845.field2422);
                                            } else {
                                                var234 = (String) class244.field3845.field2421;
                                            }
                                        }
                                        class252.field3997[var4++] = var234;
                                        continue;
                                    }
                                    if (var537 == 5420) {
                                        class242.field3749[var3++] = class22.field253 == 3 ? 1 : 0;
                                        continue;
                                    }
                                    if (var537 == 5421) {
                                        if (class80.field1065 != null) {
                                            class145.method1074(false, class161.field2482, -1, -1, 123);
                                        }
                                        var4--;
                                        String var235 = class252.field3997[var4];
                                        var3--;
                                        boolean var236 = class242.field3749[var3] == 1;
                                        String var237 = class31.method219(true) + var235;
                                        if (class231.field3498 != null || var236 && class22.field253 != 3 && class22.field262.startsWith("win") && !class186.field2797) {
                                            class191.field2874 = var237;
                                            class162.field2490 = var236;
                                            class323.field5159 = class156.field2451.method169(var237, 0);
                                            continue;
                                        }
                                        class180.method1240(var237, 126, var236);
                                        continue;
                                    }
                                    if (var537 == 5422) {
                                        var4 -= 2;
                                        String var238 = class252.field3997[var4 + 1];
                                        var3--;
                                        int var239 = class242.field3749[var3];
                                        String var240 = class252.field3997[var4];
                                        if (var240.length() > 0) {
                                            if (class191.field2865 == null) {
                                                class191.field2865 = new String[class132.field1904[class199.field3024]];
                                            }
                                            class191.field2865[var239] = var240;
                                        }
                                        if (var238.length() > 0) {
                                            if (class289.field4557 == null) {
                                                class289.field4557 = new String[class132.field1904[class199.field3024]];
                                            }
                                            class289.field4557[var239] = var238;
                                        }
                                        continue;
                                    }
                                    if (var537 == 5423) {
                                        var4--;
                                        System.out.println(class252.field3997[var4]);
                                        continue;
                                    }
                                    if (var537 == 5424) {
                                        var3 -= 11;
                                        class192.field2883 = class242.field3749[var3];
                                        class93.field1273 = class242.field3749[var3 + 1];
                                        class35.field394 = class242.field3749[var3 + 2];
                                        class135.field2024 = class242.field3749[var3 + 3];
                                        class140.field2095 = class242.field3749[var3 + 4];
                                        class261.field4138 = class242.field3749[var3 + 5];
                                        class138.field2062 = class242.field3749[var3 + 6];
                                        class356.field5654 = class242.field3749[var3 + 7];
                                        class355.field5652 = class242.field3749[var3 + 8];
                                        class267.field4202 = class242.field3749[var3 + 9];
                                        class57.field680 = class242.field3749[var3 + 10];
                                        class65.field786.method125(class140.field2095, 121);
                                        class65.field786.method125(class261.field4138, arg0 ^ 0xFFFFFF94);
                                        class65.field786.method125(class138.field2062, -125);
                                        class65.field786.method125(class356.field5654, arg0 ^ 0xFFFFFFD1);
                                        class65.field786.method125(class355.field5652, -88);
                                        class161.field2481 = true;
                                        continue;
                                    }
                                    if (var537 == 5425) {
                                        class101.method639((byte) -123);
                                        class161.field2481 = false;
                                        continue;
                                    }
                                    if (var537 == 5426) {
                                        var3--;
                                        class101.field1375 = class242.field3749[var3];
                                        continue;
                                    }
                                    if (var537 == 5427) {
                                        var3 -= 2;
                                        class212.field3224 = class242.field3749[var3];
                                        class109.field1503 = class242.field3749[var3 + 1];
                                        continue;
                                    }
                                    if (var537 == 5428) {
                                        var3 -= 2;
                                        int var241 = class242.field3749[var3];
                                        int var242 = class242.field3749[var3 + 1];
                                        class242.field3749[var3++] = class27.method202(var241, var242, -6011) ? 1 : 0;
                                        continue;
                                    }
                                } else if (var537 < 5600) {
                                    if (var537 == 5500) {
                                        var3 -= 4;
                                        int var243 = class242.field3749[var3 + 1];
                                        int var244 = class242.field3749[var3 + 2];
                                        int var245 = class242.field3749[var3];
                                        int var246 = class242.field3749[var3 + 3];
                                        class259.method1827(false, var246, (var245 >> 14 & 0x3FFF) - class322.field4999, (var245 & 0x3FFF) + -class16.field160, 7209, var244, var243);
                                        continue;
                                    }
                                    if (var537 == 5501) {
                                        var3 -= 4;
                                        int var247 = class242.field3749[var3 + 1];
                                        int var248 = class242.field3749[var3];
                                        int var249 = class242.field3749[var3 + 2];
                                        int var250 = class242.field3749[var3 + 3];
                                        class139.method952((var248 & 0x3FFF) - class16.field160, var249, false, var247, (var248 >> 14 & 0x3FFF) - class322.field4999, var250);
                                        continue;
                                    }
                                    if (var537 == 5502) {
                                        var3 -= 6;
                                        int var251 = class242.field3749[var3];
                                        if (var251 >= 2) {
                                            throw new RuntimeException();
                                        }
                                        class30.field355 = var251;
                                        int var252 = class242.field3749[var3 + 1];
                                        if (class38.field436[class30.field355].length >> 1 <= var252 + 1) {
                                            throw new RuntimeException();
                                        }
                                        class316.field4953 = 0;
                                        class260.field4101 = var252;
                                        class211.field3187 = class242.field3749[var3 + 2];
                                        class255.field4036 = class242.field3749[var3 + 3];
                                        int var253 = class242.field3749[var3 + 4];
                                        if (var253 >= 2) {
                                            throw new RuntimeException();
                                        }
                                        class130.field1879 = var253;
                                        int var254 = class242.field3749[var3 + 5];
                                        if (var254 + 1 >= class38.field436[class130.field1879].length >> 1) {
                                            throw new RuntimeException();
                                        }
                                        class120.field1667 = 3;
                                        class314.field4931 = var254;
                                        continue;
                                    }
                                    if (var537 == 5503) {
                                        class123.method790(false);
                                        continue;
                                    }
                                    if (var537 == 5504) {
                                        var3 -= 2;
                                        class298.method2110(-109, class242.field3749[var3], class242.field3749[var3 + 1]);
                                        continue;
                                    }
                                    if (var537 == 5505) {
                                        class242.field3749[var3++] = (int) class103.field1423;
                                        continue;
                                    }
                                    if (var537 == 5506) {
                                        class242.field3749[var3++] = (int) class190.field2855;
                                        continue;
                                    }
                                    if (var537 == 5507) {
                                        class69.method430(arg0 ^ 0x3178);
                                        continue;
                                    }
                                    if (var537 == 5508) {
                                        class262.method1861(1);
                                        continue;
                                    }
                                    if (var537 == 5509) {
                                        class135.method927((byte) 90);
                                        continue;
                                    }
                                    if (var537 == 5510) {
                                        class194.method1348((byte) -119);
                                        continue;
                                    }
                                    if (var537 == 5512) {
                                        class115.method750(-127);
                                        continue;
                                    }
                                } else if (var537 < 5700) {
                                    if (var537 == 5600) {
                                        var4 -= 2;
                                        String var290 = class252.field3997[var4];
                                        String var291 = class252.field3997[var4 + 1];
                                        var3--;
                                        int var292 = class242.field3749[var3];
                                        if (client.field4443 == 10 && class50.field572 == 0 && class231.field3500 == 0 && class148.field2354 == 0 && class179.field2687 == 0) {
                                            class86.method546(var290, (byte) -95, var292, var291);
                                        }
                                        continue;
                                    }
                                    if (var537 == 5601) {
                                        class90.method567(87);
                                        continue;
                                    }
                                    if (var537 == 5602) {
                                        if (class231.field3500 == 0) {
                                            class30.field353 = -2;
                                        }
                                        continue;
                                    }
                                    if (var537 == 5603) {
                                        var3 -= 4;
                                        if (client.field4443 == 10 && class50.field572 == 0 && class231.field3500 == 0 && class148.field2354 == 0 && class179.field2687 == 0) {
                                            class135.method929(255, class242.field3749[var3], class242.field3749[var3 + 2], class242.field3749[var3 + 3], class242.field3749[var3 + 1]);
                                        }
                                        continue;
                                    }
                                    if (var537 == 5604) {
                                        var4--;
                                        if (client.field4443 == 10 && class50.field572 == 0 && class231.field3500 == 0 && class148.field2354 == 0 && class179.field2687 == 0) {
                                            class222.method1550(class294.method2093((byte) 100, class252.field3997[var4]), (byte) -63);
                                        }
                                        continue;
                                    }
                                    if (var537 == 5605) {
                                        var3 -= 7;
                                        var4 -= 3;
                                        if (client.field4443 == 10 && class50.field572 == 0 && class231.field3500 == 0 && class148.field2354 == 0 && class179.field2687 == 0) {
                                            class208.method1459(class252.field3997[var4 + 2], class242.field3749[var3 + 3], class242.field3749[var3 + 5] == 1, class242.field3749[var3], class242.field3749[var3 + 1], class294.method2093((byte) 100, class252.field3997[var4]), class242.field3749[var3 + 4] == 1, class242.field3749[var3 + 6] == 1, class242.field3749[var3 + 2], class252.field3997[var4 + 1], (byte) 109);
                                        }
                                        continue;
                                    }
                                    if (var537 == 5606) {
                                        if (class148.field2354 == 0) {
                                            class285.field4527 = -2;
                                        }
                                        continue;
                                    }
                                    if (var537 == 5607) {
                                        class242.field3749[var3++] = class30.field353;
                                        continue;
                                    }
                                    if (var537 == 5608) {
                                        class242.field3749[var3++] = class60.field712;
                                        continue;
                                    }
                                    if (var537 == 5609) {
                                        class242.field3749[var3++] = class285.field4527;
                                        continue;
                                    }
                                    if (var537 == 5610) {
                                        for (int var293 = 0; var293 < 5; var293++) {
                                            class252.field3997[var4++] = class19.field233.length <= var293 ? "" : class156.method1135(class19.field233[var293], (byte) 84);
                                        }
                                        class19.field233 = null;
                                        continue;
                                    }
                                    if (var537 == 5611) {
                                        class242.field3749[var3++] = class52.field600;
                                        continue;
                                    }
                                } else if (var537 < 6100) {
                                    if (var537 == 6001) {
                                        var3--;
                                        int var255 = class242.field3749[var3];
                                        if (var255 < 1) {
                                            var255 = 1;
                                        }
                                        if (var255 > 4) {
                                            var255 = 4;
                                        }
                                        class164.field2522 = var255;
                                        if (!class272.field4317 || !class290.field4566) {
                                            if (class164.field2522 == 1) {
                                                class104.method658(0.9F);
                                            }
                                            if (class164.field2522 == 2) {
                                                class104.method658(0.8F);
                                            }
                                            if (class164.field2522 == 3) {
                                                class104.method658(0.7F);
                                            }
                                            if (class164.field2522 == 4) {
                                                class104.method658(0.6F);
                                            }
                                        }
                                        if (class272.field4317) {
                                            class306.method2155((byte) 63);
                                            if (!class290.field4566) {
                                                class219.method1524(false);
                                            }
                                        }
                                        class199.method1384(1);
                                        class160.method1162(class156.field2451, (byte) -128);
                                        class250.field3967 = false;
                                        continue;
                                    }
                                    if (var537 == 6002) {
                                        var3--;
                                        class361.method2521(-111, class242.field3749[var3] == 1);
                                        class128.method873(-39);
                                        class219.method1524(false);
                                        class168.method1191((byte) -101);
                                        class160.method1162(class156.field2451, (byte) -125);
                                        class250.field3967 = false;
                                        continue;
                                    }
                                    if (var537 == 6003) {
                                        var3--;
                                        class38.field430 = class242.field3749[var3] == 1;
                                        class168.method1191((byte) -101);
                                        class160.method1162(class156.field2451, (byte) -126);
                                        class250.field3967 = false;
                                        continue;
                                    }
                                    if (var537 == 6005) {
                                        var3--;
                                        class353.field5629 = class242.field3749[var3] == 1;
                                        class219.method1524(false);
                                        class160.method1162(class156.field2451, (byte) -128);
                                        class250.field3967 = false;
                                        continue;
                                    }
                                    if (var537 == 6006) {
                                        var3--;
                                        class13.field136 = class242.field3749[var3] == 1;
                                        ((class138) class104.field1438).method942(-18883, !class13.field136);
                                        class160.method1162(class156.field2451, (byte) -128);
                                        class250.field3967 = false;
                                        continue;
                                    }
                                    if (var537 == 6007) {
                                        var3--;
                                        class327.field5233 = class242.field3749[var3] == 1;
                                        class160.method1162(class156.field2451, (byte) -126);
                                        class250.field3967 = false;
                                        continue;
                                    }
                                    if (var537 == 6008) {
                                        var3--;
                                        class10.field104 = class242.field3749[var3] == 1;
                                        class160.method1162(class156.field2451, (byte) -126);
                                        class250.field3967 = false;
                                        continue;
                                    }
                                    if (var537 == 6009) {
                                        var3--;
                                        class139.field2087 = class242.field3749[var3] == 1;
                                        class160.method1162(class156.field2451, (byte) -125);
                                        class250.field3967 = false;
                                        continue;
                                    }
                                    if (var537 == 6010) {
                                        var3--;
                                        class171.field2601 = class242.field3749[var3] == 1;
                                        class160.method1162(class156.field2451, (byte) -127);
                                        class250.field3967 = false;
                                        continue;
                                    }
                                    if (var537 == 6011) {
                                        var3--;
                                        int var256 = class242.field3749[var3];
                                        if (var256 < 0 || var256 > 2) {
                                            var256 = 0;
                                        }
                                        class16.field164 = var256;
                                        class160.method1162(class156.field2451, (byte) -126);
                                        class250.field3967 = false;
                                        continue;
                                    }
                                    if (var537 == 6012) {
                                        if (class272.field4317) {
                                            class11.method69(-126, 0, 0);
                                        }
                                        var3--;
                                        class290.field4566 = class242.field3749[var3] == 1;
                                        if (class272.field4317 && class290.field4566) {
                                            class104.method658(0.7F);
                                        } else {
                                            if (class164.field2522 == 1) {
                                                class104.method658(0.9F);
                                            }
                                            if (class164.field2522 == 2) {
                                                class104.method658(0.8F);
                                            }
                                            if (class164.field2522 == 3) {
                                                class104.method658(0.7F);
                                            }
                                            if (class164.field2522 == 4) {
                                                class104.method658(0.6F);
                                            }
                                        }
                                        class219.method1524(false);
                                        class160.method1162(class156.field2451, (byte) -125);
                                        class250.field3967 = false;
                                        continue;
                                    }
                                    if (var537 == 6014) {
                                        var3--;
                                        class76.field993 = class242.field3749[var3] == 1;
                                        if (class272.field4317) {
                                            class219.method1524(false);
                                        }
                                        class160.method1162(class156.field2451, (byte) -127);
                                        class250.field3967 = false;
                                        continue;
                                    }
                                    if (var537 == 6015) {
                                        var3--;
                                        class347.field5512 = class242.field3749[var3] == 1;
                                        if (class272.field4317) {
                                            class306.method2155((byte) 116);
                                        }
                                        class160.method1162(class156.field2451, (byte) -128);
                                        class250.field3967 = false;
                                        continue;
                                    }
                                    if (var537 == 6016) {
                                        var3--;
                                        int var257 = class242.field3749[var3];
                                        if (var257 < 0 || var257 > 2) {
                                            var257 = 0;
                                        }
                                        class24.field285 = var257;
                                        if (class272.field4317) {
                                            class345.field5475 = true;
                                        }
                                        continue;
                                    }
                                    if (var537 == 6017) {
                                        var3--;
                                        class90.field1192 = class242.field3749[var3] == 1;
                                        class309.method2190(3630);
                                        class160.method1162(class156.field2451, (byte) -128);
                                        class250.field3967 = false;
                                        continue;
                                    }
                                    if (var537 == 6018) {
                                        var3--;
                                        int var258 = class242.field3749[var3];
                                        if (var258 < 0) {
                                            var258 = 0;
                                        }
                                        if (var258 > 127) {
                                            var258 = 127;
                                        }
                                        class189.field2847 = var258;
                                        class160.method1162(class156.field2451, (byte) -128);
                                        class250.field3967 = false;
                                        continue;
                                    }
                                    if (var537 == 6019) {
                                        var3--;
                                        int var259 = class242.field3749[var3];
                                        if (var259 < 0) {
                                            var259 = 0;
                                        }
                                        if (var259 > 255) {
                                            var259 = 255;
                                        }
                                        if (class31.field365 != var259) {
                                            if (class31.field365 == 0 && class278.field4370 != -1) {
                                                class132.method904(var259, false, class278.field4370, class60.field714, 1, 0);
                                                class327.field5234 = false;
                                            } else if (var259 == 0) {
                                                class55.method325((byte) 123);
                                                class327.field5234 = false;
                                            } else {
                                                class208.method1458(arg0 ^ 0x7D, var259);
                                            }
                                            class31.field365 = var259;
                                        }
                                        class160.method1162(class156.field2451, (byte) -125);
                                        class250.field3967 = false;
                                        continue;
                                    }
                                    if (var537 == 6020) {
                                        var3--;
                                        int var260 = class242.field3749[var3];
                                        if (var260 < 0) {
                                            var260 = 0;
                                        }
                                        if (var260 > 127) {
                                            var260 = 127;
                                        }
                                        class213.field3240 = var260;
                                        class160.method1162(class156.field2451, (byte) -125);
                                        class250.field3967 = false;
                                        continue;
                                    }
                                    if (var537 == 6021) {
                                        var3--;
                                        class236.field3637 = class242.field3749[var3] == 1;
                                        class168.method1191((byte) -101);
                                        continue;
                                    }
                                    if (var537 == 6023) {
                                        var3--;
                                        int var261 = class242.field3749[var3];
                                        if (var261 < 0) {
                                            var261 = 0;
                                        }
                                        if (var261 > 2) {
                                            var261 = 2;
                                        }
                                        boolean var262 = false;
                                        if (class357.field5667 < 96) {
                                            var262 = true;
                                            var261 = 0;
                                        }
                                        class141.method986(var261);
                                        class160.method1162(class156.field2451, (byte) -125);
                                        class250.field3967 = false;
                                        class242.field3749[var3++] = var262 ? 0 : 1;
                                        continue;
                                    }
                                    if (var537 == 6024) {
                                        var3--;
                                        int var263 = class242.field3749[var3];
                                        if (var263 < 0 || var263 > 2) {
                                            var263 = 0;
                                        }
                                        client.field4441 = var263;
                                        class160.method1162(class156.field2451, (byte) -127);
                                        continue;
                                    }
                                    if (var537 == 6027) {
                                        var3--;
                                        int var264 = class242.field3749[var3];
                                        if (!class272.field4317) {
                                            continue;
                                        }
                                        if (var264 < 0 || var264 > 1) {
                                            var264 = 0;
                                        }
                                        class123.method791(var264 == 1, false);
                                        continue;
                                    }
                                    if (var537 == 6028) {
                                        var3--;
                                        class178.field2680 = class242.field3749[var3] != 0;
                                        class160.method1162(class156.field2451, (byte) -125);
                                        continue;
                                    }
                                } else if (var537 < 6200) {
                                    if (var537 == 6101) {
                                        class242.field3749[var3++] = class164.field2522;
                                        continue;
                                    }
                                    if (var537 == 6102) {
                                        class242.field3749[var3++] = class103.method653(-29308) ? 1 : 0;
                                        continue;
                                    }
                                    if (var537 == 6103) {
                                        class242.field3749[var3++] = class38.field430 ? 1 : 0;
                                        continue;
                                    }
                                    if (var537 == 6105) {
                                        class242.field3749[var3++] = class353.field5629 ? 1 : 0;
                                        continue;
                                    }
                                    if (var537 == 6106) {
                                        class242.field3749[var3++] = class13.field136 ? 1 : 0;
                                        continue;
                                    }
                                    if (var537 == 6107) {
                                        class242.field3749[var3++] = class327.field5233 ? 1 : 0;
                                        continue;
                                    }
                                    if (var537 == 6108) {
                                        class242.field3749[var3++] = class10.field104 ? 1 : 0;
                                        continue;
                                    }
                                    if (var537 == 6109) {
                                        class242.field3749[var3++] = class139.field2087 ? 1 : 0;
                                        continue;
                                    }
                                    if (var537 == 6110) {
                                        class242.field3749[var3++] = class171.field2601 ? 1 : 0;
                                        continue;
                                    }
                                    if (var537 == 6111) {
                                        class242.field3749[var3++] = class16.field164;
                                        continue;
                                    }
                                    if (var537 == 6112) {
                                        class242.field3749[var3++] = class290.field4566 ? 1 : 0;
                                        continue;
                                    }
                                    if (var537 == 6114) {
                                        class242.field3749[var3++] = class76.field993 ? 1 : 0;
                                        continue;
                                    }
                                    if (var537 == 6115) {
                                        class242.field3749[var3++] = class347.field5512 ? 1 : 0;
                                        continue;
                                    }
                                    if (var537 == 6116) {
                                        class242.field3749[var3++] = class24.field285;
                                        continue;
                                    }
                                    if (var537 == 6117) {
                                        class242.field3749[var3++] = class90.field1192 ? 1 : 0;
                                        continue;
                                    }
                                    if (var537 == 6118) {
                                        class242.field3749[var3++] = class189.field2847;
                                        continue;
                                    }
                                    if (var537 == 6119) {
                                        class242.field3749[var3++] = class31.field365;
                                        continue;
                                    }
                                    if (var537 == 6120) {
                                        class242.field3749[var3++] = class213.field3240;
                                        continue;
                                    }
                                    if (var537 == 6121) {
                                        if (class272.field4317) {
                                            class242.field3749[var3++] = class272.field4306 ? 1 : 0;
                                        } else {
                                            class242.field3749[var3++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var537 == 6123) {
                                        class242.field3749[var3++] = class141.method980();
                                        continue;
                                    }
                                    if (var537 == 6124) {
                                        class242.field3749[var3++] = client.field4441;
                                        continue;
                                    }
                                    if (var537 == 6126) {
                                        if (class272.field4317) {
                                            class242.field3749[var3++] = class152.method1117() ? 1 : 0;
                                        } else {
                                            class242.field3749[var3++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var537 == 6127) {
                                        class242.field3749[var3++] = class151.field2386 ? 1 : 0;
                                        continue;
                                    }
                                    if (var537 == 6128) {
                                        class242.field3749[var3++] = class178.field2680 ? 1 : 0;
                                        continue;
                                    }
                                } else if (var537 < 6300) {
                                    if (var537 == 6200) {
                                        var3 -= 2;
                                        class12.field120 = (short) class242.field3749[var3];
                                        if (class12.field120 <= 0) {
                                            class12.field120 = 256;
                                        }
                                        class92.field1205 = (short) class242.field3749[var3 + 1];
                                        if (class92.field1205 <= 0) {
                                            class92.field1205 = 205;
                                        }
                                        continue;
                                    }
                                    if (var537 == 6201) {
                                        var3 -= 2;
                                        class44.field500 = (short) class242.field3749[var3];
                                        if (class44.field500 <= 0) {
                                            class44.field500 = 256;
                                        }
                                        class119.field1650 = (short) class242.field3749[var3 + 1];
                                        if (class119.field1650 <= 0) {
                                            class119.field1650 = 320;
                                        }
                                        continue;
                                    }
                                    if (var537 == 6202) {
                                        var3 -= 4;
                                        class325.field5213 = (short) class242.field3749[var3];
                                        if (class325.field5213 <= 0) {
                                            class325.field5213 = 1;
                                        }
                                        class293.field4610 = (short) class242.field3749[var3 + 1];
                                        if (class293.field4610 <= 0) {
                                            class293.field4610 = 32767;
                                        } else if (class293.field4610 < class325.field5213) {
                                            class293.field4610 = class325.field5213;
                                        }
                                        class38.field428 = (short) class242.field3749[var3 + 2];
                                        if (class38.field428 <= 0) {
                                            class38.field428 = 1;
                                        }
                                        class215.field3259 = (short) class242.field3749[var3 + 3];
                                        if (class215.field3259 <= 0) {
                                            class215.field3259 = 32767;
                                        } else if (class38.field428 > class215.field3259) {
                                            class215.field3259 = class38.field428;
                                        }
                                        continue;
                                    }
                                    if (var537 == 6203) {
                                        class180.method1246(0, class131.field1883.field5174, 22, class131.field1883.field5169, false, 0);
                                        class242.field3749[var3++] = class227.field3432;
                                        class242.field3749[var3++] = class161.field2475;
                                        continue;
                                    }
                                    if (var537 == 6204) {
                                        class242.field3749[var3++] = class44.field500;
                                        class242.field3749[var3++] = class119.field1650;
                                        continue;
                                    }
                                    if (var537 == 6205) {
                                        class242.field3749[var3++] = class12.field120;
                                        class242.field3749[var3++] = class92.field1205;
                                        continue;
                                    }
                                } else if (var537 < 6400) {
                                    if (var537 == 6300) {
                                        class242.field3749[var3++] = (int) (class9.method57(-14133) / 60000L);
                                        continue;
                                    }
                                    if (var537 == 6301) {
                                        class242.field3749[var3++] = (int) (class9.method57(class60.method368(arg0, -14133)) / 86400000L) - 11745;
                                        continue;
                                    }
                                    if (var537 == 6302) {
                                        var3 -= 3;
                                        int var285 = class242.field3749[var3];
                                        int var286 = class242.field3749[var3 + 1];
                                        int var287 = class242.field3749[var3 + 2];
                                        class228.field3457.clear();
                                        class228.field3457.set(11, 12);
                                        class228.field3457.set(var287, var286, var285);
                                        class242.field3749[var3++] = (int) (class228.field3457.getTime().getTime() / 86400000L) - 11745;
                                        continue;
                                    }
                                    if (var537 == 6303) {
                                        class228.field3457.clear();
                                        class228.field3457.setTime(new Date(class9.method57(-14133)));
                                        class242.field3749[var3++] = class228.field3457.get(1);
                                        continue;
                                    }
                                    if (var537 == 6304) {
                                        var3--;
                                        int var288 = class242.field3749[var3];
                                        boolean var289 = true;
                                        if (var288 < 0) {
                                            var289 = (var288 + 1) % 4 == 0;
                                        } else if (var288 < 1582) {
                                            var289 = (var288 % 4) == 0;
                                        } else if (var288 % 4 != 0) {
                                            var289 = false;
                                        } else if ((var288 % 100) != 0) {
                                            var289 = true;
                                        } else if ((var288 % 400) != 0) {
                                            var289 = false;
                                        }
                                        class242.field3749[var3++] = var289 ? 1 : 0;
                                        continue;
                                    }
                                } else if (var537 < 6500) {
                                    if (var537 == 6405) {
                                        class242.field3749[var3++] = class43.method270((byte) 89) ? 1 : 0;
                                        continue;
                                    }
                                    if (var537 == 6406) {
                                        class242.field3749[var3++] = class326.method2264(false) ? 1 : 0;
                                        continue;
                                    }
                                } else if (var537 < 6600) {
                                    if (var537 == 6500) {
                                        if (client.field4443 == 10 && class50.field572 == 0 && class231.field3500 == 0 && class148.field2354 == 0) {
                                            class242.field3749[var3++] = class6.method36(1) == -1 ? 0 : 1;
                                            continue;
                                        }
                                        class242.field3749[var3++] = 1;
                                        continue;
                                    }
                                    if (var537 == 6501) {
                                        class122 var265 = class303.method2131(0);
                                        if (var265 == null) {
                                            class242.field3749[var3++] = -1;
                                            class242.field3749[var3++] = 0;
                                            class252.field3997[var4++] = "";
                                            class242.field3749[var3++] = 0;
                                            class252.field3997[var4++] = "";
                                            class242.field3749[var3++] = 0;
                                        } else {
                                            class242.field3749[var3++] = var265.field1678;
                                            class242.field3749[var3++] = var265.field1500;
                                            class252.field3997[var4++] = var265.field1684;
                                            class285 var266 = var265.method782((byte) -112);
                                            class242.field3749[var3++] = var266.field4535;
                                            class252.field3997[var4++] = var266.field4530;
                                            class242.field3749[var3++] = var265.field1505;
                                        }
                                        continue;
                                    }
                                    if (var537 == 6502) {
                                        class122 var267 = class31.method218(0);
                                        if (var267 == null) {
                                            class242.field3749[var3++] = -1;
                                            class242.field3749[var3++] = 0;
                                            class252.field3997[var4++] = "";
                                            class242.field3749[var3++] = 0;
                                            class252.field3997[var4++] = "";
                                            class242.field3749[var3++] = 0;
                                        } else {
                                            class242.field3749[var3++] = var267.field1678;
                                            class242.field3749[var3++] = var267.field1500;
                                            class252.field3997[var4++] = var267.field1684;
                                            class285 var268 = var267.method782((byte) -113);
                                            class242.field3749[var3++] = var268.field4535;
                                            class252.field3997[var4++] = var268.field4530;
                                            class242.field3749[var3++] = var267.field1505;
                                        }
                                        continue;
                                    }
                                    if (var537 == 6503) {
                                        var3--;
                                        int var269 = class242.field3749[var3];
                                        if (client.field4443 == 10 && class50.field572 == 0 && class231.field3500 == 0 && class148.field2354 == 0) {
                                            class242.field3749[var3++] = class132.method907(var269, 5539) ? 1 : 0;
                                            continue;
                                        }
                                        class242.field3749[var3++] = 0;
                                        continue;
                                    }
                                    if (var537 == 6504) {
                                        var3--;
                                        class261.field4133 = class242.field3749[var3];
                                        class160.method1162(class156.field2451, (byte) -128);
                                        continue;
                                    }
                                    if (var537 == 6505) {
                                        class242.field3749[var3++] = class261.field4133;
                                        continue;
                                    }
                                    if (var537 == 6506) {
                                        var3--;
                                        int var270 = class242.field3749[var3];
                                        class122 var271 = class73.method452(-3301, var270);
                                        if (var271 == null) {
                                            class242.field3749[var3++] = -1;
                                            class252.field3997[var4++] = "";
                                            class242.field3749[var3++] = 0;
                                            class252.field3997[var4++] = "";
                                            class242.field3749[var3++] = 0;
                                        } else {
                                            class242.field3749[var3++] = var271.field1500;
                                            class252.field3997[var4++] = var271.field1684;
                                            class285 var272 = var271.method782((byte) -124);
                                            class242.field3749[var3++] = var272.field4535;
                                            class252.field3997[var4++] = var272.field4530;
                                            class242.field3749[var3++] = var271.field1505;
                                        }
                                        continue;
                                    }
                                    if (var537 == 6507) {
                                        var3 -= 4;
                                        int var273 = class242.field3749[var3];
                                        boolean var274 = class242.field3749[var3 + 1] == 1;
                                        int var275 = class242.field3749[var3 + 2];
                                        boolean var276 = class242.field3749[var3 + 3] == 1;
                                        class215.method1501(var276, arg0 ^ 0xFFFFFFAE, var273, var275, var274);
                                        continue;
                                    }
                                } else if (var537 < 6700) {
                                    if (var537 == 6600) {
                                        var3--;
                                        class222.field3355 = class242.field3749[var3] == 1;
                                        class160.method1162(class156.field2451, (byte) -127);
                                        continue;
                                    }
                                    if (var537 == 6601) {
                                        class242.field3749[var3++] = class222.field3355 ? 1 : 0;
                                        continue;
                                    }
                                } else if (var537 < 6900) {
                                    if (var537 == 6800) {
                                        var3--;
                                        int var277 = class242.field3749[var3];
                                        class103 var278 = class79.method521(var277, -85);
                                        if (var278.field1396 == null) {
                                            class252.field3997[var4++] = "";
                                        } else {
                                            class252.field3997[var4++] = var278.field1396;
                                        }
                                        continue;
                                    }
                                    if (var537 == 6801) {
                                        var3--;
                                        int var279 = class242.field3749[var3];
                                        class103 var280 = class79.method521(var279, -69);
                                        class242.field3749[var3++] = var280.field1421;
                                        continue;
                                    }
                                    if (var537 == 6802) {
                                        var3--;
                                        int var281 = class242.field3749[var3];
                                        class103 var282 = class79.method521(var281, -90);
                                        class242.field3749[var3++] = var282.field1407;
                                        continue;
                                    }
                                    if (var537 == 6803) {
                                        var3--;
                                        int var283 = class242.field3749[var3];
                                        class103 var284 = class79.method521(var283, arg0 ^ 0xFFFFFFB0);
                                        class242.field3749[var3++] = var284.field1397;
                                        continue;
                                    }
                                }
                            } else if (var537 == 4500) {
                                var3 -= 2;
                                int var372 = class242.field3749[var3 + 1];
                                int var373 = class242.field3749[var3];
                                class303 var374 = class113.method733(var372, true);
                                if (var374.method2135(-118)) {
                                    class252.field3997[var4++] = class305.method2150(var373, 117).method1738(var372, 122, var374.field4712);
                                } else {
                                    class242.field3749[var3++] = class305.method2150(var373, 116).method1737(var374.field4714, (byte) 119, var372);
                                }
                                continue;
                            }
                        } else if (var537 == 4400) {
                            var3 -= 2;
                            int var375 = class242.field3749[var3 + 1];
                            int var376 = class242.field3749[var3];
                            class303 var377 = class113.method733(var375, true);
                            if (var377.method2135(-67)) {
                                class252.field3997[var4++] = class123.method795(0, var376).method1616(0, var377.field4712, var375);
                            } else {
                                class242.field3749[var3++] = class123.method795(0, var376).method1621(var375, class60.method368(arg0, 127), var377.field4714);
                            }
                            continue;
                        }
                    } else if (var537 == 4300) {
                        var3 -= 2;
                        int var378 = class242.field3749[var3];
                        int var379 = class242.field3749[var3 + 1];
                        class303 var380 = class113.method733(var379, true);
                        if (var380.method2135(-80)) {
                            class252.field3997[var4++] = class178.method1229(var378, class60.method368(arg0, 8)).method965(arg0 + 6, var380.field4712, var379);
                        } else {
                            class242.field3749[var3++] = class178.method1229(var378, 8).method967(2, var380.field4714, var379);
                        }
                        continue;
                    }
                } else {
                    class323 var43;
                    if (var537 < 2000) {
                        var43 = var38 ? class52.field610 : class259.field4100;
                    } else {
                        var537 -= 1000;
                        var10000 = arg0 ^ 0xFFFFCDBE;
                        var3--;
                        var43 = class45.method277(var10000, class242.field3749[var3]);
                    }
                    if (var537 == 1300) {
                        var3--;
                        int var44 = class242.field3749[var3] - 1;
                        if (var44 >= 0 && var44 <= 9) {
                            var4--;
                            var43.method2243(true, var44, class252.field3997[var4]);
                            continue;
                        }
                        var4--;
                        continue;
                    }
                    if (var537 == 1301) {
                        var3 -= 2;
                        int var45 = class242.field3749[var3];
                        int var46 = class242.field3749[var3 + 1];
                        var43.field5194 = class291.method2078(var45, var46, arg0);
                        continue;
                    }
                    if (var537 == 1302) {
                        var3--;
                        var43.field5035 = class242.field3749[var3] == 1;
                        continue;
                    }
                    if (var537 == 1303) {
                        var3--;
                        var43.field5127 = class242.field3749[var3];
                        continue;
                    }
                    if (var537 == 1304) {
                        var3--;
                        var43.field5155 = class242.field3749[var3];
                        continue;
                    }
                    if (var537 == 1305) {
                        var4--;
                        var43.field5105 = class252.field3997[var4];
                        continue;
                    }
                    if (var537 == 1306) {
                        var4--;
                        var43.field5116 = class252.field3997[var4];
                        continue;
                    }
                    if (var537 == 1307) {
                        var43.field5117 = null;
                        continue;
                    }
                    if (var537 == 1308) {
                        var3--;
                        var43.field5163 = class242.field3749[var3];
                        var3--;
                        var43.field5202 = class242.field3749[var3];
                        continue;
                    }
                    if (var537 == 1309) {
                        var3--;
                        int var47 = class242.field3749[var3];
                        var3--;
                        int var48 = class242.field3749[var3];
                        if (var48 >= 1 && var48 <= 10) {
                            var43.method2246(false, var48 - 1, var47);
                        }
                        continue;
                    }
                    if (var537 == 1310) {
                        var4--;
                        var43.field5148 = class252.field3997[var4];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var536) {
            if (arg1.field1782 == null) {
                if (class296.field4656 != 0) {
                    class306.method2157("Clientscript error - check log for details", false, 0, "");
                }
                class27.method198(var536, (byte) 62, "CS2 - scr:" + arg1.field2834 + " op:" + var8);
            } else {
                StringBuffer var533 = new StringBuffer(30);
                var533.append("%0a - in: ").append(arg1.field1782);
                for (int var534 = class278.field4378 - 1; var534 >= 0; var534--) {
                    var533.append("%0a - via: ").append(class91.field1199[var534].field4055.field1782);
                }
                if (var8 == 40) {
                    int var535 = var7[var5];
                    var533.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var535));
                }
                if (class296.field4656 != 0) {
                    class306.method2157("Clientscript error in: " + arg1.field1782, false, 0, "");
                }
                class27.method198(var536, (byte) 62, "CS2 - scr:" + arg1.field2834 + " op:" + var8 + var533.toString());
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjava/lang/String;ZI)I", line = 6602)
    public static final int method1225(int arg0, String arg1, boolean arg2, int arg3) {
        field2672++;
        if (arg0 <= 93) {
            return 96;
        } else if (arg3 >= 2 && arg3 <= 36) {
            boolean var4 = false;
            int var5 = 0;
            boolean var6 = false;
            int var7 = arg1.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg1.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg2) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    throw new NumberFormatException();
                }
                if (var11 >= arg3) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg3 * var5 + var11;
                if ((var10 / arg3) != var5) {
                    throw new NumberFormatException();
                }
                var6 = true;
                var5 = var10;
            }
            if (!var6) {
                throw new NumberFormatException();
            }
            return var5;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 6685)
    public static final void method1226(byte arg0) {
        if (arg0 <= 19) {
            field2668 = (class249) null;
        }
        class102.field1378.method383((byte) -48);
        field2671++;
    }
}
