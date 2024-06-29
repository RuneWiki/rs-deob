import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class681 extends class253 implements class466 {

    @OriginalMember(owner = "client!gr", name = "yb", descriptor = "Z")
    private boolean field9552 = false;

    @OriginalMember(owner = "client!gr", name = "mb", descriptor = "Lwm;")
    public class443 field9540;

    @OriginalMember(owner = "client!gr", name = "hb", descriptor = "Z")
    private boolean field9535;

    @OriginalMember(owner = "client!gr", name = "ab", descriptor = "I")
    public static int field9528;

    @OriginalMember(owner = "client!gr", name = "bb", descriptor = "I")
    public static int field9529;

    @OriginalMember(owner = "client!gr", name = "cb", descriptor = "I")
    public static int field9530;

    @OriginalMember(owner = "client!gr", name = "db", descriptor = "I")
    public static int field9531;

    @OriginalMember(owner = "client!gr", name = "eb", descriptor = "I")
    public static int field9532;

    @OriginalMember(owner = "client!gr", name = "fb", descriptor = "I")
    public static int field9533;

    @OriginalMember(owner = "client!gr", name = "gb", descriptor = "I")
    public static int field9534;

    @OriginalMember(owner = "client!gr", name = "ib", descriptor = "I")
    public static int field9536;

    @OriginalMember(owner = "client!gr", name = "jb", descriptor = "I")
    public static int field9537;

    @OriginalMember(owner = "client!gr", name = "kb", descriptor = "I")
    public static int field9538;

    @OriginalMember(owner = "client!gr", name = "lb", descriptor = "I")
    public static int field9539;

    @OriginalMember(owner = "client!gr", name = "nb", descriptor = "I")
    public static int field9541;

    @OriginalMember(owner = "client!gr", name = "ob", descriptor = "I")
    public static int field9542;

    @OriginalMember(owner = "client!gr", name = "pb", descriptor = "I")
    public static int field9543;

    @OriginalMember(owner = "client!gr", name = "qb", descriptor = "I")
    public static int field9544;

    @OriginalMember(owner = "client!gr", name = "rb", descriptor = "I")
    public static int field9545;

    @OriginalMember(owner = "client!gr", name = "sb", descriptor = "I")
    public static int field9546;

    @OriginalMember(owner = "client!gr", name = "tb", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!gr", name = "ub", descriptor = "I")
    public static int field9548;

    @OriginalMember(owner = "client!gr", name = "vb", descriptor = "I")
    public static int field9549;

    @OriginalMember(owner = "client!gr", name = "wb", descriptor = "I")
    public static int field9550;

    @OriginalMember(owner = "client!gr", name = "xb", descriptor = "Ltja;")
    private class491 field9551;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "(B)I", line = 4)
    public final int method78(byte arg0) {
        if (arg0 >= -31) {
            return 4;
        } else {
            ++field9543;
            return this.field9540.method2664((byte) 109);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILha;)Lrk;", line = 15)
    public final class289 method74(int arg0, class473 arg1) {
        ++field9531;
        class231 var3 = this.field9540.method2660((byte) -88, false, arg1, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 <= 75) {
                this.method81((byte) -58);
            }
            class12 var4 = arg1.method153();
            var4.method50(super.field3470, super.field3464, super.field3460);
            class289 var5 = class122.method863(1, (byte) 102, this.field9535);
            this.field9540.method2667(super.field3758, super.field3754, 1, super.field3745, true, super.field3755, arg1, var3, var4);
            if (class529.field7284) {
                var3.method1580(var4, var5.field4255[0], class775.field10662, 0);
            } else {
                var3.method1586(var4, var5.field4255[0], 0);
            }
            if (this.field9540.field6127 != null) {
                class714 var6 = this.field9540.field6127.method2402();
                if (!class529.field7284) {
                    arg1.method253(var6);
                } else {
                    arg1.method134(var6, class775.field10662);
                }
            }
            this.field9552 = var3.method1575() || this.field9540.field6127 != null;
            if (this.field9551 != null) {
                class33.method276(super.field3470, this.field9551, false, super.field3460, var3, super.field3464);
            } else {
                this.field9551 = class486.method2885(super.field3470, super.field3464, var3, super.field3460, 29289);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "(I)Z", line = 62)
    public final boolean method80(int arg0) {
        ++field9545;
        if (arg0 < 63) {
            this.method74(-93, (class473) null);
        }
        return this.field9552;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(Lha;I)V", line = 73)
    public final void method76(class473 arg0, int arg1) {
        ++field9534;
        class231 var3 = this.field9540.method2660((byte) -88, true, arg0, 262144, true);
        int var4 = 82 % ((arg1 - -30) / 42);
        if (var3 != null) {
            class12 var5 = arg0.method153();
            var5.method50(super.field3470, super.field3464, super.field3460);
            this.field9540.method2667(super.field3758, super.field3754, 1, super.field3745, false, super.field3755, arg0, var3, var5);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lha;I)V", line = 94)
    public final void method757(class473 arg0, int arg1) {
        ++field9542;
        this.field9540.method2657((byte) 116, arg0);
        int var3 = 79 % ((13 - arg1) / 37);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILha;II)Z", line = 104)
    public final boolean method88(int arg0, class473 arg1, int arg2, int arg3) {
        ++field9539;
        class231 var5 = this.field9540.method2660((byte) -88, false, arg1, 131072, false);
        if (arg2 != -31634) {
            field9548 = 20;
        }
        if (var5 == null) {
            return false;
        } else {
            class12 var6 = arg1.method153();
            var6.method50(super.field3470, super.field3464, super.field3460);
            return class529.field7284 ? var5.method1570(arg0, arg3, var6, false, 0, class775.field10662) : var5.method1578(arg0, arg3, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)Z", line = 124)
    public final boolean method755(byte arg0) {
        if (arg0 != -111) {
            this.field9540 = null;
        }
        ++field9538;
        return this.field9540.method2663(10505);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lha;Z)V", line = 138)
    public final void method763(class473 arg0, boolean arg1) {
        this.field9540.method2658(10, arg0);
        if (arg1) {
            this.method89(-97);
        }
        ++field9532;
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lha;Lro;IIIIIZIIIIIII)V", line = 149)
    public class681(class473 arg0, class286 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field4145 == -2, class83.method632(arg13, arg12, 0));
        this.field9540 = new class443(arg0, arg1, arg12, arg13, super.field3467, arg3, this, arg7, arg14);
        this.field9535 = ~arg1.field4137 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Laka;I)V", line = 158)
    public final void method3869(class413 arg0, int arg1) {
        ++field9546;
        this.field9540.method2654(arg0, 24841);
        if (arg1 != 0) {
            this.field9552 = false;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)I", line = 174)
    public final int method760(int arg0) {
        if (arg0 != -27640) {
            return -83;
        } else {
            ++field9533;
            return this.field9540.field6111;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "([SI)[S", line = 185)
    public static final short[] method3870(short[] arg0, int arg1) {
        ++field9550;
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class335.method2119(arg0, 0, var2, 0, arg0.length);
            if (arg1 > -37) {
                method3870((short[]) null, -115);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "(B)V", line = 204)
    public final void method81(byte arg0) {
        ++field9530;
        if (arg0 != 29) {
            this.field9540 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)I", line = 220)
    public final int method756(byte arg0) {
        ++field9537;
        int var2 = -44 % ((48 - arg0) / 51);
        return this.field9540.field6126;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)I", line = 230)
    public final int method762(boolean arg0) {
        if (!arg0) {
            this.method754(false);
        }
        ++field9529;
        return this.field9540.field6119;
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(I)I", line = 241)
    public final int method89(int arg0) {
        ++field9536;
        int var2 = -126 / ((69 - arg0) / 48);
        return this.field9540.method2661(-16897);
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(Lha;I)Ltja;", line = 252)
    public final class491 method72(class473 arg0, int arg1) {
        if (arg1 != -5047) {
            return null;
        } else {
            ++field9541;
            return this.field9551;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Loq;IZILha;II)V", line = 269)
    public final void method73(class230 arg0, int arg1, boolean arg2, int arg3, class473 arg4, int arg5, int arg6) {
        if (arg6 >= 96) {
            ++field9549;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "(I)Z", line = 282)
    public final boolean method77(int arg0) {
        if (arg0 != 25833) {
            this.method3869((class413) null, -12);
        }
        ++field9528;
        return false;
    }

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "(Z)Z", line = 295)
    public final boolean method83(boolean arg0) {
        if (arg0) {
            this.method83(true);
        }
        ++field9544;
        return false;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(Z)V", line = 310)
    public final void method754(boolean arg0) {
        if (arg0) {
            this.field9551 = null;
        }
        ++field9547;
    }
}
