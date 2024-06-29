import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class89 {

    @OriginalMember(owner = "client!km", name = "a", descriptor = "Z")
    public static boolean field1247 = false;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
    public static final void method698(byte arg0) {
        class122.field1684.method2388(120);
        field1249++;
        if (arg0 < 54) {
            method698((byte) -112);
        }
    }

    static {
        new class332((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", (String) null, (String) null);
    }
}
