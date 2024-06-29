import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class698 extends class546 {

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "[I")
    public static int[] field9903 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "[I")
    public static int[] field9906 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
    public static int field9912 = 0;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "F")
    public static float field9913;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public static int field9904;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
    public static int field9907;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "I")
    public static int field9908;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    public static int field9909;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "Lwca;")
    public static class630 field9911;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "Llr;")
    public class698 field9901;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "Llr;")
    public class698 field9910;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public static final void method3913(int arg0) {
        field9907++;
        int var1 = -117 % ((-arg0 - 26) / 50);
        if (class78.field1186 != null) {
            return;
        }
        class78.field1186 = new int[65536];
        double var2 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var4 = 0; var4 < 65536; var4++) {
            double var5 = (double) (var4 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var7 = (double) (var4 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var9 = (double) (var4 & 0x7F) / 128.0D;
            double var11 = var9;
            double var13 = var9;
            double var15 = var9;
            if (var7 != 0.0D) {
                double var17;
                if ((var9 < 0.5D)) {
                    var17 = (var7 + 1.0D) * var9;
                } else {
                    var17 = var7 + var9 - var7 * var9;
                }
                double var19 = var9 * 2.0D - var17;
                double var21 = var5 + 0.3333333333333333D;
                if (var21 > 1.0D) {
                    var21--;
                }
                double var25 = var5 - 0.3333333333333333D;
                if ((var5 * 6.0D < 1.0D)) {
                    var13 = (var17 - var19) * 6.0D * var5 + var19;
                } else if ((var5 * 2.0D < 1.0D)) {
                    var13 = var17;
                } else if (var5 * 3.0D < 2.0D) {
                    var13 = (var17 - var19) * (0.6666666666666666D - var5) * 6.0D + var19;
                } else {
                    var13 = var19;
                }
                if (var25 < 0.0D) {
                    var25++;
                }
                if ((var21 * 6.0D < 1.0D)) {
                    var11 = (var17 - var19) * 6.0D * var21 + var19;
                } else if (var21 * 2.0D < 1.0D) {
                    var11 = var17;
                } else if ((var21 * 3.0D < 2.0D)) {
                    var11 = (var17 - var19) * (0.6666666666666666D - var21) * 6.0D + var19;
                } else {
                    var11 = var19;
                }
                if ((var25 * 6.0D < 1.0D)) {
                    var15 = (var17 - var19) * 6.0D * var25 + var19;
                } else if ((var25 * 2.0D < 1.0D)) {
                    var15 = var17;
                } else if ((var25 * 3.0D < 2.0D)) {
                    var15 = (var17 - var19) * (0.6666666666666666D - var25) * 6.0D + var19;
                } else {
                    var15 = var19;
                }
            }
            double var27 = Math.pow(var11, var2);
            double var29 = Math.pow(var13, var2);
            double var31 = Math.pow(var15, var2);
            int var33 = (int) (var27 * 256.0D);
            int var34 = (int) (var29 * 256.0D);
            int var35 = (int) (var31 * 256.0D);
            int var36 = (var34 << 8) + (var33 << 16) + var35;
            class78.field1186[var4] = var36;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
    public final void method3914(byte arg0) {
        field9902++;
        if (this.field9910 == null) {
            return;
        }
        this.field9910.field9901 = this.field9901;
        this.field9901.field9910 = this.field9910;
        this.field9901 = null;
        if (arg0 < -75) {
            this.field9910 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
    public static void method3915(int arg0) {
        field9903 = null;
        field9911 = null;
        field9906 = null;
        int var1 = 104 % ((15 - arg0) / 44);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3916(int arg0, byte arg1, int arg2) {
        field9908++;
        int var3 = -51 / ((86 - arg1) / 32);
        return class499.method2799(arg0, 29429, arg2) | (arg0 & 0x800) != 0 || class302.method1839((byte) 122, arg2, arg0);
    }
}
