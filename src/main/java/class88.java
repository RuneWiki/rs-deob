import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class88 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    private static int field1015;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    private static int field1017;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    private static int field1018;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    private static int field1019;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    private static int field1020;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    private static int field1021;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    private static int field1022;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "[I")
    private static int[] field1016;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 5)
    private static final void method541(int arg0) {
        if (field1015 < 0) {
            field1021 = 0;
            field1018 = 0;
            field1022 = 0;
            field1020 = 2147483646;
            return;
        }
        method547(0, field1015);
        int var1 = field1016[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field1015; var3 += 4) {
            int var4 = field1016[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field1016[var3];
            int var6 = field1016[var3 + 2];
            int var7 = field1016[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field1016[var3] = (var1 - var4) * var8 + var9;
            field1016[var3 + 2] = var8;
        }
        field1022 = var2;
        field1018 = var3;
        field1021 = var3;
        field1020 = var1 - 1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()V", line = 50)
    private static final void method542() {
        field1015 = 0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Luo;[IIII[I[I)V", line = 56)
    private static final void method543(class118 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method722(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method542();
        method545(arg1, arg2, arg3);
        method541(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method548(var7[3])) {
                    return;
                }
                var8 = field1019;
                var9 = field1017;
                var10 = field1020;
                if (arg5 == null) {
                    break;
                }
                int var11 = var10 - var7[1];
                if (var8 < arg5[var11] + var7[0]) {
                    var8 = arg5[var11] + var7[0];
                }
                if (var9 > arg5[var11] + arg6[var11] + var7[0]) {
                    var9 = arg5[var11] + arg6[var11] + var7[0];
                }
            } while (var9 - var8 <= 0);
            arg0.method709(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Luo;[II[I[I)V", line = 94)
    public static final void method544(class118 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method543(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([III)V", line = 103)
    private static final void method545(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field1015;
        if (field1016 == null || field1016.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field1015; var5++) {
                var4[var5] = field1016[var5];
            }
            field1016 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field1016[field1015++] = arg0[var7];
                field1016[field1015++] = var9;
                field1016[field1015++] = arg0[var8];
                field1016[field1015++] = var10;
            } else if (var10 < var9) {
                field1016[field1015++] = arg0[var8];
                field1016[field1015++] = var10;
                field1016[field1015++] = arg0[var7];
                field1016[field1015++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V", line = 153)
    private static final void method546(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field1016[var3 - 4];
                    int var5 = field1016[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field1016[var3 - 4] = var5;
                        field1016[var3] = var4;
                        int var6 = field1016[var3 - 2];
                        field1016[var3 - 2] = field1016[var3 + 2];
                        field1016[var3 + 2] = var6;
                        int var7 = field1016[var3 - 1];
                        field1016[var3 - 1] = field1016[var3 + 3];
                        field1016[var3 + 3] = var7;
                    }
                }
                if (!var2) {
                    arg1 -= 4;
                    continue;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)V", line = 190)
    private static final void method547(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field1016[arg0];
        int var4 = field1016[arg0 + 1];
        int var5 = field1016[arg0 + 2];
        int var6 = field1016[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field1016[var7 + 1];
            if (var8 < var4) {
                field1016[var2] = field1016[var7];
                field1016[var2 + 1] = var8;
                field1016[var2 + 2] = field1016[var7 + 2];
                field1016[var2 + 3] = field1016[var7 + 3];
                var2 += 4;
                field1016[var7] = field1016[var2];
                field1016[var7 + 1] = field1016[var2 + 1];
                field1016[var7 + 2] = field1016[var2 + 2];
                field1016[var7 + 3] = field1016[var2 + 3];
            }
        }
        field1016[var2] = var3;
        field1016[var2 + 1] = var4;
        field1016[var2 + 2] = var5;
        field1016[var2 + 3] = var6;
        method547(arg0, var2);
        method547(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)Z", line = 236)
    private static final boolean method548(int arg0) {
        int var1 = field1018;
        int var2 = field1021;
        int var3 = field1020;
        while (var2 >= var1) {
            var3++;
            field1020 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field1022;
            while (var1 < field1015) {
                int var5 = field1016[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field1016[var1];
                int var7 = field1016[var1 + 2];
                int var8 = field1016[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field1016[var1] = var10;
                field1016[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field1016[var11 + 3];
                if (var3 >= var12) {
                    field1016[var11] = field1016[var4];
                    field1016[var11 + 1] = field1016[var4 + 1];
                    field1016[var11 + 2] = field1016[var4 + 2];
                    field1016[var11 + 3] = field1016[var4 + 3];
                    var4 += 4;
                }
            }
            if (field1015 == var4) {
                field1015 = 0;
                return false;
            }
            method546(var4, var1);
            field1022 = var4;
            field1018 = var1;
            var2 = var4;
        }
        field1019 = field1016[var2] >> 16;
        field1017 = field1016[var2 + 4] >> 16;
        field1016[var2] += field1016[var2 + 2];
        field1016[var2 + 4] += field1016[var2 + 6];
        var2 += 8;
        field1021 = var2;
        return true;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Luo;[II)V", line = 312)
    public static final void method549(class118 arg0, int[] arg1, int arg2) {
        method543(arg0, arg1, 0, arg1.length, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "()V", line = 317)
    public static void method550() {
        field1016 = null;
    }
}
