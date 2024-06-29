import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class294 {

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "Lh;")
    public static class434 field3932 = new class434(19, 0);

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
    public static int field3934 = 0;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "J")
    public static long field3933;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BI)Z", line = 7)
    public static final boolean method1649(byte arg0, int arg1) {
        field3931++;
        if (arg1 == 50 || arg1 == 20 || arg1 == 12 || arg1 == 17 || arg1 == 1004) {
            return true;
        } else if (arg1 == 57 || arg1 == 1010) {
            return true;
        } else {
            if (arg0 <= 92) {
                method1652((byte) 80);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Loe;ZZ)V", line = 26)
    public static final void method1650(class121 arg0, boolean arg1, boolean arg2) {
        field3930++;
        if (!arg2 || class475.field6540 >= 400) {
            return;
        }
        class429 var3 = arg0.field1780;
        if (var3.field5824 != null) {
            var3 = var3.method2531(class38.field562, -63);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field5822) {
            return;
        }
        String var4 = var3.field5849;
        if (var3.field5850 != 0) {
            String var5 = class343.field4601 == class243.field3233 ? class281.field3788.method1176(class110.field1676, (byte) -106) : class447.field6083.method1176(class110.field1676, (byte) -102);
            var4 = var4 + class152.method898(64512, class233.field3103.field6757, var3.field5850) + " (" + var5 + var3.field5850 + ")";
        }
        if (!class289.field3899) {
            if (!arg1) {
                String[] var6 = var3.field5818;
                if (class403.field5535) {
                    var6 = class429.method2533(2800, var6);
                }
                if (var6 != null) {
                    for (int var7 = 4; var7 >= 0; var7--) {
                        if (var6[var7] != null && (class404.field5538 != class343.field4601 || !var6[var7].equalsIgnoreCase(class400.field5507.method1176(class110.field1676, (byte) -127)))) {
                            byte var8 = 0;
                            int var9 = class491.field6868;
                            if (var7 == 0) {
                                var8 = 5;
                            }
                            if (var7 == 1) {
                                var8 = 25;
                            }
                            if (var7 == 2) {
                                var8 = 4;
                            }
                            if (var7 == 3) {
                                var8 = 3;
                            }
                            if (var7 == 4) {
                                var8 = 8;
                            }
                            if (var3.field5812 == var7) {
                                var9 = var3.field5803;
                            }
                            if (var3.field5845 == var7) {
                                var9 = var3.field5817;
                            }
                            class91.field1335++;
                            class402.method2436(-1, true, 0, false, (byte) 115, var6[var7], 0, var8, "<col=ffff00>" + var4, var9, (long) arg0.field1163);
                        }
                    }
                }
                if (class404.field5538 == class343.field4601 && var6 != null) {
                    for (int var10 = 4; var10 >= 0; var10--) {
                        if (var6[var10] != null && var6[var10].equalsIgnoreCase(class400.field5507.method1176(class110.field1676, (byte) -90))) {
                            short var11 = 0;
                            if (class233.field3103.field6757 < var3.field5850) {
                                var11 = 2000;
                            }
                            short var12 = 0;
                            if (var10 == 0) {
                                var12 = 5;
                            }
                            if (var10 == 1) {
                                var12 = 25;
                            }
                            if (var10 == 2) {
                                var12 = 4;
                            }
                            if (var10 == 3) {
                                var12 = 3;
                            }
                            if (var10 == 4) {
                                var12 = 8;
                            }
                            if (var12 != 0) {
                                var12 += var11;
                            }
                            class473.field6522++;
                            class402.method2436(-1, true, 0, false, (byte) 106, var6[var10], 0, var12, "<col=ffff00>" + var4, var3.field5825, (long) arg0.field1163);
                        }
                    }
                }
            }
            class402.method2436(-1, true, 0, arg1, (byte) 108, class11.field145.method1176(class110.field1676, (byte) -100), 0, 1006, "<col=ffff00>" + var4, class92.field1356, (long) arg0.field1163);
            class151.field2132++;
        } else if (!arg1) {
            class112 var13 = class72.field984 == -1 ? null : class94.field1387.method164(27, class72.field984);
            if ((class456.field6187 & 0x2) != 0) {
                if (var13 == null || var3.method2536(var13.field1702, -21086, class72.field984) != var13.field1702) {
                    class410.field5629++;
                    class402.method2436(-1, true, 0, false, (byte) 101, class491.field6867, 0, 10, class31.field407 + " -> <col=ffff00>" + var4, class297.field3974, (long) arg0.field1163);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZI)V", line = 195)
    public static final void method1651(boolean arg0, int arg1) {
        field3929++;
        if (arg0 && class55.field727 != null) {
            class429.field5844 = class55.field727.field3774;
        } else {
            class429.field5844 = -1;
        }
        class181.field2492 = null;
        class55.field727 = null;
        class373.field5100 = 0;
        class271.field3611 = null;
        class55.method388();
        class55.field736.method645(0);
        class231.field3072 = null;
        class404.field5544 = null;
        class473.field6528 = null;
        class222.field2959 = -1;
        class441.field5947 = null;
        class55.field743 = null;
        class310.field4096 = null;
        class304.field4034 = -1;
        class446.field6063 = null;
        class77.field1041 = null;
        class97.field1418 = null;
        class31.field419 = null;
        class55.field735.method2711(2);
        class55.field730.method2192(64, true, 64);
        class55.field735.method2708(64, 128, -2);
        class55.field729.method933(64, (byte) 67);
        class302.field4021.method1224(arg1, 10);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V", line = 230)
    public static void method1652(byte arg0) {
        if (arg0 != -47) {
            method1650((class121) null, false, true);
        }
        field3932 = null;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V", line = 241)
    public static final void method1653(byte arg0) {
        class357.field4941 = class411.method2468(0.4F, arg0 ^ 0x3C84, 35, 8, true, 8, 4, 2048);
        if (arg0 != 53) {
            field3932 = null;
        }
        field3928++;
    }
}
