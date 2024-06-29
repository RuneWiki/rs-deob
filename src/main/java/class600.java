import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class600 {

    @OriginalMember(owner = "client!it", name = "i", descriptor = "[[I")
    private int[][] field8604;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "I")
    private int field8605;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    private int field8597;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "Lqfa;")
    public static class85 field8599 = new class85(31, 12);

    @OriginalMember(owner = "client!it", name = "k", descriptor = "Lsb;")
    public static class266 field8606 = new class266(69, -1);

    @OriginalMember(owner = "client!it", name = "l", descriptor = "F")
    public static float field8607;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field8600;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "[I")
    public static int[] field8603;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
    public static void method3426(byte arg0) {
        field8606 = null;
        field8603 = null;
        if (arg0 < -74) {
            field8599 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)I")
    public final int method3427(int arg0, int arg1) {
        field8596++;
        if (arg1 != 6) {
            field8601 = 60;
        }
        if (this.field8604 != null) {
            arg0 = ((int) ((long) this.field8597 * (long) arg0 / (long) this.field8605)) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B[B)[B")
    public final byte[] method3428(byte arg0, byte[] arg1) {
        if (this.field8604 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field8597 / (long) this.field8605) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field8604[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field8597 + var6;
                int var14 = var13 / this.field8605;
                var5 += var14;
                var6 = var13 - this.field8605 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        field8602++;
        if (arg0 >= -124) {
            field8606 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IZ)I")
    public final int method3429(int arg0, boolean arg1) {
        if (!arg1) {
            this.method3427(125, 105);
        }
        if (this.field8604 != null) {
            arg0 = (int) ((long) this.field8597 * (long) arg0 / (long) this.field8605);
        }
        field8600++;
        return arg0;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIZII)V")
    public static final void method3430(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class147.field2551 = arg3;
        if (arg2) {
            field8603 = null;
        }
        class163.field2734 = arg0;
        class638.field9190 = arg4;
        class606.field8822 = arg1;
        field8598++;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(II)V")
    public class600(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class34.method518(arg0, true, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field8604 = new int[var5][14];
            this.field8605 = var5;
            this.field8597 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field8604[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
