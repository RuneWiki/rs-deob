import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class18 {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    private static int field240;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    private static int field241;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Lje;")
    public static class68 field243;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "[Lje;")
    public static class68[] field239;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "[[Lok;")
    public static class141[][] field242;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([B[BIIIIII)V", line = 5)
    private static final void method107(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lje;III)V", line = 43)
    public static final void method108(class68 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class239.field4039 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class239.field4035 * arg2 >> 8) >> 3;
            method122(arg0, field243, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lje;Lje;IIIZ)V", line = 53)
    private static final void method109(class68 arg0, class68 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field4007 || arg3 + 16 >= arg1.field3999) {
            return;
        }
        int var6 = arg1.field4007 * arg3 + arg2;
        int var7 = arg1.field4007 - 16;
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
            method113(arg1.field1179, arg0.field1179, var8, var6, var7, var9, var10);
        } else {
            method115(arg1.field1179, arg0.field1179, var8, var6, var7, var9, var10);
        }
        method121(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Lje;III)V", line = 103)
    public static final void method110(class68 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class239.field4039 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class239.field4035 * arg2 >> 8) >> 3;
            method112(arg0, field243, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lje;Lje;II)Z", line = 113)
    private static final boolean method111(class68 arg0, class68 arg1, int arg2, int arg3) {
        int var4 = arg0.field4005 + arg2;
        int var5 = arg0.field4002 + arg3;
        int var6 = arg1.field4007 * var5 + var4;
        int var7 = arg0.field3999;
        int var8 = arg0.field4007;
        int var9 = arg1.field4007 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field4007 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field3999) {
            int var11 = var5 + var7 + 1 - arg1.field3999;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field4007) {
            int var13 = var4 + var8 + 1 - arg1.field4007;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field4007 + var9;
            method121(var4, var5, var8, var7);
            return method114(arg1.field1179, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Lje;Lje;II)V", line = 174)
    private static final void method112(class68 arg0, class68 arg1, int arg2, int arg3) {
        int var4 = arg0.field4005 + arg2;
        int var5 = arg0.field4002 + arg3;
        int var6 = arg1.field4007 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3999;
        int var9 = arg0.field4007;
        int var10 = arg1.field4007 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field4007 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3999) {
            int var13 = var5 + var8 + 1 - arg1.field3999;
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
        if (var4 + var9 >= arg1.field4007) {
            int var15 = var4 + var9 + 1 - arg1.field4007;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method107(arg1.field1179, arg0.field1179, var7, var6, var9, var8, var10, var11);
            method121(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([B[BIIIII)V", line = 235)
    private static final void method113(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([BIIIII)Z", line = 262)
    private static final boolean method114(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "([B[BIIIII)V", line = 303)
    private static final void method115(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "([B[BIIIIII)V", line = 330)
    private static final void method116(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()V", line = 365)
    public static void method117() {
        field243 = null;
        field239 = null;
        field242 = (class141[][]) null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZZIIIIII)V", line = 370)
    public static final void method118(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class239.field4039 * var11 >> 8) >> 3;
        int var14 = var12 - (class239.field4035 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method122(field239[1], field243, var13 + 1, var14 + 1);
        } else {
            method109(field239[arg0], field243, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII[[Z[[I)V", line = 399)
    public static final void method119(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class47.field739;
        class47.method324(1);
        class47.method337(1);
        class47.method319();
        class47.method321(false);
        class140.method1079(0, (byte) 126, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field241; var7++) {
            label52: for (int var8 = 0; var8 < field240; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class141 var11 = field242[var7][var8];
                                if (var11.field2443) {
                                    var11.method1094(field243, var7, var8);
                                    var11.field2443 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1093();
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
        class47.method334();
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V", line = 469)
    public static final void method120(int arg0, int arg1) {
        field241 = arg0 + 7 >> 3;
        field240 = arg1 + 7 >> 3;
        field243 = new class68(field241 * 128 + 2, field240 * 128 + 2, 0);
        field242 = new class141[field241][field240];
        for (int var2 = 0; var2 < field241; var2++) {
            for (int var3 = 0; var3 < field240; var3++) {
                field242[var2][var3] = new class141();
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII)V", line = 493)
    private static final void method121(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field242[var8][var9].field2443 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(Lje;Lje;II)V", line = 519)
    private static final void method122(class68 arg0, class68 arg1, int arg2, int arg3) {
        int var4 = arg0.field4005 + arg2;
        int var5 = arg0.field4002 + arg3;
        int var6 = arg1.field4007 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field3999;
        int var9 = arg0.field4007;
        int var10 = arg1.field4007 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field4007 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field3999) {
            int var13 = var5 + var8 + 1 - arg1.field3999;
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
        if (var4 + var9 >= arg1.field4007) {
            int var15 = var4 + var9 + 1 - arg1.field4007;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method116(arg1.field1179, arg0.field1179, var7, var6, var9, var8, var10, var11);
            method121(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(Lje;III)Z", line = 578)
    public static final boolean method123(class68 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class239.field4039 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class239.field4035 * arg2 >> 8) >> 3;
            return method111(arg0, field243, var4 + 1, var5 + 1);
        }
    }
}
