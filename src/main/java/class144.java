import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class144 {

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field2006 = 0;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field2008 = 0;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2007 = 0;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field2010 = 0;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "[I")
    public static int[] field2005;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "[I")
    public static int[] field2012;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "[I")
    public static int[] field2013;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()V", line = 8)
    public static final void method956() {
        field2012 = null;
        field2013 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III[I[I)V", line = 13)
    public static final void method957(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field2009 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field2005[var7++] = arg2;
            }
            var5 += field2009;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII)V", line = 33)
    public static final void method958(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2006 || arg0 >= field2010) {
            return;
        }
        if (arg1 < field2007) {
            arg2 -= field2007 - arg1;
            arg1 = field2007;
        }
        if (arg1 + arg2 > field2008) {
            arg2 = field2008 - arg1;
        }
        int var4 = field2009 * arg1 + arg0;
        int var5 = 0;
        while (var5 < arg2) {
            field2005[var4] = arg3;
            var5++;
            var4 += field2009;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([I)V", line = 56)
    public static final void method959(int[] arg0) {
        arg0[0] = field2006;
        arg0[1] = field2007;
        arg0[2] = field2010;
        arg0[3] = field2008;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIII)V", line = 76)
    private static final void method960(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method971(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field2007) {
            var4 = field2007;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field2008) {
            var5 = field2008;
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
            if (var12 < field2006) {
                var12 = field2006;
            }
            int var13 = arg0 + var8;
            if (var13 > field2010) {
                var13 = field2010;
            }
            int var14 = field2009 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field2005[var14++] = arg3;
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
            if (var21 < field2006) {
                var21 = field2006;
            }
            int var22 = arg0 + var16;
            if (var22 > field2010 - 1) {
                var22 = field2010 - 1;
            }
            int var23 = field2009 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field2005[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIII)V", line = 184)
    public static final void method961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class215.method1476();
        int var18 = arg1 - class215.method1487();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class215.method1472(var19, var20, var21);
        class215.method1474(var23, var24, var25, var19, var20, var21, arg4);
        class215.method1472(var19, var21, var22);
        class215.method1474(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIIIII)V", line = 243)
    public static final void method962(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method963(arg0, arg1, arg2, arg4, arg5);
        method963(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method974(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method974(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIII)V", line = 253)
    private static final void method963(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2007 || arg1 >= field2008) {
            return;
        }
        if (arg0 < field2006) {
            arg2 -= field2006 - arg0;
            arg0 = field2006;
        }
        if (arg0 + arg2 > field2010) {
            arg2 = field2010 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2009 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2005[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2005[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2005[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2005[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIIII)V", line = 294)
    public static final void method964(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method965(arg0, arg1, arg2, arg4);
        method965(arg0, arg1 + arg3 - 1, arg2, arg4);
        method958(arg0, arg1, arg3, arg4);
        method958(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(IIII)V", line = 301)
    public static final void method965(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2007 || arg1 >= field2008) {
            return;
        }
        if (arg0 < field2006) {
            arg2 -= field2006 - arg0;
            arg0 = field2006;
        }
        if (arg0 + arg2 > field2010) {
            arg2 = field2010 - arg0;
        }
        int var4 = field2009 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2005[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(IIIIII)V", line = 325)
    public static final void method966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2006) {
            arg2 -= field2006 - arg0;
            arg0 = field2006;
        }
        if (arg1 < field2007) {
            arg3 -= field2007 - arg1;
            arg1 = field2007;
        }
        if (arg0 + arg2 > field2010) {
            arg2 = field2010 - arg0;
        }
        if (arg1 + arg3 > field2008) {
            arg3 = field2008 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field2009 - arg2;
        int var9 = field2009 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field2005[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field2005[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(IIII)V", line = 374)
    public static final void method967(int arg0, int arg1, int arg2, int arg3) {
        if (field2006 < arg0) {
            field2006 = arg0;
        }
        if (field2007 < arg1) {
            field2007 = arg1;
        }
        if (field2010 > arg2) {
            field2010 = arg2;
        }
        if (field2008 > arg3) {
            field2008 = arg3;
        }
        method956();
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "([I)V", line = 393)
    public static final void method968(int[] arg0) {
        field2006 = arg0[0];
        field2007 = arg0[1];
        field2010 = arg0[2];
        field2008 = arg0[3];
        method956();
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "()V", line = 403)
    public static final void method969() {
        int var0 = 0;
        int var1 = field2011 * field2009 - 7;
        while (var0 < var1) {
            field2005[var0++] = 0;
            field2005[var0++] = 0;
            field2005[var0++] = 0;
            field2005[var0++] = 0;
            field2005[var0++] = 0;
            field2005[var0++] = 0;
            field2005[var0++] = 0;
            field2005[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field2005[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(IIIII)V", line = 424)
    public static final void method970(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method965(arg0, arg1, var5 + 1, arg4);
            } else {
                method965(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field2006) {
                    var8 += (field2006 - arg0) * var10;
                    arg0 = field2006;
                }
                if (var11 >= field2010) {
                    var11 = field2010 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field2007 && var12 < field2008) {
                        field2005[field2009 * var12 + arg0] = arg4;
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
                if (arg1 < field2007) {
                    var14 += (field2007 - arg1) * var16;
                    arg1 = field2007;
                }
                if (var17 >= field2008) {
                    var17 = field2008 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field2006 && var18 < field2010) {
                        field2005[field2009 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method958(arg0, arg1, var6 + 1, arg4);
        } else {
            method958(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V", line = 515)
    private static final void method971(int arg0, int arg1, int arg2) {
        if (arg0 >= field2006 && arg1 >= field2007 && arg0 < field2010 && arg1 < field2008) {
            field2005[field2009 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(IIII)V", line = 522)
    public static final void method972(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field2009) {
            arg2 = field2009;
        }
        if (arg3 > field2011) {
            arg3 = field2011;
        }
        field2006 = arg0;
        field2007 = arg1;
        field2010 = arg2;
        field2008 = arg3;
        method956();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([III)V", line = 543)
    public static final void method973(int[] arg0, int arg1, int arg2) {
        field2005 = arg0;
        field2009 = arg1;
        field2011 = arg2;
        method972(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(IIIII)V", line = 549)
    private static final void method974(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2006 || arg0 >= field2010) {
            return;
        }
        if (arg1 < field2007) {
            arg2 -= field2007 - arg1;
            arg1 = field2007;
        }
        if (arg1 + arg2 > field2008) {
            arg2 = field2008 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2009 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2005[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2005[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2005[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2005[var9] = var14;
            var9 += field2009;
        }
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(IIIII)V", line = 591)
    public static final void method975(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method960(arg0, arg1, arg2, arg3);
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
        if (var9 < field2007) {
            var9 = field2007;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field2008) {
            var10 = field2008;
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
            if (var17 < field2006) {
                var17 = field2006;
            }
            int var18 = arg0 + var13;
            if (var18 > field2010) {
                var18 = field2010;
            }
            int var19 = field2009 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field2005[var19] >> 16 & 0xFF) * var5;
                int var22 = (field2005[var19] >> 8 & 0xFF) * var5;
                int var23 = (field2005[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field2005[var19++] = var24;
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
            if (var30 < field2006) {
                var30 = field2006;
            }
            int var31 = arg0 + var25;
            if (var31 > field2010 - 1) {
                var31 = field2010 - 1;
            }
            int var32 = field2009 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field2005[var32] >> 16 & 0xFF) * var5;
                int var35 = (field2005[var32] >> 8 & 0xFF) * var5;
                int var36 = (field2005[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field2005[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "()V", line = 724)
    public static void method976() {
        field2005 = null;
        field2012 = null;
        field2013 = null;
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(IIIII)V", line = 731)
    public static final void method977(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2006) {
            arg2 -= field2006 - arg0;
            arg0 = field2006;
        }
        if (arg1 < field2007) {
            arg3 -= field2007 - arg1;
            arg1 = field2007;
        }
        if (arg0 + arg2 > field2010) {
            arg2 = field2010 - arg0;
        }
        if (arg1 + arg3 > field2008) {
            arg3 = field2008 - arg1;
        }
        int var5 = field2009 - arg2;
        int var6 = field2009 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field2005[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([I[I)V", line = 777)
    public static final void method978(int[] arg0, int[] arg1) {
        if (field2008 - field2007 != arg0.length || field2008 - field2007 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field2012 = arg0;
        field2013 = arg1;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "()V", line = 788)
    public static final void method979() {
        field2006 = 0;
        field2007 = 0;
        field2010 = field2009;
        field2008 = field2011;
        method956();
    }
}
