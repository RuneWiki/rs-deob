import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class340 extends class275 {

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "F")
    public float field4695;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
    public int field4693;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "Z")
    public boolean field4694;

    @OriginalMember(owner = "client!mn", name = "S", descriptor = "F")
    public float field4701;

    @OriginalMember(owner = "client!mn", name = "P", descriptor = "I")
    public int field4698;

    @OriginalMember(owner = "client!mn", name = "R", descriptor = "[I")
    public static int[] field4700 = new int[13];

    @OriginalMember(owner = "client!mn", name = "N", descriptor = "Ldb;")
    public static class298 field4696 = new class298(61, -1);

    @OriginalMember(owner = "client!mn", name = "T", descriptor = "[I")
    public static int[] field4702 = new int[32];

    @OriginalMember(owner = "client!mn", name = "O", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!mn", name = "Q", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!mn", name = "U", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lno;IIIIIIZ)V", line = 6)
    public class340(class658 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field4695 = (float) arg3 / (float) arg5;
        this.field4693 = arg3;
        this.field4694 = false;
        this.field4701 = (float) arg4 / (float) arg6;
        this.field4698 = arg4;
        this.method1664(false, false, (byte) 18);
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lno;IIIIZ[BI)V", line = 22)
    public class340(class658 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field4698 = arg4;
        if (super.field4968 == 34037) {
            this.field4701 = (float) arg4;
            this.field4695 = (float) arg3;
            this.field4694 = false;
        } else {
            this.field4695 = this.field4701 = 1.0F;
            this.field4694 = true;
        }
        this.field4693 = arg3;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lno;IIIII[BI)V", line = 47)
    public class340(class658 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field4698 = arg3;
        this.field4693 = arg2;
        this.method1670((byte) 12, 0, 0, 0, arg7, arg2, arg6, arg3, true, 0);
        this.field4694 = false;
        this.field4695 = (float) arg2 / (float) arg4;
        this.field4701 = (float) arg3 / (float) arg5;
        this.method1664(false, false, (byte) 18);
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lno;IIIIIZ)V", line = 62)
    public class340(class658 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field4698 = arg5;
        if (~super.field4968 == -34038) {
            this.field4695 = (float) arg4;
            this.field4701 = (float) arg5;
            this.field4694 = false;
        } else {
            this.field4694 = true;
            this.field4695 = this.field4701 = 1.0F;
        }
        this.field4693 = arg4;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lno;IIIII)V", line = 85)
    public class340(class658 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field4695 = (float) arg2 / (float) arg4;
        this.field4701 = (float) arg3 / (float) arg5;
        this.field4698 = arg3;
        this.field4694 = false;
        this.field4693 = arg2;
        this.method1664(false, false, (byte) 18);
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(Z)V", line = 101)
    public static void method2062(boolean arg0) {
        field4702 = null;
        field4700 = null;
        if (!arg0) {
            field4702 = null;
        }
        field4696 = null;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lno;IIIZ[I)V", line = 113)
    public class340(class658 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        if (super.field4968 == 34037) {
            this.field4701 = (float) arg3;
            this.field4694 = false;
            this.field4695 = (float) arg2;
        } else {
            this.field4694 = true;
            this.field4695 = this.field4701 = 1.0F;
        }
        this.field4698 = arg3;
        this.field4693 = arg2;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lno;IIII)V", line = 134)
    public class340(class658 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        if (~super.field4968 == -34038) {
            this.field4701 = (float) arg4;
            this.field4695 = (float) arg3;
            this.field4694 = false;
        } else {
            this.field4694 = true;
            this.field4695 = this.field4701 = 1.0F;
        }
        this.field4693 = arg3;
        this.field4698 = arg4;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lno;IIII[I)V", line = 155)
    public class340(class658 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field4698 = arg2;
        this.field4693 = arg1;
        this.method1667(arg5, 0, 0, 0, arg2, 0, 0, arg1, true);
        this.field4701 = (float) arg2 / (float) arg4;
        this.field4695 = (float) arg1 / (float) arg3;
        this.field4694 = false;
        this.method1664(false, false, (byte) 18);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZZ)V", line = 169)
    public static final void method2063(int arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            --class262.field3645;
            if (class262.field3645 == 0) {
                class444.field6084 = null;
            }
        }
        ++field4697;
        if (arg0 != 0) {
            method2062(true);
        }
        if (arg1) {
            --class261.field3589;
            if (~class261.field3589 == -1) {
                class446.field6101 = null;
                return;
            }
        }
    }
}
