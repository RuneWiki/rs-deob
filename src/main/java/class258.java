import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class258 extends class407 {

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    private int field3778 = -32768;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    private int field3783 = 0;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "Z")
    public boolean field3788 = false;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    private int field3785 = -1;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
    private int field3797 = 0;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
    public int field3800;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    private int field3794;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "Lmd;")
    private class233 field3795;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public static int field3781 = 0;

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "Luc;")
    public static class51 field3801 = new class51(8);

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field3802 = "M";

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "Lef;")
    public static class290 field3803 = new class290();

    @OriginalMember(owner = "client!hd", name = "eb", descriptor = "Z")
    public static boolean field3805 = false;

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "I")
    public static int field3804 = 0;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "Lnd;")
    private class411 field3796;

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 115)
    public class258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field3800 = arg2 - -arg1;
        this.field3794 = arg0;
        int var12 = class263.method1762(this.field3794, false).field3271;
        if (var12 == -1) {
            this.field3788 = true;
        } else {
            this.field3788 = false;
            this.field3795 = class73.method597(var12, -1);
        }
        if (this.field3800 == arg2) {
            class379.method2476(this.field3783, false, false, super.field5930, this.field3795, super.field5921);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILtj;I)Lqb;", line = 7)
    private final class257 method1703(int arg0, class298 arg1, int arg2) {
        if (arg2 >= -60) {
            this.method1703(113, (class298) null, -73);
        }
        ++field3799;
        class235 var4 = class263.method1762(this.field3794, false);
        return !this.field3788 ? var4.method1524(this.field3785, arg0, 64, arg1, this.field3797, this.field3783) : var4.method1524(-1, arg0, 8, arg1, 0, -1);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lqb;ILtj;)V", line = 22)
    private final void method1704(class257 arg0, int arg1, class298 arg2) {
        ++field3798;
        if (arg1 == -32768) {
            class230[] var4 = arg0.method1656();
            class1[] var5 = arg0.method1694();
            if ((this.field3796 == null || this.field3796.field5959) && (var4 != null || var5 != null)) {
                this.field3796 = new class411(class231.field3179);
            }
            if (this.field3796 != null) {
                this.field3796.method2601(arg2, (long) class231.field3179, var4, var5, false);
                this.field3796.method2598(super.field5922, super.field5917, super.field5924, super.field5918, super.field5920);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLie;)I", line = 53)
    public static final int method1705(byte arg0, class138 arg1) {
        ++field3791;
        String var2 = class84.method687(arg1, -1);
        int[] var3 = null;
        if (class267.method1784(arg1.field1777, (byte) -71)) {
            var3 = class129.method915(126, (int) arg1.field1780).field2026;
        } else if (!class386.method2504((byte) 118, arg1.field1777)) {
            if (class246.method1608(-124, arg1.field1777)) {
                if (~arg1.field1777 == -1012) {
                    var3 = class372.method2447((int) arg1.field1780, (byte) 96).field2911;
                } else {
                    var3 = class372.method2447((int) (arg1.field1780 >>> 32 & 2147483647L), (byte) 37).field2911;
                }
            }
        } else {
            class163 var4 = class388.field5670[(int) arg1.field1780];
            if (var4 != null) {
                var3 = var4.field2206.field2596;
            }
        }
        if (arg0 > -17) {
            method1705((byte) 58, (class138) null);
        }
        if (var3 != null) {
            var2 = var2 + class368.method2426(var3, 17);
        }
        return class233.field3232.method2696(62, var2, class407.field5923);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILtj;II)Z", line = 96)
    public final boolean method120(int arg0, class298 arg1, int arg2, int arg3) {
        ++field3780;
        if (arg3 != 0) {
            this.method1709((byte) -77);
        }
        return false;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V", line = 140)
    public final void method1706(int arg0, int arg1) {
        ++field3779;
        if (!this.field3788) {
            this.field3797 += arg1;
            while (~this.field3795.field3248[this.field3783] > ~this.field3797) {
                this.field3797 -= this.field3795.field3248[this.field3783];
                ++this.field3783;
                if (~this.field3795.field3242.length >= ~this.field3783) {
                    this.field3788 = true;
                    break;
                }
            }
            if (arg0 < -58) {
                if (!this.field3788) {
                    class379.method2476(this.field3783, false, false, super.field5930, this.field3795, super.field5921);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 179)
    public static void method1707(int arg0) {
        field3803 = null;
        field3802 = null;
        if (arg0 != -32768) {
            field3803 = null;
        }
        field3801 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILtj;BIZLkm;I)V", line = 196)
    public final void method112(int arg0, class298 arg1, byte arg2, int arg3, boolean arg4, class402 arg5, int arg6) {
        ++field3792;
        int var8 = -124 % ((46 - arg2) / 45);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)I", line = 208)
    public static int method1708(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V", line = 220)
    public final void method1709(byte arg0) {
        if (this.field3796 != null) {
            this.field3796.method2596();
        }
        ++field3790;
        if (arg0 < 76) {
            this.method107((byte) 39);
        }
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V", line = 234)
    public final void method114(int arg0) {
        if (arg0 != 2) {
            this.method120(-12, (class298) null, 15, -78);
        }
        ++field3787;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)I", line = 245)
    public final int method345(int arg0) {
        ++field3782;
        return arg0 < 14 ? -5 : this.field3778;
    }

    @OriginalMember(owner = "client!hd", name = "finalize", descriptor = "()V", line = 256)
    protected final void finalize() {
        ++field3789;
        if (this.field3796 != null) {
            this.field3796.method2596();
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLtj;)V", line = 266)
    public final void method126(byte arg0, class298 arg1) {
        ++field3793;
        class257 var3 = this.method1703(0, arg1, -119);
        if (var3 != null) {
            this.method1704(var3, arg0 ^ -32718, arg1);
        }
        if (arg0 != 50) {
            this.method1703(-99, (class298) null, -67);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ltj;I)Lri;", line = 281)
    public final class372 method118(class298 arg0, int arg1) {
        ++field3786;
        class257 var3 = this.method1703(1024, arg0, arg1 ^ -18569);
        if (arg1 != 18630) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            class118 var4 = arg0.method519();
            var4.method274(super.field5921, super.field5932, super.field5930);
            if (this.field3796 == null) {
                var3.method1661(var4, (class137) null, 0);
            } else {
                class305 var5 = this.field3796.method2597();
                arg0.method453(var3, var5, var4, (class137) null, 0);
            }
            this.field3778 = var3.method1688();
            this.method1704(var3, -32768, arg0);
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)Z", line = 313)
    public final boolean method107(byte arg0) {
        if (arg0 < 119) {
            this.field3797 = 125;
        }
        ++field3784;
        return false;
    }
}
