import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class294 extends class148 {

    @OriginalMember(owner = "client!li", name = "L", descriptor = "Lki;")
    public static class498 field4198 = new class498(27, 2);

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "Loa;")
    public static class489 field4202;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "Lej;")
    public static class78 field4196;

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
    public class294() {
        super(3, false);
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V")
    public static void method1869(int arg0) {
        field4202 = null;
        field4196 = null;
        if (arg0 <= -117) {
            field4198 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field4199;
        if (arg0 >= -65) {
            method1869(19);
        }
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            int[] var4 = this.method971(false, arg1, 0);
            int[] var5 = this.method971(false, arg1, 1);
            int[] var6 = this.method971(false, arg1, 2);
            for (int var7 = 0; ~var7 > ~class320.field4579; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (var8 != 0) {
                        var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
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

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        ++field4200;
        int var4 = -6 / ((-88 - arg2) / 33);
        if (~arg0 == -1) {
            super.field2183 = ~arg1.method1428(32122) == -2;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method27(boolean arg0, int arg1) {
        ++field4201;
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (!arg0) {
            return null;
        } else {
            if (super.field2189.field6033) {
                int[] var4 = this.method971(false, arg1, 2);
                int[][] var5 = this.method974(true, 0, arg1);
                int[][] var6 = this.method974(true, 1, arg1);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; var16 < class320.field4579; ++var16) {
                    int var17 = var4[var16];
                    if (var17 == 4096) {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    } else if (~var17 == -1) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                    }
                }
            }
            return var3;
        }
    }
}
