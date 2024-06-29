import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class488 extends class268 {

    @OriginalMember(owner = "client!vq", name = "N", descriptor = "I")
    public int field6584;

    @OriginalMember(owner = "client!vq", name = "R", descriptor = "I")
    public int field6588;

    @OriginalMember(owner = "client!vq", name = "P", descriptor = "F")
    public float field6586;

    @OriginalMember(owner = "client!vq", name = "T", descriptor = "Z")
    public boolean field6590;

    @OriginalMember(owner = "client!vq", name = "K", descriptor = "F")
    public float field6581;

    @OriginalMember(owner = "client!vq", name = "L", descriptor = "I")
    public static int field6582 = 1;

    @OriginalMember(owner = "client!vq", name = "S", descriptor = "Ljia;")
    public static class645 field6589 = new class645();

    @OriginalMember(owner = "client!vq", name = "U", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field6591 = new Hashtable();

    @OriginalMember(owner = "client!vq", name = "O", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!vq", name = "Q", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!vq", name = "W", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!vq", name = "M", descriptor = "Lkh;")
    public static class17 field6583;

    @OriginalMember(owner = "client!vq", name = "V", descriptor = "Lgj;")
    public static class662 field6592;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "(I)V", line = 3)
    public static void method2782(int arg0) {
        field6592 = null;
        field6591 = null;
        field6589 = null;
        field6583 = null;
        if (arg0 != 1) {
            field6583 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lhk;IIII[I)V", line = 16)
    public class488(class111 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field6584 = arg2;
        this.field6588 = arg1;
        this.method1746(arg1, 0, true, 0, 0, 0, arg5, arg2, 0);
        this.field6586 = (float) arg2 / (float) arg4;
        this.field6590 = false;
        this.field6581 = (float) arg1 / (float) arg3;
        this.method1742(123, false, false);
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lhk;IIIIZ[BI)V", line = 32)
    public class488(class111 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field6584 = arg4;
        if (~super.field430 == -34038) {
            this.field6581 = (float) arg3;
            this.field6590 = false;
            this.field6586 = (float) arg4;
        } else {
            this.field6581 = this.field6586 = 1.0F;
            this.field6590 = true;
        }
        this.field6588 = arg3;
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lhk;IIIII)V", line = 53)
    public class488(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field6586 = (float) arg3 / (float) arg5;
        this.field6590 = false;
        this.field6584 = arg3;
        this.field6588 = arg2;
        this.field6581 = (float) arg2 / (float) arg4;
        this.method1742(69, false, false);
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lhk;IIIZ[III)V", line = 67)
    public class488(class111 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field6584 = arg3;
        if (super.field430 != 34037) {
            this.field6581 = this.field6586 = 1.0F;
            this.field6590 = true;
        } else {
            this.field6590 = false;
            this.field6586 = (float) arg3;
            this.field6581 = (float) arg2;
        }
        this.field6588 = arg2;
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lhk;IIIIIZ)V", line = 90)
    public class488(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field6584 = arg5;
        this.field6588 = arg4;
        if (super.field430 == 34037) {
            this.field6586 = (float) arg5;
            this.field6581 = (float) arg4;
            this.field6590 = false;
        } else {
            this.field6590 = true;
            this.field6581 = this.field6586 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lhk;IIII)V", line = 113)
    public class488(class111 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6584 = arg4;
        if (~super.field430 != -34038) {
            this.field6590 = true;
            this.field6581 = this.field6586 = 1.0F;
        } else {
            this.field6581 = (float) arg3;
            this.field6590 = false;
            this.field6586 = (float) arg4;
        }
        this.field6588 = arg3;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIB)V", line = 134)
    public static final void method2783(int arg0, int arg1, byte arg2) {
        ++field6585;
        if (class403.field5534 != class177.field2797) {
            if (class297.method1910(0, 1, false, arg1, 1, arg0, -3, 0, 120)) {
                return;
            }
            class297.method1910(0, 1, false, arg1, 1, arg0, -2, 0, 119);
        } else {
            if (class297.method1910(0, 1, false, arg1, 1, arg0, -2, 0, arg2 + -51)) {
                return;
            }
            class297.method1910(0, 1, false, arg1, 1, arg0, -3, 0, 121);
        }
        if (arg2 != -37) {
            field6589 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lhk;IIIIIIZ)V", line = 160)
    public class488(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field6586 = (float) arg4 / (float) arg6;
        this.field6584 = arg4;
        this.field6581 = (float) arg3 / (float) arg5;
        this.field6588 = arg3;
        this.field6590 = false;
        this.method1742(77, false, false);
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lhk;IIIII[BI)V", line = 176)
    public class488(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field6588 = arg2;
        this.field6584 = arg3;
        this.method1741(arg3, 0, 0, 0, arg2, arg6, 0, -83, true, arg7);
        this.field6581 = (float) arg2 / (float) arg4;
        this.field6590 = false;
        this.field6586 = (float) arg3 / (float) arg5;
        this.method1742(49, false, false);
    }
}
