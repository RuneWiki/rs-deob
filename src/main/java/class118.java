import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class118 {

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1692 = "glow1:";

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1694 = "Loaded fonts";

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method799(int arg0) {
        int var1 = 64 / ((-arg0 - 78) / 33);
        field1692 = null;
        field1694 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIILue;)V")
    public static final void method800(int arg0, int arg1, int arg2, class127 arg3) {
        if (class5.field79[arg0][arg1][arg2] == null) {
            class61.method403(arg0, arg1, arg2);
        }
        class5.field79[arg0][arg1][arg2].field2047 = arg3;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Laa;IIILtc;)V")
    public static final void method801(class281 arg0, int arg1, int arg2, int arg3, class196 arg4) {
        field1693++;
        class448.field6462.method1315(122);
        if (class182.field2547) {
            return;
        }
        if (arg1 != 1) {
            method799(-107);
        }
        for (class173 var5 = (class173) arg4.method1312((byte) 25); var5 != null; var5 = (class173) arg4.method1304(-116)) {
            class46 var6 = class368.method2358(var5.field2464, 36);
            if (class409.method2622((byte) -75, var6)) {
                boolean var7 = class166.method1124(arg0, false, arg3, arg2, var5, var6);
                if (var7) {
                    class32.method243(var5, arg0, var6, 32767);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI[[BZ[[ILsm;[[B[[BI[[BILaa;Lsm;)V")
    public static final void method802(byte arg0, int arg1, byte[][] arg2, boolean arg3, int[][] arg4, class156 arg5, byte[][] arg6, byte[][] arg7, int arg8, byte[][] arg9, int arg10, class281 arg11, class156 arg12) {
        field1691++;
        int var13 = -121 / ((-arg0 - 32) / 37);
        for (int var14 = 0; var14 < arg10; var14++) {
            for (int var15 = 0; var15 < arg1; var15++) {
                if (class67.method457(31862) || class76.method542(client.field2349, var14, arg8, (byte) 33, var15)) {
                    byte var16 = arg6[var14][var15];
                    byte var17 = arg7[var14][var15];
                    int var18 = arg2[var14][var15] & 0xFF;
                    int var19 = arg9[var14][var15] & 0xFF;
                    class6 var20 = var18 == 0 ? null : class364.method2340(true, var18 - 1);
                    class170 var21 = var19 == 0 ? null : class223.method1415(var19 - 1, (byte) -88);
                    int var22 = 0;
                    int var23 = 0;
                    if (var16 != 0) {
                        var22 = var21 == null ? 0 : class46.field684[var16];
                        var23 = var20 == null ? 0 : class5.field80[var16];
                    } else if (var20 != null) {
                        var23 = class5.field80[var16];
                    } else if (var21 != null) {
                        var22 = class5.field80[var16];
                    }
                    int var24 = var22 + var23;
                    int var25 = 0;
                    if (var24 != 0) {
                        int[] var26 = new int[var24];
                        int[] var27 = new int[var24];
                        int[] var28 = new int[var24];
                        int[] var29 = new int[var24];
                        boolean var30 = false;
                        if (var20 != null && (var20.field107 != -1 || var20.field90 != -1 || var20.field103 != -1)) {
                            int var31 = arg11.method1790() ? var20.field103 : var20.field97;
                            if (!class427.field6127) {
                                var31 = -1;
                            }
                            for (int var32 = 0; var32 < var23; var32++) {
                                var28[var25] = var31;
                                var29[var25] = var20.field94;
                                if (var20.field107 == -1) {
                                    var26[var25] = -1;
                                } else {
                                    var26[var25] = var20.field107;
                                }
                                if (var20.field90 == -1) {
                                    var27[var25] = -1;
                                } else {
                                    var27[var25] = var20.field90;
                                    var30 = true;
                                }
                                var25++;
                            }
                            if (!arg3 && arg8 == 0) {
                                class163.method1085(var14, var15, var20.field106, var20.field101 * 8);
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
                            for (int var34 = 0; var34 < var22; var34++) {
                                var26[var25] = -1;
                                var25++;
                            }
                        } else {
                            int var35 = var21.field2428;
                            if (!class427.field6127) {
                                var35 = -1;
                            }
                            for (int var36 = 0; var36 < var22; var36++) {
                                var28[var25] = var35;
                                var29[var25] = var21.field2431;
                                var26[var25] = arg4[var14][var15];
                                if (var27 != null) {
                                    var27[var25] = -1;
                                }
                                var25++;
                            }
                        }
                        int var37 = class286.field3941.length;
                        int[] var38 = arg3 ? new int[var37] : null;
                        int[] var39 = new int[var37];
                        int[] var40 = new int[var37];
                        for (int var41 = 0; var41 < var37; var41++) {
                            int var49 = class286.field3941[var41];
                            int var50 = class188.field2613[var41];
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
                            if (arg3 && class230.field3087[var16][var41]) {
                                int var53 = (var14 << 7) + var39[var41];
                                int var54 = (var15 << 7) + var40[var41];
                                var38[var41] = arg12.method278(var53, var54) - arg5.method278(var53, var54);
                            }
                        }
                        int var42 = arg5.method275(var14, var15);
                        int var43 = arg5.method275(var14 + 1, var15);
                        int var44 = arg5.method275(var14 + 1, var15 + 1);
                        int var45 = arg5.method275(var14, var15 + 1);
                        if (arg8 > 0) {
                            boolean var46 = true;
                            if (var19 == 0 && var16 != 0) {
                                var46 = false;
                            }
                            if (var18 > 0 && var20 != null && !var20.field100) {
                                var46 = false;
                            }
                            if (var46 && var42 == var43 && var42 == var44 && var42 == var45) {
                                class267.field3651[arg8][var14][var15] = (byte) class311.method1970(class267.field3651[arg8][var14][var15], 4);
                            }
                        }
                        int var47 = 0;
                        int var48 = 0;
                        if (arg3) {
                            var47 = class54.method365(var14, var15);
                            var48 = class258.method1582(var14, var15);
                        }
                        arg5.method279(var14, var15, var39, var38, var40, class108.field1597[var16], class71.field1100[var16], class382.field5417[var16], var26, var27, var28, var29, var47, var48, false);
                        class61.method403(arg8, var14, var15);
                    }
                }
            }
        }
    }
}
