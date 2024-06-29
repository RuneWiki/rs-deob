import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class369 extends class739 {

    @OriginalMember(owner = "client!rca", name = "A", descriptor = "I")
    private int field5389 = 4096;

    @OriginalMember(owner = "client!rca", name = "G", descriptor = "Z")
    private boolean field5394 = true;

    @OriginalMember(owner = "client!rca", name = "E", descriptor = "I")
    public static int field5392 = 0;

    @OriginalMember(owner = "client!rca", name = "F", descriptor = "F")
    public static float field5393;

    @OriginalMember(owner = "client!rca", name = "z", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!rca", name = "B", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!rca", name = "D", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!rca", name = "H", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lsl;IB)V", line = 3)
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (arg2 != 1) {
            field5392 = 14;
        }
        ++field5391;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field5394 = ~arg0.method2886(true) == -2;
            }
        } else {
            this.field5389 = arg0.method2882(arg2 ^ -2);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lkw;IIZ[BIII)Lof;", line = 37)
    public static final class9 method2317(class346 arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 34037) {
            method2317((class346) null, -11, -50, false, (byte[]) null, -22, 114, -11);
        }
        ++field5388;
        if (!arg0.field5021 && (!class211.method1496(0, arg2) || !class211.method1496(0, arg7))) {
            return !arg0.field5035 ? new class9(arg0, arg5, arg2, arg7, class68.method609(arg2, (byte) 76), class68.method609(arg7, (byte) 31), arg4, arg6) : new class9(arg0, 34037, arg5, arg2, arg7, arg3, arg4, arg6);
        } else {
            return new class9(arg0, 3553, arg5, arg2, arg7, arg3, arg4, arg6);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(BII)Z", line = 64)
    public static final boolean method2318(byte arg0, int arg1, int arg2) {
        if (arg0 > -90) {
            return false;
        } else {
            ++field5390;
            return (arg2 & 24) != 0 | ~(544 & arg2) == -545;
        }
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(II)[[I", line = 75)
    public final int[][] method113(int arg0, int arg1) {
        ++field5395;
        if (arg1 != 8213) {
            method2318((byte) -58, 16, 29);
        }
        int[][] var3 = super.field10328.method2106(arg0, true);
        if (super.field10328.field4727) {
            int[] var4 = this.method4127(class311.field4223 & arg0 - 1, arg1 ^ 8289, 0);
            int[] var5 = this.method4127(arg0, 82, 0);
            int[] var6 = this.method4127(class311.field4223 & arg0 - -1, 76, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class399.field5703; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field5389;
                int var12 = (var5[var10 + 1 & class423.field6029] + -var5[class423.field6029 & var10 + -1]) * this.field5389;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var12 / var17;
                    var18 = 16777216 / var17;
                    var20 = var11 / var17;
                }
                if (this.field5394) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var20;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "()V", line = 168)
    public class369() {
        super(1, false);
    }
}
