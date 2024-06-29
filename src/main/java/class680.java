import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class680 {

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field9648 = new Rectangle[100];

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "Ltt;")
    public static class338 field9651;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "Ltt;")
    public static class338 field9653;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    public static int field9655;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "F")
    public static float field9652;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "F")
    public static float field9654;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field9647;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public static int field9649;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public static int field9650;

    @OriginalMember(owner = "client!mt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9647++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
    public static final void method3873(byte arg0) {
        field9650++;
        if (class104.field1240 != null) {
            return;
        }
        class104.field1240 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 < 42) {
            return;
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x391) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (0.6666666666666666D - var20) * (var16 - var18) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class104.field1240[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V")
    public static void method3874(boolean arg0) {
        field9651 = null;
        if (!arg0) {
            field9652 = -0.2074453F;
        }
        field9648 = null;
        field9653 = null;
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field9648[var0] = new Rectangle();
        }
        field9651 = new class338(45, -1);
        field9653 = new class338(18, 8);
        field9655 = 1;
    }
}
