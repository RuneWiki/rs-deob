import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class201 extends class84 {

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "Lvd;")
    public static class39 field3014;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "Lha;")
    public static class60 field3012;

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "Ljava/lang/Object;")
    public static Object field3017;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "Z")
    public static boolean field3018;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "[I")
    public static int[] field3016;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BII)Z")
    public static final boolean method1379(byte arg0, int arg1, int arg2) {
        if (arg0 != -2) {
            method1381(89, -71, 62);
        }
        field3019++;
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public static void method1380(boolean arg0) {
        field3017 = null;
        if (arg0) {
            field3016 = null;
            field3014 = null;
            field3012 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Z")
    public static final boolean method1381(int arg0, int arg1, int arg2) {
        if (arg2 > -41) {
            field3018 = true;
        }
        field3015++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLha;I)Lpga;")
    public static final class536 method1382(byte arg0, class60 arg1, int arg2) {
        field3013++;
        class194 var3 = (class194) class154.field2501.method2287((long) arg2, (byte) -117);
        if (arg0 < 99) {
            return null;
        }
        if (var3 != null) {
            class548 var4 = var3.field2936.method1218(11142);
            var3.field2939 = true;
            if (var4 != null) {
                return var4.method3208((byte) 124, arg1);
            }
        }
        return null;
    }
}
