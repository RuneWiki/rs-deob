import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class329 extends class673 implements class21 {

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    private int field4028;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "Lpa;")
    public static class648 field4023 = new class648();

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public static int field4032 = -1;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "Z")
    public static boolean field4036 = false;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "F")
    public static float field4035;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)I", line = 4)
    public final int method98(int arg0) {
        ++field4034;
        return arg0 != 14463 ? -8 : super.field9361;
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V", line = 17)
    public final void method605(int arg0) {
        super.field9371.method2392(this, 126);
        if (arg0 <= 51) {
            field4023 = null;
        }
        ++field4027;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BI)V", line = 28)
    public static final void method1849(byte arg0, int arg1) {
        if (arg0 != -31) {
            method1849((byte) 103, -13);
        }
        ++field4031;
        class76 var2 = class3.method28(9, (byte) 42, arg1);
        var2.method406(arg0 + -975503937);
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lvj;I[BIZ)V", line = 45)
    public class329(class422 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field4028 = arg1;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZI)Z", line = 53)
    public static final boolean method1850(int arg0, boolean arg1, int arg2) {
        ++field4033;
        if (!arg1) {
            return false;
        } else {
            return (arg2 & 540800) != 0;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLdu;)V", line = 66)
    public static final void method1851(byte arg0, class584 arg1) {
        ++field4025;
        class178.field1994 = arg1;
        if (arg0 <= 69) {
            method1852((byte) -97);
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)V", line = 80)
    public static void method1852(byte arg0) {
        if (arg0 != -10) {
            field4023 = null;
        }
        field4023 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)J", line = 96)
    public final long method95(boolean arg0) {
        if (!arg0) {
            method1851((byte) 66, (class584) null);
        }
        ++field4024;
        return 0L;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)I", line = 115)
    public final int method96(int arg0) {
        int var2 = -60 / ((arg0 - -16) / 48);
        ++field4030;
        return this.field4028;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "([BIII)V", line = 125)
    public final void method97(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field4026;
        this.method3716(arg1, 0, arg0);
        if (arg3 <= 31) {
            field4032 = -125;
        }
        this.field4028 = arg2;
    }
}
