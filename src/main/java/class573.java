import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public abstract class class573 extends class435 {

    @OriginalMember(owner = "client!im", name = "I", descriptor = "S")
    public short field8053;

    @OriginalMember(owner = "client!im", name = "L", descriptor = "S")
    public short field8056;

    @OriginalMember(owner = "client!im", name = "C", descriptor = "J")
    public static long field8047 = 0L;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "I")
    public static int field8046 = 0;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!im", name = "G", descriptor = "I")
    public static int field8051;

    @OriginalMember(owner = "client!im", name = "H", descriptor = "I")
    public static int field8052;

    @OriginalMember(owner = "client!im", name = "J", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!im", name = "K", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!im", name = "M", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(B)Z")
    public final boolean method914(byte arg0) {
        ++field8054;
        if (arg0 != 31) {
            this.method759(-90);
        }
        return class449.field5945[(super.field5801 >> class480.field6531) + class593.field8294 + -class428.field5737][(super.field5797 >> class480.field6531) + -class216.field2924 - -class593.field8294];
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IZ)I")
    public static final int method3281(int arg0, boolean arg1) {
        ++field8049;
        if (arg1) {
            method3281(62, true);
        }
        return ~arg0 == -16711936 ? -1 : class551.method3201(256, arg0);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "([Llaa;Z)I")
    public final int method916(class123[] arg0, boolean arg1) {
        ++field8045;
        if (!arg1) {
            this.field8056 = -55;
        }
        return this.method2477(super.field5801 >> class480.field6531, super.field5797 >> class480.field6531, -123, arg0);
    }

    @OriginalMember(owner = "client!im", name = "f", descriptor = "(B)V")
    public final void method749(byte arg0) {
        if (arg0 >= -41) {
            this.field8053 = -108;
        }
        ++field8052;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(II)Z")
    public static final boolean method3282(int arg0, int arg1) {
        int var2 = 2 % ((arg1 - 2) / 50);
        ++field8048;
        return arg0 == 4 || ~arg0 == -9 || arg0 == 11;
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(ILha;)Z")
    public final boolean method918(int arg0, class60 arg1) {
        ++field8057;
        return arg0 != -5 ? false : class410.method2296(super.field5797 >> class480.field6531, super.field5793, super.field5801 >> class480.field6531, (byte) 109, this.method87((byte) 121));
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IILrba;Lha;ZII)V")
    public final void method754(int arg0, int arg1, class435 arg2, class60 arg3, boolean arg4, int arg5, int arg6) {
        ++field8055;
        if (arg0 == 30558) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!im", name = "f", descriptor = "(I)Z")
    public final boolean method759(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field8050;
            return false;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIILjava/lang/String;B)V")
    public static final void method3283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, byte arg7) {
        ++field8051;
        if (arg7 <= -102) {
            class149 var8 = new class149();
            var8.field2065 = class463.field6224 - -arg3;
            var8.field2067 = arg0;
            var8.field2063 = arg2;
            var8.field2064 = arg4;
            var8.field2060 = arg6;
            var8.field2059 = arg5;
            var8.field2066 = arg1;
            class273.field3427.method166(-8839, var8);
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(IIIIIII)V")
    public class573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field8053 = (short) arg6;
        super.field5801 = arg0;
        super.field5796 = (byte) arg3;
        super.field5800 = arg1;
        super.field5793 = (byte) arg4;
        super.field5797 = arg2;
        this.field8056 = (short) arg5;
    }
}
