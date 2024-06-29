import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class549 {

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    private int field7747;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    private int field7746;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "[[I")
    private int[][] field7736;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "Lke;")
    public static class622 field7744 = new class622(39, 7);

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "Ldba;")
    public static class101 field7748 = new class101(14, -1);

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field7737;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field7741;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "Lit;")
    public static class671 field7742;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)I", line = 6)
    public static final int method3185(int arg0, byte arg1) {
        field7737++;
        if (arg1 > -64) {
            return -38;
        } else {
            int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
            int var3 = arg0 * 6 - 61440;
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BI)I", line = 23)
    public final int method3186(byte arg0, int arg1) {
        if (arg0 >= -104) {
            this.method3190(-116, 103);
        }
        if (this.field7736 != null) {
            arg1 = (int) ((long) this.field7746 * (long) arg1 / (long) this.field7747);
        }
        field7745++;
        return arg1;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "([BI)[B", line = 41)
    public final byte[] method3187(byte[] arg0, int arg1) {
        if (this.field7736 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field7746 / (long) this.field7747) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field7736[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field7746 + var6;
                int var14 = var13 / this.field7747;
                var6 = var13 - this.field7747 * var14;
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
        int var15 = -2 / ((-arg1 - 48) / 50);
        field7740++;
        return arg0;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V", line = 108)
    public static void method3188(byte arg0) {
        field7742 = null;
        field7748 = null;
        if (arg0 == -68) {
            field7744 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "([SB)[S", line = 120)
    public final short[] method3189(short[] arg0, byte arg1) {
        field7743++;
        if (this.field7736 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field7746 / (long) this.field7747) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                short var10 = arg0[var7];
                int[] var11 = this.field7736[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field7746 + var6;
                int var14 = var13 / this.field7747;
                var5 += var14;
                var6 = var13 - this.field7747 * var14;
            }
            arg0 = new short[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 8192 >> 14;
                if (var9 < -32768) {
                    arg0[var8] = -32768;
                } else if (var9 > 32767) {
                    arg0[var8] = 32767;
                } else {
                    arg0[var8] = (short) var9;
                }
            }
        }
        return arg1 == 20 ? arg0 : null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)I", line = 191)
    public final int method3190(int arg0, int arg1) {
        field7741++;
        if (this.field7736 != null) {
            arg0 = (int) ((long) this.field7746 * (long) arg0 / (long) this.field7747) + 6;
        }
        if (arg1 <= 112) {
            field7748 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(II)V", line = 213)
    public class549(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class62.method375(arg1, 60, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field7747 = var5;
            this.field7746 = var4;
            this.field7736 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field7736[var6];
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
                while (var10 < var11) {
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
