import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class553 {

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field7629 = 0;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Z")
    public static final boolean method3138(byte arg0) {
        field7630++;
        class176 var1 = class448.field6352.field892.field2519;
        if (var1 == null || class448.field6352.field892 == var1) {
            return false;
        }
        class442 var2 = (class442) var1;
        int var3 = -41 % ((62 - arg0) / 43);
        if (var2.field6298 >= 2000) {
            var2.field6298 -= 2000;
        }
        return var2.field6298 == 1009;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)Z")
    public static final boolean method3139(boolean arg0) {
        field7631++;
        if (!arg0) {
            return false;
        }
        try {
            if (class112.field1726 == 2) {
                if (class646.field9384 == null) {
                    class646.field9384 = class216.method1401(class291.field4011, class467.field6585, class5.field70);
                    if (class646.field9384 == null) {
                        return false;
                    }
                }
                if (class557.field7728 == null) {
                    class557.field7728 = new class489(class551.field7611, class538.field7523);
                }
                if (class218.field3105.method3481(22050, class496.field6938, false, class557.field7728, class646.field9384)) {
                    class218.field3105.method3500(21287);
                    class218.field3105.method3488((byte) 119, class47.field903);
                    class218.field3105.method3487(!arg0, class646.field9384, class503.field6996);
                    class291.field4011 = null;
                    class112.field1726 = 0;
                    class557.field7728 = null;
                    class646.field9384 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class218.field3105.method3468(27881);
            class646.field9384 = null;
            class112.field1726 = 0;
            class291.field4011 = null;
            class557.field7728 = null;
        }
        return false;
    }
}
