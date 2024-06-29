import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class187 {

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field2705;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field2699;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "Laga;")
    private class618 field2700;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Ln;")
    private class17 field2706;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Luh;")
    private class150 field2703;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field2693 = 1;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2702 = null;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Lff;")
    public static class9 field2697 = new class9(4, 1, 1, 1);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Lmo;")
    private class695 field2704;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "[Luaa;")
    private class101[] field2696;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method1261(int arg0) {
        field2697 = null;
        if (arg0 == 65536) {
            field2702 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)Z")
    public final boolean method1262(int arg0) {
        field2694++;
        if (this.field2704 != null) {
            return true;
        }
        if (this.field2703 == null) {
            if (this.field2700.method3435((byte) 127)) {
                return false;
            }
            this.field2703 = this.field2700.method3439(255, 255, (byte) -88, (byte) 0, true);
        }
        if (this.field2703.field2717) {
            return false;
        }
        class695 var2 = new class695(this.field2703.method833(0));
        var2.field9761 = 5;
        int var3 = var2.method3826(false);
        var2.field9761 += var3 * 72;
        if (arg0 != 7) {
            this.field2700 = null;
        }
        byte[] var4 = new byte[var2.field9796.length - var2.field9761];
        var2.method3876((byte) 127, var4, 0, var4.length);
        byte[] var7;
        if (this.field2699 == null || this.field2705 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field2699, this.field2705);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class234.method1604(var2.field9761 - (var4.length + 5), var2.field9796, 5, arg0 ^ 0x87);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field2704 = var2;
        this.field2696 = new class101[var3];
        return true;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public final void method1263(int arg0) {
        if (arg0 != -21991) {
            this.field2696 = null;
        }
        field2701++;
        if (this.field2696 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2696.length; var2++) {
            if (this.field2696[var2] != null) {
                this.field2696[var2].method826(-1);
            }
        }
        for (int var3 = 0; var3 < this.field2696.length; var3++) {
            if (this.field2696[var3] != null) {
                this.field2696[var3].method819((byte) 0);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static final void method1264(byte arg0) {
        field2695++;
        if (class437.field6386 != null) {
            return;
        }
        class437.field6386 = new int[65536];
        if (arg0 < 3) {
            field2693 = -109;
        }
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
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
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 * 6.0D < 1.0D) {
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
            class437.field6386[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lrga;Z)V")
    public static final void method1265(class215 arg0, boolean arg1) {
        if (!class520.field7337) {
            class295.method1858(arg0, class376.field5351);
        } else if (arg1) {
            class295.field4329[class295.field4329.length - 1].method3206(arg0, -1);
        } else {
            int var2 = class71.method690(arg0.field3027);
            int var3 = class601.field8507[2] * arg0.method1171((byte) 41) / arg0.field3026;
            int var4 = class71.method690(arg0.field3027 - var3);
            int var5 = class71.method690(arg0.field3027 + var3);
            if (var4 == var5) {
                class295.field4329[var2].method3206(arg0, -1);
            } else if (var5 - var4 == 1) {
                class295.field4329[class519.field7319 + var4].method3206(arg0, -1);
            } else {
                class295.field4329[class295.field4329.length - 1].method3206(arg0, -1);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZLwo;ILwo;)Luaa;")
    private final class101 method1266(int arg0, boolean arg1, class691 arg2, int arg3, class691 arg4) {
        field2698++;
        if (this.field2704 == null) {
            throw new RuntimeException();
        } else if (arg3 < 0 || this.field2696.length <= arg3) {
            throw new RuntimeException();
        } else if (this.field2696[arg3] == null) {
            this.field2704.field9761 = arg3 * 72 + 6;
            int var6 = this.field2704.method3880(8);
            int var7 = this.field2704.method3880(8);
            byte[] var8 = new byte[64];
            this.field2704.method3876((byte) 127, var8, 0, 64);
            if (arg0 < 8) {
                this.method1266(-111, false, null, 57, null);
            }
            class101 var9 = new class101(arg3, arg2, arg4, this.field2700, this.field2706, var6, var8, var7, arg1);
            this.field2696[arg3] = var9;
            return var9;
        } else {
            return this.field2696[arg3];
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILwo;Lwo;)Luaa;")
    public final class101 method1267(int arg0, int arg1, class691 arg2, class691 arg3) {
        field2692++;
        int var5 = -6 / ((arg0 + 43) / 60);
        return this.method1266(62, true, arg3, arg1, arg2);
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Laga;Ln;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class187(class618 arg0, class17 arg1, BigInteger arg2, BigInteger arg3) {
        this.field2705 = arg3;
        this.field2699 = arg2;
        this.field2700 = arg0;
        this.field2706 = arg1;
        if (!this.field2700.method3435((byte) 121)) {
            this.field2703 = this.field2700.method3439(255, 255, (byte) -60, (byte) 0, true);
        }
    }
}
