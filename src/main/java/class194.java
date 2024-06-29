import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class194 {

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public int field3052 = -1;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "[I")
    public static int[] field3051 = new int[14];

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field3049 = 0;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field3057 = 0;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public int field3045;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public int field3047;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public int field3050;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public int field3054;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public int field3055;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public int field3062;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public int field3063;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "Lef;")
    public static class214 field3056;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public static final void method1349(byte arg0) {
        field3060++;
        class94.field1460.method1420(-1);
        int var1 = 58 / ((73 - arg0) / 46);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method1350(int arg0, boolean arg1, Object arg2) {
        field3058++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class165.method1134(var3, arg0 - 32698) : var3;
        } else if (arg2 instanceof class51) {
            class51 var4 = (class51) arg2;
            return var4.method374((byte) 56);
        } else {
            if (arg0 != 0) {
                method1351(false);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
    public static void method1351(boolean arg0) {
        field3056 = null;
        field3051 = null;
        if (arg0) {
            method1349((byte) -38);
        }
    }
}
