import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class30 implements Runnable {

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "[Lve;")
    public volatile class147[] field847 = new class147[2];

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "Z")
    public volatile boolean field856 = false;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Z")
    public volatile boolean field844 = false;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Lfc;")
    private static class39 field846 = class90.method774("Enter name:", -82);

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Z")
    public static boolean field848 = false;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Lfc;")
    public static class39 field851 = class90.method774("null", -92);

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Lfc;")
    private static class39 field841 = class90.method774("Please wait )2 attempting to reestablish", -78);

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Lfc;")
    public static class39 field853 = class90.method774("Lade Spiel)2Fenster )2 ", -95);

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Lfc;")
    public static class39 field850 = field841;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field858 = 0;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lfc;")
    public static class39 field842 = field846;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "B")
    public static byte field859 = 0;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "Lfc;")
    public static class39 field860 = class90.method774("Wen m-Ochten Sie entfernen?", -81);

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public static int field861 = 0;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Z")
    public static boolean field849 = false;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Loc;")
    public static class100 field839;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Lle;")
    public static class81 field855;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILob;[Ljava/lang/Object;Lob;III)V", line = 14)
    public static final void method365(int arg0, class99 arg1, Object[] arg2, class99 arg3, int arg4, int arg5, int arg6) {
        int var7 = (Integer) arg2[0];
        field843++;
        class27 var8 = class37.method424((byte) 113, var7);
        if (var8 == null) {
            return;
        }
        int var9 = 0;
        if (arg0 != 4) {
            field851 = null;
        }
        int var10 = 0;
        int var11 = -1;
        int[] var12 = var8.field778;
        byte var13 = -1;
        int[] var14 = var8.field771;
        try {
            class126.field3206 = new int[var8.field775];
            class98.field2330 = new class39[var8.field772];
            int var15 = 0;
            int var16 = 0;
            for (int var17 = 1; var17 < arg2.length; var17++) {
                if (arg2[var17] instanceof Integer) {
                    int var18 = (Integer) arg2[var17];
                    if (var18 == -2147483647) {
                        var18 = arg4;
                    }
                    if (var18 == -2147483646) {
                        var18 = arg5;
                    }
                    if (var18 == -2147483645) {
                        var18 = arg1 == null ? -1 : arg1.field2406;
                    }
                    if (var18 == -2147483644) {
                        var18 = arg6;
                    }
                    if (var18 == -2147483643) {
                        var18 = arg1 == null ? -1 : arg1.field2412;
                    }
                    if (var18 == -2147483642) {
                        var18 = arg3 == null ? -1 : arg3.field2406;
                    }
                    if (var18 == -2147483641) {
                        var18 = arg3 == null ? -1 : arg3.field2412;
                    }
                    class126.field3206[var15++] = var18;
                } else if (arg2[var17] instanceof class39) {
                    class98.field2330[var16++] = (class39) arg2[var17];
                }
            }
            int var19 = 0;
            label1414: while (true) {
                var19++;
                if (var19 > 200000) {
                    throw new RuntimeException("slow");
                }
                var11++;
                int var201 = var14[var11];
                if (var201 < 100) {
                    if (var201 == 0) {
                        class42.field1143[var9++] = var12[var11];
                        continue;
                    }
                    if (var201 == 1) {
                        int var20 = var12[var11];
                        class42.field1143[var9++] = class110.field2834[var20];
                        continue;
                    }
                    if (var201 == 2) {
                        int var21 = var12[var11];
                        var9--;
                        class110.field2834[var21] = class42.field1143[var9];
                        continue;
                    }
                    if (var201 == 3) {
                        class78.field1771[var10++] = var8.field777[var11];
                        continue;
                    }
                    if (var201 == 6) {
                        var11 += var12[var11];
                        continue;
                    }
                    if (var201 == 7) {
                        var9 -= 2;
                        if (class42.field1143[var9 + 1] != class42.field1143[var9]) {
                            var11 += var12[var11];
                        }
                        continue;
                    }
                    if (var201 == 8) {
                        var9 -= 2;
                        if (class42.field1143[var9 + 1] == class42.field1143[var9]) {
                            var11 += var12[var11];
                        }
                        continue;
                    }
                    if (var201 == 9) {
                        var9 -= 2;
                        if (class42.field1143[var9] < class42.field1143[var9 + 1]) {
                            var11 += var12[var11];
                        }
                        continue;
                    }
                    if (var201 == 10) {
                        var9 -= 2;
                        if (class42.field1143[var9 + 1] < class42.field1143[var9]) {
                            var11 += var12[var11];
                        }
                        continue;
                    }
                    if (var201 == 21) {
                        if (class60.field1458 == 0) {
                            return;
                        }
                        class115 var22 = class108.field2727[--class60.field1458];
                        class126.field3206 = var22.field3007;
                        var11 = var22.field3003;
                        class98.field2330 = var22.field3006;
                        var8 = var22.field3004;
                        var12 = var8.field778;
                        var14 = var8.field771;
                        continue;
                    }
                    if (var201 == 25) {
                        int var23 = var12[var11];
                        class42.field1143[var9++] = class57.method583((byte) 62, var23);
                        continue;
                    }
                    if (var201 == 27) {
                        int var24 = var12[var11];
                        var9--;
                        class53.method562(class42.field1143[var9], var24, (byte) 107);
                        continue;
                    }
                    if (var201 == 31) {
                        var9 -= 2;
                        if (class42.field1143[var9 + 1] >= class42.field1143[var9]) {
                            var11 += var12[var11];
                        }
                        continue;
                    }
                    if (var201 == 32) {
                        var9 -= 2;
                        if (class42.field1143[var9] >= class42.field1143[var9 + 1]) {
                            var11 += var12[var11];
                        }
                        continue;
                    }
                    if (var201 == 33) {
                        class42.field1143[var9++] = class126.field3206[var12[var11]];
                        continue;
                    }
                    int var10001;
                    if (var201 == 34) {
                        var10001 = var12[var11];
                        var9--;
                        class126.field3206[var10001] = class42.field1143[var9];
                        continue;
                    }
                    if (var201 == 35) {
                        class78.field1771[var10++] = class98.field2330[var12[var11]];
                        continue;
                    }
                    if (var201 == 36) {
                        var10001 = var12[var11];
                        var10--;
                        class98.field2330[var10001] = class78.field1771[var10];
                        continue;
                    }
                    if (var201 == 37) {
                        int var25 = var12[var11];
                        var10 -= var25;
                        class39 var26 = class9.method128(var10, class78.field1771, -17838, var25);
                        class78.field1771[var10++] = var26;
                        continue;
                    }
                    if (var201 == 38) {
                        var9--;
                        continue;
                    }
                    if (var201 == 39) {
                        var10--;
                        continue;
                    }
                    if (var201 == 40) {
                        int var27 = var12[var11];
                        class27 var28 = class37.method424((byte) 86, var27);
                        int[] var29 = new int[var28.field775];
                        class39[] var30 = new class39[var28.field772];
                        for (int var31 = 0; var31 < var28.field773; var31++) {
                            var29[var31] = class42.field1143[var9 + var31 - var28.field773];
                        }
                        for (int var32 = 0; var32 < var28.field774; var32++) {
                            var30[var32] = class78.field1771[var32 + var10 - var28.field774];
                        }
                        var10 -= var28.field774;
                        var9 -= var28.field773;
                        class115 var33 = new class115();
                        var33.field3003 = var11;
                        var33.field3006 = class98.field2330;
                        var11 = -1;
                        var33.field3007 = class126.field3206;
                        var33.field3004 = var8;
                        var8 = var28;
                        class108.field2727[class60.field1458++] = var33;
                        var12 = var28.field778;
                        var14 = var28.field771;
                        class126.field3206 = var29;
                        class98.field2330 = var30;
                        continue;
                    }
                    if (var201 == 42) {
                        class42.field1143[var9++] = class99.field2347[var12[var11]];
                        continue;
                    }
                    if (var201 == 43) {
                        var10001 = var12[var11];
                        var9--;
                        class99.field2347[var10001] = class42.field1143[var9];
                        continue;
                    }
                    if (var201 == 44) {
                        int var34 = var12[var11] >> 16;
                        int var35 = var12[var11] & 0xFFFF;
                        var9--;
                        int var36 = class42.field1143[var9];
                        if (var36 >= 0 && var36 <= 5000) {
                            class92.field2160[var34] = var36;
                            byte var37 = -1;
                            if (var35 == 105) {
                                var37 = 0;
                            }
                            int var38 = 0;
                            while (true) {
                                if (var38 >= var36) {
                                    continue label1414;
                                }
                                class88.field2030[var34][var38] = var37;
                                var38++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var201 == 45) {
                        int var39 = var12[var11];
                        var9--;
                        int var40 = class42.field1143[var9];
                        if (var40 >= 0 && var40 < class92.field2160[var39]) {
                            class42.field1143[var9++] = class88.field2030[var39][var40];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var201 == 46) {
                        var9 -= 2;
                        int var41 = class42.field1143[var9];
                        int var42 = var12[var11];
                        if (var41 >= 0 && class92.field2160[var42] > var41) {
                            class88.field2030[var42][var41] = class42.field1143[var9 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                }
                boolean var43;
                if (var12[var11] == 1) {
                    var43 = true;
                } else {
                    var43 = false;
                }
                int var10000;
                if (var201 < 1000) {
                    if (var201 == 100) {
                        var9 -= 3;
                        int var186 = class42.field1143[var9];
                        int var187 = class42.field1143[var9 + 1];
                        int var188 = class42.field1143[var9 + 2];
                        if (var187 == 0) {
                            throw new RuntimeException();
                        }
                        class99 var189 = class54.method567(124, var186);
                        if (var189.field2416 == null) {
                            var189.field2416 = new class99[var188 + 1];
                        }
                        if (var188 >= var189.field2416.length) {
                            class99[] var190 = new class99[var188 + 1];
                            for (int var191 = 0; var191 < var189.field2416.length; var191++) {
                                var190[var191] = var189.field2416[var191];
                            }
                            var189.field2416 = var190;
                        }
                        if (var188 > 0 && var189.field2416[var188 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var188 - 1));
                        }
                        class99 var192 = new class99();
                        var192.field2452 = var187;
                        var192.field2389 = true;
                        var192.field2348 = var192.field2406 = var189.field2406;
                        var192.field2412 = var188;
                        var189.field2416[var188] = var192;
                        if (var43) {
                            class114.field2991 = var192;
                        } else {
                            class66.field1580 = var192;
                        }
                        class36.method413(var189, false);
                        continue;
                    }
                    if (var201 == 101) {
                        class99 var193 = var43 ? class114.field2991 : class66.field1580;
                        class99 var194 = class54.method567(arg0 + 48, var193.field2406);
                        var194.field2416[var193.field2412] = null;
                        class36.method413(var194, false);
                        continue;
                    }
                    if (var201 == 102) {
                        var10000 = arg0 ^ 0x77;
                        var9--;
                        class99 var195 = class54.method567(var10000, class42.field1143[var9]);
                        var195.field2416 = null;
                        class36.method413(var195, false);
                        continue;
                    }
                    if (var201 == 200) {
                        var9 -= 2;
                        int var196 = class42.field1143[var9];
                        int var197 = class42.field1143[var9 + 1];
                        class99 var198 = class72.method663(var196, 0, var197);
                        if (var198 != null && var197 != -1) {
                            class42.field1143[var9++] = 1;
                            if (var43) {
                                class114.field2991 = var198;
                            } else {
                                class66.field1580 = var198;
                            }
                            continue;
                        }
                        class42.field1143[var9++] = 0;
                        continue;
                    }
                } else if (var201 >= 1000 && var201 < 1100 || !(var201 < 2000 || var201 >= 2100)) {
                    class99 var44;
                    if (var201 < 2000) {
                        var44 = var43 ? class114.field2991 : class66.field1580;
                    } else {
                        var201 -= 1000;
                        var10000 = arg0 + 120;
                        var9--;
                        var44 = class54.method567(var10000, class42.field1143[var9]);
                    }
                    class36.method413(var44, false);
                    if (var201 == 1000) {
                        var9 -= 2;
                        var44.field2450 = class42.field1143[var9];
                        var44.field2368 = class42.field1143[var9 + 1];
                        continue;
                    }
                    if (var201 == 1001) {
                        var9 -= 2;
                        var44.field2357 = class42.field1143[var9];
                        var44.field2381 = class42.field1143[var9 + 1];
                        continue;
                    }
                    if (var201 == 1003) {
                        var9--;
                        var44.field2385 = class42.field1143[var9] == 1;
                        continue;
                    }
                } else if (var201 >= 1100 && var201 < 1200 || !(var201 < 2100 || var201 >= 2200)) {
                    class99 var185;
                    if (var201 >= 2000) {
                        var10000 = arg0 ^ 0x2E;
                        var9--;
                        var185 = class54.method567(var10000, class42.field1143[var9]);
                        var201 -= 1000;
                    } else {
                        var185 = var43 ? class114.field2991 : class66.field1580;
                    }
                    class36.method413(var185, false);
                    if (var201 == 1100) {
                        var9 -= 2;
                        var185.field2429 = class42.field1143[var9];
                        if (var185.field2429 > var185.field2338 - var185.field2357) {
                            var185.field2429 = var185.field2338 - var185.field2357;
                        }
                        if (var185.field2429 < 0) {
                            var185.field2429 = 0;
                        }
                        var185.field2447 = class42.field1143[var9 + 1];
                        if (var185.field2361 - var185.field2381 < var185.field2447) {
                            var185.field2447 = var185.field2361 - var185.field2381;
                        }
                        if (var185.field2447 < 0) {
                            var185.field2447 = 0;
                        }
                        continue;
                    }
                    if (var201 == 1101) {
                        var9--;
                        var185.field2446 = class42.field1143[var9];
                        continue;
                    }
                    if (var201 == 1102) {
                        var9--;
                        var185.field2414 = class42.field1143[var9] == 1;
                        continue;
                    }
                    if (var201 == 1103) {
                        var9--;
                        var185.field2354 = class42.field1143[var9];
                        continue;
                    }
                    if (var201 == 1104) {
                        var9--;
                        var185.field2448 = class42.field1143[var9];
                        continue;
                    }
                    if (var201 == 1105) {
                        var9--;
                        var185.field2411 = class42.field1143[var9];
                        continue;
                    }
                    if (var201 == 1106) {
                        var9--;
                        var185.field2335 = class42.field1143[var9];
                        continue;
                    }
                    if (var201 == 1107) {
                        var9--;
                        var185.field2376 = class42.field1143[var9] == 1;
                        continue;
                    }
                    if (var201 == 1108) {
                        var185.field2395 = 1;
                        var9--;
                        var185.field2431 = class42.field1143[var9];
                        continue;
                    }
                    if (var201 == 1109) {
                        var9 -= 6;
                        var185.field2455 = class42.field1143[var9];
                        var185.field2418 = class42.field1143[var9 + 1];
                        var185.field2342 = class42.field1143[var9 + 2];
                        var185.field2384 = class42.field1143[var9 + 3];
                        var185.field2400 = class42.field1143[var9 + 4];
                        var185.field2454 = class42.field1143[var9 + 5];
                        continue;
                    }
                    if (var201 == 1110) {
                        var9--;
                        var185.field2423 = class42.field1143[var9];
                        continue;
                    }
                    if (var201 == 1111) {
                        var9--;
                        var185.field2435 = class42.field1143[var9] == 1;
                        continue;
                    }
                    if (var201 == 1112) {
                        var10--;
                        var185.field2427 = class78.field1771[var10];
                        continue;
                    }
                    if (var201 == 1113) {
                        var9--;
                        var185.field2393 = class42.field1143[var9];
                        continue;
                    }
                    if (var201 == 1114) {
                        var9 -= 3;
                        var185.field2434 = class42.field1143[var9];
                        var185.field2397 = class42.field1143[var9 + 1];
                        var185.field2437 = class42.field1143[var9 + 2];
                        continue;
                    }
                    if (var201 == 1115) {
                        var9--;
                        var185.field2373 = class42.field1143[var9] == 1;
                        continue;
                    }
                    if (var201 == 1116) {
                        var9--;
                        var185.field2366 = class42.field1143[var9];
                        continue;
                    }
                    if (var201 == 1117) {
                        var9--;
                        var185.field2367 = class42.field1143[var9];
                        continue;
                    }
                    if (var201 == 1118) {
                        var9--;
                        var185.field2375 = class42.field1143[var9] == 1;
                        continue;
                    }
                    if (var201 == 1119) {
                        var9--;
                        var185.field2417 = class42.field1143[var9] == 1;
                        continue;
                    }
                    if (var201 == 1120) {
                        var9 -= 2;
                        var185.field2338 = class42.field1143[var9];
                        var185.field2361 = class42.field1143[var9 + 1];
                        continue;
                    }
                } else if (var201 >= 1200 && var201 < 1300 || var201 >= 2200 && var201 < 2300) {
                    class99 var181;
                    if (var201 < 2000) {
                        var181 = var43 ? class114.field2991 : class66.field1580;
                    } else {
                        var9--;
                        var181 = class54.method567(90, class42.field1143[var9]);
                        var201 -= 1000;
                    }
                    class36.method413(var181, false);
                    if (var201 == 1200) {
                        var9 -= 2;
                        int var182 = class42.field1143[var9 + 1];
                        int var183 = class42.field1143[var9];
                        var181.field2343 = var182;
                        var181.field2345 = var183;
                        class109 var184 = class37.method421(true, var183);
                        var181.field2384 = var184.field2734;
                        var181.field2400 = var184.field2788;
                        var181.field2455 = var184.field2776;
                        var181.field2342 = var184.field2777;
                        var181.field2454 = var184.field2760;
                        if (var181.field2357 > 0) {
                            var181.field2454 = var181.field2454 * 32 / var181.field2357;
                        }
                        var181.field2418 = var184.field2749;
                        continue;
                    }
                    if (var201 == 1201) {
                        var181.field2395 = 2;
                        var9--;
                        var181.field2431 = class42.field1143[var9];
                        continue;
                    }
                    if (var201 == 1202) {
                        var181.field2395 = 3;
                        var181.field2431 = class94.field2197.field3553.method1105((byte) -95);
                        continue;
                    }
                } else if (var201 >= 1300 && var201 < 1400 || var201 >= 2300 && var201 < 2400) {
                    class99 var45;
                    if (var201 >= 2000) {
                        var9--;
                        var45 = class54.method567(54, class42.field1143[var9]);
                        var201 -= 1000;
                    } else {
                        var45 = var43 ? class114.field2991 : class66.field1580;
                    }
                    if (var201 == 1300) {
                        var9--;
                        int var46 = class42.field1143[var9] - 1;
                        if (var46 >= 0 && var46 <= 9) {
                            var10--;
                            var45.method828(var46, 94, class78.field1771[var10]);
                            continue;
                        }
                        var10--;
                        continue;
                    }
                    if (var201 == 1301) {
                        var9 -= 2;
                        int var47 = class42.field1143[var9];
                        int var48 = class42.field1143[var9 + 1];
                        var45.field2358 = class72.method663(var47, arg0 ^ 0x4, var48);
                        continue;
                    }
                    if (var201 == 1302) {
                        var9--;
                        var45.field2362 = class42.field1143[var9] == 1;
                        continue;
                    }
                    if (var201 == 1303) {
                        var9--;
                        var45.field2391 = class42.field1143[var9];
                        continue;
                    }
                    if (var201 == 1304) {
                        var9--;
                        var45.field2353 = class42.field1143[var9];
                        continue;
                    }
                    if (var201 == 1305) {
                        var10--;
                        var45.field2402 = class78.field1771[var10];
                        continue;
                    }
                    if (var201 == 1306) {
                        var10--;
                        var45.field2346 = class78.field1771[var10];
                        continue;
                    }
                } else {
                    if (var201 >= 1400 && var201 < 1500 || var201 >= 2400 && var201 < 2500) {
                        class99 var49;
                        if (var201 >= 2000) {
                            var201 -= 1000;
                            var9--;
                            var49 = class54.method567(92, class42.field1143[var9]);
                        } else {
                            var49 = var43 ? class114.field2991 : class66.field1580;
                        }
                        var10--;
                        class39 var50 = class78.field1771[var10];
                        Object[] var51 = new Object[var50.method437(arg0 ^ 0xFFFFFFC9) + 1];
                        for (int var52 = var51.length - 1; var52 >= 1; var52--) {
                            if (var50.method442((byte) 92, var52 - 1) == 115) {
                                var10--;
                                var51[var52] = class78.field1771[var10];
                            } else {
                                var9--;
                                var51[var52] = Integer.valueOf(class42.field1143[var9]);
                            }
                        }
                        var9--;
                        int var53 = class42.field1143[var9];
                        if (var53 == -1) {
                            var51 = null;
                        } else {
                            var51[0] = Integer.valueOf(var53);
                        }
                        if (var201 == 1408) {
                            var49.field2359 = var51;
                        }
                        if (var201 == 1415) {
                            var49.field2419 = var51;
                        }
                        if (var201 == 1406) {
                            var49.field2379 = var51;
                        }
                        if (var201 == 1409) {
                            var49.field2428 = var51;
                        }
                        if (var201 == 1416) {
                            var49.field2387 = var51;
                        }
                        if (var201 == 1405) {
                            var49.field2432 = var51;
                        }
                        if (var201 == 1403) {
                            var49.field2408 = var51;
                        }
                        if (var201 == 1414) {
                            var49.field2378 = var51;
                        }
                        if (var201 == 1402) {
                            var49.field2360 = var51;
                        }
                        var49.field2415 = true;
                        if (var201 == 1417) {
                            var49.field2372 = var51;
                        }
                        if (var201 == 1413) {
                            var49.field2392 = var51;
                        }
                        if (var201 == 1407) {
                            var49.field2404 = var51;
                        }
                        if (var201 == 1412) {
                            var49.field2350 = var51;
                        }
                        if (var201 == 1410) {
                            var49.field2401 = var51;
                        }
                        if (var201 == 1401) {
                            var49.field2332 = var51;
                        }
                        if (var201 == 1411) {
                            var49.field2341 = var51;
                        }
                        if (var201 == 1404) {
                            var49.field2451 = var51;
                        }
                        if (var201 == 1400) {
                            var49.field2440 = var51;
                        }
                        continue;
                    }
                    if (var201 < 1600) {
                        class99 var54 = var43 ? class114.field2991 : class66.field1580;
                        if (var201 == 1500) {
                            class42.field1143[var9++] = var54.field2450;
                            continue;
                        }
                        if (var201 == 1501) {
                            class42.field1143[var9++] = var54.field2368;
                            continue;
                        }
                        if (var201 == 1502) {
                            class42.field1143[var9++] = var54.field2357;
                            continue;
                        }
                        if (var201 == 1503) {
                            class42.field1143[var9++] = var54.field2381;
                            continue;
                        }
                        if (var201 == 1504) {
                            class42.field1143[var9++] = var54.field2385 ? 1 : 0;
                            continue;
                        }
                        if (var201 == 1505) {
                            class42.field1143[var9++] = var54.field2348;
                            continue;
                        }
                    } else if (var201 < 1700) {
                        class99 var55 = var43 ? class114.field2991 : class66.field1580;
                        if (var201 == 1600) {
                            class42.field1143[var9++] = var55.field2429;
                            continue;
                        }
                        if (var201 == 1601) {
                            class42.field1143[var9++] = var55.field2447;
                            continue;
                        }
                        if (var201 == 1602) {
                            class78.field1771[var10++] = var55.field2427;
                            continue;
                        }
                        if (var201 == 1603) {
                            class42.field1143[var9++] = var55.field2338;
                            continue;
                        }
                        if (var201 == 1604) {
                            class42.field1143[var9++] = var55.field2361;
                            continue;
                        }
                        if (var201 == 1605) {
                            class42.field1143[var9++] = var55.field2454;
                            continue;
                        }
                        if (var201 == 1606) {
                            class42.field1143[var9++] = var55.field2342;
                            continue;
                        }
                        if (var201 == 1607) {
                            class42.field1143[var9++] = var55.field2400;
                            continue;
                        }
                        if (var201 == 1608) {
                            class42.field1143[var9++] = var55.field2384;
                            continue;
                        }
                    } else if (var201 < 1800) {
                        class99 var56 = var43 ? class114.field2991 : class66.field1580;
                        if (var201 == 1700) {
                            class42.field1143[var9++] = var56.field2345;
                            continue;
                        }
                        if (var201 == 1701) {
                            if (var56.field2345 == -1) {
                                class42.field1143[var9++] = 0;
                            } else {
                                class42.field1143[var9++] = var56.field2343;
                            }
                            continue;
                        }
                        if (var201 == 1702) {
                            class42.field1143[var9++] = var56.field2412;
                            continue;
                        }
                    } else if (var201 < 1900) {
                        class99 var179 = var43 ? class114.field2991 : class66.field1580;
                        if (var201 == 1800) {
                            class42.field1143[var9++] = class67.method639(class89.method768(var179, 117), 33);
                            continue;
                        }
                        if (var201 == 1801) {
                            var9--;
                            int var180 = class42.field1143[var9];
                            if (var179.field2445 != null && var180 < var179.field2445.length && var179.field2445[var180] != null) {
                                class78.field1771[var10++] = var179.field2445[var180];
                                continue;
                            }
                            class78.field1771[var10++] = class57.field1411;
                            continue;
                        }
                        if (var201 == 1802) {
                            if (var179.field2402 == null) {
                                class78.field1771[var10++] = class57.field1411;
                            } else {
                                class78.field1771[var10++] = var179.field2402;
                            }
                            continue;
                        }
                    } else if (var201 < 2600) {
                        var9--;
                        class99 var178 = class54.method567(69, class42.field1143[var9]);
                        if (var201 == 2500) {
                            class42.field1143[var9++] = var178.field2450;
                            continue;
                        }
                        if (var201 == 2501) {
                            class42.field1143[var9++] = var178.field2368;
                            continue;
                        }
                        if (var201 == 2502) {
                            class42.field1143[var9++] = var178.field2357;
                            continue;
                        }
                        if (var201 == 2503) {
                            class42.field1143[var9++] = var178.field2381;
                            continue;
                        }
                        if (var201 == 2504) {
                            class42.field1143[var9++] = var178.field2385 ? 1 : 0;
                            continue;
                        }
                        if (var201 == 2505) {
                            class42.field1143[var9++] = var178.field2348;
                            continue;
                        }
                    } else if (var201 < 2700) {
                        var9--;
                        class99 var177 = class54.method567(43, class42.field1143[var9]);
                        if (var201 == 2600) {
                            class42.field1143[var9++] = var177.field2429;
                            continue;
                        }
                        if (var201 == 2601) {
                            class42.field1143[var9++] = var177.field2447;
                            continue;
                        }
                        if (var201 == 2602) {
                            class78.field1771[var10++] = var177.field2427;
                            continue;
                        }
                        if (var201 == 2603) {
                            class42.field1143[var9++] = var177.field2338;
                            continue;
                        }
                        if (var201 == 2604) {
                            class42.field1143[var9++] = var177.field2361;
                            continue;
                        }
                        if (var201 == 2605) {
                            class42.field1143[var9++] = var177.field2454;
                            continue;
                        }
                        if (var201 == 2606) {
                            class42.field1143[var9++] = var177.field2342;
                            continue;
                        }
                        if (var201 == 2607) {
                            class42.field1143[var9++] = var177.field2400;
                            continue;
                        }
                        if (var201 == 2608) {
                            class42.field1143[var9++] = var177.field2384;
                            continue;
                        }
                    } else if (var201 < 2800) {
                        var10000 = arg0 ^ 0x36;
                        var9--;
                        class99 var57 = class54.method567(var10000, class42.field1143[var9]);
                        if (var201 == 2700) {
                            class42.field1143[var9++] = var57.field2345;
                            continue;
                        }
                        if (var201 == 2701) {
                            if (var57.field2345 == -1) {
                                class42.field1143[var9++] = 0;
                            } else {
                                class42.field1143[var9++] = var57.field2343;
                            }
                            continue;
                        }
                    } else if (var201 < 2900) {
                        var9--;
                        class99 var58 = class54.method567(114, class42.field1143[var9]);
                        if (var201 == 2800) {
                            class42.field1143[var9++] = class67.method639(class89.method768(var58, -74), 33);
                            continue;
                        }
                        if (var201 == 2801) {
                            var9--;
                            int var59 = class42.field1143[var9];
                            if (var58.field2445 != null && var59 < var58.field2445.length && var58.field2445[var59] != null) {
                                class78.field1771[var10++] = var58.field2445[var59];
                                continue;
                            }
                            class78.field1771[var10++] = class57.field1411;
                            continue;
                        }
                        if (var201 == 2802) {
                            if (var58.field2402 == null) {
                                class78.field1771[var10++] = class57.field1411;
                            } else {
                                class78.field1771[var10++] = var58.field2402;
                            }
                            continue;
                        }
                    } else if (var201 < 3200) {
                        if (var201 == 3100) {
                            var10--;
                            class39 var175 = class78.field1771[var10];
                            class28.method346(0, (byte) 116, var175, class57.field1411);
                            continue;
                        }
                        if (var201 == 3101) {
                            var9 -= 2;
                            class27.method344((byte) -117, class94.field2197, class42.field1143[var9], class42.field1143[var9 + 1]);
                            continue;
                        }
                        if (var201 == 3102) {
                            var9--;
                            int var176 = class42.field1143[var9];
                            if (var176 >= 0 && class25.field740.length > var176 && class25.field740[var176] != -1) {
                                class104.field2633 = var176;
                                class142.field3564 = true;
                                class104.field2638 = true;
                            }
                            continue;
                        }
                        if (var201 == 3103) {
                            class10.method140(true);
                            continue;
                        }
                    } else if (var201 < 3300) {
                        if (var201 == 3200) {
                            var9 -= 3;
                            class28.method355(class42.field1143[var9], class42.field1143[var9 + 2], (byte) 121, class42.field1143[var9 + 1]);
                            continue;
                        }
                        if (var201 == 3201) {
                            var9--;
                            class86.method735(class42.field1143[var9], 0);
                            continue;
                        }
                        if (var201 == 3202) {
                            var9 -= 2;
                            class5.method84(class42.field1143[var9 + 1], -22466, class42.field1143[var9]);
                            continue;
                        }
                    } else if (var201 < 3400) {
                        if (var201 == 3300) {
                            class42.field1143[var9++] = class70.field1654;
                            continue;
                        }
                        if (var201 == 3301) {
                            var9 -= 2;
                            int var60 = class42.field1143[var9];
                            int var61 = class42.field1143[var9 + 1];
                            class42.field1143[var9++] = class78.method679(var60, var61, -1);
                            continue;
                        }
                        if (var201 == 3302) {
                            var9 -= 2;
                            int var62 = class42.field1143[var9];
                            int var63 = class42.field1143[var9 + 1];
                            class42.field1143[var9++] = class115.method1001(var63, var62, (byte) -76);
                            continue;
                        }
                        if (var201 == 3303) {
                            var9 -= 2;
                            int var64 = class42.field1143[var9 + 1];
                            int var65 = class42.field1143[var9];
                            class42.field1143[var9++] = class2.method17(-120, var65, var64);
                            continue;
                        }
                        if (var201 == 3304) {
                            var9--;
                            int var66 = class42.field1143[var9];
                            class42.field1143[var9++] = class79.method685(var66, class83.method697(arg0, -13915)).field1680;
                            continue;
                        }
                        if (var201 == 3305) {
                            var9--;
                            int var67 = class42.field1143[var9];
                            class42.field1143[var9++] = class17.field494[var67];
                            continue;
                        }
                        if (var201 == 3306) {
                            var9--;
                            int var68 = class42.field1143[var9];
                            class42.field1143[var9++] = class58.field1443[var68];
                            continue;
                        }
                        if (var201 == 3307) {
                            var9--;
                            int var69 = class42.field1143[var9];
                            class42.field1143[var9++] = class142.field3574[var69];
                            continue;
                        }
                        if (var201 == 3308) {
                            int var70 = class24.field661;
                            int var71 = (class94.field2197.field2916 >> 7) + class54.field1341;
                            int var72 = (class94.field2197.field2909 >> 7) + class55.field1382;
                            class42.field1143[var9++] = (var70 << 28) + var72 + (var71 << 14);
                            continue;
                        }
                        if (var201 == 3309) {
                            var9--;
                            int var73 = class42.field1143[var9];
                            class42.field1143[var9++] = class87.method747(16383, var73 >> 14);
                            continue;
                        }
                        if (var201 == 3310) {
                            var9--;
                            int var74 = class42.field1143[var9];
                            class42.field1143[var9++] = var74 >> 28;
                            continue;
                        }
                        if (var201 == 3311) {
                            var9--;
                            int var75 = class42.field1143[var9];
                            class42.field1143[var9++] = class87.method747(var75, 16383);
                            continue;
                        }
                        if (var201 == 3312) {
                            class42.field1143[var9++] = class26.field743 ? 1 : 0;
                            continue;
                        }
                        if (var201 == 3313) {
                            var9 -= 2;
                            int var76 = class42.field1143[var9 + 1];
                            int var77 = class42.field1143[var9] + 32768;
                            class42.field1143[var9++] = class78.method679(var77, var76, -1);
                            continue;
                        }
                        if (var201 == 3314) {
                            var9 -= 2;
                            int var78 = class42.field1143[var9] + 32768;
                            int var79 = class42.field1143[var9 + 1];
                            class42.field1143[var9++] = class115.method1001(var79, var78, (byte) -95);
                            continue;
                        }
                        if (var201 == 3315) {
                            var9 -= 2;
                            int var80 = class42.field1143[var9] + 32768;
                            int var81 = class42.field1143[var9 + 1];
                            class42.field1143[var9++] = class2.method17(-124, var80, var81);
                            continue;
                        }
                    } else if (var201 < 3500) {
                        if (var201 == 3400) {
                            var9 -= 2;
                            int var82 = class42.field1143[var9];
                            int var83 = class42.field1143[var9 + 1];
                            class36 var84 = class15.method190(var82, (byte) -125);
                            for (int var85 = 0; var85 < var84.field989; var85++) {
                                if (var84.field974[var85] == var83) {
                                    class78.field1771[var10++] = var84.field975[var85];
                                    var84 = null;
                                    break;
                                }
                            }
                            if (var84 != null) {
                                class78.field1771[var10++] = var84.field995;
                            }
                            continue;
                        }
                        if (var201 == 3408) {
                            var9 -= 4;
                            int var86 = class42.field1143[var9 + 1];
                            int var87 = class42.field1143[var9 + 2];
                            int var88 = class42.field1143[var9];
                            int var89 = class42.field1143[var9 + 3];
                            class36 var90 = class15.method190(var87, (byte) -108);
                            if (var90.field991 == var88 && var90.field981 == var86) {
                                for (int var91 = 0; var91 < var90.field989; var91++) {
                                    if (var90.field974[var91] == var89) {
                                        if (var86 == 115) {
                                            class78.field1771[var10++] = var90.field975[var91];
                                        } else {
                                            class42.field1143[var9++] = var90.field985[var91];
                                        }
                                        var90 = null;
                                        break;
                                    }
                                }
                                if (var90 != null) {
                                    if (var86 == 115) {
                                        class78.field1771[var10++] = var90.field995;
                                    } else {
                                        class42.field1143[var9++] = var90.field977;
                                    }
                                }
                                continue;
                            }
                            if (var86 == 115) {
                                class78.field1771[var10++] = class60.field1468;
                            } else {
                                class42.field1143[var9++] = 0;
                            }
                            continue;
                        }
                    } else if (var201 < 3700) {
                        if (var201 == 3600) {
                            if (class58.field1430 == 0) {
                                class42.field1143[var9++] = -2;
                            } else if (class58.field1430 == 1) {
                                class42.field1143[var9++] = -1;
                            } else {
                                class42.field1143[var9++] = class92.field2165;
                            }
                            continue;
                        }
                        if (var201 == 3601) {
                            var9--;
                            int var92 = class42.field1143[var9];
                            if (class58.field1430 == 2 && var92 < class92.field2165) {
                                class78.field1771[var10++] = class139.field3482[var92];
                                continue;
                            }
                            class78.field1771[var10++] = class57.field1411;
                            continue;
                        }
                        if (var201 == 3602) {
                            var9--;
                            int var93 = class42.field1143[var9];
                            if (class58.field1430 == 2 && var93 < class92.field2165) {
                                class42.field1143[var9++] = class55.field1390[var93];
                                continue;
                            }
                            class42.field1143[var9++] = 0;
                            continue;
                        }
                        if (var201 == 3603) {
                            var9--;
                            int var94 = class42.field1143[var9];
                            if (class58.field1430 == 2 && class92.field2165 > var94) {
                                class42.field1143[var9++] = class3.field70[var94];
                                continue;
                            }
                            class42.field1143[var9++] = 0;
                            continue;
                        }
                        if (var201 == 3604) {
                            var10--;
                            class39 var95 = class78.field1771[var10];
                            var9--;
                            int var96 = class42.field1143[var9];
                            class88.method752((byte) -101, var95, var96);
                            continue;
                        }
                        if (var201 == 3611) {
                            if (class25.field678 == null) {
                                class78.field1771[var10++] = class57.field1411;
                            } else {
                                class78.field1771[var10++] = class25.field678;
                            }
                            continue;
                        }
                        if (var201 == 3612) {
                            if (class25.field678 == null) {
                                class42.field1143[var9++] = 0;
                            } else {
                                class42.field1143[var9++] = class50.field1266;
                            }
                            continue;
                        }
                        if (var201 == 3613) {
                            var9--;
                            int var97 = class42.field1143[var9];
                            if (class25.field678 != null && var97 < class50.field1266) {
                                class78.field1771[var10++] = class94.field2208[var97].field1714;
                                continue;
                            }
                            class78.field1771[var10++] = class57.field1411;
                            continue;
                        }
                        if (var201 == 3614) {
                            var9--;
                            int var98 = class42.field1143[var9];
                            if (class25.field678 != null && var98 < class50.field1266) {
                                class42.field1143[var9++] = class94.field2208[var98].field1711;
                                continue;
                            }
                            class42.field1143[var9++] = 0;
                            continue;
                        }
                        if (var201 == 3615) {
                            var9--;
                            int var99 = class42.field1143[var9];
                            if (class25.field678 != null && var99 < class50.field1266) {
                                class42.field1143[var9++] = class94.field2208[var99].field1707;
                                continue;
                            }
                            class42.field1143[var9++] = 0;
                            continue;
                        }
                    } else if (var201 < 4100) {
                        if (var201 == 4000) {
                            var9 -= 2;
                            int var142 = class42.field1143[var9 + 1];
                            int var143 = class42.field1143[var9];
                            class42.field1143[var9++] = var142 + var143;
                            continue;
                        }
                        if (var201 == 4001) {
                            var9 -= 2;
                            int var144 = class42.field1143[var9];
                            int var145 = class42.field1143[var9 + 1];
                            class42.field1143[var9++] = var144 - var145;
                            continue;
                        }
                        if (var201 == 4002) {
                            var9 -= 2;
                            int var146 = class42.field1143[var9 + 1];
                            int var147 = class42.field1143[var9];
                            class42.field1143[var9++] = var146 * var147;
                            continue;
                        }
                        if (var201 == 4003) {
                            var9 -= 2;
                            int var148 = class42.field1143[var9];
                            int var149 = class42.field1143[var9 + 1];
                            class42.field1143[var9++] = var148 / var149;
                            continue;
                        }
                        if (var201 == 4004) {
                            var9--;
                            int var150 = class42.field1143[var9];
                            class42.field1143[var9++] = (int) (Math.random() * (double) var150);
                            continue;
                        }
                        if (var201 == 4005) {
                            var9--;
                            int var151 = class42.field1143[var9];
                            class42.field1143[var9++] = (int) (Math.random() * (double) (var151 + 1));
                            continue;
                        }
                        if (var201 == 4006) {
                            var9 -= 5;
                            int var152 = class42.field1143[var9 + 1];
                            int var153 = class42.field1143[var9];
                            int var154 = class42.field1143[var9 + 2];
                            int var155 = class42.field1143[var9 + 4];
                            int var156 = class42.field1143[var9 + 3];
                            class42.field1143[var9++] = (var152 - var153) * (-var154 + var155) / (var156 - var154) + var153;
                            continue;
                        }
                        if (var201 == 4007) {
                            var9 -= 2;
                            int var157 = class42.field1143[var9];
                            int var158 = class42.field1143[var9 + 1];
                            class42.field1143[var9++] = var157 * var158 / 100 + var157;
                            continue;
                        }
                        if (var201 == 4008) {
                            var9 -= 2;
                            int var159 = class42.field1143[var9 + 1];
                            int var160 = class42.field1143[var9];
                            class42.field1143[var9++] = class126.method1050(0x1 << var159, var160);
                            continue;
                        }
                        if (var201 == 4009) {
                            var9 -= 2;
                            int var161 = class42.field1143[var9];
                            int var162 = class42.field1143[var9 + 1];
                            class42.field1143[var9++] = class87.method747(-(0x1 << var162) - 1, var161);
                            continue;
                        }
                        if (var201 == 4010) {
                            var9 -= 2;
                            int var163 = class42.field1143[var9];
                            int var164 = class42.field1143[var9 + 1];
                            class42.field1143[var9++] = class87.method747(0x1 << var164, var163) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var201 == 4011) {
                            var9 -= 2;
                            int var165 = class42.field1143[var9];
                            int var166 = class42.field1143[var9 + 1];
                            class42.field1143[var9++] = var165 % var166;
                            continue;
                        }
                        if (var201 == 4012) {
                            var9 -= 2;
                            int var167 = class42.field1143[var9];
                            int var168 = class42.field1143[var9 + 1];
                            if (var167 == 0) {
                                class42.field1143[var9++] = 0;
                            } else {
                                class42.field1143[var9++] = (int) Math.pow((double) var167, (double) var168);
                            }
                            continue;
                        }
                        if (var201 == 4013) {
                            var9 -= 2;
                            int var169 = class42.field1143[var9 + 1];
                            int var170 = class42.field1143[var9];
                            if (var170 == 0) {
                                class42.field1143[var9++] = 0;
                            } else if (var169 == 0) {
                                class42.field1143[var9++] = Integer.MAX_VALUE;
                            } else {
                                class42.field1143[var9++] = (int) Math.pow((double) var170, 1.0D / (double) var169);
                            }
                            continue;
                        }
                        if (var201 == 4014) {
                            var9 -= 2;
                            int var171 = class42.field1143[var9];
                            int var172 = class42.field1143[var9 + 1];
                            class42.field1143[var9++] = class87.method747(var171, var172);
                            continue;
                        }
                        if (var201 == 4015) {
                            var9 -= 2;
                            int var173 = class42.field1143[var9];
                            int var174 = class42.field1143[var9 + 1];
                            class42.field1143[var9++] = class126.method1050(var174, var173);
                            continue;
                        }
                    } else if (var201 < 4200) {
                        if (var201 == 4100) {
                            var9--;
                            int var114 = class42.field1143[var9];
                            var10--;
                            class39 var115 = class78.field1771[var10];
                            class78.field1771[var10++] = class137.method1111(new class39[] { var115, class86.method734(var114, 2218) }, (byte) -90);
                            continue;
                        }
                        if (var201 == 4101) {
                            var10 -= 2;
                            class39 var116 = class78.field1771[var10];
                            class39 var117 = class78.field1771[var10 + 1];
                            class78.field1771[var10++] = class137.method1111(new class39[] { var116, var117 }, (byte) 83);
                            continue;
                        }
                        if (var201 == 4102) {
                            var10--;
                            class39 var118 = class78.field1771[var10];
                            var9--;
                            int var119 = class42.field1143[var9];
                            class78.field1771[var10++] = class137.method1111(new class39[] { var118, class18.method214(var119, true, -19178) }, (byte) 114);
                            continue;
                        }
                        if (var201 == 4103) {
                            var10--;
                            class39 var120 = class78.field1771[var10];
                            class78.field1771[var10++] = var120.method452(true);
                            continue;
                        }
                        if (var201 == 4104) {
                            var9--;
                            int var121 = class42.field1143[var9];
                            long var122 = (long) var121 * 86400000L + 1014768000000L;
                            class68.field1622.setTime(new Date(var122));
                            int var124 = class68.field1622.get(5);
                            int var125 = class68.field1622.get(2);
                            int var126 = class68.field1622.get(1);
                            class78.field1771[var10++] = class137.method1111(new class39[] { class86.method734(var124, 2218), class37.field997, class96.field2282[var125], class37.field997, class86.method734(var126, 2218) }, (byte) -108);
                            continue;
                        }
                        if (var201 == 4105) {
                            var10 -= 2;
                            class39 var127 = class78.field1771[var10];
                            class39 var128 = class78.field1771[var10 + 1];
                            if (class94.field2197.field3553 != null && class94.field2197.field3553.field3420) {
                                class78.field1771[var10++] = var128;
                                continue;
                            }
                            class78.field1771[var10++] = var127;
                            continue;
                        }
                        if (var201 == 4106) {
                            var9--;
                            int var129 = class42.field1143[var9];
                            class78.field1771[var10++] = class86.method734(var129, 2218);
                            continue;
                        }
                        if (var201 == 4107) {
                            var10 -= 2;
                            class42.field1143[var9++] = class78.field1771[var10].method455(false, class78.field1771[var10 + 1]);
                            continue;
                        }
                        if (var201 == 4108) {
                            var9 -= 2;
                            int var130 = class42.field1143[var9];
                            var10--;
                            class39 var131 = class78.field1771[var10];
                            int var132 = class42.field1143[var9 + 1];
                            byte[] var133 = class131.field3318.method839(5, var132, 0);
                            class84 var134 = new class84(var133);
                            class42.field1143[var9++] = var134.method718(var131, var130);
                            continue;
                        }
                        if (var201 == 4109) {
                            var10--;
                            class39 var135 = class78.field1771[var10];
                            var9 -= 2;
                            int var136 = class42.field1143[var9];
                            int var137 = class42.field1143[var9 + 1];
                            byte[] var138 = class131.field3318.method839(5, var137, 0);
                            class84 var139 = new class84(var138);
                            class42.field1143[var9++] = var139.method706(var135, var136);
                            continue;
                        }
                        if (var201 == 4110) {
                            var10 -= 2;
                            class39 var140 = class78.field1771[var10];
                            class39 var141 = class78.field1771[var10 + 1];
                            var9--;
                            if (class42.field1143[var9] == 1) {
                                class78.field1771[var10++] = var140;
                            } else {
                                class78.field1771[var10++] = var141;
                            }
                            continue;
                        }
                    } else if (var201 < 4300) {
                        if (var201 == 4200) {
                            var9--;
                            int var100 = class42.field1143[var9];
                            class78.field1771[var10++] = class37.method421(true, var100).field2787;
                            continue;
                        }
                        if (var201 == 4201) {
                            var9 -= 2;
                            int var101 = class42.field1143[var9];
                            int var102 = class42.field1143[var9 + 1];
                            class109 var103 = class37.method421(true, var101);
                            if (var102 >= 1 && var102 <= 5 && var103.field2748[var102 - 1] != null) {
                                class78.field1771[var10++] = var103.field2748[var102 - 1];
                                continue;
                            }
                            class78.field1771[var10++] = class57.field1411;
                            continue;
                        }
                        if (var201 == 4202) {
                            var9 -= 2;
                            int var104 = class42.field1143[var9];
                            int var105 = class42.field1143[var9 + 1];
                            class109 var106 = class37.method421(true, var104);
                            if (var105 >= 1 && var105 <= 5 && var106.field2764[var105 - 1] != null) {
                                class78.field1771[var10++] = var106.field2764[var105 - 1];
                                continue;
                            }
                            class78.field1771[var10++] = class57.field1411;
                            continue;
                        }
                        if (var201 == 4203) {
                            var9--;
                            int var107 = class42.field1143[var9];
                            class42.field1143[var9++] = class37.method421(true, var107).field2774;
                            continue;
                        }
                        if (var201 == 4204) {
                            var9--;
                            int var108 = class42.field1143[var9];
                            class42.field1143[var9++] = class37.method421(true, var108).field2778 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var201 == 4205) {
                            var9--;
                            int var109 = class42.field1143[var9];
                            class109 var110 = class37.method421(true, var109);
                            if (var110.field2772 == -1 && var110.field2769 >= 0) {
                                class42.field1143[var9++] = var110.field2769;
                                continue;
                            }
                            class42.field1143[var9++] = var109;
                            continue;
                        }
                        if (var201 == 4206) {
                            var9--;
                            int var111 = class42.field1143[var9];
                            class109 var112 = class37.method421(true, var111);
                            if (var112.field2772 >= 0 && var112.field2769 >= 0) {
                                class42.field1143[var9++] = var112.field2769;
                                continue;
                            }
                            class42.field1143[var9++] = var111;
                            continue;
                        }
                        if (var201 == 4207) {
                            var9--;
                            int var113 = class42.field1143[var9];
                            class42.field1143[var9++] = class37.method421(true, var113).field2739 ? 1 : 0;
                            continue;
                        }
                    }
                }
                class142.method1158("CS2 - nosuchop:" + var201, null, arg0 - 96);
                return;
            }
        } catch (Exception var200) {
            class142.method1158("CS2 - scr:" + var8.field3619 + " op:" + var13, var200, -111);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 2250)
    public static final void method366(int arg0) {
        field854++;
        int var1 = class93.field2171;
        int var2 = class44.field1197;
        int var3 = class146.field3638;
        int var4 = class116.field3037;
        int var5 = 6116423;
        class152.method1209(var2, var1, var3, var4, var5);
        class152.method1209(var2 + 1, var1 + 1, var3 - 2, 16, 0);
        class152.method1212(var2 + 1, var1 + 18, var3 - 2, var4 + -19, 0);
        class96.field2224.method700(class131.field3308, var2 + 3, var1 + 14, var5, -1);
        int var6 = class131.field3322;
        int var7 = class12.field314;
        if (class50.field1258 == 0) {
            var7 -= 4;
            var6 -= 4;
        }
        if (arg0 != 16776960) {
            return;
        }
        if (class50.field1258 == 1) {
            var6 -= 205;
            var7 -= 553;
        }
        if (class50.field1258 == 2) {
            var7 -= 17;
            var6 -= 357;
        }
        for (int var8 = 0; var8 < class126.field3207; var8++) {
            int var9 = var1 + (-var8 + -1 + class126.field3207) * 15 + 31;
            int var10 = 16777215;
            if (var7 > var2 && var2 + var3 > var7 && var6 > var9 - 13 && var9 + 3 > var6) {
                var10 = 16776960;
            }
            class96.field2224.method700(class97.field2315[var8], var2 + 3, var9, var10, 0);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 2327)
    public static final void method367(int arg0) {
        int var1 = -106 / ((66 - arg0) / 49);
        class137.field3426.method927(false);
        field852++;
        class114.field2984.method927(false);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V", line = 2351)
    public static final void method368(int arg0, boolean arg1) {
        field837++;
        if (client.field563 == null) {
            return;
        }
        try {
            class25 var2 = new class25(4);
            if (arg0 <= 100) {
                method366(-41);
            }
            var2.method326(arg1 ? 2 : 3, (byte) -75);
            var2.method309(1870, 0);
            client.field563.method1140(true, 4, 0, var2.field711);
        } catch (IOException var4) {
            try {
                client.field563.method1145(5073);
            } catch (Exception var3) {
            }
            client.field563 = null;
            class24.field653++;
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V", line = 2394)
    public static void method369(int arg0) {
        field860 = null;
        field846 = null;
        field839 = null;
        field842 = null;
        if (arg0 != -28860) {
            return;
        }
        field851 = null;
        field853 = null;
        field855 = null;
        field841 = null;
        field850 = null;
    }

    @OriginalMember(owner = "client!ea", name = "run", descriptor = "()V", line = 2412)
    public final void run() {
        this.field844 = true;
        try {
            while (!this.field856) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class147 var2 = this.field847[var1];
                    if (var2 != null) {
                        var2.method1189(256);
                    }
                }
                class61.method609(-124, 10L);
                class44.method514(4, false);
            }
        } catch (Exception var9) {
            class142.method1158(null, var9, -114);
        } finally {
            Object var6 = null;
            this.field844 = false;
        }
        field845++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B", line = 2452)
    public static final byte[] method370(Object arg0, boolean arg1, int arg2) {
        field840++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class110.method970(var3, 0) : var3;
        } else if (arg0 instanceof class61) {
            class61 var4 = (class61) arg0;
            return var4.method605(arg2 ^ 0xFFFF9863);
        } else if (arg2 == -1) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }
}
