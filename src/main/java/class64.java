import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class64 extends class285 {

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
    private int field923 = 4;

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
    private int field927 = 4;

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "Ljava/lang/String;")
    public static String field925 = "Use";

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "[S")
    public static short[] field920 = new short[] { 9, 36, 24, 7, 30, 19, 60, 34 };

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
    public static int field926 = 0;

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "Z")
    public static boolean field930 = false;

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "F")
    public static float field931 = 0.0F;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "Lgf;")
    public static class140 field922;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)[I", line = 4)
    public final int[] method60(boolean arg0, int arg1) {
        field924++;
        if (!arg0) {
            method433(14, -49);
        }
        int[] var3 = this.field4573.method1116(104, arg1);
        if (this.field4573.field2420) {
            int var4 = class287.field4599 / this.field923;
            int var5 = class27.field372 / this.field927;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method2048(0, (byte) 125, class27.field372 * var6 / var5);
            } else {
                var7 = this.method2048(0, (byte) 127, 0);
            }
            for (int var8 = 0; var8 < class287.field4599; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class287.field4599 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIILj;IJ)Z", line = 59)
    public static final boolean method429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class7 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class126.method915(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)[[I", line = 75)
    public final int[][] method62(byte arg0, int arg1) {
        if (arg0 < 121) {
            field930 = false;
        }
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        field928++;
        if (this.field4564.field3529) {
            int var4 = class287.field4599 / this.field923;
            int var5 = class27.field372 / this.field927;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method2053((byte) 97, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method2053((byte) -83, 0, class27.field372 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var3[0];
            int[] var11 = var6[2];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class287.field4599; var14++) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class287.field4599 * var16 / var4;
                }
                var10[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var11[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[Lrc;)V", line = 139)
    public static final void method430(int arg0, class206[] arg1) {
        class281.field4530[arg0] = arg1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([IIIIII)V", line = 143)
    public static final void method431(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class204 var6 = class324.field5032[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class31 var7 = var6.field3344;
        if (var7 != null) {
            int var8 = var7.field415;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class104 var10 = var6.field3357;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1526;
        int var12 = var10.field1527;
        int var13 = var10.field1521;
        int var14 = var10.field1516;
        int[] var15 = class315.field4882[var11];
        int[] var16 = class263.field4243[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)V", line = 235)
    public static void method432(byte arg0) {
        field920 = null;
        if (arg0 != -39) {
            method431((int[]) null, -28, 78, -32, -71, 61);
        }
        field922 = null;
        field925 = null;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V", line = 248)
    public static final void method433(int arg0, int arg1) {
        field929++;
        if (arg0 != -153) {
            method432((byte) 30);
        }
        class21.field301.method708(arg1, true);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 263)
    public class64() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLjj;I)V", line = 267)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        field921++;
        if (arg2 == 0) {
            this.field923 = arg1.method286((byte) -75);
        } else if (arg2 == 1) {
            this.field927 = arg1.method286((byte) -114);
        }
        if (!arg0) {
            field930 = false;
        }
    }
}
