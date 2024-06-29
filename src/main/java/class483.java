import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class483 extends class428 {

    @OriginalMember(owner = "client!no", name = "Kb", descriptor = "Lqu;")
    public static class364 field7331 = new class364(19, -1);

    @OriginalMember(owner = "client!no", name = "Nb", descriptor = "I")
    public static int field7334 = 0;

    @OriginalMember(owner = "client!no", name = "Ob", descriptor = "Ljava/lang/String;")
    public static String field7335 = "";

    @OriginalMember(owner = "client!no", name = "zb", descriptor = "I")
    private int field7320;

    @OriginalMember(owner = "client!no", name = "Ab", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!no", name = "Bb", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!no", name = "Cb", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!no", name = "Db", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!no", name = "Eb", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!no", name = "Fb", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!no", name = "Gb", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!no", name = "Ib", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!no", name = "Jb", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!no", name = "Lb", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!no", name = "Mb", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!no", name = "Qb", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!no", name = "Pb", descriptor = "Lps;")
    public static class428 field7336;

    @OriginalMember(owner = "client!no", name = "Hb", descriptor = "Lcg;")
    private class549 field7328;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "([BILqba;I)Lon;")
    public static final class596 method2925(byte[] arg0, int arg1, class540 arg2, int arg3) {
        ++field7324;
        if (arg0 == null) {
            return null;
        } else {
            if (arg1 != -29157) {
                method2935(-88, -119);
            }
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg3, var4);
            OpenGL.glProgramRawARB(arg3, 34933, arg0);
            OpenGL.glGetIntegerv(34379, class238.field3487, 0);
            if (class238.field3487[0] != -1) {
                OpenGL.glBindProgramARB(arg3, 0);
                return null;
            } else {
                OpenGL.glBindProgramARB(arg3, 0);
                return new class596(arg2, arg3, var4);
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "p", descriptor = "(II)V")
    public final void method2926(int arg0, int arg1) {
        if (arg0 == 8) {
            ++field7325;
            super.field6162[super.field6221++] = (byte) (arg1 + this.field7328.method3216(123));
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZI[BI)V")
    public final void method2927(boolean arg0, int arg1, byte[] arg2, int arg3) {
        ++field7327;
        if (!arg0) {
            field7336 = null;
        }
        for (int var5 = 0; ~var5 > ~arg3; ++var5) {
            arg2[arg1 + var5] = (byte) (super.field6162[super.field6221++] + -this.field7328.method3216(113));
        }
    }

    @OriginalMember(owner = "client!no", name = "i", descriptor = "(B)V")
    public static void method2928(byte arg0) {
        field7331 = null;
        field7336 = null;
        field7335 = null;
        if (arg0 >= -60) {
            method2929(99, (String) null);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method2929(int arg0, String arg1) {
        ++field7332;
        if (arg0 != 138) {
            return null;
        } else {
            int var2 = arg1.length();
            if (~var2 == -1) {
                return new byte[0];
            } else {
                int var3 = var2 + 3 & -4;
                int var4 = var3 / 4 * 3;
                if (var3 - 2 < var2 && ~class383.method2317(arg1.charAt(var3 - 2), -58) != 0) {
                    if (~var2 >= ~(var3 + -1) || ~class383.method2317(arg1.charAt(var3 + -1), -83) == 0) {
                        --var4;
                    }
                } else {
                    var4 -= 2;
                }
                byte[] var5 = new byte[var4];
                class173.method1094((byte) 3, 0, arg1, var5);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "w", descriptor = "(I)V")
    public final void method2930(int arg0) {
        super.field6221 = (this.field7320 + 7) / 8;
        if (arg0 != 20056) {
            this.field7328 = null;
        }
        ++field7330;
    }

    @OriginalMember(owner = "client!no", name = "f", descriptor = "(Z)I")
    public final int method2931(boolean arg0) {
        ++field7321;
        int var2 = 255 & super.field6162[super.field6221++] + -this.field7328.method3216(87);
        if (!arg0) {
            return -106;
        } else {
            return ~var2 > -129 ? var2 : (255 & super.field6162[super.field6221++] + -this.field7328.method3216(86)) + (var2 - 128 << 8);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B[I)V")
    public final void method2932(byte arg0, int[] arg1) {
        this.field7328 = new class549(arg1);
        if (arg0 != -118) {
            field7336 = null;
        }
        ++field7326;
    }

    @OriginalMember(owner = "client!no", name = "x", descriptor = "(I)V")
    public final void method2933(int arg0) {
        if (arg0 != 0) {
            this.field7328 = null;
        }
        this.field7320 = super.field6221 * 8;
        ++field7322;
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(IB)I")
    public final int method2934(int arg0, byte arg1) {
        ++field7329;
        return arg1 < 31 ? -75 : arg0 * 8 - this.field7320;
    }

    @OriginalMember(owner = "client!no", name = "q", descriptor = "(II)Lcr;")
    public static final class446 method2935(int arg0, int arg1) {
        ++field7333;
        class446 var2 = (class446) class170.field2315.method2025((long) arg0, arg1 + -24317);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class10.field95.method3486((byte) -55, arg0, 0);
            class446 var4 = new class446();
            if (var3 != null) {
                var4.method2708(new class428(var3), (byte) 112);
            }
            if (arg1 != 24319) {
                field7336 = null;
            }
            var4.method2710((byte) 118);
            class170.field2315.method2029(false, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!no", name = "y", descriptor = "(I)Z")
    public final boolean method2936(int arg0) {
        int var2 = 25 % ((-27 - arg0) / 61);
        ++field7337;
        int var3 = 255 & super.field6162[super.field6221] - this.field7328.method3215(-1617);
        return ~var3 <= -129;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(I)V")
    public class483(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!no", name = "r", descriptor = "(II)I")
    public final int method2937(int arg0, int arg1) {
        ++field7323;
        int var3 = this.field7320 >> 3;
        int var4 = -(this.field7320 & 7) + 8;
        int var5 = 0;
        this.field7320 += arg1;
        while (~arg1 < ~var4) {
            var5 += (class529.field7851[var4] & super.field6162[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 == ~var4) {
            var6 = (super.field6162[var3] & class529.field7851[var4]) + var5;
        } else {
            var6 = (super.field6162[var3] >> -arg1 + var4 & class529.field7851[arg1]) + var5;
        }
        if (arg0 != -19811) {
            this.method2932((byte) -10, (int[]) null);
        }
        return var6;
    }
}
