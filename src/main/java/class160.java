import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class160 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    private static int field2610;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    private static int field2611;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    private static int field2612;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    private static int field2613;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    private static int field2615;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    private static int field2616;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    private static int field2617;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "[I")
    private static int[] field2614;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
    private static final void method1093(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2614[arg0];
        int var4 = field2614[arg0 + 1];
        int var5 = field2614[arg0 + 2];
        int var6 = field2614[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2614[var7 + 1];
            if (var8 < var4) {
                field2614[var2] = field2614[var7];
                field2614[var2 + 1] = var8;
                field2614[var2 + 2] = field2614[var7 + 2];
                field2614[var2 + 3] = field2614[var7 + 3];
                var2 += 4;
                field2614[var7] = field2614[var2];
                field2614[var7 + 1] = field2614[var2 + 1];
                field2614[var7 + 2] = field2614[var2 + 2];
                field2614[var7 + 3] = field2614[var2 + 3];
            }
        }
        field2614[var2] = var3;
        field2614[var2 + 1] = var4;
        field2614[var2 + 2] = var5;
        field2614[var2 + 3] = var6;
        method1093(arg0, var2);
        method1093(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()V")
    private static final void method1094() {
        field2610 = 0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([III)V")
    private static final void method1095(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2610;
        if (field2614 == null || field2614.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2610; var5++) {
                var4[var5] = field2614[var5];
            }
            field2614 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2614[field2610++] = arg0[var7];
                field2614[field2610++] = var9;
                field2614[field2610++] = arg0[var8];
                field2614[field2610++] = var10;
            } else if (var10 < var9) {
                field2614[field2610++] = arg0[var8];
                field2614[field2610++] = var10;
                field2614[field2610++] = arg0[var7];
                field2614[field2610++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[I[I)V")
    private static final void method1096(int arg0, int arg1, int[] arg2, int[] arg3) {
        method1097();
        while (method1098()) {
            int var4 = field2613;
            int var5 = field2611;
            int var6 = field2612;
            if (arg2 != null) {
                int var7 = var6 - class94.field1501;
                if (var4 < arg2[var7] + class94.field1500) {
                    var4 = arg2[var7] + class94.field1500;
                }
                if (var5 > arg2[var7] + arg3[var7] + class94.field1500) {
                    var5 = arg2[var7] + arg3[var7] + class94.field1500;
                }
            }
            class94.method679(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "()V")
    private static final void method1097() {
        if (field2610 < 0) {
            field2616 = 0;
            field2617 = 0;
            field2615 = 0;
            field2612 = 2147483646;
            return;
        }
        method1093(0, field2610);
        int var0 = field2614[1];
        if (var0 < class94.field1501) {
            var0 = class94.field1501;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field2610; var2 += 4) {
            int var3 = field2614[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field2614[var2];
            int var5 = field2614[var2 + 2];
            int var6 = field2614[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field2614[var2] = (var0 - var3) * var7 + var8;
            field2614[var2 + 2] = var7;
        }
        field2615 = var1;
        field2617 = var2;
        field2616 = var2;
        field2612 = var0 - 1;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "()Z")
    private static final boolean method1098() {
        int var0 = field2617;
        int var1 = field2616;
        int var2 = field2612;
        while (var1 >= var0) {
            var2++;
            field2612 = var2;
            if (var2 >= class94.field1494) {
                return false;
            }
            int var3 = field2615;
            while (var0 < field2610) {
                int var4 = field2614[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field2614[var0];
                int var6 = field2614[var0 + 2];
                int var7 = field2614[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field2614[var0] = var9;
                field2614[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field2614[var10 + 3];
                if (var2 >= var11) {
                    field2614[var10] = field2614[var3];
                    field2614[var10 + 1] = field2614[var3 + 1];
                    field2614[var10 + 2] = field2614[var3 + 2];
                    field2614[var10 + 3] = field2614[var3 + 3];
                    var3 += 4;
                }
            }
            if (field2610 == var3) {
                field2610 = 0;
                return false;
            }
            method1102(var3, var0);
            field2615 = var3;
            field2617 = var0;
            var1 = var3;
        }
        field2613 = field2614[var1] >> 16;
        field2611 = field2614[var1 + 4] >> 16;
        field2614[var1] += field2614[var1 + 2];
        field2614[var1 + 4] += field2614[var1 + 6];
        var1 += 8;
        field2616 = var1;
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "([III)V")
    public static final void method1099(int[] arg0, int arg1, int arg2) {
        method1100(arg0, 0, arg0.length, arg1, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([IIIII[I[I)V")
    private static final void method1100(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class94.field1494 - class94.field1501 != arg5.length) {
            throw new IllegalStateException();
        }
        method1094();
        method1095(arg0, arg1, arg2);
        method1096(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([III[I[I)V")
    public static final void method1101(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method1100(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)V")
    private static final void method1102(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2614[var3 - 4];
                    int var5 = field2614[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2614[var3 - 4] = var5;
                        field2614[var3] = var4;
                        int var6 = field2614[var3 - 2];
                        field2614[var3 - 2] = field2614[var3 + 2];
                        field2614[var3 + 2] = var6;
                        int var7 = field2614[var3 - 1];
                        field2614[var3 - 1] = field2614[var3 + 3];
                        field2614[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "()V")
    public static void method1103() {
        field2614 = null;
    }
}
