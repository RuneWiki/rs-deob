import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class81 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field1521 = 0;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "[[I")
    public static int[][] field1524 = new int[104][104];

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Lvf;")
    public static class265 field1531 = class87.method582(-46, "::fpson");

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Lvf;")
    private static class265 field1532 = class87.method582(-46, "Loaded title screen");

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lvf;")
    private static class265 field1529 = class87.method582(-46, "Please wait)3)3)3");

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Lvf;")
    public static class265 field1527 = field1529;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Lvf;")
    public static class265 field1530 = field1532;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Ldg;")
    public static class276 field1526 = new class276(500);

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lvf;")
    public static class265 field1534 = class87.method582(-46, "Chargement en cours)3 Veuillez patienter)3");

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field1536 = 0;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Lfl;")
    public static class192 field1522;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Lfl;")
    public static class192 field1525;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Lk;")
    public static class199 field1535;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "[[[B")
    public static byte[][][] field1528;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lgk;B)V")
    public static final void method558(class6 arg0, byte arg1) {
        int var2 = arg0.field146;
        field1523++;
        if (var2 == 324) {
            if (class197.field3519 == -1) {
                class113.field1990 = arg0.field125;
                class197.field3519 = arg0.field183;
            }
            if (class217.field3911.field1411) {
                arg0.field183 = class197.field3519;
            } else {
                arg0.field183 = class113.field1990;
            }
            return;
        }
        if (arg1 != 55) {
            method561(false, (class135) null);
        }
        if (var2 == 325) {
            if (class197.field3519 == -1) {
                class197.field3519 = arg0.field183;
                class113.field1990 = arg0.field125;
            }
            if (class217.field3911.field1411) {
                arg0.field183 = class113.field1990;
            } else {
                arg0.field183 = class197.field3519;
            }
        } else if (var2 == 327) {
            arg0.field124 = 150;
            arg0.field123 = (int) (Math.sin((double) class93.field1655 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field222 = -1;
            arg0.field102 = 5;
        } else if (var2 == 328) {
            if (class214.field3827.field2163 == null) {
                arg0.field222 = 0;
            } else {
                arg0.field124 = 150;
                arg0.field123 = (int) (Math.sin((double) class93.field1655 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field102 = 5;
                arg0.field222 = ((int) class214.field3827.field2163.method1793(43) << 11) + 2047;
                arg0.field150 = class214.field3827.field2582;
                arg0.field152 = class214.field3827.field2547;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method559(int arg0) {
        field1522 = null;
        field1525 = null;
        field1531 = null;
        field1532 = null;
        field1524 = null;
        field1527 = null;
        if (arg0 != 28555) {
            return;
        }
        field1526 = null;
        field1534 = null;
        field1535 = null;
        field1530 = null;
        field1528 = null;
        field1529 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lgd;IIIIIIZ)V")
    public static final void method560(class266 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field4687.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field4687[var9] - class65.field1254;
            int var23 = arg0.field4683[var9] - class248.field4309;
            int var24 = arg0.field4695[var9] - class204.field3647;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field4686 != null) {
                class266.field4677[var9] = var25;
                class266.field4689[var9] = var28;
                class266.field4694[var9] = var29;
            }
            class266.field4674[var9] = (var25 << 9) / var29 + class247.field4300;
            class266.field4679[var9] = (var28 << 9) / var29 + class247.field4291;
        }
        class247.field4302 = 0;
        int var10 = arg0.field4676.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field4676[var11];
            int var13 = arg0.field4684[var11];
            int var14 = arg0.field4678[var11];
            int var15 = class266.field4674[var12];
            int var16 = class266.field4674[var13];
            int var17 = class266.field4674[var14];
            int var18 = class266.field4679[var12];
            int var19 = class266.field4679[var13];
            int var20 = class266.field4679[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class193.field3478 && class102.method680(class262.field4573 + class247.field4300, class7.field264 + class247.field4291, var18, var19, var20, var15, var16, var17)) {
                    class127.field2267 = arg5;
                    class179.field3183 = arg6;
                }
                if (!arg7) {
                    class247.field4297 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class247.field4301 || var16 > class247.field4301 || var17 > class247.field4301) {
                        class247.field4297 = true;
                    }
                    if (arg0.field4686 == null || arg0.field4686[var11] == -1) {
                        if (arg0.field4675[var11] != 12345678) {
                            class247.method1633(var18, var19, var20, var15, var16, var17, arg0.field4675[var11], arg0.field4691[var11], arg0.field4692[var11]);
                        }
                    } else if (!class196.field3505) {
                        int var21 = class247.field4292.method64(-49, arg0.field4686[var11]);
                        class247.method1633(var18, var19, var20, var15, var16, var17, class91.method622(var21, arg0.field4675[var11]), class91.method622(var21, arg0.field4691[var11]), class91.method622(var21, arg0.field4692[var11]));
                    } else if (arg0.field4690) {
                        class247.method1643(var18, var19, var20, var15, var16, var17, arg0.field4675[var11], arg0.field4691[var11], arg0.field4692[var11], class266.field4677[0], class266.field4677[1], class266.field4677[3], class266.field4689[0], class266.field4689[1], class266.field4689[3], class266.field4694[0], class266.field4694[1], class266.field4694[3], arg0.field4686[var11]);
                    } else {
                        class247.method1643(var18, var19, var20, var15, var16, var17, arg0.field4675[var11], arg0.field4691[var11], arg0.field4692[var11], class266.field4677[var12], class266.field4677[var13], class266.field4677[var14], class266.field4689[var12], class266.field4689[var13], class266.field4689[var14], class266.field4694[var12], class266.field4694[var13], class266.field4694[var14], arg0.field4686[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLng;)V")
    public static final void method561(boolean arg0, class135 arg1) {
        if (arg0) {
            return;
        }
        while (true) {
            while (arg1.field2449 < arg1.field2483.length) {
                int var2 = 0;
                int var3 = 0;
                boolean var4 = false;
                if (arg1.method920((byte) 89) == 1) {
                    var4 = true;
                    var3 = arg1.method920((byte) 67);
                    var2 = arg1.method920((byte) 79);
                }
                int var5 = arg1.method920((byte) 85);
                int var6 = arg1.method920((byte) 109);
                int var7 = var5 * 64 - class269.field4796;
                int var8 = class176.field3141 + class155.field2871 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < class213.field3824 && var8 < class155.field2871) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var4 || var3 * 8 <= var11 && var11 < var3 * 8 + 8 && var12 >= var2 * 8 && var12 < var2 * 8 + 8) {
                                int var13 = arg1.method920((byte) 72);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method920((byte) 87);
                                        if (class120.field2130[var10][var9] == null) {
                                            class120.field2130[var10][var9] = new byte[4096];
                                        }
                                        class120.field2130[var10][var9][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method927(127);
                                        if (class254.field4373[var10][var9] == null) {
                                            class254.field4373[var10][var9] = new short[4096];
                                        }
                                        class254.field4373[var10][var9][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = ((arg1.method920((byte) 107) & 0xFF) << 16) + (arg1.method920((byte) 62) & 0xFF << 8) + (arg1.method920((byte) 120) & 0xFF);
                                        if (class177.field3162[var10][var9] == null) {
                                            class177.field3162[var10][var9] = new int[4096];
                                        }
                                        var16--;
                                        class130 var17 = class84.method574(75, var16);
                                        if (var17.field2365 != null) {
                                            var17 = var17.method861(-25233);
                                            if (var17 == null || var17.field2317 == -1) {
                                                continue;
                                            }
                                        }
                                        class177.field3162[var10][var9][(63 - var12 << 6) + var11] = var17.field2357 + 1;
                                        class79 var18 = new class79();
                                        var18.field1499 = var8;
                                        var18.field1505 = var17.field2317;
                                        var18.field1498 = var7;
                                        class258.field4429.method785(var18, -29);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var4 ? 64 : 4096); var19++) {
                        int var20 = arg1.method920((byte) 123);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field2449++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field2449 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field2449 += 3;
                            }
                        }
                    }
                }
            }
            field1533++;
            return;
        }
    }
}
