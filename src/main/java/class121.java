import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class121 {

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    private static int field1562;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    private static int field1563;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    private static int field1564;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    private static int field1565;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    private static int field1566;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    private static int field1567;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    private static int field1568;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "[I")
    private static int[] field1569;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V", line = 3)
    private static final void method842(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field1569[arg0];
        int var4 = field1569[arg0 + 1];
        int var5 = field1569[arg0 + 2];
        int var6 = field1569[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field1569[var7 + 1];
            if (var8 < var4) {
                field1569[var2] = field1569[var7];
                field1569[var2 + 1] = var8;
                field1569[var2 + 2] = field1569[var7 + 2];
                field1569[var2 + 3] = field1569[var7 + 3];
                var2 += 4;
                field1569[var7] = field1569[var2];
                field1569[var7 + 1] = field1569[var2 + 1];
                field1569[var7 + 2] = field1569[var2 + 2];
                field1569[var7 + 3] = field1569[var2 + 3];
            }
        }
        field1569[var2] = var3;
        field1569[var2 + 1] = var4;
        field1569[var2 + 2] = var5;
        field1569[var2 + 3] = var6;
        method842(arg0, var2);
        method842(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 47)
    private static final void method843(int arg0) {
        if (field1566 < 0) {
            field1567 = 0;
            field1562 = 0;
            field1568 = 0;
            field1565 = 2147483646;
            return;
        }
        method842(0, field1566);
        int var1 = field1569[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field1566; var3 += 4) {
            int var4 = field1569[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field1569[var3];
            int var6 = field1569[var3 + 2];
            int var7 = field1569[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field1569[var3] = (var1 - var4) * var8 + var9;
            field1569[var3 + 2] = var8;
        }
        field1568 = var2;
        field1562 = var3;
        field1567 = var3;
        field1565 = var1 - 1;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)Z", line = 96)
    private static final boolean method844(int arg0) {
        int var1 = field1562;
        int var2 = field1567;
        int var3 = field1565;
        while (var2 >= var1) {
            var3++;
            field1565 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field1568;
            while (var1 < field1566) {
                int var5 = field1569[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field1569[var1];
                int var7 = field1569[var1 + 2];
                int var8 = field1569[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field1569[var1] = var10;
                field1569[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field1569[var11 + 3];
                if (var3 >= var12) {
                    field1569[var11] = field1569[var4];
                    field1569[var11 + 1] = field1569[var4 + 1];
                    field1569[var11 + 2] = field1569[var4 + 2];
                    field1569[var11 + 3] = field1569[var4 + 3];
                    var4 += 4;
                }
            }
            if (field1566 == var4) {
                field1566 = 0;
                return false;
            }
            method847(var4, var1);
            field1568 = var4;
            field1562 = var1;
            var2 = var4;
        }
        field1563 = field1569[var2] >> 16;
        field1564 = field1569[var2 + 4] >> 16;
        field1569[var2] += field1569[var2 + 2];
        field1569[var2 + 4] += field1569[var2 + 6];
        var2 += 8;
        field1567 = var2;
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lr;[IIII[I[I)V", line = 174)
    private static final void method845(class165 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method251(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method851();
        method848(arg1, arg2, arg3);
        method843(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method844(var7[3])) {
                    return;
                }
                var8 = field1563;
                var9 = field1564;
                var10 = field1565;
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
            arg0.method290(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lr;[II[I[I)V", line = 211)
    public static final void method846(class165 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method845(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)V", line = 214)
    private static final void method847(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field1569[var3 - 4];
                    int var5 = field1569[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field1569[var3 - 4] = var5;
                        field1569[var3] = var4;
                        int var6 = field1569[var3 - 2];
                        field1569[var3 - 2] = field1569[var3 + 2];
                        field1569[var3 + 2] = var6;
                        int var7 = field1569[var3 - 1];
                        field1569[var3 - 1] = field1569[var3 + 3];
                        field1569[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([III)V", line = 255)
    private static final void method848(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field1566;
        if (field1569 == null || field1569.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field1566; var5++) {
                var4[var5] = field1569[var5];
            }
            field1569 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field1569[field1566++] = arg0[var7];
                field1569[field1566++] = var9;
                field1569[field1566++] = arg0[var8];
                field1569[field1566++] = var10;
            } else if (var10 < var9) {
                field1569[field1566++] = arg0[var8];
                field1569[field1566++] = var10;
                field1569[field1566++] = arg0[var7];
                field1569[field1566++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lr;[II)V", line = 306)
    public static final void method849(class165 arg0, int[] arg1, int arg2) {
        method845(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "()V", line = 309)
    public static void method850() {
        field1569 = null;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "()V", line = 312)
    private static final void method851() {
        field1566 = 0;
    }
}
