import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class624 {

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    private int field9194;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "[[I")
    private int[][] field9200;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    private int field9196;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field9190 = 0;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Z")
    public static boolean field9195 = true;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lh;")
    public static class572 field9189 = new class572("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field9191;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field9192;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field9197;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "[I")
    public static int[] field9193;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "[I")
    public static int[] field9201;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[B)[B", line = 4)
    public final byte[] method3646(int arg0, byte[] arg1) {
        if (this.field9200 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field9196 / (long) this.field9194) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field9200[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field9196 + var6;
                int var14 = var13 / this.field9194;
                var5 += var14;
                var6 = var13 - this.field9194 * var14;
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
        field9198++;
        if (arg0 != 14) {
            field9189 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIII)V", line = 76)
    public static final void method3647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9199++;
        class196.method1322((byte) 25, arg3);
        int var7 = arg4;
        int var8 = arg3 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class604.field8993[arg1];
        int var16 = arg5 - var8;
        class140.method969(arg5 - arg3, 15888, arg0, var16, var15);
        int var17 = arg5 + var8;
        class140.method969(var16, 15888, arg2, var17, var15);
        class140.method969(var17, arg4 ^ 0x3E10, arg0, arg3 + arg5, var15);
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class423.field5715[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var8 <= var9) {
                    int[] var18 = class604.field8993[arg1 + var9];
                    int[] var19 = class604.field8993[arg1 - var9];
                    int var20 = arg5 + var7;
                    int var21 = arg5 - var7;
                    class140.method969(var21, 15888, arg0, var20, var18);
                    class140.method969(var21, arg4 ^ 0x3E10, arg0, var20, var19);
                } else {
                    int[] var22 = class604.field8993[arg1 + var9];
                    int[] var23 = class604.field8993[arg1 - var9];
                    int var24 = class423.field5715[var9];
                    int var25 = arg5 + var7;
                    int var26 = arg5 - var7;
                    int var27 = arg5 + var24;
                    int var28 = arg5 - var24;
                    class140.method969(var26, arg4 + 15888, arg0, var28, var22);
                    class140.method969(var28, 15888, arg2, var27, var22);
                    class140.method969(var27, 15888, arg0, var25, var22);
                    class140.method969(var26, 15888, arg0, var28, var23);
                    class140.method969(var28, 15888, arg2, var27, var23);
                    class140.method969(var27, 15888, arg0, var25, var23);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class604.field8993[arg1 + var7];
            int[] var30 = class604.field8993[arg1 - var7];
            int var31 = arg5 + var9;
            int var32 = arg5 - var9;
            if (var8 <= var7) {
                class140.method969(var32, arg4 ^ 0x3E10, arg0, var31, var29);
                class140.method969(var32, 15888, arg0, var31, var30);
            } else {
                int var33 = var7 > var11 ? class423.field5715[var7] : var11;
                int var34 = arg5 + var33;
                int var35 = arg5 - var33;
                class140.method969(var32, 15888, arg0, var35, var29);
                class140.method969(var35, 15888, arg2, var34, var29);
                class140.method969(var34, 15888, arg0, var31, var29);
                class140.method969(var32, arg4 + 15888, arg0, var35, var30);
                class140.method969(var35, 15888, arg2, var34, var30);
                class140.method969(var34, arg4 + 15888, arg0, var31, var30);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)I", line = 205)
    public final int method3648(int arg0, boolean arg1) {
        if (arg1) {
            method3650(-10, 50, -113, null);
        }
        if (this.field9200 != null) {
            arg0 = (int) ((long) this.field9196 * (long) arg0 / (long) this.field9194) + 6;
        }
        field9192++;
        return arg0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I", line = 222)
    public final int method3649(int arg0, int arg1) {
        field9197++;
        if (this.field9200 != null) {
            arg0 = (int) ((long) this.field9196 * (long) arg0 / (long) this.field9194);
        }
        if (arg1 > -77) {
            method3650(-22, 84, -16, null);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIILjava/lang/Class;)Lpc;", line = 242)
    public static final class577 method3650(int arg0, int arg1, int arg2, Class arg3) {
        class205 var4 = class420.field5697[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class636 var5 = var4.field3029; var5 != null; var5 = var5.field9302) {
            class577 var6 = var5.field9299;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field8504 == arg1 && var6.field8509 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V", line = 269)
    public static void method3651(boolean arg0) {
        field9193 = null;
        if (!arg0) {
            method3647(23, -52, 117, 90, 74, -72, -75);
        }
        field9189 = null;
        field9201 = null;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V", line = 281)
    public class624(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class406.method2391((byte) 126, arg1, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field9194 = var5;
            this.field9200 = new int[var5][14];
            this.field9196 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field9200[var6];
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
