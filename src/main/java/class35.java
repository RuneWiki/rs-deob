import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JOVUNXBE")
public class class35 extends class10 {

    @OriginalMember(owner = "JOVUNXBE", name = "j", descriptor = "Z")
    private static boolean field1014 = true;

    @OriginalMember(owner = "JOVUNXBE", name = "k", descriptor = "I")
    private static int field1015 = 4;

    @OriginalMember(owner = "JOVUNXBE", name = "n", descriptor = "I")
    private static int field1018;

    @OriginalMember(owner = "JOVUNXBE", name = "p", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "JOVUNXBE", name = "q", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "JOVUNXBE", name = "r", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "JOVUNXBE", name = "s", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "JOVUNXBE", name = "t", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "JOVUNXBE", name = "u", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "JOVUNXBE", name = "v", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "JOVUNXBE", name = "w", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "JOVUNXBE", name = "x", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "JOVUNXBE", name = "i", descriptor = "Z")
    private static boolean field1013;

    @OriginalMember(owner = "JOVUNXBE", name = "l", descriptor = "Z")
    private static boolean field1016;

    @OriginalMember(owner = "JOVUNXBE", name = "m", descriptor = "Z")
    private static boolean field1017;

    @OriginalMember(owner = "JOVUNXBE", name = "y", descriptor = "Z")
    public static boolean field1029;

    @OriginalMember(owner = "JOVUNXBE", name = "o", descriptor = "[I")
    public static int[] field1019;

    @OriginalMember(owner = "JOVUNXBE", name = "a", descriptor = "([IIII)V")
    public static void method380(int[] arg0, int arg1, int arg2, int arg3) {
        field1019 = arg0;
        field1020 = arg1;
        field1021 = arg3;
        method382(arg1, 0, 0, arg3, -701);
        if (arg2 < field1018 || arg2 > field1018) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "JOVUNXBE", name = "a", descriptor = "(B)V")
    public static void method381(byte arg0) {
        field1024 = 0;
        field1022 = 0;
        field1025 = field1020;
        if (arg0 == 1) {
            boolean var1 = false;
        }
        field1023 = field1021;
        field1026 = field1025 - 1;
        field1027 = field1025 / 2;
    }

    @OriginalMember(owner = "JOVUNXBE", name = "a", descriptor = "(IIIII)V")
    public static void method382(int arg0, int arg1, int arg2, int arg3, int arg4) {
        while (arg4 >= 0) {
            field1015 = -442;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg0 > field1020) {
            arg0 = field1020;
        }
        if (arg3 > field1021) {
            arg3 = field1021;
        }
        field1024 = arg1;
        field1022 = arg2;
        field1025 = arg0;
        field1023 = arg3;
        field1026 = field1025 - 1;
        field1027 = field1025 / 2;
        field1028 = field1023 / 2;
    }

    @OriginalMember(owner = "JOVUNXBE", name = "b", descriptor = "(B)V")
    public static void method383(byte arg0) {
        if (arg0 == 6) {
            boolean var1 = false;
        } else {
            field1013 = !field1013;
        }
        int var2 = field1021 * field1020;
        for (int var3 = 0; var3 < var2; var3++) {
            field1019[var3] = 0;
        }
    }

    @OriginalMember(owner = "JOVUNXBE", name = "a", descriptor = "(IIIIIIZ)V")
    public static void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg4 < field1024) {
            arg1 -= field1024 - arg4;
            arg4 = field1024;
        }
        if (arg2 < field1022) {
            arg3 -= field1022 - arg2;
            arg2 = field1022;
        }
        if (arg1 + arg4 > field1025) {
            arg1 = field1025 - arg4;
        }
        if (arg2 + arg3 > field1023) {
            arg3 = field1023 - arg2;
        }
        int var7 = 256 - arg0;
        int var8 = (arg5 >> 16 & 0xFF) * arg0;
        int var9 = (arg5 >> 8 & 0xFF) * arg0;
        int var10 = (arg5 & 0xFF) * arg0;
        if (!arg6) {
            return;
        }
        int var11 = field1020 - arg1;
        int var12 = field1020 * arg2 + arg4;
        for (int var13 = 0; var13 < arg3; var13++) {
            for (int var14 = -arg1; var14 < 0; var14++) {
                int var15 = (field1019[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1019[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1019[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1019[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "JOVUNXBE", name = "a", descriptor = "(IIIIBI)V")
    public static void method385(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg3 < field1024) {
            arg1 -= field1024 - arg3;
            arg3 = field1024;
        }
        if (arg0 < field1022) {
            arg2 -= field1022 - arg0;
            arg0 = field1022;
        }
        if (arg1 + arg3 > field1025) {
            arg1 = field1025 - arg3;
        }
        if (arg0 + arg2 > field1023) {
            arg2 = field1023 - arg0;
        }
        int var6 = field1020 - arg1;
        if (arg4 != 5) {
            field1017 = !field1017;
        }
        int var7 = field1020 * arg0 + arg3;
        for (int var8 = -arg2; var8 < 0; var8++) {
            for (int var9 = -arg1; var9 < 0; var9++) {
                field1019[var7++] = arg5;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "JOVUNXBE", name = "a", descriptor = "(IIIIII)V")
    public static void method386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method388(-532, arg5, arg4, arg0, arg3);
        method388(-532, arg1 + arg5 - 1, arg4, arg0, arg3);
        if (arg2 != 0) {
            field1017 = !field1017;
        }
        method390(arg5, arg4, arg3, true, arg1);
        method390(arg5, arg0 + arg4 - 1, arg3, true, arg1);
    }

    @OriginalMember(owner = "JOVUNXBE", name = "a", descriptor = "(BIIIIII)V")
    public static void method387(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 61) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        method389(arg3, arg4, arg6, 5, arg2, arg5);
        method389(arg3, arg4, arg6, 5, arg1 + arg2 - 1, arg5);
        if (arg1 >= 3) {
            method391(arg5, arg1 - 2, 0, arg2 + 1, arg6, arg3);
            method391(arg5, arg1 - 2, 0, arg2 + 1, arg4 + arg6 - 1, arg3);
        }
    }

    @OriginalMember(owner = "JOVUNXBE", name = "b", descriptor = "(IIIII)V")
    public static void method388(int arg0, int arg1, int arg2, int arg3, int arg4) {
        label40: while (true) {
            if (arg0 >= 0) {
                int var7 = 1;
                while (true) {
                    if (var7 <= 0) {
                        continue label40;
                    }
                    var7++;
                }
            }
            if (arg1 >= field1022 && arg1 < field1023) {
                if (arg2 < field1024) {
                    arg3 -= field1024 - arg2;
                    arg2 = field1024;
                }
                if (arg2 + arg3 > field1025) {
                    arg3 = field1025 - arg2;
                }
                int var5 = field1020 * arg1 + arg2;
                for (int var6 = 0; var6 < arg3; var6++) {
                    field1019[var5 + var6] = arg4;
                }
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "JOVUNXBE", name = "b", descriptor = "(IIIIII)V")
    public static void method389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field1022 || arg4 >= field1023) {
            return;
        }
        if (arg2 < field1024) {
            arg1 -= field1024 - arg2;
            arg2 = field1024;
        }
        if (arg1 + arg2 > field1025) {
            arg1 = field1025 - arg2;
        }
        int var6 = 256 - arg5;
        if (arg3 < 5 || arg3 > 5) {
            return;
        }
        int var7 = (arg0 >> 16 & 0xFF) * arg5;
        int var8 = (arg0 >> 8 & 0xFF) * arg5;
        int var9 = (arg0 & 0xFF) * arg5;
        int var10 = field1020 * arg4 + arg2;
        for (int var11 = 0; var11 < arg1; var11++) {
            int var12 = (field1019[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1019[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1019[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1019[var10++] = var15;
        }
    }

    @OriginalMember(owner = "JOVUNXBE", name = "a", descriptor = "(IIIZI)V")
    public static void method390(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg1 < field1024 || arg1 >= field1025) {
            return;
        }
        if (arg0 < field1022) {
            arg4 -= field1022 - arg0;
            arg0 = field1022;
        }
        if (arg0 + arg4 > field1023) {
            arg4 = field1023 - arg0;
        }
        int var5 = field1020 * arg0 + arg1;
        if (!arg3) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < arg4; var7++) {
            field1019[field1020 * var7 + var5] = arg2;
        }
    }

    @OriginalMember(owner = "JOVUNXBE", name = "c", descriptor = "(IIIIII)V")
    public static void method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field1024 || arg4 >= field1025) {
            return;
        }
        if (arg3 < field1022) {
            arg1 -= field1022 - arg3;
            arg3 = field1022;
        }
        if (arg1 + arg3 > field1023) {
            arg1 = field1023 - arg3;
        }
        int var6 = 256 - arg0;
        if (arg2 != 0) {
            field1016 = !field1016;
        }
        int var7 = (arg5 >> 16 & 0xFF) * arg0;
        int var8 = (arg5 >> 8 & 0xFF) * arg0;
        int var9 = (arg5 & 0xFF) * arg0;
        int var10 = field1020 * arg3 + arg4;
        for (int var11 = 0; var11 < arg1; var11++) {
            int var12 = (field1019[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1019[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1019[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1019[var10] = var15;
            var10 += field1020;
        }
    }
}
