import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class610 extends class244 implements class670 {

    @OriginalMember(owner = "client!gba", name = "L", descriptor = "S")
    private short field8633;

    @OriginalMember(owner = "client!gba", name = "t", descriptor = "Z")
    private boolean field8615;

    @OriginalMember(owner = "client!gba", name = "o", descriptor = "B")
    private byte field8610;

    @OriginalMember(owner = "client!gba", name = "y", descriptor = "B")
    private byte field8620;

    @OriginalMember(owner = "client!gba", name = "J", descriptor = "Z")
    private boolean field8631;

    @OriginalMember(owner = "client!gba", name = "s", descriptor = "B")
    private byte field8614;

    @OriginalMember(owner = "client!gba", name = "I", descriptor = "Z")
    private boolean field8630;

    @OriginalMember(owner = "client!gba", name = "M", descriptor = "Z")
    private boolean field8634;

    @OriginalMember(owner = "client!gba", name = "n", descriptor = "Lba;")
    public class350 field8609;

    @OriginalMember(owner = "client!gba", name = "C", descriptor = "Lw;")
    private class269 field8624;

    @OriginalMember(owner = "client!gba", name = "B", descriptor = "Lgl;")
    public static class547 field8623 = new class547(3, 3);

    @OriginalMember(owner = "client!gba", name = "x", descriptor = "F")
    public static float field8619;

    @OriginalMember(owner = "client!gba", name = "l", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!gba", name = "m", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
    public static int field8612;

    @OriginalMember(owner = "client!gba", name = "r", descriptor = "I")
    public static int field8613;

    @OriginalMember(owner = "client!gba", name = "u", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!gba", name = "v", descriptor = "I")
    public static int field8617;

    @OriginalMember(owner = "client!gba", name = "w", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!gba", name = "A", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!gba", name = "D", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!gba", name = "E", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!gba", name = "F", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!gba", name = "G", descriptor = "I")
    public static int field8628;

    @OriginalMember(owner = "client!gba", name = "H", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!gba", name = "N", descriptor = "I")
    public static int field8635;

    @OriginalMember(owner = "client!gba", name = "O", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!gba", name = "K", descriptor = "Lgr;")
    private class396 field8632;

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Loa;Lbfa;IIIIZIIZ)V")
    public class610(class635 arg0, class335 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class278.method1585((byte) -74, arg7, arg8));
        this.field8633 = (short) arg1.field4324;
        this.field8615 = arg6;
        super.field3161 = arg5;
        this.field8610 = (byte) arg7;
        this.field8620 = (byte) arg8;
        this.field8631 = arg9;
        this.field8614 = (byte) arg2;
        super.field3160 = arg3;
        this.field8630 = ~arg1.field4407 != -1 && !arg6;
        this.field8634 = arg0.method316() && arg1.field4349 && !this.field8615 && class601.field8530.method1317((byte) -116, class150.field1711) != 0;
        int var11 = 2048;
        if (this.field8631) {
            var11 |= 65536;
        }
        class671 var12 = this.method3402(var11, this.field8634, (byte) 119, arg0);
        if (var12 != null) {
            this.field8609 = var12.field9536;
            this.field8624 = var12.field9533;
            if (this.field8631) {
                this.field8609 = this.field8609.method602((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILoa;)Lba;")
    public final class350 method455(int arg0, int arg1, class635 arg2) {
        ++field8616;
        return arg1 >= -20 ? null : this.method3400(arg2, 15484, arg0);
    }

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "(Loa;I)V")
    public final void method451(class635 arg0, int arg1) {
        if (arg1 == 31055) {
            ++field8625;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Loa;II)Lba;")
    private final class350 method3400(class635 arg0, int arg1, int arg2) {
        ++field8621;
        if (arg1 != 15484) {
            return null;
        } else if (this.field8609 != null && arg0.method312(this.field8609.method902(), arg2) == 0) {
            return this.field8609;
        } else {
            class671 var4 = this.method3402(arg2, false, (byte) 80, arg0);
            return var4 == null ? null : var4.field9536;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method457(int arg0, int arg1, class635 arg2, int arg3) {
        if (arg1 != 1) {
            this.field8610 = 17;
        }
        ++field8618;
        class350 var5 = this.method3400(arg2, 15484, 131072);
        if (var5 != null) {
            class389 var6 = arg2.method297();
            var6.method228(super.field3160, super.field3159, super.field3161);
            return var5.method910(arg3, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "(B)Z")
    public final boolean method449(byte arg0) {
        ++field8626;
        return arg0 != -126 ? true : this.field8631;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Loa;B)V")
    public final void method446(class635 arg0, byte arg1) {
        ++field8613;
        Object var3 = null;
        class269 var5;
        if (this.field8624 == null && this.field8634) {
            class671 var4 = this.method3402(262144, true, (byte) 73, arg0);
            var5 = var4 == null ? null : var4.field9533;
        } else {
            var5 = this.field8624;
            this.field8624 = null;
        }
        if (arg1 > -126) {
            this.method454(-90);
        }
        if (var5 != null) {
            class533.method3038(var5, this.field8614, super.field3160, super.field3161, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(Loa;I)Lok;")
    public final class231 method442(class635 arg0, int arg1) {
        ++field8607;
        if (this.field8609 == null) {
            return null;
        } else {
            class389 var3 = arg0.method297();
            var3.method228(super.field3160, super.field3159, super.field3161);
            class231 var4 = null;
            if (this.field8630) {
                var4 = class526.method2993(1, 32671);
            }
            this.field8609.method904(var3, var4 == null ? null : var4.field2947[0], arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(B)I")
    public final int method447(byte arg0) {
        if (arg0 != -91) {
            return 11;
        } else {
            ++field8636;
            return this.field8610;
        }
    }

    @OriginalMember(owner = "client!gba", name = "g", descriptor = "(I)V")
    public static void method3401(int arg0) {
        field8623 = null;
        if (arg0 >= -58) {
            field8623 = null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)Z")
    public final boolean method454(int arg0) {
        if (arg0 < 49) {
            method3401(-37);
        }
        ++field8612;
        return this.field8634;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)I")
    public final int method444(byte arg0) {
        ++field8629;
        int var2 = 28 / ((7 - arg0) / 46);
        return 65535 & this.field8633;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Loa;I)V")
    public final void method456(class635 arg0, int arg1) {
        ++field8622;
        Object var3 = null;
        class269 var5;
        if (this.field8624 == null && this.field8634) {
            class671 var4 = this.method3402(262144, true, (byte) 121, arg0);
            var5 = var4 == null ? null : var4.field9533;
        } else {
            var5 = this.field8624;
            this.field8624 = null;
        }
        if (arg1 < 97) {
            this.method3402(-12, false, (byte) 30, (class635) null);
        }
        if (var5 != null) {
            class461.method2625(var5, this.field8614, super.field3160, super.field3161, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZIZIILfl;Loa;)V")
    public final void method453(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, class673 arg5, class635 arg6) {
        if (arg2) {
            this.field8614 = -51;
        }
        ++field8628;
        if (!(arg5 instanceof class610)) {
            if (arg5 instanceof class520) {
                class520 var8 = (class520) arg5;
                if (this.field8609 != null && var8.field7429 != null) {
                    this.field8609.method885(var8.field7429, arg4, arg1, arg3, arg0);
                    return;
                }
            }
        } else {
            class610 var9 = (class610) arg5;
            if (this.field8609 == null || var9.field8609 == null) {
                return;
            }
            this.field8609.method885(var9.field8609, arg4, arg1, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "(B)I")
    public final int method443(byte arg0) {
        ++field8627;
        int var2 = -87 % ((-82 - arg0) / 37);
        return this.field8620;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IZBLoa;)Lau;")
    private final class671 method3402(int arg0, boolean arg1, byte arg2, class635 arg3) {
        ++field8635;
        int var5 = 83 % ((arg2 - 5) / 60);
        class335 var6 = class195.field2339.method3729(this.field8633 & 65535, (byte) 109);
        class137 var7;
        class137 var8;
        if (this.field8615) {
            var7 = class275.field3477[0];
            var8 = class591.field8415[this.field8614];
        } else {
            var8 = class275.field3477[this.field8614];
            if (this.field8614 >= 3) {
                var7 = null;
            } else {
                var7 = class275.field3477[this.field8614 + 1];
            }
        }
        return var6.method1882(arg3, var8, super.field3161, super.field3159, this.field8620, super.field3160, arg1, arg0, this.field8610, (byte) -76, var7);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
    public final void method452(int arg0) {
        if (this.field8609 != null) {
            this.field8609.method888();
        }
        if (arg0 == 29877) {
            ++field8617;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILoa;)Lgr;")
    public final class396 method450(int arg0, class635 arg1) {
        if (this.field8632 == null) {
            this.field8632 = class426.method2298(super.field3160, this.method3400(arg1, 15484, 0), 12409, super.field3161, super.field3159);
        }
        int var3 = -95 / ((arg0 - 47) / 34);
        ++field8611;
        return this.field8632;
    }

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "(I)V")
    public final void method448(int arg0) {
        this.field8631 = false;
        ++field8608;
        int var2 = -48 % ((arg0 - 12) / 56);
        if (this.field8609 != null) {
            this.field8609.method874(-65537 & this.field8609.method902());
        }
    }
}
