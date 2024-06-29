import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class256 extends class207 {

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "Ljd;")
    public static class86 field4544 = class122.method868("::fpsoff", true);

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "[Ljd;")
    public static class86[] field4547 = new class86[1000];

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "Ljd;")
    public static class86 field4550 = class122.method868(" )2> <col=00ffff>", true);

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "Ljd;")
    public static class86 field4549 = class122.method868("<)4col> x", true);

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "Ljd;")
    public static class86 field4548 = class122.method868("b12_full", true);

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "J")
    public long field4542;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Ljb;")
    public class256 field4545;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Ljb;")
    public class256 field4546;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
    public final void method1728(int arg0) {
        field4543++;
        if (arg0 != 1000) {
            this.field4542 = 3L;
        }
        if (this.field4546 != null) {
            this.field4546.field4545 = this.field4545;
            this.field4545.field4546 = this.field4546;
            this.field4546 = null;
            this.field4545 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
    public static void method1729(int arg0) {
        field4544 = null;
        field4550 = null;
        field4548 = null;
        field4549 = null;
        field4547 = null;
        if (arg0 != -18485) {
            field4547 = null;
        }
    }
}
