import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class191 {

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field2977 = 0;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field2978 = 0;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field2984 = 0;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field2983 = 0;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "[I")
    public static int[] field2979;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "[I")
    public static int[] field2980;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "[I")
    public static int[] field2981;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V", line = 20)
    private static final void method1247(int arg0, int arg1, int arg2) {
        if (arg0 >= field2984 && arg1 >= field2977 && arg0 < field2978 && arg1 < field2983) {
            field2981[field2976 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)V", line = 30)
    public static final void method1248(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2977 || arg1 >= field2983) {
            return;
        }
        if (arg0 < field2984) {
            arg2 -= field2984 - arg0;
            arg0 = field2984;
        }
        if (arg0 + arg2 > field2978) {
            arg2 = field2978 - arg0;
        }
        int var4 = field2976 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2981[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIII)V", line = 53)
    private static final void method1249(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method1247(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field2977) {
            var4 = field2977;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field2983) {
            var5 = field2983;
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
            if (var12 < field2984) {
                var12 = field2984;
            }
            int var13 = arg0 + var8;
            if (var13 > field2978) {
                var13 = field2978;
            }
            int var14 = field2976 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field2981[var14++] = arg3;
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
            if (var21 < field2984) {
                var21 = field2984;
            }
            int var22 = arg0 + var16;
            if (var22 > field2978 - 1) {
                var22 = field2978 - 1;
            }
            int var23 = field2976 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field2981[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([I)V", line = 162)
    public static final void method1250(int[] arg0) {
        field2984 = arg0[0];
        field2977 = arg0[1];
        field2978 = arg0[2];
        field2983 = arg0[3];
        method1255();
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIII)V", line = 173)
    public static final void method1251(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2984) {
            arg2 -= field2984 - arg0;
            arg0 = field2984;
        }
        if (arg1 < field2977) {
            arg3 -= field2977 - arg1;
            arg1 = field2977;
        }
        if (arg0 + arg2 > field2978) {
            arg2 = field2978 - arg0;
        }
        if (arg1 + arg3 > field2983) {
            arg3 = field2983 - arg1;
        }
        int var5 = field2976 - arg2;
        int var6 = field2976 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field2981[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIIII)V", line = 216)
    public static final void method1252(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method1249(arg0, arg1, arg2, arg3);
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
        if (var9 < field2977) {
            var9 = field2977;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field2983) {
            var10 = field2983;
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
            if (var17 < field2984) {
                var17 = field2984;
            }
            int var18 = arg0 + var13;
            if (var18 > field2978) {
                var18 = field2978;
            }
            int var19 = field2976 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field2981[var19] >> 16 & 0xFF) * var5;
                int var22 = (field2981[var19] >> 8 & 0xFF) * var5;
                int var23 = (field2981[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field2981[var19++] = var24;
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
            if (var30 < field2984) {
                var30 = field2984;
            }
            int var31 = arg0 + var25;
            if (var31 > field2978 - 1) {
                var31 = field2978 - 1;
            }
            int var32 = field2976 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field2981[var32] >> 16 & 0xFF) * var5;
                int var35 = (field2981[var32] >> 8 & 0xFF) * var5;
                int var36 = (field2981[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field2981[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(IIII)V", line = 354)
    private static final void method1253(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field2976) {
            arg2 = field2976;
        }
        if (arg3 > field2982) {
            arg3 = field2982;
        }
        field2984 = arg0;
        field2977 = arg1;
        field2978 = arg2;
        field2983 = arg3;
        method1255();
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([III)V", line = 373)
    public static final void method1254(int[] arg0, int arg1, int arg2) {
        field2981 = arg0;
        field2976 = arg1;
        field2982 = arg2;
        method1253(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()V", line = 382)
    private static final void method1255() {
        field2980 = null;
        field2979 = null;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()V", line = 404)
    public static void method1256() {
        field2981 = null;
        field2980 = null;
        field2979 = null;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(IIII)V", line = 415)
    public static final void method1257(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2984 || arg0 >= field2978) {
            return;
        }
        if (arg1 < field2977) {
            arg2 -= field2977 - arg1;
            arg1 = field2977;
        }
        if (arg1 + arg2 > field2983) {
            arg2 = field2983 - arg1;
        }
        int var4 = field2976 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2981[field2976 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "([I)V", line = 440)
    public static final void method1258(int[] arg0) {
        arg0[0] = field2984;
        arg0[1] = field2977;
        arg0[2] = field2978;
        arg0[3] = field2983;
    }
}
