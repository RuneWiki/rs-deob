import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class322 {

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "Z")
    public static boolean field4645 = true;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field4649 = 0;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "[Lc;")
    public static class158[] field4646 = new class158[4];

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "Z")
    public static boolean field4650 = false;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4648 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "[S")
    public static short[] field4653 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field4652 = 0;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public static int field4655 = 0;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "[I")
    public static int[] field4651 = new int[14];

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "Ljl;")
    public static class391 field4654;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public static void method2144(int arg0) {
        field4651 = null;
        field4646 = null;
        field4653 = null;
        if (arg0 >= -63) {
            method2145(-107, true);
        }
        field4648 = null;
        field4654 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IZ)V")
    public static final void method2145(int arg0, boolean arg1) {
        class394.method2507(2048);
        field4644++;
        class122.method1027(arg1);
        class198.method1508(true, -26411, arg0);
        class441.method2749(0, class275.field4139, class73.field1235, class100.field1561);
        class174.method1334(class73.field1235, (byte) -12, class100.field1561);
        class302.method2070(127, class171.field2548);
        class275.method1965((byte) -96);
        class126.method1061(false);
        if (class240.field3463 == 10) {
            class183.method1420(false, -1);
        } else if (class240.field3463 == 30) {
            class168.method1288(-6, 25);
        } else if (class240.field3463 == 5) {
            class383.method2430(-21, class100.field1561, class73.field1235);
        }
    }
}
