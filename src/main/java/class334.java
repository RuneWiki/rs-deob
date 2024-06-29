import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class334 extends class154 {

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "Laca;")
    public static class667 field4896;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(FB)V")
    public final void method1082(float arg0, byte arg1) {
        super.field2314 = arg0;
        if (arg1 != 87) {
            this.method1078(18, -55, 46, 70);
        }
        ++field4897;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(IIIIIF)V")
    public class334(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)V")
    public static void method2022(byte arg0) {
        if (arg0 != -95) {
            field4896 = null;
        }
        field4896 = null;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(III)B")
    public static final byte method2023(int arg0, int arg1, int arg2) {
        if (arg1 <= 117) {
            method2022((byte) 17);
        }
        ++field4899;
        if (~arg0 != -10) {
            return 0;
        } else {
            return (byte) (~(arg2 & 1) == -1 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIII)V")
    public final void method1078(int arg0, int arg1, int arg2, int arg3) {
        super.field2321 = arg3;
        ++field4898;
        if (arg1 == 4671) {
            super.field2320 = arg2;
            super.field2318 = arg0;
        }
    }
}
