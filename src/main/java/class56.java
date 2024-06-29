import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 extends class119 {

    @OriginalMember(owner = "client!i", name = "H", descriptor = "I")
    public static int field1266 = 0;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public static int field1267 = 0;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    public static int field1268 = 0;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "I")
    public static int field1270 = 0;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "[I")
    public static int[] field1269;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
    public static final void method374() {
        int var0 = 0;
        int var1 = field1265 * field1264 - 7;
        while (var0 < var1) {
            field1269[var0++] = 0;
            field1269[var0++] = 0;
            field1269[var0++] = 0;
            field1269[var0++] = 0;
            field1269[var0++] = 0;
            field1269[var0++] = 0;
            field1269[var0++] = 0;
            field1269[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field1269[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[I[I)V")
    public static final void method375(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field1265 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field1269[var7++] = arg2;
            }
            var5 += field1265;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
    public static final void method376() {
        field1268 = 0;
        field1266 = 0;
        field1267 = field1265;
        field1270 = field1264;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIII)V")
    private static final void method377(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1266 || arg1 >= field1270) {
            return;
        }
        if (arg0 < field1268) {
            arg2 -= field1268 - arg0;
            arg0 = field1268;
        }
        if (arg0 + arg2 > field1267) {
            arg2 = field1267 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1265 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1269[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1269[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1269[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1269[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IIII)V")
    public static final void method378(int arg0, int arg1, int arg2, int arg3) {
        if (field1268 < arg0) {
            field1268 = arg0;
        }
        if (field1266 < arg1) {
            field1266 = arg1;
        }
        if (field1267 > arg2) {
            field1267 = arg2;
        }
        if (field1270 > arg3) {
            field1270 = arg3;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([I)V")
    public static final void method379(int[] arg0) {
        arg0[0] = field1268;
        arg0[1] = field1266;
        arg0[2] = field1267;
        arg0[3] = field1270;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "([I)V")
    public static final void method380(int[] arg0) {
        field1268 = arg0[0];
        field1266 = arg0[1];
        field1267 = arg0[2];
        field1270 = arg0[3];
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()V")
    public static void method381() {
        field1269 = null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IIIII)V")
    public static final void method382(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1268) {
            arg2 -= field1268 - arg0;
            arg0 = field1268;
        }
        if (arg1 < field1266) {
            arg3 -= field1266 - arg1;
            arg1 = field1266;
        }
        if (arg0 + arg2 > field1267) {
            arg2 = field1267 - arg0;
        }
        if (arg1 + arg3 > field1270) {
            arg3 = field1270 - arg1;
        }
        int var5 = field1265 - arg2;
        int var6 = field1265 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field1269[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIII)V")
    public static final void method383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method377(arg0, arg1, arg2, arg4, arg5);
        method377(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method390(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method390(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IIIIII)V")
    public static final void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1268) {
            arg2 -= field1268 - arg0;
            arg0 = field1268;
        }
        if (arg1 < field1266) {
            arg3 -= field1266 - arg1;
            arg1 = field1266;
        }
        if (arg0 + arg2 > field1267) {
            arg2 = field1267 - arg0;
        }
        if (arg1 + arg3 > field1270) {
            arg3 = field1270 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field1265 - arg2;
        int var9 = field1265 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field1269[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field1269[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(IIIIII)V")
    public static final void method385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1268) {
            arg2 -= field1268 - arg0;
            arg0 = field1268;
        }
        if (arg1 < field1266) {
            var6 += (field1266 - arg1) * var7;
            arg3 -= field1266 - arg1;
            arg1 = field1266;
        }
        if (arg0 + arg2 > field1267) {
            arg2 = field1267 - arg0;
        }
        if (arg1 + arg3 > field1270) {
            arg3 = field1270 - arg1;
        }
        int var8 = field1265 - arg2;
        int var9 = field1265 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field1269[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(IIII)V")
    public static final void method386(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1268 || arg0 >= field1267) {
            return;
        }
        if (arg1 < field1266) {
            arg2 -= field1266 - arg1;
            arg1 = field1266;
        }
        if (arg1 + arg2 > field1270) {
            arg2 = field1270 - arg1;
        }
        int var4 = field1265 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1269[field1265 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(IIII)V")
    public static final void method387(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1265) {
            arg2 = field1265;
        }
        if (arg3 > field1264) {
            arg3 = field1264;
        }
        field1268 = arg0;
        field1266 = arg1;
        field1267 = arg2;
        field1270 = arg3;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(IIIII)V")
    public static final void method388(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method392(arg0, arg1, var5 + 1, arg4);
            } else {
                method392(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field1268) {
                    var8 += (field1268 - arg0) * var10;
                    arg0 = field1268;
                }
                if (var11 >= field1267) {
                    var11 = field1267 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1266 && var12 < field1270) {
                        field1269[field1265 * var12 + arg0] = arg4;
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
                if (arg1 < field1266) {
                    var14 += (field1266 - arg1) * var16;
                    arg1 = field1266;
                }
                if (var17 >= field1270) {
                    var17 = field1270 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1268 && var18 < field1267) {
                        field1269[field1265 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method386(arg0, arg1, var6 + 1, arg4);
        } else {
            method386(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([III)V")
    public static final void method389(int[] arg0, int arg1, int arg2) {
        field1269 = arg0;
        field1265 = arg1;
        field1264 = arg2;
        method387(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(IIIII)V")
    private static final void method390(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1268 || arg0 >= field1267) {
            return;
        }
        if (arg1 < field1266) {
            arg2 -= field1266 - arg1;
            arg1 = field1266;
        }
        if (arg1 + arg2 > field1270) {
            arg2 = field1270 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1265 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1269[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1269[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1269[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1269[var9] = var14;
            var9 += field1265;
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(IIIII)V")
    public static final void method391(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method392(arg0, arg1, arg2, arg4);
        method392(arg0, arg1 + arg3 - 1, arg2, arg4);
        method386(arg0, arg1, arg3, arg4);
        method386(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(IIII)V")
    public static final void method392(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1266 || arg1 >= field1270) {
            return;
        }
        if (arg0 < field1268) {
            arg2 -= field1268 - arg0;
            arg0 = field1268;
        }
        if (arg0 + arg2 > field1267) {
            arg2 = field1267 - arg0;
        }
        int var4 = field1265 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1269[var4 + var5] = arg3;
        }
    }
}
