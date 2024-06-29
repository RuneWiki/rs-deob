import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class477 {

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "[Lrc;")
    private static class19[] field6683 = new class19[50];

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "[I")
    private static int[] field6679 = new int[1000];

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    private static int field6682 = 0;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "[[I")
    private static int[][] field6681 = new int[5][5000];

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "[Ljava/lang/String;")
    private static String[] field6688 = new String[1000];

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "[I")
    private static int[] field6693 = new int[5];

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "Ljava/util/Calendar;")
    private static Calendar field6696 = Calendar.getInstance();

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "[Ljava/lang/String;")
    private static String[] field6702 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "[I")
    private static int[] field6701 = new int[3];

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "Ltl;")
    public static class400 field6703 = new class400(4);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "Lje;")
    private static class178 field6692;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "Lje;")
    private static class178 field6695;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "Lod;")
    private static class436 field6698;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "[I")
    private static int[] field6687;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "[Ljava/lang/String;")
    private static String[] field6685;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lbu;I)V")
    private static final void method2790(class99 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field1411;
        int[] var6 = arg0.field1415;
        byte var7 = -1;
        field6682 = 0;
        try {
            int var8 = 0;
            label4425: while (true) {
                var8++;
                if (var8 > arg1) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var616 = var5[var4];
                int var10001;
                if (var616 < 100) {
                    if (var616 == 0) {
                        field6679[var2++] = var6[var4];
                        continue;
                    }
                    if (var616 == 1) {
                        int var9 = var6[var4];
                        field6679[var2++] = class315.field4736.field62[var9];
                        continue;
                    }
                    if (var616 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class315.field4736.method18(field6679[var2], (byte) 47, var10);
                        continue;
                    }
                    if (var616 == 3) {
                        field6688[var3++] = arg0.field1408[var4];
                        continue;
                    }
                    if (var616 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var616 == 7) {
                        var2 -= 2;
                        if (field6679[var2 + 1] != field6679[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var616 == 8) {
                        var2 -= 2;
                        if (field6679[var2 + 1] == field6679[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var616 == 9) {
                        var2 -= 2;
                        if (field6679[var2] < field6679[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var616 == 10) {
                        var2 -= 2;
                        if (field6679[var2] > field6679[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var616 == 21) {
                        if (field6682 == 0) {
                            return;
                        }
                        class19 var11 = field6683[--field6682];
                        arg0 = var11.field251;
                        var5 = arg0.field1411;
                        var6 = arg0.field1415;
                        var4 = var11.field247;
                        field6687 = var11.field248;
                        field6685 = var11.field250;
                        continue;
                    }
                    if (var616 == 25) {
                        int var12 = var6[var4];
                        field6679[var2++] = class315.field4736.method28(5, var12);
                        continue;
                    }
                    if (var616 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class315.field4736.method29(-18877, field6679[var2], var13);
                        continue;
                    }
                    if (var616 == 31) {
                        var2 -= 2;
                        if (field6679[var2] <= field6679[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var616 == 32) {
                        var2 -= 2;
                        if (field6679[var2] >= field6679[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var616 == 33) {
                        field6679[var2++] = field6687[var6[var4]];
                        continue;
                    }
                    if (var616 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field6687[var10001] = field6679[var2];
                        continue;
                    }
                    if (var616 == 35) {
                        field6688[var3++] = field6685[var6[var4]];
                        continue;
                    }
                    if (var616 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field6685[var10001] = field6688[var3];
                        continue;
                    }
                    if (var616 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class430.method2521(var14, var3, field6688, 55);
                        field6688[var3++] = var15;
                        continue;
                    }
                    if (var616 == 38) {
                        var2--;
                        continue;
                    }
                    if (var616 == 39) {
                        var3--;
                        continue;
                    }
                    if (var616 == 40) {
                        int var16 = var6[var4];
                        class99 var17 = class219.method1447(-122, var16);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field1402];
                        String[] var19 = new String[var17.field1401];
                        for (int var20 = 0; var20 < var17.field1413; var20++) {
                            var18[var20] = field6679[var2 + var20 - var17.field1413];
                        }
                        for (int var21 = 0; var21 < var17.field1407; var21++) {
                            var19[var21] = field6688[var3 + var21 - var17.field1407];
                        }
                        var2 -= var17.field1413;
                        var3 -= var17.field1407;
                        class19 var22 = new class19();
                        var22.field251 = arg0;
                        var22.field247 = var4;
                        var22.field248 = field6687;
                        var22.field250 = field6685;
                        if (field6682 >= field6683.length) {
                            throw new RuntimeException();
                        }
                        field6683[field6682++] = var22;
                        arg0 = var17;
                        var5 = var17.field1411;
                        var6 = var17.field1415;
                        var4 = -1;
                        field6687 = var18;
                        field6685 = var19;
                        continue;
                    }
                    if (var616 == 42) {
                        field6679[var2++] = class156.field2170[var6[var4]];
                        continue;
                    }
                    if (var616 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class156.field2170[var23] = field6679[var2];
                        class423.method2496(-128, var23);
                        class95.field1349 |= class12.field158[var23];
                        continue;
                    }
                    if (var616 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field6679[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field6693[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4425;
                                }
                                field6681[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var616 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field6679[var2];
                        if (var30 >= 0 && var30 < field6693[var29]) {
                            field6679[var2++] = field6681[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var616 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field6679[var2];
                        if (var32 >= 0 && var32 < field6693[var31]) {
                            field6681[var31][var32] = field6679[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var616 == 47) {
                        String var33 = class315.field4740[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field6688[var3++] = var33;
                        continue;
                    }
                    if (var616 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class315.field4740[var34] = field6688[var3];
                        class216.method1438(var34, 0);
                        continue;
                    }
                    if (var616 == 51) {
                        class371 var35 = arg0.field1416[var6[var4]];
                        var2--;
                        class145 var36 = (class145) var35.method2305((long) field6679[var2], (byte) 82);
                        if (var36 != null) {
                            var4 += var36.field2054;
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
                if (var616 < 300) {
                    if (var616 == 100) {
                        var2 -= 3;
                        int var38 = field6679[var2];
                        int var39 = field6679[var2 + 1];
                        int var40 = field6679[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class178 var41 = class493.method2885(var38, 65535);
                        if (var41.field2548 == null) {
                            var41.field2548 = new class178[var40 + 1];
                        }
                        if (var41.field2548.length <= var40) {
                            class178[] var42 = new class178[var40 + 1];
                            for (int var43 = 0; var43 < var41.field2548.length; var43++) {
                                var42[var43] = var41.field2548[var43];
                            }
                            var41.field2548 = var42;
                        }
                        if (var40 > 0 && var41.field2548[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class178 var44 = new class178();
                        var44.field2655 = var39;
                        var44.field2580 = var44.field2631 = var41.field2631;
                        var44.field2534 = var40;
                        var41.field2548[var40] = var44;
                        if (var37) {
                            field6695 = var44;
                        } else {
                            field6692 = var44;
                        }
                        class205.method1396(113, var41);
                        continue;
                    }
                    if (var616 == 101) {
                        class178 var45 = var37 ? field6695 : field6692;
                        if (var45.field2534 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class178 var46 = class493.method2885(var45.field2631, 65535);
                        var46.field2548[var45.field2534] = null;
                        class205.method1396(93, var46);
                        continue;
                    }
                    if (var616 == 102) {
                        var2--;
                        class178 var47 = class493.method2885(field6679[var2], 65535);
                        var47.field2548 = null;
                        class205.method1396(78, var47);
                        continue;
                    }
                    if (var616 == 200) {
                        var2 -= 2;
                        int var48 = field6679[var2];
                        int var49 = field6679[var2 + 1];
                        class178 var50 = class331.method2032(var48, var49, -1);
                        if (var50 != null && var49 != -1) {
                            field6679[var2++] = 1;
                            if (var37) {
                                field6695 = var50;
                            } else {
                                field6692 = var50;
                            }
                            continue;
                        }
                        field6679[var2++] = 0;
                        continue;
                    }
                    if (var616 == 201) {
                        var2--;
                        int var51 = field6679[var2];
                        class178 var52 = class493.method2885(var51, 65535);
                        if (var52 == null) {
                            field6679[var2++] = 0;
                        } else {
                            field6679[var2++] = 1;
                            if (var37) {
                                field6695 = var52;
                            } else {
                                field6692 = var52;
                            }
                        }
                        continue;
                    }
                    if (var616 == 202) {
                        var2--;
                        int var53 = field6679[var2];
                        method2791(var53);
                        continue;
                    }
                    if (var616 == 203) {
                        var2--;
                        int var54 = field6679[var2];
                        method2793(var54);
                        continue;
                    }
                } else if (var616 < 500) {
                    if (var616 == 403) {
                        var2 -= 2;
                        int var55 = field6679[var2];
                        int var56 = field6679[var2 + 1];
                        for (int var57 = 0; var57 < class83.field1178.length; var57++) {
                            if (class83.field1178[var57] == var55) {
                                class472.field6622.field3833.method2022(var57, true, var56, class158.field2197);
                                continue label4425;
                            }
                        }
                        int var58 = 0;
                        while (true) {
                            if (var58 >= class443.field6259.length) {
                                continue label4425;
                            }
                            if (class443.field6259[var58] == var55) {
                                class472.field6622.field3833.method2022(var58, true, var56, class158.field2197);
                                continue label4425;
                            }
                            var58++;
                        }
                    }
                    if (var616 == 404) {
                        var2 -= 2;
                        int var59 = field6679[var2];
                        int var60 = field6679[var2 + 1];
                        class472.field6622.field3833.method2028(var59, var60, 119);
                        continue;
                    }
                    if (var616 == 410) {
                        var2--;
                        boolean var61 = field6679[var2] != 0;
                        class472.field6622.field3833.method2018(var61, 31);
                        continue;
                    }
                } else if (var616 >= 1000 && var616 < 1100 || var616 >= 2000 && var616 < 2100) {
                    class178 var62;
                    if (var616 >= 2000) {
                        var616 -= 1000;
                        var2--;
                        var62 = class493.method2885(field6679[var2], 65535);
                    } else {
                        var62 = var37 ? field6695 : field6692;
                    }
                    if (var616 == 1000) {
                        var2 -= 4;
                        var62.field2518 = field6679[var2];
                        var62.field2615 = field6679[var2 + 1];
                        int var63 = field6679[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 5) {
                            var63 = 5;
                        }
                        int var64 = field6679[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 5) {
                            var64 = 5;
                        }
                        var62.field2581 = (byte) var63;
                        var62.field2579 = (byte) var64;
                        class205.method1396(76, var62);
                        class171.method1185(-84, var62);
                        if (var62.field2534 == -1) {
                            class446.method2601(-127, var62.field2631);
                        }
                        continue;
                    }
                    if (var616 == 1001) {
                        var2 -= 4;
                        var62.field2641 = field6679[var2];
                        var62.field2603 = field6679[var2 + 1];
                        var62.field2598 = 0;
                        var62.field2573 = 0;
                        int var65 = field6679[var2 + 2];
                        if (var65 < 0) {
                            var65 = 0;
                        } else if (var65 > 4) {
                            var65 = 4;
                        }
                        int var66 = field6679[var2 + 3];
                        if (var66 < 0) {
                            var66 = 0;
                        } else if (var66 > 4) {
                            var66 = 4;
                        }
                        var62.field2614 = (byte) var65;
                        var62.field2543 = (byte) var66;
                        class205.method1396(69, var62);
                        class171.method1185(-93, var62);
                        if (var62.field2655 == 0) {
                            class426.method2508(false, var62, -1);
                        }
                        continue;
                    }
                    if (var616 == 1003) {
                        var2--;
                        boolean var67 = field6679[var2] == 1;
                        if (var62.field2539 != var67) {
                            var62.field2539 = var67;
                            class205.method1396(64, var62);
                        }
                        if (var62.field2534 == -1) {
                            class380.method2326(var62.field2631, 43);
                        }
                        continue;
                    }
                    if (var616 == 1004) {
                        var2 -= 2;
                        var62.field2528 = field6679[var2];
                        var62.field2606 = field6679[var2 + 1];
                        class205.method1396(126, var62);
                        class171.method1185(-88, var62);
                        if (var62.field2655 == 0) {
                            class426.method2508(false, var62, -1);
                        }
                        continue;
                    }
                    if (var616 == 1005) {
                        var2--;
                        var62.field2640 = field6679[var2] == 1;
                        continue;
                    }
                } else if (var616 >= 1100 && var616 < 1200 || var616 >= 2100 && var616 < 2200) {
                    class178 var68;
                    if (var616 >= 2000) {
                        var616 -= 1000;
                        var2--;
                        var68 = class493.method2885(field6679[var2], 65535);
                    } else {
                        var68 = var37 ? field6695 : field6692;
                    }
                    if (var616 == 1100) {
                        var2 -= 2;
                        var68.field2530 = field6679[var2];
                        if (var68.field2530 > var68.field2560 - var68.field2595) {
                            var68.field2530 = var68.field2560 - var68.field2595;
                        }
                        if (var68.field2530 < 0) {
                            var68.field2530 = 0;
                        }
                        var68.field2620 = field6679[var2 + 1];
                        if (var68.field2620 > var68.field2601 - var68.field2589) {
                            var68.field2620 = var68.field2601 - var68.field2589;
                        }
                        if (var68.field2620 < 0) {
                            var68.field2620 = 0;
                        }
                        class205.method1396(76, var68);
                        if (var68.field2534 == -1) {
                            class232.method1522(var68.field2631, (byte) -125);
                        }
                        continue;
                    }
                    if (var616 == 1101) {
                        var2--;
                        var68.field2625 = field6679[var2];
                        class205.method1396(65, var68);
                        if (var68.field2534 == -1) {
                            class312.method1934(-111, var68.field2631);
                        }
                        continue;
                    }
                    if (var616 == 1102) {
                        var2--;
                        var68.field2567 = field6679[var2] == 1;
                        class205.method1396(64, var68);
                        continue;
                    }
                    if (var616 == 1103) {
                        var2--;
                        var68.field2650 = field6679[var2];
                        class205.method1396(78, var68);
                        continue;
                    }
                    if (var616 == 1104) {
                        var2--;
                        var68.field2659 = field6679[var2];
                        class205.method1396(111, var68);
                        continue;
                    }
                    if (var616 == 1105) {
                        var2--;
                        int var69 = field6679[var2];
                        if (var68.field2559 != var69) {
                            var68.field2559 = var69;
                            class205.method1396(120, var68);
                        }
                        if (var68.field2534 == -1) {
                            class349.method2152((byte) -119, var68.field2631);
                        }
                        continue;
                    }
                    if (var616 == 1106) {
                        var2--;
                        var68.field2613 = field6679[var2];
                        class205.method1396(102, var68);
                        continue;
                    }
                    if (var616 == 1107) {
                        var2--;
                        var68.field2628 = field6679[var2] == 1;
                        class205.method1396(70, var68);
                        continue;
                    }
                    if (var616 == 1108) {
                        var68.field2584 = 1;
                        var2--;
                        var68.field2572 = field6679[var2];
                        class205.method1396(117, var68);
                        if (var68.field2534 == -1) {
                            class52.method382(var68.field2631, -4397);
                        }
                        continue;
                    }
                    if (var616 == 1109) {
                        var2 -= 6;
                        var68.field2651 = field6679[var2];
                        var68.field2515 = field6679[var2 + 1];
                        var68.field2516 = field6679[var2 + 2];
                        var68.field2656 = field6679[var2 + 3];
                        var68.field2667 = field6679[var2 + 4];
                        var68.field2583 = field6679[var2 + 5];
                        class205.method1396(70, var68);
                        if (var68.field2534 == -1) {
                            class266.method1742(8, var68.field2631);
                            class427.method2515((byte) -49, var68.field2631);
                        }
                        continue;
                    }
                    if (var616 == 1110) {
                        var2--;
                        int var70 = field6679[var2];
                        if (var68.field2616 != var70) {
                            var68.field2616 = var70;
                            var68.field2568 = 0;
                            var68.field2563 = 1;
                            var68.field2535 = 0;
                            class205.method1396(126, var68);
                        }
                        if (var68.field2534 == -1) {
                            class178.method1227(-115, var68.field2631);
                        }
                        continue;
                    }
                    if (var616 == 1111) {
                        var2--;
                        var68.field2538 = field6679[var2] == 1;
                        class205.method1396(114, var68);
                        continue;
                    }
                    if (var616 == 1112) {
                        var3--;
                        String var71 = field6688[var3];
                        if (!var71.equals(var68.field2629)) {
                            var68.field2629 = var71;
                            class205.method1396(70, var68);
                        }
                        if (var68.field2534 == -1) {
                            class370.method2290(var68.field2631, (byte) 9);
                        }
                        continue;
                    }
                    if (var616 == 1113) {
                        var2--;
                        var68.field2643 = field6679[var2];
                        class205.method1396(94, var68);
                        if (var68.field2534 == -1) {
                            class250.method1591(81, var68.field2631);
                        }
                        continue;
                    }
                    if (var616 == 1114) {
                        var2 -= 3;
                        var68.field2607 = field6679[var2];
                        var68.field2552 = field6679[var2 + 1];
                        var68.field2662 = field6679[var2 + 2];
                        class205.method1396(74, var68);
                        continue;
                    }
                    if (var616 == 1115) {
                        var2--;
                        var68.field2562 = field6679[var2] == 1;
                        class205.method1396(118, var68);
                        continue;
                    }
                    if (var616 == 1116) {
                        var2--;
                        var68.field2647 = field6679[var2];
                        class205.method1396(92, var68);
                        continue;
                    }
                    if (var616 == 1117) {
                        var2--;
                        var68.field2610 = field6679[var2];
                        class205.method1396(77, var68);
                        continue;
                    }
                    if (var616 == 1118) {
                        var2--;
                        var68.field2521 = field6679[var2] == 1;
                        class205.method1396(90, var68);
                        continue;
                    }
                    if (var616 == 1119) {
                        var2--;
                        var68.field2592 = field6679[var2] == 1;
                        class205.method1396(86, var68);
                        continue;
                    }
                    if (var616 == 1120) {
                        var2 -= 2;
                        var68.field2560 = field6679[var2];
                        var68.field2601 = field6679[var2 + 1];
                        class205.method1396(113, var68);
                        if (var68.field2655 == 0) {
                            class426.method2508(false, var68, -1);
                        }
                        continue;
                    }
                    if (var616 == 1121) {
                        var2 -= 2;
                        var68.field2626 = (short) field6679[var2];
                        var68.field2542 = (short) field6679[var2 + 1];
                        class205.method1396(103, var68);
                        continue;
                    }
                    if (var616 == 1122) {
                        var2--;
                        var68.field2549 = field6679[var2] == 1;
                        class205.method1396(92, var68);
                        continue;
                    }
                    if (var616 == 1123) {
                        var2--;
                        var68.field2583 = field6679[var2];
                        class205.method1396(66, var68);
                        if (var68.field2534 == -1) {
                            class266.method1742(8, var68.field2631);
                        }
                        continue;
                    }
                    if (var616 == 1124) {
                        var2--;
                        int var72 = field6679[var2];
                        var68.field2661 = var72 == 1;
                        class205.method1396(112, var68);
                        continue;
                    }
                    if (var616 == 1125) {
                        var2 -= 2;
                        var68.field2665 = field6679[var2];
                        var68.field2553 = field6679[var2 + 1];
                        class205.method1396(103, var68);
                        continue;
                    }
                } else if (!(var616 < 1200 || var616 >= 1300) || !(var616 < 2200 || var616 >= 2300)) {
                    class178 var73;
                    if (var616 >= 2000) {
                        var616 -= 1000;
                        var2--;
                        var73 = class493.method2885(field6679[var2], 65535);
                    } else {
                        var73 = var37 ? field6695 : field6692;
                    }
                    class205.method1396(67, var73);
                    if (var616 == 1200 || var616 == 1205 || var616 == 1208 || var616 == 1209 || var616 == 1212 || var616 == 1213) {
                        var2 -= 2;
                        int var74 = field6679[var2];
                        int var75 = field6679[var2 + 1];
                        if (var73.field2534 == -1) {
                            class436.method2543(var73.field2631, (byte) -46);
                            class266.method1742(8, var73.field2631);
                            class427.method2515((byte) -49, var73.field2631);
                        }
                        if (var74 == -1) {
                            var73.field2584 = 1;
                            var73.field2572 = -1;
                            var73.field2605 = -1;
                            continue;
                        }
                        var73.field2605 = var74;
                        var73.field2652 = var75;
                        if (var616 == 1208 || var616 == 1209) {
                            var73.field2556 = true;
                        } else {
                            var73.field2556 = false;
                        }
                        class184 var76 = class23.field309.method2364((byte) 118, var74);
                        var73.field2516 = var76.field2784;
                        var73.field2656 = var76.field2776;
                        var73.field2667 = var76.field2742;
                        var73.field2651 = var76.field2765;
                        var73.field2515 = var76.field2734;
                        var73.field2583 = var76.field2767;
                        if (var616 == 1205 || var616 == 1209) {
                            var73.field2576 = 0;
                        } else if (var616 == 1212 || var616 == 1213) {
                            var73.field2576 = 1;
                        } else {
                            var73.field2576 = 2;
                        }
                        if (var73.field2598 > 0) {
                            var73.field2583 = var73.field2583 * 32 / var73.field2598;
                        } else if (var73.field2641 > 0) {
                            var73.field2583 = var73.field2583 * 32 / var73.field2641;
                        }
                        continue;
                    }
                    if (var616 == 1201) {
                        var73.field2584 = 2;
                        var2--;
                        var73.field2572 = field6679[var2];
                        if (var73.field2534 == -1) {
                            class52.method382(var73.field2631, -4397);
                        }
                        continue;
                    }
                    if (var616 == 1202) {
                        var73.field2584 = 3;
                        var73.field2572 = -1;
                        if (var73.field2534 == -1) {
                            class52.method382(var73.field2631, -4397);
                        }
                        continue;
                    }
                    if (var616 == 1203) {
                        var73.field2584 = 6;
                        var2--;
                        var73.field2572 = field6679[var2];
                        if (var73.field2534 == -1) {
                            class52.method382(var73.field2631, -4397);
                        }
                        continue;
                    }
                    if (var616 == 1204) {
                        var73.field2584 = 5;
                        var2--;
                        var73.field2572 = field6679[var2];
                        if (var73.field2534 == -1) {
                            class52.method382(var73.field2631, -4397);
                        }
                        continue;
                    }
                    if (var616 == 1206) {
                        var2 -= 4;
                        var73.field2636 = field6679[var2];
                        var73.field2540 = field6679[var2 + 1];
                        var73.field2611 = field6679[var2 + 2];
                        var73.field2621 = field6679[var2 + 3];
                        class205.method1396(95, var73);
                        continue;
                    }
                    if (var616 == 1207) {
                        var2 -= 2;
                        var73.field2586 = field6679[var2];
                        var73.field2531 = field6679[var2 + 1];
                        class205.method1396(97, var73);
                        continue;
                    }
                    if (var616 == 1210) {
                        var2 -= 4;
                        var73.field2572 = field6679[var2];
                        var73.field2564 = field6679[var2 + 1];
                        if (field6679[var2 + 2] == 1) {
                            var73.field2584 = 9;
                        } else {
                            var73.field2584 = 8;
                        }
                        if (field6679[var2 + 3] == 1) {
                            var73.field2556 = true;
                        } else {
                            var73.field2556 = false;
                        }
                        if (var73.field2534 == -1) {
                            class52.method382(var73.field2631, -4397);
                        }
                        continue;
                    }
                    if (var616 == 1211) {
                        var73.field2584 = 5;
                        var73.field2572 = class263.field3910;
                        var73.field2564 = 0;
                        if (var73.field2534 == -1) {
                            class52.method382(var73.field2631, -4397);
                        }
                        continue;
                    }
                } else if (var616 >= 1300 && var616 < 1400 || var616 >= 2300 && var616 < 2400) {
                    class178 var77;
                    if (var616 >= 2000) {
                        var616 -= 1000;
                        var2--;
                        var77 = class493.method2885(field6679[var2], 65535);
                    } else {
                        var77 = var37 ? field6695 : field6692;
                    }
                    if (var616 == 1300) {
                        var2--;
                        int var78 = field6679[var2] - 1;
                        if (var78 >= 0 && var78 <= 9) {
                            var3--;
                            var77.method1230(field6688[var3], var78, (byte) -97);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var616 == 1301) {
                        var2 -= 2;
                        int var79 = field6679[var2];
                        int var80 = field6679[var2 + 1];
                        var77.field2513 = class331.method2032(var79, var80, -1);
                        continue;
                    }
                    if (var616 == 1302) {
                        var2--;
                        int var81 = field6679[var2];
                        if (class360.field5461 == var81 || class315.field4742 == var81 || class275.field4187 == var81) {
                            var77.field2544 = var81;
                        }
                        continue;
                    }
                    if (var616 == 1303) {
                        var2--;
                        var77.field2637 = field6679[var2];
                        continue;
                    }
                    if (var616 == 1304) {
                        var2--;
                        var77.field2550 = field6679[var2];
                        continue;
                    }
                    if (var616 == 1305) {
                        var3--;
                        var77.field2565 = field6688[var3];
                        continue;
                    }
                    if (var616 == 1306) {
                        var3--;
                        var77.field2590 = field6688[var3];
                        continue;
                    }
                    if (var616 == 1307) {
                        var77.field2587 = null;
                        continue;
                    }
                    if (var616 == 1308) {
                        var2--;
                        var77.field2634 = field6679[var2];
                        var2--;
                        var77.field2594 = field6679[var2];
                        continue;
                    }
                    if (var616 == 1309) {
                        var2--;
                        int var82 = field6679[var2];
                        var2--;
                        int var83 = field6679[var2];
                        if (var83 >= 1 && var83 <= 10) {
                            var77.method1236(var83 - 1, var82, (byte) -115);
                        }
                        continue;
                    }
                    if (var616 == 1310) {
                        var3--;
                        var77.field2654 = field6688[var3];
                        continue;
                    }
                    if (var616 == 1311) {
                        var2--;
                        var77.field2632 = field6679[var2];
                        continue;
                    }
                } else {
                    if (var616 >= 1400 && var616 < 1500 || var616 >= 2400 && var616 < 2500) {
                        class178 var84;
                        if (var616 >= 2000) {
                            var616 -= 1000;
                            var2--;
                            var84 = class493.method2885(field6679[var2], 65535);
                        } else {
                            var84 = var37 ? field6695 : field6692;
                        }
                        var3--;
                        String var85 = field6688[var3];
                        int[] var86 = null;
                        if (var85.length() > 0 && var85.charAt(var85.length() - 1) == 'Y') {
                            var2--;
                            int var87 = field6679[var2];
                            if (var87 > 0) {
                                var86 = new int[var87];
                                while (var87-- > 0) {
                                    var2--;
                                    var86[var87] = field6679[var2];
                                }
                            }
                            var85 = var85.substring(0, var85.length() - 1);
                        }
                        Object[] var88 = new Object[var85.length() + 1];
                        for (int var89 = var88.length - 1; var89 >= 1; var89--) {
                            if (var85.charAt(var89 - 1) == 's') {
                                var3--;
                                var88[var89] = field6688[var3];
                            } else {
                                var2--;
                                var88[var89] = Integer.valueOf(field6679[var2]);
                            }
                        }
                        var2--;
                        int var90 = field6679[var2];
                        if (var90 == -1) {
                            var88 = null;
                        } else {
                            var88[0] = Integer.valueOf(var90);
                        }
                        if (var616 == 1400) {
                            var84.field2664 = var88;
                        } else if (var616 == 1401) {
                            var84.field2653 = var88;
                        } else if (var616 == 1402) {
                            var84.field2546 = var88;
                        } else if (var616 == 1403) {
                            var84.field2630 = var88;
                        } else if (var616 == 1404) {
                            var84.field2524 = var88;
                        } else if (var616 == 1405) {
                            var84.field2582 = var88;
                        } else if (var616 == 1406) {
                            var84.field2623 = var88;
                        } else if (var616 == 1407) {
                            var84.field2596 = var88;
                            var84.field2520 = var86;
                        } else if (var616 == 1408) {
                            var84.field2575 = var88;
                        } else if (var616 == 1409) {
                            var84.field2574 = var88;
                        } else if (var616 == 1410) {
                            var84.field2617 = var88;
                        } else if (var616 == 1411) {
                            var84.field2514 = var88;
                        } else if (var616 == 1412) {
                            var84.field2618 = var88;
                        } else if (var616 == 1414) {
                            var84.field2522 = var88;
                            var84.field2622 = var86;
                        } else if (var616 == 1415) {
                            var84.field2645 = var88;
                            var84.field2635 = var86;
                        } else if (var616 == 1416) {
                            var84.field2561 = var88;
                        } else if (var616 == 1417) {
                            var84.field2612 = var88;
                        } else if (var616 == 1418) {
                            var84.field2523 = var88;
                        } else if (var616 == 1419) {
                            var84.field2624 = var88;
                        } else if (var616 == 1420) {
                            var84.field2525 = var88;
                        } else if (var616 == 1421) {
                            var84.field2619 = var88;
                        } else if (var616 == 1422) {
                            var84.field2557 = var88;
                        } else if (var616 == 1423) {
                            var84.field2604 = var88;
                        } else if (var616 == 1424) {
                            var84.field2639 = var88;
                        } else if (var616 == 1425) {
                            var84.field2642 = var88;
                        } else if (var616 == 1426) {
                            var84.field2519 = var88;
                        } else if (var616 == 1427) {
                            var84.field2532 = var88;
                        } else if (var616 == 1428) {
                            var84.field2554 = var88;
                            var84.field2509 = var86;
                        } else if (var616 == 1429) {
                            var84.field2517 = var88;
                            var84.field2585 = var86;
                        }
                        var84.field2569 = true;
                        continue;
                    }
                    if (var616 < 1600) {
                        class178 var91 = var37 ? field6695 : field6692;
                        if (var616 == 1500) {
                            field6679[var2++] = var91.field2593;
                            continue;
                        }
                        if (var616 == 1501) {
                            field6679[var2++] = var91.field2648;
                            continue;
                        }
                        if (var616 == 1502) {
                            field6679[var2++] = var91.field2595;
                            continue;
                        }
                        if (var616 == 1503) {
                            field6679[var2++] = var91.field2589;
                            continue;
                        }
                        if (var616 == 1504) {
                            field6679[var2++] = var91.field2539 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 1505) {
                            field6679[var2++] = var91.field2580;
                            continue;
                        }
                    } else if (var616 < 1700) {
                        class178 var92 = var37 ? field6695 : field6692;
                        if (var616 == 1600) {
                            field6679[var2++] = var92.field2530;
                            continue;
                        }
                        if (var616 == 1601) {
                            field6679[var2++] = var92.field2620;
                            continue;
                        }
                        if (var616 == 1602) {
                            field6688[var3++] = var92.field2629;
                            continue;
                        }
                        if (var616 == 1603) {
                            field6679[var2++] = var92.field2560;
                            continue;
                        }
                        if (var616 == 1604) {
                            field6679[var2++] = var92.field2601;
                            continue;
                        }
                        if (var616 == 1605) {
                            field6679[var2++] = var92.field2583;
                            continue;
                        }
                        if (var616 == 1606) {
                            field6679[var2++] = var92.field2516;
                            continue;
                        }
                        if (var616 == 1607) {
                            field6679[var2++] = var92.field2667;
                            continue;
                        }
                        if (var616 == 1608) {
                            field6679[var2++] = var92.field2656;
                            continue;
                        }
                        if (var616 == 1609) {
                            field6679[var2++] = var92.field2650;
                            continue;
                        }
                        if (var616 == 1610) {
                            field6679[var2++] = var92.field2651;
                            continue;
                        }
                        if (var616 == 1611) {
                            field6679[var2++] = var92.field2515;
                            continue;
                        }
                        if (var616 == 1612) {
                            field6679[var2++] = var92.field2559;
                            continue;
                        }
                    } else if (var616 < 1800) {
                        class178 var93 = var37 ? field6695 : field6692;
                        if (var616 == 1700) {
                            field6679[var2++] = var93.field2605;
                            continue;
                        }
                        if (var616 == 1701) {
                            if (var93.field2605 == -1) {
                                field6679[var2++] = 0;
                            } else {
                                field6679[var2++] = var93.field2652;
                            }
                            continue;
                        }
                        if (var616 == 1702) {
                            field6679[var2++] = var93.field2534;
                            continue;
                        }
                    } else if (var616 < 1900) {
                        class178 var94 = var37 ? field6695 : field6692;
                        if (var616 == 1800) {
                            field6679[var2++] = client.method2777(var94).method1207((byte) -117);
                            continue;
                        }
                        if (var616 == 1801) {
                            var2--;
                            int var95 = field6679[var2];
                            int var617 = var95 - 1;
                            if (var94.field2587 != null && var617 < var94.field2587.length && var94.field2587[var617] != null) {
                                field6688[var3++] = var94.field2587[var617];
                                continue;
                            }
                            field6688[var3++] = "";
                            continue;
                        }
                        if (var616 == 1802) {
                            if (var94.field2565 == null) {
                                field6688[var3++] = "";
                            } else {
                                field6688[var3++] = var94.field2565;
                            }
                            continue;
                        }
                    } else if (var616 < 2600) {
                        var2--;
                        class178 var96 = class493.method2885(field6679[var2], 65535);
                        if (var616 == 2500) {
                            field6679[var2++] = var96.field2593;
                            continue;
                        }
                        if (var616 == 2501) {
                            field6679[var2++] = var96.field2648;
                            continue;
                        }
                        if (var616 == 2502) {
                            field6679[var2++] = var96.field2595;
                            continue;
                        }
                        if (var616 == 2503) {
                            field6679[var2++] = var96.field2589;
                            continue;
                        }
                        if (var616 == 2504) {
                            field6679[var2++] = var96.field2539 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 2505) {
                            field6679[var2++] = var96.field2580;
                            continue;
                        }
                    } else if (var616 < 2700) {
                        var2--;
                        class178 var97 = class493.method2885(field6679[var2], 65535);
                        if (var616 == 2600) {
                            field6679[var2++] = var97.field2530;
                            continue;
                        }
                        if (var616 == 2601) {
                            field6679[var2++] = var97.field2620;
                            continue;
                        }
                        if (var616 == 2602) {
                            field6688[var3++] = var97.field2629;
                            continue;
                        }
                        if (var616 == 2603) {
                            field6679[var2++] = var97.field2560;
                            continue;
                        }
                        if (var616 == 2604) {
                            field6679[var2++] = var97.field2601;
                            continue;
                        }
                        if (var616 == 2605) {
                            field6679[var2++] = var97.field2583;
                            continue;
                        }
                        if (var616 == 2606) {
                            field6679[var2++] = var97.field2516;
                            continue;
                        }
                        if (var616 == 2607) {
                            field6679[var2++] = var97.field2667;
                            continue;
                        }
                        if (var616 == 2608) {
                            field6679[var2++] = var97.field2656;
                            continue;
                        }
                        if (var616 == 2609) {
                            field6679[var2++] = var97.field2650;
                            continue;
                        }
                        if (var616 == 2610) {
                            field6679[var2++] = var97.field2651;
                            continue;
                        }
                        if (var616 == 2611) {
                            field6679[var2++] = var97.field2515;
                            continue;
                        }
                        if (var616 == 2612) {
                            field6679[var2++] = var97.field2559;
                            continue;
                        }
                    } else if (var616 < 2800) {
                        if (var616 == 2700) {
                            var2--;
                            class178 var98 = class493.method2885(field6679[var2], 65535);
                            field6679[var2++] = var98.field2605;
                            continue;
                        }
                        if (var616 == 2701) {
                            var2--;
                            class178 var99 = class493.method2885(field6679[var2], 65535);
                            if (var99.field2605 == -1) {
                                field6679[var2++] = 0;
                            } else {
                                field6679[var2++] = var99.field2652;
                            }
                            continue;
                        }
                        if (var616 == 2702) {
                            var2--;
                            int var100 = field6679[var2];
                            class468 var101 = (class468) class466.field6564.method2305((long) var100, (byte) 64);
                            if (var101 == null) {
                                field6679[var2++] = 0;
                            } else {
                                field6679[var2++] = 1;
                            }
                            continue;
                        }
                        if (var616 == 2703) {
                            var2--;
                            class178 var102 = class493.method2885(field6679[var2], 65535);
                            if (var102.field2548 == null) {
                                field6679[var2++] = 0;
                                continue;
                            }
                            int var103 = var102.field2548.length;
                            for (int var104 = 0; var104 < var102.field2548.length; var104++) {
                                if (var102.field2548[var104] == null) {
                                    var103 = var104;
                                    break;
                                }
                            }
                            field6679[var2++] = var103;
                            continue;
                        }
                        if (var616 == 2704 || var616 == 2705) {
                            var2 -= 2;
                            int var105 = field6679[var2];
                            int var106 = field6679[var2 + 1];
                            class468 var107 = (class468) class466.field6564.method2305((long) var105, (byte) 111);
                            if (var107 != null && var107.field6584 == var106) {
                                field6679[var2++] = 1;
                                continue;
                            }
                            field6679[var2++] = 0;
                            continue;
                        }
                    } else if (var616 < 2900) {
                        var2--;
                        class178 var108 = class493.method2885(field6679[var2], 65535);
                        if (var616 == 2800) {
                            field6679[var2++] = client.method2777(var108).method1207((byte) 71);
                            continue;
                        }
                        if (var616 == 2801) {
                            var2--;
                            int var109 = field6679[var2];
                            int var618 = var109 - 1;
                            if (var108.field2587 != null && var618 < var108.field2587.length && var108.field2587[var618] != null) {
                                field6688[var3++] = var108.field2587[var618];
                                continue;
                            }
                            field6688[var3++] = "";
                            continue;
                        }
                        if (var616 == 2802) {
                            if (var108.field2565 == null) {
                                field6688[var3++] = "";
                            } else {
                                field6688[var3++] = var108.field2565;
                            }
                            continue;
                        }
                    } else if (var616 < 3200) {
                        if (var616 == 3100) {
                            var3--;
                            String var110 = field6688[var3];
                            class453.method2696(126, var110);
                            continue;
                        }
                        if (var616 == 3101) {
                            var2 -= 2;
                            class124.method870(field6679[var2], field6679[var2 + 1], (byte) 109, class472.field6622);
                            continue;
                        }
                        if (var616 == 3103) {
                            class225.method1459(true, -123);
                            continue;
                        }
                        if (var616 == 3104) {
                            var3--;
                            String var111 = field6688[var3];
                            int var112 = 0;
                            if (class43.method315(15154, var111)) {
                                var112 = class427.method2512(10, var111);
                            }
                            field6689++;
                            class378.method2320(class271.field4052, (byte) 119);
                            class230.field3390.method2596((byte) -2, var112);
                            continue;
                        }
                        if (var616 == 3105) {
                            var3--;
                            String var113 = field6688[var3];
                            field6700++;
                            class378.method2320(class171.field2433, (byte) 119);
                            class230.field3390.method2619((byte) -124, var113.length() + 1);
                            class230.field3390.method2597(var113, (byte) -81);
                            continue;
                        }
                        if (var616 == 3106) {
                            var3--;
                            String var114 = field6688[var3];
                            field6694++;
                            class378.method2320(class29.field396, (byte) 119);
                            class230.field3390.method2619((byte) -120, var114.length() + 1);
                            class230.field3390.method2597(var114, (byte) -94);
                            continue;
                        }
                        if (var616 == 3107) {
                            var2--;
                            int var115 = field6679[var2];
                            var3--;
                            String var116 = field6688[var3];
                            class245.method1559(var115, var116, 25297);
                            continue;
                        }
                        if (var616 == 3108) {
                            var2 -= 3;
                            int var117 = field6679[var2];
                            int var118 = field6679[var2 + 1];
                            int var119 = field6679[var2 + 2];
                            class178 var120 = class493.method2885(var119, 65535);
                            class46.method340(var118, var120, var117, (byte) 45);
                            continue;
                        }
                        if (var616 == 3109) {
                            var2 -= 2;
                            int var121 = field6679[var2];
                            int var122 = field6679[var2 + 1];
                            class178 var123 = var37 ? field6695 : field6692;
                            class46.method340(var122, var123, var121, (byte) -112);
                            continue;
                        }
                        if (var616 == 3110) {
                            var2--;
                            int var124 = field6679[var2];
                            field6684++;
                            class378.method2320(class390.field5746, (byte) 119);
                            class230.field3390.method2592(var124, (byte) -109);
                            continue;
                        }
                        if (var616 == 3111) {
                            var2 -= 2;
                            int var125 = field6679[var2];
                            int var126 = field6679[var2 + 1];
                            class468 var127 = (class468) class466.field6564.method2305((long) var125, (byte) 117);
                            if (var127 != null) {
                                class479.method2811(1711162608, true, var127, var127.field6584 != var126);
                            }
                            class163.method1106(var125, var126, 3, 2121095184, true);
                            continue;
                        }
                        if (var616 == 3112) {
                            var2--;
                            int var128 = field6679[var2];
                            class468 var129 = (class468) class466.field6564.method2305((long) var128, (byte) 74);
                            if (var129 != null && var129.field6587 == 3) {
                                class479.method2811(1711162608, true, var129, true);
                            }
                            continue;
                        }
                    } else if (var616 < 3300) {
                        if (var616 == 3200) {
                            var2 -= 3;
                            class68.method601(field6679[var2], 255, field6679[var2 + 2], field6679[var2 + 1], true);
                            continue;
                        }
                        if (var616 == 3201) {
                            var2--;
                            class352.method2174(255, -3235, field6679[var2], 50);
                            continue;
                        }
                        if (var616 == 3202) {
                            var2 -= 2;
                            class325.method2004((byte) -117, field6679[var2], field6679[var2 + 1], 255);
                            continue;
                        }
                        if (var616 == 3203) {
                            var2 -= 4;
                            class68.method601(field6679[var2], field6679[var2 + 3], field6679[var2 + 2], field6679[var2 + 1], true);
                            continue;
                        }
                        if (var616 == 3204) {
                            var2 -= 3;
                            class352.method2174(field6679[var2 + 1], -3235, field6679[var2], field6679[var2 + 2]);
                            continue;
                        }
                        if (var616 == 3205) {
                            var2 -= 3;
                            class325.method2004((byte) -117, field6679[var2], field6679[var2 + 1], field6679[var2 + 2]);
                            continue;
                        }
                    } else if (var616 < 3400) {
                        if (var616 == 3300) {
                            field6679[var2++] = class452.field6418;
                            continue;
                        }
                        if (var616 == 3301) {
                            var2 -= 2;
                            int var130 = field6679[var2];
                            int var131 = field6679[var2 + 1];
                            field6679[var2++] = client.method2783(var130, false, var131, 0);
                            continue;
                        }
                        if (var616 == 3302) {
                            var2 -= 2;
                            int var132 = field6679[var2];
                            int var133 = field6679[var2 + 1];
                            field6679[var2++] = class17.method178(var132, var133, 0, false);
                            continue;
                        }
                        if (var616 == 3303) {
                            var2 -= 2;
                            int var134 = field6679[var2];
                            int var135 = field6679[var2 + 1];
                            field6679[var2++] = class258.method1711(24677, false, var135, var134);
                            continue;
                        }
                        if (var616 == 3304) {
                            var2--;
                            int var136 = field6679[var2];
                            field6679[var2++] = class200.field3021.method2346(var136, 5).field4558;
                            continue;
                        }
                        if (var616 == 3305) {
                            var2--;
                            int var137 = field6679[var2];
                            field6679[var2++] = class126.field1721[var137];
                            continue;
                        }
                        if (var616 == 3306) {
                            var2--;
                            int var138 = field6679[var2];
                            field6679[var2++] = class219.field3242[var138];
                            continue;
                        }
                        if (var616 == 3307) {
                            var2--;
                            int var139 = field6679[var2];
                            field6679[var2++] = class441.field6227[var139];
                            continue;
                        }
                        if (var616 == 3308) {
                            byte var140 = class472.field6622.field4545;
                            int var141 = (class472.field6622.field4543 >> 7) + class68.field922;
                            int var142 = (class472.field6622.field4538 >> 7) + class468.field6588;
                            field6679[var2++] = (var140 << 28) + (var141 << 14) + var142;
                            continue;
                        }
                        if (var616 == 3309) {
                            var2--;
                            int var143 = field6679[var2];
                            field6679[var2++] = var143 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var616 == 3310) {
                            var2--;
                            int var144 = field6679[var2];
                            field6679[var2++] = var144 >> 28;
                            continue;
                        }
                        if (var616 == 3311) {
                            var2--;
                            int var145 = field6679[var2];
                            field6679[var2++] = var145 & 0x3FFF;
                            continue;
                        }
                        if (var616 == 3312) {
                            field6679[var2++] = class198.field2979 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 3313) {
                            var2 -= 2;
                            int var146 = field6679[var2];
                            int var147 = field6679[var2 + 1];
                            field6679[var2++] = client.method2783(var146, true, var147, 0);
                            continue;
                        }
                        if (var616 == 3314) {
                            var2 -= 2;
                            int var148 = field6679[var2];
                            int var149 = field6679[var2 + 1];
                            field6679[var2++] = class17.method178(var148, var149, 0, true);
                            continue;
                        }
                        if (var616 == 3315) {
                            var2 -= 2;
                            int var150 = field6679[var2];
                            int var151 = field6679[var2 + 1];
                            field6679[var2++] = class258.method1711(24677, true, var151, var150);
                            continue;
                        }
                        if (var616 == 3316) {
                            if (class465.field6556 >= 2) {
                                field6679[var2++] = class465.field6556;
                            } else {
                                field6679[var2++] = 0;
                            }
                            continue;
                        }
                        if (var616 == 3317) {
                            field6679[var2++] = class32.field422;
                            continue;
                        }
                        if (var616 == 3318) {
                            field6679[var2++] = class212.field3196;
                            continue;
                        }
                        if (var616 == 3321) {
                            field6679[var2++] = class184.field2732;
                            continue;
                        }
                        if (var616 == 3322) {
                            field6679[var2++] = class186.field2833;
                            continue;
                        }
                        if (var616 == 3323) {
                            if (class8.field126 >= 5 && class8.field126 <= 9) {
                                field6679[var2++] = 1;
                                continue;
                            }
                            field6679[var2++] = 0;
                            continue;
                        }
                        if (var616 == 3324) {
                            if (class8.field126 >= 5 && class8.field126 <= 9) {
                                field6679[var2++] = class8.field126;
                                continue;
                            }
                            field6679[var2++] = 0;
                            continue;
                        }
                        if (var616 == 3325) {
                            field6679[var2++] = class419.field6026 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 3326) {
                            field6679[var2++] = class472.field6622.field3840;
                            continue;
                        }
                        if (var616 == 3327) {
                            field6679[var2++] = class472.field6622.field3833.field4953 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 3328) {
                            field6679[var2++] = class305.field4555 && !class174.field2468 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 3329) {
                            field6679[var2++] = class206.field3122 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 3330) {
                            var2--;
                            int var152 = field6679[var2];
                            field6679[var2++] = class219.method1444(false, (byte) -88, var152);
                            continue;
                        }
                        if (var616 == 3331) {
                            var2 -= 2;
                            int var153 = field6679[var2];
                            int var154 = field6679[var2 + 1];
                            field6679[var2++] = class335.method2060(false, var153, false, var154, false);
                            continue;
                        }
                        if (var616 == 3332) {
                            var2 -= 2;
                            int var155 = field6679[var2];
                            int var156 = field6679[var2 + 1];
                            field6679[var2++] = class335.method2060(true, var155, false, var156, false);
                            continue;
                        }
                        if (var616 == 3333) {
                            field6679[var2++] = class356.field5410;
                            continue;
                        }
                        if (var616 == 3335) {
                            field6679[var2++] = class4.field85;
                            continue;
                        }
                        if (var616 == 3336) {
                            var2 -= 4;
                            int var157 = field6679[var2];
                            int var158 = field6679[var2 + 1];
                            int var159 = field6679[var2 + 2];
                            int var160 = field6679[var2 + 3];
                            int var161 = (var158 << 14) + var157;
                            int var162 = (var159 << 28) + var161;
                            int var163 = var160 + var162;
                            field6679[var2++] = var163;
                            continue;
                        }
                        if (var616 == 3337) {
                            field6679[var2++] = class64.field891;
                            continue;
                        }
                        if (var616 == 3338) {
                            field6679[var2++] = class85.method691(0);
                            continue;
                        }
                    } else if (var616 < 3500) {
                        if (var616 == 3400) {
                            var2 -= 2;
                            int var164 = field6679[var2];
                            int var165 = field6679[var2 + 1];
                            class480 var166 = class324.field4867.method1715(var164, (byte) 82);
                            field6688[var3++] = var166.method2815(var165, 5);
                            continue;
                        }
                        if (var616 == 3408) {
                            var2 -= 4;
                            int var167 = field6679[var2];
                            int var168 = field6679[var2 + 1];
                            int var169 = field6679[var2 + 2];
                            int var170 = field6679[var2 + 3];
                            class480 var171 = class324.field4867.method1715(var169, (byte) 105);
                            if (var171.field6763 == var167 && var171.field6761 == var168) {
                                if (var168 == 115) {
                                    field6688[var3++] = var171.method2815(var170, 5);
                                } else {
                                    field6679[var2++] = var171.method2823(true, var170);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var616 == 3409) {
                            var2 -= 3;
                            int var172 = field6679[var2];
                            int var173 = field6679[var2 + 1];
                            int var174 = field6679[var2 + 2];
                            if (var173 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class480 var175 = class324.field4867.method1715(var173, (byte) -92);
                            if (var175.field6761 != var172) {
                                throw new RuntimeException("C3409-1");
                            }
                            field6679[var2++] = var175.method2817(5, var174) ? 1 : 0;
                            continue;
                        }
                        if (var616 == 3410) {
                            var2--;
                            int var176 = field6679[var2];
                            var3--;
                            String var177 = field6688[var3];
                            if (var176 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class480 var178 = class324.field4867.method1715(var176, (byte) -110);
                            if (var178.field6761 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field6679[var2++] = var178.method2819((byte) -5, var177) ? 1 : 0;
                            continue;
                        }
                        if (var616 == 3411) {
                            var2--;
                            int var179 = field6679[var2];
                            class480 var180 = class324.field4867.method1715(var179, (byte) 106);
                            field6679[var2++] = var180.field6750.method2302(false);
                            continue;
                        }
                    } else if (var616 < 3700) {
                        if (var616 == 3600) {
                            if (class425.field6082 == 0) {
                                field6679[var2++] = -2;
                            } else if (class425.field6082 == 1) {
                                field6679[var2++] = -1;
                            } else {
                                field6679[var2++] = class157.field2190;
                            }
                            continue;
                        }
                        if (var616 == 3601) {
                            var2--;
                            int var181 = field6679[var2];
                            if (class425.field6082 == 2 && var181 < class157.field2190) {
                                field6688[var3++] = class42.field570[var181];
                                if (class310.field4681[var181] == null) {
                                    field6688[var3++] = "";
                                } else {
                                    field6688[var3++] = class310.field4681[var181];
                                }
                                continue;
                            }
                            field6688[var3++] = "";
                            field6688[var3++] = "";
                            continue;
                        }
                        if (var616 == 3602) {
                            var2--;
                            int var182 = field6679[var2];
                            if (class425.field6082 == 2 && var182 < class157.field2190) {
                                field6679[var2++] = class484.field6787[var182];
                                continue;
                            }
                            field6679[var2++] = 0;
                            continue;
                        }
                        if (var616 == 3603) {
                            var2--;
                            int var183 = field6679[var2];
                            if (class425.field6082 == 2 && var183 < class157.field2190) {
                                field6679[var2++] = class245.field3499[var183];
                                continue;
                            }
                            field6679[var2++] = 0;
                            continue;
                        }
                        if (var616 == 3604) {
                            var3--;
                            String var184 = field6688[var3];
                            var2--;
                            int var185 = field6679[var2];
                            class206.method1401(var185, var184, 1);
                            continue;
                        }
                        if (var616 == 3605) {
                            var3--;
                            String var186 = field6688[var3];
                            class4.method35(-97, var186);
                            continue;
                        }
                        if (var616 == 3606) {
                            var3--;
                            String var187 = field6688[var3];
                            class488.method2850(1, var187);
                            continue;
                        }
                        if (var616 == 3607) {
                            var3--;
                            String var188 = field6688[var3];
                            class28.method240(var188, false, (byte) -120);
                            continue;
                        }
                        if (var616 == 3608) {
                            var3--;
                            String var189 = field6688[var3];
                            class257.method1694(102400, var189);
                            continue;
                        }
                        if (var616 == 3609) {
                            var3--;
                            String var190 = field6688[var3];
                            if (var190.startsWith("<img=0>") || var190.startsWith("<img=1>")) {
                                var190 = var190.substring(7);
                            }
                            field6679[var2++] = class45.method326(var190, 115) ? 1 : 0;
                            continue;
                        }
                        if (var616 == 3610) {
                            var2--;
                            int var191 = field6679[var2];
                            if (class425.field6082 == 2 && var191 < class157.field2190) {
                                field6688[var3++] = class95.field1354[var191];
                                continue;
                            }
                            field6688[var3++] = "";
                            continue;
                        }
                        if (var616 == 3611) {
                            if (class119.field1651 == null) {
                                field6688[var3++] = "";
                            } else {
                                field6688[var3++] = class184.method1259(class119.field1651, (byte) -122);
                            }
                            continue;
                        }
                        if (var616 == 3612) {
                            if (class119.field1651 == null) {
                                field6679[var2++] = 0;
                            } else {
                                field6679[var2++] = class210.field3152;
                            }
                            continue;
                        }
                        if (var616 == 3613) {
                            var2--;
                            int var192 = field6679[var2];
                            if (class119.field1651 != null && var192 < class210.field3152) {
                                field6688[var3++] = class353.field5369[var192].field5068;
                                continue;
                            }
                            field6688[var3++] = "";
                            continue;
                        }
                        if (var616 == 3614) {
                            var2--;
                            int var193 = field6679[var2];
                            if (class119.field1651 != null && var193 < class210.field3152) {
                                field6679[var2++] = class353.field5369[var193].field5069;
                                continue;
                            }
                            field6679[var2++] = 0;
                            continue;
                        }
                        if (var616 == 3615) {
                            var2--;
                            int var194 = field6679[var2];
                            if (class119.field1651 != null && var194 < class210.field3152) {
                                field6679[var2++] = class353.field5369[var194].field5075;
                                continue;
                            }
                            field6679[var2++] = 0;
                            continue;
                        }
                        if (var616 == 3616) {
                            field6679[var2++] = class483.field6779;
                            continue;
                        }
                        if (var616 == 3617) {
                            var3--;
                            String var195 = field6688[var3];
                            class394.method2377(-5007, var195);
                            continue;
                        }
                        if (var616 == 3618) {
                            field6679[var2++] = class220.field3249;
                            continue;
                        }
                        if (var616 == 3619) {
                            var3--;
                            String var196 = field6688[var3];
                            class171.method1183(0, var196);
                            continue;
                        }
                        if (var616 == 3620) {
                            class299.method1867(-66);
                            continue;
                        }
                        if (var616 == 3621) {
                            if (class425.field6082 == 0) {
                                field6679[var2++] = -1;
                            } else {
                                field6679[var2++] = class330.field4951;
                            }
                            continue;
                        }
                        if (var616 == 3622) {
                            var2--;
                            int var197 = field6679[var2];
                            if (class425.field6082 != 0 && var197 < class330.field4951) {
                                field6688[var3++] = class436.field6168[var197];
                                if (class68.field930[var197] == null) {
                                    field6688[var3++] = "";
                                } else {
                                    field6688[var3++] = class68.field930[var197];
                                }
                                continue;
                            }
                            field6688[var3++] = "";
                            field6688[var3++] = "";
                            continue;
                        }
                        if (var616 == 3623) {
                            var3--;
                            String var198 = field6688[var3];
                            if (var198.startsWith("<img=0>") || var198.startsWith("<img=1>")) {
                                var198 = var198.substring(7);
                            }
                            field6679[var2++] = class15.method140(var198, (byte) -68) ? 1 : 0;
                            continue;
                        }
                        if (var616 == 3624) {
                            var2--;
                            int var199 = field6679[var2];
                            if (class353.field5369 != null && var199 < class210.field3152 && class353.field5369[var199].field5072.equalsIgnoreCase(class472.field6622.field3839)) {
                                field6679[var2++] = 1;
                                continue;
                            }
                            field6679[var2++] = 0;
                            continue;
                        }
                        if (var616 == 3625) {
                            if (class124.field1709 == null) {
                                field6688[var3++] = "";
                            } else {
                                field6688[var3++] = class124.field1709;
                            }
                            continue;
                        }
                        if (var616 == 3626) {
                            var2--;
                            int var200 = field6679[var2];
                            if (class119.field1651 != null && var200 < class210.field3152) {
                                field6688[var3++] = class353.field5369[var200].field5074;
                                continue;
                            }
                            field6688[var3++] = "";
                            continue;
                        }
                        if (var616 == 3627) {
                            var2--;
                            int var201 = field6679[var2];
                            if (class425.field6082 == 2 && var201 >= 0 && var201 < class157.field2190) {
                                field6679[var2++] = class176.field2498[var201] ? 1 : 0;
                                continue;
                            }
                            field6679[var2++] = 0;
                            continue;
                        }
                        if (var616 == 3628) {
                            var3--;
                            String var202 = field6688[var3];
                            if (var202.startsWith("<img=0>") || var202.startsWith("<img=1>")) {
                                var202 = var202.substring(7);
                            }
                            field6679[var2++] = class233.method1526(217, var202);
                            continue;
                        }
                        if (var616 == 3629) {
                            field6679[var2++] = class146.field2069;
                            continue;
                        }
                        if (var616 == 3630) {
                            var3--;
                            String var203 = field6688[var3];
                            class28.method240(var203, true, (byte) -117);
                            continue;
                        }
                        if (var616 == 3631) {
                            var2--;
                            int var204 = field6679[var2];
                            field6679[var2++] = class78.field1106[var204] ? 1 : 0;
                            continue;
                        }
                        if (var616 == 3632) {
                            var2--;
                            int var205 = field6679[var2];
                            if (class119.field1651 != null && var205 < class210.field3152) {
                                field6688[var3++] = class353.field5369[var205].field5072;
                                continue;
                            }
                            field6688[var3++] = "";
                            continue;
                        }
                        if (var616 == 3633) {
                            var2--;
                            int var206 = field6679[var2];
                            if (class425.field6082 != 0 && var206 < class330.field4951) {
                                field6688[var3++] = class456.field6474[var206];
                                continue;
                            }
                            field6688[var3++] = "";
                            continue;
                        }
                    } else if (var616 < 4000) {
                        if (var616 == 3903) {
                            var2--;
                            int var207 = field6679[var2];
                            field6679[var2++] = class447.field6338[var207].method2321((byte) 28);
                            continue;
                        }
                        if (var616 == 3904) {
                            var2--;
                            int var208 = field6679[var2];
                            field6679[var2++] = class447.field6338[var208].field5632;
                            continue;
                        }
                        if (var616 == 3905) {
                            var2--;
                            int var209 = field6679[var2];
                            field6679[var2++] = class447.field6338[var209].field5636;
                            continue;
                        }
                        if (var616 == 3906) {
                            var2--;
                            int var210 = field6679[var2];
                            field6679[var2++] = class447.field6338[var210].field5633;
                            continue;
                        }
                        if (var616 == 3907) {
                            var2--;
                            int var211 = field6679[var2];
                            field6679[var2++] = class447.field6338[var211].field5631;
                            continue;
                        }
                        if (var616 == 3908) {
                            var2--;
                            int var212 = field6679[var2];
                            field6679[var2++] = class447.field6338[var212].field5637;
                            continue;
                        }
                        if (var616 == 3910) {
                            var2--;
                            int var213 = field6679[var2];
                            int var214 = class447.field6338[var213].method2322((byte) 104);
                            field6679[var2++] = var214 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 3911) {
                            var2--;
                            int var215 = field6679[var2];
                            int var216 = class447.field6338[var215].method2322((byte) 127);
                            field6679[var2++] = var216 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 3912) {
                            var2--;
                            int var217 = field6679[var2];
                            int var218 = class447.field6338[var217].method2322((byte) 99);
                            field6679[var2++] = var218 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 3913) {
                            var2--;
                            int var219 = field6679[var2];
                            int var220 = class447.field6338[var219].method2322((byte) 79);
                            field6679[var2++] = var220 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var616 < 4100) {
                        if (var616 == 4000) {
                            var2 -= 2;
                            int var221 = field6679[var2];
                            int var222 = field6679[var2 + 1];
                            field6679[var2++] = var221 + var222;
                            continue;
                        }
                        if (var616 == 4001) {
                            var2 -= 2;
                            int var223 = field6679[var2];
                            int var224 = field6679[var2 + 1];
                            field6679[var2++] = var223 - var224;
                            continue;
                        }
                        if (var616 == 4002) {
                            var2 -= 2;
                            int var225 = field6679[var2];
                            int var226 = field6679[var2 + 1];
                            field6679[var2++] = var225 * var226;
                            continue;
                        }
                        if (var616 == 4003) {
                            var2 -= 2;
                            int var227 = field6679[var2];
                            int var228 = field6679[var2 + 1];
                            field6679[var2++] = var227 / var228;
                            continue;
                        }
                        if (var616 == 4004) {
                            var2--;
                            int var229 = field6679[var2];
                            field6679[var2++] = (int) (Math.random() * (double) var229);
                            continue;
                        }
                        if (var616 == 4005) {
                            var2--;
                            int var230 = field6679[var2];
                            field6679[var2++] = (int) (Math.random() * (double) (var230 + 1));
                            continue;
                        }
                        if (var616 == 4006) {
                            var2 -= 5;
                            int var231 = field6679[var2];
                            int var232 = field6679[var2 + 1];
                            int var233 = field6679[var2 + 2];
                            int var234 = field6679[var2 + 3];
                            int var235 = field6679[var2 + 4];
                            field6679[var2++] = (var232 - var231) * (var235 - var233) / (var234 - var233) + var231;
                            continue;
                        }
                        if (var616 == 4007) {
                            var2 -= 2;
                            long var236 = (long) field6679[var2];
                            long var238 = (long) field6679[var2 + 1];
                            field6679[var2++] = (int) (var236 * var238 / 100L + var236);
                            continue;
                        }
                        if (var616 == 4008) {
                            var2 -= 2;
                            int var240 = field6679[var2];
                            int var241 = field6679[var2 + 1];
                            field6679[var2++] = var240 | 0x1 << var241;
                            continue;
                        }
                        if (var616 == 4009) {
                            var2 -= 2;
                            int var242 = field6679[var2];
                            int var243 = field6679[var2 + 1];
                            field6679[var2++] = var242 & -(0x1 << var243) - 1;
                            continue;
                        }
                        if (var616 == 4010) {
                            var2 -= 2;
                            int var244 = field6679[var2];
                            int var245 = field6679[var2 + 1];
                            field6679[var2++] = (var244 & 0x1 << var245) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var616 == 4011) {
                            var2 -= 2;
                            int var246 = field6679[var2];
                            int var247 = field6679[var2 + 1];
                            field6679[var2++] = var246 % var247;
                            continue;
                        }
                        if (var616 == 4012) {
                            var2 -= 2;
                            int var248 = field6679[var2];
                            int var249 = field6679[var2 + 1];
                            if (var248 == 0) {
                                field6679[var2++] = 0;
                            } else {
                                field6679[var2++] = (int) Math.pow((double) var248, (double) var249);
                            }
                            continue;
                        }
                        if (var616 == 4013) {
                            var2 -= 2;
                            int var250 = field6679[var2];
                            int var251 = field6679[var2 + 1];
                            if (var250 == 0) {
                                field6679[var2++] = 0;
                            } else if (var251 == 0) {
                                field6679[var2++] = Integer.MAX_VALUE;
                            } else {
                                field6679[var2++] = (int) Math.pow((double) var250, 1.0D / (double) var251);
                            }
                            continue;
                        }
                        if (var616 == 4014) {
                            var2 -= 2;
                            int var252 = field6679[var2];
                            int var253 = field6679[var2 + 1];
                            field6679[var2++] = var252 & var253;
                            continue;
                        }
                        if (var616 == 4015) {
                            var2 -= 2;
                            int var254 = field6679[var2];
                            int var255 = field6679[var2 + 1];
                            field6679[var2++] = var254 | var255;
                            continue;
                        }
                        if (var616 == 4016) {
                            var2 -= 2;
                            int var256 = field6679[var2];
                            int var257 = field6679[var2 + 1];
                            field6679[var2++] = var256 < var257 ? var256 : var257;
                            continue;
                        }
                        if (var616 == 4017) {
                            var2 -= 2;
                            int var258 = field6679[var2];
                            int var259 = field6679[var2 + 1];
                            field6679[var2++] = var258 > var259 ? var258 : var259;
                            continue;
                        }
                        if (var616 == 4018) {
                            var2 -= 3;
                            long var260 = (long) field6679[var2];
                            long var262 = (long) field6679[var2 + 1];
                            long var264 = (long) field6679[var2 + 2];
                            field6679[var2++] = (int) (var260 * var264 / var262);
                            continue;
                        }
                    } else if (var616 < 4200) {
                        if (var616 == 4100) {
                            var3--;
                            String var266 = field6688[var3];
                            var2--;
                            int var267 = field6679[var2];
                            field6688[var3++] = var266 + var267;
                            continue;
                        }
                        if (var616 == 4101) {
                            var3 -= 2;
                            String var268 = field6688[var3];
                            String var269 = field6688[var3 + 1];
                            field6688[var3++] = var268 + var269;
                            continue;
                        }
                        if (var616 == 4102) {
                            var3--;
                            String var270 = field6688[var3];
                            var2--;
                            int var271 = field6679[var2];
                            field6688[var3++] = var270 + class439.method2558(105, var271, true);
                            continue;
                        }
                        if (var616 == 4103) {
                            var3--;
                            String var272 = field6688[var3];
                            field6688[var3++] = var272.toLowerCase();
                            continue;
                        }
                        if (var616 == 4104) {
                            var10001 = var3++;
                            var2--;
                            field6688[var10001] = method2798(field6679[var2]);
                            continue;
                        }
                        if (var616 == 4105) {
                            var3 -= 2;
                            String var273 = field6688[var3];
                            String var274 = field6688[var3 + 1];
                            if (class472.field6622.field3833 != null && class472.field6622.field3833.field4953) {
                                field6688[var3++] = var274;
                                continue;
                            }
                            field6688[var3++] = var273;
                            continue;
                        }
                        if (var616 == 4106) {
                            var2--;
                            int var275 = field6679[var2];
                            field6688[var3++] = Integer.toString(var275);
                            continue;
                        }
                        if (var616 == 4107) {
                            var3 -= 2;
                            field6679[var2++] = class422.method2492(field6688[var3], -1, class4.field85, field6688[var3 + 1]);
                            continue;
                        }
                        if (var616 == 4108) {
                            var3--;
                            String var276 = field6688[var3];
                            var2 -= 2;
                            int var277 = field6679[var2];
                            int var278 = field6679[var2 + 1];
                            class1 var279 = class361.method2221(class388.field5716, 86, 0, var278);
                            field6679[var2++] = var279.method5(-1, class186.field2816, var277, var276);
                            continue;
                        }
                        if (var616 == 4109) {
                            var3--;
                            String var280 = field6688[var3];
                            var2 -= 2;
                            int var281 = field6679[var2];
                            int var282 = field6679[var2 + 1];
                            class1 var283 = class361.method2221(class388.field5716, 84, 0, var282);
                            field6679[var2++] = var283.method1(var280, var281, class186.field2816, 0);
                            continue;
                        }
                        if (var616 == 4110) {
                            var3 -= 2;
                            String var284 = field6688[var3];
                            String var285 = field6688[var3 + 1];
                            var2--;
                            if (field6679[var2] == 1) {
                                field6688[var3++] = var284;
                            } else {
                                field6688[var3++] = var285;
                            }
                            continue;
                        }
                        if (var616 == 4111) {
                            var3--;
                            String var286 = field6688[var3];
                            field6688[var3++] = class459.method2712(var286, -60);
                            continue;
                        }
                        if (var616 == 4112) {
                            var3--;
                            String var287 = field6688[var3];
                            var2--;
                            int var288 = field6679[var2];
                            if (var288 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field6688[var3++] = var287 + (char) var288;
                            continue;
                        }
                        if (var616 == 4113) {
                            var2--;
                            int var289 = field6679[var2];
                            field6679[var2++] = class208.method1407(false, (char) var289) ? 1 : 0;
                            continue;
                        }
                        if (var616 == 4114) {
                            var2--;
                            int var290 = field6679[var2];
                            field6679[var2++] = class178.method1234(56, (char) var290) ? 1 : 0;
                            continue;
                        }
                        if (var616 == 4115) {
                            var2--;
                            int var291 = field6679[var2];
                            field6679[var2++] = class70.method611((char) var291, 0) ? 1 : 0;
                            continue;
                        }
                        if (var616 == 4116) {
                            var2--;
                            int var292 = field6679[var2];
                            field6679[var2++] = class92.method713(-49, (char) var292) ? 1 : 0;
                            continue;
                        }
                        if (var616 == 4117) {
                            var3--;
                            String var293 = field6688[var3];
                            if (var293 == null) {
                                field6679[var2++] = 0;
                            } else {
                                field6679[var2++] = var293.length();
                            }
                            continue;
                        }
                        if (var616 == 4118) {
                            var3--;
                            String var294 = field6688[var3];
                            var2 -= 2;
                            int var295 = field6679[var2];
                            int var296 = field6679[var2 + 1];
                            field6688[var3++] = var294.substring(var295, var296);
                            continue;
                        }
                        if (var616 == 4119) {
                            var3--;
                            String var297 = field6688[var3];
                            StringBuffer var298 = new StringBuffer(var297.length());
                            boolean var299 = false;
                            for (int var300 = 0; var300 < var297.length(); var300++) {
                                char var301 = var297.charAt(var300);
                                if (var301 == '<') {
                                    var299 = true;
                                } else if (var301 == '>') {
                                    var299 = false;
                                } else if (!var299) {
                                    var298.append(var301);
                                }
                            }
                            field6688[var3++] = var298.toString();
                            continue;
                        }
                        if (var616 == 4120) {
                            var3--;
                            String var302 = field6688[var3];
                            var2 -= 2;
                            int var303 = field6679[var2];
                            int var304 = field6679[var2 + 1];
                            field6679[var2++] = var302.indexOf(var303, var304);
                            continue;
                        }
                        if (var616 == 4121) {
                            var3 -= 2;
                            String var305 = field6688[var3];
                            String var306 = field6688[var3 + 1];
                            var2--;
                            int var307 = field6679[var2];
                            field6679[var2++] = var305.indexOf(var306, var307);
                            continue;
                        }
                        if (var616 == 4122) {
                            var2--;
                            int var308 = field6679[var2];
                            field6679[var2++] = Character.toLowerCase((char) var308);
                            continue;
                        }
                        if (var616 == 4123) {
                            var2--;
                            int var309 = field6679[var2];
                            field6679[var2++] = Character.toUpperCase((char) var309);
                            continue;
                        }
                        if (var616 == 4124) {
                            var2--;
                            boolean var310 = field6679[var2] != 0;
                            var2--;
                            int var311 = field6679[var2];
                            field6688[var3++] = class262.method1719(0, 75, class4.field85, var310, (long) var311);
                            continue;
                        }
                        if (var616 == 4125) {
                            var3--;
                            String var312 = field6688[var3];
                            var2--;
                            int var313 = field6679[var2];
                            class1 var314 = class361.method2221(class388.field5716, 43, 0, var313);
                            field6679[var2++] = var314.method2(var312, class186.field2816, -82);
                            continue;
                        }
                    } else if (var616 < 4300) {
                        if (var616 == 4200) {
                            var2--;
                            int var315 = field6679[var2];
                            field6688[var3++] = class23.field309.method2364((byte) 118, var315).field2722;
                            continue;
                        }
                        if (var616 == 4201) {
                            var2 -= 2;
                            int var316 = field6679[var2];
                            int var317 = field6679[var2 + 1];
                            class184 var318 = class23.field309.method2364((byte) 118, var316);
                            if (var317 >= 1 && var317 <= 5 && var318.field2801[var317 - 1] != null) {
                                field6688[var3++] = var318.field2801[var317 - 1];
                                continue;
                            }
                            field6688[var3++] = "";
                            continue;
                        }
                        if (var616 == 4202) {
                            var2 -= 2;
                            int var319 = field6679[var2];
                            int var320 = field6679[var2 + 1];
                            class184 var321 = class23.field309.method2364((byte) 118, var319);
                            if (var320 >= 1 && var320 <= 5 && var321.field2729[var320 - 1] != null) {
                                field6688[var3++] = var321.field2729[var320 - 1];
                                continue;
                            }
                            field6688[var3++] = "";
                            continue;
                        }
                        if (var616 == 4203) {
                            var2--;
                            int var322 = field6679[var2];
                            field6679[var2++] = class23.field309.method2364((byte) 118, var322).field2769;
                            continue;
                        }
                        if (var616 == 4204) {
                            var2--;
                            int var323 = field6679[var2];
                            field6679[var2++] = class23.field309.method2364((byte) 118, var323).field2768 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 4205) {
                            var2--;
                            int var324 = field6679[var2];
                            class184 var325 = class23.field309.method2364((byte) 118, var324);
                            if (var325.field2773 == -1 && var325.field2756 >= 0) {
                                field6679[var2++] = var325.field2756;
                                continue;
                            }
                            field6679[var2++] = var324;
                            continue;
                        }
                        if (var616 == 4206) {
                            var2--;
                            int var326 = field6679[var2];
                            class184 var327 = class23.field309.method2364((byte) 118, var326);
                            if (var327.field2773 >= 0 && var327.field2756 >= 0) {
                                field6679[var2++] = var327.field2756;
                                continue;
                            }
                            field6679[var2++] = var326;
                            continue;
                        }
                        if (var616 == 4207) {
                            var2--;
                            int var328 = field6679[var2];
                            field6679[var2++] = class23.field309.method2364((byte) 118, var328).field2779 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 4208) {
                            var2 -= 2;
                            int var329 = field6679[var2];
                            int var330 = field6679[var2 + 1];
                            class170 var331 = class237.field3463.method1398(-109, var330);
                            if (var331.method1179(-116)) {
                                field6688[var3++] = class23.field309.method2364((byte) 118, var329).method1258(var331.field2430, (byte) -22, var330);
                            } else {
                                field6679[var2++] = class23.field309.method2364((byte) 118, var329).method1268((byte) -58, var331.field2419, var330);
                            }
                            continue;
                        }
                        if (var616 == 4209) {
                            var2 -= 2;
                            int var332 = field6679[var2];
                            int var333 = field6679[var2 + 1] - 1;
                            class184 var334 = class23.field309.method2364((byte) 118, var332);
                            if (var334.field2804 == var333) {
                                field6679[var2++] = var334.field2800;
                            } else if (var334.field2726 == var333) {
                                field6679[var2++] = var334.field2743;
                            } else {
                                field6679[var2++] = -1;
                            }
                            continue;
                        }
                        if (var616 == 4210) {
                            var3--;
                            String var335 = field6688[var3];
                            var2--;
                            int var336 = field6679[var2];
                            class143.method982(var335, var336 == 1, false);
                            field6679[var2++] = class27.field352;
                            continue;
                        }
                        if (var616 == 4211) {
                            if (class394.field5804 != null && class373.field5601 < class27.field352) {
                                field6679[var2++] = class394.field5804[class373.field5601++] & 0xFFFF;
                                continue;
                            }
                            field6679[var2++] = -1;
                            continue;
                        }
                        if (var616 == 4212) {
                            class373.field5601 = 0;
                            continue;
                        }
                    } else if (var616 < 4400) {
                        if (var616 == 4300) {
                            var2 -= 2;
                            int var337 = field6679[var2];
                            int var338 = field6679[var2 + 1];
                            class170 var339 = class237.field3463.method1398(-126, var338);
                            if (var339.method1179(-126)) {
                                field6688[var3++] = class448.field6339.method334(var337, (byte) 104).method1785(var338, var339.field2430, (byte) -40);
                            } else {
                                field6679[var2++] = class448.field6339.method334(var337, (byte) 104).method1780(var339.field2419, 15, var338);
                            }
                            continue;
                        }
                    } else if (var616 < 4500) {
                        if (var616 == 4400) {
                            var2 -= 2;
                            int var340 = field6679[var2];
                            int var341 = field6679[var2 + 1];
                            class170 var342 = class237.field3463.method1398(-104, var341);
                            if (var342.method1179(-120)) {
                                field6688[var3++] = class206.field3124.method338((byte) 100, var340).method1770((byte) -108, var341, var342.field2430);
                            } else {
                                field6679[var2++] = class206.field3124.method338((byte) 121, var340).method1765(var342.field2419, var341, 61);
                            }
                            continue;
                        }
                    } else if (var616 < 4600) {
                        if (var616 == 4500) {
                            var2 -= 2;
                            int var343 = field6679[var2];
                            int var344 = field6679[var2 + 1];
                            class170 var345 = class237.field3463.method1398(-127, var344);
                            if (var345.method1179(-124)) {
                                field6688[var3++] = class258.field3853.method1970(var343, 0).method818(57, var344, var345.field2430);
                            } else {
                                field6679[var2++] = class258.field3853.method1970(var343, 0).method824(var345.field2419, (byte) -90, var344);
                            }
                            continue;
                        }
                    } else if (var616 < 4700) {
                        if (var616 == 4600) {
                            var2--;
                            int var346 = field6679[var2];
                            class322 var347 = class297.field4454.method1829(var346, (byte) -57);
                            if (var347.field4833 != null && var347.field4833.length > 0) {
                                int var348 = 0;
                                int var349 = var347.field4831[0];
                                for (int var350 = 1; var350 < var347.field4833.length; var350++) {
                                    if (var347.field4831[var350] > var349) {
                                        var348 = var350;
                                        var349 = var347.field4831[var350];
                                    }
                                }
                                field6679[var2++] = var347.field4833[var348];
                                continue;
                            }
                            field6679[var2++] = var347.field4843;
                            continue;
                        }
                    } else if (var616 < 5100) {
                        if (var616 == 5000) {
                            field6679[var2++] = class27.field358;
                            continue;
                        }
                        if (var616 == 5001) {
                            var2 -= 3;
                            class27.field358 = field6679[var2];
                            class132.field1836 = class17.method175(11332, field6679[var2 + 1]);
                            if (class132.field1836 == null) {
                                class132.field1836 = class424.field6068;
                            }
                            class412.field5943 = field6679[var2 + 2];
                            field6690++;
                            class378.method2320(class483.field6778, (byte) 119);
                            class230.field3390.method2619((byte) -128, class27.field358);
                            class230.field3390.method2619((byte) -125, class132.field1836.field1704);
                            class230.field3390.method2619((byte) -2, class412.field5943);
                            continue;
                        }
                        if (var616 == 5002) {
                            var3 -= 2;
                            String var351 = field6688[var3];
                            String var352 = field6688[var3 + 1];
                            var2 -= 2;
                            int var353 = field6679[var2];
                            int var354 = field6679[var2 + 1];
                            if (var352 == null) {
                                var352 = "";
                            }
                            if (var352.length() > 80) {
                                var352 = var352.substring(0, 80);
                            }
                            field6691++;
                            class378.method2320(class187.field2849, (byte) 119);
                            class230.field3390.method2619((byte) -19, class330.method2021((byte) 118, var351) + class330.method2021((byte) 113, var352) + 2);
                            class230.field3390.method2597(var351, (byte) -125);
                            class230.field3390.method2619((byte) 45, var353 - 1);
                            class230.field3390.method2619((byte) 55, var354);
                            class230.field3390.method2597(var352, (byte) -104);
                            continue;
                        }
                        if (var616 == 5003) {
                            var2--;
                            int var355 = field6679[var2];
                            String var356 = null;
                            if (var355 < 100) {
                                var356 = class261.field3874[var355];
                            }
                            if (var356 == null) {
                                var356 = "";
                            }
                            field6688[var3++] = var356;
                            continue;
                        }
                        if (var616 == 5004) {
                            var2--;
                            int var357 = field6679[var2];
                            int var358 = -1;
                            if (var357 < 100 && class261.field3874[var357] != null) {
                                var358 = class124.field1700[var357];
                            }
                            field6679[var2++] = var358;
                            continue;
                        }
                        if (var616 == 5005) {
                            if (class132.field1836 == null) {
                                field6679[var2++] = -1;
                            } else {
                                field6679[var2++] = class132.field1836.field1704;
                            }
                            continue;
                        }
                        if (var616 == 5008 || var616 == 5021) {
                            var3--;
                            String var359 = field6688[var3];
                            method2794(var359, var616);
                            continue;
                        }
                        if (var616 == 5009) {
                            var3 -= 2;
                            String var360 = field6688[var3];
                            String var361 = field6688[var3 + 1];
                            if (class465.field6556 != 0 || (!class305.field4555 || class174.field2468) && !class206.field3122) {
                                field6680++;
                                class378.method2320(class459.field6499, (byte) 119);
                                class230.field3390.method2619((byte) -119, 0);
                                int var362 = class230.field3390.field6315;
                                class230.field3390.method2597(var360, (byte) -122);
                                class439.method2553(var361, -104, class230.field3390);
                                class230.field3390.method2603(class230.field3390.field6315 - var362, -24420);
                            }
                            continue;
                        }
                        if (var616 == 5010) {
                            var2--;
                            int var363 = field6679[var2];
                            String var364 = null;
                            if (var363 < 100) {
                                var364 = class225.field3263[var363];
                            }
                            if (var364 == null) {
                                var364 = "";
                            }
                            field6688[var3++] = var364;
                            continue;
                        }
                        if (var616 == 5011) {
                            var2--;
                            int var365 = field6679[var2];
                            String var366 = null;
                            if (var365 < 100) {
                                var366 = class492.field6928[var365];
                            }
                            if (var366 == null) {
                                var366 = "";
                            }
                            field6688[var3++] = var366;
                            continue;
                        }
                        if (var616 == 5012) {
                            var2--;
                            int var367 = field6679[var2];
                            int var368 = -1;
                            if (var367 < 100) {
                                var368 = class140.field2003[var367];
                            }
                            field6679[var2++] = var368;
                            continue;
                        }
                        if (var616 == 5015) {
                            String var369;
                            if (class472.field6622 == null || class472.field6622.field3799 == null) {
                                var369 = class324.field4860;
                            } else {
                                var369 = class472.field6622.method1693(true, (byte) -67);
                            }
                            field6688[var3++] = var369;
                            continue;
                        }
                        if (var616 == 5016) {
                            field6679[var2++] = class412.field5943;
                            continue;
                        }
                        if (var616 == 5017) {
                            field6679[var2++] = class17.field226;
                            continue;
                        }
                        if (var616 == 5018) {
                            var2--;
                            int var370 = field6679[var2];
                            int var371 = 0;
                            if (var370 < 100 && class261.field3874[var370] != null) {
                                var371 = class124.field1700[var370];
                            }
                            field6679[var2++] = var371;
                            continue;
                        }
                        if (var616 == 5019) {
                            var2--;
                            int var372 = field6679[var2];
                            String var373 = null;
                            if (var372 < 100) {
                                var373 = class401.field5863[var372];
                            }
                            if (var373 == null) {
                                var373 = "";
                            }
                            field6688[var3++] = var373;
                            continue;
                        }
                        if (var616 == 5020) {
                            String var374;
                            if (class472.field6622 == null || class472.field6622.field3799 == null) {
                                var374 = class324.field4860;
                            } else {
                                var374 = class472.field6622.method1699(false, -1);
                            }
                            field6688[var3++] = var374;
                            continue;
                        }
                        if (var616 == 5050) {
                            var2--;
                            int var375 = field6679[var2];
                            field6688[var3++] = class240.method1554(var375, 0).field3232;
                            continue;
                        }
                        if (var616 == 5051) {
                            var2--;
                            int var376 = field6679[var2];
                            class219 var377 = class240.method1554(var376, 0);
                            if (var377.field3238 == null) {
                                field6679[var2++] = 0;
                            } else {
                                field6679[var2++] = var377.field3238.length;
                            }
                            continue;
                        }
                        if (var616 == 5052) {
                            var2 -= 2;
                            int var378 = field6679[var2];
                            int var379 = field6679[var2 + 1];
                            class219 var380 = class240.method1554(var378, 0);
                            int var381 = var380.field3238[var379];
                            field6679[var2++] = var381;
                            continue;
                        }
                        if (var616 == 5053) {
                            var2--;
                            int var382 = field6679[var2];
                            class219 var383 = class240.method1554(var382, 0);
                            if (var383.field3241 == null) {
                                field6679[var2++] = 0;
                            } else {
                                field6679[var2++] = var383.field3241.length;
                            }
                            continue;
                        }
                        if (var616 == 5054) {
                            var2 -= 2;
                            int var384 = field6679[var2];
                            int var385 = field6679[var2 + 1];
                            field6679[var2++] = class240.method1554(var384, 0).field3241[var385];
                            continue;
                        }
                        if (var616 == 5055) {
                            var2--;
                            int var386 = field6679[var2];
                            field6688[var3++] = class305.method1903(var386, true).method756(true);
                            continue;
                        }
                        if (var616 == 5056) {
                            var2--;
                            int var387 = field6679[var2];
                            class96 var388 = class305.method1903(var387, true);
                            if (var388.field1381 == null) {
                                field6679[var2++] = 0;
                            } else {
                                field6679[var2++] = var388.field1381.length;
                            }
                            continue;
                        }
                        if (var616 == 5057) {
                            var2 -= 2;
                            int var389 = field6679[var2];
                            int var390 = field6679[var2 + 1];
                            field6679[var2++] = class305.method1903(var389, true).field1381[var390];
                            continue;
                        }
                        if (var616 == 5058) {
                            field6698 = new class436();
                            var2--;
                            field6698.field6171 = field6679[var2];
                            field6698.field6172 = class305.method1903(field6698.field6171, true);
                            field6698.field6169 = new int[field6698.field6172.method757(113)];
                            continue;
                        }
                        if (var616 == 5059) {
                            field6686++;
                            class378.method2320(class465.field6553, (byte) 119);
                            class230.field3390.method2619((byte) 125, 0);
                            int var391 = class230.field3390.field6315;
                            class230.field3390.method2619((byte) -126, 0);
                            class230.field3390.method2592(field6698.field6171, (byte) -104);
                            field6698.field6172.method758(class230.field3390, 116, field6698.field6169);
                            class230.field3390.method2603(class230.field3390.field6315 - var391, -24420);
                            continue;
                        }
                        if (var616 == 5060) {
                            var3--;
                            String var392 = field6688[var3];
                            field6699++;
                            class378.method2320(class85.field1196, (byte) 119);
                            class230.field3390.method2619((byte) -120, 0);
                            int var393 = class230.field3390.field6315;
                            class230.field3390.method2597(var392, (byte) -101);
                            class230.field3390.method2592(field6698.field6171, (byte) -104);
                            field6698.field6172.method758(class230.field3390, 111, field6698.field6169);
                            class230.field3390.method2603(class230.field3390.field6315 - var393, -24420);
                            continue;
                        }
                        if (var616 == 5061) {
                            field6686++;
                            class378.method2320(class465.field6553, (byte) 119);
                            class230.field3390.method2619((byte) -124, 0);
                            int var394 = class230.field3390.field6315;
                            class230.field3390.method2619((byte) 51, 1);
                            class230.field3390.method2592(field6698.field6171, (byte) -103);
                            field6698.field6172.method758(class230.field3390, -27, field6698.field6169);
                            class230.field3390.method2603(class230.field3390.field6315 - var394, -24420);
                            continue;
                        }
                        if (var616 == 5062) {
                            var2 -= 2;
                            int var395 = field6679[var2];
                            int var396 = field6679[var2 + 1];
                            field6679[var2++] = class240.method1554(var395, 0).field3237[var396];
                            continue;
                        }
                        if (var616 == 5063) {
                            var2 -= 2;
                            int var397 = field6679[var2];
                            int var398 = field6679[var2 + 1];
                            field6679[var2++] = class240.method1554(var397, 0).field3240[var398];
                            continue;
                        }
                        if (var616 == 5064) {
                            var2 -= 2;
                            int var399 = field6679[var2];
                            int var400 = field6679[var2 + 1];
                            if (var400 == -1) {
                                field6679[var2++] = -1;
                            } else {
                                field6679[var2++] = class240.method1554(var399, 0).method1448((char) var400, -98);
                            }
                            continue;
                        }
                        if (var616 == 5065) {
                            var2 -= 2;
                            int var401 = field6679[var2];
                            int var402 = field6679[var2 + 1];
                            if (var402 == -1) {
                                field6679[var2++] = -1;
                            } else {
                                field6679[var2++] = class240.method1554(var401, 0).method1442(-78, (char) var402);
                            }
                            continue;
                        }
                        if (var616 == 5066) {
                            var2--;
                            int var403 = field6679[var2];
                            field6679[var2++] = class305.method1903(var403, true).method757(121);
                            continue;
                        }
                        if (var616 == 5067) {
                            var2 -= 2;
                            int var404 = field6679[var2];
                            int var405 = field6679[var2 + 1];
                            int var406 = class305.method1903(var404, true).method752(var405, -1);
                            field6679[var2++] = var406;
                            continue;
                        }
                        if (var616 == 5068) {
                            var2 -= 2;
                            int var407 = field6679[var2];
                            int var408 = field6679[var2 + 1];
                            field6698.field6169[var407] = var408;
                            continue;
                        }
                        if (var616 == 5069) {
                            var2 -= 2;
                            int var409 = field6679[var2];
                            int var410 = field6679[var2 + 1];
                            field6698.field6169[var409] = var410;
                            continue;
                        }
                        if (var616 == 5070) {
                            var2 -= 3;
                            int var411 = field6679[var2];
                            int var412 = field6679[var2 + 1];
                            int var413 = field6679[var2 + 2];
                            class96 var414 = class305.method1903(var411, true);
                            if (var414.method752(var412, -1) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field6679[var2++] = var414.method761(var413, var412, (byte) -39);
                            continue;
                        }
                        if (var616 == 5071) {
                            var3--;
                            String var415 = field6688[var3];
                            var2--;
                            boolean var416 = field6679[var2] == 1;
                            class344.method2119(var415, var416, 0);
                            field6679[var2++] = class27.field352;
                            continue;
                        }
                        if (var616 == 5072) {
                            if (class394.field5804 != null && class373.field5601 < class27.field352) {
                                field6679[var2++] = class394.field5804[class373.field5601++] & 0xFFFF;
                                continue;
                            }
                            field6679[var2++] = -1;
                            continue;
                        }
                        if (var616 == 5073) {
                            class373.field5601 = 0;
                            continue;
                        }
                    } else if (var616 < 5200) {
                        if (var616 == 5100) {
                            if (class296.field4445.method1100(false, 86)) {
                                field6679[var2++] = 1;
                            } else {
                                field6679[var2++] = 0;
                            }
                            continue;
                        }
                        if (var616 == 5101) {
                            if (class296.field4445.method1100(false, 82)) {
                                field6679[var2++] = 1;
                            } else {
                                field6679[var2++] = 0;
                            }
                            continue;
                        }
                        if (var616 == 5102) {
                            if (class296.field4445.method1100(false, 81)) {
                                field6679[var2++] = 1;
                            } else {
                                field6679[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var616 < 5300) {
                        if (var616 == 5200) {
                            var2--;
                            class155.method1058(127, field6679[var2]);
                            continue;
                        }
                        if (var616 == 5201) {
                            field6679[var2++] = class432.method2529((byte) 26);
                            continue;
                        }
                        if (var616 == 5205) {
                            var2--;
                            class391.method2361(true, -1, -1, false, field6679[var2]);
                            continue;
                        }
                        if (var616 == 5206) {
                            var2--;
                            int var417 = field6679[var2];
                            class12 var418 = class189.method1305(var417 >> 14 & 0x3FFF, var417 & 0x3FFF);
                            if (var418 == null) {
                                field6679[var2++] = -1;
                            } else {
                                field6679[var2++] = var418.field166;
                            }
                            continue;
                        }
                        if (var616 == 5207) {
                            var2--;
                            class12 var419 = class189.method1304(field6679[var2]);
                            if (var419 != null && var419.field171 != null) {
                                field6688[var3++] = var419.field171;
                                continue;
                            }
                            field6688[var3++] = "";
                            continue;
                        }
                        if (var616 == 5208) {
                            field6679[var2++] = class325.field4875;
                            field6679[var2++] = class304.field4531;
                            continue;
                        }
                        if (var616 == 5209) {
                            field6679[var2++] = class384.field5692 + class189.field2912;
                            field6679[var2++] = class446.field6309 + class189.field2902;
                            continue;
                        }
                        if (var616 == 5210) {
                            var2--;
                            int var420 = field6679[var2];
                            class12 var421 = class189.method1304(var420);
                            if (var421 == null) {
                                field6679[var2++] = 0;
                                field6679[var2++] = 0;
                            } else {
                                field6679[var2++] = var421.field172 >> 14 & 0x3FFF;
                                field6679[var2++] = var421.field172 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var616 == 5211) {
                            var2--;
                            int var422 = field6679[var2];
                            class12 var423 = class189.method1304(var422);
                            if (var423 == null) {
                                field6679[var2++] = 0;
                                field6679[var2++] = 0;
                            } else {
                                field6679[var2++] = var423.field180 - var423.field157;
                                field6679[var2++] = var423.field175 - var423.field163;
                            }
                            continue;
                        }
                        if (var616 == 5212) {
                            class290 var424 = class410.method2448(-26390);
                            if (var424 == null) {
                                field6679[var2++] = -1;
                                field6679[var2++] = -1;
                            } else {
                                field6679[var2++] = var424.field4401;
                                int var425 = var424.field4406 << 28 | class189.field2912 + var424.field4404 << 14 | class189.field2902 + var424.field4408;
                                field6679[var2++] = var425;
                            }
                            continue;
                        }
                        if (var616 == 5213) {
                            class290 var426 = class360.method2207(-126);
                            if (var426 == null) {
                                field6679[var2++] = -1;
                                field6679[var2++] = -1;
                            } else {
                                field6679[var2++] = var426.field4401;
                                int var427 = var426.field4406 << 28 | class189.field2912 + var426.field4404 << 14 | class189.field2902 + var426.field4408;
                                field6679[var2++] = var427;
                            }
                            continue;
                        }
                        if (var616 == 5214) {
                            var2--;
                            int var428 = field6679[var2];
                            class12 var429 = class356.method2197((byte) 72);
                            if (var429 != null) {
                                boolean var430 = var429.method124(-115, var428 >> 14 & 0x3FFF, field6701, var428 & 0x3FFF, var428 >> 28 & 0x3);
                                if (var430) {
                                    class365.method2238(field6701[1], (byte) -89, field6701[2]);
                                }
                            }
                            continue;
                        }
                        if (var616 == 5215) {
                            var2 -= 2;
                            int var431 = field6679[var2];
                            int var432 = field6679[var2 + 1];
                            class157 var433 = class189.method1324(var431 >> 14 & 0x3FFF, var431 & 0x3FFF);
                            boolean var434 = false;
                            for (class12 var435 = (class12) var433.method1070((byte) -33); var435 != null; var435 = (class12) var433.method1073(122)) {
                                if (var435.field166 == var432) {
                                    var434 = true;
                                    break;
                                }
                            }
                            if (var434) {
                                field6679[var2++] = 1;
                            } else {
                                field6679[var2++] = 0;
                            }
                            continue;
                        }
                        if (var616 == 5218) {
                            var2--;
                            int var436 = field6679[var2];
                            class12 var437 = class189.method1304(var436);
                            if (var437 == null) {
                                field6679[var2++] = -1;
                            } else {
                                field6679[var2++] = var437.field170;
                            }
                            continue;
                        }
                        if (var616 == 5220) {
                            field6679[var2++] = class286.field4374 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 5221) {
                            var2--;
                            int var438 = field6679[var2];
                            class365.method2238(var438 >> 14 & 0x3FFF, (byte) -89, var438 & 0x3FFF);
                            continue;
                        }
                        if (var616 == 5222) {
                            class12 var439 = class356.method2197((byte) 35);
                            if (var439 == null) {
                                field6679[var2++] = -1;
                                field6679[var2++] = -1;
                            } else {
                                boolean var440 = var439.method122(field6701, class384.field5692 + class189.field2912, class446.field6309 + class189.field2902, (byte) 118);
                                if (var440) {
                                    field6679[var2++] = field6701[1];
                                    field6679[var2++] = field6701[2];
                                } else {
                                    field6679[var2++] = -1;
                                    field6679[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var616 == 5223) {
                            var2 -= 2;
                            int var441 = field6679[var2];
                            int var442 = field6679[var2 + 1];
                            class391.method2361(true, var442 >> 14 & 0x3FFF, var442 & 0x3FFF, false, var441);
                            continue;
                        }
                        if (var616 == 5224) {
                            var2--;
                            int var443 = field6679[var2];
                            class12 var444 = class356.method2197((byte) 27);
                            if (var444 == null) {
                                field6679[var2++] = -1;
                                field6679[var2++] = -1;
                            } else {
                                boolean var445 = var444.method124(-90, var443 >> 14 & 0x3FFF, field6701, var443 & 0x3FFF, var443 >> 28 & 0x3);
                                if (var445) {
                                    field6679[var2++] = field6701[1];
                                    field6679[var2++] = field6701[2];
                                } else {
                                    field6679[var2++] = -1;
                                    field6679[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var616 == 5225) {
                            var2--;
                            int var446 = field6679[var2];
                            class12 var447 = class356.method2197((byte) 65);
                            if (var447 == null) {
                                field6679[var2++] = -1;
                                field6679[var2++] = -1;
                            } else {
                                boolean var448 = var447.method122(field6701, var446 >> 14 & 0x3FFF, var446 & 0x3FFF, (byte) 70);
                                if (var448) {
                                    field6679[var2++] = field6701[1];
                                    field6679[var2++] = field6701[2];
                                } else {
                                    field6679[var2++] = -1;
                                    field6679[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var616 == 5226) {
                            var2--;
                            class452.method2694(field6679[var2], (byte) 15);
                            continue;
                        }
                        if (var616 == 5227) {
                            var2 -= 2;
                            int var449 = field6679[var2];
                            int var450 = field6679[var2 + 1];
                            class391.method2361(true, var450 >> 14 & 0x3FFF, var450 & 0x3FFF, true, var449);
                            continue;
                        }
                        if (var616 == 5228) {
                            var2--;
                            class479.field6742 = field6679[var2] == 1;
                            continue;
                        }
                        if (var616 == 5229) {
                            field6679[var2++] = class479.field6742 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 5230) {
                            var2--;
                            int var451 = field6679[var2];
                            class410.method2449((byte) -118, var451);
                            continue;
                        }
                        if (var616 == 5231) {
                            var2 -= 2;
                            int var452 = field6679[var2];
                            boolean var453 = field6679[var2 + 1] == 1;
                            if (class106.field1484 == null) {
                                continue;
                            }
                            class35 var454 = class106.field1484.method2305((long) var452, (byte) 83);
                            if (var454 != null && !var453) {
                                var454.method283(2);
                                continue;
                            }
                            if (var454 == null && var453) {
                                class35 var455 = new class35();
                                class106.field1484.method2307((long) var452, var455, (byte) 118);
                            }
                            continue;
                        }
                        if (var616 == 5232) {
                            var2--;
                            int var456 = field6679[var2];
                            if (class106.field1484 == null) {
                                field6679[var2++] = 0;
                            } else {
                                class35 var457 = class106.field1484.method2305((long) var456, (byte) 66);
                                field6679[var2++] = var457 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var616 == 5233) {
                            var2 -= 2;
                            int var458 = field6679[var2];
                            boolean var459 = field6679[var2 + 1] == 1;
                            if (class184.field2744 == null) {
                                continue;
                            }
                            class35 var460 = class184.field2744.method2305((long) var458, (byte) 40);
                            if (var460 != null && !var459) {
                                var460.method283(2);
                                continue;
                            }
                            if (var460 == null && var459) {
                                class35 var461 = new class35();
                                class184.field2744.method2307((long) var458, var461, (byte) 116);
                            }
                            continue;
                        }
                        if (var616 == 5234) {
                            var2--;
                            int var462 = field6679[var2];
                            if (class184.field2744 == null) {
                                field6679[var2++] = 0;
                            } else {
                                class35 var463 = class184.field2744.method2305((long) var462, (byte) 113);
                                field6679[var2++] = var463 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var616 == 5235) {
                            field6679[var2++] = class189.field2880 == null ? -1 : class189.field2880.field166;
                            continue;
                        }
                    } else if (var616 < 5400) {
                        if (var616 == 5300) {
                            var2 -= 2;
                            int var464 = field6679[var2];
                            int var465 = field6679[var2 + 1];
                            class76.method650((byte) -48, var464, 3, var465, false);
                            field6679[var2++] = class123.field1698 == null ? 0 : 1;
                            continue;
                        }
                        if (var616 == 5301) {
                            if (class123.field1698 != null) {
                                class76.method650((byte) 102, -1, class337.field5038.field3947, -1, false);
                            }
                            continue;
                        }
                        if (var616 == 5302) {
                            class426[] var466 = class419.method2486((byte) -50);
                            field6679[var2++] = var466.length;
                            continue;
                        }
                        if (var616 == 5303) {
                            var2--;
                            int var467 = field6679[var2];
                            class426[] var468 = class419.method2486((byte) -82);
                            field6679[var2++] = var468[var467].field6085;
                            field6679[var2++] = var468[var467].field6088;
                            continue;
                        }
                        if (var616 == 5305) {
                            int var469 = class337.field5038.field3944;
                            int var470 = class337.field5038.field3948;
                            int var471 = -1;
                            class426[] var472 = class419.method2486((byte) -116);
                            for (int var473 = 0; var473 < var472.length; var473++) {
                                class426 var474 = var472[var473];
                                if (var474.field6085 == var469 && var474.field6088 == var470) {
                                    var471 = var473;
                                    break;
                                }
                            }
                            field6679[var2++] = var471;
                            continue;
                        }
                        if (var616 == 5306) {
                            field6679[var2++] = class419.method2487((byte) -82);
                            continue;
                        }
                        if (var616 == 5307) {
                            var2--;
                            int var475 = field6679[var2];
                            if (var475 >= 1 && var475 <= 2) {
                                class76.method650((byte) 126, -1, var475, -1, false);
                            }
                            continue;
                        }
                        if (var616 == 5308) {
                            field6679[var2++] = class337.field5038.field3947;
                            continue;
                        }
                        if (var616 == 5309) {
                            var2--;
                            int var476 = field6679[var2];
                            if (var476 >= 1 && var476 <= 2) {
                                class337.field5038.field3947 = var476;
                                class337.field5038.method2208(-83, class21.field261);
                            }
                            continue;
                        }
                    } else if (var616 < 5500) {
                        if (var616 == 5400) {
                            var3 -= 2;
                            String var477 = field6688[var3];
                            String var478 = field6688[var3 + 1];
                            var2--;
                            int var479 = field6679[var2];
                            field6697++;
                            class378.method2320(class247.field3583, (byte) 119);
                            class230.field3390.method2619((byte) -126, class330.method2021((byte) 116, var477) + class330.method2021((byte) 107, var478) + 1);
                            class230.field3390.method2597(var477, (byte) -99);
                            class230.field3390.method2597(var478, (byte) -126);
                            class230.field3390.method2619((byte) -121, var479);
                            continue;
                        }
                        if (var616 == 5401) {
                            var2 -= 2;
                            class306.field4561[field6679[var2]] = (short) class487.method2849((byte) -29, field6679[var2 + 1]);
                            class23.field309.method2368(0);
                            class23.field309.method2372(0);
                            class448.field6339.method331(-68);
                            class456.method2706((byte) 114);
                            continue;
                        }
                        if (var616 == 5405) {
                            var2 -= 2;
                            int var480 = field6679[var2];
                            int var481 = field6679[var2 + 1];
                            if (var480 >= 0 && var480 < 2) {
                                class186.field2834[var480] = new int[var481 << 1][4];
                            }
                            continue;
                        }
                        if (var616 == 5406) {
                            var2 -= 7;
                            int var482 = field6679[var2];
                            int var483 = field6679[var2 + 1] << 1;
                            int var484 = field6679[var2 + 2];
                            int var485 = field6679[var2 + 3];
                            int var486 = field6679[var2 + 4];
                            int var487 = field6679[var2 + 5];
                            int var488 = field6679[var2 + 6];
                            if (var482 >= 0 && var482 < 2 && class186.field2834[var482] != null && var483 >= 0 && var483 < class186.field2834[var482].length) {
                                class186.field2834[var482][var483] = new int[] { (var484 >> 14 & 0x3FFF) * 128, var485, (var484 & 0x3FFF) * 128, var488 };
                                class186.field2834[var482][var483 + 1] = new int[] { (var486 >> 14 & 0x3FFF) * 128, var487, (var486 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var616 == 5407) {
                            var2--;
                            int var489 = class186.field2834[field6679[var2]].length >> 1;
                            field6679[var2++] = var489;
                            continue;
                        }
                        if (var616 == 5411) {
                            if (class123.field1698 != null) {
                                class76.method650((byte) -122, -1, class337.field5038.field3947, -1, false);
                            }
                            if (class316.field4749 == null) {
                                String var490 = class141.field2022 == null ? class424.method2501((byte) -125) : class141.field2022;
                                class119.method847(false, var490, class170.field2424 == 1, class21.field261, (byte) 60);
                            } else {
                                class92.method715(false);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var616 == 5419) {
                            String var491 = "";
                            if (class72.field963 != null) {
                                if (class72.field963.field5823 == null) {
                                    var491 = class246.method1576((byte) -59, class72.field963.field5820);
                                } else {
                                    var491 = (String) class72.field963.field5823;
                                }
                            }
                            field6688[var3++] = var491;
                            continue;
                        }
                        if (var616 == 5420) {
                            field6679[var2++] = class153.field2137 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 5421) {
                            if (class123.field1698 != null) {
                                class76.method650((byte) -26, -1, class337.field5038.field3947, -1, false);
                            }
                            var3--;
                            String var492 = field6688[var3];
                            var2--;
                            boolean var493 = field6679[var2] == 1;
                            String var494 = class424.method2501((byte) -111) + var492;
                            class119.method847(var493, var494, class170.field2424 == 1, class21.field261, (byte) 60);
                            continue;
                        }
                        if (var616 == 5422) {
                            var3 -= 2;
                            String var495 = field6688[var3];
                            String var496 = field6688[var3 + 1];
                            var2--;
                            int var497 = field6679[var2];
                            if (var495.length() > 0) {
                                if (class275.field4188 == null) {
                                    class275.field4188 = new String[class279.field4223[class124.field1710.field6119]];
                                }
                                class275.field4188[var497] = var495;
                            }
                            if (var496.length() > 0) {
                                if (class257.field3832 == null) {
                                    class257.field3832 = new String[class279.field4223[class124.field1710.field6119]];
                                }
                                class257.field3832[var497] = var496;
                            }
                            continue;
                        }
                        if (var616 == 5423) {
                            var3--;
                            System.out.println(field6688[var3]);
                            continue;
                        }
                        if (var616 == 5424) {
                            var2 -= 11;
                            class20.field257 = field6679[var2];
                            class147.field2073 = field6679[var2 + 1];
                            class441.field6234 = field6679[var2 + 2];
                            class257.field3820 = field6679[var2 + 3];
                            class94.field1311 = field6679[var2 + 4];
                            class227.field3327 = field6679[var2 + 5];
                            class307.field4581 = field6679[var2 + 6];
                            class132.field1835 = field6679[var2 + 7];
                            class45.field634 = field6679[var2 + 8];
                            class473.field6631 = field6679[var2 + 9];
                            class425.field6080 = field6679[var2 + 10];
                            class425.field6075.method2672(class94.field1311, 23775);
                            class425.field6075.method2672(class227.field3327, 23775);
                            class425.field6075.method2672(class307.field4581, 23775);
                            class425.field6075.method2672(class132.field1835, 23775);
                            class425.field6075.method2672(class45.field634, 23775);
                            class355.field5384 = null;
                            class365.field5519 = null;
                            class442.field6239 = null;
                            class219.field3233 = null;
                            class464.field6547 = null;
                            class465.field6548 = null;
                            class110.field1563 = null;
                            class156.field2175 = null;
                            class486.field6828 = true;
                            continue;
                        }
                        if (var616 == 5425) {
                            class262.method1723(-1);
                            class486.field6828 = false;
                            continue;
                        }
                        if (var616 == 5426) {
                            var2 -= 2;
                            class268.field3970 = field6679[var2];
                            class162.field2235 = field6679[var2 + 1];
                            continue;
                        }
                        if (var616 == 5427) {
                            var2 -= 2;
                            class365.field5524 = field6679[var2 + 1];
                            continue;
                        }
                        if (var616 == 5428) {
                            var2 -= 2;
                            int var498 = field6679[var2];
                            int var499 = field6679[var2 + 1];
                            field6679[var2++] = class294.method1849((byte) -83, var499, var498) ? 1 : 0;
                            continue;
                        }
                        if (var616 == 5429) {
                            var3--;
                            class380.method2324(false, field6688[var3], false);
                            continue;
                        }
                    } else if (var616 < 5600) {
                        if (var616 == 5500) {
                            var2 -= 4;
                            int var500 = field6679[var2];
                            int var501 = field6679[var2 + 1];
                            int var502 = field6679[var2 + 2];
                            int var503 = field6679[var2 + 3];
                            class450.method2651((var500 >> 14 & 0x3FFF) - class68.field922, var501, false, var503, (var500 & 0x3FFF) - class468.field6588, -15415, var502);
                            continue;
                        }
                        if (var616 == 5501) {
                            var2 -= 4;
                            int var504 = field6679[var2];
                            int var505 = field6679[var2 + 1];
                            int var506 = field6679[var2 + 2];
                            int var507 = field6679[var2 + 3];
                            class48.method350(-3073, var505, (var504 >> 14 & 0x3FFF) - class68.field922, (var504 & 0x3FFF) - class468.field6588, var506, var507);
                            continue;
                        }
                        if (var616 == 5502) {
                            var2 -= 6;
                            int var508 = field6679[var2];
                            if (var508 >= 2) {
                                throw new RuntimeException();
                            }
                            class100.field1423 = var508;
                            int var509 = field6679[var2 + 1];
                            if (var509 + 1 >= class186.field2834[class100.field1423].length >> 1) {
                                throw new RuntimeException();
                            }
                            class266.field3954 = var509;
                            class20.field256 = 0;
                            class263.field3911 = field6679[var2 + 2];
                            class151.field2118 = field6679[var2 + 3];
                            int var510 = field6679[var2 + 4];
                            if (var510 >= 2) {
                                throw new RuntimeException();
                            }
                            class258.field3855 = var510;
                            int var511 = field6679[var2 + 5];
                            if (var511 + 1 >= class186.field2834[class258.field3855].length >> 1) {
                                throw new RuntimeException();
                            }
                            class238.field3466 = var511;
                            class469.field6596 = 3;
                            continue;
                        }
                        if (var616 == 5503) {
                            class145.method989(-33);
                            continue;
                        }
                        if (var616 == 5504) {
                            var2 -= 2;
                            class122.method859(field6679[var2], -126, field6679[var2 + 1], 0);
                            continue;
                        }
                        if (var616 == 5505) {
                            field6679[var2++] = (int) class412.field5953 >> 3;
                            continue;
                        }
                        if (var616 == 5506) {
                            field6679[var2++] = (int) class384.field5682 >> 3;
                            continue;
                        }
                        if (var616 == 5507) {
                            class73.method631(8282);
                            continue;
                        }
                        if (var616 == 5508) {
                            class335.method2055(-17);
                            continue;
                        }
                        if (var616 == 5509) {
                            class350.method2163(30646);
                            continue;
                        }
                        if (var616 == 5510) {
                            class17.method180(2);
                            continue;
                        }
                        if (var616 == 5511) {
                            var2--;
                            int var512 = field6679[var2];
                            int var513 = var512 >> 14 & 0x3FFF;
                            int var514 = var512 & 0x3FFF;
                            int var515 = var513 - class68.field922;
                            if (var515 < 0) {
                                var515 = 0;
                            } else if (var515 >= class379.field5642) {
                                var515 = class379.field5642;
                            }
                            int var516 = var514 - class468.field6588;
                            if (var516 < 0) {
                                var516 = 0;
                            } else if (var516 >= class456.field6477) {
                                var516 = class456.field6477;
                            }
                            class128.field1787 = var515 * 128 + 64;
                            class492.field6932 = var516 * 128 + 64;
                            class469.field6596 = 4;
                            continue;
                        }
                        if (var616 == 5512) {
                            class478.method2804(false);
                            continue;
                        }
                    } else if (var616 < 5700) {
                        if (var616 == 5600) {
                            var3 -= 2;
                            String var517 = field6688[var3];
                            String var518 = field6688[var3 + 1];
                            var2--;
                            int var519 = field6679[var2];
                            if (class316.field4752 == 10 && class390.field5726 == 0 && class88.field1240 == 0 && class78.field1095 == 0 && class140.field2006 == 0) {
                                class51.method377(var519, true, var518, var517);
                            }
                            continue;
                        }
                        if (var616 == 5601) {
                            class183.method1255(13104);
                            continue;
                        }
                        if (var616 == 5602) {
                            if (class88.field1240 == 0) {
                                class6.field107 = -2;
                            }
                            continue;
                        }
                        if (var616 == 5603) {
                            var2 -= 4;
                            if (class316.field4752 == 10 && class390.field5726 == 0 && class88.field1240 == 0 && class78.field1095 == 0 && class140.field2006 == 0) {
                                class144.method988(-30571, field6679[var2 + 1], field6679[var2 + 2], field6679[var2], field6679[var2 + 3]);
                            }
                            continue;
                        }
                        if (var616 == 5604) {
                            var3--;
                            if (class316.field4752 == 10 && class390.field5726 == 0 && class88.field1240 == 0 && class78.field1095 == 0 && class140.field2006 == 0) {
                                class486.method2846(112, class479.method2812(field6688[var3], 0));
                            }
                            continue;
                        }
                        if (var616 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class316.field4752 == 10 && class390.field5726 == 0 && class88.field1240 == 0 && class78.field1095 == 0 && class140.field2006 == 0) {
                                class484.method2829(field6679[var2], field6688[var3 + 1], class479.method2812(field6688[var3], 0), field6679[var2 + 4] == 1, field6679[var2 + 6] == 1, field6679[var2 + 2], field6688[var3 + 2], field6679[var2 + 3], field6679[var2 + 5] == 1, (byte) -125, field6679[var2 + 1]);
                            }
                            continue;
                        }
                        if (var616 == 5606) {
                            if (class78.field1095 == 0) {
                                class309.field4619 = -2;
                            }
                            continue;
                        }
                        if (var616 == 5607) {
                            field6679[var2++] = class6.field107;
                            continue;
                        }
                        if (var616 == 5608) {
                            field6679[var2++] = class200.field3037;
                            continue;
                        }
                        if (var616 == 5609) {
                            field6679[var2++] = class309.field4619;
                            continue;
                        }
                        if (var616 == 5610) {
                            for (int var520 = 0; var520 < 5; var520++) {
                                field6688[var3++] = class158.field2199.length > var520 ? class184.method1259(class158.field2199[var520], (byte) -122) : "";
                            }
                            class158.field2199 = null;
                            continue;
                        }
                        if (var616 == 5611) {
                            field6679[var2++] = class307.field4567;
                            continue;
                        }
                    } else if (var616 < 6100) {
                        if (var616 == 6001) {
                            var2--;
                            int var521 = field6679[var2];
                            if (var521 < 1) {
                                var521 = 1;
                            }
                            if (var521 > 4) {
                                var521 = 4;
                            }
                            class337.field5038.field3932 = var521;
                            class70.method613((byte) -103);
                            class337.field5038.method2208(-17, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6002) {
                            var2--;
                            class337.field5038.method2211(field6679[var2] == 1, 22974);
                            class70.method613((byte) -97);
                            class48.method349(-4);
                            class337.field5038.method2208(-81, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6003) {
                            var2--;
                            class337.field5038.field3928 = field6679[var2] == 1;
                            class48.method349(-4);
                            class337.field5038.method2208(-22, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6005) {
                            var2--;
                            class337.field5038.field3937 = field6679[var2] == 1;
                            class70.method613((byte) -91);
                            class337.field5038.method2208(-95, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6006) {
                            var2--;
                            class337.field5038.field3939 = field6679[var2] == 1;
                            class138.field1976.method527(!class337.field5038.field3939);
                            class337.field5038.method2208(-125, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6007) {
                            var2--;
                            class337.field5038.field3943 = field6679[var2];
                            class337.field5038.method2208(-115, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6008) {
                            var2--;
                            class337.field5038.field3929 = field6679[var2] == 1;
                            class337.field5038.method2208(-73, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6009) {
                            var2--;
                            class337.field5038.field3927 = field6679[var2] == 1;
                            class70.method613((byte) -90);
                            class337.field5038.method2208(-60, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6010) {
                            var2--;
                            class337.field5038.field3938 = field6679[var2] == 1;
                            class337.field5038.method2208(-125, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6011) {
                            var2--;
                            int var522 = field6679[var2];
                            if (var522 < 0 || var522 > 2) {
                                var522 = 0;
                            }
                            class337.field5038.field3952 = var522;
                            class70.method613((byte) -122);
                            class337.field5038.method2208(-109, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6012) {
                            var2--;
                            class337.field5038.field3957 = field6679[var2] == 1;
                            class92.method711((byte) -42);
                            class337.field5038.method2208(-39, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6014) {
                            var2--;
                            class337.field5038.field3933 = field6679[var2] == 1;
                            class70.method613((byte) -99);
                            class337.field5038.method2208(-96, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6015) {
                            var2--;
                            class337.field5038.field3924 = field6679[var2] == 1;
                            class70.method613((byte) -91);
                            class337.field5038.method2208(-88, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6016) {
                            var2--;
                            int var523 = field6679[var2];
                            if (var523 < 0 || var523 > 2) {
                                var523 = 0;
                            }
                            class337.field5038.field3930 = var523;
                            class82.method673(2);
                            class337.field5038.method2208(-75, class21.field261);
                            continue;
                        }
                        if (var616 == 6017) {
                            var2--;
                            class337.field5038.field3936 = field6679[var2] == 1;
                            class338.method2068(-24986);
                            class337.field5038.method2208(-82, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6018) {
                            var2--;
                            int var524 = field6679[var2];
                            if (var524 < 0) {
                                var524 = 0;
                            }
                            if (var524 > 127) {
                                var524 = 127;
                            }
                            class337.field5038.field3949 = var524;
                            class337.field5038.method2208(-60, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6019) {
                            var2--;
                            int var525 = field6679[var2];
                            if (var525 < 0) {
                                var525 = 0;
                            }
                            if (var525 > 255) {
                                var525 = 255;
                            }
                            if (class337.field5038.field3946 != var525) {
                                if (class337.field5038.field3946 == 0 && class487.field6840 != -1) {
                                    class132.method919(class43.field598, class487.field6840, false, 0, 6481, var525);
                                    class208.field3142 = false;
                                } else if (var525 == 0) {
                                    class327.method2014((byte) -86);
                                    class208.field3142 = false;
                                } else {
                                    class301.method1878((byte) 127, var525);
                                }
                                class337.field5038.field3946 = var525;
                            }
                            class337.field5038.method2208(-68, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6020) {
                            var2--;
                            int var526 = field6679[var2];
                            if (var526 < 0) {
                                var526 = 0;
                            }
                            if (var526 > 127) {
                                var526 = 127;
                            }
                            class337.field5038.field3934 = var526;
                            class337.field5038.method2208(-122, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6021) {
                            var2--;
                            class337.field5038.field5453 = field6679[var2] == 1;
                            class48.method349(-4);
                            continue;
                        }
                        if (var616 == 6023) {
                            var2--;
                            int var527 = field6679[var2];
                            boolean var528 = false;
                            if (var527 < 0) {
                                var527 = 0;
                            }
                            if (var527 > 2) {
                                var527 = 2;
                            }
                            if (class45.field646 < 96) {
                                var527 = 0;
                                var528 = true;
                            }
                            class36.method288((byte) 33, var527);
                            class337.field5038.method2208(-117, class21.field261);
                            class332.field4975 = false;
                            field6679[var2++] = var528 ? 0 : 1;
                            continue;
                        }
                        if (var616 == 6024) {
                            var2--;
                            int var529 = field6679[var2];
                            if (var529 < 0 || var529 > 2) {
                                var529 = 0;
                            }
                            class337.field5038.field3941 = var529;
                            class337.field5038.method2208(-83, class21.field261);
                            continue;
                        }
                        if (var616 == 6025) {
                            var2--;
                            int var530 = field6679[var2];
                            if (var530 < 0 || var530 > class263.method1733(class45.field646, 18795)) {
                                var530 = 0;
                            }
                            class337.field5038.field3951 = var530;
                            class337.field5038.method2208(-47, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6027) {
                            var2--;
                            int var531 = field6679[var2];
                            if (var531 < 0 || var531 > 1) {
                                var531 = 0;
                            }
                            class212.method1431(-66, var531 == 1);
                            continue;
                        }
                        if (var616 == 6028) {
                            var2--;
                            class337.field5038.field3925 = field6679[var2] != 0;
                            class337.field5038.method2208(-28, class21.field261);
                            continue;
                        }
                        if (var616 == 6029) {
                            var2--;
                            class337.field5038.field3943 = field6679[var2];
                            class337.field5038.method2208(-23, class21.field261);
                            continue;
                        }
                        if (var616 == 6030) {
                            var2--;
                            class337.field5038.field3945 = field6679[var2] != 0;
                            class337.field5038.method2208(-112, class21.field261);
                            class70.method613((byte) -96);
                            continue;
                        }
                        if (var616 == 6031) {
                            var2--;
                            int var532 = field6679[var2];
                            if (var532 < 0 || var532 > 3) {
                                var532 = 2;
                            }
                            class267.method1745(var532, -20);
                            continue;
                        }
                        if (var616 == 6032) {
                            var2--;
                            int var533 = field6679[var2];
                            if (var533 < 0 || var533 > 3) {
                                var533 = 2;
                            }
                            class337.field5038.field3935 = var533;
                            class337.field5038.method2208(-20, class21.field261);
                            class332.field4975 = false;
                            continue;
                        }
                        if (var616 == 6033) {
                            var2--;
                            int var534 = field6679[var2];
                            if (var534 < 0 || var534 > 4) {
                                var534 = 2;
                            }
                            class337.field5038.field3953 = var534;
                            class337.field5038.method2208(-25, class21.field261);
                            continue;
                        }
                        if (var616 == 6035) {
                            var2--;
                            class337.field5038.field5456 = field6679[var2] == 1;
                            class70.method613((byte) -128);
                            class48.method349(-4);
                            continue;
                        }
                    } else if (var616 < 6200) {
                        if (var616 == 6101) {
                            field6679[var2++] = class337.field5038.field3932;
                            continue;
                        }
                        if (var616 == 6102) {
                            field6679[var2++] = class337.field5038.method2206(class170.field2424, false) ? 1 : 0;
                            continue;
                        }
                        if (var616 == 6103) {
                            field6679[var2++] = class337.field5038.field3928 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 6105) {
                            field6679[var2++] = class337.field5038.field3937 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 6106) {
                            field6679[var2++] = class337.field5038.field3939 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 6107) {
                            field6679[var2++] = class337.field5038.field3943;
                            continue;
                        }
                        if (var616 == 6108) {
                            field6679[var2++] = class337.field5038.field3929 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 6109) {
                            field6679[var2++] = class337.field5038.field3927 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 6110) {
                            field6679[var2++] = class337.field5038.field3938 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 6111) {
                            field6679[var2++] = class337.field5038.field3952;
                            continue;
                        }
                        if (var616 == 6112) {
                            field6679[var2++] = class337.field5038.field3957 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 6114) {
                            field6679[var2++] = class337.field5038.field3933 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 6115) {
                            field6679[var2++] = class337.field5038.field3924 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 6116) {
                            field6679[var2++] = class337.field5038.field3930;
                            continue;
                        }
                        if (var616 == 6117) {
                            field6679[var2++] = class337.field5038.field3936 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 6118) {
                            field6679[var2++] = class337.field5038.field3949;
                            continue;
                        }
                        if (var616 == 6119) {
                            field6679[var2++] = class337.field5038.field3946;
                            continue;
                        }
                        if (var616 == 6120) {
                            field6679[var2++] = class337.field5038.field3934;
                            continue;
                        }
                        if (var616 == 6121) {
                            field6679[var2++] = class138.field1976.method514() ? 1 : 0;
                            continue;
                        }
                        if (var616 == 6123) {
                            field6679[var2++] = class197.method1343(84);
                            continue;
                        }
                        if (var616 == 6124) {
                            field6679[var2++] = class337.field5038.field3941;
                            continue;
                        }
                        if (var616 == 6125) {
                            field6679[var2++] = class337.field5038.field3951;
                            continue;
                        }
                        if (var616 == 6126) {
                            field6679[var2++] = class138.field1976.method528() ? 1 : 0;
                            continue;
                        }
                        if (var616 == 6127) {
                            field6679[var2++] = class337.field5038.field3922 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 6128) {
                            field6679[var2++] = class337.field5038.field3925 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 6129) {
                            field6679[var2++] = class337.field5038.field3943;
                            continue;
                        }
                        if (var616 == 6130) {
                            field6679[var2++] = class337.field5038.field3945 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 6131) {
                            field6679[var2++] = class170.field2424;
                            continue;
                        }
                        if (var616 == 6132) {
                            field6679[var2++] = class337.field5038.field3935;
                            continue;
                        }
                        if (var616 == 6133) {
                            field6679[var2++] = class153.field2137 == 1 || class153.field2137 == 4 ? 1 : 0;
                            continue;
                        }
                        if (var616 == 6134) {
                            field6679[var2++] = class263.method1733(class45.field646, 18795);
                            continue;
                        }
                        if (var616 == 6135) {
                            field6679[var2++] = class337.field5038.field3953;
                            continue;
                        }
                    } else if (var616 < 6300) {
                        if (var616 == 6200) {
                            var2 -= 2;
                            class246.field3561 = (short) field6679[var2];
                            if (class246.field3561 <= 0) {
                                class246.field3561 = 256;
                            }
                            class106.field1485 = (short) field6679[var2 + 1];
                            if (class106.field1485 <= 0) {
                                class106.field1485 = 205;
                            }
                            continue;
                        }
                        if (var616 == 6201) {
                            var2 -= 2;
                            class386.field5703 = (short) field6679[var2];
                            if (class386.field5703 <= 0) {
                                class386.field5703 = 256;
                            }
                            class303.field4508 = (short) field6679[var2 + 1];
                            if (class303.field4508 <= 0) {
                                class303.field4508 = 320;
                            }
                            continue;
                        }
                        if (var616 == 6202) {
                            var2 -= 4;
                            class172.field2461 = (short) field6679[var2];
                            if (class172.field2461 <= 0) {
                                class172.field2461 = 1;
                            }
                            class119.field1653 = (short) field6679[var2 + 1];
                            if (class119.field1653 <= 0) {
                                class119.field1653 = 32767;
                            } else if (class119.field1653 < class172.field2461) {
                                class119.field1653 = class172.field2461;
                            }
                            class303.field4513 = (short) field6679[var2 + 2];
                            if (class303.field4513 <= 0) {
                                class303.field4513 = 1;
                            }
                            class122.field1688 = (short) field6679[var2 + 3];
                            if (class122.field1688 <= 0) {
                                class122.field1688 = 32767;
                            } else if (class122.field1688 < class303.field4513) {
                                class122.field1688 = class303.field4513;
                            }
                            continue;
                        }
                        if (var616 == 6203) {
                            class315.method1946(0, 0, false, class478.field6708.field2589, class478.field6708.field2595, false);
                            field6679[var2++] = class9.field147;
                            field6679[var2++] = class446.field6287;
                            continue;
                        }
                        if (var616 == 6204) {
                            field6679[var2++] = class386.field5703;
                            field6679[var2++] = class303.field4508;
                            continue;
                        }
                        if (var616 == 6205) {
                            field6679[var2++] = class246.field3561;
                            field6679[var2++] = class106.field1485;
                            continue;
                        }
                    } else if (var616 < 6400) {
                        if (var616 == 6300) {
                            field6679[var2++] = (int) (class435.method2539(-10659) / 60000L);
                            continue;
                        }
                        if (var616 == 6301) {
                            field6679[var2++] = (int) (class435.method2539(-10659) / 86400000L) - 11745;
                            continue;
                        }
                        if (var616 == 6302) {
                            var2 -= 3;
                            int var535 = field6679[var2];
                            int var536 = field6679[var2 + 1];
                            int var537 = field6679[var2 + 2];
                            field6696.clear();
                            field6696.set(11, 12);
                            field6696.set(var537, var536, var535);
                            field6679[var2++] = (int) (field6696.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var616 == 6303) {
                            field6696.clear();
                            field6696.setTime(new Date(class435.method2539(-10659)));
                            field6679[var2++] = field6696.get(1);
                            continue;
                        }
                        if (var616 == 6304) {
                            var2--;
                            int var538 = field6679[var2];
                            boolean var539 = true;
                            if (var538 < 0) {
                                var539 = (var538 + 1) % 4 == 0;
                            } else if (var538 < 1582) {
                                var539 = var538 % 4 == 0;
                            } else if (var538 % 4 != 0) {
                                var539 = false;
                            } else if (var538 % 100 != 0) {
                                var539 = true;
                            } else if (var538 % 400 != 0) {
                                var539 = false;
                            }
                            field6679[var2++] = var539 ? 1 : 0;
                            continue;
                        }
                    } else if (var616 < 6500) {
                        if (var616 == 6405) {
                            field6679[var2++] = class423.method2493(-17749) ? 1 : 0;
                            continue;
                        }
                        if (var616 == 6406) {
                            field6679[var2++] = class427.method2511(18769) ? 1 : 0;
                            continue;
                        }
                    } else if (var616 < 6600) {
                        if (var616 == 6500) {
                            if (class316.field4752 == 10 && class390.field5726 == 0 && class88.field1240 == 0 && class78.field1095 == 0) {
                                field6679[var2++] = class406.method2435(99) == -1 ? 0 : 1;
                                continue;
                            }
                            field6679[var2++] = 1;
                            continue;
                        }
                        if (var616 == 6501) {
                            class187 var540 = class43.method319(0);
                            if (var540 == null) {
                                field6679[var2++] = -1;
                                field6679[var2++] = 0;
                                field6688[var3++] = "";
                                field6679[var2++] = 0;
                                field6688[var3++] = "";
                                field6679[var2++] = 0;
                                field6679[var2++] = 0;
                            } else {
                                field6679[var2++] = var540.field2845;
                                field6679[var2++] = var540.field4987;
                                field6688[var3++] = var540.field2841;
                                class256 var541 = var540.method1292(0);
                                field6679[var2++] = var541.field3793;
                                field6688[var3++] = var541.field3795;
                                field6679[var2++] = var540.field4990;
                                field6679[var2++] = var540.field2846;
                            }
                            continue;
                        }
                        if (var616 == 6502) {
                            class187 var542 = class237.method1539(0);
                            if (var542 == null) {
                                field6679[var2++] = -1;
                                field6679[var2++] = 0;
                                field6688[var3++] = "";
                                field6679[var2++] = 0;
                                field6688[var3++] = "";
                                field6679[var2++] = 0;
                                field6679[var2++] = 0;
                            } else {
                                field6679[var2++] = var542.field2845;
                                field6679[var2++] = var542.field4987;
                                field6688[var3++] = var542.field2841;
                                class256 var543 = var542.method1292(0);
                                field6679[var2++] = var543.field3793;
                                field6688[var3++] = var543.field3795;
                                field6679[var2++] = var542.field4990;
                                field6679[var2++] = var542.field2846;
                            }
                            continue;
                        }
                        if (var616 == 6503) {
                            var2--;
                            int var544 = field6679[var2];
                            if (class316.field4752 == 10 && class390.field5726 == 0 && class88.field1240 == 0 && class78.field1095 == 0) {
                                field6679[var2++] = class334.method2051(var544, (byte) 117) ? 1 : 0;
                                continue;
                            }
                            field6679[var2++] = 0;
                            continue;
                        }
                        if (var616 == 6504) {
                            var2--;
                            class337.field5038.field3923 = field6679[var2];
                            class337.field5038.method2208(-26, class21.field261);
                            continue;
                        }
                        if (var616 == 6505) {
                            field6679[var2++] = class337.field5038.field3923;
                            continue;
                        }
                        if (var616 == 6506) {
                            var2--;
                            int var545 = field6679[var2];
                            class187 var546 = class44.method321(-86, var545);
                            if (var546 == null) {
                                field6679[var2++] = -1;
                                field6688[var3++] = "";
                                field6679[var2++] = 0;
                                field6688[var3++] = "";
                                field6679[var2++] = 0;
                                field6679[var2++] = 0;
                            } else {
                                field6679[var2++] = var546.field4987;
                                field6688[var3++] = var546.field2841;
                                class256 var547 = var546.method1292(0);
                                field6679[var2++] = var547.field3793;
                                field6688[var3++] = var547.field3795;
                                field6679[var2++] = var546.field4990;
                                field6679[var2++] = var546.field2846;
                            }
                            continue;
                        }
                        if (var616 == 6507) {
                            var2 -= 4;
                            int var548 = field6679[var2];
                            boolean var549 = field6679[var2 + 1] == 1;
                            int var550 = field6679[var2 + 2];
                            boolean var551 = field6679[var2 + 3] == 1;
                            class131.method906(var550, var548, var551, var549, (byte) 124);
                            continue;
                        }
                        if (var616 == 6508) {
                            class416.method2478(false);
                            continue;
                        }
                        if (var616 == 6509) {
                            if (class316.field4752 == 10) {
                                var2--;
                                class317.field4757 = field6679[var2] == 1;
                            }
                            continue;
                        }
                    } else if (var616 < 6700) {
                        if (var616 == 6600) {
                            var2--;
                            class337.field5038.field3942 = field6679[var2] == 1;
                            class337.field5038.method2208(-128, class21.field261);
                            continue;
                        }
                        if (var616 == 6601) {
                            field6679[var2++] = class337.field5038.field3942 ? 1 : 0;
                            continue;
                        }
                    } else if (var616 < 6800 && class484.field6804 == class350.field5344) {
                        if (var616 == 6700) {
                            int var552 = class466.field6564.method2302(false);
                            if (class279.field4220 != -1) {
                                var552++;
                            }
                            field6679[var2++] = var552;
                            continue;
                        }
                        if (var616 == 6701) {
                            var2--;
                            int var553 = field6679[var2];
                            if (class279.field4220 != -1) {
                                if (var553 == 0) {
                                    field6679[var2++] = class279.field4220;
                                    continue;
                                }
                                var553--;
                            }
                            class468 var554 = (class468) class466.field6564.method2296((byte) 39);
                            while (var553-- > 0) {
                                var554 = (class468) class466.field6564.method2297(true);
                            }
                            field6679[var2++] = var554.field6584;
                            continue;
                        }
                        if (var616 == 6702) {
                            var2--;
                            int var555 = field6679[var2];
                            if (class467.field6572[var555] == null) {
                                field6688[var3++] = "";
                            } else {
                                String var556 = class467.field6572[var555][0].field2526;
                                if (var556 == null) {
                                    field6688[var3++] = "";
                                } else {
                                    field6688[var3++] = var556.substring(0, var556.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var616 == 6703) {
                            var2--;
                            int var557 = field6679[var2];
                            if (class467.field6572[var557] == null) {
                                field6679[var2++] = 0;
                            } else {
                                field6679[var2++] = class467.field6572[var557].length;
                            }
                            continue;
                        }
                        if (var616 == 6704) {
                            var2 -= 2;
                            int var558 = field6679[var2];
                            int var559 = field6679[var2 + 1];
                            if (class467.field6572[var558] == null) {
                                field6688[var3++] = "";
                            } else {
                                String var560 = class467.field6572[var558][var559].field2526;
                                if (var560 == null) {
                                    field6688[var3++] = "";
                                } else {
                                    field6688[var3++] = var560;
                                }
                            }
                            continue;
                        }
                        if (var616 == 6705) {
                            var2 -= 2;
                            int var561 = field6679[var2];
                            int var562 = field6679[var2 + 1];
                            if (class467.field6572[var561] == null) {
                                field6679[var2++] = 0;
                            } else {
                                field6679[var2++] = class467.field6572[var561][var562].field2570;
                            }
                            continue;
                        }
                        if (var616 == 6706) {
                            continue;
                        }
                        if (var616 == 6707) {
                            var2 -= 3;
                            int var563 = field6679[var2];
                            int var564 = field6679[var2 + 1];
                            int var565 = field6679[var2 + 2];
                            class485.method2834(18776, 1, "", var565, var563 << 16 | var564);
                            continue;
                        }
                        if (var616 == 6708) {
                            var2 -= 3;
                            int var566 = field6679[var2];
                            int var567 = field6679[var2 + 1];
                            int var568 = field6679[var2 + 2];
                            class485.method2834(18776, 2, "", var568, var566 << 16 | var567);
                            continue;
                        }
                        if (var616 == 6709) {
                            var2 -= 3;
                            int var569 = field6679[var2];
                            int var570 = field6679[var2 + 1];
                            int var571 = field6679[var2 + 2];
                            class485.method2834(18776, 3, "", var571, var569 << 16 | var570);
                            continue;
                        }
                        if (var616 == 6710) {
                            var2 -= 3;
                            int var572 = field6679[var2];
                            int var573 = field6679[var2 + 1];
                            int var574 = field6679[var2 + 2];
                            class485.method2834(18776, 4, "", var574, var572 << 16 | var573);
                            continue;
                        }
                        if (var616 == 6711) {
                            var2 -= 3;
                            int var575 = field6679[var2];
                            int var576 = field6679[var2 + 1];
                            int var577 = field6679[var2 + 2];
                            class485.method2834(18776, 5, "", var577, var575 << 16 | var576);
                            continue;
                        }
                        if (var616 == 6712) {
                            var2 -= 3;
                            int var578 = field6679[var2];
                            int var579 = field6679[var2 + 1];
                            int var580 = field6679[var2 + 2];
                            class485.method2834(18776, 6, "", var580, var578 << 16 | var579);
                            continue;
                        }
                        if (var616 == 6713) {
                            var2 -= 3;
                            int var581 = field6679[var2];
                            int var582 = field6679[var2 + 1];
                            int var583 = field6679[var2 + 2];
                            class485.method2834(18776, 7, "", var583, var581 << 16 | var582);
                            continue;
                        }
                        if (var616 == 6714) {
                            var2 -= 3;
                            int var584 = field6679[var2];
                            int var585 = field6679[var2 + 1];
                            int var586 = field6679[var2 + 2];
                            class485.method2834(18776, 8, "", var586, var584 << 16 | var585);
                            continue;
                        }
                        if (var616 == 6715) {
                            var2 -= 3;
                            int var587 = field6679[var2];
                            int var588 = field6679[var2 + 1];
                            int var589 = field6679[var2 + 2];
                            class485.method2834(18776, 9, "", var589, var587 << 16 | var588);
                            continue;
                        }
                        if (var616 == 6716) {
                            var2 -= 3;
                            int var590 = field6679[var2];
                            int var591 = field6679[var2 + 1];
                            int var592 = field6679[var2 + 2];
                            class485.method2834(18776, 10, "", var592, var590 << 16 | var591);
                            continue;
                        }
                        if (var616 == 6717) {
                            var2 -= 3;
                            int var593 = field6679[var2];
                            int var594 = field6679[var2 + 1];
                            int var595 = field6679[var2 + 2];
                            class178 var596 = class331.method2032(var593 << 16 | var594, var595, -1);
                            class110.method809((byte) -114);
                            class176 var597 = client.method2777(var596);
                            class237.method1542(var597.field2504, var595, var597.method1207((byte) -116), 92, var596.field2594, var596.field2634, var593 << 16 | var594);
                            continue;
                        }
                    } else if (var616 < 6900) {
                        if (var616 == 6800) {
                            var2--;
                            int var598 = field6679[var2];
                            class94 var599 = class492.field6915.method1111(var598, -13516);
                            if (var599.field1333 == null) {
                                field6688[var3++] = "";
                            } else {
                                field6688[var3++] = var599.field1333;
                            }
                            continue;
                        }
                        if (var616 == 6801) {
                            var2--;
                            int var600 = field6679[var2];
                            class94 var601 = class492.field6915.method1111(var600, -13516);
                            field6679[var2++] = var601.field1293;
                            continue;
                        }
                        if (var616 == 6802) {
                            var2--;
                            int var602 = field6679[var2];
                            class94 var603 = class492.field6915.method1111(var602, -13516);
                            field6679[var2++] = var603.field1291;
                            continue;
                        }
                        if (var616 == 6803) {
                            var2--;
                            int var604 = field6679[var2];
                            class94 var605 = class492.field6915.method1111(var604, -13516);
                            field6679[var2++] = var605.field1322;
                            continue;
                        }
                        if (var616 == 6804) {
                            var2 -= 2;
                            int var606 = field6679[var2];
                            int var607 = field6679[var2 + 1];
                            class170 var608 = class237.field3463.method1398(-84, var607);
                            if (var608.method1179(-121)) {
                                field6688[var3++] = class492.field6915.method1111(var606, -13516).method731(0, var608.field2430, var607);
                            } else {
                                field6679[var2++] = class492.field6915.method1111(var606, -13516).method722(true, var608.field2419, var607);
                            }
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var615) {
            if (arg0.field1410 == null) {
                StringBuffer var613 = new StringBuffer(30);
                var613.append("CS2: ").append(arg0.field436).append(" ");
                for (int var614 = field6682 - 1; var614 >= 0; var614--) {
                    var613.append("v: ").append(field6683[var614].field251.field436).append(" ");
                }
                var613.append("op: ").append(var7);
                class416.method2475(false, var615, var613.toString());
            } else {
                class453.method2696(125, "Clientscript error in: " + arg0.field1410);
                StringBuffer var610 = new StringBuffer(30);
                var610.append("Clientscript error in: ").append(arg0.field1410).append("\n");
                for (int var611 = field6682 - 1; var611 >= 0; var611--) {
                    var610.append("via: ").append(field6683[var611].field251.field1410).append("\n");
                }
                var610.append("Op: ").append(var7).append("\n");
                String var612 = var615.getMessage();
                if (var612 != null && var612.length() > 0) {
                    var610.append("Message: ").append(var612).append("\n");
                }
                class416.method2475(false, var615, var610.toString());
                class360.method2214(var610.toString(), -15036);
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    private static final void method2791(int arg0) {
        class178 var1 = class493.method2885(arg0, 65535);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class178[] var3 = class361.field5469[var2];
        if (var3 == null) {
            class178[] var4 = class467.field6572[var2];
            int var5 = var4.length;
            var3 = class361.field5469[var2] = new class178[var5];
            class149.method1008(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class149.method1008(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lsa;I)V")
    private static final void method2792(class415 arg0, int arg1) {
        Object[] var2 = arg0.field5989;
        int var3 = (Integer) var2[0];
        class99 var4 = class219.method1447(-126, var3);
        if (var4 == null) {
            return;
        }
        field6687 = new int[var4.field1402];
        int var5 = 0;
        field6685 = new String[var4.field1401];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field5983;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field5980;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field5990 == null ? -1 : arg0.field5990.field2631;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field5982;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field5990 == null ? -1 : arg0.field5990.field2534;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field5979 == null ? -1 : arg0.field5979.field2631;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field5979 == null ? -1 : arg0.field5979.field2534;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field5984;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field5978;
                }
                field6687[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field5991;
                }
                field6685[var6++] = var9;
            }
        }
        method2790(var4, arg1);
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
    private static final void method2793(int arg0) {
        class178 var1 = class493.method2885(arg0, 65535);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class178[] var3 = class361.field5469[var2];
        if (var3 == null) {
            class178[] var4 = class467.field6572[var2];
            int var5 = var4.length;
            var3 = class361.field5469[var2] = new class178[var5];
            class149.method1008(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class149.method1008(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method2794(String arg0, int arg1) {
        if (class465.field6556 == 0 && !(!class305.field4555 || class174.field2468) || class206.field3122) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class286.field4375.method2036(0, (byte) -21))) {
            var3 = 0;
            arg0 = arg0.substring(class286.field4375.method2036(0, (byte) -21).length());
        } else if (var2.startsWith(class286.field4370.method2036(0, (byte) -21))) {
            var3 = 1;
            arg0 = arg0.substring(class286.field4370.method2036(0, (byte) -21).length());
        } else if (var2.startsWith(class336.field5031.method2036(0, (byte) -21))) {
            var3 = 2;
            arg0 = arg0.substring(class336.field5031.method2036(0, (byte) -21).length());
        } else if (var2.startsWith(class188.field2859.method2036(0, (byte) -21))) {
            var3 = 3;
            arg0 = arg0.substring(class188.field2859.method2036(0, (byte) -21).length());
        } else if (var2.startsWith(class386.field5699.method2036(0, (byte) -21))) {
            var3 = 4;
            arg0 = arg0.substring(class386.field5699.method2036(0, (byte) -21).length());
        } else if (var2.startsWith(class390.field5737.method2036(0, (byte) -21))) {
            var3 = 5;
            arg0 = arg0.substring(class390.field5737.method2036(0, (byte) -21).length());
        } else if (var2.startsWith(class468.field6585.method2036(0, (byte) -21))) {
            var3 = 6;
            arg0 = arg0.substring(class468.field6585.method2036(0, (byte) -21).length());
        } else if (var2.startsWith(class384.field5688.method2036(0, (byte) -21))) {
            var3 = 7;
            arg0 = arg0.substring(class384.field5688.method2036(0, (byte) -21).length());
        } else if (var2.startsWith(class453.field6440.method2036(0, (byte) -21))) {
            var3 = 8;
            arg0 = arg0.substring(class453.field6440.method2036(0, (byte) -21).length());
        } else if (var2.startsWith(class45.field648.method2036(0, (byte) -21))) {
            var3 = 9;
            arg0 = arg0.substring(class45.field648.method2036(0, (byte) -21).length());
        } else if (var2.startsWith(class336.field5034.method2036(0, (byte) -21))) {
            var3 = 10;
            arg0 = arg0.substring(class336.field5034.method2036(0, (byte) -21).length());
        } else if (var2.startsWith(class297.field4448.method2036(0, (byte) -21))) {
            var3 = 11;
            arg0 = arg0.substring(class297.field4448.method2036(0, (byte) -21).length());
        } else if (class4.field85 != 0) {
            if (var2.startsWith(class286.field4375.method2036(class4.field85, (byte) -21))) {
                var3 = 0;
                arg0 = arg0.substring(class286.field4375.method2036(class4.field85, (byte) -21).length());
            } else if (var2.startsWith(class286.field4370.method2036(class4.field85, (byte) -21))) {
                var3 = 1;
                arg0 = arg0.substring(class286.field4370.method2036(class4.field85, (byte) -21).length());
            } else if (var2.startsWith(class336.field5031.method2036(class4.field85, (byte) -21))) {
                var3 = 2;
                arg0 = arg0.substring(class336.field5031.method2036(class4.field85, (byte) -21).length());
            } else if (var2.startsWith(class188.field2859.method2036(class4.field85, (byte) -21))) {
                var3 = 3;
                arg0 = arg0.substring(class188.field2859.method2036(class4.field85, (byte) -21).length());
            } else if (var2.startsWith(class386.field5699.method2036(class4.field85, (byte) -21))) {
                var3 = 4;
                arg0 = arg0.substring(class386.field5699.method2036(class4.field85, (byte) -21).length());
            } else if (var2.startsWith(class390.field5737.method2036(class4.field85, (byte) -21))) {
                var3 = 5;
                arg0 = arg0.substring(class390.field5737.method2036(class4.field85, (byte) -21).length());
            } else if (var2.startsWith(class468.field6585.method2036(class4.field85, (byte) -21))) {
                var3 = 6;
                arg0 = arg0.substring(class468.field6585.method2036(class4.field85, (byte) -21).length());
            } else if (var2.startsWith(class384.field5688.method2036(class4.field85, (byte) -21))) {
                var3 = 7;
                arg0 = arg0.substring(class384.field5688.method2036(class4.field85, (byte) -21).length());
            } else if (var2.startsWith(class453.field6440.method2036(class4.field85, (byte) -21))) {
                var3 = 8;
                arg0 = arg0.substring(class453.field6440.method2036(class4.field85, (byte) -21).length());
            } else if (var2.startsWith(class45.field648.method2036(class4.field85, (byte) -21))) {
                var3 = 9;
                arg0 = arg0.substring(class45.field648.method2036(class4.field85, (byte) -21).length());
            } else if (var2.startsWith(class336.field5034.method2036(class4.field85, (byte) -21))) {
                var3 = 10;
                arg0 = arg0.substring(class336.field5034.method2036(class4.field85, (byte) -21).length());
            } else if (var2.startsWith(class297.field4448.method2036(class4.field85, (byte) -21))) {
                var3 = 11;
                arg0 = arg0.substring(class297.field4448.method2036(class4.field85, (byte) -21).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class52.field752.method2036(0, (byte) -21))) {
            var5 = 1;
            arg0 = arg0.substring(class52.field752.method2036(0, (byte) -21).length());
        } else if (var4.startsWith(class246.field3578.method2036(0, (byte) -21))) {
            var5 = 2;
            arg0 = arg0.substring(class246.field3578.method2036(0, (byte) -21).length());
        } else if (var4.startsWith(class65.field896.method2036(0, (byte) -21))) {
            var5 = 3;
            arg0 = arg0.substring(class65.field896.method2036(0, (byte) -21).length());
        } else if (var4.startsWith(class141.field2020.method2036(0, (byte) -21))) {
            var5 = 4;
            arg0 = arg0.substring(class141.field2020.method2036(0, (byte) -21).length());
        } else if (var4.startsWith(class225.field3256.method2036(0, (byte) -21))) {
            var5 = 5;
            arg0 = arg0.substring(class225.field3256.method2036(0, (byte) -21).length());
        } else if (class4.field85 != 0) {
            if (var4.startsWith(class52.field752.method2036(class4.field85, (byte) -21))) {
                var5 = 1;
                arg0 = arg0.substring(class52.field752.method2036(class4.field85, (byte) -21).length());
            } else if (var4.startsWith(class246.field3578.method2036(class4.field85, (byte) -21))) {
                var5 = 2;
                arg0 = arg0.substring(class246.field3578.method2036(class4.field85, (byte) -21).length());
            } else if (var4.startsWith(class65.field896.method2036(class4.field85, (byte) -21))) {
                var5 = 3;
                arg0 = arg0.substring(class65.field896.method2036(class4.field85, (byte) -21).length());
            } else if (var4.startsWith(class141.field2020.method2036(class4.field85, (byte) -21))) {
                var5 = 4;
                arg0 = arg0.substring(class141.field2020.method2036(class4.field85, (byte) -21).length());
            } else if (var4.startsWith(class225.field3256.method2036(class4.field85, (byte) -21))) {
                var5 = 5;
                arg0 = arg0.substring(class225.field3256.method2036(class4.field85, (byte) -21).length());
            }
        }
        field6678++;
        class378.method2320(class419.field6025, (byte) 119);
        class230.field3390.method2619((byte) -21, 0);
        int var6 = class230.field3390.field6315;
        if (arg1 == 5021) {
            class230.field3390.method2619((byte) 70, 1);
        } else {
            class230.field3390.method2619((byte) 94, 0);
        }
        class230.field3390.method2619((byte) 6, var3);
        class230.field3390.method2619((byte) -120, var5);
        class439.method2553(arg0, 114, class230.field3390);
        class230.field3390.method2603(class230.field3390.field6315 - var6, -24420);
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V")
    public static final void method2795(int arg0) {
        if (arg0 == -1 || !class161.method1094(2007241424, arg0)) {
            return;
        }
        class178[] var1 = class467.field6572[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class178 var3 = var1[var2];
            if (var3.field2591 != null) {
                class415 var4 = new class415();
                var4.field5990 = var3;
                var4.field5989 = var3.field2591;
                method2792(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "()V")
    public static void method2796() {
        field6687 = null;
        field6685 = null;
        field6693 = null;
        field6681 = null;
        field6679 = null;
        field6688 = null;
        field6683 = null;
        field6692 = null;
        field6695 = null;
        field6698 = null;
        field6696 = null;
        field6702 = null;
        field6701 = null;
        field6703 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lsa;)V")
    public static final void method2797(class415 arg0) {
        method2792(arg0, 200000);
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)Ljava/lang/String;")
    private static final String method2798(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field6696.setTime(new Date(var1));
        int var3 = field6696.get(5);
        int var4 = field6696.get(2);
        int var5 = field6696.get(1);
        return var3 + "-" + field6702[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lsl;II)V")
    public static final void method2799(class422 arg0, int arg1, int arg2) {
        class99 var3 = class163.method1108(arg1, 16776960, arg2, arg0);
        if (var3 == null) {
            return;
        }
        field6687 = new int[var3.field1402];
        field6685 = new String[var3.field1401];
        if (class77.field1090 == var3.field1404 || class409.field5927 == var3.field1404 || class313.field4714 == var3.field1404) {
            int var4 = 0;
            int var5 = 0;
            if (class330.field4954 != null) {
                var4 = class330.field4954.field2593;
                var5 = class330.field4954.field2648;
            }
            field6687[0] = class78.field1105.method1975(112) - var4;
            field6687[1] = class78.field1105.method1984((byte) -37) - var5;
        }
        method2790(var3, 200000);
    }
}
