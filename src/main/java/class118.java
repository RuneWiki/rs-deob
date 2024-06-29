import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public abstract class class118 extends class435 {

    @OriginalMember(owner = "client!qca", name = "G", descriptor = "S")
    public short field1737;

    @OriginalMember(owner = "client!qca", name = "C", descriptor = "[S")
    public static short[] field1733 = new short[] { 49, 57, 48, 2, 21, 30, 17, 19 };

    @OriginalMember(owner = "client!qca", name = "A", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!qca", name = "B", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!qca", name = "D", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!qca", name = "E", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!qca", name = "F", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!qca", name = "H", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIII)I", line = 3)
    public static final int method913(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 3;
        ++field1736;
        if (~var4 == -1) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            if (arg2 != 19) {
                method917(true, 56);
            }
            return -arg3 + 4095;
        }
    }

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "(B)Z", line = 27)
    public final boolean method914(byte arg0) {
        ++field1738;
        if (arg0 != 31) {
            field1732 = -55;
        }
        return class449.field5945[(super.field5801 >> class480.field6531) + class593.field8294 + -class428.field5737][(super.field5797 >> class480.field6531) + -class216.field2924 + class593.field8294];
    }

    @OriginalMember(owner = "client!qca", name = "j", descriptor = "(I)V", line = 41)
    public static void method915(int arg0) {
        if (arg0 <= -91) {
            field1733 = null;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "([Llaa;Z)I", line = 51)
    public final int method916(class123[] arg0, boolean arg1) {
        if (!arg1) {
            this.field1737 = 87;
        }
        ++field1734;
        return this.method2477(super.field5801 >> class480.field6531, super.field5797 >> class480.field6531, -102, arg0);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZI)I", line = 66)
    public static final int method917(boolean arg0, int arg1) {
        ++field1731;
        if (arg0) {
            method915(-95);
        }
        return 127 & arg1 >> 11;
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(IIIIII)V", line = 77)
    public class118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field5801 = arg0;
        super.field5797 = arg2;
        super.field5793 = (byte) arg4;
        super.field5796 = (byte) arg3;
        super.field5800 = arg1;
        this.field1737 = (short) arg5;
    }

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "(ILha;)Z", line = 91)
    public final boolean method918(int arg0, class60 arg1) {
        if (arg0 != -5) {
            return true;
        } else {
            ++field1735;
            return class571.method3277(super.field5793, super.field5801 >> class480.field6531, 1, super.field5797 >> class480.field6531);
        }
    }
}
