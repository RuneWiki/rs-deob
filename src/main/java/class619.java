import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class619 extends class217 implements class649 {

    @OriginalMember(owner = "client!ur", name = "eb", descriptor = "Z")
    private boolean field8812;

    @OriginalMember(owner = "client!ur", name = "ib", descriptor = "S")
    private short field8816;

    @OriginalMember(owner = "client!ur", name = "T", descriptor = "Z")
    private boolean field8801;

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "B")
    private byte field8794;

    @OriginalMember(owner = "client!ur", name = "R", descriptor = "Z")
    private boolean field8799;

    @OriginalMember(owner = "client!ur", name = "O", descriptor = "B")
    private byte field8796;

    @OriginalMember(owner = "client!ur", name = "gb", descriptor = "Z")
    private boolean field8814;

    @OriginalMember(owner = "client!ur", name = "mb", descriptor = "Lka;")
    public class283 field8820;

    @OriginalMember(owner = "client!ur", name = "nb", descriptor = "Lr;")
    private class706 field8821;

    @OriginalMember(owner = "client!ur", name = "W", descriptor = "[I")
    public static int[] field8804 = new int[4];

    @OriginalMember(owner = "client!ur", name = "J", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!ur", name = "K", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!ur", name = "L", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!ur", name = "N", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!ur", name = "P", descriptor = "I")
    public static int field8797;

    @OriginalMember(owner = "client!ur", name = "Q", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!ur", name = "S", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!ur", name = "U", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!ur", name = "V", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!ur", name = "Y", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!ur", name = "Z", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!ur", name = "ab", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!ur", name = "bb", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!ur", name = "cb", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!ur", name = "db", descriptor = "I")
    public static int field8811;

    @OriginalMember(owner = "client!ur", name = "fb", descriptor = "I")
    public static int field8813;

    @OriginalMember(owner = "client!ur", name = "hb", descriptor = "I")
    public static int field8815;

    @OriginalMember(owner = "client!ur", name = "jb", descriptor = "I")
    public static int field8817;

    @OriginalMember(owner = "client!ur", name = "lb", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!ur", name = "ob", descriptor = "I")
    public static int field8822;

    @OriginalMember(owner = "client!ur", name = "pb", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!ur", name = "X", descriptor = "Lgp;")
    private class551 field8805;

    @OriginalMember(owner = "client!ur", name = "kb", descriptor = "[I")
    public static int[] field8818;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILha;)V", line = 6)
    public final void method272(int arg0, class545 arg1) {
        ++field8823;
        if (arg0 != 24139) {
            this.method380((byte) 79);
        }
        Object var3 = null;
        class706 var5;
        if (this.field8821 == null && this.field8814) {
            class693 var4 = this.method3627(arg1, 262144, (byte) 117, true);
            var5 = var4 == null ? null : var4.field9692;
        } else {
            var5 = this.field8821;
            this.field8821 = null;
        }
        if (var5 != null) {
            class308.method1811(var5, super.field9495, super.field9490, super.field9489, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lha;Lkha;IIIIIZIIZ)V", line = 35)
    public class619(class545 arg0, class30 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class532.method3179((byte) 115, arg9, arg8));
        this.field8812 = arg10;
        this.field8816 = (short) arg1.field442;
        this.field8801 = arg7;
        super.field9489 = arg6;
        super.field9490 = arg4;
        this.field8794 = (byte) arg8;
        this.field8799 = arg1.field467 != 0 && !arg7;
        this.field8796 = (byte) arg9;
        this.field8814 = arg0.method2086() && arg1.field439 && !this.field8801 && class674.field9500.field5151.method2364(0) != 0;
        int var12 = 2048;
        if (this.field8812) {
            var12 |= 65536;
        }
        class693 var13 = this.method3627(arg0, var12, (byte) 60, this.field8814);
        if (var13 != null) {
            this.field8820 = var13.field9689;
            this.field8821 = var13.field9692;
            if (this.field8812) {
                this.field8820 = this.field8820.method1147((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)I", line = 68)
    public final int method276(int arg0) {
        ++field8791;
        return arg0 != -25963 ? 93 : this.field8794;
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(ILha;)V", line = 79)
    public final void method271(int arg0, class545 arg1) {
        ++field8802;
        int var3 = 62 / ((arg0 - -15) / 57);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lha;III)Z", line = 88)
    public final boolean method273(class545 arg0, int arg1, int arg2, int arg3) {
        ++field8819;
        class283 var5 = this.method3628(131072, true, arg0);
        if (arg3 != -1) {
            return true;
        } else if (var5 != null) {
            class723 var6 = arg0.method2087();
            var6.method848(super.field9490, super.field9502, super.field9489);
            return class286.field3774 ? var5.method1151(arg1, arg2, var6, false, 0, class527.field7375) : var5.method1155(arg1, arg2, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V", line = 111)
    public final void method279(byte arg0) {
        if (arg0 > -4) {
            this.method277(26);
        }
        ++field8809;
        if (this.field8820 != null) {
            this.field8820.method1112();
        }
    }

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "(I)I", line = 129)
    public final int method268(int arg0) {
        if (arg0 != -1) {
            this.field8812 = false;
        }
        ++field8798;
        return this.field8820 == null ? 0 : this.field8820.method1120();
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)I", line = 140)
    public final int method269(int arg0) {
        ++field8810;
        return arg0 != -17174 ? -41 : this.field8796;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lha;IBZ)Lws;", line = 152)
    private final class693 method3627(class545 arg0, int arg1, byte arg2, boolean arg3) {
        ++field8795;
        if (arg2 <= 51) {
            return null;
        } else {
            class30 var5 = class264.field3604.method3188(65535 & this.field8816, (byte) -57);
            class339 var6;
            class339 var7;
            if (this.field8801) {
                var6 = class435.field5969[super.field9495];
                var7 = class155.field2126[0];
            } else {
                var6 = class155.field2126[super.field9495];
                if (~super.field9495 <= -4) {
                    var7 = null;
                } else {
                    var7 = class155.field2126[super.field9495 + 1];
                }
            }
            return var5.method226(arg1, super.field9489, arg3, this.field8796, arg0, super.field9490, super.field9502, this.field8794, var6, 0, var7);
        }
    }

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "(B)V", line = 182)
    public final void method380(byte arg0) {
        ++field8792;
        this.field8812 = false;
        int var2 = -121 / ((arg0 - -45) / 42);
        if (this.field8820 != null) {
            this.field8820.method1118(-65537 & this.field8820.method1135());
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(ILha;)Lgp;", line = 195)
    public final class551 method274(int arg0, class545 arg1) {
        ++field8815;
        if (this.field8805 == null) {
            this.field8805 = class477.method2821(-1, super.field9489, this.method3628(0, true, arg1), super.field9502, super.field9490);
        }
        if (arg0 != 0) {
            method3629(61);
        }
        return this.field8805;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZLha;)Lka;", line = 214)
    private final class283 method3628(int arg0, boolean arg1, class545 arg2) {
        if (!arg1) {
            this.field8801 = false;
        }
        ++field8817;
        if (this.field8820 != null && ~arg2.method2105(this.field8820.method1135(), arg0) == -1) {
            return this.field8820;
        } else {
            class693 var4 = this.method3627(arg2, arg0, (byte) 113, false);
            return var4 == null ? null : var4.field9689;
        }
    }

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "(I)Z", line = 236)
    public final boolean method277(int arg0) {
        if (arg0 != 3) {
            return false;
        } else {
            ++field8803;
            if (this.field8820 == null) {
                return true;
            } else {
                return !this.field8820.method1140();
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lha;I)V", line = 253)
    public final void method270(class545 arg0, int arg1) {
        if (arg1 == -6060) {
            ++field8806;
            Object var3 = null;
            class706 var5;
            if (this.field8821 == null && this.field8814) {
                class693 var4 = this.method3627(arg0, 262144, (byte) 72, true);
                var5 = var4 == null ? null : var4.field9692;
            } else {
                var5 = this.field8821;
                this.field8821 = null;
            }
            if (var5 != null) {
                class331.method1923(var5, super.field9495, super.field9490, super.field9489, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)Z", line = 288)
    public final boolean method281(boolean arg0) {
        if (!arg0) {
            this.field8820 = null;
        }
        ++field8797;
        return this.field8814;
    }

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "(I)V", line = 302)
    public static void method3629(int arg0) {
        field8804 = null;
        field8818 = null;
        int var1 = -17 % ((arg0 - 50) / 48);
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)I", line = 315)
    public final int method275(int arg0) {
        if (arg0 != 24263) {
            this.method277(-26);
        }
        ++field8811;
        return this.field8816 & 65535;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IBZILha;ILig;)V", line = 328)
    public final void method365(int arg0, byte arg1, boolean arg2, int arg3, class545 arg4, int arg5, class674 arg6) {
        if (arg6 instanceof class619) {
            class619 var8 = (class619) arg6;
            if (this.field8820 != null && var8.field8820 != null) {
                this.field8820.method1152(var8.field8820, arg5, arg0, arg3, arg2);
            }
        } else if (arg6 instanceof class79) {
            class79 var9 = (class79) arg6;
            if (this.field8820 != null && var9.field1086 != null) {
                this.field8820.method1152(var9.field1086, arg5, arg0, arg3, arg2);
            }
        }
        if (arg1 >= 76) {
            ++field8822;
        }
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(B)Z", line = 358)
    public final boolean method283(byte arg0) {
        ++field8813;
        if (arg0 >= -33) {
            this.field8816 = -61;
        }
        return this.field8820 != null ? this.field8820.method1130() : false;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)Z", line = 373)
    public final boolean method373(byte arg0) {
        ++field8800;
        if (arg0 != -57) {
            this.method3627((class545) null, -68, (byte) 34, false);
        }
        return this.field8812;
    }

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "(I)I", line = 386)
    public final int method282(int arg0) {
        ++field8807;
        if (arg0 != -1) {
            this.method281(false);
        }
        return this.field8820 != null ? this.field8820.method1113() : 0;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZB)V", line = 399)
    public static final void method3630(boolean arg0, byte arg1) {
        ++class509.field7099;
        ++field8793;
        class120 var2 = class292.method1716(class608.field8668, true, class700.field9754);
        class471.method2805(117, var2);
        if (arg1 < -112) {
            for (class14 var3 = (class14) class426.field5894.method1382(27901); var3 != null; var3 = (class14) class426.field5894.method1383(false)) {
                if (!var3.method3064(10343)) {
                    var3 = (class14) class426.field5894.method1382(27901);
                    if (var3 == null) {
                        break;
                    }
                }
                if (var3.field195 == 0) {
                    class197.method1325(var3, (byte) 73, arg0, true);
                }
            }
            if (class240.field3352 != null) {
                class116.method764(class240.field3352, -1176833464);
                class240.field3352 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(Lha;I)Ljl;", line = 441)
    public final class596 method278(class545 arg0, int arg1) {
        ++field8808;
        if (this.field8820 == null) {
            return null;
        } else {
            if (arg1 != 2274) {
                this.method271(-34, (class545) null);
            }
            class723 var3 = arg0.method2087();
            var3.method848(super.field9490, super.field9502, super.field9489);
            class596 var4 = class589.method3502(1, this.field8799, arg1 + -2274);
            if (!class286.field3774) {
                this.field8820.method1168(var3, var4.field8579[0], 0);
            } else {
                this.field8820.method1164(var3, var4.field8579[0], class527.field7375, 0);
            }
            return var4;
        }
    }
}
