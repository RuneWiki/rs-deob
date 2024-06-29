import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class74 extends class167 {

    @OriginalMember(owner = "client!gh", name = "db", descriptor = "I")
    private int field1409 = 1;

    @OriginalMember(owner = "client!gh", name = "gb", descriptor = "I")
    private int field1412 = 1;

    @OriginalMember(owner = "client!gh", name = "Y", descriptor = "I")
    public static int field1404 = 0;

    @OriginalMember(owner = "client!gh", name = "ab", descriptor = "I")
    public static int field1406 = 127;

    @OriginalMember(owner = "client!gh", name = "X", descriptor = "Lkh;")
    public static class117 field1403 = class224.method1450((byte) -25, "Freie Welt");

    @OriginalMember(owner = "client!gh", name = "bb", descriptor = "Lkh;")
    public static class117 field1407 = class224.method1450((byte) 8, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!gh", name = "Z", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!gh", name = "cb", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!gh", name = "eb", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!gh", name = "fb", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "[Lo;")
    public static class153[] field1401;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -96) {
            this.field1412 = -64;
        }
        ++field1399;
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (super.field3013.field4085) {
            int var4 = this.field1409 + 1 - -this.field1409;
            int var5 = 65536 / var4;
            int var6 = this.field1412 - -this.field1412 - -1;
            int[][] var7 = new int[var4][];
            int var8 = 65536 / var6;
            for (int var9 = -this.field1409 + arg1; ~var9 >= ~(this.field1409 + arg1); ++var9) {
                int[] var13 = this.method1186(var9 & class101.field1839, arg0 ^ -96, 0);
                int[] var14 = new int[class115.field2146];
                int var15 = 0;
                for (int var16 = -this.field1412; ~var16 >= ~this.field1412; ++var16) {
                    var15 += var13[class34.field801 & var16];
                }
                int var17 = 0;
                while (class115.field2146 > var17) {
                    var14[var17] = var8 * var15 >> 16;
                    int var18 = var15 - var13[class34.field801 & -this.field1412 + var17];
                    ++var17;
                    var15 = var13[this.field1412 + var17 & class34.field801] + var18;
                }
                var7[-arg1 + var9 + this.field1409] = var14;
            }
            for (int var10 = 0; class115.field2146 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var7[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        ++field1410;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field3009 = ~arg0.method998(119) == -2;
                }
            } else {
                this.field1409 = arg0.method998(86);
            }
        } else {
            this.field1412 = arg0.method998(125);
        }
        if (arg1) {
            method519((class38) null, -61, 114, -17);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lpf;Z)V")
    public static final void method517(class170 arg0, boolean arg1) {
        class229.field4125.method325(120, arg0);
        while (true) {
            class170 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class170[][] var7;
            class170 var65;
            do {
                class170 var64;
                do {
                    class170 var63;
                    do {
                        class170 var62;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class170) class229.field4125.method326(-121);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3071);
                                            var3 = var2.field3066;
                                            var4 = var2.field3077;
                                            var5 = var2.field3069;
                                            var6 = var2.field3061;
                                            var7 = class109.field2063[var5];
                                            if (!var2.field3068) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class170 var8 = class109.field2063[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field3071) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class38.field870 && var3 > class75.field1414) {
                                                    class170 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field3071 && (var9.field3068 || (var2.field3059 & 1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class38.field870 && var3 < class209.field3757 - 1) {
                                                    class170 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field3071 && (var10.field3068 || (var2.field3059 & 4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class225.field4065 && var4 > class158.field2880) {
                                                    class170 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field3071 && (var11.field3068 || (var2.field3059 & 8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class225.field4065 && var4 < class13.field411 - 1) {
                                                    class170 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field3071 && (var12.field3068 || (var2.field3059 & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3068 = false;
                                            if (var2.field3058 != null) {
                                                class170 var13 = var2.field3058;
                                                if (var13.field3057 != null) {
                                                    if (!class157.method1114(0, var3, var4)) {
                                                        class61.method449(var13.field3057, 0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var3, var4, false);
                                                    } else {
                                                        class61.method449(var13.field3057, 0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var3, var4, true);
                                                    }
                                                } else if (var13.field3070 != null) {
                                                    if (!class157.method1114(0, var3, var4)) {
                                                        class228.method1476(var13.field3070, class161.field2940, class41.field930, class194.field3463, class147.field2693, var3, var4, false);
                                                    } else {
                                                        class228.method1476(var13.field3070, class161.field2940, class41.field930, class194.field3463, class147.field2693, var3, var4, true);
                                                    }
                                                }
                                                class90 var14 = var13.field3062;
                                                if (var14 != null) {
                                                    var14.field1661.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var14.field1666 - class225.field4064, var14.field1671 - class115.field2139, var14.field1677 - class175.field3160, var14.field1670);
                                                }
                                                for (int var15 = 0; var15 < var13.field3065; ++var15) {
                                                    class57 var16 = var13.field3063[var15];
                                                    if (var16 != null) {
                                                        var16.field1182.method158(var16.field1176, class161.field2940, class41.field930, class194.field3463, class147.field2693, var16.field1191 - class225.field4064, var16.field1177 - class115.field2139, var16.field1184 - class175.field3160, var16.field1171);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field3057 != null) {
                                                if (!class157.method1114(var6, var3, var4)) {
                                                    var17 = true;
                                                    if (var2.field3057.field419 != 12345678 || class78.field1487 && var5 <= class182.field3291) {
                                                        class61.method449(var2.field3057, var6, class161.field2940, class41.field930, class194.field3463, class147.field2693, var3, var4, false);
                                                    }
                                                } else {
                                                    class61.method449(var2.field3057, var6, class161.field2940, class41.field930, class194.field3463, class147.field2693, var3, var4, true);
                                                }
                                            } else if (var2.field3070 != null) {
                                                if (!class157.method1114(var6, var3, var4)) {
                                                    var17 = true;
                                                    class228.method1476(var2.field3070, class161.field2940, class41.field930, class194.field3463, class147.field2693, var3, var4, false);
                                                } else {
                                                    class228.method1476(var2.field3070, class161.field2940, class41.field930, class194.field3463, class147.field2693, var3, var4, true);
                                                }
                                            }
                                            int var18 = 0;
                                            int var19 = 0;
                                            class90 var20 = var2.field3062;
                                            class239 var21 = var2.field3073;
                                            if (var20 != null || var21 != null) {
                                                if (class38.field870 == var3) {
                                                    ++var18;
                                                } else if (class38.field870 < var3) {
                                                    var18 += 2;
                                                }
                                                if (class225.field4065 == var4) {
                                                    var18 += 3;
                                                } else if (class225.field4065 > var4) {
                                                    var18 += 6;
                                                }
                                                var19 = class161.field2942[var18];
                                                var2.field3072 = class12.field384[var18];
                                            }
                                            if (var20 != null) {
                                                if ((var20.field1668 & class34.field804[var18]) != 0) {
                                                    if (var20.field1668 == 16) {
                                                        var2.field3078 = 3;
                                                        var2.field3064 = class181.field3268[var18];
                                                        var2.field3060 = 3 - var2.field3064;
                                                    } else if (var20.field1668 == 32) {
                                                        var2.field3078 = 6;
                                                        var2.field3064 = class79.field1488[var18];
                                                        var2.field3060 = 6 - var2.field3064;
                                                    } else if (var20.field1668 == 64) {
                                                        var2.field3078 = 12;
                                                        var2.field3064 = class7.field118[var18];
                                                        var2.field3060 = 12 - var2.field3064;
                                                    } else {
                                                        var2.field3078 = 9;
                                                        var2.field3064 = class222.field4006[var18];
                                                        var2.field3060 = 9 - var2.field3064;
                                                    }
                                                } else {
                                                    var2.field3078 = 0;
                                                }
                                                if ((var20.field1668 & var19) != 0 && !class154.method1091(var6, var3, var4, var20.field1668)) {
                                                    var20.field1661.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var20.field1666 - class225.field4064, var20.field1671 - class115.field2139, var20.field1677 - class175.field3160, var20.field1670);
                                                }
                                                if ((var20.field1676 & var19) != 0 && !class154.method1091(var6, var3, var4, var20.field1676)) {
                                                    var20.field1678.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var20.field1666 - class225.field4064, var20.field1671 - class115.field2139, var20.field1677 - class175.field3160, var20.field1670);
                                                }
                                            }
                                            if (var21 != null && !class218.method1430(var6, var3, var4, var21.field4320.method134())) {
                                                if ((var21.field4321 & var19) != 0) {
                                                    var21.field4320.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var21.field4328 - class225.field4064 + var21.field4319, var21.field4322 - class115.field2139, var21.field4315 - class175.field3160 + var21.field4316, var21.field4326);
                                                } else if (var21.field4321 == 256) {
                                                    int var22 = var21.field4328 - class225.field4064;
                                                    int var23 = var21.field4322 - class115.field2139;
                                                    int var24 = var21.field4315 - class175.field3160;
                                                    int var25 = var21.field4325;
                                                    int var26;
                                                    if (var25 != 1 && var25 != 2) {
                                                        var26 = var22;
                                                    } else {
                                                        var26 = -var22;
                                                    }
                                                    int var27;
                                                    if (var25 != 2 && var25 != 3) {
                                                        var27 = var24;
                                                    } else {
                                                        var27 = -var24;
                                                    }
                                                    if (var27 < var26) {
                                                        var21.field4320.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var21.field4319 + var22, var23, var21.field4316 + var24, var21.field4326);
                                                    } else if (var21.field4331 != null) {
                                                        var21.field4331.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var22, var23, var24, var21.field4326);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class28 var28 = var2.field3074;
                                                if (var28 != null) {
                                                    var28.field683.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var28.field684 - class225.field4064, var28.field686 - class115.field2139, var28.field679 - class175.field3160, var28.field687);
                                                }
                                                class179 var29 = var2.field3067;
                                                if (var29 != null && var29.field3242 == 0) {
                                                    if (var29.field3232 != null) {
                                                        var29.field3232.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var29.field3249 - class225.field4064, var29.field3230 - class115.field2139, var29.field3243 - class175.field3160, var29.field3244);
                                                    }
                                                    if (var29.field3240 != null) {
                                                        var29.field3240.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var29.field3249 - class225.field4064, var29.field3230 - class115.field2139, var29.field3243 - class175.field3160, var29.field3244);
                                                    }
                                                    if (var29.field3238 != null) {
                                                        var29.field3238.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var29.field3249 - class225.field4064, var29.field3230 - class115.field2139, var29.field3243 - class175.field3160, var29.field3244);
                                                    }
                                                }
                                            }
                                            int var30 = var2.field3059;
                                            if (var30 != 0) {
                                                if (var3 < class38.field870 && (var30 & 4) != 0) {
                                                    class170 var31 = var7[var3 + 1][var4];
                                                    if (var31 != null && var31.field3071) {
                                                        class229.field4125.method325(120, var31);
                                                    }
                                                }
                                                if (var4 < class225.field4065 && (var30 & 2) != 0) {
                                                    class170 var32 = var7[var3][var4 + 1];
                                                    if (var32 != null && var32.field3071) {
                                                        class229.field4125.method325(121, var32);
                                                    }
                                                }
                                                if (var3 > class38.field870 && (var30 & 1) != 0) {
                                                    class170 var33 = var7[var3 - 1][var4];
                                                    if (var33 != null && var33.field3071) {
                                                        class229.field4125.method325(126, var33);
                                                    }
                                                }
                                                if (var4 > class225.field4065 && (var30 & 8) != 0) {
                                                    class170 var34 = var7[var3][var4 - 1];
                                                    if (var34 != null && var34.field3071) {
                                                        class229.field4125.method325(119, var34);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3078 != 0) {
                                            boolean var35 = true;
                                            for (int var36 = 0; var36 < var2.field3065; ++var36) {
                                                if (class8.field146 != var2.field3063[var36].field1180 && (var2.field3079[var36] & var2.field3078) == var2.field3064) {
                                                    var35 = false;
                                                    break;
                                                }
                                            }
                                            if (var35) {
                                                class90 var37 = var2.field3062;
                                                if (!class154.method1091(var6, var3, var4, var37.field1668)) {
                                                    var37.field1661.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var37.field1666 - class225.field4064, var37.field1671 - class115.field2139, var37.field1677 - class175.field3160, var37.field1670);
                                                }
                                                var2.field3078 = 0;
                                            }
                                        }
                                        if (!var2.field3075) {
                                            break;
                                        }
                                        try {
                                            int var38 = var2.field3065;
                                            var2.field3075 = false;
                                            int var39 = 0;
                                            label562: for (int var40 = 0; var40 < var38; ++var40) {
                                                class57 var41 = var2.field3063[var40];
                                                if (class8.field146 != var41.field1180) {
                                                    for (int var42 = var41.field1186; var42 <= var41.field1178; ++var42) {
                                                        for (int var43 = var41.field1170; var43 <= var41.field1179; ++var43) {
                                                            class170 var44 = var7[var42][var43];
                                                            if (var44.field3068) {
                                                                var2.field3075 = true;
                                                                continue label562;
                                                            }
                                                            if (var44.field3078 != 0) {
                                                                int var45 = 0;
                                                                if (var42 > var41.field1186) {
                                                                    ++var45;
                                                                }
                                                                if (var42 < var41.field1178) {
                                                                    var45 += 4;
                                                                }
                                                                if (var43 > var41.field1170) {
                                                                    var45 += 8;
                                                                }
                                                                if (var43 < var41.field1179) {
                                                                    var45 += 2;
                                                                }
                                                                if ((var45 & var44.field3078) == var2.field3060) {
                                                                    var2.field3075 = true;
                                                                    continue label562;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class18.field526[var39++] = var41;
                                                    int var46 = class38.field870 - var41.field1186;
                                                    int var47 = var41.field1178 - class38.field870;
                                                    if (var47 > var46) {
                                                        var46 = var47;
                                                    }
                                                    int var48 = class225.field4065 - var41.field1170;
                                                    int var49 = var41.field1179 - class225.field4065;
                                                    if (var49 > var48) {
                                                        var41.field1174 = var46 + var49;
                                                    } else {
                                                        var41.field1174 = var46 + var48;
                                                    }
                                                }
                                            }
                                            while (var39 > 0) {
                                                int var50 = -50;
                                                int var51 = -1;
                                                for (int var52 = 0; var52 < var39; ++var52) {
                                                    class57 var53 = class18.field526[var52];
                                                    if (class8.field146 != var53.field1180) {
                                                        if (var53.field1174 > var50) {
                                                            var50 = var53.field1174;
                                                            var51 = var52;
                                                        } else if (var53.field1174 == var50) {
                                                            int var54 = var53.field1191 - class225.field4064;
                                                            int var55 = var53.field1184 - class175.field3160;
                                                            int var56 = class18.field526[var51].field1191 - class225.field4064;
                                                            int var57 = class18.field526[var51].field1184 - class175.field3160;
                                                            if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                                var51 = var52;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var51 == -1) {
                                                    break;
                                                }
                                                class57 var58 = class18.field526[var51];
                                                var58.field1180 = class8.field146;
                                                if (!class162.method1155(var6, var58.field1186, var58.field1178, var58.field1170, var58.field1179, var58.field1182.method134())) {
                                                    var58.field1182.method158(var58.field1176, class161.field2940, class41.field930, class194.field3463, class147.field2693, var58.field1191 - class225.field4064, var58.field1177 - class115.field2139, var58.field1184 - class175.field3160, var58.field1171);
                                                }
                                                for (int var59 = var58.field1186; var59 <= var58.field1178; ++var59) {
                                                    for (int var60 = var58.field1170; var60 <= var58.field1179; ++var60) {
                                                        class170 var61 = var7[var59][var60];
                                                        if (var61.field3078 != 0) {
                                                            class229.field4125.method325(109, var61);
                                                        } else if ((var3 != var59 || var4 != var60) && var61.field3071) {
                                                            class229.field4125.method325(126, var61);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3075) {
                                                break;
                                            }
                                        } catch (Exception var80) {
                                            var2.field3075 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3071);
                            } while (var2.field3078 != 0);
                            if (var3 > class38.field870 || var3 <= class75.field1414) {
                                break;
                            }
                            var62 = var7[var3 - 1][var4];
                        } while (var62 != null && var62.field3071);
                        if (var3 < class38.field870 || var3 >= class209.field3757 - 1) {
                            break;
                        }
                        var63 = var7[var3 + 1][var4];
                    } while (var63 != null && var63.field3071);
                    if (var4 > class225.field4065 || var4 <= class158.field2880) {
                        break;
                    }
                    var64 = var7[var3][var4 - 1];
                } while (var64 != null && var64.field3071);
                if (var4 < class225.field4065 || var4 >= class13.field411 - 1) {
                    break;
                }
                var65 = var7[var3][var4 + 1];
            } while (var65 != null && var65.field3071);
            var2.field3071 = false;
            --class6.field103;
            class179 var66 = var2.field3067;
            if (var66 != null && var66.field3242 != 0) {
                if (var66.field3232 != null) {
                    var66.field3232.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var66.field3249 - class225.field4064, var66.field3230 - class115.field2139 - var66.field3242, var66.field3243 - class175.field3160, var66.field3244);
                }
                if (var66.field3240 != null) {
                    var66.field3240.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var66.field3249 - class225.field4064, var66.field3230 - class115.field2139 - var66.field3242, var66.field3243 - class175.field3160, var66.field3244);
                }
                if (var66.field3238 != null) {
                    var66.field3238.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var66.field3249 - class225.field4064, var66.field3230 - class115.field2139 - var66.field3242, var66.field3243 - class175.field3160, var66.field3244);
                }
            }
            if (var2.field3072 != 0) {
                class239 var67 = var2.field3073;
                if (var67 != null && !class218.method1430(var6, var3, var4, var67.field4320.method134())) {
                    if ((var67.field4321 & var2.field3072) != 0) {
                        var67.field4320.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var67.field4328 - class225.field4064 + var67.field4319, var67.field4322 - class115.field2139, var67.field4315 - class175.field3160 + var67.field4316, var67.field4326);
                    } else if (var67.field4321 == 256) {
                        int var68 = var67.field4328 - class225.field4064;
                        int var69 = var67.field4322 - class115.field2139;
                        int var70 = var67.field4315 - class175.field3160;
                        int var71 = var67.field4325;
                        int var72;
                        if (var71 != 1 && var71 != 2) {
                            var72 = var68;
                        } else {
                            var72 = -var68;
                        }
                        int var73;
                        if (var71 != 2 && var71 != 3) {
                            var73 = var70;
                        } else {
                            var73 = -var70;
                        }
                        if (var73 >= var72) {
                            var67.field4320.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var67.field4319 + var68, var69, var67.field4316 + var70, var67.field4326);
                        } else if (var67.field4331 != null) {
                            var67.field4331.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var68, var69, var70, var67.field4326);
                        }
                    }
                }
                class90 var74 = var2.field3062;
                if (var74 != null) {
                    if ((var74.field1676 & var2.field3072) != 0 && !class154.method1091(var6, var3, var4, var74.field1676)) {
                        var74.field1678.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var74.field1666 - class225.field4064, var74.field1671 - class115.field2139, var74.field1677 - class175.field3160, var74.field1670);
                    }
                    if ((var74.field1668 & var2.field3072) != 0 && !class154.method1091(var6, var3, var4, var74.field1668)) {
                        var74.field1661.method158(0, class161.field2940, class41.field930, class194.field3463, class147.field2693, var74.field1666 - class225.field4064, var74.field1671 - class115.field2139, var74.field1677 - class175.field3160, var74.field1670);
                    }
                }
            }
            if (var5 < class60.field1208 - 1) {
                class170 var75 = class109.field2063[var5 + 1][var3][var4];
                if (var75 != null && var75.field3071) {
                    class229.field4125.method325(121, var75);
                }
            }
            if (var3 < class38.field870) {
                class170 var76 = var7[var3 + 1][var4];
                if (var76 != null && var76.field3071) {
                    class229.field4125.method325(111, var76);
                }
            }
            if (var4 < class225.field4065) {
                class170 var77 = var7[var3][var4 + 1];
                if (var77 != null && var77.field3071) {
                    class229.field4125.method325(127, var77);
                }
            }
            if (var3 > class38.field870) {
                class170 var78 = var7[var3 - 1][var4];
                if (var78 != null && var78.field3071) {
                    class229.field4125.method325(112, var78);
                }
            }
            if (var4 > class225.field4065) {
                class170 var79 = var7[var3][var4 - 1];
                if (var79 != null && var79.field3071) {
                    class229.field4125.method325(109, var79);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "(I)V")
    public static void method518(int arg0) {
        if (arg0 == -26619) {
            field1407 = null;
            field1401 = null;
            field1403 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ldd;III)V")
    public static final void method519(class38 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class92.field1698) {
            class170 var4 = class109.field2063[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3074 != null && var4.field3074.field683.method146()) {
                arg0.method152(var4.field3074.field683, 128, 0, 0, true);
            }
        }
        if (arg3 < class92.field1698) {
            class170 var5 = class109.field2063[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3074 != null && var5.field3074.field683.method146()) {
                arg0.method152(var5.field3074.field683, 0, 0, 128, true);
            }
        }
        if (arg2 < class92.field1698 && arg3 < class170.field3053) {
            class170 var6 = class109.field2063[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3074 != null && var6.field3074.field683.method146()) {
                arg0.method152(var6.field3074.field683, 128, 0, 128, true);
            }
        }
        if (arg2 < class92.field1698 && arg3 > 0) {
            class170 var7 = class109.field2063[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3074 != null && var7.field3074.field683.method146()) {
                arg0.method152(var7.field3074.field683, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    public class74() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[[I")
    public final int[][] method116(int arg0, int arg1) {
        int[][] var3 = super.field3022.method1148(arg0, 8708);
        ++field1405;
        if (super.field3022.field2957) {
            int var4 = this.field1409 + this.field1409 + 1;
            int var5 = 65536 / var4;
            int[][][] var6 = new int[var4][][];
            int var7 = this.field1412 + 1 + this.field1412;
            int var8 = 65536 / var7;
            for (int var9 = arg0 - this.field1409; this.field1409 + arg0 >= var9; ++var9) {
                int var19 = 0;
                int[][] var20 = this.method1180(class101.field1839 & var9, 26851, 0);
                int var21 = 0;
                int[][] var22 = new int[3][class115.field2146];
                int[] var23 = var20[0];
                int var24 = 0;
                int[] var25 = var20[1];
                int[] var26 = var20[2];
                for (int var27 = -this.field1412; this.field1412 >= var27; ++var27) {
                    int var37 = class34.field801 & var27;
                    var24 += var25[var37];
                    var19 += var23[var37];
                    var21 += var26[var37];
                }
                int[] var28 = var22[1];
                int[] var29 = var22[0];
                int[] var30 = var22[2];
                int var31 = 0;
                while (~class115.field2146 < ~var31) {
                    var29[var31] = var8 * var19 >> 16;
                    var28[var31] = var8 * var24 >> 16;
                    var30[var31] = var8 * var21 >> 16;
                    int var32 = class34.field801 & var31 - this.field1412;
                    int var33 = var19 - var23[var32];
                    ++var31;
                    int var34 = var21 - var26[var32];
                    int var35 = var24 - var25[var32];
                    int var36 = class34.field801 & this.field1412 + var31;
                    var21 = var26[var36] + var34;
                    var19 = var23[var36] + var33;
                    var24 = var25[var36] + var35;
                }
                var6[var9 - arg0 + this.field1409] = var22;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class115.field2146 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var6[var17];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return arg1 != -9179 ? null : var3;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIILah;)V")
    public static final void method520(int arg0, int arg1, int arg2, int arg3, class9 arg4) {
        class93.method637(10000);
        ++field1402;
        class83.method575(arg0, arg1, arg4.field256 + arg0, arg4.field207 + arg1);
        if (class201.field3645 != 2 && class201.field3645 != 5) {
            int var5 = 2047 & client.field776 + class13.field427;
            int var6 = class93.field1712.field4244 / 32 + 48;
            int var7 = -(class93.field1712.field4221 / 32) + 464;
            ((class144) class78.field1485).method978(arg0, arg1, arg4.field256, arg4.field207, var6, var7, var5, class174.field3151 + 256, arg4.field292, arg4.field280);
            for (int var8 = 0; class32.field758 > var8; ++var8) {
                int var41 = class212.field3862[var8] * 4 + 2 - class93.field1712.field4244 / 32;
                int var42 = class19.field534[var8] * 4 - -2 + -(class93.field1712.field4221 / 32);
                class211 var43 = class48.method379(49, class92.field1688[var8]);
                if (var43.field3792 != null) {
                    var43 = var43.method1378((byte) 69);
                    if (var43 == null || ~var43.field3833 == 0) {
                        continue;
                    }
                }
                class248.method1621(arg4, arg1, var42, false, class123.field2305[var43.field3833], var41, arg0);
            }
            for (int var9 = 0; var9 < 104; ++var9) {
                for (int var37 = 0; var37 < 104; ++var37) {
                    class36 var38 = class143.field2597[class203.field3675][var9][var37];
                    if (var38 != null) {
                        int var39 = var9 * 4 + 2 - class93.field1712.field4244 / 32;
                        int var40 = var37 * 4 + -(class93.field1712.field4221 / 32) + 2;
                        class248.method1621(arg4, arg1, var40, false, class45.field971[0], var39, arg0);
                    }
                }
            }
            for (int var10 = 0; var10 < class61.field1229; ++var10) {
                class207 var33 = class1.field18[class21.field565[var10]];
                if (var33 != null && var33.method425(98)) {
                    class109 var34 = var33.field3718;
                    if (var34 != null && var34.field2034 != null) {
                        var34 = var34.method733(false);
                    }
                    if (var34 != null && var34.field2054 && var34.field2050) {
                        int var35 = var33.field4244 / 32 + -(class93.field1712.field4244 / 32);
                        int var36 = var33.field4221 / 32 - class93.field1712.field4221 / 32;
                        class248.method1621(arg4, arg1, var36, false, class45.field971[1], var35, arg0);
                    }
                }
            }
            for (int var11 = 0; ~var11 > ~class229.field4121; ++var11) {
                class56 var25 = class43.field950[class139.field2539[var11]];
                if (var25 != null && var25.method425(-126)) {
                    int var26 = var25.field4244 / 32 - class93.field1712.field4244 / 32;
                    int var27 = var25.field4221 / 32 - class93.field1712.field4221 / 32;
                    boolean var28 = false;
                    long var29 = var25.field1141.method813((byte) 93);
                    for (int var31 = 0; ~class151.field2744 < ~var31; ++var31) {
                        if (~class32.field751[var31] == ~var29 && ~class99.field1813[var31] != -1) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var32 = false;
                    if (class93.field1712.field1128 != 0 && ~var25.field1128 != -1 && class93.field1712.field1128 == var25.field1128) {
                        var32 = true;
                    }
                    if (!var28) {
                        if (!var32) {
                            class248.method1621(arg4, arg1, var27, false, class45.field971[2], var26, arg0);
                        } else {
                            class248.method1621(arg4, arg1, var27, false, class45.field971[4], var26, arg0);
                        }
                    } else {
                        class248.method1621(arg4, arg1, var27, false, class45.field971[3], var26, arg0);
                    }
                }
            }
            int var12 = 0;
            class209[] var13 = class84.field1598;
            while (var12 < var13.length) {
                class209 var16 = var13[var12];
                if (var16 != null && ~var16.field3760 != -1 && class44.field966 % 20 < 10) {
                    if (var16.field3760 == 1 && var16.field3745 >= 0 && ~var16.field3745 > ~class1.field18.length) {
                        class207 var17 = class1.field18[var16.field3745];
                        if (var17 != null) {
                            int var18 = var17.field4221 / 32 + -(class93.field1712.field4221 / 32);
                            int var19 = var17.field4244 / 32 - class93.field1712.field4244 / 32;
                            class17.method167(var16.field3750, var19, -22783, arg1, arg4, arg0, var18);
                        }
                    }
                    if (var16.field3760 == 2) {
                        int var20 = (-class143.field2591 + var16.field3739) * 4 + (2 - class93.field1712.field4244 / 32);
                        int var21 = (-class184.field3319 + var16.field3743) * 4 - (class93.field1712.field4221 / 32 + -2);
                        class17.method167(var16.field3750, var20, -22783, arg1, arg4, arg0, var21);
                    }
                    if (var16.field3760 == 10 && ~var16.field3745 <= -1 && ~class43.field950.length < ~var16.field3745) {
                        class56 var22 = class43.field950[var16.field3745];
                        if (var22 != null) {
                            int var23 = var22.field4244 / 32 + -(class93.field1712.field4244 / 32);
                            int var24 = var22.field4221 / 32 - class93.field1712.field4221 / 32;
                            class17.method167(var16.field3750, var23, -22783, arg1, arg4, arg0, var24);
                        }
                    }
                }
                ++var12;
            }
            if (class61.field1233 != 0) {
                int var14 = class61.field1233 * 4 + 2 + -(class93.field1712.field4244 / 32);
                int var15 = class193.field3448 * 4 + -(class93.field1712.field4221 / 32) + 2;
                class248.method1621(arg4, arg1, var15, false, class103.field1889, var14, arg0);
            }
            class83.method579(arg4.field256 / 2 + arg0 + -1, arg4.field207 / 2 + arg1 + -1, 3, 3, 16777215);
        } else {
            class83.method587(arg0, arg1, 0, arg4.field292, arg4.field280);
        }
        class51.field1058[arg2] = true;
        int var44 = 33 / ((arg3 - 25) / 63);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([BB)[B")
    public static final byte[] method521(byte[] arg0, byte arg1) {
        int var2 = 12 / ((arg1 - -82) / 44);
        ++field1411;
        class145 var3 = new class145(arg0);
        int var4 = var3.method998(93);
        int var5 = var3.method1018(-1068451600);
        if (~var5 <= -1 && (class175.field3157 == 0 || var5 <= class175.field3157)) {
            if (~var4 == -1) {
                byte[] var6 = new byte[var5];
                var3.method1022(-15020, var5, 0, var6);
                return var6;
            } else {
                int var7 = var3.method1018(-1068451600);
                if (~var7 > -1 || ~class175.field3157 != -1 && class175.field3157 < var7) {
                    throw new RuntimeException();
                } else {
                    byte[] var8 = new byte[var7];
                    if (var4 != 1) {
                        class39.field899.method451(12014, var3, var8);
                    } else {
                        class64.method472(var8, var7, arg0, var5, 9);
                    }
                    return var8;
                }
            }
        } else {
            throw new RuntimeException();
        }
    }
}
