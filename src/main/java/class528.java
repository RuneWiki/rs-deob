import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class528 {

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "I")
    public int field7648;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "Ldb;")
    public static class272 field7649 = new class272(13, 0, 1, 0);

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "Lig;")
    public static class206 field7650 = new class206(12, -2);

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public static int field7645;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "[Lxa;")
    public static class433[] field7651;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)V")
    public static void method3101(boolean arg0) {
        field7650 = null;
        if (arg0) {
            field7651 = null;
            field7649 = null;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(BII)Z")
    public static final boolean method3102(byte arg0, int arg1, int arg2) {
        field7647++;
        if (arg0 > -98) {
            method3101(false);
        }
        return (arg2 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!raa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7646++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class528(String arg0, int arg1) {
        this.field7648 = arg1;
    }

    static {
        new class474("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    }
}
