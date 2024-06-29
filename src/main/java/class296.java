import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class296 extends class238 implements class231 {

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "Lsm;")
    public class238 field4056;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "Llu;")
    public static class610 field4067 = new class610(67, -1);

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "Lada;")
    public static class144 field4072 = new class144(41, -1);

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "Lus;")
    public static class1 field4074 = new class1();

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "Lpi;")
    public static class426 field4075;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(ILqa;)Lin;")
    public final class77 method181(int arg0, class208 arg1) {
        if (arg0 < 0) {
            return null;
        } else {
            field4059++;
            return null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(IIILsm;)V")
    public class296(int arg0, int arg1, int arg2, class238 arg3) {
        super(arg0, arg1, arg2, arg3.field3428, false, false);
        this.field4056 = arg3;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)I")
    public final int method170(int arg0) {
        if (arg0 >= -120) {
            return 35;
        } else {
            field4065++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BILqa;)Lr;")
    public final class159 method190(byte arg0, int arg1, class208 arg2) {
        if (arg0 <= 40) {
            field4067 = null;
        }
        field4070++;
        return null;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(BLqa;)V")
    public final void method178(byte arg0, class208 arg1) {
        field4064++;
        if (arg0 != 115) {
            this.field4056 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
    public final void method179(int arg0) {
        field4069++;
        if (arg0 != 1) {
            field4072 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lqa;IZIILco;I)V")
    public final void method182(class208 arg0, int arg1, boolean arg2, int arg3, int arg4, class102 arg5, int arg6) {
        field4066++;
        if (arg6 != 21130) {
            this.method189(null, -19);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILqa;)V")
    public final void method194(int arg0, class208 arg1) {
        if (arg0 != 0) {
            this.method174((byte) 41, null);
        }
        field4071++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)Z")
    public final boolean method192(byte arg0) {
        field4062++;
        if (arg0 != -41) {
            field4075 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLqa;)V")
    public final void method174(byte arg0, class208 arg1) {
        field4063++;
        if (arg0 > -36) {
            this.method174((byte) 0, null);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILqa;IB)Z")
    public final boolean method171(int arg0, class208 arg1, int arg2, byte arg3) {
        field4060++;
        return arg3 <= 44;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(B)V")
    public static void method1823(byte arg0) {
        if (arg0 < 118) {
            method1823((byte) -59);
        }
        field4072 = null;
        field4074 = null;
        field4067 = null;
        field4075 = null;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
    public final void method172(int arg0) {
        if (arg0 > 95) {
            field4073++;
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)Z")
    public final boolean method180(byte arg0) {
        if (arg0 == 58) {
            field4068++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)I")
    public final int method183(int arg0) {
        if (arg0 != -19248) {
            this.method181(-76, null);
        }
        field4057++;
        return 0;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)I")
    public final int method173(byte arg0) {
        int var2 = 47 % ((arg0 + 43) / 49);
        field4058++;
        return 0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lqa;I)Lpl;")
    public final class558 method189(class208 arg0, int arg1) {
        if (arg1 != 31733) {
            this.method190((byte) 84, -81, null);
        }
        field4061++;
        return this.field4056.method189(arg0, arg1);
    }
}
