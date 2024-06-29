import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class662 extends class463 {

    @OriginalMember(owner = "client!pea", name = "G", descriptor = "Z")
    public static boolean field9407 = false;

    @OriginalMember(owner = "client!pea", name = "L", descriptor = "J")
    public static long field9412 = -1L;

    @OriginalMember(owner = "client!pea", name = "M", descriptor = "S")
    public static short field9413 = 32767;

    @OriginalMember(owner = "client!pea", name = "F", descriptor = "I")
    public static int field9406;

    @OriginalMember(owner = "client!pea", name = "H", descriptor = "I")
    public static int field9408;

    @OriginalMember(owner = "client!pea", name = "I", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!pea", name = "J", descriptor = "I")
    public static int field9410;

    @OriginalMember(owner = "client!pea", name = "K", descriptor = "I")
    public static int field9411;

    @OriginalMember(owner = "client!pea", name = "N", descriptor = "I")
    public static int field9414;

    @OriginalMember(owner = "client!pea", name = "O", descriptor = "I")
    public static int field9415;

    @OriginalMember(owner = "client!pea", name = "P", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BI)Z", line = 4)
    public static final boolean method3719(byte arg0, int arg1) {
        if (arg0 <= 9) {
            return true;
        } else {
            ++field9416;
            return arg1 == 0 || arg1 == 2 || ~arg1 == -5;
        }
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(IIIIIF)V", line = 21)
    public class662(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIII)V", line = 24)
    public final void method2509(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -79 % ((-10 - arg0) / 38);
        ++field9406;
        super.field6428 = arg2;
        super.field6439 = arg3;
        super.field6438 = arg1;
    }

    @OriginalMember(owner = "client!pea", name = "i", descriptor = "(I)V", line = 38)
    public static final void method3720(int arg0) {
        ++field9410;
        class207.field2516.method3687((byte) -10);
        if (arg0 != 32767) {
            field9413 = -13;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZF)V", line = 53)
    public final void method2507(boolean arg0, float arg1) {
        super.field6436 = arg1;
        if (arg0) {
            method3719((byte) -107, -15);
        }
        ++field9414;
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(BI)Z", line = 74)
    public static final boolean method3721(byte arg0, int arg1) {
        ++field9415;
        if (arg1 != 12 && arg1 != 25 && ~arg1 != -16 && arg1 != 22 && ~arg1 != -11) {
            int var2 = -87 % ((5 - arg0) / 39);
            return ~arg1 == -24 || ~arg1 == -1013;
        } else {
            return true;
        }
    }
}
