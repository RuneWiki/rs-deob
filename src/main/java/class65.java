import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class65 {

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    private static int field927;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    private static int field928;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    private static int field929;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    private static int field930;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    private static int field931;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
    private static int field933;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    private static int field934;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "[I")
    private static int[] field932;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([III)V")
    private static final void method571(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field927;
        if (field932 == null || field932.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field927; var5++) {
                var4[var5] = field932[var5];
            }
            field932 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field932[field927++] = arg0[var7];
                field932[field927++] = var9;
                field932[field927++] = arg0[var8];
                field932[field927++] = var10;
            } else if (var10 < var9) {
                field932[field927++] = arg0[var8];
                field932[field927++] = var10;
                field932[field927++] = arg0[var7];
                field932[field927++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lha;[IIII[I[I)V")
    private static final void method572(class60 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method530(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method580();
        method571(arg1, arg2, arg3);
        method577(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method578(var7[3])) {
                    return;
                }
                var8 = field933;
                var9 = field928;
                var10 = field930;
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
            arg0.method497(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lha;[II)V")
    public static final void method573(class60 arg0, int[] arg1, int arg2) {
        method572(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "()V")
    public static void method574() {
        field932 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
    private static final void method575(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field932[arg0];
        int var4 = field932[arg0 + 1];
        int var5 = field932[arg0 + 2];
        int var6 = field932[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field932[var7 + 1];
            if (var8 < var4) {
                field932[var2] = field932[var7];
                field932[var2 + 1] = var8;
                field932[var2 + 2] = field932[var7 + 2];
                field932[var2 + 3] = field932[var7 + 3];
                var2 += 4;
                field932[var7] = field932[var2];
                field932[var7 + 1] = field932[var2 + 1];
                field932[var7 + 2] = field932[var2 + 2];
                field932[var7 + 3] = field932[var2 + 3];
            }
        }
        field932[var2] = var3;
        field932[var2 + 1] = var4;
        field932[var2 + 2] = var5;
        field932[var2 + 3] = var6;
        method575(arg0, var2);
        method575(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(II)V")
    private static final void method576(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field932[var3 - 4];
                    int var5 = field932[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field932[var3 - 4] = var5;
                        field932[var3] = var4;
                        int var6 = field932[var3 - 2];
                        field932[var3 - 2] = field932[var3 + 2];
                        field932[var3 + 2] = var6;
                        int var7 = field932[var3 - 1];
                        field932[var3 - 1] = field932[var3 + 3];
                        field932[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
    private static final void method577(int arg0) {
        if (field927 < 0) {
            field934 = 0;
            field929 = 0;
            field931 = 0;
            field930 = 2147483646;
            return;
        }
        method575(0, field927);
        int var1 = field932[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field927; var3 += 4) {
            int var4 = field932[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field932[var3];
            int var6 = field932[var3 + 2];
            int var7 = field932[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field932[var3] = (var1 - var4) * var8 + var9;
            field932[var3 + 2] = var8;
        }
        field931 = var2;
        field929 = var3;
        field934 = var3;
        field930 = var1 - 1;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)Z")
    private static final boolean method578(int arg0) {
        int var1 = field929;
        int var2 = field934;
        int var3 = field930;
        while (var2 >= var1) {
            var3++;
            field930 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field931;
            while (var1 < field927) {
                int var5 = field932[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field932[var1];
                int var7 = field932[var1 + 2];
                int var8 = field932[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field932[var1] = var10;
                field932[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field932[var11 + 3];
                if (var3 >= var12) {
                    field932[var11] = field932[var4];
                    field932[var11 + 1] = field932[var4 + 1];
                    field932[var11 + 2] = field932[var4 + 2];
                    field932[var11 + 3] = field932[var4 + 3];
                    var4 += 4;
                }
            }
            if (field927 == var4) {
                field927 = 0;
                return false;
            }
            method576(var4, var1);
            field931 = var4;
            field929 = var1;
            var2 = var4;
        }
        field933 = field932[var2] >> 16;
        field928 = field932[var2 + 4] >> 16;
        field932[var2] += field932[var2 + 2];
        field932[var2 + 4] += field932[var2 + 6];
        var2 += 8;
        field934 = var2;
        return true;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lha;[II[I[I)V")
    public static final void method579(class60 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method572(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "()V")
    private static final void method580() {
        field927 = 0;
    }
}
