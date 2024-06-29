import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class625 extends class573 implements class457 {

    @OriginalMember(owner = "client!paa", name = "X", descriptor = "Z")
    private boolean field8588 = false;

    @OriginalMember(owner = "client!paa", name = "T", descriptor = "Ljfa;")
    public class292 field8584;

    @OriginalMember(owner = "client!paa", name = "V", descriptor = "Z")
    private boolean field8586;

    @OriginalMember(owner = "client!paa", name = "ab", descriptor = "Lkg;")
    public static class275 field8591 = new class275(65, 20);

    @OriginalMember(owner = "client!paa", name = "gb", descriptor = "Lkg;")
    public static class275 field8597 = new class275(101, -1);

    @OriginalMember(owner = "client!paa", name = "N", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!paa", name = "O", descriptor = "I")
    public static int field8579;

    @OriginalMember(owner = "client!paa", name = "Q", descriptor = "I")
    public static int field8581;

    @OriginalMember(owner = "client!paa", name = "R", descriptor = "I")
    public static int field8582;

    @OriginalMember(owner = "client!paa", name = "S", descriptor = "I")
    public static int field8583;

    @OriginalMember(owner = "client!paa", name = "U", descriptor = "I")
    public static int field8585;

    @OriginalMember(owner = "client!paa", name = "W", descriptor = "I")
    public static int field8587;

    @OriginalMember(owner = "client!paa", name = "Y", descriptor = "I")
    public static int field8589;

    @OriginalMember(owner = "client!paa", name = "Z", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!paa", name = "bb", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!paa", name = "cb", descriptor = "I")
    public static int field8593;

    @OriginalMember(owner = "client!paa", name = "db", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!paa", name = "eb", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!paa", name = "fb", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!paa", name = "hb", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!paa", name = "jb", descriptor = "I")
    public static int field8600;

    @OriginalMember(owner = "client!paa", name = "lb", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!paa", name = "kb", descriptor = "Lsq;")
    public static class181 field8601;

    @OriginalMember(owner = "client!paa", name = "P", descriptor = "Lwg;")
    private class428 field8580;

    @OriginalMember(owner = "client!paa", name = "ib", descriptor = "Lnd;")
    public static class547 field8599;

    @OriginalMember(owner = "client!paa", name = "mb", descriptor = "[I")
    public static int[] field8603;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)I", line = 3)
    public final int method743(int arg0) {
        if (arg0 != -30968) {
            return -91;
        } else {
            ++field8587;
            return this.field8584.field3819;
        }
    }

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "(B)I", line = 20)
    public final int method87(byte arg0) {
        if (arg0 != 121) {
            return 86;
        } else {
            ++field8595;
            return this.field8584.method1750(3);
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIILha;IBILjava/lang/String;)V", line = 31)
    public static final void method3505(int arg0, int arg1, int arg2, class60 arg3, int arg4, byte arg5, int arg6, String arg7) {
        ++field8590;
        if (class584.field8170 == null || class180.field2524 == null) {
            if (class268.field3369.method3154(class536.field7427, (byte) 98) && class268.field3369.method3154(class270.field3405, (byte) 98)) {
                class584.field8170 = arg3.method508(class728.method4059(class268.field3369, class536.field7427, 0), true);
                class728 var8 = class728.method4059(class268.field3369, class270.field3405, 0);
                class180.field2524 = arg3.method508(var8, true);
                var8.method4063();
                class590.field8272 = arg3.method508(var8, true);
            } else {
                arg3.method528(arg2, arg6, arg1, arg0, 255 - class102.field1414 << 24 | class645.field8933, 1);
            }
        }
        if (class584.field8170 != null && class180.field2524 != null) {
            int var9 = (arg1 + -(class180.field2524.method143() * 2)) / class584.field8170.method143();
            for (int var10 = 0; ~var9 < ~var10; ++var10) {
                class584.field8170.method2759(class180.field2524.method143() + arg2 + var10 * class584.field8170.method143(), arg6);
            }
            class180.field2524.method2759(arg2, arg6);
            class590.field8272.method2759(arg1 + arg2 + -class590.field8272.method143(), arg6);
        }
        class242.field3132.method555(-16777216 | class649.field9014, arg7, 0, -1, arg2 + 3, arg6 + 14);
        if (arg5 != -51) {
            method3505(35, -43, 41, (class60) null, -53, (byte) -39, 123, (String) null);
        }
        arg3.method528(arg2, arg0 + arg6, arg1, -arg0 + arg4, class645.field8933 | -class102.field1414 + 255 << 24, 1);
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(ILha;)V", line = 75)
    public final void method760(int arg0, class60 arg1) {
        this.field8584.method1746(2, arg1);
        ++field8582;
        if (arg0 != -31507) {
            field8597 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lha;I)V", line = 86)
    public final void method744(class60 arg0, int arg1) {
        ++field8602;
        if (arg1 == 0) {
            class474 var3 = this.field8584.method1752(true, arg0, true, 262144, false);
            if (var3 != null) {
                int var4 = super.field5801 >> 9;
                int var5 = super.field5797 >> 9;
                class631 var6 = arg0.method531();
                var6.method596(super.field5801, super.field5800, super.field5797);
                this.field8584.method1745(var5, var5, var6, false, var3, arg0, var4, var4, false);
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(BILha;I)Z", line = 110)
    public final boolean method752(byte arg0, int arg1, class60 arg2, int arg3) {
        ++field8585;
        class474 var5 = this.field8584.method1752(false, arg2, true, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            class631 var6 = arg2.method531();
            if (arg0 >= -41) {
                this.method87((byte) -127);
            }
            var6.method596(super.field8056 + super.field5801, super.field5800, super.field8053 + super.field5797);
            return class232.field3053 ? var5.method275(arg1, arg3, var6, false, 0, class286.field3600) : var5.method258(arg1, arg3, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!paa", name = "h", descriptor = "(I)I", line = 133)
    public final int method84(int arg0) {
        ++field8583;
        if (arg0 != 1027) {
            this.field8580 = null;
        }
        return this.field8584.method1744((byte) -20);
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lha;Lac;IIIIIZIIIII)V", line = 144)
    public class625(class60 arg0, class543 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field8584 = new class292(arg0, arg1, arg10, arg11, super.field5796, arg3, this, arg7, arg12);
        this.field8586 = arg1.field7550 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!paa", name = "g", descriptor = "(B)Z", line = 153)
    public final boolean method83(byte arg0) {
        ++field8596;
        if (arg0 != -69) {
            field8591 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(B)V", line = 172)
    public final void method746(byte arg0) {
        if (arg0 < 82) {
            this.field8580 = null;
        }
        ++field8578;
    }

    @OriginalMember(owner = "client!paa", name = "e", descriptor = "(I)Z", line = 182)
    public final boolean method85(int arg0) {
        ++field8589;
        if (arg0 >= -79) {
            field8591 = null;
        }
        return this.field8588;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILtd;)V", line = 200)
    public final void method3506(int arg0, class456 arg1) {
        this.field8584.method1749(-1, arg1);
        int var3 = -42 % ((12 - arg0) / 55);
        ++field8592;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILha;)V", line = 211)
    public final void method761(int arg0, class60 arg1) {
        ++field8581;
        int var3 = 95 / ((arg0 - 63) / 51);
        this.field8584.method1747(arg1, 10625);
    }

    @OriginalMember(owner = "client!paa", name = "j", descriptor = "(I)V", line = 222)
    public static void method3507(int arg0) {
        field8603 = null;
        field8599 = null;
        field8597 = null;
        if (arg0 != 131072) {
            method3505(52, -16, 100, (class60) null, -42, (byte) -67, -95, (String) null);
        }
        field8591 = null;
        field8601 = null;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Z)I", line = 236)
    public final int method758(boolean arg0) {
        ++field8579;
        if (!arg0) {
            this.method87((byte) 106);
        }
        return this.field8584.field3831;
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(Lha;I)Ljk;", line = 247)
    public final class635 method755(class60 arg0, int arg1) {
        ++field8600;
        class474 var3 = this.field8584.method1752(true, arg0, true, 2048, false);
        if (var3 == null) {
            return null;
        } else {
            class631 var4 = arg0.method531();
            int var5 = 33 % ((arg1 - -39) / 55);
            var4.method596(super.field8056 + super.field5801, super.field5800, super.field5797 - -super.field8053);
            class635 var6 = class510.method2982(this.field8586, 0, 1);
            int var7 = super.field5801 >> 9;
            int var8 = super.field5797 >> 9;
            this.field8584.method1745(var8, var8, var4, true, var3, arg0, var7, var7, false);
            if (class232.field3053) {
                var3.method255(var4, var6.field8760[0], class286.field3600, 0);
            } else {
                var3.method250(var4, var6.field8760[0], 0);
            }
            if (this.field8584.field3839 != null) {
                class741 var9 = this.field8584.field3839.method2969();
                if (class232.field3053) {
                    arg0.method545(var9, class286.field3600);
                } else {
                    arg0.method455(var9);
                }
            }
            this.field8588 = var3.method287() || this.field8584.field3839 != null;
            if (this.field8580 != null) {
                class654.method3675((byte) -121, this.field8580, var3, super.field5801, super.field5800, super.field5797);
            } else {
                this.field8580 = class43.method309(super.field5800, var3, super.field5797, super.field5801, -86);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)I", line = 298)
    public final int method745(byte arg0) {
        int var2 = -49 / ((arg0 - -33) / 56);
        ++field8598;
        return this.field8584.field3824;
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)Z", line = 312)
    public final boolean method756(int arg0) {
        ++field8593;
        if (arg0 >= -52) {
            field8591 = null;
        }
        return this.field8584.method1748(-27353);
    }

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "(ILha;)Lwg;", line = 327)
    public final class428 method750(int arg0, class60 arg1) {
        ++field8594;
        if (arg0 > -22) {
            this.field8586 = false;
        }
        return this.field8580;
    }
}
