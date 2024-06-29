import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class137 {

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "[I")
    public static int[] field2069 = new int[14];

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field2071 = 2;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "F")
    public static float field2072 = 1.0F;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZLjava/lang/Object;I)[B", line = 4)
    public static final byte[] method915(boolean arg0, Object arg1, int arg2) {
        if (arg2 > -14) {
            method916((byte) -43);
        }
        field2070++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class530.method3130(var3, 0) : var3;
        } else if (arg1 instanceof class91) {
            class91 var4 = (class91) arg1;
            return var4.method531(-50);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V", line = 55)
    public static void method916(byte arg0) {
        field2069 = null;
        if (arg0 != 67) {
            field2072 = 1.0501631F;
        }
    }
}
