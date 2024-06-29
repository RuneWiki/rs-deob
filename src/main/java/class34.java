import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class34 {

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    private static int field507;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    private static int field508;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    private static int field510;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    private static int field511;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    private static int field512;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    private static int field513;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    private static int field514;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "[I")
    private static int[] field509;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V", line = 5)
    private static final void method250(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field509[arg0];
        int var4 = field509[arg0 + 1];
        int var5 = field509[arg0 + 2];
        int var6 = field509[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field509[var7 + 1];
            if (var8 < var4) {
                field509[var2] = field509[var7];
                field509[var2 + 1] = var8;
                field509[var2 + 2] = field509[var7 + 2];
                field509[var2 + 3] = field509[var7 + 3];
                var2 += 4;
                field509[var7] = field509[var2];
                field509[var7 + 1] = field509[var2 + 1];
                field509[var7 + 2] = field509[var2 + 2];
                field509[var7 + 3] = field509[var2 + 3];
            }
        }
        field509[var2] = var3;
        field509[var2 + 1] = var4;
        field509[var2 + 2] = var5;
        field509[var2 + 3] = var6;
        method250(arg0, var2);
        method250(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()V", line = 53)
    private static final void method251() {
        if (field513 < 0) {
            field507 = 0;
            field512 = 0;
            field510 = 0;
            field511 = 2147483646;
            return;
        }
        method250(0, field513);
        int var0 = field509[1];
        if (var0 < class205.field3006) {
            var0 = class205.field3006;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field513; var2 += 4) {
            int var3 = field509[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field509[var2];
            int var5 = field509[var2 + 2];
            int var6 = field509[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field509[var2] = (var0 - var3) * var7 + var8;
            field509[var2 + 2] = var7;
        }
        field510 = var1;
        field512 = var2;
        field507 = var2;
        field511 = var0 - 1;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([III[I[I)V", line = 101)
    public static final void method252(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method258(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II[I[I)V", line = 104)
    private static final void method253(int arg0, int arg1, int[] arg2, int[] arg3) {
        method251();
        while (true) {
            int var4;
            int var5;
            int var6;
            do {
                if (!method259()) {
                    return;
                }
                var4 = field508;
                var5 = field514;
                var6 = field511;
                if (arg2 == null) {
                    break;
                }
                int var7 = var6 - class205.field3006;
                if (var4 < arg2[var7] + class205.field3004) {
                    var4 = arg2[var7] + class205.field3004;
                }
                if (var5 > arg2[var7] + arg3[var7] + class205.field3004) {
                    var5 = arg2[var7] + arg3[var7] + class205.field3004;
                }
            } while (var4 >= var5);
            class205.method1498(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([III)V", line = 140)
    private static final void method254(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field513;
        if (field509 == null || field509.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field513; var5++) {
                var4[var5] = field509[var5];
            }
            field509 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field509[field513++] = arg0[var7];
                field509[field513++] = var9;
                field509[field513++] = arg0[var8];
                field509[field513++] = var10;
            } else if (var10 < var9) {
                field509[field513++] = arg0[var8];
                field509[field513++] = var10;
                field509[field513++] = arg0[var7];
                field509[field513++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "()V", line = 190)
    private static final void method255() {
        field513 = 0;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V", line = 195)
    private static final void method256(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field509[var3 - 4];
                    int var5 = field509[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field509[var3 - 4] = var5;
                        field509[var3] = var4;
                        int var6 = field509[var3 - 2];
                        field509[var3 - 2] = field509[var3 + 2];
                        field509[var3 + 2] = var6;
                        int var7 = field509[var3 - 1];
                        field509[var3 - 1] = field509[var3 + 3];
                        field509[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "()V", line = 232)
    public static void method257() {
        field509 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([IIIII[I[I)V", line = 239)
    private static final void method258(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class205.field3003 - class205.field3006 != arg5.length) {
            throw new IllegalStateException();
        }
        method255();
        method254(arg0, arg1, arg2);
        method253(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "()Z", line = 248)
    private static final boolean method259() {
        int var0 = field512;
        int var1 = field507;
        int var2 = field511;
        while (var1 >= var0) {
            var2++;
            field511 = var2;
            if (var2 >= class205.field3003) {
                return false;
            }
            int var3 = field510;
            while (var0 < field513) {
                int var4 = field509[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field509[var0];
                int var6 = field509[var0 + 2];
                int var7 = field509[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field509[var0] = var9;
                field509[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field509[var10 + 3];
                if (var2 >= var11) {
                    field509[var10] = field509[var3];
                    field509[var10 + 1] = field509[var3 + 1];
                    field509[var10 + 2] = field509[var3 + 2];
                    field509[var10 + 3] = field509[var3 + 3];
                    var3 += 4;
                }
            }
            if (field513 == var3) {
                field513 = 0;
                return false;
            }
            method256(var3, var0);
            field510 = var3;
            field512 = var0;
            var1 = var3;
        }
        field508 = field509[var1] >> 16;
        field514 = field509[var1 + 4] >> 16;
        field509[var1] += field509[var1 + 2];
        field509[var1 + 4] += field509[var1 + 6];
        var1 += 8;
        field507 = var1;
        return true;
    }
}
