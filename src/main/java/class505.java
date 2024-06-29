import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class505 {

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lgk;")
    private class472 field7327 = new class472();

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Ljh;")
    private class462 field7338 = new class462();

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    private int field7339;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    private int field7340;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "Lvg;")
    private class56 field7341;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field7336 = 0;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lpn;")
    public static class49 field7330 = new class49(50, 8);

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "Lnv;")
    public static class44 field7342 = new class44();

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 10)
    public static final void method3005(byte arg0) {
        field7334++;
        if (arg0 > -114) {
            return;
        }
        for (class337 var1 = (class337) class361.field5319.method295((byte) -78); var1 != null; var1 = (class337) class361.field5319.method296(true)) {
            class101 var2 = var1.field5069;
            if (class446.field6625 > var2.field1549) {
                var1.method947((byte) 117);
                var2.method821(0);
            } else if (class446.field6625 >= var2.field1556) {
                if (var2.field1560 > 0) {
                    class5 var3 = (class5) class366.field5398.method358((byte) -120, (long) (var2.field1560 - 1));
                    if (var3 != null) {
                        class46 var4 = var3.field65;
                        if (var4.field1275 >= 0 && var4.field1275 < class338.field5076 * 128 && var4.field1279 >= 0 && var4.field1279 < class250.field4077 * 128) {
                            var2.method822(class416.method2605(var4.field1279, var4.field1275, (byte) -118, var2.field1274) - var2.field1557, class446.field6625, var4.field1279, var4.field1275, 1);
                        }
                    }
                }
                if (var2.field1560 < 0) {
                    int var5 = -var2.field1560 - 1;
                    class511 var6;
                    if (class517.field7513 == var5) {
                        var6 = class116.field1781;
                    } else {
                        var6 = class530.field7747[var5];
                    }
                    if (var6 != null && var6.field1275 >= 0 && class338.field5076 * 128 > var6.field1275 && var6.field1279 >= 0 && class250.field4077 * 128 > var6.field1279) {
                        var2.method822(class416.method2605(var6.field1279, var6.field1275, (byte) 117, var2.field1274) - var2.field1557, class446.field6625, var6.field1279, var6.field1275, 1);
                    }
                }
                var2.method820(class124.field1851, false);
                class321.method2123(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIIIII)V", line = 76)
    private static final void method3006(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7329++;
        if (arg7 != -1) {
            return;
        }
        class541 var10 = null;
        for (class541 var11 = (class541) class368.field5420.method295((byte) 24); var11 != null; var11 = (class541) class368.field5420.method296(true)) {
            if (var11.field7918 == arg8 && var11.field7927 == arg2 && var11.field7925 == arg0 && var11.field7920 == arg6) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class541();
            var10.field7920 = arg6;
            var10.field7918 = arg8;
            var10.field7927 = arg2;
            var10.field7925 = arg0;
            if (arg2 >= 0 && arg0 >= 0 && arg2 < class338.field5076 && arg0 < class250.field4077) {
                class243.method1642(var10, (byte) -65);
            }
            class368.field5420.method292((byte) 121, var10);
        }
        var10.field7916 = arg5;
        var10.field7924 = arg3;
        var10.field7926 = arg1;
        var10.field7912 = arg9;
        var10.field7923 = arg4;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 123)
    public final void method3007(int arg0) {
        field7335++;
        this.field7338.method2831(0);
        this.field7341.method360(-40);
        int var2 = -30 / ((arg0 + 67) / 43);
        this.field7327 = new class472();
        this.field7339 = this.field7340;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(JB)Lgk;", line = 136)
    public final class472 method3008(long arg0, byte arg1) {
        field7331++;
        class472 var4 = (class472) this.field7341.method358((byte) 79, arg0);
        if (arg1 <= 96) {
            return null;
        } else {
            if (var4 != null) {
                this.field7338.method2829(-14061, var4);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V", line = 160)
    public static final void method3009(int arg0) {
        field7333++;
        int var1 = 6 % ((arg0 + 64) / 51);
        if (class460.field6813 == 8) {
            class376.method2400(4, (byte) 107);
        } else if (class460.field6813 == 4 || class460.field6813 == 5) {
            class376.method2400(2, (byte) 107);
        } else if (class460.field6813 == 11) {
            class376.method2400(2, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V", line = 192)
    public static void method3010(int arg0) {
        if (arg0 == -1) {
            field7342 = null;
            field7330 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(JLgk;I)V", line = 203)
    public final void method3011(long arg0, class472 arg1, int arg2) {
        field7337++;
        if (this.field7339 == 0) {
            class472 var5 = this.field7338.method2828(false);
            var5.method947((byte) 124);
            var5.method2859(-128);
            if (this.field7327 == var5) {
                class472 var6 = this.field7338.method2828(false);
                var6.method947((byte) 94);
                var6.method2859(-102);
            }
        } else {
            this.field7339--;
        }
        this.field7341.method357(arg1, 1, arg0);
        this.field7338.method2829(-14061, arg1);
        if (arg2 < 64) {
            this.field7327 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V", line = 233)
    public static final void method3012(int arg0) {
        field7328++;
        for (class541 var1 = (class541) class368.field5420.method295((byte) -29); var1 != null; var1 = (class541) class368.field5420.method296(true)) {
            if (var1.field7924 > 0) {
                var1.field7924--;
            }
            if (var1.field7924 != 0) {
                if (var1.field7926 > 0) {
                    var1.field7926--;
                }
                if (var1.field7926 == 0 && var1.field7927 >= 1 && var1.field7925 >= 1 && (class338.field5076 - 2) >= var1.field7927 && (class250.field4077 - 2) >= var1.field7925 && (var1.field7923 < 0 || class476.method2875(var1.field7912, var1.field7923, -121))) {
                    class303.method2006(var1.field7912, var1.field7923, (byte) 98, var1.field7918, -1, var1.field7925, var1.field7916, var1.field7920, var1.field7927);
                    var1.field7926 = -1;
                    if (var1.field7923 == var1.field7919 && var1.field7919 == -1) {
                        var1.method947((byte) 125);
                    } else if (var1.field7923 == var1.field7919 && var1.field7917 == var1.field7916 && var1.field7921 == var1.field7912) {
                        var1.method947((byte) 93);
                    }
                }
            } else if (var1.field7919 < 0 || class476.method2875(var1.field7921, var1.field7919, 70)) {
                class303.method2006(var1.field7921, var1.field7919, (byte) 127, var1.field7918, -1, var1.field7925, var1.field7917, var1.field7920, var1.field7927);
                var1.method947((byte) 93);
            }
        }
        if (arg0 <= 67) {
            field7343 = -78;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLmo;)V", line = 297)
    public static final void method3013(boolean arg0, class271 arg1) {
        field7326++;
        if (class386.field5682 == arg1) {
            int var2 = class424.field6231.method1337((byte) 46);
            int var3 = ((var2 & 0xFE) >> 4) + class222.field3398 * 2;
            int var4 = class351.field5228 * 2 + (var2 & 0xF);
            boolean var5 = class424.field6231.method1337((byte) -118) != 0;
            int var6 = class424.field6231.method1398(70) + var3;
            int var7 = class424.field6231.method1398(113) + var4;
            int var8 = class424.field6231.method1384(true);
            int var9 = class424.field6231.method1396(-124);
            int var10 = class424.field6231.method1337((byte) 33) * 4;
            int var11 = class424.field6231.method1337((byte) 69) * 4;
            int var12 = class424.field6231.method1396(44);
            int var13 = class424.field6231.method1396(96);
            int var14 = class424.field6231.method1337((byte) 81);
            int var15 = class424.field6231.method1396(65);
            if (var14 == 255) {
                var14 = -1;
            }
            if (var3 >= 0 && var4 >= 0 && var3 < class338.field5076 * 2 && var4 < (class338.field5076 * 2) && var6 >= 0 && var7 >= 0 && var6 < (class250.field4077 * 2) && (class250.field4077 * 2) > var7 && var9 != 65535) {
                int var16 = var3 * 64;
                int var17 = var7 * 64;
                int var18 = var6 * 64;
                int var19 = var10 << 0;
                int var20 = var11 << 0;
                int var21 = var15 << 0;
                int var22 = var4 * 64;
                class101 var23 = new class101(var9, field7332, var16, var22, var19, class446.field6625 + var12, class446.field6625 + var13, var14, var21, var8, var20, var5);
                var23.method822(class416.method2605(var17, var18, (byte) 111, field7332) - var20, class446.field6625 + var12, var17, var18, 1);
                class361.field5319.method292((byte) 121, new class337(var23));
            }
        } else if (class408.field6037 == arg1) {
            int var24 = class424.field6231.method1337((byte) 110);
            int var25 = (var24 >> 4 & 0x7) + class222.field3398;
            int var26 = (var24 & 0x7) + class351.field5228;
            int var27 = class424.field6231.method1396(-10);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var28 = class424.field6231.method1337((byte) -116);
            int var29 = var28 >> 4 & 0xF;
            int var30 = var28 & 0x7;
            int var31 = class424.field6231.method1337((byte) -127);
            int var32 = class424.field6231.method1337((byte) 96);
            if (var25 >= 0 && var26 >= 0 && var25 < class338.field5076 && class250.field4077 > var26) {
                int var33 = var29 + 1;
                if ((var25 - var33) <= class116.field1781.field7654[0] && class116.field1781.field7654[0] <= (var25 + var33) && class116.field1781.field7653[0] >= (var26 - var33) && class116.field1781.field7653[0] <= var26 + var33) {
                    class308.method2029(var32, var27, (byte) 69, (var26 << 8) + (field7332 << 24) + (var25 << 16) + var29, var30, var31);
                }
            }
        } else if (class12.field131 == arg1) {
            int var34 = class424.field6231.method1337((byte) -113);
            boolean var35 = (var34 & 0x80) != 0;
            int var36 = class222.field3398 + (var34 >> 3 & 0x7);
            int var37 = (var34 & 0x7) + class351.field5228;
            int var38 = var36 + class424.field6231.method1398(82);
            int var39 = var37 + class424.field6231.method1398(19);
            int var40 = class424.field6231.method1384(true);
            int var41 = class424.field6231.method1396(-120);
            int var42 = class424.field6231.method1337((byte) -125) * 4;
            int var43 = class424.field6231.method1337((byte) 111) * 4;
            int var44 = class424.field6231.method1396(74);
            int var45 = class424.field6231.method1396(-91);
            int var46 = class424.field6231.method1337((byte) 39);
            if (var46 == 255) {
                var46 = -1;
            }
            int var47 = class424.field6231.method1396(42);
            if (var36 >= 0 && var37 >= 0 && class338.field5076 > var36 && var37 < class250.field4077 && var38 >= 0 && var39 >= 0 && class338.field5076 > var38 && var39 < class250.field4077 && var41 != 65535) {
                int var48 = var42 << 0;
                int var49 = var47 << 0;
                int var50 = var43 << 0;
                int var51 = var37 * 128 + 64;
                int var52 = var38 * 128 + 64;
                int var53 = var36 * 128 + 64;
                int var54 = var39 * 128 + 64;
                class101 var55 = new class101(var41, field7332, var53, var51, var48, class446.field6625 + var44, class446.field6625 + var45, var46, var49, var40, var50, var35);
                var55.method822(class416.method2605(var54, var52, (byte) -24, field7332) - var50, class446.field6625 + var44, var54, var52, 1);
                class361.field5319.method292((byte) 121, new class337(var55));
            }
        } else if (class451.field6715 == arg1) {
            int var56 = class424.field6231.method1383(12504);
            int var57 = (var56 & 0x7) + class351.field5228;
            int var58 = class23.field273 + var57;
            int var59 = (var56 >> 4 & 0x7) + class222.field3398;
            int var60 = var59 + class422.field6201;
            int var61 = class424.field6231.method1396(110);
            class192 var62 = (class192) class249.field3827.method358((byte) -121, (long) (var60 | var58 << 14 | field7332 << 28));
            if (var62 != null) {
                for (class43 var63 = (class43) var62.field2952.method295((byte) -52); var63 != null; var63 = (class43) var62.field2952.method296(true)) {
                    if ((var61 & 0x7FFF) == var63.field679) {
                        var63.method947((byte) 122);
                        break;
                    }
                }
                if (var62.field2952.method293((byte) 75)) {
                    var62.method947((byte) 126);
                }
                if (var59 >= 0 && var57 >= 0 && var59 < class338.field5076 && var57 < class250.field4077) {
                    class25.method153(var57, field7332, 31755, var59);
                }
            }
        } else if (class23.field272 == arg1) {
            int var64 = class424.field6231.method1376(255);
            int var65 = (var64 >> 4 & 0x7) + class222.field3398;
            int var66 = (var64 & 0x7) + class351.field5228;
            int var67 = class424.field6231.method1392(0);
            int var68 = var67 >> 2;
            int var69 = var67 & 0x3;
            int var70 = class184.field2828[var68];
            int var71 = class424.field6231.method1396(89);
            if (var71 == 65535) {
                var71 = -1;
            }
            class76.method699(!arg0, var68, var71, var65, var69, field7332, var70, var66);
        } else if (class521.field7643 == arg1) {
            int var72 = class424.field6231.method1337((byte) -114);
            int var73 = (var72 >> 4 & 0x7) + class222.field3398;
            int var74 = (var72 & 0x7) + class351.field5228;
            int var75 = class424.field6231.method1396(-103);
            int var76 = class424.field6231.method1337((byte) -8);
            int var77 = class424.field6231.method1396(14);
            int var78 = class424.field6231.method1337((byte) -111);
            if (var73 >= 0 && var74 >= 0 && var73 < class338.field5076 && class250.field4077 > var74) {
                int var79 = var73 * 128 + 64;
                int var80 = var74 * 128 + 64;
                int var81 = field7332;
                if (var81 < 3 && class38.method251(1, var74, var73)) {
                    var81++;
                }
                class190 var82 = new class190(var75, var77, class446.field6625, field7332, var81, var79, class416.method2605(var80, var79, (byte) -68, field7332) - var76, var80, var73, var73, var74, var74, var78);
                class453.field6742.method292((byte) 121, new class426(var82));
            }
        } else if (class267.field4256 == arg1) {
            int var83 = class424.field6231.method1383(12504);
            int var84 = class222.field3398 + ((var83 & 0x76) >> 4);
            int var85 = (var83 & 0x7) + class351.field5228;
            int var86 = class424.field6231.method1337((byte) 116);
            int var87 = var86 >> 2;
            int var88 = var86 & 0x3;
            int var89 = class184.field2828[var87];
            if (class176.method1246(class91.field1475, arg0) || var84 >= 0 && var85 >= 0 && class338.field5076 > var84 && class250.field4077 > var85) {
                method3006(var85, 0, var84, -1, -1, var88, var89, -1, field7332, var87);
            }
        } else if (class326.field4925 == arg1) {
            byte var90 = class424.field6231.method1398(112);
            int var91 = class424.field6231.method1391(-99);
            int var92 = class424.field6231.method1376(255);
            int var93 = var92 >> 2;
            int var94 = var92 & 0x3;
            int var95 = class424.field6231.method1396(-84);
            int var96 = class424.field6231.method1396(-83);
            byte var97 = class424.field6231.method1346((byte) -119);
            int var98 = class424.field6231.method1371(255);
            byte var99 = class424.field6231.method1398(35);
            int var100 = class424.field6231.method1376(255);
            int var101 = ((var100 & 0x72) >> 4) + class222.field3398;
            int var102 = class351.field5228 + (var100 & 0x7);
            byte var103 = class424.field6231.method1380(-114);
            if (!class376.field5542.method522()) {
                class435.method2700(var91, var101, var99, 31083, var102, var90, var93, var94, var96, var95, var103, var97, var98, field7332);
            }
        } else if (class474.field6945 == arg1) {
            int var104 = class424.field6231.method1337((byte) 51);
            int var105 = (var104 & 0x7) + class351.field5228;
            int var106 = var105 + class23.field273;
            int var107 = ((var104 & 0x7A) >> 4) + class222.field3398;
            int var108 = class422.field6201 + var107;
            int var109 = class424.field6231.method1396(15);
            int var110 = class424.field6231.method1396(5);
            int var111 = class424.field6231.method1396(22);
            if (class249.field3827 != null) {
                class192 var112 = (class192) class249.field3827.method358((byte) 20, (long) (var108 | field7332 << 28 | var106 << 14));
                if (var112 != null) {
                    for (class43 var113 = (class43) var112.field2952.method295((byte) -76); var113 != null; var113 = (class43) var112.field2952.method296(true)) {
                        if ((var109 & 0x7FFF) == var113.field679 && var113.field680 == var110) {
                            var113.method947((byte) 105);
                            var113.field680 = var111;
                            class134.method980(var106, 0, field7332, var113, var108);
                            break;
                        }
                    }
                    if (var107 >= 0 && var105 >= 0 && class338.field5076 > var107 && class250.field4077 > var105) {
                        class25.method153(var105, field7332, 31755, var107);
                    }
                }
            }
        } else if (class482.field7064 == arg1) {
            int var114 = class424.field6231.method1383(12504);
            int var115 = var114 >> 2;
            int var116 = var114 & 0x3;
            int var117 = class184.field2828[var115];
            int var118 = class424.field6231.method1389(255);
            int var119 = class424.field6231.method1337((byte) 74);
            int var120 = class222.field3398 + (var119 >> 4 & 0x7);
            int var121 = (var119 & 0x7) + class351.field5228;
            if (class176.method1246(class91.field1475, true) || var120 >= 0 && var121 >= 0 && var120 < class338.field5076 && class250.field4077 > var121) {
                method3006(var121, 0, var120, -1, var118, var116, var117, -1, field7332, var115);
            }
        } else if (class252.field4096 == arg1) {
            int var122 = class424.field6231.method1396(6);
            int var123 = class424.field6231.method1396(94);
            int var124 = class424.field6231.method1376(255);
            int var125 = (var124 & 0x7) + class351.field5228;
            int var126 = class23.field273 + var125;
            int var127 = class222.field3398 + ((var124 & 0x76) >> 4);
            int var128 = class422.field6201 + var127;
            boolean var129 = var127 >= 0 && var125 >= 0 && class338.field5076 > var127 && var125 < class250.field4077;
            if (var129 || class176.method1246(class91.field1475, true)) {
                class134.method980(var126, 0, field7332, new class43(var122, var123), var128);
                if (var129) {
                    class25.method153(var125, field7332, 31755, var127);
                }
            }
        } else if (class261.field4164 == arg1) {
            int var130 = class424.field6231.method1337((byte) -117);
            int var131 = (var130 >> 4 & 0xF) + class222.field3398 * 2;
            int var132 = (var130 & 0xF) + class351.field5228 * 2;
            boolean var133 = class424.field6231.method1337((byte) -119) != 0;
            int var134 = class424.field6231.method1398(127) + var131;
            int var135 = var132 + class424.field6231.method1398(61);
            int var136 = class424.field6231.method1384(true);
            int var137 = class424.field6231.method1384(true);
            int var138 = class424.field6231.method1396(-125);
            byte var139 = class424.field6231.method1398(41);
            int var140 = class424.field6231.method1337((byte) 17) * 4;
            int var141 = class424.field6231.method1396(-113);
            int var142 = class424.field6231.method1396(71);
            int var143 = class424.field6231.method1337((byte) -117);
            int var144 = class424.field6231.method1396(56);
            if (var143 == 255) {
                var143 = -1;
            }
            if (var131 >= 0 && var132 >= 0 && (class338.field5076 * 2) > var131 && class338.field5076 * 2 > var132 && var134 >= 0 && var135 >= 0 && (class250.field4077 * 2) > var134 && (class250.field4077 * 2) > var135 && var138 != 65535) {
                int var145 = var134 * 64;
                int var146 = var131 * 64;
                int var147 = var140 << 0;
                int var148 = var144 << 0;
                int var149 = var139 << 0;
                int var150 = var135 * 64;
                int var151 = var132 * 64;
                if (var136 != 0) {
                    class521 var152 = null;
                    int var154;
                    if (var136 >= 0) {
                        int var153 = var136 - 1;
                        var154 = var153 >> 11 & 0xF;
                        int var155 = var153 & 0x7FF;
                        class5 var156 = (class5) class366.field5398.method358((byte) -116, (long) var155);
                        if (var156 != null) {
                            var152 = var156.field65;
                        }
                    } else {
                        int var157 = -var136 - 1;
                        var154 = var157 >> 11 & 0xF;
                        int var158 = var157 & 0x7FF;
                        if (class517.field7513 == var158) {
                            var152 = class116.field1781;
                        } else {
                            var152 = class530.field7747[var158];
                        }
                    }
                    if (var152 != null) {
                        class477 var159 = var152.method3101(-1);
                        if (var159.field6995 != null && var159.field6995[var154] != null) {
                            int var160 = var159.field6995[var154][0];
                            int var161 = var159.field6995[var154][2];
                            int var162 = var152.field7592.method1881(false);
                            int var163 = class58.field891[var162];
                            int var164 = class58.field889[var162];
                            int var165 = var160 * var164 + var161 * var163 >> 15;
                            int var166 = var161 * var164 - var160 * var163 >> 15;
                            var146 += var165;
                            var151 += var166;
                            var149 -= var159.field6995[var154][1];
                        }
                    }
                }
                class101 var168 = new class101(var138, field7332, var146, var151, var149, var141 + class446.field6625, var142 - -class446.field6625, var143, var148, var137, var147, var133);
                var168.method822(class416.method2605(var150, var145, (byte) -112, field7332) - var147, var141 - -class446.field6625, var150, var145, 1);
                class361.field5319.method292((byte) 121, new class337(var168));
            }
        } else if (class294.field4538 == arg1) {
            int var169 = class424.field6231.method1391(-73);
            int var170 = class424.field6231.method1391(-117);
            int var171 = class424.field6231.method1389(255);
            int var172 = class424.field6231.method1337((byte) 117);
            int var173 = (var172 & 0x7) + class351.field5228;
            int var174 = class23.field273 + var173;
            int var175 = ((var172 & 0x70) >> 4) + class222.field3398;
            int var176 = class422.field6201 + var175;
            if (class517.field7513 != var169) {
                boolean var177 = var175 >= 0 && var173 >= 0 && var175 < class338.field5076 && var173 < class250.field4077;
                if (var177 || class176.method1246(class91.field1475, true)) {
                    class134.method980(var174, 0, field7332, new class43(var170, var171), var176);
                    if (var177) {
                        class25.method153(var173, field7332, 31755, var175);
                    }
                }
            }
        } else if (class499.field7264 == arg1) {
            class424.field6231.method1337((byte) 97);
            int var178 = class424.field6231.method1337((byte) -115);
            int var179 = (var178 >> 4 & 0x7) + class222.field3398;
            int var180 = (var178 & 0x7) + class351.field5228;
            int var181 = class424.field6231.method1396(124);
            int var182 = class424.field6231.method1337((byte) -117);
            int var183 = class424.field6231.method1339(-32768);
            String var184 = class424.field6231.method1347(-98);
            class65.method439(var179, var182, field7332, var181, -7383, var183, var180, var184);
        } else if (class94.field1499 == arg1) {
            int var185 = class424.field6231.method1396(123);
            int var186 = class424.field6231.method1337((byte) -122);
            class247.field3693.method2281(var185, -9380).method2492(3, var186);
        } else {
            class197.method1407(arg0, "T3 - " + arg1, null);
            class405.method2550(false, 50);
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V", line = 959)
    public class505(int arg0) {
        this.field7339 = arg0;
        this.field7340 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field7341 = new class56(var2);
    }
}
