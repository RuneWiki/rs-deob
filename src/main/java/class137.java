import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class137 {

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    private static int field2224;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    private static int field2227;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Lcl;")
    public static class32 field2225;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "[Lcl;")
    public static class32[] field2226;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "[[Lee;")
    public static class79[][] field2223;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lcl;III)V", line = 6)
    public static final void method975(class32 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class117.field1972 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class117.field1971 * arg2 >> 8) >> 3;
            method978(arg0, field2225, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([B[BIIIIII)V", line = 17)
    private static final void method976(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -(arg4 >> 2);
        int var9 = -(arg4 & 0x3);
        for (int var10 = -arg5; var10 < 0; var10++) {
            int var10001;
            for (int var11 = var8; var11 < 0; var11++) {
                var10001 = arg3++;
                arg0[var10001] -= arg1[arg2++];
                int var13 = arg3++;
                arg0[var13] -= arg1[arg2++];
                int var14 = arg3++;
                arg0[var14] -= arg1[arg2++];
                int var15 = arg3++;
                arg0[var15] -= arg1[arg2++];
            }
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg0[var10001] -= arg1[arg2++];
            }
            arg3 += arg6;
            arg2 += arg7;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lcl;III)V", line = 52)
    public static final void method977(class32 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class117.field1972 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class117.field1971 * arg2 >> 8) >> 3;
            method987(arg0, field2225, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lcl;Lcl;II)V", line = 62)
    private static final void method978(class32 arg0, class32 arg1, int arg2, int arg3) {
        int var4 = arg0.field3614 + arg2;
        int var5 = arg0.field3619 + arg3;
        int var6 = arg1.field3621 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3615;
        int var9 = arg0.field3621;
        int var10 = arg1.field3621 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field3621 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3615) {
            int var13 = var5 + var8 + 1 - arg1.field3615;
            var8 -= var13;
        }
        if (var4 <= 0) {
            int var14 = 1 - var4;
            var9 -= var14;
            var7 += var14;
            var6 += var14;
            var11 += var14;
            var10 += var14;
            var4 = 1;
        }
        if (var4 + var9 >= arg1.field3621) {
            int var15 = var4 + var9 + 1 - arg1.field3621;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method976(arg1.field541, arg0.field541, var7, var6, var9, var8, var10, var11);
            method989(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()V", line = 122)
    public static final void method979() {
        field2225 = null;
        field2226 = null;
        field2223 = (class79[][]) null;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(Lcl;III)Z", line = 127)
    public static final boolean method980(class32 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class117.field1972 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class117.field1971 * arg2 >> 8) >> 3;
            return method984(arg0, field2225, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([BIIIII)Z", line = 138)
    private static final boolean method981(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 % arg5;
        int var7;
        if (var6 == 0) {
            var7 = 0;
        } else {
            var7 = arg5 - var6;
        }
        int var8 = -((arg3 + arg5 - 1) / arg5);
        int var9 = -((arg2 + arg5 - 1) / arg5);
        for (int var10 = var8; var10 < 0; var10++) {
            for (int var11 = var9; var11 < 0; var11++) {
                if (arg0[arg1] == 0) {
                    return true;
                }
                arg1 += arg5;
            }
            int var12 = arg1 - var7;
            if (arg0[var12 - 1] == 0) {
                return true;
            }
            arg1 = arg4 + var12;
        }
        return false;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "([B[BIIIIII)V", line = 179)
    private static final void method982(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -(arg4 >> 2);
        int var9 = -(arg4 & 0x3);
        for (int var10 = -arg5; var10 < 0; var10++) {
            int var10001;
            for (int var11 = var8; var11 < 0; var11++) {
                var10001 = arg3++;
                arg0[var10001] += arg1[arg2++];
                int var13 = arg3++;
                arg0[var13] += arg1[arg2++];
                int var14 = arg3++;
                arg0[var14] += arg1[arg2++];
                int var15 = arg3++;
                arg0[var15] += arg1[arg2++];
            }
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg0[var10001] += arg1[arg2++];
            }
            arg3 += arg6;
            arg2 += arg7;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lcl;Lcl;IIIZ)V", line = 214)
    private static final void method983(class32 arg0, class32 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field3621 || arg3 + 16 >= arg1.field3615) {
            return;
        }
        int var6 = arg1.field3621 * arg3 + arg2;
        int var7 = arg1.field3621 - 16;
        short var8;
        byte var9;
        int var10;
        if (arg4 == 0) {
            var8 = 240;
            var9 = 1;
            var10 = -var9 * 16 - 16;
        } else if (arg4 == 1) {
            var8 = 255;
            var9 = -16;
            var10 = -var9 * 16 - 1;
        } else if (arg4 == 2) {
            var8 = 15;
            var9 = -1;
            var10 = -var9 * 16 + 16;
        } else {
            var8 = 0;
            var9 = 16;
            var10 = -var9 * 16 + 1;
        }
        if (arg5) {
            method992(arg1.field541, arg0.field541, var8, var6, var7, var9, var10);
        } else {
            method991(arg1.field541, arg0.field541, var8, var6, var7, var9, var10);
        }
        method989(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lcl;Lcl;II)Z", line = 261)
    private static final boolean method984(class32 arg0, class32 arg1, int arg2, int arg3) {
        int var4 = arg0.field3614 + arg2;
        int var5 = arg0.field3619 + arg3;
        int var6 = arg1.field3621 * var5 + var4;
        int var7 = arg0.field3615;
        int var8 = arg0.field3621;
        int var9 = arg1.field3621 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field3621 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field3615) {
            int var11 = var5 + var7 + 1 - arg1.field3615;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field3621) {
            int var13 = var4 + var8 + 1 - arg1.field3621;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field3621 + var9;
            method989(var4, var5, var8, var7);
            return method981(arg1.field541, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIZZIIIIII)V", line = 322)
    public static final void method985(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class117.field1972 * var11 >> 8) >> 3;
        int var14 = var12 - (class117.field1971 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method987(field2226[1], field2225, var13 + 1, var14 + 1);
        } else {
            method983(field2226[arg0], field2225, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII[[Z[[I)V", line = 351)
    public static final void method986(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class99.field1682;
        class99.method758(1);
        class99.method765(1);
        class99.method750();
        class99.method730(false);
        class285.method1964(116, 0, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field2224; var7++) {
            label52: for (int var8 = 0; var8 < field2227; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class79 var11 = field2223[var7][var8];
                                if (var11.field1315) {
                                    var11.method591(field2225, var7, var8);
                                    var11.field1315 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method594();
                                var6.glPopMatrix();
                                continue label52;
                            }
                        }
                    }
                }
            }
        }
        var6.glEnableClientState(32886);
        var6.glDepthMask(true);
        class99.method764();
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(Lcl;Lcl;II)V", line = 421)
    private static final void method987(class32 arg0, class32 arg1, int arg2, int arg3) {
        int var4 = arg0.field3614 + arg2;
        int var5 = arg0.field3619 + arg3;
        int var6 = arg1.field3621 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3615;
        int var9 = arg0.field3621;
        int var10 = arg1.field3621 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field3621 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3615) {
            int var13 = var5 + var8 + 1 - arg1.field3615;
            var8 -= var13;
        }
        if (var4 <= 0) {
            int var14 = 1 - var4;
            var9 -= var14;
            var7 += var14;
            var6 += var14;
            var11 += var14;
            var10 += var14;
            var4 = 1;
        }
        if (var4 + var9 >= arg1.field3621) {
            int var15 = var4 + var9 + 1 - arg1.field3621;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method982(arg1.field541, arg0.field541, var7, var6, var9, var8, var10, var11);
            method989(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V", line = 480)
    public static final void method988(int arg0, int arg1) {
        field2224 = arg0 + 7 >> 3;
        field2227 = arg1 + 7 >> 3;
        field2225 = new class32(field2224 * 128 + 2, field2227 * 128 + 2, 0);
        field2223 = new class79[field2224][field2227];
        for (int var2 = 0; var2 < field2224; var2++) {
            for (int var3 = 0; var3 < field2227; var3++) {
                field2223[var2][var3] = new class79();
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)V", line = 504)
    private static final void method989(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field2223[var8][var9].field1315 = true;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "()V", line = 530)
    public static void method990() {
        field2225 = null;
        field2226 = null;
        field2223 = (class79[][]) null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([B[BIIIII)V", line = 540)
    private static final void method991(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (int var7 = -16; var7 < 0; var7++) {
            for (int var8 = -4; var8 < 0; var8++) {
                int var10001 = arg3++;
                arg0[var10001] += arg1[arg2];
                int var9 = arg2 + arg5;
                int var12 = arg3++;
                arg0[var12] += arg1[var9];
                int var10 = arg5 + var9;
                int var13 = arg3++;
                arg0[var13] += arg1[var10];
                int var11 = arg5 + var10;
                int var14 = arg3++;
                arg0[var14] += arg1[var11];
                arg2 = arg5 + var11;
            }
            arg3 += arg4;
            arg2 += arg6;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "([B[BIIIII)V", line = 568)
    private static final void method992(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (int var7 = -16; var7 < 0; var7++) {
            for (int var8 = -4; var8 < 0; var8++) {
                int var10001 = arg3++;
                arg0[var10001] = (byte) (arg0[var10001] + (1 - arg1[arg2]));
                int var9 = arg2 + arg5;
                int var12 = arg3++;
                arg0[var12] = (byte) (arg0[var12] + (1 - arg1[var9]));
                int var10 = arg5 + var9;
                int var13 = arg3++;
                arg0[var13] = (byte) (arg0[var13] + (1 - arg1[var10]));
                int var11 = arg5 + var10;
                int var14 = arg3++;
                arg0[var14] = (byte) (arg0[var14] + (1 - arg1[var11]));
                arg2 = arg5 + var11;
            }
            arg3 += arg4;
            arg2 += arg6;
        }
    }
}
