import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class44 {

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    private static int field534;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    private static int field535;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    private static int field536;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    private static int field537;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    private static int field538;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    private static int field539;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    private static int field540;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "[I")
    private static int[] field533;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([III)V")
    private static final void method230(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field534;
        if (field533 == null || field533.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field534; var5++) {
                var4[var5] = field533[var5];
            }
            field533 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field533[field534++] = arg0[var7];
                field533[field534++] = var9;
                field533[field534++] = arg0[var8];
                field533[field534++] = var10;
            } else if (var10 < var9) {
                field533[field534++] = arg0[var8];
                field533[field534++] = var10;
                field533[field534++] = arg0[var7];
                field533[field534++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lr;[II)V")
    public static final void method231(class562 arg0, int[] arg1, int arg2) {
        method236(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()V")
    private static final void method232() {
        field534 = 0;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "()V")
    public static void method233() {
        field533 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    private static final void method234(int arg0) {
        if (field534 < 0) {
            field535 = 0;
            field536 = 0;
            field537 = 0;
            field540 = 2147483646;
            return;
        }
        method237(0, field534);
        int var1 = field533[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field534; var3 += 4) {
            int var4 = field533[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field533[var3];
            int var6 = field533[var3 + 2];
            int var7 = field533[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field533[var3] = (var1 - var4) * var8 + var9;
            field533[var3 + 2] = var8;
        }
        field537 = var2;
        field536 = var3;
        field535 = var3;
        field540 = var1 - 1;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
    private static final void method235(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field533[var3 - 4];
                    int var5 = field533[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field533[var3 - 4] = var5;
                        field533[var3] = var4;
                        int var6 = field533[var3 - 2];
                        field533[var3 - 2] = field533[var3 + 2];
                        field533[var3 + 2] = var6;
                        int var7 = field533[var3 - 1];
                        field533[var3 - 1] = field533[var3 + 3];
                        field533[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lr;[IIII[I[I)V")
    private static final void method236(class562 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method1057(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method232();
        method230(arg1, arg2, arg3);
        method234(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method239(var7[3])) {
                    return;
                }
                var8 = field538;
                var9 = field539;
                var10 = field540;
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
            arg0.method1144(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V")
    private static final void method237(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field533[arg0];
        int var4 = field533[arg0 + 1];
        int var5 = field533[arg0 + 2];
        int var6 = field533[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field533[var7 + 1];
            if (var8 < var4) {
                field533[var2] = field533[var7];
                field533[var2 + 1] = var8;
                field533[var2 + 2] = field533[var7 + 2];
                field533[var2 + 3] = field533[var7 + 3];
                var2 += 4;
                field533[var7] = field533[var2];
                field533[var7 + 1] = field533[var2 + 1];
                field533[var7 + 2] = field533[var2 + 2];
                field533[var7 + 3] = field533[var2 + 3];
            }
        }
        field533[var2] = var3;
        field533[var2 + 1] = var4;
        field533[var2 + 2] = var5;
        field533[var2 + 3] = var6;
        method237(arg0, var2);
        method237(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lr;[II[I[I)V")
    public static final void method238(class562 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method236(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)Z")
    private static final boolean method239(int arg0) {
        int var1 = field536;
        int var2 = field535;
        int var3 = field540;
        while (var2 >= var1) {
            var3++;
            field540 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field537;
            while (var1 < field534) {
                int var5 = field533[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field533[var1];
                int var7 = field533[var1 + 2];
                int var8 = field533[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field533[var1] = var10;
                field533[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field533[var11 + 3];
                if (var3 >= var12) {
                    field533[var11] = field533[var4];
                    field533[var11 + 1] = field533[var4 + 1];
                    field533[var11 + 2] = field533[var4 + 2];
                    field533[var11 + 3] = field533[var4 + 3];
                    var4 += 4;
                }
            }
            if (field534 == var4) {
                field534 = 0;
                return false;
            }
            method235(var4, var1);
            field537 = var4;
            field536 = var1;
            var2 = var4;
        }
        field538 = field533[var2] >> 16;
        field539 = field533[var2 + 4] >> 16;
        field533[var2] += field533[var2 + 2];
        field533[var2 + 4] += field533[var2 + 6];
        var2 += 8;
        field535 = var2;
        return true;
    }
}
