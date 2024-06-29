import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class285 {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    private static int field4169;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    private static int field4170;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    private static int field4171;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    private static int field4172;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    private static int field4173;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    private static int field4175;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    private static int field4176;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "[I")
    private static int[] field4174;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()V", line = 6)
    public static void method1826() {
        field4174 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Z", line = 10)
    private static final boolean method1827(int arg0) {
        int var1 = field4170;
        int var2 = field4176;
        int var3 = field4169;
        while (var2 >= var1) {
            var3++;
            field4169 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field4172;
            while (var1 < field4175) {
                int var5 = field4174[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field4174[var1];
                int var7 = field4174[var1 + 2];
                int var8 = field4174[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field4174[var1] = var10;
                field4174[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field4174[var11 + 3];
                if (var3 >= var12) {
                    field4174[var11] = field4174[var4];
                    field4174[var11 + 1] = field4174[var4 + 1];
                    field4174[var11 + 2] = field4174[var4 + 2];
                    field4174[var11 + 3] = field4174[var4 + 3];
                    var4 += 4;
                }
            }
            if (field4175 == var4) {
                field4175 = 0;
                return false;
            }
            method1831(var4, var1);
            field4172 = var4;
            field4170 = var1;
            var2 = var4;
        }
        field4173 = field4174[var2] >> 16;
        field4171 = field4174[var2 + 4] >> 16;
        field4174[var2] += field4174[var2 + 2];
        field4174[var2 + 4] += field4174[var2 + 6];
        var2 += 8;
        field4176 = var2;
        return true;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lqa;[II[I[I)V", line = 86)
    public static final void method1828(class165 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1830(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([III)V", line = 93)
    private static final void method1829(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field4175;
        if (field4174 == null || field4174.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field4175; var5++) {
                var4[var5] = field4174[var5];
            }
            field4174 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field4174[field4175++] = arg0[var7];
                field4174[field4175++] = var9;
                field4174[field4175++] = arg0[var8];
                field4174[field4175++] = var10;
            } else if (var10 < var9) {
                field4174[field4175++] = arg0[var8];
                field4174[field4175++] = var10;
                field4174[field4175++] = arg0[var7];
                field4174[field4175++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lqa;[IIII[I[I)V", line = 147)
    private static final void method1830(class165 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method850(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1835();
        method1829(arg1, arg2, arg3);
        method1832(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1827(var7[3])) {
                    return;
                }
                var8 = field4173;
                var9 = field4171;
                var10 = field4169;
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
            arg0.method758(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V", line = 183)
    private static final void method1831(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field4174[var3 - 4];
                    int var5 = field4174[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field4174[var3 - 4] = var5;
                        field4174[var3] = var4;
                        int var6 = field4174[var3 - 2];
                        field4174[var3 - 2] = field4174[var3 + 2];
                        field4174[var3 + 2] = var6;
                        int var7 = field4174[var3 - 1];
                        field4174[var3 - 1] = field4174[var3 + 3];
                        field4174[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V", line = 223)
    private static final void method1832(int arg0) {
        if (field4175 < 0) {
            field4176 = 0;
            field4170 = 0;
            field4172 = 0;
            field4169 = 2147483646;
            return;
        }
        method1833(0, field4175);
        int var1 = field4174[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field4175; var3 += 4) {
            int var4 = field4174[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field4174[var3];
            int var6 = field4174[var3 + 2];
            int var7 = field4174[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field4174[var3] = (var1 - var4) * var8 + var9;
            field4174[var3 + 2] = var8;
        }
        field4172 = var2;
        field4170 = var3;
        field4176 = var3;
        field4169 = var1 - 1;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)V", line = 270)
    private static final void method1833(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field4174[arg0];
        int var4 = field4174[arg0 + 1];
        int var5 = field4174[arg0 + 2];
        int var6 = field4174[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field4174[var7 + 1];
            if (var8 < var4) {
                field4174[var2] = field4174[var7];
                field4174[var2 + 1] = var8;
                field4174[var2 + 2] = field4174[var7 + 2];
                field4174[var2 + 3] = field4174[var7 + 3];
                var2 += 4;
                field4174[var7] = field4174[var2];
                field4174[var7 + 1] = field4174[var2 + 1];
                field4174[var7 + 2] = field4174[var2 + 2];
                field4174[var7 + 3] = field4174[var2 + 3];
            }
        }
        field4174[var2] = var3;
        field4174[var2 + 1] = var4;
        field4174[var2 + 2] = var5;
        field4174[var2 + 3] = var6;
        method1833(arg0, var2);
        method1833(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lqa;[II)V", line = 314)
    public static final void method1834(class165 arg0, int[] arg1, int arg2) {
        method1830(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "()V", line = 317)
    private static final void method1835() {
        field4175 = 0;
    }
}
