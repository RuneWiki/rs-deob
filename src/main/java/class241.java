import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public abstract class class241 {

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "Lno;")
    public static class420 field3425 = new class420(128);

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public static int field3429 = 2;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "Lkn;")
    public static class442 field3430 = new class442("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field3431 = -50;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "Lko;")
    public static class294 field3426;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Luo;[[B[[BBLij;IZ[[III[[BLij;[[B)V")
    public static final void method1636(class345 arg0, byte[][] arg1, byte[][] arg2, byte arg3, class242 arg4, int arg5, boolean arg6, int[][] arg7, int arg8, int arg9, byte[][] arg10, class242 arg11, byte[][] arg12) {
        field3428++;
        int var13 = -104 % ((63 - arg3) / 47);
        for (int var14 = 0; var14 < arg9; var14++) {
            for (int var15 = 0; var15 < arg5; var15++) {
                if (class51.method428(-1) || class85.method614(class125.field1760, var15, -31202, arg8, var14)) {
                    byte var16 = arg1[var14][var15];
                    byte var17 = arg12[var14][var15];
                    int var18 = arg2[var14][var15] & 0xFF;
                    int var19 = arg10[var14][var15] & 0xFF;
                    class361 var20 = var18 == 0 ? null : class39.method362((byte) 3, var18 - 1);
                    class40 var21 = var19 == 0 ? null : class194.method1252(var19 - 1, false);
                    int var22 = 0;
                    int var23 = 0;
                    if (var16 != 0) {
                        var23 = var20 == null ? 0 : class271.field3759[var16];
                        var22 = var21 == null ? 0 : class282.field3966[var16];
                    } else if (var20 != null) {
                        var23 = class271.field3759[var16];
                    } else if (var21 != null) {
                        var22 = class271.field3759[var16];
                    }
                    int var24 = var22 + var23;
                    int var25 = 0;
                    if (var24 != 0) {
                        int[] var26 = new int[var24];
                        int[] var27 = new int[var24];
                        int[] var28 = new int[var24];
                        int[] var29 = new int[var24];
                        boolean var30 = false;
                        if (var20 != null && (var20.field4989 != -1 || var20.field4994 != -1 || var20.field4991 != -1)) {
                            int var31 = arg0.method51() ? var20.field4991 : var20.field4995;
                            if (!class64.field886) {
                                var31 = -1;
                            }
                            for (int var32 = 0; var32 < var23; var32++) {
                                var28[var25] = var31;
                                var29[var25] = var20.field4999;
                                if (var20.field4989 == -1) {
                                    var26[var25] = -1;
                                } else {
                                    var26[var25] = var20.field4989;
                                }
                                if (var20.field4994 == -1) {
                                    var27[var25] = -1;
                                } else {
                                    var30 = true;
                                    var27[var25] = var20.field4994;
                                }
                                var25++;
                            }
                            if (!arg6 && arg8 == 0) {
                                class197.method1281(var14, var15, var20.field4990, var20.field4986 * 8);
                            }
                        } else {
                            for (int var33 = 0; var33 < var23; var33++) {
                                var26[var25] = -1;
                                var25++;
                            }
                        }
                        if (!var30) {
                            var27 = null;
                        }
                        if (var21 == null) {
                            for (int var36 = 0; var36 < var22; var36++) {
                                var26[var25] = -1;
                                var25++;
                            }
                        } else {
                            int var34 = var21.field578;
                            if (!class64.field886) {
                                var34 = -1;
                            }
                            for (int var35 = 0; var35 < var22; var35++) {
                                var28[var25] = var34;
                                var29[var25] = var21.field586;
                                var26[var25] = arg7[var14][var15];
                                if (var27 != null) {
                                    var27[var25] = -1;
                                }
                                var25++;
                            }
                        }
                        int var37 = class173.field2366.length;
                        int[] var38 = arg6 ? new int[var37] : null;
                        int[] var39 = new int[var37];
                        int[] var40 = new int[var37];
                        for (int var41 = 0; var41 < var37; var41++) {
                            int var49 = class173.field2366[var41];
                            int var50 = class170.field2328[var41];
                            if (var17 == 0) {
                                var39[var41] = var49;
                                var40[var41] = var50;
                            } else if (var17 == 1) {
                                var39[var41] = var50;
                                var40[var41] = 128 - var49;
                            } else if (var17 == 2) {
                                var39[var41] = 128 - var49;
                                var40[var41] = 128 - var50;
                            } else if (var17 == 3) {
                                var39[var41] = 128 - var50;
                                var40[var41] = var49;
                            }
                            if (arg6 && class44.field627[var16][var41]) {
                                int var53 = (var14 << 7) + var39[var41];
                                int var54 = (var15 << 7) + var40[var41];
                                var38[var41] = arg11.method725(var53, var54) - arg4.method725(var53, var54);
                            }
                        }
                        int var42 = arg4.method737(var14, var15);
                        int var43 = arg4.method737(var14 + 1, var15);
                        int var44 = arg4.method737(var14 + 1, var15 + 1);
                        int var45 = arg4.method737(var14, var15 + 1);
                        if (arg8 > 0) {
                            boolean var46 = true;
                            if (var19 == 0 && var16 != 0) {
                                var46 = false;
                            }
                            if (var18 > 0 && var20 != null && !var20.field4988) {
                                var46 = false;
                            }
                            if (var46 && var42 == var43 && var42 == var44 && var42 == var45) {
                                class195.field2682[arg8][var14][var15] = (byte) class393.method2487(class195.field2682[arg8][var14][var15], 4);
                            }
                        }
                        int var47 = 0;
                        int var48 = 0;
                        if (arg6) {
                            var47 = class47.method414(var14, var15);
                            var48 = class454.method2822(var14, var15);
                        }
                        arg4.method732(var14, var15, var39, var38, var40, class203.field2789[var16], class299.field4163[var16], class314.field4297[var16], var26, var27, var28, var29, var47, var48, false);
                        class75.method559(arg8, var14, var15);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
    public static void method1637(int arg0) {
        field3425 = null;
        field3426 = null;
        if (arg0 <= 13) {
            method1638(-45);
        }
        field3430 = null;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
    public static final void method1638(int arg0) {
        if (arg0 != 8) {
            method1637(-73);
        }
        for (int var1 = 0; var1 < class368.field5193.length; var1++) {
            for (int var2 = 0; var2 < class368.field5193[0].length; var2++) {
                for (int var3 = 0; var3 < class368.field5193[0][0].length; var3++) {
                    class368.field5193[var1][var2][var3] = 0;
                }
            }
        }
        field3427++;
    }
}
