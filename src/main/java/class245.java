import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class245 {

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Llaa;")
    public static class106 field3486 = new class106(6, 0, 4, 2);

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "[[I")
    public static int[][] field3494 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "[I")
    public static int[] field3496 = new int[2];

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public int field3485;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public int field3491;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public int field3492;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public int field3495;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "[I")
    public static int[] field3497;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)I", line = 8)
    public static final int method1515(int arg0, int arg1) {
        if (arg0 != 1023) {
            method1519(42, -75, 105);
        }
        field3487++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 20)
    public static final void method1516(int arg0) {
        field3484++;
        if (arg0 != 5) {
            method1516(-5);
        }
        if (class340.field4947 == 9) {
            class94.method690(5, (byte) 125);
        } else if (class340.field4947 == 5 || class340.field4947 == 6) {
            class94.method690(3, (byte) 125);
        } else if (class340.field4947 == 12) {
            class94.method690(3, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 48)
    public static final void method1517(int arg0) {
        field3493++;
        if (class164.field2504 != null) {
            return;
        }
        if (arg0 != -769) {
            field3494 = null;
        }
        Container var1;
        if (class166.field2513 != null) {
            var1 = class166.field2513;
        } else if (class188.field2779 == null) {
            var1 = class374.field5299;
        } else {
            var1 = class188.field2779;
        }
        class43.field650 = var1.getSize().width;
        class693.field9716 = var1.getSize().height;
        if (class166.field2513 == var1) {
            Insets var2 = class166.field2513.getInsets();
            class43.field650 -= var2.right + var2.left;
            class693.field9716 -= var2.top + var2.bottom;
        }
        if (class402.method2292(true) == 1) {
            class486.field6753 = (class43.field650 - class652.field9217) / 2;
            class124.field1711 = class603.field8386;
            class547.field7412 = class652.field9217;
            class508.field6968 = 0;
        } else {
            class328.method1993((byte) -10);
        }
        if (class500.field6862 != class112.field1530) {
            boolean var10000;
            if (class547.field7412 < 1024 && class124.field1711 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class105.field1413.setSize(class547.field7412, class124.field1711);
        if (class630.field8790 != null) {
            class630.field8790.method395(class105.field1413);
        }
        if (class166.field2513 == var1) {
            Insets var3 = class166.field2513.getInsets();
            class105.field1413.setLocation(class486.field6753 + var3.left, class508.field6968 + var3.top);
        } else {
            class105.field1413.setLocation(class486.field6753, class508.field6968);
        }
        if (class677.field9551 != -1) {
            class22.method112(true, 30);
        }
        class457.method2639((byte) 109);
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V", line = 128)
    public static void method1518(int arg0) {
        if (arg0 == 5) {
            field3497 = null;
            field3496 = null;
            field3486 = null;
            field3494 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)Z", line = 148)
    public static final boolean method1519(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method1517(64);
        }
        field3488++;
        return (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIILfaa;)V", line = 162)
    public static final void method1520(int arg0, int arg1, int arg2, class140 arg3) {
        field3489++;
        if (arg3 == null || arg0 != 20316) {
            return;
        }
        if (arg3.field2083 != null) {
            class388 var4 = new class388();
            var4.field5451 = arg3.field2083;
            var4.field5443 = arg3;
            class523.method2890(var4);
        }
        class117.field1560 = arg3.field1969;
        class677.field9549 = arg3.field2100;
        class457.field6455 = true;
        class561.field7575 = arg3.field2123;
        class36.field449 = arg1;
        class130.field1787 = arg3.field1963;
        class366.field5205 = arg3.field2092;
        class414.field5858 = arg2;
        class432.method2481(arg3, 127);
    }
}
