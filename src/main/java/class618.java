import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class618 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field8848;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field8849;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
    public static final void method3526(int arg0) {
        field8848++;
        if (class721.field10115 != null) {
            return;
        }
        class721.field10115 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 != 6) {
            field8849 = null;
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - var6 * var8;
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (0.6666666666666666D - var20) * (var16 - var18) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
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
            class721.field10115[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
    public static void method3527(byte arg0) {
        if (arg0 == 36) {
            field8849 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Loh;BI)Lur;")
    public static final class535 method3528(class404 arg0, byte arg1, int arg2) {
        field8847++;
        byte[] var3 = arg0.method2472(false, arg2);
        if (arg1 == 101) {
            return var3 == null ? null : new class535(var3);
        } else {
            return null;
        }
    }
}
