import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class115 {

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "Lwea;")
    public static class115 field1598 = new class115();

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "Lwea;")
    public static class115 field1600 = new class115();

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "Lwea;")
    public static class115 field1601 = new class115();

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "Lwea;")
    public static class115 field1602 = new class115();

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "F")
    public static float field1603 = 1.0F;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)I", line = 5)
    public static final int method817(int arg0) {
        if (arg0 != 127) {
            field1602 = null;
        }
        field1599++;
        return class703.field9912.method1421((byte) -65);
    }

    @OriginalMember(owner = "client!wea", name = "toString", descriptor = "()Ljava/lang/String;", line = 17)
    public final String toString() {
        field1597++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V", line = 31)
    public static final void method818(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class511.field7403 = true;
        class431.field6192 = class391.field5644.method270() > 0;
        class265.field3796 = arg15;
        class613.field8757 = arg1 >> class639.field9095;
        class140.field1915 = arg3 >> class639.field9095;
        class647.field9329 = arg1;
        class692.field9807 = arg3;
        class271.field3847 = arg2;
        class740.field10333 = class613.field8757 - class430.field6190;
        if (class740.field10333 < 0) {
            class579.field8293 = -class740.field10333;
            class740.field10333 = 0;
        } else {
            class579.field8293 = 0;
        }
        class753.field10506 = class140.field1915 - class430.field6190;
        if (class753.field10506 < 0) {
            class227.field3390 = -class753.field10506;
            class753.field10506 = 0;
        } else {
            class227.field3390 = 0;
        }
        class678.field9622 = class613.field8757 + class430.field6190;
        if (class678.field9622 > class439.field6264) {
            class678.field9622 = class439.field6264;
        }
        class187.field2631 = class430.field6190 + class140.field1915;
        if (class187.field2631 > class408.field5806) {
            class187.field2631 = class408.field5806;
        }
        boolean[][] var19 = class437.field6237;
        boolean[][] var20 = class402.field5754;
        if (class265.field3796) {
            for (int var21 = 0; var21 < class430.field6190 + class430.field6190 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class430.field6190 + class430.field6190 + 2; var24++) {
                    if (var24 > 1) {
                        class624.field8879[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class613.field8757 + var21 - class430.field6190;
                    int var26 = class140.field1915 + var24 - class430.field6190;
                    if (var25 >= 0 && var26 >= 0 && var25 < class439.field6264 && var26 < class408.field5806) {
                        int var27 = var25 << class639.field9095;
                        int var28 = var26 << class639.field9095;
                        int var29 = class491.field7079[class491.field7079.length - 1].method2087(46, var25, var26) - (0x3E8 << class639.field9095 - 7);
                        int var30 = class25.field221 == null ? class491.field7079[0].method2087(108, var25, var26) + class150.field2190 : class25.field221[0].method2087(118, var25, var26) + class150.field2190;
                        var23 = arg16 >= 0 ? class391.field5644.method324(var27, var29, var28, var27, var30, var28, arg16) : class391.field5644.method228(var27, var29, var28, var27, var30, var28);
                        class402.field5754[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class402.field5754[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class624.field8879[var24 - 1] & class624.field8879[var24] & var22 & var23;
                        class437.field6237[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class624.field8879[class430.field6190 + class430.field6190] = var22;
                class624.field8879[class430.field6190 + class430.field6190 + 1] = var23;
            }
            if (arg16 >= 0) {
                class511.field7403 = false;
            } else {
                class140.field1911 = arg5;
                class224.field3309 = arg6;
                class126.field1747 = arg7;
                class398.field5699 = arg8;
                class674.field9595 = arg9;
                class573.method3408(73, arg10, class391.field5644);
            }
        } else {
            if (class440.field6275 == null) {
                class440.field6275 = new boolean[class439.field6264 + class439.field6264 + 1][class439.field6264 + class408.field5806 + 1];
            }
            for (int var32 = 0; var32 < class440.field6275.length; var32++) {
                for (int var42 = 0; var42 < class440.field6275[0].length; var42++) {
                    class440.field6275[var32][var42] = true;
                }
            }
            class402.field5754 = class440.field6275;
            class437.field6237 = class440.field6275;
            class740.field10333 = 0;
            class753.field10506 = 0;
            class678.field9622 = class439.field6264;
            class187.field2631 = class408.field5806;
            class511.field7403 = false;
        }
        class136.method971((byte) 45, class391.field5644);
        if (!class465.field6628.field9629) {
            class215 var33 = class465.field6628.field9626;
            for (class603 var34 = (class603) var33.method1527(93); var34 != null; var34 = (class603) var33.method1523(true)) {
                var34.method814(98);
                class111.method809(var34, true);
            }
        }
        if (class431.field6192) {
            for (int var35 = 0; var35 < class5.field56; var35++) {
                class62.field1000[var35].method1322(arg0, -119, arg14);
            }
        }
        if (class564.field8170) {
            class434.field6218 = class391.field5644.method247();
            class391.field5644.method358(class196.field2861);
            int var36 = (class196.field2861[2] - class196.field2861[0]) / class143.field1943;
            for (int var37 = 0; var37 < class143.field1943 - 1; var37++) {
                class62.field999[var37] = (var37 + 1) * var36 + class451.field6454[var37];
            }
            for (int var38 = 0; var38 < class186.field2604.length; var38++) {
                class186.field2604[var38].method829();
            }
        }
        if (class643.field9177 != null) {
            if (class564.field8170) {
                class135.method967(0);
            }
            class496.method3016(true);
            class391.field5644.method209(-1, 1583160, 40, 127);
            class418.method2541(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class564.field8170) {
                class744.method4142();
            }
            class391.field5644.method204();
            class496.method3016(false);
        }
        class418.method2541(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class564.field8170) {
            for (int var39 = 0; var39 < class433.field6202; var39++) {
                class174.field2449[var39] = class35.field315[var39];
            }
            class135.method967(0);
            for (int var40 = 0; var40 < class186.field2604.length; var40++) {
                class186.field2604[var40].method829();
            }
        }
        if (class564.field8170) {
            class744.method4142();
            for (int var41 = 0; var41 < class433.field6202; var41++) {
                class35.field315[var41] = class174.field2449[var41];
            }
            if (class482.field6920 == 2) {
                int var10002;
                if (class453.field6474[0] < class453.field6474[1]) {
                    if (class62.field999[0] + class451.field6454[0] > class196.field2861[0]) {
                        var10002 = class451.field6454[0]++;
                    }
                } else if (class453.field6474[0] > class453.field6474[1] && class62.field999[0] + class451.field6454[0] < class196.field2861[2]) {
                    var10002 = class451.field6454[0]--;
                }
            }
        }
        if (!class265.field3796) {
            class437.field6237 = var19;
            class402.field5754 = var20;
        }
        class430.method2655();
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)V", line = 310)
    public static void method819(byte arg0) {
        field1598 = null;
        field1601 = null;
        field1600 = null;
        field1602 = null;
        int var1 = 4 / ((87 - arg0) / 32);
    }
}
