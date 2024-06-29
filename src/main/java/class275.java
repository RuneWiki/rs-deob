import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class275 extends class115 {

    @OriginalMember(owner = "client!so", name = "K", descriptor = "[I")
    public static int[] field3881 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!so", name = "J", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!so", name = "L", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!so", name = "N", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!so", name = "O", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!so", name = "M", descriptor = "[[[B")
    public static byte[][][] field3883;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(II)[I", line = 3)
    public final int[] method57(int arg0, int arg1) {
        ++field3884;
        int[] var3 = super.field1340.method14(arg1 + 41, arg0);
        if (arg1 != 0) {
            field3883 = null;
        }
        if (super.field1340.field35) {
            int[] var4 = this.method631(true, 0, arg0);
            int[] var5 = this.method631(true, 1, arg0);
            int[] var6 = this.method631(true, 2, arg0);
            for (int var7 = 0; ~class218.field2979 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (~var8 != -1) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)[[I", line = 55)
    public final int[][] method144(int arg0, int arg1) {
        ++field3885;
        int[][] var3 = super.field1342.method2530(arg0, (byte) 100);
        int var4 = 23 % ((-80 - arg1) / 45);
        if (super.field1342.field5819) {
            int[] var5 = this.method631(true, 2, arg0);
            int[][] var6 = this.method639((byte) 34, arg0, 0);
            int[][] var7 = this.method639((byte) 34, arg0, 1);
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            int[] var11 = var6[0];
            int[] var12 = var6[1];
            int[] var13 = var6[2];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            for (int var17 = 0; ~var17 > ~class218.field2979; ++var17) {
                int var18 = var5[var17];
                if (~var18 == -4097) {
                    var8[var17] = var11[var17];
                    var9[var17] = var12[var17];
                    var10[var17] = var13[var17];
                } else if (var18 == 0) {
                    var8[var17] = var14[var17];
                    var9[var17] = var15[var17];
                    var10[var17] = var16[var17];
                } else {
                    int var19 = -var18 + 4096;
                    var8[var17] = var11[var17] * var18 + var14[var17] * var19 >> 12;
                    var9[var17] = var12[var17] * var18 - -(var15[var17] * var19) >> 12;
                    var10[var17] = var13[var17] * var18 - -(var16[var17] * var19) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V", line = 133)
    public class275() {
        super(3, false);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BLbk;I)V", line = 143)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        ++field3882;
        if (arg0 >= 83) {
            if (~arg2 == -1) {
                super.field1347 = ~arg1.method1342((byte) -127) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lnj;I)V", line = 156)
    public static final void method1739(class133 arg0, int arg1) {
        ++field3880;
        int var2 = -97 % ((64 - arg1) / 55);
        class81 var3 = (class81) class201.field2777.method1204((byte) -67, (long) arg0.field6279);
        if (var3 != null) {
            if (var3.field909 != null) {
                class135.field1884.method2807(var3.field909);
                var3.field909 = null;
            }
            var3.method2290((byte) 98);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIILfm;Lfm;)V", line = 181)
    public static final void method1740(int arg0, int arg1, int arg2, class436 arg3, class436 arg4) {
        if (class19.field202[arg0][arg1][arg2] == null) {
            class252.method1578(arg0, arg1, arg2);
        }
        class19.field202[arg0][arg1][arg2].field4313 = arg3;
        class19.field202[arg0][arg1][arg2].field4324 = arg4;
    }

    @OriginalMember(owner = "client!so", name = "h", descriptor = "(I)V", line = 190)
    public static void method1741(int arg0) {
        if (arg0 != -8576) {
            method1740(-110, 111, 114, (class436) null, (class436) null);
        }
        field3883 = null;
        field3881 = null;
    }
}
