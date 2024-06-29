import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class627 extends class118 implements class457 {

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "Z")
    private boolean field8622;

    @OriginalMember(owner = "client!eb", name = "kb", descriptor = "Z")
    private boolean field8643;

    @OriginalMember(owner = "client!eb", name = "lb", descriptor = "B")
    private byte field8644;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "S")
    private short field8626;

    @OriginalMember(owner = "client!eb", name = "jb", descriptor = "Z")
    private boolean field8642;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "Z")
    private boolean field8627;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "Lr;")
    private class185 field8632;

    @OriginalMember(owner = "client!eb", name = "fb", descriptor = "Lka;")
    private class474 field8638;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    public static int field8615;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public static int field8617;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public static int field8620;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public static int field8628;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    public static int field8630;

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
    public static int field8631;

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "I")
    public static int field8633;

    @OriginalMember(owner = "client!eb", name = "bb", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!eb", name = "cb", descriptor = "I")
    public static int field8635;

    @OriginalMember(owner = "client!eb", name = "eb", descriptor = "I")
    public static int field8637;

    @OriginalMember(owner = "client!eb", name = "gb", descriptor = "I")
    public static int field8639;

    @OriginalMember(owner = "client!eb", name = "hb", descriptor = "I")
    public static int field8640;

    @OriginalMember(owner = "client!eb", name = "ib", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "Lwg;")
    private class428 field8623;

    @OriginalMember(owner = "client!eb", name = "db", descriptor = "Lnd;")
    public static class547 field8636;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lha;I)V")
    public final void method744(class60 arg0, int arg1) {
        if (arg1 == 0) {
            ++field8625;
        }
    }

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)I")
    public final int method84(int arg0) {
        if (arg0 != 1027) {
            return -93;
        } else {
            ++field8617;
            return this.field8638 != null ? this.field8638.method248() : 0;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)I")
    public final int method743(int arg0) {
        if (arg0 != -30968) {
            this.method83((byte) -53);
        }
        ++field8618;
        return this.field8644;
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(B)V")
    public final void method749(byte arg0) {
        ++field8629;
        if (arg0 >= -41) {
            this.method758(true);
        }
        this.field8622 = false;
        if (this.field8638 != null) {
            this.field8638.method266(-65537 & this.field8638.method272());
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)I")
    public final int method87(byte arg0) {
        if (arg0 != 121) {
            return 120;
        } else {
            ++field8634;
            return this.field8638 == null ? 0 : this.field8638.method286();
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
    public final void method746(byte arg0) {
        if (arg0 < 82) {
            this.method755((class60) null, 74);
        }
        ++field8619;
        if (this.field8638 != null) {
            this.field8638.method243();
        }
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(B)Z")
    public final boolean method83(byte arg0) {
        ++field8624;
        if (arg0 != -69) {
            return true;
        } else if (this.field8638 == null) {
            return true;
        } else {
            return !this.field8638.method244();
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(ILha;)V")
    public final void method760(int arg0, class60 arg1) {
        if (arg0 == -31507) {
            ++field8633;
            Object var3 = null;
            class185 var5;
            if (this.field8632 == null && this.field8627) {
                class257 var4 = this.method3517(true, -126, 262144, arg1);
                var5 = var4 != null ? var4.field3264 : null;
            } else {
                var5 = this.field8632;
                this.field8632 = null;
            }
            if (var5 != null) {
                class549.method3194(var5, super.field5793, super.field5801, super.field5797, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(ILha;)Lwg;")
    public final class428 method750(int arg0, class60 arg1) {
        if (this.field8623 == null) {
            this.field8623 = class43.method309(super.field5800, this.method3516(-1, 0, arg1), super.field5797, super.field5801, -121);
        }
        if (arg0 > -22) {
            return null;
        } else {
            ++field8631;
            return this.field8623;
        }
    }

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "(I)V")
    public static void method3515(int arg0) {
        field8636 = null;
        if (arg0 != 0) {
            method3515(111);
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Lha;I)Ljk;")
    public final class635 method755(class60 arg0, int arg1) {
        ++field8621;
        if (this.field8638 == null) {
            return null;
        } else {
            class631 var3 = arg0.method531();
            var3.method596(super.field5801, super.field5800, super.field5797);
            class635 var4 = class510.method2982(this.field8642, 0, 1);
            int var5 = -45 / ((-39 - arg1) / 55);
            if (!class232.field3053) {
                this.field8638.method250(var3, var4.field8760[0], 0);
            } else {
                this.field8638.method255(var3, var4.field8760[0], class286.field3600, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)Z")
    public final boolean method756(int arg0) {
        ++field8641;
        if (arg0 >= -52) {
            this.field8643 = true;
        }
        return this.field8627;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILha;)Lka;")
    private final class474 method3516(int arg0, int arg1, class60 arg2) {
        ++field8630;
        if (arg0 != -1) {
            this.field8623 = null;
        }
        if (this.field8638 != null && ~arg2.method542(this.field8638.method272(), arg1) == -1) {
            return this.field8638;
        } else {
            class257 var4 = this.method3517(false, -118, arg1, arg2);
            return var4 != null ? var4.field3263 : null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)Z")
    public final boolean method85(int arg0) {
        if (arg0 >= -79) {
            return true;
        } else {
            ++field8635;
            return this.field8638 == null ? false : this.field8638.method287();
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILha;)V")
    public final void method761(int arg0, class60 arg1) {
        ++field8639;
        Object var3 = null;
        class185 var5;
        if (this.field8632 == null && this.field8627) {
            class257 var4 = this.method3517(true, -114, 262144, arg1);
            var5 = var4 != null ? var4.field3264 : null;
        } else {
            var5 = this.field8632;
            this.field8632 = null;
        }
        if (var5 != null) {
            class739.method4116(var5, super.field5793, super.field5801, super.field5797, (boolean[]) null);
        }
        int var6 = 36 % ((arg0 - 63) / 51);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILrba;Lha;ZII)V")
    public final void method754(int arg0, int arg1, class435 arg2, class60 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 == 30558) {
            if (arg2 instanceof class627) {
                class627 var8 = (class627) arg2;
                if (this.field8638 != null && var8.field8638 != null) {
                    this.field8638.method241(var8.field8638, arg6, arg1, arg5, arg4);
                }
            }
            ++field8640;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)I")
    public final int method745(byte arg0) {
        ++field8637;
        int var2 = 10 / ((-33 - arg0) / 56);
        return 65535 & this.field8626;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZIILha;)Lok;")
    private final class257 method3517(boolean arg0, int arg1, int arg2, class60 arg3) {
        ++field8620;
        if (arg1 > -91) {
            return null;
        } else {
            class543 var5 = client.field3995.method3384(this.field8626 & 65535, false);
            class282 var6;
            class282 var7;
            if (this.field8643) {
                var6 = class395.field5009[super.field5793];
                var7 = class707.field9826[0];
            } else {
                var6 = class707.field9826[super.field5793];
                if (~super.field5793 > -4) {
                    var7 = class707.field9826[super.field5793 + 1];
                } else {
                    var7 = null;
                }
            }
            return var5.method3118(var7, super.field5797, this.field8644, 22, var6, super.field5800, arg3, arg2, -125, arg0, super.field5801, (class456) null);
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lha;Lac;IIIIIZIZ)V")
    public class627(class60 arg0, class543 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field7560);
        this.field8622 = arg9;
        this.field8643 = arg7;
        super.field5797 = arg6;
        this.field8644 = (byte) arg8;
        this.field8626 = (short) arg1.field7586;
        this.field8642 = arg1.field7550 != 0 && !arg7;
        super.field5801 = arg4;
        this.field8627 = arg0.method467() && arg1.field7504 && !this.field8643 && ~class748.field10451.field10410.method3447((byte) -124) != -1;
        int var11 = 2048;
        if (this.field8622) {
            var11 |= 65536;
        }
        class257 var12 = this.method3517(this.field8627, -114, var11, arg0);
        if (var12 != null) {
            this.field8632 = var12.field3264;
            this.field8638 = var12.field3263;
            if (this.field8622) {
                this.field8638 = this.field8638.method273((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)I")
    public final int method758(boolean arg0) {
        ++field8616;
        return !arg0 ? -9 : 22;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BILha;I)Z")
    public final boolean method752(byte arg0, int arg1, class60 arg2, int arg3) {
        ++field8628;
        if (arg0 >= -41) {
            return false;
        } else {
            class474 var5 = this.method3516(-1, 131072, arg2);
            if (var5 != null) {
                class631 var6 = arg2.method531();
                var6.method596(super.field5801, super.field5800, super.field5797);
                return !class232.field3053 ? var5.method258(arg1, arg3, var6, false, 0) : var5.method275(arg1, arg3, var6, false, 0, class286.field3600);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)Z")
    public final boolean method759(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field8615;
            return this.field8622;
        }
    }
}
