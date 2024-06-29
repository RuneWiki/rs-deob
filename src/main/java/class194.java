import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class194 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Lhn;")
    public static class509 field3265;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lbf;")
    public static class376 field3266;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3264;

    static {
        new class234("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        new class234("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field3265 = new class509(74, -1);
        field3266 = new class376();
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILuq;IB)V", line = 4)
    public static final void method1360(int arg0, class114 arg1, int arg2, byte arg3) {
        field3264++;
        if (class116.field1752 != null || class307.field4631 || arg1 == null || class522.method3107(50, arg1) == null) {
            return;
        }
        class116.field1752 = arg1;
        class472.field6819 = class522.method3107(50, arg1);
        class223.field3661 = 0;
        int var4 = 82 % ((-arg3 - 8) / 57);
        class10.field138 = false;
        class419.field6264 = arg0;
        class447.field6554 = arg2;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 30)
    public static void method1361(byte arg0) {
        if (arg0 < 28) {
            field3265 = null;
        }
        field3266 = null;
        field3265 = null;
    }
}
