import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class27 {

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    private static int field342;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    private static int field343;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    private static int field344;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    private static int field345;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    private static int field347;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    private static int field348;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    private static int field349;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "[I")
    private static int[] field346;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([III)V", line = 7)
    private static final void method141(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field344;
        if (field346 == null || field346.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field344; var5++) {
                var4[var5] = field346[var5];
            }
            field346 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field346[field344++] = arg0[var7];
                field346[field344++] = var9;
                field346[field344++] = arg0[var8];
                field346[field344++] = var10;
            } else if (var10 < var9) {
                field346[field344++] = arg0[var8];
                field346[field344++] = var10;
                field346[field344++] = arg0[var7];
                field346[field344++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()V", line = 62)
    public static void method142() {
        field346 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 65)
    private static final void method143(int arg0) {
        if (field344 < 0) {
            field347 = 0;
            field342 = 0;
            field348 = 0;
            field343 = 2147483646;
            return;
        }
        method146(0, field344);
        int var1 = field346[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field344; var3 += 4) {
            int var4 = field346[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field346[var3];
            int var6 = field346[var3 + 2];
            int var7 = field346[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field346[var3] = (var1 - var4) * var8 + var9;
            field346[var3 + 2] = var8;
        }
        field348 = var2;
        field342 = var3;
        field347 = var3;
        field343 = var1 - 1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lvq;[II[I[I)V", line = 110)
    public static final void method144(class269 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method148(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V", line = 114)
    private static final void method145() {
        field344 = 0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V", line = 117)
    private static final void method146(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field346[arg0];
        int var4 = field346[arg0 + 1];
        int var5 = field346[arg0 + 2];
        int var6 = field346[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field346[var7 + 1];
            if (var8 < var4) {
                field346[var2] = field346[var7];
                field346[var2 + 1] = var8;
                field346[var2 + 2] = field346[var7 + 2];
                field346[var2 + 3] = field346[var7 + 3];
                var2 += 4;
                field346[var7] = field346[var2];
                field346[var7 + 1] = field346[var2 + 1];
                field346[var7 + 2] = field346[var2 + 2];
                field346[var7 + 3] = field346[var2 + 3];
            }
        }
        field346[var2] = var3;
        field346[var2 + 1] = var4;
        field346[var2 + 2] = var5;
        field346[var2 + 3] = var6;
        method146(arg0, var2);
        method146(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lvq;[II)V", line = 161)
    public static final void method147(class269 arg0, int[] arg1, int arg2) {
        method148(arg0, arg1, 0, arg1.length, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lvq;[IIII[I[I)V", line = 168)
    private static final void method148(class269 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method904(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method145();
        method141(arg1, arg2, arg3);
        method143(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method149(var7[3])) {
                    return;
                }
                var8 = field349;
                var9 = field345;
                var10 = field343;
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
            arg0.method990(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)Z", line = 205)
    private static final boolean method149(int arg0) {
        int var1 = field342;
        int var2 = field347;
        int var3 = field343;
        while (var2 >= var1) {
            var3++;
            field343 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field348;
            while (var1 < field344) {
                int var5 = field346[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field346[var1];
                int var7 = field346[var1 + 2];
                int var8 = field346[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field346[var1] = var10;
                field346[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field346[var11 + 3];
                if (var3 >= var12) {
                    field346[var11] = field346[var4];
                    field346[var11 + 1] = field346[var4 + 1];
                    field346[var11 + 2] = field346[var4 + 2];
                    field346[var11 + 3] = field346[var4 + 3];
                    var4 += 4;
                }
            }
            if (field344 == var4) {
                field344 = 0;
                return false;
            }
            method150(var4, var1);
            field348 = var4;
            field342 = var1;
            var2 = var4;
        }
        field349 = field346[var2] >> 16;
        field345 = field346[var2 + 4] >> 16;
        field346[var2] += field346[var2 + 2];
        field346[var2 + 4] += field346[var2 + 6];
        var2 += 8;
        field347 = var2;
        return true;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V", line = 280)
    private static final void method150(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field346[var3 - 4];
                    int var5 = field346[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field346[var3 - 4] = var5;
                        field346[var3] = var4;
                        int var6 = field346[var3 - 2];
                        field346[var3 - 2] = field346[var3 + 2];
                        field346[var3 + 2] = var6;
                        int var7 = field346[var3 - 1];
                        field346[var3 - 1] = field346[var3 + 3];
                        field346[var3 + 3] = var7;
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
