import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class624 {

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    private int field8910;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    private int field8906;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "[[I")
    private int[][] field8912;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Lju;")
    public static class102 field8909 = new class102(65, 4);

    @OriginalMember(owner = "client!md", name = "j", descriptor = "[S")
    private static short[] field8914 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!md", name = "k", descriptor = "[S")
    private static short[] field8915 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!md", name = "m", descriptor = "S")
    public static short field8917 = 32767;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "[S")
    private static short[] field8918 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!md", name = "i", descriptor = "[[S")
    public static short[][] field8913 = new short[][] { field8915, field8914, field8918 };

    @OriginalMember(owner = "client!md", name = "o", descriptor = "Z")
    public static boolean field8919 = false;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field8905;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field8907;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field8908;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([BI)[B")
    public final byte[] method3649(byte[] arg0, int arg1) {
        field8916++;
        if (this.field8912 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field8906 / (long) this.field8910) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field8912[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field8906 + var6;
                int var14 = var13 / this.field8910;
                var6 = var13 - this.field8910 * var14;
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
        if (arg1 != -10142) {
            field8915 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[S)[S")
    public final short[] method3650(int arg0, short[] arg1) {
        if (this.field8912 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field8906 / (long) this.field8910) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                short var10 = arg1[var7];
                int[] var11 = this.field8912[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field8906 + var6;
                int var14 = var13 / this.field8910;
                var5 += var14;
                var6 = var13 - this.field8910 * var14;
            }
            arg1 = new short[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 8192 >> 14;
                if (var9 < -32768) {
                    arg1[var8] = -32768;
                } else if (var9 > 32767) {
                    arg1[var8] = 32767;
                } else {
                    arg1[var8] = (short) var9;
                }
            }
        }
        field8911++;
        if (arg0 > -85) {
            field8913 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)I")
    public final int method3651(int arg0, boolean arg1) {
        if (arg1) {
            return -66;
        }
        if (this.field8912 != null) {
            arg0 = (int) ((long) this.field8906 * (long) arg0 / (long) this.field8910);
        }
        field8907++;
        return arg0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method3652(byte arg0) {
        field8913 = null;
        field8915 = null;
        if (arg0 < 68) {
            method3652((byte) -17);
        }
        field8909 = null;
        field8918 = null;
        field8914 = null;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(II)V")
    public class624(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class345.method1983((byte) -75, arg1, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field8910 = var5;
            this.field8906 = var4;
            this.field8912 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field8912[var6];
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

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)I")
    public final int method3653(int arg0, int arg1) {
        if (this.field8912 != null) {
            arg1 = (int) ((long) this.field8906 * (long) arg1 / (long) this.field8910) + 6;
        }
        field8908++;
        if (arg0 != 6) {
            method3652((byte) -10);
        }
        return arg1;
    }
}
