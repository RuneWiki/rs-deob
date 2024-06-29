import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class463 {

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "[Luh;")
    public static class407[] field6857;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "Lne;")
    public static class139 field6858;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "Lpu;")
    public static class179 field6864;

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "Lpn;")
    public static class49 field6865;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public int field6853;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public int field6855;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public int field6862;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "Lrp;")
    public static class277 field6863;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "Z")
    public boolean field6856;

    static {
        new class179("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field6857 = new class407[4];
        field6858 = new class139("WTWIP", 3);
        field6864 = new class179("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");
        field6865 = new class49(2, -1);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V", line = 3)
    public static void method2834(int arg0) {
        field6863 = null;
        if (arg0 != 256) {
            method2837(64, (byte) -8);
        }
        field6865 = null;
        field6857 = null;
        field6864 = null;
        field6858 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)I", line = 17)
    public static final int method2835(byte arg0) {
        field6852++;
        if (arg0 != 107) {
            method2837(47, (byte) 69);
        }
        return class268.field4260;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)Z", line = 30)
    public static final boolean method2836(int arg0, int arg1, int arg2) {
        field6861++;
        if (arg2 <= 34) {
            method2836(51, -80, -37);
        }
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)I", line = 53)
    public static final int method2837(int arg0, byte arg1) {
        field6859++;
        if (arg1 != 89) {
            field6858 = null;
        }
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            return 3;
        }
    }
}
