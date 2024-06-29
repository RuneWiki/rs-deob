import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class223 {

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "Lob;")
    public static class141 field4208 = class175.method1195(40, ")1j");

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "[Lob;")
    public static class141[] field4210 = new class141[500];

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Lob;")
    public static class141 field4213 = class175.method1195(40, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Lob;")
    private static class141 field4212 = class175.method1195(40, "Players");

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "[Z")
    public static boolean[] field4211 = new boolean[100];

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lob;")
    public static class141 field4209 = field4212;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Lob;")
    public static class141 field4214 = class175.method1195(40, "(U0a )2 via: ");

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Lpi;")
    public static class158 field4207 = new class158();

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Lob;")
    public static class141 field4216 = class175.method1195(40, "Stufe)2");

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "[Lob;")
    public static class141[] field4217 = new class141[100];

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Lob;")
    private static class141 field4218 = class175.method1195(40, "wishes to trade with you)3");

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "[I")
    public static int[] field4220 = new int[1000];

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Lob;")
    public static class141 field4215 = field4218;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "[Lra;")
    public static class170[] field4219;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static final void method1434(byte arg0) {
        field4206++;
        for (class32 var1 = (class32) class30.field575.method1103((byte) -9); var1 != null; var1 = (class32) class30.field575.method1106((byte) -123)) {
            if (class66.field1287 != var1.field634 || var1.field656 < class20.field344) {
                var1.method1392(128);
            } else if (var1.field649 <= class20.field344) {
                if (var1.field636 > 0) {
                    class131 var2 = class10.field172[var1.field636 - 1];
                    if (var2 != null && var2.field3889 >= 0 && var2.field3889 < 13312 && var2.field3854 >= 0 && var2.field3854 < 13312) {
                        var1.method232(class20.field344, var2.field3854, class206.method1360(var1.field634, var2.field3889, (byte) 40, var2.field3854) - var1.field666, -110, var2.field3889);
                    }
                }
                if (var1.field636 < 0) {
                    int var3 = -var1.field636 - 1;
                    class38 var4;
                    if (class97.field1916 == var3) {
                        var4 = class114.field2176;
                    } else {
                        var4 = class116.field2231[var3];
                    }
                    if (var4 != null && var4.field3889 >= 0 && var4.field3889 < 13312 && var4.field3854 >= 0 && var4.field3854 < 13312) {
                        var1.method232(class20.field344, var4.field3854, class206.method1360(var1.field634, var4.field3889, (byte) 40, var4.field3854) - var1.field666, -85, var4.field3889);
                    }
                }
                var1.method235(2047, class34.field695);
                class108.method715(class66.field1287, (int) var1.field639, (int) var1.field642, (int) var1.field635, 60, var1, var1.field665, -1L, false);
            }
        }
        if (arg0 <= 0) {
            field4211 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method1435(int arg0) {
        if (arg0 != 100) {
            return;
        }
        field4212 = null;
        field4216 = null;
        field4215 = null;
        field4213 = null;
        field4218 = null;
        field4214 = null;
        field4217 = null;
        field4207 = null;
        field4211 = null;
        field4208 = null;
        field4210 = null;
        field4220 = null;
        field4209 = null;
        field4219 = null;
    }
}
