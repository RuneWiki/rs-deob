import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class362 extends class43 {

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "Z")
    public static boolean field4906 = true;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "Lcq;")
    public static class72 field4907 = new class72("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public int field4897;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public int field4898;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public int field4899;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public int field4900;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public int field4904;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public int field4908;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public int field4909;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public int field4910;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public int field4911;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public int field4912;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
    public int field4913;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
    public int field4915;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "Lwo;")
    public static class285 field4916;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "[[Laq;")
    public static class453[][] field4903;

    static {
        new class72("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        new class72("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lnh;B)V", line = 13)
    public static final void method2273(class441 arg0, byte arg1) {
        field4905++;
        class7 var2 = null;
        try {
            class315 var3 = arg0.method2724(0);
            if (arg1 <= 92) {
                field4907 = null;
            }
            while (var3.field4244 == 0) {
                class219.method1330(1L, true);
            }
            if (var3.field4244 == 1) {
                var2 = (class7) var3.field4243;
                class242 var4 = class153.method989(-19607);
                var2.method31(var4.field3211, false, 0, var4.field3188);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method32((byte) -125);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILwo;)V", line = 50)
    public static final void method2274(int arg0, class285 arg1) {
        field4901++;
        if (arg0 != -24744) {
            field4907 = null;
        }
        class38.field446 = arg1.method1806((byte) -100, "titlebg");
        class397.field5392 = arg1.method1806((byte) -95, "logo");
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V", line = 63)
    public static void method2275(byte arg0) {
        field4907 = null;
        field4903 = null;
        if (arg0 >= -104) {
            method2276(-32, -70, 53, -13);
        }
        field4916 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIII)I", line = 88)
    public static final int method2276(int arg0, int arg1, int arg2, int arg3) {
        field4914++;
        if (arg1 > 243) {
            arg3 >>= 0x4;
        } else if (arg1 > 217) {
            arg3 >>= 0x3;
        } else if (arg1 > 192) {
            arg3 >>= 0x2;
        } else if (arg1 > 179) {
            arg3 >>= 0x1;
        }
        if (arg2 != 28896) {
            method2274(-125, (class285) null);
        }
        return (arg1 >> 1) + ((arg0 & 0xFF) >> 2 << 10) + (arg3 >> 5 << 7);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Luo;ILip;[[I[[BILip;I[[B[[B[[BZI)V", line = 124)
    public static final void method2277(class118 arg0, int arg1, class279 arg2, int[][] arg3, byte[][] arg4, int arg5, class279 arg6, int arg7, byte[][] arg8, byte[][] arg9, byte[][] arg10, boolean arg11, int arg12) {
        for (int var13 = 0; var13 < arg7; var13++) {
            for (int var14 = 0; var14 < arg12; var14++) {
                if (class98.method602(65280) || class221.method1341(124, var14, var13, class41.field488, arg5)) {
                    byte var15 = arg9[var13][var14];
                    byte var16 = arg10[var13][var14];
                    int var17 = arg8[var13][var14] & 0xFF;
                    int var18 = arg4[var13][var14] & 0xFF;
                    class352 var19 = var17 == 0 ? null : class67.method391(var17 - 1, true);
                    class214 var20 = var18 == 0 ? null : class75.method447(var18 - 1, (byte) 81);
                    int var21 = 0;
                    int var22 = 0;
                    if (var15 != 0) {
                        var22 = var19 == null ? 0 : class101.field1182[var15];
                        var21 = var20 == null ? 0 : class72.field886[var15];
                    } else if (var19 != null) {
                        var22 = class101.field1182[var15];
                    } else if (var20 != null) {
                        var21 = class101.field1182[var15];
                    }
                    int var23 = var21 + var22;
                    int var24 = 0;
                    if (var23 != 0) {
                        int[] var25 = new int[var23];
                        int[] var26 = new int[var23];
                        int[] var27 = new int[var23];
                        int[] var28 = new int[var23];
                        boolean var29 = false;
                        if (var19 == null || var19.field4787 == -1 && var19.field4791 == -1 && var19.field4780 == -1) {
                            for (int var32 = 0; var32 < var22; var32++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        } else {
                            int var30 = arg0.method726() ? var19.field4780 : var19.field4794;
                            if (!class275.field3557) {
                                var30 = -1;
                            }
                            for (int var31 = 0; var31 < var22; var31++) {
                                var27[var24] = var30;
                                var28[var24] = var19.field4792;
                                if (var19.field4787 == -1) {
                                    var25[var24] = -1;
                                } else {
                                    var25[var24] = var19.field4787;
                                }
                                if (var19.field4791 == -1) {
                                    var26[var24] = -1;
                                } else {
                                    var26[var24] = var19.field4791;
                                    var29 = true;
                                }
                                var24++;
                            }
                            if (!arg11 && arg5 == 0) {
                                class178.method1119(var13, var14, var19.field4793, var19.field4779 * 8);
                            }
                        }
                        if (!var29) {
                            var26 = null;
                        }
                        if (var20 == null) {
                            for (int var35 = 0; var35 < var21; var35++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        } else {
                            int var33 = var20.field2648;
                            if (!class275.field3557) {
                                var33 = -1;
                            }
                            for (int var34 = 0; var34 < var21; var34++) {
                                var27[var24] = var33;
                                var28[var24] = var20.field2643;
                                var25[var24] = arg3[var13][var14];
                                if (var26 != null) {
                                    var26[var24] = -1;
                                }
                                var24++;
                            }
                        }
                        int var36 = class349.field4753.length;
                        int[] var37 = arg11 ? new int[var36] : null;
                        int[] var38 = new int[var36];
                        int[] var39 = new int[var36];
                        for (int var40 = 0; var40 < var36; var40++) {
                            int var48 = class349.field4753[var40];
                            int var49 = class127.field1425[var40];
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
                            if (arg11 && class393.field5350[var15][var40]) {
                                int var52 = (var13 << 7) + var38[var40];
                                int var53 = (var14 << 7) + var39[var40];
                                var37[var40] = arg6.method1054(var52, var53) - arg2.method1054(var52, var53);
                            }
                        }
                        int var41 = arg2.method1050(var13, var14);
                        int var42 = arg2.method1050(var13 + 1, var14);
                        int var43 = arg2.method1050(var13 + 1, var14 + 1);
                        int var44 = arg2.method1050(var13, var14 + 1);
                        if (arg5 > 0) {
                            boolean var45 = true;
                            if (var18 == 0 && var15 != 0) {
                                var45 = false;
                            }
                            if (var17 > 0 && var19 != null && !var19.field4783) {
                                var45 = false;
                            }
                            if (var45 && var41 == var42 && var41 == var43 && var41 == var44) {
                                class80.field972[arg5][var13][var14] = (byte) class213.method1307(class80.field972[arg5][var13][var14], 4);
                            }
                        }
                        int var46 = 0;
                        int var47 = 0;
                        if (arg11) {
                            var46 = class438.method2677(var13, var14);
                            var47 = class261.method1652(var13, var14);
                        }
                        arg2.method1049(var13, var14, var38, var37, var39, class163.field1896[var15], class345.field4694[var15], class42.field502[var15], var25, var26, var27, var28, var46, var47, false);
                        class75.method443(arg5, var13, var14);
                    }
                }
            }
        }
        if (arg1 != 3) {
            method2276(72, -22, -58, 7);
        }
        field4896++;
    }
}
