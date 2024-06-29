import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class322 {

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    private static int field4541;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    private static int field4542;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    private static int field4543;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    private static int field4544;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "I")
    private static int field4545;

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
    private static int field4547;

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "I")
    private static int field4548;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "[I")
    private static int[] field4546;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "()V")
    private static final void method2071() {
        field4544 = 0;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lha;[II[I[I)V")
    public static final void method2072(class65 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method2078(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
    private static final void method2073(int arg0) {
        if (field4544 < 0) {
            field4542 = 0;
            field4548 = 0;
            field4545 = 0;
            field4541 = 2147483646;
            return;
        }
        method2076(0, field4544);
        int var1 = field4546[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field4544; var3 += 4) {
            int var4 = field4546[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field4546[var3];
            int var6 = field4546[var3 + 2];
            int var7 = field4546[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field4546[var3] = (var1 - var4) * var8 + var9;
            field4546[var3 + 2] = var8;
        }
        field4545 = var2;
        field4548 = var3;
        field4542 = var3;
        field4541 = var1 - 1;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lha;[II)V")
    public static final void method2074(class65 arg0, int[] arg1, int arg2) {
        method2078(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "()V")
    public static void method2075() {
        field4546 = null;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)V")
    private static final void method2076(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field4546[arg0];
        int var4 = field4546[arg0 + 1];
        int var5 = field4546[arg0 + 2];
        int var6 = field4546[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field4546[var7 + 1];
            if (var8 < var4) {
                field4546[var2] = field4546[var7];
                field4546[var2 + 1] = var8;
                field4546[var2 + 2] = field4546[var7 + 2];
                field4546[var2 + 3] = field4546[var7 + 3];
                var2 += 4;
                field4546[var7] = field4546[var2];
                field4546[var7 + 1] = field4546[var2 + 1];
                field4546[var7 + 2] = field4546[var2 + 2];
                field4546[var7 + 3] = field4546[var2 + 3];
            }
        }
        field4546[var2] = var3;
        field4546[var2 + 1] = var4;
        field4546[var2 + 2] = var5;
        field4546[var2 + 3] = var6;
        method2076(arg0, var2);
        method2076(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "([III)V")
    private static final void method2077(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field4544;
        if (field4546 == null || field4546.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field4544; var5++) {
                var4[var5] = field4546[var5];
            }
            field4546 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field4546[field4544++] = arg0[var7];
                field4546[field4544++] = var9;
                field4546[field4544++] = arg0[var8];
                field4546[field4544++] = var10;
            } else if (var10 < var9) {
                field4546[field4544++] = arg0[var8];
                field4546[field4544++] = var10;
                field4546[field4544++] = arg0[var7];
                field4546[field4544++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lha;[IIII[I[I)V")
    private static final void method2078(class65 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method449(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method2071();
        method2077(arg1, arg2, arg3);
        method2073(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method2080(var7[3])) {
                    return;
                }
                var8 = field4547;
                var9 = field4543;
                var10 = field4541;
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
            arg0.method529(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(II)V")
    private static final void method2079(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field4546[var3 - 4];
                    int var5 = field4546[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field4546[var3 - 4] = var5;
                        field4546[var3] = var4;
                        int var6 = field4546[var3 - 2];
                        field4546[var3 - 2] = field4546[var3 + 2];
                        field4546[var3 + 2] = var6;
                        int var7 = field4546[var3 - 1];
                        field4546[var3 - 1] = field4546[var3 + 3];
                        field4546[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)Z")
    private static final boolean method2080(int arg0) {
        int var1 = field4548;
        int var2 = field4542;
        int var3 = field4541;
        while (var2 >= var1) {
            var3++;
            field4541 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field4545;
            while (var1 < field4544) {
                int var5 = field4546[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field4546[var1];
                int var7 = field4546[var1 + 2];
                int var8 = field4546[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field4546[var1] = var10;
                field4546[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field4546[var11 + 3];
                if (var3 >= var12) {
                    field4546[var11] = field4546[var4];
                    field4546[var11 + 1] = field4546[var4 + 1];
                    field4546[var11 + 2] = field4546[var4 + 2];
                    field4546[var11 + 3] = field4546[var4 + 3];
                    var4 += 4;
                }
            }
            if (field4544 == var4) {
                field4544 = 0;
                return false;
            }
            method2079(var4, var1);
            field4545 = var4;
            field4548 = var1;
            var2 = var4;
        }
        field4547 = field4546[var2] >> 16;
        field4543 = field4546[var2 + 4] >> 16;
        field4546[var2] += field4546[var2 + 2];
        field4546[var2 + 4] += field4546[var2 + 6];
        var2 += 8;
        field4542 = var2;
        return true;
    }
}
