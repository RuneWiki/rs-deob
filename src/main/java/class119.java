import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class119 {

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lok;")
    public static class41 field1753 = class137.method956("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", 45);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lok;")
    public static class41 field1742 = class137.method956(" GMT", 45);

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lok;")
    public static class41 field1754 = class137.method956("mapdots", 45);

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Lok;")
    public static class41 field1747 = class137.method956("leuchten1:", 45);

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Lok;")
    public static class41 field1755 = class137.method956("ul", 45);

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lok;")
    public static class41 field1744 = class137.method956("Bitte entfernen Sie ", 45);

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lok;")
    public static class41 field1750 = class137.method956("Sprites geladen)3", 45);

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Lok;")
    public static class41 field1751 = class137.method956("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 45);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Lmh;")
    public static class65 field1757;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "[I")
    public static int[] field1749;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "[Lok;")
    public static class41[] field1752;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILlb;)Lok;", line = 5)
    public static final class41 method850(int arg0, class112 arg1) {
        if (arg0 == -2) {
            field1743++;
            return class250.method1774(32767, arg1, (byte) -10);
        } else {
            return (class41) null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 26)
    public static void method851(int arg0) {
        field1757 = null;
        field1753 = null;
        field1749 = null;
        if (arg0 != 16193) {
            return;
        }
        field1751 = null;
        field1752 = null;
        field1742 = null;
        field1754 = null;
        field1744 = null;
        field1750 = null;
        field1747 = null;
        field1755 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lie;III)V", line = 66)
    public static final void method852(class50 arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 30) {
            field1750 = (class41) null;
        }
        if (arg0.field4300 == arg1 && arg1 != -1) {
            class205 var4 = class285.method2000(arg1, 4442);
            int var5 = var4.field3314;
            if (var5 == 1) {
                arg0.field4338 = 0;
                arg0.field4292 = arg2;
                arg0.field4312 = 0;
                arg0.field4288 = 0;
                class148.method1026(arg0.field4311, arg0.field4338, arg0.field4280, var4, -92, false);
            }
            if (var5 == 2) {
                arg0.field4312 = 0;
            }
        } else if (arg1 == -1 || arg0.field4300 == -1 || class285.method2000(arg1, 4442).field3326 >= class285.method2000(arg0.field4300, 4442).field3326) {
            arg0.field4288 = 0;
            arg0.field4312 = 0;
            arg0.field4295 = arg0.field4322;
            arg0.field4338 = 0;
            arg0.field4300 = arg1;
            arg0.field4292 = arg2;
            if (arg0.field4300 != -1) {
                class148.method1026(arg0.field4311, arg0.field4338, arg0.field4280, class285.method2000(arg0.field4300, 4442), 75, false);
            }
        }
        field1746++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lof;B)V", line = 139)
    public static final void method853(class245 arg0, byte arg1) {
        int var2 = -75 / ((arg1 - 77) / 45);
        class149 var3 = (class149) class283.field4599.method617(arg0.field3933.method291((byte) 65), false);
        field1748++;
        if (var3 == null) {
            return;
        }
        if (var3.field2305 != null) {
            class225.field3596.method1421(var3.field2305);
            var3.field2305 = null;
        }
        var3.method418(6971);
    }
}
