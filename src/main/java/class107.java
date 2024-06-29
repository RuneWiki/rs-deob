import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class107 {

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
    private static int field1536;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
    private static int field1537;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    private static int field1538;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
    private static int field1539;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
    private static int field1540;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "I")
    private static int field1541;

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "I")
    private static int field1542;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "[I")
    private static int[] field1543;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "()V", line = 9)
    public static void method789() {
        field1543 = null;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lqa;[II)V", line = 13)
    public static final void method790(class208 arg0, int[] arg1, int arg2) {
        method796(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "([III)V", line = 20)
    private static final void method791(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field1538;
        if (field1543 == null || field1543.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field1538; var5++) {
                var4[var5] = field1543[var5];
            }
            field1543 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field1543[field1538++] = arg0[var7];
                field1543[field1538++] = var9;
                field1543[field1538++] = arg0[var8];
                field1543[field1538++] = var10;
            } else if (var10 < var9) {
                field1543[field1538++] = arg0[var8];
                field1543[field1538++] = var10;
                field1543[field1538++] = arg0[var7];
                field1543[field1538++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "()V", line = 71)
    private static final void method792() {
        field1538 = 0;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V", line = 74)
    private static final void method793(int arg0) {
        if (field1538 < 0) {
            field1539 = 0;
            field1540 = 0;
            field1541 = 0;
            field1536 = 2147483646;
            return;
        }
        method795(0, field1538);
        int var1 = field1543[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field1538; var3 += 4) {
            int var4 = field1543[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field1543[var3];
            int var6 = field1543[var3 + 2];
            int var7 = field1543[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field1543[var3] = (var1 - var4) * var8 + var9;
            field1543[var3 + 2] = var8;
        }
        field1541 = var2;
        field1540 = var3;
        field1539 = var3;
        field1536 = var1 - 1;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)V", line = 119)
    private static final void method794(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field1543[var3 - 4];
                    int var5 = field1543[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field1543[var3 - 4] = var5;
                        field1543[var3] = var4;
                        int var6 = field1543[var3 - 2];
                        field1543[var3 - 2] = field1543[var3 + 2];
                        field1543[var3 + 2] = var6;
                        int var7 = field1543[var3 - 1];
                        field1543[var3 - 1] = field1543[var3 + 3];
                        field1543[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(II)V", line = 156)
    private static final void method795(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field1543[arg0];
        int var4 = field1543[arg0 + 1];
        int var5 = field1543[arg0 + 2];
        int var6 = field1543[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field1543[var7 + 1];
            if (var8 < var4) {
                field1543[var2] = field1543[var7];
                field1543[var2 + 1] = var8;
                field1543[var2 + 2] = field1543[var7 + 2];
                field1543[var2 + 3] = field1543[var7 + 3];
                var2 += 4;
                field1543[var7] = field1543[var2];
                field1543[var7 + 1] = field1543[var2 + 1];
                field1543[var7 + 2] = field1543[var2 + 2];
                field1543[var7 + 3] = field1543[var2 + 3];
            }
        }
        field1543[var2] = var3;
        field1543[var2 + 1] = var4;
        field1543[var2 + 2] = var5;
        field1543[var2 + 3] = var6;
        method795(arg0, var2);
        method795(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lqa;[IIII[I[I)V", line = 203)
    private static final void method796(class208 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method431(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method792();
        method791(arg1, arg2, arg3);
        method793(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method798(var7[3])) {
                    return;
                }
                var8 = field1542;
                var9 = field1537;
                var10 = field1536;
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
            arg0.method432(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lqa;[II[I[I)V", line = 241)
    public static final void method797(class208 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method796(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)Z", line = 245)
    private static final boolean method798(int arg0) {
        int var1 = field1540;
        int var2 = field1539;
        int var3 = field1536;
        while (var2 >= var1) {
            var3++;
            field1536 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field1541;
            while (var1 < field1538) {
                int var5 = field1543[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field1543[var1];
                int var7 = field1543[var1 + 2];
                int var8 = field1543[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field1543[var1] = var10;
                field1543[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field1543[var11 + 3];
                if (var3 >= var12) {
                    field1543[var11] = field1543[var4];
                    field1543[var11 + 1] = field1543[var4 + 1];
                    field1543[var11 + 2] = field1543[var4 + 2];
                    field1543[var11 + 3] = field1543[var4 + 3];
                    var4 += 4;
                }
            }
            if (field1538 == var4) {
                field1538 = 0;
                return false;
            }
            method794(var4, var1);
            field1541 = var4;
            field1540 = var1;
            var2 = var4;
        }
        field1542 = field1543[var2] >> 16;
        field1537 = field1543[var2 + 4] >> 16;
        field1543[var2] += field1543[var2 + 2];
        field1543[var2 + 4] += field1543[var2 + 6];
        var2 += 8;
        field1539 = var2;
        return true;
    }
}
