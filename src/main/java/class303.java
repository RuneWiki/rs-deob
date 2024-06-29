import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class303 {

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Z")
    public static boolean field4424 = true;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field4427 = 0;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "[Z")
    public static boolean[] field4426;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static final void method2072(byte arg0) {
        field4420++;
        if (arg0 >= -21) {
            method2073(-38, (class90) null);
        }
        class122.field1928.method754(class157.field2383, class322.field4645 ? class257.field3711 + 256 : -1);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILja;)V")
    public static final void method2073(int arg0, class90 arg1) {
        field4423++;
        if (class129.field2111 < 0 || class291.field4327 < 0 || class308.field4495 == 0 || class392.field5732 == 0) {
            return;
        }
        arg1.method704(class418.field6066, class383.field5490, class308.field4495, class392.field5732);
        if (arg0 != 20) {
            field4427 = -20;
        }
        arg1.method752(class221.field3300, class276.field4159, class308.field4495, class392.field5732);
        class202 var2 = arg1.method748();
        var2.method1537(class382.field5466, class11.field130, class60.field972, class322.field4647, class358.field5110, class162.field2452);
        arg1.method673(var2);
        if (class47.field765 == 0 && class311.field4527 != null) {
            int var3 = -1;
            int var4 = -1;
            int var5 = arg1.method744();
            int var6 = (class129.field2111 - class418.field6066) * var5 / class308.field4495;
            int var7 = (class291.field4327 - class383.field5490) * var5 / class392.field5732;
            int var8 = arg1.method702();
            int var9 = (class129.field2111 - class418.field6066) * var8 / class308.field4495;
            int var10 = (class291.field4327 - class383.field5490) * var8 / class392.field5732;
            int[] var11 = new int[] { var6, var7, var5 };
            var2.method1539(var11);
            int[] var12 = new int[] { var9, var10, var8 };
            var2.method1539(var12);
            float var13 = 0.0F;
            int var14 = var12[0] - var11[0];
            int var15 = var12[1] - var11[1];
            int var16 = var12[2] - var11[2];
            while (var13 < 1.0F) {
                int var17 = (int) ((float) var14 * var13 + (float) var11[0]);
                int var18 = var17 >> 7;
                int var19 = (int) ((float) var16 * var13 + (float) var11[2]);
                int var20 = var19 >> 7;
                if (var18 > 0 && var20 > 0 && class183.field2703 > var18 && class66.field1056 > var20) {
                    int var21 = class367.field5213;
                    if (var21 < 3 && (class278.field4176[1][var18][var20] & 0x2) != 0) {
                        var21++;
                    }
                    if ((float) class311.field4527[var21].method809(var17, var19) < (float) var15 * var13 + (float) var11[1]) {
                        var3 = var17 + (class86.field1394.method1070((byte) -50) - 1) * 64 >> 7;
                        var4 = (class86.field1394.method1070((byte) -50) - 1) * 64 + var19 >> 7;
                        break;
                    }
                }
                var13 = (float) ((double) var13 + 0.01D);
            }
            if (var3 != -1 && var4 != -1) {
                if (class291.field4332 && (class320.field4637 & 0x40) != 0) {
                    class258 var22 = class102.method849((byte) -105, class46.field751, class242.field3536);
                    if (var22 == null) {
                        class282.method2000(14);
                    } else {
                        class26.method217(var3, class171.field2549, 18, var4, class72.field1207, arg0 + 12134, " ->", 0L);
                    }
                } else {
                    if (class336.field4809 == 1) {
                        class26.method217(var3, class72.field1210, 39, var4, -1, arg0 ^ 0x2F6E, "", 0L);
                    }
                    class26.method217(var3, class117.field1839, 15, var4, -1, 12154, "", 0L);
                    class21.field319++;
                }
            }
        }
        class391 var23 = class58.field937;
        for (class69 var24 = (class69) var23.method2496(95); var24 != null; var24 = (class69) var23.method2487(arg0 - 20)) {
            if (var24.method516(class129.field2111, class291.field4327, 61, arg1) && class367.field5213 == var24.field1129) {
                if (var24.field1125 instanceof class127) {
                    class127 var25 = (class127) var24.field1125;
                    int var26 = var25.method1070((byte) -50);
                    if ((var26 & 0x1) == 0 && (var25.field6520 & 0x7F) == 0 && (var25.field6519 & 0x7F) == 0 || (var26 & 0x1) == 1 && (var25.field6520 & 0x7F) == 64 && (var25.field6519 & 0x7F) == 64) {
                        int var27 = var25.field6520 - (var25.method1070((byte) -50) - 1) * 64;
                        int var28 = var25.field6519 - (var25.method1070((byte) -50) * 64 - 64);
                        for (int var29 = 0; var29 < class156.field2376; var29++) {
                            class98 var34 = class447.field6512[class416.field6027[var29]];
                            if (var34 != null && class267.field4002 != var34.field5688 && var34.field5663) {
                                int var35 = var34.field6520 - ((var34.field1545.field174 - 1) * 64);
                                int var36 = var34.field6519 - (var34.field1545.field174 - 1) * 64;
                                if (var35 >= var27 && var34.field1545.field174 <= (var25.method1070((byte) -50) - (var35 - var27 >> 7)) && var36 >= var28 && var34.field1545.field174 <= var25.method1070((byte) -50) - (var36 - var28 >> 7)) {
                                    class106.method940(var34, -61);
                                    var34.field5688 = class267.field4002;
                                }
                            }
                        }
                        for (int var30 = 0; var30 < class21.field317; var30++) {
                            class127 var31 = class367.field5225[class75.field1290[var30]];
                            if (var31 != null && class267.field4002 != var31.field5688 && var25 != var31 && var31.field5663) {
                                int var32 = var31.field6520 - ((var31.method1070((byte) -50) - 1) * 64);
                                int var33 = var31.field6519 - ((var31.method1070((byte) -50) - 1) * 64);
                                if (var32 >= var27 && var31.method1070((byte) -50) <= var25.method1070((byte) -50) - (var32 - var27 >> 7) && var33 >= var28 && var31.method1070((byte) -50) <= var25.method1070((byte) -50) - (var33 - var28 >> 7)) {
                                    class119.method1003(0, var31);
                                    var31.field5688 = class267.field4002;
                                }
                            }
                        }
                    }
                    if (class267.field4002 == var25.field5688) {
                        continue;
                    }
                    class119.method1003(0, var25);
                    var25.field5688 = class267.field4002;
                }
                if (var24.field1125 instanceof class98) {
                    class98 var37 = (class98) var24.field1125;
                    if (var37.field1545 != null) {
                        if ((var37.field1545.field174 & 0x1) == 0 && (var37.field6520 & 0x7F) == 0 && (var37.field6519 & 0x7F) == 0 || (var37.field1545.field174 & 0x1) == 1 && (var37.field6520 & 0x7F) == 64 && (var37.field6519 & 0x7F) == 64) {
                            int var38 = var37.field6520 + 64 - var37.field1545.field174 * 64;
                            int var39 = var37.field6519 + 64 - (var37.field1545.field174 * 64);
                            for (int var40 = 0; var40 < class156.field2376; var40++) {
                                class98 var45 = class447.field6512[class416.field6027[var40]];
                                if (var45 != null && class267.field4002 != var45.field5688 && var37 != var45 && var45.field5663) {
                                    int var46 = 64 - (var45.field1545.field174 * 64 - var45.field6520);
                                    int var47 = var45.field6519 - ((var45.field1545.field174 - 1) * 64);
                                    if (var46 >= var38 && var37.field1545.field174 - (var46 - var38 >> 7) >= var45.field1545.field174 && var47 >= var39 && var45.field1545.field174 <= var37.field1545.field174 - (var47 - var39 >> 7)) {
                                        class106.method940(var45, -124);
                                        var45.field5688 = class267.field4002;
                                    }
                                }
                            }
                            for (int var41 = 0; var41 < class21.field317; var41++) {
                                class127 var42 = class367.field5225[class75.field1290[var41]];
                                if (var42 != null && class267.field4002 != var42.field5688 && var42.field5663) {
                                    int var43 = var42.field6520 + 64 - (var42.method1070((byte) -50) * 64);
                                    int var44 = var42.field6519 + 64 - (var42.method1070((byte) -50) * 64);
                                    if (var38 <= var43 && var42.method1070((byte) -50) <= (var37.field1545.field174 - (var43 - var38 >> 7)) && var44 >= var39 && var42.method1070((byte) -50) <= (var37.field1545.field174 - (var44 - var39 >> 7))) {
                                        class119.method1003(0, var42);
                                        var42.field5688 = class267.field4002;
                                    }
                                }
                            }
                        }
                        if (class267.field4002 == var37.field5688) {
                            continue;
                        }
                        class106.method940(var37, -69);
                        var37.field5688 = class267.field4002;
                    }
                }
                if (var24.field1125 instanceof class231) {
                    class110 var48 = (class110) class186.field2728.method1219((long) (var24.field1126 << 14 | var24.field1129 << 28 | var24.field1132), -119);
                    if (var48 != null) {
                        for (class89 var49 = (class89) var48.field1799.method153(5346); var49 != null; var49 = (class89) var48.field1799.method156((byte) 31)) {
                            class124 var50 = class206.method1561(-85, var49.field1416);
                            if (class47.field765 == 1) {
                                class129.field2109++;
                                class26.method217(var24.field1132, class19.field267, 44, var24.field1126, class119.field1867, 12154, class85.field1377 + " -> <col=ff9040>" + var50.field1999, (long) var49.field1416);
                            } else if (class291.field4332) {
                                class413 var55 = class209.field3041 == -1 ? null : class392.method2497(class209.field3041, 0);
                                if ((class320.field4637 & 0x1) != 0 && (var55 == null || var50.method1049(class209.field3041, var55.field5993, false) != var55.field5993)) {
                                    class26.method217(var24.field1132, class171.field2549, 32, var24.field1126, class72.field1207, 12154, class79.field1339 + " -> <col=ff9040>" + var50.field1999, (long) var49.field1416);
                                    class66.field1078++;
                                }
                            } else {
                                String[] var51 = var50.field2024;
                                for (int var52 = 4; var52 >= 0; var52--) {
                                    if (var51 != null && var51[var52] != null) {
                                        byte var53 = 0;
                                        int var54 = class361.field5151;
                                        if (var52 == 0) {
                                            var53 = 49;
                                        }
                                        if (var52 == 1) {
                                            var53 = 1;
                                        }
                                        if (var52 == 2) {
                                            var53 = 26;
                                        }
                                        if (var52 == 3) {
                                            var53 = 30;
                                        }
                                        if (var50.field1983 == var52) {
                                            var54 = var50.field2000;
                                        }
                                        if (var52 == 4) {
                                            var53 = 4;
                                        }
                                        if (var50.field2003 == var52) {
                                            var54 = var50.field2013;
                                        }
                                        class26.method217(var24.field1132, var51[var52], var53, var24.field1126, var54, 12154, "<col=ff9040>" + var50.field1999, (long) var49.field1416);
                                        class342.field4847++;
                                    }
                                }
                                class27.field409++;
                                class26.method217(var24.field1132, class183.field2696, 1002, var24.field1126, class64.field1038, arg0 + 12134, "<col=ff9040>" + var50.field1999, (long) var49.field1416);
                            }
                        }
                    }
                }
                if (var24.field1125 instanceof class395) {
                    class395 var56 = (class395) var24.field1125;
                    class45 var57 = class451.method2812(111, var56.method1013(false));
                    if (var57.field681 != null) {
                        var57 = var57.method369(-52);
                    }
                    if (var57 != null) {
                        if (class47.field765 == 1) {
                            class26.method217(var24.field1132, class19.field267, 41, var24.field1126, class119.field1867, 12154, class85.field1377 + " -> <col=00ffff>" + var57.field676, class136.method1117(var24.field1132, var56, false, var24.field1126));
                            class310.field4520++;
                        } else if (class291.field4332) {
                            class413 var62 = class209.field3041 == -1 ? null : class392.method2497(class209.field3041, 0);
                            if ((class320.field4637 & 0x4) != 0 && (var62 == null || var57.method363(class209.field3041, var62.field5993, (byte) -106) != var62.field5993)) {
                                class26.method217(var24.field1132, class171.field2549, 17, var24.field1126, class72.field1207, 12154, class79.field1339 + " -> <col=00ffff>" + var57.field676, class136.method1117(var24.field1132, var56, false, var24.field1126));
                                class392.field5730++;
                            }
                        } else {
                            String[] var58 = var57.field663;
                            if (var58 != null) {
                                for (int var59 = 4; var59 >= 0; var59--) {
                                    if (var58[var59] != null) {
                                        short var60 = 0;
                                        if (var59 == 0) {
                                            var60 = 58;
                                        }
                                        int var61 = class361.field5151;
                                        if (var59 == 1) {
                                            var60 = 47;
                                        }
                                        if (var59 == 2) {
                                            var60 = 13;
                                        }
                                        if (var59 == 3) {
                                            var60 = 20;
                                        }
                                        if (var57.field666 == var59) {
                                            var61 = var57.field672;
                                        }
                                        if (var59 == 4) {
                                            var60 = 1003;
                                        }
                                        if (var57.field670 == var59) {
                                            var61 = var57.field713;
                                        }
                                        class26.method217(var24.field1132, var58[var59], var60, var24.field1126, var61, 12154, "<col=00ffff>" + var57.field676, class136.method1117(var24.field1132, var56, false, var24.field1126));
                                        class209.field3043++;
                                    }
                                }
                            }
                            class364.field5181++;
                            class26.method217(var24.field1132, class183.field2696, 1004, var24.field1126, class64.field1038, 12154, "<col=00ffff>" + var57.field676, (long) var57.field733);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method2074(int arg0) {
        if (arg0 < -73) {
            field4426 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
    public static final void method2075(boolean arg0) {
        field4419++;
        class18 var1 = class105.field1744;
        synchronized (class105.field1744) {
            class105.field1744.method112(0);
            if (!arg0) {
                field4421 = 24;
            }
        }
        class18 var2 = class398.field5858;
        synchronized (class398.field5858) {
            class398.field5858.method112(0);
        }
        class18 var3 = class413.field5992;
        synchronized (class413.field5992) {
            class413.field5992.method112(0);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([BZ)Leq;")
    public static final class140 method2076(byte[] arg0, boolean arg1) {
        field4428++;
        class140 var2 = new class140();
        class37 var3 = new class37(arg0);
        var3.field565 = var3.field578.length - 2;
        int var4 = var3.method320((byte) -87);
        int var5 = var3.field578.length - var4 - 12 - 2;
        var3.field565 = var5;
        int var6 = var3.method278(-123);
        var2.field2224 = var3.method320((byte) -87);
        var2.field2222 = var3.method320((byte) -87);
        var2.field2228 = var3.method320((byte) -87);
        var2.field2213 = var3.method320((byte) -87);
        int var7 = var3.method271((byte) 125);
        if (var7 > 0) {
            var2.field2225 = new class156[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method320((byte) -87);
                class156 var10 = new class156(class202.method1526(var9, -2092404400));
                var2.field2225[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method278(78);
                    int var12 = var3.method278(60);
                    var10.method1217(1, (long) var11, new class9(var12));
                }
            }
        }
        var3.field565 = 0;
        var2.field2220 = var3.method274(-1);
        var2.field2221 = new int[var6];
        if (!arg1) {
            return null;
        }
        var2.field2212 = new int[var6];
        var2.field2227 = new String[var6];
        int var13 = 0;
        while (var5 > var3.field565) {
            int var14 = var3.method320((byte) -87);
            if (var14 == 3) {
                var2.field2227[var13] = var3.method322((byte) -34).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field2212[var13] = var3.method271((byte) 118);
            } else {
                var2.field2212[var13] = var3.method278(-128);
            }
            var2.field2221[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2077(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4429++;
        if (class51.method407(arg2, 4)) {
            class91.method771(-1, arg8, arg5, arg3, class45.field710[arg2], arg0, arg1, arg6, arg7, false);
            if (arg4 != 17968) {
                method2073(42, (class90) null);
            }
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class254.field3685[var9] = true;
            }
        } else {
            class254.field3685[arg8] = true;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public static final void method2078(int arg0) {
        field4422++;
        if (!class393.field5747) {
            return;
        }
        class393.field5747 = false;
        class339.field4837 = null;
        if (arg0 != 1) {
            method2076((byte[]) null, false);
        }
        class236.field3405 = null;
    }
}
