import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class240 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    private static int field3786;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    private static int field3787;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    private static int field3789;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    private static int field3790;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    private static int field3791;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    private static int field3792;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    private static int field3793;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "[I")
    private static int[] field3788;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([III[I[I)V")
    public static final void method1665(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method1671(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
    private static final void method1666(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field3788[arg0];
        int var4 = field3788[arg0 + 1];
        int var5 = field3788[arg0 + 2];
        int var6 = field3788[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field3788[var7 + 1];
            if (var8 < var4) {
                field3788[var2] = field3788[var7];
                field3788[var2 + 1] = var8;
                field3788[var2 + 2] = field3788[var7 + 2];
                field3788[var2 + 3] = field3788[var7 + 3];
                var2 += 4;
                field3788[var7] = field3788[var2];
                field3788[var7 + 1] = field3788[var2 + 1];
                field3788[var7 + 2] = field3788[var2 + 2];
                field3788[var7 + 3] = field3788[var2 + 3];
            }
        }
        field3788[var2] = var3;
        field3788[var2 + 1] = var4;
        field3788[var2 + 2] = var5;
        field3788[var2 + 3] = var6;
        method1666(arg0, var2);
        method1666(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "()V")
    public static void method1667() {
        field3788 = null;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "()Z")
    private static final boolean method1668() {
        int var0 = field3789;
        int var1 = field3786;
        int var2 = field3791;
        while (var1 >= var0) {
            var2++;
            field3791 = var2;
            if (var2 >= class62.field935) {
                return false;
            }
            int var3 = field3790;
            while (var0 < field3787) {
                int var4 = field3788[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field3788[var0];
                int var6 = field3788[var0 + 2];
                int var7 = field3788[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field3788[var0] = var9;
                field3788[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field3788[var10 + 3];
                if (var2 >= var11) {
                    field3788[var10] = field3788[var3];
                    field3788[var10 + 1] = field3788[var3 + 1];
                    field3788[var10 + 2] = field3788[var3 + 2];
                    field3788[var10 + 3] = field3788[var3 + 3];
                    var3 += 4;
                }
            }
            if (field3787 == var3) {
                field3787 = 0;
                return false;
            }
            method1673(var3, var0);
            field3790 = var3;
            field3789 = var0;
            var1 = var3;
        }
        field3793 = field3788[var1] >> 16;
        field3792 = field3788[var1 + 4] >> 16;
        field3788[var1] += field3788[var1 + 2];
        field3788[var1 + 4] += field3788[var1 + 6];
        var1 += 8;
        field3786 = var1;
        return true;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([III)V")
    private static final void method1669(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field3787;
        if (field3788 == null || field3788.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field3787; var5++) {
                var4[var5] = field3788[var5];
            }
            field3788 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field3788[field3787++] = arg0[var7];
                field3788[field3787++] = var9;
                field3788[field3787++] = arg0[var8];
                field3788[field3787++] = var10;
            } else if (var10 < var9) {
                field3788[field3787++] = arg0[var8];
                field3788[field3787++] = var10;
                field3788[field3787++] = arg0[var7];
                field3788[field3787++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "()V")
    private static final void method1670() {
        if (field3787 < 0) {
            field3786 = 0;
            field3789 = 0;
            field3790 = 0;
            field3791 = 2147483646;
            return;
        }
        method1666(0, field3787);
        int var0 = field3788[1];
        if (var0 < class62.field930) {
            var0 = class62.field930;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field3787; var2 += 4) {
            int var3 = field3788[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field3788[var2];
            int var5 = field3788[var2 + 2];
            int var6 = field3788[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field3788[var2] = (var0 - var3) * var7 + var8;
            field3788[var2 + 2] = var7;
        }
        field3790 = var1;
        field3789 = var2;
        field3786 = var2;
        field3791 = var0 - 1;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([IIIII[I[I)V")
    private static final void method1671(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class62.field935 - class62.field930 != arg5.length) {
            throw new IllegalStateException();
        }
        method1674();
        method1669(arg0, arg1, arg2);
        method1672(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II[I[I)V")
    private static final void method1672(int arg0, int arg1, int[] arg2, int[] arg3) {
        method1670();
        while (method1668()) {
            int var4 = field3793;
            int var5 = field3792;
            int var6 = field3791;
            if (arg2 != null) {
                int var7 = var6 - class62.field930;
                if (var4 < arg2[var7] + class62.field929) {
                    var4 = arg2[var7] + class62.field929;
                }
                if (var5 > arg2[var7] + arg3[var7] + class62.field929) {
                    var5 = arg2[var7] + arg3[var7] + class62.field929;
                }
            }
            class62.method405(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)V")
    private static final void method1673(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field3788[var3 - 4];
                    int var5 = field3788[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field3788[var3 - 4] = var5;
                        field3788[var3] = var4;
                        int var6 = field3788[var3 - 2];
                        field3788[var3 - 2] = field3788[var3 + 2];
                        field3788[var3 + 2] = var6;
                        int var7 = field3788[var3 - 1];
                        field3788[var3 - 1] = field3788[var3 + 3];
                        field3788[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "()V")
    private static final void method1674() {
        field3787 = 0;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "([III)V")
    public static final void method1675(int[] arg0, int arg1, int arg2) {
        method1671(arg0, 0, arg0.length, arg1, arg2, (int[]) null, (int[]) null);
    }
}
