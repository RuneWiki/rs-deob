import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class32 {

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    private static int field507;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    private static int field508;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    private static int field509;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    private static int field510;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    private static int field511;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    private static int field512;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    private static int field513;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "[I")
    private static int[] field514;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Luo;[IIII[I[I)V")
    private static final void method321(class345 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method107(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method328();
        method327(arg1, arg2, arg3);
        method326(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method322(var7[3])) {
                    return;
                }
                var8 = field510;
                var9 = field513;
                var10 = field511;
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
            arg0.method42(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Z")
    private static final boolean method322(int arg0) {
        int var1 = field508;
        int var2 = field509;
        int var3 = field511;
        while (var2 >= var1) {
            var3++;
            field511 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field512;
            while (var1 < field507) {
                int var5 = field514[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field514[var1];
                int var7 = field514[var1 + 2];
                int var8 = field514[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field514[var1] = var10;
                field514[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field514[var11 + 3];
                if (var3 >= var12) {
                    field514[var11] = field514[var4];
                    field514[var11 + 1] = field514[var4 + 1];
                    field514[var11 + 2] = field514[var4 + 2];
                    field514[var11 + 3] = field514[var4 + 3];
                    var4 += 4;
                }
            }
            if (field507 == var4) {
                field507 = 0;
                return false;
            }
            method330(var4, var1);
            field512 = var4;
            field508 = var1;
            var2 = var4;
        }
        field510 = field514[var2] >> 16;
        field513 = field514[var2 + 4] >> 16;
        field514[var2] += field514[var2 + 2];
        field514[var2 + 4] += field514[var2 + 6];
        var2 += 8;
        field509 = var2;
        return true;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "()V")
    public static void method323() {
        field514 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Luo;[II)V")
    public static final void method324(class345 arg0, int[] arg1, int arg2) {
        method321(arg0, arg1, 0, arg1.length, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V")
    private static final void method325(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field514[arg0];
        int var4 = field514[arg0 + 1];
        int var5 = field514[arg0 + 2];
        int var6 = field514[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field514[var7 + 1];
            if (var8 < var4) {
                field514[var2] = field514[var7];
                field514[var2 + 1] = var8;
                field514[var2 + 2] = field514[var7 + 2];
                field514[var2 + 3] = field514[var7 + 3];
                var2 += 4;
                field514[var7] = field514[var2];
                field514[var7 + 1] = field514[var2 + 1];
                field514[var7 + 2] = field514[var2 + 2];
                field514[var7 + 3] = field514[var2 + 3];
            }
        }
        field514[var2] = var3;
        field514[var2 + 1] = var4;
        field514[var2 + 2] = var5;
        field514[var2 + 3] = var6;
        method325(arg0, var2);
        method325(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
    private static final void method326(int arg0) {
        if (field507 < 0) {
            field509 = 0;
            field508 = 0;
            field512 = 0;
            field511 = 2147483646;
            return;
        }
        method325(0, field507);
        int var1 = field514[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field507; var3 += 4) {
            int var4 = field514[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field514[var3];
            int var6 = field514[var3 + 2];
            int var7 = field514[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field514[var3] = (var1 - var4) * var8 + var9;
            field514[var3 + 2] = var8;
        }
        field512 = var2;
        field508 = var3;
        field509 = var3;
        field511 = var1 - 1;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([III)V")
    private static final void method327(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field507;
        if (field514 == null || field514.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field507; var5++) {
                var4[var5] = field514[var5];
            }
            field514 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field514[field507++] = arg0[var7];
                field514[field507++] = var9;
                field514[field507++] = arg0[var8];
                field514[field507++] = var10;
            } else if (var10 < var9) {
                field514[field507++] = arg0[var8];
                field514[field507++] = var10;
                field514[field507++] = arg0[var7];
                field514[field507++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "()V")
    private static final void method328() {
        field507 = 0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Luo;[II[I[I)V")
    public static final void method329(class345 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method321(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)V")
    private static final void method330(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field514[var3 - 4];
                    int var5 = field514[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field514[var3 - 4] = var5;
                        field514[var3] = var4;
                        int var6 = field514[var3 - 2];
                        field514[var3 - 2] = field514[var3 + 2];
                        field514[var3 + 2] = var6;
                        int var7 = field514[var3 - 1];
                        field514[var3 - 1] = field514[var3 + 3];
                        field514[var3 + 3] = var7;
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
