import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class138 extends class67 {

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
    public int field2863 = 0;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    public int field2865 = -1;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "Led;")
    private static class43 field2861 = class191.method1219("Loading interfaces )2 ", false);

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "Led;")
    public static class43 field2855 = field2861;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "Led;")
    public static class43 field2862 = class191.method1219("AUS", false);

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public int field2853;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public int field2857;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public int field2858;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public int field2859;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    public int field2864;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
    public int field2867;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public int field2868;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
    public int field2869;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    public int field2870;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    public int field2871;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "Lga;")
    public static class58 field2854;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
    public static final void method891(int arg0) {
        field2866++;
        if (client.field542 != null) {
            client.field542.method522(-23002);
        }
        if (arg0 <= 13) {
            method893((byte) 57);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILmf;I)V")
    public static final void method892(int arg0, class115 arg1, int arg2) {
        field2856++;
        Object[] var3 = arg1.field2238;
        int var4 = (Integer) var3[0];
        class204 var5 = class127.method820(104, var4);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        class156.field3152 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field3976;
        byte var10 = -1;
        int[] var11 = var5.field3974;
        try {
            class105.field2007 = new class43[var5.field3968];
            class39.field753 = new int[var5.field3981];
            if (arg2 != 25969) {
                method892(-128, null, -90);
            }
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg1.field2255;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg1.field2247;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg1.field2249 == null ? -1 : arg1.field2249.field2664;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg1.field2252;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg1.field2249 == null ? -1 : arg1.field2249.field2661;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg1.field2251 == null ? -1 : arg1.field2251.field2664;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg1.field2251 == null ? -1 : arg1.field2251.field2661;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg1.field2254;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg1.field2232;
                    }
                    class39.field753[var12++] = var16;
                } else if (var3[var14] instanceof class43) {
                    class43 var15 = (class43) var3[var14];
                    if (var15.method257(class154.field3124, 58)) {
                        var15 = arg1.field2228;
                    }
                    class105.field2007[var13++] = var15;
                }
            }
            int var17 = 0;
            label2187: while (true) {
                var17++;
                if (var17 > arg0) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var311 = var9[var8];
                if (var311 < 100) {
                    if (var311 == 0) {
                        class129.field2615[var6++] = var11[var8];
                        continue;
                    }
                    if (var311 == 1) {
                        int var18 = var11[var8];
                        class129.field2615[var6++] = class30.field569[var18];
                        continue;
                    }
                    if (var311 == 2) {
                        int var19 = var11[var8];
                        var6--;
                        class30.field569[var19] = class129.field2615[var6];
                        continue;
                    }
                    if (var311 == 3) {
                        class43.field852[var7++] = var5.field3972[var8];
                        continue;
                    }
                    if (var311 == 6) {
                        var8 += var11[var8];
                        continue;
                    }
                    if (var311 == 7) {
                        var6 -= 2;
                        if (class129.field2615[var6 + 1] != class129.field2615[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var311 == 8) {
                        var6 -= 2;
                        if (class129.field2615[var6 + 1] == class129.field2615[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var311 == 9) {
                        var6 -= 2;
                        if (class129.field2615[var6] < class129.field2615[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var311 == 10) {
                        var6 -= 2;
                        if (class129.field2615[var6] > class129.field2615[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var311 == 21) {
                        if (class156.field3152 == 0) {
                            return;
                        }
                        class61 var20 = class43.field822[--class156.field3152];
                        var5 = var20.field1255;
                        var8 = var20.field1256;
                        class39.field753 = var20.field1253;
                        class105.field2007 = var20.field1250;
                        var11 = var5.field3974;
                        var9 = var5.field3976;
                        continue;
                    }
                    if (var311 == 25) {
                        int var21 = var11[var8];
                        class129.field2615[var6++] = class119.method765(0, var21);
                        continue;
                    }
                    if (var311 == 27) {
                        int var22 = var11[var8];
                        var6--;
                        class186.method1191(class129.field2615[var6], var22, arg2 - 12104);
                        continue;
                    }
                    if (var311 == 31) {
                        var6 -= 2;
                        if (class129.field2615[var6 + 1] >= class129.field2615[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var311 == 32) {
                        var6 -= 2;
                        if (class129.field2615[var6 + 1] <= class129.field2615[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var311 == 33) {
                        class129.field2615[var6++] = class39.field753[var11[var8]];
                        continue;
                    }
                    int var10001;
                    if (var311 == 34) {
                        var10001 = var11[var8];
                        var6--;
                        class39.field753[var10001] = class129.field2615[var6];
                        continue;
                    }
                    if (var311 == 35) {
                        class43.field852[var7++] = class105.field2007[var11[var8]];
                        continue;
                    }
                    if (var311 == 36) {
                        var10001 = var11[var8];
                        var7--;
                        class105.field2007[var10001] = class43.field852[var7];
                        continue;
                    }
                    if (var311 == 37) {
                        int var23 = var11[var8];
                        var7 -= var23;
                        class43 var24 = class80.method495(class43.field852, var7, var23, 255);
                        class43.field852[var7++] = var24;
                        continue;
                    }
                    if (var311 == 38) {
                        var6--;
                        continue;
                    }
                    if (var311 == 39) {
                        var7--;
                        continue;
                    }
                    if (var311 == 40) {
                        int var25 = var11[var8];
                        class204 var26 = class127.method820(84, var25);
                        int[] var27 = new int[var26.field3981];
                        class43[] var28 = new class43[var26.field3968];
                        for (int var29 = 0; var29 < var26.field3973; var29++) {
                            var27[var29] = class129.field2615[var6 + var29 - var26.field3973];
                        }
                        for (int var30 = 0; var30 < var26.field3978; var30++) {
                            var28[var30] = class43.field852[var7 + var30 - var26.field3978];
                        }
                        var6 -= var26.field3973;
                        var7 -= var26.field3978;
                        class61 var31 = new class61();
                        var31.field1255 = var5;
                        var31.field1253 = class39.field753;
                        var31.field1256 = var8;
                        var31.field1250 = class105.field2007;
                        if (class43.field822.length <= class156.field3152) {
                            throw new RuntimeException();
                        }
                        class43.field822[class156.field3152++] = var31;
                        class39.field753 = var27;
                        var5 = var26;
                        class105.field2007 = var28;
                        var8 = -1;
                        var9 = var26.field3976;
                        var11 = var26.field3974;
                        continue;
                    }
                    if (var311 == 42) {
                        class129.field2615[var6++] = class51.field1033[var11[var8]];
                        continue;
                    }
                    if (var311 == 43) {
                        var10001 = var11[var8];
                        var6--;
                        class51.field1033[var10001] = class129.field2615[var6];
                        continue;
                    }
                    if (var311 == 44) {
                        int var32 = var11[var8] >> 16;
                        var6--;
                        int var33 = class129.field2615[var6];
                        int var34 = var11[var8] & 0xFFFF;
                        if (var33 >= 0 && var33 <= 5000) {
                            class28.field499[var32] = var33;
                            byte var35 = -1;
                            if (var34 == 105) {
                                var35 = 0;
                            }
                            int var36 = 0;
                            while (true) {
                                if (var33 <= var36) {
                                    continue label2187;
                                }
                                class17.field275[var32][var36] = var35;
                                var36++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var311 == 45) {
                        int var37 = var11[var8];
                        var6--;
                        int var38 = class129.field2615[var6];
                        if (var38 >= 0 && class28.field499[var37] > var38) {
                            class129.field2615[var6++] = class17.field275[var37][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var311 == 46) {
                        var6 -= 2;
                        int var39 = var11[var8];
                        int var40 = class129.field2615[var6];
                        if (var40 >= 0 && var40 < class28.field499[var39]) {
                            class17.field275[var39][var40] = class129.field2615[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var311 == 47) {
                        class43 var41 = class81.field1609[var11[var8]];
                        if (var41 == null) {
                            var41 = class13.field193;
                        }
                        class43.field852[var7++] = var41;
                        continue;
                    }
                    if (var311 == 48) {
                        var10001 = var11[var8];
                        var7--;
                        class81.field1609[var10001] = class43.field852[var7];
                        continue;
                    }
                }
                boolean var42;
                if (var11[var8] == 1) {
                    var42 = true;
                } else {
                    var42 = false;
                }
                if (var311 < 1000) {
                    if (var311 == 100) {
                        var6 -= 3;
                        int var291 = class129.field2615[var6];
                        int var292 = class129.field2615[var6 + 2];
                        int var293 = class129.field2615[var6 + 1];
                        if (var293 == 0) {
                            throw new RuntimeException();
                        }
                        class129 var294 = class124.method801((byte) -36, var291);
                        if (var294.field2626 == null) {
                            var294.field2626 = new class129[var292 + 1];
                        }
                        if (var294.field2626.length <= var292) {
                            class129[] var295 = new class129[var292 + 1];
                            for (int var296 = 0; var296 < var294.field2626.length; var296++) {
                                var295[var296] = var294.field2626[var296];
                            }
                            var294.field2626 = var295;
                        }
                        if (var292 > 0 && var294.field2626[var292 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var292 - 1));
                        }
                        class129 var297 = new class129();
                        var297.field2576 = var297.field2664 = var294.field2664;
                        var297.field2707 = true;
                        var297.field2661 = var292;
                        var297.field2690 = var293;
                        var294.field2626[var292] = var297;
                        if (var42) {
                            class36.field665 = var297;
                        } else {
                            class121.field2411 = var297;
                        }
                        class43.method265(false, var294);
                        continue;
                    }
                    if (var311 == 101) {
                        class129 var298 = var42 ? class36.field665 : class121.field2411;
                        if (var298.field2661 == -1) {
                            if (!var42) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class129 var299 = class124.method801((byte) -36, var298.field2664);
                        var299.field2626[var298.field2661] = null;
                        class43.method265(false, var299);
                        continue;
                    }
                    if (var311 == 102) {
                        var6--;
                        class129 var300 = class124.method801((byte) -36, class129.field2615[var6]);
                        var300.field2626 = null;
                        class43.method265(false, var300);
                        continue;
                    }
                    if (var311 == 200) {
                        var6 -= 2;
                        int var301 = class129.field2615[var6];
                        int var302 = class129.field2615[var6 + 1];
                        class129 var303 = class133.method858(-1, var301, var302);
                        if (var303 != null && var302 != -1) {
                            class129.field2615[var6++] = 1;
                            if (var42) {
                                class36.field665 = var303;
                            } else {
                                class121.field2411 = var303;
                            }
                            continue;
                        }
                        class129.field2615[var6++] = 0;
                        continue;
                    }
                    if (var311 == 201) {
                        var6--;
                        int var304 = class129.field2615[var6];
                        class129 var305 = class124.method801((byte) -36, var304);
                        if (var305 == null) {
                            class129.field2615[var6++] = 0;
                        } else {
                            class129.field2615[var6++] = 1;
                            if (var42) {
                                class36.field665 = var305;
                            } else {
                                class121.field2411 = var305;
                            }
                        }
                        continue;
                    }
                } else if (var311 >= 1000 && var311 < 1100 || !(var311 < 2000 || var311 >= 2100)) {
                    class129 var43;
                    if (var311 >= 2000) {
                        var6--;
                        var43 = class124.method801((byte) -36, class129.field2615[var6]);
                        var311 -= 1000;
                    } else {
                        var43 = var42 ? class36.field665 : class121.field2411;
                    }
                    if (var311 == 1000) {
                        var6 -= 2;
                        var43.field2633 = class129.field2615[var6];
                        var43.field2607 = class129.field2615[var6 + 1];
                        class43.method265(false, var43);
                        continue;
                    }
                    if (var311 == 1001) {
                        var6 -= 2;
                        var43.field2656 = class129.field2615[var6];
                        var43.field2662 = class129.field2615[var6 + 1];
                        class43.method265(false, var43);
                        continue;
                    }
                    if (var311 == 1003) {
                        var6--;
                        boolean var44 = class129.field2615[var6] == 1;
                        if (var43.field2686 != var44) {
                            var43.field2686 = var44;
                            class43.method265(false, var43);
                        }
                        continue;
                    }
                } else if (var311 >= 1100 && var311 < 1200 || var311 >= 2100 && var311 < 2200) {
                    class129 var45;
                    if (var311 < 2000) {
                        var45 = var42 ? class36.field665 : class121.field2411;
                    } else {
                        var311 -= 1000;
                        var6--;
                        var45 = class124.method801((byte) -36, class129.field2615[var6]);
                    }
                    if (var311 == 1100) {
                        var6 -= 2;
                        var45.field2572 = class129.field2615[var6];
                        if (var45.field2663 - var45.field2656 < var45.field2572) {
                            var45.field2572 = var45.field2663 - var45.field2656;
                        }
                        if (var45.field2572 < 0) {
                            var45.field2572 = 0;
                        }
                        var45.field2680 = class129.field2615[var6 + 1];
                        if (var45.field2680 > var45.field2590 - var45.field2662) {
                            var45.field2680 = var45.field2590 - var45.field2662;
                        }
                        if (var45.field2680 < 0) {
                            var45.field2680 = 0;
                        }
                        class43.method265(false, var45);
                        continue;
                    }
                    if (var311 == 1101) {
                        var6--;
                        var45.field2655 = class129.field2615[var6];
                        class43.method265(false, var45);
                        continue;
                    }
                    if (var311 == 1102) {
                        var6--;
                        var45.field2637 = class129.field2615[var6] == 1;
                        class43.method265(false, var45);
                        continue;
                    }
                    if (var311 == 1103) {
                        var6--;
                        var45.field2631 = class129.field2615[var6];
                        class43.method265(false, var45);
                        continue;
                    }
                    if (var311 == 1104) {
                        var6--;
                        var45.field2677 = class129.field2615[var6];
                        class43.method265(false, var45);
                        continue;
                    }
                    if (var311 == 1105) {
                        var6--;
                        var45.field2623 = class129.field2615[var6];
                        class43.method265(false, var45);
                        continue;
                    }
                    if (var311 == 1106) {
                        var6--;
                        var45.field2688 = class129.field2615[var6];
                        class43.method265(false, var45);
                        continue;
                    }
                    if (var311 == 1107) {
                        var6--;
                        var45.field2594 = class129.field2615[var6] == 1;
                        class43.method265(false, var45);
                        continue;
                    }
                    if (var311 == 1108) {
                        var45.field2635 = 1;
                        var6--;
                        var45.field2604 = class129.field2615[var6];
                        class43.method265(false, var45);
                        continue;
                    }
                    if (var311 == 1109) {
                        var6 -= 6;
                        var45.field2616 = class129.field2615[var6];
                        var45.field2695 = class129.field2615[var6 + 1];
                        var45.field2592 = class129.field2615[var6 + 2];
                        var45.field2591 = class129.field2615[var6 + 3];
                        var45.field2605 = class129.field2615[var6 + 4];
                        var45.field2682 = class129.field2615[var6 + 5];
                        class43.method265(false, var45);
                        continue;
                    }
                    if (var311 == 1110) {
                        var6--;
                        int var46 = class129.field2615[var6];
                        if (var45.field2586 != var46) {
                            var45.field2589 = 0;
                            var45.field2586 = var46;
                            var45.field2674 = 0;
                            class43.method265(false, var45);
                        }
                        continue;
                    }
                    if (var311 == 1111) {
                        var6--;
                        var45.field2614 = class129.field2615[var6] == 1;
                        class43.method265(false, var45);
                        continue;
                    }
                    if (var311 == 1112) {
                        var7--;
                        class43 var47 = class43.field852[var7];
                        if (!var47.method257(var45.field2596, 45)) {
                            var45.field2596 = var47;
                            class43.method265(false, var45);
                        }
                        continue;
                    }
                    if (var311 == 1113) {
                        var6--;
                        var45.field2678 = class129.field2615[var6];
                        class43.method265(false, var45);
                        continue;
                    }
                    if (var311 == 1114) {
                        var6 -= 3;
                        var45.field2624 = class129.field2615[var6];
                        var45.field2606 = class129.field2615[var6 + 1];
                        var45.field2672 = class129.field2615[var6 + 2];
                        class43.method265(false, var45);
                        continue;
                    }
                    if (var311 == 1115) {
                        var6--;
                        var45.field2622 = class129.field2615[var6] == 1;
                        class43.method265(false, var45);
                        continue;
                    }
                    if (var311 == 1116) {
                        var6--;
                        var45.field2641 = class129.field2615[var6];
                        class43.method265(false, var45);
                        continue;
                    }
                    if (var311 == 1117) {
                        var6--;
                        var45.field2698 = class129.field2615[var6];
                        class43.method265(false, var45);
                        continue;
                    }
                    if (var311 == 1118) {
                        var6--;
                        var45.field2706 = class129.field2615[var6] == 1;
                        class43.method265(false, var45);
                        continue;
                    }
                    if (var311 == 1119) {
                        var6--;
                        var45.field2620 = class129.field2615[var6] == 1;
                        class43.method265(false, var45);
                        continue;
                    }
                    if (var311 == 1120) {
                        var6 -= 2;
                        var45.field2663 = class129.field2615[var6];
                        var45.field2590 = class129.field2615[var6 + 1];
                        class43.method265(false, var45);
                        continue;
                    }
                } else if (var311 >= 1200 && var311 < 1300 || !(var311 < 2200 || var311 >= 2300)) {
                    class129 var48;
                    if (var311 < 2000) {
                        var48 = var42 ? class36.field665 : class121.field2411;
                    } else {
                        var311 -= 1000;
                        var6--;
                        var48 = class124.method801((byte) -36, class129.field2615[var6]);
                    }
                    class43.method265(false, var48);
                    if (var311 == 1200) {
                        var6 -= 2;
                        int var49 = class129.field2615[var6];
                        int var50 = class129.field2615[var6 + 1];
                        var48.field2666 = var49;
                        var48.field2577 = var50;
                        class46 var51 = class2.method18(var49, arg2 - 25969);
                        var48.field2591 = var51.field935;
                        var48.field2682 = var51.field923;
                        var48.field2605 = var51.field927;
                        var48.field2616 = var51.field903;
                        var48.field2695 = var51.field891;
                        var48.field2592 = var51.field943;
                        if (var48.field2656 > 0) {
                            var48.field2682 = var48.field2682 * 32 / var48.field2656;
                        }
                        continue;
                    }
                    if (var311 == 1201) {
                        var48.field2635 = 2;
                        var6--;
                        var48.field2604 = class129.field2615[var6];
                        continue;
                    }
                    if (var311 == 1202) {
                        var48.field2635 = 3;
                        var48.field2604 = class67.field1348.field24.method467((byte) -63);
                        continue;
                    }
                    if (var311 == 1203) {
                        var48.field2635 = 6;
                        var6--;
                        var48.field2604 = class129.field2615[var6];
                        continue;
                    }
                    if (var311 == 1204) {
                        var48.field2635 = 5;
                        var6--;
                        var48.field2604 = class129.field2615[var6];
                        continue;
                    }
                } else if (var311 >= 1300 && var311 < 1400 || var311 >= 2300 && var311 < 2400) {
                    class129 var287;
                    if (var311 >= 2000) {
                        var311 -= 1000;
                        var6--;
                        var287 = class124.method801((byte) -36, class129.field2615[var6]);
                    } else {
                        var287 = var42 ? class36.field665 : class121.field2411;
                    }
                    if (var311 == 1300) {
                        var6--;
                        int var288 = class129.field2615[var6] - 1;
                        if (var288 >= 0 && var288 <= 9) {
                            var7--;
                            var287.method836(true, class43.field852[var7], var288);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var311 == 1301) {
                        var6 -= 2;
                        int var289 = class129.field2615[var6];
                        int var290 = class129.field2615[var6 + 1];
                        var287.field2704 = class133.method858(-1, var289, var290);
                        continue;
                    }
                    if (var311 == 1302) {
                        var6--;
                        var287.field2708 = class129.field2615[var6] == 1;
                        continue;
                    }
                    if (var311 == 1303) {
                        var6--;
                        var287.field2618 = class129.field2615[var6];
                        continue;
                    }
                    if (var311 == 1304) {
                        var6--;
                        var287.field2697 = class129.field2615[var6];
                        continue;
                    }
                    if (var311 == 1305) {
                        var7--;
                        var287.field2587 = class43.field852[var7];
                        continue;
                    }
                    if (var311 == 1306) {
                        var7--;
                        var287.field2593 = class43.field852[var7];
                        continue;
                    }
                    if (var311 == 1307) {
                        var287.field2645 = null;
                        continue;
                    }
                } else {
                    if (var311 >= 1400 && var311 < 1500 || var311 >= 2400 && var311 < 2500) {
                        class129 var280;
                        if (var311 >= 2000) {
                            var311 -= 1000;
                            var6--;
                            var280 = class124.method801((byte) -36, class129.field2615[var6]);
                        } else {
                            var280 = var42 ? class36.field665 : class121.field2411;
                        }
                        int[] var281 = null;
                        var7--;
                        class43 var282 = class43.field852[var7];
                        if (var282.method248((byte) 60) > 0 && var282.method256(true, var282.method248((byte) 60) - 1) == 89) {
                            var6--;
                            int var283 = class129.field2615[var6];
                            if (var283 > 0) {
                                var281 = new int[var283];
                                while (var283-- > 0) {
                                    var6--;
                                    var281[var283] = class129.field2615[var6];
                                }
                            }
                            var282 = var282.method241((byte) -52, 0, var282.method248((byte) 60) - 1);
                        }
                        Object[] var284 = new Object[var282.method248((byte) 60) + 1];
                        for (int var285 = var284.length - 1; var285 >= 1; var285--) {
                            if (var282.method256(true, var285 - 1) == 115) {
                                var7--;
                                var284[var285] = class43.field852[var7];
                            } else {
                                var6--;
                                var284[var285] = Integer.valueOf(class129.field2615[var6]);
                            }
                        }
                        var6--;
                        int var286 = class129.field2615[var6];
                        if (var286 == -1) {
                            var284 = null;
                        } else {
                            var284[0] = Integer.valueOf(var286);
                        }
                        if (var311 == 1402) {
                            var280.field2675 = var284;
                        }
                        if (var311 == 1411) {
                            var280.field2651 = var284;
                        }
                        if (var311 == 1408) {
                            var280.field2709 = var284;
                        }
                        if (var311 == 1410) {
                            var280.field2640 = var284;
                        }
                        if (var311 == 1407) {
                            var280.field2585 = var281;
                            var280.field2575 = var284;
                        }
                        if (var311 == 1404) {
                            var280.field2630 = var284;
                        }
                        if (var311 == 1421) {
                            var280.field2669 = var284;
                        }
                        if (var311 == 1416) {
                            var280.field2632 = var284;
                        }
                        if (var311 == 1412) {
                            var280.field2694 = var284;
                        }
                        if (var311 == 1424) {
                            var280.field2657 = var284;
                        }
                        if (var311 == 1415) {
                            var280.field2658 = var284;
                            var280.field2634 = var281;
                        }
                        if (var311 == 1423) {
                            var280.field2583 = var284;
                        }
                        if (var311 == 1422) {
                            var280.field2617 = var284;
                        }
                        if (var311 == 1418) {
                            var280.field2676 = var284;
                        }
                        if (var311 == 1406) {
                            var280.field2611 = var284;
                        }
                        if (var311 == 1417) {
                            var280.field2684 = var284;
                        }
                        if (var311 == 1425) {
                            var280.field2703 = var284;
                        }
                        if (var311 == 1403) {
                            var280.field2595 = var284;
                        }
                        if (var311 == 1414) {
                            var280.field2660 = var284;
                            var280.field2644 = var281;
                        }
                        if (var311 == 1420) {
                            var280.field2580 = var284;
                        }
                        if (var311 == 1401) {
                            var280.field2578 = var284;
                        }
                        var280.field2654 = true;
                        if (var311 == 1405) {
                            var280.field2681 = var284;
                        }
                        if (var311 == 1419) {
                            var280.field2693 = var284;
                        }
                        if (var311 == 1409) {
                            var280.field2700 = var284;
                        }
                        if (var311 == 1400) {
                            var280.field2687 = var284;
                        }
                        continue;
                    }
                    if (var311 < 1600) {
                        class129 var279 = var42 ? class36.field665 : class121.field2411;
                        if (var311 == 1500) {
                            class129.field2615[var6++] = var279.field2633;
                            continue;
                        }
                        if (var311 == 1501) {
                            class129.field2615[var6++] = var279.field2607;
                            continue;
                        }
                        if (var311 == 1502) {
                            class129.field2615[var6++] = var279.field2656;
                            continue;
                        }
                        if (var311 == 1503) {
                            class129.field2615[var6++] = var279.field2662;
                            continue;
                        }
                        if (var311 == 1504) {
                            class129.field2615[var6++] = var279.field2686 ? 1 : 0;
                            continue;
                        }
                        if (var311 == 1505) {
                            class129.field2615[var6++] = var279.field2576;
                            continue;
                        }
                    } else if (var311 < 1700) {
                        class129 var278 = var42 ? class36.field665 : class121.field2411;
                        if (var311 == 1600) {
                            class129.field2615[var6++] = var278.field2572;
                            continue;
                        }
                        if (var311 == 1601) {
                            class129.field2615[var6++] = var278.field2680;
                            continue;
                        }
                        if (var311 == 1602) {
                            class43.field852[var7++] = var278.field2596;
                            continue;
                        }
                        if (var311 == 1603) {
                            class129.field2615[var6++] = var278.field2663;
                            continue;
                        }
                        if (var311 == 1604) {
                            class129.field2615[var6++] = var278.field2590;
                            continue;
                        }
                        if (var311 == 1605) {
                            class129.field2615[var6++] = var278.field2682;
                            continue;
                        }
                        if (var311 == 1606) {
                            class129.field2615[var6++] = var278.field2592;
                            continue;
                        }
                        if (var311 == 1607) {
                            class129.field2615[var6++] = var278.field2605;
                            continue;
                        }
                        if (var311 == 1608) {
                            class129.field2615[var6++] = var278.field2591;
                            continue;
                        }
                        if (var311 == 1609) {
                            class129.field2615[var6++] = var278.field2631;
                            continue;
                        }
                    } else if (var311 < 1800) {
                        class129 var277 = var42 ? class36.field665 : class121.field2411;
                        if (var311 == 1700) {
                            class129.field2615[var6++] = var277.field2666;
                            continue;
                        }
                        if (var311 == 1701) {
                            if (var277.field2666 == -1) {
                                class129.field2615[var6++] = 0;
                            } else {
                                class129.field2615[var6++] = var277.field2577;
                            }
                            continue;
                        }
                        if (var311 == 1702) {
                            class129.field2615[var6++] = var277.field2661;
                            continue;
                        }
                    } else if (var311 < 1900) {
                        class129 var275 = var42 ? class36.field665 : class121.field2411;
                        if (var311 == 1800) {
                            class129.field2615[var6++] = class37.method206(class193.method1231((byte) 121, var275), arg2 - 26071);
                            continue;
                        }
                        if (var311 == 1801) {
                            var6--;
                            int var276 = class129.field2615[var6];
                            int var313 = var276 - 1;
                            if (var275.field2645 != null && var313 < var275.field2645.length && var275.field2645[var313] != null) {
                                class43.field852[var7++] = var275.field2645[var313];
                                continue;
                            }
                            class43.field852[var7++] = class157.field3186;
                            continue;
                        }
                        if (var311 == 1802) {
                            if (var275.field2587 == null) {
                                class43.field852[var7++] = class157.field3186;
                            } else {
                                class43.field852[var7++] = var275.field2587;
                            }
                            continue;
                        }
                    } else if (var311 < 2600) {
                        var6--;
                        class129 var52 = class124.method801((byte) -36, class129.field2615[var6]);
                        if (var311 == 2500) {
                            class129.field2615[var6++] = var52.field2633;
                            continue;
                        }
                        if (var311 == 2501) {
                            class129.field2615[var6++] = var52.field2607;
                            continue;
                        }
                        if (var311 == 2502) {
                            class129.field2615[var6++] = var52.field2656;
                            continue;
                        }
                        if (var311 == 2503) {
                            class129.field2615[var6++] = var52.field2662;
                            continue;
                        }
                        if (var311 == 2504) {
                            class129.field2615[var6++] = var52.field2686 ? 1 : 0;
                            continue;
                        }
                        if (var311 == 2505) {
                            class129.field2615[var6++] = var52.field2576;
                            continue;
                        }
                    } else if (var311 < 2700) {
                        var6--;
                        class129 var274 = class124.method801((byte) -36, class129.field2615[var6]);
                        if (var311 == 2600) {
                            class129.field2615[var6++] = var274.field2572;
                            continue;
                        }
                        if (var311 == 2601) {
                            class129.field2615[var6++] = var274.field2680;
                            continue;
                        }
                        if (var311 == 2602) {
                            class43.field852[var7++] = var274.field2596;
                            continue;
                        }
                        if (var311 == 2603) {
                            class129.field2615[var6++] = var274.field2663;
                            continue;
                        }
                        if (var311 == 2604) {
                            class129.field2615[var6++] = var274.field2590;
                            continue;
                        }
                        if (var311 == 2605) {
                            class129.field2615[var6++] = var274.field2682;
                            continue;
                        }
                        if (var311 == 2606) {
                            class129.field2615[var6++] = var274.field2592;
                            continue;
                        }
                        if (var311 == 2607) {
                            class129.field2615[var6++] = var274.field2605;
                            continue;
                        }
                        if (var311 == 2608) {
                            class129.field2615[var6++] = var274.field2591;
                            continue;
                        }
                        if (var311 == 2609) {
                            class129.field2615[var6++] = var274.field2631;
                            continue;
                        }
                    } else if (var311 < 2800) {
                        if (var311 == 2700) {
                            var6--;
                            class129 var53 = class124.method801((byte) -36, class129.field2615[var6]);
                            class129.field2615[var6++] = var53.field2666;
                            continue;
                        }
                        if (var311 == 2701) {
                            var6--;
                            class129 var54 = class124.method801((byte) -36, class129.field2615[var6]);
                            if (var54.field2666 == -1) {
                                class129.field2615[var6++] = 0;
                            } else {
                                class129.field2615[var6++] = var54.field2577;
                            }
                            continue;
                        }
                        if (var311 == 2702) {
                            var6--;
                            int var55 = class129.field2615[var6];
                            class137 var56 = (class137) class15.field227.method75((long) var55, arg2 - 26071);
                            if (var56 == null) {
                                class129.field2615[var6++] = 0;
                            } else {
                                class129.field2615[var6++] = 1;
                            }
                            continue;
                        }
                        if (var311 == 2703) {
                            var6--;
                            class129 var57 = class124.method801((byte) -36, class129.field2615[var6]);
                            if (var57.field2626 == null) {
                                class129.field2615[var6++] = 0;
                                continue;
                            }
                            int var58 = var57.field2626.length;
                            for (int var59 = 0; var59 < var57.field2626.length; var59++) {
                                if (var57.field2626[var59] == null) {
                                    var58 = var59;
                                    break;
                                }
                            }
                            class129.field2615[var6++] = var58;
                            continue;
                        }
                        if (var311 == 2704 || var311 == 2705) {
                            var6 -= 2;
                            int var60 = class129.field2615[var6];
                            int var61 = class129.field2615[var6 + 1];
                            class137 var62 = (class137) class15.field227.method75((long) var60, 27);
                            if (var62 != null && var62.field2850 == var61) {
                                class129.field2615[var6++] = 1;
                                continue;
                            }
                            class129.field2615[var6++] = 0;
                            continue;
                        }
                    } else if (var311 < 2900) {
                        var6--;
                        class129 var272 = class124.method801((byte) -36, class129.field2615[var6]);
                        if (var311 == 2800) {
                            class129.field2615[var6++] = class37.method206(class193.method1231((byte) -64, var272), -61);
                            continue;
                        }
                        if (var311 == 2801) {
                            var6--;
                            int var273 = class129.field2615[var6];
                            int var312 = var273 - 1;
                            if (var272.field2645 != null && var312 < var272.field2645.length && var272.field2645[var312] != null) {
                                class43.field852[var7++] = var272.field2645[var312];
                                continue;
                            }
                            class43.field852[var7++] = class157.field3186;
                            continue;
                        }
                        if (var311 == 2802) {
                            if (var272.field2587 == null) {
                                class43.field852[var7++] = class157.field3186;
                            } else {
                                class43.field852[var7++] = var272.field2587;
                            }
                            continue;
                        }
                    } else if (var311 < 3200) {
                        if (var311 == 3100) {
                            var7--;
                            class43 var63 = class43.field852[var7];
                            class81.method504(var63, class157.field3186, 0, (byte) 89);
                            continue;
                        }
                        if (var311 == 3101) {
                            var6 -= 2;
                            class77.method477((byte) 75, class129.field2615[var6], class129.field2615[var6 + 1], class67.field1348);
                            continue;
                        }
                        if (var311 == 3103) {
                            class81.method500((byte) -47);
                            continue;
                        }
                        if (var311 == 3104) {
                            var7--;
                            class43 var64 = class43.field852[var7];
                            class157.field3172++;
                            int var65 = 0;
                            if (var64.method237(10)) {
                                var65 = var64.method264(10);
                            }
                            class29.field522.method338(arg2 - 25716, 161);
                            class29.field522.method581(var65, -268435456);
                            continue;
                        }
                        if (var311 == 3105) {
                            var7--;
                            class43 var66 = class43.field852[var7];
                            class29.field522.method338(arg2 ^ 0x658C, 79);
                            class29.field522.method550(33, var66.method249(arg2 - 26017));
                            class140.field2896++;
                            continue;
                        }
                        if (var311 == 3106) {
                            class86.field1679++;
                            var7--;
                            class43 var67 = class43.field852[var7];
                            class29.field522.method338(253, 69);
                            class29.field522.method539(var67.method248((byte) 60) + 1, 27678);
                            class29.field522.method535(var67, (byte) 0);
                            continue;
                        }
                        if (var311 == 3107) {
                            var6--;
                            int var68 = class129.field2615[var6];
                            var7--;
                            class43 var69 = class43.field852[var7];
                            class104.method644(var69, (byte) 31, var68);
                            continue;
                        }
                        if (var311 == 3108) {
                            var6 -= 3;
                            int var70 = class129.field2615[var6];
                            int var71 = class129.field2615[var6 + 1];
                            int var72 = class129.field2615[var6 + 2];
                            class129 var73 = class124.method801((byte) -36, var72);
                            class201.method1308(false, var71, var73, var70);
                            continue;
                        }
                        if (var311 == 3109) {
                            var6 -= 2;
                            int var74 = class129.field2615[var6 + 1];
                            int var75 = class129.field2615[var6];
                            class129 var76 = var42 ? class36.field665 : class121.field2411;
                            class201.method1308(false, var74, var76, var75);
                            continue;
                        }
                        if (var311 == 3110) {
                            var6--;
                            int var77 = class129.field2615[var6];
                            class29.field522.method338(253, 54);
                            class29.field522.method546(false, var77);
                            class65.field1321++;
                            continue;
                        }
                    } else if (var311 < 3300) {
                        if (var311 == 3200) {
                            var6 -= 3;
                            class189.method1201(class129.field2615[var6 + 2], class129.field2615[var6 + 1], class129.field2615[var6], (byte) 100);
                            continue;
                        }
                        if (var311 == 3201) {
                            var6--;
                            class23.method118(39, class129.field2615[var6]);
                            continue;
                        }
                        if (var311 == 3202) {
                            var6 -= 2;
                            class108.method671(class129.field2615[var6], (byte) 84, class129.field2615[var6 + 1]);
                            continue;
                        }
                    } else if (var311 < 3400) {
                        if (var311 == 3300) {
                            class129.field2615[var6++] = client.field559;
                            continue;
                        }
                        if (var311 == 3301) {
                            var6 -= 2;
                            int var78 = class129.field2615[var6];
                            int var79 = class129.field2615[var6 + 1];
                            class129.field2615[var6++] = class66.method415(var79, 0, var78);
                            continue;
                        }
                        if (var311 == 3302) {
                            var6 -= 2;
                            int var80 = class129.field2615[var6];
                            int var81 = class129.field2615[var6 + 1];
                            class129.field2615[var6++] = class127.method821(var81, (byte) 21, var80);
                            continue;
                        }
                        if (var311 == 3303) {
                            var6 -= 2;
                            int var82 = class129.field2615[var6];
                            int var83 = class129.field2615[var6 + 1];
                            class129.field2615[var6++] = class167.method1032(var82, var83, 120);
                            continue;
                        }
                        if (var311 == 3304) {
                            var6--;
                            int var84 = class129.field2615[var6];
                            class129.field2615[var6++] = class20.method97(var84, (byte) 126).field184;
                            continue;
                        }
                        if (var311 == 3305) {
                            var6--;
                            int var85 = class129.field2615[var6];
                            class129.field2615[var6++] = class108.field2074[var85];
                            continue;
                        }
                        if (var311 == 3306) {
                            var6--;
                            int var86 = class129.field2615[var6];
                            class129.field2615[var6++] = class32.field589[var86];
                            continue;
                        }
                        if (var311 == 3307) {
                            var6--;
                            int var87 = class129.field2615[var6];
                            class129.field2615[var6++] = class96.field1874[var87];
                            continue;
                        }
                        if (var311 == 3308) {
                            int var88 = class93.field1839;
                            int var89 = (class67.field1348.field2347 >> 7) + class170.field3393;
                            int var90 = (class67.field1348.field2328 >> 7) + class83.field1641;
                            class129.field2615[var6++] = (var88 << 28) + (var89 << 14) + var90;
                            continue;
                        }
                        if (var311 == 3309) {
                            var6--;
                            int var91 = class129.field2615[var6];
                            class129.field2615[var6++] = class7.method38(var91, 268425566) >> 14;
                            continue;
                        }
                        if (var311 == 3310) {
                            var6--;
                            int var92 = class129.field2615[var6];
                            class129.field2615[var6++] = var92 >> 28;
                            continue;
                        }
                        if (var311 == 3311) {
                            var6--;
                            int var93 = class129.field2615[var6];
                            class129.field2615[var6++] = class7.method38(var93, 16383);
                            continue;
                        }
                        if (var311 == 3312) {
                            class129.field2615[var6++] = class200.field3938 ? 1 : 0;
                            continue;
                        }
                        if (var311 == 3313) {
                            var6 -= 2;
                            int var94 = class129.field2615[var6] + 32768;
                            int var95 = class129.field2615[var6 + 1];
                            class129.field2615[var6++] = class66.method415(var95, 0, var94);
                            continue;
                        }
                        if (var311 == 3314) {
                            var6 -= 2;
                            int var96 = class129.field2615[var6] + 32768;
                            int var97 = class129.field2615[var6 + 1];
                            class129.field2615[var6++] = class127.method821(var97, (byte) 105, var96);
                            continue;
                        }
                        if (var311 == 3315) {
                            var6 -= 2;
                            int var98 = class129.field2615[var6] + 32768;
                            int var99 = class129.field2615[var6 + 1];
                            class129.field2615[var6++] = class167.method1032(var98, var99, -14);
                            continue;
                        }
                        if (var311 == 3316) {
                            if (class144.field2957 < 2) {
                                class129.field2615[var6++] = 0;
                            } else {
                                class129.field2615[var6++] = class144.field2957;
                            }
                            continue;
                        }
                        if (var311 == 3317) {
                            class129.field2615[var6++] = class204.field3970;
                            continue;
                        }
                        if (var311 == 3318) {
                            class129.field2615[var6++] = class95.field1859;
                            continue;
                        }
                        if (var311 == 3321) {
                            class129.field2615[var6++] = class126.field2513;
                            continue;
                        }
                        if (var311 == 3322) {
                            class129.field2615[var6++] = class143.field2952;
                            continue;
                        }
                        if (var311 == 3323) {
                            if (class144.field2957 == 1) {
                                class129.field2615[var6++] = 1;
                            } else {
                                class129.field2615[var6++] = 0;
                            }
                            continue;
                        }
                        if (var311 == 3324) {
                            if (class171.field3402 >= 5 && class171.field3402 <= 9) {
                                class129.field2615[var6++] = class171.field3402;
                                continue;
                            }
                            class129.field2615[var6++] = 0;
                            continue;
                        }
                        if (var311 == 3325) {
                            if (class68.field1370 <= 0) {
                                class129.field2615[var6++] = 0;
                            } else {
                                class129.field2615[var6++] = 1;
                            }
                            continue;
                        }
                        if (var311 == 3326) {
                            class129.field2615[var6++] = class67.field1348.field21;
                            continue;
                        }
                    } else if (var311 < 3500) {
                        if (var311 == 3400) {
                            var6 -= 2;
                            int var262 = class129.field2615[var6];
                            int var263 = class129.field2615[var6 + 1];
                            class126 var264 = class98.method613(var262, 8);
                            for (int var265 = 0; var265 < var264.field2499; var265++) {
                                if (var264.field2495[var265] == var263) {
                                    class43.field852[var7++] = var264.field2497[var265];
                                    var264 = null;
                                    break;
                                }
                            }
                            if (var264 != null) {
                                class43.field852[var7++] = var264.field2511;
                            }
                            continue;
                        }
                        if (var311 == 3408) {
                            var6 -= 4;
                            int var266 = class129.field2615[var6];
                            int var267 = class129.field2615[var6 + 2];
                            int var268 = class129.field2615[var6 + 1];
                            int var269 = class129.field2615[var6 + 3];
                            class126 var270 = class98.method613(var267, arg2 ^ 0x6579);
                            if (var270.field2494 == var266 && var270.field2505 == var268) {
                                for (int var271 = 0; var271 < var270.field2499; var271++) {
                                    if (var270.field2495[var271] == var269) {
                                        if (var268 == 115) {
                                            class43.field852[var7++] = var270.field2497[var271];
                                        } else {
                                            class129.field2615[var6++] = var270.field2509[var271];
                                        }
                                        var270 = null;
                                        break;
                                    }
                                }
                                if (var270 != null) {
                                    if (var268 == 115) {
                                        class43.field852[var7++] = var270.field2511;
                                    } else {
                                        class129.field2615[var6++] = var270.field2506;
                                    }
                                }
                                continue;
                            }
                            if (var268 == 115) {
                                class43.field852[var7++] = class13.field193;
                            } else {
                                class129.field2615[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var311 < 3700) {
                        if (var311 == 3600) {
                            if (class50.field1016 == 0) {
                                class129.field2615[var6++] = -2;
                            } else if (class50.field1016 == 1) {
                                class129.field2615[var6++] = -1;
                            } else {
                                class129.field2615[var6++] = class40.field778;
                            }
                            continue;
                        }
                        if (var311 == 3601) {
                            var6--;
                            int var244 = class129.field2615[var6];
                            if (class50.field1016 == 2 && var244 < class40.field778) {
                                class43.field852[var7++] = class148.field3018[var244];
                                continue;
                            }
                            class43.field852[var7++] = class157.field3186;
                            continue;
                        }
                        if (var311 == 3602) {
                            var6--;
                            int var245 = class129.field2615[var6];
                            if (class50.field1016 == 2 && var245 < class40.field778) {
                                class129.field2615[var6++] = class80.field1585[var245];
                                continue;
                            }
                            class129.field2615[var6++] = 0;
                            continue;
                        }
                        if (var311 == 3603) {
                            var6--;
                            int var246 = class129.field2615[var6];
                            if (class50.field1016 == 2 && var246 < class40.field778) {
                                class129.field2615[var6++] = class78.field1545[var246];
                                continue;
                            }
                            class129.field2615[var6++] = 0;
                            continue;
                        }
                        if (var311 == 3604) {
                            var7--;
                            class43 var247 = class43.field852[var7];
                            var6--;
                            int var248 = class129.field2615[var6];
                            class170.method1082(var248, 135, var247);
                            continue;
                        }
                        if (var311 == 3605) {
                            var7--;
                            class43 var249 = class43.field852[var7];
                            class51.method311(var249.method249(arg2 - 26017), (byte) -21);
                            continue;
                        }
                        if (var311 == 3606) {
                            var7--;
                            class43 var250 = class43.field852[var7];
                            class60.method380((byte) -105, var250.method249(-48));
                            continue;
                        }
                        if (var311 == 3607) {
                            var7--;
                            class43 var251 = class43.field852[var7];
                            class172.method1091(var251.method249(-48), 0);
                            continue;
                        }
                        if (var311 == 3608) {
                            var7--;
                            class43 var252 = class43.field852[var7];
                            class126.method811(-21428, var252.method249(-48));
                            continue;
                        }
                        if (var311 == 3609) {
                            var7--;
                            class43 var253 = class43.field852[var7];
                            if (var253.method240(-1, class60.field1226) || var253.method240(-1, class102.field1949)) {
                                var253 = var253.method238(58, 7);
                            }
                            class129.field2615[var6++] = class131.method851(var253, (byte) -115) ? 1 : 0;
                            continue;
                        }
                        if (var311 == 3611) {
                            if (class174.field3472 == null) {
                                class43.field852[var7++] = class157.field3186;
                            } else {
                                class43.field852[var7++] = class174.field3472.method273(43);
                            }
                            continue;
                        }
                        if (var311 == 3612) {
                            if (class174.field3472 == null) {
                                class129.field2615[var6++] = 0;
                            } else {
                                class129.field2615[var6++] = class121.field2407;
                            }
                            continue;
                        }
                        if (var311 == 3613) {
                            var6--;
                            int var254 = class129.field2615[var6];
                            if (class174.field3472 != null && var254 < class121.field2407) {
                                class43.field852[var7++] = class33.field614[var254].field3699.method273(-58);
                                continue;
                            }
                            class43.field852[var7++] = class157.field3186;
                            continue;
                        }
                        if (var311 == 3614) {
                            var6--;
                            int var255 = class129.field2615[var6];
                            if (class174.field3472 != null && class121.field2407 > var255) {
                                class129.field2615[var6++] = class33.field614[var255].field3698;
                                continue;
                            }
                            class129.field2615[var6++] = 0;
                            continue;
                        }
                        if (var311 == 3615) {
                            var6--;
                            int var256 = class129.field2615[var6];
                            if (class174.field3472 != null && class121.field2407 > var256) {
                                class129.field2615[var6++] = class33.field614[var256].field3703;
                                continue;
                            }
                            class129.field2615[var6++] = 0;
                            continue;
                        }
                        if (var311 == 3616) {
                            class129.field2615[var6++] = class194.field3777;
                            continue;
                        }
                        if (var311 == 3617) {
                            var7--;
                            class43 var257 = class43.field852[var7];
                            class57.method343(85, var257);
                            continue;
                        }
                        if (var311 == 3618) {
                            class129.field2615[var6++] = class89.field1781;
                            continue;
                        }
                        if (var311 == 3619) {
                            var7--;
                            class43 var258 = class43.field852[var7];
                            class30.method159(false, var258.method249(-48));
                            continue;
                        }
                        if (var311 == 3620) {
                            class66.method413(-11);
                            continue;
                        }
                        if (var311 == 3621) {
                            if (class50.field1016 == 0) {
                                class129.field2615[var6++] = -1;
                            } else {
                                class129.field2615[var6++] = class73.field1457;
                            }
                            continue;
                        }
                        if (var311 == 3622) {
                            var6--;
                            int var259 = class129.field2615[var6];
                            if (class50.field1016 != 0 && var259 < class73.field1457) {
                                class43.field852[var7++] = class9.method47(class78.field1546[var259], (byte) -100).method273(-45);
                                continue;
                            }
                            class43.field852[var7++] = class157.field3186;
                            continue;
                        }
                        if (var311 == 3623) {
                            var7--;
                            class43 var260 = class43.field852[var7];
                            if (var260.method240(-1, class60.field1226) || var260.method240(-1, class102.field1949)) {
                                var260 = var260.method238(33, 7);
                            }
                            class129.field2615[var6++] = class35.method201(var260, 7) ? 1 : 0;
                            continue;
                        }
                        if (var311 == 3624) {
                            var6--;
                            int var261 = class129.field2615[var6];
                            if (class33.field614 != null && var261 < class121.field2407 && class33.field614[var261].field3699.method250(63, class67.field1348.field23)) {
                                class129.field2615[var6++] = 1;
                                continue;
                            }
                            class129.field2615[var6++] = 0;
                            continue;
                        }
                        if (var311 == 3625) {
                            if (class85.field1667 == null) {
                                class43.field852[var7++] = class157.field3186;
                            } else {
                                class43.field852[var7++] = class85.field1667.method273(class127.method818(arg2, -25905));
                            }
                            continue;
                        }
                    } else if (var311 < 4000) {
                        if (var311 == 3903) {
                            var6--;
                            int var100 = class129.field2615[var6];
                            class129.field2615[var6++] = class145.field2980[var100].method910(class127.method818(arg2, 25969));
                            continue;
                        }
                        if (var311 == 3904) {
                            var6--;
                            int var101 = class129.field2615[var6];
                            class129.field2615[var6++] = class145.field2980[var101].field2962;
                            continue;
                        }
                        if (var311 == 3905) {
                            var6--;
                            int var102 = class129.field2615[var6];
                            class129.field2615[var6++] = class145.field2980[var102].field2964;
                            continue;
                        }
                        if (var311 == 3906) {
                            var6--;
                            int var103 = class129.field2615[var6];
                            class129.field2615[var6++] = class145.field2980[var103].field2960;
                            continue;
                        }
                        if (var311 == 3907) {
                            var6--;
                            int var104 = class129.field2615[var6];
                            class129.field2615[var6++] = class145.field2980[var104].field2967;
                            continue;
                        }
                        if (var311 == 3908) {
                            var6--;
                            int var105 = class129.field2615[var6];
                            class129.field2615[var6++] = class145.field2980[var105].field2958;
                            continue;
                        }
                        if (var311 == 3910) {
                            var6--;
                            int var106 = class129.field2615[var6];
                            int var107 = class145.field2980[var106].method911((byte) 110);
                            class129.field2615[var6++] = var107 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var311 == 3911) {
                            var6--;
                            int var108 = class129.field2615[var6];
                            int var109 = class145.field2980[var108].method911((byte) 110);
                            class129.field2615[var6++] = var109 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var311 == 3912) {
                            var6--;
                            int var110 = class129.field2615[var6];
                            int var111 = class145.field2980[var110].method911((byte) 110);
                            class129.field2615[var6++] = var111 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var311 == 3913) {
                            var6--;
                            int var112 = class129.field2615[var6];
                            int var113 = class145.field2980[var112].method911((byte) 110);
                            class129.field2615[var6++] = var113 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var311 < 4100) {
                        if (var311 == 4000) {
                            var6 -= 2;
                            int var201 = class129.field2615[var6];
                            int var202 = class129.field2615[var6 + 1];
                            class129.field2615[var6++] = var201 + var202;
                            continue;
                        }
                        if (var311 == 4001) {
                            var6 -= 2;
                            int var203 = class129.field2615[var6 + 1];
                            int var204 = class129.field2615[var6];
                            class129.field2615[var6++] = var204 - var203;
                            continue;
                        }
                        if (var311 == 4002) {
                            var6 -= 2;
                            int var205 = class129.field2615[var6 + 1];
                            int var206 = class129.field2615[var6];
                            class129.field2615[var6++] = var205 * var206;
                            continue;
                        }
                        if (var311 == 4003) {
                            var6 -= 2;
                            int var207 = class129.field2615[var6];
                            int var208 = class129.field2615[var6 + 1];
                            class129.field2615[var6++] = var207 / var208;
                            continue;
                        }
                        if (var311 == 4004) {
                            var6--;
                            int var209 = class129.field2615[var6];
                            class129.field2615[var6++] = (int) (Math.random() * (double) var209);
                            continue;
                        }
                        if (var311 == 4005) {
                            var6--;
                            int var210 = class129.field2615[var6];
                            class129.field2615[var6++] = (int) (Math.random() * (double) (var210 + 1));
                            continue;
                        }
                        if (var311 == 4006) {
                            var6 -= 5;
                            int var211 = class129.field2615[var6];
                            int var212 = class129.field2615[var6 + 1];
                            int var213 = class129.field2615[var6 + 2];
                            int var214 = class129.field2615[var6 + 3];
                            int var215 = class129.field2615[var6 + 4];
                            class129.field2615[var6++] = var211 + (var212 - var211) * (var215 - var213) / (var214 - var213);
                            continue;
                        }
                        if (var311 == 4007) {
                            var6 -= 2;
                            int var216 = class129.field2615[var6];
                            int var217 = class129.field2615[var6 + 1];
                            class129.field2615[var6++] = var216 * var217 / 100 + var216;
                            continue;
                        }
                        if (var311 == 4008) {
                            var6 -= 2;
                            int var218 = class129.field2615[var6 + 1];
                            int var219 = class129.field2615[var6];
                            class129.field2615[var6++] = class33.method189(0x1 << var218, var219);
                            continue;
                        }
                        if (var311 == 4009) {
                            var6 -= 2;
                            int var220 = class129.field2615[var6 + 1];
                            int var221 = class129.field2615[var6];
                            class129.field2615[var6++] = class7.method38(var221, -(0x1 << var220) - 1);
                            continue;
                        }
                        if (var311 == 4010) {
                            var6 -= 2;
                            int var222 = class129.field2615[var6];
                            int var223 = class129.field2615[var6 + 1];
                            class129.field2615[var6++] = class7.method38(var222, 0x1 << var223) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var311 == 4011) {
                            var6 -= 2;
                            int var224 = class129.field2615[var6];
                            int var225 = class129.field2615[var6 + 1];
                            class129.field2615[var6++] = var224 % var225;
                            continue;
                        }
                        if (var311 == 4012) {
                            var6 -= 2;
                            int var226 = class129.field2615[var6];
                            int var227 = class129.field2615[var6 + 1];
                            if (var226 == 0) {
                                class129.field2615[var6++] = 0;
                            } else {
                                class129.field2615[var6++] = (int) Math.pow((double) var226, (double) var227);
                            }
                            continue;
                        }
                        if (var311 == 4013) {
                            var6 -= 2;
                            int var228 = class129.field2615[var6];
                            int var229 = class129.field2615[var6 + 1];
                            if (var228 == 0) {
                                class129.field2615[var6++] = 0;
                            } else if (var229 == 0) {
                                class129.field2615[var6++] = Integer.MAX_VALUE;
                            } else {
                                class129.field2615[var6++] = (int) Math.pow((double) var228, 1.0D / (double) var229);
                            }
                            continue;
                        }
                        if (var311 == 4014) {
                            var6 -= 2;
                            int var230 = class129.field2615[var6];
                            int var231 = class129.field2615[var6 + 1];
                            class129.field2615[var6++] = class7.method38(var231, var230);
                            continue;
                        }
                        if (var311 == 4015) {
                            var6 -= 2;
                            int var232 = class129.field2615[var6 + 1];
                            int var233 = class129.field2615[var6];
                            class129.field2615[var6++] = class33.method189(var232, var233);
                            continue;
                        }
                        if (var311 == 4016) {
                            var6 -= 2;
                            int var234 = class129.field2615[var6];
                            int var235 = class129.field2615[var6 + 1];
                            class129.field2615[var6++] = var235 <= var234 ? var235 : var234;
                            continue;
                        }
                        if (var311 == 4017) {
                            var6 -= 2;
                            int var236 = class129.field2615[var6];
                            int var237 = class129.field2615[var6 + 1];
                            class129.field2615[var6++] = var236 > var237 ? var236 : var237;
                            continue;
                        }
                        if (var311 == 4018) {
                            var6 -= 3;
                            long var238 = (long) class129.field2615[var6];
                            long var240 = (long) class129.field2615[var6 + 1];
                            long var242 = (long) class129.field2615[var6 + 2];
                            class129.field2615[var6++] = (int) (var238 * var242 / var240);
                            continue;
                        }
                    } else if (var311 < 4200) {
                        if (var311 == 4100) {
                            var7--;
                            class43 var151 = class43.field852[var7];
                            var6--;
                            int var152 = class129.field2615[var6];
                            class43.field852[var7++] = class167.method1036(new class43[] { var151, class30.method161(var152, 10) }, true);
                            continue;
                        }
                        if (var311 == 4101) {
                            var7 -= 2;
                            class43 var153 = class43.field852[var7];
                            class43 var154 = class43.field852[var7 + 1];
                            class43.field852[var7++] = class167.method1036(new class43[] { var153, var154 }, true);
                            continue;
                        }
                        if (var311 == 4102) {
                            var6--;
                            int var155 = class129.field2615[var6];
                            var7--;
                            class43 var156 = class43.field852[var7];
                            class43.field852[var7++] = class167.method1036(new class43[] { var156, class22.method103(true, var155, true) }, true);
                            continue;
                        }
                        if (var311 == 4103) {
                            var7--;
                            class43 var157 = class43.field852[var7];
                            class43.field852[var7++] = var157.method244(19404);
                            continue;
                        }
                        if (var311 == 4104) {
                            var6--;
                            int var158 = class129.field2615[var6];
                            long var159 = ((long) var158 + 11745L) * 86400000L;
                            class57.field1116.setTime(new Date(var159));
                            int var161 = class57.field1116.get(5);
                            int var162 = class57.field1116.get(2);
                            int var163 = class57.field1116.get(1);
                            class43.field852[var7++] = class167.method1036(new class43[] { class30.method161(var161, 10), class109.field2095, class104.field1990[var162], class109.field2095, class30.method161(var163, 10) }, true);
                            continue;
                        }
                        if (var311 == 4105) {
                            var7 -= 2;
                            class43 var164 = class43.field852[var7];
                            class43 var165 = class43.field852[var7 + 1];
                            if (class67.field1348.field24 != null && class67.field1348.field24.field1495) {
                                class43.field852[var7++] = var165;
                                continue;
                            }
                            class43.field852[var7++] = var164;
                            continue;
                        }
                        if (var311 == 4106) {
                            var6--;
                            int var166 = class129.field2615[var6];
                            class43.field852[var7++] = class30.method161(var166, 10);
                            continue;
                        }
                        if (var311 == 4107) {
                            var7 -= 2;
                            class129.field2615[var6++] = class43.field852[var7].method268((byte) 118, class43.field852[var7 + 1]);
                            continue;
                        }
                        if (var311 == 4108) {
                            var6 -= 2;
                            var7--;
                            class43 var167 = class43.field852[var7];
                            int var168 = class129.field2615[var6 + 1];
                            int var169 = class129.field2615[var6];
                            byte[] var170 = class184.field3632.method367(var168, 0, (byte) -34);
                            class202 var171 = new class202(var170);
                            class129.field2615[var6++] = var171.method937(var167, var169);
                            continue;
                        }
                        if (var311 == 4109) {
                            var7--;
                            class43 var172 = class43.field852[var7];
                            var6 -= 2;
                            int var173 = class129.field2615[var6];
                            int var174 = class129.field2615[var6 + 1];
                            byte[] var175 = class184.field3632.method367(var174, 0, (byte) -34);
                            class202 var176 = new class202(var175);
                            class129.field2615[var6++] = var176.method958(var172, var173);
                            continue;
                        }
                        if (var311 == 4110) {
                            var7 -= 2;
                            class43 var177 = class43.field852[var7 + 1];
                            class43 var178 = class43.field852[var7];
                            var6--;
                            if (class129.field2615[var6] == 1) {
                                class43.field852[var7++] = var178;
                            } else {
                                class43.field852[var7++] = var177;
                            }
                            continue;
                        }
                        if (var311 == 4111) {
                            var7--;
                            class43 var179 = class43.field852[var7];
                            class43.field852[var7++] = class151.method945(var179);
                            continue;
                        }
                        if (var311 == 4112) {
                            var7--;
                            class43 var180 = class43.field852[var7];
                            var6--;
                            int var181 = class129.field2615[var6];
                            class43.field852[var7++] = var180.method272(var181, arg2 - 3862);
                            continue;
                        }
                        if (var311 == 4113) {
                            var6--;
                            int var182 = class129.field2615[var6];
                            class129.field2615[var6++] = class108.method664(var182, (byte) 82) ? 1 : 0;
                            continue;
                        }
                        if (var311 == 4114) {
                            var6--;
                            int var183 = class129.field2615[var6];
                            class129.field2615[var6++] = class65.method410(-30001, var183) ? 1 : 0;
                            continue;
                        }
                        if (var311 == 4115) {
                            var6--;
                            int var184 = class129.field2615[var6];
                            class129.field2615[var6++] = class142.method903(var184, -108) ? 1 : 0;
                            continue;
                        }
                        if (var311 == 4116) {
                            var6--;
                            int var185 = class129.field2615[var6];
                            class129.field2615[var6++] = class12.method54(var185, (byte) -102) ? 1 : 0;
                            continue;
                        }
                        if (var311 == 4117) {
                            var7--;
                            class43 var186 = class43.field852[var7];
                            if (var186 == null) {
                                class129.field2615[var6++] = 0;
                            } else {
                                class129.field2615[var6++] = var186.method248((byte) 60);
                            }
                            continue;
                        }
                        if (var311 == 4118) {
                            var7--;
                            class43 var187 = class43.field852[var7];
                            var6 -= 2;
                            int var188 = class129.field2615[var6 + 1];
                            int var189 = class129.field2615[var6];
                            class43.field852[var7++] = var187.method241((byte) 95, var189, var188);
                            continue;
                        }
                        if (var311 == 4119) {
                            var7--;
                            class43 var190 = class43.field852[var7];
                            class43 var191 = class41.method227((byte) 61, var190.method248((byte) 60));
                            boolean var192 = false;
                            for (int var193 = 0; var193 < var190.method248((byte) 60); var193++) {
                                int var194 = var190.method256(true, var193);
                                if (var194 == 60) {
                                    var192 = true;
                                } else if (var194 == 62) {
                                    var192 = false;
                                } else if (!var192) {
                                    var191.method267(var194, arg2 ^ 0xFFFFA725);
                                }
                            }
                            var191.method270(0);
                            class43.field852[var7++] = var191;
                            continue;
                        }
                        if (var311 == 4120) {
                            var6 -= 2;
                            int var195 = class129.field2615[var6];
                            var7--;
                            class43 var196 = class43.field852[var7];
                            int var197 = class129.field2615[var6 + 1];
                            class129.field2615[var6++] = var196.method266(var197, 2, var195);
                            continue;
                        }
                        if (var311 == 4121) {
                            var7 -= 2;
                            class43 var198 = class43.field852[var7];
                            class43 var199 = class43.field852[var7 + 1];
                            var6--;
                            int var200 = class129.field2615[var6];
                            class129.field2615[var6++] = var198.method260(arg2 - 26006, var199, var200);
                            continue;
                        }
                    } else if (var311 < 4300) {
                        if (var311 == 4200) {
                            var6--;
                            int var114 = class129.field2615[var6];
                            class43.field852[var7++] = class2.method18(var114, 0).field905;
                            continue;
                        }
                        if (var311 == 4201) {
                            var6 -= 2;
                            int var115 = class129.field2615[var6];
                            int var116 = class129.field2615[var6 + 1];
                            class46 var117 = class2.method18(var115, 0);
                            if (var116 >= 1 && var116 <= 5 && var117.field937[var116 - 1] != null) {
                                class43.field852[var7++] = var117.field937[var116 - 1];
                                continue;
                            }
                            class43.field852[var7++] = class157.field3186;
                            continue;
                        }
                        if (var311 == 4202) {
                            var6 -= 2;
                            int var118 = class129.field2615[var6];
                            int var119 = class129.field2615[var6 + 1];
                            class46 var120 = class2.method18(var118, 0);
                            if (var119 >= 1 && var119 <= 5 && var120.field912[var119 - 1] != null) {
                                class43.field852[var7++] = var120.field912[var119 - 1];
                                continue;
                            }
                            class43.field852[var7++] = class157.field3186;
                            continue;
                        }
                        if (var311 == 4203) {
                            var6--;
                            int var121 = class129.field2615[var6];
                            class129.field2615[var6++] = class2.method18(var121, class127.method818(arg2, 25969)).field904;
                            continue;
                        }
                        if (var311 == 4204) {
                            var6--;
                            int var122 = class129.field2615[var6];
                            class129.field2615[var6++] = class2.method18(var122, arg2 - 25969).field924 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var311 == 4205) {
                            var6--;
                            int var123 = class129.field2615[var6];
                            class46 var124 = class2.method18(var123, 0);
                            if (var124.field906 == -1 && var124.field910 >= 0) {
                                class129.field2615[var6++] = var124.field910;
                                continue;
                            }
                            class129.field2615[var6++] = var123;
                            continue;
                        }
                        if (var311 == 4206) {
                            var6--;
                            int var125 = class129.field2615[var6];
                            class46 var126 = class2.method18(var125, arg2 - 25969);
                            if (var126.field906 >= 0 && var126.field910 >= 0) {
                                class129.field2615[var6++] = var126.field910;
                                continue;
                            }
                            class129.field2615[var6++] = var125;
                            continue;
                        }
                        if (var311 == 4207) {
                            var6--;
                            int var127 = class129.field2615[var6];
                            class129.field2615[var6++] = class2.method18(var127, 0).field946 ? 1 : 0;
                            continue;
                        }
                        if (var311 == 4210) {
                            var7--;
                            class43 var128 = class43.field852[var7];
                            var6--;
                            int var129 = class129.field2615[var6];
                            class114.method720(var128, (byte) -64, var129 == 1);
                            class129.field2615[var6++] = class182.field3591;
                            continue;
                        }
                        if (var311 == 4211) {
                            if (class92.field1817 != null && class182.field3591 > class109.field2109) {
                                class129.field2615[var6++] = class7.method38(65535, class92.field1817[class109.field2109++]);
                                continue;
                            }
                            class129.field2615[var6++] = -1;
                            continue;
                        }
                        if (var311 == 4212) {
                            class109.field2109 = 0;
                            continue;
                        }
                    } else if (var311 < 5100) {
                        if (var311 == 5000) {
                            class129.field2615[var6++] = class1.field30;
                            continue;
                        }
                        if (var311 == 5001) {
                            var6 -= 3;
                            class107.field2036++;
                            class1.field30 = class129.field2615[var6];
                            class98.field1898 = class129.field2615[var6 + 1];
                            class119.field2382 = class129.field2615[var6 + 2];
                            class29.field522.method338(arg2 - 25716, 112);
                            class29.field522.method539(class1.field30, 27678);
                            class29.field522.method539(class98.field1898, arg2 + 1709);
                            class29.field522.method539(class119.field2382, 27678);
                            continue;
                        }
                        if (var311 == 5002) {
                            class172.field3443++;
                            var6 -= 2;
                            var7--;
                            class43 var130 = class43.field852[var7];
                            int var131 = class129.field2615[var6];
                            int var132 = class129.field2615[var6 + 1];
                            class29.field522.method338(253, 177);
                            class29.field522.method550(40, var130.method249(arg2 ^ 0xFFFF9AA1));
                            class29.field522.method539(var131 - 1, 27678);
                            class29.field522.method539(var132, 27678);
                            continue;
                        }
                        if (var311 == 5003) {
                            var6--;
                            int var133 = class129.field2615[var6];
                            class43 var134 = null;
                            if (var133 < 100) {
                                var134 = class132.field2760[var133];
                            }
                            if (var134 == null) {
                                var134 = class157.field3186;
                            }
                            class43.field852[var7++] = var134;
                            continue;
                        }
                        if (var311 == 5004) {
                            var6--;
                            int var135 = class129.field2615[var6];
                            int var136 = -1;
                            if (var135 < 100 && class132.field2760[var135] != null) {
                                var136 = class71.field1405[var135];
                            }
                            class129.field2615[var6++] = var136;
                            continue;
                        }
                        if (var311 == 5005) {
                            class129.field2615[var6++] = class98.field1898;
                            continue;
                        }
                        if (var311 == 5008) {
                            var7--;
                            class43 var137 = class43.field852[var7];
                            if (var137.method240(-1, class180.field3582)) {
                                class184.method1187(true, var137);
                            } else {
                                class12.field185++;
                                class43 var138 = var137.method244(arg2 - 6565);
                                byte var139 = 0;
                                if (var138.method240(-1, class28.field494)) {
                                    var139 = 0;
                                    var137 = var137.method238(49, class28.field494.method248((byte) 60));
                                } else if (var138.method240(-1, class171.field3424)) {
                                    var137 = var137.method238(120, class171.field3424.method248((byte) 60));
                                    var139 = 1;
                                } else if (var138.method240(-1, class51.field1019)) {
                                    var139 = 2;
                                    var137 = var137.method238(2, class51.field1019.method248((byte) 60));
                                } else if (var138.method240(-1, class16.field257)) {
                                    var137 = var137.method238(arg2 - 25898, class16.field257.method248((byte) 60));
                                    var139 = 3;
                                } else if (var138.method240(-1, class14.field207)) {
                                    var137 = var137.method238(arg2 ^ 0x6519, class14.field207.method248((byte) 60));
                                    var139 = 4;
                                } else if (var138.method240(-1, class139.field2875)) {
                                    var137 = var137.method238(60, class139.field2875.method248((byte) 60));
                                    var139 = 5;
                                } else if (var138.method240(-1, class97.field1892)) {
                                    var137 = var137.method238(65, class97.field1892.method248((byte) 60));
                                    var139 = 6;
                                } else if (var138.method240(-1, class161.field3257)) {
                                    var139 = 7;
                                    var137 = var137.method238(113, class161.field3257.method248((byte) 60));
                                } else if (var138.method240(arg2 - 25970, class50.field1011)) {
                                    var139 = 8;
                                    var137 = var137.method238(1, class50.field1011.method248((byte) 60));
                                } else if (var138.method240(-1, class73.field1458)) {
                                    var139 = 9;
                                    var137 = var137.method238(60, class73.field1458.method248((byte) 60));
                                } else if (var138.method240(arg2 ^ 0xFFFF9A8E, class100.field1918)) {
                                    var137 = var137.method238(40, class100.field1918.method248((byte) 60));
                                    var139 = 10;
                                } else if (var138.method240(-1, class84.field1644)) {
                                    var139 = 11;
                                    var137 = var137.method238(18, class84.field1644.method248((byte) 60));
                                } else if (class40.field776 != 0) {
                                    if (var138.method240(arg2 - 25970, class28.field498)) {
                                        var137 = var137.method238(20, class28.field498.method248((byte) 60));
                                        var139 = 0;
                                    } else if (var138.method240(-1, class171.field3426)) {
                                        var137 = var137.method238(66, class171.field3426.method248((byte) 60));
                                        var139 = 1;
                                    } else if (var138.method240(-1, class51.field1042)) {
                                        var137 = var137.method238(66, class51.field1042.method248((byte) 60));
                                        var139 = 2;
                                    } else if (var138.method240(arg2 ^ 0xFFFF9A8E, class16.field260)) {
                                        var139 = 3;
                                        var137 = var137.method238(58, class16.field260.method248((byte) 60));
                                    } else if (var138.method240(-1, class14.field205)) {
                                        var137 = var137.method238(73, class14.field205.method248((byte) 60));
                                        var139 = 4;
                                    } else if (var138.method240(arg2 - 25970, class139.field2888)) {
                                        var137 = var137.method238(35, class139.field2888.method248((byte) 60));
                                        var139 = 5;
                                    } else if (var138.method240(arg2 - 25970, class97.field1890)) {
                                        var139 = 6;
                                        var137 = var137.method238(60, class97.field1890.method248((byte) 60));
                                    } else if (var138.method240(-1, class161.field3253)) {
                                        var137 = var137.method238(27, class161.field3253.method248((byte) 60));
                                        var139 = 7;
                                    } else if (var138.method240(-1, class50.field1010)) {
                                        var139 = 8;
                                        var137 = var137.method238(81, class50.field1010.method248((byte) 60));
                                    } else if (var138.method240(-1, class73.field1461)) {
                                        var137 = var137.method238(arg2 ^ 0x6546, class73.field1461.method248((byte) 60));
                                        var139 = 9;
                                    } else if (var138.method240(-1, class100.field1921)) {
                                        var137 = var137.method238(arg2 - 25862, class100.field1921.method248((byte) 60));
                                        var139 = 10;
                                    } else if (var138.method240(-1, class84.field1655)) {
                                        var139 = 11;
                                        var137 = var137.method238(22, class84.field1655.method248((byte) 60));
                                    }
                                }
                                class43 var140 = var137.method244(19404);
                                byte var141 = 0;
                                if (var140.method240(-1, class105.field2009)) {
                                    var141 = 1;
                                    var137 = var137.method238(46, class105.field2009.method248((byte) 60));
                                } else if (var140.method240(-1, class57.field1126)) {
                                    var141 = 2;
                                    var137 = var137.method238(arg2 ^ 0x650B, class57.field1126.method248((byte) 60));
                                } else if (var140.method240(-1, class37.field702)) {
                                    var137 = var137.method238(arg2 ^ 0x6540, class37.field702.method248((byte) 60));
                                    var141 = 3;
                                } else if (var140.method240(-1, class41.field812)) {
                                    var141 = 4;
                                    var137 = var137.method238(44, class41.field812.method248((byte) 60));
                                } else if (var140.method240(arg2 ^ 0xFFFF9A8E, class140.field2908)) {
                                    var137 = var137.method238(45, class140.field2908.method248((byte) 60));
                                    var141 = 5;
                                } else if (class40.field776 != 0) {
                                    if (var140.method240(-1, class105.field2024)) {
                                        var137 = var137.method238(arg2 - 25846, class105.field2024.method248((byte) 60));
                                        var141 = 1;
                                    } else if (var140.method240(-1, class57.field1125)) {
                                        var141 = 2;
                                        var137 = var137.method238(arg2 - 25898, class57.field1125.method248((byte) 60));
                                    } else if (var140.method240(-1, class37.field703)) {
                                        var141 = 3;
                                        var137 = var137.method238(83, class37.field703.method248((byte) 60));
                                    } else if (var140.method240(-1, class41.field806)) {
                                        var137 = var137.method238(arg2 ^ 0x6529, class41.field806.method248((byte) 60));
                                        var141 = 4;
                                    } else if (var140.method240(-1, class140.field2900)) {
                                        var141 = 5;
                                        var137 = var137.method238(57, class140.field2900.method248((byte) 60));
                                    }
                                }
                                class29.field522.method338(253, 239);
                                class29.field522.method539(0, 27678);
                                int var142 = class29.field522.field1727;
                                class29.field522.method539(var139, 27678);
                                class29.field522.method539(var141, 27678);
                                class48.method299(class29.field522, var137, arg2 ^ 0x6571);
                                class29.field522.method554(class29.field522.field1727 - var142, (byte) -111);
                            }
                            continue;
                        }
                        if (var311 == 5009) {
                            var7 -= 2;
                            class43 var143 = class43.field852[var7 + 1];
                            class43 var144 = class43.field852[var7];
                            class47.field955++;
                            class29.field522.method338(arg2 ^ 0x658C, 140);
                            class29.field522.method539(0, 27678);
                            int var145 = class29.field522.field1727;
                            class29.field522.method550(26, var144.method249(-48));
                            class48.method299(class29.field522, var143, 0);
                            class29.field522.method554(class29.field522.field1727 - var145, (byte) -111);
                            continue;
                        }
                        if (var311 == 5010) {
                            var6--;
                            int var146 = class129.field2615[var6];
                            class43 var147 = null;
                            if (var146 < 100) {
                                var147 = class127.field2540[var146];
                            }
                            if (var147 == null) {
                                var147 = class157.field3186;
                            }
                            class43.field852[var7++] = var147;
                            continue;
                        }
                        if (var311 == 5011) {
                            var6--;
                            int var148 = class129.field2615[var6];
                            class43 var149 = null;
                            if (var148 < 100) {
                                var149 = class61.field1247[var148];
                            }
                            if (var149 == null) {
                                var149 = class157.field3186;
                            }
                            class43.field852[var7++] = var149;
                            continue;
                        }
                        if (var311 == 5015) {
                            class43 var150;
                            if (class67.field1348 == null || class67.field1348.field23 == null) {
                                var150 = class68.field1374;
                            } else {
                                var150 = class67.field1348.field23;
                            }
                            class43.field852[var7++] = var150;
                            continue;
                        }
                        if (var311 == 5016) {
                            class129.field2615[var6++] = class119.field2382;
                            continue;
                        }
                        if (var311 == 5017) {
                            class129.field2615[var6++] = class23.field408;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var310) {
            if (var5.field3969 == null) {
                if (class81.field1612 != 0) {
                    class81.method504(class180.field3583, class157.field3186, 0, (byte) 67);
                }
                class171.method1086("CS2 - scr:" + var5.field1353 + " op:" + var10, -2929, var310);
            } else {
                class43 var307 = class41.method227((byte) 74, 30);
                var307.method269(class40.field772, (byte) 91).method269(var5.field3969, (byte) 91);
                for (int var308 = class156.field3152 - 1; var308 >= 0; var308--) {
                    var307.method269(class78.field1554, (byte) 91).method269(class43.field822[var308].field1255.field3969, (byte) 91);
                }
                if (var10 == 40) {
                    int var309 = var11[var8];
                    var307.method269(class36.field676, (byte) 91).method269(class30.method161(var309, 10), (byte) 91);
                }
                if (class81.field1612 != 0) {
                    class81.method504(class167.method1036(new class43[] { class16.field268, var5.field3969 }, true), class157.field3186, 0, (byte) 114);
                }
                class171.method1086("CS2 - scr:" + var5.field1353 + " op:" + var10 + new String(var307.method259((byte) 66)), -2929, var310);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method893(byte arg0) {
        int var1 = -3 % ((-arg0 - 31) / 60);
        field2854 = null;
        field2855 = null;
        field2862 = null;
        field2861 = null;
    }
}
