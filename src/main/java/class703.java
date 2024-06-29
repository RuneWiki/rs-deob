import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class703 {

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public static int field9792 = 0;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public static int field9795 = 0;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public static int field9791;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field9793;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    public static int field9796;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "J")
    public static long field9794;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(II)I", line = 8)
    public static final int method3973(int arg0, int arg1) {
        field9791++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
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
        if (var10 < var6) {
            var10 = var6;
        }
        if (arg1 <= 112) {
            method3974(-56);
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
        return ((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)Ljava/lang/String;", line = 112)
    public static final String method3974(int arg0) {
        field9793++;
        if (class263.field3850 || class99.field1151 == null) {
            return "";
        } else {
            if (arg0 != 1) {
                field9792 = -8;
            }
            return (class99.field1151.field2169 == null || class99.field1151.field2169.length() == 0) && class99.field1151.field2176 != null && class99.field1151.field2176.length() > 0 ? class99.field1151.field2176 : class99.field1151.field2169;
        }
    }
}
