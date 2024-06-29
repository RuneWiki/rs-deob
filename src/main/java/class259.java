import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class259 {

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lbd;")
    private static class162 field4308 = class17.method142(0, "Loaded sprites");

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Lbd;")
    public static class162 field4307 = class17.method142(0, "Texturen geladen)3");

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field4312 = 0;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Lbd;")
    public static class162 field4309 = class17.method142(0, "gleiten:");

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field4313 = 0;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lbd;")
    private static class162 field4311 = class17.method142(0, "Unable to find ");

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Lbd;")
    public static class162 field4319 = field4311;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "Lbd;")
    public static class162 field4320 = class17.method142(0, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Z")
    public static boolean field4317 = true;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field4321 = 1;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "Lbd;")
    public static class162 field4314 = field4308;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "[[[B")
    public static byte[][][] field4315;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 25)
    public static final void method1789(int arg0) {
        field4318++;
        class63.field975.method352(118);
        int var1 = class63.field975.method344(2, 8);
        if (var1 < class31.field520) {
            for (int var2 = var1; var2 < class31.field520; var2++) {
                class181.field3116[class4.field29++] = class278.field4674[var2];
            }
        }
        if (class31.field520 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class31.field520 = 0;
        int var3 = 97 % ((-arg0 - 22) / 56);
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class278.field4674[var4];
            class60 var6 = class204.field3446[var5];
            int var7 = class63.field975.method344(2, 1);
            if (var7 == 0) {
                class278.field4674[class31.field520++] = var5;
                var6.field5051 = class90.field1598;
            } else {
                int var8 = class63.field975.method344(2, 2);
                if (var8 == 0) {
                    class278.field4674[class31.field520++] = var5;
                    var6.field5051 = class90.field1598;
                    class181.field3118[class267.field4446++] = var5;
                } else if (var8 == 1) {
                    class278.field4674[class31.field520++] = var5;
                    var6.field5051 = class90.field1598;
                    int var12 = class63.field975.method344(2, 3);
                    var6.method2053(var12, false, 0);
                    int var13 = class63.field975.method344(2, 1);
                    if (var13 == 1) {
                        class181.field3118[class267.field4446++] = var5;
                    }
                } else if (var8 == 2) {
                    class278.field4674[class31.field520++] = var5;
                    var6.field5051 = class90.field1598;
                    int var9 = class63.field975.method344(2, 3);
                    var6.method2053(var9, true, 0);
                    int var10 = class63.field975.method344(2, 3);
                    var6.method2053(var10, true, 0);
                    int var11 = class63.field975.method344(2, 1);
                    if (var11 == 1) {
                        class181.field3118[class267.field4446++] = var5;
                    }
                } else if (var8 == 3) {
                    class181.field3116[class4.field29++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZZ[[[Lnm;II)Z", line = 131)
    public static final boolean method1790(int arg0, boolean arg1, boolean arg2, class225[][][] arg3, int arg4, int arg5) {
        byte var6 = arg2 ? 1 : (byte) (class279.field4702 & 0xFF);
        field4310++;
        if (class201.field3421[class157.field2765][arg4][arg5] == var6) {
            return false;
        } else if ((class213.field3580[class157.field2765][arg4][arg5] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            if (arg1) {
                field4307 = (class162) null;
            }
            class112.field2033[var7] = arg4;
            int var31 = var7 + 1;
            class250.field4180[var7] = arg5;
            class201.field3421[class157.field2765][arg4][arg5] = var6;
            int var8 = 0;
            while (var31 != var8) {
                int var9 = class250.field4180[var8] & 0xFFFF;
                int var10 = class112.field2033[var8] & 0xFFFF;
                int var11 = class112.field2033[var8] >> 24 & 0xFF;
                int var12 = (class250.field4180[var8] & 0xFF2D7E) >> 16;
                boolean var13 = false;
                boolean var14 = false;
                if ((class213.field3580[class157.field2765][var10][var9] & 0x4) == 0) {
                    var14 = true;
                }
                int var15 = (class112.field2033[var8] & 0xFF8527) >> 16;
                var8 = var8 + 1 & 0xFFF;
                label248: for (int var16 = class157.field2765 + 1; var16 <= 3; var16++) {
                    if ((class213.field3580[var16][var10][var9] & 0x8) == 0) {
                        if (var14 && arg3[var16][var10][var9] != null) {
                            if (arg3[var16][var10][var9].field3753 != null) {
                                int var17 = class134.method1056((byte) 68, var15);
                                if (arg3[var16][var10][var9].field3753.field4528 == var17 || arg3[var16][var10][var9].field3753.field4525 == var17) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var18 = class134.method1056((byte) 49, var11);
                                    if (arg3[var16][var10][var9].field3753.field4528 == var18 || arg3[var16][var10][var9].field3753.field4525 == var18) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var19 = class134.method1056((byte) 52, var12);
                                    if (arg3[var16][var10][var9].field3753.field4528 == var19 || arg3[var16][var10][var9].field3753.field4525 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg3[var16][var10][var9].field3765 != null) {
                                for (int var20 = 0; var20 < arg3[var16][var10][var9].field3756; var20++) {
                                    int var21 = (int) (arg3[var16][var10][var9].field3765[var20].field697 >> 14 & 0x3FL);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var22 = (int) (arg3[var16][var10][var9].field3765[var20].field697 >> 20 & 0x3L);
                                    int var23 = var22 << 6 | var21;
                                    if (var15 == var23 || var11 != 0 && var11 == var23 || var12 != 0 && var12 == var23) {
                                        continue label248;
                                    }
                                }
                            }
                        }
                        var13 = true;
                        class225 var24 = arg3[var16][var10][var9];
                        if (var24 != null && var24.field3756 > 0) {
                            for (int var25 = 0; var25 < var24.field3756; var25++) {
                                class43 var26 = var24.field3765[var25];
                                if (var26.field711 != var26.field707 || var26.field701 != var26.field699) {
                                    for (int var27 = var26.field711; var27 <= var26.field707; var27++) {
                                        for (int var28 = var26.field699; var28 <= var26.field701; var28++) {
                                            class201.field3421[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class201.field3421[var16][var10][var9] = var6;
                    }
                }
                if (var13) {
                    if (class206.field3473[class157.field2765 + 1][var10][var9] > class315.field5324[arg0]) {
                        class315.field5324[arg0] = class206.field3473[class157.field2765 + 1][var10][var9];
                    }
                    int var29 = var10 << 7;
                    if (var29 < class70.field1123[arg0]) {
                        class70.field1123[arg0] = var29;
                    } else if (class296.field4954[arg0] < var29) {
                        class296.field4954[arg0] = var29;
                    }
                    int var30 = var9 << 7;
                    if (class278.field4680[arg0] > var30) {
                        class278.field4680[arg0] = var30;
                    } else if (var30 > class25.field414[arg0]) {
                        class25.field414[arg0] = var30;
                    }
                }
                if (!var14) {
                    if (var10 >= 1 && class201.field3421[class157.field2765][var10 - 1][var9] != var6) {
                        class112.field2033[var31] = class289.method2005(class289.method2005(1179648, var10 - 1), -754974720);
                        class250.field4180[var31] = class289.method2005(var9, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class201.field3421[class157.field2765][var10 - 1][var9] = var6;
                    }
                    var9++;
                    if (var9 < 104) {
                        if (var10 - 1 >= 0 && class201.field3421[class157.field2765][var10 - 1][var9] != var6 && (class213.field3580[class157.field2765][var10][var9] & 0x4) == 0 && (class213.field3580[class157.field2765][var10 - 1][var9 - 1] & 0x4) == 0) {
                            class112.field2033[var31] = class289.method2005(1375731712, class289.method2005(var10 - 1, 1179648));
                            class250.field4180[var31] = class289.method2005(var9, 1245184);
                            class201.field3421[class157.field2765][var10 - 1][var9] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class201.field3421[class157.field2765][var10][var9] != var6) {
                            class112.field2033[var31] = class289.method2005(class289.method2005(var10, 5373952), 318767104);
                            class250.field4180[var31] = class289.method2005(5439488, var9);
                            class201.field3421[class157.field2765][var10][var9] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var10 + 1) < 104 && class201.field3421[class157.field2765][var10 + 1][var9] != var6 && (class213.field3580[class157.field2765][var10][var9] & 0x4) == 0 && (class213.field3580[class157.field2765][var10 + 1][var9 - 1] & 0x4) == 0) {
                            class112.field2033[var31] = class289.method2005(class289.method2005(var10 + 1, 5373952), -1845493760);
                            class250.field4180[var31] = class289.method2005(5439488, var9);
                            var31 = var31 + 1 & 0xFFF;
                            class201.field3421[class157.field2765][var10 + 1][var9] = var6;
                        }
                    }
                    var9--;
                    if ((var10 + 1) < 104 && class201.field3421[class157.field2765][var10 + 1][var9] != var6) {
                        class112.field2033[var31] = class289.method2005(class289.method2005(var10 + 1, 9568256), 1392508928);
                        class250.field4180[var31] = class289.method2005(9633792, var9);
                        class201.field3421[class157.field2765][var10 + 1][var9] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var9--;
                    if (var9 >= 0) {
                        if (var10 - 1 >= 0 && class201.field3421[class157.field2765][var10 - 1][var9] != var6 && (class213.field3580[class157.field2765][var10][var9] & 0x4) == 0 && (class213.field3580[class157.field2765][var10 - 1][var9 + 1] & 0x4) == 0) {
                            class112.field2033[var31] = class289.method2005(class289.method2005(var10 - 1, 13762560), 301989888);
                            class250.field4180[var31] = class289.method2005(13828096, var9);
                            var31 = var31 + 1 & 0xFFF;
                            class201.field3421[class157.field2765][var10 - 1][var9] = var6;
                        }
                        if (class201.field3421[class157.field2765][var10][var9] != var6) {
                            class112.field2033[var31] = class289.method2005(-1828716544, class289.method2005(var10, 13762560));
                            class250.field4180[var31] = class289.method2005(var9, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class201.field3421[class157.field2765][var10][var9] = var6;
                        }
                        if (var10 + 1 < 104 && class201.field3421[class157.field2765][var10 + 1][var9] != var6 && (class213.field3580[class157.field2765][var10][var9] & 0x4) == 0 && (class213.field3580[class157.field2765][var10 + 1][var9 + 1] & 0x4) == 0) {
                            class112.field2033[var31] = class289.method2005(-771751936, class289.method2005(9568256, var10 + 1));
                            class250.field4180[var31] = class289.method2005(var9, 9633792);
                            class201.field3421[class157.field2765][var10 + 1][var9] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class315.field5324[arg0] != -1000000) {
                class315.field5324[arg0] += 10;
                class70.field1123[arg0] -= 50;
                class296.field4954[arg0] += 50;
                class25.field414[arg0] += 50;
                class278.field4680[arg0] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 439)
    public static void method1791(int arg0) {
        field4311 = null;
        field4320 = null;
        field4315 = (byte[][][]) null;
        field4307 = null;
        field4314 = null;
        field4319 = null;
        field4309 = null;
        field4308 = null;
        if (arg0 != 8) {
            field4307 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILqd;III)V", line = 488)
    public static final void method1792(int arg0, int arg1, int arg2, class179 arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 4095) {
            method1789(79);
        }
        field4305++;
        long var7 = 0L;
        if (arg6 == 0) {
            var7 = class82.method626(arg2, arg4, arg0);
        } else if (arg6 == 1) {
            var7 = class137.method1071(arg2, arg4, arg0);
        } else if (arg6 == 2) {
            var7 = class104.method846(arg2, arg4, arg0);
        } else if (arg6 == 3) {
            var7 = class256.method1768(arg2, arg4, arg0);
        }
        boolean var9 = false;
        boolean var10 = true;
        int var11 = (int) var7 >> 14 & 0x1F;
        int var12 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        class311 var13 = class229.method1637(var12, (byte) 93);
        boolean var14 = false;
        int var15 = ((int) var7 & 0x3E668C) >> 20;
        if (var13.method2097((byte) 88)) {
            class20.method180(-10583, var13, arg2, arg4, arg0);
        }
        if (var7 == 0L) {
            return;
        }
        class255 var16 = null;
        class255 var17 = null;
        if (arg6 == 0) {
            class273 var18 = class59.method410(arg2, arg4, arg0);
            if (var18 != null) {
                var17 = var18.field4534;
                var16 = var18.field4527;
            }
            if (var13.field5245 != 0) {
                arg3.method1351(var13.field5230, -4, var15, var11, arg4, arg0);
            }
        } else if (arg6 == 1) {
            class138 var19 = class97.method780(arg2, arg4, arg0);
            if (var19 != null) {
                var17 = var19.field2468;
                var16 = var19.field2459;
            }
        } else if (arg6 == 2) {
            class43 var21 = class183.method1389(arg2, arg4, arg0);
            if (var21 != null) {
                var16 = var21.field712;
            }
            if (var13.field5245 != 0 && (var13.field5201 + arg4) < 104 && (var13.field5201 + arg0) < 104 && var13.field5217 + arg4 < 104 && (var13.field5217 + arg0) < 104) {
                arg3.method1361(var15, var13.field5230, arg4, arg0, var13.field5201, var13.field5217, true);
            }
        } else if (arg6 == 3) {
            class147 var20 = class47.method347(arg2, arg4, arg0);
            if (var20 != null) {
                var16 = var20.field2659;
            }
            if (var13.field5245 == 1) {
                arg3.method1362(arg0, arg4, 105);
            }
        }
        if (!class117.field2159 || !var13.field5242) {
            return;
        }
        if (var11 == 2) {
            if ((var16 instanceof class302)) {
                ((class302) var16).method2061((byte) 96);
            } else {
                class109.method883(var13, arg4, 0, arg0, var15 + 4, arg1, var11, 104, 0);
            }
            if (var17 instanceof class302) {
                ((class302) var17).method2061((byte) -98);
            } else {
                class109.method883(var13, arg4, 0, arg0, var15 + 1 & 0x3, arg1, var11, 104, 0);
            }
        } else if (var11 == 5) {
            if (var16 instanceof class302) {
                ((class302) var16).method2061((byte) -122);
            } else {
                class109.method883(var13, arg4, class71.field1140[var15] * 8, arg0, var15, arg1, 4, arg5 - 3991, class230.field3823[var15] * 8);
            }
        } else if (var11 == 6) {
            if ((var16 instanceof class302)) {
                ((class302) var16).method2061((byte) 77);
            } else {
                class109.method883(var13, arg4, class185.field3185[var15] * 8, arg0, var15 + 4, arg1, 4, arg5 - 3991, class157.field2775[var15] * 8);
            }
        } else if (var11 == 7) {
            if ((var16 instanceof class302)) {
                ((class302) var16).method2061((byte) 85);
            } else {
                class109.method883(var13, arg4, 0, arg0, (var15 + 2 & 0x3) + 4, arg1, 4, 104, 0);
            }
        } else if (var11 == 8) {
            if ((var16 instanceof class302)) {
                ((class302) var16).method2061((byte) 102);
            } else {
                class109.method883(var13, arg4, class185.field3185[var15] * 8, arg0, var15 + 4, arg1, 4, arg5 ^ 0xF97, class157.field2775[var15] * 8);
            }
            if ((var17 instanceof class302)) {
                ((class302) var17).method2061((byte) -103);
            } else {
                class109.method883(var13, arg4, class185.field3185[var15] * 8, arg0, (var15 + 2 & 0x3) + 4, arg1, 4, 104, class157.field2775[var15] * 8);
            }
        } else if (var11 == 11) {
            if (var16 instanceof class302) {
                ((class302) var16).method2061((byte) -107);
            } else {
                class109.method883(var13, arg4, 0, arg0, var15 + 4, arg1, 10, 104, 0);
            }
        } else if ((var16 instanceof class302)) {
            ((class302) var16).method2061((byte) -91);
        } else {
            class109.method883(var13, arg4, 0, arg0, var15, arg1, var11, arg5 - 3991, 0);
        }
    }
}
