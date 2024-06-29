import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class class342 extends class361 {

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "Lgo;")
    public class451 field4968;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    public int field4966;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "Lkn;")
    public static class530 field4970 = new class530("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "[I")
    public static int[] field4976;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "Lkn;")
    public static class530 field4973;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "Lkn;")
    public static class530 field4977;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "Loi;")
    public static class53 field4972;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2036(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 != -1) {
            field4971 = -112;
        }
        field4964++;
        if (arg0 == arg7 && arg5 == arg9 && arg1 == arg3 && arg2 == arg4) {
            class214.method1342(arg3, arg0, arg2, arg8, arg5, false);
            return;
        }
        int var10 = arg0;
        int var11 = arg5;
        int var12 = arg0 * 3;
        int var13 = arg5 * 3;
        int var14 = arg7 * 3;
        int var15 = arg9 * 3;
        int var16 = arg1 * 3;
        int var17 = arg4 * 3;
        int var18 = var14 + arg3 - var16 - arg0;
        int var19 = arg2 + var15 - var17 - arg5;
        int var20 = var16 + var12 - var14 - var14;
        int var21 = var13 + var17 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var27 + var29 + var31 >> 12) + arg0;
            int var34 = (var30 + var32 + var28 >> 12) + arg5;
            class214.method1342(var33, var10, var34, arg8, var11, false);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)Z")
    public static final boolean method2037(int arg0, int arg1, int arg2) {
        field4967++;
        if (arg0 == 2048) {
            return (arg2 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static void method2038(byte arg0) {
        field4973 = null;
        field4976 = null;
        field4970 = null;
        field4972 = null;
        field4977 = null;
        if (arg0 <= 71) {
            method2039((byte) -32);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)Z")
    public abstract boolean method536(int arg0);

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
    public static final void method2039(byte arg0) {
        field4974++;
        if (arg0 != -2) {
            method2039((byte) 22);
        }
        if (class4.field81.method1791(-2, class405.field5737) || class320.field4627 == class146.field1941) {
            class240.method1512((byte) 118, class385.field5414);
            if (class455.field6392 != class320.field4627) {
                class75.method559(-73);
            }
        } else {
            class335.method2003(10, -11, class216.field3128, false, class341.field4945);
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method535(boolean arg0);

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lgo;I)V")
    public class342(class451 arg0, int arg1) {
        this.field4968 = arg0;
        this.field4966 = arg1;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)V")
    public static final void method2040(int arg0, boolean arg1) {
        class174 var2 = class311.field4524;
        synchronized (class311.field4524) {
            class311.field4524.method1087(1, arg0);
        }
        field4969++;
        if (!arg1) {
            class174 var3 = class66.field842;
            synchronized (class66.field842) {
                class66.field842.method1087(1, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIILeb;IIILza;IIIILe;II)Le;")
    public static final class377 method2041(int arg0, int arg1, int arg2, class449 arg3, int arg4, int arg5, int arg6, class290 arg7, int arg8, int arg9, int arg10, int arg11, class377 arg12, int arg13, int arg14) {
        field4965++;
        if (arg12 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg3 != null) {
            int var16 = var15 | arg3.method2629(-1, false, arg10, (byte) -59);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg14 << 48) + ((long) arg5 << 32) + (long) (arg13 - (-(arg0 << 16) - (arg4 << 24)));
        class174 var19 = class513.field7581;
        class377 var20;
        synchronized (class513.field7581) {
            var20 = (class377) class513.field7581.method1088(var17, (byte) 122);
        }
        if (var20 == null || arg7.method324(var20.method1605(), var15) != 0) {
            if (var20 != null) {
                var15 = arg7.method302(var15, var20.method1605());
            }
            byte var21;
            if (arg13 == 1) {
                var21 = 9;
            } else if (arg13 == 2) {
                var21 = 12;
            } else if (arg13 == 3) {
                var21 = 15;
            } else if (arg13 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class117 var24 = new class117(var21 * var22 + 1, var21 * 2 * var22 - var21, 0);
            int var25 = var24.method783((byte) 69, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class95.field1242[var31] * var28 >> 15;
                    int var33 = class95.field1241[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method783((byte) 69, var32, 0, var33);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg0 * var36 + arg4 * var35 >> 8);
                short var38 = (short) (((arg5 & 0x380) * var36 + (arg14 & 0x380) * var35 & 0x38000) + ((arg5 & 0x7F) * var36 + (arg14 & 0x7F) * var35 & 0x7F00) + ((arg5 & 0xFC00) * var36 + (arg14 & 0xFC00) * var35 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method781((byte) -1, var26[0][(var39 + 1) % var21], var37, var26[0][var39], (byte) -119, (short) -1, (byte) 1, var25, var38);
                    } else {
                        var24.method781((byte) -1, var26[var34 - 1][(var39 + 1) % var21], var37, var26[var34][(var39 + 1) % var21], (byte) -124, (short) -1, (byte) 1, var26[var34 - 1][var39], var38);
                        var24.method781((byte) -1, var26[var34][(var39 + 1) % var21], var37, var26[var34][var39], (byte) -106, (short) -1, (byte) 1, var26[var34 - 1][var39], var38);
                    }
                }
            }
            var20 = arg7.method293(var24, var15, class140.field1838, 64, 768);
            class174 var40 = class513.field7581;
            synchronized (class513.field7581) {
                class513.field7581.method1097(19627, var20, var17);
            }
        }
        if (arg6 != 65535) {
            field4971 = 104;
        }
        int var41 = (arg13 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg8 != 0) {
            if ((arg8 & 0x2) != 0) {
                var43 -= 128;
            }
            if ((arg8 & 0x1) != 0) {
                var45 = var41 + 128;
            }
            if ((arg8 & 0x4) != 0) {
                var44 = var41 + 128;
            }
            if ((arg8 & 0x8) != 0) {
                var42 -= 128;
            }
        }
        int var46 = arg12.method1576();
        int var47 = arg12.method1617();
        int var48 = arg12.method1597();
        if (var42 > var46) {
            var46 = var42;
        }
        int var49 = arg12.method1613();
        if (var44 < var47) {
            var47 = var44;
        }
        if (var43 > var48) {
            var48 = var43;
        }
        if (var49 > var45) {
            var49 = var45;
        }
        class454 var50 = null;
        if (arg3 != null) {
            int var51 = arg3.field6276[arg10];
            var50 = class62.field784.method2572(var51 >> 16, (byte) 115);
            arg10 = var51 & 0xFFFF;
        }
        class377 var52;
        if (var50 == null) {
            var52 = var20.method1590((byte) 3, var15, true);
            var52.method1610(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method1580(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method1590((byte) 3, var15, true);
            var52.method1610(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method1580(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method2197(17752, var50, arg10);
        }
        if (arg2 != 0) {
            var52.method1599(arg2);
        }
        if (arg9 != 0) {
            var52.method1594(arg9);
        }
        if (arg11 != 0) {
            var52.method1580(0, arg11, 0);
        }
        return var52;
    }

    static {
        new class530("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field4971 = 4;
        field4976 = new int[500];
        field4975 = 0;
        field4973 = new class530("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");
        field4977 = new class530("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");
    }
}
