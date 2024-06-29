import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class35 {

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Loh;")
    public static class263 field818 = class253.method1681(-118, ": ");

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Loh;")
    public static class263 field817 = class253.method1681(-125, "(U2");

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "Loh;")
    public static class263 field822 = class253.method1681(-117, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "Loh;")
    public static class263 field819 = class253.method1681(-126, ":clan:");

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "[I")
    public static int[] field824 = new int[50];

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "[I")
    public static int[] field821;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "[[[I")
    public static int[][][] field820;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)I")
    public static final int method222(int arg0, boolean arg1) {
        field823++;
        double var2 = (double) ((arg0 & 0xFF1F) >> 8) / 256.0D;
        if (!arg1) {
            field821 = null;
        }
        double var4 = (double) ((arg0 & 0xFF43B1) >> 16) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var4;
        if (var4 > var2) {
            var8 = var2;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = 0.0D;
        double var12 = var4;
        if (var2 > var4) {
            var12 = var2;
        }
        double var14 = 0.0D;
        if (var12 < var6) {
            var12 = var6;
        }
        double var16 = (var8 + var12) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        if (var8 != var12) {
            if (var4 == var12) {
                var10 = (var2 - var6) / (var12 - var8);
            } else if (var2 == var12) {
                var10 = (var6 - var4) / (var12 - var8) + 2.0D;
            } else if (var6 == var12) {
                var10 = (var4 - var2) / (var12 - var8) + 4.0D;
            }
            if (var16 < 0.5D) {
                var14 = (var12 - var8) / (var8 + var12);
            }
            if (var16 >= 0.5D) {
                var14 = (var12 - var8) / (2.0D - var12 - var8);
            }
        }
        int var19 = (int) (var14 * 256.0D);
        double var20 = var10 / 6.0D;
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var18 > 243) {
            var19 >>= 0x4;
        } else if (var18 > 217) {
            var19 >>= 0x3;
        } else if (var18 > 192) {
            var19 >>= 0x2;
        } else if (var18 > 179) {
            var19 >>= 0x1;
        }
        int var22 = (int) (var20 * 256.0D);
        return (var22 >> 2 << 10) + (var18 >> 1) + (var19 >> 5 << 7);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
    public static void method223(byte arg0) {
        field824 = null;
        if (arg0 <= 125) {
            field822 = null;
        }
        field820 = null;
        field821 = null;
        field817 = null;
        field819 = null;
        field822 = null;
        field818 = null;
    }
}
