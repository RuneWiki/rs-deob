import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class class20 extends class2 {

    @OriginalMember(owner = "mapview!ja", name = "p", descriptor = "I")
    public static int field246 = 0;

    @OriginalMember(owner = "mapview!ja", name = "s", descriptor = "I")
    public static int field249 = 0;

    @OriginalMember(owner = "mapview!ja", name = "u", descriptor = "I")
    public static int field251 = 0;

    @OriginalMember(owner = "mapview!ja", name = "v", descriptor = "I")
    public static int field252 = 0;

    @OriginalMember(owner = "mapview!ja", name = "r", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "mapview!ja", name = "t", descriptor = "I")
    private static int field250;

    @OriginalMember(owner = "mapview!ja", name = "q", descriptor = "[I")
    public static int[] field247;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IIII)V", line = 4)
    public static final void method116(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field251 || arg0 >= field252) {
            return;
        }
        if (arg1 < field246) {
            arg2 -= field246 - arg1;
            arg1 = field246;
        }
        if (arg1 + arg2 > field249) {
            arg2 = field249 - arg1;
        }
        int var4 = field248 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field247[field248 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(IIII)V", line = 36)
    private static final void method117(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field248) {
            arg2 = field248;
        }
        if (arg3 > field250) {
            arg3 = field250;
        }
        field251 = arg0;
        field246 = arg1;
        field252 = arg2;
        field249 = arg3;
    }

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "(IIII)V", line = 54)
    public static final void method118(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field246 || arg1 >= field249) {
            return;
        }
        if (arg0 < field251) {
            arg2 -= field251 - arg0;
            arg0 = field251;
        }
        if (arg0 + arg2 > field252) {
            arg2 = field252 - arg0;
        }
        int var4 = field248 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field247[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IIIII)V", line = 84)
    public static final void method119(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method118(arg0, arg1, arg2, arg4);
        method118(arg0, arg1 + arg3 - 1, arg2, arg4);
        method116(arg0, arg1, arg3, arg4);
        method116(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IIIIII)V", line = 97)
    public static final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field251) {
            arg2 -= field251 - arg0;
            arg0 = field251;
        }
        if (arg1 < field246) {
            arg3 -= field246 - arg1;
            arg1 = field246;
        }
        if (arg0 + arg2 > field252) {
            arg2 = field252 - arg0;
        }
        if (arg1 + arg3 > field249) {
            arg3 = field249 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field248 - arg2;
        int var11 = field248 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field247[var11] >> 16 & 0xFF) * var6;
                int var15 = (field247[var11] >> 8 & 0xFF) * var6;
                int var16 = (field247[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field247[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(IIIII)V", line = 158)
    public static final void method121(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field251) {
            arg2 -= field251 - arg0;
            arg0 = field251;
        }
        if (arg1 < field246) {
            arg3 -= field246 - arg1;
            arg1 = field246;
        }
        if (arg0 + arg2 > field252) {
            arg2 = field252 - arg0;
        }
        if (arg1 + arg3 > field249) {
            arg3 = field249 - arg1;
        }
        int var5 = field248 - arg2;
        int var6 = field248 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field247[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "(IIIII)V", line = 206)
    public static final void method122(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = arg1 - arg2;
        if (var9 < field246) {
            var9 = field246;
        }
        int var10 = arg1 + arg2;
        if (var10 >= field249) {
            var10 = field249 - 1;
        }
        for (int var11 = var9; var11 <= var10; var11++) {
            int var12 = var11 - arg1;
            int var13 = (int) Math.sqrt((double) (arg2 * arg2 - var12 * var12));
            int var14 = arg0 - var13;
            if (var14 < field251) {
                var14 = field251;
            }
            int var15 = arg0 + var13;
            if (var15 > field252 - 1) {
                var15 = field252 - 1;
            }
            int var16 = field248 * var11 + var14;
            for (int var17 = var14; var17 <= var15; var17++) {
                int var18 = (field247[var16] >> 16 & 0xFF) * var5;
                int var19 = (field247[var16] >> 8 & 0xFF) * var5;
                int var20 = (field247[var16] & 0xFF) * var5;
                int var21 = (var8 + var20 >> 8) + (var6 + var18 >> 8 << 16) + (var7 + var19 >> 8 << 8);
                field247[var16++] = var21;
            }
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "([III)V", line = 272)
    public static final void method123(int[] arg0, int arg1, int arg2) {
        field247 = arg0;
        field248 = arg1;
        field250 = arg2;
        method117(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "()V", line = 283)
    public static final void method124() {
        int var0 = 0;
        int var1 = field250 * field248 - 7;
        while (var0 < var1) {
            field247[var0++] = 0;
            field247[var0++] = 0;
            field247[var0++] = 0;
            field247[var0++] = 0;
            field247[var0++] = 0;
            field247[var0++] = 0;
            field247[var0++] = 0;
            field247[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field247[var0++] = 0;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "()V", line = 304)
    public static void method125() {
        field247 = null;
    }
}
