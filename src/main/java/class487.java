import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class487 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lof;")
    public static class622 field6751;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 7)
    public static void method2868(byte arg0) {
        field6751 = null;
        int var1 = -87 % ((-arg0 - 25) / 41);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 16)
    public static final void method2869(int arg0) {
        if (class680.field9218 > 0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class23.field723.length; var2++) {
                if (class23.field723[var2].indexOf("--> ") != -1) {
                    var1++;
                    if (class680.field9218 == var1) {
                        class257.field3711 = class23.field723[var2].substring(class23.field723[var2].indexOf(">") + 2);
                        break;
                    }
                }
            }
        } else {
            class257.field3711 = "";
        }
        if (arg0 != -615751774) {
            field6751 = null;
        }
        field6752++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I", line = 51)
    public static final int method2870(int arg0, int arg1) {
        field6750++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        if (arg0 != 27076) {
            return 85;
        }
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
        return (var21 >> 5 << 7) + ((var20 & 0xFF) >> 2 << 10) + (var22 >> 1);
    }
}
