import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class426 extends class385 {

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "I")
    public static int field6275 = 0;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)Lvq;", line = 3)
    public static final class425 method2561(int arg0, int arg1, int arg2, int arg3) {
        ++field6274;
        class40 var4 = class153.field2210[arg0][arg2][arg3];
        if (var4 == null) {
            return null;
        } else {
            class425 var5 = null;
            int var6 = -1;
            if (arg1 < 49) {
                field6276 = 87;
            }
            for (class106 var7 = var4.field671; var7 != null; var7 = var7.field1641) {
                class454 var8 = var7.field1638;
                if (var8 instanceof class425) {
                    class425 var9 = (class425) var8;
                    int var10 = 252 + 256 * (-1 + var9.method2553((byte) 112));
                    int var11 = -var10 + var9.field3024 >> 9;
                    int var12 = -var10 + var9.field3029 >> 9;
                    int var13 = var9.field3024 + var10 >> 9;
                    int var14 = var9.field3029 + var10 >> 9;
                    if (arg2 >= var11 && ~arg3 <= ~var12 && ~arg2 >= ~var13 && arg3 <= var14) {
                        int var15 = (var13 - -1 + -arg2) * (var14 + 1 + -arg3);
                        if (var15 > var6) {
                            var5 = var9;
                            var6 = var15;
                        }
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)[[I", line = 65)
    public final int[][] method763(int arg0, int arg1) {
        ++field6273;
        int[][] var3 = super.field6417.method3769(arg1, arg0 ^ 29127);
        if (arg0 != -5766) {
            return null;
        } else {
            if (super.field6417.field9606 && this.method2298(0)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg1 % super.field5423 * super.field5423;
                for (int var8 = 0; ~var8 > ~class549.field7715; ++var8) {
                    int var9 = super.field5424[var7 - -(var8 % super.field5418)];
                    var6[var8] = class689.method3797(255, var9) << 4;
                    var5[var8] = class689.method3797(var9 >> 4, 4080);
                    var4[var8] = class689.method3797(16711680, var9) >> 12;
                }
            }
            return var3;
        }
    }
}
