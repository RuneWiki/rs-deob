import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class532 extends class43 implements class691 {

    @OriginalMember(owner = "client!uo", name = "db", descriptor = "Z")
    private boolean field7773 = false;

    @OriginalMember(owner = "client!uo", name = "R", descriptor = "Llq;")
    public class512 field7761;

    @OriginalMember(owner = "client!uo", name = "cb", descriptor = "Z")
    private boolean field7772;

    @OriginalMember(owner = "client!uo", name = "M", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!uo", name = "N", descriptor = "I")
    public static int field7757;

    @OriginalMember(owner = "client!uo", name = "O", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!uo", name = "P", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!uo", name = "Q", descriptor = "I")
    public static int field7760;

    @OriginalMember(owner = "client!uo", name = "S", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!uo", name = "T", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!uo", name = "U", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!uo", name = "V", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!uo", name = "W", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!uo", name = "X", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!uo", name = "Y", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!uo", name = "Z", descriptor = "I")
    public static int field7769;

    @OriginalMember(owner = "client!uo", name = "ab", descriptor = "I")
    public static int field7770;

    @OriginalMember(owner = "client!uo", name = "bb", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!uo", name = "eb", descriptor = "I")
    public static int field7774;

    @OriginalMember(owner = "client!uo", name = "fb", descriptor = "I")
    public static int field7775;

    @OriginalMember(owner = "client!uo", name = "hb", descriptor = "I")
    public static int field7777;

    @OriginalMember(owner = "client!uo", name = "ib", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!uo", name = "jb", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!uo", name = "kb", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!uo", name = "lb", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!uo", name = "gb", descriptor = "Lsr;")
    private class229 field7776;

    @OriginalMember(owner = "client!uo", name = "mb", descriptor = "Z")
    public static boolean field7782;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILr;)V")
    public final void method1068(int arg0, class165 arg1) {
        this.field7761.method3042(arg1, -98);
        ++field7770;
        if (arg0 > -22) {
            this.field7761 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)Z")
    public final boolean method167(byte arg0) {
        if (arg0 != 118) {
            field7778 = -11;
        }
        ++field7759;
        return false;
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)I")
    public final int method1072(int arg0) {
        ++field7760;
        if (arg0 != 4378) {
            this.method1073((byte) -122, (class165) null);
        }
        return this.field7761.field7502;
    }

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "(I)V")
    public static final void method3128(int arg0) {
        class521.field7637 = new class183();
        int var1 = -94 / ((-24 - arg0) / 44);
        ++field7780;
    }

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(B)I")
    public final int method172(byte arg0) {
        if (arg0 != -117) {
            this.field7772 = true;
        }
        ++field7768;
        return this.field7761.method3034(16);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lr;Z)V")
    public final void method162(class165 arg0, boolean arg1) {
        ++field7779;
        class55 var3 = this.field7761.method3039(true, true, 262144, arg1, arg0);
        if (var3 != null) {
            class394 var4 = arg0.method315();
            var4.method712(super.field530, super.field527, super.field531);
            this.field7761.method3038(super.field765, var4, super.field769, -125, super.field770, super.field768, false, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)V")
    public final void method1071(int arg0) {
        if (arg0 != -31121) {
            this.field7773 = true;
        }
        ++field7774;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ln;I)Ln;")
    public static final class17 method3129(class17 arg0, int arg1) {
        ++field7756;
        if (~arg0.field469 != 0) {
            return class400.method2420((byte) -112, arg0.field469);
        } else {
            int var2 = arg0.field465 >>> 16;
            class489 var3 = new class489(class113.field1442);
            class21 var4 = (class21) var3.method2851(-112);
            if (arg1 != 3450) {
                field7778 = -28;
            }
            while (var4 != null) {
                if (~var4.field540 == ~var2) {
                    return class400.method2420((byte) -117, (int) var4.field7519);
                }
                var4 = (class21) var3.method2849(false);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)I")
    public final int method1067(byte arg0) {
        ++field7758;
        int var2 = 114 / ((-1 - arg0) / 37);
        return this.field7761.field7499;
    }

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "(I)Z")
    public final boolean method175(int arg0) {
        ++field7767;
        return arg0 != 0 ? false : false;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(BLr;)Lsr;")
    public final class229 method161(byte arg0, class165 arg1) {
        if (arg0 < 100) {
            this.field7772 = true;
        }
        ++field7765;
        return this.field7776;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lr;B)Llt;")
    public final class626 method170(class165 arg0, byte arg1) {
        ++field7757;
        class55 var3 = this.field7761.method3039(true, false, 2048, false, arg0);
        if (var3 == null) {
            return null;
        } else {
            class394 var4 = arg0.method315();
            var4.method712(super.field530, super.field527, super.field531);
            class626 var5 = null;
            if (this.field7772) {
                var5 = class547.method3208(1, -16660);
            }
            if (arg1 != -2) {
                this.method172((byte) 52);
            }
            this.field7761.method3038(super.field765, var4, super.field769, -107, super.field770, super.field768, true, var3, arg0);
            if (class547.field7943) {
                var3.method122(var4, var5 == null ? null : var5.field8985[0], class676.field9693, 0);
            } else {
                var3.method67(var4, var5 != null ? var5.field8985[0] : null, 0);
            }
            if (this.field7761.field7505 != null) {
                class436 var6 = this.field7761.field7505.method3869();
                if (!class547.field7943) {
                    arg0.method228(var6);
                } else {
                    arg0.method223(var6, class676.field9693);
                }
            }
            this.field7773 = var3.method112() || this.field7761.field7505 != null;
            if (this.field7776 == null) {
                this.field7776 = class430.method2587((byte) 77, super.field527, super.field531, super.field530, var3);
            } else {
                class571.method3343(super.field527, this.field7776, var3, super.field530, -28256, super.field531);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lr;III)Z")
    public final boolean method166(class165 arg0, int arg1, int arg2, int arg3) {
        ++field7777;
        if (arg3 >= -20) {
            this.method1071(56);
        }
        class55 var5 = this.field7761.method3039(false, false, 131072, false, arg0);
        if (var5 == null) {
            return false;
        } else {
            class394 var6 = arg0.method315();
            var6.method712(super.field530, super.field527, super.field531);
            return class547.field7943 ? var5.method124(arg1, arg2, var6, false, class676.field9693) : var5.method129(arg1, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)I")
    public final int method1070(int arg0) {
        if (arg0 != -24359) {
            this.field7761 = null;
        }
        ++field7769;
        return this.field7761.field7483;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)Z")
    public final boolean method1069(int arg0) {
        ++field7764;
        if (arg0 != 17819) {
            this.field7772 = true;
        }
        return this.field7761.method3035((byte) -104);
    }

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "(I)V")
    public final void method163(int arg0) {
        ++field7763;
        int var2 = 20 / ((35 - arg0) / 54);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BLr;)V")
    public final void method1073(byte arg0, class165 arg1) {
        this.field7761.method3041(arg1, (byte) 126);
        if (arg0 == 73) {
            ++field7781;
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lr;Lfga;IIIIIZIIIIIII)V")
    public class532(class165 arg0, class232 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field3025 == 1, class324.method1892(arg12, arg13, 3));
        this.field7761 = new class512(arg0, arg1, arg12, arg13, super.field532, arg3, this, arg7, arg14);
        this.field7772 = arg1.field3029 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "(I)I")
    public static final int method3130(int arg0) {
        if (arg0 != -1) {
            field7778 = -85;
        }
        ++field7762;
        class472 var1 = class230.field2993;
        synchronized (class230.field2993) {
            return class230.field2993.method2770(arg0 + 1);
        }
    }

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "(I)I")
    public final int method173(int arg0) {
        if (arg0 != 32249) {
            this.method161((byte) 26, (class165) null);
        }
        ++field7766;
        return this.field7761.method3033((byte) -20);
    }

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "(B)Z")
    public final boolean method165(byte arg0) {
        ++field7775;
        if (arg0 > -21) {
            this.method1067((byte) 104);
        }
        return this.field7773;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIZLr;ILub;I)V")
    public final void method169(int arg0, int arg1, boolean arg2, class165 arg3, int arg4, class20 arg5, int arg6) {
        if (arg4 < 113) {
            this.method1067((byte) 39);
        }
        ++field7771;
        throw new IllegalStateException();
    }
}
