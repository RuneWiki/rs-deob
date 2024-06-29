import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class429 extends class56 {

    @OriginalMember(owner = "client!taa", name = "F", descriptor = "Z")
    private boolean field5657 = true;

    @OriginalMember(owner = "client!taa", name = "E", descriptor = "Z")
    private boolean field5656 = true;

    @OriginalMember(owner = "client!taa", name = "D", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!taa", name = "G", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!taa", name = "H", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!taa", name = "I", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!taa", name = "J", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!taa", name = "K", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!taa", name = "L", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ID)V")
    public static final void method2547(int arg0, double arg1) {
        class677.field9286.method141(class415.field5434);
        ++field5662;
        class677.field9286.method131(0, 0, (int) arg1);
        class434.field5738.method628(class677.field9286);
        if (arg0 <= 122) {
            method2549(-68, -104, 75, -28, 19, -33, -116, 21, 50);
        }
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "()V")
    public class429() {
        super(1, false);
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        ++field5655;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field762 = ~arg2.method2396((byte) -107) == -2;
                }
            } else {
                this.field5656 = ~arg2.method2396((byte) 71) == -2;
            }
        } else {
            this.field5657 = arg2.method2396((byte) -98) == 1;
        }
        if (arg0 >= -44) {
            this.field5656 = true;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZI)V")
    public static final void method2548(boolean arg0, int arg1) {
        ++field5659;
        if (arg1 == 0) {
            if (arg0) {
                if (~class131.field1615 != 0) {
                    class553.method3245(class131.field1615, arg1 ^ 54);
                }
                for (class52 var2 = (class52) class728.field10205.method2119(arg1 + -52); var2 != null; var2 = (class52) class728.field10205.method2111((byte) -126)) {
                    if (!var2.method2221(8763)) {
                        var2 = (class52) class728.field10205.method2119(arg1 + -49);
                        if (var2 == null) {
                            break;
                        }
                    }
                    class336.method1989(true, false, var2, (byte) 117);
                }
                class131.field1615 = -1;
                class728.field10205 = new class362(8);
                class99.method844(-18143);
                class131.field1615 = class209.field2480;
                class413.method2462(false, 19674);
                class41.method341(-54);
                class142.method1043(class131.field1615);
            }
            class727.field10182 = true;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field5660;
        int[] var3 = super.field752.method1308(false, arg1);
        if (super.field752.field2441) {
            int[] var4 = this.method492(0, this.field5656 ? class75.field1037 - arg1 : arg1, (byte) 102);
            if (this.field5657) {
                for (int var5 = 0; var5 < class642.field8759; ++var5) {
                    var3[var5] = var4[-var5 + class446.field5990];
                }
            } else {
                class211.method1332(var4, 0, var3, 0, class642.field8759);
            }
        }
        if (arg0 != 0) {
            this.field5657 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field5663;
        if (arg3 >= ~arg2 && ~arg4 <= -2 && ~(class596.field8090 + -2) <= ~arg2 && ~(class107.field1350 + -2) <= ~arg4) {
            int var9 = arg8;
            if (~arg8 > -4 && class77.method708(arg2, -184949524, arg4)) {
                var9 = arg8 + 1;
            }
            if (class118.field1503.field10632.method3881(0) == 0 && !class99.method845(arg4, var9, class500.field7013, arg2, 16)) {
                return;
            }
            if (class107.field1351 == null) {
                return;
            }
            class441.field5923.method921(84, arg2, class363.field4526, arg4, arg8, class633.field8649[arg8], arg6);
            if (arg1 >= 0) {
                int var10 = class118.field1503.field10649.method3707(arg3 + 2);
                class118.field1503.method4295(class118.field1503.field10649, 1, false);
                class441.field5923.method922(arg0, class633.field8649[arg8], arg8, arg1, arg7, arg2, false, arg5, arg4, var9, class363.field4526);
                class118.field1503.method4295(class118.field1503.field10649, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(BI)[[I")
    public final int[][] method187(byte arg0, int arg1) {
        ++field5658;
        int[][] var3 = super.field759.method220(arg1, (byte) -91);
        if (arg0 <= 35) {
            return null;
        } else {
            if (super.field759.field341) {
                int[][] var4 = this.method495(85, !this.field5656 ? arg1 : -arg1 + class75.field1037, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (this.field5657) {
                    for (int var11 = 0; ~var11 > ~class642.field8759; ++var11) {
                        var8[var11] = var5[-var11 + class446.field5990];
                        var9[var11] = var6[-var11 + class446.field5990];
                        var10[var11] = var7[-var11 + class446.field5990];
                    }
                } else {
                    for (int var12 = 0; ~var12 > ~class642.field8759; ++var12) {
                        var8[var12] = var5[var12];
                        var9[var12] = var6[var12];
                        var10[var12] = var7[var12];
                    }
                }
            }
            return var3;
        }
    }
}
