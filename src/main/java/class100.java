import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class100 {

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    private int field1363;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    private int field1357;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "[[I")
    private int[][] field1365;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "Liu;")
    public static class390 field1367 = new class390(69, 3);

    @OriginalMember(owner = "client!as", name = "l", descriptor = "Ltq;")
    public static class426 field1368 = new class426(11, 7);

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)I", line = 4)
    public final int method600(int arg0, int arg1) {
        if (arg0 != -14) {
            method603(119);
        }
        if (this.field1365 != null) {
            arg1 = (int) ((long) this.field1363 * (long) arg1 / (long) this.field1357);
        }
        field1362++;
        return arg1;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V", line = 23)
    public static void method601(boolean arg0) {
        if (!arg0) {
            field1367 = null;
            field1368 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "([BB)[B", line = 36)
    public final byte[] method602(byte[] arg0, byte arg1) {
        if (this.field1365 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1363 / (long) this.field1357) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field1365[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1363 + var6;
                int var14 = var13 / this.field1357;
                var6 = var13 - this.field1357 * var14;
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
        field1358++;
        if (arg1 >= -47) {
            field1367 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V", line = 104)
    public static final void method603(int arg0) {
        field1364++;
        if (class94.field1266) {
            return;
        }
        if (arg0 < 25) {
            method603(41);
        }
        class477.field6873 = true;
        if (class118.field1533.field6908) {
            class473.field6841 = ((int) class473.field6841 - 17 & 0xFFFFFFF0);
        } else {
            class107.field1432 += (-class107.field1432 - 12.0F) / 2.0F;
        }
        class94.field1266 = true;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BLjava/lang/String;)I", line = 130)
    public static final int method604(byte arg0, String arg1) {
        field1359++;
        return arg0 <= 122 ? 112 : arg1.length() + 1;
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(II)V", line = 143)
    public class100(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class387.method2325(arg0, arg1, (byte) -90);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field1363 = var5;
            this.field1357 = var4;
            this.field1365 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field1365[var6];
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

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIIIII)V", line = 207)
    public static final void method605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1360++;
        if (arg4 != -1) {
            method606(115, null, 100, null);
        }
        if (class322.method1928(arg8, 7387)) {
            if (class135.field1730[arg8] == null) {
                class124.method699(arg7, -1, arg0, (byte) 39, class181.field2591[arg8], arg2, arg6, arg3, arg5, arg1);
            } else {
                class124.method699(arg7, -1, arg0, (byte) 39, class135.field1730[arg8], arg2, arg6, arg3, arg5, arg1);
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class61.field909[var9] = true;
            }
        } else {
            class61.field909[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILjava/lang/String;ILrl;)Lth;", line = 240)
    public static final class405 method606(int arg0, String arg1, int arg2, class487 arg3) {
        field1366++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class334.field4845, 0);
        if (arg2 != -25535) {
            return null;
        } else if (class334.field4845[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class405(arg3, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(II)I", line = 266)
    public final int method607(int arg0, int arg1) {
        field1361++;
        if (this.field1365 != null) {
            arg1 = (int) ((long) this.field1363 * (long) arg1 / (long) this.field1357) + 6;
        }
        int var3 = 43 / ((arg0 - 9) / 52);
        return arg1;
    }
}
