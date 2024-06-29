import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class708 extends class100 implements class258 {

    @OriginalMember(owner = "client!ge", name = "cb", descriptor = "S")
    private short field9608;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "Z")
    private boolean field9593;

    @OriginalMember(owner = "client!ge", name = "lb", descriptor = "Z")
    private boolean field9617;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "Z")
    private boolean field9603;

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "B")
    private byte field9606;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "B")
    private byte field9589;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "Z")
    private boolean field9591;

    @OriginalMember(owner = "client!ge", name = "pb", descriptor = "Lr;")
    private class184 field9621;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "Lka;")
    public class472 field9598;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public static int field9590;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public static int field9592;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field9594;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field9595;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field9596;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field9597;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    public static int field9599;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field9600;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    public static int field9602;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    public static int field9604;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "I")
    public static int field9605;

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "I")
    public static int field9607;

    @OriginalMember(owner = "client!ge", name = "eb", descriptor = "I")
    public static int field9610;

    @OriginalMember(owner = "client!ge", name = "fb", descriptor = "I")
    public static int field9611;

    @OriginalMember(owner = "client!ge", name = "gb", descriptor = "I")
    public static int field9612;

    @OriginalMember(owner = "client!ge", name = "hb", descriptor = "I")
    public static int field9613;

    @OriginalMember(owner = "client!ge", name = "ib", descriptor = "I")
    public static int field9614;

    @OriginalMember(owner = "client!ge", name = "jb", descriptor = "I")
    public static int field9615;

    @OriginalMember(owner = "client!ge", name = "kb", descriptor = "I")
    public static int field9616;

    @OriginalMember(owner = "client!ge", name = "mb", descriptor = "I")
    public static int field9618;

    @OriginalMember(owner = "client!ge", name = "nb", descriptor = "I")
    public static int field9619;

    @OriginalMember(owner = "client!ge", name = "ob", descriptor = "I")
    public static int field9620;

    @OriginalMember(owner = "client!ge", name = "db", descriptor = "Lhw;")
    private class132 field9609;

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lha;Liv;IIIIIZIIZ)V")
    public class708(class59 arg0, class99 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class144.method1134(arg9, (byte) -34, arg8));
        this.field9608 = (short) arg1.field1776;
        this.field9593 = arg7;
        this.field9617 = arg10;
        super.field5922 = arg4;
        this.field9603 = ~arg1.field1709 != -1 && !arg7;
        super.field5933 = arg6;
        this.field9606 = (byte) arg8;
        this.field9589 = (byte) arg9;
        this.field9591 = arg0.method263() && arg1.field1729 && !this.field9593 && class693.field9368.field4435.method421(-32350) != 0;
        int var12 = 2048;
        if (this.field9617) {
            var12 |= 65536;
        }
        class351 var13 = this.method3945(this.field9591, var12, -4, arg0);
        if (var13 != null) {
            this.field9621 = var13.field4889;
            this.field9598 = var13.field4890;
            if (this.field9617) {
                this.field9598 = this.field9598.method504((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)I")
    public final int method594(int arg0) {
        ++field9607;
        int var2 = 69 % ((arg0 - -91) / 35);
        return this.field9606;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
    public final void method582(int arg0) {
        ++field9604;
        if (this.field9598 != null) {
            this.field9598.method507();
        }
        if (arg0 != -12031) {
            this.method584(-122);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method42(class59 arg0, int arg1, int arg2, int arg3) {
        ++field9597;
        class472 var5 = this.method3946(arg0, (byte) 126, 131072);
        if (arg3 != 0) {
            this.method588(-96);
        }
        if (var5 != null) {
            class661 var6 = arg0.method322();
            var6.method744(super.field5922, super.field5927, super.field5933);
            return class458.field6459 ? var5.method492(arg2, arg1, var6, false, 0, class58.field1146) : var5.method503(arg2, arg1, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(Lha;I)V")
    public final void method31(class59 arg0, int arg1) {
        if (arg1 > -125) {
            this.method589(115);
        }
        ++field9594;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)I")
    public final int method588(int arg0) {
        ++field9614;
        return arg0 != -32228 ? 1 : this.field9589;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
    public final void method44(boolean arg0) {
        ++field9618;
        if (!arg0) {
            this.method38(true);
        }
        this.field9617 = false;
        if (this.field9598 != null) {
            this.field9598.method484(this.field9598.method527() & -65537);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Lha;I)Lhw;")
    public final class132 method40(class59 arg0, int arg1) {
        ++field9602;
        if (this.field9609 == null) {
            this.field9609 = class689.method3846(super.field5922, this.method3946(arg0, (byte) 117, 0), super.field5933, super.field5927, arg1 + -5);
        }
        if (arg1 != 7) {
            this.field9593 = false;
        }
        return this.field9609;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)I")
    public final int method589(int arg0) {
        ++field9615;
        return arg0 > -62 ? -96 : this.field9608 & 65535;
    }

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)I")
    public final int method37(int arg0) {
        ++field9590;
        if (arg0 != -25675) {
            this.field9606 = 53;
        }
        return this.field9598 != null ? this.field9598.method513() : 0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Z")
    public final boolean method584(int arg0) {
        ++field9605;
        if (arg0 != -18443) {
            this.field9608 = 37;
        }
        return this.field9591;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lha;IZLga;IBI)V")
    public final void method33(class59 arg0, int arg1, boolean arg2, class404 arg3, int arg4, byte arg5, int arg6) {
        if (arg5 > -106) {
            this.method35(-102);
        }
        if (arg3 instanceof class708) {
            class708 var8 = (class708) arg3;
            if (this.field9598 != null && var8.field9598 != null) {
                this.field9598.method490(var8.field9598, arg6, arg1, arg4, arg2);
            }
        } else if (arg3 instanceof class51) {
            class51 var9 = (class51) arg3;
            if (this.field9598 != null && var9.field1079 != null) {
                this.field9598.method490(var9.field1079, arg6, arg1, arg4, arg2);
            }
        }
        ++field9610;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILha;)V")
    public final void method583(int arg0, class59 arg1) {
        ++field9619;
        Object var3 = null;
        class184 var5;
        if (this.field9621 == null && this.field9591) {
            class351 var4 = this.method3945(true, 262144, -4, arg1);
            var5 = var4 == null ? null : var4.field4889;
        } else {
            var5 = this.field9621;
            this.field9621 = null;
        }
        if (var5 != null) {
            class491.method2900(var5, super.field5921, super.field5922, super.field5933, (boolean[]) null);
        }
        if (arg0 != 836) {
            this.field9621 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZIILha;)Lak;")
    private final class351 method3945(boolean arg0, int arg1, int arg2, class59 arg3) {
        if (arg2 != -4) {
            this.field9609 = null;
        }
        ++field9613;
        class99 var5 = class76.field1366.method1680(0, this.field9608 & 65535);
        class281 var6;
        class281 var7;
        if (!this.field9593) {
            var6 = class465.field6517[super.field5921];
            if (~super.field5921 > -4) {
                var7 = class465.field6517[super.field5921 + 1];
            } else {
                var7 = null;
            }
        } else {
            var7 = class465.field6517[0];
            var6 = class344.field4822[super.field5921];
        }
        return var5.method921(arg3, var7, this.field9606, arg1, super.field5922, arg0, var6, super.field5927, super.field5933, this.field9589, arg2 + 132);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(ILha;)Ljda;")
    public final class228 method41(int arg0, class59 arg1) {
        ++field9596;
        if (this.field9598 == null) {
            return null;
        } else {
            class661 var3 = arg1.method322();
            var3.method744(super.field5922, super.field5927, super.field5933);
            class228 var4 = class345.method2171(arg0, this.field9603, false);
            if (!class458.field6459) {
                this.field9598.method521(var3, var4.field3313[0], 0);
            } else {
                this.field9598.method497(var3, var4.field3313[0], class58.field1146, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lha;BI)Lka;")
    private final class472 method3946(class59 arg0, byte arg1, int arg2) {
        if (arg1 <= 113) {
            this.method31((class59) null, -99);
        }
        ++field9599;
        if (this.field9598 != null && ~arg0.method343(this.field9598.method527(), arg2) == -1) {
            return this.field9598;
        } else {
            class351 var4 = this.method3945(false, arg2, -4, arg0);
            return var4 != null ? var4.field4890 : null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)I")
    public final int method38(boolean arg0) {
        ++field9620;
        if (!arg0) {
            this.field9589 = -75;
        }
        return this.field9598 == null ? 0 : this.field9598.method486();
    }

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "(I)Z")
    public final boolean method35(int arg0) {
        ++field9616;
        return arg0 > -65 ? true : this.field9617;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)Z")
    public final boolean method49(byte arg0) {
        ++field9592;
        if (arg0 != 122) {
            return true;
        } else {
            return this.field9598 == null ? false : this.field9598.method488();
        }
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)Z")
    public final boolean method45(int arg0) {
        if (arg0 >= -12) {
            this.method35(-68);
        }
        ++field9612;
        if (this.field9598 != null) {
            return !this.field9598.method522();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lha;I)V")
    public final void method591(class59 arg0, int arg1) {
        if (arg1 != -14218) {
            this.field9609 = null;
        }
        ++field9595;
        Object var3 = null;
        class184 var5;
        if (this.field9621 == null && this.field9591) {
            class351 var4 = this.method3945(true, 262144, -4, arg0);
            var5 = var4 == null ? null : var4.field4889;
        } else {
            var5 = this.field9621;
            this.field9621 = null;
        }
        if (var5 != null) {
            class166.method1249(var5, super.field5921, super.field5922, super.field5933, (boolean[]) null);
        }
    }
}
