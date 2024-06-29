import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class295 extends class306 {

    @OriginalMember(owner = "client!ho", name = "L", descriptor = "[I")
    private int[] field4639 = new int[3];

    @OriginalMember(owner = "client!ho", name = "J", descriptor = "I")
    private int field4637 = 4096;

    @OriginalMember(owner = "client!ho", name = "S", descriptor = "I")
    private int field4646 = 3216;

    @OriginalMember(owner = "client!ho", name = "R", descriptor = "I")
    private int field4645 = 3216;

    @OriginalMember(owner = "client!ho", name = "N", descriptor = "I")
    public static int field4641 = 0;

    @OriginalMember(owner = "client!ho", name = "P", descriptor = "Ljava/lang/String;")
    public static String field4643 = "slide:";

    @OriginalMember(owner = "client!ho", name = "H", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!ho", name = "I", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!ho", name = "K", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!ho", name = "M", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!ho", name = "O", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!ho", name = "Q", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!ho", name = "T", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!ho", name = "U", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)V", line = 6)
    private final void method2095(int arg0) {
        field4638++;
        double var2 = Math.cos((double) ((float) this.field4645 / 4096.0F));
        this.field4639[0] = (int) (var2 * 4096.0D * Math.sin((double) ((float) this.field4646 / 4096.0F)));
        this.field4639[1] = (int) (var2 * 4096.0D * Math.cos((double) ((float) this.field4646 / 4096.0F)));
        this.field4639[2] = (int) (Math.sin((double) ((float) this.field4645 / 4096.0F)) * 4096.0D);
        int var4 = this.field4639[1] * this.field4639[1] >> 12;
        int var5 = -91 / ((arg0 - 21) / 46);
        int var6 = this.field4639[2] * this.field4639[2] >> 12;
        int var7 = this.field4639[0] * this.field4639[0] >> 12;
        int var8 = (int) (Math.sqrt((double) (var4 + var6 + var7 >> 12)) * 4096.0D);
        if (var8 != 0) {
            this.field4639[0] = (this.field4639[0] << 12) / var8;
            this.field4639[1] = (this.field4639[1] << 12) / var8;
            this.field4639[2] = (this.field4639[2] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)[I", line = 37)
    public final int[] method47(int arg0, int arg1) {
        field4640++;
        if (arg1 != -1546337535) {
            this.method2095(33);
        }
        int[] var3 = this.field4757.method903(arg0, arg1 + 1546337462);
        if (this.field4757.field1898) {
            int var4 = class143.field2282 * this.field4637 >> 12;
            int[] var5 = this.method2161(arg0 - 1 & class56.field663, (byte) 125, 0);
            int[] var6 = this.method2161(arg0, (byte) 121, 0);
            int[] var7 = this.method2161(class56.field663 & arg0 + 1, (byte) 126, 0);
            for (int var8 = 0; var8 < class31.field367; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[class311.field4878 & var8 - 1] - var6[class311.field4878 & var8 + 1]) * var4 >> 12;
                int var11 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class241.field3694[((var11 + 1) * var11 >> 1) + var12] & 0xFF;
                int var14 = var13 * 4096 >> 8;
                int var15 = this.field4639[2] * var14 >> 12;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field4639[0] * var16 >> 12;
                int var18 = var9 * var13 >> 8;
                int var19 = this.field4639[1] * var18 >> 12;
                var3[var8] = var15 + var19 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)V", line = 108)
    public static final void method2096(int arg0) {
        class331.field5307 = arg0;
        for (int var1 = 0; var1 < class236.field3633; var1++) {
            for (int var2 = 0; var2 < class293.field4607; var2++) {
                if (class194.field2947[arg0][var1][var2] == null) {
                    class194.field2947[arg0][var1][var2] = new class196(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILlf;I)V", line = 131)
    public final void method45(int arg0, class143 arg1, int arg2) {
        field4648++;
        if (arg2 == 0) {
            this.field4637 = arg1.method1051(1);
        } else if (arg2 == 1) {
            this.field4646 = arg1.method1051(arg0 + 15335);
        } else if (arg2 == 2) {
            this.field4645 = arg1.method1051(1);
        }
        if (arg0 != -15334) {
            method2099((int[][]) ((int[][]) null), (class175) null, (byte) -1, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), 108, 46, -49, true, (float[][]) ((float[][]) null), 39, -34, 53, (byte) 93, 15, 62);
        }
    }

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "(I)V", line = 174)
    public static void method2097(int arg0) {
        field4643 = null;
        int var1 = 109 % ((-arg0 - 6) / 32);
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V", line = 188)
    public class295() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(B)V", line = 193)
    public final void method43(byte arg0) {
        field4636++;
        this.method2095(-58);
        if (arg0 >= -103) {
            field4643 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)Ljava/lang/String;", line = 219)
    public static final String method2098(int arg0, int arg1, int arg2) {
        int var3 = arg2 - arg0;
        field4644++;
        if (var3 < -9) {
            return "<col=ff0000>";
        }
        if (arg1 < 18) {
            field4642 = -79;
        }
        if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 <= 0) {
            return "<col=ffff00>";
        } else {
            return "<col=c0ff00>";
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "([[ILwb;B[[F[[FIIIZ[[FIIIBII)V", line = 265)
    public static final void method2099(int[][] arg0, class175 arg1, byte arg2, float[][] arg3, float[][] arg4, int arg5, int arg6, int arg7, boolean arg8, float[][] arg9, int arg10, int arg11, int arg12, byte arg13, int arg14, int arg15) {
        field4635++;
        int var16 = (arg12 << 8) + 255;
        int var17 = (arg15 << 8) + 255;
        int var18 = (arg14 << 8) + 255;
        int var19 = (arg7 << 8) + 255;
        int[] var20 = class279.field4400[arg13];
        int[] var21 = null;
        int[] var22 = new int[var20.length >> 1];
        for (int var23 = arg10; var23 < var22.length; var23++) {
            var22[var23] = class247.method1755(arg4, arg2, var16, arg9, var20[var23 + var23], arg0, (byte) 110, var17, var18, arg3, 0.0F, arg5, arg1, false, var20[var23 + var23 + 1], (int[][]) null, var19, arg6);
        }
        if (arg8) {
            if (arg13 == 1) {
                var21 = new int[6];
                int var25 = class247.method1755(arg4, arg2, var16, arg9, 64, arg0, (byte) 95, var17, var18, arg3, 0.0F, arg5, arg1, true, 128, (int[][]) null, var19, arg6);
                int var26 = class247.method1755(arg4, arg2, var16, arg9, 128, arg0, (byte) 120, var17, var18, arg3, 0.0F, arg5, arg1, true, 64, (int[][]) null, var19, arg6);
                var21[2] = var22[2];
                var21[5] = var22[2];
                var21[0] = var26;
                var21[3] = var25;
                var21[1] = var25;
                var21[4] = var22[0];
            } else if (arg13 == 2) {
                var21 = new int[6];
                int var42 = class247.method1755(arg4, arg2, var16, arg9, 128, arg0, (byte) 126, var17, var18, arg3, 0.0F, arg5, arg1, true, 128, (int[][]) null, var19, arg6);
                int var43 = class247.method1755(arg4, arg2, var16, arg9, 64, arg0, (byte) 110, var17, var18, arg3, 0.0F, arg5, arg1, true, 0, (int[][]) null, var19, arg6);
                var21[2] = var42;
                var21[1] = var43;
                var21[4] = var22[1];
                var21[0] = var22[0];
                var21[3] = var42;
                var21[5] = var22[0];
            } else if (arg13 == 3) {
                var21 = new int[6];
                int var40 = class247.method1755(arg4, arg2, var16, arg9, 0, arg0, (byte) 84, var17, var18, arg3, 0.0F, arg5, arg1, true, 128, (int[][]) null, var19, arg6);
                int var41 = class247.method1755(arg4, arg2, var16, arg9, 64, arg0, (byte) 98, var17, var18, arg3, 0.0F, arg5, arg1, true, 0, (int[][]) null, var19, arg6);
                var21[1] = var22[1];
                var21[4] = var41;
                var21[3] = var40;
                var21[0] = var22[2];
                var21[2] = var40;
                var21[5] = var22[2];
            } else if (arg13 == 4) {
                int var27 = class247.method1755(arg4, arg2, var16, arg9, 0, arg0, (byte) 109, var17, var18, arg3, 0.0F, arg5, arg1, true, 128, (int[][]) null, var19, arg6);
                var21 = new int[] { var22[3], var27, var22[0] };
            } else if (arg13 == 5) {
                var21 = new int[3];
                int var39 = class247.method1755(arg4, arg2, var16, arg9, 128, arg0, (byte) 115, var17, var18, arg3, 0.0F, arg5, arg1, true, 128, (int[][]) null, var19, arg6);
                var21[0] = var22[2];
                var21[1] = var39;
                var21[2] = var22[3];
            } else if (arg13 == 6) {
                var21 = new int[6];
                int var37 = class247.method1755(arg4, arg2, var16, arg9, 128, arg0, (byte) 76, var17, var18, arg3, 0.0F, arg5, arg1, true, 0, (int[][]) null, var19, arg6);
                int var38 = class247.method1755(arg4, arg2, var16, arg9, 128, arg0, (byte) 88, var17, var18, arg3, 0.0F, arg5, arg1, true, 128, (int[][]) null, var19, arg6);
                var21[2] = var38;
                var21[1] = var37;
                var21[0] = var22[3];
                var21[3] = var38;
                var21[4] = var22[0];
                var21[5] = var22[3];
            } else if (arg13 == 7) {
                var21 = new int[6];
                int var28 = class247.method1755(arg4, arg2, var16, arg9, 0, arg0, (byte) 126, var17, var18, arg3, 0.0F, arg5, arg1, true, 128, (int[][]) null, var19, arg6);
                int var29 = class247.method1755(arg4, arg2, var16, arg9, 128, arg0, (byte) 112, var17, var18, arg3, 0.0F, arg5, arg1, true, 0, (int[][]) null, var19, arg6);
                var21[3] = var28;
                var21[0] = var22[1];
                var21[2] = var28;
                var21[1] = var29;
                var21[5] = var22[1];
                var21[4] = var22[2];
            } else if (arg13 == 8) {
                var21 = new int[3];
                int var30 = class247.method1755(arg4, arg2, var16, arg9, 0, arg0, (byte) 102, var17, var18, arg3, 0.0F, arg5, arg1, true, 0, (int[][]) null, var19, arg6);
                var21[1] = var30;
                var21[0] = var22[3];
                var21[2] = var22[4];
            } else if (arg13 == 9) {
                var21 = new int[15];
                int var31 = class247.method1755(arg4, arg2, var16, arg9, 128, arg0, (byte) 84, var17, var18, arg3, 0.0F, arg5, arg1, true, 64, (int[][]) null, var19, arg6);
                int var32 = class247.method1755(arg4, arg2, var16, arg9, 96, arg0, (byte) 92, var17, var18, arg3, 0.0F, arg5, arg1, true, 32, (int[][]) null, var19, arg6);
                int var33 = class247.method1755(arg4, arg2, var16, arg9, 64, arg0, (byte) 109, var17, var18, arg3, 0.0F, arg5, arg1, true, 0, (int[][]) null, var19, arg6);
                var21[2] = var22[4];
                var21[4] = var22[4];
                var21[3] = var32;
                var21[12] = var32;
                var21[10] = var22[2];
                var21[9] = var32;
                var21[5] = var22[3];
                var21[14] = var33;
                var21[0] = var32;
                var21[7] = var22[3];
                var21[1] = var31;
                var21[13] = var22[1];
                var21[8] = var22[2];
                var21[11] = var22[1];
                var21[6] = var32;
            } else if (arg13 == 10) {
                int var36 = class247.method1755(arg4, arg2, var16, arg9, 0, arg0, (byte) 98, var17, var18, arg3, 0.0F, arg5, arg1, true, 128, (int[][]) null, var19, arg6);
                var21 = new int[] { var22[2], var36, var22[3], var22[3], var36, var22[4], var22[4], var36, var22[0] };
            } else if (arg13 == 11) {
                var21 = new int[12];
                int var34 = class247.method1755(arg4, arg2, var16, arg9, 0, arg0, (byte) 78, var17, var18, arg3, 0.0F, arg5, arg1, true, 64, (int[][]) null, var19, arg6);
                int var35 = class247.method1755(arg4, arg2, var16, arg9, 128, arg0, (byte) 108, var17, var18, arg3, 0.0F, arg5, arg1, true, 64, (int[][]) null, var19, arg6);
                var21[11] = var35;
                var21[1] = var34;
                var21[7] = var35;
                var21[5] = var34;
                var21[8] = var34;
                var21[10] = var22[1];
                var21[0] = var22[3];
                var21[3] = var22[3];
                var21[2] = var22[0];
                var21[9] = var22[2];
                var21[6] = var22[2];
                var21[4] = var22[2];
            }
        }
        arg1.method1221(arg11, arg5, arg6, var22, var21, false);
    }
}
