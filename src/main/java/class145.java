import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class145 extends class354 {

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "F")
    public float field1784;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "Z")
    public boolean field1787;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "F")
    public float field1788;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
    public int field1786;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public int field1785;

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lao;IIIZ[I)V", line = 7)
    private class145(class157 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        if (this.field3102 == 34037) {
            this.field1784 = (float) arg3;
            this.field1787 = false;
            this.field1788 = (float) arg2;
        } else {
            this.field1788 = this.field1784 = 1.0F;
            this.field1787 = true;
        }
        this.field1786 = arg2;
        this.field1785 = arg3;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lao;IIIIIIZ)V", line = 28)
    private class145(class157 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field1784 = (float) arg4 / (float) arg6;
        this.field1787 = false;
        this.field1788 = (float) arg3 / (float) arg5;
        this.field1785 = arg4;
        this.field1786 = arg3;
        this.method2254(false, false);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZLao;[BZIII)Lrn;", line = 42)
    public static final class145 method883(int arg0, boolean arg1, class157 arg2, byte[] arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg4) {
            return (class145) null;
        } else if (!arg2.field1995 && (!class17.method115((byte) 92, arg0) || !class17.method115((byte) 104, arg5))) {
            return arg2.field2037 ? new class145(arg2, 34037, arg7, arg0, arg5, arg1, arg3, arg6) : new class145(arg2, arg7, arg0, arg5, class328.method2123(arg0, 20867), class328.method2123(arg5, 20867), arg3, arg6);
        } else {
            return new class145(arg2, 3553, arg7, arg0, arg5, arg1, arg3, arg6);
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lao;IIIIZ[BI)V", line = 61)
    private class145(class157 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field1786 = arg3;
        this.field1785 = arg4;
        if (this.field3102 == 34037) {
            this.field1787 = false;
            this.field1784 = (float) arg4;
            this.field1788 = (float) arg3;
        } else {
            this.field1787 = true;
            this.field1788 = this.field1784 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILao;IB[IZ)Lrn;", line = 83)
    public static final class145 method884(int arg0, class157 arg1, int arg2, byte arg3, int[] arg4, boolean arg5) {
        if (arg3 >= -48) {
            return (class145) null;
        } else if (!arg1.field1995 && (!class17.method115((byte) 100, arg2) || !class17.method115((byte) 110, arg0))) {
            return arg1.field2037 ? new class145(arg1, 34037, arg2, arg0, arg5, arg4) : new class145(arg1, arg2, arg0, class328.method2123(arg2, 20867), class328.method2123(arg0, 20867), arg4);
        } else {
            return new class145(arg1, 3553, arg2, arg0, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILao;IIIB)Lrn;", line = 103)
    public static final class145 method885(int arg0, class157 arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var6 = 118 / ((arg5 + 17) / 54);
        if (!arg1.field1995 && (!class17.method115((byte) 116, arg2) || !class17.method115((byte) 90, arg4))) {
            return arg1.field2037 ? new class145(arg1, 34037, arg0, arg3, arg2, arg4, true) : new class145(arg1, arg0, arg3, arg2, arg4, class328.method2123(arg2, 20867), class328.method2123(arg4, 20867), true);
        } else {
            return new class145(arg1, 3553, arg0, arg3, arg2, arg4, true);
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lao;IIIII[BI)V", line = 118)
    private class145(class157 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field1785 = arg3;
        this.field1786 = arg2;
        this.method2252(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field1787 = false;
        this.field1784 = (float) arg3 / (float) arg5;
        this.field1788 = (float) arg2 / (float) arg4;
        this.method2254(false, false);
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lao;IIII[I)V", line = 132)
    private class145(class157 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field1785 = arg2;
        this.field1786 = arg1;
        this.method2253(0, 0, arg1, arg2, arg5, 0, 0, true);
        this.field1787 = false;
        this.field1788 = (float) arg1 / (float) arg3;
        this.field1784 = (float) arg2 / (float) arg4;
        this.method2254(false, false);
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lao;IIIIIZ)V", line = 146)
    private class145(class157 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field1786 = arg4;
        if (this.field3102 == 34037) {
            this.field1788 = (float) arg4;
            this.field1784 = (float) arg5;
            this.field1787 = false;
        } else {
            this.field1787 = true;
            this.field1788 = this.field1784 = 1.0F;
        }
        this.field1785 = arg5;
    }
}
