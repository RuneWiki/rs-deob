import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class203 extends class13 {

    @OriginalMember(owner = "client!qe", name = "ob", descriptor = "I")
    public static int field3687 = 0;

    @OriginalMember(owner = "client!qe", name = "rb", descriptor = "Lhh;")
    private static class163 field3690 = class137.method1065(" has logged out)3", 17);

    @OriginalMember(owner = "client!qe", name = "qb", descriptor = "Lhh;")
    public static class163 field3689 = field3690;

    @OriginalMember(owner = "client!qe", name = "pb", descriptor = "[S")
    public static short[] field3688 = new short[256];

    @OriginalMember(owner = "client!qe", name = "jb", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!qe", name = "lb", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!qe", name = "mb", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!qe", name = "nb", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!qe", name = "tb", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!qe", name = "sb", descriptor = "Lki;")
    public static class184 field3691;

    @OriginalMember(owner = "client!qe", name = "kb", descriptor = "[[[S")
    public static short[][][] field3683;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIILra;Ltc;IIIIZIII)Lra;")
    public static final class70 method1448(int arg0, int arg1, int arg2, int arg3, class70 arg4, class18 arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11, int arg12, int arg13) {
        ++field3682;
        long var14 = ((long) arg7 << 32) + ((long) arg11 << 48) + (long) ((arg6 << 16) + arg13 - -(arg12 << 24));
        class70 var16 = (class70) client.field2001.method114(var14, arg8 + 24403);
        if (var16 == null) {
            int[] var17 = new int[] { 64, 96, 128 };
            byte var18 = 3;
            byte var19;
            if (arg13 != 1) {
                if (~arg13 != -3) {
                    if (arg13 == 3) {
                        var19 = 15;
                    } else if (arg13 != 4) {
                        var19 = 21;
                    } else {
                        var19 = 18;
                    }
                } else {
                    var19 = 12;
                }
            } else {
                var19 = 9;
            }
            class41 var20 = new class41(var18 * var19 + 1, var18 * var19 * 2 - var19, 0);
            int var21 = var20.method303(0, 0, 0);
            int[][] var22 = new int[var18][var19];
            for (int var23 = 0; var18 > var23; ++var23) {
                int var30 = var17[var23];
                int var31 = var17[var23];
                for (int var32 = 0; var32 < var19; ++var32) {
                    int var33 = (var32 << 11) / var19;
                    int var34 = class98.field1839[var33] * var30 + arg1 >> 16;
                    int var35 = class98.field1843[var33] * var31 + arg3 >> 16;
                    var22[var23][var32] = var20.method303(var34, 0, var35);
                }
            }
            for (int var24 = 0; ~var24 > ~var18; ++var24) {
                int var25 = (var24 * 256 - -128) / var18;
                int var26 = -var25 + 256;
                byte var27 = (byte) (arg6 * var26 + arg12 * var25 >> 8);
                short var28 = (short) (((896 & arg7) * var26 + (arg11 & 896) * var25 & 229376) + ((64512 & arg7) * var26 + (arg11 & 64512) * var25 & 16515072) + ((127 & arg7) * var26 + (127 & arg11) * var25 & 32512) >> 8);
                for (int var29 = 0; ~var29 > ~var19; ++var29) {
                    if (~var24 == -1) {
                        var20.method283(var21, var22[0][(var29 + 1) % var19], var22[0][var29], (byte) 1, var28, var27);
                    } else {
                        var20.method283(var22[var24 + -1][var29], var22[var24 + -1][(var29 - -1) % var19], var22[var24][(var29 + 1) % var19], (byte) 1, var28, var27);
                        var20.method283(var22[var24 + -1][var29], var22[var24][(var29 + 1) % var19], var22[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var20.method289(64, 768, -50, -10, -50);
            client.field2001.method117(var16, false, var14);
        }
        int var36 = arg13 * 64 + -1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = arg4.method510();
        int var41 = var36;
        int var42 = arg4.method509();
        if (arg10) {
            if (~arg9 < -641 && arg9 < 1408) {
                var41 = var36 + 128;
            }
            if (~arg9 < -129 && arg9 < 896) {
                var37 -= 128;
            }
            if (~arg9 < -1153 && arg9 < 1920) {
                var39 = var36 + 128;
            }
            if (arg9 > 1664 || ~arg9 > -385) {
                var38 -= 128;
            }
        }
        if (var37 > var40) {
            var40 = var37;
        }
        if (var39 < var42) {
            var42 = var39;
        }
        int var43 = arg4.method508();
        if (~var43 > ~var38) {
            var43 = var38;
        }
        int var44 = arg4.method513();
        if (arg8 != -24403) {
            return null;
        } else {
            if (var41 < var44) {
                var44 = var41;
            }
            class63 var45 = null;
            if (arg5 != null) {
                int var46 = arg5.field265[arg0];
                var45 = class120.method941(var46 >> 16, 3697);
                arg0 = var46 & 65535;
            }
            class70 var47;
            if (var45 != null) {
                var47 = var16.method514(!var45.method446(arg0, 29255), true);
                var47.method503((var42 - var40) / 2, 128, (-var43 + var44) / 2);
                var47.method504((var40 - -var42) / 2, 0, (var43 - -var44) / 2);
                var47.method496(var45, arg0);
            } else {
                var47 = var16.method514(true, true);
                var47.method503((-var40 + var42) / 2, 128, (-var43 + var44) / 2);
                var47.method504((var40 - -var42) / 2, 0, (var43 + var44) / 2);
            }
            if (~arg9 != -1) {
                var47.method506(arg9);
            }
            class207 var48 = (class207) var47;
            if (arg2 != class127.method1011(arg3 + var43, arg1 + var40, class20.field323, 29908) || class127.method1011(arg3 - -var44, arg1 - -var42, class20.field323, 29908) != arg2) {
                for (int var49 = 0; var48.field3749 > var49; ++var49) {
                    var48.field3742[var49] += class127.method1011(var48.field3732[var49] + arg3, var48.field3751[var49] + arg1, class20.field323, class46.method340(arg8, -11143)) + -arg2;
                }
                var48.field3738 = false;
            }
            return var47;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public static void method1449(boolean arg0) {
        if (!arg0) {
            field3689 = null;
        }
        field3688 = null;
        field3683 = null;
        field3689 = null;
        field3690 = null;
        field3691 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        int[][] var3 = super.field2228.method1304(arg0, (byte) 106);
        if (super.field2228.field3221 && this.method85(0)) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            int var7 = arg0 % super.field208 * super.field208;
            for (int var8 = 0; class143.field2702 > var8; ++var8) {
                int var9 = super.field205[var8 % super.field203 + var7];
                var5[var8] = class7.method50(4080, var9 << 4);
                var4[var8] = class7.method50(65280, var9) >> 4;
                var6[var8] = class7.method50(16711680, var9) >> 12;
            }
        }
        ++field3684;
        if (!arg1) {
            field3687 = 11;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)V")
    public static final void method1450(int arg0, int arg1) {
        class130.field2516.method112(arg1, 109);
        ++field3692;
        if (arg0 != 0) {
            field3683 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(III)Lk;")
    public static final class93 method1451(int arg0, int arg1, int arg2) {
        class144 var3 = class259.field4542[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class93 var4 = var3.field2742;
            var3.field2742 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1452(byte arg0, Component arg1) {
        if (arg0 != 107) {
            field3683 = null;
        }
        arg1.removeMouseListener(class57.field940);
        ++field3686;
        arg1.removeMouseMotionListener(class57.field940);
        arg1.removeFocusListener(class57.field940);
        class39.field646 = 0;
    }
}
