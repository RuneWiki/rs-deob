import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class217 {

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "S")
    public static short field2937 = 32767;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field2936 = 0;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public int field2933;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public int field2935;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public int field2938;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public int field2942;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Ldf;")
    public static class274 field2934;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "[Lf;")
    public static class529[] field2941;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILna;)V", line = 5)
    public static final void method1380(int arg0, class35 arg1) {
        class141.field2049[arg0] = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V", line = 8)
    public static void method1381(boolean arg0) {
        field2934 = null;
        field2941 = null;
        if (!arg0) {
            method1383(null, (byte) 80, null, null, null);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 19)
    public static final void method1382(int arg0) {
        field2940++;
        if (arg0 != -14730) {
            method1380(57, null);
        }
        if (class180.field2600 != null) {
            return;
        }
        class180.field2600 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFCF7) >> 10) / 64.0D + 0.0078125D;
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
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
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
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
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
            class180.field2600[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lpc;BLpc;Lpc;Lpc;)V", line = 138)
    public static final void method1383(class473 arg0, byte arg1, class473 arg2, class473 arg3, class473 arg4) {
        class289.field3786 = arg3;
        class148.field2094 = arg2;
        field2939++;
        class14.field279 = arg0;
        class277.field3631 = arg4;
        class238.field3185 = new class403[class14.field279.method2724(0)][];
        if (arg1 != 106) {
            field2937 = -99;
        }
        class489.field6793 = new boolean[class14.field279.method2724(arg1 - 106)];
    }
}
