import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class72 extends class263 {

    @OriginalMember(owner = "client!a", name = "T", descriptor = "Ljava/lang/Object;")
    private Object field983;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
    public static int field980 = 0;

    @OriginalMember(owner = "client!a", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field984 = new String[100];

    @OriginalMember(owner = "client!a", name = "X", descriptor = "I")
    public static int field986 = 0;

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "I")
    public static int field987 = 0;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!a", name = "V", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "Lqj;")
    public static class238 field977;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(I)I", line = 3)
    public static final int method446(int arg0) {
        field981++;
        if (class38.field616) {
            return 0;
        }
        if (arg0 != 28804) {
            field977 = null;
        }
        if (class116.method810((byte) 118)) {
            return class161.field2103 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 23)
    public final Object method447(int arg0) {
        field982++;
        return arg0 == 27816 ? this.field983 : null;
    }

    @OriginalMember(owner = "client!a", name = "h", descriptor = "(I)V", line = 48)
    public static final void method448(int arg0) {
        if (arg0 != 256) {
            return;
        }
        field985++;
        if (class198.field2830 != null) {
            return;
        }
        class198.field2830 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x3CB) >> 7) / 8.0D + 0.0625D;
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
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
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
            class198.field2830[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V", line = 168)
    public static final void method449(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -65 / ((-arg2 - 75) / 41);
        field979++;
        class256 var6 = class363.method2385(10, arg4, (byte) 1);
        var6.method1614(0);
        var6.field3756 = arg1;
        var6.field3746 = arg3;
        var6.field3748 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(B)V", line = 195)
    public static void method450(byte arg0) {
        if (arg0 == -87) {
            field977 = null;
            field984 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 205)
    public class72(Object arg0) {
        this.field983 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)Z", line = 213)
    public final boolean method451(int arg0) {
        if (arg0 >= -92) {
            field984 = null;
        }
        field978++;
        return false;
    }
}
