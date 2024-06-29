import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class31 implements class33 {

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "Ltf;")
    private class701 field305;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Lig;")
    private class322 field302;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "Ltf;")
    private class701 field304;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Lla;")
    private class413 field299;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BII)Z", line = 3)
    public static final boolean method161(byte arg0, int arg1, int arg2) {
        field295++;
        int var3 = -70 / ((-arg0 - 14) / 49);
        return (arg1 & 0x800) != 0 | class579.method3273(-11296, arg1, arg2) || class102.method555(-121, arg2, arg1);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([IIBIIIII)Z", line = 20)
    public static final boolean method162(int[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 > class148.field1637) {
            arg1 = class148.field1637;
        }
        if (arg7 < 0) {
            arg7 = 0;
        }
        field296++;
        if (arg1 <= arg7) {
            return true;
        }
        int var8 = arg1 - arg7 >> 2;
        if (arg2 != 125) {
            field298 = 40;
        }
        int var9 = arg7 + arg5 - 1;
        int var10 = arg6 * arg7 + arg3;
        int var10000;
        if (class371.field5067 == 1) {
            class697.field9783 += var8;
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var15 = arg1 - arg7 & 0x3;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            return true;
                        }
                        var9++;
                        if (var10 < arg0[var9]) {
                            arg0[var9] = var10;
                        }
                        var10 += arg6;
                    }
                }
                var10000 = ~var10;
                var9++;
                if (var10000 > ~arg0[var9]) {
                    arg0[var9] = var10;
                }
                int var16 = arg6 + var10;
                var9++;
                if (arg0[var9] > var16) {
                    arg0[var9] = var16;
                }
                int var17 = arg6 + var16;
                var10000 = ~var17;
                var9++;
                if (var10000 > ~arg0[var9]) {
                    arg0[var9] = var17;
                }
                int var18 = arg6 + var17;
                var9++;
                if (arg0[var9] > var18) {
                    arg0[var9] = var18;
                }
                var10 = arg6 + var18;
            }
        } else {
            var10 -= 15360;
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var11 = arg1 - arg7 & 0x3;
                    while (true) {
                        var11--;
                        if (var11 < 0) {
                            return true;
                        }
                        var9++;
                        if (arg0[var9] > var10) {
                            return false;
                        }
                        var10 += arg6;
                    }
                }
                var10000 = ~var10;
                var9++;
                if (var10000 > ~arg0[var9]) {
                    return false;
                }
                int var12 = arg6 + var10;
                var10000 = ~var12;
                var9++;
                if (var10000 > ~arg0[var9]) {
                    return false;
                }
                int var13 = arg6 + var12;
                var10000 = ~var13;
                var9++;
                if (var10000 > ~arg0[var9]) {
                    return false;
                }
                int var14 = arg6 + var13;
                var10000 = ~var14;
                var9++;
                if (var10000 > ~arg0[var9]) {
                    return false;
                }
                var10 = arg6 + var14;
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 123)
    public final void method156(int arg0) {
        if (arg0 != 23004) {
            this.method156(87);
        }
        field303++;
        class463 var2 = class658.method3651(-123, this.field302.field3955, this.field304);
        this.field299 = class701.field9813.method998(var2, class550.method3119(this.field305, this.field302.field3955), true);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)Z", line = 137)
    public final boolean method157(boolean arg0) {
        field294++;
        boolean var2 = true;
        if (!this.field305.method3849(this.field302.field3955, arg0)) {
            var2 = false;
        }
        if (!this.field304.method3849(this.field302.field3955, false)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)Z", line = 154)
    public static final boolean method163(int arg0, int arg1, int arg2) {
        field297++;
        if (arg1 == 0) {
            return (arg0 & 0x40000) != 0 | class595.method3345(true, arg2, arg0) || class154.method835(arg0, arg2, 55);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)V", line = 167)
    public final void method155(boolean arg0, int arg1) {
        field301++;
        if (arg1 != -3563) {
            this.field305 = null;
        }
        if (arg0) {
            int var3 = this.field302.field3963.method1426(class267.field3329, this.field302.field3964, -1) + this.field302.field3966;
            int var4 = this.field302.field3954.method3625(this.field302.field3959, class87.field873, 0) + this.field302.field3960;
            this.field299.method2313(null, null, 0, -94, this.field302.field3952, this.field302.field3957, this.field302.field3964, var4, this.field302.field3959, this.field302.field3961, this.field302.field3962, this.field302.field3958, var3, this.field302.field3956, 0, null);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IBI)V", line = 187)
    public static final void method164(int arg0, byte arg1, int arg2) {
        field300++;
        class76 var3 = class3.method28(6, (byte) 42, arg0);
        int var4 = 33 / ((52 - arg1) / 43);
        var3.method403((byte) 110);
        var3.field785 = arg2;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Ltf;Ltf;Lig;)V", line = 199)
    public class31(class701 arg0, class701 arg1, class322 arg2) {
        this.field305 = arg0;
        this.field302 = arg2;
        this.field304 = arg1;
    }
}
