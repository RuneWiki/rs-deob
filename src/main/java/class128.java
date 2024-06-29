import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class128 {

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Z")
    public static boolean field3089 = false;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Lke;")
    private static class65 field3091 = class1.method17("Examine", -126);

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Lke;")
    private static class65 field3093 = class1.method17(" ", -114);

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Lke;")
    public static class65 field3088 = field3091;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Lke;")
    public static class65 field3092 = field3093;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Lke;")
    private static class65 field3096 = class1.method17("Enter amount:", -112);

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Lke;")
    public static class65 field3095 = field3096;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lqd;")
    public static class100 field3090 = new class100(64);

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field3099 = 0;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "Lke;")
    private static class65 field3101 = class1.method17("Unable to find ", -128);

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "Lke;")
    private static class65 field3107 = class1.method17("flash1:", -116);

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "Lke;")
    public static class65 field3097 = field3101;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field3098 = 128;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "Lke;")
    public static class65 field3106 = field3107;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "Lke;")
    private static class65 field3105 = class1.method17("Connection lost", -122);

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "Lke;")
    public static class65 field3103 = field3105;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "[I")
    public static int[] field3109 = new int[4000];

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "Lke;")
    public static class65 field3108 = class1.method17("Okay", -123);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "[I")
    public static int[] field3100;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILld;BLta;)V", line = 5)
    public static final void method1010(int arg0, class70 arg1, byte arg2, class112 arg3) {
        field3085++;
        byte[] var4 = null;
        class53 var5 = class51.field1292;
        synchronized (class51.field1292) {
            if (arg2 < 111) {
                method1010(-94, null, (byte) 84, null);
            }
            for (class81 var6 = (class81) class51.field1292.method421(1); var6 != null; var6 = (class81) class51.field1292.method428(22743)) {
                if ((long) arg0 == var6.field349 && var6.field2151 == arg1 && var6.field2153 == 0) {
                    var4 = var6.field2164;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg1.method576(arg0, -128);
            arg3.method918(arg1, var7, arg0, (byte) 97, true);
        } else {
            arg3.method918(arg1, var4, arg0, (byte) 61, true);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V", line = 64)
    public static void method1011(byte arg0) {
        field3092 = null;
        field3097 = null;
        field3101 = null;
        field3107 = null;
        field3095 = null;
        field3103 = null;
        field3093 = null;
        field3088 = null;
        field3100 = null;
        field3106 = null;
        field3090 = null;
        field3108 = null;
        field3105 = null;
        if (arg0 == -105) {
            field3109 = null;
            field3091 = null;
            field3096 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLge;)V", line = 89)
    public static final void method1012(boolean arg0, class41 arg1) {
        field3094++;
        if (class76.field2028 == arg1.field1123 || arg1.field1072 == -1 || arg1.field1118 != 0 || arg1.field1094 + 1 > class80.method702(92, arg1.field1072).field24[arg1.field1107]) {
            int var2 = class76.field2028 - arg1.field1071;
            int var3 = arg1.field1123 - arg1.field1071;
            int var4 = arg1.field1104 * 128 + arg1.field1069 * 64;
            int var5 = arg1.field1108 * 128 + arg1.field1069 * 64;
            int var6 = arg1.field1091 * 128 + arg1.field1069 * 64;
            arg1.field1067 = ((var3 - var2) * var6 + var2 * var5) / var3;
            int var7 = arg1.field1092 * 128 + arg1.field1069 * 64;
            arg1.field1070 = ((var3 - var2) * var4 + var2 * var7) / var3;
        }
        if (arg1.field1106 == 0) {
            arg1.field1052 = 1024;
        }
        if (arg1.field1106 == 1) {
            arg1.field1052 = 1536;
        }
        if (!arg0) {
            field3109 = null;
        }
        if (arg1.field1106 == 2) {
            arg1.field1052 = 0;
        }
        arg1.field1080 = 0;
        if (arg1.field1106 == 3) {
            arg1.field1052 = 512;
        }
        arg1.field1081 = arg1.field1052;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V", line = 139)
    public static final void method1013(int arg0, int arg1) {
        field3087++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class113.field2812[arg0];
        int var3 = class75.field2017[arg0];
        int var4 = class7.field135[arg0];
        int var5 = class23.field557[arg0];
        if (var5 >= 2000) {
            var5 -= 2000;
        }
        if (class116.field2916 != 0 && var5 != 1004) {
            class116.field2916 = 0;
            class39.field996 = true;
        }
        if (var5 == 13) {
            class129 var6 = class31.field817[var4];
            if (var6 != null) {
                class24.method196(0, 1, 0, var6.field1097[0], 2, 1, (byte) -115, class32.field833.field1105[0], var6.field1105[0], false, 0, class32.field833.field1097[0]);
                class51.field1294 = 2;
                class60.field1618 = 0;
                class66.field1773 = class1.field42;
                class130.field3135 = class115.field2901;
                class56.field1453.method642(123, false);
                class62.field1629++;
                class56.field1453.method302(var4, arg1 - 6349);
            }
        }
        if (var5 == 54 || var5 == 17) {
            class65 var7 = class29.field783[arg0];
            int var8 = var7.method540(-49, class90.field2380);
            if (var8 != -1) {
                class65 var9 = var7.method539(arg1 ^ 0xFFFF8A9E, var8 + 5).method543((byte) -91);
                class65 var10 = var9.method529(255).method560(-38);
                boolean var11 = false;
                for (int var12 = 0; var12 < class72.field1895; var12++) {
                    class114 var13 = class52.field1324[class10.field187[var12]];
                    if (var13 != null && var13.field2866 != null && var13.field2866.method546((byte) 103, var10)) {
                        var11 = true;
                        class24.method196(0, 1, 0, var13.field1097[0], 2, 1, (byte) -105, class32.field833.field1105[0], var13.field1105[0], false, 0, class32.field833.field1097[0]);
                        if (var5 == 54) {
                            class48.field1255++;
                            class56.field1453.method642(21, false);
                            class56.field1453.method321(class10.field187[var12], (byte) 107);
                        }
                        if (var5 == 17) {
                            class56.field1453.method642(234, false);
                            class56.field1453.method348((byte) -107, class10.field187[var12]);
                            class116.field2914++;
                        }
                        break;
                    }
                }
                if (!var11) {
                    class101.method841(class21.method172(-91, new class65[] { field3097, var10 }), 0, class100.field2591, arg1 ^ 0x30B2);
                }
            }
        }
        if (var5 == 33) {
            class70.field1810++;
            class48.method398(var4, var2, false, var3);
            class56.field1453.method642(208, false);
            class56.field1453.method302(class86.field2295 + var3, 128);
            class56.field1453.method302(var4 >> 14 & 0x7FFF, 128);
            class56.field1453.method348((byte) -101, class20.field494 + var2);
        }
        if (var5 == 36) {
            class72.field1893++;
            class56.field1453.method642(107, false);
            class56.field1453.method302(var4, 128);
            class56.field1453.method351(var3, -64);
            class56.field1453.method302(var2, 128);
            class44.field1156 = var3;
            class114.field2877 = 0;
            class102.field2647 = var2;
            class83.field2191 = 2;
            if (var3 >> 16 == class93.field2472) {
                class83.field2191 = 1;
            }
            if (var3 >> 16 == class117.field2939) {
                class83.field2191 = 3;
            }
        }
        if (var5 == 48) {
            class27 var14 = class110.method903(var3, -111);
            boolean var15 = true;
            if (var14.field705 > 0) {
                var15 = class81.method705((byte) -107, var14);
            }
            if (var15) {
                class33.field846++;
                class56.field1453.method642(32, false);
                class56.field1453.method351(var3, arg1 - 6421);
            }
        }
        if (var5 == 23) {
            class56.field1453.method642(218, false);
            class56.field1453.method302(var2, 128);
            class56.field1453.method310((byte) 120, class101.field2622);
            class50.field1283++;
            class56.field1453.method348((byte) -124, var4);
            class56.field1453.method351(var3, -107);
            class56.field1453.method327(class111.field2736, (byte) 91);
            class56.field1453.method302(class72.field1896, arg1 ^ 0x19CD);
            class102.field2647 = var2;
            class44.field1156 = var3;
            class114.field2877 = 0;
            class83.field2191 = 2;
            if (var3 >> 16 == class93.field2472) {
                class83.field2191 = 1;
            }
            if (var3 >> 16 == class117.field2939) {
                class83.field2191 = 3;
            }
        }
        if (var5 == 55) {
            class56.field1453.method642(32, false);
            class56.field1453.method351(var3, 51);
            class33.field846++;
            class27 var16 = class110.method903(var3, -82);
            if (var16.field717 != null && var16.field717[0][0] == 5) {
                int var17 = var16.field717[0][1];
                if (class32.field843[var17] != var16.field682[0]) {
                    class32.field843[var17] = var16.field682[0];
                    class32.method254(-81, var17);
                    class116.field2910 = true;
                }
            }
        }
        if (var5 == 19) {
            class27 var18 = class110.method903(var3, -106);
            class101.field2635 = 1;
            client.field382 = 0;
            class28.field749 = var18.field711;
            class46.field1213 = var18.field686;
            class116.field2910 = true;
            class98.field2533 = var3;
            class51.field1286 = class21.method172(arg1 - 6580, new class65[] { class48.field1261, var18.field704, class90.field2380 });
            if (class46.field1213 == 16) {
                class89.field2368 = 3;
                class116.field2910 = true;
                field3089 = true;
            }
            return;
        }
        if (var5 == 10) {
            class65 var19 = class29.field783[arg0];
            int var20 = var19.method540(-49, class90.field2380);
            if (var20 != -1) {
                long var21 = var19.method539(arg1 - 34170, var20 + 5).method543((byte) -101).method530((byte) 77);
                int var23 = -1;
                for (int var24 = 0; var24 < class87.field2317; var24++) {
                    if (class4.field82[var24] == var21) {
                        var23 = var24;
                        break;
                    }
                }
                if (var23 != -1 && class52.field1325[var23] > 0) {
                    class39.field996 = true;
                    class100.field2615 = class100.field2591;
                    class56.field1455 = 3;
                    class10.field218 = true;
                    class116.field2916 = 0;
                    class121.field2972 = class4.field82[var23];
                    class100.field2603 = class21.method172(-86, new class65[] { class35.field883, class86.field2286[var23] });
                }
            }
        }
        if (var5 == 5) {
            class114 var25 = class52.field1324[var4];
            if (var25 != null) {
                class99.field2574++;
                class24.method196(0, 1, 0, var25.field1097[0], 2, 1, (byte) -112, class32.field833.field1105[0], var25.field1105[0], false, 0, class32.field833.field1097[0]);
                class130.field3135 = class115.field2901;
                class60.field1618 = 0;
                class51.field1294 = 2;
                class66.field1773 = class1.field42;
                class56.field1453.method642(72, false);
                class56.field1453.method316(128, class98.field2533);
                class56.field1453.method321(var4, (byte) 115);
            }
        }
        if (var5 == 46) {
            class56.field1453.method642(62, false);
            class112.field2762++;
            class56.field1453.method327(var3, (byte) 91);
            class56.field1453.method348((byte) 78, var2);
            class56.field1453.method348((byte) 96, var4);
            class83.field2191 = 2;
            class102.field2647 = var2;
            class44.field1156 = var3;
            class114.field2877 = 0;
            if (var3 >> 16 == class93.field2472) {
                class83.field2191 = 1;
            }
            if (var3 >> 16 == class117.field2939) {
                class83.field2191 = 3;
            }
        }
        if (var5 == 44) {
            class114 var26 = class52.field1324[var4];
            if (var26 != null) {
                class77.field2062++;
                class24.method196(0, 1, 0, var26.field1097[0], 2, 1, (byte) -114, class32.field833.field1105[0], var26.field1105[0], false, 0, class32.field833.field1097[0]);
                class66.field1773 = class1.field42;
                class51.field1294 = 2;
                class60.field1618 = 0;
                class130.field3135 = class115.field2901;
                class56.field1453.method642(10, false);
                class56.field1453.method310((byte) 100, var4);
            }
        }
        if (var5 == 35) {
            class129 var27 = class31.field817[var4];
            if (var27 != null) {
                class97.field2522++;
                class24.method196(0, 1, 0, var27.field1097[0], 2, 1, (byte) -121, class32.field833.field1105[0], var27.field1105[0], false, 0, class32.field833.field1097[0]);
                class130.field3135 = class115.field2901;
                class60.field1618 = 0;
                class66.field1773 = class1.field42;
                class51.field1294 = 2;
                class56.field1453.method642(195, false);
                class56.field1453.method321(var4, (byte) 119);
            }
        }
        if (var5 == 43) {
            class52.field1318++;
            boolean var28 = class24.method196(0, 0, 0, var3, 2, 0, (byte) -110, class32.field833.field1105[0], var2, false, 0, class32.field833.field1097[0]);
            if (!var28) {
                class24.method196(0, 1, 0, var3, 2, 1, (byte) -106, class32.field833.field1105[0], var2, false, 0, class32.field833.field1097[0]);
            }
            class51.field1294 = 2;
            class130.field3135 = class115.field2901;
            class66.field1773 = class1.field42;
            class60.field1618 = 0;
            class56.field1453.method642(42, false);
            class56.field1453.method321(class86.field2295 + var3, (byte) 103);
            class56.field1453.method321(var4, (byte) 105);
            class56.field1453.method302(class20.field494 + var2, 128);
        }
        if (var5 == 1001) {
            class27 var30 = class110.method903(var3, -88);
            if (var30 == null || var30.field700[var2] < 100000) {
                class4.field86++;
                class56.field1453.method642(232, false);
                class56.field1453.method310((byte) 76, var4);
            } else {
                class101.method841(class21.method172(-52, new class65[] { class39.method320(var30.field700[var2], (byte) -36), class5.field104, class81.method715(false, var4).field1482 }), 0, class100.field2591, 10751);
            }
            class44.field1156 = var3;
            class83.field2191 = 2;
            class102.field2647 = var2;
            if (var3 >> 16 == class93.field2472) {
                class83.field2191 = 1;
            }
            class114.field2877 = 0;
            if (var3 >> 16 == class117.field2939) {
                class83.field2191 = 3;
            }
        }
        if (var5 == 14) {
            class32.field830++;
            boolean var31 = class24.method196(0, 0, 0, var3, 2, 0, (byte) -115, class32.field833.field1105[0], var2, false, 0, class32.field833.field1097[0]);
            if (!var31) {
                class24.method196(0, 1, 0, var3, 2, 1, (byte) -112, class32.field833.field1105[0], var2, false, 0, class32.field833.field1097[0]);
            }
            class130.field3135 = class115.field2901;
            class51.field1294 = 2;
            class60.field1618 = 0;
            class66.field1773 = class1.field42;
            class56.field1453.method642(159, false);
            class56.field1453.method348((byte) 48, class20.field494 + var2);
            class56.field1453.method321(var4, (byte) 124);
            class56.field1453.method302(class86.field2295 + var3, 128);
        }
        if (var5 == 37) {
            class129 var33 = class31.field817[var4];
            if (var33 != null) {
                class77.field2057++;
                class24.method196(0, 1, 0, var33.field1097[0], 2, 1, (byte) -111, class32.field833.field1105[0], var33.field1105[0], false, 0, class32.field833.field1097[0]);
                class130.field3135 = class115.field2901;
                class66.field1773 = class1.field42;
                class60.field1618 = 0;
                class51.field1294 = 2;
                class56.field1453.method642(204, false);
                class56.field1453.method310((byte) 112, class72.field1896);
                class56.field1453.method349(class111.field2736, arg1 + 21074);
                class56.field1453.method302(class101.field2622, 128);
                class56.field1453.method321(var4, (byte) 108);
            }
        }
        if (var5 == 7) {
            class56.field1459++;
            boolean var34 = class24.method196(0, 0, 0, var3, 2, 0, (byte) -118, class32.field833.field1105[0], var2, false, 0, class32.field833.field1097[0]);
            if (!var34) {
                class24.method196(0, 1, 0, var3, 2, 1, (byte) -109, class32.field833.field1105[0], var2, false, 0, class32.field833.field1097[0]);
            }
            class51.field1294 = 2;
            class60.field1618 = 0;
            class66.field1773 = class1.field42;
            class130.field3135 = class115.field2901;
            class56.field1453.method642(77, false);
            class56.field1453.method310((byte) 84, class86.field2295 + var3);
            class56.field1453.method310((byte) 126, var4);
            class56.field1453.method310((byte) 77, class20.field494 + var2);
        }
        if (var5 == 45) {
            class114 var36 = class52.field1324[var4];
            if (var36 != null) {
                class80.field2122++;
                class24.method196(0, 1, 0, var36.field1097[0], 2, 1, (byte) -121, class32.field833.field1105[0], var36.field1105[0], false, 0, class32.field833.field1097[0]);
                class130.field3135 = class115.field2901;
                class60.field1618 = 0;
                class51.field1294 = 2;
                class66.field1773 = class1.field42;
                class56.field1453.method642(22, false);
                class56.field1453.method351(class111.field2736, 66);
                class56.field1453.method302(class72.field1896, arg1 - 6349);
                class56.field1453.method321(var4, (byte) 111);
                class56.field1453.method310((byte) 82, class101.field2622);
            }
        }
        if (var5 == 27) {
            class97.field2520++;
            class56.field1453.method642(176, false);
            class56.field1453.method349(var3, arg1 ^ 0x72D2);
            class56.field1453.method302(var4, arg1 - 6349);
            class56.field1453.method310((byte) 75, var2);
            class114.field2877 = 0;
            class83.field2191 = 2;
            class102.field2647 = var2;
            if (var3 >> 16 == class93.field2472) {
                class83.field2191 = 1;
            }
            if (var3 >> 16 == class117.field2939) {
                class83.field2191 = 3;
            }
            class44.field1156 = var3;
        }
        if (var5 == 30 && class48.method398(var4, var2, false, var3)) {
            class56.field1453.method642(185, false);
            class56.field1453.method316(128, class111.field2736);
            class56.field1453.method302(var4 >> 14 & 0x7FFF, arg1 ^ 0x19CD);
            class56.field1453.method348((byte) -81, class20.field494 + var2);
            class56.field1453.method310((byte) 103, class72.field1896);
            class56.field1453.method348((byte) -83, class101.field2622);
            class56.field1448++;
            class56.field1453.method348((byte) -74, var3 + class86.field2295);
        }
        if (var5 == 16) {
            class114 var37 = class52.field1324[var4];
            if (var37 != null) {
                class24.method196(0, 1, 0, var37.field1097[0], 2, 1, (byte) -119, class32.field833.field1105[0], var37.field1105[0], false, 0, class32.field833.field1097[0]);
                class130.field3135 = class115.field2901;
                class97.field2511++;
                class60.field1618 = 0;
                class51.field1294 = 2;
                class66.field1773 = class1.field42;
                class56.field1453.method642(146, false);
                class56.field1453.method321(var4, (byte) 125);
            }
        }
        if (var5 == 56) {
            class114 var38 = class52.field1324[var4];
            if (var38 != null) {
                class116.field2914++;
                class24.method196(0, 1, 0, var38.field1097[0], 2, 1, (byte) -115, class32.field833.field1105[0], var38.field1105[0], false, 0, class32.field833.field1097[0]);
                class51.field1294 = 2;
                class66.field1773 = class1.field42;
                class130.field3135 = class115.field2901;
                class60.field1618 = 0;
                class56.field1453.method642(234, false);
                class56.field1453.method348((byte) -118, var4);
            }
        }
        if (var5 == 52) {
            class129 var39 = class31.field817[var4];
            if (var39 != null) {
                class78.field2077++;
                class24.method196(0, 1, 0, var39.field1097[0], 2, 1, (byte) -126, class32.field833.field1105[0], var39.field1105[0], false, 0, class32.field833.field1097[0]);
                class60.field1618 = 0;
                class51.field1294 = 2;
                class66.field1773 = class1.field42;
                class130.field3135 = class115.field2901;
                class56.field1453.method642(200, false);
                class56.field1453.method310((byte) 126, var4);
            }
        }
        if (var5 == 1006) {
            class130.field3135 = class115.field2901;
            class60.field1618 = 0;
            class51.field1294 = 2;
            class66.field1773 = class1.field42;
            class22.field543++;
            class56.field1453.method642(23, false);
            class56.field1453.method302(var4 >> 14 & 0x7FFF, 128);
        }
        if (var5 == 12) {
            class24.method195(true, class51.field1312);
            class51.field1312 = -1;
            class39.field996 = true;
        }
        if (var5 == 53) {
            client.field382 = 1;
            class111.field2736 = var3;
            class72.field1896 = var2;
            class101.field2622 = var4;
            class101.field2634 = class21.method172(-45, new class65[] { class58.field1586, class81.method715(false, var4).field1482, class90.field2380 });
            class101.field2635 = 0;
            if (class101.field2634 == null) {
                class101.field2634 = class76.field2027;
            }
            class116.field2910 = true;
            return;
        }
        if (var5 == 8) {
            class43.field1135++;
            class56.field1453.method642(96, false);
            class56.field1453.method302(var4, arg1 - 6349);
            class56.field1453.method348((byte) 59, var2);
            class56.field1453.method349(var3, arg1 ^ 0x72D2);
            class114.field2877 = 0;
            class102.field2647 = var2;
            class44.field1156 = var3;
            class83.field2191 = 2;
            if (var3 >> 16 == class93.field2472) {
                class83.field2191 = 1;
            }
            if (var3 >> 16 == class117.field2939) {
                class83.field2191 = 3;
            }
        }
        if (var5 == 1002) {
            class130.field3135 = class115.field2901;
            class4.field86++;
            class51.field1294 = 2;
            class60.field1618 = 0;
            class66.field1773 = class1.field42;
            class56.field1453.method642(232, false);
            class56.field1453.method310((byte) 113, var4);
        }
        if (var5 == 41) {
            class114 var40 = class52.field1324[var4];
            if (var40 != null) {
                class12.field240++;
                class24.method196(0, 1, 0, var40.field1097[0], 2, 1, (byte) -111, class32.field833.field1105[0], var40.field1105[0], false, 0, class32.field833.field1097[0]);
                class51.field1294 = 2;
                class60.field1618 = 0;
                class66.field1773 = class1.field42;
                class130.field3135 = class115.field2901;
                class56.field1453.method642(43, false);
                class56.field1453.method321(var4, (byte) 118);
            }
        }
        if (var5 == 42) {
            class129 var41 = class31.field817[var4];
            if (var41 != null) {
                class24.method196(0, 1, 0, var41.field1097[0], 2, 1, (byte) -106, class32.field833.field1105[0], var41.field1105[0], false, 0, class32.field833.field1097[0]);
                class130.field3135 = class115.field2901;
                class70.field1808++;
                class60.field1618 = 0;
                class51.field1294 = 2;
                class66.field1773 = class1.field42;
                class56.field1453.method642(252, false);
                class56.field1453.method321(var4, (byte) 104);
                class56.field1453.method327(class98.field2533, (byte) 91);
            }
        }
        if (var5 == 26) {
            class114 var42 = class52.field1324[var4];
            if (var42 != null) {
                class24.method196(0, 1, 0, var42.field1097[0], 2, 1, (byte) -108, class32.field833.field1105[0], var42.field1105[0], false, 0, class32.field833.field1097[0]);
                class48.field1255++;
                class60.field1618 = 0;
                class66.field1773 = class1.field42;
                class130.field3135 = class115.field2901;
                class51.field1294 = 2;
                class56.field1453.method642(21, false);
                class56.field1453.method321(var4, (byte) 103);
            }
        }
        if (var5 == 28) {
            boolean var43 = class24.method196(0, 0, 0, var3, 2, 0, (byte) -117, class32.field833.field1105[0], var2, false, 0, class32.field833.field1097[0]);
            class66.field1770++;
            if (!var43) {
                class24.method196(0, 1, 0, var3, 2, 1, (byte) -112, class32.field833.field1105[0], var2, false, 0, class32.field833.field1097[0]);
            }
            class66.field1773 = class1.field42;
            class51.field1294 = 2;
            class130.field3135 = class115.field2901;
            class60.field1618 = 0;
            class56.field1453.method642(91, false);
            class56.field1453.method321(class101.field2622, (byte) 124);
            class56.field1453.method302(var4, 128);
            class56.field1453.method348((byte) 61, class72.field1896);
            class56.field1453.method327(class111.field2736, (byte) 91);
            class56.field1453.method302(class20.field494 + var2, 128);
            class56.field1453.method310((byte) 96, class86.field2295 + var3);
        }
        if (arg1 != 6477) {
            return;
        }
        if (var5 == 1003) {
            class48.method398(var4, var2, false, var3);
            class56.field1453.method642(255, false);
            class56.field1453.method321(var2 + class20.field494, (byte) 116);
            class43.field1136++;
            class56.field1453.method302(var3 + class86.field2295, 128);
            class56.field1453.method310((byte) 107, var4 >> 14 & 0x7FFF);
        }
        if (var5 == 31) {
            class65 var45 = class29.field783[arg0];
            int var46 = var45.method540(-49, class90.field2380);
            if (var46 != -1) {
                if (class93.field2472 == -1) {
                    class13.method79((byte) -92);
                    if (class20.field493 != -1) {
                        class100.field2599 = var45.method539(-27693, var46 + 5).method543((byte) -92);
                        class53.field1345 = class93.field2472 = class20.field493;
                        class78.field2088 = false;
                    }
                } else {
                    class101.method841(class39.field1036, 0, class100.field2591, arg1 ^ 0x30B2);
                }
            }
        }
        if (var5 == 15) {
            class13.method79((byte) -93);
        }
        if (var5 == 11 && class48.method398(var4, var2, false, var3)) {
            class4.field83++;
            class56.field1453.method642(75, false);
            class56.field1453.method327(class98.field2533, (byte) 91);
            class56.field1453.method321(var4 >> 14 & 0x7FFF, (byte) 122);
            class56.field1453.method321(var2 + class20.field494, (byte) 102);
            class56.field1453.method302(class86.field2295 + var3, 128);
        }
        if (var5 == 51) {
            class48.method398(var4, var2, false, var3);
            class125.field3038++;
            class56.field1453.method642(158, false);
            class56.field1453.method310((byte) 121, var2 + class20.field494);
            class56.field1453.method348((byte) 65, class86.field2295 + var3);
            class56.field1453.method302(var4 >> 14 & 0x7FFF, 128);
        }
        if (var5 == 2 || var5 == 4 || var5 == 32 || var5 == 9) {
            class65 var47 = class29.field783[arg0];
            int var48 = var47.method540(arg1 ^ 0xFFFFE682, class90.field2380);
            if (var48 != -1) {
                long var49 = var47.method539(-27693, var48 + 5).method543((byte) -82).method530((byte) -79);
                if (var5 == 2) {
                    class87.method777(true, var49);
                }
                if (var5 == 4) {
                    class75.method670((byte) -118, var49);
                }
                if (var5 == 32) {
                    class80.method701(var49, arg1 - 6477);
                }
                if (var5 == 9) {
                    class74.method658(var49, false);
                }
            }
        }
        if (var5 == 49) {
            class48.field1245++;
            class56.field1453.method642(193, false);
            class56.field1453.method310((byte) 99, var4);
            class56.field1453.method327(var3, (byte) 91);
            class56.field1453.method302(var2, 128);
            class114.field2877 = 0;
            class44.field1156 = var3;
            class83.field2191 = 2;
            if (var3 >> 16 == class93.field2472) {
                class83.field2191 = 1;
            }
            class102.field2647 = var2;
            if (var3 >> 16 == class117.field2939) {
                class83.field2191 = 3;
            }
        }
        if (var5 == 50) {
            class47.field1233++;
            boolean var51 = class24.method196(0, 0, 0, var3, 2, 0, (byte) -128, class32.field833.field1105[0], var2, false, 0, class32.field833.field1097[0]);
            if (!var51) {
                class24.method196(0, 1, 0, var3, 2, 1, (byte) -116, class32.field833.field1105[0], var2, false, 0, class32.field833.field1097[0]);
            }
            class66.field1773 = class1.field42;
            class130.field3135 = class115.field2901;
            class60.field1618 = 0;
            class51.field1294 = 2;
            class56.field1453.method642(112, false);
            class56.field1453.method327(class98.field2533, (byte) 91);
            class56.field1453.method348((byte) 58, var4);
            class56.field1453.method310((byte) 77, class86.field2295 + var3);
            class56.field1453.method321(class20.field494 + var2, (byte) 115);
        }
        if (var5 == 1005) {
            class51.field1294 = 2;
            class60.field1618 = 0;
            class66.field1773 = class1.field42;
            class130.field3135 = class115.field2901;
            class129 var53 = class31.field817[var4];
            if (var53 != null) {
                class55 var54 = var53.field3126;
                if (var54.field1403 != null) {
                    var54 = var54.method443(0);
                }
                if (var54 != null) {
                    class56.field1453.method642(132, false);
                    class56.field1453.method302(var54.field1439, arg1 - 6349);
                    class77.field2056++;
                }
            }
        }
        if (var5 == 3 && !class13.field278) {
            class56.field1453.method642(101, false);
            class13.field278 = true;
            class100.field2601++;
        }
        if (var5 == 39) {
            boolean var55 = class24.method196(0, 0, 0, var3, 2, 0, (byte) -107, class32.field833.field1105[0], var2, false, 0, class32.field833.field1097[0]);
            class117.field2937++;
            if (!var55) {
                class24.method196(0, 1, 0, var3, 2, 1, (byte) -124, class32.field833.field1105[0], var2, false, 0, class32.field833.field1097[0]);
            }
            class51.field1294 = 2;
            class60.field1618 = 0;
            class66.field1773 = class1.field42;
            class130.field3135 = class115.field2901;
            class56.field1453.method642(239, false);
            class56.field1453.method302(var4, 128);
            class56.field1453.method348((byte) 35, class86.field2295 + var3);
            class56.field1453.method348((byte) -88, class20.field494 + var2);
        }
        if (var5 == 38) {
            class91.field2397++;
            class56.field1453.method642(175, false);
            class56.field1453.method316(128, var3);
            class56.field1453.method348((byte) 23, var2);
            class56.field1453.method302(var4, arg1 ^ 0x19CD);
            class114.field2877 = 0;
            class44.field1156 = var3;
            class102.field2647 = var2;
            class83.field2191 = 2;
            if (var3 >> 16 == class93.field2472) {
                class83.field2191 = 1;
            }
            if (var3 >> 16 == class117.field2939) {
                class83.field2191 = 3;
            }
        }
        if (var5 == 24) {
            class33.field846++;
            class56.field1453.method642(32, false);
            class56.field1453.method351(var3, arg1 - 6377);
            class27 var57 = class110.method903(var3, arg1 - 6579);
            if (var57.field717 != null && var57.field717[0][0] == 5) {
                int var58 = var57.field717[0][1];
                class32.field843[var58] = 1 - class32.field843[var58];
                class32.method254(-96, var58);
                class116.field2910 = true;
            }
        }
        if (var5 == 1) {
            boolean var59 = class24.method196(0, 0, 0, var3, 2, 0, (byte) -112, class32.field833.field1105[0], var2, false, 0, class32.field833.field1097[0]);
            class21.field501++;
            if (!var59) {
                class24.method196(0, 1, 0, var3, 2, 1, (byte) -125, class32.field833.field1105[0], var2, false, 0, class32.field833.field1097[0]);
            }
            class66.field1773 = class1.field42;
            class130.field3135 = class115.field2901;
            class60.field1618 = 0;
            class51.field1294 = 2;
            class56.field1453.method642(44, false);
            class56.field1453.method310((byte) 101, class86.field2295 + var3);
            class56.field1453.method310((byte) 125, class20.field494 + var2);
            class56.field1453.method310((byte) 115, var4);
        }
        if (var5 == 40) {
            class129 var61 = class31.field817[var4];
            if (var61 != null) {
                class83.field2178++;
                class24.method196(0, 1, 0, var61.field1097[0], 2, 1, (byte) -126, class32.field833.field1105[0], var61.field1105[0], false, 0, class32.field833.field1097[0]);
                class60.field1618 = 0;
                class51.field1294 = 2;
                class130.field3135 = class115.field2901;
                class66.field1773 = class1.field42;
                class56.field1453.method642(11, false);
                class56.field1453.method348((byte) -114, var4);
            }
        }
        if (var5 == 47) {
            class62.field1643++;
            class48.method398(var4, var2, false, var3);
            class56.field1453.method642(63, false);
            class56.field1453.method348((byte) 76, class20.field494 + var2);
            class56.field1453.method310((byte) 106, class86.field2295 + var3);
            class56.field1453.method348((byte) 122, var4 >> 14 & 0x7FFF);
        }
        if (var5 == 29) {
            class130.field3130++;
            class56.field1453.method642(80, false);
            class56.field1453.method348((byte) 98, var4);
            class56.field1453.method348((byte) -98, var2);
            class56.field1453.method351(var3, -66);
            class44.field1156 = var3;
            class114.field2877 = 0;
            class102.field2647 = var2;
            class83.field2191 = 2;
            if (var3 >> 16 == class93.field2472) {
                class83.field2191 = 1;
            }
            if (var3 >> 16 == class117.field2939) {
                class83.field2191 = 3;
            }
        }
        if (var5 == 21) {
            class13.field261++;
            class56.field1453.method642(160, false);
            class56.field1453.method310((byte) 99, var4);
            class56.field1453.method348((byte) -72, var2);
            class56.field1453.method351(var3, -85);
            class44.field1156 = var3;
            class83.field2191 = 2;
            if (var3 >> 16 == class93.field2472) {
                class83.field2191 = 1;
            }
            class114.field2877 = 0;
            class102.field2647 = var2;
            if (var3 >> 16 == class117.field2939) {
                class83.field2191 = 3;
            }
        }
        if (var5 == 34) {
            class129 var62 = class31.field817[var4];
            if (var62 != null) {
                class24.method196(0, 1, 0, var62.field1097[0], 2, 1, (byte) -128, class32.field833.field1105[0], var62.field1105[0], false, 0, class32.field833.field1097[0]);
                class130.field3135 = class115.field2901;
                class60.field1618 = 0;
                class51.field1294 = 2;
                class66.field1773 = class1.field42;
                class56.field1453.method642(209, false);
                class31.field805++;
                class56.field1453.method348((byte) 35, var4);
            }
        }
        if (var5 == 25) {
            class56.field1453.method642(45, false);
            class56.field1453.method348((byte) -94, var4);
            class56.field1453.method302(var2, 128);
            class56.field1453.method349(var3, 27551);
            class121.field2977++;
            class102.field2647 = var2;
            class44.field1156 = var3;
            class83.field2191 = 2;
            if (var3 >> 16 == class93.field2472) {
                class83.field2191 = 1;
            }
            class114.field2877 = 0;
            if (var3 >> 16 == class117.field2939) {
                class83.field2191 = 3;
            }
        }
        if (var5 == 18) {
            class31.field808++;
            class48.method398(var4, var2, false, var3);
            class56.field1453.method642(59, false);
            class56.field1453.method302(class20.field494 + var2, 128);
            class56.field1453.method310((byte) 102, class86.field2295 + var3);
            class56.field1453.method321(var4 >> 14 & 0x7FFF, (byte) 119);
        }
        if (var5 == 20) {
            if (class24.field614) {
                class89.field2377.method609(var2 - 4, var3 - 4);
            } else {
                class89.field2377.method609(class1.field42 - 4, class115.field2901 + -4);
            }
        }
        if (var5 == 22) {
            class56.field1453.method642(111, false);
            class52.field1316++;
            class56.field1453.method348((byte) -89, var2);
            class56.field1453.method316(128, var3);
            class56.field1453.method302(var4, 128);
            class56.field1453.method351(class98.field2533, arg1 - 6422);
            class83.field2191 = 2;
            if (var3 >> 16 == class93.field2472) {
                class83.field2191 = 1;
            }
            class114.field2877 = 0;
            class102.field2647 = var2;
            if (var3 >> 16 == class117.field2939) {
                class83.field2191 = 3;
            }
            class44.field1156 = var3;
        }
        if (var5 == 6) {
            class56.field1453.method642(53, false);
            class56.field1453.method351(var3, 60);
            class56.field1453.method348((byte) -107, var2);
            class56.field1453.method321(var4, (byte) 126);
            class114.field2877 = 0;
            class102.field2647 = var2;
            class23.field550++;
            class83.field2191 = 2;
            class44.field1156 = var3;
            if (var3 >> 16 == class93.field2472) {
                class83.field2191 = 1;
            }
            if (var3 >> 16 == class117.field2939) {
                class83.field2191 = 3;
            }
        }
        if (client.field382 != 0) {
            client.field382 = 0;
            class116.field2910 = true;
        }
        if (class101.field2635 != 0) {
            class101.field2635 = 0;
            class116.field2910 = true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
    public abstract void method86(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public abstract void method90(byte arg0);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BZI[B)V")
    public abstract void method89(byte arg0, boolean arg1, int arg2, byte[] arg3);

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V")
    public abstract void method85(byte arg0);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)V")
    public abstract void method88(int arg0, byte arg1);

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(B)V")
    public abstract void method87(byte arg0);
}
