import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class222 {

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public int field3535 = 99;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
    public int field3545 = -1;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Z")
    public boolean field3530 = false;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "Z")
    public boolean field3538 = false;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public int field3531 = -1;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public int field3524 = -1;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public int field3540 = -1;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "Z")
    public boolean field3554 = false;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public int field3527 = -1;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    public int field3552 = 2;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "Z")
    public boolean field3553 = false;

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "I")
    public int field3560 = 5;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "I")
    public static int field3548 = 0;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "Ljh;")
    public static class207 field3537 = null;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "Z")
    public static boolean field3526 = false;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "[Lkk;")
    public static class300[] field3536 = new class300[50];

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    public int field3549;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lwf;")
    public static class306 field3532;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "[I")
    public int[] field3522;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "[I")
    public int[] field3529;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "[I")
    private int[] field3551;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "[Z")
    public boolean[] field3533;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "[[I")
    public int[][] field3556;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIBII)I", line = 5)
    public static final int method1480(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (class329.field5093) {
            arg0 = 1000000;
            class329.field5093 = false;
        }
        class117 var5 = class14.field144[arg1][arg3];
        field3555++;
        int var6 = var5.field1812;
        float var7 = ((float) arg4 * 0.1F + 0.7F) * var5.field1807;
        if (arg2 >= -100) {
            method1489(-124, false, 74);
        }
        float var8 = var5.field1811;
        float var9 = var5.field1820;
        int var10 = var5.field1817;
        if (!class187.field2843) {
            var10 = 0;
        }
        int var11 = var5.field1822;
        float var12 = var5.field1805;
        class137 var13 = var5.field1808;
        float var14 = var5.field1823;
        float var15 = var5.field1825;
        if (class60.field846 != var6 || class107.field1643 != var7 || class112.field1719 != var9 || class3.field36 != var8 || class330.field5102 != var11 || class74.field1106 != var10 || class343.field5337 != var13 || class276.field4265 != var15 || class90.field1376 != var14 || class339.field5239 != var12) {
            class33.field418 = class10.field101;
            class167.field2559 = class36.field456;
            class343.field5344 = class177.field2697;
            class177.field2701 = class264.field4069;
            class46.field648 = class192.field2907;
            class156.field2447 = class293.field4508;
            class306.field4810 = class19.field258;
            class138.field2144 = class285.field4368;
            class227.field3633 = class108.field1662;
            class246.field3857 = class165.field2538;
            if (class168.field2569 == null || class343.field5344 == class168.field2569) {
                class168.field2569 = new class137();
            }
            class112.field1719 = var9;
            class3.field36 = var8;
            class60.field846 = var6;
            class330.field5102 = var11;
            class74.field1106 = var10;
            class276.field4265 = var15;
            class339.field5239 = var12;
            class90.field1376 = var14;
            class107.field1643 = var7;
            class343.field5337 = var13;
            class100.field1561 = 0;
        }
        if (class100.field1561 < 65536) {
            class100.field1561 += arg0 * 250;
            if (class100.field1561 >= 65536) {
                class165.field2538 = class330.field5102;
                class108.field1662 = class107.field1643;
                class264.field4069 = class339.field5239;
                class192.field2907 = class90.field1376;
                class177.field2697 = class343.field5337;
                class100.field1561 = 65536;
                class285.field4368 = class112.field1719;
                class343.field5344 = null;
                class10.field101 = class74.field1106;
                class19.field258 = class60.field846;
                class36.field456 = class3.field36;
                class293.field4508 = class276.field4265;
            } else {
                int var16 = 65536 - class100.field1561 >> 8;
                int var17 = class100.field1561 >> 8;
                class10.field101 = class74.field1106 * var17 + class33.field418 * var16 >> 8;
                class19.field258 = ((class60.field846 & 0xFF00FF) * var17 + (class306.field4810 & 0xFF00FF) * var16 & 0xFF00FF00) + ((class60.field846 & 0xFF00) * var17 + (class306.field4810 & 0xFF00) * var16 & 0xFF0000) >> 8;
                float var18 = (float) (65536 - class100.field1561) / 65536.0F;
                class165.field2538 = ((class330.field5102 & 0xFF00FF) * var17 + (class246.field3857 & 0xFF00FF) * var16 & 0xFF00FF00) + ((class330.field5102 & 0xFF00) * var17 + (class246.field3857 & 0xFF00) * var16 & 0xFF0000) >> 8;
                float var19 = (float) class100.field1561 / 65536.0F;
                class108.field1662 = class227.field3633 * var18 + class107.field1643 * var19;
                class285.field4368 = class138.field2144 * var18 + class112.field1719 * var19;
                class264.field4069 = class339.field5239 * var19 + class177.field2701 * var18;
                class293.field4508 = class276.field4265 * var19 + class156.field2447 * var18;
                class36.field456 = class3.field36 * var19 + class167.field2559 * var18;
                class192.field2907 = class90.field1376 * var19 + class46.field648 * var18;
                if (class343.field5344 != class343.field5337) {
                    if (class343.field5344 == null || class343.field5337 == null) {
                        class177.field2697 = null;
                    } else {
                        class177.field2697 = class168.field2569.method933(class343.field5344, class343.field5337, (float) class100.field1561 / 65536.0F);
                    }
                }
            }
        }
        return class165.field2538;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIILg;)Lg;", line = 132)
    public final class295 method1481(int arg0, int arg1, int arg2, int arg3, int arg4, class295 arg5) {
        field3544++;
        int var7 = this.field3522[arg3];
        int var8 = this.field3529[arg3];
        class89 var9 = class96.method658(var8 >> 16, (byte) 118);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method972(true, true, true);
        }
        int var11 = arg4 & 0x3;
        class89 var12 = null;
        if ((this.field3538 || class129.field2024) && arg0 != -1 && this.field3529.length > arg0) {
            int var13 = this.field3529[arg0];
            var12 = class96.method658(var13 >> 16, (byte) 121);
            arg0 = var13 & 0xFFFF;
        }
        class295 var14;
        if (var12 == null) {
            var14 = arg5.method972(!var9.method613((byte) -115, var10), !var9.method614((byte) 87, var10), !this.field3554);
        } else {
            var14 = arg5.method972(!var9.method613((byte) -50, var10) & !var12.method613((byte) -111, arg0), !var9.method614((byte) 29, var10) & !var12.method614((byte) 26, arg0), !this.field3554);
        }
        if (class333.field5166 && this.field3554) {
            if (var11 == 1) {
                ((class340) var14).method2352();
            } else if (var11 == 2) {
                ((class340) var14).method2355();
            } else if (var11 == 3) {
                ((class340) var14).method2370();
            }
        } else if (var11 == 1) {
            var14.method955();
        } else if (var11 == 2) {
            var14.method982();
        } else if (var11 == 3) {
            var14.method961();
        }
        var14.method1935(var9, var10, var12, arg0, arg1 - 1, var7, this.field3554);
        if (arg2 != 0) {
            this.method1481(-56, 44, 105, -82, 44, (class295) null);
        }
        if (class333.field5166 && this.field3554) {
            if (var11 == 1) {
                ((class340) var14).method2370();
            } else if (var11 == 2) {
                ((class340) var14).method2355();
            } else if (var11 == 3) {
                ((class340) var14).method2352();
            }
        } else if (var11 == 1) {
            var14.method961();
        } else if (var11 == 2) {
            var14.method982();
        } else if (var11 == 3) {
            var14.method955();
        }
        return var14;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lgn;B)V", line = 227)
    public final void method1482(class303 arg0, byte arg1) {
        field3546++;
        while (true) {
            int var3 = arg0.method2043((byte) -128);
            if (var3 == 0) {
                int var4 = 82 / ((arg1 + 31) / 45);
                return;
            }
            this.method1496((byte) 99, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)V", line = 248)
    public static final void method1483(int arg0, byte arg1) {
        field3523++;
        if (class278.field4286 == 0) {
            class89.field1362.method435(8, arg0);
        } else {
            class150.field2371 = arg0;
        }
        if (arg1 <= 21) {
            field3548 = -104;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIILg;II)Lg;", line = 271)
    public final class295 method1484(int arg0, int arg1, int arg2, class295 arg3, int arg4, int arg5) {
        int var7 = this.field3522[arg4];
        field3547++;
        int var8 = this.field3529[arg4];
        class89 var9 = class96.method658(var8 >> 16, (byte) 113);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method989(true, true, true);
        }
        class89 var11 = null;
        int var12 = arg5 & 0x3;
        if ((this.field3538 || class129.field2024) && arg0 != -1 && arg0 < this.field3529.length) {
            int var13 = this.field3529[arg0];
            var11 = class96.method658(var13 >> 16, (byte) 120);
            arg0 = var13 & 0xFFFF;
        }
        class295 var14;
        if (var11 == null) {
            var14 = arg3.method989(!var9.method613((byte) -34, var10), !var9.method614((byte) 44, var10), !this.field3554);
        } else {
            var14 = arg3.method989(!var9.method613((byte) -49, var10) & !var11.method613((byte) -45, arg0), !var9.method614((byte) 81, var10) & !var11.method614((byte) 64, arg0), !this.field3554);
        }
        if (this.field3554 && class333.field5166) {
            if (var12 == 1) {
                ((class340) var14).method2352();
            } else if (var12 == 2) {
                ((class340) var14).method2355();
            } else if (var12 == 3) {
                ((class340) var14).method2370();
            }
        } else if (var12 == 1) {
            var14.method955();
        } else if (var12 == 2) {
            var14.method982();
        } else if (var12 == 3) {
            var14.method961();
        }
        if (arg1 != 2) {
            this.field3545 = 127;
        }
        var14.method1935(var9, var10, var11, arg0, arg2 - 1, var7, this.field3554);
        if (this.field3554 && class333.field5166) {
            if (var12 == 1) {
                ((class340) var14).method2370();
            } else if (var12 == 2) {
                ((class340) var14).method2355();
            } else if (var12 == 3) {
                ((class340) var14).method2352();
            }
        } else if (var12 == 1) {
            var14.method961();
        } else if (var12 == 2) {
            var14.method982();
        } else if (var12 == 3) {
            var14.method955();
        }
        return var14;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V", line = 374)
    public static final void method1485(byte arg0) {
        class299.field4634.method1298((byte) 110);
        field3534++;
        if (arg0 != 32) {
            method1495((Component) null, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V", line = 386)
    public static final void method1486(int arg0, int arg1) {
        if (arg1 != 31544) {
            field3526 = true;
        }
        field3550++;
        class22.field275 = new int[arg0];
        class194.field2918 = new int[arg0];
        class247.field3883 = new int[arg0];
        class288.field4409 = new int[arg0];
        class38.field559 = new int[arg0];
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 401)
    public static void method1487(int arg0) {
        field3537 = null;
        if (arg0 >= -69) {
            field3536 = (class300[]) null;
        }
        field3536 = null;
        field3532 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BIIZ[[[Lsa;I)Z", line = 414)
    public static final boolean method1488(byte arg0, int arg1, int arg2, boolean arg3, class174[][][] arg4, int arg5) {
        if (arg0 != -52) {
            field3532 = (class306) null;
        }
        field3562++;
        byte var6 = arg3 ? 1 : (byte) (class19.field260 & 0xFF);
        if (class97.field1512[class77.field1154][arg2][arg1] == var6) {
            return false;
        } else if ((class305.field4784[class77.field1154][arg2][arg1] & 0x4) == 0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            class268.field4124[var8] = arg2;
            int var31 = var8 + 1;
            class54.field764[var8] = arg1;
            class97.field1512[class77.field1154][arg2][arg1] = var6;
            while (var7 != var31) {
                int var9 = class268.field4124[var7] >> 24 & 0xFF;
                int var10 = class268.field4124[var7] & 0xFFFF;
                int var11 = class54.field764[var7] & 0xFFFF;
                int var12 = (class268.field4124[var7] & 0xFFAF07) >> 16;
                boolean var13 = false;
                if ((class305.field4784[class77.field1154][var10][var11] & 0x4) == 0) {
                    var13 = true;
                }
                int var14 = (class54.field764[var7] & 0xFF57E7) >> 16;
                var7 = var7 + 1 & 0xFFF;
                boolean var15 = false;
                label243: for (int var16 = class77.field1154 + 1; var16 <= 3; var16++) {
                    if ((class305.field4784[var16][var10][var11] & 0x8) == 0) {
                        if (var13 && arg4[var16][var10][var11] != null) {
                            if (arg4[var16][var10][var11].field2672 != null) {
                                int var17 = class274.method1797(var12, 108);
                                if (arg4[var16][var10][var11].field2672.field2453 == var17 || arg4[var16][var10][var11].field2672.field2455 == var17) {
                                    continue;
                                }
                                if (var9 != 0) {
                                    int var18 = class274.method1797(var9, 109);
                                    if (arg4[var16][var10][var11].field2672.field2453 == var18 || arg4[var16][var10][var11].field2672.field2455 == var18) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var19 = class274.method1797(var14, 114);
                                    if (arg4[var16][var10][var11].field2672.field2453 == var19 || arg4[var16][var10][var11].field2672.field2455 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var10][var11].field2671 != null) {
                                for (int var20 = 0; var20 < arg4[var16][var10][var11].field2655; var20++) {
                                    int var21 = (int) (arg4[var16][var10][var11].field2671[var20].field4183 >> 14 & 0x3FL);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var22 = (int) (arg4[var16][var10][var11].field2671[var20].field4183 >> 20 & 0x3L);
                                    int var23 = var22 << 6 | var21;
                                    if (var12 == var23 || var9 != 0 && var9 == var23 || var14 != 0 && var14 == var23) {
                                        continue label243;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class174 var24 = arg4[var16][var10][var11];
                        if (var24 != null && var24.field2655 > 0) {
                            for (int var25 = 0; var25 < var24.field2655; var25++) {
                                class272 var26 = var24.field2671[var25];
                                if (var26.field4185 != var26.field4169 || var26.field4186 != var26.field4181) {
                                    for (int var27 = var26.field4169; var27 <= var26.field4185; var27++) {
                                        for (int var28 = var26.field4186; var28 <= var26.field4181; var28++) {
                                            class97.field1512[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class97.field1512[var16][var10][var11] = var6;
                    }
                }
                if (var15) {
                    if (class247.field3883[arg5] < client.field2034[class77.field1154 + 1][var10][var11]) {
                        class247.field3883[arg5] = client.field2034[class77.field1154 + 1][var10][var11];
                    }
                    int var29 = var11 << 7;
                    int var30 = var10 << 7;
                    if (class22.field275[arg5] > var30) {
                        class22.field275[arg5] = var30;
                    } else if (class38.field559[arg5] < var30) {
                        class38.field559[arg5] = var30;
                    }
                    if (class288.field4409[arg5] > var29) {
                        class288.field4409[arg5] = var29;
                    } else if (class194.field2918[arg5] < var29) {
                        class194.field2918[arg5] = var29;
                    }
                }
                if (!var13) {
                    if (var10 >= 1 && class97.field1512[class77.field1154][var10 - 1][var11] != var6) {
                        class268.field4124[var31] = class276.method1810(class276.method1810(var10 - 1, 1179648), -754974720);
                        class54.field764[var31] = class276.method1810(var11, 1245184);
                        class97.field1512[class77.field1154][var10 - 1][var11] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var11++;
                    if (var11 < 104) {
                        if ((var10 - 1) >= 0 && class97.field1512[class77.field1154][var10 - 1][var11] != var6 && (class305.field4784[class77.field1154][var10][var11] & 0x4) == 0 && (class305.field4784[class77.field1154][var10 - 1][var11 - 1] & 0x4) == 0) {
                            class268.field4124[var31] = class276.method1810(1375731712, class276.method1810(var10 - 1, 1179648));
                            class54.field764[var31] = class276.method1810(var11, 1245184);
                            class97.field1512[class77.field1154][var10 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class97.field1512[class77.field1154][var10][var11] != var6) {
                            class268.field4124[var31] = class276.method1810(318767104, class276.method1810(var10, 5373952));
                            class54.field764[var31] = class276.method1810(var11, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class97.field1512[class77.field1154][var10][var11] = var6;
                        }
                        if ((var10 + 1) < 104 && class97.field1512[class77.field1154][var10 + 1][var11] != var6 && (class305.field4784[class77.field1154][var10][var11] & 0x4) == 0 && (class305.field4784[class77.field1154][var10 + 1][var11 - 1] & 0x4) == 0) {
                            class268.field4124[var31] = class276.method1810(class276.method1810(5373952, var10 + 1), -1845493760);
                            class54.field764[var31] = class276.method1810(var11, 5439488);
                            class97.field1512[class77.field1154][var10 + 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var11--;
                    if (var10 + 1 < 104 && class97.field1512[class77.field1154][var10 + 1][var11] != var6) {
                        class268.field4124[var31] = class276.method1810(class276.method1810(var10 + 1, 9568256), 1392508928);
                        class54.field764[var31] = class276.method1810(9633792, var11);
                        var31 = var31 + 1 & 0xFFF;
                        class97.field1512[class77.field1154][var10 + 1][var11] = var6;
                    }
                    var11--;
                    if (var11 >= 0) {
                        if (var10 - 1 >= 0 && class97.field1512[class77.field1154][var10 - 1][var11] != var6 && (class305.field4784[class77.field1154][var10][var11] & 0x4) == 0 && (class305.field4784[class77.field1154][var10 - 1][var11 + 1] & 0x4) == 0) {
                            class268.field4124[var31] = class276.method1810(class276.method1810(var10 - 1, 13762560), 301989888);
                            class54.field764[var31] = class276.method1810(var11, 13828096);
                            class97.field1512[class77.field1154][var10 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class97.field1512[class77.field1154][var10][var11] != var6) {
                            class268.field4124[var31] = class276.method1810(-1828716544, class276.method1810(var10, 13762560));
                            class54.field764[var31] = class276.method1810(var11, 13828096);
                            class97.field1512[class77.field1154][var10][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var10 + 1) < 104 && class97.field1512[class77.field1154][var10 + 1][var11] != var6 && (class305.field4784[class77.field1154][var10][var11] & 0x4) == 0 && (class305.field4784[class77.field1154][var10 + 1][var11 + 1] & 0x4) == 0) {
                            class268.field4124[var31] = class276.method1810(-771751936, class276.method1810(9568256, var10 + 1));
                            class54.field764[var31] = class276.method1810(9633792, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class97.field1512[class77.field1154][var10 + 1][var11] = var6;
                        }
                    }
                }
            }
            if (class247.field3883[arg5] != -1000000) {
                class247.field3883[arg5] += 10;
                class22.field275[arg5] -= 50;
                class38.field559[arg5] += 50;
                class194.field2918[arg5] += 50;
                class288.field4409[arg5] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZI)V", line = 721)
    public static final void method1489(int arg0, boolean arg1, int arg2) {
        field3561++;
        class75 var3 = class204.method1371(6, 7, arg0);
        var3.method524((byte) 57);
        if (arg1) {
            var3.field1122 = arg2;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 736)
    public static final void method1490(int arg0) {
        field3542++;
        if (arg0 != 0) {
            method1487(-126);
        }
        class118.field1833.method1296(255);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V", line = 754)
    public static final void method1491(boolean arg0) {
        class97.field1508 = 0;
        class259.field4024 = true;
        class294.field4531.field1466 = 0;
        class124.field1948 = 0L;
        class2.field8 = true;
        class259.method1732(16711680);
        class265.field4095.field4679 = 0;
        class56.field786 = 0;
        class34.field437 = -1;
        class230.field3713.field4679 = 0;
        class181.field2782 = 0;
        class93.field1441 = -1;
        class338.field5230 = -1;
        class312.field4940 = 0;
        field3539++;
        class190.field2890 = 0;
        class80.field1181 = 0;
        class76.field1133 = 0;
        class247.field3876 = 0;
        class318.field4993 = 0;
        class151.field2374 = 0;
        class63.field943 = 0;
        class221.field3515 = 0;
        class154.field2414 = 0;
        class122.field1898 = 0;
        class197.field2965 = 0;
        class93.field1431 = 0;
        class97.field1516 = 0;
        class152.field2397 = 0;
        class37.field458 = 0;
        class218.field3449 = 0;
        class226.field3616 = 0;
        class225.field3585 = 0;
        class131.field2056 = 0;
        class213.field3369 = 0;
        class68.field1012 = 0;
        class303.field4676 = 0;
        class122.field1905 = 0;
        class329.field5094 = 0;
        class196.field2952 = 0;
        class170.field2586 = 0;
        class2.field21 = 0;
        class240.field3814 = 0;
        class283.field4352 = 0;
        class302.field4660 = 0;
        class235.field3783 = 0;
        class335.field5210 = 0;
        class116.field1800 = 0;
        class320.field5012 = 0;
        class207.field3170 = 0;
        class231.field3731 = 0;
        class89.field1358 = 0;
        class310.field4895 = 0;
        class286.field4386 = 0;
        class276.field4252 = 0;
        class61.field854 = 0;
        class204.field3081 = 0;
        class22.field273 = 0;
        class306.field4818 = 0;
        class259.field4026 = 0;
        class54.field761 = 0;
        class343.field5338 = 0;
        class280.field4314 = 0;
        class306.field4830 = 0;
        class299.field4636 = 0;
        class63.field946 = 0;
        class69.field1027 = 0;
        class266.field4110 = 0;
        class275.field4235 = 0;
        class132.field2078 = 0;
        class63.field929 = 0;
        class132.field2081 = 0;
        class323.field5035 = 0;
        class338.field5227 = 0;
        class97.field1490 = 0;
        class64.field973 = 0;
        class131.field2059 = 0;
        class324.field5051 = 0;
        class95.field1454 = 0;
        class227.field3634 = 0;
        class233.field3746 = 0;
        class3.field30 = 0;
        class179.field2735 = 0;
        class318.field4990 = 0;
        class70.field1054 = 0;
        class275.field4231 = 0;
        class199.field2983 = 0;
        class13.field133 = 0;
        class70.field1031 = 0;
        class303.field4671 = 0;
        class177.field2709 = 0;
        class203.field3064 = 0;
        class188.field2865 = 0;
        class86.field1297 = 0;
        class323.field5029 = 0;
        class40.field581 = 0;
        class303.field4732 = 0;
        class63.field912 = 0;
        class19.field263 = 0;
        class10.field96 = 0;
        class188.field2854 = 0;
        class227.field3624 = 0;
        class190.field2879 = 0;
        class228.field3670 = 0;
        class143.field2260 = 0;
        class329.field5092 = 0;
        class138.field2139 = 0;
        class33.field419 = 0;
        class172.field2622 = 0;
        class15.field158 = 0;
        class124.field1937 = 0;
        class90.field1377 = 0;
        class315.field4967 = 0;
        class259.field4022 = 0;
        class47.field670 = 0;
        class187.field2853 = 0;
        class211.field3341 = 0;
        class108.field1659 = 0;
        class82.field1234 = 0;
        class177.field2704 = 0;
        class192.field2910 = 0;
        class203.field3067 = 0;
        class170.field2595 = 0;
        class131.field2062 = 0;
        class70.field1044 = 0;
        class63.field931 = 0;
        class83.field1260 = 0;
        class335.field5205 = 0;
        class247.field3887 = 0;
        class230.field3699 = 0;
        class199.field2986 = 0;
        class95.field1458 = 0;
        class43.field603 = 0;
        class253.field3948 = 0;
        class208.field3321 = 0;
        class324.field5045 = 0;
        class128.field1995 = 0;
        class297.field4548 = 0;
        class205.field3095 = 0;
        class319.field4995 = 0;
        class80.field1185 = 0;
        class339.field5242 = 0;
        class126.field1973 = 0;
        class156.field2449 = 0;
        class6.field63 = 0;
        class184.field2822 = 0;
        class283.field4353 = 0;
        class305.field4763 = 0;
        class278.field4291 = 0;
        class63.field927 = 0;
        class199.field2999 = 0;
        class207.field3163 = 0;
        class197.field2967 = 0;
        class43.field612 = 0;
        client.field2035 = 0;
        class184.field2823 = 0;
        class56.field782 = 0;
        class7.field79 = 0;
        class7.field78 = 0;
        class268.field4139 = 0;
        class309.field4884 = 0;
        class329.field5091 = 0;
        class87.field1316 = 0;
        class117.field1806 = 0;
        class215.field3393 = 0;
        class249.field3917 = 0;
        class139.field2148 = 0;
        class236.field3791 = 0;
        class63.field890 = 0;
        class294.field4540 = 0;
        class248.field3901 = 0;
        class110.field1702 = 0;
        class128.field2007 = 0;
        class207.field3260 = 0;
        class97.field1507 = 0;
        class59.field836 = 0;
        class75.field1125 = 0;
        class108.field1663 = 0;
        class315.field4961 = 0;
        class110.field1705 = 0;
        class303.field4740 = 0;
        class253.field3940 = 0;
        class160.field2492 = 0;
        class173.field2639 = 0;
        class306.field4815 = 0;
        class303.field4678 = 0;
        class113.field1730 = 0;
        class205.field3100 = 0;
        class214.field3384 = 0;
        class288.field4408 = 0;
        class233.field3744 = 0;
        class307.field4837 = 0;
        class303.field4731 = 0;
        class4.field50 = 0;
        class249.field3916 = 0;
        class155.field2433 = 0;
        class70.field1051 = 0;
        class218.field3457 = 0;
        class10.field104 = 0;
        class310.field4900 = 0;
        class164.field2529 = 0;
        class273.field4193 = 0;
        class306.field4797 = 0;
        class273.field4205 = 0;
        class80.field1189 = 0;
        class2.field18 = 0;
        class146.field2299 = 0;
        class74.field1101 = 0;
        class46.field650 = 0;
        class17.field167 = 0;
        class231.field3727 = 0;
        class276.field4248 = 0;
        class345.field5353 = 0;
        class303.field4737 = 0;
        class71.field1073 = 0;
        class177.field2716 = 0;
        field3561 = 0;
        class157.field2459 = 0;
        class63.field884 = 0;
        class247.field3878 = 0;
        class303.field4670 = 0;
        class97.field1503 = 0;
        class288.field4403 = 0;
        class294.field4537 = 0;
        class150.field2368 = 0;
        class269.field4141 = 0;
        class80.field1188 = 0;
        class7.field71 = 0;
        class38.field486 = 0;
        class109.field1687 = 0;
        class90.field1363 = 0;
        class46.field642 = 0;
        class132.field2073 = 0;
        class112.field1716 = 0;
        class22.field271 = 0;
        class304.field4748 = 0;
        class199.field2993 = 0;
        class253.field3943 = 0;
        class247.field3871 = 0;
        class196.field2940 = 0;
        class4.field52 = 0;
        class131.field2065 = 0;
        class282.field4328 = 0;
        class136.field2119 = 0;
        class88.field1340 = 0;
        class288.field4410 = 0;
        class345.field5349 = 0;
        class128.field2000 = 0;
        class112.field1721 = 0;
        class226.field3607 = 0;
        class47.field657 = 0;
        class63.field934 = 0;
        class96.field1467 = 0;
        class288.field4415 = 0;
        class143.field2273 = 0;
        class95.field1456 = 0;
        class317.field4981 = 0;
        class175.field2677 = 0;
        class339.field5261 = 0;
        class269.field4143 = 0;
        class218.field3453 = 0;
        class230.field3704 = 0;
        class146.field2296 = 0;
        class142.field2251 = 0;
        class204.field3087 = 0;
        class38.field500 = 0;
        class298.field4592 = 0;
        class70.field1043 = 0;
        class120.field1849 = 0;
        class88.field1341 = 0;
        class52.field736 = 0;
        class335.field5211 = 0;
        class89.field1351 = 0;
        class60.field844 = 0;
        class128.field1991 = 0;
        class71.field1061 = 0;
        class293.field4506 = 0;
        class82.field1242 = 0;
        class303.field4687 = 0;
        class297.field4553 = 0;
        class98.field1521 = 0;
        class128.field1999 = 0;
        class36.field453 = 0;
        class231.field3729 = 0;
        class207.field3191 = 0;
        class298.field4580 = 0;
        class81.field1198 = 0;
        class207.field3138 = 0;
        class170.field2583 = 0;
        class322.field5022 = 0;
        class130.field2030 = 0;
        class87.field1314 = 0;
        class156.field2448 = 0;
        class172.field2625 = 0;
        class262.field4046 = 0;
        class330.field5103 = 0;
        class297.field4552 = 0;
        class151.field2382 = 0;
        class23.field294 = 0;
        client.field2039 = 0;
        class274.field4213 = 0;
        class10.field105 = 0;
        class63.field908 = 0;
        class100.field1565 = 0;
        class303.field4704 = 0;
        class306.field4789 = 0;
        class59.field833 = 0;
        class215.field3396 = 0;
        class262.field4052 = 0;
        class126.field1971 = 0;
        class96.field1472 = 0;
        class154.field2415 = 0;
        class94.field1447 = 0;
        class166.field2549 = 0;
        class234.field3754 = 0;
        class277.field4280 = 0;
        class15.field156 = 0;
        class81.field1206 = 0;
        class42.field598 = 0;
        if (!arg0) {
            field3532 = (class306) null;
        }
        class2.field17 = 0;
        class276.field4243 = 0;
        class88.field1346 = 0;
        class63.field932 = 0;
        class177.field2695 = 0;
        class196.field2951 = 0;
        class233.field3751 = 0;
        class162.field2502 = 0;
        class194.field2928 = 0;
        class274.field4215 = 0;
        field3542 = 0;
        field3555 = 0;
        class99.field1535 = 0;
        class259.field4010 = 0;
        class64.field965 = 0;
        class44.field616 = 0;
        class245.field3843 = 0;
        class305.field4771 = 0;
        class136.field2113 = 0;
        class24.field310 = 0;
        class108.field1660 = 0;
        class199.field2987 = 0;
        class318.field4991 = 0;
        class113.field1729 = 0;
        class52.field740 = 0;
        class47.field663 = 0;
        client.field2052 = 0;
        class47.field659 = 0;
        class277.field4281 = 0;
        class63.field926 = 0;
        class219.field3485 = 0;
        class303.field4702 = 0;
        class82.field1212 = 0;
        class218.field3463 = 0;
        class242.field3833 = 0;
        class303.field4712 = 0;
        class75.field1119 = 0;
        class277.field4273 = 0;
        class80.field1180 = 0;
        class193.field2915 = 0;
        class200.field3018 = 0;
        class97.field1492 = 0;
        class130.field2031 = 0;
        class188.field2864 = 0;
        class291.field4486 = 0;
        class166.field2554 = 0;
        class235.field3775 = 0;
        class188.field2872 = 0;
        class310.field4927 = 0;
        class221.field3518 = 0;
        class17.field215 = 0;
        class152.field2410 = 0;
        class253.field3955 = 0;
        class97.field1486 = 0;
        class265.field4086 = 0;
        class229.field3684 = 0;
        class39.field567 = 0;
        class299.field4640 = 0;
        class227.field3643 = 0;
        class155.field2436 = 0;
        class228.field3663 = 0;
        class97.field1517 = 0;
        class56.field780 = 0;
        class98.field1529 = 0;
        class10.field103 = 0;
        class81.field1203 = 0;
        class17.field177 = 0;
        class3.field40 = 0;
        class108.field1667 = 0;
        class42.field597 = 0;
        class206.field3120 = 0;
        class266.field4103 = 0;
        class212.field3356 = 0;
        class200.field3020 = 0;
        class306.field4790 = 0;
        class273.field4208 = 0;
        class226.field3606 = 0;
        class225.field3598 = 0;
        class63.field936 = 0;
        class268.field4125 = 0;
        class75.field1113 = 0;
        class82.field1232 = 0;
        class179.field2746 = 0;
        class270.field4158 = 0;
        class303.field4728 = 0;
        class128.field2008 = 0;
        class146.field2311 = 0;
        class255.field3979 = 0;
        class322.field5021 = 0;
        class289.field4423 = 0;
        class27.field354 = 0;
        class338.field5225 = 0;
        class4.field42 = 0;
        class225.field3589 = 0;
        class121.field1856 = 0;
        class110.field1703 = 0;
        class297.field4555 = 0;
        class146.field2313 = 0;
        class227.field3626 = 0;
        class23.field290 = 0;
        class75.field1121 = 0;
        class235.field3772 = 0;
        class304.field4747 = 0;
        class259.field4015 = 0;
        class330.field5117 = 0;
        class312.field4941 = 0;
        class307.field4833 = 0;
        class304.field4757 = 0;
        class318.field4992 = 0;
        class3.field41 = 0;
        class275.field4230 = 0;
        class211.field3355 = 0;
        class293.field4510 = 0;
        class319.field5007 = 0;
        class324.field5043 = 0;
        class63.field945 = 0;
        class63.field887 = 0;
        class63.field879 = 0;
        class261.field4043 = 0;
        class124.field1942 = 0;
        class259.field4011 = 0;
        class242.field3827 = 0;
        class3.field31 = 0;
        class175.field2685 = 0;
        class193.field2913 = 0;
        class188.field2858 = 0;
        class17.field231 = 0;
        class306.field4808 = 0;
        class332.field5134 = 0;
        class335.field5206 = 0;
        class304.field4759 = 0;
        class199.field2998 = 0;
        class303.field4701 = 0;
        field3558 = 0;
        class303.field4708 = 0;
        class99.field1532 = 0;
        class128.field2012 = 0;
        class280.field4316 = 0;
        class282.field4340 = 0;
        class24.field304 = 0;
        class6.field62 = 0;
        class126.field1976 = 0;
        class156.field2446 = 0;
        class196.field2939 = 0;
        class33.field424 = 0;
        class117.field1818 = 0;
        class146.field2293 = 0;
        class165.field2536 = 0;
        class90.field1372 = 0;
        class100.field1559 = 0;
        class108.field1668 = 0;
        class63.field903 = 0;
        class165.field2544 = 0;
        class89.field1352 = 0;
        class63.field914 = 0;
        class104.field1599 = 0;
        class78.field1160 = 0;
        class136.field2120 = 0;
        class125.field1954 = 0;
        class246.field3864 = 0;
        class247.field3870 = 0;
        class143.field2281 = 0;
        class97.field1494 = 0;
        class214.field3383 = 0;
        class177.field2705 = 0;
        class47.field668 = 0;
        class249.field3914 = 0;
        class51.field717 = 0;
        class173.field2631 = 0;
        class282.field4329 = 0;
        class204.field3075 = 0;
        class259.field4018 = 0;
        class215.field3397 = 0;
        class174.field2666 = 0;
        class303.field4682 = 0;
        class298.field4579 = 0;
        class303.field4729 = 0;
        class110.field1697 = 0;
        class88.field1348 = 0;
        class10.field106 = 0;
        class221.field3519 = 0;
        class163.field2513 = 0;
        class204.field3076 = 0;
        class163.field2512 = 0;
        class188.field2859 = 0;
        class303.field4721 = 0;
        field3547 = 0;
        class221.field3510 = 0;
        class75.field1116 = 0;
        class38.field494 = 0;
        class306.field4800 = 0;
        class285.field4360 = 0;
        class193.field2916 = 0;
        class302.field4664 = 0;
        class278.field4294 = 0;
        class255.field3977 = 0;
        class133.field2092 = 0;
        class6.field64 = 0;
        class294.field4538 = 0;
        class206.field3119 = 0;
        class303.field4666 = 0;
        class179.field2745 = 0;
        class303.field4686 = 0;
        class303.field4668 = 0;
        class124.field1946 = 0;
        class303.field4684 = 0;
        class227.field3640 = 0;
        class183.field2799 = 0;
        class288.field4401 = 0;
        class306.field4814 = 0;
        class95.field1450 = 0;
        class181.field2776 = 0;
        class104.field1595 = 0;
        class190.field2883 = 0;
        class221.field3503 = 0;
        class235.field3787 = 0;
        class179.field2738 = 0;
        class268.field4132 = 0;
        class247.field3874 = 0;
        class23.field296 = 0;
        class229.field3678 = 0;
        class304.field4756 = 0;
        class273.field4188 = 0;
        class230.field3712 = 0;
        class314.field4950 = 0;
        class184.field2817 = 0;
        class235.field3781 = 0;
        class190.field2895 = 0;
        class297.field4550 = 0;
        class38.field503 = 0;
        class90.field1366 = 0;
        class152.field2402 = 0;
        class183.field2804 = 0;
        class112.field1715 = 0;
        class177.field2698 = 0;
        class78.field1158 = 0;
        class99.field1537 = 0;
        class157.field2450 = 0;
        class51.field721 = 0;
        class36.field452 = 0;
        class10.field98 = 0;
        class68.field1019 = 0;
        class307.field4845 = 0;
        class44.field628 = 0;
        client.field2042 = 0;
        class146.field2308 = 0;
        class247.field3869 = 0;
        class253.field3942 = 0;
        class181.field2775 = 0;
        class225.field3604 = 0;
        class97.field1497 = 0;
        class188.field2861 = 0;
        class210.field3336 = 0;
        class303.field4689 = 0;
        class138.field2138 = 0;
        class221.field3517 = 0;
        class306.field4813 = 0;
        class310.field4905 = 0;
        class303.field4705 = 0;
        class248.field3899 = 0;
        class303.field4738 = 0;
        class177.field2714 = 0;
        class128.field1983 = 0;
        class126.field1965 = 0;
        class71.field1071 = 0;
        class228.field3655 = 0;
        class172.field2618 = 0;
        class303.field4741 = 0;
        class82.field1225 = 0;
        class317.field4975 = 0;
        class345.field5352 = 0;
        class60.field843 = 0;
        class177.field2699 = 0;
        class248.field3904 = 0;
        class294.field4516 = 0;
        class14.field147 = 0;
        class309.field4881 = 0;
        class285.field4366 = 0;
        class70.field1036 = 0;
        class64.field968 = 0;
        class303.field4722 = 0;
        class226.field3609 = 0;
        class128.field2011 = 0;
        class291.field4445 = 0;
        class210.field3328 = 0;
        class108.field1666 = 0;
        class18.field249 = 0;
        class218.field3468 = 0;
        class236.field3789 = 0;
        class329.field5098 = 0;
        class86.field1300 = 0;
        class303.field4698 = 0;
        class122.field1904 = 0;
        class96.field1477 = 0;
        class92.field1420 = 0;
        class128.field2002 = 0;
        class219.field3490 = 0;
        class40.field579 = 0;
        class227.field3630 = 0;
        class87.field1310 = 0;
        class248.field3908 = 0;
        class44.field617 = 0;
        class205.field3094 = 0;
        class255.field3989 = 0;
        class13.field139 = 0;
        class156.field2440 = 0;
        class275.field4227 = 0;
        class338.field5229 = 0;
        class81.field1196 = 0;
        class132.field2077 = 0;
        class24.field301 = 0;
        class214.field3380 = 0;
        class218.field3446 = 0;
        class273.field4206 = 0;
        class197.field2959 = 0;
        class128.field1989 = 0;
        class143.field2269 = 0;
        class46.field654 = 0;
        class342.field5330 = 0;
        class277.field4277 = 0;
        class97.field1498 = 0;
        class308.field4849 = 0;
        class177.field2694 = 0;
        class172.field2614 = 0;
        class220.field3499 = 0;
        class303.field4725 = 0;
        class294.field4518 = 0;
        class330.field5115 = 0;
        class306.field4829 = 0;
        class151.field2381 = 0;
        class277.field4279 = 0;
        class158.field2463 = 0;
        class38.field535 = 0;
        class227.field3641 = 0;
        class90.field1374 = 0;
        class172.field2621 = 0;
        class255.field3983 = 0;
        class173.field2633 = 0;
        class68.field1017 = 0;
        class256.field3993 = 0;
        class170.field2593 = 0;
        class38.field538 = 0;
        class13.field134 = 0;
        class72.field1083 = 0;
        class2.field10 = 0;
        class112.field1717 = 0;
        class274.field4210 = 0;
        class118.field1832 = 0;
        class156.field2441 = 0;
        class266.field4107 = 0;
        class303.field4703 = 0;
        class247.field3865 = 0;
        class265.field4075 = 0;
        class104.field1602 = 0;
        class70.field1046 = 0;
        class291.field4436 = 0;
        class272.field4170 = 0;
        class206.field3121 = 0;
        class306.field4798 = 0;
        class61.field850 = 0;
        class85.field1286 = 0;
        class183.field2798 = 0;
        class304.field4761 = 0;
        class27.field350 = 0;
        class2.field22 = 0;
        class306.field4804 = 0;
        class213.field3376 = 0;
        class158.field2474 = 0;
        class198.field2980 = 0;
        class128.field2006 = 0;
        class60.field847 = 0;
        class87.field1307 = 0;
        class247.field3881 = 0;
        class179.field2742 = 0;
        class312.field4942 = 0;
        class253.field3944 = 0;
        class104.field1606 = 0;
        class177.field2691 = 0;
        class183.field2801 = 0;
        class128.field2004 = 0;
        class303.field4710 = 0;
        client.field2053 = 0;
        class99.field1544 = 0;
        class218.field3470 = 0;
        class30.field372 = 0;
        class259.field4020 = 0;
        class97.field1515 = 0;
        class318.field4989 = 0;
        class294.field4528 = 0;
        class133.field2093 = 0;
        class63.field920 = 0;
        class71.field1074 = 0;
        class299.field4631 = 0;
        class97.field1518 = 0;
        class35.field448 = 0;
        class101.field1570 = 0;
        class276.field4269 = 0;
        class234.field3756 = 0;
        class199.field2992 = 0;
        class63.field885 = 0;
        class286.field4383 = 0;
        class132.field2080 = 0;
        class230.field3701 = 0;
        class17.field189 = 0;
        class52.field743 = 0;
        class225.field3595 = 0;
        class190.field2889 = 0;
        class323.field5034 = 0;
        class221.field3520 = 0;
        class211.field3340 = 0;
        class162.field2505 = 0;
        class183.field2800 = 0;
        class63.field944 = 0;
        class107.field1641 = 0;
        class44.field619 = 0;
        class59.field832 = 0;
        class205.field3108 = 0;
        class306.field4803 = 0;
        client.field2049 = 0;
        class284.field4355 = 0;
        class339.field5257 = 0;
        class58.field824 = 0;
        class230.field3700 = 0;
        class304.field4752 = 0;
        class165.field2533 = 0;
        class293.field4514 = 0;
        class88.field1323 = 0;
        class204.field3078 = 0;
        class104.field1600 = 0;
        class338.field5226 = 0;
        class273.field4202 = 0;
        class227.field3639 = 0;
        class273.field4195 = 0;
        class196.field2946 = 0;
        class118.field1827 = 0;
        class139.field2155 = 0;
        class56.field779 = 0;
        class215.field3407 = 0;
        class219.field3486 = 0;
        class95.field1453 = 0;
        class33.field410 = 0;
        class303.field4675 = 0;
        class33.field415 = 0;
        class207.field3235 = 0;
        class59.field842 = 0;
        class131.field2068 = 0;
        class273.field4196 = 0;
        class342.field5331 = 0;
        class88.field1337 = 0;
        class345.field5350 = 0;
        class148.field2336 = 0;
        class207.field3201 = 0;
        class82.field1214 = 0;
        class100.field1551 = 0;
        class194.field2924 = 0;
        class3.field34 = 0;
        class173.field2640 = 0;
        class345.field5357 = 0;
        class142.field2257 = 0;
        field3523 = 0;
        class200.field3002 = 0;
        class122.field1888 = 0;
        class226.field3614 = 0;
        class91.field1412 = 0;
        class291.field4427 = 0;
        class177.field2711 = 0;
        class311.field4929 = 0;
        class174.field2670 = 0;
        class133.field2100 = 0;
        class46.field646 = 0;
        class160.field2480 = 0;
        class2.field16 = 0;
        class128.field2016 = 0;
        class303.field4697 = 0;
        class329.field5086 = 0;
        class228.field3659 = 0;
        class342.field5332 = 0;
        class248.field3906 = 0;
        class253.field3949 = 0;
        class265.field4083 = 0;
        class81.field1202 = 0;
        class63.field910 = 0;
        class253.field3958 = 0;
        class315.field4970 = 0;
        class64.field975 = 0;
        class148.field2330 = 0;
        class71.field1056 = 0;
        class226.field3618 = 0;
        class34.field439 = 0;
        class229.field3682 = 0;
        class6.field59 = 0;
        class82.field1215 = 0;
        class286.field4381 = 0;
        class118.field1829 = 0;
        class227.field3631 = 0;
        class253.field3941 = 0;
        class253.field3962 = 0;
        class233.field3734 = 0;
        class64.field977 = 0;
        class161.field2497 = 0;
        class128.field1982 = 0;
        class303.field4673 = 0;
        class143.field2280 = 0;
        class14.field143 = 0;
        class277.field4272 = 0;
        class152.field2394 = 0;
        class108.field1657 = 0;
        class63.field913 = 0;
        class3.field35 = 0;
        class187.field2851 = 0;
        class24.field306 = 0;
        class320.field5010 = 0;
        class212.field3358 = 0;
        class190.field2881 = 0;
        class155.field2428 = 0;
        class204.field3073 = 0;
        class51.field726 = 0;
        class247.field3877 = 0;
        class313.field4945 = 0;
        class151.field2377 = 0;
        class198.field2979 = 0;
        class248.field3907 = 0;
        class310.field4916 = 0;
        class277.field4284 = 0;
        class52.field733 = 0;
        class167.field2561 = 0;
        class188.field2866 = 0;
        class207.field3178 = 0;
        class272.field4178 = 0;
        class303.field4719 = 0;
        class215.field3404 = 0;
        class197.field2957 = 0;
        class128.field2009 = 0;
        class54.field766 = 0;
        class265.field4082 = 0;
        class104.field1605 = 0;
        class52.field742 = 0;
        class77.field1148 = 0;
        class115.field1789 = 0;
        class177.field2715 = 0;
        class36.field457 = 0;
        class237.field3804 = 0;
        class63.field899 = 0;
        class338.field5232 = 0;
        class63.field935 = 0;
        class268.field4126 = 0;
        class298.field4628 = 0;
        class148.field2353 = 0;
        class142.field2249 = 0;
        class235.field3779 = 0;
        class318.field4987 = 0;
        class188.field2863 = 0;
        class177.field2724 = 0;
        class177.field2706 = 0;
        class253.field3952 = 0;
        class225.field3596 = 0;
        class106.field1626 = 0;
        class200.field3005 = 0;
        class233.field3736 = 0;
        class335.field5215 = 0;
        class303.field4742 = 0;
        class46.field651 = 0;
        class166.field2552 = 0;
        class306.field4816 = 0;
        class23.field298 = 0;
        class303.field4735 = 0;
        class264.field4063 = 0;
        class61.field849 = 0;
        class108.field1675 = 0;
        class297.field4557 = 0;
        class24.field307 = 0;
        class339.field5260 = 0;
        class150.field2369 = 0;
        class2.field20 = 0;
        class305.field4769 = 0;
        class306.field4823 = 0;
        class310.field4919 = 0;
        class92.field1423 = 0;
        class38.field468 = 0;
        class336.field5219 = 0;
        class204.field3074 = 0;
        class291.field4497 = 0;
        class248.field3902 = 0;
        class138.field2141 = 0;
        class29.field360 = 0;
        class165.field2532 = 0;
        class97.field1505 = 0;
        class97.field1496 = 0;
        class226.field3619 = 0;
        class164.field2524 = 0;
        class117.field1816 = 0;
        class72.field1086 = 0;
        class88.field1325 = 0;
        class88.field1330 = 0;
        class264.field4065 = 0;
        class82.field1216 = 0;
        class160.field2481 = 0;
        class283.field4350 = 0;
        class322.field5025 = 0;
        class177.field2710 = 0;
        class291.field4458 = 0;
        class306.field4819 = 0;
        class61.field851 = 0;
        class125.field1957 = 0;
        class24.field308 = 0;
        class128.field1986 = 0;
        class226.field3608 = 0;
        class93.field1440 = 0;
        class7.field74 = 0;
        class303.field4690 = 0;
        class61.field848 = 0;
        class274.field4212 = 0;
        class30.field377 = 0;
        class82.field1245 = 0;
        class163.field2518 = 0;
        class71.field1069 = 0;
        class101.field1574 = 0;
        class116.field1801 = 0;
        class52.field732 = 0;
        class150.field2364 = 0;
        class142.field2256 = 0;
        class148.field2337 = 0;
        class309.field4861 = 0;
        class294.field4533 = 0;
        client.field2036 = 0;
        class95.field1449 = 0;
        class143.field2274 = 0;
        class277.field4278 = 0;
        class211.field3344 = 0;
        client.field2048 = 0;
        class285.field4367 = 0;
        class7.field77 = 0;
        class121.field1872 = 0;
        class303.field4699 = 0;
        class19.field262 = 0;
        class139.field2154 = 0;
        class221.field3508 = 0;
        class97.field1487 = 0;
        class303.field4744 = 0;
        class63.field947 = 0;
        class97.field1506 = 0;
        class208.field3324 = 0;
        class307.field4841 = 0;
        class289.field4421 = 0;
        class270.field4156 = 0;
        class322.field5019 = 0;
        class113.field1728 = 0;
        class307.field4842 = 0;
        class63.field922 = 0;
        class342.field5333 = 0;
        class305.field4766 = 0;
        class303.field4694 = 0;
        class90.field1370 = 0;
        class218.field3465 = 0;
        class87.field1320 = 0;
        class4.field45 = 0;
        class38.field467 = 0;
        field3559 = 0;
        class92.field1424 = 0;
        class273.field4198 = 0;
        class228.field3665 = 0;
        class64.field976 = 0;
        class214.field3381 = 0;
        class311.field4933 = 0;
        class88.field1335 = 0;
        class309.field4870 = 0;
        class128.field1998 = 0;
        class298.field4612 = 0;
        class152.field2399 = 0;
        class86.field1302 = 0;
        class227.field3636 = 0;
        class82.field1246 = 0;
        class63.field928 = 0;
        class15.field155 = 0;
        class104.field1598 = 0;
        class233.field3737 = 0;
        class59.field840 = 0;
        class173.field2634 = 0;
        class63.field896 = 0;
        class166.field2551 = 0;
        class199.field2995 = 0;
        class90.field1365 = 0;
        class133.field2094 = 0;
        class214.field3382 = 0;
        class54.field767 = 0;
        class136.field2117 = 0;
        class268.field4133 = 0;
        class255.field3987 = 0;
        class74.field1107 = 0;
        class172.field2617 = 0;
        class242.field3829 = 0;
        class171.field2601 = 0;
        class310.field4909 = 0;
        class150.field2365 = 0;
        class248.field3909 = 0;
        class108.field1658 = 0;
        class214.field3387 = 0;
        class334.field5198 = 0;
        class126.field1967 = 0;
        class187.field2848 = 0;
        class194.field2927 = 0;
        class240.field3817 = 0;
        class40.field583 = 0;
        class4.field55 = 0;
        class93.field1437 = 0;
        class97.field1484 = 0;
        field3544 = 0;
        class95.field1463 = 0;
        class33.field422 = 0;
        class56.field776 = 0;
        class339.field5245 = 0;
        class63.field900 = 0;
        class51.field723 = 0;
        class235.field3782 = 0;
        class233.field3743 = 0;
        class275.field4232 = 0;
        class13.field136 = 0;
        class298.field4622 = 0;
        class47.field666 = 0;
        class306.field4825 = 0;
        class83.field1261 = 0;
        class112.field1723 = 0;
        class247.field3880 = 0;
        class63.field898 = 0;
        class265.field4080 = 0;
        class40.field574 = 0;
        class128.field1990 = 0;
        class240.field3816 = 0;
        class294.field4536 = 0;
        class75.field1111 = 0;
        class166.field2553 = 0;
        class51.field720 = 0;
        class210.field3330 = 0;
        class247.field3875 = 0;
        class122.field1891 = 0;
        class24.field305 = 0;
        class117.field1821 = 0;
        class248.field3903 = 0;
        class143.field2263 = 0;
        class200.field3017 = 0;
        class264.field4068 = 0;
        class50.field709 = 0;
        class97.field1511 = 0;
        class253.field3954 = 0;
        class88.field1336 = 0;
        class171.field2599 = 0;
        class63.field906 = 0;
        class294.field4521 = 0;
        class155.field2432 = 0;
        class34.field434 = 0;
        class105.field1618 = 0;
        class339.field5241 = 0;
        class240.field3811 = 0;
        class210.field3326 = 0;
        class205.field3098 = 0;
        class247.field3872 = 0;
        class13.field135 = 0;
        class275.field4233 = 0;
        class298.field4605 = 0;
        class259.field4029 = 0;
        class160.field2485 = 0;
        class70.field1039 = 0;
        class126.field1966 = 0;
        class88.field1347 = 0;
        class289.field4418 = 0;
        class97.field1509 = 0;
        class18.field246 = 0;
        class276.field4260 = 0;
        field3557 = 0;
        class84.field1273 = 0;
        class77.field1156 = 0;
        class158.field2467 = 0;
        class93.field1438 = 0;
        class218.field3458 = 0;
        class265.field4089 = 0;
        class177.field2703 = 0;
        class188.field2873 = 0;
        class303.field4713 = 0;
        class116.field1799 = 0;
        class188.field2868 = 0;
        class63.field886 = 0;
        class303.field4736 = 0;
        class306.field4822 = 0;
        class207.field3241 = 0;
        class151.field2376 = 0;
        class278.field4287 = 0;
        class84.field1265 = 0;
        class122.field1890 = 0;
        class220.field3495 = 0;
        class120.field1850 = 0;
        class303.field4711 = 0;
        class121.field1863 = 0;
        class96.field1480 = 0;
        class259.field4013 = 0;
        class194.field2922 = 0;
        class63.field915 = 0;
        class82.field1210 = 0;
        class175.field2674 = 0;
        class115.field1785 = 0;
        class205.field3104 = 0;
        class249.field3913 = 0;
        class291.field4425 = 0;
        class81.field1195 = 0;
        class303.field4739 = 0;
        class210.field3335 = 0;
        class303.field4743 = 0;
        class268.field4131 = 0;
        field3525 = 0;
        class259.field4031 = 0;
        class306.field4807 = 0;
        class17.field242 = 0;
        class274.field4216 = 0;
        class168.field2574 = 0;
        class288.field4413 = 0;
        client.field2041 = 0;
        class63.field917 = 0;
        class192.field2902 = 0;
        class121.field1858 = 0;
        class100.field1552 = 0;
        class303.field4730 = 0;
        class94.field1443 = 0;
        class208.field3312 = 0;
        class199.field2984 = 0;
        class297.field4558 = 0;
        class245.field3845 = 0;
        class230.field3708 = 0;
        class100.field1562 = 0;
        class306.field4795 = 0;
        class197.field2956 = 0;
        class332.field5136 = 0;
        class105.field1612 = 0;
        class220.field3497 = 0;
        class221.field3512 = 0;
        class79.field1167 = 0;
        class259.field4033 = 0;
        class148.field2334 = 0;
        class207.field3259 = 0;
        class297.field4549 = 0;
        class294.field4539 = 0;
        class128.field2010 = 0;
        class97.field1493 = 0;
        class142.field2259 = 0;
        class43.field606 = 0;
        class291.field4434 = 0;
        class155.field2426 = 0;
        class50.field711 = 0;
        class18.field245 = 0;
        class158.field2471 = 0;
        class2.field7 = 0;
        class233.field3738 = 0;
        class184.field2815 = 0;
        class93.field1439 = 0;
        class184.field2818 = 0;
        class172.field2615 = 0;
        class128.field2015 = 0;
        class100.field1566 = 0;
        class22.field274 = 0;
        class40.field578 = 0;
        class139.field2152 = 0;
        class171.field2603 = 0;
        class112.field1724 = 0;
        class56.field783 = 0;
        class169.field2578 = 0;
        class170.field2598 = 0;
        class330.field5106 = 0;
        class253.field3965 = 0;
        class306.field4828 = 0;
        class218.field3456 = 0;
        class285.field4361 = 0;
        class168.field2568 = 0;
        class291.field4475 = 0;
        class63.field930 = 0;
        class270.field4155 = 0;
        class237.field3802 = 0;
        class196.field2945 = 0;
        class122.field1896 = 0;
        class171.field2604 = 0;
        class277.field4271 = 0;
        class146.field2300 = 0;
        field3534 = 0;
        class2.field23 = 0;
        class303.field4681 = 0;
        class303.field4692 = 0;
        class148.field2351 = 0;
        class323.field5031 = 0;
        class144.field2282 = 0;
        class227.field3629 = 0;
        class303.field4707 = 0;
        class17.field219 = 0;
        class52.field735 = 0;
        class294.field4517 = 0;
        class211.field3343 = 0;
        class97.field1495 = 0;
        class265.field4090 = 0;
        class18.field250 = 0;
        class265.field4078 = 0;
        class128.field1984 = 0;
        class199.field2996 = 0;
        class151.field2375 = 0;
        class198.field2974 = 0;
        class146.field2295 = 0;
        class7.field76 = 0;
        class97.field1514 = 0;
        class293.field4512 = 0;
        class303.field4688 = 0;
        class280.field4313 = 0;
        class63.field888 = 0;
        class146.field2304 = 0;
        class63.field952 = 0;
        class215.field3395 = 0;
        class129.field2020 = 0;
        class68.field1009 = 0;
        class24.field302 = 0;
        class97.field1489 = 0;
        class298.field4617 = 0;
        class160.field2487 = 0;
        class237.field3800 = 0;
        class174.field2646 = 0;
        class298.field4618 = 0;
        class206.field3114 = 0;
        class207.field3182 = 0;
        class78.field1157 = 0;
        class299.field4638 = 0;
        class324.field5049 = 0;
        class289.field4424 = 0;
        class184.field2828 = 0;
        class303.field4683 = 0;
        class240.field3818 = 0;
        class269.field4146 = 0;
        class304.field4746 = 0;
        class187.field2849 = 0;
        class38.field470 = 0;
        class303.field4685 = 0;
        class187.field2844 = 0;
        class230.field3706 = 0;
        class108.field1665 = 0;
        class4.field58 = 0;
        class265.field4079 = 0;
        class307.field4836 = 0;
        class158.field2468 = 0;
        class207.field3133 = 0;
        class154.field2422 = 0;
        class69.field1026 = 0;
        class213.field3370 = 0;
        field3546 = 0;
        class3.field39 = 0;
        class80.field1183 = 0;
        class40.field582 = 0;
        class27.field349 = 0;
        class306.field4805 = 0;
        class58.field825 = 0;
        class40.field577 = 0;
        class170.field2594 = 0;
        class82.field1230 = 0;
        class47.field660 = 0;
        class17.field186 = 0;
        class59.field835 = 0;
        class225.field3603 = 0;
        class289.field4419 = 0;
        class116.field1794 = 0;
        class259.field4019 = 0;
        class294.field4519 = 0;
        class306.field4799 = 0;
        class329.field5089 = 0;
        client.field2037 = 0;
        class227.field3623 = 0;
        class339.field5248 = 0;
        class82.field1235 = 0;
        class259.field4014 = 0;
        class199.field2994 = 0;
        class97.field1510 = 0;
        class17.field161 = 0;
        class122.field1880 = 0;
        class345.field5354 = 0;
        client.field2044 = 0;
        class320.field5013 = 0;
        class130.field2028 = 0;
        class179.field2739 = 0;
        class303.field4680 = 0;
        class298.field4573 = 0;
        class177.field2702 = 0;
        class143.field2272 = 0;
        class148.field2350 = 0;
        class92.field1422 = 0;
        class257.field4002 = 0;
        class86.field1298 = 0;
        class204.field3077 = 0;
        class51.field714 = 0;
        client.field2038 = 0;
        class261.field4041 = 0;
        class334.field5193 = 0;
        class277.field4274 = 0;
        class101.field1568 = 0;
        class330.field5105 = 0;
        class80.field1187 = 0;
        class63.field895 = 0;
        class225.field3593 = 0;
        class39.field569 = 0;
        class330.field5108 = 0;
        class17.field176 = 0;
        client.field2043 = 0;
        class95.field1460 = 0;
        class74.field1097 = 0;
        class227.field3637 = 0;
        class75.field1126 = 0;
        class338.field5236 = 0;
        class206.field3117 = 0;
        class294.field4522 = 0;
        class253.field3964 = 0;
        class143.field2264 = 0;
        class320.field5014 = 0;
        class225.field3586 = 0;
        class155.field2430 = 0;
        class19.field264 = 0;
        class282.field4331 = 0;
        class332.field5138 = 0;
        class24.field300 = 0;
        class319.field5004 = 0;
        class324.field5047 = 0;
        class298.field4590 = 0;
        class63.field939 = 0;
        class85.field1292 = 0;
        class59.field834 = 0;
        class108.field1671 = 0;
        class76.field1138 = 0;
        class247.field3879 = 0;
        class97.field1482 = 0;
        class343.field5340 = 0;
        class293.field4513 = 0;
        class106.field1627 = 0;
        class335.field5217 = 0;
        class200.field3006 = 0;
        class288.field4404 = 0;
        class175.field2686 = 0;
        class285.field4376 = 0;
        class138.field2142 = 0;
        class33.field421 = 0;
        class306.field4796 = 0;
        class221.field3507 = 0;
        class229.field3695 = 0;
        class142.field2253 = 0;
        class168.field2566 = 0;
        class184.field2820 = 0;
        class44.field621 = 0;
        class259.field4016 = 0;
        class93.field1432 = 0;
        class230.field3707 = 0;
        class70.field1038 = 0;
        class304.field4750 = 0;
        class294.field4527 = 0;
        class311.field4931 = 0;
        class280.field4319 = 0;
        class303.field4733 = 0;
        class88.field1334 = 0;
        class39.field570 = 0;
        class324.field5052 = 0;
        class285.field4362 = 0;
        class151.field2372 = 0;
        class291.field4449 = 0;
        class80.field1179 = 0;
        class63.field907 = 0;
        class183.field2812 = 0;
        class38.field512 = 0;
        class304.field4753 = 0;
        class317.field4977 = 0;
        class154.field2420 = 0;
        class17.field216 = 0;
        class96.field1479 = 0;
        class106.field1625 = 0;
        class177.field2696 = 0;
        class204.field3072 = 0;
        class228.field3666 = 0;
        class2.field24 = 0;
        class13.field137 = 0;
        class275.field4229 = 0;
        class63.field938 = 0;
        class75.field1114 = 0;
        class175.field2680 = 0;
        class257.field4005 = 0;
        class294.field4532 = 0;
        field3539 = 0;
        class323.field5033 = 0;
        class225.field3601 = 0;
        class302.field4662 = 0;
        class80.field1184 = 0;
        class303.field4714 = 0;
        class339.field5251 = 0;
        class310.field4912 = 0;
        field3528 = 0;
        class291.field4471 = 0;
        class128.field2005 = 0;
        class190.field2887 = 0;
        class128.field2013 = 0;
        class130.field2025 = 0;
        class38.field498 = 0;
        class6.field60 = 0;
        class294.field4530 = 0;
        class277.field4282 = 0;
        class126.field1972 = 0;
        class172.field2607 = 0;
        class200.field3009 = 0;
        class190.field2875 = 0;
        class330.field5112 = 0;
        class227.field3635 = 0;
        class247.field3867 = 0;
        class306.field4788 = 0;
        class211.field3354 = 0;
        class132.field2074 = 0;
        class115.field1788 = 0;
        class213.field3371 = 0;
        class205.field3092 = 0;
        class194.field2920 = 0;
        class83.field1251 = 0;
        class117.field1815 = 0;
        class248.field3905 = 0;
        class81.field1207 = 0;
        class131.field2058 = 0;
        class305.field4770 = 0;
        class275.field4237 = 0;
        class76.field1137 = 0;
        class229.field3696 = 0;
        class63.field924 = 0;
        class85.field1294 = 0;
        class29.field366 = 0;
        class144.field2283 = 0;
        class128.field1981 = 0;
        class187.field2845 = 0;
        class273.field4197 = 0;
        class200.field3019 = 0;
        class228.field3651 = 0;
        class115.field1787 = 0;
        class303.field4667 = 0;
        class109.field1682 = 0;
        class305.field4773 = 0;
        class234.field3755 = 0;
        class207.field3274 = 0;
        class218.field3482 = 0;
        class303.field4734 = 0;
        client.field2046 = 0;
        class38.field481 = 0;
        class308.field4850 = 0;
        class175.field2683 = 0;
        class37.field459 = 0;
        class4.field53 = 0;
        class199.field2997 = 0;
        class330.field5107 = 0;
        class311.field4930 = 0;
        class44.field624 = 0;
        class97.field1513 = 0;
        class63.field925 = 0;
        class161.field2500 = 0;
        class211.field3348 = 0;
        class288.field4412 = 0;
        class197.field2955 = 0;
        class115.field1784 = 0;
        class83.field1262 = 0;
        class95.field1462 = 0;
        class219.field3491 = 0;
        class88.field1331 = 0;
        class273.field4191 = 0;
        class307.field4838 = 0;
        class90.field1371 = 0;
        class38.field483 = 0;
        class154.field2413 = 0;
        class305.field4772 = 0;
        class29.field362 = 0;
        field3550 = 0;
        class17.field202 = 0;
        class289.field4422 = 0;
        class107.field1639 = 0;
        class143.field2268 = 0;
        class303.field4724 = 0;
        class72.field1077 = 0;
        class107.field1638 = 0;
        class345.field5358 = 0;
        class228.field3661 = 0;
        class309.field4863 = 0;
        class298.field4619 = 0;
        class306.field4817 = 0;
        class104.field1604 = 0;
        class108.field1669 = 0;
        class299.field4635 = 0;
        class63.field948 = 0;
        class163.field2517 = 0;
        class188.field2869 = 0;
        class156.field2444 = 0;
        class6.field66 = 0;
        class94.field1442 = 0;
        class37.field461 = 0;
        class29.field361 = 0;
        field3541 = 0;
        class299.field4639 = 0;
        class82.field1239 = 0;
        class247.field3873 = 0;
        class83.field1255 = 0;
        class197.field2964 = 0;
        class173.field2630 = 0;
        class228.field3653 = 0;
        class108.field1673 = 0;
        class227.field3632 = 0;
        class306.field4794 = 0;
        class80.field1182 = 0;
        class148.field2340 = 0;
        class17.field203 = 0;
        class113.field1725 = 0;
        class262.field4047 = 0;
        class170.field2585 = 0;
        class79.field1169 = 0;
        class154.field2419 = 0;
        class330.field5111 = 0;
        class89.field1356 = 0;
        class320.field5011 = 0;
        class151.field2378 = 0;
        class330.field5110 = 0;
        class64.field972 = 0;
        class83.field1253 = 0;
        class298.field4566 = 0;
        class18.field248 = 0;
        class230.field3709 = 0;
        client.field2051 = 0;
        class63.field921 = 0;
        class226.field3622 = 0;
        class255.field3976 = 0;
        class199.field2991 = 0;
        class269.field4151 = 0;
        class34.field431 = 0;
        class343.field5339 = 0;
        class47.field658 = 0;
        class261.field4042 = 0;
        class122.field1908 = 0;
        class47.field661 = 0;
        class165.field2537 = 0;
        class80.field1192 = 0;
        class146.field2305 = 0;
        class126.field1961 = 0;
        class35.field449 = 0;
        class89.field1361 = 0;
        class323.field5028 = 0;
        class291.field4429 = 0;
        class146.field2301 = 0;
        class85.field1283 = 0;
        class307.field4843 = 0;
        class313.field4949 = 0;
        class299.field4637 = 0;
        client.field2040 = 0;
        class303.field4720 = 0;
        class303.field4696 = 0;
        class266.field4105 = 0;
        class75.field1110 = 0;
        class74.field1098 = 0;
        class2.field14 = 0;
        class264.field4064 = 0;
        class122.field1913 = 0;
        class155.field2424 = 0;
        class172.field2620 = 0;
        class208.field3310 = 0;
        class85.field1285 = 0;
        class280.field4322 = 0;
        client.field2045 = 0;
        class38.field497 = 0;
        class105.field1614 = 0;
        class278.field4289 = 0;
        class259.field4012 = 0;
        class194.field2919 = 0;
        class143.field2266 = 0;
        class273.field4207 = 0;
        class246.field3860 = 0;
        class268.field4130 = 0;
        class38.field562 = 0;
        class85.field1288 = 0;
        class128.field1985 = 0;
        class56.field785 = 0;
        class196.field2936 = 0;
        class3.field38 = 0;
        class253.field3946 = 0;
        class152.field2388 = 0;
        field3543 = 0;
        class334.field5196 = 0;
        class96.field1475 = 0;
        class332.field5135 = 0;
        class190.field2888 = 0;
        class88.field1329 = 0;
        client.field2050 = 0;
        class233.field3739 = 0;
        class168.field2564 = 0;
        class179.field2744 = 0;
        class256.field3997 = 0;
        class76.field1131 = 0;
        class218.field3480 = 0;
        class246.field3856 = 0;
        class211.field3352 = 0;
        class124.field1934 = 0;
        class303.field4717 = 0;
        class213.field3375 = 0;
        class105.field1617 = 0;
        class298.field4630 = 0;
        class173.field2632 = 0;
        class313.field4946 = 0;
        class268.field4137 = 0;
        class82.field1238 = 0;
        class99.field1534 = 0;
        class306.field4824 = 0;
        class206.field3115 = 0;
        class124.field1939 = 0;
        class132.field2079 = 0;
        class22.field284 = 0;
        class204.field3082 = 0;
        class128.field1994 = 0;
        class17.field228 = 0;
        class105.field1616 = 0;
        class85.field1287 = 0;
        class33.field423 = 0;
        class237.field3799 = 0;
        class286.field4379 = 0;
        class13.field132 = 0;
        class15.field152 = 0;
        class283.field4348 = 0;
        class10.field108 = 0;
        class303.field4709 = 0;
        class271.field4163 = 0;
        class86.field1303 = 0;
        class104.field1601 = 0;
        class175.field2676 = 0;
        class307.field4834 = 0;
        class97.field1500 = 0;
        class58.field810 = 0;
        class154.field2423 = 0;
        class10.field93 = 0;
        class230.field3705 = 0;
        class291.field4490 = 0;
        class291.field4465 = 0;
        class304.field4760 = 0;
        class34.field442 = 0;
        class307.field4831 = 0;
        class303.field4669 = 0;
        class226.field3611 = 0;
        class124.field1947 = 0;
        class115.field1786 = 0;
        class214.field3391 = 0;
        class303.field4693 = 0;
        class18.field244 = 0;
        class179.field2749 = 0;
        class335.field5207 = 0;
        class330.field5109 = 0;
        class38.field499 = 0;
        class113.field1727 = 0;
        class112.field1720 = 0;
        class282.field4338 = 0;
        class121.field1873 = 0;
        field3562 = 0;
        class18.field247 = 0;
        class46.field649 = 0;
        class128.field2003 = 0;
        class121.field1866 = 0;
        class70.field1035 = 0;
        class95.field1459 = 0;
        class95.field1457 = 0;
        class47.field667 = 0;
        class17.field169 = 0;
        class313.field4948 = 0;
        class72.field1080 = 0;
        class19.field256 = 0;
        class17.field240 = 0;
        class126.field1970 = 0;
        class303.field4723 = 0;
        class235.field3768 = 0;
        class289.field4420 = 0;
        class192.field2909 = 0;
        class120.field1855 = 0;
        class40.field580 = 0;
        class104.field1611 = 0;
        class221.field3516 = 0;
        class303.field4706 = 0;
        class94.field1446 = 0;
        class128.field1987 = 0;
        class235.field3770 = 0;
        class172.field2624 = 0;
        class128.field1992 = 0;
        class259.field4023 = 0;
        class72.field1088 = 0;
        class87.field1321 = 0;
        class50.field705 = 0;
        class104.field1608 = 0;
        class303.field4727 = 0;
        class211.field3349 = 0;
        class235.field3769 = 0;
        class302.field4659 = 0;
        class179.field2747 = 0;
        class10.field97 = 0;
        class70.field1045 = 0;
        class339.field5259 = 0;
        class76.field1129 = 0;
        class123.field1920 = 0;
        class93.field1434 = 0;
        class305.field4762 = 0;
        class323.field5027 = 0;
        class303.field4715 = 0;
        class84.field1281 = 0;
        class339.field5258 = 0;
        class42.field591 = 0;
        class218.field3462 = 0;
        class38.field471 = 0;
        class120.field1840 = 0;
        class72.field1082 = 0;
        class96.field1471 = 0;
        class158.field2472 = 0;
        class303.field4718 = 0;
        class270.field4157 = 0;
        class339.field5252 = 0;
        class259.field4030 = 0;
        class291.field4462 = 0;
        class310.field4904 = 0;
        class306.field4821 = 0;
        class83.field1263 = 0;
        class108.field1656 = 0;
        class273.field4192 = 0;
        class163.field2516 = 0;
        class75.field1115 = 0;
        class92.field1430 = 0;
        class185.field2829 = 0;
        class303.field4695 = 0;
        class322.field5023 = 0;
        class173.field2637 = 0;
        class268.field4129 = 0;
        class123.field1926 = 0;
        class173.field2635 = 0;
        class128.field2014 = 0;
        class52.field741 = 0;
        class306.field4811 = 0;
        class163.field2514 = 0;
        class84.field1269 = 0;
        class72.field1081 = 0;
        class305.field4774 = 0;
        class105.field1620 = 0;
        class33.field427 = 0;
        class210.field3327 = 0;
        class77.field1150 = 0;
        class236.field3792 = 0;
        class71.field1067 = 0;
        class6.field69 = -1;
        for (int var1 = 0; var1 < class81.field1204.length; var1++) {
            class81.field1204[var1] = null;
        }
        class168.field2565 = 0;
        class260.field4036 = false;
        class101.method687(0, (byte) -122);
        for (int var2 = 0; var2 < 100; var2++) {
            class226.field3615[var2] = null;
        }
        class265.field4098 = (int) (Math.random() * 80.0D) - 40;
        class104.field1610 = (int) (Math.random() * 110.0D) - 55;
        class278.field4288 = 0;
        class228.field3669 = 0;
        class175.field2678 = 0;
        class228.field3660 = 0;
        class120.field1841 = false;
        class138.field2133 = (int) (Math.random() * 120.0D) - 60;
        class299.field4643 = (int) (Math.random() * 100.0D) - 50;
        class14.field148 = (int) (Math.random() * 30.0D) - 20;
        class133.field2099 = 0;
        class155.field2439 = 0;
        class34.field445 = -1;
        class123.field1922 = (float) ((int) (Math.random() * 20.0D) - 10 & 0x7FF);
        class81.field1199 = 0;
        class271.field4162 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class64.field966[var3] = null;
            class70.field1050[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class208.field3313[var4] = null;
        }
        class79.field1173 = class64.field966[2047] = new class82();
        class39.field568.method5(56);
        class18.field252.method5(66);
        if (class274.field4221 != null) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        class274.field4221[var5][var6][var7] = null;
                    }
                }
            }
        }
        class203.field3069 = new class2();
        class144.field2289 = 0;
        class116.field1795 = 0;
        client.method891(-38);
        class288.method1877((byte) -113);
        class284.field4357 = 0;
        class29.field365 = 0;
        class27.field348 = 0;
        class160.field2491 = 0;
        class90.field1364 = 0;
        class269.field4147 = 0;
        class131.field2067 = 0;
        class84.field1270 = 0;
        class213.field3379 = 0;
        class184.field2821 = 0;
        for (int var8 = 0; var8 < class286.field4382.length; var8++) {
            class286.field4382[var8] = -1;
        }
        if (class253.field3936 != -1) {
            class323.method2189(class253.field3936, 0);
        }
        for (class45 var9 = (class45) class166.field2557.method1549((byte) -43); var9 != null; var9 = (class45) class166.field2557.method1546(-1)) {
            class157.method1095(var9, true, -18772);
        }
        class253.field3936 = -1;
        class166.field2557 = new class227(8);
        class126.method847(-102);
        class168.field2565 = 0;
        class108.field1674 = null;
        class260.field4036 = false;
        class44.field632.method1165(127, -1, -1, (int[]) null, false, new int[] { 0, 0, 0, 0, 0 });
        for (int var10 = 0; var10 < 8; var10++) {
            class245.field3851[var10] = null;
            class278.field4292[var10] = false;
            class315.field4960[var10] = -1;
        }
        class132.method907(25323);
        class52.field734 = true;
        for (int var11 = 0; var11 < 100; var11++) {
            class2.field12[var11] = true;
        }
        class146.field2297 = null;
        class172.field2628 = 0;
        class124.field1940 = null;
        for (int var12 = 0; var12 < 6; var12++) {
            class106.field1623[var12] = new class196();
        }
        for (int var13 = 0; var13 < 25; var13++) {
            class314.field4951[var13] = 0;
            class139.field2156[var13] = 0;
            class205.field3106[var13] = 0;
        }
        if (class333.field5166) {
            class323.method2186(-110);
        }
        class319.field5002 = false;
        class171.field2602 = true;
        class166.field2558 = 0;
        class117.field1804 = class236.field3794 = class185.field2830 = class256.field3996 = new short[256];
        class23.field291 = class306.field4801;
        class315.method2150((byte) 30);
        class151.field2373 = false;
        class95.method646(0);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BII)V", line = 2710)
    public static final void method1492(byte arg0, int arg1, int arg2) {
        class265.field4095.method2064(255, 183);
        field3557++;
        class265.field4095.method2012(99, arg1);
        if (arg0 != 23) {
            field3532 = (class306) null;
        }
        class265.field4095.method2007(false, arg2);
        class155.field2426++;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V", line = 2742)
    public final void method1493(byte arg0) {
        if (this.field3527 == -1) {
            if (this.field3533 == null) {
                this.field3527 = 0;
            } else {
                this.field3527 = 2;
            }
        }
        if (this.field3531 == -1) {
            if (this.field3533 == null) {
                this.field3531 = 0;
            } else {
                this.field3531 = 2;
            }
        }
        if (arg0 != -63) {
            this.method1481(3, -88, 49, -103, 101, (class295) null);
        }
        field3541++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lg;IBII)Lg;", line = 2804)
    public final class295 method1494(class295 arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3558++;
        int var6 = this.field3522[arg1];
        int var7 = this.field3529[arg1];
        class89 var8 = class96.method658(var7 >> 16, (byte) 118);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg0.method981(true, true, true);
        }
        int var10 = -100 % ((-arg2 - 52) / 40);
        class89 var11 = null;
        if ((this.field3538 || class129.field2024) && arg4 != -1 && this.field3529.length > arg4) {
            int var12 = this.field3529[arg4];
            var11 = class96.method658(var12 >> 16, (byte) 114);
            arg4 = var12 & 0xFFFF;
        }
        class295 var13;
        if (var11 == null) {
            var13 = arg0.method981(!var8.method613((byte) -125, var9), !var8.method614((byte) 72, var9), !this.field3554);
        } else {
            var13 = arg0.method981(!var8.method613((byte) -121, var9) & !var11.method613((byte) -60, arg4), !var8.method614((byte) 114, var9) & !var11.method614((byte) 64, arg4), !this.field3554);
        }
        var13.method1935(var8, var9, var11, arg4, arg3 - 1, var6, this.field3554);
        return var13;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 2837)
    public static final void method1495(Component arg0, byte arg1) {
        arg0.addMouseListener(class275.field4238);
        if (arg1 > -98) {
            method1488((byte) -116, 126, -96, false, (class174[][][]) ((class174[][][]) null), 26);
        }
        arg0.addMouseMotionListener(class275.field4238);
        arg0.addFocusListener(class275.field4238);
        field3543++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLgn;I)V", line = 2850)
    private final void method1496(byte arg0, class303 arg1, int arg2) {
        if (arg2 == 1) {
            int var13 = arg1.method1994(false);
            this.field3522 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3522[var14] = arg1.method1994(false);
            }
            this.field3529 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field3529[var15] = arg1.method1994(false);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field3529[var16] += arg1.method1994(false) << 16;
            }
        } else if (arg2 == 2) {
            this.field3540 = arg1.method1994(false);
        } else if (arg2 == 3) {
            this.field3533 = new boolean[256];
            int var4 = arg1.method2043((byte) -124);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3533[arg1.method2043((byte) -112)] = true;
            }
        } else if (arg2 == 4) {
            this.field3553 = true;
        } else if (arg2 == 5) {
            this.field3560 = arg1.method2043((byte) -107);
        } else if (arg2 == 6) {
            this.field3524 = arg1.method1994(false);
        } else if (arg2 == 7) {
            this.field3545 = arg1.method1994(false);
        } else if (arg2 == 8) {
            this.field3535 = arg1.method2043((byte) -121);
        } else if (arg2 == 9) {
            this.field3527 = arg1.method2043((byte) -104);
        } else if (arg2 == 10) {
            this.field3531 = arg1.method2043((byte) -106);
        } else if (arg2 == 11) {
            this.field3552 = arg1.method2043((byte) -126);
        } else if (arg2 == 12) {
            int var6 = arg1.method2043((byte) -120);
            this.field3551 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3551[var7] = arg1.method1994(false);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field3551[var8] += arg1.method1994(false) << 16;
            }
        } else if (arg2 == 13) {
            int var9 = arg1.method1994(false);
            this.field3556 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg1.method2043((byte) -110);
                if (var11 > 0) {
                    this.field3556[var10] = new int[var11];
                    this.field3556[var10][0] = arg1.method2059(arg0 + 156);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field3556[var10][var12] = arg1.method1994(false);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field3554 = true;
        } else if (arg2 == 15) {
            this.field3538 = true;
        } else if (arg2 == 16) {
            this.field3530 = true;
        }
        if (arg0 != 99) {
            this.field3551 = (int[]) null;
        }
        field3559++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBIILg;)Lg;", line = 3026)
    public final class295 method1497(int arg0, byte arg1, int arg2, int arg3, class295 arg4) {
        field3528++;
        int var6 = this.field3522[arg0];
        int var7 = this.field3529[arg0];
        class89 var8 = class96.method658(var7 >> 16, (byte) 123);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg4.method989(true, true, true);
        }
        class89 var10 = null;
        class89 var11 = null;
        if ((this.field3538 || class129.field2024) && arg3 != -1 && this.field3529.length > arg3) {
            int var12 = this.field3529[arg3];
            var10 = class96.method658(var12 >> 16, (byte) 117);
            arg3 = var12 & 0xFFFF;
        }
        class89 var13 = null;
        int var14 = 0;
        int var15 = 0;
        if (this.field3551 != null) {
            if (arg0 < this.field3551.length) {
                var14 = this.field3551[arg0];
                if (var14 != 65535) {
                    var11 = class96.method658(var14 >> 16, (byte) 123);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field3538 || class129.field2024) && arg3 != -1 && this.field3551.length > arg3) {
                var15 = this.field3551[arg3];
                if (var15 != 65535) {
                    var13 = class96.method658(var15 >> 16, (byte) 116);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method613((byte) -54, var9);
        if (arg1 >= -24) {
            return (class295) null;
        }
        boolean var17 = !var8.method614((byte) 56, var9);
        if (var11 != null) {
            var16 &= !var11.method613((byte) 121, var14);
            var17 &= !var11.method614((byte) 23, var14);
        }
        if (var10 != null) {
            var16 &= !var10.method613((byte) -107, arg3);
            var17 &= !var10.method614((byte) 93, arg3);
        }
        if (var13 != null) {
            var16 &= !var13.method613((byte) -60, var15);
            var17 &= !var13.method614((byte) 70, var15);
        }
        class295 var18 = arg4.method989(var16, var17, !this.field3554);
        var18.method1935(var8, var9, var10, arg3, arg2 - 1, var6, this.field3554);
        if (var11 != null) {
            var18.method1935(var11, var14, var13, var15, arg2 - 1, var6, this.field3554);
        }
        return var18;
    }
}
