import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class60 {

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Ln;")
    public static class17 field1065;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "[Lha;")
    public static class52[] field1064;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static void method530(byte arg0) {
        if (arg0 >= 102) {
            field1064 = null;
            field1065 = null;
        }
    }

    static {
        new class104(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
    }
}
