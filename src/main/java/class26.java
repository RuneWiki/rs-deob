import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class26 extends class102 {

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "Lqe;")
    public class52 field328;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public static int field326 = 0;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public static int field332 = 0;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "Lr;")
    public static class66 field329 = class93.method641(43, "_");

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public static int field331 = 0;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field335 = 0;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "Lr;")
    public static class66 field334 = class93.method641(43, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "Lsg;")
    public static class247 field327;

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lqe;)V")
    public class26(class52 arg0) {
        this.field328 = arg0;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(La;III)V")
    public static final void method112(class20 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class40.field629) {
            class16 var4 = class110.field2124[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field225 != null && var4.field225.field1734.method87()) {
                arg0.method82(var4.field225.field1734, 128, 0, 0, true);
            }
        }
        if (arg3 < class40.field629) {
            class16 var5 = class110.field2124[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field225 != null && var5.field225.field1734.method87()) {
                arg0.method82(var5.field225.field1734, 0, 0, 128, true);
            }
        }
        if (arg2 < class40.field629 && arg3 < class11.field136) {
            class16 var6 = class110.field2124[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field225 != null && var6.field225.field1734.method87()) {
                arg0.method82(var6.field225.field1734, 128, 0, 128, true);
            }
        }
        if (arg2 < class40.field629 && arg3 > 0) {
            class16 var7 = class110.field2124[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field225 != null && var7.field225.field1734.method87()) {
                arg0.method82(var7.field225.field1734, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
    public static void method113(int arg0) {
        int var1 = 117 % ((-arg0 - 51) / 42);
        field329 = null;
        field327 = null;
        field334 = null;
    }
}
