import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class340 {

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "I")
    private static int field5058;

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "I")
    private static int field5059;

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "I")
    private static int field5060;

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "I")
    private static int field5061;

    @OriginalMember(owner = "client!bfa", name = "f", descriptor = "I")
    private static int field5062;

    @OriginalMember(owner = "client!bfa", name = "g", descriptor = "I")
    private static int field5063;

    @OriginalMember(owner = "client!bfa", name = "h", descriptor = "I")
    private static int field5064;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "[I")
    private static int[] field5057;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V")
    private static final void method2179(int arg0) {
        if (field5060 < 0) {
            field5062 = 0;
            field5063 = 0;
            field5064 = 0;
            field5058 = 2147483646;
            return;
        }
        method2187(0, field5060);
        int var1 = field5057[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field5060; var3 += 4) {
            int var4 = field5057[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field5057[var3];
            int var6 = field5057[var3 + 2];
            int var7 = field5057[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field5057[var3] = (var1 - var4) * var8 + var9;
            field5057[var3 + 2] = var8;
        }
        field5064 = var2;
        field5063 = var3;
        field5062 = var3;
        field5058 = var1 - 1;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lr;[II)V")
    public static final void method2180(class167 arg0, int[] arg1, int arg2) {
        method2182(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "()V")
    public static void method2181() {
        field5057 = null;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lr;[IIII[I[I)V")
    private static final void method2182(class167 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method131(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method2188();
        method2184(arg1, arg2, arg3);
        method2179(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method2183(var7[3])) {
                    return;
                }
                var8 = field5059;
                var9 = field5061;
                var10 = field5058;
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
            arg0.method126(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)Z")
    private static final boolean method2183(int arg0) {
        int var1 = field5063;
        int var2 = field5062;
        int var3 = field5058;
        while (var2 >= var1) {
            var3++;
            field5058 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field5064;
            while (var1 < field5060) {
                int var5 = field5057[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field5057[var1];
                int var7 = field5057[var1 + 2];
                int var8 = field5057[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field5057[var1] = var10;
                field5057[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field5057[var11 + 3];
                if (var3 >= var12) {
                    field5057[var11] = field5057[var4];
                    field5057[var11 + 1] = field5057[var4 + 1];
                    field5057[var11 + 2] = field5057[var4 + 2];
                    field5057[var11 + 3] = field5057[var4 + 3];
                    var4 += 4;
                }
            }
            if (field5060 == var4) {
                field5060 = 0;
                return false;
            }
            method2185(var4, var1);
            field5064 = var4;
            field5063 = var1;
            var2 = var4;
        }
        field5059 = field5057[var2] >> 16;
        field5061 = field5057[var2 + 4] >> 16;
        field5057[var2] += field5057[var2 + 2];
        field5057[var2 + 4] += field5057[var2 + 6];
        var2 += 8;
        field5062 = var2;
        return true;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "([III)V")
    private static final void method2184(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field5060;
        if (field5057 == null || field5057.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field5060; var5++) {
                var4[var5] = field5057[var5];
            }
            field5057 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field5057[field5060++] = arg0[var7];
                field5057[field5060++] = var9;
                field5057[field5060++] = arg0[var8];
                field5057[field5060++] = var10;
            } else if (var10 < var9) {
                field5057[field5060++] = arg0[var8];
                field5057[field5060++] = var10;
                field5057[field5060++] = arg0[var7];
                field5057[field5060++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(II)V")
    private static final void method2185(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field5057[var3 - 4];
                    int var5 = field5057[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field5057[var3 - 4] = var5;
                        field5057[var3] = var4;
                        int var6 = field5057[var3 - 2];
                        field5057[var3 - 2] = field5057[var3 + 2];
                        field5057[var3 + 2] = var6;
                        int var7 = field5057[var3 - 1];
                        field5057[var3 - 1] = field5057[var3 + 3];
                        field5057[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lr;[II[I[I)V")
    public static final void method2186(class167 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method2182(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(II)V")
    private static final void method2187(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field5057[arg0];
        int var4 = field5057[arg0 + 1];
        int var5 = field5057[arg0 + 2];
        int var6 = field5057[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field5057[var7 + 1];
            if (var8 < var4) {
                field5057[var2] = field5057[var7];
                field5057[var2 + 1] = var8;
                field5057[var2 + 2] = field5057[var7 + 2];
                field5057[var2 + 3] = field5057[var7 + 3];
                var2 += 4;
                field5057[var7] = field5057[var2];
                field5057[var7 + 1] = field5057[var2 + 1];
                field5057[var7 + 2] = field5057[var2 + 2];
                field5057[var7 + 3] = field5057[var2 + 3];
            }
        }
        field5057[var2] = var3;
        field5057[var2 + 1] = var4;
        field5057[var2 + 2] = var5;
        field5057[var2 + 3] = var6;
        method2187(arg0, var2);
        method2187(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "()V")
    private static final void method2188() {
        field5060 = 0;
    }
}
