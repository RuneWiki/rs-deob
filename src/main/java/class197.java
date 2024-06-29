import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class197 {

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field2271 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Lsb;")
    public static class305 field2272 = new class305(4, -1);

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Lsb;")
    public static class305 field2273 = new class305(52, 4);

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Z")
    public static boolean field2277 = true;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public static void method1189(int arg0) {
        field2271 = null;
        if (arg0 != 31633) {
            method1189(90);
        }
        field2273 = null;
        field2272 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)Lqq;")
    public static final class653 method1190(int arg0, int arg1, int arg2, int arg3) {
        field2274++;
        class653 var4 = null;
        if (arg0 != 4) {
            return null;
        }
        if (arg2 == 0) {
            var4 = class699.method3845((byte) 45, class39.field395, class620.field8764);
            class619.field8756++;
        }
        if (arg2 == 1) {
            class101.field1091++;
            var4 = class699.method3845((byte) 45, class39.field395, class646.field9118);
        }
        var4.field9158.method612(false, class26.field245 + arg1);
        var4.field9158.method646(true, arg3 + class231.field2860);
        var4.field9158.method658(class140.field1549.method1945(82, false) ? 1 : 0, (byte) 70);
        class248.field3078 = arg1;
        class184.field2065 = arg3;
        class556.field7946 = false;
        class255.method1515(arg0 + 11);
        return var4;
    }

    @OriginalMember(owner = "client!dj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2276++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
    public static final void method1191(int arg0) {
        field2275++;
        if (arg0 < -60) {
            class196.field2265.method80((byte) -119);
            class602.field8467.method80((byte) 101);
            class32.field308.method80((byte) 114);
            class204.field2411.method80((byte) -78);
        }
    }
}
