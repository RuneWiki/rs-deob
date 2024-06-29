import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class392 {

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Lwf;")
    public static class79 field5563 = new class79(71, 4);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public static final void method2345(int arg0, int arg1, String arg2, String arg3) {
        class240.field3595 = arg0;
        class201.field2965 = arg3;
        field5564++;
        class298.field4289 = arg2;
        if (class298.field4289.equals("") || class201.field2965.equals("")) {
            class22.field287 = 3;
        } else if (class185.field2746 == -1) {
            class22.field287 = -3;
            class452.field6303 = 0;
            class401.field5680 = 1;
            class339.field4945 = 0;
            class276 var4 = new class276(128);
            var4.method1753(true, 10);
            var4.method1744((int) (Math.random() * 9.9999999E7D), true);
            var4.method1722(class240.method1523(class298.field4289, (byte) 121), true);
            var4.method1744((int) (Math.random() * 9.9999999E7D), true);
            var4.method1730(-11508, class201.field2965);
            var4.method1744((int) (Math.random() * 9.9999999E7D), true);
            var4.method1731(-18016, class427.field5977, class171.field2490);
            class225.field3415.field4021 = arg1;
            class225.field3415.method1753(true, class93.field1195.field1886);
            class225.field3415.method1753(true, var4.field4021 + 2);
            class225.field3415.method1711(false, 577);
            class225.field3415.method1704((byte) -48, var4.field4064, 0, var4.field4021);
        } else {
            class462.method2704(-121);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static void method2346(int arg0) {
        if (arg0 != -27249) {
            method2345(112, -28, (String) null, (String) null);
        }
        field5563 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
    public static final void method2347(int arg0, int arg1) {
        field5566++;
        class489 var2 = class116.method731(-625541408, arg0, arg1);
        var2.method2861(-229012000);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static final void method2348(byte arg0) {
        if (arg0 > -59) {
            field5562 = 88;
        }
        field5565++;
        class51.field698.method1478((byte) -112);
    }
}
