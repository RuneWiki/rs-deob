import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class422 extends class204 {

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "Lqk;")
    public static class1 field5862 = new class1(60, 4);

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "[S")
    private static short[] field5867 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "[S")
    private static short[] field5866 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "[S")
    private static short[] field5870 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "[S")
    private static short[] field5872 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "[[S")
    public static short[][] field5869 = new short[][] { field5872, field5870, field5867, field5866 };

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "Lqk;")
    public static class1 field5871 = new class1(32, 3);

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "[I")
    public static int[] field5873 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)I")
    public final int method2542(byte arg0) {
        ++field5868;
        return arg0 != -98 ? -78 : super.field2852;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)I")
    public final int method490(byte arg0) {
        ++field5864;
        if (arg0 < 83) {
            field5867 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)I")
    public final int method487(int arg0, int arg1) {
        ++field5861;
        int var3 = 118 / ((-57 - arg1) / 60);
        return 1;
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(II)V")
    public final void method488(int arg0, int arg1) {
        super.field2852 = arg0;
        if (arg1 >= -105) {
            method2543(102);
        }
        ++field5863;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(ILfs;)V")
    public class422(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
    public final void method486(int arg0) {
        ++field5865;
        if (arg0 != -4591) {
            field5862 = null;
        }
        if (super.field2852 != 1 && ~super.field2852 != -1) {
            super.field2852 = this.method490((byte) 110);
        }
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V")
    public static void method2543(int arg0) {
        field5870 = null;
        field5862 = null;
        field5869 = null;
        field5866 = null;
        field5872 = null;
        if (arg0 != 2) {
            field5862 = null;
        }
        field5867 = null;
        field5873 = null;
        field5871 = null;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lfs;)V")
    public class422(class607 arg0) {
        super(arg0);
    }
}
