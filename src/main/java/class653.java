import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class653 {

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field8957 = 0;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "F")
    public static float field8959;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field8960;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public static int field8962;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BZIIII)V")
    public static final void method3687(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class699.field9455 != null && (arg4 != 3 || class185.field2790 != arg2 || class616.field8405 != arg5)) {
            class120.method1044(class699.field9455, class689.field9299, false);
            class699.field9455 = null;
        }
        field8962++;
        int var6 = -33 / ((-arg0 - 74) / 51);
        if (arg4 == 3 && class699.field9455 == null) {
            class699.field9455 = class238.method1653(arg5, arg2, class689.field9299, 0, 14199, 0);
            if (class699.field9455 != null) {
                class185.field2790 = arg2;
                class616.field8405 = arg5;
                class310.method2019(37);
            }
        }
        if (arg4 == 3 && class699.field9455 == null) {
            method3687((byte) -126, true, -1, arg3, class693.field9368.field4424.method3495(-32350), -1);
            return;
        }
        Container var7;
        if (class699.field9455 != null) {
            class751.field10508 = arg5;
            class288.field4004 = arg2;
            var7 = class699.field9455;
        } else if (class684.field9263 == null) {
            if (class675.field9193 == null) {
                var7 = class566.field7798;
            } else {
                var7 = class675.field9193;
            }
            class288.field4004 = var7.getSize().width;
            class751.field10508 = var7.getSize().height;
        } else {
            Insets var8 = class684.field9263.getInsets();
            int var10001 = -var8.right;
            class288.field4004 = class684.field9263.getSize().width + var10001 - var8.left;
            int var11 = var8.top + var8.bottom;
            class751.field10508 = class684.field9263.getSize().height - var11;
            var7 = class684.field9263;
        }
        if (arg4 == 1) {
            class467.field6559 = class478.field6661;
            class582.field7968 = class22.field488;
            class688.field9288 = (class288.field4004 - class478.field6661) / 2;
            class14.field244 = 0;
        } else {
            class700.method3913((byte) 56);
        }
        if (class740.field9967 != class436.field6234) {
            boolean var10000;
            if (class467.field6559 < 1024 && class582.field7968 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg1) {
            class564.method3274(1406);
        } else {
            class458.field6458.setSize(class467.field6559, class582.field7968);
            if (class241.field3529) {
                class281.method1850(86, class458.field6458);
            } else {
                class272.field3822.method280(class458.field6458, class467.field6559, class582.field7968);
            }
            if (class684.field9263 == var7) {
                Insets var9 = class684.field9263.getInsets();
                class458.field6458.setLocation(class688.field9288 + var9.left, var9.top - -class14.field244);
            } else {
                class458.field6458.setLocation(class688.field9288, class14.field244);
            }
        }
        if (arg4 < 2) {
            class216.field3132 = false;
        } else {
            class216.field3132 = true;
        }
        if (class184.field2784 != -1) {
            class212.method1455(true, 520);
        }
        if (class512.field7137 != null && class511.method2997(true, class214.field3036)) {
            class128.method1065(-24498);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class286.field3995[var10] = true;
        }
        class647.field8905 = true;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IC)Z")
    public static final boolean method3688(int arg0, char arg1) {
        field8961++;
        if (arg0 >= -18) {
            return false;
        } else {
            return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public static final void method3689(int arg0) {
        field8960++;
        if (arg0 != 7851) {
            return;
        }
        try {
            if (class326.field4513 == 1) {
                int var1 = class266.field3769.method74((byte) 123);
                if (var1 > 0 && class266.field3769.method91(124)) {
                    int var2 = var1 - class394.field5789;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class266.field3769.method93(0, var2);
                    return;
                }
                class266.field3769.method110(-128);
                class266.field3769.method99(arg0 ^ 0x1EAF);
                class119.field2023 = null;
                if (class37.field915 == null) {
                    class326.field4513 = 0;
                } else {
                    class326.field4513 = 2;
                }
                class369.field5254 = null;
            }
            if (class326.field4513 == 3) {
                int var3 = class266.field3769.method74((byte) -87);
                if (var3 < class273.field3839 && class266.field3769.method91(95)) {
                    int var4 = class383.field5557 + var3;
                    if (var4 > class273.field3839) {
                        var4 = class273.field3839;
                    }
                    class266.field3769.method93(arg0 ^ 0x1EAB, var4);
                } else {
                    class383.field5557 = 0;
                    class326.field4513 = 0;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class266.field3769.method110(-128);
            class37.field915 = null;
            class369.field5254 = null;
            class539.field7455 = null;
            class119.field2023 = null;
            class326.field4513 = 0;
        }
    }
}
