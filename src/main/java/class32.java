import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 {

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    private int field829 = 0;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "[Lad;")
    private class5[] field808;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    private int field816;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field806 = 0;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Lhe;")
    private static class54 field817 = class6.method58("Loading textures )2 ", false);

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lhe;")
    public static class54 field812 = field817;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Lhe;")
    public static class54 field825 = class6.method58("<col=00ff80>", false);

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "Lhe;")
    public static class54 field831 = class6.method58("rect_debug=", false);

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "Lhe;")
    private static class54 field830 = class6.method58("Walk here", false);

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Lhe;")
    public static class54 field814 = field830;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "[Z")
    public static boolean[] field832 = new boolean[100];

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "J")
    private long field819;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Lef;")
    public static class35 field809;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "Lad;")
    private class5 field823;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "Lad;")
    private class5 field833;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "[S")
    public static short[] field828;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field826++;
        int var7 = 2048 - arg0 & 0x7FF;
        int var8 = 2048 - arg5 & 0x7FF;
        if (arg6 <= 31) {
            field812 = null;
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = arg3;
        if (var7 != 0) {
            int var12 = class152.field3416[var7];
            int var13 = class152.field3420[var7];
            int var14 = var9 * var13 - arg3 * var12 >> 16;
            var11 = var9 * var12 + arg3 * var13 >> 16;
            var9 = var14;
        }
        if (var8 != 0) {
            int var15 = class152.field3416[var8];
            int var16 = class152.field3420[var8];
            int var17 = var10 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var10 * var15 >> 16;
            var10 = var17;
        }
        class65.field1561 = arg4 - var11;
        class11.field315 = arg1 - var10;
        class95.field2418 = arg0;
        class93.field2277 = arg2 - var9;
        class39.field1025 = arg5;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI)V")
    public static final void method240(int arg0, byte arg1, int arg2) {
        if (arg1 >= -69) {
            field830 = null;
        }
        long var3 = (long) ((arg2 << 16) + arg0);
        field810++;
        class84 var5 = (class84) class115.field2737.method246((byte) 117, var3);
        if (var5 != null) {
            class4.field107.method3(var5, 1);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lad;JZ)V")
    public final void method241(class5 arg0, long arg1, boolean arg2) {
        field818++;
        if (arg0.field158 != null) {
            arg0.method48(-315);
        }
        class5 var5 = this.field808[(int) (arg1 & (long) (this.field816 - 1))];
        if (arg2) {
            field806 = -60;
        }
        arg0.field153 = var5;
        arg0.field158 = var5.field158;
        arg0.field154 = arg1;
        arg0.field158.field153 = arg0;
        arg0.field153.field158 = arg0;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILoc;)V")
    public static final void method242(int arg0, class100 arg1) {
        field834++;
        Object[] var2 = arg1.field2522;
        int var3 = (Integer) var2[0];
        class133 var4 = class131.method993(39, var3);
        if (var4 == null) {
            return;
        }
        class63.field1522 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field3009;
        byte var9 = -1;
        int[] var10 = var4.field3020;
        try {
            class99.field2521 = new class54[var4.field3001];
            class147.field3323 = new int[var4.field3012];
            int var11 = 0;
            int var12 = 0;
            for (int var13 = arg0; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var15 = (Integer) var2[var13];
                    if (var15 == -2147483647) {
                        var15 = arg1.field2523;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg1.field2535;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg1.field2537 == null ? -1 : arg1.field2537.field2273;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg1.field2524;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg1.field2537 == null ? -1 : arg1.field2537.field2264;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg1.field2525 == null ? -1 : arg1.field2525.field2273;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg1.field2525 == null ? -1 : arg1.field2525.field2264;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg1.field2528;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg1.field2536;
                    }
                    class147.field3323[var11++] = var15;
                } else if (var2[var13] instanceof class54) {
                    class54 var14 = (class54) var2[var13];
                    if (var14.method381(1, class84.field2102)) {
                        var14 = arg1.field2531;
                    }
                    class99.field2521[var12++] = var14;
                }
            }
            int var16 = 0;
            label1932: while (true) {
                var16++;
                if (var16 > 200000) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var269 = var10[var7];
                if (var269 < 100) {
                    if (var269 == 0) {
                        class49.field1181[var5++] = var8[var7];
                        continue;
                    }
                    if (var269 == 1) {
                        int var17 = var8[var7];
                        class49.field1181[var5++] = class63.field1540[var17];
                        continue;
                    }
                    if (var269 == 2) {
                        int var18 = var8[var7];
                        var5--;
                        class63.field1540[var18] = class49.field1181[var5];
                        continue;
                    }
                    if (var269 == 3) {
                        class58.field1458[var6++] = var4.field3016[var7];
                        continue;
                    }
                    if (var269 == 6) {
                        var7 += var8[var7];
                        continue;
                    }
                    if (var269 == 7) {
                        var5 -= 2;
                        if (class49.field1181[var5 + 1] != class49.field1181[var5]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var269 == 8) {
                        var5 -= 2;
                        if (class49.field1181[var5 + 1] == class49.field1181[var5]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var269 == 9) {
                        var5 -= 2;
                        if (class49.field1181[var5 + 1] > class49.field1181[var5]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var269 == 10) {
                        var5 -= 2;
                        if (class49.field1181[var5 + 1] < class49.field1181[var5]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var269 == 21) {
                        if (class63.field1522 == 0) {
                            return;
                        }
                        class118 var19 = class79.field1940[--class63.field1522];
                        class99.field2521 = var19.field2756;
                        class147.field3323 = var19.field2758;
                        var4 = var19.field2761;
                        var8 = var4.field3009;
                        var10 = var4.field3020;
                        var7 = var19.field2754;
                        continue;
                    }
                    if (var269 == 25) {
                        int var20 = var8[var7];
                        class49.field1181[var5++] = class111.method839(-1, var20);
                        continue;
                    }
                    if (var269 == 27) {
                        int var21 = var8[var7];
                        var5--;
                        class156.method1200(class49.field1181[var5], var21, arg0 - 1);
                        continue;
                    }
                    if (var269 == 31) {
                        var5 -= 2;
                        if (class49.field1181[var5 + 1] >= class49.field1181[var5]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var269 == 32) {
                        var5 -= 2;
                        if (class49.field1181[var5] >= class49.field1181[var5 + 1]) {
                            var7 += var8[var7];
                        }
                        continue;
                    }
                    if (var269 == 33) {
                        class49.field1181[var5++] = class147.field3323[var8[var7]];
                        continue;
                    }
                    int var10001;
                    if (var269 == 34) {
                        var10001 = var8[var7];
                        var5--;
                        class147.field3323[var10001] = class49.field1181[var5];
                        continue;
                    }
                    if (var269 == 35) {
                        class58.field1458[var6++] = class99.field2521[var8[var7]];
                        continue;
                    }
                    if (var269 == 36) {
                        var10001 = var8[var7];
                        var6--;
                        class99.field2521[var10001] = class58.field1458[var6];
                        continue;
                    }
                    if (var269 == 37) {
                        int var22 = var8[var7];
                        var6 -= var22;
                        class54 var23 = class129.method973(arg0 ^ 0x4F, var22, var6, class58.field1458);
                        class58.field1458[var6++] = var23;
                        continue;
                    }
                    if (var269 == 38) {
                        var5--;
                        continue;
                    }
                    if (var269 == 39) {
                        var6--;
                        continue;
                    }
                    if (var269 == 40) {
                        int var24 = var8[var7];
                        class133 var25 = class131.method993(39, var24);
                        int[] var26 = new int[var25.field3012];
                        class54[] var27 = new class54[var25.field3001];
                        for (int var28 = 0; var28 < var25.field3011; var28++) {
                            var26[var28] = class49.field1181[var28 + var5 - var25.field3011];
                        }
                        for (int var29 = 0; var29 < var25.field3006; var29++) {
                            var27[var29] = class58.field1458[var6 + var29 - var25.field3006];
                        }
                        var5 -= var25.field3011;
                        var6 -= var25.field3006;
                        class118 var30 = new class118();
                        var30.field2758 = class147.field3323;
                        var30.field2756 = class99.field2521;
                        var30.field2754 = var7;
                        var7 = -1;
                        var30.field2761 = var4;
                        var4 = var25;
                        class79.field1940[class63.field1522++] = var30;
                        var8 = var25.field3009;
                        class147.field3323 = var26;
                        class99.field2521 = var27;
                        var10 = var25.field3020;
                        continue;
                    }
                    if (var269 == 42) {
                        class49.field1181[var5++] = class5.field164[var8[var7]];
                        continue;
                    }
                    if (var269 == 43) {
                        var10001 = var8[var7];
                        var5--;
                        class5.field164[var10001] = class49.field1181[var5];
                        continue;
                    }
                    if (var269 == 44) {
                        int var31 = var8[var7] >> 16;
                        int var32 = var8[var7] & 0xFFFF;
                        var5--;
                        int var33 = class49.field1181[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            class87.field2153[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var33 <= var35) {
                                    continue label1932;
                                }
                                class64.field1550[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var269 == 45) {
                        int var36 = var8[var7];
                        var5--;
                        int var37 = class49.field1181[var5];
                        if (var37 >= 0 && var37 < class87.field2153[var36]) {
                            class49.field1181[var5++] = class64.field1550[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var269 == 46) {
                        int var38 = var8[var7];
                        var5 -= 2;
                        int var39 = class49.field1181[var5];
                        if (var39 >= 0 && class87.field2153[var38] > var39) {
                            class64.field1550[var38][var39] = class49.field1181[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var269 == 47) {
                        class54 var40 = class58.field1456[var8[var7]];
                        if (var40 == null) {
                            var40 = class155.field3510;
                        }
                        class58.field1458[var6++] = var40;
                        continue;
                    }
                    if (var269 == 48) {
                        var10001 = var8[var7];
                        var6--;
                        class58.field1456[var10001] = class58.field1458[var6];
                        continue;
                    }
                }
                boolean var41;
                if (var8[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var269 < 1000) {
                    if (var269 == 100) {
                        var5 -= 3;
                        int var42 = class49.field1181[var5];
                        int var43 = class49.field1181[var5 + 1];
                        int var44 = class49.field1181[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class93 var45 = class121.method938(true, var42);
                        if (var45.field2316 == null) {
                            var45.field2316 = new class93[var44 + 1];
                        }
                        if (var45.field2316.length <= var44) {
                            class93[] var46 = new class93[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2316.length; var47++) {
                                var46[var47] = var45.field2316[var47];
                            }
                            var45.field2316 = var46;
                        }
                        if (var44 > 0 && var45.field2316[var44 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var44 - 1));
                        }
                        class93 var48 = new class93();
                        var48.field2359 = var43;
                        var48.field2284 = var48.field2273 = var45.field2273;
                        var48.field2264 = var44;
                        var48.field2279 = true;
                        var45.field2316[var44] = var48;
                        if (var41) {
                            class15.field465 = var48;
                        } else {
                            class40.field1043 = var48;
                        }
                        class134.method1005(var45, arg0 - 1);
                        continue;
                    }
                    if (var269 == 101) {
                        class93 var49 = var41 ? class15.field465 : class40.field1043;
                        class93 var50 = class121.method938(true, var49.field2273);
                        var50.field2316[var49.field2264] = null;
                        class134.method1005(var50, 0);
                        continue;
                    }
                    if (var269 == 102) {
                        var5--;
                        class93 var51 = class121.method938(true, class49.field1181[var5]);
                        var51.field2316 = null;
                        class134.method1005(var51, 0);
                        continue;
                    }
                    if (var269 == 200) {
                        var5 -= 2;
                        int var52 = class49.field1181[var5];
                        int var53 = class49.field1181[var5 + 1];
                        class93 var54 = class105.method811(var52, arg0 - 2, var53);
                        if (var54 != null && var53 != -1) {
                            class49.field1181[var5++] = 1;
                            if (var41) {
                                class15.field465 = var54;
                            } else {
                                class40.field1043 = var54;
                            }
                            continue;
                        }
                        class49.field1181[var5++] = 0;
                        continue;
                    }
                } else if (var269 >= 1000 && var269 < 1100 || !(var269 < 2000 || var269 >= 2100)) {
                    class93 var262;
                    if (var269 >= 2000) {
                        var5--;
                        var262 = class121.method938(true, class49.field1181[var5]);
                        var269 -= 1000;
                    } else {
                        var262 = var41 ? class15.field465 : class40.field1043;
                    }
                    if (var269 == 1000) {
                        var5 -= 2;
                        var262.field2282 = class49.field1181[var5];
                        var262.field2313 = class49.field1181[var5 + 1];
                        class134.method1005(var262, arg0 ^ 0x1);
                        continue;
                    }
                    if (var269 == 1001) {
                        var5 -= 2;
                        var262.field2257 = class49.field1181[var5];
                        var262.field2286 = class49.field1181[var5 + 1];
                        class134.method1005(var262, 0);
                        continue;
                    }
                    if (var269 == 1003) {
                        var5--;
                        boolean var263 = class49.field1181[var5] == 1;
                        if (var263 != var262.field2326) {
                            var262.field2326 = var263;
                            class134.method1005(var262, 0);
                        }
                        continue;
                    }
                } else if (var269 >= 1100 && var269 < 1200 || !(var269 < 2100 || var269 >= 2200)) {
                    class93 var55;
                    if (var269 < 2000) {
                        var55 = var41 ? class15.field465 : class40.field1043;
                    } else {
                        var269 -= 1000;
                        var5--;
                        var55 = class121.method938(true, class49.field1181[var5]);
                    }
                    if (var269 == 1100) {
                        var5 -= 2;
                        var55.field2332 = class49.field1181[var5];
                        if (var55.field2309 - var55.field2257 < var55.field2332) {
                            var55.field2332 = var55.field2309 - var55.field2257;
                        }
                        if (var55.field2332 < 0) {
                            var55.field2332 = 0;
                        }
                        var55.field2339 = class49.field1181[var5 + 1];
                        if (var55.field2307 - var55.field2286 < var55.field2339) {
                            var55.field2339 = var55.field2307 - var55.field2286;
                        }
                        if (var55.field2339 < 0) {
                            var55.field2339 = 0;
                        }
                        class134.method1005(var55, arg0 ^ 0x1);
                        continue;
                    }
                    if (var269 == 1101) {
                        var5--;
                        var55.field2296 = class49.field1181[var5];
                        class134.method1005(var55, 0);
                        continue;
                    }
                    if (var269 == 1102) {
                        var5--;
                        var55.field2266 = class49.field1181[var5] == 1;
                        class134.method1005(var55, 0);
                        continue;
                    }
                    if (var269 == 1103) {
                        var5--;
                        var55.field2367 = class49.field1181[var5];
                        class134.method1005(var55, arg0 ^ 0x1);
                        continue;
                    }
                    if (var269 == 1104) {
                        var5--;
                        var55.field2300 = class49.field1181[var5];
                        class134.method1005(var55, 0);
                        continue;
                    }
                    if (var269 == 1105) {
                        var5--;
                        var55.field2248 = class49.field1181[var5];
                        class134.method1005(var55, 0);
                        continue;
                    }
                    if (var269 == 1106) {
                        var5--;
                        var55.field2319 = class49.field1181[var5];
                        class134.method1005(var55, arg0 ^ 0x1);
                        continue;
                    }
                    if (var269 == 1107) {
                        var5--;
                        var55.field2354 = class49.field1181[var5] == 1;
                        class134.method1005(var55, 0);
                        continue;
                    }
                    if (var269 == 1108) {
                        var55.field2238 = 1;
                        var5--;
                        var55.field2351 = class49.field1181[var5];
                        class134.method1005(var55, arg0 - 1);
                        continue;
                    }
                    if (var269 == 1109) {
                        var5 -= 6;
                        var55.field2325 = class49.field1181[var5];
                        var55.field2249 = class49.field1181[var5 + 1];
                        var55.field2314 = class49.field1181[var5 + 2];
                        var55.field2337 = class49.field1181[var5 + 3];
                        var55.field2252 = class49.field1181[var5 + 4];
                        var55.field2269 = class49.field1181[var5 + 5];
                        class134.method1005(var55, 0);
                        continue;
                    }
                    if (var269 == 1110) {
                        var5--;
                        int var56 = class49.field1181[var5];
                        if (var55.field2311 != var56) {
                            var55.field2311 = var56;
                            var55.field2254 = 0;
                            var55.field2342 = 0;
                            class134.method1005(var55, 0);
                        }
                        continue;
                    }
                    if (var269 == 1111) {
                        var5--;
                        var55.field2364 = class49.field1181[var5] == 1;
                        class134.method1005(var55, arg0 ^ 0x1);
                        continue;
                    }
                    if (var269 == 1112) {
                        var6--;
                        class54 var57 = class58.field1458[var6];
                        if (!var57.method381(1, var55.field2251)) {
                            var55.field2251 = var57;
                            class134.method1005(var55, 0);
                        }
                        continue;
                    }
                    if (var269 == 1113) {
                        var5--;
                        var55.field2271 = class49.field1181[var5];
                        class134.method1005(var55, 0);
                        continue;
                    }
                    if (var269 == 1114) {
                        var5 -= 3;
                        var55.field2315 = class49.field1181[var5];
                        var55.field2363 = class49.field1181[var5 + 1];
                        var55.field2262 = class49.field1181[var5 + 2];
                        class134.method1005(var55, 0);
                        continue;
                    }
                    if (var269 == 1115) {
                        var5--;
                        var55.field2260 = class49.field1181[var5] == 1;
                        class134.method1005(var55, 0);
                        continue;
                    }
                    if (var269 == 1116) {
                        var5--;
                        var55.field2302 = class49.field1181[var5];
                        class134.method1005(var55, arg0 - 1);
                        continue;
                    }
                    if (var269 == 1117) {
                        var5--;
                        var55.field2263 = class49.field1181[var5];
                        class134.method1005(var55, arg0 - 1);
                        continue;
                    }
                    if (var269 == 1118) {
                        var5--;
                        var55.field2288 = class49.field1181[var5] == 1;
                        class134.method1005(var55, arg0 - 1);
                        continue;
                    }
                    if (var269 == 1119) {
                        var5--;
                        var55.field2295 = class49.field1181[var5] == 1;
                        class134.method1005(var55, arg0 ^ 0x1);
                        continue;
                    }
                    if (var269 == 1120) {
                        var5 -= 2;
                        var55.field2309 = class49.field1181[var5];
                        var55.field2307 = class49.field1181[var5 + 1];
                        class134.method1005(var55, arg0 ^ 0x1);
                        continue;
                    }
                } else if (var269 >= 1200 && var269 < 1300 || var269 >= 2200 && var269 < 2300) {
                    class93 var58;
                    if (var269 < 2000) {
                        var58 = var41 ? class15.field465 : class40.field1043;
                    } else {
                        var269 -= 1000;
                        var5--;
                        var58 = class121.method938(true, class49.field1181[var5]);
                    }
                    class134.method1005(var58, 0);
                    if (var269 == 1200) {
                        var5 -= 2;
                        int var59 = class49.field1181[var5];
                        int var60 = class49.field1181[var5 + 1];
                        var58.field2327 = var59;
                        var58.field2244 = var60;
                        class67 var61 = class141.method1088(var59, (byte) -107);
                        var58.field2325 = var61.field1626;
                        var58.field2314 = var61.field1664;
                        var58.field2252 = var61.field1637;
                        var58.field2337 = var61.field1656;
                        var58.field2269 = var61.field1644;
                        var58.field2249 = var61.field1671;
                        if (var58.field2257 > 0) {
                            var58.field2269 = var58.field2269 * 32 / var58.field2257;
                        }
                        continue;
                    }
                    if (var269 == 1201) {
                        var58.field2238 = 2;
                        var5--;
                        var58.field2351 = class49.field1181[var5];
                        continue;
                    }
                    if (var269 == 1202) {
                        var58.field2238 = 3;
                        var58.field2351 = class108.field2639.field642.method533(-256);
                        continue;
                    }
                } else if ((var269 < 1300 || var269 >= 1400) && (var269 < 2300 || var269 >= 2400)) {
                    if (var269 >= 1400 && var269 < 1500 || var269 >= 2400 && var269 < 2500) {
                        class93 var66;
                        if (var269 >= 2000) {
                            var5--;
                            var66 = class121.method938(true, class49.field1181[var5]);
                            var269 -= 1000;
                        } else {
                            var66 = var41 ? class15.field465 : class40.field1043;
                        }
                        var6--;
                        class54 var67 = class58.field1458[var6];
                        int[] var68 = null;
                        if (var67.method404(-106) > 0 && var67.method413(21340, var67.method404(-117) - 1) == 89) {
                            var5--;
                            int var69 = class49.field1181[var5];
                            if (var69 > 0) {
                                var68 = new int[var69];
                                while (var69-- > 0) {
                                    var5--;
                                    var68[var69] = class49.field1181[var5];
                                }
                            }
                            var67 = var67.method408((byte) 16, 0, var67.method404(-127) - 1);
                        }
                        Object[] var70 = new Object[var67.method404(-114) + 1];
                        for (int var71 = var70.length - 1; var71 >= 1; var71--) {
                            if (var67.method413(arg0 ^ 0x535D, var71 - 1) == 115) {
                                var6--;
                                var70[var71] = class58.field1458[var6];
                            } else {
                                var5--;
                                var70[var71] = Integer.valueOf(class49.field1181[var5]);
                            }
                        }
                        var5--;
                        int var72 = class49.field1181[var5];
                        if (var72 == -1) {
                            var70 = null;
                        } else {
                            var70[0] = Integer.valueOf(var72);
                        }
                        if (var269 == 1403) {
                            var66.field2366 = var70;
                        }
                        if (var269 == 1411) {
                            var66.field2322 = var70;
                        }
                        if (var269 == 1400) {
                            var66.field2268 = var70;
                        }
                        if (var269 == 1412) {
                            var66.field2323 = var70;
                        }
                        var66.field2338 = true;
                        if (var269 == 1408) {
                            var66.field2301 = var70;
                        }
                        if (var269 == 1416) {
                            var66.field2259 = var70;
                        }
                        if (var269 == 1409) {
                            var66.field2246 = var70;
                        }
                        if (var269 == 1419) {
                            var66.field2231 = var70;
                        }
                        if (var269 == 1402) {
                            var66.field2353 = var70;
                        }
                        if (var269 == 1414) {
                            var66.field2335 = var68;
                            var66.field2256 = var70;
                        }
                        if (var269 == 1415) {
                            var66.field2331 = var68;
                            var66.field2289 = var70;
                        }
                        if (var269 == 1421) {
                            var66.field2356 = var70;
                        }
                        if (var269 == 1422) {
                            var66.field2305 = var70;
                        }
                        if (var269 == 1418) {
                            var66.field2281 = var70;
                        }
                        if (var269 == 1420) {
                            var66.field2352 = var70;
                        }
                        if (var269 == 1410) {
                            var66.field2265 = var70;
                        }
                        if (var269 == 1407) {
                            var66.field2362 = var68;
                            var66.field2360 = var70;
                        }
                        if (var269 == 1424) {
                            var66.field2345 = var70;
                        }
                        if (var269 == 1401) {
                            var66.field2321 = var70;
                        }
                        if (var269 == 1417) {
                            var66.field2270 = var70;
                        }
                        if (var269 == 1406) {
                            var66.field2253 = var70;
                        }
                        if (var269 == 1405) {
                            var66.field2236 = var70;
                        }
                        if (var269 == 1423) {
                            var66.field2234 = var70;
                        }
                        if (var269 == 1404) {
                            var66.field2283 = var70;
                        }
                        continue;
                    }
                    if (var269 < 1600) {
                        class93 var261 = var41 ? class15.field465 : class40.field1043;
                        if (var269 == 1500) {
                            class49.field1181[var5++] = var261.field2282;
                            continue;
                        }
                        if (var269 == 1501) {
                            class49.field1181[var5++] = var261.field2313;
                            continue;
                        }
                        if (var269 == 1502) {
                            class49.field1181[var5++] = var261.field2257;
                            continue;
                        }
                        if (var269 == 1503) {
                            class49.field1181[var5++] = var261.field2286;
                            continue;
                        }
                        if (var269 == 1504) {
                            class49.field1181[var5++] = var261.field2326 ? 1 : 0;
                            continue;
                        }
                        if (var269 == 1505) {
                            class49.field1181[var5++] = var261.field2284;
                            continue;
                        }
                    } else if (var269 < 1700) {
                        class93 var260 = var41 ? class15.field465 : class40.field1043;
                        if (var269 == 1600) {
                            class49.field1181[var5++] = var260.field2332;
                            continue;
                        }
                        if (var269 == 1601) {
                            class49.field1181[var5++] = var260.field2339;
                            continue;
                        }
                        if (var269 == 1602) {
                            class58.field1458[var6++] = var260.field2251;
                            continue;
                        }
                        if (var269 == 1603) {
                            class49.field1181[var5++] = var260.field2309;
                            continue;
                        }
                        if (var269 == 1604) {
                            class49.field1181[var5++] = var260.field2307;
                            continue;
                        }
                        if (var269 == 1605) {
                            class49.field1181[var5++] = var260.field2269;
                            continue;
                        }
                        if (var269 == 1606) {
                            class49.field1181[var5++] = var260.field2314;
                            continue;
                        }
                        if (var269 == 1607) {
                            class49.field1181[var5++] = var260.field2252;
                            continue;
                        }
                        if (var269 == 1608) {
                            class49.field1181[var5++] = var260.field2337;
                            continue;
                        }
                    } else if (var269 < 1800) {
                        class93 var259 = var41 ? class15.field465 : class40.field1043;
                        if (var269 == 1700) {
                            class49.field1181[var5++] = var259.field2327;
                            continue;
                        }
                        if (var269 == 1701) {
                            if (var259.field2327 == -1) {
                                class49.field1181[var5++] = 0;
                            } else {
                                class49.field1181[var5++] = var259.field2244;
                            }
                            continue;
                        }
                        if (var269 == 1702) {
                            class49.field1181[var5++] = var259.field2264;
                            continue;
                        }
                    } else if (var269 < 1900) {
                        class93 var73 = var41 ? class15.field465 : class40.field1043;
                        if (var269 == 1800) {
                            class49.field1181[var5++] = class135.method1009(14423, class105.method810(var73, arg0 - 22390));
                            continue;
                        }
                        if (var269 == 1801) {
                            var5--;
                            int var74 = class49.field1181[var5];
                            int var270 = var74 - 1;
                            if (var73.field2348 != null && var270 < var73.field2348.length && var73.field2348[var270] != null) {
                                class58.field1458[var6++] = var73.field2348[var270];
                                continue;
                            }
                            class58.field1458[var6++] = class3.field80;
                            continue;
                        }
                        if (var269 == 1802) {
                            if (var73.field2297 == null) {
                                class58.field1458[var6++] = class3.field80;
                            } else {
                                class58.field1458[var6++] = var73.field2297;
                            }
                            continue;
                        }
                    } else if (var269 < 2600) {
                        var5--;
                        class93 var75 = class121.method938(true, class49.field1181[var5]);
                        if (var269 == 2500) {
                            class49.field1181[var5++] = var75.field2282;
                            continue;
                        }
                        if (var269 == 2501) {
                            class49.field1181[var5++] = var75.field2313;
                            continue;
                        }
                        if (var269 == 2502) {
                            class49.field1181[var5++] = var75.field2257;
                            continue;
                        }
                        if (var269 == 2503) {
                            class49.field1181[var5++] = var75.field2286;
                            continue;
                        }
                        if (var269 == 2504) {
                            class49.field1181[var5++] = var75.field2326 ? 1 : 0;
                            continue;
                        }
                        if (var269 == 2505) {
                            class49.field1181[var5++] = var75.field2284;
                            continue;
                        }
                    } else if (var269 < 2700) {
                        var5--;
                        class93 var76 = class121.method938(true, class49.field1181[var5]);
                        if (var269 == 2600) {
                            class49.field1181[var5++] = var76.field2332;
                            continue;
                        }
                        if (var269 == 2601) {
                            class49.field1181[var5++] = var76.field2339;
                            continue;
                        }
                        if (var269 == 2602) {
                            class58.field1458[var6++] = var76.field2251;
                            continue;
                        }
                        if (var269 == 2603) {
                            class49.field1181[var5++] = var76.field2309;
                            continue;
                        }
                        if (var269 == 2604) {
                            class49.field1181[var5++] = var76.field2307;
                            continue;
                        }
                        if (var269 == 2605) {
                            class49.field1181[var5++] = var76.field2269;
                            continue;
                        }
                        if (var269 == 2606) {
                            class49.field1181[var5++] = var76.field2314;
                            continue;
                        }
                        if (var269 == 2607) {
                            class49.field1181[var5++] = var76.field2252;
                            continue;
                        }
                        if (var269 == 2608) {
                            class49.field1181[var5++] = var76.field2337;
                            continue;
                        }
                    } else if (var269 < 2800) {
                        if (var269 == 2700) {
                            var5--;
                            class93 var255 = class121.method938(true, class49.field1181[var5]);
                            class49.field1181[var5++] = var255.field2327;
                            continue;
                        }
                        if (var269 == 2701) {
                            var5--;
                            class93 var256 = class121.method938(true, class49.field1181[var5]);
                            if (var256.field2327 == -1) {
                                class49.field1181[var5++] = 0;
                            } else {
                                class49.field1181[var5++] = var256.field2244;
                            }
                            continue;
                        }
                        if (var269 == 2702) {
                            var5--;
                            int var257 = class49.field1181[var5];
                            class112 var258 = (class112) class63.field1530.method246((byte) 117, (long) var257);
                            if (var258 == null) {
                                class49.field1181[var5++] = 0;
                            } else {
                                class49.field1181[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var269 < 2900) {
                        var5--;
                        class93 var253 = class121.method938(true, class49.field1181[var5]);
                        if (var269 == 2800) {
                            class49.field1181[var5++] = class135.method1009(14423, class105.method810(var253, -22389));
                            continue;
                        }
                        if (var269 == 2801) {
                            var5--;
                            int var254 = class49.field1181[var5];
                            int var271 = var254 - 1;
                            if (var253.field2348 != null && var271 < var253.field2348.length && var253.field2348[var271] != null) {
                                class58.field1458[var6++] = var253.field2348[var271];
                                continue;
                            }
                            class58.field1458[var6++] = class3.field80;
                            continue;
                        }
                        if (var269 == 2802) {
                            if (var253.field2297 == null) {
                                class58.field1458[var6++] = class3.field80;
                            } else {
                                class58.field1458[var6++] = var253.field2297;
                            }
                            continue;
                        }
                    } else if (var269 < 3200) {
                        if (var269 == 3100) {
                            var6--;
                            class54 var239 = class58.field1458[var6];
                            class80.method612(var239, class3.field80, (byte) 123, 0);
                            continue;
                        }
                        if (var269 == 3101) {
                            var5 -= 2;
                            class129.method972(class49.field1181[var5 + 1], (byte) 114, class108.field2639, class49.field1181[var5]);
                            continue;
                        }
                        if (var269 == 3103) {
                            class2.method8(122);
                            continue;
                        }
                        if (var269 == 3104) {
                            var6--;
                            class54 var240 = class58.field1458[var6];
                            class49.field1178++;
                            int var241 = 0;
                            if (var240.method398((byte) -91)) {
                                var241 = var240.method383((byte) -89);
                            }
                            class131.field2969.method454(78, -47);
                            class131.field2969.method658(181, var241);
                            continue;
                        }
                        if (var269 == 3105) {
                            var6--;
                            class54 var242 = class58.field1458[var6];
                            class131.field2959++;
                            class131.field2969.method454(45, arg0 ^ 0x73);
                            class131.field2969.method677(189354448, var242.method385((byte) -42));
                            continue;
                        }
                        if (var269 == 3106) {
                            class144.field3297++;
                            var6--;
                            class54 var243 = class58.field1458[var6];
                            class131.field2969.method454(150, 111);
                            class131.field2969.method649((byte) -27, var243.method404(-105) + 1);
                            class131.field2969.method681(var243, 18601);
                            continue;
                        }
                        if (var269 == 3107) {
                            var6--;
                            class54 var244 = class58.field1458[var6];
                            var5--;
                            int var245 = class49.field1181[var5];
                            class70.method557((byte) 121, var244, var245);
                            continue;
                        }
                        if (var269 == 3108) {
                            var5 -= 3;
                            int var246 = class49.field1181[var5 + 1];
                            int var247 = class49.field1181[var5];
                            int var248 = class49.field1181[var5 + 2];
                            class93 var249 = class121.method938(true, var248);
                            class4.method32((byte) 85, var246, var247, var249);
                            continue;
                        }
                        if (var269 == 3109) {
                            class93 var250 = var41 ? class15.field465 : class40.field1043;
                            var5 -= 2;
                            int var251 = class49.field1181[var5 + 1];
                            int var252 = class49.field1181[var5];
                            class4.method32((byte) 85, var251, var252, var250);
                            continue;
                        }
                    } else if (var269 < 3300) {
                        if (var269 == 3200) {
                            var5 -= 3;
                            class68.method535(class49.field1181[var5 + 2], class49.field1181[var5], class49.field1181[var5 + 1], 12644);
                            continue;
                        }
                        if (var269 == 3201) {
                            var5--;
                            class58.method465((byte) 60, class49.field1181[var5]);
                            continue;
                        }
                        if (var269 == 3202) {
                            var5 -= 2;
                            class87.method695(false, class49.field1181[var5], class49.field1181[var5 + 1]);
                            continue;
                        }
                    } else if (var269 < 3400) {
                        if (var269 == 3300) {
                            class49.field1181[var5++] = class4.field138;
                            continue;
                        }
                        if (var269 == 3301) {
                            var5 -= 2;
                            int var77 = class49.field1181[var5];
                            int var78 = class49.field1181[var5 + 1];
                            class49.field1181[var5++] = class94.method753(arg0 - 2, var78, var77);
                            continue;
                        }
                        if (var269 == 3302) {
                            var5 -= 2;
                            int var79 = class49.field1181[var5];
                            int var80 = class49.field1181[var5 + 1];
                            class49.field1181[var5++] = class39.method296(var79, arg0 + 127, var80);
                            continue;
                        }
                        if (var269 == 3303) {
                            var5 -= 2;
                            int var81 = class49.field1181[var5];
                            int var82 = class49.field1181[var5 + 1];
                            class49.field1181[var5++] = class91.method729((byte) 123, var81, var82);
                            continue;
                        }
                        if (var269 == 3304) {
                            var5--;
                            int var83 = class49.field1181[var5];
                            class49.field1181[var5++] = class73.method571(536870912, var83).field2113;
                            continue;
                        }
                        if (var269 == 3305) {
                            var5--;
                            int var84 = class49.field1181[var5];
                            class49.field1181[var5++] = class149.field3376[var84];
                            continue;
                        }
                        if (var269 == 3306) {
                            var5--;
                            int var85 = class49.field1181[var5];
                            class49.field1181[var5++] = class63.field1546[var85];
                            continue;
                        }
                        if (var269 == 3307) {
                            var5--;
                            int var86 = class49.field1181[var5];
                            class49.field1181[var5++] = class87.field2159[var86];
                            continue;
                        }
                        if (var269 == 3308) {
                            int var87 = class157.field3573;
                            int var88 = (class108.field2639.field974 >> 7) + class11.field323;
                            int var89 = (class108.field2639.field971 >> 7) + class67.field1648;
                            class49.field1181[var5++] = (var87 << 28) + (var88 << 14) + var89;
                            continue;
                        }
                        if (var269 == 3309) {
                            var5--;
                            int var90 = class49.field1181[var5];
                            class49.field1181[var5++] = class118.method887(268431226, var90) >> 14;
                            continue;
                        }
                        if (var269 == 3310) {
                            var5--;
                            int var91 = class49.field1181[var5];
                            class49.field1181[var5++] = var91 >> 28;
                            continue;
                        }
                        if (var269 == 3311) {
                            var5--;
                            int var92 = class49.field1181[var5];
                            class49.field1181[var5++] = class118.method887(16383, var92);
                            continue;
                        }
                        if (var269 == 3312) {
                            class49.field1181[var5++] = class150.field3395 ? 1 : 0;
                            continue;
                        }
                        if (var269 == 3313) {
                            var5 -= 2;
                            int var93 = class49.field1181[var5] + 32768;
                            int var94 = class49.field1181[var5 + 1];
                            class49.field1181[var5++] = class94.method753(arg0 - 2, var94, var93);
                            continue;
                        }
                        if (var269 == 3314) {
                            var5 -= 2;
                            int var95 = class49.field1181[var5] + 32768;
                            int var96 = class49.field1181[var5 + 1];
                            class49.field1181[var5++] = class39.method296(var95, 128, var96);
                            continue;
                        }
                        if (var269 == 3315) {
                            var5 -= 2;
                            int var97 = class49.field1181[var5 + 1];
                            int var98 = class49.field1181[var5] + 32768;
                            class49.field1181[var5++] = class91.method729((byte) 120, var98, var97);
                            continue;
                        }
                        if (var269 == 3316) {
                            if (class28.field755 < 2) {
                                class49.field1181[var5++] = 0;
                            } else {
                                class49.field1181[var5++] = class28.field755;
                            }
                            continue;
                        }
                        if (var269 == 3317) {
                            class49.field1181[var5++] = class111.field2658;
                            continue;
                        }
                        if (var269 == 3318) {
                            class49.field1181[var5++] = class123.field2828;
                            continue;
                        }
                        if (var269 == 3321) {
                            class49.field1181[var5++] = class38.field953;
                            continue;
                        }
                        if (var269 == 3322) {
                            class49.field1181[var5++] = class150.field3393;
                            continue;
                        }
                        if (var269 == 3323) {
                            if (class28.field755 == 1) {
                                class49.field1181[var5++] = 1;
                            } else {
                                class49.field1181[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var269 < 3500) {
                        if (var269 == 3400) {
                            var5 -= 2;
                            int var99 = class49.field1181[var5 + 1];
                            int var100 = class49.field1181[var5];
                            class40 var101 = class73.method569(var100, arg0 - 10835);
                            for (int var102 = 0; var102 < var101.field1036; var102++) {
                                if (var101.field1031[var102] == var99) {
                                    class58.field1458[var6++] = var101.field1038[var102];
                                    var101 = null;
                                    break;
                                }
                            }
                            if (var101 != null) {
                                class58.field1458[var6++] = var101.field1039;
                            }
                            continue;
                        }
                        if (var269 == 3408) {
                            var5 -= 4;
                            int var103 = class49.field1181[var5 + 1];
                            int var104 = class49.field1181[var5];
                            int var105 = class49.field1181[var5 + 2];
                            int var106 = class49.field1181[var5 + 3];
                            class40 var107 = class73.method569(var105, -10834);
                            if (var107.field1035 == var104 && var107.field1037 == var103) {
                                for (int var108 = 0; var108 < var107.field1036; var108++) {
                                    if (var107.field1031[var108] == var106) {
                                        if (var103 == 115) {
                                            class58.field1458[var6++] = var107.field1038[var108];
                                        } else {
                                            class49.field1181[var5++] = var107.field1033[var108];
                                        }
                                        var107 = null;
                                        break;
                                    }
                                }
                                if (var107 != null) {
                                    if (var103 == 115) {
                                        class58.field1458[var6++] = var107.field1039;
                                    } else {
                                        class49.field1181[var5++] = var107.field1042;
                                    }
                                }
                                continue;
                            }
                            if (var103 == 115) {
                                class58.field1458[var6++] = class155.field3510;
                            } else {
                                class49.field1181[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var269 < 3700) {
                        if (var269 == 3600) {
                            if (class18.field528 == 0) {
                                class49.field1181[var5++] = -2;
                            } else if (class18.field528 == 1) {
                                class49.field1181[var5++] = -1;
                            } else {
                                class49.field1181[var5++] = class158.field3609;
                            }
                            continue;
                        }
                        if (var269 == 3601) {
                            var5--;
                            int var109 = class49.field1181[var5];
                            if (class18.field528 == 2 && var109 < class158.field3609) {
                                class58.field1458[var6++] = class40.field1054[var109];
                                continue;
                            }
                            class58.field1458[var6++] = class3.field80;
                            continue;
                        }
                        if (var269 == 3602) {
                            var5--;
                            int var110 = class49.field1181[var5];
                            if (class18.field528 == 2 && class158.field3609 > var110) {
                                class49.field1181[var5++] = class94.field2368[var110];
                                continue;
                            }
                            class49.field1181[var5++] = 0;
                            continue;
                        }
                        if (var269 == 3603) {
                            var5--;
                            int var111 = class49.field1181[var5];
                            if (class18.field528 == 2 && class158.field3609 > var111) {
                                class49.field1181[var5++] = class66.field1583[var111];
                                continue;
                            }
                            class49.field1181[var5++] = 0;
                            continue;
                        }
                        if (var269 == 3604) {
                            var5--;
                            int var112 = class49.field1181[var5];
                            var6--;
                            class54 var113 = class58.field1458[var6];
                            class77.method593((byte) -105, var112, var113);
                            continue;
                        }
                        if (var269 == 3605) {
                            var6--;
                            class54 var114 = class58.field1458[var6];
                            class58.method453(var114.method385((byte) -76), arg0 - 315);
                            continue;
                        }
                        if (var269 == 3606) {
                            var6--;
                            class54 var115 = class58.field1458[var6];
                            class8.method66(var115.method385((byte) -33), (byte) 68);
                            continue;
                        }
                        if (var269 == 3607) {
                            var6--;
                            class54 var116 = class58.field1458[var6];
                            class89.method706(var116.method385((byte) -41), (byte) 0);
                            continue;
                        }
                        if (var269 == 3608) {
                            var6--;
                            class54 var117 = class58.field1458[var6];
                            class143.method1104(arg0 + 1, var117.method385((byte) -112));
                            continue;
                        }
                        if (var269 == 3609) {
                            var6--;
                            class54 var118 = class58.field1458[var6];
                            if (var118.method387(class14.field415, (byte) -95) || var118.method387(class142.field3257, (byte) -95)) {
                                var118 = var118.method384(7, 113);
                            }
                            class49.field1181[var5++] = class54.method409(60, var118) ? 1 : 0;
                            continue;
                        }
                        if (var269 == 3611) {
                            if (class94.field2382 == null) {
                                class58.field1458[var6++] = class3.field80;
                            } else {
                                class58.field1458[var6++] = class94.field2382;
                            }
                            continue;
                        }
                        if (var269 == 3612) {
                            if (class94.field2382 == null) {
                                class49.field1181[var5++] = 0;
                            } else {
                                class49.field1181[var5++] = class72.field1779;
                            }
                            continue;
                        }
                        if (var269 == 3613) {
                            var5--;
                            int var119 = class49.field1181[var5];
                            if (class94.field2382 != null && var119 < class72.field1779) {
                                class58.field1458[var6++] = class56.field1414[var119].field1230;
                                continue;
                            }
                            class58.field1458[var6++] = class3.field80;
                            continue;
                        }
                        if (var269 == 3614) {
                            var5--;
                            int var120 = class49.field1181[var5];
                            if (class94.field2382 != null && class72.field1779 > var120) {
                                class49.field1181[var5++] = class56.field1414[var120].field1224;
                                continue;
                            }
                            class49.field1181[var5++] = 0;
                            continue;
                        }
                        if (var269 == 3615) {
                            var5--;
                            int var121 = class49.field1181[var5];
                            if (class94.field2382 != null && var121 < class72.field1779) {
                                class49.field1181[var5++] = class56.field1414[var121].field1228;
                                continue;
                            }
                            class49.field1181[var5++] = 0;
                            continue;
                        }
                        if (var269 == 3616) {
                            class49.field1181[var5++] = class142.field3241;
                            continue;
                        }
                        if (var269 == 3617) {
                            var5--;
                            int var122 = class49.field1181[var5];
                            class51.method362(-125, var122);
                            continue;
                        }
                        if (var269 == 3618) {
                            class49.field1181[var5++] = class57.field1431;
                            continue;
                        }
                        if (var269 == 3619) {
                            var6--;
                            class54 var123 = class58.field1458[var6];
                            class84.method684(true, var123.method385((byte) -112));
                            continue;
                        }
                        if (var269 == 3620) {
                            class71.method561(-7398);
                            continue;
                        }
                        if (var269 == 3621) {
                            if (class18.field528 == 0) {
                                class49.field1181[var5++] = -1;
                            } else {
                                class49.field1181[var5++] = class54.field1347;
                            }
                            continue;
                        }
                        if (var269 == 3622) {
                            var5--;
                            int var124 = class49.field1181[var5];
                            if (class18.field528 != 0 && var124 < class54.field1347) {
                                class58.field1458[var6++] = class135.method1011(-5, class15.field464[var124]).method418(91);
                                continue;
                            }
                            class58.field1458[var6++] = class3.field80;
                            continue;
                        }
                    } else if (var269 < 4100) {
                        if (var269 == 4000) {
                            var5 -= 2;
                            int var125 = class49.field1181[var5 + 1];
                            int var126 = class49.field1181[var5];
                            class49.field1181[var5++] = var125 + var126;
                            continue;
                        }
                        if (var269 == 4001) {
                            var5 -= 2;
                            int var127 = class49.field1181[var5];
                            int var128 = class49.field1181[var5 + 1];
                            class49.field1181[var5++] = var127 - var128;
                            continue;
                        }
                        if (var269 == 4002) {
                            var5 -= 2;
                            int var129 = class49.field1181[var5];
                            int var130 = class49.field1181[var5 + 1];
                            class49.field1181[var5++] = var129 * var130;
                            continue;
                        }
                        if (var269 == 4003) {
                            var5 -= 2;
                            int var131 = class49.field1181[var5];
                            int var132 = class49.field1181[var5 + 1];
                            class49.field1181[var5++] = var131 / var132;
                            continue;
                        }
                        if (var269 == 4004) {
                            var5--;
                            int var133 = class49.field1181[var5];
                            class49.field1181[var5++] = (int) (Math.random() * (double) var133);
                            continue;
                        }
                        if (var269 == 4005) {
                            var5--;
                            int var134 = class49.field1181[var5];
                            class49.field1181[var5++] = (int) (Math.random() * (double) (var134 + 1));
                            continue;
                        }
                        if (var269 == 4006) {
                            var5 -= 5;
                            int var135 = class49.field1181[var5 + 2];
                            int var136 = class49.field1181[var5 + 1];
                            int var137 = class49.field1181[var5];
                            int var138 = class49.field1181[var5 + 4];
                            int var139 = class49.field1181[var5 + 3];
                            class49.field1181[var5++] = (var138 - var135) * (-var137 + var136) / (var139 - var135) + var137;
                            continue;
                        }
                        if (var269 == 4007) {
                            var5 -= 2;
                            int var140 = class49.field1181[var5];
                            int var141 = class49.field1181[var5 + 1];
                            class49.field1181[var5++] = var140 * var141 / 100 + var140;
                            continue;
                        }
                        if (var269 == 4008) {
                            var5 -= 2;
                            int var142 = class49.field1181[var5];
                            int var143 = class49.field1181[var5 + 1];
                            class49.field1181[var5++] = class38.method292(0x1 << var143, var142);
                            continue;
                        }
                        if (var269 == 4009) {
                            var5 -= 2;
                            int var144 = class49.field1181[var5];
                            int var145 = class49.field1181[var5 + 1];
                            class49.field1181[var5++] = class118.method887(-(0x1 << var145) - 1, var144);
                            continue;
                        }
                        if (var269 == 4010) {
                            var5 -= 2;
                            int var146 = class49.field1181[var5];
                            int var147 = class49.field1181[var5 + 1];
                            class49.field1181[var5++] = class118.method887(0x1 << var147, var146) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var269 == 4011) {
                            var5 -= 2;
                            int var148 = class49.field1181[var5];
                            int var149 = class49.field1181[var5 + 1];
                            class49.field1181[var5++] = var148 % var149;
                            continue;
                        }
                        if (var269 == 4012) {
                            var5 -= 2;
                            int var150 = class49.field1181[var5 + 1];
                            int var151 = class49.field1181[var5];
                            if (var151 == 0) {
                                class49.field1181[var5++] = 0;
                            } else {
                                class49.field1181[var5++] = (int) Math.pow((double) var151, (double) var150);
                            }
                            continue;
                        }
                        if (var269 == 4013) {
                            var5 -= 2;
                            int var152 = class49.field1181[var5];
                            int var153 = class49.field1181[var5 + 1];
                            if (var152 == 0) {
                                class49.field1181[var5++] = 0;
                            } else if (var153 == 0) {
                                class49.field1181[var5++] = Integer.MAX_VALUE;
                            } else {
                                class49.field1181[var5++] = (int) Math.pow((double) var152, 1.0D / (double) var153);
                            }
                            continue;
                        }
                        if (var269 == 4014) {
                            var5 -= 2;
                            int var154 = class49.field1181[var5 + 1];
                            int var155 = class49.field1181[var5];
                            class49.field1181[var5++] = class118.method887(var155, var154);
                            continue;
                        }
                        if (var269 == 4015) {
                            var5 -= 2;
                            int var156 = class49.field1181[var5];
                            int var157 = class49.field1181[var5 + 1];
                            class49.field1181[var5++] = class38.method292(var157, var156);
                            continue;
                        }
                    } else if (var269 < 4200) {
                        if (var269 == 4100) {
                            var5--;
                            int var193 = class49.field1181[var5];
                            var6--;
                            class54 var194 = class58.field1458[var6];
                            class58.field1458[var6++] = class143.method1105(new class54[] { var194, class147.method1117(-66, var193) }, -842);
                            continue;
                        }
                        if (var269 == 4101) {
                            var6 -= 2;
                            class54 var195 = class58.field1458[var6 + 1];
                            class54 var196 = class58.field1458[var6];
                            class58.field1458[var6++] = class143.method1105(new class54[] { var196, var195 }, -842);
                            continue;
                        }
                        if (var269 == 4102) {
                            var6--;
                            class54 var197 = class58.field1458[var6];
                            var5--;
                            int var198 = class49.field1181[var5];
                            class58.field1458[var6++] = class143.method1105(new class54[] { var197, class66.method515(true, var198, 117) }, -842);
                            continue;
                        }
                        if (var269 == 4103) {
                            var6--;
                            class54 var199 = class58.field1458[var6];
                            class58.field1458[var6++] = var199.method406((byte) -55);
                            continue;
                        }
                        if (var269 == 4104) {
                            var5--;
                            int var200 = class49.field1181[var5];
                            long var201 = (long) var200 * 86400000L + 1014768000000L;
                            class82.field2010.setTime(new Date(var201));
                            int var203 = class82.field2010.get(5);
                            int var204 = class82.field2010.get(2);
                            int var205 = class82.field2010.get(1);
                            class58.field1458[var6++] = class143.method1105(new class54[] { class147.method1117(-44, var203), class79.field1937, class88.field2168[var204], class79.field1937, class147.method1117(-102, var205) }, -842);
                            continue;
                        }
                        if (var269 == 4105) {
                            var6 -= 2;
                            class54 var206 = class58.field1458[var6 + 1];
                            class54 var207 = class58.field1458[var6];
                            if (class108.field2639.field642 != null && class108.field2639.field642.field1685) {
                                class58.field1458[var6++] = var206;
                                continue;
                            }
                            class58.field1458[var6++] = var207;
                            continue;
                        }
                        if (var269 == 4106) {
                            var5--;
                            int var208 = class49.field1181[var5];
                            class58.field1458[var6++] = class147.method1117(-86, var208);
                            continue;
                        }
                        if (var269 == 4107) {
                            var6 -= 2;
                            class49.field1181[var5++] = class58.field1458[var6].method412(class58.field1458[var6 + 1], -96);
                            continue;
                        }
                        if (var269 == 4108) {
                            var5 -= 2;
                            var6--;
                            class54 var209 = class58.field1458[var6];
                            int var210 = class49.field1181[var5 + 1];
                            int var211 = class49.field1181[var5];
                            byte[] var212 = class52.field1262.method266(var210, (byte) 107, 0);
                            class101 var213 = new class101(var212);
                            class49.field1181[var5++] = var213.method1182(var209, var211);
                            continue;
                        }
                        if (var269 == 4109) {
                            var6--;
                            class54 var214 = class58.field1458[var6];
                            var5 -= 2;
                            int var215 = class49.field1181[var5];
                            int var216 = class49.field1181[var5 + 1];
                            byte[] var217 = class52.field1262.method266(var216, (byte) 90, 0);
                            class101 var218 = new class101(var217);
                            class49.field1181[var5++] = var218.method1180(var214, var215);
                            continue;
                        }
                        if (var269 == 4110) {
                            var6 -= 2;
                            class54 var219 = class58.field1458[var6 + 1];
                            class54 var220 = class58.field1458[var6];
                            var5--;
                            if (class49.field1181[var5] == 1) {
                                class58.field1458[var6++] = var220;
                            } else {
                                class58.field1458[var6++] = var219;
                            }
                            continue;
                        }
                        if (var269 == 4111) {
                            var6--;
                            class54 var221 = class58.field1458[var6];
                            class58.field1458[var6++] = class154.method1186(var221);
                            continue;
                        }
                        if (var269 == 4112) {
                            var6--;
                            class54 var222 = class58.field1458[var6];
                            var5--;
                            int var223 = class49.field1181[var5];
                            class58.field1458[var6++] = var222.method417(15871, var223);
                            continue;
                        }
                        if (var269 == 4113) {
                            var5--;
                            int var224 = class49.field1181[var5];
                            class49.field1181[var5++] = class157.method1207(false, var224) ? 1 : 0;
                            continue;
                        }
                        if (var269 == 4114) {
                            var5--;
                            int var225 = class49.field1181[var5];
                            class49.field1181[var5++] = class35.method269(true, var225) ? 1 : 0;
                            continue;
                        }
                        if (var269 == 4115) {
                            var5--;
                            int var226 = class49.field1181[var5];
                            class49.field1181[var5++] = class2.method10(-103, var226) ? 1 : 0;
                            continue;
                        }
                        if (var269 == 4116) {
                            var5--;
                            int var227 = class49.field1181[var5];
                            class49.field1181[var5++] = class94.method749(var227, (byte) -120) ? 1 : 0;
                            continue;
                        }
                        if (var269 == 4117) {
                            var6--;
                            class54 var228 = class58.field1458[var6];
                            if (var228 == null) {
                                class49.field1181[var5++] = 0;
                            } else {
                                class49.field1181[var5++] = var228.method404(arg0 - 113);
                            }
                            continue;
                        }
                        if (var269 == 4118) {
                            var5 -= 2;
                            var6--;
                            class54 var229 = class58.field1458[var6];
                            int var230 = class49.field1181[var5 + 1];
                            int var231 = class49.field1181[var5];
                            class58.field1458[var6++] = var229.method408((byte) 93, var231, var230);
                            continue;
                        }
                        if (var269 == 4119) {
                            var6--;
                            class54 var232 = class58.field1458[var6];
                            class54 var233 = class72.method565((byte) -99, var232.method404(arg0 - 123));
                            boolean var234 = false;
                            for (int var235 = 0; var232.method404(-116) > var235; var235++) {
                                int var236 = var232.method413(21340, var235);
                                if (var236 == 60) {
                                    var234 = true;
                                } else if (var236 == 62) {
                                    var234 = false;
                                } else if (!var234) {
                                    var233.method403(var236, 0);
                                }
                            }
                            var233.method410(0);
                            class58.field1458[var6++] = var233;
                            continue;
                        }
                        if (var269 == 4120) {
                            var6--;
                            class54 var237 = class58.field1458[var6];
                            var5--;
                            int var238 = class49.field1181[var5];
                            class49.field1181[var5++] = var237.method416(var238, 0);
                            continue;
                        }
                    } else if (var269 < 4300) {
                        if (var269 == 4200) {
                            var5--;
                            int var158 = class49.field1181[var5];
                            class58.field1458[var6++] = class141.method1088(var158, (byte) -121).field1652;
                            continue;
                        }
                        if (var269 == 4201) {
                            var5 -= 2;
                            int var159 = class49.field1181[var5];
                            int var160 = class49.field1181[var5 + 1];
                            class67 var161 = class141.method1088(var159, (byte) -123);
                            if (var160 >= 1 && var160 <= 5 && var161.field1669[var160 - 1] != null) {
                                class58.field1458[var6++] = var161.field1669[var160 - 1];
                                continue;
                            }
                            class58.field1458[var6++] = class3.field80;
                            continue;
                        }
                        if (var269 == 4202) {
                            var5 -= 2;
                            int var162 = class49.field1181[var5];
                            int var163 = class49.field1181[var5 + 1];
                            class67 var164 = class141.method1088(var162, (byte) -107);
                            if (var163 >= 1 && var163 <= 5 && var164.field1649[var163 - 1] != null) {
                                class58.field1458[var6++] = var164.field1649[var163 - 1];
                                continue;
                            }
                            class58.field1458[var6++] = class3.field80;
                            continue;
                        }
                        if (var269 == 4203) {
                            var5--;
                            int var165 = class49.field1181[var5];
                            class49.field1181[var5++] = class141.method1088(var165, (byte) -108).field1678;
                            continue;
                        }
                        if (var269 == 4204) {
                            var5--;
                            int var166 = class49.field1181[var5];
                            class49.field1181[var5++] = class141.method1088(var166, (byte) -107).field1673 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var269 == 4205) {
                            var5--;
                            int var167 = class49.field1181[var5];
                            class67 var168 = class141.method1088(var167, (byte) -128);
                            if (var168.field1647 == -1 && var168.field1638 >= 0) {
                                class49.field1181[var5++] = var168.field1638;
                                continue;
                            }
                            class49.field1181[var5++] = var167;
                            continue;
                        }
                        if (var269 == 4206) {
                            var5--;
                            int var169 = class49.field1181[var5];
                            class67 var170 = class141.method1088(var169, (byte) -116);
                            if (var170.field1647 >= 0 && var170.field1638 >= 0) {
                                class49.field1181[var5++] = var170.field1638;
                                continue;
                            }
                            class49.field1181[var5++] = var169;
                            continue;
                        }
                        if (var269 == 4207) {
                            var5--;
                            int var171 = class49.field1181[var5];
                            class49.field1181[var5++] = class141.method1088(var171, (byte) -105).field1663 ? 1 : 0;
                            continue;
                        }
                    } else if (var269 < 5100) {
                        if (var269 == 5000) {
                            class49.field1181[var5++] = class57.field1436;
                            continue;
                        }
                        if (var269 == 5001) {
                            class21.field588++;
                            var5 -= 3;
                            class57.field1436 = class49.field1181[var5];
                            class149.field3385 = class49.field1181[var5 + 1];
                            class48.field1147 = class49.field1181[var5 + 2];
                            class131.field2969.method454(11, arg0 + 112);
                            class131.field2969.method649((byte) -27, class57.field1436);
                            class131.field2969.method649((byte) -27, class149.field3385);
                            class131.field2969.method649((byte) -27, class48.field1147);
                            continue;
                        }
                        if (var269 == 5002) {
                            class59.field1485++;
                            var5 -= 2;
                            int var172 = class49.field1181[var5];
                            int var173 = class49.field1181[var5 + 1];
                            var6--;
                            class54 var174 = class58.field1458[var6];
                            class131.field2969.method454(47, -105);
                            class131.field2969.method677(arg0 ^ 0xB4951D1, var174.method385((byte) -107));
                            class131.field2969.method649((byte) -27, var172 - 1);
                            class131.field2969.method649((byte) -27, var173);
                            continue;
                        }
                        if (var269 == 5003) {
                            var5--;
                            int var175 = class49.field1181[var5];
                            class54 var176 = null;
                            if (var175 < 100) {
                                var176 = class14.field394[var175];
                            }
                            if (var176 == null) {
                                var176 = class3.field80;
                            }
                            class58.field1458[var6++] = var176;
                            continue;
                        }
                        if (var269 == 5004) {
                            var5--;
                            int var177 = class49.field1181[var5];
                            int var178 = -1;
                            if (var177 < 100 && class14.field394[var177] != null) {
                                var178 = class34.field853[var177];
                            }
                            class49.field1181[var5++] = var178;
                            continue;
                        }
                        if (var269 == 5005) {
                            class49.field1181[var5++] = class149.field3385;
                            continue;
                        }
                        if (var269 == 5008) {
                            var6--;
                            class54 var179 = class58.field1458[var6];
                            if (var179.method387(class6.field195, (byte) -95)) {
                                class8.method67(var179, false);
                            } else {
                                class26.field690++;
                                class54 var180 = var179.method406((byte) -55);
                                byte var181 = 0;
                                byte var182 = 0;
                                if (var180.method387(class129.field2907, (byte) -95)) {
                                    var181 = 0;
                                    var179 = var179.method384(class129.field2907.method404(arg0 ^ 0xFFFFFF87), -46);
                                } else if (var180.method387(class124.field2853, (byte) -95)) {
                                    var179 = var179.method384(class124.field2853.method404(-99), 124);
                                    var181 = 1;
                                } else if (var180.method387(class143.field3271, (byte) -95)) {
                                    var179 = var179.method384(class143.field3271.method404(-107), 106);
                                    var181 = 2;
                                } else if (var180.method387(class78.field1927, (byte) -95)) {
                                    var181 = 3;
                                    var179 = var179.method384(class78.field1927.method404(arg0 ^ 0xFFFFFF8C), 94);
                                } else if (var180.method387(class27.field720, (byte) -95)) {
                                    var179 = var179.method384(class27.field720.method404(-127), 121);
                                    var181 = 4;
                                } else if (var180.method387(class28.field748, (byte) -95)) {
                                    var179 = var179.method384(class28.field748.method404(-110), -37);
                                    var181 = 5;
                                } else if (var180.method387(class56.field1406, (byte) -95)) {
                                    var179 = var179.method384(class56.field1406.method404(arg0 ^ 0xFFFFFF93), -110);
                                    var181 = 6;
                                } else if (var180.method387(class17.field497, (byte) -95)) {
                                    var181 = 7;
                                    var179 = var179.method384(class17.field497.method404(-120), arg0 ^ 0x6D);
                                } else if (var180.method387(class115.field2738, (byte) -95)) {
                                    var179 = var179.method384(class115.field2738.method404(-111), arg0 ^ 0xFFFFFFCD);
                                    var181 = 8;
                                } else if (var180.method387(class85.field2125, (byte) -95)) {
                                    var179 = var179.method384(class85.field2125.method404(arg0 - 102), -42);
                                    var181 = 9;
                                } else if (var180.method387(class11.field313, (byte) -95)) {
                                    var181 = 10;
                                    var179 = var179.method384(class11.field313.method404(-126), -77);
                                } else if (var180.method387(class105.field2601, (byte) -95)) {
                                    var179 = var179.method384(class105.field2601.method404(-102), -122);
                                    var181 = 11;
                                } else if (class31.field802 != 0) {
                                    if (var180.method387(class129.field2901, (byte) -95)) {
                                        var181 = 0;
                                        var179 = var179.method384(class129.field2901.method404(-128), -117);
                                    } else if (var180.method387(class124.field2863, (byte) -95)) {
                                        var181 = 1;
                                        var179 = var179.method384(class124.field2863.method404(arg0 ^ 0xFFFFFF90), -100);
                                    } else if (var180.method387(class143.field3264, (byte) -95)) {
                                        var179 = var179.method384(class143.field3264.method404(-125), 79);
                                        var181 = 2;
                                    } else if (var180.method387(class78.field1930, (byte) -95)) {
                                        var179 = var179.method384(class78.field1930.method404(arg0 - 105), -35);
                                        var181 = 3;
                                    } else if (var180.method387(class27.field721, (byte) -95)) {
                                        var181 = 4;
                                        var179 = var179.method384(class27.field721.method404(-121), -48);
                                    } else if (var180.method387(class28.field752, (byte) -95)) {
                                        var181 = 5;
                                        var179 = var179.method384(class28.field752.method404(-99), 103);
                                    } else if (var180.method387(class56.field1411, (byte) -95)) {
                                        var179 = var179.method384(class56.field1411.method404(arg0 ^ 0xFFFFFF8C), -93);
                                        var181 = 6;
                                    } else if (var180.method387(class17.field499, (byte) -95)) {
                                        var181 = 7;
                                        var179 = var179.method384(class17.field499.method404(arg0 - 112), -89);
                                    } else if (var180.method387(class115.field2732, (byte) -95)) {
                                        var181 = 8;
                                        var179 = var179.method384(class115.field2732.method404(-97), 94);
                                    } else if (var180.method387(class85.field2126, (byte) -95)) {
                                        var179 = var179.method384(class85.field2126.method404(-111), arg0 ^ 0x62);
                                        var181 = 9;
                                    } else if (var180.method387(class11.field312, (byte) -95)) {
                                        var179 = var179.method384(class11.field312.method404(-96), 73);
                                        var181 = 10;
                                    } else if (var180.method387(class105.field2588, (byte) -95)) {
                                        var181 = 11;
                                        var179 = var179.method384(class105.field2588.method404(arg0 ^ 0xFFFFFF8C), -91);
                                    }
                                }
                                class54 var183 = var179.method406((byte) -55);
                                if (var183.method387(class22.field622, (byte) -95)) {
                                    var182 = 1;
                                    var179 = var179.method384(class22.field622.method404(-114), -56);
                                } else if (var183.method387(class132.field2990, (byte) -95)) {
                                    var179 = var179.method384(class132.field2990.method404(-106), -73);
                                    var182 = 2;
                                } else if (var183.method387(class58.field1461, (byte) -95)) {
                                    var182 = 3;
                                    var179 = var179.method384(class58.field1461.method404(-100), 103);
                                } else if (var183.method387(class27.field727, (byte) -95)) {
                                    var179 = var179.method384(class27.field727.method404(-128), 85);
                                    var182 = 4;
                                } else if (var183.method387(class155.field3497, (byte) -95)) {
                                    var182 = 5;
                                    var179 = var179.method384(class155.field3497.method404(-127), 86);
                                } else if (class31.field802 != 0) {
                                    if (var183.method387(class22.field633, (byte) -95)) {
                                        var182 = 1;
                                        var179 = var179.method384(class22.field633.method404(-97), 100);
                                    } else if (var183.method387(class132.field2992, (byte) -95)) {
                                        var179 = var179.method384(class132.field2992.method404(arg0 ^ 0xFFFFFF96), 76);
                                        var182 = 2;
                                    } else if (var183.method387(class58.field1454, (byte) -95)) {
                                        var179 = var179.method384(class58.field1454.method404(-109), 99);
                                        var182 = 3;
                                    } else if (var183.method387(class27.field719, (byte) -95)) {
                                        var182 = 4;
                                        var179 = var179.method384(class27.field719.method404(-106), -87);
                                    } else if (var183.method387(class155.field3502, (byte) -95)) {
                                        var182 = 5;
                                        var179 = var179.method384(class155.field3502.method404(-105), 123);
                                    }
                                }
                                class131.field2969.method454(115, arg0 ^ 0x78);
                                class131.field2969.method649((byte) -27, 0);
                                int var184 = class131.field2969.field2076;
                                class131.field2969.method649((byte) -27, var181);
                                class131.field2969.method649((byte) -27, var182);
                                class58.method460(class131.field2969, -7547, var179);
                                class131.field2969.method680(class131.field2969.field2076 - var184, (byte) 90);
                            }
                            continue;
                        }
                        if (var269 == 5009) {
                            class105.field2594++;
                            var6 -= 2;
                            class54 var185 = class58.field1458[var6];
                            class54 var186 = class58.field1458[var6 + 1];
                            class131.field2969.method454(238, -47);
                            class131.field2969.method649((byte) -27, 0);
                            int var187 = class131.field2969.field2076;
                            class131.field2969.method677(189354448, var185.method385((byte) -32));
                            class58.method460(class131.field2969, -7547, var186);
                            class131.field2969.method680(class131.field2969.field2076 - var187, (byte) 93);
                            continue;
                        }
                        if (var269 == 5010) {
                            var5--;
                            int var188 = class49.field1181[var5];
                            class54 var189 = null;
                            if (var188 < 100) {
                                var189 = class26.field706[var188];
                            }
                            if (var189 == null) {
                                var189 = class3.field80;
                            }
                            class58.field1458[var6++] = var189;
                            continue;
                        }
                        if (var269 == 5011) {
                            var5--;
                            int var190 = class49.field1181[var5];
                            class54 var191 = null;
                            if (var190 < 100) {
                                var191 = class75.field1861[var190];
                            }
                            if (var191 == null) {
                                var191 = class3.field80;
                            }
                            class58.field1458[var6++] = var191;
                            continue;
                        }
                        if (var269 == 5015) {
                            class54 var192;
                            if (class108.field2639 == null || class108.field2639.field626 == null) {
                                var192 = class66.field1608;
                            } else {
                                var192 = class108.field2639.field626;
                            }
                            class58.field1458[var6++] = var192;
                            continue;
                        }
                        if (var269 == 5016) {
                            class49.field1181[var5++] = class48.field1147;
                            continue;
                        }
                        if (var269 == 5017) {
                            class49.field1181[var5++] = class155.field3508;
                            continue;
                        }
                    }
                } else {
                    class93 var62;
                    if (var269 < 2000) {
                        var62 = var41 ? class15.field465 : class40.field1043;
                    } else {
                        var269 -= 1000;
                        var5--;
                        var62 = class121.method938(true, class49.field1181[var5]);
                    }
                    if (var269 == 1300) {
                        var5--;
                        int var63 = class49.field1181[var5] - 1;
                        if (var63 >= 0 && var63 <= 9) {
                            var6--;
                            var62.method748(arg0, var63, class58.field1458[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var269 == 1301) {
                        var5 -= 2;
                        int var64 = class49.field1181[var5];
                        int var65 = class49.field1181[var5 + 1];
                        var62.field2306 = class105.method811(var64, arg0 ^ 0xFFFFFFFE, var65);
                        continue;
                    }
                    if (var269 == 1302) {
                        var5--;
                        var62.field2261 = class49.field1181[var5] == 1;
                        continue;
                    }
                    if (var269 == 1303) {
                        var5--;
                        var62.field2349 = class49.field1181[var5];
                        continue;
                    }
                    if (var269 == 1304) {
                        var5--;
                        var62.field2299 = class49.field1181[var5];
                        continue;
                    }
                    if (var269 == 1305) {
                        var6--;
                        var62.field2297 = class58.field1458[var6];
                        continue;
                    }
                    if (var269 == 1306) {
                        var6--;
                        var62.field2275 = class58.field1458[var6];
                        continue;
                    }
                    if (var269 == 1307) {
                        var62.field2348 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var268) {
            if (var4.field3010 == null) {
                if (class19.field543 != 0) {
                    class80.method612(class14.field401, class3.field80, (byte) 117, 0);
                }
                class48.method345(var268, -122, "CS2 - scr:" + var4.field154 + " op:" + var9);
            } else {
                class54 var265 = class72.method565((byte) -89, 30);
                var265.method411(class6.field186, (byte) -28).method411(var4.field3010, (byte) -28);
                for (int var266 = class63.field1522 - 1; var266 >= 0; var266--) {
                    var265.method411(class131.field2975, (byte) -28).method411(class79.field1940[var266].field2761.field3010, (byte) -28);
                }
                if (var9 == 40) {
                    int var267 = var8[var7];
                    var265.method411(class8.field228, (byte) -28).method411(class147.method1117(-60, var267), (byte) -28);
                }
                if (class19.field543 != 0) {
                    class80.method612(class143.method1105(new class54[] { class2.field22, var4.field3010 }, -842), class3.field80, (byte) 113, 0);
                }
                class48.method345(var268, arg0 ^ 0xFFFFFF9E, "CS2 - scr:" + var4.field154 + " op:" + var9 + new String(var265.method415(-10650)));
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method243(int arg0) {
        if (arg0 <= 35) {
            return;
        }
        field814 = null;
        field825 = null;
        field830 = null;
        field831 = null;
        field832 = null;
        field809 = null;
        field817 = null;
        field812 = null;
        field828 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Lad;")
    public final class5 method244(byte arg0) {
        field821++;
        if (this.field829 > 0 && this.field808[this.field829 - 1] != this.field833) {
            class5 var2 = this.field833;
            this.field833 = var2.field153;
            return var2;
        }
        if (arg0 != -25) {
            field806 = -34;
        }
        while (this.field829 < this.field816) {
            class5 var3 = this.field808[this.field829++].field153;
            if (this.field808[this.field829 - 1] != var3) {
                this.field833 = var3.field153;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)Lad;")
    public final class5 method245(byte arg0) {
        this.field829 = 0;
        field822++;
        int var2 = -87 % ((arg0 - 9) / 35);
        return this.method244((byte) -25);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BJ)Lad;")
    public final class5 method246(byte arg0, long arg1) {
        this.field819 = arg1;
        field813++;
        class5 var4 = this.field808[(int) (arg1 & (long) (this.field816 - 1))];
        if (arg0 != 117) {
            field814 = null;
        }
        for (this.field823 = var4.field153; this.field823 != var4; this.field823 = this.field823.field153) {
            if (this.field823.field154 == arg1) {
                class5 var5 = this.field823;
                this.field823 = this.field823.field153;
                return var5;
            }
        }
        this.field823 = null;
        return null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILme;)V")
    public static final void method247(int arg0, class88 arg1) {
        field815++;
        if (arg0 != -1) {
            field831 = null;
        }
        class17.field507 = arg1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
    public static final void method248(int arg0, byte arg1) {
        field820++;
        if (arg1 <= 13) {
            method248(67, (byte) -32);
        }
        class7 var2 = (class7) class63.field1524.method246((byte) 117, (long) arg0);
        if (var2 != null) {
            var2.method48(-315);
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I)V")
    public class32(int arg0) {
        this.field808 = new class5[arg0];
        this.field816 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class5 var3 = this.field808[var2] = new class5();
            var3.field153 = var3;
            var3.field158 = var3;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Lad;")
    public final class5 method249(int arg0) {
        if (arg0 != 12133) {
            method240(-6, (byte) 101, -73);
        }
        field811++;
        if (this.field823 == null) {
            return null;
        }
        class5 var2 = this.field808[(int) ((long) (this.field816 - 1) & this.field819)];
        while (this.field823 != var2) {
            if (this.field823.field154 == this.field819) {
                class5 var3 = this.field823;
                this.field823 = this.field823.field153;
                return var3;
            }
            this.field823 = this.field823.field153;
        }
        this.field823 = null;
        return null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lfb;B)V")
    public static final void method250(class38 arg0, byte arg1) {
        field827++;
        int var2 = -36 % ((21 - arg1) / 55);
        if (arg0.field941 == 0) {
            return;
        }
        if (arg0.field997 != -1 && arg0.field997 < 32768) {
            class120 var3 = class111.field2679[arg0.field997];
            if (var3 != null) {
                int var4 = arg0.field971 - var3.field971;
                int var5 = arg0.field974 - var3.field974;
                if (var5 != 0 || var4 != 0) {
                    arg0.field921 = (int) (Math.atan2((double) var5, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field997 >= 32768) {
            int var6 = arg0.field997 - 32768;
            if (class4.field131 == var6) {
                var6 = 2047;
            }
            class22 var7 = class48.field1148[var6];
            if (var7 != null) {
                int var8 = arg0.field971 - var7.field971;
                int var9 = arg0.field974 - var7.field974;
                if (var9 != 0 || var8 != 0) {
                    arg0.field921 = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field996 != 0 || arg0.field935 != 0) && (arg0.field932 == 0 || arg0.field970 > 0)) {
            int var10 = arg0.field974 - (arg0.field996 - class11.field323 - class11.field323) * 64;
            int var11 = arg0.field971 - (arg0.field935 - class67.field1648 - class67.field1648) * 64;
            if (var10 != 0 || var11 != 0) {
                arg0.field921 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg0.field996 = 0;
            arg0.field935 = 0;
        }
        int var12 = arg0.field921 - arg0.field923 & 0x7FF;
        if (var12 == 0) {
            arg0.field925 = 0;
            return;
        }
        arg0.field925++;
        if (var12 <= 1024) {
            arg0.field923 += arg0.field941;
            boolean var13 = true;
            if (arg0.field941 > var12 || 2048 - arg0.field941 < var12) {
                var13 = false;
                arg0.field923 = arg0.field921;
            }
            if (arg0.field969 == arg0.field961 && (arg0.field925 > 25 || var13)) {
                if (arg0.field950 == -1) {
                    arg0.field961 = arg0.field976;
                } else {
                    arg0.field961 = arg0.field950;
                }
            }
        } else {
            arg0.field923 -= arg0.field941;
            boolean var14 = true;
            if (var12 < arg0.field941 || var12 > 2048 - arg0.field941) {
                var14 = false;
                arg0.field923 = arg0.field921;
            }
            if (arg0.field969 == arg0.field961 && (arg0.field925 > 25 || var14)) {
                if (arg0.field954 == -1) {
                    arg0.field961 = arg0.field976;
                } else {
                    arg0.field961 = arg0.field954;
                }
            }
        }
        arg0.field923 &= 0x7FF;
    }
}
