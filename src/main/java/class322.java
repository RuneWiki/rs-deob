import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class322 {

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    private static int field4892;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    private static int field4893;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "Ltj;")
    public static class258 field4891;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "[Ltj;")
    public static class258[] field4890;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "[[Lmb;")
    public static class12[][] field4889;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "()V", line = 6)
    public static final void method2248() {
        field4891 = null;
        field4890 = null;
        field4889 = (class12[][]) null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)V", line = 12)
    private static final void method2249(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            class12[] var9 = field4889[var8];
            for (int var10 = var6; var10 <= var7; var10++) {
                var9[var10].field121 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII[[Z[[I)V", line = 39)
    public static final void method2250(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class67.field899;
        class67.method489(1);
        class67.method457(1);
        class67.method477();
        class67.method460(false);
        class123.method884(0, 0, 127);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field4893; var7++) {
            label52: for (int var8 = 0; var8 < field4892; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class12 var11 = field4889[var7][var8];
                                if (var11.field121) {
                                    var11.method69(field4891, var7, var8);
                                    var11.field121 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method68();
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
        class67.method483();
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZZIIIIII)V", line = 111)
    public static final void method2251(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class139.field1910 * var11 >> 8) >> 3;
        int var14 = var12 - (class139.field1903 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method2255(field4890[1], field4891, var13 + 1, var14 + 1);
        } else {
            method2258(field4890[arg0], field4891, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ltj;III)V", line = 139)
    public static final void method2252(class258 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class139.field1910 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class139.field1903 * arg2 >> 8) >> 3;
            method2265(arg0, field4891, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([B[BIIIII)V", line = 151)
    private static final void method2253(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Ltj;III)Z", line = 177)
    public static final boolean method2254(class258 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class139.field1910 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class139.field1903 * arg2 >> 8) >> 3;
            return method2262(arg0, field4891, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ltj;Ltj;II)V", line = 187)
    private static final void method2255(class258 arg0, class258 arg1, int arg2, int arg3) {
        int var4 = arg0.field40 + arg2;
        int var5 = arg0.field32 + arg3;
        int var6 = arg1.field28 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field38;
        int var9 = arg0.field28;
        int var10 = arg1.field28 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field28 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field38) {
            int var13 = var5 + var8 + 1 - arg1.field38;
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
        if (var4 + var9 >= arg1.field28) {
            int var15 = var4 + var9 + 1 - arg1.field28;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method2256(arg1.field3809, arg0.field3809, var7, var6, var9, var8, var10, var11);
            method2249(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([B[BIIIIII)V", line = 247)
    private static final void method2256(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(Ltj;III)V", line = 282)
    public static final void method2257(class258 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class139.field1910 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class139.field1903 * arg2 >> 8) >> 3;
            method2255(arg0, field4891, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ltj;Ltj;IIIZ)V", line = 293)
    private static final void method2258(class258 arg0, class258 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field28 || arg3 + 16 >= arg1.field38) {
            return;
        }
        int var6 = arg1.field28 * arg3 + arg2;
        int var7 = arg1.field28 - 16;
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
            method2253(arg1.field3809, arg0.field3809, var8, var6, var7, var9, var10);
        } else {
            method2260(arg1.field3809, arg0.field3809, var8, var6, var7, var9, var10);
        }
        method2249(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V", line = 340)
    public static final void method2259(int arg0, int arg1) {
        field4893 = arg0 + 7 >> 3;
        field4892 = arg1 + 7 >> 3;
        field4891 = new class258(field4893 * 128 + 2, field4892 * 128 + 2, 0);
        field4889 = new class12[field4893][field4892];
        for (int var2 = 0; var2 < field4893; var2++) {
            for (int var3 = 0; var3 < field4892; var3++) {
                field4889[var2][var3] = new class12();
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "([B[BIIIII)V", line = 366)
    private static final void method2260(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([BIIIII)Z", line = 393)
    private static final boolean method2261(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Ltj;Ltj;II)Z", line = 432)
    private static final boolean method2262(class258 arg0, class258 arg1, int arg2, int arg3) {
        int var4 = arg0.field40 + arg2;
        int var5 = arg0.field32 + arg3;
        int var6 = arg1.field28 * var5 + var4;
        int var7 = arg0.field38;
        int var8 = arg0.field28;
        int var9 = arg1.field28 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field28 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field38) {
            int var11 = var5 + var7 + 1 - arg1.field38;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field28) {
            int var13 = var4 + var8 + 1 - arg1.field28;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field28 + var9;
            return method2261(arg1.field3809, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "([B[BIIIIII)V", line = 493)
    private static final void method2263(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "()V", line = 529)
    public static void method2264() {
        field4891 = null;
        field4890 = null;
        field4889 = (class12[][]) null;
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(Ltj;Ltj;II)V", line = 534)
    private static final void method2265(class258 arg0, class258 arg1, int arg2, int arg3) {
        int var4 = arg0.field40 + arg2;
        int var5 = arg0.field32 + arg3;
        int var6 = arg1.field28 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field38;
        int var9 = arg0.field28;
        int var10 = arg1.field28 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field28 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field38) {
            int var13 = var5 + var8 + 1 - arg1.field38;
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
        if (var4 + var9 >= arg1.field28) {
            int var15 = var4 + var9 + 1 - arg1.field28;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method2263(arg1.field3809, arg0.field3809, var7, var6, var9, var8, var10, var11);
            method2249(var4, var5, var9, var8);
        }
    }
}
