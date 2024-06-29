import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class40 {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Lec;")
    public static class99 field586 = new class99(64);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILf;III)V", line = 15)
    public static final void method304(int arg0, int arg1, int arg2, class345 arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        boolean var8 = false;
        boolean var9 = false;
        long var10 = 0L;
        field585++;
        if (arg5 == 0) {
            var10 = class205.method1478(arg2, arg0, arg1);
        } else if (arg5 == 1) {
            var10 = class319.method2217(arg2, arg0, arg1);
        } else if (arg5 == 2) {
            var10 = class99.method745(arg2, arg0, arg1);
        } else if (arg5 == 3) {
            var10 = class8.method77(arg2, arg0, arg1);
        }
        int var12 = ((int) var10 & 0x3A9E39) >> 20;
        int var13 = (int) (var10 >>> 32) & Integer.MAX_VALUE;
        class32 var14 = class226.method1607(-119, var13);
        if (var14.method255((byte) 87)) {
            class322.method2231(var14, (byte) -112, arg0, arg2, arg1);
        }
        if (arg4 != 1) {
            field586 = (class99) null;
        }
        int var15 = ((int) var10 & 0x7E9C8) >> 14;
        if (var10 == 0L) {
            return;
        }
        class110 var16 = null;
        class110 var17 = null;
        if (arg5 == 0) {
            class35 var18 = class205.method1476(arg2, arg0, arg1);
            if (var18 != null) {
                var16 = var18.field511;
                var17 = var18.field508;
            }
            if (var14.field466 != 0) {
                arg3.method2388((byte) -127, var12, arg1, arg0, var14.field405, var15, !var14.field437);
            }
        } else if (arg5 == 1) {
            class158 var19 = class12.method97(arg2, arg0, arg1);
            if (var19 != null) {
                var17 = var19.field2398;
                var16 = var19.field2402;
            }
        } else if (arg5 == 2) {
            class228 var20 = class149.method1121(arg2, arg0, arg1);
            if (var20 != null) {
                var16 = var20.field3480;
            }
            if (var14.field466 != 0 && (arg0 + var14.field416) < 104 && (var14.field416 + arg1) < 104 && (arg0 + var14.field413) < 104 && (var14.field413 + arg1) < 104) {
                arg3.method2391(!var14.field437, arg0, arg1, var12, arg4 ^ 0x10001, var14.field416, var14.field413, var14.field405);
            }
        } else if (arg5 == 3) {
            class341 var21 = class219.method1564(arg2, arg0, arg1);
            if (var21 != null) {
                var16 = var21.field5305;
            }
            if (var14.field466 == 1) {
                arg3.method2384(arg0, arg1, 2);
            }
        }
        if (var14.field450 != null) {
            var14 = var14.method247(arg4 - 2);
        }
        if (!class73.field1058 || var14 == null || !var14.field402) {
            return;
        }
        if (var15 == 2) {
            if ((var16 instanceof class264)) {
                ((class264) var16).method1852(true);
            } else {
                class21.method169((byte) 30, arg0, 0, arg6, var15, var14, 0, var12 + 4, arg1);
            }
            if (var17 instanceof class264) {
                ((class264) var17).method1852(true);
            } else {
                class21.method169((byte) 30, arg0, 0, arg6, var15, var14, 0, var12 + 1 & 0x3, arg1);
            }
        } else if (var15 == 5) {
            if ((var16 instanceof class264)) {
                ((class264) var16).method1852(true);
            } else {
                class21.method169((byte) 30, arg0, class207.field3180[var12] * 8, arg6, 4, var14, class218.field3341[var12] * 8, var12, arg1);
            }
        } else if (var15 == 6) {
            if ((var16 instanceof class264)) {
                ((class264) var16).method1852(true);
            } else {
                class21.method169((byte) 30, arg0, class170.field2745[var12] * 8, arg6, 4, var14, class174.field2797[var12] * 8, var12 + 4, arg1);
            }
        } else if (var15 == 7) {
            if (var16 instanceof class264) {
                ((class264) var16).method1852(true);
            } else {
                class21.method169((byte) 30, arg0, 0, arg6, 4, var14, 0, (var12 + 2 & 0x3) + 4, arg1);
            }
        } else if (var15 == 8) {
            if (var16 instanceof class264) {
                ((class264) var16).method1852(true);
            } else {
                class21.method169((byte) 30, arg0, class170.field2745[var12] * 8, arg6, 4, var14, class174.field2797[var12] * 8, var12 + 4, arg1);
            }
            if ((var17 instanceof class264)) {
                ((class264) var17).method1852(true);
            } else {
                class21.method169((byte) 30, arg0, class170.field2745[var12] * 8, arg6, 4, var14, class174.field2797[var12] * 8, (var12 + 2 & 0x3) + 4, arg1);
            }
        } else if (var15 == 11) {
            if (var16 instanceof class264) {
                ((class264) var16).method1852(true);
            } else {
                class21.method169((byte) 30, arg0, 0, arg6, 10, var14, 0, var12 + 4, arg1);
            }
        } else if (var16 instanceof class264) {
            ((class264) var16).method1852(true);
        } else {
            class21.method169((byte) 30, arg0, 0, arg6, var15, var14, 0, var12, arg1);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILmn;)I", line = 207)
    public static final int method305(int arg0, int arg1, class161 arg2) {
        field588++;
        if (arg2.field2511 == null || arg1 >= arg2.field2511.length) {
            return -2;
        }
        try {
            if (arg0 != -1) {
                method309(122, true);
            }
            int[] var3 = arg2.field2511[arg1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class222.field3384[var3[var5++]];
                }
                if (var7 == 2) {
                    var8 = class293.field4524[var3[var5++]];
                }
                if (var7 == 3) {
                    var8 = class231.field3529[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class161 var12 = class331.method2308((byte) 68, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class222.method1576(var13, (byte) 92).field1575 || class205.field3152)) {
                        for (int var14 = 0; var14 < var12.field2487.length; var14++) {
                            if ((var13 + 1) == var12.field2487[var14]) {
                                var8 += var12.field2480[var14];
                            }
                        }
                    }
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 5) {
                    var8 = class154.field2330[var3[var5++]];
                }
                if (var7 == 6) {
                    var8 = class102.field1472[class293.field4524[var3[var5++]] - 1];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 7) {
                    var8 = class154.field2330[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 8) {
                    var8 = class39.field575.field4203;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class242.field3688[var15]) {
                            var8 += class293.field4524[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class161 var18 = class331.method2308((byte) 21, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class222.method1576(var19, (byte) 92).field1575 || class205.field3152)) {
                        for (int var20 = 0; var20 < var18.field2487.length; var20++) {
                            if (var19 + 1 == var18.field2487[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class1.field9;
                }
                if (var7 == 12) {
                    var8 = class335.field5203;
                }
                if (var7 == 13) {
                    int var21 = class154.field2330[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class222.method1580(var23, (byte) 75);
                }
                if (var7 == 18) {
                    var8 = (class39.field575.field4713 >> 7) + class327.field5054;
                }
                if (var7 == 19) {
                    var8 = (class39.field575.field4731 >> 7) + class293.field4522;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V", line = 418)
    public static final void method306(int arg0, int arg1) {
        class242.field3684 = new int[arg1];
        class27.field294 = new int[arg1];
        if (arg0 != -25584) {
            method308(-124);
        }
        class300.field4618 = new int[arg1];
        class201.field3097 = new int[arg1];
        class13.field174 = new int[arg1];
        field587++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V", line = 436)
    public static final void method307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg4; var6 <= arg1 + arg4; var6++) {
            for (int var7 = arg3; var7 <= (arg3 + arg2); var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class13.field179[arg0][var7][var6] = 127;
                }
            }
        }
        if (arg5 != 104) {
            field586 = (class99) null;
        }
        for (int var8 = arg4; var8 < arg1 + arg4; var8++) {
            for (int var9 = arg3; var9 < (arg2 + arg3); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class203.field3111[arg0][var9][var8] = arg0 <= 0 ? 0 : class203.field3111[arg0 - 1][var9][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var10 = arg4 + 1; var10 < (arg1 + arg4); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class203.field3111[arg0][arg3][var10] = class203.field3111[arg0][arg3 - 1][var10];
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var11 = arg3 + 1; var11 < (arg2 + arg3); var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class203.field3111[arg0][var11][arg4] = class203.field3111[arg0][var11][arg4 - 1];
                }
            }
        }
        if (arg3 >= 0 && arg4 >= 0 && arg3 < 104 && arg4 < 104) {
            if (arg0 == 0) {
                if (arg3 > 0 && class203.field3111[arg0][arg3 - 1][arg4] != 0) {
                    class203.field3111[arg0][arg3][arg4] = class203.field3111[arg0][arg3 - 1][arg4];
                } else if (arg4 > 0 && class203.field3111[arg0][arg3][arg4 - 1] != 0) {
                    class203.field3111[arg0][arg3][arg4] = class203.field3111[arg0][arg3][arg4 - 1];
                } else if (arg3 > 0 && arg4 > 0 && class203.field3111[arg0][arg3 - 1][arg4 - 1] != 0) {
                    class203.field3111[arg0][arg3][arg4] = class203.field3111[arg0][arg3 - 1][arg4 - 1];
                }
            } else if (arg3 > 0 && class203.field3111[arg0 - 1][arg3 - 1][arg4] != class203.field3111[arg0][arg3 - 1][arg4]) {
                class203.field3111[arg0][arg3][arg4] = class203.field3111[arg0][arg3 - 1][arg4];
            } else if (arg4 > 0 && class203.field3111[arg0 - 1][arg3][arg4 - 1] != class203.field3111[arg0][arg3][arg4 - 1]) {
                class203.field3111[arg0][arg3][arg4] = class203.field3111[arg0][arg3][arg4 - 1];
            } else if (arg3 > 0 && arg4 > 0 && class203.field3111[arg0 - 1][arg3 - 1][arg4 - 1] != class203.field3111[arg0][arg3 - 1][arg4 - 1]) {
                class203.field3111[arg0][arg3][arg4] = class203.field3111[arg0][arg3 - 1][arg4 - 1];
            }
        }
        field590++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 553)
    public static void method308(int arg0) {
        field586 = null;
        if (arg0 >= -5) {
            field586 = (class99) null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)V", line = 568)
    public static final void method309(int arg0, boolean arg1) {
        field589++;
        byte var2;
        byte[][] var3;
        if (class73.field1058 && arg1) {
            var2 = 1;
            var3 = class322.field4963;
        } else {
            var3 = class299.field4605;
            var2 = 4;
        }
        if (arg0 != -16702) {
            method304(79, -19, 14, (class345) null, -22, -2, -128);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class293.method2025((byte) 67);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class262.field4040[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x341D886) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = var7 >> 3 & 0x7FF;
                            int var11 = var7 >> 14 & 0x3FF;
                            int var12 = (var11 / 8 << 8) + var10 / 8;
                            for (int var13 = 0; var13 < class139.field2087.length; var13++) {
                                if (class139.field2087[var13] == var12 && var3[var13] != null) {
                                    class31.method236((byte) 71, var5 * 8, var4, var6 * 8, arg1, (var11 & 0x7) * 8, var3[var13], class91.field1323, var9, (var10 & 0x7) * 8, var8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
