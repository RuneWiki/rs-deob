import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class17 extends class141 {

    @OriginalMember(owner = "client!an", name = "o", descriptor = "I")
    public int field174;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "F")
    public float field171;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "F")
    public float field172;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "Z")
    public boolean field173;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IILpo;I[BIZI)Lan;")
    public static final class17 method113(int arg0, int arg1, class332 arg2, int arg3, byte[] arg4, int arg5, boolean arg6, int arg7) {
        if (arg1 != 3553) {
            return (class17) null;
        } else if (!arg2.field4840 && (!class436.method2710(arg7, (byte) -15) || !class436.method2710(arg3, (byte) -15))) {
            return arg2.field4837 ? new class17(arg2, 34037, arg5, arg7, arg3, arg6, arg4, arg0) : new class17(arg2, arg5, arg7, arg3, class279.method1761(false, arg7), class279.method1761(false, arg3), arg4, arg0);
        } else {
            return new class17(arg2, 3553, arg5, arg7, arg3, arg6, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lpo;IIIIIZ)V")
    private class17(class332 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field174 = arg5;
        if (this.field6438 == 34037) {
            this.field173 = false;
            this.field171 = (float) arg5;
            this.field172 = (float) arg4;
        } else {
            this.field172 = this.field171 = 1.0F;
            this.field173 = true;
        }
        this.field175 = arg4;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lpo;IIII[I)V")
    private class17(class332 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field174 = arg2;
        this.field175 = arg1;
        this.method839(0, 0, arg1, arg2, arg5, 0, arg1, true);
        this.field171 = (float) arg2 / (float) arg4;
        this.field172 = (float) arg1 / (float) arg3;
        this.field173 = false;
        this.method837(false, false);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([IIILpo;BZ)Lan;")
    public static final class17 method114(int[] arg0, int arg1, int arg2, class332 arg3, byte arg4, boolean arg5) {
        if (arg4 != 115) {
            return (class17) null;
        } else if (!arg3.field4840 && (!class436.method2710(arg1, (byte) -15) || !class436.method2710(arg2, (byte) -15))) {
            return arg3.field4837 ? new class17(arg3, 34037, arg1, arg2, arg5, arg0) : new class17(arg3, arg1, arg2, class279.method1761(false, arg1), class279.method1761(false, arg2), arg0);
        } else {
            return new class17(arg3, 3553, arg1, arg2, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lpo;IIIZ[I)V")
    private class17(class332 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        if (this.field6438 == 34037) {
            this.field171 = (float) arg3;
            this.field173 = false;
            this.field172 = (float) arg2;
        } else {
            this.field172 = this.field171 = 1.0F;
            this.field173 = true;
        }
        this.field174 = arg3;
        this.field175 = arg2;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lpo;IIIIZ[BI)V")
    private class17(class332 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (this.field6438 == 34037) {
            this.field171 = (float) arg4;
            this.field173 = false;
            this.field172 = (float) arg3;
        } else {
            this.field173 = true;
            this.field172 = this.field171 = 1.0F;
        }
        this.field175 = arg3;
        this.field174 = arg4;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lpo;IIIII[BI)V")
    private class17(class332 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field175 = arg2;
        this.field174 = arg3;
        this.method838(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field173 = false;
        this.field172 = (float) arg2 / (float) arg4;
        this.field171 = (float) arg3 / (float) arg5;
        this.method837(false, false);
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lpo;IIIIIIZ)V")
    private class17(class332 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field171 = (float) arg4 / (float) arg6;
        this.field174 = arg4;
        this.field172 = (float) arg3 / (float) arg5;
        this.field175 = arg3;
        this.field173 = false;
        this.method837(false, false);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IILpo;III)Lan;")
    public static final class17 method115(int arg0, int arg1, class332 arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 3553) {
            return (class17) null;
        } else if (!arg2.field4840 && (!class436.method2710(arg3, (byte) -15) || !class436.method2710(arg5, (byte) -15))) {
            return arg2.field4837 ? new class17(arg2, 34037, arg0, arg4, arg3, arg5, true) : new class17(arg2, arg0, arg4, arg3, arg5, class279.method1761(false, arg3), class279.method1761(false, arg5), true);
        } else {
            return new class17(arg2, 3553, arg0, arg4, arg3, arg5, true);
        }
    }
}
