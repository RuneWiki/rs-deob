import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class241 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    private static int field3492;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    private static int field3493;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    private static int field3495;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    private static int field3496;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    private static int field3497;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    private static int field3498;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    private static int field3499;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "[I")
    private static int[] field3494;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "()V", line = 3)
    public static void method1707() {
        field3494 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II[I[I)V", line = 9)
    private static final void method1708(int arg0, int arg1, int[] arg2, int[] arg3) {
        method1714();
        while (true) {
            int var4;
            int var5;
            int var6;
            do {
                if (!method1716()) {
                    return;
                }
                var4 = field3493;
                var5 = field3495;
                var6 = field3496;
                if (arg2 == null) {
                    break;
                }
                int var7 = var6 - class129.field1766;
                if (var4 < arg2[var7] + class129.field1763) {
                    var4 = arg2[var7] + class129.field1763;
                }
                if (var5 > arg2[var7] + arg3[var7] + class129.field1763) {
                    var5 = arg2[var7] + arg3[var7] + class129.field1763;
                }
            } while (var4 >= var5);
            class129.method981(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V", line = 38)
    private static final void method1709(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field3494[var3 - 4];
                    int var5 = field3494[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field3494[var3 - 4] = var5;
                        field3494[var3] = var4;
                        int var6 = field3494[var3 - 2];
                        field3494[var3 - 2] = field3494[var3 + 2];
                        field3494[var3 + 2] = var6;
                        int var7 = field3494[var3 - 1];
                        field3494[var3 - 1] = field3494[var3 + 3];
                        field3494[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([III)V", line = 79)
    private static final void method1710(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field3499;
        if (field3494 == null || field3494.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field3499; var5++) {
                var4[var5] = field3494[var5];
            }
            field3494 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field3494[field3499++] = arg0[var7];
                field3494[field3499++] = var9;
                field3494[field3499++] = arg0[var8];
                field3494[field3499++] = var10;
            } else if (var10 < var9) {
                field3494[field3499++] = arg0[var8];
                field3494[field3499++] = var10;
                field3494[field3499++] = arg0[var7];
                field3494[field3499++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([IIIII[I[I)V", line = 132)
    private static final void method1711(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class129.field1762 - class129.field1766 != arg5.length) {
            throw new IllegalStateException();
        }
        method1715();
        method1710(arg0, arg1, arg2);
        method1708(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)V", line = 142)
    private static final void method1712(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field3494[arg0];
        int var4 = field3494[arg0 + 1];
        int var5 = field3494[arg0 + 2];
        int var6 = field3494[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field3494[var7 + 1];
            if (var8 < var4) {
                field3494[var2] = field3494[var7];
                field3494[var2 + 1] = var8;
                field3494[var2 + 2] = field3494[var7 + 2];
                field3494[var2 + 3] = field3494[var7 + 3];
                var2 += 4;
                field3494[var7] = field3494[var2];
                field3494[var7 + 1] = field3494[var2 + 1];
                field3494[var7 + 2] = field3494[var2 + 2];
                field3494[var7 + 3] = field3494[var2 + 3];
            }
        }
        field3494[var2] = var3;
        field3494[var2 + 1] = var4;
        field3494[var2 + 2] = var5;
        field3494[var2 + 3] = var6;
        method1712(arg0, var2);
        method1712(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([III[I[I)V", line = 186)
    public static final void method1713(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method1711(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "()V", line = 189)
    private static final void method1714() {
        if (field3499 < 0) {
            field3497 = 0;
            field3498 = 0;
            field3492 = 0;
            field3496 = 2147483646;
            return;
        }
        method1712(0, field3499);
        int var0 = field3494[1];
        if (var0 < class129.field1766) {
            var0 = class129.field1766;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field3499; var2 += 4) {
            int var3 = field3494[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field3494[var2];
            int var5 = field3494[var2 + 2];
            int var6 = field3494[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field3494[var2] = (var0 - var3) * var7 + var8;
            field3494[var2 + 2] = var7;
        }
        field3492 = var1;
        field3498 = var2;
        field3497 = var2;
        field3496 = var0 - 1;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "()V", line = 236)
    private static final void method1715() {
        field3499 = 0;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "()Z", line = 248)
    private static final boolean method1716() {
        int var0 = field3498;
        int var1 = field3497;
        int var2 = field3496;
        while (var1 >= var0) {
            var2++;
            field3496 = var2;
            if (var2 >= class129.field1762) {
                return false;
            }
            int var3 = field3492;
            while (var0 < field3499) {
                int var4 = field3494[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field3494[var0];
                int var6 = field3494[var0 + 2];
                int var7 = field3494[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field3494[var0] = var9;
                field3494[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field3494[var10 + 3];
                if (var2 >= var11) {
                    field3494[var10] = field3494[var3];
                    field3494[var10 + 1] = field3494[var3 + 1];
                    field3494[var10 + 2] = field3494[var3 + 2];
                    field3494[var10 + 3] = field3494[var3 + 3];
                    var3 += 4;
                }
            }
            if (field3499 == var3) {
                field3499 = 0;
                return false;
            }
            method1709(var3, var0);
            field3492 = var3;
            field3498 = var0;
            var1 = var3;
        }
        field3493 = field3494[var1] >> 16;
        field3495 = field3494[var1 + 4] >> 16;
        field3494[var1] += field3494[var1 + 2];
        field3494[var1 + 4] += field3494[var1 + 6];
        var1 += 8;
        field3497 = var1;
        return true;
    }
}
