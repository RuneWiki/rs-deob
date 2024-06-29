import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class666 extends class748 {

    @OriginalMember(owner = "client!dt", name = "L", descriptor = "I")
    private int field9384 = 1024;

    @OriginalMember(owner = "client!dt", name = "P", descriptor = "I")
    private int field9388 = 3072;

    @OriginalMember(owner = "client!dt", name = "R", descriptor = "I")
    private int field9390 = 2048;

    @OriginalMember(owner = "client!dt", name = "O", descriptor = "I")
    public static int field9387 = 0;

    @OriginalMember(owner = "client!dt", name = "N", descriptor = "[F")
    public static float[] field9386 = new float[16];

    @OriginalMember(owner = "client!dt", name = "H", descriptor = "I")
    public static int field9381;

    @OriginalMember(owner = "client!dt", name = "K", descriptor = "I")
    public static int field9383;

    @OriginalMember(owner = "client!dt", name = "M", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!dt", name = "S", descriptor = "I")
    public static int field9391;

    @OriginalMember(owner = "client!dt", name = "T", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!dt", name = "Q", descriptor = "Lsp;")
    public static class471 field9389;

    @OriginalMember(owner = "client!dt", name = "J", descriptor = "[I")
    public static int[] field9382;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "(B)V")
    public static void method3819(byte arg0) {
        field9389 = null;
        field9382 = null;
        if (arg0 > -88) {
            field9386 = null;
        }
        field9386 = null;
    }

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "(I)V")
    public static final void method3820(int arg0) {
        for (class480 var1 = (class480) class314.field4033.method667(true); var1 != null; var1 = (class480) class314.field4033.method662((byte) 126)) {
            if (var1.field6524 > 1) {
                var1.field6524 = 0;
                class105.field1528.method3199((byte) 78, var1, ((class6) var1.field6519.field1417.field3781).field48);
                var1.field6519.method661(false);
            }
        }
        ++field9381;
        class605.field8642 = 0;
        class367.field4714 = arg0;
        class478.field6510.method3122(0);
        class675.field9509.method1385((byte) -97);
        class314.field4033.method661(false);
        class484.field6549 = false;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        if (arg1) {
            field9387 = 86;
        }
        ++field9392;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field10414 = arg2.method194((byte) 119) == 1;
                }
            } else {
                this.field9388 = arg2.method193(2);
            }
        } else {
            this.field9384 = arg2.method193(2);
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "()V")
    public class666() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
    public final void method23(byte arg0) {
        if (arg0 != 67) {
            field9386 = null;
        }
        ++field9383;
        this.field9390 = -this.field9384 + this.field9388;
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(II)[[I")
    public final int[][] method445(int arg0, int arg1) {
        ++field9385;
        if (arg1 != 0) {
            return null;
        } else {
            int[][] var3 = super.field10420.method930(29784, arg0);
            if (super.field10420.field1979) {
                int[][] var4 = this.method4159(0, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class424.field5889; ++var11) {
                    var8[var11] = this.field9384 - -(var5[var11] * this.field9390 >> 12);
                    var9[var11] = (var6[var11] * this.field9390 >> 12) + this.field9384;
                    var10[var11] = (var7[var11] * this.field9390 >> 12) + this.field9384;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        if (arg1 != 255) {
            return null;
        } else {
            ++field9391;
            int[] var3 = super.field10407.method3873(arg1 + -255, arg0);
            if (super.field10407.field9527) {
                int[] var4 = this.method4157(0, (byte) -74, arg0);
                for (int var5 = 0; ~class424.field5889 < ~var5; ++var5) {
                    var3[var5] = (var4[var5] * this.field9390 >> 12) + this.field9384;
                }
            }
            return var3;
        }
    }
}
