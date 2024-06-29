import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class440 extends class524 implements class691 {

    @OriginalMember(owner = "client!oga", name = "eb", descriptor = "Z")
    private boolean field6284 = false;

    @OriginalMember(owner = "client!oga", name = "X", descriptor = "Llq;")
    public class512 field6277;

    @OriginalMember(owner = "client!oga", name = "L", descriptor = "Z")
    private boolean field6266;

    @OriginalMember(owner = "client!oga", name = "Y", descriptor = "I")
    public static int field6278 = -1;

    @OriginalMember(owner = "client!oga", name = "M", descriptor = "Loe;")
    public static class183 field6267 = new class183();

    @OriginalMember(owner = "client!oga", name = "lb", descriptor = "I")
    public static int field6291 = -1;

    @OriginalMember(owner = "client!oga", name = "mb", descriptor = "[I")
    public static int[] field6292 = new int[8];

    @OriginalMember(owner = "client!oga", name = "nb", descriptor = "Lmq;")
    public static class472 field6293 = new class472(3000000, 200);

    @OriginalMember(owner = "client!oga", name = "N", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!oga", name = "O", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!oga", name = "P", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!oga", name = "Q", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!oga", name = "S", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!oga", name = "T", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!oga", name = "U", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!oga", name = "W", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!oga", name = "Z", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!oga", name = "ab", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!oga", name = "bb", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!oga", name = "cb", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!oga", name = "db", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!oga", name = "fb", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!oga", name = "gb", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!oga", name = "hb", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!oga", name = "ib", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!oga", name = "jb", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!oga", name = "kb", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!oga", name = "R", descriptor = "Lsr;")
    private class229 field6272;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)I", line = 4)
    public final int method1067(byte arg0) {
        int var2 = 77 % ((-1 - arg0) / 37);
        ++field6268;
        return this.field6277.field7499;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lr;B)Llt;", line = 14)
    public final class626 method170(class165 arg0, byte arg1) {
        ++field6274;
        class55 var3 = this.field6277.method3039(true, false, 2048, false, arg0);
        if (arg1 != -2) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            class394 var4 = arg0.method315();
            var4.method712(super.field530, super.field527, super.field531);
            class626 var5 = null;
            if (this.field6266) {
                var5 = class547.method3208(1, -16660);
            }
            int var6 = super.field530 >> 9;
            int var7 = super.field531 >> 9;
            this.field6277.method3038(var7, var4, var6, -71, var6, var7, true, var3, arg0);
            if (class547.field7943) {
                var3.method122(var4, var5 == null ? null : var5.field8985[0], class676.field9693, 0);
            } else {
                var3.method67(var4, var5 == null ? null : var5.field8985[0], 0);
            }
            if (this.field6277.field7505 != null) {
                class436 var8 = this.field6277.field7505.method3869();
                if (class547.field7943) {
                    arg0.method223(var8, class676.field9693);
                } else {
                    arg0.method228(var8);
                }
            }
            this.field6284 = var3.method112() || this.field6277.field7505 != null;
            if (this.field6272 != null) {
                class571.method3343(super.field527, this.field6272, var3, super.field530, -28256, super.field531);
            } else {
                this.field6272 = class430.method2587((byte) 77, super.field527, super.field531, super.field530, var3);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)I", line = 69)
    public final int method1072(int arg0) {
        if (arg0 != 4378) {
            this.method1073((byte) -41, (class165) null);
        }
        ++field6271;
        return this.field6277.field7502;
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lr;Lfga;IIIIIZII)V", line = 80)
    public class440(class165 arg0, class232 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field3042);
        this.field6277 = new class512(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field6266 = arg1.field3029 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(BLr;)Lsr;", line = 89)
    public final class229 method161(byte arg0, class165 arg1) {
        ++field6290;
        if (arg0 < 100) {
            field6292 = null;
        }
        return this.field6272;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(ILr;)V", line = 103)
    public final void method1068(int arg0, class165 arg1) {
        this.field6277.method3042(arg1, -108);
        ++field6273;
        if (arg0 > -22) {
            this.field6266 = true;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(BLr;)V", line = 114)
    public final void method1073(byte arg0, class165 arg1) {
        if (arg0 == 73) {
            ++field6280;
            this.field6277.method3041(arg1, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "(B)Z", line = 128)
    public final boolean method165(byte arg0) {
        if (arg0 >= -21) {
            field6292 = null;
        }
        ++field6287;
        return this.field6284;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)I", line = 139)
    public final int method1070(int arg0) {
        if (arg0 != -24359) {
            this.method166((class165) null, -109, 19, 86);
        }
        ++field6279;
        return this.field6277.field7483;
    }

    @OriginalMember(owner = "client!oga", name = "k", descriptor = "(I)V", line = 152)
    public static final void method2619(int arg0) {
        if (arg0 != 21649) {
            method2619(82);
        }
        ++field6283;
        if (class552.field8018 != null) {
            if (~class552.field8018.field6693 == -2) {
                class552.field8018 = null;
                return;
            }
            if (class552.field8018.field6693 == 2) {
                class663.method3747(2, class37.field704, arg0 ^ -8399, class602.field8681);
                class552.field8018 = null;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIZLr;ILub;I)V", line = 180)
    public final void method169(int arg0, int arg1, boolean arg2, class165 arg3, int arg4, class20 arg5, int arg6) {
        ++field6286;
        if (arg4 < 113) {
            this.method170((class165) null, (byte) 99);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "(B)I", line = 191)
    public final int method172(byte arg0) {
        ++field6281;
        if (arg0 != -117) {
            field6293 = null;
        }
        return this.field6277.method3034(arg0 + 133);
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lr;III)Z", line = 205)
    public final boolean method166(class165 arg0, int arg1, int arg2, int arg3) {
        ++field6288;
        class55 var5 = this.field6277.method3039(false, false, 131072, false, arg0);
        if (var5 == null) {
            return false;
        } else {
            if (arg3 >= -20) {
                field6291 = -57;
            }
            class394 var6 = arg0.method315();
            var6.method712(super.field530, super.field527, super.field531);
            return !class547.field7943 ? var5.method129(arg1, arg2, var6, false) : var5.method124(arg1, arg2, var6, false, class676.field9693);
        }
    }

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "(I)Z", line = 225)
    public final boolean method175(int arg0) {
        ++field6275;
        if (arg0 != 0) {
            this.method1068(-76, (class165) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "(I)V", line = 236)
    public final void method1071(int arg0) {
        ++field6285;
        if (arg0 != -31121) {
            this.method172((byte) -86);
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(Z)V", line = 246)
    public static void method2620(boolean arg0) {
        field6292 = null;
        if (!arg0) {
            field6278 = 103;
        }
        field6267 = null;
        field6293 = null;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lr;Z)V", line = 263)
    public final void method162(class165 arg0, boolean arg1) {
        ++field6269;
        class55 var3 = this.field6277.method3039(true, true, 262144, arg1, arg0);
        if (!arg1) {
            if (var3 != null) {
                int var4 = super.field530 >> 9;
                int var5 = super.field531 >> 9;
                class394 var6 = arg0.method315();
                var6.method712(super.field530, super.field527, super.field531);
                this.field6277.method3038(var5, var6, var4, -62, var4, var5, false, var3, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)Z", line = 289)
    public final boolean method1069(int arg0) {
        if (arg0 != 17819) {
            field6293 = null;
        }
        ++field6270;
        return this.field6277.method3035((byte) -78);
    }

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "(I)I", line = 302)
    public final int method173(int arg0) {
        ++field6289;
        if (arg0 != 32249) {
            this.method167((byte) 91);
        }
        return this.field6277.method3033((byte) -127);
    }

    @OriginalMember(owner = "client!oga", name = "h", descriptor = "(I)V", line = 320)
    public final void method163(int arg0) {
        int var2 = 32 / ((35 - arg0) / 54);
        ++field6282;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "(B)Z", line = 342)
    public final boolean method167(byte arg0) {
        if (arg0 != 118) {
            return false;
        } else {
            ++field6276;
            return false;
        }
    }
}
