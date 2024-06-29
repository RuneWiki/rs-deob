import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class129 {

    @OriginalMember(owner = "client!se", name = "s", descriptor = "[I")
    private int[] field3263;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "[I")
    private int[] field3253;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "[B")
    private byte[] field3252;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3246 = -1;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lkd;")
    private static class73 field3245 = class126.method1070((byte) -66, "To");

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lkd;")
    public static class73 field3250 = class126.method1070((byte) -66, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lkd;")
    public static class73 field3248 = class126.method1070((byte) -66, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field3251 = 0;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field3262 = 0;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "Lkd;")
    public static class73 field3260 = class126.method1070((byte) -66, ":: (X");

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Lkd;")
    public static class73 field3259 = field3245;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "Lkd;")
    public static class73 field3266 = class126.method1070((byte) -66, "sl_button");

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3265;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "[I")
    public static int[] field3247;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static final void method1079(byte arg0) {
        field3255++;
        if (arg0 != -13) {
            method1082((byte) -65);
        }
        while (true) {
            label391: do {
                while (class137.method1118(-90)) {
                    if (class52.field1393 != -1 && class57.field1529 == class52.field1393) {
                        if (field3256 == 85 && class9.field312.method632((byte) -110) > 0) {
                            class9.field312 = class9.field312.method630(class9.field312.method632((byte) -76) - 1, 0, -24023);
                        }
                        continue label391;
                    }
                    if (class104.field2603) {
                        if (field3256 == 85 && class9.field299.method632((byte) -73) > 0) {
                            class9.field299 = class9.field299.method630(class9.field299.method632((byte) -52) - 1, 0, -24023);
                            class132.field3304 = true;
                        }
                        if (class79.method678((byte) 43, class87.field2197) && class9.field299.method632((byte) -119) < 80) {
                            class9.field299 = class9.field299.method607((byte) -28, class87.field2197);
                            class132.field3304 = true;
                        }
                        if (field3256 == 84) {
                            class132.field3304 = true;
                            class104.field2603 = false;
                            if (class72.field1837 == 1) {
                                long var1 = class9.field299.method643(arg0 + 268);
                                class55.method440(-12459, var1);
                            }
                            if (class72.field1837 == 2 && class14.field431 > 0) {
                                long var3 = class9.field299.method643(255);
                                class20.method162((byte) -123, var3);
                            }
                            if (class72.field1837 == 3 && class9.field299.method632((byte) -104) > 0) {
                                class142.field3526++;
                                class121.field3079.method1215(arg0 ^ 0x10, 205);
                                class121.field3079.method956((byte) 10, 0);
                                int var5 = class121.field3079.field2816;
                                class121.field3079.method967(true, class70.field1783);
                                class121.method1039(class9.field299, class121.field3079, arg0 ^ 0xFFFFFFF3);
                                class121.field3079.method968(class121.field3079.field2816 - var5, arg0 + -72);
                                if (class25.field711 == 2) {
                                    class25.field711 = 1;
                                    class36.field988++;
                                    class74.field1913 = true;
                                    class121.field3079.method1215(106, 161);
                                    class121.field3079.method956((byte) 10, class133.field3342);
                                    class121.field3079.method956((byte) 10, class25.field711);
                                    class121.field3079.method956((byte) 10, class13.field410);
                                }
                            }
                            if (class72.field1837 == 4 && class126.field3231 < 100) {
                                long var6 = class9.field299.method643(255);
                                class110.method880(var6, arg0 - 25);
                            }
                            if (class72.field1837 == 5 && class126.field3231 > 0) {
                                long var8 = class9.field299.method643(arg0 + 268);
                                class141.method1153(var8, false);
                            }
                        }
                    } else if (class2.field146 == 1) {
                        if (field3256 == 85 && class9.field296.method632((byte) -124) > 0) {
                            class9.field296 = class9.field296.method630(class9.field296.method632((byte) -107) - 1, 0, -24023);
                            class132.field3304 = true;
                        }
                        if (class125.method1056(-127, class87.field2197) && class9.field296.method632((byte) -78) < 10) {
                            class9.field296 = class9.field296.method607((byte) -16, class87.field2197);
                            class132.field3304 = true;
                        }
                        if (field3256 == 84) {
                            if (class9.field296.method632((byte) -60) > 0) {
                                class145.field3590++;
                                int var18 = 0;
                                if (class9.field296.method636(10)) {
                                    var18 = class9.field296.method618((byte) 126);
                                }
                                class121.field3079.method1215(-47, 40);
                                class121.field3079.method937(-1370716840, var18);
                            }
                            class2.field146 = 0;
                            class132.field3304 = true;
                        }
                    } else if (class2.field146 == 2) {
                        if (field3256 == 85 && class9.field296.method632((byte) -99) > 0) {
                            class9.field296 = class9.field296.method630(class9.field296.method632((byte) -128) - 1, 0, -24023);
                            class132.field3304 = true;
                        }
                        if ((class109.method878((byte) -96, class87.field2197) || class87.field2197 == 32) && class9.field296.method632((byte) -99) < 12) {
                            class9.field296 = class9.field296.method607((byte) -36, class87.field2197);
                            class132.field3304 = true;
                        }
                        if (field3256 == 84) {
                            if (class9.field296.method632((byte) -86) > 0) {
                                class121.field3079.method1215(97, 100);
                                class37.field1008++;
                                class121.field3079.method967(true, class9.field296.method643(arg0 + 268));
                            }
                            class2.field146 = 0;
                            class132.field3304 = true;
                        }
                    } else if (class2.field146 == 3) {
                        if (field3256 == 85 && class9.field296.method632((byte) -122) > 0) {
                            class9.field296 = class9.field296.method630(class9.field296.method632((byte) -125) - 1, 0, -24023);
                            class132.field3304 = true;
                        }
                        if (class79.method678((byte) 43, class87.field2197) && class9.field296.method632((byte) -82) < 40) {
                            class9.field296 = class9.field296.method607((byte) -73, class87.field2197);
                            class132.field3304 = true;
                        }
                    } else if (class2.field146 == 4) {
                        if (field3256 == 85 && class9.field296.method632((byte) -98) > 0) {
                            class9.field296 = class9.field296.method630(class9.field296.method632((byte) -113) - 1, 0, -24023);
                            class132.field3304 = true;
                        }
                        if ((class79.method678((byte) 43, class87.field2197) || class87.field2197 == 32) && class9.field296.method632((byte) -114) < 80) {
                            class9.field296 = class9.field296.method607((byte) -37, class87.field2197);
                            class132.field3304 = true;
                        }
                        if (field3256 == 84) {
                            if (class9.field296.method632((byte) -57) > 0) {
                                class66.field1727++;
                                class121.field3079.method1215(-85, 117);
                                class121.field3079.method956((byte) 10, class9.field296.method632((byte) -106) + 1);
                                class121.field3079.method953(true, class9.field296);
                            }
                            class2.field146 = 0;
                            class132.field3304 = true;
                        }
                    } else if (field3246 == -1 && class81.field2033 == -1) {
                        if (class50.field1353 != 0 || class64.field1691 > 1) {
                            class48.method388(-85);
                        }
                        if (field3256 == 85 && class9.field309.method632((byte) -87) > 0) {
                            class9.field309 = class9.field309.method630(class9.field309.method632((byte) -105) - 1, 0, -24023);
                            class132.field3304 = true;
                        }
                        if (class79.method678((byte) 43, class87.field2197) && class9.field309.method632((byte) -84) < 80) {
                            class9.field309 = class9.field309.method607((byte) -66, class87.field2197);
                            class132.field3304 = true;
                        }
                        if (field3256 == 84 && class9.field309.method632((byte) -117) > 0) {
                            if (class50.field1353 != 0 || class64.field1691 > 1) {
                                class66.field1715[class99.field2494++] = class9.field309;
                                if (class99.field2494 >= 20) {
                                    class99.field2494 = 0;
                                }
                                class83.field2081 = -1;
                            }
                            if (class64.field1691 == 2) {
                                if (class9.field309.method615(class52.field1392, 60)) {
                                    System.gc();
                                }
                                if (class9.field309.method615(class103.field2569, arg0 + 73)) {
                                    class76.method656(arg0 + 13);
                                }
                                if (class9.field309.method615(class32.field895, 60)) {
                                    class92.field2378 = true;
                                }
                                if (class9.field309.method615(class74.field1919, 60)) {
                                    class92.field2378 = false;
                                }
                                if (class9.field309.method615(class136.field3386, 60)) {
                                    for (int var10 = 0; var10 < 4; var10++) {
                                        for (int var11 = 1; var11 < 103; var11++) {
                                            for (int var12 = 1; var12 < 103; var12++) {
                                                class70.field1780[var10].field1249[var11][var12] = 0;
                                            }
                                        }
                                    }
                                }
                                if (class9.field309.method615(class149.field3683, 60) && class50.field1353 == 2) {
                                    throw new RuntimeException();
                                }
                                if (class9.field309.method615(class73.field1897, 60)) {
                                    class141.field3515 = true;
                                }
                            }
                            if (class9.field309.method642(84, class142.field3543)) {
                                class121.field3079.method1215(123, 138);
                                class74.field1906++;
                                class121.field3079.method956((byte) 10, class9.field309.method632((byte) -94) - 1);
                                class121.field3079.method953(true, class9.field309.method638(2, 126));
                            } else {
                                class89.field2283++;
                                class73 var13 = class9.field309.method608(-24240);
                                byte var14 = 0;
                                if (var13.method642(-24, class73.field1896)) {
                                    var14 = 0;
                                    class9.field309 = class9.field309.method638(class73.field1896.method632((byte) -118), 125);
                                } else if (var13.method642(126, class142.field3538)) {
                                    class9.field309 = class9.field309.method638(class142.field3538.method632((byte) -116), 127);
                                    var14 = 1;
                                } else if (var13.method642(arg0 + 137, class60.field1574)) {
                                    class9.field309 = class9.field309.method638(class60.field1574.method632((byte) -49), 126);
                                    var14 = 2;
                                } else if (var13.method642(-41, class114.field2869)) {
                                    var14 = 3;
                                    class9.field309 = class9.field309.method638(class114.field2869.method632((byte) -114), 124);
                                } else if (var13.method642(111, class23.field653)) {
                                    class9.field309 = class9.field309.method638(class23.field653.method632((byte) -103), -92);
                                    var14 = 4;
                                } else if (var13.method642(72, class48.field1276)) {
                                    var14 = 5;
                                    class9.field309 = class9.field309.method638(class48.field1276.method632((byte) -63), -32);
                                } else if (var13.method642(66, class83.field2120)) {
                                    class9.field309 = class9.field309.method638(class83.field2120.method632((byte) -62), -84);
                                    var14 = 6;
                                } else if (var13.method642(76, class98.field2458)) {
                                    class9.field309 = class9.field309.method638(class98.field2458.method632((byte) -66), 127);
                                    var14 = 7;
                                } else if (var13.method642(108, class100.field2516)) {
                                    class9.field309 = class9.field309.method638(class100.field2516.method632((byte) -62), 125);
                                    var14 = 8;
                                } else if (var13.method642(arg0 ^ 0x5C, class12.field401)) {
                                    class9.field309 = class9.field309.method638(class12.field401.method632((byte) -95), -56);
                                    var14 = 9;
                                } else if (var13.method642(109, class149.field3663)) {
                                    class9.field309 = class9.field309.method638(class149.field3663.method632((byte) -54), -109);
                                    var14 = 10;
                                } else if (var13.method642(-105, class119.field3044)) {
                                    var14 = 11;
                                    class9.field309 = class9.field309.method638(class119.field3044.method632((byte) -49), -3);
                                } else if (class143.field3558 != 0) {
                                    if (var13.method642(arg0 ^ 0x14, class73.field1894)) {
                                        var14 = 0;
                                        class9.field309 = class9.field309.method638(class73.field1894.method632((byte) -124), 127);
                                    } else if (var13.method642(124, class142.field3546)) {
                                        class9.field309 = class9.field309.method638(class142.field3546.method632((byte) -77), arg0 + 1);
                                        var14 = 1;
                                    } else if (var13.method642(77, class60.field1567)) {
                                        class9.field309 = class9.field309.method638(class60.field1567.method632((byte) -100), 127);
                                        var14 = 2;
                                    } else if (var13.method642(-66, class114.field2877)) {
                                        var14 = 3;
                                        class9.field309 = class9.field309.method638(class114.field2877.method632((byte) -120), arg0 + 137);
                                    } else if (var13.method642(arg0 ^ 0xFFFFFFB9, class23.field677)) {
                                        var14 = 4;
                                        class9.field309 = class9.field309.method638(class23.field677.method632((byte) -87), 126);
                                    } else if (var13.method642(113, class48.field1291)) {
                                        class9.field309 = class9.field309.method638(class48.field1291.method632((byte) -58), 127);
                                        var14 = 5;
                                    } else if (var13.method642(arg0 - 113, class83.field2099)) {
                                        var14 = 6;
                                        class9.field309 = class9.field309.method638(class83.field2099.method632((byte) -114), -1);
                                    } else if (var13.method642(-47, class98.field2460)) {
                                        var14 = 7;
                                        class9.field309 = class9.field309.method638(class98.field2460.method632((byte) -103), arg0 ^ 0xFFFFFF8C);
                                    } else if (var13.method642(-87, class100.field2506)) {
                                        var14 = 8;
                                        class9.field309 = class9.field309.method638(class100.field2506.method632((byte) -109), arg0 + 4);
                                    } else if (var13.method642(-127, class12.field381)) {
                                        class9.field309 = class9.field309.method638(class12.field381.method632((byte) -123), 126);
                                        var14 = 9;
                                    } else if (var13.method642(arg0 - 17, class149.field3638)) {
                                        var14 = 10;
                                        class9.field309 = class9.field309.method638(class149.field3638.method632((byte) -67), -122);
                                    } else if (var13.method642(arg0 + 98, class119.field3033)) {
                                        var14 = 11;
                                        class9.field309 = class9.field309.method638(class119.field3033.method632((byte) -61), arg0 ^ 0xFFFFFF8E);
                                    }
                                }
                                class73 var15 = class9.field309.method608(-24240);
                                byte var16 = 0;
                                if (var15.method642(117, class131.field3280)) {
                                    class9.field309 = class9.field309.method638(class131.field3280.method632((byte) -111), -59);
                                    var16 = 1;
                                } else if (var15.method642(124, class151.field3742)) {
                                    class9.field309 = class9.field309.method638(class151.field3742.method632((byte) -54), 124);
                                    var16 = 2;
                                } else if (var15.method642(72, class32.field887)) {
                                    class9.field309 = class9.field309.method638(class32.field887.method632((byte) -98), 126);
                                    var16 = 3;
                                } else if (var15.method642(-38, class32.field896)) {
                                    var16 = 4;
                                    class9.field309 = class9.field309.method638(class32.field896.method632((byte) -126), 7);
                                } else if (var15.method642(arg0 ^ 0x2A, class153.field3766)) {
                                    var16 = 5;
                                    class9.field309 = class9.field309.method638(class153.field3766.method632((byte) -60), 124);
                                } else if (class143.field3558 != 0) {
                                    if (var15.method642(-68, class131.field3288)) {
                                        class9.field309 = class9.field309.method638(class131.field3288.method632((byte) -90), 126);
                                        var16 = 1;
                                    } else if (var15.method642(99, class151.field3735)) {
                                        class9.field309 = class9.field309.method638(class151.field3735.method632((byte) -79), 126);
                                        var16 = 2;
                                    } else if (var15.method642(109, class32.field893)) {
                                        var16 = 3;
                                        class9.field309 = class9.field309.method638(class32.field893.method632((byte) -128), 126);
                                    } else if (var15.method642(arg0 - 72, class32.field890)) {
                                        class9.field309 = class9.field309.method638(class32.field890.method632((byte) -79), 126);
                                        var16 = 4;
                                    } else if (var15.method642(-123, class153.field3772)) {
                                        class9.field309 = class9.field309.method638(class153.field3772.method632((byte) -54), 125);
                                        var16 = 5;
                                    }
                                }
                                class121.field3079.method1215(124, 244);
                                class121.field3079.method956((byte) 10, 0);
                                int var17 = class121.field3079.field2816;
                                class121.field3079.method956((byte) 10, var14);
                                class121.field3079.method956((byte) 10, var16);
                                class121.method1039(class9.field309, class121.field3079, 0);
                                class121.field3079.method968(class121.field3079.field2816 - var17, 73);
                                if (class133.field3342 == 2) {
                                    class74.field1913 = true;
                                    class133.field3342 = 3;
                                    class121.field3079.method1215(-69, 161);
                                    class121.field3079.method956((byte) 10, class133.field3342);
                                    class121.field3079.method956((byte) 10, class25.field711);
                                    class36.field988++;
                                    class121.field3079.method956((byte) 10, class13.field410);
                                }
                            }
                            class9.field309 = class9.field298;
                            class132.field3304 = true;
                        }
                    }
                }
                return;
            } while (!class109.method878((byte) -96, class87.field2197) && class87.field2197 != 32);
            if (class9.field312.method632((byte) -109) < 12) {
                class9.field312 = class9.field312.method607((byte) -88, class87.field2197);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I[B[BIII)I")
    public final int method1080(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        if (arg3 != 256) {
            return 88;
        }
        int var8 = arg0 + arg4;
        int var9 = arg5 << 3;
        field3264++;
        while (arg4 < var8) {
            int var10 = arg1[arg4] & 0xFF;
            int var11 = this.field3253[var10];
            byte var12 = this.field3252[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class84.method713(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg2[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg2[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg2[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg2[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        return (var9 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZLpb;)V")
    public static final void method1081(int arg0, int arg1, boolean arg2, class106 arg3) {
        int var4 = arg0 * arg0 + arg1 * arg1;
        field3254++;
        if (!arg2) {
            return;
        }
        if (var4 <= 4225 || var4 >= 90000) {
            class33.method263(-621557776, arg0, arg1, arg3);
            return;
        }
        int var5 = class84.field2123 + class55.field1490 & 0x7FF;
        int var6 = class29.field833[var5];
        int var7 = class29.field848[var5];
        int var8 = var7 * 256 / (class43.field1156 + 256);
        int var9 = var6 * 256 / (class43.field1156 + 256);
        int var10 = arg1 * var8 - arg0 * var9 >> 16;
        int var11 = arg0 * var8 + arg1 * var9 >> 16;
        double var12 = Math.atan2((double) var11, (double) var10);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        class25.field748.method863(var14 + 98 - 10, -var15 + -20 + 83, 20, 20, 15, 15, var12, 256);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    public static void method1082(byte arg0) {
        field3245 = null;
        field3250 = null;
        field3247 = null;
        field3248 = null;
        field3259 = null;
        field3266 = null;
        field3265 = null;
        field3260 = null;
        int var1 = -15 / ((64 - arg0) / 53);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIILb;IILge;IB)V")
    public static final void method1083(int arg0, int arg1, int arg2, class8 arg3, int arg4, int arg5, class47 arg6, int arg7, byte arg8) {
        field3249++;
        if (class77.field1971 && (class55.field1482[0][arg7][arg1] & 0x2) == 0) {
            if ((class55.field1482[arg0][arg7][arg1] & 0x10) != 0) {
                return;
            }
            if (class118.method1025(arg7, 0, arg0, arg1) != class110.field2694) {
                return;
            }
        }
        if (arg0 < class5.field183) {
            class5.field183 = arg0;
        }
        if (arg8 > -104) {
            method1081(113, 48, false, null);
        }
        int var9 = class55.field1484[arg0][arg7 + 1][arg1];
        int var10 = class55.field1484[arg0][arg7][arg1];
        int var11 = class55.field1484[arg0][arg7 + 1][arg1 + 1];
        int var12 = class55.field1484[arg0][arg7][arg1 + 1];
        class149 var13 = class122.method1045(31, arg5);
        int var14 = arg7 + (arg5 << 14) + (arg1 << 7) + 1073741824;
        if (var13.field3696 == 0) {
            var14 += Integer.MIN_VALUE;
        }
        int var15 = var9 + var10 + var12 + var11 >> 2;
        int var16 = (arg4 << 6) + arg2;
        if (var13.field3665 == 1) {
            var16 += 256;
        }
        if (var13.method1190((byte) -39)) {
            class44.method327(arg4, 128, arg1, arg0, var13, arg7);
        }
        if (arg2 == 22) {
            if (!class77.field1971 || var13.field3696 != 0 || var13.field3648 == 1 || var13.field3702) {
                class18 var17;
                if (var13.field3694 == -1 && var13.field3691 == null) {
                    var17 = var13.method1196(false, var9, 22, var10, arg4, var12, var11);
                } else {
                    var17 = new class53(arg5, 22, arg4, var10, var9, var11, var12, var13.field3694, true, null);
                }
                arg3.method74(arg0, arg7, arg1, var15, var17, var14, var16);
                if (var13.field3648 == 1 && arg6 != null) {
                    arg6.method377(arg1, 111, arg7);
                }
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class18 var37;
            if (var13.field3694 == -1 && var13.field3691 == null) {
                var37 = var13.method1196(false, var9, 10, var10, arg4, var12, var11);
            } else {
                var37 = new class53(arg5, 10, arg4, var10, var9, var11, var12, var13.field3694, true, null);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg4 == 1 || arg4 == 3) {
                    var38 = var13.field3643;
                    var39 = var13.field3660;
                } else {
                    var38 = var13.field3660;
                    var39 = var13.field3643;
                }
                int var40 = 0;
                if (arg2 == 11) {
                    var40 += 256;
                }
                if (arg3.method68(arg0, arg7, arg1, var15, var38, var39, var37, var40, var14, var16) && var13.field3697) {
                    int var41 = 15;
                    if (var37 instanceof class91) {
                        var41 = ((class91) var37).method749() / 4;
                        if (var41 > 30) {
                            var41 = 30;
                        }
                    }
                    for (int var42 = 0; var42 <= var38; var42++) {
                        for (int var43 = 0; var43 <= var39; var43++) {
                            if (class61.field1615[arg0][arg7 + var42][arg1 + var43] < var41) {
                                class61.field1615[arg0][arg7 + var42][arg1 + var43] = (byte) var41;
                            }
                        }
                    }
                }
            }
            if (var13.field3648 != 0 && arg6 != null) {
                arg6.method372(arg1, arg7, arg4, var13.field3660, var13.field3643, var13.field3646, -1);
            }
        } else if (arg2 >= 12) {
            class18 var18;
            if (var13.field3694 == -1 && var13.field3691 == null) {
                var18 = var13.method1196(false, var9, arg2, var10, arg4, var12, var11);
            } else {
                var18 = new class53(arg5, arg2, arg4, var10, var9, var11, var12, var13.field3694, true, null);
            }
            arg3.method68(arg0, arg7, arg1, var15, 1, 1, var18, 0, var14, var16);
            if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg0 > 0) {
                class11.field352[arg0][arg7][arg1] = class84.method713(class11.field352[arg0][arg7][arg1], 2340);
            }
            if (var13.field3648 != 0 && arg6 != null) {
                arg6.method372(arg1, arg7, arg4, var13.field3660, var13.field3643, var13.field3646, -1);
            }
        } else if (arg2 == 0) {
            class18 var19;
            if (var13.field3694 == -1 && var13.field3691 == null) {
                var19 = var13.method1196(false, var9, 0, var10, arg4, var12, var11);
            } else {
                var19 = new class53(arg5, 0, arg4, var10, var9, var11, var12, var13.field3694, true, null);
            }
            arg3.method73(arg0, arg7, arg1, var15, var19, null, class112.field2793[arg4], 0, var14, var16);
            if (arg4 == 0) {
                if (var13.field3697) {
                    class61.field1615[arg0][arg7][arg1] = 50;
                    class61.field1615[arg0][arg7][arg1 + 1] = 50;
                }
                if (var13.field3658) {
                    class11.field352[arg0][arg7][arg1] = class84.method713(class11.field352[arg0][arg7][arg1], 585);
                }
            } else if (arg4 == 1) {
                if (var13.field3697) {
                    class61.field1615[arg0][arg7][arg1 + 1] = 50;
                    class61.field1615[arg0][arg7 + 1][arg1 + 1] = 50;
                }
                if (var13.field3658) {
                    class11.field352[arg0][arg7][arg1 + 1] = class84.method713(class11.field352[arg0][arg7][arg1 + 1], 1170);
                }
            } else if (arg4 == 2) {
                if (var13.field3697) {
                    class61.field1615[arg0][arg7 + 1][arg1] = 50;
                    class61.field1615[arg0][arg7 + 1][arg1 + 1] = 50;
                }
                if (var13.field3658) {
                    class11.field352[arg0][arg7 + 1][arg1] = class84.method713(class11.field352[arg0][arg7 + 1][arg1], 585);
                }
            } else if (arg4 == 3) {
                if (var13.field3697) {
                    class61.field1615[arg0][arg7][arg1] = 50;
                    class61.field1615[arg0][arg7 + 1][arg1] = 50;
                }
                if (var13.field3658) {
                    class11.field352[arg0][arg7][arg1] = class84.method713(class11.field352[arg0][arg7][arg1], 1170);
                }
            }
            if (var13.field3648 != 0 && arg6 != null) {
                arg6.method371(arg2, (byte) 123, arg7, arg4, var13.field3646, arg1);
            }
            if (var13.field3690 != 16) {
                arg3.method43(arg0, arg7, arg1, var13.field3690);
            }
        } else if (arg2 == 1) {
            class18 var20;
            if (var13.field3694 == -1 && var13.field3691 == null) {
                var20 = var13.method1196(false, var9, 1, var10, arg4, var12, var11);
            } else {
                var20 = new class53(arg5, 1, arg4, var10, var9, var11, var12, var13.field3694, true, null);
            }
            arg3.method73(arg0, arg7, arg1, var15, var20, null, class99.field2493[arg4], 0, var14, var16);
            if (var13.field3697) {
                if (arg4 == 0) {
                    class61.field1615[arg0][arg7][arg1 + 1] = 50;
                } else if (arg4 == 1) {
                    class61.field1615[arg0][arg7 + 1][arg1 + 1] = 50;
                } else if (arg4 == 2) {
                    class61.field1615[arg0][arg7 + 1][arg1] = 50;
                } else if (arg4 == 3) {
                    class61.field1615[arg0][arg7][arg1] = 50;
                }
            }
            if (var13.field3648 != 0 && arg6 != null) {
                arg6.method371(arg2, (byte) 127, arg7, arg4, var13.field3646, arg1);
            }
        } else if (arg2 == 2) {
            int var21 = arg4 + 1 & 0x3;
            class18 var22;
            class18 var23;
            if (var13.field3694 == -1 && var13.field3691 == null) {
                var22 = var13.method1196(false, var9, 2, var10, arg4 + 4, var12, var11);
                var23 = var13.method1196(false, var9, 2, var10, var21, var12, var11);
            } else {
                var22 = new class53(arg5, 2, arg4 + 4, var10, var9, var11, var12, var13.field3694, true, null);
                var23 = new class53(arg5, 2, var21, var10, var9, var11, var12, var13.field3694, true, null);
            }
            arg3.method73(arg0, arg7, arg1, var15, var22, var23, class112.field2793[arg4], class112.field2793[var21], var14, var16);
            if (var13.field3658) {
                if (arg4 == 0) {
                    class11.field352[arg0][arg7][arg1] = class84.method713(class11.field352[arg0][arg7][arg1], 585);
                    class11.field352[arg0][arg7][arg1 + 1] = class84.method713(class11.field352[arg0][arg7][arg1 + 1], 1170);
                } else if (arg4 == 1) {
                    class11.field352[arg0][arg7][arg1 + 1] = class84.method713(class11.field352[arg0][arg7][arg1 + 1], 1170);
                    class11.field352[arg0][arg7 + 1][arg1] = class84.method713(class11.field352[arg0][arg7 + 1][arg1], 585);
                } else if (arg4 == 2) {
                    class11.field352[arg0][arg7 + 1][arg1] = class84.method713(class11.field352[arg0][arg7 + 1][arg1], 585);
                    class11.field352[arg0][arg7][arg1] = class84.method713(class11.field352[arg0][arg7][arg1], 1170);
                } else if (arg4 == 3) {
                    class11.field352[arg0][arg7][arg1] = class84.method713(class11.field352[arg0][arg7][arg1], 1170);
                    class11.field352[arg0][arg7][arg1] = class84.method713(class11.field352[arg0][arg7][arg1], 585);
                }
            }
            if (var13.field3648 != 0 && arg6 != null) {
                arg6.method371(arg2, (byte) 122, arg7, arg4, var13.field3646, arg1);
            }
            if (var13.field3690 != 16) {
                arg3.method43(arg0, arg7, arg1, var13.field3690);
            }
        } else if (arg2 == 3) {
            class18 var24;
            if (var13.field3694 == -1 && var13.field3691 == null) {
                var24 = var13.method1196(false, var9, 3, var10, arg4, var12, var11);
            } else {
                var24 = new class53(arg5, 3, arg4, var10, var9, var11, var12, var13.field3694, true, null);
            }
            arg3.method73(arg0, arg7, arg1, var15, var24, null, class99.field2493[arg4], 0, var14, var16);
            if (var13.field3697) {
                if (arg4 == 0) {
                    class61.field1615[arg0][arg7][arg1 + 1] = 50;
                } else if (arg4 == 1) {
                    class61.field1615[arg0][arg7 + 1][arg1 + 1] = 50;
                } else if (arg4 == 2) {
                    class61.field1615[arg0][arg7 + 1][arg1] = 50;
                } else if (arg4 == 3) {
                    class61.field1615[arg0][arg7][arg1] = 50;
                }
            }
            if (var13.field3648 != 0 && arg6 != null) {
                arg6.method371(arg2, (byte) 123, arg7, arg4, var13.field3646, arg1);
            }
        } else if (arg2 == 9) {
            class18 var25;
            if (var13.field3694 == -1 && var13.field3691 == null) {
                var25 = var13.method1196(false, var9, arg2, var10, arg4, var12, var11);
            } else {
                var25 = new class53(arg5, arg2, arg4, var10, var9, var11, var12, var13.field3694, true, null);
            }
            arg3.method68(arg0, arg7, arg1, var15, 1, 1, var25, 0, var14, var16);
            if (var13.field3648 != 0 && arg6 != null) {
                arg6.method372(arg1, arg7, arg4, var13.field3660, var13.field3643, var13.field3646, -1);
            }
        } else {
            if (var13.field3678) {
                if (arg4 == 1) {
                    int var29 = var12;
                    var12 = var11;
                    var11 = var9;
                    var9 = var10;
                    var10 = var29;
                } else if (arg4 == 2) {
                    int var26 = var12;
                    var12 = var9;
                    var9 = var26;
                    int var27 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg4 == 3) {
                    int var28 = var12;
                    var12 = var10;
                    var10 = var9;
                    var9 = var11;
                    var11 = var28;
                }
            }
            if (arg2 == 4) {
                class18 var30;
                if (var13.field3694 == -1 && var13.field3691 == null) {
                    var30 = var13.method1196(false, var9, 4, var10, 0, var12, var11);
                } else {
                    var30 = new class53(arg5, 4, 0, var10, var9, var11, var12, var13.field3694, true, null);
                }
                arg3.method71(arg0, arg7, arg1, var15, var30, class112.field2793[arg4], arg4 * 512, 0, 0, var14, var16);
            } else if (arg2 == 5) {
                int var31 = 16;
                int var32 = arg3.method81(arg0, arg7, arg1);
                if (var32 != 0) {
                    var31 = class122.method1045(31, var32 >> 14 & 0x7FFF).field3690;
                }
                class18 var33;
                if (var13.field3694 == -1 && var13.field3691 == null) {
                    var33 = var13.method1196(false, var9, 4, var10, 0, var12, var11);
                } else {
                    var33 = new class53(arg5, 4, 0, var10, var9, var11, var12, var13.field3694, true, null);
                }
                arg3.method71(arg0, arg7, arg1, var15, var33, class112.field2793[arg4], arg4 * 512, class149.field3649[arg4] * var31, class145.field3577[arg4] * var31, var14, var16);
            } else if (arg2 == 6) {
                class18 var34;
                if (var13.field3694 == -1 && var13.field3691 == null) {
                    var34 = var13.method1196(false, var9, 4, var10, 0, var12, var11);
                } else {
                    var34 = new class53(arg5, 4, 0, var10, var9, var11, var12, var13.field3694, true, null);
                }
                arg3.method71(arg0, arg7, arg1, var15, var34, 256, arg4, 0, 0, var14, var16);
            } else if (arg2 == 7) {
                class18 var35;
                if (var13.field3694 == -1 && var13.field3691 == null) {
                    var35 = var13.method1196(false, var9, 4, var10, 0, var12, var11);
                } else {
                    var35 = new class53(arg5, 4, 0, var10, var9, var11, var12, var13.field3694, true, null);
                }
                arg3.method71(arg0, arg7, arg1, var15, var35, 512, arg4, 0, 0, var14, var16);
            } else if (arg2 == 8) {
                class18 var36;
                if (var13.field3694 == -1 && var13.field3691 == null) {
                    var36 = var13.method1196(false, var9, 4, var10, 0, var12, var11);
                } else {
                    var36 = new class53(arg5, 4, 0, var10, var9, var11, var12, var13.field3694, true, null);
                }
                arg3.method71(arg0, arg7, arg1, var15, var36, 768, arg4, 0, 0, var14, var16);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "([B)V")
    public class129(byte[] arg0) {
        int var2 = arg0.length;
        this.field3263 = new int[8];
        this.field3253 = new int[var2];
        this.field3252 = arg0;
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3253[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class84.method713(var11, var10);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field3263[var14] == 0) {
                            this.field3263[var14] = var4;
                        }
                        var14 = this.field3263[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field3263.length) {
                        int[] var18 = new int[this.field3263.length * 2];
                        for (int var19 = 0; var19 < this.field3263.length; var19++) {
                            var18[var19] = this.field3263[var19];
                        }
                        this.field3263 = var18;
                    }
                }
                this.field3263[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([BIII[BI)I")
    public final int method1084(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        if (arg2 != -1) {
            field3251 = 42;
        }
        field3261++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg1 + arg5;
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 < 0) {
                var8 = this.field3263[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field3263[var8]) < 0) {
                arg4[arg1++] = (byte) ~var11;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3263[var8];
            }
            int var12;
            if ((var12 = this.field3263[var8]) < 0) {
                arg4[arg1++] = (byte) ~var12;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3263[var8];
            }
            int var13;
            if ((var13 = this.field3263[var8]) < 0) {
                arg4[arg1++] = (byte) ~var13;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3263[var8];
            }
            int var14;
            if ((var14 = this.field3263[var8]) < 0) {
                arg4[arg1++] = (byte) ~var14;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3263[var8];
            }
            int var15;
            if ((var15 = this.field3263[var8]) < 0) {
                arg4[arg1++] = (byte) ~var15;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3263[var8];
            }
            int var16;
            if ((var16 = this.field3263[var8]) < 0) {
                arg4[arg1++] = (byte) ~var16;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3263[var8];
            }
            int var17;
            if ((var17 = this.field3263[var8]) < 0) {
                arg4[arg1++] = (byte) ~var17;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3263[var8];
            }
            int var18;
            if ((var18 = this.field3263[var8]) < 0) {
                arg4[arg1++] = (byte) ~var18;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }
}
