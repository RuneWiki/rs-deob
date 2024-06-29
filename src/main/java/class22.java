import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class22 {

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    private static int field321;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    private static int field322;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    private static int field323;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    private static int field325;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    private static int field326;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    private static int field327;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    private static int field328;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "[I")
    private static int[] field324;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lha;[II[I[I)V")
    public static final void method136(class58 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method141(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "()V")
    private static final void method137() {
        field321 = 0;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "()V")
    public static void method138() {
        field324 = null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([III)V")
    private static final void method139(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field321;
        if (field324 == null || field324.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field321; var5++) {
                var4[var5] = field324[var5];
            }
            field324 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field324[field321++] = arg0[var7];
                field324[field321++] = var9;
                field324[field321++] = arg0[var8];
                field324[field321++] = var10;
            } else if (var10 < var9) {
                field324[field321++] = arg0[var8];
                field324[field321++] = var10;
                field324[field321++] = arg0[var7];
                field324[field321++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lha;[II)V")
    public static final void method140(class58 arg0, int[] arg1, int arg2) {
        method141(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lha;[IIII[I[I)V")
    private static final void method141(class58 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method398(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method137();
        method139(arg1, arg2, arg3);
        method145(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method142(var7[3])) {
                    return;
                }
                var8 = field326;
                var9 = field328;
                var10 = field325;
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
            arg0.method433(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)Z")
    private static final boolean method142(int arg0) {
        int var1 = field322;
        int var2 = field323;
        int var3 = field325;
        while (var2 >= var1) {
            var3++;
            field325 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field327;
            while (var1 < field321) {
                int var5 = field324[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field324[var1];
                int var7 = field324[var1 + 2];
                int var8 = field324[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field324[var1] = var10;
                field324[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field324[var11 + 3];
                if (var3 >= var12) {
                    field324[var11] = field324[var4];
                    field324[var11 + 1] = field324[var4 + 1];
                    field324[var11 + 2] = field324[var4 + 2];
                    field324[var11 + 3] = field324[var4 + 3];
                    var4 += 4;
                }
            }
            if (field321 == var4) {
                field321 = 0;
                return false;
            }
            method144(var4, var1);
            field327 = var4;
            field322 = var1;
            var2 = var4;
        }
        field326 = field324[var2] >> 16;
        field328 = field324[var2 + 4] >> 16;
        field324[var2] += field324[var2 + 2];
        field324[var2 + 4] += field324[var2 + 6];
        var2 += 8;
        field323 = var2;
        return true;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)V")
    private static final void method143(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field324[arg0];
        int var4 = field324[arg0 + 1];
        int var5 = field324[arg0 + 2];
        int var6 = field324[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field324[var7 + 1];
            if (var8 < var4) {
                field324[var2] = field324[var7];
                field324[var2 + 1] = var8;
                field324[var2 + 2] = field324[var7 + 2];
                field324[var2 + 3] = field324[var7 + 3];
                var2 += 4;
                field324[var7] = field324[var2];
                field324[var7 + 1] = field324[var2 + 1];
                field324[var7 + 2] = field324[var2 + 2];
                field324[var7 + 3] = field324[var2 + 3];
            }
        }
        field324[var2] = var3;
        field324[var2 + 1] = var4;
        field324[var2 + 2] = var5;
        field324[var2 + 3] = var6;
        method143(arg0, var2);
        method143(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(II)V")
    private static final void method144(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field324[var3 - 4];
                    int var5 = field324[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field324[var3 - 4] = var5;
                        field324[var3] = var4;
                        int var6 = field324[var3 - 2];
                        field324[var3 - 2] = field324[var3 + 2];
                        field324[var3 + 2] = var6;
                        int var7 = field324[var3 - 1];
                        field324[var3 - 1] = field324[var3 + 3];
                        field324[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
    private static final void method145(int arg0) {
        if (field321 < 0) {
            field323 = 0;
            field322 = 0;
            field327 = 0;
            field325 = 2147483646;
            return;
        }
        method143(0, field321);
        int var1 = field324[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field321; var3 += 4) {
            int var4 = field324[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field324[var3];
            int var6 = field324[var3 + 2];
            int var7 = field324[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field324[var3] = (var1 - var4) * var8 + var9;
            field324[var3 + 2] = var8;
        }
        field327 = var2;
        field322 = var3;
        field323 = var3;
        field325 = var1 - 1;
    }
}
