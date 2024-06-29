import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class class157 extends class439 {

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "Lgf;")
    public static class180 field2382 = new class180("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field2383 = new String[100];

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V", line = 3)
    public static void method1129(int arg0) {
        if (arg0 <= 86) {
            field2383 = null;
        }
        field2383 = null;
        field2382 = null;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)I")
    public abstract int method1103(int arg0);

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)I")
    public abstract int method1097(int arg0);

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)J")
    public abstract long method1101(byte arg0);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)I")
    public abstract int method1102(boolean arg0);
}
