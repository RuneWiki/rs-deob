import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class299 extends class539 implements class302 {

    @OriginalMember(owner = "client!hs", name = "J", descriptor = "Z")
    private boolean field4660 = false;

    @OriginalMember(owner = "client!hs", name = "I", descriptor = "Lfb;")
    public class626 field4659;

    @OriginalMember(owner = "client!hs", name = "L", descriptor = "Z")
    private boolean field4662;

    @OriginalMember(owner = "client!hs", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field4671 = new String[100];

    @OriginalMember(owner = "client!hs", name = "Z", descriptor = "[I")
    public static int[] field4676 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!hs", name = "X", descriptor = "Lac;")
    public static class501 field4674 = new class501("WTRC", 1);

    @OriginalMember(owner = "client!hs", name = "db", descriptor = "I")
    public static int field4680 = 328;

    @OriginalMember(owner = "client!hs", name = "A", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!hs", name = "B", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!hs", name = "C", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!hs", name = "D", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!hs", name = "E", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!hs", name = "F", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!hs", name = "G", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!hs", name = "H", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!hs", name = "K", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!hs", name = "M", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!hs", name = "N", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!hs", name = "P", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!hs", name = "Q", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!hs", name = "R", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!hs", name = "S", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!hs", name = "T", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!hs", name = "V", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!hs", name = "W", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!hs", name = "Y", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!hs", name = "ab", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!hs", name = "fb", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!hs", name = "gb", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!hs", name = "eb", descriptor = "Lsaa;")
    public static class300 field4681;

    @OriginalMember(owner = "client!hs", name = "O", descriptor = "Lll;")
    private class334 field4665;

    @OriginalMember(owner = "client!hs", name = "cb", descriptor = "[I")
    public static int[] field4679;

    @OriginalMember(owner = "client!hs", name = "bb", descriptor = "[[[Z")
    public static boolean[][][] field4678;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BI)Z", line = 4)
    public static final boolean method2070(byte arg0, int arg1) {
        class657.field9163 = true;
        class413.field6347 = arg1 + 1 & 65535;
        int var2 = 54 % ((-55 - arg0) / 32);
        ++field4656;
        return true;
    }

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "(I)I", line = 18)
    public final int method393(int arg0) {
        ++field4658;
        return arg0 != 0 ? -118 : this.field4659.method3654(97);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILr;)V", line = 31)
    public final void method396(int arg0, class167 arg1) {
        if (arg0 != -32646) {
            this.method396(-18, (class167) null);
        }
        ++field4669;
        this.field4659.method3652((byte) 71, arg1);
    }

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "(B)V", line = 43)
    public static final void method2071(byte arg0) {
        ++class393.field6139;
        ++field4683;
        if (arg0 == -7) {
            class165 var1 = class271.method1917(class420.field6424, (byte) -71, class459.field6863);
            var1.field2776.method65(0, -77);
            class642.method3726(arg0 ^ 684096282, var1);
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lr;Llr;IIIIIZII)V", line = 59)
    public class299(class167 arg0, class698 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field9771);
        this.field4659 = new class626(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field4662 = arg1.field9830 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)I", line = 70)
    public final int method401(byte arg0) {
        if (arg0 < 50) {
            this.field4662 = true;
        }
        ++field4677;
        return this.field4659.field8837;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIILr;ZILpn;)V", line = 81)
    public final void method415(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, int arg5, class692 arg6) {
        ++field4664;
        if (arg2 != 1) {
            field4681 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(ILr;)Lod;", line = 92)
    public final class468 method403(int arg0, class167 arg1) {
        ++field4667;
        if (arg0 > -38) {
            return null;
        } else {
            class55 var3 = this.field4659.method3647(arg1, false, true, -1, 2048);
            if (var3 == null) {
                return null;
            } else {
                class393 var4 = arg1.method339();
                var4.method503(super.field9696, super.field9701, super.field9705);
                class468 var5 = null;
                if (this.field4662) {
                    var5 = class429.method2720(1, 0);
                }
                int var6 = super.field9696 >> 9;
                int var7 = super.field9705 >> 9;
                this.field4659.method3646(var3, var6, var7, var7, true, arg1, var6, (byte) -99, var4);
                if (!class534.field7778) {
                    var3.method606(var4, var5 == null ? null : var5.field6948[0], 0);
                } else {
                    var3.method613(var4, var5 == null ? null : var5.field6948[0], class609.field8652, 0);
                }
                if (this.field4659.field8836 != null) {
                    class79 var8 = this.field4659.field8836.method3250();
                    if (!class534.field7778) {
                        arg1.method354(var8);
                    } else {
                        arg1.method320(var8, class609.field8652);
                    }
                }
                this.field4660 = var3.method614() || this.field4659.field8836 != null;
                if (this.field4665 == null) {
                    this.field4665 = class166.method1342(var3, super.field9705, super.field9696, super.field9701, 30640);
                } else {
                    class251.method1789(this.field4665, -125, super.field9701, super.field9696, var3, super.field9705);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "(B)V", line = 145)
    public final void method404(byte arg0) {
        ++field4670;
        if (arg0 > -40) {
            this.method395(-41);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "(B)Z", line = 158)
    public final boolean method398(byte arg0) {
        if (arg0 >= -92) {
            this.method407((class167) null, 111);
        }
        ++field4675;
        return false;
    }

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "(B)I", line = 171)
    public final int method406(byte arg0) {
        if (arg0 < 108) {
            this.method413((byte) 13);
        }
        ++field4661;
        return this.field4659.method3651(30556);
    }

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "(I)Z", line = 182)
    public final boolean method414(int arg0) {
        if (arg0 != 0) {
            field4674 = null;
        }
        ++field4657;
        return false;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lr;I)V", line = 193)
    public final void method407(class167 arg0, int arg1) {
        this.field4659.method3648((byte) -112, arg0);
        int var3 = 29 / ((-10 - arg1) / 40);
        ++field4651;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIIIZ)V", line = 203)
    public static final void method2072(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var7 = 65 / ((11 - arg4) / 63);
        if (~(!arg6 ? class17.field282.field4860 : class17.field282.field4875) != -1 && ~arg5 != -1 && class275.field4413 < 50 && ~arg3 != 0) {
            class674.field9494[class275.field4413++] = new class681((byte) (arg6 ? 3 : 2), arg3, arg5, arg2, arg0, 0, arg1, (class692) null);
        }
        ++field4672;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V", line = 219)
    public final void method409(int arg0) {
        if (arg0 != -7728) {
            this.method409(-66);
        }
        ++field4673;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)I", line = 230)
    public final int method394(byte arg0) {
        ++field4652;
        int var2 = -46 % ((-14 - arg0) / 51);
        return this.field4659.field8854;
    }

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "(I)Z", line = 243)
    public final boolean method402(int arg0) {
        ++field4666;
        if (arg0 != 623404585) {
            this.method403(-93, (class167) null);
        }
        return this.field4660;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZILr;I)Z", line = 258)
    public final boolean method392(boolean arg0, int arg1, class167 arg2, int arg3) {
        ++field4655;
        class55 var5 = this.field4659.method3647(arg2, false, arg0, -1, 131072);
        if (var5 == null) {
            return false;
        } else {
            class393 var6 = arg2.method339();
            var6.method503(super.field9696, super.field9701, super.field9705);
            return !class534.field7778 ? var5.method648(arg3, arg1, var6, false) : var5.method598(arg3, arg1, var6, false, class609.field8652);
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)I", line = 280)
    public final int method413(byte arg0) {
        if (arg0 != 11) {
            return -80;
        } else {
            ++field4668;
            return this.field4659.field8846;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lr;Z)V", line = 293)
    public final void method412(class167 arg0, boolean arg1) {
        if (!arg1) {
            ++field4682;
            class55 var3 = this.field4659.method3647(arg0, true, true, -1, 262144);
            if (var3 != null) {
                int var4 = super.field9696 >> 9;
                int var5 = super.field9705 >> 9;
                class393 var6 = arg0.method339();
                var6.method503(super.field9696, super.field9701, super.field9705);
                this.field4659.method3646(var3, var4, var5, var5, false, arg0, var4, (byte) -103, var6);
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)Z", line = 318)
    public final boolean method395(int arg0) {
        ++field4663;
        if (arg0 != -29400) {
            this.field4659 = null;
        }
        return this.field4659.method3657((byte) -116);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLr;)Lll;", line = 332)
    public final class334 method408(byte arg0, class167 arg1) {
        ++field4653;
        if (arg0 != 111) {
            this.field4665 = null;
        }
        return this.field4665;
    }

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "(I)V", line = 351)
    public static void method2073(int arg0) {
        field4671 = null;
        field4676 = null;
        field4679 = null;
        field4681 = null;
        field4678 = null;
        if (arg0 != 8615) {
            method2072(-21, 124, -22, 119, -3, -85, false);
        }
        field4674 = null;
    }
}
