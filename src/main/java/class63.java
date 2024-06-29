import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class63 {

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    private static int field643;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    private static int field644;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    private static int field646;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    private static int field647;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    private static int field648;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
    private static int field649;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    private static int field650;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "[I")
    private static int[] field645;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
    private static final void method472(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field645[arg0];
        int var4 = field645[arg0 + 1];
        int var5 = field645[arg0 + 2];
        int var6 = field645[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field645[var7 + 1];
            if (var8 < var4) {
                field645[var2] = field645[var7];
                field645[var2 + 1] = var8;
                field645[var2 + 2] = field645[var7 + 2];
                field645[var2 + 3] = field645[var7 + 3];
                var2 += 4;
                field645[var7] = field645[var2];
                field645[var7 + 1] = field645[var2 + 1];
                field645[var7 + 2] = field645[var2 + 2];
                field645[var7 + 3] = field645[var2 + 3];
            }
        }
        field645[var2] = var3;
        field645[var2 + 1] = var4;
        field645[var2 + 2] = var5;
        field645[var2 + 3] = var6;
        method472(arg0, var2);
        method472(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lha;[II[I[I)V")
    public static final void method473(class58 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method475(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
    private static final void method474(int arg0) {
        if (field644 < 0) {
            field646 = 0;
            field648 = 0;
            field650 = 0;
            field647 = 2147483646;
            return;
        }
        method472(0, field644);
        int var1 = field645[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field644; var3 += 4) {
            int var4 = field645[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field645[var3];
            int var6 = field645[var3 + 2];
            int var7 = field645[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field645[var3] = (var1 - var4) * var8 + var9;
            field645[var3 + 2] = var8;
        }
        field650 = var2;
        field648 = var3;
        field646 = var3;
        field647 = var1 - 1;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lha;[IIII[I[I)V")
    private static final void method475(class58 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method354(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method479();
        method477(arg1, arg2, arg3);
        method474(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method478(var7[3])) {
                    return;
                }
                var8 = field643;
                var9 = field649;
                var10 = field647;
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
            arg0.method340(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "()V")
    public static void method476() {
        field645 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([III)V")
    private static final void method477(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field644;
        if (field645 == null || field645.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field644; var5++) {
                var4[var5] = field645[var5];
            }
            field645 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field645[field644++] = arg0[var7];
                field645[field644++] = var9;
                field645[field644++] = arg0[var8];
                field645[field644++] = var10;
            } else if (var10 < var9) {
                field645[field644++] = arg0[var8];
                field645[field644++] = var10;
                field645[field644++] = arg0[var7];
                field645[field644++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)Z")
    private static final boolean method478(int arg0) {
        int var1 = field648;
        int var2 = field646;
        int var3 = field647;
        while (var2 >= var1) {
            var3++;
            field647 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field650;
            while (var1 < field644) {
                int var5 = field645[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field645[var1];
                int var7 = field645[var1 + 2];
                int var8 = field645[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field645[var1] = var10;
                field645[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field645[var11 + 3];
                if (var3 >= var12) {
                    field645[var11] = field645[var4];
                    field645[var11 + 1] = field645[var4 + 1];
                    field645[var11 + 2] = field645[var4 + 2];
                    field645[var11 + 3] = field645[var4 + 3];
                    var4 += 4;
                }
            }
            if (field644 == var4) {
                field644 = 0;
                return false;
            }
            method480(var4, var1);
            field650 = var4;
            field648 = var1;
            var2 = var4;
        }
        field643 = field645[var2] >> 16;
        field649 = field645[var2 + 4] >> 16;
        field645[var2] += field645[var2 + 2];
        field645[var2 + 4] += field645[var2 + 6];
        var2 += 8;
        field646 = var2;
        return true;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "()V")
    private static final void method479() {
        field644 = 0;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(II)V")
    private static final void method480(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field645[var3 - 4];
                    int var5 = field645[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field645[var3 - 4] = var5;
                        field645[var3] = var4;
                        int var6 = field645[var3 - 2];
                        field645[var3 - 2] = field645[var3 + 2];
                        field645[var3 + 2] = var6;
                        int var7 = field645[var3 - 1];
                        field645[var3 - 1] = field645[var3 + 3];
                        field645[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lha;[II)V")
    public static final void method481(class58 arg0, int[] arg1, int arg2) {
        method475(arg0, arg1, 0, arg1.length, arg2, null, null);
    }
}
