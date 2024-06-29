import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class343 extends class208 {

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public int field4853;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public int field4856;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Z")
    public boolean field4854;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "F")
    public float field4855;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "F")
    public float field4857;

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lge;IIIIIIZ)V")
    private class343(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field4853 = arg4;
        this.field4856 = arg3;
        this.field4854 = false;
        this.field4855 = (float) arg4 / (float) arg6;
        this.field4857 = (float) arg3 / (float) arg5;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILge;IIII)Lef;")
    public static final class343 method2208(int arg0, class104 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 3553) {
            return (class343) null;
        } else if (!arg1.field1713 && (!class413.method2592(847, arg0) || !class413.method2592(847, arg5))) {
            return arg1.field1666 ? new class343(arg1, 34037, arg3, arg4, arg0, arg5, true) : new class343(arg1, arg3, arg4, arg0, arg5, class202.method1526(arg0, arg2 ^ 0x83487CB1), class202.method1526(arg5, -2092404400), true);
        } else {
            return new class343(arg1, 3553, arg3, arg4, arg0, arg5, true);
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lge;IIIZ[I)V")
    private class343(class104 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field4856 = arg2;
        if (this.field2860 == 34037) {
            this.field4855 = (float) arg3;
            this.field4857 = (float) arg2;
            this.field4854 = false;
        } else {
            this.field4854 = true;
            this.field4857 = this.field4855 = 1.0F;
        }
        this.field4853 = arg3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZII[BLge;III)Lef;")
    public static final class343 method2209(boolean arg0, int arg1, int arg2, byte[] arg3, class104 arg4, int arg5, int arg6, int arg7) {
        if (arg5 != 3553) {
            method2208(-29, (class104) null, -98, 16, 83, -125);
        }
        if (!arg4.field1713 && (!class413.method2592(847, arg6) || !class413.method2592(847, arg7))) {
            return arg4.field1666 ? new class343(arg4, 34037, arg2, arg6, arg7, arg0, arg3, arg1) : new class343(arg4, arg2, arg6, arg7, class202.method1526(arg6, arg5 - 2092407953), class202.method1526(arg7, -2092404400), arg3, arg1);
        } else {
            return new class343(arg4, 3553, arg2, arg6, arg7, arg0, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lge;IIIII[BI)V")
    private class343(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field4856 = arg2;
        this.field4853 = arg3;
        this.method1571(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field4855 = (float) arg3 / (float) arg5;
        this.field4857 = (float) arg2 / (float) arg4;
        this.field4854 = false;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lge;IIIIZ[BI)V")
    private class343(class104 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field4853 = arg4;
        if (this.field2860 == 34037) {
            this.field4855 = (float) arg4;
            this.field4857 = (float) arg3;
            this.field4854 = false;
        } else {
            this.field4854 = true;
            this.field4857 = this.field4855 = 1.0F;
        }
        this.field4856 = arg3;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lge;IIIIIZ)V")
    private class343(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (this.field2860 == 34037) {
            this.field4857 = (float) arg4;
            this.field4854 = false;
            this.field4855 = (float) arg5;
        } else {
            this.field4857 = this.field4855 = 1.0F;
            this.field4854 = true;
        }
        this.field4856 = arg4;
        this.field4853 = arg5;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lge;IIII[I)V")
    private class343(class104 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field4853 = arg2;
        this.field4856 = arg1;
        this.method1570(0, 0, arg1, arg2, arg5, 0, arg1, true);
        this.field4857 = (float) arg1 / (float) arg3;
        this.field4854 = false;
        this.field4855 = (float) arg2 / (float) arg4;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[IBZLge;)Lef;")
    public static final class343 method2210(int arg0, int arg1, int[] arg2, byte arg3, boolean arg4, class104 arg5) {
        if (arg3 != -57) {
            method2209(true, -78, -126, (byte[]) null, (class104) null, 54, -65, -105);
        }
        if (!arg5.field1713 && (!class413.method2592(847, arg1) || !class413.method2592(847, arg0))) {
            return arg5.field1666 ? new class343(arg5, 34037, arg1, arg0, arg4, arg2) : new class343(arg5, arg1, arg0, class202.method1526(arg1, -2092404400), class202.method1526(arg0, -2092404400), arg2);
        } else {
            return new class343(arg5, 3553, arg1, arg0, arg4, arg2);
        }
    }
}
