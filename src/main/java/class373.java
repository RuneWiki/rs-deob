import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class373 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    private static int field5104;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    private static int field5105;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    private static int field5106;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    private static int field5107;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    private static int field5109;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    private static int field5110;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    private static int field5111;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "[I")
    private static int[] field5108;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)V", line = 3)
    private static final void method2234(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field5108[var3 - 4];
                    int var5 = field5108[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field5108[var3 - 4] = var5;
                        field5108[var3] = var4;
                        int var6 = field5108[var3 - 2];
                        field5108[var3 - 2] = field5108[var3 + 2];
                        field5108[var3 + 2] = var6;
                        int var7 = field5108[var3 - 1];
                        field5108[var3 - 1] = field5108[var3 + 3];
                        field5108[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()V", line = 40)
    public static void method2235() {
        field5108 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([III)V", line = 46)
    private static final void method2236(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field5111;
        if (field5108 == null || field5108.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field5111; var5++) {
                var4[var5] = field5108[var5];
            }
            field5108 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field5108[field5111++] = arg0[var7];
                field5108[field5111++] = var9;
                field5108[field5111++] = arg0[var8];
                field5108[field5111++] = var10;
            } else if (var10 < var9) {
                field5108[field5111++] = arg0[var8];
                field5108[field5111++] = var10;
                field5108[field5111++] = arg0[var7];
                field5108[field5111++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lha;[II)V", line = 95)
    public static final void method2237(class545 arg0, int[] arg1, int arg2) {
        method2240(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "()V", line = 99)
    private static final void method2238() {
        field5111 = 0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lha;[II[I[I)V", line = 103)
    public static final void method2239(class545 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method2240(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lha;[IIII[I[I)V", line = 109)
    private static final void method2240(class545 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method2163(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method2238();
        method2236(arg1, arg2, arg3);
        method2242(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method2243(var7[3])) {
                    return;
                }
                var8 = field5107;
                var9 = field5109;
                var10 = field5110;
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
            arg0.method2173(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)V", line = 148)
    private static final void method2241(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field5108[arg0];
        int var4 = field5108[arg0 + 1];
        int var5 = field5108[arg0 + 2];
        int var6 = field5108[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field5108[var7 + 1];
            if (var8 < var4) {
                field5108[var2] = field5108[var7];
                field5108[var2 + 1] = var8;
                field5108[var2 + 2] = field5108[var7 + 2];
                field5108[var2 + 3] = field5108[var7 + 3];
                var2 += 4;
                field5108[var7] = field5108[var2];
                field5108[var7 + 1] = field5108[var2 + 1];
                field5108[var7 + 2] = field5108[var2 + 2];
                field5108[var7 + 3] = field5108[var2 + 3];
            }
        }
        field5108[var2] = var3;
        field5108[var2 + 1] = var4;
        field5108[var2 + 2] = var5;
        field5108[var2 + 3] = var6;
        method2241(arg0, var2);
        method2241(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 194)
    private static final void method2242(int arg0) {
        if (field5111 < 0) {
            field5105 = 0;
            field5106 = 0;
            field5104 = 0;
            field5110 = 2147483646;
            return;
        }
        method2241(0, field5111);
        int var1 = field5108[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field5111; var3 += 4) {
            int var4 = field5108[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field5108[var3];
            int var6 = field5108[var3 + 2];
            int var7 = field5108[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field5108[var3] = (var1 - var4) * var8 + var9;
            field5108[var3 + 2] = var8;
        }
        field5104 = var2;
        field5106 = var3;
        field5105 = var3;
        field5110 = var1 - 1;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)Z", line = 240)
    private static final boolean method2243(int arg0) {
        int var1 = field5106;
        int var2 = field5105;
        int var3 = field5110;
        while (var2 >= var1) {
            var3++;
            field5110 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field5104;
            while (var1 < field5111) {
                int var5 = field5108[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field5108[var1];
                int var7 = field5108[var1 + 2];
                int var8 = field5108[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field5108[var1] = var10;
                field5108[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field5108[var11 + 3];
                if (var3 >= var12) {
                    field5108[var11] = field5108[var4];
                    field5108[var11 + 1] = field5108[var4 + 1];
                    field5108[var11 + 2] = field5108[var4 + 2];
                    field5108[var11 + 3] = field5108[var4 + 3];
                    var4 += 4;
                }
            }
            if (field5111 == var4) {
                field5111 = 0;
                return false;
            }
            method2234(var4, var1);
            field5104 = var4;
            field5106 = var1;
            var2 = var4;
        }
        field5107 = field5108[var2] >> 16;
        field5109 = field5108[var2 + 4] >> 16;
        field5108[var2] += field5108[var2 + 2];
        field5108[var2 + 4] += field5108[var2 + 6];
        var2 += 8;
        field5105 = var2;
        return true;
    }
}
