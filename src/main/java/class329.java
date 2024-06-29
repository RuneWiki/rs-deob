import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class329 {

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "[I")
    public int[] field4288 = new int[100];

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "[Lgn;")
    public class598[] field4289 = new class598[100];

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "[Lcba;")
    public class469[] field4293 = new class469[8];

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "[I")
    public int[] field4299 = new int[3];

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "[I")
    public static int[] field4292 = new int[1];

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "[I")
    public static int[] field4298 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "Lcu;")
    public static class185 field4297 = new class185(4, 5);

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "[I")
    public static int[] field4301 = new int[2];

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    public int field4296;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field4290;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V", line = 4)
    public static void method1852(byte arg0) {
        field4301 = null;
        field4297 = null;
        field4298 = null;
        field4292 = null;
        int var1 = -93 / ((-arg0 - 3) / 37);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Los;I)Lgk;", line = 17)
    public static final class402 method1853(class374 arg0, int arg1) {
        field4294++;
        class402 var2 = new class402();
        if (arg1 != 23804) {
            field4292 = null;
        }
        var2.field5284 = arg0.method2136(false);
        var2.field5283 = class191.field2300.method1427(var2.field5284, 24845);
        return var2;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BI)V", line = 33)
    public static final void method1854(byte arg0, int arg1) {
        class45.field389 = arg1;
        field4300++;
        if (arg0 > -18) {
            method1855(100);
        }
        class314.field4009 = -1;
        class289.field3752 = 3;
        class382.field5054 = 100;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V", line = 54)
    public static final void method1855(int arg0) {
        field4291++;
        if (arg0 != 18557) {
            return;
        }
        class379 var1 = (class379) class5.field43.method1050((byte) 73);
        boolean var2 = class289.field3757 != null || class141.field1705 > 0;
        if (var2) {
            class197.field2385 = 1;
        }
        if (class236.field2894 && class443.field6109.method185(53, 81) && class199.field2397 > 2) {
            if (var2) {
                class34.field269 = (class99) class89.field1096.field2331.field7965.field7965;
            } else {
                class476.method2776(var1.method701(5), (class99) class89.field1096.field2331.field7965.field7965, var1.method705(arg0 - 18552), arg0 ^ 0x2684);
            }
        } else if (var2) {
            class34.field269 = (class99) class89.field1096.field2331.field7965;
        } else {
            class476.method2776(var1.method701(5), (class99) class89.field1096.field2331.field7965, var1.method705(5), 28409);
        }
    }
}
