import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class35 {

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field435 = 1;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Lu;")
    public static class66 field432 = new class66();

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[I")
    public static int[] field436 = new int[500];

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Lqe;")
    private static class168 field437 = class66.method448(" has logged in)3", -125);

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Lqe;")
    public static class168 field438 = field437;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    public static void method218(boolean arg0) {
        field438 = null;
        if (!arg0) {
            field435 = 82;
        }
        field437 = null;
        field436 = null;
        field432 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)I")
    public static final int method219(int arg0, int arg1) {
        if (arg0 != 28583) {
            return 108;
        }
        field433++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = var2;
        double var8 = (double) (arg1 & 0xFF) / 256.0D;
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var4 < var2) {
            var6 = var4;
        }
        if (var10 < var8) {
            var10 = var8;
        }
        if (var6 > var8) {
            var6 = var8;
        }
        double var12 = 0.0D;
        double var14 = (var6 + var10) / 2.0D;
        double var16 = 0.0D;
        if (var6 != var10) {
            if (var14 < 0.5D) {
                var16 = (var10 - var6) / (var6 + var10);
            }
            if (var14 >= 0.5D) {
                var16 = (var10 - var6) / (2.0D - var10 - var6);
            }
            if (var2 == var10) {
                var12 = (var4 - var8) / (-var6 + var10);
            } else if (var4 == var10) {
                var12 = (var8 - var2) / (-var6 + var10) + 2.0D;
            } else if (var8 == var10) {
                var12 = (var2 - var4) / (var10 - var6) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var16 * 256.0D);
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        int var21 = (int) (var18 * 256.0D);
        int var22 = (int) (var14 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var20 >>= 0x4;
        } else if (var22 > 217) {
            var20 >>= 0x3;
        } else if (var22 > 192) {
            var20 >>= 0x2;
        } else if (var22 > 179) {
            var20 >>= 0x1;
        }
        return (var20 >> 5 << 7) + (var21 >> 2 << 10) + (var22 >> 1);
    }
}
