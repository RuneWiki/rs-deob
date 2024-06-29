import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class733 {

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    private static int field10749;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    private static int field10751;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    private static int field10752;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    private static int field10753;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    private static int field10754;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    private static int field10755;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    private static int field10756;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "[I")
    private static int[] field10750;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(II)V")
    private static final void method5320(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field10750[arg0];
        int var4 = field10750[arg0 + 1];
        int var5 = field10750[arg0 + 2];
        int var6 = field10750[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field10750[var7 + 1];
            if (var8 < var4) {
                field10750[var2] = field10750[var7];
                field10750[var2 + 1] = var8;
                field10750[var2 + 2] = field10750[var7 + 2];
                field10750[var2 + 3] = field10750[var7 + 3];
                var2 += 4;
                field10750[var7] = field10750[var2];
                field10750[var7 + 1] = field10750[var2 + 1];
                field10750[var7 + 2] = field10750[var2 + 2];
                field10750[var7 + 3] = field10750[var2 + 3];
            }
        }
        field10750[var2] = var3;
        field10750[var2 + 1] = var4;
        field10750[var2 + 2] = var5;
        field10750[var2 + 3] = var6;
        method5320(arg0, var2);
        method5320(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lha;[II[I[I)V")
    public static final void method5321(class63 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method5324(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "()V")
    public static void method5322() {
        field10750 = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lha;[II)V")
    public static final void method5323(class63 arg0, int[] arg1, int arg2) {
        method5324(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lha;[IIII[I[I)V")
    private static final void method5324(class63 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method201(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method5326();
        method5325(arg1, arg2, arg3);
        method5327(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method5328(var7[3])) {
                    return;
                }
                var8 = field10756;
                var9 = field10755;
                var10 = field10754;
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
            arg0.method250(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "([III)V")
    private static final void method5325(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field10749;
        if (field10750 == null || field10750.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field10749; var5++) {
                var4[var5] = field10750[var5];
            }
            field10750 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field10750[field10749++] = arg0[var7];
                field10750[field10749++] = var9;
                field10750[field10749++] = arg0[var8];
                field10750[field10749++] = var10;
            } else if (var10 < var9) {
                field10750[field10749++] = arg0[var8];
                field10750[field10749++] = var10;
                field10750[field10749++] = arg0[var7];
                field10750[field10749++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "()V")
    private static final void method5326() {
        field10749 = 0;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
    private static final void method5327(int arg0) {
        if (field10749 < 0) {
            field10753 = 0;
            field10751 = 0;
            field10752 = 0;
            field10754 = 2147483646;
            return;
        }
        method5320(0, field10749);
        int var1 = field10750[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field10749; var3 += 4) {
            int var4 = field10750[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field10750[var3];
            int var6 = field10750[var3 + 2];
            int var7 = field10750[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field10750[var3] = (var1 - var4) * var8 + var9;
            field10750[var3 + 2] = var8;
        }
        field10752 = var2;
        field10751 = var3;
        field10753 = var3;
        field10754 = var1 - 1;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)Z")
    private static final boolean method5328(int arg0) {
        int var1 = field10751;
        int var2 = field10753;
        int var3 = field10754;
        while (var2 >= var1) {
            var3++;
            field10754 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field10752;
            while (var1 < field10749) {
                int var5 = field10750[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field10750[var1];
                int var7 = field10750[var1 + 2];
                int var8 = field10750[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field10750[var1] = var10;
                field10750[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field10750[var11 + 3];
                if (var3 >= var12) {
                    field10750[var11] = field10750[var4];
                    field10750[var11 + 1] = field10750[var4 + 1];
                    field10750[var11 + 2] = field10750[var4 + 2];
                    field10750[var11 + 3] = field10750[var4 + 3];
                    var4 += 4;
                }
            }
            if (field10749 == var4) {
                field10749 = 0;
                return false;
            }
            method5329(var4, var1);
            field10752 = var4;
            field10751 = var1;
            var2 = var4;
        }
        field10756 = field10750[var2] >> 16;
        field10755 = field10750[var2 + 4] >> 16;
        field10750[var2] += field10750[var2 + 2];
        field10750[var2 + 4] += field10750[var2 + 6];
        var2 += 8;
        field10753 = var2;
        return true;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II)V")
    private static final void method5329(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field10750[var3 - 4];
                    int var5 = field10750[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field10750[var3 - 4] = var5;
                        field10750[var3] = var4;
                        int var6 = field10750[var3 - 2];
                        field10750[var3 - 2] = field10750[var3 + 2];
                        field10750[var3 + 2] = var6;
                        int var7 = field10750[var3 - 1];
                        field10750[var3 - 1] = field10750[var3 + 3];
                        field10750[var3 + 3] = var7;
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
