import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class457 {

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    private static int field6451 = 0;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "[I")
    private static int[] field6447 = new int[5];

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "[Ljava/lang/String;")
    private static String[] field6452 = new String[1000];

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "[[I")
    private static int[][] field6457 = new int[5][5000];

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "[I")
    private static int[] field6453 = new int[1000];

    @OriginalMember(owner = "client!ot", name = "u", descriptor = "[Len;")
    private static class254[] field6463 = new class254[50];

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "Ljava/util/Calendar;")
    private static Calendar field6446 = Calendar.getInstance();

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field6468 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ot", name = "x", descriptor = "[I")
    private static int[] field6466 = new int[3];

    @OriginalMember(owner = "client!ot", name = "y", descriptor = "Lmo;")
    public static class336 field6467 = new class336(4);

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!ot", name = "s", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!ot", name = "t", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!ot", name = "v", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "Lae;")
    private static class172 field6450;

    @OriginalMember(owner = "client!ot", name = "r", descriptor = "Lae;")
    private static class172 field6460;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "Ldr;")
    private static class385 field6448;

    @OriginalMember(owner = "client!ot", name = "w", descriptor = "[I")
    private static int[] field6465;

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "[Ljava/lang/String;")
    private static String[] field6458;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2740(int arg0) {
        if (arg0 == -1 || !class369.method2261(0, arg0)) {
            return;
        }
        class172[] var1 = class263.field3787[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class172 var3 = var1[var2];
            if (var3.field2504 != null) {
                class472 var4 = new class472();
                var4.field6642 = var3;
                var4.field6649 = var3.field2504;
                method2742(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lks;I)V", line = 48)
    private static final void method2741(class292 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field4138;
        int[] var6 = arg0.field4135;
        byte var7 = -1;
        field6451 = 0;
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
                        field6453[var2++] = var6[var4];
                        continue;
                    }
                    if (var625 == 1) {
                        int var9 = var6[var4];
                        field6453[var2++] = class416.field5691.field3652[var9];
                        continue;
                    }
                    if (var625 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class416.field5691.method1732(field6453[var2], -1, var10);
                        continue;
                    }
                    if (var625 == 3) {
                        field6452[var3++] = arg0.field4139[var4];
                        continue;
                    }
                    if (var625 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var625 == 7) {
                        var2 -= 2;
                        if (field6453[var2 + 1] != field6453[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 8) {
                        var2 -= 2;
                        if (field6453[var2 + 1] == field6453[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 9) {
                        var2 -= 2;
                        if (field6453[var2] < field6453[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 10) {
                        var2 -= 2;
                        if (field6453[var2] > field6453[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 21) {
                        if (field6451 == 0) {
                            return;
                        }
                        class254 var11 = field6463[--field6451];
                        arg0 = var11.field3641;
                        var5 = arg0.field4138;
                        var6 = arg0.field4135;
                        var4 = var11.field3644;
                        field6465 = var11.field3642;
                        field6458 = var11.field3645;
                        continue;
                    }
                    if (var625 == 25) {
                        int var12 = var6[var4];
                        field6453[var2++] = class416.field5691.method1724(var12, 113);
                        continue;
                    }
                    if (var625 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class416.field5691.method1726(var13, -1, field6453[var2]);
                        continue;
                    }
                    if (var625 == 31) {
                        var2 -= 2;
                        if (field6453[var2] <= field6453[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 32) {
                        var2 -= 2;
                        if (field6453[var2] >= field6453[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 33) {
                        field6453[var2++] = field6465[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var625 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field6465[var10001] = field6453[var2];
                        continue;
                    }
                    if (var625 == 35) {
                        field6452[var3++] = field6458[var6[var4]];
                        continue;
                    }
                    if (var625 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field6458[var10001] = field6452[var3];
                        continue;
                    }
                    if (var625 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class263.method1775(var3, -1, field6452, var14);
                        field6452[var3++] = var15;
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
                        class292 var17 = class409.method2451(49, var16);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field4140];
                        String[] var19 = new String[var17.field4130];
                        for (int var20 = 0; var20 < var17.field4127; var20++) {
                            var18[var20] = field6453[var2 + var20 - var17.field4127];
                        }
                        for (int var21 = 0; var21 < var17.field4133; var21++) {
                            var19[var21] = field6452[var3 + var21 - var17.field4133];
                        }
                        var2 -= var17.field4127;
                        var3 -= var17.field4133;
                        class254 var22 = new class254();
                        var22.field3641 = arg0;
                        var22.field3644 = var4;
                        var22.field3642 = field6465;
                        var22.field3645 = field6458;
                        if (field6451 >= field6463.length) {
                            throw new RuntimeException();
                        }
                        field6463[field6451++] = var22;
                        arg0 = var17;
                        var5 = var17.field4138;
                        var6 = var17.field4135;
                        var4 = -1;
                        field6465 = var18;
                        field6458 = var19;
                        continue;
                    }
                    if (var625 == 42) {
                        field6453[var2++] = class339.field4689[var6[var4]];
                        continue;
                    }
                    if (var625 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class339.field4689[var23] = field6453[var2];
                        class483.method2847(-99, var23);
                        class199.field2947 |= class394.field5443[var23];
                        continue;
                    }
                    if (var625 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field6453[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field6447[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4494;
                                }
                                field6457[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var625 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field6453[var2];
                        if (var30 >= 0 && var30 < field6447[var29]) {
                            field6453[var2++] = field6457[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var625 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field6453[var2];
                        if (var32 >= 0 && var32 < field6447[var31]) {
                            field6457[var31][var32] = field6453[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var625 == 47) {
                        String var33 = class401.field5505[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field6452[var3++] = var33;
                        continue;
                    }
                    if (var625 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class401.field5505[var34] = field6452[var3];
                        class353.method2175(var34, 6);
                        continue;
                    }
                    if (var625 == 51) {
                        class155 var35 = arg0.field4129[var6[var4]];
                        var2--;
                        class478 var36 = (class478) var35.method1104(-126, (long) field6453[var2]);
                        if (var36 != null) {
                            var4 += var36.field6789;
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
                        int var38 = field6453[var2];
                        int var39 = field6453[var2 + 1];
                        int var40 = field6453[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class172 var41 = class361.method2217(var38, -1060820048);
                        if (var41.field2541 == null) {
                            var41.field2541 = new class172[var40 + 1];
                        }
                        if (var41.field2541.length <= var40) {
                            class172[] var42 = new class172[var40 + 1];
                            for (int var43 = 0; var43 < var41.field2541.length; var43++) {
                                var42[var43] = var41.field2541[var43];
                            }
                            var41.field2541 = var42;
                        }
                        if (var40 > 0 && var41.field2541[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class172 var44 = new class172();
                        var44.field2602 = var39;
                        var44.field2532 = var44.field2543 = var41.field2543;
                        var44.field2527 = var40;
                        var41.field2541[var40] = var44;
                        if (var37) {
                            field6460 = var44;
                        } else {
                            field6450 = var44;
                        }
                        class184.method1314(var41, 120);
                        continue;
                    }
                    if (var625 == 101) {
                        class172 var45 = var37 ? field6460 : field6450;
                        if (var45.field2527 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class172 var46 = class361.method2217(var45.field2543, -1060820048);
                        var46.field2541[var45.field2527] = null;
                        class184.method1314(var46, 106);
                        continue;
                    }
                    if (var625 == 102) {
                        var2--;
                        class172 var47 = class361.method2217(field6453[var2], -1060820048);
                        var47.field2541 = null;
                        class184.method1314(var47, 113);
                        continue;
                    }
                    if (var625 == 200) {
                        var2 -= 2;
                        int var48 = field6453[var2];
                        int var49 = field6453[var2 + 1];
                        class172 var50 = class77.method678(var49, 120, var48);
                        if (var50 != null && var49 != -1) {
                            field6453[var2++] = 1;
                            if (var37) {
                                field6460 = var50;
                            } else {
                                field6450 = var50;
                            }
                            continue;
                        }
                        field6453[var2++] = 0;
                        continue;
                    }
                    if (var625 == 201) {
                        var2--;
                        int var51 = field6453[var2];
                        class172 var52 = class361.method2217(var51, -1060820048);
                        if (var52 == null) {
                            field6453[var2++] = 0;
                        } else {
                            field6453[var2++] = 1;
                            if (var37) {
                                field6460 = var52;
                            } else {
                                field6450 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var625 < 500) {
                    if (var625 == 403) {
                        var2 -= 2;
                        int var53 = field6453[var2];
                        int var54 = field6453[var2 + 1];
                        for (int var55 = 0; var55 < class365.field5023.length; var55++) {
                            if (class365.field5023[var55] == var53) {
                                class262.field3781.field498.method2528(var55, var54, class353.field4854, -9181);
                                continue label4494;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class97.field1378.length) {
                                continue label4494;
                            }
                            if (class97.field1378[var56] == var53) {
                                class262.field3781.field498.method2528(var56, var54, class353.field4854, -9181);
                                continue label4494;
                            }
                            var56++;
                        }
                    }
                    if (var625 == 404) {
                        var2 -= 2;
                        int var57 = field6453[var2];
                        int var58 = field6453[var2 + 1];
                        class262.field3781.field498.method2525(var57, var58, -75);
                        continue;
                    }
                    if (var625 == 410) {
                        var2--;
                        boolean var59 = field6453[var2] != 0;
                        class262.field3781.field498.method2523(true, var59);
                        continue;
                    }
                } else if (var625 >= 1000 && var625 < 1100 || var625 >= 2000 && var625 < 2100) {
                    class172 var60;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var60 = class361.method2217(field6453[var2], -1060820048);
                    } else {
                        var60 = var37 ? field6460 : field6450;
                    }
                    if (var625 == 1000) {
                        var2 -= 4;
                        var60.field2536 = field6453[var2];
                        var60.field2552 = field6453[var2 + 1];
                        int var61 = field6453[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field6453[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field2601 = (byte) var61;
                        var60.field2533 = (byte) var62;
                        class184.method1314(var60, 82);
                        class410.method2455((byte) 85, var60);
                        if (var60.field2527 == -1) {
                            class301.method1938(11, var60.field2543);
                        }
                        continue;
                    }
                    if (var625 == 1001) {
                        var2 -= 4;
                        var60.field2580 = field6453[var2];
                        var60.field2545 = field6453[var2 + 1];
                        var60.field2521 = 0;
                        var60.field2513 = 0;
                        int var63 = field6453[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field6453[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field2473 = (byte) var63;
                        var60.field2511 = (byte) var64;
                        class184.method1314(var60, 67);
                        class410.method2455((byte) 85, var60);
                        if (var60.field2602 == 0) {
                            class110.method877(var60, false, -1);
                        }
                        continue;
                    }
                    if (var625 == 1003) {
                        var2--;
                        boolean var65 = field6453[var2] == 1;
                        if (var60.field2567 != var65) {
                            var60.field2567 = var65;
                            class184.method1314(var60, 101);
                        }
                        if (var60.field2527 == -1) {
                            class191.method1340((byte) -98, var60.field2543);
                        }
                        continue;
                    }
                    if (var625 == 1004) {
                        var2 -= 2;
                        var60.field2534 = field6453[var2];
                        var60.field2493 = field6453[var2 + 1];
                        class184.method1314(var60, 58);
                        class410.method2455((byte) 85, var60);
                        if (var60.field2602 == 0) {
                            class110.method877(var60, false, -1);
                        }
                        continue;
                    }
                    if (var625 == 1005) {
                        var2--;
                        var60.field2604 = field6453[var2] == 1;
                        continue;
                    }
                } else if (!(var625 < 1100 || var625 >= 1200) || !(var625 < 2100 || var625 >= 2200)) {
                    class172 var66;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var66 = class361.method2217(field6453[var2], -1060820048);
                    } else {
                        var66 = var37 ? field6460 : field6450;
                    }
                    if (var625 == 1100) {
                        var2 -= 2;
                        var66.field2477 = field6453[var2];
                        if (var66.field2477 > var66.field2499 - var66.field2554) {
                            var66.field2477 = var66.field2499 - var66.field2554;
                        }
                        if (var66.field2477 < 0) {
                            var66.field2477 = 0;
                        }
                        var66.field2518 = field6453[var2 + 1];
                        if (var66.field2518 > var66.field2506 - var66.field2579) {
                            var66.field2518 = var66.field2506 - var66.field2579;
                        }
                        if (var66.field2518 < 0) {
                            var66.field2518 = 0;
                        }
                        class184.method1314(var66, 91);
                        if (var66.field2527 == -1) {
                            class178.method1285(-110, var66.field2543);
                        }
                        continue;
                    }
                    if (var625 == 1101) {
                        var2--;
                        var66.field2482 = field6453[var2];
                        class184.method1314(var66, 68);
                        if (var66.field2527 == -1) {
                            class241.method1678(-101, var66.field2543);
                        }
                        continue;
                    }
                    if (var625 == 1102) {
                        var2--;
                        var66.field2594 = field6453[var2] == 1;
                        class184.method1314(var66, 125);
                        continue;
                    }
                    if (var625 == 1103) {
                        var2--;
                        var66.field2531 = field6453[var2];
                        class184.method1314(var66, 119);
                        continue;
                    }
                    if (var625 == 1104) {
                        var2--;
                        var66.field2526 = field6453[var2];
                        class184.method1314(var66, 77);
                        continue;
                    }
                    if (var625 == 1105) {
                        var2--;
                        int var67 = field6453[var2];
                        if (var66.field2495 != var67) {
                            var66.field2495 = var67;
                            class184.method1314(var66, 84);
                        }
                        if (var66.field2527 == -1) {
                            class149.method1055((byte) 58, var66.field2543);
                        }
                        continue;
                    }
                    if (var625 == 1106) {
                        var2--;
                        var66.field2589 = field6453[var2];
                        class184.method1314(var66, 90);
                        continue;
                    }
                    if (var625 == 1107) {
                        var2--;
                        var66.field2592 = field6453[var2] == 1;
                        class184.method1314(var66, 71);
                        continue;
                    }
                    if (var625 == 1108) {
                        var66.field2488 = 1;
                        var2--;
                        var66.field2551 = field6453[var2];
                        class184.method1314(var66, 97);
                        if (var66.field2527 == -1) {
                            class102.method823(var66.field2543, (byte) 119);
                        }
                        continue;
                    }
                    if (var625 == 1109) {
                        var2 -= 6;
                        var66.field2596 = field6453[var2];
                        var66.field2581 = field6453[var2 + 1];
                        var66.field2578 = field6453[var2 + 2];
                        var66.field2556 = field6453[var2 + 3];
                        var66.field2491 = field6453[var2 + 4];
                        var66.field2519 = field6453[var2 + 5];
                        class184.method1314(var66, 95);
                        if (var66.field2527 == -1) {
                            class313.method1991(var66.field2543, 110);
                            class57.method524(777, var66.field2543);
                        }
                        continue;
                    }
                    if (var625 == 1110) {
                        var2--;
                        int var68 = field6453[var2];
                        if (var66.field2597 != var68) {
                            var66.field2597 = var68;
                            var66.field2528 = 0;
                            var66.field2559 = 1;
                            var66.field2585 = 0;
                            class184.method1314(var66, 58);
                        }
                        if (var66.field2527 == -1) {
                            class151.method1082(103, var66.field2543);
                        }
                        continue;
                    }
                    if (var625 == 1111) {
                        var2--;
                        var66.field2616 = field6453[var2] == 1;
                        class184.method1314(var66, 93);
                        continue;
                    }
                    if (var625 == 1112) {
                        var3--;
                        String var69 = field6452[var3];
                        if (!var69.equals(var66.field2476)) {
                            var66.field2476 = var69;
                            class184.method1314(var66, 94);
                        }
                        if (var66.field2527 == -1) {
                            class389.method2365(var66.field2543, 63);
                        }
                        continue;
                    }
                    if (var625 == 1113) {
                        var2--;
                        var66.field2471 = field6453[var2];
                        class184.method1314(var66, 79);
                        if (var66.field2527 == -1) {
                            class334.method2101(var66.field2543, (byte) 21);
                        }
                        continue;
                    }
                    if (var625 == 1114) {
                        var2 -= 3;
                        var66.field2529 = field6453[var2];
                        var66.field2467 = field6453[var2 + 1];
                        var66.field2544 = field6453[var2 + 2];
                        class184.method1314(var66, 115);
                        continue;
                    }
                    if (var625 == 1115) {
                        var2--;
                        var66.field2465 = field6453[var2] == 1;
                        class184.method1314(var66, 61);
                        continue;
                    }
                    if (var625 == 1116) {
                        var2--;
                        var66.field2584 = field6453[var2];
                        class184.method1314(var66, 94);
                        continue;
                    }
                    if (var625 == 1117) {
                        var2--;
                        var66.field2626 = field6453[var2];
                        class184.method1314(var66, 69);
                        continue;
                    }
                    if (var625 == 1118) {
                        var2--;
                        var66.field2600 = field6453[var2] == 1;
                        class184.method1314(var66, 99);
                        continue;
                    }
                    if (var625 == 1119) {
                        var2--;
                        var66.field2512 = field6453[var2] == 1;
                        class184.method1314(var66, 59);
                        continue;
                    }
                    if (var625 == 1120) {
                        var2 -= 2;
                        var66.field2499 = field6453[var2];
                        var66.field2506 = field6453[var2 + 1];
                        class184.method1314(var66, 125);
                        if (var66.field2602 == 0) {
                            class110.method877(var66, false, -1);
                        }
                        continue;
                    }
                    if (var625 == 1121) {
                        var2 -= 2;
                        var66.field2583 = (short) field6453[var2];
                        var66.field2489 = (short) field6453[var2 + 1];
                        class184.method1314(var66, 109);
                        continue;
                    }
                    if (var625 == 1122) {
                        var2--;
                        var66.field2605 = field6453[var2] == 1;
                        class184.method1314(var66, 100);
                        continue;
                    }
                    if (var625 == 1123) {
                        var2--;
                        var66.field2519 = field6453[var2];
                        class184.method1314(var66, 114);
                        if (var66.field2527 == -1) {
                            class313.method1991(var66.field2543, 34);
                        }
                        continue;
                    }
                    if (var625 == 1124) {
                        var2--;
                        int var70 = field6453[var2];
                        var66.field2540 = var70 == 1;
                        class184.method1314(var66, 94);
                        continue;
                    }
                    if (var625 == 1125) {
                        var2 -= 2;
                        var66.field2479 = field6453[var2];
                        var66.field2606 = field6453[var2 + 1];
                        class184.method1314(var66, 125);
                        continue;
                    }
                } else if (!(var625 < 1200 || var625 >= 1300) || !(var625 < 2200 || var625 >= 2300)) {
                    class172 var71;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var71 = class361.method2217(field6453[var2], -1060820048);
                    } else {
                        var71 = var37 ? field6460 : field6450;
                    }
                    class184.method1314(var71, 62);
                    if (var625 == 1200 || var625 == 1205 || var625 == 1208 || var625 == 1209 || var625 == 1212 || var625 == 1213) {
                        var2 -= 2;
                        int var72 = field6453[var2];
                        int var73 = field6453[var2 + 1];
                        if (var71.field2527 == -1) {
                            class291.method1908((byte) 108, var71.field2543);
                            class313.method1991(var71.field2543, 53);
                            class57.method524(777, var71.field2543);
                        }
                        if (var72 == -1) {
                            var71.field2488 = 1;
                            var71.field2551 = -1;
                            var71.field2483 = -1;
                            continue;
                        }
                        var71.field2483 = var72;
                        var71.field2608 = var73;
                        if (var625 == 1208 || var625 == 1209) {
                            var71.field2599 = true;
                        } else {
                            var71.field2599 = false;
                        }
                        class156 var74 = class373.field5128.method1644(var72, 113);
                        var71.field2578 = var74.field2182;
                        var71.field2556 = var74.field2169;
                        var71.field2491 = var74.field2227;
                        var71.field2596 = var74.field2172;
                        var71.field2581 = var74.field2210;
                        var71.field2519 = var74.field2185;
                        if (var625 == 1205 || var625 == 1209) {
                            var71.field2542 = 0;
                        } else if (var625 == 1212 || var625 == 1213) {
                            var71.field2542 = 1;
                        } else {
                            var71.field2542 = 2;
                        }
                        if (var71.field2521 > 0) {
                            var71.field2519 = var71.field2519 * 32 / var71.field2521;
                        } else if (var71.field2580 > 0) {
                            var71.field2519 = var71.field2519 * 32 / var71.field2580;
                        }
                        continue;
                    }
                    if (var625 == 1201) {
                        var71.field2488 = 2;
                        var2--;
                        var71.field2551 = field6453[var2];
                        if (var71.field2527 == -1) {
                            class102.method823(var71.field2543, (byte) 91);
                        }
                        continue;
                    }
                    if (var625 == 1202) {
                        var71.field2488 = 3;
                        var71.field2551 = -1;
                        if (var71.field2527 == -1) {
                            class102.method823(var71.field2543, (byte) 118);
                        }
                        continue;
                    }
                    if (var625 == 1203) {
                        var71.field2488 = 6;
                        var2--;
                        var71.field2551 = field6453[var2];
                        if (var71.field2527 == -1) {
                            class102.method823(var71.field2543, (byte) 99);
                        }
                        continue;
                    }
                    if (var625 == 1204) {
                        var71.field2488 = 5;
                        var2--;
                        var71.field2551 = field6453[var2];
                        if (var71.field2527 == -1) {
                            class102.method823(var71.field2543, (byte) 105);
                        }
                        continue;
                    }
                    if (var625 == 1206) {
                        var2 -= 4;
                        var71.field2617 = field6453[var2];
                        var71.field2576 = field6453[var2 + 1];
                        var71.field2484 = field6453[var2 + 2];
                        var71.field2562 = field6453[var2 + 3];
                        class184.method1314(var71, 69);
                        continue;
                    }
                    if (var625 == 1207) {
                        var2 -= 2;
                        var71.field2558 = field6453[var2];
                        var71.field2509 = field6453[var2 + 1];
                        class184.method1314(var71, 109);
                        continue;
                    }
                    if (var625 == 1210) {
                        var2 -= 4;
                        var71.field2551 = field6453[var2];
                        var71.field2492 = field6453[var2 + 1];
                        if (field6453[var2 + 2] == 1) {
                            var71.field2488 = 9;
                        } else {
                            var71.field2488 = 8;
                        }
                        if (field6453[var2 + 3] == 1) {
                            var71.field2599 = true;
                        } else {
                            var71.field2599 = false;
                        }
                        if (var71.field2527 == -1) {
                            class102.method823(var71.field2543, (byte) 81);
                        }
                        continue;
                    }
                    if (var625 == 1211) {
                        var71.field2488 = 5;
                        var71.field2551 = class168.field2432;
                        var71.field2492 = 0;
                        if (var71.field2527 == -1) {
                            class102.method823(var71.field2543, (byte) 95);
                        }
                        continue;
                    }
                } else if (var625 >= 1300 && var625 < 1400 || var625 >= 2300 && var625 < 2400) {
                    class172 var75;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var75 = class361.method2217(field6453[var2], -1060820048);
                    } else {
                        var75 = var37 ? field6460 : field6450;
                    }
                    if (var625 == 1300) {
                        var2--;
                        int var76 = field6453[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method1243(field6452[var3], var76, 1);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var625 == 1301) {
                        var2 -= 2;
                        int var77 = field6453[var2];
                        int var78 = field6453[var2 + 1];
                        var75.field2524 = class77.method678(var78, -34, var77);
                        continue;
                    }
                    if (var625 == 1302) {
                        var2--;
                        int var79 = field6453[var2];
                        if (class301.field4264 == var79 || class264.field3806 == var79 || class450.field6411 == var79) {
                            var75.field2586 = var79;
                        }
                        continue;
                    }
                    if (var625 == 1303) {
                        var2--;
                        var75.field2508 = field6453[var2];
                        continue;
                    }
                    if (var625 == 1304) {
                        var2--;
                        var75.field2497 = field6453[var2];
                        continue;
                    }
                    if (var625 == 1305) {
                        var3--;
                        var75.field2505 = field6452[var3];
                        continue;
                    }
                    if (var625 == 1306) {
                        var3--;
                        var75.field2561 = field6452[var3];
                        continue;
                    }
                    if (var625 == 1307) {
                        var75.field2546 = null;
                        continue;
                    }
                    if (var625 == 1308) {
                        var2--;
                        var75.field2501 = field6453[var2];
                        var2--;
                        var75.field2481 = field6453[var2];
                        continue;
                    }
                    if (var625 == 1309) {
                        var2--;
                        int var80 = field6453[var2];
                        var2--;
                        int var81 = field6453[var2];
                        if (var81 >= 1 && var81 <= 10) {
                            var75.method1241(127, var81 - 1, var80);
                        }
                        continue;
                    }
                    if (var625 == 1310) {
                        var3--;
                        var75.field2549 = field6452[var3];
                        continue;
                    }
                    if (var625 == 1311) {
                        var2--;
                        var75.field2566 = field6453[var2];
                        continue;
                    }
                } else {
                    if (var625 >= 1400 && var625 < 1500 || var625 >= 2400 && var625 < 2500) {
                        class172 var82;
                        if (var625 >= 2000) {
                            var625 -= 1000;
                            var2--;
                            var82 = class361.method2217(field6453[var2], -1060820048);
                        } else {
                            var82 = var37 ? field6460 : field6450;
                        }
                        var3--;
                        String var83 = field6452[var3];
                        int[] var84 = null;
                        if (var83.length() > 0 && var83.charAt(var83.length() - 1) == 'Y') {
                            var2--;
                            int var85 = field6453[var2];
                            if (var85 > 0) {
                                var84 = new int[var85];
                                while (var85-- > 0) {
                                    var2--;
                                    var84[var85] = field6453[var2];
                                }
                            }
                            var83 = var83.substring(0, var83.length() - 1);
                        }
                        Object[] var86 = new Object[var83.length() + 1];
                        for (int var87 = var86.length - 1; var87 >= 1; var87--) {
                            if (var83.charAt(var87 - 1) == 's') {
                                var3--;
                                var86[var87] = field6452[var3];
                            } else {
                                var2--;
                                var86[var87] = Integer.valueOf(field6453[var2]);
                            }
                        }
                        var2--;
                        int var88 = field6453[var2];
                        if (var88 == -1) {
                            var86 = null;
                        } else {
                            var86[0] = Integer.valueOf(var88);
                        }
                        if (var625 == 1400) {
                            var82.field2522 = var86;
                        } else if (var625 == 1401) {
                            var82.field2603 = var86;
                        } else if (var625 == 1402) {
                            var82.field2607 = var86;
                        } else if (var625 == 1403) {
                            var82.field2619 = var86;
                        } else if (var625 == 1404) {
                            var82.field2564 = var86;
                        } else if (var625 == 1405) {
                            var82.field2587 = var86;
                        } else if (var625 == 1406) {
                            var82.field2570 = var86;
                        } else if (var625 == 1407) {
                            var82.field2538 = var86;
                            var82.field2510 = var84;
                        } else if (var625 == 1408) {
                            var82.field2472 = var86;
                        } else if (var625 == 1409) {
                            var82.field2610 = var86;
                        } else if (var625 == 1410) {
                            var82.field2614 = var86;
                        } else if (var625 == 1411) {
                            var82.field2609 = var86;
                        } else if (var625 == 1412) {
                            var82.field2487 = var86;
                        } else if (var625 == 1414) {
                            var82.field2468 = var86;
                            var82.field2569 = var84;
                        } else if (var625 == 1415) {
                            var82.field2565 = var86;
                            var82.field2514 = var84;
                        } else if (var625 == 1416) {
                            var82.field2516 = var86;
                        } else if (var625 == 1417) {
                            var82.field2464 = var86;
                        } else if (var625 == 1418) {
                            var82.field2598 = var86;
                        } else if (var625 == 1419) {
                            var82.field2480 = var86;
                        } else if (var625 == 1420) {
                            var82.field2573 = var86;
                        } else if (var625 == 1421) {
                            var82.field2547 = var86;
                        } else if (var625 == 1422) {
                            var82.field2530 = var86;
                        } else if (var625 == 1423) {
                            var82.field2568 = var86;
                        } else if (var625 == 1424) {
                            var82.field2486 = var86;
                        } else if (var625 == 1425) {
                            var82.field2494 = var86;
                        } else if (var625 == 1426) {
                            var82.field2574 = var86;
                        } else if (var625 == 1427) {
                            var82.field2563 = var86;
                        } else if (var625 == 1428) {
                            var82.field2507 = var86;
                            var82.field2613 = var84;
                        } else if (var625 == 1429) {
                            var82.field2620 = var86;
                            var82.field2553 = var84;
                        }
                        var82.field2490 = true;
                        continue;
                    }
                    if (var625 < 1600) {
                        class172 var89 = var37 ? field6460 : field6450;
                        if (var625 == 1500) {
                            field6453[var2++] = var89.field2502;
                            continue;
                        }
                        if (var625 == 1501) {
                            field6453[var2++] = var89.field2466;
                            continue;
                        }
                        if (var625 == 1502) {
                            field6453[var2++] = var89.field2554;
                            continue;
                        }
                        if (var625 == 1503) {
                            field6453[var2++] = var89.field2579;
                            continue;
                        }
                        if (var625 == 1504) {
                            field6453[var2++] = var89.field2567 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 1505) {
                            field6453[var2++] = var89.field2532;
                            continue;
                        }
                    } else if (var625 < 1700) {
                        class172 var90 = var37 ? field6460 : field6450;
                        if (var625 == 1600) {
                            field6453[var2++] = var90.field2477;
                            continue;
                        }
                        if (var625 == 1601) {
                            field6453[var2++] = var90.field2518;
                            continue;
                        }
                        if (var625 == 1602) {
                            field6452[var3++] = var90.field2476;
                            continue;
                        }
                        if (var625 == 1603) {
                            field6453[var2++] = var90.field2499;
                            continue;
                        }
                        if (var625 == 1604) {
                            field6453[var2++] = var90.field2506;
                            continue;
                        }
                        if (var625 == 1605) {
                            field6453[var2++] = var90.field2519;
                            continue;
                        }
                        if (var625 == 1606) {
                            field6453[var2++] = var90.field2578;
                            continue;
                        }
                        if (var625 == 1607) {
                            field6453[var2++] = var90.field2491;
                            continue;
                        }
                        if (var625 == 1608) {
                            field6453[var2++] = var90.field2556;
                            continue;
                        }
                        if (var625 == 1609) {
                            field6453[var2++] = var90.field2531;
                            continue;
                        }
                        if (var625 == 1610) {
                            field6453[var2++] = var90.field2596;
                            continue;
                        }
                        if (var625 == 1611) {
                            field6453[var2++] = var90.field2581;
                            continue;
                        }
                        if (var625 == 1612) {
                            field6453[var2++] = var90.field2495;
                            continue;
                        }
                    } else if (var625 < 1800) {
                        class172 var91 = var37 ? field6460 : field6450;
                        if (var625 == 1700) {
                            field6453[var2++] = var91.field2483;
                            continue;
                        }
                        if (var625 == 1701) {
                            if (var91.field2483 == -1) {
                                field6453[var2++] = 0;
                            } else {
                                field6453[var2++] = var91.field2608;
                            }
                            continue;
                        }
                        if (var625 == 1702) {
                            field6453[var2++] = var91.field2527;
                            continue;
                        }
                    } else if (var625 < 1900) {
                        class172 var92 = var37 ? field6460 : field6450;
                        if (var625 == 1800) {
                            field6453[var2++] = client.method547(var92).method879(24468);
                            continue;
                        }
                        if (var625 == 1801) {
                            var2--;
                            int var93 = field6453[var2];
                            int var626 = var93 - 1;
                            if (var92.field2546 != null && var626 < var92.field2546.length && var92.field2546[var626] != null) {
                                field6452[var3++] = var92.field2546[var626];
                                continue;
                            }
                            field6452[var3++] = "";
                            continue;
                        }
                        if (var625 == 1802) {
                            if (var92.field2505 == null) {
                                field6452[var3++] = "";
                            } else {
                                field6452[var3++] = var92.field2505;
                            }
                            continue;
                        }
                    } else if (var625 < 2600) {
                        var2--;
                        class172 var94 = class361.method2217(field6453[var2], -1060820048);
                        if (var625 == 2500) {
                            field6453[var2++] = var94.field2502;
                            continue;
                        }
                        if (var625 == 2501) {
                            field6453[var2++] = var94.field2466;
                            continue;
                        }
                        if (var625 == 2502) {
                            field6453[var2++] = var94.field2554;
                            continue;
                        }
                        if (var625 == 2503) {
                            field6453[var2++] = var94.field2579;
                            continue;
                        }
                        if (var625 == 2504) {
                            field6453[var2++] = var94.field2567 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 2505) {
                            field6453[var2++] = var94.field2532;
                            continue;
                        }
                    } else if (var625 < 2700) {
                        var2--;
                        class172 var95 = class361.method2217(field6453[var2], -1060820048);
                        if (var625 == 2600) {
                            field6453[var2++] = var95.field2477;
                            continue;
                        }
                        if (var625 == 2601) {
                            field6453[var2++] = var95.field2518;
                            continue;
                        }
                        if (var625 == 2602) {
                            field6452[var3++] = var95.field2476;
                            continue;
                        }
                        if (var625 == 2603) {
                            field6453[var2++] = var95.field2499;
                            continue;
                        }
                        if (var625 == 2604) {
                            field6453[var2++] = var95.field2506;
                            continue;
                        }
                        if (var625 == 2605) {
                            field6453[var2++] = var95.field2519;
                            continue;
                        }
                        if (var625 == 2606) {
                            field6453[var2++] = var95.field2578;
                            continue;
                        }
                        if (var625 == 2607) {
                            field6453[var2++] = var95.field2491;
                            continue;
                        }
                        if (var625 == 2608) {
                            field6453[var2++] = var95.field2556;
                            continue;
                        }
                        if (var625 == 2609) {
                            field6453[var2++] = var95.field2531;
                            continue;
                        }
                        if (var625 == 2610) {
                            field6453[var2++] = var95.field2596;
                            continue;
                        }
                        if (var625 == 2611) {
                            field6453[var2++] = var95.field2581;
                            continue;
                        }
                        if (var625 == 2612) {
                            field6453[var2++] = var95.field2495;
                            continue;
                        }
                    } else if (var625 < 2800) {
                        if (var625 == 2700) {
                            var2--;
                            class172 var96 = class361.method2217(field6453[var2], -1060820048);
                            field6453[var2++] = var96.field2483;
                            continue;
                        }
                        if (var625 == 2701) {
                            var2--;
                            class172 var97 = class361.method2217(field6453[var2], -1060820048);
                            if (var97.field2483 == -1) {
                                field6453[var2++] = 0;
                            } else {
                                field6453[var2++] = var97.field2608;
                            }
                            continue;
                        }
                        if (var625 == 2702) {
                            var2--;
                            int var98 = field6453[var2];
                            class249 var99 = (class249) class310.field4399.method1104(-125, (long) var98);
                            if (var99 == null) {
                                field6453[var2++] = 0;
                            } else {
                                field6453[var2++] = 1;
                            }
                            continue;
                        }
                        if (var625 == 2703) {
                            var2--;
                            class172 var100 = class361.method2217(field6453[var2], -1060820048);
                            if (var100.field2541 == null) {
                                field6453[var2++] = 0;
                                continue;
                            }
                            int var101 = var100.field2541.length;
                            for (int var102 = 0; var102 < var100.field2541.length; var102++) {
                                if (var100.field2541[var102] == null) {
                                    var101 = var102;
                                    break;
                                }
                            }
                            field6453[var2++] = var101;
                            continue;
                        }
                        if (var625 == 2704 || var625 == 2705) {
                            var2 -= 2;
                            int var103 = field6453[var2];
                            int var104 = field6453[var2 + 1];
                            class249 var105 = (class249) class310.field4399.method1104(-128, (long) var103);
                            if (var105 != null && var105.field3593 == var104) {
                                field6453[var2++] = 1;
                                continue;
                            }
                            field6453[var2++] = 0;
                            continue;
                        }
                    } else if (var625 < 2900) {
                        var2--;
                        class172 var106 = class361.method2217(field6453[var2], -1060820048);
                        if (var625 == 2800) {
                            field6453[var2++] = client.method547(var106).method879(24468);
                            continue;
                        }
                        if (var625 == 2801) {
                            var2--;
                            int var107 = field6453[var2];
                            int var627 = var107 - 1;
                            if (var106.field2546 != null && var627 < var106.field2546.length && var106.field2546[var627] != null) {
                                field6452[var3++] = var106.field2546[var627];
                                continue;
                            }
                            field6452[var3++] = "";
                            continue;
                        }
                        if (var625 == 2802) {
                            if (var106.field2505 == null) {
                                field6452[var3++] = "";
                            } else {
                                field6452[var3++] = var106.field2505;
                            }
                            continue;
                        }
                    } else if (var625 < 3200) {
                        if (var625 == 3100) {
                            var3--;
                            String var108 = field6452[var3];
                            class316.method2006(115, var108);
                            continue;
                        }
                        if (var625 == 3101) {
                            var2 -= 2;
                            class436.method2664(field6453[var2], class262.field3781, (byte) 4, field6453[var2 + 1]);
                            continue;
                        }
                        if (var625 == 3103) {
                            class104.method837(119, true);
                            continue;
                        }
                        if (var625 == 3104) {
                            var3--;
                            String var109 = field6452[var3];
                            int var110 = 0;
                            if (class105.method839(108, var109)) {
                                var110 = class270.method1827(var109, false);
                            }
                            field6449++;
                            class336.method2111(class280.field4023, 95);
                            class311.field4403.method1177(var110, -46);
                            continue;
                        }
                        if (var625 == 3105) {
                            var3--;
                            String var111 = field6452[var3];
                            field6444++;
                            class336.method2111(class39.field520, 94);
                            class311.field4403.method1180((byte) -110, var111.length() + 1);
                            class311.field4403.method1184((byte) 106, var111);
                            continue;
                        }
                        if (var625 == 3106) {
                            var3--;
                            String var112 = field6452[var3];
                            field6454++;
                            class336.method2111(class76.field1133, 97);
                            class311.field4403.method1180((byte) -110, var112.length() + 1);
                            class311.field4403.method1184((byte) 117, var112);
                            continue;
                        }
                        if (var625 == 3107) {
                            var2--;
                            int var113 = field6453[var2];
                            var3--;
                            String var114 = field6452[var3];
                            class182.method1302(-578, var114, var113);
                            continue;
                        }
                        if (var625 == 3108) {
                            var2 -= 3;
                            int var115 = field6453[var2];
                            int var116 = field6453[var2 + 1];
                            int var117 = field6453[var2 + 2];
                            class172 var118 = class361.method2217(var117, -1060820048);
                            class13.method79(0, var118, var116, var115);
                            continue;
                        }
                        if (var625 == 3109) {
                            var2 -= 2;
                            int var119 = field6453[var2];
                            int var120 = field6453[var2 + 1];
                            class172 var121 = var37 ? field6460 : field6450;
                            class13.method79(0, var121, var120, var119);
                            continue;
                        }
                        if (var625 == 3110) {
                            var2--;
                            int var122 = field6453[var2];
                            field6443++;
                            class336.method2111(class126.field1715, 110);
                            class311.field4403.method1173(var122, (byte) 123);
                            continue;
                        }
                        if (var625 == 3111) {
                            var2 -= 2;
                            int var123 = field6453[var2];
                            int var124 = field6453[var2 + 1];
                            class249 var125 = (class249) class310.field4399.method1104(-127, (long) var123);
                            if (var125 != null) {
                                class365.method2240(var125, 9662, true, var125.field3593 != var124);
                            }
                            class477.method2826(var124, true, -741861886, 3, var123);
                            continue;
                        }
                        if (var625 == 3112) {
                            var2--;
                            int var126 = field6453[var2];
                            class249 var127 = (class249) class310.field4399.method1104(-128, (long) var126);
                            if (var127 != null && var127.field3591 == 3) {
                                class365.method2240(var127, 9662, true, true);
                            }
                            continue;
                        }
                    } else if (var625 < 3300) {
                        if (var625 == 3200) {
                            var2 -= 3;
                            class61.method555(field6453[var2], field6453[var2 + 2], -66, field6453[var2 + 1], 255);
                            continue;
                        }
                        if (var625 == 3201) {
                            var2--;
                            class164.method1211(-128, 255, field6453[var2]);
                            continue;
                        }
                        if (var625 == 3202) {
                            var2 -= 2;
                            class27.method184(false, field6453[var2 + 1], 255, field6453[var2]);
                            continue;
                        }
                    } else if (var625 < 3400) {
                        if (var625 == 3300) {
                            field6453[var2++] = class364.field5010;
                            continue;
                        }
                        if (var625 == 3301) {
                            var2 -= 2;
                            int var128 = field6453[var2];
                            int var129 = field6453[var2 + 1];
                            field6453[var2++] = class223.method1527(var129, false, 0, var128);
                            continue;
                        }
                        if (var625 == 3302) {
                            var2 -= 2;
                            int var130 = field6453[var2];
                            int var131 = field6453[var2 + 1];
                            field6453[var2++] = class416.method2488(var130, false, 1, var131);
                            continue;
                        }
                        if (var625 == 3303) {
                            var2 -= 2;
                            int var132 = field6453[var2];
                            int var133 = field6453[var2 + 1];
                            field6453[var2++] = class33.method203(var132, var133, 102, false);
                            continue;
                        }
                        if (var625 == 3304) {
                            var2--;
                            int var134 = field6453[var2];
                            field6453[var2++] = class95.field1341.method49((byte) 126, var134).field5454;
                            continue;
                        }
                        if (var625 == 3305) {
                            var2--;
                            int var135 = field6453[var2];
                            field6453[var2++] = class398.field5459[var135];
                            continue;
                        }
                        if (var625 == 3306) {
                            var2--;
                            int var136 = field6453[var2];
                            field6453[var2++] = class122.field1673[var136];
                            continue;
                        }
                        if (var625 == 3307) {
                            var2--;
                            int var137 = field6453[var2];
                            field6453[var2++] = class21.field226[var137];
                            continue;
                        }
                        if (var625 == 3308) {
                            byte var138 = class262.field3781.field4531;
                            int var139 = (class262.field3781.field4537 >> 7) + class279.field4012;
                            int var140 = (class262.field3781.field4530 >> 7) + class189.field2810;
                            field6453[var2++] = (var138 << 28) + (var139 << 14) + var140;
                            continue;
                        }
                        if (var625 == 3309) {
                            var2--;
                            int var141 = field6453[var2];
                            field6453[var2++] = var141 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var625 == 3310) {
                            var2--;
                            int var142 = field6453[var2];
                            field6453[var2++] = var142 >> 28;
                            continue;
                        }
                        if (var625 == 3311) {
                            var2--;
                            int var143 = field6453[var2];
                            field6453[var2++] = var143 & 0x3FFF;
                            continue;
                        }
                        if (var625 == 3312) {
                            field6453[var2++] = class205.field2999 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3313) {
                            var2 -= 2;
                            int var144 = field6453[var2];
                            int var145 = field6453[var2 + 1];
                            field6453[var2++] = class223.method1527(var145, true, 0, var144);
                            continue;
                        }
                        if (var625 == 3314) {
                            var2 -= 2;
                            int var146 = field6453[var2];
                            int var147 = field6453[var2 + 1];
                            field6453[var2++] = class416.method2488(var146, true, 1, var147);
                            continue;
                        }
                        if (var625 == 3315) {
                            var2 -= 2;
                            int var148 = field6453[var2];
                            int var149 = field6453[var2 + 1];
                            field6453[var2++] = class33.method203(var148, var149, -119, true);
                            continue;
                        }
                        if (var625 == 3316) {
                            if (class255.field3661 >= 2) {
                                field6453[var2++] = class255.field3661;
                            } else {
                                field6453[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 3317) {
                            field6453[var2++] = class89.field1270;
                            continue;
                        }
                        if (var625 == 3318) {
                            field6453[var2++] = class379.field5212;
                            continue;
                        }
                        if (var625 == 3321) {
                            field6453[var2++] = class289.field4107;
                            continue;
                        }
                        if (var625 == 3322) {
                            field6453[var2++] = class213.field3095;
                            continue;
                        }
                        if (var625 == 3323) {
                            if (class436.field6202 >= 5 && class436.field6202 <= 9) {
                                field6453[var2++] = 1;
                                continue;
                            }
                            field6453[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3324) {
                            if (class436.field6202 >= 5 && class436.field6202 <= 9) {
                                field6453[var2++] = class436.field6202;
                                continue;
                            }
                            field6453[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3325) {
                            field6453[var2++] = class339.field4690 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3326) {
                            field6453[var2++] = class262.field3781.field522;
                            continue;
                        }
                        if (var625 == 3327) {
                            field6453[var2++] = class262.field3781.field498.field5876 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3328) {
                            field6453[var2++] = class291.field4125 && !class178.field2709 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3329) {
                            field6453[var2++] = class184.field2782 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3330) {
                            var2--;
                            int var150 = field6453[var2];
                            field6453[var2++] = class412.method2465(var150, false, -2110192752);
                            continue;
                        }
                        if (var625 == 3331) {
                            var2 -= 2;
                            int var151 = field6453[var2];
                            int var152 = field6453[var2 + 1];
                            field6453[var2++] = class238.method1667(var152, false, false, 7442, var151);
                            continue;
                        }
                        if (var625 == 3332) {
                            var2 -= 2;
                            int var153 = field6453[var2];
                            int var154 = field6453[var2 + 1];
                            field6453[var2++] = class238.method1667(var154, true, false, 7442, var153);
                            continue;
                        }
                        if (var625 == 3333) {
                            field6453[var2++] = class289.field4103;
                            continue;
                        }
                        if (var625 == 3335) {
                            field6453[var2++] = class66.field967;
                            continue;
                        }
                        if (var625 == 3336) {
                            var2 -= 4;
                            int var155 = field6453[var2];
                            int var156 = field6453[var2 + 1];
                            int var157 = field6453[var2 + 2];
                            int var158 = field6453[var2 + 3];
                            int var159 = (var156 << 14) + var155;
                            int var160 = (var157 << 28) + var159;
                            int var161 = var158 + var160;
                            field6453[var2++] = var161;
                            continue;
                        }
                        if (var625 == 3337) {
                            field6453[var2++] = class96.field1351;
                            continue;
                        }
                        if (var625 == 3338) {
                            field6453[var2++] = class98.method808(52);
                            continue;
                        }
                    } else if (var625 < 3500) {
                        if (var625 == 3400) {
                            var2 -= 2;
                            int var162 = field6453[var2];
                            int var163 = field6453[var2 + 1];
                            class62 var164 = class108.field1519.method1315(var162, -103);
                            field6452[var3++] = var164.method562(true, var163);
                            continue;
                        }
                        if (var625 == 3408) {
                            var2 -= 4;
                            int var165 = field6453[var2];
                            int var166 = field6453[var2 + 1];
                            int var167 = field6453[var2 + 2];
                            int var168 = field6453[var2 + 3];
                            class62 var169 = class108.field1519.method1315(var167, -99);
                            if (var169.field896 == var165 && var169.field895 == var166) {
                                if (var166 == 115) {
                                    field6452[var3++] = var169.method562(true, var168);
                                } else {
                                    field6453[var2++] = var169.method571(-6, var168);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var625 == 3409) {
                            var2 -= 3;
                            int var170 = field6453[var2];
                            int var171 = field6453[var2 + 1];
                            int var172 = field6453[var2 + 2];
                            if (var171 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class62 var173 = class108.field1519.method1315(var171, -126);
                            if (var173.field895 != var170) {
                                throw new RuntimeException("C3409-1");
                            }
                            field6453[var2++] = var173.method565(10, var172) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3410) {
                            var2--;
                            int var174 = field6453[var2];
                            var3--;
                            String var175 = field6452[var3];
                            if (var174 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class62 var176 = class108.field1519.method1315(var174, -99);
                            if (var176.field895 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field6453[var2++] = var176.method560(true, var175) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3411) {
                            var2--;
                            int var177 = field6453[var2];
                            class62 var178 = class108.field1519.method1315(var177, -100);
                            field6453[var2++] = var178.field897.method1106(false);
                            continue;
                        }
                    } else if (var625 < 3700) {
                        if (var625 == 3600) {
                            if (class34.field372 == 0) {
                                field6453[var2++] = -2;
                            } else if (class34.field372 == 1) {
                                field6453[var2++] = -1;
                            } else {
                                field6453[var2++] = class349.field4807;
                            }
                            continue;
                        }
                        if (var625 == 3601) {
                            var2--;
                            int var179 = field6453[var2];
                            if (class34.field372 == 2 && var179 < class349.field4807) {
                                field6452[var3++] = class37.field446[var179];
                                if (class8.field54[var179] == null) {
                                    field6452[var3++] = "";
                                } else {
                                    field6452[var3++] = class8.field54[var179];
                                }
                                continue;
                            }
                            field6452[var3++] = "";
                            field6452[var3++] = "";
                            continue;
                        }
                        if (var625 == 3602) {
                            var2--;
                            int var180 = field6453[var2];
                            if (class34.field372 == 2 && var180 < class349.field4807) {
                                field6453[var2++] = class264.field3801[var180];
                                continue;
                            }
                            field6453[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3603) {
                            var2--;
                            int var181 = field6453[var2];
                            if (class34.field372 == 2 && var181 < class349.field4807) {
                                field6453[var2++] = class191.field2861[var181];
                                continue;
                            }
                            field6453[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3604) {
                            var3--;
                            String var182 = field6452[var3];
                            var2--;
                            int var183 = field6453[var2];
                            class232.method1631(var182, var183, (byte) -43);
                            continue;
                        }
                        if (var625 == 3605) {
                            var3--;
                            String var184 = field6452[var3];
                            class200.method1392(var184, true);
                            continue;
                        }
                        if (var625 == 3606) {
                            var3--;
                            String var185 = field6452[var3];
                            class202.method1403(var185, 1);
                            continue;
                        }
                        if (var625 == 3607) {
                            var3--;
                            String var186 = field6452[var3];
                            class73.method656(-110, var186, false);
                            continue;
                        }
                        if (var625 == 3608) {
                            var3--;
                            String var187 = field6452[var3];
                            class262.method1762(0, var187);
                            continue;
                        }
                        if (var625 == 3609) {
                            var3--;
                            String var188 = field6452[var3];
                            if (var188.startsWith("<img=0>") || var188.startsWith("<img=1>")) {
                                var188 = var188.substring(7);
                            }
                            field6453[var2++] = class99.method818(var188, 1575) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3610) {
                            var2--;
                            int var189 = field6453[var2];
                            if (class34.field372 == 2 && var189 < class349.field4807) {
                                field6452[var3++] = class243.field3532[var189];
                                continue;
                            }
                            field6452[var3++] = "";
                            continue;
                        }
                        if (var625 == 3611) {
                            if (class255.field3671 == null) {
                                field6452[var3++] = "";
                            } else {
                                field6452[var3++] = class372.method2274((byte) -86, class255.field3671);
                            }
                            continue;
                        }
                        if (var625 == 3612) {
                            if (class255.field3671 == null) {
                                field6453[var2++] = 0;
                            } else {
                                field6453[var2++] = class71.field1033;
                            }
                            continue;
                        }
                        if (var625 == 3613) {
                            var2--;
                            int var190 = field6453[var2];
                            if (class255.field3671 != null && var190 < class71.field1033) {
                                field6452[var3++] = class311.field4405[var190].field822;
                                continue;
                            }
                            field6452[var3++] = "";
                            continue;
                        }
                        if (var625 == 3614) {
                            var2--;
                            int var191 = field6453[var2];
                            if (class255.field3671 != null && var191 < class71.field1033) {
                                field6453[var2++] = class311.field4405[var191].field824;
                                continue;
                            }
                            field6453[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3615) {
                            var2--;
                            int var192 = field6453[var2];
                            if (class255.field3671 != null && var192 < class71.field1033) {
                                field6453[var2++] = class311.field4405[var192].field820;
                                continue;
                            }
                            field6453[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3616) {
                            field6453[var2++] = class223.field3225;
                            continue;
                        }
                        if (var625 == 3617) {
                            var3--;
                            String var193 = field6452[var3];
                            class368.method2256(var193, true);
                            continue;
                        }
                        if (var625 == 3618) {
                            field6453[var2++] = class205.field3006;
                            continue;
                        }
                        if (var625 == 3619) {
                            var3--;
                            String var194 = field6452[var3];
                            class264.method1785(var194, 86);
                            continue;
                        }
                        if (var625 == 3620) {
                            class464.method2768(-8003);
                            continue;
                        }
                        if (var625 == 3621) {
                            if (class34.field372 == 0) {
                                field6453[var2++] = -1;
                            } else {
                                field6453[var2++] = class222.field3201;
                            }
                            continue;
                        }
                        if (var625 == 3622) {
                            var2--;
                            int var195 = field6453[var2];
                            if (class34.field372 != 0 && var195 < class222.field3201) {
                                field6452[var3++] = class379.field5204[var195];
                                if (class276.field3985[var195] == null) {
                                    field6452[var3++] = "";
                                } else {
                                    field6452[var3++] = class276.field3985[var195];
                                }
                                continue;
                            }
                            field6452[var3++] = "";
                            field6452[var3++] = "";
                            continue;
                        }
                        if (var625 == 3623) {
                            var3--;
                            String var196 = field6452[var3];
                            if (var196.startsWith("<img=0>") || var196.startsWith("<img=1>")) {
                                var196 = var196.substring(7);
                            }
                            field6453[var2++] = class261.method1756(var196, 0) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3624) {
                            var2--;
                            int var197 = field6453[var2];
                            if (class311.field4405 != null && var197 < class71.field1033 && class311.field4405[var197].field819.equalsIgnoreCase(class262.field3781.field485)) {
                                field6453[var2++] = 1;
                                continue;
                            }
                            field6453[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3625) {
                            if (class422.field5851 == null) {
                                field6452[var3++] = "";
                            } else {
                                field6452[var3++] = class422.field5851;
                            }
                            continue;
                        }
                        if (var625 == 3626) {
                            var2--;
                            int var198 = field6453[var2];
                            if (class255.field3671 != null && var198 < class71.field1033) {
                                field6452[var3++] = class311.field4405[var198].field827;
                                continue;
                            }
                            field6452[var3++] = "";
                            continue;
                        }
                        if (var625 == 3627) {
                            var2--;
                            int var199 = field6453[var2];
                            if (class34.field372 == 2 && var199 >= 0 && var199 < class349.field4807) {
                                field6453[var2++] = class270.field3940[var199] ? 1 : 0;
                                continue;
                            }
                            field6453[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3628) {
                            var3--;
                            String var200 = field6452[var3];
                            if (var200.startsWith("<img=0>") || var200.startsWith("<img=1>")) {
                                var200 = var200.substring(7);
                            }
                            field6453[var2++] = class153.method1087((byte) -84, var200);
                            continue;
                        }
                        if (var625 == 3629) {
                            field6453[var2++] = class237.field3468;
                            continue;
                        }
                        if (var625 == 3630) {
                            var3--;
                            String var201 = field6452[var3];
                            class73.method656(-99, var201, true);
                            continue;
                        }
                        if (var625 == 3631) {
                            var2--;
                            int var202 = field6453[var2];
                            field6453[var2++] = class450.field6408[var202] ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3632) {
                            var2--;
                            int var203 = field6453[var2];
                            if (class255.field3671 != null && var203 < class71.field1033) {
                                field6452[var3++] = class311.field4405[var203].field819;
                                continue;
                            }
                            field6452[var3++] = "";
                            continue;
                        }
                        if (var625 == 3633) {
                            var2--;
                            int var204 = field6453[var2];
                            if (class34.field372 != 0 && var204 < class222.field3201) {
                                field6452[var3++] = class318.field4494[var204];
                                continue;
                            }
                            field6452[var3++] = "";
                            continue;
                        }
                    } else if (var625 < 4000) {
                        if (var625 == 3903) {
                            var2--;
                            int var205 = field6453[var2];
                            field6453[var2++] = class41.field554[var205].method788(8);
                            continue;
                        }
                        if (var625 == 3904) {
                            var2--;
                            int var206 = field6453[var2];
                            field6453[var2++] = class41.field554[var206].field1327;
                            continue;
                        }
                        if (var625 == 3905) {
                            var2--;
                            int var207 = field6453[var2];
                            field6453[var2++] = class41.field554[var207].field1331;
                            continue;
                        }
                        if (var625 == 3906) {
                            var2--;
                            int var208 = field6453[var2];
                            field6453[var2++] = class41.field554[var208].field1324;
                            continue;
                        }
                        if (var625 == 3907) {
                            var2--;
                            int var209 = field6453[var2];
                            field6453[var2++] = class41.field554[var209].field1320;
                            continue;
                        }
                        if (var625 == 3908) {
                            var2--;
                            int var210 = field6453[var2];
                            field6453[var2++] = class41.field554[var210].field1329;
                            continue;
                        }
                        if (var625 == 3910) {
                            var2--;
                            int var211 = field6453[var2];
                            int var212 = class41.field554[var211].method784(true);
                            field6453[var2++] = var212 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3911) {
                            var2--;
                            int var213 = field6453[var2];
                            int var214 = class41.field554[var213].method784(true);
                            field6453[var2++] = var214 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3912) {
                            var2--;
                            int var215 = field6453[var2];
                            int var216 = class41.field554[var215].method784(true);
                            field6453[var2++] = var216 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3913) {
                            var2--;
                            int var217 = field6453[var2];
                            int var218 = class41.field554[var217].method784(true);
                            field6453[var2++] = var218 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 4100) {
                        if (var625 == 4000) {
                            var2 -= 2;
                            int var219 = field6453[var2];
                            int var220 = field6453[var2 + 1];
                            field6453[var2++] = var219 + var220;
                            continue;
                        }
                        if (var625 == 4001) {
                            var2 -= 2;
                            int var221 = field6453[var2];
                            int var222 = field6453[var2 + 1];
                            field6453[var2++] = var221 - var222;
                            continue;
                        }
                        if (var625 == 4002) {
                            var2 -= 2;
                            int var223 = field6453[var2];
                            int var224 = field6453[var2 + 1];
                            field6453[var2++] = var223 * var224;
                            continue;
                        }
                        if (var625 == 4003) {
                            var2 -= 2;
                            int var225 = field6453[var2];
                            int var226 = field6453[var2 + 1];
                            field6453[var2++] = var225 / var226;
                            continue;
                        }
                        if (var625 == 4004) {
                            var2--;
                            int var227 = field6453[var2];
                            field6453[var2++] = (int) (Math.random() * (double) var227);
                            continue;
                        }
                        if (var625 == 4005) {
                            var2--;
                            int var228 = field6453[var2];
                            field6453[var2++] = (int) (Math.random() * (double) (var228 + 1));
                            continue;
                        }
                        if (var625 == 4006) {
                            var2 -= 5;
                            int var229 = field6453[var2];
                            int var230 = field6453[var2 + 1];
                            int var231 = field6453[var2 + 2];
                            int var232 = field6453[var2 + 3];
                            int var233 = field6453[var2 + 4];
                            field6453[var2++] = (var230 - var229) * (var233 - var231) / (var232 - var231) + var229;
                            continue;
                        }
                        if (var625 == 4007) {
                            var2 -= 2;
                            long var234 = (long) field6453[var2];
                            long var236 = (long) field6453[var2 + 1];
                            field6453[var2++] = (int) (var234 * var236 / 100L + var234);
                            continue;
                        }
                        if (var625 == 4008) {
                            var2 -= 2;
                            int var238 = field6453[var2];
                            int var239 = field6453[var2 + 1];
                            field6453[var2++] = var238 | 0x1 << var239;
                            continue;
                        }
                        if (var625 == 4009) {
                            var2 -= 2;
                            int var240 = field6453[var2];
                            int var241 = field6453[var2 + 1];
                            field6453[var2++] = var240 & -(0x1 << var241) - 1;
                            continue;
                        }
                        if (var625 == 4010) {
                            var2 -= 2;
                            int var242 = field6453[var2];
                            int var243 = field6453[var2 + 1];
                            field6453[var2++] = (var242 & 0x1 << var243) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var625 == 4011) {
                            var2 -= 2;
                            int var244 = field6453[var2];
                            int var245 = field6453[var2 + 1];
                            field6453[var2++] = var244 % var245;
                            continue;
                        }
                        if (var625 == 4012) {
                            var2 -= 2;
                            int var246 = field6453[var2];
                            int var247 = field6453[var2 + 1];
                            if (var246 == 0) {
                                field6453[var2++] = 0;
                            } else {
                                field6453[var2++] = (int) Math.pow((double) var246, (double) var247);
                            }
                            continue;
                        }
                        if (var625 == 4013) {
                            var2 -= 2;
                            int var248 = field6453[var2];
                            int var249 = field6453[var2 + 1];
                            if (var248 == 0) {
                                field6453[var2++] = 0;
                            } else if (var249 == 0) {
                                field6453[var2++] = Integer.MAX_VALUE;
                            } else {
                                field6453[var2++] = (int) Math.pow((double) var248, 1.0D / (double) var249);
                            }
                            continue;
                        }
                        if (var625 == 4014) {
                            var2 -= 2;
                            int var250 = field6453[var2];
                            int var251 = field6453[var2 + 1];
                            field6453[var2++] = var250 & var251;
                            continue;
                        }
                        if (var625 == 4015) {
                            var2 -= 2;
                            int var252 = field6453[var2];
                            int var253 = field6453[var2 + 1];
                            field6453[var2++] = var252 | var253;
                            continue;
                        }
                        if (var625 == 4016) {
                            var2 -= 2;
                            int var254 = field6453[var2];
                            int var255 = field6453[var2 + 1];
                            field6453[var2++] = var254 < var255 ? var254 : var255;
                            continue;
                        }
                        if (var625 == 4017) {
                            var2 -= 2;
                            int var256 = field6453[var2];
                            int var257 = field6453[var2 + 1];
                            field6453[var2++] = var256 > var257 ? var256 : var257;
                            continue;
                        }
                        if (var625 == 4018) {
                            var2 -= 3;
                            long var258 = (long) field6453[var2];
                            long var260 = (long) field6453[var2 + 1];
                            long var262 = (long) field6453[var2 + 2];
                            field6453[var2++] = (int) (var258 * var262 / var260);
                            continue;
                        }
                    } else if (var625 < 4200) {
                        if (var625 == 4100) {
                            var3--;
                            String var264 = field6452[var3];
                            var2--;
                            int var265 = field6453[var2];
                            field6452[var3++] = var264 + var265;
                            continue;
                        }
                        if (var625 == 4101) {
                            var3 -= 2;
                            String var266 = field6452[var3];
                            String var267 = field6452[var3 + 1];
                            field6452[var3++] = var266 + var267;
                            continue;
                        }
                        if (var625 == 4102) {
                            var3--;
                            String var268 = field6452[var3];
                            var2--;
                            int var269 = field6453[var2];
                            field6452[var3++] = var268 + class405.method2428(var269, (byte) -127, true);
                            continue;
                        }
                        if (var625 == 4103) {
                            var3--;
                            String var270 = field6452[var3];
                            field6452[var3++] = var270.toLowerCase();
                            continue;
                        }
                        if (var625 == 4104) {
                            var2--;
                            int var271 = field6453[var2];
                            long var272 = ((long) var271 + 11745L) * 86400000L;
                            field6446.setTime(new Date(var272));
                            int var274 = field6446.get(5);
                            int var275 = field6446.get(2);
                            int var276 = field6446.get(1);
                            field6452[var3++] = var274 + "-" + field6468[var275] + "-" + var276;
                            continue;
                        }
                        if (var625 == 4105) {
                            var3 -= 2;
                            String var277 = field6452[var3];
                            String var278 = field6452[var3 + 1];
                            if (class262.field3781.field498 != null && class262.field3781.field498.field5876) {
                                field6452[var3++] = var278;
                                continue;
                            }
                            field6452[var3++] = var277;
                            continue;
                        }
                        if (var625 == 4106) {
                            var2--;
                            int var279 = field6453[var2];
                            field6452[var3++] = Integer.toString(var279);
                            continue;
                        }
                        if (var625 == 4107) {
                            var3 -= 2;
                            field6453[var2++] = class448.method2712(field6452[var3 + 1], field6452[var3], class66.field967, (byte) 89);
                            continue;
                        }
                        if (var625 == 4108) {
                            var3--;
                            String var280 = field6452[var3];
                            var2 -= 2;
                            int var281 = field6453[var2];
                            int var282 = field6453[var2 + 1];
                            class194 var283 = class297.method1924(-7962, var282, class294.field4150, 0);
                            field6453[var2++] = var283.method1357(class307.field4353, (byte) 114, var280, var281);
                            continue;
                        }
                        if (var625 == 4109) {
                            var3--;
                            String var284 = field6452[var3];
                            var2 -= 2;
                            int var285 = field6453[var2];
                            int var286 = field6453[var2 + 1];
                            class194 var287 = class297.method1924(-7962, var286, class294.field4150, 0);
                            field6453[var2++] = var287.method1350(class307.field4353, var284, true, var285);
                            continue;
                        }
                        if (var625 == 4110) {
                            var3 -= 2;
                            String var288 = field6452[var3];
                            String var289 = field6452[var3 + 1];
                            var2--;
                            if (field6453[var2] == 1) {
                                field6452[var3++] = var288;
                            } else {
                                field6452[var3++] = var289;
                            }
                            continue;
                        }
                        if (var625 == 4111) {
                            var3--;
                            String var290 = field6452[var3];
                            field6452[var3++] = class264.method1787(-61, var290);
                            continue;
                        }
                        if (var625 == 4112) {
                            var3--;
                            String var291 = field6452[var3];
                            var2--;
                            int var292 = field6453[var2];
                            if (var292 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field6452[var3++] = var291 + (char) var292;
                            continue;
                        }
                        if (var625 == 4113) {
                            var2--;
                            int var293 = field6453[var2];
                            field6453[var2++] = class352.method2170((char) var293, 28728) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4114) {
                            var2--;
                            int var294 = field6453[var2];
                            field6453[var2++] = class227.method1547((byte) 69, (char) var294) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4115) {
                            var2--;
                            int var295 = field6453[var2];
                            field6453[var2++] = class317.method2013((byte) -62, (char) var295) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4116) {
                            var2--;
                            int var296 = field6453[var2];
                            field6453[var2++] = class467.method2780((char) var296, 48) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4117) {
                            var3--;
                            String var297 = field6452[var3];
                            if (var297 == null) {
                                field6453[var2++] = 0;
                            } else {
                                field6453[var2++] = var297.length();
                            }
                            continue;
                        }
                        if (var625 == 4118) {
                            var3--;
                            String var298 = field6452[var3];
                            var2 -= 2;
                            int var299 = field6453[var2];
                            int var300 = field6453[var2 + 1];
                            field6452[var3++] = var298.substring(var299, var300);
                            continue;
                        }
                        if (var625 == 4119) {
                            var3--;
                            String var301 = field6452[var3];
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
                            field6452[var3++] = var302.toString();
                            continue;
                        }
                        if (var625 == 4120) {
                            var3--;
                            String var306 = field6452[var3];
                            var2 -= 2;
                            int var307 = field6453[var2];
                            int var308 = field6453[var2 + 1];
                            field6453[var2++] = var306.indexOf(var307, var308);
                            continue;
                        }
                        if (var625 == 4121) {
                            var3 -= 2;
                            String var309 = field6452[var3];
                            String var310 = field6452[var3 + 1];
                            var2--;
                            int var311 = field6453[var2];
                            field6453[var2++] = var309.indexOf(var310, var311);
                            continue;
                        }
                        if (var625 == 4122) {
                            var2--;
                            int var312 = field6453[var2];
                            field6453[var2++] = Character.toLowerCase((char) var312);
                            continue;
                        }
                        if (var625 == 4123) {
                            var2--;
                            int var313 = field6453[var2];
                            field6453[var2++] = Character.toUpperCase((char) var313);
                            continue;
                        }
                        if (var625 == 4124) {
                            var2--;
                            boolean var314 = field6453[var2] != 0;
                            var2--;
                            int var315 = field6453[var2];
                            field6452[var3++] = class227.method1546(class66.field967, 0, 120, (long) var315, var314);
                            continue;
                        }
                        if (var625 == 4125) {
                            var3--;
                            String var316 = field6452[var3];
                            var2--;
                            int var317 = field6453[var2];
                            class194 var318 = class297.method1924(-7962, var317, class294.field4150, 0);
                            field6453[var2++] = var318.method1352(var316, class307.field4353, (byte) 71);
                            continue;
                        }
                    } else if (var625 < 4300) {
                        if (var625 == 4200) {
                            var2--;
                            int var319 = field6453[var2];
                            field6452[var3++] = class373.field5128.method1644(var319, 115).field2189;
                            continue;
                        }
                        if (var625 == 4201) {
                            var2 -= 2;
                            int var320 = field6453[var2];
                            int var321 = field6453[var2 + 1];
                            class156 var322 = class373.field5128.method1644(var320, 110);
                            if (var321 >= 1 && var321 <= 5 && var322.field2225[var321 - 1] != null) {
                                field6452[var3++] = var322.field2225[var321 - 1];
                                continue;
                            }
                            field6452[var3++] = "";
                            continue;
                        }
                        if (var625 == 4202) {
                            var2 -= 2;
                            int var323 = field6453[var2];
                            int var324 = field6453[var2 + 1];
                            class156 var325 = class373.field5128.method1644(var323, 106);
                            if (var324 >= 1 && var324 <= 5 && var325.field2229[var324 - 1] != null) {
                                field6452[var3++] = var325.field2229[var324 - 1];
                                continue;
                            }
                            field6452[var3++] = "";
                            continue;
                        }
                        if (var625 == 4203) {
                            var2--;
                            int var326 = field6453[var2];
                            field6453[var2++] = class373.field5128.method1644(var326, 98).field2226;
                            continue;
                        }
                        if (var625 == 4204) {
                            var2--;
                            int var327 = field6453[var2];
                            field6453[var2++] = class373.field5128.method1644(var327, 87).field2212 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4205) {
                            var2--;
                            int var328 = field6453[var2];
                            class156 var329 = class373.field5128.method1644(var328, 84);
                            if (var329.field2183 == -1 && var329.field2217 >= 0) {
                                field6453[var2++] = var329.field2217;
                                continue;
                            }
                            field6453[var2++] = var328;
                            continue;
                        }
                        if (var625 == 4206) {
                            var2--;
                            int var330 = field6453[var2];
                            class156 var331 = class373.field5128.method1644(var330, 122);
                            if (var331.field2183 >= 0 && var331.field2217 >= 0) {
                                field6453[var2++] = var331.field2217;
                                continue;
                            }
                            field6453[var2++] = var330;
                            continue;
                        }
                        if (var625 == 4207) {
                            var2--;
                            int var332 = field6453[var2];
                            field6453[var2++] = class373.field5128.method1644(var332, 106).field2177 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4208) {
                            var2 -= 2;
                            int var333 = field6453[var2];
                            int var334 = field6453[var2 + 1];
                            class129 var335 = class422.field5847.method1635(var334, false);
                            if (var335.method972(2087)) {
                                field6452[var3++] = class373.field5128.method1644(var333, 85).method1107(var334, (byte) -117, var335.field1767);
                            } else {
                                field6453[var2++] = class373.field5128.method1644(var333, 116).method1114(115, var335.field1765, var334);
                            }
                            continue;
                        }
                        if (var625 == 4209) {
                            var2 -= 2;
                            int var336 = field6453[var2];
                            int var337 = field6453[var2 + 1] - 1;
                            class156 var338 = class373.field5128.method1644(var336, 98);
                            if (var338.field2179 == var337) {
                                field6453[var2++] = var338.field2219;
                            } else if (var338.field2199 == var337) {
                                field6453[var2++] = var338.field2209;
                            } else {
                                field6453[var2++] = -1;
                            }
                            continue;
                        }
                        if (var625 == 4210) {
                            var3--;
                            String var339 = field6452[var3];
                            var2--;
                            int var340 = field6453[var2];
                            class53.method498(var340 == 1, var339, 0);
                            field6453[var2++] = class487.field6894;
                            continue;
                        }
                        if (var625 == 4211) {
                            if (class428.field5968 != null && class103.field1458 < class487.field6894) {
                                field6453[var2++] = class428.field5968[class103.field1458++] & 0xFFFF;
                                continue;
                            }
                            field6453[var2++] = -1;
                            continue;
                        }
                        if (var625 == 4212) {
                            class103.field1458 = 0;
                            continue;
                        }
                    } else if (var625 < 4400) {
                        if (var625 == 4300) {
                            var2 -= 2;
                            int var341 = field6453[var2];
                            int var342 = field6453[var2 + 1];
                            class129 var343 = class422.field5847.method1635(var342, false);
                            if (var343.method972(2087)) {
                                field6452[var3++] = class363.field5001.method1997(var341, 24749).method227(false, var343.field1767, var342);
                            } else {
                                field6453[var2++] = class363.field5001.method1997(var341, 24749).method228(var342, 0, var343.field1765);
                            }
                            continue;
                        }
                    } else if (var625 < 4500) {
                        if (var625 == 4400) {
                            var2 -= 2;
                            int var344 = field6453[var2];
                            int var345 = field6453[var2 + 1];
                            class129 var346 = class422.field5847.method1635(var345, false);
                            if (var346.method972(2087)) {
                                field6452[var3++] = class468.field6599.method506(-125, var344).method1806(var345, 0, var346.field1767);
                            } else {
                                field6453[var2++] = class468.field6599.method506(-119, var344).method1808((byte) -52, var345, var346.field1765);
                            }
                            continue;
                        }
                    } else if (var625 < 4600) {
                        if (var625 == 4500) {
                            var2 -= 2;
                            int var347 = field6453[var2];
                            int var348 = field6453[var2 + 1];
                            class129 var349 = class422.field5847.method1635(var348, false);
                            if (var349.method972(2087)) {
                                field6452[var3++] = class407.field5577.method181(var347, 256).method1268(-15941, var348, var349.field1767);
                            } else {
                                field6453[var2++] = class407.field5577.method181(var347, 256).method1269((byte) -97, var348, var349.field1765);
                            }
                            continue;
                        }
                    } else if (var625 < 4700) {
                        if (var625 == 4600) {
                            var2--;
                            int var350 = field6453[var2];
                            class389 var351 = class382.field5247.method1773(var350, -24562);
                            if (var351.field5362 != null && var351.field5362.length > 0) {
                                int var352 = 0;
                                int var353 = var351.field5370[0];
                                for (int var354 = 1; var354 < var351.field5362.length; var354++) {
                                    if (var351.field5370[var354] > var353) {
                                        var352 = var354;
                                        var353 = var351.field5370[var354];
                                    }
                                }
                                field6453[var2++] = var351.field5362[var352];
                                continue;
                            }
                            field6453[var2++] = var351.field5349;
                            continue;
                        }
                    } else if (var625 < 5100) {
                        if (var625 == 5000) {
                            field6453[var2++] = class411.field5627;
                            continue;
                        }
                        if (var625 == 5001) {
                            var2 -= 3;
                            class411.field5627 = field6453[var2];
                            class127.field1737 = field6453[var2 + 1];
                            class139.field1930 = field6453[var2 + 2];
                            field6461++;
                            class336.method2111(class370.field5099, 108);
                            class311.field4403.method1180((byte) -110, class411.field5627);
                            class311.field4403.method1180((byte) -110, class127.field1737);
                            class311.field4403.method1180((byte) -110, class139.field1930);
                            continue;
                        }
                        if (var625 == 5002) {
                            var3 -= 2;
                            String var355 = field6452[var3];
                            String var356 = field6452[var3 + 1];
                            var2 -= 2;
                            int var357 = field6453[var2];
                            int var358 = field6453[var2 + 1];
                            if (var356 == null) {
                                var356 = "";
                            }
                            if (var356.length() > 80) {
                                var356 = var356.substring(0, 80);
                            }
                            field6455++;
                            class336.method2111(class386.field5302, 108);
                            class311.field4403.method1180((byte) -110, class345.method2147(var355, (byte) 110) + class345.method2147(var356, (byte) 110) + 2);
                            class311.field4403.method1184((byte) -112, var355);
                            class311.field4403.method1180((byte) -110, var357 - 1);
                            class311.field4403.method1180((byte) -110, var358);
                            class311.field4403.method1184((byte) -75, var356);
                            continue;
                        }
                        if (var625 == 5003) {
                            var2--;
                            int var359 = field6453[var2];
                            String var360 = null;
                            if (var359 < 100) {
                                var360 = class290.field4118[var359];
                            }
                            if (var360 == null) {
                                var360 = "";
                            }
                            field6452[var3++] = var360;
                            continue;
                        }
                        if (var625 == 5004) {
                            var2--;
                            int var361 = field6453[var2];
                            int var362 = -1;
                            if (var361 < 100 && class290.field4118[var361] != null) {
                                var362 = class217.field3135[var361];
                            }
                            field6453[var2++] = var362;
                            continue;
                        }
                        if (var625 == 5005) {
                            field6453[var2++] = class127.field1737;
                            continue;
                        }
                        if (var625 == 5008) {
                            var3--;
                            String var363 = field6452[var3];
                            if (class255.field3661 == 0 && (class291.field4125 && !class178.field2709 || class184.field2782)) {
                                continue;
                            }
                            String var364 = var363.toLowerCase();
                            byte var365 = 0;
                            if (var364.startsWith(class26.field270.method1078(0, 100))) {
                                var365 = 0;
                                var363 = var363.substring(class26.field270.method1078(0, 100).length());
                            } else if (var364.startsWith(class166.field2413.method1078(0, 100))) {
                                var365 = 1;
                                var363 = var363.substring(class166.field2413.method1078(0, 100).length());
                            } else if (var364.startsWith(class262.field3779.method1078(0, 100))) {
                                var365 = 2;
                                var363 = var363.substring(class262.field3779.method1078(0, 100).length());
                            } else if (var364.startsWith(class112.field1573.method1078(0, 100))) {
                                var365 = 3;
                                var363 = var363.substring(class112.field1573.method1078(0, 100).length());
                            } else if (var364.startsWith(class369.field5082.method1078(0, 100))) {
                                var365 = 4;
                                var363 = var363.substring(class369.field5082.method1078(0, 100).length());
                            } else if (var364.startsWith(class51.field745.method1078(0, 100))) {
                                var365 = 5;
                                var363 = var363.substring(class51.field745.method1078(0, 100).length());
                            } else if (var364.startsWith(class454.field6435.method1078(0, 100))) {
                                var365 = 6;
                                var363 = var363.substring(class454.field6435.method1078(0, 100).length());
                            } else if (var364.startsWith(class172.field2612.method1078(0, 100))) {
                                var365 = 7;
                                var363 = var363.substring(class172.field2612.method1078(0, 100).length());
                            } else if (var364.startsWith(class129.field1770.method1078(0, 100))) {
                                var365 = 8;
                                var363 = var363.substring(class129.field1770.method1078(0, 100).length());
                            } else if (var364.startsWith(class423.field5853.method1078(0, 100))) {
                                var365 = 9;
                                var363 = var363.substring(class423.field5853.method1078(0, 100).length());
                            } else if (var364.startsWith(class102.field1434.method1078(0, 100))) {
                                var365 = 10;
                                var363 = var363.substring(class102.field1434.method1078(0, 100).length());
                            } else if (var364.startsWith(class20.field212.method1078(0, 100))) {
                                var365 = 11;
                                var363 = var363.substring(class20.field212.method1078(0, 100).length());
                            } else if (class66.field967 != 0) {
                                if (var364.startsWith(class26.field270.method1078(class66.field967, 100))) {
                                    var365 = 0;
                                    var363 = var363.substring(class26.field270.method1078(class66.field967, 100).length());
                                } else if (var364.startsWith(class166.field2413.method1078(class66.field967, 100))) {
                                    var365 = 1;
                                    var363 = var363.substring(class166.field2413.method1078(class66.field967, 100).length());
                                } else if (var364.startsWith(class262.field3779.method1078(class66.field967, 100))) {
                                    var365 = 2;
                                    var363 = var363.substring(class262.field3779.method1078(class66.field967, 100).length());
                                } else if (var364.startsWith(class112.field1573.method1078(class66.field967, 100))) {
                                    var365 = 3;
                                    var363 = var363.substring(class112.field1573.method1078(class66.field967, 100).length());
                                } else if (var364.startsWith(class369.field5082.method1078(class66.field967, 100))) {
                                    var365 = 4;
                                    var363 = var363.substring(class369.field5082.method1078(class66.field967, 100).length());
                                } else if (var364.startsWith(class51.field745.method1078(class66.field967, 100))) {
                                    var365 = 5;
                                    var363 = var363.substring(class51.field745.method1078(class66.field967, 100).length());
                                } else if (var364.startsWith(class454.field6435.method1078(class66.field967, 100))) {
                                    var365 = 6;
                                    var363 = var363.substring(class454.field6435.method1078(class66.field967, 100).length());
                                } else if (var364.startsWith(class172.field2612.method1078(class66.field967, 100))) {
                                    var365 = 7;
                                    var363 = var363.substring(class172.field2612.method1078(class66.field967, 100).length());
                                } else if (var364.startsWith(class129.field1770.method1078(class66.field967, 100))) {
                                    var365 = 8;
                                    var363 = var363.substring(class129.field1770.method1078(class66.field967, 100).length());
                                } else if (var364.startsWith(class423.field5853.method1078(class66.field967, 100))) {
                                    var365 = 9;
                                    var363 = var363.substring(class423.field5853.method1078(class66.field967, 100).length());
                                } else if (var364.startsWith(class102.field1434.method1078(class66.field967, 100))) {
                                    var365 = 10;
                                    var363 = var363.substring(class102.field1434.method1078(class66.field967, 100).length());
                                } else if (var364.startsWith(class20.field212.method1078(class66.field967, 100))) {
                                    var365 = 11;
                                    var363 = var363.substring(class20.field212.method1078(class66.field967, 100).length());
                                }
                            }
                            String var366 = var363.toLowerCase();
                            byte var367 = 0;
                            if (var366.startsWith(class243.field3525.method1078(0, 100))) {
                                var367 = 1;
                                var363 = var363.substring(class243.field3525.method1078(0, 100).length());
                            } else if (var366.startsWith(class166.field2411.method1078(0, 100))) {
                                var367 = 2;
                                var363 = var363.substring(class166.field2411.method1078(0, 100).length());
                            } else if (var366.startsWith(class254.field3643.method1078(0, 100))) {
                                var367 = 3;
                                var363 = var363.substring(class254.field3643.method1078(0, 100).length());
                            } else if (var366.startsWith(class88.field1238.method1078(0, 100))) {
                                var367 = 4;
                                var363 = var363.substring(class88.field1238.method1078(0, 100).length());
                            } else if (var366.startsWith(class312.field4416.method1078(0, 100))) {
                                var367 = 5;
                                var363 = var363.substring(class312.field4416.method1078(0, 100).length());
                            } else if (class66.field967 != 0) {
                                if (var366.startsWith(class243.field3525.method1078(class66.field967, 100))) {
                                    var367 = 1;
                                    var363 = var363.substring(class243.field3525.method1078(class66.field967, 100).length());
                                } else if (var366.startsWith(class166.field2411.method1078(class66.field967, 100))) {
                                    var367 = 2;
                                    var363 = var363.substring(class166.field2411.method1078(class66.field967, 100).length());
                                } else if (var366.startsWith(class254.field3643.method1078(class66.field967, 100))) {
                                    var367 = 3;
                                    var363 = var363.substring(class254.field3643.method1078(class66.field967, 100).length());
                                } else if (var366.startsWith(class88.field1238.method1078(class66.field967, 100))) {
                                    var367 = 4;
                                    var363 = var363.substring(class88.field1238.method1078(class66.field967, 100).length());
                                } else if (var366.startsWith(class312.field4416.method1078(class66.field967, 100))) {
                                    var367 = 5;
                                    var363 = var363.substring(class312.field4416.method1078(class66.field967, 100).length());
                                }
                            }
                            field6464++;
                            class336.method2111(class260.field3719, 94);
                            class311.field4403.method1180((byte) -110, 0);
                            int var368 = class311.field4403.field2298;
                            class311.field4403.method1180((byte) -110, var365);
                            class311.field4403.method1180((byte) -110, var367);
                            class96.method798(var363, class311.field4403, 15);
                            class311.field4403.method1138(class311.field4403.field2298 - var368, 1);
                            continue;
                        }
                        if (var625 == 5009) {
                            var3 -= 2;
                            String var369 = field6452[var3];
                            String var370 = field6452[var3 + 1];
                            if (class255.field3661 != 0 || (!class291.field4125 || class178.field2709) && !class184.field2782) {
                                field6456++;
                                class336.method2111(class390.field5387, 104);
                                class311.field4403.method1180((byte) -110, 0);
                                int var371 = class311.field4403.field2298;
                                class311.field4403.method1184((byte) 73, var369);
                                class96.method798(var370, class311.field4403, 15);
                                class311.field4403.method1138(class311.field4403.field2298 - var371, 1);
                            }
                            continue;
                        }
                        if (var625 == 5010) {
                            var2--;
                            int var372 = field6453[var2];
                            String var373 = null;
                            if (var372 < 100) {
                                var373 = class151.field2081[var372];
                            }
                            if (var373 == null) {
                                var373 = "";
                            }
                            field6452[var3++] = var373;
                            continue;
                        }
                        if (var625 == 5011) {
                            var2--;
                            int var374 = field6453[var2];
                            String var375 = null;
                            if (var374 < 100) {
                                var375 = class416.field5726[var374];
                            }
                            if (var375 == null) {
                                var375 = "";
                            }
                            field6452[var3++] = var375;
                            continue;
                        }
                        if (var625 == 5012) {
                            var2--;
                            int var376 = field6453[var2];
                            int var377 = -1;
                            if (var376 < 100) {
                                var377 = class416.field5707[var376];
                            }
                            field6453[var2++] = var377;
                            continue;
                        }
                        if (var625 == 5015) {
                            String var378;
                            if (class262.field3781 == null || class262.field3781.field514 == null) {
                                var378 = class273.field3963;
                            } else {
                                var378 = class262.field3781.method250(true, 4675);
                            }
                            field6452[var3++] = var378;
                            continue;
                        }
                        if (var625 == 5016) {
                            field6453[var2++] = class139.field1930;
                            continue;
                        }
                        if (var625 == 5017) {
                            field6453[var2++] = class486.field6889;
                            continue;
                        }
                        if (var625 == 5018) {
                            var2--;
                            int var379 = field6453[var2];
                            int var380 = 0;
                            if (var379 < 100 && class290.field4118[var379] != null) {
                                var380 = class217.field3135[var379];
                            }
                            field6453[var2++] = var380;
                            continue;
                        }
                        if (var625 == 5019) {
                            var2--;
                            int var381 = field6453[var2];
                            String var382 = null;
                            if (var381 < 100) {
                                var382 = class372.field5125[var381];
                            }
                            if (var382 == null) {
                                var382 = "";
                            }
                            field6452[var3++] = var382;
                            continue;
                        }
                        if (var625 == 5020) {
                            String var383;
                            if (class262.field3781 == null || class262.field3781.field514 == null) {
                                var383 = class273.field3963;
                            } else {
                                var383 = class262.field3781.method246(false, (byte) -27);
                            }
                            field6452[var3++] = var383;
                            continue;
                        }
                        if (var625 == 5050) {
                            var2--;
                            int var384 = field6453[var2];
                            field6452[var3++] = class66.method623(var384, 32767).field6750;
                            continue;
                        }
                        if (var625 == 5051) {
                            var2--;
                            int var385 = field6453[var2];
                            class476 var386 = class66.method623(var385, 32767);
                            if (var386.field6754 == null) {
                                field6453[var2++] = 0;
                            } else {
                                field6453[var2++] = var386.field6754.length;
                            }
                            continue;
                        }
                        if (var625 == 5052) {
                            var2 -= 2;
                            int var387 = field6453[var2];
                            int var388 = field6453[var2 + 1];
                            class476 var389 = class66.method623(var387, 32767);
                            int var390 = var389.field6754[var388];
                            field6453[var2++] = var390;
                            continue;
                        }
                        if (var625 == 5053) {
                            var2--;
                            int var391 = field6453[var2];
                            class476 var392 = class66.method623(var391, 32767);
                            if (var392.field6756 == null) {
                                field6453[var2++] = 0;
                            } else {
                                field6453[var2++] = var392.field6756.length;
                            }
                            continue;
                        }
                        if (var625 == 5054) {
                            var2 -= 2;
                            int var393 = field6453[var2];
                            int var394 = field6453[var2 + 1];
                            field6453[var2++] = class66.method623(var393, 32767).field6756[var394];
                            continue;
                        }
                        if (var625 == 5055) {
                            var2--;
                            int var395 = field6453[var2];
                            field6452[var3++] = class172.method1244(32767, var395).method2340((byte) -109);
                            continue;
                        }
                        if (var625 == 5056) {
                            var2--;
                            int var396 = field6453[var2];
                            class384 var397 = class172.method1244(32767, var396);
                            if (var397.field5262 == null) {
                                field6453[var2++] = 0;
                            } else {
                                field6453[var2++] = var397.field5262.length;
                            }
                            continue;
                        }
                        if (var625 == 5057) {
                            var2 -= 2;
                            int var398 = field6453[var2];
                            int var399 = field6453[var2 + 1];
                            field6453[var2++] = class172.method1244(32767, var398).field5262[var399];
                            continue;
                        }
                        if (var625 == 5058) {
                            field6448 = new class385();
                            var2--;
                            field6448.field5278 = field6453[var2];
                            field6448.field5279 = class172.method1244(32767, field6448.field5278);
                            field6448.field5276 = new int[field6448.field5279.method2338(-31)];
                            continue;
                        }
                        if (var625 == 5059) {
                            field6462++;
                            class336.method2111(class386.field5300, 122);
                            class311.field4403.method1180((byte) -110, 0);
                            int var400 = class311.field4403.field2298;
                            class311.field4403.method1180((byte) -110, 0);
                            class311.field4403.method1173(field6448.field5278, (byte) 116);
                            field6448.field5279.method2341((byte) 114, field6448.field5276, class311.field4403);
                            class311.field4403.method1138(class311.field4403.field2298 - var400, 1);
                            continue;
                        }
                        if (var625 == 5060) {
                            var3--;
                            String var401 = field6452[var3];
                            field6445++;
                            class336.method2111(class168.field2435, 118);
                            class311.field4403.method1180((byte) -110, 0);
                            int var402 = class311.field4403.field2298;
                            class311.field4403.method1184((byte) 60, var401);
                            class311.field4403.method1173(field6448.field5278, (byte) 119);
                            field6448.field5279.method2341((byte) 127, field6448.field5276, class311.field4403);
                            class311.field4403.method1138(class311.field4403.field2298 - var402, 1);
                            continue;
                        }
                        if (var625 == 5061) {
                            field6462++;
                            class336.method2111(class386.field5300, 99);
                            class311.field4403.method1180((byte) -110, 0);
                            int var403 = class311.field4403.field2298;
                            class311.field4403.method1180((byte) -110, 1);
                            class311.field4403.method1173(field6448.field5278, (byte) 119);
                            field6448.field5279.method2341((byte) 20, field6448.field5276, class311.field4403);
                            class311.field4403.method1138(class311.field4403.field2298 - var403, 1);
                            continue;
                        }
                        if (var625 == 5062) {
                            var2 -= 2;
                            int var404 = field6453[var2];
                            int var405 = field6453[var2 + 1];
                            field6453[var2++] = class66.method623(var404, 32767).field6745[var405];
                            continue;
                        }
                        if (var625 == 5063) {
                            var2 -= 2;
                            int var406 = field6453[var2];
                            int var407 = field6453[var2 + 1];
                            field6453[var2++] = class66.method623(var406, 32767).field6751[var407];
                            continue;
                        }
                        if (var625 == 5064) {
                            var2 -= 2;
                            int var408 = field6453[var2];
                            int var409 = field6453[var2 + 1];
                            if (var409 == -1) {
                                field6453[var2++] = -1;
                            } else {
                                field6453[var2++] = class66.method623(var408, 32767).method2820(21949, (char) var409);
                            }
                            continue;
                        }
                        if (var625 == 5065) {
                            var2 -= 2;
                            int var410 = field6453[var2];
                            int var411 = field6453[var2 + 1];
                            if (var411 == -1) {
                                field6453[var2++] = -1;
                            } else {
                                field6453[var2++] = class66.method623(var410, 32767).method2816((char) var411, -1);
                            }
                            continue;
                        }
                        if (var625 == 5066) {
                            var2--;
                            int var412 = field6453[var2];
                            field6453[var2++] = class172.method1244(32767, var412).method2338(123);
                            continue;
                        }
                        if (var625 == 5067) {
                            var2 -= 2;
                            int var413 = field6453[var2];
                            int var414 = field6453[var2 + 1];
                            int var415 = class172.method1244(32767, var413).method2343(105, var414);
                            field6453[var2++] = var415;
                            continue;
                        }
                        if (var625 == 5068) {
                            var2 -= 2;
                            int var416 = field6453[var2];
                            int var417 = field6453[var2 + 1];
                            field6448.field5276[var416] = var417;
                            continue;
                        }
                        if (var625 == 5069) {
                            var2 -= 2;
                            int var418 = field6453[var2];
                            int var419 = field6453[var2 + 1];
                            field6448.field5276[var418] = var419;
                            continue;
                        }
                        if (var625 == 5070) {
                            var2 -= 3;
                            int var420 = field6453[var2];
                            int var421 = field6453[var2 + 1];
                            int var422 = field6453[var2 + 2];
                            class384 var423 = class172.method1244(32767, var420);
                            if (var423.method2343(126, var421) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field6453[var2++] = var423.method2337(var422, (byte) 89, var421);
                            continue;
                        }
                        if (var625 == 5071) {
                            var3--;
                            String var424 = field6452[var3];
                            var2--;
                            boolean var425 = field6453[var2] == 1;
                            class212.method1440(var424, 16, var425);
                            field6453[var2++] = class487.field6894;
                            continue;
                        }
                        if (var625 == 5072) {
                            if (class428.field5968 != null && class103.field1458 < class487.field6894) {
                                field6453[var2++] = class428.field5968[class103.field1458++] & 0xFFFF;
                                continue;
                            }
                            field6453[var2++] = -1;
                            continue;
                        }
                        if (var625 == 5073) {
                            class103.field1458 = 0;
                            continue;
                        }
                    } else if (var625 < 5200) {
                        if (var625 == 5100) {
                            if (class162.field2363.method1820((byte) -96, 86)) {
                                field6453[var2++] = 1;
                            } else {
                                field6453[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 5101) {
                            if (class162.field2363.method1820((byte) -96, 82)) {
                                field6453[var2++] = 1;
                            } else {
                                field6453[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 5102) {
                            if (class162.field2363.method1820((byte) -96, 81)) {
                                field6453[var2++] = 1;
                            } else {
                                field6453[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var625 < 5300) {
                        if (var625 == 5200) {
                            var2--;
                            class209.method1428(field6453[var2], false);
                            continue;
                        }
                        if (var625 == 5201) {
                            field6453[var2++] = class292.method1910(100);
                            continue;
                        }
                        if (var625 == 5205) {
                            var2--;
                            class434.method2623(-1, field6453[var2], (byte) -126, false, -1);
                            continue;
                        }
                        if (var625 == 5206) {
                            var2--;
                            int var426 = field6453[var2];
                            class67 var427 = class330.method2081(var426 >> 14 & 0x3FFF, var426 & 0x3FFF);
                            if (var427 == null) {
                                field6453[var2++] = -1;
                            } else {
                                field6453[var2++] = var427.field968;
                            }
                            continue;
                        }
                        if (var625 == 5207) {
                            var2--;
                            class67 var428 = class330.method2073(field6453[var2]);
                            if (var428 != null && var428.field971 != null) {
                                field6452[var3++] = var428.field971;
                                continue;
                            }
                            field6452[var3++] = "";
                            continue;
                        }
                        if (var625 == 5208) {
                            field6453[var2++] = class486.field6874;
                            field6453[var2++] = class480.field6801;
                            continue;
                        }
                        if (var625 == 5209) {
                            field6453[var2++] = class330.field4596 + class309.field4388;
                            field6453[var2++] = class330.field4602 + class25.field267;
                            continue;
                        }
                        if (var625 == 5210) {
                            var2--;
                            int var429 = field6453[var2];
                            class67 var430 = class330.method2073(var429);
                            if (var430 == null) {
                                field6453[var2++] = 0;
                                field6453[var2++] = 0;
                            } else {
                                field6453[var2++] = var430.field992 >> 14 & 0x3FFF;
                                field6453[var2++] = var430.field992 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var625 == 5211) {
                            var2--;
                            int var431 = field6453[var2];
                            class67 var432 = class330.method2073(var431);
                            if (var432 == null) {
                                field6453[var2++] = 0;
                                field6453[var2++] = 0;
                            } else {
                                field6453[var2++] = var432.field976 - var432.field991;
                                field6453[var2++] = var432.field980 - var432.field982;
                            }
                            continue;
                        }
                        if (var625 == 5212) {
                            class266 var433 = class143.method1031(-16881);
                            if (var433 == null) {
                                field6453[var2++] = -1;
                                field6453[var2++] = -1;
                            } else {
                                field6453[var2++] = var433.field3826;
                                int var434 = var433.field3832 << 28 | class330.field4596 + var433.field3825 << 14 | class330.field4602 + var433.field3828;
                                field6453[var2++] = var434;
                            }
                            continue;
                        }
                        if (var625 == 5213) {
                            class266 var435 = class464.method2773(0);
                            if (var435 == null) {
                                field6453[var2++] = -1;
                                field6453[var2++] = -1;
                            } else {
                                field6453[var2++] = var435.field3826;
                                int var436 = var435.field3832 << 28 | class330.field4596 + var435.field3825 << 14 | class330.field4602 + var435.field3828;
                                field6453[var2++] = var436;
                            }
                            continue;
                        }
                        if (var625 == 5214) {
                            var2--;
                            int var437 = field6453[var2];
                            class67 var438 = class218.method1500(-28935);
                            if (var438 != null) {
                                boolean var439 = var438.method628(-19313, var437 & 0x3FFF, var437 >> 28 & 0x3, var437 >> 14 & 0x3FFF, field6466);
                                if (var439) {
                                    class473.method2803(field6466[2], field6466[1], 120);
                                }
                            }
                            continue;
                        }
                        if (var625 == 5215) {
                            var2 -= 2;
                            int var440 = field6453[var2];
                            int var441 = field6453[var2 + 1];
                            class304 var442 = class330.method2068(var440 >> 14 & 0x3FFF, var440 & 0x3FFF);
                            boolean var443 = false;
                            for (class67 var444 = (class67) var442.method1955(0); var444 != null; var444 = (class67) var442.method1954(false)) {
                                if (var444.field968 == var441) {
                                    var443 = true;
                                    break;
                                }
                            }
                            if (var443) {
                                field6453[var2++] = 1;
                            } else {
                                field6453[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 5218) {
                            var2--;
                            int var445 = field6453[var2];
                            class67 var446 = class330.method2073(var445);
                            if (var446 == null) {
                                field6453[var2++] = -1;
                            } else {
                                field6453[var2++] = var446.field969;
                            }
                            continue;
                        }
                        if (var625 == 5220) {
                            field6453[var2++] = class4.field33 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5221) {
                            var2--;
                            int var447 = field6453[var2];
                            class473.method2803(var447 & 0x3FFF, var447 >> 14 & 0x3FFF, 120);
                            continue;
                        }
                        if (var625 == 5222) {
                            class67 var448 = class218.method1500(-28935);
                            if (var448 == null) {
                                field6453[var2++] = -1;
                                field6453[var2++] = -1;
                            } else {
                                boolean var449 = var448.method626(-120, field6466, class330.field4602 + class25.field267, class330.field4596 + class309.field4388);
                                if (var449) {
                                    field6453[var2++] = field6466[1];
                                    field6453[var2++] = field6466[2];
                                } else {
                                    field6453[var2++] = -1;
                                    field6453[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var625 == 5223) {
                            var2 -= 2;
                            int var450 = field6453[var2];
                            int var451 = field6453[var2 + 1];
                            class434.method2623(var451 >> 14 & 0x3FFF, var450, (byte) -126, false, var451 & 0x3FFF);
                            continue;
                        }
                        if (var625 == 5224) {
                            var2--;
                            int var452 = field6453[var2];
                            class67 var453 = class218.method1500(-28935);
                            if (var453 == null) {
                                field6453[var2++] = -1;
                                field6453[var2++] = -1;
                            } else {
                                boolean var454 = var453.method628(-19313, var452 & 0x3FFF, var452 >> 28 & 0x3, var452 >> 14 & 0x3FFF, field6466);
                                if (var454) {
                                    field6453[var2++] = field6466[1];
                                    field6453[var2++] = field6466[2];
                                } else {
                                    field6453[var2++] = -1;
                                    field6453[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var625 == 5225) {
                            var2--;
                            int var455 = field6453[var2];
                            class67 var456 = class218.method1500(-28935);
                            if (var456 == null) {
                                field6453[var2++] = -1;
                                field6453[var2++] = -1;
                            } else {
                                boolean var457 = var456.method626(-125, field6466, var455 & 0x3FFF, var455 >> 14 & 0x3FFF);
                                if (var457) {
                                    field6453[var2++] = field6466[1];
                                    field6453[var2++] = field6466[2];
                                } else {
                                    field6453[var2++] = -1;
                                    field6453[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var625 == 5226) {
                            var2--;
                            class268.method1815(true, field6453[var2]);
                            continue;
                        }
                        if (var625 == 5227) {
                            var2 -= 2;
                            int var458 = field6453[var2];
                            int var459 = field6453[var2 + 1];
                            class434.method2623(var459 >> 14 & 0x3FFF, var458, (byte) -126, true, var459 & 0x3FFF);
                            continue;
                        }
                        if (var625 == 5228) {
                            var2--;
                            class312.field4419 = field6453[var2] == 1;
                            continue;
                        }
                        if (var625 == 5229) {
                            field6453[var2++] = class312.field4419 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5230) {
                            var2--;
                            int var460 = field6453[var2];
                            class201.method1399(76, var460);
                            continue;
                        }
                        if (var625 == 5231) {
                            var2 -= 2;
                            int var461 = field6453[var2];
                            boolean var462 = field6453[var2 + 1] == 1;
                            if (class267.field3838 == null) {
                                continue;
                            }
                            class449 var463 = class267.field3838.method1104(-126, (long) var461);
                            if (var463 != null && !var462) {
                                var463.method2714(-118);
                                continue;
                            }
                            if (var463 == null && var462) {
                                class449 var464 = new class449();
                                class267.field3838.method1100(var464, 16, (long) var461);
                            }
                            continue;
                        }
                        if (var625 == 5232) {
                            var2--;
                            int var465 = field6453[var2];
                            if (class267.field3838 == null) {
                                field6453[var2++] = 0;
                            } else {
                                class449 var466 = class267.field3838.method1104(-125, (long) var465);
                                field6453[var2++] = var466 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var625 == 5233) {
                            var2 -= 2;
                            int var467 = field6453[var2];
                            boolean var468 = field6453[var2 + 1] == 1;
                            if (class442.field6276 == null) {
                                continue;
                            }
                            class449 var469 = class442.field6276.method1104(-126, (long) var467);
                            if (var469 != null && !var468) {
                                var469.method2714(89);
                                continue;
                            }
                            if (var469 == null && var468) {
                                class449 var470 = new class449();
                                class442.field6276.method1100(var470, -128, (long) var467);
                            }
                            continue;
                        }
                        if (var625 == 5234) {
                            var2--;
                            int var471 = field6453[var2];
                            if (class442.field6276 == null) {
                                field6453[var2++] = 0;
                            } else {
                                class449 var472 = class442.field6276.method1104(-128, (long) var471);
                                field6453[var2++] = var472 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var625 == 5235) {
                            field6453[var2++] = class330.field4570 == null ? -1 : class330.field4570.field968;
                            continue;
                        }
                    } else if (var625 < 5400) {
                        if (var625 == 5300) {
                            var2 -= 2;
                            int var473 = field6453[var2];
                            int var474 = field6453[var2 + 1];
                            class241.method1677(3, var473, var474, false, true);
                            field6453[var2++] = class273.field3967 == null ? 0 : 1;
                            continue;
                        }
                        if (var625 == 5301) {
                            if (class273.field3967 != null) {
                                class241.method1677(class223.field3222, -1, -1, false, true);
                            }
                            continue;
                        }
                        if (var625 == 5302) {
                            class473[] var475 = class107.method853(-1829);
                            field6453[var2++] = var475.length;
                            continue;
                        }
                        if (var625 == 5303) {
                            var2--;
                            int var476 = field6453[var2];
                            class473[] var477 = class107.method853(-1829);
                            field6453[var2++] = var477[var476].field6661;
                            field6453[var2++] = var477[var476].field6656;
                            continue;
                        }
                        if (var625 == 5305) {
                            int var478 = class185.field2787;
                            int var479 = class30.field312;
                            int var480 = -1;
                            class473[] var481 = class107.method853(-1829);
                            for (int var482 = 0; var482 < var481.length; var482++) {
                                class473 var483 = var481[var482];
                                if (var483.field6661 == var478 && var483.field6656 == var479) {
                                    var480 = var482;
                                    break;
                                }
                            }
                            field6453[var2++] = var480;
                            continue;
                        }
                        if (var625 == 5306) {
                            field6453[var2++] = class448.method2708(0);
                            continue;
                        }
                        if (var625 == 5307) {
                            var2--;
                            int var484 = field6453[var2];
                            if (var484 >= 1 && var484 <= 2) {
                                class241.method1677(var484, -1, -1, false, true);
                            }
                            continue;
                        }
                        if (var625 == 5308) {
                            field6453[var2++] = class223.field3222;
                            continue;
                        }
                        if (var625 == 5309) {
                            var2--;
                            int var485 = field6453[var2];
                            if (var485 >= 1 && var485 <= 2) {
                                class223.field3222 = var485;
                                class77.method681(class436.field6206, (byte) 51);
                            }
                            continue;
                        }
                    } else if (var625 < 5500) {
                        if (var625 == 5400) {
                            var3 -= 2;
                            String var486 = field6452[var3];
                            String var487 = field6452[var3 + 1];
                            var2--;
                            int var488 = field6453[var2];
                            field6459++;
                            class336.method2111(class468.field6590, 103);
                            class311.field4403.method1180((byte) -110, class345.method2147(var486, (byte) 110) + class345.method2147(var487, (byte) 110) + 1);
                            class311.field4403.method1184((byte) 82, var486);
                            class311.field4403.method1184((byte) -103, var487);
                            class311.field4403.method1180((byte) -110, var488);
                            continue;
                        }
                        if (var625 == 5401) {
                            var2 -= 2;
                            class395.field5446[field6453[var2]] = (short) class24.method172(17414, field6453[var2 + 1]);
                            class373.field5128.method1657(-91);
                            class373.field5128.method1656((byte) -112);
                            class363.field5001.method2001(32760);
                            class125.method947(-70);
                            continue;
                        }
                        if (var625 == 5405) {
                            var2 -= 2;
                            int var489 = field6453[var2];
                            int var490 = field6453[var2 + 1];
                            if (var489 >= 0 && var489 < 2) {
                                class468.field6597[var489] = new int[var490 << 1][4];
                            }
                            continue;
                        }
                        if (var625 == 5406) {
                            var2 -= 7;
                            int var491 = field6453[var2];
                            int var492 = field6453[var2 + 1] << 1;
                            int var493 = field6453[var2 + 2];
                            int var494 = field6453[var2 + 3];
                            int var495 = field6453[var2 + 4];
                            int var496 = field6453[var2 + 5];
                            int var497 = field6453[var2 + 6];
                            if (var491 >= 0 && var491 < 2 && class468.field6597[var491] != null && var492 >= 0 && var492 < class468.field6597[var491].length) {
                                class468.field6597[var491][var492] = new int[] { (var493 >> 14 & 0x3FFF) * 128, var494, (var493 & 0x3FFF) * 128, var497 };
                                class468.field6597[var491][var492 + 1] = new int[] { (var495 >> 14 & 0x3FFF) * 128, var496, (var495 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var625 == 5407) {
                            var2--;
                            int var498 = class468.field6597[field6453[var2]].length >> 1;
                            field6453[var2++] = var498;
                            continue;
                        }
                        if (var625 == 5411) {
                            if (class273.field3967 != null) {
                                class241.method1677(class223.field3222, -1, -1, false, true);
                            }
                            if (class467.field6587 == null) {
                                String var499 = class219.field3175 == null ? class472.method2798(46) : class219.field3175;
                                class430.method2567(false, class377.field5192 == 1, false, var499, class436.field6206);
                            } else {
                                class367.method2244(4);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var625 == 5419) {
                            String var500 = "";
                            if (class444.field6339 != null) {
                                if (class444.field6339.field3984 == null) {
                                    var500 = class367.method2245(class444.field6339.field3982, 255);
                                } else {
                                    var500 = (String) class444.field6339.field3984;
                                }
                            }
                            field6452[var3++] = var500;
                            continue;
                        }
                        if (var625 == 5420) {
                            field6453[var2++] = class65.field961 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5421) {
                            if (class273.field3967 != null) {
                                class241.method1677(class223.field3222, -1, -1, false, true);
                            }
                            var3--;
                            String var501 = field6452[var3];
                            var2--;
                            boolean var502 = field6453[var2] == 1;
                            String var503 = class472.method2798(100) + var501;
                            class430.method2567(false, class377.field5192 == 1, var502, var503, class436.field6206);
                            continue;
                        }
                        if (var625 == 5422) {
                            var3 -= 2;
                            String var504 = field6452[var3];
                            String var505 = field6452[var3 + 1];
                            var2--;
                            int var506 = field6453[var2];
                            if (var504.length() > 0) {
                                if (class450.field6410 == null) {
                                    class450.field6410 = new String[class91.field1282[class35.field378.field4016]];
                                }
                                class450.field6410[var506] = var504;
                            }
                            if (var505.length() > 0) {
                                if (class411.field5630 == null) {
                                    class411.field5630 = new String[class91.field1282[class35.field378.field4016]];
                                }
                                class411.field5630[var506] = var505;
                            }
                            continue;
                        }
                        if (var625 == 5423) {
                            var3--;
                            System.out.println(field6452[var3]);
                            continue;
                        }
                        if (var625 == 5424) {
                            var2 -= 11;
                            class313.field4427 = field6453[var2];
                            class412.field5635 = field6453[var2 + 1];
                            class279.field4011 = field6453[var2 + 2];
                            class227.field3280 = field6453[var2 + 3];
                            class169.field2454 = field6453[var2 + 4];
                            class394.field5442 = field6453[var2 + 5];
                            class414.field5683 = field6453[var2 + 6];
                            class194.field2879 = field6453[var2 + 7];
                            class343.field4742 = field6453[var2 + 8];
                            class122.field1665 = field6453[var2 + 9];
                            class427.field5955 = field6453[var2 + 10];
                            class454.field6440.method2627((byte) 122, class169.field2454);
                            class454.field6440.method2627((byte) 46, class394.field5442);
                            class454.field6440.method2627((byte) 77, class414.field5683);
                            class454.field6440.method2627((byte) 118, class194.field2879);
                            class454.field6440.method2627((byte) 96, class343.field4742);
                            class76.field1131 = null;
                            class402.field5519 = null;
                            client.field875 = null;
                            class382.field5243 = null;
                            class372.field5119 = null;
                            class243.field3529 = null;
                            class325.field4525 = null;
                            class55.field814 = null;
                            class128.field1746 = true;
                            continue;
                        }
                        if (var625 == 5425) {
                            class241.method1674(-22);
                            class128.field1746 = false;
                            continue;
                        }
                        if (var625 == 5426) {
                            var2 -= 2;
                            class193.field2875 = field6453[var2];
                            class161.field2332 = field6453[var2 + 1];
                            continue;
                        }
                        if (var625 == 5427) {
                            var2 -= 2;
                            class476.field6747 = field6453[var2 + 1];
                            continue;
                        }
                        if (var625 == 5428) {
                            var2 -= 2;
                            int var507 = field6453[var2];
                            int var508 = field6453[var2 + 1];
                            field6453[var2++] = class7.method43(16174, var508, var507) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5429) {
                            var3--;
                            class353.method2176(false, -78, field6452[var3]);
                            continue;
                        }
                    } else if (var625 < 5600) {
                        if (var625 == 5500) {
                            var2 -= 4;
                            int var509 = field6453[var2];
                            int var510 = field6453[var2 + 1];
                            int var511 = field6453[var2 + 2];
                            int var512 = field6453[var2 + 3];
                            class94.method789((var509 >> 14 & 0x3FFF) - class279.field4012, (var509 & 0x3FFF) - class189.field2810, 1184, var510, var512, false, var511);
                            continue;
                        }
                        if (var625 == 5501) {
                            var2 -= 4;
                            int var513 = field6453[var2];
                            int var514 = field6453[var2 + 1];
                            int var515 = field6453[var2 + 2];
                            int var516 = field6453[var2 + 3];
                            class145.method1038(var514, true, (var513 >> 14 & 0x3FFF) - class279.field4012, (var513 & 0x3FFF) - class189.field2810, var516, var515);
                            continue;
                        }
                        if (var625 == 5502) {
                            var2 -= 6;
                            int var517 = field6453[var2];
                            if (var517 >= 2) {
                                throw new RuntimeException();
                            }
                            class111.field1569 = var517;
                            int var518 = field6453[var2 + 1];
                            if (var518 + 1 >= class468.field6597[class111.field1569].length >> 1) {
                                throw new RuntimeException();
                            }
                            class354.field4865 = var518;
                            class88.field1245 = 0;
                            class313.field4428 = field6453[var2 + 2];
                            class135.field1883 = field6453[var2 + 3];
                            int var519 = field6453[var2 + 4];
                            if (var519 >= 2) {
                                throw new RuntimeException();
                            }
                            class15.field149 = var519;
                            int var520 = field6453[var2 + 5];
                            if (var520 + 1 >= class468.field6597[class15.field149].length >> 1) {
                                throw new RuntimeException();
                            }
                            class313.field4425 = var520;
                            class390.field5393 = 3;
                            continue;
                        }
                        if (var625 == 5503) {
                            class103.method831(125);
                            continue;
                        }
                        if (var625 == 5504) {
                            var2 -= 2;
                            class6.method32(0, (byte) -62, field6453[var2], field6453[var2 + 1]);
                            continue;
                        }
                        if (var625 == 5505) {
                            field6453[var2++] = (int) class421.field5826 >> 3;
                            continue;
                        }
                        if (var625 == 5506) {
                            field6453[var2++] = (int) class91.field1281 >> 3;
                            continue;
                        }
                        if (var625 == 5507) {
                            class79.method688(-62);
                            continue;
                        }
                        if (var625 == 5508) {
                            class161.method1153(-1);
                            continue;
                        }
                        if (var625 == 5509) {
                            class307.method1967(-18182);
                            continue;
                        }
                        if (var625 == 5510) {
                            class433.method2621(-128);
                            continue;
                        }
                        if (var625 == 5511) {
                            var2--;
                            int var521 = field6453[var2];
                            int var522 = var521 >> 14 & 0x3FFF;
                            int var523 = var521 & 0x3FFF;
                            int var524 = var522 - class279.field4012;
                            if (var524 < 0) {
                                var524 = 0;
                            } else if (var524 >= class36.field388) {
                                var524 = class36.field388;
                            }
                            int var525 = var523 - class189.field2810;
                            if (var525 < 0) {
                                var525 = 0;
                            } else if (var525 >= class68.field998) {
                                var525 = class68.field998;
                            }
                            class318.field4496 = var524 * 128 + 64;
                            class285.field4075 = var525 * 128 + 64;
                            class390.field5393 = 4;
                            continue;
                        }
                        if (var625 == 5512) {
                            class482.method2839(125);
                            continue;
                        }
                    } else if (var625 < 5700) {
                        if (var625 == 5600) {
                            var3 -= 2;
                            String var526 = field6452[var3];
                            String var527 = field6452[var3 + 1];
                            var2--;
                            int var528 = field6453[var2];
                            if (class347.field4787 == 10 && class329.field4561 == 0 && class336.field4667 == 0 && class181.field2729 == 0 && class303.field4305 == 0) {
                                class20.method143(var527, var528, var526, (byte) -106);
                            }
                            continue;
                        }
                        if (var625 == 5601) {
                            class329.method2060(0);
                            continue;
                        }
                        if (var625 == 5602) {
                            if (class336.field4667 == 0) {
                                class27.field280 = -2;
                            }
                            continue;
                        }
                        if (var625 == 5603) {
                            var2 -= 4;
                            if (class347.field4787 == 10 && class329.field4561 == 0 && class336.field4667 == 0 && class181.field2729 == 0 && class303.field4305 == 0) {
                                class382.method2326(field6453[var2 + 2], 0, field6453[var2 + 3], field6453[var2], field6453[var2 + 1]);
                            }
                            continue;
                        }
                        if (var625 == 5604) {
                            var3--;
                            if (class347.field4787 == 10 && class329.field4561 == 0 && class336.field4667 == 0 && class181.field2729 == 0 && class303.field4305 == 0) {
                                class94.method787(class84.method719(37, field6452[var3]), 1);
                            }
                            continue;
                        }
                        if (var625 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class347.field4787 == 10 && class329.field4561 == 0 && class336.field4667 == 0 && class181.field2729 == 0 && class303.field4305 == 0) {
                                class199.method1384(field6453[var2 + 4] == 1, field6453[var2 + 2], field6453[var2 + 6] == 1, field6453[var2], field6453[var2 + 5] == 1, (byte) -110, field6452[var3 + 1], class84.method719(37, field6452[var3]), field6452[var3 + 2], field6453[var2 + 1], field6453[var2 + 3]);
                            }
                            continue;
                        }
                        if (var625 == 5606) {
                            if (class181.field2729 == 0) {
                                class39.field530 = -2;
                            }
                            continue;
                        }
                        if (var625 == 5607) {
                            field6453[var2++] = class27.field280;
                            continue;
                        }
                        if (var625 == 5608) {
                            field6453[var2++] = class271.field3944;
                            continue;
                        }
                        if (var625 == 5609) {
                            field6453[var2++] = class39.field530;
                            continue;
                        }
                        if (var625 == 5610) {
                            for (int var529 = 0; var529 < 5; var529++) {
                                field6452[var3++] = class75.field1080.length > var529 ? class372.method2274((byte) -86, class75.field1080[var529]) : "";
                            }
                            class75.field1080 = null;
                            continue;
                        }
                        if (var625 == 5611) {
                            field6453[var2++] = class419.field5817;
                            continue;
                        }
                    } else if (var625 < 6100) {
                        if (var625 == 6001) {
                            var2--;
                            int var530 = field6453[var2];
                            if (var530 < 1) {
                                var530 = 1;
                            }
                            if (var530 > 4) {
                                var530 = 4;
                            }
                            class172.field2621 = var530;
                            class150.method1076(116);
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6002) {
                            var2--;
                            class91.method760(field6453[var2] == 1, -127);
                            class150.method1076(126);
                            class325.method2051(112);
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6003) {
                            var2--;
                            class362.field4981 = field6453[var2] == 1;
                            class325.method2051(-39);
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6005) {
                            var2--;
                            class181.field2743 = field6453[var2] == 1;
                            class150.method1076(124);
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6006) {
                            var2--;
                            class169.field2453 = field6453[var2] == 1;
                            class374.field5152.method292(!class169.field2453);
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6007) {
                            var2--;
                            class491.field6931 = field6453[var2];
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6008) {
                            var2--;
                            class199.field2951 = field6453[var2] == 1;
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6009) {
                            var2--;
                            class130.field1777 = field6453[var2] == 1;
                            class150.method1076(122);
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6010) {
                            var2--;
                            class228.field3281 = field6453[var2] == 1;
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6011) {
                            var2--;
                            int var531 = field6453[var2];
                            if (var531 < 0 || var531 > 2) {
                                var531 = 0;
                            }
                            class99.field1396 = var531;
                            class150.method1076(123);
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6012) {
                            var2--;
                            class62.field913 = field6453[var2] == 1;
                            class399.method2401(-4518);
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6014) {
                            var2--;
                            class273.field3964 = field6453[var2] == 1;
                            class150.method1076(119);
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6015) {
                            var2--;
                            class300.field4246 = field6453[var2] == 1;
                            class150.method1076(117);
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6016) {
                            var2--;
                            int var532 = field6453[var2];
                            if (var532 < 0 || var532 > 2) {
                                var532 = 0;
                            }
                            class227.field3260 = var532;
                            class94.method785((byte) -5);
                            class77.method681(class436.field6206, (byte) 51);
                            continue;
                        }
                        if (var625 == 6017) {
                            var2--;
                            class55.field817 = field6453[var2] == 1;
                            class352.method2173(2);
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6018) {
                            var2--;
                            int var533 = field6453[var2];
                            if (var533 < 0) {
                                var533 = 0;
                            }
                            if (var533 > 127) {
                                var533 = 127;
                            }
                            class193.field2870 = var533;
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6019) {
                            var2--;
                            int var534 = field6453[var2];
                            if (var534 < 0) {
                                var534 = 0;
                            }
                            if (var534 > 255) {
                                var534 = 255;
                            }
                            if (class409.field5605 != var534) {
                                if (class409.field5605 == 0 && class290.field4117 != -1) {
                                    class329.method2057(false, class290.field4117, -79, var534, 0, class38.field473);
                                    class468.field6598 = false;
                                } else if (var534 == 0) {
                                    class365.method2242(0);
                                    class468.field6598 = false;
                                } else {
                                    class150.method1074(var534, -110);
                                }
                                class409.field5605 = var534;
                            }
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6020) {
                            var2--;
                            int var535 = field6453[var2];
                            if (var535 < 0) {
                                var535 = 0;
                            }
                            if (var535 > 127) {
                                var535 = 127;
                            }
                            class339.field4687 = var535;
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6021) {
                            var2--;
                            class342.field4718 = field6453[var2] == 1;
                            class325.method2051(116);
                            continue;
                        }
                        if (var625 == 6023) {
                            var2--;
                            int var536 = field6453[var2];
                            boolean var537 = false;
                            if (var536 < 0) {
                                var536 = 0;
                            }
                            if (var536 > 2) {
                                var536 = 2;
                            }
                            if (class364.field5008 < 96) {
                                var536 = 0;
                                var537 = true;
                            }
                            class150.method1073(var536, (byte) 16);
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            field6453[var2++] = var537 ? 0 : 1;
                            continue;
                        }
                        if (var625 == 6024) {
                            var2--;
                            int var538 = field6453[var2];
                            if (var538 < 0 || var538 > 2) {
                                var538 = 0;
                            }
                            class30.field309 = var538;
                            class77.method681(class436.field6206, (byte) 51);
                            continue;
                        }
                        if (var625 == 6025) {
                            var2--;
                            int var539 = field6453[var2];
                            if (var539 < 0 || var539 > class169.method1232(class364.field5008, -4203)) {
                                var539 = 0;
                            }
                            class443.field6300 = var539;
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6027) {
                            var2--;
                            int var540 = field6453[var2];
                            if (var540 < 0 || var540 > 1) {
                                var540 = 0;
                            }
                            class172.method1248(var540 == 1, (byte) -114);
                            continue;
                        }
                        if (var625 == 6028) {
                            var2--;
                            class51.field743 = field6453[var2] != 0;
                            class77.method681(class436.field6206, (byte) 51);
                            continue;
                        }
                        if (var625 == 6029) {
                            var2--;
                            class491.field6931 = field6453[var2];
                            class77.method681(class436.field6206, (byte) 51);
                            continue;
                        }
                        if (var625 == 6030) {
                            var2--;
                            class89.field1269 = field6453[var2] != 0;
                            class77.method681(class436.field6206, (byte) 51);
                            class150.method1076(118);
                            continue;
                        }
                        if (var625 == 6031) {
                            var2--;
                            int var541 = field6453[var2];
                            if (var541 < 0 || var541 > 3) {
                                var541 = 2;
                            }
                            class136.method1006(var541, -70);
                            continue;
                        }
                        if (var625 == 6032) {
                            var2--;
                            int var542 = field6453[var2];
                            if (var542 < 0 || var542 > 3) {
                                var542 = 2;
                            }
                            class211.field3082 = var542;
                            class77.method681(class436.field6206, (byte) 51);
                            class385.field5284 = false;
                            continue;
                        }
                        if (var625 == 6033) {
                            var2--;
                            int var543 = field6453[var2];
                            if (var543 < 0 || var543 > 4) {
                                var543 = 2;
                            }
                            class69.field1010 = var543;
                            class77.method681(class436.field6206, (byte) 51);
                            continue;
                        }
                    } else if (var625 < 6200) {
                        if (var625 == 6101) {
                            field6453[var2++] = class172.field2621;
                            continue;
                        }
                        if (var625 == 6102) {
                            field6453[var2++] = class435.method2628(2) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6103) {
                            field6453[var2++] = class362.field4981 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6105) {
                            field6453[var2++] = class181.field2743 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6106) {
                            field6453[var2++] = class169.field2453 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6107) {
                            field6453[var2++] = class491.field6931;
                            continue;
                        }
                        if (var625 == 6108) {
                            field6453[var2++] = class199.field2951 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6109) {
                            field6453[var2++] = class130.field1777 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6110) {
                            field6453[var2++] = class228.field3281 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6111) {
                            field6453[var2++] = class99.field1396;
                            continue;
                        }
                        if (var625 == 6112) {
                            field6453[var2++] = class62.field913 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6114) {
                            field6453[var2++] = class273.field3964 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6115) {
                            field6453[var2++] = class300.field4246 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6116) {
                            field6453[var2++] = class227.field3260;
                            continue;
                        }
                        if (var625 == 6117) {
                            field6453[var2++] = class55.field817 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6118) {
                            field6453[var2++] = class193.field2870;
                            continue;
                        }
                        if (var625 == 6119) {
                            field6453[var2++] = class409.field5605;
                            continue;
                        }
                        if (var625 == 6120) {
                            field6453[var2++] = class339.field4687;
                            continue;
                        }
                        if (var625 == 6121) {
                            field6453[var2++] = class374.field5152.method431() ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6123) {
                            field6453[var2++] = class267.method1803(-89);
                            continue;
                        }
                        if (var625 == 6124) {
                            field6453[var2++] = class30.field309;
                            continue;
                        }
                        if (var625 == 6125) {
                            field6453[var2++] = class443.field6300;
                            continue;
                        }
                        if (var625 == 6126) {
                            field6453[var2++] = class374.field5152.method377() ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6127) {
                            field6453[var2++] = class18.field193 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6128) {
                            field6453[var2++] = class51.field743 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6129) {
                            field6453[var2++] = class491.field6931;
                            continue;
                        }
                        if (var625 == 6130) {
                            field6453[var2++] = class89.field1269 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6131) {
                            field6453[var2++] = class377.field5192;
                            continue;
                        }
                        if (var625 == 6132) {
                            field6453[var2++] = class211.field3082;
                            continue;
                        }
                        if (var625 == 6133) {
                            field6453[var2++] = class65.field961 == 1 || class65.field961 == 4 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6134) {
                            field6453[var2++] = class169.method1232(class364.field5008, -4203);
                            continue;
                        }
                        if (var625 == 6135) {
                            field6453[var2++] = class69.field1010;
                            continue;
                        }
                    } else if (var625 < 6300) {
                        if (var625 == 6200) {
                            var2 -= 2;
                            class430.field6033 = (short) field6453[var2];
                            if (class430.field6033 <= 0) {
                                class430.field6033 = 256;
                            }
                            class357.field4934 = (short) field6453[var2 + 1];
                            if (class357.field4934 <= 0) {
                                class357.field4934 = 205;
                            }
                            continue;
                        }
                        if (var625 == 6201) {
                            var2 -= 2;
                            class443.field6299 = (short) field6453[var2];
                            if (class443.field6299 <= 0) {
                                class443.field6299 = 256;
                            }
                            class13.field102 = (short) field6453[var2 + 1];
                            if (class13.field102 <= 0) {
                                class13.field102 = 320;
                            }
                            continue;
                        }
                        if (var625 == 6202) {
                            var2 -= 4;
                            class421.field5825 = (short) field6453[var2];
                            if (class421.field5825 <= 0) {
                                class421.field5825 = 1;
                            }
                            class366.field5025 = (short) field6453[var2 + 1];
                            if (class366.field5025 <= 0) {
                                class366.field5025 = 32767;
                            } else if (class366.field5025 < class421.field5825) {
                                class366.field5025 = class421.field5825;
                            }
                            class122.field1671 = (short) field6453[var2 + 2];
                            if (class122.field1671 <= 0) {
                                class122.field1671 = 1;
                            }
                            class368.field5074 = (short) field6453[var2 + 3];
                            if (class368.field5074 <= 0) {
                                class368.field5074 = 32767;
                            } else if (class368.field5074 < class122.field1671) {
                                class368.field5074 = class122.field1671;
                            }
                            continue;
                        }
                        if (var625 == 6203) {
                            class380.method2319(0, -2, class486.field6890.field2579, 0, class486.field6890.field2554, false);
                            field6453[var2++] = class295.field4160;
                            field6453[var2++] = class262.field3776;
                            continue;
                        }
                        if (var625 == 6204) {
                            field6453[var2++] = class443.field6299;
                            field6453[var2++] = class13.field102;
                            continue;
                        }
                        if (var625 == 6205) {
                            field6453[var2++] = class430.field6033;
                            field6453[var2++] = class357.field4934;
                            continue;
                        }
                    } else if (var625 < 6400) {
                        if (var625 == 6300) {
                            field6453[var2++] = (int) (class10.method51(-3183) / 60000L);
                            continue;
                        }
                        if (var625 == 6301) {
                            field6453[var2++] = (int) (class10.method51(-3183) / 86400000L) - 11745;
                            continue;
                        }
                        if (var625 == 6302) {
                            var2 -= 3;
                            int var544 = field6453[var2];
                            int var545 = field6453[var2 + 1];
                            int var546 = field6453[var2 + 2];
                            field6446.clear();
                            field6446.set(11, 12);
                            field6446.set(var546, var545, var544);
                            field6453[var2++] = (int) (field6446.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var625 == 6303) {
                            field6446.clear();
                            field6446.setTime(new Date(class10.method51(-3183)));
                            field6453[var2++] = field6446.get(1);
                            continue;
                        }
                        if (var625 == 6304) {
                            var2--;
                            int var547 = field6453[var2];
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
                            field6453[var2++] = var548 ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 6500) {
                        if (var625 == 6405) {
                            field6453[var2++] = class282.method1878((byte) -99) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6406) {
                            field6453[var2++] = class99.method815((byte) -86) ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 6600) {
                        if (var625 == 6500) {
                            if (class347.field4787 == 10 && class329.field4561 == 0 && class336.field4667 == 0 && class181.field2729 == 0) {
                                field6453[var2++] = class332.method2093((byte) -68) == -1 ? 0 : 1;
                                continue;
                            }
                            field6453[var2++] = 1;
                            continue;
                        }
                        if (var625 == 6501) {
                            class21 var549 = class464.method2772(12842);
                            if (var549 == null) {
                                field6453[var2++] = -1;
                                field6453[var2++] = 0;
                                field6452[var3++] = "";
                                field6453[var2++] = 0;
                                field6452[var3++] = "";
                                field6453[var2++] = 0;
                                field6453[var2++] = 0;
                            } else {
                                field6453[var2++] = var549.field228;
                                field6453[var2++] = var549.field3071;
                                field6452[var3++] = var549.field232;
                                class25 var550 = var549.method150(85);
                                field6453[var2++] = var550.field262;
                                field6452[var3++] = var550.field261;
                                field6453[var2++] = var549.field3073;
                                field6453[var2++] = var549.field225;
                            }
                            continue;
                        }
                        if (var625 == 6502) {
                            class21 var551 = class310.method1978(-3);
                            if (var551 == null) {
                                field6453[var2++] = -1;
                                field6453[var2++] = 0;
                                field6452[var3++] = "";
                                field6453[var2++] = 0;
                                field6452[var3++] = "";
                                field6453[var2++] = 0;
                                field6453[var2++] = 0;
                            } else {
                                field6453[var2++] = var551.field228;
                                field6453[var2++] = var551.field3071;
                                field6452[var3++] = var551.field232;
                                class25 var552 = var551.method150(91);
                                field6453[var2++] = var552.field262;
                                field6452[var3++] = var552.field261;
                                field6453[var2++] = var551.field3073;
                                field6453[var2++] = var551.field225;
                            }
                            continue;
                        }
                        if (var625 == 6503) {
                            var2--;
                            int var553 = field6453[var2];
                            if (class347.field4787 == 10 && class329.field4561 == 0 && class336.field4667 == 0 && class181.field2729 == 0) {
                                field6453[var2++] = class97.method801(-4, var553) ? 1 : 0;
                                continue;
                            }
                            field6453[var2++] = 0;
                            continue;
                        }
                        if (var625 == 6504) {
                            var2--;
                            class254.field3646 = field6453[var2];
                            class77.method681(class436.field6206, (byte) 51);
                            continue;
                        }
                        if (var625 == 6505) {
                            field6453[var2++] = class254.field3646;
                            continue;
                        }
                        if (var625 == 6506) {
                            var2--;
                            int var554 = field6453[var2];
                            class21 var555 = class406.method2432(-74, var554);
                            if (var555 == null) {
                                field6453[var2++] = -1;
                                field6452[var3++] = "";
                                field6453[var2++] = 0;
                                field6452[var3++] = "";
                                field6453[var2++] = 0;
                                field6453[var2++] = 0;
                            } else {
                                field6453[var2++] = var555.field3071;
                                field6452[var3++] = var555.field232;
                                class25 var556 = var555.method150(118);
                                field6453[var2++] = var556.field262;
                                field6452[var3++] = var556.field261;
                                field6453[var2++] = var555.field3073;
                                field6453[var2++] = var555.field225;
                            }
                            continue;
                        }
                        if (var625 == 6507) {
                            var2 -= 4;
                            int var557 = field6453[var2];
                            boolean var558 = field6453[var2 + 1] == 1;
                            int var559 = field6453[var2 + 2];
                            boolean var560 = field6453[var2 + 3] == 1;
                            class304.method1956(var558, var557, (byte) -12, var559, var560);
                            continue;
                        }
                        if (var625 == 6508) {
                            class13.method81((byte) 120);
                            continue;
                        }
                        if (var625 == 6509) {
                            if (class347.field4787 == 10) {
                                var2--;
                                class88.field1239 = field6453[var2] == 1;
                            }
                            continue;
                        }
                    } else if (var625 < 6700) {
                        if (var625 == 6600) {
                            var2--;
                            class165.field2399 = field6453[var2] == 1;
                            class77.method681(class436.field6206, (byte) 51);
                            continue;
                        }
                        if (var625 == 6601) {
                            field6453[var2++] = class165.field2399 ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 6800 && class392.field5410 == class175.field2665) {
                        if (var625 == 6700) {
                            int var561 = class310.field4399.method1106(false);
                            if (class238.field3475 != -1) {
                                var561++;
                            }
                            field6453[var2++] = var561;
                            continue;
                        }
                        if (var625 == 6701) {
                            var2--;
                            int var562 = field6453[var2];
                            if (class238.field3475 != -1) {
                                if (var562 == 0) {
                                    field6453[var2++] = class238.field3475;
                                    continue;
                                }
                                var562--;
                            }
                            class249 var563 = (class249) class310.field4399.method1097(64);
                            while (var562-- > 0) {
                                var563 = (class249) class310.field4399.method1105(false);
                            }
                            field6453[var2++] = var563.field3593;
                            continue;
                        }
                        if (var625 == 6702) {
                            var2--;
                            int var564 = field6453[var2];
                            if (class263.field3787[var564] == null) {
                                field6452[var3++] = "";
                            } else {
                                String var565 = class263.field3787[var564][0].field2539;
                                if (var565 == null) {
                                    field6452[var3++] = "";
                                } else {
                                    field6452[var3++] = var565.substring(0, var565.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var625 == 6703) {
                            var2--;
                            int var566 = field6453[var2];
                            if (class263.field3787[var566] == null) {
                                field6453[var2++] = 0;
                            } else {
                                field6453[var2++] = class263.field3787[var566].length;
                            }
                            continue;
                        }
                        if (var625 == 6704) {
                            var2 -= 2;
                            int var567 = field6453[var2];
                            int var568 = field6453[var2 + 1];
                            if (class263.field3787[var567] == null) {
                                field6452[var3++] = "";
                            } else {
                                String var569 = class263.field3787[var567][var568].field2539;
                                if (var569 == null) {
                                    field6452[var3++] = "";
                                } else {
                                    field6452[var3++] = var569;
                                }
                            }
                            continue;
                        }
                        if (var625 == 6705) {
                            var2 -= 2;
                            int var570 = field6453[var2];
                            int var571 = field6453[var2 + 1];
                            if (class263.field3787[var570] == null) {
                                field6453[var2++] = 0;
                            } else {
                                field6453[var2++] = class263.field3787[var570][var571].field2615;
                            }
                            continue;
                        }
                        if (var625 == 6706) {
                            continue;
                        }
                        if (var625 == 6707) {
                            var2 -= 3;
                            int var572 = field6453[var2];
                            int var573 = field6453[var2 + 1];
                            int var574 = field6453[var2 + 2];
                            class198.method1370(var572 << 16 | var573, "", 1, -31859, var574);
                            continue;
                        }
                        if (var625 == 6708) {
                            var2 -= 3;
                            int var575 = field6453[var2];
                            int var576 = field6453[var2 + 1];
                            int var577 = field6453[var2 + 2];
                            class198.method1370(var575 << 16 | var576, "", 2, -31859, var577);
                            continue;
                        }
                        if (var625 == 6709) {
                            var2 -= 3;
                            int var578 = field6453[var2];
                            int var579 = field6453[var2 + 1];
                            int var580 = field6453[var2 + 2];
                            class198.method1370(var578 << 16 | var579, "", 3, -31859, var580);
                            continue;
                        }
                        if (var625 == 6710) {
                            var2 -= 3;
                            int var581 = field6453[var2];
                            int var582 = field6453[var2 + 1];
                            int var583 = field6453[var2 + 2];
                            class198.method1370(var581 << 16 | var582, "", 4, -31859, var583);
                            continue;
                        }
                        if (var625 == 6711) {
                            var2 -= 3;
                            int var584 = field6453[var2];
                            int var585 = field6453[var2 + 1];
                            int var586 = field6453[var2 + 2];
                            class198.method1370(var584 << 16 | var585, "", 5, -31859, var586);
                            continue;
                        }
                        if (var625 == 6712) {
                            var2 -= 3;
                            int var587 = field6453[var2];
                            int var588 = field6453[var2 + 1];
                            int var589 = field6453[var2 + 2];
                            class198.method1370(var587 << 16 | var588, "", 6, -31859, var589);
                            continue;
                        }
                        if (var625 == 6713) {
                            var2 -= 3;
                            int var590 = field6453[var2];
                            int var591 = field6453[var2 + 1];
                            int var592 = field6453[var2 + 2];
                            class198.method1370(var590 << 16 | var591, "", 7, -31859, var592);
                            continue;
                        }
                        if (var625 == 6714) {
                            var2 -= 3;
                            int var593 = field6453[var2];
                            int var594 = field6453[var2 + 1];
                            int var595 = field6453[var2 + 2];
                            class198.method1370(var593 << 16 | var594, "", 8, -31859, var595);
                            continue;
                        }
                        if (var625 == 6715) {
                            var2 -= 3;
                            int var596 = field6453[var2];
                            int var597 = field6453[var2 + 1];
                            int var598 = field6453[var2 + 2];
                            class198.method1370(var596 << 16 | var597, "", 9, -31859, var598);
                            continue;
                        }
                        if (var625 == 6716) {
                            var2 -= 3;
                            int var599 = field6453[var2];
                            int var600 = field6453[var2 + 1];
                            int var601 = field6453[var2 + 2];
                            class198.method1370(var599 << 16 | var600, "", 10, -31859, var601);
                            continue;
                        }
                        if (var625 == 6717) {
                            var2 -= 3;
                            int var602 = field6453[var2];
                            int var603 = field6453[var2 + 1];
                            int var604 = field6453[var2 + 2];
                            class172 var605 = class77.method678(var604, 120, var602 << 16 | var603);
                            class2.method9(149799361);
                            class110 var606 = client.method547(var605);
                            class476.method2815((byte) -98, var604, var606.field1542, var602 << 16 | var603, var605.field2481, var605.field2501, var606.method879(24468));
                            continue;
                        }
                    } else if (var625 < 6900) {
                        if (var625 == 6800) {
                            var2--;
                            int var607 = field6453[var2];
                            class76 var608 = class53.field788.method2321(var607, true);
                            if (var608.field1102 == null) {
                                field6452[var3++] = "";
                            } else {
                                field6452[var3++] = var608.field1102;
                            }
                            continue;
                        }
                        if (var625 == 6801) {
                            var2--;
                            int var609 = field6453[var2];
                            class76 var610 = class53.field788.method2321(var609, true);
                            field6453[var2++] = var610.field1086;
                            continue;
                        }
                        if (var625 == 6802) {
                            var2--;
                            int var611 = field6453[var2];
                            class76 var612 = class53.field788.method2321(var611, true);
                            field6453[var2++] = var612.field1120;
                            continue;
                        }
                        if (var625 == 6803) {
                            var2--;
                            int var613 = field6453[var2];
                            class76 var614 = class53.field788.method2321(var613, true);
                            field6453[var2++] = var614.field1100;
                            continue;
                        }
                        if (var625 == 6804) {
                            var2 -= 2;
                            int var615 = field6453[var2];
                            int var616 = field6453[var2 + 1];
                            class129 var617 = class422.field5847.method1635(var616, false);
                            if (var617.method972(2087)) {
                                field6452[var3++] = class53.field788.method2321(var615, true).method671(var617.field1767, var616, -914);
                            } else {
                                field6453[var2++] = class53.field788.method2321(var615, true).method667(var617.field1765, (byte) 63, var616);
                            }
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var624) {
            if (arg0.field4132 == null) {
                StringBuffer var622 = new StringBuffer(30);
                var622.append("CS2: ").append(arg0.field6382).append(" ");
                for (int var623 = field6451 - 1; var623 >= 0; var623--) {
                    var622.append("v: ").append(field6463[var623].field3641.field6382).append(" ");
                }
                var622.append("op: ").append(var7);
                class83.method704((byte) 114, var624, var622.toString());
            } else {
                class316.method2006(87, "Clientscript error in: " + arg0.field4132);
                StringBuffer var619 = new StringBuffer(30);
                var619.append("Clientscript error in: ").append(arg0.field4132).append("\n");
                for (int var620 = field6451 - 1; var620 >= 0; var620--) {
                    var619.append("via: ").append(field6463[var620].field3641.field4132).append("\n");
                }
                var619.append("Op: ").append(var7).append("\n");
                String var621 = var624.getMessage();
                if (var621 != null && var621.length() > 0) {
                    var619.append("Message: ").append(var621).append("\n");
                }
                class83.method704((byte) 96, var624, var619.toString());
                class94.method790(var619.toString(), -30123);
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Li;I)V", line = 6968)
    private static final void method2742(class472 arg0, int arg1) {
        Object[] var2 = arg0.field6649;
        int var3 = (Integer) var2[0];
        class292 var4 = class409.method2451(97, var3);
        if (var4 == null) {
            return;
        }
        field6465 = new int[var4.field4140];
        int var5 = 0;
        field6458 = new String[var4.field4130];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field6652;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field6650;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field6642 == null ? -1 : arg0.field6642.field2543;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field6640;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field6642 == null ? -1 : arg0.field6642.field2527;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field6639 == null ? -1 : arg0.field6639.field2543;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field6639 == null ? -1 : arg0.field6639.field2527;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field6643;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field6651;
                }
                field6465[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field6644;
                }
                field6458[var6++] = var9;
            }
        }
        method2741(var4, arg1);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "()V", line = 7049)
    public static void method2743() {
        field6465 = null;
        field6458 = null;
        field6447 = null;
        field6457 = null;
        field6453 = null;
        field6452 = null;
        field6463 = null;
        field6450 = null;
        field6460 = null;
        field6448 = null;
        field6446 = null;
        field6468 = null;
        field6466 = null;
        field6467 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lhq;II)V", line = 7067)
    public static final void method2744(class30 arg0, int arg1, int arg2) {
        class292 var3 = class363.method2235(arg2, (byte) -108, arg1, arg0);
        if (var3 == null) {
            return;
        }
        field6465 = new int[var3.field4140];
        field6458 = new String[var3.field4130];
        if (class255.field3669 == var3.field4131 || class373.field5139 == var3.field4131 || class39.field532 == var3.field4131) {
            int var4 = 0;
            int var5 = 0;
            if (class125.field1697 != null) {
                var4 = class125.field1697.field2502;
                var5 = class125.field1697.field2466;
            }
            field6465[0] = class175.field2661.method1625((byte) -128) - var4;
            field6465[1] = class175.field2661.method1617(false) - var5;
        }
        method2741(var3, 200000);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Li;)V", line = 7106)
    public static final void method2745(class472 arg0) {
        method2742(arg0, 200000);
    }
}
