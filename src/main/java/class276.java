import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class276 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    private static int field3814;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    private static int field3815;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    private static int field3816;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    private static int field3818;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    private static int field3819;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    private static int field3820;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    private static int field3821;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "[I")
    private static int[] field3817;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "()V", line = 3)
    public static void method1725() {
        field3817 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V", line = 6)
    private static final void method1726(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field3817[var3 - 4];
                    int var5 = field3817[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field3817[var3 - 4] = var5;
                        field3817[var3] = var4;
                        int var6 = field3817[var3 - 2];
                        field3817[var3 - 2] = field3817[var3 + 2];
                        field3817[var3 + 2] = var6;
                        int var7 = field3817[var3 - 1];
                        field3817[var3 - 1] = field3817[var3 + 3];
                        field3817[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lkm;[II[I[I)V", line = 53)
    public static final void method1727(class487 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1731(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)Z", line = 58)
    private static final boolean method1728(int arg0) {
        int var1 = field3814;
        int var2 = field3819;
        int var3 = field3815;
        while (var2 >= var1) {
            var3++;
            field3815 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field3818;
            while (var1 < field3821) {
                int var5 = field3817[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field3817[var1];
                int var7 = field3817[var1 + 2];
                int var8 = field3817[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field3817[var1] = var10;
                field3817[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field3817[var11 + 3];
                if (var3 >= var12) {
                    field3817[var11] = field3817[var4];
                    field3817[var11 + 1] = field3817[var4 + 1];
                    field3817[var11 + 2] = field3817[var4 + 2];
                    field3817[var11 + 3] = field3817[var4 + 3];
                    var4 += 4;
                }
            }
            if (field3821 == var4) {
                field3821 = 0;
                return false;
            }
            method1726(var4, var1);
            field3818 = var4;
            field3814 = var1;
            var2 = var4;
        }
        field3816 = field3817[var2] >> 16;
        field3820 = field3817[var2 + 4] >> 16;
        field3817[var2] += field3817[var2 + 2];
        field3817[var2 + 4] += field3817[var2 + 6];
        var2 += 8;
        field3819 = var2;
        return true;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "()V", line = 133)
    private static final void method1729() {
        field3821 = 0;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)V", line = 136)
    private static final void method1730(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field3817[arg0];
        int var4 = field3817[arg0 + 1];
        int var5 = field3817[arg0 + 2];
        int var6 = field3817[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field3817[var7 + 1];
            if (var8 < var4) {
                field3817[var2] = field3817[var7];
                field3817[var2 + 1] = var8;
                field3817[var2 + 2] = field3817[var7 + 2];
                field3817[var2 + 3] = field3817[var7 + 3];
                var2 += 4;
                field3817[var7] = field3817[var2];
                field3817[var7 + 1] = field3817[var2 + 1];
                field3817[var7 + 2] = field3817[var2 + 2];
                field3817[var7 + 3] = field3817[var2 + 3];
            }
        }
        field3817[var2] = var3;
        field3817[var2 + 1] = var4;
        field3817[var2 + 2] = var5;
        field3817[var2 + 3] = var6;
        method1730(arg0, var2);
        method1730(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lkm;[IIII[I[I)V", line = 183)
    private static final void method1731(class487 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method1077(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1729();
        method1732(arg1, arg2, arg3);
        method1734(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1728(var7[3])) {
                    return;
                }
                var8 = field3816;
                var9 = field3820;
                var10 = field3815;
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
            arg0.method1130(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([III)V", line = 222)
    private static final void method1732(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field3821;
        if (field3817 == null || field3817.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field3821; var5++) {
                var4[var5] = field3817[var5];
            }
            field3817 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field3817[field3821++] = arg0[var7];
                field3817[field3821++] = var9;
                field3817[field3821++] = arg0[var8];
                field3817[field3821++] = var10;
            } else if (var10 < var9) {
                field3817[field3821++] = arg0[var8];
                field3817[field3821++] = var10;
                field3817[field3821++] = arg0[var7];
                field3817[field3821++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lkm;[II)V", line = 272)
    public static final void method1733(class487 arg0, int[] arg1, int arg2) {
        method1731(arg0, arg1, 0, arg1.length, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V", line = 275)
    private static final void method1734(int arg0) {
        if (field3821 < 0) {
            field3819 = 0;
            field3814 = 0;
            field3818 = 0;
            field3815 = 2147483646;
            return;
        }
        method1730(0, field3821);
        int var1 = field3817[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field3821; var3 += 4) {
            int var4 = field3817[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field3817[var3];
            int var6 = field3817[var3 + 2];
            int var7 = field3817[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field3817[var3] = (var1 - var4) * var8 + var9;
            field3817[var3 + 2] = var8;
        }
        field3818 = var2;
        field3814 = var3;
        field3819 = var3;
        field3815 = var1 - 1;
    }
}
