import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class297 extends class261 {

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "Lve;")
    public static class255 field5077 = class87.method607(24, "Angreifen");

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public static int field5088 = 0;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "Loc;")
    public static class135 field5078;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "Lrg;")
    public static class88 field5082;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "[[Ltl;")
    public static class197[][] field5087;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Z)V", line = 9)
    public static void method2086(boolean arg0) {
        field5082 = null;
        field5077 = null;
        if (!arg0) {
            field5090 = 39;
        }
        field5078 = null;
        field5087 = (class197[][]) null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)[[I", line = 31)
    public final int[][] method13(boolean arg0, int arg1) {
        field5083++;
        if (!arg0) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field4418.method35(arg1, 107);
        if (this.field4418.field94) {
            int[] var4 = this.method1822(2, 73, arg1);
            int[][] var5 = this.method1819(112, 0, arg1);
            int[][] var6 = this.method1819(-28, 1, arg1);
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var5[1];
            int[] var11 = var5[0];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var6[0];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class92.field1576; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var8[var16] = var11[var16];
                    var9[var16] = var10[var16];
                    var7[var16] = var12[var16];
                } else if (var17 == 0) {
                    var8[var16] = var14[var16];
                    var9[var16] = var13[var16];
                    var7[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var8[var16] = var11[var16] * var17 + (var14[var16] * var18) >> 12;
                    var9[var16] = var10[var16] * var17 + (var13[var16] * var18) >> 12;
                    var7[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([IZ[III)V", line = 112)
    public static final void method2087(int[] arg0, boolean arg1, int[] arg2, int arg3, int arg4) {
        if (arg3 < arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            int var8 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; var9++) {
                if (arg2[var9] > ((var9 & 0x1) + var7)) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    int var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var8;
            method2087(arg0, false, arg2, arg3, var6 - 1);
            method2087(arg0, false, arg2, var6 + 1, arg4);
        }
        if (arg1) {
            method2092((class70) null, 125);
        }
        field5089++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(SI)Z", line = 166)
    public static final boolean method2088(short arg0, int arg1) {
        field5079++;
        if (arg0 == 9 || arg0 == 22 || arg0 == 39 || arg0 == 28 || arg0 == 20 || arg0 == 29 || arg0 == 58 || arg0 == 43) {
            return true;
        } else if (arg0 == 19 || arg0 == 57 || arg0 == 1003 || arg0 == 1002) {
            return true;
        } else if (arg0 == 13 || arg0 == 36 || arg0 == 32 || arg0 == 5 || arg0 == 44) {
            return true;
        } else {
            if (arg1 <= 118) {
                method2089(-61, -40);
            }
            return arg0 == 37 || arg0 == 45 || arg0 == 51 || arg0 == 49 || arg0 == 18 || arg0 == 12;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lpb;BI)V", line = 192)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        field5080++;
        if (arg1 >= -115) {
            method2091(18);
        }
        if (arg2 == 0) {
            this.field4434 = arg0.method481(0) == 1;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)[I", line = 206)
    public final int[] method21(byte arg0, int arg1) {
        field5081++;
        int var3 = -60 / ((-arg0 - 49) / 33);
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            int[] var5 = this.method1822(0, 75, arg1);
            int[] var6 = this.method1822(1, 75, arg1);
            int[] var7 = this.method1822(2, 11, arg1);
            for (int var8 = 0; var8 < class92.field1576; var8++) {
                int var9 = var7[var8];
                if (var9 == 4096) {
                    var4[var8] = var5[var8];
                } else if (var9 == 0) {
                    var4[var8] = var6[var8];
                } else {
                    var4[var8] = (4096 - var9) * var6[var8] + var5[var8] * var9 >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V", line = 270)
    public static final void method2089(int arg0, int arg1) {
        field5091++;
        if (~arg0 == arg1 && !class148.field2505) {
            class91.method682((byte) 113);
        } else if (arg0 != -1 && (class124.field2070 != arg0 || !class196.method1399((byte) -113)) && class184.field2963 != 0 && !class148.field2505) {
            class285.method2023(arg0, 2, false, class143.field2379, class184.field2963, 1, 0);
        }
        class124.field2070 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V", line = 295)
    public class297() {
        super(3, false);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILrg;)V", line = 299)
    public static final void method2090(int arg0, class88 arg1) {
        field5086++;
        class256.field4372 = arg1.method619(class80.field1301, 20053);
        class308.field5249 = arg1.method619(class22.field346, arg0 + 20053);
        if (arg0 != 0) {
            method2089(29, -50);
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)[Lud;", line = 311)
    public static final class269[] method2091(int arg0) {
        field5085++;
        int var1 = -18 % ((-arg0 - 55) / 41);
        class269[] var2 = new class269[class109.field1850];
        for (int var3 = 0; var3 < class109.field1850; var3++) {
            int var4 = class187.field3027[var3] * class132.field2173[var3];
            byte[] var5 = class282.field4849[var3];
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7] = class18.field296[class154.method1134(255, var5[var7])];
            }
            if (class281.field4827) {
                var2[var3] = new class98(class153.field2608, class154.field2632, class131.field2167[var3], class298.field5098[var3], class132.field2173[var3], class187.field3027[var3], var6);
            } else {
                var2[var3] = new class83(class153.field2608, class154.field2632, class131.field2167[var3], class298.field5098[var3], class132.field2173[var3], class187.field3027[var3], var6);
            }
        }
        class111.method850(-3);
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lpb;I)V", line = 350)
    public static final void method2092(class70 arg0, int arg1) {
        field5092++;
        byte[] var2 = new byte[24];
        if (arg1 != -24763) {
            return;
        }
        if (class2.field28 != null) {
            try {
                class2.field28.method2130(0L, true);
                int var3 = 0;
                class2.field28.method2132(var2, arg1 + 24678);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method484((byte) -103, 0, var2, 24);
    }
}
