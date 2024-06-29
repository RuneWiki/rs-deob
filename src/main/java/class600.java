import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class600 extends class207 {

    @OriginalMember(owner = "client!fia", name = "k", descriptor = "Ljb;")
    public static class519 field8177 = new class519(37, 5);

    @OriginalMember(owner = "client!fia", name = "m", descriptor = "Z")
    public static boolean field8179 = true;

    @OriginalMember(owner = "client!fia", name = "p", descriptor = "[Z")
    public static boolean[] field8182 = new boolean[100];

    @OriginalMember(owner = "client!fia", name = "r", descriptor = "I")
    public static int field8184 = 1;

    @OriginalMember(owner = "client!fia", name = "q", descriptor = "I")
    public static int field8183 = 0;

    @OriginalMember(owner = "client!fia", name = "g", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!fia", name = "h", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!fia", name = "i", descriptor = "I")
    public static int field8175;

    @OriginalMember(owner = "client!fia", name = "j", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!fia", name = "l", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!fia", name = "n", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!fia", name = "o", descriptor = "I")
    public static int field8181;

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(IB)I", line = 3)
    public final int method39(int arg0, byte arg1) {
        if (arg1 != 69) {
            return 83;
        } else {
            ++field8180;
            return 1;
        }
    }

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "(I)I", line = 15)
    public final int method3364(int arg0) {
        ++field8174;
        return arg0 != 43 ? -57 : super.field2669;
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(I[B)[B", line = 26)
    public static final byte[] method3365(int arg0, byte[] arg1) {
        ++field8173;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            if (arg0 > -8) {
                field8183 = 59;
            }
            class421.method2534(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(I)I", line = 43)
    public final int method36(int arg0) {
        if (arg0 > -14) {
            field8184 = -49;
        }
        ++field8178;
        return 1;
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(BLof;)V", line = 56)
    public static final void method3366(byte arg0, class647 arg1) {
        class393.field5664 = arg1;
        if (arg0 <= 41) {
            method3365(-54, (byte[]) null);
        }
        ++field8176;
    }

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(ILrd;)V", line = 67)
    public class600(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(I)V", line = 72)
    public final void method37(int arg0) {
        if (~super.field2669 != -2 && ~super.field2669 != -1) {
            super.field2669 = this.method36(-78);
        }
        ++field8181;
        int var2 = 120 % ((-58 - arg0) / 48);
    }

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "(I)V", line = 87)
    public static void method3367(int arg0) {
        if (arg0 == 6732) {
            field8177 = null;
            field8182 = null;
        }
    }

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Lrd;)V", line = 98)
    public class600(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IB)V", line = 107)
    public final void method41(int arg0, byte arg1) {
        super.field2669 = arg0;
        if (arg1 > -7) {
            field8179 = false;
        }
        ++field8175;
    }
}
