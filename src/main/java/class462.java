import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class462 {

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field7105 = 0;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "Lcg;")
    public static class10 field7106 = new class10(1, 2, 2, 0);

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "Lss;")
    public static class213 field7108 = new class213("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field7109 = 0;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public static int field7110 = 0;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "[[Lgi;")
    public static class437[][] field7111;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V")
    public static void method2902(boolean arg0) {
        field7111 = null;
        field7108 = null;
        field7106 = null;
        if (!arg0) {
            method2902(false);
        }
    }
}
