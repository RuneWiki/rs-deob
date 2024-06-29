import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class100 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "[S")
    public static short[] field1455 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field1454 = -1;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field1459 = new String[100];

    @OriginalMember(owner = "client!b", name = "k", descriptor = "[I")
    public static int[] field1464 = new int[] { 4, 3, 0, 0, 6, 0, 6, 0, 7, -2, 0, 0, 0, 0, 14, 1, 0, 0, 28, 0, -1, -2, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 10, 0, 0, 3, 0, 0, 0, 0, 2, 15, 0, 0, -2, 6, 8, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, -2, 0, 0, 8, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 6, 6, 0, 0, 2, 0, 0, 2, 6, 8, 0, -1, 0, 3, 0, 0, 0, 6, 12, 0, 5, 2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 3, -2, 10, -2, 0, -2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 2, 0, -1, 0, 0, 0, 3, 12, 2, 0, 0, 1, 0, 0, -1, 8, 0, 0, 3, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, -1, -2, 9, 0, 6, 7, 0, 12, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 7, 0, 8, 0, 0, 0, 0, 0, 0, 11, 3, -2, 8, 0, 10, -2, 0, 0, 0, 0, 0, 0, 0, -1, 20, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 5, -1, 0, 0, 0, 4, 0, 0, 0, 6, 0, 0, 15, 1, 0, -2, 7, 1, 0, 14, 8, 0, -1, 0, 3, 1, 0, 5, -1, 2, 0, 0, 8, 0, 0, 12, 0, 4, 0, 0, 0, 17, 8 };

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Z")
    public static boolean field1466;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "[Lbf;")
    public static class58[] field1463;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 6)
    public static final void method687(int arg0) {
        field1467++;
        if (!class232.field3690 || class54.field768) {
            return;
        }
        class204[][][] var1 = class324.field5032;
        for (int var2 = arg0; var2 < var1.length; var2++) {
            class204[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class204 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field3347 != null && var6.field3347.field1728 instanceof class163) {
                            class163 var7 = (class163) var6.field3347.field1728;
                            if ((Long.MIN_VALUE & var6.field3347.field1729) == 0L) {
                                var7.method1149(false, true, true, true, false, true, true);
                            } else {
                                var7.method1149(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field3342 != null) {
                            if (var6.field3342.field485 instanceof class163) {
                                class163 var8 = (class163) var6.field3342.field485;
                                if ((Long.MIN_VALUE & var6.field3342.field488) == 0L) {
                                    var8.method1149(false, true, true, true, false, true, true);
                                } else {
                                    var8.method1149(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field3342.field494 instanceof class163) {
                                class163 var9 = (class163) var6.field3342.field494;
                                if ((Long.MIN_VALUE & var6.field3342.field488) == 0L) {
                                    var9.method1149(false, true, true, true, false, true, true);
                                } else {
                                    var9.method1149(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field3364 != null) {
                            if (var6.field3364.field3599 instanceof class163) {
                                class163 var10 = (class163) var6.field3364.field3599;
                                if ((var6.field3364.field3595 & Long.MIN_VALUE) == 0L) {
                                    var10.method1149(false, true, true, true, false, true, true);
                                } else {
                                    var10.method1149(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field3364.field3594 instanceof class163) {
                                class163 var11 = (class163) var6.field3364.field3594;
                                if ((var6.field3364.field3595 & Long.MIN_VALUE) == 0L) {
                                    var11.method1149(false, true, true, true, false, true, true);
                                } else {
                                    var11.method1149(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field3360; var12++) {
                            if (var6.field3343[var12].field2373 instanceof class163) {
                                class163 var13 = (class163) var6.field3343[var12].field2373;
                                if ((var6.field3343[var12].field2358 & Long.MIN_VALUE) == 0L) {
                                    var13.method1149(false, true, true, true, false, true, true);
                                } else {
                                    var13.method1149(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class54.field768 = true;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)V", line = 146)
    public static final void method688(int arg0, int arg1) {
        field1468++;
        class90.field1246.method708(arg1, true);
        if (arg0 != 38) {
            method690((byte) -52, (short) 34);
        }
        class207.field3409.method708(arg1, true);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)Loc;", line = 160)
    public static final class291 method689(boolean arg0, int arg1) {
        if (arg0) {
            return (class291) null;
        } else {
            field1456++;
            return (class291) class33.field448.method451((long) arg1, (byte) 100);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BS)Z", line = 174)
    public static final boolean method690(byte arg0, short arg1) {
        field1461++;
        if (arg0 <= 70) {
            return true;
        } else if (arg1 == 15 || arg1 == 2 || arg1 == 22 || arg1 == 26 || arg1 == 45 || arg1 == 31 || arg1 == 18 || arg1 == 49) {
            return true;
        } else if (arg1 == 29 || arg1 == 50 || arg1 == 1006 || arg1 == 1004) {
            return true;
        } else if (arg1 == 8 || arg1 == 10 || arg1 == 3 || arg1 == 57 || arg1 == 17) {
            return true;
        } else {
            return arg1 == 47 || arg1 == 46 || arg1 == 38 || arg1 == 43 || arg1 == 16 || arg1 == 13;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lak;ZILak;)V", line = 204)
    public static final void method691(class172 arg0, boolean arg1, int arg2, class172 arg3) {
        class94.field1285 = arg0;
        class256.field4068 = arg3;
        class285.field4581 = arg1;
        if (arg2 > -36) {
            field1466 = true;
        }
        field1462++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lak;BLq;Lak;Z)V", line = 217)
    public static final void method692(class172 arg0, byte arg1, class345 arg2, class172 arg3, boolean arg4) {
        field1465++;
        class214.field3493 = arg3;
        class5.field82 = arg4;
        class112.field1698 = arg0;
        int var5 = class214.field3493.method1291(5362) - 1;
        class200.field3258 = class214.field3493.method1299(var5, (byte) 97) + var5 * 256;
        class48.field667 = arg2;
        int var6 = 104 / ((49 - arg1) / 57);
        class127.field1974 = new String[] { null, null, class127.field1980, null, null };
        class340.field5290 = new String[] { null, null, null, null, class58.field820 };
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)V", line = 251)
    public static final void method693(byte arg0, int arg1) {
        field1457++;
        if (arg1 == -1 || !class263.method1875(53, arg1)) {
            return;
        }
        class157[] var2 = class221.field3547[arg1];
        int var3 = 0;
        if (arg0 < 56) {
            field1455 = (short[]) null;
        }
        while (var3 < var2.length) {
            class157 var4 = var2[var3];
            if (var4.field2430 != null) {
                class39 var5 = new class39();
                var5.field501 = var4.field2430;
                var5.field500 = var4;
                class286.method2058(2000000, 44, var5);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V", line = 298)
    public static void method694(byte arg0) {
        if (arg0 >= -17) {
            field1454 = 87;
        }
        field1455 = null;
        field1459 = null;
        field1464 = null;
        field1463 = null;
    }
}
