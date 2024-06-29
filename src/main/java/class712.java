import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class712 extends class573 implements class457 {

    @OriginalMember(owner = "client!mga", name = "nb", descriptor = "B")
    private byte field9896;

    @OriginalMember(owner = "client!mga", name = "bb", descriptor = "S")
    private short field9884;

    @OriginalMember(owner = "client!mga", name = "gb", descriptor = "Z")
    private boolean field9889;

    @OriginalMember(owner = "client!mga", name = "kb", descriptor = "Z")
    private boolean field9893;

    @OriginalMember(owner = "client!mga", name = "ob", descriptor = "B")
    private byte field9897;

    @OriginalMember(owner = "client!mga", name = "ab", descriptor = "Z")
    private boolean field9883;

    @OriginalMember(owner = "client!mga", name = "ib", descriptor = "Lka;")
    private class474 field9891;

    @OriginalMember(owner = "client!mga", name = "O", descriptor = "Lr;")
    private class185 field9871;

    @OriginalMember(owner = "client!mga", name = "S", descriptor = "[I")
    public static int[] field9875 = new int[13];

    @OriginalMember(owner = "client!mga", name = "W", descriptor = "Z")
    public static boolean field9879 = false;

    @OriginalMember(owner = "client!mga", name = "P", descriptor = "I")
    public static int field9872;

    @OriginalMember(owner = "client!mga", name = "Q", descriptor = "I")
    public static int field9873;

    @OriginalMember(owner = "client!mga", name = "R", descriptor = "I")
    public static int field9874;

    @OriginalMember(owner = "client!mga", name = "T", descriptor = "I")
    public static int field9876;

    @OriginalMember(owner = "client!mga", name = "U", descriptor = "I")
    public static int field9877;

    @OriginalMember(owner = "client!mga", name = "V", descriptor = "I")
    public static int field9878;

    @OriginalMember(owner = "client!mga", name = "X", descriptor = "I")
    public static int field9880;

    @OriginalMember(owner = "client!mga", name = "Z", descriptor = "I")
    public static int field9882;

    @OriginalMember(owner = "client!mga", name = "cb", descriptor = "I")
    public static int field9885;

    @OriginalMember(owner = "client!mga", name = "eb", descriptor = "I")
    public static int field9887;

    @OriginalMember(owner = "client!mga", name = "hb", descriptor = "I")
    public static int field9890;

    @OriginalMember(owner = "client!mga", name = "jb", descriptor = "I")
    public static int field9892;

    @OriginalMember(owner = "client!mga", name = "lb", descriptor = "I")
    public static int field9894;

    @OriginalMember(owner = "client!mga", name = "mb", descriptor = "I")
    public static int field9895;

    @OriginalMember(owner = "client!mga", name = "pb", descriptor = "I")
    public static int field9898;

    @OriginalMember(owner = "client!mga", name = "qb", descriptor = "I")
    public static int field9899;

    @OriginalMember(owner = "client!mga", name = "rb", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!mga", name = "sb", descriptor = "I")
    public static int field9901;

    @OriginalMember(owner = "client!mga", name = "N", descriptor = "Ld;")
    public static class153 field9870;

    @OriginalMember(owner = "client!mga", name = "fb", descriptor = "Lwg;")
    private class428 field9888;

    @OriginalMember(owner = "client!mga", name = "Y", descriptor = "[I")
    public static int[] field9881;

    @OriginalMember(owner = "client!mga", name = "db", descriptor = "[I")
    public static int[] field9886;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lha;I)V", line = 3)
    public final void method744(class60 arg0, int arg1) {
        ++field9892;
        if (arg1 != 0) {
            this.field9871 = null;
        }
    }

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "(B)I", line = 13)
    public final int method87(byte arg0) {
        ++field9894;
        if (arg0 != 121) {
            this.method3977((class60) null, (byte) -68, 53);
        }
        return this.field9891 != null ? this.field9891.method286() : 0;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lha;BI)Lka;", line = 24)
    private final class474 method3977(class60 arg0, byte arg1, int arg2) {
        ++field9885;
        if (arg1 <= 120) {
            this.field9897 = 117;
        }
        if (this.field9891 != null && arg0.method542(this.field9891.method272(), arg2) == 0) {
            return this.field9891;
        } else {
            class257 var4 = this.method3980(false, 65535, arg0, arg2);
            return var4 == null ? null : var4.field3263;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(BILha;I)Z", line = 45)
    public final boolean method752(byte arg0, int arg1, class60 arg2, int arg3) {
        ++field9895;
        class474 var5 = this.method3977(arg2, (byte) 124, 131072);
        if (arg0 > -41) {
            this.method3977((class60) null, (byte) -11, 85);
        }
        if (var5 != null) {
            class631 var6 = arg2.method531();
            var6.method596(super.field5801, super.field5800, super.field5797);
            return class232.field3053 ? var5.method275(arg1, arg3, var6, false, 0, class286.field3600) : var5.method258(arg1, arg3, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIII)V", line = 72)
    public static final void method3978(int arg0, int arg1, int arg2, int arg3) {
        ++field9900;
        if (arg0 != 0) {
            method3979(true);
        }
        class210 var4 = class203.field2718[arg3][arg1];
        class584.method3323(var4 == null ? class605.field8417 : var4, arg2, arg0 + -118);
    }

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "(I)Z", line = 85)
    public final boolean method85(int arg0) {
        ++field9874;
        if (arg0 >= -79) {
            this.field9896 = 107;
        }
        return this.field9891 != null ? this.field9891.method287() : false;
    }

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "(B)Z", line = 101)
    public final boolean method83(byte arg0) {
        ++field9878;
        if (arg0 != -69) {
            this.field9888 = null;
        }
        if (this.field9891 != null) {
            return !this.field9891.method244();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(ILha;)V", line = 122)
    public final void method760(int arg0, class60 arg1) {
        if (arg0 != -31507) {
            field9881 = null;
        }
        ++field9899;
        Object var3 = null;
        class185 var5;
        if (this.field9871 == null && this.field9883) {
            class257 var4 = this.method3980(true, arg0 + 97042, arg1, 262144);
            var5 = var4 != null ? var4.field3264 : null;
        } else {
            var5 = this.field9871;
            this.field9871 = null;
        }
        if (var5 != null) {
            class549.method3194(var5, super.field5793, super.field5801, super.field5797, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lha;Lac;IIIIIZIIII)V", line = 152)
    public class712(class60 arg0, class543 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field9896 = (byte) arg11;
        this.field9884 = (short) arg1.field7586;
        super.field5797 = arg6;
        this.field9889 = arg7;
        super.field5801 = arg4;
        this.field9893 = ~arg1.field7550 != -1 && !arg7;
        this.field9897 = (byte) arg10;
        this.field9883 = arg0.method467() && arg1.field7504 && !this.field9889 && ~class748.field10451.field10410.method3447((byte) -44) != -1;
        class257 var13 = this.method3980(this.field9883, 65535, arg0, 2048);
        if (var13 != null) {
            this.field9891 = var13.field3263;
            this.field9871 = var13.field3264;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(ILha;)V", line = 184)
    public final void method761(int arg0, class60 arg1) {
        ++field9890;
        Object var3 = null;
        class185 var5;
        if (this.field9871 == null && this.field9883) {
            class257 var4 = this.method3980(true, 65535, arg1, 262144);
            var5 = var4 == null ? null : var4.field3264;
        } else {
            var5 = this.field9871;
            this.field9871 = null;
        }
        if (var5 != null) {
            class739.method4116(var5, super.field5793, super.field5801, super.field5797, (boolean[]) null);
        }
        int var6 = 60 % ((63 - arg0) / 51);
    }

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "(Z)V", line = 216)
    public static void method3979(boolean arg0) {
        if (!arg0) {
            field9886 = null;
        }
        field9875 = null;
        field9886 = null;
        field9870 = null;
        field9881 = null;
    }

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "(ILha;)Lwg;", line = 229)
    public final class428 method750(int arg0, class60 arg1) {
        ++field9873;
        if (arg0 > -22) {
            return null;
        } else {
            if (this.field9888 == null) {
                this.field9888 = class43.method309(super.field5800, this.method3977(arg1, (byte) 123, 0), super.field5797, super.field5801, -80);
            }
            return this.field9888;
        }
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(B)V", line = 246)
    public final void method746(byte arg0) {
        if (this.field9891 != null) {
            this.field9891.method243();
        }
        ++field9901;
        if (arg0 <= 82) {
            field9881 = null;
        }
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)Z", line = 259)
    public final boolean method756(int arg0) {
        ++field9872;
        if (arg0 > -52) {
            field9886 = null;
        }
        return this.field9883;
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(Lha;I)Ljk;", line = 271)
    public final class635 method755(class60 arg0, int arg1) {
        ++field9882;
        if (this.field9891 == null) {
            return null;
        } else {
            class631 var3 = arg0.method531();
            var3.method596(super.field8056 + super.field5801, super.field5800, super.field5797 - -super.field8053);
            class635 var4 = class510.method2982(this.field9893, 0, 1);
            if (!class232.field3053) {
                this.field9891.method250(var3, var4.field8760[0], 0);
            } else {
                this.field9891.method255(var3, var4.field8760[0], class286.field3600, 0);
            }
            int var5 = 97 % ((-39 - arg1) / 55);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)I", line = 297)
    public final int method745(byte arg0) {
        int var2 = 127 / ((-33 - arg0) / 56);
        ++field9898;
        return this.field9884 & 65535;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Z)I", line = 307)
    public final int method758(boolean arg0) {
        ++field9887;
        if (!arg0) {
            this.method83((byte) -30);
        }
        return this.field9897;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)I", line = 320)
    public final int method743(int arg0) {
        if (arg0 != -30968) {
            return 27;
        } else {
            ++field9877;
            return this.field9896;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(ZILha;I)Lok;", line = 337)
    private final class257 method3980(boolean arg0, int arg1, class60 arg2, int arg3) {
        ++field9880;
        class543 var5 = client.field3995.method3384(arg1 & this.field9884, false);
        class282 var6;
        class282 var7;
        if (this.field9889) {
            var6 = class707.field9826[0];
            var7 = class395.field5009[super.field5793];
        } else {
            if (~super.field5793 > -4) {
                var6 = class707.field9826[super.field5793 + 1];
            } else {
                var6 = null;
            }
            var7 = class707.field9826[super.field5793];
        }
        return var5.method3118(var6, super.field5797, this.field9896, this.field9897, var7, super.field5800, arg2, arg3, arg1 + -65479, arg0, super.field5801, (class456) null);
    }

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "(I)I", line = 364)
    public final int method84(int arg0) {
        ++field9876;
        if (arg0 != 1027) {
            this.method85(88);
        }
        return this.field9891 != null ? this.field9891.method248() : 0;
    }
}
