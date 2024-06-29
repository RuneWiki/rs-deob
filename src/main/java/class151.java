import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class151 extends class93 {

    @OriginalMember(owner = "client!ph", name = "lb", descriptor = "I")
    private int field3005 = 0;

    @OriginalMember(owner = "client!ph", name = "gb", descriptor = "I")
    private int field3000 = 4096;

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "Ljd;")
    public static class92 field2987 = class202.method1325((byte) 90, "(U2");

    @OriginalMember(owner = "client!ph", name = "cb", descriptor = "I")
    public static int field2996 = 255;

    @OriginalMember(owner = "client!ph", name = "ab", descriptor = "I")
    public static int field2994 = 0;

    @OriginalMember(owner = "client!ph", name = "fb", descriptor = "Ljd;")
    private static class92 field2999 = class202.method1325((byte) 90, "Checking for updates )2 ");

    @OriginalMember(owner = "client!ph", name = "W", descriptor = "Ljd;")
    public static class92 field2990 = field2999;

    @OriginalMember(owner = "client!ph", name = "kb", descriptor = "Ljd;")
    private static class92 field3004 = class202.method1325((byte) 90, "K");

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "Ljd;")
    public static class92 field2986 = field3004;

    @OriginalMember(owner = "client!ph", name = "mb", descriptor = "Ljd;")
    public static class92 field3006 = class202.method1325((byte) 90, "Bitte geben Sie Ihren Benutzernamen ein)3");

    @OriginalMember(owner = "client!ph", name = "hb", descriptor = "Ljd;")
    public static class92 field3001 = field3004;

    @OriginalMember(owner = "client!ph", name = "eb", descriptor = "Ljd;")
    public static class92 field2998 = class202.method1325((byte) 90, "(U(Y");

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!ph", name = "X", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!ph", name = "Y", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!ph", name = "bb", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!ph", name = "db", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!ph", name = "ib", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!ph", name = "jb", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!ph", name = "nb", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!ph", name = "V", descriptor = "Z")
    public static boolean field2989;

    @OriginalMember(owner = "client!ph", name = "Z", descriptor = "[[Z")
    public static boolean[][] field2993;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (arg2 != 0) {
            this.method62(83, 13);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field1885 = ~arg1.method443(arg2 + 255) == -2;
                }
            } else {
                this.field3000 = arg1.method442(-21351);
            }
        } else {
            this.field3005 = arg1.method442(-21351);
        }
        ++field2997;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILqd;I)V")
    public static final void method970(int arg0, class156 arg1, int arg2) {
        Object[] var3 = arg1.field3108;
        int var4 = (Integer) var3[0];
        ++field3007;
        class120 var5 = class170.method1129(60, var4);
        if (var5 != null) {
            class177.field3403 = 0;
            int var6 = 0;
            if (arg2 != 4) {
                method970(-118, (class156) null, -41);
            }
            int var7 = -1;
            int var8 = 0;
            int[] var9 = var5.field2439;
            byte var10 = -1;
            int[] var11 = var5.field2429;
            try {
                class20.field489 = new class92[var5.field2441];
                class114.field2306 = new int[var5.field2431];
                int var12 = 0;
                int var13 = 0;
                for (int var14 = 1; var14 < var3.length; ++var14) {
                    if (!(var3[var14] instanceof Integer)) {
                        if (var3[var14] instanceof class92) {
                            class92 var15 = (class92) var3[var14];
                            if (var15.method631(5003, class190.field3618)) {
                                var15 = arg1.field3104;
                            }
                            class20.field489[var13++] = var15;
                        }
                    } else {
                        int var16 = (Integer) var3[var14];
                        if (~var16 == 2147483646) {
                            var16 = arg1.field3107;
                        }
                        if (var16 == -2147483646) {
                            var16 = arg1.field3102;
                        }
                        if (var16 == -2147483645) {
                            var16 = arg1.field3103 == null ? -1 : arg1.field3103.field100;
                        }
                        if (~var16 == 2147483643) {
                            var16 = arg1.field3105;
                        }
                        if (~var16 == 2147483642) {
                            var16 = arg1.field3103 != null ? arg1.field3103.field90 : -1;
                        }
                        if (~var16 == 2147483641) {
                            var16 = arg1.field3097 != null ? arg1.field3097.field100 : -1;
                        }
                        if (~var16 == 2147483640) {
                            var16 = arg1.field3097 != null ? arg1.field3097.field90 : -1;
                        }
                        if (~var16 == 2147483639) {
                            var16 = arg1.field3101;
                        }
                        if (~var16 == 2147483638) {
                            var16 = arg1.field3110;
                        }
                        class114.field2306[var12++] = var16;
                    }
                }
                int var17 = 0;
                label2232: while (true) {
                    ++var17;
                    if (~var17 < ~arg0) {
                        throw new RuntimeException("slow");
                    }
                    ++var7;
                    int var318 = var9[var7];
                    if (~var318 > -101) {
                        if (var318 == 0) {
                            class61.field1266[var6++] = var11[var7];
                            continue;
                        }
                        if (~var318 == -2) {
                            int var18 = var11[var7];
                            class61.field1266[var6++] = class165.field3242[var18];
                            continue;
                        }
                        if (~var318 == -3) {
                            int var19 = var11[var7];
                            --var6;
                            class165.field3242[var19] = class61.field1266[var6];
                            continue;
                        }
                        if (var318 == 3) {
                            class59.field1227[var8++] = var5.field2440[var7];
                            continue;
                        }
                        if (var318 == 6) {
                            var7 += var11[var7];
                            continue;
                        }
                        if (~var318 == -8) {
                            var6 -= 2;
                            if (~class61.field1266[var6 + 1] != ~class61.field1266[var6]) {
                                var7 += var11[var7];
                            }
                            continue;
                        }
                        if (var318 == 8) {
                            var6 -= 2;
                            if (class61.field1266[var6 + 1] == class61.field1266[var6]) {
                                var7 += var11[var7];
                            }
                            continue;
                        }
                        if (var318 == 9) {
                            var6 -= 2;
                            if (class61.field1266[var6 - -1] > class61.field1266[var6]) {
                                var7 += var11[var7];
                            }
                            continue;
                        }
                        if (~var318 == -11) {
                            var6 -= 2;
                            if (class61.field1266[var6] > class61.field1266[var6 + 1]) {
                                var7 += var11[var7];
                            }
                            continue;
                        }
                        if (var318 == 21) {
                            if (class177.field3403 == 0) {
                                return;
                            }
                            class53 var20 = class77.field1597[--class177.field3403];
                            class20.field489 = var20.field1115;
                            var7 = var20.field1111;
                            class114.field2306 = var20.field1106;
                            var5 = var20.field1113;
                            var11 = var5.field2429;
                            var9 = var5.field2439;
                            continue;
                        }
                        if (var318 == 25) {
                            int var21 = var11[var7];
                            class61.field1266[var6++] = class30.method186(var21, (byte) -76);
                            continue;
                        }
                        if (var318 == 27) {
                            int var22 = var11[var7];
                            --var6;
                            class46.method289(class61.field1266[var6], var22, -18701);
                            continue;
                        }
                        if (~var318 == -32) {
                            var6 -= 2;
                            if (class61.field1266[var6] <= class61.field1266[var6 - -1]) {
                                var7 += var11[var7];
                            }
                            continue;
                        }
                        if (var318 == 32) {
                            var6 -= 2;
                            if (~class61.field1266[var6] <= ~class61.field1266[var6 + 1]) {
                                var7 += var11[var7];
                            }
                            continue;
                        }
                        if (~var318 == -34) {
                            class61.field1266[var6++] = class114.field2306[var11[var7]];
                            continue;
                        }
                        int var10001;
                        if (~var318 == -35) {
                            var10001 = var11[var7];
                            --var6;
                            class114.field2306[var10001] = class61.field1266[var6];
                            continue;
                        }
                        if (var318 == 35) {
                            class59.field1227[var8++] = class20.field489[var11[var7]];
                            continue;
                        }
                        if (var318 == 36) {
                            var10001 = var11[var7];
                            --var8;
                            class20.field489[var10001] = class59.field1227[var8];
                            continue;
                        }
                        if (var318 == 37) {
                            int var23 = var11[var7];
                            var8 -= var23;
                            class92 var24 = class129.method854(114, var23, class59.field1227, var8);
                            class59.field1227[var8++] = var24;
                            continue;
                        }
                        if (var318 == 38) {
                            --var6;
                            continue;
                        }
                        if (var318 == 39) {
                            --var8;
                            continue;
                        }
                        if (~var318 == -41) {
                            int var25 = var11[var7];
                            class120 var26 = class170.method1129(126, var25);
                            class92[] var27 = new class92[var26.field2441];
                            int[] var28 = new int[var26.field2431];
                            for (int var29 = 0; var26.field2436 > var29; ++var29) {
                                var28[var29] = class61.field1266[-var26.field2436 + var29 + var6];
                            }
                            for (int var30 = 0; var30 < var26.field2430; ++var30) {
                                var27[var30] = class59.field1227[var8 + var30 - var26.field2430];
                            }
                            var8 -= var26.field2430;
                            var6 -= var26.field2436;
                            class53 var31 = new class53();
                            var31.field1106 = class114.field2306;
                            var31.field1113 = var5;
                            var31.field1111 = var7;
                            var31.field1115 = class20.field489;
                            if (~class77.field1597.length >= ~class177.field3403) {
                                throw new RuntimeException();
                            }
                            var7 = -1;
                            class77.field1597[class177.field3403++] = var31;
                            var5 = var26;
                            var11 = var26.field2429;
                            var9 = var26.field2439;
                            class20.field489 = var27;
                            class114.field2306 = var28;
                            continue;
                        }
                        if (~var318 == -43) {
                            class61.field1266[var6++] = class155.field3093[var11[var7]];
                            continue;
                        }
                        if (~var318 == -44) {
                            var10001 = var11[var7];
                            --var6;
                            class155.field3093[var10001] = class61.field1266[var6];
                            continue;
                        }
                        if (var318 == 44) {
                            int var32 = var11[var7] >> 16;
                            int var33 = var11[var7] & 65535;
                            --var6;
                            int var34 = class61.field1266[var6];
                            if (~var34 <= -1 && var34 <= 5000) {
                                class118.field2404[var32] = var34;
                                byte var35 = -1;
                                if (~var33 == -106) {
                                    var35 = 0;
                                }
                                int var36 = 0;
                                while (true) {
                                    if (~var36 <= ~var34) {
                                        continue label2232;
                                    }
                                    class148.field2940[var32][var36] = var35;
                                    ++var36;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (~var318 == -46) {
                            int var37 = var11[var7];
                            --var6;
                            int var38 = class61.field1266[var6];
                            if (~var38 <= -1 && ~class118.field2404[var37] < ~var38) {
                                class61.field1266[var6++] = class148.field2940[var37][var38];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var318 == 46) {
                            var6 -= 2;
                            int var39 = var11[var7];
                            int var40 = class61.field1266[var6];
                            if (var40 >= 0 && ~class118.field2404[var39] < ~var40) {
                                class148.field2940[var39][var40] = class61.field1266[var6 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (~var318 == -48) {
                            class92 var41 = class142.field2822[var11[var7]];
                            if (var41 == null) {
                                var41 = class140.field2796;
                            }
                            class59.field1227[var8++] = var41;
                            continue;
                        }
                        if (var318 == 48) {
                            var10001 = var11[var7];
                            --var8;
                            class142.field2822[var10001] = class59.field1227[var8];
                            continue;
                        }
                        if (var318 == 51) {
                            class33 var42 = var5.field2424[var11[var7]];
                            --var6;
                            class130 var43 = (class130) var42.method216(-119, (long) class61.field1266[var6]);
                            if (var43 != null) {
                                var7 += var43.field2608;
                            }
                            continue;
                        }
                    }
                    boolean var44;
                    if (~var11[var7] == -2) {
                        var44 = true;
                    } else {
                        var44 = false;
                    }
                    if (~var318 <= -301) {
                        if (var318 >= 500) {
                            if (var318 >= 1000 && var318 < 1100 || ~var318 <= -2001 && var318 < 2100) {
                                class1 var45;
                                if (var318 >= 2000) {
                                    --var6;
                                    var45 = class175.method1155(class61.field1266[var6], (byte) 68);
                                    var318 -= 1000;
                                } else {
                                    var45 = var44 ? class158.field3148 : class96.field1929;
                                }
                                if (var318 == 1000) {
                                    var6 -= 2;
                                    var45.field79 = class61.field1266[var6];
                                    var45.field11 = class61.field1266[var6 + 1];
                                    class3.method21(arg2 + 26698, var45);
                                    continue;
                                }
                                if (var318 == 1001) {
                                    var6 -= 2;
                                    var45.field96 = class61.field1266[var6];
                                    var45.field28 = class61.field1266[var6 + 1];
                                    class3.method21(arg2 ^ 26698, var45);
                                    continue;
                                }
                                if (~var318 == -1004) {
                                    --var6;
                                    boolean var46 = class61.field1266[var6] == 1;
                                    if (var45.field76 != var46) {
                                        var45.field76 = var46;
                                        class3.method21(26702, var45);
                                    }
                                    continue;
                                }
                            } else if ((var318 < 1100 || var318 >= 1200) && (~var318 > -2101 || var318 >= 2200)) {
                                if ((~var318 > -1201 || var318 >= 1300) && (var318 < 2200 || ~var318 <= -2301)) {
                                    if ((var318 < 1300 || var318 >= 1400) && (var318 < 2300 || ~var318 <= -2401)) {
                                        if (~var318 <= -1401 && var318 < 1500 || ~var318 <= -2401 && var318 < 2500) {
                                            class1 var50;
                                            if (~var318 > -2001) {
                                                var50 = var44 ? class158.field3148 : class96.field1929;
                                            } else {
                                                var318 -= 1000;
                                                --var6;
                                                var50 = class175.method1155(class61.field1266[var6], (byte) 123);
                                            }
                                            --var8;
                                            class92 var51 = class59.field1227[var8];
                                            int[] var52 = null;
                                            if (var51.method640(true) > 0 && var51.method635((byte) -79, -1 + var51.method640(true)) == 89) {
                                                --var6;
                                                int var53 = class61.field1266[var6];
                                                if (var53 > 0) {
                                                    var52 = new int[var53];
                                                    while (~(var53--) < -1) {
                                                        --var6;
                                                        var52[var53] = class61.field1266[var6];
                                                    }
                                                }
                                                var51 = var51.method629(var51.method640(true) - 1, 0, 0);
                                            }
                                            Object[] var54 = new Object[1 + var51.method640(true)];
                                            for (int var55 = var54.length + -1; var55 >= 1; --var55) {
                                                if (var51.method635((byte) -121, var55 + -1) == 115) {
                                                    --var8;
                                                    var54[var55] = class59.field1227[var8];
                                                } else {
                                                    --var6;
                                                    var54[var55] = new Integer(class61.field1266[var6]);
                                                }
                                            }
                                            --var6;
                                            int var56 = class61.field1266[var6];
                                            if (~var56 != 0) {
                                                var54[0] = new Integer(var56);
                                            } else {
                                                var54 = null;
                                            }
                                            if (var318 == 1408) {
                                                var50.field23 = var54;
                                            }
                                            if (var318 == 1423) {
                                                var50.field12 = var54;
                                            }
                                            if (~var318 == -1401) {
                                                var50.field33 = var54;
                                            }
                                            if (~var318 == -1420) {
                                                var50.field134 = var54;
                                            }
                                            var50.field41 = true;
                                            if (var318 == 1418) {
                                                var50.field64 = var54;
                                            }
                                            if (var318 == 1420) {
                                                var50.field117 = var54;
                                            }
                                            if (~var318 == -1426) {
                                                var50.field32 = var54;
                                            }
                                            if (~var318 == -1411) {
                                                var50.field77 = var54;
                                            }
                                            if (var318 == 1409) {
                                                var50.field35 = var54;
                                            }
                                            if (~var318 == -1416) {
                                                var50.field49 = var54;
                                                var50.field92 = var52;
                                            }
                                            if (var318 == 1407) {
                                                var50.field21 = var54;
                                                var50.field114 = var52;
                                            }
                                            if (var318 == 1414) {
                                                var50.field141 = var52;
                                                var50.field78 = var54;
                                            }
                                            if (var318 == 1401) {
                                                var50.field112 = var54;
                                            }
                                            if (var318 == 1403) {
                                                var50.field70 = var54;
                                            }
                                            if (~var318 == -1422) {
                                                var50.field74 = var54;
                                            }
                                            if (~var318 == -1425) {
                                                var50.field63 = var54;
                                            }
                                            if (~var318 == -1417) {
                                                var50.field138 = var54;
                                            }
                                            if (var318 == 1417) {
                                                var50.field75 = var54;
                                            }
                                            if (var318 == 1412) {
                                                var50.field57 = var54;
                                            }
                                            if (var318 == 1411) {
                                                var50.field89 = var54;
                                            }
                                            if (~var318 == -1423) {
                                                var50.field1 = var54;
                                            }
                                            if (~var318 == -1403) {
                                                var50.field122 = var54;
                                            }
                                            if (var318 == 1405) {
                                                var50.field91 = var54;
                                            }
                                            if (var318 == 1404) {
                                                var50.field104 = var54;
                                            }
                                            if (var318 == 1406) {
                                                var50.field136 = var54;
                                            }
                                            continue;
                                        }
                                        if (~var318 <= -1601) {
                                            if (var318 >= 1700) {
                                                if (~var318 > -1801) {
                                                    class1 var57 = var44 ? class158.field3148 : class96.field1929;
                                                    if (var318 == 1700) {
                                                        class61.field1266[var6++] = var57.field37;
                                                        continue;
                                                    }
                                                    if (var318 == 1701) {
                                                        if (var57.field37 == -1) {
                                                            class61.field1266[var6++] = 0;
                                                        } else {
                                                            class61.field1266[var6++] = var57.field87;
                                                        }
                                                        continue;
                                                    }
                                                    if (var318 == 1702) {
                                                        class61.field1266[var6++] = var57.field90;
                                                        continue;
                                                    }
                                                } else if (~var318 > -1901) {
                                                    class1 var58 = var44 ? class158.field3148 : class96.field1929;
                                                    if (~var318 == -1801) {
                                                        class61.field1266[var6++] = class132.method869(class114.method766(class98.method685(arg2, -105), var58), -267741749);
                                                        continue;
                                                    }
                                                    if (var318 == 1801) {
                                                        --var6;
                                                        int var59 = class61.field1266[var6];
                                                        int var319 = var59 - 1;
                                                        if (var58.field52 != null && ~var58.field52.length < ~var319 && var58.field52[var319] != null) {
                                                            class59.field1227[var8++] = var58.field52[var319];
                                                            continue;
                                                        }
                                                        class59.field1227[var8++] = class123.field2482;
                                                        continue;
                                                    }
                                                    if (var318 == 1802) {
                                                        if (var58.field111 != null) {
                                                            class59.field1227[var8++] = var58.field111;
                                                        } else {
                                                            class59.field1227[var8++] = class123.field2482;
                                                        }
                                                        continue;
                                                    }
                                                } else if (var318 >= 2600) {
                                                    if (~var318 <= -2701) {
                                                        if (var318 < 2800) {
                                                            if (var318 == 2700) {
                                                                --var6;
                                                                class1 var60 = class175.method1155(class61.field1266[var6], (byte) 102);
                                                                class61.field1266[var6++] = var60.field37;
                                                                continue;
                                                            }
                                                            if (~var318 == -2702) {
                                                                --var6;
                                                                class1 var61 = class175.method1155(class61.field1266[var6], (byte) 110);
                                                                if (~var61.field37 != 0) {
                                                                    class61.field1266[var6++] = var61.field87;
                                                                } else {
                                                                    class61.field1266[var6++] = 0;
                                                                }
                                                                continue;
                                                            }
                                                            if (~var318 == -2703) {
                                                                --var6;
                                                                int var62 = class61.field1266[var6];
                                                                class105 var63 = (class105) class118.field2394.method216(-80, (long) var62);
                                                                if (var63 != null) {
                                                                    class61.field1266[var6++] = 1;
                                                                } else {
                                                                    class61.field1266[var6++] = 0;
                                                                }
                                                                continue;
                                                            }
                                                            if (var318 == 2703) {
                                                                --var6;
                                                                class1 var64 = class175.method1155(class61.field1266[var6], (byte) -86);
                                                                if (var64.field55 == null) {
                                                                    class61.field1266[var6++] = 0;
                                                                    continue;
                                                                }
                                                                int var65 = var64.field55.length;
                                                                for (int var66 = 0; ~var64.field55.length < ~var66; ++var66) {
                                                                    if (var64.field55[var66] == null) {
                                                                        var65 = var66;
                                                                        break;
                                                                    }
                                                                }
                                                                class61.field1266[var6++] = var65;
                                                                continue;
                                                            }
                                                            if (var318 == 2704 || ~var318 == -2706) {
                                                                var6 -= 2;
                                                                int var67 = class61.field1266[var6];
                                                                int var68 = class61.field1266[var6 + 1];
                                                                class105 var69 = (class105) class118.field2394.method216(-109, (long) var67);
                                                                if (var69 != null && var69.field2155 == var68) {
                                                                    class61.field1266[var6++] = 1;
                                                                    continue;
                                                                }
                                                                class61.field1266[var6++] = 0;
                                                                continue;
                                                            }
                                                        } else if (~var318 > -2901) {
                                                            --var6;
                                                            class1 var70 = class175.method1155(class61.field1266[var6], (byte) -95);
                                                            if (var318 == 2800) {
                                                                class61.field1266[var6++] = class132.method869(class114.method766(class98.method685(arg2, -91), var70), -267741749);
                                                                continue;
                                                            }
                                                            if (~var318 == -2802) {
                                                                --var6;
                                                                int var71 = class61.field1266[var6];
                                                                int var320 = var71 - 1;
                                                                if (var70.field52 != null && ~var70.field52.length < ~var320 && var70.field52[var320] != null) {
                                                                    class59.field1227[var8++] = var70.field52[var320];
                                                                    continue;
                                                                }
                                                                class59.field1227[var8++] = class123.field2482;
                                                                continue;
                                                            }
                                                            if (var318 == 2802) {
                                                                if (var70.field111 != null) {
                                                                    class59.field1227[var8++] = var70.field111;
                                                                } else {
                                                                    class59.field1227[var8++] = class123.field2482;
                                                                }
                                                                continue;
                                                            }
                                                        } else if (var318 < 3200) {
                                                            if (var318 == 3100) {
                                                                --var8;
                                                                class92 var72 = class59.field1227[var8];
                                                                class117.method788(class123.field2482, arg2 + -19005, 0, var72);
                                                                continue;
                                                            }
                                                            if (~var318 == -3102) {
                                                                var6 -= 2;
                                                                class126.method844(class61.field1266[var6 - -1], class15.field423, class61.field1266[var6], arg2 + 2976);
                                                                continue;
                                                            }
                                                            if (~var318 == -3104) {
                                                                class45.method286(arg2 ^ 152);
                                                                continue;
                                                            }
                                                            if (~var318 == -3105) {
                                                                ++class70.field1463;
                                                                --var8;
                                                                class92 var73 = class59.field1227[var8];
                                                                int var74 = 0;
                                                                if (var73.method622((byte) -127)) {
                                                                    var74 = var73.method621(110);
                                                                }
                                                                class99.field2000.method405(72, 7);
                                                                class99.field2000.method446(var74, arg2 ^ -26747);
                                                                continue;
                                                            }
                                                            if (var318 == 3105) {
                                                                ++class96.field1934;
                                                                --var8;
                                                                class92 var75 = class59.field1227[var8];
                                                                class99.field2000.method405(119, 7);
                                                                class99.field2000.method459(false, var75.method609(10354));
                                                                continue;
                                                            }
                                                            if (~var318 == -3107) {
                                                                --var8;
                                                                class92 var76 = class59.field1227[var8];
                                                                class99.field2000.method405(35, 7);
                                                                class99.field2000.method428(var76.method640(true) + 1, 110);
                                                                ++class130.field2605;
                                                                class99.field2000.method466(var76, 42);
                                                                continue;
                                                            }
                                                            if (~var318 == -3108) {
                                                                --var6;
                                                                int var77 = class61.field1266[var6];
                                                                --var8;
                                                                class92 var78 = class59.field1227[var8];
                                                                class192.method1273((byte) -81, var77, var78);
                                                                continue;
                                                            }
                                                            if (~var318 == -3109) {
                                                                var6 -= 3;
                                                                int var79 = class61.field1266[var6 + 1];
                                                                int var80 = class61.field1266[var6];
                                                                int var81 = class61.field1266[var6 + 2];
                                                                class1 var82 = class175.method1155(var81, (byte) 89);
                                                                class65.method389(var82, var79, var80, (byte) 123);
                                                                continue;
                                                            }
                                                            if (~var318 == -3110) {
                                                                var6 -= 2;
                                                                int var83 = class61.field1266[var6];
                                                                int var84 = class61.field1266[var6 + 1];
                                                                class1 var85 = !var44 ? class96.field1929 : class158.field3148;
                                                                class65.method389(var85, var84, var83, (byte) 124);
                                                                continue;
                                                            }
                                                            if (var318 == 3110) {
                                                                ++class137.field2739;
                                                                --var6;
                                                                int var86 = class61.field1266[var6];
                                                                class99.field2000.method405(152, 7);
                                                                class99.field2000.method458(var86, 9345);
                                                                continue;
                                                            }
                                                        } else if (~var318 <= -3301) {
                                                            if (~var318 <= -3401) {
                                                                if (~var318 > -3501) {
                                                                    if (var318 == 3400) {
                                                                        var6 -= 2;
                                                                        int var87 = class61.field1266[var6];
                                                                        int var88 = class61.field1266[var6 - -1];
                                                                        class164 var89 = class132.method870(var87, 0);
                                                                        class59.field1227[var8++] = var89.method1061(var88, class98.method685(arg2, -28333));
                                                                        continue;
                                                                    }
                                                                    if (var318 == 3408) {
                                                                        var6 -= 4;
                                                                        int var90 = class61.field1266[var6];
                                                                        int var91 = class61.field1266[var6 + 1];
                                                                        int var92 = class61.field1266[var6 + 2];
                                                                        int var93 = class61.field1266[var6 + 3];
                                                                        class164 var94 = class132.method870(var92, 0);
                                                                        if (var94.field3200 == var90 && var94.field3197 == var91) {
                                                                            if (~var91 == -116) {
                                                                                class59.field1227[var8++] = var94.method1061(var93, -28329);
                                                                            } else {
                                                                                class61.field1266[var6++] = var94.method1057((byte) 56, var93);
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var91 == 115) {
                                                                            class59.field1227[var8++] = class140.field2796;
                                                                        } else {
                                                                            class61.field1266[var6++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                } else if (~var318 > -3701) {
                                                                    if (var318 == 3600) {
                                                                        if (class92.field1832 == 0) {
                                                                            class61.field1266[var6++] = -2;
                                                                        } else if (class92.field1832 == 1) {
                                                                            class61.field1266[var6++] = -1;
                                                                        } else {
                                                                            class61.field1266[var6++] = class166.field3273;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var318 == 3601) {
                                                                        --var6;
                                                                        int var95 = class61.field1266[var6];
                                                                        if (~class92.field1832 == -3 && class166.field3273 > var95) {
                                                                            class59.field1227[var8++] = class27.field603[var95];
                                                                            continue;
                                                                        }
                                                                        class59.field1227[var8++] = class123.field2482;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 3602) {
                                                                        --var6;
                                                                        int var96 = class61.field1266[var6];
                                                                        if (~class92.field1832 == -3 && var96 < class166.field3273) {
                                                                            class61.field1266[var6++] = class148.field2936[var96];
                                                                            continue;
                                                                        }
                                                                        class61.field1266[var6++] = 0;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3604) {
                                                                        --var6;
                                                                        int var97 = class61.field1266[var6];
                                                                        if (~class92.field1832 == -3 && ~class166.field3273 < ~var97) {
                                                                            class61.field1266[var6++] = class116.field2346[var97];
                                                                            continue;
                                                                        }
                                                                        class61.field1266[var6++] = 0;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 3604) {
                                                                        --var6;
                                                                        int var98 = class61.field1266[var6];
                                                                        --var8;
                                                                        class92 var99 = class59.field1227[var8];
                                                                        class140.method932(var98, true, var99);
                                                                        continue;
                                                                    }
                                                                    if (var318 == 3605) {
                                                                        --var8;
                                                                        class92 var100 = class59.field1227[var8];
                                                                        class54.method317((byte) 73, var100.method609(arg2 + 10350));
                                                                        continue;
                                                                    }
                                                                    if (var318 == 3606) {
                                                                        --var8;
                                                                        class92 var101 = class59.field1227[var8];
                                                                        class166.method1081(var101.method609(arg2 ^ 10358), (byte) 104);
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3608) {
                                                                        --var8;
                                                                        class92 var102 = class59.field1227[var8];
                                                                        class205.method1336(var102.method609(10354), false);
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3609) {
                                                                        --var8;
                                                                        class92 var103 = class59.field1227[var8];
                                                                        class99.method691(var103.method609(arg2 + 10350), 205);
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3610) {
                                                                        --var8;
                                                                        class92 var104 = class59.field1227[var8];
                                                                        if (var104.method636(class119.field2421, true) || var104.method636(class39.field892, true)) {
                                                                            var104 = var104.method613(arg2 ^ 4, 7);
                                                                        }
                                                                        class61.field1266[var6++] = class76.method522(var104, (byte) 55) ? 1 : 0;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 3610) {
                                                                        --var6;
                                                                        int var105 = class61.field1266[var6];
                                                                        if (class92.field1832 == 2 && ~class166.field3273 < ~var105) {
                                                                            class59.field1227[var8++] = class34.field776[var105];
                                                                            continue;
                                                                        }
                                                                        class59.field1227[var8++] = class123.field2482;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 3611) {
                                                                        if (class34.field770 == null) {
                                                                            class59.field1227[var8++] = class123.field2482;
                                                                        } else {
                                                                            class59.field1227[var8++] = class34.field770.method617(1);
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var318 == 3612) {
                                                                        if (class34.field770 == null) {
                                                                            class61.field1266[var6++] = 0;
                                                                        } else {
                                                                            class61.field1266[var6++] = class9.field338;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var318 == 3613) {
                                                                        --var6;
                                                                        int var106 = class61.field1266[var6];
                                                                        if (class34.field770 != null && ~var106 > ~class9.field338) {
                                                                            class59.field1227[var8++] = class68.field1382[var106].field887.method617(class98.method685(arg2, 5));
                                                                            continue;
                                                                        }
                                                                        class59.field1227[var8++] = class123.field2482;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3615) {
                                                                        --var6;
                                                                        int var107 = class61.field1266[var6];
                                                                        if (class34.field770 != null && var107 < class9.field338) {
                                                                            class61.field1266[var6++] = class68.field1382[var107].field889;
                                                                            continue;
                                                                        }
                                                                        class61.field1266[var6++] = 0;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3616) {
                                                                        --var6;
                                                                        int var108 = class61.field1266[var6];
                                                                        if (class34.field770 != null && ~var108 > ~class9.field338) {
                                                                            class61.field1266[var6++] = class68.field1382[var108].field884;
                                                                            continue;
                                                                        }
                                                                        class61.field1266[var6++] = 0;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3617) {
                                                                        class61.field1266[var6++] = class6.field291;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3618) {
                                                                        --var8;
                                                                        class92 var109 = class59.field1227[var8];
                                                                        class68.method401((byte) 13, var109);
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3619) {
                                                                        class61.field1266[var6++] = class28.field626;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3620) {
                                                                        --var8;
                                                                        class92 var110 = class59.field1227[var8];
                                                                        class212.method1377(var110.method609(arg2 + 10350), 206);
                                                                        continue;
                                                                    }
                                                                    if (var318 == 3620) {
                                                                        class4.method28(0);
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3622) {
                                                                        if (class92.field1832 != 0) {
                                                                            class61.field1266[var6++] = class64.field1302;
                                                                        } else {
                                                                            class61.field1266[var6++] = -1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3623) {
                                                                        --var6;
                                                                        int var111 = class61.field1266[var6];
                                                                        if (class92.field1832 != 0 && ~var111 > ~class64.field1302) {
                                                                            class59.field1227[var8++] = class129.method855(false, class144.field2880[var111]).method617(1);
                                                                            continue;
                                                                        }
                                                                        class59.field1227[var8++] = class123.field2482;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 3623) {
                                                                        --var8;
                                                                        class92 var112 = class59.field1227[var8];
                                                                        if (var112.method636(class119.field2421, true) || var112.method636(class39.field892, true)) {
                                                                            var112 = var112.method613(0, 7);
                                                                        }
                                                                        class61.field1266[var6++] = !class44.method279(var112, 0) ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3625) {
                                                                        --var6;
                                                                        int var113 = class61.field1266[var6];
                                                                        if (class68.field1382 != null && ~var113 > ~class9.field338 && class68.field1382[var113].field887.method646(107, class15.field423.field1805)) {
                                                                            class61.field1266[var6++] = 1;
                                                                            continue;
                                                                        }
                                                                        class61.field1266[var6++] = 0;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3626) {
                                                                        if (class113.field2279 != null) {
                                                                            class59.field1227[var8++] = class113.field2279.method617(arg2 + -3);
                                                                        } else {
                                                                            class59.field1227[var8++] = class123.field2482;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3627) {
                                                                        --var6;
                                                                        int var114 = class61.field1266[var6];
                                                                        if (class34.field770 != null && class9.field338 > var114) {
                                                                            class59.field1227[var8++] = class68.field1382[var114].field877;
                                                                            continue;
                                                                        }
                                                                        class59.field1227[var8++] = class123.field2482;
                                                                        continue;
                                                                    }
                                                                } else if (var318 < 4000) {
                                                                    if (~var318 == -3904) {
                                                                        --var6;
                                                                        int var115 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = class68.field1380[var115].method939((byte) 115);
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3905) {
                                                                        --var6;
                                                                        int var116 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = class68.field1380[var116].field2823;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 3905) {
                                                                        --var6;
                                                                        int var117 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = class68.field1380[var117].field2830;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3907) {
                                                                        --var6;
                                                                        int var118 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = class68.field1380[var118].field2824;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3908) {
                                                                        --var6;
                                                                        int var119 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = class68.field1380[var119].field2821;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3909) {
                                                                        --var6;
                                                                        int var120 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = class68.field1380[var120].field2829;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3911) {
                                                                        --var6;
                                                                        int var121 = class61.field1266[var6];
                                                                        int var122 = class68.field1380[var121].method935(125);
                                                                        class61.field1266[var6++] = ~var122 != -1 ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -3912) {
                                                                        --var6;
                                                                        int var123 = class61.field1266[var6];
                                                                        int var124 = class68.field1380[var123].method935(102);
                                                                        class61.field1266[var6++] = ~var124 != -3 ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 3912) {
                                                                        --var6;
                                                                        int var125 = class61.field1266[var6];
                                                                        int var126 = class68.field1380[var125].method935(102);
                                                                        class61.field1266[var6++] = var126 != 5 ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 3913) {
                                                                        --var6;
                                                                        int var127 = class61.field1266[var6];
                                                                        int var128 = class68.field1380[var127].method935(arg2 + 69);
                                                                        class61.field1266[var6++] = var128 == 1 ? 1 : 0;
                                                                        continue;
                                                                    }
                                                                } else if (~var318 > -4101) {
                                                                    if (~var318 == -4001) {
                                                                        var6 -= 2;
                                                                        int var129 = class61.field1266[var6];
                                                                        int var130 = class61.field1266[var6 + 1];
                                                                        class61.field1266[var6++] = var129 + var130;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4001) {
                                                                        var6 -= 2;
                                                                        int var131 = class61.field1266[var6];
                                                                        int var132 = class61.field1266[var6 + 1];
                                                                        class61.field1266[var6++] = -var132 + var131;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4003) {
                                                                        var6 -= 2;
                                                                        int var133 = class61.field1266[var6];
                                                                        int var134 = class61.field1266[var6 + 1];
                                                                        class61.field1266[var6++] = var133 * var134;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4004) {
                                                                        var6 -= 2;
                                                                        int var135 = class61.field1266[var6 - -1];
                                                                        int var136 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = var136 / var135;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4004) {
                                                                        --var6;
                                                                        int var137 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = (int) (Math.random() * (double) var137);
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4005) {
                                                                        --var6;
                                                                        int var138 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = (int) (Math.random() * (double) (var138 + 1));
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4006) {
                                                                        var6 -= 5;
                                                                        int var139 = class61.field1266[var6 + 1];
                                                                        int var140 = class61.field1266[var6];
                                                                        int var141 = class61.field1266[var6 + 2];
                                                                        int var142 = class61.field1266[var6 + 3];
                                                                        int var143 = class61.field1266[var6 - -4];
                                                                        class61.field1266[var6++] = var140 - -((var139 - var140) * (-var141 + var143) / (-var141 + var142));
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4008) {
                                                                        var6 -= 2;
                                                                        int var144 = class61.field1266[var6];
                                                                        int var145 = class61.field1266[var6 - -1];
                                                                        class61.field1266[var6++] = var144 * var145 / 100 + var144;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4009) {
                                                                        var6 -= 2;
                                                                        int var146 = class61.field1266[var6 + 1];
                                                                        int var147 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = class67.method396(1 << var146, var147);
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4010) {
                                                                        var6 -= 2;
                                                                        int var148 = class61.field1266[var6];
                                                                        int var149 = class61.field1266[var6 - -1];
                                                                        class61.field1266[var6++] = class196.method1301(var148, -(1 << var149) + -1);
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4011) {
                                                                        var6 -= 2;
                                                                        int var150 = class61.field1266[var6 + 1];
                                                                        int var151 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = ~class196.method1301(var151, 1 << var150) == -1 ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4012) {
                                                                        var6 -= 2;
                                                                        int var152 = class61.field1266[var6 - -1];
                                                                        int var153 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = var153 % var152;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4012) {
                                                                        var6 -= 2;
                                                                        int var154 = class61.field1266[var6];
                                                                        int var155 = class61.field1266[var6 + 1];
                                                                        if (~var154 == -1) {
                                                                            class61.field1266[var6++] = 0;
                                                                        } else {
                                                                            class61.field1266[var6++] = (int) Math.pow((double) var154, (double) var155);
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4014) {
                                                                        var6 -= 2;
                                                                        int var156 = class61.field1266[var6 + 1];
                                                                        int var157 = class61.field1266[var6];
                                                                        if (var157 != 0) {
                                                                            if (var156 == 0) {
                                                                                class61.field1266[var6++] = Integer.MAX_VALUE;
                                                                            } else {
                                                                                class61.field1266[var6++] = (int) Math.pow((double) var157, 1.0D / (double) var156);
                                                                            }
                                                                        } else {
                                                                            class61.field1266[var6++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4015) {
                                                                        var6 -= 2;
                                                                        int var158 = class61.field1266[var6 + 1];
                                                                        int var159 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = class196.method1301(var159, var158);
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4015) {
                                                                        var6 -= 2;
                                                                        int var160 = class61.field1266[var6];
                                                                        int var161 = class61.field1266[var6 - -1];
                                                                        class61.field1266[var6++] = class67.method396(var160, var161);
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4016) {
                                                                        var6 -= 2;
                                                                        int var162 = class61.field1266[var6];
                                                                        int var163 = class61.field1266[var6 + 1];
                                                                        class61.field1266[var6++] = var163 <= var162 ? var163 : var162;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4017) {
                                                                        var6 -= 2;
                                                                        int var164 = class61.field1266[var6 + 1];
                                                                        int var165 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = ~var164 > ~var165 ? var165 : var164;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4018) {
                                                                        var6 -= 3;
                                                                        long var166 = (long) class61.field1266[var6 + 1];
                                                                        long var168 = (long) class61.field1266[var6];
                                                                        long var170 = (long) class61.field1266[var6 + 2];
                                                                        class61.field1266[var6++] = (int) (var168 * var170 / var166);
                                                                        continue;
                                                                    }
                                                                } else if (~var318 > -4201) {
                                                                    if (var318 == 4100) {
                                                                        --var8;
                                                                        class92 var172 = class59.field1227[var8];
                                                                        --var6;
                                                                        int var173 = class61.field1266[var6];
                                                                        class59.field1227[var8++] = class77.method529(class98.method685(arg2, -7), new class92[] { var172, class142.method938(var173, false) });
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4102) {
                                                                        var8 -= 2;
                                                                        class92 var174 = class59.field1227[var8 + 1];
                                                                        class92 var175 = class59.field1227[var8];
                                                                        class59.field1227[var8++] = class77.method529(-3, new class92[] { var175, var174 });
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4103) {
                                                                        --var8;
                                                                        class92 var176 = class59.field1227[var8];
                                                                        --var6;
                                                                        int var177 = class61.field1266[var6];
                                                                        class59.field1227[var8++] = class77.method529(-3, new class92[] { var176, class110.method750(class98.method685(arg2, 14), var177, true) });
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4104) {
                                                                        --var8;
                                                                        class92 var178 = class59.field1227[var8];
                                                                        class59.field1227[var8++] = var178.method632(true);
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4104) {
                                                                        --var6;
                                                                        int var179 = class61.field1266[var6];
                                                                        long var180 = ((long) var179 + 11745L) * 86400000L;
                                                                        class74.field1556.setTime(new Date(var180));
                                                                        int var182 = class74.field1556.get(5);
                                                                        int var183 = class74.field1556.get(2);
                                                                        int var184 = class74.field1556.get(1);
                                                                        class59.field1227[var8++] = class77.method529(-3, new class92[] { class142.method938(var182, false), class190.field3609, class48.field1032[var183], class190.field3609, class142.method938(var184, false) });
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4106) {
                                                                        var8 -= 2;
                                                                        class92 var185 = class59.field1227[var8];
                                                                        class92 var186 = class59.field1227[var8 + 1];
                                                                        if (class15.field423.field1799 != null && class15.field423.field1799.field1713) {
                                                                            class59.field1227[var8++] = var186;
                                                                            continue;
                                                                        }
                                                                        class59.field1227[var8++] = var185;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4106) {
                                                                        --var6;
                                                                        int var187 = class61.field1266[var6];
                                                                        class59.field1227[var8++] = class142.method938(var187, false);
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4108) {
                                                                        var8 -= 2;
                                                                        class61.field1266[var6++] = class59.field1227[var8].method616((byte) -1, class59.field1227[var8 + 1]);
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4109) {
                                                                        var6 -= 2;
                                                                        --var8;
                                                                        class92 var188 = class59.field1227[var8];
                                                                        int var189 = class61.field1266[var6];
                                                                        int var190 = class61.field1266[var6 + 1];
                                                                        byte[] var191 = class198.field3862.method899((byte) 87, var190, 0);
                                                                        class50 var192 = new class50(var191);
                                                                        var192.method1006(class114.field2305, (int[]) null);
                                                                        class61.field1266[var6++] = var192.method997(var188, var189);
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4109) {
                                                                        var6 -= 2;
                                                                        --var8;
                                                                        class92 var193 = class59.field1227[var8];
                                                                        int var194 = class61.field1266[var6];
                                                                        int var195 = class61.field1266[var6 + 1];
                                                                        byte[] var196 = class198.field3862.method899((byte) 87, var195, 0);
                                                                        class50 var197 = new class50(var196);
                                                                        var197.method1006(class114.field2305, (int[]) null);
                                                                        class61.field1266[var6++] = var197.method1002(var193, var194);
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4111) {
                                                                        var8 -= 2;
                                                                        class92 var198 = class59.field1227[var8];
                                                                        class92 var199 = class59.field1227[var8 - -1];
                                                                        --var6;
                                                                        if (class61.field1266[var6] != 1) {
                                                                            class59.field1227[var8++] = var199;
                                                                        } else {
                                                                            class59.field1227[var8++] = var198;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4111) {
                                                                        --var8;
                                                                        class92 var200 = class59.field1227[var8];
                                                                        class59.field1227[var8++] = class154.method988(var200);
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4113) {
                                                                        --var8;
                                                                        class92 var201 = class59.field1227[var8];
                                                                        --var6;
                                                                        int var202 = class61.field1266[var6];
                                                                        class59.field1227[var8++] = var201.method618(-65, var202);
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4114) {
                                                                        --var6;
                                                                        int var203 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = !class92.method637(var203, (byte) 110) ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4115) {
                                                                        --var6;
                                                                        int var204 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = !class18.method108(var204, false) ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4115) {
                                                                        --var6;
                                                                        int var205 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = class204.method1335((byte) 89, var205) ? 1 : 0;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4117) {
                                                                        --var6;
                                                                        int var206 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = !class34.method223(var206, (byte) 120) ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4118) {
                                                                        --var8;
                                                                        class92 var207 = class59.field1227[var8];
                                                                        if (var207 == null) {
                                                                            class61.field1266[var6++] = 0;
                                                                        } else {
                                                                            class61.field1266[var6++] = var207.method640(true);
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4119) {
                                                                        var6 -= 2;
                                                                        --var8;
                                                                        class92 var208 = class59.field1227[var8];
                                                                        int var209 = class61.field1266[var6];
                                                                        int var210 = class61.field1266[var6 + 1];
                                                                        class59.field1227[var8++] = var208.method629(var210, var209, 0);
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4120) {
                                                                        --var8;
                                                                        class92 var211 = class59.field1227[var8];
                                                                        boolean var212 = false;
                                                                        class92 var213 = class189.method1220(var211.method640(true), 0);
                                                                        for (int var214 = 0; var211.method640(true) > var214; ++var214) {
                                                                            int var215 = var211.method635((byte) 71, var214);
                                                                            if (~var215 == -61) {
                                                                                var212 = true;
                                                                            } else if (~var215 != -63) {
                                                                                if (!var212) {
                                                                                    var213.method606(var215, 65);
                                                                                }
                                                                            } else {
                                                                                var212 = false;
                                                                            }
                                                                        }
                                                                        var213.method604((byte) -83);
                                                                        class59.field1227[var8++] = var213;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4120) {
                                                                        var6 -= 2;
                                                                        int var216 = class61.field1266[var6 + 1];
                                                                        int var217 = class61.field1266[var6];
                                                                        --var8;
                                                                        class92 var218 = class59.field1227[var8];
                                                                        class61.field1266[var6++] = var218.method630(var216, -1, var217);
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4122) {
                                                                        var8 -= 2;
                                                                        class92 var219 = class59.field1227[var8];
                                                                        class92 var220 = class59.field1227[var8 + 1];
                                                                        --var6;
                                                                        int var221 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = var219.method642(var221, (byte) -115, var220);
                                                                        continue;
                                                                    }
                                                                } else if (var318 >= 4300) {
                                                                    if (var318 >= 5100) {
                                                                        if (~var318 > -5201) {
                                                                            if (~var318 == -5101) {
                                                                                if (class16.field445[86]) {
                                                                                    class61.field1266[var6++] = 1;
                                                                                } else {
                                                                                    class61.field1266[var6++] = 0;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (var318 == 5101) {
                                                                                if (class16.field445[82]) {
                                                                                    class61.field1266[var6++] = 1;
                                                                                } else {
                                                                                    class61.field1266[var6++] = 0;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (~var318 == -5103) {
                                                                                if (class16.field445[81]) {
                                                                                    class61.field1266[var6++] = 1;
                                                                                } else {
                                                                                    class61.field1266[var6++] = 0;
                                                                                }
                                                                                continue;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (~var318 == -5001) {
                                                                            class61.field1266[var6++] = class65.field1319;
                                                                            continue;
                                                                        }
                                                                        if (~var318 == -5002) {
                                                                            var6 -= 3;
                                                                            class65.field1319 = class61.field1266[var6];
                                                                            class142.field2835 = class61.field1266[var6 - -1];
                                                                            class60.field1245 = class61.field1266[var6 + 2];
                                                                            class99.field2000.method405(246, arg2 ^ 3);
                                                                            ++class165.field3239;
                                                                            class99.field2000.method428(class65.field1319, arg2 ^ 102);
                                                                            class99.field2000.method428(class142.field2835, arg2 + 117);
                                                                            class99.field2000.method428(class60.field1245, 112);
                                                                            continue;
                                                                        }
                                                                        if (var318 == 5002) {
                                                                            var6 -= 2;
                                                                            ++class187.field3535;
                                                                            int var222 = class61.field1266[var6 - -1];
                                                                            --var8;
                                                                            class92 var223 = class59.field1227[var8];
                                                                            int var224 = class61.field1266[var6];
                                                                            class99.field2000.method405(226, 7);
                                                                            class99.field2000.method459(false, var223.method609(10354));
                                                                            class99.field2000.method428(var224 + -1, arg2 + 105);
                                                                            class99.field2000.method428(var222, 113);
                                                                            continue;
                                                                        }
                                                                        if (~var318 == -5004) {
                                                                            --var6;
                                                                            int var225 = class61.field1266[var6];
                                                                            class92 var226 = null;
                                                                            if (var225 < 100) {
                                                                                var226 = class211.field4082[var225];
                                                                            }
                                                                            if (var226 == null) {
                                                                                var226 = class123.field2482;
                                                                            }
                                                                            class59.field1227[var8++] = var226;
                                                                            continue;
                                                                        }
                                                                        if (~var318 == -5005) {
                                                                            int var227 = -1;
                                                                            --var6;
                                                                            int var228 = class61.field1266[var6];
                                                                            if (~var228 > -101 && class211.field4082[var228] != null) {
                                                                                var227 = class182.field3466[var228];
                                                                            }
                                                                            class61.field1266[var6++] = var227;
                                                                            continue;
                                                                        }
                                                                        if (~var318 == -5006) {
                                                                            class61.field1266[var6++] = class142.field2835;
                                                                            continue;
                                                                        }
                                                                        if (~var318 == -5009) {
                                                                            --var8;
                                                                            class92 var229 = class59.field1227[var8];
                                                                            if (var229.method636(class69.field1426, true)) {
                                                                                class197.method1309(arg2 ^ -100, var229);
                                                                            } else {
                                                                                class92 var230 = var229.method632(true);
                                                                                ++class116.field2348;
                                                                                byte var231 = 0;
                                                                                byte var232 = 0;
                                                                                if (var230.method636(class15.field434, true)) {
                                                                                    var229 = var229.method613(0, class15.field434.method640(true));
                                                                                    var231 = 0;
                                                                                } else if (!var230.method636(class103.field2133, true)) {
                                                                                    if (!var230.method636(class70.field1496, true)) {
                                                                                        if (var230.method636(class2.field157, true)) {
                                                                                            var231 = 3;
                                                                                            var229 = var229.method613(0, class2.field157.method640(true));
                                                                                        } else if (var230.method636(class182.field3458, true)) {
                                                                                            var231 = 4;
                                                                                            var229 = var229.method613(0, class182.field3458.method640(true));
                                                                                        } else if (var230.method636(class2.field152, true)) {
                                                                                            var231 = 5;
                                                                                            var229 = var229.method613(0, class2.field152.method640(true));
                                                                                        } else if (var230.method636(class39.field888, true)) {
                                                                                            var229 = var229.method613(0, class39.field888.method640(true));
                                                                                            var231 = 6;
                                                                                        } else if (var230.method636(class192.field3744, true)) {
                                                                                            var231 = 7;
                                                                                            var229 = var229.method613(0, class192.field3744.method640(true));
                                                                                        } else if (!var230.method636(class28.field616, true)) {
                                                                                            if (!var230.method636(class196.field3827, true)) {
                                                                                                if (var230.method636(class202.field3911, true)) {
                                                                                                    var231 = 10;
                                                                                                    var229 = var229.method613(0, class202.field3911.method640(true));
                                                                                                } else if (!var230.method636(class95.field1917, true)) {
                                                                                                    if (class72.field1532 != 0) {
                                                                                                        if (!var230.method636(class15.field432, true)) {
                                                                                                            if (!var230.method636(class103.field2129, true)) {
                                                                                                                if (var230.method636(class70.field1438, true)) {
                                                                                                                    var231 = 2;
                                                                                                                    var229 = var229.method613(0, class70.field1438.method640(true));
                                                                                                                } else if (!var230.method636(class2.field165, true)) {
                                                                                                                    if (var230.method636(class182.field3463, true)) {
                                                                                                                        var229 = var229.method613(0, class182.field3463.method640(true));
                                                                                                                        var231 = 4;
                                                                                                                    } else if (var230.method636(class2.field144, true)) {
                                                                                                                        var231 = 5;
                                                                                                                        var229 = var229.method613(0, class2.field144.method640(true));
                                                                                                                    } else if (!var230.method636(class39.field885, true)) {
                                                                                                                        if (!var230.method636(class192.field3743, true)) {
                                                                                                                            if (!var230.method636(class28.field629, true)) {
                                                                                                                                if (!var230.method636(class196.field3822, true)) {
                                                                                                                                    if (var230.method636(class202.field3908, true)) {
                                                                                                                                        var229 = var229.method613(0, class202.field3908.method640(true));
                                                                                                                                        var231 = 10;
                                                                                                                                    } else if (var230.method636(class95.field1923, true)) {
                                                                                                                                        var231 = 11;
                                                                                                                                        var229 = var229.method613(0, class95.field1923.method640(true));
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    var229 = var229.method613(0, class196.field3822.method640(true));
                                                                                                                                    var231 = 9;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var231 = 8;
                                                                                                                                var229 = var229.method613(0, class28.field629.method640(true));
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var229 = var229.method613(arg2 + -4, class192.field3743.method640(true));
                                                                                                                            var231 = 7;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var231 = 6;
                                                                                                                        var229 = var229.method613(0, class39.field885.method640(true));
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var229 = var229.method613(0, class2.field165.method640(true));
                                                                                                                    var231 = 3;
                                                                                                                }
                                                                                                            } else {
                                                                                                                var231 = 1;
                                                                                                                var229 = var229.method613(arg2 + -4, class103.field2129.method640(true));
                                                                                                            }
                                                                                                        } else {
                                                                                                            var229 = var229.method613(arg2 ^ 4, class15.field432.method640(true));
                                                                                                            var231 = 0;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    var229 = var229.method613(arg2 + -4, class95.field1917.method640(true));
                                                                                                    var231 = 11;
                                                                                                }
                                                                                            } else {
                                                                                                var231 = 9;
                                                                                                var229 = var229.method613(0, class196.field3827.method640(true));
                                                                                            }
                                                                                        } else {
                                                                                            var231 = 8;
                                                                                            var229 = var229.method613(0, class28.field616.method640(true));
                                                                                        }
                                                                                    } else {
                                                                                        var229 = var229.method613(arg2 ^ 4, class70.field1496.method640(true));
                                                                                        var231 = 2;
                                                                                    }
                                                                                } else {
                                                                                    var231 = 1;
                                                                                    var229 = var229.method613(0, class103.field2133.method640(true));
                                                                                }
                                                                                class92 var233 = var229.method632(true);
                                                                                if (var233.method636(class150.field2976, true)) {
                                                                                    var232 = 1;
                                                                                    var229 = var229.method613(arg2 ^ 4, class150.field2976.method640(true));
                                                                                } else if (!var233.method636(class143.field2855, true)) {
                                                                                    if (var233.method636(class213.field4128, true)) {
                                                                                        var232 = 3;
                                                                                        var229 = var229.method613(0, class213.field4128.method640(true));
                                                                                    } else if (!var233.method636(class74.field1558, true)) {
                                                                                        if (!var233.method636(class114.field2291, true)) {
                                                                                            if (class72.field1532 != 0) {
                                                                                                if (var233.method636(class150.field2973, true)) {
                                                                                                    var232 = 1;
                                                                                                    var229 = var229.method613(0, class150.field2973.method640(true));
                                                                                                } else if (var233.method636(class143.field2841, true)) {
                                                                                                    var232 = 2;
                                                                                                    var229 = var229.method613(0, class143.field2841.method640(true));
                                                                                                } else if (!var233.method636(class213.field4111, true)) {
                                                                                                    if (var233.method636(class74.field1554, true)) {
                                                                                                        var229 = var229.method613(0, class74.field1554.method640(true));
                                                                                                        var232 = 4;
                                                                                                    } else if (var233.method636(class114.field2302, true)) {
                                                                                                        var229 = var229.method613(0, class114.field2302.method640(true));
                                                                                                        var232 = 5;
                                                                                                    }
                                                                                                } else {
                                                                                                    var229 = var229.method613(0, class213.field4111.method640(true));
                                                                                                    var232 = 3;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            var232 = 5;
                                                                                            var229 = var229.method613(0, class114.field2291.method640(true));
                                                                                        }
                                                                                    } else {
                                                                                        var229 = var229.method613(arg2 + -4, class74.field1558.method640(true));
                                                                                        var232 = 4;
                                                                                    }
                                                                                } else {
                                                                                    var232 = 2;
                                                                                    var229 = var229.method613(0, class143.field2855.method640(true));
                                                                                }
                                                                                class99.field2000.method405(173, 7);
                                                                                class99.field2000.method428(0, 99);
                                                                                int var234 = class99.field2000.field1472;
                                                                                class99.field2000.method428(var231, 97);
                                                                                class99.field2000.method428(var232, 114);
                                                                                class165.method1063(class99.field2000, var229, 89);
                                                                                class99.field2000.method421((byte) 127, -var234 + class99.field2000.field1472);
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (~var318 == -5010) {
                                                                            ++class42.field925;
                                                                            var8 -= 2;
                                                                            class92 var235 = class59.field1227[var8 + 1];
                                                                            class92 var236 = class59.field1227[var8];
                                                                            class99.field2000.method405(25, 7);
                                                                            class99.field2000.method428(0, 99);
                                                                            int var237 = class99.field2000.field1472;
                                                                            class99.field2000.method459(false, var236.method609(10354));
                                                                            class165.method1063(class99.field2000, var235, 107);
                                                                            class99.field2000.method421((byte) 110, class99.field2000.field1472 - var237);
                                                                            continue;
                                                                        }
                                                                        if (~var318 == -5011) {
                                                                            --var6;
                                                                            int var238 = class61.field1266[var6];
                                                                            class92 var239 = null;
                                                                            if (var238 < 100) {
                                                                                var239 = class95.field1925[var238];
                                                                            }
                                                                            if (var239 == null) {
                                                                                var239 = class123.field2482;
                                                                            }
                                                                            class59.field1227[var8++] = var239;
                                                                            continue;
                                                                        }
                                                                        if (~var318 == -5012) {
                                                                            --var6;
                                                                            int var240 = class61.field1266[var6];
                                                                            class92 var241 = null;
                                                                            if (var240 < 100) {
                                                                                var241 = class132.field2644[var240];
                                                                            }
                                                                            if (var241 == null) {
                                                                                var241 = class123.field2482;
                                                                            }
                                                                            class59.field1227[var8++] = var241;
                                                                            continue;
                                                                        }
                                                                        if (var318 == 5015) {
                                                                            class92 var242;
                                                                            if (class15.field423 != null && class15.field423.field1805 != null) {
                                                                                var242 = class15.field423.field1805;
                                                                            } else {
                                                                                var242 = class3.field181;
                                                                            }
                                                                            class59.field1227[var8++] = var242;
                                                                            continue;
                                                                        }
                                                                        if (~var318 == -5017) {
                                                                            class61.field1266[var6++] = class60.field1245;
                                                                            continue;
                                                                        }
                                                                        if (var318 == 5017) {
                                                                            class61.field1266[var6++] = class124.field2522;
                                                                            continue;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (var318 == 4200) {
                                                                        --var6;
                                                                        int var243 = class61.field1266[var6];
                                                                        class59.field1227[var8++] = class92.method626((byte) 59, var243).field2162;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4201) {
                                                                        var6 -= 2;
                                                                        int var244 = class61.field1266[var6 + 1];
                                                                        int var245 = class61.field1266[var6];
                                                                        class107 var246 = class92.method626((byte) 59, var245);
                                                                        if (~var244 <= -2 && var244 <= 5 && var246.field2161[var244 + -1] != null) {
                                                                            class59.field1227[var8++] = var246.field2161[var244 + -1];
                                                                            continue;
                                                                        }
                                                                        class59.field1227[var8++] = class123.field2482;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4202) {
                                                                        var6 -= 2;
                                                                        int var247 = class61.field1266[var6];
                                                                        int var248 = class61.field1266[var6 - -1];
                                                                        class107 var249 = class92.method626((byte) 59, var247);
                                                                        if (var248 >= 1 && var248 <= 5 && var249.field2199[var248 - 1] != null) {
                                                                            class59.field1227[var8++] = var249.field2199[var248 - 1];
                                                                            continue;
                                                                        }
                                                                        class59.field1227[var8++] = class123.field2482;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4204) {
                                                                        --var6;
                                                                        int var250 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = class92.method626((byte) 59, var250).field2189;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4204) {
                                                                        --var6;
                                                                        int var251 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = ~class92.method626((byte) 59, var251).field2185 != -2 ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4205) {
                                                                        --var6;
                                                                        int var252 = class61.field1266[var6];
                                                                        class107 var253 = class92.method626((byte) 59, var252);
                                                                        if (~var253.field2181 == 0 && ~var253.field2182 <= -1) {
                                                                            class61.field1266[var6++] = var253.field2182;
                                                                            continue;
                                                                        }
                                                                        class61.field1266[var6++] = var252;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4206) {
                                                                        --var6;
                                                                        int var254 = class61.field1266[var6];
                                                                        class107 var255 = class92.method626((byte) 59, var254);
                                                                        if (var255.field2181 >= 0 && ~var255.field2182 <= -1) {
                                                                            class61.field1266[var6++] = var255.field2182;
                                                                            continue;
                                                                        }
                                                                        class61.field1266[var6++] = var254;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4207) {
                                                                        --var6;
                                                                        int var256 = class61.field1266[var6];
                                                                        class61.field1266[var6++] = !class92.method626((byte) 59, var256).field2202 ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                    if (~var318 == -4211) {
                                                                        --var8;
                                                                        class92 var257 = class59.field1227[var8];
                                                                        --var6;
                                                                        int var258 = class61.field1266[var6];
                                                                        class207.method1348(var257, var258 == 1, -30937);
                                                                        class61.field1266[var6++] = class68.field1383;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4211) {
                                                                        if (class31.field712 != null && class68.field1383 > class22.field523) {
                                                                            class61.field1266[var6++] = class196.method1301(class31.field712[class22.field523++], 65535);
                                                                            continue;
                                                                        }
                                                                        class61.field1266[var6++] = -1;
                                                                        continue;
                                                                    }
                                                                    if (var318 == 4212) {
                                                                        class22.field523 = 0;
                                                                        continue;
                                                                    }
                                                                }
                                                            } else {
                                                                if (~var318 == -3301) {
                                                                    class61.field1266[var6++] = class158.field3150;
                                                                    continue;
                                                                }
                                                                if (var318 == 3301) {
                                                                    var6 -= 2;
                                                                    int var259 = class61.field1266[var6];
                                                                    int var260 = class61.field1266[var6 - -1];
                                                                    class61.field1266[var6++] = class136.method911(var260, true, var259);
                                                                    continue;
                                                                }
                                                                if (~var318 == -3303) {
                                                                    var6 -= 2;
                                                                    int var261 = class61.field1266[var6];
                                                                    int var262 = class61.field1266[var6 + 1];
                                                                    class61.field1266[var6++] = class80.method542(var261, var262, (byte) -110);
                                                                    continue;
                                                                }
                                                                if (~var318 == -3304) {
                                                                    var6 -= 2;
                                                                    int var263 = class61.field1266[var6];
                                                                    int var264 = class61.field1266[var6 + 1];
                                                                    class61.field1266[var6++] = class121.method816(var264, var263, (byte) -127);
                                                                    continue;
                                                                }
                                                                if (var318 == 3304) {
                                                                    --var6;
                                                                    int var265 = class61.field1266[var6];
                                                                    class61.field1266[var6++] = class7.method47(var265, class98.method685(arg2, -3787)).field2255;
                                                                    continue;
                                                                }
                                                                if (~var318 == -3306) {
                                                                    --var6;
                                                                    int var266 = class61.field1266[var6];
                                                                    class61.field1266[var6++] = class15.field428[var266];
                                                                    continue;
                                                                }
                                                                if (~var318 == -3307) {
                                                                    --var6;
                                                                    int var267 = class61.field1266[var6];
                                                                    class61.field1266[var6++] = class100.field2069[var267];
                                                                    continue;
                                                                }
                                                                if (var318 == 3307) {
                                                                    --var6;
                                                                    int var268 = class61.field1266[var6];
                                                                    class61.field1266[var6++] = class135.field2700[var268];
                                                                    continue;
                                                                }
                                                                if (var318 == 3308) {
                                                                    int var269 = class81.field1639;
                                                                    int var270 = (class15.field423.field246 >> 7) + class115.field2343;
                                                                    int var271 = (class15.field423.field208 >> 7) + class210.field4077;
                                                                    class61.field1266[var6++] = (var270 << 14) + ((var269 << 28) - -var271);
                                                                    continue;
                                                                }
                                                                if (~var318 == -3310) {
                                                                    --var6;
                                                                    int var272 = class61.field1266[var6];
                                                                    class61.field1266[var6++] = class196.method1301(var272, 268419757) >> 14;
                                                                    continue;
                                                                }
                                                                if (var318 == 3310) {
                                                                    --var6;
                                                                    int var273 = class61.field1266[var6];
                                                                    class61.field1266[var6++] = var273 >> 28;
                                                                    continue;
                                                                }
                                                                if (~var318 == -3312) {
                                                                    --var6;
                                                                    int var274 = class61.field1266[var6];
                                                                    class61.field1266[var6++] = class196.method1301(var274, 16383);
                                                                    continue;
                                                                }
                                                                if (~var318 == -3313) {
                                                                    class61.field1266[var6++] = class103.field2127 ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (~var318 == -3314) {
                                                                    var6 -= 2;
                                                                    int var275 = class61.field1266[var6] + 32768;
                                                                    int var276 = class61.field1266[var6 + 1];
                                                                    class61.field1266[var6++] = class136.method911(var276, true, var275);
                                                                    continue;
                                                                }
                                                                if (var318 == 3314) {
                                                                    var6 -= 2;
                                                                    int var277 = class61.field1266[var6] + 32768;
                                                                    int var278 = class61.field1266[var6 + 1];
                                                                    class61.field1266[var6++] = class80.method542(var277, var278, (byte) -101);
                                                                    continue;
                                                                }
                                                                if (var318 == 3315) {
                                                                    var6 -= 2;
                                                                    int var279 = class61.field1266[var6] + 32768;
                                                                    int var280 = class61.field1266[var6 + 1];
                                                                    class61.field1266[var6++] = class121.method816(var280, var279, (byte) 76);
                                                                    continue;
                                                                }
                                                                if (var318 == 3316) {
                                                                    if (~class88.field1730 <= -3) {
                                                                        class61.field1266[var6++] = class88.field1730;
                                                                    } else {
                                                                        class61.field1266[var6++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var318 == -3318) {
                                                                    class61.field1266[var6++] = client.field690;
                                                                    continue;
                                                                }
                                                                if (~var318 == -3319) {
                                                                    class61.field1266[var6++] = class77.field1606;
                                                                    continue;
                                                                }
                                                                if (var318 == 3321) {
                                                                    class61.field1266[var6++] = class174.field3367;
                                                                    continue;
                                                                }
                                                                if (~var318 == -3323) {
                                                                    class61.field1266[var6++] = class49.field1074;
                                                                    continue;
                                                                }
                                                                if (~var318 == -3324) {
                                                                    if (class165.field3253 >= 5 && ~class165.field3253 >= -10) {
                                                                        class61.field1266[var6++] = 1;
                                                                        continue;
                                                                    }
                                                                    class61.field1266[var6++] = 0;
                                                                    continue;
                                                                }
                                                                if (var318 == 3324) {
                                                                    if (~class165.field3253 <= -6 && class165.field3253 <= 9) {
                                                                        class61.field1266[var6++] = class165.field3253;
                                                                        continue;
                                                                    }
                                                                    class61.field1266[var6++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var318 == -3326) {
                                                                    if (~class25.field576 >= -1) {
                                                                        class61.field1266[var6++] = 0;
                                                                    } else {
                                                                        class61.field1266[var6++] = 1;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var318 == -3327) {
                                                                    class61.field1266[var6++] = class15.field423.field1796;
                                                                    continue;
                                                                }
                                                                if (var318 == 3327) {
                                                                    class61.field1266[var6++] = !class15.field423.field1799.field1713 ? 0 : 1;
                                                                    continue;
                                                                }
                                                            }
                                                        } else {
                                                            if (var318 == 3200) {
                                                                var6 -= 3;
                                                                class100.method696(class61.field1266[var6], class61.field1266[var6 - -1], class61.field1266[var6 + 2], -18231);
                                                                continue;
                                                            }
                                                            if (~var318 == -3202) {
                                                                --var6;
                                                                class80.method546(-1, class61.field1266[var6]);
                                                                continue;
                                                            }
                                                            if (~var318 == -3203) {
                                                                var6 -= 2;
                                                                class20.method128(class61.field1266[var6 + 1], class61.field1266[var6], 10661);
                                                                continue;
                                                            }
                                                        }
                                                    } else {
                                                        --var6;
                                                        class1 var281 = class175.method1155(class61.field1266[var6], (byte) -120);
                                                        if (var318 == 2600) {
                                                            class61.field1266[var6++] = var281.field24;
                                                            continue;
                                                        }
                                                        if (~var318 == -2602) {
                                                            class61.field1266[var6++] = var281.field48;
                                                            continue;
                                                        }
                                                        if (~var318 == -2603) {
                                                            class59.field1227[var8++] = var281.field9;
                                                            continue;
                                                        }
                                                        if (var318 == 2603) {
                                                            class61.field1266[var6++] = var281.field143;
                                                            continue;
                                                        }
                                                        if (~var318 == -2605) {
                                                            class61.field1266[var6++] = var281.field73;
                                                            continue;
                                                        }
                                                        if (var318 == 2605) {
                                                            class61.field1266[var6++] = var281.field132;
                                                            continue;
                                                        }
                                                        if (~var318 == -2607) {
                                                            class61.field1266[var6++] = var281.field56;
                                                            continue;
                                                        }
                                                        if (~var318 == -2608) {
                                                            class61.field1266[var6++] = var281.field7;
                                                            continue;
                                                        }
                                                        if (var318 == 2608) {
                                                            class61.field1266[var6++] = var281.field106;
                                                            continue;
                                                        }
                                                        if (~var318 == -2610) {
                                                            class61.field1266[var6++] = var281.field128;
                                                            continue;
                                                        }
                                                    }
                                                } else {
                                                    --var6;
                                                    class1 var282 = class175.method1155(class61.field1266[var6], (byte) 37);
                                                    if (var318 == 2500) {
                                                        class61.field1266[var6++] = var282.field79;
                                                        continue;
                                                    }
                                                    if (~var318 == -2502) {
                                                        class61.field1266[var6++] = var282.field11;
                                                        continue;
                                                    }
                                                    if (var318 == 2502) {
                                                        class61.field1266[var6++] = var282.field96;
                                                        continue;
                                                    }
                                                    if (~var318 == -2504) {
                                                        class61.field1266[var6++] = var282.field28;
                                                        continue;
                                                    }
                                                    if (~var318 == -2505) {
                                                        class61.field1266[var6++] = !var282.field76 ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (var318 == 2505) {
                                                        class61.field1266[var6++] = var282.field36;
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                class1 var283 = var44 ? class158.field3148 : class96.field1929;
                                                if (var318 == 1600) {
                                                    class61.field1266[var6++] = var283.field24;
                                                    continue;
                                                }
                                                if (var318 == 1601) {
                                                    class61.field1266[var6++] = var283.field48;
                                                    continue;
                                                }
                                                if (var318 == 1602) {
                                                    class59.field1227[var8++] = var283.field9;
                                                    continue;
                                                }
                                                if (~var318 == -1604) {
                                                    class61.field1266[var6++] = var283.field143;
                                                    continue;
                                                }
                                                if (var318 == 1604) {
                                                    class61.field1266[var6++] = var283.field73;
                                                    continue;
                                                }
                                                if (~var318 == -1606) {
                                                    class61.field1266[var6++] = var283.field132;
                                                    continue;
                                                }
                                                if (~var318 == -1607) {
                                                    class61.field1266[var6++] = var283.field56;
                                                    continue;
                                                }
                                                if (~var318 == -1608) {
                                                    class61.field1266[var6++] = var283.field7;
                                                    continue;
                                                }
                                                if (var318 == 1608) {
                                                    class61.field1266[var6++] = var283.field106;
                                                    continue;
                                                }
                                                if (var318 == 1609) {
                                                    class61.field1266[var6++] = var283.field128;
                                                    continue;
                                                }
                                            }
                                        } else {
                                            class1 var284 = !var44 ? class96.field1929 : class158.field3148;
                                            if (~var318 == -1501) {
                                                class61.field1266[var6++] = var284.field79;
                                                continue;
                                            }
                                            if (~var318 == -1502) {
                                                class61.field1266[var6++] = var284.field11;
                                                continue;
                                            }
                                            if (var318 == 1502) {
                                                class61.field1266[var6++] = var284.field96;
                                                continue;
                                            }
                                            if (~var318 == -1504) {
                                                class61.field1266[var6++] = var284.field28;
                                                continue;
                                            }
                                            if (var318 == 1504) {
                                                class61.field1266[var6++] = !var284.field76 ? 0 : 1;
                                                continue;
                                            }
                                            if (~var318 == -1506) {
                                                class61.field1266[var6++] = var284.field36;
                                                continue;
                                            }
                                        }
                                    } else {
                                        class1 var285;
                                        if (var318 >= 2000) {
                                            --var6;
                                            var285 = class175.method1155(class61.field1266[var6], (byte) 36);
                                            var318 -= 1000;
                                        } else {
                                            var285 = !var44 ? class96.field1929 : class158.field3148;
                                        }
                                        if (~var318 == -1301) {
                                            --var6;
                                            int var286 = class61.field1266[var6] - 1;
                                            if (~var286 <= -1 && var286 <= 9) {
                                                --var8;
                                                var285.method16(class59.field1227[var8], var286, (byte) 123);
                                                continue;
                                            }
                                            --var8;
                                            continue;
                                        }
                                        if (var318 == 1301) {
                                            var6 -= 2;
                                            int var287 = class61.field1266[var6];
                                            int var288 = class61.field1266[var6 + 1];
                                            var285.field30 = class148.method961(var288, var287, (byte) -118);
                                            continue;
                                        }
                                        if (var318 == 1302) {
                                            --var6;
                                            var285.field85 = class61.field1266[var6] == 1;
                                            continue;
                                        }
                                        if (var318 == 1303) {
                                            --var6;
                                            var285.field62 = class61.field1266[var6];
                                            continue;
                                        }
                                        if (var318 == 1304) {
                                            --var6;
                                            var285.field18 = class61.field1266[var6];
                                            continue;
                                        }
                                        if (~var318 == -1306) {
                                            --var8;
                                            var285.field111 = class59.field1227[var8];
                                            continue;
                                        }
                                        if (~var318 == -1307) {
                                            --var8;
                                            var285.field25 = class59.field1227[var8];
                                            continue;
                                        }
                                        if (var318 == 1307) {
                                            var285.field52 = null;
                                            continue;
                                        }
                                    }
                                } else {
                                    class1 var289;
                                    if (~var318 > -2001) {
                                        var289 = var44 ? class158.field3148 : class96.field1929;
                                    } else {
                                        --var6;
                                        var289 = class175.method1155(class61.field1266[var6], (byte) -75);
                                        var318 -= 1000;
                                    }
                                    class3.method21(26702, var289);
                                    if (var318 == 1200) {
                                        var6 -= 2;
                                        int var290 = class61.field1266[var6 - -1];
                                        int var291 = class61.field1266[var6];
                                        if (~var291 == 0) {
                                            var289.field50 = 1;
                                            var289.field37 = -1;
                                            var289.field131 = -1;
                                        } else {
                                            var289.field87 = var290;
                                            var289.field37 = var291;
                                            class107 var292 = class92.method626((byte) 59, var291);
                                            var289.field5 = var292.field2194;
                                            var289.field132 = var292.field2214;
                                            var289.field56 = var292.field2205;
                                            if (var289.field96 > 0) {
                                                var289.field132 = var289.field132 * 32 / var289.field96;
                                            }
                                            var289.field31 = var292.field2219;
                                            var289.field106 = var292.field2203;
                                            var289.field7 = var292.field2177;
                                        }
                                        continue;
                                    }
                                    if (~var318 == -1202) {
                                        var289.field50 = 2;
                                        --var6;
                                        var289.field131 = class61.field1266[var6];
                                        continue;
                                    }
                                    if (var318 == 1202) {
                                        var289.field50 = 3;
                                        var289.field131 = class15.field423.field1799.method582(arg2 + -111);
                                        continue;
                                    }
                                    if (var318 == 1203) {
                                        var289.field50 = 6;
                                        --var6;
                                        var289.field131 = class61.field1266[var6];
                                        continue;
                                    }
                                    if (var318 == 1204) {
                                        var289.field50 = 5;
                                        --var6;
                                        var289.field131 = class61.field1266[var6];
                                        continue;
                                    }
                                }
                            } else {
                                class1 var47;
                                if (var318 >= 2000) {
                                    var318 -= 1000;
                                    --var6;
                                    var47 = class175.method1155(class61.field1266[var6], (byte) -113);
                                } else {
                                    var47 = !var44 ? class96.field1929 : class158.field3148;
                                }
                                if (var318 == 1100) {
                                    var6 -= 2;
                                    var47.field24 = class61.field1266[var6];
                                    if (~(-var47.field96 + var47.field143) > ~var47.field24) {
                                        var47.field24 = -var47.field96 + var47.field143;
                                    }
                                    if (~var47.field24 > -1) {
                                        var47.field24 = 0;
                                    }
                                    var47.field48 = class61.field1266[var6 + 1];
                                    if (-var47.field28 + var47.field73 < var47.field48) {
                                        var47.field48 = var47.field73 - var47.field28;
                                    }
                                    if (var47.field48 < 0) {
                                        var47.field48 = 0;
                                    }
                                    class3.method21(26702, var47);
                                    continue;
                                }
                                if (var318 == 1101) {
                                    --var6;
                                    var47.field8 = class61.field1266[var6];
                                    class3.method21(26702, var47);
                                    continue;
                                }
                                if (~var318 == -1103) {
                                    --var6;
                                    var47.field53 = ~class61.field1266[var6] == -2;
                                    class3.method21(arg2 ^ 26698, var47);
                                    continue;
                                }
                                if (~var318 == -1104) {
                                    --var6;
                                    var47.field128 = class61.field1266[var6];
                                    class3.method21(26702, var47);
                                    continue;
                                }
                                if (~var318 == -1105) {
                                    --var6;
                                    var47.field19 = class61.field1266[var6];
                                    class3.method21(26702, var47);
                                    continue;
                                }
                                if (~var318 == -1106) {
                                    --var6;
                                    var47.field110 = class61.field1266[var6];
                                    class3.method21(arg2 ^ 26698, var47);
                                    continue;
                                }
                                if (~var318 == -1107) {
                                    --var6;
                                    var47.field69 = class61.field1266[var6];
                                    class3.method21(26702, var47);
                                    continue;
                                }
                                if (var318 == 1107) {
                                    --var6;
                                    var47.field95 = class61.field1266[var6] == 1;
                                    class3.method21(26702, var47);
                                    continue;
                                }
                                if (~var318 == -1109) {
                                    var47.field50 = 1;
                                    --var6;
                                    var47.field131 = class61.field1266[var6];
                                    class3.method21(26702, var47);
                                    continue;
                                }
                                if (var318 == 1109) {
                                    var6 -= 6;
                                    var47.field31 = class61.field1266[var6];
                                    var47.field5 = class61.field1266[var6 + 1];
                                    var47.field56 = class61.field1266[var6 + 2];
                                    var47.field106 = class61.field1266[var6 + 3];
                                    var47.field7 = class61.field1266[var6 + 4];
                                    var47.field132 = class61.field1266[var6 + 5];
                                    class3.method21(arg2 ^ 26698, var47);
                                    continue;
                                }
                                if (~var318 == -1111) {
                                    --var6;
                                    int var48 = class61.field1266[var6];
                                    if (~var47.field27 != ~var48) {
                                        var47.field27 = var48;
                                        var47.field140 = 0;
                                        var47.field130 = 0;
                                        class3.method21(26702, var47);
                                    }
                                    continue;
                                }
                                if (~var318 == -1112) {
                                    --var6;
                                    var47.field107 = class61.field1266[var6] == 1;
                                    class3.method21(arg2 + 26698, var47);
                                    continue;
                                }
                                if (var318 == 1112) {
                                    --var8;
                                    class92 var49 = class59.field1227[var8];
                                    if (!var49.method631(5003, var47.field9)) {
                                        var47.field9 = var49;
                                        class3.method21(arg2 ^ 26698, var47);
                                    }
                                    continue;
                                }
                                if (~var318 == -1114) {
                                    --var6;
                                    var47.field103 = class61.field1266[var6];
                                    class3.method21(26702, var47);
                                    continue;
                                }
                                if (var318 == 1114) {
                                    var6 -= 3;
                                    var47.field88 = class61.field1266[var6];
                                    var47.field127 = class61.field1266[var6 + 1];
                                    var47.field119 = class61.field1266[var6 + 2];
                                    class3.method21(26702, var47);
                                    continue;
                                }
                                if (~var318 == -1116) {
                                    --var6;
                                    var47.field102 = class61.field1266[var6] == 1;
                                    class3.method21(arg2 ^ 26698, var47);
                                    continue;
                                }
                                if (~var318 == -1117) {
                                    --var6;
                                    var47.field109 = class61.field1266[var6];
                                    class3.method21(26702, var47);
                                    continue;
                                }
                                if (var318 == 1117) {
                                    --var6;
                                    var47.field51 = class61.field1266[var6];
                                    class3.method21(26702, var47);
                                    continue;
                                }
                                if (~var318 == -1119) {
                                    --var6;
                                    var47.field123 = class61.field1266[var6] == 1;
                                    class3.method21(26702, var47);
                                    continue;
                                }
                                if (var318 == 1119) {
                                    --var6;
                                    var47.field84 = ~class61.field1266[var6] == -2;
                                    class3.method21(arg2 ^ 26698, var47);
                                    continue;
                                }
                                if (~var318 == -1121) {
                                    var6 -= 2;
                                    var47.field143 = class61.field1266[var6];
                                    var47.field73 = class61.field1266[var6 + 1];
                                    class3.method21(26702, var47);
                                    continue;
                                }
                            }
                        } else {
                            if (~var318 == -404) {
                                var6 -= 2;
                                int var293 = class61.field1266[var6 + 1];
                                int var294 = class61.field1266[var6];
                                if (var294 >= 7) {
                                    var294 -= 7;
                                }
                                class15.field423.field1799.method579(-29382, var294, var293);
                                continue;
                            }
                            if (~var318 == -405) {
                                var6 -= 2;
                                int var295 = class61.field1266[var6];
                                int var296 = class61.field1266[var6 + 1];
                                class15.field423.field1799.method576(0, var296, var295);
                                continue;
                            }
                            if (var318 == 410) {
                                --var6;
                                boolean var297 = ~class61.field1266[var6] != -1;
                                class15.field423.field1799.method571((byte) 93, var297);
                                continue;
                            }
                        }
                    } else {
                        if (var318 == 100) {
                            var6 -= 3;
                            int var298 = class61.field1266[var6 + 1];
                            int var299 = class61.field1266[var6 + 2];
                            int var300 = class61.field1266[var6];
                            if (var298 == 0) {
                                throw new RuntimeException();
                            }
                            class1 var301 = class175.method1155(var300, (byte) -109);
                            if (var301.field55 == null) {
                                var301.field55 = new class1[var299 + 1];
                            }
                            if (~var299 <= ~var301.field55.length) {
                                class1[] var302 = new class1[var299 + 1];
                                for (int var303 = 0; var301.field55.length > var303; ++var303) {
                                    var302[var303] = var301.field55[var303];
                                }
                                var301.field55 = var302;
                            }
                            if (var299 > 0 && var301.field55[var299 + -1] == null) {
                                throw new RuntimeException("Gap at:" + (var299 - 1));
                            }
                            class1 var304 = new class1();
                            var304.field36 = var304.field100 = var301.field100;
                            var304.field10 = var298;
                            var304.field94 = true;
                            var304.field90 = var299;
                            var301.field55[var299] = var304;
                            if (!var44) {
                                class96.field1929 = var304;
                            } else {
                                class158.field3148 = var304;
                            }
                            class3.method21(26702, var301);
                            continue;
                        }
                        if (var318 == 101) {
                            class1 var305 = !var44 ? class96.field1929 : class158.field3148;
                            if (var305.field90 == -1) {
                                if (!var44) {
                                    throw new RuntimeException("Tried to cc_delete static active-component!");
                                }
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            class1 var306 = class175.method1155(var305.field100, (byte) -77);
                            var306.field55[var305.field90] = null;
                            class3.method21(26702, var306);
                            continue;
                        }
                        if (~var318 == -103) {
                            --var6;
                            class1 var307 = class175.method1155(class61.field1266[var6], (byte) 76);
                            var307.field55 = null;
                            class3.method21(26702, var307);
                            continue;
                        }
                        if (~var318 == -201) {
                            var6 -= 2;
                            int var308 = class61.field1266[var6];
                            int var309 = class61.field1266[var6 + 1];
                            class1 var310 = class148.method961(var309, var308, (byte) -85);
                            if (var310 != null && var309 != -1) {
                                class61.field1266[var6++] = 1;
                                if (!var44) {
                                    class96.field1929 = var310;
                                } else {
                                    class158.field3148 = var310;
                                }
                                continue;
                            }
                            class61.field1266[var6++] = 0;
                            continue;
                        }
                        if (~var318 == -202) {
                            --var6;
                            int var311 = class61.field1266[var6];
                            class1 var312 = class175.method1155(var311, (byte) -75);
                            if (var312 != null) {
                                class61.field1266[var6++] = 1;
                                if (var44) {
                                    class158.field3148 = var312;
                                } else {
                                    class96.field1929 = var312;
                                }
                            } else {
                                class61.field1266[var6++] = 0;
                            }
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            } catch (Exception var317) {
                if (var5.field2443 != null) {
                    class92 var314 = class189.method1220(30, arg2 + -4);
                    var314.method605(true, class41.field912).method605(true, var5.field2443);
                    for (int var315 = class177.field3403 - 1; ~var315 <= -1; --var315) {
                        var314.method605(true, class111.field2254).method605(true, class77.field1597[var315].field1113.field2443);
                    }
                    if (var10 == 40) {
                        int var316 = var11[var7];
                        var314.method605(true, class93.field1875).method605(true, class142.method938(var316, false));
                    }
                    if (~class98.field1996 != -1) {
                        class117.method788(class123.field2482, -19001, 0, class77.method529(-3, new class92[] { class91.field1804, var5.field2443 }));
                    }
                    class164.method1059("CS2 - scr:" + var5.field4079 + " op:" + var10 + new String(var314.method623((byte) 99)), var317, arg2 + 96);
                } else {
                    if (class98.field1996 != 0) {
                        class117.method788(class123.field2482, arg2 ^ -19005, 0, class104.field2143);
                    }
                    class164.method1059("CS2 - scr:" + var5.field4079 + " op:" + var10, var317, 118);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        ++field2988;
        int[][] var3 = super.field1873.method553(arg0, 0);
        if (arg1 != 4096) {
            field2989 = false;
        }
        if (super.field1873.field1656) {
            int[][] var4 = this.method649(0, true, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class150.field2985; ++var11) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var7[var11];
                if (~var12 > ~this.field3005) {
                    var8[var11] = this.field3005;
                } else if (~this.field3000 > ~var12) {
                    var8[var11] = this.field3000;
                } else {
                    var8[var11] = var12;
                }
                if (~this.field3005 >= ~var13) {
                    if (var13 <= this.field3000) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field3000;
                    }
                } else {
                    var9[var11] = this.field3005;
                }
                if (~var14 > ~this.field3005) {
                    var10[var11] = this.field3005;
                } else if (this.field3000 >= var14) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field3000;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        int[] var3 = super.field1887.method916(arg0, -13);
        int var4 = 55 % ((arg1 - 67) / 42);
        ++field2992;
        if (super.field1887.field2757) {
            int[] var5 = this.method648((byte) 114, arg0, 0);
            for (int var6 = 0; ~class150.field2985 < ~var6; ++var6) {
                int var7 = var5[var6];
                if (~this.field3005 < ~var7) {
                    var3[var6] = this.field3005;
                } else if (var7 > this.field3000) {
                    var3[var6] = this.field3000;
                } else {
                    var3[var6] = var7;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V")
    public static void method971(int arg0) {
        field2998 = null;
        field2990 = null;
        field2999 = null;
        field3001 = null;
        field3006 = null;
        if (arg0 == 35) {
            field2986 = null;
            field2987 = null;
            field3004 = null;
            field2993 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class151() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)V")
    public static final void method972(int arg0) {
        class186.field3519.method923(-108);
        if (arg0 < 28) {
            field3002 = 70;
        }
        class40.field902.method923(-99);
        ++field2995;
        class65.field1330.method923(-118);
    }
}
