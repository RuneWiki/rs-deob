import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class298 extends class326 {

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "Z")
    public static boolean field4592 = false;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(Lug;III)[Luj;", line = 4)
    public static final class169[] method2074(class253 arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 0) {
            field4590++;
            return class287.method2029(arg0, arg3, 2, arg2) ? class110.method788(false) : null;
        } else {
            return (class169[]) null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lnm;I)V", line = 21)
    public static final void method2075(class212 arg0, int arg1) {
        int var2 = -65 / ((-arg1 - 49) / 36);
        field4596++;
        for (class166 var3 = (class166) class284.field4394.method22((byte) 122); var3 != null; var3 = (class166) class284.field4394.method26((byte) -118)) {
            if (var3.field2719 == arg0) {
                if (var3.field2721 != null) {
                    class86.field1174.method1313(var3.field2721);
                    var3.field2721 = null;
                }
                var3.method2028(13329);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)[[I", line = 56)
    public final int[][] method253(int arg0, byte arg1) {
        field4593++;
        int[][] var3 = this.field5104.method2365((byte) -109, arg0);
        int var4 = -96 % ((arg1 - 60) / 51);
        if (this.field5104.field5325) {
            int[] var5 = this.method2287(2, arg0, -3896);
            int[][] var6 = this.method2293(-15033, arg0, 0);
            int[][] var7 = this.method2293(-15033, arg0, 1);
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            int[] var11 = var6[0];
            int[] var12 = var6[2];
            int[] var13 = var6[1];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            for (int var17 = 0; var17 < class166.field2731; var17++) {
                int var18 = var5[var17];
                if (var18 == 4096) {
                    var9[var17] = var11[var17];
                    var8[var17] = var13[var17];
                    var10[var17] = var12[var17];
                } else if (var18 == 0) {
                    var9[var17] = var14[var17];
                    var8[var17] = var15[var17];
                    var10[var17] = var16[var17];
                } else {
                    int var19 = 4096 - var18;
                    var9[var17] = var11[var17] * var18 + var14[var17] * var19 >> 12;
                    var8[var17] = var13[var17] * var18 + var15[var17] * var19 >> 12;
                    var10[var17] = var12[var17] * var18 + (var16[var17] * var19) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V", line = 133)
    public class298() {
        super(3, false);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZLvl;)V", line = 138)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (arg0 == 0) {
            this.field5121 = arg2.method58(-288140008) == 1;
        }
        field4595++;
        if (arg1) {
            field4592 = false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIII)V", line = 152)
    public static final void method2076(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg0 + 1;
        class256.method1853(class284.field4402[arg0], arg3, arg5, arg4, 0);
        field4591++;
        int var9 = arg1 - 1;
        class256.method1853(class284.field4402[arg1], arg3, arg5, arg4, arg2 ^ arg2);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class284.field4402[var6];
            var7[arg3] = var7[arg4] = arg5;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[I", line = 193)
    public final int[] method103(int arg0, int arg1) {
        field4597++;
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (arg0 >= -25) {
            return (int[]) null;
        }
        if (this.field5112.field3583) {
            int[] var4 = this.method2287(0, arg1, -3896);
            int[] var5 = this.method2287(1, arg1, -3896);
            int[] var6 = this.method2287(2, arg1, -3896);
            for (int var7 = 0; var7 < class166.field2731; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }
}
