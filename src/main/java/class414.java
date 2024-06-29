import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class414 extends class739 {

    @OriginalMember(owner = "client!av", name = "z", descriptor = "[Lin;")
    public static class63[] field5889 = new class63[1024];

    @OriginalMember(owner = "client!av", name = "A", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!av", name = "B", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!av", name = "C", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(I)V")
    public static void method2499(int arg0) {
        field5889 = null;
        if (arg0 != 20948) {
            field5889 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZI)[I")
    public final int[] method445(boolean arg0, int arg1) {
        ++field5891;
        if (arg0) {
            this.method445(true, -22);
        }
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            int[] var4 = this.method4127(arg1, 120, 0);
            int[] var5 = this.method4127(arg1, 74, 1);
            int[] var6 = this.method4127(arg1, 51, 2);
            for (int var7 = 0; ~class399.field5703 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (~var8 != -1) {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(II)[[I")
    public final int[][] method113(int arg0, int arg1) {
        ++field5892;
        int[][] var3 = super.field10328.method2106(arg0, true);
        if (arg1 != 8213) {
            return null;
        } else {
            if (super.field10328.field4727) {
                int[] var4 = this.method4127(arg0, 82, 2);
                int[][] var5 = this.method4124(arg0, 0, true);
                int[][] var6 = this.method4124(arg0, 1, true);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; class399.field5703 > var16; ++var16) {
                    int var17 = var4[var16];
                    if (~var17 != -4097) {
                        if (~var17 == -1) {
                            var7[var16] = var13[var16];
                            var8[var16] = var14[var16];
                            var9[var16] = var15[var16];
                        } else {
                            int var18 = -var17 + 4096;
                            var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                            var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                            var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                        }
                    } else {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        ++field5890;
        if (arg2 == 1) {
            if (arg1 == 0) {
                super.field10320 = arg0.method2886(true) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "()V")
    public class414() {
        super(3, false);
    }
}
