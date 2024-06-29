import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class687 extends class282 {

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public int field9805;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "Lfaa;")
    public static class139 field9801 = new class139(64);

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field9802;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public static int field9804;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "Lem;")
    public static class206 field9800;

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(ILor;Lma;III)V")
    public class687(int arg0, class594 arg1, class12 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field9805 = arg5;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
    public static void method3876(int arg0) {
        field9800 = null;
        if (arg0 == Integer.MIN_VALUE) {
            field9801 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZI)Ltaa;")
    public static final class373 method3877(int arg0, boolean arg1, int arg2) {
        field9803++;
        long var3 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
        return arg2 <= 14 ? null : (class373) class598.field8356.method970((byte) 89, var3);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Loh;")
    public final class370 method640(int arg0) {
        if (arg0 != 58) {
            this.field9805 = -10;
        }
        field9804++;
        return class129.field1846;
    }
}
