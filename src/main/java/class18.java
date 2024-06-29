import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class18 extends class180 {

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "[I")
    public static int[] field235 = new int[1000];

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    public static int field232 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "Lcf;")
    private static class93 field239 = class147.method1066("RuneScape is loading )2 please wait)3)3)3", -48);

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "Lcf;")
    public static class93 field233 = field239;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "Lcf;")
    public static class93 field243 = class147.method1066("Sprites charg-Bs", -48);

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "Lhg;")
    public static class177 field236;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "[Ldh;")
    public static class120[] field231;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public static void method81(int arg0) {
        field231 = null;
        if (arg0 <= 102) {
            return;
        }
        field236 = null;
        field235 = null;
        field243 = null;
        field233 = null;
        field239 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIII)V")
    public static final void method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 >= class277.field4967 && class147.field2593 >= arg0 && arg1 >= class26.field342 && class271.field4820 >= arg6) {
            if (arg3 == 1) {
                class212.method1496(arg6, arg4, arg5, (byte) -90, arg1, arg0);
            } else {
                class50.method274(arg1, (byte) 7, arg0, arg4, arg3, arg6, arg5);
            }
        } else if (arg3 == 1) {
            class246.method1675(arg5, arg6, arg4, 25705, arg1, arg0);
        } else {
            class160.method1155(arg2 ^ 0xFFFFA12C, arg3, arg6, arg1, arg0, arg5, arg4);
        }
        field241++;
        if (arg2 != 0) {
            field234 = 8;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
    public static final void method83(byte arg0) {
        class33.field528 = null;
        field238++;
        if (arg0 != 71) {
            method82(-49, 28, 83, 13, 106, -10, -42);
        }
        class238.field4261 = null;
        class4.field57 = null;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
    public static final void method84(int arg0) {
        field242++;
        int var1 = -19 / ((-arg0 - 55) / 44);
        if (class272.field4835 != null) {
            class11 var2 = class272.field4835;
            synchronized (class272.field4835) {
                class272.field4835 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BIILcf;JII)V")
    public static final void method85(byte arg0, int arg1, int arg2, class93 arg3, long arg4, int arg5, int arg6) {
        class280 var8 = new class280(128);
        field240++;
        if (arg0 != 61) {
            field243 = null;
        }
        var8.method1916(10, arg0 + 28);
        var8.method1908(-86, (int) (Math.random() * 99999.0D));
        var8.method1908(-119, 531);
        var8.method1882(arg4, (byte) -126);
        var8.method1886((int) (Math.random() * 9.9999999E7D), arg0 - 59);
        var8.method1898((byte) 122, arg3);
        var8.method1886((int) (Math.random() * 9.9999999E7D), 2);
        var8.method1908(-107, class276.field4943);
        var8.method1916(arg5, 105);
        var8.method1916(arg6, arg0 + 55);
        var8.method1886((int) (Math.random() * 9.9999999E7D), arg0 - 59);
        var8.method1908(arg0 ^ 0xFFFFFFB6, arg1);
        var8.method1908(-114, arg2);
        var8.method1886((int) (Math.random() * 9.9999999E7D), 2);
        var8.method1900(class3.field22, 12073, class155.field2707);
        class285.field5105.field5027 = 0;
        class285.field5105.method1916(3, 75);
        class285.field5105.method1916(var8.field5027, 100);
        class285.field5105.method1870(0, var8.field5011, var8.field5027, -117);
        class68.field1235 = -3;
        class208.field3735 = 0;
        class283.field5078 = 1;
        class266.field4738 = 0;
    }
}
