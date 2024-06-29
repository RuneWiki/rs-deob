import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class254 {

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "[I")
    public static int[] field4042 = new int[100];

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "[[Z")
    public static boolean[][] field4040;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZIILqh;I)V")
    public static final void method1727(int arg0, boolean arg1, int arg2, int arg3, class201 arg4, int arg5) {
        class244.field3917 = arg4;
        class132.field2119 = arg0;
        class94.field1549 = arg3;
        if (arg5 != 10905) {
            method1729(true, 13, -77, 11, 4, false, -126);
        }
        class99.field1623 = 10000;
        class133.field2127 = arg1;
        field4037++;
        class285.field4512 = arg2;
        class220.field3599 = 1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method1728(int arg0) {
        if (arg0 == -1) {
            field4040 = null;
            field4042 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZIIIIZI)V")
    public static final void method1729(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field4038++;
        if (arg6 == 3) {
            method1729(true, -1, 0, -1, arg4, true, class282.field4463);
            return;
        }
        Container var7;
        if (class77.field1234 != null) {
            var7 = class77.field1234;
        } else if (class110.field1811 == null) {
            var7 = class105.field1684.field2620;
        } else {
            var7 = class110.field1811;
        }
        class255.field4048 = var7.getSize().width;
        class258.field4099 = var7.getSize().height;
        if (class110.field1811 == var7) {
            Insets var8 = class110.field1811.getInsets();
            class255.field4048 -= var8.right + var8.left;
            class258.field4099 -= var8.top + var8.bottom;
        }
        if (arg6 >= 2) {
            class279.field4423 = class258.field4099;
            class236.field3842 = 0;
            class198.field3163 = 0;
            class84.field1326 = class255.field4048;
        } else {
            class236.field3842 = (class255.field4048 - 765) / 2;
            class198.field3163 = 0;
            class279.field4423 = 503;
            class84.field1326 = 765;
        }
        if (arg5) {
            class118.method867(class155.field2511, 28);
            class123.method887(arg2 + 125, class155.field2511);
            if (class146.field2347 != null) {
                class146.field2347.method1690(class155.field2511, (byte) 103);
            }
            class105.field1689.method1260(arg2 - 2);
            class124.method891((byte) -11, class155.field2511);
            class157.method1099(class155.field2511, 5926);
            if (class146.field2347 != null) {
                class146.field2347.method1689(43, class155.field2511);
            }
        } else {
            class155.field2511.setSize(class84.field1326, class279.field4423);
            if (class110.field1811 == var7) {
                Insets var9 = class110.field1811.getInsets();
                class155.field2511.setLocation(class236.field3842 + var9.left, class198.field3163 + var9.top);
            } else {
                class155.field2511.setLocation(class236.field3842, class198.field3163);
            }
        }
        if (arg6 > 0) {
            method1729(true, -1, arg2, -1, arg4, true, 0);
            return;
        }
        class233.field3812 = !class257.method1757(-5);
        if (class157.field2548 != -1) {
            class271.method1836(true, -94);
        }
        if (class5.field69 != null && (class273.field4336 == 30 || class273.field4336 == 25)) {
            class205.method1413((byte) -105);
        }
        for (int var10 = arg2; var10 < 100; var10++) {
            class275.field4352[var10] = true;
        }
        class245.field3923 = true;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static final void method1730(int arg0) {
        field4039++;
        if (class13.field243 != null) {
            class13.field243.method1192(-19615);
        }
        if (class74.field1203 != null) {
            class74.field1203.method1192(-19615);
        }
        if (arg0 >= -46) {
            field4042 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;I)Ldf;")
    public static final class55 method1731(String arg0, int arg1) {
        field4041++;
        for (class55 var2 = (class55) class9.field117.method843(73); var2 != null; var2 = (class55) class9.field117.method852((byte) 123)) {
            if (var2.field930.equals(arg0)) {
                return var2;
            }
        }
        if (arg1 <= 79) {
            field4042 = null;
        }
        return null;
    }
}
