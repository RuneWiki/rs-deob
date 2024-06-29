import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class222 {

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    private int field3187;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    private int field3193;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "[[I")
    private int[][] field3192;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3191 = "white:";

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Lin;")
    public static class344 field3189;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([BI)[B", line = 5)
    public final byte[] method1565(byte[] arg0, int arg1) {
        if (this.field3192 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field3193 / (long) this.field3187) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var8 = arg0[var7];
                int[] var9 = this.field3192[var6];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var5 + var10] += var9[var10] * var8;
                }
                int var11 = this.field3193 + var6;
                int var12 = var11 / this.field3187;
                var6 = var11 - this.field3187 * var12;
                var5 += var12;
            }
            arg0 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg0[var13] = -128;
                } else if (var14 <= 127) {
                    arg0[var13] = (byte) var14;
                } else {
                    arg0[var13] = 127;
                }
            }
        }
        if (arg1 < 38) {
            this.method1565((byte[]) null, -126);
        }
        field3194++;
        return arg0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)I", line = 76)
    public final int method1566(int arg0, byte arg1) {
        if (this.field3192 != null) {
            arg0 = (int) ((long) this.field3193 * (long) arg0 / (long) this.field3187) + 6;
        }
        int var3 = 87 % ((arg1 + 8) / 60);
        field3186++;
        return arg0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 92)
    public static void method1567(byte arg0) {
        int var1 = 40 / ((64 - arg0) / 59);
        field3189 = null;
        field3191 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([ZZII[ILtk;[[F[[FZZI[[II[[III[[FIIZBI)V", line = 102)
    public static final void method1568(boolean[] arg0, boolean arg1, int arg2, int arg3, int[] arg4, class268 arg5, float[][] arg6, float[][] arg7, boolean arg8, boolean arg9, int arg10, int[][] arg11, int arg12, int[][] arg13, int arg14, int arg15, float[][] arg16, int arg17, int arg18, boolean arg19, byte arg20, int arg21) {
        field3195++;
        int var22 = (arg8 ? 255 : 0) + (arg18 << 8);
        int var23 = (arg1 ? 255 : 0) + (arg15 << 8);
        int var24 = (arg9 ? 255 : 0) + (arg10 << 8);
        int[] var25 = new int[arg4.length / 2];
        int var26 = (arg2 << 8) + (arg19 ? 255 : 0);
        for (int var27 = arg17; var27 < var25.length; var27++) {
            int var28 = arg4[var27 + var27];
            int[][] var29 = arg13 == null || arg0 == null || !arg0[var27] ? arg11 : arg13;
            int var30 = arg4[var27 + var27 + 1];
            var25[var27] = class52.method356(arg14, false, var29, arg16, (byte) -119, arg13, arg20, arg12, var28, arg5, var26, var30, var23, arg7, var22, (float) arg21, var24, arg6);
        }
        arg5.method1847(arg3, arg12, arg14, var25, (int[]) null, false);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)I", line = 140)
    public final int method1569(int arg0, int arg1) {
        field3188++;
        if (arg0 == -5690) {
            if (this.field3192 != null) {
                arg1 = (int) ((long) this.field3193 * (long) arg1 / (long) this.field3187);
            }
            return arg1;
        } else {
            return -67;
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(II)V", line = 158)
    public class222(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class208.method1466(arg1, arg0, -9);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field3187 = var5;
            this.field3193 = var4;
            this.field3192 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3192[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                double var12 = (double) var4 / (double) var5;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (-1.0E-4D > var14 || var14 > 1.0E-4D) {
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
