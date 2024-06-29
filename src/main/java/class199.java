import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class199 extends class128 {

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "Lqk;")
    public class2 field3036;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "[I")
    public static int[] field3031 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "Z")
    public static boolean field3035 = false;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "Ljava/lang/String;")
    public static String field3034;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)V")
    public static void method1251(int arg0) {
        field3034 = null;
        field3031 = null;
        if (arg0 < 22) {
            method1251(-18);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    public static final void method1252(boolean arg0) {
        if (arg0) {
            class246.field3856 = class184.field2793;
            class185.field2812 = class228.field3576;
        } else {
            class246.field3856 = class174.field2456;
            class185.field2812 = class2.field7;
        }
        class150.field2077 = class246.field3856.length;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lqk;)V")
    public class199(class2 arg0) {
        this.field3036 = arg0;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIZI)V")
    public static final void method1253(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            method1252(true);
        }
        field3032++;
        class39 var5 = class149.method935(-106, arg2, 10);
        var5.method261(0);
        var5.field593 = arg1;
        var5.field598 = arg4;
        var5.field591 = arg0;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZLnh;)V")
    public static final void method1254(boolean arg0, class305 arg1) {
        if (!arg0) {
            method1254(false, (class305) null);
        }
        class10.field136 = arg1;
        field3037++;
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V")
    public static final void method1255(int arg0) {
        field3033++;
        Container var1;
        if (class43.field653 != null) {
            var1 = class43.field653;
        } else if (class31.field469 == null) {
            var1 = class45.field667.field744;
        } else {
            var1 = class31.field469;
        }
        class284.field4553 = var1.getSize().width;
        class39.field590 = var1.getSize().height;
        if (class31.field469 == var1) {
            Insets var2 = class31.field469.getInsets();
            class284.field4553 -= var2.left + var2.right;
            class39.field590 -= var2.top + var2.bottom;
        }
        if (class246.method1611(100) >= 2) {
            class212.field3196 = 0;
            class174.field2460 = class39.field590;
            class11.field186 = 0;
            class218.field3386 = class284.field4553;
        } else {
            class11.field186 = (class284.field4553 - 765) / 2;
            class218.field3386 = 765;
            class212.field3196 = 0;
            class174.field2460 = 503;
        }
        class291.field4645.setSize(class218.field3386, class174.field2460);
        if (arg0 != 13325) {
            field3031 = null;
        }
        if (class31.field469 == var1) {
            Insets var3 = class31.field469.getInsets();
            class291.field4645.setLocation(var3.left + class11.field186, class212.field3196 + var3.top);
        } else {
            class291.field4645.setLocation(class11.field186, class212.field3196);
        }
        if (class104.field1499 != -1) {
            class241.method1587((byte) 120, true);
        }
        class256.method1674(-68);
    }
}
