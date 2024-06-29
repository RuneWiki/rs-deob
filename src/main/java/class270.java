import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class270 extends class751 {

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    public static int field3785 = 0;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "Lke;")
    public static class622 field3790 = new class622(77, -1);

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILha;Lnba;IIIIIIIII)V")
    public static final void method1760(int arg0, class66 arg1, class312 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg3 < arg11 && ~arg11 > ~(arg3 + arg8) && ~(arg6 + -13) > ~arg4 && ~arg4 > ~(arg6 + 3) && arg2.field4641) {
            arg7 = arg10;
        }
        ++field3788;
        int[] var12 = null;
        if (!class134.method950(arg2.field4640, -99)) {
            if (arg2.field4638 == -1) {
                if (class93.method664((byte) 93, arg2.field4640)) {
                    class14 var13 = (class14) class543.field7606.method380((byte) -3, (long) ((int) arg2.field4647));
                    if (var13 != null) {
                        class645 var14 = var13.field262;
                        class279 var15 = var14.field9071;
                        if (var15.field3943 != null) {
                            var15 = var15.method1810((byte) -105, class271.field3796);
                        }
                        if (var15 != null) {
                            var12 = var15.field3895;
                        }
                    }
                } else if (class574.method3331(arg2.field4640, 1)) {
                    Object var16 = null;
                    class322 var17;
                    if (arg2.field4640 != 1007) {
                        var17 = class496.field7061.method319(-124, (int) (2147483647L & arg2.field4647 >>> 32));
                    } else {
                        var17 = class496.field7061.method319(-124, (int) arg2.field4647);
                    }
                    if (var17.field4830 != null) {
                        var17 = var17.method2099(class271.field3796, -109);
                    }
                    if (var17 != null) {
                        var12 = var17.field4762;
                    }
                }
            } else {
                var12 = class526.field7490.method3567(arg2.field4638, true).field7175;
            }
        } else {
            var12 = class526.field7490.method3567((int) arg2.field4647, true).field7175;
        }
        String var18 = class786.method4305(arg2, -49);
        if (var12 != null) {
            var18 = var18 + class388.method2379((byte) -88, var12);
        }
        class546.field7704.method522(0, arg7, class725.field10175, 0, var18, arg3 - -3, class170.field2438, arg6);
        if (arg2.field4643) {
            class74.field993.method785(arg3 - (-5 - class33.field439.method1728(var18, arg0 ^ -644747621)), arg6 - 12);
        }
        if (arg0 != -644747552) {
            field3785 = 54;
        }
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(B)V")
    public static void method1761(byte arg0) {
        if (arg0 > -12) {
            field3785 = -81;
        }
        field3790 = null;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)[Ldba;")
    public static final class101[] method1762(int arg0) {
        ++field3787;
        if (arg0 != 30124) {
            field3790 = null;
        }
        return new class101[] { class174.field2462, class586.field8292, class633.field8934, class768.field10603, class456.field6541, class703.field9908, class577.field8158, class390.field5547, class262.field3708, class155.field2300, class328.field4893, class527.field7497, class701.field9893, class710.field9999, class549.field7748 };
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
    public class270() {
        super(1, true);
    }

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "(B)V")
    public static final void method1763(byte arg0) {
        ++field3786;
        if (~class145.field1852.field9018.method2757((byte) -76) == -1 && class573.field8111 != class410.field5771) {
            class230.method1600(false, class481.field6839, 11, class388.field5531, -22710);
        } else {
            class786.method4304(class638.field8979, true);
            if (class778.field10728 != class410.field5771) {
                class631.method3607(512);
            }
            if (arg0 != -21) {
                method1762(117);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)[I")
    public final int[] method365(int arg0, int arg1) {
        if (arg1 != 4095) {
            method1762(-46);
        }
        ++field3789;
        int[] var3 = super.field10405.method3601(true, arg0);
        if (super.field10405.field8923) {
            int[][] var4 = this.method4172(0, arg0, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class673.field9452 < ~var8; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }
}
