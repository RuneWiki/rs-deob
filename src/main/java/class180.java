import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class180 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2544 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Ldj;")
    public static class191 field2543 = new class191(8);

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field2546 = 0;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Lpm;")
    public static class349 field2545 = new class349("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static void method1292(byte arg0) {
        field2543 = null;
        field2544 = null;
        int var1 = -26 % ((45 - arg0) / 57);
        field2545 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z[[BI[[BI[[I[[BILuh;ILvq;Luh;[[B)V")
    public static final void method1293(boolean arg0, byte[][] arg1, int arg2, byte[][] arg3, int arg4, int[][] arg5, byte[][] arg6, int arg7, class92 arg8, int arg9, class269 arg10, class92 arg11, byte[][] arg12) {
        int var13 = 0;
        if (arg4 != 3) {
            field2545 = null;
        }
        while (arg9 > var13) {
            for (int var14 = 0; var14 < arg7; var14++) {
                if (class296.method2000((byte) -121) || class173.method1232(arg2, var14, var13, 125, class40.field558)) {
                    byte var15 = arg6[var13][var14];
                    byte var16 = arg12[var13][var14];
                    int var17 = arg1[var13][var14] & 0xFF;
                    int var18 = arg3[var13][var14] & 0xFF;
                    class247 var19 = var17 == 0 ? null : class377.method2408((byte) 67, var17 - 1);
                    class386 var20 = var18 == 0 ? null : class204.method1422(1, var18 - 1);
                    int var21 = 0;
                    int var22 = 0;
                    if (var15 != 0) {
                        var21 = var20 == null ? 0 : class122.field1637[var15];
                        var22 = var19 == null ? 0 : class450.field6453[var15];
                    } else if (var19 != null) {
                        var22 = class450.field6453[var15];
                    } else if (var20 != null) {
                        var21 = class450.field6453[var15];
                    }
                    int var23 = var21 + var22;
                    int var24 = 0;
                    if (var23 != 0) {
                        int[] var25 = new int[var23];
                        int[] var26 = new int[var23];
                        int[] var27 = new int[var23];
                        int[] var28 = new int[var23];
                        boolean var29 = false;
                        if (var19 != null && (var19.field3688 != -1 || var19.field3685 != -1 || var19.field3682 != -1)) {
                            int var30 = arg10.method864() ? var19.field3682 : var19.field3687;
                            if (!class189.field2714) {
                                var30 = -1;
                            }
                            for (int var31 = 0; var31 < var22; var31++) {
                                var27[var24] = var30;
                                var28[var24] = var19.field3692;
                                if (var19.field3688 == -1) {
                                    var25[var24] = -1;
                                } else {
                                    var25[var24] = var19.field3688;
                                }
                                if (var19.field3685 == -1) {
                                    var26[var24] = -1;
                                } else {
                                    var26[var24] = var19.field3685;
                                    var29 = true;
                                }
                                var24++;
                            }
                            if (!arg0 && arg2 == 0) {
                                class304.method2052(var13, var14, var19.field3681, var19.field3683 * 8);
                            }
                        } else {
                            for (int var32 = 0; var32 < var22; var32++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        }
                        if (!var29) {
                            var26 = null;
                        }
                        if (var20 == null) {
                            for (int var33 = 0; var33 < var21; var33++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        } else {
                            int var34 = var20.field5464;
                            if (!class189.field2714) {
                                var34 = -1;
                            }
                            for (int var35 = 0; var35 < var21; var35++) {
                                var27[var24] = var34;
                                var28[var24] = var20.field5457;
                                var25[var24] = arg5[var13][var14];
                                if (var26 != null) {
                                    var26[var24] = -1;
                                }
                                var24++;
                            }
                        }
                        int var36 = class361.field5201.length;
                        int[] var37 = arg0 ? new int[var36] : null;
                        int[] var38 = new int[var36];
                        int[] var39 = new int[var36];
                        for (int var40 = 0; var40 < var36; var40++) {
                            int var48 = class361.field5201[var40];
                            int var49 = class54.field699[var40];
                            if (var16 == 0) {
                                var38[var40] = var48;
                                var39[var40] = var49;
                            } else if (var16 == 1) {
                                var38[var40] = var49;
                                var39[var40] = 128 - var48;
                            } else if (var16 == 2) {
                                var38[var40] = 128 - var48;
                                var39[var40] = 128 - var49;
                            } else if (var16 == 3) {
                                var38[var40] = 128 - var49;
                                var39[var40] = var48;
                            }
                            if (arg0 && class297.field4325[var15][var40]) {
                                int var52 = (var13 << 7) + var38[var40];
                                int var53 = (var14 << 7) + var39[var40];
                                var37[var40] = arg8.method360(var52, var53) - arg11.method360(var52, var53);
                            }
                        }
                        int var41 = arg11.method359(var13, var14);
                        int var42 = arg11.method359(var13 + 1, var14);
                        int var43 = arg11.method359(var13 + 1, var14 + 1);
                        int var44 = arg11.method359(var13, var14 + 1);
                        if (arg2 > 0) {
                            boolean var45 = true;
                            if (var18 == 0 && var15 != 0) {
                                var45 = false;
                            }
                            if (var17 > 0 && var19 != null && !var19.field3695) {
                                var45 = false;
                            }
                            if (var45 && var41 == var42 && var41 == var43 && var41 == var44) {
                                class284.field4138[arg2][var13][var14] = (byte) class332.method2176(class284.field4138[arg2][var13][var14], 4);
                            }
                        }
                        int var46 = 0;
                        int var47 = 0;
                        if (arg0) {
                            var46 = class420.method2642(var13, var14);
                            var47 = class166.method1195(var13, var14);
                        }
                        arg11.method349(var13, var14, var38, var37, var39, class231.field3422[var15], class126.field1722[var15], class295.field4270[var15], var25, var26, var27, var28, var46, var47, false);
                        class197.method1400(arg2, var13, var14);
                    }
                }
            }
            var13++;
        }
        field2547++;
    }
}
