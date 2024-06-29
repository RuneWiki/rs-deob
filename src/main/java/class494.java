import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class494 extends class92 {

    @OriginalMember(owner = "client!ku", name = "y", descriptor = "Z")
    private boolean field6934 = false;

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "Z")
    private boolean field6935;

    @OriginalMember(owner = "client!ku", name = "q", descriptor = "[Luba;")
    private class628[] field6926;

    @OriginalMember(owner = "client!ku", name = "r", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!ku", name = "s", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!ku", name = "t", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!ku", name = "u", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!ku", name = "v", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!ku", name = "w", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!ku", name = "x", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!ku", name = "B", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!ku", name = "C", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILqv;)V")
    public final void method672(int arg0, int arg1, class96 arg2) {
        super.field1635.method3577(arg2, true);
        if (arg0 != 0) {
            this.field6926 = null;
        }
        ++field6933;
        super.field1635.method3600(-111, arg1);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZB)V")
    public final void method671(boolean arg0, byte arg1) {
        ++field6927;
        if (this.field6926 != null && arg0) {
            super.field1635.method3645(1, (byte) 91);
            super.field1635.method118(class491.field6900, (byte) 110);
            class516 var3 = super.field1635.method3595((byte) 40);
            var3.method881(1024);
            super.field1635.method3616(class338.field4855, (byte) 94);
            if (!this.field6935) {
                super.field1635.method3583(false, class634.field9219, class635.field9225);
                super.field1635.method3601(-10, class554.field7834, 0);
                super.field1635.method3645(2, (byte) 91);
                super.field1635.method3583(false, class211.field3065, class634.field9219);
                super.field1635.method3601(arg1 + -219, class554.field7834, 0);
                super.field1635.method97(false, true, arg1 + -99, class554.field7834, 1);
                super.field1635.method3570(class371.field5369, 0, (byte) 10);
                super.field1635.method3577(super.field1635.field9119, true);
            } else {
                super.field1635.method3583(false, class211.field3065, class634.field9219);
                super.field1635.method97(false, true, 8, class477.field6813, 0);
                super.field1635.method3570(class371.field5369, 0, (byte) -107);
            }
            super.field1635.method3645(0, (byte) 91);
            this.field6934 = true;
        } else {
            super.field1635.method3570(class371.field5369, 0, (byte) 92);
        }
        if (arg1 != 107) {
            this.field6935 = false;
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lnd;)V")
    public class494(class632 arg0) {
        super(arg0);
        if (arg0.field9146) {
            this.field6935 = ~arg0.field9109 > -4;
            int var2 = this.field6935 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var12;
                        } else if (~var14 != -2) {
                            if (~var14 != -3) {
                                if (var14 == 3) {
                                    var15 = -var13;
                                } else if (var14 != 4) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = var13;
                            }
                        } else {
                            var15 = var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field6926 = new class628[3];
            this.field6926[0] = super.field1635.method93(64, var4, (byte) 61, false);
            this.field6926[1] = super.field1635.method93(64, var5, (byte) 74, false);
            this.field6926[2] = super.field1635.method93(64, var3, (byte) 98, false);
        }
    }

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "(B)V")
    public static final void method2817(byte arg0) {
        class210.field2968 = new class406(8);
        ++field6937;
        class583.field8315 = 0;
        class585 var1 = (class585) class501.field7030.method944(arg0 + -156);
        if (arg0 != 32) {
            method2817((byte) 86);
        }
        while (var1 != null) {
            var1.method3344();
            var1 = (class585) class501.field7030.method947((byte) 120);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)Z")
    public final boolean method673(int arg0) {
        if (arg0 != -1) {
            return true;
        } else {
            ++field6931;
            return true;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZI)V")
    public final void method676(boolean arg0, int arg1) {
        super.field1635.method3583(false, class635.field9225, class634.field9219);
        if (arg1 > -65) {
            this.method673(-110);
        }
        ++field6928;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)V")
    public final void method669(byte arg0) {
        ++field6936;
        if (this.field6934) {
            super.field1635.method3645(1, (byte) 91);
            super.field1635.method3577((class96) null, true);
            super.field1635.method118(class471.field6774, (byte) -54);
            super.field1635.method3627(-88);
            if (!this.field6935) {
                super.field1635.method3583(false, class635.field9225, class635.field9225);
                super.field1635.method3601(-23, class477.field6813, 0);
                super.field1635.method3645(2, (byte) 91);
                super.field1635.method3583(false, class635.field9225, class635.field9225);
                super.field1635.method3601(-116, class477.field6813, 0);
                super.field1635.method3601(-33, class554.field7834, 1);
                super.field1635.method3570(class477.field6813, 0, (byte) -80);
                super.field1635.method3577((class96) null, true);
            } else {
                super.field1635.method3583(false, class635.field9225, class635.field9225);
                super.field1635.method3601(-100, class477.field6813, 0);
                super.field1635.method3570(class477.field6813, 0, (byte) -109);
            }
            super.field1635.method3645(0, (byte) 91);
            this.field6934 = false;
        } else {
            super.field1635.method3570(class477.field6813, 0, (byte) 126);
        }
        super.field1635.method3583(false, class635.field9225, class635.field9225);
        if (arg0 < 55) {
            method2818(-30, (class167) null, 90, -95);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILqa;II)V")
    public static final void method2818(int arg0, class167 arg1, int arg2, int arg3) {
        ++field6932;
        if (arg2 >= 0 && ~arg0 <= -1 && ~class449.field6544 != -1 && class35.field484 != 0) {
            arg1.method519(class431.field6285, class536.field7487, class449.field6544, class35.field484);
            arg1.method615(class541.field7536, class367.field5208, class449.field6544, class35.field484);
            class105 var4 = arg1.method623();
            var4.method888(class349.field4999, class183.field2644, class81.field1445, class466.field6719, class262.field3830, class64.field894);
            arg1.method587(var4);
            if (class587.field8363 != null) {
                int var5 = -1;
                int var6 = -1;
                int var7 = arg1.method537();
                int var8 = (-class431.field6285 + arg2) * var7 / class449.field6544;
                int var9 = (-class536.field7487 + arg0) * var7 / class35.field484;
                int var10 = arg1.method531();
                int var11 = (-class431.field6285 + arg2) * var10 / class449.field6544;
                int var12 = (-class536.field7487 + arg0) * var10 / class35.field484;
                int[] var13 = new int[] { var8, var9, var7 };
                var4.method891(var13);
                int[] var14 = new int[] { var11, var12, var10 };
                var4.method891(var14);
                float var15 = 0.0F;
                int var16 = var14[0] - var13[0];
                int var17 = var14[1] - var13[1];
                int var18 = var14[2] + -var13[2];
                while (var15 < 1.0F) {
                    int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                    int var20 = var19 >> 7;
                    int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                    int var22 = var21 >> 7;
                    if (~var20 < -1 && ~var22 < -1 && var20 < class146.field2247 && ~class66.field990 < ~var22) {
                        int var23 = class644.field9367.field5116;
                        if (~var23 > -4 && (2 & class104.field1755[1][var20][var22]) != 0) {
                            ++var23;
                        }
                        if ((float) class587.field8363[var23].method695(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                            var5 = var19 + (-1 + class644.field9367.method781((byte) 110) << 6) >> 7;
                            var6 = (-1 + class644.field9367.method781((byte) -123) << 6) + var21 >> 7;
                            break;
                        }
                    }
                    var15 = (float) ((double) var15 + 0.01D);
                }
                if (~var5 != 0 && var6 != -1) {
                    if (class90.field1620 && (64 & class549.field7789) != 0) {
                        class549 var24 = class547.method3061(4096, class388.field5795, class293.field4224);
                        if (var24 == null) {
                            class294.method1853(arg3 ^ -50);
                        } else {
                            class366.method2209(class335.field4799, var6, 20, -1, true, 0L, -1, var5, class511.field7082, false, " ->");
                        }
                    } else {
                        if (class78.field1412 == class640.field9282) {
                            class366.method2209(-1, var6, 59, -1, true, 0L, -1, var5, class592.field8411.method3220(false, class538.field7500), false, "");
                        }
                        class366.method2209(class201.field2841, var6, 46, -1, true, 0L, -1, var5, class488.field6873, false, "");
                        ++class130.field2116;
                    }
                }
            }
            class115 var25 = class578.field8241;
            if (arg3 == -1) {
                for (class465 var26 = (class465) var25.method944(arg3 ^ 123); var26 != null; var26 = (class465) var25.method947((byte) -13)) {
                    if ((class69.field1308 || class644.field9367.field5116 == var26.field6712) && var26.method2709(arg0, 0, arg2, arg1)) {
                        if (var26.field6710 instanceof class400) {
                            class400 var27 = (class400) var26.field6710;
                            int var28 = var27.method781((byte) -118);
                            if (~(var28 & 1) == -1 && (var27.field5108 & 127) == 0 && ~(var27.field5109 & 127) == -1 || (var28 & 1) == 1 && ~(127 & var27.field5108) == -65 && ~(127 & var27.field5109) == -65) {
                                int var29 = var27.field5108 + -(var27.method781((byte) -93) + -1 << 6);
                                int var30 = var27.field5109 - (var27.method781((byte) 117) - 1 << 6);
                                for (int var31 = 0; ~var31 > ~class128.field2098; ++var31) {
                                    class181 var38 = (class181) class432.field6368.method740(0, (long) class591.field8401[var31]);
                                    if (var38 != null) {
                                        class170 var39 = var38.field2623;
                                        if (class310.field4553 != var39.field1556 && var39.field1493) {
                                            int var40 = var39.field5108 - (var39.field2492.field6337 + -1 << 6);
                                            int var41 = -(var39.field2492.field6337 + -1 << 6) + var39.field5109;
                                            if (var40 >= var29 && ~var39.field2492.field6337 >= ~(var27.method781((byte) 64) - (-var29 + var40 >> 7)) && var30 <= var41 && ~var39.field2492.field6337 >= ~(-(-var30 + var41 >> 7) + var27.method781((byte) 59))) {
                                                class273.method1768(~class644.field9367.field5116 != ~var26.field6712, 20902, var39);
                                                var39.field1556 = class310.field4553;
                                            }
                                        }
                                    }
                                }
                                int var32 = class43.field586;
                                int[] var33 = class343.field4927;
                                for (int var34 = 0; ~var34 > ~var32; ++var34) {
                                    class400 var35 = class39.field536[var33[var34]];
                                    if (var35 != null && ~class310.field4553 != ~var35.field1556 && var27 != var35 && var35.field1493) {
                                        int var36 = var35.field5108 + -(-1 + var35.method781((byte) -116) << 6);
                                        int var37 = var35.field5109 + -(-1 + var35.method781((byte) -87) << 6);
                                        if (~var36 <= ~var29 && var35.method781((byte) 56) <= -(-var29 + var36 >> 7) + var27.method781((byte) -106) && ~var30 >= ~var37 && ~var35.method781((byte) 127) >= ~(-(-var30 + var37 >> 7) + var27.method781((byte) -93))) {
                                            class47.method421(-1, class644.field9367.field5116 != var26.field6712, var35);
                                            var35.field1556 = class310.field4553;
                                        }
                                    }
                                }
                            }
                            if (~class310.field4553 == ~var27.field1556) {
                                continue;
                            }
                            class47.method421(arg3, ~class644.field9367.field5116 != ~var26.field6712, var27);
                            var27.field1556 = class310.field4553;
                        }
                        if (var26.field6710 instanceof class170) {
                            class170 var42 = (class170) var26.field6710;
                            if (var42.field2492 != null) {
                                if (~(1 & var42.field2492.field6337) == -1 && (127 & var42.field5108) == 0 && ~(var42.field5109 & 127) == -1 || (1 & var42.field2492.field6337) == 1 && (var42.field5108 & 127) == 64 && (127 & var42.field5109) == 64) {
                                    int var43 = -(var42.field2492.field6337 - 1 << 6) + var42.field5108;
                                    int var44 = -(var42.field2492.field6337 - 1 << 6) + var42.field5109;
                                    for (int var45 = 0; var45 < class128.field2098; ++var45) {
                                        class181 var52 = (class181) class432.field6368.method740(0, (long) class591.field8401[var45]);
                                        if (var52 != null) {
                                            class170 var53 = var52.field2623;
                                            if (~class310.field4553 != ~var53.field1556 && var42 != var53 && var53.field1493) {
                                                int var54 = -(var53.field2492.field6337 + -1 << 6) + var53.field5108;
                                                int var55 = -(var53.field2492.field6337 + -1 << 6) + var53.field5109;
                                                if (~var43 >= ~var54 && -(-var43 + var54 >> 7) + var42.field2492.field6337 >= var53.field2492.field6337 && ~var55 <= ~var44 && var53.field2492.field6337 <= -(-var44 + var55 >> 7) + var42.field2492.field6337) {
                                                    class273.method1768(~class644.field9367.field5116 != ~var26.field6712, 20902, var53);
                                                    var53.field1556 = class310.field4553;
                                                }
                                            }
                                        }
                                    }
                                    int var46 = class43.field586;
                                    int[] var47 = class343.field4927;
                                    for (int var48 = 0; ~var46 < ~var48; ++var48) {
                                        class400 var49 = class39.field536[var47[var48]];
                                        if (var49 != null && ~class310.field4553 != ~var49.field1556 && var49.field1493) {
                                            int var50 = var49.field5108 + -(var49.method781((byte) 44) - 1 << 6);
                                            int var51 = var49.field5109 - (-1 + var49.method781((byte) -109) << 6);
                                            if (var43 <= var50 && ~var49.method781((byte) -104) >= ~(-(-var43 + var50 >> 7) + var42.field2492.field6337) && ~var51 <= ~var44 && var49.method781((byte) 32) <= -(-var44 + var51 >> 7) + var42.field2492.field6337) {
                                                class47.method421(-1, ~class644.field9367.field5116 != ~var26.field6712, var49);
                                                var49.field1556 = class310.field4553;
                                            }
                                        }
                                    }
                                }
                                if (class310.field4553 == var42.field1556) {
                                    continue;
                                }
                                class273.method1768(class644.field9367.field5116 != var26.field6712, 20902, var42);
                                var42.field1556 = class310.field4553;
                            }
                        }
                        if (var26.field6710 instanceof class82) {
                            int var56 = var26.field6709 - -class382.field5687;
                            int var57 = class597.field8500 + var26.field6713;
                            class51 var58 = (class51) class573.field8163.method740(0, (long) (var57 << 14 | var26.field6712 << 28 | var56));
                            if (var58 != null) {
                                for (class38 var59 = (class38) var58.field755.method428(2000); var59 != null; var59 = (class38) var58.field755.method416(arg3 + 1)) {
                                    class381 var60 = class611.field8684.method1621((byte) 65, var59.field515);
                                    if (class90.field1620) {
                                        if (~class644.field9367.field5116 == ~var26.field6712) {
                                            class188 var65 = ~class510.field7076 != 0 ? class190.field2724.method1831(-34, class510.field7076) : null;
                                            if ((1 & class549.field7789) != 0 && (var65 == null || var60.method2310(class510.field7076, var65.field2710, 13) != var65.field2710)) {
                                                ++class371.field5359;
                                                class366.method2209(class335.field4799, var26.field6713, 9, -1, true, (long) var59.field515, -1, var26.field6709, class511.field7082, false, class413.field6111 + " -> <col=ff9040>" + var60.field5658);
                                            }
                                        }
                                    } else {
                                        if (~class644.field9367.field5116 == ~var26.field6712) {
                                            String[] var61 = var60.field5599;
                                            for (int var62 = 4; var62 >= 0; --var62) {
                                                if (var61 != null && var61[var62] != null) {
                                                    byte var63 = 0;
                                                    int var64 = class340.field4894;
                                                    if (~var62 == -1) {
                                                        var63 = 18;
                                                    }
                                                    if (~var62 == -2) {
                                                        var63 = 57;
                                                    }
                                                    if (~var62 == -3) {
                                                        var63 = 45;
                                                    }
                                                    if (var62 == 3) {
                                                        var63 = 3;
                                                    }
                                                    if (~var60.field5598 == ~var62) {
                                                        var64 = var60.field5617;
                                                    }
                                                    if (~var62 == -5) {
                                                        var63 = 30;
                                                    }
                                                    if (var60.field5643 == var62) {
                                                        var64 = var60.field5647;
                                                    }
                                                    ++class383.field5697;
                                                    class366.method2209(var64, var26.field6713, var63, -1, true, (long) var59.field515, -1, var26.field6709, var61[var62], false, "<col=ff9040>" + var60.field5658);
                                                }
                                            }
                                        }
                                        ++class264.field3839;
                                        class366.method2209(class187.field2701, var26.field6713, 1003, -1, true, (long) var59.field515, arg3, var26.field6709, class137.field2178.method3220(false, class538.field7500), class644.field9367.field5116 != var26.field6712, "<col=ff9040>" + var60.field5658);
                                    }
                                }
                            }
                        }
                        if (var26.field6710 instanceof class231) {
                            class231 var66 = (class231) var26.field6710;
                            class370 var67 = class552.field7819.method2890(~arg3, var66.method264(-25792));
                            if (var67.field5272 != null) {
                                var67 = var67.method2238((byte) 42, class401.field6001);
                            }
                            if (var67 != null) {
                                if (class90.field1620) {
                                    if (class644.field9367.field5116 == var26.field6712) {
                                        class188 var68 = ~class510.field7076 != 0 ? class190.field2724.method1831(-82, class510.field7076) : null;
                                        if ((4 & class549.field7789) != 0 && (var68 == null || ~var67.method2252(class510.field7076, (byte) 3, var68.field2710) != ~var68.field2710)) {
                                            ++class616.field8720;
                                            class366.method2209(class335.field4799, var26.field6713, 44, -1, true, class72.method704(var26.field6713, (byte) 52, var66, var26.field6709), -1, var26.field6709, class511.field7082, false, class413.field6111 + " -> <col=00ffff>" + var67.field5349);
                                        }
                                    }
                                } else {
                                    if (~class644.field9367.field5116 == ~var26.field6712) {
                                        String[] var69 = var67.field5338;
                                        if (var69 != null) {
                                            for (int var70 = 4; var70 >= 0; --var70) {
                                                if (var69[var70] != null) {
                                                    short var71 = 0;
                                                    if (~var70 == -1) {
                                                        var71 = 48;
                                                    }
                                                    int var72 = class340.field4894;
                                                    if (var70 == 1) {
                                                        var71 = 19;
                                                    }
                                                    if (~var70 == -3) {
                                                        var71 = 15;
                                                    }
                                                    if (~var70 == -4) {
                                                        var71 = 21;
                                                    }
                                                    if (~var67.field5311 == ~var70) {
                                                        var72 = var67.field5279;
                                                    }
                                                    if (~var70 == -5) {
                                                        var71 = 1010;
                                                    }
                                                    if (var67.field5286 == var70) {
                                                        var72 = var67.field5307;
                                                    }
                                                    ++class619.field8740;
                                                    class366.method2209(var72, var26.field6713, var71, -1, true, class72.method704(var26.field6713, (byte) 52, var66, var26.field6709), -1, var26.field6709, var69[var70], false, "<col=00ffff>" + var67.field5349);
                                                }
                                            }
                                        }
                                    }
                                    class366.method2209(class187.field2701, var26.field6713, 1004, -1, true, (long) var67.field5335, -1, var26.field6709, class137.field2178.method3220(false, class538.field7500), class644.field9367.field5116 != var26.field6712, "<col=00ffff>" + var67.field5349);
                                    ++class612.field8690;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2819(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method2819(-125, -128, false);
        }
        ++field6930;
        return (393216 & arg0) != 0 | class322.method2005(arg1, -54, arg0) || class215.method1458((byte) -82, arg0, arg1);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZII)V")
    public final void method675(boolean arg0, int arg1, int arg2) {
        if (this.field6934) {
            super.field1635.method3645(1, (byte) 91);
            super.field1635.method3577(this.field6926[arg2 + -1], true);
            super.field1635.method3645(0, (byte) 91);
        }
        if (arg0) {
            ++field6929;
        }
    }

    static {
        new class567("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
    }
}
