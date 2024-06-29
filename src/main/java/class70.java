import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class70 {

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    private static int field856;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    private static int field857;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    private static int field859;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    private static int field860;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    private static int field861;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    private static int field862;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    private static int field863;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "[I")
    private static int[] field858;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()V")
    private static final void method350() {
        field859 = 0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([III)V")
    private static final void method351(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field859;
        if (field858 == null || field858.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field859; var5++) {
                var4[var5] = field858[var5];
            }
            field858 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field858[field859++] = arg0[var7];
                field858[field859++] = var9;
                field858[field859++] = arg0[var8];
                field858[field859++] = var10;
            } else if (var10 < var9) {
                field858[field859++] = arg0[var8];
                field858[field859++] = var10;
                field858[field859++] = arg0[var7];
                field858[field859++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Loj;[IIII[I[I)V")
    private static final void method352(class280 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method1500(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method350();
        method351(arg1, arg2, arg3);
        method356(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method358(var7[3])) {
                    return;
                }
                var8 = field861;
                var9 = field862;
                var10 = field857;
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
            arg0.method1364(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
    private static final void method353(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field858[var3 - 4];
                    int var5 = field858[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field858[var3 - 4] = var5;
                        field858[var3] = var4;
                        int var6 = field858[var3 - 2];
                        field858[var3 - 2] = field858[var3 + 2];
                        field858[var3 + 2] = var6;
                        int var7 = field858[var3 - 1];
                        field858[var3 - 1] = field858[var3 + 3];
                        field858[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)V")
    private static final void method354(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field858[arg0];
        int var4 = field858[arg0 + 1];
        int var5 = field858[arg0 + 2];
        int var6 = field858[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field858[var7 + 1];
            if (var8 < var4) {
                field858[var2] = field858[var7];
                field858[var2 + 1] = var8;
                field858[var2 + 2] = field858[var7 + 2];
                field858[var2 + 3] = field858[var7 + 3];
                var2 += 4;
                field858[var7] = field858[var2];
                field858[var7 + 1] = field858[var2 + 1];
                field858[var7 + 2] = field858[var2 + 2];
                field858[var7 + 3] = field858[var2 + 3];
            }
        }
        field858[var2] = var3;
        field858[var2 + 1] = var4;
        field858[var2 + 2] = var5;
        field858[var2 + 3] = var6;
        method354(arg0, var2);
        method354(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Loj;[II)V")
    public static final void method355(class280 arg0, int[] arg1, int arg2) {
        method352(arg0, arg1, 0, arg1.length, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    private static final void method356(int arg0) {
        if (field859 < 0) {
            field860 = 0;
            field863 = 0;
            field856 = 0;
            field857 = 2147483646;
            return;
        }
        method354(0, field859);
        int var1 = field858[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field859; var3 += 4) {
            int var4 = field858[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field858[var3];
            int var6 = field858[var3 + 2];
            int var7 = field858[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field858[var3] = (var1 - var4) * var8 + var9;
            field858[var3 + 2] = var8;
        }
        field856 = var2;
        field863 = var3;
        field860 = var3;
        field857 = var1 - 1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Loj;[II[I[I)V")
    public static final void method357(class280 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method352(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)Z")
    private static final boolean method358(int arg0) {
        int var1 = field863;
        int var2 = field860;
        int var3 = field857;
        while (var2 >= var1) {
            var3++;
            field857 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field856;
            while (var1 < field859) {
                int var5 = field858[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field858[var1];
                int var7 = field858[var1 + 2];
                int var8 = field858[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field858[var1] = var10;
                field858[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field858[var11 + 3];
                if (var3 >= var12) {
                    field858[var11] = field858[var4];
                    field858[var11 + 1] = field858[var4 + 1];
                    field858[var11 + 2] = field858[var4 + 2];
                    field858[var11 + 3] = field858[var4 + 3];
                    var4 += 4;
                }
            }
            if (field859 == var4) {
                field859 = 0;
                return false;
            }
            method353(var4, var1);
            field856 = var4;
            field863 = var1;
            var2 = var4;
        }
        field861 = field858[var2] >> 16;
        field862 = field858[var2 + 4] >> 16;
        field858[var2] += field858[var2 + 2];
        field858[var2 + 4] += field858[var2 + 6];
        var2 += 8;
        field860 = var2;
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "()V")
    public static void method359() {
        field858 = null;
    }
}
