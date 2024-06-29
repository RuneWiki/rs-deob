import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class125 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Loa;")
    public static class98 field2781 = class38.method349(255, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "J")
    public static volatile long field2785 = 0L;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Loa;")
    public static class98 field2782 = class38.method349(255, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field2789 = 0;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Loa;")
    public static class98 field2786 = class38.method349(255, "Benutzen");

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lwc;IIIIIIIILd;)V")
    public static final void method987(class149 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class22 arg9) {
        field2783++;
        int var10 = class25.field616[arg3][arg5][arg7];
        int var11 = class25.field616[arg3][arg5][arg7 + 1];
        int var12 = class25.field616[arg3][arg5 + 1][arg7];
        int var13 = class25.field616[arg3][arg5 + 1][arg7 + 1];
        int var14 = (arg7 << 7) + arg5 + (arg2 << 14) + 1073741824;
        int var15 = var10 + var12 + var13 + var11 >> 2;
        class129 var16 = class145.method1167(arg2, 65280);
        if (arg8 != 25253) {
            method987(null, -117, 19, 55, 99, 105, 125, -68, 108, null);
        }
        int var17 = (arg4 << 6) + arg1;
        if (var16.field2969 == 0) {
            var14 += Integer.MIN_VALUE;
        }
        if (var16.field2959 == 1) {
            var17 += 256;
        }
        if (arg1 == 22) {
            class94 var18;
            if (var16.field2990 == -1 && var16.field2932 == null) {
                var18 = var16.method1028(arg4, 22, var10, var11, var13, (byte) 69, var12);
            } else {
                var18 = new class88(arg2, 22, arg4, var10, var12, var13, var11, var16.field2990, true, null);
            }
            arg9.method241(arg6, arg5, arg7, var15, var18, var14, var17);
            if (var16.field2947 == 1) {
                arg0.method1188((byte) -68, arg7, arg5);
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class94 var38;
            if (var16.field2990 == -1 && var16.field2932 == null) {
                var38 = var16.method1028(arg4, 10, var10, var11, var13, (byte) 61, var12);
            } else {
                var38 = new class88(arg2, 10, arg4, var10, var12, var13, var11, var16.field2990, true, null);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg4 == 1 || arg4 == 3) {
                    var39 = var16.field2993;
                    var40 = var16.field2991;
                } else {
                    var39 = var16.field2991;
                    var40 = var16.field2993;
                }
                int var41 = 0;
                if (arg1 == 11) {
                    var41 += 256;
                }
                arg9.method233(arg6, arg5, arg7, var15, var40, var39, var38, var41, var14, var17);
            }
            if (var16.field2947 != 0) {
                arg0.method1187(arg7, arg4, var16.field2991, var16.field2993, var16.field2965, arg5, 256);
            }
        } else if (arg1 >= 12) {
            class94 var19;
            if (var16.field2990 == -1 && var16.field2932 == null) {
                var19 = var16.method1028(arg4, arg1, var10, var11, var13, (byte) -81, var12);
            } else {
                var19 = new class88(arg2, arg1, arg4, var10, var12, var13, var11, var16.field2990, true, null);
            }
            arg9.method233(arg6, arg5, arg7, var15, 1, 1, var19, 0, var14, var17);
            if (var16.field2947 != 0) {
                arg0.method1187(arg7, arg4, var16.field2991, var16.field2993, var16.field2965, arg5, arg8 - 24997);
            }
        } else if (arg1 == 0) {
            class94 var20;
            if (var16.field2990 == -1 && var16.field2932 == null) {
                var20 = var16.method1028(arg4, 0, var10, var11, var13, (byte) -93, var12);
            } else {
                var20 = new class88(arg2, 0, arg4, var10, var12, var13, var11, var16.field2990, true, null);
            }
            arg9.method253(arg6, arg5, arg7, var15, var20, null, class48.field1084[arg4], 0, var14, var17);
            if (var16.field2947 != 0) {
                arg0.method1191(arg1, arg8 ^ 0x168, arg4, arg7, arg5, var16.field2965);
            }
        } else if (arg1 == 1) {
            class94 var21;
            if (var16.field2990 == -1 && var16.field2932 == null) {
                var21 = var16.method1028(arg4, 1, var10, var11, var13, (byte) 85, var12);
            } else {
                var21 = new class88(arg2, 1, arg4, var10, var12, var13, var11, var16.field2990, true, null);
            }
            arg9.method253(arg6, arg5, arg7, var15, var21, null, class132.field3229[arg4], 0, var14, var17);
            if (var16.field2947 != 0) {
                arg0.method1191(arg1, 25549, arg4, arg7, arg5, var16.field2965);
            }
        } else if (arg1 == 2) {
            int var22 = arg4 + 1 & 0x3;
            class94 var23;
            class94 var24;
            if (var16.field2990 == -1 && var16.field2932 == null) {
                var23 = var16.method1028(arg4 + 4, 2, var10, var11, var13, (byte) -103, var12);
                var24 = var16.method1028(var22, 2, var10, var11, var13, (byte) -115, var12);
            } else {
                var23 = new class88(arg2, 2, arg4 + 4, var10, var12, var13, var11, var16.field2990, true, null);
                var24 = new class88(arg2, 2, var22, var10, var12, var13, var11, var16.field2990, true, null);
            }
            arg9.method253(arg6, arg5, arg7, var15, var23, var24, class48.field1084[arg4], class48.field1084[var22], var14, var17);
            if (var16.field2947 != 0) {
                arg0.method1191(arg1, 25549, arg4, arg7, arg5, var16.field2965);
            }
        } else if (arg1 == 3) {
            class94 var25;
            if (var16.field2990 == -1 && var16.field2932 == null) {
                var25 = var16.method1028(arg4, 3, var10, var11, var13, (byte) 55, var12);
            } else {
                var25 = new class88(arg2, 3, arg4, var10, var12, var13, var11, var16.field2990, true, null);
            }
            arg9.method253(arg6, arg5, arg7, var15, var25, null, class132.field3229[arg4], 0, var14, var17);
            if (var16.field2947 != 0) {
                arg0.method1191(arg1, arg8 + 296, arg4, arg7, arg5, var16.field2965);
            }
        } else if (arg1 == 9) {
            class94 var26;
            if (var16.field2990 == -1 && var16.field2932 == null) {
                var26 = var16.method1028(arg4, arg1, var10, var11, var13, (byte) -90, var12);
            } else {
                var26 = new class88(arg2, arg1, arg4, var10, var12, var13, var11, var16.field2990, true, null);
            }
            arg9.method233(arg6, arg5, arg7, var15, 1, 1, var26, 0, var14, var17);
            if (var16.field2947 != 0) {
                arg0.method1187(arg7, arg4, var16.field2991, var16.field2993, var16.field2965, arg5, arg8 ^ 0x63A5);
            }
        } else {
            if (var16.field2949) {
                if (arg4 == 1) {
                    int var30 = var11;
                    var11 = var13;
                    var13 = var12;
                    var12 = var10;
                    var10 = var30;
                } else if (arg4 == 2) {
                    int var27 = var11;
                    var11 = var12;
                    var12 = var27;
                    int var28 = var13;
                    var13 = var10;
                    var10 = var28;
                } else if (arg4 == 3) {
                    int var29 = var11;
                    var11 = var10;
                    var10 = var12;
                    var12 = var13;
                    var13 = var29;
                }
            }
            if (arg1 == 4) {
                class94 var31;
                if (var16.field2990 == -1 && var16.field2932 == null) {
                    var31 = var16.method1028(0, 4, var10, var11, var13, (byte) -83, var12);
                } else {
                    var31 = new class88(arg2, 4, 0, var10, var12, var13, var11, var16.field2990, true, null);
                }
                arg9.method235(arg6, arg5, arg7, var15, var31, class48.field1084[arg4], arg4 * 512, 0, 0, var14, var17);
            } else if (arg1 == 5) {
                int var32 = 16;
                int var33 = arg9.method244(arg6, arg5, arg7);
                if (var33 != 0) {
                    var32 = class145.method1167(var33 >> 14 & 0x7FFF, arg8 + 40027).field2951;
                }
                class94 var34;
                if (var16.field2990 == -1 && var16.field2932 == null) {
                    var34 = var16.method1028(0, 4, var10, var11, var13, (byte) -112, var12);
                } else {
                    var34 = new class88(arg2, 4, 0, var10, var12, var13, var11, var16.field2990, true, null);
                }
                arg9.method235(arg6, arg5, arg7, var15, var34, class48.field1084[arg4], arg4 * 512, class138.field3380[arg4] * var32, class31.field749[arg4] * var32, var14, var17);
            } else if (arg1 == 6) {
                class94 var35;
                if (var16.field2990 == -1 && var16.field2932 == null) {
                    var35 = var16.method1028(0, 4, var10, var11, var13, (byte) -110, var12);
                } else {
                    var35 = new class88(arg2, 4, 0, var10, var12, var13, var11, var16.field2990, true, null);
                }
                arg9.method235(arg6, arg5, arg7, var15, var35, 256, arg4, 0, 0, var14, var17);
            } else if (arg1 == 7) {
                class94 var36;
                if (var16.field2990 == -1 && var16.field2932 == null) {
                    var36 = var16.method1028(0, 4, var10, var11, var13, (byte) 103, var12);
                } else {
                    var36 = new class88(arg2, 4, 0, var10, var12, var13, var11, var16.field2990, true, null);
                }
                arg9.method235(arg6, arg5, arg7, var15, var36, 512, arg4, 0, 0, var14, var17);
            } else if (arg1 == 8) {
                class94 var37;
                if (var16.field2990 == -1 && var16.field2932 == null) {
                    var37 = var16.method1028(0, 4, var10, var11, var13, (byte) -118, var12);
                } else {
                    var37 = new class88(arg2, 4, 0, var10, var12, var13, var11, var16.field2990, true, null);
                }
                arg9.method235(arg6, arg5, arg7, var15, var37, 768, arg4, 0, 0, var14, var17);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static void method988(byte arg0) {
        int var1 = 114 / ((arg0 - 26) / 56);
        field2782 = null;
        field2786 = null;
        field2781 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public static final void method989(boolean arg0) {
        field2784++;
        Object var1 = class140.field3420;
        synchronized (class140.field3420) {
            if (class8.field141 == 0) {
                class10.field203.method581(5, 25093, new class79());
            }
            class8.field141 = 600;
        }
        if (arg0) {
            method989(true);
        }
    }
}
