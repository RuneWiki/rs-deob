import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class237 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field4127 = 20;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field4134 = 0;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "Lvf;")
    public static class265 field4137 = class87.method582(-46, "Jeter");

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "Lvf;")
    private static class265 field4139 = class87.method582(-46, "level: ");

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "Lvf;")
    public static class265 field4138 = class87.method582(-46, "(U5");

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "Lvf;")
    public static class265 field4128 = class87.method582(-46, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Lvf;")
    private static class265 field4132 = class87.method582(-46, "Loaded sprites");

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Lvf;")
    public static class265 field4129 = field4132;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "Lvf;")
    public static class265 field4144 = field4139;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field4143 = -1;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "[Lcg;")
    public static class34[] field4142;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
    public static final void method1579(int arg0, int arg1) {
        field4130++;
        class193.field3476.method1891(-23549, arg1);
        if (arg0 != 4) {
            method1581((byte) -88);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static final void method1580(byte arg0) {
        field4131++;
        class139.field2533.method1893(-19);
        class81.field1526.method1893(arg0 ^ 0x14);
        class169.field3055.method1893(-108);
        if (arg0 != -3) {
            method1584(-19, (byte) -109, -87);
        }
        class264.field4599.method1893(-54);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V")
    public static void method1581(byte arg0) {
        field4132 = null;
        field4137 = null;
        field4129 = null;
        field4144 = null;
        field4138 = null;
        field4139 = null;
        field4142 = null;
        if (arg0 != 57) {
            method1580((byte) -84);
        }
        field4128 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lvf;I)Z")
    public static final boolean method1582(class265 arg0, int arg1) {
        field4136++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 < 37) {
            field4144 = null;
        }
        for (int var2 = 0; var2 < class262.field4582; var2++) {
            if (arg0.method1791(class110.field1928[var2], (byte) -98)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZI)V")
    public static final void method1583(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            method1581((byte) 10);
        }
        class178 var4 = class188.method1282(arg1, 4, 261360480);
        field4135++;
        var4.method1162(true);
        var4.field3170 = arg0;
        var4.field3172 = arg3;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBI)V")
    public static final void method1584(int arg0, byte arg1, int arg2) {
        field4133++;
        class178 var3 = class188.method1282(arg2, 12, 261360480);
        var3.method1162(true);
        var3.field3172 = arg0;
        if (arg1 != 60) {
            field4127 = 90;
        }
    }
}
