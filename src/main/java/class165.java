import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class165 {

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Z")
    public static boolean field2159 = false;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "[I")
    public static int[] field2162;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILjava/lang/Object;I)[B", line = 4)
    public static final byte[] method1042(int arg0, int arg1, Object arg2, int arg3) {
        field2161++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return class409.method2446(arg3, var4, arg1, 0);
        } else {
            if (arg0 != -16777216) {
                method1044(125);
            }
            if (!arg2 instanceof class444) {
                throw new IllegalArgumentException();
            }
            class444 var5 = (class444) arg2;
            return var5.method376(0, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIII)V", line = 43)
    public static final void method1043(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class285.field4073 != null) {
            class285.field4073[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class256.field3674 != null) {
            class256.field3674[arg0][arg1] = (byte) (arg3 >> 3);
        }
        if (class502.field7676 != null) {
            class502.field7676[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 55)
    public static void method1044(int arg0) {
        field2162 = null;
        if (arg0 != -29397) {
            method1043(-91, 83, -43, 123, -18);
        }
    }
}
