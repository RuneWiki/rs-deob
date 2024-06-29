import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class251 extends class71 {

    @OriginalMember(owner = "client!ba", name = "gb", descriptor = "I")
    public static int field3614 = 0;

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!ba", name = "fb", descriptor = "Lih;")
    public static class474 field3613;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)V", line = 3)
    public static void method1574(int arg0) {
        if (arg0 == 0) {
            field3613 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 18)
    public static final int method1575(String arg0, byte arg1) {
        if (arg1 > -107) {
            return -92;
        } else {
            ++field3610;
            for (int var2 = 0; ~class131.field1661.length < ~var2; ++var2) {
                if (class131.field1661[var2].equalsIgnoreCase(arg0)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)[[I", line = 40)
    public final int[][] method486(byte arg0, int arg1) {
        ++field3611;
        int[][] var3 = super.field5848.method1692(arg1, 47);
        if (arg0 <= 81) {
            method1574(79);
        }
        if (super.field5848.field3939 && this.method480(-127)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field1037 * super.field1037;
            for (int var8 = 0; var8 < class164.field2152; ++var8) {
                int var9 = super.field1046[var8 % super.field1038 + var7];
                var6[var8] = class500.method3013(var9 << 4, 4080);
                var5[var8] = class500.method3013(var9 >> 4, 4080);
                var4[var8] = class500.method3013(var9 >> 12, 4080);
            }
        }
        return var3;
    }
}
