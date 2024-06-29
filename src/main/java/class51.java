import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class51 extends class494 implements class258 {

    @OriginalMember(owner = "client!dm", name = "ub", descriptor = "S")
    private short field1083;

    @OriginalMember(owner = "client!dm", name = "db", descriptor = "B")
    private byte field1066;

    @OriginalMember(owner = "client!dm", name = "mb", descriptor = "B")
    private byte field1075;

    @OriginalMember(owner = "client!dm", name = "cb", descriptor = "Z")
    private boolean field1065;

    @OriginalMember(owner = "client!dm", name = "fb", descriptor = "Z")
    private boolean field1068;

    @OriginalMember(owner = "client!dm", name = "hb", descriptor = "Z")
    private boolean field1070;

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "Z")
    private boolean field1054;

    @OriginalMember(owner = "client!dm", name = "qb", descriptor = "Lka;")
    public class472 field1079;

    @OriginalMember(owner = "client!dm", name = "yb", descriptor = "Lr;")
    private class184 field1087;

    @OriginalMember(owner = "client!dm", name = "Y", descriptor = "[Lgw;")
    public static class172[] field1061 = new class172[14];

    @OriginalMember(owner = "client!dm", name = "lb", descriptor = "I")
    public static int field1074 = -60;

    @OriginalMember(owner = "client!dm", name = "S", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!dm", name = "T", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!dm", name = "U", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!dm", name = "V", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!dm", name = "W", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!dm", name = "X", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!dm", name = "Z", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!dm", name = "ab", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!dm", name = "bb", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!dm", name = "eb", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!dm", name = "gb", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!dm", name = "ib", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!dm", name = "jb", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!dm", name = "kb", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!dm", name = "ob", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!dm", name = "pb", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!dm", name = "rb", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!dm", name = "sb", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!dm", name = "tb", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!dm", name = "vb", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!dm", name = "wb", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!dm", name = "xb", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!dm", name = "zb", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!dm", name = "nb", descriptor = "Lhw;")
    private class132 field1076;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V")
    public final void method582(int arg0) {
        if (arg0 == -12031) {
            if (this.field1079 != null) {
                this.field1079.method507();
            }
            ++field1073;
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(Z)I")
    public final int method38(boolean arg0) {
        if (!arg0) {
            return 109;
        } else {
            ++field1057;
            return this.field1079 == null ? 0 : this.field1079.method486();
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILha;)V")
    public final void method583(int arg0, class59 arg1) {
        ++field1059;
        Object var3 = null;
        class184 var5;
        if (this.field1087 == null && this.field1054) {
            class351 var4 = this.method590(0, arg1, 262144, true);
            var5 = var4 != null ? var4.field4889 : null;
        } else {
            var5 = this.field1087;
            this.field1087 = null;
        }
        if (arg0 != 836) {
            this.method588(-125);
        }
        if (var5 != null) {
            class491.method2900(var5, super.field5921, super.field5922, super.field5933, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lha;Liv;IIIIIZIIIIIIZ)V")
    public class51(class59 arg0, class99 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field1730 == -2, class397.method2487(arg13, arg12, 0));
        this.field1083 = (short) arg1.field1776;
        this.field1066 = (byte) arg13;
        this.field1075 = (byte) arg12;
        this.field1065 = arg1.field1709 != 0 && !arg7;
        this.field1068 = arg7;
        this.field1070 = arg14;
        super.field5921 = (byte) arg3;
        this.field1054 = arg0.method263() && arg1.field1729 && !this.field1068 && class693.field9368.field4435.method421(-32350) != 0;
        int var16 = 2048;
        if (this.field1070) {
            var16 |= 65536;
        }
        class351 var17 = this.method590(0, arg0, var16, this.field1054);
        if (var17 != null) {
            this.field1079 = var17.field4890;
            this.field1087 = var17.field4889;
            if (this.field1070) {
                this.field1079 = this.field1079.method504((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "(I)I")
    public final int method37(int arg0) {
        if (arg0 != -25675) {
            method592((String) null, (byte) -68);
        }
        ++field1078;
        return this.field1079 != null ? this.field1079.method513() : 0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Z")
    public final boolean method584(int arg0) {
        if (arg0 != -18443) {
            return false;
        } else {
            ++field1088;
            return this.field1054;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method42(class59 arg0, int arg1, int arg2, int arg3) {
        ++field1056;
        if (arg3 != 0) {
            return false;
        } else {
            class472 var5 = this.method585(-1, arg0, 131072);
            if (var5 != null) {
                class661 var6 = arg0.method322();
                var6.method744(super.field5922, super.field5927, super.field5933);
                return class458.field6459 ? var5.method492(arg2, arg1, var6, false, 0, class58.field1146) : var5.method503(arg2, arg1, var6, false, 0);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILha;I)Lka;")
    private final class472 method585(int arg0, class59 arg1, int arg2) {
        if (arg0 != -1) {
            this.method44(false);
        }
        ++field1055;
        if (this.field1079 != null && ~arg1.method343(this.field1079.method527(), arg2) == -1) {
            return this.field1079;
        } else {
            class351 var4 = this.method590(0, arg1, arg2, false);
            return var4 == null ? null : var4.field4890;
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(Lha;I)V")
    public final void method31(class59 arg0, int arg1) {
        ++field1084;
        if (arg1 > -125) {
            this.field1083 = -95;
        }
    }

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "(I)V")
    public static void method586(int arg0) {
        field1061 = null;
        int var1 = 93 / ((arg0 - -62) / 35);
    }

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "(I)I")
    public final int method587(int arg0) {
        if (arg0 != 15) {
            this.field1066 = 66;
        }
        ++field1060;
        return this.field1079 != null ? this.field1079.method505() / 4 : 15;
    }

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "(I)Z")
    public final boolean method35(int arg0) {
        ++field1086;
        return arg0 > -65 ? true : this.field1070;
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)I")
    public final int method588(int arg0) {
        if (arg0 != -32228) {
            this.field1079 = null;
        }
        ++field1081;
        return this.field1066;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lha;IZLga;IBI)V")
    public final void method33(class59 arg0, int arg1, boolean arg2, class404 arg3, int arg4, byte arg5, int arg6) {
        ++field1085;
        if (arg3 instanceof class708) {
            class708 var8 = (class708) arg3;
            if (this.field1079 != null && var8.field9598 != null) {
                this.field1079.method490(var8.field9598, arg6, arg1, arg4, arg2);
            }
        } else if (arg3 instanceof class51) {
            class51 var9 = (class51) arg3;
            if (this.field1079 != null && var9.field1079 != null) {
                this.field1079.method490(var9.field1079, arg6, arg1, arg4, arg2);
            }
        }
        if (arg5 >= -106) {
            this.method44(false);
        }
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)I")
    public final int method589(int arg0) {
        if (arg0 > -62) {
            return 126;
        } else {
            ++field1063;
            return this.field1083 & 65535;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)V")
    public final void method44(boolean arg0) {
        ++field1071;
        if (!arg0) {
            this.method584(120);
        }
        this.field1070 = false;
        if (this.field1079 != null) {
            this.field1079.method484(-65537 & this.field1079.method527());
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(Lha;I)Lhw;")
    public final class132 method40(class59 arg0, int arg1) {
        if (this.field1076 == null) {
            this.field1076 = class689.method3846(super.field5922, this.method585(arg1 + -8, arg0, 0), super.field5933, super.field5927, 2);
        }
        if (arg1 != 7) {
            return null;
        } else {
            ++field1064;
            return this.field1076;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILha;IZ)Lak;")
    private final class351 method590(int arg0, class59 arg1, int arg2, boolean arg3) {
        ++field1058;
        class99 var5 = class76.field1366.method1680(arg0, 65535 & this.field1083);
        class281 var6;
        class281 var7;
        if (this.field1068) {
            var6 = class344.field4822[super.field5921];
            var7 = class465.field6517[0];
        } else {
            var6 = class465.field6517[super.field5921];
            if (~super.field5921 <= -4) {
                var7 = null;
            } else {
                var7 = class465.field6517[super.field5921 - -1];
            }
        }
        return var5.method921(arg1, var7, ~this.field1075 != -12 ? this.field1075 : 10, arg2, super.field5922, arg3, var6, super.field5927, super.field5933, this.field1075 != 11 ? this.field1066 : this.field1066 + 4, 128);
    }

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "(I)Z")
    public final boolean method45(int arg0) {
        if (arg0 > -12) {
            return false;
        } else {
            ++field1080;
            if (this.field1079 != null) {
                return !this.field1079.method522();
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)Z")
    public final boolean method49(byte arg0) {
        if (arg0 != 122) {
            this.method40((class59) null, -44);
        }
        ++field1072;
        return this.field1079 != null ? this.field1079.method488() : false;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lha;I)V")
    public final void method591(class59 arg0, int arg1) {
        if (arg1 != -14218) {
            this.field1070 = false;
        }
        ++field1067;
        Object var3 = null;
        class184 var5;
        if (this.field1087 == null && this.field1054) {
            class351 var4 = this.method590(arg1 + 14218, arg0, 262144, true);
            var5 = var4 != null ? var4.field4889 : null;
        } else {
            var5 = this.field1087;
            this.field1087 = null;
        }
        if (var5 != null) {
            class166.method1249(var5, super.field5921, super.field5922, super.field5933, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method592(String arg0, byte arg1) {
        ++field1062;
        int var2 = -51 / ((arg1 - 3) / 42);
        int var3 = arg0.length();
        int var4 = 0;
        for (int var5 = 0; var3 > var5; ++var5) {
            var4 = arg0.charAt(var5) + (var4 << 5) + -var4;
        }
        return var4;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BI)I")
    public static final int method593(byte arg0, int arg1) {
        ++field1069;
        return arg0 < 122 ? -49 : arg1 >>> 8;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)I")
    public final int method594(int arg0) {
        int var2 = -116 / ((-91 - arg0) / 35);
        ++field1077;
        return this.field1075;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(ILha;)Ljda;")
    public final class228 method41(int arg0, class59 arg1) {
        ++field1082;
        if (this.field1079 == null) {
            return null;
        } else {
            class661 var3 = arg1.method322();
            var3.method744(super.field5922, super.field5927, super.field5933);
            class228 var4 = class345.method2171(arg0, this.field1065, false);
            if (!class458.field6459) {
                this.field1079.method521(var3, var4.field3313[0], 0);
            } else {
                this.field1079.method497(var3, var4.field3313[0], class58.field1146, 0);
            }
            return var4;
        }
    }
}
