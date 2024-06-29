import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class372 {

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public int field5073 = 1;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "Lmc;")
    public static class78 field5071 = new class78(29, -1);

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "Lmc;")
    public static class78 field5077 = new class78(35, 3);

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "C")
    public char field5075;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    public static int field5078;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cr", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field5079;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lbt;I)V")
    public final void method2286(class32 arg0, int arg1) {
        int var3 = 45 / ((14 - arg1) / 54);
        field5074++;
        while (true) {
            int var4 = arg0.method201((byte) -117);
            if (var4 == 0) {
                return;
            }
            this.method2288(arg0, var4, 0);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public static void method2287(int arg0) {
        if (arg0 != 0) {
            method2290((byte) -36, (class364) null, -29);
        }
        field5077 = null;
        field5071 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lbt;II)V")
    private final void method2288(class32 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method2288((class32) null, -92, 31);
        }
        if (arg1 == 1) {
            this.field5075 = class107.method661(arg2 ^ 0xFFFFF7CB, arg0.method211(29861));
        } else if (arg1 == 2) {
            this.field5073 = 0;
        }
        field5072++;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
    public static final void method2289(int arg0) {
        field5078++;
        if (arg0 == 6352) {
            class114.field1713 = 0;
            class182.field2499 = 0;
            class272.field3620 = 0;
            class18.field259 = 0;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLwm;I)Z")
    public static final boolean method2290(byte arg0, class364 arg1, int arg2) {
        field5076++;
        int var3 = (class295.field3947 - 104) / 2;
        int var4 = (class39.field567 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var51 = var4; var51 < (var4 + 104); var51++) {
                for (int var52 = arg2; var52 <= 3; var52++) {
                    if (class383.method2350(var51, arg2, var52, 119, var6)) {
                        int var53 = var52;
                        if (class151.method894((byte) 24, var51, var6)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class148.method879(var6, 116, var53, var51);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class45.field621 = arg1.method1982(var7, 0, 512, 512, 512);
        class476.method2781(-60);
        int var9 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 + -10 << 16) + 238 - 10 | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        if (arg0 < 65) {
            method2290((byte) -117, (class364) null, 99);
        }
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
        boolean[][] var12 = new boolean[class324.field4318][class324.field4318];
        for (int var13 = var3; var13 < (var3 + 104); var13 += class324.field4318) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class324.field4318) {
                arg1.method1981(0, 0, class324.field4318 * 4, class324.field4318 * 4);
                arg1.method2064(-16777216);
                for (int var37 = arg2; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class324.field4318; var44++) {
                        for (int var50 = 0; var50 < class324.field4318; var50++) {
                            var12[var44][var50] = class383.method2350(var36 + var50, arg2, var37, 78, var13 + var44);
                        }
                    }
                    class289.field3896[var37].method377(0, 0, 1024, var13, var36, class324.field4318 + var13, class324.field4318 + var36, var12);
                    if (!class472.field6516) {
                        for (int var45 = -4; var45 < class324.field4318; var45++) {
                            for (int var46 = -4; var46 < class324.field4318; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var3 <= var47 && var4 <= var48 && class383.method2350(var48, arg2, var37, 76, var47)) {
                                    int var49 = var37;
                                    if (class151.method894((byte) 68, var48, var47)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class296.method1670(var10, var9, var45 * 4, arg1, var47, (class324.field4318 - var46) * 4 - 4, (byte) 50, var49, var48);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class472.field6516) {
                    class261 var38 = class60.field805[arg2];
                    for (int var39 = 0; var39 < class324.field4318; var39++) {
                        for (int var40 = 0; var40 < class324.field4318; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field3454[var41 - var38.field3451][var42 - var38.field3469];
                            if ((var43 & 0x40240000) != 0) {
                                arg1.method2222(4, var39 * 4, (class324.field4318 - var40) * 4 - 4, -1713569622, 98, 4);
                            } else if ((var43 & 0x800000) != 0) {
                                arg1.method2224(var39 * 4, 16384, 4, (class324.field4318 - var40) * 4 - 4, -1713569622);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg1.method2215(-1713569622, var39 * 4 + 3, (-var40 + class324.field4318) * 4 - 4, 4, (byte) -125);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg1.method2224(var39 * 4, 16384, 4, (class324.field4318 - var40) * 4 + 3 - 4, -1713569622);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg1.method2215(-1713569622, var39 * 4, (class324.field4318 - var40) * 4 - 4, 4, (byte) -101);
                            }
                        }
                    }
                }
                arg1.method2003(0, 0, class324.field4318 * 4, class324.field4318 * 4, var11, 2);
                class45.field621.method839((var13 - var3) * 4 + 48, 464 - (-var4 + var36) * 4 - class324.field4318 * 4, class324.field4318 * 4, class324.field4318 * 4, 0, 0);
            }
        }
        arg1.method2006();
        arg1.method2064(-16777215);
        class480.method2803((byte) -28);
        class364.field4993 = 0;
        class458.field6213.method645(0);
        if (!class472.field6516) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg2; var21 <= arg2 + 1 && var21 <= 3; var21++) {
                        if (class383.method2350(var20, arg2, var21, 114, var14)) {
                            class381 var22 = (class381) class146.method870(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class381) class4.method29(var21, var14, var20, field5079 == null ? (field5079 = method2291("id")) : field5079);
                            }
                            if (var22 == null) {
                                var22 = (class381) class413.method2478(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class381) class425.method2509(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class88 var23 = class1.field23.method935(var22.method13(56), (byte) -77);
                                if (!var23.field1268 || class158.field2174) {
                                    int var24 = var23.field1220;
                                    if (var23.field1269 != null) {
                                        for (int var25 = 0; var25 < var23.field1269.length; var25++) {
                                            if (var23.field1269[var25] != -1) {
                                                class88 var26 = class1.field23.method935(var23.field1269[var25], (byte) 99);
                                                if (var26.field1220 >= 0) {
                                                    var24 = var26.field1220;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class313 var28 = class464.field6319.method2710(26, var24);
                                            if (var28 != null && var28.field4129) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class60.field805[var21].field3454;
                                            int var32 = class60.field805[var21].field3451;
                                            int var33 = class60.field805[var21].field3469;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var29 > var14 - 3 && (var31[var29 - (var32 + 1)][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && (var3 + 104 - 1) > var29 && (var14 + 3) > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && var30 > var20 - 3 && (var31[var29 - var32][var30 - (var33 + 1)] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && (var4 + 104 - 1) > var30 && var20 + 3 > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class374.field5153[class364.field4993] = var23.field1298;
                                        class469.field6482[class364.field4993] = var29;
                                        class51.field677[class364.field4993] = var30;
                                        class364.field4993++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class32.field485 != null) {
                class19.field262.field1651 = 1;
                class464.field6319.method2708(64, 1024, -2);
                for (int var15 = 0; var15 < class32.field485.field6168; var15++) {
                    int var16 = class32.field485.field6167[var15];
                    if (var16 >> 28 == class233.field3103.field6502) {
                        int var17 = ((var16 & 0xFFFF705) >> 14) - class162.field2260;
                        int var18 = (var16 & 0x3FFF) - class266.field3511;
                        if (var17 >= 0 && var17 < class295.field3947 && var18 >= 0 && class39.field567 > var18) {
                            class458.field6213.method641(new class37(var15), (byte) -93);
                        } else {
                            class313 var19 = class464.field6319.method2710(26, class32.field485.field6169[var15]);
                            if (var19.field4122 != null && (var19.field4133 + var17) >= 0 && var17 + var19.field4151 < class295.field3947 && (var19.field4144 + var18) >= 0 && class39.field567 > (var18 + var19.field4148)) {
                                class458.field6213.method641(new class37(var15), (byte) -93);
                            }
                        }
                    }
                }
                class464.field6319.method2708(64, 128, -2);
                class19.field262.field1651 = 2;
                class19.field262.method681(false);
            }
        }
        return true;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2291(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
