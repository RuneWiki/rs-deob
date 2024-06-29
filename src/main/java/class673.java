import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class673 extends class601 {

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field9544;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
    public static int field9548;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
    public static int field9549;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
    public static int field9550;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "Lha;")
    public static class58 field9546;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "Lnaa;")
    public static class71 field9545;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V", line = 5)
    public final void method35(byte arg0) {
        if (arg0 > -37) {
            method3837(-14);
        }
        ++field9544;
        if (~super.field8565 > -1 || super.field8565 > 4) {
            super.field8565 = this.method39((byte) -17);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZ)V", line = 18)
    public final void method40(int arg0, boolean arg1) {
        ++field9547;
        if (!arg1) {
            super.field8565 = arg0;
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(II)I", line = 31)
    public final int method34(int arg0, int arg1) {
        ++field9549;
        if (arg1 != 15706) {
            field9546 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)I", line = 45)
    public final int method3836(int arg0) {
        int var2 = 29 / ((arg0 - -59) / 61);
        ++field9550;
        return super.field8565;
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V", line = 56)
    public static void method3837(int arg0) {
        if (arg0 != -1) {
            method3837(-104);
        }
        field9545 = null;
        field9546 = null;
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(B)I", line = 67)
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            return 45;
        } else {
            ++field9548;
            return 0;
        }
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lgn;)V", line = 78)
    public class673(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(ILgn;)V", line = 81)
    public class673(int arg0, class699 arg1) {
        super(arg0, arg1);
    }
}
