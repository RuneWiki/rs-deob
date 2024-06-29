import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class179 {

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    private int field3568;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "[[I")
    private int[][] field3558;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    private int field3557;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lid;")
    public static class92 field3560 = new class92(64);

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Li;")
    public static class88 field3565 = class208.method1425(105, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "[I")
    public static int[] field3564 = new int[25];

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Lq;")
    public static class174 field3570 = null;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Z")
    public static boolean field3569 = false;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Lnb;")
    public static class144 field3567;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "[Lq;")
    public static class174[] field3566;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method1277(int arg0) {
        field3565 = null;
        field3566 = null;
        if (arg0 < 43) {
            method1278(null, true);
        }
        field3567 = null;
        field3564 = null;
        field3560 = null;
        field3570 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method1278(byte[] arg0, boolean arg1) {
        field3561++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class124.method838(arg0, 0, var3, 0, var2);
        if (!arg1) {
            method1278(null, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII)V")
    public static final void method1279(int arg0, int arg1, int arg2, int arg3) {
        class14.field211 = new class52[arg0][arg1][arg2];
        class145.field2723 = new int[arg0][arg1 + 1][arg2 + 1];
        class24.method131(false);
        class48.field899 = arg1;
        class66.field1202 = arg2;
        class238.field4431 = new int[arg0][arg1 + 1][arg2 + 1];
        class85.method579();
        class150.field2913 = arg3;
        class18.field304 = new boolean[class150.field2913 + class150.field2913 + 1][class150.field2913 + class150.field2913 + 1];
        class48.field893 = new boolean[class150.field2913 + class150.field2913 + 2][class150.field2913 + class150.field2913 + 2];
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B[B)[B")
    public final byte[] method1280(byte arg0, byte[] arg1) {
        int var3 = 64 % ((arg0 + 54) / 36);
        if (this.field3558 != null) {
            int var4 = (int) ((long) arg1.length * (long) this.field3557 / (long) this.field3568) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.length; var8++) {
                byte var11 = arg1[var8];
                int[] var12 = this.field3558[var7];
                for (int var13 = 0; var13 < 14; var13++) {
                    var5[var6 + var13] += var12[var13] * var11;
                }
                int var14 = this.field3557 + var7;
                int var15 = var14 / this.field3568;
                var7 = var14 - this.field3568 * var15;
                var6 += var15;
            }
            arg1 = new byte[var4];
            for (int var9 = 0; var9 < var4; var9++) {
                int var10 = var5[var9] + 32768 >> 16;
                if (var10 < -128) {
                    arg1[var9] = -128;
                } else if (var10 <= 127) {
                    arg1[var9] = (byte) var10;
                } else {
                    arg1[var9] = 127;
                }
            }
        }
        field3562++;
        return arg1;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(II)V")
    public class179(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class211.method1441(arg1, arg0, (byte) -65);
            int var4 = arg0 / var3;
            this.field3568 = var4;
            int var5 = arg1 / var3;
            this.field3558 = new int[var4][14];
            this.field3557 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field3558[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                double var12 = (double) var5 / (double) var4;
                while (var10 < var11) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I")
    public final int method1281(int arg0, int arg1) {
        int var3 = 21 % ((arg1 + 55) / 46);
        field3563++;
        if (this.field3558 != null) {
            arg0 = (int) ((long) this.field3557 * (long) arg0 / (long) this.field3568) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)I")
    public final int method1282(int arg0, int arg1) {
        int var3 = -120 / ((arg1 + 9) / 37);
        if (this.field3558 != null) {
            arg0 = (int) ((long) this.field3557 * (long) arg0 / (long) this.field3568);
        }
        field3559++;
        return arg0;
    }
}
