import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class163 {

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field2411 = 0;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2415 = "";

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Z")
    public static boolean field2414;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "[[[B")
    public static byte[][][] field2408;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 6)
    public static void method1215(byte arg0) {
        field2415 = null;
        if (arg0 != -43) {
            method1218((byte) 5);
        }
        field2408 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIZZ)V", line = 18)
    public static final void method1216(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        class368.field5054 = arg1;
        class16.field190 = arg2;
        class303.field4107 = arg3;
        class95.field1380 = new class224[arg0][class368.field5054][class16.field190];
        class265.field3566 = new class411[4];
        if (arg4) {
            class73.field1097 = new class224[1][class368.field5054][class16.field190];
            class122.field1712 = new int[class368.field5054][class16.field190];
            class244.field3367 = new class411[1];
        } else {
            class73.field1097 = null;
            class122.field1712 = null;
            class244.field3367 = null;
        }
        if (arg5) {
            class39.field603 = new int[arg0][arg1][arg2];
            class30.field511 = new class21[255];
            class183.field2663 = new boolean[255];
            class339.field4631 = 0;
        } else {
            class39.field603 = null;
            class30.field511 = null;
            class183.field2663 = null;
            class339.field4631 = 0;
        }
        class269.method1727(false);
        class421.field5894 = new class76[500];
        class223.field3091 = 0;
        class147.field2262 = new class76[500];
        class273.field3670 = 0;
        class144.field2184 = new int[arg0][class368.field5054 + 1][class16.field190 + 1];
        class396.field5544 = new class228[5000];
        class275.field3692 = 0;
        class227.field3147 = new boolean[class303.field4107 + class303.field4107 + 1][class303.field4107 + class303.field4107 + 1];
        class400.field5594 = new boolean[class303.field4107 + class303.field4107 + 2][class303.field4107 + class303.field4107 + 2];
        class277.field3731 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V", line = 67)
    public static final void method1217(int arg0, int arg1, int arg2) {
        class125.field1744[arg2] = arg0;
        if (arg1 != 0) {
            field2409 = -51;
        }
        field2416++;
        class60 var3 = (class60) class184.field2671.method614(arg1 - 102, (long) arg2);
        if (var3 == null) {
            class60 var4 = new class60(4611686018427387905L);
            class184.field2671.method612((long) arg2, -1, var4);
        } else if (var3.field937 != 4611686018427387905L) {
            var3.field937 = class108.method902((byte) -93) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V", line = 99)
    public static final void method1218(byte arg0) {
        class22.field405.method1250(10346);
        field2410++;
        for (class63 var1 = (class63) class268.field3613.method1240((byte) -72); var1 != null; var1 = (class63) class268.field3613.method1245(arg0 ^ 0xFFFFFFCF)) {
            if (var1.field966 < 1000) {
                var1.method2367(5);
                class22.field405.method1249(var1, (byte) -114);
            }
        }
        if (arg0 != -50) {
            field2408 = null;
        }
        class22.field405.method1236(class268.field3613, (byte) 18);
        if (class94.field1370 != null || class305.field4133 != null || class177.field2611 > 0) {
            return;
        }
        int var2 = class52.field844;
        if (!class94.field1369) {
            if (var2 == 1 && class415.field5808 > 0) {
                int var17 = ((class63) class268.field3613.field2454.field5348).field966;
                if (var17 == 21 || var17 == 40 || var17 == 34 || var17 == 1 || var17 == 18 || var17 == 10 || var17 == 13 || var17 == 49 || var17 == 5 || var17 == 16 || var17 == 31 || var17 == 1006) {
                    class63 var18 = (class63) class268.field3613.field2454.field5348;
                    class139 var19 = class10.method57(arg0 + 65585, var18.field958);
                    class126 var20 = client.method1648(var19);
                    if (var20.method988(arg0 - 758913074)) {
                        class278.field3741 = false;
                        class358.field4855 = 0;
                        if (class94.field1370 != null) {
                            class10.method52(class94.field1370, (byte) -89);
                        }
                        class94.field1370 = class10.method57(65535, var18.field958);
                        class52.field853 = class177.field2609;
                        class138.field1948 = class94.field1365;
                        class298.field4015 = var18.field961;
                        class10.method52(class94.field1370, (byte) -89);
                        return;
                    }
                }
            }
            if (var2 <= 0 && class28.field484 > 0) {
                var2 = class28.field484;
            }
            class28.field484 = 0;
            if (var2 == 1 && (class258.field3482 == 1 && class415.field5808 > 2 || class380.method2366((byte) -61))) {
                var2 = 2;
            }
            if (var2 == 2 && class415.field5808 > 0) {
                class74.method639((byte) -4);
            }
            if (var2 != 1 || class415.field5808 <= 0) {
                return;
            }
            class55.method518(11580);
            return;
        }
        if (var2 != 1) {
            int var3 = class391.field5490;
            int var4 = class312.field4220;
            if ((class381.field5345 - 10) > var3 || class381.field5345 + class277.field3735 + 10 < var3 || var4 < (class127.field1791 - 10) || var4 > class236.field3264 + class127.field1791 + 10) {
                class94.field1369 = false;
                class215.method1471(0, class127.field1791, class381.field5345, class277.field3735, class236.field3264);
            }
        }
        if (var2 != 1) {
            return;
        }
        int var5 = class381.field5345;
        int var6 = class127.field1791;
        int var7 = class277.field3735;
        int var8 = class94.field1365;
        int var9 = class177.field2609;
        int var10 = -1;
        for (int var11 = 0; var11 < class415.field5808; var11++) {
            if (class427.field6056) {
                int var16 = (class415.field5808 - var11 - 1) * 16 + var6 + 33;
                if (var8 > var5 && var8 < (var5 + var7) && var9 > var16 - 13 && var9 < (var16 + 3)) {
                    var10 = var11;
                }
            } else {
                int var15 = (class415.field5808 - var11 - 1) * 16 + var6 + 31;
                if (var5 < var8 && (var5 + var7) > var8 && var9 > var15 - 13 && var9 < var15 + 3) {
                    var10 = var11;
                }
            }
        }
        if (var10 != -1) {
            int var12 = 0;
            class204 var13 = new class204(class268.field3613);
            for (class63 var14 = (class63) var13.method1418((byte) 99); var14 != null; var14 = (class63) var13.method1421((byte) 74)) {
                if (var10 == var12) {
                    class37.method370(var14, 0);
                }
                var12++;
            }
        }
        class94.field1369 = false;
        class215.method1471(0, class127.field1791, class381.field5345, class277.field3735, class236.field3264);
        return;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZI)B", line = 279)
    public static final byte method1219(int arg0, boolean arg1, int arg2) {
        field2405++;
        if (arg0 == 9) {
            if (!arg1) {
                method1222(115, (byte) -128, 73, -11, (class391) null, (class372) null);
            }
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V", line = 298)
    public static final void method1220(boolean arg0) {
        field2413++;
        if (arg0) {
            field2415 = null;
        }
        for (int var1 = 0; var1 < class166.field2464; var1++) {
            int var2 = class344.field4664[var1];
            class127 var3 = class298.field4012[var2];
            int var4 = class417.field5851.method1861((byte) -72);
            if ((var4 & 0x10) != 0) {
                var4 += class417.field5851.method1861((byte) -72) << 8;
            }
            if ((var4 & 0x400) != 0) {
                var3.field4916 = class417.field5851.method1873(-8409);
                var3.field4932 = class417.field5851.method1873(-8409);
            }
            if ((var4 & 0x2) != 0) {
                int var5 = class417.field5851.method1821(-80);
                int var6 = class417.field5851.method1829(24185);
                var3.method2269(4, var5, var6, class414.field5793);
            }
            if ((var4 & 0x200) != 0) {
                int var7 = class417.field5851.method1829(24185);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; var11++) {
                    int var12 = class417.field5851.method1873(-8409);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    var8[var11] = var12;
                    var9[var11] = class417.field5851.method1829(24185);
                    var10[var11] = class417.field5851.method1873(-8409);
                }
                class249.method1621(var8, var10, var3, var9, 0);
            }
            if ((var4 & 0x20) != 0) {
                int var13 = class417.field5851.method1853(-78);
                int var14 = class417.field5851.method1832(81);
                if (var13 == 65535) {
                    var13 = -1;
                }
                boolean var15 = true;
                if (var13 != -1 && var3.field4974 != -1) {
                    if (var3.field4974 == var13) {
                        class282 var20 = class71.method613(var13, (byte) -109);
                        if (var20.field3768 && var20.field3765 != -1) {
                            class209 var21 = class288.method1819(var20.field3765, (byte) 105);
                            int var22 = var21.field2917;
                            if (var22 == 0) {
                                var15 = false;
                            } else if (var22 == 1) {
                                var15 = true;
                            } else if (var22 == 2) {
                                var15 = false;
                                var3.field4962 = 0;
                            }
                        }
                    } else {
                        class282 var16 = class71.method613(var13, (byte) -112);
                        class282 var17 = class71.method613(var3.field4974, (byte) -122);
                        if (var16.field3765 != -1 && var17.field3765 != -1) {
                            class209 var18 = class288.method1819(var16.field3765, (byte) 105);
                            class209 var19 = class288.method1819(var17.field3765, (byte) 105);
                            if (var18.field2906 < var19.field2906) {
                                var15 = false;
                            }
                        }
                    }
                }
                if (var15) {
                    var3.field4931 = var14 >> 16;
                    var3.field4971 = 0;
                    var3.field4933 = (var14 & 0xFFFF) + class414.field5793;
                    var3.field4974 = var13;
                    var3.field4965 = 0;
                    var3.field4978 = 1;
                    if (class414.field5793 < var3.field4933) {
                        var3.field4965 = -1;
                    }
                    if (var3.field4974 != -1 && class414.field5793 == var3.field4933) {
                        int var23 = class71.method613(var3.field4974, (byte) -73).field3765;
                        if (var23 != -1) {
                            class209 var24 = class288.method1819(var23, (byte) 105);
                            if (var24 != null && var24.field2915 != null) {
                                class232.method1547(13238, var24, var3.field3167, false, 0, var3.field3176);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field4988 = class417.field5851.method1825(-109);
                if (var3.field4988 == 65535) {
                    var3.field4988 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var25 = class417.field5851.method1873(-8409);
                if (var25 == 65535) {
                    var25 = -1;
                }
                int var26 = class417.field5851.method1852((byte) -21);
                class373.method2332(-103, var3, var26, var25);
            }
            if ((var4 & 0x100) != 0) {
                int var27 = class417.field5851.method1873(-8409);
                var3.field4943 = class417.field5851.method1840((byte) -76);
                var3.field4930 = class417.field5851.method1861((byte) -72);
                var3.field4920 = (var27 & 0x8000) != 0;
                var3.field4950 = var27 & 0x7FFF;
                var3.field4954 = class414.field5793 + var3.field4950 + var3.field4943;
            }
            if ((var4 & 0x8) != 0) {
                if (var3.field1784.method80((byte) -123)) {
                    class322.method2043(0, var3);
                }
                var3.method993(class330.method2102(class417.field5851.method1828((byte) -32), -118), 128);
                var3.method2282((byte) -111, var3.field1784.field133);
                var3.field4953 = var3.field1784.field115 << 3;
                if (var3.field1784.method80((byte) -123)) {
                    class199.method1410(var3, var3.field5005[0], class69.field1046, (class338) null, (class372) null, 1, var3.field4998[0], 0);
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field4975 = class417.field5851.method1871(-1);
                var3.field4969 = 100;
            }
            if ((var4 & 0x40) != 0) {
                int var28 = class417.field5851.method1821(-100);
                int var29 = class417.field5851.method1840((byte) -81);
                var3.method2269(4, var28, var29, class414.field5793);
                var3.field4935 = class414.field5793 + 300;
                var3.field4951 = class417.field5851.method1829(24185);
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 543)
    public static final void method1221(int arg0) {
        field2412++;
        if (arg0 != 32768) {
            field2411 = 74;
        }
        class81.field1207.method2533(0);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBIILpe;Lkk;)V", line = 557)
    public static final void method1222(int arg0, byte arg1, int arg2, int arg3, class391 arg4, class372 arg5) {
        field2407++;
        class38 var6 = class372.method2330(arg5.field5161, 34);
        if (var6.field575 == -1) {
            return;
        }
        int var7;
        if (arg5.field5173) {
            int var8 = arg5.field5172 + arg2;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class80 var9 = var6.method377(arg5.field5190, (byte) 119, var7, arg4);
        if (var9 == null) {
            return;
        }
        int var10 = arg5.field5206;
        int var11 = arg5.field5147;
        if ((var7 & 0x1) == 1) {
            var10 = arg5.field5147;
            var11 = arg5.field5206;
        }
        int var12 = var9.method740();
        int var13 = var9.method739();
        if (arg1 != -58) {
            method1215((byte) 19);
        }
        if (var6.field574) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field580 == 0) {
            var9.method729(arg0, arg3 + 4 - (var11 * 4), var12, var13);
        } else {
            var9.method726(arg0, arg3 + 4 - (var11 * 4), var12, var13, 1, var6.field580 | 0xFF000000, 1);
        }
    }
}
