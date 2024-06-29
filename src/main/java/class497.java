import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class497 extends class546 {

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "F")
    private float field7247 = 0.0F;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "Ltj;")
    private class181 field7248;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "Z")
    public static boolean field7254 = false;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field7259 = -1;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "Lhga;")
    public static class158 field7258 = new class158(54, 7);

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V")
    public final void method788(boolean arg0, int arg1) {
        ++field7249;
        super.field7937.method2244(1, arg1 ^ -84);
        super.field7937.method2275(class406.field6268, 11, class471.field6979);
        super.field7937.method185(class622.field8779, 0, false, true, (byte) 106);
        super.field7937.method2304(class692.field9702, arg1, -124);
        super.field7937.method173(16316, 0);
        super.field7937.method2244(0, -87);
        super.field7937.method2290(10359, -16777216);
        super.field7937.method2304(class471.field6974, 0, -120);
        this.method784((byte) -103);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII[BII[B)V")
    public static final void method3020(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, byte[] arg8) {
        ++field7255;
        if (arg1 == 7) {
            int var9 = -(arg6 >> 2);
            int var10 = -(arg6 & 3);
            for (int var11 = -arg7; ~var11 > -1; ++var11) {
                int var10001;
                for (int var12 = var9; var12 < 0; ++var12) {
                    var10001 = arg2++;
                    arg5[var10001] += arg8[arg0++];
                    int var14 = arg2++;
                    arg5[var14] += arg8[arg0++];
                    int var15 = arg2++;
                    arg5[var15] += arg8[arg0++];
                    int var16 = arg2++;
                    arg5[var16] += arg8[arg0++];
                }
                for (int var13 = var10; var13 < 0; ++var13) {
                    var10001 = arg2++;
                    arg5[var10001] += arg8[arg0++];
                }
                arg2 += arg3;
                arg0 += arg4;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)Z")
    public final boolean method787(byte arg0) {
        if (arg0 != -109) {
            this.method787((byte) 112);
        }
        ++field7256;
        return this.field7248.method1480((byte) -105);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V")
    public final void method785(int arg0, int arg1, int arg2) {
        super.field7937.method2244(1, -73);
        ++field7253;
        if (arg0 != 8) {
            this.field7247 = 0.72022194F;
        }
        if ((128 & arg1) == 0) {
            if ((arg2 & 1) == 1) {
                if (this.field7248.field3036) {
                    this.field7247 = (float) (super.field7937.field5327 % 4000) / 4000.0F;
                    super.field7937.method2271(this.field7248.field3042, 5180);
                } else {
                    int var4 = super.field7937.field5327 % 4000 * 16 / 4000;
                    super.field7937.method2271(this.field7248.field3047[var4], 5180);
                }
            } else if (!this.field7248.field3036) {
                super.field7937.method2271(this.field7248.field3047[0], 5180);
            } else {
                super.field7937.method2271(this.field7248.field3042, 5180);
            }
        } else {
            super.field7937.method2271((class152) null, arg0 + 5172);
        }
        super.field7937.method2244(0, -60);
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)V")
    public static void method3021(byte arg0) {
        if (arg0 <= 12) {
            method3021((byte) -93);
        }
        field7258 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V")
    public final void method793(int arg0, boolean arg1) {
        ++field7257;
        super.field7937.method2275(class406.field6268, -73, class646.field9074);
        if (arg0 > -39) {
            this.method785(-100, -34, 41);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V")
    public final void method784(byte arg0) {
        if (super.field7937.method2277(arg0 ^ -30842) == 0) {
            class498 var2 = super.field7937.method2234(6);
            super.field7937.method2244(1, -74);
            class498 var3 = super.field7937.method2282((byte) 117);
            var3.method512(var2);
            var3.method3030(0.125F, 1.0F, 0.125F, arg0 ^ -24664);
            var3.method3024(0.0F, arg0 ^ -26459, this.field7247, 0.0F);
            super.field7937.method2291(class55.field723, 24813);
            super.field7937.method2244(0, -107);
        }
        if (arg0 == -103) {
            ++field7250;
        }
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V")
    public final void method783(int arg0) {
        super.field7937.method2244(1, -79);
        ++field7251;
        if (arg0 != 255) {
            this.field7248 = null;
        }
        super.field7937.method2275(class646.field9074, arg0 + -132, class646.field9074);
        super.field7937.method2287((byte) -92, 0, class622.field8779);
        super.field7937.method2304(class622.field8779, 0, -127);
        super.field7937.method173(16316, 1);
        super.field7937.method2271((class152) null, arg0 + 4925);
        super.field7937.method2244(0, arg0 ^ -181);
        super.field7937.method2304(class622.field8779, 0, -126);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZLwq;)V")
    public final void method794(int arg0, boolean arg1, class152 arg2) {
        super.field7937.method2271(arg2, 5180);
        if (!arg1) {
            ++field7252;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lrr;Ltj;)V")
    public class497(class332 arg0, class181 arg1) {
        super(arg0);
        this.field7248 = arg1;
    }
}
