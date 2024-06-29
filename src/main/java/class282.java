import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class282 {

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
    private int field3958;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    private int field3954;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "[[I")
    private int[][] field3955;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "[C")
    private static char[] field3957 = new char[64];

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)I")
    public final int method1749(int arg0, int arg1) {
        if (this.field3955 != null) {
            arg0 = ((int) ((long) this.field3954 * (long) arg0 / (long) this.field3958)) + 6;
        }
        field3960++;
        int var3 = -81 % ((arg1 - 59) / 36);
        return arg0;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I[B)[B")
    public final byte[] method1750(int arg0, byte[] arg1) {
        if (arg0 != -15) {
            method1753(true);
        }
        if (this.field3955 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3954 / (long) this.field3958) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field3955[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3954 + var6;
                int var14 = var13 / this.field3958;
                var5 += var14;
                var6 = var13 - this.field3958 * var14;
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
        field3952++;
        return arg1;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II[J[II)V")
    public static final void method1751(int arg0, int arg1, long[] arg2, int[] arg3, int arg4) {
        if (arg0 > arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg1;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            int var9 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg0; var11++) {
                if (arg2[var11] < ((long) (var11 & var10) + var7)) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    int var14 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6++] = var14;
                }
            }
            arg2[arg0] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var9;
            method1751(var6 - 1, arg1, arg2, arg3, 1);
            method1751(arg0, var6 + 1, arg2, arg3, 1);
        }
        field3956++;
        if (arg4 != 1) {
            field3957 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lvo;IILfa;Ljava/awt/Canvas;)Lr;")
    public static final class98 method1752(class345 arg0, int arg1, int arg2, class615 arg3, Canvas arg4) {
        field3953++;
        if (!class206.method1432(1253)) {
            throw new RuntimeException("");
        } else if (class331.method1968("jaggl", (byte) 55)) {
            if (arg1 != -63) {
                method1753(false);
            }
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg4, 8, 8, 8, 24, 0, arg2);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class669 var8 = new class669(var5, arg4, var6, arg3, arg0, arg2);
            var8.method2919(-113);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)V")
    public static void method1753(boolean arg0) {
        if (arg0) {
            field3957 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(II)I")
    public final int method1754(int arg0, int arg1) {
        if (this.field3955 != null) {
            arg0 = (int) ((long) this.field3954 * (long) arg0 / (long) this.field3958);
        }
        field3959++;
        int var3 = -98 / ((arg1 - 32) / 43);
        return arg0;
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(II)V")
    public class282(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class410.method2448(arg1, 0, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field3958 = var4;
            this.field3954 = var5;
            this.field3955 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field3955[var6];
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

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3957[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3957[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3957[var2] = (char) (var2 - 4);
        }
        field3957[62] = '+';
        field3957[63] = '/';
    }
}
