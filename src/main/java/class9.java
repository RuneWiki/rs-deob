import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class9 {

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Lad;")
    private class122 field149 = new class122();

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "[I")
    public static int[] field137 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Lqd;")
    public static class40 field142 = class147.method1106("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", (byte) -57);

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "[Laf;")
    public static class171[] field146 = new class171[50];

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Lqd;")
    public static class40 field148 = class147.method1106("Starte 3D)2Softwarebibliothek)3", (byte) -95);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Lad;")
    private class122 field151;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)Lad;", line = 13)
    public final class122 method48(int arg0) {
        class122 var2 = this.field149.field2123;
        field141++;
        if (this.field149 == var2) {
            return null;
        }
        if (arg0 != 1) {
            field142 = (class40) null;
        }
        var2.method921(2);
        return var2;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)Lad;", line = 33)
    public final class122 method49(byte arg0) {
        if (arg0 < 121) {
            method57(-24, 6, 24, -55, -58, 105, -94, -32, -110, -114, 24, -87, -85, 79, -25, -8, -66, 88, 21, -12);
        }
        field138++;
        class122 var2 = this.field149.field2123;
        if (this.field149 == var2) {
            this.field151 = null;
            return null;
        } else {
            this.field151 = var2.field2123;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)V", line = 54)
    public static final void method50(boolean arg0, int arg1) {
        field144++;
        class56.field1080 = 99;
        class194.field3122 = new int[104];
        class237.field3894 = new int[104];
        class235.field3853 = new int[arg1];
        class120.field2038 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class252.field4188 = new int[var2][105][105];
        class89.field1609 = new byte[var2][104][104];
        class205.field3270 = new byte[var2][104][104];
        class252.field4178 = new int[104];
        class104.field1845 = new byte[var2][105][105];
        class312.field5261 = new byte[var2][104][104];
        class80.field1399 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)I", line = 82)
    public final int method51(int arg0) {
        field135++;
        int var2 = 0;
        class122 var3 = this.field149.field2123;
        while (this.field149 != var3) {
            var3 = var3.field2123;
            var2++;
        }
        if (arg0 != -4) {
            this.field151 = (class122) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V", line = 109)
    public static final void method52(int arg0, int arg1, int arg2) {
        if (arg2 != -24853) {
            method58((byte) 116);
        }
        class142.field2378 = class59.field1140[arg1][arg0].field3609;
        field145++;
        class197.field3168 = class59.field1140[arg1][arg0].field3615;
        class233.field3839 = class59.field1140[arg1][arg0].field3617;
        class273.method1891((float) class142.field2378, (float) class197.field3168, (float) class233.field3839);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIZI[[IZLwe;II[[FI[[IIII[[F[[FF)I", line = 125)
    public static final int method53(int arg0, int arg1, boolean arg2, int arg3, int[][] arg4, boolean arg5, class47 arg6, int arg7, int arg8, float[][] arg9, int arg10, int[][] arg11, int arg12, int arg13, int arg14, float[][] arg15, float[][] arg16, float arg17) {
        field150++;
        if (arg1 == 1) {
            int var19 = arg12;
            arg12 = arg8;
            arg8 = 128 - var19;
        } else if (arg1 == 2) {
            arg8 = 128 - arg8;
            arg12 = 128 - arg12;
        } else if (arg1 == 3) {
            int var18 = arg12;
            arg12 = 128 - arg8;
            arg8 = var18;
        }
        float var20;
        int var21;
        float var22;
        float var23;
        if (arg12 == 0 && arg8 == 0) {
            var20 = arg15[arg3][arg13];
            var21 = arg0;
            var22 = arg9[arg3][arg13];
            var23 = arg16[arg3][arg13];
        } else if (arg12 == 128 && arg8 == 0) {
            var20 = arg15[arg3 + 1][arg13];
            var22 = arg9[arg3 + 1][arg13];
            var21 = arg7;
            var23 = arg16[arg3 + 1][arg13];
        } else if (arg12 == 128 && arg8 == 128) {
            var20 = arg15[arg3 + 1][arg13 + 1];
            var23 = arg16[arg3 + 1][arg13 + 1];
            var21 = arg14;
            var22 = arg9[arg3 + 1][arg13 + 1];
        } else if (arg12 == 0 && arg8 == 128) {
            var23 = arg16[arg3][arg13 + 1];
            var20 = arg15[arg3][arg13 + 1];
            var21 = arg10;
            var22 = arg9[arg3][arg13 + 1];
        } else {
            float var24 = arg16[arg3][arg13];
            float var25 = arg15[arg3][arg13];
            float var26 = (float) arg8 / 128.0F;
            float var27 = arg15[arg3][arg13 + 1];
            float var28 = arg9[arg3][arg13];
            float var29 = arg9[arg3][arg13 + 1];
            float var30 = arg16[arg3][arg13 + 1];
            float var31 = (float) arg12 / 128.0F;
            float var32 = (arg15[arg3 + 1][arg13] - var25) * var31 + var25;
            float var33 = (arg9[arg3 + 1][arg13] - var28) * var31 + var28;
            float var34 = (arg16[arg3 + 1][arg13] - var24) * var31 + var24;
            float var35 = (arg9[arg3 + 1][arg13 + 1] - var29) * var31 + var29;
            var22 = (var35 - var33) * var26 + var33;
            float var36 = (arg15[arg3 + 1][arg13 + 1] - var27) * var31 + var27;
            var20 = (var36 - var32) * var26 + var32;
            float var37 = (arg16[arg3 + 1][arg13 + 1] - var30) * var31 + var30;
            int var38 = class310.method2120(arg7, arg0, arg12, (byte) 63);
            var23 = (var37 - var34) * var26 + var34;
            int var39 = class310.method2120(arg14, arg10, arg12, (byte) -128);
            var21 = class310.method2120(var39, var38, arg8, (byte) -41);
        }
        if (arg2) {
            field137 = (int[]) null;
        }
        int var40 = (arg3 << 7) + arg12;
        int var41 = class140.method1038(arg12, arg11, 0, arg8, arg13, arg3);
        int var42 = (arg13 << 7) + arg8;
        return arg6.method422(var40, var41, var42, var20, var23, var22, arg5 ? var21 & 0xFFFFFF00 : var21, arg4 == null ? 0.0F : (float) (var41 - class140.method1038(arg12, arg4, 0, arg8, arg13, arg3)) / arg17);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)Lad;", line = 242)
    public final class122 method54(int arg0) {
        field136++;
        class122 var2 = this.field151;
        if (this.field149 == var2) {
            this.field151 = null;
            return null;
        }
        this.field151 = var2.field2123;
        if (arg0 != 0) {
            this.method49((byte) 116);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lad;I)V", line = 263)
    public final void method55(class122 arg0, int arg1) {
        if (arg0.field2115 != null) {
            arg0.method921(2);
        }
        arg0.field2123 = this.field149;
        field139++;
        arg0.field2115 = this.field149.field2115;
        arg0.field2115.field2123 = arg0;
        arg0.field2123.field2115 = arg0;
        if (arg1 < 90) {
            this.method48(-85);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V", line = 294)
    public final void method56(byte arg0) {
        while (true) {
            class122 var2 = this.field149.field2123;
            if (this.field149 == var2) {
                if (arg0 < 90) {
                    method58((byte) -115);
                }
                field143++;
                this.field151 = null;
                return;
            }
            var2.method921(2);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 315)
    public static final void method57(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class30 var20 = new class30(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class93.field1690[var21][arg1][arg2] == null) {
                    class93.field1690[var21][arg1][arg2] = new class14(var21, arg1, arg2);
                }
            }
            class93.field1690[arg0][arg1][arg2].field220 = var20;
        } else if (arg3 == 1) {
            class30 var22 = new class30(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class93.field1690[var23][arg1][arg2] == null) {
                    class93.field1690[var23][arg1][arg2] = new class14(var23, arg1, arg2);
                }
            }
            class93.field1690[arg0][arg1][arg2].field220 = var22;
        } else {
            class113 var24 = new class113(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class93.field1690[var25][arg1][arg2] == null) {
                    class93.field1690[var25][arg1][arg2] = new class14(var25, arg1, arg2);
                }
            }
            class93.field1690[arg0][arg1][arg2].field231 = var24;
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V", line = 379)
    public static void method58(byte arg0) {
        field142 = null;
        field137 = null;
        if (arg0 > 35) {
            field148 = null;
            field146 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V", line = 398)
    public class9() {
        this.field149.field2115 = this.field149;
        this.field149.field2123 = this.field149;
    }
}
