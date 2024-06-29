import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class109 {

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "[I")
    public static int[] field1887;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "Z")
    public static boolean field1889;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "Lbg;")
    public static class310 field1888;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BI)V")
    public static final void method787(byte arg0, int arg1) {
        field1886++;
        class64 var2 = class230.method1387(arg1, (byte) 40, 2);
        var2.method446(-20033);
        if (arg0 != -74) {
            method787((byte) -60, -32);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
    public static void method788(byte arg0) {
        if (arg0 > 32) {
            field1888 = null;
            field1887 = null;
        }
    }

    static {
        new class423("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field1887 = new int[1];
        field1889 = true;
        field1888 = new class310(62, 2);
    }
}
