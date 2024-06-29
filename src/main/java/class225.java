import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class225 {

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public int field3150 = 16777215;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public int field3158 = 8;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Lon;")
    public static class184 field3144 = null;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "[Lne;")
    public static class172[] field3161;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "Z")
    public static boolean field3160;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "F")
    public static float field3164;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public int field3145;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public int field3146;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public int field3162;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field3163;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sg", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field3165;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "Z")
    public boolean field3156;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1508(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class362("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field3161 = new class172[50];
        field3160 = true;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBI[B)I", line = 3)
    public static final int method1500(int arg0, byte arg1, int arg2, byte[] arg3) {
        field3151++;
        int var4 = -1;
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = class325.field4625[(var4 ^ arg3[var5]) & 0xFF] ^ var4 >>> 8;
        }
        int var6 = 123 % ((81 - arg1) / 37);
        return ~var4;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(JI)V", line = 27)
    public static final void method1501(long arg0, int arg1) {
        field3155++;
        int var3 = class384.field5422.field3284 + class331.field4675;
        int var4 = class54.field653 + class384.field5422.field3269;
        if (class214.field3034 - var3 < -500 || (class214.field3034 - var3) > 500 || class331.field4680 - var4 < -500 || class331.field4680 - var4 > 500) {
            class331.field4680 = var4;
            class214.field3034 = var3;
        }
        if (class214.field3034 != var3) {
            int var5 = var3 - class214.field3034;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class214.field3034 += var6;
        }
        int var7 = -104 / ((-arg1 - 91) / 33);
        if (class331.field4680 != var4) {
            int var8 = var4 - class331.field4680;
            int var9 = (int) ((long) var8 * arg0 / 320L);
            if (var8 <= 0) {
                if (var9 == 0) {
                    var9 = -1;
                } else if (var8 > var9) {
                    var9 = var8;
                }
            } else if (var9 == 0) {
                var9 = 1;
            } else if (var8 < var9) {
                var9 = var8;
            }
            class331.field4680 += var9;
        }
        if (!class374.field5254) {
            class441.field6333 += (float) arg0 * class286.field4016 / 6.0F;
            class292.field4085 += (float) arg0 * class117.field1433 / 6.0F;
        }
        class223.method1494((byte) -111);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lgr;Z)V", line = 140)
    public static final void method1502(class248 arg0, boolean arg1) {
        field3157++;
        if (class250.field3570 == null) {
            return;
        }
        class9 var2 = null;
        if (arg0.field3538 == 0) {
            var2 = (class9) class137.method847(arg0.field3537, arg0.field3540, arg0.field3545);
        }
        if (arg1) {
            method1500(-9, (byte) 56, -34, (byte[]) null);
        }
        if (arg0.field3538 == 1) {
            var2 = (class9) class109.method696(arg0.field3537, arg0.field3540, arg0.field3545);
        }
        if (arg0.field3538 == 2) {
            var2 = (class9) class159.method1013(arg0.field3537, arg0.field3540, arg0.field3545, field3165 == null ? (field3165 = method1508("vl")) : field3165);
        }
        if (arg0.field3538 == 3) {
            var2 = (class9) class327.method2118(arg0.field3537, arg0.field3540, arg0.field3545);
        }
        if (var2 == null) {
            arg0.field3549 = 0;
            arg0.field3536 = 0;
            arg0.field3534 = -1;
        } else {
            arg0.field3534 = var2.method71((byte) -87);
            arg0.field3549 = var2.method69(-5944);
            arg0.field3536 = var2.method68(124);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ldg;III)V", line = 187)
    private final void method1503(class236 arg0, int arg1, int arg2, int arg3) {
        field3163++;
        if (arg3 == 1) {
            this.field3158 = arg0.method1617((byte) 48);
        } else if (arg3 == 2) {
            this.field3156 = true;
        } else if (arg3 == 3) {
            this.field3148 = arg0.method1613(64);
            this.field3146 = arg0.method1613(68);
            this.field3162 = arg0.method1613(98);
        } else if (arg3 == 4) {
            this.field3149 = arg0.method1574(-61);
        } else if (arg3 == 5) {
            this.field3145 = arg0.method1617((byte) 48);
        } else if (arg3 == 6) {
            this.field3150 = arg0.method1616(false);
        }
        if (arg1 != 30052) {
            method1501(-113L, 79);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 237)
    public static void method1504(int arg0) {
        field3161 = null;
        if (arg0 >= -99) {
            method1505(0, (class130) null, -50, false, (class130) null);
        }
        field3144 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILbj;IZLbj;)I", line = 253)
    public static final int method1505(int arg0, class130 arg1, int arg2, boolean arg3, class130 arg4) {
        field3159++;
        if (arg0 != 255) {
            field3164 = 1.3421584F;
        }
        if (arg2 == 1) {
            int var5 = arg1.field6331;
            int var6 = arg4.field6331;
            if (!arg3) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class291.method1926(arg1.method804((byte) -103).field4659, arg4.method804((byte) -44).field4659, class271.field3836, 713330051);
        } else if (arg2 == 3) {
            if (arg1.field1573.equals("-")) {
                if (arg4.field1573.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field1573.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class291.method1926(arg1.field1573, arg4.field1573, class271.field3836, 713330051);
            }
        } else if (arg2 == 4) {
            if (arg1.method2755((byte) 127)) {
                return arg4.method2755((byte) 57) ? 0 : 1;
            } else if (arg4.method2755((byte) 123)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 5) {
            if (arg1.method2750(false)) {
                return arg4.method2750(false) ? 0 : 1;
            } else if (arg4.method2750(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 6) {
            if (arg1.method2751(0)) {
                return arg4.method2751(0) ? 0 : 1;
            } else if (arg4.method2751(arg0 - 255)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 7) {
            if (arg1.method2752(-1959)) {
                return arg4.method2752(-1959) ? 0 : 1;
            } else if (arg4.method2752(-1959)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 8) {
            int var7 = arg1.field1581;
            int var8 = arg4.field1581;
            if (arg3) {
                if (var7 == 1000) {
                    var7 = -1;
                }
                if (var8 == 1000) {
                    var8 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg1.field1575 - arg4.field1575;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V", line = 352)
    public static final void method1506(boolean arg0) {
        field3147++;
        if (class188.field2717 == 181) {
            int var1 = class359.field5120.method1574(-22);
            int var2 = class322.field4586 * 2 + (var1 >> 4 & 0xF);
            int var3 = (var1 & 0xF) + class73.field878 * 2;
            int var4 = class359.field5120.method1589(false) + var2;
            int var5 = var3 + class359.field5120.method1589(false);
            int var6 = class359.field5120.method1613(103);
            int var7 = class359.field5120.method1617((byte) 48);
            int var8 = class359.field5120.method1574(-34) * 4;
            int var9 = class359.field5120.method1574(-20) * 4;
            int var10 = class359.field5120.method1617((byte) 48);
            int var11 = class359.field5120.method1617((byte) 48);
            int var12 = class359.field5120.method1574(-126);
            int var13 = class359.field5120.method1574(-88);
            if (var12 == 255) {
                var12 = -1;
            }
            if (var2 >= 0 && var3 >= 0 && var2 < class176.field2403 * 2 && var3 < class176.field2403 * 2 && var4 >= 0 && var5 >= 0 && (class383.field5395 * 2) > var4 && var5 < class383.field5395 * 2 && var7 != 65535) {
                int var14 = var2 * 64;
                int var15 = var3 * 64;
                int var16 = var5 * 64;
                int var17 = var4 * 64;
                class178 var18 = new class178(var7, class129.field1570, var14, var15, class114.method709(class129.field1570, var14, 0, var15) - var8, var10 - -class189.field2726, var11 + class189.field2726, var12, var13, var6, var9);
                var18.method1207(false, class114.method709(class129.field1570, var17, 0, var16) - var9, class189.field2726 + var10, var16, var17);
                class39.field441.method509((byte) 118, new class450(var18));
            }
        } else if (class188.field2717 == 38) {
            int var19 = class359.field5120.method1590(false);
            int var20 = class359.field5120.method1574(-80);
            int var21 = class322.field4586 + (var20 >> 4 & 0x7);
            int var22 = (var20 & 0x7) + class73.field878;
            int var23 = class359.field5120.method1556((byte) 12);
            int var24 = var23 >> 2;
            int var25 = var23 & 0x3;
            int var26 = class356.field5018[var24];
            if (var21 >= 0 && var22 >= 0 && var21 < class176.field2403 && class383.field5395 > var22) {
                class167.method1133(var22, var24, var21, var25, -1, class129.field1570, var26, 0, false, var19);
            }
        } else if (class188.field2717 == 102) {
            int var27 = class359.field5120.method1566(-3451);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var28 = class359.field5120.method1556((byte) -3);
            int var29 = (var28 >> 4 & 0x7) + class322.field4586;
            int var30 = (var28 & 0x7) + class73.field878;
            int var31 = class359.field5120.method1556((byte) 125);
            int var32 = var31 >> 2;
            int var33 = var31 & 0x3;
            int var34 = class356.field5018[var32];
            class374.method2386(var33, var27, var29, var30, var34, class129.field1570, -22646, var32);
        } else if (class188.field2717 == 199) {
            int var35 = class359.field5120.method1585(-120);
            int var36 = class359.field5120.method1556((byte) -10);
            int var37 = ((var36 & 0x72) >> 4) + class322.field4586;
            int var38 = (var36 & 0x7) + class73.field878;
            int var39 = class359.field5120.method1590(false);
            int var40 = class359.field5120.method1566(-3451);
            if (var37 >= 0 && var38 >= 0 && class176.field2403 > var37 && var38 < class383.field5395 && class414.field5948 != var35) {
                class153.method929(new class89(var40, var39), class129.field1570, var38, var37, (byte) 100);
                class254.method1717(var37, var38, class129.field1570, 1);
            }
        } else if (class188.field2717 == 203) {
            int var41 = class359.field5120.method1574(-67);
            int var42 = ((var41 & 0x78) >> 4) + class322.field4586;
            int var43 = (var41 & 0x7) + class73.field878;
            int var44 = var42 + class359.field5120.method1589(false);
            int var45 = class359.field5120.method1589(false) + var43;
            int var46 = class359.field5120.method1613(87);
            int var47 = class359.field5120.method1617((byte) 48);
            int var48 = class359.field5120.method1574(-86) * 4;
            int var49 = class359.field5120.method1574(-56) * 4;
            int var50 = class359.field5120.method1617((byte) 48);
            int var51 = class359.field5120.method1617((byte) 48);
            int var52 = class359.field5120.method1574(-67);
            if (var52 == 255) {
                var52 = -1;
            }
            int var53 = class359.field5120.method1574(-65);
            if (var42 >= 0 && var43 >= 0 && var42 < class176.field2403 && var43 < class383.field5395 && var44 >= 0 && var45 >= 0 && var44 < class176.field2403 && var45 < class383.field5395 && var47 != 65535) {
                int var54 = var45 * 128 + 64;
                int var55 = var44 * 128 + 64;
                int var56 = var43 * 128 + 64;
                int var57 = var42 * 128 + 64;
                class178 var58 = new class178(var47, class129.field1570, var57, var56, class114.method709(class129.field1570, var57, 0, var56) - var48, class189.field2726 + var50, var51 + class189.field2726, var52, var53, var46, var49);
                var58.method1207(false, class114.method709(class129.field1570, var55, 0, var54) - var49, class189.field2726 + var50, var54, var55);
                class39.field441.method509((byte) 99, new class450(var58));
            }
        } else if (class188.field2717 == 15) {
            int var59 = class359.field5120.method1574(-113);
            int var60 = (var59 >> 4 & 0x7) + class322.field4586;
            int var61 = (var59 & 0x7) + class73.field878;
            int var62 = class359.field5120.method1617((byte) 48);
            if (var62 == 65535) {
                var62 = -1;
            }
            int var63 = class359.field5120.method1574(-3);
            int var64 = (var63 & 0xFD) >> 4;
            int var65 = var63 & 0x7;
            int var66 = class359.field5120.method1574(-107);
            int var67 = class359.field5120.method1574(-120);
            if (var60 >= 0 && var61 >= 0 && class176.field2403 > var60 && var61 < class383.field5395) {
                int var68 = var64 + 1;
                if (var60 - var68 <= class384.field5422.field5677[0] && class384.field5422.field5677[0] <= var60 + var68 && (var61 - var68) <= class384.field5422.field5664[0] && class384.field5422.field5664[0] <= (var61 + var68) && class355.field4999 != 0 && var65 > 0 && class229.field3247 < 50 && var62 != -1) {
                    class418.field5981[class229.field3247] = var62;
                    class229.field3234[class229.field3247] = var65;
                    class55.field657[class229.field3247] = var66;
                    field3161[class229.field3247] = null;
                    class200.field2857[class229.field3247] = (var61 << 8) + (var60 << 16) + var64;
                    class276.field3916[class229.field3247] = var67;
                    class229.field3247++;
                }
            }
        } else {
            if (class188.field2717 == 143) {
                int var69 = class359.field5120.method1567(65280);
                int var70 = class322.field4586 + (var69 >> 4 & 0x7);
                int var71 = (var69 & 0x7) + class73.field878;
                int var72 = class359.field5120.method1617((byte) 48);
                int var73 = class359.field5120.method1617((byte) 48);
                byte var74 = class359.field5120.method1573(0);
                byte var75 = class359.field5120.method1589(false);
                int var76 = class359.field5120.method1590(false);
                int var77 = class359.field5120.method1574(-34);
                int var78 = var77 >> 2;
                int var79 = var77 & 0x3;
                int var80 = class359.field5120.method1578(true);
                byte var81 = class359.field5120.method1573(0);
                byte var82 = class359.field5120.method1573(0);
                if (!class151.field1873.method609()) {
                    class272.method1798(var82, var73, var81, var71, var72, var78, var70, var74, var76, (byte) -75, var80, var75, var79);
                }
            }
            if (class188.field2717 == 126) {
                int var83 = class359.field5120.method1617((byte) 48);
                int var84 = class359.field5120.method1574(-85);
                class374.method2382(var83, false).method484(var84, false);
            } else if (class188.field2717 == 83) {
                class359.field5120.method1574(-35);
                int var85 = class359.field5120.method1574(-31);
                int var86 = (var85 >> 4 & 0x7) + class322.field4586;
                int var87 = (var85 & 0x7) + class73.field878;
                int var88 = class359.field5120.method1617((byte) 48);
                int var89 = class359.field5120.method1574(-40);
                int var90 = class359.field5120.method1616(false);
                String var91 = class359.field5120.method1562(false);
                class451.method2794(0, var88, var91, var90, var89, var87, var86);
            } else if (class188.field2717 == 81) {
                int var92 = class359.field5120.method1556((byte) 122);
                int var93 = ((var92 & 0x7C) >> 4) + class322.field4586;
                int var94 = (var92 & 0x7) + class73.field878;
                int var95 = class359.field5120.method1617((byte) 48);
                if (var93 >= 0 && var94 >= 0 && var93 < class176.field2403 && var94 < class383.field5395) {
                    class282 var96 = (class282) class330.field4663.method1888((long) (var93 | var94 << 14 | class129.field1570 << 28), (byte) -30);
                    if (var96 != null) {
                        for (class89 var97 = (class89) var96.field3989.method506((byte) -128); var97 != null; var97 = (class89) var96.field3989.method514(true)) {
                            if ((var95 & 0x7FFF) == var97.field1084) {
                                var97.method2594((byte) -22);
                                break;
                            }
                        }
                        if (var96.field3989.method504(false)) {
                            var96.method2594((byte) -22);
                        }
                        class254.method1717(var93, var94, class129.field1570, 1);
                    }
                }
            } else if (class188.field2717 == 13) {
                int var98 = class359.field5120.method1574(-21);
                int var99 = (var98 >> 4 & 0x7) + class322.field4586;
                int var100 = class73.field878 + (var98 & 0x7);
                int var101 = class359.field5120.method1617((byte) 48);
                int var102 = class359.field5120.method1617((byte) 48);
                int var103 = class359.field5120.method1617((byte) 48);
                if (class330.field4663 != null && var99 >= 0 && var100 >= 0 && class176.field2403 > var99 && class383.field5395 > var100) {
                    class282 var104 = (class282) class330.field4663.method1888((long) (var100 << 14 | class129.field1570 << 28 | var99), (byte) -30);
                    if (var104 != null) {
                        for (class89 var105 = (class89) var104.field3989.method506((byte) -128); var105 != null; var105 = (class89) var104.field3989.method514(true)) {
                            if ((var101 & 0x7FFF) == var105.field1084 && var105.field1085 == var102) {
                                var105.method2594((byte) -22);
                                var105.field1085 = var103;
                                class153.method929(var105, class129.field1570, var100, var99, (byte) 100);
                                break;
                            }
                        }
                        class254.method1717(var99, var100, class129.field1570, 1);
                    }
                }
            } else if (class188.field2717 == 31) {
                int var106 = class359.field5120.method1574(-43);
                int var107 = ((var106 & 0xF7) >> 4) + class322.field4586 * 2;
                int var108 = (var106 & 0xF) + class73.field878 * 2;
                int var109 = var107 + class359.field5120.method1589(false);
                int var110 = var108 + class359.field5120.method1589(!arg0);
                int var111 = class359.field5120.method1613(51);
                int var112 = class359.field5120.method1613(109);
                int var113 = class359.field5120.method1617((byte) 48);
                int var114 = class359.field5120.method1589(false);
                int var115 = class359.field5120.method1574(-119) * 4;
                int var116 = class359.field5120.method1617((byte) 48);
                int var117 = class359.field5120.method1617((byte) 48);
                int var118 = class359.field5120.method1574(-24);
                int var119 = class359.field5120.method1574(-73);
                if (var118 == 255) {
                    var118 = -1;
                }
                if (var107 >= 0 && var108 >= 0 && var107 < class176.field2403 * 2 && var108 < class176.field2403 * 2 && var109 >= 0 && var110 >= 0 && var109 < class383.field5395 * 2 && var110 < (class383.field5395 * 2) && var113 != 65535) {
                    int var120 = var109 * 64;
                    int var121 = var107 * 64;
                    int var122 = var110 * 64;
                    int var123 = var108 * 64;
                    if (var111 != 0) {
                        int var126;
                        class396 var127;
                        if (var111 < 0) {
                            int var124 = -var111 - 1;
                            int var125 = var124 & 0x7FF;
                            var126 = var124 >> 11 & 0xF;
                            if (class414.field5948 == var125) {
                                var127 = class384.field5422;
                            } else {
                                var127 = class26.field314[var125];
                            }
                        } else {
                            int var128 = var111 - 1;
                            var126 = (var128 & 0x7BCB) >> 11;
                            int var129 = var128 & 0x7FF;
                            var127 = class167.field2335[var129];
                        }
                        if (var127 != null) {
                            class306 var130 = var127.method2526(4);
                            if (var130.field4298 != null && var130.field4298[var126] != null) {
                                int var131 = var130.field4298[var126][0];
                                int var132 = var130.field4298[var126][2];
                                int var133 = var127.field5602.method2177((byte) -122);
                                int var134 = class158.field2055[var133];
                                int var135 = class158.field2059[var133];
                                int var136 = var131 * var135 + var132 * var134 >> 15;
                                int var137 = var132 * var135 - (var131 * var134) >> 15;
                                var114 -= var130.field4298[var126][1];
                                var123 += var137;
                                var121 += var136;
                            }
                        }
                    }
                    class178 var139 = new class178(var113, class129.field1570, var121, var123, class114.method709(class129.field1570, var121, 0, var123) - var114, var116 - -class189.field2726, class189.field2726 + var117, var118, var119, var112, var115);
                    var139.method1207(false, class114.method709(class129.field1570, var120, 0, var122) - var115, class189.field2726 + var116, var122, var120);
                    class39.field441.method509((byte) 116, new class450(var139));
                }
            } else if (class188.field2717 == 246) {
                int var140 = class359.field5120.method1590(false);
                int var141 = class359.field5120.method1566(-3451);
                int var142 = class359.field5120.method1567(65280);
                int var143 = ((var142 & 0x7B) >> 4) + class322.field4586;
                int var144 = class73.field878 + (var142 & 0x7);
                if (var143 >= 0 && var144 >= 0 && var143 < class176.field2403 && var144 < class383.field5395) {
                    class153.method929(new class89(var140, var141), class129.field1570, var144, var143, (byte) 100);
                    class254.method1717(var143, var144, class129.field1570, 1);
                }
            } else {
                if (!arg0) {
                    method1505(26, (class130) null, 80, false, (class130) null);
                }
                if (class188.field2717 == 82) {
                    int var145 = class359.field5120.method1556((byte) 122);
                    int var146 = var145 >> 2;
                    int var147 = var145 & 0x3;
                    int var148 = class356.field5018[var146];
                    int var149 = class359.field5120.method1567(65280);
                    int var150 = (var149 >> 4 & 0x7) + class322.field4586;
                    int var151 = (var149 & 0x7) + class73.field878;
                    if (var150 >= 0 && var151 >= 0 && var150 < class176.field2403 && var151 < class383.field5395) {
                        class167.method1133(var151, var146, var150, var147, -1, class129.field1570, var148, 0, false, -1);
                    }
                } else if (class188.field2717 == 155) {
                    int var152 = class359.field5120.method1574(-91);
                    int var153 = (var152 >> 4 & 0x7) + class322.field4586;
                    int var154 = class73.field878 + (var152 & 0x7);
                    int var155 = class359.field5120.method1617((byte) 48);
                    int var156 = class359.field5120.method1574(-23);
                    int var157 = class359.field5120.method1617((byte) 48);
                    if (var153 >= 0 && var154 >= 0 && class176.field2403 > var153 && class383.field5395 > var154) {
                        int var158 = var153 * 128 + 64;
                        int var159 = var154 * 128 + 64;
                        class8 var160 = new class8(var155, var157, class189.field2726, class129.field1570, var158, class114.method709(class129.field1570, var158, 0, var159) - var156, var159, var153, var153, var154, var154);
                        class79.field928.method509((byte) 116, new class267(var160));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ldg;II)V", line = 959)
    public final void method1507(class236 arg0, int arg1, int arg2) {
        field3152++;
        while (true) {
            int var4 = arg0.method1574(-86);
            if (var4 == 0) {
                if (arg1 >= -33) {
                    field3144 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method1503(arg0, 30052, arg2, var4);
        }
    }
}
