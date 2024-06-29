import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class221 extends class727 implements class466 {

    @OriginalMember(owner = "client!bb", name = "qb", descriptor = "Z")
    private boolean field3024;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "B")
    private byte field3010;

    @OriginalMember(owner = "client!bb", name = "pb", descriptor = "Z")
    private boolean field3023;

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "S")
    private short field3015;

    @OriginalMember(owner = "client!bb", name = "rb", descriptor = "Z")
    private boolean field3025;

    @OriginalMember(owner = "client!bb", name = "mb", descriptor = "Z")
    private boolean field3020;

    @OriginalMember(owner = "client!bb", name = "Bb", descriptor = "Lr;")
    private class113 field3035;

    @OriginalMember(owner = "client!bb", name = "xb", descriptor = "Lka;")
    private class231 field3031;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "Ljn;")
    public static class134 field3005 = new class134(39, 16);

    @OriginalMember(owner = "client!bb", name = "ob", descriptor = "Liga;")
    public static class91 field3022 = new class91(6, 16);

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!bb", name = "jb", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!bb", name = "kb", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!bb", name = "lb", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!bb", name = "nb", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!bb", name = "sb", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!bb", name = "tb", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!bb", name = "ub", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!bb", name = "vb", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!bb", name = "wb", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!bb", name = "zb", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!bb", name = "Ab", descriptor = "Loo;")
    public static class12 field3034;

    @OriginalMember(owner = "client!bb", name = "yb", descriptor = "Lda;")
    public static class442 field3032;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "Ltja;")
    private class491 field3009;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I")
    public final int method760(int arg0) {
        if (arg0 != -27640) {
            this.field3020 = true;
        }
        ++field3029;
        return this.field3015 & 65535;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lha;I)V")
    public final void method757(class473 arg0, int arg1) {
        ++field3014;
        int var3 = -67 / ((arg1 - 13) / 37);
        Object var4 = null;
        class113 var6;
        if (this.field3035 == null && this.field3020) {
            class452 var5 = this.method1358(true, 262144, -110, arg0);
            var6 = var5 != null ? var5.field6302 : null;
        } else {
            var6 = this.field3035;
            this.field3035 = null;
        }
        if (var6 != null) {
            class604.method3491(var6, super.field3469, super.field3470, super.field3460, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)Z")
    public final boolean method77(int arg0) {
        ++field3018;
        if (arg0 != 25833) {
            field3026 = 47;
        }
        if (this.field3031 == null) {
            return true;
        } else {
            return !this.field3031.method1563();
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILha;)Lrk;")
    public final class289 method74(int arg0, class473 arg1) {
        ++field3000;
        if (this.field3031 == null) {
            return null;
        } else {
            if (arg0 <= 75) {
                field3034 = null;
            }
            class12 var3 = arg1.method153();
            var3.method50(super.field3470, super.field3464, super.field3460);
            class289 var4 = class122.method863(1, (byte) 114, this.field3025);
            if (!class529.field7284) {
                this.field3031.method1586(var3, var4.field4255[0], 0);
            } else {
                this.field3031.method1580(var3, var4.field4255[0], class775.field10662, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(Lha;I)Ltja;")
    public final class491 method72(class473 arg0, int arg1) {
        if (arg1 != -5047) {
            return null;
        } else {
            if (this.field3009 == null) {
                this.field3009 = class486.method2885(super.field3470, super.field3464, this.method1361((byte) -79, arg0, 0), super.field3460, 29289);
            }
            ++field3019;
            return this.field3009;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILns;)V")
    public static final void method1357(int arg0, class654 arg1) {
        ++field3013;
        boolean var2 = false;
        if (class533.field7336 != arg1.field9206 && ~arg1.field9150 != 0 && arg1.field9135 == 0) {
            class73 var3 = class571.field8029.method3695(arg1.field9150, (byte) -120);
            if (var3.field804 || ~(arg1.field9123 - -1) < ~var3.field817[arg1.field9203]) {
                var2 = true;
            }
        } else {
            var2 = true;
        }
        if (var2) {
            int var4 = arg1.field9206 - arg1.field9183;
            int var5 = -arg1.field9183 + class533.field7336;
            int var6 = arg1.field9174 * 512 + arg1.method3744(arg0 + 9775) * 256;
            int var7 = arg1.field9149 * 512 - -(256 * arg1.method3744(1));
            int var8 = arg1.field9130 * 512 + arg1.method3744(1) * 256;
            int var9 = arg1.field9145 * 512 - -(256 * arg1.method3744(arg0 ^ -9773));
            arg1.field3470 = ((-var5 + var4) * var6 + var5 * var8) / var4;
            arg1.field3460 = ((var4 - var5) * var7 - -(var5 * var9)) / var4;
        }
        arg1.field9218 = 0;
        if (~arg1.field9140 == -1) {
            arg1.method3746(16383, 8192, false);
        }
        if (arg0 != -9774) {
            method1359((byte) -108);
        }
        if (~arg1.field9140 == -2) {
            arg1.method3746(arg0 ^ -6611, 12288, false);
        }
        if (~arg1.field9140 == -3) {
            arg1.method3746(16383, 0, false);
        }
        if (~arg1.field9140 == -4) {
            arg1.method3746(arg0 ^ -6611, 4096, false);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZIILha;)Luaa;")
    private final class452 method1358(boolean arg0, int arg1, int arg2, class473 arg3) {
        ++field3008;
        if (arg2 >= -93) {
            this.field3025 = true;
        }
        class286 var5 = class390.field5558.method3065(41, 65535 & this.field3015);
        class418 var6;
        class418 var7;
        if (!this.field3023) {
            var6 = class95.field1115[super.field3469];
            if (super.field3469 >= 3) {
                var7 = null;
            } else {
                var7 = class95.field1115[super.field3469 - -1];
            }
        } else {
            var7 = class95.field1115[0];
            var6 = class594.field8355[super.field3469];
        }
        return var5.method1898(arg3, 22, var7, super.field3460, arg0, false, super.field3470, super.field3464, this.field3010, arg1, (class413) null, var6);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)Z")
    public final boolean method755(byte arg0) {
        ++field3011;
        return arg0 != -111 ? false : this.field3020;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lha;Z)V")
    public final void method763(class473 arg0, boolean arg1) {
        ++field3030;
        Object var3 = null;
        class113 var5;
        if (this.field3035 == null && this.field3020) {
            class452 var4 = this.method1358(true, 262144, -96, arg0);
            var5 = var4 == null ? null : var4.field6302;
        } else {
            var5 = this.field3035;
            this.field3035 = null;
        }
        if (var5 != null) {
            class516.method3071(var5, super.field3469, super.field3470, super.field3460, (boolean[]) null);
        }
        if (arg1) {
            this.field3031 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)I")
    public final int method78(byte arg0) {
        if (arg0 > -31) {
            return 6;
        } else {
            ++field3006;
            return this.field3031 != null ? this.field3031.method1576() : 0;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)I")
    public final int method756(byte arg0) {
        int var2 = 62 / ((48 - arg0) / 51);
        ++field3002;
        return 22;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(Z)Z")
    public final boolean method83(boolean arg0) {
        ++field3004;
        if (arg0) {
            this.field3025 = false;
        }
        return this.field3024;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILha;II)Z")
    public final boolean method88(int arg0, class473 arg1, int arg2, int arg3) {
        ++field3016;
        if (arg2 != -31634) {
            field3032 = null;
        }
        class231 var5 = this.method1361((byte) -79, arg1, 131072);
        if (var5 != null) {
            class12 var6 = arg1.method153();
            var6.method50(super.field3470, super.field3464, super.field3460);
            return class529.field7284 ? var5.method1570(arg0, arg3, var6, false, 0, class775.field10662) : var5.method1578(arg0, arg3, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(B)V")
    public static void method1359(byte arg0) {
        field3022 = null;
        field3032 = null;
        field3034 = null;
        if (arg0 != 112) {
            method1357(120, (class654) null);
        }
        field3005 = null;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)I")
    public final int method89(int arg0) {
        int var2 = -32 / ((69 - arg0) / 48);
        ++field3027;
        return this.field3031 != null ? this.field3031.method1539() : 0;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lha;I)V")
    public final void method76(class473 arg0, int arg1) {
        int var3 = -71 % ((arg1 - -30) / 42);
        ++field3003;
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(B)V")
    public final void method81(byte arg0) {
        ++field3033;
        this.field3024 = false;
        if (this.field3031 != null) {
            this.field3031.method1548(-65537 & this.field3031.method1587());
        }
        if (arg0 != 29) {
            method1359((byte) -24);
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lha;Lro;IIIIIZIZ)V")
    public class221(class473 arg0, class286 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field4117);
        this.field3024 = arg9;
        super.field3460 = arg6;
        super.field3470 = arg4;
        this.field3010 = (byte) arg8;
        this.field3023 = arg7;
        this.field3015 = (short) arg1.field4124;
        this.field3025 = ~arg1.field4137 != -1 && !arg7;
        this.field3020 = arg0.method206() && arg1.field4122 && !this.field3023 && ~class688.field9602.field8538.method2315((byte) -98) != -1;
        int var11 = 2048;
        if (this.field3024) {
            var11 |= 65536;
        }
        class452 var12 = this.method1358(this.field3020, var11, -101, arg0);
        if (var12 != null) {
            this.field3035 = var12.field6302;
            this.field3031 = var12.field6304;
            if (this.field3024) {
                this.field3031 = this.field3031.method1584((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Loq;IZILha;II)V")
    public final void method73(class230 arg0, int arg1, boolean arg2, int arg3, class473 arg4, int arg5, int arg6) {
        if (arg0 instanceof class221) {
            class221 var8 = (class221) arg0;
            if (this.field3031 != null && var8.field3031 != null) {
                this.field3031.method1564(var8.field3031, arg1, arg3, arg5, arg2);
            }
        }
        if (arg6 > 96) {
            ++field3001;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIILha;)V")
    public static final void method1360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class473 arg6) {
        ++field3021;
        if ((class353.field5119 == null || class465.field6478 == null || class785.field10771 == null) && class149.field1968.method1860(class153.field1999, (byte) 124) && class149.field1968.method1860(class362.field5226, (byte) 124) && class149.field1968.method1860(class116.field1582, (byte) 124)) {
            class279 var7 = class279.method1821(class149.field1968, class362.field5226, 0);
            class465.field6478 = arg6.method192(var7, true);
            var7.method1814();
            class534.field7396 = arg6.method192(var7, true);
            class353.field5119 = arg6.method192(class279.method1821(class149.field1968, class153.field1999, 0), true);
            class279 var8 = class279.method1821(class149.field1968, class116.field1582, 0);
            class785.field10771 = arg6.method192(var8, true);
            var8.method1814();
            class93.field1090 = arg6.method192(var8, true);
        }
        if (class353.field5119 != null && class465.field6478 != null && class785.field10771 != null) {
            int var9 = (-(2 * class785.field10771.method737()) + arg1) / class353.field5119.method737();
            for (int var10 = 0; ~var10 > ~var9; ++var10) {
                class353.field5119.method2025(class785.field10771.method737() + (arg4 - -(class353.field5119.method737() * var10)), arg2 + arg0 + -class353.field5119.method738());
            }
            int var11 = (-class785.field10771.method738() + -arg3 + arg2) / class465.field6478.method738();
            for (int var12 = 0; ~var12 > ~var11; ++var12) {
                class465.field6478.method2025(arg4, arg0 + arg3 - -(class465.field6478.method738() * var12));
                class534.field7396.method2025(arg1 + arg4 + -class534.field7396.method737(), arg3 + arg0 + var12 * class465.field6478.method738());
            }
            class785.field10771.method2025(arg4, -class785.field10771.method738() + arg0 + arg2);
            class93.field1090.method2025(-class785.field10771.method737() + arg1 + arg4, arg0 + arg2 - class785.field10771.method738());
        }
        if (arg5 != 0) {
            method1357(83, (class654) null);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLha;I)Lka;")
    private final class231 method1361(byte arg0, class473 arg1, int arg2) {
        ++field3028;
        if (this.field3031 != null && arg1.method188(this.field3031.method1587(), arg2) == 0) {
            return this.field3031;
        } else if (arg0 != -79) {
            return null;
        } else {
            class452 var4 = this.method1358(false, arg2, -99, arg1);
            return var4 != null ? var4.field6304 : null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)Z")
    public final boolean method80(int arg0) {
        ++field3007;
        if (arg0 < 63) {
            this.field3015 = -2;
        }
        return this.field3031 != null ? this.field3031.method1575() : false;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)I")
    public final int method762(boolean arg0) {
        ++field3012;
        if (!arg0) {
            this.field3015 = -105;
        }
        return this.field3010;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V")
    public final void method754(boolean arg0) {
        ++field3017;
        if (!arg0) {
            if (this.field3031 != null) {
                this.field3031.method1589();
            }
        }
    }
}
