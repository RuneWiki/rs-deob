import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class169 {

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lmc;")
    public static class78 field2334 = new class78(22, 7);

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field2339 = 0;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lgd;")
    public static class206 field2337 = new class206("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lbh;")
    public static class27 field2336;

    @OriginalMember(owner = "client!s", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2333++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method995(int arg0) {
        field2334 = null;
        field2337 = null;
        if (arg0 == 0) {
            field2336 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(II)V")
    public class169(int arg0, int arg1) {
    }
}
