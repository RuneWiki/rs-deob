import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class508 {

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    private static int field6863;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    private static int field6864;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    private static int field6865;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    private static int field6866;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    private static int field6868;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    private static int field6869;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    private static int field6870;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "[I")
    private static int[] field6867;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Z", line = 4)
    private static final boolean method2868(int arg0) {
        int var1 = field6866;
        int var2 = field6865;
        int var3 = field6864;
        while (var2 >= var1) {
            var3++;
            field6864 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field6863;
            while (var1 < field6868) {
                int var5 = field6867[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field6867[var1];
                int var7 = field6867[var1 + 2];
                int var8 = field6867[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field6867[var1] = var10;
                field6867[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field6867[var11 + 3];
                if (var3 >= var12) {
                    field6867[var11] = field6867[var4];
                    field6867[var11 + 1] = field6867[var4 + 1];
                    field6867[var11 + 2] = field6867[var4 + 2];
                    field6867[var11 + 3] = field6867[var4 + 3];
                    var4 += 4;
                }
            }
            if (field6868 == var4) {
                field6868 = 0;
                return false;
            }
            method2876(var4, var1);
            field6863 = var4;
            field6866 = var1;
            var2 = var4;
        }
        field6870 = field6867[var2] >> 16;
        field6869 = field6867[var2 + 4] >> 16;
        field6867[var2] += field6867[var2 + 2];
        field6867[var2 + 4] += field6867[var2 + 6];
        var2 += 8;
        field6865 = var2;
        return true;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Loa;[IIII[I[I)V", line = 83)
    private static final void method2869(class689 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method1910(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method2877();
        method2870(arg1, arg2, arg3);
        method2872(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method2868(var7[3])) {
                    return;
                }
                var8 = field6870;
                var9 = field6869;
                var10 = field6864;
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
            arg0.method1879(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([III)V", line = 124)
    private static final void method2870(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field6868;
        if (field6867 == null || field6867.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field6868; var5++) {
                var4[var5] = field6867[var5];
            }
            field6867 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field6867[field6868++] = arg0[var7];
                field6867[field6868++] = var9;
                field6867[field6868++] = arg0[var8];
                field6867[field6868++] = var10;
            } else if (var10 < var9) {
                field6867[field6868++] = arg0[var8];
                field6867[field6868++] = var10;
                field6867[field6868++] = arg0[var7];
                field6867[field6868++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)V", line = 174)
    private static final void method2871(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field6867[arg0];
        int var4 = field6867[arg0 + 1];
        int var5 = field6867[arg0 + 2];
        int var6 = field6867[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field6867[var7 + 1];
            if (var8 < var4) {
                field6867[var2] = field6867[var7];
                field6867[var2 + 1] = var8;
                field6867[var2 + 2] = field6867[var7 + 2];
                field6867[var2 + 3] = field6867[var7 + 3];
                var2 += 4;
                field6867[var7] = field6867[var2];
                field6867[var7 + 1] = field6867[var2 + 1];
                field6867[var7 + 2] = field6867[var2 + 2];
                field6867[var7 + 3] = field6867[var2 + 3];
            }
        }
        field6867[var2] = var3;
        field6867[var2 + 1] = var4;
        field6867[var2 + 2] = var5;
        field6867[var2 + 3] = var6;
        method2871(arg0, var2);
        method2871(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V", line = 218)
    private static final void method2872(int arg0) {
        if (field6868 < 0) {
            field6865 = 0;
            field6866 = 0;
            field6863 = 0;
            field6864 = 2147483646;
            return;
        }
        method2871(0, field6868);
        int var1 = field6867[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field6868; var3 += 4) {
            int var4 = field6867[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field6867[var3];
            int var6 = field6867[var3 + 2];
            int var7 = field6867[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field6867[var3] = (var1 - var4) * var8 + var9;
            field6867[var3 + 2] = var8;
        }
        field6863 = var2;
        field6866 = var3;
        field6865 = var3;
        field6864 = var1 - 1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "()V", line = 264)
    public static void method2873() {
        field6867 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Loa;[II[I[I)V", line = 270)
    public static final void method2874(class689 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method2869(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Loa;[II)V", line = 274)
    public static final void method2875(class689 arg0, int[] arg1, int arg2) {
        method2869(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)V", line = 278)
    private static final void method2876(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field6867[var3 - 4];
                    int var5 = field6867[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field6867[var3 - 4] = var5;
                        field6867[var3] = var4;
                        int var6 = field6867[var3 - 2];
                        field6867[var3 - 2] = field6867[var3 + 2];
                        field6867[var3 + 2] = var6;
                        int var7 = field6867[var3 - 1];
                        field6867[var3 - 1] = field6867[var3 + 3];
                        field6867[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "()V", line = 317)
    private static final void method2877() {
        field6868 = 0;
    }
}
