import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class260 {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Ldj;")
    public static class304 field3789 = new class304(0, -1);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lii;IILvj;III[[[B[I[I[I[I[IIBIIZ)V", line = 7)
    public static final void method1796(class405 arg0, int arg1, int arg2, class177 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class296.field4257 = arg0;
        class264.field3834 = arg1;
        class254.field3530 = arg3;
        class125.field1750 = class296.field4257.method1709() > 0;
        class104.field1491 = arg4 >> 7;
        class428.field6302 = arg6 >> 7;
        class422.field6230 = arg4;
        class432.field6360 = arg6;
        class281.field4095 = arg5;
        class34.field476 = class104.field1491 - class264.field3838;
        if (class34.field476 < 0) {
            class444.field6505 = -class34.field476;
            class34.field476 = 0;
        } else {
            class444.field6505 = 0;
        }
        class310.field4561 = class428.field6302 - class264.field3838;
        if (class310.field4561 < 0) {
            class372.field5418 = -class310.field4561;
            class310.field4561 = 0;
        } else {
            class372.field5418 = 0;
        }
        class63.field849 = class264.field3838 + class104.field1491;
        if (class63.field849 > class104.field1436) {
            class63.field849 = class104.field1436;
        }
        class5.field65 = class428.field6302 + class264.field3838;
        if (class5.field65 > class214.field2858) {
            class5.field65 = class214.field2858;
        }
        for (int var18 = 0; var18 < class264.field3838 + class264.field3838 + 2; var18++) {
            for (int var23 = 0; var23 < class264.field3838 + class264.field3838 + 2; var23++) {
                int var24 = class104.field1491 + var18 - class264.field3838;
                int var25 = class428.field6302 + var23 - class264.field3838;
                if (var24 >= 0 && var25 >= 0 && var24 < class104.field1436 && var25 < class214.field2858) {
                    int var26 = var24 << 7;
                    int var27 = var25 << 7;
                    int var28 = class265.field3846[3].method742(var24, var25) - 1000;
                    int var29 = class191.field2557 == null ? class265.field3846[0].method742(var24, var25) + 128 : class191.field2557[0].method742(var24, var25) + 128;
                    class5.field67[var18][var23] = class296.field4257.method1781(var26, var28, var27, var26, var29, var27);
                } else {
                    class5.field67[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class264.field3838 + class264.field3838 + 1; var19++) {
            for (int var22 = 0; var22 < class264.field3838 + class264.field3838 + 1; var22++) {
                class211.field2799[var19][var22] = class5.field67[var19][var22] || class5.field67[var19 + 1][var22] || class5.field67[var19][var22 + 1] || class5.field67[var19 + 1][var22 + 1];
            }
        }
        class367.field5306 = arg8;
        class442.field6474 = arg9;
        class424.field6251 = arg10;
        class122.field1688 = arg11;
        class438.field6416 = arg12;
        class278.method1931();
        class73.method539((byte) -128);
        for (class382 var20 = (class382) class385.field5587.method1005(124); var20 != null; var20 = (class382) class385.field5587.method1009(false)) {
            var20.method686(125);
            class51.method357(var20, -13504);
        }
        if (class125.field1750) {
            for (int var21 = 0; var21 < class339.field4888; var21++) {
                class75.field1078[var21].method1318(arg17, arg1, -1922);
            }
        }
        if (arg2 > 1) {
            class296.field4257.method1727(0);
            if (class328.field4782 == null || class328.field4782 instanceof class319) {
                class328.field4782 = new class143();
            }
        } else if (class328.field4782 == null || class328.field4782 instanceof class143) {
            class328.field4782 = new class319();
        }
        class328.field4782.method552((byte) -108, arg2);
        class328.field4782.method558((byte) -48);
        if (class99.field1387 != null) {
            class78.method566(true);
            class328.field4782.method562((byte) -54, 22);
            class288.method1968(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class328.field4782.method558((byte) -41);
            class328.field4782.method562((byte) -54, 23);
            class78.method566(false);
        }
        class288.method1968(arg2, arg7, arg13, arg14, arg15, arg16);
        class328.field4782.method558((byte) -74);
        class328.field4782.method556((byte) 118);
        class328.field4782.method558((byte) -109);
        if (arg2 > 1) {
            class296.field4257.method1649(0);
        }
        class296.field4257.method1626(0, (class367[]) null);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIIZIIILba;[IIIIII)I", line = 162)
    public static final int method1797(int[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, class270 arg8, int[] arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field3788++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class264.field3830[var15][var35] = 0;
                class100.field1404[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg5 == 1) {
            var16 = class265.method1818(arg11, arg1, arg6, arg12, arg14, arg3, arg13, arg7, 303, arg8, arg2);
        } else if (arg5 == 2) {
            var16 = class419.method2680(arg12, arg11, arg1, arg13, -116, arg2, arg14, arg8, arg7, arg3, arg6);
        } else {
            var16 = class259.method1795(arg5, arg6, (byte) 95, arg13, arg11, arg3, arg8, arg14, arg7, arg2, arg12, arg1);
        }
        int var17 = arg7 - 64;
        int var18 = arg14 - 64;
        int var19 = class148.field2036;
        if (arg10 < 117) {
            method1796((class405) null, -15, 125, (class177) null, -20, -89, 57, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -74, (byte) -32, 93, -103, false);
        }
        int var20 = class253.field3499;
        if (!var16) {
            if (!arg4) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg13 - var23; var24 <= (arg13 + var23); var24++) {
                for (int var25 = arg2 - var23; var25 <= (arg2 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class100.field1404[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg13) {
                            var28 = arg13 - var24;
                        } else if (var24 > (arg13 - (1 - arg6))) {
                            var28 = -arg6 - arg13 - (-1 - var24);
                        }
                        int var29 = 0;
                        if (var25 < arg2) {
                            var29 = arg2 - var25;
                        } else if (arg1 + arg2 - 1 < var25) {
                            var29 = var25 - arg1 - (arg2 + -1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && var22 > class100.field1404[var26][var27]) {
                            var21 = var30;
                            var22 = class100.field1404[var26][var27];
                            var19 = var24;
                            var20 = var25;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg7 == var19 && arg14 == var20) {
            return 0;
        }
        byte var31 = 0;
        class295.field4231[var31] = var19;
        int var37 = var31 + 1;
        class173.field2306[var31] = var20;
        int var32;
        int var33 = var32 = class264.field3830[var19 - var17][var20 - var18];
        while (arg7 != var19 || arg14 != var20) {
            if (var32 != var33) {
                class295.field4231[var37] = var19;
                var32 = var33;
                class173.field2306[var37++] = var20;
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
            var33 = class264.field3830[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg9[var34] = class295.field4231[var37];
            arg0[var34++] = class173.field2306[var37];
            if (var34 >= arg9.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 337)
    public static void method1798(int arg0) {
        field3789 = null;
        if (arg0 != 7395) {
            method1797((int[]) null, -71, -84, 106, true, -124, 43, 125, (class270) null, (int[]) null, 93, 6, -53, -73, -98);
        }
    }
}
