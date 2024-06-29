import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class59 extends class64 {

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
    public static int field1212 = 0;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
    public static int field1213 = 0;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
    public static int field1214 = 0;

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "I")
    public static int field1216 = 0;

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "[I")
    public static int[] field1215;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
    public static final void method425() {
        int var0 = 0;
        int var1 = field1218 * field1217 - 7;
        while (var0 < var1) {
            field1215[var0++] = 0;
            field1215[var0++] = 0;
            field1215[var0++] = 0;
            field1215[var0++] = 0;
            field1215[var0++] = 0;
            field1215[var0++] = 0;
            field1215[var0++] = 0;
            field1215[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field1215[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "()V")
    public static final void method426() {
        field1213 = 0;
        field1214 = 0;
        field1212 = field1218;
        field1216 = field1217;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V")
    public static final void method427(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method432(arg0, arg1, arg2, arg4);
        method432(arg0, arg1 + arg3 - 1, arg2, arg4);
        method435(arg0, arg1, arg3, arg4);
        method435(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V")
    public static final void method428(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1218) {
            arg2 = field1218;
        }
        if (arg3 > field1217) {
            arg3 = field1217;
        }
        field1213 = arg0;
        field1214 = arg1;
        field1212 = arg2;
        field1216 = arg3;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([I)V")
    public static final void method429(int[] arg0) {
        field1213 = arg0[0];
        field1214 = arg0[1];
        field1212 = arg0[2];
        field1216 = arg0[3];
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIII)V")
    public static final void method430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1213) {
            arg2 -= field1213 - arg0;
            arg0 = field1213;
        }
        if (arg1 < field1214) {
            arg3 -= field1214 - arg1;
            arg1 = field1214;
        }
        if (arg0 + arg2 > field1212) {
            arg2 = field1212 - arg0;
        }
        if (arg1 + arg3 > field1216) {
            arg3 = field1216 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field1218 - arg2;
        int var11 = field1218 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field1215[var11] >> 16 & 0xFF) * var6;
                int var15 = (field1215[var11] >> 8 & 0xFF) * var6;
                int var16 = (field1215[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field1215[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIIII)V")
    public static final void method431(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method432(arg0, arg1, var5 + 1, arg4);
            } else {
                method432(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field1213) {
                    var8 += (field1213 - arg0) * var10;
                    arg0 = field1213;
                }
                if (var11 >= field1212) {
                    var11 = field1212 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1214 && var12 < field1216) {
                        field1215[field1218 * var12 + arg0] = arg4;
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
                if (arg1 < field1214) {
                    var14 += (field1214 - arg1) * var16;
                    arg1 = field1214;
                }
                if (var17 >= field1216) {
                    var17 = field1216 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1213 && var18 < field1212) {
                        field1215[field1218 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method435(arg0, arg1, var6 + 1, arg4);
        } else {
            method435(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIII)V")
    public static final void method432(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1214 || arg1 >= field1216) {
            return;
        }
        if (arg0 < field1213) {
            arg2 -= field1213 - arg0;
            arg0 = field1213;
        }
        if (arg0 + arg2 > field1212) {
            arg2 = field1212 - arg0;
        }
        int var4 = field1218 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1215[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIIIII)V")
    public static final void method433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method436(arg0, arg1, arg2, arg4, arg5);
        method436(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method438(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method438(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(IIIII)V")
    public static final void method434(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1213) {
            arg2 -= field1213 - arg0;
            arg0 = field1213;
        }
        if (arg1 < field1214) {
            arg3 -= field1214 - arg1;
            arg1 = field1214;
        }
        if (arg0 + arg2 > field1212) {
            arg2 = field1212 - arg0;
        }
        if (arg1 + arg3 > field1216) {
            arg3 = field1216 - arg1;
        }
        int var5 = field1218 - arg2;
        int var6 = field1218 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field1215[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(IIII)V")
    public static final void method435(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1213 || arg0 >= field1212) {
            return;
        }
        if (arg1 < field1214) {
            arg2 -= field1214 - arg1;
            arg1 = field1214;
        }
        if (arg1 + arg2 > field1216) {
            arg2 = field1216 - arg1;
        }
        int var4 = field1218 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1215[field1218 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(IIIII)V")
    private static final void method436(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1214 || arg1 >= field1216) {
            return;
        }
        if (arg0 < field1213) {
            arg2 -= field1213 - arg0;
            arg0 = field1213;
        }
        if (arg0 + arg2 > field1212) {
            arg2 = field1212 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1218 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1215[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1215[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1215[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1215[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([III)V")
    public static final void method437(int[] arg0, int arg1, int arg2) {
        field1215 = arg0;
        field1218 = arg1;
        field1217 = arg2;
        method428(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(IIIII)V")
    private static final void method438(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1213 || arg0 >= field1212) {
            return;
        }
        if (arg1 < field1214) {
            arg2 -= field1214 - arg1;
            arg1 = field1214;
        }
        if (arg1 + arg2 > field1216) {
            arg2 = field1216 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1218 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1215[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1215[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1215[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1215[var9] = var14;
            var9 += field1218;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "([I)V")
    public static final void method439(int[] arg0) {
        arg0[0] = field1213;
        arg0[1] = field1214;
        arg0[2] = field1212;
        arg0[3] = field1216;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "()V")
    public static void method440() {
        field1215 = null;
    }
}
