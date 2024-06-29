import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class229 {

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "[[I")
    private int[][] field3553;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    private int field3554;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    private int field3559;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field3555 = 0;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Lbj;")
    public static class162 field3557 = new class162(24, 3);

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field3560 = 0;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Ljo;")
    public static class222 field3562;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Lo;")
    public static class24 field3552;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method1514(int arg0) {
        if (arg0 <= -68) {
            field3552 = null;
            field3562 = null;
            field3557 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([BZ)[B")
    public final byte[] method1515(byte[] arg0, boolean arg1) {
        if (arg1) {
            field3552 = null;
        }
        field3558++;
        if (this.field3553 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field3554 / (long) this.field3559) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field3553[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3554 + var6;
                int var14 = var13 / this.field3559;
                var5 += var14;
                var6 = var13 - this.field3559 * var14;
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
        return arg0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)I")
    public final int method1516(int arg0, int arg1) {
        field3556++;
        if (arg0 != 14) {
            this.method1516(124, 69);
        }
        if (this.field3553 != null) {
            arg1 = (int) ((long) this.field3554 * (long) arg1 / (long) this.field3559);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)I")
    public final int method1517(int arg0, boolean arg1) {
        if (this.field3553 != null) {
            arg0 = (int) ((long) this.field3554 * (long) arg0 / (long) this.field3559) + 6;
        }
        field3551++;
        return arg1 ? arg0 : 48;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(II)V")
    public class229(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class71.method610(arg0, -124, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field3553 = new int[var5][14];
            this.field3554 = var4;
            this.field3559 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3553[var6];
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
