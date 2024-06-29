import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class84 extends class212 {

    @OriginalMember(owner = "client!v", name = "V", descriptor = "S")
    public static short field1334 = 1;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "[Lad;")
    private class22[] field1333;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "[[[Lfa;")
    public static class220[][][] field1339;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
    public static void method567(byte arg0) {
        field1339 = null;
        if (arg0 != -124) {
            field1339 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII[Ljc;II[BIZ)V")
    public static final void method568(int arg0, int arg1, int arg2, int arg3, int arg4, class8[] arg5, int arg6, int arg7, byte[] arg8, int arg9, boolean arg10) {
        ++field1341;
        class230 var11 = new class230(arg8);
        if (arg9 != 75) {
            field1339 = null;
        }
        int var12 = -1;
        while (true) {
            int var13 = var11.method1567((byte) 85);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1517(false);
                if (~var15 == -1) {
                    break;
                }
                var14 += var15 + -1;
                int var16 = var14 >> 12;
                int var17 = 63 & var14;
                int var18 = var14 >> 6 & 63;
                int var19 = var11.method1516((byte) 82);
                int var20 = var19 & 3;
                int var21 = var19 >> 2;
                if (~arg2 == ~var16 && var18 >= arg1 && ~var18 > ~(arg1 + 8) && arg4 <= var17 && ~var17 > ~(arg4 + 8)) {
                    class148 var22 = class62.method442((byte) 79, var12);
                    int var23 = arg0 + class106.method712(var22.field2466, 7 & var18, var22.field2433, var17 & 7, var20, 0, arg6);
                    int var24 = arg7 + class107.method720((byte) 48, arg6, var22.field2466, var22.field2433, var20, 7 & var18, 7 & var17);
                    if (~var23 < -1 && ~var24 < -1 && ~var23 > -104 && var24 < 103) {
                        class8 var25 = null;
                        if (!arg10) {
                            int var26 = arg3;
                            if ((class70.field1129[1][var23][var24] & 2) == 2) {
                                var26 = arg3 - 1;
                            }
                            if (~var26 <= -1) {
                                var25 = arg5[var26];
                            }
                        }
                        class42.method295(var12, var25, arg10, var21, -88, arg3, var23, 3 & arg6 + var20, var24, !arg10, arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class84() {
        super(0, true);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        ++field1340;
        if (arg2 != -3) {
            field1334 = 30;
        }
        if (arg1 == 0) {
            this.field1333 = new class22[arg0.method1516((byte) 82)];
            for (int var4 = 0; var4 < this.field1333.length; ++var4) {
                int var5 = arg0.method1516((byte) 82);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field1333[var4] = class238.method1628(arg0, (byte) -127);
                            }
                        } else {
                            this.field1333[var4] = class162.method1083(arg0, 5660);
                        }
                    } else {
                        this.field1333[var4] = class198.method1342(arg0, false);
                    }
                } else {
                    this.field1333[var4] = class201.method1351(arg0, 2);
                }
            }
        } else if (arg1 == 1) {
            super.field3651 = ~arg0.method1516((byte) 82) == -2;
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
    public static final void method569(byte arg0) {
        if (arg0 <= 87) {
            field1334 = 40;
        }
        ++field1342;
        System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
        System.exit(1);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        int[] var3 = super.field3640.method737(true, arg0);
        ++field1337;
        if (arg1 < 25) {
            field1334 = -14;
        }
        if (super.field3640.field1813) {
            this.method572((byte) 74, super.field3640.method734((byte) 117));
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)I")
    public static final int method571(int arg0) {
        ++field1336;
        if ((double) class108.field1775 == 3.0D) {
            return 37;
        } else if ((double) class108.field1775 == 4.0D) {
            return 50;
        } else if ((double) class108.field1775 == 6.0D) {
            return 75;
        } else {
            return arg0 < 27 ? 111 : 100;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B[[I)V")
    private final void method572(byte arg0, int[][] arg1) {
        ++field1335;
        int var3 = class26.field452;
        if (arg0 <= 23) {
            field1339 = null;
        }
        int var4 = class97.field1577;
        class211.method1401(arg1, 128);
        class208.method1379(0, 0, class4.field90, 0, class186.field3300);
        if (this.field1333 != null) {
            for (int var5 = 0; ~var5 > ~this.field1333.length; ++var5) {
                class22 var6 = this.field1333[var5];
                int var7 = var6.field387;
                int var8 = var6.field389;
                if (~var7 > -1) {
                    if (var8 >= 0) {
                        var6.method202(var3, -1, var4);
                    }
                } else if (~var8 <= -1) {
                    var6.method199(-6474, var3, var4);
                } else {
                    var6.method200(var4, (byte) -102, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)[[I")
    public final int[][] method260(int arg0, int arg1) {
        if (arg1 != 16383) {
            field1339 = null;
        }
        int[][] var3 = super.field3645.method1352(arg0, -117);
        ++field1338;
        if (super.field3645.field3477) {
            int var4 = class26.field452;
            int var5 = class97.field1577;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field3645.method1355(false);
            this.method572((byte) 29, var6);
            for (int var8 = 0; ~class97.field1577 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; class26.field452 > var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class5.method43(var15, 255) << 4;
                    var12[var14] = class5.method43(65280, var15) >> 4;
                    var11[var14] = class5.method43(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }
}
