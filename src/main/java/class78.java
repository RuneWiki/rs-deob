import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class78 extends class665 implements class721 {

    @OriginalMember(owner = "client!dha", name = "Q", descriptor = "Z")
    private boolean field1080 = false;

    @OriginalMember(owner = "client!dha", name = "cb", descriptor = "Lqea;")
    public class128 field1092;

    @OriginalMember(owner = "client!dha", name = "db", descriptor = "Z")
    private boolean field1093;

    @OriginalMember(owner = "client!dha", name = "Y", descriptor = "[I")
    public static int[] field1088 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!dha", name = "L", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!dha", name = "M", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!dha", name = "N", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!dha", name = "O", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!dha", name = "P", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!dha", name = "R", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!dha", name = "S", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!dha", name = "T", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!dha", name = "U", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!dha", name = "V", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!dha", name = "W", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!dha", name = "X", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!dha", name = "Z", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!dha", name = "ab", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!dha", name = "eb", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!dha", name = "fb", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!dha", name = "gb", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!dha", name = "hb", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!dha", name = "bb", descriptor = "Lria;")
    private class286 field1091;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Z)V", line = 4)
    public static void method640(boolean arg0) {
        if (arg0) {
            field1082 = 88;
        }
        field1088 = null;
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(B)V", line = 14)
    public final void method316(byte arg0) {
        ++field1095;
        if (arg0 != -66) {
            this.field1091 = null;
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)I", line = 27)
    public final int method317(int arg0) {
        ++field1094;
        if (arg0 < 112) {
            this.field1093 = true;
        }
        return this.field1092.field1709;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lha;B)V", line = 39)
    public final void method310(class60 arg0, byte arg1) {
        if (arg1 == -88) {
            this.field1092.method907(12898, arg0);
            ++field1078;
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(ILha;)V", line = 50)
    public final void method318(int arg0, class60 arg1) {
        int var3 = -90 % ((arg0 - 8) / 57);
        this.field1092.method905(5, arg1);
        ++field1081;
    }

    @OriginalMember(owner = "client!dha", name = "h", descriptor = "(B)I", line = 60)
    public final int method315(byte arg0) {
        if (arg0 != 106) {
            return -98;
        } else {
            ++field1089;
            return this.field1092.method898(61);
        }
    }

    @OriginalMember(owner = "client!dha", name = "i", descriptor = "(B)Z", line = 72)
    public final boolean method320(byte arg0) {
        if (arg0 != 84) {
            this.field1080 = false;
        }
        ++field1087;
        return false;
    }

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(Lha;Lsu;IIIIIZIIIII)V", line = 184)
    public class78(class60 arg0, class211 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field1092 = new class128(arg0, arg1, arg10, arg11, super.field8429, arg3, this, arg7, arg12);
        this.field1093 = arg1.field3113 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(IBLha;I)Z", line = 90)
    public final boolean method312(int arg0, byte arg1, class60 arg2, int arg3) {
        if (arg1 >= -44) {
            return false;
        } else {
            ++field1086;
            class473 var5 = this.field1092.method903(arg2, 131072, 113, false, false);
            if (var5 == null) {
                return false;
            } else {
                class738 var6 = arg2.method442();
                var6.method774(super.field9348 + super.field8423, super.field8421, super.field9345 + super.field8428);
                return !class418.field6258 ? var5.method277(arg0, arg3, var6, false, 0) : var5.method283(arg0, arg3, var6, false, 0, class188.field2859);
            }
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lha;Z)V", line = 111)
    public final void method314(class60 arg0, boolean arg1) {
        ++field1076;
        class473 var3 = this.field1092.method903(arg0, 262144, 88, arg1, true);
        if (var3 != null) {
            int var4 = super.field8423 >> 9;
            int var5 = super.field8428 >> 9;
            class738 var6 = arg0.method442();
            var6.method774(super.field8423, super.field8421, super.field8428);
            this.field1092.method906(var5, false, var5, var6, -123, arg0, var4, var3, var4);
        }
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(Lha;B)Lc;", line = 132)
    public final class187 method319(class60 arg0, byte arg1) {
        ++field1079;
        int var3 = 64 / ((-25 - arg1) / 60);
        class473 var4 = this.field1092.method903(arg0, 2048, 105, false, true);
        if (var4 == null) {
            return null;
        } else {
            class738 var5 = arg0.method442();
            var5.method774(super.field9348 + super.field8423, super.field8421, super.field9345 + super.field8428);
            class187 var6 = class650.method3774(123, this.field1093, 1);
            int var7 = super.field8423 >> 9;
            int var8 = super.field8428 >> 9;
            this.field1092.method906(var8, true, var8, var5, -31, arg0, var7, var4, var7);
            if (!class418.field6258) {
                var4.method265(var5, var6.field2851[0], 0);
            } else {
                var4.method235(var5, var6.field2851[0], class188.field2859, 0);
            }
            if (this.field1092.field1690 != null) {
                class624 var9 = this.field1092.field1690.method3603();
                if (class418.field6258) {
                    arg0.method505(var9, class188.field2859);
                } else {
                    arg0.method523(var9);
                }
            }
            this.field1080 = var4.method275() || this.field1092.field1690 != null;
            if (this.field1091 != null) {
                class240.method1604(super.field8428, var4, super.field8421, true, this.field1091, super.field8423);
            } else {
                this.field1091 = class60.method527(var4, super.field8428, super.field8423, super.field8421, -22060);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(I)I", line = 196)
    public final int method327(int arg0) {
        if (arg0 > -116) {
            this.field1093 = true;
        }
        ++field1090;
        return this.field1092.field1696;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lfe;B)V", line = 208)
    public final void method641(class572 arg0, byte arg1) {
        this.field1092.method896(arg0, 6706);
        ++field1075;
        if (arg1 <= 22) {
            this.field1092 = null;
        }
    }

    @OriginalMember(owner = "client!dha", name = "j", descriptor = "(B)I", line = 219)
    public final int method313(byte arg0) {
        if (arg0 != 3) {
            this.method320((byte) 120);
        }
        ++field1085;
        return this.field1092.method899(arg0 + 124);
    }

    @OriginalMember(owner = "client!dha", name = "k", descriptor = "(B)Z", line = 230)
    public final boolean method329(byte arg0) {
        int var2 = 47 % ((-33 - arg0) / 42);
        ++field1083;
        return this.field1080;
    }

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "(B)I", line = 241)
    public final int method309(byte arg0) {
        ++field1077;
        if (arg0 > -16) {
            this.method327(-128);
        }
        return this.field1092.field1697;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(B)Z", line = 252)
    public final boolean method321(byte arg0) {
        if (arg0 >= -125) {
            return true;
        } else {
            ++field1097;
            return this.field1092.method900(120);
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lha;I)Lria;", line = 268)
    public final class286 method325(class60 arg0, int arg1) {
        ++field1096;
        return arg1 != 92160000 ? null : this.field1091;
    }
}
