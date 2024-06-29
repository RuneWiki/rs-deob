import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class423 {

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    private static int field6298;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    private static int field6299;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    private static int field6300;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    private static int field6301;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    private static int field6302;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    private static int field6303;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    private static int field6305;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "[I")
    private static int[] field6304;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "()V", line = 4)
    public static void method2638() {
        field6304 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)Z", line = 8)
    private static final boolean method2639(int arg0) {
        int var1 = field6299;
        int var2 = field6303;
        int var3 = field6301;
        while (var2 >= var1) {
            var3++;
            field6301 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field6305;
            while (var1 < field6302) {
                int var5 = field6304[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field6304[var1];
                int var7 = field6304[var1 + 2];
                int var8 = field6304[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field6304[var1] = var10;
                field6304[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field6304[var11 + 3];
                if (var3 >= var12) {
                    field6304[var11] = field6304[var4];
                    field6304[var11 + 1] = field6304[var4 + 1];
                    field6304[var11 + 2] = field6304[var4 + 2];
                    field6304[var11 + 3] = field6304[var4 + 3];
                    var4 += 4;
                }
            }
            if (field6302 == var4) {
                field6302 = 0;
                return false;
            }
            method2645(var4, var1);
            field6305 = var4;
            field6299 = var1;
            var2 = var4;
        }
        field6298 = field6304[var2] >> 16;
        field6300 = field6304[var2 + 4] >> 16;
        field6304[var2] += field6304[var2 + 2];
        field6304[var2 + 4] += field6304[var2 + 6];
        var2 += 8;
        field6303 = var2;
        return true;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lya;[IIII[I[I)V", line = 86)
    private static final void method2640(class38 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method351(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method2641();
        method2647(arg1, arg2, arg3);
        method2644(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method2639(var7[3])) {
                    return;
                }
                var8 = field6298;
                var9 = field6300;
                var10 = field6301;
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
            arg0.method304(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "()V", line = 124)
    private static final void method2641() {
        field6302 = 0;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)V", line = 127)
    private static final void method2642(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field6304[arg0];
        int var4 = field6304[arg0 + 1];
        int var5 = field6304[arg0 + 2];
        int var6 = field6304[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field6304[var7 + 1];
            if (var8 < var4) {
                field6304[var2] = field6304[var7];
                field6304[var2 + 1] = var8;
                field6304[var2 + 2] = field6304[var7 + 2];
                field6304[var2 + 3] = field6304[var7 + 3];
                var2 += 4;
                field6304[var7] = field6304[var2];
                field6304[var7 + 1] = field6304[var2 + 1];
                field6304[var7 + 2] = field6304[var2 + 2];
                field6304[var7 + 3] = field6304[var2 + 3];
            }
        }
        field6304[var2] = var3;
        field6304[var2 + 1] = var4;
        field6304[var2 + 2] = var5;
        field6304[var2 + 3] = var6;
        method2642(arg0, var2);
        method2642(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lya;[II[I[I)V", line = 171)
    public static final void method2643(class38 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method2640(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)V", line = 175)
    private static final void method2644(int arg0) {
        if (field6302 < 0) {
            field6303 = 0;
            field6299 = 0;
            field6305 = 0;
            field6301 = 2147483646;
            return;
        }
        method2642(0, field6302);
        int var1 = field6304[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field6302; var3 += 4) {
            int var4 = field6304[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field6304[var3];
            int var6 = field6304[var3 + 2];
            int var7 = field6304[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field6304[var3] = (var1 - var4) * var8 + var9;
            field6304[var3 + 2] = var8;
        }
        field6305 = var2;
        field6299 = var3;
        field6303 = var3;
        field6301 = var1 - 1;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(II)V", line = 223)
    private static final void method2645(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field6304[var3 - 4];
                    int var5 = field6304[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field6304[var3 - 4] = var5;
                        field6304[var3] = var4;
                        int var6 = field6304[var3 - 2];
                        field6304[var3 - 2] = field6304[var3 + 2];
                        field6304[var3 + 2] = var6;
                        int var7 = field6304[var3 - 1];
                        field6304[var3 - 1] = field6304[var3 + 3];
                        field6304[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lya;[II)V", line = 261)
    public static final void method2646(class38 arg0, int[] arg1, int arg2) {
        method2640(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "([III)V", line = 271)
    private static final void method2647(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field6302;
        if (field6304 == null || field6304.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field6302; var5++) {
                var4[var5] = field6304[var5];
            }
            field6304 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field6304[field6302++] = arg0[var7];
                field6304[field6302++] = var9;
                field6304[field6302++] = arg0[var8];
                field6304[field6302++] = var10;
            } else if (var10 < var9) {
                field6304[field6302++] = arg0[var8];
                field6304[field6302++] = var10;
                field6304[field6302++] = arg0[var7];
                field6304[field6302++] = var9;
            }
            var7 = var8;
        }
    }
}
