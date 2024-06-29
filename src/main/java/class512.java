import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class512 {

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "Lte;")
    public static class571 field7232 = new class571("", 15);

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "Lcba;")
    public static class513 field7234 = new class513();

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "J")
    public static long field7235;

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "Lvw;")
    public static class279 field7233;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)V")
    public static void method3020(byte arg0) {
        if (arg0 > 12) {
            field7234 = null;
            field7232 = null;
            field7233 = null;
        }
    }
}
