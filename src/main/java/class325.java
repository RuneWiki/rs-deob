import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class325 extends class256 {

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "Z")
    public static boolean field4123 = false;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public static int field4124 = 0;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "[I")
    public static int[] field4126 = new int[14];

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII)V", line = 6)
    public final void method1532(int arg0, int arg1, int arg2, int arg3) {
        ++field4125;
        super.field3259 = arg3;
        super.field3260 = arg1;
        super.field3267 = arg2;
        if (arg0 != 2) {
            this.method1541(0.51861453F, -77);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(FI)V", line = 21)
    public final void method1541(float arg0, int arg1) {
        super.field3255 = arg0;
        ++field4127;
        if (arg1 > -87) {
            method1903((byte) 109);
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIIIF)V", line = 34)
    public class325(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(B)V", line = 43)
    public static void method1903(byte arg0) {
        field4126 = null;
        if (arg0 != 37) {
            method1903((byte) -47);
        }
    }
}
