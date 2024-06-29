import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 extends class4 {

    @OriginalMember(owner = "client!af", name = "X", descriptor = "I")
    public static int field115 = 0;

    @OriginalMember(owner = "client!af", name = "db", descriptor = "I")
    public static int field121 = 0;

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
    public static int field118 = 0;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "I")
    public static int field116 = 0;

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "[I")
    public static int[] field117;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIII)V")
    private static final void method37(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field115 || arg1 >= field121) {
            return;
        }
        if (arg0 < field118) {
            arg2 -= field118 - arg0;
            arg0 = field118;
        }
        if (arg0 + arg2 > field116) {
            arg2 = field116 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field119 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field117[var9] >> 16 & 0xFF) * var5;
            int var12 = (field117[var9] >> 8 & 0xFF) * var5;
            int var13 = (field117[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field117[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)V")
    public static final void method38(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field118 || arg0 >= field116) {
            return;
        }
        if (arg1 < field115) {
            arg2 -= field115 - arg1;
            arg1 = field115;
        }
        if (arg1 + arg2 > field121) {
            arg2 = field121 - arg1;
        }
        int var4 = field119 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field117[field119 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()V")
    public static final void method39() {
        field118 = 0;
        field115 = 0;
        field116 = field119;
        field121 = field120;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "()V")
    public static final void method40() {
        int var0 = 0;
        int var1 = field120 * field119 - 7;
        while (var0 < var1) {
            field117[var0++] = 0;
            field117[var0++] = 0;
            field117[var0++] = 0;
            field117[var0++] = 0;
            field117[var0++] = 0;
            field117[var0++] = 0;
            field117[var0++] = 0;
            field117[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field117[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IIIII)V")
    public static final void method41(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field118) {
            arg2 -= field118 - arg0;
            arg0 = field118;
        }
        if (arg1 < field115) {
            arg3 -= field115 - arg1;
            arg1 = field115;
        }
        if (arg0 + arg2 > field116) {
            arg2 = field116 - arg0;
        }
        if (arg1 + arg3 > field121) {
            arg3 = field121 - arg1;
        }
        int var5 = field119 - arg2;
        int var6 = field119 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field117[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([I)V")
    public static final void method42(int[] arg0) {
        arg0[0] = field118;
        arg0[1] = field115;
        arg0[2] = field116;
        arg0[3] = field121;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IIII)V")
    public static final void method43(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field115 || arg1 >= field121) {
            return;
        }
        if (arg0 < field118) {
            arg2 -= field118 - arg0;
            arg0 = field118;
        }
        if (arg0 + arg2 > field116) {
            arg2 = field116 - arg0;
        }
        int var4 = field119 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field117[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "()V")
    public static void method44() {
        field117 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIII)V")
    public static final void method45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field118) {
            arg2 -= field118 - arg0;
            arg0 = field118;
        }
        if (arg1 < field115) {
            var6 += (field115 - arg1) * var7;
            arg3 -= field115 - arg1;
            arg1 = field115;
        }
        if (arg0 + arg2 > field116) {
            arg2 = field116 - arg0;
        }
        if (arg1 + arg3 > field121) {
            arg3 = field121 - arg1;
        }
        int var8 = field119 - arg2;
        int var9 = field119 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field117[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(IIIII)V")
    public static final void method46(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method43(arg0, arg1, var5 + 1, arg4);
            } else {
                method43(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field118) {
                    var8 += (field118 - arg0) * var10;
                    arg0 = field118;
                }
                if (var11 >= field116) {
                    var11 = field116 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field115 && var12 < field121) {
                        field117[field119 * var12 + arg0] = arg4;
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
                if (arg1 < field115) {
                    var14 += (field115 - arg1) * var16;
                    arg1 = field115;
                }
                if (var17 >= field121) {
                    var17 = field121 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field118 && var18 < field116) {
                        field117[field119 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method38(arg0, arg1, var6 + 1, arg4);
        } else {
            method38(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IIIIII)V")
    public static final void method47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method37(arg0, arg1, arg2, arg4, arg5);
        method37(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method51(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method51(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(IIIIII)V")
    public static final void method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field118) {
            arg2 -= field118 - arg0;
            arg0 = field118;
        }
        if (arg1 < field115) {
            arg3 -= field115 - arg1;
            arg1 = field115;
        }
        if (arg0 + arg2 > field116) {
            arg2 = field116 - arg0;
        }
        if (arg1 + arg3 > field121) {
            arg3 = field121 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field119 - arg2;
        int var11 = field119 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field117[var11] >> 16 & 0xFF) * var6;
                int var15 = (field117[var11] >> 8 & 0xFF) * var6;
                int var16 = (field117[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field117[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(IIIII)V")
    public static final void method49(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method43(arg0, arg1, arg2, arg4);
        method43(arg0, arg1 + arg3 - 1, arg2, arg4);
        method38(arg0, arg1, arg3, arg4);
        method38(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "([I)V")
    public static final void method50(int[] arg0) {
        field118 = arg0[0];
        field115 = arg0[1];
        field116 = arg0[2];
        field121 = arg0[3];
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(IIIII)V")
    private static final void method51(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field118 || arg0 >= field116) {
            return;
        }
        if (arg1 < field115) {
            arg2 -= field115 - arg1;
            arg1 = field115;
        }
        if (arg1 + arg2 > field121) {
            arg2 = field121 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field119 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field117[var9] >> 16 & 0xFF) * var5;
            int var12 = (field117[var9] >> 8 & 0xFF) * var5;
            int var13 = (field117[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field117[var9] = var14;
            var9 += field119;
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(IIII)V")
    public static final void method52(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field119) {
            arg2 = field119;
        }
        if (arg3 > field120) {
            arg3 = field120;
        }
        field118 = arg0;
        field115 = arg1;
        field116 = arg2;
        field121 = arg3;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([III)V")
    public static final void method53(int[] arg0, int arg1, int arg2) {
        field117 = arg0;
        field119 = arg1;
        field120 = arg2;
        method52(0, 0, arg1, arg2);
    }
}
