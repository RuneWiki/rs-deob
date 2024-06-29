import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class418 extends class604 {

    @OriginalMember(owner = "client!bba", name = "S", descriptor = "J")
    public static long field5253 = 0L;

    @OriginalMember(owner = "client!bba", name = "T", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method44(int arg0, boolean arg1) {
        ++field5254;
        int[][] var3 = super.field135.method2706(arg0, -103);
        if (super.field135.field6667 && this.method3313((byte) 5)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field8499 * super.field8499;
            for (int var8 = 0; class657.field9287 > var8; ++var8) {
                int var9 = super.field8500[var8 % super.field8509 + var7];
                var6[var8] = class695.method3921(255, var9) << 4;
                var5[var8] = class695.method3921(65280, var9) >> 4;
                var4[var8] = class695.method3921(var9, 16711680) >> 12;
            }
        }
        return !arg1 ? null : var3;
    }
}
