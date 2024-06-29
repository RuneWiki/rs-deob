import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class205 extends class195 {

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public int field2775;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public int field2774;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "Z")
    public boolean field2778;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "F")
    public float field2777;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "F")
    public float field2776;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIILhj;IZ)Lbc;")
    public static final class205 method1342(int arg0, int arg1, int arg2, class338 arg3, int arg4, boolean arg5) {
        if (arg5) {
            method1342(27, -103, 24, (class338) null, -109, true);
        }
        if (!arg3.field4730 && (!class220.method1391(-17949, arg4) || !class220.method1391(-17949, arg0))) {
            return arg3.field4693 ? new class205(arg3, 34037, arg2, arg1, arg4, arg0, true) : new class205(arg3, arg2, arg1, arg4, arg0, class164.method1089(arg4, (byte) -102), class164.method1089(arg0, (byte) -89), true);
        } else {
            return new class205(arg3, 3553, arg2, arg1, arg4, arg0, true);
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lhj;IIIZ[I)V")
    private class205(class338 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field2775 = arg2;
        this.field2774 = arg3;
        if (this.field1839 == 34037) {
            this.field2778 = false;
            this.field2777 = (float) arg3;
            this.field2776 = (float) arg2;
        } else {
            this.field2776 = this.field2777 = 1.0F;
            this.field2778 = true;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lhj;IIIIIIZ)V")
    private class205(class338 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field2775 = arg3;
        this.field2774 = arg4;
        this.field2778 = false;
        this.field2777 = (float) arg4 / (float) arg6;
        this.field2776 = (float) arg3 / (float) arg5;
        this.method1295(false, false);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lhj;ZII[BIII)Lbc;")
    public static final class205 method1343(class338 arg0, boolean arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        if (arg5 != 1673) {
            return (class205) null;
        } else if (!arg0.field4730 && (!class220.method1391(-17949, arg7) || !class220.method1391(-17949, arg3))) {
            return arg0.field4693 ? new class205(arg0, 34037, arg2, arg7, arg3, arg1, arg4, arg6) : new class205(arg0, arg2, arg7, arg3, class164.method1089(arg7, (byte) -119), class164.method1089(arg3, (byte) -76), arg4, arg6);
        } else {
            return new class205(arg0, 3553, arg2, arg7, arg3, arg1, arg4, arg6);
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lhj;IIIII[BI)V")
    private class205(class338 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2775 = arg2;
        this.field2774 = arg3;
        this.method1297(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field2778 = false;
        this.field2776 = (float) arg2 / (float) arg4;
        this.field2777 = (float) arg3 / (float) arg5;
        this.method1295(false, false);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lhj;IIII[I)V")
    private class205(class338 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field2774 = arg2;
        this.field2775 = arg1;
        this.method1299(0, 0, arg1, arg2, arg5, 0, 0, true);
        this.field2777 = (float) arg2 / (float) arg4;
        this.field2778 = false;
        this.field2776 = (float) arg1 / (float) arg3;
        this.method1295(false, false);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lhj;IIIIIZ)V")
    private class205(class338 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field2774 = arg5;
        if (this.field1839 == 34037) {
            this.field2778 = false;
            this.field2777 = (float) arg5;
            this.field2776 = (float) arg4;
        } else {
            this.field2778 = true;
            this.field2776 = this.field2777 = 1.0F;
        }
        this.field2775 = arg4;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lhj;IIIIZ[BI)V")
    private class205(class338 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field2774 = arg4;
        if (this.field1839 == 34037) {
            this.field2777 = (float) arg4;
            this.field2776 = (float) arg3;
            this.field2778 = false;
        } else {
            this.field2778 = true;
            this.field2776 = this.field2777 = 1.0F;
        }
        this.field2775 = arg3;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lhj;[IZIBI)Lbc;")
    public static final class205 method1344(class338 arg0, int[] arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != 28) {
            method1343((class338) null, true, 104, 47, (byte[]) null, -31, 110, 90);
        }
        if (!arg0.field4730 && (!class220.method1391(-17949, arg5) || !class220.method1391(-17949, arg3))) {
            return arg0.field4693 ? new class205(arg0, 34037, arg5, arg3, arg2, arg1) : new class205(arg0, arg5, arg3, class164.method1089(arg5, (byte) -84), class164.method1089(arg3, (byte) -77), arg1);
        } else {
            return new class205(arg0, 3553, arg5, arg3, arg2, arg1);
        }
    }
}
