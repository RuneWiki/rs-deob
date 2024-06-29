import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class21 {

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    private static int field348;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    private static int field349;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    private static int field350;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    private static int field351;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    private static int field352;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    private static int field353;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    private static int field354;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "[I")
    private static int[] field347;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lnr;[II[I[I)V")
    public static final void method176(class437 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method178(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)V")
    private static final void method177(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field347[arg0];
        int var4 = field347[arg0 + 1];
        int var5 = field347[arg0 + 2];
        int var6 = field347[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field347[var7 + 1];
            if (var8 < var4) {
                field347[var2] = field347[var7];
                field347[var2 + 1] = var8;
                field347[var2 + 2] = field347[var7 + 2];
                field347[var2 + 3] = field347[var7 + 3];
                var2 += 4;
                field347[var7] = field347[var2];
                field347[var7 + 1] = field347[var2 + 1];
                field347[var7 + 2] = field347[var2 + 2];
                field347[var7 + 3] = field347[var2 + 3];
            }
        }
        field347[var2] = var3;
        field347[var2 + 1] = var4;
        field347[var2 + 2] = var5;
        field347[var2 + 3] = var6;
        method177(arg0, var2);
        method177(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lnr;[IIII[I[I)V")
    private static final void method178(class437 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method2101(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method179();
        method184(arg1, arg2, arg3);
        method180(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method181(var7[3])) {
                    return;
                }
                var8 = field350;
                var9 = field351;
                var10 = field348;
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
            arg0.method2093(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "()V")
    private static final void method179() {
        field349 = 0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    private static final void method180(int arg0) {
        if (field349 < 0) {
            field354 = 0;
            field353 = 0;
            field352 = 0;
            field348 = 2147483646;
            return;
        }
        method177(0, field349);
        int var1 = field347[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field349; var3 += 4) {
            int var4 = field347[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field347[var3];
            int var6 = field347[var3 + 2];
            int var7 = field347[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field347[var3] = (var1 - var4) * var8 + var9;
            field347[var3 + 2] = var8;
        }
        field352 = var2;
        field353 = var3;
        field354 = var3;
        field348 = var1 - 1;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)Z")
    private static final boolean method181(int arg0) {
        int var1 = field353;
        int var2 = field354;
        int var3 = field348;
        while (var2 >= var1) {
            var3++;
            field348 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field352;
            while (var1 < field349) {
                int var5 = field347[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field347[var1];
                int var7 = field347[var1 + 2];
                int var8 = field347[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field347[var1] = var10;
                field347[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field347[var11 + 3];
                if (var3 >= var12) {
                    field347[var11] = field347[var4];
                    field347[var11 + 1] = field347[var4 + 1];
                    field347[var11 + 2] = field347[var4 + 2];
                    field347[var11 + 3] = field347[var4 + 3];
                    var4 += 4;
                }
            }
            if (field349 == var4) {
                field349 = 0;
                return false;
            }
            method183(var4, var1);
            field352 = var4;
            field353 = var1;
            var2 = var4;
        }
        field350 = field347[var2] >> 16;
        field351 = field347[var2 + 4] >> 16;
        field347[var2] += field347[var2 + 2];
        field347[var2 + 4] += field347[var2 + 6];
        var2 += 8;
        field354 = var2;
        return true;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "()V")
    public static void method182() {
        field347 = null;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(II)V")
    private static final void method183(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field347[var3 - 4];
                    int var5 = field347[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field347[var3 - 4] = var5;
                        field347[var3] = var4;
                        int var6 = field347[var3 - 2];
                        field347[var3 - 2] = field347[var3 + 2];
                        field347[var3 + 2] = var6;
                        int var7 = field347[var3 - 1];
                        field347[var3 - 1] = field347[var3 + 3];
                        field347[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "([III)V")
    private static final void method184(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field349;
        if (field347 == null || field347.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field349; var5++) {
                var4[var5] = field347[var5];
            }
            field347 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field347[field349++] = arg0[var7];
                field347[field349++] = var9;
                field347[field349++] = arg0[var8];
                field347[field349++] = var10;
            } else if (var10 < var9) {
                field347[field349++] = arg0[var8];
                field347[field349++] = var10;
                field347[field349++] = arg0[var7];
                field347[field349++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lnr;[II)V")
    public static final void method185(class437 arg0, int[] arg1, int arg2) {
        method178(arg0, arg1, 0, arg1.length, arg2, (int[]) null, (int[]) null);
    }
}
