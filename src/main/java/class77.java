import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class77 extends class123 {

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "Lgd;")
    public static class325 field1196 = new class325(4);

    @OriginalMember(owner = "client!tm", name = "K", descriptor = "I")
    public static int field1211 = 0;

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!tm", name = "A", descriptor = "I")
    public int field1201;

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "client!tm", name = "D", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!tm", name = "E", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!tm", name = "H", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!tm", name = "I", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!tm", name = "J", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!tm", name = "L", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!tm", name = "M", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!tm", name = "N", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "Ljava/lang/String;")
    public String field1195;

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "[I")
    public int[] field1199;

    @OriginalMember(owner = "client!tm", name = "C", descriptor = "[I")
    public int[] field1203;

    @OriginalMember(owner = "client!tm", name = "F", descriptor = "[Lpd;")
    public class3[] field1206;

    @OriginalMember(owner = "client!tm", name = "G", descriptor = "[Ljava/lang/String;")
    public String[] field1207;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)Ltk;", line = 10)
    public static final class266 method604(int arg0, int arg1, int arg2) {
        if (arg2 != -10316) {
            return (class266) null;
        }
        field1208++;
        class266 var3 = class171.method1276(arg1, (byte) 40);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field3994 == null || var3.field3994.length <= arg0) {
            return null;
        } else {
            return var3.field3994[arg0];
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V", line = 31)
    public static void method605(int arg0) {
        if (arg0 != 127) {
            method610(-55);
        }
        field1196 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIIII)V", line = 42)
    public static final void method606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 0) {
            field1212 = -126;
        }
        int var7 = arg4 - arg1;
        int var8 = arg1 + arg5;
        field1204++;
        int var9 = arg0 - arg1;
        int var10 = arg6 + arg1;
        for (int var11 = arg6; var11 < var10; var11++) {
            class323.method2273(arg5, arg2, class221.field3443[var11], arg0, arg3 + 49);
        }
        for (int var12 = arg4; var12 > var7; var12--) {
            class323.method2273(arg5, arg2, class221.field3443[var12], arg0, 99);
        }
        for (int var13 = var10; var13 <= var7; var13++) {
            int[] var14 = class221.field3443[var13];
            class323.method2273(arg5, arg2, var14, var8, 50);
            class323.method2273(var9, arg2, var14, arg0, 73);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IBZZ)V", line = 90)
    public static final void method607(int arg0, byte arg1, boolean arg2, boolean arg3) {
        field1197++;
        int var4 = 0;
        if (arg1 != -67) {
            field1214 = -8;
        }
        int var10002;
        while (class83.field1290 > var4) {
            class86 var5 = class197.field3029[class76.field1192[var4]];
            if (var5 != null && var5.method681(true) && var5.field1381.method663(arg1 - 52)) {
                label269: {
                    int var6 = var5.method738(-6421);
                    if (arg2) {
                        if (!var5.field1381.field1324) {
                            break label269;
                        }
                    } else if (arg3 != var5.field1381.field1364 || arg0 != 0 && arg0 != var6) {
                        break label269;
                    }
                    if (var6 == 1) {
                        if ((var5.field4671 & 0x7F) == 64 && (var5.field4672 & 0x7F) == 64) {
                            int var7 = var5.field4671 >> 7;
                            int var8 = var5.field4672 >> 7;
                            if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                                var10002 = class171.field2755[var7][var8]++;
                            }
                        }
                    } else if (((var6 & 0x1) != 0 || (var5.field4671 & 0x7F) == 0 && (var5.field4672 & 0x7F) == 0) && ((var6 & 0x1) != 1 || (var5.field4671 & 0x7F) == 64 && (var5.field4672 & 0x7F) == 64)) {
                        int var9 = var5.field4671 - (var6 * 64) >> 7;
                        int var10 = var5.field4672 - (var6 * 64) >> 7;
                        int var11 = var9 + var5.method738(-6421);
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        int var12 = var10 + var5.method738(-6421);
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        if (var12 > 104) {
                            var12 = 104;
                        }
                        for (int var13 = var9; var13 < var11; var13++) {
                            for (int var14 = var10; var14 < var12; var14++) {
                                var10002 = class171.field2755[var13][var14]++;
                            }
                        }
                    }
                }
            }
            var4++;
        }
        label210: for (int var15 = 0; var15 < class83.field1290; var15++) {
            long var16 = (long) class76.field1192[var15] << 32 | 0x20000000L;
            class86 var18 = class197.field3029[class76.field1192[var15]];
            if (var18 != null && var18.method681(true) && var18.field1381.method663(-127)) {
                int var19 = var18.method738(-6421);
                if (arg2) {
                    if (!var18.field1381.field1324) {
                        continue;
                    }
                } else if (var18.field1381.field1364 != arg3 || arg0 != 0 && arg0 != var19) {
                    continue;
                }
                var18.field4659 = true;
                if (var19 == 1) {
                    if ((var18.field4671 & 0x7F) == 64 && (var18.field4672 & 0x7F) == 64) {
                        int var29 = var18.field4671 >> 7;
                        int var30 = var18.field4672 >> 7;
                        if (var29 < 0 || var29 >= 104 || var30 < 0 || var30 >= 104) {
                            continue;
                        }
                        if (class171.field2755[var29][var30] > 1) {
                            var10002 = class171.field2755[var29][var30]--;
                            continue;
                        }
                    }
                } else if ((var19 & 0x1) == 0 && (var18.field4671 & 0x7F) == 0 && (var18.field4672 & 0x7F) == 0 || (var19 & 0x1) == 1 && (var18.field4671 & 0x7F) == 64 && (var18.field4672 & 0x7F) == 64) {
                    int var20 = var18.field4671 - (var19 * 64) >> 7;
                    int var21 = var18.field4672 - (var19 * 64) >> 7;
                    int var22 = var19 + var20;
                    if (var20 < 0) {
                        var20 = 0;
                    }
                    if (var22 > 104) {
                        var22 = 104;
                    }
                    boolean var23 = true;
                    int var24 = var19 + var21;
                    if (var24 > 104) {
                        var24 = 104;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var25 = var20; var25 < var22; var25++) {
                        for (int var26 = var21; var26 < var24; var26++) {
                            if (class171.field2755[var25][var26] <= 1) {
                                var23 = false;
                                break;
                            }
                        }
                    }
                    if (var23) {
                        int var27 = var20;
                        while (true) {
                            if (var22 <= var27) {
                                continue label210;
                            }
                            for (int var28 = var21; var28 < var24; var28++) {
                                var10002 = class171.field2755[var27][var28]--;
                            }
                            var27++;
                        }
                    }
                }
                if (!var18.field1381.field1325) {
                    var16 |= Long.MIN_VALUE;
                }
                var18.field4659 = false;
                var18.field4635 = class170.method1265(var18.field4671, var18.field4672, class75.field1153, 1);
                class149.method1132(class75.field1153, var18.field4671, var18.field4672, var18.field4635, (var19 - 1) * 64 + 60, var18, var18.field4682, var16, var18.field4610);
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(IIIIIII)V", line = 340)
    public static final void method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class25.field428 == 0) {
            int var7 = class8.field198;
            int var8 = class149.field2428;
            int var9 = class179.field2851;
            int var10 = (arg4 - arg0) * (var9 - var7) / arg1 + var7;
            int var11 = class323.field5064;
            int var12 = (var11 - var8) * (arg5 - arg3) / arg2 + var8;
            if (class315.field4977 && (class36.field549 & 0x40) != 0) {
                class266 var13 = method604(class201.field3076, class22.field392, -10316);
                if (var13 == null) {
                    class28.method249(-1);
                } else {
                    class147.method1121(var10, class129.field2067, var12, " ->", class301.field4797, 118, 0L, (short) 58);
                }
            } else {
                if (class109.field1773 == 1) {
                    class147.method1121(var10, class197.field3036, var12, "", -1, 126, 0L, (short) 45);
                }
                class99.field1575++;
                class147.method1121(var10, class321.field5023, var12, "", -1, 121, 0L, (short) 31);
            }
        }
        field1205++;
        long var14 = -1L;
        if (arg6 != -347) {
            return;
        }
        for (int var16 = 0; var16 < class79.field1236; var16++) {
            long var17 = class255.field3760[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x738E22D0) >> 29;
            int var21 = ((int) var17 & 0x3F9C) >> 7;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                var14 = var17;
                if (var20 == 2 && class289.method2034(class75.field1153, var19, var21, var17)) {
                    class101 var23 = class288.method2025(var22, -1);
                    if (var23.field1653 != null) {
                        var23 = var23.method813((byte) -29);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class25.field428 == 1) {
                        class304.field4839++;
                        class147.method1121(var19, class93.field1522, var21, class141.field2283 + " -> <col=00ffff>" + var23.field1677, class116.field1880, 122, var17, (short) 57);
                    } else if (class315.field4977) {
                        class139 var24 = class299.field4785 == -1 ? null : class331.method2317((byte) -30, class299.field4785);
                        if ((class36.field549 & 0x4) != 0 && (var24 == null || var23.method821(-128, class299.field4785, var24.field2255) != var24.field2255)) {
                            class88.field1414++;
                            class147.method1121(var19, class129.field2067, var21, class55.field848 + " -> <col=00ffff>" + var23.field1677, class301.field4797, -112, var17, (short) 10);
                        }
                    } else {
                        class190.field2985++;
                        String[] var25 = var23.field1678;
                        if (class106.field1748) {
                            var25 = class180.method1319((byte) 42, var25);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class273.field4269++;
                                    int var27 = -1;
                                    if (var23.field1652 == var26) {
                                        var27 = var23.field1614;
                                    }
                                    short var28 = 0;
                                    if (var26 == 0) {
                                        var28 = 17;
                                    }
                                    if (var26 == 1) {
                                        var28 = 23;
                                    }
                                    if (var26 == 2) {
                                        var28 = 5;
                                    }
                                    if (var26 == 3) {
                                        var28 = 22;
                                    }
                                    if (var26 == 4) {
                                        var28 = 1002;
                                    }
                                    if (var23.field1608 == var26) {
                                        var27 = var23.field1615;
                                    }
                                    class147.method1121(var19, var25[var26], var21, "<col=00ffff>" + var23.field1677, var27, 121, var17, var28);
                                }
                            }
                        }
                        class147.method1121(var19, class18.field342, var21, "<col=00ffff>" + var23.field1677, class217.field3372, -103, (long) var23.field1665, (short) 1001);
                    }
                }
                if (var20 == 1) {
                    class86 var29 = class197.field3029[var22];
                    if ((var29.field1381.field1363 & 0x1) == 0 && (var29.field4671 & 0x7F) == 0 && (var29.field4672 & 0x7F) == 0 || (var29.field1381.field1363 & 0x1) == 1 && (var29.field4671 & 0x7F) == 64 && (var29.field4672 & 0x7F) == 64) {
                        int var30 = var29.field4671 - (var29.field1381.field1363 - 1) * 64;
                        int var31 = var29.field4672 + 64 - (var29.field1381.field1363 * 64);
                        for (int var32 = 0; var32 < class83.field1290; var32++) {
                            class86 var33 = class197.field3029[class76.field1192[var32]];
                            if (var33 != null && !var33.field4684 && var29 != var33 && var33.field4659) {
                                int var34 = var33.field4671 - ((var33.field1381.field1363 - 1) * 64);
                                int var35 = var33.field4672 - ((var33.field1381.field1363 - 1) * 64);
                                if (var34 >= var30 && var33.field1381.field1363 <= (var29.field1381.field1363 - (var34 - var30 >> 7)) && var35 >= var31 && var29.field1381.field1363 - (var35 - var31 >> 7) >= var33.field1381.field1363) {
                                    class22.method222(0, var33.field1381, var19, class76.field1192[var32], var21);
                                    var33.field4684 = true;
                                }
                            }
                        }
                        for (int var36 = 0; var36 < class45.field703; var36++) {
                            class92 var37 = class74.field1140[class325.field5068[var36]];
                            if (var37 != null && !var37.field4684 && var37.field4659) {
                                int var38 = var37.field4671 - (var37.method738(-6421) - 1) * 64;
                                int var39 = var37.field4672 - (var37.method738(-6421) - 1) * 64;
                                if (var38 >= var30 && var37.method738(-6421) <= (var29.field1381.field1363 - (var38 - var30 >> 7)) && var31 <= var39 && var37.method738(-6421) <= var29.field1381.field1363 - (var39 - var31 >> 7)) {
                                    class213.method1545(var19, class325.field5068[var36], var21, var37, -2048);
                                    var37.field4684 = true;
                                }
                            }
                        }
                    }
                    if (var29.field4684) {
                        continue;
                    }
                    class22.method222(arg6 + 347, var29.field1381, var19, var22, var21);
                    var29.field4684 = true;
                }
                if (var20 == 0) {
                    class92 var40 = class74.field1140[var22];
                    if ((var40.field4671 & 0x7F) == 64 && (var40.field4672 & 0x7F) == 64) {
                        int var41 = var40.field4671 + 64 - var40.method738(-6421) * 64;
                        int var42 = var40.field4672 - (var40.method738(-6421) - 1) * 64;
                        for (int var43 = 0; var43 < class83.field1290; var43++) {
                            class86 var44 = class197.field3029[class76.field1192[var43]];
                            if (var44 != null && !var44.field4684 && var44.field4659) {
                                int var45 = var44.field4671 - ((var44.field1381.field1363 - 1) * 64);
                                int var46 = var44.field4672 - ((var44.field1381.field1363 - 1) * 64);
                                if (var45 >= var41 && var44.field1381.field1363 <= (var40.method738(-6421) - (var45 - var41 >> 7)) && var42 <= var46 && var44.field1381.field1363 <= var40.method738(-6421) - (var46 - var42 >> 7)) {
                                    class22.method222(arg6 + 347, var44.field1381, var19, class76.field1192[var43], var21);
                                    var44.field4684 = true;
                                }
                            }
                        }
                        for (int var47 = 0; var47 < class45.field703; var47++) {
                            class92 var48 = class74.field1140[class325.field5068[var47]];
                            if (var48 != null && !var48.field4684 && var40 != var48 && var48.field4659) {
                                int var49 = var48.field4671 + 64 - (var48.method738(-6421) * 64);
                                int var50 = var48.field4672 + 64 - var48.method738(arg6 ^ 0x184E) * 64;
                                if (var41 <= var49 && var48.method738(-6421) <= var40.method738(-6421) - (var49 - var41 >> 7) && var42 <= var50 && var48.method738(-6421) <= var40.method738(-6421) - (var50 - var42 >> 7)) {
                                    class213.method1545(var19, class325.field5068[var47], var21, var48, arg6 - 1701);
                                    var48.field4684 = true;
                                }
                            }
                        }
                    }
                    if (var40.field4684) {
                        continue;
                    }
                    class213.method1545(var19, var22, var21, var40, -2048);
                    var40.field4684 = true;
                }
                if (var20 == 3) {
                    class30 var51 = class316.field4985[class75.field1153][var19][var21];
                    if (var51 != null) {
                        for (class227 var52 = (class227) var51.method269((byte) 101); var52 != null; var52 = (class227) var51.method273(-28007)) {
                            int var53 = var52.field3510.field1029;
                            class135 var54 = class188.method1361(true, var53);
                            if (class25.field428 == 1) {
                                class117.field1895++;
                                class147.method1121(var19, class93.field1522, var21, class141.field2283 + " -> <col=ff9040>" + var54.field2200, class116.field1880, arg6 ^ 0x16F, (long) var53, (short) 7);
                            } else if (class315.field4977) {
                                class139 var59 = class299.field4785 == -1 ? null : class331.method2317((byte) -30, class299.field4785);
                                if ((class36.field549 & 0x1) != 0 && (var59 == null || var54.method1032(class299.field4785, (byte) -48, var59.field2255) != var59.field2255)) {
                                    class147.method1121(var19, class129.field2067, var21, class55.field848 + " -> <col=ff9040>" + var54.field2200, class301.field4797, -69, (long) var53, (short) 20);
                                    class56.field857++;
                                }
                            } else {
                                class237.field3564++;
                                String[] var55 = var54.field2186;
                                if (class106.field1748) {
                                    var55 = class180.method1319((byte) 102, var55);
                                }
                                for (int var56 = 4; var56 >= 0; var56--) {
                                    if (var55 != null && var55[var56] != null) {
                                        class110.field1787++;
                                        byte var57 = 0;
                                        if (var56 == 0) {
                                            var57 = 12;
                                        }
                                        if (var56 == 1) {
                                            var57 = 44;
                                        }
                                        if (var56 == 2) {
                                            var57 = 21;
                                        }
                                        if (var56 == 3) {
                                            var57 = 40;
                                        }
                                        if (var56 == 4) {
                                            var57 = 60;
                                        }
                                        int var58 = -1;
                                        if (var54.field2176 == var56) {
                                            var58 = var54.field2147;
                                        }
                                        if (var54.field2181 == var56) {
                                            var58 = var54.field2153;
                                        }
                                        class147.method1121(var19, var55[var56], var21, "<col=ff9040>" + var54.field2200, var58, -65, (long) var53, var57);
                                    }
                                }
                                class147.method1121(var19, class18.field342, var21, "<col=ff9040>" + var54.field2200, class217.field3372, -91, (long) var53, (short) 1005);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IJ)V", line = 752)
    public static final void method609(int arg0, long arg1) {
        class209.field3305.field48 = 0;
        class209.field3305.method21(-127, 21);
        field1210++;
        class209.field3305.method59(arg1, false);
        class42.field663 = -3;
        class74.field1118 = 1;
        class257.field3824 = arg0;
        class8.field196 = 0;
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V", line = 769)
    public static final void method610(int arg0) {
        class288.field4508 = new class30();
        int var1 = -5 % ((-arg0 - 19) / 40);
        field1209++;
    }
}
