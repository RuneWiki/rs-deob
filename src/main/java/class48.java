import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class48 {

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Lqc;")
    public static class245 field867 = new class245(100);

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "[I")
    public static int[] field870 = new int[5];

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)I")
    public static final int method337(byte arg0) {
        field864++;
        return arg0 <= 36 ? 13 : class203.field3486;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V")
    public static void method338(byte arg0) {
        int var1 = -4 / ((arg0 + 62) / 37);
        field867 = null;
        field870 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZLcj;)Lvj;")
    public static final class219 method339(int arg0, boolean arg1, class28 arg2) {
        if (!arg1) {
            field867 = null;
        }
        field866++;
        byte[] var3 = arg2.method156(0, arg0);
        return var3 == null ? null : new class219(var3);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static final void method340(int arg0) {
        field869++;
        for (int var1 = 0; var1 < 5; var1++) {
            class44.field774[var1] = false;
        }
        class167.field2995 = 1;
        if (arg0 == -10937) {
            class181.field3171 = -1;
            class238.field4135 = -1;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
    public static final void method341(int arg0, int arg1) {
        Container var2;
        if (class7.field58 != null) {
            var2 = class7.field58;
        } else if (class158.field2857 == null) {
            var2 = class95.field1835.field2184;
        } else {
            var2 = class158.field2857;
        }
        field862++;
        class154.field2747 = var2.getSize().width;
        class28.field425 = var2.getSize().height;
        if (class158.field2857 == var2) {
            Insets var3 = class158.field2857.getInsets();
            class154.field2747 -= var3.right + var3.left;
            class28.field425 -= var3.top + var3.bottom;
        }
        if (arg1 >= -77) {
            method337((byte) -81);
        }
        class12.field143 = 503;
        class164.field2939 = class181.field3166;
        class242.field4240 = (class154.field2747 - 765) / 2;
        class19.field257 = 765;
        class131.field2452.setSize(class19.field257, class12.field143);
        if (class158.field2857 == var2) {
            Insets var4 = class158.field2857.getInsets();
            class131.field2452.setLocation(class242.field4240 + var4.left, class164.field2939 + var4.top);
        } else {
            class131.field2452.setLocation(class242.field4240, class164.field2939);
        }
        if (class150.field2702 != -1) {
            class253.method1701(true, 640);
        }
        class145.method994(0);
        if (class117.field2182.startsWith("mac")) {
            class3.field40 = class3.method13(17161) + (long) arg0;
        }
        class64.field1258 = class3.method13(17161) + ((long) arg0);
        if (arg0 == 0 && class101.field1972 != null && class244.field4258 == 30 || class244.field4258 == 25) {
            class77.method551((byte) -118);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIZII)V")
    public static final void method342(byte arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field868++;
        if (class164.method1107(arg4, (byte) -2)) {
            class217.method1398(-1, arg1, arg2, false, arg3, class31.field466[arg4]);
            if (arg0 != 99) {
                method340(-17);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V")
    public static final void method343(int arg0, byte arg1) {
        field865++;
        int var2 = -111 / ((arg1 + 48) / 49);
        class15 var3 = (class15) class84.field1631.method1381((long) arg0, 74);
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field195.length; var4++) {
                var3.field195[var4] = -1;
                var3.field192[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
    public static final void method344(int arg0) {
        class252.field4433.method1613((byte) 94);
        field863++;
        if (arg0 != 25580) {
            field867 = null;
        }
    }
}
