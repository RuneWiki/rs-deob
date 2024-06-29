import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class221 {

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    private static int field3662;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    private static int field3665;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Lka;")
    public static class211 field3661;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "[Lka;")
    public static class211[] field3663;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "[[Lmb;")
    public static class121[][] field3664;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lka;III)Z", line = 4)
    public static final boolean method1535(class211 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return false;
        } else {
            int var4 = arg1 - (class259.field4236 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class259.field4241 * arg2 >> 8) >> 3;
            return method1549(arg0, field3661, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lka;Lka;II)V", line = 15)
    private static final void method1536(class211 arg0, class211 arg1, int arg2, int arg3) {
        int var4 = arg0.field5232 + arg2;
        int var5 = arg0.field5238 + arg3;
        int var6 = arg1.field5229 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field5236;
        int var9 = arg0.field5229;
        int var10 = arg1.field5229 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field5229 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field5236) {
            int var13 = var5 + var8 + 1 - arg1.field5236;
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
        if (var4 + var9 >= arg1.field5229) {
            int var15 = var4 + var9 + 1 - arg1.field5229;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1539(arg1.field3507, arg0.field3507, var7, var6, var9, var8, var10, var11);
            method1552(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lka;Lka;II)V", line = 74)
    private static final void method1537(class211 arg0, class211 arg1, int arg2, int arg3) {
        int var4 = arg0.field5232 + arg2;
        int var5 = arg0.field5238 + arg3;
        int var6 = arg1.field5229 * var5 + var4;
        int var7 = 0;
        int var8 = arg0.field5236;
        int var9 = arg0.field5229;
        int var10 = arg1.field5229 - var9;
        int var11 = 0;
        if (var5 <= 0) {
            int var12 = 1 - var5;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += arg1.field5229 * var12;
            var5 = 1;
        }
        if (var5 + var8 >= arg1.field5236) {
            int var13 = var5 + var8 + 1 - arg1.field5236;
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
        if (var4 + var9 >= arg1.field5229) {
            int var15 = var4 + var9 + 1 - arg1.field5229;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            method1538(arg1.field3507, arg0.field3507, var7, var6, var9, var8, var10, var11);
            method1552(var4, var5, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([B[BIIIIII)V", line = 134)
    private static final void method1538(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "([B[BIIIIII)V", line = 170)
    private static final void method1539(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V", line = 205)
    public static void method1540() {
        field3661 = null;
        field3663 = null;
        field3664 = (class121[][]) null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([B[BIIIII)V", line = 213)
    private static final void method1541(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([BIIIII)Z", line = 240)
    private static final boolean method1542(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lka;III)V", line = 279)
    public static final void method1543(class211 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class259.field4236 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class259.field4241 * arg2 >> 8) >> 3;
            method1537(arg0, field3661, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "([B[BIIIII)V", line = 291)
    private static final void method1544(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lka;Lka;IIIZ)V", line = 318)
    private static final void method1545(class211 arg0, class211 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.field5229 || arg3 + 16 >= arg1.field5236) {
            return;
        }
        int var6 = arg1.field5229 * arg3 + arg2;
        int var7 = arg1.field5229 - 16;
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
            method1544(arg1.field3507, arg0.field3507, var8, var6, var7, var9, var10);
        } else {
            method1541(arg1.field3507, arg0.field3507, var8, var6, var7, var9, var10);
        }
        method1552(arg2, arg3, 16, 16);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V", line = 365)
    public static final void method1546(int arg0, int arg1) {
        field3662 = arg0 + 7 >> 3;
        field3665 = arg1 + 7 >> 3;
        field3661 = new class211(field3662 * 128 + 2, field3665 * 128 + 2, 0);
        field3664 = new class121[field3662][field3665];
        for (int var2 = 0; var2 < field3662; var2++) {
            for (int var3 = 0; var3 < field3665; var3++) {
                field3664[var2][var3] = new class121();
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII[[Z[[I)V", line = 389)
    public static final void method1547(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[][] arg5) {
        GL var6 = class241.field4012;
        class241.method1719(1);
        class241.method1718(1);
        class241.method1702();
        class241.method1716(false);
        class109.method815(-117, 0, 0);
        var6.glDepthMask(false);
        for (int var7 = 0; var7 < field3662; var7++) {
            label52: for (int var8 = 0; var8 < field3665; var8++) {
                for (int var9 = var7 * 8; var9 < var7 * 8 + 8; var9++) {
                    if (var9 - arg0 >= -arg2 && var9 - arg0 <= arg2) {
                        for (int var10 = var8 * 8; var10 < var8 * 8 + 8; var10++) {
                            if (var10 - arg1 >= -arg2 && var10 - arg1 <= arg2 && arg4[var9 + arg2 - arg0][var10 + arg2 - arg1]) {
                                class121 var11 = field3664[var7][var8];
                                if (var11.field2148) {
                                    var11.method879(field3661, var7, var8);
                                    var11.field2148 = false;
                                }
                                var6.glPushMatrix();
                                var6.glTranslatef((float) (var7 * 1024), 0.0F, (float) (var8 * 1024));
                                var11.method878();
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
        class241.method1695();
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V", line = 459)
    public static final void method1548() {
        field3661 = null;
        field3663 = null;
        field3664 = (class121[][]) null;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(Lka;Lka;II)Z", line = 464)
    private static final boolean method1549(class211 arg0, class211 arg1, int arg2, int arg3) {
        int var4 = arg0.field5232 + arg2;
        int var5 = arg0.field5238 + arg3;
        int var6 = arg1.field5229 * var5 + var4;
        int var7 = arg0.field5236;
        int var8 = arg0.field5229;
        int var9 = arg1.field5229 - var8;
        if (var5 <= 0) {
            int var10 = 1 - var5;
            var7 -= var10;
            var6 += arg1.field5229 * var10;
            var5 = 1;
        }
        if (var5 + var7 >= arg1.field5236) {
            int var11 = var5 + var7 + 1 - arg1.field5236;
            var7 -= var11;
        }
        if (var4 <= 0) {
            int var12 = 1 - var4;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
            var4 = 1;
        }
        if (var4 + var8 >= arg1.field5229) {
            int var13 = var4 + var8 + 1 - arg1.field5229;
            var8 -= var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 - 1) * arg1.field5229 + var9;
            return method1542(arg1.field3507, var6, var8, var7, var15, var14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(Lka;III)V", line = 525)
    public static final void method1550(class211 arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            int var4 = arg1 - (class259.field4236 * arg2 >> 8) >> 3;
            int var5 = arg3 - (class259.field4241 * arg2 >> 8) >> 3;
            method1536(arg0, field3661, var4 + 1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZZIIIIII)V", line = 537)
    public static final void method1551(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 && arg3 || arg2 && arg0 == 1 || arg3 && arg0 == 0) {
            return;
        }
        int var10 = arg4 << 7;
        int var11 = arg6 + arg7 + arg8 + arg9 >> 2;
        int var12 = arg5 << 7;
        int var13 = var10 - (class259.field4236 * var11 >> 8) >> 3;
        int var14 = var12 - (class259.field4241 * var11 >> 8) >> 3;
        if (arg0 == 0 || arg0 == 1 || !(arg2 || arg3)) {
            method1536(field3663[1], field3661, var13 + 1, var14 + 1);
        } else {
            method1545(field3663[arg0], field3661, var13 + 1, var14 + 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V", line = 567)
    private static final void method1552(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 >> 7;
        int var5 = arg0 + arg2 - 1 - 1 >> 7;
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var8 = var4; var8 <= var5; var8++) {
            class121[] var9 = field3664[var8];
            for (int var10 = var6; var10 <= var7; var10++) {
                var9[var10].field2148 = true;
            }
        }
    }
}
