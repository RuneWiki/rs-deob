import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class718 extends class118 implements class457 {

    @OriginalMember(owner = "client!jga", name = "S", descriptor = "Z")
    private boolean field9992 = false;

    @OriginalMember(owner = "client!jga", name = "jb", descriptor = "Ljfa;")
    public class292 field10009;

    @OriginalMember(owner = "client!jga", name = "X", descriptor = "Z")
    private boolean field9997;

    @OriginalMember(owner = "client!jga", name = "Q", descriptor = "Lkg;")
    public static class275 field9990 = new class275(36, 4);

    @OriginalMember(owner = "client!jga", name = "eb", descriptor = "I")
    public static int field10004 = -1;

    @OriginalMember(owner = "client!jga", name = "ab", descriptor = "I")
    public static int field10000;

    @OriginalMember(owner = "client!jga", name = "bb", descriptor = "I")
    public static int field10001;

    @OriginalMember(owner = "client!jga", name = "cb", descriptor = "I")
    public static int field10002;

    @OriginalMember(owner = "client!jga", name = "fb", descriptor = "I")
    public static int field10005;

    @OriginalMember(owner = "client!jga", name = "gb", descriptor = "I")
    public static int field10006;

    @OriginalMember(owner = "client!jga", name = "hb", descriptor = "I")
    public static int field10007;

    @OriginalMember(owner = "client!jga", name = "ib", descriptor = "I")
    public static int field10008;

    @OriginalMember(owner = "client!jga", name = "kb", descriptor = "I")
    public static int field10010;

    @OriginalMember(owner = "client!jga", name = "lb", descriptor = "I")
    public static int field10011;

    @OriginalMember(owner = "client!jga", name = "J", descriptor = "I")
    public static int field9985;

    @OriginalMember(owner = "client!jga", name = "L", descriptor = "I")
    public static int field9986;

    @OriginalMember(owner = "client!jga", name = "M", descriptor = "I")
    public static int field9987;

    @OriginalMember(owner = "client!jga", name = "N", descriptor = "I")
    public static int field9988;

    @OriginalMember(owner = "client!jga", name = "R", descriptor = "I")
    public static int field9991;

    @OriginalMember(owner = "client!jga", name = "T", descriptor = "I")
    public static int field9993;

    @OriginalMember(owner = "client!jga", name = "U", descriptor = "I")
    public static int field9994;

    @OriginalMember(owner = "client!jga", name = "V", descriptor = "I")
    public static int field9995;

    @OriginalMember(owner = "client!jga", name = "W", descriptor = "I")
    public static int field9996;

    @OriginalMember(owner = "client!jga", name = "Y", descriptor = "I")
    public static int field9998;

    @OriginalMember(owner = "client!jga", name = "Z", descriptor = "I")
    public static int field9999;

    @OriginalMember(owner = "client!jga", name = "O", descriptor = "Lwg;")
    private class428 field9989;

    @OriginalMember(owner = "client!jga", name = "db", descriptor = "[I")
    public static int[] field10003;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILtd;)V", line = 3)
    public final void method4014(int arg0, class456 arg1) {
        this.field10009.method1749(-1, arg1);
        ++field9995;
        if (arg0 != 876931081) {
            this.field10009 = null;
        }
    }

    @OriginalMember(owner = "client!jga", name = "f", descriptor = "(B)V", line = 15)
    public final void method749(byte arg0) {
        if (arg0 > -41) {
            this.field9992 = false;
        }
        ++field9998;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Z)I", line = 26)
    public final int method758(boolean arg0) {
        if (!arg0) {
            this.method743(-57);
        }
        ++field10007;
        return this.field10009.field3831;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(BILha;I)Z", line = 40)
    public final boolean method752(byte arg0, int arg1, class60 arg2, int arg3) {
        ++field10010;
        class474 var5 = this.field10009.method1752(false, arg2, true, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg0 > -41) {
                field10004 = 98;
            }
            class631 var6 = arg2.method531();
            var6.method596(super.field5801, super.field5800, super.field5797);
            return class232.field3053 ? var5.method275(arg1, arg3, var6, false, 0, class286.field3600) : var5.method258(arg1, arg3, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "(ILha;)Lwg;", line = 62)
    public final class428 method750(int arg0, class60 arg1) {
        ++field9991;
        if (arg0 > -22) {
            this.method743(-66);
        }
        return this.field9989;
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lha;Lac;IIIIIZII)V", line = 73)
    public class718(class60 arg0, class543 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field7560);
        this.field10009 = new class292(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field9997 = arg1.field7550 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!jga", name = "k", descriptor = "(I)V", line = 85)
    public static void method4015(int arg0) {
        field9990 = null;
        field10003 = null;
        if (arg0 != -1781807287) {
            field10003 = null;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lrl;Lac;Lcc;BIIII)V", line = 97)
    public static final void method4016(class724 arg0, class543 arg1, class733 arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 85) {
            method4015(-26);
        }
        ++field9996;
        class357 var8 = new class357();
        var8.field4593 = arg7 << 9;
        var8.field4612 = arg5;
        var8.field4597 = arg6 << 9;
        if (arg1 == null) {
            if (arg2 != null) {
                var8.field4592 = arg2;
                class131 var11 = arg2.field10192;
                if (var11.field1899 != null) {
                    var8.field4599 = true;
                    var11 = var11.method981(93, class516.field7236);
                }
                if (var11 != null) {
                    var8.field4598 = var11.field1918 + arg6 << 9;
                    var8.field4607 = var11.field1918 + arg7 << 9;
                    var8.field4611 = class646.method3621(arg2, arg3 + -85);
                    var8.field4615 = var11.field1864;
                    var8.field4602 = var11.field1885;
                    var8.field4614 = var11.field1865;
                    var8.field4595 = var11.field1884;
                    var8.field4590 = var11.field1889 << 9;
                    var8.field4589 = var11.field1860 << 9;
                }
                class757.field10561.method3671(var8, false);
            } else if (arg0 != null) {
                var8.field4618 = arg0;
                var8.field4607 = arg7 - -arg0.method82((byte) 49) << 9;
                var8.field4598 = arg0.method82((byte) 49) + arg6 << 9;
                var8.field4611 = class469.method2666(arg0, -28557);
                var8.field4590 = arg0.field10080 << 9;
                var8.field4614 = arg0.field10087;
                var8.field4602 = arg0.field10067;
                var8.field4589 = 0;
                var8.field4615 = 256;
                var8.field4595 = 256;
                class600.field8352.method1153(var8, (long) arg0.field189, -1);
            }
        } else {
            var8.field4604 = arg1;
            int var9 = arg1.field7520;
            int var10 = arg1.field7534;
            if (~arg4 == -2 || arg4 == 3) {
                var10 = arg1.field7520;
                var9 = arg1.field7534;
            }
            var8.field4606 = arg1.field7587;
            var8.field4596 = arg1.field7564;
            var8.field4591 = arg1.field7588;
            var8.field4589 = arg1.field7575 << 9;
            var8.field4615 = arg1.field7567;
            var8.field4595 = arg1.field7538;
            var8.field4602 = arg1.field7549;
            var8.field4598 = arg6 + var10 << 9;
            var8.field4590 = arg1.field7576 << 9;
            var8.field4603 = arg1.field7582;
            var8.field4611 = arg1.field7589;
            var8.field4607 = arg7 + var9 << 9;
            var8.field4614 = arg1.field7591;
            if (arg1.field7541 != null) {
                var8.field4599 = true;
                var8.method2072(0);
            }
            if (var8.field4606 != null) {
                var8.field4605 = var8.field4603 - -((int) (Math.random() * (double) (-var8.field4603 + var8.field4596)));
            }
            class482.field6546.method3671(var8, false);
        }
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(Lha;I)Ljk;", line = 210)
    public final class635 method755(class60 arg0, int arg1) {
        ++field9987;
        class474 var3 = this.field10009.method1752(true, arg0, true, 2048, false);
        if (var3 == null) {
            return null;
        } else {
            class631 var4 = arg0.method531();
            var4.method596(super.field5801, super.field5800, super.field5797);
            class635 var5 = class510.method2982(this.field9997, 0, 1);
            int var6 = -105 / ((-39 - arg1) / 55);
            int var7 = super.field5801 >> 9;
            int var8 = super.field5797 >> 9;
            this.field10009.method1745(var8, var8, var4, true, var3, arg0, var7, var7, false);
            if (class232.field3053) {
                var3.method255(var4, var5.field8760[0], class286.field3600, 0);
            } else {
                var3.method250(var4, var5.field8760[0], 0);
            }
            if (this.field10009.field3839 != null) {
                class741 var9 = this.field10009.field3839.method2969();
                if (!class232.field3053) {
                    arg0.method455(var9);
                } else {
                    arg0.method545(var9, class286.field3600);
                }
            }
            this.field9992 = var3.method287() || this.field10009.field3839 != null;
            if (this.field9989 == null) {
                this.field9989 = class43.method309(super.field5800, var3, super.field5797, super.field5801, -58);
            } else {
                class654.method3675((byte) -118, this.field9989, var3, super.field5801, super.field5800, super.field5797);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jga", name = "g", descriptor = "(B)Z", line = 262)
    public final boolean method83(byte arg0) {
        if (arg0 != -69) {
            this.method745((byte) 10);
        }
        ++field10002;
        return false;
    }

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "(B)I", line = 274)
    public final int method87(byte arg0) {
        if (arg0 != 121) {
            this.method744((class60) null, -98);
        }
        ++field9993;
        return this.field10009.method1750(arg0 + -118);
    }

    @OriginalMember(owner = "client!jga", name = "f", descriptor = "(I)Z", line = 285)
    public final boolean method759(int arg0) {
        ++field9999;
        if (arg0 != 0) {
            this.method87((byte) -35);
        }
        return false;
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(B)V", line = 296)
    public final void method746(byte arg0) {
        if (arg0 < 82) {
            this.method84(5);
        }
        ++field9985;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lha;I)V", line = 306)
    public final void method744(class60 arg0, int arg1) {
        ++field9994;
        if (arg1 != 0) {
            field9990 = null;
        }
        class474 var3 = this.field10009.method1752(true, arg0, true, 262144, true);
        if (var3 != null) {
            int var4 = super.field5801 >> 9;
            int var5 = super.field5797 >> 9;
            class631 var6 = arg0.method531();
            var6.method596(super.field5801, super.field5800, super.field5797);
            this.field10009.method1745(var5, var5, var6, false, var3, arg0, var4, var4, false);
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILha;)V", line = 332)
    public final void method761(int arg0, class60 arg1) {
        this.field10009.method1747(arg1, 10625);
        int var3 = 120 / ((arg0 - 63) / 51);
        ++field9986;
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(ILha;)V", line = 351)
    public final void method760(int arg0, class60 arg1) {
        ++field10005;
        this.field10009.method1746(2, arg1);
        if (arg0 != -31507) {
            this.method758(true);
        }
    }

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "(I)Z", line = 365)
    public final boolean method85(int arg0) {
        ++field10000;
        return arg0 >= -79 ? true : this.field9992;
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)Z", line = 376)
    public final boolean method756(int arg0) {
        ++field9988;
        return arg0 >= -52 ? false : this.field10009.method1748(-27353);
    }

    @OriginalMember(owner = "client!jga", name = "h", descriptor = "(I)I", line = 388)
    public final int method84(int arg0) {
        ++field10001;
        if (arg0 != 1027) {
            this.field9992 = true;
        }
        return this.field10009.method1744((byte) -20);
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IILrba;Lha;ZII)V", line = 399)
    public final void method754(int arg0, int arg1, class435 arg2, class60 arg3, boolean arg4, int arg5, int arg6) {
        ++field10011;
        if (arg0 != 30558) {
            method4016((class724) null, (class543) null, (class733) null, (byte) 114, 69, -49, -45, -107);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)I", line = 411)
    public final int method743(int arg0) {
        if (arg0 != -30968) {
            this.field10009 = null;
        }
        ++field10008;
        return this.field10009.field3819;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)I", line = 424)
    public final int method745(byte arg0) {
        int var2 = -119 % ((arg0 - -33) / 56);
        ++field10006;
        return this.field10009.field3824;
    }
}
