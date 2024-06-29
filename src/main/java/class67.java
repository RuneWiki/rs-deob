import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class67 extends class180 {

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public int field995;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "[I")
    public static int[] field999;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "Ltm;")
    public static class112 field997;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "Z")
    public static boolean field1000;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "Lms;")
    public static class363 field998;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
    public static void method469(byte arg0) {
        field998 = null;
        int var1 = -112 / ((arg0 - 32) / 56);
        field999 = null;
        field997 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Z")
    public final boolean method470(int arg0, int arg1) {
        field994++;
        if (arg1 == 3021) {
            return (this.field995 >> arg0 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lag;Lag;I)V")
    public static final void method471(class180 arg0, class180 arg1, int arg2) {
        if (arg0.field2609 != null) {
            arg0.method1182(28818);
        }
        field990++;
        arg0.field2609 = arg1.field2609;
        arg0.field2610 = arg1;
        if (arg2 != 2047) {
            field997 = null;
        }
        arg0.field2609.field2610 = arg0;
        arg0.field2610.field2609 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)I")
    public final int method472(int arg0) {
        int var2 = 54 % ((arg0 + 61) / 40);
        field989++;
        return this.field995 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILkm;Lji;ILfr;ILpc;I)V")
    public static final void method473(int arg0, class487 arg1, class163 arg2, int arg3, class442 arg4, int arg5, class141 arg6, int arg7) {
        field986++;
        int var8 = arg2.field2334 - (arg3 / 2) - 5;
        int var9 = arg7 + 2;
        if (arg4.field6061 != 0) {
            arg1.method2860((arg7 - (var9 - (arg5 * arg6.method871()))) + 1, arg3 + 10, var8, arg4.field6061, var9, 1);
        }
        if (arg4.field6086 != 0) {
            arg1.method2866(arg3 + 10, true, arg5 * arg6.method871() + (arg7 + 1 - var9), var9, arg4.field6086, var8);
        }
        int var10 = arg4.field6064;
        if (arg2.field2340 && arg4.field6070 != -1) {
            var10 = arg4.field6070;
        }
        for (int var11 = arg0; var11 < arg5; var11++) {
            String var12 = class106.field1529[var11];
            if (var11 < (arg5 - 1)) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg6.method868(arg1, var12, arg2.field2334, arg7, var10, true);
            arg7 += arg6.method871();
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)I")
    public final int method474(byte arg0) {
        if (arg0 != -32) {
            field999 = null;
        }
        field993++;
        return class161.method979(true, this.field995);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZIII)I")
    public static final int method475(boolean arg0, int arg1, int arg2, int arg3) {
        field996++;
        class459 var4 = class27.method228((byte) -124, arg0, arg1);
        if (arg3 <= 13) {
            return 40;
        } else if (var4 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var4.field6463.length) {
            return var4.field6463[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(B)Z")
    public final boolean method476(byte arg0) {
        if (arg0 == -111) {
            field988++;
            return (this.field995 >> 21 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)Z")
    public final boolean method477(int arg0) {
        field985++;
        int var2 = -60 / ((-arg0 - 45) / 36);
        return (this.field995 & 0x5CCA40) >> 22 != 0;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(B)Z")
    public final boolean method478(byte arg0) {
        field991++;
        if (arg0 > -71) {
            field987 = 115;
        }
        return (this.field995 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(II)V")
    public class67(int arg0, int arg1) {
        this.field992 = arg1;
        this.field995 = arg0;
    }

    static {
        new class112("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        new class112("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field999 = new int[25];
        field997 = new class112("Loaded fonts", "Schriftsätze geladen.", "Polices chargées", "Fontes carregadas");
        field1000 = true;
    }
}
