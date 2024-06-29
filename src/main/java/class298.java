import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class298 {

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Lna;")
    public static class26 field5135 = class69.method505("Memory before cleanup=", (byte) -122);

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Lna;")
    public static class26 field5141 = class69.method505("Mem:", (byte) -127);

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "Lse;")
    public static class12 field5133;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Lfd;")
    public static class242 field5136;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "Lve;")
    public static class266 field5139;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "[Lee;")
    public static class279[] field5137;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 24)
    public static void method2104(int arg0) {
        field5136 = null;
        field5133 = null;
        field5137 = null;
        field5141 = null;
        field5139 = null;
        field5135 = null;
        if (arg0 != -14256) {
            method2104(46);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V", line = 42)
    public static final void method2105(boolean arg0) {
        Container var1;
        if (class198.field3075 != null) {
            var1 = class198.field3075;
        } else if (class142.field2172 == null) {
            var1 = class45.field712.field2431;
        } else {
            var1 = class142.field2172;
        }
        field5138++;
        class224.field3562 = var1.getSize().width;
        class267.field4407 = var1.getSize().height;
        if (class142.field2172 == var1) {
            Insets var2 = class142.field2172.getInsets();
            class267.field4407 -= var2.top + var2.bottom;
            class224.field3562 -= var2.right + var2.left;
        }
        if (class243.method1677(0) >= 2) {
            class38.field622 = class224.field3562;
            class124.field1928 = 0;
            class25.field362 = 0;
            class141.field2153 = class267.field4407;
        } else {
            class25.field362 = 0;
            class124.field1928 = (class224.field3562 - 765) / 2;
            class141.field2153 = 503;
            class38.field622 = 765;
        }
        if (class255.field4184) {
            class255.method1794(class38.field622, class141.field2153);
        }
        class250.field4085.setSize(class38.field622, class141.field2153);
        if (class142.field2172 == var1) {
            Insets var3 = class142.field2172.getInsets();
            class250.field4085.setLocation(class124.field1928 + var3.left, class25.field362 + var3.top);
        } else {
            class250.field4085.setLocation(class124.field1928, class25.field362);
        }
        if (class250.field4095 != -1) {
            class220.method1480(true, (byte) -125);
        }
        if (!arg0) {
            method2104(39);
        }
        class295.method2076(-1);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lll;B)V", line = 108)
    public static final void method2106(class156 arg0, byte arg1) {
        field5134++;
        if (arg1 != 14) {
            return;
        }
        class231 var2 = null;
        try {
            class180 var3 = arg0.method1052("runescape", 12);
            while (var3.field2811 == 0) {
                class126.method862(1L, 64);
            }
            if (var3.field2811 == 1) {
                var2 = (class231) var3.field2812;
                class82 var4 = class38.method314((byte) -116);
                var2.method1558(116, var4.field1280, var4.field1301, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1555(1);
            }
        } catch (Exception var7) {
        }
    }
}
