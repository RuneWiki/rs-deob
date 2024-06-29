import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class342 {

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public int field4406;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "[I")
    public int[] field4404;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "[I")
    public int[] field4403;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Lsw;")
    public static class641 field4407;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1908(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field4407 = null;
        }
        field4405++;
        return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method1909(int arg0) {
        field4407 = null;
        if (arg0 != 24) {
            method1909(-15);
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(I)V")
    public class342(int arg0) {
        this.field4406 = arg0;
        this.field4404 = new int[this.field4406];
        this.field4403 = new int[this.field4406];
    }

    static {
        new class180("From", "Von:", "De", "De");
        field4407 = new class641(260);
    }
}
