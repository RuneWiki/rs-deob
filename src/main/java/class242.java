import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class242 extends class439 {

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public int field3509;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "J")
    public static long field3510 = -1L;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "Lvb;")
    public static class130 field3511;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "[Lvm;")
    public static class480[] field3512;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1564(boolean arg0) {
        field3511 = null;
        field3512 = null;
        if (!arg0) {
            method1564(false);
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V", line = 21)
    public class242() {
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(I)V", line = 23)
    public class242(int arg0) {
        this.field3509 = arg0;
    }
}
