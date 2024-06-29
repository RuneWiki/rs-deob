import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class487 {

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public static int field6840 = -1;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)Lpq;", line = 8)
    public static final class47 method2848(int arg0, int arg1, int arg2) {
        class337 var3 = class170.field2427[arg0][arg1][arg2];
        return var3 == null || var3.field5063 == null ? null : var3.field5063;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BI)I", line = 19)
    public static final int method2849(byte arg0, int arg1) {
        field6841++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF81) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        if (arg0 != -29) {
            return 20;
        }
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return ((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7) + (var22 >> 1);
    }
}
