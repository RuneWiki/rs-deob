import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class255 extends class311 {

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "Lhc;")
    public static class368 field3553;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "Lhc;")
    public static class368 field3557;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "B")
    public static byte field3560;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public int field3541;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public int field3542;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public int field3543;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public int field3544;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    public int field3545;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public int field3547;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    public int field3550;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "I")
    public int field3551;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public int field3552;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public int field3555;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
    public int field3561;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "[[[Lr;")
    public static class63[][][] field3554;

    static {
        new class368("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field3553 = new class368("K", "T", "K", "K");
        field3557 = new class368("purple:", "lila:", "violet:", "roxo:");
        new class368("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V", line = 17)
    public static void method1653(int arg0) {
        field3553 = null;
        int var1 = 58 / ((-arg0 - 10) / 32);
        field3557 = null;
        field3554 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lrg;ZIZIIIIIIII)V", line = 34)
    public static final void method1654(class366 arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg11 == 1) {
            arg7 = 1;
        } else if (arg11 == 2) {
            arg4 = 1;
            arg7 = 1;
        } else if (arg11 == 3) {
            arg4 = 1;
        }
        field3548++;
        if (arg10 >= 0 && arg10 < class11.field107 && arg8 >= 0 && arg8 < class264.field3620) {
            if (!arg3 && !arg1) {
                class302.field4122[arg6][arg10][arg8] = 0;
            }
            while (true) {
                int var12 = arg0.method2306((byte) 31);
                if (var12 == 0) {
                    if (arg3) {
                        class278.field3794[0][arg4 + arg10][arg7 + arg8] = class82.field1130[0].method329(arg4 + arg10, arg7 + arg8);
                    } else if (arg6 == 0) {
                        class278.field3794[0][arg4 + arg10][arg7 + arg8] = -class18.method108(arg9 + 932731, 118, arg2 + 556238) * 8;
                    } else {
                        class278.field3794[arg6][arg4 + arg10][arg7 + arg8] = class278.field3794[arg6 - 1][arg10 + arg4][arg7 + arg8] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg0.method2306((byte) 31);
                    if (arg3) {
                        class278.field3794[0][arg4 + arg10][arg7 + arg8] = var13 * 8 + class82.field1130[0].method329(arg10 + arg4, arg7 + arg8);
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg6 == 0) {
                            class278.field3794[0][arg4 + arg10][arg8 + arg7] = -var13 * 8;
                        } else {
                            class278.field3794[arg6][arg4 + arg10][arg7 + arg8] = class278.field3794[arg6 - 1][arg4 + arg10][arg7 + arg8] - (var13 * 8);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg1) {
                        arg0.method2306((byte) 62);
                    } else {
                        class408.field5693[arg6][arg10][arg8] = arg0.method2289((byte) -77);
                        class362.field4988[arg6][arg10][arg8] = (byte) ((var12 - 2) / 4);
                        class305.field4155[arg6][arg10][arg8] = (byte) class187.method1301(var12 + arg11 - 2, 3);
                    }
                } else if (var12 <= 81) {
                    if (!arg3 && !arg1) {
                        class302.field4122[arg6][arg10][arg8] = (byte) (var12 - 49);
                    }
                } else if (!arg1) {
                    class25.field321[arg6][arg10][arg8] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg0.method2306((byte) 72);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg0.method2306((byte) 123);
                    break;
                }
                if (var14 <= 49) {
                    arg0.method2306((byte) 60);
                }
            }
        }
        if (arg5 < 98) {
            method1654((class366) null, true, 113, true, -125, 76, 114, 69, 0, 73, 119, 29);
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)I", line = 166)
    public static final int method1655(int arg0, int arg1) {
        field3546++;
        class279 var2 = class32.method300(arg0 ^ 0xFFFFFFA6, arg1);
        int var3 = var2.field3796;
        int var4 = var2.field3800;
        int var5 = var2.field3797;
        if (arg0 != 0) {
            field3560 = 72;
        }
        int var6 = class194.field2802[var5 - var4];
        return var6 & class13.field121[var3] >> var4;
    }
}
