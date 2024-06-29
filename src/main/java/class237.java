import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class237 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field3225 = -1;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "[[I")
    public static int[][] field3232 = new int[128][128];

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "[I")
    public static int[] field3226;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "[Z")
    public static boolean[] field3228;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1512(boolean arg0) {
        field3228 = null;
        if (!arg0) {
            method1512(false);
        }
        field3232 = null;
        field3226 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V", line = 26)
    public static final void method1513(int arg0, int arg1, int arg2) {
        field3229++;
        if (class344.method2202((byte) -60, arg1)) {
            class171.method1133(arg2 ^ 0xFE53, class224.field3054[arg1], arg0);
            if (arg2 != 65079) {
                field3226 = null;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILbq;)Ljava/lang/String;", line = 43)
    public static final String method1514(int arg0, class159 arg1) {
        field3230++;
        if (arg0 != -14921) {
            method1517(true);
        }
        return arg1.field2252 == null || arg1.field2252.length() <= 0 ? arg1.field2250 : arg1.field2250 + class21.field225 + arg1.field2252;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V", line = 58)
    public static final void method1515(int arg0, int arg1) {
        class26.field254.method2054(-98, arg1);
        if (arg0 != 128) {
            field3225 = 96;
        }
        field3227++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BLra;)V", line = 78)
    public static final void method1516(byte arg0, class57 arg1) {
        if (arg0 == -19) {
            field3233++;
            class124.field1647 = arg1;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V", line = 89)
    public static final void method1517(boolean arg0) {
        field3231++;
        if (class262.field3658 != null) {
            return;
        }
        class262.field3658 = new int[65536];
        if (!arg0) {
            field3232 = null;
        }
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFE37) >> 10) / 64.0D + 0.0078125D;
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
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (0.6666666666666666D - var4) * (var16 - var18) * 6.0D + var18;
                } else {
                    var12 = var18;
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
            int var35 = (var33 << 8) + ((var32 << 16) + var34);
            class262.field3658[var3] = var35;
        }
    }
}
