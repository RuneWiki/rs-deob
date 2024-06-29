import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class189 {

    @OriginalMember(owner = "client!me", name = "m", descriptor = "J")
    public long field3008 = 0L;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "[B")
    public static byte[] field2997 = new byte[520];

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3003 = " from your ignore list first.";

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field3010 = 0;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public int field2999;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public int field3005;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public int field3007;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public int field3009;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Ldg;")
    public class320 field2996;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Ldg;")
    public class320 field2998;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II[SI[Ljava/lang/String;)V", line = 10)
    public static final void method1405(int arg0, int arg1, short[] arg2, int arg3, String[] arg4) {
        if (arg3 != 1) {
            field3003 = (String) null;
        }
        if (arg1 < arg0) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg1;
            String var7 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            for (int var9 = arg1; var9 < arg0; var9++) {
                if (var7 == null || arg4[var9] != null && (var9 & 0x1) > arg4[var9].compareTo(var7)) {
                    String var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg4[arg0] = arg4[var6];
            arg4[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method1405(var6 - 1, arg1, arg2, 1, arg4);
            method1405(arg0, var6 + 1, arg2, 1, arg4);
        }
        field3004++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V", line = 65)
    public static void method1406(boolean arg0) {
        field3003 = null;
        if (arg0) {
            field2997 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZIII)I", line = 80)
    public static final int method1407(boolean arg0, int arg1, int arg2, int arg3) {
        field3006++;
        if (!arg0) {
            field3003 = (String) null;
        }
        if ((class250.field3857[arg2][arg1][arg3] & 0x8) == 0) {
            return arg2 <= 0 || (class250.field3857[1][arg1][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V", line = 102)
    public static final void method1408(int arg0, int arg1) {
        if (arg1 != 6) {
            method1409(94, false);
        }
        field3001++;
        if (class19.field356.field1442 - (class19.field356.method200(-1) - 1) * 64 >> 7 == class25.field417 && class19.field356.field1369 - (class19.field356.method200(-1) - 1) * 64 >> 7 == class36.field640) {
            class25.field417 = 0;
        }
        int var2 = class65.field1058;
        if (arg0 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class30 var4;
            if (arg0 == 0) {
                var4 = class19.field356;
            } else {
                var4 = class82.field1228[class149.field2398[var3]];
            }
            if (var4 != null && var4.method199(arg1 + 52)) {
                int var5 = var4.method200(-1);
                if (arg0 == 0 || arg0 == var5) {
                    if (var5 == 1) {
                        if ((var4.field1442 & 0x7F) == 64 && (var4.field1369 & 0x7F) == 64) {
                            int var6 = var4.field1442 >> 7;
                            int var7 = var4.field1369 >> 7;
                            if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                                var10002 = class270.field4203[var6][var7]++;
                            }
                        }
                    } else if (((var5 & 0x1) != 0 || (var4.field1442 & 0x7F) == 0 && (var4.field1369 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field1442 & 0x7F) == 64 && (var4.field1369 & 0x7F) == 64)) {
                        int var8 = var4.field1442 - (var5 * 64) >> 7;
                        int var9 = var4.field1369 - (var5 * 64) >> 7;
                        int var10 = var8 + var4.method200(-1);
                        int var11 = var4.method200(-1) + var9;
                        if (var10 > 104) {
                            var10 = 104;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        for (int var12 = var8; var12 < var10; var12++) {
                            for (int var13 = var9; var13 < var11; var13++) {
                                var10002 = class270.field4203[var12][var13]++;
                            }
                        }
                    }
                }
            }
        }
        label231: for (int var14 = 0; var14 < var2; var14++) {
            class30 var15;
            long var16;
            if (arg0 == 0) {
                var15 = class19.field356;
                var16 = 8791798054912L;
            } else {
                var15 = class82.field1228[class149.field2398[var14]];
                var16 = (long) class149.field2398[var14] << 32;
            }
            if (var15 != null && var15.method199(58)) {
                int var18 = var15.method200(-1);
                if (arg0 == 0 || arg0 == var18) {
                    var15.field1441 = true;
                    var15.field486 = false;
                    if ((class65.field1055 && class65.field1058 > 200 || class65.field1058 > 50) && arg0 != 0 && var15.field1453 == var15.method640(122).field970) {
                        var15.field486 = true;
                    }
                    if (var18 == 1) {
                        if ((var15.field1442 & 0x7F) == 64 && (var15.field1369 & 0x7F) == 64) {
                            int var19 = var15.field1442 >> 7;
                            int var20 = var15.field1369 >> 7;
                            if (var19 < 0 || var19 >= 104 || var20 < 0 || var20 >= 104) {
                                continue;
                            }
                            if (class270.field4203[var19][var20] > 1) {
                                var10002 = class270.field4203[var19][var20]--;
                                continue;
                            }
                        }
                    } else if ((var18 & 0x1) == 0 && (var15.field1442 & 0x7F) == 0 && (var15.field1369 & 0x7F) == 0 || (var18 & 0x1) == 1 && (var15.field1442 & 0x7F) == 64 && (var15.field1369 & 0x7F) == 0) {
                        int var21 = var15.field1442 - var18 * 64 >> 7;
                        int var22 = var15.field1369 - (var18 * 64) >> 7;
                        int var23 = var18 + var21;
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        if (var23 > 104) {
                            var23 = 104;
                        }
                        int var24 = var18 + var22;
                        if (var24 > 104) {
                            var24 = 104;
                        }
                        boolean var25 = true;
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        for (int var26 = var21; var26 < var23; var26++) {
                            for (int var27 = var22; var27 < var24; var27++) {
                                if (class270.field4203[var26][var27] <= 1) {
                                    var25 = false;
                                    break;
                                }
                            }
                        }
                        if (var25) {
                            int var28 = var21;
                            while (true) {
                                if (var23 <= var28) {
                                    continue label231;
                                }
                                for (int var29 = var22; var29 < var24; var29++) {
                                    var10002 = class270.field4203[var28][var29]--;
                                }
                                var28++;
                            }
                        }
                    }
                    if (var15.field1381 == null || var15.field1358 > class205.field3252 || class205.field3252 >= var15.field1367) {
                        var15.field1441 = false;
                        var15.field1425 = class48.method374(var15.field1369, var15.field1442, 101, class41.field734);
                        class293.method2063(class41.field734, var15.field1442, var15.field1369, var15.field1425, (var18 - 1) * 64 + 60, var15, var15.field1443, var16, var15.field1450);
                    } else {
                        var15.field1441 = false;
                        var15.field486 = false;
                        var15.field1425 = class48.method374(var15.field1369, var15.field1442, arg1 ^ 0x69, class41.field734);
                        class285.method2016(class41.field734, var15.field1442, var15.field1369, var15.field1425, var15, var15.field1443, var16, var15.field1428, var15.field1448, var15.field1372, var15.field1452);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IZ)V", line = 371)
    public static final void method1409(int arg0, boolean arg1) {
        field3000++;
        class28.field455 = arg1;
        if (class28.field455) {
            class267.field4132.method249(arg0);
            for (int var15 = 0; var15 < 4; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    for (int var17 = 0; var17 < 13; var17++) {
                        int var18 = class267.field4132.method240(1, -67);
                        if (var18 == 1) {
                            class261.field4046[var15][var16][var17] = class267.field4132.method240(26, -81);
                        } else {
                            class261.field4046[var15][var16][var17] = -1;
                        }
                    }
                }
            }
            class267.field4132.method238(arg0 + 7);
            int var19 = (class45.field779 - class267.field4132.field1667) / 16;
            class65.field1067 = new int[var19][4];
            for (int var20 = 0; var20 < var19; var20++) {
                for (int var21 = 0; var21 < 4; var21++) {
                    class65.field1067[var20][var21] = class267.field4132.method762(-113);
                }
            }
            int var22 = class267.field4132.method724(-1);
            int var23 = class267.field4132.method731(false);
            int var24 = class267.field4132.method782(false);
            int var25 = class267.field4132.method746(arg0 - 13551);
            int var26 = class267.field4132.method731(false);
            class30.field508 = new byte[var19][];
            class151.field2425 = new byte[var19][];
            class102.field1728 = new int[var19];
            class329.field5094 = new int[var19];
            class95.field1570 = new int[var19];
            class118.field1901 = null;
            class2.field2 = new byte[var19][];
            class140.field2226 = new int[var19];
            class138.field2190 = new int[var19];
            class307.field4845 = (byte[][]) null;
            class104.field1756 = new byte[var19][];
            int var27 = 0;
            for (int var28 = 0; var28 < 4; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    for (int var30 = 0; var30 < 13; var30++) {
                        int var31 = class261.field4046[var28][var29][var30];
                        if (var31 != -1) {
                            int var32 = (var31 & 0xFFD980) >> 14;
                            int var33 = (var31 & 0x3FFD) >> 3;
                            int var34 = (var32 / 8 << 8) + (var33 / 8);
                            for (int var35 = 0; var35 < var27; var35++) {
                                if (class102.field1728[var35] == var34) {
                                    var34 = -1;
                                    break;
                                }
                            }
                            if (var34 != -1) {
                                class102.field1728[var27] = var34;
                                int var36 = var34 >> 8 & 0xFF;
                                int var37 = var34 & 0xFF;
                                class329.field5094[var27] = class224.field3602.method487(false, "m" + var36 + "_" + var37);
                                class138.field2190[var27] = class224.field3602.method487(false, "l" + var36 + "_" + var37);
                                class140.field2226[var27] = class224.field3602.method487(false, "um" + var36 + "_" + var37);
                                class95.field1570[var27] = class224.field3602.method487(false, "ul" + var36 + "_" + var37);
                                var27++;
                            }
                        }
                    }
                }
            }
            class260.method1841(var23, var26, false, var24, var25, 103, var22);
        } else {
            int var2 = class267.field4132.method724(-1);
            int var3 = class267.field4132.method766(true);
            int var4 = class267.field4132.method724(-1);
            int var5 = (class45.field779 - class267.field4132.field1667) / 16;
            class65.field1067 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var7 = 0; var7 < 4; var7++) {
                    class65.field1067[var6][var7] = class267.field4132.method767(-10453);
                }
            }
            int var8 = class267.field4132.method731(false);
            int var9 = class267.field4132.method759(4087);
            class138.field2190 = new int[var5];
            class329.field5094 = new int[var5];
            class102.field1728 = new int[var5];
            class307.field4845 = (byte[][]) null;
            class140.field2226 = new int[var5];
            class2.field2 = new byte[var5][];
            class118.field1901 = null;
            class30.field508 = new byte[var5][];
            class95.field1570 = new int[var5];
            class151.field2425 = new byte[var5][];
            class104.field1756 = new byte[var5][];
            int var10 = 0;
            boolean var11 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var4 / 8 == 48) {
                var11 = true;
            }
            if ((var2 / 8) == 48 && (var4 / 8) == 148) {
                var11 = true;
            }
            for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                for (int var13 = (var4 - 6) / 8; var13 <= (var4 + 6) / 8; var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var11 && var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || !(var12 != 49 || var13 != 47)) {
                        class102.field1728[var10] = var14;
                        class329.field5094[var10] = -1;
                        class138.field2190[var10] = -1;
                        class140.field2226[var10] = -1;
                        class95.field1570[var10] = -1;
                    } else {
                        class102.field1728[var10] = var14;
                        class329.field5094[var10] = class224.field3602.method487(false, "m" + var12 + "_" + var13);
                        class138.field2190[var10] = class224.field3602.method487(false, "l" + var12 + "_" + var13);
                        class140.field2226[var10] = class224.field3602.method487(false, "um" + var12 + "_" + var13);
                        class95.field1570[var10] = class224.field3602.method487(false, "ul" + var12 + "_" + var13);
                    }
                    var10++;
                }
            }
            class260.method1841(var2, var8, false, var3, var9, 122, var4);
        }
        if (arg0 != 0) {
            field3003 = (String) null;
        }
    }
}
