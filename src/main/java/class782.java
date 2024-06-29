import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public class class782 extends class629 implements class602 {

    @OriginalMember(owner = "client!fja", name = "bb", descriptor = "B")
    private byte field10748;

    @OriginalMember(owner = "client!fja", name = "M", descriptor = "S")
    private short field10733;

    @OriginalMember(owner = "client!fja", name = "gb", descriptor = "Z")
    private boolean field10753;

    @OriginalMember(owner = "client!fja", name = "fb", descriptor = "Z")
    private boolean field10752;

    @OriginalMember(owner = "client!fja", name = "kb", descriptor = "Z")
    private boolean field10757;

    @OriginalMember(owner = "client!fja", name = "I", descriptor = "Z")
    private boolean field10729;

    @OriginalMember(owner = "client!fja", name = "jb", descriptor = "Lr;")
    private class195 field10756;

    @OriginalMember(owner = "client!fja", name = "F", descriptor = "Lka;")
    private class497 field10726;

    @OriginalMember(owner = "client!fja", name = "Z", descriptor = "[I")
    public static int[] field10746 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!fja", name = "cb", descriptor = "[F")
    public static float[] field10749 = new float[4];

    @OriginalMember(owner = "client!fja", name = "E", descriptor = "I")
    public static int field10725;

    @OriginalMember(owner = "client!fja", name = "G", descriptor = "I")
    public static int field10727;

    @OriginalMember(owner = "client!fja", name = "H", descriptor = "I")
    public static int field10728;

    @OriginalMember(owner = "client!fja", name = "J", descriptor = "I")
    public static int field10730;

    @OriginalMember(owner = "client!fja", name = "K", descriptor = "I")
    public static int field10731;

    @OriginalMember(owner = "client!fja", name = "L", descriptor = "I")
    public static int field10732;

    @OriginalMember(owner = "client!fja", name = "O", descriptor = "I")
    public static int field10735;

    @OriginalMember(owner = "client!fja", name = "P", descriptor = "I")
    public static int field10736;

    @OriginalMember(owner = "client!fja", name = "Q", descriptor = "I")
    public static int field10737;

    @OriginalMember(owner = "client!fja", name = "R", descriptor = "I")
    public static int field10738;

    @OriginalMember(owner = "client!fja", name = "S", descriptor = "I")
    public static int field10739;

    @OriginalMember(owner = "client!fja", name = "T", descriptor = "I")
    public static int field10740;

    @OriginalMember(owner = "client!fja", name = "U", descriptor = "I")
    public static int field10741;

    @OriginalMember(owner = "client!fja", name = "V", descriptor = "I")
    public static int field10742;

    @OriginalMember(owner = "client!fja", name = "W", descriptor = "I")
    public static int field10743;

    @OriginalMember(owner = "client!fja", name = "Y", descriptor = "I")
    public static int field10745;

    @OriginalMember(owner = "client!fja", name = "ab", descriptor = "I")
    public static int field10747;

    @OriginalMember(owner = "client!fja", name = "db", descriptor = "I")
    public static int field10750;

    @OriginalMember(owner = "client!fja", name = "eb", descriptor = "I")
    public static int field10751;

    @OriginalMember(owner = "client!fja", name = "hb", descriptor = "I")
    public static int field10754;

    @OriginalMember(owner = "client!fja", name = "ib", descriptor = "I")
    public static int field10755;

    @OriginalMember(owner = "client!fja", name = "lb", descriptor = "I")
    public static int field10758;

    @OriginalMember(owner = "client!fja", name = "X", descriptor = "J")
    public static long field10744;

    @OriginalMember(owner = "client!fja", name = "N", descriptor = "Lln;")
    private class398 field10734;

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(ILha;I)Lka;", line = 5)
    private final class497 method4288(int arg0, class66 arg1, int arg2) {
        ++field10736;
        if (this.field10726 != null && arg1.method520(this.field10726.method260(), arg2) == 0) {
            return this.field10726;
        } else {
            int var4 = 117 / ((44 - arg0) / 57);
            class786 var5 = this.method4291(false, 5, arg1, arg2);
            return var5 != null ? var5.field10802 : null;
        }
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(B)Z", line = 26)
    public final boolean method1747(byte arg0) {
        ++field10755;
        int var2 = 101 % ((-41 - arg0) / 60);
        return this.field10729;
    }

    @OriginalMember(owner = "client!fja", name = "c", descriptor = "(Lha;B)Lpia;", line = 39)
    public final class104 method114(class66 arg0, byte arg1) {
        ++field10735;
        if (this.field10726 == null) {
            return null;
        } else {
            class109 var3 = arg0.method475();
            var3.method814(super.field2802, super.field2815, super.field2810);
            if (arg1 != 115) {
                this.field10734 = null;
            }
            class104 var4 = class568.method3241(1, (byte) -77, this.field10757);
            if (class408.field5786) {
                this.field10726.method258(var3, var4.field1479[0], class72.field972, 0);
            } else {
                this.field10726.method254(var3, var4.field1479[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!fja", name = "g", descriptor = "(I)Z", line = 65)
    public final boolean method769(int arg0) {
        ++field10732;
        if (arg0 >= -70) {
            this.field10733 = 20;
        }
        if (this.field10726 == null) {
            return true;
        } else {
            return !this.field10726.method285();
        }
    }

    @OriginalMember(owner = "client!fja", name = "b", descriptor = "(B)Z", line = 80)
    public final boolean method126(byte arg0) {
        if (arg0 != -34) {
            this.method1745(false);
        }
        ++field10754;
        return this.field10752;
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(ILfq;BIILha;Z)V", line = 92)
    public final void method129(int arg0, class214 arg1, byte arg2, int arg3, int arg4, class66 arg5, boolean arg6) {
        if (arg1 instanceof class782) {
            class782 var8 = (class782) arg1;
            if (this.field10726 != null && var8.field10726 != null) {
                this.field10726.method287(var8.field10726, arg3, arg0, arg4, arg6);
            }
        }
        ++field10743;
        if (arg2 != -103) {
            this.field10757 = true;
        }
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(Lha;B)V", line = 111)
    public final void method1742(class66 arg0, byte arg1) {
        ++field10747;
        Object var3 = null;
        class195 var5;
        if (this.field10756 == null && this.field10729) {
            class786 var4 = this.method4291(true, 5, arg0, 262144);
            var5 = var4 != null ? var4.field10801 : null;
        } else {
            var5 = this.field10756;
            this.field10756 = null;
        }
        if (var5 != null) {
            class526.method3052(var5, super.field2809, super.field2802, super.field2810, (boolean[]) null);
        }
        if (arg1 < 68) {
            this.method1752((class66) null, (byte) -75);
        }
    }

    @OriginalMember(owner = "client!fja", name = "c", descriptor = "(I)I", line = 138)
    public final int method1750(int arg0) {
        ++field10751;
        if (arg0 != 29244) {
            this.field10757 = false;
        }
        return 22;
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(I)I", line = 149)
    public final int method1744(int arg0) {
        if (arg0 != 21215) {
            this.field10734 = null;
        }
        ++field10737;
        return this.field10748;
    }

    @OriginalMember(owner = "client!fja", name = "b", descriptor = "(Z)I", line = 161)
    public final int method767(boolean arg0) {
        ++field10742;
        if (arg0) {
            return 108;
        } else {
            return this.field10726 != null ? this.field10726.method264() : 0;
        }
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(III)Lvda;", line = 173)
    public static final class194 method4289(int arg0, int arg1, int arg2) {
        if (class443.field6387[arg0][arg1][arg2] == null) {
            boolean var3 = class443.field6387[0][arg1][arg2] != null && class443.field6387[0][arg1][arg2].field2526 != null;
            if (var3 && arg0 >= class504.field7090 - 1) {
                return null;
            }
            class490.method2867(arg0, arg1, arg2);
        }
        return class443.field6387[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!fja", name = "i", descriptor = "(I)Z", line = 186)
    public final boolean method777(int arg0) {
        int var2 = 100 % ((arg0 - -34) / 59);
        ++field10728;
        return this.field10726 != null ? this.field10726.method272() : false;
    }

    @OriginalMember(owner = "client!fja", name = "l", descriptor = "(I)V", line = 206)
    public static void method4290(int arg0) {
        if (arg0 >= -27) {
            field10746 = null;
        }
        field10749 = null;
        field10746 = null;
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(ZILha;I)Lsw;", line = 217)
    private final class786 method4291(boolean arg0, int arg1, class66 arg2, int arg3) {
        ++field10725;
        class412 var5 = class210.field2705.method1362(0, this.field10733 & 65535);
        if (arg1 != 5) {
            return null;
        } else {
            class295 var6;
            class295 var7;
            if (this.field10753) {
                var6 = class737.field10008[super.field2809];
                var7 = class648.field8748[0];
            } else {
                var6 = class648.field8748[super.field2809];
                if (super.field2809 >= 3) {
                    var7 = null;
                } else {
                    var7 = class648.field8748[super.field2809 - -1];
                }
            }
            return var5.method2475(super.field2802, var7, 22, arg3, arg0, arg2, (byte) -56, var6, (class711) null, super.field2815, this.field10748, super.field2810);
        }
    }

    @OriginalMember(owner = "client!fja", name = "e", descriptor = "(Lha;B)V", line = 247)
    public final void method131(class66 arg0, byte arg1) {
        if (arg1 == 53) {
            ++field10740;
        }
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(Z)V", line = 259)
    public final void method1745(boolean arg0) {
        if (arg0) {
            ++field10739;
            if (this.field10726 != null) {
                this.field10726.method274();
            }
        }
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(ZB)V", line = 277)
    public static final void method4292(boolean arg0, byte arg1) {
        int var2 = -77 / ((16 - arg1) / 41);
        ++field10741;
        if (arg0) {
            if (~class227.field2935 != 0) {
                class445.method2656(class227.field2935, -1);
            }
            for (class73 var3 = (class73) class355.field5178.method1249((byte) -107); var3 != null; var3 = (class73) class355.field5178.method1246(true)) {
                if (!var3.method1104(3)) {
                    var3 = (class73) class355.field5178.method1249((byte) -109);
                    if (var3 == null) {
                        break;
                    }
                }
                class314.method2010(var3, true, -116, false);
            }
            class227.field2935 = -1;
            class355.field5178 = new class184(8);
            class247.method1535(true);
            class227.field2935 = class250.field3501;
            class336.method2157(86, false);
            class166.method1137(false);
            class727.method4007(class227.field2935);
        }
        class300.field4231 = true;
    }

    @OriginalMember(owner = "client!fja", name = "d", descriptor = "(Lha;B)Lln;", line = 322)
    public final class398 method119(class66 arg0, byte arg1) {
        if (this.field10734 == null) {
            this.field10734 = class122.method882(this.method4288(120, arg0, 0), super.field2810, super.field2802, super.field2815, -121);
        }
        ++field10738;
        if (arg1 >= -35) {
            this.field10756 = null;
        }
        return this.field10734;
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(ILjava/awt/Canvas;BLd;)Lha;", line = 341)
    public static final class66 method4293(int arg0, Canvas arg1, byte arg2, class161 arg3) {
        ++field10745;
        return arg2 != -8 ? null : new class250(arg1, arg3, arg0);
    }

    @OriginalMember(owner = "client!fja", name = "d", descriptor = "(B)I", line = 354)
    public final int method774(byte arg0) {
        ++field10750;
        if (arg0 != 115) {
            return 78;
        } else {
            return this.field10726 != null ? this.field10726.method265() : 0;
        }
    }

    @OriginalMember(owner = "client!fja", name = "b", descriptor = "(Lha;B)V", line = 365)
    public final void method1752(class66 arg0, byte arg1) {
        ++field10758;
        Object var3 = null;
        if (arg1 > -17) {
            field10749 = null;
        }
        class195 var5;
        if (this.field10756 == null && this.field10729) {
            class786 var4 = this.method4291(true, 5, arg0, 262144);
            var5 = var4 != null ? var4.field10801 : null;
        } else {
            var5 = this.field10756;
            this.field10756 = null;
        }
        if (var5 != null) {
            class384.method2380(var5, super.field2809, super.field2802, super.field2810, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!fja", name = "<init>", descriptor = "(Lha;Llp;IIIIIZIZ)V", line = 393)
    public class782(class66 arg0, class412 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field5907);
        this.field10748 = (byte) arg8;
        this.field10733 = (short) arg1.field5850;
        this.field10753 = arg7;
        this.field10752 = arg9;
        super.field2802 = arg4;
        super.field2810 = arg6;
        this.field10757 = arg1.field5905 != 0 && !arg7;
        this.field10729 = arg0.method538() && arg1.field5927 && !this.field10753 && ~class125.field1721.field5156.method159(43) != -1;
        int var11 = 2048;
        if (this.field10752) {
            var11 |= 65536;
        }
        class786 var12 = this.method4291(this.field10729, 5, arg0, var11);
        if (var12 != null) {
            this.field10756 = var12.field10801;
            this.field10726 = var12.field10802;
            if (this.field10752) {
                this.field10726 = this.field10726.method271((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fja", name = "h", descriptor = "(I)V", line = 431)
    public final void method127(int arg0) {
        ++field10730;
        if (arg0 == -13127) {
            this.field10752 = false;
            if (this.field10726 != null) {
                this.field10726.method270(this.field10726.method260() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!fja", name = "b", descriptor = "(I)I", line = 445)
    public final int method1748(int arg0) {
        ++field10727;
        return arg0 != 5875 ? -48 : 65535 & this.field10733;
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(ILha;II)Z", line = 467)
    public final boolean method122(int arg0, class66 arg1, int arg2, int arg3) {
        if (arg2 != 6238) {
            return false;
        } else {
            ++field10731;
            class497 var5 = this.method4288(122, arg1, 131072);
            if (var5 != null) {
                class109 var6 = arg1.method475();
                var6.method814(super.field2802, super.field2815, super.field2810);
                return class408.field5786 ? var5.method245(arg0, arg3, var6, false, 0, class72.field972) : var5.method248(arg0, arg3, var6, false, 0);
            } else {
                return false;
            }
        }
    }
}
