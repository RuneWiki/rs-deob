import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class72 {

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    private static int field1034;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    private static int field1035;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    private static int field1036;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    private static int field1037;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "I")
    private static int field1038;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "I")
    private static int field1040;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
    private static int field1041;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "[I")
    private static int[] field1039;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
    private static final void method645(int arg0) {
        if (field1038 < 0) {
            field1036 = 0;
            field1034 = 0;
            field1040 = 0;
            field1035 = 2147483646;
            return;
        }
        method653(0, field1038);
        int var1 = field1039[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field1038; var3 += 4) {
            int var4 = field1039[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field1039[var3];
            int var6 = field1039[var3 + 2];
            int var7 = field1039[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field1039[var3] = (var1 - var4) * var8 + var9;
            field1039[var3 + 2] = var8;
        }
        field1040 = var2;
        field1034 = var3;
        field1036 = var3;
        field1035 = var1 - 1;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lvc;[II[I[I)V")
    public static final void method646(class89 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method651(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)Z")
    private static final boolean method647(int arg0) {
        int var1 = field1034;
        int var2 = field1036;
        int var3 = field1035;
        while (var2 >= var1) {
            var3++;
            field1035 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field1040;
            while (var1 < field1038) {
                int var5 = field1039[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field1039[var1];
                int var7 = field1039[var1 + 2];
                int var8 = field1039[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field1039[var1] = var10;
                field1039[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field1039[var11 + 3];
                if (var3 >= var12) {
                    field1039[var11] = field1039[var4];
                    field1039[var11 + 1] = field1039[var4 + 1];
                    field1039[var11 + 2] = field1039[var4 + 2];
                    field1039[var11 + 3] = field1039[var4 + 3];
                    var4 += 4;
                }
            }
            if (field1038 == var4) {
                field1038 = 0;
                return false;
            }
            method649(var4, var1);
            field1040 = var4;
            field1034 = var1;
            var2 = var4;
        }
        field1041 = field1039[var2] >> 16;
        field1037 = field1039[var2 + 4] >> 16;
        field1039[var2] += field1039[var2 + 2];
        field1039[var2 + 4] += field1039[var2 + 6];
        var2 += 8;
        field1036 = var2;
        return true;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "([III)V")
    private static final void method648(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field1038;
        if (field1039 == null || field1039.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field1038; var5++) {
                var4[var5] = field1039[var5];
            }
            field1039 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field1039[field1038++] = arg0[var7];
                field1039[field1038++] = var9;
                field1039[field1038++] = arg0[var8];
                field1039[field1038++] = var10;
            } else if (var10 < var9) {
                field1039[field1038++] = arg0[var8];
                field1039[field1038++] = var10;
                field1039[field1038++] = arg0[var7];
                field1039[field1038++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)V")
    private static final void method649(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field1039[var3 - 4];
                    int var5 = field1039[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field1039[var3 - 4] = var5;
                        field1039[var3] = var4;
                        int var6 = field1039[var3 - 2];
                        field1039[var3 - 2] = field1039[var3 + 2];
                        field1039[var3 + 2] = var6;
                        int var7 = field1039[var3 - 1];
                        field1039[var3 - 1] = field1039[var3 + 3];
                        field1039[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lvc;[II)V")
    public static final void method650(class89 arg0, int[] arg1, int arg2) {
        method651(arg0, arg1, 0, arg1.length, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lvc;[IIII[I[I)V")
    private static final void method651(class89 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method409(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method654();
        method648(arg1, arg2, arg3);
        method645(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method647(var7[3])) {
                    return;
                }
                var8 = field1041;
                var9 = field1037;
                var10 = field1035;
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
            arg0.method374(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "()V")
    public static void method652() {
        field1039 = null;
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(II)V")
    private static final void method653(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field1039[arg0];
        int var4 = field1039[arg0 + 1];
        int var5 = field1039[arg0 + 2];
        int var6 = field1039[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field1039[var7 + 1];
            if (var8 < var4) {
                field1039[var2] = field1039[var7];
                field1039[var2 + 1] = var8;
                field1039[var2 + 2] = field1039[var7 + 2];
                field1039[var2 + 3] = field1039[var7 + 3];
                var2 += 4;
                field1039[var7] = field1039[var2];
                field1039[var7 + 1] = field1039[var2 + 1];
                field1039[var7 + 2] = field1039[var2 + 2];
                field1039[var7 + 3] = field1039[var2 + 3];
            }
        }
        field1039[var2] = var3;
        field1039[var2 + 1] = var4;
        field1039[var2 + 2] = var5;
        field1039[var2 + 3] = var6;
        method653(arg0, var2);
        method653(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "()V")
    private static final void method654() {
        field1038 = 0;
    }
}
