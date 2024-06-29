import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class120 {

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    private static int field1560;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    private static int field1561;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    private static int field1562;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    private static int field1563;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    private static int field1565;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    private static int field1566;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    private static int field1567;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "[I")
    private static int[] field1564;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "()V", line = 5)
    private static final void method715() {
        field1565 = 0;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V", line = 10)
    private static final void method716(int arg0) {
        if (field1565 < 0) {
            field1567 = 0;
            field1561 = 0;
            field1560 = 0;
            field1562 = 2147483646;
            return;
        }
        method719(0, field1565);
        int var1 = field1564[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field1565; var3 += 4) {
            int var4 = field1564[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field1564[var3];
            int var6 = field1564[var3 + 2];
            int var7 = field1564[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field1564[var3] = (var1 - var4) * var8 + var9;
            field1564[var3 + 2] = var8;
        }
        field1560 = var2;
        field1561 = var3;
        field1567 = var3;
        field1562 = var1 - 1;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([III)V", line = 58)
    private static final void method717(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field1565;
        if (field1564 == null || field1564.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field1565; var5++) {
                var4[var5] = field1564[var5];
            }
            field1564 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field1564[field1565++] = arg0[var7];
                field1564[field1565++] = var9;
                field1564[field1565++] = arg0[var8];
                field1564[field1565++] = var10;
            } else if (var10 < var9) {
                field1564[field1565++] = arg0[var8];
                field1564[field1565++] = var10;
                field1564[field1565++] = arg0[var7];
                field1564[field1565++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lza;[II)V", line = 107)
    public static final void method718(class287 arg0, int[] arg1, int arg2) {
        method724(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V", line = 110)
    private static final void method719(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field1564[arg0];
        int var4 = field1564[arg0 + 1];
        int var5 = field1564[arg0 + 2];
        int var6 = field1564[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field1564[var7 + 1];
            if (var8 < var4) {
                field1564[var2] = field1564[var7];
                field1564[var2 + 1] = var8;
                field1564[var2 + 2] = field1564[var7 + 2];
                field1564[var2 + 3] = field1564[var7 + 3];
                var2 += 4;
                field1564[var7] = field1564[var2];
                field1564[var7 + 1] = field1564[var2 + 1];
                field1564[var7 + 2] = field1564[var2 + 2];
                field1564[var7 + 3] = field1564[var2 + 3];
            }
        }
        field1564[var2] = var3;
        field1564[var2 + 1] = var4;
        field1564[var2 + 2] = var5;
        field1564[var2 + 3] = var6;
        method719(arg0, var2);
        method719(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)Z", line = 160)
    private static final boolean method720(int arg0) {
        int var1 = field1561;
        int var2 = field1567;
        int var3 = field1562;
        while (var2 >= var1) {
            var3++;
            field1562 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field1560;
            while (var1 < field1565) {
                int var5 = field1564[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field1564[var1];
                int var7 = field1564[var1 + 2];
                int var8 = field1564[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field1564[var1] = var10;
                field1564[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field1564[var11 + 3];
                if (var3 >= var12) {
                    field1564[var11] = field1564[var4];
                    field1564[var11 + 1] = field1564[var4 + 1];
                    field1564[var11 + 2] = field1564[var4 + 2];
                    field1564[var11 + 3] = field1564[var4 + 3];
                    var4 += 4;
                }
            }
            if (field1565 == var4) {
                field1565 = 0;
                return false;
            }
            method722(var4, var1);
            field1560 = var4;
            field1561 = var1;
            var2 = var4;
        }
        field1566 = field1564[var2] >> 16;
        field1563 = field1564[var2 + 4] >> 16;
        field1564[var2] += field1564[var2 + 2];
        field1564[var2 + 4] += field1564[var2 + 6];
        var2 += 8;
        field1567 = var2;
        return true;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "()V", line = 238)
    public static void method721() {
        field1564 = null;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)V", line = 241)
    private static final void method722(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field1564[var3 - 4];
                    int var5 = field1564[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field1564[var3 - 4] = var5;
                        field1564[var3] = var4;
                        int var6 = field1564[var3 - 2];
                        field1564[var3 - 2] = field1564[var3 + 2];
                        field1564[var3 + 2] = var6;
                        int var7 = field1564[var3 - 1];
                        field1564[var3 - 1] = field1564[var3 + 3];
                        field1564[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lza;[II[I[I)V", line = 278)
    public static final void method723(class287 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method724(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lza;[IIII[I[I)V", line = 284)
    private static final void method724(class287 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method1163(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method715();
        method717(arg1, arg2, arg3);
        method716(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method720(var7[3])) {
                    return;
                }
                var8 = field1566;
                var9 = field1563;
                var10 = field1562;
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
            arg0.method1128(var8, var10, var9 - var8, arg4, 1);
        }
    }
}
