import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class584 {

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field8487 = -1;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "F")
    public static float field8488;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field8490;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BIIII)V")
    public static final void method3391(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 21) {
            method3393(111, true);
        }
        if (class598.field8632 <= arg3 && class288.field3883 >= arg3) {
            int var5 = class396.method2393(class587.field8513, class221.field2866, 5890, arg1);
            int var6 = class396.method2393(class587.field8513, class221.field2866, 5890, arg2);
            class520.method3086(arg3, 110, var6, var5, arg4);
        }
        field8490++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
    public static final void method3392(int arg0) {
        if (arg0 != 1333) {
            return;
        }
        field8489++;
        if (class285.field3868 != null) {
            return;
        }
        class285.field3868 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFD86) >> 10) / 64.0D + 0.0078125D;
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
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
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
                if (var24 * 6.0D < 1.0D) {
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
            int var35 = (var33 << 8) + (var32 << 16) + var34;
            class285.field3868[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ)I")
    public static final int method3393(int arg0, boolean arg1) {
        field8486++;
        if (arg1) {
            field8487 = -82;
        }
        return (arg0 & 0x3FF28) >> 11;
    }
}
