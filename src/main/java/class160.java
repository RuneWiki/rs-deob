import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class160 extends class340 {

    @OriginalMember(owner = "client!aq", name = "db", descriptor = "Z")
    public boolean field1771 = false;

    @OriginalMember(owner = "client!aq", name = "S", descriptor = "I")
    private int field1760 = -1;

    @OriginalMember(owner = "client!aq", name = "qb", descriptor = "I")
    private int field1784 = 0;

    @OriginalMember(owner = "client!aq", name = "pb", descriptor = "I")
    private int field1783 = 0;

    @OriginalMember(owner = "client!aq", name = "gb", descriptor = "I")
    private int field1774 = 0;

    @OriginalMember(owner = "client!aq", name = "nb", descriptor = "Z")
    private boolean field1781 = true;

    @OriginalMember(owner = "client!aq", name = "vb", descriptor = "I")
    private int field1789 = 0;

    @OriginalMember(owner = "client!aq", name = "xb", descriptor = "I")
    private int field1791 = 0;

    @OriginalMember(owner = "client!aq", name = "W", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!aq", name = "U", descriptor = "I")
    private int field1762;

    @OriginalMember(owner = "client!aq", name = "Z", descriptor = "Lfba;")
    private class25 field1767;

    @OriginalMember(owner = "client!aq", name = "ob", descriptor = "I")
    public static int field1782 = 100;

    @OriginalMember(owner = "client!aq", name = "mb", descriptor = "F")
    public static float field1780;

    @OriginalMember(owner = "client!aq", name = "T", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!aq", name = "V", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!aq", name = "X", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!aq", name = "Y", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!aq", name = "ab", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!aq", name = "bb", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!aq", name = "cb", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!aq", name = "eb", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!aq", name = "fb", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!aq", name = "ib", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!aq", name = "jb", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!aq", name = "kb", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!aq", name = "lb", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!aq", name = "rb", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!aq", name = "sb", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!aq", name = "tb", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!aq", name = "ub", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!aq", name = "wb", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!aq", name = "hb", descriptor = "Lpd;")
    private class257 field1775;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "(I)V")
    public final void method981(int arg0) {
        if (this.field1775 != null) {
            this.field1775.method1529();
        }
        if (arg0 == -22737) {
            ++field1761;
        }
    }

    @OriginalMember(owner = "client!aq", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field1775 != null) {
            this.field1775.method1529();
        }
        ++field1777;
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V")
    public final void method982(int arg0) {
        ++field1770;
        if (arg0 != 2) {
            this.method985(115);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(ILha;)Llca;")
    public final class642 method983(int arg0, class58 arg1) {
        ++field1765;
        if (arg0 != 0) {
            this.method989(-79);
        }
        return null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
    public final void method984(int arg0, int arg1) {
        ++field1785;
        if (!this.field1771) {
            this.field1791 += arg0;
            int var3 = 28 % ((-60 - arg1) / 46);
            while (~this.field1767.field253[this.field1783] > ~this.field1791) {
                this.field1791 -= this.field1767.field253[this.field1783];
                ++this.field1783;
                if (this.field1767.field256.length <= this.field1783) {
                    this.field1771 = true;
                    break;
                }
            }
            if (!this.field1771) {
                class629.method3607(this, this.field1767, -127, this.field1783);
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field1764 = arg1 + arg2;
        this.field1762 = arg0;
        this.field1784 = arg12;
        class342 var14 = class173.field2036.method1221(15719, this.field1762);
        int var15 = var14.field4431;
        if (var15 != -1) {
            this.field1767 = class637.field9158.method1905(116, var15);
            this.field1771 = false;
        } else {
            this.field1771 = true;
        }
        if (~this.field1764 == ~arg2) {
            class629.method3607(this, this.field1767, -118, this.field1783);
        }
    }

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "(I)I")
    public final int method985(int arg0) {
        ++field1790;
        if (arg0 != 4) {
            this.method987(true, (class58) null, (class361) null, 115, 16, 120, 124);
        }
        return this.field1774;
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)Z")
    public final boolean method986(int arg0) {
        int var2 = -4 % ((-50 - arg0) / 60);
        ++field1778;
        return false;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZLha;Lrr;IIII)V")
    public final void method987(boolean arg0, class58 arg1, class361 arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1766;
        if (arg3 != 0) {
            this.field1762 = -10;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lha;Ldfa;Lka;B)V")
    private final void method988(class58 arg0, class165 arg1, class470 arg2, byte arg3) {
        ++field1772;
        arg2.method220(arg1);
        class555[] var5 = arg2.method212();
        class88[] var6 = arg2.method186();
        if ((this.field1775 == null || this.field1775.field3136) && (var5 != null || var6 != null)) {
            this.field1775 = class257.method1543(class392.field5398, true);
        }
        if (this.field1775 != null) {
            this.field1775.method1533(arg0, (long) class392.field5398, var5, var6, false);
            this.field1775.method1542(super.field4628, super.field4395, super.field4390, super.field4387, super.field4402);
        }
        int var7 = -4 / ((arg3 - 35) / 57);
    }

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "(I)Z")
    public final boolean method989(int arg0) {
        ++field1788;
        if (arg0 >= -112) {
            this.field1767 = null;
        }
        return this.field1781;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lha;I)V")
    public final void method990(class58 arg0, int arg1) {
        ++field1786;
        int var3 = -83 / ((arg1 - -2) / 62);
        class470 var4 = this.method993(arg0, -17275, this.field1762, 0);
        if (var4 != null) {
            class165 var5 = arg0.method422();
            var5.method1019(super.field4635, super.field4627, super.field4629);
            this.method988(arg0, var5, var4, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "(I)Z")
    public final boolean method991(int arg0) {
        ++field1787;
        int var2 = -108 % ((arg0 - 65) / 48);
        return false;
    }

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "(Z)I")
    public final int method992(boolean arg0) {
        ++field1773;
        if (arg0) {
            this.method991(33);
        }
        return this.field1789;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lha;III)Lka;")
    private final class470 method993(class58 arg0, int arg1, int arg2, int arg3) {
        ++field1776;
        if (arg1 != -17275) {
            return null;
        } else {
            class342 var5 = class173.field2036.method1221(arg1 ^ -32286, arg2);
            class278 var6 = class11.field88[super.field4628];
            class278 var7 = ~super.field4633 > -4 ? class11.field88[super.field4633 + 1] : null;
            return this.field1771 ? var5.method2035(var6, var7, arg3, super.field4627, -1, super.field4629, true, arg0, 0, super.field4635, -1, class637.field9158, 8705) : var5.method2035(var6, var7, arg3, super.field4627, this.field1760, super.field4629, true, arg0, this.field1791, super.field4635, this.field1783, class637.field9158, arg1 ^ -24956);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLha;)Llba;")
    public final class547 method994(byte arg0, class58 arg1) {
        ++field1769;
        class470 var3 = this.method993(arg1, -17275, this.field1762, (~this.field1784 != -1 ? 5 : 0) | 2048);
        if (arg0 != -112) {
            this.method982(68);
        }
        if (var3 == null) {
            return null;
        } else {
            if (~this.field1784 != -1) {
                var3.method211(this.field1784 * 2048);
            }
            class165 var4 = arg1.method422();
            var4.method1019(super.field4635, super.field4627, super.field4629);
            this.method988(arg1, var4, var3, (byte) -67);
            class547 var5 = class652.method3702(false, -9477, 1);
            if (class626.field8994) {
                var3.method188(var4, var5.field7870[0], class586.field8268, 0);
            } else {
                var3.method228(var4, var5.field7870[0], 0);
            }
            if (this.field1775 != null) {
                class713 var6 = this.field1775.method1538();
                if (class626.field8994) {
                    arg1.method402(var6, class586.field8268);
                } else {
                    arg1.method391(var6);
                }
            }
            this.field1781 = var3.method197();
            this.field1774 = var3.method190();
            this.field1789 = var3.method217();
            return var5;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method995(int arg0, int arg1, class58 arg2, int arg3) {
        ++field1763;
        if (arg3 != -1) {
            this.field1762 = -17;
        }
        return false;
    }
}
