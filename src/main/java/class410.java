import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class410 {

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "Lga;")
    private class332 field5397;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public int field5396;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "Ltt;")
    public static class338 field5395 = new class338(17, 2);

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    public static int field5398 = 0;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "[Lf;")
    public static class532[] field5399;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V", line = 14)
    public static void method2334(byte arg0) {
        if (arg0 != -114) {
            field5395 = null;
        }
        field5399 = null;
        field5395 = null;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lnq;ILga;)V", line = 40)
    public class410(class650 arg0, int arg1, class332 arg2) {
        new class380(64);
        this.field5397 = arg2;
        this.field5396 = this.field5397.method1939(0, 15);
    }
}
