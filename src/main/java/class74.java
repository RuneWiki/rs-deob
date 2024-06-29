import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class74 {

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    private static int field780;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    private static int field781;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    private static int field782;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    private static int field783;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    private static int field784;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    private static int field785;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    private static int field786;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "[I")
    private static int[] field779;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V", line = 10)
    private static final void method471(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field779[var3 - 4];
                    int var5 = field779[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field779[var3 - 4] = var5;
                        field779[var3] = var4;
                        int var6 = field779[var3 - 2];
                        field779[var3 - 2] = field779[var3 + 2];
                        field779[var3 + 2] = var6;
                        int var7 = field779[var3 - 1];
                        field779[var3 - 1] = field779[var3 + 3];
                        field779[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V", line = 47)
    private static final void method472(int arg0) {
        if (field783 < 0) {
            field784 = 0;
            field786 = 0;
            field782 = 0;
            field780 = 2147483646;
            return;
        }
        method476(0, field783);
        int var1 = field779[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field783; var3 += 4) {
            int var4 = field779[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field779[var3];
            int var6 = field779[var3 + 2];
            int var7 = field779[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field779[var3] = (var1 - var4) * var8 + var9;
            field779[var3 + 2] = var8;
        }
        field782 = var2;
        field786 = var3;
        field784 = var3;
        field780 = var1 - 1;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "([III)V", line = 98)
    private static final void method473(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field783;
        if (field779 == null || field779.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field783; var5++) {
                var4[var5] = field779[var5];
            }
            field779 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field779[field783++] = arg0[var7];
                field779[field783++] = var9;
                field779[field783++] = arg0[var8];
                field779[field783++] = var10;
            } else if (var10 < var9) {
                field779[field783++] = arg0[var8];
                field779[field783++] = var10;
                field779[field783++] = arg0[var7];
                field779[field783++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Loa;[IIII[I[I)V", line = 150)
    private static final void method474(class635 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method274(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method478();
        method473(arg1, arg2, arg3);
        method472(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method477(var7[3])) {
                    return;
                }
                var8 = field785;
                var9 = field781;
                var10 = field780;
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
            arg0.method361(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Loa;[II[I[I)V", line = 186)
    public static final void method475(class635 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method474(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(II)V", line = 189)
    private static final void method476(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field779[arg0];
        int var4 = field779[arg0 + 1];
        int var5 = field779[arg0 + 2];
        int var6 = field779[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field779[var7 + 1];
            if (var8 < var4) {
                field779[var2] = field779[var7];
                field779[var2 + 1] = var8;
                field779[var2 + 2] = field779[var7 + 2];
                field779[var2 + 3] = field779[var7 + 3];
                var2 += 4;
                field779[var7] = field779[var2];
                field779[var7 + 1] = field779[var2 + 1];
                field779[var7 + 2] = field779[var2 + 2];
                field779[var7 + 3] = field779[var2 + 3];
            }
        }
        field779[var2] = var3;
        field779[var2 + 1] = var4;
        field779[var2 + 2] = var5;
        field779[var2 + 3] = var6;
        method476(arg0, var2);
        method476(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)Z", line = 234)
    private static final boolean method477(int arg0) {
        int var1 = field786;
        int var2 = field784;
        int var3 = field780;
        while (var2 >= var1) {
            var3++;
            field780 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field782;
            while (var1 < field783) {
                int var5 = field779[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field779[var1];
                int var7 = field779[var1 + 2];
                int var8 = field779[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field779[var1] = var10;
                field779[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field779[var11 + 3];
                if (var3 >= var12) {
                    field779[var11] = field779[var4];
                    field779[var11 + 1] = field779[var4 + 1];
                    field779[var11 + 2] = field779[var4 + 2];
                    field779[var11 + 3] = field779[var4 + 3];
                    var4 += 4;
                }
            }
            if (field783 == var4) {
                field783 = 0;
                return false;
            }
            method471(var4, var1);
            field782 = var4;
            field786 = var1;
            var2 = var4;
        }
        field785 = field779[var2] >> 16;
        field781 = field779[var2 + 4] >> 16;
        field779[var2] += field779[var2 + 2];
        field779[var2 + 4] += field779[var2 + 6];
        var2 += 8;
        field784 = var2;
        return true;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "()V", line = 309)
    private static final void method478() {
        field783 = 0;
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "()V", line = 313)
    public static void method479() {
        field779 = null;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Loa;[II)V", line = 317)
    public static final void method480(class635 arg0, int[] arg1, int arg2) {
        method474(arg0, arg1, 0, arg1.length, arg2, null, null);
    }
}
