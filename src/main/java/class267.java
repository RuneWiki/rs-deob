import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class267 extends class117 implements class503 {

    @OriginalMember(owner = "client!lp", name = "w", descriptor = "Lfr;")
    public class283 field3687;

    @OriginalMember(owner = "client!lp", name = "L", descriptor = "Z")
    private boolean field3702;

    @OriginalMember(owner = "client!lp", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field3692 = new String[100];

    @OriginalMember(owner = "client!lp", name = "D", descriptor = "Lmn;")
    public static class247 field3694 = new class247(16);

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!lp", name = "s", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!lp", name = "t", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!lp", name = "u", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!lp", name = "x", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!lp", name = "z", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!lp", name = "A", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!lp", name = "C", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!lp", name = "F", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!lp", name = "H", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!lp", name = "I", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!lp", name = "K", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!lp", name = "M", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!lp", name = "G", descriptor = "Ljava/lang/String;")
    public static String field3697;

    @OriginalMember(owner = "client!lp", name = "E", descriptor = "[[Lbf;")
    public static class373[][] field3695;

    @OriginalMember(owner = "client!lp", name = "J", descriptor = "[[[B")
    public static byte[][][] field3700;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)I", line = 5)
    public static final int method1600(int arg0, int arg1) {
        ++field3683;
        if (arg0 != 0) {
            method1600(-38, -123);
        }
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lya;IZLij;III)V", line = 20)
    public final void method498(class38 arg0, int arg1, boolean arg2, class291 arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -1) {
            this.method485(-43);
        }
        ++field3703;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "(I)V", line = 31)
    public static void method1601(int arg0) {
        field3695 = null;
        int var1 = 22 % ((arg0 - 21) / 55);
        field3697 = null;
        field3694 = null;
        field3700 = null;
        field3692 = null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIII[BI)Z", line = 44)
    public static final boolean method1602(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        if (arg6 != 30190) {
            method1602(-102, 107, -28, 114, -17, (byte[]) null, -34);
        }
        ++field3701;
        int var7 = arg0 % arg1;
        int var8;
        if (~var7 == -1) {
            var8 = 0;
        } else {
            var8 = arg1 - var7;
        }
        int var9 = -((arg1 + arg2 + -1) / arg1);
        int var10 = -((arg0 + arg1 - 1) / arg1);
        for (int var11 = var9; ~var11 > -1; ++var11) {
            for (int var12 = var10; var12 < 0; ++var12) {
                if (arg5[arg4] == 0) {
                    return true;
                }
                arg4 += arg1;
            }
            int var13 = arg4 - var8;
            if (~arg5[var13 + -1] == -1) {
                return true;
            }
            arg4 = arg3 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILya;)V", line = 99)
    public final void method482(int arg0, class38 arg1) {
        if (arg0 >= -56) {
            this.method495(-13);
        }
        this.field3687.method1688((byte) -122, arg1);
        ++field3696;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLya;I)Lt;", line = 110)
    public final class471 method488(byte arg0, class38 arg1, int arg2) {
        if (arg0 != 124) {
            return null;
        } else {
            ++field3688;
            return this.field3687.method1687((byte) 56, false, false, 0, 0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)Z", line = 121)
    public final boolean method489(int arg0) {
        int var2 = 114 % ((23 - arg0) / 62);
        ++field3693;
        return this.field3687.method1680(-1);
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(ILya;)V", line = 132)
    public final void method493(int arg0, class38 arg1) {
        ++field3691;
        if (arg0 <= -114) {
            class471 var3 = this.field3687.method1687((byte) 56, true, true, super.field1749, super.field1752, arg1, 262144);
            if (var3 != null) {
                int var4 = super.field1749 >> 7;
                int var5 = super.field1752 >> 7;
                this.field3687.method1681(false, var5, arg1, var4, var4, var5, var3, (byte) 72);
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "(I)Z", line = 154)
    public final boolean method492(int arg0) {
        if (arg0 != -1) {
            this.method496(10);
        }
        ++field3699;
        return false;
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lya;Ljo;IIIIIZII)V", line = 165)
    public class267(class38 arg0, class220 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field3091, arg1.field3070);
        this.field3687 = new class283(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field3702 = arg1.field3119 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZILya;I)Z", line = 175)
    public final boolean method500(boolean arg0, int arg1, class38 arg2, int arg3) {
        ++field3681;
        class471 var5 = this.field3687.method1687((byte) 56, false, false, super.field1749, super.field1752, arg2, 131072);
        if (var5 == null) {
            return false;
        } else if (!arg0) {
            return false;
        } else {
            class122 var6 = arg2.method280();
            var6.method182(super.field1749, super.field1748, super.field1752);
            return var5.method391(arg3, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V", line = 196)
    public final void method485(int arg0) {
        ++field3680;
        if (arg0 >= -92) {
            method1600(-47, -5);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lya;B)Lmf;", line = 206)
    public final class289 method484(class38 arg0, byte arg1) {
        ++field3684;
        class471 var3 = this.field3687.method1687((byte) 56, true, false, super.field1749, super.field1752, arg0, 2048);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 <= 111) {
                this.method485(-108);
            }
            class122 var4 = arg0.method280();
            var4.method182(super.field1749, super.field1748, super.field1752);
            class289 var5 = null;
            if (this.field3702) {
                var5 = class165.method1099(true, 1);
            }
            if (this.field3687.field3874 == null) {
                var3.method397(var4, var5 != null ? var5.field4009[0] : null, 0);
            } else {
                class523 var6 = this.field3687.field3874.method1193();
                arg0.method312(var3, var6, var4, var5 == null ? null : var5.field4009[0], 0);
            }
            int var7 = super.field1749 >> 7;
            int var8 = super.field1752 >> 7;
            this.field3687.method1681(true, var8, arg0, var7, var7, var8, var3, (byte) 72);
            return var5;
        }
    }

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "(I)I", line = 247)
    public final int method499(int arg0) {
        if (arg0 != -15561) {
            return 7;
        } else {
            ++field3690;
            return this.field3687.field3891;
        }
    }

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "(I)V", line = 258)
    public final void method495(int arg0) {
        if (arg0 >= -104) {
            this.method489(6);
        }
        ++field3685;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)I", line = 273)
    public final int method490(int arg0) {
        ++field3689;
        if (arg0 != -29679) {
            this.field3687 = null;
        }
        return this.field3687.field3887;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(ILya;)V", line = 292)
    public final void method486(int arg0, class38 arg1) {
        if (arg0 != 9229) {
            this.field3687 = null;
        }
        ++field3686;
        this.field3687.method1679((byte) -113, arg1);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)I", line = 304)
    public final int method496(int arg0) {
        ++field3698;
        int var2 = 57 / ((arg0 - -4) / 61);
        return this.field3687.field3872;
    }
}
