import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class221 extends class68 {

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "[S")
    public static short[] field3306 = new short[500];

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "Llc;")
    public static class86 field3312 = new class86(16);

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
    public static int field3321 = 0;

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "Llc;")
    public static class86 field3319 = new class86(64);

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "F")
    public static float field3310;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!ef", name = "fb", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "Lpa;")
    public static class220 field3320;

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "Lhc;")
    public static class235 field3322;

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "Lhc;")
    public static class235 field3323;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "Lig;")
    public static class9 field3309;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "[Lnc;")
    private class87[] field3315;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZIIZ)V")
    public static final void method1425(boolean arg0, int arg1, int arg2, boolean arg3) {
        int var10002;
        for (int var4 = 0; ~class92.field1283 < ~var4; ++var4) {
            class140 var21 = class119.field1679[class194.field2688[var4]];
            if (var21 != null && var21.method555(true) && var21.field1946.method1913(true)) {
                int var22 = var21.method561(-1);
                if (arg0) {
                    if (!var21.field1946.field4407) {
                        continue;
                    }
                } else if (arg3 == !var21.field1946.field4412 || arg2 != 0 && ~arg2 != ~var22) {
                    continue;
                }
                if (var22 == 1) {
                    if ((127 & var21.field4019) == 64 && ~(var21.field4085 & 127) == -65) {
                        int var23 = var21.field4019 >> 7;
                        int var24 = var21.field4085 >> 7;
                        if (~var23 <= -1 && var23 < 104 && var24 >= 0 && ~var24 > -105) {
                            var10002 = class279.field4324[var23][var24]++;
                        }
                    }
                } else if (((var22 & 1) != 0 || ~(127 & var21.field4019) == -1 && ~(var21.field4085 & 127) == -1) && (~(1 & var22) != -2 || (var21.field4019 & 127) == 64 && ~(127 & var21.field4085) == -65)) {
                    int var25 = -(var22 * 64) + var21.field4085 >> 7;
                    int var26 = -(var22 * 64) + var21.field4019 >> 7;
                    int var27 = var21.method561(-1) + var26;
                    if (var27 > 104) {
                        var27 = 104;
                    }
                    int var28 = var21.method561(-1) + var25;
                    if (var26 < 0) {
                        var26 = 0;
                    }
                    if (var28 > 104) {
                        var28 = 104;
                    }
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    for (int var29 = var26; var27 > var29; ++var29) {
                        for (int var30 = var25; ~var28 < ~var30; ++var30) {
                            var10002 = class279.field4324[var29][var30]++;
                        }
                    }
                }
            }
        }
        ++field3308;
        if (arg1 != 64) {
            field3322 = null;
        }
        label210: for (int var5 = 0; ~class92.field1283 < ~var5; ++var5) {
            class140 var6 = class119.field1679[class194.field2688[var5]];
            long var7 = (long) class194.field2688[var5] << 32 | 536870912L;
            if (var6 != null && var6.method555(true) && var6.field1946.method1913(true)) {
                int var9 = var6.method561(-1);
                if (arg0) {
                    if (!var6.field1946.field4407) {
                        continue;
                    }
                } else if (!arg3 == var6.field1946.field4412 || ~arg2 != -1 && ~arg2 != ~var9) {
                    continue;
                }
                var6.field4063 = true;
                if (~var9 == -2) {
                    if ((127 & var6.field4019) == 64 && ~(var6.field4085 & 127) == -65) {
                        int var10 = var6.field4085 >> 7;
                        int var11 = var6.field4019 >> 7;
                        if (var11 < 0 || var11 >= 104 || var10 < 0 || ~var10 <= -105) {
                            continue;
                        }
                        if (~class279.field4324[var11][var10] < -2) {
                            var10002 = class279.field4324[var11][var10]--;
                            continue;
                        }
                    }
                } else if (~(var9 & 1) == -1 && (var6.field4019 & 127) == 0 && ~(var6.field4085 & 127) == -1 || (var9 & 1) == 1 && ~(127 & var6.field4019) == -65 && (127 & var6.field4085) == 64) {
                    int var12 = -(var9 * 64) + var6.field4019 >> 7;
                    int var13 = var6.field4085 - var9 * 64 >> 7;
                    int var14 = var9 + var12;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    if (~var14 < -105) {
                        var14 = 104;
                    }
                    int var15 = var9 + var13;
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    boolean var16 = true;
                    if (~var15 < -105) {
                        var15 = 104;
                    }
                    for (int var17 = var12; var17 < var14; ++var17) {
                        for (int var20 = var13; ~var20 > ~var15; ++var20) {
                            if (class279.field4324[var17][var20] <= 1) {
                                var16 = false;
                                break;
                            }
                        }
                    }
                    if (var16) {
                        int var18 = var12;
                        while (true) {
                            if (var14 <= var18) {
                                continue label210;
                            }
                            for (int var19 = var13; var15 > var19; ++var19) {
                                var10002 = class279.field4324[var18][var19]--;
                            }
                            ++var18;
                        }
                    }
                }
                if (!var6.field1946.field4416) {
                    var7 |= Long.MIN_VALUE;
                }
                var6.field4063 = false;
                var6.field3987 = class275.method1836(class295.field4642, var6.field4085, var6.field4019, 17);
                class254.method1694(class295.field4642, var6.field4019, var6.field4085, var6.field3987, (var9 + -1) * 64 + 60, var6, var6.field4010, var7, var6.field4003);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)[[I")
    public final int[][] method91(int arg0, byte arg1) {
        ++field3316;
        int var3 = 12 / ((63 - arg1) / 61);
        int[][] var4 = super.field920.method184((byte) -21, arg0);
        if (super.field920.field374) {
            int var5 = class62.field861;
            int var6 = class89.field1248;
            int[][][] var7 = super.field920.method183(0);
            int[][] var8 = new int[var5][var6];
            this.method1428(-73, var8);
            for (int var9 = 0; class62.field861 > var9; ++var9) {
                int[] var10 = var8[var9];
                int[][] var11 = var7[var9];
                int[] var12 = var11[1];
                int[] var13 = var11[2];
                int[] var14 = var11[0];
                for (int var15 = 0; var15 < class89.field1248; ++var15) {
                    int var16 = var10[var15];
                    var13[var15] = class235.method1572(4080, var16 << 4);
                    var12[var15] = class235.method1572(var16 >> 4, 4080);
                    var14[var15] = class235.method1572(4080, var16 >> 12);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        if (arg1 > -118) {
            field3322 = null;
        }
        int[] var3 = super.field917.method1920(arg0, true);
        if (super.field917.field4474) {
            this.method1428(-16, super.field917.method1916(4783));
        }
        ++field3318;
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class221() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (arg2) {
            ++field3311;
            if (~arg1 == -1) {
                this.field3315 = new class87[arg0.method1453((byte) -128)];
                for (int var4 = 0; ~this.field3315.length < ~var4; ++var4) {
                    int var5 = arg0.method1453((byte) -128);
                    if (~var5 != -1) {
                        if (var5 != 1) {
                            if (var5 != 2) {
                                if (~var5 == -4) {
                                    this.field3315[var4] = class275.method1834(arg0, (byte) -110);
                                }
                            } else {
                                this.field3315[var4] = class172.method1127(-1, arg0);
                            }
                        } else {
                            this.field3315[var4] = class111.method716((byte) 46, arg0);
                        }
                    } else {
                        this.field3315[var4] = class191.method1226((byte) -109, arg0);
                    }
                }
            } else if (arg1 == 1) {
                super.field926 = arg0.method1453((byte) -128) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
    public static final void method1426(String arg0, int arg1, Throwable arg2) {
        ++field3317;
        if (arg1 != -1) {
            field3320 = null;
        }
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class241.method1614(arg2, 0);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class297.method1986(var3, 32767);
            String var4 = class213.method1394("%3a", ":", 65408, var3);
            String var5 = class213.method1394("%40", "@", 65408, var4);
            String var6 = class213.method1394("%26", "&", 65408, var5);
            String var7 = class213.method1394("%23", "#", 65408, var6);
            if (class296.field4657.field3715 != null) {
                class117 var8 = class296.field4657.method1642((byte) 85, new URL(class296.field4657.field3715.getCodeBase(), "clienterror.ws?c=" + class226.field3433 + "&u=" + class266.field4042 + "&v1=" + class244.field3719 + "&v2=" + class244.field3727 + "&e=" + var7));
                while (~var8.field1663 == -1) {
                    class28.method182(1L, 124);
                }
                if (~var8.field1663 == -2) {
                    DataInputStream var9 = (DataInputStream) var8.field1665;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(B)V")
    public static void method1427(byte arg0) {
        field3312 = null;
        field3319 = null;
        field3320 = null;
        field3322 = null;
        field3323 = null;
        if (arg0 > 9) {
            field3306 = null;
            field3309 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[[I)V")
    private final void method1428(int arg0, int[][] arg1) {
        ++field3313;
        int var3 = class89.field1248;
        int var4 = class62.field861;
        class179.method1170(1, arg1);
        if (arg0 >= -2) {
            this.method91(37, (byte) 113);
        }
        class249.method1669(class17.field184, 0, class173.field2411, 0, (byte) -127);
        if (this.field3315 != null) {
            for (int var5 = 0; ~var5 > ~this.field3315.length; ++var5) {
                class87 var6 = this.field3315[var5];
                int var7 = var6.field1186;
                int var8 = var6.field1180;
                if (var8 < 0) {
                    if (~var7 <= -1) {
                        var6.method553(var3, true, var4);
                    }
                } else if (var7 < 0) {
                    var6.method548(-73, var3, var4);
                } else {
                    var6.method552(var3, 104, var4);
                }
            }
        }
    }
}
