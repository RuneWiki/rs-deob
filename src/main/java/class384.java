import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class384 {

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    private static int field5592 = 0;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "[Ljava/lang/String;")
    private static String[] field5608 = new String[1000];

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "[[I")
    private static int[][] field5597 = new int[5][5000];

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "[I")
    private static int[] field5604 = new int[1000];

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "[Ljs;")
    private static class173[] field5591 = new class173[50];

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "[I")
    private static int[] field5613 = new int[5];

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "Ljava/util/Calendar;")
    private static Calendar field5612 = Calendar.getInstance();

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "[I")
    private static int[] field5616 = new int[3];

    @OriginalMember(owner = "client!ws", name = "y", descriptor = "[Ljava/lang/String;")
    private static String[] field5615 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "Ljg;")
    public static class241 field5614 = new class241(4);

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "Lfh;")
    private static class170 field5605;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "Lfh;")
    private static class170 field5606;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "Lgs;")
    private static class383 field5607;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "[I")
    private static int[] field5594;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "[Ljava/lang/String;")
    private static String[] field5595;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lik;II)V")
    public static final void method2312(class463 arg0, int arg1, int arg2) {
        class201 var3 = class438.method2690(-94, arg0, arg1, arg2);
        if (var3 == null) {
            return;
        }
        field5594 = new int[var3.field3022];
        field5595 = new String[var3.field3029];
        if (class1.field25 == var3.field3027 || class324.field4869 == var3.field3027 || class245.field3680 == var3.field3027) {
            int var4 = 0;
            int var5 = 0;
            if (class288.field4381 != null) {
                var4 = class288.field4381.field2476;
                var5 = class288.field4381.field2478;
            }
            field5594[0] = class74.field1004.method505((byte) -117) - var4;
            field5594[1] = class74.field1004.method501(110) - var5;
        }
        method2315(var3, 200000);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lte;I)V")
    private static final void method2313(class327 arg0, int arg1) {
        Object[] var2 = arg0.field4908;
        int var3 = (Integer) var2[0];
        class201 var4 = class140.method883((byte) 111, var3);
        if (var4 == null) {
            return;
        }
        field5594 = new int[var4.field3022];
        int var5 = 0;
        field5595 = new String[var4.field3029];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field4905;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field4911;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field4909 == null ? -1 : arg0.field4909.field2525;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field4907;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field4909 == null ? -1 : arg0.field4909.field2511;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field4913 == null ? -1 : arg0.field4913.field2525;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field4913 == null ? -1 : arg0.field4913.field2511;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field4917;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field4914;
                }
                field5594[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field4915;
                }
                field5595[var6++] = var9;
            }
        }
        method2315(var4, arg1);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
    public static final void method2314(int arg0) {
        if (arg0 == -1 || !class345.method2100(-1, arg0)) {
            return;
        }
        class170[] var1 = class130.field1650[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3.field2534 != null) {
                class327 var4 = new class327();
                var4.field4909 = var3;
                var4.field4908 = var3.field2534;
                method2313(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lmb;I)V")
    private static final void method2315(class201 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field3033;
        int[] var6 = arg0.field3023;
        byte var7 = -1;
        field5592 = 0;
        try {
            int var8 = 0;
            label4494: while (true) {
                var8++;
                if (var8 > arg1) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var625 = var5[var4];
                if (var625 < 100) {
                    if (var625 == 0) {
                        field5604[var2++] = var6[var4];
                        continue;
                    }
                    if (var625 == 1) {
                        int var9 = var6[var4];
                        field5604[var2++] = class287.field4375[var9];
                        continue;
                    }
                    if (var625 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class277.method1713(field5604[var2], (byte) -86, var10);
                        continue;
                    }
                    if (var625 == 3) {
                        field5608[var3++] = arg0.field3024[var4];
                        continue;
                    }
                    if (var625 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var625 == 7) {
                        var2 -= 2;
                        if (field5604[var2 + 1] != field5604[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 8) {
                        var2 -= 2;
                        if (field5604[var2 + 1] == field5604[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 9) {
                        var2 -= 2;
                        if (field5604[var2] < field5604[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 10) {
                        var2 -= 2;
                        if (field5604[var2] > field5604[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 21) {
                        if (field5592 == 0) {
                            return;
                        }
                        class173 var11 = field5591[--field5592];
                        arg0 = var11.field2654;
                        var5 = arg0.field3033;
                        var6 = arg0.field3023;
                        var4 = var11.field2652;
                        field5594 = var11.field2655;
                        field5595 = var11.field2658;
                        continue;
                    }
                    if (var625 == 25) {
                        int var12 = var6[var4];
                        field5604[var2++] = class176.method1076(var12, -5587);
                        continue;
                    }
                    if (var625 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class398.method2503(field5604[var2], (byte) -120, var13);
                        continue;
                    }
                    if (var625 == 31) {
                        var2 -= 2;
                        if (field5604[var2] <= field5604[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 32) {
                        var2 -= 2;
                        if (field5604[var2] >= field5604[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 33) {
                        field5604[var2++] = field5594[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var625 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field5594[var10001] = field5604[var2];
                        continue;
                    }
                    if (var625 == 35) {
                        field5608[var3++] = field5595[var6[var4]];
                        continue;
                    }
                    if (var625 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field5595[var10001] = field5608[var3];
                        continue;
                    }
                    if (var625 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class210.method1231((byte) 45, var3, var14, field5608);
                        field5608[var3++] = var15;
                        continue;
                    }
                    if (var625 == 38) {
                        var2--;
                        continue;
                    }
                    if (var625 == 39) {
                        var3--;
                        continue;
                    }
                    if (var625 == 40) {
                        int var16 = var6[var4];
                        class201 var17 = class140.method883((byte) 114, var16);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field3022];
                        String[] var19 = new String[var17.field3029];
                        for (int var20 = 0; var20 < var17.field3018; var20++) {
                            var18[var20] = field5604[var2 + var20 - var17.field3018];
                        }
                        for (int var21 = 0; var21 < var17.field3020; var21++) {
                            var19[var21] = field5608[var3 + var21 - var17.field3020];
                        }
                        var2 -= var17.field3018;
                        var3 -= var17.field3020;
                        class173 var22 = new class173();
                        var22.field2654 = arg0;
                        var22.field2652 = var4;
                        var22.field2655 = field5594;
                        var22.field2658 = field5595;
                        if (field5592 >= field5591.length) {
                            throw new RuntimeException();
                        }
                        field5591[field5592++] = var22;
                        arg0 = var17;
                        var5 = var17.field3033;
                        var6 = var17.field3023;
                        var4 = -1;
                        field5594 = var18;
                        field5595 = var19;
                        continue;
                    }
                    if (var625 == 42) {
                        field5604[var2++] = class413.field6135[var6[var4]];
                        continue;
                    }
                    if (var625 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class413.field6135[var23] = field5604[var2];
                        class168.method1017(var23, 1);
                        class26.field346 |= class14.field174[var23];
                        continue;
                    }
                    if (var625 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field5604[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field5613[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4494;
                                }
                                field5597[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var625 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field5604[var2];
                        if (var30 >= 0 && var30 < field5613[var29]) {
                            field5604[var2++] = field5597[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var625 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field5604[var2];
                        if (var32 >= 0 && var32 < field5613[var31]) {
                            field5597[var31][var32] = field5604[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var625 == 47) {
                        String var33 = class403.field6013[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field5608[var3++] = var33;
                        continue;
                    }
                    if (var625 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class403.field6013[var34] = field5608[var3];
                        class414.method2585(true, var34);
                        continue;
                    }
                    if (var625 == 51) {
                        class382 var35 = arg0.field3026[var6[var4]];
                        var2--;
                        class350 var36 = (class350) var35.method2302((long) field5604[var2], 23576);
                        if (var36 != null) {
                            var4 += var36.field5202;
                        }
                        continue;
                    }
                }
                boolean var37;
                if (var6[var4] == 1) {
                    var37 = true;
                } else {
                    var37 = false;
                }
                if (var625 < 300) {
                    if (var625 == 100) {
                        var2 -= 3;
                        int var38 = field5604[var2];
                        int var39 = field5604[var2 + 1];
                        int var40 = field5604[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class170 var41 = class168.method1020(var38, (byte) 99);
                        if (var41.field2625 == null) {
                            var41.field2625 = new class170[var40 + 1];
                        }
                        if (var41.field2625.length <= var40) {
                            class170[] var42 = new class170[var40 + 1];
                            for (int var43 = 0; var43 < var41.field2625.length; var43++) {
                                var42[var43] = var41.field2625[var43];
                            }
                            var41.field2625 = var42;
                        }
                        if (var40 > 0 && var41.field2625[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class170 var44 = new class170();
                        var44.field2558 = var39;
                        var44.field2474 = var44.field2525 = var41.field2525;
                        var44.field2511 = var40;
                        var41.field2625[var40] = var44;
                        if (var37) {
                            field5605 = var44;
                        } else {
                            field5606 = var44;
                        }
                        class405.method2543(var41, 124);
                        continue;
                    }
                    if (var625 == 101) {
                        class170 var45 = var37 ? field5605 : field5606;
                        if (var45.field2511 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class170 var46 = class168.method1020(var45.field2525, (byte) 98);
                        var46.field2625[var45.field2511] = null;
                        class405.method2543(var46, 125);
                        continue;
                    }
                    if (var625 == 102) {
                        var2--;
                        class170 var47 = class168.method1020(field5604[var2], (byte) 102);
                        var47.field2625 = null;
                        class405.method2543(var47, 127);
                        continue;
                    }
                    if (var625 == 200) {
                        var2 -= 2;
                        int var48 = field5604[var2];
                        int var49 = field5604[var2 + 1];
                        class170 var50 = class455.method2827(var49, false, var48);
                        if (var50 != null && var49 != -1) {
                            field5604[var2++] = 1;
                            if (var37) {
                                field5605 = var50;
                            } else {
                                field5606 = var50;
                            }
                            continue;
                        }
                        field5604[var2++] = 0;
                        continue;
                    }
                    if (var625 == 201) {
                        var2--;
                        int var51 = field5604[var2];
                        class170 var52 = class168.method1020(var51, (byte) 116);
                        if (var52 == null) {
                            field5604[var2++] = 0;
                        } else {
                            field5604[var2++] = 1;
                            if (var37) {
                                field5605 = var52;
                            } else {
                                field5606 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var625 < 500) {
                    if (var625 == 403) {
                        var2 -= 2;
                        int var53 = field5604[var2];
                        int var54 = field5604[var2 + 1];
                        for (int var55 = 0; var55 < class106.field1421.length; var55++) {
                            if (class106.field1421[var55] == var53) {
                                class113.field1500.field2443.method762(var55, var54, (byte) 39);
                                continue label4494;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class103.field1392.length) {
                                continue label4494;
                            }
                            if (class103.field1392[var56] == var53) {
                                class113.field1500.field2443.method762(var56, var54, (byte) 39);
                                continue label4494;
                            }
                            var56++;
                        }
                    }
                    if (var625 == 404) {
                        var2 -= 2;
                        int var57 = field5604[var2];
                        int var58 = field5604[var2 + 1];
                        class113.field1500.field2443.method756(var57, var58, -126);
                        continue;
                    }
                    if (var625 == 410) {
                        var2--;
                        boolean var59 = field5604[var2] != 0;
                        class113.field1500.field2443.method757(var59, 25);
                        continue;
                    }
                } else if (var625 >= 1000 && var625 < 1100 || var625 >= 2000 && var625 < 2100) {
                    class170 var60;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var60 = class168.method1020(field5604[var2], (byte) 111);
                    } else {
                        var60 = var37 ? field5605 : field5606;
                    }
                    if (var625 == 1000) {
                        var2 -= 4;
                        var60.field2523 = field5604[var2];
                        var60.field2615 = field5604[var2 + 1];
                        int var61 = field5604[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field5604[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field2530 = (byte) var61;
                        var60.field2614 = (byte) var62;
                        class405.method2543(var60, 124);
                        class306.method1881(var60, (byte) -123);
                        if (var60.field2511 == -1) {
                            class228.method1380(122, var60.field2525);
                        }
                        continue;
                    }
                    if (var625 == 1001) {
                        var2 -= 4;
                        var60.field2491 = field5604[var2];
                        var60.field2548 = field5604[var2 + 1];
                        var60.field2599 = 0;
                        var60.field2500 = 0;
                        int var63 = field5604[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field5604[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field2475 = (byte) var63;
                        var60.field2551 = (byte) var64;
                        class405.method2543(var60, 127);
                        class306.method1881(var60, (byte) -128);
                        if (var60.field2558 == 0) {
                            class207.method1215(var60, false, 97);
                        }
                        continue;
                    }
                    if (var625 == 1003) {
                        var2--;
                        boolean var65 = field5604[var2] == 1;
                        if (var60.field2573 != var65) {
                            var60.field2573 = var65;
                            class405.method2543(var60, 125);
                        }
                        if (var60.field2511 == -1) {
                            class357.method2141(var60.field2525, true);
                        }
                        continue;
                    }
                    if (var625 == 1004) {
                        var2 -= 2;
                        var60.field2529 = field5604[var2];
                        var60.field2535 = field5604[var2 + 1];
                        class405.method2543(var60, 127);
                        class306.method1881(var60, (byte) -115);
                        if (var60.field2558 == 0) {
                            class207.method1215(var60, false, 74);
                        }
                        continue;
                    }
                    if (var625 == 1005) {
                        var2--;
                        var60.field2580 = field5604[var2] == 1;
                        continue;
                    }
                } else if (!(var625 < 1100 || var625 >= 1200) || !(var625 < 2100 || var625 >= 2200)) {
                    class170 var66;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var66 = class168.method1020(field5604[var2], (byte) 126);
                    } else {
                        var66 = var37 ? field5605 : field5606;
                    }
                    if (var625 == 1100) {
                        var2 -= 2;
                        var66.field2521 = field5604[var2];
                        if (var66.field2521 > var66.field2577 - var66.field2561) {
                            var66.field2521 = var66.field2577 - var66.field2561;
                        }
                        if (var66.field2521 < 0) {
                            var66.field2521 = 0;
                        }
                        var66.field2559 = field5604[var2 + 1];
                        if (var66.field2559 > var66.field2598 - var66.field2501) {
                            var66.field2559 = var66.field2598 - var66.field2501;
                        }
                        if (var66.field2559 < 0) {
                            var66.field2559 = 0;
                        }
                        class405.method2543(var66, 126);
                        if (var66.field2511 == -1) {
                            class91.method597(var66.field2525, 18551);
                        }
                        continue;
                    }
                    if (var625 == 1101) {
                        var2--;
                        var66.field2589 = field5604[var2];
                        class405.method2543(var66, 127);
                        if (var66.field2511 == -1) {
                            class426.method2621(true, var66.field2525);
                        }
                        continue;
                    }
                    if (var625 == 1102) {
                        var2--;
                        var66.field2565 = field5604[var2] == 1;
                        class405.method2543(var66, 124);
                        continue;
                    }
                    if (var625 == 1103) {
                        var2--;
                        var66.field2563 = field5604[var2];
                        class405.method2543(var66, 127);
                        continue;
                    }
                    if (var625 == 1104) {
                        var2--;
                        var66.field2581 = field5604[var2];
                        class405.method2543(var66, 124);
                        continue;
                    }
                    if (var625 == 1105) {
                        var2--;
                        int var67 = field5604[var2];
                        if (var66.field2574 != var67) {
                            var66.field2574 = var67;
                            class405.method2543(var66, 125);
                        }
                        if (var66.field2511 == -1) {
                            class423.method2611(110, var66.field2525);
                        }
                        continue;
                    }
                    if (var625 == 1106) {
                        var2--;
                        var66.field2531 = field5604[var2];
                        class405.method2543(var66, 127);
                        continue;
                    }
                    if (var625 == 1107) {
                        var2--;
                        var66.field2564 = field5604[var2] == 1;
                        class405.method2543(var66, 126);
                        continue;
                    }
                    if (var625 == 1108) {
                        var66.field2606 = 1;
                        var2--;
                        var66.field2616 = field5604[var2];
                        class405.method2543(var66, 125);
                        if (var66.field2511 == -1) {
                            class406.method2551(0, var66.field2525);
                        }
                        continue;
                    }
                    if (var625 == 1109) {
                        var2 -= 6;
                        var66.field2510 = field5604[var2];
                        var66.field2623 = field5604[var2 + 1];
                        var66.field2620 = field5604[var2 + 2];
                        var66.field2587 = field5604[var2 + 3];
                        var66.field2484 = field5604[var2 + 4];
                        var66.field2538 = field5604[var2 + 5];
                        class405.method2543(var66, 127);
                        if (var66.field2511 == -1) {
                            class135.method842((byte) -110, var66.field2525);
                            class410.method2573(-98, var66.field2525);
                        }
                        continue;
                    }
                    if (var625 == 1110) {
                        var2--;
                        int var68 = field5604[var2];
                        if (var66.field2576 != var68) {
                            var66.field2576 = var68;
                            var66.field2609 = 0;
                            var66.field2619 = 1;
                            var66.field2489 = 0;
                            class405.method2543(var66, 124);
                        }
                        if (var66.field2511 == -1) {
                            class131.method775(var66.field2525, (byte) 1);
                        }
                        continue;
                    }
                    if (var625 == 1111) {
                        var2--;
                        var66.field2526 = field5604[var2] == 1;
                        class405.method2543(var66, 125);
                        continue;
                    }
                    if (var625 == 1112) {
                        var3--;
                        String var69 = field5608[var3];
                        if (!var69.equals(var66.field2568)) {
                            var66.field2568 = var69;
                            class405.method2543(var66, 125);
                        }
                        if (var66.field2511 == -1) {
                            class233.method1406(var66.field2525, 0);
                        }
                        continue;
                    }
                    if (var625 == 1113) {
                        var2--;
                        var66.field2617 = field5604[var2];
                        class405.method2543(var66, 127);
                        if (var66.field2511 == -1) {
                            class353.method2117(-50, var66.field2525);
                        }
                        continue;
                    }
                    if (var625 == 1114) {
                        var2 -= 3;
                        var66.field2483 = field5604[var2];
                        var66.field2544 = field5604[var2 + 1];
                        var66.field2555 = field5604[var2 + 2];
                        class405.method2543(var66, 126);
                        continue;
                    }
                    if (var625 == 1115) {
                        var2--;
                        var66.field2584 = field5604[var2] == 1;
                        class405.method2543(var66, 126);
                        continue;
                    }
                    if (var625 == 1116) {
                        var2--;
                        var66.field2593 = field5604[var2];
                        class405.method2543(var66, 125);
                        continue;
                    }
                    if (var625 == 1117) {
                        var2--;
                        var66.field2539 = field5604[var2];
                        class405.method2543(var66, 124);
                        continue;
                    }
                    if (var625 == 1118) {
                        var2--;
                        var66.field2600 = field5604[var2] == 1;
                        class405.method2543(var66, 127);
                        continue;
                    }
                    if (var625 == 1119) {
                        var2--;
                        var66.field2527 = field5604[var2] == 1;
                        class405.method2543(var66, 124);
                        continue;
                    }
                    if (var625 == 1120) {
                        var2 -= 2;
                        var66.field2577 = field5604[var2];
                        var66.field2598 = field5604[var2 + 1];
                        class405.method2543(var66, 125);
                        if (var66.field2558 == 0) {
                            class207.method1215(var66, false, 37);
                        }
                        continue;
                    }
                    if (var625 == 1121) {
                        var2 -= 2;
                        var66.field2554 = (short) field5604[var2];
                        var66.field2608 = (short) field5604[var2 + 1];
                        class405.method2543(var66, 125);
                        continue;
                    }
                    if (var625 == 1122) {
                        var2--;
                        var66.field2488 = field5604[var2] == 1;
                        class405.method2543(var66, 125);
                        continue;
                    }
                    if (var625 == 1123) {
                        var2--;
                        var66.field2538 = field5604[var2];
                        class405.method2543(var66, 126);
                        if (var66.field2511 == -1) {
                            class135.method842((byte) -88, var66.field2525);
                        }
                        continue;
                    }
                    if (var625 == 1124) {
                        var2--;
                        int var70 = field5604[var2];
                        var66.field2572 = var70 == 1;
                        class405.method2543(var66, 127);
                        continue;
                    }
                    if (var625 == 1125) {
                        var2 -= 2;
                        var66.field2468 = field5604[var2];
                        var66.field2522 = field5604[var2 + 1];
                        class405.method2543(var66, 125);
                        continue;
                    }
                } else if (!(var625 < 1200 || var625 >= 1300) || !(var625 < 2200 || var625 >= 2300)) {
                    class170 var71;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var71 = class168.method1020(field5604[var2], (byte) 76);
                    } else {
                        var71 = var37 ? field5605 : field5606;
                    }
                    class405.method2543(var71, 125);
                    if (var625 == 1200 || var625 == 1205 || var625 == 1208 || var625 == 1209 || var625 == 1212 || var625 == 1213) {
                        var2 -= 2;
                        int var72 = field5604[var2];
                        int var73 = field5604[var2 + 1];
                        if (var71.field2511 == -1) {
                            class452.method2804(var71.field2525, (byte) -85);
                            class135.method842((byte) -41, var71.field2525);
                            class410.method2573(-90, var71.field2525);
                        }
                        if (var72 == -1) {
                            var71.field2606 = 1;
                            var71.field2616 = -1;
                            var71.field2592 = -1;
                            continue;
                        }
                        var71.field2592 = var72;
                        var71.field2545 = var73;
                        if (var625 == 1208 || var625 == 1209) {
                            var71.field2532 = true;
                        } else {
                            var71.field2532 = false;
                        }
                        class167 var74 = class186.field2796.method1106(50, var72);
                        var71.field2620 = var74.field2347;
                        var71.field2587 = var74.field2373;
                        var71.field2484 = var74.field2330;
                        var71.field2510 = var74.field2340;
                        var71.field2623 = var74.field2398;
                        var71.field2538 = var74.field2335;
                        if (var625 == 1205 || var625 == 1209) {
                            var71.field2543 = 0;
                        } else if (var625 == 1212 || var625 == 1213) {
                            var71.field2543 = 1;
                        } else {
                            var71.field2543 = 2;
                        }
                        if (var71.field2599 > 0) {
                            var71.field2538 = var71.field2538 * 32 / var71.field2599;
                        } else if (var71.field2491 > 0) {
                            var71.field2538 = var71.field2538 * 32 / var71.field2491;
                        }
                        continue;
                    }
                    if (var625 == 1201) {
                        var71.field2606 = 2;
                        var2--;
                        var71.field2616 = field5604[var2];
                        if (var71.field2511 == -1) {
                            class406.method2551(0, var71.field2525);
                        }
                        continue;
                    }
                    if (var625 == 1202) {
                        var71.field2606 = 3;
                        var71.field2616 = -1;
                        if (var71.field2511 == -1) {
                            class406.method2551(0, var71.field2525);
                        }
                        continue;
                    }
                    if (var625 == 1203) {
                        var71.field2606 = 6;
                        var2--;
                        var71.field2616 = field5604[var2];
                        if (var71.field2511 == -1) {
                            class406.method2551(0, var71.field2525);
                        }
                        continue;
                    }
                    if (var625 == 1204) {
                        var71.field2606 = 5;
                        var2--;
                        var71.field2616 = field5604[var2];
                        if (var71.field2511 == -1) {
                            class406.method2551(0, var71.field2525);
                        }
                        continue;
                    }
                    if (var625 == 1206) {
                        var2 -= 4;
                        var71.field2597 = field5604[var2];
                        var71.field2560 = field5604[var2 + 1];
                        var71.field2517 = field5604[var2 + 2];
                        var71.field2571 = field5604[var2 + 3];
                        class405.method2543(var71, 127);
                        continue;
                    }
                    if (var625 == 1207) {
                        var2 -= 2;
                        var71.field2594 = field5604[var2];
                        var71.field2610 = field5604[var2 + 1];
                        class405.method2543(var71, 125);
                        continue;
                    }
                    if (var625 == 1210) {
                        var2 -= 4;
                        var71.field2616 = field5604[var2];
                        var71.field2604 = field5604[var2 + 1];
                        if (field5604[var2 + 2] == 1) {
                            var71.field2606 = 9;
                        } else {
                            var71.field2606 = 8;
                        }
                        if (field5604[var2 + 3] == 1) {
                            var71.field2532 = true;
                        } else {
                            var71.field2532 = false;
                        }
                        if (var71.field2511 == -1) {
                            class406.method2551(0, var71.field2525);
                        }
                        continue;
                    }
                    if (var625 == 1211) {
                        var71.field2606 = 5;
                        var71.field2616 = class386.field5703;
                        var71.field2604 = 0;
                        if (var71.field2511 == -1) {
                            class406.method2551(0, var71.field2525);
                        }
                        continue;
                    }
                } else if (var625 >= 1300 && var625 < 1400 || var625 >= 2300 && var625 < 2400) {
                    class170 var75;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var75 = class168.method1020(field5604[var2], (byte) 102);
                    } else {
                        var75 = var37 ? field5605 : field5606;
                    }
                    if (var625 == 1300) {
                        var2--;
                        int var76 = field5604[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method1049(-1688971096, field5608[var3], var76);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var625 == 1301) {
                        var2 -= 2;
                        int var77 = field5604[var2];
                        int var78 = field5604[var2 + 1];
                        var75.field2601 = class455.method2827(var78, false, var77);
                        continue;
                    }
                    if (var625 == 1302) {
                        var2--;
                        int var79 = field5604[var2];
                        if (class388.field5732 == var79 || class429.field6303 == var79 || class188.field2820 == var79) {
                            var75.field2508 = var79;
                        }
                        continue;
                    }
                    if (var625 == 1303) {
                        var2--;
                        var75.field2516 = field5604[var2];
                        continue;
                    }
                    if (var625 == 1304) {
                        var2--;
                        var75.field2578 = field5604[var2];
                        continue;
                    }
                    if (var625 == 1305) {
                        var3--;
                        var75.field2533 = field5608[var3];
                        continue;
                    }
                    if (var625 == 1306) {
                        var3--;
                        var75.field2519 = field5608[var3];
                        continue;
                    }
                    if (var625 == 1307) {
                        var75.field2575 = null;
                        continue;
                    }
                    if (var625 == 1308) {
                        var2--;
                        var75.field2477 = field5604[var2];
                        var2--;
                        var75.field2499 = field5604[var2];
                        continue;
                    }
                    if (var625 == 1309) {
                        var2--;
                        int var80 = field5604[var2];
                        var2--;
                        int var81 = field5604[var2];
                        if (var81 >= 1 && var81 <= 10) {
                            var75.method1040(var81 - 1, 1, var80);
                        }
                        continue;
                    }
                    if (var625 == 1310) {
                        var3--;
                        var75.field2557 = field5608[var3];
                        continue;
                    }
                    if (var625 == 1311) {
                        var2--;
                        var75.field2621 = field5604[var2];
                        continue;
                    }
                } else {
                    if (var625 >= 1400 && var625 < 1500 || var625 >= 2400 && var625 < 2500) {
                        class170 var82;
                        if (var625 >= 2000) {
                            var625 -= 1000;
                            var2--;
                            var82 = class168.method1020(field5604[var2], (byte) 113);
                        } else {
                            var82 = var37 ? field5605 : field5606;
                        }
                        var3--;
                        String var83 = field5608[var3];
                        int[] var84 = null;
                        if (var83.length() > 0 && var83.charAt(var83.length() - 1) == 'Y') {
                            var2--;
                            int var85 = field5604[var2];
                            if (var85 > 0) {
                                var84 = new int[var85];
                                while (var85-- > 0) {
                                    var2--;
                                    var84[var85] = field5604[var2];
                                }
                            }
                            var83 = var83.substring(0, var83.length() - 1);
                        }
                        Object[] var86 = new Object[var83.length() + 1];
                        for (int var87 = var86.length - 1; var87 >= 1; var87--) {
                            if (var83.charAt(var87 - 1) == 's') {
                                var3--;
                                var86[var87] = field5608[var3];
                            } else {
                                var2--;
                                var86[var87] = Integer.valueOf(field5604[var2]);
                            }
                        }
                        var2--;
                        int var88 = field5604[var2];
                        if (var88 == -1) {
                            var86 = null;
                        } else {
                            var86[0] = Integer.valueOf(var88);
                        }
                        if (var625 == 1400) {
                            var82.field2550 = var86;
                        } else if (var625 == 1401) {
                            var82.field2540 = var86;
                        } else if (var625 == 1402) {
                            var82.field2504 = var86;
                        } else if (var625 == 1403) {
                            var82.field2513 = var86;
                        } else if (var625 == 1404) {
                            var82.field2520 = var86;
                        } else if (var625 == 1405) {
                            var82.field2583 = var86;
                        } else if (var625 == 1406) {
                            var82.field2579 = var86;
                        } else if (var625 == 1407) {
                            var82.field2546 = var86;
                            var82.field2509 = var84;
                        } else if (var625 == 1408) {
                            var82.field2591 = var86;
                        } else if (var625 == 1409) {
                            var82.field2547 = var86;
                        } else if (var625 == 1410) {
                            var82.field2515 = var86;
                        } else if (var625 == 1411) {
                            var82.field2497 = var86;
                        } else if (var625 == 1412) {
                            var82.field2595 = var86;
                        } else if (var625 == 1414) {
                            var82.field2611 = var86;
                            var82.field2624 = var84;
                        } else if (var625 == 1415) {
                            var82.field2492 = var86;
                            var82.field2605 = var84;
                        } else if (var625 == 1416) {
                            var82.field2542 = var86;
                        } else if (var625 == 1417) {
                            var82.field2493 = var86;
                        } else if (var625 == 1418) {
                            var82.field2487 = var86;
                        } else if (var625 == 1419) {
                            var82.field2602 = var86;
                        } else if (var625 == 1420) {
                            var82.field2612 = var86;
                        } else if (var625 == 1421) {
                            var82.field2588 = var86;
                        } else if (var625 == 1422) {
                            var82.field2603 = var86;
                        } else if (var625 == 1423) {
                            var82.field2503 = var86;
                        } else if (var625 == 1424) {
                            var82.field2481 = var86;
                        } else if (var625 == 1425) {
                            var82.field2479 = var86;
                        } else if (var625 == 1426) {
                            var82.field2556 = var86;
                        } else if (var625 == 1427) {
                            var82.field2512 = var86;
                        } else if (var625 == 1428) {
                            var82.field2596 = var86;
                            var82.field2498 = var84;
                        } else if (var625 == 1429) {
                            var82.field2502 = var86;
                            var82.field2569 = var84;
                        }
                        var82.field2469 = true;
                        continue;
                    }
                    if (var625 < 1600) {
                        class170 var89 = var37 ? field5605 : field5606;
                        if (var625 == 1500) {
                            field5604[var2++] = var89.field2476;
                            continue;
                        }
                        if (var625 == 1501) {
                            field5604[var2++] = var89.field2478;
                            continue;
                        }
                        if (var625 == 1502) {
                            field5604[var2++] = var89.field2561;
                            continue;
                        }
                        if (var625 == 1503) {
                            field5604[var2++] = var89.field2501;
                            continue;
                        }
                        if (var625 == 1504) {
                            field5604[var2++] = var89.field2573 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 1505) {
                            field5604[var2++] = var89.field2474;
                            continue;
                        }
                    } else if (var625 < 1700) {
                        class170 var90 = var37 ? field5605 : field5606;
                        if (var625 == 1600) {
                            field5604[var2++] = var90.field2521;
                            continue;
                        }
                        if (var625 == 1601) {
                            field5604[var2++] = var90.field2559;
                            continue;
                        }
                        if (var625 == 1602) {
                            field5608[var3++] = var90.field2568;
                            continue;
                        }
                        if (var625 == 1603) {
                            field5604[var2++] = var90.field2577;
                            continue;
                        }
                        if (var625 == 1604) {
                            field5604[var2++] = var90.field2598;
                            continue;
                        }
                        if (var625 == 1605) {
                            field5604[var2++] = var90.field2538;
                            continue;
                        }
                        if (var625 == 1606) {
                            field5604[var2++] = var90.field2620;
                            continue;
                        }
                        if (var625 == 1607) {
                            field5604[var2++] = var90.field2484;
                            continue;
                        }
                        if (var625 == 1608) {
                            field5604[var2++] = var90.field2587;
                            continue;
                        }
                        if (var625 == 1609) {
                            field5604[var2++] = var90.field2563;
                            continue;
                        }
                        if (var625 == 1610) {
                            field5604[var2++] = var90.field2510;
                            continue;
                        }
                        if (var625 == 1611) {
                            field5604[var2++] = var90.field2623;
                            continue;
                        }
                        if (var625 == 1612) {
                            field5604[var2++] = var90.field2574;
                            continue;
                        }
                    } else if (var625 < 1800) {
                        class170 var91 = var37 ? field5605 : field5606;
                        if (var625 == 1700) {
                            field5604[var2++] = var91.field2592;
                            continue;
                        }
                        if (var625 == 1701) {
                            if (var91.field2592 == -1) {
                                field5604[var2++] = 0;
                            } else {
                                field5604[var2++] = var91.field2545;
                            }
                            continue;
                        }
                        if (var625 == 1702) {
                            field5604[var2++] = var91.field2511;
                            continue;
                        }
                    } else if (var625 < 1900) {
                        class170 var92 = var37 ? field5605 : field5606;
                        if (var625 == 1800) {
                            field5604[var2++] = client.method2796(var92).method1903(5);
                            continue;
                        }
                        if (var625 == 1801) {
                            var2--;
                            int var93 = field5604[var2];
                            int var626 = var93 - 1;
                            if (var92.field2575 != null && var626 < var92.field2575.length && var92.field2575[var626] != null) {
                                field5608[var3++] = var92.field2575[var626];
                                continue;
                            }
                            field5608[var3++] = "";
                            continue;
                        }
                        if (var625 == 1802) {
                            if (var92.field2533 == null) {
                                field5608[var3++] = "";
                            } else {
                                field5608[var3++] = var92.field2533;
                            }
                            continue;
                        }
                    } else if (var625 < 2600) {
                        var2--;
                        class170 var94 = class168.method1020(field5604[var2], (byte) 94);
                        if (var625 == 2500) {
                            field5604[var2++] = var94.field2476;
                            continue;
                        }
                        if (var625 == 2501) {
                            field5604[var2++] = var94.field2478;
                            continue;
                        }
                        if (var625 == 2502) {
                            field5604[var2++] = var94.field2561;
                            continue;
                        }
                        if (var625 == 2503) {
                            field5604[var2++] = var94.field2501;
                            continue;
                        }
                        if (var625 == 2504) {
                            field5604[var2++] = var94.field2573 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 2505) {
                            field5604[var2++] = var94.field2474;
                            continue;
                        }
                    } else if (var625 < 2700) {
                        var2--;
                        class170 var95 = class168.method1020(field5604[var2], (byte) 79);
                        if (var625 == 2600) {
                            field5604[var2++] = var95.field2521;
                            continue;
                        }
                        if (var625 == 2601) {
                            field5604[var2++] = var95.field2559;
                            continue;
                        }
                        if (var625 == 2602) {
                            field5608[var3++] = var95.field2568;
                            continue;
                        }
                        if (var625 == 2603) {
                            field5604[var2++] = var95.field2577;
                            continue;
                        }
                        if (var625 == 2604) {
                            field5604[var2++] = var95.field2598;
                            continue;
                        }
                        if (var625 == 2605) {
                            field5604[var2++] = var95.field2538;
                            continue;
                        }
                        if (var625 == 2606) {
                            field5604[var2++] = var95.field2620;
                            continue;
                        }
                        if (var625 == 2607) {
                            field5604[var2++] = var95.field2484;
                            continue;
                        }
                        if (var625 == 2608) {
                            field5604[var2++] = var95.field2587;
                            continue;
                        }
                        if (var625 == 2609) {
                            field5604[var2++] = var95.field2563;
                            continue;
                        }
                        if (var625 == 2610) {
                            field5604[var2++] = var95.field2510;
                            continue;
                        }
                        if (var625 == 2611) {
                            field5604[var2++] = var95.field2623;
                            continue;
                        }
                        if (var625 == 2612) {
                            field5604[var2++] = var95.field2574;
                            continue;
                        }
                    } else if (var625 < 2800) {
                        if (var625 == 2700) {
                            var2--;
                            class170 var96 = class168.method1020(field5604[var2], (byte) 104);
                            field5604[var2++] = var96.field2592;
                            continue;
                        }
                        if (var625 == 2701) {
                            var2--;
                            class170 var97 = class168.method1020(field5604[var2], (byte) 110);
                            if (var97.field2592 == -1) {
                                field5604[var2++] = 0;
                            } else {
                                field5604[var2++] = var97.field2545;
                            }
                            continue;
                        }
                        if (var625 == 2702) {
                            var2--;
                            int var98 = field5604[var2];
                            class333 var99 = (class333) class308.field4647.method2302((long) var98, 23576);
                            if (var99 == null) {
                                field5604[var2++] = 0;
                            } else {
                                field5604[var2++] = 1;
                            }
                            continue;
                        }
                        if (var625 == 2703) {
                            var2--;
                            class170 var100 = class168.method1020(field5604[var2], (byte) 119);
                            if (var100.field2625 == null) {
                                field5604[var2++] = 0;
                                continue;
                            }
                            int var101 = var100.field2625.length;
                            for (int var102 = 0; var102 < var100.field2625.length; var102++) {
                                if (var100.field2625[var102] == null) {
                                    var101 = var102;
                                    break;
                                }
                            }
                            field5604[var2++] = var101;
                            continue;
                        }
                        if (var625 == 2704 || var625 == 2705) {
                            var2 -= 2;
                            int var103 = field5604[var2];
                            int var104 = field5604[var2 + 1];
                            class333 var105 = (class333) class308.field4647.method2302((long) var103, 23576);
                            if (var105 != null && var105.field4965 == var104) {
                                field5604[var2++] = 1;
                                continue;
                            }
                            field5604[var2++] = 0;
                            continue;
                        }
                    } else if (var625 < 2900) {
                        var2--;
                        class170 var106 = class168.method1020(field5604[var2], (byte) 124);
                        if (var625 == 2800) {
                            field5604[var2++] = client.method2796(var106).method1903(5);
                            continue;
                        }
                        if (var625 == 2801) {
                            var2--;
                            int var107 = field5604[var2];
                            int var627 = var107 - 1;
                            if (var106.field2575 != null && var627 < var106.field2575.length && var106.field2575[var627] != null) {
                                field5608[var3++] = var106.field2575[var627];
                                continue;
                            }
                            field5608[var3++] = "";
                            continue;
                        }
                        if (var625 == 2802) {
                            if (var106.field2533 == null) {
                                field5608[var3++] = "";
                            } else {
                                field5608[var3++] = var106.field2533;
                            }
                            continue;
                        }
                    } else if (var625 < 3200) {
                        if (var625 == 3100) {
                            var3--;
                            String var108 = field5608[var3];
                            class149.method932(var108, 2688);
                            continue;
                        }
                        if (var625 == 3101) {
                            var2 -= 2;
                            class304.method1867(95, field5604[var2 + 1], field5604[var2], class113.field1500);
                            continue;
                        }
                        if (var625 == 3103) {
                            class91.method593(true, 127);
                            continue;
                        }
                        if (var625 == 3104) {
                            var3--;
                            String var109 = field5608[var3];
                            int var110 = 0;
                            if (class272.method1695(-25, var109)) {
                                var110 = class25.method154(var109, (byte) -50);
                            }
                            field5600++;
                            class177.method1082(class31.field392, 0);
                            class189.field2840.method2381(var110, 0);
                            continue;
                        }
                        if (var625 == 3105) {
                            var3--;
                            String var111 = field5608[var3];
                            field5599++;
                            class177.method1082(class97.field1342, 0);
                            class189.field2840.method2366(var111.length() + 1, true);
                            class189.field2840.method2375(127, var111);
                            continue;
                        }
                        if (var625 == 3106) {
                            var3--;
                            String var112 = field5608[var3];
                            field5611++;
                            class177.method1082(class151.field2085, 0);
                            class189.field2840.method2366(var112.length() + 1, true);
                            class189.field2840.method2375(125, var112);
                            continue;
                        }
                        if (var625 == 3107) {
                            var2--;
                            int var113 = field5604[var2];
                            var3--;
                            String var114 = field5608[var3];
                            class21.method137(var114, var113, true);
                            continue;
                        }
                        if (var625 == 3108) {
                            var2 -= 3;
                            int var115 = field5604[var2];
                            int var116 = field5604[var2 + 1];
                            int var117 = field5604[var2 + 2];
                            class170 var118 = class168.method1020(var117, (byte) 79);
                            class111.method681(0, var115, var116, var118);
                            continue;
                        }
                        if (var625 == 3109) {
                            var2 -= 2;
                            int var119 = field5604[var2];
                            int var120 = field5604[var2 + 1];
                            class170 var121 = var37 ? field5605 : field5606;
                            class111.method681(0, var119, var120, var121);
                            continue;
                        }
                        if (var625 == 3110) {
                            var2--;
                            int var122 = field5604[var2];
                            field5596++;
                            class177.method1082(class465.field6851, 0);
                            class189.field2840.method2377(var122, -84);
                            continue;
                        }
                        if (var625 == 3111) {
                            var2 -= 2;
                            int var123 = field5604[var2];
                            int var124 = field5604[var2 + 1];
                            class333 var125 = (class333) class308.field4647.method2302((long) var123, 23576);
                            if (var125 != null) {
                                class367.method2204(var125.field4965 != var124, (byte) -19, true, var125);
                            }
                            class160.method969(var123, var124, true, (byte) -92, 3);
                            continue;
                        }
                        if (var625 == 3112) {
                            var2--;
                            int var126 = field5604[var2];
                            class333 var127 = (class333) class308.field4647.method2302((long) var126, 23576);
                            if (var127 != null && var127.field4962 == 3) {
                                class367.method2204(true, (byte) -110, true, var127);
                            }
                            continue;
                        }
                    } else if (var625 < 3300) {
                        if (var625 == 3200) {
                            var2 -= 3;
                            class189.method1151(255, field5604[var2], field5604[var2 + 2], field5604[var2 + 1], (byte) -127);
                            continue;
                        }
                        if (var625 == 3201) {
                            var2--;
                            class108.method667(255, field5604[var2], -105);
                            continue;
                        }
                        if (var625 == 3202) {
                            var2 -= 2;
                            class418.method2603(field5604[var2], 0, 255, field5604[var2 + 1]);
                            continue;
                        }
                    } else if (var625 < 3400) {
                        if (var625 == 3300) {
                            field5604[var2++] = class26.field332;
                            continue;
                        }
                        if (var625 == 3301) {
                            var2 -= 2;
                            int var128 = field5604[var2];
                            int var129 = field5604[var2 + 1];
                            field5604[var2++] = class85.method544((byte) -108, var129, var128, false);
                            continue;
                        }
                        if (var625 == 3302) {
                            var2 -= 2;
                            int var130 = field5604[var2];
                            int var131 = field5604[var2 + 1];
                            field5604[var2++] = class233.method1405(false, 0, var131, var130);
                            continue;
                        }
                        if (var625 == 3303) {
                            var2 -= 2;
                            int var132 = field5604[var2];
                            int var133 = field5604[var2 + 1];
                            field5604[var2++] = class238.method1433(false, var132, 0, var133);
                            continue;
                        }
                        if (var625 == 3304) {
                            var2--;
                            int var134 = field5604[var2];
                            field5604[var2++] = class355.method2129(-4966, var134).field4945;
                            continue;
                        }
                        if (var625 == 3305) {
                            var2--;
                            int var135 = field5604[var2];
                            field5604[var2++] = class245.field3681[var135];
                            continue;
                        }
                        if (var625 == 3306) {
                            var2--;
                            int var136 = field5604[var2];
                            field5604[var2++] = class455.field6761[var136];
                            continue;
                        }
                        if (var625 == 3307) {
                            var2--;
                            int var137 = field5604[var2];
                            field5604[var2++] = class327.field4906[var137];
                            continue;
                        }
                        if (var625 == 3308) {
                            byte var138 = class113.field1500.field1902;
                            int var139 = (class113.field1500.field1900 >> 7) + class17.field250;
                            int var140 = (class113.field1500.field1892 >> 7) + class112.field1487;
                            field5604[var2++] = (var138 << 28) + (var139 << 14) + var140;
                            continue;
                        }
                        if (var625 == 3309) {
                            var2--;
                            int var141 = field5604[var2];
                            field5604[var2++] = var141 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var625 == 3310) {
                            var2--;
                            int var142 = field5604[var2];
                            field5604[var2++] = var142 >> 28;
                            continue;
                        }
                        if (var625 == 3311) {
                            var2--;
                            int var143 = field5604[var2];
                            field5604[var2++] = var143 & 0x3FFF;
                            continue;
                        }
                        if (var625 == 3312) {
                            field5604[var2++] = class66.field859 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3313) {
                            var2 -= 2;
                            int var144 = field5604[var2];
                            int var145 = field5604[var2 + 1];
                            field5604[var2++] = class85.method544((byte) -108, var145, var144, true);
                            continue;
                        }
                        if (var625 == 3314) {
                            var2 -= 2;
                            int var146 = field5604[var2];
                            int var147 = field5604[var2 + 1];
                            field5604[var2++] = class233.method1405(true, 0, var147, var146);
                            continue;
                        }
                        if (var625 == 3315) {
                            var2 -= 2;
                            int var148 = field5604[var2];
                            int var149 = field5604[var2 + 1];
                            field5604[var2++] = class238.method1433(true, var148, 0, var149);
                            continue;
                        }
                        if (var625 == 3316) {
                            if (class143.field1912 >= 2) {
                                field5604[var2++] = class143.field1912;
                            } else {
                                field5604[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 3317) {
                            field5604[var2++] = class85.field1127;
                            continue;
                        }
                        if (var625 == 3318) {
                            field5604[var2++] = class414.field6149;
                            continue;
                        }
                        if (var625 == 3321) {
                            field5604[var2++] = class185.field2787;
                            continue;
                        }
                        if (var625 == 3322) {
                            field5604[var2++] = class289.field4393;
                            continue;
                        }
                        if (var625 == 3323) {
                            if (class437.field6429 >= 5 && class437.field6429 <= 9) {
                                field5604[var2++] = 1;
                                continue;
                            }
                            field5604[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3324) {
                            if (class437.field6429 >= 5 && class437.field6429 <= 9) {
                                field5604[var2++] = class437.field6429;
                                continue;
                            }
                            field5604[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3325) {
                            field5604[var2++] = class426.field6266 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3326) {
                            field5604[var2++] = class113.field1500.field2425;
                            continue;
                        }
                        if (var625 == 3327) {
                            field5604[var2++] = class113.field1500.field2443.field1645 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3328) {
                            field5604[var2++] = class430.field6326 && !class238.field3570 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3329) {
                            field5604[var2++] = class286.field4361 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3330) {
                            var2--;
                            int var150 = field5604[var2];
                            field5604[var2++] = class296.method1837(false, var150, -125);
                            continue;
                        }
                        if (var625 == 3331) {
                            var2 -= 2;
                            int var151 = field5604[var2];
                            int var152 = field5604[var2 + 1];
                            field5604[var2++] = class439.method2691(false, var152, false, var151, (byte) 106);
                            continue;
                        }
                        if (var625 == 3332) {
                            var2 -= 2;
                            int var153 = field5604[var2];
                            int var154 = field5604[var2 + 1];
                            field5604[var2++] = class439.method2691(true, var154, false, var153, (byte) 78);
                            continue;
                        }
                        if (var625 == 3333) {
                            field5604[var2++] = class427.field6297;
                            continue;
                        }
                        if (var625 == 3335) {
                            field5604[var2++] = class27.field356;
                            continue;
                        }
                        if (var625 == 3336) {
                            var2 -= 4;
                            int var155 = field5604[var2];
                            int var156 = field5604[var2 + 1];
                            int var157 = field5604[var2 + 2];
                            int var158 = field5604[var2 + 3];
                            int var159 = (var156 << 14) + var155;
                            int var160 = (var157 << 28) + var159;
                            int var161 = var158 + var160;
                            field5604[var2++] = var161;
                            continue;
                        }
                        if (var625 == 3337) {
                            field5604[var2++] = class240.field3600;
                            continue;
                        }
                        if (var625 == 3338) {
                            field5604[var2++] = class382.method2299(false);
                            continue;
                        }
                    } else if (var625 < 3500) {
                        if (var625 == 3400) {
                            var2 -= 2;
                            int var162 = field5604[var2];
                            int var163 = field5604[var2 + 1];
                            class132 var164 = class286.method1770(false, var162);
                            field5608[var3++] = var164.method779(var163, (byte) 92);
                            continue;
                        }
                        if (var625 == 3408) {
                            var2 -= 4;
                            int var165 = field5604[var2];
                            int var166 = field5604[var2 + 1];
                            int var167 = field5604[var2 + 2];
                            int var168 = field5604[var2 + 3];
                            class132 var169 = class286.method1770(false, var167);
                            if (var169.field1677 == var165 && var169.field1687 == var166) {
                                if (var166 == 115) {
                                    field5608[var3++] = var169.method779(var168, (byte) 125);
                                } else {
                                    field5604[var2++] = var169.method780(4, var168);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var625 == 3409) {
                            var2 -= 3;
                            int var170 = field5604[var2];
                            int var171 = field5604[var2 + 1];
                            int var172 = field5604[var2 + 2];
                            if (var171 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class132 var173 = class286.method1770(false, var171);
                            if (var173.field1687 != var170) {
                                throw new RuntimeException("C3409-1");
                            }
                            field5604[var2++] = var173.method787(var172, (byte) 119) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3410) {
                            var2--;
                            int var174 = field5604[var2];
                            var3--;
                            String var175 = field5608[var3];
                            if (var174 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class132 var176 = class286.method1770(false, var174);
                            if (var176.field1687 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field5604[var2++] = var176.method778(-124, var175) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3411) {
                            var2--;
                            int var177 = field5604[var2];
                            class132 var178 = class286.method1770(false, var177);
                            field5604[var2++] = var178.field1683.method2305(-127);
                            continue;
                        }
                    } else if (var625 < 3700) {
                        if (var625 == 3600) {
                            if (class155.field2161 == 0) {
                                field5604[var2++] = -2;
                            } else if (class155.field2161 == 1) {
                                field5604[var2++] = -1;
                            } else {
                                field5604[var2++] = class145.field1985;
                            }
                            continue;
                        }
                        if (var625 == 3601) {
                            var2--;
                            int var179 = field5604[var2];
                            if (class155.field2161 == 2 && var179 < class145.field1985) {
                                field5608[var3++] = class137.field1853[var179];
                                if (class112.field1486[var179] == null) {
                                    field5608[var3++] = "";
                                } else {
                                    field5608[var3++] = class112.field1486[var179];
                                }
                                continue;
                            }
                            field5608[var3++] = "";
                            field5608[var3++] = "";
                            continue;
                        }
                        if (var625 == 3602) {
                            var2--;
                            int var180 = field5604[var2];
                            if (class155.field2161 == 2 && var180 < class145.field1985) {
                                field5604[var2++] = class151.field2089[var180];
                                continue;
                            }
                            field5604[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3603) {
                            var2--;
                            int var181 = field5604[var2];
                            if (class155.field2161 == 2 && var181 < class145.field1985) {
                                field5604[var2++] = class418.field6199[var181];
                                continue;
                            }
                            field5604[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3604) {
                            var3--;
                            String var182 = field5608[var3];
                            var2--;
                            int var183 = field5604[var2];
                            class327.method2020(-27, var183, var182);
                            continue;
                        }
                        if (var625 == 3605) {
                            var3--;
                            String var184 = field5608[var3];
                            class87.method568((byte) 127, var184);
                            continue;
                        }
                        if (var625 == 3606) {
                            var3--;
                            String var185 = field5608[var3];
                            class359.method2162(var185, (byte) 30);
                            continue;
                        }
                        if (var625 == 3607) {
                            var3--;
                            String var186 = field5608[var3];
                            class261.method1620(var186, false, 16);
                            continue;
                        }
                        if (var625 == 3608) {
                            var3--;
                            String var187 = field5608[var3];
                            class86.method562(var187, true);
                            continue;
                        }
                        if (var625 == 3609) {
                            var3--;
                            String var188 = field5608[var3];
                            if (var188.startsWith("<img=0>") || var188.startsWith("<img=1>")) {
                                var188 = var188.substring(7);
                            }
                            field5604[var2++] = class174.method1068(var188, 0) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3610) {
                            var2--;
                            int var189 = field5604[var2];
                            if (class155.field2161 == 2 && var189 < class145.field1985) {
                                field5608[var3++] = class255.field3941[var189];
                                continue;
                            }
                            field5608[var3++] = "";
                            continue;
                        }
                        if (var625 == 3611) {
                            if (class36.field433 == null) {
                                field5608[var3++] = "";
                            } else {
                                field5608[var3++] = class183.method1112(class36.field433, (byte) 98);
                            }
                            continue;
                        }
                        if (var625 == 3612) {
                            if (class36.field433 == null) {
                                field5604[var2++] = 0;
                            } else {
                                field5604[var2++] = class74.field979;
                            }
                            continue;
                        }
                        if (var625 == 3613) {
                            var2--;
                            int var190 = field5604[var2];
                            if (class36.field433 != null && var190 < class74.field979) {
                                field5608[var3++] = class196.field2964[var190].field4681;
                                continue;
                            }
                            field5608[var3++] = "";
                            continue;
                        }
                        if (var625 == 3614) {
                            var2--;
                            int var191 = field5604[var2];
                            if (class36.field433 != null && var191 < class74.field979) {
                                field5604[var2++] = class196.field2964[var191].field4678;
                                continue;
                            }
                            field5604[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3615) {
                            var2--;
                            int var192 = field5604[var2];
                            if (class36.field433 != null && var192 < class74.field979) {
                                field5604[var2++] = class196.field2964[var192].field4683;
                                continue;
                            }
                            field5604[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3616) {
                            field5604[var2++] = class357.field5255;
                            continue;
                        }
                        if (var625 == 3617) {
                            var3--;
                            String var193 = field5608[var3];
                            class301.method1856(var193, (byte) -125);
                            continue;
                        }
                        if (var625 == 3618) {
                            field5604[var2++] = class128.field1646;
                            continue;
                        }
                        if (var625 == 3619) {
                            var3--;
                            String var194 = field5608[var3];
                            class359.method2157((byte) 123, var194);
                            continue;
                        }
                        if (var625 == 3620) {
                            class227.method1376(false);
                            continue;
                        }
                        if (var625 == 3621) {
                            if (class155.field2161 == 0) {
                                field5604[var2++] = -1;
                            } else {
                                field5604[var2++] = class433.field6366;
                            }
                            continue;
                        }
                        if (var625 == 3622) {
                            var2--;
                            int var195 = field5604[var2];
                            if (class155.field2161 != 0 && var195 < class433.field6366) {
                                field5608[var3++] = class289.field4400[var195];
                                if (class458.field6793[var195] == null) {
                                    field5608[var3++] = "";
                                } else {
                                    field5608[var3++] = class458.field6793[var195];
                                }
                                continue;
                            }
                            field5608[var3++] = "";
                            field5608[var3++] = "";
                            continue;
                        }
                        if (var625 == 3623) {
                            var3--;
                            String var196 = field5608[var3];
                            if (var196.startsWith("<img=0>") || var196.startsWith("<img=1>")) {
                                var196 = var196.substring(7);
                            }
                            field5604[var2++] = class14.method83(var196, (byte) -84) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3624) {
                            var2--;
                            int var197 = field5604[var2];
                            if (class196.field2964 != null && var197 < class74.field979 && class196.field2964[var197].field4684.equalsIgnoreCase(class113.field1500.field2459)) {
                                field5604[var2++] = 1;
                                continue;
                            }
                            field5604[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3625) {
                            if (class447.field6589 == null) {
                                field5608[var3++] = "";
                            } else {
                                field5608[var3++] = class447.field6589;
                            }
                            continue;
                        }
                        if (var625 == 3626) {
                            var2--;
                            int var198 = field5604[var2];
                            if (class36.field433 != null && var198 < class74.field979) {
                                field5608[var3++] = class196.field2964[var198].field4680;
                                continue;
                            }
                            field5608[var3++] = "";
                            continue;
                        }
                        if (var625 == 3627) {
                            var2--;
                            int var199 = field5604[var2];
                            if (class155.field2161 == 2 && var199 >= 0 && var199 < class145.field1985) {
                                field5604[var2++] = class189.field2837[var199] ? 1 : 0;
                                continue;
                            }
                            field5604[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3628) {
                            var3--;
                            String var200 = field5608[var3];
                            if (var200.startsWith("<img=0>") || var200.startsWith("<img=1>")) {
                                var200 = var200.substring(7);
                            }
                            field5604[var2++] = class447.method2760((byte) 45, var200);
                            continue;
                        }
                        if (var625 == 3629) {
                            field5604[var2++] = class462.field6820;
                            continue;
                        }
                        if (var625 == 3630) {
                            var3--;
                            String var201 = field5608[var3];
                            class261.method1620(var201, true, 16);
                            continue;
                        }
                        if (var625 == 3631) {
                            var2--;
                            int var202 = field5604[var2];
                            field5604[var2++] = class75.field1020[var202] ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3632) {
                            var2--;
                            int var203 = field5604[var2];
                            if (class36.field433 != null && var203 < class74.field979) {
                                field5608[var3++] = class196.field2964[var203].field4684;
                                continue;
                            }
                            field5608[var3++] = "";
                            continue;
                        }
                        if (var625 == 3633) {
                            var2--;
                            int var204 = field5604[var2];
                            if (class155.field2161 != 0 && var204 < class433.field6366) {
                                field5608[var3++] = class246.field3687[var204];
                                continue;
                            }
                            field5608[var3++] = "";
                            continue;
                        }
                    } else if (var625 < 4000) {
                        if (var625 == 3903) {
                            var2--;
                            int var205 = field5604[var2];
                            field5604[var2++] = class276.field4208[var205].method1947(true);
                            continue;
                        }
                        if (var625 == 3904) {
                            var2--;
                            int var206 = field5604[var2];
                            field5604[var2++] = class276.field4208[var206].field4813;
                            continue;
                        }
                        if (var625 == 3905) {
                            var2--;
                            int var207 = field5604[var2];
                            field5604[var2++] = class276.field4208[var207].field4821;
                            continue;
                        }
                        if (var625 == 3906) {
                            var2--;
                            int var208 = field5604[var2];
                            field5604[var2++] = class276.field4208[var208].field4815;
                            continue;
                        }
                        if (var625 == 3907) {
                            var2--;
                            int var209 = field5604[var2];
                            field5604[var2++] = class276.field4208[var209].field4823;
                            continue;
                        }
                        if (var625 == 3908) {
                            var2--;
                            int var210 = field5604[var2];
                            field5604[var2++] = class276.field4208[var210].field4816;
                            continue;
                        }
                        if (var625 == 3910) {
                            var2--;
                            int var211 = field5604[var2];
                            int var212 = class276.field4208[var211].method1949(111);
                            field5604[var2++] = var212 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3911) {
                            var2--;
                            int var213 = field5604[var2];
                            int var214 = class276.field4208[var213].method1949(117);
                            field5604[var2++] = var214 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3912) {
                            var2--;
                            int var215 = field5604[var2];
                            int var216 = class276.field4208[var215].method1949(121);
                            field5604[var2++] = var216 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3913) {
                            var2--;
                            int var217 = field5604[var2];
                            int var218 = class276.field4208[var217].method1949(126);
                            field5604[var2++] = var218 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 4100) {
                        if (var625 == 4000) {
                            var2 -= 2;
                            int var219 = field5604[var2];
                            int var220 = field5604[var2 + 1];
                            field5604[var2++] = var219 + var220;
                            continue;
                        }
                        if (var625 == 4001) {
                            var2 -= 2;
                            int var221 = field5604[var2];
                            int var222 = field5604[var2 + 1];
                            field5604[var2++] = var221 - var222;
                            continue;
                        }
                        if (var625 == 4002) {
                            var2 -= 2;
                            int var223 = field5604[var2];
                            int var224 = field5604[var2 + 1];
                            field5604[var2++] = var223 * var224;
                            continue;
                        }
                        if (var625 == 4003) {
                            var2 -= 2;
                            int var225 = field5604[var2];
                            int var226 = field5604[var2 + 1];
                            field5604[var2++] = var225 / var226;
                            continue;
                        }
                        if (var625 == 4004) {
                            var2--;
                            int var227 = field5604[var2];
                            field5604[var2++] = (int) (Math.random() * (double) var227);
                            continue;
                        }
                        if (var625 == 4005) {
                            var2--;
                            int var228 = field5604[var2];
                            field5604[var2++] = (int) (Math.random() * (double) (var228 + 1));
                            continue;
                        }
                        if (var625 == 4006) {
                            var2 -= 5;
                            int var229 = field5604[var2];
                            int var230 = field5604[var2 + 1];
                            int var231 = field5604[var2 + 2];
                            int var232 = field5604[var2 + 3];
                            int var233 = field5604[var2 + 4];
                            field5604[var2++] = (var230 - var229) * (var233 - var231) / (var232 - var231) + var229;
                            continue;
                        }
                        if (var625 == 4007) {
                            var2 -= 2;
                            long var234 = (long) field5604[var2];
                            long var236 = (long) field5604[var2 + 1];
                            field5604[var2++] = (int) (var234 * var236 / 100L + var234);
                            continue;
                        }
                        if (var625 == 4008) {
                            var2 -= 2;
                            int var238 = field5604[var2];
                            int var239 = field5604[var2 + 1];
                            field5604[var2++] = var238 | 0x1 << var239;
                            continue;
                        }
                        if (var625 == 4009) {
                            var2 -= 2;
                            int var240 = field5604[var2];
                            int var241 = field5604[var2 + 1];
                            field5604[var2++] = var240 & -(0x1 << var241) - 1;
                            continue;
                        }
                        if (var625 == 4010) {
                            var2 -= 2;
                            int var242 = field5604[var2];
                            int var243 = field5604[var2 + 1];
                            field5604[var2++] = (var242 & 0x1 << var243) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var625 == 4011) {
                            var2 -= 2;
                            int var244 = field5604[var2];
                            int var245 = field5604[var2 + 1];
                            field5604[var2++] = var244 % var245;
                            continue;
                        }
                        if (var625 == 4012) {
                            var2 -= 2;
                            int var246 = field5604[var2];
                            int var247 = field5604[var2 + 1];
                            if (var246 == 0) {
                                field5604[var2++] = 0;
                            } else {
                                field5604[var2++] = (int) Math.pow((double) var246, (double) var247);
                            }
                            continue;
                        }
                        if (var625 == 4013) {
                            var2 -= 2;
                            int var248 = field5604[var2];
                            int var249 = field5604[var2 + 1];
                            if (var248 == 0) {
                                field5604[var2++] = 0;
                            } else if (var249 == 0) {
                                field5604[var2++] = Integer.MAX_VALUE;
                            } else {
                                field5604[var2++] = (int) Math.pow((double) var248, 1.0D / (double) var249);
                            }
                            continue;
                        }
                        if (var625 == 4014) {
                            var2 -= 2;
                            int var250 = field5604[var2];
                            int var251 = field5604[var2 + 1];
                            field5604[var2++] = var250 & var251;
                            continue;
                        }
                        if (var625 == 4015) {
                            var2 -= 2;
                            int var252 = field5604[var2];
                            int var253 = field5604[var2 + 1];
                            field5604[var2++] = var252 | var253;
                            continue;
                        }
                        if (var625 == 4016) {
                            var2 -= 2;
                            int var254 = field5604[var2];
                            int var255 = field5604[var2 + 1];
                            field5604[var2++] = var254 < var255 ? var254 : var255;
                            continue;
                        }
                        if (var625 == 4017) {
                            var2 -= 2;
                            int var256 = field5604[var2];
                            int var257 = field5604[var2 + 1];
                            field5604[var2++] = var256 > var257 ? var256 : var257;
                            continue;
                        }
                        if (var625 == 4018) {
                            var2 -= 3;
                            long var258 = (long) field5604[var2];
                            long var260 = (long) field5604[var2 + 1];
                            long var262 = (long) field5604[var2 + 2];
                            field5604[var2++] = (int) (var258 * var262 / var260);
                            continue;
                        }
                    } else if (var625 < 4200) {
                        if (var625 == 4100) {
                            var3--;
                            String var264 = field5608[var3];
                            var2--;
                            int var265 = field5604[var2];
                            field5608[var3++] = var264 + var265;
                            continue;
                        }
                        if (var625 == 4101) {
                            var3 -= 2;
                            String var266 = field5608[var3];
                            String var267 = field5608[var3 + 1];
                            field5608[var3++] = var266 + var267;
                            continue;
                        }
                        if (var625 == 4102) {
                            var3--;
                            String var268 = field5608[var3];
                            var2--;
                            int var269 = field5604[var2];
                            field5608[var3++] = var268 + class170.method1038(true, 15511, var269);
                            continue;
                        }
                        if (var625 == 4103) {
                            var3--;
                            String var270 = field5608[var3];
                            field5608[var3++] = var270.toLowerCase();
                            continue;
                        }
                        if (var625 == 4104) {
                            var2--;
                            int var271 = field5604[var2];
                            long var272 = ((long) var271 + 11745L) * 86400000L;
                            field5612.setTime(new Date(var272));
                            int var274 = field5612.get(5);
                            int var275 = field5612.get(2);
                            int var276 = field5612.get(1);
                            field5608[var3++] = var274 + "-" + field5615[var275] + "-" + var276;
                            continue;
                        }
                        if (var625 == 4105) {
                            var3 -= 2;
                            String var277 = field5608[var3];
                            String var278 = field5608[var3 + 1];
                            if (class113.field1500.field2443 != null && class113.field1500.field2443.field1645) {
                                field5608[var3++] = var278;
                                continue;
                            }
                            field5608[var3++] = var277;
                            continue;
                        }
                        if (var625 == 4106) {
                            var2--;
                            int var279 = field5604[var2];
                            field5608[var3++] = Integer.toString(var279);
                            continue;
                        }
                        if (var625 == 4107) {
                            var3 -= 2;
                            field5604[var2++] = class268.method1672(field5608[var3 + 1], (byte) -113, class27.field356, field5608[var3]);
                            continue;
                        }
                        if (var625 == 4108) {
                            var3--;
                            String var280 = field5608[var3];
                            var2 -= 2;
                            int var281 = field5604[var2];
                            int var282 = field5604[var2 + 1];
                            class272 var283 = class1.method14((byte) 127, class430.field6321, 0, var282);
                            field5604[var2++] = var283.method1701(var281, class107.field1426, -31755, var280);
                            continue;
                        }
                        if (var625 == 4109) {
                            var3--;
                            String var284 = field5608[var3];
                            var2 -= 2;
                            int var285 = field5604[var2];
                            int var286 = field5604[var2 + 1];
                            class272 var287 = class1.method14((byte) 118, class430.field6321, 0, var286);
                            field5604[var2++] = var287.method1700(var284, -126, class107.field1426, var285);
                            continue;
                        }
                        if (var625 == 4110) {
                            var3 -= 2;
                            String var288 = field5608[var3];
                            String var289 = field5608[var3 + 1];
                            var2--;
                            if (field5604[var2] == 1) {
                                field5608[var3++] = var288;
                            } else {
                                field5608[var3++] = var289;
                            }
                            continue;
                        }
                        if (var625 == 4111) {
                            var3--;
                            String var290 = field5608[var3];
                            field5608[var3++] = class376.method2265(-63, var290);
                            continue;
                        }
                        if (var625 == 4112) {
                            var3--;
                            String var291 = field5608[var3];
                            var2--;
                            int var292 = field5604[var2];
                            if (var292 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field5608[var3++] = var291 + (char) var292;
                            continue;
                        }
                        if (var625 == 4113) {
                            var2--;
                            int var293 = field5604[var2];
                            field5604[var2++] = class328.method2022((byte) 86, (char) var293) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4114) {
                            var2--;
                            int var294 = field5604[var2];
                            field5604[var2++] = class56.method320(-1, (char) var294) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4115) {
                            var2--;
                            int var295 = field5604[var2];
                            field5604[var2++] = class135.method849((char) var295, 8) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4116) {
                            var2--;
                            int var296 = field5604[var2];
                            field5604[var2++] = class278.method1722((char) var296, false) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4117) {
                            var3--;
                            String var297 = field5608[var3];
                            if (var297 == null) {
                                field5604[var2++] = 0;
                            } else {
                                field5604[var2++] = var297.length();
                            }
                            continue;
                        }
                        if (var625 == 4118) {
                            var3--;
                            String var298 = field5608[var3];
                            var2 -= 2;
                            int var299 = field5604[var2];
                            int var300 = field5604[var2 + 1];
                            field5608[var3++] = var298.substring(var299, var300);
                            continue;
                        }
                        if (var625 == 4119) {
                            var3--;
                            String var301 = field5608[var3];
                            StringBuffer var302 = new StringBuffer(var301.length());
                            boolean var303 = false;
                            for (int var304 = 0; var304 < var301.length(); var304++) {
                                char var305 = var301.charAt(var304);
                                if (var305 == '<') {
                                    var303 = true;
                                } else if (var305 == '>') {
                                    var303 = false;
                                } else if (!var303) {
                                    var302.append(var305);
                                }
                            }
                            field5608[var3++] = var302.toString();
                            continue;
                        }
                        if (var625 == 4120) {
                            var3--;
                            String var306 = field5608[var3];
                            var2 -= 2;
                            int var307 = field5604[var2];
                            int var308 = field5604[var2 + 1];
                            field5604[var2++] = var306.indexOf(var307, var308);
                            continue;
                        }
                        if (var625 == 4121) {
                            var3 -= 2;
                            String var309 = field5608[var3];
                            String var310 = field5608[var3 + 1];
                            var2--;
                            int var311 = field5604[var2];
                            field5604[var2++] = var309.indexOf(var310, var311);
                            continue;
                        }
                        if (var625 == 4122) {
                            var2--;
                            int var312 = field5604[var2];
                            field5604[var2++] = Character.toLowerCase((char) var312);
                            continue;
                        }
                        if (var625 == 4123) {
                            var2--;
                            int var313 = field5604[var2];
                            field5604[var2++] = Character.toUpperCase((char) var313);
                            continue;
                        }
                        if (var625 == 4124) {
                            var2--;
                            boolean var314 = field5604[var2] != 0;
                            var2--;
                            int var315 = field5604[var2];
                            field5608[var3++] = class282.method1734((long) var315, class27.field356, 0, 118, var314);
                            continue;
                        }
                        if (var625 == 4125) {
                            var3--;
                            String var316 = field5608[var3];
                            var2--;
                            int var317 = field5604[var2];
                            class272 var318 = class1.method14((byte) 122, class430.field6321, 0, var317);
                            field5604[var2++] = var318.method1692(var316, class107.field1426, (byte) -55);
                            continue;
                        }
                    } else if (var625 < 4300) {
                        if (var625 == 4200) {
                            var2--;
                            int var319 = field5604[var2];
                            field5608[var3++] = class186.field2796.method1106(50, var319).field2329;
                            continue;
                        }
                        if (var625 == 4201) {
                            var2 -= 2;
                            int var320 = field5604[var2];
                            int var321 = field5604[var2 + 1];
                            class167 var322 = class186.field2796.method1106(50, var320);
                            if (var321 >= 1 && var321 <= 5 && var322.field2336[var321 - 1] != null) {
                                field5608[var3++] = var322.field2336[var321 - 1];
                                continue;
                            }
                            field5608[var3++] = "";
                            continue;
                        }
                        if (var625 == 4202) {
                            var2 -= 2;
                            int var323 = field5604[var2];
                            int var324 = field5604[var2 + 1];
                            class167 var325 = class186.field2796.method1106(50, var323);
                            if (var324 >= 1 && var324 <= 5 && var325.field2348[var324 - 1] != null) {
                                field5608[var3++] = var325.field2348[var324 - 1];
                                continue;
                            }
                            field5608[var3++] = "";
                            continue;
                        }
                        if (var625 == 4203) {
                            var2--;
                            int var326 = field5604[var2];
                            field5604[var2++] = class186.field2796.method1106(50, var326).field2331;
                            continue;
                        }
                        if (var625 == 4204) {
                            var2--;
                            int var327 = field5604[var2];
                            field5604[var2++] = class186.field2796.method1106(50, var327).field2356 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4205) {
                            var2--;
                            int var328 = field5604[var2];
                            class167 var329 = class186.field2796.method1106(50, var328);
                            if (var329.field2345 == -1 && var329.field2376 >= 0) {
                                field5604[var2++] = var329.field2376;
                                continue;
                            }
                            field5604[var2++] = var328;
                            continue;
                        }
                        if (var625 == 4206) {
                            var2--;
                            int var330 = field5604[var2];
                            class167 var331 = class186.field2796.method1106(50, var330);
                            if (var331.field2345 >= 0 && var331.field2376 >= 0) {
                                field5604[var2++] = var331.field2376;
                                continue;
                            }
                            field5604[var2++] = var330;
                            continue;
                        }
                        if (var625 == 4207) {
                            var2--;
                            int var332 = field5604[var2];
                            field5604[var2++] = class186.field2796.method1106(50, var332).field2387 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4208) {
                            var2 -= 2;
                            int var333 = field5604[var2];
                            int var334 = field5604[var2 + 1];
                            class15 var335 = class19.method123(var334, (byte) -85);
                            if (var335.method91((byte) 103)) {
                                field5608[var3++] = class186.field2796.method1106(50, var333).method1013(var334, (byte) -127, var335.field182);
                            } else {
                                field5604[var2++] = class186.field2796.method1106(50, var333).method1002(-30283, var334, var335.field186);
                            }
                            continue;
                        }
                        if (var625 == 4209) {
                            var2 -= 2;
                            int var336 = field5604[var2];
                            int var337 = field5604[var2 + 1] - 1;
                            class167 var338 = class186.field2796.method1106(50, var336);
                            if (var338.field2366 == var337) {
                                field5604[var2++] = var338.field2353;
                            } else if (var338.field2375 == var337) {
                                field5604[var2++] = var338.field2374;
                            } else {
                                field5604[var2++] = -1;
                            }
                            continue;
                        }
                        if (var625 == 4210) {
                            var3--;
                            String var339 = field5608[var3];
                            var2--;
                            int var340 = field5604[var2];
                            class298.method1843(var340 == 1, var339, -85);
                            field5604[var2++] = class90.field1279;
                            continue;
                        }
                        if (var625 == 4211) {
                            if (class411.field6117 != null && class337.field5019 < class90.field1279) {
                                field5604[var2++] = class411.field6117[class337.field5019++] & 0xFFFF;
                                continue;
                            }
                            field5604[var2++] = -1;
                            continue;
                        }
                        if (var625 == 4212) {
                            class337.field5019 = 0;
                            continue;
                        }
                    } else if (var625 < 4400) {
                        if (var625 == 4300) {
                            var2 -= 2;
                            int var341 = field5604[var2];
                            int var342 = field5604[var2 + 1];
                            class15 var343 = class19.method123(var342, (byte) -123);
                            if (var343.method91((byte) 95)) {
                                field5608[var3++] = class228.method1385(var341, (byte) 61).method1686(var342, var343.field182, (byte) -84);
                            } else {
                                field5604[var2++] = class228.method1385(var341, (byte) 61).method1688(21168, var343.field186, var342);
                            }
                            continue;
                        }
                    } else if (var625 < 4500) {
                        if (var625 == 4400) {
                            var2 -= 2;
                            int var344 = field5604[var2];
                            int var345 = field5604[var2 + 1];
                            class15 var346 = class19.method123(var345, (byte) -110);
                            if (var346.method91((byte) 122)) {
                                field5608[var3++] = class411.method2575(0, var344).method547(var346.field182, var345, (byte) 51);
                            } else {
                                field5604[var2++] = class411.method2575(0, var344).method556(-115, var345, var346.field186);
                            }
                            continue;
                        }
                    } else if (var625 < 4600) {
                        if (var625 == 4500) {
                            var2 -= 2;
                            int var347 = field5604[var2];
                            int var348 = field5604[var2 + 1];
                            class15 var349 = class19.method123(var348, (byte) -106);
                            if (var349.method91((byte) 126)) {
                                field5608[var3++] = class155.method964(var347, false).method200(var348, var349.field182, (byte) 98);
                            } else {
                                field5604[var2++] = class155.method964(var347, false).method201(var348, 0, var349.field186);
                            }
                            continue;
                        }
                    } else if (var625 < 4700) {
                        if (var625 == 4600) {
                            var2--;
                            int var350 = field5604[var2];
                            class433 var351 = class180.method1092(false, var350);
                            if (var351.field6347 != null && var351.field6347.length > 0) {
                                int var352 = 0;
                                int var353 = var351.field6389[0];
                                for (int var354 = 1; var354 < var351.field6347.length; var354++) {
                                    if (var351.field6389[var354] > var353) {
                                        var352 = var354;
                                        var353 = var351.field6389[var354];
                                    }
                                }
                                field5604[var2++] = var351.field6347[var352];
                                continue;
                            }
                            field5604[var2++] = var351.field6355;
                            continue;
                        }
                    } else if (var625 < 5100) {
                        if (var625 == 5000) {
                            field5604[var2++] = class103.field1397;
                            continue;
                        }
                        if (var625 == 5001) {
                            var2 -= 3;
                            class103.field1397 = field5604[var2];
                            class162.field2254 = field5604[var2 + 1];
                            class265.field4038 = field5604[var2 + 2];
                            field5603++;
                            class177.method1082(class302.field4569, 0);
                            class189.field2840.method2366(class103.field1397, true);
                            class189.field2840.method2366(class162.field2254, true);
                            class189.field2840.method2366(class265.field4038, true);
                            continue;
                        }
                        if (var625 == 5002) {
                            var3 -= 2;
                            String var355 = field5608[var3];
                            String var356 = field5608[var3 + 1];
                            var2 -= 2;
                            int var357 = field5604[var2];
                            int var358 = field5604[var2 + 1];
                            if (var356 == null) {
                                var356 = "";
                            }
                            if (var356.length() > 80) {
                                var356 = var356.substring(0, 80);
                            }
                            field5601++;
                            class177.method1082(class291.field4432, 0);
                            class189.field2840.method2366(class386.method2384(-4580, var355) + class386.method2384(-4580, var356) + 2, true);
                            class189.field2840.method2375(-117, var355);
                            class189.field2840.method2366(var357 - 1, true);
                            class189.field2840.method2366(var358, true);
                            class189.field2840.method2375(-76, var356);
                            continue;
                        }
                        if (var625 == 5003) {
                            var2--;
                            int var359 = field5604[var2];
                            String var360 = null;
                            if (var359 < 100) {
                                var360 = class119.field1570[var359];
                            }
                            if (var360 == null) {
                                var360 = "";
                            }
                            field5608[var3++] = var360;
                            continue;
                        }
                        if (var625 == 5004) {
                            var2--;
                            int var361 = field5604[var2];
                            int var362 = -1;
                            if (var361 < 100 && class119.field1570[var361] != null) {
                                var362 = class160.field2215[var361];
                            }
                            field5604[var2++] = var362;
                            continue;
                        }
                        if (var625 == 5005) {
                            field5604[var2++] = class162.field2254;
                            continue;
                        }
                        if (var625 == 5008) {
                            var3--;
                            String var363 = field5608[var3];
                            if (class143.field1912 == 0 && (class430.field6326 && !class238.field3570 || class286.field4361)) {
                                continue;
                            }
                            String var364 = var363.toLowerCase();
                            byte var365 = 0;
                            if (var364.startsWith(class381.field5554.method937((byte) -95, 0))) {
                                var365 = 0;
                                var363 = var363.substring(class381.field5554.method937((byte) -55, 0).length());
                            } else if (var364.startsWith(class359.field5314.method937((byte) 120, 0))) {
                                var365 = 1;
                                var363 = var363.substring(class359.field5314.method937((byte) -96, 0).length());
                            } else if (var364.startsWith(class423.field6226.method937((byte) -46, 0))) {
                                var365 = 2;
                                var363 = var363.substring(class423.field6226.method937((byte) -94, 0).length());
                            } else if (var364.startsWith(class382.field5572.method937((byte) 109, 0))) {
                                var365 = 3;
                                var363 = var363.substring(class382.field5572.method937((byte) -86, 0).length());
                            } else if (var364.startsWith(class412.field6131.method937((byte) -101, 0))) {
                                var365 = 4;
                                var363 = var363.substring(class412.field6131.method937((byte) 101, 0).length());
                            } else if (var364.startsWith(class264.field4024.method937((byte) -74, 0))) {
                                var365 = 5;
                                var363 = var363.substring(class264.field4024.method937((byte) 101, 0).length());
                            } else if (var364.startsWith(class453.field6736.method937((byte) 99, 0))) {
                                var365 = 6;
                                var363 = var363.substring(class453.field6736.method937((byte) 106, 0).length());
                            } else if (var364.startsWith(class82.field1101.method937((byte) -109, 0))) {
                                var365 = 7;
                                var363 = var363.substring(class82.field1101.method937((byte) 116, 0).length());
                            } else if (var364.startsWith(class381.field5558.method937((byte) -113, 0))) {
                                var365 = 8;
                                var363 = var363.substring(class381.field5558.method937((byte) -122, 0).length());
                            } else if (var364.startsWith(class140.field1879.method937((byte) -59, 0))) {
                                var365 = 9;
                                var363 = var363.substring(class140.field1879.method937((byte) 105, 0).length());
                            } else if (var364.startsWith(class377.field5502.method937((byte) -30, 0))) {
                                var365 = 10;
                                var363 = var363.substring(class377.field5502.method937((byte) 109, 0).length());
                            } else if (var364.startsWith(class443.field6536.method937((byte) -40, 0))) {
                                var365 = 11;
                                var363 = var363.substring(class443.field6536.method937((byte) -78, 0).length());
                            } else if (class27.field356 != 0) {
                                if (var364.startsWith(class381.field5554.method937((byte) 106, class27.field356))) {
                                    var365 = 0;
                                    var363 = var363.substring(class381.field5554.method937((byte) -99, class27.field356).length());
                                } else if (var364.startsWith(class359.field5314.method937((byte) -80, class27.field356))) {
                                    var365 = 1;
                                    var363 = var363.substring(class359.field5314.method937((byte) -109, class27.field356).length());
                                } else if (var364.startsWith(class423.field6226.method937((byte) -73, class27.field356))) {
                                    var365 = 2;
                                    var363 = var363.substring(class423.field6226.method937((byte) 108, class27.field356).length());
                                } else if (var364.startsWith(class382.field5572.method937((byte) 96, class27.field356))) {
                                    var365 = 3;
                                    var363 = var363.substring(class382.field5572.method937((byte) -88, class27.field356).length());
                                } else if (var364.startsWith(class412.field6131.method937((byte) 117, class27.field356))) {
                                    var365 = 4;
                                    var363 = var363.substring(class412.field6131.method937((byte) 123, class27.field356).length());
                                } else if (var364.startsWith(class264.field4024.method937((byte) 119, class27.field356))) {
                                    var365 = 5;
                                    var363 = var363.substring(class264.field4024.method937((byte) -28, class27.field356).length());
                                } else if (var364.startsWith(class453.field6736.method937((byte) 111, class27.field356))) {
                                    var365 = 6;
                                    var363 = var363.substring(class453.field6736.method937((byte) 113, class27.field356).length());
                                } else if (var364.startsWith(class82.field1101.method937((byte) -45, class27.field356))) {
                                    var365 = 7;
                                    var363 = var363.substring(class82.field1101.method937((byte) -119, class27.field356).length());
                                } else if (var364.startsWith(class381.field5558.method937((byte) 125, class27.field356))) {
                                    var365 = 8;
                                    var363 = var363.substring(class381.field5558.method937((byte) -104, class27.field356).length());
                                } else if (var364.startsWith(class140.field1879.method937((byte) 101, class27.field356))) {
                                    var365 = 9;
                                    var363 = var363.substring(class140.field1879.method937((byte) 113, class27.field356).length());
                                } else if (var364.startsWith(class377.field5502.method937((byte) 114, class27.field356))) {
                                    var365 = 10;
                                    var363 = var363.substring(class377.field5502.method937((byte) 99, class27.field356).length());
                                } else if (var364.startsWith(class443.field6536.method937((byte) -54, class27.field356))) {
                                    var365 = 11;
                                    var363 = var363.substring(class443.field6536.method937((byte) 117, class27.field356).length());
                                }
                            }
                            String var366 = var363.toLowerCase();
                            byte var367 = 0;
                            if (var366.startsWith(class17.field238.method937((byte) 99, 0))) {
                                var367 = 1;
                                var363 = var363.substring(class17.field238.method937((byte) -127, 0).length());
                            } else if (var366.startsWith(class246.field3688.method937((byte) -64, 0))) {
                                var367 = 2;
                                var363 = var363.substring(class246.field3688.method937((byte) 122, 0).length());
                            } else if (var366.startsWith(class306.field4632.method937((byte) 107, 0))) {
                                var367 = 3;
                                var363 = var363.substring(class306.field4632.method937((byte) -81, 0).length());
                            } else if (var366.startsWith(class271.field4164.method937((byte) -62, 0))) {
                                var367 = 4;
                                var363 = var363.substring(class271.field4164.method937((byte) 103, 0).length());
                            } else if (var366.startsWith(class365.field5363.method937((byte) 104, 0))) {
                                var367 = 5;
                                var363 = var363.substring(class365.field5363.method937((byte) 126, 0).length());
                            } else if (class27.field356 != 0) {
                                if (var366.startsWith(class17.field238.method937((byte) 125, class27.field356))) {
                                    var367 = 1;
                                    var363 = var363.substring(class17.field238.method937((byte) 107, class27.field356).length());
                                } else if (var366.startsWith(class246.field3688.method937((byte) -43, class27.field356))) {
                                    var367 = 2;
                                    var363 = var363.substring(class246.field3688.method937((byte) -127, class27.field356).length());
                                } else if (var366.startsWith(class306.field4632.method937((byte) -29, class27.field356))) {
                                    var367 = 3;
                                    var363 = var363.substring(class306.field4632.method937((byte) 118, class27.field356).length());
                                } else if (var366.startsWith(class271.field4164.method937((byte) -92, class27.field356))) {
                                    var367 = 4;
                                    var363 = var363.substring(class271.field4164.method937((byte) -86, class27.field356).length());
                                } else if (var366.startsWith(class365.field5363.method937((byte) -52, class27.field356))) {
                                    var367 = 5;
                                    var363 = var363.substring(class365.field5363.method937((byte) 125, class27.field356).length());
                                }
                            }
                            field5610++;
                            class177.method1082(class52.field678, 0);
                            class189.field2840.method2366(0, true);
                            int var368 = class189.field2840.field5666;
                            class189.field2840.method2366(var365, true);
                            class189.field2840.method2366(var367, true);
                            class303.method1865(var363, class189.field2840, true);
                            class189.field2840.method2331(class189.field2840.field5666 - var368, 65536);
                            continue;
                        }
                        if (var625 == 5009) {
                            var3 -= 2;
                            String var369 = field5608[var3];
                            String var370 = field5608[var3 + 1];
                            if (class143.field1912 != 0 || (!class430.field6326 || class238.field3570) && !class286.field4361) {
                                field5593++;
                                class177.method1082(class456.field6775, 0);
                                class189.field2840.method2366(0, true);
                                int var371 = class189.field2840.field5666;
                                class189.field2840.method2375(122, var369);
                                class303.method1865(var370, class189.field2840, true);
                                class189.field2840.method2331(class189.field2840.field5666 - var371, 65536);
                            }
                            continue;
                        }
                        if (var625 == 5010) {
                            var2--;
                            int var372 = field5604[var2];
                            String var373 = null;
                            if (var372 < 100) {
                                var373 = class250.field3746[var372];
                            }
                            if (var373 == null) {
                                var373 = "";
                            }
                            field5608[var3++] = var373;
                            continue;
                        }
                        if (var625 == 5011) {
                            var2--;
                            int var374 = field5604[var2];
                            String var375 = null;
                            if (var374 < 100) {
                                var375 = class430.field6322[var374];
                            }
                            if (var375 == null) {
                                var375 = "";
                            }
                            field5608[var3++] = var375;
                            continue;
                        }
                        if (var625 == 5012) {
                            var2--;
                            int var376 = field5604[var2];
                            int var377 = -1;
                            if (var376 < 100) {
                                var377 = class91.field1287[var376];
                            }
                            field5604[var2++] = var377;
                            continue;
                        }
                        if (var625 == 5015) {
                            String var378;
                            if (class113.field1500 == null || class113.field1500.field2430 == null) {
                                var378 = class116.field1526;
                            } else {
                                var378 = class113.field1500.method1026(true, (byte) 34);
                            }
                            field5608[var3++] = var378;
                            continue;
                        }
                        if (var625 == 5016) {
                            field5604[var2++] = class265.field4038;
                            continue;
                        }
                        if (var625 == 5017) {
                            field5604[var2++] = class413.field6134;
                            continue;
                        }
                        if (var625 == 5018) {
                            var2--;
                            int var379 = field5604[var2];
                            int var380 = 0;
                            if (var379 < 100 && class119.field1570[var379] != null) {
                                var380 = class160.field2215[var379];
                            }
                            field5604[var2++] = var380;
                            continue;
                        }
                        if (var625 == 5019) {
                            var2--;
                            int var381 = field5604[var2];
                            String var382 = null;
                            if (var381 < 100) {
                                var382 = class72.field962[var381];
                            }
                            if (var382 == null) {
                                var382 = "";
                            }
                            field5608[var3++] = var382;
                            continue;
                        }
                        if (var625 == 5020) {
                            String var383;
                            if (class113.field1500 == null || class113.field1500.field2430 == null) {
                                var383 = class116.field1526;
                            } else {
                                var383 = class113.field1500.method1035(false, -6464);
                            }
                            field5608[var3++] = var383;
                            continue;
                        }
                        if (var625 == 5050) {
                            var2--;
                            int var384 = field5604[var2];
                            field5608[var3++] = class184.method1126(var384, 8723).field5258;
                            continue;
                        }
                        if (var625 == 5051) {
                            var2--;
                            int var385 = field5604[var2];
                            class357 var386 = class184.method1126(var385, 8723);
                            if (var386.field5267 == null) {
                                field5604[var2++] = 0;
                            } else {
                                field5604[var2++] = var386.field5267.length;
                            }
                            continue;
                        }
                        if (var625 == 5052) {
                            var2 -= 2;
                            int var387 = field5604[var2];
                            int var388 = field5604[var2 + 1];
                            class357 var389 = class184.method1126(var387, 8723);
                            int var390 = var389.field5267[var388];
                            field5604[var2++] = var390;
                            continue;
                        }
                        if (var625 == 5053) {
                            var2--;
                            int var391 = field5604[var2];
                            class357 var392 = class184.method1126(var391, 8723);
                            if (var392.field5256 == null) {
                                field5604[var2++] = 0;
                            } else {
                                field5604[var2++] = var392.field5256.length;
                            }
                            continue;
                        }
                        if (var625 == 5054) {
                            var2 -= 2;
                            int var393 = field5604[var2];
                            int var394 = field5604[var2 + 1];
                            field5604[var2++] = class184.method1126(var393, 8723).field5256[var394];
                            continue;
                        }
                        if (var625 == 5055) {
                            var2--;
                            int var395 = field5604[var2];
                            field5608[var3++] = class75.method495((byte) -10, var395).method2534(80);
                            continue;
                        }
                        if (var625 == 5056) {
                            var2--;
                            int var396 = field5604[var2];
                            class402 var397 = class75.method495((byte) -10, var396);
                            if (var397.field5992 == null) {
                                field5604[var2++] = 0;
                            } else {
                                field5604[var2++] = var397.field5992.length;
                            }
                            continue;
                        }
                        if (var625 == 5057) {
                            var2 -= 2;
                            int var398 = field5604[var2];
                            int var399 = field5604[var2 + 1];
                            field5604[var2++] = class75.method495((byte) -10, var398).field5992[var399];
                            continue;
                        }
                        if (var625 == 5058) {
                            field5607 = new class383();
                            var2--;
                            field5607.field5585 = field5604[var2];
                            field5607.field5581 = class75.method495((byte) -10, field5607.field5585);
                            field5607.field5584 = new int[field5607.field5581.method2529((byte) -37)];
                            continue;
                        }
                        if (var625 == 5059) {
                            field5598++;
                            class177.method1082(class138.field1866, 0);
                            class189.field2840.method2366(0, true);
                            int var400 = class189.field2840.field5666;
                            class189.field2840.method2366(0, true);
                            class189.field2840.method2377(field5607.field5585, -41);
                            field5607.field5581.method2535(field5607.field5584, (byte) -63, class189.field2840);
                            class189.field2840.method2331(class189.field2840.field5666 - var400, 65536);
                            continue;
                        }
                        if (var625 == 5060) {
                            var3--;
                            String var401 = field5608[var3];
                            field5602++;
                            class177.method1082(class386.field5704, 0);
                            class189.field2840.method2366(0, true);
                            int var402 = class189.field2840.field5666;
                            class189.field2840.method2375(118, var401);
                            class189.field2840.method2377(field5607.field5585, -10);
                            field5607.field5581.method2535(field5607.field5584, (byte) -63, class189.field2840);
                            class189.field2840.method2331(class189.field2840.field5666 - var402, 65536);
                            continue;
                        }
                        if (var625 == 5061) {
                            field5598++;
                            class177.method1082(class138.field1866, 0);
                            class189.field2840.method2366(0, true);
                            int var403 = class189.field2840.field5666;
                            class189.field2840.method2366(1, true);
                            class189.field2840.method2377(field5607.field5585, -122);
                            field5607.field5581.method2535(field5607.field5584, (byte) -63, class189.field2840);
                            class189.field2840.method2331(class189.field2840.field5666 - var403, 65536);
                            continue;
                        }
                        if (var625 == 5062) {
                            var2 -= 2;
                            int var404 = field5604[var2];
                            int var405 = field5604[var2 + 1];
                            field5604[var2++] = class184.method1126(var404, 8723).field5257[var405];
                            continue;
                        }
                        if (var625 == 5063) {
                            var2 -= 2;
                            int var406 = field5604[var2];
                            int var407 = field5604[var2 + 1];
                            field5604[var2++] = class184.method1126(var406, 8723).field5259[var407];
                            continue;
                        }
                        if (var625 == 5064) {
                            var2 -= 2;
                            int var408 = field5604[var2];
                            int var409 = field5604[var2 + 1];
                            if (var409 == -1) {
                                field5604[var2++] = -1;
                            } else {
                                field5604[var2++] = class184.method1126(var408, 8723).method2140(true, (char) var409);
                            }
                            continue;
                        }
                        if (var625 == 5065) {
                            var2 -= 2;
                            int var410 = field5604[var2];
                            int var411 = field5604[var2 + 1];
                            if (var411 == -1) {
                                field5604[var2++] = -1;
                            } else {
                                field5604[var2++] = class184.method1126(var410, 8723).method2147((byte) -108, (char) var411);
                            }
                            continue;
                        }
                        if (var625 == 5066) {
                            var2--;
                            int var412 = field5604[var2];
                            field5604[var2++] = class75.method495((byte) -10, var412).method2529((byte) -37);
                            continue;
                        }
                        if (var625 == 5067) {
                            var2 -= 2;
                            int var413 = field5604[var2];
                            int var414 = field5604[var2 + 1];
                            int var415 = class75.method495((byte) -10, var413).method2537(var414, 0);
                            field5604[var2++] = var415;
                            continue;
                        }
                        if (var625 == 5068) {
                            var2 -= 2;
                            int var416 = field5604[var2];
                            int var417 = field5604[var2 + 1];
                            field5607.field5584[var416] = var417;
                            continue;
                        }
                        if (var625 == 5069) {
                            var2 -= 2;
                            int var418 = field5604[var2];
                            int var419 = field5604[var2 + 1];
                            field5607.field5584[var418] = var419;
                            continue;
                        }
                        if (var625 == 5070) {
                            var2 -= 3;
                            int var420 = field5604[var2];
                            int var421 = field5604[var2 + 1];
                            int var422 = field5604[var2 + 2];
                            class402 var423 = class75.method495((byte) -10, var420);
                            if (var423.method2537(var421, 0) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field5604[var2++] = var423.method2525(124, var422, var421);
                            continue;
                        }
                        if (var625 == 5071) {
                            var3--;
                            String var424 = field5608[var3];
                            var2--;
                            boolean var425 = field5604[var2] == 1;
                            class342.method2088(var425, var424, -1);
                            field5604[var2++] = class90.field1279;
                            continue;
                        }
                        if (var625 == 5072) {
                            if (class411.field6117 != null && class337.field5019 < class90.field1279) {
                                field5604[var2++] = class411.field6117[class337.field5019++] & 0xFFFF;
                                continue;
                            }
                            field5604[var2++] = -1;
                            continue;
                        }
                        if (var625 == 5073) {
                            class337.field5019 = 0;
                            continue;
                        }
                    } else if (var625 < 5200) {
                        if (var625 == 5100) {
                            if (class185.field2786.method578(false, 86)) {
                                field5604[var2++] = 1;
                            } else {
                                field5604[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 5101) {
                            if (class185.field2786.method578(false, 82)) {
                                field5604[var2++] = 1;
                            } else {
                                field5604[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 5102) {
                            if (class185.field2786.method578(false, 81)) {
                                field5604[var2++] = 1;
                            } else {
                                field5604[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var625 < 5300) {
                        if (var625 == 5200) {
                            var2--;
                            class60.method329(field5604[var2], 86);
                            continue;
                        }
                        if (var625 == 5201) {
                            field5604[var2++] = class372.method2236(52);
                            continue;
                        }
                        if (var625 == 5205) {
                            var2--;
                            class424.method2616(field5604[var2], false, -1, -1, -46);
                            continue;
                        }
                        if (var625 == 5206) {
                            var2--;
                            int var426 = field5604[var2];
                            class341 var427 = class223.method1365(var426 >> 14 & 0x3FFF, var426 & 0x3FFF);
                            if (var427 == null) {
                                field5604[var2++] = -1;
                            } else {
                                field5604[var2++] = var427.field5103;
                            }
                            continue;
                        }
                        if (var625 == 5207) {
                            var2--;
                            class341 var428 = class223.method1353(field5604[var2]);
                            if (var428 != null && var428.field5091 != null) {
                                field5608[var3++] = var428.field5091;
                                continue;
                            }
                            field5608[var3++] = "";
                            continue;
                        }
                        if (var625 == 5208) {
                            field5604[var2++] = class217.field3301;
                            field5604[var2++] = class176.field2678;
                            continue;
                        }
                        if (var625 == 5209) {
                            field5604[var2++] = class295.field4480 + class223.field3394;
                            field5604[var2++] = class223.field3405 + class217.field3305;
                            continue;
                        }
                        if (var625 == 5210) {
                            var2--;
                            int var429 = field5604[var2];
                            class341 var430 = class223.method1353(var429);
                            if (var430 == null) {
                                field5604[var2++] = 0;
                                field5604[var2++] = 0;
                            } else {
                                field5604[var2++] = var430.field5099 >> 14 & 0x3FFF;
                                field5604[var2++] = var430.field5099 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var625 == 5211) {
                            var2--;
                            int var431 = field5604[var2];
                            class341 var432 = class223.method1353(var431);
                            if (var432 == null) {
                                field5604[var2++] = 0;
                                field5604[var2++] = 0;
                            } else {
                                field5604[var2++] = var432.field5112 - var432.field5092;
                                field5604[var2++] = var432.field5101 - var432.field5102;
                            }
                            continue;
                        }
                        if (var625 == 5212) {
                            class227 var433 = class407.method2555(-113);
                            if (var433 == null) {
                                field5604[var2++] = -1;
                                field5604[var2++] = -1;
                            } else {
                                field5604[var2++] = var433.field3437;
                                int var434 = var433.field3435 << 28 | class223.field3394 + var433.field3442 << 14 | class223.field3405 + var433.field3434;
                                field5604[var2++] = var434;
                            }
                            continue;
                        }
                        if (var625 == 5213) {
                            class227 var435 = class99.method635(-12037);
                            if (var435 == null) {
                                field5604[var2++] = -1;
                                field5604[var2++] = -1;
                            } else {
                                field5604[var2++] = var435.field3437;
                                int var436 = var435.field3435 << 28 | class223.field3394 + var435.field3442 << 14 | class223.field3405 + var435.field3434;
                                field5604[var2++] = var436;
                            }
                            continue;
                        }
                        if (var625 == 5214) {
                            var2--;
                            int var437 = field5604[var2];
                            class341 var438 = class452.method2808(-76);
                            if (var438 != null) {
                                boolean var439 = var438.method2084(var437 >> 28 & 0x3, (byte) -114, var437 & 0x3FFF, var437 >> 14 & 0x3FFF, field5616);
                                if (var439) {
                                    class314.method1919(field5616[2], field5616[1], (byte) -29);
                                }
                            }
                            continue;
                        }
                        if (var625 == 5215) {
                            var2 -= 2;
                            int var440 = field5604[var2];
                            int var441 = field5604[var2 + 1];
                            class5 var442 = class223.method1360(var440 >> 14 & 0x3FFF, var440 & 0x3FFF);
                            boolean var443 = false;
                            for (class341 var444 = (class341) var442.method42(true); var444 != null; var444 = (class341) var442.method43(9)) {
                                if (var444.field5103 == var441) {
                                    var443 = true;
                                    break;
                                }
                            }
                            if (var443) {
                                field5604[var2++] = 1;
                            } else {
                                field5604[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 5218) {
                            var2--;
                            int var445 = field5604[var2];
                            class341 var446 = class223.method1353(var445);
                            if (var446 == null) {
                                field5604[var2++] = -1;
                            } else {
                                field5604[var2++] = var446.field5097;
                            }
                            continue;
                        }
                        if (var625 == 5220) {
                            field5604[var2++] = class425.field6248 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5221) {
                            var2--;
                            int var447 = field5604[var2];
                            class314.method1919(var447 & 0x3FFF, var447 >> 14 & 0x3FFF, (byte) -29);
                            continue;
                        }
                        if (var625 == 5222) {
                            class341 var448 = class452.method2808(-73);
                            if (var448 == null) {
                                field5604[var2++] = -1;
                                field5604[var2++] = -1;
                            } else {
                                boolean var449 = var448.method2086(field5616, class295.field4480 + class223.field3394, class223.field3405 + class217.field3305, -127);
                                if (var449) {
                                    field5604[var2++] = field5616[1];
                                    field5604[var2++] = field5616[2];
                                } else {
                                    field5604[var2++] = -1;
                                    field5604[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var625 == 5223) {
                            var2 -= 2;
                            int var450 = field5604[var2];
                            int var451 = field5604[var2 + 1];
                            class424.method2616(var450, false, var451 >> 14 & 0x3FFF, var451 & 0x3FFF, -78);
                            continue;
                        }
                        if (var625 == 5224) {
                            var2--;
                            int var452 = field5604[var2];
                            class341 var453 = class452.method2808(-123);
                            if (var453 == null) {
                                field5604[var2++] = -1;
                                field5604[var2++] = -1;
                            } else {
                                boolean var454 = var453.method2084(var452 >> 28 & 0x3, (byte) -114, var452 & 0x3FFF, var452 >> 14 & 0x3FFF, field5616);
                                if (var454) {
                                    field5604[var2++] = field5616[1];
                                    field5604[var2++] = field5616[2];
                                } else {
                                    field5604[var2++] = -1;
                                    field5604[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var625 == 5225) {
                            var2--;
                            int var455 = field5604[var2];
                            class341 var456 = class452.method2808(-110);
                            if (var456 == null) {
                                field5604[var2++] = -1;
                                field5604[var2++] = -1;
                            } else {
                                boolean var457 = var456.method2086(field5616, var455 >> 14 & 0x3FFF, var455 & 0x3FFF, -127);
                                if (var457) {
                                    field5604[var2++] = field5616[1];
                                    field5604[var2++] = field5616[2];
                                } else {
                                    field5604[var2++] = -1;
                                    field5604[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var625 == 5226) {
                            var2--;
                            class183.method1114(25105, field5604[var2]);
                            continue;
                        }
                        if (var625 == 5227) {
                            var2 -= 2;
                            int var458 = field5604[var2];
                            int var459 = field5604[var2 + 1];
                            class424.method2616(var458, true, var459 >> 14 & 0x3FFF, var459 & 0x3FFF, -69);
                            continue;
                        }
                        if (var625 == 5228) {
                            var2--;
                            class14.field175 = field5604[var2] == 1;
                            continue;
                        }
                        if (var625 == 5229) {
                            field5604[var2++] = class14.field175 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5230) {
                            var2--;
                            int var460 = field5604[var2];
                            class443.method2707(var460, 100948170);
                            continue;
                        }
                        if (var625 == 5231) {
                            var2 -= 2;
                            int var461 = field5604[var2];
                            boolean var462 = field5604[var2 + 1] == 1;
                            if (class387.field5720 == null) {
                                continue;
                            }
                            class97 var463 = class387.field5720.method2302((long) var461, 23576);
                            if (var463 != null && !var462) {
                                var463.method625((byte) -50);
                                continue;
                            }
                            if (var463 == null && var462) {
                                class97 var464 = new class97();
                                class387.field5720.method2301(58, var464, (long) var461);
                            }
                            continue;
                        }
                        if (var625 == 5232) {
                            var2--;
                            int var465 = field5604[var2];
                            if (class387.field5720 == null) {
                                field5604[var2++] = 0;
                            } else {
                                class97 var466 = class387.field5720.method2302((long) var465, 23576);
                                field5604[var2++] = var466 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var625 == 5233) {
                            var2 -= 2;
                            int var467 = field5604[var2];
                            boolean var468 = field5604[var2 + 1] == 1;
                            if (class160.field2208 == null) {
                                continue;
                            }
                            class97 var469 = class160.field2208.method2302((long) var467, 23576);
                            if (var469 != null && !var468) {
                                var469.method625((byte) -50);
                                continue;
                            }
                            if (var469 == null && var468) {
                                class97 var470 = new class97();
                                class160.field2208.method2301(27, var470, (long) var467);
                            }
                            continue;
                        }
                        if (var625 == 5234) {
                            var2--;
                            int var471 = field5604[var2];
                            if (class160.field2208 == null) {
                                field5604[var2++] = 0;
                            } else {
                                class97 var472 = class160.field2208.method2302((long) var471, 23576);
                                field5604[var2++] = var472 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var625 == 5235) {
                            field5604[var2++] = class223.field3379 == null ? -1 : class223.field3379.field5103;
                            continue;
                        }
                    } else if (var625 < 5400) {
                        if (var625 == 5300) {
                            var2 -= 2;
                            int var473 = field5604[var2];
                            int var474 = field5604[var2 + 1];
                            class446.method2757(var474, 3, var473, -4, false);
                            field5604[var2++] = class90.field1277 == null ? 0 : 1;
                            continue;
                        }
                        if (var625 == 5301) {
                            if (class90.field1277 != null) {
                                class446.method2757(-1, class376.field5479, -1, -4, false);
                            }
                            continue;
                        }
                        if (var625 == 5302) {
                            class411[] var475 = class52.method304(true);
                            field5604[var2++] = var475.length;
                            continue;
                        }
                        if (var625 == 5303) {
                            var2--;
                            int var476 = field5604[var2];
                            class411[] var477 = class52.method304(true);
                            field5604[var2++] = var477[var476].field6118;
                            field5604[var2++] = var477[var476].field6122;
                            continue;
                        }
                        if (var625 == 5305) {
                            int var478 = class57.field767;
                            int var479 = class243.field3646;
                            int var480 = -1;
                            class411[] var481 = class52.method304(true);
                            for (int var482 = 0; var482 < var481.length; var482++) {
                                class411 var483 = var481[var482];
                                if (var483.field6118 == var478 && var483.field6122 == var479) {
                                    var480 = var482;
                                    break;
                                }
                            }
                            field5604[var2++] = var480;
                            continue;
                        }
                        if (var625 == 5306) {
                            field5604[var2++] = class246.method1503((byte) -58);
                            continue;
                        }
                        if (var625 == 5307) {
                            var2--;
                            int var484 = field5604[var2];
                            if (var484 >= 1 && var484 <= 2) {
                                class446.method2757(-1, var484, -1, -4, false);
                            }
                            continue;
                        }
                        if (var625 == 5308) {
                            field5604[var2++] = class376.field5479;
                            continue;
                        }
                        if (var625 == 5309) {
                            var2--;
                            int var485 = field5604[var2];
                            if (var485 >= 1 && var485 <= 2) {
                                class376.field5479 = var485;
                                class36.method206(-18199, class79.field1043);
                            }
                            continue;
                        }
                    } else if (var625 < 5500) {
                        if (var625 == 5400) {
                            var3 -= 2;
                            String var486 = field5608[var3];
                            String var487 = field5608[var3 + 1];
                            var2--;
                            int var488 = field5604[var2];
                            field5609++;
                            class177.method1082(class114.field1508, 0);
                            class189.field2840.method2366(class386.method2384(-4580, var486) + class386.method2384(-4580, var487) + 1, true);
                            class189.field2840.method2375(-54, var486);
                            class189.field2840.method2375(113, var487);
                            class189.field2840.method2366(var488, true);
                            continue;
                        }
                        if (var625 == 5401) {
                            var2 -= 2;
                            class66.field858[field5604[var2]] = (short) class388.method2401(field5604[var2 + 1], (byte) -28);
                            class186.field2796.method1109(true);
                            class186.field2796.method1118(-95);
                            class42.method231((byte) 126);
                            class365.method2192(-1);
                            class141.method887((byte) -103);
                            continue;
                        }
                        if (var625 == 5405) {
                            var2 -= 2;
                            int var489 = field5604[var2];
                            int var490 = field5604[var2 + 1];
                            if (var489 >= 0 && var489 < 2) {
                                class402.field6005[var489] = new int[var490 << 1][4];
                            }
                            continue;
                        }
                        if (var625 == 5406) {
                            var2 -= 7;
                            int var491 = field5604[var2];
                            int var492 = field5604[var2 + 1] << 1;
                            int var493 = field5604[var2 + 2];
                            int var494 = field5604[var2 + 3];
                            int var495 = field5604[var2 + 4];
                            int var496 = field5604[var2 + 5];
                            int var497 = field5604[var2 + 6];
                            if (var491 >= 0 && var491 < 2 && class402.field6005[var491] != null && var492 >= 0 && var492 < class402.field6005[var491].length) {
                                class402.field6005[var491][var492] = new int[] { (var493 >> 14 & 0x3FFF) * 128, var494, (var493 & 0x3FFF) * 128, var497 };
                                class402.field6005[var491][var492 + 1] = new int[] { (var495 >> 14 & 0x3FFF) * 128, var496, (var495 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var625 == 5407) {
                            var2--;
                            int var498 = class402.field6005[field5604[var2]].length >> 1;
                            field5604[var2++] = var498;
                            continue;
                        }
                        if (var625 == 5411) {
                            if (class90.field1277 != null) {
                                class446.method2757(-1, class376.field5479, -1, -4, false);
                            }
                            if (class143.field1914 == null) {
                                String var499 = class355.field5247 == null ? class341.method2083(true) : class355.field5247;
                                class315.method1923(false, true, class79.field1043, var499, class405.field6032 == 1);
                            } else {
                                class5.method46((byte) -120);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var625 == 5419) {
                            String var500 = "";
                            if (class57.field751 != null) {
                                if (class57.field751.field3175 == null) {
                                    var500 = class289.method1790(class57.field751.field3177, (byte) 119);
                                } else {
                                    var500 = (String) class57.field751.field3175;
                                }
                            }
                            field5608[var3++] = var500;
                            continue;
                        }
                        if (var625 == 5420) {
                            field5604[var2++] = class239.field3584 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5421) {
                            if (class90.field1277 != null) {
                                class446.method2757(-1, class376.field5479, -1, -4, false);
                            }
                            var3--;
                            String var501 = field5608[var3];
                            var2--;
                            boolean var502 = field5604[var2] == 1;
                            String var503 = class341.method2083(true) + var501;
                            class315.method1923(var502, true, class79.field1043, var503, class405.field6032 == 1);
                            continue;
                        }
                        if (var625 == 5422) {
                            var3 -= 2;
                            String var504 = field5608[var3];
                            String var505 = field5608[var3 + 1];
                            var2--;
                            int var506 = field5604[var2];
                            if (var504.length() > 0) {
                                if (class26.field343 == null) {
                                    class26.field343 = new String[class298.field4506[class466.field6855.field6041]];
                                }
                                class26.field343[var506] = var504;
                            }
                            if (var505.length() > 0) {
                                if (class399.field5960 == null) {
                                    class399.field5960 = new String[class298.field4506[class466.field6855.field6041]];
                                }
                                class399.field5960[var506] = var505;
                            }
                            continue;
                        }
                        if (var625 == 5423) {
                            var3--;
                            System.out.println(field5608[var3]);
                            continue;
                        }
                        if (var625 == 5424) {
                            var2 -= 11;
                            class151.field2080 = field5604[var2];
                            class146.field2030 = field5604[var2 + 1];
                            class85.field1170 = field5604[var2 + 2];
                            class388.field5755 = field5604[var2 + 3];
                            class273.field4187 = field5604[var2 + 4];
                            class113.field1492 = field5604[var2 + 5];
                            class244.field3664 = field5604[var2 + 6];
                            class32.field414 = field5604[var2 + 7];
                            class201.field3030 = field5604[var2 + 8];
                            class456.field6768 = field5604[var2 + 9];
                            class424.field6239 = field5604[var2 + 10];
                            class427.field6274.method822(-47, class273.field4187);
                            class427.field6274.method822(-67, class113.field1492);
                            class427.field6274.method822(-70, class244.field3664);
                            class427.field6274.method822(-109, class32.field414);
                            class427.field6274.method822(-81, class201.field3030);
                            class183.field2754 = null;
                            class416.field6181 = null;
                            class430.field6314 = null;
                            class288.field4377 = null;
                            class85.field1126 = null;
                            class351.field5212 = null;
                            class99.field1362 = null;
                            class91.field1289 = null;
                            class338.field5046 = true;
                            continue;
                        }
                        if (var625 == 5425) {
                            class453.method2818(-1);
                            class338.field5046 = false;
                            continue;
                        }
                        if (var625 == 5426) {
                            var2 -= 2;
                            class57.field764 = field5604[var2];
                            class220.field3341 = field5604[var2 + 1];
                            continue;
                        }
                        if (var625 == 5427) {
                            var2 -= 2;
                            class19.field258 = field5604[var2 + 1];
                            continue;
                        }
                        if (var625 == 5428) {
                            var2 -= 2;
                            int var507 = field5604[var2];
                            int var508 = field5604[var2 + 1];
                            field5604[var2++] = class442.method2702((byte) 47, var507, var508) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5429) {
                            var3--;
                            class176.method1077(false, true, field5608[var3]);
                            continue;
                        }
                    } else if (var625 < 5600) {
                        if (var625 == 5500) {
                            var2 -= 4;
                            int var509 = field5604[var2];
                            int var510 = field5604[var2 + 1];
                            int var511 = field5604[var2 + 2];
                            int var512 = field5604[var2 + 3];
                            class150.method933((var509 & 0x3FFF) - class112.field1487, var512, false, (var509 >> 14 & 0x3FFF) - class17.field250, var511, var510, false);
                            continue;
                        }
                        if (var625 == 5501) {
                            var2 -= 4;
                            int var513 = field5604[var2];
                            int var514 = field5604[var2 + 1];
                            int var515 = field5604[var2 + 2];
                            int var516 = field5604[var2 + 3];
                            class275.method1707((var513 & 0x3FFF) - class112.field1487, var514, var515, -21223, var516, (var513 >> 14 & 0x3FFF) - class17.field250);
                            continue;
                        }
                        if (var625 == 5502) {
                            var2 -= 6;
                            int var517 = field5604[var2];
                            if (var517 >= 2) {
                                throw new RuntimeException();
                            }
                            class284.field4337 = var517;
                            int var518 = field5604[var2 + 1];
                            if (var518 + 1 >= class402.field6005[class284.field4337].length >> 1) {
                                throw new RuntimeException();
                            }
                            class411.field6120 = var518;
                            class262.field4012 = 0;
                            class205.field3074 = field5604[var2 + 2];
                            class134.field1775 = field5604[var2 + 3];
                            int var519 = field5604[var2 + 4];
                            if (var519 >= 2) {
                                throw new RuntimeException();
                            }
                            class391.field5769 = var519;
                            int var520 = field5604[var2 + 5];
                            if (var520 + 1 >= class402.field6005[class391.field5769].length >> 1) {
                                throw new RuntimeException();
                            }
                            class77.field1030 = var520;
                            class80.field1054 = 3;
                            continue;
                        }
                        if (var625 == 5503) {
                            class265.method1645((byte) 113);
                            continue;
                        }
                        if (var625 == 5504) {
                            var2 -= 2;
                            class271.method1685(99, 0, field5604[var2], field5604[var2 + 1]);
                            continue;
                        }
                        if (var625 == 5505) {
                            field5604[var2++] = (int) class188.field2811 >> 3;
                            continue;
                        }
                        if (var625 == 5506) {
                            field5604[var2++] = (int) class462.field6810 >> 3;
                            continue;
                        }
                        if (var625 == 5507) {
                            class198.method1180(-16);
                            continue;
                        }
                        if (var625 == 5508) {
                            class189.method1150(0);
                            continue;
                        }
                        if (var625 == 5509) {
                            class292.method1806((byte) -110);
                            continue;
                        }
                        if (var625 == 5510) {
                            class291.method1802((byte) 124);
                            continue;
                        }
                        if (var625 == 5511) {
                            var2--;
                            int var521 = field5604[var2];
                            int var522 = var521 >> 14 & 0x3FFF;
                            int var523 = var521 & 0x3FFF;
                            int var524 = var522 - class17.field250;
                            if (var524 < 0) {
                                var524 = 0;
                            } else if (var524 >= class115.field1522) {
                                var524 = class115.field1522;
                            }
                            int var525 = var523 - class112.field1487;
                            if (var525 < 0) {
                                var525 = 0;
                            } else if (var525 >= class198.field3004) {
                                var525 = class198.field3004;
                            }
                            class331.field4950 = var524 * 128 + 64;
                            class155.field2138 = var525 * 128 + 64;
                            class80.field1054 = 4;
                            continue;
                        }
                        if (var625 == 5512) {
                            class77.method506(true);
                            continue;
                        }
                    } else if (var625 < 5700) {
                        if (var625 == 5600) {
                            var3 -= 2;
                            String var526 = field5608[var3];
                            String var527 = field5608[var3 + 1];
                            var2--;
                            int var528 = field5604[var2];
                            if (class19.field263 == 10 && class74.field998 == 0 && class6.field67 == 0 && class426.field6269 == 0 && class103.field1403 == 0) {
                                class388.method2397(var527, 0, var526, var528);
                            }
                            continue;
                        }
                        if (var625 == 5601) {
                            class188.method1140(-5213);
                            continue;
                        }
                        if (var625 == 5602) {
                            if (class6.field67 == 0) {
                                class298.field4511 = -2;
                            }
                            continue;
                        }
                        if (var625 == 5603) {
                            var2 -= 4;
                            if (class19.field263 == 10 && class74.field998 == 0 && class6.field67 == 0 && class426.field6269 == 0 && class103.field1403 == 0) {
                                class189.method1149(field5604[var2 + 2], field5604[var2], field5604[var2 + 1], -3, field5604[var2 + 3]);
                            }
                            continue;
                        }
                        if (var625 == 5604) {
                            var3--;
                            if (class19.field263 == 10 && class74.field998 == 0 && class6.field67 == 0 && class426.field6269 == 0 && class103.field1403 == 0) {
                                class167.method1011(false, class55.method317(field5608[var3], (byte) 51));
                            }
                            continue;
                        }
                        if (var625 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class19.field263 == 10 && class74.field998 == 0 && class6.field67 == 0 && class426.field6269 == 0 && class103.field1403 == 0) {
                                class456.method2833(field5608[var3 + 1], field5604[var2 + 1], (byte) 100, field5608[var3 + 2], field5604[var2 + 5] == 1, field5604[var2 + 3], field5604[var2 + 4] == 1, class55.method317(field5608[var3], (byte) 51), field5604[var2], field5604[var2 + 6] == 1, field5604[var2 + 2]);
                            }
                            continue;
                        }
                        if (var625 == 5606) {
                            if (class426.field6269 == 0) {
                                class98.field1353 = -2;
                            }
                            continue;
                        }
                        if (var625 == 5607) {
                            field5604[var2++] = class298.field4511;
                            continue;
                        }
                        if (var625 == 5608) {
                            field5604[var2++] = class19.field259;
                            continue;
                        }
                        if (var625 == 5609) {
                            field5604[var2++] = class98.field1353;
                            continue;
                        }
                        if (var625 == 5610) {
                            for (int var529 = 0; var529 < 5; var529++) {
                                field5608[var3++] = class372.field5431.length > var529 ? class183.method1112(class372.field5431[var529], (byte) 92) : "";
                            }
                            class372.field5431 = null;
                            continue;
                        }
                        if (var625 == 5611) {
                            field5604[var2++] = class109.field1442;
                            continue;
                        }
                    } else if (var625 < 6100) {
                        if (var625 == 6001) {
                            var2--;
                            int var530 = field5604[var2];
                            if (var530 < 1) {
                                var530 = 1;
                            }
                            if (var530 > 4) {
                                var530 = 4;
                            }
                            class105.field1410 = var530;
                            class42.method244(false);
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6002) {
                            var2--;
                            class341.method2080(-59, field5604[var2] == 1);
                            class442.method2705(21);
                            class42.method244(false);
                            class184.method1124((byte) 45);
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6003) {
                            var2--;
                            class213.field3198 = field5604[var2] == 1;
                            class184.method1124((byte) 98);
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6005) {
                            var2--;
                            class345.field5157 = field5604[var2] == 1;
                            class42.method244(false);
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6006) {
                            var2--;
                            class39.field477 = field5604[var2] == 1;
                            class196.field2965.method412(!class39.field477);
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6007) {
                            var2--;
                            class452.field6683 = field5604[var2];
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6008) {
                            var2--;
                            class424.field6237 = field5604[var2] == 1;
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6009) {
                            var2--;
                            class151.field2090 = field5604[var2] == 1;
                            class42.method244(false);
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6010) {
                            var2--;
                            class52.field684 = field5604[var2] == 1;
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6011) {
                            var2--;
                            int var531 = field5604[var2];
                            if (var531 < 0 || var531 > 2) {
                                var531 = 0;
                            }
                            class97.field1334 = var531;
                            class42.method244(false);
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6012) {
                            var2--;
                            class451.field6650 = field5604[var2] == 1;
                            class163.method983(28);
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6014) {
                            var2--;
                            class244.field3651 = field5604[var2] == 1;
                            class42.method244(false);
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6015) {
                            var2--;
                            class431.field6332 = field5604[var2] == 1;
                            class42.method244(false);
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6016) {
                            var2--;
                            int var532 = field5604[var2];
                            if (var532 < 0 || var532 > 2) {
                                var532 = 0;
                            }
                            class287.field4376 = var532;
                            class341.method2087(-97);
                            class36.method206(-18199, class79.field1043);
                            continue;
                        }
                        if (var625 == 6017) {
                            var2--;
                            class1.field12 = field5604[var2] == 1;
                            class278.method1723(1572);
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6018) {
                            var2--;
                            int var533 = field5604[var2];
                            if (var533 < 0) {
                                var533 = 0;
                            }
                            if (var533 > 127) {
                                var533 = 127;
                            }
                            class465.field6842 = var533;
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6019) {
                            var2--;
                            int var534 = field5604[var2];
                            if (var534 < 0) {
                                var534 = 0;
                            }
                            if (var534 > 255) {
                                var534 = 255;
                            }
                            if (class438.field6450 != var534) {
                                if (class438.field6450 == 0 && class195.field2944 != -1) {
                                    class250.method1523(class195.field2944, 0, class298.field4505, false, 179, var534);
                                    class437.field6428 = false;
                                } else if (var534 == 0) {
                                    class39.method225((byte) -125);
                                    class437.field6428 = false;
                                } else {
                                    class379.method2287((byte) 123, var534);
                                }
                                class438.field6450 = var534;
                            }
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6020) {
                            var2--;
                            int var535 = field5604[var2];
                            if (var535 < 0) {
                                var535 = 0;
                            }
                            if (var535 > 127) {
                                var535 = 127;
                            }
                            client.field6666 = var535;
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6021) {
                            var2--;
                            class80.field1058 = field5604[var2] == 1;
                            class184.method1124((byte) 116);
                            continue;
                        }
                        if (var625 == 6023) {
                            var2--;
                            int var536 = field5604[var2];
                            boolean var537 = false;
                            if (var536 < 0) {
                                var536 = 0;
                            }
                            if (var536 > 2) {
                                var536 = 2;
                            }
                            if (class229.field3504 < 96) {
                                var536 = 0;
                                var537 = true;
                            }
                            class133.method803(var536, -12131);
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            field5604[var2++] = var537 ? 0 : 1;
                            continue;
                        }
                        if (var625 == 6024) {
                            var2--;
                            int var538 = field5604[var2];
                            if (var538 < 0 || var538 > 2) {
                                var538 = 0;
                            }
                            class95.field1324 = var538;
                            class36.method206(-18199, class79.field1043);
                            continue;
                        }
                        if (var625 == 6025) {
                            var2--;
                            int var539 = field5604[var2];
                            if (var539 < 0 || var539 > class258.method1602((byte) 46, class229.field3504)) {
                                var539 = 0;
                            }
                            class109.field1445 = var539;
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6027) {
                            var2--;
                            int var540 = field5604[var2];
                            if (var540 < 0 || var540 > 1) {
                                var540 = 0;
                            }
                            class42.method248(1, var540 == 1);
                            continue;
                        }
                        if (var625 == 6028) {
                            var2--;
                            class15.field188 = field5604[var2] != 0;
                            class36.method206(-18199, class79.field1043);
                            continue;
                        }
                        if (var625 == 6029) {
                            var2--;
                            class452.field6683 = field5604[var2];
                            class36.method206(-18199, class79.field1043);
                            continue;
                        }
                        if (var625 == 6030) {
                            var2--;
                            class341.field5111 = field5604[var2] != 0;
                            class36.method206(-18199, class79.field1043);
                            class42.method244(false);
                            continue;
                        }
                        if (var625 == 6031) {
                            var2--;
                            int var541 = field5604[var2];
                            if (var541 < 0 || var541 > 3) {
                                var541 = 2;
                            }
                            class388.method2399(true, var541);
                            continue;
                        }
                        if (var625 == 6032) {
                            var2--;
                            int var542 = field5604[var2];
                            if (var542 < 0 || var542 > 3) {
                                var542 = 2;
                            }
                            class14.field176 = var542;
                            class36.method206(-18199, class79.field1043);
                            class57.field768 = false;
                            continue;
                        }
                        if (var625 == 6033) {
                            var2--;
                            int var543 = field5604[var2];
                            if (var543 < 0 || var543 > 4) {
                                var543 = 2;
                            }
                            class350.field5205 = var543;
                            class36.method206(-18199, class79.field1043);
                            continue;
                        }
                    } else if (var625 < 6200) {
                        if (var625 == 6101) {
                            field5604[var2++] = class105.field1410;
                            continue;
                        }
                        if (var625 == 6102) {
                            field5604[var2++] = class360.method2172(115) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6103) {
                            field5604[var2++] = class213.field3198 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6105) {
                            field5604[var2++] = class345.field5157 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6106) {
                            field5604[var2++] = class39.field477 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6107) {
                            field5604[var2++] = class452.field6683;
                            continue;
                        }
                        if (var625 == 6108) {
                            field5604[var2++] = class424.field6237 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6109) {
                            field5604[var2++] = class151.field2090 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6110) {
                            field5604[var2++] = class52.field684 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6111) {
                            field5604[var2++] = class97.field1334;
                            continue;
                        }
                        if (var625 == 6112) {
                            field5604[var2++] = class451.field6650 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6114) {
                            field5604[var2++] = class244.field3651 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6115) {
                            field5604[var2++] = class431.field6332 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6116) {
                            field5604[var2++] = class287.field4376;
                            continue;
                        }
                        if (var625 == 6117) {
                            field5604[var2++] = class1.field12 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6118) {
                            field5604[var2++] = class465.field6842;
                            continue;
                        }
                        if (var625 == 6119) {
                            field5604[var2++] = class438.field6450;
                            continue;
                        }
                        if (var625 == 6120) {
                            field5604[var2++] = client.field6666;
                            continue;
                        }
                        if (var625 == 6121) {
                            field5604[var2++] = class196.field2965.method384() ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6123) {
                            field5604[var2++] = class390.method2405(-13794);
                            continue;
                        }
                        if (var625 == 6124) {
                            field5604[var2++] = class95.field1324;
                            continue;
                        }
                        if (var625 == 6125) {
                            field5604[var2++] = class109.field1445;
                            continue;
                        }
                        if (var625 == 6126) {
                            field5604[var2++] = class196.field2965.method400() ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6127) {
                            field5604[var2++] = class289.field4391 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6128) {
                            field5604[var2++] = class15.field188 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6129) {
                            field5604[var2++] = class452.field6683;
                            continue;
                        }
                        if (var625 == 6130) {
                            field5604[var2++] = class341.field5111 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6131) {
                            field5604[var2++] = class405.field6032;
                            continue;
                        }
                        if (var625 == 6132) {
                            field5604[var2++] = class14.field176;
                            continue;
                        }
                        if (var625 == 6133) {
                            field5604[var2++] = class239.field3584 == 1 || class239.field3584 == 4 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6134) {
                            field5604[var2++] = class258.method1602((byte) 119, class229.field3504);
                            continue;
                        }
                        if (var625 == 6135) {
                            field5604[var2++] = class350.field5205;
                            continue;
                        }
                    } else if (var625 < 6300) {
                        if (var625 == 6200) {
                            var2 -= 2;
                            class450.field6618 = (short) field5604[var2];
                            if (class450.field6618 <= 0) {
                                class450.field6618 = 256;
                            }
                            class114.field1512 = (short) field5604[var2 + 1];
                            if (class114.field1512 <= 0) {
                                class114.field1512 = 205;
                            }
                            continue;
                        }
                        if (var625 == 6201) {
                            var2 -= 2;
                            class385.field5672 = (short) field5604[var2];
                            if (class385.field5672 <= 0) {
                                class385.field5672 = 256;
                            }
                            class198.field3006 = (short) field5604[var2 + 1];
                            if (class198.field3006 <= 0) {
                                class198.field3006 = 320;
                            }
                            continue;
                        }
                        if (var625 == 6202) {
                            var2 -= 4;
                            class314.field4761 = (short) field5604[var2];
                            if (class314.field4761 <= 0) {
                                class314.field4761 = 1;
                            }
                            class454.field6745 = (short) field5604[var2 + 1];
                            if (class454.field6745 <= 0) {
                                class454.field6745 = 32767;
                            } else if (class454.field6745 < class314.field4761) {
                                class454.field6745 = class314.field4761;
                            }
                            class107.field1428 = (short) field5604[var2 + 2];
                            if (class107.field1428 <= 0) {
                                class107.field1428 = 1;
                            }
                            class455.field6760 = (short) field5604[var2 + 3];
                            if (class455.field6760 <= 0) {
                                class455.field6760 = 32767;
                            } else if (class455.field6760 < class107.field1428) {
                                class455.field6760 = class107.field1428;
                            }
                            continue;
                        }
                        if (var625 == 6203) {
                            class294.method1829(false, 117, 0, 0, client.field6676.field2561, client.field6676.field2501);
                            field5604[var2++] = class177.field2687;
                            field5604[var2++] = class272.field4165;
                            continue;
                        }
                        if (var625 == 6204) {
                            field5604[var2++] = class385.field5672;
                            field5604[var2++] = class198.field3006;
                            continue;
                        }
                        if (var625 == 6205) {
                            field5604[var2++] = class450.field6618;
                            field5604[var2++] = class114.field1512;
                            continue;
                        }
                    } else if (var625 < 6400) {
                        if (var625 == 6300) {
                            field5604[var2++] = (int) (class445.method2750(-27580) / 60000L);
                            continue;
                        }
                        if (var625 == 6301) {
                            field5604[var2++] = (int) (class445.method2750(-27580) / 86400000L) - 11745;
                            continue;
                        }
                        if (var625 == 6302) {
                            var2 -= 3;
                            int var544 = field5604[var2];
                            int var545 = field5604[var2 + 1];
                            int var546 = field5604[var2 + 2];
                            field5612.clear();
                            field5612.set(11, 12);
                            field5612.set(var546, var545, var544);
                            field5604[var2++] = (int) (field5612.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var625 == 6303) {
                            field5612.clear();
                            field5612.setTime(new Date(class445.method2750(-27580)));
                            field5604[var2++] = field5612.get(1);
                            continue;
                        }
                        if (var625 == 6304) {
                            var2--;
                            int var547 = field5604[var2];
                            boolean var548 = true;
                            if (var547 < 0) {
                                var548 = (var547 + 1) % 4 == 0;
                            } else if (var547 < 1582) {
                                var548 = var547 % 4 == 0;
                            } else if (var547 % 4 != 0) {
                                var548 = false;
                            } else if (var547 % 100 != 0) {
                                var548 = true;
                            } else if (var547 % 400 != 0) {
                                var548 = false;
                            }
                            field5604[var2++] = var548 ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 6500) {
                        if (var625 == 6405) {
                            field5604[var2++] = class357.method2145(1) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6406) {
                            field5604[var2++] = class138.method876(-10689) ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 6600) {
                        if (var625 == 6500) {
                            if (class19.field263 == 10 && class74.field998 == 0 && class6.field67 == 0 && class426.field6269 == 0) {
                                field5604[var2++] = class153.method942((byte) -70) == -1 ? 0 : 1;
                                continue;
                            }
                            field5604[var2++] = 1;
                            continue;
                        }
                        if (var625 == 6501) {
                            class432 var549 = class132.method781(30011);
                            if (var549 == null) {
                                field5604[var2++] = -1;
                                field5604[var2++] = 0;
                                field5608[var3++] = "";
                                field5604[var2++] = 0;
                                field5608[var3++] = "";
                                field5604[var2++] = 0;
                                field5604[var2++] = 0;
                            } else {
                                field5604[var2++] = var549.field6335;
                                field5604[var2++] = var549.field5117;
                                field5608[var3++] = var549.field6337;
                                class19 var550 = var549.method2650(Integer.MIN_VALUE);
                                field5604[var2++] = var550.field255;
                                field5608[var3++] = var550.field256;
                                field5604[var2++] = var549.field5120;
                                field5604[var2++] = var549.field6341;
                            }
                            continue;
                        }
                        if (var625 == 6502) {
                            class432 var551 = class187.method1136(27459);
                            if (var551 == null) {
                                field5604[var2++] = -1;
                                field5604[var2++] = 0;
                                field5608[var3++] = "";
                                field5604[var2++] = 0;
                                field5608[var3++] = "";
                                field5604[var2++] = 0;
                                field5604[var2++] = 0;
                            } else {
                                field5604[var2++] = var551.field6335;
                                field5604[var2++] = var551.field5117;
                                field5608[var3++] = var551.field6337;
                                class19 var552 = var551.method2650(Integer.MIN_VALUE);
                                field5604[var2++] = var552.field255;
                                field5608[var3++] = var552.field256;
                                field5604[var2++] = var551.field5120;
                                field5604[var2++] = var551.field6341;
                            }
                            continue;
                        }
                        if (var625 == 6503) {
                            var2--;
                            int var553 = field5604[var2];
                            if (class19.field263 == 10 && class74.field998 == 0 && class6.field67 == 0 && class426.field6269 == 0) {
                                field5604[var2++] = class238.method1434(var553, 23730) ? 1 : 0;
                                continue;
                            }
                            field5604[var2++] = 0;
                            continue;
                        }
                        if (var625 == 6504) {
                            var2--;
                            class439.field6455 = field5604[var2];
                            class36.method206(-18199, class79.field1043);
                            continue;
                        }
                        if (var625 == 6505) {
                            field5604[var2++] = class439.field6455;
                            continue;
                        }
                        if (var625 == 6506) {
                            var2--;
                            int var554 = field5604[var2];
                            class432 var555 = class137.method857(32368, var554);
                            if (var555 == null) {
                                field5604[var2++] = -1;
                                field5608[var3++] = "";
                                field5604[var2++] = 0;
                                field5608[var3++] = "";
                                field5604[var2++] = 0;
                                field5604[var2++] = 0;
                            } else {
                                field5604[var2++] = var555.field5117;
                                field5608[var3++] = var555.field6337;
                                class19 var556 = var555.method2650(Integer.MIN_VALUE);
                                field5604[var2++] = var556.field255;
                                field5608[var3++] = var556.field256;
                                field5604[var2++] = var555.field5120;
                                field5604[var2++] = var555.field6341;
                            }
                            continue;
                        }
                        if (var625 == 6507) {
                            var2 -= 4;
                            int var557 = field5604[var2];
                            boolean var558 = field5604[var2 + 1] == 1;
                            int var559 = field5604[var2 + 2];
                            boolean var560 = field5604[var2 + 3] == 1;
                            class26.method159(var558, var560, var559, (byte) -100, var557);
                            continue;
                        }
                        if (var625 == 6508) {
                            class367.method2206((byte) -81);
                            continue;
                        }
                        if (var625 == 6509) {
                            if (class19.field263 == 10) {
                                var2--;
                                class28.field364 = field5604[var2] == 1;
                            }
                            continue;
                        }
                    } else if (var625 < 6700) {
                        if (var625 == 6600) {
                            var2--;
                            class212.field3193 = field5604[var2] == 1;
                            class36.method206(-18199, class79.field1043);
                            continue;
                        }
                        if (var625 == 6601) {
                            field5604[var2++] = class212.field3193 ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 6800 && class265.field4046 == 2) {
                        if (var625 == 6700) {
                            int var561 = class308.field4647.method2305(-127);
                            if (class6.field69 != -1) {
                                var561++;
                            }
                            field5604[var2++] = var561;
                            continue;
                        }
                        if (var625 == 6701) {
                            var2--;
                            int var562 = field5604[var2];
                            if (class6.field69 != -1) {
                                if (var562 == 0) {
                                    field5604[var2++] = class6.field69;
                                    continue;
                                }
                                var562--;
                            }
                            class333 var563 = (class333) class308.field4647.method2296(5773);
                            while (var562-- > 0) {
                                var563 = (class333) class308.field4647.method2304(100);
                            }
                            field5604[var2++] = var563.field4965;
                            continue;
                        }
                        if (var625 == 6702) {
                            var2--;
                            int var564 = field5604[var2];
                            if (class130.field1650[var564] == null) {
                                field5608[var3++] = "";
                            } else {
                                String var565 = class130.field1650[var564][0].field2495;
                                if (var565 == null) {
                                    field5608[var3++] = "";
                                } else {
                                    field5608[var3++] = var565.substring(0, var565.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var625 == 6703) {
                            var2--;
                            int var566 = field5604[var2];
                            if (class130.field1650[var566] == null) {
                                field5604[var2++] = 0;
                            } else {
                                field5604[var2++] = class130.field1650[var566].length;
                            }
                            continue;
                        }
                        if (var625 == 6704) {
                            var2 -= 2;
                            int var567 = field5604[var2];
                            int var568 = field5604[var2 + 1];
                            if (class130.field1650[var567] == null) {
                                field5608[var3++] = "";
                            } else {
                                String var569 = class130.field1650[var567][var568].field2495;
                                if (var569 == null) {
                                    field5608[var3++] = "";
                                } else {
                                    field5608[var3++] = var569;
                                }
                            }
                            continue;
                        }
                        if (var625 == 6705) {
                            var2 -= 2;
                            int var570 = field5604[var2];
                            int var571 = field5604[var2 + 1];
                            if (class130.field1650[var570] == null) {
                                field5604[var2++] = 0;
                            } else {
                                field5604[var2++] = class130.field1650[var570][var571].field2541;
                            }
                            continue;
                        }
                        if (var625 == 6706) {
                            continue;
                        }
                        if (var625 == 6707) {
                            var2 -= 3;
                            int var572 = field5604[var2];
                            int var573 = field5604[var2 + 1];
                            int var574 = field5604[var2 + 2];
                            class427.method2631("", false, var574, 1, var572 << 16 | var573);
                            continue;
                        }
                        if (var625 == 6708) {
                            var2 -= 3;
                            int var575 = field5604[var2];
                            int var576 = field5604[var2 + 1];
                            int var577 = field5604[var2 + 2];
                            class427.method2631("", false, var577, 2, var575 << 16 | var576);
                            continue;
                        }
                        if (var625 == 6709) {
                            var2 -= 3;
                            int var578 = field5604[var2];
                            int var579 = field5604[var2 + 1];
                            int var580 = field5604[var2 + 2];
                            class427.method2631("", false, var580, 3, var578 << 16 | var579);
                            continue;
                        }
                        if (var625 == 6710) {
                            var2 -= 3;
                            int var581 = field5604[var2];
                            int var582 = field5604[var2 + 1];
                            int var583 = field5604[var2 + 2];
                            class427.method2631("", false, var583, 4, var581 << 16 | var582);
                            continue;
                        }
                        if (var625 == 6711) {
                            var2 -= 3;
                            int var584 = field5604[var2];
                            int var585 = field5604[var2 + 1];
                            int var586 = field5604[var2 + 2];
                            class427.method2631("", false, var586, 5, var584 << 16 | var585);
                            continue;
                        }
                        if (var625 == 6712) {
                            var2 -= 3;
                            int var587 = field5604[var2];
                            int var588 = field5604[var2 + 1];
                            int var589 = field5604[var2 + 2];
                            class427.method2631("", false, var589, 6, var587 << 16 | var588);
                            continue;
                        }
                        if (var625 == 6713) {
                            var2 -= 3;
                            int var590 = field5604[var2];
                            int var591 = field5604[var2 + 1];
                            int var592 = field5604[var2 + 2];
                            class427.method2631("", false, var592, 7, var590 << 16 | var591);
                            continue;
                        }
                        if (var625 == 6714) {
                            var2 -= 3;
                            int var593 = field5604[var2];
                            int var594 = field5604[var2 + 1];
                            int var595 = field5604[var2 + 2];
                            class427.method2631("", false, var595, 8, var593 << 16 | var594);
                            continue;
                        }
                        if (var625 == 6715) {
                            var2 -= 3;
                            int var596 = field5604[var2];
                            int var597 = field5604[var2 + 1];
                            int var598 = field5604[var2 + 2];
                            class427.method2631("", false, var598, 9, var596 << 16 | var597);
                            continue;
                        }
                        if (var625 == 6716) {
                            var2 -= 3;
                            int var599 = field5604[var2];
                            int var600 = field5604[var2 + 1];
                            int var601 = field5604[var2 + 2];
                            class427.method2631("", false, var601, 10, var599 << 16 | var600);
                            continue;
                        }
                        if (var625 == 6717) {
                            var2 -= 3;
                            int var602 = field5604[var2];
                            int var603 = field5604[var2 + 1];
                            int var604 = field5604[var2 + 2];
                            class170 var605 = class455.method2827(var604, false, var602 << 16 | var603);
                            class284.method1746(-1);
                            class312 var606 = client.method2796(var605);
                            class149.method928(29, var606.method1903(5), var602 << 16 | var603, var604, var606.field4687, var605.field2499, var605.field2477);
                            continue;
                        }
                    } else if (var625 < 6900) {
                        if (var625 == 6800) {
                            var2--;
                            int var607 = field5604[var2];
                            class228 var608 = class20.method125(var607, 36);
                            if (var608.field3489 == null) {
                                field5608[var3++] = "";
                            } else {
                                field5608[var3++] = var608.field3489;
                            }
                            continue;
                        }
                        if (var625 == 6801) {
                            var2--;
                            int var609 = field5604[var2];
                            class228 var610 = class20.method125(var609, 36);
                            field5604[var2++] = var610.field3454;
                            continue;
                        }
                        if (var625 == 6802) {
                            var2--;
                            int var611 = field5604[var2];
                            class228 var612 = class20.method125(var611, 36);
                            field5604[var2++] = var612.field3463;
                            continue;
                        }
                        if (var625 == 6803) {
                            var2--;
                            int var613 = field5604[var2];
                            class228 var614 = class20.method125(var613, 36);
                            field5604[var2++] = var614.field3487;
                            continue;
                        }
                        if (var625 == 6804) {
                            var2 -= 2;
                            int var615 = field5604[var2];
                            int var616 = field5604[var2 + 1];
                            class15 var617 = class19.method123(var616, (byte) -72);
                            if (var617.method91((byte) 102)) {
                                field5608[var3++] = class20.method125(var615, 36).method1384(var616, 131072, var617.field182);
                            } else {
                                field5604[var2++] = class20.method125(var615, 36).method1383(var616, 1, var617.field186);
                            }
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var624) {
            if (arg0.field3025 == null) {
                StringBuffer var622 = new StringBuffer(30);
                var622.append("CS2: ").append(arg0.field1339).append(" ");
                for (int var623 = field5592 - 1; var623 >= 0; var623--) {
                    var622.append("v: ").append(field5591[var623].field2654.field1339).append(" ");
                }
                var622.append("op: ").append(var7);
                class288.method1783(var622.toString(), var624, -51);
            } else {
                class149.method932("Clientscript error in: " + arg0.field3025, 2688);
                StringBuffer var619 = new StringBuffer(30);
                var619.append("Clientscript error in: ").append(arg0.field3025).append("\n");
                for (int var620 = field5592 - 1; var620 >= 0; var620--) {
                    var619.append("via: ").append(field5591[var620].field2654.field3025).append("\n");
                }
                var619.append("Op: ").append(var7).append("\n");
                String var621 = var624.getMessage();
                if (var621 != null && var621.length() > 0) {
                    var619.append("Message: ").append(var621).append("\n");
                }
                class288.method1783(var619.toString(), var624, 4);
                class141.method886(-1, var619.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lte;)V")
    public static final void method2316(class327 arg0) {
        method2313(arg0, 200000);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "()V")
    public static void method2317() {
        field5594 = null;
        field5595 = null;
        field5613 = null;
        field5597 = null;
        field5604 = null;
        field5608 = null;
        field5591 = null;
        field5606 = null;
        field5605 = null;
        field5607 = null;
        field5612 = null;
        field5615 = null;
        field5616 = null;
        field5614 = null;
    }
}
