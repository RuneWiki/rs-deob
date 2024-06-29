import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class209 extends class427 implements class226 {

    @OriginalMember(owner = "client!be", name = "ob", descriptor = "S")
    private short field3063;

    @OriginalMember(owner = "client!be", name = "ib", descriptor = "Z")
    private boolean field3057;

    @OriginalMember(owner = "client!be", name = "kb", descriptor = "B")
    private byte field3059;

    @OriginalMember(owner = "client!be", name = "fb", descriptor = "B")
    private byte field3054;

    @OriginalMember(owner = "client!be", name = "rb", descriptor = "Z")
    private boolean field3066;

    @OriginalMember(owner = "client!be", name = "V", descriptor = "Z")
    private boolean field3044;

    @OriginalMember(owner = "client!be", name = "sb", descriptor = "Lka;")
    private class233 field3067;

    @OriginalMember(owner = "client!be", name = "mb", descriptor = "Lr;")
    private class115 field3061;

    @OriginalMember(owner = "client!be", name = "cb", descriptor = "I")
    public static int field3051 = -1;

    @OriginalMember(owner = "client!be", name = "hb", descriptor = "Lcp;")
    public static class271 field3056 = new class271();

    @OriginalMember(owner = "client!be", name = "yb", descriptor = "Z")
    public static boolean field3073 = true;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!be", name = "U", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!be", name = "W", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!be", name = "X", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!be", name = "ab", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!be", name = "bb", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!be", name = "db", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!be", name = "eb", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!be", name = "gb", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!be", name = "jb", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!be", name = "lb", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!be", name = "nb", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!be", name = "pb", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!be", name = "qb", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!be", name = "tb", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!be", name = "vb", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!be", name = "wb", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!be", name = "xb", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!be", name = "zb", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!be", name = "Ab", descriptor = "J")
    public static long field3075;

    @OriginalMember(owner = "client!be", name = "ub", descriptor = "Lmg;")
    private class248 field3069;

    @OriginalMember(owner = "client!be", name = "Bb", descriptor = "Z")
    public static boolean field3076;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "(I)V")
    public static void method1447(int arg0) {
        if (arg0 == 19678) {
            field3056 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZIBII)V")
    public static final void method1448(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6) {
        class98.field1420 = arg3;
        class427.field5930 = arg0;
        if (arg4 == -68) {
            ++field3041;
            class20.field197 = arg5;
            class337.field4787 = arg1;
            class180.field2752 = arg6;
            if (arg2 && class180.field2752 >= 100) {
                class286.field4204 = class427.field5930 * 512 - -256;
                class733.field10199 = class337.field4787 * 512 - -256;
                class243.field3482 = class577.method3399(class286.field4204, class733.field10199, -8724, class403.field5560) + -class98.field1420;
            }
            class783.field10725 = 2;
            class401.field5533 = -1;
            class743.field10323 = -1;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1449(String arg0, byte arg1) {
        ++field3047;
        class121.field2061 = arg0;
        if (class343.field4881 != null) {
            try {
                String var2 = class343.field4881.getParameter("cookieprefix");
                String var3 = class343.field4881.getParameter("cookiehost");
                if (arg1 < -96) {
                    String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
                    String var5;
                    if (arg0.length() != 0) {
                        var5 = var4 + "; Expires=" + class355.method2144((byte) -57, 94608000000L + class337.method2062(false)) + "; Max-Age=" + 94608000L;
                    } else {
                        var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    class154.method1205(-38, "document.cookie=\"" + var5 + "\"", class343.field4881);
                }
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)I")
    public final int method1165(byte arg0) {
        if (arg0 <= 89) {
            return -32;
        } else {
            ++field3074;
            return this.field3063 & 65535;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(BLha;)Lmg;")
    public final class248 method205(byte arg0, class475 arg1) {
        if (this.field3069 == null) {
            this.field3069 = class229.method1563(super.field10350, super.field10358, (byte) -99, this.method1451(arg0 ^ 44, arg1, 0), super.field10347);
        }
        if (arg0 != 45) {
            this.method1170(6);
        }
        ++field3064;
        return this.field3069;
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)I")
    public final int method1167(int arg0) {
        ++field3045;
        if (arg0 < 75) {
            method1449((String) null, (byte) 118);
        }
        return this.field3067 == null ? 0 : this.field3067.method534();
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V")
    public final void method1172(byte arg0) {
        if (this.field3067 != null) {
            this.field3067.method583();
        }
        ++field3060;
        if (arg0 <= 72) {
            this.method1170(52);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILha;BZ)Liu;")
    private final class529 method1450(int arg0, class475 arg1, byte arg2, boolean arg3) {
        ++field3050;
        if (arg2 != 6) {
            return null;
        } else {
            class416 var5 = class312.field4418.method369((byte) 124, 65535 & this.field3063);
            class419 var6;
            class419 var7;
            if (this.field3057) {
                var6 = class454.field6207[super.field10349];
                var7 = class495.field6799[0];
            } else {
                var6 = class495.field6799[super.field10349];
                if (~super.field10349 <= -4) {
                    var7 = null;
                } else {
                    var7 = class495.field6799[super.field10349 + 1];
                }
            }
            return var5.method2447(-106, this.field3059, this.field3054, super.field10350, arg0, arg3, super.field10358, var7, (class685) null, super.field10347, arg1, var6);
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(ILha;)V")
    public final void method1169(int arg0, class475 arg1) {
        ++field3042;
        Object var3 = null;
        class115 var5;
        if (this.field3061 == null && this.field3044) {
            class529 var4 = this.method1450(262144, arg1, (byte) 6, true);
            var5 = var4 != null ? var4.field7377 : null;
        } else {
            var5 = this.field3061;
            this.field3061 = null;
        }
        if (arg0 == -10526) {
            if (var5 != null) {
                class632.method3610(var5, super.field10349, super.field10347, super.field10350, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(B)I")
    public final int method1174(byte arg0) {
        ++field3065;
        int var2 = 92 % ((-63 - arg0) / 47);
        return this.field3059;
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(B)Z")
    public final boolean method1175(byte arg0) {
        ++field3071;
        if (arg0 < 38) {
            field3051 = 37;
        }
        return this.field3067 != null ? this.field3067.method558() : false;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILha;)V")
    public final void method1163(int arg0, class475 arg1) {
        if (arg0 == 18030) {
            ++field3070;
            Object var3 = null;
            class115 var5;
            if (this.field3061 == null && this.field3044) {
                class529 var4 = this.method1450(262144, arg1, (byte) 6, true);
                var5 = var4 == null ? null : var4.field7377;
            } else {
                var5 = this.field3061;
                this.field3061 = null;
            }
            if (var5 != null) {
                class460.method2686(var5, super.field10349, super.field10347, super.field10350, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)I")
    public final int method1173(boolean arg0) {
        ++field3052;
        if (!arg0) {
            return 19;
        } else {
            return this.field3067 != null ? this.field3067.method544() : 0;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lha;Lsea;IIIIIZIIII)V")
    public class209(class475 arg0, class416 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field3063 = (short) arg1.field5746;
        this.field3057 = arg7;
        this.field3059 = (byte) arg11;
        super.field10347 = arg4;
        super.field10350 = arg6;
        this.field3054 = (byte) arg10;
        this.field3066 = arg1.field5754 != 0 && !arg7;
        this.field3044 = arg0.method500() && arg1.field5770 && !this.field3057 && class420.field5820.field9457.method3741(17539) != 0;
        class529 var13 = this.method1450(2048, arg0, (byte) 6, this.field3044);
        if (var13 != null) {
            this.field3067 = var13.field7375;
            this.field3061 = var13.field7377;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lha;I)Luh;")
    public final class162 method204(class475 arg0, int arg1) {
        ++field3046;
        if (this.field3067 == null) {
            return null;
        } else {
            if (arg1 != -1) {
                this.method1166(70);
            }
            class765 var3 = arg0.method457();
            var3.method1568(super.field5923 + super.field10347, super.field10358, super.field5927 + super.field10350);
            class162 var4 = class527.method3085(1, this.field3066, 0);
            if (class765.field10581) {
                this.field3067.method546(var3, var4.field2500[0], class349.field4956, 0);
            } else {
                this.field3067.method575(var3, var4.field2500[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)Z")
    public final boolean method1170(int arg0) {
        ++field3058;
        if (arg0 != 16383) {
            return false;
        } else if (this.field3067 == null) {
            return true;
        } else {
            return !this.field3067.method587();
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)I")
    public final int method1166(int arg0) {
        ++field3043;
        int var2 = -45 % ((arg0 - 14) / 62);
        return this.field3054;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BIILha;)Z")
    public final boolean method198(byte arg0, int arg1, int arg2, class475 arg3) {
        ++field3048;
        class233 var5 = this.method1451(1, arg3, 131072);
        if (var5 != null) {
            class765 var6 = arg3.method457();
            var6.method1568(super.field10347, super.field10358, super.field10350);
            return !class765.field10581 ? var5.method589(arg1, arg2, var6, false, 0) : var5.method584(arg1, arg2, var6, false, 0, class349.field4956);
        } else {
            int var7 = -36 % ((arg0 - 51) / 51);
            return false;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Z")
    public final boolean method1164(byte arg0) {
        ++field3062;
        return arg0 != 4 ? true : this.field3044;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(ILha;)V")
    public final void method192(int arg0, class475 arg1) {
        ++field3049;
        if (arg0 < 2) {
            this.method1164((byte) 22);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILha;I)Lka;")
    private final class233 method1451(int arg0, class475 arg1, int arg2) {
        ++field3053;
        if (this.field3067 != null && ~arg1.method497(this.field3067.method591(), arg2) == -1) {
            return this.field3067;
        } else {
            if (arg0 != 1) {
                this.method1451(23, (class475) null, 113);
            }
            class529 var4 = this.method1450(arg2, arg1, (byte) 6, false);
            return var4 != null ? var4.field7375 : null;
        }
    }
}
