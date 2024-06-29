import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class204 {

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "[I")
    public static int[] field2824 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "Lgn;")
    public static class475 field2828;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IILhn;Lcu;ZILso;I)V")
    public static final void method1256(int arg0, int arg1, class486 arg2, class139 arg3, boolean arg4, int arg5, class313 arg6, int arg7) {
        field2823++;
        if (!arg4) {
            method1260((byte) 14);
        }
        class173 var8 = new class173();
        var8.field2364 = arg7 << 7;
        var8.field2353 = arg0;
        var8.field2362 = arg5 << 7;
        if (arg2 != null) {
            var8.field2358 = arg2;
            int var9 = arg2.field7036;
            int var10 = arg2.field7096;
            if (arg1 == 1 || arg1 == 3) {
                var9 = arg2.field7096;
                var10 = arg2.field7036;
            }
            var8.field2356 = arg2.field7062;
            var8.field2375 = arg2.field7061 << 7;
            var8.field2370 = arg2.field7092;
            var8.field2372 = arg2.field7073;
            var8.field2368 = arg5 + var9 << 7;
            var8.field2357 = arg7 + var10 << 7;
            var8.field2355 = arg2.field7110;
            var8.field2365 = arg2.field7033;
            if (arg2.field7043 != null) {
                var8.field2377 = true;
                var8.method1090(-1);
            }
            if (var8.field2372 != null) {
                var8.field2374 = (int) ((double) (var8.field2370 - var8.field2355) * Math.random()) + var8.field2355;
            }
            class173.field2360.method2086((byte) -111, var8);
        } else if (arg3 != null) {
            var8.field2371 = arg3;
            class272 var11 = arg3.field1825;
            if (var11.field3797 != null) {
                var8.field2377 = true;
                var11 = var11.method1656(class453.field6591, -47);
            }
            if (var11 != null) {
                var8.field2368 = arg5 + var11.field3806 << 7;
                var8.field2357 = var11.field3806 + arg7 << 7;
                var8.field2356 = class242.method1501(arg3, (byte) -67);
                var8.field2375 = var11.field3857 << 7;
                var8.field2365 = var11.field3841;
            }
            class443.field6469.method2086((byte) -127, var8);
        } else if (arg6 != null) {
            var8.field2354 = arg6;
            var8.field2368 = arg5 + arg6.method1773(-46) << 7;
            var8.field2357 = arg6.method1773(-27) + arg7 << 7;
            var8.field2356 = class52.method387(arg6, 18);
            var8.field2365 = arg6.field4597;
            var8.field2375 = arg6.field4585 << 7;
            class99.field1347.method2317(-1, (long) arg6.field4262, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIIIZLva;IIILeq;Ljl;II)Lva;")
    public static final class327 method1257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, class327 arg7, int arg8, int arg9, int arg10, class134 arg11, class168 arg12, int arg13, int arg14) {
        field2825++;
        if (arg7 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg12 != null) {
            int var16 = var15 | arg12.method1062(-1, arg8, -1, false);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg10 << 48) + ((long) arg9 << 32) + (long) (arg14 - (-(arg4 << 16) - (arg2 << 24)));
        class5 var19 = class381.field5675;
        class327 var20;
        synchronized (class381.field5675) {
            var20 = (class327) class381.field5675.method40(0, var17);
        }
        if (var20 == null || arg11.method819(var20.method200(), var15) != 0) {
            if (var20 != null) {
                var15 = arg11.method828(var15, var20.method200());
            }
            byte var21;
            if (arg14 == 1) {
                var21 = 9;
            } else if (arg14 == 2) {
                var21 = 12;
            } else if (arg14 == 3) {
                var21 = 15;
            } else if (arg14 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class499 var24 = new class499((var21 * var22) + 1, var21 * var22 * 2 - var21, 0);
            int var25 = var24.method2996(0, 126, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class323.field4731[var31] * var28 >> 15;
                    int var33 = class323.field4733[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method2996(var33, 126, var32, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg2 * var35 + arg4 * var36 >> 8);
                short var38 = (short) (((arg9 & 0xFC00) * var36 + (arg10 & 0xFC00) * var35 & 0xFC0000) + ((arg9 & 0x7F) * var36 + (arg10 & 0x7F) * var35 & 0x7F00) + ((arg9 & 0x380) * var36 + (arg10 & 0x380) * var35 & 0x38000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method2995(var38, var26[0][var39], (short) -1, var37, var25, (byte) -86, (byte) 1, (byte) -1, var26[0][(var39 + 1) % var21]);
                    } else {
                        var24.method2995(var38, var26[var34][(var39 + 1) % var21], (short) -1, var37, var26[var34 - 1][var39], (byte) -86, (byte) 1, (byte) -1, var26[var34 - 1][(var39 + 1) % var21]);
                        var24.method2995(var38, var26[var34][var39], (short) -1, var37, var26[var34 - 1][var39], (byte) -86, (byte) 1, (byte) -1, var26[var34][(var39 + 1) % var21]);
                    }
                }
            }
            var20 = arg11.method737(var24, var15, class188.field2680, 64, 768);
            class5 var40 = class381.field5675;
            synchronized (class381.field5675) {
                class381.field5675.method36(arg3 ^ 0x6387, var20, var17);
            }
        }
        int var41 = (arg14 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg6) {
            if (arg13 > 9216 && arg13 < 15360) {
                var44 = var41 + 128;
            }
            if (arg13 > 1024 && arg13 < 7168) {
                var42 -= 128;
            }
            if (arg13 > 5120 && arg13 < 11264) {
                var45 = var41 + 128;
            }
            if (arg13 > 13312 || arg13 < 3072) {
                var43 -= 128;
            }
        }
        int var46 = arg7.method188();
        int var47 = arg7.method208();
        if (arg3 != -12889) {
            method1260((byte) 55);
        }
        int var48 = arg7.method186();
        if (var44 < var47) {
            var47 = var44;
        }
        if (var48 < var43) {
            var48 = var43;
        }
        if (var42 > var46) {
            var46 = var42;
        }
        int var49 = arg7.method168();
        if (var49 > var45) {
            var49 = var45;
        }
        class103 var50 = null;
        if (arg12 != null) {
            int var51 = arg12.field2219[arg8];
            var50 = class286.field4083.method2603(-1281, var51 >> 16);
            arg8 = var51 & 0xFFFF;
        }
        class327 var52;
        if (var50 == null) {
            var52 = var20.method194((byte) 3, var15, true);
            var52.method176(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method207(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method194((byte) 3, var15, true);
            var52.method176(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method207(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method1967(arg8, 122, var50);
        }
        if (arg0 != 0) {
            var52.method189(arg0);
        }
        if (arg1 != 0) {
            var52.method166(arg1);
        }
        if (arg5 != 0) {
            var52.method207(0, arg5, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIZLjl;II)V")
    public static final void method1258(int arg0, int arg1, int arg2, boolean arg3, class168 arg4, int arg5, int arg6) {
        field2826++;
        if (class124.field1611 >= 50 || arg4 == null || arg4.field2228 == null || arg1 >= arg4.field2228.length || arg4.field2228[arg1] == null) {
            return;
        }
        if (arg0 != -1) {
            field2828 = null;
        }
        int var7 = arg4.field2228[arg1][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xE0) >> 5;
        int var10 = var7 & 0x1F;
        if (arg4.field2228[arg1].length > 1) {
            int var11 = (int) ((double) arg4.field2228[arg1].length * Math.random());
            if (var11 > 0) {
                var8 = arg4.field2228[arg1][var11];
            }
        }
        if (var10 == 0) {
            if (arg3) {
                class508.method3061(255, var9, -66, 0, var8);
            }
        } else if (class118.field1533.field6903 != 0) {
            int var12 = arg2 - 64 >> 7;
            int var13 = arg5 - 64 >> 7;
            class415.field6150[class124.field1611++] = new class147((byte) 1, var8, var9, 0, 255, (arg6 << 24) + (var12 << 16) + (var13 << 8) + var10);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZZ)V")
    public static final void method1259(int arg0, boolean arg1, boolean arg2) {
        if (arg0 == 0) {
            class481.field6937 = class134.method777(class498.field7590, class118.field1533.field6905 * 2, class86.field1182, 118, class147.field1916, arg0);
        } else {
            if (arg2) {
                class481.field6937 = class134.method777(class498.field7590, 0, class86.field1182, 36, class147.field1916, 0);
                class481.field6937.method811(0);
                class507 var3 = class442.method2588((byte) 30, 0, class43.field648, class1.field1);
                class348 var4 = class481.field6937.method802(var3, class328.method1976(class445.field6482, class43.field648, 0), true);
                class475.method2783(var4, class489.field7488.method1220(2969, class81.field1122), true, 6);
                class481.field6937.method743();
                class270.method1650(-24453);
                class481.field6937.method835(1);
            }
            try {
                class481.field6937 = class134.method777(class498.field7590, class118.field1533.field6905 * 2, class86.field1182, 126, class147.field1916, arg0);
                if (class481.field6937.method797()) {
                    class297 var5 = class481.field6937.method735(78643200);
                    class481.field6937.method794(var5);
                }
            } catch (Throwable var6) {
                arg0 = 0;
                class481.field6937 = class134.method777(class498.field7590, 0, class86.field1182, 27, class147.field1916, 0);
            }
        }
        field2827++;
        class293.field4174 = arg0;
        class246.method1534(117);
        if (!class481.field6937.method795()) {
            class40.field620 = 1;
        }
        class481.field6937.method786(class40.field620);
        class481.field6937.method813(0);
        class481.field6937.method798(8);
        class125.field1616 = class481.field6937.method823();
        class295.field4314 = class481.field6937.method823();
        class54.method410((byte) 80);
        class481.field6937.method733(!class118.field1533.field6875);
        if (class481.field6937.method815()) {
            class222.method1375(class118.field1533.field6898, (byte) -86);
        }
        class258.method1609(class203.field2813 >> 3, class481.field6937, 3, class362.field5442 >> 3);
        class428.method2551(-118);
        class17.field241 = arg1;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
    public static void method1260(byte arg0) {
        field2828 = null;
        field2824 = null;
        if (arg0 >= -40) {
            method1260((byte) 62);
        }
    }

    static {
        new class194("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field2828 = new class475(77, -1);
    }
}
