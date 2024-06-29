import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class79 {

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field1116 = 0;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "[I")
    public static int[] field1121 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field1120 = 0;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Lkc;")
    public static class157 field1117 = new class157("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "Lkc;")
    public static class157 field1123 = new class157("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Z")
    public static boolean field1118;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 12)
    public static final void method610(int arg0) {
        if (arg0 != 256) {
            field1115 = 10;
        }
        field1122++;
        class97 var1 = (class97) class14.field148.method3137(0);
        boolean var2 = class294.field3967 != null || class123.field1909 > 0;
        if (var2) {
            class202.field2931 = 1;
        }
        if (class211.field3011 && class78.field1106.method2585(81, (byte) 76) && class527.field7690 > 2) {
            if (var2) {
                class366.field5256 = (class440) class391.field5638.field7789.field6879.field6879;
            } else {
                class304.method1755((byte) 69, (class440) class391.field5638.field7789.field6879.field6879, var1.method779((byte) -74), var1.method778(-7747));
            }
        } else if (var2) {
            class366.field5256 = (class440) class391.field5638.field7789.field6879;
        } else {
            class304.method1755((byte) 115, (class440) class391.field5638.field7789.field6879, var1.method779((byte) 58), var1.method778(-7747));
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 54)
    public static final void method611(byte arg0) {
        field1119++;
        if (class203.field2946 != null) {
            return;
        }
        class203.field2946 = new int[65536];
        if (arg0 >= -25) {
            field1120 = 41;
        }
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFECD) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x3F2) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
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
                if (var24 < 0.0D) {
                    var24++;
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
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (0.6666666666666666D - var24) * (var16 - var18) * 6.0D + var18;
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
            class203.field2946[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IILpg;IZII[B)Lgq;", line = 169)
    public static final class241 method612(int arg0, int arg1, class333 arg2, int arg3, boolean arg4, int arg5, int arg6, byte[] arg7) {
        if (arg3 != 34037) {
            method610(19);
        }
        field1114++;
        if (!arg2.field4809 && (!class113.method855(arg0, (byte) -103) || !class113.method855(arg5, (byte) -103))) {
            return arg2.field4803 ? new class241(arg2, 34037, arg6, arg0, arg5, arg4, arg7, arg1) : new class241(arg2, arg6, arg0, arg5, class274.method1604(arg0, (byte) 111), class274.method1604(arg5, (byte) 114), arg7, arg1);
        } else {
            return new class241(arg2, 3553, arg6, arg0, arg5, arg4, arg7, arg1);
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)V", line = 195)
    public static void method613(byte arg0) {
        field1121 = null;
        if (arg0 < 68) {
            method613((byte) -55);
        }
        field1123 = null;
        field1117 = null;
    }
}
