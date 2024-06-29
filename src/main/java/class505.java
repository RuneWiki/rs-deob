import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class505 extends class164 {

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "[I")
    public static int[] field7051 = new int[16];

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    public static int field7053 = 0;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "Ljava/lang/String;")
    public String field7047;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "[C")
    public char[] field7042;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "[C")
    public char[] field7054;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "[I")
    public int[] field7045;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "[I")
    public int[] field7048;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public final void method2922(boolean arg0) {
        field7043++;
        if (arg0) {
            this.field7042 = null;
        }
        if (this.field7045 != null) {
            for (int var2 = 0; var2 < this.field7045.length; var2++) {
                this.field7045[var2] = class242.method1474(this.field7045[var2], 32768);
            }
        }
        if (this.field7048 != null) {
            for (int var3 = 0; var3 < this.field7048.length; var3++) {
                this.field7048[var3] = class242.method1474(this.field7048[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILun;I)V")
    private final void method2923(int arg0, class389 arg1, int arg2) {
        if (arg0 == 1) {
            this.field7047 = arg1.method2244((byte) -125);
        } else if (arg0 == 2) {
            int var4 = arg1.method2229(255);
            this.field7048 = new int[var4];
            this.field7054 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7048[var5] = arg1.method2260(class570.method3340(arg2, 14270));
                byte var6 = arg1.method2249((byte) -70);
                this.field7054[var5] = var6 == 0 ? 0 : class507.method3016((byte) -88, var6);
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method2229(255);
            this.field7045 = new int[var7];
            this.field7042 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field7045[var8] = arg1.method2260(-24);
                byte var9 = arg1.method2249((byte) -70);
                this.field7042[var8] = var9 == 0 ? 0 : class507.method3016((byte) -88, var9);
            }
        }
        if (arg2 == -14307) {
            field7049++;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BC)I")
    public final int method2924(byte arg0, char arg1) {
        field7041++;
        if (this.field7048 == null) {
            return -1;
        }
        if (arg0 <= 112) {
            this.field7054 = null;
        }
        for (int var3 = 0; var3 < this.field7048.length; var3++) {
            if (this.field7054[var3] == arg1) {
                return this.field7048[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(FFIZIFILwfa;IFI[BIF)V")
    public static final void method2925(float arg0, float arg1, int arg2, boolean arg3, int arg4, float arg5, int arg6, class181 arg7, int arg8, float arg9, int arg10, byte[] arg11, int arg12, float arg13) {
        field7044++;
        int var14 = arg2 * arg8;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg4; var16++) {
            arg7.method800(arg13 * 127.0F, arg5 / (float) arg8, arg8, 0, arg9 / (float) arg6, arg6, -1, arg12, arg1 / (float) arg2, arg2, var15);
            int var19 = arg10;
            arg13 = arg0 * arg13;
            for (int var20 = 0; var20 < var14; var20++) {
                arg11[var19] = (byte) ((int) ((float) arg11[var19] + var15[var20]));
                var19++;
            }
            arg1 *= 2.0F;
            arg5 *= 2.0F;
            arg9 *= 2.0F;
        }
        if (!arg3) {
            return;
        }
        int var17 = arg10;
        for (int var18 = 0; var18 < var14; var18++) {
            arg11[var17] = (byte) (arg11[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(CB)I")
    public final int method2926(char arg0, byte arg1) {
        field7046++;
        if (arg1 != 55) {
            this.method2926((char) 65473, (byte) 101);
        }
        if (this.field7045 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field7045.length; var3++) {
            if (this.field7042[var3] == arg0) {
                return this.field7045[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V")
    public static void method2927(int arg0) {
        if (arg0 >= 19) {
            field7051 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBIFIIII[FIFFI)V")
    public static final void method2928(int arg0, byte arg1, int arg2, float arg3, int arg4, int arg5, int arg6, int arg7, float[] arg8, int arg9, float arg10, float arg11, int arg12) {
        int var13 = arg4 - arg7;
        field7050++;
        int var14 = arg2 - arg6;
        int var15 = arg0 - arg5;
        float var16 = arg8[2] * (float) var15 + arg8[1] * (float) var13 + arg8[0] * (float) var14;
        float var17 = arg8[5] * (float) var15 + arg8[3] * (float) var14 + arg8[4] * (float) var13;
        if (arg1 != 55) {
            field7051 = null;
        }
        float var18 = arg8[8] * (float) var15 + arg8[6] * (float) var14 + arg8[7] * (float) var13;
        float var19;
        float var20;
        if (arg12 == 0) {
            var20 = arg11 + var16 + 0.5F;
            var19 = arg3 + 0.5F - var18;
        } else if (arg12 == 1) {
            var19 = arg3 + var18 + 0.5F;
            var20 = arg11 + var16 + 0.5F;
        } else if (arg12 == 2) {
            var19 = arg10 + 0.5F - var17;
            var20 = arg11 + 0.5F - var16;
        } else if (arg12 == 3) {
            var19 = arg10 + 0.5F - var17;
            var20 = arg11 + var16 + 0.5F;
        } else if (arg12 == 4) {
            var20 = arg3 + var18 + 0.5F;
            var19 = arg10 + 0.5F - var17;
        } else {
            var19 = arg10 + 0.5F - var17;
            var20 = arg3 + 0.5F - var18;
        }
        if (arg9 == 1) {
            float var21 = var20;
            var20 = -var19;
            var19 = var21;
        } else if (arg9 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg9 == 3) {
            float var22 = var20;
            var20 = var19;
            var19 = -var22;
        }
        class552.field8017 = var19;
        class151.field1870 = var20;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLun;)V")
    public final void method2929(byte arg0, class389 arg1) {
        while (true) {
            int var3 = arg1.method2229(255);
            if (var3 == 0) {
                field7052++;
                if (arg0 != -105) {
                    method2927(66);
                    return;
                }
                return;
            }
            this.method2923(var3, arg1, arg0 - 14202);
        }
    }
}
