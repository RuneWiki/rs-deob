import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class201 {

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "[Ljava/lang/String;")
    private static String[] field2860 = new String[1000];

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "[[I")
    private static int[][] field2864 = new int[5][5000];

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    private static int field2863 = 0;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "[Lf;")
    private static class452[] field2871 = new class452[50];

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "[I")
    private static int[] field2869 = new int[1000];

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "[I")
    private static int[] field2872 = new int[5];

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "Ljava/util/Calendar;")
    private static Calendar field2877 = Calendar.getInstance();

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "[I")
    private static int[] field2882 = new int[3];

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field2883 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "Llg;")
    public static class237 field2881 = new class237(4);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "Ls;")
    private static class153 field2876;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "Lon;")
    private static class184 field2874;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "Lon;")
    private static class184 field2875;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "[I")
    private static int[] field2880;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "[Ljava/lang/String;")
    private static String[] field2859;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lec;I)V", line = 5)
    private static final void method1330(class128 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field1555;
        int[] var6 = arg0.field1561;
        byte var7 = -1;
        field2863 = 0;
        try {
            int var8 = 0;
            label4485: while (true) {
                var8++;
                if (var8 > arg1) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var621 = var5[var4];
                if (var621 < 100) {
                    if (var621 == 0) {
                        field2869[var2++] = var6[var4];
                        continue;
                    }
                    if (var621 == 1) {
                        int var9 = var6[var4];
                        field2869[var2++] = class4.field61[var9];
                        continue;
                    }
                    if (var621 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class130.method809((byte) 59, var10, field2869[var2]);
                        continue;
                    }
                    if (var621 == 3) {
                        field2860[var3++] = arg0.field1557[var4];
                        continue;
                    }
                    if (var621 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var621 == 7) {
                        var2 -= 2;
                        if (field2869[var2 + 1] != field2869[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 8) {
                        var2 -= 2;
                        if (field2869[var2 + 1] == field2869[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 9) {
                        var2 -= 2;
                        if (field2869[var2] < field2869[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 10) {
                        var2 -= 2;
                        if (field2869[var2] > field2869[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 21) {
                        if (field2863 == 0) {
                            return;
                        }
                        class452 var11 = field2871[--field2863];
                        arg0 = var11.field6469;
                        var5 = arg0.field1555;
                        var6 = arg0.field1561;
                        var4 = var11.field6463;
                        field2880 = var11.field6465;
                        field2859 = var11.field6473;
                        continue;
                    }
                    if (var621 == 25) {
                        int var12 = var6[var4];
                        field2869[var2++] = class18.method126(false, var12);
                        continue;
                    }
                    if (var621 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class105.method577(field2869[var2], var13, -110);
                        continue;
                    }
                    if (var621 == 31) {
                        var2 -= 2;
                        if (field2869[var2] <= field2869[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 32) {
                        var2 -= 2;
                        if (field2869[var2] >= field2869[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 33) {
                        field2869[var2++] = field2880[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var621 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field2880[var10001] = field2869[var2];
                        continue;
                    }
                    if (var621 == 35) {
                        field2860[var3++] = field2859[var6[var4]];
                        continue;
                    }
                    if (var621 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field2859[var10001] = field2860[var3];
                        continue;
                    }
                    if (var621 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class150.method908((byte) 126, field2860, var3, var14);
                        field2860[var3++] = var15;
                        continue;
                    }
                    if (var621 == 38) {
                        var2--;
                        continue;
                    }
                    if (var621 == 39) {
                        var3--;
                        continue;
                    }
                    if (var621 == 40) {
                        int var16 = var6[var4];
                        class128 var17 = class330.method2130(var16, -2);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field1546];
                        String[] var19 = new String[var17.field1559];
                        for (int var20 = 0; var20 < var17.field1549; var20++) {
                            var18[var20] = field2869[var2 + var20 - var17.field1549];
                        }
                        for (int var21 = 0; var21 < var17.field1556; var21++) {
                            var19[var21] = field2860[var3 + var21 - var17.field1556];
                        }
                        var2 -= var17.field1549;
                        var3 -= var17.field1556;
                        class452 var22 = new class452();
                        var22.field6469 = arg0;
                        var22.field6463 = var4;
                        var22.field6465 = field2880;
                        var22.field6473 = field2859;
                        if (field2863 >= field2871.length) {
                            throw new RuntimeException();
                        }
                        field2871[field2863++] = var22;
                        arg0 = var17;
                        var5 = var17.field1555;
                        var6 = var17.field1561;
                        var4 = -1;
                        field2880 = var18;
                        field2859 = var19;
                        continue;
                    }
                    if (var621 == 42) {
                        field2869[var2++] = class158.field2064[var6[var4]];
                        continue;
                    }
                    if (var621 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class158.field2064[var23] = field2869[var2];
                        class423.method2669(var23, (byte) 13);
                        class266.field3794 |= class134.field1621[var23];
                        continue;
                    }
                    if (var621 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field2869[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field2872[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4485;
                                }
                                field2864[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var621 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field2869[var2];
                        if (var30 >= 0 && var30 < field2872[var29]) {
                            field2869[var2++] = field2864[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var621 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field2869[var2];
                        if (var32 >= 0 && var32 < field2872[var31]) {
                            field2864[var31][var32] = field2869[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var621 == 47) {
                        String var33 = class150.field1855[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field2860[var3++] = var33;
                        continue;
                    }
                    if (var621 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class150.field1855[var34] = field2860[var3];
                        class448.method2782(var34, 2);
                        continue;
                    }
                    if (var621 == 51) {
                        class288 var35 = arg0.field1552[var6[var4]];
                        var2--;
                        class25 var36 = (class25) var35.method1888((long) field2869[var2], (byte) -30);
                        if (var36 != null) {
                            var4 += var36.field311;
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
                if (var621 < 300) {
                    if (var621 == 100) {
                        var2 -= 3;
                        int var38 = field2869[var2];
                        int var39 = field2869[var2 + 1];
                        int var40 = field2869[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class184 var41 = class282.method1863(var38, -25835);
                        if (var41.field2603 == null) {
                            var41.field2603 = new class184[var40 + 1];
                        }
                        if (var41.field2603.length <= var40) {
                            class184[] var42 = new class184[var40 + 1];
                            for (int var43 = 0; var43 < var41.field2603.length; var43++) {
                                var42[var43] = var41.field2603[var43];
                            }
                            var41.field2603 = var42;
                        }
                        if (var40 > 0 && var41.field2603[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class184 var44 = new class184();
                        var44.field2524 = var39;
                        var44.field2599 = var44.field2584 = var41.field2584;
                        var44.field2668 = var40;
                        var41.field2603[var40] = var44;
                        if (var37) {
                            field2875 = var44;
                        } else {
                            field2874 = var44;
                        }
                        class186.method1277(var41, (byte) 123);
                        continue;
                    }
                    if (var621 == 101) {
                        class184 var45 = var37 ? field2875 : field2874;
                        if (var45.field2668 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class184 var46 = class282.method1863(var45.field2584, -25835);
                        var46.field2603[var45.field2668] = null;
                        class186.method1277(var46, (byte) 127);
                        continue;
                    }
                    if (var621 == 102) {
                        var2--;
                        class184 var47 = class282.method1863(field2869[var2], -25835);
                        var47.field2603 = null;
                        class186.method1277(var47, (byte) 72);
                        continue;
                    }
                    if (var621 == 200) {
                        var2 -= 2;
                        int var48 = field2869[var2];
                        int var49 = field2869[var2 + 1];
                        class184 var50 = class341.method2186(var48, (byte) 21, var49);
                        if (var50 != null && var49 != -1) {
                            field2869[var2++] = 1;
                            if (var37) {
                                field2875 = var50;
                            } else {
                                field2874 = var50;
                            }
                            continue;
                        }
                        field2869[var2++] = 0;
                        continue;
                    }
                    if (var621 == 201) {
                        var2--;
                        int var51 = field2869[var2];
                        class184 var52 = class282.method1863(var51, -25835);
                        if (var52 == null) {
                            field2869[var2++] = 0;
                        } else {
                            field2869[var2++] = 1;
                            if (var37) {
                                field2875 = var52;
                            } else {
                                field2874 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var621 < 500) {
                    if (var621 == 403) {
                        var2 -= 2;
                        int var53 = field2869[var2];
                        int var54 = field2869[var2 + 1];
                        for (int var55 = 0; var55 < class126.field1537.length; var55++) {
                            if (class126.field1537[var55] == var53) {
                                class384.field5422.field453.method1813(var55, var54, (byte) -92);
                                continue label4485;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class218.field3073.length) {
                                continue label4485;
                            }
                            if (class218.field3073[var56] == var53) {
                                class384.field5422.field453.method1813(var56, var54, (byte) -92);
                                continue label4485;
                            }
                            var56++;
                        }
                    }
                    if (var621 == 404) {
                        var2 -= 2;
                        int var57 = field2869[var2];
                        int var58 = field2869[var2 + 1];
                        class384.field5422.field453.method1811((byte) -108, var57, var58);
                        continue;
                    }
                    if (var621 == 410) {
                        var2--;
                        boolean var59 = field2869[var2] != 0;
                        class384.field5422.field453.method1815((byte) -120, var59);
                        continue;
                    }
                } else if (!(var621 < 1000 || var621 >= 1100) || !(var621 < 2000 || var621 >= 2100)) {
                    class184 var60;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var60 = class282.method1863(field2869[var2], -25835);
                    } else {
                        var60 = var37 ? field2875 : field2874;
                    }
                    if (var621 == 1000) {
                        var2 -= 4;
                        var60.field2512 = field2869[var2];
                        var60.field2559 = field2869[var2 + 1];
                        int var61 = field2869[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field2869[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field2554 = (byte) var61;
                        var60.field2662 = (byte) var62;
                        class186.method1277(var60, (byte) -120);
                        class176.method1197(var60, 2913);
                        if (var60.field2668 == -1) {
                            class33.method209(11, var60.field2584);
                        }
                        continue;
                    }
                    if (var621 == 1001) {
                        var2 -= 4;
                        var60.field2585 = field2869[var2];
                        var60.field2557 = field2869[var2 + 1];
                        var60.field2523 = 0;
                        var60.field2627 = 0;
                        int var63 = field2869[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field2869[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field2548 = (byte) var63;
                        var60.field2536 = (byte) var64;
                        class186.method1277(var60, (byte) -20);
                        class176.method1197(var60, 2913);
                        if (var60.field2524 == 0) {
                            class384.method2466(false, var60, (byte) -87);
                        }
                        continue;
                    }
                    if (var621 == 1003) {
                        var2--;
                        boolean var65 = field2869[var2] == 1;
                        if (var60.field2601 != var65) {
                            var60.field2601 = var65;
                            class186.method1277(var60, (byte) -89);
                        }
                        if (var60.field2668 == -1) {
                            class184.method1243(var60.field2584, 7);
                        }
                        continue;
                    }
                    if (var621 == 1004) {
                        var2 -= 2;
                        var60.field2528 = field2869[var2];
                        var60.field2656 = field2869[var2 + 1];
                        class186.method1277(var60, (byte) 114);
                        class176.method1197(var60, 2913);
                        if (var60.field2524 == 0) {
                            class384.method2466(false, var60, (byte) -66);
                        }
                        continue;
                    }
                    if (var621 == 1005) {
                        var2--;
                        var60.field2606 = field2869[var2] == 1;
                        continue;
                    }
                } else if (var621 >= 1100 && var621 < 1200 || var621 >= 2100 && var621 < 2200) {
                    class184 var66;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var66 = class282.method1863(field2869[var2], -25835);
                    } else {
                        var66 = var37 ? field2875 : field2874;
                    }
                    if (var621 == 1100) {
                        var2 -= 2;
                        var66.field2655 = field2869[var2];
                        if (var66.field2655 > var66.field2545 - var66.field2618) {
                            var66.field2655 = var66.field2545 - var66.field2618;
                        }
                        if (var66.field2655 < 0) {
                            var66.field2655 = 0;
                        }
                        var66.field2648 = field2869[var2 + 1];
                        if (var66.field2648 > var66.field2646 - var66.field2516) {
                            var66.field2648 = var66.field2646 - var66.field2516;
                        }
                        if (var66.field2648 < 0) {
                            var66.field2648 = 0;
                        }
                        class186.method1277(var66, (byte) 110);
                        if (var66.field2668 == -1) {
                            class260.method1741(var66.field2584, -25);
                        }
                        continue;
                    }
                    if (var621 == 1101) {
                        var2--;
                        var66.field2546 = field2869[var2];
                        class186.method1277(var66, (byte) 116);
                        if (var66.field2668 == -1) {
                            class274.method1805(var66.field2584, -1);
                        }
                        continue;
                    }
                    if (var621 == 1102) {
                        var2--;
                        var66.field2514 = field2869[var2] == 1;
                        class186.method1277(var66, (byte) 92);
                        continue;
                    }
                    if (var621 == 1103) {
                        var2--;
                        var66.field2665 = field2869[var2];
                        class186.method1277(var66, (byte) -94);
                        continue;
                    }
                    if (var621 == 1104) {
                        var2--;
                        var66.field2581 = field2869[var2];
                        class186.method1277(var66, (byte) -85);
                        continue;
                    }
                    if (var621 == 1105) {
                        var2--;
                        int var67 = field2869[var2];
                        if (var66.field2552 != var67) {
                            var66.field2552 = var67;
                            class186.method1277(var66, (byte) -100);
                        }
                        if (var66.field2668 == -1) {
                            class222.method1490((byte) -33, var66.field2584);
                        }
                        continue;
                    }
                    if (var621 == 1106) {
                        var2--;
                        var66.field2592 = field2869[var2];
                        class186.method1277(var66, (byte) -45);
                        continue;
                    }
                    if (var621 == 1107) {
                        var2--;
                        var66.field2533 = field2869[var2] == 1;
                        class186.method1277(var66, (byte) -98);
                        continue;
                    }
                    if (var621 == 1108) {
                        var66.field2539 = 1;
                        var2--;
                        var66.field2520 = field2869[var2];
                        class186.method1277(var66, (byte) -47);
                        if (var66.field2668 == -1) {
                            class295.method1952(4, var66.field2584);
                        }
                        continue;
                    }
                    if (var621 == 1109) {
                        var2 -= 6;
                        var66.field2607 = field2869[var2];
                        var66.field2588 = field2869[var2 + 1];
                        var66.field2532 = field2869[var2 + 2];
                        var66.field2604 = field2869[var2 + 3];
                        var66.field2515 = field2869[var2 + 4];
                        var66.field2558 = field2869[var2 + 5];
                        class186.method1277(var66, (byte) -64);
                        if (var66.field2668 == -1) {
                            class32.method199(8, var66.field2584);
                            class101.method556(-121, var66.field2584);
                        }
                        continue;
                    }
                    if (var621 == 1110) {
                        var2--;
                        int var68 = field2869[var2];
                        if (var66.field2544 != var68) {
                            var66.field2544 = var68;
                            var66.field2566 = 0;
                            var66.field2541 = 1;
                            var66.field2550 = 0;
                            class186.method1277(var66, (byte) -112);
                        }
                        if (var66.field2668 == -1) {
                            class217.method1454(var66.field2584, -123);
                        }
                        continue;
                    }
                    if (var621 == 1111) {
                        var2--;
                        var66.field2664 = field2869[var2] == 1;
                        class186.method1277(var66, (byte) -119);
                        continue;
                    }
                    if (var621 == 1112) {
                        var3--;
                        String var69 = field2860[var3];
                        if (!var69.equals(var66.field2650)) {
                            var66.field2650 = var69;
                            class186.method1277(var66, (byte) 100);
                        }
                        if (var66.field2668 == -1) {
                            class2.method4(var66.field2584, 0);
                        }
                        continue;
                    }
                    if (var621 == 1113) {
                        var2--;
                        var66.field2556 = field2869[var2];
                        class186.method1277(var66, (byte) -98);
                        if (var66.field2668 == -1) {
                            class352.method2246(1, var66.field2584);
                        }
                        continue;
                    }
                    if (var621 == 1114) {
                        var2 -= 3;
                        var66.field2659 = field2869[var2];
                        var66.field2612 = field2869[var2 + 1];
                        var66.field2652 = field2869[var2 + 2];
                        class186.method1277(var66, (byte) -19);
                        continue;
                    }
                    if (var621 == 1115) {
                        var2--;
                        var66.field2651 = field2869[var2] == 1;
                        class186.method1277(var66, (byte) -80);
                        continue;
                    }
                    if (var621 == 1116) {
                        var2--;
                        var66.field2640 = field2869[var2];
                        class186.method1277(var66, (byte) 77);
                        continue;
                    }
                    if (var621 == 1117) {
                        var2--;
                        var66.field2643 = field2869[var2];
                        class186.method1277(var66, (byte) 115);
                        continue;
                    }
                    if (var621 == 1118) {
                        var2--;
                        var66.field2642 = field2869[var2] == 1;
                        class186.method1277(var66, (byte) -72);
                        continue;
                    }
                    if (var621 == 1119) {
                        var2--;
                        var66.field2583 = field2869[var2] == 1;
                        class186.method1277(var66, (byte) 80);
                        continue;
                    }
                    if (var621 == 1120) {
                        var2 -= 2;
                        var66.field2545 = field2869[var2];
                        var66.field2646 = field2869[var2 + 1];
                        class186.method1277(var66, (byte) 126);
                        if (var66.field2524 == 0) {
                            class384.method2466(false, var66, (byte) -114);
                        }
                        continue;
                    }
                    if (var621 == 1121) {
                        var2 -= 2;
                        var66.field2562 = (short) field2869[var2];
                        var66.field2564 = (short) field2869[var2 + 1];
                        class186.method1277(var66, (byte) -109);
                        continue;
                    }
                    if (var621 == 1122) {
                        var2--;
                        var66.field2529 = field2869[var2] == 1;
                        class186.method1277(var66, (byte) -95);
                        continue;
                    }
                    if (var621 == 1123) {
                        var2--;
                        var66.field2558 = field2869[var2];
                        class186.method1277(var66, (byte) 95);
                        if (var66.field2668 == -1) {
                            class32.method199(8, var66.field2584);
                        }
                        continue;
                    }
                    if (var621 == 1124) {
                        var2--;
                        int var70 = field2869[var2];
                        var66.field2571 = var70 == 1;
                        class186.method1277(var66, (byte) 105);
                        continue;
                    }
                    if (var621 == 1125) {
                        var2 -= 2;
                        var66.field2625 = field2869[var2];
                        var66.field2628 = field2869[var2 + 1];
                        class186.method1277(var66, (byte) -28);
                        continue;
                    }
                } else if (!(var621 < 1200 || var621 >= 1300) || !(var621 < 2200 || var621 >= 2300)) {
                    class184 var71;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var71 = class282.method1863(field2869[var2], -25835);
                    } else {
                        var71 = var37 ? field2875 : field2874;
                    }
                    class186.method1277(var71, (byte) 104);
                    if (var621 == 1200 || var621 == 1205 || var621 == 1208 || var621 == 1209 || var621 == 1212 || var621 == 1213) {
                        var2 -= 2;
                        int var72 = field2869[var2];
                        int var73 = field2869[var2 + 1];
                        if (var71.field2668 == -1) {
                            class5.method41(-84, var71.field2584);
                            class32.method199(8, var71.field2584);
                            class101.method556(-122, var71.field2584);
                        }
                        if (var72 == -1) {
                            var71.field2539 = 1;
                            var71.field2520 = -1;
                            var71.field2635 = -1;
                            continue;
                        }
                        var71.field2635 = var72;
                        var71.field2657 = var73;
                        if (var621 == 1208 || var621 == 1209) {
                            var71.field2597 = true;
                        } else {
                            var71.field2597 = false;
                        }
                        class163 var74 = class50.method288(0, var72);
                        var71.field2532 = var74.field2289;
                        var71.field2604 = var74.field2251;
                        var71.field2515 = var74.field2286;
                        var71.field2607 = var74.field2232;
                        var71.field2588 = var74.field2281;
                        var71.field2558 = var74.field2252;
                        if (var621 == 1205 || var621 == 1209) {
                            var71.field2615 = 0;
                        } else if (var621 == 1212 || var621 == 1213) {
                            var71.field2615 = 1;
                        } else {
                            var71.field2615 = 2;
                        }
                        if (var71.field2523 > 0) {
                            var71.field2558 = var71.field2558 * 32 / var71.field2523;
                        } else if (var71.field2585 > 0) {
                            var71.field2558 = var71.field2558 * 32 / var71.field2585;
                        }
                        continue;
                    }
                    if (var621 == 1201) {
                        var71.field2539 = 2;
                        var2--;
                        var71.field2520 = field2869[var2];
                        if (var71.field2668 == -1) {
                            class295.method1952(4, var71.field2584);
                        }
                        continue;
                    }
                    if (var621 == 1202) {
                        var71.field2539 = 3;
                        var71.field2520 = -1;
                        if (var71.field2668 == -1) {
                            class295.method1952(4, var71.field2584);
                        }
                        continue;
                    }
                    if (var621 == 1203) {
                        var71.field2539 = 6;
                        var2--;
                        var71.field2520 = field2869[var2];
                        if (var71.field2668 == -1) {
                            class295.method1952(4, var71.field2584);
                        }
                        continue;
                    }
                    if (var621 == 1204) {
                        var71.field2539 = 5;
                        var2--;
                        var71.field2520 = field2869[var2];
                        if (var71.field2668 == -1) {
                            class295.method1952(4, var71.field2584);
                        }
                        continue;
                    }
                    if (var621 == 1206) {
                        var2 -= 4;
                        var71.field2569 = field2869[var2];
                        var71.field2619 = field2869[var2 + 1];
                        var71.field2521 = field2869[var2 + 2];
                        var71.field2616 = field2869[var2 + 3];
                        class186.method1277(var71, (byte) -66);
                        continue;
                    }
                    if (var621 == 1207) {
                        var2 -= 2;
                        var71.field2630 = field2869[var2];
                        var71.field2525 = field2869[var2 + 1];
                        class186.method1277(var71, (byte) 125);
                        continue;
                    }
                    if (var621 == 1210) {
                        var2 -= 4;
                        var71.field2520 = field2869[var2];
                        var71.field2560 = field2869[var2 + 1];
                        if (field2869[var2 + 2] == 1) {
                            var71.field2539 = 9;
                        } else {
                            var71.field2539 = 8;
                        }
                        if (field2869[var2 + 3] == 1) {
                            var71.field2597 = true;
                        } else {
                            var71.field2597 = false;
                        }
                        if (var71.field2668 == -1) {
                            class295.method1952(4, var71.field2584);
                        }
                        continue;
                    }
                    if (var621 == 1211) {
                        var71.field2539 = 5;
                        var71.field2520 = 2047;
                        var71.field2560 = 0;
                        if (var71.field2668 == -1) {
                            class295.method1952(4, var71.field2584);
                        }
                        continue;
                    }
                } else if ((var621 < 1300 || var621 >= 1400) && (var621 < 2300 || var621 >= 2400)) {
                    if (var621 >= 1400 && var621 < 1500 || var621 >= 2400 && var621 < 2500) {
                        class184 var81;
                        if (var621 >= 2000) {
                            var621 -= 1000;
                            var2--;
                            var81 = class282.method1863(field2869[var2], -25835);
                        } else {
                            var81 = var37 ? field2875 : field2874;
                        }
                        var3--;
                        String var82 = field2860[var3];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var2--;
                            int var84 = field2869[var2];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var2--;
                                    var83[var84] = field2869[var2];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var3--;
                                var85[var86] = field2860[var3];
                            } else {
                                var2--;
                                var85[var86] = Integer.valueOf(field2869[var2]);
                            }
                        }
                        var2--;
                        int var87 = field2869[var2];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var621 == 1400) {
                            var81.field2579 = var85;
                        } else if (var621 == 1401) {
                            var81.field2661 = var85;
                        } else if (var621 == 1402) {
                            var81.field2551 = var85;
                        } else if (var621 == 1403) {
                            var81.field2596 = var85;
                        } else if (var621 == 1404) {
                            var81.field2543 = var85;
                        } else if (var621 == 1405) {
                            var81.field2565 = var85;
                        } else if (var621 == 1406) {
                            var81.field2617 = var85;
                        } else if (var621 == 1407) {
                            var81.field2624 = var85;
                            var81.field2653 = var83;
                        } else if (var621 == 1408) {
                            var81.field2631 = var85;
                        } else if (var621 == 1409) {
                            var81.field2589 = var85;
                        } else if (var621 == 1410) {
                            var81.field2666 = var85;
                        } else if (var621 == 1411) {
                            var81.field2610 = var85;
                        } else if (var621 == 1412) {
                            var81.field2620 = var85;
                        } else if (var621 == 1414) {
                            var81.field2658 = var85;
                            var81.field2626 = var83;
                        } else if (var621 == 1415) {
                            var81.field2573 = var85;
                            var81.field2549 = var83;
                        } else if (var621 == 1416) {
                            var81.field2671 = var85;
                        } else if (var621 == 1417) {
                            var81.field2614 = var85;
                        } else if (var621 == 1418) {
                            var81.field2534 = var85;
                        } else if (var621 == 1419) {
                            var81.field2586 = var85;
                        } else if (var621 == 1420) {
                            var81.field2580 = var85;
                        } else if (var621 == 1421) {
                            var81.field2578 = var85;
                        } else if (var621 == 1422) {
                            var81.field2537 = var85;
                        } else if (var621 == 1423) {
                            var81.field2517 = var85;
                        } else if (var621 == 1424) {
                            var81.field2570 = var85;
                        } else if (var621 == 1425) {
                            var81.field2594 = var85;
                        } else if (var621 == 1426) {
                            var81.field2553 = var85;
                        } else if (var621 == 1427) {
                            var81.field2629 = var85;
                        } else if (var621 == 1428) {
                            var81.field2669 = var85;
                            var81.field2572 = var83;
                        } else if (var621 == 1429) {
                            var81.field2639 = var85;
                            var81.field2519 = var83;
                        }
                        var81.field2555 = true;
                        continue;
                    }
                    if (var621 < 1600) {
                        class184 var88 = var37 ? field2875 : field2874;
                        if (var621 == 1500) {
                            field2869[var2++] = var88.field2567;
                            continue;
                        }
                        if (var621 == 1501) {
                            field2869[var2++] = var88.field2602;
                            continue;
                        }
                        if (var621 == 1502) {
                            field2869[var2++] = var88.field2618;
                            continue;
                        }
                        if (var621 == 1503) {
                            field2869[var2++] = var88.field2516;
                            continue;
                        }
                        if (var621 == 1504) {
                            field2869[var2++] = var88.field2601 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 1505) {
                            field2869[var2++] = var88.field2599;
                            continue;
                        }
                    } else if (var621 < 1700) {
                        class184 var89 = var37 ? field2875 : field2874;
                        if (var621 == 1600) {
                            field2869[var2++] = var89.field2655;
                            continue;
                        }
                        if (var621 == 1601) {
                            field2869[var2++] = var89.field2648;
                            continue;
                        }
                        if (var621 == 1602) {
                            field2860[var3++] = var89.field2650;
                            continue;
                        }
                        if (var621 == 1603) {
                            field2869[var2++] = var89.field2545;
                            continue;
                        }
                        if (var621 == 1604) {
                            field2869[var2++] = var89.field2646;
                            continue;
                        }
                        if (var621 == 1605) {
                            field2869[var2++] = var89.field2558;
                            continue;
                        }
                        if (var621 == 1606) {
                            field2869[var2++] = var89.field2532;
                            continue;
                        }
                        if (var621 == 1607) {
                            field2869[var2++] = var89.field2515;
                            continue;
                        }
                        if (var621 == 1608) {
                            field2869[var2++] = var89.field2604;
                            continue;
                        }
                        if (var621 == 1609) {
                            field2869[var2++] = var89.field2665;
                            continue;
                        }
                        if (var621 == 1610) {
                            field2869[var2++] = var89.field2607;
                            continue;
                        }
                        if (var621 == 1611) {
                            field2869[var2++] = var89.field2588;
                            continue;
                        }
                        if (var621 == 1612) {
                            field2869[var2++] = var89.field2552;
                            continue;
                        }
                    } else if (var621 < 1800) {
                        class184 var90 = var37 ? field2875 : field2874;
                        if (var621 == 1700) {
                            field2869[var2++] = var90.field2635;
                            continue;
                        }
                        if (var621 == 1701) {
                            if (var90.field2635 == -1) {
                                field2869[var2++] = 0;
                            } else {
                                field2869[var2++] = var90.field2657;
                            }
                            continue;
                        }
                        if (var621 == 1702) {
                            field2869[var2++] = var90.field2668;
                            continue;
                        }
                    } else if (var621 < 1900) {
                        class184 var91 = var37 ? field2875 : field2874;
                        if (var621 == 1800) {
                            field2869[var2++] = client.method1121(var91).method1860(-1);
                            continue;
                        }
                        if (var621 == 1801) {
                            var2--;
                            int var92 = field2869[var2];
                            int var622 = var92 - 1;
                            if (var91.field2622 != null && var622 < var91.field2622.length && var91.field2622[var622] != null) {
                                field2860[var3++] = var91.field2622[var622];
                                continue;
                            }
                            field2860[var3++] = "";
                            continue;
                        }
                        if (var621 == 1802) {
                            if (var91.field2613 == null) {
                                field2860[var3++] = "";
                            } else {
                                field2860[var3++] = var91.field2613;
                            }
                            continue;
                        }
                    } else if (var621 < 2600) {
                        var2--;
                        class184 var93 = class282.method1863(field2869[var2], -25835);
                        if (var621 == 2500) {
                            field2869[var2++] = var93.field2567;
                            continue;
                        }
                        if (var621 == 2501) {
                            field2869[var2++] = var93.field2602;
                            continue;
                        }
                        if (var621 == 2502) {
                            field2869[var2++] = var93.field2618;
                            continue;
                        }
                        if (var621 == 2503) {
                            field2869[var2++] = var93.field2516;
                            continue;
                        }
                        if (var621 == 2504) {
                            field2869[var2++] = var93.field2601 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 2505) {
                            field2869[var2++] = var93.field2599;
                            continue;
                        }
                    } else if (var621 < 2700) {
                        var2--;
                        class184 var94 = class282.method1863(field2869[var2], -25835);
                        if (var621 == 2600) {
                            field2869[var2++] = var94.field2655;
                            continue;
                        }
                        if (var621 == 2601) {
                            field2869[var2++] = var94.field2648;
                            continue;
                        }
                        if (var621 == 2602) {
                            field2860[var3++] = var94.field2650;
                            continue;
                        }
                        if (var621 == 2603) {
                            field2869[var2++] = var94.field2545;
                            continue;
                        }
                        if (var621 == 2604) {
                            field2869[var2++] = var94.field2646;
                            continue;
                        }
                        if (var621 == 2605) {
                            field2869[var2++] = var94.field2558;
                            continue;
                        }
                        if (var621 == 2606) {
                            field2869[var2++] = var94.field2532;
                            continue;
                        }
                        if (var621 == 2607) {
                            field2869[var2++] = var94.field2515;
                            continue;
                        }
                        if (var621 == 2608) {
                            field2869[var2++] = var94.field2604;
                            continue;
                        }
                        if (var621 == 2609) {
                            field2869[var2++] = var94.field2665;
                            continue;
                        }
                        if (var621 == 2610) {
                            field2869[var2++] = var94.field2607;
                            continue;
                        }
                        if (var621 == 2611) {
                            field2869[var2++] = var94.field2588;
                            continue;
                        }
                        if (var621 == 2612) {
                            field2869[var2++] = var94.field2552;
                            continue;
                        }
                    } else if (var621 < 2800) {
                        if (var621 == 2700) {
                            var2--;
                            class184 var95 = class282.method1863(field2869[var2], -25835);
                            field2869[var2++] = var95.field2635;
                            continue;
                        }
                        if (var621 == 2701) {
                            var2--;
                            class184 var96 = class282.method1863(field2869[var2], -25835);
                            if (var96.field2635 == -1) {
                                field2869[var2++] = 0;
                            } else {
                                field2869[var2++] = var96.field2657;
                            }
                            continue;
                        }
                        if (var621 == 2702) {
                            var2--;
                            int var97 = field2869[var2];
                            class167 var98 = (class167) class22.field280.method1888((long) var97, (byte) -30);
                            if (var98 == null) {
                                field2869[var2++] = 0;
                            } else {
                                field2869[var2++] = 1;
                            }
                            continue;
                        }
                        if (var621 == 2703) {
                            var2--;
                            class184 var99 = class282.method1863(field2869[var2], -25835);
                            if (var99.field2603 == null) {
                                field2869[var2++] = 0;
                                continue;
                            }
                            int var100 = var99.field2603.length;
                            for (int var101 = 0; var101 < var99.field2603.length; var101++) {
                                if (var99.field2603[var101] == null) {
                                    var100 = var101;
                                    break;
                                }
                            }
                            field2869[var2++] = var100;
                            continue;
                        }
                        if (var621 == 2704 || var621 == 2705) {
                            var2 -= 2;
                            int var102 = field2869[var2];
                            int var103 = field2869[var2 + 1];
                            class167 var104 = (class167) class22.field280.method1888((long) var102, (byte) -30);
                            if (var104 != null && var104.field2332 == var103) {
                                field2869[var2++] = 1;
                                continue;
                            }
                            field2869[var2++] = 0;
                            continue;
                        }
                    } else if (var621 < 2900) {
                        var2--;
                        class184 var105 = class282.method1863(field2869[var2], -25835);
                        if (var621 == 2800) {
                            field2869[var2++] = client.method1121(var105).method1860(-1);
                            continue;
                        }
                        if (var621 == 2801) {
                            var2--;
                            int var106 = field2869[var2];
                            int var623 = var106 - 1;
                            if (var105.field2622 != null && var623 < var105.field2622.length && var105.field2622[var623] != null) {
                                field2860[var3++] = var105.field2622[var623];
                                continue;
                            }
                            field2860[var3++] = "";
                            continue;
                        }
                        if (var621 == 2802) {
                            if (var105.field2613 == null) {
                                field2860[var3++] = "";
                            } else {
                                field2860[var3++] = var105.field2613;
                            }
                            continue;
                        }
                    } else if (var621 < 3200) {
                        if (var621 == 3100) {
                            var3--;
                            String var107 = field2860[var3];
                            class105.method578(var107, (byte) -45);
                            continue;
                        }
                        if (var621 == 3101) {
                            var2 -= 2;
                            class65.method372(field2869[var2 + 1], (byte) 22, class384.field5422, field2869[var2]);
                            continue;
                        }
                        if (var621 == 3103) {
                            class212.method1434(0, true);
                            continue;
                        }
                        if (var621 == 3104) {
                            var3--;
                            String var108 = field2860[var3];
                            int var109 = 0;
                            if (class112.method700(10, var108)) {
                                var109 = class4.method29(var108, 10);
                            }
                            field2861++;
                            class62.field718.method2143(196, -2);
                            class62.field718.method1603(var109, 871);
                            continue;
                        }
                        if (var621 == 3105) {
                            var3--;
                            String var110 = field2860[var3];
                            field2867++;
                            class62.field718.method2143(151, -2);
                            class62.field718.method1583(var110.length() + 1, (byte) -86);
                            class62.field718.method1596(var110, false);
                            continue;
                        }
                        if (var621 == 3106) {
                            var3--;
                            String var111 = field2860[var3];
                            field2862++;
                            class62.field718.method2143(86, -2);
                            class62.field718.method1583(var111.length() + 1, (byte) -75);
                            class62.field718.method1596(var111, false);
                            continue;
                        }
                        if (var621 == 3107) {
                            var2--;
                            int var112 = field2869[var2];
                            var3--;
                            String var113 = field2860[var3];
                            class286.method1870(-108, var112, var113);
                            continue;
                        }
                        if (var621 == 3108) {
                            var2 -= 3;
                            int var114 = field2869[var2];
                            int var115 = field2869[var2 + 1];
                            int var116 = field2869[var2 + 2];
                            class184 var117 = class282.method1863(var116, -25835);
                            class419.method2658(var117, 0, var114, var115);
                            continue;
                        }
                        if (var621 == 3109) {
                            var2 -= 2;
                            int var118 = field2869[var2];
                            int var119 = field2869[var2 + 1];
                            class184 var120 = var37 ? field2875 : field2874;
                            class419.method2658(var120, 0, var118, var119);
                            continue;
                        }
                        if (var621 == 3110) {
                            var2--;
                            int var121 = field2869[var2];
                            field2873++;
                            class62.field718.method2143(125, -2);
                            class62.field718.method1605(var121, false);
                            continue;
                        }
                        if (var621 == 3111) {
                            var2 -= 2;
                            int var122 = field2869[var2];
                            int var123 = field2869[var2 + 1];
                            class167 var124 = (class167) class22.field280.method1888((long) var122, (byte) -30);
                            if (var124 != null) {
                                class286.method1869(var124, var124.field2332 != var123, true, (byte) 113);
                            }
                            class32.method202(-336, 3, true, var123, var122);
                            continue;
                        }
                        if (var621 == 3112) {
                            var2--;
                            int var125 = field2869[var2];
                            class167 var126 = (class167) class22.field280.method1888((long) var125, (byte) -30);
                            if (var126 != null && var126.field2338 == 3) {
                                class286.method1869(var126, true, true, (byte) 120);
                            }
                            continue;
                        }
                    } else if (var621 < 3300) {
                        if (var621 == 3200) {
                            var2 -= 3;
                            class122.method776(field2869[var2], (byte) -96, 255, field2869[var2 + 1], field2869[var2 + 2]);
                            continue;
                        }
                        if (var621 == 3201) {
                            var2--;
                            class181.method1219((byte) -52, field2869[var2], 255);
                            continue;
                        }
                        if (var621 == 3202) {
                            var2 -= 2;
                            class394.method2519(255, field2869[var2], true, field2869[var2 + 1]);
                            continue;
                        }
                    } else if (var621 < 3400) {
                        if (var621 == 3300) {
                            field2869[var2++] = class189.field2726;
                            continue;
                        }
                        if (var621 == 3301) {
                            var2 -= 2;
                            int var127 = field2869[var2];
                            int var128 = field2869[var2 + 1];
                            field2869[var2++] = class218.method1459(10, var128, false, var127);
                            continue;
                        }
                        if (var621 == 3302) {
                            var2 -= 2;
                            int var129 = field2869[var2];
                            int var130 = field2869[var2 + 1];
                            field2869[var2++] = class385.method2469(var129, false, (byte) -91, var130);
                            continue;
                        }
                        if (var621 == 3303) {
                            var2 -= 2;
                            int var131 = field2869[var2];
                            int var132 = field2869[var2 + 1];
                            field2869[var2++] = class186.method1278(122, var132, var131, false);
                            continue;
                        }
                        if (var621 == 3304) {
                            var2--;
                            int var133 = field2869[var2];
                            field2869[var2++] = class285.method1865(var133, -31016).field7;
                            continue;
                        }
                        if (var621 == 3305) {
                            var2--;
                            int var134 = field2869[var2];
                            field2869[var2++] = class362.field5169[var134];
                            continue;
                        }
                        if (var621 == 3306) {
                            var2--;
                            int var135 = field2869[var2];
                            field2869[var2++] = class170.field2353[var135];
                            continue;
                        }
                        if (var621 == 3307) {
                            var2--;
                            int var136 = field2869[var2];
                            field2869[var2++] = class327.field4647[var136];
                            continue;
                        }
                        if (var621 == 3308) {
                            int var137 = class129.field1570;
                            int var138 = (class384.field5422.field3284 >> 7) + class114.field1403;
                            int var139 = (class384.field5422.field3269 >> 7) + class41.field496;
                            field2869[var2++] = (var137 << 28) + (var138 << 14) + var139;
                            continue;
                        }
                        if (var621 == 3309) {
                            var2--;
                            int var140 = field2869[var2];
                            field2869[var2++] = var140 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var621 == 3310) {
                            var2--;
                            int var141 = field2869[var2];
                            field2869[var2++] = var141 >> 28;
                            continue;
                        }
                        if (var621 == 3311) {
                            var2--;
                            int var142 = field2869[var2];
                            field2869[var2++] = var142 & 0x3FFF;
                            continue;
                        }
                        if (var621 == 3312) {
                            field2869[var2++] = class190.field2742 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3313) {
                            var2 -= 2;
                            int var143 = field2869[var2];
                            int var144 = field2869[var2 + 1];
                            field2869[var2++] = class218.method1459(10, var144, true, var143);
                            continue;
                        }
                        if (var621 == 3314) {
                            var2 -= 2;
                            int var145 = field2869[var2];
                            int var146 = field2869[var2 + 1];
                            field2869[var2++] = class385.method2469(var145, true, (byte) 121, var146);
                            continue;
                        }
                        if (var621 == 3315) {
                            var2 -= 2;
                            int var147 = field2869[var2];
                            int var148 = field2869[var2 + 1];
                            field2869[var2++] = class186.method1278(126, var148, var147, true);
                            continue;
                        }
                        if (var621 == 3316) {
                            if (class135.field1685 >= 2) {
                                field2869[var2++] = class135.field1685;
                            } else {
                                field2869[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 3317) {
                            field2869[var2++] = class328.field4656;
                            continue;
                        }
                        if (var621 == 3318) {
                            field2869[var2++] = class397.field5685;
                            continue;
                        }
                        if (var621 == 3321) {
                            field2869[var2++] = class170.field2352;
                            continue;
                        }
                        if (var621 == 3322) {
                            field2869[var2++] = class143.field1753;
                            continue;
                        }
                        if (var621 == 3323) {
                            if (class367.field5209 >= 5 && class367.field5209 <= 9) {
                                field2869[var2++] = 1;
                                continue;
                            }
                            field2869[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3324) {
                            if (class367.field5209 >= 5 && class367.field5209 <= 9) {
                                field2869[var2++] = class367.field5209;
                                continue;
                            }
                            field2869[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3325) {
                            field2869[var2++] = class429.field6198 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3326) {
                            field2869[var2++] = class384.field5422.field465;
                            continue;
                        }
                        if (var621 == 3327) {
                            field2869[var2++] = class384.field5422.field453.field3901 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3328) {
                            field2869[var2++] = class452.field6472 && !class331.field4681 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3329) {
                            field2869[var2++] = class400.field5721 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3330) {
                            var2--;
                            int var149 = field2869[var2];
                            field2869[var2++] = class35.method214(var149, false, -1);
                            continue;
                        }
                        if (var621 == 3331) {
                            var2 -= 2;
                            int var150 = field2869[var2];
                            int var151 = field2869[var2 + 1];
                            field2869[var2++] = class345.method2206(false, false, var151, var150, -15563);
                            continue;
                        }
                        if (var621 == 3332) {
                            var2 -= 2;
                            int var152 = field2869[var2];
                            int var153 = field2869[var2 + 1];
                            field2869[var2++] = class345.method2206(false, true, var153, var152, -15563);
                            continue;
                        }
                        if (var621 == 3333) {
                            field2869[var2++] = class451.field6459;
                            continue;
                        }
                        if (var621 == 3335) {
                            field2869[var2++] = class271.field3836;
                            continue;
                        }
                        if (var621 == 3336) {
                            var2 -= 4;
                            int var154 = field2869[var2];
                            int var155 = field2869[var2 + 1];
                            int var156 = field2869[var2 + 2];
                            int var157 = field2869[var2 + 3];
                            int var158 = (var155 << 14) + var154;
                            int var159 = (var156 << 28) + var158;
                            int var160 = var157 + var159;
                            field2869[var2++] = var160;
                            continue;
                        }
                        if (var621 == 3337) {
                            field2869[var2++] = class303.field4269;
                            continue;
                        }
                        if (var621 == 3338) {
                            field2869[var2++] = class409.method2616((byte) 29);
                            continue;
                        }
                    } else if (var621 < 3500) {
                        if (var621 == 3400) {
                            var2 -= 2;
                            int var161 = field2869[var2];
                            int var162 = field2869[var2 + 1];
                            class150 var163 = class8.method62(122, var161);
                            field2860[var3++] = var163.method912(var162, (byte) 84);
                            continue;
                        }
                        if (var621 == 3408) {
                            var2 -= 4;
                            int var164 = field2869[var2];
                            int var165 = field2869[var2 + 1];
                            int var166 = field2869[var2 + 2];
                            int var167 = field2869[var2 + 3];
                            class150 var168 = class8.method62(117, var166);
                            if (var168.field1836 == var164 && var168.field1834 == var165) {
                                if (var165 == 115) {
                                    field2860[var3++] = var168.method912(var167, (byte) 99);
                                } else {
                                    field2869[var2++] = var168.method903((byte) -54, var167);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var621 == 3409) {
                            var2 -= 3;
                            int var169 = field2869[var2];
                            int var170 = field2869[var2 + 1];
                            int var171 = field2869[var2 + 2];
                            if (var170 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class150 var172 = class8.method62(-20, var170);
                            if (var172.field1834 != var169) {
                                throw new RuntimeException("C3409-1");
                            }
                            field2869[var2++] = var172.method909((byte) -117, var171) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3410) {
                            var2--;
                            int var173 = field2869[var2];
                            var3--;
                            String var174 = field2860[var3];
                            if (var173 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class150 var175 = class8.method62(-31, var173);
                            if (var175.field1834 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field2869[var2++] = var175.method904(22686, var174) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3411) {
                            var2--;
                            int var176 = field2869[var2];
                            class150 var177 = class8.method62(-85, var176);
                            field2869[var2++] = var177.field1842.method1892(false);
                            continue;
                        }
                    } else if (var621 < 3700) {
                        if (var621 == 3600) {
                            if (class28.field351 == 0) {
                                field2869[var2++] = -2;
                            } else if (class28.field351 == 1) {
                                field2869[var2++] = -1;
                            } else {
                                field2869[var2++] = class247.field3533;
                            }
                            continue;
                        }
                        if (var621 == 3601) {
                            var2--;
                            int var178 = field2869[var2];
                            if (class28.field351 == 2 && var178 < class247.field3533) {
                                field2860[var3++] = class334.field4733[var178];
                                if (class300.field4216[var178] == null) {
                                    field2860[var3++] = "";
                                } else {
                                    field2860[var3++] = class300.field4216[var178];
                                }
                                continue;
                            }
                            field2860[var3++] = "";
                            field2860[var3++] = "";
                            continue;
                        }
                        if (var621 == 3602) {
                            var2--;
                            int var179 = field2869[var2];
                            if (class28.field351 == 2 && var179 < class247.field3533) {
                                field2869[var2++] = class109.field1344[var179];
                                continue;
                            }
                            field2869[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3603) {
                            var2--;
                            int var180 = field2869[var2];
                            if (class28.field351 == 2 && var180 < class247.field3533) {
                                field2869[var2++] = class48.field575[var180];
                                continue;
                            }
                            field2869[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3604) {
                            var3--;
                            String var181 = field2860[var3];
                            var2--;
                            int var182 = field2869[var2];
                            class397.method2536(var182, var181, false);
                            continue;
                        }
                        if (var621 == 3605) {
                            var3--;
                            String var183 = field2860[var3];
                            class418.method2652(var183, (byte) -104);
                            continue;
                        }
                        if (var621 == 3606) {
                            var3--;
                            String var184 = field2860[var3];
                            class255.method1723(false, var184);
                            continue;
                        }
                        if (var621 == 3607) {
                            var3--;
                            String var185 = field2860[var3];
                            class331.method2134(var185, false, false);
                            continue;
                        }
                        if (var621 == 3608) {
                            var3--;
                            String var186 = field2860[var3];
                            class151.method914(false, var186);
                            continue;
                        }
                        if (var621 == 3609) {
                            var3--;
                            String var187 = field2860[var3];
                            if (var187.startsWith("<img=0>") || var187.startsWith("<img=1>")) {
                                var187 = var187.substring(7);
                            }
                            field2869[var2++] = class163.method1091(0, var187) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3610) {
                            var2--;
                            int var188 = field2869[var2];
                            if (class28.field351 == 2 && var188 < class247.field3533) {
                                field2860[var3++] = class403.field5769[var188];
                                continue;
                            }
                            field2860[var3++] = "";
                            continue;
                        }
                        if (var621 == 3611) {
                            if (class230.field3258 == null) {
                                field2860[var3++] = "";
                            } else {
                                field2860[var3++] = class332.method2149(class230.field3258, 6);
                            }
                            continue;
                        }
                        if (var621 == 3612) {
                            if (class230.field3258 == null) {
                                field2869[var2++] = 0;
                            } else {
                                field2869[var2++] = class118.field1445;
                            }
                            continue;
                        }
                        if (var621 == 3613) {
                            var2--;
                            int var189 = field2869[var2];
                            if (class230.field3258 != null && var189 < class118.field1445) {
                                field2860[var3++] = class65.field748[var189].field202;
                                continue;
                            }
                            field2860[var3++] = "";
                            continue;
                        }
                        if (var621 == 3614) {
                            var2--;
                            int var190 = field2869[var2];
                            if (class230.field3258 != null && var190 < class118.field1445) {
                                field2869[var2++] = class65.field748[var190].field198;
                                continue;
                            }
                            field2869[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3615) {
                            var2--;
                            int var191 = field2869[var2];
                            if (class230.field3258 != null && var191 < class118.field1445) {
                                field2869[var2++] = class65.field748[var191].field199;
                                continue;
                            }
                            field2869[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3616) {
                            field2869[var2++] = class328.field4658;
                            continue;
                        }
                        if (var621 == 3617) {
                            var3--;
                            String var192 = field2860[var3];
                            class218.method1465(true, var192);
                            continue;
                        }
                        if (var621 == 3618) {
                            field2869[var2++] = class358.field5088;
                            continue;
                        }
                        if (var621 == 3619) {
                            var3--;
                            String var193 = field2860[var3];
                            class233.method1542(27544, var193);
                            continue;
                        }
                        if (var621 == 3620) {
                            class403.method2569(94);
                            continue;
                        }
                        if (var621 == 3621) {
                            if (class28.field351 == 0) {
                                field2869[var2++] = -1;
                            } else {
                                field2869[var2++] = class97.field1170;
                            }
                            continue;
                        }
                        if (var621 == 3622) {
                            var2--;
                            int var194 = field2869[var2];
                            if (class28.field351 != 0 && var194 < class97.field1170) {
                                field2860[var3++] = class138.field1724[var194];
                                if (class56.field680[var194] == null) {
                                    field2860[var3++] = "";
                                } else {
                                    field2860[var3++] = class56.field680[var194];
                                }
                                continue;
                            }
                            field2860[var3++] = "";
                            field2860[var3++] = "";
                            continue;
                        }
                        if (var621 == 3623) {
                            var3--;
                            String var195 = field2860[var3];
                            if (var195.startsWith("<img=0>") || var195.startsWith("<img=1>")) {
                                var195 = var195.substring(7);
                            }
                            field2869[var2++] = class45.method267(var195, (byte) -102) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3624) {
                            var2--;
                            int var196 = field2869[var2];
                            if (class65.field748 != null && var196 < class118.field1445 && class65.field748[var196].field201.equalsIgnoreCase(class384.field5422.field487)) {
                                field2869[var2++] = 1;
                                continue;
                            }
                            field2869[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3625) {
                            if (class144.field1783 == null) {
                                field2860[var3++] = "";
                            } else {
                                field2860[var3++] = class144.field1783;
                            }
                            continue;
                        }
                        if (var621 == 3626) {
                            var2--;
                            int var197 = field2869[var2];
                            if (class230.field3258 != null && var197 < class118.field1445) {
                                field2860[var3++] = class65.field748[var197].field204;
                                continue;
                            }
                            field2860[var3++] = "";
                            continue;
                        }
                        if (var621 == 3627) {
                            var2--;
                            int var198 = field2869[var2];
                            if (class28.field351 == 2 && var198 >= 0 && var198 < class247.field3533) {
                                field2869[var2++] = class370.field5220[var198] ? 1 : 0;
                                continue;
                            }
                            field2869[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3628) {
                            var3--;
                            String var199 = field2860[var3];
                            if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                                var199 = var199.substring(7);
                            }
                            field2869[var2++] = class24.method169(var199, -117);
                            continue;
                        }
                        if (var621 == 3629) {
                            field2869[var2++] = class36.field423;
                            continue;
                        }
                        if (var621 == 3630) {
                            var3--;
                            String var200 = field2860[var3];
                            class331.method2134(var200, false, true);
                            continue;
                        }
                        if (var621 == 3631) {
                            var2--;
                            int var201 = field2869[var2];
                            field2869[var2++] = class288.field4044[var201] ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3632) {
                            var2--;
                            int var202 = field2869[var2];
                            if (class230.field3258 != null && var202 < class118.field1445) {
                                field2860[var3++] = class65.field748[var202].field201;
                                continue;
                            }
                            field2860[var3++] = "";
                            continue;
                        }
                        if (var621 == 3633) {
                            var2--;
                            int var203 = field2869[var2];
                            if (class28.field351 != 0 && var203 < class97.field1170) {
                                field2860[var3++] = class99.field1213[var203];
                                continue;
                            }
                            field2860[var3++] = "";
                            continue;
                        }
                    } else if (var621 < 4000) {
                        if (var621 == 3903) {
                            var2--;
                            int var204 = field2869[var2];
                            field2869[var2++] = class369.field5210[var204].method731(83);
                            continue;
                        }
                        if (var621 == 3904) {
                            var2--;
                            int var205 = field2869[var2];
                            field2869[var2++] = class369.field5210[var205].field1440;
                            continue;
                        }
                        if (var621 == 3905) {
                            var2--;
                            int var206 = field2869[var2];
                            field2869[var2++] = class369.field5210[var206].field1437;
                            continue;
                        }
                        if (var621 == 3906) {
                            var2--;
                            int var207 = field2869[var2];
                            field2869[var2++] = class369.field5210[var207].field1434;
                            continue;
                        }
                        if (var621 == 3907) {
                            var2--;
                            int var208 = field2869[var2];
                            field2869[var2++] = class369.field5210[var208].field1441;
                            continue;
                        }
                        if (var621 == 3908) {
                            var2--;
                            int var209 = field2869[var2];
                            field2869[var2++] = class369.field5210[var209].field1439;
                            continue;
                        }
                        if (var621 == 3910) {
                            var2--;
                            int var210 = field2869[var2];
                            int var211 = class369.field5210[var210].method730(8532);
                            field2869[var2++] = var211 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3911) {
                            var2--;
                            int var212 = field2869[var2];
                            int var213 = class369.field5210[var212].method730(8532);
                            field2869[var2++] = var213 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3912) {
                            var2--;
                            int var214 = field2869[var2];
                            int var215 = class369.field5210[var214].method730(8532);
                            field2869[var2++] = var215 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3913) {
                            var2--;
                            int var216 = field2869[var2];
                            int var217 = class369.field5210[var216].method730(8532);
                            field2869[var2++] = var217 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 4100) {
                        if (var621 == 4000) {
                            var2 -= 2;
                            int var218 = field2869[var2];
                            int var219 = field2869[var2 + 1];
                            field2869[var2++] = var218 + var219;
                            continue;
                        }
                        if (var621 == 4001) {
                            var2 -= 2;
                            int var220 = field2869[var2];
                            int var221 = field2869[var2 + 1];
                            field2869[var2++] = var220 - var221;
                            continue;
                        }
                        if (var621 == 4002) {
                            var2 -= 2;
                            int var222 = field2869[var2];
                            int var223 = field2869[var2 + 1];
                            field2869[var2++] = var222 * var223;
                            continue;
                        }
                        if (var621 == 4003) {
                            var2 -= 2;
                            int var224 = field2869[var2];
                            int var225 = field2869[var2 + 1];
                            field2869[var2++] = var224 / var225;
                            continue;
                        }
                        if (var621 == 4004) {
                            var2--;
                            int var226 = field2869[var2];
                            field2869[var2++] = (int) (Math.random() * (double) var226);
                            continue;
                        }
                        if (var621 == 4005) {
                            var2--;
                            int var227 = field2869[var2];
                            field2869[var2++] = (int) (Math.random() * (double) (var227 + 1));
                            continue;
                        }
                        if (var621 == 4006) {
                            var2 -= 5;
                            int var228 = field2869[var2];
                            int var229 = field2869[var2 + 1];
                            int var230 = field2869[var2 + 2];
                            int var231 = field2869[var2 + 3];
                            int var232 = field2869[var2 + 4];
                            field2869[var2++] = (var229 - var228) * (var232 - var230) / (var231 - var230) + var228;
                            continue;
                        }
                        if (var621 == 4007) {
                            var2 -= 2;
                            long var233 = (long) field2869[var2];
                            long var235 = (long) field2869[var2 + 1];
                            field2869[var2++] = (int) (var233 * var235 / 100L + var233);
                            continue;
                        }
                        if (var621 == 4008) {
                            var2 -= 2;
                            int var237 = field2869[var2];
                            int var238 = field2869[var2 + 1];
                            field2869[var2++] = var237 | 0x1 << var238;
                            continue;
                        }
                        if (var621 == 4009) {
                            var2 -= 2;
                            int var239 = field2869[var2];
                            int var240 = field2869[var2 + 1];
                            field2869[var2++] = var239 & -(0x1 << var240) - 1;
                            continue;
                        }
                        if (var621 == 4010) {
                            var2 -= 2;
                            int var241 = field2869[var2];
                            int var242 = field2869[var2 + 1];
                            field2869[var2++] = (var241 & 0x1 << var242) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var621 == 4011) {
                            var2 -= 2;
                            int var243 = field2869[var2];
                            int var244 = field2869[var2 + 1];
                            field2869[var2++] = var243 % var244;
                            continue;
                        }
                        if (var621 == 4012) {
                            var2 -= 2;
                            int var245 = field2869[var2];
                            int var246 = field2869[var2 + 1];
                            if (var245 == 0) {
                                field2869[var2++] = 0;
                            } else {
                                field2869[var2++] = (int) Math.pow((double) var245, (double) var246);
                            }
                            continue;
                        }
                        if (var621 == 4013) {
                            var2 -= 2;
                            int var247 = field2869[var2];
                            int var248 = field2869[var2 + 1];
                            if (var247 == 0) {
                                field2869[var2++] = 0;
                            } else if (var248 == 0) {
                                field2869[var2++] = Integer.MAX_VALUE;
                            } else {
                                field2869[var2++] = (int) Math.pow((double) var247, 1.0D / (double) var248);
                            }
                            continue;
                        }
                        if (var621 == 4014) {
                            var2 -= 2;
                            int var249 = field2869[var2];
                            int var250 = field2869[var2 + 1];
                            field2869[var2++] = var249 & var250;
                            continue;
                        }
                        if (var621 == 4015) {
                            var2 -= 2;
                            int var251 = field2869[var2];
                            int var252 = field2869[var2 + 1];
                            field2869[var2++] = var251 | var252;
                            continue;
                        }
                        if (var621 == 4016) {
                            var2 -= 2;
                            int var253 = field2869[var2];
                            int var254 = field2869[var2 + 1];
                            field2869[var2++] = var253 < var254 ? var253 : var254;
                            continue;
                        }
                        if (var621 == 4017) {
                            var2 -= 2;
                            int var255 = field2869[var2];
                            int var256 = field2869[var2 + 1];
                            field2869[var2++] = var255 > var256 ? var255 : var256;
                            continue;
                        }
                        if (var621 == 4018) {
                            var2 -= 3;
                            long var257 = (long) field2869[var2];
                            long var259 = (long) field2869[var2 + 1];
                            long var261 = (long) field2869[var2 + 2];
                            field2869[var2++] = (int) (var257 * var261 / var259);
                            continue;
                        }
                    } else if (var621 < 4200) {
                        if (var621 == 4100) {
                            var3--;
                            String var263 = field2860[var3];
                            var2--;
                            int var264 = field2869[var2];
                            field2860[var3++] = var263 + var264;
                            continue;
                        }
                        if (var621 == 4101) {
                            var3 -= 2;
                            String var265 = field2860[var3];
                            String var266 = field2860[var3 + 1];
                            field2860[var3++] = var265 + var266;
                            continue;
                        }
                        if (var621 == 4102) {
                            var3--;
                            String var267 = field2860[var3];
                            var2--;
                            int var268 = field2869[var2];
                            field2860[var3++] = var267 + class306.method2014(var268, 0, true);
                            continue;
                        }
                        if (var621 == 4103) {
                            var3--;
                            String var269 = field2860[var3];
                            field2860[var3++] = var269.toLowerCase();
                            continue;
                        }
                        if (var621 == 4104) {
                            var2--;
                            int var270 = field2869[var2];
                            long var271 = ((long) var270 + 11745L) * 86400000L;
                            field2877.setTime(new Date(var271));
                            int var273 = field2877.get(5);
                            int var274 = field2877.get(2);
                            int var275 = field2877.get(1);
                            field2860[var3++] = var273 + "-" + field2883[var274] + "-" + var275;
                            continue;
                        }
                        if (var621 == 4105) {
                            var3 -= 2;
                            String var276 = field2860[var3];
                            String var277 = field2860[var3 + 1];
                            if (class384.field5422.field453 != null && class384.field5422.field453.field3901) {
                                field2860[var3++] = var277;
                                continue;
                            }
                            field2860[var3++] = var276;
                            continue;
                        }
                        if (var621 == 4106) {
                            var2--;
                            int var278 = field2869[var2];
                            field2860[var3++] = Integer.toString(var278);
                            continue;
                        }
                        if (var621 == 4107) {
                            var3 -= 2;
                            field2869[var2++] = class291.method1926(field2860[var3], field2860[var3 + 1], class271.field3836, 713330051);
                            continue;
                        }
                        if (var621 == 4108) {
                            var3--;
                            String var279 = field2860[var3];
                            var2 -= 2;
                            int var280 = field2869[var2];
                            int var281 = field2869[var2 + 1];
                            class355 var282 = class365.method2335(var281, class335.field4752, 0, 0);
                            field2869[var2++] = var282.method2259((byte) 20, var280, class347.field4907, var279);
                            continue;
                        }
                        if (var621 == 4109) {
                            var3--;
                            String var283 = field2860[var3];
                            var2 -= 2;
                            int var284 = field2869[var2];
                            int var285 = field2869[var2 + 1];
                            class355 var286 = class365.method2335(var285, class335.field4752, 0, 0);
                            field2869[var2++] = var286.method2261(class347.field4907, 0, var283, var284);
                            continue;
                        }
                        if (var621 == 4110) {
                            var3 -= 2;
                            String var287 = field2860[var3];
                            String var288 = field2860[var3 + 1];
                            var2--;
                            if (field2869[var2] == 1) {
                                field2860[var3++] = var287;
                            } else {
                                field2860[var3++] = var288;
                            }
                            continue;
                        }
                        if (var621 == 4111) {
                            var3--;
                            String var289 = field2860[var3];
                            field2860[var3++] = class151.method917(var289, 119);
                            continue;
                        }
                        if (var621 == 4112) {
                            var3--;
                            String var290 = field2860[var3];
                            var2--;
                            int var291 = field2869[var2];
                            if (var291 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field2860[var3++] = var290 + (char) var291;
                            continue;
                        }
                        if (var621 == 4113) {
                            var2--;
                            int var292 = field2869[var2];
                            field2869[var2++] = class184.method1248(255, (char) var292) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4114) {
                            var2--;
                            int var293 = field2869[var2];
                            field2869[var2++] = class245.method1665((char) var293, 127) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4115) {
                            var2--;
                            int var294 = field2869[var2];
                            field2869[var2++] = class388.method2480((char) var294, -100) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4116) {
                            var2--;
                            int var295 = field2869[var2];
                            field2869[var2++] = class148.method895(123, (char) var295) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4117) {
                            var3--;
                            String var296 = field2860[var3];
                            if (var296 == null) {
                                field2869[var2++] = 0;
                            } else {
                                field2869[var2++] = var296.length();
                            }
                            continue;
                        }
                        if (var621 == 4118) {
                            var3--;
                            String var297 = field2860[var3];
                            var2 -= 2;
                            int var298 = field2869[var2];
                            int var299 = field2869[var2 + 1];
                            field2860[var3++] = var297.substring(var298, var299);
                            continue;
                        }
                        if (var621 == 4119) {
                            var3--;
                            String var300 = field2860[var3];
                            StringBuffer var301 = new StringBuffer(var300.length());
                            boolean var302 = false;
                            for (int var303 = 0; var303 < var300.length(); var303++) {
                                char var304 = var300.charAt(var303);
                                if (var304 == '<') {
                                    var302 = true;
                                } else if (var304 == '>') {
                                    var302 = false;
                                } else if (!var302) {
                                    var301.append(var304);
                                }
                            }
                            field2860[var3++] = var301.toString();
                            continue;
                        }
                        if (var621 == 4120) {
                            var3--;
                            String var305 = field2860[var3];
                            var2 -= 2;
                            int var306 = field2869[var2];
                            int var307 = field2869[var2 + 1];
                            field2869[var2++] = var305.indexOf(var306, var307);
                            continue;
                        }
                        if (var621 == 4121) {
                            var3 -= 2;
                            String var308 = field2860[var3];
                            String var309 = field2860[var3 + 1];
                            var2--;
                            int var310 = field2869[var2];
                            field2869[var2++] = var308.indexOf(var309, var310);
                            continue;
                        }
                        if (var621 == 4122) {
                            var2--;
                            int var311 = field2869[var2];
                            field2869[var2++] = Character.toLowerCase((char) var311);
                            continue;
                        }
                        if (var621 == 4123) {
                            var2--;
                            int var312 = field2869[var2];
                            field2869[var2++] = Character.toUpperCase((char) var312);
                            continue;
                        }
                        if (var621 == 4124) {
                            var2--;
                            boolean var313 = field2869[var2] != 0;
                            var2--;
                            int var314 = field2869[var2];
                            field2860[var3++] = class218.method1462(class271.field3836, 0, -122, var313, (long) var314);
                            continue;
                        }
                        if (var621 == 4125) {
                            var3--;
                            String var315 = field2860[var3];
                            var2--;
                            int var316 = field2869[var2];
                            class355 var317 = class365.method2335(var316, class335.field4752, 0, 0);
                            field2869[var2++] = var317.method2255(var315, true, class347.field4907);
                            continue;
                        }
                    } else if (var621 < 4300) {
                        if (var621 == 4200) {
                            var2--;
                            int var318 = field2869[var2];
                            field2860[var3++] = class50.method288(0, var318).field2238;
                            continue;
                        }
                        if (var621 == 4201) {
                            var2 -= 2;
                            int var319 = field2869[var2];
                            int var320 = field2869[var2 + 1];
                            class163 var321 = class50.method288(0, var319);
                            if (var320 >= 1 && var320 <= 5 && var321.field2261[var320 - 1] != null) {
                                field2860[var3++] = var321.field2261[var320 - 1];
                                continue;
                            }
                            field2860[var3++] = "";
                            continue;
                        }
                        if (var621 == 4202) {
                            var2 -= 2;
                            int var322 = field2869[var2];
                            int var323 = field2869[var2 + 1];
                            class163 var324 = class50.method288(0, var322);
                            if (var323 >= 1 && var323 <= 5 && var324.field2276[var323 - 1] != null) {
                                field2860[var3++] = var324.field2276[var323 - 1];
                                continue;
                            }
                            field2860[var3++] = "";
                            continue;
                        }
                        if (var621 == 4203) {
                            var2--;
                            int var325 = field2869[var2];
                            field2869[var2++] = class50.method288(0, var325).field2292;
                            continue;
                        }
                        if (var621 == 4204) {
                            var2--;
                            int var326 = field2869[var2];
                            field2869[var2++] = class50.method288(0, var326).field2278 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4205) {
                            var2--;
                            int var327 = field2869[var2];
                            class163 var328 = class50.method288(0, var327);
                            if (var328.field2236 == -1 && var328.field2296 >= 0) {
                                field2869[var2++] = var328.field2296;
                                continue;
                            }
                            field2869[var2++] = var327;
                            continue;
                        }
                        if (var621 == 4206) {
                            var2--;
                            int var329 = field2869[var2];
                            class163 var330 = class50.method288(0, var329);
                            if (var330.field2236 >= 0 && var330.field2296 >= 0) {
                                field2869[var2++] = var330.field2296;
                                continue;
                            }
                            field2869[var2++] = var329;
                            continue;
                        }
                        if (var621 == 4207) {
                            var2--;
                            int var331 = field2869[var2];
                            field2869[var2++] = class50.method288(0, var331).field2282 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4208) {
                            var2 -= 2;
                            int var332 = field2869[var2];
                            int var333 = field2869[var2 + 1];
                            class41 var334 = class401.method2555(var333, 1024);
                            if (var334.method253(true)) {
                                field2860[var3++] = class50.method288(0, var332).method1083(var334.field500, var333, -128);
                            } else {
                                field2869[var2++] = class50.method288(0, var332).method1094(var333, -22036, var334.field499);
                            }
                            continue;
                        }
                        if (var621 == 4209) {
                            var2 -= 2;
                            int var335 = field2869[var2];
                            int var336 = field2869[var2 + 1] - 1;
                            class163 var337 = class50.method288(0, var335);
                            if (var337.field2265 == var336) {
                                field2869[var2++] = var337.field2258;
                            } else if (var337.field2267 == var336) {
                                field2869[var2++] = var337.field2270;
                            } else {
                                field2869[var2++] = -1;
                            }
                            continue;
                        }
                        if (var621 == 4210) {
                            var3--;
                            String var338 = field2860[var3];
                            var2--;
                            int var339 = field2869[var2];
                            class410.method2619(var339 == 1, 0, var338);
                            field2869[var2++] = class422.field6021;
                            continue;
                        }
                        if (var621 == 4211) {
                            if (class10.field138 != null && class32.field370 < class422.field6021) {
                                field2869[var2++] = class10.field138[class32.field370++] & 0xFFFF;
                                continue;
                            }
                            field2869[var2++] = -1;
                            continue;
                        }
                        if (var621 == 4212) {
                            class32.field370 = 0;
                            continue;
                        }
                    } else if (var621 < 4400) {
                        if (var621 == 4300) {
                            var2 -= 2;
                            int var340 = field2869[var2];
                            int var341 = field2869[var2 + 1];
                            class41 var342 = class401.method2555(var341, 1024);
                            if (var342.method253(true)) {
                                field2860[var3++] = class403.method2568(var340, (byte) 120).method838(var342.field500, -125, var341);
                            } else {
                                field2869[var2++] = class403.method2568(var340, (byte) 74).method841(var341, 0, var342.field499);
                            }
                            continue;
                        }
                    } else if (var621 < 4500) {
                        if (var621 == 4400) {
                            var2 -= 2;
                            int var343 = field2869[var2];
                            int var344 = field2869[var2 + 1];
                            class41 var345 = class401.method2555(var344, 1024);
                            if (var345.method253(true)) {
                                field2860[var3++] = class374.method2382(var343, false).method477(var345.field500, var344, (byte) -114);
                            } else {
                                field2869[var2++] = class374.method2382(var343, false).method483(var345.field499, var344, (byte) -25);
                            }
                            continue;
                        }
                    } else if (var621 < 4600) {
                        if (var621 == 4500) {
                            var2 -= 2;
                            int var346 = field2869[var2];
                            int var347 = field2869[var2 + 1];
                            class41 var348 = class401.method2555(var347, 1024);
                            if (var348.method253(true)) {
                                field2860[var3++] = class186.method1281(false, var346).method1687(var347, 52, var348.field500);
                            } else {
                                field2869[var2++] = class186.method1281(false, var346).method1684((byte) -89, var347, var348.field499);
                            }
                            continue;
                        }
                    } else if (var621 < 4700) {
                        if (var621 == 4600) {
                            var2--;
                            int var349 = field2869[var2];
                            class306 var350 = class138.method853(var349, (byte) -125);
                            if (var350.field4325 != null && var350.field4325.length > 0) {
                                int var351 = 0;
                                int var352 = var350.field4322[0];
                                for (int var353 = 1; var353 < var350.field4325.length; var353++) {
                                    if (var350.field4322[var353] > var352) {
                                        var351 = var353;
                                        var352 = var350.field4322[var353];
                                    }
                                }
                                field2869[var2++] = var350.field4325[var351];
                                continue;
                            }
                            field2869[var2++] = var350.field4291;
                            continue;
                        }
                    } else if (var621 < 5100) {
                        if (var621 == 5000) {
                            field2869[var2++] = class134.field1619;
                            continue;
                        }
                        if (var621 == 5001) {
                            var2 -= 3;
                            class134.field1619 = field2869[var2];
                            class177.field2405 = field2869[var2 + 1];
                            class121.field1484 = field2869[var2 + 2];
                            field2870++;
                            class62.field718.method2143(225, -2);
                            class62.field718.method1583(class134.field1619, (byte) -76);
                            class62.field718.method1583(class177.field2405, (byte) -109);
                            class62.field718.method1583(class121.field1484, (byte) -75);
                            continue;
                        }
                        if (var621 == 5002) {
                            var3 -= 2;
                            String var354 = field2860[var3];
                            String var355 = field2860[var3 + 1];
                            var2 -= 2;
                            int var356 = field2869[var2];
                            int var357 = field2869[var2 + 1];
                            if (var355 == null) {
                                var355 = "";
                            }
                            if (var355.length() > 80) {
                                var355 = var355.substring(0, 80);
                            }
                            field2868++;
                            class62.field718.method2143(112, -2);
                            class62.field718.method1583(class81.method457(var354, (byte) -49) + class81.method457(var355, (byte) -49) + 2, (byte) -97);
                            class62.field718.method1596(var354, false);
                            class62.field718.method1583(var356 - 1, (byte) -94);
                            class62.field718.method1583(var357, (byte) -54);
                            class62.field718.method1596(var355, false);
                            continue;
                        }
                        if (var621 == 5003) {
                            var2--;
                            int var358 = field2869[var2];
                            String var359 = null;
                            if (var358 < 100) {
                                var359 = class29.field358[var358];
                            }
                            if (var359 == null) {
                                var359 = "";
                            }
                            field2860[var3++] = var359;
                            continue;
                        }
                        if (var621 == 5004) {
                            var2--;
                            int var360 = field2869[var2];
                            int var361 = -1;
                            if (var360 < 100 && class29.field358[var360] != null) {
                                var361 = class63.field729[var360];
                            }
                            field2869[var2++] = var361;
                            continue;
                        }
                        if (var621 == 5005) {
                            field2869[var2++] = class177.field2405;
                            continue;
                        }
                        if (var621 == 5008) {
                            var3--;
                            String var362 = field2860[var3];
                            if (class135.field1685 == 0 && (class452.field6472 && !class331.field4681 || class400.field5721)) {
                                continue;
                            }
                            String var363 = var362.toLowerCase();
                            byte var364 = 0;
                            if (var363.startsWith(class109.field1338.method2331(25, 0))) {
                                var364 = 0;
                                var362 = var362.substring(class109.field1338.method2331(25, 0).length());
                            } else if (var363.startsWith(class149.field1830.method2331(25, 0))) {
                                var364 = 1;
                                var362 = var362.substring(class149.field1830.method2331(25, 0).length());
                            } else if (var363.startsWith(class119.field1457.method2331(25, 0))) {
                                var364 = 2;
                                var362 = var362.substring(class119.field1457.method2331(25, 0).length());
                            } else if (var363.startsWith(class322.field4584.method2331(25, 0))) {
                                var364 = 3;
                                var362 = var362.substring(class322.field4584.method2331(25, 0).length());
                            } else if (var363.startsWith(class423.field6057.method2331(25, 0))) {
                                var364 = 4;
                                var362 = var362.substring(class423.field6057.method2331(25, 0).length());
                            } else if (var363.startsWith(class33.field374.method2331(25, 0))) {
                                var364 = 5;
                                var362 = var362.substring(class33.field374.method2331(25, 0).length());
                            } else if (var363.startsWith(class117.field1431.method2331(25, 0))) {
                                var364 = 6;
                                var362 = var362.substring(class117.field1431.method2331(25, 0).length());
                            } else if (var363.startsWith(class19.field223.method2331(25, 0))) {
                                var364 = 7;
                                var362 = var362.substring(class19.field223.method2331(25, 0).length());
                            } else if (var363.startsWith(class150.field1851.method2331(25, 0))) {
                                var364 = 8;
                                var362 = var362.substring(class150.field1851.method2331(25, 0).length());
                            } else if (var363.startsWith(class297.field4139.method2331(25, 0))) {
                                var364 = 9;
                                var362 = var362.substring(class297.field4139.method2331(25, 0).length());
                            } else if (var363.startsWith(class244.field3462.method2331(25, 0))) {
                                var364 = 10;
                                var362 = var362.substring(class244.field3462.method2331(25, 0).length());
                            } else if (var363.startsWith(class117.field1428.method2331(25, 0))) {
                                var364 = 11;
                                var362 = var362.substring(class117.field1428.method2331(25, 0).length());
                            } else if (class271.field3836 != 0) {
                                if (var363.startsWith(class109.field1338.method2331(25, class271.field3836))) {
                                    var364 = 0;
                                    var362 = var362.substring(class109.field1338.method2331(25, class271.field3836).length());
                                } else if (var363.startsWith(class149.field1830.method2331(25, class271.field3836))) {
                                    var364 = 1;
                                    var362 = var362.substring(class149.field1830.method2331(25, class271.field3836).length());
                                } else if (var363.startsWith(class119.field1457.method2331(25, class271.field3836))) {
                                    var364 = 2;
                                    var362 = var362.substring(class119.field1457.method2331(25, class271.field3836).length());
                                } else if (var363.startsWith(class322.field4584.method2331(25, class271.field3836))) {
                                    var364 = 3;
                                    var362 = var362.substring(class322.field4584.method2331(25, class271.field3836).length());
                                } else if (var363.startsWith(class423.field6057.method2331(25, class271.field3836))) {
                                    var364 = 4;
                                    var362 = var362.substring(class423.field6057.method2331(25, class271.field3836).length());
                                } else if (var363.startsWith(class33.field374.method2331(25, class271.field3836))) {
                                    var364 = 5;
                                    var362 = var362.substring(class33.field374.method2331(25, class271.field3836).length());
                                } else if (var363.startsWith(class117.field1431.method2331(25, class271.field3836))) {
                                    var364 = 6;
                                    var362 = var362.substring(class117.field1431.method2331(25, class271.field3836).length());
                                } else if (var363.startsWith(class19.field223.method2331(25, class271.field3836))) {
                                    var364 = 7;
                                    var362 = var362.substring(class19.field223.method2331(25, class271.field3836).length());
                                } else if (var363.startsWith(class150.field1851.method2331(25, class271.field3836))) {
                                    var364 = 8;
                                    var362 = var362.substring(class150.field1851.method2331(25, class271.field3836).length());
                                } else if (var363.startsWith(class297.field4139.method2331(25, class271.field3836))) {
                                    var364 = 9;
                                    var362 = var362.substring(class297.field4139.method2331(25, class271.field3836).length());
                                } else if (var363.startsWith(class244.field3462.method2331(25, class271.field3836))) {
                                    var364 = 10;
                                    var362 = var362.substring(class244.field3462.method2331(25, class271.field3836).length());
                                } else if (var363.startsWith(class117.field1428.method2331(25, class271.field3836))) {
                                    var364 = 11;
                                    var362 = var362.substring(class117.field1428.method2331(25, class271.field3836).length());
                                }
                            }
                            String var365 = var362.toLowerCase();
                            byte var366 = 0;
                            if (var365.startsWith(class190.field2739.method2331(25, 0))) {
                                var366 = 1;
                                var362 = var362.substring(class190.field2739.method2331(25, 0).length());
                            } else if (var365.startsWith(class174.field2392.method2331(25, 0))) {
                                var366 = 2;
                                var362 = var362.substring(class174.field2392.method2331(25, 0).length());
                            } else if (var365.startsWith(class5.field74.method2331(25, 0))) {
                                var366 = 3;
                                var362 = var362.substring(class5.field74.method2331(25, 0).length());
                            } else if (var365.startsWith(class88.field1078.method2331(25, 0))) {
                                var366 = 4;
                                var362 = var362.substring(class88.field1078.method2331(25, 0).length());
                            } else if (var365.startsWith(class65.field742.method2331(25, 0))) {
                                var366 = 5;
                                var362 = var362.substring(class65.field742.method2331(25, 0).length());
                            } else if (class271.field3836 != 0) {
                                if (var365.startsWith(class190.field2739.method2331(25, class271.field3836))) {
                                    var366 = 1;
                                    var362 = var362.substring(class190.field2739.method2331(25, class271.field3836).length());
                                } else if (var365.startsWith(class174.field2392.method2331(25, class271.field3836))) {
                                    var366 = 2;
                                    var362 = var362.substring(class174.field2392.method2331(25, class271.field3836).length());
                                } else if (var365.startsWith(class5.field74.method2331(25, class271.field3836))) {
                                    var366 = 3;
                                    var362 = var362.substring(class5.field74.method2331(25, class271.field3836).length());
                                } else if (var365.startsWith(class88.field1078.method2331(25, class271.field3836))) {
                                    var366 = 4;
                                    var362 = var362.substring(class88.field1078.method2331(25, class271.field3836).length());
                                } else if (var365.startsWith(class65.field742.method2331(25, class271.field3836))) {
                                    var366 = 5;
                                    var362 = var362.substring(class65.field742.method2331(25, class271.field3836).length());
                                }
                            }
                            field2866++;
                            class62.field718.method2143(226, -2);
                            class62.field718.method1583(0, (byte) -112);
                            int var367 = class62.field718.field3320;
                            class62.field718.method1583(var364, (byte) -96);
                            class62.field718.method1583(var366, (byte) -106);
                            class101.method564((byte) -98, class62.field718, var362);
                            class62.field718.method1584(12299, class62.field718.field3320 - var367);
                            continue;
                        }
                        if (var621 == 5009) {
                            var3 -= 2;
                            String var368 = field2860[var3];
                            String var369 = field2860[var3 + 1];
                            if (class135.field1685 != 0 || (!class452.field6472 || class331.field4681) && !class400.field5721) {
                                field2858++;
                                class62.field718.method2143(102, -2);
                                class62.field718.method1583(0, (byte) -63);
                                int var370 = class62.field718.field3320;
                                class62.field718.method1596(var368, false);
                                class101.method564((byte) -89, class62.field718, var369);
                                class62.field718.method1584(12299, class62.field718.field3320 - var370);
                            }
                            continue;
                        }
                        if (var621 == 5010) {
                            var2--;
                            int var371 = field2869[var2];
                            String var372 = null;
                            if (var371 < 100) {
                                var372 = class258.field3688[var371];
                            }
                            if (var372 == null) {
                                var372 = "";
                            }
                            field2860[var3++] = var372;
                            continue;
                        }
                        if (var621 == 5011) {
                            var2--;
                            int var373 = field2869[var2];
                            String var374 = null;
                            if (var373 < 100) {
                                var374 = class223.field3138[var373];
                            }
                            if (var374 == null) {
                                var374 = "";
                            }
                            field2860[var3++] = var374;
                            continue;
                        }
                        if (var621 == 5012) {
                            var2--;
                            int var375 = field2869[var2];
                            int var376 = -1;
                            if (var375 < 100) {
                                var376 = class55.field666[var375];
                            }
                            field2869[var2++] = var376;
                            continue;
                        }
                        if (var621 == 5015) {
                            String var377;
                            if (class384.field5422 == null || class384.field5422.field462 == null) {
                                var377 = class78.field924;
                            } else {
                                var377 = class384.field5422.method243(-13458, true);
                            }
                            field2860[var3++] = var377;
                            continue;
                        }
                        if (var621 == 5016) {
                            field2869[var2++] = class121.field1484;
                            continue;
                        }
                        if (var621 == 5017) {
                            field2869[var2++] = class286.field4014;
                            continue;
                        }
                        if (var621 == 5018) {
                            var2--;
                            int var378 = field2869[var2];
                            int var379 = 0;
                            if (var378 < 100 && class29.field358[var378] != null) {
                                var379 = class63.field729[var378];
                            }
                            field2869[var2++] = var379;
                            continue;
                        }
                        if (var621 == 5019) {
                            var2--;
                            int var380 = field2869[var2];
                            String var381 = null;
                            if (var380 < 100) {
                                var381 = class160.field2101[var380];
                            }
                            if (var381 == null) {
                                var381 = "";
                            }
                            field2860[var3++] = var381;
                            continue;
                        }
                        if (var621 == 5020) {
                            String var382;
                            if (class384.field5422 == null || class384.field5422.field462 == null) {
                                var382 = class78.field924;
                            } else {
                                var382 = class384.field5422.method246(-110, false);
                            }
                            field2860[var3++] = var382;
                            continue;
                        }
                        if (var621 == 5050) {
                            var2--;
                            int var383 = field2869[var2];
                            field2860[var3++] = class144.method877(var383, (byte) -4).field5964;
                            continue;
                        }
                        if (var621 == 5051) {
                            var2--;
                            int var384 = field2869[var2];
                            class415 var385 = class144.method877(var384, (byte) -4);
                            if (var385.field5956 == null) {
                                field2869[var2++] = 0;
                            } else {
                                field2869[var2++] = var385.field5956.length;
                            }
                            continue;
                        }
                        if (var621 == 5052) {
                            var2 -= 2;
                            int var386 = field2869[var2];
                            int var387 = field2869[var2 + 1];
                            class415 var388 = class144.method877(var386, (byte) -4);
                            int var389 = var388.field5956[var387];
                            field2869[var2++] = var389;
                            continue;
                        }
                        if (var621 == 5053) {
                            var2--;
                            int var390 = field2869[var2];
                            class415 var391 = class144.method877(var390, (byte) -4);
                            if (var391.field5963 == null) {
                                field2869[var2++] = 0;
                            } else {
                                field2869[var2++] = var391.field5963.length;
                            }
                            continue;
                        }
                        if (var621 == 5054) {
                            var2 -= 2;
                            int var392 = field2869[var2];
                            int var393 = field2869[var2 + 1];
                            field2869[var2++] = class144.method877(var392, (byte) -4).field5963[var393];
                            continue;
                        }
                        if (var621 == 5055) {
                            var2--;
                            int var394 = field2869[var2];
                            field2860[var3++] = class193.method1308(75, var394).method2001(80);
                            continue;
                        }
                        if (var621 == 5056) {
                            var2--;
                            int var395 = field2869[var2];
                            class303 var396 = class193.method1308(-46, var395);
                            if (var396.field4273 == null) {
                                field2869[var2++] = 0;
                            } else {
                                field2869[var2++] = var396.field4273.length;
                            }
                            continue;
                        }
                        if (var621 == 5057) {
                            var2 -= 2;
                            int var397 = field2869[var2];
                            int var398 = field2869[var2 + 1];
                            field2869[var2++] = class193.method1308(123, var397).field4273[var398];
                            continue;
                        }
                        if (var621 == 5058) {
                            field2876 = new class153();
                            var2--;
                            field2876.field1894 = field2869[var2];
                            field2876.field1892 = class193.method1308(-118, field2876.field1894);
                            field2876.field1889 = new int[field2876.field1892.method1996(true)];
                            continue;
                        }
                        if (var621 == 5059) {
                            field2865++;
                            class62.field718.method2143(1, -2);
                            class62.field718.method1583(0, (byte) -72);
                            int var399 = class62.field718.field3320;
                            class62.field718.method1583(0, (byte) -65);
                            class62.field718.method1605(field2876.field1894, false);
                            field2876.field1892.method1995(12192, class62.field718, field2876.field1889);
                            class62.field718.method1584(12299, class62.field718.field3320 - var399);
                            continue;
                        }
                        if (var621 == 5060) {
                            var3--;
                            String var400 = field2860[var3];
                            field2879++;
                            class62.field718.method2143(109, -2);
                            class62.field718.method1583(0, (byte) -104);
                            int var401 = class62.field718.field3320;
                            class62.field718.method1596(var400, false);
                            class62.field718.method1605(field2876.field1894, false);
                            field2876.field1892.method1995(12192, class62.field718, field2876.field1889);
                            class62.field718.method1584(12299, class62.field718.field3320 - var401);
                            continue;
                        }
                        if (var621 == 5061) {
                            field2865++;
                            class62.field718.method2143(1, -2);
                            class62.field718.method1583(0, (byte) -114);
                            int var402 = class62.field718.field3320;
                            class62.field718.method1583(1, (byte) -97);
                            class62.field718.method1605(field2876.field1894, false);
                            field2876.field1892.method1995(12192, class62.field718, field2876.field1889);
                            class62.field718.method1584(12299, class62.field718.field3320 - var402);
                            continue;
                        }
                        if (var621 == 5062) {
                            var2 -= 2;
                            int var403 = field2869[var2];
                            int var404 = field2869[var2 + 1];
                            field2869[var2++] = class144.method877(var403, (byte) -4).field5961[var404];
                            continue;
                        }
                        if (var621 == 5063) {
                            var2 -= 2;
                            int var405 = field2869[var2];
                            int var406 = field2869[var2 + 1];
                            field2869[var2++] = class144.method877(var405, (byte) -4).field5959[var406];
                            continue;
                        }
                        if (var621 == 5064) {
                            var2 -= 2;
                            int var407 = field2869[var2];
                            int var408 = field2869[var2 + 1];
                            if (var408 == -1) {
                                field2869[var2++] = -1;
                            } else {
                                field2869[var2++] = class144.method877(var407, (byte) -4).method2641((char) var408, -1);
                            }
                            continue;
                        }
                        if (var621 == 5065) {
                            var2 -= 2;
                            int var409 = field2869[var2];
                            int var410 = field2869[var2 + 1];
                            if (var410 == -1) {
                                field2869[var2++] = -1;
                            } else {
                                field2869[var2++] = class144.method877(var409, (byte) -4).method2646(-98, (char) var410);
                            }
                            continue;
                        }
                        if (var621 == 5066) {
                            var2--;
                            int var411 = field2869[var2];
                            field2869[var2++] = class193.method1308(95, var411).method1996(true);
                            continue;
                        }
                        if (var621 == 5067) {
                            var2 -= 2;
                            int var412 = field2869[var2];
                            int var413 = field2869[var2 + 1];
                            int var414 = class193.method1308(80, var412).method1999(var413, (byte) 68);
                            field2869[var2++] = var414;
                            continue;
                        }
                        if (var621 == 5068) {
                            var2 -= 2;
                            int var415 = field2869[var2];
                            int var416 = field2869[var2 + 1];
                            field2876.field1889[var415] = var416;
                            continue;
                        }
                        if (var621 == 5069) {
                            var2 -= 2;
                            int var417 = field2869[var2];
                            int var418 = field2869[var2 + 1];
                            field2876.field1889[var417] = var418;
                            continue;
                        }
                        if (var621 == 5070) {
                            var2 -= 3;
                            int var419 = field2869[var2];
                            int var420 = field2869[var2 + 1];
                            int var421 = field2869[var2 + 2];
                            class303 var422 = class193.method1308(110, var419);
                            if (var422.method1999(var420, (byte) 53) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field2869[var2++] = var422.method2004(var420, false, var421);
                            continue;
                        }
                        if (var621 == 5071) {
                            var3--;
                            String var423 = field2860[var3];
                            var2--;
                            boolean var424 = field2869[var2] == 1;
                            class440.method2747(var423, var424, false);
                            field2869[var2++] = class422.field6021;
                            continue;
                        }
                        if (var621 == 5072) {
                            if (class10.field138 != null && class32.field370 < class422.field6021) {
                                field2869[var2++] = class10.field138[class32.field370++] & 0xFFFF;
                                continue;
                            }
                            field2869[var2++] = -1;
                            continue;
                        }
                        if (var621 == 5073) {
                            class32.field370 = 0;
                            continue;
                        }
                    } else if (var621 < 5200) {
                        if (var621 == 5100) {
                            if (class441.field6334.method2208(false, 86)) {
                                field2869[var2++] = 1;
                            } else {
                                field2869[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 5101) {
                            if (class441.field6334.method2208(false, 82)) {
                                field2869[var2++] = 1;
                            } else {
                                field2869[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 5102) {
                            if (class441.field6334.method2208(false, 81)) {
                                field2869[var2++] = 1;
                            } else {
                                field2869[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var621 < 5300) {
                        if (var621 == 5200) {
                            var2--;
                            class63.method359((byte) 124, field2869[var2]);
                            continue;
                        }
                        if (var621 == 5201) {
                            field2869[var2++] = class345.method2198(0);
                            continue;
                        }
                        if (var621 == 5205) {
                            var2--;
                            class46.method272(field2869[var2], true, -1, -1, false);
                            continue;
                        }
                        if (var621 == 5206) {
                            var2--;
                            int var425 = field2869[var2];
                            class300 var426 = class308.method2043(var425 >> 14 & 0x3FFF, var425 & 0x3FFF);
                            if (var426 == null) {
                                field2869[var2++] = -1;
                            } else {
                                field2869[var2++] = var426.field4210;
                            }
                            continue;
                        }
                        if (var621 == 5207) {
                            var2--;
                            class300 var427 = class308.method2040(field2869[var2]);
                            if (var427 != null && var427.field4196 != null) {
                                field2860[var3++] = var427.field4196;
                                continue;
                            }
                            field2860[var3++] = "";
                            continue;
                        }
                        if (var621 == 5208) {
                            field2869[var2++] = class447.field6412;
                            field2869[var2++] = class262.field3743;
                            continue;
                        }
                        if (var621 == 5209) {
                            field2869[var2++] = class324.field4619 + class308.field4368;
                            field2869[var2++] = class419.field5993 + class308.field4367;
                            continue;
                        }
                        if (var621 == 5210) {
                            var2--;
                            int var428 = field2869[var2];
                            class300 var429 = class308.method2040(var428);
                            if (var429 == null) {
                                field2869[var2++] = 0;
                                field2869[var2++] = 0;
                            } else {
                                field2869[var2++] = var429.field4206 >> 14 & 0x3FFF;
                                field2869[var2++] = var429.field4206 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var621 == 5211) {
                            var2--;
                            int var430 = field2869[var2];
                            class300 var431 = class308.method2040(var430);
                            if (var431 == null) {
                                field2869[var2++] = 0;
                                field2869[var2++] = 0;
                            } else {
                                field2869[var2++] = var431.field4204 - var431.field4207;
                                field2869[var2++] = var431.field4205 - var431.field4202;
                            }
                            continue;
                        }
                        if (var621 == 5212) {
                            class324 var432 = class68.method388((byte) 116);
                            if (var432 == null) {
                                field2869[var2++] = -1;
                                field2869[var2++] = -1;
                            } else {
                                field2869[var2++] = var432.field4613;
                                int var433 = var432.field4618 << 28 | class308.field4368 + var432.field4615 << 14 | class308.field4367 + var432.field4609;
                                field2869[var2++] = var433;
                            }
                            continue;
                        }
                        if (var621 == 5213) {
                            class324 var434 = class68.method377((byte) -101);
                            if (var434 == null) {
                                field2869[var2++] = -1;
                                field2869[var2++] = -1;
                            } else {
                                field2869[var2++] = var434.field4613;
                                int var435 = var434.field4618 << 28 | class308.field4368 + var434.field4615 << 14 | class308.field4367 + var434.field4609;
                                field2869[var2++] = var435;
                            }
                            continue;
                        }
                        if (var621 == 5214) {
                            var2--;
                            int var436 = field2869[var2];
                            class300 var437 = class242.method1651((byte) -113);
                            if (var437 != null) {
                                boolean var438 = var437.method1980(0, var436 & 0x3FFF, var436 >> 14 & 0x3FFF, var436 >> 28 & 0x3, field2882);
                                if (var438) {
                                    class117.method726(field2882[2], field2882[1], false);
                                }
                            }
                            continue;
                        }
                        if (var621 == 5215) {
                            var2 -= 2;
                            int var439 = field2869[var2];
                            int var440 = field2869[var2 + 1];
                            class295 var441 = class308.method2041(var439 >> 14 & 0x3FFF, var439 & 0x3FFF);
                            boolean var442 = false;
                            for (class300 var443 = (class300) var441.method1949(true); var443 != null; var443 = (class300) var441.method1945((byte) 121)) {
                                if (var443.field4210 == var440) {
                                    var442 = true;
                                    break;
                                }
                            }
                            if (var442) {
                                field2869[var2++] = 1;
                            } else {
                                field2869[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 5218) {
                            var2--;
                            int var444 = field2869[var2];
                            class300 var445 = class308.method2040(var444);
                            if (var445 == null) {
                                field2869[var2++] = -1;
                            } else {
                                field2869[var2++] = var445.field4200;
                            }
                            continue;
                        }
                        if (var621 == 5220) {
                            field2869[var2++] = class310.field4383 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5221) {
                            var2--;
                            int var446 = field2869[var2];
                            class117.method726(var446 & 0x3FFF, var446 >> 14 & 0x3FFF, false);
                            continue;
                        }
                        if (var621 == 5222) {
                            class300 var447 = class242.method1651((byte) -63);
                            if (var447 == null) {
                                field2869[var2++] = -1;
                                field2869[var2++] = -1;
                            } else {
                                boolean var448 = var447.method1983((byte) -101, class419.field5993 + class308.field4367, field2882, class324.field4619 + class308.field4368);
                                if (var448) {
                                    field2869[var2++] = field2882[1];
                                    field2869[var2++] = field2882[2];
                                } else {
                                    field2869[var2++] = -1;
                                    field2869[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var621 == 5223) {
                            var2 -= 2;
                            int var449 = field2869[var2];
                            int var450 = field2869[var2 + 1];
                            class46.method272(var449, true, var450 & 0x3FFF, var450 >> 14 & 0x3FFF, false);
                            continue;
                        }
                        if (var621 == 5224) {
                            var2--;
                            int var451 = field2869[var2];
                            class300 var452 = class242.method1651((byte) -128);
                            if (var452 == null) {
                                field2869[var2++] = -1;
                                field2869[var2++] = -1;
                            } else {
                                boolean var453 = var452.method1980(0, var451 & 0x3FFF, var451 >> 14 & 0x3FFF, var451 >> 28 & 0x3, field2882);
                                if (var453) {
                                    field2869[var2++] = field2882[1];
                                    field2869[var2++] = field2882[2];
                                } else {
                                    field2869[var2++] = -1;
                                    field2869[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var621 == 5225) {
                            var2--;
                            int var454 = field2869[var2];
                            class300 var455 = class242.method1651((byte) -57);
                            if (var455 == null) {
                                field2869[var2++] = -1;
                                field2869[var2++] = -1;
                            } else {
                                boolean var456 = var455.method1983((byte) -101, var454 & 0x3FFF, field2882, var454 >> 14 & 0x3FFF);
                                if (var456) {
                                    field2869[var2++] = field2882[1];
                                    field2869[var2++] = field2882[2];
                                } else {
                                    field2869[var2++] = -1;
                                    field2869[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var621 == 5226) {
                            var2--;
                            class42.method258(false, field2869[var2]);
                            continue;
                        }
                        if (var621 == 5227) {
                            var2 -= 2;
                            int var457 = field2869[var2];
                            int var458 = field2869[var2 + 1];
                            class46.method272(var457, true, var458 & 0x3FFF, var458 >> 14 & 0x3FFF, true);
                            continue;
                        }
                        if (var621 == 5228) {
                            var2--;
                            class18.field207 = field2869[var2] == 1;
                            continue;
                        }
                        if (var621 == 5229) {
                            field2869[var2++] = class18.field207 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5230) {
                            var2--;
                            int var459 = field2869[var2];
                            class245.method1667(119, var459);
                            continue;
                        }
                        if (var621 == 5231) {
                            var2 -= 2;
                            int var460 = field2869[var2];
                            boolean var461 = field2869[var2 + 1] == 1;
                            if (class305.field4286 == null) {
                                continue;
                            }
                            class406 var462 = class305.field4286.method1888((long) var460, (byte) -30);
                            if (var462 != null && !var461) {
                                var462.method2594((byte) -22);
                                continue;
                            }
                            if (var462 == null && var461) {
                                class406 var463 = new class406();
                                class305.field4286.method1886(var463, (long) var460, 1);
                            }
                            continue;
                        }
                        if (var621 == 5232) {
                            var2--;
                            int var464 = field2869[var2];
                            if (class305.field4286 == null) {
                                field2869[var2++] = 0;
                            } else {
                                class406 var465 = class305.field4286.method1888((long) var464, (byte) -30);
                                field2869[var2++] = var465 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var621 == 5233) {
                            var2 -= 2;
                            int var466 = field2869[var2];
                            boolean var467 = field2869[var2 + 1] == 1;
                            if (class288.field4024 == null) {
                                continue;
                            }
                            class406 var468 = class288.field4024.method1888((long) var466, (byte) -30);
                            if (var468 != null && !var467) {
                                var468.method2594((byte) -22);
                                continue;
                            }
                            if (var468 == null && var467) {
                                class406 var469 = new class406();
                                class288.field4024.method1886(var469, (long) var466, 1);
                            }
                            continue;
                        }
                        if (var621 == 5234) {
                            var2--;
                            int var470 = field2869[var2];
                            if (class288.field4024 == null) {
                                field2869[var2++] = 0;
                            } else {
                                class406 var471 = class288.field4024.method1888((long) var470, (byte) -30);
                                field2869[var2++] = var471 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var621 == 5235) {
                            field2869[var2++] = class308.field4345 == null ? -1 : class308.field4345.field4210;
                            continue;
                        }
                    } else if (var621 < 5400) {
                        if (var621 == 5300) {
                            var2 -= 2;
                            int var472 = field2869[var2];
                            int var473 = field2869[var2 + 1];
                            class432.method2714(3, (byte) -95, false, var473, var472);
                            field2869[var2++] = class255.field3680 == null ? 0 : 1;
                            continue;
                        }
                        if (var621 == 5301) {
                            if (class255.field3680 != null) {
                                class432.method2714(class249.field3558, (byte) 113, false, -1, -1);
                            }
                            continue;
                        }
                        if (var621 == 5302) {
                            class337[] var474 = class423.method2667(119);
                            field2869[var2++] = var474.length;
                            continue;
                        }
                        if (var621 == 5303) {
                            var2--;
                            int var475 = field2869[var2];
                            class337[] var476 = class423.method2667(94);
                            field2869[var2++] = var476[var475].field4783;
                            field2869[var2++] = var476[var475].field4786;
                            continue;
                        }
                        if (var621 == 5305) {
                            int var477 = class374.field5256;
                            int var478 = class388.field5479;
                            int var479 = -1;
                            class337[] var480 = class423.method2667(-102);
                            for (int var481 = 0; var481 < var480.length; var481++) {
                                class337 var482 = var480[var481];
                                if (var482.field4783 == var477 && var482.field4786 == var478) {
                                    var479 = var481;
                                    break;
                                }
                            }
                            field2869[var2++] = var479;
                            continue;
                        }
                        if (var621 == 5306) {
                            field2869[var2++] = class26.method180(-106);
                            continue;
                        }
                        if (var621 == 5307) {
                            var2--;
                            int var483 = field2869[var2];
                            if (var483 >= 1 && var483 <= 2) {
                                class432.method2714(var483, (byte) -113, false, -1, -1);
                            }
                            continue;
                        }
                        if (var621 == 5308) {
                            field2869[var2++] = class249.field3558;
                            continue;
                        }
                        if (var621 == 5309) {
                            var2--;
                            int var484 = field2869[var2];
                            if (var484 >= 1 && var484 <= 2) {
                                class249.field3558 = var484;
                                class278.method1834(class14.field185, (byte) 126);
                            }
                            continue;
                        }
                    } else if (var621 < 5500) {
                        if (var621 == 5400) {
                            var3 -= 2;
                            String var485 = field2860[var3];
                            String var486 = field2860[var3 + 1];
                            var2--;
                            int var487 = field2869[var2];
                            field2878++;
                            class62.field718.method2143(67, -2);
                            class62.field718.method1583(class81.method457(var485, (byte) -49) + class81.method457(var486, (byte) -49) + 1, (byte) -84);
                            class62.field718.method1596(var485, false);
                            class62.field718.method1596(var486, false);
                            class62.field718.method1583(var487, (byte) -123);
                            continue;
                        }
                        if (var621 == 5401) {
                            var2 -= 2;
                            class25.field312[field2869[var2]] = (short) class140.method858(field2869[var2 + 1], (byte) 3);
                            class323.method2104((byte) 114);
                            class432.method2713((byte) -16);
                            class49.method280((byte) 81);
                            class75.method419(-21360);
                            class406.method2593(false);
                            continue;
                        }
                        if (var621 == 5405) {
                            var2 -= 2;
                            int var488 = field2869[var2];
                            int var489 = field2869[var2 + 1];
                            if (var488 >= 0 && var488 < 2) {
                                class382.field5380[var488] = new int[var489 << 1][4];
                            }
                            continue;
                        }
                        if (var621 == 5406) {
                            var2 -= 7;
                            int var490 = field2869[var2];
                            int var491 = field2869[var2 + 1] << 1;
                            int var492 = field2869[var2 + 2];
                            int var493 = field2869[var2 + 3];
                            int var494 = field2869[var2 + 4];
                            int var495 = field2869[var2 + 5];
                            int var496 = field2869[var2 + 6];
                            if (var490 >= 0 && var490 < 2 && class382.field5380[var490] != null && var491 >= 0 && var491 < class382.field5380[var490].length) {
                                class382.field5380[var490][var491] = new int[] { (var492 >> 14 & 0x3FFF) * 128, var493, (var492 & 0x3FFF) * 128, var496 };
                                class382.field5380[var490][var491 + 1] = new int[] { (var494 >> 14 & 0x3FFF) * 128, var495, (var494 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var621 == 5407) {
                            var2--;
                            int var497 = class382.field5380[field2869[var2]].length >> 1;
                            field2869[var2++] = var497;
                            continue;
                        }
                        if (var621 == 5411) {
                            if (class255.field3680 != null) {
                                class432.method2714(class249.field3558, (byte) 90, false, -1, -1);
                            }
                            if (class272.field3857 == null) {
                                String var498 = class274.field3883 == null ? class448.method2779(-18504) : class274.field3883;
                                class149.method900(class26.field329 == 1, (byte) 96, class14.field185, false, var498);
                            } else {
                                class88.method487(11668);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var621 == 5419) {
                            String var499 = "";
                            if (class132.field1602 != null) {
                                if (class132.field1602.field4497 == null) {
                                    var499 = class4.method26(6592, class132.field1602.field4499);
                                } else {
                                    var499 = (String) class132.field1602.field4497;
                                }
                            }
                            field2860[var3++] = var499;
                            continue;
                        }
                        if (var621 == 5420) {
                            field2869[var2++] = class185.field2686 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5421) {
                            if (class255.field3680 != null) {
                                class432.method2714(class249.field3558, (byte) -123, false, -1, -1);
                            }
                            var3--;
                            String var500 = field2860[var3];
                            var2--;
                            boolean var501 = field2869[var2] == 1;
                            String var502 = class448.method2779(-18504) + var500;
                            class149.method900(class26.field329 == 1, (byte) 114, class14.field185, var501, var502);
                            continue;
                        }
                        if (var621 == 5422) {
                            var3 -= 2;
                            String var503 = field2860[var3];
                            String var504 = field2860[var3 + 1];
                            var2--;
                            int var505 = field2869[var2];
                            if (var503.length() > 0) {
                                if (class311.field4395 == null) {
                                    class311.field4395 = new String[class105.field1256[class384.field5425]];
                                }
                                class311.field4395[var505] = var503;
                            }
                            if (var504.length() > 0) {
                                if (class22.field282 == null) {
                                    class22.field282 = new String[class105.field1256[class384.field5425]];
                                }
                                class22.field282[var505] = var504;
                            }
                            continue;
                        }
                        if (var621 == 5423) {
                            var3--;
                            System.out.println(field2860[var3]);
                            continue;
                        }
                        if (var621 == 5424) {
                            var2 -= 11;
                            class211.field3005 = field2869[var2];
                            class131.field1592 = field2869[var2 + 1];
                            class385.field5437 = field2869[var2 + 2];
                            class388.field5481 = field2869[var2 + 3];
                            class199.field2830 = field2869[var2 + 4];
                            class65.field750 = field2869[var2 + 5];
                            class406.field5865 = field2869[var2 + 6];
                            class77.field918 = field2869[var2 + 7];
                            class105.field1263 = field2869[var2 + 8];
                            class135.field1694 = field2869[var2 + 9];
                            class48.field579 = field2869[var2 + 10];
                            class298.field4178.method2412(class199.field2830, 126);
                            class298.field4178.method2412(class65.field750, 125);
                            class298.field4178.method2412(class406.field5865, 127);
                            class298.field4178.method2412(class77.field918, 126);
                            class298.field4178.method2412(class105.field1263, 124);
                            class208.field2959 = null;
                            class271.field3827 = null;
                            class127.field1545 = null;
                            class339.field4810 = null;
                            class383.field5402 = null;
                            class261.field3722 = null;
                            class3.field26 = null;
                            class73.field876 = null;
                            class331.field4686 = true;
                            continue;
                        }
                        if (var621 == 5425) {
                            class72.method410(-21961);
                            class331.field4686 = false;
                            continue;
                        }
                        if (var621 == 5426) {
                            var2 -= 2;
                            class360.field5145 = field2869[var2];
                            class403.field5780 = field2869[var2 + 1];
                            continue;
                        }
                        if (var621 == 5427) {
                            var2 -= 2;
                            class355.field5008 = field2869[var2 + 1];
                            continue;
                        }
                        if (var621 == 5428) {
                            var2 -= 2;
                            int var506 = field2869[var2];
                            int var507 = field2869[var2 + 1];
                            field2869[var2++] = class302.method1992(var506, var507, (byte) -87) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5429) {
                            var3--;
                            class130.method807(field2860[var3], false, 10);
                            continue;
                        }
                    } else if (var621 < 5600) {
                        if (var621 == 5500) {
                            var2 -= 4;
                            int var508 = field2869[var2];
                            int var509 = field2869[var2 + 1];
                            int var510 = field2869[var2 + 2];
                            int var511 = field2869[var2 + 3];
                            class291.method1929(var509, var511, (var508 & 0x3FFF) - class41.field496, var510, (var508 >> 14 & 0x3FFF) - class114.field1403, 100, false);
                            continue;
                        }
                        if (var621 == 5501) {
                            var2 -= 4;
                            int var512 = field2869[var2];
                            int var513 = field2869[var2 + 1];
                            int var514 = field2869[var2 + 2];
                            int var515 = field2869[var2 + 3];
                            class370.method2354((var512 & 0x3FFF) - class41.field496, false, var514, var513, var515, (var512 >> 14 & 0x3FFF) - class114.field1403);
                            continue;
                        }
                        if (var621 == 5502) {
                            var2 -= 6;
                            int var516 = field2869[var2];
                            if (var516 >= 2) {
                                throw new RuntimeException();
                            }
                            class218.field3074 = var516;
                            int var517 = field2869[var2 + 1];
                            if (var517 + 1 >= class382.field5380[class218.field3074].length >> 1) {
                                throw new RuntimeException();
                            }
                            class5.field85 = var517;
                            class254.field3670 = 0;
                            class229.field3245 = field2869[var2 + 2];
                            class122.field1501 = field2869[var2 + 3];
                            int var518 = field2869[var2 + 4];
                            if (var518 >= 2) {
                                throw new RuntimeException();
                            }
                            class434.field6241 = var518;
                            int var519 = field2869[var2 + 5];
                            if (var519 + 1 >= class382.field5380[class434.field6241].length >> 1) {
                                throw new RuntimeException();
                            }
                            class48.field572 = var519;
                            class129.field1568 = 3;
                            continue;
                        }
                        if (var621 == 5503) {
                            class302.method1989((byte) -97);
                            continue;
                        }
                        if (var621 == 5504) {
                            var2 -= 2;
                            class191.method1295(0, field2869[var2 + 1], 30176, field2869[var2]);
                            continue;
                        }
                        if (var621 == 5505) {
                            field2869[var2++] = (int) class292.field4085 >> 3;
                            continue;
                        }
                        if (var621 == 5506) {
                            field2869[var2++] = (int) class441.field6333 >> 3;
                            continue;
                        }
                        if (var621 == 5507) {
                            class394.method2517(3114);
                            continue;
                        }
                        if (var621 == 5508) {
                            class388.method2477(25041);
                            continue;
                        }
                        if (var621 == 5509) {
                            class28.method192(-89);
                            continue;
                        }
                        if (var621 == 5510) {
                            class214.method1444(-128);
                            continue;
                        }
                        if (var621 == 5511) {
                            var2--;
                            int var520 = field2869[var2];
                            int var521 = var520 >> 14 & 0x3FFF;
                            int var522 = var520 & 0x3FFF;
                            int var523 = var521 - class114.field1403;
                            if (var523 < 0) {
                                var523 = 0;
                            } else if (var523 >= class176.field2403) {
                                var523 = class176.field2403;
                            }
                            int var524 = var522 - class41.field496;
                            if (var524 < 0) {
                                var524 = 0;
                            } else if (var524 >= class383.field5395) {
                                var524 = class383.field5395;
                            }
                            class130.field1576 = var523 * 128 + 64;
                            class79.field929 = var524 * 128 + 64;
                            class129.field1568 = 4;
                            continue;
                        }
                        if (var621 == 5512) {
                            class59.method349((byte) 127);
                            continue;
                        }
                    } else if (var621 < 5700) {
                        if (var621 == 5600) {
                            var3 -= 2;
                            String var525 = field2860[var3];
                            String var526 = field2860[var3 + 1];
                            var2--;
                            int var527 = field2869[var2];
                            if (class40.field475 == 10 && class105.field1260 == 0 && class176.field2396 == 0 && class69.field803 == 0 && class72.field870 == 0) {
                                class279.method1842(var526, var525, var527, (byte) -97);
                            }
                            continue;
                        }
                        if (var621 == 5601) {
                            class435.method2724(-63);
                            continue;
                        }
                        if (var621 == 5602) {
                            if (class176.field2396 == 0) {
                                class346.field4890 = -2;
                            }
                            continue;
                        }
                        if (var621 == 5603) {
                            var2 -= 4;
                            if (class40.field475 == 10 && class105.field1260 == 0 && class176.field2396 == 0 && class69.field803 == 0 && class72.field870 == 0) {
                                class415.method2648(field2869[var2 + 3], field2869[var2 + 1], field2869[var2], -38, field2869[var2 + 2]);
                            }
                            continue;
                        }
                        if (var621 == 5604) {
                            var3--;
                            if (class40.field475 == 10 && class105.field1260 == 0 && class176.field2396 == 0 && class69.field803 == 0 && class72.field870 == 0) {
                                class286.method1867(class193.method1310(field2860[var3], (byte) 126), (byte) 44);
                            }
                            continue;
                        }
                        if (var621 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class40.field475 == 10 && class105.field1260 == 0 && class176.field2396 == 0 && class69.field803 == 0 && class72.field870 == 0) {
                                class121.method769(field2869[var2 + 4] == 1, field2860[var3 + 2], field2869[var2 + 6] == 1, field2869[var2 + 3], field2869[var2], field2860[var3 + 1], field2869[var2 + 5] == 1, false, field2869[var2 + 1], class193.method1310(field2860[var3], (byte) 117), field2869[var2 + 2]);
                            }
                            continue;
                        }
                        if (var621 == 5606) {
                            if (class69.field803 == 0) {
                                class222.field3109 = -2;
                            }
                            continue;
                        }
                        if (var621 == 5607) {
                            field2869[var2++] = class346.field4890;
                            continue;
                        }
                        if (var621 == 5608) {
                            field2869[var2++] = class89.field1088;
                            continue;
                        }
                        if (var621 == 5609) {
                            field2869[var2++] = class222.field3109;
                            continue;
                        }
                        if (var621 == 5610) {
                            for (int var528 = 0; var528 < 5; var528++) {
                                field2860[var3++] = class203.field2925.length > var528 ? class332.method2149(class203.field2925[var528], 6) : "";
                            }
                            class203.field2925 = null;
                            continue;
                        }
                        if (var621 == 5611) {
                            field2869[var2++] = class229.field3246;
                            continue;
                        }
                    } else if (var621 < 6100) {
                        if (var621 == 6001) {
                            var2--;
                            int var529 = field2869[var2];
                            if (var529 < 1) {
                                var529 = 1;
                            }
                            if (var529 > 4) {
                                var529 = 4;
                            }
                            class23.field289 = var529;
                            class159.method1017((byte) 121);
                            class278.method1834(class14.field185, (byte) 94);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6002) {
                            var2--;
                            class332.method2148((byte) 125, field2869[var2] == 1);
                            class18.method124(2420);
                            class159.method1017((byte) 113);
                            class440.method2745(-80);
                            class278.method1834(class14.field185, (byte) 123);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6003) {
                            var2--;
                            class286.field4013 = field2869[var2] == 1;
                            class440.method2745(-96);
                            class278.method1834(class14.field185, (byte) 91);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6005) {
                            var2--;
                            class332.field4706 = field2869[var2] == 1;
                            class159.method1017((byte) 71);
                            class278.method1834(class14.field185, (byte) 81);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6006) {
                            var2--;
                            class271.field3838 = field2869[var2] == 1;
                            class151.field1873.method654(!class271.field3838);
                            class278.method1834(class14.field185, (byte) 87);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6007) {
                            var2--;
                            class347.field4921 = field2869[var2];
                            class278.method1834(class14.field185, (byte) 95);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6008) {
                            var2--;
                            class414.field5947 = field2869[var2] == 1;
                            class278.method1834(class14.field185, (byte) 94);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6009) {
                            var2--;
                            class20.field265 = field2869[var2] == 1;
                            class159.method1017((byte) 123);
                            class278.method1834(class14.field185, (byte) 127);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6010) {
                            var2--;
                            class33.field381 = field2869[var2] == 1;
                            class278.method1834(class14.field185, (byte) 103);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6011) {
                            var2--;
                            int var530 = field2869[var2];
                            if (var530 < 0 || var530 > 2) {
                                var530 = 0;
                            }
                            class141.field1739 = var530;
                            class159.method1017((byte) 51);
                            class278.method1834(class14.field185, (byte) 120);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6012) {
                            var2--;
                            class272.field3859 = field2869[var2] == 1;
                            class229.method1527((byte) -25);
                            class278.method1834(class14.field185, (byte) 124);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6014) {
                            var2--;
                            class254.field3656 = field2869[var2] == 1;
                            class159.method1017((byte) 64);
                            class278.method1834(class14.field185, (byte) 122);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6015) {
                            var2--;
                            class18.field210 = field2869[var2] == 1;
                            class159.method1017((byte) 67);
                            class278.method1834(class14.field185, (byte) 124);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6016) {
                            var2--;
                            int var531 = field2869[var2];
                            if (var531 < 0 || var531 > 2) {
                                var531 = 0;
                            }
                            class408.field5877 = var531;
                            class346.method2213(2005892332);
                            class278.method1834(class14.field185, (byte) 120);
                            continue;
                        }
                        if (var621 == 6017) {
                            var2--;
                            class94.field1134 = field2869[var2] == 1;
                            class306.method2020(true);
                            class278.method1834(class14.field185, (byte) 113);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6018) {
                            var2--;
                            int var532 = field2869[var2];
                            if (var532 < 0) {
                                var532 = 0;
                            }
                            if (var532 > 127) {
                                var532 = 127;
                            }
                            class401.field5730 = var532;
                            class278.method1834(class14.field185, (byte) 88);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6019) {
                            var2--;
                            int var533 = field2869[var2];
                            if (var533 < 0) {
                                var533 = 0;
                            }
                            if (var533 > 255) {
                                var533 = 255;
                            }
                            if (class334.field4729 != var533) {
                                if (class334.field4729 == 0 && class328.field4657 != -1) {
                                    class254.method1715(0, var533, false, 0, class328.field4657, class393.field5553);
                                    class215.field3045 = false;
                                } else if (var533 == 0) {
                                    class422.method2665((byte) -40);
                                    class215.field3045 = false;
                                } else {
                                    class401.method2556(var533, (byte) 10);
                                }
                                class334.field4729 = var533;
                            }
                            class278.method1834(class14.field185, (byte) 114);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6020) {
                            var2--;
                            int var534 = field2869[var2];
                            if (var534 < 0) {
                                var534 = 0;
                            }
                            if (var534 > 127) {
                                var534 = 127;
                            }
                            class355.field4999 = var534;
                            class278.method1834(class14.field185, (byte) 119);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6021) {
                            var2--;
                            class144.field1780 = field2869[var2] == 1;
                            class440.method2745(-54);
                            continue;
                        }
                        if (var621 == 6023) {
                            var2--;
                            int var535 = field2869[var2];
                            boolean var536 = false;
                            if (var535 < 0) {
                                var535 = 0;
                            }
                            if (var535 > 2) {
                                var535 = 2;
                            }
                            if (class268.field3812 < 96) {
                                var535 = 0;
                                var536 = true;
                            }
                            class366.method2339(var535, true);
                            class278.method1834(class14.field185, (byte) 96);
                            class101.field1218 = false;
                            field2869[var2++] = var536 ? 0 : 1;
                            continue;
                        }
                        if (var621 == 6024) {
                            var2--;
                            int var537 = field2869[var2];
                            if (var537 < 0 || var537 > 2) {
                                var537 = 0;
                            }
                            class148.field1815 = var537;
                            class278.method1834(class14.field185, (byte) 124);
                            continue;
                        }
                        if (var621 == 6025) {
                            var2--;
                            int var538 = field2869[var2];
                            if (var538 < 0 || var538 > class341.method2188(110, class268.field3812)) {
                                var538 = 0;
                            }
                            class433.field6227 = var538;
                            class278.method1834(class14.field185, (byte) 100);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6027) {
                            var2--;
                            int var539 = field2869[var2];
                            if (var539 < 0 || var539 > 1) {
                                var539 = 0;
                            }
                            class288.method1881(var539 == 1, -13981);
                            continue;
                        }
                        if (var621 == 6028) {
                            var2--;
                            class156.field1916 = field2869[var2] != 0;
                            class278.method1834(class14.field185, (byte) 87);
                            continue;
                        }
                        if (var621 == 6029) {
                            var2--;
                            class347.field4921 = field2869[var2];
                            class278.method1834(class14.field185, (byte) 122);
                            continue;
                        }
                        if (var621 == 6030) {
                            var2--;
                            class222.field3117 = field2869[var2] != 0;
                            class278.method1834(class14.field185, (byte) 109);
                            class159.method1017((byte) 61);
                            continue;
                        }
                        if (var621 == 6031) {
                            var2--;
                            int var540 = field2869[var2];
                            if (var540 < 0 || var540 > 3) {
                                var540 = 2;
                            }
                            class377.method2441(var540, (byte) -117);
                            continue;
                        }
                        if (var621 == 6032) {
                            var2--;
                            int var541 = field2869[var2];
                            if (var541 < 0 || var541 > 3) {
                                var541 = 2;
                            }
                            class140.field1736 = var541;
                            class278.method1834(class14.field185, (byte) 78);
                            class101.field1218 = false;
                            continue;
                        }
                        if (var621 == 6033) {
                            var2--;
                            int var542 = field2869[var2];
                            if (var542 < 0 || var542 > 4) {
                                var542 = 2;
                            }
                            class223.field3135 = var542;
                            class278.method1834(class14.field185, (byte) 98);
                            continue;
                        }
                    } else if (var621 < 6200) {
                        if (var621 == 6101) {
                            field2869[var2++] = class23.field289;
                            continue;
                        }
                        if (var621 == 6102) {
                            field2869[var2++] = class12.method93(1) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6103) {
                            field2869[var2++] = class286.field4013 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6105) {
                            field2869[var2++] = class332.field4706 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6106) {
                            field2869[var2++] = class271.field3838 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6107) {
                            field2869[var2++] = class347.field4921;
                            continue;
                        }
                        if (var621 == 6108) {
                            field2869[var2++] = class414.field5947 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6109) {
                            field2869[var2++] = class20.field265 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6110) {
                            field2869[var2++] = class33.field381 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6111) {
                            field2869[var2++] = class141.field1739;
                            continue;
                        }
                        if (var621 == 6112) {
                            field2869[var2++] = class272.field3859 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6114) {
                            field2869[var2++] = class254.field3656 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6115) {
                            field2869[var2++] = class18.field210 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6116) {
                            field2869[var2++] = class408.field5877;
                            continue;
                        }
                        if (var621 == 6117) {
                            field2869[var2++] = class94.field1134 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6118) {
                            field2869[var2++] = class401.field5730;
                            continue;
                        }
                        if (var621 == 6119) {
                            field2869[var2++] = class334.field4729;
                            continue;
                        }
                        if (var621 == 6120) {
                            field2869[var2++] = class355.field4999;
                            continue;
                        }
                        if (var621 == 6121) {
                            field2869[var2++] = class151.field1873.method657() ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6123) {
                            field2869[var2++] = class246.method1674((byte) 110);
                            continue;
                        }
                        if (var621 == 6124) {
                            field2869[var2++] = class148.field1815;
                            continue;
                        }
                        if (var621 == 6125) {
                            field2869[var2++] = class433.field6227;
                            continue;
                        }
                        if (var621 == 6126) {
                            field2869[var2++] = class151.field1873.method672() ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6127) {
                            field2869[var2++] = class212.field3020 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6128) {
                            field2869[var2++] = class156.field1916 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6129) {
                            field2869[var2++] = class347.field4921;
                            continue;
                        }
                        if (var621 == 6130) {
                            field2869[var2++] = class222.field3117 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6131) {
                            field2869[var2++] = class26.field329;
                            continue;
                        }
                        if (var621 == 6132) {
                            field2869[var2++] = class140.field1736;
                            continue;
                        }
                        if (var621 == 6133) {
                            field2869[var2++] = class185.field2686 == 1 || class185.field2686 == 4 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6134) {
                            field2869[var2++] = class341.method2188(110, class268.field3812);
                            continue;
                        }
                        if (var621 == 6135) {
                            field2869[var2++] = class223.field3135;
                            continue;
                        }
                    } else if (var621 < 6300) {
                        if (var621 == 6200) {
                            var2 -= 2;
                            class183.field2510 = (short) field2869[var2];
                            if (class183.field2510 <= 0) {
                                class183.field2510 = 256;
                            }
                            class109.field1343 = (short) field2869[var2 + 1];
                            if (class109.field1343 <= 0) {
                                class109.field1343 = 205;
                            }
                            continue;
                        }
                        if (var621 == 6201) {
                            var2 -= 2;
                            class158.field2061 = (short) field2869[var2];
                            if (class158.field2061 <= 0) {
                                class158.field2061 = 256;
                            }
                            class92.field1121 = (short) field2869[var2 + 1];
                            if (class92.field1121 <= 0) {
                                class92.field1121 = 320;
                            }
                            continue;
                        }
                        if (var621 == 6202) {
                            var2 -= 4;
                            class441.field6321 = (short) field2869[var2];
                            if (class441.field6321 <= 0) {
                                class441.field6321 = 1;
                            }
                            class389.field5501 = (short) field2869[var2 + 1];
                            if (class389.field5501 <= 0) {
                                class389.field5501 = 32767;
                            } else if (class389.field5501 < class441.field6321) {
                                class389.field5501 = class441.field6321;
                            }
                            class403.field5779 = (short) field2869[var2 + 2];
                            if (class403.field5779 <= 0) {
                                class403.field5779 = 1;
                            }
                            class374.field5258 = (short) field2869[var2 + 3];
                            if (class374.field5258 <= 0) {
                                class374.field5258 = 32767;
                            } else if (class374.field5258 < class403.field5779) {
                                class374.field5258 = class403.field5779;
                            }
                            continue;
                        }
                        if (var621 == 6203) {
                            class216.method1449(class113.field1390.field2618, 0, (byte) 107, 0, false, class113.field1390.field2516);
                            field2869[var2++] = class153.field1891;
                            field2869[var2++] = class42.field516;
                            continue;
                        }
                        if (var621 == 6204) {
                            field2869[var2++] = class158.field2061;
                            field2869[var2++] = class92.field1121;
                            continue;
                        }
                        if (var621 == 6205) {
                            field2869[var2++] = class183.field2510;
                            field2869[var2++] = class109.field1343;
                            continue;
                        }
                    } else if (var621 < 6400) {
                        if (var621 == 6300) {
                            field2869[var2++] = (int) (class175.method1195(62) / 60000L);
                            continue;
                        }
                        if (var621 == 6301) {
                            field2869[var2++] = (int) (class175.method1195(79) / 86400000L) - 11745;
                            continue;
                        }
                        if (var621 == 6302) {
                            var2 -= 3;
                            int var543 = field2869[var2];
                            int var544 = field2869[var2 + 1];
                            int var545 = field2869[var2 + 2];
                            field2877.clear();
                            field2877.set(11, 12);
                            field2877.set(var545, var544, var543);
                            field2869[var2++] = (int) (field2877.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var621 == 6303) {
                            field2877.clear();
                            field2877.setTime(new Date(class175.method1195(77)));
                            field2869[var2++] = field2877.get(1);
                            continue;
                        }
                        if (var621 == 6304) {
                            var2--;
                            int var546 = field2869[var2];
                            boolean var547 = true;
                            if (var546 < 0) {
                                var547 = (var546 + 1) % 4 == 0;
                            } else if (var546 < 1582) {
                                var547 = var546 % 4 == 0;
                            } else if (var546 % 4 != 0) {
                                var547 = false;
                            } else if (var546 % 100 != 0) {
                                var547 = true;
                            } else if (var546 % 400 != 0) {
                                var547 = false;
                            }
                            field2869[var2++] = var547 ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 6500) {
                        if (var621 == 6405) {
                            field2869[var2++] = class236.method1614((byte) -105) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6406) {
                            field2869[var2++] = class384.method2464(30221) ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 6600) {
                        if (var621 == 6500) {
                            if (class40.field475 == 10 && class105.field1260 == 0 && class176.field2396 == 0 && class69.field803 == 0) {
                                field2869[var2++] = class236.method1607(0) == -1 ? 0 : 1;
                                continue;
                            }
                            field2869[var2++] = 1;
                            continue;
                        }
                        if (var621 == 6501) {
                            class130 var548 = class347.method2221((byte) 51);
                            if (var548 == null) {
                                field2869[var2++] = -1;
                                field2869[var2++] = 0;
                                field2860[var3++] = "";
                                field2869[var2++] = 0;
                                field2860[var3++] = "";
                                field2869[var2++] = 0;
                                field2869[var2++] = 0;
                            } else {
                                field2869[var2++] = var548.field1575;
                                field2869[var2++] = var548.field6330;
                                field2860[var3++] = var548.field1573;
                                class329 var549 = var548.method804((byte) -61);
                                field2869[var2++] = var549.field4662;
                                field2860[var3++] = var549.field4659;
                                field2869[var2++] = var548.field6331;
                                field2869[var2++] = var548.field1581;
                            }
                            continue;
                        }
                        if (var621 == 6502) {
                            class130 var550 = class385.method2468(6);
                            if (var550 == null) {
                                field2869[var2++] = -1;
                                field2869[var2++] = 0;
                                field2860[var3++] = "";
                                field2869[var2++] = 0;
                                field2860[var3++] = "";
                                field2869[var2++] = 0;
                                field2869[var2++] = 0;
                            } else {
                                field2869[var2++] = var550.field1575;
                                field2869[var2++] = var550.field6330;
                                field2860[var3++] = var550.field1573;
                                class329 var551 = var550.method804((byte) -65);
                                field2869[var2++] = var551.field4662;
                                field2860[var3++] = var551.field4659;
                                field2869[var2++] = var550.field6331;
                                field2869[var2++] = var550.field1581;
                            }
                            continue;
                        }
                        if (var621 == 6503) {
                            var2--;
                            int var552 = field2869[var2];
                            if (class40.field475 == 10 && class105.field1260 == 0 && class176.field2396 == 0 && class69.field803 == 0) {
                                field2869[var2++] = class75.method420(-11745, var552) ? 1 : 0;
                                continue;
                            }
                            field2869[var2++] = 0;
                            continue;
                        }
                        if (var621 == 6504) {
                            var2--;
                            class140.field1735 = field2869[var2];
                            class278.method1834(class14.field185, (byte) 84);
                            continue;
                        }
                        if (var621 == 6505) {
                            field2869[var2++] = class140.field1735;
                            continue;
                        }
                        if (var621 == 6506) {
                            var2--;
                            int var553 = field2869[var2];
                            class130 var554 = class106.method586((byte) 60, var553);
                            if (var554 == null) {
                                field2869[var2++] = -1;
                                field2860[var3++] = "";
                                field2869[var2++] = 0;
                                field2860[var3++] = "";
                                field2869[var2++] = 0;
                                field2869[var2++] = 0;
                            } else {
                                field2869[var2++] = var554.field6330;
                                field2860[var3++] = var554.field1573;
                                class329 var555 = var554.method804((byte) -116);
                                field2869[var2++] = var555.field4662;
                                field2860[var3++] = var555.field4659;
                                field2869[var2++] = var554.field6331;
                                field2869[var2++] = var554.field1581;
                            }
                            continue;
                        }
                        if (var621 == 6507) {
                            var2 -= 4;
                            int var556 = field2869[var2];
                            boolean var557 = field2869[var2 + 1] == 1;
                            int var558 = field2869[var2 + 2];
                            boolean var559 = field2869[var2 + 3] == 1;
                            class355.method2258(var556, var557, var558, true, var559);
                            continue;
                        }
                        if (var621 == 6508) {
                            class229.method1528(0);
                            continue;
                        }
                        if (var621 == 6509) {
                            if (class40.field475 == 10) {
                                var2--;
                                if (field2869[var2] == 1) {
                                    if (class399.field5692 == null) {
                                        class399.field5692 = new class113();
                                    }
                                } else if (class399.field5692 != null) {
                                    class399.field5692.method704(-124);
                                    class399.field5692 = null;
                                }
                            }
                            continue;
                        }
                    } else if (var621 < 6700) {
                        if (var621 == 6600) {
                            var2--;
                            class374.field5254 = field2869[var2] == 1;
                            class278.method1834(class14.field185, (byte) 86);
                            continue;
                        }
                        if (var621 == 6601) {
                            field2869[var2++] = class374.field5254 ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 6800 && class411.field5900 == 2) {
                        if (var621 == 6700) {
                            int var560 = class22.field280.method1892(false);
                            if (class248.field3548 != -1) {
                                var560++;
                            }
                            field2869[var2++] = var560;
                            continue;
                        }
                        if (var621 == 6701) {
                            var2--;
                            int var561 = field2869[var2];
                            if (class248.field3548 != -1) {
                                if (var561 == 0) {
                                    field2869[var2++] = class248.field3548;
                                    continue;
                                }
                                var561--;
                            }
                            class167 var562 = (class167) class22.field280.method1884(0);
                            while (var561-- > 0) {
                                var562 = (class167) class22.field280.method1890(-1);
                            }
                            field2869[var2++] = var562.field2332;
                            continue;
                        }
                        if (var621 == 6702) {
                            var2--;
                            int var563 = field2869[var2];
                            if (class98.field1194[var563] == null) {
                                field2860[var3++] = "";
                            } else {
                                String var564 = class98.field1194[var563][0].field2518;
                                if (var564 == null) {
                                    field2860[var3++] = "";
                                } else {
                                    field2860[var3++] = var564.substring(0, var564.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var621 == 6703) {
                            var2--;
                            int var565 = field2869[var2];
                            if (class98.field1194[var565] == null) {
                                field2869[var2++] = 0;
                            } else {
                                field2869[var2++] = class98.field1194[var565].length;
                            }
                            continue;
                        }
                        if (var621 == 6704) {
                            var2 -= 2;
                            int var566 = field2869[var2];
                            int var567 = field2869[var2 + 1];
                            if (class98.field1194[var566] == null) {
                                field2860[var3++] = "";
                            } else {
                                String var568 = class98.field1194[var566][var567].field2518;
                                if (var568 == null) {
                                    field2860[var3++] = "";
                                } else {
                                    field2860[var3++] = var568;
                                }
                            }
                            continue;
                        }
                        if (var621 == 6705) {
                            var2 -= 2;
                            int var569 = field2869[var2];
                            int var570 = field2869[var2 + 1];
                            if (class98.field1194[var569] == null) {
                                field2869[var2++] = 0;
                            } else {
                                field2869[var2++] = class98.field1194[var569][var570].field2574;
                            }
                            continue;
                        }
                        if (var621 == 6706) {
                            continue;
                        }
                        if (var621 == 6707) {
                            var2 -= 3;
                            int var571 = field2869[var2];
                            int var572 = field2869[var2 + 1];
                            int var573 = field2869[var2 + 2];
                            class222.method1487(1, var571 << 16 | var572, (byte) 121, "", var573);
                            continue;
                        }
                        if (var621 == 6708) {
                            var2 -= 3;
                            int var574 = field2869[var2];
                            int var575 = field2869[var2 + 1];
                            int var576 = field2869[var2 + 2];
                            class222.method1487(2, var574 << 16 | var575, (byte) 18, "", var576);
                            continue;
                        }
                        if (var621 == 6709) {
                            var2 -= 3;
                            int var577 = field2869[var2];
                            int var578 = field2869[var2 + 1];
                            int var579 = field2869[var2 + 2];
                            class222.method1487(3, var577 << 16 | var578, (byte) 37, "", var579);
                            continue;
                        }
                        if (var621 == 6710) {
                            var2 -= 3;
                            int var580 = field2869[var2];
                            int var581 = field2869[var2 + 1];
                            int var582 = field2869[var2 + 2];
                            class222.method1487(4, var580 << 16 | var581, (byte) 49, "", var582);
                            continue;
                        }
                        if (var621 == 6711) {
                            var2 -= 3;
                            int var583 = field2869[var2];
                            int var584 = field2869[var2 + 1];
                            int var585 = field2869[var2 + 2];
                            class222.method1487(5, var583 << 16 | var584, (byte) 27, "", var585);
                            continue;
                        }
                        if (var621 == 6712) {
                            var2 -= 3;
                            int var586 = field2869[var2];
                            int var587 = field2869[var2 + 1];
                            int var588 = field2869[var2 + 2];
                            class222.method1487(6, var586 << 16 | var587, (byte) 67, "", var588);
                            continue;
                        }
                        if (var621 == 6713) {
                            var2 -= 3;
                            int var589 = field2869[var2];
                            int var590 = field2869[var2 + 1];
                            int var591 = field2869[var2 + 2];
                            class222.method1487(7, var589 << 16 | var590, (byte) 125, "", var591);
                            continue;
                        }
                        if (var621 == 6714) {
                            var2 -= 3;
                            int var592 = field2869[var2];
                            int var593 = field2869[var2 + 1];
                            int var594 = field2869[var2 + 2];
                            class222.method1487(8, var592 << 16 | var593, (byte) 105, "", var594);
                            continue;
                        }
                        if (var621 == 6715) {
                            var2 -= 3;
                            int var595 = field2869[var2];
                            int var596 = field2869[var2 + 1];
                            int var597 = field2869[var2 + 2];
                            class222.method1487(9, var595 << 16 | var596, (byte) 35, "", var597);
                            continue;
                        }
                        if (var621 == 6716) {
                            var2 -= 3;
                            int var598 = field2869[var2];
                            int var599 = field2869[var2 + 1];
                            int var600 = field2869[var2 + 2];
                            class222.method1487(10, var598 << 16 | var599, (byte) 27, "", var600);
                            continue;
                        }
                        if (var621 == 6717) {
                            var2 -= 3;
                            int var601 = field2869[var2];
                            int var602 = field2869[var2 + 1];
                            int var603 = field2869[var2 + 2];
                            class184 var604 = class341.method2186(var601 << 16 | var602, (byte) 21, var603);
                            class3.method13(-11372);
                            class281 var605 = client.method1121(var604);
                            class414.method2637(var605.method1860(-1), var603, 29286, var604.field2645, var605.field3976, var601 << 16 | var602, var604.field2611);
                            continue;
                        }
                    } else if (var621 < 6900) {
                        if (var621 == 6800) {
                            var2--;
                            int var606 = field2869[var2];
                            class246 var607 = class153.method927(0, var606);
                            if (var607.field3500 == null) {
                                field2860[var3++] = "";
                            } else {
                                field2860[var3++] = var607.field3500;
                            }
                            continue;
                        }
                        if (var621 == 6801) {
                            var2--;
                            int var608 = field2869[var2];
                            class246 var609 = class153.method927(0, var608);
                            field2869[var2++] = var609.field3490;
                            continue;
                        }
                        if (var621 == 6802) {
                            var2--;
                            int var610 = field2869[var2];
                            class246 var611 = class153.method927(0, var610);
                            field2869[var2++] = var611.field3512;
                            continue;
                        }
                        if (var621 == 6803) {
                            var2--;
                            int var612 = field2869[var2];
                            class246 var613 = class153.method927(0, var612);
                            field2869[var2++] = var613.field3481;
                            continue;
                        }
                    }
                } else {
                    class184 var75;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var75 = class282.method1863(field2869[var2], -25835);
                    } else {
                        var75 = var37 ? field2875 : field2874;
                    }
                    if (var621 == 1300) {
                        var2--;
                        int var76 = field2869[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method1247(var76, (byte) -84, field2860[var3]);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var621 == 1301) {
                        var2 -= 2;
                        int var77 = field2869[var2];
                        int var78 = field2869[var2 + 1];
                        var75.field2660 = class341.method2186(var77, (byte) 21, var78);
                        continue;
                    }
                    if (var621 == 1302) {
                        var2--;
                        var75.field2575 = field2869[var2] == 1;
                        continue;
                    }
                    if (var621 == 1303) {
                        var2--;
                        var75.field2582 = field2869[var2];
                        continue;
                    }
                    if (var621 == 1304) {
                        var2--;
                        var75.field2649 = field2869[var2];
                        continue;
                    }
                    if (var621 == 1305) {
                        var3--;
                        var75.field2613 = field2860[var3];
                        continue;
                    }
                    if (var621 == 1306) {
                        var3--;
                        var75.field2638 = field2860[var3];
                        continue;
                    }
                    if (var621 == 1307) {
                        var75.field2622 = null;
                        continue;
                    }
                    if (var621 == 1308) {
                        var2--;
                        var75.field2611 = field2869[var2];
                        var2--;
                        var75.field2645 = field2869[var2];
                        continue;
                    }
                    if (var621 == 1309) {
                        var2--;
                        int var79 = field2869[var2];
                        var2--;
                        int var80 = field2869[var2];
                        if (var80 >= 1 && var80 <= 10) {
                            var75.method1235(-74, var80 - 1, var79);
                        }
                        continue;
                    }
                    if (var621 == 1310) {
                        var3--;
                        var75.field2563 = field2860[var3];
                        continue;
                    }
                    if (var621 == 1311) {
                        var2--;
                        var75.field2513 = field2869[var2];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var620) {
            if (arg0.field1547 == null) {
                StringBuffer var618 = new StringBuffer(30);
                var618.append("CS2: ").append(arg0.field5855).append(" ");
                for (int var619 = field2863 - 1; var619 >= 0; var619--) {
                    var618.append("v: ").append(field2871[var619].field6469.field5855).append(" ");
                }
                var618.append("op: ").append(var7);
                class422.method2663(var618.toString(), var620, -61);
            } else {
                class105.method578("Clientscript error in: " + arg0.field1547, (byte) -45);
                StringBuffer var615 = new StringBuffer(30);
                var615.append("Clientscript error in: ").append(arg0.field1547).append("\n");
                for (int var616 = field2863 - 1; var616 >= 0; var616--) {
                    var615.append("via: ").append(field2871[var616].field6469.field1547).append("\n");
                }
                var615.append("Op: ").append(var7).append("\n");
                String var617 = var620.getMessage();
                if (var617 != null && var617.length() > 0) {
                    var615.append("Message: ").append(var617).append("\n");
                }
                class422.method2663(var615.toString(), var620, -64);
                class397.method2538(-124, var615.toString());
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 6936)
    public static final void method1331(int arg0) {
        if (arg0 == -1 || !class98.method545(arg0, (byte) 11)) {
            return;
        }
        class184[] var1 = class98.field1194[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class184 var3 = var1[var2];
            if (var3.field2621 != null) {
                class272 var4 = new class272();
                var4.field3851 = var3;
                var4.field3848 = var3.field2621;
                method1333(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lwi;)V", line = 6968)
    public static final void method1332(class272 arg0) {
        method1333(arg0, 200000);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lwi;I)V", line = 6972)
    private static final void method1333(class272 arg0, int arg1) {
        Object[] var2 = arg0.field3848;
        int var3 = (Integer) var2[0];
        class128 var4 = class330.method2130(var3, -2);
        if (var4 == null) {
            return;
        }
        field2880 = new int[var4.field1546];
        int var5 = 0;
        field2859 = new String[var4.field1559];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field3847;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field3858;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field3851 == null ? -1 : arg0.field3851.field2584;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field3849;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field3851 == null ? -1 : arg0.field3851.field2668;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field3853 == null ? -1 : arg0.field3853.field2584;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field3853 == null ? -1 : arg0.field3853.field2668;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field3844;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field3850;
                }
                field2880[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field3854;
                }
                field2859[var6++] = var9;
            }
        }
        method1330(var4, arg1);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()V", line = 7056)
    public static void method1334() {
        field2880 = null;
        field2859 = null;
        field2872 = null;
        field2864 = null;
        field2869 = null;
        field2860 = null;
        field2871 = null;
        field2874 = null;
        field2875 = null;
        field2876 = null;
        field2877 = null;
        field2883 = null;
        field2882 = null;
        field2881 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)V", line = 7083)
    public static final void method1335(int arg0, int arg1, int arg2) {
        class128 var3 = class348.method2223(arg0, arg1, (byte) -120, arg2);
        if (var3 == null) {
            return;
        }
        field2880 = new int[var3.field1546];
        field2859 = new String[var3.field1559];
        if (var3.field1551 == 15 || var3.field1551 == 17 || var3.field1551 == 16) {
            int var4 = 0;
            int var5 = 0;
            if (class337.field4795 != null) {
                var4 = class337.field4795.field2567;
                var5 = class337.field4795.field2602;
            }
            field2880[0] = class306.field4306.method17(20417) - var4;
            field2880[1] = class306.field4306.method18(1) - var5;
        }
        method1330(var3, 200000);
    }
}
