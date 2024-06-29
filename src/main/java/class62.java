import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class62 extends class601 {

    @OriginalMember(owner = "client!hr", name = "G", descriptor = "I")
    private int field806 = 10;

    @OriginalMember(owner = "client!hr", name = "F", descriptor = "I")
    private int field805 = 0;

    @OriginalMember(owner = "client!hr", name = "Q", descriptor = "I")
    private int field816 = 2048;

    @OriginalMember(owner = "client!hr", name = "S", descriptor = "Lmw;")
    public static class687 field818 = new class687();

    @OriginalMember(owner = "client!hr", name = "I", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!hr", name = "J", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!hr", name = "K", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!hr", name = "L", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!hr", name = "N", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!hr", name = "O", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!hr", name = "P", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!hr", name = "R", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!hr", name = "T", descriptor = "Ldv;")
    public static class93 field819;

    @OriginalMember(owner = "client!hr", name = "H", descriptor = "[I")
    private int[] field807;

    @OriginalMember(owner = "client!hr", name = "M", descriptor = "[I")
    private int[] field812;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZB)Ljava/lang/String;", line = 3)
    public static final String method364(int arg0, boolean arg1, byte arg2) {
        ++field811;
        if (arg2 != 110) {
            return null;
        } else {
            return arg1 && ~arg0 <= -1 ? class749.method4066(arg0, -88, arg1, 10) : Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZLaca;Laca;IZBI)I", line = 18)
    public static final int method365(boolean arg0, class230 arg1, class230 arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        ++field815;
        int var7 = class679.method3653(4, arg6, arg1, arg4, arg2);
        if (arg5 >= -113) {
            field819 = null;
        }
        if (var7 != 0) {
            return arg4 ? -var7 : var7;
        } else if (~arg3 == 0) {
            return 0;
        } else {
            int var8 = class679.method3653(4, arg3, arg1, arg0, arg2);
            return arg0 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)[I", line = 50)
    public final int[] method261(int arg0, byte arg1) {
        ++field810;
        if (arg1 >= -76) {
            field819 = null;
        }
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (super.field7643.field4364) {
            int var4 = class427.field5623[arg0];
            if (~this.field805 == -1) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field806; ++var6) {
                    if (var4 >= this.field807[var6] && ~var4 > ~this.field807[var6 + 1]) {
                        if (~this.field812[var6] < ~var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class642.method3478(var3, 0, class418.field5518, var5);
            } else {
                for (int var7 = 0; ~var7 > ~class418.field5518; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class64.field839[var7];
                    int var11 = this.field805;
                    if (var11 != 1) {
                        if (~var11 != -3) {
                            if (var11 == 3) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (-4096 - -var4 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~var12 > ~this.field806; ++var12) {
                        if (~this.field807[var12] >= ~var8 && this.field807[var12 - -1] > var8) {
                            if (var8 < this.field812[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V", line = 297)
    public class62() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "(I)V", line = 175)
    private final void method366(int arg0) {
        ++field813;
        int var2 = 0;
        this.field807 = new int[this.field806 + 1];
        this.field812 = new int[this.field806 + 1];
        if (arg0 <= -28) {
            int var3 = 4096 / this.field806;
            int var4 = this.field816 * var3 >> 12;
            for (int var5 = 0; this.field806 > var5; ++var5) {
                this.field807[var5] = var2;
                this.field812[var5] = var2 + var4;
                var2 += var3;
            }
            this.field807[this.field806] = 4096;
            this.field812[this.field806] = this.field812[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lmc;II)V", line = 212)
    public final void method259(class234 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field805 = arg0.method1509(true);
                }
            } else {
                this.field816 = arg0.method1553((byte) -128);
            }
        } else {
            this.field806 = arg0.method1509(true);
        }
        int var5 = 70 % ((40 - arg2) / 52);
        ++field814;
    }

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)V", line = 257)
    public static void method367(int arg0) {
        field818 = null;
        field819 = null;
        if (arg0 > -27) {
            field819 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IBI)V", line = 268)
    public static final void method368(int arg0, byte arg1, int arg2) {
        if (~class693.field8903 != -1) {
            if (arg0 >= 0) {
                class176.field2318[arg0] = arg2;
            } else {
                for (int var3 = 0; ~var3 > -17; ++var3) {
                    class176.field2318[var3] = arg2;
                }
            }
        }
        ++field808;
        class687.field8841.method3544(-1, arg0, arg2);
        if (arg1 <= 55) {
            method364(-47, true, (byte) -43);
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)V", line = 305)
    public final void method292(byte arg0) {
        if (arg0 < 44) {
            this.field807 = null;
        }
        ++field809;
        this.method366(-117);
    }
}
