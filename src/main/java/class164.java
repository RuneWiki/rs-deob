import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class164 extends class376 {

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public int field2320;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public int field2322;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public int field2326;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "Lpn;")
    public class523 field2332;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "Lclient;")
    public static client field2319;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "Ljava/lang/String;")
    public String field2328;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "[I")
    public int[] field2318;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "[I")
    public int[] field2321;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "[Lib;")
    public class106[] field2330;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field2323;

    static {
        new class331("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field2325 = -1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILt;IIILya;IIIIIZLlp;I)Lt;", line = 4)
    public static final class471 method1161(int arg0, int arg1, class471 arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, class267 arg13, int arg14) {
        field2331++;
        if (arg2 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg13 != null) {
            int var16 = var15 | arg13.method1717(arg11, 256, -1, false);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg3 << 32) + ((long) arg5 << 48) + (long) ((arg14 << 24) + (arg9 - -(arg7 << 16)));
        class156 var19 = class158.field2240;
        class471 var20;
        synchronized (class158.field2240) {
            var20 = (class471) class158.field2240.method1115(var17, (byte) 58);
        }
        if (arg8 < 98) {
            return null;
        }
        if (var20 == null || arg6.method335(var20.method459(), var15) != 0) {
            if (var20 != null) {
                var15 = arg6.method351(var15, var20.method459());
            }
            byte var21;
            if (arg9 == 1) {
                var21 = 9;
            } else if (arg9 == 2) {
                var21 = 12;
            } else if (arg9 == 3) {
                var21 = 15;
            } else if (arg9 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class353 var24 = new class353((var21 * var22) + 1, var21 * var22 * 2 + -var21, 0);
            int var25 = var24.method2123(0, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class340.field4724[var31] * var28 >> 15;
                    int var33 = class340.field4715[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method2123(var33, 0, var32, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg7 * var36 + arg14 * var35 >> 8);
                short var38 = (short) (((arg3 & 0x7F) * var36 + (arg5 & 0x7F) * var35 & 0x7F00) + ((arg3 & 0xFC00) * var36 + (arg5 & 0xFC00) * var35 & 0xFC0000) + ((arg3 & 0x380) * var36 + (arg5 & 0x380) * var35 & 0x38000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method2130(var26[0][var39], (short) -1, (byte) -1, var25, -124, var26[0][(var39 + 1) % var21], var38, (byte) 1, var37);
                    } else {
                        var24.method2130(var26[var34][(var39 + 1) % var21], (short) -1, (byte) -1, var26[var34 - 1][var39], -126, var26[var34 - 1][(var39 + 1) % var21], var38, (byte) 1, var37);
                        var24.method2130(var26[var34][var39], (short) -1, (byte) -1, var26[var34 - 1][var39], -120, var26[var34][(var39 + 1) % var21], var38, (byte) 1, var37);
                    }
                }
            }
            var20 = arg6.method314(var24, var15, class396.field5817, 64, 768);
            class156 var40 = class158.field2240;
            synchronized (class158.field2240) {
                class158.field2240.method1107(1, var17, var20);
            }
        }
        int var41 = (arg9 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg12) {
            if (arg10 > 1024 && arg10 < 7168) {
                var42 -= 128;
            }
            if (arg10 > 13312 || arg10 < 3072) {
                var43 -= 128;
            }
            if (arg10 > 9216 && arg10 < 15360) {
                var44 = var41 + 128;
            }
            if (arg10 > 5120 && arg10 < 11264) {
                var45 = var41 + 128;
            }
        }
        int var46 = arg2.method456();
        int var47 = arg2.method450();
        int var48 = arg2.method453();
        if (var43 > var48) {
            var48 = var43;
        }
        if (var47 > var44) {
            var47 = var44;
        }
        if (var42 > var46) {
            var46 = var42;
        }
        int var49 = arg2.method433();
        if (var49 > var45) {
            var49 = var45;
        }
        class367 var50 = null;
        if (arg13 != null) {
            int var51 = arg13.field3919[arg11];
            var50 = class153.field2169.method1579(var51 >> 16, 1);
            arg11 = var51 & 0xFFFF;
        }
        class471 var52;
        if (var50 == null) {
            var52 = var20.method458((byte) 3, var15, true);
            var52.method462(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method446(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method458((byte) 3, var15, true);
            var52.method462(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method446(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method2852(-5561, arg11, var50);
        }
        if (arg1 != 0) {
            var52.method447(arg1);
        }
        if (arg0 != 0) {
            var52.method455(arg0);
        }
        if (arg4 != 0) {
            var52.method446(0, arg4, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLsd;IIIIII[IIZ[IIII)I", line = 221)
    public static final int method1162(byte arg0, class62 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, boolean arg10, int[] arg11, int arg12, int arg13, int arg14) {
        field2327++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class106.field1467[var15][var35] = 0;
                class445.field6584[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg6 == 1) {
            var16 = class81.method736(arg4, arg7, arg14, -1, arg3, arg1, arg5, arg9, arg13, arg12, arg2);
        } else if (arg6 == 2) {
            var16 = class75.method710((byte) -117, arg14, arg1, arg7, arg4, arg13, arg2, arg5, arg12, arg3, arg9);
        } else {
            var16 = class500.method2995(-1, arg3, arg13, arg7, arg2, arg1, arg5, arg12, arg4, arg6, arg9, arg14);
        }
        int var17 = arg2 - 64;
        int var18 = arg12 - 64;
        int var19 = class370.field5493;
        int var20 = class474.field6988;
        if (!var16) {
            if (!arg10) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg3 - var23; var24 <= arg3 + var23; var24++) {
                for (int var25 = arg5 - var23; var25 <= (arg5 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class445.field6584[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg3) {
                            var28 = arg3 - var24;
                        } else if (var24 > (arg4 + arg3 - 1)) {
                            var28 = var24 + 1 - arg3 - arg4;
                        }
                        int var29 = 0;
                        if (arg5 > var25) {
                            var29 = arg5 - var25;
                        } else if (var25 > arg13 + arg5 - 1) {
                            var29 = 1 - (arg5 + arg13 - var25);
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var21 > var30 || var21 == var30 && var22 > class445.field6584[var26][var27]) {
                            var22 = class445.field6584[var26][var27];
                            var19 = var24;
                            var21 = var30;
                            var20 = var25;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg2 == var19 && arg12 == var20) {
            return 0;
        }
        byte var31 = 0;
        class424.field6262[var31] = var19;
        int var37 = var31 + 1;
        class342.field4737[var31] = var20;
        if (arg0 > -44) {
            method1164(-79, 34);
        }
        int var32;
        int var33 = var32 = class106.field1467[var19 - var17][var20 - var18];
        while (arg2 != var19 || arg12 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class424.field6262[var37] = var19;
                class342.field4737[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class106.field1467[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg11[var34] = class424.field6262[var37];
            arg8[var34++] = class342.field4737[var37];
            if (var34 >= arg11.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(B)V", line = 404)
    public static void method1163(byte arg0) {
        int var1 = 25 / ((arg0 + 49) / 57);
        field2319 = null;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V", line = 423)
    public static final void method1164(int arg0, int arg1) {
        field2329++;
        class380.field5614 = arg0;
        if (arg1 != 268) {
            field2319 = null;
        }
        class93.field1272.method1105(false);
    }
}
