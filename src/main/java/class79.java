import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class79 extends class743 implements class649 {

    @OriginalMember(owner = "client!tv", name = "tb", descriptor = "B")
    private byte field1092;

    @OriginalMember(owner = "client!tv", name = "pb", descriptor = "B")
    private byte field1088;

    @OriginalMember(owner = "client!tv", name = "rb", descriptor = "S")
    private short field1090;

    @OriginalMember(owner = "client!tv", name = "mb", descriptor = "Z")
    private boolean field1085;

    @OriginalMember(owner = "client!tv", name = "J", descriptor = "Z")
    private boolean field1064;

    @OriginalMember(owner = "client!tv", name = "eb", descriptor = "Z")
    private boolean field1077;

    @OriginalMember(owner = "client!tv", name = "Z", descriptor = "Z")
    private boolean field1072;

    @OriginalMember(owner = "client!tv", name = "ub", descriptor = "Lr;")
    private class706 field1093;

    @OriginalMember(owner = "client!tv", name = "nb", descriptor = "Lka;")
    public class283 field1086;

    @OriginalMember(owner = "client!tv", name = "W", descriptor = "Z")
    public static boolean field1069 = false;

    @OriginalMember(owner = "client!tv", name = "qb", descriptor = "I")
    public static int field1089 = 0;

    @OriginalMember(owner = "client!tv", name = "E", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!tv", name = "H", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!tv", name = "S", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!tv", name = "T", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!tv", name = "U", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!tv", name = "V", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!tv", name = "X", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!tv", name = "Y", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!tv", name = "ab", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!tv", name = "bb", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!tv", name = "cb", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!tv", name = "db", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!tv", name = "fb", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!tv", name = "gb", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!tv", name = "hb", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!tv", name = "ib", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!tv", name = "jb", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!tv", name = "kb", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!tv", name = "lb", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!tv", name = "ob", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!tv", name = "sb", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!tv", name = "vb", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!tv", name = "wb", descriptor = "Lgp;")
    private class551 field1095;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IBZILha;ILig;)V")
    public final void method365(int arg0, byte arg1, boolean arg2, int arg3, class545 arg4, int arg5, class674 arg6) {
        if (arg1 >= 76) {
            ++field1065;
            if (arg6 instanceof class619) {
                class619 var8 = (class619) arg6;
                if (this.field1086 != null && var8.field8820 != null) {
                    this.field1086.method1152(var8.field8820, arg5, arg0, arg3, arg2);
                }
            } else {
                if (arg6 instanceof class79) {
                    class79 var9 = (class79) arg6;
                    if (this.field1086 != null && var9.field1086 != null) {
                        this.field1086.method1152(var9.field1086, arg5, arg0, arg3, arg2);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "(I)I")
    public final int method268(int arg0) {
        if (arg0 != -1) {
            this.field1095 = null;
        }
        ++field1073;
        return this.field1086 == null ? 0 : this.field1086.method1120();
    }

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "(I)I")
    public final int method282(int arg0) {
        if (arg0 != -1) {
            return 114;
        } else {
            ++field1071;
            return this.field1086 != null ? this.field1086.method1113() : 0;
        }
    }

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "(B)Z")
    public final boolean method283(byte arg0) {
        if (arg0 >= -33) {
            this.field1090 = 111;
        }
        ++field1078;
        return this.field1086 != null ? this.field1086.method1130() : false;
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(Lha;I)Ljl;")
    public final class596 method278(class545 arg0, int arg1) {
        ++field1067;
        if (this.field1086 == null) {
            return null;
        } else {
            if (arg1 != 2274) {
                this.field1077 = true;
            }
            class723 var3 = arg0.method2087();
            var3.method848(super.field9490, super.field9502, super.field9489);
            class596 var4 = class589.method3502(1, this.field1077, 0);
            if (!class286.field3774) {
                this.field1086.method1168(var3, var4.field8579[0], 0);
            } else {
                this.field1086.method1164(var3, var4.field8579[0], class527.field7375, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(ILha;)V")
    public final void method271(int arg0, class545 arg1) {
        int var3 = -117 / ((arg0 - -15) / 57);
        ++field1079;
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)Z")
    public final boolean method373(byte arg0) {
        ++field1068;
        if (arg0 != -57) {
            this.method278((class545) null, 8);
        }
        return this.field1085;
    }

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "(I)I")
    public final int method475(int arg0) {
        ++field1062;
        if (arg0 != 0) {
            this.method276(67);
        }
        return this.field1086 == null ? 15 : this.field1086.method1132() / 4;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILha;)V")
    public final void method272(int arg0, class545 arg1) {
        ++field1081;
        Object var3 = null;
        class706 var5;
        if (this.field1093 == null && this.field1072) {
            class693 var4 = this.method476(true, arg1, 262144, arg0 + 6516);
            var5 = var4 == null ? null : var4.field9692;
        } else {
            var5 = this.field1093;
            this.field1093 = null;
        }
        if (var5 != null) {
            class308.method1811(var5, super.field9495, super.field9490, super.field9489, (boolean[]) null);
        }
        if (arg0 != 24139) {
            this.method270((class545) null, 7);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)I")
    public final int method269(int arg0) {
        if (arg0 != -17174) {
            return 122;
        } else {
            ++field1082;
            return this.field1088;
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(ILha;)Lgp;")
    public final class551 method274(int arg0, class545 arg1) {
        if (this.field1095 == null) {
            this.field1095 = class477.method2821(-1, super.field9489, this.method477(0, 0, arg1), super.field9502, super.field9490);
        }
        ++field1083;
        return arg0 != 0 ? null : this.field1095;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZLha;II)Lws;")
    private final class693 method476(boolean arg0, class545 arg1, int arg2, int arg3) {
        ++field1084;
        class30 var5 = class264.field3604.method3188(this.field1090 & 65535, (byte) -57);
        if (arg3 != 30655) {
            this.field1092 = -10;
        }
        class339 var6;
        class339 var7;
        if (!this.field1064) {
            var6 = class155.field2126[super.field9495];
            if (super.field9495 < 3) {
                var7 = class155.field2126[super.field9495 + 1];
            } else {
                var7 = null;
            }
        } else {
            var7 = class155.field2126[0];
            var6 = class435.field5969[super.field9495];
        }
        return var5.method226(arg2, super.field9489, arg0, ~this.field1092 != -12 ? this.field1088 : 4 - -this.field1088, arg1, super.field9490, super.field9502, this.field1092 == 11 ? 10 : this.field1092, var6, 0, var7);
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lha;Lkha;IIIIIZIIIIIIZ)V")
    public class79(class545 arg0, class30 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field431 == 1, class323.method1888(arg12, 2, arg13));
        this.field1092 = (byte) arg12;
        super.field9495 = (byte) arg3;
        this.field1088 = (byte) arg13;
        this.field1090 = (short) arg1.field442;
        this.field1085 = arg14;
        this.field1064 = arg7;
        this.field1077 = arg1.field467 != 0 && !arg7;
        this.field1072 = arg0.method2086() && arg1.field439 && !this.field1064 && ~class674.field9500.field5151.method2364(0) != -1;
        int var16 = 2048;
        if (this.field1085) {
            var16 |= 65536;
        }
        class693 var17 = this.method476(this.field1072, arg0, var16, 30655);
        if (var17 != null) {
            this.field1093 = var17.field9692;
            this.field1086 = var17.field9689;
            if (this.field1085) {
                this.field1086 = this.field1086.method1147((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)I")
    public final int method275(int arg0) {
        ++field1066;
        if (arg0 != 24263) {
            this.field1077 = false;
        }
        return 65535 & this.field1090;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lha;I)V")
    public final void method270(class545 arg0, int arg1) {
        ++field1094;
        Object var3 = null;
        if (arg1 == -6060) {
            class706 var5;
            if (this.field1093 == null && this.field1072) {
                class693 var4 = this.method476(true, arg0, 262144, 30655);
                var5 = var4 != null ? var4.field9692 : null;
            } else {
                var5 = this.field1093;
                this.field1093 = null;
            }
            if (var5 != null) {
                class331.method1923(var5, super.field9495, super.field9490, super.field9489, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "(I)Z")
    public final boolean method277(int arg0) {
        if (arg0 != 3) {
            this.field1092 = -92;
        }
        ++field1076;
        if (this.field1086 != null) {
            return !this.field1086.method1140();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)I")
    public final int method276(int arg0) {
        ++field1075;
        if (arg0 != -25963) {
            this.field1095 = null;
        }
        return this.field1092;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)Z")
    public final boolean method281(boolean arg0) {
        if (!arg0) {
            this.method365(-120, (byte) 9, false, -116, (class545) null, -89, (class674) null);
        }
        ++field1080;
        return this.field1072;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method273(class545 arg0, int arg1, int arg2, int arg3) {
        ++field1091;
        if (arg3 != -1) {
            return false;
        } else {
            class283 var5 = this.method477(0, 131072, arg0);
            if (var5 != null) {
                class723 var6 = arg0.method2087();
                var6.method848(super.field9490, super.field9502, super.field9489);
                return !class286.field3774 ? var5.method1155(arg1, arg2, var6, false, 0) : var5.method1151(arg1, arg2, var6, false, 0, class527.field7375);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILha;)Lka;")
    private final class283 method477(int arg0, int arg1, class545 arg2) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field1074;
            if (this.field1086 != null && arg2.method2105(this.field1086.method1135(), arg1) == 0) {
                return this.field1086;
            } else {
                class693 var4 = this.method476(false, arg2, arg1, arg0 ^ 30655);
                return var4 != null ? var4.field9689 : null;
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "(B)V")
    public final void method380(byte arg0) {
        ++field1070;
        this.field1085 = false;
        int var2 = -22 / ((arg0 - -45) / 42);
        if (this.field1086 != null) {
            this.field1086.method1118(this.field1086.method1135() & -65537);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
    public final void method279(byte arg0) {
        if (arg0 <= -4) {
            ++field1087;
            if (this.field1086 != null) {
                this.field1086.method1112();
            }
        }
    }
}
