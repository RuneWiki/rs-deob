import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class166 extends class54 {

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public int field3174 = 0;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    public int field3182 = -1;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field3165 = 0;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "[Ldc;")
    public static class37[] field3177 = new class37[8];

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
    public static int field3180 = 0;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public int field3163;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public int field3164;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public int field3168;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public int field3173;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    public int field3175;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
    public int field3176;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    public int field3178;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public int field3183;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "Lhe;")
    public static class81 field3172;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "[I")
    public static int[] field3162;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    public static void method1114(int arg0) {
        field3172 = null;
        field3162 = null;
        field3177 = null;
        if (arg0 < 100) {
            method1114(72);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILeg;Z)V")
    public static final void method1115(int arg0, class51 arg1, boolean arg2) {
        Object[] var3 = arg1.field1042;
        int var4 = (Integer) var3[0];
        if (!arg2) {
            return;
        }
        field3166++;
        class217 var5 = class127.method893(var4, -17384);
        if (var5 == null) {
            return;
        }
        class212.field3963 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = var5.field4033;
        int[] var9 = var5.field4050;
        byte var10 = -1;
        int var11 = -1;
        try {
            class174.field3318 = new int[var5.field4044];
            int var12 = 0;
            int var13 = 0;
            class105.field1825 = new class37[var5.field4031];
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg1.field1032;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg1.field1026;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg1.field1031 == null ? -1 : arg1.field1031.field2608;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg1.field1038;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg1.field1031 == null ? -1 : arg1.field1031.field2515;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg1.field1023 == null ? -1 : arg1.field1023.field2608;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg1.field1023 == null ? -1 : arg1.field1023.field2515;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg1.field1029;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg1.field1034;
                    }
                    class174.field3318[var12++] = var15;
                } else if (var3[var14] instanceof class37) {
                    class37 var16 = (class37) var3[var14];
                    if (var16.method346(class210.field3944, (byte) -49)) {
                        var16 = arg1.field1028;
                    }
                    class105.field1825[var13++] = var16;
                }
            }
            int var17 = 0;
            label2458: while (true) {
                var17++;
                if (var17 > arg0) {
                    throw new RuntimeException("slow");
                }
                var11++;
                int var368 = var8[var11];
                if (var368 < 100) {
                    if (var368 == 0) {
                        class60.field1110[var6++] = var9[var11];
                        continue;
                    }
                    if (var368 == 1) {
                        int var18 = var9[var11];
                        class60.field1110[var6++] = class159.field3011[var18];
                        continue;
                    }
                    if (var368 == 2) {
                        int var19 = var9[var11];
                        var6--;
                        class159.field3011[var19] = class60.field1110[var6];
                        continue;
                    }
                    if (var368 == 3) {
                        class174.field3311[var7++] = var5.field4034[var11];
                        continue;
                    }
                    if (var368 == 6) {
                        var11 += var9[var11];
                        continue;
                    }
                    if (var368 == 7) {
                        var6 -= 2;
                        if (class60.field1110[var6 + 1] != class60.field1110[var6]) {
                            var11 += var9[var11];
                        }
                        continue;
                    }
                    if (var368 == 8) {
                        var6 -= 2;
                        if (class60.field1110[var6 + 1] == class60.field1110[var6]) {
                            var11 += var9[var11];
                        }
                        continue;
                    }
                    if (var368 == 9) {
                        var6 -= 2;
                        if (class60.field1110[var6 + 1] > class60.field1110[var6]) {
                            var11 += var9[var11];
                        }
                        continue;
                    }
                    if (var368 == 10) {
                        var6 -= 2;
                        if (class60.field1110[var6 + 1] < class60.field1110[var6]) {
                            var11 += var9[var11];
                        }
                        continue;
                    }
                    if (var368 == 21) {
                        if (class212.field3963 == 0) {
                            return;
                        }
                        class114 var20 = class230.field4214[--class212.field3963];
                        class105.field1825 = var20.field2044;
                        class174.field3318 = var20.field2047;
                        var11 = var20.field2034;
                        var5 = var20.field2040;
                        var8 = var5.field4033;
                        var9 = var5.field4050;
                        continue;
                    }
                    if (var368 == 25) {
                        int var21 = var9[var11];
                        class60.field1110[var6++] = class236.method1521(-68, var21);
                        continue;
                    }
                    if (var368 == 27) {
                        int var22 = var9[var11];
                        var6--;
                        class173.method1170(0, var22, class60.field1110[var6]);
                        continue;
                    }
                    if (var368 == 31) {
                        var6 -= 2;
                        if (class60.field1110[var6 + 1] >= class60.field1110[var6]) {
                            var11 += var9[var11];
                        }
                        continue;
                    }
                    if (var368 == 32) {
                        var6 -= 2;
                        if (class60.field1110[var6 + 1] <= class60.field1110[var6]) {
                            var11 += var9[var11];
                        }
                        continue;
                    }
                    if (var368 == 33) {
                        class60.field1110[var6++] = class174.field3318[var9[var11]];
                        continue;
                    }
                    int var10001;
                    if (var368 == 34) {
                        var10001 = var9[var11];
                        var6--;
                        class174.field3318[var10001] = class60.field1110[var6];
                        continue;
                    }
                    if (var368 == 35) {
                        class174.field3311[var7++] = class105.field1825[var9[var11]];
                        continue;
                    }
                    if (var368 == 36) {
                        var10001 = var9[var11];
                        var7--;
                        class105.field1825[var10001] = class174.field3311[var7];
                        continue;
                    }
                    if (var368 == 37) {
                        int var23 = var9[var11];
                        var7 -= var23;
                        class37 var24 = class192.method1282(class174.field3311, -32768, var7, var23);
                        class174.field3311[var7++] = var24;
                        continue;
                    }
                    if (var368 == 38) {
                        var6--;
                        continue;
                    }
                    if (var368 == 39) {
                        var7--;
                        continue;
                    }
                    if (var368 == 40) {
                        int var25 = var9[var11];
                        class217 var26 = class127.method893(var25, -17384);
                        class37[] var27 = new class37[var26.field4031];
                        int[] var28 = new int[var26.field4044];
                        for (int var29 = 0; var29 < var26.field4038; var29++) {
                            var28[var29] = class60.field1110[var6 + var29 - var26.field4038];
                        }
                        for (int var30 = 0; var30 < var26.field4043; var30++) {
                            var27[var30] = class174.field3311[var7 + var30 - var26.field4043];
                        }
                        var6 -= var26.field4038;
                        var7 -= var26.field4043;
                        class114 var31 = new class114();
                        var31.field2047 = class174.field3318;
                        var31.field2040 = var5;
                        var31.field2034 = var11;
                        var31.field2044 = class105.field1825;
                        if (class212.field3963 >= class230.field4214.length) {
                            throw new RuntimeException();
                        }
                        class230.field4214[class212.field3963++] = var31;
                        class174.field3318 = var28;
                        var11 = -1;
                        class105.field1825 = var27;
                        var5 = var26;
                        var9 = var26.field4050;
                        var8 = var26.field4033;
                        continue;
                    }
                    if (var368 == 42) {
                        class60.field1110[var6++] = class223.field4139[var9[var11]];
                        continue;
                    }
                    if (var368 == 43) {
                        var10001 = var9[var11];
                        var6--;
                        class223.field4139[var10001] = class60.field1110[var6];
                        continue;
                    }
                    if (var368 == 44) {
                        int var32 = var9[var11] >> 16;
                        int var33 = var9[var11] & 0xFFFF;
                        var6--;
                        int var34 = class60.field1110[var6];
                        if (var34 >= 0 && var34 <= 5000) {
                            class83.field1478[var32] = var34;
                            byte var35 = -1;
                            if (var33 == 105) {
                                var35 = 0;
                            }
                            int var36 = 0;
                            while (true) {
                                if (var36 >= var34) {
                                    continue label2458;
                                }
                                class141.field2726[var32][var36] = var35;
                                var36++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var368 == 45) {
                        int var37 = var9[var11];
                        var6--;
                        int var38 = class60.field1110[var6];
                        if (var38 >= 0 && class83.field1478[var37] > var38) {
                            class60.field1110[var6++] = class141.field2726[var37][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var368 == 46) {
                        var6 -= 2;
                        int var39 = var9[var11];
                        int var40 = class60.field1110[var6];
                        if (var40 >= 0 && class83.field1478[var39] > var40) {
                            class141.field2726[var39][var40] = class60.field1110[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var368 == 47) {
                        class37 var41 = class10.field142[var9[var11]];
                        if (var41 == null) {
                            var41 = class96.field1686;
                        }
                        class174.field3311[var7++] = var41;
                        continue;
                    }
                    if (var368 == 48) {
                        var10001 = var9[var11];
                        var7--;
                        class10.field142[var10001] = class174.field3311[var7];
                        continue;
                    }
                    if (var368 == 51) {
                        class153 var42 = var5.field4032[var9[var11]];
                        var6--;
                        class140 var43 = (class140) var42.method1047((byte) 113, (long) class60.field1110[var6]);
                        if (var43 != null) {
                            var11 += var43.field2710;
                        }
                        continue;
                    }
                }
                boolean var44;
                if (var9[var11] == 1) {
                    var44 = true;
                } else {
                    var44 = false;
                }
                if (var368 < 300) {
                    if (var368 == 100) {
                        var6 -= 3;
                        int var45 = class60.field1110[var6 + 1];
                        int var46 = class60.field1110[var6 + 2];
                        int var47 = class60.field1110[var6];
                        if (var45 == 0) {
                            throw new RuntimeException();
                        }
                        class136 var48 = class180.method1200(var47, (byte) 111);
                        if (var48.field2641 == null) {
                            var48.field2641 = new class136[var46 + 1];
                        }
                        if (var48.field2641.length <= var46) {
                            class136[] var49 = new class136[var46 + 1];
                            for (int var50 = 0; var50 < var48.field2641.length; var50++) {
                                var49[var50] = var48.field2641[var50];
                            }
                            var48.field2641 = var49;
                        }
                        if (var46 > 0 && var48.field2641[var46 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var46 - 1));
                        }
                        class136 var51 = new class136();
                        var51.field2527 = true;
                        var51.field2515 = var46;
                        var51.field2566 = var51.field2608 = var48.field2608;
                        var51.field2513 = var45;
                        var48.field2641[var46] = var51;
                        if (var44) {
                            class31.field628 = var51;
                        } else {
                            class133.field2469 = var51;
                        }
                        class210.method1395((byte) 29, var48);
                        continue;
                    }
                    if (var368 == 101) {
                        class136 var52 = var44 ? class31.field628 : class133.field2469;
                        if (var52.field2515 == -1) {
                            if (!var44) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class136 var53 = class180.method1200(var52.field2608, (byte) 111);
                        var53.field2641[var52.field2515] = null;
                        class210.method1395((byte) 29, var53);
                        continue;
                    }
                    if (var368 == 102) {
                        var6--;
                        class136 var54 = class180.method1200(class60.field1110[var6], (byte) 111);
                        var54.field2641 = null;
                        class210.method1395((byte) 29, var54);
                        continue;
                    }
                    if (var368 == 200) {
                        var6 -= 2;
                        int var55 = class60.field1110[var6];
                        int var56 = class60.field1110[var6 + 1];
                        class136 var57 = class229.method1485(var55, var56, (byte) -127);
                        if (var57 != null && var56 != -1) {
                            class60.field1110[var6++] = 1;
                            if (var44) {
                                class31.field628 = var57;
                            } else {
                                class133.field2469 = var57;
                            }
                            continue;
                        }
                        class60.field1110[var6++] = 0;
                        continue;
                    }
                    if (var368 == 201) {
                        var6--;
                        int var58 = class60.field1110[var6];
                        class136 var59 = class180.method1200(var58, (byte) 111);
                        if (var59 == null) {
                            class60.field1110[var6++] = 0;
                        } else {
                            class60.field1110[var6++] = 1;
                            if (var44) {
                                class31.field628 = var59;
                            } else {
                                class133.field2469 = var59;
                            }
                        }
                        continue;
                    }
                } else if (var368 < 500) {
                    if (var368 == 403) {
                        var6 -= 2;
                        int var60 = class60.field1110[var6 + 1];
                        int var61 = class60.field1110[var6];
                        if (var61 >= 7) {
                            var61 -= 7;
                        }
                        class238.field4382.field2191.method807(var60, -1, var61);
                        continue;
                    }
                    if (var368 == 404) {
                        var6 -= 2;
                        int var62 = class60.field1110[var6];
                        int var63 = class60.field1110[var6 + 1];
                        class238.field4382.field2191.method810(var62, var63, (byte) -101);
                        continue;
                    }
                    if (var368 == 410) {
                        var6--;
                        boolean var64 = class60.field1110[var6] != 0;
                        class238.field4382.field2191.method811(arg2, var64);
                        continue;
                    }
                } else if (var368 >= 1000 && var368 < 1100 || !(var368 < 2000 || var368 >= 2100)) {
                    class136 var361;
                    if (var368 >= 2000) {
                        var368 -= 1000;
                        var6--;
                        var361 = class180.method1200(class60.field1110[var6], (byte) 111);
                    } else {
                        var361 = var44 ? class31.field628 : class133.field2469;
                    }
                    if (var368 == 1000) {
                        var6 -= 2;
                        var361.field2661 = 0;
                        var361.field2630 = var361.field2634 = class60.field1110[var6];
                        var361.field2652 = 0;
                        var361.field2636 = var361.field2607 = class60.field1110[var6 + 1];
                        class210.method1395((byte) 29, var361);
                        continue;
                    }
                    if (var368 == 1001) {
                        var361.field2544 = 0;
                        var6 -= 2;
                        var361.field2638 = var361.field2622 = class60.field1110[var6];
                        var361.field2595 = 0;
                        var361.field2528 = 0;
                        var361.field2509 = var361.field2615 = class60.field1110[var6 + 1];
                        var361.field2586 = 0;
                        class210.method1395((byte) 29, var361);
                        if (var361.field2513 == 0) {
                            class129.method909(var361, arg2);
                        }
                        continue;
                    }
                    if (var368 == 1003) {
                        var6--;
                        boolean var362 = class60.field1110[var6] == 1;
                        if (var361.field2645 != var362) {
                            var361.field2645 = var362;
                            class210.method1395((byte) 29, var361);
                        }
                        continue;
                    }
                } else if (var368 >= 1100 && var368 < 1200 || var368 >= 2100 && var368 < 2200) {
                    class136 var358;
                    if (var368 >= 2000) {
                        var6--;
                        var358 = class180.method1200(class60.field1110[var6], (byte) 111);
                        var368 -= 1000;
                    } else {
                        var358 = var44 ? class31.field628 : class133.field2469;
                    }
                    if (var368 == 1100) {
                        var6 -= 2;
                        var358.field2519 = class60.field1110[var6];
                        if (var358.field2639 - var358.field2638 < var358.field2519) {
                            var358.field2519 = var358.field2639 - var358.field2638;
                        }
                        if (var358.field2519 < 0) {
                            var358.field2519 = 0;
                        }
                        var358.field2593 = class60.field1110[var6 + 1];
                        if (var358.field2593 > var358.field2598 - var358.field2509) {
                            var358.field2593 = var358.field2598 - var358.field2509;
                        }
                        if (var358.field2593 < 0) {
                            var358.field2593 = 0;
                        }
                        class210.method1395((byte) 29, var358);
                        continue;
                    }
                    if (var368 == 1101) {
                        var6--;
                        var358.field2543 = class60.field1110[var6];
                        class210.method1395((byte) 29, var358);
                        continue;
                    }
                    if (var368 == 1102) {
                        var6--;
                        var358.field2591 = class60.field1110[var6] == 1;
                        class210.method1395((byte) 29, var358);
                        continue;
                    }
                    if (var368 == 1103) {
                        var6--;
                        var358.field2637 = class60.field1110[var6];
                        class210.method1395((byte) 29, var358);
                        continue;
                    }
                    if (var368 == 1104) {
                        var6--;
                        var358.field2573 = class60.field1110[var6];
                        class210.method1395((byte) 29, var358);
                        continue;
                    }
                    if (var368 == 1105) {
                        var6--;
                        var358.field2582 = class60.field1110[var6];
                        class210.method1395((byte) 29, var358);
                        continue;
                    }
                    if (var368 == 1106) {
                        var6--;
                        var358.field2512 = class60.field1110[var6];
                        class210.method1395((byte) 29, var358);
                        continue;
                    }
                    if (var368 == 1107) {
                        var6--;
                        var358.field2581 = class60.field1110[var6] == 1;
                        class210.method1395((byte) 29, var358);
                        continue;
                    }
                    if (var368 == 1108) {
                        var358.field2621 = 1;
                        var6--;
                        var358.field2601 = class60.field1110[var6];
                        class210.method1395((byte) 29, var358);
                        continue;
                    }
                    if (var368 == 1109) {
                        var6 -= 6;
                        var358.field2525 = class60.field1110[var6];
                        var358.field2584 = class60.field1110[var6 + 1];
                        var358.field2617 = class60.field1110[var6 + 2];
                        var358.field2620 = class60.field1110[var6 + 3];
                        var358.field2510 = class60.field1110[var6 + 4];
                        var358.field2560 = class60.field1110[var6 + 5];
                        class210.method1395((byte) 29, var358);
                        continue;
                    }
                    if (var368 == 1110) {
                        var6--;
                        int var359 = class60.field1110[var6];
                        if (var358.field2516 != var359) {
                            var358.field2516 = var359;
                            var358.field2530 = 0;
                            var358.field2610 = 0;
                            class210.method1395((byte) 29, var358);
                        }
                        continue;
                    }
                    if (var368 == 1111) {
                        var6--;
                        var358.field2514 = class60.field1110[var6] == 1;
                        class210.method1395((byte) 29, var358);
                        continue;
                    }
                    if (var368 == 1112) {
                        var7--;
                        class37 var360 = class174.field3311[var7];
                        if (!var360.method346(var358.field2580, (byte) -49)) {
                            var358.field2580 = var360;
                            class210.method1395((byte) 29, var358);
                        }
                        continue;
                    }
                    if (var368 == 1113) {
                        var6--;
                        var358.field2578 = class60.field1110[var6];
                        class210.method1395((byte) 29, var358);
                        continue;
                    }
                    if (var368 == 1114) {
                        var6 -= 3;
                        var358.field2643 = class60.field1110[var6];
                        var358.field2555 = class60.field1110[var6 + 1];
                        var358.field2572 = class60.field1110[var6 + 2];
                        class210.method1395((byte) 29, var358);
                        continue;
                    }
                    if (var368 == 1115) {
                        var6--;
                        var358.field2579 = class60.field1110[var6] == 1;
                        class210.method1395((byte) 29, var358);
                        continue;
                    }
                    if (var368 == 1116) {
                        var6--;
                        var358.field2642 = class60.field1110[var6];
                        class210.method1395((byte) 29, var358);
                        continue;
                    }
                    if (var368 == 1117) {
                        var6--;
                        var358.field2597 = class60.field1110[var6];
                        class210.method1395((byte) 29, var358);
                        continue;
                    }
                    if (var368 == 1118) {
                        var6--;
                        var358.field2541 = class60.field1110[var6] == 1;
                        class210.method1395((byte) 29, var358);
                        continue;
                    }
                    if (var368 == 1119) {
                        var6--;
                        var358.field2651 = class60.field1110[var6] == 1;
                        class210.method1395((byte) 29, var358);
                        continue;
                    }
                    if (var368 == 1120) {
                        var6 -= 2;
                        var358.field2639 = class60.field1110[var6];
                        var358.field2598 = class60.field1110[var6 + 1];
                        class210.method1395((byte) 29, var358);
                        if (var358.field2513 == 0) {
                            class129.method909(var358, arg2);
                        }
                        continue;
                    }
                } else if (var368 >= 1200 && var368 < 1300 || !(var368 < 2200 || var368 >= 2300)) {
                    class136 var354;
                    if (var368 >= 2000) {
                        var6--;
                        var354 = class180.method1200(class60.field1110[var6], (byte) 111);
                        var368 -= 1000;
                    } else {
                        var354 = var44 ? class31.field628 : class133.field2469;
                    }
                    class210.method1395((byte) 29, var354);
                    if (var368 == 1200 || var368 == 1205) {
                        var6 -= 2;
                        int var355 = class60.field1110[var6];
                        int var356 = class60.field1110[var6 + 1];
                        if (var355 == -1) {
                            var354.field2601 = -1;
                            var354.field2621 = 1;
                            var354.field2632 = -1;
                        } else {
                            var354.field2632 = var355;
                            var354.field2644 = var356;
                            class125 var357 = class223.method1471(-66, var355);
                            if (var368 == 1205) {
                                var354.field2564 = false;
                            } else {
                                var354.field2564 = true;
                            }
                            var354.field2620 = var357.field2277;
                            var354.field2525 = var357.field2252;
                            var354.field2617 = var357.field2221;
                            var354.field2510 = var357.field2227;
                            var354.field2584 = var357.field2229;
                            var354.field2560 = var357.field2226;
                            if (var354.field2528 > 0) {
                                var354.field2560 = var354.field2560 * 32 / var354.field2528;
                            } else if (var354.field2622 > 0) {
                                var354.field2560 = var354.field2560 * 32 / var354.field2622;
                            }
                        }
                        continue;
                    }
                    if (var368 == 1201) {
                        var354.field2621 = 2;
                        var6--;
                        var354.field2601 = class60.field1110[var6];
                        continue;
                    }
                    if (var368 == 1202) {
                        var354.field2621 = 3;
                        var354.field2601 = class238.field4382.field2191.method809(64);
                        continue;
                    }
                    if (var368 == 1203) {
                        var354.field2621 = 6;
                        var6--;
                        var354.field2601 = class60.field1110[var6];
                        continue;
                    }
                    if (var368 == 1204) {
                        var354.field2621 = 5;
                        var6--;
                        var354.field2601 = class60.field1110[var6];
                        continue;
                    }
                } else if (var368 >= 1300 && var368 < 1400 || var368 >= 2300 && var368 < 2400) {
                    class136 var350;
                    if (var368 < 2000) {
                        var350 = var44 ? class31.field628 : class133.field2469;
                    } else {
                        var6--;
                        var350 = class180.method1200(class60.field1110[var6], (byte) 111);
                        var368 -= 1000;
                    }
                    if (var368 == 1300) {
                        var6--;
                        int var351 = class60.field1110[var6] - 1;
                        if (var351 >= 0 && var351 <= 9) {
                            var7--;
                            var350.method946(var351, 0, class174.field3311[var7]);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var368 == 1301) {
                        var6 -= 2;
                        int var352 = class60.field1110[var6];
                        int var353 = class60.field1110[var6 + 1];
                        var350.field2631 = class229.method1485(var352, var353, (byte) -64);
                        continue;
                    }
                    if (var368 == 1302) {
                        var6--;
                        var350.field2571 = class60.field1110[var6] == 1;
                        continue;
                    }
                    if (var368 == 1303) {
                        var6--;
                        var350.field2551 = class60.field1110[var6];
                        continue;
                    }
                    if (var368 == 1304) {
                        var6--;
                        var350.field2534 = class60.field1110[var6];
                        continue;
                    }
                    if (var368 == 1305) {
                        var7--;
                        var350.field2640 = class174.field3311[var7];
                        continue;
                    }
                    if (var368 == 1306) {
                        var7--;
                        var350.field2506 = class174.field3311[var7];
                        continue;
                    }
                    if (var368 == 1307) {
                        var350.field2531 = null;
                        continue;
                    }
                } else {
                    if (var368 >= 1400 && var368 < 1500 || var368 >= 2400 && var368 < 2500) {
                        class136 var65;
                        if (var368 >= 2000) {
                            var6--;
                            var65 = class180.method1200(class60.field1110[var6], (byte) 111);
                            var368 -= 1000;
                        } else {
                            var65 = var44 ? class31.field628 : class133.field2469;
                        }
                        int[] var66 = null;
                        var7--;
                        class37 var67 = class174.field3311[var7];
                        if (var67.method334(-61) > 0 && var67.method329((byte) 92, var67.method334(-61) - 1) == 89) {
                            var6--;
                            int var68 = class60.field1110[var6];
                            if (var68 > 0) {
                                var66 = new int[var68];
                                while (var68-- > 0) {
                                    var6--;
                                    var66[var68] = class60.field1110[var6];
                                }
                            }
                            var67 = var67.method311(var67.method334(-61) - 1, 0, true);
                        }
                        Object[] var69 = new Object[var67.method334(-61) + 1];
                        for (int var70 = var69.length - 1; var70 >= 1; var70--) {
                            if (var67.method329((byte) 100, var70 - 1) == 115) {
                                var7--;
                                var69[var70] = class174.field3311[var7];
                            } else {
                                var6--;
                                var69[var70] = Integer.valueOf(class60.field1110[var6]);
                            }
                        }
                        var6--;
                        int var71 = class60.field1110[var6];
                        if (var71 == -1) {
                            var69 = null;
                        } else {
                            var69[0] = Integer.valueOf(var71);
                        }
                        if (var368 == 1423) {
                            var65.field2629 = var69;
                        }
                        if (var368 == 1400) {
                            var65.field2518 = var69;
                        }
                        if (var368 == 1402) {
                            var65.field2533 = var69;
                        }
                        if (var368 == 1418) {
                            var65.field2575 = var69;
                        }
                        if (var368 == 1416) {
                            var65.field2536 = var69;
                        }
                        if (var368 == 1407) {
                            var65.field2559 = var69;
                            var65.field2650 = var66;
                        }
                        if (var368 == 1419) {
                            var65.field2562 = var69;
                        }
                        if (var368 == 1420) {
                            var65.field2614 = var69;
                        }
                        if (var368 == 1404) {
                            var65.field2583 = var69;
                        }
                        if (var368 == 1403) {
                            var65.field2546 = var69;
                        }
                        if (var368 == 1408) {
                            var65.field2507 = var69;
                        }
                        if (var368 == 1424) {
                            var65.field2524 = var69;
                        }
                        if (var368 == 1406) {
                            var65.field2522 = var69;
                        }
                        if (var368 == 1425) {
                            var65.field2602 = var69;
                        }
                        if (var368 == 1410) {
                            var65.field2576 = var69;
                        }
                        if (var368 == 1405) {
                            var65.field2563 = var69;
                        }
                        if (var368 == 1409) {
                            var65.field2626 = var69;
                        }
                        if (var368 == 1411) {
                            var65.field2603 = var69;
                        }
                        if (var368 == 1401) {
                            var65.field2532 = var69;
                        }
                        var65.field2594 = true;
                        if (var368 == 1421) {
                            var65.field2647 = var69;
                        }
                        if (var368 == 1422) {
                            var65.field2606 = var69;
                        }
                        if (var368 == 1412) {
                            var65.field2511 = var69;
                        }
                        if (var368 == 1414) {
                            var65.field2545 = var69;
                            var65.field2611 = var66;
                        }
                        if (var368 == 1415) {
                            var65.field2542 = var69;
                            var65.field2627 = var66;
                        }
                        if (var368 == 1417) {
                            var65.field2550 = var69;
                        }
                        continue;
                    }
                    if (var368 < 1600) {
                        class136 var72 = var44 ? class31.field628 : class133.field2469;
                        if (var368 == 1500) {
                            class60.field1110[var6++] = var72.field2630;
                            continue;
                        }
                        if (var368 == 1501) {
                            class60.field1110[var6++] = var72.field2636;
                            continue;
                        }
                        if (var368 == 1502) {
                            class60.field1110[var6++] = var72.field2638;
                            continue;
                        }
                        if (var368 == 1503) {
                            class60.field1110[var6++] = var72.field2509;
                            continue;
                        }
                        if (var368 == 1504) {
                            class60.field1110[var6++] = var72.field2645 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 1505) {
                            class60.field1110[var6++] = var72.field2566;
                            continue;
                        }
                    } else if (var368 < 1700) {
                        class136 var349 = var44 ? class31.field628 : class133.field2469;
                        if (var368 == 1600) {
                            class60.field1110[var6++] = var349.field2519;
                            continue;
                        }
                        if (var368 == 1601) {
                            class60.field1110[var6++] = var349.field2593;
                            continue;
                        }
                        if (var368 == 1602) {
                            class174.field3311[var7++] = var349.field2580;
                            continue;
                        }
                        if (var368 == 1603) {
                            class60.field1110[var6++] = var349.field2639;
                            continue;
                        }
                        if (var368 == 1604) {
                            class60.field1110[var6++] = var349.field2598;
                            continue;
                        }
                        if (var368 == 1605) {
                            class60.field1110[var6++] = var349.field2560;
                            continue;
                        }
                        if (var368 == 1606) {
                            class60.field1110[var6++] = var349.field2617;
                            continue;
                        }
                        if (var368 == 1607) {
                            class60.field1110[var6++] = var349.field2510;
                            continue;
                        }
                        if (var368 == 1608) {
                            class60.field1110[var6++] = var349.field2620;
                            continue;
                        }
                        if (var368 == 1609) {
                            class60.field1110[var6++] = var349.field2637;
                            continue;
                        }
                    } else if (var368 < 1800) {
                        class136 var348 = var44 ? class31.field628 : class133.field2469;
                        if (var368 == 1700) {
                            class60.field1110[var6++] = var348.field2632;
                            continue;
                        }
                        if (var368 == 1701) {
                            if (var348.field2632 == -1) {
                                class60.field1110[var6++] = 0;
                            } else {
                                class60.field1110[var6++] = var348.field2644;
                            }
                            continue;
                        }
                        if (var368 == 1702) {
                            class60.field1110[var6++] = var348.field2515;
                            continue;
                        }
                    } else if (var368 < 1900) {
                        class136 var346 = var44 ? class31.field628 : class133.field2469;
                        if (var368 == 1800) {
                            class60.field1110[var6++] = class165.method1111(121, class107.method699(var346, 120));
                            continue;
                        }
                        if (var368 == 1801) {
                            var6--;
                            int var347 = class60.field1110[var6];
                            int var370 = var347 - 1;
                            if (var346.field2531 != null && var346.field2531.length > var370 && var346.field2531[var370] != null) {
                                class174.field3311[var7++] = var346.field2531[var370];
                                continue;
                            }
                            class174.field3311[var7++] = class214.field3997;
                            continue;
                        }
                        if (var368 == 1802) {
                            if (var346.field2640 == null) {
                                class174.field3311[var7++] = class214.field3997;
                            } else {
                                class174.field3311[var7++] = var346.field2640;
                            }
                            continue;
                        }
                    } else if (var368 < 2600) {
                        var6--;
                        class136 var345 = class180.method1200(class60.field1110[var6], (byte) 111);
                        if (var368 == 2500) {
                            class60.field1110[var6++] = var345.field2630;
                            continue;
                        }
                        if (var368 == 2501) {
                            class60.field1110[var6++] = var345.field2636;
                            continue;
                        }
                        if (var368 == 2502) {
                            class60.field1110[var6++] = var345.field2638;
                            continue;
                        }
                        if (var368 == 2503) {
                            class60.field1110[var6++] = var345.field2509;
                            continue;
                        }
                        if (var368 == 2504) {
                            class60.field1110[var6++] = var345.field2645 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 2505) {
                            class60.field1110[var6++] = var345.field2566;
                            continue;
                        }
                    } else if (var368 < 2700) {
                        var6--;
                        class136 var344 = class180.method1200(class60.field1110[var6], (byte) 111);
                        if (var368 == 2600) {
                            class60.field1110[var6++] = var344.field2519;
                            continue;
                        }
                        if (var368 == 2601) {
                            class60.field1110[var6++] = var344.field2593;
                            continue;
                        }
                        if (var368 == 2602) {
                            class174.field3311[var7++] = var344.field2580;
                            continue;
                        }
                        if (var368 == 2603) {
                            class60.field1110[var6++] = var344.field2639;
                            continue;
                        }
                        if (var368 == 2604) {
                            class60.field1110[var6++] = var344.field2598;
                            continue;
                        }
                        if (var368 == 2605) {
                            class60.field1110[var6++] = var344.field2560;
                            continue;
                        }
                        if (var368 == 2606) {
                            class60.field1110[var6++] = var344.field2617;
                            continue;
                        }
                        if (var368 == 2607) {
                            class60.field1110[var6++] = var344.field2510;
                            continue;
                        }
                        if (var368 == 2608) {
                            class60.field1110[var6++] = var344.field2620;
                            continue;
                        }
                        if (var368 == 2609) {
                            class60.field1110[var6++] = var344.field2637;
                            continue;
                        }
                    } else if (var368 < 2800) {
                        if (var368 == 2700) {
                            var6--;
                            class136 var334 = class180.method1200(class60.field1110[var6], (byte) 111);
                            class60.field1110[var6++] = var334.field2632;
                            continue;
                        }
                        if (var368 == 2701) {
                            var6--;
                            class136 var335 = class180.method1200(class60.field1110[var6], (byte) 111);
                            if (var335.field2632 == -1) {
                                class60.field1110[var6++] = 0;
                            } else {
                                class60.field1110[var6++] = var335.field2644;
                            }
                            continue;
                        }
                        if (var368 == 2702) {
                            var6--;
                            int var336 = class60.field1110[var6];
                            class201 var337 = (class201) class85.field1499.method1047((byte) -99, (long) var336);
                            if (var337 == null) {
                                class60.field1110[var6++] = 0;
                            } else {
                                class60.field1110[var6++] = 1;
                            }
                            continue;
                        }
                        if (var368 == 2703) {
                            var6--;
                            class136 var338 = class180.method1200(class60.field1110[var6], (byte) 111);
                            if (var338.field2641 == null) {
                                class60.field1110[var6++] = 0;
                                continue;
                            }
                            int var339 = var338.field2641.length;
                            for (int var340 = 0; var340 < var338.field2641.length; var340++) {
                                if (var338.field2641[var340] == null) {
                                    var339 = var340;
                                    break;
                                }
                            }
                            class60.field1110[var6++] = var339;
                            continue;
                        }
                        if (var368 == 2704 || var368 == 2705) {
                            var6 -= 2;
                            int var341 = class60.field1110[var6];
                            int var342 = class60.field1110[var6 + 1];
                            class201 var343 = (class201) class85.field1499.method1047((byte) -123, (long) var341);
                            if (var343 != null && var343.field3746 == var342) {
                                class60.field1110[var6++] = 1;
                                continue;
                            }
                            class60.field1110[var6++] = 0;
                            continue;
                        }
                    } else if (var368 < 2900) {
                        var6--;
                        class136 var73 = class180.method1200(class60.field1110[var6], (byte) 111);
                        if (var368 == 2800) {
                            class60.field1110[var6++] = class165.method1111(-82, class107.method699(var73, 82));
                            continue;
                        }
                        if (var368 == 2801) {
                            var6--;
                            int var74 = class60.field1110[var6];
                            int var369 = var74 - 1;
                            if (var73.field2531 != null && var73.field2531.length > var369 && var73.field2531[var369] != null) {
                                class174.field3311[var7++] = var73.field2531[var369];
                                continue;
                            }
                            class174.field3311[var7++] = class214.field3997;
                            continue;
                        }
                        if (var368 == 2802) {
                            if (var73.field2640 == null) {
                                class174.field3311[var7++] = class214.field3997;
                            } else {
                                class174.field3311[var7++] = var73.field2640;
                            }
                            continue;
                        }
                    } else if (var368 < 3200) {
                        if (var368 == 3100) {
                            var7--;
                            class37 var75 = class174.field3311[var7];
                            class215.method1418(0, -1, var75, class214.field3997);
                            continue;
                        }
                        if (var368 == 3101) {
                            var6 -= 2;
                            class145.method1005(0, class60.field1110[var6 + 1], class60.field1110[var6], class238.field4382);
                            continue;
                        }
                        if (var368 == 3103) {
                            class28.method198(-7602);
                            continue;
                        }
                        if (var368 == 3104) {
                            class140.field2711++;
                            int var76 = 0;
                            var7--;
                            class37 var77 = class174.field3311[var7];
                            if (var77.method333(false)) {
                                var76 = var77.method305(true);
                            }
                            class49.field970.method1503(200, 2976);
                            class49.field970.method183(var76, -1137894376);
                            continue;
                        }
                        if (var368 == 3105) {
                            var7--;
                            class37 var78 = class174.field3311[var7];
                            class25.field427++;
                            class49.field970.method1503(179, 2976);
                            class49.field970.method190(var78.method347(-126), (byte) -108);
                            continue;
                        }
                        if (var368 == 3106) {
                            class193.field3609++;
                            var7--;
                            class37 var79 = class174.field3311[var7];
                            class49.field970.method1503(106, 2976);
                            class49.field970.method214((byte) 116, var79.method334(-61) + 1);
                            class49.field970.method200(var79, -104);
                            continue;
                        }
                        if (var368 == 3107) {
                            var6--;
                            int var80 = class60.field1110[var6];
                            var7--;
                            class37 var81 = class174.field3311[var7];
                            class212.method1407(var80, (byte) -121, var81);
                            continue;
                        }
                        if (var368 == 3108) {
                            var6 -= 3;
                            int var82 = class60.field1110[var6 + 1];
                            int var83 = class60.field1110[var6];
                            int var84 = class60.field1110[var6 + 2];
                            class136 var85 = class180.method1200(var84, (byte) 111);
                            class5.method43(var85, (byte) -114, var82, var83);
                            continue;
                        }
                        if (var368 == 3109) {
                            class136 var86 = var44 ? class31.field628 : class133.field2469;
                            var6 -= 2;
                            int var87 = class60.field1110[var6];
                            int var88 = class60.field1110[var6 + 1];
                            class5.method43(var86, (byte) -105, var88, var87);
                            continue;
                        }
                        if (var368 == 3110) {
                            class161.field3034++;
                            var6--;
                            int var89 = class60.field1110[var6];
                            class49.field970.method1503(112, 2976);
                            class49.field970.method197(var89, (byte) 51);
                            continue;
                        }
                    } else if (var368 < 3300) {
                        if (var368 == 3200) {
                            var6 -= 3;
                            class58.method447(class60.field1110[var6 + 1], class60.field1110[var6 + 2], (byte) 65, class60.field1110[var6]);
                            continue;
                        }
                        if (var368 == 3201) {
                            var6--;
                            class7.method52(class60.field1110[var6], (byte) 110);
                            continue;
                        }
                        if (var368 == 3202) {
                            var6 -= 2;
                            class85.method581((byte) 110, class60.field1110[var6 + 1], class60.field1110[var6]);
                            continue;
                        }
                    } else if (var368 < 3400) {
                        if (var368 == 3300) {
                            class60.field1110[var6++] = class203.field3758;
                            continue;
                        }
                        if (var368 == 3301) {
                            var6 -= 2;
                            int var312 = class60.field1110[var6];
                            int var313 = class60.field1110[var6 + 1];
                            class60.field1110[var6++] = class147.method1017(var313, -1, var312);
                            continue;
                        }
                        if (var368 == 3302) {
                            var6 -= 2;
                            int var314 = class60.field1110[var6 + 1];
                            int var315 = class60.field1110[var6];
                            class60.field1110[var6++] = class240.method1574((byte) -18, var314, var315);
                            continue;
                        }
                        if (var368 == 3303) {
                            var6 -= 2;
                            int var316 = class60.field1110[var6 + 1];
                            int var317 = class60.field1110[var6];
                            class60.field1110[var6++] = class191.method1272((byte) 99, var317, var316);
                            continue;
                        }
                        if (var368 == 3304) {
                            var6--;
                            int var318 = class60.field1110[var6];
                            class60.field1110[var6++] = class114.method799(var318, true).field3867;
                            continue;
                        }
                        if (var368 == 3305) {
                            var6--;
                            int var319 = class60.field1110[var6];
                            class60.field1110[var6++] = class44.field944[var319];
                            continue;
                        }
                        if (var368 == 3306) {
                            var6--;
                            int var320 = class60.field1110[var6];
                            class60.field1110[var6++] = class246.field4498[var320];
                            continue;
                        }
                        if (var368 == 3307) {
                            var6--;
                            int var321 = class60.field1110[var6];
                            class60.field1110[var6++] = class115.field2062[var321];
                            continue;
                        }
                        if (var368 == 3308) {
                            int var322 = class125.field2246;
                            int var323 = (class238.field4382.field3505 >> 7) + class99.field1735;
                            int var324 = (class238.field4382.field3490 >> 7) + class124.field2212;
                            class60.field1110[var6++] = (var322 << 28) + (var323 << 14) + var324;
                            continue;
                        }
                        if (var368 == 3309) {
                            var6--;
                            int var325 = class60.field1110[var6];
                            class60.field1110[var6++] = class58.method449(268433290, var325) >> 14;
                            continue;
                        }
                        if (var368 == 3310) {
                            var6--;
                            int var326 = class60.field1110[var6];
                            class60.field1110[var6++] = var326 >> 28;
                            continue;
                        }
                        if (var368 == 3311) {
                            var6--;
                            int var327 = class60.field1110[var6];
                            class60.field1110[var6++] = class58.method449(var327, 16383);
                            continue;
                        }
                        if (var368 == 3312) {
                            class60.field1110[var6++] = class168.field3203 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 3313) {
                            var6 -= 2;
                            int var328 = class60.field1110[var6] + 32768;
                            int var329 = class60.field1110[var6 + 1];
                            class60.field1110[var6++] = class147.method1017(var329, -1, var328);
                            continue;
                        }
                        if (var368 == 3314) {
                            var6 -= 2;
                            int var330 = class60.field1110[var6] + 32768;
                            int var331 = class60.field1110[var6 + 1];
                            class60.field1110[var6++] = class240.method1574((byte) -18, var331, var330);
                            continue;
                        }
                        if (var368 == 3315) {
                            var6 -= 2;
                            int var332 = class60.field1110[var6 + 1];
                            int var333 = class60.field1110[var6] + 32768;
                            class60.field1110[var6++] = class191.method1272((byte) 47, var333, var332);
                            continue;
                        }
                        if (var368 == 3316) {
                            if (class92.field1582 < 2) {
                                class60.field1110[var6++] = 0;
                            } else {
                                class60.field1110[var6++] = class92.field1582;
                            }
                            continue;
                        }
                        if (var368 == 3317) {
                            class60.field1110[var6++] = class77.field1359;
                            continue;
                        }
                        if (var368 == 3318) {
                            class60.field1110[var6++] = class43.field918;
                            continue;
                        }
                        if (var368 == 3321) {
                            class60.field1110[var6++] = class191.field3571;
                            continue;
                        }
                        if (var368 == 3322) {
                            class60.field1110[var6++] = class85.field1503;
                            continue;
                        }
                        if (var368 == 3323) {
                            if (class230.field4221 >= 5 && class230.field4221 <= 9) {
                                class60.field1110[var6++] = 1;
                                continue;
                            }
                            class60.field1110[var6++] = 0;
                            continue;
                        }
                        if (var368 == 3324) {
                            if (class230.field4221 >= 5 && class230.field4221 <= 9) {
                                class60.field1110[var6++] = class230.field4221;
                                continue;
                            }
                            class60.field1110[var6++] = 0;
                            continue;
                        }
                        if (var368 == 3325) {
                            if (class69.field1257 > 0) {
                                class60.field1110[var6++] = 1;
                            } else {
                                class60.field1110[var6++] = 0;
                            }
                            continue;
                        }
                        if (var368 == 3326) {
                            class60.field1110[var6++] = class238.field4382.field2181;
                            continue;
                        }
                        if (var368 == 3327) {
                            class60.field1110[var6++] = class238.field4382.field2191.field2059 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 3328) {
                            class60.field1110[var6++] = class144.field2763;
                            continue;
                        }
                        if (var368 == 3329) {
                            class60.field1110[var6++] = class78.field1365;
                            continue;
                        }
                    } else if (var368 < 3500) {
                        if (var368 == 3400) {
                            var6 -= 2;
                            int var304 = class60.field1110[var6 + 1];
                            int var305 = class60.field1110[var6];
                            class142 var306 = class9.method61(var305, false);
                            class174.field3311[var7++] = var306.method994(var304, -108);
                            continue;
                        }
                        if (var368 == 3408) {
                            var6 -= 4;
                            int var307 = class60.field1110[var6];
                            int var308 = class60.field1110[var6 + 2];
                            int var309 = class60.field1110[var6 + 1];
                            int var310 = class60.field1110[var6 + 3];
                            class142 var311 = class9.method61(var308, false);
                            if (var311.field2748 == var307 && var311.field2734 == var309) {
                                if (var309 == 115) {
                                    class174.field3311[var7++] = var311.method994(var310, -96);
                                } else {
                                    class60.field1110[var6++] = var311.method990((byte) -75, var310);
                                }
                                continue;
                            }
                            if (var309 == 115) {
                                class174.field3311[var7++] = class96.field1686;
                            } else {
                                class60.field1110[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var368 < 3700) {
                        if (var368 == 3600) {
                            if (class79.field1388 == 0) {
                                class60.field1110[var6++] = -2;
                            } else if (class79.field1388 == 1) {
                                class60.field1110[var6++] = -1;
                            } else {
                                class60.field1110[var6++] = class104.field1808;
                            }
                            continue;
                        }
                        if (var368 == 3601) {
                            var6--;
                            int var283 = class60.field1110[var6];
                            if (class79.field1388 == 2 && var283 < class104.field1808) {
                                class174.field3311[var7++] = class80.field1420[var283];
                                continue;
                            }
                            class174.field3311[var7++] = class214.field3997;
                            continue;
                        }
                        if (var368 == 3602) {
                            var6--;
                            int var284 = class60.field1110[var6];
                            if (class79.field1388 == 2 && var284 < class104.field1808) {
                                class60.field1110[var6++] = class162.field3069[var284];
                                continue;
                            }
                            class60.field1110[var6++] = 0;
                            continue;
                        }
                        if (var368 == 3603) {
                            var6--;
                            int var285 = class60.field1110[var6];
                            if (class79.field1388 == 2 && var285 < class104.field1808) {
                                class60.field1110[var6++] = class26.field455[var285];
                                continue;
                            }
                            class60.field1110[var6++] = 0;
                            continue;
                        }
                        if (var368 == 3604) {
                            var7--;
                            class37 var286 = class174.field3311[var7];
                            var6--;
                            int var287 = class60.field1110[var6];
                            class133.method925(var287, false, var286);
                            continue;
                        }
                        if (var368 == 3605) {
                            var7--;
                            class37 var288 = class174.field3311[var7];
                            class104.method675(var288.method347(-26), 32767);
                            continue;
                        }
                        if (var368 == 3606) {
                            var7--;
                            class37 var289 = class174.field3311[var7];
                            class8.method58(var289.method347(117), (byte) -111);
                            continue;
                        }
                        if (var368 == 3607) {
                            var7--;
                            class37 var290 = class174.field3311[var7];
                            class3.method31(0, var290.method347(-47));
                            continue;
                        }
                        if (var368 == 3608) {
                            var7--;
                            class37 var291 = class174.field3311[var7];
                            class131.method921(-118, var291.method347(-102));
                            continue;
                        }
                        if (var368 == 3609) {
                            var7--;
                            class37 var292 = class174.field3311[var7];
                            if (var292.method339(class205.field3810, (byte) -65) || var292.method339(class31.field616, (byte) -126)) {
                                var292 = var292.method301((byte) 126, 7);
                            }
                            class60.field1110[var6++] = class99.method659(var292, (byte) 56) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 3610) {
                            var6--;
                            int var293 = class60.field1110[var6];
                            if (class79.field1388 == 2 && class104.field1808 > var293) {
                                class174.field3311[var7++] = class204.field3784[var293];
                                continue;
                            }
                            class174.field3311[var7++] = class214.field3997;
                            continue;
                        }
                        if (var368 == 3611) {
                            if (class41.field841 == null) {
                                class174.field3311[var7++] = class214.field3997;
                            } else {
                                class174.field3311[var7++] = class41.field841.method317((byte) 59);
                            }
                            continue;
                        }
                        if (var368 == 3612) {
                            if (class41.field841 == null) {
                                class60.field1110[var6++] = 0;
                            } else {
                                class60.field1110[var6++] = class135.field2496;
                            }
                            continue;
                        }
                        if (var368 == 3613) {
                            var6--;
                            int var294 = class60.field1110[var6];
                            if (class41.field841 != null && class135.field2496 > var294) {
                                class174.field3311[var7++] = class147.field2794[var294].field2448.method317((byte) 59);
                                continue;
                            }
                            class174.field3311[var7++] = class214.field3997;
                            continue;
                        }
                        if (var368 == 3614) {
                            var6--;
                            int var295 = class60.field1110[var6];
                            if (class41.field841 != null && var295 < class135.field2496) {
                                class60.field1110[var6++] = class147.field2794[var295].field2442;
                                continue;
                            }
                            class60.field1110[var6++] = 0;
                            continue;
                        }
                        if (var368 == 3615) {
                            var6--;
                            int var296 = class60.field1110[var6];
                            if (class41.field841 != null && var296 < class135.field2496) {
                                class60.field1110[var6++] = class147.field2794[var296].field2457;
                                continue;
                            }
                            class60.field1110[var6++] = 0;
                            continue;
                        }
                        if (var368 == 3616) {
                            class60.field1110[var6++] = class223.field4141;
                            continue;
                        }
                        if (var368 == 3617) {
                            var7--;
                            class37 var297 = class174.field3311[var7];
                            class196.method1307(var297, !arg2);
                            continue;
                        }
                        if (var368 == 3618) {
                            class60.field1110[var6++] = class84.field1492;
                            continue;
                        }
                        if (var368 == 3619) {
                            var7--;
                            class37 var298 = class174.field3311[var7];
                            class207.method1371((byte) 92, var298.method347(76));
                            continue;
                        }
                        if (var368 == 3620) {
                            class89.method594(-2415);
                            continue;
                        }
                        if (var368 == 3621) {
                            if (class79.field1388 == 0) {
                                class60.field1110[var6++] = -1;
                            } else {
                                class60.field1110[var6++] = class59.field1100;
                            }
                            continue;
                        }
                        if (var368 == 3622) {
                            var6--;
                            int var299 = class60.field1110[var6];
                            if (class79.field1388 != 0 && class59.field1100 > var299) {
                                class174.field3311[var7++] = class184.method1228(-1, class193.field3606[var299]).method317((byte) 59);
                                continue;
                            }
                            class174.field3311[var7++] = class214.field3997;
                            continue;
                        }
                        if (var368 == 3623) {
                            var7--;
                            class37 var300 = class174.field3311[var7];
                            if (var300.method339(class205.field3810, (byte) -69) || var300.method339(class31.field616, (byte) -95)) {
                                var300 = var300.method301((byte) 115, 7);
                            }
                            class60.field1110[var6++] = class32.method266(127, var300) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 3624) {
                            var6--;
                            int var301 = class60.field1110[var6];
                            if (class147.field2794 != null && var301 < class135.field2496 && class147.field2794[var301].field2448.method303(class238.field4382.field2187, 40)) {
                                class60.field1110[var6++] = 1;
                                continue;
                            }
                            class60.field1110[var6++] = 0;
                            continue;
                        }
                        if (var368 == 3625) {
                            if (class31.field618 == null) {
                                class174.field3311[var7++] = class214.field3997;
                            } else {
                                class174.field3311[var7++] = class31.field618.method317((byte) 59);
                            }
                            continue;
                        }
                        if (var368 == 3626) {
                            var6--;
                            int var302 = class60.field1110[var6];
                            if (class41.field841 != null && var302 < class135.field2496) {
                                class174.field3311[var7++] = class147.field2794[var302].field2445;
                                continue;
                            }
                            class174.field3311[var7++] = class214.field3997;
                            continue;
                        }
                        if (var368 == 3627) {
                            var6--;
                            int var303 = class60.field1110[var6];
                            if (class79.field1388 == 2 && var303 < class104.field1808) {
                                class60.field1110[var6++] = class237.field4311[var303] ? 1 : 0;
                                continue;
                            }
                            class60.field1110[var6++] = 0;
                            continue;
                        }
                    } else if (var368 < 4000) {
                        if (var368 == 3903) {
                            var6--;
                            int var90 = class60.field1110[var6];
                            class60.field1110[var6++] = class200.field3744[var90].method1350(-26124);
                            continue;
                        }
                        if (var368 == 3904) {
                            var6--;
                            int var91 = class60.field1110[var6];
                            class60.field1110[var6++] = class200.field3744[var91].field3795;
                            continue;
                        }
                        if (var368 == 3905) {
                            var6--;
                            int var92 = class60.field1110[var6];
                            class60.field1110[var6++] = class200.field3744[var92].field3804;
                            continue;
                        }
                        if (var368 == 3906) {
                            var6--;
                            int var93 = class60.field1110[var6];
                            class60.field1110[var6++] = class200.field3744[var93].field3814;
                            continue;
                        }
                        if (var368 == 3907) {
                            var6--;
                            int var94 = class60.field1110[var6];
                            class60.field1110[var6++] = class200.field3744[var94].field3798;
                            continue;
                        }
                        if (var368 == 3908) {
                            var6--;
                            int var95 = class60.field1110[var6];
                            class60.field1110[var6++] = class200.field3744[var95].field3801;
                            continue;
                        }
                        if (var368 == 3910) {
                            var6--;
                            int var96 = class60.field1110[var6];
                            int var97 = class200.field3744[var96].method1352(224);
                            class60.field1110[var6++] = var97 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 3911) {
                            var6--;
                            int var98 = class60.field1110[var6];
                            int var99 = class200.field3744[var98].method1352(224);
                            class60.field1110[var6++] = var99 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 3912) {
                            var6--;
                            int var100 = class60.field1110[var6];
                            int var101 = class200.field3744[var100].method1352(224);
                            class60.field1110[var6++] = var101 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 3913) {
                            var6--;
                            int var102 = class60.field1110[var6];
                            int var103 = class200.field3744[var102].method1352(224);
                            class60.field1110[var6++] = var103 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var368 < 4100) {
                        if (var368 == 4000) {
                            var6 -= 2;
                            int var238 = class60.field1110[var6];
                            int var239 = class60.field1110[var6 + 1];
                            class60.field1110[var6++] = var238 + var239;
                            continue;
                        }
                        if (var368 == 4001) {
                            var6 -= 2;
                            int var240 = class60.field1110[var6];
                            int var241 = class60.field1110[var6 + 1];
                            class60.field1110[var6++] = var240 - var241;
                            continue;
                        }
                        if (var368 == 4002) {
                            var6 -= 2;
                            int var242 = class60.field1110[var6 + 1];
                            int var243 = class60.field1110[var6];
                            class60.field1110[var6++] = var242 * var243;
                            continue;
                        }
                        if (var368 == 4003) {
                            var6 -= 2;
                            int var244 = class60.field1110[var6 + 1];
                            int var245 = class60.field1110[var6];
                            class60.field1110[var6++] = var245 / var244;
                            continue;
                        }
                        if (var368 == 4004) {
                            var6--;
                            int var246 = class60.field1110[var6];
                            class60.field1110[var6++] = (int) (Math.random() * (double) var246);
                            continue;
                        }
                        if (var368 == 4005) {
                            var6--;
                            int var247 = class60.field1110[var6];
                            class60.field1110[var6++] = (int) ((double) (var247 + 1) * Math.random());
                            continue;
                        }
                        if (var368 == 4006) {
                            var6 -= 5;
                            int var248 = class60.field1110[var6];
                            int var249 = class60.field1110[var6 + 1];
                            int var250 = class60.field1110[var6 + 4];
                            int var251 = class60.field1110[var6 + 3];
                            int var252 = class60.field1110[var6 + 2];
                            class60.field1110[var6++] = var248 + (var249 - var248) * (var250 - var252) / (var251 - var252);
                            continue;
                        }
                        if (var368 == 4007) {
                            var6 -= 2;
                            long var253 = (long) class60.field1110[var6 + 1];
                            long var255 = (long) class60.field1110[var6];
                            class60.field1110[var6++] = (int) (var253 * var255 / 100L + var255);
                            continue;
                        }
                        if (var368 == 4008) {
                            var6 -= 2;
                            int var257 = class60.field1110[var6];
                            int var258 = class60.field1110[var6 + 1];
                            class60.field1110[var6++] = class138.method960(var257, 0x1 << var258);
                            continue;
                        }
                        if (var368 == 4009) {
                            var6 -= 2;
                            int var259 = class60.field1110[var6 + 1];
                            int var260 = class60.field1110[var6];
                            class60.field1110[var6++] = class58.method449(-(0x1 << var259) - 1, var260);
                            continue;
                        }
                        if (var368 == 4010) {
                            var6 -= 2;
                            int var261 = class60.field1110[var6];
                            int var262 = class60.field1110[var6 + 1];
                            class60.field1110[var6++] = class58.method449(var261, 0x1 << var262) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var368 == 4011) {
                            var6 -= 2;
                            int var263 = class60.field1110[var6 + 1];
                            int var264 = class60.field1110[var6];
                            class60.field1110[var6++] = var264 % var263;
                            continue;
                        }
                        if (var368 == 4012) {
                            var6 -= 2;
                            int var265 = class60.field1110[var6];
                            int var266 = class60.field1110[var6 + 1];
                            if (var265 == 0) {
                                class60.field1110[var6++] = 0;
                            } else {
                                class60.field1110[var6++] = (int) Math.pow((double) var265, (double) var266);
                            }
                            continue;
                        }
                        if (var368 == 4013) {
                            var6 -= 2;
                            int var267 = class60.field1110[var6];
                            int var268 = class60.field1110[var6 + 1];
                            if (var267 == 0) {
                                class60.field1110[var6++] = 0;
                            } else if (var268 == 0) {
                                class60.field1110[var6++] = Integer.MAX_VALUE;
                            } else {
                                class60.field1110[var6++] = (int) Math.pow((double) var267, 1.0D / (double) var268);
                            }
                            continue;
                        }
                        if (var368 == 4014) {
                            var6 -= 2;
                            int var269 = class60.field1110[var6 + 1];
                            int var270 = class60.field1110[var6];
                            class60.field1110[var6++] = class58.method449(var269, var270);
                            continue;
                        }
                        if (var368 == 4015) {
                            var6 -= 2;
                            int var271 = class60.field1110[var6];
                            int var272 = class60.field1110[var6 + 1];
                            class60.field1110[var6++] = class138.method960(var272, var271);
                            continue;
                        }
                        if (var368 == 4016) {
                            var6 -= 2;
                            int var273 = class60.field1110[var6];
                            int var274 = class60.field1110[var6 + 1];
                            class60.field1110[var6++] = var274 > var273 ? var273 : var274;
                            continue;
                        }
                        if (var368 == 4017) {
                            var6 -= 2;
                            int var275 = class60.field1110[var6];
                            int var276 = class60.field1110[var6 + 1];
                            class60.field1110[var6++] = var276 >= var275 ? var276 : var275;
                            continue;
                        }
                        if (var368 == 4018) {
                            var6 -= 3;
                            long var277 = (long) class60.field1110[var6];
                            long var279 = (long) class60.field1110[var6 + 1];
                            long var281 = (long) class60.field1110[var6 + 2];
                            class60.field1110[var6++] = (int) (var277 * var281 / var279);
                            continue;
                        }
                    } else if (var368 < 4200) {
                        if (var368 == 4100) {
                            var7--;
                            class37 var186 = class174.field3311[var7];
                            var6--;
                            int var187 = class60.field1110[var6];
                            class174.field3311[var7++] = class80.method548(new class37[] { var186, class151.method1034((byte) -9, var187) }, -54);
                            continue;
                        }
                        if (var368 == 4101) {
                            var7 -= 2;
                            class37 var188 = class174.field3311[var7];
                            class37 var189 = class174.field3311[var7 + 1];
                            class174.field3311[var7++] = class80.method548(new class37[] { var188, var189 }, -52);
                            continue;
                        }
                        if (var368 == 4102) {
                            var7--;
                            class37 var190 = class174.field3311[var7];
                            var6--;
                            int var191 = class60.field1110[var6];
                            class174.field3311[var7++] = class80.method548(new class37[] { var190, class41.method361((byte) -4, var191, true) }, -104);
                            continue;
                        }
                        if (var368 == 4103) {
                            var7--;
                            class37 var192 = class174.field3311[var7];
                            class174.field3311[var7++] = var192.method315(48);
                            continue;
                        }
                        if (var368 == 4104) {
                            var6--;
                            int var193 = class60.field1110[var6];
                            long var194 = ((long) var193 + 11745L) * 86400000L;
                            class70.field1264.setTime(new Date(var194));
                            int var196 = class70.field1264.get(5);
                            int var197 = class70.field1264.get(2);
                            int var198 = class70.field1264.get(1);
                            class174.field3311[var7++] = class80.method548(new class37[] { class151.method1034((byte) -9, var196), class106.field1852, class190.field3485[var197], class106.field1852, class151.method1034((byte) -9, var198) }, -8);
                            continue;
                        }
                        if (var368 == 4105) {
                            var7 -= 2;
                            class37 var199 = class174.field3311[var7 + 1];
                            class37 var200 = class174.field3311[var7];
                            if (class238.field4382.field2191 != null && class238.field4382.field2191.field2059) {
                                class174.field3311[var7++] = var199;
                                continue;
                            }
                            class174.field3311[var7++] = var200;
                            continue;
                        }
                        if (var368 == 4106) {
                            var6--;
                            int var201 = class60.field1110[var6];
                            class174.field3311[var7++] = class151.method1034((byte) -9, var201);
                            continue;
                        }
                        if (var368 == 4107) {
                            var7 -= 2;
                            class60.field1110[var6++] = class174.field3311[var7].method330(class174.field3311[var7 + 1], -224);
                            continue;
                        }
                        if (var368 == 4108) {
                            var6 -= 2;
                            var7--;
                            class37 var202 = class174.field3311[var7];
                            int var203 = class60.field1110[var6];
                            int var204 = class60.field1110[var6 + 1];
                            byte[] var205 = class211.field3947.method1547(0, 0, var204);
                            class90 var206 = new class90(var205);
                            var206.method617(class5.field33, null);
                            class60.field1110[var6++] = var206.method624(var202, var203);
                            continue;
                        }
                        if (var368 == 4109) {
                            var6 -= 2;
                            int var207 = class60.field1110[var6 + 1];
                            int var208 = class60.field1110[var6];
                            var7--;
                            class37 var209 = class174.field3311[var7];
                            byte[] var210 = class211.field3947.method1547(0, 0, var207);
                            class90 var211 = new class90(var210);
                            var211.method617(class5.field33, null);
                            class60.field1110[var6++] = var211.method622(var209, var208);
                            continue;
                        }
                        if (var368 == 4110) {
                            var7 -= 2;
                            class37 var212 = class174.field3311[var7 + 1];
                            class37 var213 = class174.field3311[var7];
                            var6--;
                            if (class60.field1110[var6] == 1) {
                                class174.field3311[var7++] = var213;
                            } else {
                                class174.field3311[var7++] = var212;
                            }
                            continue;
                        }
                        if (var368 == 4111) {
                            var7--;
                            class37 var214 = class174.field3311[var7];
                            class174.field3311[var7++] = class93.method629(var214);
                            continue;
                        }
                        if (var368 == 4112) {
                            var7--;
                            class37 var215 = class174.field3311[var7];
                            var6--;
                            int var216 = class60.field1110[var6];
                            if (var216 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class174.field3311[var7++] = var215.method328(40, var216);
                            continue;
                        }
                        if (var368 == 4113) {
                            var6--;
                            int var217 = class60.field1110[var6];
                            class60.field1110[var6++] = class30.method248(var217, 159) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4114) {
                            var6--;
                            int var218 = class60.field1110[var6];
                            class60.field1110[var6++] = class72.method515(var218, 122) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4115) {
                            var6--;
                            int var219 = class60.field1110[var6];
                            class60.field1110[var6++] = class237.method1528(var219, 0) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4116) {
                            var6--;
                            int var220 = class60.field1110[var6];
                            class60.field1110[var6++] = class18.method123(var220, 107) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4117) {
                            var7--;
                            class37 var221 = class174.field3311[var7];
                            if (var221 == null) {
                                class60.field1110[var6++] = 0;
                            } else {
                                class60.field1110[var6++] = var221.method334(-61);
                            }
                            continue;
                        }
                        if (var368 == 4118) {
                            var7--;
                            class37 var222 = class174.field3311[var7];
                            var6 -= 2;
                            int var223 = class60.field1110[var6];
                            int var224 = class60.field1110[var6 + 1];
                            class174.field3311[var7++] = var222.method311(var224, var223, true);
                            continue;
                        }
                        if (var368 == 4119) {
                            var7--;
                            class37 var225 = class174.field3311[var7];
                            class37 var226 = class185.method1232(var225.method334(-61), 0);
                            boolean var227 = false;
                            for (int var228 = 0; var225.method334(-61) > var228; var228++) {
                                int var229 = var225.method329((byte) 105, var228);
                                if (var229 == 60) {
                                    var227 = true;
                                } else if (var229 == 62) {
                                    var227 = false;
                                } else if (!var227) {
                                    var226.method319(var229, -119);
                                }
                            }
                            var226.method341((byte) -11);
                            class174.field3311[var7++] = var226;
                            continue;
                        }
                        if (var368 == 4120) {
                            var6 -= 2;
                            var7--;
                            class37 var230 = class174.field3311[var7];
                            int var231 = class60.field1110[var6 + 1];
                            int var232 = class60.field1110[var6];
                            class60.field1110[var6++] = var230.method342((byte) 127, var231, var232);
                            continue;
                        }
                        if (var368 == 4121) {
                            var7 -= 2;
                            class37 var233 = class174.field3311[var7];
                            class37 var234 = class174.field3311[var7 + 1];
                            var6--;
                            int var235 = class60.field1110[var6];
                            class60.field1110[var6++] = var233.method324(-34, var235, var234);
                            continue;
                        }
                        if (var368 == 4122) {
                            var6--;
                            int var236 = class60.field1110[var6];
                            class60.field1110[var6++] = class217.method1440(var236, 192);
                            continue;
                        }
                        if (var368 == 4123) {
                            var6--;
                            int var237 = class60.field1110[var6];
                            class60.field1110[var6++] = class205.method1354(var237, 6);
                            continue;
                        }
                    } else if (var368 < 4300) {
                        if (var368 == 4200) {
                            var6--;
                            int var170 = class60.field1110[var6];
                            class174.field3311[var7++] = class223.method1471(127, var170).field2232;
                            continue;
                        }
                        if (var368 == 4201) {
                            var6 -= 2;
                            int var171 = class60.field1110[var6];
                            int var172 = class60.field1110[var6 + 1];
                            class125 var173 = class223.method1471(117, var171);
                            if (var172 >= 1 && var172 <= 5 && var173.field2275[var172 - 1] != null) {
                                class174.field3311[var7++] = var173.field2275[var172 - 1];
                                continue;
                            }
                            class174.field3311[var7++] = class214.field3997;
                            continue;
                        }
                        if (var368 == 4202) {
                            var6 -= 2;
                            int var174 = class60.field1110[var6 + 1];
                            int var175 = class60.field1110[var6];
                            class125 var176 = class223.method1471(116, var175);
                            if (var174 >= 1 && var174 <= 5 && var176.field2240[var174 - 1] != null) {
                                class174.field3311[var7++] = var176.field2240[var174 - 1];
                                continue;
                            }
                            class174.field3311[var7++] = class214.field3997;
                            continue;
                        }
                        if (var368 == 4203) {
                            var6--;
                            int var177 = class60.field1110[var6];
                            class60.field1110[var6++] = class223.method1471(-25, var177).field2283;
                            continue;
                        }
                        if (var368 == 4204) {
                            var6--;
                            int var178 = class60.field1110[var6];
                            class60.field1110[var6++] = class223.method1471(123, var178).field2225 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4205) {
                            var6--;
                            int var179 = class60.field1110[var6];
                            class125 var180 = class223.method1471(117, var179);
                            if (var180.field2285 == -1 && var180.field2291 >= 0) {
                                class60.field1110[var6++] = var180.field2291;
                                continue;
                            }
                            class60.field1110[var6++] = var179;
                            continue;
                        }
                        if (var368 == 4206) {
                            var6--;
                            int var181 = class60.field1110[var6];
                            class125 var182 = class223.method1471(-125, var181);
                            if (var182.field2285 >= 0 && var182.field2291 >= 0) {
                                class60.field1110[var6++] = var182.field2291;
                                continue;
                            }
                            class60.field1110[var6++] = var181;
                            continue;
                        }
                        if (var368 == 4207) {
                            var6--;
                            int var183 = class60.field1110[var6];
                            class60.field1110[var6++] = class223.method1471(-72, var183).field2238 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4210) {
                            var7--;
                            class37 var184 = class174.field3311[var7];
                            var6--;
                            int var185 = class60.field1110[var6];
                            class106.method697(var185 == 1, var184, (byte) 115);
                            class60.field1110[var6++] = class2.field13;
                            continue;
                        }
                        if (var368 == 4211) {
                            if (class18.field268 != null && class2.field13 > class147.field2804) {
                                class60.field1110[var6++] = class58.method449(65535, class18.field268[class147.field2804++]);
                                continue;
                            }
                            class60.field1110[var6++] = -1;
                            continue;
                        }
                        if (var368 == 4212) {
                            class147.field2804 = 0;
                            continue;
                        }
                    } else if (var368 < 5100) {
                        if (var368 == 5000) {
                            class60.field1110[var6++] = class17.field263;
                            continue;
                        }
                        if (var368 == 5001) {
                            class131.field2453++;
                            var6 -= 3;
                            class17.field263 = class60.field1110[var6];
                            class204.field3788 = class60.field1110[var6 + 1];
                            class66.field1185 = class60.field1110[var6 + 2];
                            class49.field970.method1503(54, 2976);
                            class49.field970.method214((byte) 124, class17.field263);
                            class49.field970.method214((byte) 127, class204.field3788);
                            class49.field970.method214((byte) 116, class66.field1185);
                            continue;
                        }
                        if (var368 == 5002) {
                            var6 -= 2;
                            class239.field4390++;
                            var7--;
                            class37 var107 = class174.field3311[var7];
                            int var108 = class60.field1110[var6];
                            int var109 = class60.field1110[var6 + 1];
                            class49.field970.method1503(206, 2976);
                            class49.field970.method190(var107.method347(-83), (byte) -128);
                            class49.field970.method214((byte) 108, var108 - 1);
                            class49.field970.method214((byte) 105, var109);
                            continue;
                        }
                        if (var368 == 5003) {
                            var6--;
                            int var110 = class60.field1110[var6];
                            class37 var111 = null;
                            if (var110 < 100) {
                                var111 = class163.field3087[var110];
                            }
                            if (var111 == null) {
                                var111 = class214.field3997;
                            }
                            class174.field3311[var7++] = var111;
                            continue;
                        }
                        if (var368 == 5004) {
                            var6--;
                            int var112 = class60.field1110[var6];
                            int var113 = -1;
                            if (var112 < 100 && class163.field3087[var112] != null) {
                                var113 = class62.field1146[var112];
                            }
                            class60.field1110[var6++] = var113;
                            continue;
                        }
                        if (var368 == 5005) {
                            class60.field1110[var6++] = class204.field3788;
                            continue;
                        }
                        if (var368 == 5008) {
                            var7--;
                            class37 var114 = class174.field3311[var7];
                            if (var114.method339(class105.field1826, (byte) -83)) {
                                class118.method817(126, var114);
                                continue;
                            }
                            if (class92.field1582 == 0 && (class144.field2763 == 1 || class78.field1365 == 1)) {
                                continue;
                            }
                            class37 var115 = var114.method315(48);
                            class7.field76++;
                            byte var116 = 0;
                            byte var117 = 0;
                            if (var115.method339(class38.field806, (byte) -86)) {
                                var117 = 0;
                                var114 = var114.method301((byte) 122, class38.field806.method334(-61));
                            } else if (var115.method339(class70.field1271, (byte) -61)) {
                                var117 = 1;
                                var114 = var114.method301((byte) 72, class70.field1271.method334(-61));
                            } else if (var115.method339(class11.field148, (byte) -86)) {
                                var117 = 2;
                                var114 = var114.method301((byte) 65, class11.field148.method334(-61));
                            } else if (var115.method339(class238.field4373, (byte) -82)) {
                                var117 = 3;
                                var114 = var114.method301((byte) 81, class238.field4373.method334(-61));
                            } else if (var115.method339(class176.field3330, (byte) -83)) {
                                var117 = 4;
                                var114 = var114.method301((byte) 69, class176.field3330.method334(-61));
                            } else if (var115.method339(class75.field1322, (byte) -107)) {
                                var114 = var114.method301((byte) 82, class75.field1322.method334(-61));
                                var117 = 5;
                            } else if (var115.method339(class196.field3666, (byte) -102)) {
                                var117 = 6;
                                var114 = var114.method301((byte) 104, class196.field3666.method334(-61));
                            } else if (var115.method339(class129.field2437, (byte) -74)) {
                                var114 = var114.method301((byte) 74, class129.field2437.method334(-61));
                                var117 = 7;
                            } else if (var115.method339(class173.field3305, (byte) -71)) {
                                var117 = 8;
                                var114 = var114.method301((byte) 77, class173.field3305.method334(-61));
                            } else if (var115.method339(class189.field3442, (byte) -64)) {
                                var117 = 9;
                                var114 = var114.method301((byte) 79, class189.field3442.method334(-61));
                            } else if (var115.method339(class211.field3953, (byte) -67)) {
                                var117 = 10;
                                var114 = var114.method301((byte) 125, class211.field3953.method334(-61));
                            } else if (var115.method339(class19.field320, (byte) -118)) {
                                var117 = 11;
                                var114 = var114.method301((byte) 117, class19.field320.method334(-61));
                            } else if (class160.field3033 != 0) {
                                if (var115.method339(class38.field795, (byte) -83)) {
                                    var114 = var114.method301((byte) 83, class38.field795.method334(-61));
                                    var117 = 0;
                                } else if (var115.method339(class70.field1272, (byte) -86)) {
                                    var114 = var114.method301((byte) 95, class70.field1272.method334(-61));
                                    var117 = 1;
                                } else if (var115.method339(class11.field157, (byte) -127)) {
                                    var114 = var114.method301((byte) 95, class11.field157.method334(-61));
                                    var117 = 2;
                                } else if (var115.method339(class238.field4379, (byte) -104)) {
                                    var114 = var114.method301((byte) 109, class238.field4379.method334(-61));
                                    var117 = 3;
                                } else if (var115.method339(class176.field3336, (byte) -86)) {
                                    var114 = var114.method301((byte) 107, class176.field3336.method334(-61));
                                    var117 = 4;
                                } else if (var115.method339(class75.field1332, (byte) -75)) {
                                    var117 = 5;
                                    var114 = var114.method301((byte) 74, class75.field1332.method334(-61));
                                } else if (var115.method339(class196.field3669, (byte) -93)) {
                                    var117 = 6;
                                    var114 = var114.method301((byte) 114, class196.field3669.method334(-61));
                                } else if (var115.method339(class129.field2428, (byte) -116)) {
                                    var117 = 7;
                                    var114 = var114.method301((byte) 99, class129.field2428.method334(-61));
                                } else if (var115.method339(class173.field3307, (byte) -82)) {
                                    var117 = 8;
                                    var114 = var114.method301((byte) 89, class173.field3307.method334(-61));
                                } else if (var115.method339(class189.field3446, (byte) -122)) {
                                    var117 = 9;
                                    var114 = var114.method301((byte) 105, class189.field3446.method334(-61));
                                } else if (var115.method339(class211.field3956, (byte) -78)) {
                                    var117 = 10;
                                    var114 = var114.method301((byte) 126, class211.field3956.method334(-61));
                                } else if (var115.method339(class19.field304, (byte) -97)) {
                                    var117 = 11;
                                    var114 = var114.method301((byte) 120, class19.field304.method334(-61));
                                }
                            }
                            class37 var118 = var114.method315(48);
                            if (var118.method339(class227.field4173, (byte) -68)) {
                                var116 = 1;
                                var114 = var114.method301((byte) 88, class227.field4173.method334(-61));
                            } else if (var118.method339(class244.field4467, (byte) -68)) {
                                var116 = 2;
                                var114 = var114.method301((byte) 126, class244.field4467.method334(-61));
                            } else if (var118.method339(class108.field1880, (byte) -80)) {
                                var114 = var114.method301((byte) 65, class108.field1880.method334(-61));
                                var116 = 3;
                            } else if (var118.method339(class32.field654, (byte) -72)) {
                                var116 = 4;
                                var114 = var114.method301((byte) 110, class32.field654.method334(-61));
                            } else if (var118.method339(class99.field1732, (byte) -100)) {
                                var114 = var114.method301((byte) 98, class99.field1732.method334(-61));
                                var116 = 5;
                            } else if (class160.field3033 != 0) {
                                if (var118.method339(class227.field4176, (byte) -84)) {
                                    var116 = 1;
                                    var114 = var114.method301((byte) 114, class227.field4176.method334(-61));
                                } else if (var118.method339(class244.field4472, (byte) -118)) {
                                    var114 = var114.method301((byte) 110, class244.field4472.method334(-61));
                                    var116 = 2;
                                } else if (var118.method339(class108.field1881, (byte) -112)) {
                                    var114 = var114.method301((byte) 124, class108.field1881.method334(-61));
                                    var116 = 3;
                                } else if (var118.method339(class32.field644, (byte) -77)) {
                                    var114 = var114.method301((byte) 88, class32.field644.method334(-61));
                                    var116 = 4;
                                } else if (var118.method339(class99.field1726, (byte) -114)) {
                                    var116 = 5;
                                    var114 = var114.method301((byte) 122, class99.field1726.method334(-61));
                                }
                            }
                            class49.field970.method1503(104, 2976);
                            class49.field970.method214((byte) 106, 0);
                            int var119 = class49.field970.field526;
                            class49.field970.method214((byte) 104, var117);
                            class49.field970.method214((byte) 113, var116);
                            class80.method547(class49.field970, var114, 0);
                            class49.field970.method231((byte) 21, class49.field970.field526 - var119);
                            continue;
                        }
                        if (var368 == 5009) {
                            var7 -= 2;
                            class37 var120 = class174.field3311[var7];
                            class37 var121 = class174.field3311[var7 + 1];
                            if (class92.field1582 != 0 || class144.field2763 != 1 && class78.field1365 != 1) {
                                class49.field970.method1503(69, 2976);
                                class163.field3082++;
                                class49.field970.method214((byte) 108, 0);
                                int var122 = class49.field970.field526;
                                class49.field970.method190(var120.method347(92), (byte) -112);
                                class80.method547(class49.field970, var121, 0);
                                class49.field970.method231((byte) 21, class49.field970.field526 - var122);
                            }
                            continue;
                        }
                        if (var368 == 5010) {
                            var6--;
                            int var123 = class60.field1110[var6];
                            class37 var124 = null;
                            if (var123 < 100) {
                                var124 = class83.field1480[var123];
                            }
                            if (var124 == null) {
                                var124 = class214.field3997;
                            }
                            class174.field3311[var7++] = var124;
                            continue;
                        }
                        if (var368 == 5011) {
                            var6--;
                            int var125 = class60.field1110[var6];
                            class37 var126 = null;
                            if (var125 < 100) {
                                var126 = class102.field1760[var125];
                            }
                            if (var126 == null) {
                                var126 = class214.field3997;
                            }
                            class174.field3311[var7++] = var126;
                            continue;
                        }
                        if (var368 == 5012) {
                            var6--;
                            int var127 = class60.field1110[var6];
                            int var128 = -1;
                            if (var127 < 100) {
                                var128 = class223.field4140[var127];
                            }
                            class60.field1110[var6++] = var128;
                            continue;
                        }
                        if (var368 == 5015) {
                            class37 var129;
                            if (class238.field4382 == null || class238.field4382.field2187 == null) {
                                var129 = class19.field325;
                            } else {
                                var129 = class238.field4382.field2187;
                            }
                            class174.field3311[var7++] = var129;
                            continue;
                        }
                        if (var368 == 5016) {
                            class60.field1110[var6++] = class66.field1185;
                            continue;
                        }
                        if (var368 == 5017) {
                            class60.field1110[var6++] = class121.field2162;
                            continue;
                        }
                        if (var368 == 5050) {
                            var6--;
                            int var130 = class60.field1110[var6];
                            class174.field3311[var7++] = class194.method1294(var130, 1221).field3027;
                            continue;
                        }
                        if (var368 == 5051) {
                            var6--;
                            int var131 = class60.field1110[var6];
                            class160 var132 = class194.method1294(var131, 1221);
                            if (var132.field3021 == null) {
                                class60.field1110[var6++] = 0;
                            } else {
                                class60.field1110[var6++] = var132.field3021.length;
                            }
                            continue;
                        }
                        if (var368 == 5052) {
                            var6 -= 2;
                            int var133 = class60.field1110[var6];
                            int var134 = class60.field1110[var6 + 1];
                            class160 var135 = class194.method1294(var133, 1221);
                            int var136 = var135.field3021[var134];
                            class60.field1110[var6++] = var136;
                            continue;
                        }
                        if (var368 == 5053) {
                            var6--;
                            int var137 = class60.field1110[var6];
                            class160 var138 = class194.method1294(var137, 1221);
                            if (var138.field3026 == null) {
                                class60.field1110[var6++] = 0;
                            } else {
                                class60.field1110[var6++] = var138.field3026.length;
                            }
                            continue;
                        }
                        if (var368 == 5054) {
                            var6 -= 2;
                            int var139 = class60.field1110[var6];
                            int var140 = class60.field1110[var6 + 1];
                            class60.field1110[var6++] = class194.method1294(var139, 1221).field3026[var140];
                            continue;
                        }
                        if (var368 == 5055) {
                            var6--;
                            int var141 = class60.field1110[var6];
                            class174.field3311[var7++] = class66.method486(var141, 1).method971((byte) 67);
                            continue;
                        }
                        if (var368 == 5056) {
                            var6--;
                            int var142 = class60.field1110[var6];
                            class139 var143 = class66.method486(var142, 1);
                            if (var143.field2693 == null) {
                                class60.field1110[var6++] = 0;
                            } else {
                                class60.field1110[var6++] = var143.field2693.length;
                            }
                            continue;
                        }
                        if (var368 == 5057) {
                            var6 -= 2;
                            int var144 = class60.field1110[var6];
                            int var145 = class60.field1110[var6 + 1];
                            class60.field1110[var6++] = class66.method486(var144, 1).field2693[var145];
                            continue;
                        }
                        if (var368 == 5058) {
                            class105.field1824 = new class99();
                            var6--;
                            class105.field1824.field1718 = class60.field1110[var6];
                            class105.field1824.field1719 = class66.method486(class105.field1824.field1718, 1);
                            class105.field1824.field1721 = new int[class105.field1824.field1719.method975(0)];
                            continue;
                        }
                        if (var368 == 5059) {
                            class49.field970.method1503(246, 2976);
                            class49.field970.method214((byte) 126, 0);
                            class222.field4117++;
                            int var146 = class49.field970.field526;
                            class49.field970.method214((byte) 124, 0);
                            class49.field970.method197(class105.field1824.field1718, (byte) 51);
                            class105.field1824.field1719.method972(class49.field970, 4056, class105.field1824.field1721);
                            class49.field970.method231((byte) 21, class49.field970.field526 - var146);
                            continue;
                        }
                        if (var368 == 5060) {
                            class224.field4143++;
                            var7--;
                            class37 var147 = class174.field3311[var7];
                            class49.field970.method1503(227, 2976);
                            class49.field970.method214((byte) 117, 0);
                            int var148 = class49.field970.field526;
                            class49.field970.method190(var147.method347(126), (byte) -123);
                            class49.field970.method197(class105.field1824.field1718, (byte) 51);
                            class105.field1824.field1719.method972(class49.field970, 4056, class105.field1824.field1721);
                            class49.field970.method231((byte) 21, class49.field970.field526 - var148);
                            continue;
                        }
                        if (var368 == 5061) {
                            class49.field970.method1503(246, 2976);
                            class222.field4117++;
                            class49.field970.method214((byte) 113, 0);
                            int var149 = class49.field970.field526;
                            class49.field970.method214((byte) 117, 1);
                            class49.field970.method197(class105.field1824.field1718, (byte) 51);
                            class105.field1824.field1719.method972(class49.field970, 4056, class105.field1824.field1721);
                            class49.field970.method231((byte) 21, class49.field970.field526 - var149);
                            continue;
                        }
                        if (var368 == 5062) {
                            var6 -= 2;
                            int var150 = class60.field1110[var6 + 1];
                            int var151 = class60.field1110[var6];
                            class60.field1110[var6++] = class194.method1294(var151, 1221).field3023[var150];
                            continue;
                        }
                        if (var368 == 5063) {
                            var6 -= 2;
                            int var152 = class60.field1110[var6];
                            int var153 = class60.field1110[var6 + 1];
                            class60.field1110[var6++] = class194.method1294(var152, 1221).field3014[var153];
                            continue;
                        }
                        if (var368 == 5064) {
                            var6 -= 2;
                            int var154 = class60.field1110[var6];
                            int var155 = class60.field1110[var6 + 1];
                            if (var155 == -1) {
                                class60.field1110[var6++] = -1;
                            } else {
                                class60.field1110[var6++] = class194.method1294(var154, 1221).method1077(var155, (byte) -125);
                            }
                            continue;
                        }
                        if (var368 == 5065) {
                            var6 -= 2;
                            int var156 = class60.field1110[var6];
                            int var157 = class60.field1110[var6 + 1];
                            if (var157 == -1) {
                                class60.field1110[var6++] = -1;
                            } else {
                                class60.field1110[var6++] = class194.method1294(var156, 1221).method1073((byte) -85, var157);
                            }
                            continue;
                        }
                        if (var368 == 5066) {
                            var6--;
                            int var158 = class60.field1110[var6];
                            class60.field1110[var6++] = class66.method486(var158, 1).method975(0);
                            continue;
                        }
                        if (var368 == 5067) {
                            var6 -= 2;
                            int var159 = class60.field1110[var6 + 1];
                            int var160 = class60.field1110[var6];
                            int var161 = class66.method486(var160, 1).method973(0, var159);
                            System.out.println("chatphrase_getdynamiccommand=" + var161);
                            class60.field1110[var6++] = var161;
                            continue;
                        }
                        if (var368 == 5068) {
                            var6 -= 2;
                            int var162 = class60.field1110[var6];
                            int var163 = class60.field1110[var6 + 1];
                            class105.field1824.field1721[var162] = var163;
                            continue;
                        }
                        if (var368 == 5069) {
                            var6 -= 2;
                            int var164 = class60.field1110[var6];
                            int var165 = class60.field1110[var6 + 1];
                            class105.field1824.field1721[var164] = var165;
                            continue;
                        }
                        if (var368 == 5070) {
                            var6 -= 3;
                            int var166 = class60.field1110[var6];
                            int var167 = class60.field1110[var6 + 1];
                            int var168 = class60.field1110[var6 + 2];
                            class139 var169 = class66.method486(var166, 1);
                            if (var169.method973(0, var167) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            class60.field1110[var6++] = var169.method967(var167, -121, var168);
                            continue;
                        }
                    } else if (var368 < 5200) {
                        if (var368 == 5100) {
                            if (class229.field4204[86]) {
                                class60.field1110[var6++] = 1;
                            } else {
                                class60.field1110[var6++] = 0;
                            }
                            continue;
                        }
                        if (var368 == 5101) {
                            if (class229.field4204[82]) {
                                class60.field1110[var6++] = 1;
                            } else {
                                class60.field1110[var6++] = 0;
                            }
                            continue;
                        }
                        if (var368 == 5102) {
                            if (class229.field4204[81]) {
                                class60.field1110[var6++] = 1;
                            } else {
                                class60.field1110[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var368 < 5300) {
                        if (var368 == 5200) {
                            var6--;
                            class196.method1309(-7606, class60.field1110[var6]);
                            continue;
                        }
                        if (var368 == 5201) {
                            class60.field1110[var6++] = class113.method796(16493);
                            continue;
                        }
                        if (var368 == 5202) {
                            var6--;
                            class112.method790(class60.field1110[var6], -101);
                            continue;
                        }
                        if (var368 == 5203) {
                            var7--;
                            class171.method1156((byte) 71, class174.field3311[var7]);
                            continue;
                        }
                        if (var368 == 5204) {
                            class174.field3311[var7 - 1] = class137.method956(class174.field3311[var7 - 1], (byte) 88);
                            continue;
                        }
                        if (var368 == 5205) {
                            var7--;
                            class129.method908(-314128180, class174.field3311[var7]);
                            continue;
                        }
                    } else if (var368 < 5400) {
                        if (var368 == 5304) {
                            class60.field1110[var6++] = 0;
                            continue;
                        }
                    } else if (var368 < 5500) {
                        if (var368 == 5400) {
                            class58.field1078++;
                            var7 -= 2;
                            class37 var104 = class174.field3311[var7 + 1];
                            var6--;
                            int var105 = class60.field1110[var6];
                            class37 var106 = class174.field3311[var7];
                            class49.field970.method1503(240, 2976);
                            class49.field970.method214((byte) 111, class183.method1224(var106, (byte) 51) + class183.method1224(var104, (byte) 24) + 1);
                            class49.field970.method200(var106, -126);
                            class49.field970.method200(var104, -91);
                            class49.field970.method214((byte) 120, var105);
                            continue;
                        }
                        if (var368 == 5401) {
                            var6 -= 2;
                            class165.field3129[class60.field1110[var6]] = (short) class157.method1065(class60.field1110[var6 + 1], 4);
                            class129.method911((byte) 69);
                            class141.method984((byte) 117);
                            class222.method1464(arg2);
                            class16.method117(0);
                            class11.method73(11980);
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var367) {
            if (var5.field4048 == null) {
                if (class50.field1018 != 0) {
                    class215.method1418(0, -1, class194.field3625, class214.field3997);
                }
                class60.method455(95, var367, "CS2 - scr:" + var5.field1066 + " op:" + var10);
            } else {
                class37 var364 = class185.method1232(30, 0);
                var364.method320(class153.field2898, (byte) 115).method320(var5.field4048, (byte) 95);
                for (int var365 = class212.field3963 - 1; var365 >= 0; var365--) {
                    var364.method320(class52.field1049, (byte) 95).method320(class230.field4214[var365].field2040.field4048, (byte) 106);
                }
                if (var10 == 40) {
                    int var366 = var9[var11];
                    var364.method320(client.field683, (byte) 125).method320(class151.method1034((byte) -9, var366), (byte) 112);
                }
                if (class50.field1018 != 0) {
                    class215.method1418(0, -1, class80.method548(new class37[] { class80.field1422, var5.field4048 }, -34), class214.field3997);
                }
                class60.method455(95, var367, "CS2 - scr:" + var5.field1066 + " op:" + var10 + new String(var364.method310(arg2)));
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
    public static final void method1116(byte arg0) {
        field3170++;
        if (arg0 != 41) {
            return;
        }
        for (int var1 = 0; var1 < class19.field309; var1++) {
            int var2 = class214.field4000[var1];
            class66 var3 = class70.field1262[var2];
            int var4 = class12.field167.method215(-1797813752);
            if ((var4 & 0x1) != 0) {
                int var5 = class12.field167.method189((byte) 93);
                int var6 = class12.field167.method227(-116);
                var3.method1265(arg0 - 31, var5, var6, class203.field3758);
                var3.field3469 = class203.field3758 + 300;
                var3.field3539 = class12.field167.method227(-100);
            }
            if ((var4 & 0x10) != 0) {
                var3.field3501 = class12.field167.method180(2);
                var3.field3470 = 100;
            }
            if ((var4 & 0x20) != 0) {
                var3.field3479 = class12.field167.method234((byte) 82);
                var3.field3523 = class12.field167.method196(124);
            }
            if ((var4 & 0x4) != 0) {
                var3.field1190 = class59.method452(false, class12.field167.method196(arg0 + 83));
                var3.field3486 = var3.field1190.field3826;
                var3.field3461 = var3.field1190.field3830;
                var3.field3472 = var3.field1190.field3820;
                var3.field3509 = var3.field1190.field3821;
                var3.field3531 = var3.field1190.field3848;
                var3.field3522 = var3.field1190.field3859;
                var3.field3466 = var3.field1190.field3822;
                var3.field3499 = var3.field1190.field3851;
                var3.field3484 = var3.field1190.field3840;
            }
            if ((var4 & 0x40) != 0) {
                var3.field3517 = class12.field167.method196(arg0 + 83);
                if (var3.field3517 == 65535) {
                    var3.field3517 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field3541 = class12.field167.method234((byte) 82);
                int var7 = class12.field167.method195(120);
                var3.field3502 = (var7 & 0xFFFF) + class203.field3758;
                var3.field3492 = 0;
                if (var3.field3541 == 65535) {
                    var3.field3541 = -1;
                }
                var3.field3478 = var7 >> 16;
                var3.field3526 = 0;
                if (var3.field3502 > class203.field3758) {
                    var3.field3526 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                int var8 = class12.field167.method196(arg0 + 84);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class12.field167.method215(arg0 ^ 0x94D78A21);
                class122.method835(var8, var3, var9, arg0 ^ 0xFFFFFFD6);
            }
            if ((var4 & 0x2) != 0) {
                int var10 = class12.field167.method212(arg0 ^ 0x54);
                int var11 = class12.field167.method189((byte) 123);
                var3.method1265(10, var10, var11, class203.field3758);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
    public static final void method1117(int arg0) {
        class180.field3358 = true;
        field3171++;
        if (arg0 != 112) {
            field3165 = 64;
        }
        class16.field259 = true;
    }
}
