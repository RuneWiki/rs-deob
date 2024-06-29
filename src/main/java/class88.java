import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class88 {

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "Z")
    public static boolean field1790 = false;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "Los;")
    public static class309 field1791;

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "Ls;")
    public static class186 field1793;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "Lo;")
    public static class24 field1792;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V")
    public static void method806(boolean arg0) {
        field1791 = null;
        if (!arg0) {
            method809(121, 53);
        }
        field1793 = null;
        field1792 = null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
    public static final void method807(int arg0) {
        field1788++;
        if (arg0 != 32640) {
            method808(59, -2, 71, 66, 50, null, 71, 120);
        }
        for (int var1 = 0; var1 < class218.field3439; var1++) {
            class387 var2 = class276.field4170[var1];
            boolean var3 = false;
            if (var2.field5663 == null) {
                var2.field5655--;
                if (var2.field5655 < (var2.field5661 == 2 ? -1500 : -10)) {
                    var3 = true;
                } else {
                    if (var2.field5661 == 1 && var2.field5654 == null) {
                        var2.field5654 = class367.method2250(class237.field3657, var2.field5660, 0);
                        if (var2.field5654 == null) {
                            continue;
                        }
                        var2.field5655 += var2.field5654.method2249();
                    } else if (var2.field5661 == 2 && (var2.field5648 == null || var2.field5665 == null)) {
                        if (var2.field5648 == null) {
                            var2.field5648 = class465.method2782(class219.field3448, var2.field5660);
                        }
                        if (var2.field5648 == null) {
                            continue;
                        }
                        if (var2.field5665 == null) {
                            var2.field5665 = var2.field5648.method2783(new int[] { 22050 });
                            if (var2.field5665 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field5655 < 0) {
                        int var4;
                        if (var2.field5650 == 0) {
                            var4 = class186.field2990.field2532 * var2.field5651 >> 8;
                        } else {
                            int var5 = (var2.field5650 & 0x3B003BC) >> 24;
                            if (class15.field266.field6084 == var5) {
                                int var6 = var2.field5650 & 0xFF << 7;
                                int var7 = var2.field5650 >> 16 & 0xFF;
                                int var8 = (var7 << 7) + 64 - class15.field266.field6073;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var2.field5650 >> 8 & 0xFF;
                                int var10 = (var9 << 7) + 64 - class15.field266.field6078;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 128;
                                if (var6 < var11) {
                                    var2.field5655 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var4 = (var6 - var11) * var2.field5651 * class186.field2990.field2544 / var6 >> 8;
                            } else {
                                var4 = 0;
                            }
                        }
                        if (var4 > 0) {
                            class116 var12 = null;
                            if (var2.field5661 == 1) {
                                var12 = var2.field5654.method2251().method955(class385.field5622);
                            } else if (var2.field5661 == 2) {
                                var12 = var2.field5665;
                            }
                            class487 var13 = var2.field5663 = class487.method2936(var12, 100, var4);
                            var13.method2955(var2.field5657 - 1);
                            class288.field4357.method2160(var13);
                        }
                    }
                }
            } else if (!var2.field5663.method1677(arg0 ^ 0xFFFF807F)) {
                var3 = true;
            }
            if (var3) {
                class218.field3439--;
                for (int var14 = var1; var14 < class218.field3439; var14++) {
                    class276.field4170[var14] = class276.field4170[var14 + 1];
                }
                var1--;
            }
        }
        if (class281.field4250 && !class452.method2699((byte) 81)) {
            if (class186.field2990.field2560 != 0 && class273.field4131 != -1) {
                class363.method2222((byte) 11, class273.field4131, class186.field2990.field2560, class202.field3263, false, 0);
            }
            class281.field4250 = false;
        } else if (class186.field2990.field2560 != 0 && class273.field4131 != -1 && !class452.method2699((byte) 103)) {
            class459.method2765(class15.field270, (byte) 87);
            class215.field3397++;
            class335.field5062.method1862((byte) -115, class273.field4131);
            class273.field4131 = -1;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIII[III)V")
    public static final void method808(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        field1787++;
        if (arg1 > 0 && !class388.method2381(arg1, arg6 ^ 0x79)) {
            throw new IllegalArgumentException("");
        } else if (arg7 > 0 && !class388.method2381(arg7, 124)) {
            throw new IllegalArgumentException("");
        } else if (arg3 == 32993) {
            int var8 = arg6;
            int var9 = arg1 < arg7 ? arg1 : arg7;
            int var10 = arg1 >> 1;
            int var11 = arg7 >> 1;
            int[] var12 = arg5;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg4, var8, arg0, arg1, arg7, 0, arg3, arg2, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = var15 + arg1;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var15++];
                        int var23 = var20 & 0xFF;
                        int var24 = (var20 & 0xFFB8) >> 8;
                        int var25 = var20 >> 24 & 0xFF;
                        int var26 = (var20 & 0xFF2D63) >> 16;
                        int var27 = var12[var16++];
                        int var28 = (var22 >> 24 & 0xFF) + var25;
                        int var29 = (var22 & 0xFF) + var23;
                        int var30 = (var22 >> 16 & 0xFF) + var26;
                        int var31 = ((var22 & 0xFFC5) >> 8) + var24;
                        int var32 = (var21 >> 16 & 0xFF) + var30;
                        int var33 = (var21 >> 24 & 0xFF) + var28;
                        int var34 = (var21 >> 8 & 0xFF) + var31;
                        int var35 = (var21 & 0xFF) + var29;
                        int var36 = (var27 >> 24 & 0xFF) + var33;
                        int var37 = ((var27 & 0xFF0609) >> 16) + var32;
                        int var38 = (var27 & 0xFF) + var35;
                        int var39 = ((var27 & 0xFF57) >> 8) + var34;
                        var13[var14++] = class418.method2558(class418.method2558(class418.method2558(class490.method2960(1020, var36) << 22, class490.method2960(16711680, var37 << 14)), class490.method2960(1020, var39) << 6), class490.method2960(1020, var38) >> 2);
                    }
                    var15 += arg1;
                    var16 += arg1;
                }
                int[] var18 = var13;
                var13 = var12;
                var12 = var18;
                arg1 = var10;
                arg7 = var11;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method809(int arg0, int arg1) {
        if (arg1 != 2572) {
            field1790 = false;
        }
        field1789++;
        if (arg0 == 100 && class372.field5456 > 0) {
            byte[] var2 = class196.field3142[--class372.field5456];
            class196.field3142[class372.field5456] = null;
            return var2;
        } else if (arg0 == 5000 && class476.field7049 > 0) {
            byte[] var3 = class67.field1372[--class476.field7049];
            class67.field1372[class476.field7049] = null;
            return var3;
        } else if (arg0 == 30000 && class192.field3107 > 0) {
            byte[] var4 = class283.field4262[--class192.field3107];
            class283.field4262[class192.field3107] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    static {
        new class309("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field1791 = new class309("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");
        field1793 = new class186(71, 2);
    }
}
