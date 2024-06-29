import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class142 {

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public int field2007;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public int field2001;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public int field2006;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZLlh;)V", line = 19)
    public static final void method1056(int arg0, boolean arg1, class364 arg2) {
        field2002++;
        if (class291.field4175 >= 400) {
            return;
        }
        int var3 = 67 / ((arg0 - 17) / 56);
        if (class435.field6375 != arg2) {
            String var4;
            if (arg2.field5082 == 0) {
                boolean var5 = true;
                if (class435.field6375.field5075 != -1 && arg2.field5075 != -1) {
                    int var6 = class435.field6375.field5093 > arg2.field5093 ? class435.field6375.field5093 : arg2.field5093;
                    int var7 = arg2.field5075 > class435.field6375.field5075 ? class435.field6375.field5075 : arg2.field5075;
                    int var8 = var6 * 10 / 100 + var7 + 5;
                    int var9 = class435.field6375.field5093 - arg2.field5093;
                    if (var9 < 0) {
                        var9 = -var9;
                    }
                    if (var9 > var8) {
                        var5 = false;
                    }
                }
                String var10 = class61.field703 == class51.field564 ? class376.field5570.method2031(true, class377.field5585) : class149.field2103.method2031(true, class377.field5585);
                if (arg2.field5093 >= arg2.field5078) {
                    var4 = arg2.method2174(33, true) + (var5 ? class278.method1785(class435.field6375.field5093, true, arg2.field5093) : "<col=ffffff>") + " (" + var10 + arg2.field5093 + ")";
                } else {
                    var4 = arg2.method2174(-124, true) + (var5 ? class278.method1785(class435.field6375.field5093, true, arg2.field5093) : "<col=ffffff>") + " (" + var10 + arg2.field5093 + "+" + (arg2.field5078 - arg2.field5093) + ")";
                }
            } else {
                var4 = arg2.method2174(56, true) + " (" + class477.field7022.method2031(true, class377.field5585) + arg2.field5082 + ")";
            }
            if (class453.field6671) {
                if (!arg1 && (class223.field3273 & 0x8) != 0) {
                    class434.method2632(46, (byte) -55, false, (long) arg2.field1716, 0, class91.field1252 + " -> <col=ffffff>" + var4, true, class8.field93, 0, -1, class148.field2074);
                    class418.field6168++;
                }
            } else if (arg1) {
                class434.method2632(-1, (byte) -55, true, 0L, 0, "", false, "<col=cccccc>" + var4, 0, 0, -1);
            } else {
                for (int var11 = 7; var11 >= 0; var11--) {
                    if (class2.field5[var11] != null) {
                        short var12 = 0;
                        if (class68.field872 == class61.field703 && class2.field5[var11].equalsIgnoreCase(class502.field7457.method2031(true, class377.field5585))) {
                            if (arg2.field5093 > class435.field6375.field5093) {
                                var12 = 2000;
                            }
                            if (class435.field6375.field5072 != 0 && arg2.field5072 != 0) {
                                if (class435.field6375.field5072 == arg2.field5072) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class255.field3745[var11]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class436.field6381[var11] + var12);
                        int var14 = class278.field4082[var11] == -1 ? class396.field5816 : class278.field4082[var11];
                        class434.method2632(var13, (byte) -55, false, (long) arg2.field1716, 0, "<col=ffffff>" + var4, true, class2.field5[var11], 0, -1, var14);
                        class251.field3698++;
                    }
                }
            }
            if (!arg1) {
                for (class97 var15 = (class97) class498.field7394.method1018(74); var15 != null; var15 = (class97) class498.field7394.method1022((byte) -112)) {
                    if (var15.field1307 == 44) {
                        var15.field1303 = "<col=ffffff>" + var4;
                        return;
                    }
                }
            }
        } else if (class453.field6671 && (class223.field3273 & 0x10) != 0) {
            class153.field2170++;
            class434.method2632(8, (byte) -55, false, 0L, 0, class91.field1252 + " -> <col=ffffff>" + class364.field5059.method2031(true, class377.field5585), true, class8.field93, 0, -1, class148.field2074);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIII)V", line = 168)
    public static final void method1057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2005++;
        int var7 = class75.field1027;
        class413.field6142 = 0;
        int[] var8 = class334.field4634;
        for (int var9 = 0; var9 < class232.field3410 + var7; var9++) {
            class100 var32 = null;
            class121 var33;
            if (var7 > var9) {
                var33 = class384.field5647[var8[var9]];
            } else {
                var33 = class250.field3690[class173.field2454[var9 - var7]];
                var32 = ((class461) var33).field6790;
                if (var32.field1364 != null) {
                    var32 = var32.method848(false, class253.field3739);
                    if (var32 == null) {
                        continue;
                    }
                }
            }
            if (var33.field1701 >= 0 && (class50.field551 == var33.field1746 || class435.field6375.field6328 == var33.field6328)) {
                class448.method2715(arg0 >> 1, arg2 ^ 0xA, arg6 >> 1, arg4, arg1, var33.method967(0), var33);
                if (class522.field7676[0] >= 0) {
                    if (var33.field1699 != null && (var9 >= var7 || class445.field6585 == 0 || class445.field6585 == 3 || class445.field6585 == 1 && class138.method1038(117, ((class364) var33).field5074)) && class113.field1595 > class413.field6142) {
                        class113.field1587[class413.field6142] = class387.field5731.method1969(-1, var33.field1699) / 2;
                        class113.field1596[class413.field6142] = class522.field7676[0];
                        class113.field1588[class413.field6142] = class522.field7676[1];
                        class113.field1583[class413.field6142] = var33.field1772;
                        class113.field1590[class413.field6142] = var33.field1749;
                        class113.field1597[class413.field6142] = var33.field1764;
                        class113.field1592[class413.field6142] = var33.field1699;
                        class413.field6142++;
                    }
                    int var34 = class522.field7676[1] + arg3;
                    int var45;
                    if (var33.field1711 || var33.field1757 <= class263.field3867) {
                        var45 = var34 - Math.max(class387.field5731.field4493, class147.field2062[0].method126());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var7 > var9) {
                            class364 var37 = class384.field5647[var8[var9]];
                            var38 = var33.method969(-1).field7813;
                            if (var37.field5063) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field1347;
                            if (var38 == -1) {
                                var38 = var33.method969(arg2 ^ 0xFFFFFFF5).field7813;
                            }
                        }
                        class16[] var39 = class147.field2062;
                        if (var38 != -1) {
                            class16[] var40 = (class16[]) class405.field6027.method1115((long) var38, (byte) 58);
                            if (var40 == null) {
                                class218[] var41 = class218.method1497(class240.field3533, var38, 0);
                                if (var41 != null) {
                                    var40 = new class16[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class225.field3300.method389(var41[var42], true);
                                    }
                                    class405.field6027.method1107(arg2 - 9, (long) var38, var40);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var36 >= var39.length) {
                            var36 = 1;
                        }
                        class16 var43 = var39[0];
                        class16 var44 = var39[var36];
                        var45 = var34 - Math.max(class387.field5731.field4493, var43.method126());
                        int var46 = class522.field7676[0] + arg5 - (var43.method110() >> 1);
                        int var47 = var43.method110() * var33.field1702 / 255;
                        if (var33.field1702 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method111(var46, var45);
                        class225.field3300.method306(var46, var45, var46 + var47, var43.method126() + var45);
                        var44.method111(var46, var45);
                        class225.field3300.method380(arg5, arg3, arg0 + arg5, arg3 + arg6);
                    }
                    var45 -= 2;
                    if (!var33.field1711) {
                        if (class263.field3867 < var33.field1714) {
                            class16 var48 = class112.field1582[var33.field1684 ? 2 : 0];
                            class16 var49 = class112.field1582[var33.field1684 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if ((var33 instanceof class461)) {
                                var51 = var32.field1372;
                                if (var51 == -1) {
                                    var51 = var33.method969(-1).field7789;
                                }
                            } else {
                                var51 = var33.method969(-1).field7789;
                            }
                            if (var51 != -1) {
                                class16[] var52 = (class16[]) class87.field1180.method1115((long) var51, (byte) 58);
                                if (var52 == null) {
                                    class218[] var53 = class218.method1497(class240.field3533, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class16[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class225.field3300.method389(var53[var54], true);
                                        }
                                        class87.field1180.method1107(arg2 - 9, (long) var51, var52);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var48 = var52[var33.field1684 ? 2 : 0];
                                    var49 = var52[var33.field1684 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field1714 - class263.field3867;
                            int var58;
                            if (var33.field1734 < var55) {
                                int var56 = var55 - var33.field1734;
                                int var57 = var33.field1737 == 0 ? 0 : (var33.field1722 - var56) / var33.field1737 * var33.field1737;
                                var58 = var48.method110() * var57 / var33.field1722;
                            } else {
                                var58 = var48.method110();
                            }
                            int var59 = var48.method126();
                            var45 -= var59;
                            int var60 = class522.field7676[0] + (arg5 - (var48.method110() >> 1));
                            var48.method111(var60, var45);
                            class225.field3300.method306(var60, var45, var60 + var58, var45 + var59);
                            var49.method111(var60, var45);
                            var45 -= 2;
                            class225.field3300.method380(arg5, arg3, arg0 + arg5, arg3 - -arg6);
                        }
                        if (var9 < var7) {
                            class364 var61 = (class364) var33;
                            if (var61.field5086 != -1) {
                                var45 -= 25;
                                class224.field3293[var61.field5086].method111(class522.field7676[0] + arg5 - 12, var45);
                                var45 -= 2;
                            }
                            if (var61.field5096 != -1) {
                                var45 -= 25;
                                class84.field1153[var61.field5096].method111(class522.field7676[0] + arg5 - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field1348 >= 0 && var32.field1348 < class84.field1153.length) {
                            class16 var62 = class84.field1153[var32.field1348];
                            var45 -= 25;
                            var62.method111(class522.field7676[0] + arg5 - (var62.method110() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var33 instanceof class364)) {
                        int var63 = 0;
                        class452[] var64 = class133.field1922;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class452 var67 = var64[var65];
                            if (var67 != null && var67.field6652 == 1 && class173.field2454[var9 - var7] == var67.field6645) {
                                class16 var68 = class226.field3305[var67.field6646];
                                if (var68.method126() > var63) {
                                    var63 = var68.method126();
                                }
                                if ((class263.field3867 % 20) < 10) {
                                    var68.method111(arg5 + class522.field7676[0] - 12, var45 + -var68.method126());
                                }
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var69 = 0;
                        class452[] var70 = class133.field1922;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class452 var73 = var70[var71];
                            if (var73 != null && var73.field6652 == 10 && var8[var9] == var73.field6645) {
                                class16 var74 = class226.field3305[var73.field6646];
                                if (var69 < var74.method126()) {
                                    var69 = var74.method126();
                                }
                                var74.method111(class522.field7676[0] + arg5 - 12, var45 - var74.method126());
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    }
                    for (int var75 = 0; var75 < 4; var75++) {
                        if (class263.field3867 < var33.field1740[var75]) {
                            int var76 = var33.method967(arg2 ^ 0xA) / 2;
                            class448.method2715(arg0 >> 1, arg2 ^ 0xA, arg6 >> 1, arg4, arg1, var76, var33);
                            if (class522.field7676[0] > -1) {
                                if (var75 == 1) {
                                    class522.field7676[1] -= 20;
                                }
                                if (var75 == 2) {
                                    class522.field7676[1] -= 10;
                                    class522.field7676[0] -= 15;
                                }
                                if (var75 == 3) {
                                    class522.field7676[1] -= 10;
                                    class522.field7676[0] += 15;
                                }
                                class2.field17[var33.field1771[var75]].method111(arg5 + class522.field7676[0] - 12, class522.field7676[1] + arg3 + -12);
                                class122.field1792.method1956(class522.field7676[0] + arg5 - 1, -1, arg2 + -10, arg3 + class522.field7676[1] + 3, 0, Integer.toString(var33.field1704[var75]));
                            }
                        }
                    }
                }
            }
        }
        if (arg2 != 10) {
            return;
        }
        for (int var10 = 0; var10 < class454.field6677; var10++) {
            int var28 = class413.field6128[var10];
            class121 var29;
            if (var28 < 2048) {
                var29 = class384.field5647[var28];
            } else {
                var29 = class250.field3690[var28 - 2048];
            }
            int var30 = class244.field3594[var10];
            class121 var31;
            if (var30 >= 2048) {
                var31 = class250.field3690[var30 - 2048];
            } else {
                var31 = class384.field5647[var30];
            }
            method1058(false, arg1, arg3, arg5, var31, var29, --var29.field1756, arg0, arg6, arg4);
        }
        int var11 = class387.field5731.field4493 + class387.field5731.field4488 + 2;
        for (int var12 = 0; var12 < class413.field6142; var12++) {
            int var13 = class113.field1596[var12];
            int var14 = class113.field1588[var12];
            int var15 = class113.field1587[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if ((class113.field1588[var27] - var11) < (var14 + 2) && class113.field1588[var27] + 2 > var14 - var11 && class113.field1596[var27] + class113.field1587[var27] > var13 - var15 && (class113.field1596[var27] - class113.field1587[var27]) < (var13 + var15) && var14 > (class113.field1588[var27] - var11)) {
                        var14 = class113.field1588[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class113.field1588[var12] = var14;
            String var17 = class113.field1592[var12];
            if (class446.field6594 == 0) {
                int var18 = 16776960;
                if (class113.field1583[var12] < 6) {
                    var18 = class364.field5085[class113.field1583[var12]];
                }
                if (class113.field1583[var12] == 6) {
                    var18 = class50.field551 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class113.field1583[var12] == 7) {
                    var18 = (class50.field551 % 20) >= 10 ? 65535 : 255;
                }
                if (class113.field1583[var12] == 8) {
                    var18 = (class50.field551 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class113.field1583[var12] == 9) {
                    int var19 = 150 - class113.field1597[var12];
                    if (var19 < 50) {
                        var18 = (var19 * 1280) + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - ((var19 - 50) * 327680);
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (class113.field1583[var12] == 10) {
                    int var20 = 150 - class113.field1597[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - ((var20 - 50) * 327680);
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 * 5 + -500);
                    }
                }
                if (class113.field1583[var12] == 11) {
                    int var21 = 150 - class113.field1597[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = var21 * 327685 + 65280 - 16384250;
                    } else if (var21 < 150) {
                        var18 = 16777215 + 32768000 - (var21 * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class113.field1590[var12] == 0) {
                    class466.field6840.method1956(arg5 + var13, var22, 0, arg3 + var14, -16777216, var17);
                }
                if (class113.field1590[var12] == 1) {
                    class466.field6840.method1951(var22, var17, -58, arg3 + var14, arg5 + var13, class50.field551, -16777216);
                }
                if (class113.field1590[var12] == 2) {
                    class466.field6840.method1947(arg3 + var14, -16777216, arg5 + var13, var17, class50.field551, var22, arg2 ^ 0xFFFFFF88);
                }
                if (class113.field1590[var12] == 3) {
                    class466.field6840.method1964(-16777216, var22, arg3 + var14, var17, 124, arg5 + var13, class50.field551, 150 - class113.field1597[var12]);
                }
                if (class113.field1590[var12] == 4) {
                    int var23 = (150 - class113.field1597[var12]) * (class387.field5731.method1969(-1, var17) + 100) / 150;
                    class225.field3300.method306(arg5 + var13 - 50, arg3, arg5 - (-var13 - 50), arg3 - -arg6);
                    class466.field6840.method1958(-16777216, var22, var17, arg3 + var14, arg5 + 50 + var13 - var23, 0);
                    class225.field3300.method380(arg5, arg3, arg0 + arg5, arg3 + arg6);
                }
                if (class113.field1590[var12] == 5) {
                    int var24 = 150 - class113.field1597[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class387.field5731.field4493 + class387.field5731.field4488;
                    class225.field3300.method306(arg5, arg3 + var14 - var26 - 1, arg5 - -arg0, var14 + arg3 + 5);
                    class466.field6840.method1956(arg5 + var13, var22, 0, arg3 + var14 + var25, -16777216, var17);
                    class225.field3300.method380(arg5, arg3, arg0 + arg5, arg3 + arg6);
                }
            } else {
                class466.field6840.method1956(arg5 + var13, -256, 0, arg3 + var14, -16777216, var17);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(III)V", line = 751)
    public class142(int arg0, int arg1, int arg2) {
        this.field2007 = arg0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field2001++;
        }
        this.field2003 = arg1;
        this.field2006 = 0x1 << this.field2001;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZIIILr;Lr;IIII)V", line = 767)
    private static final void method1058(boolean arg0, int arg1, int arg2, int arg3, class121 arg4, class121 arg5, int arg6, int arg7, int arg8, int arg9) {
        field2008++;
        int var10 = arg4.method968((byte) 18);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class16 var12 = (class16) class265.field3912.method1115((long) var10, (byte) 58);
        if (var12 == null) {
            class218[] var13 = class218.method1497(class240.field3533, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class225.field3300.method389(var13[0], true);
            class265.field3912.method1107(1, (long) var10, var12);
        }
        class274.method1762(arg1, arg5.field6335, arg5.field6334, arg9, arg5.method963((byte) 127) * 64, arg7 >> 1, 0, 503, arg5.field6328, arg8 >> 1);
        int var14 = arg3 + class522.field7676[0] - 18;
        int var15 = arg6 / 4 * 18 + var14;
        int var16 = class522.field7676[1] + arg2 - 16 - 54;
        int var17 = arg6 % 4 * 18 + var16;
        var12.method111(var15, var17);
        if (arg4 == arg5) {
            class225.field3300.method370(var15 - 1, -256, 18, 8, 18, var17 - 1);
        }
        class255 var18 = class373.method2299(8);
        var18.field3740 = var15;
        if (arg0) {
            return;
        }
        var18.field3746 = var17;
        var18.field3744 = var15 + 16;
        var18.field3747 = arg4;
        var18.field3742 = var17 + 16;
        class156.field2211.method2948(83, var18);
    }

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "(II)I")
    public abstract int method430(int arg0, int arg1);

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "(IILba;)Lba;")
    public abstract class263 method431(int arg0, int arg1, class263 arg2);

    @OriginalMember(owner = "client!ta", name = "ca", descriptor = "()V")
    public abstract void method419();

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lba;IIIIZ)Z")
    public abstract boolean method428(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method422(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
    public abstract int method426(int arg0, int arg1);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lvp;[I)V")
    public abstract void method424(class124 arg0, int[] arg1);

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "(III)V")
    public abstract void method418(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method421(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
    public abstract void method420(int arg0, int arg1);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method429(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lba;IIIIZ)V")
    public abstract void method415(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "(Lba;IIIIZ)V")
    public abstract void method425(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
