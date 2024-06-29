import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class115 extends class6 {

    @OriginalMember(owner = "client!qd", name = "ud", descriptor = "I")
    public int field2630 = 0;

    @OriginalMember(owner = "client!qd", name = "zd", descriptor = "I")
    public int field2635 = 0;

    @OriginalMember(owner = "client!qd", name = "Gd", descriptor = "I")
    public int field2642 = -1;

    @OriginalMember(owner = "client!qd", name = "Fd", descriptor = "I")
    public int field2641 = 0;

    @OriginalMember(owner = "client!qd", name = "Vd", descriptor = "I")
    public int field2657 = 0;

    @OriginalMember(owner = "client!qd", name = "Yd", descriptor = "I")
    public int field2660 = -1;

    @OriginalMember(owner = "client!qd", name = "Td", descriptor = "I")
    public int field2655 = 0;

    @OriginalMember(owner = "client!qd", name = "be", descriptor = "Z")
    public boolean field2663 = false;

    @OriginalMember(owner = "client!qd", name = "xd", descriptor = "Lja;")
    public static class62 field2633 = class30.method243(43, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!qd", name = "Dd", descriptor = "Lja;")
    public static class62 field2639 = class30.method243(43, ")1j");

    @OriginalMember(owner = "client!qd", name = "Md", descriptor = "Lja;")
    public static class62 field2648 = class30.method243(43, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!qd", name = "Od", descriptor = "Lja;")
    private static class62 field2650 = class30.method243(43, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!qd", name = "Pd", descriptor = "I")
    public static int field2651 = 0;

    @OriginalMember(owner = "client!qd", name = "sd", descriptor = "Lja;")
    public static class62 field2628 = class30.method243(43, "scrollbar");

    @OriginalMember(owner = "client!qd", name = "wd", descriptor = "Lja;")
    public static class62 field2632 = class30.method243(43, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!qd", name = "Ud", descriptor = "Lja;")
    public static class62 field2656 = field2650;

    @OriginalMember(owner = "client!qd", name = "de", descriptor = "Lja;")
    public static class62 field2665 = class30.method243(43, "jolt");

    @OriginalMember(owner = "client!qd", name = "rd", descriptor = "I")
    public int field2627;

    @OriginalMember(owner = "client!qd", name = "td", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!qd", name = "vd", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!qd", name = "yd", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!qd", name = "Ad", descriptor = "I")
    public int field2636;

    @OriginalMember(owner = "client!qd", name = "Bd", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!qd", name = "Cd", descriptor = "I")
    public int field2638;

    @OriginalMember(owner = "client!qd", name = "Hd", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!qd", name = "Jd", descriptor = "I")
    public int field2645;

    @OriginalMember(owner = "client!qd", name = "Kd", descriptor = "I")
    public int field2646;

    @OriginalMember(owner = "client!qd", name = "Ld", descriptor = "I")
    public int field2647;

    @OriginalMember(owner = "client!qd", name = "Nd", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!qd", name = "Qd", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!qd", name = "Sd", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!qd", name = "Xd", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!qd", name = "Zd", descriptor = "I")
    public int field2661;

    @OriginalMember(owner = "client!qd", name = "ae", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!qd", name = "ce", descriptor = "I")
    public int field2664;

    @OriginalMember(owner = "client!qd", name = "ee", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!qd", name = "qd", descriptor = "Lqa;")
    public class111 field2626;

    @OriginalMember(owner = "client!qd", name = "Wd", descriptor = "Lvb;")
    public class145 field2658;

    @OriginalMember(owner = "client!qd", name = "Rd", descriptor = "Lja;")
    public class62 field2653;

    @OriginalMember(owner = "client!qd", name = "Ed", descriptor = "[I")
    public static int[] field2640;

    @OriginalMember(owner = "client!qd", name = "Id", descriptor = "[Lic;")
    public static class58[] field2644;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIIIIB)V")
    public static final void method936(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        if (arg9 != -29) {
            field2648 = null;
        }
        ++field2634;
        class131 var10 = null;
        for (class131 var11 = (class131) class138.field3217.method840(true); var11 != null; var11 = (class131) class138.field3217.method841((byte) 18)) {
            if (var11.field3005 == arg8 && ~var11.field2989 == ~arg0 && var11.field3002 == arg2 && var11.field3000 == arg6) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class131();
            var10.field3000 = arg6;
            var10.field3002 = arg2;
            var10.field3005 = arg8;
            var10.field2989 = arg0;
            class6.method65(var10, (byte) 93);
            class138.field3217.method847(var10, (byte) 93);
        }
        var10.field2985 = arg1;
        var10.field2994 = arg5;
        var10.field2986 = arg7;
        var10.field2998 = arg3;
        var10.field2996 = arg4;
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(B)Lvb;")
    public final class145 method321(byte arg0) {
        ++field2654;
        if (this.field2626 == null) {
            return null;
        } else {
            class12 var2 = super.field177 != -1 && ~super.field155 == -1 ? class141.method1121(super.field177, arg0 + -24735) : null;
            class12 var3 = super.field191 == -1 || this.field2663 || super.field191 == super.field178 && var2 != null ? null : class141.method1121(super.field191, -24732);
            class145 var4 = this.field2626.method898((byte) -117, var3, var2, super.field161, super.field169);
            if (var4 == null) {
                return null;
            } else {
                var4.method1163();
                super.field165 = var4.field3265;
                if (!this.field2663 && ~super.field195 != 0 && ~super.field184 != 0) {
                    class145 var5 = class38.method289(super.field195, arg0 ^ 2119).method961(super.field184, -110);
                    if (var5 != null) {
                        class145[] var6 = new class145[] { var4, var5 };
                        var5.method1159(0, -super.field196, 0);
                        var4 = new class145(var6, 2);
                    }
                }
                if (!this.field2663 && this.field2658 != null) {
                    if (~this.field2635 >= ~class86.field2060) {
                        this.field2658 = null;
                    }
                    if (class86.field2060 >= this.field2657 && this.field2635 > class86.field2060) {
                        class145 var7 = this.field2658;
                        class145[] var8 = new class145[] { var4, var7 };
                        var7.method1159(-super.field136 + this.field2646, -this.field2638 + this.field2647, -super.field134 + this.field2645);
                        if (~super.field137 == -513) {
                            var7.method1150();
                            var7.method1150();
                            var7.method1150();
                        } else if (~super.field137 == -1025) {
                            var7.method1150();
                            var7.method1150();
                        } else if (super.field137 == 1536) {
                            var7.method1150();
                        }
                        var4 = new class145(var8, 2);
                        if (super.field137 == 512) {
                            var7.method1150();
                        } else if (super.field137 != 1024) {
                            if (super.field137 == 1536) {
                                var7.method1150();
                                var7.method1150();
                                var7.method1150();
                            }
                        } else {
                            var7.method1150();
                            var7.method1150();
                        }
                        var7.method1159(-this.field2646 + super.field136, -this.field2647 + this.field2638, -this.field2645 + super.field134);
                    }
                }
                if (arg0 != 3) {
                    this.field2646 = 75;
                }
                var4.field3373 = true;
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "(B)Z")
    public final boolean method66(byte arg0) {
        if (arg0 != -24) {
            this.method939((class128) null, -45);
        }
        ++field2662;
        return this.field2626 != null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIBI)I")
    public static final int method937(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 <= 68) {
            method938(false);
        }
        ++field2652;
        if (arg1 > 179) {
            arg0 /= 2;
        }
        if (arg1 > 192) {
            arg0 /= 2;
        }
        if (~arg1 < -218) {
            arg0 /= 2;
        }
        if (~arg1 < -244) {
            arg0 /= 2;
        }
        return arg1 / 2 + (arg0 / 32 << 7) + (arg3 / 4 << 10);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public static void method938(boolean arg0) {
        field2650 = null;
        field2632 = null;
        field2628 = null;
        field2633 = null;
        field2639 = null;
        field2644 = null;
        if (arg0) {
            field2648 = null;
        }
        field2640 = null;
        field2656 = null;
        field2665 = null;
        field2648 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ls;I)V")
    public final void method939(class128 arg0, int arg1) {
        ++field2631;
        arg0.field2873 = 0;
        int var3 = arg0.method1025(255);
        this.field2660 = arg0.method1028(arg1 + -115487258);
        int[] var4 = new int[12];
        this.field2642 = arg0.method1028(-115487256);
        int var5 = -1;
        this.field2655 = 0;
        for (int var6 = 0; var6 < 12; ++var6) {
            int var7 = arg0.method1025(255);
            if (~var7 == -1) {
                var4[var6] = 0;
            } else {
                int var8 = arg0.method1025(255);
                var4[var6] = (var7 << 8) - -var8;
                if (var6 == 0 && ~var4[0] == -65536) {
                    var5 = arg0.method1041(212464720);
                    break;
                }
                if (~var4[var6] <= -513) {
                    int var12 = class140.method1114(var4[var6] + -512, false).field541;
                    if (~var12 != -1) {
                        this.field2655 = var12;
                    }
                }
            }
        }
        if (arg1 != 2) {
            method938(true);
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; ++var10) {
            int var11 = arg0.method1025(arg1 + 253);
            if (~var11 > -1 || class79.field1929[var10].length <= var11) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field178 = arg0.method1041(212464720);
        if (~super.field178 == -65536) {
            super.field178 = -1;
        }
        super.field153 = arg0.method1041(212464720);
        if (~super.field153 == -65536) {
            super.field153 = -1;
        }
        super.field152 = super.field153;
        super.field190 = arg0.method1041(arg1 ^ 212464722);
        if (~super.field190 == -65536) {
            super.field190 = -1;
        }
        super.field167 = arg0.method1041(212464720);
        if (super.field167 == 65535) {
            super.field167 = -1;
        }
        super.field151 = arg0.method1041(212464720);
        if (super.field151 == 65535) {
            super.field151 = -1;
        }
        super.field163 = arg0.method1041(212464720);
        if (super.field163 == 65535) {
            super.field163 = -1;
        }
        super.field135 = arg0.method1041(212464720);
        if (super.field135 == 65535) {
            super.field135 = -1;
        }
        this.field2653 = class111.method899(false, arg0.method1030(arg1 ^ 123)).method462(111);
        this.field2641 = arg0.method1025(255);
        this.field2630 = arg0.method1041(212464720);
        if (this.field2626 == null) {
            this.field2626 = new class111();
        }
        this.field2626.method903(var4, var9, ~var3 == -2, var5, arg1 + -2);
    }
}
