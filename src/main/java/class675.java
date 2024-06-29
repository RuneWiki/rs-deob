import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class675 extends class86 {

    @OriginalMember(owner = "client!fia", name = "h", descriptor = "[I")
    public static int[] field8734 = new int[3];

    @OriginalMember(owner = "client!fia", name = "g", descriptor = "I")
    public static int field8733;

    @OriginalMember(owner = "client!fia", name = "j", descriptor = "I")
    public static int field8736;

    @OriginalMember(owner = "client!fia", name = "k", descriptor = "I")
    public static int field8737;

    @OriginalMember(owner = "client!fia", name = "l", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!fia", name = "m", descriptor = "I")
    public static int field8739;

    @OriginalMember(owner = "client!fia", name = "n", descriptor = "I")
    public static int field8740;

    @OriginalMember(owner = "client!fia", name = "o", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!fia", name = "i", descriptor = "J")
    public static long field8735;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(B)V")
    public final void method71(byte arg0) {
        ++field8737;
        if (arg0 != -65) {
            method3636(18, 8);
        }
    }

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Lsf;)V")
    public class675(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        if (!arg1) {
            ++field8733;
            super.field1200 = arg0;
        }
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(B)V")
    public static void method3635(byte arg0) {
        if (arg0 != 10) {
            method3635((byte) -68);
        }
        field8734 = null;
    }

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(ILsf;)V")
    public class675(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "(II)Ldl;")
    public static final class725 method3636(int arg0, int arg1) {
        ++field8739;
        class725[] var2 = class633.method3378(98);
        for (int var3 = arg0; ~var2.length < ~var3; ++var3) {
            class725 var4 = var2[var3];
            if (~var4.field9520 == ~arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Z)I")
    public final int method3637(boolean arg0) {
        if (arg0) {
            return 122;
        } else {
            ++field8741;
            return super.field1200;
        }
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(II)I")
    public final int method72(int arg0, int arg1) {
        if (arg1 != -2) {
            return -64;
        } else {
            ++field8738;
            return 1;
        }
    }

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "(I)Z")
    public static final boolean method3638(int arg0) {
        if (arg0 != 0) {
            field8734 = null;
        }
        ++field8740;
        return class628.field7982 > 0;
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(I)I")
    public final int method73(int arg0) {
        if (arg0 != 0) {
            return -127;
        } else {
            ++field8736;
            return 0;
        }
    }
}
