import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class407 extends class374 implements class457 {

    @OriginalMember(owner = "client!ns", name = "eb", descriptor = "Z")
    private boolean field5163;

    @OriginalMember(owner = "client!ns", name = "L", descriptor = "S")
    private short field5144;

    @OriginalMember(owner = "client!ns", name = "N", descriptor = "B")
    private byte field5146;

    @OriginalMember(owner = "client!ns", name = "ob", descriptor = "Z")
    private boolean field5173;

    @OriginalMember(owner = "client!ns", name = "Q", descriptor = "B")
    private byte field5149;

    @OriginalMember(owner = "client!ns", name = "T", descriptor = "Z")
    private boolean field5152;

    @OriginalMember(owner = "client!ns", name = "X", descriptor = "Z")
    private boolean field5156;

    @OriginalMember(owner = "client!ns", name = "M", descriptor = "Lr;")
    private class185 field5145;

    @OriginalMember(owner = "client!ns", name = "kb", descriptor = "Lka;")
    public class474 field5169;

    @OriginalMember(owner = "client!ns", name = "fb", descriptor = "Lav;")
    public static class641 field5164 = new class641(true);

    @OriginalMember(owner = "client!ns", name = "I", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!ns", name = "J", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!ns", name = "K", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!ns", name = "O", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!ns", name = "P", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!ns", name = "R", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!ns", name = "S", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!ns", name = "U", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!ns", name = "V", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!ns", name = "W", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!ns", name = "Y", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!ns", name = "Z", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!ns", name = "ab", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!ns", name = "bb", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!ns", name = "cb", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!ns", name = "db", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!ns", name = "gb", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!ns", name = "hb", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!ns", name = "ib", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!ns", name = "lb", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!ns", name = "mb", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!ns", name = "nb", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!ns", name = "pb", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!ns", name = "jb", descriptor = "Lwg;")
    private class428 field5168;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lha;I)V")
    public final void method744(class60 arg0, int arg1) {
        ++field5160;
        if (arg1 != 0) {
            this.field5146 = 117;
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lha;Lac;IIIIIZIIZ)V")
    public class407(class60 arg0, class543 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class677.method3818(arg8, arg9, -19248));
        super.field5801 = arg4;
        this.field5163 = arg7;
        this.field5144 = (short) arg1.field7586;
        this.field5146 = (byte) arg8;
        this.field5173 = arg10;
        super.field5797 = arg6;
        this.field5149 = (byte) arg9;
        this.field5152 = arg1.field7550 != 0 && !arg7;
        this.field5156 = arg0.method467() && arg1.field7504 && !this.field5163 && class748.field10451.field10410.method3447((byte) 108) != 0;
        int var12 = 2048;
        if (this.field5173) {
            var12 |= 65536;
        }
        class257 var13 = this.method2270(this.field5156, var12, (byte) 84, arg0);
        if (var13 != null) {
            this.field5145 = var13.field3264;
            this.field5169 = var13.field3263;
            if (this.field5173) {
                this.field5169 = this.field5169.method273((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)Z")
    public final boolean method759(int arg0) {
        ++field5165;
        return arg0 != 0 ? false : this.field5173;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZIBLha;)Lok;")
    private final class257 method2270(boolean arg0, int arg1, byte arg2, class60 arg3) {
        ++field5170;
        if (arg2 < 64) {
            this.method87((byte) 32);
        }
        class543 var5 = client.field3995.method3384(this.field5144 & 65535, false);
        class282 var6;
        class282 var7;
        if (!this.field5163) {
            if (~super.field5793 > -4) {
                var6 = class707.field9826[super.field5793 + 1];
            } else {
                var6 = null;
            }
            var7 = class707.field9826[super.field5793];
        } else {
            var7 = class395.field5009[super.field5793];
            var6 = class707.field9826[0];
        }
        return var5.method3118(var6, super.field5797, this.field5149, this.field5146, var7, super.field5800, arg3, arg1, -121, arg0, super.field5801, (class456) null);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILrba;Lha;ZII)V")
    public final void method754(int arg0, int arg1, class435 arg2, class60 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 == 30558) {
            ++field5159;
            if (!(arg2 instanceof class407)) {
                if (arg2 instanceof class93) {
                    class93 var8 = (class93) arg2;
                    if (this.field5169 != null && var8.field1273 != null) {
                        this.field5169.method241(var8.field1273, arg6, arg1, arg5, arg4);
                        return;
                    }
                }
            } else {
                class407 var9 = (class407) arg2;
                if (this.field5169 == null || var9.field5169 == null) {
                    return;
                }
                this.field5169.method241(var9.field5169, arg6, arg1, arg5, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(Lha;I)Ljk;")
    public final class635 method755(class60 arg0, int arg1) {
        int var3 = -40 % ((arg1 - -39) / 55);
        ++field5154;
        if (this.field5169 == null) {
            return null;
        } else {
            class631 var4 = arg0.method531();
            var4.method596(super.field5801, super.field5800, super.field5797);
            class635 var5 = class510.method2982(this.field5152, 0, 1);
            if (!class232.field3053) {
                this.field5169.method250(var4, var5.field8760[0], 0);
            } else {
                this.field5169.method255(var4, var5.field8760[0], class286.field3600, 0);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)Z")
    public final boolean method85(int arg0) {
        ++field5162;
        if (arg0 > -79) {
            return false;
        } else {
            return this.field5169 != null ? this.field5169.method287() : false;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)I")
    public final int method758(boolean arg0) {
        ++field5158;
        if (!arg0) {
            this.field5152 = false;
        }
        return this.field5146;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)Z")
    public final boolean method756(int arg0) {
        ++field5171;
        if (arg0 > -52) {
            this.field5146 = 111;
        }
        return this.field5156;
    }

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "(I)I")
    public final int method84(int arg0) {
        if (arg0 != 1027) {
            this.field5168 = null;
        }
        ++field5148;
        return this.field5169 != null ? this.field5169.method248() : 0;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(CI)Z")
    public static final boolean method2271(char arg0, int arg1) {
        if (arg1 != 979) {
            method2273(-64);
        }
        ++field5147;
        return arg0 >= 'A' && ~arg0 >= -91 || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(ILha;)V")
    public final void method760(int arg0, class60 arg1) {
        ++field5157;
        Object var3 = null;
        class185 var5;
        if (this.field5145 == null && this.field5156) {
            class257 var4 = this.method2270(true, 262144, (byte) 80, arg1);
            var5 = var4 == null ? null : var4.field3264;
        } else {
            var5 = this.field5145;
            this.field5145 = null;
        }
        if (var5 != null) {
            class549.method3194(var5, super.field5793, super.field5801, super.field5797, (boolean[]) null);
        }
        if (arg0 != -31507) {
            this.method84(-23);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BILha;I)Z")
    public final boolean method752(byte arg0, int arg1, class60 arg2, int arg3) {
        ++field5141;
        class474 var5 = this.method2272(-71, arg2, 131072);
        if (arg0 > -41) {
            field5164 = null;
        }
        if (var5 != null) {
            class631 var6 = arg2.method531();
            var6.method596(super.field5801, super.field5800, super.field5797);
            return class232.field3053 ? var5.method275(arg1, arg3, var6, false, 0, class286.field3600) : var5.method258(arg1, arg3, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)I")
    public final int method745(byte arg0) {
        ++field5167;
        int var2 = 107 % ((-33 - arg0) / 56);
        return this.field5144 & 65535;
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(B)I")
    public final int method87(byte arg0) {
        ++field5153;
        if (arg0 != 121) {
            return -68;
        } else {
            return this.field5169 != null ? this.field5169.method286() : 0;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILha;)V")
    public final void method761(int arg0, class60 arg1) {
        ++field5155;
        Object var3 = null;
        class185 var5;
        if (this.field5145 == null && this.field5156) {
            class257 var4 = this.method2270(true, 262144, (byte) 84, arg1);
            var5 = var4 == null ? null : var4.field3264;
        } else {
            var5 = this.field5145;
            this.field5145 = null;
        }
        if (var5 != null) {
            class739.method4116(var5, super.field5793, super.field5801, super.field5797, (boolean[]) null);
        }
        int var6 = -80 % ((63 - arg0) / 51);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILha;I)Lka;")
    private final class474 method2272(int arg0, class60 arg1, int arg2) {
        ++field5161;
        if (this.field5169 != null && ~arg1.method542(this.field5169.method272(), arg2) == -1) {
            return this.field5169;
        } else {
            int var4 = 12 / ((arg0 - 6) / 33);
            class257 var5 = this.method2270(false, arg2, (byte) 122, arg1);
            return var5 == null ? null : var5.field3263;
        }
    }

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "(I)V")
    public static void method2273(int arg0) {
        if (arg0 != -18694) {
            field5164 = null;
        }
        field5164 = null;
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(ILha;)Lwg;")
    public final class428 method750(int arg0, class60 arg1) {
        if (this.field5168 == null) {
            this.field5168 = class43.method309(super.field5800, this.method2272(-35, arg1, 0), super.field5797, super.field5801, -16);
        }
        if (arg0 > -22) {
            method2273(-31);
        }
        ++field5143;
        return this.field5168;
    }

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "(B)Z")
    public final boolean method83(byte arg0) {
        if (arg0 != -69) {
            this.field5152 = true;
        }
        ++field5174;
        if (this.field5169 == null) {
            return true;
        } else {
            return !this.field5169.method244();
        }
    }

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "(B)V")
    public final void method749(byte arg0) {
        ++field5142;
        this.field5173 = false;
        if (this.field5169 != null) {
            this.field5169.method266(this.field5169.method272() & -65537);
        }
        if (arg0 > -41) {
            this.method84(-125);
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V")
    public final void method746(byte arg0) {
        ++field5166;
        if (this.field5169 != null) {
            this.field5169.method243();
        }
        if (arg0 <= 82) {
            this.method754(-105, 106, (class435) null, (class60) null, true, 73, 106);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)I")
    public final int method743(int arg0) {
        if (arg0 != -30968) {
            this.method743(63);
        }
        ++field5150;
        return this.field5149;
    }
}
