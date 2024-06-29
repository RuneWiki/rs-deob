import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public abstract class class299 {

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public int field3725;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public int field3724;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public int field3726;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "Lwd;")
    public static class357 field3723 = new class357(11, 0, 1, 2);

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Lcq;")
    public static class110 field3728 = new class110(109, -1);

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "[I")
    public static int[] field3729 = new int[4096];

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)V")
    public abstract void method1481(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
    public static void method1741(byte arg0) {
        if (arg0 != 77) {
            field3729 = null;
        }
        field3723 = null;
        field3729 = null;
        field3728 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BII)V")
    public abstract void method1477(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILlf;Lda;IBI)V")
    public static final void method1742(int arg0, class676 arg1, class473 arg2, int arg3, byte arg4, int arg5) {
        field3727++;
        if (arg2 != null) {
            arg1.method3731(arg2.method1912(), arg3, arg2.method1886(), arg2.method1865(), arg2.method1853(), arg2.method1899(), arg2.method1869(), false, arg5, arg0, arg2.method1870());
            if (arg4 > -114) {
                field3729 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(III)V")
    public abstract void method1480(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(III)V")
    public class299(int arg0, int arg1, int arg2) {
        this.field3725 = arg1;
        this.field3724 = arg2;
        this.field3726 = arg0;
    }
}
