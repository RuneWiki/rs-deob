import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class305 extends class417 implements class248 {

    @OriginalMember(owner = "client!bn", name = "F", descriptor = "Lik;")
    public class138 field4653;

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "Z")
    private boolean field4649;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
    public static int field4650 = 0;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!bn", name = "G", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!bn", name = "H", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!bn", name = "I", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!bn", name = "J", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!bn", name = "K", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!bn", name = "L", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!bn", name = "M", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!bn", name = "N", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!bn", name = "O", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!bn", name = "P", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!bn", name = "Q", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!bn", name = "R", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!bn", name = "S", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!bn", name = "T", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!bn", name = "U", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!bn", name = "V", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!bn", name = "W", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lqa;I)V", line = 4)
    public final void method9(class162 arg0, int arg1) {
        this.field4653.method1028(arg0, (byte) -74);
        ++field4648;
        if (arg1 >= -111) {
            method2000((byte) 81, 68);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILqa;ZLto;III)V", line = 15)
    public final void method18(int arg0, class162 arg1, boolean arg2, class8 arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -1) {
            this.method26(-87);
        }
        ++field4664;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)I", line = 26)
    public final int method19(byte arg0) {
        if (arg0 != -69) {
            field4650 = -92;
        }
        ++field4670;
        return this.field4653.field2192;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BB)C", line = 37)
    public static final char method1999(byte arg0, byte arg1) {
        ++field4666;
        int var2 = arg0 & 255;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (~var2 <= -129 && ~var2 > -161) {
                char var3 = class26.field569[var2 + -128];
                if (~var3 == -1) {
                    var3 = '?';
                }
                var2 = var3;
            }
            if (arg1 <= 11) {
                method2000((byte) 77, 67);
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)I", line = 70)
    public final int method547(int arg0) {
        if (arg0 != 3) {
            field4654 = -109;
        }
        ++field4667;
        return this.field4653.method1037((byte) 10);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)Z", line = 83)
    public final boolean method8(int arg0) {
        if (arg0 < 94) {
            this.field4649 = false;
        }
        ++field4647;
        return this.field4653.method1034(15361);
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)I", line = 96)
    public final int method17(byte arg0) {
        int var2 = 125 % ((-60 - arg0) / 40);
        ++field4659;
        return this.field4653.field2215;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)I", line = 111)
    public final int method12(int arg0) {
        if (arg0 != 3765) {
            this.field4653 = null;
        }
        ++field4651;
        return this.field4653.field2203;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BI)Z", line = 122)
    public static final boolean method2000(byte arg0, int arg1) {
        ++field4661;
        class89 var2 = class329.method2116(arg1, (byte) 83);
        if (var2 == null) {
            return false;
        } else if (class293.field4179 != 3) {
            class487.field7219 = var2.field1553;
            class315.field4742 = var2.field1550;
            if (class446.field6661 != class423.field6322) {
                class132.field2082 = class487.field7219 + 40000;
                class175.field2679 = class487.field7219 + 50000;
                class187.field2793 = class132.field2082;
            }
            return true;
        } else {
            String var3 = "";
            if (class446.field6661 != class423.field6322) {
                var3 = ":" + (var2.field1553 + 7000);
            }
            String var4 = "";
            if (class66.field1138 != null) {
                var4 = "/p=" + class66.field1138;
            }
            String var5 = "http://" + var2.field1550 + var3 + "/l=" + client.field2870 + "/a=" + class110.field1871 + var4 + "/j" + (!class61.field1073 ? "0" : "1") + ",o" + (class302.field4284 ? "1" : "0") + ",a2";
            try {
                class19.field322.getAppletContext().showDocument(new URL(var5), "_self");
                if (arg0 >= -60) {
                    method2000((byte) -44, 115);
                }
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILqa;)V", line = 172)
    public final void method15(int arg0, class162 arg1) {
        ++field4655;
        if (arg0 != -13300) {
            this.method25((byte) 27, (class162) null);
        }
        this.field4653.method1032(arg1, (byte) -112);
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)V", line = 183)
    public final void method22(byte arg0) {
        ++field4660;
        if (arg0 != -3) {
            field4654 = -123;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lqa;II)Lc;", line = 194)
    public final class121 method23(class162 arg0, int arg1, int arg2) {
        ++field4657;
        return arg1 != 17793 ? null : this.field4653.method1033(-4, arg2, false, arg0, 0, false, 0);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZLqa;)Lae;", line = 206)
    public final class163 method13(boolean arg0, class162 arg1) {
        ++field4658;
        class121 var3 = this.field4653.method1033(-4, 2048, true, arg1, super.field6233, arg0, super.field6228);
        if (var3 == null) {
            return null;
        } else {
            class414 var4 = arg1.method240();
            var4.method868(super.field6228, super.field6230, super.field6233);
            class163 var5 = null;
            if (this.field4649) {
                var5 = class483.method2876(1, 0);
            }
            if (this.field4653.field2200 != null) {
                class49 var6 = this.field4653.field2200.method724();
                arg1.method249(var3, var6, var4, var5 != null ? var5.field2516[0] : null, 0);
            } else {
                var3.method927(var4, var5 != null ? var5.field2516[0] : null, 0);
            }
            this.field4653.method1030(super.field6226, (byte) 90, arg1, super.field6231, super.field6235, true, var3, super.field6238);
            return var5;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILqa;II)Z", line = 240)
    public final boolean method14(int arg0, class162 arg1, int arg2, int arg3) {
        ++field4665;
        class121 var5 = this.field4653.method1033(-4, arg0, false, arg1, super.field6233, false, super.field6228);
        if (var5 == null) {
            return false;
        } else {
            class414 var6 = arg1.method240();
            var6.method868(super.field6228, super.field6230, super.field6233);
            return var5.method924(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "(B)V", line = 262)
    public static final void method2001(byte arg0) {
        ++field4662;
        int var1 = 8 / ((-62 - arg0) / 47);
        int var2 = 0;
        for (int var3 = 0; ~class33.field662 < ~var3; ++var3) {
            for (int var4 = 0; var4 < class121.field1966; ++var4) {
                if (class430.method2579(var3, var4, var2, -1, true, class380.field5761)) {
                    ++var2;
                }
                if (~var2 <= -513) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V", line = 301)
    public final void method26(int arg0) {
        int var2 = -41 / ((arg0 - -46) / 44);
        ++field4668;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(Z)Z", line = 310)
    public final boolean method24(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field4669;
            return false;
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lqa;Lgm;IIIIIZIIIIIII)V", line = 321)
    public class305(class162 arg0, class79 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field1331 == 1, class264.method1702(arg12, 126, arg13));
        this.field4653 = new class138(arg0, arg1, arg12, arg13, super.field6232, arg3, arg4, arg6, arg7, arg14);
        this.field4649 = arg1.field1357 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BLqa;)V", line = 332)
    public final void method25(byte arg0, class162 arg1) {
        ++field4656;
        int var3 = -40 % ((arg0 - -45) / 48);
        class121 var4 = this.field4653.method1033(-4, 262144, true, arg1, super.field6233, true, super.field6228);
        if (var4 != null) {
            this.field4653.method1030(super.field6226, (byte) 104, arg1, super.field6231, super.field6235, false, var4, super.field6238);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lmq;ILqa;)V", line = 346)
    public static final void method2002(class350 arg0, int arg1, class162 arg2) {
        ++field4652;
        boolean var3 = class367.field5550.method1311(arg0.field5367 | -16777216, arg0.field5252, arg0.field5213, arg0.field5296, arg2, arg0.field5273, arg1 + 551, arg0.field5282 ? class139.field2224.field3717 : null) == null;
        if (var3) {
            class405.field6071.method2417(72, new class476(arg0.field5273, arg0.field5296, arg0.field5213, -16777216 | arg0.field5367, arg0.field5252, arg0.field5282));
            class302.method1902((byte) 51, arg0);
        }
        if (arg1 != -629) {
            method1999((byte) -97, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 366)
    public static final int method2003(String arg0, int arg1) {
        ++field4663;
        if (arg0 == null) {
            return -1;
        } else {
            for (int var2 = 0; class184.field2756 > var2; ++var2) {
                if (arg0.equalsIgnoreCase(class436.field6504[var2])) {
                    return var2;
                }
            }
            int var3 = 105 % ((-51 - arg1) / 52);
            return -1;
        }
    }
}
