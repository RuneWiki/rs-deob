import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class647 implements class401 {

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "Lega;")
    public class713 field9128;

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
    public int field9126;

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "I")
    public int field9119;

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
    public int field9123;

    @OriginalMember(owner = "client!lca", name = "s", descriptor = "Log;")
    public class651 field9132;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "I")
    public int field9115;

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "I")
    public int field9117;

    @OriginalMember(owner = "client!lca", name = "v", descriptor = "I")
    public int field9135;

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "Ljava/lang/String;")
    public String field9121;

    @OriginalMember(owner = "client!lca", name = "r", descriptor = "I")
    public int field9131;

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
    public int field9120;

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "I")
    public int field9129;

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
    public int field9118;

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "S")
    public static short field9116 = 1;

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "Lhe;")
    public static class372 field9122 = new class372(16);

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "I")
    public static int field9114;

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!lca", name = "t", descriptor = "I")
    public static int field9133;

    @OriginalMember(owner = "client!lca", name = "u", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "Lnr;")
    public static class59 field9127;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
    public static final void method3761(int arg0) {
        field9134++;
        class63.field916.method4111(120, 1, class63.field916.field10182);
        class63.field916.method4111(arg0 ^ 0xFFFF91DF, 1, class63.field916.field10204);
        class63.field916.method4111(87, 2, class63.field916.field10199);
        class63.field916.method4111(78, 2, class63.field916.field10203);
        class63.field916.method4111(119, 1, class63.field916.field10193);
        class63.field916.method4111(79, 1, class63.field916.field10207);
        class63.field916.method4111(77, 1, class63.field916.field10165);
        class63.field916.method4111(87, 1, class63.field916.field10170);
        class63.field916.method4111(111, 1, class63.field916.field10205);
        class63.field916.method4111(121, 1, class63.field916.field10162);
        class63.field916.method4111(arg0 + 28393, 2, class63.field916.field10185);
        class63.field916.method4111(62, 1, class63.field916.field10175);
        class63.field916.method4111(119, 2, class63.field916.field10166);
        class63.field916.method4111(82, 1, class63.field916.field10209);
        class63.field916.method4111(97, 0, class63.field916.field10196);
        class63.field916.method4111(71, 0, class63.field916.field10183);
        class63.field916.method4111(69, 2, class63.field916.field10174);
        class63.field916.method4111(98, 0, class63.field916.field10198);
        class63.field916.method4111(104, 0, class63.field916.field10201);
        class115.method851(true);
        class63.field916.method4111(arg0 + 28362, 0, class63.field916.field10160);
        if (arg0 != -28280) {
            field9116 = -88;
        }
        class63.field916.method4111(84, 4, class63.field916.field10176);
        class438.method2708(false);
        class608.method3528(1);
        class424.field6300 = true;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I[BI)[B")
    public static final byte[] method3762(int arg0, byte[] arg1, int arg2) {
        if (arg2 <= 84) {
            field9122 = null;
        }
        field9114++;
        byte[] var3 = new byte[arg0];
        class319.method2022(arg1, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IB)[B")
    public static final byte[] method3763(int arg0, byte arg1) {
        field9124++;
        class679 var2 = (class679) class365.field5275.method2515((long) arg0, (byte) -124);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class162.method1180(var4, var7, -116);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class679(var3);
            class365.field5275.method2518((long) arg0, 22363, var2);
        }
        return arg1 <= 107 ? null : var2.field9437;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)Lio;")
    public final class439 method69(byte arg0) {
        int var2 = -45 % ((arg0 + 69) / 39);
        field9133++;
        return class457.field6746;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILvd;I)Lhia;")
    public static final class66 method3764(int arg0, class39 arg1, int arg2) {
        field9130++;
        if (arg2 == 0) {
            byte[] var3 = arg1.method226(arg2 ^ 0x49, arg0);
            return var3 == null ? null : new class66(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lns;IIII)V")
    public static final void method3765(class405 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 14336) {
            return;
        }
        field9125++;
        class264 var5 = arg0.method2577(-1);
        int var6 = arg0.field6085 - arg0.field6110.field1382 & 0x3FFF;
        if (arg2 == -1) {
            if (var6 != 0 || arg0.field6069 > 25) {
                if (arg1 < 0 && var5.field3760 != -1) {
                    arg0.field6123 = var5.field3760;
                    arg0.field6032 = false;
                } else if (arg1 <= 0 || var5.field3744 == -1) {
                    arg0.field6123 = var5.field3782;
                } else {
                    arg0.field6123 = var5.field3744;
                }
                arg0.field6032 = false;
            } else if (!arg0.field6032 || !var5.method1698(-99, arg0.field6123)) {
                arg0.field6123 = var5.method1699(false);
                arg0.field6032 = arg0.field6123 != -1;
            }
        } else if (arg0.field6125 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class288.field4085[arg3] - arg0.field6110.field1382 & 0x3FFF;
            if (arg2 == 2 && var5.field3740 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field3759 != -1) {
                    arg0.field6123 = var5.field3759;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field3747 != -1) {
                    arg0.field6123 = var5.field3747;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field3764 == -1) {
                    arg0.field6123 = var5.field3740;
                } else {
                    arg0.field6123 = var5.field3764;
                }
            } else if (arg2 == 0 && var5.field3763 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field3738 != -1) {
                    arg0.field6123 = var5.field3738;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field3762 != -1) {
                    arg0.field6123 = var5.field3762;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field3779 == -1) {
                    arg0.field6123 = var5.field3763;
                } else {
                    arg0.field6123 = var5.field3779;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field3743 != -1) {
                arg0.field6123 = var5.field3743;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field3742 != -1) {
                arg0.field6123 = var5.field3742;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field3732 == -1) {
                arg0.field6123 = var5.field3782;
            } else {
                arg0.field6123 = var5.field3732;
            }
            arg0.field6032 = false;
        } else if (var6 == 0 && arg0.field6069 <= 25) {
            if (arg2 == 2 && var5.field3740 != -1) {
                arg0.field6123 = var5.field3740;
            } else if (arg2 == 0 && var5.field3763 != -1) {
                arg0.field6123 = var5.field3763;
            } else {
                arg0.field6123 = var5.field3782;
            }
            arg0.field6032 = false;
        } else {
            if (arg2 == 2 && var5.field3740 != -1) {
                if (arg1 < 0 && var5.field3756 != -1) {
                    arg0.field6123 = var5.field3756;
                } else if (arg1 <= 0 || var5.field3733 == -1) {
                    arg0.field6123 = var5.field3740;
                } else {
                    arg0.field6123 = var5.field3733;
                }
            } else if (arg2 == 0 && var5.field3763 != -1) {
                if (arg1 < 0 && var5.field3768 != -1) {
                    arg0.field6123 = var5.field3768;
                } else if (arg1 <= 0 || var5.field3757 == -1) {
                    arg0.field6123 = var5.field3763;
                } else {
                    arg0.field6123 = var5.field3757;
                }
            } else if (arg1 < 0 && var5.field3735 != -1) {
                arg0.field6123 = var5.field3735;
            } else if (arg1 <= 0 || var5.field3754 == -1) {
                arg0.field6123 = var5.field3782;
            } else {
                arg0.field6123 = var5.field3754;
            }
            arg0.field6032 = false;
        }
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V")
    public static void method3766(int arg0) {
        field9122 = null;
        field9127 = null;
        if (arg0 != -14531) {
            field9122 = null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Ljava/lang/String;Log;Lega;IIIIIIIIII)V")
    public class647(String arg0, class651 arg1, class713 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field9128 = arg2;
        this.field9126 = arg9;
        this.field9119 = arg11;
        this.field9123 = arg6;
        this.field9132 = arg1;
        this.field9115 = arg5;
        this.field9117 = arg12;
        this.field9135 = arg7;
        this.field9121 = arg0;
        this.field9131 = arg3;
        this.field9120 = arg8;
        this.field9129 = arg4;
        this.field9118 = arg10;
    }
}
