import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class391 {

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "[[I")
    public static int[][] field5877 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "[I")
    public static int[] field5876 = new int[4];

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lcr;B[[B)V")
    public static final void method2342(class367 arg0, byte arg1, byte[][] arg2) {
        field5875++;
        if (arg1 != -14) {
            return;
        }
        for (int var3 = 0; var3 < arg0.field6761; var3++) {
            class436.method2565(-54);
            for (int var4 = 0; var4 < (class50.field640 >> 3); var4++) {
                for (int var5 = 0; var5 < class448.field6611 >> 3; var5++) {
                    int var6 = class444.field6530[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg0.field6746 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class495.field7349.length; var12++) {
                                if (class495.field7349[var12] == var11 && arg2[var12] != null) {
                                    arg0.method2191((var9 & 0x7) * 8, arg2[var12], var3, class151.field2300, (var10 & 0x7) * 8, var5 * 8, (byte) -127, var4 * 8, class407.field6147, var8, var7);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
    public static void method2343(int arg0) {
        field5877 = null;
        if (arg0 != 3) {
            method2342(null, (byte) 0, null);
        }
        field5876 = null;
    }
}
