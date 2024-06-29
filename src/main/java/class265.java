import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class265 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "Lck;")
    public static class119 field4327 = class298.method1987((byte) 57, "; Max)2Age=");

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field4331 = 5063219;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Lrh;")
    public static class87 field4328 = new class87();

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public int field4329;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public int field4330;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public int field4334;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)V", line = 7)
    public static final void method1741(byte arg0, int arg1) {
        field4336++;
        if (arg0 >= 125 && class132.field2008 == arg1 && arg1 != 0) {
            class38 var2 = class171.field2719[arg1];
            var2.method294(class70.field1105);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 30)
    public static void method1742(byte arg0) {
        field4327 = null;
        if (arg0 <= -94) {
            field4328 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V", line = 58)
    public static final void method1743(int arg0, int arg1) {
        class171.field2704.method491(-5, arg1);
        field4335++;
        class200.field3190.method491(127, arg1);
        class174.field2765.method491(arg0 ^ 0xFFB2BDF1, arg1);
        if (arg0 != 5063219) {
            field4328 = (class87) null;
        }
    }
}
