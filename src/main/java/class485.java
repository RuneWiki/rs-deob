import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class485 extends class672 {

    @OriginalMember(owner = "client!vq", name = "S", descriptor = "Z")
    private boolean field6816 = true;

    @OriginalMember(owner = "client!vq", name = "cb", descriptor = "I")
    private int field6826 = 0;

    @OriginalMember(owner = "client!vq", name = "lb", descriptor = "I")
    private int field6835 = 0;

    @OriginalMember(owner = "client!vq", name = "gb", descriptor = "Z")
    public boolean field6830 = false;

    @OriginalMember(owner = "client!vq", name = "mb", descriptor = "I")
    private int field6836 = 0;

    @OriginalMember(owner = "client!vq", name = "ob", descriptor = "I")
    private int field6838 = 0;

    @OriginalMember(owner = "client!vq", name = "nb", descriptor = "I")
    private int field6837 = 0;

    @OriginalMember(owner = "client!vq", name = "tb", descriptor = "I")
    private int field6843 = -1;

    @OriginalMember(owner = "client!vq", name = "ib", descriptor = "I")
    private int field6832;

    @OriginalMember(owner = "client!vq", name = "ub", descriptor = "I")
    public int field6844;

    @OriginalMember(owner = "client!vq", name = "Z", descriptor = "Lpf;")
    private class607 field6823;

    @OriginalMember(owner = "client!vq", name = "O", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!vq", name = "P", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!vq", name = "Q", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!vq", name = "R", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!vq", name = "U", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!vq", name = "V", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!vq", name = "W", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!vq", name = "X", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!vq", name = "Y", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!vq", name = "ab", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!vq", name = "bb", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!vq", name = "db", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!vq", name = "fb", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!vq", name = "hb", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!vq", name = "jb", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!vq", name = "kb", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!vq", name = "pb", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!vq", name = "qb", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!vq", name = "rb", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!vq", name = "sb", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!vq", name = "vb", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!vq", name = "T", descriptor = "Lcv;")
    private class593 field6817;

    @OriginalMember(owner = "client!vq", name = "eb", descriptor = "[I")
    public static int[] field6828;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(ILha;)V", line = 6)
    public final void method912(int arg0, class65 arg1) {
        ++field6814;
        class496 var3 = this.method2889(this.field6832, true, 0, arg1);
        if (arg0 > 52) {
            if (var3 != null) {
                class326 var4 = arg1.method514();
                var4.method1869(super.field5742, super.field5741, super.field5746);
                this.method2893(arg1, -126, var3, var4);
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(I)I", line = 27)
    public final int method917(int arg0) {
        ++field6819;
        if (arg0 != -1760267218) {
            this.method917(105);
        }
        return this.field6837;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V", line = 38)
    public static void method2888(int arg0) {
        field6828 = null;
        if (arg0 < 115) {
            field6821 = 105;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IZILha;)Lka;", line = 48)
    private final class496 method2889(int arg0, boolean arg1, int arg2, class65 arg3) {
        ++field6839;
        class278 var5 = class456.field6385.method2382(arg0, (byte) -84);
        class294 var6 = class411.field5572[super.field5755];
        if (!arg1) {
            this.method2889(27, true, 57, (class65) null);
        }
        class294 var7 = super.field5749 >= 3 ? null : class411.field5572[super.field5749 + 1];
        return !this.field6830 ? var5.method1818(class563.field7993, arg3, var6, this.field6836, super.field5741, super.field5746, this.field6843, var7, super.field5742, arg2, true, this.field6835, -9) : var5.method1818(class563.field7993, arg3, var6, 0, super.field5741, super.field5746, -1, var7, super.field5742, arg2, true, -1, -9);
    }

    @OriginalMember(owner = "client!vq", name = "finalize", descriptor = "()V", line = 65)
    protected final void finalize() {
        if (this.field6817 != null) {
            this.field6817.method3451();
        }
        ++field6812;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIILha;)Z", line = 75)
    public final boolean method902(int arg0, int arg1, int arg2, class65 arg3) {
        if (arg1 != -17458) {
            method2888(34);
        }
        ++field6824;
        return false;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(Z)I", line = 86)
    public final int method916(boolean arg0) {
        ++field6831;
        if (!arg0) {
            this.method2892((byte) 16);
        }
        return this.field6838;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IB)V", line = 100)
    public static final void method2890(int arg0, byte arg1) {
        if (arg1 < -11) {
            class371.field5134 = new int[arg0];
            ++field6834;
            class437.field5898 = new int[arg0];
            class152.field2159 = new int[arg0];
            class503.field7131 = new int[arg0];
            class606.field8481 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 348)
    public class485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field6832 = arg0;
        this.field6826 = arg12;
        this.field6844 = arg2 - -arg1;
        class278 var14 = class456.field6385.method2382(this.field6832, (byte) -99);
        int var15 = var14.field4040;
        if (~var15 == 0) {
            this.field6830 = true;
        } else {
            this.field6823 = class563.field7993.method651(var15, (byte) 92);
            this.field6830 = false;
        }
        if (this.field6844 == arg2) {
            class760.method4227(255, this, this.field6823, this.field6835);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V", line = 118)
    public final void method2891(int arg0, int arg1) {
        ++field6845;
        if (!this.field6830) {
            this.field6836 += arg1;
            while (this.field6823.field8494[this.field6835] < this.field6836) {
                this.field6836 -= this.field6823.field8494[this.field6835];
                ++this.field6835;
                if (this.field6835 >= this.field6823.field8492.length) {
                    this.field6830 = true;
                    break;
                }
            }
            if (!this.field6830) {
                class760.method4227(arg0 + 255, this, this.field6823, this.field6835);
            }
            if (arg0 != 0) {
                this.method909(true);
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "(I)V", line = 151)
    public final void method903(int arg0) {
        ++field6818;
        if (arg0 != -772) {
            this.method903(-104);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V", line = 163)
    public final void method2892(byte arg0) {
        if (arg0 != 119) {
            this.field6843 = -46;
        }
        ++field6827;
        if (this.field6817 != null) {
            this.field6817.method3451();
        }
    }

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "(I)Z", line = 186)
    public final boolean method906(int arg0) {
        int var2 = -97 % ((arg0 - 11) / 35);
        ++field6815;
        return this.field6816;
    }

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "(Z)Z", line = 197)
    public final boolean method909(boolean arg0) {
        ++field6813;
        if (arg0) {
            this.method917(-88);
        }
        return false;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lha;I)Lmaa;", line = 209)
    public final class495 method918(class65 arg0, int arg1) {
        ++field6822;
        class496 var3 = this.method2889(this.field6832, true, (this.field6826 == 0 ? 0 : 5) | 2048, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (this.field6826 != 0) {
                var3.method92(this.field6826 * 2048);
            }
            class326 var4 = arg0.method514();
            var4.method1869(super.field5742, super.field5741, super.field5746);
            this.method2893(arg0, -119, var3, var4);
            class495 var5 = class86.method652(false, 0, 1);
            if (!class576.field8120) {
                var3.method88(var4, var5.field7067[0], 0);
            } else {
                var3.method106(var4, var5.field7067[0], class740.field10205, 0);
            }
            if (this.field6817 != null) {
                class296 var6 = this.field6817.method3450();
                if (class576.field8120) {
                    arg0.method541(var6, class740.field10205);
                } else {
                    arg0.method504(var6);
                }
            }
            this.field6816 = var3.method121();
            if (arg1 != -30514) {
                field6828 = null;
            }
            this.field6838 = var3.method118();
            this.field6837 = var3.method75();
            return var5;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(Lha;I)Lrn;", line = 272)
    public final class281 method901(class65 arg0, int arg1) {
        if (arg1 <= 50) {
            this.field6844 = 75;
        }
        ++field6840;
        return null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZLje;IIILha;I)V", line = 297)
    public final void method905(boolean arg0, class421 arg1, int arg2, int arg3, int arg4, class65 arg5, int arg6) {
        ++field6820;
        if (arg2 != 0) {
            this.method917(-62);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(Z)Z", line = 308)
    public final boolean method910(boolean arg0) {
        ++field6833;
        return !arg0 ? false : false;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lha;ILka;Lqja;)V", line = 324)
    private final void method2893(class65 arg0, int arg1, class496 arg2, class326 arg3) {
        ++field6829;
        arg2.method66(arg3);
        if (arg1 < -114) {
            class88[] var5 = arg2.method97();
            class378[] var6 = arg2.method103();
            if ((this.field6817 == null || this.field6817.field8349) && (var5 != null || var6 != null)) {
                this.field6817 = class593.method3449(class192.field2961, true);
            }
            if (this.field6817 != null) {
                this.field6817.method3457(arg0, (long) class192.field2961, var5, var6, false);
                this.field6817.method3458(super.field5755, super.field9368, super.field9371, super.field9364, super.field9360);
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lwia;Ljc;Lwia;Lwia;Lhp;I)Z", line = 373)
    public static final boolean method2894(class791 arg0, class462 arg1, class791 arg2, class791 arg3, class346 arg4, int arg5) {
        class562.field7982 = arg3;
        class686.field9533 = arg1;
        class599.field8410 = arg4;
        ++field6841;
        class666.field9273 = arg0;
        class288.field4230 = arg2;
        if (arg5 != 12096) {
            method2890(-44, (byte) -94);
        }
        class46.field576 = new int[16];
        for (int var6 = 0; var6 < 16; ++var6) {
            class46.field576[var6] = 255;
        }
        return true;
    }
}
