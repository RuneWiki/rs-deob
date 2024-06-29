import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class142 {

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lhu;")
    public static class76 field2052;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Lhg;")
    public static class450 field2055;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field2056;

    static {
        new class206(" days.", " Tage.", " jours.", " dias.");
        new class206((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
        field2054 = 0;
        field2052 = new class76(260);
        field2055 = new class450();
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([I[ILoe;I[I)V", line = 4)
    public static final void method860(int[] arg0, int[] arg1, class121 arg2, int arg3, int[] arg4) {
        for (int var5 = arg3; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg1[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var7 != 0 && arg2.field1127.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field1127[var9] = null;
                    } else {
                        class181 var10 = class395.field5477.method266(16107, var6);
                        int var11 = var10.field2470;
                        class298 var12 = arg2.field1127[var9];
                        if (var12 != null) {
                            if (var12.field3987 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field1127[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3989 = 0;
                                    var12.field3988 = 0;
                                    var12.field3992 = var8;
                                    var12.field3991 = 0;
                                    var12.field3990 = 1;
                                    class402.method2437(var10, false, arg2.field6502, 29, arg2.field6501, arg2.field6507, 0);
                                } else if (var11 == 2) {
                                    var12.field3989 = 0;
                                }
                            } else if (var10.field2471 >= class395.field5477.method266(16107, var12.field3987).field2471) {
                                var12 = arg2.field1127[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class298 var13 = arg2.field1127[var9] = new class298();
                            var13.field3988 = 0;
                            var13.field3990 = 1;
                            var13.field3991 = 0;
                            var13.field3987 = var6;
                            var13.field3989 = 0;
                            var13.field3992 = var8;
                            class402.method2437(var10, false, arg2.field6502, -111, arg2.field6501, arg2.field6507, 0);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field2053++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lnk;Lwm;IIB)V", line = 105)
    public static final void method861(class464 arg0, class364 arg1, int arg2, int arg3, byte arg4) {
        field2051++;
        if (arg4 < 28) {
            return;
        }
        class152 var5 = arg0.method2738((byte) 122, arg1);
        if (var5 == null) {
            return;
        }
        arg1.method1981(arg3, arg2, arg3 + arg0.field6308, arg0.field6340 + arg2);
        if (class455.field6170 == 2 || class455.field6170 == 5 || class45.field621 == null) {
            arg1.method2029(-16777216, var5, arg3, arg2);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class56.field772 == 4) {
            var7 = class23.field306;
            var6 = 4096;
            var9 = (int) (-class270.field3610) & 0x3FFF;
            var8 = class186.field2560;
        } else {
            var6 = 4096 - (class429.field5795 * 16);
            var7 = class233.field3103.field6507;
            var8 = class233.field3103.field6501;
            var9 = (int) (-class270.field3610) + class150.field2119 & 0x3FFF;
        }
        int var10 = var8 / 32 + 48 - ((class295.field3947 - 104) * 2);
        int var11 = (class39.field567 * 4) + 48 - ((class39.field567 - 104) * 2) - (var7 / 32);
        class45.field621.method842((float) arg0.field6308 / 2.0F + (float) arg3, (float) arg0.field6340 / 2.0F + (float) arg2, (float) var10, (float) var11, var6, var9 << 2, var5, arg3, arg2);
        for (class37 var12 = (class37) class458.field6213.method652((byte) 37); var12 != null; var12 = (class37) class458.field6213.method653(106)) {
            int var52 = var12.field555;
            int var53 = (class32.field485.field6167[var52] >> 14 & 0x3FFF) - class162.field2260;
            int var54 = (class32.field485.field6167[var52] & 0x3FFF) - class266.field3511;
            int var55 = var53 * 4 + 2 - (var8 / 32);
            int var56 = var54 * 4 + 2 - (var7 / 32);
            class168.method992(arg3, arg0, class32.field485.field6169[var52], arg1, var56, 0, var5, var55, arg2);
        }
        for (int var13 = 0; var13 < class364.field4993; var13++) {
            int var49 = class469.field6482[var13] * 4 + 2 - (var8 / 32);
            int var50 = class51.field677[var13] * 4 + 2 - (var7 / 32);
            class88 var51 = class1.field23.method935(class374.field5153[var13], (byte) 77);
            if (var51.field1269 != null) {
                var51 = var51.method574(-125, class38.field562);
                if (var51 == null || var51.field1220 == -1) {
                    continue;
                }
            }
            class168.method992(arg3, arg0, var51.field1220, arg1, var50, 0, var5, var49, arg2);
        }
        for (class223 var14 = (class223) class33.field505.method1518((byte) -109); var14 != null; var14 = (class223) class33.field505.method1517(-30942)) {
            int var46 = (int) (var14.field6047 >> 28 & 0x3L);
            if (class343.field4588 == var46) {
                int var47 = (int) (var14.field6047 & 0x3FFFL) * 4 + 2 - (var8 / 32);
                int var48 = ((int) (var14.field6047 >> 14 & 0x3FFFL) * 4 - var7 / 32) + 2;
                class182.method1070(var5, var47, arg3, var48, class62.field823[0], arg2, arg0, (byte) -118);
            }
        }
        for (int var15 = 0; var15 < class202.field2734; var15++) {
            class121 var42 = class221.field2941[class412.field5638[var15]];
            if (var42 != null && var42.method751(0) && class233.field3103.field6502 == var42.field6502) {
                class429 var43 = var42.field1780;
                if (var43 != null && var43.field5824 != null) {
                    var43 = var43.method2531(class38.field562, 121);
                }
                if (var43 != null && var43.field5851 && var43.field5822) {
                    int var44 = var42.field6501 / 32 - var8 / 32;
                    int var45 = var42.field6507 / 32 - var7 / 32;
                    if (var43.field5847 == -1) {
                        class182.method1070(var5, var44, arg3, var45, class62.field823[1], arg2, arg0, (byte) -88);
                    } else {
                        class168.method992(arg3, arg0, var43.field5847, arg1, var45, 0, var5, var44, arg2);
                    }
                }
            }
        }
        int var16 = class239.field3187;
        int[] var17 = class265.field3502;
        for (int var18 = 0; var18 < var16; var18++) {
            class487 var34 = class413.field5644[var17[var18]];
            if (var34 != null && var34.method2828(0) && class233.field3103 != var34 && class233.field3103.field6502 == var34.field6502) {
                int var35 = var34.field6501 / 32 - (var8 / 32);
                int var36 = var34.field6507 / 32 - var7 / 32;
                boolean var37 = false;
                for (int var38 = 0; var38 < class90.field1317; var38++) {
                    if (var34.field6742.equals(class233.field3106[var38]) && class155.field2163[var38] != 0) {
                        var37 = true;
                        break;
                    }
                }
                boolean var39 = false;
                for (int var40 = 0; var40 < class312.field4109; var40++) {
                    if (var34.field6742.equals(class68.field928[var40].field5560)) {
                        var39 = true;
                        break;
                    }
                }
                boolean var41 = false;
                if (class233.field3103.field6773 != 0 && var34.field6773 != 0 && class233.field3103.field6773 == var34.field6773) {
                    var41 = true;
                }
                if (var37) {
                    class182.method1070(var5, var35, arg3, var36, class62.field823[3], arg2, arg0, (byte) 31);
                } else if (var39) {
                    class182.method1070(var5, var35, arg3, var36, class62.field823[5], arg2, arg0, (byte) -124);
                } else if (var41) {
                    class182.method1070(var5, var35, arg3, var36, class62.field823[4], arg2, arg0, (byte) -115);
                } else {
                    class182.method1070(var5, var35, arg3, var36, class62.field823[2], arg2, arg0, (byte) 84);
                }
            }
        }
        class409[] var19 = class88.field1295;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class409 var23 = var19[var20];
            if (var23 != null && var23.field5598 != 0 && class70.field968 % 20 < 10) {
                if (var23.field5598 == 1 && var23.field5597 >= 0 && var23.field5597 < class221.field2941.length) {
                    class121 var24 = class221.field2941[var23.field5597];
                    if (var24 != null) {
                        int var25 = var24.field6501 / 32 - (var8 / 32);
                        int var26 = var24.field6507 / 32 - (var7 / 32);
                        class228.method1276(var23.field5611, 360000, var25, var26, arg2, arg0, var5, arg3, (byte) 69);
                    }
                }
                if (var23.field5598 == 2) {
                    int var27 = (var23.field5595 - class162.field2260) * 4 + 2 - var8 / 32;
                    int var28 = (var23.field5612 - class266.field3511) * 4 + 2 - (var7 / 32);
                    int var29 = var23.field5592 * 4;
                    int var30 = var29 * var29;
                    class228.method1276(var23.field5611, var30, var27, var28, arg2, arg0, var5, arg3, (byte) 93);
                }
                if (var23.field5598 == 10 && var23.field5597 >= 0 && class413.field5644.length > var23.field5597) {
                    class487 var31 = class413.field5644[var23.field5597];
                    if (var31 != null) {
                        int var32 = var31.field6501 / 32 - (var8 / 32);
                        int var33 = var31.field6507 / 32 - (var7 / 32);
                        class228.method1276(var23.field5611, 360000, var32, var33, arg2, arg0, var5, arg3, (byte) 98);
                    }
                }
            }
        }
        if (class56.field772 == 4) {
            return;
        }
        if (class345.field4761 != 0) {
            int var21 = class345.field4761 * 4 + class233.field3103.method545(false) * 2 + 2 - (var8 / 32) - 2;
            int var22 = class124.field1817 * 4 + (class233.field3103.method545(false) * 2) + 2 - (var7 / 32) - 2;
            class182.method1070(var5, var21, arg3, var22, class103.field1474[class187.field2565 ? 1 : 0], arg2, arg0, (byte) 91);
        }
        arg1.method2222(3, arg0.field6308 / 2 + arg3 - 1, arg0.field6340 / 2 + arg2 - 1, -1, 123, 3);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 405)
    public static void method862(int arg0) {
        int var1 = -108 % ((arg0 + 63) / 54);
        field2052 = null;
        field2055 = null;
    }
}
