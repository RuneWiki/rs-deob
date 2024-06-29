import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class32 {

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "[I")
    public static int[] field482 = new int[2];

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Z")
    public static boolean field483 = true;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "J")
    public static volatile long field481 = 0L;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field486 = 0;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "[I")
    public static int[] field480;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static void method188(int arg0) {
        field480 = null;
        if (arg0 == 0) {
            field482 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
    public static final void method189(int arg0, int arg1) {
        class184 var2 = class147.method1044(9, (byte) 72, arg0);
        if (arg1 != -28803) {
            method188(89);
        }
        var2.method1230(1000);
        field485++;
    }
}
