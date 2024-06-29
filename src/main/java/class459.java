import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class459 extends class254 {

    @OriginalMember(owner = "client!af", name = "Jb", descriptor = "Ljb;")
    public static class519 field6547 = new class519(103, 1);

    @OriginalMember(owner = "client!af", name = "Fb", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!af", name = "Gb", descriptor = "I")
    private int field6544;

    @OriginalMember(owner = "client!af", name = "Hb", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!af", name = "Ib", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!af", name = "Kb", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!af", name = "Mb", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!af", name = "Nb", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!af", name = "Ob", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!af", name = "Pb", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!af", name = "Qb", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!af", name = "Rb", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!af", name = "Sb", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!af", name = "Tb", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!af", name = "Lb", descriptor = "Lhda;")
    private class780 field6549;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class436[] var7 = class681.field9112;
        if (arg0 == -30529) {
            for (int var8 = 0; var8 < var7.length; ++var8) {
                class436 var9 = var7[var8];
                if (var9 != null && ~var9.field6307 == -3) {
                    class592.method3330(arg2, var9.field6300, arg5, var9.field6313 * 2, arg1 >> 1, var9.field6305, 13962, arg6 >> 1, var9.field6302);
                    if (class548.field7567[0] > -1 && ~(class572.field7788 % 20) > -11) {
                        class140 var10 = class405.field5744[var9.field6311];
                        int var11 = class548.field7567[0] + arg4 + -12;
                        int var12 = class548.field7567[1] + arg3 - 28;
                        var10.method968(var11, var12);
                        class199.method1300(var12, var11 - -var10.method343(), 8963, var11, var10.method340() + var12);
                    }
                }
            }
            ++field6543;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lhda;I)V")
    public final void method2716(class780 arg0, int arg1) {
        this.field6549 = arg0;
        ++field6556;
        if (arg1 != -3551) {
            this.method2718(-40, -98, (byte[]) null, -112);
        }
    }

    @OriginalMember(owner = "client!af", name = "k", descriptor = "(B)V")
    public final void method2717(byte arg0) {
        ++field6546;
        super.field3725 = (this.field6544 + 7) / 8;
        int var2 = 29 % ((arg0 - 61) / 54);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II[BI)V")
    public final void method2718(int arg0, int arg1, byte[] arg2, int arg3) {
        for (int var5 = 0; arg1 > var5; ++var5) {
            arg2[arg0 + var5] = (byte) (super.field3789[super.field3725++] + -this.field6549.method4280((byte) 124));
        }
        if (arg3 != 13) {
            this.field6549 = null;
        }
        ++field6551;
    }

    @OriginalMember(owner = "client!af", name = "l", descriptor = "(B)I")
    public final int method2719(byte arg0) {
        ++field6552;
        int var2 = 255 & super.field3789[super.field3725++] + -this.field6549.method4280((byte) 56);
        if (var2 < 128) {
            return var2;
        } else {
            return arg0 != -61 ? 62 : (var2 + -128 << 8) + (255 & super.field3789[super.field3725++] - this.field6549.method4280((byte) -116));
        }
    }

    @OriginalMember(owner = "client!af", name = "m", descriptor = "(B)V")
    public static void method2720(byte arg0) {
        if (arg0 == 90) {
            field6547 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "l", descriptor = "(II)I")
    public final int method2721(int arg0, int arg1) {
        ++field6553;
        int var3 = this.field6544 >> 3;
        int var4 = -(this.field6544 & 7) + 8;
        int var5 = 0;
        this.field6544 += arg0;
        while (var4 < arg0) {
            var5 += (super.field3789[var3++] & class658.field8874[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 == ~var4) {
            var6 = (class658.field8874[var4] & super.field3789[var3]) + var5;
        } else {
            var6 = (super.field3789[var3] >> -arg0 + var4 & class658.field8874[arg0]) + var5;
        }
        if (arg1 != 1) {
            this.method2717((byte) -16);
        }
        return var6;
    }

    @OriginalMember(owner = "client!af", name = "z", descriptor = "(I)V")
    public final void method2722(int arg0) {
        int var2 = 101 % ((arg0 - 27) / 52);
        this.field6544 = super.field3725 * 8;
        ++field6550;
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(BI)V")
    public final void method2723(byte arg0, int arg1) {
        super.field3789[super.field3725++] = (byte) (this.field6549.method4280((byte) 51) + arg1);
        if (arg0 >= -49) {
            field6547 = null;
        }
        ++field6555;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IBLjava/lang/String;IZ)V")
    public static final void method2724(int arg0, byte arg1, String arg2, int arg3, boolean arg4) {
        class596.method3339((byte) 96, arg4, arg3, false, arg0, (String) null, arg2);
        if (arg1 <= 48) {
            field6547 = null;
        }
        ++field6548;
    }

    @OriginalMember(owner = "client!af", name = "n", descriptor = "(B)Z")
    public final boolean method2725(byte arg0) {
        if (arg0 != -72) {
            return false;
        } else {
            ++field6554;
            int var2 = 255 & super.field3789[super.field3725] - this.field6549.method4282(-91);
            return var2 >= 128;
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I)V")
    public class459(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!af", name = "m", descriptor = "(II)I")
    public final int method2726(int arg0, int arg1) {
        int var3 = 99 % ((arg0 - -67) / 59);
        ++field6557;
        return arg1 * 8 + -this.field6544;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([II)V")
    public final void method2727(int[] arg0, int arg1) {
        this.field6549 = new class780(arg0);
        ++field6545;
        if (arg1 != 25618) {
            field6547 = null;
        }
    }
}
