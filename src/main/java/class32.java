import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class32 extends class74 {

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Lad;")
    public static class19 field308 = new class19(8);

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Z")
    public static boolean field310;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static final void method165(int arg0) {
        field309++;
        class679.method3766(class639.field9075.field6784, 22050, 2, (byte) 104);
        class257.field3238 = new class96();
        class257.field3238.method499(9, -14284, 128);
        class39.field394 = class327.method1841(class41.field407, class353.field4757, (byte) 54, 0, 22050);
        class39.field394.method3548((byte) -95, class257.field3238);
        class106.method576(class392.field5317, true, class461.field6558, class257.field3238, class164.field1828);
        class637.field8964 = class327.method1841(class41.field407, class353.field4757, (byte) 54, arg0, 2048);
        class209.field2471 = new class702();
        class637.field8964.method3548((byte) -115, class209.field2471);
        class203.field2397 = new class271(22050, class224.field2776);
        class699.field9802 = class536.field7504.method3875("scape main", (byte) -84);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lnp;I)Ldt;")
    public static final class225 method166(class115 arg0, int arg1) {
        if (arg1 == 1920) {
            field307++;
            class631 var2 = class131.method743(arg0, (byte) 79);
            int var3 = arg0.method676(-5);
            return new class225(var2.field1965, var2.field1962, var2.field1967, var2.field1970, var2.field1972, var2.field1971, var2.field1973, var2.field1969, var2.field1968, var2.field8876, var2.field8877, var2.field8870, var2.field8868, var2.field8872, var2.field8871, var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIB)B")
    public static final byte method167(int arg0, int arg1, byte arg2) {
        if (arg2 != -54) {
            return 49;
        }
        field306++;
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public static final void method168(byte arg0, String arg1, int arg2) {
        field311++;
        class76 var3 = class3.method28(3, (byte) 42, arg2);
        if (arg0 <= 72) {
            field308 = null;
        }
        var3.method403((byte) -114);
        var3.field790 = arg1;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
    public static void method169(boolean arg0) {
        if (arg0) {
            method168((byte) 9, null, -125);
        }
        field308 = null;
    }
}
