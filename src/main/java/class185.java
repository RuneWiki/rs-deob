import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class185 extends class66 {

    @OriginalMember(owner = "client!sm", name = "fb", descriptor = "I")
    public static int field2581 = 0;

    @OriginalMember(owner = "client!sm", name = "eb", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!sm", name = "gb", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!sm", name = "hb", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(II)I", line = 7)
    public static final int method1115(int arg0, int arg1) {
        if (arg0 > -125) {
            method1115(81, 28);
        }
        ++field2582;
        if (arg1 == 6406) {
            return 1;
        } else if (~arg1 == -6410) {
            return 1;
        } else if (~arg1 == -32842) {
            return 1;
        } else if (~arg1 == -6411) {
            return 2;
        } else if (~arg1 == -6408) {
            return 3;
        } else if (~arg1 == -6409) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)[[I", line = 42)
    public final int[][] method324(int arg0, int arg1) {
        if (arg0 < 75) {
            return null;
        } else {
            ++field2580;
            int[][] var3 = super.field3757.method1450(arg1, -1);
            if (super.field3757.field3420 && this.method413(54)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg1 % super.field909 * super.field909;
                for (int var8 = 0; ~var8 > ~class507.field7456; ++var8) {
                    int var9 = super.field907[var8 % super.field905 + var7];
                    var6[var8] = class118.method750(4080, var9 << 4);
                    var5[var8] = class118.method750(4080, var9 >> 4);
                    var4[var8] = class118.method750(16711680, var9) >> 12;
                }
            }
            return var3;
        }
    }
}
