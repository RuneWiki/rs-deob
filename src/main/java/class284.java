import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class284 extends class675 implements class624 {

    @OriginalMember(owner = "client!kd", name = "ob", descriptor = "Z")
    private boolean field4027 = false;

    @OriginalMember(owner = "client!kd", name = "sb", descriptor = "Ljh;")
    public class161 field4031;

    @OriginalMember(owner = "client!kd", name = "ib", descriptor = "Z")
    private boolean field4021;

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
    public static int field4015 = 0;

    @OriginalMember(owner = "client!kd", name = "lb", descriptor = "[I")
    public static int[] field4024 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "[C")
    public static char[] field4005 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!kd", name = "gb", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!kd", name = "hb", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!kd", name = "jb", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!kd", name = "kb", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!kd", name = "mb", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!kd", name = "nb", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!kd", name = "pb", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!kd", name = "qb", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!kd", name = "ub", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!kd", name = "vb", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!kd", name = "wb", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!kd", name = "xb", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!kd", name = "rb", descriptor = "Lfi;")
    public static class557 field4030;

    @OriginalMember(owner = "client!kd", name = "tb", descriptor = "Lck;")
    private class642 field4032;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)I", line = 3)
    public final int method1752(byte arg0) {
        ++field4016;
        if (arg0 != -111) {
            this.field4027 = false;
        }
        return this.field4031.field2437;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lkf;Lha;IIIZI)V", line = 14)
    public final void method807(class256 arg0, class59 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        ++field4023;
        if (arg3 <= 109) {
            field4030 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lbk;I)V", line = 25)
    public final void method1753(class379 arg0, int arg1) {
        ++field4004;
        this.field4031.method1157(arg0, arg1);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V", line = 33)
    public final void method1754(boolean arg0) {
        ++field4029;
        if (!arg0) {
            field4022 = 97;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLha;)Lck;", line = 45)
    public final class642 method808(byte arg0, class59 arg1) {
        ++field4020;
        if (arg0 >= -86) {
            field4022 = -104;
        }
        return this.field4032;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[[I)V", line = 56)
    public static final void method1755(int arg0, int[][] arg1) {
        class690.field9616 = arg1;
        ++field4026;
        if (arg0 != 4) {
            field4005 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lha;Lqfa;IIIIIZIIIIIII)V", line = 68)
    public class284(class59 arg0, class100 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field1290 == -2, class156.method1131(arg12, arg13, -16878));
        this.field4031 = new class161(arg0, arg1, arg12, arg13, super.field3508, arg3, this, arg7, arg14);
        this.field4021 = arg1.field1363 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(B)Z", line = 80)
    public final boolean method806(byte arg0) {
        int var2 = 99 / ((arg0 - 14) / 57);
        ++field4009;
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLha;)V", line = 92)
    public final void method1756(boolean arg0, class59 arg1) {
        this.field4031.method1159((byte) 39, arg1);
        if (arg0) {
            ++field4017;
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)I", line = 105)
    public final int method1757(byte arg0) {
        ++field4033;
        int var2 = -14 / ((arg0 - -57) / 53);
        return this.field4031.field2405;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)Z", line = 117)
    public final boolean method798(int arg0) {
        int var2 = 48 / ((53 - arg0) / 45);
        ++field4025;
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lha;B)V", line = 128)
    public final void method792(class59 arg0, byte arg1) {
        if (arg1 > 121) {
            ++field4007;
            class475 var3 = this.field4031.method1152(arg0, true, 262144, -21385, true);
            if (var3 != null) {
                class333 var4 = arg0.method451();
                var4.method1727(super.field3505, super.field3510, super.field3502);
                this.field4031.method1160(false, super.field9360, var4, super.field9367, var3, arg0, super.field9361, super.field9354, false);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)I", line = 149)
    public final int method791(byte arg0) {
        ++field4028;
        return arg0 < 81 ? -29 : this.field4031.method1150(-1);
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)I", line = 160)
    public final int method789(int arg0) {
        if (arg0 != -32768) {
            return -53;
        } else {
            ++field4008;
            return this.field4031.method1154(1);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILha;)V", line = 171)
    public final void method1758(int arg0, class59 arg1) {
        this.field4031.method1148(arg1, arg0 ^ 22943);
        if (arg0 != 6120) {
            this.method806((byte) 29);
        }
        ++field4011;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lha;IIB)Z", line = 187)
    public final boolean method790(class59 arg0, int arg1, int arg2, byte arg3) {
        ++field4036;
        if (arg3 != 103) {
            method1760((class385) null, (byte[][]) null, false);
        }
        class475 var5 = this.field4031.method1152(arg0, false, 131072, arg3 ^ -21488, false);
        if (var5 == null) {
            return false;
        } else {
            class333 var6 = arg0.method451();
            var6.method1727(super.field3505, super.field3510, super.field3502);
            return class540.field7159 ? var5.method203(arg2, arg1, var6, false, 0, class100.field1358) : var5.method158(arg2, arg1, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I", line = 213)
    public final int method1759(byte arg0) {
        ++field4006;
        if (arg0 <= 63) {
            field4024 = null;
        }
        return this.field4031.field2404;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Laha;[[BZ)V", line = 225)
    public static final void method1760(class385 arg0, byte[][] arg1, boolean arg2) {
        ++field4013;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class677 var11 = new class677(var10);
                int var12 = class197.field2972[var5] >> 8;
                int var13 = 255 & class197.field2972[var5];
                int var14 = var12 * 64 + -class503.field6752;
                int var15 = var13 * 64 - class334.field4757;
                class651.method3552(-25926);
                arg0.method2515(class334.field4757, var14, class503.field6752, var11, class456.field6226, -27506, var15);
                arg0.method2280(var14, var15, var11, var3, (byte) -95, class341.field4807);
                if (!arg0.field6053 && ~(class161.field2401 / 8) == ~var12 && ~(class88.field1069 / 8) == ~var13 && ~var3[0] != 0) {
                    class749.field10430 = class2.field26.method3691(var3[2], var3[0], -23470, var3[1], var3[3], class137.field2187);
                    class142.field2269 = var3[4];
                }
            }
        }
        int var6 = 0;
        if (arg2) {
            field4024 = null;
        }
        while (~var4 < ~var6) {
            int var7 = (class197.field2972[var6] >> 8) * 64 + -class503.field6752;
            int var8 = (255 & class197.field2972[var6]) * 64 + -class334.field4757;
            byte[] var9 = arg1[var6];
            if (var9 == null && ~class88.field1069 > -801) {
                class651.method3552(-25926);
                arg0.method2523((byte) -14, var8, 64, var7, 64);
            }
            ++var6;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)Z", line = 299)
    public final boolean method1761(int arg0) {
        if (arg0 != -28823) {
            return false;
        } else {
            ++field4010;
            return this.field4031.method1151((byte) -127);
        }
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(B)V", line = 319)
    public static void method1762(byte arg0) {
        field4005 = null;
        field4030 = null;
        field4024 = null;
        if (arg0 > -29) {
            method1762((byte) -88);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(ILha;)Lww;", line = 334)
    public final class733 method800(int arg0, class59 arg1) {
        ++field4018;
        class475 var3 = this.field4031.method1152(arg1, true, 2048, -21385, false);
        if (var3 == null) {
            return null;
        } else {
            class333 var4 = arg1.method451();
            var4.method1727(super.field3505, super.field3510, super.field3502);
            class733 var5 = class397.method2338(this.field4021, (byte) 113, 1);
            this.field4031.method1160(false, super.field9360, var4, super.field9367, var3, arg1, super.field9361, super.field9354, true);
            if (!class540.field7159) {
                var3.method155(var4, var5.field10150[0], 0);
            } else {
                var3.method160(var4, var5.field10150[0], class100.field1358, 0);
            }
            if (this.field4031.field2423 != null) {
                class388 var6 = this.field4031.field2423.method131();
                if (!class540.field7159) {
                    arg1.method508(var6);
                } else {
                    arg1.method407(var6, class100.field1358);
                }
            }
            this.field4027 = var3.method159() || this.field4031.field2423 != null;
            if (this.field4032 == null) {
                this.field4032 = class549.method3072(super.field3502, super.field3505, super.field3510, 544, var3);
            } else {
                class735.method4107(this.field4032, super.field3510, var3, super.field3502, arg0 + -89, super.field3505);
            }
            if (arg0 != -1) {
                this.method807((class256) null, (class59) null, 34, 42, -5, false, -24);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V", line = 384)
    public static final void method1763(int arg0, byte arg1) {
        ++field4035;
        class670.field9141 = arg0;
        class556.field7305 = null;
        class307.field4417 = false;
        class172.field2631 = -1;
        class577.field7577 = null;
        class65.field803 = -1;
        class175.field2641 = 0;
        class320.field4576 = 1;
        if (arg1 > -26) {
            field4015 = -112;
        }
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V", line = 407)
    public final void method803(int arg0) {
        ++field4014;
        if (arg0 == 131072) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)Z", line = 418)
    public final boolean method801(boolean arg0) {
        if (arg0) {
            field4005 = null;
        }
        ++field4019;
        return this.field4027;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lee;B)Ljava/lang/String;", line = 431)
    public static final String method1764(class677 arg0, byte arg1) {
        ++field4034;
        return arg1 != 101 ? null : class370.method2177(32767, 0, arg0);
    }
}
