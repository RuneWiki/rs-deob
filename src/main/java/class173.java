import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class173 extends class151 implements class246 {

    @OriginalMember(owner = "client!to", name = "s", descriptor = "I")
    private int field2529;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field2528 = 0;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!to", name = "x", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)I", line = 5)
    public final int method1187(int arg0) {
        ++field2527;
        if (arg0 != -1407) {
            method1188(-40, -76, -110);
        }
        return super.field2296;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III)Z", line = 18)
    public static final boolean method1188(int arg0, int arg1, int arg2) {
        if (arg0 != -65) {
            field2528 = -20;
        }
        ++field2534;
        return ~(256 & arg2) != -1;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)J", line = 29)
    public final long method1189(boolean arg0) {
        ++field2533;
        if (arg0) {
            field2528 = -79;
        }
        return 0L;
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(I)V", line = 42)
    public final void method1093(int arg0) {
        ++field2531;
        super.field2298.method1562((byte) -120, this);
        if (arg0 < 8) {
            this.method1193(true, (byte[]) null, 8, 81);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I", line = 53)
    public final int method1190(int arg0) {
        ++field2526;
        if (arg0 != -1739) {
            this.field2529 = -75;
        }
        return this.field2529;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lvd;I[BIZ)V", line = 65)
    public class173(class258 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2529 = arg1;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lvd;ILjaggl/memory/NativeBuffer;IZ)V", line = 73)
    public class173(class258 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2529 = arg1;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILya;IZ)V", line = 89)
    public static final void method1191(int arg0, class11 arg1, int arg2, boolean arg3) {
        if (arg3) {
            method1191(37, (class11) null, 106, true);
        }
        ++field2532;
        if (arg0 >= 0 && arg2 >= 0 && ~class4.field33 != -1 && ~class6.field60 != -1) {
            arg1.method59(class460.field6713, class459.field6705, class4.field33, class6.field60);
            arg1.method84(class487.field7252, class300.field4450, class4.field33, class6.field60);
            class511 var4 = arg1.method75();
            var4.method1300(class451.field6637, class530.field7810, class373.field5642, class288.field4307, class277.field4199, class192.field2800);
            arg1.method55(var4);
            if (class213.field3048 != null) {
                int var5 = -1;
                int var6 = -1;
                int var7 = arg1.method100();
                int var8 = (arg0 - class460.field6713) * var7 / class4.field33;
                int var9 = (-class459.field6705 + arg2) * var7 / class6.field60;
                int var10 = arg1.method128();
                int var11 = (-class460.field6713 + arg0) * var10 / class4.field33;
                int var12 = (arg2 - class459.field6705) * var10 / class6.field60;
                int[] var13 = new int[] { var8, var9, var7 };
                var4.method1297(var13);
                int[] var14 = new int[] { var11, var12, var10 };
                var4.method1297(var14);
                float var15 = 0.0F;
                int var16 = var14[0] - var13[0];
                int var17 = var14[1] + -var13[1];
                int var18 = var14[2] + -var13[2];
                while (var15 < 1.0F) {
                    int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                    int var20 = var19 >> 7;
                    int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                    int var22 = var21 >> 7;
                    if (~var20 < -1 && var22 > 0 && var20 < class50.field640 && ~var22 > ~class448.field6611) {
                        int var23 = class410.field6198.field7686;
                        if (var23 < 3 && ~(class524.field7736[1][var20][var22] & 2) != -1) {
                            ++var23;
                        }
                        if ((float) class213.field3048[var23].method718(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                            var5 = var19 + (class410.field6198.method2419((byte) 114) - 1 << 6) >> 7;
                            var6 = var21 - -(-1 + class410.field6198.method2419((byte) 123) << 6) >> 7;
                            break;
                        }
                    }
                    var15 = (float) ((double) var15 + 0.01D);
                }
                if (~var5 != 0 && var6 != -1) {
                    if (class302.field4504 && (64 & class20.field303) != 0) {
                        class310 var24 = class406.method2442((byte) -61, class327.field5118, class179.field2655);
                        if (var24 == null) {
                            class312.method1967(-124);
                        } else {
                            class393.method2363(var5, class310.field4810, class112.field1718, false, 0, -1, " ->", var6, 0L, true, 51);
                        }
                    } else {
                        if (class251.field3433 == class214.field3057) {
                            class393.method2363(var5, class315.field4868.method2103(class30.field430, (byte) 34), -1, false, 0, -1, "", var6, 0L, true, 58);
                        }
                        class393.method2363(var5, class517.field7576, class213.field3045, false, 0, -1, "", var6, 0L, true, 4);
                        ++class505.field7428;
                    }
                }
            }
            class521 var25 = class268.field3989;
            for (class268 var26 = (class268) var25.method3089(35); var26 != null; var26 = (class268) var25.method3088((byte) -65)) {
                if ((class59.field812 || ~class410.field6198.field7686 == ~var26.field3990) && var26.method1674((byte) -93, arg2, arg1, arg0)) {
                    if (var26.field3982 instanceof class480) {
                        class480 var27 = (class480) var26.field3982;
                        int var28 = var27.method2419((byte) 108);
                        if ((var28 & 1) == 0 && (127 & var27.field7681) == 0 && ~(127 & var27.field7671) == -1 || (1 & var28) == 1 && (127 & var27.field7681) == 64 && ~(var27.field7671 & 127) == -65) {
                            int var29 = var27.field7681 - (-1 + var27.method2419((byte) 125) << 6);
                            int var30 = var27.field7671 + -(var27.method2419((byte) 113) - 1 << 6);
                            for (int var31 = 0; class519.field7609 > var31; ++var31) {
                                class351 var38 = class88.field1375[class327.field5114[var31]];
                                if (var38 != null && ~class86.field1350 != ~var38.field6024 && var38.field5981) {
                                    int var39 = -(var38.field5409.field4128 + -1 << 6) + var38.field7681;
                                    int var40 = -(var38.field5409.field4128 + -1 << 6) + var38.field7671;
                                    if (~var29 >= ~var39 && var38.field5409.field4128 <= var27.method2419((byte) 123) + -(-var29 + var39 >> 7) && var30 <= var40 && var38.field5409.field4128 <= -(var40 - var30 >> 7) + var27.method2419((byte) 105)) {
                                        class149.method1085(var38, class410.field6198.field7686 != var26.field3990, arg3);
                                        var38.field6024 = class86.field1350;
                                    }
                                }
                            }
                            int var32 = class146.field2203;
                            int[] var33 = class457.field6694;
                            for (int var34 = 0; var34 < var32; ++var34) {
                                class480 var35 = class83.field1327[var33[var34]];
                                if (var35 != null && ~class86.field1350 != ~var35.field6024 && var27 != var35 && var35.field5981) {
                                    int var36 = var35.field7681 + -(var35.method2419((byte) 117) + -1 << 6);
                                    int var37 = var35.field7671 - (-1 + var35.method2419((byte) 121) << 6);
                                    if (var36 >= var29 && var35.method2419((byte) 100) <= -(-var29 + var36 >> 7) + var27.method2419((byte) 127) && ~var30 >= ~var37 && var35.method2419((byte) 108) <= var27.method2419((byte) 110) - (-var30 + var37 >> 7)) {
                                        class477.method2842(var35, class410.field6198.field7686 != var26.field3990, -1);
                                        var35.field6024 = class86.field1350;
                                    }
                                }
                            }
                        }
                        if (class86.field1350 == var27.field6024) {
                            continue;
                        }
                        class477.method2842(var27, ~class410.field6198.field7686 != ~var26.field3990, -1);
                        var27.field6024 = class86.field1350;
                    }
                    if (var26.field3982 instanceof class351) {
                        class351 var41 = (class351) var26.field3982;
                        if (var41.field5409 != null) {
                            if ((1 & var41.field5409.field4128) == 0 && ~(127 & var41.field7681) == -1 && ~(127 & var41.field7671) == -1 || (var41.field5409.field4128 & 1) == 1 && ~(var41.field7681 & 127) == -65 && ~(127 & var41.field7671) == -65) {
                                int var42 = -(var41.field5409.field4128 - 1 << 6) + var41.field7681;
                                int var43 = -(var41.field5409.field4128 + -1 << 6) + var41.field7671;
                                for (int var44 = 0; class519.field7609 > var44; ++var44) {
                                    class351 var51 = class88.field1375[class327.field5114[var44]];
                                    if (var51 != null && class86.field1350 != var51.field6024 && var41 != var51 && var51.field5981) {
                                        int var52 = -(var51.field5409.field4128 + -1 << 6) + var51.field7681;
                                        int var53 = -(var51.field5409.field4128 + -1 << 6) + var51.field7671;
                                        if (var42 <= var52 && var51.field5409.field4128 <= -(-var42 + var52 >> 7) + var41.field5409.field4128 && var43 <= var53 && -(var53 - var43 >> 7) + var41.field5409.field4128 >= var51.field5409.field4128) {
                                            class149.method1085(var51, class410.field6198.field7686 != var26.field3990, arg3);
                                            var51.field6024 = class86.field1350;
                                        }
                                    }
                                }
                                int var45 = class146.field2203;
                                int[] var46 = class457.field6694;
                                for (int var47 = 0; var47 < var45; ++var47) {
                                    class480 var48 = class83.field1327[var46[var47]];
                                    if (var48 != null && class86.field1350 != var48.field6024 && var48.field5981) {
                                        int var49 = var48.field7681 + -(-1 + var48.method2419((byte) 103) << 6);
                                        int var50 = var48.field7671 - (var48.method2419((byte) 119) + -1 << 6);
                                        if (~var49 <= ~var42 && var48.method2419((byte) 118) <= -(-var42 + var49 >> 7) + var41.field5409.field4128 && ~var50 <= ~var43 && ~var48.method2419((byte) 121) >= ~(var41.field5409.field4128 - (-var43 + var50 >> 7))) {
                                            class477.method2842(var48, class410.field6198.field7686 != var26.field3990, -1);
                                            var48.field6024 = class86.field1350;
                                        }
                                    }
                                }
                            }
                            if (~class86.field1350 == ~var41.field6024) {
                                continue;
                            }
                            class149.method1085(var41, class410.field6198.field7686 != var26.field3990, false);
                            var41.field6024 = class86.field1350;
                        }
                    }
                    if (var26.field3982 instanceof class315) {
                        class449 var54 = (class449) class491.field7318.method3059(105, (long) (var26.field3988 | var26.field3986 << 14 | var26.field3990 << 28));
                        if (var54 != null) {
                            for (class233 var55 = (class233) var54.field6612.method2949(-113); var55 != null; var55 = (class233) var54.field6612.method2959((byte) -78)) {
                                class81 var56 = class164.field2437.method1749(var55.field3272, -20230);
                                if (class302.field4504) {
                                    if (class410.field6198.field7686 == var26.field3990) {
                                        class184 var61 = ~class242.field3379 != 0 ? class260.field3873.method2676(class242.field3379, (byte) -14) : null;
                                        if (~(class20.field303 & 1) != -1 && (var61 == null || var56.method586(class242.field3379, -114, var61.field2717) != var61.field2717)) {
                                            ++class334.field5169;
                                            class393.method2363(var26.field3988, class310.field4810, class112.field1718, false, 0, -1, class203.field2970 + " -> <col=ff9040>" + var56.field1131, var26.field3986, (long) var55.field3272, true, 15);
                                        }
                                    }
                                } else {
                                    if (~class410.field6198.field7686 == ~var26.field3990) {
                                        String[] var57 = var56.field1169;
                                        for (int var58 = 4; var58 >= 0; --var58) {
                                            if (var57 != null && var57[var58] != null) {
                                                byte var59 = 0;
                                                if (var58 == 0) {
                                                    var59 = 8;
                                                }
                                                int var60 = class224.field3171;
                                                if (var58 == 1) {
                                                    var59 = 30;
                                                }
                                                if (~var58 == -3) {
                                                    var59 = 12;
                                                }
                                                if (~var58 == -4) {
                                                    var59 = 44;
                                                }
                                                if (var58 == 4) {
                                                    var59 = 50;
                                                }
                                                if (~var56.field1110 == ~var58) {
                                                    var60 = var56.field1144;
                                                }
                                                if (~var56.field1168 == ~var58) {
                                                    var60 = var56.field1140;
                                                }
                                                ++class95.field1474;
                                                class393.method2363(var26.field3988, var57[var58], var60, false, 0, -1, "<col=ff9040>" + var56.field1131, var26.field3986, (long) var55.field3272, true, var59);
                                            }
                                        }
                                    }
                                    ++class231.field3240;
                                    class393.method2363(var26.field3988, class413.field6238.method2103(class30.field430, (byte) 34), class449.field6614, class410.field6198.field7686 != var26.field3990, 0, -1, "<col=ff9040>" + var56.field1131, var26.field3986, (long) var55.field3272, true, 1009);
                                }
                            }
                        }
                    }
                    if (var26.field3982 instanceof class401) {
                        class401 var62 = (class401) var26.field3982;
                        class486 var63 = class119.field1824.method248(var62.method240(-15578), 30);
                        if (var63.field7219 != null) {
                            var63 = var63.method2909((byte) 83, class307.field4619);
                        }
                        if (var63 != null) {
                            if (class302.field4504) {
                                if (~class410.field6198.field7686 == ~var26.field3990) {
                                    class184 var68 = class242.field3379 != -1 ? class260.field3873.method2676(class242.field3379, (byte) -14) : null;
                                    if (~(4 & class20.field303) != -1 && (var68 == null || ~var63.method2889(var68.field2717, class242.field3379, 0) != ~var68.field2717)) {
                                        class393.method2363(var26.field3988, class310.field4810, class112.field1718, false, 0, -1, class203.field2970 + " -> <col=00ffff>" + var63.field7188, var26.field3986, class348.method2109(-17703, var62, var26.field3988, var26.field3986), true, 46);
                                        ++class105.field1570;
                                    }
                                }
                            } else {
                                if (class410.field6198.field7686 == var26.field3990) {
                                    String[] var64 = var63.field7151;
                                    if (var64 != null) {
                                        for (int var65 = 4; var65 >= 0; --var65) {
                                            if (var64[var65] != null) {
                                                short var66 = 0;
                                                int var67 = class224.field3171;
                                                if (~var65 == -1) {
                                                    var66 = 10;
                                                }
                                                if (~var65 == -2) {
                                                    var66 = 60;
                                                }
                                                if (~var65 == -3) {
                                                    var66 = 23;
                                                }
                                                if (var65 == 3) {
                                                    var66 = 47;
                                                }
                                                if (var63.field7205 == var65) {
                                                    var67 = var63.field7194;
                                                }
                                                if (~var65 == -5) {
                                                    var66 = 1012;
                                                }
                                                if (var63.field7187 == var65) {
                                                    var67 = var63.field7221;
                                                }
                                                class393.method2363(var26.field3988, var64[var65], var67, false, 0, -1, "<col=00ffff>" + var63.field7188, var26.field3986, class348.method2109(-17703, var62, var26.field3988, var26.field3986), true, var66);
                                                ++class65.field872;
                                            }
                                        }
                                    }
                                }
                                class393.method2363(var26.field3988, class413.field6238.method2103(class30.field430, (byte) 34), class449.field6614, class410.field6198.field7686 != var26.field3990, 0, -1, "<col=00ffff>" + var63.field7188, var26.field3986, (long) var63.field7207, true, 1011);
                                ++class233.field3275;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)V", line = 548)
    public static final void method1192(int arg0, int arg1) {
        ++field2530;
        class182.field2703 = arg1;
        class382 var2 = class146.field2199;
        synchronized (class146.field2199) {
            class146.field2199.method2293(false);
        }
        class382 var3 = class169.field2484;
        synchronized (class169.field2484) {
            class169.field2484.method2293(false);
        }
        if (arg0 != 25211) {
            field2528 = -6;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z[BII)V", line = 565)
    public final void method1193(boolean arg0, byte[] arg1, int arg2, int arg3) {
        this.method1091(arg1, 1, arg2);
        ++field2525;
        this.field2529 = arg3;
        if (!arg0) {
            field2528 = 51;
        }
    }
}
