import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class31 {

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public int field471 = 2;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Z")
    public boolean field466 = false;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public int field475 = 5;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public int field473 = -1;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public int field467 = -1;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Z")
    public boolean field469 = false;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public int field480 = -1;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "Z")
    public boolean field484 = false;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public int field481 = 99;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public int field489 = -1;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    public int field490 = -1;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Z")
    public boolean field472 = false;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public static int field483 = 1;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "Lnh;")
    public static class54 field491 = new class54(64);

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    public static int field493 = 0;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "I")
    public static int field492 = 0;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "Lcf;")
    private static class93 field498 = class147.method1066(" ", -48);

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    public static int field497 = 0;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "Lcf;")
    private static class93 field499 = class147.method1066("Members object", -48);

    @OriginalMember(owner = "client!na", name = "L", descriptor = "Lcf;")
    public static class93 field501 = field499;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "Lcf;")
    public static class93 field495 = class147.method1066("Gegenstand f-Ur Mitglieder", -48);

    @OriginalMember(owner = "client!na", name = "G", descriptor = "Lcf;")
    public static class93 field496 = field498;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "Lcf;")
    public static class93 field500 = class147.method1066("p12_full", -48);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "[I")
    private int[] field476;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "[I")
    public int[] field479;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "[I")
    public int[] field486;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "[I")
    public static int[] field494;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "[Z")
    public boolean[] field482;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "[[I")
    public int[][] field470;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILbk;IIB)Lbk;")
    public final class20 method179(int arg0, class20 arg1, int arg2, int arg3, byte arg4) {
        int var6 = this.field486[arg2];
        int var7 = this.field479[arg2];
        field485++;
        class138 var8 = class65.method452(-116, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (arg4 < 53) {
            this.method179(-18, (class20) null, 99, -38, (byte) -33);
        }
        if (var8 == null) {
            return arg1.method94(true, true, true);
        }
        class138 var10 = null;
        class138 var11 = null;
        class138 var12 = null;
        if ((this.field472 || class148.field2612) && arg0 != -1 && arg0 < this.field479.length) {
            int var13 = this.field479[arg0];
            var11 = class65.method452(-126, var13 >> 16);
            arg0 = var13 & 0xFFFF;
        }
        int var14 = 0;
        int var15 = 0;
        if (this.field476 != null) {
            if (this.field476.length > arg2) {
                var14 = this.field476[arg2];
                if (var14 != 65535) {
                    var10 = class65.method452(-121, var14 >> 16);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field472 || class148.field2612) && arg0 != -1 && arg0 < this.field476.length) {
                var15 = this.field476[arg0];
                if (var15 != 65535) {
                    var12 = class65.method452(-121, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method1006(var9, false);
        boolean var17 = !var8.method1005(-24204, var9);
        if (var10 != null) {
            var16 &= !var10.method1006(var14, false);
            var17 &= !var10.method1005(-24204, var14);
        }
        if (var11 != null) {
            var16 &= !var11.method1006(arg0, false);
            var17 &= !var11.method1005(-24204, arg0);
        }
        if (var12 != null) {
            var16 &= !var12.method1006(var15, false);
            var17 &= !var12.method1005(-24204, var15);
        }
        class20 var18 = arg1.method94(var16, var17, !this.field466);
        var18.method115(var8, var9, var11, arg0, arg3 - 1, var6, this.field466);
        if (var10 != null) {
            var18.method115(var10, var14, var12, var15, arg3 - 1, var6, this.field466);
        }
        return var18;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)V")
    public static final void method180(boolean arg0, int arg1) {
        field487++;
        if (arg1 != -21895) {
            return;
        }
        class141.field2453 = arg0;
        if (!class141.field2453) {
            int var25 = (class72.field1300 - class250.field4504.field5027) / 16;
            class39.field597 = new int[var25][4];
            for (int var26 = 0; var26 < var25; var26++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class39.field597[var26][var37] = class250.field4504.method1926(-2097152);
                }
            }
            int var27 = class250.field4504.method1890(false);
            boolean var28 = false;
            int var29 = class250.field4504.method1876((byte) -82);
            int var30 = class250.field4504.method1890(false);
            int var31 = class250.field4504.method1909((byte) 125);
            int var32 = class250.field4504.method1877((byte) -26);
            class183.field3381 = null;
            class149.field2614 = new int[var25];
            class198.field3607 = new int[var25];
            if ((var32 / 8 == 48 || (var32 / 8) == 49) && var27 / 8 == 48) {
                var28 = true;
            }
            class206.field3704 = new int[var25];
            class72.field1292 = new int[var25];
            class251.field4526 = new int[var25];
            class50.field827 = new byte[var25][];
            if (var32 / 8 == 48 && (var27 / 8) == 148) {
                var28 = true;
            }
            class204.field3675 = new byte[var25][];
            class288.field5148 = null;
            int var33 = 0;
            for (int var34 = (var32 - 6) / 8; var34 <= ((var32 + 6) / 8); var34++) {
                for (int var35 = (var27 - 6) / 8; var35 <= ((var27 + 6) / 8); var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (var28 && var35 == 49 || var35 == 149 || var35 == 147 || var34 == 50 || !(var34 != 49 || var35 != 47)) {
                        class149.field2614[var33] = var36;
                        class72.field1292[var33] = -1;
                        class251.field4526[var33] = -1;
                        class198.field3607[var33] = -1;
                        class206.field3704[var33] = -1;
                    } else {
                        class149.field2614[var33] = var36;
                        class72.field1292[var33] = class1.field11.method1277(class130.method949((byte) -77, new class93[] { class188.field3454, class148.method1067(-7015, var34), class15.field197, class148.method1067(-7015, var35) }), (byte) 74);
                        class251.field4526[var33] = class1.field11.method1277(class130.method949((byte) -77, new class93[] { class87.field1563, class148.method1067(-7015, var34), class15.field197, class148.method1067(arg1 + 14880, var35) }), (byte) 74);
                        class198.field3607[var33] = class1.field11.method1277(class130.method949((byte) -77, new class93[] { class174.field3034, class148.method1067(-7015, var34), class15.field197, class148.method1067(-7015, var35) }), (byte) 74);
                        class206.field3704[var33] = class1.field11.method1277(class130.method949((byte) -77, new class93[] { class232.field4140, class148.method1067(-7015, var34), class15.field197, class148.method1067(-7015, var35) }), (byte) 74);
                    }
                    var33++;
                }
            }
            class125.method920(var27, false, var29, var32, 8, var31, var30);
            return;
        }
        int var2 = class250.field4504.method1891(-125);
        int var3 = class250.field4504.method1879(1483502360);
        int var4 = class250.field4504.method1877((byte) -26);
        int var5 = class250.field4504.method1909((byte) 44);
        class250.field4504.method1570((byte) 126);
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class250.field4504.method1569(false, 1);
                    if (var24 == 1) {
                        class126.field2231[var6][var22][var23] = class250.field4504.method1569(false, 26);
                    } else {
                        class126.field2231[var6][var22][var23] = -1;
                    }
                }
            }
        }
        class250.field4504.method1571(115);
        int var7 = (class72.field1300 - class250.field4504.field5027) / 16;
        class39.field597 = new int[var7][4];
        for (int var8 = 0; var8 < var7; var8++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class39.field597[var8][var21] = class250.field4504.method1917((byte) -119);
            }
        }
        int var9 = class250.field4504.method1890(false);
        class183.field3381 = null;
        class72.field1292 = new int[var7];
        class204.field3675 = new byte[var7][];
        class288.field5148 = null;
        class198.field3607 = new int[var7];
        class206.field3704 = new int[var7];
        class251.field4526 = new int[var7];
        class50.field827 = new byte[var7][];
        class149.field2614 = new int[var7];
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 13; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    int var14 = class126.field2231[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = (var14 & 0xFFC742) >> 14;
                        int var16 = (var14 & 0x3FFB) >> 3;
                        int var17 = (var15 / 8 << 8) + (var16 / 8);
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class149.field2614[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            class149.field2614[var10] = var17;
                            int var19 = var17 >> 8 & 0xFF;
                            int var20 = var17 & 0xFF;
                            class72.field1292[var10] = class1.field11.method1277(class130.method949((byte) -77, new class93[] { class188.field3454, class148.method1067(-7015, var19), class15.field197, class148.method1067(-7015, var20) }), (byte) 74);
                            class251.field4526[var10] = class1.field11.method1277(class130.method949((byte) -77, new class93[] { class87.field1563, class148.method1067(-7015, var19), class15.field197, class148.method1067(-7015, var20) }), (byte) 74);
                            class198.field3607[var10] = class1.field11.method1277(class130.method949((byte) -77, new class93[] { class174.field3034, class148.method1067(-7015, var19), class15.field197, class148.method1067(-7015, var20) }), (byte) 74);
                            class206.field3704[var10] = class1.field11.method1277(class130.method949((byte) -77, new class93[] { class232.field4140, class148.method1067(arg1 + 14880, var19), class15.field197, class148.method1067(-7015, var20) }), (byte) 74);
                            var10++;
                        }
                    }
                }
            }
        }
        class125.method920(var5, false, var3, var4, 8, var2, var9);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lee;I)V")
    public final void method181(class280 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field474++;
        while (true) {
            int var3 = arg0.method1907(16832);
            if (var3 == 0) {
                return;
            }
            this.method187(var3, arg1 ^ 0xFFFFFF83, arg0);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static final void method182(int arg0) {
        if (class172.field3011 != null) {
            class266 var1 = class172.field3011;
            synchronized (class172.field3011) {
                class172.field3011 = null;
            }
        }
        field465++;
        if (arg0 != -2) {
            field496 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public final void method183(byte arg0) {
        if (this.field490 == -1) {
            if (this.field482 == null) {
                this.field490 = 0;
            } else {
                this.field490 = 2;
            }
        }
        if (this.field473 == -1) {
            if (this.field482 == null) {
                this.field473 = 0;
            } else {
                this.field473 = 2;
            }
        }
        if (arg0 != -113) {
            this.method184(-99, -80, -13, 70, (class20) null);
        }
        field478++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIILbk;)Lbk;")
    public final class20 method184(int arg0, int arg1, int arg2, int arg3, class20 arg4) {
        field488++;
        int var6 = this.field486[arg3];
        int var7 = this.field479[arg3];
        class138 var8 = class65.method452(arg1 + 424149045, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg4.method104(true, true, true);
        }
        class138 var10 = null;
        if ((this.field472 || class148.field2612) && arg2 != -1 && arg2 < this.field479.length) {
            int var11 = this.field479[arg2];
            var10 = class65.method452(-122, var11 >> 16);
            arg2 = var11 & 0xFFFF;
        }
        class20 var12;
        if (var10 == null) {
            var12 = arg4.method104(!var8.method1006(var9, false), !var8.method1005(-24204, var9), !this.field466);
        } else {
            var12 = arg4.method104(!var8.method1006(var9, false) & !var10.method1006(arg2, false), !var8.method1005(-24204, var9) & !var10.method1005(-24204, arg2), !this.field466);
        }
        if (arg1 != -424149168) {
            this.method184(29, 86, -96, -96, (class20) null);
        }
        var12.method115(var8, var9, var10, arg2, arg0 - 1, var6, this.field466);
        return var12;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static void method185(int arg0) {
        field500 = null;
        field494 = null;
        field491 = null;
        field496 = null;
        if (arg0 >= -123) {
            field493 = 26;
        }
        field495 = null;
        field501 = null;
        field498 = null;
        field499 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIILbk;I)Lbk;")
    public final class20 method186(int arg0, int arg1, int arg2, int arg3, class20 arg4, int arg5) {
        field468++;
        int var7 = this.field486[arg5];
        if (arg1 != 2) {
            return null;
        }
        int var8 = this.field479[arg5];
        class138 var9 = class65.method452(-124, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method118(true, true, true);
        }
        int var11 = arg2 & 0x3;
        class138 var12 = null;
        if ((this.field472 || class148.field2612) && arg3 != -1 && arg3 < this.field479.length) {
            int var13 = this.field479[arg3];
            var12 = class65.method452(arg1 ^ 0xFFFFFF80, var13 >> 16);
            arg3 = var13 & 0xFFFF;
        }
        class20 var14;
        if (var12 == null) {
            var14 = arg4.method118(!var9.method1006(var10, false), !var9.method1005(-24204, var10), !this.field466);
        } else {
            var14 = arg4.method118(!var9.method1006(var10, false) & !var12.method1006(arg3, false), !var9.method1005(arg1 - 24206, var10) & !var12.method1005(-24204, arg3), !this.field466);
        }
        if (var11 == 1) {
            var14.method92();
        } else if (var11 == 2) {
            var14.method97();
        } else if (var11 == 3) {
            var14.method91();
        }
        var14.method115(var9, var10, var12, arg3, arg0 - 1, var7, this.field466);
        if (var11 == 1) {
            var14.method91();
        } else if (var11 == 2) {
            var14.method97();
        } else if (var11 == 3) {
            var14.method92();
        }
        return var14;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILee;)V")
    private final void method187(int arg0, int arg1, class280 arg2) {
        int var4 = 99 / ((arg1 + 48) / 53);
        if (arg0 == 1) {
            int var5 = arg2.method1891(-127);
            this.field486 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field486[var6] = arg2.method1891(-112);
            }
            this.field479 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                this.field479[var7] = arg2.method1891(-127);
            }
            for (int var8 = 0; var8 < var5; var8++) {
                this.field479[var8] = (arg2.method1891(-116) << 16) + this.field479[var8];
            }
        } else if (arg0 == 2) {
            this.field489 = arg2.method1891(-118);
        } else if (arg0 == 3) {
            this.field482 = new boolean[256];
            int var16 = arg2.method1907(16832);
            for (int var17 = 0; var17 < var16; var17++) {
                this.field482[arg2.method1907(16832)] = true;
            }
        } else if (arg0 == 4) {
            this.field484 = true;
        } else if (arg0 == 5) {
            this.field475 = arg2.method1907(16832);
        } else if (arg0 == 6) {
            this.field467 = arg2.method1891(-121);
        } else if (arg0 == 7) {
            this.field480 = arg2.method1891(-111);
        } else if (arg0 == 8) {
            this.field481 = arg2.method1907(16832);
        } else if (arg0 == 9) {
            this.field473 = arg2.method1907(16832);
        } else if (arg0 == 10) {
            this.field490 = arg2.method1907(16832);
        } else if (arg0 == 11) {
            this.field471 = arg2.method1907(16832);
        } else if (arg0 == 12) {
            int var13 = arg2.method1907(16832);
            this.field476 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field476[var14] = arg2.method1891(-117);
            }
            for (int var15 = 0; var15 < var13; var15++) {
                this.field476[var15] += arg2.method1891(-121) << 16;
            }
        } else if (arg0 == 13) {
            int var9 = arg2.method1891(-128);
            this.field470 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg2.method1907(16832);
                if (var11 > 0) {
                    this.field470[var10] = new int[var11];
                    this.field470[var10][0] = arg2.method1893((byte) -121);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field470[var10][var12] = arg2.method1891(-125);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field466 = true;
        } else if (arg0 == 15) {
            this.field472 = true;
        } else if (arg0 == 16) {
            this.field469 = true;
        }
        field477++;
    }
}
