import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class207 {

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    private static int field2960;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    private static int field2961;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    private static int field2963;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    private static int field2964;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    private static int field2965;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    private static int field2966;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    private static int field2967;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "[I")
    private static int[] field2962;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 3)
    private static final void method1437(int arg0) {
        if (field2963 < 0) {
            field2967 = 0;
            field2961 = 0;
            field2964 = 0;
            field2965 = 2147483646;
            return;
        }
        method1441(0, field2963);
        int var1 = field2962[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field2963; var3 += 4) {
            int var4 = field2962[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field2962[var3];
            int var6 = field2962[var3 + 2];
            int var7 = field2962[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field2962[var3] = (var1 - var4) * var8 + var9;
            field2962[var3 + 2] = var8;
        }
        field2964 = var2;
        field2961 = var3;
        field2967 = var3;
        field2965 = var1 - 1;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()V", line = 48)
    private static final void method1438() {
        field2963 = 0;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lha;[II)V", line = 52)
    public static final void method1439(class58 arg0, int[] arg1, int arg2) {
        method1440(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lha;[IIII[I[I)V", line = 59)
    private static final void method1440(class58 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method624(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1438();
        method1443(arg1, arg2, arg3);
        method1437(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1442(var7[3])) {
                    return;
                }
                var8 = field2966;
                var9 = field2960;
                var10 = field2965;
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
            arg0.method528(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V", line = 98)
    private static final void method1441(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2962[arg0];
        int var4 = field2962[arg0 + 1];
        int var5 = field2962[arg0 + 2];
        int var6 = field2962[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2962[var7 + 1];
            if (var8 < var4) {
                field2962[var2] = field2962[var7];
                field2962[var2 + 1] = var8;
                field2962[var2 + 2] = field2962[var7 + 2];
                field2962[var2 + 3] = field2962[var7 + 3];
                var2 += 4;
                field2962[var7] = field2962[var2];
                field2962[var7 + 1] = field2962[var2 + 1];
                field2962[var7 + 2] = field2962[var2 + 2];
                field2962[var7 + 3] = field2962[var2 + 3];
            }
        }
        field2962[var2] = var3;
        field2962[var2 + 1] = var4;
        field2962[var2 + 2] = var5;
        field2962[var2 + 3] = var6;
        method1441(arg0, var2);
        method1441(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)Z", line = 145)
    private static final boolean method1442(int arg0) {
        int var1 = field2961;
        int var2 = field2967;
        int var3 = field2965;
        while (var2 >= var1) {
            var3++;
            field2965 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field2964;
            while (var1 < field2963) {
                int var5 = field2962[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field2962[var1];
                int var7 = field2962[var1 + 2];
                int var8 = field2962[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field2962[var1] = var10;
                field2962[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field2962[var11 + 3];
                if (var3 >= var12) {
                    field2962[var11] = field2962[var4];
                    field2962[var11 + 1] = field2962[var4 + 1];
                    field2962[var11 + 2] = field2962[var4 + 2];
                    field2962[var11 + 3] = field2962[var4 + 3];
                    var4 += 4;
                }
            }
            if (field2963 == var4) {
                field2963 = 0;
                return false;
            }
            method1446(var4, var1);
            field2964 = var4;
            field2961 = var1;
            var2 = var4;
        }
        field2966 = field2962[var2] >> 16;
        field2960 = field2962[var2 + 4] >> 16;
        field2962[var2] += field2962[var2 + 2];
        field2962[var2 + 4] += field2962[var2 + 6];
        var2 += 8;
        field2967 = var2;
        return true;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([III)V", line = 224)
    private static final void method1443(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2963;
        if (field2962 == null || field2962.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2963; var5++) {
                var4[var5] = field2962[var5];
            }
            field2962 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2962[field2963++] = arg0[var7];
                field2962[field2963++] = var9;
                field2962[field2963++] = arg0[var8];
                field2962[field2963++] = var10;
            } else if (var10 < var9) {
                field2962[field2963++] = arg0[var8];
                field2962[field2963++] = var10;
                field2962[field2963++] = arg0[var7];
                field2962[field2963++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "()V", line = 275)
    public static void method1444() {
        field2962 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lha;[II[I[I)V", line = 280)
    public static final void method1445(class58 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1440(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V", line = 283)
    private static final void method1446(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2962[var3 - 4];
                    int var5 = field2962[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2962[var3 - 4] = var5;
                        field2962[var3] = var4;
                        int var6 = field2962[var3 - 2];
                        field2962[var3 - 2] = field2962[var3 + 2];
                        field2962[var3 + 2] = var6;
                        int var7 = field2962[var3 - 1];
                        field2962[var3 - 1] = field2962[var3 + 3];
                        field2962[var3 + 3] = var7;
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
