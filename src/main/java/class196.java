import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class196 extends class103 {

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "[I")
    private static int[] field2702 = new int[3];

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2711 = "Started 3d Library";

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    public int field2712;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "Lkk;")
    public static class295 field2703;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "Ljava/lang/String;")
    public String field2706;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "Ljava/lang/String;")
    public String field2709;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "[I")
    public static int[] field2708;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V", line = 7)
    public static void method1413(int arg0) {
        field2702 = null;
        int var1 = -99 / ((arg0 - 10) / 40);
        field2711 = null;
        field2703 = null;
        field2708 = null;
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)Z", line = 19)
    public static final boolean method1414(int arg0) {
        field2707++;
        if (class194.field2673 == 0) {
            if (arg0 < 17) {
                field2708 = (int[]) null;
            }
            return class360.field5630.method1519((byte) 70);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILjl;)V", line = 44)
    public static final void method1415(int arg0, int arg1, class20 arg2) {
        class299.field4381 = 0;
        int var3 = 0;
        field2701++;
        int var4 = -1;
        int var5 = 0;
        int[] var6 = arg2.field222;
        if (arg1 != 1006199388) {
            return;
        }
        int[] var7 = arg2.field220;
        byte var8 = -1;
        try {
            int var9 = 0;
            label4475: while (true) {
                var9++;
                if (var9 > arg0) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var537 = var6[var4];
                if (var537 < 100) {
                    if (var537 == 0) {
                        class45.field564[var3++] = var7[var4];
                        continue;
                    }
                    if (var537 == 1) {
                        int var10 = var7[var4];
                        class45.field564[var3++] = class208.field2956[var10];
                        continue;
                    }
                    if (var537 == 2) {
                        int var11 = var7[var4];
                        var3--;
                        class58.method437(false, var11, class45.field564[var3]);
                        continue;
                    }
                    if (var537 == 3) {
                        class293.field4266[var5++] = arg2.field223[var4];
                        continue;
                    }
                    if (var537 == 6) {
                        var4 += var7[var4];
                        continue;
                    }
                    if (var537 == 7) {
                        var3 -= 2;
                        if (class45.field564[var3 + 1] != class45.field564[var3]) {
                            var4 += var7[var4];
                        }
                        continue;
                    }
                    if (var537 == 8) {
                        var3 -= 2;
                        if (class45.field564[var3 + 1] == class45.field564[var3]) {
                            var4 += var7[var4];
                        }
                        continue;
                    }
                    if (var537 == 9) {
                        var3 -= 2;
                        if (class45.field564[var3] < class45.field564[var3 + 1]) {
                            var4 += var7[var4];
                        }
                        continue;
                    }
                    if (var537 == 10) {
                        var3 -= 2;
                        if (class45.field564[var3 + 1] < class45.field564[var3]) {
                            var4 += var7[var4];
                        }
                        continue;
                    }
                    if (var537 == 21) {
                        if (class299.field4381 == 0) {
                            return;
                        }
                        class61 var12 = class277.field3966[--class299.field4381];
                        class340.field5311 = var12.field763;
                        arg2 = var12.field761;
                        var4 = var12.field766;
                        var7 = arg2.field220;
                        class359.field5615 = var12.field768;
                        var6 = arg2.field222;
                        continue;
                    }
                    if (var537 == 25) {
                        int var13 = var7[var4];
                        class45.field564[var3++] = class56.method424((byte) -103, var13);
                        continue;
                    }
                    if (var537 == 27) {
                        int var14 = var7[var4];
                        var3--;
                        class351.method2447(var14, 0, class45.field564[var3]);
                        continue;
                    }
                    if (var537 == 31) {
                        var3 -= 2;
                        if (class45.field564[var3] <= class45.field564[var3 + 1]) {
                            var4 += var7[var4];
                        }
                        continue;
                    }
                    if (var537 == 32) {
                        var3 -= 2;
                        if (class45.field564[var3 + 1] <= class45.field564[var3]) {
                            var4 += var7[var4];
                        }
                        continue;
                    }
                    if (var537 == 33) {
                        class45.field564[var3++] = class359.field5615[var7[var4]];
                        continue;
                    }
                    int var10001;
                    if (var537 == 34) {
                        var10001 = var7[var4];
                        var3--;
                        class359.field5615[var10001] = class45.field564[var3];
                        continue;
                    }
                    if (var537 == 35) {
                        class293.field4266[var5++] = class340.field5311[var7[var4]];
                        continue;
                    }
                    if (var537 == 36) {
                        var10001 = var7[var4];
                        var5--;
                        class340.field5311[var10001] = class293.field4266[var5];
                        continue;
                    }
                    if (var537 == 37) {
                        int var15 = var7[var4];
                        var5 -= var15;
                        String var16 = class190.method1382(false, class293.field4266, var5, var15);
                        class293.field4266[var5++] = var16;
                        continue;
                    }
                    if (var537 == 38) {
                        var3--;
                        continue;
                    }
                    if (var537 == 39) {
                        var5--;
                        continue;
                    }
                    if (var537 == 40) {
                        int var17 = var7[var4];
                        class20 var18 = class294.method2013(false, var17);
                        int[] var19 = new int[var18.field230];
                        String[] var20 = new String[var18.field228];
                        for (int var21 = 0; var21 < var18.field225; var21++) {
                            var19[var21] = class45.field564[var3 + var21 - var18.field225];
                        }
                        for (int var22 = 0; var22 < var18.field219; var22++) {
                            var20[var22] = class293.field4266[var22 + var5 - var18.field219];
                        }
                        var3 -= var18.field225;
                        var5 -= var18.field219;
                        class61 var23 = new class61();
                        var23.field768 = class359.field5615;
                        var23.field763 = class340.field5311;
                        var23.field766 = var4;
                        var23.field761 = arg2;
                        if (class299.field4381 >= class277.field3966.length) {
                            throw new RuntimeException();
                        }
                        class277.field3966[class299.field4381++] = var23;
                        class340.field5311 = var20;
                        arg2 = var18;
                        var4 = -1;
                        var6 = var18.field222;
                        class359.field5615 = var19;
                        var7 = var18.field220;
                        continue;
                    }
                    if (var537 == 42) {
                        class45.field564[var3++] = class194.field2689[var7[var4]];
                        continue;
                    }
                    if (var537 == 43) {
                        int var24 = var7[var4];
                        var3--;
                        class194.field2689[var24] = class45.field564[var3];
                        class204.method1482(-9626, var24);
                        continue;
                    }
                    if (var537 == 44) {
                        int var25 = var7[var4] & 0xFFFF;
                        int var26 = var7[var4] >> 16;
                        var3--;
                        int var27 = class45.field564[var3];
                        if (var27 >= 0 && var27 <= 5000) {
                            byte var28 = -1;
                            if (var25 == 105) {
                                var28 = 0;
                            }
                            class322.field4729[var26] = var27;
                            int var29 = 0;
                            while (true) {
                                if (var29 >= var27) {
                                    continue label4475;
                                }
                                class5.field57[var26][var29] = var28;
                                var29++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var537 == 45) {
                        int var30 = var7[var4];
                        var3--;
                        int var31 = class45.field564[var3];
                        if (var31 >= 0 && var31 < class322.field4729[var30]) {
                            class45.field564[var3++] = class5.field57[var30][var31];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var537 == 46) {
                        int var32 = var7[var4];
                        var3 -= 2;
                        int var33 = class45.field564[var3];
                        if (var33 >= 0 && var33 < class322.field4729[var32]) {
                            class5.field57[var32][var33] = class45.field564[var3 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var537 == 47) {
                        String var34 = class323.field4740[var7[var4]];
                        if (var34 == null) {
                            var34 = "null";
                        }
                        class293.field4266[var5++] = var34;
                        continue;
                    }
                    if (var537 == 48) {
                        int var35 = var7[var4];
                        var5--;
                        class323.field4740[var35] = class293.field4266[var5];
                        class213.method1559(var35, false);
                        continue;
                    }
                    if (var537 == 51) {
                        class329 var36 = arg2.field224[var7[var4]];
                        var3--;
                        class7 var37 = (class7) var36.method2279((long) class45.field564[var3], arg1 ^ 0x3BF96216);
                        if (var37 != null) {
                            var4 += var37.field67;
                        }
                        continue;
                    }
                }
                boolean var38;
                if (var7[var4] == 1) {
                    var38 = true;
                } else {
                    var38 = false;
                }
                if (var537 < 300) {
                    if (var537 == 100) {
                        var3 -= 3;
                        int var517 = class45.field564[var3 + 2];
                        int var518 = class45.field564[var3];
                        int var519 = class45.field564[var3 + 1];
                        if (var519 != 0) {
                            class333 var520 = class89.method644(-107, var518);
                            if (var520.field5187 == null) {
                                var520.field5187 = new class333[var517 + 1];
                            }
                            if (var517 >= var520.field5187.length) {
                                class333[] var521 = new class333[var517 + 1];
                                for (int var522 = 0; var522 < var520.field5187.length; var522++) {
                                    var521[var522] = var520.field5187[var522];
                                }
                                var520.field5187 = var521;
                            }
                            if (var517 > 0 && var520.field5187[var517 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var517 - 1));
                            }
                            class333 var523 = new class333();
                            var523.field5142 = var523.field5109 = var520.field5109;
                            var523.field5154 = true;
                            var523.field5199 = var517;
                            var523.field5105 = var519;
                            var520.field5187[var517] = var523;
                            if (var38) {
                                class321.field4710 = var523;
                            } else {
                                class171.field2371 = var523;
                            }
                            class142.method1097(47, var520);
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var537 == 101) {
                        class333 var524 = var38 ? class321.field4710 : class171.field2371;
                        if (var524.field5199 == -1) {
                            if (!var38) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class333 var525 = class89.method644(arg1 - 1006199291, var524.field5109);
                        var525.field5187[var524.field5199] = null;
                        class142.method1097(38, var525);
                        continue;
                    }
                    if (var537 == 102) {
                        var3--;
                        class333 var526 = class89.method644(-92, class45.field564[var3]);
                        var526.field5187 = null;
                        class142.method1097(60, var526);
                        continue;
                    }
                    if (var537 == 200) {
                        var3 -= 2;
                        int var527 = class45.field564[var3];
                        int var528 = class45.field564[var3 + 1];
                        class333 var529 = class283.method1926(var527, (byte) 82, var528);
                        if (var529 != null && var528 != -1) {
                            class45.field564[var3++] = 1;
                            if (var38) {
                                class321.field4710 = var529;
                            } else {
                                class171.field2371 = var529;
                            }
                            continue;
                        }
                        class45.field564[var3++] = 0;
                        continue;
                    }
                    if (var537 == 201) {
                        var3--;
                        int var530 = class45.field564[var3];
                        class333 var531 = class89.method644(arg1 - 1006199343, var530);
                        if (var531 == null) {
                            class45.field564[var3++] = 0;
                        } else {
                            class45.field564[var3++] = 1;
                            if (var38) {
                                class321.field4710 = var531;
                            } else {
                                class171.field2371 = var531;
                            }
                        }
                        continue;
                    }
                } else if (var537 < 500) {
                    if (var537 == 403) {
                        var3 -= 2;
                        int var510 = class45.field564[var3];
                        int var511 = class45.field564[var3 + 1];
                        for (int var512 = 0; var512 < class362.field5659.length; var512++) {
                            if (class362.field5659[var512] == var510) {
                                class359.field5616.field3480.method923((byte) -111, var512, var511);
                                continue label4475;
                            }
                        }
                        int var513 = 0;
                        while (true) {
                            if (class30.field353.length <= var513) {
                                continue label4475;
                            }
                            if (class30.field353[var513] == var510) {
                                class359.field5616.field3480.method923((byte) -40, var513, var511);
                                continue label4475;
                            }
                            var513++;
                        }
                    }
                    if (var537 == 404) {
                        var3 -= 2;
                        int var514 = class45.field564[var3];
                        int var515 = class45.field564[var3 + 1];
                        class359.field5616.field3480.method932(var514, (byte) -103, var515);
                        continue;
                    }
                    if (var537 == 410) {
                        var3--;
                        boolean var516 = class45.field564[var3] != 0;
                        class359.field5616.field3480.method924(var516, arg1 - 1006199376);
                        continue;
                    }
                } else if (!(var537 < 1000 || var537 >= 1100) || !(var537 < 2000 || var537 >= 2100)) {
                    class333 var39;
                    if (var537 < 2000) {
                        var39 = var38 ? class321.field4710 : class171.field2371;
                    } else {
                        var3--;
                        var39 = class89.method644(-121, class45.field564[var3]);
                        var537 -= 1000;
                    }
                    if (var537 == 1000) {
                        var3 -= 4;
                        var39.field5128 = class45.field564[var3];
                        var39.field5174 = class45.field564[var3 + 1];
                        int var40 = class45.field564[var3 + 2];
                        if (var40 < 0) {
                            var40 = 0;
                        } else if (var40 > 5) {
                            var40 = 5;
                        }
                        int var41 = class45.field564[var3 + 3];
                        var39.field5164 = (byte) var40;
                        if (var41 < 0) {
                            var41 = 0;
                        } else if (var41 > 5) {
                            var41 = 5;
                        }
                        var39.field5130 = (byte) var41;
                        class142.method1097(90, var39);
                        class218.method1581(var39, (byte) -102);
                        if (var39.field5199 == -1) {
                            class277.method1873(var39.field5109, 11);
                        }
                        continue;
                    }
                    if (var537 == 1001) {
                        var3 -= 4;
                        var39.field5127 = class45.field564[var3];
                        var39.field5173 = class45.field564[var3 + 1];
                        var39.field5183 = 0;
                        var39.field5119 = 0;
                        int var42 = class45.field564[var3 + 3];
                        if (var42 < 0) {
                            var42 = 0;
                        } else if (var42 > 4) {
                            var42 = 4;
                        }
                        int var43 = class45.field564[var3 + 2];
                        if (var43 < 0) {
                            var43 = 0;
                        } else if (var43 > 4) {
                            var43 = 4;
                        }
                        var39.field5211 = (byte) var42;
                        var39.field5072 = (byte) var43;
                        class142.method1097(67, var39);
                        class218.method1581(var39, (byte) 99);
                        if (var39.field5105 == 0) {
                            class45.method323(false, false, var39);
                        }
                        continue;
                    }
                    if (var537 == 1003) {
                        var3--;
                        boolean var44 = class45.field564[var3] == 1;
                        if (var44 != var39.field5158) {
                            var39.field5158 = var44;
                            class142.method1097(arg1 ^ 0xC4069DD9, var39);
                        }
                        if (var39.field5199 == -1) {
                            class131.method1006(var39.field5109, 881);
                        }
                        continue;
                    }
                    if (var537 == 1004) {
                        var3 -= 2;
                        var39.field5092 = class45.field564[var3];
                        var39.field5202 = class45.field564[var3 + 1];
                        class142.method1097(94, var39);
                        class218.method1581(var39, (byte) 111);
                        if (var39.field5105 == 0) {
                            class45.method323(false, false, var39);
                        }
                        continue;
                    }
                    if (var537 == 1005) {
                        var3--;
                        var39.field5069 = class45.field564[var3] == 1;
                        continue;
                    }
                } else if (!(var537 < 1100 || var537 >= 1200) || !(var537 < 2100 || var537 >= 2200)) {
                    class333 var45;
                    if (var537 >= 2000) {
                        var3--;
                        var45 = class89.method644(60, class45.field564[var3]);
                        var537 -= 1000;
                    } else {
                        var45 = var38 ? class321.field4710 : class171.field2371;
                    }
                    if (var537 == 1100) {
                        var3 -= 2;
                        var45.field5136 = class45.field564[var3];
                        if ((var45.field5037 - var45.field5056) < var45.field5136) {
                            var45.field5136 = var45.field5037 - var45.field5056;
                        }
                        if (var45.field5136 < 0) {
                            var45.field5136 = 0;
                        }
                        var45.field5134 = class45.field564[var3 + 1];
                        if (var45.field5134 > (var45.field5044 - var45.field5172)) {
                            var45.field5134 = var45.field5044 - var45.field5172;
                        }
                        if (var45.field5134 < 0) {
                            var45.field5134 = 0;
                        }
                        class142.method1097(-126, var45);
                        if (var45.field5199 == -1) {
                            class1.method4(var45.field5109, 12);
                        }
                        continue;
                    }
                    if (var537 == 1101) {
                        var3--;
                        var45.field5138 = class45.field564[var3];
                        class142.method1097(48, var45);
                        if (var45.field5199 == -1) {
                            class156.method1199(true, var45.field5109);
                        }
                        continue;
                    }
                    if (var537 == 1102) {
                        var3--;
                        var45.field5132 = class45.field564[var3] == 1;
                        class142.method1097(60, var45);
                        continue;
                    }
                    if (var537 == 1103) {
                        var3--;
                        var45.field5083 = class45.field564[var3];
                        class142.method1097(arg1 ^ 0x3BF96206, var45);
                        continue;
                    }
                    if (var537 == 1104) {
                        var3--;
                        var45.field5076 = class45.field564[var3];
                        class142.method1097(76, var45);
                        continue;
                    }
                    if (var537 == 1105) {
                        var3--;
                        var45.field5168 = class45.field564[var3];
                        class142.method1097(-117, var45);
                        continue;
                    }
                    if (var537 == 1106) {
                        var3--;
                        var45.field5184 = class45.field564[var3];
                        class142.method1097(-126, var45);
                        continue;
                    }
                    if (var537 == 1107) {
                        var3--;
                        var45.field5112 = class45.field564[var3] == 1;
                        class142.method1097(arg1 - 1006199505, var45);
                        continue;
                    }
                    if (var537 == 1108) {
                        var45.field5144 = 1;
                        var3--;
                        var45.field5070 = class45.field564[var3];
                        class142.method1097(arg1 ^ 0x3BF96217, var45);
                        if (var45.field5199 == -1) {
                            class293.method2006(arg1 - 1006199388, var45.field5109);
                        }
                        continue;
                    }
                    if (var537 == 1109) {
                        var3 -= 6;
                        var45.field5192 = class45.field564[var3];
                        var45.field5087 = class45.field564[var3 + 1];
                        var45.field5160 = class45.field564[var3 + 2];
                        var45.field5210 = class45.field564[var3 + 3];
                        var45.field5042 = class45.field564[var3 + 4];
                        var45.field5116 = class45.field564[var3 + 5];
                        class142.method1097(-116, var45);
                        if (var45.field5199 == -1) {
                            class321.method2219(arg1 ^ 0x3BF96254, var45.field5109);
                            class49.method386(var45.field5109, arg1 ^ 0x3BF96237);
                        }
                        continue;
                    }
                    if (var537 == 1110) {
                        var3--;
                        int var46 = class45.field564[var3];
                        if (var45.field5053 != var46) {
                            var45.field5074 = 0;
                            var45.field5053 = var46;
                            var45.field5218 = 1;
                            var45.field5054 = 0;
                            class142.method1097(-124, var45);
                        }
                        if (var45.field5199 == -1) {
                            class286.method1961(var45.field5109, false);
                        }
                        continue;
                    }
                    if (var537 == 1111) {
                        var3--;
                        var45.field5159 = class45.field564[var3] == 1;
                        class142.method1097(122, var45);
                        continue;
                    }
                    if (var537 == 1112) {
                        var5--;
                        String var47 = class293.field4266[var5];
                        if (!var47.equals(var45.field5058)) {
                            var45.field5058 = var47;
                            class142.method1097(-118, var45);
                        }
                        if (var45.field5199 == -1) {
                            class102.method726(var45.field5109, 3);
                        }
                        continue;
                    }
                    if (var537 == 1113) {
                        var3--;
                        var45.field5180 = class45.field564[var3];
                        class142.method1097(66, var45);
                        continue;
                    }
                    if (var537 == 1114) {
                        var3 -= 3;
                        var45.field5123 = class45.field564[var3];
                        var45.field5121 = class45.field564[var3 + 1];
                        var45.field5170 = class45.field564[var3 + 2];
                        class142.method1097(103, var45);
                        continue;
                    }
                    if (var537 == 1115) {
                        var3--;
                        var45.field5153 = class45.field564[var3] == 1;
                        class142.method1097(arg1 - 1006199275, var45);
                        continue;
                    }
                    if (var537 == 1116) {
                        var3--;
                        var45.field5209 = class45.field564[var3];
                        class142.method1097(arg1 ^ 0xC4069DD4, var45);
                        continue;
                    }
                    if (var537 == 1117) {
                        var3--;
                        var45.field5139 = class45.field564[var3];
                        class142.method1097(31, var45);
                        continue;
                    }
                    if (var537 == 1118) {
                        var3--;
                        var45.field5051 = class45.field564[var3] == 1;
                        class142.method1097(-117, var45);
                        continue;
                    }
                    if (var537 == 1119) {
                        var3--;
                        var45.field5067 = class45.field564[var3] == 1;
                        class142.method1097(-128, var45);
                        continue;
                    }
                    if (var537 == 1120) {
                        var3 -= 2;
                        var45.field5037 = class45.field564[var3];
                        var45.field5044 = class45.field564[var3 + 1];
                        class142.method1097(-122, var45);
                        if (var45.field5105 == 0) {
                            class45.method323(false, false, var45);
                        }
                        continue;
                    }
                    if (var537 == 1121) {
                        var3 -= 2;
                        var45.field5212 = (short) class45.field564[var3];
                        var45.field5178 = (short) class45.field564[var3 + 1];
                        class142.method1097(-122, var45);
                        continue;
                    }
                    if (var537 == 1122) {
                        var3--;
                        var45.field5131 = class45.field564[var3] == 1;
                        class142.method1097(84, var45);
                        continue;
                    }
                    if (var537 == 1123) {
                        var3--;
                        var45.field5116 = class45.field564[var3];
                        class142.method1097(96, var45);
                        if (var45.field5199 == -1) {
                            class321.method2219(arg1 ^ 0x3BF96254, var45.field5109);
                        }
                        continue;
                    }
                    if (var537 == 1124) {
                        var3--;
                        int var48 = class45.field564[var3];
                        var45.field5099 = var48 == 1;
                        class142.method1097(79, var45);
                        continue;
                    }
                } else if (!(var537 < 1200 || var537 >= 1300) || !(var537 < 2200 || var537 >= 2300)) {
                    class333 var49;
                    if (var537 < 2000) {
                        var49 = var38 ? class321.field4710 : class171.field2371;
                    } else {
                        var537 -= 1000;
                        var3--;
                        var49 = class89.method644(-114, class45.field564[var3]);
                    }
                    class142.method1097(arg1 ^ 0x3BF96212, var49);
                    if (var537 == 1200 || var537 == 1205 || var537 == 1208 || var537 == 1209) {
                        var3 -= 2;
                        int var50 = class45.field564[var3 + 1];
                        int var51 = class45.field564[var3];
                        if (var49.field5199 == -1) {
                            class286.method1958(var49.field5109, 9);
                            class321.method2219(8, var49.field5109);
                            class49.method386(var49.field5109, 118);
                        }
                        if (var51 == -1) {
                            var49.field5144 = 1;
                            var49.field5070 = -1;
                            var49.field5143 = -1;
                            continue;
                        }
                        var49.field5191 = var50;
                        if (var537 == 1208 || var537 == 1209) {
                            var49.field5217 = true;
                        } else {
                            var49.field5217 = false;
                        }
                        var49.field5143 = var51;
                        class362 var52 = class172.method1265(var51, (byte) 28);
                        var49.field5087 = var52.field5712;
                        var49.field5192 = var52.field5670;
                        var49.field5160 = var52.field5691;
                        var49.field5210 = var52.field5708;
                        var49.field5116 = var52.field5660;
                        var49.field5042 = var52.field5667;
                        if (var537 == 1205) {
                            var49.field5065 = false;
                        } else {
                            var49.field5065 = true;
                        }
                        if (var49.field5183 > 0) {
                            var49.field5116 = var49.field5116 * 32 / var49.field5183;
                        } else if (var49.field5127 > 0) {
                            var49.field5116 = var49.field5116 * 32 / var49.field5127;
                        }
                        continue;
                    }
                    if (var537 == 1201) {
                        var49.field5144 = 2;
                        var3--;
                        var49.field5070 = class45.field564[var3];
                        if (var49.field5199 == -1) {
                            class293.method2006(0, var49.field5109);
                        }
                        continue;
                    }
                    if (var537 == 1202) {
                        var49.field5144 = 3;
                        var49.field5070 = class359.field5616.field3480.method930((byte) 99);
                        if (var49.field5199 == -1) {
                            class293.method2006(0, var49.field5109);
                        }
                        continue;
                    }
                    if (var537 == 1203) {
                        var49.field5144 = 6;
                        var3--;
                        var49.field5070 = class45.field564[var3];
                        if (var49.field5199 == -1) {
                            class293.method2006(0, var49.field5109);
                        }
                        continue;
                    }
                    if (var537 == 1204) {
                        var49.field5144 = 5;
                        var3--;
                        var49.field5070 = class45.field564[var3];
                        if (var49.field5199 == -1) {
                            class293.method2006(0, var49.field5109);
                        }
                        continue;
                    }
                    if (var537 == 1206) {
                        var3 -= 4;
                        var49.field5205 = class45.field564[var3];
                        var49.field5113 = class45.field564[var3 + 1];
                        var49.field5213 = class45.field564[var3 + 2];
                        var49.field5075 = class45.field564[var3 + 3];
                        class142.method1097(95, var49);
                        continue;
                    }
                    if (var537 == 1207) {
                        var3 -= 2;
                        var49.field5194 = class45.field564[var3];
                        var49.field5115 = class45.field564[var3 + 1];
                        class142.method1097(53, var49);
                        continue;
                    }
                } else if (var537 >= 1300 && var537 < 1400 || var537 >= 2300 && var537 < 2400) {
                    class333 var53;
                    if (var537 < 2000) {
                        var53 = var38 ? class321.field4710 : class171.field2371;
                    } else {
                        var537 -= 1000;
                        var3--;
                        var53 = class89.method644(51, class45.field564[var3]);
                    }
                    if (var537 == 1300) {
                        var3--;
                        int var54 = class45.field564[var3] - 1;
                        if (var54 >= 0 && var54 <= 9) {
                            var5--;
                            var53.method2318(class293.field4266[var5], 112, var54);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var537 == 1301) {
                        var3 -= 2;
                        int var55 = class45.field564[var3 + 1];
                        int var56 = class45.field564[var3];
                        var53.field5038 = class283.method1926(var56, (byte) 82, var55);
                        continue;
                    }
                    if (var537 == 1302) {
                        var3--;
                        var53.field5046 = class45.field564[var3] == 1;
                        continue;
                    }
                    if (var537 == 1303) {
                        var3--;
                        var53.field5071 = class45.field564[var3];
                        continue;
                    }
                    if (var537 == 1304) {
                        var3--;
                        var53.field5179 = class45.field564[var3];
                        continue;
                    }
                    if (var537 == 1305) {
                        var5--;
                        var53.field5073 = class293.field4266[var5];
                        continue;
                    }
                    if (var537 == 1306) {
                        var5--;
                        var53.field5214 = class293.field4266[var5];
                        continue;
                    }
                    if (var537 == 1307) {
                        var53.field5165 = null;
                        continue;
                    }
                    if (var537 == 1308) {
                        var3--;
                        var53.field5049 = class45.field564[var3];
                        var3--;
                        var53.field5133 = class45.field564[var3];
                        continue;
                    }
                    if (var537 == 1309) {
                        var3--;
                        int var57 = class45.field564[var3];
                        var3--;
                        int var58 = class45.field564[var3];
                        if (var58 >= 1 && var58 <= 10) {
                            var53.method2321(var58 - 1, var57, arg1 ^ 0xC4069DDB);
                        }
                        continue;
                    }
                    if (var537 == 1310) {
                        var5--;
                        var53.field5104 = class293.field4266[var5];
                        continue;
                    }
                } else {
                    int var10000;
                    if (var537 >= 1400 && var537 < 1500 || var537 >= 2400 && var537 < 2500) {
                        class333 var59;
                        if (var537 < 2000) {
                            var59 = var38 ? class321.field4710 : class171.field2371;
                        } else {
                            var10000 = arg1 ^ 0xC4069DFC;
                            var3--;
                            var59 = class89.method644(var10000, class45.field564[var3]);
                            var537 -= 1000;
                        }
                        var5--;
                        String var60 = class293.field4266[var5];
                        int[] var61 = null;
                        if (var60.length() > 0 && var60.charAt(var60.length() - 1) == 'Y') {
                            var3--;
                            int var62 = class45.field564[var3];
                            if (var62 > 0) {
                                var61 = new int[var62];
                                while ((var62--) > 0) {
                                    var3--;
                                    var61[var62] = class45.field564[var3];
                                }
                            }
                            var60 = var60.substring(0, var60.length() - 1);
                        }
                        Object[] var63 = new Object[var60.length() + 1];
                        for (int var64 = var63.length - 1; var64 >= 1; var64--) {
                            if (var60.charAt(var64 - 1) == 's') {
                                var5--;
                                var63[var64] = class293.field4266[var5];
                            } else {
                                var3--;
                                var63[var64] = Integer.valueOf(class45.field564[var3]);
                            }
                        }
                        var3--;
                        int var65 = class45.field564[var3];
                        if (var65 == -1) {
                            var63 = null;
                        } else {
                            var63[0] = Integer.valueOf(var65);
                        }
                        var59.field5048 = true;
                        if (var537 == 1400) {
                            var59.field5196 = var63;
                        } else if (var537 == 1401) {
                            var59.field5060 = var63;
                        } else if (var537 == 1402) {
                            var59.field5201 = var63;
                        } else if (var537 == 1403) {
                            var59.field5171 = var63;
                        } else if (var537 == 1404) {
                            var59.field5190 = var63;
                        } else if (var537 == 1405) {
                            var59.field5068 = var63;
                        } else if (var537 == 1406) {
                            var59.field5111 = var63;
                        } else if (var537 == 1407) {
                            var59.field5163 = var63;
                            var59.field5152 = var61;
                        } else if (var537 == 1408) {
                            var59.field5108 = var63;
                        } else if (var537 == 1409) {
                            var59.field5118 = var63;
                        } else if (var537 == 1410) {
                            var59.field5055 = var63;
                        } else if (var537 == 1411) {
                            var59.field5103 = var63;
                        } else if (var537 == 1412) {
                            var59.field5062 = var63;
                        } else if (var537 == 1414) {
                            var59.field5176 = var61;
                            var59.field5036 = var63;
                        } else if (var537 == 1415) {
                            var59.field5167 = var63;
                            var59.field5135 = var61;
                        } else if (var537 == 1416) {
                            var59.field5090 = var63;
                        } else if (var537 == 1417) {
                            var59.field5137 = var63;
                        } else if (var537 == 1418) {
                            var59.field5052 = var63;
                        } else if (var537 == 1419) {
                            var59.field5063 = var63;
                        } else if (var537 == 1420) {
                            var59.field5086 = var63;
                        } else if (var537 == 1421) {
                            var59.field5149 = var63;
                        } else if (var537 == 1422) {
                            var59.field5203 = var63;
                        } else if (var537 == 1423) {
                            var59.field5126 = var63;
                        } else if (var537 == 1424) {
                            var59.field5039 = var63;
                        } else if (var537 == 1425) {
                            var59.field5094 = var63;
                        } else if (var537 == 1426) {
                            var59.field5050 = var63;
                        } else if (var537 == 1427) {
                            var59.field5206 = var63;
                        } else if (var537 == 1428) {
                            var59.field5175 = var63;
                            var59.field5215 = var61;
                        } else if (var537 == 1429) {
                            var59.field5145 = var63;
                            var59.field5101 = var61;
                        }
                        continue;
                    }
                    if (var537 < 1600) {
                        class333 var509 = var38 ? class321.field4710 : class171.field2371;
                        if (var537 == 1500) {
                            class45.field564[var3++] = var509.field5188;
                            continue;
                        }
                        if (var537 == 1501) {
                            class45.field564[var3++] = var509.field5045;
                            continue;
                        }
                        if (var537 == 1502) {
                            class45.field564[var3++] = var509.field5056;
                            continue;
                        }
                        if (var537 == 1503) {
                            class45.field564[var3++] = var509.field5172;
                            continue;
                        }
                        if (var537 == 1504) {
                            class45.field564[var3++] = var509.field5158 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 1505) {
                            class45.field564[var3++] = var509.field5142;
                            continue;
                        }
                    } else if (var537 < 1700) {
                        class333 var66 = var38 ? class321.field4710 : class171.field2371;
                        if (var537 == 1600) {
                            class45.field564[var3++] = var66.field5136;
                            continue;
                        }
                        if (var537 == 1601) {
                            class45.field564[var3++] = var66.field5134;
                            continue;
                        }
                        if (var537 == 1602) {
                            class293.field4266[var5++] = var66.field5058;
                            continue;
                        }
                        if (var537 == 1603) {
                            class45.field564[var3++] = var66.field5037;
                            continue;
                        }
                        if (var537 == 1604) {
                            class45.field564[var3++] = var66.field5044;
                            continue;
                        }
                        if (var537 == 1605) {
                            class45.field564[var3++] = var66.field5116;
                            continue;
                        }
                        if (var537 == 1606) {
                            class45.field564[var3++] = var66.field5160;
                            continue;
                        }
                        if (var537 == 1607) {
                            class45.field564[var3++] = var66.field5042;
                            continue;
                        }
                        if (var537 == 1608) {
                            class45.field564[var3++] = var66.field5210;
                            continue;
                        }
                        if (var537 == 1609) {
                            class45.field564[var3++] = var66.field5083;
                            continue;
                        }
                        if (var537 == 1610) {
                            class45.field564[var3++] = var66.field5192;
                            continue;
                        }
                        if (var537 == 1611) {
                            class45.field564[var3++] = var66.field5087;
                            continue;
                        }
                        if (var537 == 1612) {
                            class45.field564[var3++] = var66.field5168;
                            continue;
                        }
                    } else if (var537 < 1800) {
                        class333 var67 = var38 ? class321.field4710 : class171.field2371;
                        if (var537 == 1700) {
                            class45.field564[var3++] = var67.field5143;
                            continue;
                        }
                        if (var537 == 1701) {
                            if (var67.field5143 == -1) {
                                class45.field564[var3++] = 0;
                            } else {
                                class45.field564[var3++] = var67.field5191;
                            }
                            continue;
                        }
                        if (var537 == 1702) {
                            class45.field564[var3++] = var67.field5199;
                            continue;
                        }
                    } else if (var537 < 1900) {
                        class333 var68 = var38 ? class321.field4710 : class171.field2371;
                        if (var537 == 1800) {
                            class45.field564[var3++] = client.method891(var68).method1100(1105924391);
                            continue;
                        }
                        if (var537 == 1801) {
                            var3--;
                            int var69 = class45.field564[var3];
                            int var538 = var69 - 1;
                            if (var68.field5165 != null && var68.field5165.length > var538 && var68.field5165[var538] != null) {
                                class293.field4266[var5++] = var68.field5165[var538];
                                continue;
                            }
                            class293.field4266[var5++] = "";
                            continue;
                        }
                        if (var537 == 1802) {
                            if (var68.field5073 == null) {
                                class293.field4266[var5++] = "";
                            } else {
                                class293.field4266[var5++] = var68.field5073;
                            }
                            continue;
                        }
                    } else if (var537 < 2600) {
                        var3--;
                        class333 var508 = class89.method644(43, class45.field564[var3]);
                        if (var537 == 2500) {
                            class45.field564[var3++] = var508.field5188;
                            continue;
                        }
                        if (var537 == 2501) {
                            class45.field564[var3++] = var508.field5045;
                            continue;
                        }
                        if (var537 == 2502) {
                            class45.field564[var3++] = var508.field5056;
                            continue;
                        }
                        if (var537 == 2503) {
                            class45.field564[var3++] = var508.field5172;
                            continue;
                        }
                        if (var537 == 2504) {
                            class45.field564[var3++] = var508.field5158 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 2505) {
                            class45.field564[var3++] = var508.field5142;
                            continue;
                        }
                    } else if (var537 < 2700) {
                        var3--;
                        class333 var507 = class89.method644(-110, class45.field564[var3]);
                        if (var537 == 2600) {
                            class45.field564[var3++] = var507.field5136;
                            continue;
                        }
                        if (var537 == 2601) {
                            class45.field564[var3++] = var507.field5134;
                            continue;
                        }
                        if (var537 == 2602) {
                            class293.field4266[var5++] = var507.field5058;
                            continue;
                        }
                        if (var537 == 2603) {
                            class45.field564[var3++] = var507.field5037;
                            continue;
                        }
                        if (var537 == 2604) {
                            class45.field564[var3++] = var507.field5044;
                            continue;
                        }
                        if (var537 == 2605) {
                            class45.field564[var3++] = var507.field5116;
                            continue;
                        }
                        if (var537 == 2606) {
                            class45.field564[var3++] = var507.field5160;
                            continue;
                        }
                        if (var537 == 2607) {
                            class45.field564[var3++] = var507.field5042;
                            continue;
                        }
                        if (var537 == 2608) {
                            class45.field564[var3++] = var507.field5210;
                            continue;
                        }
                        if (var537 == 2609) {
                            class45.field564[var3++] = var507.field5083;
                            continue;
                        }
                        if (var537 == 2610) {
                            class45.field564[var3++] = var507.field5192;
                            continue;
                        }
                        if (var537 == 2611) {
                            class45.field564[var3++] = var507.field5087;
                            continue;
                        }
                        if (var537 == 2612) {
                            class45.field564[var3++] = var507.field5168;
                            continue;
                        }
                    } else if (var537 < 2800) {
                        if (var537 == 2700) {
                            var3--;
                            class333 var497 = class89.method644(124, class45.field564[var3]);
                            class45.field564[var3++] = var497.field5143;
                            continue;
                        }
                        if (var537 == 2701) {
                            var3--;
                            class333 var498 = class89.method644(121, class45.field564[var3]);
                            if (var498.field5143 == -1) {
                                class45.field564[var3++] = 0;
                            } else {
                                class45.field564[var3++] = var498.field5191;
                            }
                            continue;
                        }
                        if (var537 == 2702) {
                            var3--;
                            int var499 = class45.field564[var3];
                            class74 var500 = (class74) class272.field3900.method2279((long) var499, 29);
                            if (var500 == null) {
                                class45.field564[var3++] = 0;
                            } else {
                                class45.field564[var3++] = 1;
                            }
                            continue;
                        }
                        if (var537 == 2703) {
                            var10000 = arg1 ^ 0xC4069DC3;
                            var3--;
                            class333 var501 = class89.method644(var10000, class45.field564[var3]);
                            if (var501.field5187 == null) {
                                class45.field564[var3++] = 0;
                                continue;
                            }
                            int var502 = var501.field5187.length;
                            for (int var503 = 0; var503 < var501.field5187.length; var503++) {
                                if (var501.field5187[var503] == null) {
                                    var502 = var503;
                                    break;
                                }
                            }
                            class45.field564[var3++] = var502;
                            continue;
                        }
                        if (var537 == 2704 || var537 == 2705) {
                            var3 -= 2;
                            int var504 = class45.field564[var3];
                            int var505 = class45.field564[var3 + 1];
                            class74 var506 = (class74) class272.field3900.method2279((long) var504, 44);
                            if (var506 != null && var506.field982 == var505) {
                                class45.field564[var3++] = 1;
                                continue;
                            }
                            class45.field564[var3++] = 0;
                            continue;
                        }
                    } else if (var537 < 2900) {
                        var3--;
                        class333 var70 = class89.method644(-124, class45.field564[var3]);
                        if (var537 == 2800) {
                            class45.field564[var3++] = client.method891(var70).method1100(1105924391);
                            continue;
                        }
                        if (var537 == 2801) {
                            var3--;
                            int var71 = class45.field564[var3];
                            int var539 = var71 - 1;
                            if (var70.field5165 != null && var539 < var70.field5165.length && var70.field5165[var539] != null) {
                                class293.field4266[var5++] = var70.field5165[var539];
                                continue;
                            }
                            class293.field4266[var5++] = "";
                            continue;
                        }
                        if (var537 == 2802) {
                            if (var70.field5073 == null) {
                                class293.field4266[var5++] = "";
                            } else {
                                class293.field4266[var5++] = var70.field5073;
                            }
                            continue;
                        }
                    } else if (var537 < 3200) {
                        if (var537 == 3100) {
                            var5--;
                            String var482 = class293.field4266[var5];
                            class88.method641("", 0, false, var482);
                            continue;
                        }
                        if (var537 == 3101) {
                            var3 -= 2;
                            class99.method711(class359.field5616, class45.field564[var3], class45.field564[var3 + 1], -1);
                            continue;
                        }
                        if (var537 == 3103) {
                            class82.method612(arg1 - 1006199388);
                            continue;
                        }
                        if (var537 == 3104) {
                            class185.field2533++;
                            var5--;
                            String var483 = class293.field4266[var5];
                            int var484 = 0;
                            if (class115.method844(var483, (byte) -36)) {
                                var484 = class16.method118(true, var483);
                            }
                            class251.field3681.method1309(arg1 ^ 0x3BF9624B, 219);
                            class251.field3681.method2084(true, var484);
                            continue;
                        }
                        if (var537 == 3105) {
                            var5--;
                            String var485 = class293.field4266[var5];
                            class249.field3616++;
                            class251.field3681.method1309(23, 149);
                            class251.field3681.method2049(-19780, class201.method1476(-117, var485));
                            continue;
                        }
                        if (var537 == 3106) {
                            class134.field1822++;
                            var5--;
                            String var486 = class293.field4266[var5];
                            class251.field3681.method1309(23, 164);
                            class251.field3681.method2048(var486.length() + 1, 102);
                            class251.field3681.method2042(var486, -28);
                            continue;
                        }
                        if (var537 == 3107) {
                            var3--;
                            int var487 = class45.field564[var3];
                            var5--;
                            String var488 = class293.field4266[var5];
                            class289.method1982(var487, (byte) 61, var488);
                            continue;
                        }
                        if (var537 == 3108) {
                            var3 -= 3;
                            int var489 = class45.field564[var3];
                            int var490 = class45.field564[var3 + 2];
                            int var491 = class45.field564[var3 + 1];
                            class333 var492 = class89.method644(-122, var490);
                            class198.method1453(var492, var489, var491, (byte) 93);
                            continue;
                        }
                        if (var537 == 3109) {
                            var3 -= 2;
                            int var493 = class45.field564[var3 + 1];
                            int var494 = class45.field564[var3];
                            class333 var495 = var38 ? class321.field4710 : class171.field2371;
                            class198.method1453(var495, var494, var493, (byte) 127);
                            continue;
                        }
                        if (var537 == 3110) {
                            class166.field2323++;
                            var3--;
                            int var496 = class45.field564[var3];
                            class251.field3681.method1309(23, 231);
                            class251.field3681.method2098(-105, var496);
                            continue;
                        }
                    } else if (var537 < 3300) {
                        if (var537 == 3200) {
                            var3 -= 3;
                            class49.method389((byte) -100, class45.field564[var3 + 2], class45.field564[var3], class45.field564[var3 + 1], 255);
                            continue;
                        }
                        if (var537 == 3201) {
                            var3--;
                            class183.method1335((byte) 89, 255, class45.field564[var3]);
                            continue;
                        }
                        if (var537 == 3202) {
                            var3 -= 2;
                            class351.method2445(-1, 255, class45.field564[var3 + 1], class45.field564[var3]);
                            continue;
                        }
                    } else if (var537 < 3400) {
                        if (var537 == 3300) {
                            class45.field564[var3++] = class313.field4603;
                            continue;
                        }
                        if (var537 == 3301) {
                            var3 -= 2;
                            int var448 = class45.field564[var3 + 1];
                            int var449 = class45.field564[var3];
                            class45.field564[var3++] = class90.method652(var449, var448, false);
                            continue;
                        }
                        if (var537 == 3302) {
                            var3 -= 2;
                            int var450 = class45.field564[var3];
                            int var451 = class45.field564[var3 + 1];
                            class45.field564[var3++] = class265.method1822(0, var451, var450);
                            continue;
                        }
                        if (var537 == 3303) {
                            var3 -= 2;
                            int var452 = class45.field564[var3];
                            int var453 = class45.field564[var3 + 1];
                            class45.field564[var3++] = class49.method388(var453, (byte) 69, var452);
                            continue;
                        }
                        if (var537 == 3304) {
                            var3--;
                            int var454 = class45.field564[var3];
                            class45.field564[var3++] = class159.method1219(var454, 10057).field2048;
                            continue;
                        }
                        if (var537 == 3305) {
                            var3--;
                            int var455 = class45.field564[var3];
                            class45.field564[var3++] = class260.field3775[var455];
                            continue;
                        }
                        if (var537 == 3306) {
                            var3--;
                            int var456 = class45.field564[var3];
                            class45.field564[var3++] = class280.field3992[var456];
                            continue;
                        }
                        if (var537 == 3307) {
                            var3--;
                            int var457 = class45.field564[var3];
                            class45.field564[var3++] = class300.field4412[var457];
                            continue;
                        }
                        if (var537 == 3308) {
                            int var458 = class56.field724;
                            int var459 = (class359.field5616.field4855 >> 7) + class331.field4867;
                            int var460 = (class359.field5616.field4893 >> 7) + class355.field5556;
                            class45.field564[var3++] = (var459 << 14) + (var458 << 28) + var460;
                            continue;
                        }
                        if (var537 == 3309) {
                            var3--;
                            int var461 = class45.field564[var3];
                            class45.field564[var3++] = class335.method2339(16383, var461 >> 14);
                            continue;
                        }
                        if (var537 == 3310) {
                            var3--;
                            int var462 = class45.field564[var3];
                            class45.field564[var3++] = var462 >> 28;
                            continue;
                        }
                        if (var537 == 3311) {
                            var3--;
                            int var463 = class45.field564[var3];
                            class45.field564[var3++] = class335.method2339(16383, var463);
                            continue;
                        }
                        if (var537 == 3312) {
                            class45.field564[var3++] = class225.field3244 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3313) {
                            var3 -= 2;
                            int var464 = class45.field564[var3 + 1];
                            int var465 = class45.field564[var3] + 32768;
                            class45.field564[var3++] = class90.method652(var465, var464, false);
                            continue;
                        }
                        if (var537 == 3314) {
                            var3 -= 2;
                            int var466 = class45.field564[var3 + 1];
                            int var467 = class45.field564[var3] + 32768;
                            class45.field564[var3++] = class265.method1822(0, var466, var467);
                            continue;
                        }
                        if (var537 == 3315) {
                            var3 -= 2;
                            int var468 = class45.field564[var3] + 32768;
                            int var469 = class45.field564[var3 + 1];
                            class45.field564[var3++] = class49.method388(var469, (byte) 102, var468);
                            continue;
                        }
                        if (var537 == 3316) {
                            if (class217.field3070 >= 2) {
                                class45.field564[var3++] = class217.field3070;
                            } else {
                                class45.field564[var3++] = 0;
                            }
                            continue;
                        }
                        if (var537 == 3317) {
                            class45.field564[var3++] = class275.field3943;
                            continue;
                        }
                        if (var537 == 3318) {
                            class45.field564[var3++] = class84.field1085;
                            continue;
                        }
                        if (var537 == 3321) {
                            class45.field564[var3++] = class211.field2989;
                            continue;
                        }
                        if (var537 == 3322) {
                            class45.field564[var3++] = class182.field2487;
                            continue;
                        }
                        if (var537 == 3323) {
                            if (class130.field1779 >= 5 && class130.field1779 <= 9) {
                                class45.field564[var3++] = 1;
                                continue;
                            }
                            class45.field564[var3++] = 0;
                            continue;
                        }
                        if (var537 == 3324) {
                            if (class130.field1779 >= 5 && class130.field1779 <= 9) {
                                class45.field564[var3++] = class130.field1779;
                                continue;
                            }
                            class45.field564[var3++] = 0;
                            continue;
                        }
                        if (var537 == 3325) {
                            class45.field564[var3++] = class190.field2623 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3326) {
                            class45.field564[var3++] = class359.field5616.field3477;
                            continue;
                        }
                        if (var537 == 3327) {
                            class45.field564[var3++] = class359.field5616.field3480.field1670 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3328) {
                            class45.field564[var3++] = class78.field1006 && !class94.field1231 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3329) {
                            class45.field564[var3++] = class226.field3249 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3330) {
                            var3--;
                            int var470 = class45.field564[var3];
                            class45.field564[var3++] = class156.method1195(var470, (byte) -38);
                            continue;
                        }
                        if (var537 == 3331) {
                            var3 -= 2;
                            int var471 = class45.field564[var3 + 1];
                            int var472 = class45.field564[var3];
                            class45.field564[var3++] = class144.method1121(var471, (byte) -65, var472, false);
                            continue;
                        }
                        if (var537 == 3332) {
                            var3 -= 2;
                            int var473 = class45.field564[var3 + 1];
                            int var474 = class45.field564[var3];
                            class45.field564[var3++] = class144.method1121(var473, (byte) -95, var474, true);
                            continue;
                        }
                        if (var537 == 3333) {
                            class45.field564[var3++] = class315.field4643;
                            continue;
                        }
                        if (var537 == 3335) {
                            class45.field564[var3++] = class306.field4473;
                            continue;
                        }
                        if (var537 == 3336) {
                            var3 -= 4;
                            int var475 = class45.field564[var3];
                            int var476 = class45.field564[var3 + 1];
                            int var477 = class45.field564[var3 + 2];
                            int var478 = (var476 << 14) + var475;
                            int var479 = (var477 << 28) + var478;
                            int var480 = class45.field564[var3 + 3];
                            int var481 = var479 + var480;
                            class45.field564[var3++] = var481;
                            continue;
                        }
                        if (var537 == 3337) {
                            class45.field564[var3++] = class185.field2522;
                            continue;
                        }
                    } else if (var537 < 3500) {
                        if (var537 == 3400) {
                            var3 -= 2;
                            int var72 = class45.field564[var3];
                            int var73 = class45.field564[var3 + 1];
                            class249 var74 = class82.method605((byte) 94, var72);
                            if (var74.field3615 == 's') {
                            }
                            class293.field4266[var5++] = var74.method1743(var73, -7);
                            continue;
                        }
                        if (var537 == 3408) {
                            var3 -= 4;
                            int var75 = class45.field564[var3 + 1];
                            int var76 = class45.field564[var3];
                            int var77 = class45.field564[var3 + 2];
                            int var78 = class45.field564[var3 + 3];
                            class249 var79 = class82.method605((byte) 120, var77);
                            if (var79.field3626 == var76 && var79.field3615 == var75) {
                                if (var75 == 115) {
                                    class293.field4266[var5++] = var79.method1743(var78, -7);
                                } else {
                                    class45.field564[var3++] = var79.method1738(0, var78);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var537 == 3409) {
                            var3 -= 3;
                            int var80 = class45.field564[var3];
                            int var81 = class45.field564[var3 + 1];
                            int var82 = class45.field564[var3 + 2];
                            if (var81 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class249 var83 = class82.method605((byte) 101, var81);
                            if (var83.field3615 != var80) {
                                throw new RuntimeException("C3409-1");
                            }
                            class45.field564[var3++] = var83.method1741(class300.method2107(arg1, -1006199391), var82) ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3410) {
                            var5--;
                            String var84 = class293.field4266[var5];
                            var3--;
                            int var85 = class45.field564[var3];
                            if (var85 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class249 var86 = class82.method605((byte) 108, var85);
                            if (var86.field3615 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class45.field564[var3++] = var86.method1748(class300.method2107(arg1, 1006175982), var84) ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3411) {
                            var3--;
                            int var87 = class45.field564[var3];
                            class249 var88 = class82.method605((byte) 87, var87);
                            class45.field564[var3++] = var88.field3637.method2276(0);
                            continue;
                        }
                    } else if (var537 < 3700) {
                        if (var537 == 3600) {
                            if (class183.field2493 == 0) {
                                class45.field564[var3++] = -2;
                            } else if (class183.field2493 == 1) {
                                class45.field564[var3++] = -1;
                            } else {
                                class45.field564[var3++] = class45.field559;
                            }
                            continue;
                        }
                        if (var537 == 3601) {
                            var3--;
                            int var424 = class45.field564[var3];
                            if (class183.field2493 == 2 && var424 < class45.field559) {
                                class293.field4266[var5++] = class65.field814[var424];
                                continue;
                            }
                            class293.field4266[var5++] = "";
                            continue;
                        }
                        if (var537 == 3602) {
                            var3--;
                            int var425 = class45.field564[var3];
                            if (class183.field2493 == 2 && var425 < class45.field559) {
                                class45.field564[var3++] = class237.field3431[var425];
                                continue;
                            }
                            class45.field564[var3++] = 0;
                            continue;
                        }
                        if (var537 == 3603) {
                            var3--;
                            int var426 = class45.field564[var3];
                            if (class183.field2493 == 2 && var426 < class45.field559) {
                                class45.field564[var3++] = class167.field2333[var426];
                                continue;
                            }
                            class45.field564[var3++] = 0;
                            continue;
                        }
                        if (var537 == 3604) {
                            var5--;
                            String var427 = class293.field4266[var5];
                            var3--;
                            int var428 = class45.field564[var3];
                            class82.method609(215, var428, var427);
                            continue;
                        }
                        if (var537 == 3605) {
                            var5--;
                            String var429 = class293.field4266[var5];
                            class49.method391(0, class201.method1476(-128, var429));
                            continue;
                        }
                        if (var537 == 3606) {
                            var5--;
                            String var430 = class293.field4266[var5];
                            class32.method207(class201.method1476(arg1 - 1006199515, var430), arg1 ^ 0x3BF96272);
                            continue;
                        }
                        if (var537 == 3607) {
                            var5--;
                            String var431 = class293.field4266[var5];
                            class318.method2196(false, class201.method1476(arg1 ^ 0xC4069DDD, var431), (byte) 92);
                            continue;
                        }
                        if (var537 == 3608) {
                            var5--;
                            String var432 = class293.field4266[var5];
                            class171.method1258(class201.method1476(-121, var432), (byte) -67);
                            continue;
                        }
                        if (var537 == 3609) {
                            var5--;
                            String var433 = class293.field4266[var5];
                            if (var433.startsWith("<img=0>") || var433.startsWith("<img=1>")) {
                                var433 = var433.substring(7);
                            }
                            class45.field564[var3++] = class15.method107(-38, var433) ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3610) {
                            var3--;
                            int var434 = class45.field564[var3];
                            if (class183.field2493 == 2 && var434 < class45.field559) {
                                class293.field4266[var5++] = class340.field5317[var434];
                                continue;
                            }
                            class293.field4266[var5++] = "";
                            continue;
                        }
                        if (var537 == 3611) {
                            if (class42.field530 == null) {
                                class293.field4266[var5++] = "";
                            } else {
                                class293.field4266[var5++] = class296.method2028(class42.field530, true);
                            }
                            continue;
                        }
                        if (var537 == 3612) {
                            if (class42.field530 == null) {
                                class45.field564[var3++] = 0;
                            } else {
                                class45.field564[var3++] = class255.field3740;
                            }
                            continue;
                        }
                        if (var537 == 3613) {
                            var3--;
                            int var435 = class45.field564[var3];
                            if (class42.field530 != null && var435 < class255.field3740) {
                                class293.field4266[var5++] = class296.method2028(class242.field3504[var435].field4038, true);
                                continue;
                            }
                            class293.field4266[var5++] = "";
                            continue;
                        }
                        if (var537 == 3614) {
                            var3--;
                            int var436 = class45.field564[var3];
                            if (class42.field530 != null && class255.field3740 > var436) {
                                class45.field564[var3++] = class242.field3504[var436].field4028;
                                continue;
                            }
                            class45.field564[var3++] = 0;
                            continue;
                        }
                        if (var537 == 3615) {
                            var3--;
                            int var437 = class45.field564[var3];
                            if (class42.field530 != null && class255.field3740 > var437) {
                                class45.field564[var3++] = class242.field3504[var437].field4032;
                                continue;
                            }
                            class45.field564[var3++] = 0;
                            continue;
                        }
                        if (var537 == 3616) {
                            class45.field564[var3++] = class288.field4176;
                            continue;
                        }
                        if (var537 == 3617) {
                            var5--;
                            String var438 = class293.field4266[var5];
                            class326.method2255(6137, var438);
                            continue;
                        }
                        if (var537 == 3618) {
                            class45.field564[var3++] = class307.field4495;
                            continue;
                        }
                        if (var537 == 3619) {
                            var5--;
                            String var439 = class293.field4266[var5];
                            class115.method846(18014, class201.method1476(-121, var439));
                            continue;
                        }
                        if (var537 == 3620) {
                            client.method888(arg1 - 1006199497);
                            continue;
                        }
                        if (var537 == 3621) {
                            if (class183.field2493 == 0) {
                                class45.field564[var3++] = -1;
                            } else {
                                class45.field564[var3++] = class116.field1511;
                            }
                            continue;
                        }
                        if (var537 == 3622) {
                            var3--;
                            int var440 = class45.field564[var3];
                            if (class183.field2493 != 0 && class116.field1511 > var440) {
                                class293.field4266[var5++] = class193.method1398(false, class234.field3356[var440]);
                                continue;
                            }
                            class293.field4266[var5++] = "";
                            continue;
                        }
                        if (var537 == 3623) {
                            var5--;
                            String var441 = class293.field4266[var5];
                            if (var441.startsWith("<img=0>") || var441.startsWith("<img=1>")) {
                                var441 = var441.substring(7);
                            }
                            class45.field564[var3++] = class339.method2360(false, var441) ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3624) {
                            var3--;
                            int var442 = class45.field564[var3];
                            if (class242.field3504 != null && var442 < class255.field3740 && class242.field3504[var442].field4038.equalsIgnoreCase(class359.field5616.field3475)) {
                                class45.field564[var3++] = 1;
                                continue;
                            }
                            class45.field564[var3++] = 0;
                            continue;
                        }
                        if (var537 == 3625) {
                            if (class274.field3930 == null) {
                                class293.field4266[var5++] = "";
                            } else {
                                class293.field4266[var5++] = class296.method2028(class274.field3930, true);
                            }
                            continue;
                        }
                        if (var537 == 3626) {
                            var3--;
                            int var443 = class45.field564[var3];
                            if (class42.field530 != null && class255.field3740 > var443) {
                                class293.field4266[var5++] = class242.field3504[var443].field4037;
                                continue;
                            }
                            class293.field4266[var5++] = "";
                            continue;
                        }
                        if (var537 == 3627) {
                            var3--;
                            int var444 = class45.field564[var3];
                            if (class183.field2493 == 2 && var444 >= 0 && class45.field559 > var444) {
                                class45.field564[var3++] = class130.field1772[var444] ? 1 : 0;
                                continue;
                            }
                            class45.field564[var3++] = 0;
                            continue;
                        }
                        if (var537 == 3628) {
                            var5--;
                            String var445 = class293.field4266[var5];
                            if (var445.startsWith("<img=0>") || var445.startsWith("<img=1>")) {
                                var445 = var445.substring(7);
                            }
                            class45.field564[var3++] = class95.method688(var445, 92);
                            continue;
                        }
                        if (var537 == 3629) {
                            class45.field564[var3++] = class26.field302;
                            continue;
                        }
                        if (var537 == 3630) {
                            var5--;
                            String var446 = class293.field4266[var5];
                            class318.method2196(true, class201.method1476(-126, var446), (byte) 91);
                            continue;
                        }
                        if (var537 == 3631) {
                            var3--;
                            int var447 = class45.field564[var3];
                            class45.field564[var3++] = class226.field3255[var447] ? 1 : 0;
                            continue;
                        }
                    } else if (var537 < 4000) {
                        if (var537 == 3903) {
                            var3--;
                            int var89 = class45.field564[var3];
                            class45.field564[var3++] = class132.field1799[var89].method465(89);
                            continue;
                        }
                        if (var537 == 3904) {
                            var3--;
                            int var90 = class45.field564[var3];
                            class45.field564[var3++] = class132.field1799[var90].field807;
                            continue;
                        }
                        if (var537 == 3905) {
                            var3--;
                            int var91 = class45.field564[var3];
                            class45.field564[var3++] = class132.field1799[var91].field806;
                            continue;
                        }
                        if (var537 == 3906) {
                            var3--;
                            int var92 = class45.field564[var3];
                            class45.field564[var3++] = class132.field1799[var92].field798;
                            continue;
                        }
                        if (var537 == 3907) {
                            var3--;
                            int var93 = class45.field564[var3];
                            class45.field564[var3++] = class132.field1799[var93].field804;
                            continue;
                        }
                        if (var537 == 3908) {
                            var3--;
                            int var94 = class45.field564[var3];
                            class45.field564[var3++] = class132.field1799[var94].field805;
                            continue;
                        }
                        if (var537 == 3910) {
                            var3--;
                            int var95 = class45.field564[var3];
                            int var96 = class132.field1799[var95].method468(-1);
                            class45.field564[var3++] = var96 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3911) {
                            var3--;
                            int var97 = class45.field564[var3];
                            int var98 = class132.field1799[var97].method468(-1);
                            class45.field564[var3++] = var98 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3912) {
                            var3--;
                            int var99 = class45.field564[var3];
                            int var100 = class132.field1799[var99].method468(arg1 ^ 0xC4069DA3);
                            class45.field564[var3++] = var100 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 3913) {
                            var3--;
                            int var101 = class45.field564[var3];
                            int var102 = class132.field1799[var101].method468(-1);
                            class45.field564[var3++] = var102 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var537 < 4100) {
                        if (var537 == 4000) {
                            var3 -= 2;
                            int var379 = class45.field564[var3 + 1];
                            int var380 = class45.field564[var3];
                            class45.field564[var3++] = var380 + var379;
                            continue;
                        }
                        if (var537 == 4001) {
                            var3 -= 2;
                            int var381 = class45.field564[var3];
                            int var382 = class45.field564[var3 + 1];
                            class45.field564[var3++] = var381 - var382;
                            continue;
                        }
                        if (var537 == 4002) {
                            var3 -= 2;
                            int var383 = class45.field564[var3];
                            int var384 = class45.field564[var3 + 1];
                            class45.field564[var3++] = var383 * var384;
                            continue;
                        }
                        if (var537 == 4003) {
                            var3 -= 2;
                            int var385 = class45.field564[var3 + 1];
                            int var386 = class45.field564[var3];
                            class45.field564[var3++] = var386 / var385;
                            continue;
                        }
                        if (var537 == 4004) {
                            var3--;
                            int var387 = class45.field564[var3];
                            class45.field564[var3++] = (int) ((double) var387 * Math.random());
                            continue;
                        }
                        if (var537 == 4005) {
                            var3--;
                            int var388 = class45.field564[var3];
                            class45.field564[var3++] = (int) ((double) (var388 + 1) * Math.random());
                            continue;
                        }
                        if (var537 == 4006) {
                            var3 -= 5;
                            int var389 = class45.field564[var3];
                            int var390 = class45.field564[var3 + 2];
                            int var391 = class45.field564[var3 + 3];
                            int var392 = class45.field564[var3 + 1];
                            int var393 = class45.field564[var3 + 4];
                            class45.field564[var3++] = (var392 - var389) * (var393 - var390) / (var391 - var390) + var389;
                            continue;
                        }
                        if (var537 == 4007) {
                            var3 -= 2;
                            long var394 = (long) class45.field564[var3];
                            long var396 = (long) class45.field564[var3 + 1];
                            class45.field564[var3++] = (int) (var394 * var396 / 100L + var394);
                            continue;
                        }
                        if (var537 == 4008) {
                            var3 -= 2;
                            int var398 = class45.field564[var3];
                            int var399 = class45.field564[var3 + 1];
                            class45.field564[var3++] = class80.method568(0x1 << var399, var398);
                            continue;
                        }
                        if (var537 == 4009) {
                            var3 -= 2;
                            int var400 = class45.field564[var3];
                            int var401 = class45.field564[var3 + 1];
                            class45.field564[var3++] = class335.method2339(-(0x1 << var401) - 1, var400);
                            continue;
                        }
                        if (var537 == 4010) {
                            var3 -= 2;
                            int var402 = class45.field564[var3];
                            int var403 = class45.field564[var3 + 1];
                            class45.field564[var3++] = class335.method2339(var402, 0x1 << var403) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var537 == 4011) {
                            var3 -= 2;
                            int var404 = class45.field564[var3];
                            int var405 = class45.field564[var3 + 1];
                            class45.field564[var3++] = var404 % var405;
                            continue;
                        }
                        if (var537 == 4012) {
                            var3 -= 2;
                            int var406 = class45.field564[var3];
                            int var407 = class45.field564[var3 + 1];
                            if (var406 == 0) {
                                class45.field564[var3++] = 0;
                            } else {
                                class45.field564[var3++] = (int) Math.pow((double) var406, (double) var407);
                            }
                            continue;
                        }
                        if (var537 == 4013) {
                            var3 -= 2;
                            int var408 = class45.field564[var3];
                            int var409 = class45.field564[var3 + 1];
                            if (var408 == 0) {
                                class45.field564[var3++] = 0;
                            } else if (var409 == 0) {
                                class45.field564[var3++] = Integer.MAX_VALUE;
                            } else {
                                class45.field564[var3++] = (int) Math.pow((double) var408, 1.0D / (double) var409);
                            }
                            continue;
                        }
                        if (var537 == 4014) {
                            var3 -= 2;
                            int var410 = class45.field564[var3];
                            int var411 = class45.field564[var3 + 1];
                            class45.field564[var3++] = class335.method2339(var411, var410);
                            continue;
                        }
                        if (var537 == 4015) {
                            var3 -= 2;
                            int var412 = class45.field564[var3 + 1];
                            int var413 = class45.field564[var3];
                            class45.field564[var3++] = class80.method568(var412, var413);
                            continue;
                        }
                        if (var537 == 4016) {
                            var3 -= 2;
                            int var414 = class45.field564[var3];
                            int var415 = class45.field564[var3 + 1];
                            class45.field564[var3++] = var415 <= var414 ? var415 : var414;
                            continue;
                        }
                        if (var537 == 4017) {
                            var3 -= 2;
                            int var416 = class45.field564[var3];
                            int var417 = class45.field564[var3 + 1];
                            class45.field564[var3++] = var416 > var417 ? var416 : var417;
                            continue;
                        }
                        if (var537 == 4018) {
                            var3 -= 3;
                            long var418 = (long) class45.field564[var3];
                            long var420 = (long) class45.field564[var3 + 2];
                            long var422 = (long) class45.field564[var3 + 1];
                            class45.field564[var3++] = (int) (var418 * var420 / var422);
                            continue;
                        }
                    } else if (var537 < 4200) {
                        if (var537 == 4100) {
                            var5--;
                            String var329 = class293.field4266[var5];
                            var3--;
                            int var330 = class45.field564[var3];
                            class293.field4266[var5++] = var329 + var330;
                            continue;
                        }
                        if (var537 == 4101) {
                            var5 -= 2;
                            String var331 = class293.field4266[var5];
                            String var332 = class293.field4266[var5 + 1];
                            class293.field4266[var5++] = var331 + var332;
                            continue;
                        }
                        if (var537 == 4102) {
                            var3--;
                            int var333 = class45.field564[var3];
                            var5--;
                            String var334 = class293.field4266[var5];
                            class293.field4266[var5++] = var334 + class48.method383(false, var333, true);
                            continue;
                        }
                        if (var537 == 4103) {
                            var5--;
                            String var335 = class293.field4266[var5];
                            class293.field4266[var5++] = var335.toLowerCase();
                            continue;
                        }
                        if (var537 == 4104) {
                            var3--;
                            int var336 = class45.field564[var3];
                            long var337 = (long) var336 * 86400000L + 1014768000000L;
                            class99.field1297.setTime(new Date(var337));
                            int var339 = class99.field1297.get(5);
                            int var340 = class99.field1297.get(2);
                            int var341 = class99.field1297.get(1);
                            class293.field4266[var5++] = var339 + "-" + class146.field2030[var340] + "-" + var341;
                            continue;
                        }
                        if (var537 == 4105) {
                            var5 -= 2;
                            String var342 = class293.field4266[var5 + 1];
                            String var343 = class293.field4266[var5];
                            if (class359.field5616.field3480 != null && class359.field5616.field3480.field1670) {
                                class293.field4266[var5++] = var342;
                                continue;
                            }
                            class293.field4266[var5++] = var343;
                            continue;
                        }
                        if (var537 == 4106) {
                            var3--;
                            int var344 = class45.field564[var3];
                            class293.field4266[var5++] = Integer.toString(var344);
                            continue;
                        }
                        if (var537 == 4107) {
                            var5 -= 2;
                            class45.field564[var3++] = class216.method1570(-1, class190.method1378(5379, class293.field4266[var5 + 1], class306.field4473, class293.field4266[var5]));
                            continue;
                        }
                        if (var537 == 4108) {
                            var3 -= 2;
                            int var345 = class45.field564[var3 + 1];
                            int var346 = class45.field564[var3];
                            var5--;
                            String var347 = class293.field4266[var5];
                            class45.field564[var3++] = class257.method1788(94, var345).method1914(var347, var346);
                            continue;
                        }
                        if (var537 == 4109) {
                            var3 -= 2;
                            var5--;
                            String var348 = class293.field4266[var5];
                            int var349 = class45.field564[var3];
                            int var350 = class45.field564[var3 + 1];
                            class45.field564[var3++] = class257.method1788(-97, var350).method1902(var348, var349);
                            continue;
                        }
                        if (var537 == 4110) {
                            var5 -= 2;
                            String var351 = class293.field4266[var5];
                            String var352 = class293.field4266[var5 + 1];
                            var3--;
                            if (class45.field564[var3] == 1) {
                                class293.field4266[var5++] = var351;
                            } else {
                                class293.field4266[var5++] = var352;
                            }
                            continue;
                        }
                        if (var537 == 4111) {
                            var5--;
                            String var353 = class293.field4266[var5];
                            class293.field4266[var5++] = class281.method1905(var353);
                            continue;
                        }
                        if (var537 == 4112) {
                            var5--;
                            String var354 = class293.field4266[var5];
                            var3--;
                            int var355 = class45.field564[var3];
                            if (var355 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class293.field4266[var5++] = var354 + (char) var355;
                            continue;
                        }
                        if (var537 == 4113) {
                            var3--;
                            int var356 = class45.field564[var3];
                            class45.field564[var3++] = class117.method858(80, (char) var356) ? 1 : 0;
                            continue;
                        }
                        if (var537 == 4114) {
                            var3--;
                            int var357 = class45.field564[var3];
                            class45.field564[var3++] = class192.method1391(true, (char) var357) ? 1 : 0;
                            continue;
                        }
                        if (var537 == 4115) {
                            var3--;
                            int var358 = class45.field564[var3];
                            class45.field564[var3++] = class321.method2221((char) var358, true) ? 1 : 0;
                            continue;
                        }
                        if (var537 == 4116) {
                            var3--;
                            int var359 = class45.field564[var3];
                            class45.field564[var3++] = class179.method1320(false, (char) var359) ? 1 : 0;
                            continue;
                        }
                        if (var537 == 4117) {
                            var5--;
                            String var360 = class293.field4266[var5];
                            if (var360 == null) {
                                class45.field564[var3++] = 0;
                            } else {
                                class45.field564[var3++] = var360.length();
                            }
                            continue;
                        }
                        if (var537 == 4118) {
                            var3 -= 2;
                            var5--;
                            String var361 = class293.field4266[var5];
                            int var362 = class45.field564[var3];
                            int var363 = class45.field564[var3 + 1];
                            class293.field4266[var5++] = var361.substring(var362, var363);
                            continue;
                        }
                        if (var537 == 4119) {
                            var5--;
                            String var364 = class293.field4266[var5];
                            boolean var365 = false;
                            StringBuffer var366 = new StringBuffer(var364.length());
                            for (int var367 = 0; var367 < var364.length(); var367++) {
                                char var368 = var364.charAt(var367);
                                if (var368 == '<') {
                                    var365 = true;
                                } else if (var368 == '>') {
                                    var365 = false;
                                } else if (!var365) {
                                    var366.append(var368);
                                }
                            }
                            class293.field4266[var5++] = var366.toString();
                            continue;
                        }
                        if (var537 == 4120) {
                            var3 -= 2;
                            var5--;
                            String var369 = class293.field4266[var5];
                            int var370 = class45.field564[var3];
                            int var371 = class45.field564[var3 + 1];
                            class45.field564[var3++] = var369.indexOf(var370, var371);
                            continue;
                        }
                        if (var537 == 4121) {
                            var3--;
                            int var372 = class45.field564[var3];
                            var5 -= 2;
                            String var373 = class293.field4266[var5];
                            String var374 = class293.field4266[var5 + 1];
                            class45.field564[var3++] = var373.indexOf(var374, var372);
                            continue;
                        }
                        if (var537 == 4122) {
                            var3--;
                            int var375 = class45.field564[var3];
                            class45.field564[var3++] = Character.toLowerCase((char) var375);
                            continue;
                        }
                        if (var537 == 4123) {
                            var3--;
                            int var376 = class45.field564[var3];
                            class45.field564[var3++] = Character.toUpperCase((char) var376);
                            continue;
                        }
                        if (var537 == 4124) {
                            var3--;
                            boolean var377 = class45.field564[var3] != 0;
                            var3--;
                            int var378 = class45.field564[var3];
                            class293.field4266[var5++] = class225.method1630((long) var378, var377, -7, 0, class306.field4473);
                            continue;
                        }
                    } else if (var537 < 4300) {
                        if (var537 == 4200) {
                            var3--;
                            int var310 = class45.field564[var3];
                            class293.field4266[var5++] = class172.method1265(var310, (byte) 77).field5674;
                            continue;
                        }
                        if (var537 == 4201) {
                            var3 -= 2;
                            int var311 = class45.field564[var3 + 1];
                            int var312 = class45.field564[var3];
                            class362 var313 = class172.method1265(var312, (byte) -120);
                            if (var311 >= 1 && var311 <= 5 && var313.field5716[var311 - 1] != null) {
                                class293.field4266[var5++] = var313.field5716[var311 - 1];
                                continue;
                            }
                            class293.field4266[var5++] = "";
                            continue;
                        }
                        if (var537 == 4202) {
                            var3 -= 2;
                            int var314 = class45.field564[var3];
                            int var315 = class45.field564[var3 + 1];
                            class362 var316 = class172.method1265(var314, (byte) 59);
                            if (var315 >= 1 && var315 <= 5 && var316.field5703[var315 - 1] != null) {
                                class293.field4266[var5++] = var316.field5703[var315 - 1];
                                continue;
                            }
                            class293.field4266[var5++] = "";
                            continue;
                        }
                        if (var537 == 4203) {
                            var3--;
                            int var317 = class45.field564[var3];
                            class45.field564[var3++] = class172.method1265(var317, (byte) -124).field5717;
                            continue;
                        }
                        if (var537 == 4204) {
                            var3--;
                            int var318 = class45.field564[var3];
                            class45.field564[var3++] = class172.method1265(var318, (byte) -8).field5685 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 4205) {
                            var3--;
                            int var319 = class45.field564[var3];
                            class362 var320 = class172.method1265(var319, (byte) -127);
                            if (var320.field5700 == -1 && var320.field5714 >= 0) {
                                class45.field564[var3++] = var320.field5714;
                                continue;
                            }
                            class45.field564[var3++] = var319;
                            continue;
                        }
                        if (var537 == 4206) {
                            var3--;
                            int var321 = class45.field564[var3];
                            class362 var322 = class172.method1265(var321, (byte) -121);
                            if (var322.field5700 >= 0 && var322.field5714 >= 0) {
                                class45.field564[var3++] = var322.field5714;
                                continue;
                            }
                            class45.field564[var3++] = var321;
                            continue;
                        }
                        if (var537 == 4207) {
                            var3--;
                            int var323 = class45.field564[var3];
                            class45.field564[var3++] = class172.method1265(var323, (byte) 23).field5704 ? 1 : 0;
                            continue;
                        }
                        if (var537 == 4208) {
                            var3 -= 2;
                            int var324 = class45.field564[var3 + 1];
                            int var325 = class45.field564[var3];
                            class321 var326 = class89.method646(var324, (byte) -69);
                            if (var326.method2220(-112)) {
                                class293.field4266[var5++] = class172.method1265(var325, (byte) -128).method2522(0, var326.field4708, var324);
                            } else {
                                class45.field564[var3++] = class172.method1265(var325, (byte) -34).method2526(var324, 0, var326.field4714);
                            }
                            continue;
                        }
                        if (var537 == 4210) {
                            var5--;
                            String var327 = class293.field4266[var5];
                            var3--;
                            int var328 = class45.field564[var3];
                            class194.method1405(var327, 85, var328 == 1);
                            class45.field564[var3++] = class299.field4376;
                            continue;
                        }
                        if (var537 == 4211) {
                            if (class225.field3242 != null && class299.field4376 > class86.field1103) {
                                class45.field564[var3++] = class335.method2339(class225.field3242[class86.field1103++], 65535);
                                continue;
                            }
                            class45.field564[var3++] = -1;
                            continue;
                        }
                        if (var537 == 4212) {
                            class86.field1103 = 0;
                            continue;
                        }
                    } else if (var537 < 4400) {
                        if (var537 == 4300) {
                            var3 -= 2;
                            int var103 = class45.field564[var3 + 1];
                            int var104 = class45.field564[var3];
                            class321 var105 = class89.method646(var103, (byte) -95);
                            if (var105.method2220(123)) {
                                class293.field4266[var5++] = class148.method1138(-3, var104).method1203(-1575770623, var103, var105.field4708);
                            } else {
                                class45.field564[var3++] = class148.method1138(arg1 - 1006199391, var104).method1207(-9059, var105.field4714, var103);
                            }
                            continue;
                        }
                    } else if (var537 >= 4500) {
                        if (var537 >= 4600) {
                            if (var537 < 5100) {
                                if (var537 == 5000) {
                                    class45.field564[var3++] = class322.field4731;
                                    continue;
                                }
                                if (var537 == 5001) {
                                    var3 -= 3;
                                    class49.field657++;
                                    class322.field4731 = class45.field564[var3];
                                    class270.field3879 = class45.field564[var3 + 1];
                                    class312.field4589 = class45.field564[var3 + 2];
                                    class251.field3681.method1309(arg1 ^ 0x3BF9624B, 234);
                                    class251.field3681.method2048(class322.field4731, 86);
                                    class251.field3681.method2048(class270.field3879, arg1 ^ 0x3BF96222);
                                    class251.field3681.method2048(class312.field4589, 108);
                                    continue;
                                }
                                if (var537 == 5002) {
                                    class169.field2354++;
                                    var5--;
                                    String var106 = class293.field4266[var5];
                                    var3 -= 2;
                                    int var107 = class45.field564[var3];
                                    int var108 = class45.field564[var3 + 1];
                                    class251.field3681.method1309(23, 90);
                                    class251.field3681.method2049(arg1 - 1006219168, class201.method1476(-122, var106));
                                    class251.field3681.method2048(var107 - 1, 119);
                                    class251.field3681.method2048(var108, 122);
                                    continue;
                                }
                                if (var537 == 5003) {
                                    var3--;
                                    int var109 = class45.field564[var3];
                                    String var110 = null;
                                    if (var109 < 100) {
                                        var110 = class64.field810[var109];
                                    }
                                    if (var110 == null) {
                                        var110 = "";
                                    }
                                    class293.field4266[var5++] = var110;
                                    continue;
                                }
                                if (var537 == 5004) {
                                    int var111 = -1;
                                    var3--;
                                    int var112 = class45.field564[var3];
                                    if (var112 < 100 && class64.field810[var112] != null) {
                                        var111 = class193.field2665[var112];
                                    }
                                    class45.field564[var3++] = var111;
                                    continue;
                                }
                                if (var537 == 5005) {
                                    class45.field564[var3++] = class270.field3879;
                                    continue;
                                }
                                if (var537 == 5008) {
                                    var5--;
                                    String var113 = class293.field4266[var5];
                                    if (var113.startsWith("::")) {
                                        class235.method1672((byte) 124, var113);
                                        continue;
                                    }
                                    if (class217.field3070 == 0 && (class78.field1006 && !class94.field1231 || class226.field3249)) {
                                        continue;
                                    }
                                    class224.field3223++;
                                    String var114 = var113.toLowerCase();
                                    byte var115 = 0;
                                    byte var116 = 0;
                                    if (var114.startsWith(class199.field2810)) {
                                        var113 = var113.substring(class199.field2810.length());
                                        var115 = 0;
                                    } else if (var114.startsWith(class206.field2861)) {
                                        var115 = 1;
                                        var113 = var113.substring(class206.field2861.length());
                                    } else if (var114.startsWith(class293.field4265)) {
                                        var113 = var113.substring(class293.field4265.length());
                                        var115 = 2;
                                    } else if (var114.startsWith(class75.field997)) {
                                        var113 = var113.substring(class75.field997.length());
                                        var115 = 3;
                                    } else if (var114.startsWith(class26.field306)) {
                                        var113 = var113.substring(class26.field306.length());
                                        var115 = 4;
                                    } else if (var114.startsWith(class311.field4577)) {
                                        var113 = var113.substring(class311.field4577.length());
                                        var115 = 5;
                                    } else if (var114.startsWith(class119.field1545)) {
                                        var113 = var113.substring(class119.field1545.length());
                                        var115 = 6;
                                    } else if (var114.startsWith(class61.field770)) {
                                        var115 = 7;
                                        var113 = var113.substring(class61.field770.length());
                                    } else if (var114.startsWith(class144.field2016)) {
                                        var113 = var113.substring(class144.field2016.length());
                                        var115 = 8;
                                    } else if (var114.startsWith(class115.field1482)) {
                                        var113 = var113.substring(class115.field1482.length());
                                        var115 = 9;
                                    } else if (var114.startsWith(class1.field4)) {
                                        var115 = 10;
                                        var113 = var113.substring(class1.field4.length());
                                    } else if (var114.startsWith(class223.field3210)) {
                                        var113 = var113.substring(class223.field3210.length());
                                        var115 = 11;
                                    } else if (class306.field4473 != 0) {
                                        if (var114.startsWith(class163.field2313)) {
                                            var113 = var113.substring(class163.field2313.length());
                                            var115 = 0;
                                        } else if (var114.startsWith(class236.field3396)) {
                                            var113 = var113.substring(class236.field3396.length());
                                            var115 = 1;
                                        } else if (var114.startsWith(class233.field3346)) {
                                            var115 = 2;
                                            var113 = var113.substring(class233.field3346.length());
                                        } else if (var114.startsWith(class238.field3445)) {
                                            var115 = 3;
                                            var113 = var113.substring(class238.field3445.length());
                                        } else if (var114.startsWith(class88.field1108)) {
                                            var115 = 4;
                                            var113 = var113.substring(class88.field1108.length());
                                        } else if (var114.startsWith(class283.field4031)) {
                                            var113 = var113.substring(class283.field4031.length());
                                            var115 = 5;
                                        } else if (var114.startsWith(class258.field3755)) {
                                            var113 = var113.substring(class258.field3755.length());
                                            var115 = 6;
                                        } else if (var114.startsWith(class236.field3385)) {
                                            var115 = 7;
                                            var113 = var113.substring(class236.field3385.length());
                                        } else if (var114.startsWith(class157.field2213)) {
                                            var113 = var113.substring(class157.field2213.length());
                                            var115 = 8;
                                        } else if (var114.startsWith(class75.field993)) {
                                            var115 = 9;
                                            var113 = var113.substring(class75.field993.length());
                                        } else if (var114.startsWith(class215.field3041)) {
                                            var113 = var113.substring(class215.field3041.length());
                                            var115 = 10;
                                        } else if (var114.startsWith(class193.field2666)) {
                                            var115 = 11;
                                            var113 = var113.substring(class193.field2666.length());
                                        }
                                    }
                                    String var117 = var113.toLowerCase();
                                    if (var117.startsWith(class170.field2359)) {
                                        var113 = var113.substring(class170.field2359.length());
                                        var116 = 1;
                                    } else if (var117.startsWith(class55.field714)) {
                                        var116 = 2;
                                        var113 = var113.substring(class55.field714.length());
                                    } else if (var117.startsWith(class279.field3981)) {
                                        var116 = 3;
                                        var113 = var113.substring(class279.field3981.length());
                                    } else if (var117.startsWith(class66.field850)) {
                                        var113 = var113.substring(class66.field850.length());
                                        var116 = 4;
                                    } else if (var117.startsWith(class135.field1848)) {
                                        var116 = 5;
                                        var113 = var113.substring(class135.field1848.length());
                                    } else if (class306.field4473 != 0) {
                                        if (var117.startsWith(class234.field3357)) {
                                            var113 = var113.substring(class234.field3357.length());
                                            var116 = 1;
                                        } else if (var117.startsWith(class258.field3756)) {
                                            var113 = var113.substring(class258.field3756.length());
                                            var116 = 2;
                                        } else if (var117.startsWith(class308.field4539)) {
                                            var116 = 3;
                                            var113 = var113.substring(class308.field4539.length());
                                        } else if (var117.startsWith(class331.field4904)) {
                                            var116 = 4;
                                            var113 = var113.substring(class331.field4904.length());
                                        } else if (var117.startsWith(class135.field1837)) {
                                            var113 = var113.substring(class135.field1837.length());
                                            var116 = 5;
                                        }
                                    }
                                    class251.field3681.method1309(23, 186);
                                    class251.field3681.method2048(0, 110);
                                    int var118 = class251.field3681.field4351;
                                    class251.field3681.method2048(var115, 83);
                                    class251.field3681.method2048(var116, 78);
                                    class257.method1787(class251.field3681, var113, -32696);
                                    class251.field3681.method2105((byte) -116, class251.field3681.field4351 - var118);
                                    continue;
                                }
                                if (var537 == 5009) {
                                    var5 -= 2;
                                    String var119 = class293.field4266[var5];
                                    String var120 = class293.field4266[var5 + 1];
                                    if (class217.field3070 != 0 || (!class78.field1006 || class94.field1231) && !class226.field3249) {
                                        class94.field1221++;
                                        class251.field3681.method1309(arg1 ^ 0x3BF9624B, 157);
                                        class251.field3681.method2048(0, 92);
                                        int var121 = class251.field3681.field4351;
                                        class251.field3681.method2049(-19780, class201.method1476(arg1 - 1006199516, var119));
                                        class257.method1787(class251.field3681, var120, -32696);
                                        class251.field3681.method2105((byte) -120, class251.field3681.field4351 - var121);
                                    }
                                    continue;
                                }
                                if (var537 == 5010) {
                                    String var122 = null;
                                    var3--;
                                    int var123 = class45.field564[var3];
                                    if (var123 < 100) {
                                        var122 = class303.field4439[var123];
                                    }
                                    if (var122 == null) {
                                        var122 = "";
                                    }
                                    class293.field4266[var5++] = var122;
                                    continue;
                                }
                                if (var537 == 5011) {
                                    var3--;
                                    int var124 = class45.field564[var3];
                                    String var125 = null;
                                    if (var124 < 100) {
                                        var125 = class323.field4748[var124];
                                    }
                                    if (var125 == null) {
                                        var125 = "";
                                    }
                                    class293.field4266[var5++] = var125;
                                    continue;
                                }
                                if (var537 == 5012) {
                                    var3--;
                                    int var126 = class45.field564[var3];
                                    int var127 = -1;
                                    if (var126 < 100) {
                                        var127 = class305.field4462[var126];
                                    }
                                    class45.field564[var3++] = var127;
                                    continue;
                                }
                                if (var537 == 5015) {
                                    String var128;
                                    if (class359.field5616 == null || class359.field5616.field3475 == null) {
                                        var128 = class89.field1117;
                                    } else {
                                        var128 = class359.field5616.method1698((byte) -122);
                                    }
                                    class293.field4266[var5++] = var128;
                                    continue;
                                }
                                if (var537 == 5016) {
                                    class45.field564[var3++] = class312.field4589;
                                    continue;
                                }
                                if (var537 == 5017) {
                                    class45.field564[var3++] = class65.field830;
                                    continue;
                                }
                                if (var537 == 5050) {
                                    var3--;
                                    int var129 = class45.field564[var3];
                                    class293.field4266[var5++] = class106.method749(var129, arg1 - 1006169490).field4672;
                                    continue;
                                }
                                if (var537 == 5051) {
                                    var3--;
                                    int var130 = class45.field564[var3];
                                    class317 var131 = class106.method749(var130, 29898);
                                    if (var131.field4673 == null) {
                                        class45.field564[var3++] = 0;
                                    } else {
                                        class45.field564[var3++] = var131.field4673.length;
                                    }
                                    continue;
                                }
                                if (var537 == 5052) {
                                    var3 -= 2;
                                    int var132 = class45.field564[var3 + 1];
                                    int var133 = class45.field564[var3];
                                    class317 var134 = class106.method749(var133, 29898);
                                    int var135 = var134.field4673[var132];
                                    class45.field564[var3++] = var135;
                                    continue;
                                }
                                if (var537 == 5053) {
                                    var3--;
                                    int var136 = class45.field564[var3];
                                    class317 var137 = class106.method749(var136, arg1 ^ 0x3BF91696);
                                    if (var137.field4669 == null) {
                                        class45.field564[var3++] = 0;
                                    } else {
                                        class45.field564[var3++] = var137.field4669.length;
                                    }
                                    continue;
                                }
                                if (var537 == 5054) {
                                    var3 -= 2;
                                    int var138 = class45.field564[var3];
                                    int var139 = class45.field564[var3 + 1];
                                    class45.field564[var3++] = class106.method749(var138, 29898).field4669[var139];
                                    continue;
                                }
                                if (var537 == 5055) {
                                    var3--;
                                    int var140 = class45.field564[var3];
                                    class293.field4266[var5++] = class28.method183(var140, true).method864(class300.method2107(arg1, 1006184158));
                                    continue;
                                }
                                if (var537 == 5056) {
                                    var3--;
                                    int var141 = class45.field564[var3];
                                    class117 var142 = class28.method183(var141, true);
                                    if (var142.field1530 == null) {
                                        class45.field564[var3++] = 0;
                                    } else {
                                        class45.field564[var3++] = var142.field1530.length;
                                    }
                                    continue;
                                }
                                if (var537 == 5057) {
                                    var3 -= 2;
                                    int var143 = class45.field564[var3];
                                    int var144 = class45.field564[var3 + 1];
                                    class45.field564[var3++] = class28.method183(var143, true).field1530[var144];
                                    continue;
                                }
                                if (var537 == 5058) {
                                    class264.field3841 = new class271();
                                    var3--;
                                    class264.field3841.field3883 = class45.field564[var3];
                                    class264.field3841.field3882 = class28.method183(class264.field3841.field3883, true);
                                    class264.field3841.field3892 = new int[class264.field3841.field3882.method854(arg1 - 1006199388)];
                                    continue;
                                }
                                if (var537 == 5059) {
                                    class206.field2862++;
                                    class251.field3681.method1309(23, 222);
                                    class251.field3681.method2048(0, 123);
                                    int var145 = class251.field3681.field4351;
                                    class251.field3681.method2048(0, 70);
                                    class251.field3681.method2098(-109, class264.field3841.field3883);
                                    class264.field3841.field3882.method862(class264.field3841.field3892, (byte) 107, class251.field3681);
                                    class251.field3681.method2105((byte) -123, class251.field3681.field4351 - var145);
                                    continue;
                                }
                                if (var537 == 5060) {
                                    class5.field54++;
                                    var5--;
                                    String var146 = class293.field4266[var5];
                                    class251.field3681.method1309(23, 42);
                                    class251.field3681.method2048(0, arg1 ^ 0x3BF9623E);
                                    int var147 = class251.field3681.field4351;
                                    class251.field3681.method2049(-19780, class201.method1476(-128, var146));
                                    class251.field3681.method2098(-37, class264.field3841.field3883);
                                    class264.field3841.field3882.method862(class264.field3841.field3892, (byte) 107, class251.field3681);
                                    class251.field3681.method2105((byte) -120, class251.field3681.field4351 - var147);
                                    continue;
                                }
                                if (var537 == 5061) {
                                    class206.field2862++;
                                    class251.field3681.method1309(23, 222);
                                    class251.field3681.method2048(0, 66);
                                    int var148 = class251.field3681.field4351;
                                    class251.field3681.method2048(1, 64);
                                    class251.field3681.method2098(-117, class264.field3841.field3883);
                                    class264.field3841.field3882.method862(class264.field3841.field3892, (byte) 107, class251.field3681);
                                    class251.field3681.method2105((byte) -125, class251.field3681.field4351 - var148);
                                    continue;
                                }
                                if (var537 == 5062) {
                                    var3 -= 2;
                                    int var149 = class45.field564[var3];
                                    int var150 = class45.field564[var3 + 1];
                                    class45.field564[var3++] = class106.method749(var149, arg1 - 1006169490).field4674[var150];
                                    continue;
                                }
                                if (var537 == 5063) {
                                    var3 -= 2;
                                    int var151 = class45.field564[var3];
                                    int var152 = class45.field564[var3 + 1];
                                    class45.field564[var3++] = class106.method749(var151, 29898).field4678[var152];
                                    continue;
                                }
                                if (var537 == 5064) {
                                    var3 -= 2;
                                    int var153 = class45.field564[var3 + 1];
                                    int var154 = class45.field564[var3];
                                    if (var153 == -1) {
                                        class45.field564[var3++] = -1;
                                    } else {
                                        class45.field564[var3++] = class106.method749(var154, 29898).method2193((char) var153, arg1 - 1006199279);
                                    }
                                    continue;
                                }
                                if (var537 == 5065) {
                                    var3 -= 2;
                                    int var155 = class45.field564[var3 + 1];
                                    int var156 = class45.field564[var3];
                                    if (var155 == -1) {
                                        class45.field564[var3++] = -1;
                                    } else {
                                        class45.field564[var3++] = class106.method749(var156, 29898).method2190((char) var155, -1);
                                    }
                                    continue;
                                }
                                if (var537 == 5066) {
                                    var3--;
                                    int var157 = class45.field564[var3];
                                    class45.field564[var3++] = class28.method183(var157, true).method854(arg1 - 1006199388);
                                    continue;
                                }
                                if (var537 == 5067) {
                                    var3 -= 2;
                                    int var158 = class45.field564[var3];
                                    int var159 = class45.field564[var3 + 1];
                                    int var160 = class28.method183(var158, true).method856(var159, 0);
                                    class45.field564[var3++] = var160;
                                    continue;
                                }
                                if (var537 == 5068) {
                                    var3 -= 2;
                                    int var161 = class45.field564[var3];
                                    int var162 = class45.field564[var3 + 1];
                                    class264.field3841.field3892[var161] = var162;
                                    continue;
                                }
                                if (var537 == 5069) {
                                    var3 -= 2;
                                    int var163 = class45.field564[var3];
                                    int var164 = class45.field564[var3 + 1];
                                    class264.field3841.field3892[var163] = var164;
                                    continue;
                                }
                                if (var537 == 5070) {
                                    var3 -= 3;
                                    int var165 = class45.field564[var3];
                                    int var166 = class45.field564[var3 + 2];
                                    int var167 = class45.field564[var3 + 1];
                                    class117 var168 = class28.method183(var165, true);
                                    if (var168.method856(var167, 0) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class45.field564[var3++] = var168.method855(var166, 0, var167);
                                    continue;
                                }
                                if (var537 == 5071) {
                                    var5--;
                                    String var169 = class293.field4266[var5];
                                    var3--;
                                    boolean var170 = class45.field564[var3] == 1;
                                    class195.method1410(var170, var169, arg1 - 1006181126);
                                    class45.field564[var3++] = class299.field4376;
                                    continue;
                                }
                                if (var537 == 5072) {
                                    if (class225.field3242 != null && class299.field4376 > class86.field1103) {
                                        class45.field564[var3++] = class335.method2339(65535, class225.field3242[class86.field1103++]);
                                        continue;
                                    }
                                    class45.field564[var3++] = -1;
                                    continue;
                                }
                                if (var537 == 5073) {
                                    class86.field1103 = 0;
                                    continue;
                                }
                            } else if (var537 < 5200) {
                                if (var537 == 5100) {
                                    if (class143.field1991[86]) {
                                        class45.field564[var3++] = 1;
                                    } else {
                                        class45.field564[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var537 == 5101) {
                                    if (class143.field1991[82]) {
                                        class45.field564[var3++] = 1;
                                    } else {
                                        class45.field564[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var537 == 5102) {
                                    if (class143.field1991[81]) {
                                        class45.field564[var3++] = 1;
                                    } else {
                                        class45.field564[var3++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var537 < 5300) {
                                if (var537 == 5200) {
                                    var3--;
                                    class20.method130(class45.field564[var3], arg1 - 1006220826);
                                    continue;
                                }
                                if (var537 == 5201) {
                                    class45.field564[var3++] = class321.method2222((byte) -120);
                                    continue;
                                }
                                if (var537 == 5205) {
                                    var3--;
                                    class86.method626(false, -1, -1, class45.field564[var3], 27712);
                                    continue;
                                }
                                if (var537 == 5206) {
                                    var3--;
                                    int var257 = class45.field564[var3];
                                    class310 var258 = class38.method259((var257 & 0xFFFC4E5) >> 14, var257 & 0x3FFF);
                                    if (var258 == null) {
                                        class45.field564[var3++] = -1;
                                    } else {
                                        class45.field564[var3++] = var258.field4548;
                                    }
                                    continue;
                                }
                                if (var537 == 5207) {
                                    var3--;
                                    class310 var259 = class38.method270(class45.field564[var3]);
                                    if (var259 != null && var259.field4569 != null) {
                                        class293.field4266[var5++] = var259.field4569;
                                        continue;
                                    }
                                    class293.field4266[var5++] = "";
                                    continue;
                                }
                                if (var537 == 5208) {
                                    class45.field564[var3++] = class56.field721;
                                    class45.field564[var3++] = class248.field3608;
                                    continue;
                                }
                                if (var537 == 5209) {
                                    class45.field564[var3++] = class32.field393 + class38.field462;
                                    class45.field564[var3++] = class38.field459 + class38.field461 - class35.field428 - 1;
                                    continue;
                                }
                                if (var537 == 5210) {
                                    var3--;
                                    int var260 = class45.field564[var3];
                                    class310 var261 = class38.method270(var260);
                                    if (var261 == null) {
                                        class45.field564[var3++] = 0;
                                        class45.field564[var3++] = 0;
                                    } else {
                                        class45.field564[var3++] = class335.method2339(var261.field4547 >> 14, 16383);
                                        class45.field564[var3++] = class335.method2339(var261.field4547, 16383);
                                    }
                                    continue;
                                }
                                if (var537 == 5211) {
                                    var3--;
                                    int var262 = class45.field564[var3];
                                    class310 var263 = class38.method270(var262);
                                    if (var263 == null) {
                                        class45.field564[var3++] = 0;
                                        class45.field564[var3++] = 0;
                                    } else {
                                        class45.field564[var3++] = var263.field4561 - var263.field4546;
                                        class45.field564[var3++] = var263.field4566 - var263.field4551;
                                    }
                                    continue;
                                }
                                if (var537 == 5212) {
                                    class352 var264 = class335.method2338((byte) 113);
                                    if (var264 == null) {
                                        class45.field564[var3++] = -1;
                                        class45.field564[var3++] = -1;
                                    } else {
                                        class45.field564[var3++] = var264.field5493;
                                        int var265 = class38.field462 + var264.field5503 << 14 | var264.field5496 << 28 | class38.field461 + class38.field459 - var264.field5504 - 1;
                                        class45.field564[var3++] = var265;
                                    }
                                    continue;
                                }
                                if (var537 == 5213) {
                                    class352 var266 = class288.method1978(2048);
                                    if (var266 == null) {
                                        class45.field564[var3++] = -1;
                                        class45.field564[var3++] = -1;
                                    } else {
                                        class45.field564[var3++] = var266.field5493;
                                        int var267 = class38.field461 + class38.field459 - var266.field5504 - 1 | var266.field5496 << 28 | var266.field5503 + class38.field462 << 14;
                                        class45.field564[var3++] = var267;
                                    }
                                    continue;
                                }
                                if (var537 == 5214) {
                                    var3--;
                                    int var268 = class45.field564[var3];
                                    class310 var269 = class32.method204(257238413);
                                    if (var269 != null) {
                                        boolean var270 = var269.method2154(var268 & 0x3FFF, -1, var268 >> 28 & 0x3, field2702, var268 >> 14 & 0x3FFF);
                                        if (var270) {
                                            class112.method795(field2702[1], (byte) 82, field2702[2]);
                                        }
                                    }
                                    continue;
                                }
                                if (var537 == 5215) {
                                    var3 -= 2;
                                    int var271 = class45.field564[var3 + 1];
                                    int var272 = class45.field564[var3];
                                    class105 var273 = class38.method260(var272 >> 14 & 0x3FFF, var272 & 0x3FFF);
                                    boolean var274 = false;
                                    for (class310 var275 = (class310) var273.method739((byte) 38); var275 != null; var275 = (class310) var273.method747(1)) {
                                        if (var275.field4548 == var271) {
                                            var274 = true;
                                            break;
                                        }
                                    }
                                    if (var274) {
                                        class45.field564[var3++] = 1;
                                    } else {
                                        class45.field564[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var537 == 5218) {
                                    var3--;
                                    int var276 = class45.field564[var3];
                                    class310 var277 = class38.method270(var276);
                                    if (var277 == null) {
                                        class45.field564[var3++] = -1;
                                    } else {
                                        class45.field564[var3++] = var277.field4565;
                                    }
                                    continue;
                                }
                                if (var537 == 5220) {
                                    class45.field564[var3++] = class82.field1061 == 100 ? 1 : 0;
                                    continue;
                                }
                                if (var537 == 5221) {
                                    var3--;
                                    int var278 = class45.field564[var3];
                                    class112.method795((var278 & 0xFFFC9BE) >> 14, (byte) -121, var278 & 0x3FFF);
                                    continue;
                                }
                                if (var537 == 5222) {
                                    class310 var279 = class32.method204(257238413);
                                    if (var279 == null) {
                                        class45.field564[var3++] = -1;
                                        class45.field564[var3++] = -1;
                                    } else {
                                        boolean var280 = var279.method2159(class38.field462 + class32.field393, class38.field459 - (class35.field428 + 1 + -class38.field461), (byte) -125, field2702);
                                        if (var280) {
                                            class45.field564[var3++] = field2702[1];
                                            class45.field564[var3++] = field2702[2];
                                        } else {
                                            class45.field564[var3++] = -1;
                                            class45.field564[var3++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var537 == 5223) {
                                    var3 -= 2;
                                    int var281 = class45.field564[var3 + 1];
                                    int var282 = class45.field564[var3];
                                    class86.method626(false, var281 & 0x3FFF, var281 >> 14 & 0x3FFF, var282, arg1 - 1006171676);
                                    continue;
                                }
                                if (var537 == 5224) {
                                    var3--;
                                    int var283 = class45.field564[var3];
                                    class310 var284 = class32.method204(arg1 ^ 0x34AC47D1);
                                    if (var284 == null) {
                                        class45.field564[var3++] = -1;
                                        class45.field564[var3++] = -1;
                                    } else {
                                        boolean var285 = var284.method2154(var283 & 0x3FFF, -1, var283 >> 28 & 0x3, field2702, var283 >> 14 & 0x3FFF);
                                        if (var285) {
                                            class45.field564[var3++] = field2702[1];
                                            class45.field564[var3++] = field2702[2];
                                        } else {
                                            class45.field564[var3++] = -1;
                                            class45.field564[var3++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var537 == 5225) {
                                    var3--;
                                    int var286 = class45.field564[var3];
                                    class310 var287 = class32.method204(257238413);
                                    if (var287 == null) {
                                        class45.field564[var3++] = -1;
                                        class45.field564[var3++] = -1;
                                    } else {
                                        boolean var288 = var287.method2159((var286 & 0xFFFDF1A) >> 14, var286 & 0x3FFF, (byte) -128, field2702);
                                        if (var288) {
                                            class45.field564[var3++] = field2702[1];
                                            class45.field564[var3++] = field2702[2];
                                        } else {
                                            class45.field564[var3++] = -1;
                                            class45.field564[var3++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var537 == 5226) {
                                    var3--;
                                    class126.method934((byte) -121, class45.field564[var3]);
                                    continue;
                                }
                                if (var537 == 5227) {
                                    var3 -= 2;
                                    int var289 = class45.field564[var3];
                                    int var290 = class45.field564[var3 + 1];
                                    class86.method626(true, var290 & 0x3FFF, var290 >> 14 & 0x3FFF, var289, arg1 - 1006171676);
                                    continue;
                                }
                                if (var537 == 5228) {
                                    var3--;
                                    class30.field352 = class45.field564[var3] == 1;
                                    continue;
                                }
                                if (var537 == 5229) {
                                    class45.field564[var3++] = class30.field352 ? 1 : 0;
                                    continue;
                                }
                                if (var537 == 5230) {
                                    var3--;
                                    int var291 = class45.field564[var3];
                                    class177.method1300(var291, (byte) -113);
                                    continue;
                                }
                                if (var537 == 5231) {
                                    var3 -= 2;
                                    int var292 = class45.field564[var3];
                                    boolean var293 = class45.field564[var3 + 1] == 1;
                                    if (class319.field4693 == null) {
                                        continue;
                                    }
                                    class26 var294 = class319.field4693.method2279((long) var292, 18);
                                    if (var294 != null && !var293) {
                                        var294.method179((byte) 51);
                                        continue;
                                    }
                                    if (var294 == null && var293) {
                                        class26 var295 = new class26();
                                        class319.field4693.method2275(var295, 124, (long) var292);
                                    }
                                    continue;
                                }
                                if (var537 == 5232) {
                                    var3--;
                                    int var296 = class45.field564[var3];
                                    if (class319.field4693 == null) {
                                        class45.field564[var3++] = 0;
                                    } else {
                                        class26 var297 = class319.field4693.method2279((long) var296, -126);
                                        class45.field564[var3++] = var297 == null ? 0 : 1;
                                    }
                                    continue;
                                }
                                if (var537 == 5233) {
                                    var3 -= 2;
                                    int var298 = class45.field564[var3];
                                    boolean var299 = class45.field564[var3 + 1] == 1;
                                    if (class217.field3072 == null) {
                                        continue;
                                    }
                                    class26 var300 = class217.field3072.method2279((long) var298, 64);
                                    if (var300 != null && !var299) {
                                        var300.method179((byte) 51);
                                        continue;
                                    }
                                    if (var300 == null && var299) {
                                        class26 var301 = new class26();
                                        class217.field3072.method2275(var301, arg1 - 1006199301, (long) var298);
                                    }
                                    continue;
                                }
                                if (var537 == 5234) {
                                    var3--;
                                    int var302 = class45.field564[var3];
                                    if (class217.field3072 == null) {
                                        class45.field564[var3++] = 0;
                                    } else {
                                        class26 var303 = class217.field3072.method2279((long) var302, 37);
                                        class45.field564[var3++] = var303 == null ? 0 : 1;
                                    }
                                    continue;
                                }
                                if (var537 == 5235) {
                                    class45.field564[var3++] = class38.field458 == null ? -1 : class38.field458.field4548;
                                    continue;
                                }
                            } else if (var537 < 5400) {
                                if (var537 == 5300) {
                                    var3 -= 2;
                                    int var171 = class45.field564[var3];
                                    int var172 = class45.field564[var3 + 1];
                                    class158.method1216(false, arg1 ^ 0xC4069DCE, 3, var171, var172);
                                    class45.field564[var3++] = class117.field1519 == null ? 0 : 1;
                                    continue;
                                }
                                if (var537 == 5301) {
                                    if (class117.field1519 != null) {
                                        class158.method1216(false, -117, class118.field1543, -1, -1);
                                    }
                                    continue;
                                }
                                if (var537 == 5302) {
                                    class181[] var173 = class9.method61((byte) -52);
                                    class45.field564[var3++] = var173.length;
                                    continue;
                                }
                                if (var537 == 5303) {
                                    var3--;
                                    int var174 = class45.field564[var3];
                                    class181[] var175 = class9.method61((byte) -71);
                                    class45.field564[var3++] = var175[var174].field2474;
                                    class45.field564[var3++] = var175[var174].field2473;
                                    continue;
                                }
                                if (var537 == 5305) {
                                    int var176 = class330.field4838;
                                    int var177 = class214.field3032;
                                    int var178 = -1;
                                    class181[] var179 = class9.method61((byte) -92);
                                    for (int var180 = 0; var180 < var179.length; var180++) {
                                        class181 var181 = var179[var180];
                                        if (var181.field2474 == var176 && var181.field2473 == var177) {
                                            var178 = var180;
                                            break;
                                        }
                                    }
                                    class45.field564[var3++] = var178;
                                    continue;
                                }
                                if (var537 == 5306) {
                                    class45.field564[var3++] = class33.method213(21);
                                    continue;
                                }
                                if (var537 == 5307) {
                                    var3--;
                                    int var182 = class45.field564[var3];
                                    if (var182 < 0 || var182 > 2) {
                                        var182 = 0;
                                    }
                                    class158.method1216(false, -105, var182, -1, -1);
                                    continue;
                                }
                                if (var537 == 5308) {
                                    class45.field564[var3++] = class118.field1543;
                                    continue;
                                }
                                if (var537 == 5309) {
                                    var3--;
                                    int var183 = class45.field564[var3];
                                    if (var183 < 0 || var183 > 2) {
                                        var183 = 0;
                                    }
                                    class118.field1543 = var183;
                                    class122.method879(-25299, class157.field2216);
                                    continue;
                                }
                            } else if (var537 < 5500) {
                                if (var537 == 5400) {
                                    var5 -= 2;
                                    class357.field5588++;
                                    String var235 = class293.field4266[var5 + 1];
                                    var3--;
                                    int var236 = class45.field564[var3];
                                    String var237 = class293.field4266[var5];
                                    class251.field3681.method1309(23, 243);
                                    class251.field3681.method2048(class173.method1271((byte) 93, var237) + class173.method1271((byte) 83, var235) + 1, 98);
                                    class251.field3681.method2042(var237, arg1 ^ 0xC4069D8D);
                                    class251.field3681.method2042(var235, -106);
                                    class251.field3681.method2048(var236, 85);
                                    continue;
                                }
                                if (var537 == 5401) {
                                    var3 -= 2;
                                    class310.field4557[class45.field564[var3]] = (short) class142.method1103(122, class45.field564[var3 + 1]);
                                    class340.method2365(true);
                                    class134.method1021(15575);
                                    class93.method672(114);
                                    class139.method1055(2883872);
                                    class292.method2001(81);
                                    continue;
                                }
                                if (var537 == 5405) {
                                    var3 -= 2;
                                    int var238 = class45.field564[var3];
                                    int var239 = class45.field564[var3 + 1];
                                    if (var238 >= 0 && var238 < 2) {
                                        class138.field1897[var238] = new int[var239 << 1][4];
                                    }
                                    continue;
                                }
                                if (var537 == 5406) {
                                    var3 -= 7;
                                    int var240 = class45.field564[var3 + 1] << 1;
                                    int var241 = class45.field564[var3];
                                    int var242 = class45.field564[var3 + 3];
                                    int var243 = class45.field564[var3 + 2];
                                    int var244 = class45.field564[var3 + 4];
                                    int var245 = class45.field564[var3 + 5];
                                    int var246 = class45.field564[var3 + 6];
                                    if (var241 >= 0 && var241 < 2 && class138.field1897[var241] != null && var240 >= 0 && class138.field1897[var241].length > var240) {
                                        class138.field1897[var241][var240] = new int[] { class335.method2339(var243 >> 14, 16383) * 128, var242, class335.method2339(16383, var243) * 128, var246 };
                                        class138.field1897[var241][var240 + 1] = new int[] { (class335.method2339(var244, 268421244) >> 14) * 128, var245, class335.method2339(16383, var244) * 128 };
                                    }
                                    continue;
                                }
                                if (var537 == 5407) {
                                    var3--;
                                    int var247 = class138.field1897[class45.field564[var3]].length >> 1;
                                    class45.field564[var3++] = var247;
                                    continue;
                                }
                                if (var537 == 5411) {
                                    if (class117.field1519 != null) {
                                        class158.method1216(false, -70, class118.field1543, -1, -1);
                                    }
                                    if (class288.field4173 == null) {
                                        class232.method1654(arg1 ^ 0x3BF9623A, class355.method2470((byte) 104), false);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var537 == 5419) {
                                    String var248 = "";
                                    if (class345.field5355 != null) {
                                        if (class345.field5355.field2606 == null) {
                                            var248 = class356.method2474((byte) 39, class345.field5355.field2605);
                                        } else {
                                            var248 = (String) class345.field5355.field2606;
                                        }
                                    }
                                    class293.field4266[var5++] = var248;
                                    continue;
                                }
                                if (var537 == 5420) {
                                    class45.field564[var3++] = class69.field871 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var537 == 5421) {
                                    if (class117.field1519 != null) {
                                        class158.method1216(false, -61, class118.field1543, -1, -1);
                                    }
                                    var5--;
                                    String var249 = class293.field4266[var5];
                                    var3--;
                                    boolean var250 = class45.field564[var3] == 1;
                                    String var251 = class355.method2470((byte) 104) + var249;
                                    if (class288.field4173 != null || var250 && class69.field871 != 3 && class69.field882.startsWith("win") && !class179.field2455) {
                                        class126.field1686 = var251;
                                        class55.field711 = var250;
                                        class289.field4188 = class157.field2216.method504(var251, (byte) -88);
                                        continue;
                                    }
                                    class232.method1654(107, var251, var250);
                                    continue;
                                }
                                if (var537 == 5422) {
                                    var5 -= 2;
                                    String var252 = class293.field4266[var5];
                                    String var253 = class293.field4266[var5 + 1];
                                    var3--;
                                    int var254 = class45.field564[var3];
                                    if (var252.length() > 0) {
                                        if (class231.field3301 == null) {
                                            class231.field3301 = new String[class26.field309[class299.field4362]];
                                        }
                                        class231.field3301[var254] = var252;
                                    }
                                    if (var253.length() > 0) {
                                        if (class175.field2402 == null) {
                                            class175.field2402 = new String[class26.field309[class299.field4362]];
                                        }
                                        class175.field2402[var254] = var253;
                                    }
                                    continue;
                                }
                                if (var537 == 5423) {
                                    var5--;
                                    System.out.println(class293.field4266[var5]);
                                    continue;
                                }
                                if (var537 == 5424) {
                                    var3 -= 11;
                                    class58.field748 = class45.field564[var3];
                                    class14.field158 = class45.field564[var3 + 1];
                                    class335.field5227 = class45.field564[var3 + 2];
                                    class276.field3960 = class45.field564[var3 + 3];
                                    client.field1630 = class45.field564[var3 + 4];
                                    class9.field105 = class45.field564[var3 + 5];
                                    class161.field2304 = class45.field564[var3 + 6];
                                    class282.field4022 = class45.field564[var3 + 7];
                                    class16.field189 = class45.field564[var3 + 8];
                                    class335.field5236 = class45.field564[var3 + 9];
                                    class272.field3899 = class45.field564[var3 + 10];
                                    class1.field7.method1076(client.field1630, 60);
                                    class1.field7.method1076(class9.field105, 69);
                                    class1.field7.method1076(class161.field2304, 121);
                                    class1.field7.method1076(class282.field4022, 106);
                                    class1.field7.method1076(class16.field189, arg1 ^ 0x3BF96205);
                                    class66.field846 = true;
                                    continue;
                                }
                                if (var537 == 5425) {
                                    class219.method1583(0);
                                    class66.field846 = false;
                                    continue;
                                }
                                if (var537 == 5426) {
                                    var3--;
                                    class145.field2022 = class45.field564[var3];
                                    continue;
                                }
                                if (var537 == 5427) {
                                    var3 -= 2;
                                    class343.field5342 = class45.field564[var3];
                                    class251.field3685 = class45.field564[var3 + 1];
                                    continue;
                                }
                                if (var537 == 5428) {
                                    var3 -= 2;
                                    int var255 = class45.field564[var3 + 1];
                                    int var256 = class45.field564[var3];
                                    class45.field564[var3++] = class239.method1702(var256, var255, (byte) 117) ? 1 : 0;
                                    continue;
                                }
                            } else if (var537 < 5600) {
                                if (var537 == 5500) {
                                    var3 -= 4;
                                    int var223 = class45.field564[var3];
                                    int var224 = class45.field564[var3 + 1];
                                    int var225 = class45.field564[var3 + 2];
                                    int var226 = class45.field564[var3 + 3];
                                    class317.method2189(var225, ((var223 & 0xFFFFB19) >> 14) - class331.field4867, var226, var224, false, 0, (var223 & 0x3FFF) - class355.field5556);
                                    continue;
                                }
                                if (var537 == 5501) {
                                    var3 -= 4;
                                    int var227 = class45.field564[var3];
                                    int var228 = class45.field564[var3 + 1];
                                    int var229 = class45.field564[var3 + 2];
                                    int var230 = class45.field564[var3 + 3];
                                    class237.method1690(26379, var228, var229, ((var227 & 0xFFFF699) >> 14) - class331.field4867, (var227 & 0x3FFF) + -class355.field5556, var230);
                                    continue;
                                }
                                if (var537 == 5502) {
                                    var3 -= 6;
                                    int var231 = class45.field564[var3];
                                    if (var231 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class160.field2270 = var231;
                                    int var232 = class45.field564[var3 + 1];
                                    if (class138.field1897[class160.field2270].length >> 1 <= var232 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class245.field3589 = 0;
                                    class125.field1671 = var232;
                                    class333.field5166 = class45.field564[var3 + 2];
                                    class67.field866 = class45.field564[var3 + 3];
                                    int var233 = class45.field564[var3 + 4];
                                    if (var233 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class297.field4315 = var233;
                                    int var234 = class45.field564[var3 + 5];
                                    if (class138.field1897[class297.field4315].length >> 1 <= var234 + 1) {
                                        throw new RuntimeException();
                                    }
                                    client.field1631 = 3;
                                    class306.field4475 = var234;
                                    continue;
                                }
                                if (var537 == 5503) {
                                    class15.method108((byte) 103);
                                    continue;
                                }
                                if (var537 == 5504) {
                                    var3 -= 2;
                                    class96.method695(class45.field564[var3], (byte) 125, class45.field564[var3 + 1]);
                                    continue;
                                }
                                if (var537 == 5505) {
                                    class45.field564[var3++] = (int) class302.field4426;
                                    continue;
                                }
                                if (var537 == 5506) {
                                    class45.field564[var3++] = (int) class247.field3601;
                                    continue;
                                }
                                if (var537 == 5507) {
                                    class217.method1574(-16);
                                    continue;
                                }
                                if (var537 == 5508) {
                                    class307.method2147(51);
                                    continue;
                                }
                                if (var537 == 5509) {
                                    class319.method2203((byte) 122);
                                    continue;
                                }
                                if (var537 == 5510) {
                                    class354.method2464(arg1 ^ 0x3BF96204);
                                    continue;
                                }
                                if (var537 == 5512) {
                                    class289.method1986(true);
                                    continue;
                                }
                            } else if (var537 < 5700) {
                                if (var537 == 5600) {
                                    var5 -= 2;
                                    var3--;
                                    int var184 = class45.field564[var3];
                                    String var185 = class293.field4266[var5];
                                    String var186 = class293.field4266[var5 + 1];
                                    if (class316.field4661 == 10 && class261.field3778 == 0 && class217.field3067 == 0 && class318.field4688 == 0 && class280.field3982 == 0) {
                                        class83.method615(var186, var185, var184, (byte) 115);
                                    }
                                    continue;
                                }
                                if (var537 == 5601) {
                                    class299.method2086(-3);
                                    continue;
                                }
                                if (var537 == 5602) {
                                    if (class217.field3067 == 0) {
                                        class49.field654 = -2;
                                    }
                                    continue;
                                }
                                if (var537 == 5603) {
                                    var3 -= 4;
                                    if (class316.field4661 == 10 && class261.field3778 == 0 && class217.field3067 == 0 && class318.field4688 == 0 && class280.field3982 == 0) {
                                        class105.method746(false, class45.field564[var3 + 2], class45.field564[var3 + 3], class45.field564[var3 + 1], class45.field564[var3]);
                                    }
                                    continue;
                                }
                                if (var537 == 5604) {
                                    var5--;
                                    if (class316.field4661 == 10 && class261.field3778 == 0 && class217.field3067 == 0 && class318.field4688 == 0 && class280.field3982 == 0) {
                                        class289.method1988(19536, class201.method1476(-124, class293.field4266[var5]));
                                    }
                                    continue;
                                }
                                if (var537 == 5605) {
                                    var3 -= 7;
                                    var5 -= 3;
                                    if (class316.field4661 == 10 && class261.field3778 == 0 && class217.field3067 == 0 && class318.field4688 == 0 && class280.field3982 == 0) {
                                        class23.method154(class45.field564[var3 + 6] == 1, class45.field564[var3], class45.field564[var3 + 4] == 1, class45.field564[var3 + 3], class293.field4266[var5 + 2], class45.field564[var3 + 1], class45.field564[var3 + 2], (byte) 119, class201.method1476(-123, class293.field4266[var5]), class45.field564[var3 + 5] == 1, class293.field4266[var5 + 1]);
                                    }
                                    continue;
                                }
                                if (var537 == 5606) {
                                    if (class318.field4688 == 0) {
                                        class210.field2970 = -2;
                                    }
                                    continue;
                                }
                                if (var537 == 5607) {
                                    class45.field564[var3++] = class49.field654;
                                    continue;
                                }
                                if (var537 == 5608) {
                                    class45.field564[var3++] = class44.field549;
                                    continue;
                                }
                                if (var537 == 5609) {
                                    class45.field564[var3++] = class210.field2970;
                                    continue;
                                }
                                if (var537 == 5610) {
                                    for (int var187 = 0; var187 < 5; var187++) {
                                        class293.field4266[var5++] = class3.field31.length > var187 ? class296.method2028(class3.field31[var187], true) : "";
                                    }
                                    class3.field31 = null;
                                    continue;
                                }
                                if (var537 == 5611) {
                                    class45.field564[var3++] = class275.field3937;
                                    continue;
                                }
                            } else if (var537 < 6100) {
                                if (var537 == 6001) {
                                    var3--;
                                    int var188 = class45.field564[var3];
                                    if (var188 < 1) {
                                        var188 = 1;
                                    }
                                    if (var188 > 4) {
                                        var188 = 4;
                                    }
                                    class254.field3713 = var188;
                                    if (!class47.field623 || !class67.field856) {
                                        if (class254.field3713 == 1) {
                                            class350.method2422(0.9F);
                                        }
                                        if (class254.field3713 == 2) {
                                            class350.method2422(0.8F);
                                        }
                                        if (class254.field3713 == 3) {
                                            class350.method2422(0.7F);
                                        }
                                        if (class254.field3713 == 4) {
                                            class350.method2422(0.6F);
                                        }
                                    }
                                    if (class47.field623) {
                                        class96.method696((byte) -72);
                                        if (!class67.field856) {
                                            class219.method1591(25);
                                        }
                                    }
                                    class134.method1021(15575);
                                    class122.method879(arg1 - 1006224687, class157.field2216);
                                    class352.field5491 = false;
                                    continue;
                                }
                                if (var537 == 6002) {
                                    var3--;
                                    class286.method1949((byte) 56, class45.field564[var3] == 1);
                                    class194.method1406(-94);
                                    class219.method1591(25);
                                    class44.method312(125);
                                    class122.method879(-25299, class157.field2216);
                                    class352.field5491 = false;
                                    continue;
                                }
                                if (var537 == 6003) {
                                    var3--;
                                    class199.field2803 = class45.field564[var3] == 1;
                                    class44.method312(101);
                                    class122.method879(arg1 - 1006224687, class157.field2216);
                                    class352.field5491 = false;
                                    continue;
                                }
                                if (var537 == 6005) {
                                    var3--;
                                    class329.field4812 = class45.field564[var3] == 1;
                                    class219.method1591(25);
                                    class122.method879(arg1 - 1006224687, class157.field2216);
                                    class352.field5491 = false;
                                    continue;
                                }
                                if (var537 == 6006) {
                                    var3--;
                                    class27.field313 = class45.field564[var3] == 1;
                                    ((class138) class350.field5467).method1039(!class27.field313, 2047);
                                    class122.method879(-25299, class157.field2216);
                                    class352.field5491 = false;
                                    continue;
                                }
                                if (var537 == 6007) {
                                    var3--;
                                    class343.field5340 = class45.field564[var3] == 1;
                                    class122.method879(-25299, class157.field2216);
                                    class352.field5491 = false;
                                    continue;
                                }
                                if (var537 == 6008) {
                                    var3--;
                                    class80.field1017 = class45.field564[var3] == 1;
                                    class122.method879(arg1 ^ 0xC406FF71, class157.field2216);
                                    class352.field5491 = false;
                                    continue;
                                }
                                if (var537 == 6009) {
                                    var3--;
                                    class40.field506 = class45.field564[var3] == 1;
                                    class122.method879(arg1 ^ 0xC406FF71, class157.field2216);
                                    class352.field5491 = false;
                                    continue;
                                }
                                if (var537 == 6010) {
                                    var3--;
                                    class122.field1603 = class45.field564[var3] == 1;
                                    class122.method879(arg1 ^ 0xC406FF71, class157.field2216);
                                    class352.field5491 = false;
                                    continue;
                                }
                                if (var537 == 6011) {
                                    var3--;
                                    int var189 = class45.field564[var3];
                                    if (var189 < 0 || var189 > 2) {
                                        var189 = 0;
                                    }
                                    class89.field1119 = var189;
                                    class122.method879(-25299, class157.field2216);
                                    class352.field5491 = false;
                                    continue;
                                }
                                if (var537 == 6012) {
                                    if (class47.field623) {
                                        class255.method1781(0, 0, -74);
                                    }
                                    var3--;
                                    class67.field856 = class45.field564[var3] == 1;
                                    if (class47.field623 && class67.field856) {
                                        class350.method2422(0.7F);
                                    } else {
                                        if (class254.field3713 == 1) {
                                            class350.method2422(0.9F);
                                        }
                                        if (class254.field3713 == 2) {
                                            class350.method2422(0.8F);
                                        }
                                        if (class254.field3713 == 3) {
                                            class350.method2422(0.7F);
                                        }
                                        if (class254.field3713 == 4) {
                                            class350.method2422(0.6F);
                                        }
                                    }
                                    class219.method1591(25);
                                    class122.method879(-25299, class157.field2216);
                                    class352.field5491 = false;
                                    continue;
                                }
                                if (var537 == 6014) {
                                    var3--;
                                    class177.field2436 = class45.field564[var3] == 1;
                                    if (class47.field623) {
                                        class219.method1591(25);
                                    }
                                    class122.method879(-25299, class157.field2216);
                                    class352.field5491 = false;
                                    continue;
                                }
                                if (var537 == 6015) {
                                    var3--;
                                    class280.field3995 = class45.field564[var3] == 1;
                                    if (class47.field623) {
                                        class96.method696((byte) -72);
                                    }
                                    class122.method879(-25299, class157.field2216);
                                    class352.field5491 = false;
                                    continue;
                                }
                                if (var537 == 6016) {
                                    var3--;
                                    int var190 = class45.field564[var3];
                                    if (class47.field623) {
                                        class132.field1796 = true;
                                    }
                                    if (var190 < 0 || var190 > 2) {
                                        var190 = 0;
                                    }
                                    class24.field266 = var190;
                                    continue;
                                }
                                if (var537 == 6017) {
                                    var3--;
                                    class103.field1343 = class45.field564[var3] == 1;
                                    class134.method1022(23529);
                                    class122.method879(-25299, class157.field2216);
                                    class352.field5491 = false;
                                    continue;
                                }
                                if (var537 == 6018) {
                                    var3--;
                                    int var191 = class45.field564[var3];
                                    if (var191 < 0) {
                                        var191 = 0;
                                    }
                                    if (var191 > 127) {
                                        var191 = 127;
                                    }
                                    class75.field991 = var191;
                                    class122.method879(-25299, class157.field2216);
                                    class352.field5491 = false;
                                    continue;
                                }
                                if (var537 == 6019) {
                                    var3--;
                                    int var192 = class45.field564[var3];
                                    if (var192 < 0) {
                                        var192 = 0;
                                    }
                                    if (var192 > 255) {
                                        var192 = 255;
                                    }
                                    if (class101.field1319 != var192) {
                                        if (class101.field1319 == 0 && class84.field1082 != -1) {
                                            class144.method1124(var192, -20329, 0, class84.field1082, false, class305.field4459);
                                            class297.field4314 = false;
                                        } else if (var192 == 0) {
                                            class232.method1653(104);
                                            class297.field4314 = false;
                                        } else {
                                            class58.method435(var192, arg1 ^ 0xC4069DA3);
                                        }
                                        class101.field1319 = var192;
                                    }
                                    class122.method879(-25299, class157.field2216);
                                    class352.field5491 = false;
                                    continue;
                                }
                                if (var537 == 6020) {
                                    var3--;
                                    int var193 = class45.field564[var3];
                                    if (var193 < 0) {
                                        var193 = 0;
                                    }
                                    if (var193 > 127) {
                                        var193 = 127;
                                    }
                                    class204.field2843 = var193;
                                    class122.method879(-25299, class157.field2216);
                                    class352.field5491 = false;
                                    continue;
                                }
                                if (var537 == 6021) {
                                    var3--;
                                    class229.field3275 = class45.field564[var3] == 1;
                                    class44.method312(arg1 ^ 0x3BF96222);
                                    continue;
                                }
                                if (var537 == 6023) {
                                    boolean var194 = false;
                                    var3--;
                                    int var195 = class45.field564[var3];
                                    if (var195 < 0) {
                                        var195 = 0;
                                    }
                                    if (var195 > 2) {
                                        var195 = 2;
                                    }
                                    if (class255.field3734 < 96) {
                                        var195 = 0;
                                        var194 = true;
                                    }
                                    class187.method1359(var195);
                                    class122.method879(-25299, class157.field2216);
                                    class352.field5491 = false;
                                    class45.field564[var3++] = var194 ? 0 : 1;
                                    continue;
                                }
                                if (var537 == 6024) {
                                    var3--;
                                    int var196 = class45.field564[var3];
                                    if (var196 < 0 || var196 > 2) {
                                        var196 = 0;
                                    }
                                    class315.field4647 = var196;
                                    class122.method879(arg1 - 1006224687, class157.field2216);
                                    continue;
                                }
                                if (var537 == 6027) {
                                    var3--;
                                    int var197 = class45.field564[var3];
                                    if (!class47.field623) {
                                        continue;
                                    }
                                    if (var197 < 0 || var197 > 1) {
                                        var197 = 0;
                                    }
                                    class32.method199(var197 == 1, arg1 ^ 0x382A64C);
                                    continue;
                                }
                                if (var537 == 6028) {
                                    var3--;
                                    class139.field1917 = class45.field564[var3] != 0;
                                    class122.method879(-25299, class157.field2216);
                                    continue;
                                }
                            } else if (var537 < 6200) {
                                if (var537 == 6101) {
                                    class45.field564[var3++] = class254.field3713;
                                    continue;
                                }
                                if (var537 == 6102) {
                                    class45.field564[var3++] = class138.method1038(true) ? 1 : 0;
                                    continue;
                                }
                                if (var537 == 6103) {
                                    class45.field564[var3++] = class199.field2803 ? 1 : 0;
                                    continue;
                                }
                                if (var537 == 6105) {
                                    class45.field564[var3++] = class329.field4812 ? 1 : 0;
                                    continue;
                                }
                                if (var537 == 6106) {
                                    class45.field564[var3++] = class27.field313 ? 1 : 0;
                                    continue;
                                }
                                if (var537 == 6107) {
                                    class45.field564[var3++] = class343.field5340 ? 1 : 0;
                                    continue;
                                }
                                if (var537 == 6108) {
                                    class45.field564[var3++] = class80.field1017 ? 1 : 0;
                                    continue;
                                }
                                if (var537 == 6109) {
                                    class45.field564[var3++] = class40.field506 ? 1 : 0;
                                    continue;
                                }
                                if (var537 == 6110) {
                                    class45.field564[var3++] = class122.field1603 ? 1 : 0;
                                    continue;
                                }
                                if (var537 == 6111) {
                                    class45.field564[var3++] = class89.field1119;
                                    continue;
                                }
                                if (var537 == 6112) {
                                    class45.field564[var3++] = class67.field856 ? 1 : 0;
                                    continue;
                                }
                                if (var537 == 6114) {
                                    class45.field564[var3++] = class177.field2436 ? 1 : 0;
                                    continue;
                                }
                                if (var537 == 6115) {
                                    class45.field564[var3++] = class280.field3995 ? 1 : 0;
                                    continue;
                                }
                                if (var537 == 6116) {
                                    class45.field564[var3++] = class24.field266;
                                    continue;
                                }
                                if (var537 == 6117) {
                                    class45.field564[var3++] = class103.field1343 ? 1 : 0;
                                    continue;
                                }
                                if (var537 == 6118) {
                                    class45.field564[var3++] = class75.field991;
                                    continue;
                                }
                                if (var537 == 6119) {
                                    class45.field564[var3++] = class101.field1319;
                                    continue;
                                }
                                if (var537 == 6120) {
                                    class45.field564[var3++] = class204.field2843;
                                    continue;
                                }
                                if (var537 == 6121) {
                                    if (class47.field623) {
                                        class45.field564[var3++] = class47.field606 ? 1 : 0;
                                    } else {
                                        class45.field564[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var537 == 6123) {
                                    class45.field564[var3++] = class187.method1356();
                                    continue;
                                }
                                if (var537 == 6124) {
                                    class45.field564[var3++] = class315.field4647;
                                    continue;
                                }
                                if (var537 == 6126) {
                                    if (class47.field623) {
                                        class45.field564[var3++] = class46.method333() ? 1 : 0;
                                    } else {
                                        class45.field564[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var537 == 6127) {
                                    class45.field564[var3++] = class66.field849 ? 1 : 0;
                                    continue;
                                }
                                if (var537 == 6128) {
                                    class45.field564[var3++] = class139.field1917 ? 1 : 0;
                                    continue;
                                }
                            } else if (var537 < 6300) {
                                if (var537 == 6200) {
                                    var3 -= 2;
                                    class35.field433 = (short) class45.field564[var3];
                                    if (class35.field433 <= 0) {
                                        class35.field433 = 256;
                                    }
                                    class255.field3737 = (short) class45.field564[var3 + 1];
                                    if (class255.field3737 <= 0) {
                                        class255.field3737 = 205;
                                    }
                                    continue;
                                }
                                if (var537 == 6201) {
                                    var3 -= 2;
                                    class251.field3692 = (short) class45.field564[var3];
                                    if (class251.field3692 <= 0) {
                                        class251.field3692 = 256;
                                    }
                                    class180.field2466 = (short) class45.field564[var3 + 1];
                                    if (class180.field2466 <= 0) {
                                        class180.field2466 = 320;
                                    }
                                    continue;
                                }
                                if (var537 == 6202) {
                                    var3 -= 4;
                                    class237.field3425 = (short) class45.field564[var3];
                                    if (class237.field3425 <= 0) {
                                        class237.field3425 = 1;
                                    }
                                    class254.field3710 = (short) class45.field564[var3 + 1];
                                    if (class254.field3710 <= 0) {
                                        class254.field3710 = 32767;
                                    } else if (class237.field3425 > class254.field3710) {
                                        class254.field3710 = class237.field3425;
                                    }
                                    class101.field1320 = (short) class45.field564[var3 + 2];
                                    if (class101.field1320 <= 0) {
                                        class101.field1320 = 1;
                                    }
                                    class286.field4079 = (short) class45.field564[var3 + 3];
                                    if (class286.field4079 <= 0) {
                                        class286.field4079 = 32767;
                                    } else if (class101.field1320 > class286.field4079) {
                                        class286.field4079 = class101.field1320;
                                    }
                                    continue;
                                }
                                if (var537 == 6203) {
                                    class318.method2197(0, false, false, class344.field5351.field5172, 0, class344.field5351.field5056);
                                    class45.field564[var3++] = class30.field340;
                                    class45.field564[var3++] = class339.field5302;
                                    continue;
                                }
                                if (var537 == 6204) {
                                    class45.field564[var3++] = class251.field3692;
                                    class45.field564[var3++] = class180.field2466;
                                    continue;
                                }
                                if (var537 == 6205) {
                                    class45.field564[var3++] = class35.field433;
                                    class45.field564[var3++] = class255.field3737;
                                    continue;
                                }
                            } else if (var537 < 6400) {
                                if (var537 == 6300) {
                                    class45.field564[var3++] = (int) (class6.method37(10828) / 60000L);
                                    continue;
                                }
                                if (var537 == 6301) {
                                    class45.field564[var3++] = (int) (class6.method37(10828) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var537 == 6302) {
                                    var3 -= 3;
                                    int var198 = class45.field564[var3];
                                    int var199 = class45.field564[var3 + 2];
                                    int var200 = class45.field564[var3 + 1];
                                    class99.field1297.clear();
                                    class99.field1297.set(11, 12);
                                    class99.field1297.set(var199, var200, var198);
                                    class45.field564[var3++] = (int) (class99.field1297.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var537 == 6303) {
                                    class99.field1297.clear();
                                    class99.field1297.setTime(new Date(class6.method37(10828)));
                                    class45.field564[var3++] = class99.field1297.get(1);
                                    continue;
                                }
                                if (var537 == 6304) {
                                    var3--;
                                    int var201 = class45.field564[var3];
                                    boolean var202 = true;
                                    if (var201 < 0) {
                                        var202 = (var201 + 1) % 4 == 0;
                                    } else if (var201 < 1582) {
                                        var202 = var201 % 4 == 0;
                                    } else if ((var201 % 4) != 0) {
                                        var202 = false;
                                    } else if (var201 % 100 != 0) {
                                        var202 = true;
                                    } else if ((var201 % 400) != 0) {
                                        var202 = false;
                                    }
                                    class45.field564[var3++] = var202 ? 1 : 0;
                                    continue;
                                }
                            } else if (var537 < 6500) {
                                if (var537 == 6405) {
                                    class45.field564[var3++] = class240.method1705(4) ? 1 : 0;
                                    continue;
                                }
                                if (var537 == 6406) {
                                    class45.field564[var3++] = class339.method2362(4096) ? 1 : 0;
                                    continue;
                                }
                            } else if (var537 < 6600) {
                                if (var537 == 6500) {
                                    if (class316.field4661 == 10 && class261.field3778 == 0 && class217.field3067 == 0 && class318.field4688 == 0) {
                                        class45.field564[var3++] = class308.method2150(61) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class45.field564[var3++] = 1;
                                    continue;
                                }
                                if (var537 == 6501) {
                                    class196 var203 = class321.method2216(2);
                                    if (var203 == null) {
                                        class45.field564[var3++] = -1;
                                        class45.field564[var3++] = 0;
                                        class293.field4266[var5++] = "";
                                        class45.field564[var3++] = 0;
                                        class293.field4266[var5++] = "";
                                        class45.field564[var3++] = 0;
                                    } else {
                                        class45.field564[var3++] = var203.field2712;
                                        class45.field564[var3++] = var203.field1331;
                                        class293.field4266[var5++] = var203.field2706;
                                        class126 var204 = var203.method1416(true);
                                        class45.field564[var3++] = var204.field1682;
                                        class293.field4266[var5++] = var204.field1690;
                                        class45.field564[var3++] = var203.field1334;
                                    }
                                    continue;
                                }
                                if (var537 == 6502) {
                                    class196 var205 = class251.method1765(6);
                                    if (var205 == null) {
                                        class45.field564[var3++] = -1;
                                        class45.field564[var3++] = 0;
                                        class293.field4266[var5++] = "";
                                        class45.field564[var3++] = 0;
                                        class293.field4266[var5++] = "";
                                        class45.field564[var3++] = 0;
                                    } else {
                                        class45.field564[var3++] = var205.field2712;
                                        class45.field564[var3++] = var205.field1331;
                                        class293.field4266[var5++] = var205.field2706;
                                        class126 var206 = var205.method1416(true);
                                        class45.field564[var3++] = var206.field1682;
                                        class293.field4266[var5++] = var206.field1690;
                                        class45.field564[var3++] = var205.field1334;
                                    }
                                    continue;
                                }
                                if (var537 == 6503) {
                                    var3--;
                                    int var207 = class45.field564[var3];
                                    if (class316.field4661 == 10 && class261.field3778 == 0 && class217.field3067 == 0 && class318.field4688 == 0) {
                                        class45.field564[var3++] = class232.method1655((byte) 87, var207) ? 1 : 0;
                                        continue;
                                    }
                                    class45.field564[var3++] = 0;
                                    continue;
                                }
                                if (var537 == 6504) {
                                    var3--;
                                    class97.field1280 = class45.field564[var3];
                                    class122.method879(-25299, class157.field2216);
                                    continue;
                                }
                                if (var537 == 6505) {
                                    class45.field564[var3++] = class97.field1280;
                                    continue;
                                }
                                if (var537 == 6506) {
                                    var3--;
                                    int var208 = class45.field564[var3];
                                    class196 var209 = class357.method2478((byte) -24, var208);
                                    if (var209 == null) {
                                        class45.field564[var3++] = -1;
                                        class293.field4266[var5++] = "";
                                        class45.field564[var3++] = 0;
                                        class293.field4266[var5++] = "";
                                        class45.field564[var3++] = 0;
                                    } else {
                                        class45.field564[var3++] = var209.field1331;
                                        class293.field4266[var5++] = var209.field2706;
                                        class126 var210 = var209.method1416(true);
                                        class45.field564[var3++] = var210.field1682;
                                        class293.field4266[var5++] = var210.field1690;
                                        class45.field564[var3++] = var209.field1334;
                                    }
                                    continue;
                                }
                                if (var537 == 6507) {
                                    var3 -= 4;
                                    int var211 = class45.field564[var3];
                                    boolean var212 = class45.field564[var3 + 1] == 1;
                                    int var213 = class45.field564[var3 + 2];
                                    boolean var214 = class45.field564[var3 + 3] == 1;
                                    class33.method209(var212, 80, var211, var214, var213);
                                    continue;
                                }
                            } else if (var537 < 6700) {
                                if (var537 == 6600) {
                                    var3--;
                                    class48.field638 = class45.field564[var3] == 1;
                                    class122.method879(arg1 ^ 0xC406FF71, class157.field2216);
                                    continue;
                                }
                                if (var537 == 6601) {
                                    class45.field564[var3++] = class48.field638 ? 1 : 0;
                                    continue;
                                }
                            } else if (var537 < 6900) {
                                if (var537 == 6800) {
                                    var3--;
                                    int var215 = class45.field564[var3];
                                    class287 var216 = class282.method1924(true, var215);
                                    if (var216.field4136 == null) {
                                        class293.field4266[var5++] = "";
                                    } else {
                                        class293.field4266[var5++] = var216.field4136;
                                    }
                                    continue;
                                }
                                if (var537 == 6801) {
                                    var3--;
                                    int var217 = class45.field564[var3];
                                    class287 var218 = class282.method1924(true, var217);
                                    class45.field564[var3++] = var218.field4129;
                                    continue;
                                }
                                if (var537 == 6802) {
                                    var3--;
                                    int var219 = class45.field564[var3];
                                    class287 var220 = class282.method1924(true, var219);
                                    class45.field564[var3++] = var220.field4119;
                                    continue;
                                }
                                if (var537 == 6803) {
                                    var3--;
                                    int var221 = class45.field564[var3];
                                    class287 var222 = class282.method1924(true, var221);
                                    class45.field564[var3++] = var222.field4139;
                                    continue;
                                }
                            }
                        } else if (var537 == 4500) {
                            var3 -= 2;
                            int var304 = class45.field564[var3];
                            int var305 = class45.field564[var3 + 1];
                            class321 var306 = class89.method646(var305, (byte) -109);
                            if (var306.method2220(-121)) {
                                class293.field4266[var5++] = class302.method2114(arg1 - 1006195308, var304).method2132(var306.field4708, var305, (byte) -113);
                            } else {
                                class45.field564[var3++] = class302.method2114(class300.method2107(arg1, 1006202284), var304).method2128(var306.field4714, var305, class300.method2107(arg1, -1006182499));
                            }
                            continue;
                        }
                    } else if (var537 == 4400) {
                        var3 -= 2;
                        int var307 = class45.field564[var3];
                        int var308 = class45.field564[var3 + 1];
                        class321 var309 = class89.method646(var308, (byte) -55);
                        if (var309.method2220(121)) {
                            class293.field4266[var5++] = class345.method2392(var307, 0).method1603(var309.field4708, var308, -108);
                        } else {
                            class45.field564[var3++] = class345.method2392(var307, 0).method1587((byte) 75, var309.field4714, var308);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var536) {
            if (arg2.field227 == null) {
                if (class145.field2021 != 0) {
                    class88.method641("", 0, false, "Clientscript error - check log for details");
                }
                class347.method2409(var536, 3924, "CS2 - scr:" + arg2.field304 + " op:" + var8);
            } else {
                StringBuffer var533 = new StringBuffer(30);
                var533.append("%0a - in: ").append(arg2.field227);
                for (int var534 = class299.field4381 - 1; var534 >= 0; var534--) {
                    var533.append("%0a - via: ").append(class277.field3966[var534].field761.field227);
                }
                if (var8 == 40) {
                    int var535 = var7[var4];
                    var533.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var535));
                }
                if (class145.field2021 != 0) {
                    class88.method641("", 0, false, "Clientscript error in: " + arg2.field227);
                }
                class347.method2409(var536, 3924, "CS2 - scr:" + arg2.field304 + " op:" + var8 + var533.toString());
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Lrf;", line = 6613)
    public final class126 method1416(boolean arg0) {
        if (!arg0) {
            field2702 = (int[]) null;
        }
        field2710++;
        return class257.field3748[this.field1332];
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[F", line = 6630)
    public static final float[] method1417(int arg0, int arg1) {
        field2705++;
        float var2 = class41.method292() + class41.method295();
        int var3 = class41.method297();
        float var4 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        if (arg0 != -13316) {
            return (float[]) null;
        }
        float var5 = (float) (var3 & 0xFF) / 255.0F;
        class213.field3008[3] = 1.0F;
        float var6 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class213.field3008[0] = var2 * var4 * ((float) (class335.method2339(16740947, arg1) >> 16) / 255.0F) * var7;
        class213.field3008[2] = var5 * ((float) class335.method2339(255, arg1) / 255.0F) * var7 * var2;
        class213.field3008[1] = var6 * ((float) (class335.method2339(arg1, 65526) >> 8) / 255.0F) * var7 * var2;
        return class213.field3008;
    }
}
