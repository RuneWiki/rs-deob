import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public abstract class class170 {

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public int field2534;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public int field2533;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public int field2538;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field2535 = 0;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "Lqv;")
    public static class316 field2536 = new class316(27, -2);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)V", line = 3)
    public static final void method1206(int arg0, int arg1) {
        field2537++;
        if (class37.field799 == arg1) {
            return;
        }
        if (class37.field799 == 0) {
            class399.method2393(6826);
        }
        if (arg1 == 12) {
            class521.method3087(class84.field1337, -124, class339.field5024, class18.field206);
        }
        if (arg1 != 12 && class405.field5763 != null) {
            class405.field5763.method1291(true);
            class405.field5763 = null;
        }
        if (arg1 == 2) {
            class512.method2996(0, class241.field3613 != class188.field2765);
        }
        if (arg1 == 6) {
            class417.method2488(class531.field7837 != class188.field2765, false);
        }
        if (arg1 == 4) {
            class448.method2638(-1, class18.field206, class339.field5024);
        } else if (arg1 == 5) {
            class521.method3087(class84.field1337, arg0 - 115, class339.field5024, class18.field206);
        } else if (arg1 == 8) {
            class521.method3087(class84.field1337, arg0 ^ 0xFFFFFFA0, class339.field5024, class18.field206);
        } else if (arg1 == 11) {
            class448.method2638(arg0 - 2, class18.field206, class339.field5024);
        }
        if (class347.method2186(27559, class37.field799)) {
            class468.field6795.field4741 = 2;
            class328.field4816.field4741 = 2;
            class459.field6656.field4741 = 2;
            class334.field4945.field4741 = 2;
            class15.field174.field4741 = 2;
            class117.field1814.field4741 = 2;
            class475.field6921.field4741 = 2;
        }
        if (class347.method2186(arg0 + 27558, arg1)) {
            class215.field3233 = 0;
            class406.field5774 = 0;
            class477.field6951 = 0;
            class41.field851 = 1;
            class409.field5793 = 1;
            class275.method1776(-30196, true);
            class468.field6795.field4741 = 1;
            class328.field4816.field4741 = 1;
            class459.field6656.field4741 = 1;
            class334.field4945.field4741 = 1;
            class15.field174.field4741 = 1;
            class117.field1814.field4741 = 1;
            class475.field6921.field4741 = 1;
        }
        if (arg1 == 10 || arg1 == 2) {
            class337.method2142(-110);
        }
        if (arg1 == 1) {
            class376.method2298((byte) 62, class76.field1256, class96.field1527);
        } else {
            class421.method2503(false);
        }
        boolean var2 = arg1 == 1 || class359.method2227(arg1, (byte) -40) || class275.method1773(arg1, -87);
        boolean var3 = class37.field799 == arg0 || class359.method2227(class37.field799, (byte) -40) || class275.method1773(class37.field799, -124);
        if (var2 != var3) {
            if (var2) {
                class441.field6285 = class376.field5417;
                if (class220.field3371.field2569 == 0) {
                    class242.method1593(111, 2);
                } else {
                    class42.method417(false, 0, 2, (byte) 113, class425.field6000, class220.field3371.field2569, class376.field5417);
                }
                class479.field6979.method454(false, arg0 ^ 0xFFFFFF8F);
            } else {
                class242.method1593(arg0 - 64, 2);
                class479.field6979.method454(true, -124);
            }
        }
        if (class347.method2186(arg0 + 27558, arg1) || arg1 == 12) {
            class76.field1256.method250();
        }
        class37.field799 = arg1;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V", line = 131)
    public static void method1207(byte arg0) {
        field2536 = null;
        if (arg0 != -114) {
            method1206(12, -38);
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(III)V", line = 153)
    public class170(int arg0, int arg1, int arg2) {
        this.field2534 = arg0;
        this.field2533 = arg2;
        this.field2538 = arg1;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIB)V")
    public abstract void method70(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V")
    public abstract void method69(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(IIB)V")
    public abstract void method72(int arg0, int arg1, byte arg2);
}
