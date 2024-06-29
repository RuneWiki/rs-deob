import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class344 extends class168 {

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "Z")
    public boolean field4344 = false;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "I")
    public int field4349 = -1;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "[I")
    public static int[] field4346 = new int[1];

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "Lde;")
    public static class534 field4348 = new class534(5);

    @OriginalMember(owner = "client!cs", name = "v", descriptor = "Z")
    public static boolean field4356 = false;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
    public int field4345;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
    public int field4347;

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "I")
    public int field4350;

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "I")
    public int field4351;

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "I")
    public int field4353;

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
    public static final void method1974(byte arg0) {
        field4354++;
        if (class267.field3365 != null) {
            return;
        }
        class267.field3365 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 != -93) {
            return;
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFE84) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x3E3) >> 7) / 8.0D + 0.0625D;
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
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var4 * 6.0D < 1.0D) {
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
            int var35 = (var33 << 8) + (var32 << 16) + var34;
            class267.field3365[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(I)V")
    public class344(int arg0) {
        this.field4349 = arg0;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public static void method1975(int arg0) {
        field4346 = null;
        if (arg0 != 25278) {
            field4356 = true;
        }
        field4348 = null;
    }
}
