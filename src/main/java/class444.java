import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class class444 {

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field6675 = 0;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field6674 = -1;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lof;")
    public static class446 field6676 = new class446("K", "T", "K", "K");

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "J")
    public static long field6678;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(ZLqa;)V")
    public abstract void method135(boolean arg0, class165 arg1);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILqa;)Lou;")
    public abstract class437 method136(int arg0, class165 arg1);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2693(int arg0, boolean arg1) {
        field6677++;
        if (arg1) {
            method2694(true);
        }
        return arg0 == 9 || arg0 == 10 || arg0 == 11;
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
    public abstract void method175(int arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BIILqa;)Z")
    public abstract boolean method138(byte arg0, int arg1, int arg2, class165 arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
    public static void method2694(boolean arg0) {
        field6676 = null;
        if (arg0) {
            method2694(true);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)Z")
    public abstract boolean method176(boolean arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILa;IIILqa;Z)V")
    public abstract void method166(int arg0, class444 arg1, int arg2, int arg3, int arg4, class165 arg5, boolean arg6);
}
