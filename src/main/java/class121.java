import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class121 extends class424 implements class258 {

    @OriginalMember(owner = "client!co", name = "bb", descriptor = "Z")
    private boolean field2070;

    @OriginalMember(owner = "client!co", name = "qb", descriptor = "B")
    private byte field2085;

    @OriginalMember(owner = "client!co", name = "ab", descriptor = "S")
    private short field2069;

    @OriginalMember(owner = "client!co", name = "jb", descriptor = "Z")
    private boolean field2078;

    @OriginalMember(owner = "client!co", name = "A", descriptor = "B")
    private byte field2058;

    @OriginalMember(owner = "client!co", name = "ib", descriptor = "Z")
    private boolean field2077;

    @OriginalMember(owner = "client!co", name = "V", descriptor = "Lka;")
    private class472 field2064;

    @OriginalMember(owner = "client!co", name = "Z", descriptor = "Lr;")
    private class184 field2068;

    @OriginalMember(owner = "client!co", name = "W", descriptor = "Luh;")
    public static class168 field2065 = new class168();

    @OriginalMember(owner = "client!co", name = "fb", descriptor = "Lej;")
    public static class124 field2074 = new class124(62, 3);

    @OriginalMember(owner = "client!co", name = "O", descriptor = "D")
    public static double field2060;

    @OriginalMember(owner = "client!co", name = "H", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!co", name = "S", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!co", name = "T", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!co", name = "U", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!co", name = "X", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!co", name = "cb", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!co", name = "db", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!co", name = "eb", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!co", name = "gb", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!co", name = "hb", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!co", name = "kb", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!co", name = "lb", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!co", name = "mb", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!co", name = "nb", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!co", name = "ob", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!co", name = "pb", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!co", name = "rb", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!co", name = "sb", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!co", name = "Y", descriptor = "Lhw;")
    private class132 field2067;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IILha;)Lka;", line = 4)
    private final class472 method1046(int arg0, int arg1, class59 arg2) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field2066;
            if (this.field2064 != null && arg2.method343(this.field2064.method527(), arg0) == 0) {
                return this.field2064;
            } else {
                class351 var4 = this.method1049((byte) -51, false, arg0, arg2);
                return var4 == null ? null : var4.field4890;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(B)I", line = 25)
    public static final int method1047(byte arg0) {
        ++field2075;
        if (class311.field4321) {
            return 6;
        } else if (class693.field9372 == null) {
            return 0;
        } else if (arg0 >= -11) {
            return -42;
        } else {
            int var1 = class693.field9372.field4505;
            if (class442.method2660(80, var1)) {
                return 1;
            } else if (class474.method2790(-12081, var1)) {
                return 2;
            } else if (class339.method2143(8806, var1)) {
                return 3;
            } else {
                return class79.method729(var1, (byte) 126) ? 4 : 5;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(ILha;)Ljda;", line = 61)
    public final class228 method41(int arg0, class59 arg1) {
        ++field2062;
        if (this.field2064 == null) {
            return null;
        } else {
            class661 var3 = arg1.method322();
            var3.method744(super.field5922 - -super.field6120, super.field5927, super.field5933 - -super.field6108);
            class228 var4 = class345.method2171(arg0, this.field2070, false);
            if (class458.field6459) {
                this.field2064.method497(var3, var4.field3313[0], class58.field1146, 0);
            } else {
                this.field2064.method521(var3, var4.field3313[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V", line = 85)
    public final void method582(int arg0) {
        if (arg0 != -12031) {
            this.field2085 = -104;
        }
        ++field2087;
        if (this.field2064 != null) {
            this.field2064.method507();
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(B)Z", line = 98)
    public final boolean method49(byte arg0) {
        if (arg0 != 122) {
            this.field2077 = false;
        }
        ++field2071;
        return this.field2064 != null ? this.field2064.method488() : false;
    }

    @OriginalMember(owner = "client!co", name = "e", descriptor = "(I)I", line = 114)
    public final int method589(int arg0) {
        ++field2083;
        if (arg0 >= -62) {
            this.method594(-120);
        }
        return 65535 & this.field2069;
    }

    @OriginalMember(owner = "client!co", name = "p", descriptor = "(I)V", line = 128)
    public static void method1048(int arg0) {
        field2074 = null;
        if (arg0 != 4) {
            method1048(-26);
        }
        field2065 = null;
    }

    @OriginalMember(owner = "client!co", name = "i", descriptor = "(I)I", line = 139)
    public final int method37(int arg0) {
        ++field2063;
        if (arg0 != -25675) {
            this.field2064 = null;
        }
        return this.field2064 != null ? this.field2064.method513() : 0;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lha;III)Z", line = 154)
    public final boolean method42(class59 arg0, int arg1, int arg2, int arg3) {
        ++field2059;
        class472 var5 = this.method1046(131072, arg3, arg0);
        if (var5 != null) {
            class661 var6 = arg0.method322();
            var6.method744(super.field5922, super.field5927, super.field5933);
            return class458.field6459 ? var5.method492(arg2, arg1, var6, false, 0, class58.field1146) : var5.method503(arg2, arg1, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!co", name = "g", descriptor = "(I)Z", line = 173)
    public final boolean method45(int arg0) {
        ++field2076;
        if (arg0 > -12) {
            return false;
        } else if (this.field2064 != null) {
            return !this.field2064.method522();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)I", line = 189)
    public final int method594(int arg0) {
        ++field2081;
        int var2 = -57 % ((-91 - arg0) / 35);
        return this.field2085;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lha;I)V", line = 200)
    public final void method591(class59 arg0, int arg1) {
        if (arg1 != -14218) {
            this.field2067 = null;
        }
        ++field2084;
        Object var3 = null;
        class184 var5;
        if (this.field2068 == null && this.field2077) {
            class351 var4 = this.method1049((byte) -51, true, 262144, arg0);
            var5 = var4 == null ? null : var4.field4889;
        } else {
            var5 = this.field2068;
            this.field2068 = null;
        }
        if (var5 != null) {
            class166.method1249(var5, super.field5921, super.field5922, super.field5933, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(Lha;I)V", line = 228)
    public final void method31(class59 arg0, int arg1) {
        if (arg1 < -125) {
            ++field2073;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILha;)V", line = 243)
    public final void method583(int arg0, class59 arg1) {
        ++field2061;
        Object var3 = null;
        class184 var5;
        if (this.field2068 == null && this.field2077) {
            class351 var4 = this.method1049((byte) -51, true, 262144, arg1);
            var5 = var4 == null ? null : var4.field4889;
        } else {
            var5 = this.field2068;
            this.field2068 = null;
        }
        if (var5 != null) {
            class491.method2900(var5, super.field5921, super.field5922, super.field5933, (boolean[]) null);
        }
        if (arg0 != 836) {
            this.method42((class59) null, -123, 0, -64);
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(Lha;I)Lhw;", line = 271)
    public final class132 method40(class59 arg0, int arg1) {
        if (arg1 != 7) {
            this.method40((class59) null, -71);
        }
        if (this.field2067 == null) {
            this.field2067 = class689.method3846(super.field5922, this.method1046(0, 0, arg0), super.field5933, super.field5927, 2);
        }
        ++field2080;
        return this.field2067;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BZILha;)Lak;", line = 289)
    private final class351 method1049(byte arg0, boolean arg1, int arg2, class59 arg3) {
        if (arg0 != -51) {
            field2065 = null;
        }
        ++field2082;
        class99 var5 = class76.field1366.method1680(0, 65535 & this.field2069);
        class281 var6;
        class281 var7;
        if (!this.field2078) {
            var6 = class465.field6517[super.field5921];
            if (~super.field5921 > -4) {
                var7 = class465.field6517[super.field5921 - -1];
            } else {
                var7 = null;
            }
        } else {
            var6 = class344.field4822[super.field5921];
            var7 = class465.field6517[0];
        }
        return var5.method921(arg3, var7, this.field2085, arg2, super.field5922, arg1, var6, super.field5927, super.field5933, this.field2058, 128);
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(Z)I", line = 323)
    public final int method38(boolean arg0) {
        if (!arg0) {
            this.field2078 = false;
        }
        ++field2079;
        return this.field2064 != null ? this.field2064.method486() : 0;
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lha;Liv;IIIIIZIIII)V", line = 335)
    public class121(class59 arg0, class99 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field2070 = arg1.field1709 != 0 && !arg7;
        this.field2085 = (byte) arg10;
        this.field2069 = (short) arg1.field1776;
        super.field5933 = arg6;
        this.field2078 = arg7;
        super.field5922 = arg4;
        this.field2058 = (byte) arg11;
        this.field2077 = arg0.method263() && arg1.field1729 && !this.field2078 && ~class693.field9368.field4435.method421(-32350) != -1;
        class351 var13 = this.method1049((byte) -51, this.field2077, 2048, arg0);
        if (var13 != null) {
            this.field2064 = var13.field4890;
            this.field2068 = var13.field4889;
        }
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(I)I", line = 361)
    public final int method588(int arg0) {
        if (arg0 != -32228) {
            this.field2070 = true;
        }
        ++field2086;
        return this.field2058;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)Z", line = 372)
    public final boolean method584(int arg0) {
        ++field2072;
        if (arg0 != -18443) {
            this.field2067 = null;
        }
        return this.field2077;
    }
}
