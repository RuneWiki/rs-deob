import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class98 {

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1540 = new String[100];

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "Lbd;")
    public static class44 field1539 = new class44("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "Z")
    public static boolean field1541 = false;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "Ln;")
    public static class15 field1538;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
    public static void method737(byte arg0) {
        if (arg0 > 117) {
            field1540 = null;
            field1538 = null;
            field1539 = null;
        }
    }
}
