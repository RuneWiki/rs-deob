import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class474 extends class214 {

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    private int field6879 = -1;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "Ltm;")
    public static class334 field6878 = new class334(31, 11);

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "Lwk;")
    public static class430 field6883 = new class430(2, 7);

    @OriginalMember(owner = "client!m", name = "R", descriptor = "[B")
    public static byte[] field6884 = new byte[520];

    @OriginalMember(owner = "client!m", name = "S", descriptor = "[I")
    public static int[] field6885 = new int[32];

    @OriginalMember(owner = "client!m", name = "D", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public int field6880;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public int field6882;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "[I")
    public int[] field6872;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(II)[[I", line = 6)
    public int[][] method62(int arg0, int arg1) {
        ++field6873;
        int[][] var3 = super.field3545.method2996((byte) 119, arg0);
        if (super.field3545.field7147 && this.method2882((byte) -117)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class259.field4054 != this.field6882 ? this.field6882 * arg0 / class259.field4054 : arg0) * this.field6880;
            if (class626.field8787 == this.field6880) {
                for (int var8 = 0; var8 < class626.field8787; ++var8) {
                    int var9 = this.field6872[var7++];
                    var6[var8] = class636.method3603(var9 << 4, 4080);
                    var5[var8] = class636.method3603(var9 >> 4, 4080);
                    var4[var8] = class636.method3603(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; class626.field8787 > var10; ++var10) {
                    int var11 = this.field6880 * var10 / class626.field8787;
                    int var12 = this.field6872[var7 + var11];
                    var6[var10] = class636.method3603(4080, var12 << 4);
                    var5[var10] = class636.method3603(var12 >> 4, 4080);
                    var4[var10] = class636.method3603(4080, var12 >> 12);
                }
            }
        }
        if (arg1 != -256) {
            field6885 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V", line = 76)
    public class474() {
        super(0, false);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)I", line = 82)
    public static final int method2880(int arg0, int arg1, int arg2, int arg3) {
        ++field6875;
        if (~(class434.field6341[arg3][arg0][arg2] & 8) != -1) {
            return 0;
        } else if (arg1 != 1) {
            return -8;
        } else {
            return arg3 > 0 && ~(class434.field6341[1][arg0][arg2] & 2) != -1 ? arg3 - 1 : arg3;
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(B)V", line = 102)
    public static void method2881(byte arg0) {
        field6878 = null;
        field6884 = null;
        field6885 = null;
        field6883 = null;
        if (arg0 < 124) {
            field6885 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)I", line = 116)
    public final int method1543(byte arg0) {
        if (arg0 != 121) {
            this.method1543((byte) 57);
        }
        ++field6871;
        return this.field6879;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILofa;I)V", line = 127)
    public final void method59(int arg0, class301 arg1, int arg2) {
        ++field6876;
        if (~arg2 == -1) {
            this.field6879 = arg1.method1989((byte) -62);
        }
        if (arg0 <= 92) {
            this.field6872 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(B)Z", line = 140)
    public final boolean method2882(byte arg0) {
        ++field6874;
        if (this.field6872 != null) {
            return true;
        } else if (this.field6879 >= 0) {
            class726 var2 = class24.field237 < 0 ? class726.method4014(class135.field2158, this.field6879) : class726.method4002(class135.field2158, class24.field237, this.field6879);
            var2.method4007();
            this.field6872 = var2.method4003();
            this.field6880 = var2.field10184;
            this.field6882 = var2.field10186;
            return true;
        } else {
            if (arg0 != -117) {
                this.method59(35, (class301) null, 98);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 169)
    public final void method1542(int arg0) {
        ++field6870;
        super.method1542(arg0);
        this.field6872 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([Ljava/lang/String;III[S)V", line = 186)
    public static final void method2883(String[] arg0, int arg1, int arg2, int arg3, short[] arg4) {
        if (~arg2 > ~arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg2;
            String var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var8;
            for (int var9 = arg2; ~var9 > ~arg1; ++var9) {
                if (var7 == null || arg0[var9] != null && arg0[var9].compareTo(var7) < (var9 & 1)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var8;
            method2883(arg0, var6 + -1, arg2, arg3, arg4);
            method2883(arg0, arg1, var6 + 1, 997871940, arg4);
        }
        if (arg3 != 997871940) {
            method2881((byte) -118);
        }
        ++field6877;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lmw;ILha;)I", line = 241)
    public static final int method2884(class658 arg0, int arg1, class544 arg2) {
        ++field6881;
        if (arg0.field9359 == -1) {
            if (arg0.field9374 != -1) {
                class569 var3 = arg2.field7764.method1774(72, arg0.field9374);
                if (!var3.field8062) {
                    return var3.field8071;
                }
            }
            int var4 = 23 % ((arg1 - 84) / 41);
            return arg0.field9372;
        } else {
            return arg0.field9359;
        }
    }
}
