import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class733 extends class95 implements class649 {

    @OriginalMember(owner = "client!mo", name = "S", descriptor = "Z")
    private boolean field10243;

    @OriginalMember(owner = "client!mo", name = "lb", descriptor = "B")
    private byte field10262;

    @OriginalMember(owner = "client!mo", name = "cb", descriptor = "S")
    private short field10253;

    @OriginalMember(owner = "client!mo", name = "eb", descriptor = "Z")
    private boolean field10255;

    @OriginalMember(owner = "client!mo", name = "fb", descriptor = "B")
    private byte field10256;

    @OriginalMember(owner = "client!mo", name = "X", descriptor = "Z")
    private boolean field10248;

    @OriginalMember(owner = "client!mo", name = "bb", descriptor = "Lka;")
    private class283 field10252;

    @OriginalMember(owner = "client!mo", name = "M", descriptor = "Lr;")
    private class706 field10237;

    @OriginalMember(owner = "client!mo", name = "N", descriptor = "I")
    public static int field10238;

    @OriginalMember(owner = "client!mo", name = "O", descriptor = "I")
    public static int field10239;

    @OriginalMember(owner = "client!mo", name = "P", descriptor = "I")
    public static int field10240;

    @OriginalMember(owner = "client!mo", name = "Q", descriptor = "I")
    public static int field10241;

    @OriginalMember(owner = "client!mo", name = "R", descriptor = "I")
    public static int field10242;

    @OriginalMember(owner = "client!mo", name = "T", descriptor = "I")
    public static int field10244;

    @OriginalMember(owner = "client!mo", name = "U", descriptor = "I")
    public static int field10245;

    @OriginalMember(owner = "client!mo", name = "W", descriptor = "I")
    public static int field10247;

    @OriginalMember(owner = "client!mo", name = "Y", descriptor = "I")
    public static int field10249;

    @OriginalMember(owner = "client!mo", name = "Z", descriptor = "I")
    public static int field10250;

    @OriginalMember(owner = "client!mo", name = "ab", descriptor = "I")
    public static int field10251;

    @OriginalMember(owner = "client!mo", name = "db", descriptor = "I")
    public static int field10254;

    @OriginalMember(owner = "client!mo", name = "gb", descriptor = "I")
    public static int field10257;

    @OriginalMember(owner = "client!mo", name = "ib", descriptor = "I")
    public static int field10259;

    @OriginalMember(owner = "client!mo", name = "jb", descriptor = "I")
    public static int field10260;

    @OriginalMember(owner = "client!mo", name = "kb", descriptor = "I")
    public static int field10261;

    @OriginalMember(owner = "client!mo", name = "mb", descriptor = "I")
    public static int field10263;

    @OriginalMember(owner = "client!mo", name = "nb", descriptor = "I")
    public static int field10264;

    @OriginalMember(owner = "client!mo", name = "hb", descriptor = "J")
    public static long field10258;

    @OriginalMember(owner = "client!mo", name = "V", descriptor = "Lgp;")
    private class551 field10246;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lha;I)V", line = 5)
    public final void method270(class545 arg0, int arg1) {
        if (arg1 != -6060) {
            this.field10262 = 8;
        }
        ++field10240;
        Object var3 = null;
        class706 var5;
        if (this.field10237 == null && this.field10248) {
            class693 var4 = this.method4074(262144, arg0, 124, true);
            var5 = var4 != null ? var4.field9692 : null;
        } else {
            var5 = this.field10237;
            this.field10237 = null;
        }
        if (var5 != null) {
            class331.method1923(var5, super.field9495, super.field9490, super.field9489, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V", line = 32)
    public final void method279(byte arg0) {
        if (arg0 >= -4) {
            this.field10246 = null;
        }
        if (this.field10252 != null) {
            this.field10252.method1112();
        }
        ++field10238;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lha;Lkha;IIIIIZIIII)V", line = 46)
    public class733(class545 arg0, class30 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field10243 = arg7;
        this.field10262 = (byte) arg11;
        super.field9490 = arg4;
        super.field9489 = arg6;
        this.field10253 = (short) arg1.field442;
        this.field10255 = ~arg1.field467 != -1 && !arg7;
        this.field10256 = (byte) arg10;
        this.field10248 = arg0.method2086() && arg1.field439 && !this.field10243 && ~class674.field9500.field5151.method2364(0) != -1;
        class693 var13 = this.method4074(2048, arg0, 89, this.field10248);
        if (var13 != null) {
            this.field10252 = var13.field9689;
            this.field10237 = var13.field9692;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILha;)V", line = 75)
    public final void method272(int arg0, class545 arg1) {
        ++field10260;
        Object var3 = null;
        class706 var5;
        if (this.field10237 == null && this.field10248) {
            class693 var4 = this.method4074(262144, arg1, -98, true);
            var5 = var4 != null ? var4.field9692 : null;
        } else {
            var5 = this.field10237;
            this.field10237 = null;
        }
        if (var5 != null) {
            class308.method1811(var5, super.field9495, super.field9490, super.field9489, (boolean[]) null);
        }
        if (arg0 != 24139) {
            this.method273((class545) null, 70, 107, -2);
        }
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(B)Z", line = 102)
    public final boolean method283(byte arg0) {
        if (arg0 > -33) {
            this.field10246 = null;
        }
        ++field10249;
        return this.field10252 == null ? false : this.field10252.method1130();
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)Z", line = 119)
    public final boolean method281(boolean arg0) {
        ++field10241;
        return !arg0 ? false : this.field10248;
    }

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "(I)I", line = 130)
    public final int method282(int arg0) {
        ++field10264;
        if (arg0 != -1) {
            return -62;
        } else {
            return this.field10252 != null ? this.field10252.method1113() : 0;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILha;)Lka;", line = 142)
    private final class283 method4072(int arg0, int arg1, class545 arg2) {
        ++field10247;
        if (this.field10252 != null && ~arg2.method2105(this.field10252.method1135(), arg0) == -1) {
            return this.field10252;
        } else {
            if (arg1 > -69) {
                field10258 = 126L;
            }
            class693 var4 = this.method4074(arg0, arg2, 35, false);
            return var4 != null ? var4.field9689 : null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZI)Lpaa;", line = 162)
    public static final class712 method4073(boolean arg0, int arg1) {
        ++field10244;
        int var2 = arg1 >> 16;
        if (!arg0) {
            return null;
        } else {
            int var3 = arg1 & 65535;
            if (class491.field6599[var2] == null || class491.field6599[var2][var3] == null) {
                boolean var4 = class393.method2393(var2, -1);
                if (!var4) {
                    return null;
                }
            }
            return class491.field6599[var2][var3];
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(Lha;I)Ljl;", line = 191)
    public final class596 method278(class545 arg0, int arg1) {
        ++field10263;
        if (this.field10252 == null) {
            return null;
        } else {
            class723 var3 = arg0.method2087();
            var3.method848(super.field1384 + super.field9490, super.field9502, super.field1389 + super.field9489);
            if (arg1 != 2274) {
                this.method273((class545) null, 119, -61, 121);
            }
            class596 var4 = class589.method3502(1, this.field10255, 0);
            if (class286.field3774) {
                this.field10252.method1164(var3, var4.field8579[0], class527.field7375, 0);
            } else {
                this.field10252.method1168(var3, var4.field8579[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)I", line = 219)
    public final int method269(int arg0) {
        ++field10242;
        if (arg0 != -17174) {
            this.field10246 = null;
        }
        return this.field10262;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILha;IZ)Lws;", line = 239)
    private final class693 method4074(int arg0, class545 arg1, int arg2, boolean arg3) {
        int var5 = -5 / ((arg2 - -32) / 39);
        ++field10254;
        class30 var6 = class264.field3604.method3188(65535 & this.field10253, (byte) -57);
        class339 var7;
        class339 var8;
        if (!this.field10243) {
            if (super.field9495 < 3) {
                var7 = class155.field2126[super.field9495 + 1];
            } else {
                var7 = null;
            }
            var8 = class155.field2126[super.field9495];
        } else {
            var7 = class155.field2126[0];
            var8 = class435.field5969[super.field9495];
        }
        return var6.method226(arg0, super.field9489, arg3, this.field10262, arg1, super.field9490, super.field9502, this.field10256, var8, 0, var7);
    }

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)I", line = 269)
    public final int method268(int arg0) {
        ++field10259;
        if (arg0 != -1) {
            method4073(true, 78);
        }
        return this.field10252 == null ? 0 : this.field10252.method1120();
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(ILha;)V", line = 281)
    public final void method271(int arg0, class545 arg1) {
        ++field10239;
        int var3 = -82 / ((-15 - arg0) / 57);
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(ILha;)Lgp;", line = 291)
    public final class551 method274(int arg0, class545 arg1) {
        ++field10245;
        if (this.field10246 == null) {
            this.field10246 = class477.method2821(-1, super.field9489, this.method4072(0, -120, arg1), super.field9502, super.field9490);
        }
        if (arg0 != 0) {
            this.method272(39, (class545) null);
        }
        return this.field10246;
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)I", line = 308)
    public final int method275(int arg0) {
        if (arg0 != 24263) {
            this.field10243 = true;
        }
        ++field10251;
        return 65535 & this.field10253;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lha;III)Z", line = 319)
    public final boolean method273(class545 arg0, int arg1, int arg2, int arg3) {
        ++field10257;
        if (arg3 != -1) {
            this.field10243 = true;
        }
        class283 var5 = this.method4072(131072, -116, arg0);
        if (var5 != null) {
            class723 var6 = arg0.method2087();
            var6.method848(super.field9490, super.field9502, super.field9489);
            return class286.field3774 ? var5.method1151(arg1, arg2, var6, false, 0, class527.field7375) : var5.method1155(arg1, arg2, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)I", line = 340)
    public final int method276(int arg0) {
        ++field10250;
        if (arg0 != -25963) {
            this.method268(-84);
        }
        return this.field10256;
    }

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "(I)Z", line = 353)
    public final boolean method277(int arg0) {
        if (arg0 != 3) {
            return false;
        } else {
            ++field10261;
            if (this.field10252 == null) {
                return true;
            } else {
                return !this.field10252.method1140();
            }
        }
    }
}
