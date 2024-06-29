import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class504 {

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    private int field7520;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    private int field7518;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "[[I")
    private int[][] field7522;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Lcm;")
    public static class449 field7525 = new class449(54, -1);

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Lcm;")
    public static class449 field7526 = new class449(15, 8);

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field7529 = 1;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "[Ltq;")
    public static class270[] field7532 = new class270[14];

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "[F")
    public static float[] field7530 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "Lns;")
    public static class438 field7527;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "[[I")
    public static int[][] field7531;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
    public static final void method3011(int arg0, int arg1, int arg2) {
        field7523++;
        if (arg0 != 19499) {
            field7526 = null;
        }
        class377 var3 = class99.method672(arg2, false, 12);
        var3.method2340((byte) 126);
        var3.field5763 = arg1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([BB)[B")
    public final byte[] method3012(byte[] arg0, byte arg1) {
        field7517++;
        if (this.field7522 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field7520 / (long) this.field7518) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field7522[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field7520 + var6;
                int var14 = var13 / this.field7518;
                var6 = var13 - this.field7518 * var14;
                var5 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        int var15 = -29 % ((-arg1 - 71) / 34);
        return arg0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
    public final int method3013(int arg0, int arg1) {
        int var3 = -84 % ((arg1 - 29) / 59);
        if (this.field7522 != null) {
            arg0 = (int) ((long) this.field7520 * (long) arg0 / (long) this.field7518);
        }
        field7521++;
        return arg0;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)I")
    public final int method3014(int arg0, int arg1) {
        if (arg1 != 31384) {
            method3015(81);
        }
        if (this.field7522 != null) {
            arg0 = (int) ((long) this.field7520 * (long) arg0 / (long) this.field7518) + 6;
        }
        field7519++;
        return arg0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static void method3015(int arg0) {
        field7527 = null;
        field7532 = null;
        field7526 = null;
        if (arg0 != 14149) {
            method3016((byte) 125);
        }
        field7525 = null;
        field7530 = null;
        field7531 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static final void method3016(byte arg0) {
        if (class277.field3839 < 0) {
            class145.field2089 = -1;
            class276.field3835 = -1;
            class277.field3839 = 0;
        }
        int var1 = 120 % ((arg0 - 56) / 63);
        field7524++;
        if (class277.field3839 > class135.field1986) {
            class276.field3835 = -1;
            class145.field2089 = -1;
            class277.field3839 = class135.field1986;
        }
        if (class501.field7487 < 0) {
            class501.field7487 = 0;
            class276.field3835 = -1;
            class145.field2089 = -1;
        }
        if (class501.field7487 > class135.field1968) {
            class145.field2089 = -1;
            class501.field7487 = class135.field1968;
            class276.field3835 = -1;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(II)V")
    public class504(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class237.method1606(arg1, (byte) -10, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field7520 = var4;
            this.field7518 = var5;
            this.field7522 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field7522[var6];
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
