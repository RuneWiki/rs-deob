import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class162 {

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
    public int field1808 = 0;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "[I")
    public static int[] field1804 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1002(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var9 = arg1 + 1;
        class223.method1297(class408.field5585[arg1], -7, arg2, arg5, arg0);
        field1805++;
        int var10 = arg3 - 1;
        class223.method1297(class408.field5585[arg3], -7, arg2, arg5, arg0);
        for (int var6 = var9; var6 <= var10; var6++) {
            int[] var8 = class408.field5585[var6];
            var8[arg2] = var8[arg0] = arg5;
        }
        int var7 = 9 / ((arg4 - 54) / 38);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
    public static void method1003(int arg0) {
        int var1 = 5 / ((arg0 + 66) / 43);
        field1804 = null;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lig;II)V")
    private final void method1004(class244 arg0, int arg1, int arg2) {
        int var4 = 124 % ((27 - arg2) / 33);
        field1806++;
        if (arg1 == 5) {
            this.field1808 = arg0.method1476(-111);
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(BLig;)V")
    public final void method1005(byte arg0, class244 arg1) {
        field1807++;
        while (true) {
            int var3 = arg1.method1423(arg0 - 145);
            if (var3 == 0) {
                if (arg0 == 24) {
                    return;
                } else {
                    this.method1005((byte) -17, null);
                    return;
                }
            }
            this.method1004(arg1, var3, arg0 - 86);
        }
    }
}
