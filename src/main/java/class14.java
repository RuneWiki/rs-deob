import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class14 {

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "Lvt;")
    public static class516 field157 = new class516();

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field160 = 0;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "Z")
    public static boolean field161 = false;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "Ljc;")
    public static class356 field159 = new class356(9, 7);

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "Lnk;")
    public static class326 field162 = new class326(76, 11);

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
    public static void method76(byte arg0) {
        field157 = null;
        field159 = null;
        if (arg0 >= -6) {
            field163 = 37;
        }
        field162 = null;
    }

    static {
        new class306(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
    }
}
