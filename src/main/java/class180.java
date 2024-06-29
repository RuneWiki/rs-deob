import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class180 {

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field2868 = 0;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "Lwm;")
    private static class152 field2867 = class157.method1048("Allocated memory", 111);

    @OriginalMember(owner = "client!im", name = "h", descriptor = "Lwm;")
    public static class152 field2872 = field2867;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "Z")
    public static boolean field2874 = false;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field2871 = -1;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "Lwm;")
    public static class152 field2875 = class157.method1048("gelb:", 101);

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "[I")
    public static int[] field2865;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 21)
    public static void method1182(int arg0) {
        field2867 = null;
        field2872 = null;
        field2875 = null;
        field2865 = null;
        if (arg0 != 30) {
            method1182(127);
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V", line = 53)
    public static final void method1183(int arg0) {
        field2869++;
        class58.method384();
        class185.field2947 = -1;
        class251.field4292 = null;
        class41.method289(false);
        class161.field2561.method1660(false);
        class199.field3220 = new class189();
        ((class272) class181.field2878).method1867(-120);
        class24.field412 = new class54[255];
        class24.field409 = 0;
        class319.method2242();
        class102.method679();
        class238.method1634(arg0 ^ 0x6E07ED64);
        class92.method607(true, false);
        class44.method304(arg0 ^ 0x16);
        for (int var1 = 0; var1 < 2048; var1++) {
            class12 var2 = class22.field380[var1];
            if (var2 != null) {
                var2.field4222 = null;
            }
        }
        if (class217.field3516) {
            class102.method692(104, 104);
            class47.method325();
        }
        class323.method2275(class224.field3650, class164.field2600, -123);
        class125.method798(-20, class224.field3650);
        if (arg0 != 104) {
            return;
        }
        class120.field1702 = null;
        class284.field4824 = null;
        class253.field4382 = null;
        class133.field2043 = null;
        class124.field1742 = null;
        if (class232.field3814 == 5) {
            class48.method330((byte) 124, class224.field3650);
        }
        if (class232.field3814 == 10) {
            class48.method328(false, 103);
        }
        if (class232.field3814 == 30) {
            class232.method1597((byte) 127, 25);
        }
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V", line = 121)
    public static final void method1184(int arg0) {
        class59.field900.method1619(11300);
        class191.field3015.method1619(11300);
        field2873++;
        if (arg0 > -74) {
            field2865 = (int[]) null;
        }
    }
}
