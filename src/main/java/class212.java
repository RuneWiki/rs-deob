import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class212 {

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    private static int field2701;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    private static int field2702;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
    private static int field2703;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "I")
    private static int field2704;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    private static int field2705;

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
    private static int field2707;

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
    private static int field2708;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "[I")
    private static int[] field2706;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(II)V")
    private static final void method1289(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2706[arg0];
        int var4 = field2706[arg0 + 1];
        int var5 = field2706[arg0 + 2];
        int var6 = field2706[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2706[var7 + 1];
            if (var8 < var4) {
                field2706[var2] = field2706[var7];
                field2706[var2 + 1] = var8;
                field2706[var2 + 2] = field2706[var7 + 2];
                field2706[var2 + 3] = field2706[var7 + 3];
                var2 += 4;
                field2706[var7] = field2706[var2];
                field2706[var7 + 1] = field2706[var2 + 1];
                field2706[var7 + 2] = field2706[var2 + 2];
                field2706[var7 + 3] = field2706[var2 + 3];
            }
        }
        field2706[var2] = var3;
        field2706[var2 + 1] = var4;
        field2706[var2 + 2] = var5;
        field2706[var2 + 3] = var6;
        method1289(arg0, var2);
        method1289(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "()V")
    private static final void method1290() {
        field2702 = 0;
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "()V")
    public static void method1291() {
        field2706 = null;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lha;[IIII[I[I)V")
    private static final void method1292(class454 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method76(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1290();
        method1295(arg1, arg2, arg3);
        method1294(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1297(var7[3])) {
                    return;
                }
                var8 = field2703;
                var9 = field2704;
                var10 = field2708;
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
            arg0.method160(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lha;[II[I[I)V")
    public static final void method1293(class454 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1292(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
    private static final void method1294(int arg0) {
        if (field2702 < 0) {
            field2701 = 0;
            field2705 = 0;
            field2707 = 0;
            field2708 = 2147483646;
            return;
        }
        method1289(0, field2702);
        int var1 = field2706[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field2702; var3 += 4) {
            int var4 = field2706[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field2706[var3];
            int var6 = field2706[var3 + 2];
            int var7 = field2706[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field2706[var3] = (var1 - var4) * var8 + var9;
            field2706[var3 + 2] = var8;
        }
        field2707 = var2;
        field2705 = var3;
        field2701 = var3;
        field2708 = var1 - 1;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "([III)V")
    private static final void method1295(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2702;
        if (field2706 == null || field2706.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2702; var5++) {
                var4[var5] = field2706[var5];
            }
            field2706 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2706[field2702++] = arg0[var7];
                field2706[field2702++] = var9;
                field2706[field2702++] = arg0[var8];
                field2706[field2702++] = var10;
            } else if (var10 < var9) {
                field2706[field2702++] = arg0[var8];
                field2706[field2702++] = var10;
                field2706[field2702++] = arg0[var7];
                field2706[field2702++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lha;[II)V")
    public static final void method1296(class454 arg0, int[] arg1, int arg2) {
        method1292(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)Z")
    private static final boolean method1297(int arg0) {
        int var1 = field2705;
        int var2 = field2701;
        int var3 = field2708;
        while (var2 >= var1) {
            var3++;
            field2708 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field2707;
            while (var1 < field2702) {
                int var5 = field2706[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field2706[var1];
                int var7 = field2706[var1 + 2];
                int var8 = field2706[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field2706[var1] = var10;
                field2706[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field2706[var11 + 3];
                if (var3 >= var12) {
                    field2706[var11] = field2706[var4];
                    field2706[var11 + 1] = field2706[var4 + 1];
                    field2706[var11 + 2] = field2706[var4 + 2];
                    field2706[var11 + 3] = field2706[var4 + 3];
                    var4 += 4;
                }
            }
            if (field2702 == var4) {
                field2702 = 0;
                return false;
            }
            method1298(var4, var1);
            field2707 = var4;
            field2705 = var1;
            var2 = var4;
        }
        field2703 = field2706[var2] >> 16;
        field2704 = field2706[var2 + 4] >> 16;
        field2706[var2] += field2706[var2 + 2];
        field2706[var2 + 4] += field2706[var2 + 6];
        var2 += 8;
        field2701 = var2;
        return true;
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)V")
    private static final void method1298(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2706[var3 - 4];
                    int var5 = field2706[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2706[var3 - 4] = var5;
                        field2706[var3] = var4;
                        int var6 = field2706[var3 - 2];
                        field2706[var3 - 2] = field2706[var3 + 2];
                        field2706[var3 + 2] = var6;
                        int var7 = field2706[var3 - 1];
                        field2706[var3 - 1] = field2706[var3 + 3];
                        field2706[var3 + 3] = var7;
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
}
