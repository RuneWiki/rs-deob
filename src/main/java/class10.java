import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class10 extends class578 {

    @OriginalMember(owner = "client!ow", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field134 = new String[] { method73(method72("1\"!W\u0014")), method73(method72("1\"!T\u0014")), method73(method72("1\"!P\u0014")), method73(method72("1\"!Q\u0014")), method73(method72("(#")), method73(method72("0 cy")), method73(method72("%{!;A")), method73(method72("1\"!V\u0014")), method73(method72("b6`y\u000183isZ8k")), method73(method72("\u0010 cy")) };

    @OriginalMember(owner = "client!ow", name = "v", descriptor = "Lsb;")
    public static class261 field130 = new class261(108, 8);

    @OriginalMember(owner = "client!ow", name = "q", descriptor = "Z")
    public static boolean field133 = false;

    @OriginalMember(owner = "client!ow", name = "s", descriptor = "Lsb;")
    public static class261 field131 = new class261(57, 0);

    @OriginalMember(owner = "client!ow", name = "m", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ow", name = "r", descriptor = "I")
    public int field123;

    @OriginalMember(owner = "client!ow", name = "l", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ow", name = "p", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ow", name = "o", descriptor = "Ldaa;")
    public static class226 field132;

    @OriginalMember(owner = "client!ow", name = "i", descriptor = "[I")
    public int[] field119;

    @OriginalMember(owner = "client!ow", name = "u", descriptor = "[I")
    public int[] field120;

    @OriginalMember(owner = "client!ow", name = "n", descriptor = "[I")
    public int[] field125;

    @OriginalMember(owner = "client!ow", name = "t", descriptor = "[Lvn;")
    public class328[] field124;

    @OriginalMember(owner = "client!ow", name = "j", descriptor = "[Lvn;")
    public class328[] field127;

    @OriginalMember(owner = "client!ow", name = "w", descriptor = "[[[B")
    public byte[][][] field121;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Ljka;III)V", line = 6)
    public static final void method67(class228 arg0, int arg1, int arg2, int arg3) {
        try {
            field129++;
            if (arg0 != null && class45.field644.field7630 != arg0) {
                int var4 = arg0.field3298;
                int var5 = arg0.field3297;
                if (arg3 != -30292) {
                    field133 = false;
                }
                int var6 = arg0.field3311;
                int var7 = (int) arg0.field3299;
                long var8 = arg0.field3299;
                if (var6 >= 2000) {
                    var6 -= 2000;
                }
                if (var6 == 6 || var6 == 1007) {
                    class687.method4915(var7, -8, arg0.field3294, var4, var5);
                }
                if (var6 == 3) {
                    class214.field3132 = arg2;
                    class737.field10501 = 2;
                    class608.field8718++;
                    class200.field2958 = arg1;
                    class544.field7953 = 0;
                    class274 var10 = class375.method2969((byte) 1, class145.field1877, class60.field916.field11100);
                    var10.field3885.method5082(-128, class108.field1420);
                    var10.field3885.method5143(-7, var5 + class655.field9286);
                    var10.field3885.method5122(class671.field9452, (byte) 119);
                    var10.field3885.method5118(var4 + class537.field7895, (byte) -98);
                    var10.field3885.method5143(100, class121.field1535);
                    var10.field3885.method5135(class496.field7286.method2604(82, true) ? 1 : 0, (byte) -113);
                    var10.field3885.method5143(-33, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                    class60.field916.method5608(var10, arg3 + 60159);
                    class506.method3867(var5, arg3 + 11875, var8, var4);
                }
                if (var6 == 47) {
                    class544.field7953 = 0;
                    class737.field10501 = 2;
                    class324.field4412++;
                    class200.field2958 = arg1;
                    class214.field3132 = arg2;
                    class274 var11 = class375.method2969((byte) 1, class282.field3972, class60.field916.field11100);
                    var11.field3885.method5115(class671.field9452, 587134664);
                    var11.field3885.method5143(-32, class655.field9286 + var5);
                    var11.field3885.method5082(-128, class537.field7895 + var4);
                    var11.field3885.method5118(class108.field1420, (byte) -79);
                    var11.field3885.method5135(class496.field7286.method2604(82, true) ? 1 : 0, (byte) -113);
                    var11.field3885.method5082(-128, var7);
                    var11.field3885.method5138((byte) -121, class121.field1535);
                    class60.field916.method5608(var11, 29867);
                    class367.method2917(var4, arg3 ^ 0xFFFF89AD, var5);
                }
                if (var6 == 49) {
                    if (class440.field6485 > 0 && class496.field7286.method2604(82, true) && class496.field7286.method2604(81, true)) {
                        class708.method5070(class203.field2988.field2981, class537.field7895 + var4, 106, class655.field9286 + var5);
                    } else {
                        class737.field10501 = 1;
                        class200.field2958 = arg1;
                        class4.field52++;
                        class544.field7953 = 0;
                        class214.field3132 = arg2;
                        class274 var12 = class375.method2969((byte) 1, class17.field213, class60.field916.field11100);
                        var12.field3885.method5143(110, class655.field9286 + var5);
                        var12.field3885.method5118(class537.field7895 + var4, (byte) -118);
                        class60.field916.method5608(var12, arg3 + 60159);
                    }
                }
                if (var6 == 48) {
                    class339 var13 = class748.field10666[var7];
                    if (var13 != null) {
                        class214.field3132 = arg2;
                        class544.field7953 = 0;
                        class619.field8821++;
                        class737.field10501 = 2;
                        class200.field2958 = arg1;
                        class274 var14 = class375.method2969((byte) 1, class317.field4347, class60.field916.field11100);
                        var14.field3885.method5138((byte) -112, class108.field1420);
                        var14.field3885.method5127(class671.field9452, 26108);
                        var14.field3885.method5138((byte) -106, var7);
                        var14.field3885.method5082(-128, class121.field1535);
                        var14.field3885.method5108(class496.field7286.method2604(82, true) ? 1 : 0, (byte) 15);
                        class60.field916.method5608(var14, 29867);
                        class50.method548(0, -2, true, var13.method1437((byte) -28), var13.field2252[0], var13.field2256[0], 0, arg3 ^ 0xF7B, var13.method1437((byte) -28));
                    }
                }
                if (var6 == 60 && class500.field7302 == null) {
                    class491.method3784(1, var5, var4);
                    class500.field7302 = class372.method2952(var4, var5, 0);
                    class97.method959(class500.field7302, -1);
                }
                if (var6 == 19) {
                    class527 var15 = (class527) class479.field7063.method3693(false, (long) var7);
                    if (var15 != null) {
                        class214.field3132 = arg2;
                        class800.field11640++;
                        class737.field10501 = 2;
                        class544.field7953 = 0;
                        class200.field2958 = arg1;
                        class717 var16 = var15.field7672;
                        class274 var17 = class375.method2969((byte) 1, class347.field5041, class60.field916.field11100);
                        var17.field3885.method5121(-122, class671.field9452);
                        var17.field3885.method5082(-128, class108.field1420);
                        var17.field3885.method5118(class121.field1535, (byte) -87);
                        var17.field3885.method5135(class496.field7286.method2604(82, true) ? 1 : 0, (byte) -113);
                        var17.field3885.method5082(-128, var7);
                        class60.field916.method5608(var17, 29867);
                        class50.method548(0, -2, true, var16.method1437((byte) -28), var16.field2252[0], var16.field2256[0], 0, arg3 ^ 0xF7B, var16.method1437((byte) -28));
                    }
                }
                if (var6 == 21) {
                    class619.field8821++;
                    class737.field10501 = 2;
                    class200.field2958 = arg1;
                    class544.field7953 = 0;
                    class214.field3132 = arg2;
                    class274 var18 = class375.method2969((byte) 1, class317.field4347, class60.field916.field11100);
                    var18.field3885.method5138((byte) -116, class108.field1420);
                    var18.field3885.method5127(class671.field9452, arg3 + 56400);
                    var18.field3885.method5138((byte) -127, class203.field2988.field2200);
                    var18.field3885.method5082(-128, class121.field1535);
                    var18.field3885.method5108(class496.field7286.method2604(82, true) ? 1 : 0, (byte) 72);
                    class60.field916.method5608(var18, 29867);
                }
                if (var6 == 45) {
                    class782 var19 = class372.method2952(var4, var5, 0);
                    if (var19 != null) {
                        class465.method3579(-10474, var19);
                    }
                }
                class125 var20 = null;
                if (var6 == 50) {
                    var20 = class12.field169;
                } else if (var6 == 12) {
                    var20 = class110.field1434;
                } else if (var6 == 9) {
                    var20 = class486.field7133;
                } else if (var6 == 51) {
                    var20 = class644.field9163;
                } else if (var6 == 1002) {
                    var20 = class679.field9531;
                } else if (var6 == 1009) {
                    var20 = class200.field2952;
                }
                if (var20 != null) {
                    class200.field2958 = arg1;
                    class544.field7953 = 0;
                    class214.field3132 = arg2;
                    class108.field1419++;
                    class737.field10501 = 2;
                    class274 var21 = class375.method2969((byte) 1, var20, class60.field916.field11100);
                    var21.field3885.method5143(-26, Integer.MAX_VALUE & (int) (var8 >>> 32));
                    var21.field3885.method5138((byte) -107, class537.field7895 + var4);
                    var21.field3885.method5138((byte) -107, var5 + class655.field9286);
                    var21.field3885.method5135(class496.field7286.method2604(82, true) ? 1 : 0, (byte) -113);
                    class60.field916.method5608(var21, 29867);
                    class506.method3867(var5, -18417, var8, var4);
                }
                if (var6 == 17) {
                    if (class440.field6485 > 0 && class496.field7286.method2604(82, true) && class496.field7286.method2604(81, true)) {
                        class708.method5070(class203.field2988.field2981, class537.field7895 + var4, -51, class655.field9286 + var5);
                    } else {
                        class274 var22 = class143.method1233(var5, 1, var4, var7);
                        if (var7 == 1) {
                            var22.field3885.method5114(255, -1);
                            var22.field3885.method5114(255, -1);
                            var22.field3885.method5138((byte) -118, (int) class349.field5057);
                            var22.field3885.method5114(arg3 ^ 0xFFFF8953, 57);
                            var22.field3885.method5114(arg3 + 30547, class801.field11658);
                            var22.field3885.method5114(arg3 + 30547, class398.field5794);
                            var22.field3885.method5114(255, 89);
                            var22.field3885.method5138((byte) -105, class203.field2988.field2969);
                            var22.field3885.method5138((byte) -120, class203.field2988.field2984);
                            var22.field3885.method5114(255, 63);
                        } else {
                            class544.field7953 = 0;
                            class214.field3132 = arg2;
                            class737.field10501 = 1;
                            class200.field2958 = arg1;
                        }
                        class60.field916.method5608(var22, 29867);
                        class50.method548(0, -4, true, 1, var4, var5, 0, arg3 ^ 0xF7B, 1);
                    }
                }
                class125 var23 = null;
                if (var6 == 22) {
                    var23 = class476.field7024;
                } else if (var6 == 8) {
                    var23 = class702.field9811;
                } else if (var6 == 5) {
                    var23 = class113.field1455;
                } else if (var6 == 20) {
                    var23 = class372.field5445;
                } else if (var6 == 4) {
                    var23 = class709.field9892;
                } else if (var6 == 1003) {
                    var23 = class491.field7192;
                }
                if (var23 != null) {
                    class527 var24 = (class527) class479.field7063.method3693(false, (long) var7);
                    if (var24 != null) {
                        class200.field2958 = arg1;
                        class214.field3132 = arg2;
                        class208.field3038++;
                        class717 var25 = var24.field7672;
                        class544.field7953 = 0;
                        class737.field10501 = 2;
                        class274 var26 = class375.method2969((byte) 1, var23, class60.field916.field11100);
                        var26.field3885.method5114(255, class496.field7286.method2604(82, true) ? 1 : 0);
                        var26.field3885.method5082(-128, var7);
                        class60.field916.method5608(var26, 29867);
                        class50.method548(0, -2, true, var25.method1437((byte) -28), var25.field2252[0], var25.field2256[0], 0, -31017, var25.method1437((byte) -28));
                    }
                }
                if (var6 == 44) {
                    class737.field10501 = 1;
                    class214.field3132 = arg2;
                    class544.field7953 = 0;
                    class698.field9764++;
                    class200.field2958 = arg1;
                    class274 var27 = class375.method2969((byte) 1, class571.field8279, class60.field916.field11100);
                    var27.field3885.method5082(-128, class108.field1420);
                    var27.field3885.method5143(126, class537.field7895 + var4);
                    var27.field3885.method5138((byte) -123, class655.field9286 + var5);
                    var27.field3885.method5118(class121.field1535, (byte) -90);
                    var27.field3885.method5121(arg3 ^ 0x7625, class671.field9452);
                    class60.field916.method5608(var27, 29867);
                    class50.method548(0, -4, true, 1, var4, var5, 0, arg3 - 725, 1);
                }
                if (var6 == 11) {
                    class782 var28 = class372.method2952(var4, var5, arg3 + 30292);
                    if (var28 != null) {
                        class598.method4410((byte) 77);
                        class135 var29 = client.method4957(var28);
                        class652.method4743(var29.method1188(1), var28, 13022, var29.field1742);
                        class268.field3795 = class521.method3962(arg3 ^ 0xFFFF89AC, var28);
                        class109.field1426 = var28.field11179 + field134[8];
                        if (class268.field3795 == null) {
                            class268.field3795 = field134[9];
                        }
                    }
                } else {
                    if (var6 == 1012 || var6 == 1011 || var6 == 1004 || var6 == 1001 || var6 == 1010) {
                        class802.method5781(true, var7, var6, var4);
                    }
                    class125 var30 = null;
                    if (var6 == 57) {
                        var30 = class9.field110;
                    } else if (var6 == 52) {
                        var30 = class200.field2950;
                    } else if (var6 == 16) {
                        var30 = class360.field5228;
                    } else if (var6 == 2) {
                        var30 = class72.field1042;
                    } else if (var6 == 18) {
                        var30 = class424.field6101;
                    } else if (var6 == 1008) {
                        var30 = class7.field90;
                    }
                    if (var30 != null) {
                        class141.field1832++;
                        class200.field2958 = arg1;
                        class214.field3132 = arg2;
                        class737.field10501 = 2;
                        class544.field7953 = 0;
                        class274 var31 = class375.method2969((byte) 1, var30, class60.field916.field11100);
                        var31.field3885.method5135(class496.field7286.method2604(82, true) ? 1 : 0, (byte) -113);
                        var31.field3885.method5138((byte) -99, class655.field9286 + var5);
                        var31.field3885.method5118(class537.field7895 + var4, (byte) -75);
                        var31.field3885.method5138((byte) -117, var7);
                        class60.field916.method5608(var31, 29867);
                        class367.method2917(var4, 1, var5);
                    }
                    class125 var32 = null;
                    if (var6 == 23) {
                        var32 = class135.field1749;
                    } else if (var6 == 13) {
                        var32 = class36.field462;
                    } else if (var6 == 15) {
                        var32 = class219.field3192;
                    } else if (var6 == 10) {
                        var32 = class580.field8391;
                    } else if (var6 == 53) {
                        var32 = class470.field6884;
                    } else if (var6 == 46) {
                        var32 = class646.field9181;
                    } else if (var6 == 58) {
                        var32 = class321.field4375;
                    } else if (var6 == 59) {
                        var32 = class601.field8611;
                    } else if (var6 == 30) {
                        var32 = class561.field8157;
                    } else if (var6 == 25) {
                        var32 = class795.field11561;
                    }
                    if (var32 != null) {
                        class339 var33 = class748.field10666[var7];
                        if (var33 != null) {
                            class737.field10501 = 2;
                            class200.field2958 = arg1;
                            class147.field1893++;
                            class214.field3132 = arg2;
                            class544.field7953 = 0;
                            class274 var34 = class375.method2969((byte) 1, var32, class60.field916.field11100);
                            var34.field3885.method5082(arg3 + 30164, var7);
                            var34.field3885.method5114(255, class496.field7286.method2604(82, true) ? 1 : 0);
                            class60.field916.method5608(var34, 29867);
                            class50.method548(0, -2, true, var33.method1437((byte) -28), var33.field2252[0], var33.field2256[0], 0, -31017, var33.method1437((byte) -28));
                        }
                    }
                    if (class351.field5091) {
                        class598.method4410((byte) 125);
                    }
                    if (class635.field9006 != null && class602.field8628 == 0) {
                        class97.method959(class635.field9006, arg3 + 30291);
                    }
                }
            }
        } catch (RuntimeException var36) {
            throw class665.method4799(var36, field134[7] + (arg0 == null ? field134[5] : field134[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(II)V", line = 473)
    public static final void method68(int arg0, int arg1) {
        try {
            field122++;
            if (arg0 == 1010) {
                class251 var2 = class699.field9789;
                synchronized (class699.field9789) {
                    class699.field9789.method2038(arg0 - 1010, arg1);
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field134[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)Ljo;", line = 486)
    public static final class101 method69(int arg0) {
        try {
            field128++;
            if (arg0 != -59) {
                field130 = null;
            }
            try {
                return (class101) Class.forName(field134[4]).getDeclaredConstructor().newInstance();
            } catch (Throwable var2) {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field134[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)V", line = 505)
    public static void method70(int arg0) {
        try {
            int var1 = 121 / ((arg0 + 40) / 54);
            field132 = null;
            field131 = null;
            field130 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field134[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)I", line = 517)
    public static int method71(int arg0, int arg1) {
        try {
            return arg0 | arg1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field134[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ow", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method72(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ow", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method73(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 94;
                    break;
                case 1:
                    var10005 = 85;
                    break;
                case 2:
                    var10005 = 15;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 60;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
