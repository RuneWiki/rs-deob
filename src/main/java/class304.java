import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class304 extends class45 {

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public int field4869 = 0;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
    public int field4877 = -1;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "[I")
    public static int[] field4868 = new int[32];

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
    public static int field4870 = -1;

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
    public static int field4882 = -1;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public int field4867;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
    public int field4871;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    public int field4872;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "I")
    public int field4873;

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
    public int field4875;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "I")
    public int field4876;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "I")
    public int field4879;

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "I")
    public int field4883;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "I")
    public int field4884;

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "I")
    public int field4885;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "Lna;")
    public static class145 field4866;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(B)V", line = 4)
    public static final void method2169(byte arg0) {
        field4878++;
        int var1 = class92.field1556;
        int var2 = class259.field4361;
        int var3 = class178.field2858;
        int var4 = class24.field289;
        if (arg0 < 37) {
            field4882 = 112;
        }
        int var5 = 6116423;
        if (class42.field607) {
            class244.method1862(var2, var3, var1, var4, var5);
            class244.method1862(var2 + 1, var3 + 1, var1 - 2, 16, 0);
            class244.method1865(var2 + 1, var3 + 18, var1 - 2, var4 + -19, 0);
        } else {
            class246.method1885(var2, var3, var1, var4, var5);
            class246.method1885(var2 + 1, var3 + 1, var1 - 2, 16, 0);
            class246.method1881(var2 + 1, var3 + 18, var1 - 2, var4 + -19, 0);
        }
        class109.field1792.method1332(class209.field3284, var2 + 3, var3 + 14, var5, -1);
        int var6 = class333.field5275;
        int var7 = class77.field1343;
        for (int var8 = 0; var8 < class104.field1683; var8++) {
            int var9 = (class104.field1683 - var8 - 1) * 15 + var3 + 31;
            int var10 = 16777215;
            if (var2 < var6 && (var1 + var2) > var6 && var7 > (var9 - 13) && var7 < var9 + 3) {
                var10 = 16776960;
            }
            class109.field1792.method1332(class6.method23(56, var8), var2 + 3, var9, var10, 0);
        }
        class117.method923(class259.field4361, class92.field1556, 0, class24.field289, class178.field2858);
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(B)V", line = 61)
    public static void method2170(byte arg0) {
        field4868 = null;
        int var1 = -12 / ((arg0 + 24) / 52);
        field4866 = null;
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(B)V", line = 75)
    public static final void method2171(byte arg0) {
        field4881++;
        Container var1;
        if (class89.field1502 != null) {
            var1 = class89.field1502;
        } else if (class241.field3994 == null) {
            var1 = class128.field2163.field2350;
        } else {
            var1 = class241.field3994;
        }
        class117.field1969 = var1.getSize().width;
        class129.field2188 = var1.getSize().height;
        if (class241.field3994 == var1) {
            Insets var2 = class241.field3994.getInsets();
            class129.field2188 -= var2.top + var2.bottom;
            class117.field1969 -= var2.right + var2.left;
        }
        if (class275.method2052((byte) -115) < 2) {
            class298.field4779 = 765;
            class313.field4976 = (class117.field1969 - 765) / 2;
            class252.field4266 = 503;
            class190.field3048 = 0;
        } else {
            class313.field4976 = 0;
            class190.field3048 = 0;
            class298.field4779 = class117.field1969;
            class252.field4266 = class129.field2188;
        }
        if (class42.field607) {
            class42.method291(class298.field4779, class252.field4266);
        }
        class151.field2402.setSize(class298.field4779, class252.field4266);
        if (arg0 != -23) {
            field4870 = 45;
        }
        if (class241.field3994 == var1) {
            Insets var3 = class241.field3994.getInsets();
            class151.field2402.setLocation(class313.field4976 + var3.left, class190.field3048 + var3.top);
        } else {
            class151.field2402.setLocation(class313.field4976, class190.field3048);
        }
        if (field4870 != -1) {
            class14.method83((byte) 116, true);
        }
        class143.method1098(17);
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V", line = 148)
    public static final void method2172(int arg0) {
        if (arg0 != 2) {
            field4870 = 100;
        }
        class321.field5105.method2327(1);
        field4880++;
        class360.field5702.method2327(1);
        class2.field10.method2327(1);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIIIII)Z", line = 163)
    public static final boolean method2173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4874++;
        if (arg8 != -13) {
            return true;
        } else if (arg1 < arg4 + arg7 && arg4 < (arg1 + arg5)) {
            return arg3 < (arg0 + arg2) && arg0 < (arg3 + arg6);
        } else {
            return false;
        }
    }
}
