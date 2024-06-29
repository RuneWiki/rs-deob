import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class227 {

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3064;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3063;

    static {
        new class317("", 76);
        field3064 = new String[100];
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 6)
    public static void method1417(byte arg0) {
        field3063 = null;
        field3064 = null;
        int var1 = -29 / ((-arg0 - 52) / 53);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)Z", line = 24)
    public static final boolean method1418(byte arg0, int arg1) {
        int var2 = 64 % ((arg0 + 59) / 51);
        field3060++;
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I", line = 39)
    public static final int method1419(int arg0, int arg1) {
        if (arg0 != -14169) {
            field3064 = null;
        }
        field3061++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg1 & 0xFFDD) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
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
        return (var22 >> 1) + ((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7);
    }
}
