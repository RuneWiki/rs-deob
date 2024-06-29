import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class39 extends class615 {

    @OriginalMember(owner = "client!vo", name = "M", descriptor = "I")
    private int field587;

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
    public static int field581 = 0;

    @OriginalMember(owner = "client!vo", name = "J", descriptor = "Lgj;")
    public static class593 field584 = new class593();

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!vo", name = "K", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!vo", name = "L", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!vo", name = "N", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIZLbi;Z)V")
    public static final void method299(int arg0, int arg1, int arg2, boolean arg3, class449 arg4, boolean arg5) {
        class704.field9906 = arg4;
        class344.field4715 = arg3;
        if (!arg5) {
            field584 = null;
        }
        class254.field3517 = arg1;
        ++field588;
        class71.field1059 = 1;
        class515.field6877 = 10000;
        class369.field4989 = arg0;
        class462.field6257 = arg2;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IB)[I")
    public final int[] method8(int arg0, byte arg1) {
        if (arg1 != -18) {
            method300(true);
        }
        ++field582;
        int[] var3 = super.field8125.method298(arg0, -125);
        if (super.field8125.field579) {
            class83.method684(var3, 0, class505.field6740, this.field587);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
    public class39() {
        this(4096);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V")
    public static void method300(boolean arg0) {
        if (!arg0) {
            method299(4, 77, 52, true, (class449) null, false);
        }
        field584 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIIII)V")
    public static final void method301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field585;
        int var7 = class300.method1829(class310.field4279, arg2, arg4 + -83, class442.field6058);
        int var8 = class300.method1829(class310.field4279, arg0, -34, class442.field6058);
        int var9 = class300.method1829(class600.field7959, arg1, 109, class366.field4956);
        int var10 = class300.method1829(class600.field7959, arg5, -73, class366.field4956);
        int var11 = class300.method1829(class310.field4279, arg2 + arg3, 108, class442.field6058);
        int var12 = class300.method1829(class310.field4279, -arg3 + arg0, arg4 + 128, class442.field6058);
        for (int var13 = var7; var11 > var13; ++var13) {
            class475.method2668(arg6, var10, 7, class236.field3325[var13], var9);
        }
        for (int var14 = var8; ~var14 < ~var12; --var14) {
            class475.method2668(arg6, var10, 7, class236.field3325[var14], var9);
        }
        int var15 = class300.method1829(class600.field7959, arg1 + arg3, arg4 + 128, class366.field4956);
        int var16 = class300.method1829(class600.field7959, -arg3 + arg5, 110, class366.field4956);
        for (int var17 = var11; var17 <= var12; ++var17) {
            int[] var18 = class236.field3325[var17];
            class475.method2668(arg6, var15, 7, var18, var9);
            class475.method2668(arg6, var10, 7, var18, var16);
        }
        if (arg4 != -1) {
            method299(-115, 48, -35, false, (class449) null, false);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BILeh;)V")
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (arg0 > 44) {
            if (arg1 == 0) {
                this.field587 = (arg2.method2034(255) << 12) / 255;
            }
            ++field583;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIB)Z")
    public static final boolean method302(int arg0, int arg1, byte arg2) {
        ++field586;
        if (arg2 != -82) {
            return true;
        } else {
            return class254.method1556(-1, arg0, arg1) | ~(arg1 & 393216) != -1 || class252.method1532(arg0, (byte) -98, arg1) || class332.method1971(arg2 ^ -81, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(I)V")
    public class39(int arg0) {
        super(0, true);
        this.field587 = 4096;
        this.field587 = arg0;
    }
}
