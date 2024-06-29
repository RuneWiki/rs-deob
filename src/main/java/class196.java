import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class196 {

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "[S")
    public static short[] field3333 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Leg;")
    public static class37 field3337 = class174.method1167("cookiehost", 92);

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field3335 = 0;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Leg;")
    public static class37 field3336 = class174.method1167("p12_full", 114);

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Leg;")
    public static class37 field3338 = class174.method1167("Hierhin gehen", -73);

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Leg;")
    public static class37 field3342 = class174.method1167(" zuerst von Ihrer Freunde)2Liste(Q", 102);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "Lpa;")
    public static class140 field3340;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIBI)V")
    public static final void method1360(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3343++;
        int var5 = arg2;
        int var6 = 0;
        if (arg3 != -41) {
            return;
        }
        int var7 = -arg2;
        int var8 = class139.method975(class178.field2972, true, arg0 + arg2, class217.field3741);
        int var9 = class139.method975(class178.field2972, true, arg0 - arg2, class217.field3741);
        class145.method1010(var8, var9, arg3 ^ 0x61D5, arg4, class210.field3617[arg1]);
        int var10 = -1;
        while (var6 < var5) {
            var10 += 2;
            var7 += var10;
            if (var7 > 0) {
                var5--;
                var7 -= var5 << 1;
                int var11 = arg1 - var5;
                int var12 = arg1 + var5;
                if (var12 >= class286.field5050 && class96.field1507 >= var11) {
                    int var13 = class139.method975(class178.field2972, true, arg0 + var6, class217.field3741);
                    int var14 = class139.method975(class178.field2972, true, arg0 - var6, class217.field3741);
                    if (var12 <= class96.field1507) {
                        class145.method1010(var13, var14, -25086, arg4, class210.field3617[var12]);
                    }
                    if (var11 >= class286.field5050) {
                        class145.method1010(var13, var14, -25086, arg4, class210.field3617[var11]);
                    }
                }
            }
            var6++;
            int var15 = arg1 - var6;
            int var16 = arg1 + var6;
            if (class286.field5050 <= var16 && class96.field1507 >= var15) {
                int var17 = class139.method975(class178.field2972, true, arg0 + var5, class217.field3741);
                int var18 = class139.method975(class178.field2972, true, arg0 - var5, class217.field3741);
                if (var16 <= class96.field1507) {
                    class145.method1010(var17, var18, -25086, arg4, class210.field3617[var16]);
                }
                if (var15 >= class286.field5050) {
                    class145.method1010(var17, var18, -25086, arg4, class210.field3617[var15]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II[Laf;ZII[BBIII)V")
    public static final void method1361(int arg0, int arg1, class165[] arg2, boolean arg3, int arg4, int arg5, byte[] arg6, byte arg7, int arg8, int arg9, int arg10) {
        field3339++;
        byte var11;
        if (arg3) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg3) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if (arg1 + var12 > 0 && arg1 + var12 < 103 && arg5 + var13 > 0 && (arg5 + var13) < 103) {
                        arg2[arg10].field2738[arg1 + var12][arg5 + var13] = class96.method626(arg2[arg10].field2738[arg1 + var12][arg5 + var13], -16777217);
                    }
                }
            }
        }
        class187 var14 = new class187(arg6);
        if (arg7 < 72) {
            method1365(-90, -124, 68, (byte[]) null);
        }
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var35 = 0; var35 < 64; var35++) {
                for (int var36 = 0; var36 < 64; var36++) {
                    if (arg8 == var15 && arg0 <= var35 && (arg0 + 8) > var35 && arg4 <= var36 && arg4 + 8 > var36) {
                        class154.method1053(class228.method1586(var36 & 0x7, arg9, var35 & 0x7, (byte) -19) + arg1, arg3, 0, (byte) 48, 0, var14, arg10, arg9, class288.method1931((byte) -95, arg9, var35 & 0x7, var36 & 0x7) + arg5);
                    } else {
                        class154.method1053(-1, arg3, 0, (byte) 48, 0, var14, 0, 0, -1);
                    }
                }
            }
        }
        boolean var16 = false;
        while (var14.field3169 < var14.field3175.length) {
            int var17 = var14.method1268(255);
            if (var17 != 129) {
                var14.field3169--;
                break;
            }
            for (int var22 = 0; var22 < 4; var22++) {
                byte var23 = var14.method1269(255);
                if (var23 == 0) {
                    if (arg8 >= var22) {
                        int var31 = arg1;
                        if (arg1 < 0) {
                            var31 = 0;
                        } else if (arg1 >= 104) {
                            var31 = 104;
                        }
                        int var32 = arg1 + 7;
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 >= 104) {
                            var32 = 104;
                        }
                        int var33 = arg5;
                        int var34 = arg5 + 7;
                        if (arg5 < 0) {
                            var33 = 0;
                        } else if (arg5 >= 104) {
                            var33 = 104;
                        }
                        if (var34 < 0) {
                            var34 = 0;
                        } else if (var34 >= 104) {
                            var34 = 104;
                        }
                        while (var31 < var32) {
                            while (var33 < var34) {
                                class19.field257[arg10][var31][var33] = 0;
                                var33++;
                            }
                            var31++;
                        }
                    }
                } else if (var23 == 1) {
                    for (int var24 = 0; var24 < 64; var24 += 4) {
                        for (int var25 = 0; var25 < 64; var25 += 4) {
                            byte var26 = var14.method1269(255);
                            if (var22 <= arg8) {
                                int var27 = var24;
                                while ((var24 + 4) > var27) {
                                    int var28 = var25;
                                    while (var28 < var25 + 4) {
                                        if (arg0 <= var27 && arg0 + 8 > var27 && var28 >= arg4 && (arg4 + 8) > arg4) {
                                            int var29 = arg1 + class228.method1586(var28 & 0x7, arg9, var27 & 0x7, (byte) -19);
                                            int var30 = class288.method1931((byte) -95, arg9, var27 & 0x7, var28 & 0x7) + arg5;
                                            if (var29 >= 0 && var29 < 104 && var30 >= 0 && var30 < 104) {
                                                class19.field257[arg10][var29][var30] = var26;
                                            }
                                        }
                                        var25++;
                                    }
                                    var24++;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var16) {
            return;
        }
        int var18 = arg1 + 7;
        int var19 = arg5 + 7;
        for (int var20 = arg1; var20 < var18; var20++) {
            for (int var21 = arg5; var21 < var19; var21++) {
                class19.field257[arg10][var20][var21] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIBLnj;II)V")
    public static final void method1362(int arg0, int arg1, byte arg2, class89 arg3, int arg4, int arg5) {
        field3334++;
        if (arg3.field1417 == -1 && arg3.field1416 == null) {
            return;
        }
        int var6 = 0;
        if (arg5 > arg3.field1414) {
            var6 += arg5 - arg3.field1414;
        } else if (arg3.field1402 > arg5) {
            var6 += arg3.field1402 - arg5;
        }
        if (arg4 > arg3.field1408) {
            var6 += arg4 - arg3.field1408;
        } else if (arg3.field1403 > arg4) {
            var6 += arg3.field1403 - arg4;
        }
        if (arg3.field1412 == 0 || arg3.field1412 < (var6 - 64) || class151.field2544 == 0 || arg3.field1411 != arg1) {
            if (arg3.field1410 != null) {
                class127.field2127.method1514(arg3.field1410);
                arg3.field1410 = null;
            }
            if (arg3.field1421 != null) {
                class127.field2127.method1514(arg3.field1421);
                arg3.field1421 = null;
            }
            return;
        }
        var6 -= 64;
        if (arg2 != 104) {
            field3336 = null;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg3.field1412 - var6) * class151.field2544 / arg3.field1412;
        if (arg3.field1410 != null) {
            arg3.field1410.method370(var7);
        } else if (arg3.field1417 >= 0) {
            class103 var8 = class103.method693(class243.field4366, arg3.field1417, 0);
            if (var8 != null) {
                class142 var9 = var8.method692().method1000(class152.field2557);
                class57 var10 = class57.method402(var9, 100, var7);
                var10.method406(-1);
                class127.field2127.method1512(var10);
                arg3.field1410 = var10;
            }
        }
        if (arg3.field1421 != null) {
            arg3.field1421.method370(var7);
            if (!arg3.field1421.method445(-1)) {
                arg3.field1421 = null;
            }
        } else if (arg3.field1416 != null && (arg3.field1420 -= arg0) <= 0) {
            int var11 = (int) (Math.random() * (double) arg3.field1416.length);
            class103 var12 = class103.method693(class243.field4366, arg3.field1416[var11], 0);
            if (var12 != null) {
                class142 var13 = var12.method692().method1000(class152.field2557);
                class57 var14 = class57.method402(var13, 100, var7);
                var14.method406(0);
                class127.field2127.method1512(var14);
                arg3.field1420 = arg3.field1400 + (int) ((double) (arg3.field1404 - arg3.field1400) * Math.random());
                arg3.field1421 = var14;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([IIIIII)V")
    public static final void method1363(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class111 var6 = class286.field5048[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class228 var7 = var6.field1862;
        if (var7 != null) {
            int var8 = var7.field3923;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class164 var10 = var6.field1865;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2708;
        int var12 = var10.field2706;
        int var13 = var10.field2719;
        int var14 = var10.field2714;
        int[] var15 = class80.field1242[var11];
        int[] var16 = class234.field4034[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method1364(byte arg0) {
        field3336 = null;
        field3340 = null;
        field3342 = null;
        field3337 = null;
        field3333 = null;
        if (arg0 == -118) {
            field3338 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III[B)I")
    public static final int method1365(int arg0, int arg1, int arg2, byte[] arg3) {
        field3344++;
        int var4 = -1;
        int var5 = -91 % ((arg1 + 41) / 38);
        for (int var6 = arg0; var6 < arg2; var6++) {
            var4 = class99.field1540[(arg3[var6] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static final void method1366(int arg0) {
        field3341++;
        int var1 = 89 / ((arg0 + 58) / 52);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
    public static final void method1367(int arg0, int arg1) {
        field3332++;
        class274 var2 = class166.method1116(7, arg1, true);
        if (arg0 != -105) {
            method1362(84, 10, (byte) -55, (class89) null, 110, -109);
        }
        var2.method1840(10000);
    }
}
