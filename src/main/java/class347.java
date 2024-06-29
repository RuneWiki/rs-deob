import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class347 extends class361 implements class351 {

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "Z")
    private boolean field5138;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "S")
    private short field5137;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "Z")
    private boolean field5141;

    @OriginalMember(owner = "client!ql", name = "W", descriptor = "B")
    private byte field5155;

    @OriginalMember(owner = "client!ql", name = "cb", descriptor = "Z")
    private boolean field5161;

    @OriginalMember(owner = "client!ql", name = "Z", descriptor = "B")
    private byte field5158;

    @OriginalMember(owner = "client!ql", name = "U", descriptor = "B")
    private byte field5153;

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "Z")
    private boolean field5139;

    @OriginalMember(owner = "client!ql", name = "R", descriptor = "Loc;")
    private class93 field5150;

    @OriginalMember(owner = "client!ql", name = "Y", descriptor = "Lqc;")
    public class95 field5157;

    @OriginalMember(owner = "client!ql", name = "S", descriptor = "[I")
    public static int[] field5151 = new int[8];

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!ql", name = "T", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!ql", name = "V", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!ql", name = "X", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!ql", name = "ab", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!ql", name = "bb", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!ql", name = "db", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!ql", name = "eb", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!ql", name = "fb", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!ql", name = "gb", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!ql", name = "hb", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!ql", name = "ib", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "Lqj;")
    public static class238 field5148;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V")
    public final void method163(int arg0) {
        this.field5138 = false;
        if (arg0 != 0) {
            this.method158((byte) -14);
        }
        ++field5147;
        if (this.field5157 != null) {
            this.field5157.method589(-32769 & this.field5157.method594());
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lnr;Z)V")
    public final void method156(class437 arg0, boolean arg1) {
        if (arg1) {
            this.method154(35, (class437) null);
        }
        ++field5166;
        Object var3 = null;
        class93 var5;
        if (this.field5150 == null && this.field5139) {
            class284 var4 = this.method2310(32653, arg0, true, 131072);
            var5 = var4 != null ? var4.field4143 : null;
        } else {
            var5 = this.field5150;
            this.field5150 = null;
        }
        if (var5 != null) {
            class132.method897(var5, this.field5153, super.field5284, super.field5298, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "(I)V")
    public static void method2309(int arg0) {
        field5151 = null;
        if (arg0 != 0) {
            method2309(38);
        }
        field5148 = null;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Lnr;Z)Lg;")
    public final class433 method145(class437 arg0, boolean arg1) {
        if (arg1) {
            this.field5155 = -11;
        }
        ++field5160;
        if (this.field5157 == null) {
            return null;
        } else {
            class116 var3 = arg0.method2026();
            var3.method809(super.field5284, super.field5297, super.field5298);
            class433 var4 = null;
            if (this.field5161) {
                var4 = class436.method2758(1, 12300);
            }
            this.field5157.method602(var3, var4 != null ? var4.field6381[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(B)V")
    public final void method158(byte arg0) {
        if (this.field5157 != null) {
            this.field5157.method587();
        }
        if (arg0 == 6) {
            ++field5163;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLnr;IIZLcb;I)V")
    public final void method153(byte arg0, class437 arg1, int arg2, int arg3, boolean arg4, class387 arg5, int arg6) {
        if (!(arg5 instanceof class273)) {
            if (arg5 instanceof class347) {
                class347 var8 = (class347) arg5;
                if (this.field5157 != null && var8.field5157 != null) {
                    this.field5157.method616(var8.field5157, arg3, arg6, arg2, arg4);
                }
            }
        } else {
            class273 var9 = (class273) arg5;
            if (this.field5157 != null && var9.field3997 != null) {
                this.field5157.method616(var9.field3997, arg3, arg6, arg2, arg4);
            }
        }
        ++field5167;
        if (arg0 >= -116) {
            this.field5153 = 74;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILnr;ZI)Lbc;")
    private final class284 method2310(int arg0, class437 arg1, boolean arg2, int arg3) {
        ++field5144;
        if (arg0 != 32653) {
            return null;
        } else {
            class404 var5 = class165.method1020(65535 & this.field5137, -31);
            class337 var6;
            class337 var7;
            if (this.field5141) {
                var6 = class198.field2829[0];
                var7 = class425.field6324[this.field5153];
            } else {
                var7 = class198.field2829[this.field5153];
                if (~this.field5153 > -4) {
                    var6 = class198.field2829[this.field5153 + 1];
                } else {
                    var6 = null;
                }
            }
            return var5.method2622(this.field5158 == 11 ? 10 : this.field5158, arg1, var7, this.field5158 == 11 ? this.field5155 + 4 : this.field5155, super.field5298, super.field5284, super.field5297, arg3, var6, 108, arg2);
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)I")
    public final int method148(byte arg0) {
        if (arg0 != -68) {
            this.field5139 = false;
        }
        ++field5159;
        return this.field5155;
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(B)Z")
    public final boolean method151(byte arg0) {
        ++field5145;
        return arg0 != -115 ? true : this.field5138;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)I")
    public static int method2311(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)I")
    public final int method150(byte arg0) {
        if (arg0 > -110) {
            this.method194(113);
        }
        ++field5154;
        return this.field5137 & 65535;
    }

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "(I)V")
    public static final void method2312(int arg0) {
        if (arg0 != -23144) {
            method2309(113);
        }
        if (~class2.field22 != -4) {
            class163.field2123 = -1;
        }
        ++field5165;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)I")
    public final int method160(int arg0) {
        if (arg0 != -22056) {
            return -26;
        } else {
            ++field5143;
            return this.field5158;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lnr;I)V")
    public final void method161(class437 arg0, int arg1) {
        if (arg1 == 0) {
            ++field5152;
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lnr;Lta;IIIIIZIIIIIIZ)V")
    public class347(class437 arg0, class404 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field6049 == 1, class57.method386(arg12, (byte) -75, arg13));
        this.field5138 = arg14;
        this.field5137 = (short) arg1.field6059;
        this.field5141 = arg7;
        this.field5155 = (byte) arg13;
        this.field5161 = arg1.field6009 != 0 && !arg7;
        this.field5158 = (byte) arg12;
        this.field5153 = (byte) arg3;
        this.field5139 = arg0.method2086() && arg1.field6081 && !this.field5141 && ~class176.field2300 != -1;
        int var16 = 1024;
        if (this.field5138) {
            var16 |= 32768;
        }
        class284 var17 = this.method2310(32653, arg0, this.field5139, var16);
        if (var17 != null) {
            this.field5150 = var17.field4143;
            this.field5157 = var17.field4144;
            if (this.field5138) {
                this.field5157 = this.field5157.method628((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lnr;BI)Lqc;")
    private final class95 method2313(class437 arg0, byte arg1, int arg2) {
        if (arg1 != -37) {
            this.field5157 = null;
        }
        ++field5140;
        if (this.field5157 != null && arg0.method2132(this.field5157.method594(), arg2) == 0) {
            return this.field5157;
        } else {
            class284 var4 = this.method2310(32653, arg0, false, arg2);
            return var4 == null ? null : var4.field4144;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILnr;II)Z")
    public final boolean method159(int arg0, class437 arg1, int arg2, int arg3) {
        ++field5164;
        class95 var5 = this.method2313(arg1, (byte) -37, 65536);
        if (var5 != null) {
            class116 var6 = arg1.method2026();
            var6.method809(super.field5284, super.field5297, super.field5298);
            return var5.method619(arg2, arg0, var6, false);
        } else {
            if (arg3 < 12) {
                this.method159(96, (class437) null, 82, -68);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "(I)I")
    public final int method194(int arg0) {
        ++field5142;
        if (arg0 > -7) {
            return -10;
        } else {
            return this.field5157 == null ? 0 : this.field5157.method597();
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILnr;)V")
    public final void method154(int arg0, class437 arg1) {
        if (arg0 != 25510) {
            this.method148((byte) 48);
        }
        ++field5156;
        Object var3 = null;
        class93 var5;
        if (this.field5150 == null && this.field5139) {
            class284 var4 = this.method2310(32653, arg1, true, 131072);
            var5 = var4 == null ? null : var4.field4143;
        } else {
            var5 = this.field5150;
            this.field5150 = null;
        }
        if (var5 != null) {
            class8.method61(var5, this.field5153, super.field5284, super.field5298, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "(B)I")
    public final int method2314(byte arg0) {
        if (arg0 < 89) {
            this.field5150 = null;
        }
        ++field5162;
        return this.field5157 != null ? this.field5157.method600() / 4 : 15;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)Z")
    public final boolean method146(byte arg0) {
        if (arg0 <= 102) {
            this.field5141 = false;
        }
        ++field5149;
        return this.field5139;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BILnr;)Lqc;")
    public final class95 method147(byte arg0, int arg1, class437 arg2) {
        int var4 = -35 / ((-32 - arg0) / 61);
        ++field5146;
        return this.method2313(arg2, (byte) -37, arg1);
    }
}
