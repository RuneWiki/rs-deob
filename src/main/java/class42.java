import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class42 {

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "Lel;")
    private class112 field865;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "Leh;")
    private class158 field856;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "Lgm;")
    private class281 field855;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "[[I")
    public static int[][] field851 = new int[104][104];

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "Lmh;")
    public static class128 field860 = class22.method156(124, ")2");

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "Lbg;")
    private class194 field869;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "[I")
    public static int[] field862;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "[Lfb;")
    public static class55[] field854;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "[Lgf;")
    private class7[] field868;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZLqe;ZLqe;)Lgf;", line = 5)
    private final class7 method284(int arg0, boolean arg1, class177 arg2, boolean arg3, class177 arg4) {
        field867++;
        if (this.field869 == null) {
            throw new RuntimeException();
        }
        this.field869.field3380 = arg0 * 8 + 5;
        if (this.field869.field3380 >= this.field869.field3417.length) {
            throw new RuntimeException();
        } else if (this.field868[arg0] == null) {
            if (!arg3) {
                field854 = (class55[]) null;
            }
            int var6 = this.field869.method1350(false);
            int var7 = this.field869.method1350(false);
            class7 var8 = new class7(arg0, arg2, arg4, this.field865, this.field856, var6, var7, arg1);
            this.field868[arg0] = var8;
            return var8;
        } else {
            return this.field868[arg0];
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BZLac;III[[FI[[I[[I[[FIIF[[FIII)I", line = 50)
    public static final int method285(byte arg0, boolean arg1, class154 arg2, int arg3, int arg4, int arg5, float[][] arg6, int arg7, int[][] arg8, int[][] arg9, float[][] arg10, int arg11, int arg12, float arg13, float[][] arg14, int arg15, int arg16, int arg17) {
        if (arg0 <= 102) {
            field860 = (class128) null;
        }
        field852++;
        if (arg15 == 1) {
            int var19 = arg11;
            arg11 = arg7;
            arg7 = 128 - var19;
        } else if (arg15 == 2) {
            arg7 = 128 - arg7;
            arg11 = 128 - arg11;
        } else if (arg15 == 3) {
            int var18 = arg11;
            arg11 = 128 - arg7;
            arg7 = var18;
        }
        float var20;
        int var21;
        float var22;
        float var23;
        if (arg11 == 0 && arg7 == 0) {
            var20 = arg14[arg17][arg16];
            var21 = arg4;
            var22 = arg6[arg17][arg16];
            var23 = arg10[arg17][arg16];
        } else if (arg11 == 128 && arg7 == 0) {
            var21 = arg3;
            var23 = arg10[arg17 + 1][arg16];
            var22 = arg6[arg17 + 1][arg16];
            var20 = arg14[arg17 + 1][arg16];
        } else if (arg11 == 128 && arg7 == 128) {
            var22 = arg6[arg17 + 1][arg16 + 1];
            var23 = arg10[arg17 + 1][arg16 + 1];
            var20 = arg14[arg17 + 1][arg16 + 1];
            var21 = arg5;
        } else if (arg11 == 0 && arg7 == 128) {
            var21 = arg12;
            var20 = arg14[arg17][arg16 + 1];
            var23 = arg10[arg17][arg16 + 1];
            var22 = arg6[arg17][arg16 + 1];
        } else {
            float var24 = arg14[arg17][arg16];
            float var25 = arg6[arg17][arg16];
            float var26 = (float) arg11 / 128.0F;
            float var27 = arg10[arg17][arg16];
            float var28 = (arg6[arg17 + 1][arg16] - var25) * var26 + var25;
            float var29 = (arg10[arg17 + 1][arg16] - var27) * var26 + var27;
            float var30 = (arg14[arg17 + 1][arg16] - var24) * var26 + var24;
            float var31 = arg14[arg17][arg16 + 1];
            float var32 = arg6[arg17][arg16 + 1];
            float var33 = (float) arg7 / 128.0F;
            float var34 = (arg14[arg17 + 1][arg16 + 1] - var31) * var26 + var31;
            float var35 = (arg6[arg17 + 1][arg16 + 1] - var32) * var26 + var32;
            var22 = (var35 - var28) * var33 + var28;
            float var36 = arg10[arg17][arg16 + 1];
            float var37 = (arg10[arg17 + 1][arg16 + 1] - var36) * var26 + var36;
            var23 = (var37 - var29) * var33 + var29;
            var20 = (var34 - var30) * var33 + var30;
            int var38 = class175.method1206(arg3, arg4, arg11, 1);
            int var39 = class175.method1206(arg5, arg12, arg11, 1);
            var21 = class175.method1206(var39, var38, arg7, 1);
        }
        int var40 = (arg16 << 7) + arg7;
        int var41 = class74.method486(arg11, arg9, 51, arg17, arg16, arg7);
        int var42 = (arg17 << 7) + arg11;
        return arg2.method1026(var42, var41, var40, var20, var23, var22, arg1 ? var21 & 0xFFFFFF00 : var21, arg8 == null ? 0.0F : (float) (var41 - class74.method486(arg11, arg8, 110, arg17, arg16, arg7)) / arg13);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BILqe;Lqe;)Lgf;", line = 160)
    public final class7 method286(byte arg0, int arg1, class177 arg2, class177 arg3) {
        if (arg0 == -101) {
            field864++;
            return this.method284(arg1, true, arg3, true, arg2);
        } else {
            return (class7) null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V", line = 179)
    public static final void method287(int arg0, int arg1) {
        if (arg0 != 128) {
            field860 = (class128) null;
        }
        class37.field744.method1833(arg1, (byte) 76);
        class189.field3288.method1833(arg1, (byte) 99);
        class169.field2936.method1833(arg1, (byte) 92);
        field861++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 199)
    public final void method288(byte arg0) {
        field857++;
        if (this.field868 == null) {
            return;
        }
        if (arg0 != 11) {
            this.field868 = (class7[]) null;
        }
        for (int var2 = 0; var2 < this.field868.length; var2++) {
            if (this.field868[var2] != null) {
                this.field868[var2].method42((byte) -36);
            }
        }
        for (int var3 = 0; var3 < this.field868.length; var3++) {
            if (this.field868[var3] != null) {
                this.field868[var3].method46((byte) -109);
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 242)
    public static final void method289(int arg0) {
        field863++;
        int var1 = 88 / ((-arg0 - 28) / 61);
        class8.field194 = class166.method1085(2048, 0.4F, 8, 35, -13520, 4, 8, true);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V", line = 256)
    public static final void method290(byte arg0) {
        field858++;
        if (arg0 != 127) {
            field851 = (int[][]) ((int[][]) null);
        }
        class50.field985.method1832((byte) 96);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V", line = 271)
    public static final void method291(int arg0) {
        field866++;
        if (arg0 > -72) {
            field862 = (int[]) null;
        }
        class276.field4774.method1834(17);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V", line = 291)
    public static void method292(boolean arg0) {
        field860 = null;
        field854 = null;
        field851 = (int[][]) null;
        if (!arg0) {
            field862 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "()V", line = 309)
    public static final void method293() {
        for (int var0 = 0; var0 < class134.field2335; var0++) {
            class5 var1 = class298.field5087[var0];
            class167.method1094(var1);
            class298.field5087[var0] = null;
        }
        class134.field2335 = 0;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lel;Leh;)V", line = 322)
    public class42(class112 arg0, class158 arg1) {
        this.field865 = arg0;
        this.field856 = arg1;
        if (!this.field865.method674(127)) {
            this.field855 = this.field865.method678(-70, 255, (byte) 0, true, 255);
        }
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(B)Z", line = 336)
    public final boolean method294(byte arg0) {
        field859++;
        if (this.field869 != null) {
            return true;
        }
        if (this.field855 == null) {
            if (this.field865.method674(12)) {
                return false;
            }
            this.field855 = this.field865.method678(-90, 255, (byte) 0, true, 255);
        }
        if (this.field855.field5018) {
            return false;
        } else {
            this.field869 = new class194(this.field855.method1144(100));
            this.field868 = new class7[(this.field869.field3417.length - 5) / 8];
            int var2 = -66 / ((arg0 - 34) / 34);
            return true;
        }
    }
}
