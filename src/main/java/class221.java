import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class221 {

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    public static int field3592 = 1;

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "[I")
    public static int[] field3595 = new int[14];

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "B")
    public byte field3590;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public int field3587;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "Lmq;")
    public static class470 field3591;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "Ljava/lang/String;")
    public String field3588;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "Ljava/lang/String;")
    public String field3593;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "Ljava/lang/String;")
    public String field3594;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "Ljava/lang/String;")
    public String field3596;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "Z")
    public static boolean field3586;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1635(int arg0) {
        field3589++;
        if (class63.field819 != null) {
            return;
        }
        class63.field819 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 != 6) {
            method1636((byte) -97);
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFFDB) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
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
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
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
                } else if (var24 * 3.0D < 2.0D) {
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
            class63.field819[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V", line = 135)
    public static void method1636(byte arg0) {
        field3595 = null;
        if (arg0 == -92) {
            field3591 = null;
        }
    }
}
