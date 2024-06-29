import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public abstract class class308 extends class403 {

    @OriginalMember(owner = "client!eu", name = "D", descriptor = "I")
    public int field4074;

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "[I")
    public static int[] field4075 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!eu", name = "I", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!eu", name = "H", descriptor = "Lqi;")
    public static class367 field4078;

    @OriginalMember(owner = "client!eu", name = "B", descriptor = "Ljava/awt/Font;")
    public static Font field4073;

    @OriginalMember(owner = "client!eu", name = "G", descriptor = "[[[Lf;")
    public static class491[][][] field4077;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lhc;Lf;)V", line = 5)
    public static final void method1699(class84 arg0, class491 arg1) {
        if (!arg1.field6838) {
            return;
        }
        short var2 = arg1.field6860;
        short var3 = arg1.field6854;
        byte var4 = arg1.field6848;
        byte var5 = arg1.field6836;
        int var6 = (var2 << class302.field4025) + class235.field3119;
        int var7 = (var3 << class302.field4025) + class235.field3119;
        class491[][] var8 = class289.field3897[var4];
        float var9;
        if (class312.field4112 == class221.field2945) {
            class95.field1404.method2066(class289.field3896[0].method368(var6, var7), class102.method621(var2, var3), class326.method1826(var2, var3), class132.method808(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class95.field1404.method1997(3000.0F, var9 * 1.5F);
        if (arg1.field6863) {
            if (class69.field955) {
                if (var4 > 0) {
                    class491 var10 = class289.field3897[var4 - 1][var2][var3];
                    if (var10 != null && var10.field6838) {
                        return;
                    }
                }
                if (var2 <= class121.field1779 && var2 > class100.field1461) {
                    class491 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field6838 && (var11.field6863 || (arg1.field6843 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class121.field1779 && var2 < class86.field1188 - 1) {
                    class491 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field6838 && (var12.field6863 || (arg1.field6843 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class412.field5643 && var3 > class492.field6879) {
                    class491 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field6838 && (var13.field6863 || (arg1.field6843 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class412.field5643 && var3 < class66.field884 - 1) {
                    class491 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field6838 && (var14.field6863 || (arg1.field6843 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class69.field955 = true;
            }
            arg1.field6863 = false;
            if (arg1.field6862 != null) {
                class491 var15 = arg1.field6862;
                class95.field1404.method1997(3000.0F, (201.5F - (float) (var15.field6836 + 1) * 50.0F) * 1.5F);
                if (!class17.method110(var15.field6836, var2, var3)) {
                    class221.field2945[var15.field6836].method374(var2, var3);
                }
                class327 var16 = var15.field6864;
                if (var16 != null) {
                    if (class205.field2781) {
                        if ((var16.field4359 & arg1.field6850) == 0) {
                            class375.method2307(arg0, var4, var2, var3);
                        } else {
                            class365.method2227(arg0, var16.field4359, var5, var2, var3);
                        }
                        class95.field1404.method1978(arg0.field1100, arg0.field1107);
                    }
                    var16.method3(class95.field1404, (byte) 101);
                }
                for (class309 var17 = var15.field6845; var17 != null; var17 = var17.field4084) {
                    class471 var18 = var17.field4091;
                    if (var18 != null) {
                        if (class205.field2781) {
                            class375.method2307(arg0, var4, var2, var3);
                            class95.field1404.method1978(arg0.field1100, arg0.field1107);
                        }
                        var18.method3(class95.field1404, (byte) 110);
                    }
                }
                class95.field1404.method1997(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class17.method110(var5, var2, var3);
            if (var19) {
                class221.field2945[var5].method374(var2, var3);
                class354 var20 = arg1.field6842;
                if (var20 != null && var20.field4898) {
                    if (var20.field4902) {
                        class95.field1404.method1997(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class205.field2781) {
                        class375.method2307(arg0, var4, var2, var3);
                        class95.field1404.method1978(arg0.field1100, arg0.field1107);
                    }
                    class374 var21 = var20.method3(class95.field1404, (byte) 124);
                    if (var21 != null) {
                        var21.field5159 = var20;
                        var21.field5155 = var4;
                        var21.field5161 = var2;
                        var21.field5158 = var3;
                        class32.field488.method2767(-1830, var21);
                    }
                    if (var20.field4902) {
                        class95.field1404.method1997(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class327 var24 = arg1.field6864;
            class451 var25 = arg1.field6840;
            if (var24 != null || var25 != null) {
                if (class121.field1779 == var2) {
                    var22++;
                } else if (class121.field1779 < var2) {
                    var22 += 2;
                }
                if (class412.field5643 == var3) {
                    var22 += 3;
                } else if (class412.field5643 > var3) {
                    var22 += 6;
                }
                var23 = class276.field3649[var22];
                arg1.field6850 = class471.field6506[var22];
            }
            if (var24 != null) {
                if ((var24.field4359 & class486.field6727[var22]) == 0) {
                    arg1.field6844 = 0;
                } else if (var24.field4359 == 16) {
                    arg1.field6844 = 3;
                    arg1.field6857 = class23.field299[var22];
                    arg1.field6852 = (byte) (3 - arg1.field6857);
                } else if (var24.field4359 == 32) {
                    arg1.field6844 = 6;
                    arg1.field6857 = class199.field2697[var22];
                    arg1.field6852 = (byte) (6 - arg1.field6857);
                } else if (var24.field4359 == 64) {
                    arg1.field6844 = 12;
                    arg1.field6857 = class143.field2063[var22];
                    arg1.field6852 = (byte) (12 - arg1.field6857);
                } else {
                    arg1.field6844 = 9;
                    arg1.field6857 = class475.field6538[var22];
                    arg1.field6852 = (byte) (9 - arg1.field6857);
                }
                if ((var24.field4359 & var23) != 0 && !client.method1042(var5, var2, var3, var24.field4359)) {
                    if (class205.field2781) {
                        class375.method2307(arg0, var4, var2, var3);
                        class95.field1404.method1978(arg0.field1100, arg0.field1107);
                    }
                    class374 var26 = var24.method3(class95.field1404, (byte) 125);
                    if (var26 != null) {
                        var26.field5159 = var24;
                        var26.field5155 = var4;
                        var26.field5161 = var2;
                        var26.field5158 = var3;
                        class32.field488.method2767(-1830, var26);
                    }
                }
                class327 var27 = arg1.field6847;
                if (var27 != null && (var27.field4359 & var23) != 0 && !client.method1042(var5, var2, var3, var27.field4359)) {
                    if (class205.field2781) {
                        class375.method2307(arg0, var4, var2, var3);
                        class95.field1404.method1978(arg0.field1100, arg0.field1107);
                    }
                    class374 var28 = var27.method3(class95.field1404, (byte) 114);
                    if (var28 != null) {
                        var28.field5159 = var27;
                        var28.field5155 = var4;
                        var28.field5161 = var2;
                        var28.field5158 = var3;
                        class32.field488.method2767(-1830, var28);
                    }
                }
            }
            if (var25 != null && !class453.method2658(var5, var2, var3, var25.method51(100))) {
                class451 var29 = arg1.field6849;
                class95.field1404.method1997(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field6135 & var23) != 0) {
                    if (class205.field2781) {
                        class375.method2307(arg0, var4, var2, var3);
                        class95.field1404.method1978(arg0.field1100, arg0.field1107);
                    }
                    class374 var30 = var25.method3(class95.field1404, (byte) 113);
                    if (var30 != null) {
                        var30.field5159 = var25;
                        var30.field5155 = var4;
                        var30.field5161 = var2;
                        var30.field5158 = var3;
                        class32.field488.method2767(-1830, var30);
                    }
                } else if (var25.field6135 == 256) {
                    int var31 = var25.field6132 - class138.field2003;
                    int var32 = var25.field6129 - class1.field6;
                    int var33 = var25.field6127;
                    int var34;
                    if (var33 == 1 || var33 == 2) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    int var35;
                    if (var33 == 2 || var33 == 3) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    if (class205.field2781) {
                        class375.method2307(arg0, var4, var2, var3);
                        class95.field1404.method1978(arg0.field1100, arg0.field1107);
                    }
                    if (var35 < var34) {
                        class374 var36 = var25.method3(class95.field1404, (byte) 100);
                        if (var36 != null) {
                            var36.field5159 = var25;
                            var36.field5155 = var4;
                            var36.field5161 = var2;
                            var36.field5158 = var3;
                            class32.field488.method2767(-1830, var36);
                        }
                    } else if (var29 != null) {
                        class374 var37 = var29.method3(class95.field1404, (byte) 117);
                        if (var37 != null) {
                            var37.field5159 = var29;
                            var37.field5155 = var4;
                            var37.field5161 = var2;
                            var37.field5158 = var3;
                            class32.field488.method2767(-1830, var37);
                        }
                    }
                }
                class95.field1404.method1997(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class354 var38 = arg1.field6842;
                if (var38 != null && !var38.field4898) {
                    if (var38.field4902) {
                        class95.field1404.method1997(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class205.field2781) {
                        class375.method2307(arg0, var4, var2, var3);
                        class95.field1404.method1978(arg0.field1100, arg0.field1107);
                    }
                    class374 var39 = var38.method3(class95.field1404, (byte) 101);
                    if (var39 != null) {
                        var39.field5159 = var38;
                        var39.field5155 = var4;
                        var39.field5161 = var2;
                        var39.field5158 = var3;
                        class32.field488.method2767(-1830, var39);
                    }
                    if (var38.field4902) {
                        class95.field1404.method1997(3000.0F, var9 * 1.5F);
                    }
                }
                class41 var40 = arg1.field6855;
                if (var40 != null && !var40.field581) {
                    if (class205.field2781) {
                        class375.method2307(arg0, var4, var2, var3);
                        class95.field1404.method1978(arg0.field1100, arg0.field1107);
                    }
                    class374 var41 = var40.method3(class95.field1404, (byte) 121);
                    if (var41 != null) {
                        var41.field5159 = var40;
                        var41.field5155 = var4;
                        var41.field5161 = var2;
                        var41.field5158 = var3;
                        class32.field488.method2767(-1830, var41);
                    }
                }
            }
            byte var42 = arg1.field6843;
            if (var42 != 0) {
                if (var2 < class121.field1779 && (var42 & 0x4) != 0) {
                    class491 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field6838) {
                        class67.field913.method1107(var43, 0);
                    }
                }
                if (var3 < class412.field5643 && (var42 & 0x2) != 0) {
                    class491 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field6838) {
                        class67.field913.method1107(var44, 0);
                    }
                }
                if (var2 > class121.field1779 && (var42 & 0x1) != 0) {
                    class491 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field6838) {
                        class67.field913.method1107(var45, 0);
                    }
                }
                if (var3 > class412.field5643 && (var42 & 0x8) != 0) {
                    class491 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field6838) {
                        class67.field913.method1107(var46, 0);
                    }
                }
            }
        }
        if (arg1.field6844 != 0) {
            boolean var47 = true;
            for (class309 var48 = arg1.field6845; var48 != null; var48 = var48.field4084) {
                if (class288.field3885 != var48.field4091.field6492 && (var48.field4082 & arg1.field6844) == arg1.field6857) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class327 var49 = arg1.field6864;
                if (!client.method1042(var5, var2, var3, var49.field4359)) {
                    if (class205.field2781) {
                        label686: {
                            if (var49.field4359 >= 16) {
                                int var50 = var2 - class121.field1779;
                                int var51 = var3 - class412.field5643;
                                if (var49.field4359 == 16) {
                                    int var52 = var50 - class235.field3119;
                                    int var53 = class235.field3119 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class91.field1344) {
                                        class375.method2307(arg0, var4, var2 - 1, var3 + 1);
                                        break label686;
                                    }
                                } else if (var49.field4359 == 32) {
                                    int var54 = class235.field3119 + var50;
                                    int var55 = class235.field3119 + var51;
                                    if (var55 < -var54 && var2 < class143.field2058 && var3 < class91.field1344) {
                                        class375.method2307(arg0, var4, var2 + 1, var3 + 1);
                                        break label686;
                                    }
                                } else if (var49.field4359 == 64) {
                                    int var56 = class235.field3119 + var50;
                                    int var57 = var51 - class235.field3119;
                                    if (var57 > var56 && var2 < class143.field2058 && var3 > 0) {
                                        class375.method2307(arg0, var4, var2 + 1, var3 - 1);
                                        break label686;
                                    }
                                } else if (var49.field4359 == 128) {
                                    int var58 = var50 - class235.field3119;
                                    int var59 = var51 - class235.field3119;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class375.method2307(arg0, var4, var2 - 1, var3 - 1);
                                        break label686;
                                    }
                                }
                            }
                            class375.method2307(arg0, var4, var2, var3);
                        }
                        class95.field1404.method1978(arg0.field1100, arg0.field1107);
                    }
                    class374 var60 = var49.method3(class95.field1404, (byte) 108);
                    if (var60 != null) {
                        var60.field5159 = var49;
                        var60.field5155 = var4;
                        var60.field5161 = var2;
                        var60.field5158 = var3;
                        class32.field488.method2767(-1830, var60);
                    }
                }
                arg1.field6844 = 0;
            }
        }
        if (arg1.field6858) {
            try {
                arg1.field6858 = false;
                int var61 = 0;
                label629: for (class309 var62 = arg1.field6845; var62 != null; var62 = var62.field4084) {
                    class471 var63 = var62.field4091;
                    if (class288.field3885 != var63.field6492) {
                        for (int var64 = var63.field6500; var64 <= var63.field6505; var64++) {
                            for (int var65 = var63.field6491; var65 <= var63.field6497; var65++) {
                                class491 var66 = var8[var64][var65];
                                if (var66.field6863) {
                                    arg1.field6858 = true;
                                    continue label629;
                                }
                                if (var66.field6844 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field6500) {
                                        var67++;
                                    }
                                    if (var64 < var63.field6505) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field6491) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field6497) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field6844) == arg1.field6852) {
                                        arg1.field6858 = true;
                                        continue label629;
                                    }
                                }
                            }
                        }
                        int var68 = class121.field1779 - var63.field6500;
                        int var69 = var63.field6505 - class121.field1779;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class412.field5643 - var63.field6491;
                        int var71 = var63.field6497 - class412.field5643;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field1106[var61] = var63;
                        arg0.field1102[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class471 var75 = arg0.field1106[var74];
                        if (class288.field3885 != var75.field6492) {
                            int var76 = arg0.field1102[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field6501 - class138.field2003;
                                int var78 = var75.field6507 - class1.field6;
                                int var79 = arg0.field1106[var73].field6501 - class138.field2003;
                                int var80 = arg0.field1106[var73].field6507 - class1.field6;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class471 var81 = arg0.field1106[var73];
                    var81.field6492 = class288.field3885;
                    if (!class2.method18(var5, var81.field6500, var81.field6505, var81.field6491, var81.field6497, var81.method6(0))) {
                        if (class205.field2781) {
                            if (var81.field6499 == 0) {
                                class108.method668(arg0, var4, var81.field6500, var81.field6491, var81.field6505, var81.field6497);
                            } else {
                                class375.method2307(arg0, var4, var2, var3);
                                int var82 = var2 - class121.field1779;
                                int var83 = var3 - class412.field5643;
                                if (var81.field6499 == 2) {
                                    if (var83 > -var82) {
                                        class63.method426(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class63.method426(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class63.method426(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class63.method426(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class95.field1404.method1978(arg0.field1100, arg0.field1107);
                        }
                        class374 var84 = var81.method3(class95.field1404, (byte) 112);
                        if (var84 != null) {
                            var84.field5159 = var81;
                            var84.field5155 = var4;
                            var84.field5161 = var81.field6500;
                            var84.field5158 = var81.field6491;
                            class32.field488.method2767(-1830, var84);
                        }
                    }
                    for (int var85 = var81.field6500; var85 <= var81.field6505; var85++) {
                        for (int var86 = var81.field6491; var86 <= var81.field6497; var86++) {
                            class491 var87 = var8[var85][var86];
                            if (var87.field6844 != 0) {
                                class67.field913.method1107(var87, 0);
                            } else if ((var2 != var85 || var3 != var86) && var87.field6838) {
                                class67.field913.method1107(var87, 0);
                            }
                        }
                    }
                }
                if (arg1.field6858) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field6858 = false;
            }
        }
        if (arg1.field6853 != null && (byte) (class45.field622 & 0xFF) == arg1.field6861) {
            class342 var88 = arg1.field6853;
            int var89 = class221.field2945[var4].method371(var2, var3);
            int var90;
            if (var4 < class142.field2056 - 1) {
                var90 = class221.field2945[var4].method371(var2, var3) - class221.field2945[var4 + 1].method371(var2, var3);
            } else {
                var90 = 1024;
            }
            class132.field1937.method1022(var6, var89, var7, arg0.field1103);
            int var91 = arg0.field1103[2];
            class132.field1937.method1022(var6, var89 - var90, var7, arg0.field1103);
            int var92 = arg0.field1103[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class175.field2389;
            int var96 = class175.field2389 + var94;
            if (var95 < var96 - 1597) {
                var95 = var96 - 1597;
            }
            var88.field4579 = var95;
            var88.field4582 = var96;
            var88.field4580 = true;
            class95.field1404.method1993(var88);
        }
        if (!arg1.field6838) {
            return;
        }
        if (arg1.field6844 != 0) {
            return;
        }
        if (var2 <= class121.field1779 && var2 > class100.field1461) {
            class491 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field6838) {
                return;
            }
        }
        if (var2 >= class121.field1779 && var2 < class86.field1188 - 1) {
            class491 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field6838) {
                return;
            }
        }
        if (var3 <= class412.field5643 && var3 > class492.field6879) {
            class491 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field6838) {
                return;
            }
        }
        if (var3 >= class412.field5643 && var3 < class66.field884 - 1) {
            class491 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field6838) {
                return;
            }
        }
        arg1.field6838 = false;
        class247.field3295--;
        class41 var101 = arg1.field6855;
        if (var101 != null && var101.field581) {
            if (class205.field2781) {
                class375.method2307(arg0, var4, var2, var3);
                class95.field1404.method1978(arg0.field1100, arg0.field1107);
            }
            class374 var102 = var101.method3(class95.field1404, (byte) 112);
            if (var102 != null) {
                var102.field5159 = var101;
                var102.field5155 = var4;
                var102.field5161 = var2;
                var102.field5158 = var3;
                class32.field488.method2767(-1830, var102);
            }
        }
        if (arg1.field6850 != 0) {
            class451 var103 = arg1.field6840;
            if (var103 != null && !class453.method2658(var5, var2, var3, var103.method51(100))) {
                if ((var103.field6135 & arg1.field6850) != 0) {
                    if (class205.field2781) {
                        class375.method2307(arg0, var4, var2, var3);
                        class95.field1404.method1978(arg0.field1100, arg0.field1107);
                    }
                    class374 var104 = var103.method3(class95.field1404, (byte) 106);
                    if (var104 != null) {
                        var104.field5159 = var103;
                        var104.field5155 = var4;
                        var104.field5161 = var2;
                        var104.field5158 = var3;
                        class32.field488.method2767(-1830, var104);
                    }
                } else if (var103.field6135 == 256) {
                    int var105 = var103.field6132 - class138.field2003;
                    int var106 = var103.field6129 - class1.field6;
                    int var107 = var103.field6127;
                    int var108;
                    if (var107 == 1 || var107 == 2) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    int var109;
                    if (var107 == 2 || var107 == 3) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    if (class205.field2781) {
                        class375.method2307(arg0, var4, var2, var3);
                        class95.field1404.method1978(arg0.field1100, arg0.field1107);
                    }
                    class451 var110 = arg1.field6849;
                    if (var109 > var108) {
                        class374 var111 = var103.method3(class95.field1404, (byte) 102);
                        if (var111 != null) {
                            var111.field5159 = var103;
                            var111.field5155 = var4;
                            var111.field5161 = var2;
                            var111.field5158 = var3;
                            class32.field488.method2767(-1830, var111);
                        }
                    } else if (var110 != null) {
                        class374 var112 = var110.method3(class95.field1404, (byte) 123);
                        if (var112 != null) {
                            var112.field5159 = var110;
                            var112.field5155 = var4;
                            var112.field5161 = var2;
                            var112.field5158 = var3;
                            class32.field488.method2767(-1830, var112);
                        }
                    }
                }
            }
            class327 var113 = arg1.field6864;
            class327 var114 = arg1.field6847;
            if (var114 != null && (var114.field4359 & arg1.field6850) != 0 && !client.method1042(var5, var2, var3, var114.field4359)) {
                if (class205.field2781) {
                    class365.method2227(arg0, var114.field4359, var4, var2, var3);
                    class95.field1404.method1978(arg0.field1100, arg0.field1107);
                }
                class374 var115 = var114.method3(class95.field1404, (byte) 106);
                if (var115 != null) {
                    var115.field5159 = var114;
                    var115.field5155 = var4;
                    var115.field5161 = var2;
                    var115.field5158 = var3;
                    class32.field488.method2767(-1830, var115);
                }
            }
            if (var113 != null && (var113.field4359 & arg1.field6850) != 0 && !client.method1042(var5, var2, var3, var113.field4359)) {
                if (class205.field2781) {
                    class365.method2227(arg0, var113.field4359, var4, var2, var3);
                    class95.field1404.method1978(arg0.field1100, arg0.field1107);
                }
                class374 var116 = var113.method3(class95.field1404, (byte) 112);
                if (var116 != null) {
                    var116.field5159 = var113;
                    var116.field5155 = var4;
                    var116.field5161 = var2;
                    var116.field5158 = var3;
                    class32.field488.method2767(-1830, var116);
                }
            }
        }
        if (var4 < class142.field2056 - 1) {
            class491 var117 = class289.field3897[var4 + 1][var2][var3];
            if (var117 != null && var117.field6838) {
                class67.field913.method1103(6, var117);
            }
        }
        if (var2 < class121.field1779) {
            class491 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field6838) {
                class67.field913.method1107(var118, 0);
            }
        }
        if (var3 < class412.field5643) {
            class491 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field6838) {
                class67.field913.method1107(var119, 0);
            }
        }
        if (var2 > class121.field1779) {
            class491 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field6838) {
                class67.field913.method1107(var120, 0);
            }
        }
        if (var3 > class412.field5643) {
            class491 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field6838) {
                class67.field913.method1107(var121, 0);
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "(Z)V", line = 1128)
    public static void method1700(boolean arg0) {
        field4078 = null;
        field4077 = null;
        field4073 = null;
        if (!arg0) {
            field4075 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "(Z)V", line = 1143)
    public static final void method1701(boolean arg0) {
        field4079++;
        class119.method746(25, (byte) 51);
        class70.method459((byte) 79);
        if (arg0) {
            System.gc();
        }
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(I)V", line = 1161)
    public class308(int arg0) {
        this.field4074 = arg0;
    }

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method961(byte arg0);

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "(B)Z")
    public abstract boolean method962(byte arg0);
}
