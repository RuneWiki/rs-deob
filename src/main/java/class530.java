import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class530 {

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    private int field7738 = 0;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "Lgu;")
    private class412 field7747;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Lhn;")
    public static class509 field7737 = new class509(103, -2);

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "Lak;")
    public static class234 field7748 = new class234("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field7741;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "Lcf;")
    private class431 field7742;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "[Ll;")
    public static class16[] field7740;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)Lcf;", line = 3)
    public final class431 method3137(int arg0) {
        if (arg0 != -11627) {
            return null;
        }
        field7745++;
        if (this.field7738 > 0 && this.field7747.field6162[this.field7738 - 1] != this.field7742) {
            class431 var2 = this.field7742;
            this.field7742 = var2.field6384;
            return var2;
        }
        while (this.field7747.field6158 > this.field7738) {
            class431 var3 = this.field7747.field6162[this.field7738++].field6384;
            if (this.field7747.field6162[this.field7738 - 1] != var3) {
                this.field7742 = var3.field6384;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V", line = 37)
    public static final void method3138(int arg0) {
        if (arg0 > -10) {
            method3142(null, null);
        }
        field7746++;
        class28 var1 = (class28) class102.field1459.method1004((byte) -86);
        boolean var2 = class116.field1752 != null || class76.field1102 > 0;
        if (var2) {
            class398.field5956 = 1;
        }
        if (class34.field392 && class101.field1456.method1045(81, (byte) 115) && class382.field5752 > 2) {
            if (var2) {
                class524.field7661 = (class295) class456.field6644.field2077.field6389.field6389;
            } else {
                class153.method1055(var1.method195((byte) 70), var1.method194(2170), 1, (class295) class456.field6644.field2077.field6389.field6389);
            }
        } else if (var2) {
            class524.field7661 = (class295) class456.field6644.field2077.field6389;
        } else {
            class153.method1055(var1.method195((byte) 58), var1.method194(2170), 1, (class295) class456.field6644.field2077.field6389);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V", line = 73)
    public static final void method3139(int arg0, int arg1) {
        field7743++;
        if (arg0 != 0) {
            method3139(-6, -115);
        }
        class460.field6698 = arg1;
        class13 var2 = class298.field4532;
        synchronized (class298.field4532) {
            class298.field4532.method93((byte) 100);
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lgu;)V", line = 1258)
    public class530(class412 arg0) {
        this.field7747 = arg0;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)I", line = 102)
    public static final int method3140(byte arg0) {
        field7739++;
        return arg0 <= 66 ? -39 : 6;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)V", line = 117)
    public static void method3141(byte arg0) {
        if (arg0 != -58) {
            field7740 = null;
        }
        field7737 = null;
        field7748 = null;
        field7740 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lcg;Lfq;)V", line = 129)
    public static final void method3142(class93 arg0, class138 arg1) {
        if (!arg1.field2103) {
            return;
        }
        short var2 = arg1.field2117;
        short var3 = arg1.field2113;
        byte var4 = arg1.field2099;
        byte var5 = arg1.field2119;
        int var6 = (var2 << class163.field2415) + class5.field63;
        int var7 = (var3 << class163.field2415) + class5.field63;
        class138[][] var8 = client.field3311[var4];
        float var9;
        if (class491.field7059 == class290.field4367) {
            class291.field4407.method342(class289.field4358[0].method412(var6, var7), class102.method811(var2, var3), class500.method2959(var2, var3), class424.method2651(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class291.field4407.method365(3000.0F, var9 * 1.5F);
        if (arg1.field2111) {
            if (class77.field1124) {
                if (var4 > 0) {
                    class138 var10 = client.field3311[var4 - 1][var2][var3];
                    if (var10 != null && var10.field2103) {
                        return;
                    }
                }
                if (var2 <= class395.field5900 && var2 > class233.field3768) {
                    class138 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field2103 && (var11.field2111 || (arg1.field2109 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class395.field5900 && var2 < class222.field3640 - 1) {
                    class138 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field2103 && (var12.field2111 || (arg1.field2109 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class284.field4314 && var3 > class313.field4715) {
                    class138 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field2103 && (var13.field2111 || (arg1.field2109 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class284.field4314 && var3 < class376.field5649 - 1) {
                    class138 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field2103 && (var14.field2111 || (arg1.field2109 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class77.field1124 = true;
            }
            arg1.field2111 = false;
            if (arg1.field2101 != null) {
                class138 var15 = arg1.field2101;
                class291.field4407.method365(3000.0F, (201.5F - (float) (var15.field2119 + 1) * 50.0F) * 1.5F);
                if (!class274.method1804(var15.field2119, var2, var3)) {
                    class491.field7059[var15.field2119].method401(var2, var3);
                }
                class312 var16 = var15.field2114;
                if (var16 != null) {
                    if (class242.field3845) {
                        if ((var16.field4692 & arg1.field2112) == 0) {
                            class175.method1170(arg0, var4, var2, var3);
                        } else {
                            class303.method1947(arg0, var16.field4692, var5, var2, var3);
                        }
                        class291.field4407.method359(arg0.field1314, arg0.field1311);
                    }
                    var16.method29(class291.field4407, 70);
                }
                for (class327 var17 = var15.field2118; var17 != null; var17 = var17.field4922) {
                    class389 var18 = var17.field4921;
                    if (var18 != null) {
                        if (class242.field3845) {
                            class175.method1170(arg0, var4, var2, var3);
                            class291.field4407.method359(arg0.field1314, arg0.field1311);
                        }
                        var18.method29(class291.field4407, 43);
                    }
                }
                class291.field4407.method365(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class274.method1804(var5, var2, var3);
            if (var19) {
                class491.field7059[var5].method401(var2, var3);
                class171 var20 = arg1.field2105;
                if (var20 != null && var20.field2545) {
                    if (var20.field2544) {
                        class291.field4407.method365(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class242.field3845) {
                        class175.method1170(arg0, var4, var2, var3);
                        class291.field4407.method359(arg0.field1314, arg0.field1311);
                    }
                    class484 var21 = var20.method29(class291.field4407, 26);
                    if (var21 != null) {
                        var21.field6960 = var20;
                        var21.field6969 = var4;
                        var21.field6966 = var2;
                        var21.field6965 = var3;
                        class515.field7496.method1957(126, var21);
                    }
                    if (var20.field2544) {
                        class291.field4407.method365(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class312 var24 = arg1.field2114;
            class168 var25 = arg1.field2115;
            if (var24 != null || var25 != null) {
                if (class395.field5900 == var2) {
                    var22++;
                } else if (class395.field5900 < var2) {
                    var22 += 2;
                }
                if (class284.field4314 == var3) {
                    var22 += 3;
                } else if (class284.field4314 > var3) {
                    var22 += 6;
                }
                var23 = class160.field2392[var22];
                arg1.field2112 = class185.field2807[var22];
            }
            if (var24 != null) {
                if ((var24.field4692 & class372.field5544[var22]) == 0) {
                    arg1.field2100 = 0;
                } else if (var24.field4692 == 16) {
                    arg1.field2100 = 3;
                    arg1.field2121 = class456.field6643[var22];
                    arg1.field2108 = (byte) (3 - arg1.field2121);
                } else if (var24.field4692 == 32) {
                    arg1.field2100 = 6;
                    arg1.field2121 = class334.field4986[var22];
                    arg1.field2108 = (byte) (6 - arg1.field2121);
                } else if (var24.field4692 == 64) {
                    arg1.field2100 = 12;
                    arg1.field2121 = class411.field6147[var22];
                    arg1.field2108 = (byte) (12 - arg1.field2121);
                } else {
                    arg1.field2100 = 9;
                    arg1.field2121 = class91.field1297[var22];
                    arg1.field2108 = (byte) (9 - arg1.field2121);
                }
                if ((var24.field4692 & var23) != 0 && !class528.method3120(var5, var2, var3, var24.field4692)) {
                    if (class242.field3845) {
                        class175.method1170(arg0, var4, var2, var3);
                        class291.field4407.method359(arg0.field1314, arg0.field1311);
                    }
                    class484 var26 = var24.method29(class291.field4407, 24);
                    if (var26 != null) {
                        var26.field6960 = var24;
                        var26.field6969 = var4;
                        var26.field6966 = var2;
                        var26.field6965 = var3;
                        class515.field7496.method1957(-40, var26);
                    }
                }
                class312 var27 = arg1.field2104;
                if (var27 != null && (var27.field4692 & var23) != 0 && !class528.method3120(var5, var2, var3, var27.field4692)) {
                    if (class242.field3845) {
                        class175.method1170(arg0, var4, var2, var3);
                        class291.field4407.method359(arg0.field1314, arg0.field1311);
                    }
                    class484 var28 = var27.method29(class291.field4407, 98);
                    if (var28 != null) {
                        var28.field6960 = var27;
                        var28.field6969 = var4;
                        var28.field6966 = var2;
                        var28.field6965 = var3;
                        class515.field7496.method1957(127, var28);
                    }
                }
            }
            if (var25 != null && !class64.method557(var5, var2, var3, var25.method1079(0))) {
                class168 var29 = arg1.field2106;
                class291.field4407.method365(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field2479 & var23) != 0) {
                    if (class242.field3845) {
                        class175.method1170(arg0, var4, var2, var3);
                        class291.field4407.method359(arg0.field1314, arg0.field1311);
                    }
                    class484 var30 = var25.method29(class291.field4407, 105);
                    if (var30 != null) {
                        var30.field6960 = var25;
                        var30.field6969 = var4;
                        var30.field6966 = var2;
                        var30.field6965 = var3;
                        class515.field7496.method1957(-2, var30);
                    }
                } else if (var25.field2479 == 256) {
                    int var31 = var25.field2481 - class62.field761;
                    int var32 = var25.field2483 - class529.field7735;
                    int var33 = var25.field2485;
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
                    if (class242.field3845) {
                        class175.method1170(arg0, var4, var2, var3);
                        class291.field4407.method359(arg0.field1314, arg0.field1311);
                    }
                    if (var35 < var34) {
                        class484 var36 = var25.method29(class291.field4407, 66);
                        if (var36 != null) {
                            var36.field6960 = var25;
                            var36.field6969 = var4;
                            var36.field6966 = var2;
                            var36.field6965 = var3;
                            class515.field7496.method1957(126, var36);
                        }
                    } else if (var29 != null) {
                        class484 var37 = var29.method29(class291.field4407, 116);
                        if (var37 != null) {
                            var37.field6960 = var29;
                            var37.field6969 = var4;
                            var37.field6966 = var2;
                            var37.field6965 = var3;
                            class515.field7496.method1957(127, var37);
                        }
                    }
                }
                class291.field4407.method365(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class171 var38 = arg1.field2105;
                if (var38 != null && !var38.field2545) {
                    if (var38.field2544) {
                        class291.field4407.method365(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class242.field3845) {
                        class175.method1170(arg0, var4, var2, var3);
                        class291.field4407.method359(arg0.field1314, arg0.field1311);
                    }
                    class484 var39 = var38.method29(class291.field4407, 30);
                    if (var39 != null) {
                        var39.field6960 = var38;
                        var39.field6969 = var4;
                        var39.field6966 = var2;
                        var39.field6965 = var3;
                        class515.field7496.method1957(127, var39);
                    }
                    if (var38.field2544) {
                        class291.field4407.method365(3000.0F, var9 * 1.5F);
                    }
                }
                class303 var40 = arg1.field2102;
                if (var40 != null && !var40.field4577) {
                    if (class242.field3845) {
                        class175.method1170(arg0, var4, var2, var3);
                        class291.field4407.method359(arg0.field1314, arg0.field1311);
                    }
                    class484 var41 = var40.method29(class291.field4407, 123);
                    if (var41 != null) {
                        var41.field6960 = var40;
                        var41.field6969 = var4;
                        var41.field6966 = var2;
                        var41.field6965 = var3;
                        class515.field7496.method1957(-9, var41);
                    }
                }
            }
            byte var42 = arg1.field2109;
            if (var42 != 0) {
                if (var2 < class395.field5900 && (var42 & 0x4) != 0) {
                    class138 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field2103) {
                        class358.field5320.method1438(true, var43);
                    }
                }
                if (var3 < class284.field4314 && (var42 & 0x2) != 0) {
                    class138 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field2103) {
                        class358.field5320.method1438(true, var44);
                    }
                }
                if (var2 > class395.field5900 && (var42 & 0x1) != 0) {
                    class138 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field2103) {
                        class358.field5320.method1438(true, var45);
                    }
                }
                if (var3 > class284.field4314 && (var42 & 0x8) != 0) {
                    class138 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field2103) {
                        class358.field5320.method1438(true, var46);
                    }
                }
            }
        }
        if (arg1.field2100 != 0) {
            boolean var47 = true;
            for (class327 var48 = arg1.field2118; var48 != null; var48 = var48.field4922) {
                if (class221.field3620 != var48.field4921.field5825 && (var48.field4920 & arg1.field2100) == arg1.field2121) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class312 var49 = arg1.field2114;
                if (!class528.method3120(var5, var2, var3, var49.field4692)) {
                    if (class242.field3845) {
                        label682: {
                            if (var49.field4692 >= 16) {
                                int var50 = var2 - class395.field5900;
                                int var51 = var3 - class284.field4314;
                                if (var49.field4692 == 16) {
                                    int var52 = var50 - class5.field63;
                                    int var53 = class5.field63 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class385.field5799) {
                                        class175.method1170(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field4692 == 32) {
                                    int var54 = class5.field63 + var50;
                                    int var55 = class5.field63 + var51;
                                    if (var55 < -var54 && var2 < class497.field7147 && var3 < class385.field5799) {
                                        class175.method1170(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field4692 == 64) {
                                    int var56 = class5.field63 + var50;
                                    int var57 = var51 - class5.field63;
                                    if (var57 > var56 && var2 < class497.field7147 && var3 > 0) {
                                        class175.method1170(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field4692 == 128) {
                                    int var58 = var50 - class5.field63;
                                    int var59 = var51 - class5.field63;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class175.method1170(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class175.method1170(arg0, var4, var2, var3);
                        }
                        class291.field4407.method359(arg0.field1314, arg0.field1311);
                    }
                    class484 var60 = var49.method29(class291.field4407, 71);
                    if (var60 != null) {
                        var60.field6960 = var49;
                        var60.field6969 = var4;
                        var60.field6966 = var2;
                        var60.field6965 = var3;
                        class515.field7496.method1957(127, var60);
                    }
                }
                arg1.field2100 = 0;
            }
        }
        if (arg1.field2107) {
            try {
                arg1.field2107 = false;
                int var61 = 0;
                label625: for (class327 var62 = arg1.field2118; var62 != null; var62 = var62.field4922) {
                    class389 var63 = var62.field4921;
                    if (class221.field3620 != var63.field5825) {
                        for (int var64 = var63.field5836; var64 <= var63.field5827; var64++) {
                            for (int var65 = var63.field5830; var65 <= var63.field5829; var65++) {
                                class138 var66 = var8[var64][var65];
                                if (var66.field2111) {
                                    arg1.field2107 = true;
                                    continue label625;
                                }
                                if (var66.field2100 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field5836) {
                                        var67++;
                                    }
                                    if (var64 < var63.field5827) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field5830) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field5829) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field2100) == arg1.field2108) {
                                        arg1.field2107 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class395.field5900 - var63.field5836;
                        int var69 = var63.field5827 - class395.field5900;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class284.field4314 - var63.field5830;
                        int var71 = var63.field5829 - class284.field4314;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field1310[var61] = var63;
                        arg0.field1309[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class389 var75 = arg0.field1310[var74];
                        if (class221.field3620 != var75.field5825) {
                            int var76 = arg0.field1309[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field5837 - class62.field761;
                                int var78 = var75.field5833 - class529.field7735;
                                int var79 = arg0.field1310[var73].field5837 - class62.field761;
                                int var80 = arg0.field1310[var73].field5833 - class529.field7735;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class389 var81 = arg0.field1310[var73];
                    var81.field5825 = class221.field3620;
                    if (!class175.method1171(var5, var81.field5836, var81.field5827, var81.field5830, var81.field5829, var81.method24(-867749273))) {
                        if (class242.field3845) {
                            if (var81.field5828 == 0) {
                                class271.method1790(arg0, var4, var81.field5836, var81.field5830, var81.field5827, var81.field5829);
                            } else {
                                class175.method1170(arg0, var4, var2, var3);
                                int var82 = var2 - class395.field5900;
                                int var83 = var3 - class284.field4314;
                                if (var81.field5828 == 2) {
                                    if (var83 > -var82) {
                                        class54.method507(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class54.method507(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class54.method507(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class54.method507(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class291.field4407.method359(arg0.field1314, arg0.field1311);
                        }
                        class484 var84 = var81.method29(class291.field4407, 59);
                        if (var84 != null) {
                            var84.field6960 = var81;
                            var84.field6969 = var4;
                            var84.field6966 = var81.field5836;
                            var84.field6965 = var81.field5830;
                            class515.field7496.method1957(127, var84);
                        }
                    }
                    for (int var85 = var81.field5836; var85 <= var81.field5827; var85++) {
                        for (int var86 = var81.field5830; var86 <= var81.field5829; var86++) {
                            class138 var87 = var8[var85][var86];
                            if (var87.field2100 != 0) {
                                class358.field5320.method1438(true, var87);
                            } else if ((var2 != var85 || var3 != var86) && var87.field2103) {
                                class358.field5320.method1438(true, var87);
                            }
                        }
                    }
                }
                if (arg1.field2107) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field2107 = false;
            }
        }
        if (arg1.field2110 != null && (byte) (class193.field3263 & 0xFF) == arg1.field2116) {
            class341 var88 = arg1.field2110;
            int var89 = class491.field7059[var4].method411(var2, var3);
            int var90;
            if (var4 < class213.field3467 - 1) {
                var90 = class491.field7059[var4].method411(var2, var3) - class491.field7059[var4 + 1].method411(var2, var3);
            } else {
                var90 = 0x8 << class163.field2415;
            }
            class348.field5152.method220(var6, var89, var7, arg0.field1315);
            int var91 = arg0.field1315[2];
            class348.field5152.method220(var6, var89 - var90, var7, arg0.field1315);
            int var92 = arg0.field1315[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class434.field6419;
            int var96 = class434.field6419 + var94;
            var88.field5072 = var95;
            var88.field5073 = var96;
            var88.field5075 = true;
            class291.field4407.method368(var88);
        }
        if (!arg1.field2103) {
            return;
        }
        if (arg1.field2100 != 0) {
            return;
        }
        if (var2 <= class395.field5900 && var2 > class233.field3768) {
            class138 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field2103) {
                return;
            }
        }
        if (var2 >= class395.field5900 && var2 < class222.field3640 - 1) {
            class138 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field2103) {
                return;
            }
        }
        if (var3 <= class284.field4314 && var3 > class313.field4715) {
            class138 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field2103) {
                return;
            }
        }
        if (var3 >= class284.field4314 && var3 < class376.field5649 - 1) {
            class138 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field2103) {
                return;
            }
        }
        arg1.field2103 = false;
        class180.field2707--;
        class303 var101 = arg1.field2102;
        if (var101 != null && var101.field4577) {
            if (class242.field3845) {
                class175.method1170(arg0, var4, var2, var3);
                class291.field4407.method359(arg0.field1314, arg0.field1311);
            }
            class484 var102 = var101.method29(class291.field4407, 114);
            if (var102 != null) {
                var102.field6960 = var101;
                var102.field6969 = var4;
                var102.field6966 = var2;
                var102.field6965 = var3;
                class515.field7496.method1957(127, var102);
            }
        }
        if (arg1.field2112 != 0) {
            class168 var103 = arg1.field2115;
            if (var103 != null && !class64.method557(var5, var2, var3, var103.method1079(0))) {
                if ((var103.field2479 & arg1.field2112) != 0) {
                    if (class242.field3845) {
                        class175.method1170(arg0, var4, var2, var3);
                        class291.field4407.method359(arg0.field1314, arg0.field1311);
                    }
                    class484 var104 = var103.method29(class291.field4407, 76);
                    if (var104 != null) {
                        var104.field6960 = var103;
                        var104.field6969 = var4;
                        var104.field6966 = var2;
                        var104.field6965 = var3;
                        class515.field7496.method1957(20, var104);
                    }
                } else if (var103.field2479 == 256) {
                    int var105 = var103.field2481 - class62.field761;
                    int var106 = var103.field2483 - class529.field7735;
                    int var107 = var103.field2485;
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
                    if (class242.field3845) {
                        class175.method1170(arg0, var4, var2, var3);
                        class291.field4407.method359(arg0.field1314, arg0.field1311);
                    }
                    class168 var110 = arg1.field2106;
                    if (var109 > var108) {
                        class484 var111 = var103.method29(class291.field4407, 23);
                        if (var111 != null) {
                            var111.field6960 = var103;
                            var111.field6969 = var4;
                            var111.field6966 = var2;
                            var111.field6965 = var3;
                            class515.field7496.method1957(127, var111);
                        }
                    } else if (var110 != null) {
                        class484 var112 = var110.method29(class291.field4407, 107);
                        if (var112 != null) {
                            var112.field6960 = var110;
                            var112.field6969 = var4;
                            var112.field6966 = var2;
                            var112.field6965 = var3;
                            class515.field7496.method1957(126, var112);
                        }
                    }
                }
            }
            class312 var113 = arg1.field2114;
            class312 var114 = arg1.field2104;
            if (var114 != null && (var114.field4692 & arg1.field2112) != 0 && !class528.method3120(var5, var2, var3, var114.field4692)) {
                if (class242.field3845) {
                    class303.method1947(arg0, var114.field4692, var4, var2, var3);
                    class291.field4407.method359(arg0.field1314, arg0.field1311);
                }
                class484 var115 = var114.method29(class291.field4407, 36);
                if (var115 != null) {
                    var115.field6960 = var114;
                    var115.field6969 = var4;
                    var115.field6966 = var2;
                    var115.field6965 = var3;
                    class515.field7496.method1957(-67, var115);
                }
            }
            if (var113 != null && (var113.field4692 & arg1.field2112) != 0 && !class528.method3120(var5, var2, var3, var113.field4692)) {
                if (class242.field3845) {
                    class303.method1947(arg0, var113.field4692, var4, var2, var3);
                    class291.field4407.method359(arg0.field1314, arg0.field1311);
                }
                class484 var116 = var113.method29(class291.field4407, 25);
                if (var116 != null) {
                    var116.field6960 = var113;
                    var116.field6969 = var4;
                    var116.field6966 = var2;
                    var116.field6965 = var3;
                    class515.field7496.method1957(126, var116);
                }
            }
        }
        if (var4 < class213.field3467 - 1) {
            class138 var117 = client.field3311[var4 + 1][var2][var3];
            if (var117 != null && var117.field2103) {
                class358.field5320.method1437((byte) -108, var117);
            }
        }
        if (var2 < class395.field5900) {
            class138 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field2103) {
                class358.field5320.method1438(true, var118);
            }
        }
        if (var3 < class284.field4314) {
            class138 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field2103) {
                class358.field5320.method1438(true, var119);
            }
        }
        if (var2 > class395.field5900) {
            class138 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field2103) {
                class358.field5320.method1438(true, var120);
            }
        }
        if (var3 > class284.field4314) {
            class138 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field2103) {
                class358.field5320.method1438(true, var121);
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)Lcf;", line = 1247)
    public final class431 method3143(boolean arg0) {
        this.field7738 = 0;
        field7744++;
        if (!arg0) {
            method3138(68);
        }
        return this.method3137(-11627);
    }
}
