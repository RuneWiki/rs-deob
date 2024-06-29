import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public abstract class class6 extends class97 {

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "I")
    public int field118 = 1000;

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "Lke;")
    public static class65 field113 = class1.method17(" )2>", -120);

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "[I")
    public static int[] field110 = new int[5];

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "Lke;")
    public static class65 field115 = class1.method17("titlebutton", -120);

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
    public static int field112 = 0;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    public static int field108 = 0;

    @OriginalMember(owner = "client!ae", name = "gb", descriptor = "Z")
    public static boolean field121 = false;

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "Lke;")
    private static class65 field114 = class1.method17("Members object", -116);

    @OriginalMember(owner = "client!ae", name = "nb", descriptor = "Lke;")
    public static class65 field128 = class1.method17("::hiddenbuttontest", -125);

    @OriginalMember(owner = "client!ae", name = "lb", descriptor = "Lke;")
    public static class65 field126 = field114;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ae", name = "eb", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ae", name = "hb", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ae", name = "ib", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ae", name = "jb", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ae", name = "mb", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ae", name = "kb", descriptor = "Lta;")
    public static class112 field125;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "Ljd;")
    public static class58 field107;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)Z", line = 10)
    private static final boolean method39(int arg0, int arg1, byte arg2) {
        field109++;
        if (arg1 == 0 && class41.field1048 == arg0) {
            return true;
        } else if (arg1 == 1 && class92.field2434 == arg0) {
            return true;
        } else if (arg2 == -40) {
            return (arg1 == 2 || arg1 == 3) && class114.field2854 == arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILg;IIIII)V", line = 36)
    public static final void method40(int arg0, int arg1, class39 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 >= 0 && arg5 < 104 && arg4 >= 0 && arg4 < 104) {
            class114.field2852[arg3][arg5][arg4] = 0;
            while (true) {
                int var8 = arg2.method334(106);
                if (var8 == 0) {
                    if (arg3 == 0) {
                        class24.field611[0][arg5][arg4] = -class10.method59(arg4 + arg0 + 556238, (byte) 100, arg5 + arg6 + 932731) * 8;
                    } else {
                        class24.field611[arg3][arg5][arg4] = class24.field611[arg3 - 1][arg5][arg4] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg2.method334(113);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg3 == 0) {
                        class24.field611[0][arg5][arg4] = -var9 * 8;
                    } else {
                        class24.field611[arg3][arg5][arg4] = class24.field611[arg3 - 1][arg5][arg4] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class114.field2880[arg3][arg5][arg4] = arg2.method307(true);
                    class80.field2140[arg3][arg5][arg4] = (byte) ((var8 - 2) / 4);
                    class66.field1751[arg3][arg5][arg4] = (byte) class114.method934(arg1 + var8 - 2, 3);
                } else if (var8 <= 81) {
                    class114.field2852[arg3][arg5][arg4] = (byte) (var8 - 49);
                } else {
                    class114.field2848[arg3][arg5][arg4] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg2.method334(110);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg2.method334(104);
                    break;
                }
                if (var10 <= 49) {
                    arg2.method334(arg7 + 108);
                }
            }
        }
        field116++;
        if (arg7 != 8) {
            field107 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V", line = 131)
    public static final void method41(int arg0) {
        field105++;
        int var1 = -1;
        if (arg0 <= 58) {
            method43(-110, (byte) -69);
        }
        while (class72.field1895 > var1) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class10.field187[var1];
            }
            class114 var6 = class52.field1324[var5];
            if (var6 != null && var6.field1098 > 0) {
                var6.field1098--;
                if (var6.field1098 == 0) {
                    var6.field1112 = null;
                }
            }
            var1++;
        }
        for (int var2 = 0; var2 < class113.field2818; var2++) {
            int var3 = class56.field1464[var2];
            class129 var4 = class31.field817[var3];
            if (var4 != null && var4.field1098 > 0) {
                var4.field1098--;
                if (var4.field1098 == 0) {
                    var4.field1112 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V", line = 188)
    public static void method42(int arg0) {
        field128 = null;
        field125 = null;
        field126 = null;
        field115 = null;
        field113 = null;
        if (arg0 <= 116) {
            field113 = null;
        }
        field110 = null;
        field107 = null;
        field114 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)Lke;", line = 206)
    private static final class65 method43(int arg0, byte arg1) {
        field106++;
        if (arg0 < 100000) {
            return class39.method320(arg0, (byte) -36);
        } else if (arg0 < 10000000) {
            return class21.method172(-52, new class65[] { class39.method320(arg0 / 1000, (byte) -36), class54.field1381 });
        } else {
            if (arg1 <= 43) {
                field114 = null;
            }
            return class21.method172(-111, new class65[] { class39.method320(arg0 / 1000000, (byte) -36), class79.field2104 });
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIIII)Z", line = 225)
    public static final boolean method44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field117++;
        if (!class28.method232(arg3, true)) {
            return false;
        }
        boolean var9 = true;
        class108.method887(arg2, arg5, arg0, arg8);
        class27[] var10 = class88.field2361[arg3];
        for (int var11 = arg6; var11 < var10.length; var11++) {
            class27 var12 = var10[var11];
            if (var12 != null && var12.field720 == arg4) {
                if (var12.field705 > 0) {
                    class89.method784(var12, 0);
                }
                int var13 = var12.field722 + arg2;
                int var14 = var12.field675 + arg5 - arg1;
                if (var12.field671 == 0) {
                    if (var12.field655 && !class58.method487(-3, var11, arg7)) {
                        continue;
                    }
                    if (var12.field673 - var12.field708 < var12.field710) {
                        var12.field710 = var12.field673 - var12.field708;
                    }
                    if (var12.field710 < 0) {
                        var12.field710 = 0;
                    }
                    var9 &= method44(var12.field734 + var13, var12.field710, var13, arg3, var11, var14, arg6, arg7, var14 + var12.field708);
                    class108.method887(arg2, arg5, arg0, arg8);
                    if (var12.field673 > var12.field708) {
                        class53.method423(var12.field710, 19542, var12.field673, var14, var12.field734 + var13, var12.field708);
                    }
                }
                if (var12.field671 != 1) {
                    if (var12.field671 == 2) {
                        int var15 = 0;
                        for (int var16 = 0; var16 < var12.field708; var16++) {
                            for (int var17 = 0; var17 < var12.field734; var17++) {
                                int var18 = var13 + (var12.field702 + 32) * var17;
                                int var19 = (var12.field694 + 32) * var16 + var14;
                                if (var15 < 20) {
                                    var18 += var12.field696[var15];
                                    var19 += var12.field714[var15];
                                }
                                if (var12.field676[var15] > 0) {
                                    int var21 = 0;
                                    int var22 = 0;
                                    int var23 = var12.field676[var15] - 1;
                                    if (class108.field2708 - 32 < var18 && class108.field2710 > var18 && class108.field2707 - 32 < var19 && class108.field2705 > var19 || class80.field2128 != 0 && class93.field2465 == var15) {
                                        int var24 = 0;
                                        if (client.field382 == 1 && class72.field1896 == var15 && (arg3 << 16) + var11 == class111.field2736) {
                                            var24 = 16777215;
                                        }
                                        class61 var25 = class4.method31(var23, var24, (byte) 97, var12.field700[var15]);
                                        if (var25 == null) {
                                            var9 = false;
                                        } else {
                                            if (class80.field2128 != 0 && class93.field2465 == var15 && (arg3 << 16) + var11 == class92.field2439) {
                                                var21 = class91.field2418 - class64.field1673;
                                                if (var21 < 5 && var21 > -5) {
                                                    var21 = 0;
                                                }
                                                var22 = class52.field1320 - class51.field1315;
                                                if (var22 < 5 && var22 > -5) {
                                                    var22 = 0;
                                                }
                                                if (class88.field2353 < 5) {
                                                    var22 = 0;
                                                    var21 = 0;
                                                }
                                                var25.method509(var18 + var21, var19 + var22, 128);
                                                if (arg4 != -1) {
                                                    class27 var26 = var10[arg4];
                                                    if (class108.field2707 > var19 + var22 && var26.field710 > 0) {
                                                        int var27 = (class108.field2707 - var19 - var22) * class22.field524 / 3;
                                                        if (class22.field524 * 10 < var27) {
                                                            var27 = class22.field524 * 10;
                                                        }
                                                        if (var27 > var26.field710) {
                                                            var27 = var26.field710;
                                                        }
                                                        var26.field710 -= var27;
                                                        class51.field1315 += var27;
                                                    }
                                                    if (var19 + var22 + 32 > class108.field2705 && var26.field673 - var26.field708 > var26.field710) {
                                                        int var28 = (var22 + var19 + 32 - class108.field2705) * class22.field524 / 3;
                                                        if (class22.field524 * 10 < var28) {
                                                            var28 = class22.field524 * 10;
                                                        }
                                                        if (var26.field673 - var26.field708 - var26.field710 < var28) {
                                                            var28 = var26.field673 - var26.field708 - var26.field710;
                                                        }
                                                        class51.field1315 -= var28;
                                                        var26.field710 += var28;
                                                    }
                                                }
                                            } else if (class83.field2191 != 0 && class102.field2647 == var15 && (arg3 << 16) + var11 == class44.field1156) {
                                                var25.method509(var18, var19, 128);
                                            } else {
                                                var25.method507(var18, var19);
                                            }
                                            if (var25.field1628 == 33 || var12.field700[var15] != 1) {
                                                int var29 = var12.field700[var15];
                                                class116.field2922.method109(method43(var29, (byte) 102), var18 + var21 + 1, var19 - -10 + var22, 0);
                                                class116.field2922.method109(method43(var29, (byte) 73), var18 + var21, var19 + var22 + 9, 16776960);
                                            }
                                        }
                                    }
                                } else if (var12.field723 != null && var15 < 20) {
                                    class61 var20 = var12.method230(var15, (byte) -102);
                                    if (var20 != null) {
                                        var20.method507(var18, var19);
                                    } else if (class58.field1589) {
                                        var9 = false;
                                    }
                                }
                                var15++;
                            }
                        }
                    } else if (var12.field671 == 3) {
                        int var30;
                        if (class92.method802((byte) 42, var12)) {
                            var30 = var12.field668;
                            if (class58.method487(arg6 ^ 0xFFFFFFFD, var11, arg7) && var12.field659 != 0) {
                                var30 = var12.field659;
                            }
                        } else {
                            var30 = var12.field693;
                            if (class58.method487(-3, var11, arg7) && var12.field698 != 0) {
                                var30 = var12.field698;
                            }
                        }
                        if (var12.field701 == 0) {
                            if (var12.field658) {
                                class108.method886(var13, var14, var12.field734, var12.field708, var30);
                            } else {
                                class108.method884(var13, var14, var12.field734, var12.field708, var30);
                            }
                        } else if (var12.field658) {
                            class108.method893(var13, var14, var12.field734, var12.field708, var30, 256 - (var12.field701 & 0xFF));
                        } else {
                            class108.method883(var13, var14, var12.field734, var12.field708, var30, 256 - (var12.field701 & 0xFF));
                        }
                    } else if (var12.field671 == 4) {
                        class16 var31 = var12.method224((byte) 37);
                        if (var31 != null) {
                            class65 var32 = var12.field715;
                            int var33;
                            if (class92.method802((byte) 42, var12)) {
                                var33 = var12.field668;
                                if (class58.method487(-3, var11, arg7) && var12.field659 != 0) {
                                    var33 = var12.field659;
                                }
                                if (var12.field691.method528(75) > 0) {
                                    var32 = var12.field691;
                                }
                            } else {
                                var33 = var12.field693;
                                if (class58.method487(-3, var11, arg7) && var12.field698 != 0) {
                                    var33 = var12.field698;
                                }
                            }
                            if (var12.field669 == 6 && class13.field278) {
                                var32 = class44.field1175;
                                var33 = var12.field693;
                            }
                            if (class108.field2709 == 479) {
                                if (var33 == 16776960) {
                                    var33 = 255;
                                }
                                if (var33 == 49152) {
                                    var33 = 16777215;
                                }
                            }
                            class65 var34 = class104.method858(var12, var32, -47);
                            var31.method120(var34, var13, var14, var12.field734, var12.field708, var33, var12.field712, var12.field665, var12.field737, var12.field713);
                        } else if (class58.field1589) {
                            var9 = false;
                        }
                    } else if (var12.field671 == 5) {
                        class61 var35 = var12.method231(class92.method802((byte) 42, var12), arg6);
                        if (var35 != null) {
                            var35.method507(var13, var14);
                        } else if (class58.field1589) {
                            var9 = false;
                        }
                    } else if (var12.field671 == 6) {
                        class127.method1009(var12.field734 / 2 + var13, var12.field708 / 2 + var14);
                        int var36 = class127.field3074[var12.field663] * var12.field661 >> 16;
                        int var37 = class127.field3079[var12.field663] * var12.field661 >> 16;
                        boolean var38 = class92.method802((byte) 42, var12);
                        int var39;
                        if (var38) {
                            var39 = var12.field684;
                        } else {
                            var39 = var12.field721;
                        }
                        class37 var40;
                        if (var12.field687 == 5) {
                            var40 = class32.field837.method434(null, -1, null, -1, -78);
                        } else if (var39 == -1) {
                            var40 = var12.method228(null, var38, -1, class32.field833.field2862, -1);
                            if (var40 == null && class58.field1589) {
                                var9 = false;
                            }
                        } else {
                            class1 var41 = class80.method702(93, var39);
                            var40 = var12.method228(var41, var38, -1, class32.field833.field2862, var12.field657);
                            if (var40 == null && class58.field1589) {
                                var9 = false;
                            }
                        }
                        if (var40 != null) {
                            var40.method274(0, var12.field707, 0, var12.field663, 0, var36, var37);
                        }
                        class127.method1004();
                    } else {
                        if (var12.field671 == 7) {
                            class16 var42 = var12.method224((byte) 85);
                            if (var42 == null) {
                                if (class58.field1589) {
                                    var9 = false;
                                }
                                continue;
                            }
                            int var43 = 0;
                            for (int var44 = 0; var44 < var12.field708; var44++) {
                                for (int var45 = 0; var45 < var12.field734; var45++) {
                                    if (var12.field676[var43] > 0) {
                                        class57 var46 = class81.method715(false, var12.field676[var43] - 1);
                                        class65 var47 = var46.field1482;
                                        if (var47 == null) {
                                            var47 = class76.field2027;
                                        }
                                        if (var46.field1473 || var12.field700[var43] != 1) {
                                            var47 = class21.method172(-99, new class65[] { var47, class50.field1280, class110.method901(var12.field700[var43], 118) });
                                        }
                                        int var48 = var14 + (var12.field694 + 12) * var44;
                                        int var49 = var13 + (var12.field702 + 115) * var45;
                                        if (var12.field665 == 0) {
                                            var42.method110(var47, var49, var48, var12.field693, var12.field712);
                                        } else if (var12.field665 == 1) {
                                            var42.method113(var47, var12.field734 / 2 + var49, var48, var12.field693, var12.field712);
                                        } else {
                                            var42.method122(var47, var49 + var12.field734 - 1, var48, var12.field693, var12.field712);
                                        }
                                    }
                                    var43++;
                                }
                            }
                        }
                        if (var12.field671 == 8 && method39(var11, arg7, (byte) -40) && class77.field2054 == class64.field1693) {
                            int var50 = 0;
                            int var51 = 0;
                            class65 var52 = var12.field715;
                            class16 var53 = class55.field1422;
                            class65 var54 = class104.method858(var12, var52, -76);
                            while (var54.method528(74) > 0) {
                                int var62 = var54.method540(-49, class23.field561);
                                class65 var63;
                                if (var62 == -1) {
                                    var63 = var54;
                                    var54 = class100.field2591;
                                } else {
                                    var63 = var54.method555(0, var62, (byte) -78);
                                    var54 = var54.method539(-27693, var62 + 2);
                                }
                                int var64 = var53.method124(var63);
                                var50 += var53.field333 + 1;
                                if (var51 < var64) {
                                    var51 = var64;
                                }
                            }
                            var51 += 6;
                            var50 += 7;
                            int var55 = var12.field734 + var13 - var51 - 5;
                            int var56 = var12.field708 + var14 + 5;
                            if (var55 < var13 + 5) {
                                var55 = var13 + 5;
                            }
                            if (arg0 < var51 + var55) {
                                var55 = arg0 - var51;
                            }
                            if (arg8 < var50 + var56) {
                                var56 = arg8 - var50;
                            }
                            class108.method886(var55, var56, var51, var50, 16777120);
                            class108.method884(var55, var56, var51, var50, 0);
                            class65 var57 = var12.field715;
                            int var58 = var53.field333 + var56 + 2;
                            class65 var59 = class104.method858(var12, var57, -114);
                            while (var59.method528(110) > 0) {
                                int var60 = var59.method540(arg6 - 49, class23.field561);
                                class65 var61;
                                if (var60 == -1) {
                                    var61 = var59;
                                    var59 = class100.field2591;
                                } else {
                                    var61 = var59.method555(0, var60, (byte) -78);
                                    var59 = var59.method539(arg6 - 27693, var60 + 2);
                                }
                                var53.method110(var61, var55 + 3, var58, 0, false);
                                var58 += var53.field333 + 1;
                            }
                        }
                    }
                }
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)Lga;", line = 772)
    public class37 method45(int arg0) {
        int var2 = 105 % ((-arg0 - 6) / 52);
        field122++;
        return null;
    }

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)V", line = 792)
    public static final void method46(int arg0) {
        field127++;
        class75.field2019 = 0;
        class111.field2746 = 0;
        class79.method698((byte) 28);
        class111.method909(true);
        class74.method653((byte) 74);
        class112.method921((byte) 19);
        for (int var1 = 0; var1 < class111.field2746; var1++) {
            int var3 = class75.field2014[var1];
            if (class76.field2028 != class52.field1324[var3].field1110) {
                class52.field1324[var3] = null;
            }
        }
        if (class54.field1392 != class58.field1575.field998) {
            throw new RuntimeException("gpp1 pos:" + class58.field1575.field998 + " psize:" + class54.field1392);
        }
        if (arg0 != -13380) {
            field110 = null;
        }
        for (int var2 = 0; var2 < class72.field1895; var2++) {
            if (class52.field1324[class10.field187[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class72.field1895);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILd;)V", line = 841)
    public static final void method47(int arg0, class22 arg1) {
        field123++;
        int var2 = 0;
        if (arg1.field548 == 0) {
            var2 = class89.field2377.method614(arg1.field536, arg1.field546, arg1.field541);
        }
        int var3 = 0;
        if (arg1.field548 == 1) {
            var2 = class89.field2377.method621(arg1.field536, arg1.field546, arg1.field541);
        }
        int var4 = -1;
        if (arg0 <= 120) {
            field125 = null;
        }
        int var5 = 0;
        if (arg1.field548 == 2) {
            var2 = class89.field2377.method619(arg1.field536, arg1.field546, arg1.field541);
        }
        if (arg1.field548 == 3) {
            var2 = class89.field2377.method585(arg1.field536, arg1.field546, arg1.field541);
        }
        if (var2 != 0) {
            var4 = var2 >> 14 & 0x7FFF;
            int var6 = class89.field2377.method608(arg1.field536, arg1.field546, arg1.field541, var2);
            var5 = var6 >> 6 & 0x3;
            var3 = var6 & 0x1F;
        }
        arg1.field540 = var4;
        arg1.field547 = var3;
        arg1.field527 = var5;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIIIIIIII)V", line = 909)
    public void method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field119++;
        class37 var10 = this.method45(-83);
        if (var10 != null) {
            this.field118 = var10.field118;
            var10.method48(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }
}
