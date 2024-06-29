import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class301 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Ltc;")
    public static class67 field4125 = new class67(0, -1);

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Z")
    public static boolean field4127 = true;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "Ltm;")
    public static class112 field4128 = new class112("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "[I")
    public static int[] field4129 = new int[500];

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static void method1835(byte arg0) {
        if (arg0 != 82) {
            method1835((byte) -22);
        }
        field4125 = null;
        field4129 = null;
        field4128 = null;
    }
}
