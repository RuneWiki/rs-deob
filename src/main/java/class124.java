import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class124 {

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    private static int field1540;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    private static int field1541;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    private static int field1542;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    private static int field1543;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    private static int field1544;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    private static int field1546;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    private static int field1547;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "[I")
    private static int[] field1545;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "()V")
    private static final void method760() {
        field1540 = 0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V")
    private static final void method761(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field1545[arg0];
        int var4 = field1545[arg0 + 1];
        int var5 = field1545[arg0 + 2];
        int var6 = field1545[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field1545[var7 + 1];
            if (var8 < var4) {
                field1545[var2] = field1545[var7];
                field1545[var2 + 1] = var8;
                field1545[var2 + 2] = field1545[var7 + 2];
                field1545[var2 + 3] = field1545[var7 + 3];
                var2 += 4;
                field1545[var7] = field1545[var2];
                field1545[var7 + 1] = field1545[var2 + 1];
                field1545[var7 + 2] = field1545[var2 + 2];
                field1545[var7 + 3] = field1545[var2 + 3];
            }
        }
        field1545[var2] = var3;
        field1545[var2 + 1] = var4;
        field1545[var2 + 2] = var5;
        field1545[var2 + 3] = var6;
        method761(arg0, var2);
        method761(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Loa;[II[I[I)V")
    public static final void method762(class605 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method769(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "()V")
    public static void method763() {
        field1545 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)Z")
    private static final boolean method764(int arg0) {
        int var1 = field1546;
        int var2 = field1544;
        int var3 = field1547;
        while (var2 >= var1) {
            var3++;
            field1547 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field1543;
            while (var1 < field1540) {
                int var5 = field1545[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field1545[var1];
                int var7 = field1545[var1 + 2];
                int var8 = field1545[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field1545[var1] = var10;
                field1545[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field1545[var11 + 3];
                if (var3 >= var12) {
                    field1545[var11] = field1545[var4];
                    field1545[var11 + 1] = field1545[var4 + 1];
                    field1545[var11 + 2] = field1545[var4 + 2];
                    field1545[var11 + 3] = field1545[var4 + 3];
                    var4 += 4;
                }
            }
            if (field1540 == var4) {
                field1540 = 0;
                return false;
            }
            method766(var4, var1);
            field1543 = var4;
            field1546 = var1;
            var2 = var4;
        }
        field1541 = field1545[var2] >> 16;
        field1542 = field1545[var2 + 4] >> 16;
        field1545[var2] += field1545[var2 + 2];
        field1545[var2 + 4] += field1545[var2 + 6];
        var2 += 8;
        field1544 = var2;
        return true;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Loa;[II)V")
    public static final void method765(class605 arg0, int[] arg1, int arg2) {
        method769(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)V")
    private static final void method766(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field1545[var3 - 4];
                    int var5 = field1545[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field1545[var3 - 4] = var5;
                        field1545[var3] = var4;
                        int var6 = field1545[var3 - 2];
                        field1545[var3 - 2] = field1545[var3 + 2];
                        field1545[var3 + 2] = var6;
                        int var7 = field1545[var3 - 1];
                        field1545[var3 - 1] = field1545[var3 + 3];
                        field1545[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    private static final void method767(int arg0) {
        if (field1540 < 0) {
            field1544 = 0;
            field1546 = 0;
            field1543 = 0;
            field1547 = 2147483646;
            return;
        }
        method761(0, field1540);
        int var1 = field1545[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field1540; var3 += 4) {
            int var4 = field1545[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field1545[var3];
            int var6 = field1545[var3 + 2];
            int var7 = field1545[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field1545[var3] = (var1 - var4) * var8 + var9;
            field1545[var3 + 2] = var8;
        }
        field1543 = var2;
        field1546 = var3;
        field1544 = var3;
        field1547 = var1 - 1;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([III)V")
    private static final void method768(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field1540;
        if (field1545 == null || field1545.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field1540; var5++) {
                var4[var5] = field1545[var5];
            }
            field1545 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field1545[field1540++] = arg0[var7];
                field1545[field1540++] = var9;
                field1545[field1540++] = arg0[var8];
                field1545[field1540++] = var10;
            } else if (var10 < var9) {
                field1545[field1540++] = arg0[var8];
                field1545[field1540++] = var10;
                field1545[field1540++] = arg0[var7];
                field1545[field1540++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Loa;[IIII[I[I)V")
    private static final void method769(class605 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method403(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method760();
        method768(arg1, arg2, arg3);
        method767(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method764(var7[3])) {
                    return;
                }
                var8 = field1541;
                var9 = field1542;
                var10 = field1547;
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
            arg0.method306(var8, var10, var9 - var8, arg4, 1);
        }
    }
}
