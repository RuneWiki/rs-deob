import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class646 {

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "I")
    private static int field9200;

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "I")
    private static int field9201;

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "I")
    private static int field9202;

    @OriginalMember(owner = "client!fia", name = "e", descriptor = "I")
    private static int field9204;

    @OriginalMember(owner = "client!fia", name = "f", descriptor = "I")
    private static int field9205;

    @OriginalMember(owner = "client!fia", name = "g", descriptor = "I")
    private static int field9206;

    @OriginalMember(owner = "client!fia", name = "h", descriptor = "I")
    private static int field9207;

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "[I")
    private static int[] field9203;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "()V")
    public static void method3643() {
        field9203 = null;
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "([III)V")
    private static final void method3644(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field9204;
        if (field9203 == null || field9203.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field9204; var5++) {
                var4[var5] = field9203[var5];
            }
            field9203 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field9203[field9204++] = arg0[var7];
                field9203[field9204++] = var9;
                field9203[field9204++] = arg0[var8];
                field9203[field9204++] = var10;
            } else if (var10 < var9) {
                field9203[field9204++] = arg0[var8];
                field9203[field9204++] = var10;
                field9203[field9204++] = arg0[var7];
                field9203[field9204++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(II)V")
    private static final void method3645(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field9203[arg0];
        int var4 = field9203[arg0 + 1];
        int var5 = field9203[arg0 + 2];
        int var6 = field9203[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field9203[var7 + 1];
            if (var8 < var4) {
                field9203[var2] = field9203[var7];
                field9203[var2 + 1] = var8;
                field9203[var2 + 2] = field9203[var7 + 2];
                field9203[var2 + 3] = field9203[var7 + 3];
                var2 += 4;
                field9203[var7] = field9203[var2];
                field9203[var7 + 1] = field9203[var2 + 1];
                field9203[var7 + 2] = field9203[var2 + 2];
                field9203[var7 + 3] = field9203[var2 + 3];
            }
        }
        field9203[var2] = var3;
        field9203[var2 + 1] = var4;
        field9203[var2 + 2] = var5;
        field9203[var2 + 3] = var6;
        method3645(arg0, var2);
        method3645(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "()V")
    private static final void method3646() {
        field9204 = 0;
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(I)V")
    private static final void method3647(int arg0) {
        if (field9204 < 0) {
            field9207 = 0;
            field9201 = 0;
            field9202 = 0;
            field9206 = 2147483646;
            return;
        }
        method3645(0, field9204);
        int var1 = field9203[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field9204; var3 += 4) {
            int var4 = field9203[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field9203[var3];
            int var6 = field9203[var3 + 2];
            int var7 = field9203[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field9203[var3] = (var1 - var4) * var8 + var9;
            field9203[var3 + 2] = var8;
        }
        field9202 = var2;
        field9201 = var3;
        field9207 = var3;
        field9206 = var1 - 1;
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Lha;[II)V")
    public static final void method3648(class544 arg0, int[] arg1, int arg2) {
        method3649(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Lha;[IIII[I[I)V")
    private static final void method3649(class544 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method331(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method3646();
        method3644(arg1, arg2, arg3);
        method3647(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method3652(var7[3])) {
                    return;
                }
                var8 = field9200;
                var9 = field9205;
                var10 = field9206;
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
            arg0.method264(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(II)V")
    private static final void method3650(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field9203[var3 - 4];
                    int var5 = field9203[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field9203[var3 - 4] = var5;
                        field9203[var3] = var4;
                        int var6 = field9203[var3 - 2];
                        field9203[var3 - 2] = field9203[var3 + 2];
                        field9203[var3 + 2] = var6;
                        int var7 = field9203[var3 - 1];
                        field9203[var3 - 1] = field9203[var3 + 3];
                        field9203[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Lha;[II[I[I)V")
    public static final void method3651(class544 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method3649(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(I)Z")
    private static final boolean method3652(int arg0) {
        int var1 = field9201;
        int var2 = field9207;
        int var3 = field9206;
        while (var2 >= var1) {
            var3++;
            field9206 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field9202;
            while (var1 < field9204) {
                int var5 = field9203[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field9203[var1];
                int var7 = field9203[var1 + 2];
                int var8 = field9203[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field9203[var1] = var10;
                field9203[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field9203[var11 + 3];
                if (var3 >= var12) {
                    field9203[var11] = field9203[var4];
                    field9203[var11 + 1] = field9203[var4 + 1];
                    field9203[var11 + 2] = field9203[var4 + 2];
                    field9203[var11 + 3] = field9203[var4 + 3];
                    var4 += 4;
                }
            }
            if (field9204 == var4) {
                field9204 = 0;
                return false;
            }
            method3650(var4, var1);
            field9202 = var4;
            field9201 = var1;
            var2 = var4;
        }
        field9200 = field9203[var2] >> 16;
        field9205 = field9203[var2 + 4] >> 16;
        field9203[var2] += field9203[var2 + 2];
        field9203[var2 + 4] += field9203[var2 + 6];
        var2 += 8;
        field9207 = var2;
        return true;
    }
}
