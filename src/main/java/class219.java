import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class219 extends class338 {

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public int field2940;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public int field2929;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field2927 = 0;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public static int field2937 = -1;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)I", line = 6)
    public final int method1175(int arg0) {
        field2933++;
        return arg0 >= -69 ? 32 : (this.field2940 & 0x1D39C6) >> 18;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Z", line = 17)
    public final boolean method1176(int arg0, int arg1) {
        if (arg1 > -60) {
            this.method1183(64);
        }
        field2939++;
        return (this.field2940 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)Z", line = 34)
    public final boolean method1177(int arg0) {
        field2941++;
        if (arg0 != -28939) {
            this.method1180((byte) 98);
        }
        return (this.field2940 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lvm;B)V", line = 45)
    public static final void method1178(class322 arg0, byte arg1) {
        field2930++;
        if (class337.field4493 < 0 || class306.field4146 < 0 || class316.field4223 == 0 || class188.field2371 == 0) {
            return;
        }
        arg0.method1589(class260.field3562, class132.field1703, class316.field4223, class188.field2371);
        arg0.method1648(class323.field4314, class183.field2334, class316.field4223, class188.field2371);
        class247 var2 = arg0.method1586();
        var2.method750(class104.field1281, class34.field337, class295.field4001, class126.field1627, class40.field417, class309.field4180);
        arg0.method1611(var2);
        if (class171.field2155 == 0 && class272.field3682 != null) {
            int var3 = -1;
            int var4 = -1;
            int var5 = arg0.method1617();
            int var6 = (class337.field4493 - class260.field3562) * var5 / class316.field4223;
            int var7 = (class306.field4146 - class132.field1703) * var5 / class188.field2371;
            int var8 = arg0.method1621();
            int var9 = (class337.field4493 - class260.field3562) * var8 / class316.field4223;
            int var10 = (class306.field4146 - class132.field1703) * var8 / class188.field2371;
            int[] var11 = new int[] { var6, var7, var5 };
            var2.method739(var11);
            int[] var12 = new int[] { var9, var10, var8 };
            var2.method739(var12);
            float var13 = 0.0F;
            int var14 = var12[0] - var11[0];
            int var15 = var12[1] - var11[1];
            int var16 = var12[2] - var11[2];
            while (var13 < 1.0F) {
                int var17 = (int) ((float) var14 * var13 + (float) var11[0]);
                int var18 = var17 >> 7;
                int var19 = (int) ((float) var16 * var13 + (float) var11[2]);
                int var20 = var19 >> 7;
                if (var18 > 0 && var20 > 0 && var18 < class315.field4214 && class340.field4549 > var20) {
                    int var21 = class263.field3592;
                    if (var21 < 3 && (class282.field3872[1][var18][var20] & 0x2) != 0) {
                        var21++;
                    }
                    if ((float) class272.field3682[var21].method265(var17, var19) < (float) var15 * var13 + (float) var11[1]) {
                        var3 = class427.field6264.method857((byte) -106) * 64 + var17 - 64 >> 7;
                        var4 = var19 + (class427.field6264.method857((byte) -106) - 1) * 64 >> 7;
                        break;
                    }
                }
                var13 = (float) ((double) var13 + 0.01D);
            }
            if (var3 != -1 && var4 != -1) {
                if (class65.field682 && (class306.field4143 & 0x40) != 0) {
                    class194 var22 = class142.method769(arg1 ^ 0x1B, class106.field1297, class199.field2657);
                    if (var22 == null) {
                        class425.method2641(true);
                    } else {
                        class380.method2342(var3, " ->", (byte) -107, 0L, class383.field5467, class132.field1699, var4, 17);
                    }
                } else {
                    if (class62.field636 == 1) {
                        class380.method2342(var3, "", (byte) -115, 0L, -1, class260.field3548, var4, 23);
                    }
                    class380.method2342(var3, "", (byte) -124, 0L, -1, class264.field3610, var4, 33);
                    class411.field5941++;
                }
            }
        }
        class184 var23 = class171.field2154;
        for (class321 var24 = (class321) var23.method986((byte) -4); var24 != null; var24 = (class321) var23.method984((byte) 74)) {
            if (var24.method1850(109, arg0, class337.field4493, class306.field4146) && class263.field3592 == var24.field4291) {
                if (var24.field4289 instanceof class158) {
                    class158 var25 = (class158) var24.field4289;
                    int var26 = var25.method857((byte) -106);
                    if ((var26 & 0x1) == 0 && (var25.field152 & 0x7F) == 0 && (var25.field154 & 0x7F) == 0 || (var26 & 0x1) == 1 && (var25.field152 & 0x7F) == 64 && (var25.field154 & 0x7F) == 64) {
                        int var27 = var25.field152 + 64 - (var25.method857((byte) -106) * 64);
                        int var28 = var25.field154 - ((var25.method857((byte) -106) - 1) * 64);
                        for (int var29 = 0; var29 < class244.field3320; var29++) {
                            class91 var34 = class38.field397[class308.field4175[var29]];
                            if (var34 != null && class234.field3224 != var34.field6064 && var34.field6054) {
                                int var35 = var34.field152 + 64 - (var34.field1035.field4624 * 64);
                                int var36 = var34.field154 - (var34.field1035.field4624 - 1) * 64;
                                if (var27 <= var35 && var34.field1035.field4624 <= var25.method857((byte) -106) - (var35 - var27 >> 7) && var36 >= var28 && var34.field1035.field4624 <= var25.method857((byte) -106) - (var36 - var28 >> 7)) {
                                    class213.method1154(var34, (byte) 65);
                                    var34.field6064 = class234.field3224;
                                }
                            }
                        }
                        for (int var30 = 0; var30 < class293.field3991; var30++) {
                            class158 var31 = class85.field957[class345.field4629[var30]];
                            if (var31 != null && class234.field3224 != var31.field6064 && var25 != var31 && var31.field6054) {
                                int var32 = var31.field152 - (var31.method857((byte) -106) - 1) * 64;
                                int var33 = var31.field154 + (64 - (var31.method857((byte) -106) * 64));
                                if (var32 >= var27 && var31.method857((byte) -106) <= (var25.method857((byte) -106) - (var32 - var27 >> 7)) && var33 >= var28 && var31.method857((byte) -106) <= var25.method857((byte) -106) - (var33 - var28 >> 7)) {
                                    class428.method2646(var31, -30747);
                                    var31.field6064 = class234.field3224;
                                }
                            }
                        }
                    }
                    if (class234.field3224 == var25.field6064) {
                        continue;
                    }
                    class428.method2646(var25, arg1 ^ 0x7801);
                    var25.field6064 = class234.field3224;
                }
                if (var24.field4289 instanceof class91) {
                    class91 var37 = (class91) var24.field4289;
                    if (var37.field1035 != null) {
                        if ((var37.field1035.field4624 & 0x1) == 0 && (var37.field152 & 0x7F) == 0 && (var37.field154 & 0x7F) == 0 || (var37.field1035.field4624 & 0x1) == 1 && (var37.field152 & 0x7F) == 64 && (var37.field154 & 0x7F) == 64) {
                            int var38 = var37.field152 + 64 - (var37.field1035.field4624 * 64);
                            int var39 = var37.field154 - ((var37.field1035.field4624 - 1) * 64);
                            for (int var40 = 0; var40 < class244.field3320; var40++) {
                                class91 var45 = class38.field397[class308.field4175[var40]];
                                if (var45 != null && class234.field3224 != var45.field6064 && var37 != var45 && var45.field6054) {
                                    int var46 = var45.field152 + 64 - (var45.field1035.field4624 * 64);
                                    int var47 = var45.field154 - ((var45.field1035.field4624 - 1) * 64);
                                    if (var38 <= var46 && var45.field1035.field4624 <= var37.field1035.field4624 - (var46 - var38 >> 7) && var39 <= var47 && var45.field1035.field4624 <= (var37.field1035.field4624 - (var47 - var39 >> 7))) {
                                        class213.method1154(var45, (byte) 100);
                                        var45.field6064 = class234.field3224;
                                    }
                                }
                            }
                            for (int var41 = 0; var41 < class293.field3991; var41++) {
                                class158 var42 = class85.field957[class345.field4629[var41]];
                                if (var42 != null && class234.field3224 != var42.field6064 && var42.field6054) {
                                    int var43 = var42.field152 - (var42.method857((byte) -106) - 1) * 64;
                                    int var44 = var42.field154 + 64 - (var42.method857((byte) -106) * 64);
                                    if (var38 <= var43 && var42.method857((byte) -106) <= (var37.field1035.field4624 - (var43 - var38 >> 7)) && var39 <= var44 && var42.method857((byte) -106) <= var37.field1035.field4624 - (var44 - var39 >> 7)) {
                                        class428.method2646(var42, -30747);
                                        var42.field6064 = class234.field3224;
                                    }
                                }
                            }
                        }
                        if (class234.field3224 == var37.field6064) {
                            continue;
                        }
                        class213.method1154(var37, (byte) 127);
                        var37.field6064 = class234.field3224;
                    }
                }
                if (var24.field4289 instanceof class371) {
                    class268 var48 = (class268) class419.field6102.method308((long) (var24.field4294 | var24.field4288 << 14 | var24.field4291 << 28), (byte) -107);
                    if (var48 != null) {
                        for (class306 var49 = (class306) var48.field3647.method821((byte) 123); var49 != null; var49 = (class306) var48.field3647.method816((byte) 101)) {
                            class123 var50 = class65.method368(var49.field4144, -115);
                            if (class171.field2155 == 1) {
                                class380.method2342(var24.field4294, class114.field1425 + " -> <col=ff9040>" + var50.field1519, (byte) -99, (long) var49.field4144, class418.field6013, class12.field113, var24.field4288, 29);
                                class252.field3449++;
                            } else if (class65.field682) {
                                class193 var51 = class291.field3960 == -1 ? null : class110.method580(class291.field3960, true);
                                if ((class306.field4143 & 0x1) != 0 && (var51 == null || var50.method663(var51.field2441, class291.field3960, arg1 + 29) != var51.field2441)) {
                                    class58.field590++;
                                    class380.method2342(var24.field4294, class77.field874 + " -> <col=ff9040>" + var50.field1519, (byte) -106, (long) var49.field4144, class383.field5467, class132.field1699, var24.field4288, 60);
                                }
                            } else {
                                String[] var52 = var50.field1551;
                                for (int var53 = 4; var53 >= 0; var53--) {
                                    if (var52 != null && var52[var53] != null) {
                                        byte var54 = 0;
                                        int var55 = class110.field1358;
                                        if (var53 == 0) {
                                            var54 = 28;
                                        }
                                        if (var53 == 1) {
                                            var54 = 34;
                                        }
                                        if (var53 == 2) {
                                            var54 = 39;
                                        }
                                        if (var53 == 3) {
                                            var54 = 6;
                                        }
                                        if (var53 == 4) {
                                            var54 = 57;
                                        }
                                        if (var50.field1568 == var53) {
                                            var55 = var50.field1549;
                                        }
                                        if (var50.field1544 == var53) {
                                            var55 = var50.field1518;
                                        }
                                        class380.method2342(var24.field4294, "<col=ff9040>" + var50.field1519, (byte) -109, (long) var49.field4144, var55, var52[var53], var24.field4288, var54);
                                        class435.field6355++;
                                    }
                                }
                                class380.method2342(var24.field4294, "<col=ff9040>" + var50.field1519, (byte) -128, (long) var49.field4144, class356.field5023, class434.field6349, var24.field4288, 1003);
                                class118.field1468++;
                            }
                        }
                    }
                }
                if (var24.field4289 instanceof class285) {
                    class285 var56 = (class285) var24.field4289;
                    class225 var57 = class281.method1655((byte) -28, var56.method356(10397));
                    if (var57.field3061 != null) {
                        var57 = var57.method1219(116);
                    }
                    if (var57 != null) {
                        if (class171.field2155 == 1) {
                            class438.field6403++;
                            class380.method2342(var24.field4294, class114.field1425 + " -> <col=00ffff>" + var57.field3024, (byte) -98, class254.method1434(var24.field4294, var24.field4288, (byte) 126, var56), class418.field6013, class12.field113, var24.field4288, 8);
                        } else if (class65.field682) {
                            class193 var62 = class291.field3960 == -1 ? null : class110.method580(class291.field3960, true);
                            if ((class306.field4143 & 0x4) != 0 && (var62 == null || var57.method1211((byte) -123, var62.field2441, class291.field3960) != var62.field2441)) {
                                class380.method2342(var24.field4294, class77.field874 + " -> <col=00ffff>" + var57.field3024, (byte) -104, class254.method1434(var24.field4294, var24.field4288, (byte) 127, var56), class383.field5467, class132.field1699, var24.field4288, 7);
                                class169.field2132++;
                            }
                        } else {
                            String[] var58 = var57.field3048;
                            if (var58 != null) {
                                for (int var59 = 4; var59 >= 0; var59--) {
                                    if (var58[var59] != null) {
                                        short var60 = 0;
                                        if (var59 == 0) {
                                            var60 = 2;
                                        }
                                        int var61 = class110.field1358;
                                        if (var59 == 1) {
                                            var60 = 58;
                                        }
                                        if (var59 == 2) {
                                            var60 = 38;
                                        }
                                        if (var59 == 3) {
                                            var60 = 9;
                                        }
                                        if (var59 == 4) {
                                            var60 = 1002;
                                        }
                                        if (var57.field2998 == var59) {
                                            var61 = var57.field3009;
                                        }
                                        if (var57.field2992 == var59) {
                                            var61 = var57.field3007;
                                        }
                                        class380.method2342(var24.field4294, "<col=00ffff>" + var57.field3024, (byte) -99, class254.method1434(var24.field4294, var24.field4288, (byte) 127, var56), var61, var58[var59], var24.field4288, var60);
                                        class385.field5489++;
                                    }
                                }
                            }
                            class14.field132++;
                            class380.method2342(var24.field4294, "<col=00ffff>" + var57.field3024, (byte) -92, (long) var57.field3051, class356.field5023, class434.field6349, var24.field4288, 1010);
                        }
                    }
                }
            }
        }
        if (arg1 != -28) {
            method1178((class322) null, (byte) 67);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)Z", line = 497)
    public final boolean method1179(byte arg0) {
        if (arg0 < 54) {
            return true;
        } else {
            field2932++;
            return (this.field2940 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)I", line = 512)
    public final int method1180(byte arg0) {
        field2938++;
        if (arg0 != 88) {
            this.field2929 = -29;
        }
        return class83.method454(this.field2940, -8146);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)Z", line = 525)
    public final boolean method1181(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field2931++;
            return (this.field2940 & 0x7E91F2) >> 22 != 0;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)Z", line = 538)
    public final boolean method1182(byte arg0) {
        int var2 = -47 / ((-arg0 - 64) / 59);
        field2926++;
        return ((this.field2940 & 0x1726B2C3) >> 28) != 0;
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)Z", line = 548)
    public final boolean method1183(int arg0) {
        if (arg0 != -6780) {
            field2927 = 106;
        }
        field2928++;
        return (this.field2940 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)I", line = 560)
    public static final int method1184(byte arg0) {
        field2935++;
        int var1 = -118 % ((-arg0 - 26) / 34);
        if (class171.field2153 == null) {
            return class155.field1970 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(II)V", line = 576)
    public class219(int arg0, int arg1) {
        this.field2940 = arg0;
        this.field2929 = arg1;
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(B)Z", line = 585)
    public final boolean method1185(byte arg0) {
        field2936++;
        if (arg0 <= 89) {
            return true;
        } else {
            return (this.field2940 >> 21 & 0x1) != 0;
        }
    }
}
