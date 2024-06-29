import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public abstract class class145 {

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field2140 = 0;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Llf;")
    public static class211 field2135 = new class211(200);

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public int field2138;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public int field2142;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public int field2143;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public int field2146;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public int field2148;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method963(int arg0) {
        if (arg0 < 113) {
            field2140 = -32;
        }
        field2135 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)V")
    public abstract void method105(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIB)V")
    public static final void method964(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class33 var5 = (class33) class82.field1233.method665((byte) 105, (long) arg3);
        if (var5 == null) {
            var5 = new class33();
            class82.field1233.method662(0, var5, (long) arg3);
        }
        if (arg1 >= var5.field426.length) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field426.length; var8++) {
                var6[var8] = var5.field426[var8];
                var7[var8] = var5.field428[var8];
            }
            for (int var9 = var5.field426.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field426 = var6;
            var5.field428 = var7;
        }
        field2141++;
        if (arg4 >= -28) {
            field2139 = 98;
        }
        var5.field426[arg1] = arg0;
        var5.field428[arg1] = arg2;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(III)I")
    private static final int method965(int arg0, int arg1, int arg2) {
        class33 var3 = (class33) class82.field1233.method665((byte) 92, (long) arg0);
        field2149++;
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && var3.field426.length > arg1) {
            if (arg2 != 15270) {
                field2139 = -48;
            }
            return var3.field426[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)V")
    public static final void method966(int arg0, int arg1) {
        class136.field1985.method1425(arg1, -121);
        class125.field1858.method1425(arg1, -121);
        class53.field729.method1425(arg1, -127);
        if (arg0 != 16174) {
            field2140 = 6;
        }
        class149.field2212.method1425(arg1, -128);
        field2147++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lnj;II)V")
    public static final void method967(class142 arg0, int arg1, int arg2) {
        field2137++;
        Object[] var3 = arg0.field2086;
        int var4 = (Integer) var3[0];
        class285 var5 = class139.method938(true, var4);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        class66.field924 = 0;
        if (arg2 != 2) {
            field2135 = null;
        }
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field4527;
        int[] var10 = var5.field4521;
        byte var11 = -1;
        try {
            class50.field677 = new int[var5.field4516];
            int var12 = 0;
            class148.field2198 = new String[var5.field4525];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg0.field2084;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field2078;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field2079 == null ? -1 : arg0.field2079.field3474;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field2080;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field2079 == null ? -1 : arg0.field2079.field3471;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field2081 == null ? -1 : arg0.field2081.field3474;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field2081 == null ? -1 : arg0.field2081.field3471;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field2082;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field2083;
                    }
                    class50.field677[var12++] = var16;
                } else if (var3[var14] instanceof String) {
                    String var15 = (String) var3[var14];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field2087;
                    }
                    class148.field2198[var13++] = var15;
                }
            }
            int var17 = 0;
            label3879: while (true) {
                var17++;
                if (var17 > arg1) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var496 = var10[var8];
                if (var496 < 100) {
                    if (var496 == 0) {
                        class198.field3101[var6++] = var9[var8];
                        continue;
                    }
                    if (var496 == 1) {
                        int var18 = var9[var8];
                        class198.field3101[var6++] = class258.field4166[var18];
                        continue;
                    }
                    if (var496 == 2) {
                        int var19 = var9[var8];
                        var6--;
                        class31.method254(65280, var19, class198.field3101[var6]);
                        continue;
                    }
                    if (var496 == 3) {
                        class201.field3144[var7++] = var5.field4513[var8];
                        continue;
                    }
                    if (var496 == 6) {
                        var8 += var9[var8];
                        continue;
                    }
                    if (var496 == 7) {
                        var6 -= 2;
                        if (class198.field3101[var6 + 1] != class198.field3101[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var496 == 8) {
                        var6 -= 2;
                        if (class198.field3101[var6 + 1] == class198.field3101[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var496 == 9) {
                        var6 -= 2;
                        if (class198.field3101[var6 + 1] > class198.field3101[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var496 == 10) {
                        var6 -= 2;
                        if (class198.field3101[var6 + 1] < class198.field3101[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var496 == 21) {
                        if (class66.field924 == 0) {
                            return;
                        }
                        class172 var20 = class53.field737[--class66.field924];
                        class148.field2198 = var20.field2701;
                        var5 = var20.field2708;
                        var10 = var5.field4521;
                        var9 = var5.field4527;
                        class50.field677 = var20.field2694;
                        var8 = var20.field2698;
                        continue;
                    }
                    if (var496 == 25) {
                        int var21 = var9[var8];
                        class198.field3101[var6++] = class218.method1477(0, var21);
                        continue;
                    }
                    if (var496 == 27) {
                        int var22 = var9[var8];
                        var6--;
                        class236.method1604(var22, -17396, class198.field3101[var6]);
                        continue;
                    }
                    if (var496 == 31) {
                        var6 -= 2;
                        if (class198.field3101[var6] <= class198.field3101[var6 + 1]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var496 == 32) {
                        var6 -= 2;
                        if (class198.field3101[var6] >= class198.field3101[var6 + 1]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var496 == 33) {
                        class198.field3101[var6++] = class50.field677[var9[var8]];
                        continue;
                    }
                    int var10001;
                    if (var496 == 34) {
                        var10001 = var9[var8];
                        var6--;
                        class50.field677[var10001] = class198.field3101[var6];
                        continue;
                    }
                    if (var496 == 35) {
                        class201.field3144[var7++] = class148.field2198[var9[var8]];
                        continue;
                    }
                    if (var496 == 36) {
                        var10001 = var9[var8];
                        var7--;
                        class148.field2198[var10001] = class201.field3144[var7];
                        continue;
                    }
                    if (var496 == 37) {
                        int var23 = var9[var8];
                        var7 -= var23;
                        String var24 = class136.method925(var7, class201.field3144, var23, (byte) -122);
                        class201.field3144[var7++] = var24;
                        continue;
                    }
                    if (var496 == 38) {
                        var6--;
                        continue;
                    }
                    if (var496 == 39) {
                        var7--;
                        continue;
                    }
                    if (var496 == 40) {
                        int var25 = var9[var8];
                        class285 var26 = class139.method938(true, var25);
                        int[] var27 = new int[var26.field4516];
                        String[] var28 = new String[var26.field4525];
                        for (int var29 = 0; var29 < var26.field4523; var29++) {
                            var27[var29] = class198.field3101[var6 + var29 - var26.field4523];
                        }
                        for (int var30 = 0; var30 < var26.field4528; var30++) {
                            var28[var30] = class201.field3144[var7 + var30 - var26.field4528];
                        }
                        var6 -= var26.field4523;
                        var7 -= var26.field4528;
                        class172 var31 = new class172();
                        var31.field2694 = class50.field677;
                        var31.field2701 = class148.field2198;
                        var31.field2708 = var5;
                        var31.field2698 = var8;
                        if (class66.field924 >= class53.field737.length) {
                            throw new RuntimeException();
                        }
                        class53.field737[class66.field924++] = var31;
                        var8 = -1;
                        class148.field2198 = var28;
                        var5 = var26;
                        class50.field677 = var27;
                        var10 = var26.field4521;
                        var9 = var26.field4527;
                        continue;
                    }
                    if (var496 == 42) {
                        class198.field3101[var6++] = class252.field4024[var9[var8]];
                        continue;
                    }
                    if (var496 == 43) {
                        int var32 = var9[var8];
                        var6--;
                        class252.field4024[var32] = class198.field3101[var6];
                        class290.method1924(var32, 6492);
                        continue;
                    }
                    if (var496 == 44) {
                        int var33 = var9[var8] >> 16;
                        int var34 = var9[var8] & 0xFFFF;
                        var6--;
                        int var35 = class198.field3101[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            byte var36 = -1;
                            class136.field2034[var33] = var35;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label3879;
                                }
                                class85.field1345[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var496 == 45) {
                        int var38 = var9[var8];
                        var6--;
                        int var39 = class198.field3101[var6];
                        if (var39 >= 0 && var39 < class136.field2034[var38]) {
                            class198.field3101[var6++] = class85.field1345[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var496 == 46) {
                        var6 -= 2;
                        int var40 = var9[var8];
                        int var41 = class198.field3101[var6];
                        if (var41 >= 0 && var41 < class136.field2034[var40]) {
                            class85.field1345[var40][var41] = class198.field3101[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var496 == 47) {
                        String var42 = class31.field415[var9[var8]];
                        if (var42 == null) {
                            var42 = "null";
                        }
                        class201.field3144[var7++] = var42;
                        continue;
                    }
                    if (var496 == 48) {
                        int var43 = var9[var8];
                        var7--;
                        class31.field415[var43] = class201.field3144[var7];
                        class207.method1408(var43, arg2 - 2);
                        continue;
                    }
                    if (var496 == 51) {
                        class100 var44 = var5.field4524[var9[var8]];
                        var6--;
                        class179 var45 = (class179) var44.method665((byte) -89, (long) class198.field3101[var6]);
                        if (var45 != null) {
                            var8 += var45.field2791;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var9[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var496 < 300) {
                    if (var496 == 100) {
                        var6 -= 3;
                        int var476 = class198.field3101[var6];
                        int var477 = class198.field3101[var6 + 1];
                        int var478 = class198.field3101[var6 + 2];
                        if (var477 == 0) {
                            throw new RuntimeException();
                        }
                        class214 var479 = class206.method1403((byte) 7, var476);
                        if (var479.field3357 == null) {
                            var479.field3357 = new class214[var478 + 1];
                        }
                        if (var479.field3357.length <= var478) {
                            class214[] var480 = new class214[var478 + 1];
                            for (int var481 = 0; var481 < var479.field3357.length; var481++) {
                                var480[var481] = var479.field3357[var481];
                            }
                            var479.field3357 = var480;
                        }
                        if (var478 > 0 && var479.field3357[var478 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var478 - 1));
                        }
                        class214 var482 = new class214();
                        var482.field3447 = var477;
                        var482.field3477 = var482.field3474 = var479.field3474;
                        var482.field3360 = true;
                        var482.field3471 = var478;
                        var479.field3357[var478] = var482;
                        if (var46) {
                            class118.field1739 = var482;
                        } else {
                            class118.field1736 = var482;
                        }
                        class55.method397(arg2 - 2, var479);
                        continue;
                    }
                    if (var496 == 101) {
                        class214 var483 = var46 ? class118.field1739 : class118.field1736;
                        if (var483.field3471 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class214 var484 = class206.method1403((byte) 7, var483.field3474);
                        var484.field3357[var483.field3471] = null;
                        class55.method397(arg2 ^ 0x2, var484);
                        continue;
                    }
                    if (var496 == 102) {
                        var6--;
                        class214 var485 = class206.method1403((byte) 7, class198.field3101[var6]);
                        var485.field3357 = null;
                        class55.method397(0, var485);
                        continue;
                    }
                    if (var496 == 200) {
                        var6 -= 2;
                        int var486 = class198.field3101[var6 + 1];
                        int var487 = class198.field3101[var6];
                        class214 var488 = class136.method918(var486, -21154, var487);
                        if (var488 != null && var486 != -1) {
                            class198.field3101[var6++] = 1;
                            if (var46) {
                                class118.field1739 = var488;
                            } else {
                                class118.field1736 = var488;
                            }
                            continue;
                        }
                        class198.field3101[var6++] = 0;
                        continue;
                    }
                    if (var496 == 201) {
                        var6--;
                        int var489 = class198.field3101[var6];
                        class214 var490 = class206.method1403((byte) 7, var489);
                        if (var490 == null) {
                            class198.field3101[var6++] = 0;
                        } else {
                            class198.field3101[var6++] = 1;
                            if (var46) {
                                class118.field1739 = var490;
                            } else {
                                class118.field1736 = var490;
                            }
                        }
                        continue;
                    }
                } else if (var496 < 500) {
                    if (var496 == 403) {
                        var6 -= 2;
                        int var469 = class198.field3101[var6];
                        int var470 = class198.field3101[var6 + 1];
                        for (int var471 = 0; var471 < class68.field961.length; var471++) {
                            if (class68.field961[var471] == var469) {
                                class149.field2227.field2941.method1676((byte) -99, var470, var471);
                                continue label3879;
                            }
                        }
                        int var472 = 0;
                        while (true) {
                            if (class215.field3514.length <= var472) {
                                continue label3879;
                            }
                            if (class215.field3514[var472] == var469) {
                                class149.field2227.field2941.method1676((byte) -64, var470, var472);
                                continue label3879;
                            }
                            var472++;
                        }
                    }
                    if (var496 == 404) {
                        var6 -= 2;
                        int var473 = class198.field3101[var6];
                        int var474 = class198.field3101[var6 + 1];
                        class149.field2227.field2941.method1675(var473, var474, 1073741823);
                        continue;
                    }
                    if (var496 == 410) {
                        var6--;
                        boolean var475 = class198.field3101[var6] != 0;
                        class149.field2227.field2941.method1681((byte) 127, var475);
                        continue;
                    }
                } else if (!(var496 < 1000 || var496 >= 1100) || !(var496 < 2000 || var496 >= 2100)) {
                    class214 var47;
                    if (var496 >= 2000) {
                        var6--;
                        var47 = class206.method1403((byte) 7, class198.field3101[var6]);
                        var496 -= 1000;
                    } else {
                        var47 = var46 ? class118.field1739 : class118.field1736;
                    }
                    if (var496 == 1000) {
                        var6 -= 4;
                        var47.field3469 = class198.field3101[var6];
                        var47.field3452 = class198.field3101[var6 + 1];
                        int var48 = class198.field3101[var6 + 3];
                        if (var48 < 0) {
                            var48 = 0;
                        } else if (var48 > 5) {
                            var48 = 5;
                        }
                        int var49 = class198.field3101[var6 + 2];
                        var47.field3479 = (byte) var48;
                        if (var49 < 0) {
                            var49 = 0;
                        } else if (var49 > 5) {
                            var49 = 5;
                        }
                        var47.field3388 = (byte) var49;
                        class55.method397(0, var47);
                        class274.method1850((byte) -46, var47);
                        if (var47.field3471 == -1) {
                            class187.method1301(var47.field3474, (byte) -122);
                        }
                        continue;
                    }
                    if (var496 == 1001) {
                        var6 -= 4;
                        var47.field3426 = class198.field3101[var6];
                        var47.field3486 = class198.field3101[var6 + 1];
                        var47.field3497 = 0;
                        var47.field3434 = 0;
                        int var50 = class198.field3101[var6 + 3];
                        if (var50 < 0) {
                            var50 = 0;
                        } else if (var50 > 4) {
                            var50 = 4;
                        }
                        int var51 = class198.field3101[var6 + 2];
                        if (var51 < 0) {
                            var51 = 0;
                        } else if (var51 > 4) {
                            var51 = 4;
                        }
                        var47.field3468 = (byte) var51;
                        var47.field3363 = (byte) var50;
                        class55.method397(arg2 ^ 0x2, var47);
                        class274.method1850((byte) 73, var47);
                        if (var47.field3447 == 0) {
                            class54.method391((byte) 51, false, var47);
                        }
                        continue;
                    }
                    if (var496 == 1003) {
                        var6--;
                        boolean var52 = class198.field3101[var6] == 1;
                        if (var52 != var47.field3358) {
                            var47.field3358 = var52;
                            class55.method397(0, var47);
                        }
                        if (var47.field3471 == -1) {
                            class154.method1023(126, var47.field3474);
                        }
                        continue;
                    }
                    if (var496 == 1004) {
                        var6 -= 2;
                        var47.field3454 = class198.field3101[var6];
                        var47.field3500 = class198.field3101[var6 + 1];
                        class55.method397(arg2 ^ 0x2, var47);
                        class274.method1850((byte) -80, var47);
                        if (var47.field3447 == 0) {
                            class54.method391((byte) 56, false, var47);
                        }
                        continue;
                    }
                    if (var496 == 1005) {
                        var6--;
                        var47.field3335 = class198.field3101[var6] == 1;
                        continue;
                    }
                } else if (!(var496 < 1100 || var496 >= 1200) || !(var496 < 2100 || var496 >= 2200)) {
                    class214 var53;
                    if (var496 < 2000) {
                        var53 = var46 ? class118.field1739 : class118.field1736;
                    } else {
                        var6--;
                        var53 = class206.method1403((byte) 7, class198.field3101[var6]);
                        var496 -= 1000;
                    }
                    if (var496 == 1100) {
                        var6 -= 2;
                        var53.field3448 = class198.field3101[var6];
                        if (var53.field3490 - var53.field3473 < var53.field3448) {
                            var53.field3448 = var53.field3490 - var53.field3473;
                        }
                        if (var53.field3448 < 0) {
                            var53.field3448 = 0;
                        }
                        var53.field3455 = class198.field3101[var6 + 1];
                        if ((var53.field3378 - var53.field3369) < var53.field3455) {
                            var53.field3455 = var53.field3378 - var53.field3369;
                        }
                        if (var53.field3455 < 0) {
                            var53.field3455 = 0;
                        }
                        class55.method397(0, var53);
                        if (var53.field3471 == -1) {
                            class248.method1666(9613, var53.field3474);
                        }
                        continue;
                    }
                    if (var496 == 1101) {
                        var6--;
                        var53.field3374 = class198.field3101[var6];
                        class55.method397(0, var53);
                        if (var53.field3471 == -1) {
                            class69.method472((byte) -116, var53.field3474);
                        }
                        continue;
                    }
                    if (var496 == 1102) {
                        var6--;
                        var53.field3424 = class198.field3101[var6] == 1;
                        class55.method397(0, var53);
                        continue;
                    }
                    if (var496 == 1103) {
                        var6--;
                        var53.field3401 = class198.field3101[var6];
                        class55.method397(0, var53);
                        continue;
                    }
                    if (var496 == 1104) {
                        var6--;
                        var53.field3391 = class198.field3101[var6];
                        class55.method397(arg2 ^ 0x2, var53);
                        continue;
                    }
                    if (var496 == 1105) {
                        var6--;
                        var53.field3362 = class198.field3101[var6];
                        class55.method397(0, var53);
                        continue;
                    }
                    if (var496 == 1106) {
                        var6--;
                        var53.field3440 = class198.field3101[var6];
                        class55.method397(0, var53);
                        continue;
                    }
                    if (var496 == 1107) {
                        var6--;
                        var53.field3393 = class198.field3101[var6] == 1;
                        class55.method397(0, var53);
                        continue;
                    }
                    if (var496 == 1108) {
                        var53.field3404 = 1;
                        var6--;
                        var53.field3366 = class198.field3101[var6];
                        class55.method397(0, var53);
                        if (var53.field3471 == -1) {
                            class19.method132((byte) -109, var53.field3474);
                        }
                        continue;
                    }
                    if (var496 == 1109) {
                        var6 -= 6;
                        var53.field3406 = class198.field3101[var6];
                        var53.field3427 = class198.field3101[var6 + 1];
                        var53.field3400 = class198.field3101[var6 + 2];
                        var53.field3442 = class198.field3101[var6 + 3];
                        var53.field3387 = class198.field3101[var6 + 4];
                        var53.field3483 = class198.field3101[var6 + 5];
                        class55.method397(0, var53);
                        if (var53.field3471 == -1) {
                            class44.method337(var53.field3474, (byte) 84);
                            class163.method1124(var53.field3474, arg2 ^ 0x50);
                        }
                        continue;
                    }
                    if (var496 == 1110) {
                        var6--;
                        int var54 = class198.field3101[var6];
                        if (var53.field3501 != var54) {
                            var53.field3376 = 0;
                            var53.field3408 = 0;
                            var53.field3501 = var54;
                            var53.field3498 = 1;
                            class55.method397(0, var53);
                        }
                        if (var53.field3471 == -1) {
                            class65.method447(-120, var53.field3474);
                        }
                        continue;
                    }
                    if (var496 == 1111) {
                        var6--;
                        var53.field3413 = class198.field3101[var6] == 1;
                        class55.method397(arg2 ^ 0x2, var53);
                        continue;
                    }
                    if (var496 == 1112) {
                        var7--;
                        String var55 = class201.field3144[var7];
                        if (!var55.equals(var53.field3343)) {
                            var53.field3343 = var55;
                            class55.method397(0, var53);
                        }
                        if (var53.field3471 == -1) {
                            class262.method1796(12164, var53.field3474);
                        }
                        continue;
                    }
                    if (var496 == 1113) {
                        var6--;
                        var53.field3386 = class198.field3101[var6];
                        class55.method397(arg2 ^ 0x2, var53);
                        continue;
                    }
                    if (var496 == 1114) {
                        var6 -= 3;
                        var53.field3458 = class198.field3101[var6];
                        var53.field3332 = class198.field3101[var6 + 1];
                        var53.field3365 = class198.field3101[var6 + 2];
                        class55.method397(0, var53);
                        continue;
                    }
                    if (var496 == 1115) {
                        var6--;
                        var53.field3493 = class198.field3101[var6] == 1;
                        class55.method397(0, var53);
                        continue;
                    }
                    if (var496 == 1116) {
                        var6--;
                        var53.field3472 = class198.field3101[var6];
                        class55.method397(arg2 ^ 0x2, var53);
                        continue;
                    }
                    if (var496 == 1117) {
                        var6--;
                        var53.field3443 = class198.field3101[var6];
                        class55.method397(0, var53);
                        continue;
                    }
                    if (var496 == 1118) {
                        var6--;
                        var53.field3375 = class198.field3101[var6] == 1;
                        class55.method397(0, var53);
                        continue;
                    }
                    if (var496 == 1119) {
                        var6--;
                        var53.field3399 = class198.field3101[var6] == 1;
                        class55.method397(0, var53);
                        continue;
                    }
                    if (var496 == 1120) {
                        var6 -= 2;
                        var53.field3490 = class198.field3101[var6];
                        var53.field3378 = class198.field3101[var6 + 1];
                        class55.method397(0, var53);
                        if (var53.field3447 == 0) {
                            class54.method391((byte) 58, false, var53);
                        }
                        continue;
                    }
                    if (var496 == 1121) {
                        var6 -= 2;
                        class55.method397(0, var53);
                        continue;
                    }
                    if (var496 == 1122) {
                        var6--;
                        var53.field3364 = class198.field3101[var6] == 1;
                        class55.method397(0, var53);
                        continue;
                    }
                    if (var496 == 1123) {
                        var6--;
                        var53.field3483 = class198.field3101[var6];
                        class55.method397(0, var53);
                        if (var53.field3471 == -1) {
                            class44.method337(var53.field3474, (byte) 84);
                        }
                        continue;
                    }
                } else if (var496 >= 1200 && var496 < 1300 || var496 >= 2200 && var496 < 2300) {
                    class214 var465;
                    if (var496 >= 2000) {
                        var6--;
                        var465 = class206.method1403((byte) 7, class198.field3101[var6]);
                        var496 -= 1000;
                    } else {
                        var465 = var46 ? class118.field1739 : class118.field1736;
                    }
                    class55.method397(0, var465);
                    if (var496 == 1200 || var496 == 1205) {
                        var6 -= 2;
                        int var466 = class198.field3101[var6];
                        int var467 = class198.field3101[var6 + 1];
                        if (var465.field3471 == -1) {
                            class67.method456(false, var465.field3474);
                            class44.method337(var465.field3474, (byte) 84);
                            class163.method1124(var465.field3474, 41);
                        }
                        if (var466 == -1) {
                            var465.field3366 = -1;
                            var465.field3491 = -1;
                            var465.field3404 = 1;
                        } else {
                            var465.field3491 = var466;
                            var465.field3398 = var467;
                            class253 var468 = class162.method1112(var466, (byte) 100);
                            var465.field3400 = var468.field4052;
                            var465.field3483 = var468.field4049;
                            var465.field3406 = var468.field4076;
                            var465.field3387 = var468.field4039;
                            var465.field3442 = var468.field4075;
                            if (var496 == 1205) {
                                var465.field3464 = false;
                            } else {
                                var465.field3464 = true;
                            }
                            var465.field3427 = var468.field4056;
                            if (var465.field3497 > 0) {
                                var465.field3483 = var465.field3483 * 32 / var465.field3497;
                            } else if (var465.field3426 > 0) {
                                var465.field3483 = var465.field3483 * 32 / var465.field3426;
                            }
                        }
                        continue;
                    }
                    if (var496 == 1201) {
                        var465.field3404 = 2;
                        var6--;
                        var465.field3366 = class198.field3101[var6];
                        if (var465.field3471 == -1) {
                            class19.method132((byte) -122, var465.field3474);
                        }
                        continue;
                    }
                    if (var496 == 1202) {
                        var465.field3404 = 3;
                        var465.field3366 = class149.field2227.field2941.method1674(2014);
                        if (var465.field3471 == -1) {
                            class19.method132((byte) -84, var465.field3474);
                        }
                        continue;
                    }
                    if (var496 == 1203) {
                        var465.field3404 = 6;
                        var6--;
                        var465.field3366 = class198.field3101[var6];
                        if (var465.field3471 == -1) {
                            class19.method132((byte) -128, var465.field3474);
                        }
                        continue;
                    }
                    if (var496 == 1204) {
                        var465.field3404 = 5;
                        var6--;
                        var465.field3366 = class198.field3101[var6];
                        if (var465.field3471 == -1) {
                            class19.method132((byte) -89, var465.field3474);
                        }
                        continue;
                    }
                } else if ((var496 < 1300 || var496 >= 1400) && (var496 < 2300 || var496 >= 2400)) {
                    if (var496 >= 1400 && var496 < 1500 || var496 >= 2400 && var496 < 2500) {
                        class214 var458;
                        if (var496 < 2000) {
                            var458 = var46 ? class118.field1739 : class118.field1736;
                        } else {
                            var496 -= 1000;
                            var6--;
                            var458 = class206.method1403((byte) 7, class198.field3101[var6]);
                        }
                        var7--;
                        String var459 = class201.field3144[var7];
                        int[] var460 = null;
                        if (var459.length() > 0 && var459.charAt(var459.length() - 1) == 'Y') {
                            var6--;
                            int var461 = class198.field3101[var6];
                            if (var461 > 0) {
                                var460 = new int[var461];
                                while ((var461--) > 0) {
                                    var6--;
                                    var460[var461] = class198.field3101[var6];
                                }
                            }
                            var459 = var459.substring(0, var459.length() - 1);
                        }
                        Object[] var462 = new Object[var459.length() + 1];
                        for (int var463 = var462.length - 1; var463 >= 1; var463--) {
                            if (var459.charAt(var463 - 1) == 's') {
                                var7--;
                                var462[var463] = class201.field3144[var7];
                            } else {
                                var6--;
                                var462[var463] = Integer.valueOf(class198.field3101[var6]);
                            }
                        }
                        var6--;
                        int var464 = class198.field3101[var6];
                        if (var464 == -1) {
                            var462 = null;
                        } else {
                            var462[0] = Integer.valueOf(var464);
                        }
                        var458.field3499 = true;
                        if (var496 == 1400) {
                            var458.field3415 = var462;
                        } else if (var496 == 1401) {
                            var458.field3478 = var462;
                        } else if (var496 == 1402) {
                            var458.field3439 = var462;
                        } else if (var496 == 1403) {
                            var458.field3453 = var462;
                        } else if (var496 == 1404) {
                            var458.field3370 = var462;
                        } else if (var496 == 1405) {
                            var458.field3395 = var462;
                        } else if (var496 == 1406) {
                            var458.field3333 = var462;
                        } else if (var496 == 1407) {
                            var458.field3432 = var462;
                            var458.field3359 = var460;
                        } else if (var496 == 1408) {
                            var458.field3462 = var462;
                        } else if (var496 == 1409) {
                            var458.field3446 = var462;
                        } else if (var496 == 1410) {
                            var458.field3456 = var462;
                        } else if (var496 == 1411) {
                            var458.field3351 = var462;
                        } else if (var496 == 1412) {
                            var458.field3430 = var462;
                        } else if (var496 == 1414) {
                            var458.field3414 = var462;
                            var458.field3457 = var460;
                        } else if (var496 == 1415) {
                            var458.field3435 = var462;
                            var458.field3459 = var460;
                        } else if (var496 == 1416) {
                            var458.field3470 = var462;
                        } else if (var496 == 1417) {
                            var458.field3331 = var462;
                        } else if (var496 == 1418) {
                            var458.field3342 = var462;
                        } else if (var496 == 1419) {
                            var458.field3487 = var462;
                        } else if (var496 == 1420) {
                            var458.field3420 = var462;
                        } else if (var496 == 1421) {
                            var458.field3463 = var462;
                        } else if (var496 == 1422) {
                            var458.field3377 = var462;
                        } else if (var496 == 1423) {
                            var458.field3449 = var462;
                        } else if (var496 == 1424) {
                            var458.field3352 = var462;
                        } else if (var496 == 1425) {
                            var458.field3353 = var462;
                        } else if (var496 == 1426) {
                            var458.field3488 = var462;
                        } else if (var496 == 1427) {
                            var458.field3428 = var462;
                        } else if (var496 == 1428) {
                            var458.field3480 = var462;
                            var458.field3444 = var460;
                        } else if (var496 == 1429) {
                            var458.field3397 = var460;
                            var458.field3372 = var462;
                        }
                        continue;
                    }
                    if (var496 < 1600) {
                        class214 var457 = var46 ? class118.field1739 : class118.field1736;
                        if (var496 == 1500) {
                            class198.field3101[var6++] = var457.field3373;
                            continue;
                        }
                        if (var496 == 1501) {
                            class198.field3101[var6++] = var457.field3418;
                            continue;
                        }
                        if (var496 == 1502) {
                            class198.field3101[var6++] = var457.field3473;
                            continue;
                        }
                        if (var496 == 1503) {
                            class198.field3101[var6++] = var457.field3369;
                            continue;
                        }
                        if (var496 == 1504) {
                            class198.field3101[var6++] = var457.field3358 ? 1 : 0;
                            continue;
                        }
                        if (var496 == 1505) {
                            class198.field3101[var6++] = var457.field3477;
                            continue;
                        }
                    } else if (var496 < 1700) {
                        class214 var62 = var46 ? class118.field1739 : class118.field1736;
                        if (var496 == 1600) {
                            class198.field3101[var6++] = var62.field3448;
                            continue;
                        }
                        if (var496 == 1601) {
                            class198.field3101[var6++] = var62.field3455;
                            continue;
                        }
                        if (var496 == 1602) {
                            class201.field3144[var7++] = var62.field3343;
                            continue;
                        }
                        if (var496 == 1603) {
                            class198.field3101[var6++] = var62.field3490;
                            continue;
                        }
                        if (var496 == 1604) {
                            class198.field3101[var6++] = var62.field3378;
                            continue;
                        }
                        if (var496 == 1605) {
                            class198.field3101[var6++] = var62.field3483;
                            continue;
                        }
                        if (var496 == 1606) {
                            class198.field3101[var6++] = var62.field3400;
                            continue;
                        }
                        if (var496 == 1607) {
                            class198.field3101[var6++] = var62.field3387;
                            continue;
                        }
                        if (var496 == 1608) {
                            class198.field3101[var6++] = var62.field3442;
                            continue;
                        }
                        if (var496 == 1609) {
                            class198.field3101[var6++] = var62.field3401;
                            continue;
                        }
                        if (var496 == 1610) {
                            class198.field3101[var6++] = var62.field3406;
                            continue;
                        }
                        if (var496 == 1611) {
                            class198.field3101[var6++] = var62.field3427;
                            continue;
                        }
                        if (var496 == 1612) {
                            class198.field3101[var6++] = var62.field3362;
                            continue;
                        }
                    } else if (var496 < 1800) {
                        class214 var63 = var46 ? class118.field1739 : class118.field1736;
                        if (var496 == 1700) {
                            class198.field3101[var6++] = var63.field3491;
                            continue;
                        }
                        if (var496 == 1701) {
                            if (var63.field3491 == -1) {
                                class198.field3101[var6++] = 0;
                            } else {
                                class198.field3101[var6++] = var63.field3398;
                            }
                            continue;
                        }
                        if (var496 == 1702) {
                            class198.field3101[var6++] = var63.field3471;
                            continue;
                        }
                    } else if (var496 < 1900) {
                        class214 var455 = var46 ? class118.field1739 : class118.field1736;
                        if (var496 == 1800) {
                            class198.field3101[var6++] = client.method1038(var455).method492((byte) -82);
                            continue;
                        }
                        if (var496 == 1801) {
                            var6--;
                            int var456 = class198.field3101[var6];
                            int var498 = var456 - 1;
                            if (var455.field3337 != null && var498 < var455.field3337.length && var455.field3337[var498] != null) {
                                class201.field3144[var7++] = var455.field3337[var498];
                                continue;
                            }
                            class201.field3144[var7++] = "";
                            continue;
                        }
                        if (var496 == 1802) {
                            if (var455.field3460 == null) {
                                class201.field3144[var7++] = "";
                            } else {
                                class201.field3144[var7++] = var455.field3460;
                            }
                            continue;
                        }
                    } else if (var496 < 2600) {
                        var6--;
                        class214 var454 = class206.method1403((byte) 7, class198.field3101[var6]);
                        if (var496 == 2500) {
                            class198.field3101[var6++] = var454.field3373;
                            continue;
                        }
                        if (var496 == 2501) {
                            class198.field3101[var6++] = var454.field3418;
                            continue;
                        }
                        if (var496 == 2502) {
                            class198.field3101[var6++] = var454.field3473;
                            continue;
                        }
                        if (var496 == 2503) {
                            class198.field3101[var6++] = var454.field3369;
                            continue;
                        }
                        if (var496 == 2504) {
                            class198.field3101[var6++] = var454.field3358 ? 1 : 0;
                            continue;
                        }
                        if (var496 == 2505) {
                            class198.field3101[var6++] = var454.field3477;
                            continue;
                        }
                    } else if (var496 < 2700) {
                        var6--;
                        class214 var453 = class206.method1403((byte) 7, class198.field3101[var6]);
                        if (var496 == 2600) {
                            class198.field3101[var6++] = var453.field3448;
                            continue;
                        }
                        if (var496 == 2601) {
                            class198.field3101[var6++] = var453.field3455;
                            continue;
                        }
                        if (var496 == 2602) {
                            class201.field3144[var7++] = var453.field3343;
                            continue;
                        }
                        if (var496 == 2603) {
                            class198.field3101[var6++] = var453.field3490;
                            continue;
                        }
                        if (var496 == 2604) {
                            class198.field3101[var6++] = var453.field3378;
                            continue;
                        }
                        if (var496 == 2605) {
                            class198.field3101[var6++] = var453.field3483;
                            continue;
                        }
                        if (var496 == 2606) {
                            class198.field3101[var6++] = var453.field3400;
                            continue;
                        }
                        if (var496 == 2607) {
                            class198.field3101[var6++] = var453.field3387;
                            continue;
                        }
                        if (var496 == 2608) {
                            class198.field3101[var6++] = var453.field3442;
                            continue;
                        }
                        if (var496 == 2609) {
                            class198.field3101[var6++] = var453.field3401;
                            continue;
                        }
                        if (var496 == 2610) {
                            class198.field3101[var6++] = var453.field3406;
                            continue;
                        }
                        if (var496 == 2611) {
                            class198.field3101[var6++] = var453.field3427;
                            continue;
                        }
                        if (var496 == 2612) {
                            class198.field3101[var6++] = var453.field3362;
                            continue;
                        }
                    } else if (var496 < 2800) {
                        if (var496 == 2700) {
                            var6--;
                            class214 var443 = class206.method1403((byte) 7, class198.field3101[var6]);
                            class198.field3101[var6++] = var443.field3491;
                            continue;
                        }
                        if (var496 == 2701) {
                            var6--;
                            class214 var444 = class206.method1403((byte) 7, class198.field3101[var6]);
                            if (var444.field3491 == -1) {
                                class198.field3101[var6++] = 0;
                            } else {
                                class198.field3101[var6++] = var444.field3398;
                            }
                            continue;
                        }
                        if (var496 == 2702) {
                            var6--;
                            int var445 = class198.field3101[var6];
                            class35 var446 = (class35) class2.field22.method665((byte) -106, (long) var445);
                            if (var446 == null) {
                                class198.field3101[var6++] = 0;
                            } else {
                                class198.field3101[var6++] = 1;
                            }
                            continue;
                        }
                        if (var496 == 2703) {
                            var6--;
                            class214 var447 = class206.method1403((byte) 7, class198.field3101[var6]);
                            if (var447.field3357 == null) {
                                class198.field3101[var6++] = 0;
                                continue;
                            }
                            int var448 = var447.field3357.length;
                            for (int var449 = 0; var449 < var447.field3357.length; var449++) {
                                if (var447.field3357[var449] == null) {
                                    var448 = var449;
                                    break;
                                }
                            }
                            class198.field3101[var6++] = var448;
                            continue;
                        }
                        if (var496 == 2704 || var496 == 2705) {
                            var6 -= 2;
                            int var450 = class198.field3101[var6];
                            int var451 = class198.field3101[var6 + 1];
                            class35 var452 = (class35) class2.field22.method665((byte) -34, (long) var450);
                            if (var452 != null && var452.field456 == var451) {
                                class198.field3101[var6++] = 1;
                                continue;
                            }
                            class198.field3101[var6++] = 0;
                            continue;
                        }
                    } else if (var496 < 2900) {
                        var6--;
                        class214 var441 = class206.method1403((byte) 7, class198.field3101[var6]);
                        if (var496 == 2800) {
                            class198.field3101[var6++] = client.method1038(var441).method492((byte) 59);
                            continue;
                        }
                        if (var496 == 2801) {
                            var6--;
                            int var442 = class198.field3101[var6];
                            int var497 = var442 - 1;
                            if (var441.field3337 != null && var497 < var441.field3337.length && var441.field3337[var497] != null) {
                                class201.field3144[var7++] = var441.field3337[var497];
                                continue;
                            }
                            class201.field3144[var7++] = "";
                            continue;
                        }
                        if (var496 == 2802) {
                            if (var441.field3460 == null) {
                                class201.field3144[var7++] = "";
                            } else {
                                class201.field3144[var7++] = var441.field3460;
                            }
                            continue;
                        }
                    } else if (var496 < 3200) {
                        if (var496 == 3100) {
                            var7--;
                            String var64 = class201.field3144[var7];
                            class106.method693("", 0, var64, (byte) -80);
                            continue;
                        }
                        if (var496 == 3101) {
                            var6 -= 2;
                            class232.method1586(1, class198.field3101[var6 + 1], class149.field2227, class198.field3101[var6]);
                            continue;
                        }
                        if (var496 == 3103) {
                            class222.method1509(29191);
                            continue;
                        }
                        if (var496 == 3104) {
                            var7--;
                            String var65 = class201.field3144[var7];
                            class137.field2042++;
                            int var66 = 0;
                            if (class52.method383(false, var65)) {
                                var66 = class243.method1640((byte) 86, var65);
                            }
                            class13.field165.method892(126, (byte) -108);
                            class13.field165.method166(var66, -3);
                            continue;
                        }
                        if (var496 == 3105) {
                            class75.field1062++;
                            var7--;
                            String var67 = class201.field3144[var7];
                            class13.field165.method892(96, (byte) -88);
                            class13.field165.method206(-5061, class162.method1116(var67, (byte) 126));
                            continue;
                        }
                        if (var496 == 3106) {
                            class79.field1114++;
                            var7--;
                            String var68 = class201.field3144[var7];
                            class13.field165.method892(178, (byte) -50);
                            class13.field165.method184(var68.length() + 1, 113);
                            class13.field165.method199(arg2 - 2, var68);
                            continue;
                        }
                        if (var496 == 3107) {
                            var6--;
                            int var69 = class198.field3101[var6];
                            var7--;
                            String var70 = class201.field3144[var7];
                            class111.method725(var69, var70, false);
                            continue;
                        }
                        if (var496 == 3108) {
                            var6 -= 3;
                            int var71 = class198.field3101[var6];
                            int var72 = class198.field3101[var6 + 2];
                            int var73 = class198.field3101[var6 + 1];
                            class214 var74 = class206.method1403((byte) 7, var72);
                            class141.method947(var71, var74, var73, (byte) 115);
                            continue;
                        }
                        if (var496 == 3109) {
                            var6 -= 2;
                            int var75 = class198.field3101[var6];
                            int var76 = class198.field3101[var6 + 1];
                            class214 var77 = var46 ? class118.field1739 : class118.field1736;
                            class141.method947(var75, var77, var76, (byte) 115);
                            continue;
                        }
                        if (var496 == 3110) {
                            var6--;
                            int var78 = class198.field3101[var6];
                            class13.field165.method892(150, (byte) -41);
                            class245.field3916++;
                            class13.field165.method223(arg2 - 1720191290, var78);
                            continue;
                        }
                    } else if (var496 < 3300) {
                        if (var496 == 3200) {
                            var6 -= 3;
                            class87.method601(class198.field3101[var6 + 2], class198.field3101[var6], arg2 ^ 0x2, class198.field3101[var6 + 1]);
                            continue;
                        }
                        if (var496 == 3201) {
                            var6--;
                            class215.method1460((byte) 65, class198.field3101[var6]);
                            continue;
                        }
                        if (var496 == 3202) {
                            var6 -= 2;
                            class172.method1211(127, class198.field3101[var6], class198.field3101[var6 + 1]);
                            continue;
                        }
                    } else if (var496 < 3400) {
                        if (var496 == 3300) {
                            class198.field3101[var6++] = class111.field1684;
                            continue;
                        }
                        if (var496 == 3301) {
                            var6 -= 2;
                            int var79 = class198.field3101[var6];
                            int var80 = class198.field3101[var6 + 1];
                            class198.field3101[var6++] = method965(var79, var80, arg2 + 15268);
                            continue;
                        }
                        if (var496 == 3302) {
                            var6 -= 2;
                            int var81 = class198.field3101[var6];
                            int var82 = class198.field3101[var6 + 1];
                            class198.field3101[var6++] = class52.method384((byte) 75, var82, var81);
                            continue;
                        }
                        if (var496 == 3303) {
                            var6 -= 2;
                            int var83 = class198.field3101[var6];
                            int var84 = class198.field3101[var6 + 1];
                            class198.field3101[var6++] = class38.method301(var83, var84, 21603);
                            continue;
                        }
                        if (var496 == 3304) {
                            var6--;
                            int var85 = class198.field3101[var6];
                            class198.field3101[var6++] = class157.method1062(5, var85).field3761;
                            continue;
                        }
                        if (var496 == 3305) {
                            var6--;
                            int var86 = class198.field3101[var6];
                            class198.field3101[var6++] = class124.field1853[var86];
                            continue;
                        }
                        if (var496 == 3306) {
                            var6--;
                            int var87 = class198.field3101[var6];
                            class198.field3101[var6++] = class135.field1963[var87];
                            continue;
                        }
                        if (var496 == 3307) {
                            var6--;
                            int var88 = class198.field3101[var6];
                            class198.field3101[var6++] = class17.field208[var88];
                            continue;
                        }
                        if (var496 == 3308) {
                            int var89 = class276.field4398;
                            int var90 = (class149.field2227.field1226 >> 7) + class126.field1869;
                            int var91 = (class149.field2227.field1273 >> 7) + class246.field3943;
                            class198.field3101[var6++] = (var89 << 28) + (var90 << 14) + var91;
                            continue;
                        }
                        if (var496 == 3309) {
                            var6--;
                            int var92 = class198.field3101[var6];
                            class198.field3101[var6++] = class224.method1526(var92 >> 14, 16383);
                            continue;
                        }
                        if (var496 == 3310) {
                            var6--;
                            int var93 = class198.field3101[var6];
                            class198.field3101[var6++] = var93 >> 28;
                            continue;
                        }
                        if (var496 == 3311) {
                            var6--;
                            int var94 = class198.field3101[var6];
                            class198.field3101[var6++] = class224.method1526(var94, 16383);
                            continue;
                        }
                        if (var496 == 3312) {
                            class198.field3101[var6++] = class257.field4155 ? 1 : 0;
                            continue;
                        }
                        if (var496 == 3313) {
                            var6 -= 2;
                            int var95 = class198.field3101[var6] + 32768;
                            int var96 = class198.field3101[var6 + 1];
                            class198.field3101[var6++] = method965(var95, var96, 15270);
                            continue;
                        }
                        if (var496 == 3314) {
                            var6 -= 2;
                            int var97 = class198.field3101[var6 + 1];
                            int var98 = class198.field3101[var6] + 32768;
                            class198.field3101[var6++] = class52.method384((byte) 75, var97, var98);
                            continue;
                        }
                        if (var496 == 3315) {
                            var6 -= 2;
                            int var99 = class198.field3101[var6 + 1];
                            int var100 = class198.field3101[var6] + 32768;
                            class198.field3101[var6++] = class38.method301(var100, var99, arg2 + 21601);
                            continue;
                        }
                        if (var496 == 3316) {
                            if (class280.field4438 < 2) {
                                class198.field3101[var6++] = 0;
                            } else {
                                class198.field3101[var6++] = class280.field4438;
                            }
                            continue;
                        }
                        if (var496 == 3317) {
                            class198.field3101[var6++] = class215.field3510;
                            continue;
                        }
                        if (var496 == 3318) {
                            class198.field3101[var6++] = class30.field402;
                            continue;
                        }
                        if (var496 == 3321) {
                            class198.field3101[var6++] = class35.field447;
                            continue;
                        }
                        if (var496 == 3322) {
                            class198.field3101[var6++] = class52.field723;
                            continue;
                        }
                        if (var496 == 3323) {
                            if (class11.field149 >= 5 && class11.field149 <= 9) {
                                class198.field3101[var6++] = 1;
                                continue;
                            }
                            class198.field3101[var6++] = 0;
                            continue;
                        }
                        if (var496 == 3324) {
                            if (class11.field149 >= 5 && class11.field149 <= 9) {
                                class198.field3101[var6++] = class11.field149;
                                continue;
                            }
                            class198.field3101[var6++] = 0;
                            continue;
                        }
                        if (var496 == 3325) {
                            class198.field3101[var6++] = class237.field3794 ? 1 : 0;
                            continue;
                        }
                        if (var496 == 3326) {
                            class198.field3101[var6++] = class149.field2227.field2917;
                            continue;
                        }
                        if (var496 == 3327) {
                            class198.field3101[var6++] = class149.field2227.field2941.field3972 ? 1 : 0;
                            continue;
                        }
                        if (var496 == 3328) {
                            class198.field3101[var6++] = class172.field2700 && !class121.field1763 ? 1 : 0;
                            continue;
                        }
                        if (var496 == 3329) {
                            class198.field3101[var6++] = class50.field666 ? 1 : 0;
                            continue;
                        }
                        if (var496 == 3330) {
                            var6--;
                            int var101 = class198.field3101[var6];
                            class198.field3101[var6++] = class34.method271(var101, (byte) 2);
                            continue;
                        }
                        if (var496 == 3331) {
                            var6 -= 2;
                            int var102 = class198.field3101[var6];
                            int var103 = class198.field3101[var6 + 1];
                            class198.field3101[var6++] = class222.method1511(32290, false, var102, var103);
                            continue;
                        }
                        if (var496 == 3332) {
                            var6 -= 2;
                            int var104 = class198.field3101[var6];
                            int var105 = class198.field3101[var6 + 1];
                            class198.field3101[var6++] = class222.method1511(32290, true, var104, var105);
                            continue;
                        }
                        if (var496 == 3333) {
                            class198.field3101[var6++] = class57.field806;
                            continue;
                        }
                        if (var496 == 3335) {
                            class198.field3101[var6++] = class48.field614;
                            continue;
                        }
                        if (var496 == 3336) {
                            var6 -= 4;
                            int var106 = class198.field3101[var6];
                            int var107 = class198.field3101[var6 + 1];
                            int var108 = class198.field3101[var6 + 3];
                            int var109 = class198.field3101[var6 + 2];
                            int var110 = (var107 << 14) + var106;
                            int var111 = (var109 << 28) + var110;
                            int var112 = var108 + var111;
                            class198.field3101[var6++] = var112;
                            continue;
                        }
                        if (var496 == 3337) {
                            class198.field3101[var6++] = class266.field4268;
                            continue;
                        }
                    } else if (var496 < 3500) {
                        if (var496 == 3400) {
                            var6 -= 2;
                            int var113 = class198.field3101[var6];
                            int var114 = class198.field3101[var6 + 1];
                            class283 var115 = class30.method241(112, var113);
                            class201.field3144[var7++] = var115.method1888(var114, false);
                            continue;
                        }
                        if (var496 == 3408) {
                            var6 -= 4;
                            int var116 = class198.field3101[var6 + 1];
                            int var117 = class198.field3101[var6];
                            int var118 = class198.field3101[var6 + 2];
                            int var119 = class198.field3101[var6 + 3];
                            class283 var120 = class30.method241(30, var118);
                            if (var120.field4484 == var117 && var120.field4482 == var116) {
                                if (var116 == 115) {
                                    class201.field3144[var7++] = var120.method1888(var119, false);
                                } else {
                                    class198.field3101[var6++] = var120.method1892(true, var119);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var496 == 3409) {
                            var6 -= 3;
                            int var121 = class198.field3101[var6];
                            int var122 = class198.field3101[var6 + 1];
                            int var123 = class198.field3101[var6 + 2];
                            if (var122 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class283 var124 = class30.method241(20, var122);
                            if (var124.field4482 != var121) {
                                throw new RuntimeException("C3409-1");
                            }
                            class198.field3101[var6++] = var124.method1890(var123, (byte) -33) ? 1 : 0;
                            continue;
                        }
                        if (var496 == 3410) {
                            var6--;
                            int var125 = class198.field3101[var6];
                            var7--;
                            String var126 = class201.field3144[var7];
                            if (var125 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class283 var127 = class30.method241(89, var125);
                            if (var127.field4482 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class198.field3101[var6++] = var127.method1886(arg2, var126) ? 1 : 0;
                            continue;
                        }
                        if (var496 == 3411) {
                            var6--;
                            int var128 = class198.field3101[var6];
                            class283 var129 = class30.method241(26, var128);
                            class198.field3101[var6++] = var129.field4477.method668((byte) -128);
                            continue;
                        }
                    } else if (var496 < 3700) {
                        if (var496 == 3600) {
                            if (class91.field1389 == 0) {
                                class198.field3101[var6++] = -2;
                            } else if (class91.field1389 == 1) {
                                class198.field3101[var6++] = -1;
                            } else {
                                class198.field3101[var6++] = class228.field3692;
                            }
                            continue;
                        }
                        if (var496 == 3601) {
                            var6--;
                            int var130 = class198.field3101[var6];
                            if (class91.field1389 == 2 && class228.field3692 > var130) {
                                class201.field3144[var7++] = class94.field1464[var130];
                                continue;
                            }
                            class201.field3144[var7++] = "";
                            continue;
                        }
                        if (var496 == 3602) {
                            var6--;
                            int var131 = class198.field3101[var6];
                            if (class91.field1389 == 2 && var131 < class228.field3692) {
                                class198.field3101[var6++] = class143.field2096[var131];
                                continue;
                            }
                            class198.field3101[var6++] = 0;
                            continue;
                        }
                        if (var496 == 3603) {
                            var6--;
                            int var132 = class198.field3101[var6];
                            if (class91.field1389 == 2 && class228.field3692 > var132) {
                                class198.field3101[var6++] = class7.field104[var132];
                                continue;
                            }
                            class198.field3101[var6++] = 0;
                            continue;
                        }
                        if (var496 == 3604) {
                            var7--;
                            String var133 = class201.field3144[var7];
                            var6--;
                            int var134 = class198.field3101[var6];
                            class257.method1766(var134, (byte) -128, var133);
                            continue;
                        }
                        if (var496 == 3605) {
                            var7--;
                            String var135 = class201.field3144[var7];
                            class228.method1559(-17413, class162.method1116(var135, (byte) 101));
                            continue;
                        }
                        if (var496 == 3606) {
                            var7--;
                            String var136 = class201.field3144[var7];
                            class40.method319(class162.method1116(var136, (byte) 121), (byte) 53);
                            continue;
                        }
                        if (var496 == 3607) {
                            var7--;
                            String var137 = class201.field3144[var7];
                            class56.method413(0, class162.method1116(var137, (byte) 79));
                            continue;
                        }
                        if (var496 == 3608) {
                            var7--;
                            String var138 = class201.field3144[var7];
                            class18.method126((byte) 126, class162.method1116(var138, (byte) 70));
                            continue;
                        }
                        if (var496 == 3609) {
                            var7--;
                            String var139 = class201.field3144[var7];
                            if (var139.startsWith("<img=0>") || var139.startsWith("<img=1>")) {
                                var139 = var139.substring(7);
                            }
                            class198.field3101[var6++] = class239.method1617(var139, true) ? 1 : 0;
                            continue;
                        }
                        if (var496 == 3610) {
                            var6--;
                            int var140 = class198.field3101[var6];
                            if (class91.field1389 == 2 && var140 < class228.field3692) {
                                class201.field3144[var7++] = class190.field3013[var140];
                                continue;
                            }
                            class201.field3144[var7++] = "";
                            continue;
                        }
                        if (var496 == 3611) {
                            if (class229.field3708 == null) {
                                class201.field3144[var7++] = "";
                            } else {
                                class201.field3144[var7++] = class154.method1020(class229.field3708, 26);
                            }
                            continue;
                        }
                        if (var496 == 3612) {
                            if (class229.field3708 == null) {
                                class198.field3101[var6++] = 0;
                            } else {
                                class198.field3101[var6++] = class172.field2693;
                            }
                            continue;
                        }
                        if (var496 == 3613) {
                            var6--;
                            int var141 = class198.field3101[var6];
                            if (class229.field3708 != null && var141 < class172.field2693) {
                                class201.field3144[var7++] = class154.method1020(client.field2329[var141].field2549, 61);
                                continue;
                            }
                            class201.field3144[var7++] = "";
                            continue;
                        }
                        if (var496 == 3614) {
                            var6--;
                            int var142 = class198.field3101[var6];
                            if (class229.field3708 != null && class172.field2693 > var142) {
                                class198.field3101[var6++] = client.field2329[var142].field2546;
                                continue;
                            }
                            class198.field3101[var6++] = 0;
                            continue;
                        }
                        if (var496 == 3615) {
                            var6--;
                            int var143 = class198.field3101[var6];
                            if (class229.field3708 != null && class172.field2693 > var143) {
                                class198.field3101[var6++] = client.field2329[var143].field2545;
                                continue;
                            }
                            class198.field3101[var6++] = 0;
                            continue;
                        }
                        if (var496 == 3616) {
                            class198.field3101[var6++] = class1.field14;
                            continue;
                        }
                        if (var496 == 3617) {
                            var7--;
                            String var144 = class201.field3144[var7];
                            class91.method614(-28158, var144);
                            continue;
                        }
                        if (var496 == 3618) {
                            class198.field3101[var6++] = class67.field943;
                            continue;
                        }
                        if (var496 == 3619) {
                            var7--;
                            String var145 = class201.field3144[var7];
                            client.method1035(0, class162.method1116(var145, (byte) 69));
                            continue;
                        }
                        if (var496 == 3620) {
                            class6.method31(arg2 + 112);
                            continue;
                        }
                        if (var496 == 3621) {
                            if (class91.field1389 == 0) {
                                class198.field3101[var6++] = -1;
                            } else {
                                class198.field3101[var6++] = class141.field2066;
                            }
                            continue;
                        }
                        if (var496 == 3622) {
                            var6--;
                            int var146 = class198.field3101[var6];
                            if (class91.field1389 != 0 && var146 < class141.field2066) {
                                class201.field3144[var7++] = class75.method510(arg2 - 8952, class46.field590[var146]);
                                continue;
                            }
                            class201.field3144[var7++] = "";
                            continue;
                        }
                        if (var496 == 3623) {
                            var7--;
                            String var147 = class201.field3144[var7];
                            if (var147.startsWith("<img=0>") || var147.startsWith("<img=1>")) {
                                var147 = var147.substring(7);
                            }
                            class198.field3101[var6++] = class286.method1906(0, var147) ? 1 : 0;
                            continue;
                        }
                        if (var496 == 3624) {
                            var6--;
                            int var148 = class198.field3101[var6];
                            if (client.field2329 != null && var148 < class172.field2693 && client.field2329[var148].field2549.equalsIgnoreCase(class149.field2227.field2912)) {
                                class198.field3101[var6++] = 1;
                                continue;
                            }
                            class198.field3101[var6++] = 0;
                            continue;
                        }
                        if (var496 == 3625) {
                            if (class249.field3998 == null) {
                                class201.field3144[var7++] = "";
                            } else {
                                class201.field3144[var7++] = class154.method1020(class249.field3998, 64);
                            }
                            continue;
                        }
                        if (var496 == 3626) {
                            var6--;
                            int var149 = class198.field3101[var6];
                            if (class229.field3708 != null && var149 < class172.field2693) {
                                class201.field3144[var7++] = client.field2329[var149].field2558;
                                continue;
                            }
                            class201.field3144[var7++] = "";
                            continue;
                        }
                        if (var496 == 3627) {
                            var6--;
                            int var150 = class198.field3101[var6];
                            if (class91.field1389 == 2 && var150 >= 0 && class228.field3692 > var150) {
                                class198.field3101[var6++] = class229.field3710[var150] ? 1 : 0;
                                continue;
                            }
                            class198.field3101[var6++] = 0;
                            continue;
                        }
                        if (var496 == 3628) {
                            var7--;
                            String var151 = class201.field3144[var7];
                            if (var151.startsWith("<img=0>") || var151.startsWith("<img=1>")) {
                                var151 = var151.substring(7);
                            }
                            class198.field3101[var6++] = class85.method584((byte) -122, var151);
                            continue;
                        }
                        if (var496 == 3629) {
                            class198.field3101[var6++] = class204.field3201;
                            continue;
                        }
                    } else if (var496 < 4000) {
                        if (var496 == 3903) {
                            var6--;
                            int var427 = class198.field3101[var6];
                            class198.field3101[var6++] = class219.field3561[var427].method1795(class128.method879(arg2, 1));
                            continue;
                        }
                        if (var496 == 3904) {
                            var6--;
                            int var428 = class198.field3101[var6];
                            class198.field3101[var6++] = class219.field3561[var428].field4242;
                            continue;
                        }
                        if (var496 == 3905) {
                            var6--;
                            int var429 = class198.field3101[var6];
                            class198.field3101[var6++] = class219.field3561[var429].field4234;
                            continue;
                        }
                        if (var496 == 3906) {
                            var6--;
                            int var430 = class198.field3101[var6];
                            class198.field3101[var6++] = class219.field3561[var430].field4224;
                            continue;
                        }
                        if (var496 == 3907) {
                            var6--;
                            int var431 = class198.field3101[var6];
                            class198.field3101[var6++] = class219.field3561[var431].field4239;
                            continue;
                        }
                        if (var496 == 3908) {
                            var6--;
                            int var432 = class198.field3101[var6];
                            class198.field3101[var6++] = class219.field3561[var432].field4241;
                            continue;
                        }
                        if (var496 == 3910) {
                            var6--;
                            int var433 = class198.field3101[var6];
                            int var434 = class219.field3561[var433].method1802(false);
                            class198.field3101[var6++] = var434 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var496 == 3911) {
                            var6--;
                            int var435 = class198.field3101[var6];
                            int var436 = class219.field3561[var435].method1802(false);
                            class198.field3101[var6++] = var436 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var496 == 3912) {
                            var6--;
                            int var437 = class198.field3101[var6];
                            int var438 = class219.field3561[var437].method1802(false);
                            class198.field3101[var6++] = var438 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var496 == 3913) {
                            var6--;
                            int var439 = class198.field3101[var6];
                            int var440 = class219.field3561[var439].method1802(false);
                            class198.field3101[var6++] = var440 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var496 < 4100) {
                        if (var496 == 4000) {
                            var6 -= 2;
                            int var152 = class198.field3101[var6 + 1];
                            int var153 = class198.field3101[var6];
                            class198.field3101[var6++] = var152 + var153;
                            continue;
                        }
                        if (var496 == 4001) {
                            var6 -= 2;
                            int var154 = class198.field3101[var6 + 1];
                            int var155 = class198.field3101[var6];
                            class198.field3101[var6++] = var155 - var154;
                            continue;
                        }
                        if (var496 == 4002) {
                            var6 -= 2;
                            int var156 = class198.field3101[var6];
                            int var157 = class198.field3101[var6 + 1];
                            class198.field3101[var6++] = var156 * var157;
                            continue;
                        }
                        if (var496 == 4003) {
                            var6 -= 2;
                            int var158 = class198.field3101[var6];
                            int var159 = class198.field3101[var6 + 1];
                            class198.field3101[var6++] = var158 / var159;
                            continue;
                        }
                        if (var496 == 4004) {
                            var6--;
                            int var160 = class198.field3101[var6];
                            class198.field3101[var6++] = (int) ((double) var160 * Math.random());
                            continue;
                        }
                        if (var496 == 4005) {
                            var6--;
                            int var161 = class198.field3101[var6];
                            class198.field3101[var6++] = (int) ((double) (var161 + 1) * Math.random());
                            continue;
                        }
                        if (var496 == 4006) {
                            var6 -= 5;
                            int var162 = class198.field3101[var6 + 1];
                            int var163 = class198.field3101[var6];
                            int var164 = class198.field3101[var6 + 3];
                            int var165 = class198.field3101[var6 + 4];
                            int var166 = class198.field3101[var6 + 2];
                            class198.field3101[var6++] = (var162 - var163) * (var165 - var166) / (var164 - var166) + var163;
                            continue;
                        }
                        if (var496 == 4007) {
                            var6 -= 2;
                            long var167 = (long) class198.field3101[var6];
                            long var169 = (long) class198.field3101[var6 + 1];
                            class198.field3101[var6++] = (int) (var167 * var169 / 100L + var167);
                            continue;
                        }
                        if (var496 == 4008) {
                            var6 -= 2;
                            int var171 = class198.field3101[var6];
                            int var172 = class198.field3101[var6 + 1];
                            class198.field3101[var6++] = class120.method787(var171, 0x1 << var172);
                            continue;
                        }
                        if (var496 == 4009) {
                            var6 -= 2;
                            int var173 = class198.field3101[var6];
                            int var174 = class198.field3101[var6 + 1];
                            class198.field3101[var6++] = class224.method1526(-(0x1 << var174) - 1, var173);
                            continue;
                        }
                        if (var496 == 4010) {
                            var6 -= 2;
                            int var175 = class198.field3101[var6];
                            int var176 = class198.field3101[var6 + 1];
                            class198.field3101[var6++] = class224.method1526(var175, 0x1 << var176) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var496 == 4011) {
                            var6 -= 2;
                            int var177 = class198.field3101[var6];
                            int var178 = class198.field3101[var6 + 1];
                            class198.field3101[var6++] = var177 % var178;
                            continue;
                        }
                        if (var496 == 4012) {
                            var6 -= 2;
                            int var179 = class198.field3101[var6 + 1];
                            int var180 = class198.field3101[var6];
                            if (var180 == 0) {
                                class198.field3101[var6++] = 0;
                            } else {
                                class198.field3101[var6++] = (int) Math.pow((double) var180, (double) var179);
                            }
                            continue;
                        }
                        if (var496 == 4013) {
                            var6 -= 2;
                            int var181 = class198.field3101[var6];
                            int var182 = class198.field3101[var6 + 1];
                            if (var181 == 0) {
                                class198.field3101[var6++] = 0;
                            } else if (var182 == 0) {
                                class198.field3101[var6++] = Integer.MAX_VALUE;
                            } else {
                                class198.field3101[var6++] = (int) Math.pow((double) var181, 1.0D / (double) var182);
                            }
                            continue;
                        }
                        if (var496 == 4014) {
                            var6 -= 2;
                            int var183 = class198.field3101[var6];
                            int var184 = class198.field3101[var6 + 1];
                            class198.field3101[var6++] = class224.method1526(var184, var183);
                            continue;
                        }
                        if (var496 == 4015) {
                            var6 -= 2;
                            int var185 = class198.field3101[var6];
                            int var186 = class198.field3101[var6 + 1];
                            class198.field3101[var6++] = class120.method787(var186, var185);
                            continue;
                        }
                        if (var496 == 4016) {
                            var6 -= 2;
                            int var187 = class198.field3101[var6];
                            int var188 = class198.field3101[var6 + 1];
                            class198.field3101[var6++] = var187 >= var188 ? var188 : var187;
                            continue;
                        }
                        if (var496 == 4017) {
                            var6 -= 2;
                            int var189 = class198.field3101[var6];
                            int var190 = class198.field3101[var6 + 1];
                            class198.field3101[var6++] = var189 > var190 ? var189 : var190;
                            continue;
                        }
                        if (var496 == 4018) {
                            var6 -= 3;
                            long var191 = (long) class198.field3101[var6];
                            long var193 = (long) class198.field3101[var6 + 1];
                            long var195 = (long) class198.field3101[var6 + 2];
                            class198.field3101[var6++] = (int) (var191 * var195 / var193);
                            continue;
                        }
                    } else if (var496 < 4200) {
                        if (var496 == 4100) {
                            var7--;
                            String var377 = class201.field3144[var7];
                            var6--;
                            int var378 = class198.field3101[var6];
                            class201.field3144[var7++] = var377 + var378;
                            continue;
                        }
                        if (var496 == 4101) {
                            var7 -= 2;
                            String var379 = class201.field3144[var7];
                            String var380 = class201.field3144[var7 + 1];
                            class201.field3144[var7++] = var379 + var380;
                            continue;
                        }
                        if (var496 == 4102) {
                            var6--;
                            int var381 = class198.field3101[var6];
                            var7--;
                            String var382 = class201.field3144[var7];
                            class201.field3144[var7++] = var382 + class178.method1238(var381, true, true);
                            continue;
                        }
                        if (var496 == 4103) {
                            var7--;
                            String var383 = class201.field3144[var7];
                            class201.field3144[var7++] = var383.toLowerCase();
                            continue;
                        }
                        if (var496 == 4104) {
                            var6--;
                            int var384 = class198.field3101[var6];
                            long var385 = ((long) var384 + 11745L) * 86400000L;
                            class157.field2416.setTime(new Date(var385));
                            int var387 = class157.field2416.get(5);
                            int var388 = class157.field2416.get(2);
                            int var389 = class157.field2416.get(1);
                            class201.field3144[var7++] = var387 + "-" + class22.field263[var388] + "-" + var389;
                            continue;
                        }
                        if (var496 == 4105) {
                            var7 -= 2;
                            String var390 = class201.field3144[var7];
                            String var391 = class201.field3144[var7 + 1];
                            if (class149.field2227.field2941 != null && class149.field2227.field2941.field3972) {
                                class201.field3144[var7++] = var391;
                                continue;
                            }
                            class201.field3144[var7++] = var390;
                            continue;
                        }
                        if (var496 == 4106) {
                            var6--;
                            int var392 = class198.field3101[var6];
                            class201.field3144[var7++] = Integer.toString(var392);
                            continue;
                        }
                        if (var496 == 4107) {
                            var7 -= 2;
                            class198.field3101[var6++] = class92.method615(258, class218.method1476(class128.method879(arg2, 3), class201.field3144[var7 + 1], class201.field3144[var7], class48.field614));
                            continue;
                        }
                        if (var496 == 4108) {
                            var6 -= 2;
                            var7--;
                            String var393 = class201.field3144[var7];
                            int var394 = class198.field3101[var6];
                            int var395 = class198.field3101[var6 + 1];
                            class198.field3101[var6++] = class155.method1031(var395, 255).method1304(var393, var394);
                            continue;
                        }
                        if (var496 == 4109) {
                            var6 -= 2;
                            var7--;
                            String var396 = class201.field3144[var7];
                            int var397 = class198.field3101[var6 + 1];
                            int var398 = class198.field3101[var6];
                            class198.field3101[var6++] = class155.method1031(var397, 255).method1305(var396, var398);
                            continue;
                        }
                        if (var496 == 4110) {
                            var7 -= 2;
                            String var399 = class201.field3144[var7];
                            String var400 = class201.field3144[var7 + 1];
                            var6--;
                            if (class198.field3101[var6] == 1) {
                                class201.field3144[var7++] = var399;
                            } else {
                                class201.field3144[var7++] = var400;
                            }
                            continue;
                        }
                        if (var496 == 4111) {
                            var7--;
                            String var401 = class201.field3144[var7];
                            class201.field3144[var7++] = class188.method1306(var401);
                            continue;
                        }
                        if (var496 == 4112) {
                            var7--;
                            String var402 = class201.field3144[var7];
                            var6--;
                            int var403 = class198.field3101[var6];
                            if (var403 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class201.field3144[var7++] = var402 + (char) var403;
                            continue;
                        }
                        if (var496 == 4113) {
                            var6--;
                            int var404 = class198.field3101[var6];
                            class198.field3101[var6++] = class254.method1713(-78, (char) var404) ? 1 : 0;
                            continue;
                        }
                        if (var496 == 4114) {
                            var6--;
                            int var405 = class198.field3101[var6];
                            class198.field3101[var6++] = class4.method19((char) var405, -21) ? 1 : 0;
                            continue;
                        }
                        if (var496 == 4115) {
                            var6--;
                            int var406 = class198.field3101[var6];
                            class198.field3101[var6++] = class30.method244(51, (char) var406) ? 1 : 0;
                            continue;
                        }
                        if (var496 == 4116) {
                            var6--;
                            int var407 = class198.field3101[var6];
                            class198.field3101[var6++] = class139.method936((char) var407, 48) ? 1 : 0;
                            continue;
                        }
                        if (var496 == 4117) {
                            var7--;
                            String var408 = class201.field3144[var7];
                            if (var408 == null) {
                                class198.field3101[var6++] = 0;
                            } else {
                                class198.field3101[var6++] = var408.length();
                            }
                            continue;
                        }
                        if (var496 == 4118) {
                            var6 -= 2;
                            var7--;
                            String var409 = class201.field3144[var7];
                            int var410 = class198.field3101[var6];
                            int var411 = class198.field3101[var6 + 1];
                            class201.field3144[var7++] = var409.substring(var410, var411);
                            continue;
                        }
                        if (var496 == 4119) {
                            var7--;
                            String var412 = class201.field3144[var7];
                            StringBuffer var413 = new StringBuffer(var412.length());
                            boolean var414 = false;
                            for (int var415 = 0; var412.length() > var415; var415++) {
                                char var416 = var412.charAt(var415);
                                if (var416 == '<') {
                                    var414 = true;
                                } else if (var416 == '>') {
                                    var414 = false;
                                } else if (!var414) {
                                    var413.append(var416);
                                }
                            }
                            class201.field3144[var7++] = var413.toString();
                            continue;
                        }
                        if (var496 == 4120) {
                            var6 -= 2;
                            int var417 = class198.field3101[var6];
                            var7--;
                            String var418 = class201.field3144[var7];
                            int var419 = class198.field3101[var6 + 1];
                            class198.field3101[var6++] = var418.indexOf(var417, var419);
                            continue;
                        }
                        if (var496 == 4121) {
                            var7 -= 2;
                            String var420 = class201.field3144[var7];
                            String var421 = class201.field3144[var7 + 1];
                            var6--;
                            int var422 = class198.field3101[var6];
                            class198.field3101[var6++] = var420.indexOf(var421, var422);
                            continue;
                        }
                        if (var496 == 4122) {
                            var6--;
                            int var423 = class198.field3101[var6];
                            class198.field3101[var6++] = Character.toLowerCase((char) var423);
                            continue;
                        }
                        if (var496 == 4123) {
                            var6--;
                            int var424 = class198.field3101[var6];
                            class198.field3101[var6++] = Character.toUpperCase((char) var424);
                            continue;
                        }
                        if (var496 == 4124) {
                            var6--;
                            boolean var425 = class198.field3101[var6] != 0;
                            var6--;
                            int var426 = class198.field3101[var6];
                            class201.field3144[var7++] = class59.method423(var425, 0, (long) var426, (byte) 105, class48.field614);
                            continue;
                        }
                    } else if (var496 < 4300) {
                        if (var496 == 4200) {
                            var6--;
                            int var197 = class198.field3101[var6];
                            class201.field3144[var7++] = class162.method1112(var197, (byte) 113).field4035;
                            continue;
                        }
                        if (var496 == 4201) {
                            var6 -= 2;
                            int var198 = class198.field3101[var6];
                            int var199 = class198.field3101[var6 + 1];
                            class253 var200 = class162.method1112(var198, (byte) 122);
                            if (var199 >= 1 && var199 <= 5 && var200.field4064[var199 - 1] != null) {
                                class201.field3144[var7++] = var200.field4064[var199 - 1];
                                continue;
                            }
                            class201.field3144[var7++] = "";
                            continue;
                        }
                        if (var496 == 4202) {
                            var6 -= 2;
                            int var201 = class198.field3101[var6];
                            int var202 = class198.field3101[var6 + 1];
                            class253 var203 = class162.method1112(var201, (byte) 105);
                            if (var202 >= 1 && var202 <= 5 && var203.field4084[var202 - 1] != null) {
                                class201.field3144[var7++] = var203.field4084[var202 - 1];
                                continue;
                            }
                            class201.field3144[var7++] = "";
                            continue;
                        }
                        if (var496 == 4203) {
                            var6--;
                            int var204 = class198.field3101[var6];
                            class198.field3101[var6++] = class162.method1112(var204, (byte) 107).field4068;
                            continue;
                        }
                        if (var496 == 4204) {
                            var6--;
                            int var205 = class198.field3101[var6];
                            class198.field3101[var6++] = class162.method1112(var205, (byte) 90).field4072 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var496 == 4205) {
                            var6--;
                            int var206 = class198.field3101[var6];
                            class253 var207 = class162.method1112(var206, (byte) 101);
                            if (var207.field4032 == -1 && var207.field4091 >= 0) {
                                class198.field3101[var6++] = var207.field4091;
                                continue;
                            }
                            class198.field3101[var6++] = var206;
                            continue;
                        }
                        if (var496 == 4206) {
                            var6--;
                            int var208 = class198.field3101[var6];
                            class253 var209 = class162.method1112(var208, (byte) 110);
                            if (var209.field4032 >= 0 && var209.field4091 >= 0) {
                                class198.field3101[var6++] = var209.field4091;
                                continue;
                            }
                            class198.field3101[var6++] = var208;
                            continue;
                        }
                        if (var496 == 4207) {
                            var6--;
                            int var210 = class198.field3101[var6];
                            class198.field3101[var6++] = class162.method1112(var210, (byte) 117).field4044 ? 1 : 0;
                            continue;
                        }
                        if (var496 == 4208) {
                            var6 -= 2;
                            int var211 = class198.field3101[var6];
                            int var212 = class198.field3101[var6 + 1];
                            class110 var213 = class222.method1512(-2, var212);
                            if (var213.method718(arg2 - 12879)) {
                                class201.field3144[var7++] = class162.method1112(var211, (byte) 108).method1692(var213.field1677, var212, (byte) 115);
                            } else {
                                class198.field3101[var6++] = class162.method1112(var211, (byte) 95).method1693(var212, var213.field1667, 0);
                            }
                            continue;
                        }
                        if (var496 == 4210) {
                            var7--;
                            String var214 = class201.field3144[var7];
                            var6--;
                            int var215 = class198.field3101[var6];
                            class36.method285(var215 == 1, var214, true);
                            class198.field3101[var6++] = class93.field1448;
                            continue;
                        }
                        if (var496 == 4211) {
                            if (class86.field1363 != null && class149.field2226 < class93.field1448) {
                                class198.field3101[var6++] = class224.method1526(class86.field1363[class149.field2226++], 65535);
                                continue;
                            }
                            class198.field3101[var6++] = -1;
                            continue;
                        }
                        if (var496 == 4212) {
                            class149.field2226 = 0;
                            continue;
                        }
                    } else if (var496 < 4400) {
                        if (var496 == 4300) {
                            var6 -= 2;
                            int var216 = class198.field3101[var6];
                            int var217 = class198.field3101[var6 + 1];
                            class110 var218 = class222.method1512(arg2 - 4, var217);
                            if (var218.method718(-12877)) {
                                class201.field3144[var7++] = class252.method1691(var216, (byte) -34).method927(var218.field1677, var217, (byte) 113);
                            } else {
                                class198.field3101[var6++] = class252.method1691(var216, (byte) 124).method923((byte) 0, var217, var218.field1667);
                            }
                            continue;
                        }
                    } else if (var496 >= 4500) {
                        if (var496 < 4600) {
                            if (var496 == 4500) {
                                var6 -= 2;
                                int var219 = class198.field3101[var6];
                                int var220 = class198.field3101[var6 + 1];
                                class110 var221 = class222.method1512(-2, var220);
                                if (var221.method718(-12877)) {
                                    class201.field3144[var7++] = class31.method250(-19333, var219).method1437(var220, var221.field1677, true);
                                } else {
                                    class198.field3101[var6++] = class31.method250(-19333, var219).method1435((byte) 123, var220, var221.field1667);
                                }
                                continue;
                            }
                        } else if (var496 < 5100) {
                            if (var496 == 5000) {
                                class198.field3101[var6++] = class232.field3732;
                                continue;
                            }
                            if (var496 == 5001) {
                                var6 -= 3;
                                class63.field864++;
                                class232.field3732 = class198.field3101[var6];
                                class271.field4316 = class198.field3101[var6 + 1];
                                class39.field539 = class198.field3101[var6 + 2];
                                class13.field165.method892(34, (byte) -68);
                                class13.field165.method184(class232.field3732, 111);
                                class13.field165.method184(class271.field4316, arg2 + 119);
                                class13.field165.method184(class39.field539, 115);
                                continue;
                            }
                            if (var496 == 5002) {
                                var7--;
                                String var309 = class201.field3144[var7];
                                class173.field2710++;
                                var6 -= 2;
                                int var310 = class198.field3101[var6];
                                int var311 = class198.field3101[var6 + 1];
                                class13.field165.method892(167, (byte) -119);
                                class13.field165.method206(-5061, class162.method1116(var309, (byte) 78));
                                class13.field165.method184(var310 - 1, 96);
                                class13.field165.method184(var311, 84);
                                continue;
                            }
                            if (var496 == 5003) {
                                var6--;
                                int var312 = class198.field3101[var6];
                                String var313 = null;
                                if (var312 < 100) {
                                    var313 = class19.field227[var312];
                                }
                                if (var313 == null) {
                                    var313 = "";
                                }
                                class201.field3144[var7++] = var313;
                                continue;
                            }
                            if (var496 == 5004) {
                                var6--;
                                int var314 = class198.field3101[var6];
                                int var315 = -1;
                                if (var314 < 100 && class19.field227[var314] != null) {
                                    var315 = class39.field538[var314];
                                }
                                class198.field3101[var6++] = var315;
                                continue;
                            }
                            if (var496 == 5005) {
                                class198.field3101[var6++] = class271.field4316;
                                continue;
                            }
                            if (var496 == 5008) {
                                var7--;
                                String var316 = class201.field3144[var7];
                                if (var316.startsWith("::")) {
                                    class96.method644(var316, arg2 ^ 0x75);
                                    continue;
                                }
                                if (class280.field4438 == 0 && (class172.field2700 && !class121.field1763 || class50.field666)) {
                                    continue;
                                }
                                class195.field3071++;
                                String var317 = var316.toLowerCase();
                                byte var318 = 0;
                                byte var319 = 0;
                                if (var317.startsWith(class272.field4318)) {
                                    var319 = 0;
                                    var316 = var316.substring(class272.field4318.length());
                                } else if (var317.startsWith(class63.field877)) {
                                    var319 = 1;
                                    var316 = var316.substring(class63.field877.length());
                                } else if (var317.startsWith(class269.field4293)) {
                                    var316 = var316.substring(class269.field4293.length());
                                    var319 = 2;
                                } else if (var317.startsWith(class78.field1102)) {
                                    var319 = 3;
                                    var316 = var316.substring(class78.field1102.length());
                                } else if (var317.startsWith(class151.field2244)) {
                                    var319 = 4;
                                    var316 = var316.substring(class151.field2244.length());
                                } else if (var317.startsWith(class253.field4074)) {
                                    var319 = 5;
                                    var316 = var316.substring(class253.field4074.length());
                                } else if (var317.startsWith(class189.field2976)) {
                                    var316 = var316.substring(class189.field2976.length());
                                    var319 = 6;
                                } else if (var317.startsWith(class190.field2992)) {
                                    var319 = 7;
                                    var316 = var316.substring(class190.field2992.length());
                                } else if (var317.startsWith(class161.field2504)) {
                                    var319 = 8;
                                    var316 = var316.substring(class161.field2504.length());
                                } else if (var317.startsWith(class37.field499)) {
                                    var319 = 9;
                                    var316 = var316.substring(class37.field499.length());
                                } else if (var317.startsWith(class237.field3803)) {
                                    var316 = var316.substring(class237.field3803.length());
                                    var319 = 10;
                                } else if (var317.startsWith(class36.field469)) {
                                    var319 = 11;
                                    var316 = var316.substring(class36.field469.length());
                                } else if (class48.field614 != 0) {
                                    if (var317.startsWith(class157.field2420)) {
                                        var319 = 0;
                                        var316 = var316.substring(class157.field2420.length());
                                    } else if (var317.startsWith(class178.field2782)) {
                                        var316 = var316.substring(class178.field2782.length());
                                        var319 = 1;
                                    } else if (var317.startsWith(class47.field600)) {
                                        var319 = 2;
                                        var316 = var316.substring(class47.field600.length());
                                    } else if (var317.startsWith(class198.field3111)) {
                                        var319 = 3;
                                        var316 = var316.substring(class198.field3111.length());
                                    } else if (var317.startsWith(class272.field4319)) {
                                        var316 = var316.substring(class272.field4319.length());
                                        var319 = 4;
                                    } else if (var317.startsWith(class253.field4088)) {
                                        var316 = var316.substring(class253.field4088.length());
                                        var319 = 5;
                                    } else if (var317.startsWith(class203.field3180)) {
                                        var319 = 6;
                                        var316 = var316.substring(class203.field3180.length());
                                    } else if (var317.startsWith(class139.field2045)) {
                                        var319 = 7;
                                        var316 = var316.substring(class139.field2045.length());
                                    } else if (var317.startsWith(class80.field1147)) {
                                        var319 = 8;
                                        var316 = var316.substring(class80.field1147.length());
                                    } else if (var317.startsWith(class274.field4372)) {
                                        var319 = 9;
                                        var316 = var316.substring(class274.field4372.length());
                                    } else if (var317.startsWith(class13.field169)) {
                                        var316 = var316.substring(class13.field169.length());
                                        var319 = 10;
                                    } else if (var317.startsWith(class10.field146)) {
                                        var316 = var316.substring(class10.field146.length());
                                        var319 = 11;
                                    }
                                }
                                String var320 = var316.toLowerCase();
                                if (var320.startsWith(class98.field1525)) {
                                    var318 = 1;
                                    var316 = var316.substring(class98.field1525.length());
                                } else if (var320.startsWith(class130.field1896)) {
                                    var316 = var316.substring(class130.field1896.length());
                                    var318 = 2;
                                } else if (var320.startsWith(class285.field4526)) {
                                    var316 = var316.substring(class285.field4526.length());
                                    var318 = 3;
                                } else if (var320.startsWith(class242.field3882)) {
                                    var316 = var316.substring(class242.field3882.length());
                                    var318 = 4;
                                } else if (var320.startsWith(class209.field3256)) {
                                    var316 = var316.substring(class209.field3256.length());
                                    var318 = 5;
                                } else if (class48.field614 != 0) {
                                    if (var320.startsWith(class189.field2979)) {
                                        var318 = 1;
                                        var316 = var316.substring(class189.field2979.length());
                                    } else if (var320.startsWith(class10.field135)) {
                                        var316 = var316.substring(class10.field135.length());
                                        var318 = 2;
                                    } else if (var320.startsWith(class228.field3689)) {
                                        var316 = var316.substring(class228.field3689.length());
                                        var318 = 3;
                                    } else if (var320.startsWith(class106.field1632)) {
                                        var318 = 4;
                                        var316 = var316.substring(class106.field1632.length());
                                    } else if (var320.startsWith(class131.field1928)) {
                                        var318 = 5;
                                        var316 = var316.substring(class131.field1928.length());
                                    }
                                }
                                class13.field165.method892(120, (byte) -33);
                                class13.field165.method184(0, 82);
                                int var321 = class13.field165.field349;
                                class13.field165.method184(var319, arg2 ^ 0x77);
                                class13.field165.method184(var318, arg2 + 105);
                                class144.method956(class13.field165, var316, true);
                                class13.field165.method211(-2, class13.field165.field349 - var321);
                                continue;
                            }
                            if (var496 == 5009) {
                                var7 -= 2;
                                String var322 = class201.field3144[var7 + 1];
                                String var323 = class201.field3144[var7];
                                if (class280.field4438 != 0 || (!class172.field2700 || class121.field1763) && !class50.field666) {
                                    class27.field379++;
                                    class13.field165.method892(250, (byte) -62);
                                    class13.field165.method184(0, arg2 ^ 0x5D);
                                    int var324 = class13.field165.field349;
                                    class13.field165.method206(-5061, class162.method1116(var323, (byte) 9));
                                    class144.method956(class13.field165, var322, true);
                                    class13.field165.method211(-2, class13.field165.field349 - var324);
                                }
                                continue;
                            }
                            if (var496 == 5010) {
                                var6--;
                                int var325 = class198.field3101[var6];
                                String var326 = null;
                                if (var325 < 100) {
                                    var326 = class269.field4286[var325];
                                }
                                if (var326 == null) {
                                    var326 = "";
                                }
                                class201.field3144[var7++] = var326;
                                continue;
                            }
                            if (var496 == 5011) {
                                var6--;
                                int var327 = class198.field3101[var6];
                                String var328 = null;
                                if (var327 < 100) {
                                    var328 = class115.field1695[var327];
                                }
                                if (var328 == null) {
                                    var328 = "";
                                }
                                class201.field3144[var7++] = var328;
                                continue;
                            }
                            if (var496 == 5012) {
                                var6--;
                                int var329 = class198.field3101[var6];
                                int var330 = -1;
                                if (var329 < 100) {
                                    var330 = class22.field266[var329];
                                }
                                class198.field3101[var6++] = var330;
                                continue;
                            }
                            if (var496 == 5015) {
                                String var331;
                                if (class149.field2227 == null || class149.field2227.field2912 == null) {
                                    var331 = class158.field2432;
                                } else {
                                    var331 = class149.field2227.method1291(arg2 + 14);
                                }
                                class201.field3144[var7++] = var331;
                                continue;
                            }
                            if (var496 == 5016) {
                                class198.field3101[var6++] = class39.field539;
                                continue;
                            }
                            if (var496 == 5017) {
                                class198.field3101[var6++] = class144.field2132;
                                continue;
                            }
                            if (var496 == 5050) {
                                var6--;
                                int var332 = class198.field3101[var6];
                                class201.field3144[var7++] = class122.method794(var332, arg2 + 14687).field1153;
                                continue;
                            }
                            if (var496 == 5051) {
                                var6--;
                                int var333 = class198.field3101[var6];
                                class80 var334 = class122.method794(var333, 14689);
                                if (var334.field1152 == null) {
                                    class198.field3101[var6++] = 0;
                                } else {
                                    class198.field3101[var6++] = var334.field1152.length;
                                }
                                continue;
                            }
                            if (var496 == 5052) {
                                var6 -= 2;
                                int var335 = class198.field3101[var6];
                                int var336 = class198.field3101[var6 + 1];
                                class80 var337 = class122.method794(var335, 14689);
                                int var338 = var337.field1152[var336];
                                class198.field3101[var6++] = var338;
                                continue;
                            }
                            if (var496 == 5053) {
                                var6--;
                                int var339 = class198.field3101[var6];
                                class80 var340 = class122.method794(var339, 14689);
                                if (var340.field1165 == null) {
                                    class198.field3101[var6++] = 0;
                                } else {
                                    class198.field3101[var6++] = var340.field1165.length;
                                }
                                continue;
                            }
                            if (var496 == 5054) {
                                var6 -= 2;
                                int var341 = class198.field3101[var6];
                                int var342 = class198.field3101[var6 + 1];
                                class198.field3101[var6++] = class122.method794(var341, 14689).field1165[var342];
                                continue;
                            }
                            if (var496 == 5055) {
                                var6--;
                                int var343 = class198.field3101[var6];
                                class201.field3144[var7++] = class64.method443(arg2 + 50, var343).method37((byte) 5);
                                continue;
                            }
                            if (var496 == 5056) {
                                var6--;
                                int var344 = class198.field3101[var6];
                                class6 var345 = class64.method443(-80, var344);
                                if (var345.field98 == null) {
                                    class198.field3101[var6++] = 0;
                                } else {
                                    class198.field3101[var6++] = var345.field98.length;
                                }
                                continue;
                            }
                            if (var496 == 5057) {
                                var6 -= 2;
                                int var346 = class198.field3101[var6 + 1];
                                int var347 = class198.field3101[var6];
                                class198.field3101[var6++] = class64.method443(60, var347).field98[var346];
                                continue;
                            }
                            if (var496 == 5058) {
                                class70.field994 = new class199();
                                var6--;
                                class70.field994.field3116 = class198.field3101[var6];
                                class70.field994.field3119 = class64.method443(arg2 ^ 0xFFFFFFA1, class70.field994.field3116);
                                class70.field994.field3112 = new int[class70.field994.field3119.method35((byte) -59)];
                                continue;
                            }
                            if (var496 == 5059) {
                                class13.field165.method892(171, (byte) -58);
                                class130.field1899++;
                                class13.field165.method184(0, 119);
                                int var348 = class13.field165.field349;
                                class13.field165.method184(0, 115);
                                class13.field165.method223(arg2 ^ 0x9977F6CA, class70.field994.field3116);
                                class70.field994.field3119.method41((byte) 40, class13.field165, class70.field994.field3112);
                                class13.field165.method211(arg2 ^ 0xFFFFFFFC, class13.field165.field349 - var348);
                                continue;
                            }
                            if (var496 == 5060) {
                                var7--;
                                String var349 = class201.field3144[var7];
                                class140.field2058++;
                                class13.field165.method892(156, (byte) -28);
                                class13.field165.method184(0, 106);
                                int var350 = class13.field165.field349;
                                class13.field165.method206(-5061, class162.method1116(var349, (byte) 104));
                                class13.field165.method223(arg2 ^ 0x9977F6CA, class70.field994.field3116);
                                class70.field994.field3119.method41((byte) -84, class13.field165, class70.field994.field3112);
                                class13.field165.method211(-2, class13.field165.field349 - var350);
                                continue;
                            }
                            if (var496 == 5061) {
                                class130.field1899++;
                                class13.field165.method892(171, (byte) -19);
                                class13.field165.method184(0, 127);
                                int var351 = class13.field165.field349;
                                class13.field165.method184(1, 125);
                                class13.field165.method223(-1720191288, class70.field994.field3116);
                                class70.field994.field3119.method41((byte) -61, class13.field165, class70.field994.field3112);
                                class13.field165.method211(-2, class13.field165.field349 - var351);
                                continue;
                            }
                            if (var496 == 5062) {
                                var6 -= 2;
                                int var352 = class198.field3101[var6 + 1];
                                int var353 = class198.field3101[var6];
                                class198.field3101[var6++] = class122.method794(var353, class128.method879(arg2, 14691)).field1144[var352];
                                continue;
                            }
                            if (var496 == 5063) {
                                var6 -= 2;
                                int var354 = class198.field3101[var6];
                                int var355 = class198.field3101[var6 + 1];
                                class198.field3101[var6++] = class122.method794(var354, arg2 + 14687).field1154[var355];
                                continue;
                            }
                            if (var496 == 5064) {
                                var6 -= 2;
                                int var356 = class198.field3101[var6 + 1];
                                int var357 = class198.field3101[var6];
                                if (var356 == -1) {
                                    class198.field3101[var6++] = -1;
                                } else {
                                    class198.field3101[var6++] = class122.method794(var357, arg2 + 14687).method558((char) var356, -125);
                                }
                                continue;
                            }
                            if (var496 == 5065) {
                                var6 -= 2;
                                int var358 = class198.field3101[var6];
                                int var359 = class198.field3101[var6 + 1];
                                if (var359 == -1) {
                                    class198.field3101[var6++] = -1;
                                } else {
                                    class198.field3101[var6++] = class122.method794(var358, 14689).method554(31701, (char) var359);
                                }
                                continue;
                            }
                            if (var496 == 5066) {
                                var6--;
                                int var360 = class198.field3101[var6];
                                class198.field3101[var6++] = class64.method443(-119, var360).method35((byte) -58);
                                continue;
                            }
                            if (var496 == 5067) {
                                var6 -= 2;
                                int var361 = class198.field3101[var6];
                                int var362 = class198.field3101[var6 + 1];
                                int var363 = class64.method443(-128, var361).method33(arg2 ^ 0x2, var362);
                                class198.field3101[var6++] = var363;
                                continue;
                            }
                            if (var496 == 5068) {
                                var6 -= 2;
                                int var364 = class198.field3101[var6 + 1];
                                int var365 = class198.field3101[var6];
                                class70.field994.field3112[var365] = var364;
                                continue;
                            }
                            if (var496 == 5069) {
                                var6 -= 2;
                                int var366 = class198.field3101[var6];
                                int var367 = class198.field3101[var6 + 1];
                                class70.field994.field3112[var366] = var367;
                                continue;
                            }
                            if (var496 == 5070) {
                                var6 -= 3;
                                int var368 = class198.field3101[var6];
                                int var369 = class198.field3101[var6 + 2];
                                int var370 = class198.field3101[var6 + 1];
                                class6 var371 = class64.method443(64, var368);
                                if (var371.method33(0, var370) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class198.field3101[var6++] = var371.method42((byte) 99, var369, var370);
                                continue;
                            }
                            if (var496 == 5071) {
                                var7--;
                                String var372 = class201.field3144[var7];
                                var6--;
                                boolean var373 = class198.field3101[var6] == 1;
                                class185.method1289(var373, var372, 7878);
                                class198.field3101[var6++] = class93.field1448;
                                continue;
                            }
                            if (var496 == 5072) {
                                if (class86.field1363 != null && class149.field2226 < class93.field1448) {
                                    class198.field3101[var6++] = class224.method1526(65535, class86.field1363[class149.field2226++]);
                                    continue;
                                }
                                class198.field3101[var6++] = -1;
                                continue;
                            }
                            if (var496 == 5073) {
                                class149.field2226 = 0;
                                continue;
                            }
                        } else if (var496 < 5200) {
                            if (var496 == 5100) {
                                if (class123.field1844[86]) {
                                    class198.field3101[var6++] = 1;
                                } else {
                                    class198.field3101[var6++] = 0;
                                }
                                continue;
                            }
                            if (var496 == 5101) {
                                if (class123.field1844[82]) {
                                    class198.field3101[var6++] = 1;
                                } else {
                                    class198.field3101[var6++] = 0;
                                }
                                continue;
                            }
                            if (var496 == 5102) {
                                if (class123.field1844[81]) {
                                    class198.field3101[var6++] = 1;
                                } else {
                                    class198.field3101[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var496 < 5300) {
                            if (var496 == 5200) {
                                var6--;
                                class116.method776(class198.field3101[var6], -1);
                                continue;
                            }
                            if (var496 == 5201) {
                                class198.field3101[var6++] = class205.method1401(-124);
                                continue;
                            }
                            if (var496 == 5202) {
                                var6--;
                                class117.method778(class198.field3101[var6], (byte) 126);
                                continue;
                            }
                            if (var496 == 5203) {
                                var7--;
                                class190.method1331(class201.field3144[var7], arg2 - 25924);
                                continue;
                            }
                            if (var496 == 5204) {
                                class201.field3144[var7 - 1] = class37.method296(-94, class201.field3144[var7 - 1]);
                                continue;
                            }
                            if (var496 == 5205) {
                                var7--;
                                class235.method1598(class201.field3144[var7], (byte) -127);
                                continue;
                            }
                            if (var496 == 5206) {
                                var6--;
                                int var222 = class198.field3101[var6];
                                class162 var223 = class53.method386(var222 & 0x3FFF, (byte) -65, (var222 & 0xFFFC452) >> 14);
                                if (var223 == null) {
                                    class201.field3144[var7++] = "";
                                } else {
                                    class201.field3144[var7++] = var223.field2513;
                                }
                                continue;
                            }
                            if (var496 == 5207) {
                                var7--;
                                class162 var224 = class60.method427((byte) 124, class201.field3144[var7]);
                                if (var224 != null && var224.field2530 != null) {
                                    class201.field3144[var7++] = var224.field2530;
                                    continue;
                                }
                                class201.field3144[var7++] = "";
                                continue;
                            }
                            if (var496 == 5208) {
                                class198.field3101[var6++] = class53.field727;
                                class198.field3101[var6++] = class56.field785;
                                continue;
                            }
                            if (var496 == 5209) {
                                class198.field3101[var6++] = class47.field599 + class219.field3563;
                                class198.field3101[var6++] = class104.field1611 + class120.field1751 - class158.field2435 - 1;
                                continue;
                            }
                            if (var496 == 5210) {
                                class162 var225 = class26.method230(true);
                                if (var225 == null) {
                                    class198.field3101[var6++] = 0;
                                    class198.field3101[var6++] = 0;
                                } else {
                                    class198.field3101[var6++] = var225.field2526 * 64;
                                    class198.field3101[var6++] = var225.field2525 * 64;
                                }
                                continue;
                            }
                            if (var496 == 5211) {
                                class162 var226 = class26.method230(true);
                                if (var226 == null) {
                                    class198.field3101[var6++] = 0;
                                    class198.field3101[var6++] = 0;
                                } else {
                                    class198.field3101[var6++] = var226.field2512 - var226.field2531;
                                    class198.field3101[var6++] = var226.field2524 - var226.field2529;
                                }
                                continue;
                            }
                            if (var496 == 5212) {
                                int var227 = class50.method367(arg2 + 81);
                                int var228 = 0;
                                String var229;
                                if (var227 == -1) {
                                    var229 = "";
                                } else {
                                    var229 = class107.field1644.field1112[var227];
                                    var228 = class107.field1644.method523(var227, 25488);
                                }
                                String var230 = class33.method266(" ", var229, 0, "<br>");
                                class201.field3144[var7++] = var230;
                                class198.field3101[var6++] = var228;
                                continue;
                            }
                            if (var496 == 5213) {
                                int var231 = class234.method1592(true);
                                int var232 = 0;
                                String var233;
                                if (var231 == -1) {
                                    var233 = "";
                                } else {
                                    var233 = class107.field1644.field1112[var231];
                                    var232 = class107.field1644.method523(var231, arg2 ^ 0x6392);
                                }
                                String var234 = class33.method266(" ", var233, 0, "<br>");
                                class201.field3144[var7++] = var234;
                                class198.field3101[var6++] = var232;
                                continue;
                            }
                            if (var496 == 5214) {
                                var6--;
                                int var235 = class198.field3101[var6];
                                class69.method468(var235 & 0x3FFF, var235 >> 14 & 0x3FFF, 0);
                                continue;
                            }
                            if (var496 == 5215) {
                                var6--;
                                int var236 = class198.field3101[var6];
                                var7--;
                                String var237 = class201.field3144[var7];
                                class216 var238 = class29.method238(var236 & 0x3FFF, -50, var236 >> 14 & 0x3FFF);
                                boolean var239 = false;
                                for (class162 var240 = (class162) var238.method1467(arg2 ^ 0x2); var240 != null; var240 = (class162) var238.method1461((byte) -116)) {
                                    if (var240.field2513.equalsIgnoreCase(var237)) {
                                        var239 = true;
                                        break;
                                    }
                                }
                                if (var239) {
                                    class198.field3101[var6++] = 1;
                                } else {
                                    class198.field3101[var6++] = 0;
                                }
                                continue;
                            }
                            if (var496 == 5216) {
                                var6--;
                                int var241 = class198.field3101[var6];
                                class73.method499((byte) 100, var241);
                                continue;
                            }
                            if (var496 == 5217) {
                                var6--;
                                int var242 = class198.field3101[var6];
                                if (class23.method156(0, var242)) {
                                    class198.field3101[var6++] = 1;
                                } else {
                                    class198.field3101[var6++] = 0;
                                }
                                continue;
                            }
                            if (var496 == 5218) {
                                class162 var243 = class26.method230(true);
                                if (var243 == null) {
                                    class198.field3101[var6++] = -1;
                                } else {
                                    class198.field3101[var6++] = var243.field2515;
                                }
                                continue;
                            }
                            if (var496 == 5219) {
                                var7--;
                                class143.method954((byte) 56, class201.field3144[var7]);
                                continue;
                            }
                            if (var496 == 5220) {
                                class198.field3101[var6++] = class30.field401 == 100 ? 1 : 0;
                                continue;
                            }
                        } else if (var496 < 5400) {
                            if (var496 == 5300) {
                                var6 -= 2;
                                class198.field3101[var6++] = 0;
                                continue;
                            }
                            if (var496 == 5301) {
                                continue;
                            }
                            if (var496 == 5302) {
                                class198.field3101[var6++] = 0;
                                continue;
                            }
                            if (var496 == 5303) {
                                var6--;
                                class198.field3101[var6++] = 0;
                                class198.field3101[var6++] = 0;
                                continue;
                            }
                            if (var496 == 5305) {
                                byte var306 = -1;
                                class198.field3101[var6++] = var306;
                                continue;
                            }
                            if (var496 == 5306) {
                                class198.field3101[var6++] = class277.method1859(-84);
                                continue;
                            }
                            if (var496 == 5307) {
                                var6--;
                                int var307 = class198.field3101[var6];
                                if (var307 < 0 || var307 > 2) {
                                    var307 = 0;
                                }
                                class71.method481(var307, -1, -1, -9267, false);
                                continue;
                            }
                            if (var496 == 5308) {
                                class198.field3101[var6++] = class8.field124;
                                continue;
                            }
                            if (var496 == 5309) {
                                var6--;
                                int var308 = class198.field3101[var6];
                                if (var308 < 0 || var308 > 2) {
                                    var308 = 0;
                                }
                                class8.field124 = var308;
                                class7.method45(255, class2.field23);
                                continue;
                            }
                        } else if (var496 < 5500) {
                            if (var496 == 5400) {
                                var7 -= 2;
                                class128.field1884++;
                                String var286 = class201.field3144[var7];
                                String var287 = class201.field3144[var7 + 1];
                                var6--;
                                int var288 = class198.field3101[var6];
                                class13.field165.method892(209, (byte) -106);
                                class13.field165.method184(class268.method1822(arg2 ^ 0x7D, var286) + class268.method1822(127, var287) + 1, arg2 ^ 0x60);
                                class13.field165.method199(arg2 - 2, var286);
                                class13.field165.method199(arg2 ^ 0x2, var287);
                                class13.field165.method184(var288, arg2 ^ 0x62);
                                continue;
                            }
                            if (var496 == 5401) {
                                var6 -= 2;
                                class252.field4027[class198.field3101[var6]] = (short) class155.method1030(class198.field3101[var6 + 1], arg2 - 93);
                                class162.method1114(108);
                                class147.method981((byte) 61);
                                class58.method419(false);
                                class8.method50(arg2 ^ 0xFFFFFFC6);
                                class33.method264(-101);
                                continue;
                            }
                            if (var496 == 5405) {
                                var6 -= 2;
                                int var289 = class198.field3101[var6];
                                int var290 = class198.field3101[var6 + 1];
                                if (var289 >= 0 && var289 < 2) {
                                    class97.field1498[var289] = new int[var290 << 1][4];
                                }
                                continue;
                            }
                            if (var496 == 5406) {
                                var6 -= 7;
                                int var291 = class198.field3101[var6 + 1] << 1;
                                int var292 = class198.field3101[var6];
                                int var293 = class198.field3101[var6 + 2];
                                int var294 = class198.field3101[var6 + 3];
                                int var295 = class198.field3101[var6 + 4];
                                int var296 = class198.field3101[var6 + 5];
                                int var297 = class198.field3101[var6 + 6];
                                if (var292 >= 0 && var292 < 2 && class97.field1498[var292] != null && var291 >= 0 && var291 < class97.field1498[var292].length) {
                                    class97.field1498[var292][var291] = new int[] { (class224.method1526(var293, 268419694) >> 14) * 128, var294, class224.method1526(var293, 16383) * 128, var297 };
                                    class97.field1498[var292][var291 + 1] = new int[] { class224.method1526(16383, var295 >> 14) * 128, var296, class224.method1526(16383, var295) * 128 };
                                }
                                continue;
                            }
                            if (var496 == 5407) {
                                var6--;
                                int var298 = class97.field1498[class198.field3101[var6]].length >> 1;
                                class198.field3101[var6++] = var298;
                                continue;
                            }
                            if (var496 == 5411) {
                                if (class215.field3519 == null) {
                                    class224.method1525(class56.method408(0), false, arg2 ^ 0x3);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var496 == 5419) {
                                String var299 = "";
                                if (class107.field1653 != null) {
                                    if (class107.field1653.field3249 == null) {
                                        var299 = class147.method971(class107.field1653.field3245, -111);
                                    } else {
                                        var299 = (String) class107.field1653.field3249;
                                    }
                                }
                                class201.field3144[var7++] = var299;
                                continue;
                            }
                            if (var496 == 5420) {
                                class198.field3101[var6++] = class20.field248 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var496 == 5421) {
                                var7--;
                                String var300 = class201.field3144[var7];
                                var6--;
                                boolean var301 = class198.field3101[var6] == 1;
                                String var302 = class56.method408(0) + var300;
                                if (class215.field3519 == null && (!var301 || class20.field248 == 3 || !class20.field244.startsWith("win") || class134.field1949)) {
                                    class224.method1525(var302, var301, arg2 - 1);
                                    continue;
                                }
                                class246.field3942 = var302;
                                class35.field446 = var301;
                                class243.field3888 = class2.field23.method142(arg2 - 2, var302);
                                continue;
                            }
                            if (var496 == 5422) {
                                var7 -= 2;
                                String var303 = class201.field3144[var7];
                                var6--;
                                int var304 = class198.field3101[var6];
                                String var305 = class201.field3144[var7 + 1];
                                if (var303.length() > 0) {
                                    if (class82.field1205 == null) {
                                        class82.field1205 = new String[class66.field917[class80.field1151]];
                                    }
                                    class82.field1205[var304] = var303;
                                }
                                if (var305.length() > 0) {
                                    if (class50.field653 == null) {
                                        class50.field653 = new String[class66.field917[class80.field1151]];
                                    }
                                    class50.field653[var304] = var305;
                                }
                                continue;
                            }
                            if (var496 == 5423) {
                                var7--;
                                System.out.println(class201.field3144[var7]);
                                continue;
                            }
                            if (var496 == 5424) {
                                var6 -= 11;
                                class279.field4426 = class198.field3101[var6];
                                class279.field4429 = class198.field3101[var6 + 1];
                                class173.field2716 = class198.field3101[var6 + 2];
                                class206.field3222 = class198.field3101[var6 + 3];
                                class158.field2434 = class198.field3101[var6 + 4];
                                class201.field3153 = class198.field3101[var6 + 5];
                                class182.field2888 = class198.field3101[var6 + 6];
                                class212.field3317 = class198.field3101[var6 + 7];
                                class249.field3997 = class198.field3101[var6 + 8];
                                class86.field1357 = class198.field3101[var6 + 9];
                                class69.field968 = class198.field3101[var6 + 10];
                                class237.field3802.method806(69, class158.field2434);
                                class237.field3802.method806(69, class201.field3153);
                                class237.field3802.method806(114, class182.field2888);
                                class237.field3802.method806(34, class212.field3317);
                                class237.field3802.method806(64, class249.field3997);
                                class264.field4247 = true;
                                continue;
                            }
                            if (var496 == 5425) {
                                class181.method1270(true);
                                class264.field4247 = false;
                                continue;
                            }
                            if (var496 == 5426) {
                                var6--;
                                class147.field2162 = class198.field3101[var6];
                                continue;
                            }
                            if (var496 == 5427) {
                                var6 -= 2;
                                class68.field956 = class198.field3101[var6];
                                class107.field1645 = class198.field3101[var6 + 1];
                                continue;
                            }
                        } else if (var496 < 5600) {
                            if (var496 == 5500) {
                                var6 -= 4;
                                int var274 = class198.field3101[var6 + 3];
                                int var275 = class198.field3101[var6 + 2];
                                int var276 = class198.field3101[var6 + 1];
                                int var277 = class198.field3101[var6];
                                class107.method702((var277 & 0x3FFF) - class246.field3943, var275, var274, var276, 32758, false, (var277 >> 14 & 0x3FFF) - class126.field1869);
                                continue;
                            }
                            if (var496 == 5501) {
                                var6 -= 4;
                                int var278 = class198.field3101[var6];
                                int var279 = class198.field3101[var6 + 2];
                                int var280 = class198.field3101[var6 + 3];
                                int var281 = class198.field3101[var6 + 1];
                                class36.method284((var278 & 0x3FFF) - class246.field3943, var281, var279, (byte) -18, var280, ((var278 & 0xFFFD247) >> 14) - class126.field1869);
                                continue;
                            }
                            if (var496 == 5502) {
                                var6 -= 6;
                                int var282 = class198.field3101[var6];
                                if (var282 >= 2) {
                                    throw new RuntimeException();
                                }
                                class170.field2671 = var282;
                                int var283 = class198.field3101[var6 + 1];
                                if ((var283 + 1) >= (class97.field1498[class170.field2671].length >> 1)) {
                                    throw new RuntimeException();
                                }
                                class108.field1658 = 0;
                                class23.field279 = var283;
                                class182.field2883 = class198.field3101[var6 + 2];
                                class122.field1769 = class198.field3101[var6 + 3];
                                int var284 = class198.field3101[var6 + 4];
                                if (var284 >= 2) {
                                    throw new RuntimeException();
                                }
                                class274.field4382 = var284;
                                int var285 = class198.field3101[var6 + 5];
                                if (class97.field1498[class274.field4382].length >> 1 <= var285 + 1) {
                                    throw new RuntimeException();
                                }
                                class278.field4414 = 3;
                                class280.field4435 = var285;
                                continue;
                            }
                            if (var496 == 5503) {
                                class136.method917((byte) 78);
                                continue;
                            }
                            if (var496 == 5504) {
                                var6 -= 2;
                                class39.field530 = class198.field3101[var6];
                                class29.field392 = class198.field3101[var6 + 1];
                                if (class278.field4414 == 2) {
                                    class215.field3516 = class39.field530;
                                    class77.field1092 = class29.field392;
                                }
                                class236.method1599((byte) -37);
                                continue;
                            }
                            if (var496 == 5505) {
                                class198.field3101[var6++] = class39.field530;
                                continue;
                            }
                            if (var496 == 5506) {
                                class198.field3101[var6++] = class29.field392;
                                continue;
                            }
                        } else if (var496 < 5700) {
                            if (var496 == 5600) {
                                var7 -= 2;
                                String var270 = class201.field3144[var7 + 1];
                                String var271 = class201.field3144[var7];
                                var6--;
                                int var272 = class198.field3101[var6];
                                if (class203.field3182 == 10 && class131.field1918 == 0 && class111.field1680 == 0 && class181.field2806 == 0 && class131.field1917 == 0) {
                                    class279.method1867(var271, var272, arg2 - 2, var270);
                                }
                                continue;
                            }
                            if (var496 == 5601) {
                                class40.method313(-127);
                                continue;
                            }
                            if (var496 == 5602) {
                                if (class111.field1680 == 0) {
                                    class149.field2208 = -2;
                                }
                                continue;
                            }
                            if (var496 == 5603) {
                                var6 -= 4;
                                if (class203.field3182 == 10 && class131.field1918 == 0 && class111.field1680 == 0 && class181.field2806 == 0 && class131.field1917 == 0) {
                                    class163.method1118(true, class198.field3101[var6], class198.field3101[var6 + 3], class198.field3101[var6 + 1], class198.field3101[var6 + 2]);
                                }
                                continue;
                            }
                            if (var496 == 5604) {
                                var7--;
                                if (class203.field3182 == 10 && class131.field1918 == 0 && class111.field1680 == 0 && class181.field2806 == 0 && class131.field1917 == 0) {
                                    class258.method1770(class162.method1116(class201.field3144[var7], (byte) 100), arg2 + 31469);
                                }
                                continue;
                            }
                            if (var496 == 5605) {
                                var7 -= 3;
                                var6 -= 7;
                                if (class203.field3182 == 10 && class131.field1918 == 0 && class111.field1680 == 0 && class181.field2806 == 0 && class131.field1917 == 0) {
                                    class168.method1176(class198.field3101[var6 + 5] == 1, class198.field3101[var6], class201.field3144[var7 + 1], class162.method1116(class201.field3144[var7], (byte) 96), (byte) 103, class201.field3144[var7 + 2], class198.field3101[var6 + 1], class198.field3101[var6 + 4] == 1, class198.field3101[var6 + 6] == 1, class198.field3101[var6 + 3], class198.field3101[var6 + 2]);
                                }
                                continue;
                            }
                            if (var496 == 5606) {
                                if (class181.field2806 == 0) {
                                    class173.field2723 = -2;
                                }
                                continue;
                            }
                            if (var496 == 5607) {
                                class198.field3101[var6++] = class149.field2208;
                                continue;
                            }
                            if (var496 == 5608) {
                                class198.field3101[var6++] = class234.field3760;
                                continue;
                            }
                            if (var496 == 5609) {
                                class198.field3101[var6++] = class173.field2723;
                                continue;
                            }
                            if (var496 == 5610) {
                                for (int var273 = 0; var273 < 5; var273++) {
                                    class201.field3144[var7++] = var273 >= class23.field286.length ? "" : class154.method1020(class23.field286[var273], 22);
                                }
                                class23.field286 = null;
                                continue;
                            }
                            if (var496 == 5611) {
                                class198.field3101[var6++] = class94.field1454;
                                continue;
                            }
                        } else if (var496 < 6100) {
                            if (var496 == 6001) {
                                var6--;
                                int var244 = class198.field3101[var6];
                                if (var244 < 1) {
                                    var244 = 1;
                                }
                                if (var244 > 4) {
                                    var244 = 4;
                                }
                                class59.field835 = var244;
                                if (class59.field835 == 1) {
                                    class171.method1203(0.9F);
                                }
                                if (class59.field835 == 2) {
                                    class171.method1203(0.8F);
                                }
                                if (class59.field835 == 3) {
                                    class171.method1203(0.7F);
                                }
                                if (class59.field835 == 4) {
                                    class171.method1203(0.6F);
                                }
                                class147.method981((byte) 90);
                                class7.method45(arg2 + 253, class2.field23);
                                class21.field256 = false;
                                continue;
                            }
                            if (var496 == 6002) {
                                var6--;
                                class76.method517(false, class198.field3101[var6] == 1);
                                class51.method375(-10304);
                                class5.method25((byte) 55);
                                class199.method1376(false);
                                class7.method45(arg2 ^ 0xFD, class2.field23);
                                class21.field256 = false;
                                continue;
                            }
                            if (var496 == 6003) {
                                var6--;
                                class199.field3114 = class198.field3101[var6] == 1;
                                class199.method1376(false);
                                class7.method45(arg2 + 253, class2.field23);
                                class21.field256 = false;
                                continue;
                            }
                            if (var496 == 6005) {
                                var6--;
                                class143.field2098 = class198.field3101[var6] == 1;
                                class5.method25((byte) 55);
                                class7.method45(arg2 + 253, class2.field23);
                                class21.field256 = false;
                                continue;
                            }
                            if (var496 == 6006) {
                                var6--;
                                class239.field3814 = class198.field3101[var6] == 1;
                                ((class144) class171.field2689).method958(!class239.field3814, -15345);
                                class7.method45(arg2 + 253, class2.field23);
                                class21.field256 = false;
                                continue;
                            }
                            if (var496 == 6007) {
                                var6--;
                                class195.field3073 = class198.field3101[var6] == 1;
                                class7.method45(255, class2.field23);
                                class21.field256 = false;
                                continue;
                            }
                            if (var496 == 6008) {
                                var6--;
                                class264.field4255 = class198.field3101[var6] == 1;
                                class7.method45(arg2 + 253, class2.field23);
                                class21.field256 = false;
                                continue;
                            }
                            if (var496 == 6009) {
                                var6--;
                                class184.field2893 = class198.field3101[var6] == 1;
                                class7.method45(255, class2.field23);
                                class21.field256 = false;
                                continue;
                            }
                            if (var496 == 6010) {
                                var6--;
                                class50.field693 = class198.field3101[var6] == 1;
                                class7.method45(255, class2.field23);
                                class21.field256 = false;
                                continue;
                            }
                            if (var496 == 6011) {
                                var6--;
                                int var245 = class198.field3101[var6];
                                if (var245 < 0 || var245 > 2) {
                                    var245 = 0;
                                }
                                class65.field912 = var245;
                                class7.method45(arg2 ^ 0xFD, class2.field23);
                                class21.field256 = false;
                                continue;
                            }
                            if (var496 == 6012) {
                                var6--;
                                class3.field37 = class198.field3101[var6] == 1;
                                if (class59.field835 == 1) {
                                    class171.method1203(0.9F);
                                }
                                if (class59.field835 == 2) {
                                    class171.method1203(0.8F);
                                }
                                if (class59.field835 == 3) {
                                    class171.method1203(0.7F);
                                }
                                if (class59.field835 == 4) {
                                    class171.method1203(0.6F);
                                }
                                class5.method25((byte) 55);
                                class7.method45(255, class2.field23);
                                class21.field256 = false;
                                continue;
                            }
                            if (var496 == 6014) {
                                var6--;
                                class182.field2882 = class198.field3101[var6] == 1;
                                class7.method45(255, class2.field23);
                                class21.field256 = false;
                                continue;
                            }
                            if (var496 == 6015) {
                                var6--;
                                class123.field1815 = class198.field3101[var6] == 1;
                                class7.method45(255, class2.field23);
                                class21.field256 = false;
                                continue;
                            }
                            if (var496 == 6016) {
                                var6--;
                                int var246 = class198.field3101[var6];
                                if (var246 < 0 || var246 > 2) {
                                    var246 = 0;
                                }
                                class229.field3703 = var246;
                                continue;
                            }
                            if (var496 == 6017) {
                                var6--;
                                class16.field192 = class198.field3101[var6] == 1;
                                class110.method722(-28930);
                                class7.method45(255, class2.field23);
                                class21.field256 = false;
                                continue;
                            }
                            if (var496 == 6018) {
                                var6--;
                                int var247 = class198.field3101[var6];
                                if (var247 < 0) {
                                    var247 = 0;
                                }
                                if (var247 > 127) {
                                    var247 = 127;
                                }
                                class76.field1074 = var247;
                                class7.method45(arg2 ^ 0xFD, class2.field23);
                                class21.field256 = false;
                                continue;
                            }
                            if (var496 == 6019) {
                                var6--;
                                int var248 = class198.field3101[var6];
                                if (var248 < 0) {
                                    var248 = 0;
                                }
                                if (var248 > 255) {
                                    var248 = 255;
                                }
                                if (class219.field3553 != var248) {
                                    if (class219.field3553 == 0 && class37.field488 != -1) {
                                        class184.method1282(class37.field488, var248, 0, false, arg2 ^ 0x63, class98.field1509);
                                        class284.field4509 = false;
                                    } else if (var248 == 0) {
                                        class96.method643(1);
                                        class284.field4509 = false;
                                    } else {
                                        class21.method150(0, var248);
                                    }
                                    class219.field3553 = var248;
                                }
                                class7.method45(arg2 + 253, class2.field23);
                                class21.field256 = false;
                                continue;
                            }
                            if (var496 == 6020) {
                                var6--;
                                int var249 = class198.field3101[var6];
                                if (var249 < 0) {
                                    var249 = 0;
                                }
                                if (var249 > 127) {
                                    var249 = 127;
                                }
                                class60.field841 = var249;
                                class7.method45(255, class2.field23);
                                class21.field256 = false;
                                continue;
                            }
                            if (var496 == 6021) {
                                var6--;
                                class128.field1885 = class198.field3101[var6] == 1;
                                class199.method1376(false);
                                continue;
                            }
                            if (var496 == 6023) {
                                var6--;
                                int var250 = class198.field3101[var6];
                                if (var250 < 0) {
                                    var250 = 0;
                                }
                                boolean var251 = false;
                                if (var250 > 2) {
                                    var250 = 2;
                                }
                                if (class69.field967 < 96) {
                                    var250 = 0;
                                    var251 = true;
                                }
                                class217.method1469(var250);
                                class7.method45(255, class2.field23);
                                class21.field256 = false;
                                class198.field3101[var6++] = var251 ? 0 : 1;
                                continue;
                            }
                            if (var496 == 6024) {
                                var6--;
                                int var252 = class198.field3101[var6];
                                if (var252 < 0 || var252 > 2) {
                                    var252 = 0;
                                }
                                class185.field2900 = var252;
                                class7.method45(255, class2.field23);
                                continue;
                            }
                            if (var496 == 6028) {
                                var6--;
                                class80.field1167 = class198.field3101[var6] != 0;
                                class7.method45(255, class2.field23);
                                continue;
                            }
                        } else if (var496 < 6200) {
                            if (var496 == 6101) {
                                class198.field3101[var6++] = class59.field835;
                                continue;
                            }
                            if (var496 == 6102) {
                                class198.field3101[var6++] = class26.method227(10920) ? 1 : 0;
                                continue;
                            }
                            if (var496 == 6103) {
                                class198.field3101[var6++] = class199.field3114 ? 1 : 0;
                                continue;
                            }
                            if (var496 == 6105) {
                                class198.field3101[var6++] = class143.field2098 ? 1 : 0;
                                continue;
                            }
                            if (var496 == 6106) {
                                class198.field3101[var6++] = class239.field3814 ? 1 : 0;
                                continue;
                            }
                            if (var496 == 6107) {
                                class198.field3101[var6++] = class195.field3073 ? 1 : 0;
                                continue;
                            }
                            if (var496 == 6108) {
                                class198.field3101[var6++] = class264.field4255 ? 1 : 0;
                                continue;
                            }
                            if (var496 == 6109) {
                                class198.field3101[var6++] = class184.field2893 ? 1 : 0;
                                continue;
                            }
                            if (var496 == 6110) {
                                class198.field3101[var6++] = class50.field693 ? 1 : 0;
                                continue;
                            }
                            if (var496 == 6111) {
                                class198.field3101[var6++] = class65.field912;
                                continue;
                            }
                            if (var496 == 6112) {
                                class198.field3101[var6++] = class3.field37 ? 1 : 0;
                                continue;
                            }
                            if (var496 == 6114) {
                                class198.field3101[var6++] = class182.field2882 ? 1 : 0;
                                continue;
                            }
                            if (var496 == 6115) {
                                class198.field3101[var6++] = class123.field1815 ? 1 : 0;
                                continue;
                            }
                            if (var496 == 6116) {
                                class198.field3101[var6++] = class229.field3703;
                                continue;
                            }
                            if (var496 == 6117) {
                                class198.field3101[var6++] = class16.field192 ? 1 : 0;
                                continue;
                            }
                            if (var496 == 6118) {
                                class198.field3101[var6++] = class76.field1074;
                                continue;
                            }
                            if (var496 == 6119) {
                                class198.field3101[var6++] = class219.field3553;
                                continue;
                            }
                            if (var496 == 6120) {
                                class198.field3101[var6++] = class60.field841;
                                continue;
                            }
                            if (var496 == 6121) {
                                class198.field3101[var6++] = 0;
                                continue;
                            }
                            if (var496 == 6123) {
                                class198.field3101[var6++] = class217.method1470();
                                continue;
                            }
                            if (var496 == 6124) {
                                class198.field3101[var6++] = class185.field2900;
                                continue;
                            }
                            if (var496 == 6128) {
                                class198.field3101[var6++] = class80.field1167 ? 1 : 0;
                                continue;
                            }
                        } else if (var496 < 6300) {
                            if (var496 == 6200) {
                                var6 -= 2;
                                class178.field2786 = (short) class198.field3101[var6];
                                if (class178.field2786 <= 0) {
                                    class178.field2786 = 256;
                                }
                                class234.field3762 = (short) class198.field3101[var6 + 1];
                                if (class234.field3762 <= 0) {
                                    class234.field3762 = 205;
                                }
                                continue;
                            }
                            if (var496 == 6201) {
                                var6 -= 2;
                                class214.field3338 = (short) class198.field3101[var6];
                                if (class214.field3338 <= 0) {
                                    class214.field3338 = 256;
                                }
                                class273.field4350 = (short) class198.field3101[var6 + 1];
                                if (class273.field4350 <= 0) {
                                    class273.field4350 = 320;
                                }
                                continue;
                            }
                            if (var496 == 6202) {
                                var6 -= 4;
                                class115.field1696 = (short) class198.field3101[var6];
                                if (class115.field1696 <= 0) {
                                    class115.field1696 = 1;
                                }
                                class97.field1499 = (short) class198.field3101[var6 + 1];
                                if (class97.field1499 <= 0) {
                                    class97.field1499 = 32767;
                                } else if (class115.field1696 > class97.field1499) {
                                    class97.field1499 = class115.field1696;
                                }
                                class276.field4404 = (short) class198.field3101[var6 + 2];
                                if (class276.field4404 <= 0) {
                                    class276.field4404 = 1;
                                }
                                class50.field684 = (short) class198.field3101[var6 + 3];
                                if (class50.field684 <= 0) {
                                    class50.field684 = 32767;
                                } else if (class276.field4404 > class50.field684) {
                                    class50.field684 = class276.field4404;
                                }
                                continue;
                            }
                            if (var496 == 6203) {
                                class53.method388(class175.field2732.field3369, -80, class175.field2732.field3473, 0, false, 0);
                                class198.field3101[var6++] = class140.field2060;
                                class198.field3101[var6++] = class34.field435;
                                continue;
                            }
                            if (var496 == 6204) {
                                class198.field3101[var6++] = class214.field3338;
                                class198.field3101[var6++] = class273.field4350;
                                continue;
                            }
                            if (var496 == 6205) {
                                class198.field3101[var6++] = class178.field2786;
                                class198.field3101[var6++] = class234.field3762;
                                continue;
                            }
                        } else if (var496 < 6400) {
                            if (var496 == 6300) {
                                class198.field3101[var6++] = (int) (class260.method1785((byte) -128) / 60000L);
                                continue;
                            }
                            if (var496 == 6301) {
                                class198.field3101[var6++] = (int) (class260.method1785((byte) -102) / 86400000L) - 11745;
                                continue;
                            }
                            if (var496 == 6302) {
                                var6 -= 3;
                                int var265 = class198.field3101[var6 + 2];
                                int var266 = class198.field3101[var6];
                                int var267 = class198.field3101[var6 + 1];
                                class157.field2416.clear();
                                class157.field2416.set(11, 12);
                                class157.field2416.set(var265, var267, var266);
                                class198.field3101[var6++] = (int) (class157.field2416.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var496 == 6303) {
                                class157.field2416.clear();
                                class157.field2416.setTime(new Date(class260.method1785((byte) -104)));
                                class198.field3101[var6++] = class157.field2416.get(1);
                                continue;
                            }
                            if (var496 == 6304) {
                                var6--;
                                int var268 = class198.field3101[var6];
                                boolean var269 = true;
                                if (var268 < 0) {
                                    var269 = ((var268 + 1) % 4) == 0;
                                } else if (var268 < 1582) {
                                    var269 = var268 % 4 == 0;
                                } else if (var268 % 4 != 0) {
                                    var269 = false;
                                } else if ((var268 % 100) != 0) {
                                    var269 = true;
                                } else if (var268 % 400 != 0) {
                                    var269 = false;
                                }
                                class198.field3101[var6++] = var269 ? 1 : 0;
                                continue;
                            }
                        } else if (var496 < 6500) {
                            if (var496 == 6405) {
                                class198.field3101[var6++] = class284.method1896((byte) -117) ? 1 : 0;
                                continue;
                            }
                            if (var496 == 6406) {
                                class198.field3101[var6++] = class152.method1013((byte) -87) ? 1 : 0;
                                continue;
                            }
                        } else if (var496 < 6600) {
                            if (var496 == 6500) {
                                if (class203.field3182 == 10 && class131.field1918 == 0 && class111.field1680 == 0 && class181.field2806 == 0) {
                                    class198.field3101[var6++] = class66.method451(16472) == -1 ? 0 : 1;
                                    continue;
                                }
                                class198.field3101[var6++] = 1;
                                continue;
                            }
                            if (var496 == 6501) {
                                class157 var253 = class214.method1451(0);
                                if (var253 == null) {
                                    class198.field3101[var6++] = -1;
                                    class198.field3101[var6++] = 0;
                                    class201.field3144[var7++] = "";
                                    class198.field3101[var6++] = 0;
                                    class201.field3144[var7++] = "";
                                    class198.field3101[var6++] = 0;
                                } else {
                                    class198.field3101[var6++] = var253.field2421;
                                    class198.field3101[var6++] = var253.field1493;
                                    class201.field3144[var7++] = var253.field2423;
                                    class124 var254 = var253.method1059((byte) -101);
                                    class198.field3101[var6++] = var254.field1854;
                                    class201.field3144[var7++] = var254.field1851;
                                    class198.field3101[var6++] = var253.field1477;
                                }
                                continue;
                            }
                            if (var496 == 6502) {
                                class157 var255 = class262.method1797((byte) -96);
                                if (var255 == null) {
                                    class198.field3101[var6++] = -1;
                                    class198.field3101[var6++] = 0;
                                    class201.field3144[var7++] = "";
                                    class198.field3101[var6++] = 0;
                                    class201.field3144[var7++] = "";
                                    class198.field3101[var6++] = 0;
                                } else {
                                    class198.field3101[var6++] = var255.field2421;
                                    class198.field3101[var6++] = var255.field1493;
                                    class201.field3144[var7++] = var255.field2423;
                                    class124 var256 = var255.method1059((byte) -92);
                                    class198.field3101[var6++] = var256.field1854;
                                    class201.field3144[var7++] = var256.field1851;
                                    class198.field3101[var6++] = var255.field1477;
                                }
                                continue;
                            }
                            if (var496 == 6503) {
                                var6--;
                                int var257 = class198.field3101[var6];
                                if (class203.field3182 == 10 && class131.field1918 == 0 && class111.field1680 == 0 && class181.field2806 == 0) {
                                    class198.field3101[var6++] = class59.method425((byte) -36, var257) ? 1 : 0;
                                    continue;
                                }
                                class198.field3101[var6++] = 0;
                                continue;
                            }
                            if (var496 == 6504) {
                                var6--;
                                class238.field3807 = class198.field3101[var6];
                                class7.method45(255, class2.field23);
                                continue;
                            }
                            if (var496 == 6505) {
                                class198.field3101[var6++] = class238.field3807;
                                continue;
                            }
                            if (var496 == 6506) {
                                var6--;
                                int var258 = class198.field3101[var6];
                                class157 var259 = class245.method1655(5, var258);
                                if (var259 == null) {
                                    class198.field3101[var6++] = -1;
                                    class201.field3144[var7++] = "";
                                    class198.field3101[var6++] = 0;
                                    class201.field3144[var7++] = "";
                                    class198.field3101[var6++] = 0;
                                } else {
                                    class198.field3101[var6++] = var259.field1493;
                                    class201.field3144[var7++] = var259.field2423;
                                    class124 var260 = var259.method1059((byte) -118);
                                    class198.field3101[var6++] = var260.field1854;
                                    class201.field3144[var7++] = var260.field1851;
                                    class198.field3101[var6++] = var259.field1477;
                                }
                                continue;
                            }
                            if (var496 == 6507) {
                                var6 -= 4;
                                int var261 = class198.field3101[var6];
                                boolean var262 = class198.field3101[var6 + 1] == 1;
                                int var263 = class198.field3101[var6 + 2];
                                boolean var264 = class198.field3101[var6 + 3] == 1;
                                class237.method1612((byte) -109, var264, var262, var261, var263);
                                continue;
                            }
                        } else if (var496 < 6700) {
                            if (var496 == 6600) {
                                var6--;
                                class264.field4251 = class198.field3101[var6] == 1;
                                class7.method45(255, class2.field23);
                                continue;
                            }
                            if (var496 == 6601) {
                                class198.field3101[var6++] = class264.field4251 ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var496 == 4400) {
                        var6 -= 2;
                        int var374 = class198.field3101[var6 + 1];
                        int var375 = class198.field3101[var6];
                        class110 var376 = class222.method1512(-2, var374);
                        if (var376.method718(-12877)) {
                            class201.field3144[var7++] = class25.method224(var375, arg2 - 2).method1256(var374, var376.field1677, arg2 - 124);
                        } else {
                            class198.field3101[var6++] = class25.method224(var375, arg2 - 2).method1272(var374, var376.field1667, 107);
                        }
                        continue;
                    }
                } else {
                    class214 var56;
                    if (var496 < 2000) {
                        var56 = var46 ? class118.field1739 : class118.field1736;
                    } else {
                        var6--;
                        var56 = class206.method1403((byte) 7, class198.field3101[var6]);
                        var496 -= 1000;
                    }
                    if (var496 == 1300) {
                        var6--;
                        int var57 = class198.field3101[var6] - 1;
                        if (var57 >= 0 && var57 <= 9) {
                            var7--;
                            var56.method1449(class201.field3144[var7], var57, arg2 - 105);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var496 == 1301) {
                        var6 -= 2;
                        int var58 = class198.field3101[var6 + 1];
                        int var59 = class198.field3101[var6];
                        var56.field3361 = class136.method918(var58, -21154, var59);
                        continue;
                    }
                    if (var496 == 1302) {
                        var6--;
                        var56.field3336 = class198.field3101[var6] == 1;
                        continue;
                    }
                    if (var496 == 1303) {
                        var6--;
                        var56.field3340 = class198.field3101[var6];
                        continue;
                    }
                    if (var496 == 1304) {
                        var6--;
                        var56.field3349 = class198.field3101[var6];
                        continue;
                    }
                    if (var496 == 1305) {
                        var7--;
                        var56.field3460 = class201.field3144[var7];
                        continue;
                    }
                    if (var496 == 1306) {
                        var7--;
                        var56.field3384 = class201.field3144[var7];
                        continue;
                    }
                    if (var496 == 1307) {
                        var56.field3337 = null;
                        continue;
                    }
                    if (var496 == 1308) {
                        var6--;
                        var56.field3421 = class198.field3101[var6];
                        var6--;
                        var56.field3492 = class198.field3101[var6];
                        continue;
                    }
                    if (var496 == 1309) {
                        var6--;
                        int var60 = class198.field3101[var6];
                        var6--;
                        int var61 = class198.field3101[var6];
                        if (var61 >= 1 && var61 <= 10) {
                            var56.method1444(var60, var61 - 1, (byte) 74);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var495) {
            if (var5.field4520 == null) {
                if (class184.field2892 != 0) {
                    class106.method693("", 0, "Clientscript error - check log for details", (byte) 60);
                }
                class48.method359(1, var495, "CS2 - scr:" + var5.field1750 + " op:" + var11);
            } else {
                StringBuffer var492 = new StringBuffer(30);
                var492.append("%0a - in: ").append(var5.field4520);
                for (int var493 = class66.field924 - 1; var493 >= 0; var493--) {
                    var492.append("%0a - via: ").append(class53.field737[var493].field2708.field4520);
                }
                if (var11 == 40) {
                    int var494 = var9[var8];
                    var492.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var494));
                }
                if (class184.field2892 != 0) {
                    class106.method693("", 0, "Clientscript error in: " + var5.field4520, (byte) 72);
                }
                class48.method359(arg2 - 1, var495, "CS2 - scr:" + var5.field1750 + " op:" + var11 + var492.toString());
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([IIIIIIIIIIZ)V")
    public static final void method968(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        int var11 = arg6;
        field2144++;
        if (class127.field1880 <= arg6) {
            return;
        }
        if (class127.field1878 > arg6) {
            var11 = class127.field1878;
        }
        int var12 = arg5 + arg6;
        if (class127.field1878 >= var12) {
            return;
        }
        if (var12 > class127.field1880) {
            var12 = class127.field1880;
        }
        int var13 = arg7;
        if (class127.field1881 <= arg7) {
            return;
        }
        int var14 = arg7 + arg8;
        if (arg7 < class127.field1877) {
            var13 = class127.field1877;
        }
        if (class127.field1877 >= var14) {
            return;
        }
        if (arg4 == 9) {
            arg4 = 1;
            arg3 = arg3 + 1 & 0x3;
        }
        if (var14 > class127.field1881) {
            var14 = class127.field1881;
        }
        int var15 = var14 - arg7;
        int var16 = class127.field1873 + var11 - var12;
        if (arg1 != -2301) {
            method963(-31);
        }
        if (arg4 == 10) {
            arg3 = arg3 + 3 & 0x3;
            arg4 = 1;
        }
        if (arg4 == 11) {
            arg4 = 8;
            arg3 = arg3 + 3 & 0x3;
        }
        int var17 = var12 - arg6;
        int var18 = class127.field1873 * var13 + var11;
        int var19 = arg8 - var15;
        int var20 = var11 - arg6;
        int var21 = var13 - arg7;
        int var22 = arg5 - var20;
        int var23 = arg5 - var17;
        int var24 = arg8 - var21;
        if (arg4 == 1) {
            if (arg3 == 0) {
                for (int var25 = var21; var25 < var15; var25++) {
                    for (int var26 = var20; var26 < var17; var26++) {
                        if (var25 >= var26) {
                            arg0[var18] = arg2;
                        } else if (arg10) {
                            arg0[var18] = arg9;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg3 == 1) {
                for (int var27 = var24 - 1; var27 >= var19; var27--) {
                    for (int var28 = var20; var28 < var17; var28++) {
                        if (var28 <= var27) {
                            arg0[var18] = arg2;
                        } else if (arg10) {
                            arg0[var18] = arg9;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg3 == 2) {
                for (int var29 = var21; var29 < var15; var29++) {
                    for (int var30 = var20; var30 < var17; var30++) {
                        if (var30 >= var29) {
                            arg0[var18] = arg2;
                        } else if (arg10) {
                            arg0[var18] = arg9;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg3 == 3) {
                for (int var31 = var24 - 1; var31 >= var19; var31--) {
                    for (int var32 = var20; var32 < var17; var32++) {
                        if (var32 >= var31) {
                            arg0[var18] = arg2;
                        } else if (arg10) {
                            arg0[var18] = arg9;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            }
        } else if (arg4 == 2) {
            if (arg3 == 0) {
                for (int var33 = var24 - 1; var33 >= var19; var33--) {
                    for (int var34 = var20; var34 < var17; var34++) {
                        if (var33 >> 1 >= var34) {
                            arg0[var18] = arg2;
                        } else if (arg10) {
                            arg0[var18] = arg9;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg3 == 1) {
                for (int var35 = var21; var35 < var15; var35++) {
                    for (int var36 = var20; var36 < var17; var36++) {
                        if (var18 >= 0 && arg0.length > var18) {
                            if (var36 >= (var35 << 1)) {
                                arg0[var18] = arg2;
                            } else if (arg10) {
                                arg0[var18] = arg9;
                            }
                            var18++;
                        } else {
                            var18++;
                        }
                    }
                    var18 += var16;
                }
            } else if (arg3 == 2) {
                for (int var37 = var21; var37 < var15; var37++) {
                    for (int var38 = var22 - 1; var38 >= var23; var38--) {
                        if (var37 >> 1 >= var38) {
                            arg0[var18] = arg2;
                        } else if (arg10) {
                            arg0[var18] = arg9;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg3 == 3) {
                for (int var39 = var24 - 1; var39 >= var19; var39--) {
                    for (int var40 = var22 - 1; var40 >= var23; var40--) {
                        if (var40 >= var39 << 1) {
                            arg0[var18] = arg2;
                        } else if (arg10) {
                            arg0[var18] = arg9;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            }
        } else if (arg4 == 3) {
            if (arg3 == 0) {
                for (int var41 = var24 - 1; var41 >= var19; var41--) {
                    for (int var42 = var22 - 1; var42 >= var23; var42--) {
                        if (var41 >> 1 >= var42) {
                            arg0[var18] = arg2;
                        } else if (arg10) {
                            arg0[var18] = arg9;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg3 == 1) {
                for (int var43 = var24 - 1; var43 >= var19; var43--) {
                    for (int var44 = var20; var44 < var17; var44++) {
                        if (var44 >= (var43 << 1)) {
                            arg0[var18] = arg2;
                        } else if (arg10) {
                            arg0[var18] = arg9;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg3 == 2) {
                for (int var45 = var21; var45 < var15; var45++) {
                    for (int var46 = var20; var46 < var17; var46++) {
                        if (var46 <= var45 >> 1) {
                            arg0[var18] = arg2;
                        } else if (arg10) {
                            arg0[var18] = arg9;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg3 == 3) {
                for (int var47 = var21; var47 < var15; var47++) {
                    for (int var48 = var22 - 1; var48 >= var23; var48--) {
                        if (var48 >= var47 << 1) {
                            arg0[var18] = arg2;
                        } else if (arg10) {
                            arg0[var18] = arg9;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            }
        } else if (arg4 == 4) {
            if (arg3 == 0) {
                for (int var49 = var24 - 1; var49 >= var19; var49--) {
                    for (int var50 = var20; var50 < var17; var50++) {
                        if ((var49 >> 1) <= var50) {
                            arg0[var18] = arg2;
                        } else if (arg10) {
                            arg0[var18] = arg9;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg3 == 1) {
                for (int var51 = var21; var51 < var15; var51++) {
                    for (int var52 = var20; var52 < var17; var52++) {
                        if (var52 <= var51 << 1) {
                            arg0[var18] = arg2;
                        } else if (arg10) {
                            arg0[var18] = arg9;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg3 == 2) {
                for (int var53 = var21; var53 < var15; var53++) {
                    for (int var54 = var22 - 1; var54 >= var23; var54--) {
                        if ((var53 >> 1) <= var54) {
                            arg0[var18] = arg2;
                        } else if (arg10) {
                            arg0[var18] = arg9;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg3 == 3) {
                for (int var55 = var24 - 1; var55 >= var19; var55--) {
                    for (int var56 = var22 - 1; var56 >= var23; var56--) {
                        if (var56 <= (var55 << 1)) {
                            arg0[var18] = arg2;
                        } else if (arg10) {
                            arg0[var18] = arg9;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            }
        } else if (arg4 != 5) {
            if (arg4 == 6) {
                if (arg3 == 0) {
                    for (int var65 = var21; var65 < var15; var65++) {
                        for (int var66 = var20; var66 < var17; var66++) {
                            if ((arg5 / 2) >= var66) {
                                arg0[var18] = arg2;
                            } else if (arg10) {
                                arg0[var18] = arg9;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var67 = var21; var67 < var15; var67++) {
                        for (int var68 = var20; var68 < var17; var68++) {
                            if (var67 <= (arg8 / 2)) {
                                arg0[var18] = arg2;
                            } else if (arg10) {
                                arg0[var18] = arg9;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var69 = var21; var69 < var15; var69++) {
                        for (int var70 = var20; var70 < var17; var70++) {
                            if (arg5 / 2 <= var70) {
                                arg0[var18] = arg2;
                            } else if (arg10) {
                                arg0[var18] = arg9;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var71 = var21; var71 < var15; var71++) {
                        for (int var72 = var20; var72 < var17; var72++) {
                            if (var71 >= arg8 / 2) {
                                arg0[var18] = arg2;
                            } else if (arg10) {
                                arg0[var18] = arg9;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
            }
            if (arg4 == 7) {
                if (arg3 == 0) {
                    for (int var73 = var21; var73 < var15; var73++) {
                        for (int var74 = var20; var74 < var17; var74++) {
                            if (var74 <= (var73 - arg8 / 2)) {
                                arg0[var18] = arg2;
                            } else if (arg10) {
                                arg0[var18] = arg9;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var75 = var24 - 1; var75 >= var19; var75--) {
                        for (int var76 = var20; var76 < var17; var76++) {
                            if (var75 - (arg8 / 2) >= var76) {
                                arg0[var18] = arg2;
                            } else if (arg10) {
                                arg0[var18] = arg9;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var77 = var24 - 1; var77 >= var19; var77--) {
                        for (int var78 = var22 - 1; var78 >= var23; var78--) {
                            if ((var77 - (arg8 / 2)) >= var78) {
                                arg0[var18] = arg2;
                            } else if (arg10) {
                                arg0[var18] = arg9;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var79 = var21; var79 < var15; var79++) {
                        for (int var80 = var22 - 1; var80 >= var23; var80--) {
                            if (var79 - arg8 / 2 >= var80) {
                                arg0[var18] = arg2;
                            } else if (arg10) {
                                arg0[var18] = arg9;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
            }
            if (arg4 == 8) {
                if (arg3 == 0) {
                    for (int var81 = var21; var81 < var15; var81++) {
                        for (int var82 = var20; var82 < var17; var82++) {
                            if (var81 - (arg8 / 2) <= var82) {
                                arg0[var18] = arg2;
                            } else if (arg10) {
                                arg0[var18] = arg9;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var83 = var24 - 1; var83 >= var19; var83--) {
                        for (int var84 = var20; var84 < var17; var84++) {
                            if (var84 >= var83 - arg8 / 2) {
                                arg0[var18] = arg2;
                            } else if (arg10) {
                                arg0[var18] = arg9;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var85 = var24 - 1; var85 >= var19; var85--) {
                        for (int var86 = var22 - 1; var86 >= var23; var86--) {
                            if (var85 - (arg8 / 2) <= var86) {
                                arg0[var18] = arg2;
                            } else if (arg10) {
                                arg0[var18] = arg9;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var87 = var21; var87 < var15; var87++) {
                        for (int var88 = var22 - 1; var88 >= var23; var88--) {
                            if ((var87 - arg8 / 2) <= var88) {
                                arg0[var18] = arg2;
                            } else if (arg10) {
                                arg0[var18] = arg9;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                    return;
                }
            }
        } else if (arg3 == 0) {
            for (int var57 = var24 - 1; var57 >= var19; var57--) {
                for (int var58 = var22 - 1; var58 >= var23; var58--) {
                    if (var58 >= var57 >> 1) {
                        arg0[var18] = arg2;
                    } else if (arg10) {
                        arg0[var18] = arg9;
                    }
                    var18++;
                }
                var18 += var16;
            }
        } else if (arg3 == 1) {
            for (int var59 = var24 - 1; var59 >= var19; var59--) {
                for (int var60 = var20; var60 < var17; var60++) {
                    if (var60 <= (var59 << 1)) {
                        arg0[var18] = arg2;
                    } else if (arg10) {
                        arg0[var18] = arg9;
                    }
                    var18++;
                }
                var18 += var16;
            }
        } else if (arg3 == 2) {
            for (int var61 = var21; var61 < var15; var61++) {
                for (int var62 = var20; var62 < var17; var62++) {
                    if (var62 >= var61 >> 1) {
                        arg0[var18] = arg2;
                    } else if (arg10) {
                        arg0[var18] = arg9;
                    }
                    var18++;
                }
                var18 += var16;
            }
        } else if (arg3 == 3) {
            for (int var63 = var21; var63 < var15; var63++) {
                for (int var64 = var22 - 1; var64 >= var23; var64--) {
                    if (var64 <= (var63 << 1)) {
                        arg0[var18] = arg2;
                    } else if (arg10) {
                        arg0[var18] = arg9;
                    }
                    var18++;
                }
                var18 += var16;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)V")
    public abstract void method106(int arg0, int arg1);
}
