import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class47 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field723 = 0;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field726 = 0;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field727 = 0;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field724 = 0;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "[I")
    public static int[] field722;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "[I")
    public static int[] field725;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "[I")
    public static int[] field728;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)V", line = 3)
    private static final void method401(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method421(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field723) {
            var4 = field723;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field727) {
            var5 = field727;
        }
        int var6 = var4;
        int var7 = arg2 * arg2;
        int var8 = 0;
        int var9 = arg1 - var4;
        int var10 = var9 * var9;
        int var11 = var10 - var9;
        if (arg1 > var5) {
            arg1 = var5;
        }
        while (var6 < arg1) {
            while (var11 <= var7 || var10 <= var7) {
                var10 += var8 + var8;
                var11 += var8++ + var8;
            }
            int var12 = arg0 + 1 - var8;
            if (var12 < field726) {
                var12 = field726;
            }
            int var13 = arg0 + var8;
            if (var13 > field724) {
                var13 = field724;
            }
            int var14 = field729 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field725[var14++] = arg3;
            }
            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
        }
        int var16 = arg2;
        int var17 = var6 - arg1;
        int var18 = var17 * var17 + var7;
        int var19 = var18 - arg2;
        int var20 = var18 - var17;
        while (var6 < var5) {
            while (var20 > var7 && var19 > var7) {
                var20 -= var16-- + var16;
                var19 -= var16 + var16;
            }
            int var21 = arg0 - var16;
            if (var21 < field726) {
                var21 = field726;
            }
            int var22 = arg0 + var16;
            if (var22 > field724 - 1) {
                var22 = field724 - 1;
            }
            int var23 = field729 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field725[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIII)V", line = 108)
    public static final void method402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method424(arg0, arg1, arg2, arg4, arg5);
        method424(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method423(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method423(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()V", line = 119)
    public static final void method403() {
        field726 = 0;
        field723 = 0;
        field724 = field729;
        field727 = field721;
        method411();
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([I[I)V", line = 126)
    public static final void method404(int[] arg0, int[] arg1) {
        if (field727 - field723 != arg0.length || field727 - field723 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field728 = arg0;
        field722 = arg1;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIII)V", line = 137)
    public static final void method405(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method412(arg0, arg1, var5 + 1, arg4);
            } else {
                method412(arg0 + var5, arg1, 1 - var5, arg4);
            }
        } else if (var5 != 0) {
            if (var5 + var6 < 0) {
                arg0 += var5;
                var5 = -var5;
                arg1 += var6;
                var6 = -var6;
            }
            if (var5 > var6) {
                int var7 = arg1 << 16;
                int var8 = var7 + 32768;
                int var9 = var6 << 16;
                int var10 = (int) Math.floor((double) var9 / (double) var5 + 0.5D);
                int var11 = arg0 + var5;
                if (arg0 < field726) {
                    var8 += (field726 - arg0) * var10;
                    arg0 = field726;
                }
                if (var11 >= field724) {
                    var11 = field724 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field723 && var12 < field727) {
                        field725[field729 * var12 + arg0] = arg4;
                    }
                    var8 += var10;
                    arg0++;
                }
            } else {
                int var13 = arg0 << 16;
                int var14 = var13 + 32768;
                int var15 = var5 << 16;
                int var16 = (int) Math.floor((double) var15 / (double) var6 + 0.5D);
                int var17 = arg1 + var6;
                if (arg1 < field723) {
                    var14 += (field723 - arg1) * var16;
                    arg1 = field723;
                }
                if (var17 >= field727) {
                    var17 = field727 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field726 && var18 < field724) {
                        field725[field729 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method409(arg0, arg1, var6 + 1, arg4);
        } else {
            method409(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([I)V", line = 228)
    public static final void method406(int[] arg0) {
        field726 = arg0[0];
        field723 = arg0[1];
        field724 = arg0[2];
        field727 = arg0[3];
        method411();
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([III)V", line = 236)
    public static final void method407(int[] arg0, int arg1, int arg2) {
        field725 = arg0;
        field729 = arg1;
        field721 = arg2;
        method420(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "()V", line = 242)
    public static void method408() {
        field725 = null;
        field728 = null;
        field722 = null;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(IIII)V", line = 247)
    public static final void method409(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field726 || arg0 >= field724) {
            return;
        }
        if (arg1 < field723) {
            arg2 -= field723 - arg1;
            arg1 = field723;
        }
        if (arg1 + arg2 > field727) {
            arg2 = field727 - arg1;
        }
        int var4 = field729 * arg1 + arg0;
        int var5 = 0;
        while (var5 < arg2) {
            field725[var4] = arg3;
            var5++;
            var4 += field729;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "([I)V", line = 272)
    public static final void method410(int[] arg0) {
        arg0[0] = field726;
        arg0[1] = field723;
        arg0[2] = field724;
        arg0[3] = field727;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "()V", line = 279)
    public static final void method411() {
        field728 = null;
        field722 = null;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(IIII)V", line = 289)
    public static final void method412(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field723 || arg1 >= field727) {
            return;
        }
        if (arg0 < field726) {
            arg2 -= field726 - arg0;
            arg0 = field726;
        }
        if (arg0 + arg2 > field724) {
            arg2 = field724 - arg0;
        }
        int var4 = field729 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field725[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(IIIIII)V", line = 314)
    public static final void method413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg1;
        int var8 = var6 >= 0 ? var6 : -var6;
        int var9 = var7 >= 0 ? var7 : -var7;
        int var10 = var8;
        if (var8 < var9) {
            var10 = var9;
        }
        if (var10 == 0) {
            return;
        }
        int var11 = (var6 << 16) / var10;
        int var12 = (var7 << 16) / var10;
        if (var12 <= var11) {
            var11 = -var11;
        } else {
            var12 = -var12;
        }
        int var13 = arg5 * var12 >> 17;
        int var14 = arg5 * var12 + 1 >> 17;
        int var15 = arg5 * var11 >> 17;
        int var16 = arg5 * var11 + 1 >> 17;
        int var17 = arg0 - class62.method577();
        int var18 = arg1 - class62.method579();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class62.method570(var19, var20, var21);
        class62.method584(var23, var24, var25, var19, var20, var21, arg4);
        class62.method570(var19, var21, var22);
        class62.method584(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(IIII)V", line = 377)
    public static final void method414(int arg0, int arg1, int arg2, int arg3) {
        if (field726 < arg0) {
            field726 = arg0;
        }
        if (field723 < arg1) {
            field723 = arg1;
        }
        if (field724 > arg2) {
            field724 = arg2;
        }
        if (field727 > arg3) {
            field727 = arg3;
        }
        method411();
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "()V", line = 393)
    public static final void method415() {
        int var0 = 0;
        int var1 = field729 * field721 - 7;
        while (var0 < var1) {
            field725[var0++] = 0;
            field725[var0++] = 0;
            field725[var0++] = 0;
            field725[var0++] = 0;
            field725[var0++] = 0;
            field725[var0++] = 0;
            field725[var0++] = 0;
            field725[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field725[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(IIIII)V", line = 415)
    public static final void method416(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method412(arg0, arg1, arg2, arg4);
        method412(arg0, arg1 + arg3 - 1, arg2, arg4);
        method409(arg0, arg1, arg3, arg4);
        method409(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(IIIIII)V", line = 427)
    public static final void method417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field726) {
            arg2 -= field726 - arg0;
            arg0 = field726;
        }
        if (arg1 < field723) {
            arg3 -= field723 - arg1;
            arg1 = field723;
        }
        if (arg0 + arg2 > field724) {
            arg2 = field724 - arg0;
        }
        if (arg1 + arg3 > field727) {
            arg3 = field727 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field729 - arg2;
        int var9 = field729 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field725[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field725[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(IIIII)V", line = 475)
    public static final void method418(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method401(arg0, arg1, arg2, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = arg1 - arg2;
        if (var9 < field723) {
            var9 = field723;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field727) {
            var10 = field727;
        }
        int var11 = var9;
        int var12 = arg2 * arg2;
        int var13 = 0;
        int var14 = arg1 - var9;
        int var15 = var14 * var14;
        int var16 = var15 - var14;
        if (arg1 > var10) {
            arg1 = var10;
        }
        while (var11 < arg1) {
            while (var16 <= var12 || var15 <= var12) {
                var15 += var13 + var13;
                var16 += var13++ + var13;
            }
            int var17 = arg0 + 1 - var13;
            if (var17 < field726) {
                var17 = field726;
            }
            int var18 = arg0 + var13;
            if (var18 > field724) {
                var18 = field724;
            }
            int var19 = field729 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field725[var19] >> 16 & 0xFF) * var5;
                int var22 = (field725[var19] >> 8 & 0xFF) * var5;
                int var23 = (field725[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field725[var19++] = var24;
            }
            var11++;
            var15 -= var14-- + var14;
            var16 -= var14 + var14;
        }
        int var25 = arg2;
        int var26 = -var14;
        int var27 = var26 * var26 + var12;
        int var28 = var27 - arg2;
        int var29 = var27 - var26;
        while (var11 < var10) {
            while (var29 > var12 && var28 > var12) {
                var29 -= var25-- + var25;
                var28 -= var25 + var25;
            }
            int var30 = arg0 - var25;
            if (var30 < field726) {
                var30 = field726;
            }
            int var31 = arg0 + var25;
            if (var31 > field724 - 1) {
                var31 = field724 - 1;
            }
            int var32 = field729 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field725[var32] >> 16 & 0xFF) * var5;
                int var35 = (field725[var32] >> 8 & 0xFF) * var5;
                int var36 = (field725[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field725[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III[I[I)V", line = 610)
    public static final void method419(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field729 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field725[var7++] = arg2;
            }
            var5 += field729;
        }
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(IIII)V", line = 629)
    public static final void method420(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field729) {
            arg2 = field729;
        }
        if (arg3 > field721) {
            arg3 = field721;
        }
        field726 = arg0;
        field723 = arg1;
        field724 = arg2;
        field727 = arg3;
        method411();
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V", line = 655)
    private static final void method421(int arg0, int arg1, int arg2) {
        if (arg0 >= field726 && arg1 >= field723 && arg0 < field724 && arg1 < field727) {
            field725[field729 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(IIIII)V", line = 661)
    public static final void method422(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field726) {
            arg2 -= field726 - arg0;
            arg0 = field726;
        }
        if (arg1 < field723) {
            arg3 -= field723 - arg1;
            arg1 = field723;
        }
        if (arg0 + arg2 > field724) {
            arg2 = field724 - arg0;
        }
        if (arg1 + arg3 > field727) {
            arg3 = field727 - arg1;
        }
        int var5 = field729 - arg2;
        int var6 = field729 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field725[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(IIIII)V", line = 724)
    private static final void method423(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field726 || arg0 >= field724) {
            return;
        }
        if (arg1 < field723) {
            arg2 -= field723 - arg1;
            arg1 = field723;
        }
        if (arg1 + arg2 > field727) {
            arg2 = field727 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field729 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field725[var9] >> 16 & 0xFF) * var5;
            int var12 = (field725[var9] >> 8 & 0xFF) * var5;
            int var13 = (field725[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field725[var9] = var14;
            var9 += field729;
        }
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(IIIII)V", line = 769)
    private static final void method424(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field723 || arg1 >= field727) {
            return;
        }
        if (arg0 < field726) {
            arg2 -= field726 - arg0;
            arg0 = field726;
        }
        if (arg0 + arg2 > field724) {
            arg2 = field724 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field729 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field725[var9] >> 16 & 0xFF) * var5;
            int var12 = (field725[var9] >> 8 & 0xFF) * var5;
            int var13 = (field725[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field725[var9++] = var14;
        }
    }
}
