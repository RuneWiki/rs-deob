import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class154 extends class433 {

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "[I")
    public int[] field1899;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "[I")
    public int[] field1902;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Ljava/lang/String;")
    public static String field1907;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Liq;")
    public static class362 field1906;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lae;Lon;I)V")
    public static final void method930(class134 arg0, class184 arg1, int arg2) {
        field1905++;
        boolean var3 = class341.method2192(arg1.field2643 | 0xFF000000, arg1.field2657, arg1.field2615, arg1.field2635, arg1.field2640, (byte) 125, arg1.field2597 ? class384.field5422.field453 : null, arg0) == null;
        if (var3) {
            class148.field1805.method509((byte) 120, new class418(arg1.field2635, arg1.field2657, arg1.field2640, arg1.field2643 | 0xFF000000, arg1.field2615, arg1.field2597));
        }
        if (arg2 < 93) {
            field1907 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method931(byte arg0) {
        field1906 = null;
        if (arg0 <= -15) {
            field1907 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V")
    public static final void method932(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1901++;
        if (arg2 != 28845) {
            field1906 = null;
        }
        class20 var5 = class369.method2351((byte) 117, 10, arg0);
        var5.method146(111);
        var5.field255 = arg4;
        var5.field252 = arg3;
        var5.field258 = arg1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLgh;[[IIZ[[BLae;I[[B[[B[[BLgh;I)V")
    public static final void method933(byte arg0, class327 arg1, int[][] arg2, int arg3, boolean arg4, byte[][] arg5, class134 arg6, int arg7, byte[][] arg8, byte[][] arg9, byte[][] arg10, class327 arg11, int arg12) {
        for (int var13 = 0; var13 < arg12; var13++) {
            for (int var14 = 0; var14 < arg3; var14++) {
                if (class12.method93(1) || class310.method2050(arg7, (byte) -77, var14, class422.field6035, var13)) {
                    byte var15 = arg10[var13][var14];
                    byte var16 = arg5[var13][var14];
                    int var17 = arg9[var13][var14] & 0xFF;
                    int var18 = arg8[var13][var14] & 0xFF;
                    class383 var19 = var17 == 0 ? null : class181.method1222(var17 - 1, 15610);
                    class36 var20 = var18 == 0 ? null : class258.method1729(-116, var18 - 1);
                    int var21 = 0;
                    int var22 = 0;
                    if (var15 != 0) {
                        var21 = var20 == null ? 0 : class8.field126[var15];
                        var22 = var19 == null ? 0 : class35.field400[var15];
                    } else if (var19 != null) {
                        var22 = class35.field400[var15];
                    } else if (var20 != null) {
                        var21 = class35.field400[var15];
                    }
                    int var23 = var21 + var22;
                    int var24 = 0;
                    if (var23 != 0) {
                        int[] var25 = new int[var23];
                        int[] var26 = new int[var23];
                        int[] var27 = new int[var23];
                        int[] var28 = new int[var23];
                        boolean var29 = false;
                        if (var19 != null && (var19.field5400 != -1 || var19.field5404 != -1 || var19.field5412 != -1)) {
                            int var30 = arg6.method609() ? var19.field5412 : var19.field5398;
                            if (!class20.field265) {
                                var30 = -1;
                            }
                            for (int var31 = 0; var31 < var22; var31++) {
                                var27[var24] = var30;
                                var28[var24] = var19.field5401;
                                if (var19.field5400 == -1) {
                                    var25[var24] = -1;
                                } else {
                                    var25[var24] = var19.field5400;
                                }
                                if (var19.field5404 == -1) {
                                    var26[var24] = -1;
                                } else {
                                    var26[var24] = var19.field5404;
                                    var29 = true;
                                }
                                var24++;
                            }
                            if (!arg4 && arg7 == 0) {
                                class191.method1294(var13, var14, var19.field5394, var19.field5397 * 8);
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
                            int var34 = var20.field421;
                            if (!class20.field265) {
                                var34 = -1;
                            }
                            for (int var35 = 0; var35 < var21; var35++) {
                                var27[var24] = var34;
                                var28[var24] = var20.field411;
                                var25[var24] = arg2[var13][var14];
                                if (var26 != null) {
                                    var26[var24] = -1;
                                }
                                var24++;
                            }
                        }
                        int var36 = class302.field4251.length;
                        int[] var37 = arg4 ? new int[var36] : null;
                        int[] var38 = new int[var36];
                        int[] var39 = new int[var36];
                        for (int var40 = 0; var40 < var36; var40++) {
                            int var48 = class302.field4251[var40];
                            int var49 = class91.field1100[var40];
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
                            if (arg4 && class302.field4252[var15][var40]) {
                                int var52 = (var13 << 7) + var38[var40];
                                int var53 = (var14 << 7) + var39[var40];
                                var37[var40] = arg1.method342(var52, var53) - arg11.method342(var52, var53);
                            }
                        }
                        int var41 = arg11.method328(var13, var14);
                        int var42 = arg11.method328(var13 + 1, var14);
                        int var43 = arg11.method328(var13 + 1, var14 + 1);
                        int var44 = arg11.method328(var13, var14 + 1);
                        if (arg7 > 0) {
                            boolean var45 = true;
                            if (var18 == 0 && var15 != 0) {
                                var45 = false;
                            }
                            if (var17 > 0 && var19 != null && !var19.field5396) {
                                var45 = false;
                            }
                            if (var45 && var41 == var42 && var41 == var43 && var41 == var44) {
                                class143.field1767[arg7][var13][var14] = (byte) class429.method2704(class143.field1767[arg7][var13][var14], 4);
                            }
                        }
                        int var46 = 0;
                        int var47 = 0;
                        if (arg4) {
                            var46 = class247.method1682(var13, var14);
                            var47 = class306.method2012(var13, var14);
                        }
                        arg11.method336(var13, var14, var38, var37, var39, class86.field982[var15], class99.field1210[var15], class113.field1396[var15], var25, var26, var27, var28, var46, var47, false);
                        class313.method2069(arg7, var13, var14);
                    }
                }
            }
        }
        field1898++;
        if (arg0 >= -111) {
            method933((byte) -114, (class327) null, (int[][]) null, 7, false, (byte[][]) null, (class134) null, 94, (byte[][]) null, (byte[][]) null, (byte[][]) null, (class327) null, -39);
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(II[I[I)V")
    public class154(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field1899 = arg2;
        this.field1902 = arg3;
    }

    static {
        new class362("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field1907 = null;
        field1906 = new class362("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");
    }
}
