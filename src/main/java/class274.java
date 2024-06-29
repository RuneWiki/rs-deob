import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class274 {

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Lha;")
    public static class46 field4786 = class271.method1828("blinken1:", -46);

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Lha;")
    public static class46 field4787 = class271.method1828("<img=0>", -46);

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lha;")
    private static class46 field4788 = class271.method1828("Loading fonts )2 ", -46);

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Lha;")
    public static class46 field4785 = class271.method1828("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", -46);

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Lha;")
    public static class46 field4790 = field4788;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Lha;")
    public static class46 field4789 = class271.method1828("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", -46);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static final void method1850(byte arg0) {
        class23.field327.method83(25216);
        if (arg0 != -60) {
            field4789 = null;
        }
        field4781++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILha;)I")
    public static final int method1851(int arg0, class46 arg1) {
        field4783++;
        int var2 = -70 / ((arg0 - 59) / 50);
        if (arg1 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < class97.field1806; var3++) {
            if (arg1.method315((byte) -38, class3.field37[var3])) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method1852(int arg0) {
        int var1 = 105 / ((arg0 - 34) / 58);
        field4786 = null;
        field4785 = null;
        field4788 = null;
        field4790 = null;
        field4787 = null;
        field4789 = null;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
    public static final void method1853(byte arg0) {
        if (arg0 != 36) {
            method1853((byte) -98);
        }
        field4782++;
        if (class48.field830 != null) {
            class210 var1 = class48.field830;
            synchronized (class48.field830) {
                class48.field830 = null;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIII)V")
    public static final void method1854(int arg0, int arg1, int arg2, int arg3) {
        class201 var4 = class111.field2080[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class168 var5 = var4.field3606;
        if (var5 != null) {
            var5.field2960 = var5.field2960 * arg3 / 16;
            var5.field2955 = var5.field2955 * arg3 / 16;
        }
    }
}
