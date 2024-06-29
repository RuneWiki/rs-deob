import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class179 {

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    private static int field2805;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    private static int field2807;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Lek;")
    public static class183 field2803;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "[Lek;")
    public static class183[] field2806;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "[[Lwm;")
    public static class152[][] field2804;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lek;Lek;II)V", line = 5)
    private static final void method1231(class183 arg0, class183 arg1, int arg2, int arg3) {
        int var4 = arg0.field2353 + arg2;
        int var5 = arg0.field2344 + arg3;
        int var6 = arg1.field2341 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field2351;
        int var9 = arg0.field2341;
        int var10 = arg1.field2341 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field2341 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field2351) {
            int var13 = var5 + var8 + 1 - arg1.field2351;
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
        if (var4 + var9 >= arg1.field2341) {
            int var15 = var4 + var9 + 1 - arg1.field2341;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1241(arg1.field2873, arg0.field2873, var7, var6, var9, var8, var10, var11);
            method1233(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([B[BIIIIII)V", line = 66)
    private static final void method1232(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)V", line = 102)
    private static final void method1233(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            for (int var9 = var6; var9 <= var7; var9++) {
                field2804[var8][var9].field2375 = true;
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIZZIIIIII)V", line = 128)
    public static final void method1234(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class289.field4814 * var11 >> 8) >> 3;
        int var14 = var12 - (class289.field4815 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method1231(field2806[1], field2803, var13 + 1, var14 + 1);
        } else {
            method1247(field2806[arg0], field2803, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII[[Z[[I)V", line = 157)
    public static final void method1235(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class255.field4181;
        class255.method1796(1);
        class255.method1787(1);
        class255.method1763();
        class255.method1777(false);
        class281.method1973(0, 0, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field2807; var7++) {
            label52: for (int var8 = 0; var8 < field2805; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class152 var11 = field2804[var7][var8];
                                if (var11.field2375) {
                                    var11.method1034(field2803, var7, var8);
                                    var11.field2375 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method1036();
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
        class255.method1786();
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([BIIIII)Z", line = 228)
    private static final boolean method1236(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(Lek;Lek;II)Z", line = 267)
    private static final boolean method1237(class183 arg0, class183 arg1, int arg2, int arg3) {
        int var4 = arg0.field2353 + arg2;
        int var5 = arg0.field2344 + arg3;
        int var6 = arg1.field2341 * var5 + var4;
        int var7 = arg0.field2351;
        int var8 = arg0.field2341;
        int var9 = arg1.field2341 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field2341 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field2351) {
            int var11 = var5 + var7 + 1 - arg1.field2351;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field2341) {
            int var13 = var4 + var8 + 1 - arg1.field2341;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field2341 + var9;
            method1233(var4, var5, var8, var7);
            return method1236(arg1.field2873, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V", line = 328)
    public static final void method1238(int arg0, int arg1) {
        field2807 = arg0 + 7 >> 3;
        field2805 = arg1 + 7 >> 3;
        field2803 = new class183(field2807 * 128 + 2, field2805 * 128 + 2, 0);
        field2804 = new class152[field2807][field2805];
        for (int var2 = 0; var2 < field2807; var2++) {
            for (int var3 = 0; var3 < field2805; var3++) {
                field2804[var2][var3] = new class152();
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(Lek;Lek;II)V", line = 351)
    private static final void method1239(class183 arg0, class183 arg1, int arg2, int arg3) {
        int var4 = arg0.field2353 + arg2;
        int var5 = arg0.field2344 + arg3;
        int var6 = arg1.field2341 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field2351;
        int var9 = arg0.field2341;
        int var10 = arg1.field2341 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field2341 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field2351) {
            int var13 = var5 + var8 + 1 - arg1.field2351;
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
        if (var4 + var9 >= arg1.field2341) {
            int var15 = var4 + var9 + 1 - arg1.field2341;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1232(arg1.field2873, arg0.field2873, var7, var6, var9, var8, var10, var11);
            method1233(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "()V", line = 410)
    public static final void method1240() {
        field2803 = null;
        field2806 = null;
        field2804 = (class152[][]) null;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "([B[BIIIIII)V", line = 416)
    private static final void method1241(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "()V", line = 451)
    public static void method1242() {
        field2803 = null;
        field2806 = null;
        field2804 = (class152[][]) null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([B[BIIIII)V", line = 458)
    private static final void method1243(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lek;III)V", line = 485)
    public static final void method1244(class183 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class289.field4814 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class289.field4815 * arg2 >> 8) >> 3;
            method1239(arg0, field2803, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "([B[BIIIII)V", line = 497)
    private static final void method1245(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(Lek;III)Z", line = 525)
    public static final boolean method1246(class183 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class289.field4814 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class289.field4815 * arg2 >> 8) >> 3;
            return method1237(arg0, field2803, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lek;Lek;IIIZ)V", line = 537)
    private static final void method1247(class183 arg0, class183 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field2341 || arg3 + 16 >= arg1.field2351) {
            return;
        }
        int var6 = arg1.field2341 * arg3 + arg2;
        int var7 = arg1.field2341 - 16;
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
            method1243(arg1.field2873, arg0.field2873, var8, var6, var7, var9, var10);
        } else {
            method1245(arg1.field2873, arg0.field2873, var8, var6, var7, var9, var10);
        }
        method1233(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(Lek;III)V", line = 584)
    public static final void method1248(class183 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class289.field4814 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class289.field4815 * arg2 >> 8) >> 3;
            method1231(arg0, field2803, var4 + 1, var5 + 1);
        }
    }
}
