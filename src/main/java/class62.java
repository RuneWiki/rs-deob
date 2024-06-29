import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class62 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Lmd;")
    public static class273 field1058;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static void method426(int arg0) {
        field1058 = null;
        if (arg0 < 27) {
            method427((byte) -89, 109);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)I")
    public static final int method427(byte arg0, int arg1) {
        field1057++;
        double var2 = (double) ((arg1 & 0xFF6151) >> 16) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF54) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = 0.0D;
        double var10 = 0.0D;
        double var12 = var2;
        if (var4 < var2) {
            var12 = var4;
        }
        if (var12 > var6) {
            var12 = var6;
        }
        double var14 = var2;
        if (var2 < var4) {
            var14 = var4;
        }
        if (var6 > var14) {
            var14 = var6;
        }
        int var16 = 5 % ((arg0 - 5) / 45);
        double var17 = (var12 + var14) / 2.0D;
        if (var12 != var14) {
            if (var2 == var14) {
                var8 = (var4 - var6) / (var14 - var12);
            } else if (var4 == var14) {
                var8 = (var6 - var2) / (var14 - var12) + 2.0D;
            } else if (var6 == var14) {
                var8 = (var2 - var4) / (var14 - var12) + 4.0D;
            }
            if (var17 < 0.5D) {
                var10 = (var14 - var12) / (var12 + var14);
            }
            if (var17 >= 0.5D) {
                var10 = (var14 - var12) / (2.0D - var14 - var12);
            }
        }
        int var19 = (int) (var10 * 256.0D);
        int var20 = (int) (var17 * 256.0D);
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var20 > 243) {
            var19 >>= 0x4;
        } else if (var20 > 217) {
            var19 >>= 0x3;
        } else if (var20 > 192) {
            var19 >>= 0x2;
        } else if (var20 > 179) {
            var19 >>= 0x1;
        }
        double var21 = var8 / 6.0D;
        int var23 = (int) (var21 * 256.0D);
        return (var23 >> 2 << 10) + ((var19 >> 5 << 7) + (var20 >> 1));
    }
}
