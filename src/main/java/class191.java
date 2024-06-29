import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class191 extends class23 implements class115 {

    @OriginalMember(owner = "client!jda", name = "E", descriptor = "Lfba;")
    public class23 field2703;

    @OriginalMember(owner = "client!jda", name = "C", descriptor = "Lcba;")
    public static class471 field2701 = new class471(75, 10);

    @OriginalMember(owner = "client!jda", name = "v", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!jda", name = "w", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!jda", name = "x", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!jda", name = "y", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!jda", name = "z", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!jda", name = "A", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!jda", name = "B", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!jda", name = "D", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!jda", name = "F", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!jda", name = "H", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!jda", name = "I", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!jda", name = "J", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!jda", name = "K", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!jda", name = "L", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!jda", name = "M", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!jda", name = "N", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!jda", name = "O", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!jda", name = "P", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!jda", name = "Q", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lqa;B)V")
    public final void method487(class207 arg0, byte arg1) {
        field2696++;
        if (arg1 != 21) {
            this.method748(true);
        }
    }

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)Z")
    public final boolean method747(int arg0) {
        if (arg0 == -23611) {
            field2695++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "(I)I")
    public final int method259(int arg0) {
        field2697++;
        return arg0 <= 102 ? -80 : 0;
    }

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "(I)V")
    public static void method1186(int arg0) {
        if (arg0 != 31243) {
            field2699 = -8;
        }
        field2701 = null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V")
    public final void method750(int arg0) {
        field2710++;
        if (arg0 <= 88) {
            field2699 = 73;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(III)Z")
    public static final boolean method1187(int arg0, int arg1, int arg2) {
        if (arg0 != -30788) {
            method1190((byte) 10, -3, -63);
        }
        field2708++;
        return (arg2 & 0x70000) != 0 | class192.method1192(2, arg1, arg2) || class6.method39(-50, arg2, arg1);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BLqa;)V")
    public final void method746(byte arg0, class207 arg1) {
        if (arg0 >= -50) {
            this.field2703 = null;
        }
        field2707++;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILqa;)V")
    public final void method751(int arg0, class207 arg1) {
        field2706++;
        if (arg0 >= 0) {
            this.method259(125);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BLqa;I)Lr;")
    public final class157 method744(byte arg0, class207 arg1, int arg2) {
        field2694++;
        int var4 = 76 % ((arg0 + 54) / 60);
        return null;
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)I")
    public final int method749(int arg0) {
        field2709++;
        return arg0 == 24194 ? 0 : -128;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIBILr;IIIILqa;IIILdba;I)Lr;")
    public static final class157 method1188(int arg0, int arg1, byte arg2, int arg3, class157 arg4, int arg5, int arg6, int arg7, int arg8, class207 arg9, int arg10, int arg11, int arg12, class78 arg13, int arg14) {
        field2702++;
        if (arg4 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg13 != null) {
            int var16 = var15 | arg13.method603(arg2 ^ 0x17, -1, false, arg3);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg14 << 32) + (long) ((arg0 << 24) + (arg12 + (arg7 << 16))) + ((long) arg1 << 48);
        class571 var19 = class263.field3675;
        class157 var20;
        synchronized (class263.field3675) {
            var20 = (class157) class263.field3675.method3252(var17, (byte) -76);
        }
        if (var20 == null || arg9.method1357(var20.method166(), var15) != 0) {
            if (var20 != null) {
                var15 = arg9.method1306(var15, var20.method166());
            }
            byte var21;
            if (arg12 == 1) {
                var21 = 9;
            } else if (arg12 == 2) {
                var21 = 12;
            } else if (arg12 == 3) {
                var21 = 15;
            } else if (arg12 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class317 var24 = new class317(var21 * var22 + 1, var22 * 2 * var21 - var21, 0);
            int var25 = var24.method1980(0, 0, (byte) -49, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class1.field2[var31] * var28 >> 15;
                    int var33 = class1.field7[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method1980(var32, var33, (byte) -49, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg0 * var35 + arg7 * var36 >> 8);
                short var38 = (short) (((arg1 & 0x380) * var35 + (arg14 & 0x380) * var36 & 0x38000) + ((arg1 & 0xFC00) * var35 + (arg14 & 0xFC00) * var36 & 0xFC0000) + ((arg1 & 0x7F) * var35 + (arg14 & 0x7F) * var36 & 0x7F00) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method1974(arg2 + 98, var26[0][var39], var37, (short) -1, var38, (byte) 1, var25, var26[0][(var39 + 1) % var21], (byte) -1);
                    } else {
                        var24.method1974(-103, var26[var34][(var39 + 1) % var21], var37, (short) -1, var38, (byte) 1, var26[var34 - 1][var39], var26[var34 - 1][(var39 + 1) % var21], (byte) -1);
                        var24.method1974(-121, var26[var34][var39], var37, (short) -1, var38, (byte) 1, var26[var34 - 1][var39], var26[var34][(var39 + 1) % var21], (byte) -1);
                    }
                }
            }
            var20 = arg9.method1293(var24, var15, class619.field8860, 64, 768);
            class571 var40 = class263.field3675;
            synchronized (class263.field3675) {
                class263.field3675.method3243(var20, var17, arg2 ^ 0xFFFFFFAF);
            }
        }
        int var41 = (arg12 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg6 != 0) {
            if ((arg6 & 0x2) != 0) {
                var43 -= 128;
            }
            if ((arg6 & 0x4) != 0) {
                var44 = var41 + 128;
            }
            if ((arg6 & 0x1) != 0) {
                var45 = var41 + 128;
            }
            if ((arg6 & 0x8) != 0) {
                var42 -= 128;
            }
        }
        int var46 = arg4.method139();
        int var47 = arg4.method148();
        int var48 = arg4.method135();
        int var49 = arg4.method151();
        if (var48 < var43) {
            var48 = var43;
        }
        if (var47 > var44) {
            var47 = var44;
        }
        if (var46 < var42) {
            var46 = var42;
        }
        if (arg2 != -127) {
            method1186(-70);
        }
        if (var45 < var49) {
            var49 = var45;
        }
        class353 var50 = null;
        if (arg13 != null) {
            int var51 = arg13.field1261[arg3];
            var50 = class331.field4418.method194(var51 >> 16, false);
            arg3 = var51 & 0xFFFF;
        }
        class157 var52;
        if (var50 == null) {
            var52 = var20.method163((byte) 3, var15, true);
            var52.method162(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method152(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method163((byte) 3, var15, true);
            var52.method162(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method152(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method1018(-1, arg3, var50);
        }
        if (arg8 != 0) {
            var52.method155(arg8);
        }
        if (arg10 != 0) {
            var52.method141(arg10);
        }
        if (arg11 != 0) {
            var52.method152(0, arg11, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIII)V")
    public static final void method1189(int arg0, int arg1, int arg2, int arg3) {
        field2705++;
        class524 var4 = class300.field4116[arg2][arg3];
        if (arg1 != -9677) {
            field2699 = 43;
        }
        class612.method3583(arg0, var4 == null ? class425.field6043 : var4, arg1 + 9676);
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(IIIIILfba;)V")
    public class191(int arg0, int arg1, int arg2, int arg3, int arg4, class23 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class601.method3543(arg0, arg1, -10550));
        this.field2703 = arg5;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method488(class207 arg0, int arg1, int arg2, int arg3) {
        field2712++;
        if (arg3 != 1) {
            field2701 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ZLqa;)Lnk;")
    public final class611 method490(boolean arg0, class207 arg1) {
        if (arg0) {
            return null;
        } else {
            field2700++;
            return this.field2703.method490(false, arg1);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Z)I")
    public final int method748(boolean arg0) {
        field2713++;
        if (arg0) {
            field2699 = -49;
        }
        return 0;
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(Z)I")
    public final int method752(boolean arg0) {
        if (!arg0) {
            this.method259(-34);
        }
        field2698++;
        return 0;
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(ZLqa;)Lvw;")
    public final class254 method483(boolean arg0, class207 arg1) {
        if (!arg0) {
            this.field2703 = null;
        }
        field2714++;
        return null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BII)Z")
    public static final boolean method1190(byte arg0, int arg1, int arg2) {
        field2711++;
        if (!class644.method3712(arg2, (byte) 7, arg1)) {
            return false;
        } else if (arg0 == -25) {
            return (arg1 & 0xB000) != 0 | class100.method717(arg1, -5569, arg2) | class26.method295(false, arg1, arg2) ? true : (class490.method2845(126, arg2, arg1) | class304.method1931(65536, arg1, arg2)) & (arg2 & 0x37) == 0;
        } else {
            return false;
        }
    }
}
