import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class54 {

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    private int field832;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "[[I")
    private int[][] field829;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    private int field828;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lsc;")
    public static class270 field830 = new class270(11, 0, 1, 2);

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "[I")
    public static int[] field831 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lla;")
    public static class310 field833;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "[I")
    public static int[] field834;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)I")
    public final int method351(int arg0, int arg1) {
        if (this.field829 != null) {
            arg1 = (int) ((long) this.field832 * (long) arg1 / (long) this.field828);
        }
        if (arg0 <= 30) {
            return -69;
        } else {
            field825++;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([BB)[B")
    public final byte[] method352(byte[] arg0, byte arg1) {
        field826++;
        if (this.field829 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field832 / (long) this.field828) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field829[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field832 + var6;
                int var14 = var13 / this.field828;
                var6 = var13 - this.field828 * var14;
                var5 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        if (arg1 != 32) {
            field830 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static void method353(byte arg0) {
        int var1 = -17 % ((arg0 + 68) / 41);
        field831 = null;
        field830 = null;
        field833 = null;
        field834 = null;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)I")
    public final int method354(int arg0, int arg1) {
        field827++;
        if (this.field829 != null) {
            arg0 = (int) ((long) this.field832 * (long) arg0 / (long) this.field828) + 6;
        }
        return arg1 == -5107 ? arg0 : -67;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(II)V")
    public class54(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class359.method2287((byte) 112, arg0, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field832 = var5;
            this.field829 = new int[var4][14];
            this.field828 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field829[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
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
