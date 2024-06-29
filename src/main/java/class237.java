import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class237 {

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    private static int field3676;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    private static int field3677;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    private static int field3678;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    private static int field3679;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    private static int field3681;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    private static int field3682;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    private static int field3683;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "[I")
    private static int[] field3680;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "()V")
    private static final void method1549() {
        if (field3676 < 0) {
            field3682 = 0;
            field3679 = 0;
            field3678 = 0;
            field3683 = 2147483646;
            return;
        }
        method1558(0, field3676);
        int var0 = field3680[1];
        if (var0 < class266.field4281) {
            var0 = class266.field4281;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field3676; var2 += 4) {
            int var3 = field3680[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field3680[var2];
            int var5 = field3680[var2 + 2];
            int var6 = field3680[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field3680[var2] = (var0 - var3) * var7 + var8;
            field3680[var2 + 2] = var7;
        }
        field3678 = var1;
        field3679 = var2;
        field3682 = var2;
        field3683 = var0 - 1;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II[I[I)V")
    private static final void method1550(int arg0, int arg1, int[] arg2, int[] arg3) {
        method1549();
        while (method1557()) {
            int var4 = field3677;
            int var5 = field3681;
            int var6 = field3683;
            if (arg2 != null) {
                int var7 = var6 - class266.field4281;
                if (var4 < arg2[var7] + class266.field4279) {
                    var4 = arg2[var7] + class266.field4279;
                }
                if (var5 > arg2[var7] + arg3[var7] + class266.field4279) {
                    var5 = arg2[var7] + arg3[var7] + class266.field4279;
                }
            }
            class266.method1734(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([IIIII[I[I)V")
    private static final void method1551(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class266.field4280 - class266.field4281 != arg5.length) {
            throw new IllegalStateException();
        }
        method1555();
        method1552(arg0, arg1, arg2);
        method1550(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([III)V")
    private static final void method1552(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field3676;
        if (field3680 == null || field3680.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field3676; var5++) {
                var4[var5] = field3680[var5];
            }
            field3680 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field3680[field3676++] = arg0[var7];
                field3680[field3676++] = var9;
                field3680[field3676++] = arg0[var8];
                field3680[field3676++] = var10;
            } else if (var10 < var9) {
                field3680[field3676++] = arg0[var8];
                field3680[field3676++] = var10;
                field3680[field3676++] = arg0[var7];
                field3680[field3676++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([III[I[I)V")
    public static final void method1553(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method1551(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "([III)V")
    public static final void method1554(int[] arg0, int arg1, int arg2) {
        method1551(arg0, 0, arg0.length, arg1, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "()V")
    private static final void method1555() {
        field3676 = 0;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "()V")
    public static void method1556() {
        field3680 = null;
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "()Z")
    private static final boolean method1557() {
        int var0 = field3679;
        int var1 = field3682;
        int var2 = field3683;
        while (var1 >= var0) {
            var2++;
            field3683 = var2;
            if (var2 >= class266.field4280) {
                return false;
            }
            int var3 = field3678;
            while (var0 < field3676) {
                int var4 = field3680[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field3680[var0];
                int var6 = field3680[var0 + 2];
                int var7 = field3680[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field3680[var0] = var9;
                field3680[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field3680[var10 + 3];
                if (var2 >= var11) {
                    field3680[var10] = field3680[var3];
                    field3680[var10 + 1] = field3680[var3 + 1];
                    field3680[var10 + 2] = field3680[var3 + 2];
                    field3680[var10 + 3] = field3680[var3 + 3];
                    var3 += 4;
                }
            }
            if (field3676 == var3) {
                field3676 = 0;
                return false;
            }
            method1559(var3, var0);
            field3678 = var3;
            field3679 = var0;
            var1 = var3;
        }
        field3677 = field3680[var1] >> 16;
        field3681 = field3680[var1 + 4] >> 16;
        field3680[var1] += field3680[var1 + 2];
        field3680[var1 + 4] += field3680[var1 + 6];
        var1 += 8;
        field3682 = var1;
        return true;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    private static final void method1558(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field3680[arg0];
        int var4 = field3680[arg0 + 1];
        int var5 = field3680[arg0 + 2];
        int var6 = field3680[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field3680[var7 + 1];
            if (var8 < var4) {
                field3680[var2] = field3680[var7];
                field3680[var2 + 1] = var8;
                field3680[var2 + 2] = field3680[var7 + 2];
                field3680[var2 + 3] = field3680[var7 + 3];
                var2 += 4;
                field3680[var7] = field3680[var2];
                field3680[var7 + 1] = field3680[var2 + 1];
                field3680[var7 + 2] = field3680[var2 + 2];
                field3680[var7 + 3] = field3680[var2 + 3];
            }
        }
        field3680[var2] = var3;
        field3680[var2 + 1] = var4;
        field3680[var2 + 2] = var5;
        field3680[var2 + 3] = var6;
        method1558(arg0, var2);
        method1558(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)V")
    private static final void method1559(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field3680[var3 - 4];
                    int var5 = field3680[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field3680[var3 - 4] = var5;
                        field3680[var3] = var4;
                        int var6 = field3680[var3 - 2];
                        field3680[var3 - 2] = field3680[var3 + 2];
                        field3680[var3 + 2] = var6;
                        int var7 = field3680[var3 - 1];
                        field3680[var3 - 1] = field3680[var3 + 3];
                        field3680[var3 + 3] = var7;
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
