import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class127 extends class519 {

    @OriginalMember(owner = "client!ct", name = "C", descriptor = "[Lvba;")
    public static class37[] field1774 = new class37[4];

    @OriginalMember(owner = "client!ct", name = "T", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IB)[[I", line = 4)
    public final int[][] method409(int arg0, byte arg1) {
        ++field1775;
        int[][] var3 = super.field772.method2906(8, arg0);
        if (arg1 > -20) {
            this.method409(-78, (byte) -54);
        }
        if (super.field772.field6899 && this.method3071((byte) 59)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field7400 * super.field7400;
            for (int var8 = 0; class438.field5847 > var8; ++var8) {
                int var9 = super.field7404[var8 % super.field7398 + var7];
                var6[var8] = class37.method245(var9, 255) << 4;
                var5[var8] = class37.method245(4080, var9 >> 4);
                var4[var8] = class37.method245(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "(I)V", line = 61)
    public static void method899(int arg0) {
        if (arg0 != 1) {
            field1774 = null;
        }
        field1774 = null;
    }
}
