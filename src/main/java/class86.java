import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public abstract class class86 {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "[I")
    public static int[] field1312 = new int[2];

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII)V")
    public static final void method657(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 90 / ((79 - arg1) / 37);
        int var5 = class188.field2789 * arg2 >> 8;
        field1314++;
        if (var5 != 0 && arg3 != -1) {
            class67.method534((byte) 58, var5, false, class100.field1465, 0, arg3);
            class233.field3601 = true;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)[B")
    public abstract byte[] method658(int arg0);

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    public static void method659(int arg0) {
        field1312 = null;
        if (arg0 > -41) {
            field1312 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([BB)V")
    public abstract void method660(byte[] arg0, byte arg1);
}
