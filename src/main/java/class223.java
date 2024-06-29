import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class223 extends class115 {

    @OriginalMember(owner = "client!br", name = "N", descriptor = "Z")
    private boolean field3045 = true;

    @OriginalMember(owner = "client!br", name = "P", descriptor = "Z")
    private boolean field3047 = true;

    @OriginalMember(owner = "client!br", name = "T", descriptor = "I")
    public static int field3051 = -1;

    @OriginalMember(owner = "client!br", name = "S", descriptor = "I")
    public static int field3050 = 1;

    @OriginalMember(owner = "client!br", name = "L", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!br", name = "M", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!br", name = "O", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!br", name = "Q", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!br", name = "R", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!br", name = "U", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!br", name = "V", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!br", name = "K", descriptor = "Ljava/awt/Frame;")
    public static Frame field3042;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)[[I", line = 4)
    public final int[][] method144(int arg0, int arg1) {
        ++field3049;
        int var3 = -127 % ((arg1 - -80) / 45);
        int[][] var4 = super.field1342.method2530(arg0, (byte) 92);
        if (super.field1342.field5819) {
            int[][] var5 = this.method639((byte) 34, !this.field3047 ? arg0 : -arg0 + class315.field4488, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            if (!this.field3045) {
                for (int var12 = 0; ~class218.field2979 < ~var12; ++var12) {
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                }
            } else {
                for (int var13 = 0; ~var13 > ~class218.field2979; ++var13) {
                    var9[var13] = var6[-var13 + class92.field1013];
                    var10[var13] = var7[-var13 + class92.field1013];
                    var11[var13] = var8[-var13 + class92.field1013];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIIIII)V", line = 72)
    public static final void method1447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3048;
        int var8 = arg7 - -arg1;
        int var9 = -arg1 + arg4;
        for (int var10 = arg7; var8 > var10; ++var10) {
            class105.method564(arg0, arg3, arg2 ^ 2, class318.field4522[var10], arg5);
        }
        int var11 = arg1 + arg3;
        if (arg2 == 2) {
            int var12 = arg5 - arg1;
            for (int var13 = arg4; ~var9 > ~var13; --var13) {
                class105.method564(arg0, arg3, arg2 ^ 2, class318.field4522[var13], arg5);
            }
            for (int var14 = var8; ~var9 <= ~var14; ++var14) {
                int[] var15 = class318.field4522[var14];
                class105.method564(arg0, arg3, 0, var15, var11);
                class105.method564(arg6, var11, arg2 ^ 2, var15, var12);
                class105.method564(arg0, var12, 0, var15, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "h", descriptor = "(I)V", line = 118)
    public static void method1448(int arg0) {
        field3042 = null;
        if (arg0 != 2) {
            method1447(-126, -97, 49, 22, 102, -20, -89, 58);
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(IIB)V", line = 129)
    public static final void method1449(int arg0, int arg1, byte arg2) {
        ++field3043;
        int var3 = 124 / ((arg2 - 1) / 49);
        class100 var4 = class152.method906((byte) 116, arg0);
        int var5 = var4.field1123;
        int var6 = var4.field1131;
        int var7 = var4.field1121;
        int var8 = class410.field5934[-var6 + var7];
        if (~arg1 > -1 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        class225.method1455(var5, ~var9 & class283.field3972[var5] | var9 & arg1 << var6, (byte) -23);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BLbk;I)V", line = 158)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field1347 = ~arg1.method1342((byte) -127) == -2;
                }
            } else {
                this.field3047 = arg1.method1342((byte) -126) == 1;
            }
        } else {
            this.field3045 = arg1.method1342((byte) -128) == 1;
        }
        if (arg0 <= 83) {
            field3053 = -47;
        }
        ++field3046;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V", line = 247)
    public class223() {
        super(1, false);
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(II)[I", line = 208)
    public final int[] method57(int arg0, int arg1) {
        ++field3052;
        if (arg1 != 0) {
            this.method57(110, -13);
        }
        int[] var3 = super.field1340.method14(54, arg0);
        if (super.field1340.field35) {
            int[] var4 = this.method631(true, 0, !this.field3047 ? arg0 : class315.field4488 - arg0);
            if (this.field3045) {
                for (int var5 = 0; ~class218.field2979 < ~var5; ++var5) {
                    var3[var5] = var4[class92.field1013 - var5];
                }
            } else {
                class408.method2573(var4, 0, var3, 0, class218.field2979);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!br", name = "i", descriptor = "(I)V", line = 263)
    public static final void method1450(int arg0) {
        ++field3044;
        if (arg0 != -29167) {
            field3042 = null;
        }
        class257.field3494.method2043(arg0 ^ 29114);
    }
}
