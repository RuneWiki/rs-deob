import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class44 {

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    private int field666;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "[[I")
    private int[][] field664;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    private int field671;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Llh;")
    public static class364 field667 = new class364(64);

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "Lao;")
    public static class188 field673 = new class188(4, 14);

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "Lqa;")
    public static class162 field675;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "Lmf;")
    public static class287 field674;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
    public static final void method331(int arg0, int arg1) {
        class22.field343.method2348(arg0, -126);
        field668++;
        if (arg1 != 127) {
            field674 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method332(int arg0) {
        field667 = null;
        field673 = null;
        field674 = null;
        if (arg0 != 1630200752) {
            method332(67);
        }
        field675 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z[B)[B")
    public final byte[] method333(boolean arg0, byte[] arg1) {
        if (this.field664 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field666 / (long) this.field671) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field664[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field666 + var6;
                int var14 = var13 / this.field671;
                var6 = var13 - this.field671 * var14;
                var5 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        if (arg0) {
            return null;
        } else {
            field670++;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
    public static final void method334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field665++;
        if (class529.field7807 == null) {
            return;
        }
        class22 var15;
        if (arg6 >= 0) {
            int var14 = arg6 - 1;
            var15 = class132.field2030[var14];
        } else {
            int var16 = -arg6 - 1;
            if (class64.field1128 == var16) {
                var15 = class95.field1558;
            } else {
                var15 = class390.field5783[var16];
            }
        }
        if (var15 == null) {
            return;
        }
        if (arg7 != 4) {
            field674 = null;
        }
        class510 var17 = class246.field3567.method609(110, arg2);
        int var18;
        int var19;
        if (arg5 == 1 || arg5 == 3) {
            var18 = var17.field7459;
            var19 = var17.field7475;
        } else {
            var18 = var17.field7475;
            var19 = var17.field7459;
        }
        int var20 = (var19 >> 1) + arg10;
        int var21 = (var19 + 1 >> 1) + arg10;
        int var22 = (var18 >> 1) + arg3;
        int var23 = arg3 + (var18 + 1 >> 1);
        class35 var24 = class529.field7807[arg11];
        int var25 = var24.method271(var20, var22) + var24.method271(var21, var22) + var24.method271(var20, var23) + var24.method271(var21, var23) >> 2;
        class221 var26 = new class221();
        if (arg9 < arg1) {
            int var27 = arg1;
            arg1 = arg9;
            arg9 = var27;
        }
        var26.field3198 = arg5;
        var26.field3191 = arg10;
        var26.field3199 = arg3;
        var26.field3195 = arg2;
        var26.field3188 = var15.field5538;
        var26.field3204 = arg0;
        var26.field3196 = class180.field2734 + arg13;
        var26.field3189 = class180.field2734 + arg8;
        if (arg12 < arg4) {
            int var28 = arg4;
            arg4 = arg12;
            arg12 = var28;
        }
        var26.field3203 = arg9 + arg10;
        var26.field3197 = arg10 + arg1;
        var26.field3193 = arg3 + arg4;
        var26.field3187 = var25;
        var26.field3205 = (var26.field3191 << 7) + (var19 << 6);
        var26.field3194 = (var26.field3199 << 7) + (var18 << 6);
        var26.field3201 = arg3 + arg12;
        class35.field536.method2270(0, var26);
        var15.field415 = var26;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)I")
    public final int method335(byte arg0, int arg1) {
        if (this.field664 != null) {
            arg1 = ((int) ((long) this.field666 * (long) arg1 / (long) this.field671)) + 6;
        }
        if (arg0 != -111) {
            this.method336(105, -41);
        }
        field663++;
        return arg1;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)I")
    public final int method336(int arg0, int arg1) {
        if (arg0 != -19134) {
            this.field666 = -63;
        }
        field669++;
        if (this.field664 != null) {
            arg1 = (int) ((long) this.field666 * (long) arg1 / (long) this.field671);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(II)V")
    public class44(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class496.method2957(14133, arg1, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field666 = var5;
            this.field664 = new int[var4][14];
            this.field671 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field664[var6];
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
