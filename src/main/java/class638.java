import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class638 {

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Z")
    public static boolean field9309 = false;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field9312;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field9313;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "[I")
    public static int[] field9314;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "[Luq;")
    public static class142[] field9310;

    static {
        new class572("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IBI)Z", line = 11)
    public static final boolean method3697(int arg0, byte arg1, int arg2) {
        if (arg1 >= -122) {
            field9314 = null;
        }
        field9311++;
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!mo", name = "toString", descriptor = "()Ljava/lang/String;", line = 26)
    public final String toString() {
        field9313++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V", line = 34)
    public static void method3698(boolean arg0) {
        field9310 = null;
        if (arg0) {
            field9314 = null;
        }
    }
}
