import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class119 extends class337 {

    @OriginalMember(owner = "client!cw", name = "q", descriptor = "I")
    public volatile int field1794 = -1;

    @OriginalMember(owner = "client!cw", name = "s", descriptor = "Ljava/lang/String;")
    public volatile String field1796;

    @OriginalMember(owner = "client!cw", name = "o", descriptor = "Lki;")
    public static class498 field1792 = new class498(60, -1);

    @OriginalMember(owner = "client!cw", name = "t", descriptor = "I")
    public static int field1797 = 0;

    @OriginalMember(owner = "client!cw", name = "u", descriptor = "Lfs;")
    public static class387 field1798 = new class387(0, -1);

    @OriginalMember(owner = "client!cw", name = "v", descriptor = "Lri;")
    public static class73 field1799 = new class73(87, 0);

    @OriginalMember(owner = "client!cw", name = "p", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!cw", name = "r", descriptor = "Lic;")
    public static class491 field1795;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lic;I)V")
    public static final void method787(class491 arg0, int arg1) {
        class173.field2556 = arg0;
        if (arg1 != -1) {
            method787(null, 54);
        }
        field1793++;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V")
    public static void method788(byte arg0) {
        field1795 = null;
        field1799 = null;
        field1792 = null;
        if (arg0 >= 10) {
            field1798 = null;
        }
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class119(String arg0) {
        this.field1796 = arg0;
    }
}
