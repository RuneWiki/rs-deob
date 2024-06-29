import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class297 extends class696 {

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "I")
    public static int field3858 = 0;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "Lsga;")
    public static class583 field3854 = new class583(16);

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!qt", name = "r", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "Lqt;")
    public class297 field3855;

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "Lqt;")
    public class297 field3857;

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "Lmk;")
    public static class344 field3856;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
    public static void method1767(int arg0) {
        field3854 = null;
        field3856 = null;
        if (arg0 >= -4) {
            field3854 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
    public final void method1768(byte arg0) {
        field3852++;
        if (arg0 == 125 && this.field3855 != null) {
            this.field3855.field3857 = this.field3857;
            this.field3857.field3855 = this.field3855;
            this.field3857 = null;
            this.field3855 = null;
        }
    }
}
