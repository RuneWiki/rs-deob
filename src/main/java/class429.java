import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class429 {

    @OriginalMember(owner = "client!bia", name = "d", descriptor = "[I")
    public static int[] field5639 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "I")
    public int field5637;

    @OriginalMember(owner = "client!bia", name = "c", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!bia", name = "e", descriptor = "I")
    public int field5640;

    @OriginalMember(owner = "client!bia", name = "f", descriptor = "I")
    public int field5641;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(Lmc;B)Ljl;", line = 3)
    public static final class621 method2478(class234 arg0, byte arg1) {
        field5638++;
        if (arg1 != -57) {
            field5639 = null;
        }
        class26 var2 = class169.method1071(1, arg0);
        int var3 = arg0.method1542(27067);
        return new class621(var2.field149, var2.field143, var2.field144, var2.field151, var2.field140, var2.field141, var2.field146, var2.field150, var2.field142, var2.field224, var2.field217, var2.field220, var2.field218, var2.field219, var2.field221, var3);
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)I", line = 23)
    public static final int method2479(int arg0) {
        if (arg0 != 2) {
            field5639 = null;
        }
        field5636++;
        return class303.method1795(false, false);
    }

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "(I)V", line = 38)
    public static void method2480(int arg0) {
        if (arg0 <= 35) {
            field5639 = null;
        }
        field5639 = null;
    }
}
