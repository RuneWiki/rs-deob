import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class171 {

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "D")
    public static double field2049 = -1.0D;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Z")
    public static boolean field2050 = false;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "J")
    public static long field2051 = 0L;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "D")
    public static double field2047;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILha;I)Ltf;")
    public static final class312 method1165(int arg0, class66 arg1, int arg2) {
        field2046++;
        class318 var3 = (class318) class444.field5950.method2121(98, (long) arg0);
        int var4 = 57 % ((6 - arg2) / 55);
        if (var3 != null) {
            class133 var5 = var3.field3917.method2239((byte) 86);
            var3.field3913 = true;
            if (var5 != null) {
                return var5.method994(arg1, (byte) 71);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I")
    public static final int method1166(int arg0, int arg1) {
        field2048++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg0 & 0xFF6B) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
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
        if (arg1 != -12805) {
            field2047 = -1.152201293983059D;
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
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
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
        return (var21 >> 5 << 7) + ((var20 >> 2 & 0x3F) << 10) + (var22 >> 1);
    }
}
