import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class93 {

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    private static int field1641;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    private static int field1642;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    private static int field1643;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    private static int field1644;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    private static int field1645;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    private static int field1646;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    private static int field1647;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "[I")
    private static int[] field1640;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()V", line = 3)
    private static final void method705() {
        field1641 = 0;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "()V", line = 10)
    private static final void method706() {
        if (field1641 < 0) {
            field1643 = 0;
            field1646 = 0;
            field1647 = 0;
            field1645 = 2147483646;
            return;
        }
        method711(0, field1641);
        int var0 = field1640[1];
        if (var0 < class337.field5350) {
            var0 = class337.field5350;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field1641; var2 += 4) {
            int var3 = field1640[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field1640[var2];
            int var5 = field1640[var2 + 2];
            int var6 = field1640[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field1640[var2] = (var0 - var3) * var7 + var8;
            field1640[var2 + 2] = var7;
        }
        field1647 = var1;
        field1646 = var2;
        field1643 = var2;
        field1645 = var0 - 1;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "()Z", line = 56)
    private static final boolean method707() {
        int var0 = field1646;
        int var1 = field1643;
        int var2 = field1645;
        while (var1 >= var0) {
            var2++;
            field1645 = var2;
            if (var2 >= class337.field5349) {
                return false;
            }
            int var3 = field1647;
            while (var0 < field1641) {
                int var4 = field1640[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field1640[var0];
                int var6 = field1640[var0 + 2];
                int var7 = field1640[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field1640[var0] = var9;
                field1640[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field1640[var10 + 3];
                if (var2 >= var11) {
                    field1640[var10] = field1640[var3];
                    field1640[var10 + 1] = field1640[var3 + 1];
                    field1640[var10 + 2] = field1640[var3 + 2];
                    field1640[var10 + 3] = field1640[var3 + 3];
                    var3 += 4;
                }
            }
            if (field1641 == var3) {
                field1641 = 0;
                return false;
            }
            method714(var3, var0);
            field1647 = var3;
            field1646 = var0;
            var1 = var3;
        }
        field1642 = field1640[var1] >> 16;
        field1644 = field1640[var1 + 4] >> 16;
        field1640[var1] += field1640[var1 + 2];
        field1640[var1 + 4] += field1640[var1 + 6];
        var1 += 8;
        field1643 = var1;
        return true;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([III[I[I)V", line = 131)
    public static final void method708(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method709(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([IIIII[I[I)V", line = 142)
    private static final void method709(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class337.field5349 - class337.field5350 != arg5.length) {
            throw new IllegalStateException();
        }
        method705();
        method710(arg0, arg1, arg2);
        method712(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([III)V", line = 154)
    private static final void method710(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field1641;
        if (field1640 == null || field1640.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field1641; var5++) {
                var4[var5] = field1640[var5];
            }
            field1640 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field1640[field1641++] = arg0[var7];
                field1640[field1641++] = var9;
                field1640[field1641++] = arg0[var8];
                field1640[field1641++] = var10;
            } else if (var10 < var9) {
                field1640[field1641++] = arg0[var8];
                field1640[field1641++] = var10;
                field1640[field1641++] = arg0[var7];
                field1640[field1641++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V", line = 203)
    private static final void method711(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field1640[arg0];
        int var4 = field1640[arg0 + 1];
        int var5 = field1640[arg0 + 2];
        int var6 = field1640[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field1640[var7 + 1];
            if (var8 < var4) {
                field1640[var2] = field1640[var7];
                field1640[var2 + 1] = var8;
                field1640[var2 + 2] = field1640[var7 + 2];
                field1640[var2 + 3] = field1640[var7 + 3];
                var2 += 4;
                field1640[var7] = field1640[var2];
                field1640[var7 + 1] = field1640[var2 + 1];
                field1640[var7 + 2] = field1640[var2 + 2];
                field1640[var7 + 3] = field1640[var2 + 3];
            }
        }
        field1640[var2] = var3;
        field1640[var2 + 1] = var4;
        field1640[var2 + 2] = var5;
        field1640[var2 + 3] = var6;
        method711(arg0, var2);
        method711(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II[I[I)V", line = 248)
    private static final void method712(int arg0, int arg1, int[] arg2, int[] arg3) {
        method706();
        while (true) {
            int var4;
            int var5;
            int var6;
            do {
                if (!method707()) {
                    return;
                }
                var4 = field1642;
                var5 = field1644;
                var6 = field1645;
                if (arg2 == null) {
                    break;
                }
                int var7 = var6 - class337.field5350;
                if (var4 < arg2[var7] + class337.field5348) {
                    var4 = arg2[var7] + class337.field5348;
                }
                if (var5 > arg2[var7] + arg3[var7] + class337.field5348) {
                    var5 = arg2[var7] + arg3[var7] + class337.field5348;
                }
            } while (var4 >= var5);
            class337.method2383(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "()V", line = 277)
    public static void method713() {
        field1640 = null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)V", line = 281)
    private static final void method714(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field1640[var3 - 4];
                    int var5 = field1640[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field1640[var3 - 4] = var5;
                        field1640[var3] = var4;
                        int var6 = field1640[var3 - 2];
                        field1640[var3 - 2] = field1640[var3 + 2];
                        field1640[var3 + 2] = var6;
                        int var7 = field1640[var3 - 1];
                        field1640[var3 - 1] = field1640[var3 + 3];
                        field1640[var3 + 3] = var7;
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
