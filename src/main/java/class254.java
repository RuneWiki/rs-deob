import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class254 {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field3663 = 127;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lbh;")
    public static class234 field3665 = new class234();

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field3668 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lhh;")
    public static class280 field3667 = new class280();

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Z")
    public static boolean field3666;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static void method1628(int arg0) {
        field3665 = null;
        field3667 = null;
        if (arg0 >= -24) {
            method1628(-123);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILbc;II)[Lpg;")
    public static final class187[] method1629(int arg0, class282 arg1, int arg2, int arg3) {
        field3664++;
        if (class282.method1875(arg1, arg3, 0, arg0)) {
            if (arg2 <= 125) {
                method1628(59);
            }
            return class153.method1005((byte) 102);
        } else {
            return null;
        }
    }
}
