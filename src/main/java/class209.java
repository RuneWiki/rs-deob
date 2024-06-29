import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class209 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3290 = null;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field3293 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Z")
    public static boolean field3295 = false;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3292 = "yellow:";

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field3297 = 0;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 12)
    public static final void method1487(int arg0) {
        field3289++;
        int var1 = class253.field3776;
        int var2 = class327.field5074;
        int var3 = class143.field2208;
        int var4 = class62.field936;
        if (class76.field1072 == null || class323.field5028 == null) {
            if (class80.field1118.method1531(83, class53.field807) && class80.field1118.method1531(106, class40.field595)) {
                class76.field1072 = class232.method1645(1, class80.field1118, class53.field807, 0);
                class323.field5028 = class232.method1645(1, class80.field1118, class40.field595, 0);
                if (class36.field534) {
                    if (class76.field1072 instanceof class192) {
                        class76.field1072 = new class239((class134) class76.field1072);
                    } else {
                        class76.field1072 = new class221((class134) class76.field1072);
                    }
                    if (class323.field5028 instanceof class192) {
                        class323.field5028 = new class239((class134) class323.field5028);
                    } else {
                        class323.field5028 = new class221((class134) class323.field5028);
                    }
                }
            } else if (class36.field534) {
                class194.method1412(var1, var3, var2, 20, class197.field3132, 256 - class324.field5043);
            } else {
                class168.method1226(var1, var3, var2, 20, class197.field3132, 256 - class324.field5043);
            }
        }
        if (class76.field1072 != null && class323.field5028 != null) {
            int var5 = var2 / class76.field1072.field312;
            for (int var6 = 0; var6 < var5; var6++) {
                class76.field1072.method186(class76.field1072.field312 * var6 + var1, var3);
            }
            class323.field5028.method186(var1, var3);
            class323.field5028.method181(var1 + var2 - class323.field5028.field312, var3);
        }
        class64.field956.method434(class272.field4119, var1 + 3, var3 - -14, class112.field1770, -1);
        if (class36.field534) {
            class194.method1412(var1, var3 + 20, var2, var4 - 20, class197.field3132, 256 - class324.field5043);
        } else {
            class168.method1226(var1, var3 + 20, var2, var4 - 20, class197.field3132, 256 - class324.field5043);
        }
        int var7 = class273.field4129;
        int var8 = class295.field4646;
        for (int var9 = 0; var9 < class6.field62; var9++) {
            int var10 = var3 + ((class6.field62 - var9 + -1) * 15) + 35;
            if (var1 < var7 && (var1 + var2) > var7 && (var10 - 13) < var8 && var8 < (var10 + 3)) {
                if (class36.field534) {
                    class194.method1412(var1, var10 - 13, var2, 16, class305.field4778, 256 - class14.field160);
                } else {
                    class168.method1226(var1, var10 - 13, var2, 16, class305.field4778, 256 - class14.field160);
                }
            }
        }
        if ((class305.field4776 == null || class21.field229 == null || class260.field3857 == null) && class80.field1118.method1531(93, class58.field863) && class80.field1118.method1531(125, class235.field3600) && class80.field1118.method1531(125, class149.field2258)) {
            class305.field4776 = class232.method1645(1, class80.field1118, class58.field863, 0);
            class21.field229 = class232.method1645(1, class80.field1118, class235.field3600, 0);
            class260.field3857 = class232.method1645(1, class80.field1118, class149.field2258, 0);
            if (class36.field534) {
                if (class305.field4776 instanceof class192) {
                    class305.field4776 = new class239((class134) class305.field4776);
                } else {
                    class305.field4776 = new class221((class134) class305.field4776);
                }
                if (class21.field229 instanceof class192) {
                    class21.field229 = new class239((class134) class21.field229);
                } else {
                    class21.field229 = new class221((class134) class21.field229);
                }
                if (class260.field3857 instanceof class192) {
                    class260.field3857 = new class239((class134) class260.field3857);
                } else {
                    class260.field3857 = new class221((class134) class260.field3857);
                }
            }
        }
        if (class305.field4776 != null && class21.field229 != null && class260.field3857 != null) {
            int var11 = var2 / class305.field4776.field312;
            for (int var12 = 0; var12 < var11; var12++) {
                class305.field4776.method186(class305.field4776.field312 * var12 + var1, -class305.field4776.field315 + var3 - -var4);
            }
            int var13 = (var4 - 20) / class21.field229.field315;
            for (int var14 = 0; var14 < var13; var14++) {
                class21.field229.method186(var1, class21.field229.field315 * var14 + var3 + 20);
                class21.field229.method181(var1 - (class21.field229.field312 - var2), var3 + 20 - -(class21.field229.field315 * var14));
            }
            class260.field3857.method186(var1, var3 + var4 - class260.field3857.field315);
            class260.field3857.method181(var2 + var1 - class260.field3857.field312, -class260.field3857.field315 + var3 + var4);
        }
        int var15 = 0;
        int var16 = -41 % ((72 - arg0) / 34);
        while (var15 < class6.field62) {
            int var17 = (class6.field62 - var15 - 1) * 15 + var3 + 35;
            int var18 = class112.field1770;
            if (var1 < var7 && (var1 + var2) > var7 && (var17 - 13) < var8 && var8 < var17 + 3) {
                var18 = class87.field1277;
            }
            class64.field956.method434(class189.method1365(false, var15), var1 + 3, var17, var18, 0);
            var15++;
        }
        class135.method1032(class327.field5074, 127, class143.field2208, class253.field3776, class62.field936);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V", line = 187)
    public static void method1488(byte arg0) {
        int var1 = -45 / ((arg0 + 41) / 40);
        field3292 = null;
        field3290 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Z", line = 197)
    public static final boolean method1489(int arg0, int arg1) {
        class291.field4570 = arg1 + 1 & 0xFFFF;
        if (arg0 != 20) {
            field3295 = false;
        }
        field3291++;
        class87.field1282 = true;
        return true;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIII)V", line = 213)
    public static final void method1490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class196.field3109 = 0;
        for (int var7 = -1; var7 < (class262.field3900 + class122.field1923); var7++) {
            class288 var8;
            if (var7 == -1) {
                var8 = class235.field3602;
            } else if (var7 >= class262.field3900) {
                var8 = class161.field2394[class126.field1995[var7 - class262.field3900]];
            } else {
                var8 = class319.field4964[class225.field3504[var7]];
            }
            if (var8 != null && var8.method409(1)) {
                if (var8 instanceof class45) {
                    class183 var9 = ((class45) var8).field698;
                    if (var9.field2738 != null) {
                        var9 = var9.method1329(113);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class262.field3900) {
                    class183 var15 = ((class45) var8).field698;
                    if (var15.field2738 != null) {
                        var15 = var15.method1329(111);
                    }
                    if (var15.field2745 >= 0 && class51.field788.length > var15.field2745) {
                        int var16;
                        if (var15.field2780 == -1) {
                            var16 = var8.method2038((byte) -110) + 15;
                        } else {
                            var16 = var15.field2780 + 15;
                        }
                        class173.method1267(var16, arg3 >> 1, var8, arg6, 8222, arg5, arg4 >> 1);
                        if (class138.field2145 > -1) {
                            class51.field788[var15.field2745].method186(class138.field2145 + arg0 - 12, class318.field4961 + arg2 + -30);
                        }
                    }
                    int var17 = 0;
                    class273[] var18 = class141.field2185;
                    while (var18.length > var17) {
                        class273 var19 = var18[var17];
                        if (var19 != null && var19.field4132 == 1 && class126.field1995[var7 - class262.field3900] == var19.field4136 && (class312.field4852 % 20) < 10) {
                            int var20;
                            if (var15.field2780 == -1) {
                                var20 = var8.method2038((byte) -110) + 15;
                            } else {
                                var20 = var15.field2780 + 15;
                            }
                            class173.method1267(var20, arg3 >> 1, var8, arg6, 8222, arg5, arg4 >> 1);
                            if (class138.field2145 > -1) {
                                class163.field2432[var19.field4127].method186(arg0 + class138.field2145 - 12, class318.field4961 + arg2 - 28);
                            }
                        }
                        var17++;
                    }
                } else {
                    int var10 = 30;
                    class121 var11 = (class121) var8;
                    if (var11.field1919 != -1 || var11.field1911 != -1) {
                        class173.method1267(var8.method2038((byte) -118) + 15, arg3 >> 1, var8, arg6, 8222, arg5, arg4 >> 1);
                        if (class138.field2145 > -1) {
                            if (var11.field1919 != -1) {
                                class43.field673[var11.field1919].method186(class138.field2145 + arg0 - 12, class318.field4961 + arg2 + -var10);
                                var10 += 25;
                            }
                            if (var11.field1911 != -1) {
                                class51.field788[var11.field1911].method186(arg0 + class138.field2145 - 12, class318.field4961 + arg2 + -var10);
                                var10 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class273[] var12 = class141.field2185;
                        for (int var13 = 0; var13 < var12.length; var13++) {
                            class273 var14 = var12[var13];
                            if (var14 != null && var14.field4132 == 10 && class225.field3504[var7] == var14.field4136) {
                                class173.method1267(var8.method2038((byte) -117) + 15, arg3 >> 1, var8, arg6, 8222, arg5, arg4 >> 1);
                                if (class138.field2145 > -1) {
                                    class163.field2432[var14.field4127].method186(class138.field2145 + arg0 - 12, arg2 - -class318.field4961 - var10);
                                }
                            }
                        }
                    }
                }
                if (var8.field4518 != null && (class262.field3900 <= var7 || class299.field4697 == 0 || class299.field4697 == 3 || class299.field4697 == 1 && class146.method1089((byte) 39, ((class121) var8).field1895))) {
                    class173.method1267(var8.method2038((byte) -97), arg3 >> 1, var8, arg6, 8222, arg5, arg4 >> 1);
                    if (class138.field2145 > -1 && class37.field556 > class196.field3109) {
                        class37.field550[class196.field3109] = class64.field956.method426(var8.field4518) / 2;
                        class37.field559[class196.field3109] = class64.field956.field733;
                        class37.field546[class196.field3109] = class138.field2145;
                        class37.field560[class196.field3109] = class318.field4961;
                        class37.field547[class196.field3109] = var8.field4442;
                        class37.field566[class196.field3109] = var8.field4446;
                        class37.field565[class196.field3109] = var8.field4469;
                        class37.field542[class196.field3109] = var8.field4518;
                        class196.field3109++;
                    }
                }
                if (var8.field4435 > class312.field4852) {
                    class27 var21 = class180.field2708[0];
                    class27 var22 = class180.field2708[1];
                    int var26;
                    if (var8 instanceof class45) {
                        class45 var23 = (class45) var8;
                        class27[] var24 = (class27[]) ((class27[]) class15.field173.method1432((byte) 96, (long) var23.field698.field2742));
                        if (var24 == null) {
                            var24 = class176.method1276(0, class80.field1118, var23.field698.field2742, (byte) 57);
                            if (var24 != null) {
                                class15.field173.method1436(false, var24, (long) var23.field698.field2742);
                            }
                        }
                        if (var24 != null && var24.length == 2) {
                            var22 = var24[1];
                            var21 = var24[0];
                        }
                        class183 var25 = var23.field698;
                        if (var25.field2780 == -1) {
                            var26 = var8.method2038((byte) -100);
                        } else {
                            var26 = var25.field2780;
                        }
                    } else {
                        var26 = var8.method2038((byte) -123);
                    }
                    class173.method1267(var26 + var21.field315 + 10, arg3 >> 1, var8, arg6, 8222, arg5, arg4 >> 1);
                    if (class138.field2145 > -1) {
                        int var27 = arg0 + class138.field2145 - (var21.field312 >> 1);
                        int var28 = arg2 + class318.field4961 - 3;
                        var21.method186(var27, var28);
                        int var29 = var21.field315;
                        int var30 = var8.field4524 * var21.field312 / 255;
                        if (class36.field534) {
                            class194.method1418(var27, var28, var27 + var30, var28 + var29);
                        } else {
                            class168.method1230(var27, var28, var27 + var30, var28 + var29);
                        }
                        var22.method186(var27, var28);
                        if (class36.field534) {
                            class194.method1416(arg0, arg2, arg0 + arg3, arg2 + arg4);
                        } else {
                            class168.method1234(arg0, arg2, arg0 + arg3, arg2 + arg4);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (class312.field4852 < var8.field4479[var31]) {
                        int var32;
                        if ((var8 instanceof class45)) {
                            class45 var33 = (class45) var8;
                            class183 var34 = var33.field698;
                            if (var34.field2780 == -1) {
                                var32 = var8.method2038((byte) -110) / 2;
                            } else {
                                var32 = var34.field2780 / 2;
                            }
                        } else {
                            var32 = var8.method2038((byte) -115) / 2;
                        }
                        class173.method1267(var32, arg3 >> 1, var8, arg6, 8222, arg5, arg4 >> 1);
                        if (class138.field2145 > -1) {
                            if (var31 == 1) {
                                class318.field4961 -= 20;
                            }
                            if (var31 == 2) {
                                class318.field4961 -= 10;
                                class138.field2145 -= 15;
                            }
                            if (var31 == 3) {
                                class138.field2145 += 15;
                                class318.field4961 -= 10;
                            }
                            class263.field3937[var8.field4505[var31]].method186(class138.field2145 + arg0 - 12, class318.field4961 + arg2 + -12);
                            class136.field2119.method439(Integer.toString(var8.field4506[var31]), class138.field2145 + arg0 - 1, class318.field4961 + arg2 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg1 <= 7) {
            method1489(3, 39);
        }
        field3296++;
        for (int var35 = 0; var35 < class196.field3109; var35++) {
            int var36 = class37.field550[var35];
            int var37 = class37.field546[var35];
            int var38 = class37.field559[var35];
            int var39 = class37.field560[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if ((var39 + 2) > (class37.field560[var41] - class37.field559[var41]) && (class37.field560[var41] + 2) > (var39 - var38) && (var37 - var36) < (class37.field546[var41] + class37.field550[var41]) && var36 + var37 > class37.field546[var41] + -class37.field550[var41] && var39 > class37.field560[var41] - class37.field559[var41]) {
                        var40 = true;
                        var39 = class37.field560[var41] - class37.field559[var41];
                    }
                }
            }
            class138.field2145 = class37.field546[var35];
            class318.field4961 = class37.field560[var35] = var39;
            String var42 = class37.field542[var35];
            if (class188.field2999 == 0) {
                int var43 = 16776960;
                if (class37.field547[var35] < 6) {
                    var43 = class258.field3843[class37.field547[var35]];
                }
                if (class37.field547[var35] == 6) {
                    var43 = (class255.field3812 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class37.field547[var35] == 7) {
                    var43 = class255.field3812 % 20 < 10 ? 255 : 65535;
                }
                if (class37.field547[var35] == 8) {
                    var43 = class255.field3812 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class37.field547[var35] == 9) {
                    int var44 = 150 - class37.field565[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 - ((var44 - 50) * 327680);
                    } else if (var44 < 150) {
                        var43 = (var44 - 100) * 5 + 65280;
                    }
                }
                if (class37.field547[var35] == 10) {
                    int var45 = 150 - class37.field565[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16384000 - (var45 * 327680 - 16711935);
                    } else if (var45 < 150) {
                        var43 = var45 * 327680 + 255 - (var45 - 100) * 5 - 32768000;
                    }
                }
                if (class37.field547[var35] == 11) {
                    int var46 = 150 - class37.field565[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = (var46 - 50) * 327685 + 65280;
                    } else if (var46 < 150) {
                        var43 = 16777215 - ((var46 - 100) * 327680);
                    }
                }
                if (class37.field566[var35] == 0) {
                    class64.field956.method439(var42, arg0 + class138.field2145, class318.field4961 + arg2, var43, 0);
                }
                if (class37.field566[var35] == 1) {
                    class64.field956.method444(var42, class138.field2145 + arg0, class318.field4961 + arg2, var43, 0, class255.field3812);
                }
                if (class37.field566[var35] == 2) {
                    class64.field956.method450(var42, arg0 + class138.field2145, class318.field4961 + arg2, var43, 0, class255.field3812);
                }
                if (class37.field566[var35] == 3) {
                    class64.field956.method441(var42, arg0 + class138.field2145, arg2 - -class318.field4961, var43, 0, class255.field3812, 150 - class37.field565[var35]);
                }
                if (class37.field566[var35] == 4) {
                    int var47 = (150 - class37.field565[var35]) * (class64.field956.method426(var42) + 100) / 150;
                    if (class36.field534) {
                        class194.method1418(arg0 + class138.field2145 - 50, arg2, arg0 + class138.field2145 + 50, arg2 + arg4);
                    } else {
                        class168.method1230(class138.field2145 + arg0 - 50, arg2, class138.field2145 + arg0 + 50, arg2 + arg4);
                    }
                    class64.field956.method434(var42, arg0 + class138.field2145 + 50 - var47, class318.field4961 + arg2, var43, 0);
                    if (class36.field534) {
                        class194.method1416(arg0, arg2, arg0 + arg3, arg2 + arg4);
                    } else {
                        class168.method1234(arg0, arg2, arg0 + arg3, arg2 + arg4);
                    }
                }
                if (class37.field566[var35] == 5) {
                    int var48 = 150 - class37.field565[var35];
                    if (class36.field534) {
                        class194.method1418(arg0, arg2 + class318.field4961 - class64.field956.field733 - 1, arg0 + arg3, class318.field4961 + arg2 + 5);
                    } else {
                        class168.method1230(arg0, class318.field4961 + arg2 - class64.field956.field733 - 1, arg0 + arg3, class318.field4961 + arg2 + 5);
                    }
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class64.field956.method439(var42, arg0 + class138.field2145, arg2 - -class318.field4961 + var49, var43, 0);
                    if (class36.field534) {
                        class194.method1416(arg0, arg2, arg0 + arg3, arg2 + arg4);
                    } else {
                        class168.method1234(arg0, arg2, arg0 + arg3, arg2 - -arg4);
                    }
                }
            } else {
                class64.field956.method439(var42, class138.field2145 + arg0, class318.field4961 + arg2, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZIBLjava/lang/String;)I", line = 702)
    public static final int method1491(boolean arg0, int arg1, byte arg2, String arg3) {
        field3294++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        if (arg2 != -8) {
            field3295 = true;
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg1) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if (var10 / arg1 != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public abstract void method1142(byte arg0);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)I")
    public abstract int method1144(int arg0, int arg1, int arg2);
}
