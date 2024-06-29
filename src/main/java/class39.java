import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class39 extends class105 {

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "I")
    private final int field685;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    private final int field683;

    @OriginalMember(owner = "client!al", name = "S", descriptor = "I")
    private final int field687;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "I")
    private int field684;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "Lhi;")
    public static class82 field679 = class95.method664((byte) -29, "Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3");

    @OriginalMember(owner = "client!al", name = "E", descriptor = "I")
    public static int field673 = 0;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "Lhi;")
    public static class82 field678 = class95.method664((byte) -120, "Chargement des textures )2 ");

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    private int field669;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "I")
    private int field670;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "I")
    private int field676;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "I")
    private int field680;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!al", name = "R", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "[B")
    private byte[] field674;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lrk;Z)V", line = 10)
    public static final void method303(class16 arg0, boolean arg1) {
        class194.field3287.method1940((byte) 59, arg0);
        while (true) {
            class16 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class16[][] var7;
            class16 var118;
            do {
                class16 var117;
                do {
                    class16 var116;
                    do {
                        class16 var115;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class16) class194.field3287.method1932(-1);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field160);
                                            var3 = var2.field153;
                                            var4 = var2.field152;
                                            var5 = var2.field163;
                                            var6 = var2.field159;
                                            var7 = class15.field120[var5];
                                            float var8 = 0.0F;
                                            if (class147.field2485) {
                                                if (class245.field4255 == class150.field2560) {
                                                    int var9 = class283.field4746[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class130.field2255 != var10) {
                                                        class130.field2255 = var10;
                                                        client.method859(var10, (byte) 47);
                                                        class85.method595(class51.method361(-54));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class230.field3975 != var11) {
                                                        class230.field3975 = var11;
                                                        class253.method1818(var11, 9043);
                                                    }
                                                    int var12 = class180.field3073[0][var3 + 1][var4] + class180.field3073[0][var3][var4] + class180.field3073[0][var3][var4 + 1] + class180.field3073[0][var3 + 1][var4 + 1] >> 2;
                                                    class171.method1211(3, -var12, false);
                                                    var8 = 201.5F;
                                                    class147.method1020(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class147.method1020(var8);
                                                }
                                            }
                                            if (!var2.field169) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class16 var13 = class15.field120[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field160) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class137.field2363 && var3 > class87.field1546) {
                                                    class16 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field160 && (var14.field169 || (var2.field155 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class137.field2363 && var3 < class247.field4275 - 1) {
                                                    class16 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field160 && (var15.field169 || (var2.field155 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class325.field5585 && var4 > class126.field2218) {
                                                    class16 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field160 && (var16.field169 || (var2.field155 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class325.field5585 && var4 < class203.field3520 - 1) {
                                                    class16 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field160 && (var17.field169 || (var2.field155 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field169 = false;
                                            if (var2.field170 != null) {
                                                class16 var18 = var2.field170;
                                                if (class147.field2485) {
                                                    class147.method1020(201.5F - (float) (var18.field159 + 1) * 50.0F);
                                                }
                                                if (var18.field166 == null) {
                                                    if (var18.field157 != null) {
                                                        if (class305.method2107(0, var3, var4)) {
                                                            class84.method584(var18.field157, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var3, var4, true);
                                                        } else {
                                                            class84.method584(var18.field157, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class305.method2107(0, var3, var4)) {
                                                    class138.method940(var18.field166, 0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var3, var4, true);
                                                } else {
                                                    class138.method940(var18.field166, 0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var3, var4, false);
                                                }
                                                class90 var19 = var18.field171;
                                                if (var19 != null) {
                                                    if (class147.field2485) {
                                                        if ((var19.field1629 & var2.field156) == 0) {
                                                            class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3, var4);
                                                        } else {
                                                            class2.method6(var19.field1629, class129.field2252, class191.field3210, class37.field621, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field1626.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var19.field1620 - class129.field2252, var19.field1619 - class191.field3210, var19.field1621 - class37.field621, var19.field1622, var5, (class295) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field165; var20++) {
                                                    class69 var21 = var18.field158[var20];
                                                    if (var21 != null) {
                                                        if (class147.field2485) {
                                                            class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3, var4);
                                                        }
                                                        var21.field1075.method209(var21.field1074, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var21.field1067 - class129.field2252, var21.field1078 - class191.field3210, var21.field1072 - class37.field621, var21.field1064, var5, (class295) null);
                                                    }
                                                }
                                                if (class147.field2485) {
                                                    class147.method1020(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field166 == null) {
                                                if (var2.field157 != null) {
                                                    if (class305.method2107(var6, var3, var4)) {
                                                        class84.method584(var2.field157, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class84.method584(var2.field157, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var3, var4, false);
                                                    }
                                                }
                                            } else if (class305.method2107(var6, var3, var4)) {
                                                class138.method940(var2.field166, var6, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field166.field1564 != 12345678 || class257.field4414 && var5 <= class149.field2536) {
                                                    class138.method940(var2.field166, var6, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class123 var23 = var2.field161;
                                                if (var23 != null && (var23.field2153 & 0x80000000L) != 0L) {
                                                    if (class147.field2485 && var23.field2142) {
                                                        class147.method1020(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class147.field2485) {
                                                        class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3, var4);
                                                    }
                                                    var23.field2150.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var23.field2158 - class129.field2252, var23.field2151 - class191.field3210, var23.field2148 - class37.field621, var23.field2153, var5, (class295) null);
                                                    if (class147.field2485 && var23.field2142) {
                                                        class147.method1020(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class90 var26 = var2.field171;
                                            class182 var27 = var2.field172;
                                            if (var26 != null || var27 != null) {
                                                if (class137.field2363 == var3) {
                                                    var24++;
                                                } else if (class137.field2363 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class325.field5585 == var4) {
                                                    var24 += 3;
                                                } else if (class325.field5585 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = client.field2197[var24];
                                                var2.field156 = class325.field5581[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field1629 & class64.field1011[var24]) == 0) {
                                                    var2.field151 = 0;
                                                } else if (var26.field1629 == 16) {
                                                    var2.field151 = 3;
                                                    var2.field168 = class195.field3307[var24];
                                                    var2.field154 = 3 - var2.field168;
                                                } else if (var26.field1629 == 32) {
                                                    var2.field151 = 6;
                                                    var2.field168 = class67.field1047[var24];
                                                    var2.field154 = 6 - var2.field168;
                                                } else if (var26.field1629 == 64) {
                                                    var2.field151 = 12;
                                                    var2.field168 = class177.field3045[var24];
                                                    var2.field154 = 12 - var2.field168;
                                                } else {
                                                    var2.field151 = 9;
                                                    var2.field168 = class285.field4781[var24];
                                                    var2.field154 = 9 - var2.field168;
                                                }
                                                if ((var26.field1629 & var25) != 0 && !class105.method720(var6, var3, var4, var26.field1629)) {
                                                    if (class147.field2485) {
                                                        class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3, var4);
                                                    }
                                                    var26.field1626.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var26.field1620 - class129.field2252, var26.field1619 - class191.field3210, var26.field1621 - class37.field621, var26.field1622, var5, (class295) null);
                                                }
                                                if ((var26.field1624 & var25) != 0 && !class105.method720(var6, var3, var4, var26.field1624)) {
                                                    if (class147.field2485) {
                                                        class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3, var4);
                                                    }
                                                    var26.field1617.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var26.field1620 - class129.field2252, var26.field1619 - class191.field3210, var26.field1621 - class37.field621, var26.field1622, var5, (class295) null);
                                                }
                                            }
                                            if (var27 != null && !class297.method2056(var6, var3, var4, var27.field3103.method238())) {
                                                if (class147.field2485) {
                                                    class147.method1020(var8 - 0.5F);
                                                }
                                                if ((var27.field3111 & var25) != 0) {
                                                    if (class147.field2485) {
                                                        class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3, var4);
                                                    }
                                                    var27.field3103.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var27.field3119 + var27.field3116 - class129.field2252, var27.field3102 - class191.field3210, var27.field3109 + var27.field3118 - class37.field621, var27.field3106, var5, (class295) null);
                                                } else if (var27.field3111 == 256) {
                                                    int var28 = var27.field3119 - class129.field2252;
                                                    int var29 = var27.field3102 - class191.field3210;
                                                    int var30 = var27.field3109 - class37.field621;
                                                    int var31 = var27.field3105;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class147.field2485) {
                                                            class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3, var4);
                                                        }
                                                        var27.field3103.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var27.field3116 + var28, var29, var27.field3118 + var30, var27.field3106, var5, (class295) null);
                                                    } else if (var27.field3107 != null) {
                                                        if (class147.field2485) {
                                                            class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3, var4);
                                                        }
                                                        var27.field3107.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var28, var29, var30, var27.field3106, var5, (class295) null);
                                                    }
                                                }
                                                if (class147.field2485) {
                                                    class147.method1020(var8);
                                                }
                                            }
                                            if (var22) {
                                                class123 var34 = var2.field161;
                                                if (var34 != null && (var34.field2153 & 0x80000000L) == 0L) {
                                                    if (class147.field2485 && var34.field2142) {
                                                        class147.method1020(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class147.field2485) {
                                                        class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3, var4);
                                                    }
                                                    var34.field2150.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var34.field2158 - class129.field2252, var34.field2151 - class191.field3210, var34.field2148 - class37.field621, var34.field2153, var5, (class295) null);
                                                    if (class147.field2485 && var34.field2142) {
                                                        class147.method1020(var8);
                                                    }
                                                }
                                                class72 var35 = var2.field164;
                                                if (var35 != null && var35.field1099 == 0) {
                                                    if (class147.field2485) {
                                                        class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3, var4);
                                                    }
                                                    if (var35.field1104 != null) {
                                                        var35.field1104.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var35.field1102 - class129.field2252, var35.field1110 - class191.field3210, var35.field1101 - class37.field621, var35.field1107, var5, (class295) null);
                                                    }
                                                    if (var35.field1100 != null) {
                                                        var35.field1100.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var35.field1102 - class129.field2252, var35.field1110 - class191.field3210, var35.field1101 - class37.field621, var35.field1107, var5, (class295) null);
                                                    }
                                                    if (var35.field1105 != null) {
                                                        var35.field1105.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var35.field1102 - class129.field2252, var35.field1110 - class191.field3210, var35.field1101 - class37.field621, var35.field1107, var5, (class295) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field155;
                                            if (var36 != 0) {
                                                if (var3 < class137.field2363 && (var36 & 0x4) != 0) {
                                                    class16 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field160) {
                                                        class194.field3287.method1940((byte) -91, var37);
                                                    }
                                                }
                                                if (var4 < class325.field5585 && (var36 & 0x2) != 0) {
                                                    class16 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field160) {
                                                        class194.field3287.method1940((byte) 86, var38);
                                                    }
                                                }
                                                if (var3 > class137.field2363 && (var36 & 0x1) != 0) {
                                                    class16 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field160) {
                                                        class194.field3287.method1940((byte) 31, var39);
                                                    }
                                                }
                                                if (var4 > class325.field5585 && (var36 & 0x8) != 0) {
                                                    class16 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field160) {
                                                        class194.field3287.method1940((byte) -101, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field151 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field165; var42++) {
                                                if (class14.field109 != var2.field158[var42].field1079 && (var2.field174[var42] & var2.field151) == var2.field168) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class90 var43 = var2.field171;
                                                if (!class105.method720(var6, var3, var4, var43.field1629)) {
                                                    if (class147.field2485) {
                                                        label1026: {
                                                            if ((var43.field1622 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field1620 - class129.field2252;
                                                                int var45 = var43.field1621 - class37.field621;
                                                                int var46 = (int) (var43.field1622 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class38.field658 - 1) {
                                                                        class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3 - 1, var4 + 1);
                                                                        break label1026;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class89.field1605 - 1 && var4 < class38.field658 - 1) {
                                                                        class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3 + 1, var4 + 1);
                                                                        break label1026;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class89.field1605 - 1 && var4 > 0) {
                                                                        class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3 + 1, var4 - 1);
                                                                        break label1026;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3 - 1, var4 - 1);
                                                                        break label1026;
                                                                    }
                                                                }
                                                            }
                                                            class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field1626.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var43.field1620 - class129.field2252, var43.field1619 - class191.field3210, var43.field1621 - class37.field621, var43.field1622, var5, (class295) null);
                                                }
                                                var2.field151 = 0;
                                            }
                                        }
                                        if (!var2.field162) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field165;
                                            var2.field162 = false;
                                            int var48 = 0;
                                            label832: for (int var49 = 0; var49 < var47; var49++) {
                                                class69 var50 = var2.field158[var49];
                                                if (class14.field109 != var50.field1079) {
                                                    for (int var51 = var50.field1076; var51 <= var50.field1068; var51++) {
                                                        for (int var52 = var50.field1080; var52 <= var50.field1083; var52++) {
                                                            class16 var53 = var7[var51][var52];
                                                            if (var53.field169) {
                                                                var2.field162 = true;
                                                                continue label832;
                                                            }
                                                            if (var53.field151 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field1076) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field1068) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field1080) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field1083) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field151) == var2.field154) {
                                                                    var2.field162 = true;
                                                                    continue label832;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class226.field3907[var48++] = var50;
                                                    int var55 = class137.field2363 - var50.field1076;
                                                    int var56 = var50.field1068 - class137.field2363;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class325.field5585 - var50.field1080;
                                                    int var58 = var50.field1083 - class325.field5585;
                                                    if (var58 > var57) {
                                                        var50.field1082 = var55 + var58;
                                                    } else {
                                                        var50.field1082 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class69 var62 = class226.field3907[var61];
                                                    if (class14.field109 != var62.field1079) {
                                                        if (var62.field1082 > var59) {
                                                            var59 = var62.field1082;
                                                            var60 = var61;
                                                        } else if (var62.field1082 == var59) {
                                                            int var63 = var62.field1067 - class129.field2252;
                                                            int var64 = var62.field1072 - class37.field621;
                                                            int var65 = class226.field3907[var60].field1067 - class129.field2252;
                                                            int var66 = class226.field3907[var60].field1072 - class37.field621;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class69 var67 = class226.field3907[var60];
                                                var67.field1079 = class14.field109;
                                                if (!class209.method1498(var6, var67.field1076, var67.field1068, var67.field1080, var67.field1083, var67.field1075.method238())) {
                                                    if (class147.field2485) {
                                                        if ((var67.field1064 & 0xFC000L) == 147456L) {
                                                            class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3, var4);
                                                            int var68 = var67.field1067 - class129.field2252;
                                                            int var69 = var67.field1072 - class37.field621;
                                                            int var70 = (int) (var67.field1064 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class2.method17(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class2.method17(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class2.method17(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class2.method17(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class2.method13(class129.field2252, class191.field3210, class37.field621, var5, var67.field1076, var67.field1080, var67.field1068, var67.field1083);
                                                        }
                                                    }
                                                    var67.field1075.method209(var67.field1074, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var67.field1067 - class129.field2252, var67.field1078 - class191.field3210, var67.field1072 - class37.field621, var67.field1064, var5, (class295) null);
                                                }
                                                for (int var71 = var67.field1076; var71 <= var67.field1068; var71++) {
                                                    for (int var72 = var67.field1080; var72 <= var67.field1083; var72++) {
                                                        class16 var73 = var7[var71][var72];
                                                        if (var73.field151 != 0) {
                                                            class194.field3287.method1940((byte) 83, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field160) {
                                                            class194.field3287.method1940((byte) 78, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field162) {
                                                break;
                                            }
                                        } catch (Exception var133) {
                                            var2.field162 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field150 != null) {
                                        if (class147.field2485) {
                                            GL var75 = class147.field2479;
                                            class295.method2041(class129.field2252, class191.field3210, class37.field621);
                                            int var76 = var2.field153 * 128 + 64 - class129.field2252;
                                            int var77 = class245.field4255[var5][var2.field153][var2.field152] - class191.field3210;
                                            int var78 = var2.field152 * 128 + 64 - class37.field621;
                                            int var79;
                                            if (var5 < 3) {
                                                var79 = class245.field4255[var5][var2.field153][var2.field152] - class245.field4255[var5 + 1][var2.field153][var2.field152];
                                            } else {
                                                var79 = 1024;
                                            }
                                            int var80 = class199.field3422 * var78 - class123.field2143 * var76 >> 16;
                                            int var81 = class311.field5312 * var80 + class280.field4712 * var77 >> 16;
                                            int var82 = (class311.field5312 * 92 + class280.field4712 * 0 >> 16) + var81;
                                            int var83 = (class311.field5312 * -92 - class280.field4712 * var79 >> 16) + var81;
                                            int var84 = var82 + 2 - var83;
                                            class103 var85 = null;
                                            class306 var86 = null;
                                            int var87 = -1;
                                            class103 var88 = (class103) var2.field150.method1833((byte) -17);
                                            while (true) {
                                                label1042: {
                                                    if (var88 != null) {
                                                        if (var88.field1824 == null || var88.field1824.field5206.field4943) {
                                                            var88.method1339(0);
                                                            break label1042;
                                                        }
                                                        if ((byte) ((int) (var88.field1824.field5206.field4940 & 0xFFL)) != var2.field167) {
                                                            var2.field150 = null;
                                                            break;
                                                        }
                                                        if (var85 == null) {
                                                            var85 = var88;
                                                            var86 = var88.field1824;
                                                            var87 = var86.field5195.field5033;
                                                            break label1042;
                                                        }
                                                    }
                                                    if (var85 != null && (var88 == null || var88.field1824 != var86 || var88.field1824.field5195.field5033 != var87)) {
                                                        for (int var89 = 0; var89 < var84; var89++) {
                                                            class295.field4960[var89] = 0;
                                                        }
                                                        for (int var90 = 0; var90 < 32; var90++) {
                                                            class295.field4957[var90] = 0;
                                                        }
                                                        class295.field4959 = 0;
                                                        for (class103 var91 = var85; var91 != var88; var91 = (class103) var91.field178) {
                                                            if (var91.field1824 != null) {
                                                                int var92 = (var91.field1831 >> 12) - class129.field2252;
                                                                int var93 = (var91.field1830 >> 12) - class191.field3210;
                                                                int var94 = (var91.field1833 >> 12) - class37.field621;
                                                                int var95 = class199.field3422 * var94 - class123.field2143 * var92 >> 16;
                                                                int var96 = (class311.field5312 * var95 + class280.field4712 * var93 >> 16) - var83;
                                                                if (class295.field4960[var96] < 32) {
                                                                    class295.field4955[var96][class295.field4960[var96]++] = var91.field1825;
                                                                } else {
                                                                    if (class295.field4960[var96] == 32) {
                                                                        if (class295.field4959 == 32) {
                                                                            if (class295.field4944) {
                                                                                System.out.println("Overflowed world-based radix sort");
                                                                            }
                                                                            break;
                                                                        }
                                                                        class295.field4960[var96] += class295.field4959++ + 1;
                                                                    }
                                                                    int var97 = class295.field4957[class295.field4960[var96] - 32 - 1];
                                                                    if (var97 < 768) {
                                                                        short[] var10000 = class295.field4966[class295.field4960[var96] - 32 - 1];
                                                                        int var10002 = class295.field4960[var96] - 32 - 1;
                                                                        int var10004 = class295.field4957[class295.field4960[var96] - 32 - 1];
                                                                        class295.field4957[var10002] = class295.field4957[class295.field4960[var96] - 32 - 1] + 1;
                                                                        var10000[var10004] = var91.field1825;
                                                                    }
                                                                }
                                                            }
                                                            if (var2.field150.field4401 == var91.field178) {
                                                                break;
                                                            }
                                                        }
                                                        boolean var98 = false;
                                                        if (class295.field4950 && var86.field5195.field4980 != -1) {
                                                            class102.field1821.method621(128, var86.field5195.field4980);
                                                            var98 = true;
                                                        } else {
                                                            class147.method1002(-1);
                                                        }
                                                        var75.glPointSize((float) var87);
                                                        var86.field5206.method2030(var75, var84, var98, var86.field5195.field5028);
                                                        if (var88 != null) {
                                                            var85 = var88;
                                                            var86 = var88.field1824;
                                                            var87 = var88.field1824.field5195.field5033;
                                                        }
                                                    }
                                                    if (var88 == null) {
                                                        break;
                                                    }
                                                }
                                                var88 = (class103) var2.field150.method1836(-125);
                                            }
                                            class295.method2023();
                                        } else {
                                            int var99 = class295.field4949 + class102.field1817;
                                            int var100 = class295.field4939 + class102.field1811;
                                            class17 var101 = var2.field150.field4401;
                                            for (class17 var102 = var101.field178; var102 != var101; var102 = var102.field178) {
                                                class103 var103 = (class103) var102;
                                                if (var103.field1824 != null && !var103.field1824.field5206.field4943) {
                                                    if ((byte) ((int) (var103.field1824.field5206.field4940 & 0xFFL)) != var2.field167) {
                                                        var2.field150 = null;
                                                        break;
                                                    }
                                                    int var104 = (var103.field1831 >> 12) - class129.field2252;
                                                    int var105 = (var103.field1830 >> 12) - class191.field3210;
                                                    int var106 = (var103.field1833 >> 12) - class37.field621;
                                                    int var107 = class199.field3422 * var104 + class123.field2143 * var106 >> 16;
                                                    int var108 = class199.field3422 * var106 - class123.field2143 * var104 >> 16;
                                                    int var110 = class311.field5312 * var105 - class280.field4712 * var108 >> 16;
                                                    int var111 = class311.field5312 * var108 + class280.field4712 * var105 >> 16;
                                                    if (var111 >= 50) {
                                                        int var113 = (var107 << 9) / var111 + var99;
                                                        int var114 = (var110 << 9) / var111 + var100;
                                                        class320.method2202(var113, var114, var103.field1824.field5195.field5033 >> 2, var103.field1828, var103.field1828 >> 24 & 0xFF);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field160);
                            } while (var2.field151 != 0);
                            if (var3 > class137.field2363 || var3 <= class87.field1546) {
                                break;
                            }
                            var115 = var7[var3 - 1][var4];
                        } while (var115 != null && var115.field160);
                        if (var3 < class137.field2363 || var3 >= class247.field4275 - 1) {
                            break;
                        }
                        var116 = var7[var3 + 1][var4];
                    } while (var116 != null && var116.field160);
                    if (var4 > class325.field5585 || var4 <= class126.field2218) {
                        break;
                    }
                    var117 = var7[var3][var4 - 1];
                } while (var117 != null && var117.field160);
                if (var4 < class325.field5585 || var4 >= class203.field3520 - 1) {
                    break;
                }
                var118 = var7[var3][var4 + 1];
            } while (var118 != null && var118.field160);
            var2.field160 = false;
            class290.field4874--;
            class72 var119 = var2.field164;
            if (var119 != null && var119.field1099 != 0) {
                if (class147.field2485) {
                    class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3, var4);
                }
                if (var119.field1104 != null) {
                    var119.field1104.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var119.field1102 - class129.field2252, var119.field1110 - class191.field3210 - var119.field1099, var119.field1101 - class37.field621, var119.field1107, var5, (class295) null);
                }
                if (var119.field1100 != null) {
                    var119.field1100.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var119.field1102 - class129.field2252, var119.field1110 - class191.field3210 - var119.field1099, var119.field1101 - class37.field621, var119.field1107, var5, (class295) null);
                }
                if (var119.field1105 != null) {
                    var119.field1105.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var119.field1102 - class129.field2252, var119.field1110 - class191.field3210 - var119.field1099, var119.field1101 - class37.field621, var119.field1107, var5, (class295) null);
                }
            }
            if (var2.field156 != 0) {
                class182 var120 = var2.field172;
                if (var120 != null && !class297.method2056(var6, var3, var4, var120.field3103.method238())) {
                    if ((var120.field3111 & var2.field156) != 0) {
                        if (class147.field2485) {
                            class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3, var4);
                        }
                        var120.field3103.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var120.field3119 + var120.field3116 - class129.field2252, var120.field3102 - class191.field3210, var120.field3109 + var120.field3118 - class37.field621, var120.field3106, var5, (class295) null);
                    } else if (var120.field3111 == 256) {
                        int var121 = var120.field3119 - class129.field2252;
                        int var122 = var120.field3102 - class191.field3210;
                        int var123 = var120.field3109 - class37.field621;
                        int var124 = var120.field3105;
                        int var125;
                        if (var124 == 1 || var124 == 2) {
                            var125 = -var121;
                        } else {
                            var125 = var121;
                        }
                        int var126;
                        if (var124 == 2 || var124 == 3) {
                            var126 = -var123;
                        } else {
                            var126 = var123;
                        }
                        if (var126 >= var125) {
                            if (class147.field2485) {
                                class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3, var4);
                            }
                            var120.field3103.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var120.field3116 + var121, var122, var120.field3118 + var123, var120.field3106, var5, (class295) null);
                        } else if (var120.field3107 != null) {
                            if (class147.field2485) {
                                class2.method18(class129.field2252, class191.field3210, class37.field621, var5, var3, var4);
                            }
                            var120.field3107.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var121, var122, var123, var120.field3106, var5, (class295) null);
                        }
                    }
                }
                class90 var127 = var2.field171;
                if (var127 != null) {
                    if ((var127.field1624 & var2.field156) != 0 && !class105.method720(var6, var3, var4, var127.field1624)) {
                        if (class147.field2485) {
                            class2.method6(var127.field1624, class129.field2252, class191.field3210, class37.field621, var6, var3, var4);
                        }
                        var127.field1617.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var127.field1620 - class129.field2252, var127.field1619 - class191.field3210, var127.field1621 - class37.field621, var127.field1622, var5, (class295) null);
                    }
                    if ((var127.field1629 & var2.field156) != 0 && !class105.method720(var6, var3, var4, var127.field1629)) {
                        if (class147.field2485) {
                            class2.method6(var127.field1629, class129.field2252, class191.field3210, class37.field621, var6, var3, var4);
                        }
                        var127.field1626.method209(0, class280.field4712, class311.field5312, class123.field2143, class199.field3422, var127.field1620 - class129.field2252, var127.field1619 - class191.field3210, var127.field1621 - class37.field621, var127.field1622, var5, (class295) null);
                    }
                }
            }
            if (var5 < class62.field974 - 1) {
                class16 var128 = class15.field120[var5 + 1][var3][var4];
                if (var128 != null && var128.field160) {
                    class194.field3287.method1940((byte) -98, var128);
                }
            }
            if (var3 < class137.field2363) {
                class16 var129 = var7[var3 + 1][var4];
                if (var129 != null && var129.field160) {
                    class194.field3287.method1940((byte) 44, var129);
                }
            }
            if (var4 < class325.field5585) {
                class16 var130 = var7[var3][var4 + 1];
                if (var130 != null && var130.field160) {
                    class194.field3287.method1940((byte) -112, var130);
                }
            }
            if (var3 > class137.field2363) {
                class16 var131 = var7[var3 - 1][var4];
                if (var131 != null && var131.field160) {
                    class194.field3287.method1940((byte) 27, var131);
                }
            }
            if (var4 > class325.field5585) {
                class16 var132 = var7[var3][var4 - 1];
                if (var132 != null && var132.field160) {
                    class194.field3287.method1940((byte) 53, var132);
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)V", line = 1222)
    public static void method304(int arg0) {
        if (arg0 != 64) {
            field673 = -49;
        }
        field679 = null;
        field678 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIII)V", line = 1240)
    public static final void method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field681++;
        if (arg0 == arg5) {
            class315.method2160(arg5, arg3, arg2, -122, arg1);
            return;
        }
        if (class200.field3443 <= arg3 - arg5 && class207.field3623 >= (arg3 + arg5) && class60.field931 <= (arg2 - arg0) && class29.field399 >= (arg0 + arg2)) {
            class31.method248(arg0, arg3, arg2, arg1, arg5, false);
        } else {
            class309.method2130(arg0, arg5, -111, arg2, arg1, arg3);
        }
        if (arg4 != 16) {
            field678 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(B)V", line = 1264)
    public static final void method306(byte arg0) {
        field672++;
        for (int var1 = 0; var1 < 5; var1++) {
            class166.field2910[var1] = false;
        }
        if (arg0 != -90) {
            method304(73);
        }
        class28.field369 = -1;
        class273.field4602 = 1;
        class224.field3895 = -1;
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)Lve;", line = 1293)
    public static final class212 method307(int arg0) {
        if (arg0 != 0) {
            field679 = (class82) null;
        }
        field668++;
        class212 var1;
        if (class147.field2485) {
            var1 = new class225(class285.field4793, class28.field381, class86.field1536[0], class20.field262[0], class107.field1897[0], class42.field747[0], class260.field4453[0], class142.field2427);
        } else {
            var1 = new class186(class285.field4793, class28.field381, class86.field1536[0], class20.field262[0], class107.field1897[0], class42.field747[0], class260.field4453[0], class142.field2427);
        }
        class3.method23(286013516);
        return var1;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 1311)
    public final void method85(int arg0) {
        this.field680 = 0;
        field667++;
        if (arg0 != 4631) {
            this.method85(-4);
        }
        this.field676 = 0;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(III)Lmb;", line = 1323)
    public static final class109 method308(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method307(-24);
        }
        field682++;
        for (class109 var3 = (class109) class42.field741.method1936(arg0 + 16173); var3 != null; var3 = (class109) class42.field741.method1926((byte) 90)) {
            if (var3.field1956 && var3.method745((byte) 16, arg2, arg1)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIIFFF)V", line = 1351)
    public class39(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field685 = (int) (arg6 * 4096.0F);
        this.field683 = (int) (arg7 * 4096.0F);
        this.field684 = this.field687 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)V", line = 1363)
    public void method309(int arg0, byte arg1) {
        field677++;
        this.field674[arg0] = arg1;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IBI)V", line = 1379)
    public final void method87(int arg0, byte arg1, int arg2) {
        field671++;
        if (arg1 != -109) {
            return;
        }
        if (arg0 == 0) {
            this.field670 = this.field685 - (arg2 < 0 ? -arg2 : arg2);
            this.field669 = 4096;
            this.field670 = this.field670 * this.field670 >> 12;
            this.field676 = this.field670;
            return;
        }
        this.field669 = this.field683 * this.field670 >> 12;
        this.field670 = this.field685 - (arg2 < 0 ? -arg2 : arg2);
        this.field670 = this.field670 * this.field670 >> 12;
        if (this.field669 < 0) {
            this.field669 = 0;
        } else if (this.field669 > 4096) {
            this.field669 = 4096;
        }
        this.field670 = this.field670 * this.field669 >> 12;
        this.field676 += this.field684 * this.field670 >> 12;
        this.field684 = this.field687 * this.field684 >> 12;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V", line = 1428)
    public final void method89(int arg0) {
        this.field684 = this.field687;
        this.field676 >>= 0x4;
        field675++;
        if (this.field676 < 0) {
            this.field676 = 0;
        } else if (this.field676 > 255) {
            this.field676 = 255;
        }
        this.method309(this.field680++, (byte) this.field676);
        this.field676 = 0;
        if (arg0 >= -32) {
            field678 = (class82) null;
        }
    }
}
