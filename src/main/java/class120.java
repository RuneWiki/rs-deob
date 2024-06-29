import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class120 {

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Z")
    public static boolean field1967 = true;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public int field1963;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public int field1966;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public int field1969;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "[Lfm;")
    public static class626[] field1964;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method838(int arg0) {
        field1964 = null;
        if (arg0 != 1024) {
            method838(65);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIBIIIIII)Z")
    public static final boolean method839(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1965++;
        if (arg0 >= (arg1 + arg5) || arg5 >= (arg0 + arg7)) {
            return false;
        } else if (arg6 + arg8 > arg3 && arg3 + arg4 > arg8) {
            return arg2 == -12;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static final void method840(byte arg0) {
        field1968++;
        if (class87.field1383 != null) {
            return;
        }
        Container var1;
        if (class233.field3284 == null) {
            var1 = class500.field6968.field3975;
        } else {
            var1 = class233.field3284;
        }
        class342.field4611 = var1.getSize().width;
        class178.field2543 = var1.getSize().height;
        if (class233.field3284 == var1) {
            Insets var2 = class233.field3284.getInsets();
            class342.field4611 -= var2.left + var2.right;
            class178.field2543 -= var2.top + var2.bottom;
        }
        if (class486.method2827(47) == 1) {
            class272.field3787 = 0;
            class387.field5196 = class209.field2954;
            class32.field519 = (class342.field4611 - class209.field2954) / 2;
            class134.field2128 = class78.field1266;
        } else if (class366.field4987 < 96 && class103.field1570 == 0) {
            int var3 = class342.field4611 > 1024 ? 1024 : class342.field4611;
            int var4 = class178.field2543 <= 768 ? class178.field2543 : 768;
            class387.field5196 = var3;
            class32.field519 = (class342.field4611 - var3) / 2;
            class272.field3787 = 0;
            class134.field2128 = var4;
        } else {
            class272.field3787 = 0;
            class134.field2128 = class178.field2543;
            class387.field5196 = class342.field4611;
            class32.field519 = 0;
        }
        if (class71.field1181 != class53.field988) {
            boolean var10000;
            if (class387.field5196 < 1024 && class134.field2128 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg0 != 41) {
            method838(-128);
        }
        class166.field2390.setSize(class387.field5196, class134.field2128);
        if (class69.field1165 != null) {
            class69.field1165.method1275(class166.field2390);
        }
        if (class233.field3284 == var1) {
            Insets var5 = class233.field3284.getInsets();
            class166.field2390.setLocation(class32.field519 + var5.left, class272.field3787 + var5.top);
        } else {
            class166.field2390.setLocation(class32.field519, class272.field3787);
        }
        if (class56.field1005 != -1) {
            class443.method2621(true, false);
        }
        class312.method1950(false);
    }
}
